package b4a.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class main_subs_1 {


public static RemoteObject  _activity_create(RemoteObject _firsttime) throws Exception{
try {
		Debug.PushSubsStack("Activity_Create (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,31);
if (RapidSub.canDelegate("activity_create")) return b4a.example.main.remoteMe.runUserSub(false, "main","activity_create", _firsttime);
Debug.locals.put("FirstTime", _firsttime);
 BA.debugLineNum = 31;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
Debug.ShouldStop(1073741824);
 BA.debugLineNum = 34;BA.debugLine="LAB.Initialize(\"d\")";
Debug.ShouldStop(2);
main.mostCurrent._lab.runVoidMethod ("Initialize",main.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("d")));
 BA.debugLineNum = 35;BA.debugLine="but1.Initialize(\"Button\")";
Debug.ShouldStop(4);
main.mostCurrent._but1.runVoidMethod ("Initialize",main.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("Button")));
 BA.debugLineNum = 36;BA.debugLine="ed.Initialize(\"s\")";
Debug.ShouldStop(8);
main.mostCurrent._ed.runVoidMethod ("Initialize",main.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("s")));
 BA.debugLineNum = 37;BA.debugLine="LAB.Enabled=False";
Debug.ShouldStop(16);
main.mostCurrent._lab.runMethod(true,"setEnabled",main.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 38;BA.debugLine="but1.Text=\"Enter\"";
Debug.ShouldStop(32);
main.mostCurrent._but1.runMethod(true,"setText",BA.ObjectToCharSequence("Enter"));
 BA.debugLineNum = 39;BA.debugLine="Activity.AddView(LAB, 160dip, 10dip, 128dip, 360d";
Debug.ShouldStop(64);
main.mostCurrent._activity.runVoidMethod ("AddView",(Object)((main.mostCurrent._lab.getObject())),(Object)(main.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 160)))),(Object)(main.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 10)))),(Object)(main.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 128)))),(Object)(main.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 360)))));
 BA.debugLineNum = 40;BA.debugLine="Activity.AddView(but1, 60dip, 300dip, 80dip, 48di";
Debug.ShouldStop(128);
main.mostCurrent._activity.runVoidMethod ("AddView",(Object)((main.mostCurrent._but1.getObject())),(Object)(main.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 60)))),(Object)(main.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 300)))),(Object)(main.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 80)))),(Object)(main.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 48)))));
 BA.debugLineNum = 41;BA.debugLine="Activity.AddView(ed, 16dip, 10dip, 128dip, 270dip";
Debug.ShouldStop(256);
main.mostCurrent._activity.runVoidMethod ("AddView",(Object)((main.mostCurrent._ed.getObject())),(Object)(main.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 16)))),(Object)(main.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 10)))),(Object)(main.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 128)))),(Object)(main.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 270)))));
 BA.debugLineNum = 42;BA.debugLine="ed.Color=Colors.RGB(247,249,250)";
Debug.ShouldStop(512);
main.mostCurrent._ed.runVoidMethod ("setColor",main.mostCurrent.__c.getField(false,"Colors").runMethod(true,"RGB",(Object)(BA.numberCast(int.class, 247)),(Object)(BA.numberCast(int.class, 249)),(Object)(BA.numberCast(int.class, 250))));
 BA.debugLineNum = 43;BA.debugLine="ed.TextColor=Colors.RGB(0,0,0)";
Debug.ShouldStop(1024);
main.mostCurrent._ed.runMethod(true,"setTextColor",main.mostCurrent.__c.getField(false,"Colors").runMethod(true,"RGB",(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0))));
 BA.debugLineNum = 44;BA.debugLine="LAB.Color=Colors.RGB(247,249,250)";
Debug.ShouldStop(2048);
main.mostCurrent._lab.runVoidMethod ("setColor",main.mostCurrent.__c.getField(false,"Colors").runMethod(true,"RGB",(Object)(BA.numberCast(int.class, 247)),(Object)(BA.numberCast(int.class, 249)),(Object)(BA.numberCast(int.class, 250))));
 BA.debugLineNum = 45;BA.debugLine="LAB.TextColor=Colors.RGB(0,0,0)";
Debug.ShouldStop(4096);
main.mostCurrent._lab.runMethod(true,"setTextColor",main.mostCurrent.__c.getField(false,"Colors").runMethod(true,"RGB",(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0))));
 BA.debugLineNum = 47;BA.debugLine="ed.Top = 5dip";
Debug.ShouldStop(16384);
main.mostCurrent._ed.runMethod(true,"setTop",main.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 5))));
 BA.debugLineNum = 48;BA.debugLine="ed.Gravity = Gravity.LEFT";
Debug.ShouldStop(32768);
main.mostCurrent._ed.runMethod(true,"setGravity",main.mostCurrent.__c.getField(false,"Gravity").getField(true,"LEFT"));
 BA.debugLineNum = 49;BA.debugLine="LAB.Gravity = Gravity.LEFT";
Debug.ShouldStop(65536);
main.mostCurrent._lab.runMethod(true,"setGravity",main.mostCurrent.__c.getField(false,"Gravity").getField(true,"LEFT"));
 BA.debugLineNum = 51;BA.debugLine="End Sub";
Debug.ShouldStop(262144);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _activity_pause(RemoteObject _userclosed) throws Exception{
try {
		Debug.PushSubsStack("Activity_Pause (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,57);
if (RapidSub.canDelegate("activity_pause")) return b4a.example.main.remoteMe.runUserSub(false, "main","activity_pause", _userclosed);
Debug.locals.put("UserClosed", _userclosed);
 BA.debugLineNum = 57;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
Debug.ShouldStop(16777216);
 BA.debugLineNum = 59;BA.debugLine="End Sub";
Debug.ShouldStop(67108864);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _activity_resume() throws Exception{
try {
		Debug.PushSubsStack("Activity_Resume (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,53);
if (RapidSub.canDelegate("activity_resume")) return b4a.example.main.remoteMe.runUserSub(false, "main","activity_resume");
 BA.debugLineNum = 53;BA.debugLine="Sub Activity_Resume";
Debug.ShouldStop(1048576);
 BA.debugLineNum = 55;BA.debugLine="End Sub";
Debug.ShouldStop(4194304);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _button_click() throws Exception{
try {
		Debug.PushSubsStack("Button_click (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,61);
if (RapidSub.canDelegate("button_click")) return b4a.example.main.remoteMe.runUserSub(false, "main","button_click");
 BA.debugLineNum = 61;BA.debugLine="Sub Button_click";
Debug.ShouldStop(268435456);
 BA.debugLineNum = 63;BA.debugLine="LAB.Text=ed.Text";
Debug.ShouldStop(1073741824);
main.mostCurrent._lab.runMethodAndSync(true,"setText",BA.ObjectToCharSequence(main.mostCurrent._ed.runMethod(true,"getText")));
 BA.debugLineNum = 64;BA.debugLine="LAB.Enabled=True";
Debug.ShouldStop(-2147483648);
main.mostCurrent._lab.runMethod(true,"setEnabled",main.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 66;BA.debugLine="End Sub";
Debug.ShouldStop(2);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _globals() throws Exception{
 //BA.debugLineNum = 21;BA.debugLine="Sub Globals";
 //BA.debugLineNum = 25;BA.debugLine="Dim but1 As Button";
main.mostCurrent._but1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 26;BA.debugLine="Dim LAB As EditText";
main.mostCurrent._lab = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");
 //BA.debugLineNum = 27;BA.debugLine="Dim ed As EditText";
main.mostCurrent._ed = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");
 //BA.debugLineNum = 29;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}

public static void initializeProcessGlobals() {
    
    if (main.processGlobalsRun == false) {
	    main.processGlobalsRun = true;
		try {
		        main_subs_0._process_globals();
starter_subs_0._process_globals();
main.myClass = BA.getDeviceClass ("b4a.example.main");
starter.myClass = BA.getDeviceClass ("b4a.example.starter");
		
        } catch (Exception e) {
			throw new RuntimeException(e);
		}
    }
}public static RemoteObject  _process_globals() throws Exception{
 //BA.debugLineNum = 15;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 19;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
}