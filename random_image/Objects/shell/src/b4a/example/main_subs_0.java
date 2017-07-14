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
 BA.debugLineNum = 33;BA.debugLine="panel1.Initialize(\"panel1\")";
Debug.ShouldStop(1);
main.mostCurrent._panel1.runVoidMethod ("Initialize",main.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("panel1")));
 BA.debugLineNum = 34;BA.debugLine="time.Initialize(\"time\",2000)";
Debug.ShouldStop(2);
main._time.runVoidMethod ("Initialize",main.processBA,(Object)(BA.ObjectToString("time")),(Object)(BA.numberCast(long.class, 2000)));
 BA.debugLineNum = 35;BA.debugLine="time.Enabled=True";
Debug.ShouldStop(4);
main._time.runMethod(true,"setEnabled",main.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 36;BA.debugLine="For i = 0 To 9";
Debug.ShouldStop(8);
{
final int step4 = 1;
final int limit4 = 9;
_i = 0 ;
for (;(step4 > 0 && _i <= limit4) || (step4 < 0 && _i >= limit4) ;_i = ((int)(0 + _i + step4))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 37;BA.debugLine="image(i).Initialize(\"\")";
Debug.ShouldStop(16);
main.mostCurrent._image.getArrayElement(false,BA.numberCast(int.class, _i)).runVoidMethod ("Initialize",main.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 38;BA.debugLine="image(i).Gravity=Gravity.FILL";
Debug.ShouldStop(32);
main.mostCurrent._image.getArrayElement(false,BA.numberCast(int.class, _i)).runMethod(true,"setGravity",main.mostCurrent.__c.getField(false,"Gravity").getField(true,"FILL"));
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 40;BA.debugLine="image(0).Bitmap=LoadBitmap(File.DirAssets,\"nature";
Debug.ShouldStop(128);
main.mostCurrent._image.getArrayElement(false,BA.numberCast(int.class, 0)).runMethod(false,"setBitmap",(main.mostCurrent.__c.runMethod(false,"LoadBitmap",(Object)(main.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(RemoteObject.createImmutable("nature-forest-industry-rails.jpg"))).getObject()));
 BA.debugLineNum = 41;BA.debugLine="image(1).Bitmap=LoadBitmap(File.DirAssets,\"buggat";
Debug.ShouldStop(256);
main.mostCurrent._image.getArrayElement(false,BA.numberCast(int.class, 1)).runMethod(false,"setBitmap",(main.mostCurrent.__c.runMethod(false,"LoadBitmap",(Object)(main.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(RemoteObject.createImmutable("buggati.jpg"))).getObject()));
 BA.debugLineNum = 42;BA.debugLine="image(2).Bitmap=LoadBitmap(File.DirAssets,\"flower";
Debug.ShouldStop(512);
main.mostCurrent._image.getArrayElement(false,BA.numberCast(int.class, 2)).runMethod(false,"setBitmap",(main.mostCurrent.__c.runMethod(false,"LoadBitmap",(Object)(main.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(RemoteObject.createImmutable("flower.jpg"))).getObject()));
 BA.debugLineNum = 43;BA.debugLine="image(3).Bitmap=LoadBitmap(File.DirAssets,\"images";
Debug.ShouldStop(1024);
main.mostCurrent._image.getArrayElement(false,BA.numberCast(int.class, 3)).runMethod(false,"setBitmap",(main.mostCurrent.__c.runMethod(false,"LoadBitmap",(Object)(main.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(RemoteObject.createImmutable("images.jpg"))).getObject()));
 BA.debugLineNum = 44;BA.debugLine="image(4).Bitmap=LoadBitmap(File.DirAssets,\"painte";
Debug.ShouldStop(2048);
main.mostCurrent._image.getArrayElement(false,BA.numberCast(int.class, 4)).runMethod(false,"setBitmap",(main.mostCurrent.__c.runMethod(false,"LoadBitmap",(Object)(main.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(RemoteObject.createImmutable("painted-lady-1568926_960_720.jpg"))).getObject()));
 BA.debugLineNum = 45;BA.debugLine="image(5).Bitmap=LoadBitmap(File.DirAssets,\"parapl";
Debug.ShouldStop(4096);
main.mostCurrent._image.getArrayElement(false,BA.numberCast(int.class, 5)).runMethod(false,"setBitmap",(main.mostCurrent.__c.runMethod(false,"LoadBitmap",(Object)(main.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(RemoteObject.createImmutable("parapluie.jpg"))).getObject()));
 BA.debugLineNum = 46;BA.debugLine="image(6).Bitmap=LoadBitmap(File.DirAssets,\"images";
Debug.ShouldStop(8192);
main.mostCurrent._image.getArrayElement(false,BA.numberCast(int.class, 6)).runMethod(false,"setBitmap",(main.mostCurrent.__c.runMethod(false,"LoadBitmap",(Object)(main.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(RemoteObject.createImmutable("images22.jpg"))).getObject()));
 BA.debugLineNum = 47;BA.debugLine="image(7).Bitmap=LoadBitmap(File.DirAssets,\"forest";
Debug.ShouldStop(16384);
main.mostCurrent._image.getArrayElement(false,BA.numberCast(int.class, 7)).runMethod(false,"setBitmap",(main.mostCurrent.__c.runMethod(false,"LoadBitmap",(Object)(main.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(RemoteObject.createImmutable("forest.jpg"))).getObject()));
 BA.debugLineNum = 48;BA.debugLine="image(8).Bitmap=LoadBitmap(File.DirAssets,\"water.";
Debug.ShouldStop(32768);
main.mostCurrent._image.getArrayElement(false,BA.numberCast(int.class, 8)).runMethod(false,"setBitmap",(main.mostCurrent.__c.runMethod(false,"LoadBitmap",(Object)(main.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(RemoteObject.createImmutable("water.jpg"))).getObject()));
 BA.debugLineNum = 49;BA.debugLine="image(9).Bitmap=LoadBitmap(File.DirAssets,\"meow.j";
Debug.ShouldStop(65536);
main.mostCurrent._image.getArrayElement(false,BA.numberCast(int.class, 9)).runMethod(false,"setBitmap",(main.mostCurrent.__c.runMethod(false,"LoadBitmap",(Object)(main.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(RemoteObject.createImmutable("meow.jpg"))).getObject()));
 BA.debugLineNum = 51;BA.debugLine="Activity.AddView(panel1, 0, 0, 100%x, 100%y)";
Debug.ShouldStop(262144);
main.mostCurrent._activity.runVoidMethod ("AddView",(Object)((main.mostCurrent._panel1.getObject())),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(main.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 100)),main.mostCurrent.activityBA)),(Object)(main.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 100)),main.mostCurrent.activityBA)));
 BA.debugLineNum = 52;BA.debugLine="panel1.AddView(image(1),0,0,100%x,100%y)";
Debug.ShouldStop(524288);
main.mostCurrent._panel1.runVoidMethod ("AddView",(Object)((main.mostCurrent._image.getArrayElement(false,BA.numberCast(int.class, 1)).getObject())),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(main.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 100)),main.mostCurrent.activityBA)),(Object)(main.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 100)),main.mostCurrent.activityBA)));
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
public static RemoteObject  _activity_pause(RemoteObject _userclosed) throws Exception{
try {
		Debug.PushSubsStack("Activity_Pause (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,59);
if (RapidSub.canDelegate("activity_pause")) return b4a.example.main.remoteMe.runUserSub(false, "main","activity_pause", _userclosed);
Debug.locals.put("UserClosed", _userclosed);
 BA.debugLineNum = 59;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
Debug.ShouldStop(67108864);
 BA.debugLineNum = 61;BA.debugLine="End Sub";
Debug.ShouldStop(268435456);
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
		Debug.PushSubsStack("Activity_Resume (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,55);
if (RapidSub.canDelegate("activity_resume")) return b4a.example.main.remoteMe.runUserSub(false, "main","activity_resume");
 BA.debugLineNum = 55;BA.debugLine="Sub Activity_Resume";
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
public static RemoteObject  _globals() throws Exception{
 //BA.debugLineNum = 21;BA.debugLine="Sub Globals";
 //BA.debugLineNum = 24;BA.debugLine="Dim panel1 As Panel";
main.mostCurrent._panel1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
 //BA.debugLineNum = 25;BA.debugLine="Dim image(10) As ImageView";
main.mostCurrent._image = RemoteObject.createNewArray ("anywheresoftware.b4a.objects.ImageViewWrapper", new int[] {10}, new Object[]{});
 //BA.debugLineNum = 26;BA.debugLine="Dim random As Int";
main._random = RemoteObject.createImmutable(0);
 //BA.debugLineNum = 27;BA.debugLine="Dim temp As Boolean = True";
main._temp = main.mostCurrent.__c.getField(true,"True");
 //BA.debugLineNum = 28;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _panel1_click() throws Exception{
try {
		Debug.PushSubsStack("panel1_Click (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,70);
if (RapidSub.canDelegate("panel1_click")) return b4a.example.main.remoteMe.runUserSub(false, "main","panel1_click");
 BA.debugLineNum = 70;BA.debugLine="Sub panel1_Click";
Debug.ShouldStop(32);
 BA.debugLineNum = 71;BA.debugLine="If temp = True Then";
Debug.ShouldStop(64);
if (RemoteObject.solveBoolean("=",main._temp,main.mostCurrent.__c.getField(true,"True"))) { 
 BA.debugLineNum = 72;BA.debugLine="time.Enabled=False";
Debug.ShouldStop(128);
main._time.runMethod(true,"setEnabled",main.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 73;BA.debugLine="temp=False";
Debug.ShouldStop(256);
main._temp = main.mostCurrent.__c.getField(true,"False");
 }else {
 BA.debugLineNum = 75;BA.debugLine="time.Enabled=True";
Debug.ShouldStop(1024);
main._time.runMethod(true,"setEnabled",main.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 76;BA.debugLine="temp=True";
Debug.ShouldStop(2048);
main._temp = main.mostCurrent.__c.getField(true,"True");
 };
 BA.debugLineNum = 80;BA.debugLine="End Sub";
Debug.ShouldStop(32768);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}

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
 //BA.debugLineNum = 18;BA.debugLine="Dim time As Timer";
main._time = RemoteObject.createNew ("anywheresoftware.b4a.objects.Timer");
 //BA.debugLineNum = 19;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _time_tick() throws Exception{
try {
		Debug.PushSubsStack("time_Tick (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,63);
if (RapidSub.canDelegate("time_tick")) return b4a.example.main.remoteMe.runUserSub(false, "main","time_tick");
 BA.debugLineNum = 63;BA.debugLine="Sub time_Tick";
Debug.ShouldStop(1073741824);
 BA.debugLineNum = 65;BA.debugLine="random=Rnd(0,9)";
Debug.ShouldStop(1);
main._random = main.mostCurrent.__c.runMethod(true,"Rnd",(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 9)));
 BA.debugLineNum = 66;BA.debugLine="panel1.AddView(image(random),0,0,100%x,100%y)";
Debug.ShouldStop(2);
main.mostCurrent._panel1.runVoidMethod ("AddView",(Object)((main.mostCurrent._image.getArrayElement(false,main._random).getObject())),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(main.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 100)),main.mostCurrent.activityBA)),(Object)(main.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 100)),main.mostCurrent.activityBA)));
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
}