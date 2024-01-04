// 
// Decompiled by Procyon v0.5.36
// 

package com.saterskog.cell_lab;

public final class u implements Comparable<u>
{
    double a;
    double b;
    double c;
    double d;
    boolean e;
    boolean f;
    int g;
    
    public final int a(final u u) {
        final boolean b = true;
        int n;
        if (this.e && u.e) {
            n = 0;
        }
        else {
            n = (b ? 1 : 0);
            if (!this.e) {
                if (u.e) {
                    n = -1;
                }
                else if (u.b * this.b < 0.0) {
                    n = (b ? 1 : 0);
                    if (this.b > 0.0) {
                        n = -1;
                    }
                }
                else {
                    n = (b ? 1 : 0);
                    if (u.b * this.a > this.b * u.a) {
                        n = -1;
                    }
                }
            }
        }
        return n;
    }
}
