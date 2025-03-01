package com.google.android.gms.common;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.support.v7.b.a;
import android.util.Base64;
import android.util.Log;
import com.google.android.gms.a;
import com.google.android.gms.internal.b;
import com.google.android.gms.internal.e;
import java.util.Arrays;

public final class c {
    public static boolean a = false;
    public static boolean b = false;
    private static int c = -1;
    private static final Object d = new Object();

    private static boolean a() {
        return a ? b : "user".equals(Build.TYPE);
    }

    private static boolean a(PackageManager packageManager) {
        synchronized (d) {
            if (c == -1) {
                try {
                    if (a(packageManager.getPackageInfo("com.google.android.gms", 64), f.E[1]) != null) {
                        c = 1;
                    } else {
                        c = 0;
                    }
                } catch (PackageManager.NameNotFoundException e) {
                    c = 0;
                }
            }
        }
        return c != 0;
    }

    private static byte[] a(PackageInfo packageInfo, boolean z) {
        if (packageInfo.signatures.length != 1) {
            Log.w("GooglePlayServicesUtil", "Package has more than one signature.");
            return null;
        }
        byte[] byteArray = packageInfo.signatures[0].toByteArray();
        if ((z ? f.a() : f.b()).contains(byteArray)) {
            return byteArray;
        }
        if (Log.isLoggable("GooglePlayServicesUtil", 2)) {
            Log.v("GooglePlayServicesUtil", "Signature not valid.  Found: \n" + Base64.encodeToString(byteArray, 0));
        }
        return null;
    }

    private static byte[] a(PackageInfo packageInfo, byte[]... bArr) {
        if (packageInfo.signatures.length != 1) {
            Log.w("GooglePlayServicesUtil", "Package has more than one signature.");
            return null;
        }
        byte[] byteArray = packageInfo.signatures[0].toByteArray();
        for (byte[] bArr2 : bArr) {
            if (Arrays.equals(bArr2, byteArray)) {
                return bArr2;
            }
        }
        if (Log.isLoggable("GooglePlayServicesUtil", 2)) {
            Log.v("GooglePlayServicesUtil", "Signature not valid.  Found: \n" + Base64.encodeToString(byteArray, 0));
        }
        return null;
    }

    private static int b(Context context) {
        boolean z;
        boolean z2;
        PackageManager packageManager = context.getPackageManager();
        if (!b.a) {
            try {
                context.getResources().getString(a.C0020a.common_google_play_services_unknown_issue);
            } catch (Throwable th) {
                Log.e("GooglePlayServicesUtil", "The Google Play services resources were not found. Check your project configuration to ensure that the resources are included.");
            }
        }
        if (!b.a) {
            ApplicationInfo applicationInfo = null;
            try {
                applicationInfo = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128);
            } catch (PackageManager.NameNotFoundException e) {
                Log.wtf("GooglePlayServicesUtil", "This should never happen.", e);
            }
            Bundle bundle = applicationInfo.metaData;
            if (bundle != null) {
                int i = bundle.getInt("com.google.android.gms.version");
                if (i != 6587000) {
                    throw new IllegalStateException("The meta-data tag in your app's AndroidManifest.xml does not have the right value.  Expected 6587000 but found " + i + ".  You must have the following declaration within the <application> element:     <meta-data android:name=\"com.google.android.gms.version\" android:value=\"@integer/google_play_services_version\" />");
                }
            } else {
                throw new IllegalStateException("A required meta-data tag in your app's AndroidManifest.xml does not exist.  You must have the following declaration within the <application> element:     <meta-data android:name=\"com.google.android.gms.version\" android:value=\"@integer/google_play_services_version\" />");
            }
        }
        try {
            PackageInfo packageInfo = packageManager.getPackageInfo("com.google.android.gms", 64);
            if (e.b(packageInfo.versionCode)) {
                char c2 = a() ? (char) 0 : 1;
                if (a(packageInfo, f.a[c2], f.g[c2], f.f[c2]) == null) {
                    Log.w("GooglePlayServicesUtil", "Google Play Services signature invalid on Glass.");
                    return 9;
                }
                String packageName = context.getPackageName();
                try {
                    PackageInfo packageInfo2 = packageManager.getPackageInfo(packageName, 64);
                    if (packageInfo2 == null) {
                        z2 = false;
                    } else {
                        if (a(packageManager) || !a()) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (!z) {
                            z2 = a(packageInfo2, false) != null;
                            if (!z2 && a(packageInfo2, true) != null) {
                                Log.w("GooglePlayServicesUtil", "Test-keys aren't accepted on this build.");
                            }
                        } else if (a(packageInfo2, true) != null) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                    }
                    if (!z2) {
                        Log.w("GooglePlayServicesUtil", "Calling package " + packageInfo2.packageName + " signature invalid on Glass.");
                        return 9;
                    }
                } catch (PackageManager.NameNotFoundException e2) {
                    Log.w("GooglePlayServicesUtil", "Could not get info for calling package: " + packageName);
                    return 9;
                }
            } else if (!e.a(context)) {
                try {
                    byte[] a2 = a(packageManager.getPackageInfo("com.android.vending", 64), f.a);
                    if (a2 == null) {
                        Log.w("GooglePlayServicesUtil", "Google Play Store signature invalid.");
                        return 9;
                    }
                    if (a(packageInfo, a2) == null) {
                        Log.w("GooglePlayServicesUtil", "Google Play services signature invalid.");
                        return 9;
                    }
                } catch (PackageManager.NameNotFoundException e3) {
                    Log.w("GooglePlayServicesUtil", "Google Play Store is missing.");
                    return 9;
                }
            } else if (a(packageInfo, f.a) == null) {
                Log.w("GooglePlayServicesUtil", "Google Play services signature invalid.");
                return 9;
            }
            if (e.a(packageInfo.versionCode) < e.a(6587000)) {
                Log.w("GooglePlayServicesUtil", "Google Play services out of date.  Requires 6587000 but found " + packageInfo.versionCode);
                return 2;
            }
            try {
                return !packageManager.getApplicationInfo("com.google.android.gms", 0).enabled ? 3 : 0;
            } catch (PackageManager.NameNotFoundException e4) {
                Log.wtf("GooglePlayServicesUtil", "Google Play services missing when getting application info.");
                e4.printStackTrace();
                return 1;
            }
        } catch (PackageManager.NameNotFoundException e5) {
            Log.w("GooglePlayServicesUtil", "Google Play services is missing.");
            return 1;
        }
    }

    public static void a(Context context) {
        Intent a2;
        int b2 = b(context);
        if (b2 != 0) {
            switch (b2) {
                case 1:
                case 2:
                    a2 = com.google.android.gms.internal.c.b("com.google.android.gms");
                    break;
                case 3:
                    a2 = com.google.android.gms.internal.c.a("com.google.android.gms");
                    break;
                case a.i.Theme_dividerHorizontal:
                    a2 = com.google.android.gms.internal.c.a();
                    break;
                default:
                    a2 = null;
                    break;
            }
            Log.e("GooglePlayServicesUtil", "GooglePlayServices not available due to error " + b2);
            if (a2 == null) {
                throw new a(b2);
            }
            throw new b(b2, "Google Play Services not available", a2);
        }
    }
}
