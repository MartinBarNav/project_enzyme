package android.support.v4.view;

import android.os.Build;
import android.view.View;
import java.util.WeakHashMap;

public final class u {
    static final j a;

    interface j {
        int a(int i, int i2, int i3);

        void a(View view);

        void a(View view, float f);

        void a(View view, a aVar);

        void a(View view, Runnable runnable);

        void a(View view, Runnable runnable, long j);

        boolean a(View view, int i);

        int b(View view);

        void b(View view, float f);

        void b(View view, int i);

        void c(View view);

        int d(View view);

        void e(View view);

        int f(View view);

        int g(View view);

        float h(View view);

        int i(View view);

        ae j(View view);

        void k(View view);

        int l(View view);

        void m(View view);
    }

    static class b implements j {
        WeakHashMap<View, ae> a = null;

        b() {
        }

        public boolean a(View view, int i) {
            return false;
        }

        public int b(View view) {
            return 2;
        }

        public void a(View view, a aVar) {
        }

        public void c(View view) {
            view.invalidate();
        }

        public void a(View view, Runnable runnable) {
            view.postDelayed(runnable, a());
        }

        public void a(View view, Runnable runnable, long j) {
            view.postDelayed(runnable, a() + j);
        }

        /* access modifiers changed from: package-private */
        public long a() {
            return 10;
        }

        public int d(View view) {
            return 0;
        }

        public void e(View view) {
        }

        public void b(View view, int i) {
        }

        public int f(View view) {
            return 0;
        }

        public int a(int i, int i2, int i3) {
            return View.resolveSize(i, i2);
        }

        public int g(View view) {
            return 0;
        }

        public float h(View view) {
            return 0.0f;
        }

        public int i(View view) {
            return 0;
        }

        public ae j(View view) {
            return new ae(view);
        }

        public void a(View view, float f) {
        }

        public void b(View view, float f) {
        }

        public void k(View view) {
        }

        public int l(View view) {
            return 0;
        }

        public void a(View view) {
        }

        public void m(View view) {
        }
    }

    static class c extends b {
        c() {
        }
    }

    static class d extends c {
        d() {
        }

        public final int b(View view) {
            return w.a(view);
        }
    }

    static class e extends d {
        e() {
        }

        /* access modifiers changed from: package-private */
        public final long a() {
            return x.a();
        }

        public final void b(View view, int i) {
            x.a(view, i);
        }

        public final int a(int i, int i2, int i3) {
            return x.a(i, i2, i3);
        }

        public final int g(View view) {
            return x.a(view);
        }

        public final float h(View view) {
            return x.b(view);
        }

        public final void a(View view, float f) {
            x.a(view, f);
        }

        public final void b(View view, float f) {
            x.b(view, f);
        }

        public final void k(View view) {
            x.c(view);
        }

        public final void m(View view) {
            x.d(view);
        }
    }

    static class f extends e {
        static boolean b = false;

        f() {
        }

        public final boolean a(View view, int i) {
            return y.a(view, i);
        }

        public final ae j(View view) {
            if (this.a == null) {
                this.a = new WeakHashMap();
            }
            ae aeVar = (ae) this.a.get(view);
            if (aeVar != null) {
                return aeVar;
            }
            ae aeVar2 = new ae(view);
            this.a.put(view, aeVar2);
            return aeVar2;
        }

        public final void a(View view, a aVar) {
            y.a(view, aVar.a);
        }
    }

    static class g extends f {
        g() {
        }

        public final void c(View view) {
            z.a(view);
        }

        public final void a(View view, Runnable runnable) {
            z.a(view, runnable);
        }

        public final void a(View view, Runnable runnable, long j) {
            z.a(view, runnable, j);
        }

        public final int d(View view) {
            return z.b(view);
        }

        public void e(View view) {
            z.c(view);
        }

        public final int i(View view) {
            return z.d(view);
        }

        public void a(View view) {
            z.e(view);
        }
    }

    static class h extends g {
        h() {
        }

        public final int f(View view) {
            return aa.a(view);
        }

        public final int l(View view) {
            return aa.b(view);
        }
    }

    static class i extends h {
        i() {
        }

        public final void e(View view) {
            z.c(view);
        }
    }

    static class a extends i {
        a() {
        }

        public final void a(View view) {
            v.a(view);
        }
    }

    static {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 21) {
            a = new a();
        } else if (i2 >= 19) {
            a = new i();
        } else if (i2 >= 17) {
            a = new h();
        } else if (i2 >= 16) {
            a = new g();
        } else if (i2 >= 14) {
            a = new f();
        } else if (i2 >= 11) {
            a = new e();
        } else if (i2 >= 9) {
            a = new d();
        } else if (i2 >= 7) {
            a = new c();
        } else {
            a = new b();
        }
    }

    public static boolean a(View view, int i2) {
        return a.a(view, i2);
    }

    public static int a(View view) {
        return a.b(view);
    }

    public static void a(View view, a aVar) {
        a.a(view, aVar);
    }

    public static void b(View view) {
        a.c(view);
    }

    public static void a(View view, Runnable runnable) {
        a.a(view, runnable);
    }

    public static void a(View view, Runnable runnable, long j2) {
        a.a(view, runnable, j2);
    }

    public static int c(View view) {
        return a.d(view);
    }

    public static void d(View view) {
        a.e(view);
    }

    public static void b(View view, int i2) {
        a.b(view, i2);
    }

    public static int e(View view) {
        return a.f(view);
    }

    public static int a(int i2, int i3, int i4) {
        return a.a(i2, i3, i4);
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

    public static void a(View view, float f2) {
        a.a(view, f2);
    }

    public static void b(View view, float f2) {
        a.b(view, f2);
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
}
