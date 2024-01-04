/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
package com.google.android.gms.internal;

import android.content.Context;
import java.util.regex.Pattern;

public final class e {
    private static Pattern a = null;

    public static int a(int n2) {
        return n2 / 1000;
    }

    public static boolean a(Context context) {
        return context.getPackageManager().hasSystemFeature("android.hardware.type.watch");
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static boolean b(int n2) {
        if (n2 % 1000 / 100 != 3) return false;
        return true;
    }
}

