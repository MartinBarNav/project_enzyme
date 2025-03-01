/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.Intent
 *  android.content.pm.ApplicationInfo
 *  android.content.pm.PackageInfo
 *  android.content.pm.PackageManager
 *  android.content.pm.PackageManager$NameNotFoundException
 *  android.os.Build
 *  android.util.Base64
 *  android.util.Log
 */
package com.google.android.gms.common;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.util.Base64;
import android.util.Log;
import com.google.android.gms.a;
import com.google.android.gms.common.a;
import com.google.android.gms.common.b;
import com.google.android.gms.common.f;
import com.google.android.gms.internal.e;
import java.util.Arrays;
import java.util.Set;

public final class c {
    public static boolean a = false;
    public static boolean b = false;
    private static int c = -1;
    private static final Object d = new Object();

    /*
     * Enabled aggressive block sorting
     */
    public static void a(Context context) {
        int n2 = com.google.android.gms.common.c.b(context);
        if (n2 == 0) {
            return;
        }
        switch (n2) {
            default: {
                context = null;
                break;
            }
            case 1: 
            case 2: {
                context = com.google.android.gms.internal.c.b("com.google.android.gms");
                break;
            }
            case 42: {
                context = com.google.android.gms.internal.c.a();
                break;
            }
            case 3: {
                context = com.google.android.gms.internal.c.a("com.google.android.gms");
            }
        }
        Log.e((String)"GooglePlayServicesUtil", (String)("GooglePlayServices not available due to error " + n2));
        if (context == null) {
            throw new a(n2);
        }
        throw new b(n2, "Google Play Services not available", (Intent)context);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private static boolean a() {
        if (!a) return "user".equals(Build.TYPE);
        return b;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static boolean a(PackageManager packageManager) {
        boolean bl;
        block6: {
            bl = true;
            Object object = d;
            synchronized (object) {
                int n2 = c;
                if (n2 == -1) {
                    try {
                        if (com.google.android.gms.common.c.a(packageManager.getPackageInfo("com.google.android.gms", 64), new byte[][]{f.E[1]}) != null) {
                            c = 1;
                            break block6;
                        }
                        c = 0;
                    }
                    catch (PackageManager.NameNotFoundException nameNotFoundException) {
                        c = 0;
                    }
                }
            }
        }
        if (c == 0) return false;
        return bl;
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     */
    private static byte[] a(PackageInfo object, boolean bl) {
        void var0_4;
        void var1_8;
        void var0_2;
        if (object.signatures.length != 1) {
            Log.w((String)"GooglePlayServicesUtil", (String)"Package has more than one signature.");
            return var0_2;
        }
        byte[] arrby = object.signatures[0].toByteArray();
        if (var1_8 != false) {
            Set<byte[]> set = f.a();
        } else {
            Set<byte[]> set = f.b();
        }
        if (var0_4.contains(arrby)) {
            byte[] arrby2 = arrby;
            return var0_2;
        }
        if (Log.isLoggable((String)"GooglePlayServicesUtil", (int)2)) {
            Log.v((String)"GooglePlayServicesUtil", (String)("Signature not valid.  Found: \n" + Base64.encodeToString((byte[])arrby, (int)0)));
        }
        Object var0_7 = null;
        return var0_2;
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     */
    private static byte[] a(PackageInfo object, byte[] ... arrby) {
        void var1_6;
        void var0_2;
        if (object.signatures.length != 1) {
            Log.w((String)"GooglePlayServicesUtil", (String)"Package has more than one signature.");
            return var0_2;
        }
        byte[] arrby2 = object.signatures[0].toByteArray();
        for (int i2 = 0; i2 < ((void)var1_6).length; ++i2) {
            void var0_4 = var1_6[i2];
            if (!Arrays.equals((byte[])var0_4, arrby2)) continue;
            return var0_2;
        }
        if (Log.isLoggable((String)"GooglePlayServicesUtil", (int)2)) {
            Log.v((String)"GooglePlayServicesUtil", (String)("Signature not valid.  Found: \n" + Base64.encodeToString((byte[])arrby2, (int)0)));
        }
        Object var0_5 = null;
        return var0_2;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static int b(Context object) {
        int n2;
        Object object2;
        PackageManager packageManager;
        int n3;
        block27: {
            PackageInfo packageInfo;
            block29: {
                block28: {
                    ApplicationInfo applicationInfo;
                    n3 = 1;
                    packageManager = object.getPackageManager();
                    if (!com.google.android.gms.internal.b.a) {
                        try {
                            object.getResources().getString(a.a.common_google_play_services_unknown_issue);
                        }
                        catch (Throwable throwable) {
                            Log.e((String)"GooglePlayServicesUtil", (String)"The Google Play services resources were not found. Check your project configuration to ensure that the resources are included.");
                        }
                    }
                    if (!com.google.android.gms.internal.b.a) {
                        object2 = null;
                        try {
                            applicationInfo = object.getPackageManager().getApplicationInfo(object.getPackageName(), 128);
                            object2 = applicationInfo;
                        }
                        catch (PackageManager.NameNotFoundException nameNotFoundException) {
                            Log.wtf((String)"GooglePlayServicesUtil", (String)"This should never happen.", (Throwable)nameNotFoundException);
                        }
                        if ((object2 = ((ApplicationInfo)object2).metaData) == null) throw new IllegalStateException("A required meta-data tag in your app's AndroidManifest.xml does not exist.  You must have the following declaration within the <application> element:     <meta-data android:name=\"com.google.android.gms.version\" android:value=\"@integer/google_play_services_version\" />");
                        n2 = object2.getInt("com.google.android.gms.version");
                        if (n2 != 6587000) {
                            throw new IllegalStateException("The meta-data tag in your app's AndroidManifest.xml does not have the right value.  Expected 6587000 but found " + n2 + ".  You must have the following declaration within the <application> element:     <meta-data android:name=\"com.google.android.gms.version\" android:value=\"@integer/google_play_services_version\" />");
                        }
                    }
                    try {
                        object2 = packageManager.getPackageInfo("com.google.android.gms", 64);
                    }
                    catch (PackageManager.NameNotFoundException nameNotFoundException) {
                        Log.w((String)"GooglePlayServicesUtil", (String)"Google Play services is missing.");
                        return n3;
                    }
                    if (!e.b(((PackageInfo)object2).versionCode)) break block28;
                    n2 = com.google.android.gms.common.c.a() ? 0 : 1;
                    if (com.google.android.gms.common.c.a((PackageInfo)object2, f.a[n2], f.g[n2], f.f[n2]) == null) {
                        Log.w((String)"GooglePlayServicesUtil", (String)"Google Play Services signature invalid on Glass.");
                        return 9;
                    }
                    String string = object.getPackageName();
                    try {
                        applicationInfo = packageManager.getPackageInfo(string, 64);
                        if (applicationInfo == null) {
                            n2 = 0;
                        } else {
                            n2 = com.google.android.gms.common.c.a(packageManager) || !com.google.android.gms.common.c.a() ? 1 : 0;
                            if (n2 != 0) {
                                n2 = com.google.android.gms.common.c.a((PackageInfo)applicationInfo, true) != null ? 1 : 0;
                            } else {
                                int n4 = com.google.android.gms.common.c.a((PackageInfo)applicationInfo, false) != null ? 1 : 0;
                                n2 = n4;
                                if (n4 == 0) {
                                    n2 = n4;
                                    if (com.google.android.gms.common.c.a((PackageInfo)applicationInfo, true) != null) {
                                        Log.w((String)"GooglePlayServicesUtil", (String)"Test-keys aren't accepted on this build.");
                                        n2 = n4;
                                    }
                                }
                            }
                        }
                        if (n2 == 0) {
                            object2 = new StringBuilder("Calling package ");
                            Log.w((String)"GooglePlayServicesUtil", (String)((StringBuilder)object2).append(applicationInfo.packageName).append(" signature invalid on Glass.").toString());
                            return 9;
                        }
                        break block27;
                    }
                    catch (PackageManager.NameNotFoundException nameNotFoundException) {
                        Log.w((String)"GooglePlayServicesUtil", (String)("Could not get info for calling package: " + string));
                        return 9;
                    }
                }
                if (!e.a(object)) break block29;
                if (com.google.android.gms.common.c.a((PackageInfo)object2, f.a) == null) {
                    Log.w((String)"GooglePlayServicesUtil", (String)"Google Play services signature invalid.");
                    return 9;
                }
                break block27;
            }
            try {
                packageInfo = packageManager.getPackageInfo("com.android.vending", 64);
            }
            catch (PackageManager.NameNotFoundException nameNotFoundException) {
                Log.w((String)"GooglePlayServicesUtil", (String)"Google Play Store is missing.");
                return 9;
            }
            byte[] arrby = com.google.android.gms.common.c.a(packageInfo, f.a);
            if (arrby == null) {
                Log.w((String)"GooglePlayServicesUtil", (String)"Google Play Store signature invalid.");
                return 9;
            }
            if (com.google.android.gms.common.c.a((PackageInfo)object2, new byte[][]{arrby}) == null) {
                Log.w((String)"GooglePlayServicesUtil", (String)"Google Play services signature invalid.");
                return 9;
            }
        }
        n2 = e.a(6587000);
        if (e.a(((PackageInfo)object2).versionCode) < n2) {
            Log.w((String)"GooglePlayServicesUtil", (String)("Google Play services out of date.  Requires 6587000 but found " + ((PackageInfo)object2).versionCode));
            return 2;
        }
        try {
            ApplicationInfo applicationInfo = packageManager.getApplicationInfo("com.google.android.gms", 0);
            if (applicationInfo.enabled) return 0;
            return 3;
        }
        catch (PackageManager.NameNotFoundException nameNotFoundException) {
            Log.wtf((String)"GooglePlayServicesUtil", (String)"Google Play services missing when getting application info.");
            nameNotFoundException.printStackTrace();
            return n3;
        }
    }
}

