/*
 * Decompiled with CFR 0.150.
 */
package com.saterskog.b;

import java.util.Random;

public final class d
extends Random {
    public static d a = new d();

    public final double a() {
        return this.nextDouble();
    }

    public final int a(double d2) {
        int n2;
        double d3;
        double d4 = Math.exp(-d2);
        d2 = 1.0;
        int n3 = 0;
        do {
            n2 = n3 + 1;
            d2 = d3 = d2 * this.nextDouble();
            n3 = n2;
        } while (d3 > d4);
        return n2 - 1;
    }

    public final double b() {
        return 2.0 * this.nextDouble() - 1.0;
    }
}

