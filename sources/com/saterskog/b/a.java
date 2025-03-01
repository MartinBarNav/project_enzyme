package com.saterskog.b;

import android.app.Activity;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.util.Log;
import com.google.android.gms.b.d;
import com.google.android.gms.b.g;
import java.io.File;
import java.util.Hashtable;

public final class a {
    public static int a = 0;
    static Hashtable<String, Long> b = new Hashtable<>();
    static long c = 0;
    static int d = 0;

    /* renamed from: com.saterskog.b.a$a  reason: collision with other inner class name */
    public interface C0027a {
        g a();
    }

    public static void a() {
    }

    public static void b() {
    }

    public static void a(Throwable th) {
        Log.e("ZDebug", "no message", th);
    }

    public static void a(String str, Throwable th) {
        Log.e("ZDebug", str, th);
    }

    public static void a(String str) {
        if (a < 100) {
            Log.e("ZDebug", str);
            a++;
        }
        if (a == 100) {
            Log.e("ZDebug", "Not printing further errors (100 already)");
            a++;
        }
    }

    public static void b(String str) {
        Log.e("ZDebug", str);
    }

    public static synchronized void a(String str, Activity activity) {
        synchronized (a.class) {
            g a2 = ((C0027a) activity.getApplication()).a();
            a2.a("&cd", str);
            a2.a(new d.a().a());
        }
    }

    public static synchronized void a(String str, String str2, String str3, long j, Activity activity) {
        synchronized (a.class) {
            g a2 = ((C0027a) activity.getApplication()).a();
            d.b bVar = new d.b();
            bVar.a("&ec", str);
            bVar.a("&ea", str2);
            bVar.a("&el", str3);
            bVar.a("&ev", Long.toString(j));
            a2.a(bVar.a());
        }
    }

    public static synchronized void a(String str, String str2, long j, Activity activity) {
        synchronized (a.class) {
            g a2 = ((C0027a) activity.getApplication()).a();
            d.e eVar = new d.e();
            eVar.a("&utc", str);
            eVar.a("&utt", Long.toString(j));
            eVar.a("&utv", str2);
            eVar.a("&utl", a(j));
            a2.a(eVar.a());
        }
    }

    public static long a(Context context) {
        long j;
        PackageManager packageManager = context.getPackageManager();
        String packageName = context.getPackageName();
        long[] jArr = {b(packageManager, packageName), a(packageManager, packageName)};
        int i = 0;
        while (true) {
            if (i >= 2) {
                j = -1;
                break;
            }
            j = jArr[i];
            if (j != -1) {
                break;
            }
            i++;
        }
        if (j < 1389900000000L) {
            return -1;
        }
        return j;
    }

    public static long c() {
        return System.currentTimeMillis();
    }

    private static long a(PackageManager packageManager, String str) {
        try {
            File file = new File(packageManager.getApplicationInfo(str, 0).sourceDir);
            if (file.exists()) {
                return file.lastModified();
            }
            return -1;
        } catch (PackageManager.NameNotFoundException e) {
            return -1;
        }
    }

    private static long b(PackageManager packageManager, String str) {
        try {
            return PackageInfo.class.getField("firstInstallTime").getLong(packageManager.getPackageInfo(str, 0));
        } catch (PackageManager.NameNotFoundException | IllegalAccessException | IllegalArgumentException | NoSuchFieldException | SecurityException e) {
            return -1;
        }
    }

    public static String a(long j) {
        double log10 = Math.log10(((double) j) / 1000.0d) * 100.0d;
        if (Double.isInfinite(log10) || Double.isNaN(log10)) {
            return "NaN";
        }
        return Integer.toString((int) log10);
    }

    public static long b(Context context) {
        long currentTimeMillis = System.currentTimeMillis();
        if (currentTimeMillis < 1456866531169L) {
            return -1;
        }
        return currentTimeMillis - a(context);
    }
}
