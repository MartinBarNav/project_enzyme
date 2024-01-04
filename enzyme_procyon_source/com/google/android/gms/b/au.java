// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.b;

import java.util.TreeSet;
import java.util.SortedSet;

final class au
{
    private static final au d;
    private SortedSet<a> a;
    private StringBuilder b;
    private boolean c;
    
    static {
        d = new au();
    }
    
    private au() {
        this.a = new TreeSet<a>();
        this.b = new StringBuilder();
        this.c = false;
    }
    
    public static au a() {
        return au.d;
    }
    
    public final void a(final a a) {
        synchronized (this) {
            if (!this.c) {
                this.a.add(a);
                this.b.append("ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789-_".charAt(a.ordinal()));
            }
        }
    }
    
    public final void a(final boolean c) {
        synchronized (this) {
            this.c = c;
        }
    }
    
    public final String b() {
        synchronized (this) {
            final StringBuilder sb = new StringBuilder();
            int n = 6;
            int n2 = 0;
            while (this.a.size() > 0) {
                final a a = this.a.first();
                this.a.remove(a);
                while (a.ordinal() >= n) {
                    sb.append("ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789-_".charAt(n2));
                    n += 6;
                    n2 = 0;
                }
                n2 += 1 << a.ordinal() % 6;
            }
            if (n2 > 0 || sb.length() == 0) {
                sb.append("ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789-_".charAt(n2));
            }
            this.a.clear();
            return sb.toString();
        }
    }
    
    public final String c() {
        synchronized (this) {
            if (this.b.length() > 0) {
                this.b.insert(0, ".");
            }
            final String string = this.b.toString();
            this.b = new StringBuilder();
            return string;
        }
    }
    
    public enum a
    {
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
        a, 
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
        ak, 
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
        z;
    }
}
