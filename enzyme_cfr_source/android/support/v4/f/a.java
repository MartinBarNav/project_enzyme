/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  android.content.res.Resources
 *  android.os.SystemClock
 *  android.view.MotionEvent
 *  android.view.View
 *  android.view.View$OnTouchListener
 *  android.view.ViewConfiguration
 *  android.view.animation.AccelerateInterpolator
 *  android.view.animation.AnimationUtils
 *  android.view.animation.Interpolator
 */
package android.support.v4.f;

import android.content.res.Resources;
import android.os.SystemClock;
import android.support.v4.view.n;
import android.support.v4.view.u;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;

public abstract class a
implements View.OnTouchListener {
    private static final int r = ViewConfiguration.getTapTimeout();
    private final a a = new a();
    private final Interpolator b = new AccelerateInterpolator();
    private final View c;
    private Runnable d;
    private float[] e = new float[]{0.0f, 0.0f};
    private float[] f = new float[]{Float.MAX_VALUE, Float.MAX_VALUE};
    private int g;
    private int h;
    private float[] i = new float[]{0.0f, 0.0f};
    private float[] j = new float[]{0.0f, 0.0f};
    private float[] k = new float[]{Float.MAX_VALUE, Float.MAX_VALUE};
    private boolean l;
    private boolean m;
    private boolean n;
    private boolean o;
    private boolean p;
    private boolean q;

    public a(View view) {
        this.c = view;
        view = Resources.getSystem().getDisplayMetrics();
        int n2 = (int)(1575.0f * view.density + 0.5f);
        int n3 = (int)(view.density * 315.0f + 0.5f);
        float f2 = n2;
        this.k[0] = f2 / 1000.0f;
        this.k[1] = f2 / 1000.0f;
        f2 = n3;
        this.j[0] = f2 / 1000.0f;
        this.j[1] = f2 / 1000.0f;
        this.g = 1;
        this.f[0] = Float.MAX_VALUE;
        this.f[1] = Float.MAX_VALUE;
        this.e[0] = 0.2f;
        this.e[1] = 0.2f;
        this.i[0] = 0.001f;
        this.i[1] = 0.001f;
        this.h = r;
        this.a.a = 500;
        this.a.b = 500;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private float a(float f2, float f3) {
        float f4;
        float f5 = 0.0f;
        if (f3 == 0.0f) {
            return f5;
        }
        switch (this.g) {
            default: {
                return f5;
            }
            case 0: 
            case 1: {
                f4 = f5;
                if (!(f2 < f3)) return f4;
                if (f2 >= 0.0f) {
                    return 1.0f - f2 / f3;
                }
                f4 = f5;
                if (!this.o) return f4;
                f4 = f5;
                if (this.g != 1) return f4;
                return 1.0f;
            }
            case 2: 
        }
        f4 = f5;
        if (!(f2 < 0.0f)) return f4;
        return f2 / -f3;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private static float a(float f2, float f3, float f4) {
        if (f2 > f4) {
            return f4;
        }
        if (!(f2 < f3)) return f2;
        return f3;
    }

    /*
     * Enabled aggressive block sorting
     */
    private float a(int n2, float f2, float f3, float f4) {
        float f5 = android.support.v4.f.a.a(this.e[n2] * f3, 0.0f, this.f[n2]);
        float f6 = this.a(f2, f5);
        if ((f2 = this.a(f3 - f2, f5) - f6) < 0.0f) {
            f2 = -this.b.getInterpolation(-f2);
        } else {
            if (!(f2 > 0.0f)) return 0.0f;
            f2 = this.b.getInterpolation(f2);
        }
        f2 = android.support.v4.f.a.a(f2, -1.0f, 1.0f);
        if (f2 == 0.0f) {
            return 0.0f;
        }
        f6 = this.i[n2];
        f5 = this.j[n2];
        f3 = this.k[n2];
        f4 = f6 * f4;
        if (!(f2 > 0.0f)) return -android.support.v4.f.a.a(-f2 * f4, f5, f3);
        return android.support.v4.f.a.a(f2 * f4, f5, f3);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private boolean a() {
        a a2 = this.a;
        int n2 = (int)(a2.d / Math.abs(a2.d));
        int n3 = (int)(a2.c / Math.abs(a2.c));
        if (n2 != 0) {
            if (this.b(n2)) return true;
        }
        if (n3 == 0) return false;
        return false;
    }

    /*
     * Enabled aggressive block sorting
     */
    private void b() {
        int n2;
        if (this.m) {
            this.o = false;
            return;
        }
        a a2 = this.a;
        long l2 = AnimationUtils.currentAnimationTimeMillis();
        int n3 = (int)(l2 - a2.e);
        if (n3 > (n2 = a2.b)) {
            n3 = n2;
        } else if (n3 < 0) {
            n3 = 0;
        }
        a2.k = n3;
        a2.j = a2.a(l2);
        a2.i = l2;
    }

    static /* synthetic */ boolean c(a a2) {
        a2.m = false;
        return false;
    }

    static /* synthetic */ boolean f(a a2) {
        a2.o = false;
        return false;
    }

    static /* synthetic */ boolean h(a a2) {
        a2.n = false;
        return false;
    }

    static /* synthetic */ void i(a a2) {
        long l2 = SystemClock.uptimeMillis();
        MotionEvent motionEvent = MotionEvent.obtain((long)l2, (long)l2, (int)3, (float)0.0f, (float)0.0f, (int)0);
        a2.c.onTouchEvent(motionEvent);
        motionEvent.recycle();
    }

    public final a a(boolean bl) {
        if (this.p && !bl) {
            this.b();
        }
        this.p = bl;
        return this;
    }

    public abstract void a(int var1);

    public abstract boolean b(int var1);

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     */
    public boolean onTouch(View object, MotionEvent motionEvent) {
        void var2_3;
        boolean bl = false;
        if (!this.p) {
            return bl;
        }
        switch (android.support.v4.view.n.a((MotionEvent)var2_3)) {
            case 0: {
                this.n = true;
                this.l = false;
            }
            case 2: {
                float f2 = this.a(0, var2_3.getX(), object.getWidth(), this.c.getWidth());
                float f3 = this.a(1, var2_3.getY(), object.getHeight(), this.c.getHeight());
                a a2 = this.a;
                a2.c = f2;
                a2.d = f3;
                if (!this.o && this.a()) {
                    if (this.d == null) {
                        this.d = new b(0);
                    }
                    this.o = true;
                    this.m = true;
                    if (!this.l && this.h > 0) {
                        u.a(this.c, this.d, (long)this.h);
                    } else {
                        this.d.run();
                    }
                    this.l = true;
                }
            }
            default: {
                break;
            }
            case 1: 
            case 3: {
                this.b();
            }
        }
        boolean bl2 = bl;
        if (!this.q) return bl2;
        bl2 = bl;
        if (!this.o) return bl2;
        return true;
    }

    private static final class a {
        int a;
        int b;
        float c;
        float d;
        long e = Long.MIN_VALUE;
        long f = 0L;
        int g = 0;
        int h = 0;
        long i = -1L;
        float j;
        int k;

        /*
         * Enabled force condition propagation
         * Lifted jumps to return sites
         */
        final float a(long l2) {
            if (l2 < this.e) {
                return 0.0f;
            }
            if (this.i < 0L) return android.support.v4.f.a.a((float)(l2 - this.e) / (float)this.a, 0.0f, 1.0f) * 0.5f;
            if (l2 < this.i) {
                return android.support.v4.f.a.a((float)(l2 - this.e) / (float)this.a, 0.0f, 1.0f) * 0.5f;
            }
            long l3 = this.i;
            float f2 = this.j;
            float f3 = this.j;
            return android.support.v4.f.a.a((float)(l2 - l3) / (float)this.k, 0.0f, 1.0f) * f3 + (1.0f - f2);
        }
    }

    private final class b
    implements Runnable {
        private b() {
        }

        /* synthetic */ b(byte by) {
            this();
        }

        /*
         * Enabled force condition propagation
         * Lifted jumps to return sites
         */
        @Override
        public final void run() {
            a a2;
            int n2 = 0;
            if (!a.this.o) {
                return;
            }
            if (a.this.m) {
                android.support.v4.f.a.c(a.this);
                a2 = a.this.a;
                a2.e = AnimationUtils.currentAnimationTimeMillis();
                a2.i = -1L;
                a2.f = a2.e;
                a2.j = 0.5f;
                a2.g = 0;
                a2.h = 0;
            }
            a2 = a.this.a;
            int n3 = n2;
            if (a2.i > 0L) {
                n3 = n2;
                if (AnimationUtils.currentAnimationTimeMillis() > a2.i + (long)a2.k) {
                    n3 = 1;
                }
            }
            if (n3 != 0 || !a.this.a()) {
                android.support.v4.f.a.f(a.this);
                return;
            }
            if (a.this.n) {
                android.support.v4.f.a.h(a.this);
                android.support.v4.f.a.i(a.this);
            }
            if (a2.f == 0L) {
                throw new RuntimeException("Cannot compute scroll delta before calling start()");
            }
            long l2 = AnimationUtils.currentAnimationTimeMillis();
            float f2 = a2.a(l2);
            f2 = f2 * 4.0f + -4.0f * f2 * f2;
            long l3 = l2 - a2.f;
            a2.f = l2;
            a2.g = (int)((float)l3 * f2 * a2.c);
            n3 = a2.h = (int)(f2 * (float)l3 * a2.d);
            a.this.a(n3);
            u.a(a.this.c, this);
        }
    }
}

