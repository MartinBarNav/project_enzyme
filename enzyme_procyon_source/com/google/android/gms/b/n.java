// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.b;

public class n
{
    private static c a;
    private static volatile boolean b;
    private static e c;
    
    static {
        n.b = false;
    }
    
    private n() {
    }
    
    public static void a(final String s) {
        final e b = b();
        if (b != null) {
            b.d(s);
        }
    }
    
    public static boolean a() {
        boolean b = false;
        if (b() != null) {
            b = b;
            if (b().a() == 0) {
                b = true;
            }
        }
        return b;
    }
    
    private static e b() {
        while (true) {
            Label_0073: {
                synchronized (n.class) {
                    e e;
                    if (n.b) {
                        if (n.c == null) {
                            n.c = new al();
                        }
                        e = n.c;
                    }
                    else {
                        if (n.a == null) {
                            n.a = com.google.android.gms.b.c.a();
                        }
                        if (n.a == null) {
                            break Label_0073;
                        }
                        e = n.a.f;
                    }
                    // monitorexit(n.class)
                    return e;
                }
            }
            // monitorexit(n.class)
            return null;
        }
    }
    
    public static void b(final String s) {
        final e b = b();
        if (b != null) {
            b.b(s);
        }
    }
    
    public static void c(final String s) {
        final e b = b();
        if (b != null) {
            b.a(s);
        }
    }
    
    public static void d(final String s) {
        final e b = b();
        if (b != null) {
            b.c(s);
        }
    }
}
