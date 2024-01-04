// 
// Decompiled by Procyon v0.5.36
// 

package android.support.v4.app;

import android.support.v4.e.c;
import android.view.ContextMenu$ContextMenuInfo;
import android.view.ContextMenu;
import android.content.res.Configuration;
import android.view.LayoutInflater$Factory;
import android.view.LayoutInflater;
import android.view.animation.Animation;
import android.content.Context;
import android.os.Parcelable;
import android.util.SparseArray;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.support.v4.e.g;
import android.view.View$OnCreateContextMenuListener;
import android.content.ComponentCallbacks;

public class d implements ComponentCallbacks, View$OnCreateContextMenuListener
{
    static final Object a;
    private static final g<String, Class<?>> aa;
    boolean A;
    boolean B;
    boolean C;
    boolean D;
    boolean E;
    boolean F;
    boolean G;
    int H;
    ViewGroup I;
    View J;
    View K;
    boolean L;
    boolean M;
    l N;
    boolean O;
    boolean P;
    Object Q;
    Object R;
    Object S;
    Object T;
    Object U;
    Object V;
    Boolean W;
    Boolean X;
    n Y;
    n Z;
    int b;
    View c;
    int d;
    Bundle e;
    SparseArray<Parcelable> f;
    int g;
    String h;
    Bundle i;
    d j;
    int k;
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
        aa = new g<String, Class<?>>();
        a = new Object();
    }
    
    public d() {
        this.b = 0;
        this.g = -1;
        this.k = -1;
        this.F = true;
        this.M = true;
        this.Q = null;
        this.R = android.support.v4.app.d.a;
        this.S = null;
        this.T = android.support.v4.app.d.a;
        this.U = null;
        this.V = android.support.v4.app.d.a;
        this.Y = null;
        this.Z = null;
    }
    
    public static d a(final Context context, final String s) {
        return a(context, s, null);
    }
    
    public static d a(final Context context, final String s, final Bundle i) {
        try {
            Class<?> loadClass;
            if ((loadClass = d.aa.get(s)) == null) {
                loadClass = context.getClassLoader().loadClass(s);
                d.aa.put(s, loadClass);
            }
            final d d = (d)loadClass.newInstance();
            if (i != null) {
                i.setClassLoader(d.getClass().getClassLoader());
                d.i = i;
            }
            return d;
        }
        catch (ClassNotFoundException ex) {
            throw new a("Unable to instantiate fragment " + s + ": make sure class name exists, is public, and has an empty constructor that is public", ex);
        }
        catch (InstantiationException ex2) {
            throw new a("Unable to instantiate fragment " + s + ": make sure class name exists, is public, and has an empty constructor that is public", ex2);
        }
        catch (IllegalAccessException ex3) {
            throw new a("Unable to instantiate fragment " + s + ": make sure class name exists, is public, and has an empty constructor that is public", ex3);
        }
    }
    
    public static void a() {
    }
    
    public static void b() {
    }
    
    static boolean b(final Context context, final String name) {
        try {
            Class<?> loadClass;
            if ((loadClass = d.aa.get(name)) == null) {
                loadClass = context.getClassLoader().loadClass(name);
                d.aa.put(name, loadClass);
            }
            return d.class.isAssignableFrom(loadClass);
        }
        catch (ClassNotFoundException ex) {
            return false;
        }
    }
    
    public static Animation d() {
        return null;
    }
    
    public static void e() {
    }
    
    public static void f() {
    }
    
    final void a(final int g, final d d) {
        this.g = g;
        if (d != null) {
            this.h = d.h + ":" + this.g;
        }
        else {
            this.h = "android:fragment:" + this.g;
        }
    }
    
    final void a(final Bundle bundle) {
        if (this.v != null) {
            final Parcelable c = this.v.c();
            if (c != null) {
                bundle.putParcelable("android:support:fragments", c);
            }
        }
    }
    
    public final LayoutInflater c() {
        final LayoutInflater cloneInContext = this.u.getLayoutInflater().cloneInContext((Context)this.u);
        if (this.v == null) {
            this.g();
            if (this.b >= 5) {
                this.v.g();
            }
            else if (this.b >= 4) {
                this.v.f();
            }
            else if (this.b >= 2) {
                this.v.e();
            }
            else if (this.b > 0) {
                this.v.d();
            }
        }
        cloneInContext.setFactory((LayoutInflater$Factory)this.v);
        return cloneInContext;
    }
    
    @Override
    public final boolean equals(final Object obj) {
        return super.equals(obj);
    }
    
    final void g() {
        (this.v = new h()).a(this.u, new f() {
            @Override
            public final View a(final int n) {
                if (android.support.v4.app.d.this.J == null) {
                    throw new IllegalStateException("Fragment does not have a view");
                }
                return android.support.v4.app.d.this.J.findViewById(n);
            }
            
            @Override
            public final boolean a() {
                return android.support.v4.app.d.this.J != null;
            }
        }, this);
    }
    
    final View h() {
        if (this.v != null) {
            this.v.s = false;
        }
        return null;
    }
    
    @Override
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
    
    final void j() {
        if (this.v != null) {
            this.v.a(2);
        }
        if (this.O) {
            this.O = false;
            if (!this.P) {
                this.P = true;
                this.N = this.u.b(this.h);
            }
            if (this.N != null) {
                if (!this.u.h) {
                    this.N.c();
                }
                else {
                    this.N.d();
                }
            }
        }
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
    
    public void onConfigurationChanged(final Configuration configuration) {
        this.G = true;
    }
    
    public void onCreateContextMenu(final ContextMenu contextMenu, final View view, final ContextMenu$ContextMenuInfo contextMenu$ContextMenuInfo) {
        this.u.onCreateContextMenu(contextMenu, view, contextMenu$ContextMenuInfo);
    }
    
    public void onLowMemory() {
        this.G = true;
    }
    
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder(128);
        android.support.v4.e.c.a(this, sb);
        if (this.g >= 0) {
            sb.append(" #");
            sb.append(this.g);
        }
        if (this.x != 0) {
            sb.append(" id=0x");
            sb.append(Integer.toHexString(this.x));
        }
        if (this.z != null) {
            sb.append(" ");
            sb.append(this.z);
        }
        sb.append('}');
        return sb.toString();
    }
    
    public static final class a extends RuntimeException
    {
        public a(final String message, final Exception cause) {
            super(message, cause);
        }
    }
}
