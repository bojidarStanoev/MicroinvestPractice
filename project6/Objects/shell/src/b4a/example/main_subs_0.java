package b4a.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class main_subs_0 {


public static RemoteObject  _activity_create(RemoteObject _firsttime) throws Exception{
try {
		Debug.PushSubsStack("Activity_Create (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,31);
if (RapidSub.canDelegate("activity_create")) return b4a.example.main.remoteMe.runUserSub(false, "main","activity_create", _firsttime);
int _i = 0;
Debug.locals.put("FirstTime", _firsttime);
 BA.debugLineNum = 31;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
Debug.ShouldStop(1073741824);
 BA.debugLineNum = 34;BA.debugLine="For i=0 To 5";
Debug.ShouldStop(2);
{
final int step1 = 1;
final int limit1 = 5;
_i = 0 ;
for (;(step1 > 0 && _i <= limit1) || (step1 < 0 && _i >= limit1) ;_i = ((int)(0 + _i + step1))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 35;BA.debugLine="but(i).Initialize(\"button\")";
Debug.ShouldStop(4);
main.mostCurrent._but.getArrayElement(false,BA.numberCast(int.class, _i)).runVoidMethod ("Initialize",main.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("button")));
 BA.debugLineNum = 36;BA.debugLine="If col > 2 Then";
Debug.ShouldStop(8);
if (RemoteObject.solveBoolean(">",main._col,BA.numberCast(double.class, 2))) { 
 BA.debugLineNum = 37;BA.debugLine="row=row+1";
Debug.ShouldStop(16);
main._row = RemoteObject.solve(new RemoteObject[] {main._row,RemoteObject.createImmutable(1)}, "+",1, 1);
 BA.debugLineNum = 38;BA.debugLine="col = 0";
Debug.ShouldStop(32);
main._col = BA.numberCast(int.class, 0);
 };
 BA.debugLineNum = 40;BA.debugLine="Activity.AddView(but(i),(col*64dip + 8%x )+ 16%x";
Debug.ShouldStop(128);
main.mostCurrent._activity.runVoidMethod ("AddView",(Object)((main.mostCurrent._but.getArrayElement(false,BA.numberCast(int.class, _i)).getObject())),(Object)(RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {main._col,main.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 64))),main.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 8)),main.mostCurrent.activityBA)}, "*+",1, 1)),main.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 16)),main.mostCurrent.activityBA)}, "+",1, 1)),(Object)(RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {main._row,main.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 80))),main.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 12)),main.mostCurrent.activityBA)}, "*+",1, 1)),main.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 30)),main.mostCurrent.activityBA)}, "+",1, 1)),(Object)(main.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 64)))),(Object)(main.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 64)))));
 BA.debugLineNum = 41;BA.debugLine="but(i).Tag=i + 1";
Debug.ShouldStop(256);
main.mostCurrent._but.getArrayElement(false,BA.numberCast(int.class, _i)).runMethod(false,"setTag",(RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(_i),RemoteObject.createImmutable(1)}, "+",1, 1)));
 BA.debugLineNum = 42;BA.debugLine="col=col+1";
Debug.ShouldStop(512);
main._col = RemoteObject.solve(new RemoteObject[] {main._col,RemoteObject.createImmutable(1)}, "+",1, 1);
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 44;BA.debugLine="End Sub";
Debug.ShouldStop(2048);
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
		Debug.PushSubsStack("Activity_Pause (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,50);
if (RapidSub.canDelegate("activity_pause")) return b4a.example.main.remoteMe.runUserSub(false, "main","activity_pause", _userclosed);
Debug.locals.put("UserClosed", _userclosed);
 BA.debugLineNum = 50;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
Debug.ShouldStop(131072);
 BA.debugLineNum = 52;BA.debugLine="End Sub";
Debug.ShouldStop(524288);
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
		Debug.PushSubsStack("Activity_Resume (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,46);
if (RapidSub.canDelegate("activity_resume")) return b4a.example.main.remoteMe.runUserSub(false, "main","activity_resume");
 BA.debugLineNum = 46;BA.debugLine="Sub Activity_Resume";
Debug.ShouldStop(8192);
 BA.debugLineNum = 48;BA.debugLine="End Sub";
Debug.ShouldStop(32768);
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
		Debug.PushSubsStack("Button_click (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,54);
if (RapidSub.canDelegate("button_click")) return b4a.example.main.remoteMe.runUserSub(false, "main","button_click");
 BA.debugLineNum = 54;BA.debugLine="Sub Button_click";
Debug.ShouldStop(2097152);
 BA.debugLineNum = 55;BA.debugLine="temp= Sender";
Debug.ShouldStop(4194304);
main.mostCurrent._temp.setObject(main.mostCurrent.__c.runMethod(false,"Sender",main.mostCurrent.activityBA));
 BA.debugLineNum = 56;BA.debugLine="red=Rnd(0,255)";
Debug.ShouldStop(8388608);
main._red = main.mostCurrent.__c.runMethod(true,"Rnd",(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 255)));
 BA.debugLineNum = 57;BA.debugLine="green=Rnd(0,255)";
Debug.ShouldStop(16777216);
main._green = main.mostCurrent.__c.runMethod(true,"Rnd",(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 255)));
 BA.debugLineNum = 58;BA.debugLine="blue=Rnd(0,255)";
Debug.ShouldStop(33554432);
main._blue = main.mostCurrent.__c.runMethod(true,"Rnd",(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 255)));
 BA.debugLineNum = 59;BA.debugLine="temp.Color=Colors.RGB(red,green,blue)";
Debug.ShouldStop(67108864);
main.mostCurrent._temp.runVoidMethod ("setColor",main.mostCurrent.__c.getField(false,"Colors").runMethod(true,"RGB",(Object)(main._red),(Object)(main._green),(Object)(main._blue)));
 BA.debugLineNum = 60;BA.debugLine="temp.Text=temp.Tag";
Debug.ShouldStop(134217728);
main.mostCurrent._temp.runMethod(true,"setText",BA.ObjectToCharSequence(main.mostCurrent._temp.runMethod(false,"getTag")));
 BA.debugLineNum = 62;BA.debugLine="End Sub";
Debug.ShouldStop(536870912);
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
 //BA.debugLineNum = 25;BA.debugLine="Dim but(6) As Button";
main.mostCurrent._but = RemoteObject.createNewArray ("anywheresoftware.b4a.objects.ButtonWrapper", new int[] {6}, new Object[]{});
 //BA.debugLineNum = 26;BA.debugLine="Dim col,row As Int";
main._col = RemoteObject.createImmutable(0);
main._row = RemoteObject.createImmutable(0);
 //BA.debugLineNum = 27;BA.debugLine="Dim temp As Button";
main.mostCurrent._temp = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 28;BA.debugLine="Dim red,green,blue As Int";
main._red = RemoteObject.createImmutable(0);
main._green = RemoteObject.createImmutable(0);
main._blue = RemoteObject.createImmutable(0);
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