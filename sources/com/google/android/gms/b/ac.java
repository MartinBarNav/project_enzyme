package com.google.android.gms.b;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;

final class ac implements am {
    private static ac e;
    private static Object f = new Object();
    protected String a;
    protected String b;
    protected String c;
    protected String d;

    protected ac() {
    }

    private ac(Context context) {
        PackageManager packageManager = context.getPackageManager();
        this.c = context.getPackageName();
        this.d = packageManager.getInstallerPackageName(this.c);
        String str = this.c;
        String str2 = null;
        try {
            PackageInfo packageInfo = packageManager.getPackageInfo(context.getPackageName(), 0);
            if (packageInfo != null) {
                str = packageManager.getApplicationLabel(packageInfo.applicationInfo).toString();
                str2 = packageInfo.versionName;
            }
        } catch (PackageManager.NameNotFoundException e2) {
            n.a("Error retrieving package info: appName set to " + str);
        }
        this.a = str;
        this.b = str2;
    }

    public static ac a() {
        return e;
    }

    public static void a(Context context) {
        synchronized (f) {
            if (e == null) {
                e = new ac(context);
            }
        }
    }

    public final String a(String str) {
        if (str == null) {
            return null;
        }
        if (str.equals("&an")) {
            return this.a;
        }
        if (str.equals("&av")) {
            return this.b;
        }
        if (str.equals("&aid")) {
            return this.c;
        }
        if (str.equals("&aiid")) {
            return this.d;
        }
        return null;
    }
}
