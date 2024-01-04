/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.content.Context
 *  android.content.pm.ApplicationInfo
 *  android.content.pm.PackageInfo
 *  android.content.pm.PackageManager
 *  android.content.pm.PackageManager$NameNotFoundException
 *  android.util.Log
 */
package com.saterskog.b;

import android.app.Activity;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.util.Log;
import com.google.android.gms.b.d;
import com.google.android.gms.b.g;
import java.io.File;
import java.util.Hashtable;

public final class a {
    public static int a = 0;
    static Hashtable<String, Long> b = new Hashtable();
    static long c = 0L;
    static int d = 0;

    /*
     * Enabled aggressive block sorting
     */
    public static long a(Context object) {
        long l2;
        long l3;
        block2: {
            l3 = -1L;
            PackageManager packageManager = object.getPackageManager();
            String string = object.getPackageName();
            long l4 = com.saterskog.b.a.b(packageManager, string);
            long l5 = com.saterskog.b.a.a(packageManager, string);
            for (int i2 = 0; i2 < 2; ++i2) {
                l2 = (new long[]{l4, l5})[i2];
                if (l2 == -1L) {
                    continue;
                }
                break block2;
            }
            l2 = -1L;
        }
        if (l2 >= 1389900000000L) return l2;
        return l3;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private static long a(PackageManager object, String string) {
        long l2;
        long l3 = -1L;
        try {
            string = object.getApplicationInfo(string, 0);
            object = new File(((ApplicationInfo)string).sourceDir);
            l2 = l3;
        }
        catch (PackageManager.NameNotFoundException nameNotFoundException) {
            return l3;
        }
        if (!((File)object).exists()) return l2;
        return ((File)object).lastModified();
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static String a(long l2) {
        double d2 = Math.log10((double)l2 / 1000.0) * 100.0;
        if (Double.isInfinite(d2)) return "NaN";
        if (!Double.isNaN(d2)) return Integer.toString((int)d2);
        return "NaN";
    }

    public static void a() {
    }

    public static void a(String string) {
        if (a < 100) {
            Log.e((String)"ZDebug", (String)string);
        }
        if (++a == 100) {
            Log.e((String)"ZDebug", (String)"Not printing further errors (100 already)");
            ++a;
        }
    }

    public static void a(String object, Activity object2) {
        synchronized (a.class) {
            object2 = ((a)object2.getApplication()).a();
            ((g)object2).a("&cd", (String)object);
            object = new d.a();
            ((g)object2).a(((d.a)object).a());
            return;
        }
    }

    public static void a(String string, String string2, long l2, Activity object) {
        synchronized (a.class) {
            object = ((a)object.getApplication()).a();
            d.e e2 = new d.e();
            e2.a("&utc", string);
            e2.a("&utt", Long.toString(l2));
            e2.a("&utv", string2);
            e2.a("&utl", com.saterskog.b.a.a(l2));
            ((g)object).a(e2.a());
            return;
        }
    }

    public static void a(String string, String string2, String string3, long l2, Activity object) {
        synchronized (a.class) {
            g g2 = ((a)object.getApplication()).a();
            object = new d.b();
            ((d.d)object).a("&ec", string);
            ((d.d)object).a("&ea", string2);
            ((d.d)object).a("&el", string3);
            ((d.d)object).a("&ev", Long.toString(l2));
            g2.a(((d.b)object).a());
            return;
        }
    }

    public static void a(String string, Throwable throwable) {
        Log.e((String)"ZDebug", (String)string, (Throwable)throwable);
    }

    public static void a(Throwable throwable) {
        Log.e((String)"ZDebug", (String)"no message", (Throwable)throwable);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static long b(Context context) {
        long l2 = System.currentTimeMillis();
        if (l2 < 1456866531169L) {
            return -1L;
        }
        l2 -= com.saterskog.b.a.a(context);
        return l2;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private static long b(PackageManager packageManager, String string) {
        long l2 = -1L;
        try {
            packageManager = packageManager.getPackageInfo(string, 0);
            long l3 = PackageInfo.class.getField("firstInstallTime").getLong((Object)packageManager);
            return l3;
        }
        catch (SecurityException securityException) {
            return l2;
        }
        catch (IllegalArgumentException illegalArgumentException) {
            return l2;
        }
        catch (NoSuchFieldException noSuchFieldException) {
            return l2;
        }
        catch (IllegalAccessException illegalAccessException) {
            return l2;
        }
        catch (PackageManager.NameNotFoundException nameNotFoundException) {
            return l2;
        }
    }

    public static void b() {
    }

    public static void b(String string) {
        Log.e((String)"ZDebug", (String)string);
    }

    public static long c() {
        return System.currentTimeMillis();
    }

    public static interface a {
        public g a();
    }
}

