/*
 * Decompiled with CFR 0.150.
 */
package com.google.android.gms.b;

import java.util.SortedSet;
import java.util.TreeSet;

final class au {
    private static final au d = new au();
    private SortedSet<a> a = new TreeSet<a>();
    private StringBuilder b = new StringBuilder();
    private boolean c = false;

    private au() {
    }

    public static au a() {
        return d;
    }

    public final void a(a a2) {
        synchronized (this) {
            if (!this.c) {
                this.a.add(a2);
                this.b.append("ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789-_".charAt(a2.ordinal()));
            }
            return;
        }
    }

    public final void a(boolean bl) {
        synchronized (this) {
            this.c = bl;
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final String b() {
        synchronized (this) {
            CharSequence charSequence = new StringBuilder();
            int n2 = 6;
            int n3 = 0;
            while (this.a.size() > 0) {
                a a2 = this.a.first();
                this.a.remove((Object)a2);
                int n4 = a2.ordinal();
                while (n4 >= n2) {
                    ((StringBuilder)charSequence).append("ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789-_".charAt(n3));
                    n2 += 6;
                    n3 = 0;
                }
                n3 += 1 << a2.ordinal() % 6;
            }
            if (n3 > 0 || ((StringBuilder)charSequence).length() == 0) {
                ((StringBuilder)charSequence).append("ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789-_".charAt(n3));
            }
            this.a.clear();
            return ((StringBuilder)charSequence).toString();
        }
    }

    public final String c() {
        synchronized (this) {
            StringBuilder stringBuilder;
            if (this.b.length() > 0) {
                this.b.insert(0, ".");
            }
            String string = this.b.toString();
            this.b = stringBuilder = new StringBuilder();
            return string;
        }
    }

    public static enum a {
        a,
        b,
        c,
        d,
        e,
        f,
        g,
        h,
        i,
        j,
        k,
        l,
        m,
        n,
        o,
        p,
        q,
        r,
        s,
        t,
        u,
        v,
        w,
        x,
        y,
        z,
        A,
        B,
        C,
        D,
        E,
        F,
        G,
        H,
        I,
        J,
        K,
        L,
        M,
        N,
        O,
        P,
        Q,
        R,
        S,
        T,
        U,
        V,
        W,
        X,
        Y,
        Z,
        aa,
        ab,
        ac,
        ad,
        ae,
        af,
        ag,
        ah,
        ai,
        aj,
        ak;

    }
}

