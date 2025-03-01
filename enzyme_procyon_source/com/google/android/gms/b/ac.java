// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.b;

import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager$NameNotFoundException;
import android.content.Context;

final class ac implements am
{
    private static ac e;
    private static Object f;
    protected String a;
    protected String b;
    protected String c;
    protected String d;
    
    static {
        ac.f = new Object();
    }
    
    protected ac() {
    }
    
    private ac(final Context context) {
        final PackageManager packageManager = context.getPackageManager();
        this.c = context.getPackageName();
        this.d = packageManager.getInstallerPackageName(this.c);
        final String c = this.c;
        final String s = null;
        String string = c;
        while (true) {
            try {
                final PackageInfo packageInfo = packageManager.getPackageInfo(context.getPackageName(), 0);
                String b = s;
                string = c;
                if (packageInfo != null) {
                    string = c;
                    final String s2 = string = packageManager.getApplicationLabel(packageInfo.applicationInfo).toString();
                    final String versionName = packageInfo.versionName;
                    string = s2;
                    b = versionName;
                }
                this.a = string;
                this.b = b;
            }
            catch (PackageManager$NameNotFoundException ex) {
                n.a("Error retrieving package info: appName set to " + string);
                final String b = s;
                continue;
            }
            break;
        }
    }
    
    public static ac a() {
        return ac.e;
    }
    
    public static void a(final Context context) {
        synchronized (ac.f) {
            if (ac.e == null) {
                ac.e = new ac(context);
            }
        }
    }
    
    @Override
    public final String a(final String s) {
        String s2 = null;
        if (s != null) {
            if (s.equals("&an")) {
                s2 = this.a;
            }
            else if (s.equals("&av")) {
                s2 = this.b;
            }
            else if (s.equals("&aid")) {
                s2 = this.c;
            }
            else if (s.equals("&aiid")) {
                s2 = this.d;
            }
        }
        return s2;
    }
}
