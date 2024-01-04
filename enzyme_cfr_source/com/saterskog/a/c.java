/*
 * Decompiled with CFR 0.150.
 */
package com.saterskog.a;

import com.saterskog.a.b;

public final class c {
    int a;
    String b;

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public c(int n2, String string) {
        this.a = n2;
        if (string == null || string.trim().length() == 0) {
            this.b = com.saterskog.a.b.a(n2);
            return;
        }
        this.b = string + " (response: " + com.saterskog.a.b.a(n2) + ")";
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final boolean a() {
        if (this.a != 0) return false;
        return true;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final boolean b() {
        if (this.a()) return false;
        return true;
    }

    public final String toString() {
        return "IabResult: " + this.b;
    }
}

