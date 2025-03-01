/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  android.os.Build$VERSION
 *  android.view.View
 */
package android.support.v4.view;

import android.os.Build;
import android.support.v4.view.aa;
import android.support.v4.view.ae;
import android.support.v4.view.v;
import android.support.v4.view.w;
import android.support.v4.view.x;
import android.support.v4.view.y;
import android.support.v4.view.z;
import android.view.View;
import java.util.WeakHashMap;

public final class u {
    static final j a;

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    static {
        int n2 = Build.VERSION.SDK_INT;
        if (n2 >= 21) {
            a = new a();
            return;
        }
        if (n2 >= 19) {
            a = new i();
            return;
        }
        if (n2 >= 17) {
            a = new h();
            return;
        }
        if (n2 >= 16) {
            a = new g();
            return;
        }
        if (n2 >= 14) {
            a = new f();
            return;
        }
        if (n2 >= 11) {
            a = new e();
            return;
        }
        if (n2 >= 9) {
            a = new d();
            return;
        }
        if (n2 >= 7) {
            a = new c();
            return;
        }
        a = new b();
    }

    public static int a(int n2, int n3, int n4) {
        return a.a(n2, n3, n4);
    }

    public static int a(View view) {
        return a.b(view);
    }

    public static void a(View view, float f2) {
        a.a(view, f2);
    }

    public static void a(View view, android.support.v4.view.a a2) {
        a.a(view, a2);
    }

    public static void a(View view, Runnable runnable) {
        a.a(view, runnable);
    }

    public static void a(View view, Runnable runnable, long l2) {
        a.a(view, runnable, l2);
    }

    public static boolean a(View view, int n2) {
        return a.a(view, n2);
    }

    public static void b(View view) {
        a.c(view);
    }

    public static void b(View view, float f2) {
        a.b(view, f2);
    }

    public static void b(View view, int n2) {
        a.b(view, n2);
    }

    public static int c(View view) {
        return a.d(view);
    }

    public static void d(View view) {
        a.e(view);
    }

    public static int e(View view) {
        return a.f(view);
    }

    public static int f(View view) {
        return a.g(view);
    }

    public static float g(View view) {
        return a.h(view);
    }

    public static int h(View view) {
        return a.i(view);
    }

    public static ae i(View view) {
        return a.j(view);
    }

    public static void j(View view) {
        a.k(view);
    }

    public static int k(View view) {
        return a.l(view);
    }

    public static void l(View view) {
        a.a(view);
    }

    public static void m(View view) {
        a.m(view);
    }

    static final class a
    extends i {
        a() {
        }

        @Override
        public final void a(View view) {
            v.a(view);
        }
    }

    static class b
    implements j {
        WeakHashMap<View, ae> a = null;

        b() {
        }

        @Override
        public int a(int n2, int n3, int n4) {
            return View.resolveSize((int)n2, (int)n3);
        }

        long a() {
            return 10L;
        }

        @Override
        public void a(View view) {
        }

        @Override
        public void a(View view, float f2) {
        }

        @Override
        public void a(View view, android.support.v4.view.a a2) {
        }

        @Override
        public void a(View view, Runnable runnable) {
            view.postDelayed(runnable, this.a());
        }

        @Override
        public void a(View view, Runnable runnable, long l2) {
            view.postDelayed(runnable, this.a() + l2);
        }

        @Override
        public boolean a(View view, int n2) {
            return false;
        }

        @Override
        public int b(View view) {
            return 2;
        }

        @Override
        public void b(View view, float f2) {
        }

        @Override
        public void b(View view, int n2) {
        }

        @Override
        public void c(View view) {
            view.invalidate();
        }

        @Override
        public int d(View view) {
            return 0;
        }

        @Override
        public void e(View view) {
        }

        @Override
        public int f(View view) {
            return 0;
        }

        @Override
        public int g(View view) {
            return 0;
        }

        @Override
        public float h(View view) {
            return 0.0f;
        }

        @Override
        public int i(View view) {
            return 0;
        }

        @Override
        public ae j(View view) {
            return new ae(view);
        }

        @Override
        public void k(View view) {
        }

        @Override
        public int l(View view) {
            return 0;
        }

        @Override
        public void m(View view) {
        }
    }

    static class c
    extends b {
        c() {
        }
    }

    static class d
    extends c {
        d() {
        }

        @Override
        public final int b(View view) {
            return w.a(view);
        }
    }

    static class e
    extends d {
        e() {
        }

        @Override
        public final int a(int n2, int n3, int n4) {
            return x.a(n2, n3, n4);
        }

        @Override
        final long a() {
            return x.a();
        }

        @Override
        public final void a(View view, float f2) {
            x.a(view, f2);
        }

        @Override
        public final void b(View view, float f2) {
            x.b(view, f2);
        }

        @Override
        public final void b(View view, int n2) {
            x.a(view, n2);
        }

        @Override
        public final int g(View view) {
            return x.a(view);
        }

        @Override
        public final float h(View view) {
            return x.b(view);
        }

        @Override
        public final void k(View view) {
            x.c(view);
        }

        @Override
        public final void m(View view) {
            x.d(view);
        }
    }

    static class f
    extends e {
        static boolean b = false;

        f() {
        }

        @Override
        public final void a(View view, android.support.v4.view.a a2) {
            y.a(view, a2.a);
        }

        @Override
        public final boolean a(View view, int n2) {
            return y.a(view, n2);
        }

        @Override
        public final ae j(View view) {
            ae ae2;
            if (this.a == null) {
                this.a = new WeakHashMap();
            }
            ae ae3 = ae2 = (ae)this.a.get((Object)view);
            if (ae2 == null) {
                ae3 = new ae(view);
                this.a.put(view, ae3);
            }
            return ae3;
        }
    }

    static class g
    extends f {
        g() {
        }

        @Override
        public void a(View view) {
            z.e(view);
        }

        @Override
        public final void a(View view, Runnable runnable) {
            z.a(view, runnable);
        }

        @Override
        public final void a(View view, Runnable runnable, long l2) {
            z.a(view, runnable, l2);
        }

        @Override
        public final void c(View view) {
            z.a(view);
        }

        @Override
        public final int d(View view) {
            return z.b(view);
        }

        @Override
        public void e(View view) {
            z.c(view);
        }

        @Override
        public final int i(View view) {
            return z.d(view);
        }
    }

    static class h
    extends g {
        h() {
        }

        @Override
        public final int f(View view) {
            return aa.a(view);
        }

        @Override
        public final int l(View view) {
            return aa.b(view);
        }
    }

    static class i
    extends h {
        i() {
        }

        @Override
        public final void e(View view) {
            z.c(view);
        }
    }

    static interface j {
        public int a(int var1, int var2, int var3);

        public void a(View var1);

        public void a(View var1, float var2);

        public void a(View var1, android.support.v4.view.a var2);

        public void a(View var1, Runnable var2);

        public void a(View var1, Runnable var2, long var3);

        public boolean a(View var1, int var2);

        public int b(View var1);

        public void b(View var1, float var2);

        public void b(View var1, int var2);

        public void c(View var1);

        public int d(View var1);

        public void e(View var1);

        public int f(View var1);

        public int g(View var1);

        public float h(View var1);

        public int i(View var1);

        public ae j(View var1);

        public void k(View var1);

        public int l(View var1);

        public void m(View var1);
    }
}

