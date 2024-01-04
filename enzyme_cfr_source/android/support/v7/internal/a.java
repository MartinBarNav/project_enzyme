/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  android.os.Build$VERSION
 */
package android.support.v7.internal;

import android.os.Build;

public final class a {
    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static boolean a() {
        if (Build.VERSION.SDK_INT < 21) return false;
        return true;
    }
}

