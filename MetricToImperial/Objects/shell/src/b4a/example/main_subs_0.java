package b4a.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class main_subs_0 {


public static RemoteObject  _activity_create(RemoteObject _firsttime) throws Exception{
try {
		Debug.PushSubsStack("Activity_Create (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,34);
if (RapidSub.canDelegate("activity_create")) return b4a.example.main.remoteMe.runUserSub(false, "main","activity_create", _firsttime);
Debug.locals.put("FirstTime", _firsttime);
 BA.debugLineNum = 34;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
Debug.ShouldStop(2);
 BA.debugLineNum = 37;BA.debugLine="start_screen_p.Initialize(\"\")";
Debug.ShouldStop(16);
main.mostCurrent._start_screen_p.runVoidMethod ("Initialize",main.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 38;BA.debugLine="weight_p.Initialize(\"\")";
Debug.ShouldStop(32);
main.mostCurrent._weight_p.runVoidMethod ("Initialize",main.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 39;BA.debugLine="length_p.Initialize(\"\")";
Debug.ShouldStop(64);
main.mostCurrent._length_p.runVoidMethod ("Initialize",main.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 40;BA.debugLine="but_weight.Initialize(\"but_weight\")";
Debug.ShouldStop(128);
main.mostCurrent._but_weight.runVoidMethod ("Initialize",main.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("but_weight")));
 BA.debugLineNum = 41;BA.debugLine="but_length.Initialize(\"but_length\")";
Debug.ShouldStop(256);
main.mostCurrent._but_length.runVoidMethod ("Initialize",main.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("but_length")));
 BA.debugLineNum = 42;BA.debugLine="lbs_lb.Initialize(\"\")";
Debug.ShouldStop(512);
main.mostCurrent._lbs_lb.runVoidMethod ("Initialize",main.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 43;BA.debugLine="kg_lb.Initialize(\"\")";
Debug.ShouldStop(1024);
main.mostCurrent._kg_lb.runVoidMethod ("Initialize",main.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 44;BA.debugLine="ed1.Initialize(\"\")";
Debug.ShouldStop(2048);
main.mostCurrent._ed1.runVoidMethod ("Initialize",main.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 45;BA.debugLine="ed2.Initialize(\"\")";
Debug.ShouldStop(4096);
main.mostCurrent._ed2.runVoidMethod ("Initialize",main.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 46;BA.debugLine="ed3.Initialize(\"\")";
Debug.ShouldStop(8192);
main.mostCurrent._ed3.runVoidMethod ("Initialize",main.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 47;BA.debugLine="ed4.Initialize(\"\")";
Debug.ShouldStop(16384);
main.mostCurrent._ed4.runVoidMethod ("Initialize",main.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 48;BA.debugLine="menu_metre.Initialize(\"\")";
Debug.ShouldStop(32768);
main.mostCurrent._menu_metre.runVoidMethod ("Initialize",main.processBA,(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 49;BA.debugLine="menu_imp.Initialize(\"\")";
Debug.ShouldStop(65536);
main.mostCurrent._menu_imp.runVoidMethod ("Initialize",main.processBA,(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 50;BA.debugLine="item_list1.Initialize()";
Debug.ShouldStop(131072);
main.mostCurrent._item_list1.runVoidMethod ("Initialize");
 BA.debugLineNum = 51;BA.debugLine="item_list2.Initialize()";
Debug.ShouldStop(262144);
main.mostCurrent._item_list2.runVoidMethod ("Initialize");
 BA.debugLineNum = 53;BA.debugLine="convert_length_b.Initialize(\"convert_length_b\")";
Debug.ShouldStop(1048576);
main.mostCurrent._convert_length_b.runVoidMethod ("Initialize",main.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("convert_length_b")));
 BA.debugLineNum = 54;BA.debugLine="convert_weight_b.Initialize(\"convert_weight_b\")";
Debug.ShouldStop(2097152);
main.mostCurrent._convert_weight_b.runVoidMethod ("Initialize",main.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("convert_weight_b")));
 BA.debugLineNum = 56;BA.debugLine="Activity.AddView(start_screen_p, 0 , 0, 100%x, 10";
Debug.ShouldStop(8388608);
main.mostCurrent._activity.runVoidMethod ("AddView",(Object)((main.mostCurrent._start_screen_p.getObject())),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(main.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 100)),main.mostCurrent.activityBA)),(Object)(main.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 100)),main.mostCurrent.activityBA)));
 BA.debugLineNum = 57;BA.debugLine="Activity.AddView(weight_p, 0, 0, 100%x, 100%y)";
Debug.ShouldStop(16777216);
main.mostCurrent._activity.runVoidMethod ("AddView",(Object)((main.mostCurrent._weight_p.getObject())),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(main.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 100)),main.mostCurrent.activityBA)),(Object)(main.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 100)),main.mostCurrent.activityBA)));
 BA.debugLineNum = 58;BA.debugLine="Activity.AddView(length_p, 0, 0, 100%x, 100%y)";
Debug.ShouldStop(33554432);
main.mostCurrent._activity.runVoidMethod ("AddView",(Object)((main.mostCurrent._length_p.getObject())),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(main.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 100)),main.mostCurrent.activityBA)),(Object)(main.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 100)),main.mostCurrent.activityBA)));
 BA.debugLineNum = 60;BA.debugLine="start_screen_p.AddView(but_weight, 10.4%x, 18.75%";
Debug.ShouldStop(134217728);
main.mostCurrent._start_screen_p.runVoidMethod ("AddView",(Object)((main.mostCurrent._but_weight.getObject())),(Object)(main.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 10.4)),main.mostCurrent.activityBA)),(Object)(main.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 18.75)),main.mostCurrent.activityBA)),(Object)(main.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 28.75)),main.mostCurrent.activityBA)),(Object)(main.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 10)),main.mostCurrent.activityBA)));
 BA.debugLineNum = 61;BA.debugLine="start_screen_p.AddView(but_length, 40.33%x, 18.75";
Debug.ShouldStop(268435456);
main.mostCurrent._start_screen_p.runVoidMethod ("AddView",(Object)((main.mostCurrent._but_length.getObject())),(Object)(main.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 40.33)),main.mostCurrent.activityBA)),(Object)(main.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 18.75)),main.mostCurrent.activityBA)),(Object)(main.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 28.75)),main.mostCurrent.activityBA)),(Object)(main.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 10)),main.mostCurrent.activityBA)));
 BA.debugLineNum = 63;BA.debugLine="but_weight.Text = \"Weight\"";
Debug.ShouldStop(1073741824);
main.mostCurrent._but_weight.runMethod(true,"setText",BA.ObjectToCharSequence("Weight"));
 BA.debugLineNum = 64;BA.debugLine="but_length.Text = \"Length\"";
Debug.ShouldStop(-2147483648);
main.mostCurrent._but_length.runMethod(true,"setText",BA.ObjectToCharSequence("Length"));
 BA.debugLineNum = 66;BA.debugLine="weight_p.AddView(ed1, 6.25%x, 4%y, 20%x, 9%y)";
Debug.ShouldStop(2);
main.mostCurrent._weight_p.runVoidMethod ("AddView",(Object)((main.mostCurrent._ed1.getObject())),(Object)(main.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 6.25)),main.mostCurrent.activityBA)),(Object)(main.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 4)),main.mostCurrent.activityBA)),(Object)(main.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 20)),main.mostCurrent.activityBA)),(Object)(main.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 9)),main.mostCurrent.activityBA)));
 BA.debugLineNum = 67;BA.debugLine="weight_p.AddView(ed2, 6.25%x, 16%y, 20%x, 9%y)";
Debug.ShouldStop(4);
main.mostCurrent._weight_p.runVoidMethod ("AddView",(Object)((main.mostCurrent._ed2.getObject())),(Object)(main.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 6.25)),main.mostCurrent.activityBA)),(Object)(main.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 16)),main.mostCurrent.activityBA)),(Object)(main.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 20)),main.mostCurrent.activityBA)),(Object)(main.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 9)),main.mostCurrent.activityBA)));
 BA.debugLineNum = 68;BA.debugLine="ed1.Color = Colors.White";
Debug.ShouldStop(8);
main.mostCurrent._ed1.runVoidMethod ("setColor",main.mostCurrent.__c.getField(false,"Colors").getField(true,"White"));
 BA.debugLineNum = 69;BA.debugLine="ed1.TextColor = Colors.Black";
Debug.ShouldStop(16);
main.mostCurrent._ed1.runMethod(true,"setTextColor",main.mostCurrent.__c.getField(false,"Colors").getField(true,"Black"));
 BA.debugLineNum = 71;BA.debugLine="ed2.Color = Colors.White";
Debug.ShouldStop(64);
main.mostCurrent._ed2.runVoidMethod ("setColor",main.mostCurrent.__c.getField(false,"Colors").getField(true,"White"));
 BA.debugLineNum = 72;BA.debugLine="ed2.TextColor = Colors.Black";
Debug.ShouldStop(128);
main.mostCurrent._ed2.runMethod(true,"setTextColor",main.mostCurrent.__c.getField(false,"Colors").getField(true,"Black"));
 BA.debugLineNum = 74;BA.debugLine="weight_p.AddView(kg_lb, 29%x, 9%y, 7.25%x, 4%y)";
Debug.ShouldStop(512);
main.mostCurrent._weight_p.runVoidMethod ("AddView",(Object)((main.mostCurrent._kg_lb.getObject())),(Object)(main.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 29)),main.mostCurrent.activityBA)),(Object)(main.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 9)),main.mostCurrent.activityBA)),(Object)(main.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 7.25)),main.mostCurrent.activityBA)),(Object)(main.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 4)),main.mostCurrent.activityBA)));
 BA.debugLineNum = 75;BA.debugLine="weight_p.AddView(lbs_lb, 29%x, 17%y, 7.25%x, 4%y)";
Debug.ShouldStop(1024);
main.mostCurrent._weight_p.runVoidMethod ("AddView",(Object)((main.mostCurrent._lbs_lb.getObject())),(Object)(main.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 29)),main.mostCurrent.activityBA)),(Object)(main.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 17)),main.mostCurrent.activityBA)),(Object)(main.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 7.25)),main.mostCurrent.activityBA)),(Object)(main.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 4)),main.mostCurrent.activityBA)));
 BA.debugLineNum = 77;BA.debugLine="weight_p.AddView(convert_weight_b, 25%x, 35%y, 30";
Debug.ShouldStop(4096);
main.mostCurrent._weight_p.runVoidMethod ("AddView",(Object)((main.mostCurrent._convert_weight_b.getObject())),(Object)(main.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 25)),main.mostCurrent.activityBA)),(Object)(main.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 35)),main.mostCurrent.activityBA)),(Object)(main.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 30)),main.mostCurrent.activityBA)),(Object)(main.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 15)),main.mostCurrent.activityBA)));
 BA.debugLineNum = 79;BA.debugLine="convert_weight_b.Text = \"Convert\"";
Debug.ShouldStop(16384);
main.mostCurrent._convert_weight_b.runMethod(true,"setText",BA.ObjectToCharSequence("Convert"));
 BA.debugLineNum = 81;BA.debugLine="kg_lb.Text = \"kg\"";
Debug.ShouldStop(65536);
main.mostCurrent._kg_lb.runMethod(true,"setText",BA.ObjectToCharSequence("kg"));
 BA.debugLineNum = 82;BA.debugLine="lbs_lb.Text = \"lbs\"";
Debug.ShouldStop(131072);
main.mostCurrent._lbs_lb.runMethod(true,"setText",BA.ObjectToCharSequence("lbs"));
 BA.debugLineNum = 84;BA.debugLine="ed1.InputType = ed1.INPUT_TYPE_DECIMAL_NUMBERS";
Debug.ShouldStop(524288);
main.mostCurrent._ed1.runMethod(true,"setInputType",main.mostCurrent._ed1.getField(true,"INPUT_TYPE_DECIMAL_NUMBERS"));
 BA.debugLineNum = 85;BA.debugLine="ed2.InputType = ed2.INPUT_TYPE_DECIMAL_NUMBERS";
Debug.ShouldStop(1048576);
main.mostCurrent._ed2.runMethod(true,"setInputType",main.mostCurrent._ed2.getField(true,"INPUT_TYPE_DECIMAL_NUMBERS"));
 BA.debugLineNum = 87;BA.debugLine="length_p.AddView(ed3, 6.25%x, 4%y, 20%x, 9%y)";
Debug.ShouldStop(4194304);
main.mostCurrent._length_p.runVoidMethod ("AddView",(Object)((main.mostCurrent._ed3.getObject())),(Object)(main.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 6.25)),main.mostCurrent.activityBA)),(Object)(main.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 4)),main.mostCurrent.activityBA)),(Object)(main.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 20)),main.mostCurrent.activityBA)),(Object)(main.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 9)),main.mostCurrent.activityBA)));
 BA.debugLineNum = 88;BA.debugLine="length_p.AddView(ed4, 6.25%x, 16%y, 20%x, 9%y)";
Debug.ShouldStop(8388608);
main.mostCurrent._length_p.runVoidMethod ("AddView",(Object)((main.mostCurrent._ed4.getObject())),(Object)(main.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 6.25)),main.mostCurrent.activityBA)),(Object)(main.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 16)),main.mostCurrent.activityBA)),(Object)(main.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 20)),main.mostCurrent.activityBA)),(Object)(main.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 9)),main.mostCurrent.activityBA)));
 BA.debugLineNum = 90;BA.debugLine="ed3.Color = Colors.White";
Debug.ShouldStop(33554432);
main.mostCurrent._ed3.runVoidMethod ("setColor",main.mostCurrent.__c.getField(false,"Colors").getField(true,"White"));
 BA.debugLineNum = 91;BA.debugLine="ed3.TextColor = Colors.Black";
Debug.ShouldStop(67108864);
main.mostCurrent._ed3.runMethod(true,"setTextColor",main.mostCurrent.__c.getField(false,"Colors").getField(true,"Black"));
 BA.debugLineNum = 93;BA.debugLine="ed4.Color = Colors.White";
Debug.ShouldStop(268435456);
main.mostCurrent._ed4.runVoidMethod ("setColor",main.mostCurrent.__c.getField(false,"Colors").getField(true,"White"));
 BA.debugLineNum = 94;BA.debugLine="ed4.TextColor = Colors.Black";
Debug.ShouldStop(536870912);
main.mostCurrent._ed4.runMethod(true,"setTextColor",main.mostCurrent.__c.getField(false,"Colors").getField(true,"Black"));
 BA.debugLineNum = 96;BA.debugLine="ed3.InputType = ed3.INPUT_TYPE_DECIMAL_NUMBERS";
Debug.ShouldStop(-2147483648);
main.mostCurrent._ed3.runMethod(true,"setInputType",main.mostCurrent._ed3.getField(true,"INPUT_TYPE_DECIMAL_NUMBERS"));
 BA.debugLineNum = 97;BA.debugLine="ed4.InputType = ed4.INPUT_TYPE_DECIMAL_NUMBERS";
Debug.ShouldStop(1);
main.mostCurrent._ed4.runMethod(true,"setInputType",main.mostCurrent._ed4.getField(true,"INPUT_TYPE_DECIMAL_NUMBERS"));
 BA.debugLineNum = 99;BA.debugLine="length_p.AddView(menu_metre, 29%x, 4%y, 25%x, 10%";
Debug.ShouldStop(4);
main.mostCurrent._length_p.runVoidMethod ("AddView",(Object)((main.mostCurrent._menu_metre.getObject())),(Object)(main.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 29)),main.mostCurrent.activityBA)),(Object)(main.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 4)),main.mostCurrent.activityBA)),(Object)(main.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 25)),main.mostCurrent.activityBA)),(Object)(main.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 10)),main.mostCurrent.activityBA)));
 BA.debugLineNum = 100;BA.debugLine="length_p.AddView(menu_imp, 29%x, 16%y , 25%x, 10%";
Debug.ShouldStop(8);
main.mostCurrent._length_p.runVoidMethod ("AddView",(Object)((main.mostCurrent._menu_imp.getObject())),(Object)(main.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 29)),main.mostCurrent.activityBA)),(Object)(main.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 16)),main.mostCurrent.activityBA)),(Object)(main.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 25)),main.mostCurrent.activityBA)),(Object)(main.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 10)),main.mostCurrent.activityBA)));
 BA.debugLineNum = 101;BA.debugLine="length_p.AddView(convert_length_b, 25%x, 35%y, 30";
Debug.ShouldStop(16);
main.mostCurrent._length_p.runVoidMethod ("AddView",(Object)((main.mostCurrent._convert_length_b.getObject())),(Object)(main.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 25)),main.mostCurrent.activityBA)),(Object)(main.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 35)),main.mostCurrent.activityBA)),(Object)(main.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 30)),main.mostCurrent.activityBA)),(Object)(main.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 15)),main.mostCurrent.activityBA)));
 BA.debugLineNum = 103;BA.debugLine="convert_length_b.Text=\"Convert\"";
Debug.ShouldStop(64);
main.mostCurrent._convert_length_b.runMethod(true,"setText",BA.ObjectToCharSequence("Convert"));
 BA.debugLineNum = 104;BA.debugLine="item_list1.Add(\"Inch\")";
Debug.ShouldStop(128);
main.mostCurrent._item_list1.runVoidMethod ("Add",(Object)((RemoteObject.createImmutable("Inch"))));
 BA.debugLineNum = 105;BA.debugLine="item_list1.Add(\"Foot\")";
Debug.ShouldStop(256);
main.mostCurrent._item_list1.runVoidMethod ("Add",(Object)((RemoteObject.createImmutable("Foot"))));
 BA.debugLineNum = 106;BA.debugLine="item_list1.Add(\"Yard\")";
Debug.ShouldStop(512);
main.mostCurrent._item_list1.runVoidMethod ("Add",(Object)((RemoteObject.createImmutable("Yard"))));
 BA.debugLineNum = 107;BA.debugLine="item_list1.Add(\"Mile\")";
Debug.ShouldStop(1024);
main.mostCurrent._item_list1.runVoidMethod ("Add",(Object)((RemoteObject.createImmutable("Mile"))));
 BA.debugLineNum = 108;BA.debugLine="menu_imp.SetItems(item_list1)";
Debug.ShouldStop(2048);
main.mostCurrent._menu_imp.runVoidMethod ("SetItems",main.processBA,(Object)(main.mostCurrent._item_list1));
 BA.debugLineNum = 110;BA.debugLine="item_list2.Add(\"Km\")";
Debug.ShouldStop(8192);
main.mostCurrent._item_list2.runVoidMethod ("Add",(Object)((RemoteObject.createImmutable("Km"))));
 BA.debugLineNum = 111;BA.debugLine="item_list2.Add(\"Metre\")";
Debug.ShouldStop(16384);
main.mostCurrent._item_list2.runVoidMethod ("Add",(Object)((RemoteObject.createImmutable("Metre"))));
 BA.debugLineNum = 112;BA.debugLine="menu_metre.SetItems(item_list2)";
Debug.ShouldStop(32768);
main.mostCurrent._menu_metre.runVoidMethod ("SetItems",main.processBA,(Object)(main.mostCurrent._item_list2));
 BA.debugLineNum = 114;BA.debugLine="menu_imp.TextColor = Colors.Black";
Debug.ShouldStop(131072);
main.mostCurrent._menu_imp.runMethod(true,"setTextColor",main.mostCurrent.__c.getField(false,"Colors").getField(true,"Black"));
 BA.debugLineNum = 115;BA.debugLine="menu_imp.Color = Colors.White";
Debug.ShouldStop(262144);
main.mostCurrent._menu_imp.runVoidMethod ("setColor",main.mostCurrent.__c.getField(false,"Colors").getField(true,"White"));
 BA.debugLineNum = 116;BA.debugLine="menu_metre.TextColor = Colors.Black";
Debug.ShouldStop(524288);
main.mostCurrent._menu_metre.runMethod(true,"setTextColor",main.mostCurrent.__c.getField(false,"Colors").getField(true,"Black"));
 BA.debugLineNum = 117;BA.debugLine="menu_metre.Color = Colors.White";
Debug.ShouldStop(1048576);
main.mostCurrent._menu_metre.runVoidMethod ("setColor",main.mostCurrent.__c.getField(false,"Colors").getField(true,"White"));
 BA.debugLineNum = 119;BA.debugLine="weight_p.Visible = False";
Debug.ShouldStop(4194304);
main.mostCurrent._weight_p.runMethod(true,"setVisible",main.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 120;BA.debugLine="length_p.Visible = False";
Debug.ShouldStop(8388608);
main.mostCurrent._length_p.runMethod(true,"setVisible",main.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 122;BA.debugLine="End Sub";
Debug.ShouldStop(33554432);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _activity_keypress(RemoteObject _keycode) throws Exception{
try {
		Debug.PushSubsStack("Activity_KeyPress (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,131);
if (RapidSub.canDelegate("activity_keypress")) return b4a.example.main.remoteMe.runUserSub(false, "main","activity_keypress", _keycode);
Debug.locals.put("KeyCode", _keycode);
 BA.debugLineNum = 131;BA.debugLine="Sub Activity_KeyPress (KeyCode As Int) As Boolean";
Debug.ShouldStop(4);
 BA.debugLineNum = 132;BA.debugLine="If KeyCode=KeyCodes.KEYCODE_BACK Then";
Debug.ShouldStop(8);
if (RemoteObject.solveBoolean("=",_keycode,BA.numberCast(double.class, main.mostCurrent.__c.getField(false,"KeyCodes").getField(true,"KEYCODE_BACK")))) { 
 BA.debugLineNum = 134;BA.debugLine="If  start_screen_p.Visible==True Then";
Debug.ShouldStop(32);
if (RemoteObject.solveBoolean("=",main.mostCurrent._start_screen_p.runMethod(true,"getVisible"),main.mostCurrent.__c.getField(true,"True"))) { 
 BA.debugLineNum = 135;BA.debugLine="Return False";
Debug.ShouldStop(64);
if (true) return main.mostCurrent.__c.getField(true,"False");
 }else {
 BA.debugLineNum = 137;BA.debugLine="length_p.Visible=False";
Debug.ShouldStop(256);
main.mostCurrent._length_p.runMethod(true,"setVisible",main.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 138;BA.debugLine="weight_p.Visible=False";
Debug.ShouldStop(512);
main.mostCurrent._weight_p.runMethod(true,"setVisible",main.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 139;BA.debugLine="start_screen_p.Visible=True";
Debug.ShouldStop(1024);
main.mostCurrent._start_screen_p.runMethod(true,"setVisible",main.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 140;BA.debugLine="Return True";
Debug.ShouldStop(2048);
if (true) return main.mostCurrent.__c.getField(true,"True");
 };
 };
 BA.debugLineNum = 149;BA.debugLine="End Sub";
Debug.ShouldStop(1048576);
return RemoteObject.createImmutable(false);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _activity_pause(RemoteObject _userclosed) throws Exception{
try {
		Debug.PushSubsStack("Activity_Pause (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,128);
if (RapidSub.canDelegate("activity_pause")) return b4a.example.main.remoteMe.runUserSub(false, "main","activity_pause", _userclosed);
Debug.locals.put("UserClosed", _userclosed);
 BA.debugLineNum = 128;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
Debug.ShouldStop(-2147483648);
 BA.debugLineNum = 130;BA.debugLine="End Sub";
Debug.ShouldStop(2);
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
		Debug.PushSubsStack("Activity_Resume (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,124);
if (RapidSub.canDelegate("activity_resume")) return b4a.example.main.remoteMe.runUserSub(false, "main","activity_resume");
 BA.debugLineNum = 124;BA.debugLine="Sub Activity_Resume";
Debug.ShouldStop(134217728);
 BA.debugLineNum = 126;BA.debugLine="End Sub";
Debug.ShouldStop(536870912);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _but_length_click() throws Exception{
try {
		Debug.PushSubsStack("but_length_Click (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,155);
if (RapidSub.canDelegate("but_length_click")) return b4a.example.main.remoteMe.runUserSub(false, "main","but_length_click");
 BA.debugLineNum = 155;BA.debugLine="Sub but_length_Click";
Debug.ShouldStop(67108864);
 BA.debugLineNum = 156;BA.debugLine="start_screen_p.Visible=False";
Debug.ShouldStop(134217728);
main.mostCurrent._start_screen_p.runMethod(true,"setVisible",main.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 157;BA.debugLine="length_p.Visible=True";
Debug.ShouldStop(268435456);
main.mostCurrent._length_p.runMethod(true,"setVisible",main.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 159;BA.debugLine="End Sub";
Debug.ShouldStop(1073741824);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _but_weight_click() throws Exception{
try {
		Debug.PushSubsStack("but_weight_Click (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,150);
if (RapidSub.canDelegate("but_weight_click")) return b4a.example.main.remoteMe.runUserSub(false, "main","but_weight_click");
 BA.debugLineNum = 150;BA.debugLine="Sub but_weight_Click";
Debug.ShouldStop(2097152);
 BA.debugLineNum = 151;BA.debugLine="start_screen_p.Visible=False";
Debug.ShouldStop(4194304);
main.mostCurrent._start_screen_p.runMethod(true,"setVisible",main.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 152;BA.debugLine="weight_p.Visible=True";
Debug.ShouldStop(8388608);
main.mostCurrent._weight_p.runMethod(true,"setVisible",main.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 154;BA.debugLine="End Sub";
Debug.ShouldStop(33554432);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _convert_length_b_click() throws Exception{
try {
		Debug.PushSubsStack("convert_length_b_Click (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,161);
if (RapidSub.canDelegate("convert_length_b_click")) return b4a.example.main.remoteMe.runUserSub(false, "main","convert_length_b_click");
RemoteObject _meter = RemoteObject.createImmutable(0);
RemoteObject _imp_unit = RemoteObject.createImmutable(0);
RemoteObject _res1 = RemoteObject.createImmutable(0);
RemoteObject _res2 = RemoteObject.createImmutable(0);
 BA.debugLineNum = 161;BA.debugLine="Sub convert_length_b_Click";
Debug.ShouldStop(1);
 BA.debugLineNum = 162;BA.debugLine="Dim meter,imp_unit,res1,res2 As Double = 0";
Debug.ShouldStop(2);
_meter = RemoteObject.createImmutable(0);Debug.locals.put("meter", _meter);
_imp_unit = RemoteObject.createImmutable(0);Debug.locals.put("imp_unit", _imp_unit);
_res1 = RemoteObject.createImmutable(0);Debug.locals.put("res1", _res1);
_res2 = BA.numberCast(double.class, 0);Debug.locals.put("res2", _res2);Debug.locals.put("res2", _res2);
 BA.debugLineNum = 163;BA.debugLine="If menu_metre.Text<>\"\" And menu_imp.Text<>\"\" Then";
Debug.ShouldStop(4);
if (RemoteObject.solveBoolean("!",main.mostCurrent._menu_metre.runMethod(true,"getText"),BA.ObjectToString("")) && RemoteObject.solveBoolean("!",main.mostCurrent._menu_imp.runMethod(true,"getText"),BA.ObjectToString(""))) { 
 BA.debugLineNum = 165;BA.debugLine="If ed3.Text <> \"\" Then";
Debug.ShouldStop(16);
if (RemoteObject.solveBoolean("!",main.mostCurrent._ed3.runMethod(true,"getText"),BA.ObjectToString(""))) { 
 BA.debugLineNum = 166;BA.debugLine="meter=ed3.Text";
Debug.ShouldStop(32);
_meter = BA.numberCast(double.class, main.mostCurrent._ed3.runMethod(true,"getText"));Debug.locals.put("meter", _meter);
 BA.debugLineNum = 167;BA.debugLine="If menu_metre.Text=\"Km\" Then";
Debug.ShouldStop(64);
if (RemoteObject.solveBoolean("=",main.mostCurrent._menu_metre.runMethod(true,"getText"),BA.ObjectToString("Km"))) { 
 BA.debugLineNum = 168;BA.debugLine="meter = meter*1000";
Debug.ShouldStop(128);
_meter = RemoteObject.solve(new RemoteObject[] {_meter,RemoteObject.createImmutable(1000)}, "*",0, 0);Debug.locals.put("meter", _meter);
 };
 BA.debugLineNum = 170;BA.debugLine="If menu_imp.Text=\"Inch\" Then";
Debug.ShouldStop(512);
if (RemoteObject.solveBoolean("=",main.mostCurrent._menu_imp.runMethod(true,"getText"),BA.ObjectToString("Inch"))) { 
 BA.debugLineNum = 171;BA.debugLine="res1=meter*39.3700787";
Debug.ShouldStop(1024);
_res1 = RemoteObject.solve(new RemoteObject[] {_meter,RemoteObject.createImmutable(39.3700787)}, "*",0, 0);Debug.locals.put("res1", _res1);
 };
 BA.debugLineNum = 173;BA.debugLine="If menu_imp.Text=\"Foot\" Then";
Debug.ShouldStop(4096);
if (RemoteObject.solveBoolean("=",main.mostCurrent._menu_imp.runMethod(true,"getText"),BA.ObjectToString("Foot"))) { 
 BA.debugLineNum = 174;BA.debugLine="res1=meter*3.2808399";
Debug.ShouldStop(8192);
_res1 = RemoteObject.solve(new RemoteObject[] {_meter,RemoteObject.createImmutable(3.2808399)}, "*",0, 0);Debug.locals.put("res1", _res1);
 };
 BA.debugLineNum = 176;BA.debugLine="If menu_imp.Text=\"Yard\" Then";
Debug.ShouldStop(32768);
if (RemoteObject.solveBoolean("=",main.mostCurrent._menu_imp.runMethod(true,"getText"),BA.ObjectToString("Yard"))) { 
 BA.debugLineNum = 177;BA.debugLine="res1=meter*1.0936133";
Debug.ShouldStop(65536);
_res1 = RemoteObject.solve(new RemoteObject[] {_meter,RemoteObject.createImmutable(1.0936133)}, "*",0, 0);Debug.locals.put("res1", _res1);
 };
 BA.debugLineNum = 179;BA.debugLine="If menu_imp.Text=\"Mile\" Then";
Debug.ShouldStop(262144);
if (RemoteObject.solveBoolean("=",main.mostCurrent._menu_imp.runMethod(true,"getText"),BA.ObjectToString("Mile"))) { 
 BA.debugLineNum = 180;BA.debugLine="res1=meter*0.000621371192";
Debug.ShouldStop(524288);
_res1 = RemoteObject.solve(new RemoteObject[] {_meter,RemoteObject.createImmutable(0.000621371192)}, "*",0, 0);Debug.locals.put("res1", _res1);
 };
 };
 BA.debugLineNum = 184;BA.debugLine="If ed4.Text <> \"\" Then";
Debug.ShouldStop(8388608);
if (RemoteObject.solveBoolean("!",main.mostCurrent._ed4.runMethod(true,"getText"),BA.ObjectToString(""))) { 
 BA.debugLineNum = 185;BA.debugLine="imp_unit=ed4.Text";
Debug.ShouldStop(16777216);
_imp_unit = BA.numberCast(double.class, main.mostCurrent._ed4.runMethod(true,"getText"));Debug.locals.put("imp_unit", _imp_unit);
 BA.debugLineNum = 187;BA.debugLine="If menu_metre.Text=\"Km\" Then";
Debug.ShouldStop(67108864);
if (RemoteObject.solveBoolean("=",main.mostCurrent._menu_metre.runMethod(true,"getText"),BA.ObjectToString("Km"))) { 
 BA.debugLineNum = 188;BA.debugLine="imp_unit = imp_unit/1000";
Debug.ShouldStop(134217728);
_imp_unit = RemoteObject.solve(new RemoteObject[] {_imp_unit,RemoteObject.createImmutable(1000)}, "/",0, 0);Debug.locals.put("imp_unit", _imp_unit);
 };
 BA.debugLineNum = 190;BA.debugLine="If menu_imp.Text=\"Inch\" Then";
Debug.ShouldStop(536870912);
if (RemoteObject.solveBoolean("=",main.mostCurrent._menu_imp.runMethod(true,"getText"),BA.ObjectToString("Inch"))) { 
 BA.debugLineNum = 191;BA.debugLine="res2=imp_unit/39.3700787";
Debug.ShouldStop(1073741824);
_res2 = RemoteObject.solve(new RemoteObject[] {_imp_unit,RemoteObject.createImmutable(39.3700787)}, "/",0, 0);Debug.locals.put("res2", _res2);
 };
 BA.debugLineNum = 193;BA.debugLine="If menu_imp.Text=\"Foot\" Then";
Debug.ShouldStop(1);
if (RemoteObject.solveBoolean("=",main.mostCurrent._menu_imp.runMethod(true,"getText"),BA.ObjectToString("Foot"))) { 
 BA.debugLineNum = 194;BA.debugLine="res2=imp_unit/3.2808399";
Debug.ShouldStop(2);
_res2 = RemoteObject.solve(new RemoteObject[] {_imp_unit,RemoteObject.createImmutable(3.2808399)}, "/",0, 0);Debug.locals.put("res2", _res2);
 };
 BA.debugLineNum = 196;BA.debugLine="If menu_imp.Text=\"Yard\" Then";
Debug.ShouldStop(8);
if (RemoteObject.solveBoolean("=",main.mostCurrent._menu_imp.runMethod(true,"getText"),BA.ObjectToString("Yard"))) { 
 BA.debugLineNum = 197;BA.debugLine="res2=imp_unit/1.0936133";
Debug.ShouldStop(16);
_res2 = RemoteObject.solve(new RemoteObject[] {_imp_unit,RemoteObject.createImmutable(1.0936133)}, "/",0, 0);Debug.locals.put("res2", _res2);
 };
 BA.debugLineNum = 199;BA.debugLine="If menu_imp.Text=\"Mile\" Then";
Debug.ShouldStop(64);
if (RemoteObject.solveBoolean("=",main.mostCurrent._menu_imp.runMethod(true,"getText"),BA.ObjectToString("Mile"))) { 
 BA.debugLineNum = 200;BA.debugLine="res2=imp_unit/0.000621371192";
Debug.ShouldStop(128);
_res2 = RemoteObject.solve(new RemoteObject[] {_imp_unit,RemoteObject.createImmutable(0.000621371192)}, "/",0, 0);Debug.locals.put("res2", _res2);
 };
 };
 BA.debugLineNum = 207;BA.debugLine="Msgbox(menu_metre.Text & \" to \" & menu_imp.Text";
Debug.ShouldStop(16384);
main.mostCurrent.__c.runVoidMethodAndSync ("Msgbox",(Object)(BA.ObjectToCharSequence(RemoteObject.concat(main.mostCurrent._menu_metre.runMethod(true,"getText"),RemoteObject.createImmutable(" to "),main.mostCurrent._menu_imp.runMethod(true,"getText"),RemoteObject.createImmutable(": "),_res1,main.mostCurrent.__c.getField(true,"CRLF"),main.mostCurrent._menu_imp.runMethod(true,"getText"),RemoteObject.createImmutable(" to  "),main.mostCurrent._menu_metre.runMethod(true,"getText"),RemoteObject.createImmutable(": "),_res2))),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("conversion"))),main.mostCurrent.activityBA);
 };
 BA.debugLineNum = 210;BA.debugLine="If menu_metre.Text=\"\" Or menu_imp.Text=\"\" Then";
Debug.ShouldStop(131072);
if (RemoteObject.solveBoolean("=",main.mostCurrent._menu_metre.runMethod(true,"getText"),BA.ObjectToString("")) || RemoteObject.solveBoolean("=",main.mostCurrent._menu_imp.runMethod(true,"getText"),BA.ObjectToString(""))) { 
 BA.debugLineNum = 211;BA.debugLine="Msgbox(\"Please choose units from the dropdown me";
Debug.ShouldStop(262144);
main.mostCurrent.__c.runVoidMethodAndSync ("Msgbox",(Object)(BA.ObjectToCharSequence("Please choose units from the dropdown menu!!! ")),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("Opps"))),main.mostCurrent.activityBA);
 };
 BA.debugLineNum = 214;BA.debugLine="End Sub";
Debug.ShouldStop(2097152);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _convert_weight_b_click() throws Exception{
try {
		Debug.PushSubsStack("convert_weight_b_Click (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,216);
if (RapidSub.canDelegate("convert_weight_b_click")) return b4a.example.main.remoteMe.runUserSub(false, "main","convert_weight_b_click");
RemoteObject _kg = RemoteObject.createImmutable(0);
RemoteObject _lbs = RemoteObject.createImmutable(0);
RemoteObject _res1 = RemoteObject.createImmutable(0);
RemoteObject _res2 = RemoteObject.createImmutable(0);
 BA.debugLineNum = 216;BA.debugLine="Sub convert_weight_b_Click";
Debug.ShouldStop(8388608);
 BA.debugLineNum = 217;BA.debugLine="Dim kg,lbs,res1,res2 As Double = 0";
Debug.ShouldStop(16777216);
_kg = RemoteObject.createImmutable(0);Debug.locals.put("kg", _kg);
_lbs = RemoteObject.createImmutable(0);Debug.locals.put("lbs", _lbs);
_res1 = RemoteObject.createImmutable(0);Debug.locals.put("res1", _res1);
_res2 = BA.numberCast(double.class, 0);Debug.locals.put("res2", _res2);Debug.locals.put("res2", _res2);
 BA.debugLineNum = 219;BA.debugLine="If ed1.Text<>\"\" Then";
Debug.ShouldStop(67108864);
if (RemoteObject.solveBoolean("!",main.mostCurrent._ed1.runMethod(true,"getText"),BA.ObjectToString(""))) { 
 BA.debugLineNum = 220;BA.debugLine="kg=ed1.Text";
Debug.ShouldStop(134217728);
_kg = BA.numberCast(double.class, main.mostCurrent._ed1.runMethod(true,"getText"));Debug.locals.put("kg", _kg);
 BA.debugLineNum = 221;BA.debugLine="res1=kg*2.20462262";
Debug.ShouldStop(268435456);
_res1 = RemoteObject.solve(new RemoteObject[] {_kg,RemoteObject.createImmutable(2.20462262)}, "*",0, 0);Debug.locals.put("res1", _res1);
 };
 BA.debugLineNum = 223;BA.debugLine="If ed2.Text<>\"\" Then";
Debug.ShouldStop(1073741824);
if (RemoteObject.solveBoolean("!",main.mostCurrent._ed2.runMethod(true,"getText"),BA.ObjectToString(""))) { 
 BA.debugLineNum = 224;BA.debugLine="lbs=ed2.Text";
Debug.ShouldStop(-2147483648);
_lbs = BA.numberCast(double.class, main.mostCurrent._ed2.runMethod(true,"getText"));Debug.locals.put("lbs", _lbs);
 BA.debugLineNum = 225;BA.debugLine="res2=lbs/2.20462262";
Debug.ShouldStop(1);
_res2 = RemoteObject.solve(new RemoteObject[] {_lbs,RemoteObject.createImmutable(2.20462262)}, "/",0, 0);Debug.locals.put("res2", _res2);
 };
 BA.debugLineNum = 227;BA.debugLine="Msgbox(\"kg to lbs: \" & res1 & CRLF & \"lbs to kg:";
Debug.ShouldStop(4);
main.mostCurrent.__c.runVoidMethodAndSync ("Msgbox",(Object)(BA.ObjectToCharSequence(RemoteObject.concat(RemoteObject.createImmutable("kg to lbs: "),_res1,main.mostCurrent.__c.getField(true,"CRLF"),RemoteObject.createImmutable("lbs to kg: "),_res2))),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("conversion"))),main.mostCurrent.activityBA);
 BA.debugLineNum = 228;BA.debugLine="End Sub";
Debug.ShouldStop(8);
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
 //BA.debugLineNum = 24;BA.debugLine="Dim start_screen_p,weight_p,length_p As Panel";
main.mostCurrent._start_screen_p = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
main.mostCurrent._weight_p = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
main.mostCurrent._length_p = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
 //BA.debugLineNum = 25;BA.debugLine="Dim but_weight,but_length As Button";
main.mostCurrent._but_weight = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
main.mostCurrent._but_length = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 26;BA.debugLine="Dim lbs_lb,kg_lb As Label";
main.mostCurrent._lbs_lb = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
main.mostCurrent._kg_lb = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 27;BA.debugLine="Dim ed1,ed2,ed3,ed4 As EditText";
main.mostCurrent._ed1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");
main.mostCurrent._ed2 = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");
main.mostCurrent._ed3 = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");
main.mostCurrent._ed4 = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");
 //BA.debugLineNum = 28;BA.debugLine="Dim menu_metre,menu_imp As AutoCompleteEditText";
main.mostCurrent._menu_metre = RemoteObject.createNew ("anywheresoftware.b4a.objects.AutoCompleteEditTextWrapper");
main.mostCurrent._menu_imp = RemoteObject.createNew ("anywheresoftware.b4a.objects.AutoCompleteEditTextWrapper");
 //BA.debugLineNum = 29;BA.debugLine="Dim item_list1,item_list2 As List";
main.mostCurrent._item_list1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
main.mostCurrent._item_list2 = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
 //BA.debugLineNum = 30;BA.debugLine="Dim convert_weight_b, convert_length_b As Button";
main.mostCurrent._convert_weight_b = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
main.mostCurrent._convert_length_b = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
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
}