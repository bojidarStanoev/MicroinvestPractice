package b4a.example;


import anywheresoftware.b4a.B4AMenuItem;
import android.app.Activity;
import android.os.Bundle;
import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.B4AActivity;
import anywheresoftware.b4a.ObjectWrapper;
import anywheresoftware.b4a.objects.ActivityWrapper;
import java.lang.reflect.InvocationTargetException;
import anywheresoftware.b4a.B4AUncaughtException;
import anywheresoftware.b4a.debug.*;
import java.lang.ref.WeakReference;

public class main extends Activity implements B4AActivity{
	public static main mostCurrent;
	static boolean afterFirstLayout;
	static boolean isFirst = true;
    private static boolean processGlobalsRun = false;
	BALayout layout;
	public static BA processBA;
	BA activityBA;
    ActivityWrapper _activity;
    java.util.ArrayList<B4AMenuItem> menuItems;
	public static final boolean fullScreen = false;
	public static final boolean includeTitle = true;
    public static WeakReference<Activity> previousOne;

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		if (isFirst) {
			processBA = new anywheresoftware.b4a.ShellBA(this.getApplicationContext(), null, null, "b4a.example", "b4a.example.main");
			processBA.loadHtSubs(this.getClass());
	        float deviceScale = getApplicationContext().getResources().getDisplayMetrics().density;
	        BALayout.setDeviceScale(deviceScale);
            
		}
		else if (previousOne != null) {
			Activity p = previousOne.get();
			if (p != null && p != this) {
                BA.LogInfo("Killing previous instance (main).");
				p.finish();
			}
		}
        processBA.runHook("oncreate", this, null);
		if (!includeTitle) {
        	this.getWindow().requestFeature(android.view.Window.FEATURE_NO_TITLE);
        }
        if (fullScreen) {
        	getWindow().setFlags(android.view.WindowManager.LayoutParams.FLAG_FULLSCREEN,   
        			android.view.WindowManager.LayoutParams.FLAG_FULLSCREEN);
        }
		mostCurrent = this;
        processBA.sharedProcessBA.activityBA = null;
		layout = new BALayout(this);
		setContentView(layout);
		afterFirstLayout = false;
        WaitForLayout wl = new WaitForLayout();
        if (anywheresoftware.b4a.objects.ServiceHelper.StarterHelper.startFromActivity(processBA, wl, false))
		    BA.handler.postDelayed(wl, 5);

	}
	static class WaitForLayout implements Runnable {
		public void run() {
			if (afterFirstLayout)
				return;
			if (mostCurrent == null)
				return;
            
			if (mostCurrent.layout.getWidth() == 0) {
				BA.handler.postDelayed(this, 5);
				return;
			}
			mostCurrent.layout.getLayoutParams().height = mostCurrent.layout.getHeight();
			mostCurrent.layout.getLayoutParams().width = mostCurrent.layout.getWidth();
			afterFirstLayout = true;
			mostCurrent.afterFirstLayout();
		}
	}
	private void afterFirstLayout() {
        if (this != mostCurrent)
			return;
		activityBA = new BA(this, layout, processBA, "b4a.example", "b4a.example.main");
        anywheresoftware.b4a.keywords.Common.ToastMessageShow("This application was developed with B4A trial version and should not be distributed.", true);
        processBA.sharedProcessBA.activityBA = new java.lang.ref.WeakReference<BA>(activityBA);
        anywheresoftware.b4a.objects.ViewWrapper.lastId = 0;
        _activity = new ActivityWrapper(activityBA, "activity");
        anywheresoftware.b4a.Msgbox.isDismissing = false;
        if (BA.isShellModeRuntimeCheck(processBA)) {
			if (isFirst)
				processBA.raiseEvent2(null, true, "SHELL", false);
			processBA.raiseEvent2(null, true, "CREATE", true, "b4a.example.main", processBA, activityBA, _activity, anywheresoftware.b4a.keywords.Common.Density, mostCurrent);
			_activity.reinitializeForShell(activityBA, "activity");
		}
        initializeProcessGlobals();		
        initializeGlobals();
        
        BA.LogInfo("** Activity (main) Create, isFirst = " + isFirst + " **");
        processBA.raiseEvent2(null, true, "activity_create", false, isFirst);
		isFirst = false;
		if (this != mostCurrent)
			return;
        processBA.setActivityPaused(false);
        BA.LogInfo("** Activity (main) Resume **");
        processBA.raiseEvent(null, "activity_resume");
        if (android.os.Build.VERSION.SDK_INT >= 11) {
			try {
				android.app.Activity.class.getMethod("invalidateOptionsMenu").invoke(this,(Object[]) null);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

	}
	public void addMenuItem(B4AMenuItem item) {
		if (menuItems == null)
			menuItems = new java.util.ArrayList<B4AMenuItem>();
		menuItems.add(item);
	}
	@Override
	public boolean onCreateOptionsMenu(android.view.Menu menu) {
		super.onCreateOptionsMenu(menu);
        try {
            if (processBA.subExists("activity_actionbarhomeclick")) {
                Class.forName("android.app.ActionBar").getMethod("setHomeButtonEnabled", boolean.class).invoke(
                    getClass().getMethod("getActionBar").invoke(this), true);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        if (processBA.runHook("oncreateoptionsmenu", this, new Object[] {menu}))
            return true;
		if (menuItems == null)
			return false;
		for (B4AMenuItem bmi : menuItems) {
			android.view.MenuItem mi = menu.add(bmi.title);
			if (bmi.drawable != null)
				mi.setIcon(bmi.drawable);
            if (android.os.Build.VERSION.SDK_INT >= 11) {
				try {
                    if (bmi.addToBar) {
				        android.view.MenuItem.class.getMethod("setShowAsAction", int.class).invoke(mi, 1);
                    }
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
			mi.setOnMenuItemClickListener(new B4AMenuItemsClickListener(bmi.eventName.toLowerCase(BA.cul)));
		}
        
		return true;
	}   
 @Override
 public boolean onOptionsItemSelected(android.view.MenuItem item) {
    if (item.getItemId() == 16908332) {
        processBA.raiseEvent(null, "activity_actionbarhomeclick");
        return true;
    }
    else
        return super.onOptionsItemSelected(item); 
}
@Override
 public boolean onPrepareOptionsMenu(android.view.Menu menu) {
    super.onPrepareOptionsMenu(menu);
    processBA.runHook("onprepareoptionsmenu", this, new Object[] {menu});
    return true;
    
 }
 protected void onStart() {
    super.onStart();
    processBA.runHook("onstart", this, null);
}
 protected void onStop() {
    super.onStop();
    processBA.runHook("onstop", this, null);
}
    public void onWindowFocusChanged(boolean hasFocus) {
       super.onWindowFocusChanged(hasFocus);
       if (processBA.subExists("activity_windowfocuschanged"))
           processBA.raiseEvent2(null, true, "activity_windowfocuschanged", false, hasFocus);
    }
	private class B4AMenuItemsClickListener implements android.view.MenuItem.OnMenuItemClickListener {
		private final String eventName;
		public B4AMenuItemsClickListener(String eventName) {
			this.eventName = eventName;
		}
		public boolean onMenuItemClick(android.view.MenuItem item) {
			processBA.raiseEventFromUI(item.getTitle(), eventName + "_click");
			return true;
		}
	}
    public static Class<?> getObject() {
		return main.class;
	}
    private Boolean onKeySubExist = null;
    private Boolean onKeyUpSubExist = null;
	@Override
	public boolean onKeyDown(int keyCode, android.view.KeyEvent event) {
        if (processBA.runHook("onkeydown", this, new Object[] {keyCode, event}))
            return true;
		if (onKeySubExist == null)
			onKeySubExist = processBA.subExists("activity_keypress");
		if (onKeySubExist) {
			if (keyCode == anywheresoftware.b4a.keywords.constants.KeyCodes.KEYCODE_BACK &&
					android.os.Build.VERSION.SDK_INT >= 18) {
				HandleKeyDelayed hk = new HandleKeyDelayed();
				hk.kc = keyCode;
				BA.handler.post(hk);
				return true;
			}
			else {
				boolean res = new HandleKeyDelayed().runDirectly(keyCode);
				if (res)
					return true;
			}
		}
		return super.onKeyDown(keyCode, event);
	}
	private class HandleKeyDelayed implements Runnable {
		int kc;
		public void run() {
			runDirectly(kc);
		}
		public boolean runDirectly(int keyCode) {
			Boolean res =  (Boolean)processBA.raiseEvent2(_activity, false, "activity_keypress", false, keyCode);
			if (res == null || res == true) {
                return true;
            }
            else if (keyCode == anywheresoftware.b4a.keywords.constants.KeyCodes.KEYCODE_BACK) {
				finish();
				return true;
			}
            return false;
		}
		
	}
    @Override
	public boolean onKeyUp(int keyCode, android.view.KeyEvent event) {
        if (processBA.runHook("onkeyup", this, new Object[] {keyCode, event}))
            return true;
		if (onKeyUpSubExist == null)
			onKeyUpSubExist = processBA.subExists("activity_keyup");
		if (onKeyUpSubExist) {
			Boolean res =  (Boolean)processBA.raiseEvent2(_activity, false, "activity_keyup", false, keyCode);
			if (res == null || res == true)
				return true;
		}
		return super.onKeyUp(keyCode, event);
	}
	@Override
	public void onNewIntent(android.content.Intent intent) {
        super.onNewIntent(intent);
		this.setIntent(intent);
        processBA.runHook("onnewintent", this, new Object[] {intent});
	}
    @Override 
	public void onPause() {
		super.onPause();
        if (_activity == null) //workaround for emulator bug (Issue 2423)
            return;
		anywheresoftware.b4a.Msgbox.dismiss(true);
        BA.LogInfo("** Activity (main) Pause, UserClosed = " + activityBA.activity.isFinishing() + " **");
        processBA.raiseEvent2(_activity, true, "activity_pause", false, activityBA.activity.isFinishing());		
        processBA.setActivityPaused(true);
        mostCurrent = null;
        if (!activityBA.activity.isFinishing())
			previousOne = new WeakReference<Activity>(this);
        anywheresoftware.b4a.Msgbox.isDismissing = false;
        processBA.runHook("onpause", this, null);
	}

	@Override
	public void onDestroy() {
        super.onDestroy();
		previousOne = null;
        processBA.runHook("ondestroy", this, null);
	}
    @Override 
	public void onResume() {
		super.onResume();
        mostCurrent = this;
        anywheresoftware.b4a.Msgbox.isDismissing = false;
        if (activityBA != null) { //will be null during activity create (which waits for AfterLayout).
        	ResumeMessage rm = new ResumeMessage(mostCurrent);
        	BA.handler.post(rm);
        }
        processBA.runHook("onresume", this, null);
	}
    private static class ResumeMessage implements Runnable {
    	private final WeakReference<Activity> activity;
    	public ResumeMessage(Activity activity) {
    		this.activity = new WeakReference<Activity>(activity);
    	}
		public void run() {
			if (mostCurrent == null || mostCurrent != activity.get())
				return;
			processBA.setActivityPaused(false);
            BA.LogInfo("** Activity (main) Resume **");
		    processBA.raiseEvent(mostCurrent._activity, "activity_resume", (Object[])null);
		}
    }
	@Override
	protected void onActivityResult(int requestCode, int resultCode,
	      android.content.Intent data) {
		processBA.onActivityResult(requestCode, resultCode, data);
        processBA.runHook("onactivityresult", this, new Object[] {requestCode, resultCode});
	}
	private static void initializeGlobals() {
		processBA.raiseEvent2(null, true, "globals", false, (Object[])null);
	}
    public void onRequestPermissionsResult(int requestCode,
        String permissions[], int[] grantResults) {
        for (int i = 0;i < permissions.length;i++) {
            Object[] o = new Object[] {permissions[i], grantResults[i] == 0};
            processBA.raiseEventFromDifferentThread(null,null, 0, "activity_permissionresult", true, o);
        }
            
    }



public static void initializeProcessGlobals() {
    
    if (main.processGlobalsRun == false) {
	    main.processGlobalsRun = true;
		try {
		        		
        } catch (Exception e) {
			throw new RuntimeException(e);
		}
    }
}
public static boolean isAnyActivityVisible() {
    boolean vis = false;
vis = vis | (main.mostCurrent != null);
return vis;}

private static BA killProgramHelper(BA ba) {
    if (ba == null)
        return null;
    anywheresoftware.b4a.BA.SharedProcessBA sharedProcessBA = ba.sharedProcessBA;
    if (sharedProcessBA == null || sharedProcessBA.activityBA == null)
        return null;
    return sharedProcessBA.activityBA.get();
}
public static void killProgram() {
     {
            Activity __a = null;
            if (main.previousOne != null) {
				__a = main.previousOne.get();
			}
            else {
                BA ba = killProgramHelper(main.mostCurrent == null ? null : main.mostCurrent.processBA);
                if (ba != null) __a = ba.activity;
            }
            if (__a != null)
				__a.finish();}

BA.applicationContext.stopService(new android.content.Intent(BA.applicationContext, starter.class));
}
public anywheresoftware.b4a.keywords.Common __c = null;
public anywheresoftware.b4a.objects.AutoCompleteEditTextWrapper _cur1 = null;
public anywheresoftware.b4a.objects.AutoCompleteEditTextWrapper _cur2 = null;
public anywheresoftware.b4a.objects.EditTextWrapper _curr_conv_rate = null;
public anywheresoftware.b4a.objects.ButtonWrapper _bu1 = null;
public anywheresoftware.b4a.objects.ButtonWrapper _bu2 = null;
public anywheresoftware.b4a.objects.ButtonWrapper[] _back_but = null;
public anywheresoftware.b4a.objects.LabelWrapper _lb = null;
public anywheresoftware.b4a.objects.EditTextWrapper _ed1 = null;
public anywheresoftware.b4a.objects.EditTextWrapper _ed2 = null;
public anywheresoftware.b4a.objects.collections.List _item_list = null;
public anywheresoftware.b4a.objects.PanelWrapper _p1 = null;
public anywheresoftware.b4a.objects.PanelWrapper _p2 = null;
public anywheresoftware.b4a.objects.PanelWrapper _p3 = null;
public anywheresoftware.b4a.objects.PanelWrapper _p4 = null;
public anywheresoftware.b4a.objects.PanelWrapper _p5 = null;
public anywheresoftware.b4a.objects.PanelWrapper _p6 = null;
public anywheresoftware.b4a.objects.PanelWrapper _p7 = null;
public anywheresoftware.b4a.objects.PanelWrapper _p8 = null;
public anywheresoftware.b4a.objects.ButtonWrapper[] _button = null;
public b4a.example.starter _starter = null;
public static String  _activity_create(boolean _firsttime) throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(mostCurrent.activityBA, "activity_create"))
	return (String) Debug.delegate(mostCurrent.activityBA, "activity_create", new Object[] {_firsttime});
int _i = 0;
int _col = 0;
int _row = 0;
RDebugUtils.currentLine=131072;
 //BA.debugLineNum = 131072;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
RDebugUtils.currentLine=131075;
 //BA.debugLineNum = 131075;BA.debugLine="cur1.Initialize(\"\")";
mostCurrent._cur1.Initialize(processBA,"");
RDebugUtils.currentLine=131076;
 //BA.debugLineNum = 131076;BA.debugLine="cur2.Initialize(\"\")";
mostCurrent._cur2.Initialize(processBA,"");
RDebugUtils.currentLine=131077;
 //BA.debugLineNum = 131077;BA.debugLine="ed1.Initialize(\"\")";
mostCurrent._ed1.Initialize(mostCurrent.activityBA,"");
RDebugUtils.currentLine=131078;
 //BA.debugLineNum = 131078;BA.debugLine="ed2.Initialize(\"\")";
mostCurrent._ed2.Initialize(mostCurrent.activityBA,"");
RDebugUtils.currentLine=131079;
 //BA.debugLineNum = 131079;BA.debugLine="p1.Initialize(\"\")";
mostCurrent._p1.Initialize(mostCurrent.activityBA,"");
RDebugUtils.currentLine=131080;
 //BA.debugLineNum = 131080;BA.debugLine="p2.Initialize(\"\")";
mostCurrent._p2.Initialize(mostCurrent.activityBA,"");
RDebugUtils.currentLine=131081;
 //BA.debugLineNum = 131081;BA.debugLine="p3.Initialize(\"\")";
mostCurrent._p3.Initialize(mostCurrent.activityBA,"");
RDebugUtils.currentLine=131082;
 //BA.debugLineNum = 131082;BA.debugLine="p4.Initialize(\"\")";
mostCurrent._p4.Initialize(mostCurrent.activityBA,"");
RDebugUtils.currentLine=131083;
 //BA.debugLineNum = 131083;BA.debugLine="p5.Initialize(\"\")";
mostCurrent._p5.Initialize(mostCurrent.activityBA,"");
RDebugUtils.currentLine=131084;
 //BA.debugLineNum = 131084;BA.debugLine="p6.Initialize(\"\")";
mostCurrent._p6.Initialize(mostCurrent.activityBA,"");
RDebugUtils.currentLine=131085;
 //BA.debugLineNum = 131085;BA.debugLine="p7.Initialize(\"\")";
mostCurrent._p7.Initialize(mostCurrent.activityBA,"");
RDebugUtils.currentLine=131086;
 //BA.debugLineNum = 131086;BA.debugLine="p8.Initialize(\"\")";
mostCurrent._p8.Initialize(mostCurrent.activityBA,"");
RDebugUtils.currentLine=131087;
 //BA.debugLineNum = 131087;BA.debugLine="Dim i As Int";
_i = 0;
RDebugUtils.currentLine=131089;
 //BA.debugLineNum = 131089;BA.debugLine="curr_conv_rate.Initialize(\"\")";
mostCurrent._curr_conv_rate.Initialize(mostCurrent.activityBA,"");
RDebugUtils.currentLine=131090;
 //BA.debugLineNum = 131090;BA.debugLine="lb.Initialize(\"\")";
mostCurrent._lb.Initialize(mostCurrent.activityBA,"");
RDebugUtils.currentLine=131091;
 //BA.debugLineNum = 131091;BA.debugLine="bu2.Initialize(\"bu2\")";
mostCurrent._bu2.Initialize(mostCurrent.activityBA,"bu2");
RDebugUtils.currentLine=131092;
 //BA.debugLineNum = 131092;BA.debugLine="bu1.Initialize(\"bu1\")";
mostCurrent._bu1.Initialize(mostCurrent.activityBA,"bu1");
RDebugUtils.currentLine=131093;
 //BA.debugLineNum = 131093;BA.debugLine="For i=0 To 6";
{
final int step18 = 1;
final int limit18 = (int) (6);
_i = (int) (0) ;
for (;(step18 > 0 && _i <= limit18) || (step18 < 0 && _i >= limit18) ;_i = ((int)(0 + _i + step18))  ) {
RDebugUtils.currentLine=131094;
 //BA.debugLineNum = 131094;BA.debugLine="back_but(i).Initialize(\"back\")";
mostCurrent._back_but[_i].Initialize(mostCurrent.activityBA,"back");
RDebugUtils.currentLine=131095;
 //BA.debugLineNum = 131095;BA.debugLine="back_but(i).Tag = i + 1";
mostCurrent._back_but[_i].setTag((Object)(_i+1));
RDebugUtils.currentLine=131096;
 //BA.debugLineNum = 131096;BA.debugLine="back_but(i).Text=\"Back\"";
mostCurrent._back_but[_i].setText(BA.ObjectToCharSequence("Back"));
 }
};
RDebugUtils.currentLine=131099;
 //BA.debugLineNum = 131099;BA.debugLine="item_list.Initialize()";
mostCurrent._item_list.Initialize();
RDebugUtils.currentLine=131100;
 //BA.debugLineNum = 131100;BA.debugLine="Activity.AddView(p1, 0, 0, 100%x, 100%y)";
mostCurrent._activity.AddView((android.view.View)(mostCurrent._p1.getObject()),(int) (0),(int) (0),anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (100),mostCurrent.activityBA),anywheresoftware.b4a.keywords.Common.PerYToCurrent((float) (100),mostCurrent.activityBA));
RDebugUtils.currentLine=131101;
 //BA.debugLineNum = 131101;BA.debugLine="Activity.AddView(p2, 0, 0, 100%x, 100%y)";
mostCurrent._activity.AddView((android.view.View)(mostCurrent._p2.getObject()),(int) (0),(int) (0),anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (100),mostCurrent.activityBA),anywheresoftware.b4a.keywords.Common.PerYToCurrent((float) (100),mostCurrent.activityBA));
RDebugUtils.currentLine=131102;
 //BA.debugLineNum = 131102;BA.debugLine="Activity.AddView(p3, 0, 0, 100%x, 100%y)";
mostCurrent._activity.AddView((android.view.View)(mostCurrent._p3.getObject()),(int) (0),(int) (0),anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (100),mostCurrent.activityBA),anywheresoftware.b4a.keywords.Common.PerYToCurrent((float) (100),mostCurrent.activityBA));
RDebugUtils.currentLine=131103;
 //BA.debugLineNum = 131103;BA.debugLine="Activity.AddView(p4, 0, 0, 100%x, 100%y)";
mostCurrent._activity.AddView((android.view.View)(mostCurrent._p4.getObject()),(int) (0),(int) (0),anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (100),mostCurrent.activityBA),anywheresoftware.b4a.keywords.Common.PerYToCurrent((float) (100),mostCurrent.activityBA));
RDebugUtils.currentLine=131104;
 //BA.debugLineNum = 131104;BA.debugLine="Activity.AddView(p5, 0, 0, 100%x, 100%y)";
mostCurrent._activity.AddView((android.view.View)(mostCurrent._p5.getObject()),(int) (0),(int) (0),anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (100),mostCurrent.activityBA),anywheresoftware.b4a.keywords.Common.PerYToCurrent((float) (100),mostCurrent.activityBA));
RDebugUtils.currentLine=131105;
 //BA.debugLineNum = 131105;BA.debugLine="Activity.AddView(p6, 0, 0, 100%x, 100%y)";
mostCurrent._activity.AddView((android.view.View)(mostCurrent._p6.getObject()),(int) (0),(int) (0),anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (100),mostCurrent.activityBA),anywheresoftware.b4a.keywords.Common.PerYToCurrent((float) (100),mostCurrent.activityBA));
RDebugUtils.currentLine=131106;
 //BA.debugLineNum = 131106;BA.debugLine="Activity.AddView(p7, 0, 0, 100%x, 100%y)";
mostCurrent._activity.AddView((android.view.View)(mostCurrent._p7.getObject()),(int) (0),(int) (0),anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (100),mostCurrent.activityBA),anywheresoftware.b4a.keywords.Common.PerYToCurrent((float) (100),mostCurrent.activityBA));
RDebugUtils.currentLine=131107;
 //BA.debugLineNum = 131107;BA.debugLine="Activity.AddView(p8, 0, 0, 100%x, 100%y)";
mostCurrent._activity.AddView((android.view.View)(mostCurrent._p8.getObject()),(int) (0),(int) (0),anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (100),mostCurrent.activityBA),anywheresoftware.b4a.keywords.Common.PerYToCurrent((float) (100),mostCurrent.activityBA));
RDebugUtils.currentLine=131108;
 //BA.debugLineNum = 131108;BA.debugLine="p1.AddView(cur1,200dip,40dip,100dip,40dip)";
mostCurrent._p1.AddView((android.view.View)(mostCurrent._cur1.getObject()),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (200)),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (40)),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (100)),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (40)));
RDebugUtils.currentLine=131109;
 //BA.debugLineNum = 131109;BA.debugLine="p1.AddView(cur2,200dip,100dip,100dip,40dip)";
mostCurrent._p1.AddView((android.view.View)(mostCurrent._cur2.getObject()),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (200)),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (100)),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (100)),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (40)));
RDebugUtils.currentLine=131110;
 //BA.debugLineNum = 131110;BA.debugLine="p1.AddView(ed1,50dip,40dip,100dip,40dip)";
mostCurrent._p1.AddView((android.view.View)(mostCurrent._ed1.getObject()),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (50)),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (40)),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (100)),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (40)));
RDebugUtils.currentLine=131111;
 //BA.debugLineNum = 131111;BA.debugLine="p1.AddView(ed2,50dip,100dip,100dip,40dip)";
mostCurrent._p1.AddView((android.view.View)(mostCurrent._ed2.getObject()),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (50)),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (100)),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (100)),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (40)));
RDebugUtils.currentLine=131112;
 //BA.debugLineNum = 131112;BA.debugLine="p1.AddView(lb,125dip,160dip,100dip,40dip)";
mostCurrent._p1.AddView((android.view.View)(mostCurrent._lb.getObject()),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (125)),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (160)),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (100)),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (40)));
RDebugUtils.currentLine=131113;
 //BA.debugLineNum = 131113;BA.debugLine="p1.AddView(curr_conv_rate,120dip,215dip,110dip,40";
mostCurrent._p1.AddView((android.view.View)(mostCurrent._curr_conv_rate.getObject()),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (120)),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (215)),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (110)),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (40)));
RDebugUtils.currentLine=131114;
 //BA.debugLineNum = 131114;BA.debugLine="p1.AddView(bu1, 110dip, 270dip, 90dip, 60dip)";
mostCurrent._p1.AddView((android.view.View)(mostCurrent._bu1.getObject()),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (110)),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (270)),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (90)),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (60)));
RDebugUtils.currentLine=131115;
 //BA.debugLineNum = 131115;BA.debugLine="p1.AddView(bu2, 110dip, 340dip, 90dip, 60dip)";
mostCurrent._p1.AddView((android.view.View)(mostCurrent._bu2.getObject()),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (110)),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (340)),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (90)),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (60)));
RDebugUtils.currentLine=131117;
 //BA.debugLineNum = 131117;BA.debugLine="p2.AddView(back_but(0), 20dip, 360dip, 100dip, 40";
mostCurrent._p2.AddView((android.view.View)(mostCurrent._back_but[(int) (0)].getObject()),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (20)),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (360)),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (100)),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (40)));
RDebugUtils.currentLine=131118;
 //BA.debugLineNum = 131118;BA.debugLine="p3.AddView(back_but(1), 20dip, 360dip, 100dip, 40";
mostCurrent._p3.AddView((android.view.View)(mostCurrent._back_but[(int) (1)].getObject()),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (20)),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (360)),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (100)),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (40)));
RDebugUtils.currentLine=131119;
 //BA.debugLineNum = 131119;BA.debugLine="p4.AddView(back_but(2), 20dip, 360dip, 100dip, 40";
mostCurrent._p4.AddView((android.view.View)(mostCurrent._back_but[(int) (2)].getObject()),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (20)),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (360)),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (100)),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (40)));
RDebugUtils.currentLine=131120;
 //BA.debugLineNum = 131120;BA.debugLine="p5.AddView(back_but(3), 20dip, 360dip, 100dip, 40";
mostCurrent._p5.AddView((android.view.View)(mostCurrent._back_but[(int) (3)].getObject()),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (20)),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (360)),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (100)),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (40)));
RDebugUtils.currentLine=131121;
 //BA.debugLineNum = 131121;BA.debugLine="p6.AddView(back_but(4), 20dip, 360dip, 100dip, 40";
mostCurrent._p6.AddView((android.view.View)(mostCurrent._back_but[(int) (4)].getObject()),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (20)),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (360)),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (100)),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (40)));
RDebugUtils.currentLine=131122;
 //BA.debugLineNum = 131122;BA.debugLine="p7.AddView(back_but(5), 20dip, 360dip, 100dip, 40";
mostCurrent._p7.AddView((android.view.View)(mostCurrent._back_but[(int) (5)].getObject()),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (20)),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (360)),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (100)),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (40)));
RDebugUtils.currentLine=131123;
 //BA.debugLineNum = 131123;BA.debugLine="p8.AddView(back_but(6), 20dip, 360dip, 100dip, 40";
mostCurrent._p8.AddView((android.view.View)(mostCurrent._back_but[(int) (6)].getObject()),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (20)),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (360)),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (100)),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (40)));
RDebugUtils.currentLine=131125;
 //BA.debugLineNum = 131125;BA.debugLine="cur1.Color=Colors.RGB(255,255,255)";
mostCurrent._cur1.setColor(anywheresoftware.b4a.keywords.Common.Colors.RGB((int) (255),(int) (255),(int) (255)));
RDebugUtils.currentLine=131126;
 //BA.debugLineNum = 131126;BA.debugLine="cur2.Color=Colors.RGB(255,255,255)";
mostCurrent._cur2.setColor(anywheresoftware.b4a.keywords.Common.Colors.RGB((int) (255),(int) (255),(int) (255)));
RDebugUtils.currentLine=131127;
 //BA.debugLineNum = 131127;BA.debugLine="curr_conv_rate.Color=Colors.RGB(255,255,255)";
mostCurrent._curr_conv_rate.setColor(anywheresoftware.b4a.keywords.Common.Colors.RGB((int) (255),(int) (255),(int) (255)));
RDebugUtils.currentLine=131128;
 //BA.debugLineNum = 131128;BA.debugLine="ed1.Color=Colors.RGB(255,255,255)";
mostCurrent._ed1.setColor(anywheresoftware.b4a.keywords.Common.Colors.RGB((int) (255),(int) (255),(int) (255)));
RDebugUtils.currentLine=131129;
 //BA.debugLineNum = 131129;BA.debugLine="lb.Color=Colors.RGB(255,255,255)";
mostCurrent._lb.setColor(anywheresoftware.b4a.keywords.Common.Colors.RGB((int) (255),(int) (255),(int) (255)));
RDebugUtils.currentLine=131130;
 //BA.debugLineNum = 131130;BA.debugLine="ed2.Color=Colors.RGB(255,255,255)";
mostCurrent._ed2.setColor(anywheresoftware.b4a.keywords.Common.Colors.RGB((int) (255),(int) (255),(int) (255)));
RDebugUtils.currentLine=131131;
 //BA.debugLineNum = 131131;BA.debugLine="cur1.TextColor=Colors.RGB(0,0,0)";
mostCurrent._cur1.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.RGB((int) (0),(int) (0),(int) (0)));
RDebugUtils.currentLine=131132;
 //BA.debugLineNum = 131132;BA.debugLine="cur2.TextColor=Colors.RGB(0,0,0)";
mostCurrent._cur2.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.RGB((int) (0),(int) (0),(int) (0)));
RDebugUtils.currentLine=131133;
 //BA.debugLineNum = 131133;BA.debugLine="curr_conv_rate.TextColor=Colors.RGB(0,0,0)";
mostCurrent._curr_conv_rate.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.RGB((int) (0),(int) (0),(int) (0)));
RDebugUtils.currentLine=131134;
 //BA.debugLineNum = 131134;BA.debugLine="ed1.TextColor=Colors.RGB(0,0,0)";
mostCurrent._ed1.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.RGB((int) (0),(int) (0),(int) (0)));
RDebugUtils.currentLine=131135;
 //BA.debugLineNum = 131135;BA.debugLine="lb.TextColor=Colors.RGB(0,0,0)";
mostCurrent._lb.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.RGB((int) (0),(int) (0),(int) (0)));
RDebugUtils.currentLine=131136;
 //BA.debugLineNum = 131136;BA.debugLine="ed1.TextColor= Colors.RGB(0,0,0)";
mostCurrent._ed1.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.RGB((int) (0),(int) (0),(int) (0)));
RDebugUtils.currentLine=131137;
 //BA.debugLineNum = 131137;BA.debugLine="ed2.TextColor = Colors.RGB(0,0,0)";
mostCurrent._ed2.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.RGB((int) (0),(int) (0),(int) (0)));
RDebugUtils.currentLine=131138;
 //BA.debugLineNum = 131138;BA.debugLine="lb.TextColor=Colors.Black";
mostCurrent._lb.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.Black);
RDebugUtils.currentLine=131140;
 //BA.debugLineNum = 131140;BA.debugLine="lb.Text=\"Conversion Rate\"";
mostCurrent._lb.setText(BA.ObjectToCharSequence("Conversion Rate"));
RDebugUtils.currentLine=131141;
 //BA.debugLineNum = 131141;BA.debugLine="item_list.Add(\"$ Dollar\")";
mostCurrent._item_list.Add((Object)("$ Dollar"));
RDebugUtils.currentLine=131142;
 //BA.debugLineNum = 131142;BA.debugLine="item_list.Add(\"¥ Yuan\")";
mostCurrent._item_list.Add((Object)("¥ Yuan"));
RDebugUtils.currentLine=131143;
 //BA.debugLineNum = 131143;BA.debugLine="item_list.Add(\"€ Euro\")";
mostCurrent._item_list.Add((Object)("€ Euro"));
RDebugUtils.currentLine=131144;
 //BA.debugLineNum = 131144;BA.debugLine="item_list.Add(\"лв. BGN\")";
mostCurrent._item_list.Add((Object)("лв. BGN"));
RDebugUtils.currentLine=131145;
 //BA.debugLineNum = 131145;BA.debugLine="item_list.Add(\"CZK Koruna\")";
mostCurrent._item_list.Add((Object)("CZK Koruna"));
RDebugUtils.currentLine=131146;
 //BA.debugLineNum = 131146;BA.debugLine="item_list.Add(\"RUB Ruble\")";
mostCurrent._item_list.Add((Object)("RUB Ruble"));
RDebugUtils.currentLine=131147;
 //BA.debugLineNum = 131147;BA.debugLine="bu1.Text=\"Convert\"";
mostCurrent._bu1.setText(BA.ObjectToCharSequence("Convert"));
RDebugUtils.currentLine=131148;
 //BA.debugLineNum = 131148;BA.debugLine="bu2.Text=\"rates\"";
mostCurrent._bu2.setText(BA.ObjectToCharSequence("rates"));
RDebugUtils.currentLine=131149;
 //BA.debugLineNum = 131149;BA.debugLine="ed1.InputType = ed1.INPUT_TYPE_DECIMAL_NUMBERS";
mostCurrent._ed1.setInputType(mostCurrent._ed1.INPUT_TYPE_DECIMAL_NUMBERS);
RDebugUtils.currentLine=131150;
 //BA.debugLineNum = 131150;BA.debugLine="ed2.InputType = ed2.INPUT_TYPE_DECIMAL_NUMBERS";
mostCurrent._ed2.setInputType(mostCurrent._ed2.INPUT_TYPE_DECIMAL_NUMBERS);
RDebugUtils.currentLine=131151;
 //BA.debugLineNum = 131151;BA.debugLine="curr_conv_rate.InputType = curr_conv_rate.INPUT_T";
mostCurrent._curr_conv_rate.setInputType(mostCurrent._curr_conv_rate.INPUT_TYPE_DECIMAL_NUMBERS);
RDebugUtils.currentLine=131154;
 //BA.debugLineNum = 131154;BA.debugLine="cur1.SetItems(item_list)";
mostCurrent._cur1.SetItems(processBA,mostCurrent._item_list);
RDebugUtils.currentLine=131155;
 //BA.debugLineNum = 131155;BA.debugLine="cur2.SetItems(item_list)";
mostCurrent._cur2.SetItems(processBA,mostCurrent._item_list);
RDebugUtils.currentLine=131156;
 //BA.debugLineNum = 131156;BA.debugLine="Dim col,row As Int = 0";
_col = 0;
_row = (int) (0);
RDebugUtils.currentLine=131157;
 //BA.debugLineNum = 131157;BA.debugLine="For i = 0 To 5";
{
final int step76 = 1;
final int limit76 = (int) (5);
_i = (int) (0) ;
for (;(step76 > 0 && _i <= limit76) || (step76 < 0 && _i >= limit76) ;_i = ((int)(0 + _i + step76))  ) {
RDebugUtils.currentLine=131158;
 //BA.debugLineNum = 131158;BA.debugLine="If row = 3 Then";
if (_row==3) { 
RDebugUtils.currentLine=131159;
 //BA.debugLineNum = 131159;BA.debugLine="col = col + 1";
_col = (int) (_col+1);
RDebugUtils.currentLine=131160;
 //BA.debugLineNum = 131160;BA.debugLine="row = 0";
_row = (int) (0);
 };
RDebugUtils.currentLine=131163;
 //BA.debugLineNum = 131163;BA.debugLine="button(i).Initialize(\"button\")";
mostCurrent._button[_i].Initialize(mostCurrent.activityBA,"button");
RDebugUtils.currentLine=131164;
 //BA.debugLineNum = 131164;BA.debugLine="p2.AddView(button(i), (row*60dip) + 80dip,(col*6";
mostCurrent._p2.AddView((android.view.View)(mostCurrent._button[_i].getObject()),(int) ((_row*anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (60)))+anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (80))),(int) ((_col*anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (60)))+anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (140))),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (50)),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (50)));
RDebugUtils.currentLine=131166;
 //BA.debugLineNum = 131166;BA.debugLine="row = row + 1";
_row = (int) (_row+1);
RDebugUtils.currentLine=131167;
 //BA.debugLineNum = 131167;BA.debugLine="button(i).Tag=i+1";
mostCurrent._button[_i].setTag((Object)(_i+1));
 }
};
RDebugUtils.currentLine=131171;
 //BA.debugLineNum = 131171;BA.debugLine="Visible";
_visible();
RDebugUtils.currentLine=131172;
 //BA.debugLineNum = 131172;BA.debugLine="setButtonText";
_setbuttontext();
RDebugUtils.currentLine=131173;
 //BA.debugLineNum = 131173;BA.debugLine="End Sub";
return "";
}
public static String  _visible() throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(mostCurrent.activityBA, "visible"))
	return (String) Debug.delegate(mostCurrent.activityBA, "visible", null);
RDebugUtils.currentLine=3342336;
 //BA.debugLineNum = 3342336;BA.debugLine="Sub Visible";
RDebugUtils.currentLine=3342337;
 //BA.debugLineNum = 3342337;BA.debugLine="p2.Visible=False";
mostCurrent._p2.setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=3342338;
 //BA.debugLineNum = 3342338;BA.debugLine="p3.Visible=False";
mostCurrent._p3.setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=3342339;
 //BA.debugLineNum = 3342339;BA.debugLine="p4.Visible=False";
mostCurrent._p4.setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=3342340;
 //BA.debugLineNum = 3342340;BA.debugLine="p5.Visible=False";
mostCurrent._p5.setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=3342341;
 //BA.debugLineNum = 3342341;BA.debugLine="p6.Visible=False";
mostCurrent._p6.setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=3342342;
 //BA.debugLineNum = 3342342;BA.debugLine="p7.Visible=False";
mostCurrent._p7.setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=3342343;
 //BA.debugLineNum = 3342343;BA.debugLine="p8.Visible = False";
mostCurrent._p8.setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=3342344;
 //BA.debugLineNum = 3342344;BA.debugLine="End Sub";
return "";
}
public static String  _setbuttontext() throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(mostCurrent.activityBA, "setbuttontext"))
	return (String) Debug.delegate(mostCurrent.activityBA, "setbuttontext", null);
RDebugUtils.currentLine=4259840;
 //BA.debugLineNum = 4259840;BA.debugLine="Sub setButtonText";
RDebugUtils.currentLine=4259841;
 //BA.debugLineNum = 4259841;BA.debugLine="button(0).Text=\"€\"";
mostCurrent._button[(int) (0)].setText(BA.ObjectToCharSequence("€"));
RDebugUtils.currentLine=4259842;
 //BA.debugLineNum = 4259842;BA.debugLine="button(1).Text=\"$\"";
mostCurrent._button[(int) (1)].setText(BA.ObjectToCharSequence("$"));
RDebugUtils.currentLine=4259843;
 //BA.debugLineNum = 4259843;BA.debugLine="button(2).Text=\"Lv\"";
mostCurrent._button[(int) (2)].setText(BA.ObjectToCharSequence("Lv"));
RDebugUtils.currentLine=4259844;
 //BA.debugLineNum = 4259844;BA.debugLine="button(3).Text=\"¥\"";
mostCurrent._button[(int) (3)].setText(BA.ObjectToCharSequence("¥"));
RDebugUtils.currentLine=4259845;
 //BA.debugLineNum = 4259845;BA.debugLine="button(4).Text=\"Kr\"";
mostCurrent._button[(int) (4)].setText(BA.ObjectToCharSequence("Kr"));
RDebugUtils.currentLine=4259846;
 //BA.debugLineNum = 4259846;BA.debugLine="button(5).Text=\"Rb\"";
mostCurrent._button[(int) (5)].setText(BA.ObjectToCharSequence("Rb"));
RDebugUtils.currentLine=4259847;
 //BA.debugLineNum = 4259847;BA.debugLine="End Sub";
return "";
}
public static String  _activity_pause(boolean _userclosed) throws Exception{
RDebugUtils.currentModule="main";
RDebugUtils.currentLine=262144;
 //BA.debugLineNum = 262144;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
RDebugUtils.currentLine=262146;
 //BA.debugLineNum = 262146;BA.debugLine="End Sub";
return "";
}
public static String  _activity_resume() throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(mostCurrent.activityBA, "activity_resume"))
	return (String) Debug.delegate(mostCurrent.activityBA, "activity_resume", null);
RDebugUtils.currentLine=196608;
 //BA.debugLineNum = 196608;BA.debugLine="Sub Activity_Resume";
RDebugUtils.currentLine=196610;
 //BA.debugLineNum = 196610;BA.debugLine="End Sub";
return "";
}
public static String  _back_click() throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(mostCurrent.activityBA, "back_click"))
	return (String) Debug.delegate(mostCurrent.activityBA, "back_click", null);
anywheresoftware.b4a.objects.ButtonWrapper _temp = null;
RDebugUtils.currentLine=2883584;
 //BA.debugLineNum = 2883584;BA.debugLine="Sub Back_Click";
RDebugUtils.currentLine=2883586;
 //BA.debugLineNum = 2883586;BA.debugLine="Dim temp As Button";
_temp = new anywheresoftware.b4a.objects.ButtonWrapper();
RDebugUtils.currentLine=2883587;
 //BA.debugLineNum = 2883587;BA.debugLine="temp = Sender";
_temp.setObject((android.widget.Button)(anywheresoftware.b4a.keywords.Common.Sender(mostCurrent.activityBA)));
RDebugUtils.currentLine=2883588;
 //BA.debugLineNum = 2883588;BA.debugLine="Select temp.Tag";
switch (BA.switchObjectToInt(_temp.getTag(),(Object)(1),(Object)(2),(Object)(3),(Object)(4),(Object)(5),(Object)(6),(Object)(7))) {
case 0: {
RDebugUtils.currentLine=2883590;
 //BA.debugLineNum = 2883590;BA.debugLine="p2.Visible = False";
mostCurrent._p2.setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=2883591;
 //BA.debugLineNum = 2883591;BA.debugLine="p1.Visible = True";
mostCurrent._p1.setVisible(anywheresoftware.b4a.keywords.Common.True);
 break; }
case 1: {
RDebugUtils.currentLine=2883593;
 //BA.debugLineNum = 2883593;BA.debugLine="p3.Visible = False";
mostCurrent._p3.setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=2883594;
 //BA.debugLineNum = 2883594;BA.debugLine="p2.Visible = True";
mostCurrent._p2.setVisible(anywheresoftware.b4a.keywords.Common.True);
 break; }
case 2: {
RDebugUtils.currentLine=2883596;
 //BA.debugLineNum = 2883596;BA.debugLine="p4.Visible = False";
mostCurrent._p4.setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=2883597;
 //BA.debugLineNum = 2883597;BA.debugLine="p2.Visible = True";
mostCurrent._p2.setVisible(anywheresoftware.b4a.keywords.Common.True);
 break; }
case 3: {
RDebugUtils.currentLine=2883599;
 //BA.debugLineNum = 2883599;BA.debugLine="p5.Visible = False";
mostCurrent._p5.setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=2883600;
 //BA.debugLineNum = 2883600;BA.debugLine="p2.Visible = True";
mostCurrent._p2.setVisible(anywheresoftware.b4a.keywords.Common.True);
 break; }
case 4: {
RDebugUtils.currentLine=2883602;
 //BA.debugLineNum = 2883602;BA.debugLine="p6.Visible = False";
mostCurrent._p6.setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=2883603;
 //BA.debugLineNum = 2883603;BA.debugLine="p2.Visible = True";
mostCurrent._p2.setVisible(anywheresoftware.b4a.keywords.Common.True);
 break; }
case 5: {
RDebugUtils.currentLine=2883605;
 //BA.debugLineNum = 2883605;BA.debugLine="p7.Visible = False";
mostCurrent._p7.setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=2883606;
 //BA.debugLineNum = 2883606;BA.debugLine="p2.Visible = True";
mostCurrent._p2.setVisible(anywheresoftware.b4a.keywords.Common.True);
 break; }
case 6: {
RDebugUtils.currentLine=2883608;
 //BA.debugLineNum = 2883608;BA.debugLine="p8.Visible = False";
mostCurrent._p8.setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=2883609;
 //BA.debugLineNum = 2883609;BA.debugLine="p2.Visible = True";
mostCurrent._p2.setVisible(anywheresoftware.b4a.keywords.Common.True);
 break; }
}
;
RDebugUtils.currentLine=2883614;
 //BA.debugLineNum = 2883614;BA.debugLine="End Sub";
return "";
}
public static String  _bu1_click() throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(mostCurrent.activityBA, "bu1_click"))
	return (String) Debug.delegate(mostCurrent.activityBA, "bu1_click", null);
double _res1 = 0;
double _res2 = 0;
double _currency1 = 0;
double _currency2 = 0;
double _rate = 0;
RDebugUtils.currentLine=327680;
 //BA.debugLineNum = 327680;BA.debugLine="Sub bu1_Click";
RDebugUtils.currentLine=327682;
 //BA.debugLineNum = 327682;BA.debugLine="Dim res1,res2 As Double";
_res1 = 0;
_res2 = 0;
RDebugUtils.currentLine=327683;
 //BA.debugLineNum = 327683;BA.debugLine="Dim currency1,currency2,rate As Double";
_currency1 = 0;
_currency2 = 0;
_rate = 0;
RDebugUtils.currentLine=327685;
 //BA.debugLineNum = 327685;BA.debugLine="If curr_conv_rate.Text <> \"\" Then";
if ((mostCurrent._curr_conv_rate.getText()).equals("") == false) { 
RDebugUtils.currentLine=327686;
 //BA.debugLineNum = 327686;BA.debugLine="rate=curr_conv_rate.Text";
_rate = (double)(Double.parseDouble(mostCurrent._curr_conv_rate.getText()));
 }else {
RDebugUtils.currentLine=327688;
 //BA.debugLineNum = 327688;BA.debugLine="Msgbox(\"Input rate\",\"OOOOOPPPPS\")";
anywheresoftware.b4a.keywords.Common.Msgbox(BA.ObjectToCharSequence("Input rate"),BA.ObjectToCharSequence("OOOOOPPPPS"),mostCurrent.activityBA);
 };
RDebugUtils.currentLine=327692;
 //BA.debugLineNum = 327692;BA.debugLine="res1=0";
_res1 = 0;
RDebugUtils.currentLine=327693;
 //BA.debugLineNum = 327693;BA.debugLine="res2=0";
_res2 = 0;
RDebugUtils.currentLine=327694;
 //BA.debugLineNum = 327694;BA.debugLine="If ed1.Text <> \"\"   Then";
if ((mostCurrent._ed1.getText()).equals("") == false) { 
RDebugUtils.currentLine=327695;
 //BA.debugLineNum = 327695;BA.debugLine="currency1=ed1.Text";
_currency1 = (double)(Double.parseDouble(mostCurrent._ed1.getText()));
RDebugUtils.currentLine=327696;
 //BA.debugLineNum = 327696;BA.debugLine="res1=currency1*rate";
_res1 = _currency1*_rate;
 };
RDebugUtils.currentLine=327698;
 //BA.debugLineNum = 327698;BA.debugLine="If ed2.Text <> \"\"   Then";
if ((mostCurrent._ed2.getText()).equals("") == false) { 
RDebugUtils.currentLine=327699;
 //BA.debugLineNum = 327699;BA.debugLine="currency2=ed2.Text";
_currency2 = (double)(Double.parseDouble(mostCurrent._ed2.getText()));
RDebugUtils.currentLine=327700;
 //BA.debugLineNum = 327700;BA.debugLine="res2=currency2/rate";
_res2 = _currency2/(double)_rate;
 };
RDebugUtils.currentLine=327702;
 //BA.debugLineNum = 327702;BA.debugLine="Msgbox(\"cur1: \"& res1 & CRLF & \"cur2: \" &  res2,\"";
anywheresoftware.b4a.keywords.Common.Msgbox(BA.ObjectToCharSequence("cur1: "+BA.NumberToString(_res1)+anywheresoftware.b4a.keywords.Common.CRLF+"cur2: "+BA.NumberToString(_res2)),BA.ObjectToCharSequence("RATES"),mostCurrent.activityBA);
RDebugUtils.currentLine=327704;
 //BA.debugLineNum = 327704;BA.debugLine="End Sub";
return "";
}
public static String  _bu2_click() throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(mostCurrent.activityBA, "bu2_click"))
	return (String) Debug.delegate(mostCurrent.activityBA, "bu2_click", null);
RDebugUtils.currentLine=393216;
 //BA.debugLineNum = 393216;BA.debugLine="Sub bu2_Click";
RDebugUtils.currentLine=393217;
 //BA.debugLineNum = 393217;BA.debugLine="p1.Visible=False";
mostCurrent._p1.setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=393218;
 //BA.debugLineNum = 393218;BA.debugLine="p2.Visible=True";
mostCurrent._p2.setVisible(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=393220;
 //BA.debugLineNum = 393220;BA.debugLine="End Sub";
return "";
}
public static String  _button_click() throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(mostCurrent.activityBA, "button_click"))
	return (String) Debug.delegate(mostCurrent.activityBA, "button_click", null);
anywheresoftware.b4a.objects.ButtonWrapper _temp = null;
anywheresoftware.b4a.objects.WebViewWrapper _myw = null;
RDebugUtils.currentLine=1638400;
 //BA.debugLineNum = 1638400;BA.debugLine="Sub Button_Click";
RDebugUtils.currentLine=1638401;
 //BA.debugLineNum = 1638401;BA.debugLine="Dim temp As Button";
_temp = new anywheresoftware.b4a.objects.ButtonWrapper();
RDebugUtils.currentLine=1638402;
 //BA.debugLineNum = 1638402;BA.debugLine="temp = Sender";
_temp.setObject((android.widget.Button)(anywheresoftware.b4a.keywords.Common.Sender(mostCurrent.activityBA)));
RDebugUtils.currentLine=1638403;
 //BA.debugLineNum = 1638403;BA.debugLine="Dim myw As WebView";
_myw = new anywheresoftware.b4a.objects.WebViewWrapper();
RDebugUtils.currentLine=1638404;
 //BA.debugLineNum = 1638404;BA.debugLine="myw.Initialize(\"myw\")";
_myw.Initialize(mostCurrent.activityBA,"myw");
RDebugUtils.currentLine=1638405;
 //BA.debugLineNum = 1638405;BA.debugLine="Select temp.Tag";
switch (BA.switchObjectToInt(_temp.getTag(),(Object)(1),(Object)(2),(Object)(3),(Object)(4),(Object)(5),(Object)(6))) {
case 0: {
RDebugUtils.currentLine=1638408;
 //BA.debugLineNum = 1638408;BA.debugLine="p2.Visible=False";
mostCurrent._p2.setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=1638409;
 //BA.debugLineNum = 1638409;BA.debugLine="p3.Visible=True";
mostCurrent._p3.setVisible(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=1638410;
 //BA.debugLineNum = 1638410;BA.debugLine="p3.AddView(myw, 0, 0, 100%x, 75%y) 'Your optio";
mostCurrent._p3.AddView((android.view.View)(_myw.getObject()),(int) (0),(int) (0),anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (100),mostCurrent.activityBA),anywheresoftware.b4a.keywords.Common.PerYToCurrent((float) (75),mostCurrent.activityBA));
RDebugUtils.currentLine=1638411;
 //BA.debugLineNum = 1638411;BA.debugLine="myw.LoadUrl(\"http://www.floatrates.com/daily/e";
_myw.LoadUrl("http://www.floatrates.com/daily/eur.xml");
 break; }
case 1: {
RDebugUtils.currentLine=1638413;
 //BA.debugLineNum = 1638413;BA.debugLine="p2.Visible=False";
mostCurrent._p2.setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=1638414;
 //BA.debugLineNum = 1638414;BA.debugLine="p4.Visible=True";
mostCurrent._p4.setVisible(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=1638415;
 //BA.debugLineNum = 1638415;BA.debugLine="p4.AddView(myw, 0, 0, 100%x, 75%y) 'Your optio";
mostCurrent._p4.AddView((android.view.View)(_myw.getObject()),(int) (0),(int) (0),anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (100),mostCurrent.activityBA),anywheresoftware.b4a.keywords.Common.PerYToCurrent((float) (75),mostCurrent.activityBA));
RDebugUtils.currentLine=1638416;
 //BA.debugLineNum = 1638416;BA.debugLine="myw.LoadUrl(\"http://www.floatrates.com/daily/u";
_myw.LoadUrl("http://www.floatrates.com/daily/usd.xml");
 break; }
case 2: {
RDebugUtils.currentLine=1638418;
 //BA.debugLineNum = 1638418;BA.debugLine="p2.Visible = False";
mostCurrent._p2.setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=1638419;
 //BA.debugLineNum = 1638419;BA.debugLine="p5.Visible = True";
mostCurrent._p5.setVisible(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=1638420;
 //BA.debugLineNum = 1638420;BA.debugLine="p5.AddView(myw, 0, 0, 100%x, 75%y) 'Your optio";
mostCurrent._p5.AddView((android.view.View)(_myw.getObject()),(int) (0),(int) (0),anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (100),mostCurrent.activityBA),anywheresoftware.b4a.keywords.Common.PerYToCurrent((float) (75),mostCurrent.activityBA));
RDebugUtils.currentLine=1638421;
 //BA.debugLineNum = 1638421;BA.debugLine="myw.LoadUrl(\"http://www.floatrates.com/daily/b";
_myw.LoadUrl("http://www.floatrates.com/daily/bgn.xml");
 break; }
case 3: {
RDebugUtils.currentLine=1638423;
 //BA.debugLineNum = 1638423;BA.debugLine="p2.Visible = False";
mostCurrent._p2.setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=1638424;
 //BA.debugLineNum = 1638424;BA.debugLine="p6.Visible = True";
mostCurrent._p6.setVisible(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=1638425;
 //BA.debugLineNum = 1638425;BA.debugLine="p6.AddView(myw, 0, 0, 100%x, 75%y) 'Your optio";
mostCurrent._p6.AddView((android.view.View)(_myw.getObject()),(int) (0),(int) (0),anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (100),mostCurrent.activityBA),anywheresoftware.b4a.keywords.Common.PerYToCurrent((float) (75),mostCurrent.activityBA));
RDebugUtils.currentLine=1638426;
 //BA.debugLineNum = 1638426;BA.debugLine="myw.LoadUrl(\"http://www.floatrates.com/daily/c";
_myw.LoadUrl("http://www.floatrates.com/daily/cny.xml");
 break; }
case 4: {
RDebugUtils.currentLine=1638428;
 //BA.debugLineNum = 1638428;BA.debugLine="p2.Visible = False";
mostCurrent._p2.setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=1638429;
 //BA.debugLineNum = 1638429;BA.debugLine="p7.Visible = True";
mostCurrent._p7.setVisible(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=1638430;
 //BA.debugLineNum = 1638430;BA.debugLine="p7.AddView(myw, 0, 0, 100%x, 75%y) 'Your optio";
mostCurrent._p7.AddView((android.view.View)(_myw.getObject()),(int) (0),(int) (0),anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (100),mostCurrent.activityBA),anywheresoftware.b4a.keywords.Common.PerYToCurrent((float) (75),mostCurrent.activityBA));
RDebugUtils.currentLine=1638431;
 //BA.debugLineNum = 1638431;BA.debugLine="myw.LoadUrl(\"http://www.floatrates.com/daily/c";
_myw.LoadUrl("http://www.floatrates.com/daily/czk.xml");
 break; }
case 5: {
RDebugUtils.currentLine=1638433;
 //BA.debugLineNum = 1638433;BA.debugLine="p2.Visible = False";
mostCurrent._p2.setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=1638434;
 //BA.debugLineNum = 1638434;BA.debugLine="p8.Visible = True";
mostCurrent._p8.setVisible(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=1638435;
 //BA.debugLineNum = 1638435;BA.debugLine="p8.AddView(myw, 0, 0, 100%x, 75%y) 'Your optio";
mostCurrent._p8.AddView((android.view.View)(_myw.getObject()),(int) (0),(int) (0),anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (100),mostCurrent.activityBA),anywheresoftware.b4a.keywords.Common.PerYToCurrent((float) (75),mostCurrent.activityBA));
RDebugUtils.currentLine=1638436;
 //BA.debugLineNum = 1638436;BA.debugLine="myw.LoadUrl(\"http://www.floatrates.com/daily/r";
_myw.LoadUrl("http://www.floatrates.com/daily/rub.xml");
 break; }
}
;
RDebugUtils.currentLine=1638440;
 //BA.debugLineNum = 1638440;BA.debugLine="End Sub";
return "";
}
}