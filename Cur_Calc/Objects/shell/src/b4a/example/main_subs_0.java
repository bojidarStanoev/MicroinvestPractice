package b4a.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class main_subs_0 {


public static RemoteObject  _activity_create(RemoteObject _firsttime) throws Exception{
try {
		Debug.PushSubsStack("Activity_Create (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,34);
if (RapidSub.canDelegate("activity_create")) return b4a.example.main.remoteMe.runUserSub(false, "main","activity_create", _firsttime);
RemoteObject _i = RemoteObject.createImmutable(0);
RemoteObject _col = RemoteObject.createImmutable(0);
RemoteObject _row = RemoteObject.createImmutable(0);
Debug.locals.put("FirstTime", _firsttime);
 BA.debugLineNum = 34;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
Debug.ShouldStop(2);
 BA.debugLineNum = 37;BA.debugLine="cur1.Initialize(\"\")";
Debug.ShouldStop(16);
main.mostCurrent._cur1.runVoidMethod ("Initialize",main.processBA,(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 38;BA.debugLine="cur2.Initialize(\"\")";
Debug.ShouldStop(32);
main.mostCurrent._cur2.runVoidMethod ("Initialize",main.processBA,(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 39;BA.debugLine="ed1.Initialize(\"\")";
Debug.ShouldStop(64);
main.mostCurrent._ed1.runVoidMethod ("Initialize",main.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 40;BA.debugLine="ed2.Initialize(\"\")";
Debug.ShouldStop(128);
main.mostCurrent._ed2.runVoidMethod ("Initialize",main.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 41;BA.debugLine="p1.Initialize(\"\")";
Debug.ShouldStop(256);
main.mostCurrent._p1.runVoidMethod ("Initialize",main.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 42;BA.debugLine="p2.Initialize(\"\")";
Debug.ShouldStop(512);
main.mostCurrent._p2.runVoidMethod ("Initialize",main.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 43;BA.debugLine="p3.Initialize(\"\")";
Debug.ShouldStop(1024);
main.mostCurrent._p3.runVoidMethod ("Initialize",main.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 44;BA.debugLine="p4.Initialize(\"\")";
Debug.ShouldStop(2048);
main.mostCurrent._p4.runVoidMethod ("Initialize",main.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 45;BA.debugLine="p5.Initialize(\"\")";
Debug.ShouldStop(4096);
main.mostCurrent._p5.runVoidMethod ("Initialize",main.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 46;BA.debugLine="p6.Initialize(\"\")";
Debug.ShouldStop(8192);
main.mostCurrent._p6.runVoidMethod ("Initialize",main.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 47;BA.debugLine="p7.Initialize(\"\")";
Debug.ShouldStop(16384);
main.mostCurrent._p7.runVoidMethod ("Initialize",main.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 48;BA.debugLine="p8.Initialize(\"\")";
Debug.ShouldStop(32768);
main.mostCurrent._p8.runVoidMethod ("Initialize",main.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 49;BA.debugLine="Dim i As Int";
Debug.ShouldStop(65536);
_i = RemoteObject.createImmutable(0);Debug.locals.put("i", _i);
 BA.debugLineNum = 51;BA.debugLine="curr_conv_rate.Initialize(\"\")";
Debug.ShouldStop(262144);
main.mostCurrent._curr_conv_rate.runVoidMethod ("Initialize",main.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 52;BA.debugLine="lb.Initialize(\"\")";
Debug.ShouldStop(524288);
main.mostCurrent._lb.runVoidMethod ("Initialize",main.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 53;BA.debugLine="bu2.Initialize(\"bu2\")";
Debug.ShouldStop(1048576);
main.mostCurrent._bu2.runVoidMethod ("Initialize",main.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("bu2")));
 BA.debugLineNum = 54;BA.debugLine="bu1.Initialize(\"bu1\")";
Debug.ShouldStop(2097152);
main.mostCurrent._bu1.runVoidMethod ("Initialize",main.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("bu1")));
 BA.debugLineNum = 55;BA.debugLine="For i=0 To 6";
Debug.ShouldStop(4194304);
{
final int step18 = 1;
final int limit18 = 6;
_i = BA.numberCast(int.class, 0) ;
for (;(step18 > 0 && _i.<Integer>get().intValue() <= limit18) || (step18 < 0 && _i.<Integer>get().intValue() >= limit18) ;_i = RemoteObject.createImmutable((int)(0 + _i.<Integer>get().intValue() + step18))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 56;BA.debugLine="back_but(i).Initialize(\"back\")";
Debug.ShouldStop(8388608);
main.mostCurrent._back_but.getArrayElement(false,_i).runVoidMethod ("Initialize",main.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("back")));
 BA.debugLineNum = 57;BA.debugLine="back_but(i).Tag = i + 1";
Debug.ShouldStop(16777216);
main.mostCurrent._back_but.getArrayElement(false,_i).runMethod(false,"setTag",(RemoteObject.solve(new RemoteObject[] {_i,RemoteObject.createImmutable(1)}, "+",1, 1)));
 BA.debugLineNum = 58;BA.debugLine="back_but(i).Text=\"Back\"";
Debug.ShouldStop(33554432);
main.mostCurrent._back_but.getArrayElement(false,_i).runMethod(true,"setText",BA.ObjectToCharSequence("Back"));
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 61;BA.debugLine="item_list.Initialize()";
Debug.ShouldStop(268435456);
main.mostCurrent._item_list.runVoidMethod ("Initialize");
 BA.debugLineNum = 62;BA.debugLine="Activity.AddView(p1, 0, 0, 100%x, 100%y)";
Debug.ShouldStop(536870912);
main.mostCurrent._activity.runVoidMethod ("AddView",(Object)((main.mostCurrent._p1.getObject())),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(main.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 100)),main.mostCurrent.activityBA)),(Object)(main.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 100)),main.mostCurrent.activityBA)));
 BA.debugLineNum = 63;BA.debugLine="Activity.AddView(p2, 0, 0, 100%x, 100%y)";
Debug.ShouldStop(1073741824);
main.mostCurrent._activity.runVoidMethod ("AddView",(Object)((main.mostCurrent._p2.getObject())),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(main.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 100)),main.mostCurrent.activityBA)),(Object)(main.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 100)),main.mostCurrent.activityBA)));
 BA.debugLineNum = 64;BA.debugLine="Activity.AddView(p3, 0, 0, 100%x, 100%y)";
Debug.ShouldStop(-2147483648);
main.mostCurrent._activity.runVoidMethod ("AddView",(Object)((main.mostCurrent._p3.getObject())),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(main.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 100)),main.mostCurrent.activityBA)),(Object)(main.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 100)),main.mostCurrent.activityBA)));
 BA.debugLineNum = 65;BA.debugLine="Activity.AddView(p4, 0, 0, 100%x, 100%y)";
Debug.ShouldStop(1);
main.mostCurrent._activity.runVoidMethod ("AddView",(Object)((main.mostCurrent._p4.getObject())),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(main.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 100)),main.mostCurrent.activityBA)),(Object)(main.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 100)),main.mostCurrent.activityBA)));
 BA.debugLineNum = 66;BA.debugLine="Activity.AddView(p5, 0, 0, 100%x, 100%y)";
Debug.ShouldStop(2);
main.mostCurrent._activity.runVoidMethod ("AddView",(Object)((main.mostCurrent._p5.getObject())),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(main.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 100)),main.mostCurrent.activityBA)),(Object)(main.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 100)),main.mostCurrent.activityBA)));
 BA.debugLineNum = 67;BA.debugLine="Activity.AddView(p6, 0, 0, 100%x, 100%y)";
Debug.ShouldStop(4);
main.mostCurrent._activity.runVoidMethod ("AddView",(Object)((main.mostCurrent._p6.getObject())),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(main.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 100)),main.mostCurrent.activityBA)),(Object)(main.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 100)),main.mostCurrent.activityBA)));
 BA.debugLineNum = 68;BA.debugLine="Activity.AddView(p7, 0, 0, 100%x, 100%y)";
Debug.ShouldStop(8);
main.mostCurrent._activity.runVoidMethod ("AddView",(Object)((main.mostCurrent._p7.getObject())),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(main.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 100)),main.mostCurrent.activityBA)),(Object)(main.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 100)),main.mostCurrent.activityBA)));
 BA.debugLineNum = 69;BA.debugLine="Activity.AddView(p8, 0, 0, 100%x, 100%y)";
Debug.ShouldStop(16);
main.mostCurrent._activity.runVoidMethod ("AddView",(Object)((main.mostCurrent._p8.getObject())),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(main.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 100)),main.mostCurrent.activityBA)),(Object)(main.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 100)),main.mostCurrent.activityBA)));
 BA.debugLineNum = 70;BA.debugLine="p1.AddView(cur1,200dip,40dip,100dip,40dip)";
Debug.ShouldStop(32);
main.mostCurrent._p1.runVoidMethod ("AddView",(Object)((main.mostCurrent._cur1.getObject())),(Object)(main.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 200)))),(Object)(main.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 40)))),(Object)(main.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 100)))),(Object)(main.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 40)))));
 BA.debugLineNum = 71;BA.debugLine="p1.AddView(cur2,200dip,100dip,100dip,40dip)";
Debug.ShouldStop(64);
main.mostCurrent._p1.runVoidMethod ("AddView",(Object)((main.mostCurrent._cur2.getObject())),(Object)(main.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 200)))),(Object)(main.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 100)))),(Object)(main.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 100)))),(Object)(main.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 40)))));
 BA.debugLineNum = 72;BA.debugLine="p1.AddView(ed1,50dip,40dip,100dip,40dip)";
Debug.ShouldStop(128);
main.mostCurrent._p1.runVoidMethod ("AddView",(Object)((main.mostCurrent._ed1.getObject())),(Object)(main.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 50)))),(Object)(main.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 40)))),(Object)(main.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 100)))),(Object)(main.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 40)))));
 BA.debugLineNum = 73;BA.debugLine="p1.AddView(ed2,50dip,100dip,100dip,40dip)";
Debug.ShouldStop(256);
main.mostCurrent._p1.runVoidMethod ("AddView",(Object)((main.mostCurrent._ed2.getObject())),(Object)(main.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 50)))),(Object)(main.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 100)))),(Object)(main.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 100)))),(Object)(main.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 40)))));
 BA.debugLineNum = 74;BA.debugLine="p1.AddView(lb,125dip,160dip,100dip,40dip)";
Debug.ShouldStop(512);
main.mostCurrent._p1.runVoidMethod ("AddView",(Object)((main.mostCurrent._lb.getObject())),(Object)(main.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 125)))),(Object)(main.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 160)))),(Object)(main.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 100)))),(Object)(main.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 40)))));
 BA.debugLineNum = 75;BA.debugLine="p1.AddView(curr_conv_rate,120dip,215dip,110dip,40";
Debug.ShouldStop(1024);
main.mostCurrent._p1.runVoidMethod ("AddView",(Object)((main.mostCurrent._curr_conv_rate.getObject())),(Object)(main.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 120)))),(Object)(main.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 215)))),(Object)(main.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 110)))),(Object)(main.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 40)))));
 BA.debugLineNum = 76;BA.debugLine="p1.AddView(bu1, 110dip, 270dip, 90dip, 60dip)";
Debug.ShouldStop(2048);
main.mostCurrent._p1.runVoidMethod ("AddView",(Object)((main.mostCurrent._bu1.getObject())),(Object)(main.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 110)))),(Object)(main.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 270)))),(Object)(main.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 90)))),(Object)(main.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 60)))));
 BA.debugLineNum = 77;BA.debugLine="p1.AddView(bu2, 110dip, 340dip, 90dip, 60dip)";
Debug.ShouldStop(4096);
main.mostCurrent._p1.runVoidMethod ("AddView",(Object)((main.mostCurrent._bu2.getObject())),(Object)(main.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 110)))),(Object)(main.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 340)))),(Object)(main.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 90)))),(Object)(main.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 60)))));
 BA.debugLineNum = 79;BA.debugLine="p2.AddView(back_but(0), 20dip, 360dip, 100dip, 40";
Debug.ShouldStop(16384);
main.mostCurrent._p2.runVoidMethod ("AddView",(Object)((main.mostCurrent._back_but.getArrayElement(false,BA.numberCast(int.class, 0)).getObject())),(Object)(main.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 20)))),(Object)(main.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 360)))),(Object)(main.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 100)))),(Object)(main.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 40)))));
 BA.debugLineNum = 80;BA.debugLine="p3.AddView(back_but(1), 20dip, 360dip, 100dip, 40";
Debug.ShouldStop(32768);
main.mostCurrent._p3.runVoidMethod ("AddView",(Object)((main.mostCurrent._back_but.getArrayElement(false,BA.numberCast(int.class, 1)).getObject())),(Object)(main.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 20)))),(Object)(main.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 360)))),(Object)(main.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 100)))),(Object)(main.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 40)))));
 BA.debugLineNum = 81;BA.debugLine="p4.AddView(back_but(2), 20dip, 360dip, 100dip, 40";
Debug.ShouldStop(65536);
main.mostCurrent._p4.runVoidMethod ("AddView",(Object)((main.mostCurrent._back_but.getArrayElement(false,BA.numberCast(int.class, 2)).getObject())),(Object)(main.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 20)))),(Object)(main.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 360)))),(Object)(main.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 100)))),(Object)(main.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 40)))));
 BA.debugLineNum = 82;BA.debugLine="p5.AddView(back_but(3), 20dip, 360dip, 100dip, 40";
Debug.ShouldStop(131072);
main.mostCurrent._p5.runVoidMethod ("AddView",(Object)((main.mostCurrent._back_but.getArrayElement(false,BA.numberCast(int.class, 3)).getObject())),(Object)(main.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 20)))),(Object)(main.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 360)))),(Object)(main.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 100)))),(Object)(main.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 40)))));
 BA.debugLineNum = 83;BA.debugLine="p6.AddView(back_but(4), 20dip, 360dip, 100dip, 40";
Debug.ShouldStop(262144);
main.mostCurrent._p6.runVoidMethod ("AddView",(Object)((main.mostCurrent._back_but.getArrayElement(false,BA.numberCast(int.class, 4)).getObject())),(Object)(main.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 20)))),(Object)(main.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 360)))),(Object)(main.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 100)))),(Object)(main.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 40)))));
 BA.debugLineNum = 84;BA.debugLine="p7.AddView(back_but(5), 20dip, 360dip, 100dip, 40";
Debug.ShouldStop(524288);
main.mostCurrent._p7.runVoidMethod ("AddView",(Object)((main.mostCurrent._back_but.getArrayElement(false,BA.numberCast(int.class, 5)).getObject())),(Object)(main.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 20)))),(Object)(main.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 360)))),(Object)(main.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 100)))),(Object)(main.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 40)))));
 BA.debugLineNum = 85;BA.debugLine="p8.AddView(back_but(6), 20dip, 360dip, 100dip, 40";
Debug.ShouldStop(1048576);
main.mostCurrent._p8.runVoidMethod ("AddView",(Object)((main.mostCurrent._back_but.getArrayElement(false,BA.numberCast(int.class, 6)).getObject())),(Object)(main.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 20)))),(Object)(main.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 360)))),(Object)(main.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 100)))),(Object)(main.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 40)))));
 BA.debugLineNum = 87;BA.debugLine="cur1.Color=Colors.RGB(255,255,255)";
Debug.ShouldStop(4194304);
main.mostCurrent._cur1.runVoidMethod ("setColor",main.mostCurrent.__c.getField(false,"Colors").runMethod(true,"RGB",(Object)(BA.numberCast(int.class, 255)),(Object)(BA.numberCast(int.class, 255)),(Object)(BA.numberCast(int.class, 255))));
 BA.debugLineNum = 88;BA.debugLine="cur2.Color=Colors.RGB(255,255,255)";
Debug.ShouldStop(8388608);
main.mostCurrent._cur2.runVoidMethod ("setColor",main.mostCurrent.__c.getField(false,"Colors").runMethod(true,"RGB",(Object)(BA.numberCast(int.class, 255)),(Object)(BA.numberCast(int.class, 255)),(Object)(BA.numberCast(int.class, 255))));
 BA.debugLineNum = 89;BA.debugLine="curr_conv_rate.Color=Colors.RGB(255,255,255)";
Debug.ShouldStop(16777216);
main.mostCurrent._curr_conv_rate.runVoidMethod ("setColor",main.mostCurrent.__c.getField(false,"Colors").runMethod(true,"RGB",(Object)(BA.numberCast(int.class, 255)),(Object)(BA.numberCast(int.class, 255)),(Object)(BA.numberCast(int.class, 255))));
 BA.debugLineNum = 90;BA.debugLine="ed1.Color=Colors.RGB(255,255,255)";
Debug.ShouldStop(33554432);
main.mostCurrent._ed1.runVoidMethod ("setColor",main.mostCurrent.__c.getField(false,"Colors").runMethod(true,"RGB",(Object)(BA.numberCast(int.class, 255)),(Object)(BA.numberCast(int.class, 255)),(Object)(BA.numberCast(int.class, 255))));
 BA.debugLineNum = 91;BA.debugLine="lb.Color=Colors.RGB(255,255,255)";
Debug.ShouldStop(67108864);
main.mostCurrent._lb.runVoidMethod ("setColor",main.mostCurrent.__c.getField(false,"Colors").runMethod(true,"RGB",(Object)(BA.numberCast(int.class, 255)),(Object)(BA.numberCast(int.class, 255)),(Object)(BA.numberCast(int.class, 255))));
 BA.debugLineNum = 92;BA.debugLine="ed2.Color=Colors.RGB(255,255,255)";
Debug.ShouldStop(134217728);
main.mostCurrent._ed2.runVoidMethod ("setColor",main.mostCurrent.__c.getField(false,"Colors").runMethod(true,"RGB",(Object)(BA.numberCast(int.class, 255)),(Object)(BA.numberCast(int.class, 255)),(Object)(BA.numberCast(int.class, 255))));
 BA.debugLineNum = 93;BA.debugLine="cur1.TextColor=Colors.RGB(0,0,0)";
Debug.ShouldStop(268435456);
main.mostCurrent._cur1.runMethod(true,"setTextColor",main.mostCurrent.__c.getField(false,"Colors").runMethod(true,"RGB",(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0))));
 BA.debugLineNum = 94;BA.debugLine="cur2.TextColor=Colors.RGB(0,0,0)";
Debug.ShouldStop(536870912);
main.mostCurrent._cur2.runMethod(true,"setTextColor",main.mostCurrent.__c.getField(false,"Colors").runMethod(true,"RGB",(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0))));
 BA.debugLineNum = 95;BA.debugLine="curr_conv_rate.TextColor=Colors.RGB(0,0,0)";
Debug.ShouldStop(1073741824);
main.mostCurrent._curr_conv_rate.runMethod(true,"setTextColor",main.mostCurrent.__c.getField(false,"Colors").runMethod(true,"RGB",(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0))));
 BA.debugLineNum = 96;BA.debugLine="ed1.TextColor=Colors.RGB(0,0,0)";
Debug.ShouldStop(-2147483648);
main.mostCurrent._ed1.runMethod(true,"setTextColor",main.mostCurrent.__c.getField(false,"Colors").runMethod(true,"RGB",(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0))));
 BA.debugLineNum = 97;BA.debugLine="lb.TextColor=Colors.RGB(0,0,0)";
Debug.ShouldStop(1);
main.mostCurrent._lb.runMethod(true,"setTextColor",main.mostCurrent.__c.getField(false,"Colors").runMethod(true,"RGB",(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0))));
 BA.debugLineNum = 98;BA.debugLine="ed1.TextColor= Colors.RGB(0,0,0)";
Debug.ShouldStop(2);
main.mostCurrent._ed1.runMethod(true,"setTextColor",main.mostCurrent.__c.getField(false,"Colors").runMethod(true,"RGB",(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0))));
 BA.debugLineNum = 99;BA.debugLine="ed2.TextColor = Colors.RGB(0,0,0)";
Debug.ShouldStop(4);
main.mostCurrent._ed2.runMethod(true,"setTextColor",main.mostCurrent.__c.getField(false,"Colors").runMethod(true,"RGB",(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0))));
 BA.debugLineNum = 100;BA.debugLine="lb.TextColor=Colors.Black";
Debug.ShouldStop(8);
main.mostCurrent._lb.runMethod(true,"setTextColor",main.mostCurrent.__c.getField(false,"Colors").getField(true,"Black"));
 BA.debugLineNum = 102;BA.debugLine="lb.Text=\"Conversion Rate\"";
Debug.ShouldStop(32);
main.mostCurrent._lb.runMethod(true,"setText",BA.ObjectToCharSequence("Conversion Rate"));
 BA.debugLineNum = 103;BA.debugLine="item_list.Add(\"$ Dollar\")";
Debug.ShouldStop(64);
main.mostCurrent._item_list.runVoidMethod ("Add",(Object)((RemoteObject.createImmutable("$ Dollar"))));
 BA.debugLineNum = 104;BA.debugLine="item_list.Add(\"¥ Yuan\")";
Debug.ShouldStop(128);
main.mostCurrent._item_list.runVoidMethod ("Add",(Object)((RemoteObject.createImmutable("¥ Yuan"))));
 BA.debugLineNum = 105;BA.debugLine="item_list.Add(\"€ Euro\")";
Debug.ShouldStop(256);
main.mostCurrent._item_list.runVoidMethod ("Add",(Object)((RemoteObject.createImmutable("€ Euro"))));
 BA.debugLineNum = 106;BA.debugLine="item_list.Add(\"лв. BGN\")";
Debug.ShouldStop(512);
main.mostCurrent._item_list.runVoidMethod ("Add",(Object)((RemoteObject.createImmutable("лв. BGN"))));
 BA.debugLineNum = 107;BA.debugLine="item_list.Add(\"CZK Koruna\")";
Debug.ShouldStop(1024);
main.mostCurrent._item_list.runVoidMethod ("Add",(Object)((RemoteObject.createImmutable("CZK Koruna"))));
 BA.debugLineNum = 108;BA.debugLine="item_list.Add(\"RUB Ruble\")";
Debug.ShouldStop(2048);
main.mostCurrent._item_list.runVoidMethod ("Add",(Object)((RemoteObject.createImmutable("RUB Ruble"))));
 BA.debugLineNum = 109;BA.debugLine="bu1.Text=\"Convert\"";
Debug.ShouldStop(4096);
main.mostCurrent._bu1.runMethod(true,"setText",BA.ObjectToCharSequence("Convert"));
 BA.debugLineNum = 110;BA.debugLine="bu2.Text=\"rates\"";
Debug.ShouldStop(8192);
main.mostCurrent._bu2.runMethod(true,"setText",BA.ObjectToCharSequence("rates"));
 BA.debugLineNum = 111;BA.debugLine="ed1.InputType = ed1.INPUT_TYPE_DECIMAL_NUMBERS";
Debug.ShouldStop(16384);
main.mostCurrent._ed1.runMethod(true,"setInputType",main.mostCurrent._ed1.getField(true,"INPUT_TYPE_DECIMAL_NUMBERS"));
 BA.debugLineNum = 112;BA.debugLine="ed2.InputType = ed2.INPUT_TYPE_DECIMAL_NUMBERS";
Debug.ShouldStop(32768);
main.mostCurrent._ed2.runMethod(true,"setInputType",main.mostCurrent._ed2.getField(true,"INPUT_TYPE_DECIMAL_NUMBERS"));
 BA.debugLineNum = 113;BA.debugLine="curr_conv_rate.InputType = curr_conv_rate.INPUT_T";
Debug.ShouldStop(65536);
main.mostCurrent._curr_conv_rate.runMethod(true,"setInputType",main.mostCurrent._curr_conv_rate.getField(true,"INPUT_TYPE_DECIMAL_NUMBERS"));
 BA.debugLineNum = 116;BA.debugLine="cur1.SetItems(item_list)";
Debug.ShouldStop(524288);
main.mostCurrent._cur1.runVoidMethod ("SetItems",main.processBA,(Object)(main.mostCurrent._item_list));
 BA.debugLineNum = 117;BA.debugLine="cur2.SetItems(item_list)";
Debug.ShouldStop(1048576);
main.mostCurrent._cur2.runVoidMethod ("SetItems",main.processBA,(Object)(main.mostCurrent._item_list));
 BA.debugLineNum = 118;BA.debugLine="Dim col,row As Int = 0";
Debug.ShouldStop(2097152);
_col = RemoteObject.createImmutable(0);Debug.locals.put("col", _col);
_row = BA.numberCast(int.class, 0);Debug.locals.put("row", _row);Debug.locals.put("row", _row);
 BA.debugLineNum = 119;BA.debugLine="For i = 0 To 5";
Debug.ShouldStop(4194304);
{
final int step76 = 1;
final int limit76 = 5;
_i = BA.numberCast(int.class, 0) ;
for (;(step76 > 0 && _i.<Integer>get().intValue() <= limit76) || (step76 < 0 && _i.<Integer>get().intValue() >= limit76) ;_i = RemoteObject.createImmutable((int)(0 + _i.<Integer>get().intValue() + step76))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 120;BA.debugLine="If row = 3 Then";
Debug.ShouldStop(8388608);
if (RemoteObject.solveBoolean("=",_row,BA.numberCast(double.class, 3))) { 
 BA.debugLineNum = 121;BA.debugLine="col = col + 1";
Debug.ShouldStop(16777216);
_col = RemoteObject.solve(new RemoteObject[] {_col,RemoteObject.createImmutable(1)}, "+",1, 1);Debug.locals.put("col", _col);
 BA.debugLineNum = 122;BA.debugLine="row = 0";
Debug.ShouldStop(33554432);
_row = BA.numberCast(int.class, 0);Debug.locals.put("row", _row);
 };
 BA.debugLineNum = 125;BA.debugLine="button(i).Initialize(\"button\")";
Debug.ShouldStop(268435456);
main.mostCurrent._button.getArrayElement(false,_i).runVoidMethod ("Initialize",main.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("button")));
 BA.debugLineNum = 126;BA.debugLine="p2.AddView(button(i), (row*60dip) + 80dip,(col*6";
Debug.ShouldStop(536870912);
main.mostCurrent._p2.runVoidMethod ("AddView",(Object)((main.mostCurrent._button.getArrayElement(false,_i).getObject())),(Object)(RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {_row,main.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 60)))}, "*",0, 1)),main.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 80)))}, "+",1, 1)),(Object)(RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {_col,main.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 60)))}, "*",0, 1)),main.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 140)))}, "+",1, 1)),(Object)(main.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 50)))),(Object)(main.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 50)))));
 BA.debugLineNum = 128;BA.debugLine="row = row + 1";
Debug.ShouldStop(-2147483648);
_row = RemoteObject.solve(new RemoteObject[] {_row,RemoteObject.createImmutable(1)}, "+",1, 1);Debug.locals.put("row", _row);
 BA.debugLineNum = 129;BA.debugLine="button(i).Tag=i+1";
Debug.ShouldStop(1);
main.mostCurrent._button.getArrayElement(false,_i).runMethod(false,"setTag",(RemoteObject.solve(new RemoteObject[] {_i,RemoteObject.createImmutable(1)}, "+",1, 1)));
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 133;BA.debugLine="Visible";
Debug.ShouldStop(16);
_visible();
 BA.debugLineNum = 134;BA.debugLine="setButtonText";
Debug.ShouldStop(32);
_setbuttontext();
 BA.debugLineNum = 135;BA.debugLine="End Sub";
Debug.ShouldStop(64);
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
		Debug.PushSubsStack("Activity_Pause (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,141);
if (RapidSub.canDelegate("activity_pause")) return b4a.example.main.remoteMe.runUserSub(false, "main","activity_pause", _userclosed);
Debug.locals.put("UserClosed", _userclosed);
 BA.debugLineNum = 141;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
Debug.ShouldStop(4096);
 BA.debugLineNum = 143;BA.debugLine="End Sub";
Debug.ShouldStop(16384);
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
		Debug.PushSubsStack("Activity_Resume (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,137);
if (RapidSub.canDelegate("activity_resume")) return b4a.example.main.remoteMe.runUserSub(false, "main","activity_resume");
 BA.debugLineNum = 137;BA.debugLine="Sub Activity_Resume";
Debug.ShouldStop(256);
 BA.debugLineNum = 139;BA.debugLine="End Sub";
Debug.ShouldStop(1024);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _back_click() throws Exception{
try {
		Debug.PushSubsStack("Back_Click (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,177);
if (RapidSub.canDelegate("back_click")) return b4a.example.main.remoteMe.runUserSub(false, "main","back_click");
RemoteObject _temp = RemoteObject.declareNull("anywheresoftware.b4a.objects.ButtonWrapper");
 BA.debugLineNum = 177;BA.debugLine="Sub Back_Click";
Debug.ShouldStop(65536);
 BA.debugLineNum = 179;BA.debugLine="Dim temp As Button";
Debug.ShouldStop(262144);
_temp = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");Debug.locals.put("temp", _temp);
 BA.debugLineNum = 180;BA.debugLine="temp = Sender";
Debug.ShouldStop(524288);
_temp.setObject(main.mostCurrent.__c.runMethod(false,"Sender",main.mostCurrent.activityBA));
 BA.debugLineNum = 181;BA.debugLine="Select temp.Tag";
Debug.ShouldStop(1048576);
switch (BA.switchObjectToInt(_temp.runMethod(false,"getTag"),RemoteObject.createImmutable((1)),RemoteObject.createImmutable((2)),RemoteObject.createImmutable((3)),RemoteObject.createImmutable((4)),RemoteObject.createImmutable((5)),RemoteObject.createImmutable((6)),RemoteObject.createImmutable((7)))) {
case 0: {
 BA.debugLineNum = 183;BA.debugLine="p2.Visible = False";
Debug.ShouldStop(4194304);
main.mostCurrent._p2.runMethod(true,"setVisible",main.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 184;BA.debugLine="p1.Visible = True";
Debug.ShouldStop(8388608);
main.mostCurrent._p1.runMethod(true,"setVisible",main.mostCurrent.__c.getField(true,"True"));
 break; }
case 1: {
 BA.debugLineNum = 186;BA.debugLine="p3.Visible = False";
Debug.ShouldStop(33554432);
main.mostCurrent._p3.runMethod(true,"setVisible",main.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 187;BA.debugLine="p2.Visible = True";
Debug.ShouldStop(67108864);
main.mostCurrent._p2.runMethod(true,"setVisible",main.mostCurrent.__c.getField(true,"True"));
 break; }
case 2: {
 BA.debugLineNum = 189;BA.debugLine="p4.Visible = False";
Debug.ShouldStop(268435456);
main.mostCurrent._p4.runMethod(true,"setVisible",main.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 190;BA.debugLine="p2.Visible = True";
Debug.ShouldStop(536870912);
main.mostCurrent._p2.runMethod(true,"setVisible",main.mostCurrent.__c.getField(true,"True"));
 break; }
case 3: {
 BA.debugLineNum = 192;BA.debugLine="p5.Visible = False";
Debug.ShouldStop(-2147483648);
main.mostCurrent._p5.runMethod(true,"setVisible",main.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 193;BA.debugLine="p2.Visible = True";
Debug.ShouldStop(1);
main.mostCurrent._p2.runMethod(true,"setVisible",main.mostCurrent.__c.getField(true,"True"));
 break; }
case 4: {
 BA.debugLineNum = 195;BA.debugLine="p6.Visible = False";
Debug.ShouldStop(4);
main.mostCurrent._p6.runMethod(true,"setVisible",main.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 196;BA.debugLine="p2.Visible = True";
Debug.ShouldStop(8);
main.mostCurrent._p2.runMethod(true,"setVisible",main.mostCurrent.__c.getField(true,"True"));
 break; }
case 5: {
 BA.debugLineNum = 198;BA.debugLine="p7.Visible = False";
Debug.ShouldStop(32);
main.mostCurrent._p7.runMethod(true,"setVisible",main.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 199;BA.debugLine="p2.Visible = True";
Debug.ShouldStop(64);
main.mostCurrent._p2.runMethod(true,"setVisible",main.mostCurrent.__c.getField(true,"True"));
 break; }
case 6: {
 BA.debugLineNum = 201;BA.debugLine="p8.Visible = False";
Debug.ShouldStop(256);
main.mostCurrent._p8.runMethod(true,"setVisible",main.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 202;BA.debugLine="p2.Visible = True";
Debug.ShouldStop(512);
main.mostCurrent._p2.runMethod(true,"setVisible",main.mostCurrent.__c.getField(true,"True"));
 break; }
}
;
 BA.debugLineNum = 207;BA.debugLine="End Sub";
Debug.ShouldStop(16384);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _bu1_click() throws Exception{
try {
		Debug.PushSubsStack("bu1_Click (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,145);
if (RapidSub.canDelegate("bu1_click")) return b4a.example.main.remoteMe.runUserSub(false, "main","bu1_click");
RemoteObject _res1 = RemoteObject.createImmutable(0);
RemoteObject _res2 = RemoteObject.createImmutable(0);
RemoteObject _currency1 = RemoteObject.createImmutable(0);
RemoteObject _currency2 = RemoteObject.createImmutable(0);
RemoteObject _rate = RemoteObject.createImmutable(0);
 BA.debugLineNum = 145;BA.debugLine="Sub bu1_Click";
Debug.ShouldStop(65536);
 BA.debugLineNum = 147;BA.debugLine="Dim res1,res2 As Double";
Debug.ShouldStop(262144);
_res1 = RemoteObject.createImmutable(0);Debug.locals.put("res1", _res1);
_res2 = RemoteObject.createImmutable(0);Debug.locals.put("res2", _res2);
 BA.debugLineNum = 148;BA.debugLine="Dim currency1,currency2,rate As Double";
Debug.ShouldStop(524288);
_currency1 = RemoteObject.createImmutable(0);Debug.locals.put("currency1", _currency1);
_currency2 = RemoteObject.createImmutable(0);Debug.locals.put("currency2", _currency2);
_rate = RemoteObject.createImmutable(0);Debug.locals.put("rate", _rate);
 BA.debugLineNum = 150;BA.debugLine="If curr_conv_rate.Text <> \"\" Then";
Debug.ShouldStop(2097152);
if (RemoteObject.solveBoolean("!",main.mostCurrent._curr_conv_rate.runMethod(true,"getText"),BA.ObjectToString(""))) { 
 BA.debugLineNum = 151;BA.debugLine="rate=curr_conv_rate.Text";
Debug.ShouldStop(4194304);
_rate = BA.numberCast(double.class, main.mostCurrent._curr_conv_rate.runMethod(true,"getText"));Debug.locals.put("rate", _rate);
 }else {
 BA.debugLineNum = 153;BA.debugLine="Msgbox(\"Input rate\",\"OOOOOPPPPS\")";
Debug.ShouldStop(16777216);
main.mostCurrent.__c.runVoidMethodAndSync ("Msgbox",(Object)(BA.ObjectToCharSequence("Input rate")),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("OOOOOPPPPS"))),main.mostCurrent.activityBA);
 };
 BA.debugLineNum = 157;BA.debugLine="res1=0";
Debug.ShouldStop(268435456);
_res1 = BA.numberCast(double.class, 0);Debug.locals.put("res1", _res1);
 BA.debugLineNum = 158;BA.debugLine="res2=0";
Debug.ShouldStop(536870912);
_res2 = BA.numberCast(double.class, 0);Debug.locals.put("res2", _res2);
 BA.debugLineNum = 159;BA.debugLine="If ed1.Text <> \"\"   Then";
Debug.ShouldStop(1073741824);
if (RemoteObject.solveBoolean("!",main.mostCurrent._ed1.runMethod(true,"getText"),BA.ObjectToString(""))) { 
 BA.debugLineNum = 160;BA.debugLine="currency1=ed1.Text";
Debug.ShouldStop(-2147483648);
_currency1 = BA.numberCast(double.class, main.mostCurrent._ed1.runMethod(true,"getText"));Debug.locals.put("currency1", _currency1);
 BA.debugLineNum = 161;BA.debugLine="res1=currency1*rate";
Debug.ShouldStop(1);
_res1 = RemoteObject.solve(new RemoteObject[] {_currency1,_rate}, "*",0, 0);Debug.locals.put("res1", _res1);
 };
 BA.debugLineNum = 163;BA.debugLine="If ed2.Text <> \"\"   Then";
Debug.ShouldStop(4);
if (RemoteObject.solveBoolean("!",main.mostCurrent._ed2.runMethod(true,"getText"),BA.ObjectToString(""))) { 
 BA.debugLineNum = 164;BA.debugLine="currency2=ed2.Text";
Debug.ShouldStop(8);
_currency2 = BA.numberCast(double.class, main.mostCurrent._ed2.runMethod(true,"getText"));Debug.locals.put("currency2", _currency2);
 BA.debugLineNum = 165;BA.debugLine="res2=currency2/rate";
Debug.ShouldStop(16);
_res2 = RemoteObject.solve(new RemoteObject[] {_currency2,_rate}, "/",0, 0);Debug.locals.put("res2", _res2);
 };
 BA.debugLineNum = 167;BA.debugLine="Msgbox(\"cur1: \"& res1 & CRLF & \"cur2: \" &  res2,\"";
Debug.ShouldStop(64);
main.mostCurrent.__c.runVoidMethodAndSync ("Msgbox",(Object)(BA.ObjectToCharSequence(RemoteObject.concat(RemoteObject.createImmutable("cur1: "),_res1,main.mostCurrent.__c.getField(true,"CRLF"),RemoteObject.createImmutable("cur2: "),_res2))),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("RATES"))),main.mostCurrent.activityBA);
 BA.debugLineNum = 169;BA.debugLine="End Sub";
Debug.ShouldStop(256);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _bu2_click() throws Exception{
try {
		Debug.PushSubsStack("bu2_Click (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,171);
if (RapidSub.canDelegate("bu2_click")) return b4a.example.main.remoteMe.runUserSub(false, "main","bu2_click");
 BA.debugLineNum = 171;BA.debugLine="Sub bu2_Click";
Debug.ShouldStop(1024);
 BA.debugLineNum = 172;BA.debugLine="p1.Visible=False";
Debug.ShouldStop(2048);
main.mostCurrent._p1.runMethod(true,"setVisible",main.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 173;BA.debugLine="p2.Visible=True";
Debug.ShouldStop(4096);
main.mostCurrent._p2.runMethod(true,"setVisible",main.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 175;BA.debugLine="End Sub";
Debug.ShouldStop(16384);
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
		Debug.PushSubsStack("Button_Click (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,209);
if (RapidSub.canDelegate("button_click")) return b4a.example.main.remoteMe.runUserSub(false, "main","button_click");
RemoteObject _temp = RemoteObject.declareNull("anywheresoftware.b4a.objects.ButtonWrapper");
RemoteObject _myw = RemoteObject.declareNull("anywheresoftware.b4a.objects.WebViewWrapper");
 BA.debugLineNum = 209;BA.debugLine="Sub Button_Click";
Debug.ShouldStop(65536);
 BA.debugLineNum = 210;BA.debugLine="Dim temp As Button";
Debug.ShouldStop(131072);
_temp = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");Debug.locals.put("temp", _temp);
 BA.debugLineNum = 211;BA.debugLine="temp = Sender";
Debug.ShouldStop(262144);
_temp.setObject(main.mostCurrent.__c.runMethod(false,"Sender",main.mostCurrent.activityBA));
 BA.debugLineNum = 212;BA.debugLine="Dim myw As WebView";
Debug.ShouldStop(524288);
_myw = RemoteObject.createNew ("anywheresoftware.b4a.objects.WebViewWrapper");Debug.locals.put("myw", _myw);
 BA.debugLineNum = 213;BA.debugLine="myw.Initialize(\"myw\")";
Debug.ShouldStop(1048576);
_myw.runVoidMethod ("Initialize",main.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("myw")));
 BA.debugLineNum = 214;BA.debugLine="Select temp.Tag";
Debug.ShouldStop(2097152);
switch (BA.switchObjectToInt(_temp.runMethod(false,"getTag"),RemoteObject.createImmutable((1)),RemoteObject.createImmutable((2)),RemoteObject.createImmutable((3)),RemoteObject.createImmutable((4)),RemoteObject.createImmutable((5)),RemoteObject.createImmutable((6)))) {
case 0: {
 BA.debugLineNum = 217;BA.debugLine="p2.Visible=False";
Debug.ShouldStop(16777216);
main.mostCurrent._p2.runMethod(true,"setVisible",main.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 218;BA.debugLine="p3.Visible=True";
Debug.ShouldStop(33554432);
main.mostCurrent._p3.runMethod(true,"setVisible",main.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 219;BA.debugLine="p3.AddView(myw, 0, 0, 100%x, 75%y) 'Your optio";
Debug.ShouldStop(67108864);
main.mostCurrent._p3.runVoidMethod ("AddView",(Object)((_myw.getObject())),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(main.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 100)),main.mostCurrent.activityBA)),(Object)(main.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 75)),main.mostCurrent.activityBA)));
 BA.debugLineNum = 220;BA.debugLine="myw.LoadUrl(\"http://www.floatrates.com/daily/e";
Debug.ShouldStop(134217728);
_myw.runVoidMethod ("LoadUrl",(Object)(RemoteObject.createImmutable("http://www.floatrates.com/daily/eur.xml")));
 break; }
case 1: {
 BA.debugLineNum = 222;BA.debugLine="p2.Visible=False";
Debug.ShouldStop(536870912);
main.mostCurrent._p2.runMethod(true,"setVisible",main.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 223;BA.debugLine="p4.Visible=True";
Debug.ShouldStop(1073741824);
main.mostCurrent._p4.runMethod(true,"setVisible",main.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 224;BA.debugLine="p4.AddView(myw, 0, 0, 100%x, 75%y) 'Your optio";
Debug.ShouldStop(-2147483648);
main.mostCurrent._p4.runVoidMethod ("AddView",(Object)((_myw.getObject())),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(main.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 100)),main.mostCurrent.activityBA)),(Object)(main.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 75)),main.mostCurrent.activityBA)));
 BA.debugLineNum = 225;BA.debugLine="myw.LoadUrl(\"http://www.floatrates.com/daily/u";
Debug.ShouldStop(1);
_myw.runVoidMethod ("LoadUrl",(Object)(RemoteObject.createImmutable("http://www.floatrates.com/daily/usd.xml")));
 break; }
case 2: {
 BA.debugLineNum = 227;BA.debugLine="p2.Visible = False";
Debug.ShouldStop(4);
main.mostCurrent._p2.runMethod(true,"setVisible",main.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 228;BA.debugLine="p5.Visible = True";
Debug.ShouldStop(8);
main.mostCurrent._p5.runMethod(true,"setVisible",main.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 229;BA.debugLine="p5.AddView(myw, 0, 0, 100%x, 75%y) 'Your optio";
Debug.ShouldStop(16);
main.mostCurrent._p5.runVoidMethod ("AddView",(Object)((_myw.getObject())),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(main.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 100)),main.mostCurrent.activityBA)),(Object)(main.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 75)),main.mostCurrent.activityBA)));
 BA.debugLineNum = 230;BA.debugLine="myw.LoadUrl(\"http://www.floatrates.com/daily/b";
Debug.ShouldStop(32);
_myw.runVoidMethod ("LoadUrl",(Object)(RemoteObject.createImmutable("http://www.floatrates.com/daily/bgn.xml")));
 break; }
case 3: {
 BA.debugLineNum = 232;BA.debugLine="p2.Visible = False";
Debug.ShouldStop(128);
main.mostCurrent._p2.runMethod(true,"setVisible",main.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 233;BA.debugLine="p6.Visible = True";
Debug.ShouldStop(256);
main.mostCurrent._p6.runMethod(true,"setVisible",main.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 234;BA.debugLine="p6.AddView(myw, 0, 0, 100%x, 75%y) 'Your optio";
Debug.ShouldStop(512);
main.mostCurrent._p6.runVoidMethod ("AddView",(Object)((_myw.getObject())),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(main.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 100)),main.mostCurrent.activityBA)),(Object)(main.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 75)),main.mostCurrent.activityBA)));
 BA.debugLineNum = 235;BA.debugLine="myw.LoadUrl(\"http://www.floatrates.com/daily/c";
Debug.ShouldStop(1024);
_myw.runVoidMethod ("LoadUrl",(Object)(RemoteObject.createImmutable("http://www.floatrates.com/daily/cny.xml")));
 break; }
case 4: {
 BA.debugLineNum = 237;BA.debugLine="p2.Visible = False";
Debug.ShouldStop(4096);
main.mostCurrent._p2.runMethod(true,"setVisible",main.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 238;BA.debugLine="p7.Visible = True";
Debug.ShouldStop(8192);
main.mostCurrent._p7.runMethod(true,"setVisible",main.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 239;BA.debugLine="p7.AddView(myw, 0, 0, 100%x, 75%y) 'Your optio";
Debug.ShouldStop(16384);
main.mostCurrent._p7.runVoidMethod ("AddView",(Object)((_myw.getObject())),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(main.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 100)),main.mostCurrent.activityBA)),(Object)(main.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 75)),main.mostCurrent.activityBA)));
 BA.debugLineNum = 240;BA.debugLine="myw.LoadUrl(\"http://www.floatrates.com/daily/c";
Debug.ShouldStop(32768);
_myw.runVoidMethod ("LoadUrl",(Object)(RemoteObject.createImmutable("http://www.floatrates.com/daily/czk.xml")));
 break; }
case 5: {
 BA.debugLineNum = 242;BA.debugLine="p2.Visible = False";
Debug.ShouldStop(131072);
main.mostCurrent._p2.runMethod(true,"setVisible",main.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 243;BA.debugLine="p8.Visible = True";
Debug.ShouldStop(262144);
main.mostCurrent._p8.runMethod(true,"setVisible",main.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 244;BA.debugLine="p8.AddView(myw, 0, 0, 100%x, 75%y) 'Your optio";
Debug.ShouldStop(524288);
main.mostCurrent._p8.runVoidMethod ("AddView",(Object)((_myw.getObject())),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(main.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 100)),main.mostCurrent.activityBA)),(Object)(main.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 75)),main.mostCurrent.activityBA)));
 BA.debugLineNum = 245;BA.debugLine="myw.LoadUrl(\"http://www.floatrates.com/daily/r";
Debug.ShouldStop(1048576);
_myw.runVoidMethod ("LoadUrl",(Object)(RemoteObject.createImmutable("http://www.floatrates.com/daily/rub.xml")));
 break; }
}
;
 BA.debugLineNum = 249;BA.debugLine="End Sub";
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
 //BA.debugLineNum = 24;BA.debugLine="Dim cur1,cur2 As AutoCompleteEditText";
main.mostCurrent._cur1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.AutoCompleteEditTextWrapper");
main.mostCurrent._cur2 = RemoteObject.createNew ("anywheresoftware.b4a.objects.AutoCompleteEditTextWrapper");
 //BA.debugLineNum = 25;BA.debugLine="Dim curr_conv_rate As EditText";
main.mostCurrent._curr_conv_rate = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");
 //BA.debugLineNum = 26;BA.debugLine="Dim bu1,bu2,back_but(7) As Button";
main.mostCurrent._bu1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
main.mostCurrent._bu2 = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
main.mostCurrent._back_but = RemoteObject.createNewArray ("anywheresoftware.b4a.objects.ButtonWrapper", new int[] {7}, new Object[]{});
 //BA.debugLineNum = 27;BA.debugLine="Dim lb As Label";
main.mostCurrent._lb = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 28;BA.debugLine="Dim ed1,ed2 As EditText";
main.mostCurrent._ed1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");
main.mostCurrent._ed2 = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");
 //BA.debugLineNum = 29;BA.debugLine="Dim item_list As List";
main.mostCurrent._item_list = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
 //BA.debugLineNum = 30;BA.debugLine="Dim p1,p2,p3,p4,p5,p6,p7,p8 As Panel";
main.mostCurrent._p1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
main.mostCurrent._p2 = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
main.mostCurrent._p3 = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
main.mostCurrent._p4 = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
main.mostCurrent._p5 = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
main.mostCurrent._p6 = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
main.mostCurrent._p7 = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
main.mostCurrent._p8 = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
 //BA.debugLineNum = 31;BA.debugLine="Dim button(6) As Button";
main.mostCurrent._button = RemoteObject.createNewArray ("anywheresoftware.b4a.objects.ButtonWrapper", new int[] {6}, new Object[]{});
 //BA.debugLineNum = 32;BA.debugLine="End Sub";
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
public static RemoteObject  _setbuttontext() throws Exception{
try {
		Debug.PushSubsStack("setButtonText (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,259);
if (RapidSub.canDelegate("setbuttontext")) return b4a.example.main.remoteMe.runUserSub(false, "main","setbuttontext");
 BA.debugLineNum = 259;BA.debugLine="Sub setButtonText";
Debug.ShouldStop(4);
 BA.debugLineNum = 260;BA.debugLine="button(0).Text=\"€\"";
Debug.ShouldStop(8);
main.mostCurrent._button.getArrayElement(false,BA.numberCast(int.class, 0)).runMethod(true,"setText",BA.ObjectToCharSequence("€"));
 BA.debugLineNum = 261;BA.debugLine="button(1).Text=\"$\"";
Debug.ShouldStop(16);
main.mostCurrent._button.getArrayElement(false,BA.numberCast(int.class, 1)).runMethod(true,"setText",BA.ObjectToCharSequence("$"));
 BA.debugLineNum = 262;BA.debugLine="button(2).Text=\"Lv\"";
Debug.ShouldStop(32);
main.mostCurrent._button.getArrayElement(false,BA.numberCast(int.class, 2)).runMethod(true,"setText",BA.ObjectToCharSequence("Lv"));
 BA.debugLineNum = 263;BA.debugLine="button(3).Text=\"¥\"";
Debug.ShouldStop(64);
main.mostCurrent._button.getArrayElement(false,BA.numberCast(int.class, 3)).runMethod(true,"setText",BA.ObjectToCharSequence("¥"));
 BA.debugLineNum = 264;BA.debugLine="button(4).Text=\"Kr\"";
Debug.ShouldStop(128);
main.mostCurrent._button.getArrayElement(false,BA.numberCast(int.class, 4)).runMethod(true,"setText",BA.ObjectToCharSequence("Kr"));
 BA.debugLineNum = 265;BA.debugLine="button(5).Text=\"Rb\"";
Debug.ShouldStop(256);
main.mostCurrent._button.getArrayElement(false,BA.numberCast(int.class, 5)).runMethod(true,"setText",BA.ObjectToCharSequence("Rb"));
 BA.debugLineNum = 266;BA.debugLine="End Sub";
Debug.ShouldStop(512);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _visible() throws Exception{
try {
		Debug.PushSubsStack("Visible (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,250);
if (RapidSub.canDelegate("visible")) return b4a.example.main.remoteMe.runUserSub(false, "main","visible");
 BA.debugLineNum = 250;BA.debugLine="Sub Visible";
Debug.ShouldStop(33554432);
 BA.debugLineNum = 251;BA.debugLine="p2.Visible=False";
Debug.ShouldStop(67108864);
main.mostCurrent._p2.runMethod(true,"setVisible",main.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 252;BA.debugLine="p3.Visible=False";
Debug.ShouldStop(134217728);
main.mostCurrent._p3.runMethod(true,"setVisible",main.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 253;BA.debugLine="p4.Visible=False";
Debug.ShouldStop(268435456);
main.mostCurrent._p4.runMethod(true,"setVisible",main.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 254;BA.debugLine="p5.Visible=False";
Debug.ShouldStop(536870912);
main.mostCurrent._p5.runMethod(true,"setVisible",main.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 255;BA.debugLine="p6.Visible=False";
Debug.ShouldStop(1073741824);
main.mostCurrent._p6.runMethod(true,"setVisible",main.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 256;BA.debugLine="p7.Visible=False";
Debug.ShouldStop(-2147483648);
main.mostCurrent._p7.runMethod(true,"setVisible",main.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 257;BA.debugLine="p8.Visible = False";
Debug.ShouldStop(1);
main.mostCurrent._p8.runMethod(true,"setVisible",main.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 258;BA.debugLine="End Sub";
Debug.ShouldStop(2);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}