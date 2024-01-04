/*
 * Decompiled with CFR 0.150.
 */
package com.google.android.gms.b;

import com.google.android.gms.b.n;
import com.google.android.gms.b.q;

final class m
implements q {
    private final long a;
    private final int b;
    private double c;
    private long d;
    private final Object e = new Object();
    private final String f;

    private m(String string) {
        this.b = 60;
        this.c = this.b;
        this.a = 2000L;
        this.f = string;
    }

    public m(String string, byte by) {
        this(string);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public final boolean a() {
        Object object = this.e;
        synchronized (object) {
            double d2;
            long l2 = System.currentTimeMillis();
            if (this.c < (double)this.b && (d2 = (double)(l2 - this.d) / (double)this.a) > 0.0) {
                this.c = Math.min((double)this.b, d2 + this.c);
            }
            this.d = l2;
            if (this.c >= 1.0) {
                this.c -= 1.0;
                return true;
            }
            StringBuilder stringBuilder = new StringBuilder("Excessive ");
            n.d(stringBuilder.append(this.f).append(" detected; call ignored.").toString());
            return false;
        }
    }
}

