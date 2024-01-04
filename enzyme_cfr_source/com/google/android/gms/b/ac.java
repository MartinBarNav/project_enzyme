/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.pm.PackageInfo
 *  android.content.pm.PackageManager
 *  android.content.pm.PackageManager$NameNotFoundException
 */
package com.google.android.gms.b;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import com.google.android.gms.b.am;
import com.google.android.gms.b.n;

final class ac
implements am {
    private static ac e;
    private static Object f;
    protected String a;
    protected String b;
    protected String c;
    protected String d;

    static {
        f = new Object();
    }

    protected ac() {
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private ac(Context object) {
        void var1_5;
        PackageManager packageManager = object.getPackageManager();
        this.c = object.getPackageName();
        this.d = packageManager.getInstallerPackageName(this.c);
        String string = this.c;
        Object var4_10 = null;
        String string2 = string;
        try {
            PackageInfo packageInfo = packageManager.getPackageInfo(object.getPackageName(), 0);
            Object var1_2 = var4_10;
            string2 = string;
            if (packageInfo != null) {
                String string3;
                string2 = string;
                string2 = string3 = packageManager.getApplicationLabel(packageInfo.applicationInfo).toString();
                string = packageInfo.versionName;
                string2 = string3;
                String string4 = string;
            }
        }
        catch (PackageManager.NameNotFoundException nameNotFoundException) {
            n.a("Error retrieving package info: appName set to " + string2);
            Object var1_7 = var4_10;
        }
        this.a = string2;
        this.b = var1_5;
    }

    public static ac a() {
        return e;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static void a(Context context) {
        Object object = f;
        synchronized (object) {
            if (e == null) {
                ac ac2;
                e = ac2 = new ac(context);
            }
            return;
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public final String a(String string) {
        String string2 = null;
        if (string == null) {
            return string2;
        }
        if (string.equals("&an")) {
            return this.a;
        }
        if (string.equals("&av")) {
            return this.b;
        }
        if (string.equals("&aid")) {
            return this.c;
        }
        if (!string.equals("&aiid")) return string2;
        return this.d;
    }
}

