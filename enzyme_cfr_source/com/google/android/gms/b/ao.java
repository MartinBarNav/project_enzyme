/*
 * Decompiled with CFR 0.150.
 */
package com.google.android.gms.b;

import com.google.android.gms.b.n;

public final class ao {
    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    static String a(String string, int n2) {
        if (n2 > 0) return string + n2;
        n.a("index out of range for " + string + " (" + n2 + ")");
        return "";
    }
}

