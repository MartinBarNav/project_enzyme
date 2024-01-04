// 
// Decompiled by Procyon v0.5.36
// 

package com.saterskog.cell_lab;

import javax.xml.parsers.DocumentBuilder;
import org.xml.sax.SAXException;
import javax.xml.parsers.ParserConfigurationException;
import com.saterskog.b.a;
import java.io.Reader;
import java.io.StringReader;
import org.xml.sax.InputSource;
import javax.xml.parsers.DocumentBuilderFactory;
import org.w3c.dom.Document;
import org.w3c.dom.Node;
import java.util.Iterator;
import org.w3c.dom.NodeList;
import java.io.IOException;
import java.util.Locale;
import org.w3c.dom.Element;
import java.util.Scanner;
import android.content.Context;
import java.util.ArrayList;

public final class j
{
    static ArrayList<a> a;
    static boolean[] b;
    static String[] c;
    
    static {
        j.a = null;
        j.b = null;
        j.c = null;
    }
    
    public static int a(final int n, final Context context) {
        a(context);
        int n2 = 0;
        for (int i = 0; i < j.a.size(); ++i) {
            if (i == n) {
                return n2;
            }
            if (j.a.get(i).i == -1) {
                ++n2;
            }
        }
        n2 = -1;
        return n2;
    }
    
    public static int a(final String anObject, final Context context) {
        final ArrayList<a> a = a(context);
        for (int i = 0; i < a.size(); ++i) {
            if (a.get(i).b.equals(anObject)) {
                return i;
            }
        }
        return -1;
    }
    
    static ArrayList<a> a(Context e) {
        if (j.a == null) {
        Label_0075_Outer:
            while (true) {
                j.a = new ArrayList<a>();
                new b();
                String next;
                NodeList elementsByTagName;
                String[] stringArray = null;
                int n = 0;
                Element element = null;
                int i = 0;
                String a = null;
                String a2;
                String[] split;
                String a3;
                String a4;
                String a5;
                String a6;
                String a7;
                String a8;
                String a9;
                String a10;
                String a11;
                String a12;
                String a13;
                String a14;
                String a15;
                String a16;
                String a17;
                String a18;
                String a19;
                String a20;
                Label_0143_Outer:Label_0213_Outer:
                while (true) {
                Label_0252:
                    while (true) {
                    Label_0237:
                        while (true) {
                            while (true) {
                                try {
                                    next = new Scanner(e.getAssets().open("levels.xml")).useDelimiter("\\A").next();
                                    elementsByTagName = j.b.a(next).getElementsByTagName("level");
                                    stringArray = e.getResources().getStringArray(2130837512);
                                    n = 0;
                                    if (n >= elementsByTagName.getLength()) {
                                        break;
                                    }
                                    e = (Context)new a();
                                    element = (Element)elementsByTagName.item(n);
                                    ((a)e).b = j.b.a(element, "id");
                                    if (((a)e).b.startsWith("tuto")) {
                                        ((a)e).i = Integer.parseInt(((a)e).b.substring(4));
                                        for (int i = 0; i < h.B.length; ++i) {
                                            a = j.b.a(element, "max-" + h.values()[i].toString().toLowerCase(Locale.ENGLISH));
                                            if (a != null && a.length() != 0) {
                                                break Label_0237;
                                            }
                                            ((a)e).k[i] = -1;
                                        }
                                        break Label_0252;
                                    }
                                }
                                catch (IOException ex) {
                                    ex.printStackTrace();
                                    next = null;
                                    continue Label_0075_Outer;
                                }
                                break;
                            }
                            ((a)e).i = -1;
                            continue Label_0213_Outer;
                        }
                        ((a)e).k[i] = Integer.parseInt(a);
                        continue;
                    }
                    ((a)e).a = stringArray[n * 4 + 0];
                    ((a)e).c = stringArray[n * 4 + 1];
                    ((a)e).d = stringArray[n * 4 + 2];
                    if (((a)e).d.length() == 0) {
                        ((a)e).d = null;
                    }
                    ((a)e).e = stringArray[n * 4 + 3];
                    if (((a)e).e.length() == 0) {
                        ((a)e).e = null;
                    }
                    ((a)e).f = j.b.a(element, "file");
                    ((a)e).g = j.b.a(element, "unlocks").split(",");
                    if (((a)e).g != null && ((a)e).g[0].length() == 0) {
                        ((a)e).g = null;
                    }
                    a2 = j.b.a(element, "feature");
                    if (a2 != null && a2.length() != 0) {
                        ((a)e).j = Integer.parseInt(a2);
                    }
                    else {
                        ((a)e).j = -1;
                    }
                    split = j.b.a(element, "tools").split(",");
                    if (split != null && split.length > 0 && split[0].length() != 0) {
                        for (int j = 0; j < split.length; ++j) {
                            if (split[j].equals("cell")) {
                                ((a)e).h[0] = true;
                            }
                            if (split[j].equals("move")) {
                                ((a)e).h[1] = true;
                            }
                            if (split[j].equals("remove")) {
                                ((a)e).h[3] = true;
                            }
                            if (split[j].equals("add")) {
                                ((a)e).h[2] = true;
                            }
                            if (split[j].equals("info")) {
                                ((a)e).h[4] = true;
                            }
                        }
                    }
                    else {
                        ((a)e).h[0] = true;
                        ((a)e).h[4] = true;
                    }
                    a3 = j.b.a(element, "difficulty");
                    if (a3 == null || a3.length() == 0) {
                        ((a)e).u = 0;
                    }
                    else {
                        ((a)e).u = Integer.parseInt(a3);
                    }
                    a4 = j.b.a(element, "user-cells");
                    if (a4 == null || a4.length() == 0) {
                        ((a)e).m = -1;
                    }
                    else {
                        ((a)e).m = Integer.parseInt(a4);
                    }
                    a5 = j.b.a(element, "black-level-cells");
                    if (a5 == null || a5.length() == 0) {
                        ((a)e).z = -1;
                    }
                    else {
                        ((a)e).z = Integer.parseInt(a5);
                    }
                    a6 = j.b.a(element, "red-level-cells");
                    if (a6 == null || a6.length() == 0) {
                        ((a)e).v = -1;
                    }
                    else {
                        ((a)e).v = Integer.parseInt(a6);
                    }
                    a7 = j.b.a(element, "red-level-cells-min");
                    if (a7 == null || a7.length() == 0) {
                        ((a)e).w = -1;
                    }
                    else {
                        ((a)e).w = Integer.parseInt(a7);
                    }
                    a8 = j.b.a(element, "yellow-level-cells");
                    if (a8 == null || a8.length() == 0) {
                        ((a)e).x = -1;
                    }
                    else {
                        ((a)e).x = Integer.parseInt(a8);
                    }
                    a9 = j.b.a(element, "yellow-level-cells-min");
                    if (a9 == null || a9.length() == 0) {
                        ((a)e).y = -1;
                    }
                    else {
                        ((a)e).y = Integer.parseInt(a9);
                    }
                    a10 = j.b.a(element, "total-cells-min");
                    if (a10 == null || a10.length() == 0) {
                        ((a)e).n = -1;
                    }
                    else {
                        ((a)e).n = Integer.parseInt(a10);
                    }
                    a11 = j.b.a(element, "level-cells");
                    if (a11 == null || a11.length() == 0) {
                        ((a)e).o = -1;
                    }
                    else {
                        ((a)e).o = Integer.parseInt(a11);
                    }
                    a12 = j.b.a(element, "level-cells-min");
                    if (a12 == null || a12.length() == 0) {
                        ((a)e).p = -1;
                    }
                    else {
                        ((a)e).p = Integer.parseInt(a12);
                    }
                    a13 = j.b.a(element, "hybrid-cells-min");
                    if (a13 == null || a13.length() == 0) {
                        ((a)e).l = -1;
                    }
                    else {
                        ((a)e).l = Integer.parseInt(a13);
                    }
                    a14 = j.b.a(element, "infected-level-cells");
                    if (a14 == null || a14.length() == 0) {
                        ((a)e).s = -1;
                    }
                    else {
                        ((a)e).s = Integer.parseInt(a14);
                    }
                    a15 = j.b.a(element, "infected-level-cells-max");
                    if (a15 == null || a15.length() == 0) {
                        ((a)e).t = -1;
                    }
                    else {
                        ((a)e).t = Integer.parseInt(a15);
                    }
                    a16 = j.b.a(element, "place-cells");
                    if (a16 == null || a16.length() == 0) {
                        ((a)e).q = 1;
                    }
                    else {
                        ((a)e).q = Integer.parseInt(a16);
                    }
                    a17 = j.b.a(element, "remove-max");
                    if (a17 == null || a17.length() == 0) {
                        ((a)e).A = -1;
                    }
                    else {
                        ((a)e).A = Integer.parseInt(a17);
                    }
                    a18 = j.b.a(element, "user-cells-max");
                    if (a18 == null || a18.length() == 0) {
                        ((a)e).r = -1;
                    }
                    else {
                        ((a)e).r = Integer.parseInt(a18);
                    }
                    a19 = j.b.a(element, "max-time");
                    if (a19 == null || a19.length() == 0) {
                        ((a)e).C = -1.0;
                    }
                    else {
                        ((a)e).C = Double.parseDouble(a19);
                    }
                    a20 = j.b.a(element, "win-time");
                    if (a20 == null || a20.length() == 0) {
                        ((a)e).B = -1.0;
                    }
                    else {
                        ((a)e).B = Double.parseDouble(a20);
                    }
                    j.a.add((a)e);
                    ++n;
                    continue Label_0143_Outer;
                }
            }
        }
        return j.a;
    }
    
    static void a() {
        synchronized (j.class) {
            j.c = null;
        }
    }
    
    public static void a(final Context p0, final int p1, final long p2) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     2: monitorenter   
        //     3: iload_1        
        //     4: iflt            17
        //     7: iload_1        
        //     8: getstatic       com/saterskog/cell_lab/j.a:Ljava/util/ArrayList;
        //    11: invokevirtual   java/util/ArrayList.size:()I
        //    14: if_icmplt       43
        //    17: new             Ljava/lang/StringBuilder;
        //    20: astore_0       
        //    21: aload_0        
        //    22: ldc_w           "Tried to clock out challenge: "
        //    25: invokespecial   java/lang/StringBuilder.<init>:(Ljava/lang/String;)V
        //    28: aload_0        
        //    29: iload_1        
        //    30: invokevirtual   java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
        //    33: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //    36: invokestatic    com/saterskog/b/a.a:(Ljava/lang/String;)V
        //    39: ldc             Lcom/saterskog/cell_lab/j;.class
        //    41: monitorexit    
        //    42: return         
        //    43: invokestatic    com/saterskog/b/a.c:()J
        //    46: lstore          4
        //    48: aload_0        
        //    49: iload_1        
        //    50: invokestatic    com/saterskog/cell_lab/j.b:(Landroid/content/Context;I)J
        //    53: lstore          6
        //    55: aconst_null    
        //    56: astore          8
        //    58: aconst_null    
        //    59: astore          9
        //    61: new             Ljava/lang/StringBuilder;
        //    64: astore          10
        //    66: aload           10
        //    68: invokespecial   java/lang/StringBuilder.<init>:()V
        //    71: aload           10
        //    73: getstatic       com/saterskog/cell_lab/j.a:Ljava/util/ArrayList;
        //    76: iload_1        
        //    77: invokevirtual   java/util/ArrayList.get:(I)Ljava/lang/Object;
        //    80: checkcast       Lcom/saterskog/cell_lab/j$a;
        //    83: getfield        com/saterskog/cell_lab/j$a.b:Ljava/lang/String;
        //    86: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    89: ldc_w           ".time"
        //    92: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    95: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //    98: astore          11
        //   100: aload           8
        //   102: astore          12
        //   104: new             Ljava/io/ObjectOutputStream;
        //   107: astore          10
        //   109: aload           8
        //   111: astore          12
        //   113: aload           10
        //   115: aload_0        
        //   116: aload           11
        //   118: iconst_0       
        //   119: invokevirtual   android/content/Context.openFileOutput:(Ljava/lang/String;I)Ljava/io/FileOutputStream;
        //   122: invokespecial   java/io/ObjectOutputStream.<init>:(Ljava/io/OutputStream;)V
        //   125: aload           10
        //   127: astore_0       
        //   128: aload           10
        //   130: iconst_0       
        //   131: invokevirtual   java/io/ObjectOutputStream.writeInt:(I)V
        //   134: aload           10
        //   136: astore_0       
        //   137: aload           10
        //   139: lload           4
        //   141: lload_2        
        //   142: lsub           
        //   143: lload           6
        //   145: ladd           
        //   146: invokevirtual   java/io/ObjectOutputStream.writeLong:(J)V
        //   149: aload           10
        //   151: invokevirtual   java/io/ObjectOutputStream.close:()V
        //   154: invokestatic    com/saterskog/cell_lab/j.a:()V
        //   157: goto            39
        //   160: astore_0       
        //   161: ldc             Lcom/saterskog/cell_lab/j;.class
        //   163: monitorexit    
        //   164: aload_0        
        //   165: athrow         
        //   166: astore_0       
        //   167: aload_0        
        //   168: invokevirtual   java/io/IOException.printStackTrace:()V
        //   171: goto            154
        //   174: astore          12
        //   176: aconst_null    
        //   177: astore          10
        //   179: aload           10
        //   181: astore_0       
        //   182: aload           12
        //   184: invokevirtual   java/io/FileNotFoundException.printStackTrace:()V
        //   187: aload           10
        //   189: ifnull          154
        //   192: aload           10
        //   194: invokevirtual   java/io/ObjectOutputStream.close:()V
        //   197: goto            154
        //   200: astore_0       
        //   201: aload_0        
        //   202: invokevirtual   java/io/IOException.printStackTrace:()V
        //   205: goto            154
        //   208: astore          10
        //   210: aload           9
        //   212: astore_0       
        //   213: aload_0        
        //   214: astore          12
        //   216: aload           10
        //   218: invokevirtual   java/io/IOException.printStackTrace:()V
        //   221: aload_0        
        //   222: ifnull          154
        //   225: aload_0        
        //   226: invokevirtual   java/io/ObjectOutputStream.close:()V
        //   229: goto            154
        //   232: astore_0       
        //   233: aload_0        
        //   234: invokevirtual   java/io/IOException.printStackTrace:()V
        //   237: goto            154
        //   240: astore_0       
        //   241: aload           12
        //   243: ifnull          251
        //   246: aload           12
        //   248: invokevirtual   java/io/ObjectOutputStream.close:()V
        //   251: aload_0        
        //   252: athrow         
        //   253: astore          10
        //   255: aload           10
        //   257: invokevirtual   java/io/IOException.printStackTrace:()V
        //   260: goto            251
        //   263: astore          10
        //   265: aload_0        
        //   266: astore          12
        //   268: aload           10
        //   270: astore_0       
        //   271: goto            241
        //   274: astore_0       
        //   275: aload           10
        //   277: astore          12
        //   279: aload_0        
        //   280: astore          10
        //   282: aload           12
        //   284: astore_0       
        //   285: goto            213
        //   288: astore          12
        //   290: goto            179
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                           
        //  -----  -----  -----  -----  -------------------------------
        //  7      17     160    166    Any
        //  17     39     160    166    Any
        //  43     55     160    166    Any
        //  61     100    160    166    Any
        //  104    109    174    179    Ljava/io/FileNotFoundException;
        //  104    109    208    213    Ljava/io/IOException;
        //  104    109    240    241    Any
        //  113    125    174    179    Ljava/io/FileNotFoundException;
        //  113    125    208    213    Ljava/io/IOException;
        //  113    125    240    241    Any
        //  128    134    288    293    Ljava/io/FileNotFoundException;
        //  128    134    274    288    Ljava/io/IOException;
        //  128    134    263    274    Any
        //  137    149    288    293    Ljava/io/FileNotFoundException;
        //  137    149    274    288    Ljava/io/IOException;
        //  137    149    263    274    Any
        //  149    154    166    174    Ljava/io/IOException;
        //  149    154    160    166    Any
        //  154    157    160    166    Any
        //  167    171    160    166    Any
        //  182    187    263    274    Any
        //  192    197    200    208    Ljava/io/IOException;
        //  192    197    160    166    Any
        //  201    205    160    166    Any
        //  216    221    240    241    Any
        //  225    229    232    240    Ljava/io/IOException;
        //  225    229    160    166    Any
        //  233    237    160    166    Any
        //  246    251    253    263    Ljava/io/IOException;
        //  246    251    160    166    Any
        //  251    253    160    166    Any
        //  255    260    160    166    Any
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index 144 out of bounds for length 144
        //     at java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
        //     at java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
        //     at java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:248)
        //     at java.base/java.util.Objects.checkIndex(Objects.java:372)
        //     at java.base/java.util.ArrayList.get(ArrayList.java:458)
        //     at com.strobel.decompiler.ast.AstBuilder.convertToAst(AstBuilder.java:3321)
        //     at com.strobel.decompiler.ast.AstBuilder.build(AstBuilder.java:113)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:211)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:99)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethodBody(AstBuilder.java:782)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethod(AstBuilder.java:675)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addTypeMembers(AstBuilder.java:552)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeCore(AstBuilder.java:519)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeNoCache(AstBuilder.java:161)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createType(AstBuilder.java:150)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addType(AstBuilder.java:125)
        //     at com.strobel.decompiler.languages.java.JavaLanguage.buildAst(JavaLanguage.java:71)
        //     at com.strobel.decompiler.languages.java.JavaLanguage.decompileType(JavaLanguage.java:59)
        //     at com.strobel.decompiler.DecompilerDriver.decompileType(DecompilerDriver.java:330)
        //     at com.strobel.decompiler.DecompilerDriver.decompileJar(DecompilerDriver.java:251)
        //     at com.strobel.decompiler.DecompilerDriver.main(DecompilerDriver.java:126)
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    static boolean a(int b, final CellWorld cellWorld) {
        synchronized (j.class) {
            final double n = cellWorld.N;
            cellWorld.N = cellWorld.M;
            final a a = j.a.get(b);
            int b2 = -1;
            int b3 = -1;
            b = -1;
            int b4 = -1;
            if (a.m != -1 || a.r != -1) {
                b = cellWorld.b(1);
            }
            if (a.o != -1 || a.p != -1) {
                b2 = cellWorld.b(0);
            }
            if (a.l != -1) {
                b4 = cellWorld.b(6);
            }
            if (a.s != -1 || a.o != -1 || a.p != -1) {
                b3 = cellWorld.b(3);
            }
            boolean b5;
            if (a.n != -1 && cellWorld.z < a.n) {
                b5 = false;
            }
            else if (a.m != -1 && b < a.m) {
                b5 = false;
            }
            else if (a.r != -1 && b > a.r) {
                b5 = false;
            }
            else if (a.o != -1 && b2 + b3 > a.o) {
                b5 = false;
            }
            else if (a.p != -1 && b2 + b3 < a.p) {
                b5 = false;
            }
            else if (a.s != -1 && b3 < a.s) {
                b5 = false;
            }
            else if (a.t != -1 && b3 > a.t) {
                b5 = false;
            }
            else if (a.l != -1 && b4 < a.l) {
                b5 = false;
            }
            else if (a.C != -1.0 && cellWorld.M > a.C) {
                b5 = false;
            }
            else if (a.z != -1 && cellWorld.c() > a.z) {
                b5 = false;
            }
            else if (a.v != -1 && cellWorld.d() > a.v) {
                b5 = false;
            }
            else if (a.w != -1 && cellWorld.d() < a.w) {
                b5 = false;
            }
            else if (a.x != -1 && cellWorld.e() > a.x) {
                b5 = false;
            }
            else if (a.y != -1 && cellWorld.e() < a.y) {
                b5 = false;
            }
            else {
                cellWorld.N = n;
                b5 = (a.B == -1.0 || cellWorld.M - cellWorld.N >= a.B);
            }
            return b5;
        }
    }
    
    static boolean a(final int p0, final Gene[] p1, final Context p2) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     2: monitorenter   
        //     3: getstatic       com/saterskog/cell_lab/h.B:[Lcom/saterskog/cell_lab/h;
        //     6: astore_3       
        //     7: aload_3        
        //     8: arraylength    
        //     9: istore          4
        //    11: iconst_0       
        //    12: istore          5
        //    14: iload           5
        //    16: iload           4
        //    18: if_icmpge       111
        //    21: aload_3        
        //    22: iload           5
        //    24: aaload         
        //    25: astore          6
        //    27: iconst_0       
        //    28: istore          7
        //    30: iconst_0       
        //    31: istore          8
        //    33: iload           7
        //    35: bipush          80
        //    37: if_icmpge       61
        //    40: aload_1        
        //    41: iload           7
        //    43: aaload         
        //    44: getfield        com/saterskog/cell_lab/Gene.s:Lcom/saterskog/cell_lab/h;
        //    47: aload           6
        //    49: if_acmpne       123
        //    52: iinc            8, 1
        //    55: iinc            7, 1
        //    58: goto            33
        //    61: aload_2        
        //    62: invokestatic    com/saterskog/cell_lab/j.a:(Landroid/content/Context;)Ljava/util/ArrayList;
        //    65: iload_0        
        //    66: invokevirtual   java/util/ArrayList.get:(I)Ljava/lang/Object;
        //    69: checkcast       Lcom/saterskog/cell_lab/j$a;
        //    72: getfield        com/saterskog/cell_lab/j$a.k:[I
        //    75: aload           6
        //    77: invokevirtual   com/saterskog/cell_lab/h.ordinal:()I
        //    80: iaload         
        //    81: istore          7
        //    83: iload           7
        //    85: iconst_m1      
        //    86: if_icmpeq       105
        //    89: iload           8
        //    91: iload           7
        //    93: if_icmple       105
        //    96: iconst_0       
        //    97: istore          9
        //    99: ldc             Lcom/saterskog/cell_lab/j;.class
        //   101: monitorexit    
        //   102: iload           9
        //   104: ireturn        
        //   105: iinc            5, 1
        //   108: goto            14
        //   111: iconst_1       
        //   112: istore          9
        //   114: goto            99
        //   117: astore_1       
        //   118: ldc             Lcom/saterskog/cell_lab/j;.class
        //   120: monitorexit    
        //   121: aload_1        
        //   122: athrow         
        //   123: goto            55
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type
        //  -----  -----  -----  -----  ----
        //  3      11     117    123    Any
        //  40     52     117    123    Any
        //  61     83     117    123    Any
        // 
        // The error that occurred was:
        // 
        // java.lang.NullPointerException
        //     at com.strobel.assembler.ir.StackMappingVisitor.push(StackMappingVisitor.java:290)
        //     at com.strobel.assembler.ir.StackMappingVisitor$InstructionAnalyzer.execute(StackMappingVisitor.java:833)
        //     at com.strobel.assembler.ir.StackMappingVisitor$InstructionAnalyzer.visit(StackMappingVisitor.java:398)
        //     at com.strobel.decompiler.ast.AstBuilder.performStackAnalysis(AstBuilder.java:2030)
        //     at com.strobel.decompiler.ast.AstBuilder.build(AstBuilder.java:108)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:211)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:99)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethodBody(AstBuilder.java:782)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethod(AstBuilder.java:675)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addTypeMembers(AstBuilder.java:552)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeCore(AstBuilder.java:519)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeNoCache(AstBuilder.java:161)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createType(AstBuilder.java:150)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addType(AstBuilder.java:125)
        //     at com.strobel.decompiler.languages.java.JavaLanguage.buildAst(JavaLanguage.java:71)
        //     at com.strobel.decompiler.languages.java.JavaLanguage.decompileType(JavaLanguage.java:59)
        //     at com.strobel.decompiler.DecompilerDriver.decompileType(DecompilerDriver.java:330)
        //     at com.strobel.decompiler.DecompilerDriver.decompileJar(DecompilerDriver.java:251)
        //     at com.strobel.decompiler.DecompilerDriver.main(DecompilerDriver.java:126)
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    static boolean a(final Context context, final int n) {
        boolean b;
        if (n == -1) {
            b = true;
        }
        else {
            if (j.b == null) {
                e(context);
            }
            b = j.b[n];
        }
        return b;
    }
    
    public static boolean[] a(int n) {
        // monitorenter(j.class)
        Label_0024: {
            if (n == -1) {
                break Label_0024;
            }
            try {
                boolean[] h;
                if (j.a.get(n).h == null) {
                    final boolean[] array = new boolean[5];
                    n = 0;
                    while (true) {
                        h = array;
                        if (n >= 5) {
                            break;
                        }
                        array[n] = true;
                        ++n;
                    }
                }
                else {
                    h = j.a.get(n).h;
                }
                return h;
            }
            finally {
            }
            // monitorexit(j.class)
        }
    }
    
    public static long b(final Context p0, final int p1) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     2: monitorenter   
        //     3: aload_0        
        //     4: invokestatic    com/saterskog/cell_lab/j.a:(Landroid/content/Context;)Ljava/util/ArrayList;
        //     7: iload_1        
        //     8: invokevirtual   java/util/ArrayList.get:(I)Ljava/lang/Object;
        //    11: checkcast       Lcom/saterskog/cell_lab/j$a;
        //    14: getfield        com/saterskog/cell_lab/j$a.b:Ljava/lang/String;
        //    17: astore_2       
        //    18: aload_0        
        //    19: invokestatic    com/saterskog/cell_lab/j.d:(Landroid/content/Context;)[Ljava/lang/String;
        //    22: astore_3       
        //    23: aload_3        
        //    24: arraylength    
        //    25: istore          4
        //    27: iconst_0       
        //    28: istore          5
        //    30: iload           5
        //    32: iload           4
        //    34: if_icmpge       270
        //    37: aload_3        
        //    38: iload           5
        //    40: aaload         
        //    41: astore          6
        //    43: new             Ljava/lang/StringBuilder;
        //    46: astore          7
        //    48: aload           7
        //    50: invokespecial   java/lang/StringBuilder.<init>:()V
        //    53: aload           6
        //    55: aload           7
        //    57: aload_2        
        //    58: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    61: ldc_w           ".time"
        //    64: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    67: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //    70: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //    73: istore          8
        //    75: iload           8
        //    77: ifeq            250
        //    80: aconst_null    
        //    81: astore          6
        //    83: aconst_null    
        //    84: astore          7
        //    86: aload           6
        //    88: astore_3       
        //    89: new             Ljava/io/ObjectInputStream;
        //    92: astore_2       
        //    93: aload           6
        //    95: astore_3       
        //    96: new             Ljava/lang/StringBuilder;
        //    99: astore          9
        //   101: aload           6
        //   103: astore_3       
        //   104: aload           9
        //   106: invokespecial   java/lang/StringBuilder.<init>:()V
        //   109: aload           6
        //   111: astore_3       
        //   112: aload_2        
        //   113: aload_0        
        //   114: aload           9
        //   116: getstatic       com/saterskog/cell_lab/j.a:Ljava/util/ArrayList;
        //   119: iload_1        
        //   120: invokevirtual   java/util/ArrayList.get:(I)Ljava/lang/Object;
        //   123: checkcast       Lcom/saterskog/cell_lab/j$a;
        //   126: getfield        com/saterskog/cell_lab/j$a.b:Ljava/lang/String;
        //   129: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   132: ldc_w           ".time"
        //   135: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   138: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   141: invokevirtual   android/content/Context.openFileInput:(Ljava/lang/String;)Ljava/io/FileInputStream;
        //   144: invokespecial   java/io/ObjectInputStream.<init>:(Ljava/io/InputStream;)V
        //   147: aload_2        
        //   148: invokevirtual   java/io/ObjectInputStream.readInt:()I
        //   151: ifeq            160
        //   154: ldc_w           "LevelManager time version mismatch."
        //   157: invokestatic    com/saterskog/b/a.a:(Ljava/lang/String;)V
        //   160: aload_2        
        //   161: invokevirtual   java/io/ObjectInputStream.readLong:()J
        //   164: lstore          10
        //   166: aload_2        
        //   167: invokevirtual   java/io/ObjectInputStream.close:()V
        //   170: ldc             Lcom/saterskog/cell_lab/j;.class
        //   172: monitorexit    
        //   173: lload           10
        //   175: lreturn        
        //   176: astore_0       
        //   177: aload_0        
        //   178: invokevirtual   java/io/IOException.printStackTrace:()V
        //   181: goto            170
        //   184: astore_0       
        //   185: ldc             Lcom/saterskog/cell_lab/j;.class
        //   187: monitorexit    
        //   188: aload_0        
        //   189: athrow         
        //   190: astore_2       
        //   191: aload           7
        //   193: astore_0       
        //   194: aload_0        
        //   195: astore_3       
        //   196: aload_2        
        //   197: invokevirtual   java/io/IOException.printStackTrace:()V
        //   200: aload_0        
        //   201: ifnull          244
        //   204: aload_0        
        //   205: invokevirtual   java/io/ObjectInputStream.close:()V
        //   208: lconst_0       
        //   209: lstore          10
        //   211: goto            170
        //   214: astore_0       
        //   215: aload_0        
        //   216: invokevirtual   java/io/IOException.printStackTrace:()V
        //   219: lconst_0       
        //   220: lstore          10
        //   222: goto            170
        //   225: astore_0       
        //   226: aload_3        
        //   227: ifnull          234
        //   230: aload_3        
        //   231: invokevirtual   java/io/ObjectInputStream.close:()V
        //   234: aload_0        
        //   235: athrow         
        //   236: astore_3       
        //   237: aload_3        
        //   238: invokevirtual   java/io/IOException.printStackTrace:()V
        //   241: goto            234
        //   244: lconst_0       
        //   245: lstore          10
        //   247: goto            170
        //   250: iinc            5, 1
        //   253: goto            30
        //   256: astore_0       
        //   257: aload_2        
        //   258: astore_3       
        //   259: goto            226
        //   262: astore_3       
        //   263: aload_2        
        //   264: astore_0       
        //   265: aload_3        
        //   266: astore_2       
        //   267: goto            194
        //   270: lconst_0       
        //   271: lstore          10
        //   273: goto            170
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                 
        //  -----  -----  -----  -----  ---------------------
        //  3      27     184    190    Any
        //  43     75     184    190    Any
        //  89     93     190    194    Ljava/io/IOException;
        //  89     93     225    226    Any
        //  96     101    190    194    Ljava/io/IOException;
        //  96     101    225    226    Any
        //  104    109    190    194    Ljava/io/IOException;
        //  104    109    225    226    Any
        //  112    147    190    194    Ljava/io/IOException;
        //  112    147    225    226    Any
        //  147    160    262    270    Ljava/io/IOException;
        //  147    160    256    262    Any
        //  160    166    262    270    Ljava/io/IOException;
        //  160    166    256    262    Any
        //  166    170    176    184    Ljava/io/IOException;
        //  166    170    184    190    Any
        //  177    181    184    190    Any
        //  196    200    225    226    Any
        //  204    208    214    225    Ljava/io/IOException;
        //  204    208    184    190    Any
        //  215    219    184    190    Any
        //  230    234    236    244    Ljava/io/IOException;
        //  230    234    184    190    Any
        //  234    236    184    190    Any
        //  237    241    184    190    Any
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index 143 out of bounds for length 143
        //     at java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
        //     at java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
        //     at java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:248)
        //     at java.base/java.util.Objects.checkIndex(Objects.java:372)
        //     at java.base/java.util.ArrayList.get(ArrayList.java:458)
        //     at com.strobel.decompiler.ast.AstBuilder.convertToAst(AstBuilder.java:3321)
        //     at com.strobel.decompiler.ast.AstBuilder.build(AstBuilder.java:113)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:211)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:99)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethodBody(AstBuilder.java:782)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethod(AstBuilder.java:675)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addTypeMembers(AstBuilder.java:552)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeCore(AstBuilder.java:519)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeNoCache(AstBuilder.java:161)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createType(AstBuilder.java:150)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addType(AstBuilder.java:125)
        //     at com.strobel.decompiler.languages.java.JavaLanguage.buildAst(JavaLanguage.java:71)
        //     at com.strobel.decompiler.languages.java.JavaLanguage.decompileType(JavaLanguage.java:59)
        //     at com.strobel.decompiler.DecompilerDriver.decompileType(DecompilerDriver.java:330)
        //     at com.strobel.decompiler.DecompilerDriver.decompileJar(DecompilerDriver.java:251)
        //     at com.strobel.decompiler.DecompilerDriver.main(DecompilerDriver.java:126)
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    static boolean b(final int index, final Context context) {
        synchronized (j.class) {
            return b(a(context).get(index).b, context);
        }
    }
    
    static boolean b(final String s, final Context context) {
        return true;
    }
    
    static String[] b(final Context context) {
        synchronized (j.class) {
            final String[] array = new String[a(context).size()];
            for (int i = 0; i < array.length; ++i) {
                array[i] = j.a.get(i).a;
            }
            return array;
        }
    }
    
    public static int c(final Context context) {
        synchronized (j.class) {
            a(context);
            for (int i = 0; i < j.a.size(); ++i) {
                if (j.a.get(i).g != null && !b(i, context)) {
                    return i;
                }
            }
            return -1;
        }
    }
    
    static void c(final int p0, final Context p1) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     2: monitorenter   
        //     3: aconst_null    
        //     4: astore_2       
        //     5: aconst_null    
        //     6: astore_3       
        //     7: aload_2        
        //     8: astore          4
        //    10: new             Ljava/io/ObjectOutputStream;
        //    13: astore          5
        //    15: aload_2        
        //    16: astore          4
        //    18: new             Ljava/lang/StringBuilder;
        //    21: astore          6
        //    23: aload_2        
        //    24: astore          4
        //    26: aload           6
        //    28: invokespecial   java/lang/StringBuilder.<init>:()V
        //    31: aload_2        
        //    32: astore          4
        //    34: aload           5
        //    36: aload_1        
        //    37: aload           6
        //    39: getstatic       com/saterskog/cell_lab/j.a:Ljava/util/ArrayList;
        //    42: iload_0        
        //    43: invokevirtual   java/util/ArrayList.get:(I)Ljava/lang/Object;
        //    46: checkcast       Lcom/saterskog/cell_lab/j$a;
        //    49: getfield        com/saterskog/cell_lab/j$a.b:Ljava/lang/String;
        //    52: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    55: ldc_w           ".win"
        //    58: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    61: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //    64: iconst_0       
        //    65: invokevirtual   android/content/Context.openFileOutput:(Ljava/lang/String;I)Ljava/io/FileOutputStream;
        //    68: invokespecial   java/io/ObjectOutputStream.<init>:(Ljava/io/OutputStream;)V
        //    71: aload           5
        //    73: astore          4
        //    75: aload           5
        //    77: iconst_0       
        //    78: invokevirtual   java/io/ObjectOutputStream.writeInt:(I)V
        //    81: aload           5
        //    83: invokevirtual   java/io/ObjectOutputStream.close:()V
        //    86: invokestatic    com/saterskog/cell_lab/j.a:()V
        //    89: aload_1        
        //    90: invokestatic    com/saterskog/cell_lab/j.e:(Landroid/content/Context;)V
        //    93: ldc             Lcom/saterskog/cell_lab/j;.class
        //    95: monitorexit    
        //    96: return         
        //    97: astore          5
        //    99: aload           5
        //   101: invokevirtual   java/io/IOException.printStackTrace:()V
        //   104: goto            86
        //   107: astore_1       
        //   108: ldc             Lcom/saterskog/cell_lab/j;.class
        //   110: monitorexit    
        //   111: aload_1        
        //   112: athrow         
        //   113: astore_2       
        //   114: aconst_null    
        //   115: astore          5
        //   117: aload           5
        //   119: astore          4
        //   121: aload_2        
        //   122: invokevirtual   java/io/FileNotFoundException.printStackTrace:()V
        //   125: aload           5
        //   127: ifnull          86
        //   130: aload           5
        //   132: invokevirtual   java/io/ObjectOutputStream.close:()V
        //   135: goto            86
        //   138: astore          5
        //   140: aload           5
        //   142: invokevirtual   java/io/IOException.printStackTrace:()V
        //   145: goto            86
        //   148: astore_2       
        //   149: aload_3        
        //   150: astore          5
        //   152: aload           5
        //   154: astore          4
        //   156: aload_2        
        //   157: invokevirtual   java/io/IOException.printStackTrace:()V
        //   160: aload           5
        //   162: ifnull          86
        //   165: aload           5
        //   167: invokevirtual   java/io/ObjectOutputStream.close:()V
        //   170: goto            86
        //   173: astore          5
        //   175: aload           5
        //   177: invokevirtual   java/io/IOException.printStackTrace:()V
        //   180: goto            86
        //   183: astore_1       
        //   184: aload           4
        //   186: ifnull          194
        //   189: aload           4
        //   191: invokevirtual   java/io/ObjectOutputStream.close:()V
        //   194: aload_1        
        //   195: athrow         
        //   196: astore          5
        //   198: aload           5
        //   200: invokevirtual   java/io/IOException.printStackTrace:()V
        //   203: goto            194
        //   206: astore_1       
        //   207: goto            184
        //   210: astore_2       
        //   211: goto            152
        //   214: astore_2       
        //   215: goto            117
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                           
        //  -----  -----  -----  -----  -------------------------------
        //  10     15     113    117    Ljava/io/FileNotFoundException;
        //  10     15     148    152    Ljava/io/IOException;
        //  10     15     183    184    Any
        //  18     23     113    117    Ljava/io/FileNotFoundException;
        //  18     23     148    152    Ljava/io/IOException;
        //  18     23     183    184    Any
        //  26     31     113    117    Ljava/io/FileNotFoundException;
        //  26     31     148    152    Ljava/io/IOException;
        //  26     31     183    184    Any
        //  34     71     113    117    Ljava/io/FileNotFoundException;
        //  34     71     148    152    Ljava/io/IOException;
        //  34     71     183    184    Any
        //  75     81     214    218    Ljava/io/FileNotFoundException;
        //  75     81     210    214    Ljava/io/IOException;
        //  75     81     206    210    Any
        //  81     86     97     107    Ljava/io/IOException;
        //  81     86     107    113    Any
        //  86     93     107    113    Any
        //  99     104    107    113    Any
        //  121    125    206    210    Any
        //  130    135    138    148    Ljava/io/IOException;
        //  130    135    107    113    Any
        //  140    145    107    113    Any
        //  156    160    183    184    Any
        //  165    170    173    183    Ljava/io/IOException;
        //  165    170    107    113    Any
        //  175    180    107    113    Any
        //  189    194    196    206    Ljava/io/IOException;
        //  189    194    107    113    Any
        //  194    196    107    113    Any
        //  198    203    107    113    Any
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index 106 out of bounds for length 106
        //     at java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
        //     at java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
        //     at java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:248)
        //     at java.base/java.util.Objects.checkIndex(Objects.java:372)
        //     at java.base/java.util.ArrayList.get(ArrayList.java:458)
        //     at com.strobel.decompiler.ast.AstBuilder.convertToAst(AstBuilder.java:3321)
        //     at com.strobel.decompiler.ast.AstBuilder.convertToAst(AstBuilder.java:3435)
        //     at com.strobel.decompiler.ast.AstBuilder.build(AstBuilder.java:113)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:211)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:99)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethodBody(AstBuilder.java:782)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethod(AstBuilder.java:675)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addTypeMembers(AstBuilder.java:552)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeCore(AstBuilder.java:519)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeNoCache(AstBuilder.java:161)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createType(AstBuilder.java:150)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addType(AstBuilder.java:125)
        //     at com.strobel.decompiler.languages.java.JavaLanguage.buildAst(JavaLanguage.java:71)
        //     at com.strobel.decompiler.languages.java.JavaLanguage.decompileType(JavaLanguage.java:59)
        //     at com.strobel.decompiler.DecompilerDriver.decompileType(DecompilerDriver.java:330)
        //     at com.strobel.decompiler.DecompilerDriver.decompileJar(DecompilerDriver.java:251)
        //     at com.strobel.decompiler.DecompilerDriver.main(DecompilerDriver.java:126)
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    static String d(final int index, final Context context) {
        synchronized (j.class) {
            return a(context).get(index).c;
        }
    }
    
    private static String[] d(final Context context) {
        synchronized (j.class) {
            if (j.c == null) {
                j.c = context.fileList();
            }
            return j.c;
        }
    }
    
    static String e(final int index, final Context context) {
        synchronized (j.class) {
            return a(context).get(index).d;
        }
    }
    
    private static void e(final Context context) {
        j.b = new boolean[3];
        for (final a a : a(context)) {
            if (b(a.b, context) && a.j != -1) {
                j.b[a.j] = true;
            }
        }
    }
    
    static int f(int u, final Context context) {
        synchronized (j.class) {
            u = a(context).get(u).u;
            return u;
        }
    }
    
    static String g(final int index, final Context context) {
        synchronized (j.class) {
            return a(context).get(index).e;
        }
    }
    
    public static String h(final int index, final Context context) {
        synchronized (j.class) {
            return a(context).get(index).f;
        }
    }
    
    public static boolean[] i(final int p0, final Context p1) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: astore_2       
        //     2: ldc             Lcom/saterskog/cell_lab/j;.class
        //     4: monitorenter   
        //     5: iload_0        
        //     6: iconst_m1      
        //     7: if_icmpne       122
        //    10: getstatic       com/saterskog/cell_lab/h.B:[Lcom/saterskog/cell_lab/h;
        //    13: arraylength    
        //    14: newarray        Z
        //    16: astore_3       
        //    17: aload_1        
        //    18: invokestatic    com/saterskog/cell_lab/j.a:(Landroid/content/Context;)Ljava/util/ArrayList;
        //    21: invokevirtual   java/util/ArrayList.iterator:()Ljava/util/Iterator;
        //    24: astore          4
        //    26: aload           4
        //    28: invokeinterface java/util/Iterator.hasNext:()Z
        //    33: ifeq            106
        //    36: aload           4
        //    38: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //    43: checkcast       Lcom/saterskog/cell_lab/j$a;
        //    46: astore_2       
        //    47: aload_2        
        //    48: getfield        com/saterskog/cell_lab/j$a.b:Ljava/lang/String;
        //    51: aload_1        
        //    52: invokestatic    com/saterskog/cell_lab/j.b:(Ljava/lang/String;Landroid/content/Context;)Z
        //    55: ifeq            26
        //    58: aload_2        
        //    59: getfield        com/saterskog/cell_lab/j$a.g:[Ljava/lang/String;
        //    62: ifnull          26
        //    65: aload_2        
        //    66: getfield        com/saterskog/cell_lab/j$a.g:[Ljava/lang/String;
        //    69: astore_2       
        //    70: aload_2        
        //    71: arraylength    
        //    72: istore          5
        //    74: iconst_0       
        //    75: istore_0       
        //    76: iload_0        
        //    77: iload           5
        //    79: if_icmpge       26
        //    82: aload_3        
        //    83: aload_2        
        //    84: iload_0        
        //    85: aaload         
        //    86: getstatic       java/util/Locale.ENGLISH:Ljava/util/Locale;
        //    89: invokevirtual   java/lang/String.toUpperCase:(Ljava/util/Locale;)Ljava/lang/String;
        //    92: invokestatic    com/saterskog/cell_lab/h.valueOf:(Ljava/lang/String;)Lcom/saterskog/cell_lab/h;
        //    95: invokevirtual   com/saterskog/cell_lab/h.ordinal:()I
        //    98: iconst_1       
        //    99: bastore        
        //   100: iinc            0, 1
        //   103: goto            76
        //   106: aload_3        
        //   107: getstatic       com/saterskog/cell_lab/h.c:Lcom/saterskog/cell_lab/h;
        //   110: invokevirtual   com/saterskog/cell_lab/h.ordinal:()I
        //   113: iconst_1       
        //   114: bastore        
        //   115: aload_3        
        //   116: astore_1       
        //   117: ldc             Lcom/saterskog/cell_lab/j;.class
        //   119: monitorexit    
        //   120: aload_1        
        //   121: areturn        
        //   122: new             Ljava/io/ObjectInputStream;
        //   125: astore_3       
        //   126: aload_3        
        //   127: aload_1        
        //   128: invokevirtual   android/content/Context.getAssets:()Landroid/content/res/AssetManager;
        //   131: iload_0        
        //   132: aload_1        
        //   133: invokestatic    com/saterskog/cell_lab/j.h:(ILandroid/content/Context;)Ljava/lang/String;
        //   136: invokevirtual   android/content/res/AssetManager.open:(Ljava/lang/String;)Ljava/io/InputStream;
        //   139: invokespecial   java/io/ObjectInputStream.<init>:(Ljava/io/InputStream;)V
        //   142: aload_3        
        //   143: invokevirtual   java/io/ObjectInputStream.readInt:()I
        //   146: sipush          3054
        //   149: if_icmple       190
        //   152: new             Ljava/lang/RuntimeException;
        //   155: astore_1       
        //   156: aload_1        
        //   157: ldc_w           "Opening file from different version"
        //   160: invokespecial   java/lang/RuntimeException.<init>:(Ljava/lang/String;)V
        //   163: aload_1        
        //   164: athrow         
        //   165: astore          4
        //   167: aload_2        
        //   168: astore_1       
        //   169: aload           4
        //   171: invokevirtual   java/io/IOException.printStackTrace:()V
        //   174: aload_3        
        //   175: ifnull          182
        //   178: aload_3        
        //   179: invokevirtual   java/io/ObjectInputStream.close:()V
        //   182: aload_1        
        //   183: getfield        com/saterskog/cell_lab/Environment.t:[Z
        //   186: astore_1       
        //   187: goto            117
        //   190: aload_3        
        //   191: invokevirtual   java/io/ObjectInputStream.readDouble:()D
        //   194: pop2           
        //   195: aload_3        
        //   196: invokevirtual   java/io/ObjectInputStream.readInt:()I
        //   199: pop            
        //   200: new             Lcom/saterskog/cell_lab/Environment;
        //   203: astore_1       
        //   204: aload_1        
        //   205: invokespecial   com/saterskog/cell_lab/Environment.<init>:()V
        //   208: aload_1        
        //   209: aload_3        
        //   210: invokevirtual   com/saterskog/cell_lab/Environment.a:(Ljava/io/ObjectInputStream;)V
        //   213: aload_3        
        //   214: invokevirtual   java/io/ObjectInputStream.close:()V
        //   217: goto            182
        //   220: astore_3       
        //   221: aload_3        
        //   222: invokevirtual   java/io/IOException.printStackTrace:()V
        //   225: goto            182
        //   228: astore_1       
        //   229: ldc             Lcom/saterskog/cell_lab/j;.class
        //   231: monitorexit    
        //   232: aload_1        
        //   233: athrow         
        //   234: astore_3       
        //   235: aload_3        
        //   236: invokevirtual   java/io/IOException.printStackTrace:()V
        //   239: goto            182
        //   242: astore_1       
        //   243: aconst_null    
        //   244: astore_3       
        //   245: aload_3        
        //   246: ifnull          253
        //   249: aload_3        
        //   250: invokevirtual   java/io/ObjectInputStream.close:()V
        //   253: aload_1        
        //   254: athrow         
        //   255: astore_3       
        //   256: aload_3        
        //   257: invokevirtual   java/io/IOException.printStackTrace:()V
        //   260: goto            253
        //   263: astore_1       
        //   264: goto            245
        //   267: astore_1       
        //   268: goto            245
        //   271: astore          4
        //   273: aconst_null    
        //   274: astore_3       
        //   275: aload_2        
        //   276: astore_1       
        //   277: goto            169
        //   280: astore          4
        //   282: goto            169
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                 
        //  -----  -----  -----  -----  ---------------------
        //  10     26     228    234    Any
        //  26     74     228    234    Any
        //  82     100    228    234    Any
        //  106    115    228    234    Any
        //  122    142    271    280    Ljava/io/IOException;
        //  122    142    242    245    Any
        //  142    165    165    169    Ljava/io/IOException;
        //  142    165    263    267    Any
        //  169    174    267    271    Any
        //  178    182    234    242    Ljava/io/IOException;
        //  178    182    228    234    Any
        //  182    187    228    234    Any
        //  190    208    165    169    Ljava/io/IOException;
        //  190    208    263    267    Any
        //  208    213    280    285    Ljava/io/IOException;
        //  208    213    263    267    Any
        //  213    217    220    228    Ljava/io/IOException;
        //  213    217    228    234    Any
        //  221    225    228    234    Any
        //  235    239    228    234    Any
        //  249    253    255    263    Ljava/io/IOException;
        //  249    253    228    234    Any
        //  253    255    228    234    Any
        //  256    260    228    234    Any
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index 152 out of bounds for length 152
        //     at java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
        //     at java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
        //     at java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:248)
        //     at java.base/java.util.Objects.checkIndex(Objects.java:372)
        //     at java.base/java.util.ArrayList.get(ArrayList.java:458)
        //     at com.strobel.decompiler.ast.AstBuilder.convertToAst(AstBuilder.java:3321)
        //     at com.strobel.decompiler.ast.AstBuilder.build(AstBuilder.java:113)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:211)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:99)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethodBody(AstBuilder.java:782)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethod(AstBuilder.java:675)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addTypeMembers(AstBuilder.java:552)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeCore(AstBuilder.java:519)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeNoCache(AstBuilder.java:161)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createType(AstBuilder.java:150)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addType(AstBuilder.java:125)
        //     at com.strobel.decompiler.languages.java.JavaLanguage.buildAst(JavaLanguage.java:71)
        //     at com.strobel.decompiler.languages.java.JavaLanguage.decompileType(JavaLanguage.java:59)
        //     at com.strobel.decompiler.DecompilerDriver.decompileType(DecompilerDriver.java:330)
        //     at com.strobel.decompiler.DecompilerDriver.decompileJar(DecompilerDriver.java:251)
        //     at com.strobel.decompiler.DecompilerDriver.main(DecompilerDriver.java:126)
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    static final class a
    {
        int A;
        double B;
        double C;
        String a;
        String b;
        String c;
        String d;
        String e;
        String f;
        String[] g;
        boolean[] h;
        int i;
        int j;
        int[] k;
        int l;
        int m;
        int n;
        int o;
        int p;
        int q;
        int r;
        int s;
        int t;
        int u;
        int v;
        int w;
        int x;
        int y;
        int z;
        
        a() {
            this.h = new boolean[5];
            this.k = new int[h.B.length];
        }
    }
    
    static final class b
    {
        public static String a(final Element element, final String s) {
            final Node item = element.getElementsByTagName(s).item(0);
            if (item != null && item.hasChildNodes()) {
                for (Node node = item.getFirstChild(); node != null; node = node.getNextSibling()) {
                    if (node.getNodeType() == 3) {
                        return node.getNodeValue();
                    }
                }
                return "";
            }
            return "";
            return "";
        }
        
        public static Document a(final String s) {
            final Document document = null;
            final DocumentBuilderFactory instance = DocumentBuilderFactory.newInstance();
            try {
                final DocumentBuilder documentBuilder = instance.newDocumentBuilder();
                final InputSource inputSource = new InputSource();
                inputSource.setCharacterStream(new StringReader(s));
                return documentBuilder.parse(inputSource);
            }
            catch (ParserConfigurationException ex) {
                com.saterskog.b.a.a("Error: " + ex.getMessage());
                return document;
            }
            catch (SAXException ex2) {
                com.saterskog.b.a.a("Error: " + ex2.getMessage());
                return document;
            }
            catch (IOException ex3) {
                com.saterskog.b.a.a("Error: " + ex3.getMessage());
                return document;
            }
        }
    }
}
