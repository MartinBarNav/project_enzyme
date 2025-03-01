package android.support.v4.view;

import android.os.Build;
import android.view.View;
import android.view.animation.Interpolator;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;

public final class ae {
    public static final f b;
    public WeakReference<View> a;
    /* access modifiers changed from: private */
    public Runnable c = null;
    /* access modifiers changed from: private */
    public Runnable d = null;
    /* access modifiers changed from: private */
    public int e = -1;

    interface f {
        void a(ae aeVar, View view);

        void a(ae aeVar, View view, float f);

        void a(ae aeVar, View view, ah ahVar);

        void a(View view, long j);

        void a(View view, Interpolator interpolator);

        void b(ae aeVar, View view);

        void c(ae aeVar, View view);

        void d(ae aeVar, View view);
    }

    ae(View view) {
        this.a = new WeakReference<>(view);
    }

    static class a implements f {
        WeakHashMap<View, Runnable> a = null;

        a() {
        }

        public void a(View view, long j) {
        }

        public void a(ae aeVar, View view) {
            f(aeVar, view);
        }

        public void a(ae aeVar, View view, float f) {
            f(aeVar, view);
        }

        public void a(View view, Interpolator interpolator) {
        }

        public void b(ae aeVar, View view) {
            f(aeVar, view);
        }

        public void c(ae aeVar, View view) {
            f(aeVar, view);
        }

        public void a(ae aeVar, View view, ah ahVar) {
            view.setTag(2113929216, ahVar);
        }

        /* access modifiers changed from: package-private */
        public final void e(ae aeVar, View view) {
            ah ahVar;
            Object tag = view.getTag(2113929216);
            if (tag instanceof ah) {
                ahVar = (ah) tag;
            } else {
                ahVar = null;
            }
            Runnable a2 = aeVar.c;
            Runnable b = aeVar.d;
            if (a2 != null) {
                a2.run();
            }
            if (ahVar != null) {
                ahVar.a(view);
                ahVar.b(view);
            }
            if (b != null) {
                b.run();
            }
            if (this.a != null) {
                this.a.remove(view);
            }
        }

        /* renamed from: android.support.v4.view.ae$a$a  reason: collision with other inner class name */
        class C0009a implements Runnable {
            WeakReference<View> a;
            ae b;

            /* synthetic */ C0009a(a aVar, ae aeVar, View view, byte b2) {
                this(aeVar, view);
            }

            private C0009a(ae aeVar, View view) {
                this.a = new WeakReference<>(view);
                this.b = aeVar;
            }

            public final void run() {
                a.this.e(this.b, (View) this.a.get());
            }
        }

        private void f(ae aeVar, View view) {
            Runnable runnable = null;
            if (this.a != null) {
                runnable = this.a.get(view);
            }
            if (runnable == null) {
                runnable = new C0009a(this, aeVar, view, (byte) 0);
                if (this.a == null) {
                    this.a = new WeakHashMap<>();
                }
                this.a.put(view, runnable);
            }
            view.removeCallbacks(runnable);
            view.post(runnable);
        }

        public void d(ae aeVar, View view) {
            Runnable runnable;
            if (!(this.a == null || (runnable = this.a.get(view)) == null)) {
                view.removeCallbacks(runnable);
            }
            e(aeVar, view);
        }
    }

    static class b extends a {
        WeakHashMap<View, Integer> b = null;

        b() {
        }

        public final void a(View view, long j) {
            af.a(view, j);
        }

        public final void a(ae aeVar, View view) {
            af.a(view);
        }

        public final void a(ae aeVar, View view, float f) {
            af.a(view, f);
        }

        public final void a(View view, Interpolator interpolator) {
            af.a(view, interpolator);
        }

        public final void b(ae aeVar, View view) {
            af.b(view);
        }

        public final void c(ae aeVar, View view) {
            af.c(view);
        }

        public final void d(ae aeVar, View view) {
            af.d(view);
        }

        public void a(ae aeVar, View view, ah ahVar) {
            view.setTag(2113929216, ahVar);
            af.a(view, (ah) new a(aeVar));
        }

        static class a implements ah {
            ae a;

            a(ae aeVar) {
                this.a = aeVar;
            }

            public final void a(View view) {
                ah ahVar;
                if (this.a.e >= 0) {
                    u.b(view, 2);
                }
                if (this.a.c != null) {
                    this.a.c.run();
                }
                Object tag = view.getTag(2113929216);
                if (tag instanceof ah) {
                    ahVar = (ah) tag;
                } else {
                    ahVar = null;
                }
                if (ahVar != null) {
                    ahVar.a(view);
                }
            }

            public final void b(View view) {
                ah ahVar;
                if (this.a.e >= 0) {
                    u.b(view, this.a.e);
                    int unused = this.a.e = -1;
                }
                if (this.a.d != null) {
                    this.a.d.run();
                }
                Object tag = view.getTag(2113929216);
                if (tag instanceof ah) {
                    ahVar = (ah) tag;
                } else {
                    ahVar = null;
                }
                if (ahVar != null) {
                    ahVar.b(view);
                }
            }

            public final void c(View view) {
                ah ahVar;
                Object tag = view.getTag(2113929216);
                if (tag instanceof ah) {
                    ahVar = (ah) tag;
                } else {
                    ahVar = null;
                }
                if (ahVar != null) {
                    ahVar.c(view);
                }
            }
        }
    }

    static class d extends b {
        d() {
        }

        public final void a(ae aeVar, View view, ah ahVar) {
            ag.a(view, ahVar);
        }
    }

    static class c extends d {
        c() {
        }
    }

    static class e extends c {
        e() {
        }
    }

    static {
        int i = Build.VERSION.SDK_INT;
        if (i >= 19) {
            b = new e();
        } else if (i >= 18) {
            b = new c();
        } else if (i >= 16) {
            b = new d();
        } else if (i >= 14) {
            b = new b();
        } else {
            b = new a();
        }
    }

    public final ae a(long j) {
        View view = (View) this.a.get();
        if (view != null) {
            b.a(view, j);
        }
        return this;
    }

    public final ae a(float f2) {
        View view = (View) this.a.get();
        if (view != null) {
            b.a(this, view, f2);
        }
        return this;
    }

    public final ae a(Interpolator interpolator) {
        View view = (View) this.a.get();
        if (view != null) {
            b.a(view, interpolator);
        }
        return this;
    }

    public final void a() {
        View view = (View) this.a.get();
        if (view != null) {
            b.c(this, view);
        }
    }

    public final ae a(ah ahVar) {
        View view = (View) this.a.get();
        if (view != null) {
            b.a(this, view, ahVar);
        }
        return this;
    }
}
