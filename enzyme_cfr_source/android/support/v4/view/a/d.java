/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  android.os.Build$VERSION
 */
package android.support.v4.view.a;

import android.os.Build;
import android.support.v4.view.a.e;
import android.support.v4.view.a.f;
import java.util.ArrayList;
import java.util.List;

public final class d {
    private static final a b;
    public final Object a;

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    static {
        if (Build.VERSION.SDK_INT >= 19) {
            b = new c();
            return;
        }
        if (Build.VERSION.SDK_INT >= 16) {
            b = new b();
            return;
        }
        b = new d();
    }

    public d() {
        this.a = b.a(this);
    }

    public d(Object object) {
        this.a = object;
    }

    public static android.support.v4.view.a.a a() {
        return null;
    }

    public static boolean b() {
        return false;
    }

    public static List<android.support.v4.view.a.a> c() {
        return null;
    }

    public static android.support.v4.view.a.a d() {
        return null;
    }

    static interface a {
        public Object a(d var1);
    }

    static final class b
    extends d {
        b() {
        }

        @Override
        public final Object a(final d d2) {
            return e.a(new e.a(){

                @Override
                public final boolean a() {
                    return d.b();
                }

                @Override
                public final List<Object> b() {
                    d.c();
                    new ArrayList();
                    throw new NullPointerException();
                }

                @Override
                public final Object c() {
                    d.a();
                    return null;
                }
            });
        }
    }

    static final class c
    extends d {
        c() {
        }

        @Override
        public final Object a(final d d2) {
            return f.a(new f.a(){

                @Override
                public final boolean a() {
                    return d.b();
                }

                @Override
                public final List<Object> b() {
                    d.c();
                    new ArrayList();
                    throw new NullPointerException();
                }

                @Override
                public final Object c() {
                    d.a();
                    return null;
                }

                @Override
                public final Object d() {
                    d.d();
                    return null;
                }
            });
        }
    }

    static class d
    implements a {
        d() {
        }

        @Override
        public Object a(d d2) {
            return null;
        }
    }
}

