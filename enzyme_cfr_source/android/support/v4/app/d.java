/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  android.content.ComponentCallbacks
 *  android.content.Context
 *  android.content.res.Configuration
 *  android.os.Bundle
 *  android.os.Parcelable
 *  android.util.SparseArray
 *  android.view.ContextMenu
 *  android.view.ContextMenu$ContextMenuInfo
 *  android.view.LayoutInflater
 *  android.view.LayoutInflater$Factory
 *  android.view.View
 *  android.view.View$OnCreateContextMenuListener
 *  android.view.ViewGroup
 *  android.view.animation.Animation
 */
package android.support.v4.app;

import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Parcelable;
import android.support.v4.app.e;
import android.support.v4.app.f;
import android.support.v4.app.h;
import android.support.v4.app.l;
import android.support.v4.app.n;
import android.support.v4.app.o;
import android.support.v4.e.c;
import android.support.v4.e.g;
import android.util.SparseArray;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;

public class d
implements ComponentCallbacks,
View.OnCreateContextMenuListener {
    static final Object a;
    private static final g<String, Class<?>> aa;
    boolean A;
    boolean B;
    boolean C;
    boolean D;
    boolean E;
    boolean F = true;
    boolean G;
    int H;
    ViewGroup I;
    View J;
    View K;
    boolean L;
    boolean M = true;
    l N;
    boolean O;
    boolean P;
    Object Q = null;
    Object R = a;
    Object S = null;
    Object T = a;
    Object U = null;
    Object V = a;
    Boolean W;
    Boolean X;
    n Y = null;
    n Z = null;
    int b = 0;
    View c;
    int d;
    Bundle e;
    SparseArray<Parcelable> f;
    int g = -1;
    String h;
    Bundle i;
    d j;
    int k = -1;
    int l;
    boolean m;
    boolean n;
    boolean o;
    boolean p;
    boolean q;
    boolean r;
    int s;
    h t;
    e u;
    h v;
    d w;
    int x;
    int y;
    String z;

    static {
        aa = new g();
        a = new Object();
    }

    public static d a(Context context, String string) {
        return android.support.v4.app.d.a(context, string, null);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static d a(Context object, String string, Bundle bundle) {
        try {
            Class<?> class_;
            Class<?> class_2 = class_ = aa.get(string);
            if (class_ == null) {
                class_2 = object.getClassLoader().loadClass(string);
                aa.put(string, class_2);
            }
            object = (d)class_2.newInstance();
            if (bundle != null) {
                bundle.setClassLoader(object.getClass().getClassLoader());
                ((d)object).i = bundle;
            }
            return object;
        }
        catch (ClassNotFoundException classNotFoundException) {
            throw new a("Unable to instantiate fragment " + string + ": make sure class name exists, is public, and has an empty constructor that is public", classNotFoundException);
        }
        catch (InstantiationException instantiationException) {
            throw new a("Unable to instantiate fragment " + string + ": make sure class name exists, is public, and has an empty constructor that is public", instantiationException);
        }
        catch (IllegalAccessException illegalAccessException) {
            throw new a("Unable to instantiate fragment " + string + ": make sure class name exists, is public, and has an empty constructor that is public", illegalAccessException);
        }
    }

    public static void a() {
    }

    public static void b() {
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    static boolean b(Context context, String string) {
        Class<?> class_;
        try {
            Class<?> class_2;
            class_ = class_2 = aa.get(string);
            if (class_2 != null) return d.class.isAssignableFrom(class_);
        }
        catch (ClassNotFoundException classNotFoundException) {
            return false;
        }
        class_ = context.getClassLoader().loadClass(string);
        aa.put(string, class_);
        return d.class.isAssignableFrom(class_);
    }

    public static Animation d() {
        return null;
    }

    public static void e() {
    }

    public static void f() {
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    final void a(int n2, d d2) {
        this.g = n2;
        if (d2 != null) {
            this.h = d2.h + ":" + this.g;
            return;
        }
        this.h = "android:fragment:" + this.g;
    }

    final void a(Bundle bundle) {
        Parcelable parcelable;
        if (this.v != null && (parcelable = this.v.c()) != null) {
            bundle.putParcelable("android:support:fragments", parcelable);
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    public final LayoutInflater c() {
        LayoutInflater layoutInflater = this.u.getLayoutInflater().cloneInContext((Context)this.u);
        if (this.v == null) {
            this.g();
            if (this.b >= 5) {
                this.v.g();
            } else if (this.b >= 4) {
                this.v.f();
            } else if (this.b >= 2) {
                this.v.e();
            } else if (this.b > 0) {
                this.v.d();
            }
        }
        layoutInflater.setFactory((LayoutInflater.Factory)this.v);
        return layoutInflater;
    }

    public final boolean equals(Object object) {
        return super.equals(object);
    }

    final void g() {
        this.v = new h();
        this.v.a(this.u, new f(){

            @Override
            public final View a(int n2) {
                if (d.this.J == null) {
                    throw new IllegalStateException("Fragment does not have a view");
                }
                return d.this.J.findViewById(n2);
            }

            /*
             * Enabled force condition propagation
             * Lifted jumps to return sites
             */
            @Override
            public final boolean a() {
                if (d.this.J == null) return false;
                return true;
            }
        }, this);
    }

    final View h() {
        if (this.v != null) {
            this.v.s = false;
        }
        return null;
    }

    public final int hashCode() {
        return super.hashCode();
    }

    final void i() {
        if (this.v != null) {
            this.v.s = false;
            this.v.a();
        }
        this.G = false;
        this.G = true;
        if (!this.O) {
            this.O = true;
            if (!this.P) {
                this.P = true;
                this.N = this.u.b(this.h);
            }
            if (this.N != null) {
                this.N.b();
            }
        }
        if (!this.G) {
            throw new o("Fragment " + this + " did not call through to super.onStart()");
        }
        if (this.v != null) {
            this.v.f();
        }
        if (this.N != null) {
            this.N.f();
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    final void j() {
        block7: {
            block6: {
                if (this.v != null) {
                    this.v.a(2);
                }
                if (!this.O) break block6;
                this.O = false;
                if (!this.P) {
                    this.P = true;
                    this.N = this.u.b(this.h);
                }
                if (this.N == null) break block6;
                if (this.u.h) break block7;
                this.N.c();
            }
            return;
        }
        this.N.d();
    }

    final void k() {
        if (this.v != null) {
            this.v.i();
        }
        this.G = false;
        this.G = true;
        if (!this.P) {
            this.P = true;
            this.N = this.u.b(this.h);
        }
        if (this.N != null) {
            this.N.g();
        }
        if (!this.G) {
            throw new o("Fragment " + this + " did not call through to super.onDestroy()");
        }
    }

    public void onConfigurationChanged(Configuration configuration) {
        this.G = true;
    }

    public void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
        this.u.onCreateContextMenu(contextMenu, view, contextMenuInfo);
    }

    public void onLowMemory() {
        this.G = true;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder(128);
        android.support.v4.e.c.a(this, stringBuilder);
        if (this.g >= 0) {
            stringBuilder.append(" #");
            stringBuilder.append(this.g);
        }
        if (this.x != 0) {
            stringBuilder.append(" id=0x");
            stringBuilder.append(Integer.toHexString(this.x));
        }
        if (this.z != null) {
            stringBuilder.append(" ");
            stringBuilder.append(this.z);
        }
        stringBuilder.append('}');
        return stringBuilder.toString();
    }

    public static final class a
    extends RuntimeException {
        public a(String string, Exception exception) {
            super(string, exception);
        }
    }
}

