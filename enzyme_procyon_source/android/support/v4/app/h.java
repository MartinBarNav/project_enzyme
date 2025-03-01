// 
// Decompiled by Procyon v0.5.36
// 

package android.support.v4.app;

import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.MenuItem;
import android.view.MenuInflater;
import android.view.Menu;
import android.os.Looper;
import java.util.Arrays;
import android.view.View;
import android.view.animation.Animation$AnimationListener;
import android.view.ViewGroup;
import android.content.res.Configuration;
import android.app.Activity;
import java.io.FileDescriptor;
import java.io.Writer;
import java.io.PrintWriter;
import android.util.Log;
import android.content.Context;
import android.view.animation.AnimationUtils;
import android.view.animation.ScaleAnimation;
import android.view.animation.AnimationSet;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.os.Build$VERSION;
import android.os.Parcelable;
import android.util.SparseArray;
import android.os.Bundle;
import java.util.ArrayList;
import android.view.animation.Interpolator;
import android.view.LayoutInflater$Factory;

final class h extends g implements LayoutInflater$Factory
{
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
    int n;
    e o;
    f p;
    d q;
    boolean r;
    boolean s;
    boolean t;
    String u;
    boolean v;
    Bundle w;
    SparseArray<Parcelable> x;
    Runnable y;
    
    static {
        boolean b2 = false;
        h.a = false;
        if (Build$VERSION.SDK_INT >= 11) {
            b2 = true;
        }
        b = b2;
        z = (Interpolator)new DecelerateInterpolator(2.5f);
        A = (Interpolator)new DecelerateInterpolator(1.5f);
        B = (Interpolator)new AccelerateInterpolator(2.5f);
        C = (Interpolator)new AccelerateInterpolator(1.5f);
    }
    
    h() {
        this.n = 0;
        this.w = null;
        this.x = null;
        this.y = new Runnable() {
            @Override
            public final void run() {
                android.support.v4.app.h.this.a();
            }
        };
    }
    
    private d a(final Bundle bundle, final String s) {
        final int int1 = bundle.getInt(s, -1);
        d d;
        if (int1 == -1) {
            d = null;
        }
        else {
            if (int1 >= this.f.size()) {
                this.a(new IllegalStateException("Fragment no longer exists for key " + s + ": index " + int1));
            }
            final d d2 = this.f.get(int1);
            if ((d = d2) == null) {
                this.a(new IllegalStateException("Fragment no longer exists for key " + s + ": index " + int1));
                d = d2;
            }
        }
        return d;
    }
    
    private static Animation a(final float n, final float n2) {
        final AlphaAnimation alphaAnimation = new AlphaAnimation(n, n2);
        alphaAnimation.setInterpolator(h.A);
        alphaAnimation.setDuration(220L);
        return (Animation)alphaAnimation;
    }
    
    private static Animation a(final float n, final float n2, final float n3, final float n4) {
        final AnimationSet set = new AnimationSet(false);
        final ScaleAnimation scaleAnimation = new ScaleAnimation(n, n2, n, n2, 1, 0.5f, 1, 0.5f);
        scaleAnimation.setInterpolator(h.z);
        scaleAnimation.setDuration(220L);
        set.addAnimation((Animation)scaleAnimation);
        final AlphaAnimation alphaAnimation = new AlphaAnimation(n3, n4);
        alphaAnimation.setInterpolator(h.A);
        alphaAnimation.setDuration(220L);
        set.addAnimation((Animation)alphaAnimation);
        return (Animation)set;
    }
    
    private Animation a(final d d, int windowAnimations, final boolean b, final int n) {
        final int h = d.H;
        d.d();
        Label_0035: {
            if (d.H == 0) {
                break Label_0035;
            }
            final Animation animation = AnimationUtils.loadAnimation((Context)this.o, d.H);
            if (animation == null) {
                break Label_0035;
            }
            return animation;
        }
        if (windowAnimations == 0) {
            return null;
        }
        final int n2 = -1;
        switch (windowAnimations) {
            default: {
                windowAnimations = n2;
                break;
            }
            case 4097: {
                if (b) {
                    windowAnimations = 1;
                    break;
                }
                windowAnimations = 2;
                break;
            }
            case 8194: {
                if (b) {
                    windowAnimations = 3;
                    break;
                }
                windowAnimations = 4;
                break;
            }
            case 4099: {
                if (b) {
                    windowAnimations = 5;
                    break;
                }
                windowAnimations = 6;
                break;
            }
        }
        if (windowAnimations < 0) {
            return null;
        }
        switch (windowAnimations) {
            default: {
                windowAnimations = n;
                if (n == 0) {
                    windowAnimations = n;
                    if (this.o.getWindow() != null) {
                        windowAnimations = this.o.getWindow().getAttributes().windowAnimations;
                    }
                }
                if (windowAnimations == 0) {
                    return null;
                }
                return null;
            }
            case 1: {
                return a(1.125f, 1.0f, 0.0f, 1.0f);
            }
            case 2: {
                return a(1.0f, 0.975f, 1.0f, 0.0f);
            }
            case 3: {
                return a(0.975f, 1.0f, 0.0f, 1.0f);
            }
            case 4: {
                return a(1.0f, 1.075f, 1.0f, 0.0f);
            }
            case 5: {
                return a(0.0f, 1.0f);
            }
            case 6: {
                return a(1.0f, 0.0f);
            }
        }
    }
    
    private void a(final int i, final c c) {
        synchronized (this) {
            if (this.k == null) {
                this.k = new ArrayList<c>();
            }
            int j;
            if (i < (j = this.k.size())) {
                if (android.support.v4.app.h.a) {
                    Log.v("FragmentManager", "Setting back stack index " + i + " to " + c);
                }
                this.k.set(i, c);
            }
            else {
                while (j < i) {
                    this.k.add(null);
                    if (this.l == null) {
                        this.l = new ArrayList<Integer>();
                    }
                    if (android.support.v4.app.h.a) {
                        Log.v("FragmentManager", "Adding available back stack index " + j);
                    }
                    this.l.add(j);
                    ++j;
                }
                if (android.support.v4.app.h.a) {
                    Log.v("FragmentManager", "Adding back stack index " + i + " with " + c);
                }
                this.k.add(c);
            }
        }
    }
    
    private void a(final d d) {
        this.a(d, this.n, 0, 0, false);
    }
    
    private void a(final RuntimeException ex) {
        Log.e("FragmentManager", ex.getMessage());
        Log.e("FragmentManager", "Activity state:");
        final PrintWriter printWriter = new PrintWriter(new android.support.v4.e.d("FragmentManager"));
        while (true) {
            Label_0075: {
                if (this.o == null) {
                    break Label_0075;
                }
                try {
                    this.o.dump("  ", null, printWriter, new String[0]);
                    throw ex;
                }
                catch (Exception ex2) {
                    Log.e("FragmentManager", "Failed dumping state", (Throwable)ex2);
                    throw ex;
                }
                try {
                    this.a("  ", null, printWriter, new String[0]);
                    continue;
                }
                catch (Exception ex3) {
                    Log.e("FragmentManager", "Failed dumping state", (Throwable)ex3);
                    continue;
                }
            }
            continue;
        }
    }
    
    public static int b(int n) {
        final int n2 = 0;
        switch (n) {
            default: {
                n = n2;
                break;
            }
            case 4097: {
                n = 8194;
                break;
            }
            case 8194: {
                n = 4097;
                break;
            }
            case 4099: {
                n = 4099;
                break;
            }
        }
        return n;
    }
    
    private void b(final d d) {
        if (d.K != null) {
            if (this.x == null) {
                this.x = (SparseArray<Parcelable>)new SparseArray();
            }
            else {
                this.x.clear();
            }
            d.K.saveHierarchyState((SparseArray)this.x);
            if (this.x.size() > 0) {
                d.f = this.x;
                this.x = null;
            }
        }
    }
    
    private d c(final int n) {
        if (this.g != null) {
            for (int i = this.g.size() - 1; i >= 0; --i) {
                final d d = this.g.get(i);
                if (d != null && d.x == n) {
                    return d;
                }
            }
        }
        Label_0053: {
            break Label_0053;
        }
        if (this.f != null) {
            for (int j = this.f.size() - 1; j >= 0; --j) {
                final d d2 = this.f.get(j);
                if (d2 != null) {
                    final d d = d2;
                    if (d2.x == n) {
                        return d;
                    }
                }
            }
        }
        return null;
    }
    
    private void k() {
        if (this.f != null) {
            for (int i = 0; i < this.f.size(); ++i) {
                final d d = this.f.get(i);
                if (d != null && d.L) {
                    if (this.e) {
                        this.v = true;
                    }
                    else {
                        d.L = false;
                        this.a(d, this.n, 0, 0, false);
                    }
                }
            }
        }
    }
    
    final void a(final int n) {
        this.a(n, 0, 0, false);
    }
    
    final void a(final int n, final int n2, final int n3, final boolean b) {
        if (this.o == null && n != 0) {
            throw new IllegalStateException("No activity");
        }
        if (b || this.n != n) {
            this.n = n;
            if (this.f != null) {
                int i = 0;
                boolean b2 = false;
            Label_0116_Outer:
                while (i < this.f.size()) {
                    final d d = this.f.get(i);
                    if (d != null) {
                        this.a(d, n, n2, n3, false);
                        if (d.N != null) {
                            b2 |= d.N.a();
                        }
                    }
                    while (true) {
                        ++i;
                        continue Label_0116_Outer;
                        continue;
                    }
                }
                if (!b2) {
                    this.k();
                }
                if (this.r && this.o != null && this.n == 5) {
                    final e o = this.o;
                    if (Build$VERSION.SDK_INT >= 11) {
                        b.a(o);
                    }
                    else {
                        o.i = true;
                    }
                    this.r = false;
                }
            }
        }
    }
    
    public final void a(final Configuration configuration) {
        if (this.g != null) {
            for (int i = 0; i < this.g.size(); ++i) {
                final d d = this.g.get(i);
                if (d != null) {
                    d.onConfigurationChanged(configuration);
                    if (d.v != null) {
                        d.v.a(configuration);
                    }
                }
            }
        }
    }
    
    final void a(final Parcelable parcelable, final ArrayList<d> list) {
        if (parcelable != null) {
            final FragmentManagerState fragmentManagerState = (FragmentManagerState)parcelable;
            if (fragmentManagerState.a != null) {
                if (list != null) {
                    for (int i = 0; i < list.size(); ++i) {
                        final d d = list.get(i);
                        if (android.support.v4.app.h.a) {
                            Log.v("FragmentManager", "restoreAllState: re-attaching retained " + d);
                        }
                        final FragmentState fragmentState = fragmentManagerState.a[d.g];
                        fragmentState.k = d;
                        d.f = null;
                        d.s = 0;
                        d.q = false;
                        d.m = false;
                        d.j = null;
                        if (fragmentState.j != null) {
                            fragmentState.j.setClassLoader(this.o.getClassLoader());
                            d.f = (SparseArray<Parcelable>)fragmentState.j.getSparseParcelableArray("android:view_state");
                            d.e = fragmentState.j;
                        }
                    }
                }
                this.f = new ArrayList<d>(fragmentManagerState.a.length);
                if (this.h != null) {
                    this.h.clear();
                }
                for (int j = 0; j < fragmentManagerState.a.length; ++j) {
                    final FragmentState fragmentState2 = fragmentManagerState.a[j];
                    if (fragmentState2 != null) {
                        final e o = this.o;
                        final d q = this.q;
                        if (fragmentState2.k == null) {
                            if (fragmentState2.i != null) {
                                fragmentState2.i.setClassLoader(o.getClassLoader());
                            }
                            fragmentState2.k = android.support.v4.app.d.a((Context)o, fragmentState2.a, fragmentState2.i);
                            if (fragmentState2.j != null) {
                                fragmentState2.j.setClassLoader(o.getClassLoader());
                                fragmentState2.k.e = fragmentState2.j;
                            }
                            fragmentState2.k.a(fragmentState2.b, q);
                            fragmentState2.k.p = fragmentState2.c;
                            fragmentState2.k.r = true;
                            fragmentState2.k.x = fragmentState2.d;
                            fragmentState2.k.y = fragmentState2.e;
                            fragmentState2.k.z = fragmentState2.f;
                            fragmentState2.k.C = fragmentState2.g;
                            fragmentState2.k.B = fragmentState2.h;
                            fragmentState2.k.t = o.b;
                            if (android.support.v4.app.h.a) {
                                Log.v("FragmentManager", "Instantiated fragment " + fragmentState2.k);
                            }
                        }
                        final d k = fragmentState2.k;
                        if (android.support.v4.app.h.a) {
                            Log.v("FragmentManager", "restoreAllState: active #" + j + ": " + k);
                        }
                        this.f.add(k);
                        fragmentState2.k = null;
                    }
                    else {
                        this.f.add(null);
                        if (this.h == null) {
                            this.h = new ArrayList<Integer>();
                        }
                        if (android.support.v4.app.h.a) {
                            Log.v("FragmentManager", "restoreAllState: avail #" + j);
                        }
                        this.h.add(j);
                    }
                }
                if (list != null) {
                    for (int l = 0; l < list.size(); ++l) {
                        final d obj = list.get(l);
                        if (obj.k >= 0) {
                            if (obj.k < this.f.size()) {
                                obj.j = this.f.get(obj.k);
                            }
                            else {
                                Log.w("FragmentManager", "Re-attaching retained fragment " + obj + " target no longer exists: " + obj.k);
                                obj.j = null;
                            }
                        }
                    }
                }
                if (fragmentManagerState.b != null) {
                    this.g = new ArrayList<d>(fragmentManagerState.b.length);
                    for (int m = 0; m < fragmentManagerState.b.length; ++m) {
                        final d e = this.f.get(fragmentManagerState.b[m]);
                        if (e == null) {
                            this.a(new IllegalStateException("No instantiated fragment for index #" + fragmentManagerState.b[m]));
                        }
                        e.m = true;
                        if (android.support.v4.app.h.a) {
                            Log.v("FragmentManager", "restoreAllState: added #" + m + ": " + e);
                        }
                        if (this.g.contains(e)) {
                            throw new IllegalStateException("Already added!");
                        }
                        this.g.add(e);
                    }
                }
                else {
                    this.g = null;
                }
                if (fragmentManagerState.c != null) {
                    this.i = new ArrayList<c>(fragmentManagerState.c.length);
                    for (int i2 = 0; i2 < fragmentManagerState.c.length; ++i2) {
                        final c a = fragmentManagerState.c[i2].a(this);
                        if (android.support.v4.app.h.a) {
                            Log.v("FragmentManager", "restoreAllState: back stack #" + i2 + " (index " + a.o + "): " + a);
                            a.a("  ", new PrintWriter(new android.support.v4.e.d("FragmentManager")), false);
                        }
                        this.i.add(a);
                        if (a.o >= 0) {
                            this.a(a.o, a);
                        }
                    }
                }
                else {
                    this.i = null;
                }
            }
        }
    }
    
    public final void a(final d d, final int n, final int n2) {
        if (android.support.v4.app.h.a) {
            Log.v("FragmentManager", "remove: " + d + " nesting=" + d.s);
        }
        int n3;
        if (d.s > 0) {
            n3 = 1;
        }
        else {
            n3 = 0;
        }
        boolean b;
        if (n3 == 0) {
            b = true;
        }
        else {
            b = false;
        }
        if (!d.B || b) {
            if (this.g != null) {
                this.g.remove(d);
            }
            if (d.E && d.F) {
                this.r = true;
            }
            d.m = false;
            d.n = true;
            int n4;
            if (b) {
                n4 = 0;
            }
            else {
                n4 = 1;
            }
            this.a(d, n4, n, n2, false);
        }
    }
    
    final void a(final d obj, int n, final int n2, final int n3, final boolean b) {
        int n4 = 0;
        Label_0028: {
            if (obj.m) {
                n4 = n;
                if (!obj.B) {
                    break Label_0028;
                }
            }
            if ((n4 = n) > 1) {
                n4 = 1;
            }
        }
        int b2 = n4;
        if (obj.n && (b2 = n4) > obj.b) {
            b2 = obj.b;
        }
        n = b2;
        if (obj.L) {
            n = b2;
            if (obj.b < 4 && (n = b2) > 3) {
                n = 3;
            }
        }
        int b3 = 0;
        Label_0187: {
            if (obj.b < n) {
                if (!obj.p || obj.q) {
                    if (obj.c != null) {
                        obj.c = null;
                        this.a(obj, obj.d, 0, 0, true);
                    }
                    int n5 = n;
                    int n6 = n;
                    int n7 = n;
                    Label_1198: {
                        switch (obj.b) {
                            default: {
                                b3 = n;
                                break Label_0187;
                            }
                            case 0: {
                                if (android.support.v4.app.h.a) {
                                    Log.v("FragmentManager", "moveto CREATED: " + obj);
                                }
                                int n8 = n;
                                if (obj.e != null) {
                                    obj.e.setClassLoader(this.o.getClassLoader());
                                    obj.f = (SparseArray<Parcelable>)obj.e.getSparseParcelableArray("android:view_state");
                                    obj.j = this.a(obj.e, "android:target_state");
                                    if (obj.j != null) {
                                        obj.l = obj.e.getInt("android:target_req_state", 0);
                                    }
                                    obj.M = obj.e.getBoolean("android:user_visible_hint", true);
                                    n8 = n;
                                    if (!obj.M) {
                                        obj.L = true;
                                        if ((n8 = n) > 3) {
                                            n8 = 3;
                                        }
                                    }
                                }
                                obj.u = this.o;
                                obj.w = this.q;
                                h t;
                                if (this.q != null) {
                                    t = this.q.v;
                                }
                                else {
                                    t = this.o.b;
                                }
                                obj.t = t;
                                obj.G = false;
                                if (!(obj.G = true)) {
                                    throw new o("Fragment " + obj + " did not call through to super.onAttach()");
                                }
                                final d w = obj.w;
                                if (!obj.D) {
                                    final Bundle e = obj.e;
                                    if (obj.v != null) {
                                        obj.v.s = false;
                                    }
                                    obj.G = false;
                                    if (!(obj.G = true)) {
                                        throw new o("Fragment " + obj + " did not call through to super.onCreate()");
                                    }
                                    if (e != null) {
                                        final Parcelable parcelable = e.getParcelable("android:support:fragments");
                                        if (parcelable != null) {
                                            if (obj.v == null) {
                                                obj.g();
                                            }
                                            obj.v.a(parcelable, null);
                                            obj.v.d();
                                        }
                                    }
                                }
                                obj.D = false;
                                n5 = n8;
                                if (!obj.p) {
                                    break Label_1198;
                                }
                                final Bundle e2 = obj.e;
                                obj.c();
                                final Bundle e3 = obj.e;
                                obj.J = obj.h();
                                if (obj.J != null) {
                                    obj.K = obj.J;
                                    obj.J = (View)android.support.v4.app.m.a(obj.J);
                                    if (obj.A) {
                                        obj.J.setVisibility(8);
                                    }
                                    final View j = obj.J;
                                    final Bundle e4 = obj.e;
                                    android.support.v4.app.d.e();
                                    n5 = n8;
                                    break Label_1198;
                                }
                                obj.K = null;
                                n5 = n8;
                                break Label_1198;
                            }
                            case 1: {
                                if ((n6 = n5) <= 1) {
                                    break Label_1198;
                                }
                                if (android.support.v4.app.h.a) {
                                    Log.v("FragmentManager", "moveto ACTIVITY_CREATED: " + obj);
                                }
                                if (!obj.p) {
                                    ViewGroup i;
                                    if (obj.y != 0) {
                                        final ViewGroup viewGroup = (ViewGroup)this.p.a(obj.y);
                                        if ((i = viewGroup) == null) {
                                            i = viewGroup;
                                            if (!obj.r) {
                                                final StringBuilder append = new StringBuilder("No view found for id 0x").append(Integer.toHexString(obj.y)).append(" (");
                                                if (obj.u == null) {
                                                    throw new IllegalStateException("Fragment " + obj + " not attached to Activity");
                                                }
                                                this.a(new IllegalArgumentException(append.append(obj.u.getResources().getResourceName(obj.y)).append(") for fragment ").append(obj).toString()));
                                                i = viewGroup;
                                            }
                                        }
                                    }
                                    else {
                                        i = null;
                                    }
                                    obj.I = i;
                                    final Bundle e5 = obj.e;
                                    obj.c();
                                    final Bundle e6 = obj.e;
                                    obj.J = obj.h();
                                    if (obj.J != null) {
                                        obj.K = obj.J;
                                        obj.J = (View)android.support.v4.app.m.a(obj.J);
                                        if (i != null) {
                                            final Animation a = this.a(obj, n2, true, n3);
                                            if (a != null) {
                                                obj.J.startAnimation(a);
                                            }
                                            i.addView(obj.J);
                                        }
                                        if (obj.A) {
                                            obj.J.setVisibility(8);
                                        }
                                        final View k = obj.J;
                                        final Bundle e7 = obj.e;
                                        android.support.v4.app.d.e();
                                    }
                                    else {
                                        obj.K = null;
                                    }
                                }
                                final Bundle e8 = obj.e;
                                if (obj.v != null) {
                                    obj.v.s = false;
                                }
                                obj.G = false;
                                if (!(obj.G = true)) {
                                    throw new o("Fragment " + obj + " did not call through to super.onActivityCreated()");
                                }
                                if (obj.v != null) {
                                    obj.v.e();
                                }
                                if (obj.J != null) {
                                    final Bundle e9 = obj.e;
                                    if (obj.f != null) {
                                        obj.K.restoreHierarchyState((SparseArray)obj.f);
                                        obj.f = null;
                                    }
                                    obj.G = false;
                                    if (!(obj.G = true)) {
                                        throw new o("Fragment " + obj + " did not call through to super.onViewStateRestored()");
                                    }
                                }
                                obj.e = null;
                                n6 = n5;
                                break Label_1198;
                            }
                            case 2:
                            case 3: {
                                if ((n7 = n6) > 3) {
                                    if (android.support.v4.app.h.a) {
                                        Log.v("FragmentManager", "moveto STARTED: " + obj);
                                    }
                                    obj.i();
                                    n7 = n6;
                                }
                            }
                            case 4: {
                                if ((b3 = n7) <= 4) {
                                    break Label_0187;
                                }
                                if (android.support.v4.app.h.a) {
                                    Log.v("FragmentManager", "moveto RESUMED: " + obj);
                                }
                                obj.o = true;
                                if (obj.v != null) {
                                    obj.v.s = false;
                                    obj.v.a();
                                }
                                obj.G = false;
                                if (!(obj.G = true)) {
                                    throw new o("Fragment " + obj + " did not call through to super.onResume()");
                                }
                                if (obj.v != null) {
                                    obj.v.g();
                                    obj.v.a();
                                }
                                obj.e = null;
                                obj.f = null;
                                b3 = n7;
                                break Label_0187;
                            }
                        }
                    }
                }
            }
            else {
                if (obj.b <= (b3 = n)) {
                    break Label_0187;
                }
                while (true) {
                    Label_1707: {
                        switch (obj.b) {
                            default: {
                                b3 = n;
                                break Label_0187;
                            }
                            case 1: {
                                if ((b3 = n) > 0) {
                                    break Label_0187;
                                }
                                if (this.t && obj.c != null) {
                                    final View c = obj.c;
                                    obj.c = null;
                                    c.clearAnimation();
                                }
                                if (obj.c != null) {
                                    obj.d = n;
                                    b3 = 1;
                                    break Label_0187;
                                }
                                if (android.support.v4.app.h.a) {
                                    Log.v("FragmentManager", "movefrom CREATED: " + obj);
                                }
                                if (!obj.D) {
                                    obj.k();
                                }
                                obj.G = false;
                                if (!(obj.G = true)) {
                                    throw new o("Fragment " + obj + " did not call through to super.onDetach()");
                                }
                                b3 = n;
                                if (b) {
                                    break Label_0187;
                                }
                                if (obj.D) {
                                    obj.u = null;
                                    obj.w = null;
                                    obj.t = null;
                                    obj.v = null;
                                    b3 = n;
                                    break Label_0187;
                                }
                                b3 = n;
                                if (obj.g >= 0) {
                                    if (android.support.v4.app.h.a) {
                                        Log.v("FragmentManager", "Freeing fragment index " + obj);
                                    }
                                    this.f.set(obj.g, null);
                                    if (this.h == null) {
                                        this.h = new ArrayList<Integer>();
                                    }
                                    this.h.add(obj.g);
                                    this.o.a(obj.h);
                                    obj.g = -1;
                                    obj.h = null;
                                    obj.m = false;
                                    obj.n = false;
                                    obj.o = false;
                                    obj.p = false;
                                    obj.q = false;
                                    obj.r = false;
                                    obj.s = 0;
                                    obj.t = null;
                                    obj.v = null;
                                    obj.u = null;
                                    obj.x = 0;
                                    obj.y = 0;
                                    obj.z = null;
                                    obj.A = false;
                                    obj.B = false;
                                    obj.D = false;
                                    obj.N = null;
                                    obj.O = false;
                                    obj.P = false;
                                    b3 = n;
                                }
                                break Label_0187;
                            }
                            case 5: {
                                if (n >= 5) {
                                    break Label_1707;
                                }
                                if (android.support.v4.app.h.a) {
                                    Log.v("FragmentManager", "movefrom RESUMED: " + obj);
                                }
                                if (obj.v != null) {
                                    obj.v.a(4);
                                }
                                obj.G = false;
                                if (!(obj.G = true)) {
                                    throw new o("Fragment " + obj + " did not call through to super.onPause()");
                                }
                                obj.o = false;
                                break Label_1707;
                            }
                            case 4: {
                                if (n >= 4) {
                                    break Label_1707;
                                }
                                if (android.support.v4.app.h.a) {
                                    Log.v("FragmentManager", "movefrom STARTED: " + obj);
                                }
                                if (obj.v != null) {
                                    obj.v.h();
                                }
                                obj.G = false;
                                if (!(obj.G = true)) {
                                    throw new o("Fragment " + obj + " did not call through to super.onStop()");
                                }
                                break Label_1707;
                            }
                            case 3: {
                                if (n < 3) {
                                    if (android.support.v4.app.h.a) {
                                        Log.v("FragmentManager", "movefrom STOPPED: " + obj);
                                    }
                                    obj.j();
                                }
                            }
                            case 2: {
                                if (n >= 2) {
                                    continue;
                                }
                                if (android.support.v4.app.h.a) {
                                    Log.v("FragmentManager", "movefrom ACTIVITY_CREATED: " + obj);
                                }
                                if (obj.J != null && !this.o.isFinishing() && obj.f == null) {
                                    this.b(obj);
                                }
                                if (obj.v != null) {
                                    obj.v.a(1);
                                }
                                obj.G = false;
                                if (!(obj.G = true)) {
                                    throw new o("Fragment " + obj + " did not call through to super.onDestroyView()");
                                }
                                if (obj.N != null) {
                                    obj.N.e();
                                }
                                if (obj.J != null && obj.I != null) {
                                    Animation a2;
                                    if (this.n > 0 && !this.t) {
                                        a2 = this.a(obj, n2, false, n3);
                                    }
                                    else {
                                        a2 = null;
                                    }
                                    if (a2 != null) {
                                        obj.c = obj.J;
                                        obj.d = n;
                                        a2.setAnimationListener((Animation$AnimationListener)new Animation$AnimationListener() {
                                            public final void onAnimationEnd(final Animation animation) {
                                                if (obj.c != null) {
                                                    obj.c = null;
                                                    android.support.v4.app.h.this.a(obj, obj.d, 0, 0, false);
                                                }
                                            }
                                            
                                            public final void onAnimationRepeat(final Animation animation) {
                                            }
                                            
                                            public final void onAnimationStart(final Animation animation) {
                                            }
                                        });
                                        obj.J.startAnimation(a2);
                                    }
                                    obj.I.removeView(obj.J);
                                }
                                obj.I = null;
                                obj.J = null;
                                obj.K = null;
                                continue;
                            }
                        }
                    }
                    break;
                }
            }
            return;
        }
        obj.b = b3;
    }
    
    public final void a(final d e, final boolean b) {
        if (this.g == null) {
            this.g = new ArrayList<d>();
        }
        if (android.support.v4.app.h.a) {
            Log.v("FragmentManager", "add: " + e);
        }
        if (e.g < 0) {
            if (this.h == null || this.h.size() <= 0) {
                if (this.f == null) {
                    this.f = new ArrayList<d>();
                }
                e.a(this.f.size(), this.q);
                this.f.add(e);
            }
            else {
                e.a(this.h.remove(this.h.size() - 1), this.q);
                this.f.set(e.g, e);
            }
            if (android.support.v4.app.h.a) {
                Log.v("FragmentManager", "Allocated fragment index " + e);
            }
        }
        if (!e.B) {
            if (this.g.contains(e)) {
                throw new IllegalStateException("Fragment already added: " + e);
            }
            this.g.add(e);
            e.m = true;
            e.n = false;
            if (e.E && e.F) {
                this.r = true;
            }
            if (b) {
                this.a(e);
            }
        }
    }
    
    public final void a(final e o, final f p3, final d q) {
        if (this.o != null) {
            throw new IllegalStateException("Already attached");
        }
        this.o = o;
        this.p = p3;
        this.q = q;
    }
    
    public final void a(final String s, final FileDescriptor fileDescriptor, final PrintWriter printWriter, final String[] array) {
        final int n = 0;
        final String string = s + "    ";
        if (this.f != null) {
            final int size = this.f.size();
            if (size > 0) {
                printWriter.print(s);
                printWriter.print("Active Fragments in ");
                printWriter.print(Integer.toHexString(System.identityHashCode(this)));
                printWriter.println(":");
                for (int i = 0; i < size; ++i) {
                    final d x = this.f.get(i);
                    printWriter.print(s);
                    printWriter.print("  #");
                    printWriter.print(i);
                    printWriter.print(": ");
                    printWriter.println(x);
                    if (x != null) {
                        printWriter.print(string);
                        printWriter.print("mFragmentId=#");
                        printWriter.print(Integer.toHexString(x.x));
                        printWriter.print(" mContainerId=#");
                        printWriter.print(Integer.toHexString(x.y));
                        printWriter.print(" mTag=");
                        printWriter.println(x.z);
                        printWriter.print(string);
                        printWriter.print("mState=");
                        printWriter.print(x.b);
                        printWriter.print(" mIndex=");
                        printWriter.print(x.g);
                        printWriter.print(" mWho=");
                        printWriter.print(x.h);
                        printWriter.print(" mBackStackNesting=");
                        printWriter.println(x.s);
                        printWriter.print(string);
                        printWriter.print("mAdded=");
                        printWriter.print(x.m);
                        printWriter.print(" mRemoving=");
                        printWriter.print(x.n);
                        printWriter.print(" mResumed=");
                        printWriter.print(x.o);
                        printWriter.print(" mFromLayout=");
                        printWriter.print(x.p);
                        printWriter.print(" mInLayout=");
                        printWriter.println(x.q);
                        printWriter.print(string);
                        printWriter.print("mHidden=");
                        printWriter.print(x.A);
                        printWriter.print(" mDetached=");
                        printWriter.print(x.B);
                        printWriter.print(" mMenuVisible=");
                        printWriter.print(x.F);
                        printWriter.print(" mHasMenu=");
                        printWriter.println(x.E);
                        printWriter.print(string);
                        printWriter.print("mRetainInstance=");
                        printWriter.print(x.C);
                        printWriter.print(" mRetaining=");
                        printWriter.print(x.D);
                        printWriter.print(" mUserVisibleHint=");
                        printWriter.println(x.M);
                        if (x.t != null) {
                            printWriter.print(string);
                            printWriter.print("mFragmentManager=");
                            printWriter.println(x.t);
                        }
                        if (x.u != null) {
                            printWriter.print(string);
                            printWriter.print("mActivity=");
                            printWriter.println(x.u);
                        }
                        if (x.w != null) {
                            printWriter.print(string);
                            printWriter.print("mParentFragment=");
                            printWriter.println(x.w);
                        }
                        if (x.i != null) {
                            printWriter.print(string);
                            printWriter.print("mArguments=");
                            printWriter.println(x.i);
                        }
                        if (x.e != null) {
                            printWriter.print(string);
                            printWriter.print("mSavedFragmentState=");
                            printWriter.println(x.e);
                        }
                        if (x.f != null) {
                            printWriter.print(string);
                            printWriter.print("mSavedViewState=");
                            printWriter.println(x.f);
                        }
                        if (x.j != null) {
                            printWriter.print(string);
                            printWriter.print("mTarget=");
                            printWriter.print(x.j);
                            printWriter.print(" mTargetRequestCode=");
                            printWriter.println(x.l);
                        }
                        if (x.H != 0) {
                            printWriter.print(string);
                            printWriter.print("mNextAnim=");
                            printWriter.println(x.H);
                        }
                        if (x.I != null) {
                            printWriter.print(string);
                            printWriter.print("mContainer=");
                            printWriter.println(x.I);
                        }
                        if (x.J != null) {
                            printWriter.print(string);
                            printWriter.print("mView=");
                            printWriter.println(x.J);
                        }
                        if (x.K != null) {
                            printWriter.print(string);
                            printWriter.print("mInnerView=");
                            printWriter.println(x.J);
                        }
                        if (x.c != null) {
                            printWriter.print(string);
                            printWriter.print("mAnimatingAway=");
                            printWriter.println(x.c);
                            printWriter.print(string);
                            printWriter.print("mStateAfterAnimating=");
                            printWriter.println(x.d);
                        }
                        if (x.N != null) {
                            printWriter.print(string);
                            printWriter.println("Loader Manager:");
                            x.N.a(string + "  ", printWriter);
                        }
                        if (x.v != null) {
                            printWriter.print(string);
                            printWriter.println("Child " + x.v + ":");
                            x.v.a(string + "  ", fileDescriptor, printWriter, array);
                        }
                    }
                }
            }
        }
        if (this.g != null) {
            final int size2 = this.g.size();
            if (size2 > 0) {
                printWriter.print(s);
                printWriter.println("Added Fragments:");
                for (int j = 0; j < size2; ++j) {
                    final d d = this.g.get(j);
                    printWriter.print(s);
                    printWriter.print("  #");
                    printWriter.print(j);
                    printWriter.print(": ");
                    printWriter.println(d.toString());
                }
            }
        }
        if (this.j != null) {
            final int size3 = this.j.size();
            if (size3 > 0) {
                printWriter.print(s);
                printWriter.println("Fragments Created Menus:");
                for (int k = 0; k < size3; ++k) {
                    final d d2 = this.j.get(k);
                    printWriter.print(s);
                    printWriter.print("  #");
                    printWriter.print(k);
                    printWriter.print(": ");
                    printWriter.println(d2.toString());
                }
            }
        }
        if (this.i != null) {
            final int size4 = this.i.size();
            if (size4 > 0) {
                printWriter.print(s);
                printWriter.println("Back Stack:");
                for (int l = 0; l < size4; ++l) {
                    final c c = this.i.get(l);
                    printWriter.print(s);
                    printWriter.print("  #");
                    printWriter.print(l);
                    printWriter.print(": ");
                    printWriter.println(c.toString());
                    c.a(string, printWriter);
                }
            }
        }
        synchronized (this) {
            if (this.k != null) {
                final int size5 = this.k.size();
                if (size5 > 0) {
                    printWriter.print(s);
                    printWriter.println("Back Stack Indices:");
                    for (int n2 = 0; n2 < size5; ++n2) {
                        final c x2 = this.k.get(n2);
                        printWriter.print(s);
                        printWriter.print("  #");
                        printWriter.print(n2);
                        printWriter.print(": ");
                        printWriter.println(x2);
                    }
                }
            }
            if (this.l != null && this.l.size() > 0) {
                printWriter.print(s);
                printWriter.print("mAvailBackStackIndices: ");
                printWriter.println(Arrays.toString(this.l.toArray()));
            }
            // monitorexit(this)
            if (this.c != null) {
                final int size6 = this.c.size();
                if (size6 > 0) {
                    printWriter.print(s);
                    printWriter.println("Pending Actions:");
                    for (int n3 = n; n3 < size6; ++n3) {
                        final Runnable x3 = this.c.get(n3);
                        printWriter.print(s);
                        printWriter.print("  #");
                        printWriter.print(n3);
                        printWriter.print(": ");
                        printWriter.println(x3);
                    }
                }
            }
        }
        final String s2;
        printWriter.print(s2);
        printWriter.println("FragmentManager misc state:");
        printWriter.print(s2);
        printWriter.print("  mActivity=");
        printWriter.println(this.o);
        printWriter.print(s2);
        printWriter.print("  mContainer=");
        printWriter.println(this.p);
        if (this.q != null) {
            printWriter.print(s2);
            printWriter.print("  mParent=");
            printWriter.println(this.q);
        }
        printWriter.print(s2);
        printWriter.print("  mCurState=");
        printWriter.print(this.n);
        printWriter.print(" mStateSaved=");
        printWriter.print(this.s);
        printWriter.print(" mDestroyed=");
        printWriter.println(this.t);
        if (this.r) {
            printWriter.print(s2);
            printWriter.print("  mNeedMenuInvalidate=");
            printWriter.println(this.r);
        }
        if (this.u != null) {
            printWriter.print(s2);
            printWriter.print("  mNoTransactionsBecause=");
            printWriter.println(this.u);
        }
        if (this.h != null && this.h.size() > 0) {
            printWriter.print(s2);
            printWriter.print("  mAvailIndices: ");
            printWriter.println(Arrays.toString(this.h.toArray()));
        }
    }
    
    public final boolean a() {
        if (this.e) {
            throw new IllegalStateException("Recursive entry to executePendingTransactions");
        }
        if (Looper.myLooper() != this.o.a.getLooper()) {
            throw new IllegalStateException("Must be called from main thread of process");
        }
        boolean b = false;
        while (true) {
            int size = 0;
            Label_0263: {
                synchronized (this) {
                    if (this.c == null || this.c.size() == 0) {
                        // monitorexit(this)
                        if (this.v) {
                            int i = 0;
                            size = 0;
                            while (i < this.f.size()) {
                                final d d = this.f.get(i);
                                int n = size;
                                if (d != null) {
                                    n = size;
                                    if (d.N != null) {
                                        n = (size | (d.N.a() ? 1 : 0));
                                    }
                                }
                                ++i;
                                size = n;
                            }
                            break Label_0263;
                        }
                        break;
                    }
                    else {
                        size = this.c.size();
                        if (this.d == null || this.d.length < size) {
                            this.d = new Runnable[size];
                        }
                        this.c.toArray(this.d);
                        this.c.clear();
                        this.o.a.removeCallbacks(this.y);
                        // monitorexit(this)
                        this.e = true;
                        for (int j = 0; j < size; ++j) {
                            this.d[j].run();
                            this.d[j] = null;
                        }
                    }
                }
                this.e = false;
                b = true;
                continue;
            }
            if (size == 0) {
                this.v = false;
                this.k();
                break;
            }
            break;
        }
        return b;
    }
    
    public final boolean a(final Menu menu) {
        boolean b2;
        if (this.g != null) {
            int index = 0;
            boolean b = false;
            while (true) {
                b2 = b;
                if (index >= this.g.size()) {
                    break;
                }
                final d d = this.g.get(index);
                boolean b3 = b;
                if (d != null) {
                    boolean b5;
                    if (!d.A) {
                        final boolean b4 = b5 = (d.E && d.F);
                        if (d.v != null) {
                            b5 = (b4 | d.v.a(menu));
                        }
                    }
                    else {
                        b5 = false;
                    }
                    b3 = b;
                    if (b5) {
                        b3 = true;
                    }
                }
                ++index;
                b = b3;
            }
        }
        else {
            b2 = false;
        }
        return b2;
    }
    
    public final boolean a(final Menu menu, final MenuInflater menuInflater) {
        final int n = 0;
        ArrayList<d> j = null;
        ArrayList<d> list = null;
        boolean b2;
        if (this.g != null) {
            int index = 0;
            boolean b = false;
        Label_0152_Outer:
            while (true) {
                j = list;
                b2 = b;
                if (index < this.g.size()) {
                    final d e = this.g.get(index);
                    if (e != null) {
                        boolean b3;
                        if (!e.A) {
                            b3 = ((e.E && e.F) || false);
                            if (e.v != null) {
                                b3 |= e.v.a(menu, menuInflater);
                            }
                        }
                        else {
                            b3 = false;
                        }
                        if (b3) {
                            ArrayList<d> list2;
                            if ((list2 = list) == null) {
                                list2 = new ArrayList<d>();
                            }
                            list2.add(e);
                            b = true;
                            list = list2;
                        }
                    }
                    while (true) {
                        ++index;
                        continue Label_0152_Outer;
                        continue;
                    }
                }
                break;
            }
        }
        else {
            b2 = false;
        }
        if (this.j != null) {
            for (int i = n; i < this.j.size(); ++i) {
                final d o = this.j.get(i);
                if (j == null || !j.contains(o)) {
                    android.support.v4.app.d.f();
                }
            }
        }
        this.j = j;
        return b2;
    }
    
    public final boolean a(final MenuItem menuItem) {
        boolean b = false;
        if (this.g != null) {
            int index = 0;
            while (true) {
                b = b;
                if (index >= this.g.size()) {
                    break;
                }
                final d d = this.g.get(index);
                if (d != null) {
                    int n;
                    if (!d.A && d.v != null && d.v.a(menuItem)) {
                        n = 1;
                    }
                    else {
                        n = 0;
                    }
                    if (n != 0) {
                        b = true;
                        break;
                    }
                }
                ++index;
            }
        }
        return b;
    }
    
    final void b() {
        if (this.m != null) {
            for (int i = 0; i < this.m.size(); ++i) {
                this.m.get(i);
            }
        }
    }
    
    public final void b(final d obj, final int n, final int n2) {
        if (android.support.v4.app.h.a) {
            Log.v("FragmentManager", "hide: " + obj);
        }
        if (!obj.A) {
            obj.A = true;
            if (obj.J != null) {
                final Animation a = this.a(obj, n, false, n2);
                if (a != null) {
                    obj.J.startAnimation(a);
                }
                obj.J.setVisibility(8);
            }
            if (obj.m && obj.E && obj.F) {
                this.r = true;
            }
            android.support.v4.app.d.a();
        }
    }
    
    public final void b(final Menu menu) {
        if (this.g != null) {
            for (int i = 0; i < this.g.size(); ++i) {
                final d d = this.g.get(i);
                if (d != null && !d.A && d.v != null) {
                    d.v.b(menu);
                }
            }
        }
    }
    
    public final boolean b(final MenuItem menuItem) {
        boolean b = false;
        if (this.g != null) {
            int index = 0;
            while (true) {
                b = b;
                if (index >= this.g.size()) {
                    break;
                }
                final d d = this.g.get(index);
                if (d != null) {
                    int n;
                    if (!d.A && d.v != null && d.v.b(menuItem)) {
                        n = 1;
                    }
                    else {
                        n = 0;
                    }
                    if (n != 0) {
                        b = true;
                        break;
                    }
                }
                ++index;
            }
        }
        return b;
    }
    
    final Parcelable c() {
        final BackStackState[] array = null;
        final Parcelable parcelable = null;
        this.a();
        if (android.support.v4.app.h.b) {
            this.s = true;
        }
        Object o = parcelable;
        if (this.f != null) {
            if (this.f.size() <= 0) {
                o = parcelable;
            }
            else {
                final int size = this.f.size();
                final FragmentState[] a = new FragmentState[size];
                int i = 0;
                boolean b = false;
                while (i < size) {
                    final d obj = this.f.get(i);
                    if (obj != null) {
                        if (obj.g < 0) {
                            this.a(new IllegalStateException("Failure saving state: active " + obj + " has cleared index: " + obj.g));
                        }
                        final FragmentState fragmentState = new FragmentState(obj);
                        a[i] = fragmentState;
                        if (obj.b > 0 && fragmentState.j == null) {
                            if (this.w == null) {
                                this.w = new Bundle();
                            }
                            obj.a(this.w);
                            Bundle w;
                            if (!this.w.isEmpty()) {
                                w = this.w;
                                this.w = null;
                            }
                            else {
                                w = null;
                            }
                            if (obj.J != null) {
                                this.b(obj);
                            }
                            Bundle bundle = w;
                            if (obj.f != null) {
                                if ((bundle = w) == null) {
                                    bundle = new Bundle();
                                }
                                bundle.putSparseParcelableArray("android:view_state", (SparseArray)obj.f);
                            }
                            Bundle j = bundle;
                            if (!obj.M) {
                                if ((j = bundle) == null) {
                                    j = new Bundle();
                                }
                                j.putBoolean("android:user_visible_hint", obj.M);
                            }
                            fragmentState.j = j;
                            if (obj.j != null) {
                                if (obj.j.g < 0) {
                                    this.a(new IllegalStateException("Failure saving state: " + obj + " has target not in fragment manager: " + obj.j));
                                }
                                if (fragmentState.j == null) {
                                    fragmentState.j = new Bundle();
                                }
                                final Bundle k = fragmentState.j;
                                final d l = obj.j;
                                if (l.g < 0) {
                                    this.a(new IllegalStateException("Fragment " + l + " is not currently in the FragmentManager"));
                                }
                                k.putInt("android:target_state", l.g);
                                if (obj.l != 0) {
                                    fragmentState.j.putInt("android:target_req_state", obj.l);
                                }
                            }
                        }
                        else {
                            fragmentState.j = obj.e;
                        }
                        if (android.support.v4.app.h.a) {
                            Log.v("FragmentManager", "Saved state of " + obj + ": " + fragmentState.j);
                        }
                        b = true;
                    }
                    ++i;
                }
                if (!b) {
                    o = parcelable;
                    if (android.support.v4.app.h.a) {
                        Log.v("FragmentManager", "saveAllState: no fragments!");
                        o = parcelable;
                    }
                }
                else {
                    int[] b2 = null;
                    Label_0765: {
                        if (this.g != null) {
                            final int size2 = this.g.size();
                            if (size2 > 0) {
                                final int[] array2 = new int[size2];
                                int n = 0;
                                while (true) {
                                    b2 = array2;
                                    if (n >= size2) {
                                        break Label_0765;
                                    }
                                    array2[n] = this.g.get(n).g;
                                    if (array2[n] < 0) {
                                        this.a(new IllegalStateException("Failure saving state: active " + this.g.get(n) + " has cleared index: " + array2[n]));
                                    }
                                    if (android.support.v4.app.h.a) {
                                        Log.v("FragmentManager", "saveAllState: adding fragment #" + n + ": " + this.g.get(n));
                                    }
                                    ++n;
                                }
                            }
                        }
                        b2 = null;
                    }
                    BackStackState[] c = array;
                    if (this.i != null) {
                        final int size3 = this.i.size();
                        c = array;
                        if (size3 > 0) {
                            final BackStackState[] array3 = new BackStackState[size3];
                            int index = 0;
                            while (true) {
                                c = array3;
                                if (index >= size3) {
                                    break;
                                }
                                array3[index] = new BackStackState(this.i.get(index));
                                if (android.support.v4.app.h.a) {
                                    Log.v("FragmentManager", "saveAllState: adding back stack #" + index + ": " + this.i.get(index));
                                }
                                ++index;
                            }
                        }
                    }
                    final FragmentManagerState fragmentManagerState = new FragmentManagerState();
                    fragmentManagerState.a = a;
                    fragmentManagerState.b = b2;
                    fragmentManagerState.c = c;
                    o = fragmentManagerState;
                }
            }
        }
        return (Parcelable)o;
    }
    
    public final void c(final d obj, final int n, final int n2) {
        if (android.support.v4.app.h.a) {
            Log.v("FragmentManager", "show: " + obj);
        }
        if (obj.A) {
            obj.A = false;
            if (obj.J != null) {
                final Animation a = this.a(obj, n, true, n2);
                if (a != null) {
                    obj.J.startAnimation(a);
                }
                obj.J.setVisibility(0);
            }
            if (obj.m && obj.E && obj.F) {
                this.r = true;
            }
            android.support.v4.app.d.a();
        }
    }
    
    public final void d() {
        this.s = false;
        this.a(1);
    }
    
    public final void d(final d o, final int n, final int n2) {
        if (android.support.v4.app.h.a) {
            Log.v("FragmentManager", "detach: " + o);
        }
        if (!o.B) {
            o.B = true;
            if (o.m) {
                if (this.g != null) {
                    if (android.support.v4.app.h.a) {
                        Log.v("FragmentManager", "remove from detach: " + o);
                    }
                    this.g.remove(o);
                }
                if (o.E && o.F) {
                    this.r = true;
                }
                this.a(o, 1, n, n2, o.m = false);
            }
        }
    }
    
    public final void e() {
        this.s = false;
        this.a(2);
    }
    
    public final void e(final d e, final int n, final int n2) {
        if (android.support.v4.app.h.a) {
            Log.v("FragmentManager", "attach: " + e);
        }
        if (e.B) {
            e.B = false;
            if (!e.m) {
                if (this.g == null) {
                    this.g = new ArrayList<d>();
                }
                if (this.g.contains(e)) {
                    throw new IllegalStateException("Fragment already added: " + e);
                }
                if (android.support.v4.app.h.a) {
                    Log.v("FragmentManager", "add from attach: " + e);
                }
                this.g.add(e);
                e.m = true;
                if (e.E && e.F) {
                    this.r = true;
                }
                this.a(e, this.n, n, n2, false);
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
            for (int i = 0; i < this.g.size(); ++i) {
                final d d = this.g.get(i);
                if (d != null) {
                    d.onLowMemory();
                    if (d.v != null) {
                        d.v.j();
                    }
                }
            }
        }
    }
    
    public final View onCreateView(final String anObject, final Context context, final AttributeSet set) {
        final View view = null;
        View j;
        if (!"fragment".equals(anObject)) {
            j = view;
        }
        else {
            String str = set.getAttributeValue((String)null, "class");
            final TypedArray obtainStyledAttributes = context.obtainStyledAttributes(set, android.support.v4.app.h.a.a);
            if (str == null) {
                str = obtainStyledAttributes.getString(0);
            }
            final int resourceId = obtainStyledAttributes.getResourceId(1, -1);
            final String string = obtainStyledAttributes.getString(2);
            obtainStyledAttributes.recycle();
            j = view;
            if (android.support.v4.app.d.b((Context)this.o, str)) {
                d c;
                if (resourceId != -1) {
                    c = this.c(resourceId);
                }
                else {
                    c = null;
                }
                d d = c;
                Label_0172: {
                    if (c == null) {
                        d = c;
                        if (string != null) {
                            if (this.g != null && string != null) {
                                for (int i = this.g.size() - 1; i >= 0; --i) {
                                    d = this.g.get(i);
                                    if (d != null && string.equals(d.z)) {
                                        break Label_0172;
                                    }
                                }
                            }
                            if (this.f != null && string != null) {
                                for (int k = this.f.size() - 1; k >= 0; --k) {
                                    final d d2 = this.f.get(k);
                                    if (d2 != null) {
                                        d = d2;
                                        if (string.equals(d2.z)) {
                                            break Label_0172;
                                        }
                                    }
                                }
                            }
                            d = null;
                        }
                    }
                }
                d c2;
                if ((c2 = d) == null) {
                    c2 = this.c(0);
                }
                if (android.support.v4.app.h.a) {
                    Log.v("FragmentManager", "onCreateView: id=0x" + Integer.toHexString(resourceId) + " fname=" + str + " existing=" + c2);
                }
                d a;
                if (c2 == null) {
                    a = android.support.v4.app.d.a(context, str);
                    a.p = true;
                    int x;
                    if (resourceId != 0) {
                        x = resourceId;
                    }
                    else {
                        x = 0;
                    }
                    a.x = x;
                    a.y = 0;
                    a.z = string;
                    a.q = true;
                    a.t = this;
                    final Bundle e = a.e;
                    this.a(a, a.G = true);
                }
                else {
                    if (c2.q) {
                        throw new IllegalArgumentException(set.getPositionDescription() + ": Duplicate id 0x" + Integer.toHexString(resourceId) + ", tag " + string + ", or parent id 0x" + Integer.toHexString(0) + " with another fragment for " + str);
                    }
                    c2.q = true;
                    if (!c2.D) {
                        final Bundle e2 = c2.e;
                        c2.G = true;
                    }
                    a = c2;
                }
                if (this.n <= 0 && a.p) {
                    this.a(a, 1, 0, 0, false);
                }
                else {
                    this.a(a);
                }
                if (a.J == null) {
                    throw new IllegalStateException("Fragment " + str + " did not create a view.");
                }
                if (resourceId != 0) {
                    a.J.setId(resourceId);
                }
                if (a.J.getTag() == null) {
                    a.J.setTag((Object)string);
                }
                j = a.J;
            }
        }
        return j;
    }
    
    public final String toString() {
        final StringBuilder sb = new StringBuilder(128);
        sb.append("FragmentManager{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" in ");
        if (this.q != null) {
            android.support.v4.e.c.a(this.q, sb);
        }
        else {
            android.support.v4.e.c.a(this.o, sb);
        }
        sb.append("}}");
        return sb.toString();
    }
    
    static final class a
    {
        public static final int[] a;
        
        static {
            a = new int[] { 16842755, 16842960, 16842961 };
        }
    }
}
