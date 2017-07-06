package b4a.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class main_subs_1 {


public static RemoteObject  _activity_create(RemoteObject _firsttime) throws Exception{
try {
		Debug.PushSubsStack("Activity_Create (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,28);
if (RapidSub.canDelegate("activity_create")) return b4a.example.main.remoteMe.runUserSub(false, "main","activity_create", _firsttime);
RemoteObject _i = RemoteObject.createImmutable(0);
Debug.locals.put("FirstTime", _firsttime);
 BA.debugLineNum = 28;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
Debug.ShouldStop(134217728);
 BA.debugLineNum = 32;BA.debugLine="Dim i As Int";
Debug.ShouldStop(-2147483648);
_i = RemoteObject.createImmutable(0);Debug.locals.put("i", _i);
 BA.debugLineNum = 35;BA.debugLine="OkButton.Initialize(\"\")";
Debug.ShouldStop(4);
main.mostCurrent._okbutton.runVoidMethod ("Initialize",main.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 36;BA.debugLine="For i = 0 To 9";
Debug.ShouldStop(8);
{
final int step3 = 1;
final int limit3 = 9;
_i = BA.numberCast(int.class, 0) ;
for (;(step3 > 0 && _i.<Integer>get().intValue() <= limit3) || (step3 < 0 && _i.<Integer>get().intValue() >= limit3) ;_i = RemoteObject.createImmutable((int)(0 + _i.<Integer>get().intValue() + step3))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 37;BA.debugLine="Buttons(i).Initialize(\"Buttons\")";
Debug.ShouldStop(16);
main.mostCurrent._buttons.getArrayElement(false,_i).runVoidMethod ("Initialize",main.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("Buttons")));
 BA.debugLineNum = 38;BA.debugLine="If row>4 Then";
Debug.ShouldStop(32);
if (RemoteObject.solveBoolean(">",main._row,BA.numberCast(double.class, 4))) { 
 BA.debugLineNum = 39;BA.debugLine="col = col+1";
Debug.ShouldStop(64);
main._col = RemoteObject.solve(new RemoteObject[] {main._col,RemoteObject.createImmutable(1)}, "+",1, 1);
 BA.debugLineNum = 40;BA.debugLine="row = 0";
Debug.ShouldStop(128);
main._row = BA.numberCast(int.class, 0);
 };
 BA.debugLineNum = 42;BA.debugLine="Activity.AddView(Buttons(i),row * 64dip, 128dip";
Debug.ShouldStop(512);
main.mostCurrent._activity.runVoidMethod ("AddView",(Object)((main.mostCurrent._buttons.getArrayElement(false,_i).getObject())),(Object)(RemoteObject.solve(new RemoteObject[] {main._row,main.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 64)))}, "*",0, 1)),(Object)(RemoteObject.solve(new RemoteObject[] {main.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 128))),(RemoteObject.solve(new RemoteObject[] {main._col,main.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 64)))}, "*",0, 1))}, "+",1, 1)),(Object)(main.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 64)))),(Object)(main.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 64)))));
 BA.debugLineNum = 43;BA.debugLine="row=row+1";
Debug.ShouldStop(1024);
main._row = RemoteObject.solve(new RemoteObject[] {main._row,RemoteObject.createImmutable(1)}, "+",1, 1);
 BA.debugLineNum = 44;BA.debugLine="Buttons(i).Tag = i+1";
Debug.ShouldStop(2048);
main.mostCurrent._buttons.getArrayElement(false,_i).runMethod(false,"setTag",(RemoteObject.solve(new RemoteObject[] {_i,RemoteObject.createImmutable(1)}, "+",1, 1)));
 BA.debugLineNum = 45;BA.debugLine="Buttons(i).Text = (i+1)";
Debug.ShouldStop(4096);
main.mostCurrent._buttons.getArrayElement(false,_i).runMethod(true,"setText",BA.ObjectToCharSequence((RemoteObject.solve(new RemoteObject[] {_i,RemoteObject.createImmutable(1)}, "+",1, 1))));
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 47;BA.debugLine="Activity.AddView(OkButton, 192dip, 64dip, 64dip,";
Debug.ShouldStop(16384);
main.mostCurrent._activity.runVoidMethod ("AddView",(Object)((main.mostCurrent._okbutton.getObject())),(Object)(main.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 192)))),(Object)(main.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 64)))),(Object)(main.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 64)))),(Object)(main.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 64)))));
 BA.debugLineNum = 49;BA.debugLine="End Sub";
Debug.ShouldStop(65536);
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
		Debug.PushSubsStack("Activity_Pause (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,55);
if (RapidSub.canDelegate("activity_pause")) return b4a.example.main.remoteMe.runUserSub(false, "main","activity_pause", _userclosed);
Debug.locals.put("UserClosed", _userclosed);
 BA.debugLineNum = 55;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
Debug.ShouldStop(4194304);
 BA.debugLineNum = 57;BA.debugLine="End Sub";
Debug.ShouldStop(16777216);
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
		Debug.PushSubsStack("Activity_Resume (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,51);
if (RapidSub.canDelegate("activity_resume")) return b4a.example.main.remoteMe.runUserSub(false, "main","activity_resume");
 BA.debugLineNum = 51;BA.debugLine="Sub Activity_Resume";
Debug.ShouldStop(262144);
 BA.debugLineNum = 53;BA.debugLine="End Sub";
Debug.ShouldStop(1048576);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _buttons_click() throws Exception{
try {
		Debug.PushSubsStack("Buttons_Click (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,60);
if (RapidSub.canDelegate("buttons_click")) return b4a.example.main.remoteMe.runUserSub(false, "main","buttons_click");
RemoteObject _temp = RemoteObject.declareNull("anywheresoftware.b4a.objects.ButtonWrapper");
 BA.debugLineNum = 60;BA.debugLine="Sub Buttons_Click";
Debug.ShouldStop(134217728);
 BA.debugLineNum = 62;BA.debugLine="Dim temp As Button";
Debug.ShouldStop(536870912);
_temp = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");Debug.locals.put("temp", _temp);
 BA.debugLineNum = 63;BA.debugLine="temp = Sender";
Debug.ShouldStop(1073741824);
_temp.setObject(main.mostCurrent.__c.runMethod(false,"Sender",main.mostCurrent.activityBA));
 BA.debugLineNum = 64;BA.debugLine="Msgbox(\"Button \" &temp.Tag & \" blicked\",\"Clicked\"";
Debug.ShouldStop(-2147483648);
main.mostCurrent.__c.runVoidMethodAndSync ("Msgbox",(Object)(BA.ObjectToCharSequence(RemoteObject.concat(RemoteObject.createImmutable("Button "),_temp.runMethod(false,"getTag"),RemoteObject.createImmutable(" blicked")))),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("Clicked"))),main.mostCurrent.activityBA);
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
 //BA.debugLineNum = 20;BA.debugLine="Sub Globals";
 //BA.debugLineNum = 23;BA.debugLine="Dim Buttons(10) As Button";
main.mostCurrent._buttons = RemoteObject.createNewArray ("anywheresoftware.b4a.objects.ButtonWrapper", new int[] {10}, new Object[]{});
 //BA.debugLineNum = 24;BA.debugLine="Dim col,row As Int";
main._col = RemoteObject.createImmutable(0);
main._row = RemoteObject.createImmutable(0);
 //BA.debugLineNum = 25;BA.debugLine="Dim OkButton As Button";
main.mostCurrent._okbutton = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 26;BA.debugLine="End Sub";
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
 //BA.debugLineNum = 18;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
}