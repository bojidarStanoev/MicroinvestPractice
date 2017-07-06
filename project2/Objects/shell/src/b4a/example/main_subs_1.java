package b4a.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class main_subs_1 {


public static RemoteObject  _activity_create(RemoteObject _firsttime) throws Exception{
try {
		Debug.PushSubsStack("Activity_Create (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,27);
if (RapidSub.canDelegate("activity_create")) return b4a.example.main.remoteMe.runUserSub(false, "main","activity_create", _firsttime);
RemoteObject _i = RemoteObject.createImmutable(0);
Debug.locals.put("FirstTime", _firsttime);
 BA.debugLineNum = 27;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
Debug.ShouldStop(67108864);
 BA.debugLineNum = 31;BA.debugLine="Dim i As Int";
Debug.ShouldStop(1073741824);
_i = RemoteObject.createImmutable(0);Debug.locals.put("i", _i);
 BA.debugLineNum = 35;BA.debugLine="For i = 0 To 15";
Debug.ShouldStop(4);
{
final int step2 = 1;
final int limit2 = 15;
_i = BA.numberCast(int.class, 0) ;
for (;(step2 > 0 && _i.<Integer>get().intValue() <= limit2) || (step2 < 0 && _i.<Integer>get().intValue() >= limit2) ;_i = RemoteObject.createImmutable((int)(0 + _i.<Integer>get().intValue() + step2))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 36;BA.debugLine="Buttons(i).Initialize(\"Buttons\")";
Debug.ShouldStop(8);
main.mostCurrent._buttons.getArrayElement(false,_i).runVoidMethod ("Initialize",main.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("Buttons")));
 BA.debugLineNum = 37;BA.debugLine="If row>5 Then";
Debug.ShouldStop(16);
if (RemoteObject.solveBoolean(">",main._row,BA.numberCast(double.class, 5))) { 
 BA.debugLineNum = 38;BA.debugLine="row = 0";
Debug.ShouldStop(32);
main._row = BA.numberCast(int.class, 0);
 BA.debugLineNum = 39;BA.debugLine="col = col+1";
Debug.ShouldStop(64);
main._col = RemoteObject.solve(new RemoteObject[] {main._col,RemoteObject.createImmutable(1)}, "+",1, 1);
 };
 BA.debugLineNum = 41;BA.debugLine="Activity.AddView(Buttons(i),col * 64dip, row  *";
Debug.ShouldStop(256);
main.mostCurrent._activity.runVoidMethod ("AddView",(Object)((main.mostCurrent._buttons.getArrayElement(false,_i).getObject())),(Object)(RemoteObject.solve(new RemoteObject[] {main._col,main.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 64)))}, "*",0, 1)),(Object)(RemoteObject.solve(new RemoteObject[] {main._row,main.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 64)))}, "*",0, 1)),(Object)(main.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 64)))),(Object)(main.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 64)))));
 BA.debugLineNum = 42;BA.debugLine="row = row + 1";
Debug.ShouldStop(512);
main._row = RemoteObject.solve(new RemoteObject[] {main._row,RemoteObject.createImmutable(1)}, "+",1, 1);
 BA.debugLineNum = 43;BA.debugLine="Buttons(i).Tag = i+1";
Debug.ShouldStop(1024);
main.mostCurrent._buttons.getArrayElement(false,_i).runMethod(false,"setTag",(RemoteObject.solve(new RemoteObject[] {_i,RemoteObject.createImmutable(1)}, "+",1, 1)));
 BA.debugLineNum = 44;BA.debugLine="Buttons(i).Text = \"Test \" & (i+1)";
Debug.ShouldStop(2048);
main.mostCurrent._buttons.getArrayElement(false,_i).runMethod(true,"setText",BA.ObjectToCharSequence(RemoteObject.concat(RemoteObject.createImmutable("Test "),(RemoteObject.solve(new RemoteObject[] {_i,RemoteObject.createImmutable(1)}, "+",1, 1)))));
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 47;BA.debugLine="End Sub";
Debug.ShouldStop(16384);
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
		Debug.PushSubsStack("Activity_Pause (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,53);
if (RapidSub.canDelegate("activity_pause")) return b4a.example.main.remoteMe.runUserSub(false, "main","activity_pause", _userclosed);
Debug.locals.put("UserClosed", _userclosed);
 BA.debugLineNum = 53;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
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
public static RemoteObject  _activity_resume() throws Exception{
try {
		Debug.PushSubsStack("Activity_Resume (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,49);
if (RapidSub.canDelegate("activity_resume")) return b4a.example.main.remoteMe.runUserSub(false, "main","activity_resume");
 BA.debugLineNum = 49;BA.debugLine="Sub Activity_Resume";
Debug.ShouldStop(65536);
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
public static RemoteObject  _buttons_click() throws Exception{
try {
		Debug.PushSubsStack("Buttons_Click (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,58);
if (RapidSub.canDelegate("buttons_click")) return b4a.example.main.remoteMe.runUserSub(false, "main","buttons_click");
RemoteObject _temp = RemoteObject.declareNull("anywheresoftware.b4a.objects.ButtonWrapper");
 BA.debugLineNum = 58;BA.debugLine="Sub Buttons_Click";
Debug.ShouldStop(33554432);
 BA.debugLineNum = 60;BA.debugLine="Dim temp As Button";
Debug.ShouldStop(134217728);
_temp = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");Debug.locals.put("temp", _temp);
 BA.debugLineNum = 61;BA.debugLine="temp = Sender";
Debug.ShouldStop(268435456);
_temp.setObject(main.mostCurrent.__c.runMethod(false,"Sender",main.mostCurrent.activityBA));
 BA.debugLineNum = 62;BA.debugLine="Msgbox(\"Button \" &temp.Tag & \" blicked\",\"Clicked\"";
Debug.ShouldStop(536870912);
main.mostCurrent.__c.runVoidMethodAndSync ("Msgbox",(Object)(BA.ObjectToCharSequence(RemoteObject.concat(RemoteObject.createImmutable("Button "),_temp.runMethod(false,"getTag"),RemoteObject.createImmutable(" blicked")))),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("Clicked"))),main.mostCurrent.activityBA);
 BA.debugLineNum = 64;BA.debugLine="End Sub";
Debug.ShouldStop(-2147483648);
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
 //BA.debugLineNum = 23;BA.debugLine="Dim Buttons(16) As Button";
main.mostCurrent._buttons = RemoteObject.createNewArray ("anywheresoftware.b4a.objects.ButtonWrapper", new int[] {16}, new Object[]{});
 //BA.debugLineNum = 24;BA.debugLine="Dim col,row As Int";
main._col = RemoteObject.createImmutable(0);
main._row = RemoteObject.createImmutable(0);
 //BA.debugLineNum = 25;BA.debugLine="End Sub";
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