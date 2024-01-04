// 
// Decompiled by Procyon v0.5.36
// 

package android.support.v4.view;

import java.util.WeakHashMap;
import android.view.View;
import android.os.Build$VERSION;

public final class u
{
    static final j a;
    
    static {
        final int sdk_INT = Build$VERSION.SDK_INT;
        if (sdk_INT >= 21) {
            a = (j)new a();
        }
        else if (sdk_INT >= 19) {
            a = (j)new i();
        }
        else if (sdk_INT >= 17) {
            a = (j)new h();
        }
        else if (sdk_INT >= 16) {
            a = (j)new g();
        }
        else if (sdk_INT >= 14) {
            a = (j)new f();
        }
        else if (sdk_INT >= 11) {
            a = (j)new e();
        }
        else if (sdk_INT >= 9) {
            a = (j)new d();
        }
        else if (sdk_INT >= 7) {
            a = (j)new c();
        }
        else {
            a = (j)new b();
        }
    }
    
    public static int a(final int n, final int n2, final int n3) {
        return u.a.a(n, n2, n3);
    }
    
    public static int a(final View view) {
        return u.a.b(view);
    }
    
    public static void a(final View view, final float n) {
        u.a.a(view, n);
    }
    
    public static void a(final View view, final android.support.v4.view.a a) {
        u.a.a(view, a);
    }
    
    public static void a(final View view, final Runnable runnable) {
        u.a.a(view, runnable);
    }
    
    public static void a(final View view, final Runnable runnable, final long n) {
        u.a.a(view, runnable, n);
    }
    
    public static boolean a(final View view, final int n) {
        return u.a.a(view, n);
    }
    
    public static void b(final View view) {
        u.a.c(view);
    }
    
    public static void b(final View view, final float n) {
        u.a.b(view, n);
    }
    
    public static void b(final View view, final int n) {
        u.a.b(view, n);
    }
    
    public static int c(final View view) {
        return u.a.d(view);
    }
    
    public static void d(final View view) {
        u.a.e(view);
    }
    
    public static int e(final View view) {
        return u.a.f(view);
    }
    
    public static int f(final View view) {
        return u.a.g(view);
    }
    
    public static float g(final View view) {
        return u.a.h(view);
    }
    
    public static int h(final View view) {
        return u.a.i(view);
    }
    
    public static ae i(final View view) {
        return u.a.j(view);
    }
    
    public static void j(final View view) {
        u.a.k(view);
    }
    
    public static int k(final View view) {
        return u.a.l(view);
    }
    
    public static void l(final View view) {
        u.a.a(view);
    }
    
    public static void m(final View view) {
        u.a.m(view);
    }
    
    static final class a extends i
    {
        @Override
        public final void a(final View view) {
            v.a(view);
        }
    }
    
    static class b implements j
    {
        WeakHashMap<View, ae> a;
        
        b() {
            this.a = null;
        }
        
        @Override
        public int a(final int n, final int n2, final int n3) {
            return View.resolveSize(n, n2);
        }
        
        long a() {
            return 10L;
        }
        
        @Override
        public void a(final View view) {
        }
        
        @Override
        public void a(final View view, final float n) {
        }
        
        @Override
        public void a(final View view, final android.support.v4.view.a a) {
        }
        
        @Override
        public void a(final View view, final Runnable runnable) {
            view.postDelayed(runnable, this.a());
        }
        
        @Override
        public void a(final View view, final Runnable runnable, final long n) {
            view.postDelayed(runnable, this.a() + n);
        }
        
        @Override
        public boolean a(final View view, final int n) {
            return false;
        }
        
        @Override
        public int b(final View view) {
            return 2;
        }
        
        @Override
        public void b(final View view, final float n) {
        }
        
        @Override
        public void b(final View view, final int n) {
        }
        
        @Override
        public void c(final View view) {
            view.invalidate();
        }
        
        @Override
        public int d(final View view) {
            return 0;
        }
        
        @Override
        public void e(final View view) {
        }
        
        @Override
        public int f(final View view) {
            return 0;
        }
        
        @Override
        public int g(final View view) {
            return 0;
        }
        
        @Override
        public float h(final View view) {
            return 0.0f;
        }
        
        @Override
        public int i(final View view) {
            return 0;
        }
        
        @Override
        public ae j(final View view) {
            return new ae(view);
        }
        
        @Override
        public void k(final View view) {
        }
        
        @Override
        public int l(final View view) {
            return 0;
        }
        
        @Override
        public void m(final View view) {
        }
    }
    
    static class c extends b
    {
    }
    
    static class d extends c
    {
        @Override
        public final int b(final View view) {
            return w.a(view);
        }
    }
    
    static class e extends d
    {
        @Override
        public final int a(final int n, final int n2, final int n3) {
            return x.a(n, n2, n3);
        }
        
        @Override
        final long a() {
            return x.a();
        }
        
        @Override
        public final void a(final View view, final float n) {
            x.a(view, n);
        }
        
        @Override
        public final void b(final View view, final float n) {
            x.b(view, n);
        }
        
        @Override
        public final void b(final View view, final int n) {
            x.a(view, n);
        }
        
        @Override
        public final int g(final View view) {
            return x.a(view);
        }
        
        @Override
        public final float h(final View view) {
            return x.b(view);
        }
        
        @Override
        public final void k(final View view) {
            x.c(view);
        }
        
        @Override
        public final void m(final View view) {
            x.d(view);
        }
    }
    
    static class f extends e
    {
        static boolean b;
        
        static {
            f.b = false;
        }
        
        @Override
        public final void a(final View view, final android.support.v4.view.a a) {
            y.a(view, a.a);
        }
        
        @Override
        public final boolean a(final View view, final int n) {
            return y.a(view, n);
        }
        
        @Override
        public final ae j(final View view) {
            if (this.a == null) {
                this.a = new WeakHashMap<View, ae>();
            }
            ae value;
            if ((value = this.a.get(view)) == null) {
                value = new ae(view);
                this.a.put(view, value);
            }
            return value;
        }
    }
    
    static class g extends f
    {
        @Override
        public void a(final View view) {
            z.e(view);
        }
        
        @Override
        public final void a(final View view, final Runnable runnable) {
            z.a(view, runnable);
        }
        
        @Override
        public final void a(final View view, final Runnable runnable, final long n) {
            z.a(view, runnable, n);
        }
        
        @Override
        public final void c(final View view) {
            z.a(view);
        }
        
        @Override
        public final int d(final View view) {
            return z.b(view);
        }
        
        @Override
        public void e(final View view) {
            z.c(view);
        }
        
        @Override
        public final int i(final View view) {
            return z.d(view);
        }
    }
    
    static class h extends g
    {
        @Override
        public final int f(final View view) {
            return aa.a(view);
        }
        
        @Override
        public final int l(final View view) {
            return aa.b(view);
        }
    }
    
    static class i extends h
    {
        @Override
        public final void e(final View view) {
            z.c(view);
        }
    }
    
    interface j
    {
        int a(final int p0, final int p1, final int p2);
        
        void a(final View p0);
        
        void a(final View p0, final float p1);
        
        void a(final View p0, final android.support.v4.view.a p1);
        
        void a(final View p0, final Runnable p1);
        
        void a(final View p0, final Runnable p1, final long p2);
        
        boolean a(final View p0, final int p1);
        
        int b(final View p0);
        
        void b(final View p0, final float p1);
        
        void b(final View p0, final int p1);
        
        void c(final View p0);
        
        int d(final View p0);
        
        void e(final View p0);
        
        int f(final View p0);
        
        int g(final View p0);
        
        float h(final View p0);
        
        int i(final View p0);
        
        ae j(final View p0);
        
        void k(final View p0);
        
        int l(final View p0);
        
        void m(final View p0);
    }
}
