// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.common;

import java.util.Arrays;
import java.util.Set;
import android.util.Base64;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager$NameNotFoundException;
import android.content.pm.PackageManager;
import android.os.Build;
import android.content.Intent;
import android.util.Log;
import android.content.Context;

public final class c
{
    public static boolean a;
    public static boolean b;
    private static int c;
    private static final Object d;
    
    static {
        com.google.android.gms.common.c.a = false;
        com.google.android.gms.common.c.b = false;
        com.google.android.gms.common.c.c = -1;
        d = new Object();
    }
    
    public static void a(final Context context) {
        final int b = b(context);
        if (b == 0) {
            return;
        }
        Intent intent = null;
        switch (b) {
            default: {
                intent = null;
                break;
            }
            case 1:
            case 2: {
                intent = com.google.android.gms.internal.c.b("com.google.android.gms");
                break;
            }
            case 42: {
                intent = com.google.android.gms.internal.c.a();
                break;
            }
            case 3: {
                intent = com.google.android.gms.internal.c.a("com.google.android.gms");
                break;
            }
        }
        Log.e("GooglePlayServicesUtil", "GooglePlayServices not available due to error " + b);
        if (intent == null) {
            throw new a(b);
        }
        throw new b(b, "Google Play Services not available", intent);
    }
    
    private static boolean a() {
        boolean b;
        if (com.google.android.gms.common.c.a) {
            b = com.google.android.gms.common.c.b;
        }
        else {
            b = "user".equals(Build.TYPE);
        }
        return b;
    }
    
    private static boolean a(final PackageManager packageManager) {
        while (true) {
            boolean b = true;
            synchronized (com.google.android.gms.common.c.d) {
            Label_0047:
                while (true) {
                    if (com.google.android.gms.common.c.c != -1) {
                        break Label_0047;
                    }
                    while (true) {
                        try {
                            if (a(packageManager.getPackageInfo("com.google.android.gms", 64), new byte[][] { f.E[1] }) != null) {
                                com.google.android.gms.common.c.c = 1;
                            }
                            else {
                                com.google.android.gms.common.c.c = 0;
                            }
                            // monitorexit(c.d)
                            if (com.google.android.gms.common.c.c != 0) {
                                return b;
                            }
                            break;
                        }
                        catch (PackageManager$NameNotFoundException ex) {
                            com.google.android.gms.common.c.c = 0;
                            continue Label_0047;
                        }
                        continue Label_0047;
                    }
                    break;
                }
            }
            b = false;
            return b;
        }
    }
    
    private static byte[] a(final PackageInfo packageInfo, final boolean b) {
        byte[] array;
        if (packageInfo.signatures.length != 1) {
            Log.w("GooglePlayServicesUtil", "Package has more than one signature.");
            array = null;
        }
        else {
            final byte[] byteArray = packageInfo.signatures[0].toByteArray();
            Set<byte[]> set;
            if (b) {
                set = f.a();
            }
            else {
                set = f.b();
            }
            if (set.contains(byteArray)) {
                array = byteArray;
            }
            else {
                if (Log.isLoggable("GooglePlayServicesUtil", 2)) {
                    Log.v("GooglePlayServicesUtil", "Signature not valid.  Found: \n" + Base64.encodeToString(byteArray, 0));
                }
                array = null;
            }
        }
        return array;
    }
    
    private static byte[] a(final PackageInfo packageInfo, final byte[]... array) {
        byte[] a;
        if (packageInfo.signatures.length != 1) {
            Log.w("GooglePlayServicesUtil", "Package has more than one signature.");
            a = null;
        }
        else {
            final byte[] byteArray = packageInfo.signatures[0].toByteArray();
            for (int i = 0; i < array.length; ++i) {
                a = array[i];
                if (Arrays.equals(a, byteArray)) {
                    return a;
                }
            }
            if (Log.isLoggable("GooglePlayServicesUtil", 2)) {
                Log.v("GooglePlayServicesUtil", "Signature not valid.  Found: \n" + Base64.encodeToString(byteArray, 0));
            }
            a = null;
        }
        return a;
    }
    
    private static int b(final Context p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: istore_1       
        //     2: aload_0        
        //     3: invokevirtual   android/content/Context.getPackageManager:()Landroid/content/pm/PackageManager;
        //     6: astore_2       
        //     7: getstatic       com/google/android/gms/internal/b.a:Z
        //    10: ifne            24
        //    13: aload_0        
        //    14: invokevirtual   android/content/Context.getResources:()Landroid/content/res/Resources;
        //    17: getstatic       com/google/android/gms/a$a.common_google_play_services_unknown_issue:I
        //    20: invokevirtual   android/content/res/Resources.getString:(I)Ljava/lang/String;
        //    23: pop            
        //    24: getstatic       com/google/android/gms/internal/b.a:Z
        //    27: ifne            142
        //    30: aconst_null    
        //    31: astore_3       
        //    32: aload_0        
        //    33: invokevirtual   android/content/Context.getPackageManager:()Landroid/content/pm/PackageManager;
        //    36: aload_0        
        //    37: invokevirtual   android/content/Context.getPackageName:()Ljava/lang/String;
        //    40: sipush          128
        //    43: invokevirtual   android/content/pm/PackageManager.getApplicationInfo:(Ljava/lang/String;I)Landroid/content/pm/ApplicationInfo;
        //    46: astore          4
        //    48: aload           4
        //    50: astore_3       
        //    51: aload_3        
        //    52: getfield        android/content/pm/ApplicationInfo.metaData:Landroid/os/Bundle;
        //    55: astore_3       
        //    56: aload_3        
        //    57: ifnull          132
        //    60: aload_3        
        //    61: ldc             "com.google.android.gms.version"
        //    63: invokevirtual   android/os/Bundle.getInt:(Ljava/lang/String;)I
        //    66: istore          5
        //    68: iload           5
        //    70: ldc             6587000
        //    72: if_icmpeq       142
        //    75: new             Ljava/lang/IllegalStateException;
        //    78: dup            
        //    79: new             Ljava/lang/StringBuilder;
        //    82: dup            
        //    83: ldc             "The meta-data tag in your app's AndroidManifest.xml does not have the right value.  Expected 6587000 but found "
        //    85: invokespecial   java/lang/StringBuilder.<init>:(Ljava/lang/String;)V
        //    88: iload           5
        //    90: invokevirtual   java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
        //    93: ldc             ".  You must have the following declaration within the <application> element:     <meta-data android:name=\"com.google.android.gms.version\" android:value=\"@integer/google_play_services_version\" />"
        //    95: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    98: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   101: invokespecial   java/lang/IllegalStateException.<init>:(Ljava/lang/String;)V
        //   104: athrow         
        //   105: astore_3       
        //   106: ldc             "GooglePlayServicesUtil"
        //   108: ldc             "The Google Play services resources were not found. Check your project configuration to ensure that the resources are included."
        //   110: invokestatic    android/util/Log.e:(Ljava/lang/String;Ljava/lang/String;)I
        //   113: pop            
        //   114: goto            24
        //   117: astore          4
        //   119: ldc             "GooglePlayServicesUtil"
        //   121: ldc             "This should never happen."
        //   123: aload           4
        //   125: invokestatic    android/util/Log.wtf:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
        //   128: pop            
        //   129: goto            51
        //   132: new             Ljava/lang/IllegalStateException;
        //   135: dup            
        //   136: ldc             "A required meta-data tag in your app's AndroidManifest.xml does not exist.  You must have the following declaration within the <application> element:     <meta-data android:name=\"com.google.android.gms.version\" android:value=\"@integer/google_play_services_version\" />"
        //   138: invokespecial   java/lang/IllegalStateException.<init>:(Ljava/lang/String;)V
        //   141: athrow         
        //   142: aload_2        
        //   143: ldc             "com.google.android.gms"
        //   145: bipush          64
        //   147: invokevirtual   android/content/pm/PackageManager.getPackageInfo:(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;
        //   150: astore_3       
        //   151: aload_3        
        //   152: getfield        android/content/pm/PackageInfo.versionCode:I
        //   155: invokestatic    com/google/android/gms/internal/e.b:(I)Z
        //   158: ifeq            447
        //   161: invokestatic    com/google/android/gms/common/c.a:()Z
        //   164: ifeq            238
        //   167: iconst_0       
        //   168: istore          5
        //   170: aload_3        
        //   171: iconst_3       
        //   172: anewarray       [B
        //   175: dup            
        //   176: iconst_0       
        //   177: getstatic       com/google/android/gms/common/f.a:[[B
        //   180: iload           5
        //   182: aaload         
        //   183: aastore        
        //   184: dup            
        //   185: iconst_1       
        //   186: getstatic       com/google/android/gms/common/f.g:[[B
        //   189: iload           5
        //   191: aaload         
        //   192: aastore        
        //   193: dup            
        //   194: iconst_2       
        //   195: getstatic       com/google/android/gms/common/f.f:[[B
        //   198: iload           5
        //   200: aaload         
        //   201: aastore        
        //   202: invokestatic    com/google/android/gms/common/c.a:(Landroid/content/pm/PackageInfo;[[B)[B
        //   205: ifnonnull       244
        //   208: ldc             "GooglePlayServicesUtil"
        //   210: ldc             "Google Play Services signature invalid on Glass."
        //   212: invokestatic    android/util/Log.w:(Ljava/lang/String;Ljava/lang/String;)I
        //   215: pop            
        //   216: bipush          9
        //   218: istore          5
        //   220: iload           5
        //   222: ireturn        
        //   223: astore_0       
        //   224: ldc             "GooglePlayServicesUtil"
        //   226: ldc             "Google Play services is missing."
        //   228: invokestatic    android/util/Log.w:(Ljava/lang/String;Ljava/lang/String;)I
        //   231: pop            
        //   232: iload_1        
        //   233: istore          5
        //   235: goto            220
        //   238: iconst_1       
        //   239: istore          5
        //   241: goto            170
        //   244: aload_0        
        //   245: invokevirtual   android/content/Context.getPackageName:()Ljava/lang/String;
        //   248: astore_0       
        //   249: aload_2        
        //   250: aload_0        
        //   251: bipush          64
        //   253: invokevirtual   android/content/pm/PackageManager.getPackageInfo:(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;
        //   256: astore          4
        //   258: aload           4
        //   260: ifnonnull       312
        //   263: iconst_0       
        //   264: istore          5
        //   266: iload           5
        //   268: ifne            566
        //   271: new             Ljava/lang/StringBuilder;
        //   274: astore_3       
        //   275: aload_3        
        //   276: ldc             "Calling package "
        //   278: invokespecial   java/lang/StringBuilder.<init>:(Ljava/lang/String;)V
        //   281: ldc             "GooglePlayServicesUtil"
        //   283: aload_3        
        //   284: aload           4
        //   286: getfield        android/content/pm/PackageInfo.packageName:Ljava/lang/String;
        //   289: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   292: ldc_w           " signature invalid on Glass."
        //   295: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   298: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   301: invokestatic    android/util/Log.w:(Ljava/lang/String;Ljava/lang/String;)I
        //   304: pop            
        //   305: bipush          9
        //   307: istore          5
        //   309: goto            220
        //   312: aload_2        
        //   313: invokestatic    com/google/android/gms/common/c.a:(Landroid/content/pm/PackageManager;)Z
        //   316: ifne            325
        //   319: invokestatic    com/google/android/gms/common/c.a:()Z
        //   322: ifne            348
        //   325: iconst_1       
        //   326: istore          5
        //   328: iload           5
        //   330: ifeq            360
        //   333: aload           4
        //   335: iconst_1       
        //   336: invokestatic    com/google/android/gms/common/c.a:(Landroid/content/pm/PackageInfo;Z)[B
        //   339: ifnull          354
        //   342: iconst_1       
        //   343: istore          5
        //   345: goto            266
        //   348: iconst_0       
        //   349: istore          5
        //   351: goto            328
        //   354: iconst_0       
        //   355: istore          5
        //   357: goto            266
        //   360: aload           4
        //   362: iconst_0       
        //   363: invokestatic    com/google/android/gms/common/c.a:(Landroid/content/pm/PackageInfo;Z)[B
        //   366: ifnull          441
        //   369: iconst_1       
        //   370: istore          6
        //   372: iload           6
        //   374: istore          5
        //   376: iload           6
        //   378: ifne            266
        //   381: iload           6
        //   383: istore          5
        //   385: aload           4
        //   387: iconst_1       
        //   388: invokestatic    com/google/android/gms/common/c.a:(Landroid/content/pm/PackageInfo;Z)[B
        //   391: ifnull          266
        //   394: ldc             "GooglePlayServicesUtil"
        //   396: ldc_w           "Test-keys aren't accepted on this build."
        //   399: invokestatic    android/util/Log.w:(Ljava/lang/String;Ljava/lang/String;)I
        //   402: pop            
        //   403: iload           6
        //   405: istore          5
        //   407: goto            266
        //   410: astore_3       
        //   411: ldc             "GooglePlayServicesUtil"
        //   413: new             Ljava/lang/StringBuilder;
        //   416: dup            
        //   417: ldc_w           "Could not get info for calling package: "
        //   420: invokespecial   java/lang/StringBuilder.<init>:(Ljava/lang/String;)V
        //   423: aload_0        
        //   424: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   427: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   430: invokestatic    android/util/Log.w:(Ljava/lang/String;Ljava/lang/String;)I
        //   433: pop            
        //   434: bipush          9
        //   436: istore          5
        //   438: goto            220
        //   441: iconst_0       
        //   442: istore          6
        //   444: goto            372
        //   447: aload_0        
        //   448: invokestatic    com/google/android/gms/internal/e.a:(Landroid/content/Context;)Z
        //   451: ifeq            480
        //   454: aload_3        
        //   455: getstatic       com/google/android/gms/common/f.a:[[B
        //   458: invokestatic    com/google/android/gms/common/c.a:(Landroid/content/pm/PackageInfo;[[B)[B
        //   461: ifnonnull       566
        //   464: ldc             "GooglePlayServicesUtil"
        //   466: ldc_w           "Google Play services signature invalid."
        //   469: invokestatic    android/util/Log.w:(Ljava/lang/String;Ljava/lang/String;)I
        //   472: pop            
        //   473: bipush          9
        //   475: istore          5
        //   477: goto            220
        //   480: aload_2        
        //   481: ldc_w           "com.android.vending"
        //   484: bipush          64
        //   486: invokevirtual   android/content/pm/PackageManager.getPackageInfo:(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;
        //   489: astore_0       
        //   490: aload_0        
        //   491: getstatic       com/google/android/gms/common/f.a:[[B
        //   494: invokestatic    com/google/android/gms/common/c.a:(Landroid/content/pm/PackageInfo;[[B)[B
        //   497: astore_0       
        //   498: aload_0        
        //   499: ifnonnull       535
        //   502: ldc             "GooglePlayServicesUtil"
        //   504: ldc_w           "Google Play Store signature invalid."
        //   507: invokestatic    android/util/Log.w:(Ljava/lang/String;Ljava/lang/String;)I
        //   510: pop            
        //   511: bipush          9
        //   513: istore          5
        //   515: goto            220
        //   518: astore_0       
        //   519: ldc             "GooglePlayServicesUtil"
        //   521: ldc_w           "Google Play Store is missing."
        //   524: invokestatic    android/util/Log.w:(Ljava/lang/String;Ljava/lang/String;)I
        //   527: pop            
        //   528: bipush          9
        //   530: istore          5
        //   532: goto            220
        //   535: aload_3        
        //   536: iconst_1       
        //   537: anewarray       [B
        //   540: dup            
        //   541: iconst_0       
        //   542: aload_0        
        //   543: aastore        
        //   544: invokestatic    com/google/android/gms/common/c.a:(Landroid/content/pm/PackageInfo;[[B)[B
        //   547: ifnonnull       566
        //   550: ldc             "GooglePlayServicesUtil"
        //   552: ldc_w           "Google Play services signature invalid."
        //   555: invokestatic    android/util/Log.w:(Ljava/lang/String;Ljava/lang/String;)I
        //   558: pop            
        //   559: bipush          9
        //   561: istore          5
        //   563: goto            220
        //   566: ldc             6587000
        //   568: invokestatic    com/google/android/gms/internal/e.a:(I)I
        //   571: istore          5
        //   573: aload_3        
        //   574: getfield        android/content/pm/PackageInfo.versionCode:I
        //   577: invokestatic    com/google/android/gms/internal/e.a:(I)I
        //   580: iload           5
        //   582: if_icmpge       617
        //   585: ldc             "GooglePlayServicesUtil"
        //   587: new             Ljava/lang/StringBuilder;
        //   590: dup            
        //   591: ldc_w           "Google Play services out of date.  Requires 6587000 but found "
        //   594: invokespecial   java/lang/StringBuilder.<init>:(Ljava/lang/String;)V
        //   597: aload_3        
        //   598: getfield        android/content/pm/PackageInfo.versionCode:I
        //   601: invokevirtual   java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
        //   604: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   607: invokestatic    android/util/Log.w:(Ljava/lang/String;Ljava/lang/String;)I
        //   610: pop            
        //   611: iconst_2       
        //   612: istore          5
        //   614: goto            220
        //   617: aload_2        
        //   618: ldc             "com.google.android.gms"
        //   620: iconst_0       
        //   621: invokevirtual   android/content/pm/PackageManager.getApplicationInfo:(Ljava/lang/String;I)Landroid/content/pm/ApplicationInfo;
        //   624: astore_0       
        //   625: aload_0        
        //   626: getfield        android/content/pm/ApplicationInfo.enabled:Z
        //   629: ifne            658
        //   632: iconst_3       
        //   633: istore          5
        //   635: goto            220
        //   638: astore_0       
        //   639: ldc             "GooglePlayServicesUtil"
        //   641: ldc_w           "Google Play services missing when getting application info."
        //   644: invokestatic    android/util/Log.wtf:(Ljava/lang/String;Ljava/lang/String;)I
        //   647: pop            
        //   648: aload_0        
        //   649: invokevirtual   android/content/pm/PackageManager$NameNotFoundException.printStackTrace:()V
        //   652: iload_1        
        //   653: istore          5
        //   655: goto            220
        //   658: iconst_0       
        //   659: istore          5
        //   661: goto            220
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                                     
        //  -----  -----  -----  -----  ---------------------------------------------------------
        //  13     24     105    117    Ljava/lang/Throwable;
        //  32     48     117    132    Landroid/content/pm/PackageManager$NameNotFoundException;
        //  142    151    223    238    Landroid/content/pm/PackageManager$NameNotFoundException;
        //  249    258    410    441    Landroid/content/pm/PackageManager$NameNotFoundException;
        //  271    305    410    441    Landroid/content/pm/PackageManager$NameNotFoundException;
        //  312    325    410    441    Landroid/content/pm/PackageManager$NameNotFoundException;
        //  333    342    410    441    Landroid/content/pm/PackageManager$NameNotFoundException;
        //  360    369    410    441    Landroid/content/pm/PackageManager$NameNotFoundException;
        //  385    403    410    441    Landroid/content/pm/PackageManager$NameNotFoundException;
        //  480    490    518    535    Landroid/content/pm/PackageManager$NameNotFoundException;
        //  617    625    638    658    Landroid/content/pm/PackageManager$NameNotFoundException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0051:
        //     at com.strobel.decompiler.ast.Error.expressionLinkedFromMultipleLocations(Error.java:27)
        //     at com.strobel.decompiler.ast.AstOptimizer.mergeDisparateObjectInitializations(AstOptimizer.java:2596)
        //     at com.strobel.decompiler.ast.AstOptimizer.optimize(AstOptimizer.java:235)
        //     at com.strobel.decompiler.ast.AstOptimizer.optimize(AstOptimizer.java:42)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:214)
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
}
