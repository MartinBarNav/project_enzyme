package com.saterskog.b;

import java.util.Random;

public final class d extends Random {
    public static d a = new d();

    public final double a() {
        return nextDouble();
    }

    public final double b() {
        return (2.0d * nextDouble()) - 1.0d;
    }

    public final int a(double d) {
        double exp = Math.exp(-d);
        double d2 = 1.0d;
        int i = 0;
        do {
            i++;
            d2 *= nextDouble();
        } while (d2 > exp);
        return i - 1;
    }
}
