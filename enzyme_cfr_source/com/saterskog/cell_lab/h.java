/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
package com.saterskog.cell_lab;

import android.content.Context;

public enum h {
    a(true, 0.1, 2131558411, 2131558410),
    b(false, 0.1, 2131558411, 2131558410, 2131558455, 2131558454, 0.12, true),
    c(true, 0.25, 2131558443, 2131558442),
    d(true, 0.1, 2131558411, 2131558410, 2131558428, 2131558427, 0.009, false),
    e(false, 0.005, 2131558432, 2131558431),
    f(false, 0.01, 2131558426, 2131558425),
    g(false, 0.02, 2131558407, 2131558406),
    h(true, 0.01, 2131558411, 2131558410, 2131558422, 2131558421, 0.012, false),
    i(false, 0.2, 2131558411, 2131558410, 2131558462, 2131558461, 0.009, false),
    j(false, 0.02, 2131558411, 2131558410, 2131558437, 2131558436, 0.0135, false),
    k(false, 0.01, 2131558441, 2131558440, 2131558452, 2131558451, 0.012, false),
    l(false, 0.01, 2131558441, 2131558440, 2131558452, 2131558447, 0.006, false),
    m(false, 0.02, 2131558439, 2131558438),
    n(false, 0.02, 2131558441, 2131558440),
    o(false, 0.03, 2131558460, 2131558459),
    p(false, 0.02, 2131558450, 2131558449),
    q(false, 0.005, 2131558420, 2131558419),
    r(false, 0.005, 2131558411, 2131558410, 2131558457, 2131558456, 0.0045, false);

    public static h[] B = com.saterskog.cell_lab.h.values();
    final double A;
    final boolean s;
    final boolean t;
    final double u;
    final double v;
    final int w;
    final int x;
    final int y;
    final int z;

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private h(boolean bl, double d2, double string2) {
        this((String)var1_-1, n2, bl, d2, (int)var6_-1, (int)var7_5, -1, -1, 1.0, false);
        void var7_5;
        void var6_-1;
        void var1_-1;
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private h(boolean bl, double d2, double string222, int string222, int n3, double d3, boolean string222) {
        void var12_-1;
        void var8_-1;
        void var7_5;
        void var6_-1;
        this.s = bl;
        this.u = d2;
        this.v = 0.0;
        this.w = var6_-1;
        this.x = var7_5;
        this.y = var8_-1;
        this.z = n3;
        this.A = d3;
        this.t = var12_-1;
    }

    public final String a(Context context) {
        return context.getResources().getStringArray(2130837507)[this.ordinal()];
    }
}

