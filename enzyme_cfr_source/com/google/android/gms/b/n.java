/*
 * Decompiled with CFR 0.150.
 */
package com.google.android.gms.b;

import com.google.android.gms.b.al;
import com.google.android.gms.b.c;
import com.google.android.gms.b.e;

public class n {
    private static c a;
    private static volatile boolean b;
    private static e c;

    static {
        b = false;
    }

    private n() {
    }

    public static void a(String string) {
        e e2 = n.b();
        if (e2 != null) {
            e2.d(string);
        }
    }

    public static boolean a() {
        boolean bl;
        boolean bl2 = bl = false;
        if (n.b() != null) {
            bl2 = bl;
            if (n.b().a() == 0) {
                bl2 = true;
            }
        }
        return bl2;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static e b() {
        synchronized (n.class) {
            if (b) {
                if (c != null) return c;
                e e2 = new al();
                c = e2;
                return c;
            }
            if (a == null) {
                a = com.google.android.gms.b.c.a();
            }
            if (a == null) return null;
            return n.a.f;
        }
    }

    public static void b(String string) {
        e e2 = n.b();
        if (e2 != null) {
            e2.b(string);
        }
    }

    public static void c(String string) {
        e e2 = n.b();
        if (e2 != null) {
            e2.a(string);
        }
    }

    public static void d(String string) {
        e e2 = n.b();
        if (e2 != null) {
            e2.c(string);
        }
    }
}

