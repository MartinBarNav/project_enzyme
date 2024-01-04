// 
// Decompiled by Procyon v0.5.36
// 

package com.saterskog.b;

import java.util.Random;

public final class d extends Random
{
    public static d a;
    
    static {
        d.a = new d();
    }
    
    public final double a() {
        return this.nextDouble();
    }
    
    public final int a(double n) {
        final double exp = Math.exp(-n);
        n = 1.0;
        int n2 = 0;
        double n3;
        int n4;
        do {
            n4 = n2 + 1;
            n3 = (n *= this.nextDouble());
            n2 = n4;
        } while (n3 > exp);
        return n4 - 1;
    }
    
    public final double b() {
        return 2.0 * this.nextDouble() - 1.0;
    }
}
