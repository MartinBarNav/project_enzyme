// 
// Decompiled by Procyon v0.5.36
// 

package android.support.v4.f;

import android.support.v4.view.u;
import android.support.v4.view.n;
import android.view.MotionEvent;
import android.os.SystemClock;
import android.view.animation.AnimationUtils;
import android.util.DisplayMetrics;
import android.content.res.Resources;
import android.view.animation.AccelerateInterpolator;
import android.view.ViewConfiguration;
import android.view.View;
import android.view.animation.Interpolator;
import android.view.View$OnTouchListener;

public abstract class a implements View$OnTouchListener
{
    private static final int r;
    private final a a;
    private final Interpolator b;
    private final View c;
    private Runnable d;
    private float[] e;
    private float[] f;
    private int g;
    private int h;
    private float[] i;
    private float[] j;
    private float[] k;
    private boolean l;
    private boolean m;
    private boolean n;
    private boolean o;
    private boolean p;
    private boolean q;
    
    static {
        r = ViewConfiguration.getTapTimeout();
    }
    
    public a(final View c) {
        this.a = new a();
        this.b = (Interpolator)new AccelerateInterpolator();
        this.e = new float[] { 0.0f, 0.0f };
        this.f = new float[] { Float.MAX_VALUE, Float.MAX_VALUE };
        this.i = new float[] { 0.0f, 0.0f };
        this.j = new float[] { 0.0f, 0.0f };
        this.k = new float[] { Float.MAX_VALUE, Float.MAX_VALUE };
        this.c = c;
        final DisplayMetrics displayMetrics = Resources.getSystem().getDisplayMetrics();
        final int n = (int)(1575.0f * displayMetrics.density + 0.5f);
        final int n2 = (int)(displayMetrics.density * 315.0f + 0.5f);
        final float n3 = (float)n;
        this.k[0] = n3 / 1000.0f;
        this.k[1] = n3 / 1000.0f;
        final float n4 = (float)n2;
        this.j[0] = n4 / 1000.0f;
        this.j[1] = n4 / 1000.0f;
        this.g = 1;
        this.f[0] = Float.MAX_VALUE;
        this.f[1] = Float.MAX_VALUE;
        this.e[0] = 0.2f;
        this.e[1] = 0.2f;
        this.i[0] = 0.001f;
        this.i[1] = 0.001f;
        this.h = android.support.v4.f.a.r;
        this.a.a = 500;
        this.a.b = 500;
    }
    
    static /* synthetic */ float a(final float n) {
        return a(n, 0.0f, 1.0f);
    }
    
    private float a(final float n, final float n2) {
        final float n3 = 0.0f;
        float n4 = 0.0f;
        if (n2 == 0.0f) {
            n4 = n3;
        }
        else {
            switch (this.g) {
                default: {
                    n4 = n3;
                    break;
                }
                case 0:
                case 1: {
                    n4 = n3;
                    if (n >= n2) {
                        break;
                    }
                    if (n >= 0.0f) {
                        n4 = 1.0f - n / n2;
                        break;
                    }
                    n4 = n3;
                    if (!this.o) {
                        break;
                    }
                    n4 = n3;
                    if (this.g == 1) {
                        n4 = 1.0f;
                        break;
                    }
                    break;
                }
                case 2: {
                    n4 = n3;
                    if (n < 0.0f) {
                        n4 = n / -n2;
                        break;
                    }
                    break;
                }
            }
        }
        return n4;
    }
    
    private static float a(final float n, final float n2, float n3) {
        if (n <= n3) {
            if (n < n2) {
                n3 = n2;
            }
            else {
                n3 = n;
            }
        }
        return n3;
    }
    
    private float a(final int n, float n2, float n3, float n4) {
        final float a = a(this.e[n] * n3, 0.0f, this.f[n]);
        n2 = this.a(n3 - n2, a) - this.a(n2, a);
        Label_0069: {
            if (n2 < 0.0f) {
                n2 = -this.b.getInterpolation(-n2);
            }
            else {
                if (n2 <= 0.0f) {
                    n2 = 0.0f;
                    break Label_0069;
                }
                n2 = this.b.getInterpolation(n2);
            }
            n2 = a(n2, -1.0f, 1.0f);
        }
        if (n2 == 0.0f) {
            n2 = 0.0f;
        }
        else {
            final float n5 = this.i[n];
            final float n6 = this.j[n];
            n3 = this.k[n];
            n4 *= n5;
            if (n2 > 0.0f) {
                n2 = a(n2 * n4, n6, n3);
            }
            else {
                n2 = -a(-n2 * n4, n6, n3);
            }
        }
        return n2;
    }
    
    private boolean a() {
        final a a = this.a;
        final int n = (int)(a.d / Math.abs(a.d));
        final int n2 = (int)(a.c / Math.abs(a.c));
        boolean b;
        if (n == 0 || !this.b(n)) {
            if (n2 != 0) {}
            b = false;
        }
        else {
            b = true;
        }
        return b;
    }
    
    private void b() {
        if (this.m) {
            this.o = false;
        }
        else {
            final a a = this.a;
            final long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
            int k = (int)(currentAnimationTimeMillis - a.e);
            final int b = a.b;
            if (k > b) {
                k = b;
            }
            else if (k < 0) {
                k = 0;
            }
            a.k = k;
            a.j = a.a(currentAnimationTimeMillis);
            a.i = currentAnimationTimeMillis;
        }
    }
    
    static /* synthetic */ void i(final a a) {
        final long uptimeMillis = SystemClock.uptimeMillis();
        final MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
        a.c.onTouchEvent(obtain);
        obtain.recycle();
    }
    
    public final a a(final boolean p) {
        if (this.p && !p) {
            this.b();
        }
        this.p = p;
        return this;
    }
    
    public abstract void a(final int p0);
    
    public abstract boolean b(final int p0);
    
    public boolean onTouch(final View view, final MotionEvent motionEvent) {
        final boolean b = false;
        boolean b2;
        if (!this.p) {
            b2 = b;
        }
        else {
            switch (android.support.v4.view.n.a(motionEvent)) {
                case 0: {
                    this.n = true;
                    this.l = false;
                }
                case 2: {
                    final float a = this.a(0, motionEvent.getX(), (float)view.getWidth(), (float)this.c.getWidth());
                    final float a2 = this.a(1, motionEvent.getY(), (float)view.getHeight(), (float)this.c.getHeight());
                    final a a3 = this.a;
                    a3.c = a;
                    a3.d = a2;
                    if (!this.o && this.a()) {
                        if (this.d == null) {
                            this.d = new b((byte)0);
                        }
                        this.o = true;
                        this.m = true;
                        if (!this.l && this.h > 0) {
                            u.a(this.c, this.d, this.h);
                        }
                        else {
                            this.d.run();
                        }
                        this.l = true;
                        break;
                    }
                    break;
                }
                case 1:
                case 3: {
                    this.b();
                    break;
                }
            }
            b2 = b;
            if (this.q) {
                b2 = b;
                if (this.o) {
                    b2 = true;
                }
            }
        }
        return b2;
    }
    
    private static final class a
    {
        int a;
        int b;
        float c;
        float d;
        long e;
        long f;
        int g;
        int h;
        long i;
        float j;
        int k;
        
        public a() {
            this.e = Long.MIN_VALUE;
            this.i = -1L;
            this.f = 0L;
            this.g = 0;
            this.h = 0;
        }
        
        final float a(final long n) {
            float n2;
            if (n < this.e) {
                n2 = 0.0f;
            }
            else if (this.i < 0L || n < this.i) {
                n2 = android.support.v4.f.a.a((n - this.e) / (float)this.a) * 0.5f;
            }
            else {
                n2 = android.support.v4.f.a.a((n - this.i) / (float)this.k) * this.j + (1.0f - this.j);
            }
            return n2;
        }
    }
    
    private final class b implements Runnable
    {
        @Override
        public final void run() {
            final int n = 0;
            if (android.support.v4.f.a.this.o) {
                if (android.support.v4.f.a.this.m) {
                    android.support.v4.f.a.this.m = false;
                    final a d = android.support.v4.f.a.this.a;
                    d.e = AnimationUtils.currentAnimationTimeMillis();
                    d.i = -1L;
                    d.f = d.e;
                    d.j = 0.5f;
                    d.g = 0;
                    d.h = 0;
                }
                final a d2 = android.support.v4.f.a.this.a;
                int n2 = n;
                if (d2.i > 0L) {
                    n2 = n;
                    if (AnimationUtils.currentAnimationTimeMillis() > d2.i + d2.k) {
                        n2 = 1;
                    }
                }
                if (n2 != 0 || !android.support.v4.f.a.this.a()) {
                    android.support.v4.f.a.this.o = false;
                }
                else {
                    if (android.support.v4.f.a.this.n) {
                        android.support.v4.f.a.this.n = false;
                        android.support.v4.f.a.i(android.support.v4.f.a.this);
                    }
                    if (d2.f == 0L) {
                        throw new RuntimeException("Cannot compute scroll delta before calling start()");
                    }
                    final long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
                    final float a = d2.a(currentAnimationTimeMillis);
                    final float n3 = a * 4.0f + -4.0f * a * a;
                    final long n4 = currentAnimationTimeMillis - d2.f;
                    d2.f = currentAnimationTimeMillis;
                    d2.g = (int)(n4 * n3 * d2.c);
                    d2.h = (int)(n3 * n4 * d2.d);
                    android.support.v4.f.a.this.a(d2.h);
                    u.a(android.support.v4.f.a.this.c, this);
                }
            }
        }
    }
}
