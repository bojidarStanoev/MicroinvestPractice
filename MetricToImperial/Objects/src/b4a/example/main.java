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
public anywheresoftware.b4a.objects.PanelWrapper _start_screen_p = null;
public anywheresoftware.b4a.objects.PanelWrapper _weight_p = null;
public anywheresoftware.b4a.objects.PanelWrapper _length_p = null;
public anywheresoftware.b4a.objects.ButtonWrapper _but_weight = null;
public anywheresoftware.b4a.objects.ButtonWrapper _but_length = null;
public anywheresoftware.b4a.objects.LabelWrapper _lbs_lb = null;
public anywheresoftware.b4a.objects.LabelWrapper _kg_lb = null;
public anywheresoftware.b4a.objects.EditTextWrapper _ed1 = null;
public anywheresoftware.b4a.objects.EditTextWrapper _ed2 = null;
public anywheresoftware.b4a.objects.EditTextWrapper _ed3 = null;
public anywheresoftware.b4a.objects.EditTextWrapper _ed4 = null;
public anywheresoftware.b4a.objects.AutoCompleteEditTextWrapper _menu_metre = null;
public anywheresoftware.b4a.objects.AutoCompleteEditTextWrapper _menu_imp = null;
public anywheresoftware.b4a.objects.collections.List _item_list1 = null;
public anywheresoftware.b4a.objects.collections.List _item_list2 = null;
public anywheresoftware.b4a.objects.ButtonWrapper _convert_weight_b = null;
public anywheresoftware.b4a.objects.ButtonWrapper _convert_length_b = null;
public b4a.example.starter _starter = null;
public static String  _activity_create(boolean _firsttime) throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(mostCurrent.activityBA, "activity_create"))
	return (String) Debug.delegate(mostCurrent.activityBA, "activity_create", new Object[] {_firsttime});
RDebugUtils.currentLine=131072;
 //BA.debugLineNum = 131072;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
RDebugUtils.currentLine=131075;
 //BA.debugLineNum = 131075;BA.debugLine="start_screen_p.Initialize(\"\")";
mostCurrent._start_screen_p.Initialize(mostCurrent.activityBA,"");
RDebugUtils.currentLine=131076;
 //BA.debugLineNum = 131076;BA.debugLine="weight_p.Initialize(\"\")";
mostCurrent._weight_p.Initialize(mostCurrent.activityBA,"");
RDebugUtils.currentLine=131077;
 //BA.debugLineNum = 131077;BA.debugLine="length_p.Initialize(\"\")";
mostCurrent._length_p.Initialize(mostCurrent.activityBA,"");
RDebugUtils.currentLine=131078;
 //BA.debugLineNum = 131078;BA.debugLine="but_weight.Initialize(\"but_weight\")";
mostCurrent._but_weight.Initialize(mostCurrent.activityBA,"but_weight");
RDebugUtils.currentLine=131079;
 //BA.debugLineNum = 131079;BA.debugLine="but_length.Initialize(\"but_length\")";
mostCurrent._but_length.Initialize(mostCurrent.activityBA,"but_length");
RDebugUtils.currentLine=131080;
 //BA.debugLineNum = 131080;BA.debugLine="lbs_lb.Initialize(\"\")";
mostCurrent._lbs_lb.Initialize(mostCurrent.activityBA,"");
RDebugUtils.currentLine=131081;
 //BA.debugLineNum = 131081;BA.debugLine="kg_lb.Initialize(\"\")";
mostCurrent._kg_lb.Initialize(mostCurrent.activityBA,"");
RDebugUtils.currentLine=131082;
 //BA.debugLineNum = 131082;BA.debugLine="ed1.Initialize(\"\")";
mostCurrent._ed1.Initialize(mostCurrent.activityBA,"");
RDebugUtils.currentLine=131083;
 //BA.debugLineNum = 131083;BA.debugLine="ed2.Initialize(\"\")";
mostCurrent._ed2.Initialize(mostCurrent.activityBA,"");
RDebugUtils.currentLine=131084;
 //BA.debugLineNum = 131084;BA.debugLine="ed3.Initialize(\"\")";
mostCurrent._ed3.Initialize(mostCurrent.activityBA,"");
RDebugUtils.currentLine=131085;
 //BA.debugLineNum = 131085;BA.debugLine="ed4.Initialize(\"\")";
mostCurrent._ed4.Initialize(mostCurrent.activityBA,"");
RDebugUtils.currentLine=131086;
 //BA.debugLineNum = 131086;BA.debugLine="menu_metre.Initialize(\"\")";
mostCurrent._menu_metre.Initialize(processBA,"");
RDebugUtils.currentLine=131087;
 //BA.debugLineNum = 131087;BA.debugLine="menu_imp.Initialize(\"\")";
mostCurrent._menu_imp.Initialize(processBA,"");
RDebugUtils.currentLine=131088;
 //BA.debugLineNum = 131088;BA.debugLine="item_list1.Initialize()";
mostCurrent._item_list1.Initialize();
RDebugUtils.currentLine=131089;
 //BA.debugLineNum = 131089;BA.debugLine="item_list2.Initialize()";
mostCurrent._item_list2.Initialize();
RDebugUtils.currentLine=131091;
 //BA.debugLineNum = 131091;BA.debugLine="convert_length_b.Initialize(\"convert_length_b\")";
mostCurrent._convert_length_b.Initialize(mostCurrent.activityBA,"convert_length_b");
RDebugUtils.currentLine=131092;
 //BA.debugLineNum = 131092;BA.debugLine="convert_weight_b.Initialize(\"convert_weight_b\")";
mostCurrent._convert_weight_b.Initialize(mostCurrent.activityBA,"convert_weight_b");
RDebugUtils.currentLine=131094;
 //BA.debugLineNum = 131094;BA.debugLine="Activity.AddView(start_screen_p, 0 , 0, 100%x, 10";
mostCurrent._activity.AddView((android.view.View)(mostCurrent._start_screen_p.getObject()),(int) (0),(int) (0),anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (100),mostCurrent.activityBA),anywheresoftware.b4a.keywords.Common.PerYToCurrent((float) (100),mostCurrent.activityBA));
RDebugUtils.currentLine=131095;
 //BA.debugLineNum = 131095;BA.debugLine="Activity.AddView(weight_p, 0, 0, 100%x, 100%y)";
mostCurrent._activity.AddView((android.view.View)(mostCurrent._weight_p.getObject()),(int) (0),(int) (0),anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (100),mostCurrent.activityBA),anywheresoftware.b4a.keywords.Common.PerYToCurrent((float) (100),mostCurrent.activityBA));
RDebugUtils.currentLine=131096;
 //BA.debugLineNum = 131096;BA.debugLine="Activity.AddView(length_p, 0, 0, 100%x, 100%y)";
mostCurrent._activity.AddView((android.view.View)(mostCurrent._length_p.getObject()),(int) (0),(int) (0),anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (100),mostCurrent.activityBA),anywheresoftware.b4a.keywords.Common.PerYToCurrent((float) (100),mostCurrent.activityBA));
RDebugUtils.currentLine=131098;
 //BA.debugLineNum = 131098;BA.debugLine="start_screen_p.AddView(but_weight, 10.4%x, 18.75%";
mostCurrent._start_screen_p.AddView((android.view.View)(mostCurrent._but_weight.getObject()),anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (10.4),mostCurrent.activityBA),anywheresoftware.b4a.keywords.Common.PerYToCurrent((float) (18.75),mostCurrent.activityBA),anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (28.75),mostCurrent.activityBA),anywheresoftware.b4a.keywords.Common.PerYToCurrent((float) (10),mostCurrent.activityBA));
RDebugUtils.currentLine=131099;
 //BA.debugLineNum = 131099;BA.debugLine="start_screen_p.AddView(but_length, 40.33%x, 18.75";
mostCurrent._start_screen_p.AddView((android.view.View)(mostCurrent._but_length.getObject()),anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (40.33),mostCurrent.activityBA),anywheresoftware.b4a.keywords.Common.PerYToCurrent((float) (18.75),mostCurrent.activityBA),anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (28.75),mostCurrent.activityBA),anywheresoftware.b4a.keywords.Common.PerYToCurrent((float) (10),mostCurrent.activityBA));
RDebugUtils.currentLine=131101;
 //BA.debugLineNum = 131101;BA.debugLine="but_weight.Text = \"Weight\"";
mostCurrent._but_weight.setText(BA.ObjectToCharSequence("Weight"));
RDebugUtils.currentLine=131102;
 //BA.debugLineNum = 131102;BA.debugLine="but_length.Text = \"Length\"";
mostCurrent._but_length.setText(BA.ObjectToCharSequence("Length"));
RDebugUtils.currentLine=131104;
 //BA.debugLineNum = 131104;BA.debugLine="weight_p.AddView(ed1, 6.25%x, 4%y, 20%x, 9%y)";
mostCurrent._weight_p.AddView((android.view.View)(mostCurrent._ed1.getObject()),anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (6.25),mostCurrent.activityBA),anywheresoftware.b4a.keywords.Common.PerYToCurrent((float) (4),mostCurrent.activityBA),anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (20),mostCurrent.activityBA),anywheresoftware.b4a.keywords.Common.PerYToCurrent((float) (9),mostCurrent.activityBA));
RDebugUtils.currentLine=131105;
 //BA.debugLineNum = 131105;BA.debugLine="weight_p.AddView(ed2, 6.25%x, 16%y, 20%x, 9%y)";
mostCurrent._weight_p.AddView((android.view.View)(mostCurrent._ed2.getObject()),anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (6.25),mostCurrent.activityBA),anywheresoftware.b4a.keywords.Common.PerYToCurrent((float) (16),mostCurrent.activityBA),anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (20),mostCurrent.activityBA),anywheresoftware.b4a.keywords.Common.PerYToCurrent((float) (9),mostCurrent.activityBA));
RDebugUtils.currentLine=131106;
 //BA.debugLineNum = 131106;BA.debugLine="ed1.Color = Colors.White";
mostCurrent._ed1.setColor(anywheresoftware.b4a.keywords.Common.Colors.White);
RDebugUtils.currentLine=131107;
 //BA.debugLineNum = 131107;BA.debugLine="ed1.TextColor = Colors.Black";
mostCurrent._ed1.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.Black);
RDebugUtils.currentLine=131109;
 //BA.debugLineNum = 131109;BA.debugLine="ed2.Color = Colors.White";
mostCurrent._ed2.setColor(anywheresoftware.b4a.keywords.Common.Colors.White);
RDebugUtils.currentLine=131110;
 //BA.debugLineNum = 131110;BA.debugLine="ed2.TextColor = Colors.Black";
mostCurrent._ed2.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.Black);
RDebugUtils.currentLine=131112;
 //BA.debugLineNum = 131112;BA.debugLine="weight_p.AddView(kg_lb, 29%x, 9%y, 7.25%x, 4%y)";
mostCurrent._weight_p.AddView((android.view.View)(mostCurrent._kg_lb.getObject()),anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (29),mostCurrent.activityBA),anywheresoftware.b4a.keywords.Common.PerYToCurrent((float) (9),mostCurrent.activityBA),anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (7.25),mostCurrent.activityBA),anywheresoftware.b4a.keywords.Common.PerYToCurrent((float) (4),mostCurrent.activityBA));
RDebugUtils.currentLine=131113;
 //BA.debugLineNum = 131113;BA.debugLine="weight_p.AddView(lbs_lb, 29%x, 17%y, 7.25%x, 4%y)";
mostCurrent._weight_p.AddView((android.view.View)(mostCurrent._lbs_lb.getObject()),anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (29),mostCurrent.activityBA),anywheresoftware.b4a.keywords.Common.PerYToCurrent((float) (17),mostCurrent.activityBA),anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (7.25),mostCurrent.activityBA),anywheresoftware.b4a.keywords.Common.PerYToCurrent((float) (4),mostCurrent.activityBA));
RDebugUtils.currentLine=131115;
 //BA.debugLineNum = 131115;BA.debugLine="weight_p.AddView(convert_weight_b, 25%x, 35%y, 30";
mostCurrent._weight_p.AddView((android.view.View)(mostCurrent._convert_weight_b.getObject()),anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (25),mostCurrent.activityBA),anywheresoftware.b4a.keywords.Common.PerYToCurrent((float) (35),mostCurrent.activityBA),anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (30),mostCurrent.activityBA),anywheresoftware.b4a.keywords.Common.PerYToCurrent((float) (15),mostCurrent.activityBA));
RDebugUtils.currentLine=131117;
 //BA.debugLineNum = 131117;BA.debugLine="convert_weight_b.Text = \"Convert\"";
mostCurrent._convert_weight_b.setText(BA.ObjectToCharSequence("Convert"));
RDebugUtils.currentLine=131119;
 //BA.debugLineNum = 131119;BA.debugLine="kg_lb.Text = \"kg\"";
mostCurrent._kg_lb.setText(BA.ObjectToCharSequence("kg"));
RDebugUtils.currentLine=131120;
 //BA.debugLineNum = 131120;BA.debugLine="lbs_lb.Text = \"lbs\"";
mostCurrent._lbs_lb.setText(BA.ObjectToCharSequence("lbs"));
RDebugUtils.currentLine=131122;
 //BA.debugLineNum = 131122;BA.debugLine="ed1.InputType = ed1.INPUT_TYPE_DECIMAL_NUMBERS";
mostCurrent._ed1.setInputType(mostCurrent._ed1.INPUT_TYPE_DECIMAL_NUMBERS);
RDebugUtils.currentLine=131123;
 //BA.debugLineNum = 131123;BA.debugLine="ed2.InputType = ed2.INPUT_TYPE_DECIMAL_NUMBERS";
mostCurrent._ed2.setInputType(mostCurrent._ed2.INPUT_TYPE_DECIMAL_NUMBERS);
RDebugUtils.currentLine=131125;
 //BA.debugLineNum = 131125;BA.debugLine="length_p.AddView(ed3, 6.25%x, 4%y, 20%x, 9%y)";
mostCurrent._length_p.AddView((android.view.View)(mostCurrent._ed3.getObject()),anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (6.25),mostCurrent.activityBA),anywheresoftware.b4a.keywords.Common.PerYToCurrent((float) (4),mostCurrent.activityBA),anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (20),mostCurrent.activityBA),anywheresoftware.b4a.keywords.Common.PerYToCurrent((float) (9),mostCurrent.activityBA));
RDebugUtils.currentLine=131126;
 //BA.debugLineNum = 131126;BA.debugLine="length_p.AddView(ed4, 6.25%x, 16%y, 20%x, 9%y)";
mostCurrent._length_p.AddView((android.view.View)(mostCurrent._ed4.getObject()),anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (6.25),mostCurrent.activityBA),anywheresoftware.b4a.keywords.Common.PerYToCurrent((float) (16),mostCurrent.activityBA),anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (20),mostCurrent.activityBA),anywheresoftware.b4a.keywords.Common.PerYToCurrent((float) (9),mostCurrent.activityBA));
RDebugUtils.currentLine=131128;
 //BA.debugLineNum = 131128;BA.debugLine="ed3.Color = Colors.White";
mostCurrent._ed3.setColor(anywheresoftware.b4a.keywords.Common.Colors.White);
RDebugUtils.currentLine=131129;
 //BA.debugLineNum = 131129;BA.debugLine="ed3.TextColor = Colors.Black";
mostCurrent._ed3.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.Black);
RDebugUtils.currentLine=131131;
 //BA.debugLineNum = 131131;BA.debugLine="ed4.Color = Colors.White";
mostCurrent._ed4.setColor(anywheresoftware.b4a.keywords.Common.Colors.White);
RDebugUtils.currentLine=131132;
 //BA.debugLineNum = 131132;BA.debugLine="ed4.TextColor = Colors.Black";
mostCurrent._ed4.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.Black);
RDebugUtils.currentLine=131134;
 //BA.debugLineNum = 131134;BA.debugLine="ed3.InputType = ed3.INPUT_TYPE_DECIMAL_NUMBERS";
mostCurrent._ed3.setInputType(mostCurrent._ed3.INPUT_TYPE_DECIMAL_NUMBERS);
RDebugUtils.currentLine=131135;
 //BA.debugLineNum = 131135;BA.debugLine="ed4.InputType = ed4.INPUT_TYPE_DECIMAL_NUMBERS";
mostCurrent._ed4.setInputType(mostCurrent._ed4.INPUT_TYPE_DECIMAL_NUMBERS);
RDebugUtils.currentLine=131137;
 //BA.debugLineNum = 131137;BA.debugLine="length_p.AddView(menu_metre, 29%x, 4%y, 25%x, 10%";
mostCurrent._length_p.AddView((android.view.View)(mostCurrent._menu_metre.getObject()),anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (29),mostCurrent.activityBA),anywheresoftware.b4a.keywords.Common.PerYToCurrent((float) (4),mostCurrent.activityBA),anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (25),mostCurrent.activityBA),anywheresoftware.b4a.keywords.Common.PerYToCurrent((float) (10),mostCurrent.activityBA));
RDebugUtils.currentLine=131138;
 //BA.debugLineNum = 131138;BA.debugLine="length_p.AddView(menu_imp, 29%x, 16%y , 25%x, 10%";
mostCurrent._length_p.AddView((android.view.View)(mostCurrent._menu_imp.getObject()),anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (29),mostCurrent.activityBA),anywheresoftware.b4a.keywords.Common.PerYToCurrent((float) (16),mostCurrent.activityBA),anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (25),mostCurrent.activityBA),anywheresoftware.b4a.keywords.Common.PerYToCurrent((float) (10),mostCurrent.activityBA));
RDebugUtils.currentLine=131139;
 //BA.debugLineNum = 131139;BA.debugLine="length_p.AddView(convert_length_b, 25%x, 35%y, 30";
mostCurrent._length_p.AddView((android.view.View)(mostCurrent._convert_length_b.getObject()),anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (25),mostCurrent.activityBA),anywheresoftware.b4a.keywords.Common.PerYToCurrent((float) (35),mostCurrent.activityBA),anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (30),mostCurrent.activityBA),anywheresoftware.b4a.keywords.Common.PerYToCurrent((float) (15),mostCurrent.activityBA));
RDebugUtils.currentLine=131141;
 //BA.debugLineNum = 131141;BA.debugLine="convert_length_b.Text=\"Convert\"";
mostCurrent._convert_length_b.setText(BA.ObjectToCharSequence("Convert"));
RDebugUtils.currentLine=131142;
 //BA.debugLineNum = 131142;BA.debugLine="item_list1.Add(\"Inch\")";
mostCurrent._item_list1.Add((Object)("Inch"));
RDebugUtils.currentLine=131143;
 //BA.debugLineNum = 131143;BA.debugLine="item_list1.Add(\"Foot\")";
mostCurrent._item_list1.Add((Object)("Foot"));
RDebugUtils.currentLine=131144;
 //BA.debugLineNum = 131144;BA.debugLine="item_list1.Add(\"Yard\")";
mostCurrent._item_list1.Add((Object)("Yard"));
RDebugUtils.currentLine=131145;
 //BA.debugLineNum = 131145;BA.debugLine="item_list1.Add(\"Mile\")";
mostCurrent._item_list1.Add((Object)("Mile"));
RDebugUtils.currentLine=131146;
 //BA.debugLineNum = 131146;BA.debugLine="menu_imp.SetItems(item_list1)";
mostCurrent._menu_imp.SetItems(processBA,mostCurrent._item_list1);
RDebugUtils.currentLine=131148;
 //BA.debugLineNum = 131148;BA.debugLine="item_list2.Add(\"Km\")";
mostCurrent._item_list2.Add((Object)("Km"));
RDebugUtils.currentLine=131149;
 //BA.debugLineNum = 131149;BA.debugLine="item_list2.Add(\"Metre\")";
mostCurrent._item_list2.Add((Object)("Metre"));
RDebugUtils.currentLine=131150;
 //BA.debugLineNum = 131150;BA.debugLine="menu_metre.SetItems(item_list2)";
mostCurrent._menu_metre.SetItems(processBA,mostCurrent._item_list2);
RDebugUtils.currentLine=131152;
 //BA.debugLineNum = 131152;BA.debugLine="menu_imp.TextColor = Colors.Black";
mostCurrent._menu_imp.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.Black);
RDebugUtils.currentLine=131153;
 //BA.debugLineNum = 131153;BA.debugLine="menu_imp.Color = Colors.White";
mostCurrent._menu_imp.setColor(anywheresoftware.b4a.keywords.Common.Colors.White);
RDebugUtils.currentLine=131154;
 //BA.debugLineNum = 131154;BA.debugLine="menu_metre.TextColor = Colors.Black";
mostCurrent._menu_metre.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.Black);
RDebugUtils.currentLine=131155;
 //BA.debugLineNum = 131155;BA.debugLine="menu_metre.Color = Colors.White";
mostCurrent._menu_metre.setColor(anywheresoftware.b4a.keywords.Common.Colors.White);
RDebugUtils.currentLine=131157;
 //BA.debugLineNum = 131157;BA.debugLine="weight_p.Visible = False";
mostCurrent._weight_p.setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=131158;
 //BA.debugLineNum = 131158;BA.debugLine="length_p.Visible = False";
mostCurrent._length_p.setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=131160;
 //BA.debugLineNum = 131160;BA.debugLine="End Sub";
return "";
}
public static boolean  _activity_keypress(int _keycode) throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(mostCurrent.activityBA, "activity_keypress"))
	return (Boolean) Debug.delegate(mostCurrent.activityBA, "activity_keypress", new Object[] {_keycode});
RDebugUtils.currentLine=327680;
 //BA.debugLineNum = 327680;BA.debugLine="Sub Activity_KeyPress (KeyCode As Int) As Boolean";
RDebugUtils.currentLine=327681;
 //BA.debugLineNum = 327681;BA.debugLine="If KeyCode=KeyCodes.KEYCODE_BACK Then";
if (_keycode==anywheresoftware.b4a.keywords.Common.KeyCodes.KEYCODE_BACK) { 
RDebugUtils.currentLine=327683;
 //BA.debugLineNum = 327683;BA.debugLine="If  start_screen_p.Visible==True Then";
if (mostCurrent._start_screen_p.getVisible()==anywheresoftware.b4a.keywords.Common.True) { 
RDebugUtils.currentLine=327684;
 //BA.debugLineNum = 327684;BA.debugLine="Return False";
if (true) return anywheresoftware.b4a.keywords.Common.False;
 }else {
RDebugUtils.currentLine=327686;
 //BA.debugLineNum = 327686;BA.debugLine="length_p.Visible=False";
mostCurrent._length_p.setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=327687;
 //BA.debugLineNum = 327687;BA.debugLine="weight_p.Visible=False";
mostCurrent._weight_p.setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=327688;
 //BA.debugLineNum = 327688;BA.debugLine="start_screen_p.Visible=True";
mostCurrent._start_screen_p.setVisible(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=327689;
 //BA.debugLineNum = 327689;BA.debugLine="Return True";
if (true) return anywheresoftware.b4a.keywords.Common.True;
 };
 };
RDebugUtils.currentLine=327698;
 //BA.debugLineNum = 327698;BA.debugLine="End Sub";
return false;
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
public static String  _but_length_click() throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(mostCurrent.activityBA, "but_length_click"))
	return (String) Debug.delegate(mostCurrent.activityBA, "but_length_click", null);
RDebugUtils.currentLine=458752;
 //BA.debugLineNum = 458752;BA.debugLine="Sub but_length_Click";
RDebugUtils.currentLine=458753;
 //BA.debugLineNum = 458753;BA.debugLine="start_screen_p.Visible=False";
mostCurrent._start_screen_p.setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=458754;
 //BA.debugLineNum = 458754;BA.debugLine="length_p.Visible=True";
mostCurrent._length_p.setVisible(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=458756;
 //BA.debugLineNum = 458756;BA.debugLine="End Sub";
return "";
}
public static String  _but_weight_click() throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(mostCurrent.activityBA, "but_weight_click"))
	return (String) Debug.delegate(mostCurrent.activityBA, "but_weight_click", null);
RDebugUtils.currentLine=393216;
 //BA.debugLineNum = 393216;BA.debugLine="Sub but_weight_Click";
RDebugUtils.currentLine=393217;
 //BA.debugLineNum = 393217;BA.debugLine="start_screen_p.Visible=False";
mostCurrent._start_screen_p.setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=393218;
 //BA.debugLineNum = 393218;BA.debugLine="weight_p.Visible=True";
mostCurrent._weight_p.setVisible(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=393220;
 //BA.debugLineNum = 393220;BA.debugLine="End Sub";
return "";
}
public static String  _convert_length_b_click() throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(mostCurrent.activityBA, "convert_length_b_click"))
	return (String) Debug.delegate(mostCurrent.activityBA, "convert_length_b_click", null);
double _meter = 0;
double _imp_unit = 0;
double _res1 = 0;
double _res2 = 0;
RDebugUtils.currentLine=524288;
 //BA.debugLineNum = 524288;BA.debugLine="Sub convert_length_b_Click";
RDebugUtils.currentLine=524289;
 //BA.debugLineNum = 524289;BA.debugLine="Dim meter,imp_unit,res1,res2 As Double = 0";
_meter = 0;
_imp_unit = 0;
_res1 = 0;
_res2 = 0;
RDebugUtils.currentLine=524290;
 //BA.debugLineNum = 524290;BA.debugLine="If menu_metre.Text<>\"\" And menu_imp.Text<>\"\" Then";
if ((mostCurrent._menu_metre.getText()).equals("") == false && (mostCurrent._menu_imp.getText()).equals("") == false) { 
RDebugUtils.currentLine=524292;
 //BA.debugLineNum = 524292;BA.debugLine="If ed3.Text <> \"\" Then";
if ((mostCurrent._ed3.getText()).equals("") == false) { 
RDebugUtils.currentLine=524293;
 //BA.debugLineNum = 524293;BA.debugLine="meter=ed3.Text";
_meter = (double)(Double.parseDouble(mostCurrent._ed3.getText()));
RDebugUtils.currentLine=524294;
 //BA.debugLineNum = 524294;BA.debugLine="If menu_metre.Text=\"Km\" Then";
if ((mostCurrent._menu_metre.getText()).equals("Km")) { 
RDebugUtils.currentLine=524295;
 //BA.debugLineNum = 524295;BA.debugLine="meter = meter*1000";
_meter = _meter*1000;
 };
RDebugUtils.currentLine=524297;
 //BA.debugLineNum = 524297;BA.debugLine="If menu_imp.Text=\"Inch\" Then";
if ((mostCurrent._menu_imp.getText()).equals("Inch")) { 
RDebugUtils.currentLine=524298;
 //BA.debugLineNum = 524298;BA.debugLine="res1=meter*39.3700787";
_res1 = _meter*39.3700787;
 };
RDebugUtils.currentLine=524300;
 //BA.debugLineNum = 524300;BA.debugLine="If menu_imp.Text=\"Foot\" Then";
if ((mostCurrent._menu_imp.getText()).equals("Foot")) { 
RDebugUtils.currentLine=524301;
 //BA.debugLineNum = 524301;BA.debugLine="res1=meter*3.2808399";
_res1 = _meter*3.2808399;
 };
RDebugUtils.currentLine=524303;
 //BA.debugLineNum = 524303;BA.debugLine="If menu_imp.Text=\"Yard\" Then";
if ((mostCurrent._menu_imp.getText()).equals("Yard")) { 
RDebugUtils.currentLine=524304;
 //BA.debugLineNum = 524304;BA.debugLine="res1=meter*1.0936133";
_res1 = _meter*1.0936133;
 };
RDebugUtils.currentLine=524306;
 //BA.debugLineNum = 524306;BA.debugLine="If menu_imp.Text=\"Mile\" Then";
if ((mostCurrent._menu_imp.getText()).equals("Mile")) { 
RDebugUtils.currentLine=524307;
 //BA.debugLineNum = 524307;BA.debugLine="res1=meter*0.000621371192";
_res1 = _meter*0.000621371192;
 };
 };
RDebugUtils.currentLine=524311;
 //BA.debugLineNum = 524311;BA.debugLine="If ed4.Text <> \"\" Then";
if ((mostCurrent._ed4.getText()).equals("") == false) { 
RDebugUtils.currentLine=524312;
 //BA.debugLineNum = 524312;BA.debugLine="imp_unit=ed4.Text";
_imp_unit = (double)(Double.parseDouble(mostCurrent._ed4.getText()));
RDebugUtils.currentLine=524314;
 //BA.debugLineNum = 524314;BA.debugLine="If menu_metre.Text=\"Km\" Then";
if ((mostCurrent._menu_metre.getText()).equals("Km")) { 
RDebugUtils.currentLine=524315;
 //BA.debugLineNum = 524315;BA.debugLine="imp_unit = imp_unit/1000";
_imp_unit = _imp_unit/(double)1000;
 };
RDebugUtils.currentLine=524317;
 //BA.debugLineNum = 524317;BA.debugLine="If menu_imp.Text=\"Inch\" Then";
if ((mostCurrent._menu_imp.getText()).equals("Inch")) { 
RDebugUtils.currentLine=524318;
 //BA.debugLineNum = 524318;BA.debugLine="res2=imp_unit/39.3700787";
_res2 = _imp_unit/(double)39.3700787;
 };
RDebugUtils.currentLine=524320;
 //BA.debugLineNum = 524320;BA.debugLine="If menu_imp.Text=\"Foot\" Then";
if ((mostCurrent._menu_imp.getText()).equals("Foot")) { 
RDebugUtils.currentLine=524321;
 //BA.debugLineNum = 524321;BA.debugLine="res2=imp_unit/3.2808399";
_res2 = _imp_unit/(double)3.2808399;
 };
RDebugUtils.currentLine=524323;
 //BA.debugLineNum = 524323;BA.debugLine="If menu_imp.Text=\"Yard\" Then";
if ((mostCurrent._menu_imp.getText()).equals("Yard")) { 
RDebugUtils.currentLine=524324;
 //BA.debugLineNum = 524324;BA.debugLine="res2=imp_unit/1.0936133";
_res2 = _imp_unit/(double)1.0936133;
 };
RDebugUtils.currentLine=524326;
 //BA.debugLineNum = 524326;BA.debugLine="If menu_imp.Text=\"Mile\" Then";
if ((mostCurrent._menu_imp.getText()).equals("Mile")) { 
RDebugUtils.currentLine=524327;
 //BA.debugLineNum = 524327;BA.debugLine="res2=imp_unit/0.000621371192";
_res2 = _imp_unit/(double)0.000621371192;
 };
 };
RDebugUtils.currentLine=524334;
 //BA.debugLineNum = 524334;BA.debugLine="Msgbox(menu_metre.Text & \" to \" & menu_imp.Text";
anywheresoftware.b4a.keywords.Common.Msgbox(BA.ObjectToCharSequence(mostCurrent._menu_metre.getText()+" to "+mostCurrent._menu_imp.getText()+": "+BA.NumberToString(_res1)+anywheresoftware.b4a.keywords.Common.CRLF+mostCurrent._menu_imp.getText()+" to  "+mostCurrent._menu_metre.getText()+": "+BA.NumberToString(_res2)),BA.ObjectToCharSequence("conversion"),mostCurrent.activityBA);
 };
RDebugUtils.currentLine=524337;
 //BA.debugLineNum = 524337;BA.debugLine="If menu_metre.Text=\"\" Or menu_imp.Text=\"\" Then";
if ((mostCurrent._menu_metre.getText()).equals("") || (mostCurrent._menu_imp.getText()).equals("")) { 
RDebugUtils.currentLine=524338;
 //BA.debugLineNum = 524338;BA.debugLine="Msgbox(\"Please choose units from the dropdown me";
anywheresoftware.b4a.keywords.Common.Msgbox(BA.ObjectToCharSequence("Please choose units from the dropdown menu!!! "),BA.ObjectToCharSequence("Opps"),mostCurrent.activityBA);
 };
RDebugUtils.currentLine=524341;
 //BA.debugLineNum = 524341;BA.debugLine="End Sub";
return "";
}
public static String  _convert_weight_b_click() throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(mostCurrent.activityBA, "convert_weight_b_click"))
	return (String) Debug.delegate(mostCurrent.activityBA, "convert_weight_b_click", null);
double _kg = 0;
double _lbs = 0;
double _res1 = 0;
double _res2 = 0;
RDebugUtils.currentLine=589824;
 //BA.debugLineNum = 589824;BA.debugLine="Sub convert_weight_b_Click";
RDebugUtils.currentLine=589825;
 //BA.debugLineNum = 589825;BA.debugLine="Dim kg,lbs,res1,res2 As Double = 0";
_kg = 0;
_lbs = 0;
_res1 = 0;
_res2 = 0;
RDebugUtils.currentLine=589827;
 //BA.debugLineNum = 589827;BA.debugLine="If ed1.Text<>\"\" Then";
if ((mostCurrent._ed1.getText()).equals("") == false) { 
RDebugUtils.currentLine=589828;
 //BA.debugLineNum = 589828;BA.debugLine="kg=ed1.Text";
_kg = (double)(Double.parseDouble(mostCurrent._ed1.getText()));
RDebugUtils.currentLine=589829;
 //BA.debugLineNum = 589829;BA.debugLine="res1=kg*2.20462262";
_res1 = _kg*2.20462262;
 };
RDebugUtils.currentLine=589831;
 //BA.debugLineNum = 589831;BA.debugLine="If ed2.Text<>\"\" Then";
if ((mostCurrent._ed2.getText()).equals("") == false) { 
RDebugUtils.currentLine=589832;
 //BA.debugLineNum = 589832;BA.debugLine="lbs=ed2.Text";
_lbs = (double)(Double.parseDouble(mostCurrent._ed2.getText()));
RDebugUtils.currentLine=589833;
 //BA.debugLineNum = 589833;BA.debugLine="res2=lbs/2.20462262";
_res2 = _lbs/(double)2.20462262;
 };
RDebugUtils.currentLine=589835;
 //BA.debugLineNum = 589835;BA.debugLine="Msgbox(\"kg to lbs: \" & res1 & CRLF & \"lbs to kg:";
anywheresoftware.b4a.keywords.Common.Msgbox(BA.ObjectToCharSequence("kg to lbs: "+BA.NumberToString(_res1)+anywheresoftware.b4a.keywords.Common.CRLF+"lbs to kg: "+BA.NumberToString(_res2)),BA.ObjectToCharSequence("conversion"),mostCurrent.activityBA);
RDebugUtils.currentLine=589836;
 //BA.debugLineNum = 589836;BA.debugLine="End Sub";
return "";
}
}