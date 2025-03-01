// 
// Decompiled by Procyon v0.5.36
// 

package com.saterskog.b;

import android.content.pm.PackageInfo;
import com.google.android.gms.b.g;
import java.util.Map;
import com.google.android.gms.b.d;
import android.app.Activity;
import android.util.Log;
import android.content.pm.PackageManager$NameNotFoundException;
import java.io.File;
import android.content.pm.PackageManager;
import android.content.Context;
import java.util.Hashtable;

public final class a
{
    public static int a;
    static Hashtable<String, Long> b;
    static long c;
    static int d;
    
    static {
        com.saterskog.b.a.a = 0;
        com.saterskog.b.a.b = new Hashtable<String, Long>();
        com.saterskog.b.a.c = 0L;
        com.saterskog.b.a.d = 0;
    }
    
    public static long a(final Context context) {
        final long n = -1L;
        final PackageManager packageManager = context.getPackageManager();
        final String packageName = context.getPackageName();
        final long b = b(packageManager, packageName);
        final long a = a(packageManager, packageName);
        while (true) {
            for (int i = 0; i < 2; ++i) {
                long n2 = (new long[] { b, a })[i];
                if (n2 != -1L) {
                    if (n2 < 1389900000000L) {
                        n2 = n;
                    }
                    return n2;
                }
            }
            long n2 = -1L;
            continue;
        }
    }
    
    private static long a(final PackageManager packageManager, final String s) {
        final long n = -1L;
        try {
            final File file = new File(packageManager.getApplicationInfo(s, 0).sourceDir);
            long lastModified = n;
            if (file.exists()) {
                lastModified = file.lastModified();
            }
            return lastModified;
        }
        catch (PackageManager$NameNotFoundException ex) {
            return n;
        }
    }
    
    public static String a(final long n) {
        final double n2 = Math.log10(n / 1000.0) * 100.0;
        String string;
        if (Double.isInfinite(n2) || Double.isNaN(n2)) {
            string = "NaN";
        }
        else {
            string = Integer.toString((int)n2);
        }
        return string;
    }
    
    public static void a() {
    }
    
    public static void a(final String s) {
        if (com.saterskog.b.a.a < 100) {
            Log.e("ZDebug", s);
            ++com.saterskog.b.a.a;
        }
        if (com.saterskog.b.a.a == 100) {
            Log.e("ZDebug", "Not printing further errors (100 already)");
            ++com.saterskog.b.a.a;
        }
    }
    
    public static void a(final String s, final Activity activity) {
        synchronized (a.class) {
            final g a = ((a)activity.getApplication()).a();
            a.a("&cd", s);
            a.a(new d.a().a());
        }
    }
    
    public static void a(final String s, final String s2, final long i, final Activity activity) {
        synchronized (a.class) {
            final g a = ((a)activity.getApplication()).a();
            final d.e e = new d.e();
            ((d.d<d.e>)e).a("&utc", s);
            ((d.d<d.e>)e).a("&utt", Long.toString(i));
            ((d.d<d.e>)e).a("&utv", s2);
            ((d.d<d.e>)e).a("&utl", a(i));
            a.a(e.a());
        }
    }
    
    public static void a(final String s, final String s2, final String s3, final long i, final Activity activity) {
        synchronized (a.class) {
            final g a = ((a)activity.getApplication()).a();
            final d.b b = new d.b();
            ((d.d<d.b>)b).a("&ec", s);
            ((d.d<d.b>)b).a("&ea", s2);
            ((d.d<d.b>)b).a("&el", s3);
            ((d.d<d.b>)b).a("&ev", Long.toString(i));
            a.a(b.a());
        }
    }
    
    public static void a(final String s, final Throwable t) {
        Log.e("ZDebug", s, t);
    }
    
    public static void a(final Throwable t) {
        Log.e("ZDebug", "no message", t);
    }
    
    public static long b(final Context context) {
        final long currentTimeMillis = System.currentTimeMillis();
        long n;
        if (currentTimeMillis < 1456866531169L) {
            n = -1L;
        }
        else {
            n = currentTimeMillis - a(context);
        }
        return n;
    }
    
    private static long b(final PackageManager packageManager, final String s) {
        long long1 = -1L;
        try {
            long1 = PackageInfo.class.getField("firstInstallTime").getLong(packageManager.getPackageInfo(s, 0));
            return long1;
        }
        catch (SecurityException ex) {
            return long1;
        }
        catch (IllegalArgumentException ex2) {
            return long1;
        }
        catch (NoSuchFieldException ex3) {
            return long1;
        }
        catch (IllegalAccessException ex4) {
            return long1;
        }
        catch (PackageManager$NameNotFoundException ex5) {
            return long1;
        }
    }
    
    public static void b() {
    }
    
    public static void b(final String s) {
        Log.e("ZDebug", s);
    }
    
    public static long c() {
        return System.currentTimeMillis();
    }
    
    public interface a
    {
        g a();
    }
}
