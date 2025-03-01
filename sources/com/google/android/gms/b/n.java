package com.google.android.gms.b;

public class n {
    private static c a;
    private static volatile boolean b = false;
    private static e c;

    private n() {
    }

    public static void a(String str) {
        e b2 = b();
        if (b2 != null) {
            b2.d(str);
        }
    }

    public static boolean a() {
        return b() != null && b().a() == 0;
    }

    public static void b(String str) {
        e b2 = b();
        if (b2 != null) {
            b2.b(str);
        }
    }

    public static void c(String str) {
        e b2 = b();
        if (b2 != null) {
            b2.a(str);
        }
    }

    public static void d(String str) {
        e b2 = b();
        if (b2 != null) {
            b2.c(str);
        }
    }

    private static e b() {
        synchronized (n.class) {
            if (b) {
                if (c == null) {
                    c = new al();
                }
                e eVar = c;
                return eVar;
            }
            if (a == null) {
                a = c.a();
            }
            if (a == null) {
                return null;
            }
            e eVar2 = a.f;
            return eVar2;
        }
    }
}
