/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  android.os.Build$VERSION
 */
package com.google.android.gms.b;

import android.os.Build;
import com.google.android.gms.b.n;

public final class ap {
    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static int a() {
        try {
            return Integer.parseInt(Build.VERSION.SDK);
        }
        catch (NumberFormatException numberFormatException) {
            n.a("Invalid version number: " + Build.VERSION.SDK);
            return 0;
        }
    }
}

