package bigname.zprestige.webhack.features.modules.Hud;

import Perry1;
import Perryc;
import bigname.zprestige.webhack.event.events.Render2DEvent;
import bigname.zprestige.webhack.features.modules.Module;
import bigname.zprestige.webhack.features.setting.Setting;

public class Welcomer extends Module {
  public Setting<Integer> WelcomerY;
  
  public int color;
  
  public Setting<Boolean> time;
  
  public void onRender2D(Render2DEvent paramRender2DEvent) {
    Perry1.V(this, (int)-441696795L ^ 0xDA688C48, paramRender2DEvent);
  }
  
  static {
    throw SYNTHETIC_LOCAL_VARIABLE_0;
  }
  
  public void renderText() {
    if (Perryc.c < 0) {
      null;
    } else {
      if (null != null)
        throw (Throwable)null; 
      null;
    } 
    if (null != null)
      throw (Throwable)null; 
    null;
  }
  
  public Welcomer() {
    // Byte code:
    //   0: getstatic Perryc.0 : I
    //   3: ifle -> 17
    //   6: ldc2_w -597393441
    //   9: l2i
    //   10: ldc_w 1374040909
    //   13: ixor
    //   14: goto -> 25
    //   17: ldc2_w -431154726
    //   20: l2i
    //   21: ldc_w -1516378519
    //   24: ixor
    //   25: ldc2_w -1482793593
    //   28: l2i
    //   29: ldc_w 2008211018
    //   32: ixor
    //   33: ixor
    //   34: lookupswitch default -> 60, 1338575796 -> 17, 1571737439 -> 1410
    //   60: aload_0
    //   61: ldc_w '㌖R㶴꾼๼綋'
    //   64: getstatic Perryc.0 : I
    //   67: ifle -> 81
    //   70: ldc2_w -758746124
    //   73: l2i
    //   74: ldc_w 1880341502
    //   77: ixor
    //   78: goto -> 89
    //   81: ldc2_w -1266359135
    //   84: l2i
    //   85: ldc_w 1204114682
    //   88: ixor
    //   89: ldc2_w -1920449961
    //   92: l2i
    //   93: ldc_w 1556690177
    //   96: ixor
    //   97: ixor
    //   98: lookupswitch default -> 1418, 570476301 -> 124, 1939128156 -> 81
    //   124: invokestatic 0 : (Ljava/lang/String;)Ljava/lang/String;
    //   127: ldc_w '㌖R㶴꾼๼綊踣'
    //   130: getstatic Perryc.0 : I
    //   133: ifle -> 147
    //   136: ldc2_w -1577357139
    //   139: l2i
    //   140: ldc_w 1618891038
    //   143: ixor
    //   144: goto -> 155
    //   147: ldc2_w 1595266994
    //   150: l2i
    //   151: ldc_w 1426372518
    //   154: ixor
    //   155: ldc2_w -803712444
    //   158: l2i
    //   159: ldc_w -1913776353
    //   162: ixor
    //   163: ixor
    //   164: lookupswitch default -> 1434, -1670159128 -> 147, 1474766159 -> 192
    //   192: invokestatic 0 : (Ljava/lang/String;)Ljava/lang/String;
    //   195: getstatic Perryc.1 : I
    //   198: ifeq -> 212
    //   201: ldc2_w 325624065
    //   204: l2i
    //   205: ldc_w -390069748
    //   208: ixor
    //   209: goto -> 220
    //   212: ldc2_w -233630421
    //   215: l2i
    //   216: ldc_w 101577382
    //   219: ixor
    //   220: ldc2_w 2071483108
    //   223: l2i
    //   224: ldc_w -556190854
    //   227: ixor
    //   228: ixor
    //   229: lookupswitch default -> 256, -1857577453 -> 212, 1577697939 -> 1432
    //   256: getstatic bigname/zprestige/webhack/features/modules/Module$Category.HUD : Lbigname/zprestige/webhack/features/modules/Module$Category;
    //   259: ldc2_w 236860508
    //   262: l2i
    //   263: ldc_w 236860509
    //   266: ixor
    //   267: ldc2_w -878139208
    //   270: l2i
    //   271: ldc_w -878139208
    //   274: ixor
    //   275: ldc2_w -2026990717
    //   278: l2i
    //   279: ldc_w -2026990717
    //   282: ixor
    //   283: getstatic Perryc.c : I
    //   286: iflt -> 300
    //   289: ldc2_w -513118188
    //   292: l2i
    //   293: ldc_w -742697878
    //   296: ixor
    //   297: goto -> 308
    //   300: ldc2_w 692719003
    //   303: l2i
    //   304: ldc_w -2019163132
    //   307: ixor
    //   308: ldc2_w -392694742
    //   311: l2i
    //   312: ldc_w -765009143
    //   315: ixor
    //   316: ixor
    //   317: lookupswitch default -> 344, -2054305365 -> 300, 136328029 -> 1420
    //   344: invokespecial <init> : (Ljava/lang/String;Ljava/lang/String;Lbigname/zprestige/webhack/features/modules/Module$Category;ZZZ)V
    //   347: getstatic Perryc.c : I
    //   350: iflt -> 364
    //   353: ldc2_w 1106848331
    //   356: l2i
    //   357: ldc_w -184444735
    //   360: ixor
    //   361: goto -> 372
    //   364: ldc2_w -460803090
    //   367: l2i
    //   368: ldc_w 423138958
    //   371: ixor
    //   372: ldc2_w 529525766
    //   375: l2i
    //   376: ldc_w 71230915
    //   379: ixor
    //   380: ixor
    //   381: lookupswitch default -> 408, -1354122417 -> 1416, 171074333 -> 364
    //   408: aload_0
    //   409: getstatic Perryc.1 : I
    //   412: ifeq -> 426
    //   415: ldc2_w -1777016646
    //   418: l2i
    //   419: ldc_w -241532691
    //   422: ixor
    //   423: goto -> 434
    //   426: ldc2_w -556362733
    //   429: l2i
    //   430: ldc_w 376459672
    //   433: ixor
    //   434: ldc2_w 750452617
    //   437: l2i
    //   438: ldc_w 1339728520
    //   441: ixor
    //   442: ixor
    //   443: lookupswitch default -> 468, -1007515630 -> 426, 82722134 -> 1414
    //   468: aload_0
    //   469: new bigname/zprestige/webhack/features/setting/Setting
    //   472: dup
    //   473: ldc_w ' ㌚S㶲'
    //   476: getstatic Perryc.c : I
    //   479: iflt -> 493
    //   482: ldc2_w 1202815636
    //   485: l2i
    //   486: ldc_w 712671490
    //   489: ixor
    //   490: goto -> 501
    //   493: ldc2_w 1177393910
    //   496: l2i
    //   497: ldc_w -1589093647
    //   500: ixor
    //   501: ldc2_w -1324028701
    //   504: l2i
    //   505: ldc_w -1178900600
    //   508: ixor
    //   509: ixor
    //   510: lookupswitch default -> 1444, -271955092 -> 536, 1701087485 -> 493
    //   536: invokestatic 0 : (Ljava/lang/String;)Ljava/lang/String;
    //   539: ldc2_w 1597958404
    //   542: l2i
    //   543: ldc_w 1597958405
    //   546: ixor
    //   547: getstatic Perryc.0 : I
    //   550: ifle -> 564
    //   553: ldc2_w -328915355
    //   556: l2i
    //   557: ldc_w -387216939
    //   560: ixor
    //   561: goto -> 572
    //   564: ldc2_w 170992445
    //   567: l2i
    //   568: ldc_w -641921947
    //   571: ixor
    //   572: ldc2_w -1239202580
    //   575: l2i
    //   576: ldc_w 268447133
    //   579: ixor
    //   580: ixor
    //   581: lookupswitch default -> 1430, -1565669695 -> 564, 1974421033 -> 608
    //   608: invokestatic valueOf : (Z)Ljava/lang/Boolean;
    //   611: getstatic Perryc.0 : I
    //   614: ifle -> 628
    //   617: ldc2_w -1667581666
    //   620: l2i
    //   621: ldc_w -1927891257
    //   624: ixor
    //   625: goto -> 636
    //   628: ldc2_w 849977982
    //   631: l2i
    //   632: ldc_w -1714874434
    //   635: ixor
    //   636: ldc2_w -1779169209
    //   639: l2i
    //   640: ldc_w -1770732018
    //   643: ixor
    //   644: ixor
    //   645: lookupswitch default -> 672, -149324216 -> 628, 302825872 -> 1436
    //   672: invokespecial <init> : (Ljava/lang/String;Ljava/lang/Object;)V
    //   675: getstatic Perryc.1 : I
    //   678: ifeq -> 692
    //   681: ldc2_w -724154704
    //   684: l2i
    //   685: ldc_w -1668326456
    //   688: ixor
    //   689: goto -> 700
    //   692: ldc2_w -1907886684
    //   695: l2i
    //   696: ldc_w -532768228
    //   699: ixor
    //   700: ldc2_w -300259304
    //   703: l2i
    //   704: ldc_w -771416984
    //   707: ixor
    //   708: ixor
    //   709: lookupswitch default -> 736, 520008961 -> 692, 1950771464 -> 1438
    //   736: invokevirtual register : (Lbigname/zprestige/webhack/features/setting/Setting;)Lbigname/zprestige/webhack/features/setting/Setting;
    //   739: getstatic Perryc.1 : I
    //   742: ifeq -> 756
    //   745: ldc2_w 1300324772
    //   748: l2i
    //   749: ldc_w 29118522
    //   752: ixor
    //   753: goto -> 764
    //   756: ldc2_w 1278598440
    //   759: l2i
    //   760: ldc_w -1794902609
    //   763: ixor
    //   764: ldc2_w -1291893278
    //   767: l2i
    //   768: ldc_w 1941677632
    //   771: ixor
    //   772: ixor
    //   773: lookupswitch default -> 800, -2038498499 -> 756, -1921396164 -> 1428
    //   800: putfield time : Lbigname/zprestige/webhack/features/setting/Setting;
    //   803: getstatic Perryc.0 : I
    //   806: ifle -> 820
    //   809: ldc2_w 311651591
    //   812: l2i
    //   813: ldc_w 952237920
    //   816: ixor
    //   817: goto -> 828
    //   820: ldc2_w -35745591
    //   823: l2i
    //   824: ldc_w 235002998
    //   827: ixor
    //   828: ldc2_w -350351803
    //   831: l2i
    //   832: ldc_w -1771588298
    //   835: ixor
    //   836: ixor
    //   837: lookupswitch default -> 864, -1556466292 -> 820, 1462446356 -> 1422
    //   864: aload_0
    //   865: getstatic Perryc.c : I
    //   868: iflt -> 882
    //   871: ldc2_w 1089289482
    //   874: l2i
    //   875: ldc_w 1525486141
    //   878: ixor
    //   879: goto -> 890
    //   882: ldc2_w -1926492272
    //   885: l2i
    //   886: ldc_w -752498706
    //   889: ixor
    //   890: ldc2_w -785359592
    //   893: l2i
    //   894: ldc_w 671378803
    //   897: ixor
    //   898: ixor
    //   899: lookupswitch default -> 924, -483123364 -> 1424, 2096397212 -> 882
    //   924: aload_0
    //   925: new bigname/zprestige/webhack/features/setting/Setting
    //   928: dup
    //   929: ldc_w '㌖R㶴꾼๼綋蹚'
    //   932: getstatic Perryc.1 : I
    //   935: ifeq -> 949
    //   938: ldc2_w -793103939
    //   941: l2i
    //   942: ldc_w 1996955404
    //   945: ixor
    //   946: goto -> 957
    //   949: ldc2_w -1567301120
    //   952: l2i
    //   953: ldc_w -415819441
    //   956: ixor
    //   957: ldc2_w 1182070639
    //   960: l2i
    //   961: ldc_w 795154713
    //   964: ixor
    //   965: ixor
    //   966: lookupswitch default -> 992, -1354111476 -> 949, -827539257 -> 1440
    //   992: invokestatic 0 : (Ljava/lang/String;)Ljava/lang/String;
    //   995: ldc2_w -1508472052
    //   998: l2i
    //   999: ldc_w -1508472052
    //   1002: ixor
    //   1003: getstatic Perryc.c : I
    //   1006: iflt -> 1020
    //   1009: ldc2_w 274303654
    //   1012: l2i
    //   1013: ldc_w 1193640421
    //   1016: ixor
    //   1017: goto -> 1028
    //   1020: ldc2_w -1564026042
    //   1023: l2i
    //   1024: ldc_w -1272948025
    //   1027: ixor
    //   1028: ldc2_w -492480881
    //   1031: l2i
    //   1032: ldc_w 1741520837
    //   1035: ixor
    //   1036: ixor
    //   1037: lookupswitch default -> 1406, -1819367221 -> 1064, -770432503 -> 1020
    //   1064: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   1067: ldc2_w -614722306
    //   1070: l2i
    //   1071: ldc_w -614722306
    //   1074: ixor
    //   1075: getstatic Perryc.0 : I
    //   1078: ifle -> 1092
    //   1081: ldc2_w -2125385404
    //   1084: l2i
    //   1085: ldc_w 566193444
    //   1088: ixor
    //   1089: goto -> 1100
    //   1092: ldc2_w 1718077021
    //   1095: l2i
    //   1096: ldc_w 1210315041
    //   1099: ixor
    //   1100: ldc2_w 515993572
    //   1103: l2i
    //   1104: ldc_w 2142761007
    //   1107: ixor
    //   1108: ixor
    //   1109: lookupswitch default -> 1404, -1046953045 -> 1092, 1328720055 -> 1136
    //   1136: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   1139: ldc2_w -911866106
    //   1142: l2i
    //   1143: ldc_w -911866604
    //   1146: ixor
    //   1147: getstatic Perryc.c : I
    //   1150: iflt -> 1164
    //   1153: ldc2_w -12540483
    //   1156: l2i
    //   1157: ldc_w 1336987120
    //   1160: ixor
    //   1161: goto -> 1172
    //   1164: ldc2_w -659730912
    //   1167: l2i
    //   1168: ldc_w -1908363468
    //   1171: ixor
    //   1172: ldc2_w -637584628
    //   1175: l2i
    //   1176: ldc_w 1929295916
    //   1179: ixor
    //   1180: ixor
    //   1181: lookupswitch default -> 1208, 468839277 -> 1426, 1854314264 -> 1164
    //   1208: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   1211: getstatic Perryc.0 : I
    //   1214: ifle -> 1228
    //   1217: ldc2_w -987061378
    //   1220: l2i
    //   1221: ldc_w 2095289920
    //   1224: ixor
    //   1225: goto -> 1236
    //   1228: ldc2_w 1357277311
    //   1231: l2i
    //   1232: ldc_w -1046007457
    //   1235: ixor
    //   1236: ldc2_w 1640470689
    //   1239: l2i
    //   1240: ldc_w 1820595553
    //   1243: ixor
    //   1244: ixor
    //   1245: lookupswitch default -> 1412, -1677536032 -> 1272, -1265977090 -> 1228
    //   1272: invokespecial <init> : (Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V
    //   1275: getstatic Perryc.0 : I
    //   1278: ifle -> 1292
    //   1281: ldc2_w -1387084452
    //   1284: l2i
    //   1285: ldc_w -898420359
    //   1288: ixor
    //   1289: goto -> 1300
    //   1292: ldc2_w -757227259
    //   1295: l2i
    //   1296: ldc_w 1920531415
    //   1299: ixor
    //   1300: ldc2_w 1232085336
    //   1303: l2i
    //   1304: ldc_w -98379212
    //   1307: ixor
    //   1308: ixor
    //   1309: lookupswitch default -> 1408, -730656951 -> 1292, 334995902 -> 1336
    //   1336: invokevirtual register : (Lbigname/zprestige/webhack/features/setting/Setting;)Lbigname/zprestige/webhack/features/setting/Setting;
    //   1339: getstatic Perryc.1 : I
    //   1342: ifeq -> 1356
    //   1345: ldc2_w 1356171236
    //   1348: l2i
    //   1349: ldc_w -702894733
    //   1352: ixor
    //   1353: goto -> 1364
    //   1356: ldc2_w -1407755792
    //   1359: l2i
    //   1360: ldc_w 1620061587
    //   1363: ixor
    //   1364: ldc2_w -1922572368
    //   1367: l2i
    //   1368: ldc_w 386899059
    //   1371: ixor
    //   1372: ixor
    //   1373: lookupswitch default -> 1400, 480733524 -> 1442, 1112325576 -> 1356
    //   1400: putfield WelcomerY : Lbigname/zprestige/webhack/features/setting/Setting;
    //   1403: return
    //   1404: aconst_null
    //   1405: athrow
    //   1406: aconst_null
    //   1407: athrow
    //   1408: aconst_null
    //   1409: athrow
    //   1410: aconst_null
    //   1411: athrow
    //   1412: aconst_null
    //   1413: athrow
    //   1414: aconst_null
    //   1415: athrow
    //   1416: aconst_null
    //   1417: athrow
    //   1418: aconst_null
    //   1419: athrow
    //   1420: aconst_null
    //   1421: athrow
    //   1422: aconst_null
    //   1423: athrow
    //   1424: aconst_null
    //   1425: athrow
    //   1426: aconst_null
    //   1427: athrow
    //   1428: aconst_null
    //   1429: athrow
    //   1430: aconst_null
    //   1431: athrow
    //   1432: aconst_null
    //   1433: athrow
    //   1434: aconst_null
    //   1435: athrow
    //   1436: aconst_null
    //   1437: athrow
    //   1438: aconst_null
    //   1439: athrow
    //   1440: aconst_null
    //   1441: athrow
    //   1442: aconst_null
    //   1443: athrow
    //   1444: aconst_null
    //   1445: athrow
    // Local variable table:
    //   start	length	slot	name	descriptor
    //   0	1404	0	this	Lbigname/zprestige/webhack/features/modules/Hud/Welcomer;
  }
}


/* Location:              C:\Users\alex\Desktop\webhack\WebHack-0.8-obf_sussy_1.jar!\bigname\zprestige\webhack\features\modules\Hud\Welcomer.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */