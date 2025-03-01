/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.res.Configuration
 *  android.os.Build$VERSION
 *  android.os.Bundle
 *  android.os.Looper
 *  android.os.Parcelable
 *  android.util.AttributeSet
 *  android.util.Log
 *  android.util.SparseArray
 *  android.view.LayoutInflater$Factory
 *  android.view.Menu
 *  android.view.MenuInflater
 *  android.view.MenuItem
 *  android.view.View
 *  android.view.ViewGroup
 *  android.view.animation.AccelerateInterpolator
 *  android.view.animation.AlphaAnimation
 *  android.view.animation.Animation
 *  android.view.animation.Animation$AnimationListener
 *  android.view.animation.AnimationSet
 *  android.view.animation.AnimationUtils
 *  android.view.animation.DecelerateInterpolator
 *  android.view.animation.Interpolator
 *  android.view.animation.ScaleAnimation
 */
package android.support.v4.app;

import android.content.Context;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.os.Looper;
import android.os.Parcelable;
import android.support.v4.app.BackStackState;
import android.support.v4.app.FragmentManagerState;
import android.support.v4.app.FragmentState;
import android.support.v4.app.b;
import android.support.v4.app.c;
import android.support.v4.app.d;
import android.support.v4.app.e;
import android.support.v4.app.f;
import android.support.v4.app.g;
import android.support.v4.app.m;
import android.support.v4.app.o;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.AnimationUtils;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.view.animation.ScaleAnimation;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;

final class h
extends g
implements LayoutInflater.Factory {
    static final Interpolator A;
    static final Interpolator B;
    static final Interpolator C;
    static boolean a;
    static final boolean b;
    static final Interpolator z;
    ArrayList<Runnable> c;
    Runnable[] d;
    boolean e;
    ArrayList<d> f;
    ArrayList<d> g;
    ArrayList<Integer> h;
    ArrayList<c> i;
    ArrayList<d> j;
    ArrayList<c> k;
    ArrayList<Integer> l;
    ArrayList<Object> m;
    int n = 0;
    e o;
    f p;
    d q;
    boolean r;
    boolean s;
    boolean t;
    String u;
    boolean v;
    Bundle w = null;
    SparseArray<Parcelable> x = null;
    Runnable y = new Runnable(){

        @Override
        public final void run() {
            h.this.a();
        }
    };

    static {
        boolean bl = false;
        a = false;
        if (Build.VERSION.SDK_INT >= 11) {
            bl = true;
        }
        b = bl;
        z = new DecelerateInterpolator(2.5f);
        A = new DecelerateInterpolator(1.5f);
        B = new AccelerateInterpolator(2.5f);
        C = new AccelerateInterpolator(1.5f);
    }

    h() {
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     */
    private d a(Bundle object, String string) {
        d d2;
        void var1_3;
        void var2_6;
        int n2 = object.getInt((String)var2_6, -1);
        if (n2 == -1) {
            return var1_3;
        }
        if (n2 >= this.f.size()) {
            this.a(new IllegalStateException("Fragment no longer exists for key " + (String)var2_6 + ": index " + n2));
        }
        d d3 = d2 = this.f.get(n2);
        if (d2 != null) return var1_3;
        this.a(new IllegalStateException("Fragment no longer exists for key " + (String)var2_6 + ": index " + n2));
        d d4 = d2;
        return var1_3;
    }

    private static Animation a(float f2, float f3) {
        AlphaAnimation alphaAnimation = new AlphaAnimation(f2, f3);
        alphaAnimation.setInterpolator(A);
        alphaAnimation.setDuration(220L);
        return alphaAnimation;
    }

    private static Animation a(float f2, float f3, float f4, float f5) {
        AnimationSet animationSet = new AnimationSet(false);
        ScaleAnimation scaleAnimation = new ScaleAnimation(f2, f3, f2, f3, 1, 0.5f, 1, 0.5f);
        scaleAnimation.setInterpolator(z);
        scaleAnimation.setDuration(220L);
        animationSet.addAnimation((Animation)scaleAnimation);
        scaleAnimation = new AlphaAnimation(f4, f5);
        scaleAnimation.setInterpolator(A);
        scaleAnimation.setDuration(220L);
        animationSet.addAnimation((Animation)scaleAnimation);
        return animationSet;
    }

    /*
     * Enabled aggressive block sorting
     */
    private Animation a(d d2, int n2, boolean bl, int n3) {
        int n4 = d2.H;
        android.support.v4.app.d.d();
        if (d2.H != 0 && (d2 = AnimationUtils.loadAnimation((Context)this.o, (int)d2.H)) != null) {
            return d2;
        }
        if (n2 == 0) {
            return null;
        }
        n4 = -1;
        switch (n2) {
            default: {
                n2 = n4;
                break;
            }
            case 4097: {
                if (bl) {
                    n2 = 1;
                    break;
                }
                n2 = 2;
                break;
            }
            case 8194: {
                if (bl) {
                    n2 = 3;
                    break;
                }
                n2 = 4;
                break;
            }
            case 4099: {
                n2 = bl ? 5 : 6;
            }
        }
        if (n2 < 0) {
            return null;
        }
        switch (n2) {
            default: {
                n2 = n3;
                if (n3 == 0) {
                    n2 = n3;
                    if (this.o.getWindow() != null) {
                        n2 = this.o.getWindow().getAttributes().windowAnimations;
                    }
                }
                if (n2 != 0) return null;
                return null;
            }
            case 1: {
                return android.support.v4.app.h.a(1.125f, 1.0f, 0.0f, 1.0f);
            }
            case 2: {
                return android.support.v4.app.h.a(1.0f, 0.975f, 1.0f, 0.0f);
            }
            case 3: {
                return android.support.v4.app.h.a(0.975f, 1.0f, 0.0f, 1.0f);
            }
            case 4: {
                return android.support.v4.app.h.a(1.0f, 1.075f, 1.0f, 0.0f);
            }
            case 5: {
                return android.support.v4.app.h.a(0.0f, 1.0f);
            }
            case 6: {
                return android.support.v4.app.h.a(1.0f, 0.0f);
            }
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private void a(int n2, c c2) {
        synchronized (this) {
            int n3;
            Serializable serializable;
            if (this.k == null) {
                serializable = new ArrayList();
                this.k = serializable;
            }
            if (n2 < n3) {
                if (a) {
                    serializable = new StringBuilder("Setting back stack index ");
                    Log.v((String)"FragmentManager", (String)((StringBuilder)serializable).append(n2).append(" to ").append(c2).toString());
                }
                this.k.set(n2, c2);
            } else {
                for (int i2 = n3 = this.k.size(); i2 < n2; ++i2) {
                    this.k.add(null);
                    if (this.l == null) {
                        serializable = new ArrayList();
                        this.l = serializable;
                    }
                    if (a) {
                        serializable = new StringBuilder("Adding available back stack index ");
                        Log.v((String)"FragmentManager", (String)((StringBuilder)serializable).append(i2).toString());
                    }
                    this.l.add(i2);
                }
                if (a) {
                    serializable = new StringBuilder("Adding back stack index ");
                    Log.v((String)"FragmentManager", (String)((StringBuilder)serializable).append(n2).append(" with ").append(c2).toString());
                }
                this.k.add(c2);
            }
            return;
        }
    }

    private void a(d d2) {
        this.a(d2, this.n, 0, 0, false);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private void a(RuntimeException runtimeException) {
        Log.e((String)"FragmentManager", (String)runtimeException.getMessage());
        Log.e((String)"FragmentManager", (String)"Activity state:");
        PrintWriter printWriter = new PrintWriter(new android.support.v4.e.d("FragmentManager"));
        if (this.o != null) {
            try {
                this.o.dump("  ", null, printWriter, new String[0]);
            }
            catch (Exception exception) {
                Log.e((String)"FragmentManager", (String)"Failed dumping state", (Throwable)exception);
                throw runtimeException;
            }
            throw runtimeException;
        }
        try {
            this.a("  ", null, printWriter, new String[0]);
            throw runtimeException;
        }
        catch (Exception exception) {
            Log.e((String)"FragmentManager", (String)"Failed dumping state", (Throwable)exception);
            throw runtimeException;
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static int b(int n2) {
        int n3 = 0;
        switch (n2) {
            default: {
                return n3;
            }
            case 4097: {
                return 8194;
            }
            case 8194: {
                return 4097;
            }
            case 4099: 
        }
        return 4099;
    }

    /*
     * Enabled aggressive block sorting
     */
    private void b(d d2) {
        if (d2.K == null) {
            return;
        }
        if (this.x == null) {
            this.x = new SparseArray();
        } else {
            this.x.clear();
        }
        d2.K.saveHierarchyState(this.x);
        if (this.x.size() <= 0) return;
        d2.f = this.x;
        this.x = null;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private d c(int n2) {
        d d2;
        int n3;
        if (this.g != null) {
            for (n3 = this.g.size() - 1; n3 >= 0; --n3) {
                d2 = this.g.get(n3);
                if (d2 == null || d2.x != n2) continue;
                return d2;
            }
        }
        if (this.f == null) return null;
        n3 = this.f.size() - 1;
        while (n3 >= 0) {
            d d3 = this.f.get(n3);
            if (d3 != null) {
                d2 = d3;
                if (d3.x == n2) return d2;
            }
            --n3;
        }
        return null;
    }

    /*
     * Enabled aggressive block sorting
     */
    private void k() {
        if (this.f != null) {
            for (int i2 = 0; i2 < this.f.size(); ++i2) {
                d d2 = this.f.get(i2);
                if (d2 == null || !d2.L) continue;
                if (this.e) {
                    this.v = true;
                    continue;
                }
                d2.L = false;
                this.a(d2, this.n, 0, 0, false);
            }
        }
    }

    final void a(int n2) {
        this.a(n2, 0, 0, false);
    }

    /*
     * Enabled aggressive block sorting
     */
    final void a(int n2, int n3, int n4, boolean bl) {
        if (this.o == null && n2 != 0) {
            throw new IllegalStateException("No activity");
        }
        if (!bl && this.n == n2) {
            return;
        }
        this.n = n2;
        if (this.f == null) return;
        boolean bl2 = false;
        for (int i2 = 0; i2 < this.f.size(); ++i2) {
            d d2 = this.f.get(i2);
            if (d2 == null) continue;
            this.a(d2, n2, n3, n4, false);
            if (d2.N == null) continue;
            bl2 |= d2.N.a();
        }
        if (!bl2) {
            this.k();
        }
        if (!this.r) return;
        if (this.o == null) return;
        if (this.n != 5) return;
        e e2 = this.o;
        if (Build.VERSION.SDK_INT >= 11) {
            android.support.v4.app.b.a(e2);
        } else {
            e2.i = true;
        }
        this.r = false;
    }

    public final void a(Configuration configuration) {
        if (this.g != null) {
            for (int i2 = 0; i2 < this.g.size(); ++i2) {
                d d2 = this.g.get(i2);
                if (d2 == null) continue;
                d2.onConfigurationChanged(configuration);
                if (d2.v == null) continue;
                d2.v.a(configuration);
            }
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    final void a(Parcelable parcelable, ArrayList<d> object) {
        Object object2;
        d d2;
        int n2;
        if (parcelable == null) {
            return;
        }
        parcelable = (FragmentManagerState)parcelable;
        if (parcelable.a == null) return;
        if (object != null) {
            for (n2 = 0; n2 < ((ArrayList)object).size(); ++n2) {
                d2 = (d)((ArrayList)object).get(n2);
                if (a) {
                    Log.v((String)"FragmentManager", (String)("restoreAllState: re-attaching retained " + d2));
                }
                object2 = parcelable.a[d2.g];
                ((FragmentState)object2).k = d2;
                d2.f = null;
                d2.s = 0;
                d2.q = false;
                d2.m = false;
                d2.j = null;
                if (((FragmentState)object2).j == null) continue;
                ((FragmentState)object2).j.setClassLoader(this.o.getClassLoader());
                d2.f = ((FragmentState)object2).j.getSparseParcelableArray("android:view_state");
                d2.e = ((FragmentState)object2).j;
            }
        }
        this.f = new ArrayList(parcelable.a.length);
        if (this.h != null) {
            this.h.clear();
        }
        for (n2 = 0; n2 < parcelable.a.length; ++n2) {
            object2 = parcelable.a[n2];
            if (object2 != null) {
                e e2 = this.o;
                d2 = this.q;
                if (((FragmentState)object2).k == null) {
                    if (((FragmentState)object2).i != null) {
                        ((FragmentState)object2).i.setClassLoader(e2.getClassLoader());
                    }
                    ((FragmentState)object2).k = android.support.v4.app.d.a((Context)e2, ((FragmentState)object2).a, ((FragmentState)object2).i);
                    if (((FragmentState)object2).j != null) {
                        ((FragmentState)object2).j.setClassLoader(e2.getClassLoader());
                        object2.k.e = ((FragmentState)object2).j;
                    }
                    ((FragmentState)object2).k.a(((FragmentState)object2).b, d2);
                    object2.k.p = ((FragmentState)object2).c;
                    object2.k.r = true;
                    object2.k.x = ((FragmentState)object2).d;
                    object2.k.y = ((FragmentState)object2).e;
                    object2.k.z = ((FragmentState)object2).f;
                    object2.k.C = ((FragmentState)object2).g;
                    object2.k.B = ((FragmentState)object2).h;
                    object2.k.t = e2.b;
                    if (a) {
                        Log.v((String)"FragmentManager", (String)("Instantiated fragment " + ((FragmentState)object2).k));
                    }
                }
                d2 = ((FragmentState)object2).k;
                if (a) {
                    Log.v((String)"FragmentManager", (String)("restoreAllState: active #" + n2 + ": " + d2));
                }
                this.f.add(d2);
                ((FragmentState)object2).k = null;
                continue;
            }
            this.f.add(null);
            if (this.h == null) {
                this.h = new ArrayList();
            }
            if (a) {
                Log.v((String)"FragmentManager", (String)("restoreAllState: avail #" + n2));
            }
            this.h.add(n2);
        }
        if (object != null) {
            for (n2 = 0; n2 < ((ArrayList)object).size(); ++n2) {
                object2 = (d)((ArrayList)object).get(n2);
                if (((d)object2).k < 0) continue;
                if (((d)object2).k < this.f.size()) {
                    ((d)object2).j = this.f.get(((d)object2).k);
                    continue;
                }
                Log.w((String)"FragmentManager", (String)("Re-attaching retained fragment " + object2 + " target no longer exists: " + ((d)object2).k));
                ((d)object2).j = null;
            }
        }
        if (parcelable.b == null) {
            this.g = null;
        } else {
            this.g = new ArrayList(parcelable.b.length);
            for (n2 = 0; n2 < parcelable.b.length; ++n2) {
                object = this.f.get(parcelable.b[n2]);
                if (object == null) {
                    this.a(new IllegalStateException("No instantiated fragment for index #" + parcelable.b[n2]));
                }
                ((d)object).m = true;
                if (a) {
                    Log.v((String)"FragmentManager", (String)("restoreAllState: added #" + n2 + ": " + object));
                }
                if (this.g.contains(object)) {
                    throw new IllegalStateException("Already added!");
                }
                this.g.add((d)object);
            }
        }
        if (parcelable.c == null) {
            this.i = null;
            return;
        }
        this.i = new ArrayList(parcelable.c.length);
        n2 = 0;
        while (n2 < parcelable.c.length) {
            object = parcelable.c[n2].a(this);
            if (a) {
                Log.v((String)"FragmentManager", (String)("restoreAllState: back stack #" + n2 + " (index " + ((c)object).o + "): " + object));
                ((c)object).a("  ", new PrintWriter(new android.support.v4.e.d("FragmentManager")), false);
            }
            this.i.add((c)object);
            if (((c)object).o >= 0) {
                this.a(((c)object).o, (c)object);
            }
            ++n2;
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    public final void a(d d2, int n2, int n3) {
        if (a) {
            Log.v((String)"FragmentManager", (String)("remove: " + d2 + " nesting=" + d2.s));
        }
        int n4 = d2.s > 0 ? 1 : 0;
        n4 = n4 == 0 ? 1 : 0;
        if (!d2.B || n4 != 0) {
            if (this.g != null) {
                this.g.remove(d2);
            }
            if (d2.E && d2.F) {
                this.r = true;
            }
            d2.m = false;
            d2.n = true;
            n4 = n4 != 0 ? 0 : 1;
            this.a(d2, n4, n2, n3, false);
        }
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    final void a(final d var1_1, int var2_2, int var3_3, int var4_4, boolean var5_5) {
        block88: {
            block89: {
                block87: {
                    block86: {
                        if (!var1_1.m) break block86;
                        var6_6 = var2_2;
                        if (!var1_1.B) break block87;
                    }
                    var6_6 = var2_2;
                    if (var2_2 > 1) {
                        var6_6 = 1;
                    }
                }
                var7_7 = var6_6;
                if (var1_1.n) {
                    var7_7 = var6_6;
                    if (var6_6 > var1_1.b) {
                        var7_7 = var1_1.b;
                    }
                }
                var2_2 = var7_7;
                if (var1_1.L) {
                    var2_2 = var7_7;
                    if (var1_1.b < 4) {
                        var2_2 = var7_7;
                        if (var7_7 > 3) {
                            var2_2 = 3;
                        }
                    }
                }
                if (var1_1.b >= var2_2) ** GOTO lbl115
                if (var1_1.p && !var1_1.q) {
                    return;
                }
                if (var1_1.c != null) {
                    var1_1.c = null;
                    this.a(var1_1, var1_1.d, 0, 0, true);
                }
                var7_7 = var2_2;
                var8_8 = var2_2;
                var6_6 = var2_2;
                switch (var1_1.b) {
                    default: {
                        var7_7 = var2_2;
                        break block88;
                    }
                    case 0: {
                        if (android.support.v4.app.h.a) {
                            Log.v((String)"FragmentManager", (String)("moveto CREATED: " + var1_1));
                        }
                        var6_6 = var2_2;
                        if (var1_1.e != null) {
                            var1_1.e.setClassLoader(this.o.getClassLoader());
                            var1_1.f = var1_1.e.getSparseParcelableArray("android:view_state");
                            var1_1.j = this.a(var1_1.e, "android:target_state");
                            if (var1_1.j != null) {
                                var1_1.l = var1_1.e.getInt("android:target_req_state", 0);
                            }
                            var1_1.M = var1_1.e.getBoolean("android:user_visible_hint", true);
                            var6_6 = var2_2;
                            if (!var1_1.M) {
                                var1_1.L = true;
                                var6_6 = var2_2;
                                if (var2_2 > 3) {
                                    var6_6 = 3;
                                }
                            }
                        }
                        var1_1.u = this.o;
                        var1_1.w = this.q;
                        var9_9 = this.q != null ? this.q.v : this.o.b;
                        var1_1.t = var9_9;
                        var1_1.G = false;
                        var1_1.G = true;
                        if (!var1_1.G) {
                            throw new o("Fragment " + var1_1 + " did not call through to super.onAttach()");
                        }
                        var9_9 = var1_1.w;
                        if (!var1_1.D) {
                            var9_9 = var1_1.e;
                            if (var1_1.v != null) {
                                var1_1.v.s = false;
                            }
                            var1_1.G = false;
                            var1_1.G = true;
                            if (!var1_1.G) {
                                throw new o("Fragment " + var1_1 + " did not call through to super.onCreate()");
                            }
                            if (var9_9 != null && (var9_9 = var9_9.getParcelable("android:support:fragments")) != null) {
                                if (var1_1.v == null) {
                                    var1_1.g();
                                }
                                var1_1.v.a((Parcelable)var9_9, null);
                                var1_1.v.d();
                            }
                        }
                        var1_1.D = false;
                        var7_7 = var6_6;
                        if (!var1_1.p) ** GOTO lbl91
                        var9_9 = var1_1.e;
                        var1_1.c();
                        var9_9 = var1_1.e;
                        var1_1.J = var1_1.h();
                        if (var1_1.J == null) ** GOTO lbl93
                        var1_1.K = var1_1.J;
                        var1_1.J = android.support.v4.app.m.a(var1_1.J);
                        if (var1_1.A) {
                            var1_1.J.setVisibility(8);
                        }
                        var9_9 = var1_1.J;
                        var9_9 = var1_1.e;
                        android.support.v4.app.d.e();
                        var7_7 = var6_6;
                    }
lbl91:
                    // 3 sources

                    case 1: {
                        ** GOTO lbl95
                    }
lbl93:
                    // 1 sources

                    var1_1.K = null;
                    var7_7 = var6_6;
lbl95:
                    // 2 sources

                    var8_8 = var7_7;
                    if (var7_7 <= 1) ** GOTO lbl283
                    if (android.support.v4.app.h.a) {
                        Log.v((String)"FragmentManager", (String)("moveto ACTIVITY_CREATED: " + var1_1));
                    }
                    if (var1_1.p) ** GOTO lbl263
                    if (var1_1.y == 0) ** GOTO lbl241
                    var10_11 = (ViewGroup)this.p.a(var1_1.y);
                    var9_9 = var10_11;
                    if (var10_11 == null) {
                        var9_9 = var10_11;
                        if (!var1_1.r) {
                            var9_9 = new StringBuilder("No view found for id 0x").append(Integer.toHexString(var1_1.y)).append(" (");
                            if (var1_1.u == null) {
                                throw new IllegalStateException("Fragment " + var1_1 + " not attached to Activity");
                            }
                            this.a(new IllegalArgumentException(var9_9.append(var1_1.u.getResources().getResourceName(var1_1.y)).append(") for fragment ").append(var1_1).toString()));
                            var9_9 = var10_11;
                        }
                    }
                    ** GOTO lbl242
                    case 4: {
                        break block89;
                    }
lbl115:
                    // 1 sources

                    var7_7 = var2_2;
                    if (var1_1.b > var2_2) {
                        switch (var1_1.b) {
                            default: {
                                var7_7 = var2_2;
                                break;
                            }
                            case 5: {
                                if (var2_2 < 5) {
                                    if (android.support.v4.app.h.a) {
                                        Log.v((String)"FragmentManager", (String)("movefrom RESUMED: " + var1_1));
                                    }
                                    if (var1_1.v != null) {
                                        var1_1.v.a(4);
                                    }
                                    var1_1.G = false;
                                    var1_1.G = true;
                                    if (!var1_1.G) {
                                        throw new o("Fragment " + var1_1 + " did not call through to super.onPause()");
                                    }
                                    var1_1.o = false;
                                }
                            }
                            case 4: {
                                if (var2_2 < 4) {
                                    if (android.support.v4.app.h.a) {
                                        Log.v((String)"FragmentManager", (String)("movefrom STARTED: " + var1_1));
                                    }
                                    if (var1_1.v != null) {
                                        var1_1.v.h();
                                    }
                                    var1_1.G = false;
                                    var1_1.G = true;
                                    if (!var1_1.G) {
                                        throw new o("Fragment " + var1_1 + " did not call through to super.onStop()");
                                    }
                                }
                            }
                            case 3: {
                                if (var2_2 < 3) {
                                    if (android.support.v4.app.h.a) {
                                        Log.v((String)"FragmentManager", (String)("movefrom STOPPED: " + var1_1));
                                    }
                                    var1_1.j();
                                }
                            }
                            case 2: {
                                if (var2_2 < 2) {
                                    if (android.support.v4.app.h.a) {
                                        Log.v((String)"FragmentManager", (String)("movefrom ACTIVITY_CREATED: " + var1_1));
                                    }
                                    if (var1_1.J != null && !this.o.isFinishing() && var1_1.f == null) {
                                        this.b(var1_1);
                                    }
                                    if (var1_1.v != null) {
                                        var1_1.v.a(1);
                                    }
                                    var1_1.G = false;
                                    var1_1.G = true;
                                    if (!var1_1.G) {
                                        throw new o("Fragment " + var1_1 + " did not call through to super.onDestroyView()");
                                    }
                                    if (var1_1.N != null) {
                                        var1_1.N.e();
                                    }
                                    if (var1_1.J != null && var1_1.I != null) {
                                        var9_10 /* !! */  = this.n > 0 && this.t == false ? this.a(var1_1, var3_3, false, var4_4) : null;
                                        if (var9_10 /* !! */  != null) {
                                            var1_1.c = var1_1.J;
                                            var1_1.d = var2_2;
                                            var9_10 /* !! */ .setAnimationListener(new Animation.AnimationListener(){

                                                public final void onAnimationEnd(Animation animation) {
                                                    if (var1_1.c != null) {
                                                        var1_1.c = null;
                                                        h.this.a(var1_1, var1_1.d, 0, 0, false);
                                                    }
                                                }

                                                public final void onAnimationRepeat(Animation animation) {
                                                }

                                                public final void onAnimationStart(Animation animation) {
                                                }
                                            });
                                            var1_1.J.startAnimation((Animation)var9_10 /* !! */ );
                                        }
                                        var1_1.I.removeView(var1_1.J);
                                    }
                                    var1_1.I = null;
                                    var1_1.J = null;
                                    var1_1.K = null;
                                }
                            }
                            case 1: {
                                var7_7 = var2_2;
                                if (var2_2 > 0) break;
                                if (this.t && var1_1.c != null) {
                                    var9_10 /* !! */  = var1_1.c;
                                    var1_1.c = null;
                                    var9_10 /* !! */ .clearAnimation();
                                }
                                if (var1_1.c != null) {
                                    var1_1.d = var2_2;
                                    var7_7 = 1;
                                    break;
                                }
                                if (android.support.v4.app.h.a) {
                                    Log.v((String)"FragmentManager", (String)("movefrom CREATED: " + var1_1));
                                }
                                if (!var1_1.D) {
                                    var1_1.k();
                                }
                                var1_1.G = false;
                                var1_1.G = true;
                                if (!var1_1.G) {
                                    throw new o("Fragment " + var1_1 + " did not call through to super.onDetach()");
                                }
                                var7_7 = var2_2;
                                if (var5_5) break;
                                if (!var1_1.D) {
                                    var7_7 = var2_2;
                                    if (var1_1.g < 0) break;
                                    if (android.support.v4.app.h.a) {
                                        Log.v((String)"FragmentManager", (String)("Freeing fragment index " + var1_1));
                                    }
                                    this.f.set(var1_1.g, null);
                                    if (this.h == null) {
                                        this.h = new ArrayList<E>();
                                    }
                                    this.h.add(var1_1.g);
                                    this.o.a(var1_1.h);
                                    var1_1.g = -1;
                                    var1_1.h = null;
                                    var1_1.m = false;
                                    var1_1.n = false;
                                    var1_1.o = false;
                                    var1_1.p = false;
                                    var1_1.q = false;
                                    var1_1.r = false;
                                    var1_1.s = 0;
                                    var1_1.t = null;
                                    var1_1.v = null;
                                    var1_1.u = null;
                                    var1_1.x = 0;
                                    var1_1.y = 0;
                                    var1_1.z = null;
                                    var1_1.A = false;
                                    var1_1.B = false;
                                    var1_1.D = false;
                                    var1_1.N = null;
                                    var1_1.O = false;
                                    var1_1.P = false;
                                    var7_7 = var2_2;
                                    break;
                                }
                                var1_1.u = null;
                                var1_1.w = null;
                                var1_1.t = null;
                                var1_1.v = null;
                                var7_7 = var2_2;
                                break;
                            }
                        }
                    }
                    break block88;
lbl241:
                    // 1 sources

                    var9_9 = null;
lbl242:
                    // 2 sources

                    var1_1.I = var9_9;
                    var10_11 = var1_1.e;
                    var1_1.c();
                    var10_11 = var1_1.e;
                    var1_1.J = var1_1.h();
                    if (var1_1.J != null) {
                        var1_1.K = var1_1.J;
                        var1_1.J = android.support.v4.app.m.a(var1_1.J);
                        if (var9_9 != null) {
                            var10_11 = this.a(var1_1, var3_3, true, var4_4);
                            if (var10_11 != null) {
                                var1_1.J.startAnimation((Animation)var10_11);
                            }
                            var9_9.addView(var1_1.J);
                        }
                        if (var1_1.A) {
                            var1_1.J.setVisibility(8);
                        }
                        var9_9 = var1_1.J;
                        var9_9 = var1_1.e;
                        android.support.v4.app.d.e();
                    } else {
                        var1_1.K = null;
                    }
lbl263:
                    // 3 sources

                    var9_9 = var1_1.e;
                    if (var1_1.v != null) {
                        var1_1.v.s = false;
                    }
                    var1_1.G = false;
                    var1_1.G = true;
                    if (!var1_1.G) {
                        throw new o("Fragment " + var1_1 + " did not call through to super.onActivityCreated()");
                    }
                    if (var1_1.v != null) {
                        var1_1.v.e();
                    }
                    if (var1_1.J != null) {
                        var9_9 = var1_1.e;
                        if (var1_1.f != null) {
                            var1_1.K.restoreHierarchyState(var1_1.f);
                            var1_1.f = null;
                        }
                        var1_1.G = false;
                        var1_1.G = true;
                        if (!var1_1.G) {
                            throw new o("Fragment " + var1_1 + " did not call through to super.onViewStateRestored()");
                        }
                    }
                    var1_1.e = null;
                    var8_8 = var7_7;
lbl283:
                    // 3 sources

                    case 2: 
                    case 3: 
                }
                var6_6 = var8_8;
                if (var8_8 <= 3) ** break;
                if (android.support.v4.app.h.a) {
                    Log.v((String)"FragmentManager", (String)("moveto STARTED: " + var1_1));
                }
                var1_1.i();
                var6_6 = var8_8;
            }
            var7_7 = var6_6;
            if (var6_6 > 4) {
                if (android.support.v4.app.h.a) {
                    Log.v((String)"FragmentManager", (String)("moveto RESUMED: " + var1_1));
                }
                var1_1.o = true;
                if (var1_1.v != null) {
                    var1_1.v.s = false;
                    var1_1.v.a();
                }
                var1_1.G = false;
                var1_1.G = true;
                if (!var1_1.G) {
                    throw new o("Fragment " + var1_1 + " did not call through to super.onResume()");
                }
                if (var1_1.v != null) {
                    var1_1.v.g();
                    var1_1.v.a();
                }
                var1_1.e = null;
                var1_1.f = null;
                var7_7 = var6_6;
            }
        }
        var1_1.b = var7_7;
    }

    /*
     * Enabled aggressive block sorting
     */
    public final void a(d d2, boolean bl) {
        if (this.g == null) {
            this.g = new ArrayList();
        }
        if (a) {
            Log.v((String)"FragmentManager", (String)("add: " + d2));
        }
        if (d2.g < 0) {
            if (this.h == null || this.h.size() <= 0) {
                if (this.f == null) {
                    this.f = new ArrayList();
                }
                d2.a(this.f.size(), this.q);
                this.f.add(d2);
            } else {
                d2.a(this.h.remove(this.h.size() - 1), this.q);
                this.f.set(d2.g, d2);
            }
            if (a) {
                Log.v((String)"FragmentManager", (String)("Allocated fragment index " + d2));
            }
        }
        if (!d2.B) {
            if (this.g.contains(d2)) {
                throw new IllegalStateException("Fragment already added: " + d2);
            }
            this.g.add(d2);
            d2.m = true;
            d2.n = false;
            if (d2.E && d2.F) {
                this.r = true;
            }
            if (bl) {
                this.a(d2);
            }
        }
    }

    public final void a(e e2, f f2, d d2) {
        if (this.o != null) {
            throw new IllegalStateException("Already attached");
        }
        this.o = e2;
        this.p = f2;
        this.q = d2;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    public final void a(String string, FileDescriptor object, PrintWriter printWriter, String[] arrstring) {
        int n2;
        int n3;
        int n4 = 0;
        String string2 = string + "    ";
        if (this.f != null && (n3 = this.f.size()) > 0) {
            printWriter.print(string);
            printWriter.print("Active Fragments in ");
            printWriter.print(Integer.toHexString(System.identityHashCode(this)));
            printWriter.println(":");
            for (n2 = 0; n2 < n3; ++n2) {
                d d2 = this.f.get(n2);
                printWriter.print(string);
                printWriter.print("  #");
                printWriter.print(n2);
                printWriter.print(": ");
                printWriter.println(d2);
                if (d2 == null) continue;
                printWriter.print(string2);
                printWriter.print("mFragmentId=#");
                printWriter.print(Integer.toHexString(d2.x));
                printWriter.print(" mContainerId=#");
                printWriter.print(Integer.toHexString(d2.y));
                printWriter.print(" mTag=");
                printWriter.println(d2.z);
                printWriter.print(string2);
                printWriter.print("mState=");
                printWriter.print(d2.b);
                printWriter.print(" mIndex=");
                printWriter.print(d2.g);
                printWriter.print(" mWho=");
                printWriter.print(d2.h);
                printWriter.print(" mBackStackNesting=");
                printWriter.println(d2.s);
                printWriter.print(string2);
                printWriter.print("mAdded=");
                printWriter.print(d2.m);
                printWriter.print(" mRemoving=");
                printWriter.print(d2.n);
                printWriter.print(" mResumed=");
                printWriter.print(d2.o);
                printWriter.print(" mFromLayout=");
                printWriter.print(d2.p);
                printWriter.print(" mInLayout=");
                printWriter.println(d2.q);
                printWriter.print(string2);
                printWriter.print("mHidden=");
                printWriter.print(d2.A);
                printWriter.print(" mDetached=");
                printWriter.print(d2.B);
                printWriter.print(" mMenuVisible=");
                printWriter.print(d2.F);
                printWriter.print(" mHasMenu=");
                printWriter.println(d2.E);
                printWriter.print(string2);
                printWriter.print("mRetainInstance=");
                printWriter.print(d2.C);
                printWriter.print(" mRetaining=");
                printWriter.print(d2.D);
                printWriter.print(" mUserVisibleHint=");
                printWriter.println(d2.M);
                if (d2.t != null) {
                    printWriter.print(string2);
                    printWriter.print("mFragmentManager=");
                    printWriter.println(d2.t);
                }
                if (d2.u != null) {
                    printWriter.print(string2);
                    printWriter.print("mActivity=");
                    printWriter.println((Object)d2.u);
                }
                if (d2.w != null) {
                    printWriter.print(string2);
                    printWriter.print("mParentFragment=");
                    printWriter.println(d2.w);
                }
                if (d2.i != null) {
                    printWriter.print(string2);
                    printWriter.print("mArguments=");
                    printWriter.println((Object)d2.i);
                }
                if (d2.e != null) {
                    printWriter.print(string2);
                    printWriter.print("mSavedFragmentState=");
                    printWriter.println((Object)d2.e);
                }
                if (d2.f != null) {
                    printWriter.print(string2);
                    printWriter.print("mSavedViewState=");
                    printWriter.println(d2.f);
                }
                if (d2.j != null) {
                    printWriter.print(string2);
                    printWriter.print("mTarget=");
                    printWriter.print(d2.j);
                    printWriter.print(" mTargetRequestCode=");
                    printWriter.println(d2.l);
                }
                if (d2.H != 0) {
                    printWriter.print(string2);
                    printWriter.print("mNextAnim=");
                    printWriter.println(d2.H);
                }
                if (d2.I != null) {
                    printWriter.print(string2);
                    printWriter.print("mContainer=");
                    printWriter.println((Object)d2.I);
                }
                if (d2.J != null) {
                    printWriter.print(string2);
                    printWriter.print("mView=");
                    printWriter.println((Object)d2.J);
                }
                if (d2.K != null) {
                    printWriter.print(string2);
                    printWriter.print("mInnerView=");
                    printWriter.println((Object)d2.J);
                }
                if (d2.c != null) {
                    printWriter.print(string2);
                    printWriter.print("mAnimatingAway=");
                    printWriter.println((Object)d2.c);
                    printWriter.print(string2);
                    printWriter.print("mStateAfterAnimating=");
                    printWriter.println(d2.d);
                }
                if (d2.N != null) {
                    printWriter.print(string2);
                    printWriter.println("Loader Manager:");
                    d2.N.a(string2 + "  ", printWriter);
                }
                if (d2.v == null) continue;
                printWriter.print(string2);
                printWriter.println("Child " + d2.v + ":");
                d2.v.a(string2 + "  ", (FileDescriptor)object, printWriter, arrstring);
            }
        }
        if (this.g != null && (n3 = this.g.size()) > 0) {
            printWriter.print(string);
            printWriter.println("Added Fragments:");
            for (n2 = 0; n2 < n3; ++n2) {
                object = this.g.get(n2);
                printWriter.print(string);
                printWriter.print("  #");
                printWriter.print(n2);
                printWriter.print(": ");
                printWriter.println(((d)object).toString());
            }
        }
        if (this.j != null && (n3 = this.j.size()) > 0) {
            printWriter.print(string);
            printWriter.println("Fragments Created Menus:");
            for (n2 = 0; n2 < n3; ++n2) {
                object = this.j.get(n2);
                printWriter.print(string);
                printWriter.print("  #");
                printWriter.print(n2);
                printWriter.print(": ");
                printWriter.println(((d)object).toString());
            }
        }
        if (this.i != null && (n3 = this.i.size()) > 0) {
            printWriter.print(string);
            printWriter.println("Back Stack:");
            for (n2 = 0; n2 < n3; ++n2) {
                object = this.i.get(n2);
                printWriter.print(string);
                printWriter.print("  #");
                printWriter.print(n2);
                printWriter.print(": ");
                printWriter.println(((c)object).toString());
                ((c)object).a(string2, printWriter);
            }
        }
        // MONITORENTER : this
        if (this.k != null && (n3 = this.k.size()) > 0) {
            printWriter.print(string);
            printWriter.println("Back Stack Indices:");
            for (n2 = 0; n2 < n3; ++n2) {
                object = this.k.get(n2);
                printWriter.print(string);
                printWriter.print("  #");
                printWriter.print(n2);
                printWriter.print(": ");
                printWriter.println(object);
            }
        }
        if (this.l != null && this.l.size() > 0) {
            printWriter.print(string);
            printWriter.print("mAvailBackStackIndices: ");
            printWriter.println(Arrays.toString(this.l.toArray()));
        }
        // MONITOREXIT : this
        if (this.c != null && (n3 = this.c.size()) > 0) {
            printWriter.print(string);
            printWriter.println("Pending Actions:");
            for (n2 = n4; n2 < n3; ++n2) {
                object = this.c.get(n2);
                printWriter.print(string);
                printWriter.print("  #");
                printWriter.print(n2);
                printWriter.print(": ");
                printWriter.println(object);
            }
        }
        printWriter.print(string);
        printWriter.println("FragmentManager misc state:");
        printWriter.print(string);
        printWriter.print("  mActivity=");
        printWriter.println((Object)this.o);
        printWriter.print(string);
        printWriter.print("  mContainer=");
        printWriter.println(this.p);
        if (this.q != null) {
            printWriter.print(string);
            printWriter.print("  mParent=");
            printWriter.println(this.q);
        }
        printWriter.print(string);
        printWriter.print("  mCurState=");
        printWriter.print(this.n);
        printWriter.print(" mStateSaved=");
        printWriter.print(this.s);
        printWriter.print(" mDestroyed=");
        printWriter.println(this.t);
        if (this.r) {
            printWriter.print(string);
            printWriter.print("  mNeedMenuInvalidate=");
            printWriter.println(this.r);
        }
        if (this.u != null) {
            printWriter.print(string);
            printWriter.print("  mNoTransactionsBecause=");
            printWriter.println(this.u);
        }
        if (this.h == null) return;
        if (this.h.size() <= 0) return;
        printWriter.print(string);
        printWriter.print("  mAvailIndices: ");
        printWriter.println(Arrays.toString(this.h.toArray()));
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final boolean a() {
        boolean bl;
        block14: {
            int n2;
            if (this.e) {
                throw new IllegalStateException("Recursive entry to executePendingTransactions");
            }
            if (Looper.myLooper() != this.o.a.getLooper()) {
                throw new IllegalStateException("Must be called from main thread of process");
            }
            bl = false;
            while (true) {
                int n3;
                synchronized (this) {
                    if (this.c == null || this.c.size() == 0) {
                        // MONITOREXIT [3, 4, 13] lbl9 : MonitorExitStatement: MONITOREXIT : this
                        if (!this.v) break block14;
                        n2 = 0;
                        for (n3 = 0; n3 < this.f.size(); ++n3) {
                            d d2 = this.f.get(n3);
                            int n4 = n2;
                            if (d2 != null) {
                                n4 = n2;
                                if (d2.N != null) {
                                    n4 = n2 | d2.N.a();
                                }
                            }
                            n2 = n4;
                        }
                        break;
                    }
                    n2 = this.c.size();
                    if (this.d == null || this.d.length < n2) {
                        this.d = new Runnable[n2];
                    }
                    this.c.toArray(this.d);
                    this.c.clear();
                    this.o.a.removeCallbacks(this.y);
                }
                this.e = true;
                for (n3 = 0; n3 < n2; ++n3) {
                    this.d[n3].run();
                    this.d[n3] = null;
                }
                this.e = false;
                bl = true;
            }
            if (n2 == 0) {
                this.v = false;
                this.k();
            }
        }
        return bl;
    }

    /*
     * Enabled aggressive block sorting
     */
    public final boolean a(Menu menu) {
        if (this.g == null) return false;
        int n2 = 0;
        boolean bl = false;
        while (true) {
            boolean bl2 = bl;
            if (n2 >= this.g.size()) return bl2;
            d d2 = this.g.get(n2);
            bl2 = bl;
            if (d2 != null) {
                boolean bl3;
                if (!d2.A) {
                    boolean bl4 = d2.E && d2.F;
                    bl3 = bl4;
                    if (d2.v != null) {
                        bl3 = bl4 | d2.v.a(menu);
                    }
                } else {
                    bl3 = false;
                }
                bl2 = bl;
                if (bl3) {
                    bl2 = true;
                }
            }
            ++n2;
            bl = bl2;
        }
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    public final boolean a(Menu var1_1, MenuInflater var2_2) {
        block6: {
            var3_5 = 0;
            var4_6 = null;
            var5_7 = null;
            if (this.g != null) break block6;
            var8_10 = false;
            ** GOTO lbl22
        }
        var6_8 = 0;
        var7_9 = false;
        while (true) {
            block8: {
                block10: {
                    block9: {
                        block7: {
                            var4_6 = var5_7;
                            var8_10 = var7_9;
                            if (var6_8 >= this.g.size()) break block7;
                            var9_11 = this.g.get(var6_8);
                            if (var9_11 == null) break block8;
                            if (var9_11.A) break block9;
                            var10_12 = var9_11.E != false && var9_11.F != false ? 1 : 0;
                            var11_13 = var10_12;
                            if (var9_11.v != null) {
                                var11_13 = var10_12 | var9_11.v.a(var1_1 /* !! */ , (MenuInflater)var2_4);
                            }
                            break block10;
                        }
                        if (this.j != null) {
                            for (var10_12 = var3_5; var10_12 < this.j.size(); ++var10_12) {
                                var1_3 = this.j.get(var10_12);
                                if (var4_6 != null && var4_6.contains(var1_3)) continue;
                                android.support.v4.app.d.f();
                            }
                        }
                        this.j = var4_6;
                        return var8_10;
                    }
                    var11_13 = 0;
                }
                if (var11_13 != 0) {
                    var4_6 = var5_7;
                    if (var5_7 == null) {
                        var4_6 = new ArrayList<d>();
                    }
                    var4_6.add(var9_11);
                    var7_9 = true;
                    var5_7 = var4_6;
                }
            }
            ++var6_8;
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    public final boolean a(MenuItem menuItem) {
        boolean bl;
        boolean bl2 = bl = false;
        if (this.g == null) return bl2;
        int n2 = 0;
        while (true) {
            bl2 = bl;
            if (n2 >= this.g.size()) return bl2;
            d d2 = this.g.get(n2);
            if (d2 != null) {
                if (!d2.A && d2.v != null && d2.v.a(menuItem)) {
                    return true;
                }
                boolean bl3 = false;
                if (bl3) {
                    return true;
                }
            }
            ++n2;
        }
    }

    final void b() {
        if (this.m != null) {
            for (int i2 = 0; i2 < this.m.size(); ++i2) {
                this.m.get(i2);
            }
        }
    }

    public final void b(d d2, int n2, int n3) {
        if (a) {
            Log.v((String)"FragmentManager", (String)("hide: " + d2));
        }
        if (!d2.A) {
            d2.A = true;
            if (d2.J != null) {
                Animation animation = this.a(d2, n2, false, n3);
                if (animation != null) {
                    d2.J.startAnimation(animation);
                }
                d2.J.setVisibility(8);
            }
            if (d2.m && d2.E && d2.F) {
                this.r = true;
            }
            android.support.v4.app.d.a();
        }
    }

    public final void b(Menu menu) {
        if (this.g != null) {
            for (int i2 = 0; i2 < this.g.size(); ++i2) {
                d d2 = this.g.get(i2);
                if (d2 == null || d2.A || d2.v == null) continue;
                d2.v.b(menu);
            }
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    public final boolean b(MenuItem menuItem) {
        boolean bl;
        boolean bl2 = bl = false;
        if (this.g == null) return bl2;
        int n2 = 0;
        while (true) {
            bl2 = bl;
            if (n2 >= this.g.size()) return bl2;
            d d2 = this.g.get(n2);
            if (d2 != null) {
                if (!d2.A && d2.v != null && d2.v.b(menuItem)) {
                    return true;
                }
                boolean bl3 = false;
                if (bl3) {
                    return true;
                }
            }
            ++n2;
        }
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     */
    final Parcelable c() {
        void var10_44;
        void var3_21;
        int n2;
        void var3_8;
        Object var1_1 = null;
        Object var2_5 = null;
        this.a();
        if (b) {
            this.s = true;
        }
        Object var3_6 = var2_5;
        if (this.f == null) return var3_8;
        if (this.f.size() <= 0) {
            Object var3_7 = var2_5;
            return var3_8;
        }
        int n3 = this.f.size();
        FragmentState[] arrfragmentState = new FragmentState[n3];
        int n4 = 0;
        for (n2 = 0; n2 < n3; ++n2) {
            FragmentState fragmentState;
            d d2 = this.f.get(n2);
            if (d2 == null) continue;
            if (d2.g < 0) {
                this.a(new IllegalStateException("Failure saving state: active " + d2 + " has cleared index: " + d2.g));
            }
            arrfragmentState[n2] = fragmentState = new FragmentState(d2);
            if (d2.b > 0 && fragmentState.j == null) {
                void var10_36;
                void var3_14;
                void var10_31;
                if (this.w == null) {
                    this.w = new Bundle();
                }
                d2.a(this.w);
                if (!this.w.isEmpty()) {
                    Bundle bundle = this.w;
                    this.w = null;
                } else {
                    Object var10_45 = null;
                }
                if (d2.J != null) {
                    this.b(d2);
                }
                void var3_10 = var10_31;
                if (d2.f != null) {
                    void var3_13;
                    void var3_11 = var10_31;
                    if (var10_31 == null) {
                        Bundle bundle = new Bundle();
                    }
                    var3_13.putSparseParcelableArray("android:view_state", d2.f);
                }
                void var10_32 = var3_14;
                if (!d2.M) {
                    void var10_35;
                    void var10_33 = var3_14;
                    if (var3_14 == null) {
                        Bundle bundle = new Bundle();
                    }
                    var10_35.putBoolean("android:user_visible_hint", d2.M);
                }
                fragmentState.j = var10_36;
                if (d2.j != null) {
                    if (d2.j.g < 0) {
                        this.a(new IllegalStateException("Failure saving state: " + d2 + " has target not in fragment manager: " + d2.j));
                    }
                    if (fragmentState.j == null) {
                        fragmentState.j = new Bundle();
                    }
                    Bundle bundle = fragmentState.j;
                    d d3 = d2.j;
                    if (d3.g < 0) {
                        this.a(new IllegalStateException("Fragment " + d3 + " is not currently in the FragmentManager"));
                    }
                    bundle.putInt("android:target_state", d3.g);
                    if (d2.l != 0) {
                        fragmentState.j.putInt("android:target_req_state", d2.l);
                    }
                }
            } else {
                fragmentState.j = d2.e;
            }
            if (a) {
                Log.v((String)"FragmentManager", (String)("Saved state of " + d2 + ": " + (Object)fragmentState.j));
            }
            n4 = 1;
        }
        if (n4 == 0) {
            Object var3_16 = var2_5;
            if (!a) return var3_8;
            Log.v((String)"FragmentManager", (String)"saveAllState: no fragments!");
            Object var3_17 = var2_5;
            return var3_8;
        }
        if (this.g != null && (n2 = this.g.size()) > 0) {
            int[] arrn = new int[n2];
            n4 = 0;
            while (true) {
                int[] arrn2 = arrn;
                if (n4 < n2) {
                    arrn[n4] = this.g.get((int)n4).g;
                    if (arrn[n4] < 0) {
                        this.a(new IllegalStateException("Failure saving state: active " + this.g.get(n4) + " has cleared index: " + arrn[n4]));
                    }
                    if (a) {
                        Log.v((String)"FragmentManager", (String)("saveAllState: adding fragment #" + n4 + ": " + this.g.get(n4)));
                    }
                    ++n4;
                    continue;
                }
                break;
            }
        } else {
            Object var3_20 = null;
        }
        Object var10_40 = var1_1;
        if (this.i != null) {
            n2 = this.i.size();
            Object var10_41 = var1_1;
            if (n2 > 0) {
                BackStackState[] arrbackStackState = new BackStackState[n2];
                n4 = 0;
                while (true) {
                    BackStackState[] arrbackStackState2 = arrbackStackState;
                    if (n4 >= n2) break;
                    arrbackStackState[n4] = new BackStackState(this.i.get(n4));
                    if (a) {
                        Log.v((String)"FragmentManager", (String)("saveAllState: adding back stack #" + n4 + ": " + this.i.get(n4)));
                    }
                    ++n4;
                }
            }
        }
        FragmentManagerState fragmentManagerState = new FragmentManagerState();
        fragmentManagerState.a = arrfragmentState;
        fragmentManagerState.b = var3_21;
        fragmentManagerState.c = var10_44;
        FragmentManagerState fragmentManagerState2 = fragmentManagerState;
        return var3_8;
    }

    public final void c(d d2, int n2, int n3) {
        if (a) {
            Log.v((String)"FragmentManager", (String)("show: " + d2));
        }
        if (d2.A) {
            d2.A = false;
            if (d2.J != null) {
                Animation animation = this.a(d2, n2, true, n3);
                if (animation != null) {
                    d2.J.startAnimation(animation);
                }
                d2.J.setVisibility(0);
            }
            if (d2.m && d2.E && d2.F) {
                this.r = true;
            }
            android.support.v4.app.d.a();
        }
    }

    public final void d() {
        this.s = false;
        this.a(1);
    }

    public final void d(d d2, int n2, int n3) {
        if (a) {
            Log.v((String)"FragmentManager", (String)("detach: " + d2));
        }
        if (!d2.B) {
            d2.B = true;
            if (d2.m) {
                if (this.g != null) {
                    if (a) {
                        Log.v((String)"FragmentManager", (String)("remove from detach: " + d2));
                    }
                    this.g.remove(d2);
                }
                if (d2.E && d2.F) {
                    this.r = true;
                }
                d2.m = false;
                this.a(d2, 1, n2, n3, false);
            }
        }
    }

    public final void e() {
        this.s = false;
        this.a(2);
    }

    public final void e(d d2, int n2, int n3) {
        if (a) {
            Log.v((String)"FragmentManager", (String)("attach: " + d2));
        }
        if (d2.B) {
            d2.B = false;
            if (!d2.m) {
                if (this.g == null) {
                    this.g = new ArrayList();
                }
                if (this.g.contains(d2)) {
                    throw new IllegalStateException("Fragment already added: " + d2);
                }
                if (a) {
                    Log.v((String)"FragmentManager", (String)("add from attach: " + d2));
                }
                this.g.add(d2);
                d2.m = true;
                if (d2.E && d2.F) {
                    this.r = true;
                }
                this.a(d2, this.n, n2, n3, false);
            }
        }
    }

    public final void f() {
        this.s = false;
        this.a(4);
    }

    public final void g() {
        this.s = false;
        this.a(5);
    }

    public final void h() {
        this.s = true;
        this.a(3);
    }

    public final void i() {
        this.t = true;
        this.a();
        this.a(0);
        this.o = null;
        this.p = null;
        this.q = null;
    }

    public final void j() {
        if (this.g != null) {
            for (int i2 = 0; i2 < this.g.size(); ++i2) {
                d d2 = this.g.get(i2);
                if (d2 == null) continue;
                d2.onLowMemory();
                if (d2.v == null) continue;
                d2.v.j();
            }
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    public final View onCreateView(String object, Context context, AttributeSet attributeSet) {
        int n2;
        Object object2 = null;
        if (!"fragment".equals(object)) {
            return object2;
        }
        String string = attributeSet.getAttributeValue(null, "class");
        object = context.obtainStyledAttributes(attributeSet, android.support.v4.app.h$a.a);
        if (string == null) {
            string = object.getString(0);
        }
        int n3 = object.getResourceId(1, -1);
        String string2 = object.getString(2);
        object.recycle();
        object = object2;
        if (!android.support.v4.app.d.b((Context)this.o, string)) return object;
        object2 = n3 != -1 ? this.c(n3) : null;
        object = object2;
        if (object2 == null) {
            object = object2;
            if (string2 != null) {
                if (this.g != null && string2 != null) {
                    for (n2 = this.g.size() - 1; n2 >= 0; --n2) {
                        object = this.g.get(n2);
                        if (object == null || !string2.equals(((d)object).z)) {
                            continue;
                        }
                        break;
                    }
                } else if (this.f != null && string2 != null) {
                    for (n2 = this.f.size() - 1; n2 >= 0; --n2) {
                        object2 = this.f.get(n2);
                        if (object2 == null) continue;
                        object = object2;
                        if (!string2.equals(((d)object2).z)) {
                            continue;
                        }
                        break;
                    }
                } else {
                    object = null;
                }
            }
        }
        object2 = object;
        if (object == null) {
            object2 = this.c(0);
        }
        if (a) {
            Log.v((String)"FragmentManager", (String)("onCreateView: id=0x" + Integer.toHexString(n3) + " fname=" + string + " existing=" + object2));
        }
        if (object2 == null) {
            object = android.support.v4.app.d.a(context, string);
            ((d)object).p = true;
            n2 = n3 != 0 ? n3 : 0;
            ((d)object).x = n2;
            ((d)object).y = 0;
            ((d)object).z = string2;
            ((d)object).q = true;
            ((d)object).t = this;
            context = ((d)object).e;
            ((d)object).G = true;
            this.a((d)object, true);
        } else {
            if (((d)object2).q) {
                throw new IllegalArgumentException(attributeSet.getPositionDescription() + ": Duplicate id 0x" + Integer.toHexString(n3) + ", tag " + string2 + ", or parent id 0x" + Integer.toHexString(0) + " with another fragment for " + string);
            }
            ((d)object2).q = true;
            if (!((d)object2).D) {
                object = ((d)object2).e;
                ((d)object2).G = true;
            }
            object = object2;
        }
        if (this.n <= 0 && ((d)object).p) {
            this.a((d)object, 1, 0, 0, false);
        } else {
            this.a((d)object);
        }
        if (((d)object).J == null) {
            throw new IllegalStateException("Fragment " + string + " did not create a view.");
        }
        if (n3 != 0) {
            ((d)object).J.setId(n3);
        }
        if (((d)object).J.getTag() != null) return ((d)object).J;
        ((d)object).J.setTag((Object)string2);
        return ((d)object).J;
    }

    /*
     * Enabled aggressive block sorting
     */
    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder(128);
        stringBuilder.append("FragmentManager{");
        stringBuilder.append(Integer.toHexString(System.identityHashCode(this)));
        stringBuilder.append(" in ");
        if (this.q != null) {
            android.support.v4.e.c.a(this.q, stringBuilder);
        } else {
            android.support.v4.e.c.a((Object)this.o, stringBuilder);
        }
        stringBuilder.append("}}");
        return stringBuilder.toString();
    }

    static final class a {
        public static final int[] a = new int[]{0x1010003, 0x10100D0, 0x10100D1};
    }
}

