package b4a.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class main_subs_0 {


public static RemoteObject  _activity_create(RemoteObject _firsttime) throws Exception{
try {
		Debug.PushSubsStack("Activity_Create (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,30);
if (RapidSub.canDelegate("activity_create")) return b4a.example.main.remoteMe.runUserSub(false, "main","activity_create", _firsttime);
int _i = 0;
Debug.locals.put("FirstTime", _firsttime);
 BA.debugLineNum = 30;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
Debug.ShouldStop(536870912);
 BA.debugLineNum = 35;BA.debugLine="For i=0 To 8";
Debug.ShouldStop(4);
{
final int step1 = 1;
final int limit1 = 8;
_i = 0 ;
for (;(step1 > 0 && _i <= limit1) || (step1 < 0 && _i >= limit1) ;_i = ((int)(0 + _i + step1))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 36;BA.debugLine="If row>3 Then";
Debug.ShouldStop(8);
if (RemoteObject.solveBoolean(">",main._row,BA.numberCast(double.class, 3))) { 
 BA.debugLineNum = 37;BA.debugLine="row = 0";
Debug.ShouldStop(16);
main._row = BA.numberCast(int.class, 0);
 BA.debugLineNum = 38;BA.debugLine="col = col + 1";
Debug.ShouldStop(32);
main._col = RemoteObject.solve(new RemoteObject[] {main._col,RemoteObject.createImmutable(1)}, "+",1, 1);
 };
 BA.debugLineNum = 40;BA.debugLine="img(j).Initialize(\"Image\")";
Debug.ShouldStop(128);
main.mostCurrent._img.getArrayElement(false,main._j).runVoidMethod ("Initialize",main.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("Image")));
 BA.debugLineNum = 41;BA.debugLine="panel(i).Initialize(\"Panel\")";
Debug.ShouldStop(256);
main.mostCurrent._panel.getArrayElement(false,BA.numberCast(int.class, _i)).runVoidMethod ("Initialize",main.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("Panel")));
 BA.debugLineNum = 42;BA.debugLine="Activity.AddView(panel(i), (row*60dip) + 5dip, (";
Debug.ShouldStop(512);
main.mostCurrent._activity.runVoidMethod ("AddView",(Object)((main.mostCurrent._panel.getArrayElement(false,BA.numberCast(int.class, _i)).getObject())),(Object)(RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {main._row,main.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 60)))}, "*",0, 1)),main.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 5)))}, "+",1, 1)),(Object)(RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {main._col,main.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 60)))}, "*",0, 1)),main.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 5)))}, "+",1, 1)),(Object)(main.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 60)))),(Object)(main.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 60)))));
 BA.debugLineNum = 43;BA.debugLine="row = row + 1";
Debug.ShouldStop(1024);
main._row = RemoteObject.solve(new RemoteObject[] {main._row,RemoteObject.createImmutable(1)}, "+",1, 1);
 BA.debugLineNum = 44;BA.debugLine="If j < 3 Then";
Debug.ShouldStop(2048);
if (RemoteObject.solveBoolean("<",main._j,BA.numberCast(double.class, 3))) { 
 BA.debugLineNum = 45;BA.debugLine="img(j).Bitmap=LoadBitmap(File.DirAssets, \"flowe";
Debug.ShouldStop(4096);
main.mostCurrent._img.getArrayElement(false,main._j).runMethod(false,"setBitmap",(main.mostCurrent.__c.runMethod(false,"LoadBitmap",(Object)(main.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(RemoteObject.createImmutable("flower.jpg"))).getObject()));
 };
 BA.debugLineNum = 47;BA.debugLine="If j>2 And j<6 Then";
Debug.ShouldStop(16384);
if (RemoteObject.solveBoolean(">",main._j,BA.numberCast(double.class, 2)) && RemoteObject.solveBoolean("<",main._j,BA.numberCast(double.class, 6))) { 
 BA.debugLineNum = 48;BA.debugLine="img(j).Bitmap=LoadBitmap(File.DirAssets, \"meow.";
Debug.ShouldStop(32768);
main.mostCurrent._img.getArrayElement(false,main._j).runMethod(false,"setBitmap",(main.mostCurrent.__c.runMethod(false,"LoadBitmap",(Object)(main.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(RemoteObject.createImmutable("meow.jpg"))).getObject()));
 };
 BA.debugLineNum = 50;BA.debugLine="If j>5 Then";
Debug.ShouldStop(131072);
if (RemoteObject.solveBoolean(">",main._j,BA.numberCast(double.class, 5))) { 
 BA.debugLineNum = 51;BA.debugLine="img(j).Bitmap=LoadBitmap(File.DirAssets, \"parap";
Debug.ShouldStop(262144);
main.mostCurrent._img.getArrayElement(false,main._j).runMethod(false,"setBitmap",(main.mostCurrent.__c.runMethod(false,"LoadBitmap",(Object)(main.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(RemoteObject.createImmutable("parapluie.jpg"))).getObject()));
 };
 BA.debugLineNum = 53;BA.debugLine="panel(i).AddView(img(j),10dip, 10dip, 130dip, 20";
Debug.ShouldStop(1048576);
main.mostCurrent._panel.getArrayElement(false,BA.numberCast(int.class, _i)).runVoidMethod ("AddView",(Object)((main.mostCurrent._img.getArrayElement(false,main._j).getObject())),(Object)(main.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 10)))),(Object)(main.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 10)))),(Object)(main.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 130)))),(Object)(main.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 200)))));
 BA.debugLineNum = 54;BA.debugLine="j = j + 1";
Debug.ShouldStop(2097152);
main._j = RemoteObject.solve(new RemoteObject[] {main._j,RemoteObject.createImmutable(1)}, "+",1, 1);
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 68;BA.debugLine="End Sub";
Debug.ShouldStop(8);
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
		Debug.PushSubsStack("Activity_Pause (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,74);
if (RapidSub.canDelegate("activity_pause")) return b4a.example.main.remoteMe.runUserSub(false, "main","activity_pause", _userclosed);
Debug.locals.put("UserClosed", _userclosed);
 BA.debugLineNum = 74;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
Debug.ShouldStop(512);
 BA.debugLineNum = 76;BA.debugLine="End Sub";
Debug.ShouldStop(2048);
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
		Debug.PushSubsStack("Activity_Resume (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,70);
if (RapidSub.canDelegate("activity_resume")) return b4a.example.main.remoteMe.runUserSub(false, "main","activity_resume");
 BA.debugLineNum = 70;BA.debugLine="Sub Activity_Resume";
Debug.ShouldStop(32);
 BA.debugLineNum = 72;BA.debugLine="End Sub";
Debug.ShouldStop(128);
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
 //BA.debugLineNum = 24;BA.debugLine="Dim panel(9) As Panel";
main.mostCurrent._panel = RemoteObject.createNewArray ("anywheresoftware.b4a.objects.PanelWrapper", new int[] {9}, new Object[]{});
 //BA.debugLineNum = 25;BA.debugLine="Dim img(9) As ImageView";
main.mostCurrent._img = RemoteObject.createNewArray ("anywheresoftware.b4a.objects.ImageViewWrapper", new int[] {9}, new Object[]{});
 //BA.debugLineNum = 26;BA.debugLine="Dim col, row As Int";
main._col = RemoteObject.createImmutable(0);
main._row = RemoteObject.createImmutable(0);
 //BA.debugLineNum = 27;BA.debugLine="Dim j As Int = 0";
main._j = BA.numberCast(int.class, 0);
 //BA.debugLineNum = 28;BA.debugLine="End Sub";
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