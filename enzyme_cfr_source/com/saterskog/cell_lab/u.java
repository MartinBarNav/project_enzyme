/*
 * Decompiled with CFR 0.150.
 */
package com.saterskog.cell_lab;

public final class u
implements Comparable<u> {
    double a;
    double b;
    double c;
    double d;
    boolean e;
    boolean f;
    int g;

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final int a(u u2) {
        int n2 = 1;
        if (this.e && u2.e) {
            return 0;
        }
        int n3 = n2;
        if (this.e) return n3;
        if (u2.e) {
            return -1;
        }
        if (u2.b * this.b < 0.0) {
            n3 = n2;
            if (!(this.b > 0.0)) return n3;
            return -1;
        }
        n3 = n2;
        if (!(u2.b * this.a > this.b * u2.a)) return n3;
        return -1;
    }

    @Override
    public final /* synthetic */ int compareTo(Object object) {
        return this.a((u)object);
    }
}

