/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
package com.saterskog.cell_lab;

import android.content.Context;
import com.saterskog.cell_lab.CellWorld;
import com.saterskog.cell_lab.Environment;
import com.saterskog.cell_lab.Gene;
import com.saterskog.cell_lab.h;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;

public final class j {
    static ArrayList<a> a = null;
    static boolean[] b = null;
    static String[] c = null;

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static int a(int n2, Context context) {
        j.a(context);
        int n3 = 0;
        int n4 = 0;
        while (n4 < a.size()) {
            if (n4 == n2) {
                return n3;
            }
            if (j.a.get((int)n4).i == -1) {
                ++n3;
            }
            ++n4;
        }
        return -1;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static int a(String string, Context object) {
        object = j.a((Context)object);
        int n2 = 0;
        while (n2 < ((ArrayList)object).size()) {
            if (((a)object.get((int)n2)).b.equals(string)) {
                return n2;
            }
            ++n2;
        }
        return -1;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    static ArrayList<a> a(Context object) {
        if (a == null) {
            Object object2;
            a = new ArrayList();
            new b();
            try {
                object2 = new Scanner(object.getAssets().open("levels.xml"));
                object2 = ((Scanner)object2).useDelimiter("\\A").next();
            }
            catch (IOException iOException) {
                iOException.printStackTrace();
                object2 = null;
            }
            object2 = com.saterskog.cell_lab.j$b.a((String)object2).getElementsByTagName("level");
            String[] arrstring = object.getResources().getStringArray(2130837512);
            for (int i2 = 0; i2 < object2.getLength(); ++i2) {
                Object object3;
                int n2;
                object = new a();
                Object object4 = (Element)object2.item(i2);
                object.b = com.saterskog.cell_lab.j$b.a((Element)object4, "id");
                object.i = object.b.startsWith("tuto") ? Integer.parseInt(object.b.substring(4)) : -1;
                for (n2 = 0; n2 < h.B.length; ++n2) {
                    object3 = com.saterskog.cell_lab.j$b.a((Element)object4, "max-" + h.values()[n2].toString().toLowerCase(Locale.ENGLISH));
                    object.k[n2] = object3 == null || ((String)object3).length() == 0 ? -1 : Integer.parseInt((String)object3);
                }
                object.a = arrstring[i2 * 4 + 0];
                object.c = arrstring[i2 * 4 + 1];
                object.d = arrstring[i2 * 4 + 2];
                if (object.d.length() == 0) {
                    object.d = null;
                }
                object.e = arrstring[i2 * 4 + 3];
                if (object.e.length() == 0) {
                    object.e = null;
                }
                object.f = com.saterskog.cell_lab.j$b.a((Element)object4, "file");
                object.g = com.saterskog.cell_lab.j$b.a((Element)object4, "unlocks").split(",");
                if (object.g != null && object.g[0].length() == 0) {
                    object.g = null;
                }
                object.j = (object3 = com.saterskog.cell_lab.j$b.a((Element)object4, "feature")) != null && ((String)object3).length() != 0 ? Integer.parseInt((String)object3) : -1;
                object3 = com.saterskog.cell_lab.j$b.a((Element)object4, "tools").split(",");
                if (object3 != null && ((String[])object3).length > 0 && object3[0].length() != 0) {
                    for (n2 = 0; n2 < ((String[])object3).length; ++n2) {
                        if (object3[n2].equals("cell")) {
                            object.h[0] = true;
                        }
                        if (((String)object3[n2]).equals("move")) {
                            object.h[1] = true;
                        }
                        if (((String)object3[n2]).equals("remove")) {
                            object.h[3] = true;
                        }
                        if (((String)object3[n2]).equals("add")) {
                            object.h[2] = true;
                        }
                        if (!((String)object3[n2]).equals("info")) continue;
                        object.h[4] = true;
                    }
                } else {
                    object.h[0] = true;
                    object.h[4] = true;
                }
                object.u = (object3 = com.saterskog.cell_lab.j$b.a((Element)object4, "difficulty")) == null || ((String)object3).length() == 0 ? 0 : Integer.parseInt((String)object3);
                object3 = com.saterskog.cell_lab.j$b.a((Element)object4, "user-cells");
                object.m = object3 == null || ((String)object3).length() == 0 ? -1 : Integer.parseInt((String)object3);
                object3 = com.saterskog.cell_lab.j$b.a((Element)object4, "black-level-cells");
                object.z = object3 == null || ((String)object3).length() == 0 ? -1 : Integer.parseInt((String)object3);
                object3 = com.saterskog.cell_lab.j$b.a((Element)object4, "red-level-cells");
                object.v = object3 == null || ((String)object3).length() == 0 ? -1 : Integer.parseInt((String)object3);
                object3 = com.saterskog.cell_lab.j$b.a((Element)object4, "red-level-cells-min");
                object.w = object3 == null || ((String)object3).length() == 0 ? -1 : Integer.parseInt((String)object3);
                object3 = com.saterskog.cell_lab.j$b.a((Element)object4, "yellow-level-cells");
                object.x = object3 == null || ((String)object3).length() == 0 ? -1 : Integer.parseInt((String)object3);
                object3 = com.saterskog.cell_lab.j$b.a((Element)object4, "yellow-level-cells-min");
                object.y = object3 == null || ((String)object3).length() == 0 ? -1 : Integer.parseInt((String)object3);
                object3 = com.saterskog.cell_lab.j$b.a((Element)object4, "total-cells-min");
                object.n = object3 == null || ((String)object3).length() == 0 ? -1 : Integer.parseInt((String)object3);
                object3 = com.saterskog.cell_lab.j$b.a((Element)object4, "level-cells");
                object.o = object3 == null || ((String)object3).length() == 0 ? -1 : Integer.parseInt((String)object3);
                object3 = com.saterskog.cell_lab.j$b.a((Element)object4, "level-cells-min");
                object.p = object3 == null || ((String)object3).length() == 0 ? -1 : Integer.parseInt((String)object3);
                object3 = com.saterskog.cell_lab.j$b.a((Element)object4, "hybrid-cells-min");
                object.l = object3 == null || ((String)object3).length() == 0 ? -1 : Integer.parseInt((String)object3);
                object3 = com.saterskog.cell_lab.j$b.a((Element)object4, "infected-level-cells");
                object.s = object3 == null || ((String)object3).length() == 0 ? -1 : Integer.parseInt((String)object3);
                object3 = com.saterskog.cell_lab.j$b.a((Element)object4, "infected-level-cells-max");
                object.t = object3 == null || ((String)object3).length() == 0 ? -1 : Integer.parseInt((String)object3);
                object3 = com.saterskog.cell_lab.j$b.a((Element)object4, "place-cells");
                object.q = object3 == null || ((String)object3).length() == 0 ? 1 : Integer.parseInt((String)object3);
                object3 = com.saterskog.cell_lab.j$b.a((Element)object4, "remove-max");
                object.A = object3 == null || ((String)object3).length() == 0 ? -1 : Integer.parseInt((String)object3);
                object3 = com.saterskog.cell_lab.j$b.a((Element)object4, "user-cells-max");
                object.r = object3 == null || ((String)object3).length() == 0 ? -1 : Integer.parseInt((String)object3);
                object3 = com.saterskog.cell_lab.j$b.a((Element)object4, "max-time");
                object.C = object3 == null || ((String)object3).length() == 0 ? -1.0 : Double.parseDouble((String)object3);
                object.B = (object4 = com.saterskog.cell_lab.j$b.a((Element)object4, "win-time")) == null || ((String)object4).length() == 0 ? -1.0 : Double.parseDouble((String)object4);
                a.add((a)object);
            }
        }
        return a;
    }

    static void a() {
        synchronized (j.class) {
            c = null;
            return;
        }
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static void a(Context var0, int var1_6, long var2_7) {
        synchronized (j.class) {
            block31: {
                if (var1_6 < 0 || var1_6 >= j.a.size()) {
                    var0 = new StringBuilder("Tried to clock out challenge: ");
                    com.saterskog.b.a.a(var0.append(var1_6).toString());
                } else {
                    var4_8 = com.saterskog.b.a.c();
                    var6_9 = j.b((Context)var0, var1_6);
                    var8_10 = null;
                    var9_11 = null;
                    var10_12 = new StringBuilder();
                    var11_16 = var10_12.append(j.a.get((int)var1_6).b).append(".time").toString();
                    var12_17 = var8_10;
                    var12_17 = var8_10;
                    var0 = var10_12 = new ObjectOutputStream(var0.openFileOutput(var11_16, 0));
                    break block31;
                }
lbl17:
                // 2 sources

                return;
            }
            ** try [egrp 3[TRYBLOCK] [12, 11, 10 : 128->149)] { 
lbl21:
            // 1 sources

            ** GOTO lbl56
lbl-1000:
            // 1 sources

            {
                block32: {
                    catch (Throwable var10_15) {
                        var12_17 = var0;
                        var0 = var10_15;
                        ** GOTO lbl-1000
                    }
lbl26:
                    // 1 sources

                    catch (FileNotFoundException var12_19) {
                        break block32;
                    }
                    catch (FileNotFoundException var12_18) {}
                    var10_12 = null;
                }
                var0 = var10_12;
                {
                    var12_17.printStackTrace();
                    ** if (var10_12 == null) goto lbl39
                }
lbl-1000:
                // 1 sources

                {
                    try {
                        var10_12.close();
                    }
                    catch (IOException var0_2) {
                        var0_2.printStackTrace();
                    }
                }
lbl39:
                // 2 sources

                ** GOTO lbl61
            }
            catch (IOException var10_13) {
                var0 = var9_11;
lbl42:
                // 2 sources

                while (true) {
                    var12_17 = var0;
                    try {
                        var10_12.printStackTrace();
                        if (var0 == null) ** GOTO lbl61
                        ** GOTO lbl67
                    }
                    catch (Throwable var0_4) lbl-1000:
                    // 2 sources

                    {
                        if (var12_17 == null) throw var0;
                        try {
                            var12_17.close();
                            throw var0;
                        }
                        catch (IOException var10_14) {
                            var10_14.printStackTrace();
                            throw var0;
                        }
lbl56:
                        // 1 sources

                        var10_12.writeInt(0);
                        var0 = var10_12;
                        var10_12.writeLong(var4_8 - var2_7 + var6_9);
                        try {
                            var10_12.close();
                        }
                        catch (IOException var0_1) {
                            var0_1.printStackTrace();
                        }
lbl61:
                        // 7 sources

                        while (true) {
                            j.a();
                            ** continue;
                            break;
                        }
lbl67:
                        // 1 sources

                        try {
                            var0.close();
                        }
                        catch (IOException var0_3) {
                            var0_3.printStackTrace();
                        }
                        ** continue;
                    }
                    break;
                }
            }
lbl73:
            // 1 sources

            catch (IOException var0_5) {
                var12_17 = var10_12;
                var10_12 = var0_5;
                var0 = var12_17;
                ** continue;
            }
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    static boolean a(int n2, CellWorld cellWorld) {
        synchronized (j.class) {
            a a2;
            double d2;
            block35: {
                block34: {
                    block33: {
                        block32: {
                            block31: {
                                block30: {
                                    block29: {
                                        int n3;
                                        block28: {
                                            int n4;
                                            block27: {
                                                block26: {
                                                    int n5;
                                                    block25: {
                                                        block24: {
                                                            block23: {
                                                                block22: {
                                                                    int n6;
                                                                    int n7;
                                                                    d2 = cellWorld.N;
                                                                    cellWorld.N = cellWorld.M;
                                                                    a2 = a.get(n2);
                                                                    n5 = -1;
                                                                    n4 = -1;
                                                                    n2 = -1;
                                                                    n3 = -1;
                                                                    if (a2.m != -1 || a2.r != -1) {
                                                                        n2 = cellWorld.b(1);
                                                                    }
                                                                    if (a2.o != -1 || a2.p != -1) {
                                                                        n5 = cellWorld.b(0);
                                                                    }
                                                                    if (a2.l != -1) {
                                                                        n3 = cellWorld.b(6);
                                                                    }
                                                                    if (a2.s != -1 || a2.o != -1 || a2.p != -1) {
                                                                        n4 = cellWorld.b(3);
                                                                    }
                                                                    if (a2.n == -1 || (n7 = cellWorld.z) >= (n6 = a2.n)) break block22;
                                                                    return false;
                                                                }
                                                                if (a2.m == -1 || n2 >= a2.m) break block23;
                                                                return false;
                                                            }
                                                            if (a2.r == -1 || n2 <= a2.r) break block24;
                                                            return false;
                                                        }
                                                        if (a2.o == -1 || n5 + n4 <= a2.o) break block25;
                                                        return false;
                                                    }
                                                    if (a2.p == -1 || n5 + n4 >= a2.p) break block26;
                                                    return false;
                                                }
                                                if (a2.s == -1 || n4 >= a2.s) break block27;
                                                return false;
                                            }
                                            if (a2.t == -1 || n4 <= a2.t) break block28;
                                            return false;
                                        }
                                        if (a2.l == -1 || n3 >= a2.l) break block29;
                                        return false;
                                    }
                                    if (a2.C == -1.0 || !(cellWorld.M > a2.C)) break block30;
                                    return false;
                                }
                                if (a2.z == -1 || cellWorld.c() <= a2.z) break block31;
                                return false;
                            }
                            if (a2.v == -1 || cellWorld.d() <= a2.v) break block32;
                            return false;
                        }
                        if (a2.w == -1 || cellWorld.d() >= a2.w) break block33;
                        return false;
                    }
                    if (a2.x == -1 || cellWorld.e() <= a2.x) break block34;
                    return false;
                }
                if (a2.y == -1 || cellWorld.e() >= a2.y) break block35;
                return false;
            }
            cellWorld.N = d2;
            if (a2.B == -1.0) return true;
            double d3 = cellWorld.M;
            d2 = cellWorld.N;
            double d4 = a2.B;
            if (!(d3 - d2 < d4)) return true;
            return false;
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    static boolean a(int n2, Gene[] arrgene, Context context) {
        synchronized (j.class) {
            h[] arrh = h.B;
            int n3 = arrh.length;
            int n4 = 0;
            while (n4 < n3) {
                block7: {
                    int n5;
                    h h2 = arrh[n4];
                    int n6 = 0;
                    for (n5 = 0; n5 < 80; ++n5) {
                        if (arrgene[n5].s != h2) continue;
                        ++n6;
                        continue;
                    }
                    n5 = j.a((Context)context).get((int)n2).k[h2.ordinal()];
                    if (n5 == -1 || n6 <= n5) break block7;
                    return false;
                }
                ++n4;
            }
            return true;
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    static boolean a(Context context, int n2) {
        if (n2 == -1) {
            return true;
        }
        if (b != null) return b[n2];
        j.e(context);
        return b[n2];
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static boolean[] a(int n2) {
        synchronized (j.class) {
            if (n2 != -1) {
                if (j.a.get((int)n2).h != null) return j.a.get((int)n2).h;
            }
            boolean[] arrbl = new boolean[5];
            n2 = 0;
            while (true) {
                boolean[] arrbl2 = arrbl;
                if (n2 >= 5) return arrbl2;
                arrbl[n2] = true;
                ++n2;
            }
        }
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    public static long b(Context var0, int var1_6) {
        // MONITORENTER : com.saterskog.cell_lab.j.class
        var2_7 = j.a((Context)var0).get((int)var1_6).b;
        var3_9 = j.d((Context)var0);
        var4_12 = ((String[])var3_9).length;
        var5_13 = 0;
        while (true) {
            if (var5_13 >= var4_12) {
                return 0L;
            }
            var6_14 = var3_9[var5_13];
            var7_15 = new StringBuilder();
            var8_16 = var6_14.equals(var7_15.append((String)var2_7).append(".time").toString());
            if (!var8_16) ** GOTO lbl36
            var6_14 = null;
            var7_15 = null;
            var3_9 = var6_14;
            var3_9 = var6_14;
            var3_9 = var6_14;
            var9_17 = new StringBuilder();
            var3_9 = var6_14;
            var2_7 = new ObjectInputStream(var0.openFileInput(var9_17.append(j.a.get((int)var1_6).b).append(".time").toString()));
            if (var2_7.readInt() != 0) {
                com.saterskog.b.a.a("LevelManager time version mismatch.");
            }
            var10_18 = var2_7.readLong();
            try {
                var2_7.close();
            }
            catch (IOException var0_1) {
                var0_1.printStackTrace();
                return var10_18;
            }
            return var10_18;
            catch (IOException var2_8) {
                block21: {
                    var0 = var7_15;
                    break block21;
lbl36:
                    // 1 sources

                    ++var5_13;
                    continue;
                    catch (Throwable var0_5) {
                        var3_9 = var2_7;
                        ** GOTO lbl-1000
                    }
                    catch (IOException var3_11) {
                        var0 = var2_7;
                        var2_7 = var3_11;
                    }
                }
                var3_9 = var0;
                try {
                    var2_7.printStackTrace();
                    if (var0 == null) return 0L;
                }
                catch (Throwable var0_3) lbl-1000:
                // 2 sources

                {
                    if (var3_9 == null) throw var0_4;
                    try {
                        var3_9.close();
                    }
                    catch (IOException var3_10) {
                        var3_10.printStackTrace();
                        throw var0_4;
                    }
                    throw var0_4;
                }
                try {
                    var0.close();
                    return 0L;
                }
                catch (IOException var0_2) {
                    var0_2.printStackTrace();
                    return 0L;
                }
            }
            break;
        }
    }

    static boolean b(int n2, Context context) {
        synchronized (j.class) {
            boolean bl = j.b(j.a((Context)context).get((int)n2).b, context);
            return bl;
        }
    }

    static boolean b(String string, Context context) {
        return true;
    }

    static String[] b(Context arrstring) {
        synchronized (j.class) {
            arrstring = new String[j.a((Context)arrstring).size()];
            int n2 = 0;
            while (true) {
                if (n2 >= arrstring.length) break;
                arrstring[n2] = j.a.get((int)n2).a;
                ++n2;
                continue;
                break;
            }
            return arrstring;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static int c(Context context) {
        synchronized (j.class) {
            j.a(context);
            int n2 = 0;
            while (n2 < a.size()) {
                if (j.a.get((int)n2).g != null) {
                    boolean bl = j.b(n2, context);
                    if (!bl) return n2;
                }
                ++n2;
            }
            return -1;
        }
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    static void c(int var0, Context var1_1) {
        synchronized (j.class) {
            var2_5 = null;
            var3_12 = null;
            var4_13 = var2_5;
            var4_13 = var2_5;
            var4_13 = var2_5;
            var6_19 = new StringBuilder();
            var4_13 = var2_5;
            var4_13 = var5_14 = new ObjectOutputStream(var1_1.openFileOutput(var6_19.append(j.a.get((int)var0).b).append(".win").toString(), 0));
            ** try [egrp 1[TRYBLOCK] [14, 13, 12 : 75->81)] { 
lbl-1000:
            // 1 sources

            {
                catch (FileNotFoundException var2_11) {}
                catch (FileNotFoundException var2_6) {}
                var5_14 = null;
                var4_13 = var5_14;
                {
                    var2_7.printStackTrace();
                    ** if (var5_14 == null) goto lbl23
                }
lbl-1000:
                // 1 sources

                {
                    try {
                        var5_14.close();
                    }
                    catch (IOException var5_16) {
                        var5_16.printStackTrace();
                    }
                }
lbl23:
                // 2 sources

                ** GOTO lbl43
            }
            catch (IOException var2_8) {
                var5_14 = var3_12;
                var4_13 = var5_14;
                try {
                    var2_9.printStackTrace();
                    if (var5_14 == null) ** GOTO lbl43
                    ** GOTO lbl50
                }
                catch (Throwable var1_2) {
                    if (var4_13 == null) throw var1_3;
                    try {
                        var4_13.close();
                        throw var1_3;
                    }
                    catch (IOException var5_18) {
                        var5_18.printStackTrace();
                        throw var1_3;
                    }
lbl39:
                    // 1 sources

                    while (true) {
                        var5_14.writeInt(0);
                        try {
                            var5_14.close();
                        }
                        catch (IOException var5_15) {
                            var5_15.printStackTrace();
                        }
lbl43:
                        // 7 sources

                        while (true) {
                            j.a();
                            j.e(var1_1);
                            return;
                        }
                        break;
                    }
lbl50:
                    // 1 sources

                    try {
                        var5_14.close();
                    }
                    catch (IOException var5_17) {
                        var5_17.printStackTrace();
                    }
                    ** continue;
                }
            }
lbl56:
            // 1 sources

            catch (IOException var2_10) {}
lbl57:
            // 1 sources

            finally {
                ** continue;
            }
        }
    }

    static String d(int n2, Context object) {
        synchronized (j.class) {
            object = j.a((Context)object).get((int)n2).c;
            return object;
        }
    }

    private static String[] d(Context arrstring) {
        synchronized (j.class) {
            if (c == null) {
                c = arrstring.fileList();
            }
            arrstring = c;
            return arrstring;
        }
    }

    static String e(int n2, Context object) {
        synchronized (j.class) {
            object = j.a((Context)object).get((int)n2).d;
            return object;
        }
    }

    private static void e(Context context) {
        b = new boolean[3];
        for (a a2 : j.a(context)) {
            if (!j.b(a2.b, context) || a2.j == -1) continue;
            j.b[a2.j] = true;
        }
    }

    static int f(int n2, Context context) {
        synchronized (j.class) {
            n2 = j.a((Context)context).get((int)n2).u;
            return n2;
        }
    }

    static String g(int n2, Context object) {
        synchronized (j.class) {
            object = j.a((Context)object).get((int)n2).e;
            return object;
        }
    }

    public static String h(int n2, Context object) {
        synchronized (j.class) {
            object = j.a((Context)object).get((int)n2).f;
            return object;
        }
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static boolean[] i(int var0, Context var1_1) {
        var2_6 = null;
        synchronized (j.class) {
            if (var0 == -1) {
                var3_7 = new boolean[h.B.length];
                for (String[] var2_6 : j.a((Context)var1_1)) {
                    if (!j.b(var2_6.b, (Context)var1_1) || var2_6.g == null) continue;
                    var2_6 = var2_6.g;
                    var5_17 = var2_6.length;
                    for (var0 = 0; var0 < var5_17; ++var0) {
                        var3_7[h.valueOf((String)var2_6[var0].toUpperCase((Locale)Locale.ENGLISH)).ordinal()] = true;
                    }
                }
                var3_7[h.c.ordinal()] = true;
                return var3_7;
            }
            var3_8 = new ObjectInputStream(var1_1.getAssets().open(j.h(var0, (Context)var1_1)));
            try {
                if (var3_8.readInt() > 3054) {
                    var1_1 = new RuntimeException("Opening file from different version");
                    throw var1_1;
                }
                ** GOTO lbl-1000
            }
            catch (IOException var4_13) {
                var1_1 = var2_6;
lbl24:
                // 3 sources

                while (true) {
                    var4_14.printStackTrace();
                    if (var3_8 == null) return var1_1.t;
                    var3_8.close();
                    return var1_1.t;
                }
lbl-1000:
                // 1 sources

                {
                    var3_8.readDouble();
                    var3_8.readInt();
                    var1_1 = new Environment();
                }
                var1_1.a(var3_8);
                try {
                    var3_8.close();
                    return var1_1.t;
                }
                catch (IOException var3_9) {
                    var3_9.printStackTrace();
                }
                return var1_1.t;
                catch (IOException var3_10) {
                    var3_10.printStackTrace();
                    return var1_1.t;
                }
                catch (Throwable var1_2) {
                    var3_8 = null;
lbl50:
                    // 3 sources

                    while (true) {
                        if (var3_8 == null) throw var1_3;
                        try {
                            var3_8.close();
                            throw var1_3;
                        }
                        catch (IOException var3_11) {
                            var3_11.printStackTrace();
                            throw var1_3;
                        }
                        break;
                    }
                }
                catch (Throwable var1_5) {
                    ** GOTO lbl50
                }
            }
            catch (IOException var4_16) {
                ** GOTO lbl24
            }
            catch (Throwable var1_4) {
                ** continue;
            }
            catch (IOException var4_15) {
                var3_8 = null;
                var1_1 = var2_6;
                ** continue;
            }
        }
    }

    static final class a {
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
        boolean[] h = new boolean[5];
        int i;
        int j;
        int[] k = new int[com.saterskog.cell_lab.h.B.length];
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
        }
    }

    static final class b {
        b() {
        }

        /*
         * Enabled force condition propagation
         * Lifted jumps to return sites
         */
        public static String a(Element object, String string) {
            if ((object = object.getElementsByTagName(string).item(0)) == null) return "";
            if (!object.hasChildNodes()) return "";
            object = object.getFirstChild();
            while (object != null) {
                if (object.getNodeType() == 3) {
                    return object.getNodeValue();
                }
                object = object.getNextSibling();
            }
            return "";
        }

        /*
         * Enabled force condition propagation
         * Lifted jumps to return sites
         */
        public static Document a(String object) {
            Object var1_4 = null;
            Object object2 = DocumentBuilderFactory.newInstance();
            try {
                object2 = ((DocumentBuilderFactory)object2).newDocumentBuilder();
                InputSource inputSource = new InputSource();
                StringReader stringReader = new StringReader((String)object);
                inputSource.setCharacterStream(stringReader);
                return ((DocumentBuilder)object2).parse(inputSource);
            }
            catch (ParserConfigurationException parserConfigurationException) {
                com.saterskog.b.a.a("Error: " + parserConfigurationException.getMessage());
                return var1_4;
            }
            catch (SAXException sAXException) {
                com.saterskog.b.a.a("Error: " + sAXException.getMessage());
                return var1_4;
            }
            catch (IOException iOException) {
                com.saterskog.b.a.a("Error: " + iOException.getMessage());
                return var1_4;
            }
        }
    }
}

