/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  android.os.Build$VERSION
 *  android.view.View
 *  android.view.animation.Interpolator
 */
package android.support.v4.view;

import android.os.Build;
import android.support.v4.view.af;
import android.support.v4.view.ag;
import android.support.v4.view.ah;
import android.support.v4.view.u;
import android.view.View;
import android.view.animation.Interpolator;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;

public final class ae {
    public static final f b;
    public WeakReference<View> a;
    private Runnable c = null;
    private Runnable d = null;
    private int e = -1;

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    static {
        int n2 = Build.VERSION.SDK_INT;
        if (n2 >= 19) {
            b = new e();
            return;
        }
        if (n2 >= 18) {
            b = new c();
            return;
        }
        if (n2 >= 16) {
            b = new d();
            return;
        }
        if (n2 >= 14) {
            b = new b();
            return;
        }
        b = new a();
    }

    ae(View view) {
        this.a = new WeakReference<View>(view);
    }

    static /* synthetic */ int c(ae ae2) {
        ae2.e = -1;
        return -1;
    }

    public final ae a(float f2) {
        View view = (View)this.a.get();
        if (view != null) {
            b.a(this, view, f2);
        }
        return this;
    }

    public final ae a(long l2) {
        View view = (View)this.a.get();
        if (view != null) {
            b.a(view, l2);
        }
        return this;
    }

    public final ae a(ah ah2) {
        View view = (View)this.a.get();
        if (view != null) {
            b.a(this, view, ah2);
        }
        return this;
    }

    public final ae a(Interpolator interpolator) {
        View view = (View)this.a.get();
        if (view != null) {
            b.a(view, interpolator);
        }
        return this;
    }

    public final void a() {
        View view = (View)this.a.get();
        if (view != null) {
            b.c(this, view);
        }
    }

    static class android.support.v4.view.ae$a
    implements f {
        WeakHashMap<View, Runnable> a = null;

        android.support.v4.view.ae$a() {
        }

        private void f(ae ae2, View view) {
            Runnable runnable = null;
            if (this.a != null) {
                runnable = this.a.get((Object)view);
            }
            Runnable runnable2 = runnable;
            if (runnable == null) {
                runnable2 = new a(ae2, view, 0);
                if (this.a == null) {
                    this.a = new WeakHashMap();
                }
                this.a.put(view, runnable2);
            }
            view.removeCallbacks(runnable2);
            view.post(runnable2);
        }

        @Override
        public void a(ae ae2, View view) {
            this.f(ae2, view);
        }

        @Override
        public void a(ae ae2, View view, float f2) {
            this.f(ae2, view);
        }

        @Override
        public void a(ae ae2, View view, ah ah2) {
            view.setTag(0x7E000000, (Object)ah2);
        }

        @Override
        public void a(View view, long l2) {
        }

        @Override
        public void a(View view, Interpolator interpolator) {
        }

        @Override
        public void b(ae ae2, View view) {
            this.f(ae2, view);
        }

        @Override
        public void c(ae ae2, View view) {
            this.f(ae2, view);
        }

        @Override
        public void d(ae ae2, View view) {
            Runnable runnable;
            if (this.a != null && (runnable = this.a.get((Object)view)) != null) {
                view.removeCallbacks(runnable);
            }
            this.e(ae2, view);
        }

        /*
         * Enabled aggressive block sorting
         */
        final void e(ae object, View view) {
            Object object2 = view.getTag(0x7E000000);
            object2 = object2 instanceof ah ? (ah)object2 : null;
            Runnable runnable = ((ae)object).c;
            object = ((ae)object).d;
            if (runnable != null) {
                runnable.run();
            }
            if (object2 != null) {
                object2.a(view);
                object2.b(view);
            }
            if (object != null) {
                object.run();
            }
            if (this.a != null) {
                this.a.remove((Object)view);
            }
        }

        final class a
        implements Runnable {
            WeakReference<View> a;
            ae b;

            private a(ae ae2, View view) {
                this.a = new WeakReference<View>(view);
                this.b = ae2;
            }

            /* synthetic */ a(ae ae2, View view, byte by) {
                this(ae2, view);
            }

            @Override
            public final void run() {
                a.this.e(this.b, (View)this.a.get());
            }
        }
    }

    static class b
    extends android.support.v4.view.ae$a {
        WeakHashMap<View, Integer> b = null;

        b() {
        }

        @Override
        public final void a(ae ae2, View view) {
            af.a(view);
        }

        @Override
        public final void a(ae ae2, View view, float f2) {
            af.a(view, f2);
        }

        @Override
        public void a(ae ae2, View view, ah ah2) {
            view.setTag(0x7E000000, (Object)ah2);
            af.a(view, new a(ae2));
        }

        @Override
        public final void a(View view, long l2) {
            af.a(view, l2);
        }

        @Override
        public final void a(View view, Interpolator interpolator) {
            af.a(view, interpolator);
        }

        @Override
        public final void b(ae ae2, View view) {
            af.b(view);
        }

        @Override
        public final void c(ae ae2, View view) {
            af.c(view);
        }

        @Override
        public final void d(ae ae2, View view) {
            af.d(view);
        }

        static final class a
        implements ah {
            ae a;

            a(ae ae2) {
                this.a = ae2;
            }

            /*
             * Enabled force condition propagation
             * Lifted jumps to return sites
             */
            @Override
            public final void a(View view) {
                Object object;
                if (this.a.e >= 0) {
                    u.b(view, 2);
                }
                if (this.a.c != null) {
                    this.a.c.run();
                }
                if (!((object = view.getTag(0x7E000000)) instanceof ah)) return;
                object = (ah)object;
                if (object == null) return;
                object.a(view);
            }

            /*
             * Enabled force condition propagation
             * Lifted jumps to return sites
             */
            @Override
            public final void b(View view) {
                Object object;
                if (this.a.e >= 0) {
                    u.b(view, this.a.e);
                    ae.c(this.a);
                }
                if (this.a.d != null) {
                    this.a.d.run();
                }
                if (!((object = view.getTag(0x7E000000)) instanceof ah)) return;
                object = (ah)object;
                if (object == null) return;
                object.b(view);
            }

            /*
             * Enabled force condition propagation
             * Lifted jumps to return sites
             */
            @Override
            public final void c(View view) {
                Object object = view.getTag(0x7E000000);
                if (!(object instanceof ah)) return;
                object = (ah)object;
                if (object == null) return;
                object.c(view);
            }
        }
    }

    static class c
    extends d {
        c() {
        }
    }

    static class d
    extends b {
        d() {
        }

        @Override
        public final void a(ae ae2, View view, ah ah2) {
            ag.a(view, ah2);
        }
    }

    static final class e
    extends c {
        e() {
        }
    }

    public static interface f {
        public void a(ae var1, View var2);

        public void a(ae var1, View var2, float var3);

        public void a(ae var1, View var2, ah var3);

        public void a(View var1, long var2);

        public void a(View var1, Interpolator var2);

        public void b(ae var1, View var2);

        public void c(ae var1, View var2);

        public void d(ae var1, View var2);
    }
}

