package com.saterskog.cell_lab;

public final class u implements Comparable<u> {
    double a;
    double b;
    double c;
    double d;
    boolean e;
    boolean f;
    int g;

    /* renamed from: a */
    public final int compareTo(u uVar) {
        if (this.e && uVar.e) {
            return 0;
        }
        if (this.e) {
            return 1;
        }
        if (uVar.e) {
            return -1;
        }
        if (uVar.b * this.b < 0.0d) {
            if (this.b > 0.0d) {
                return -1;
            }
            return 1;
        } else if (uVar.b * this.a > this.b * uVar.a) {
            return -1;
        } else {
            return 1;
        }
    }
}
