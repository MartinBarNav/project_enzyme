package android.support.v4.app;

import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Parcelable;
import android.support.v4.e.c;
import android.support.v4.e.g;
import android.util.SparseArray;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;

public class d implements ComponentCallbacks, View.OnCreateContextMenuListener {
    static final Object a = new Object();
    private static final g<String, Class<?>> aa = new g<>();
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

    public static class a extends RuntimeException {
        public a(String str, Exception exc) {
            super(str, exc);
        }
    }

    public static d a(Context context, String str) {
        return a(context, str, (Bundle) null);
    }

    public static d a(Context context, String str, Bundle bundle) {
        try {
            Class<?> cls = aa.get(str);
            if (cls == null) {
                cls = context.getClassLoader().loadClass(str);
                aa.put(str, cls);
            }
            d dVar = (d) cls.newInstance();
            if (bundle != null) {
                bundle.setClassLoader(dVar.getClass().getClassLoader());
                dVar.i = bundle;
            }
            return dVar;
        } catch (ClassNotFoundException e2) {
            throw new a("Unable to instantiate fragment " + str + ": make sure class name exists, is public, and has an empty constructor that is public", e2);
        } catch (InstantiationException e3) {
            throw new a("Unable to instantiate fragment " + str + ": make sure class name exists, is public, and has an empty constructor that is public", e3);
        } catch (IllegalAccessException e4) {
            throw new a("Unable to instantiate fragment " + str + ": make sure class name exists, is public, and has an empty constructor that is public", e4);
        }
    }

    static boolean b(Context context, String str) {
        try {
            Class<?> cls = aa.get(str);
            if (cls == null) {
                cls = context.getClassLoader().loadClass(str);
                aa.put(str, cls);
            }
            return d.class.isAssignableFrom(cls);
        } catch (ClassNotFoundException e2) {
            return false;
        }
    }

    /* access modifiers changed from: package-private */
    public final void a(int i2, d dVar) {
        this.g = i2;
        if (dVar != null) {
            this.h = dVar.h + ":" + this.g;
        } else {
            this.h = "android:fragment:" + this.g;
        }
    }

    public final boolean equals(Object obj) {
        return super.equals(obj);
    }

    public final int hashCode() {
        return super.hashCode();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(128);
        c.a(this, sb);
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

    public static void a() {
    }

    public static void b() {
    }

    public final LayoutInflater c() {
        LayoutInflater cloneInContext = this.u.getLayoutInflater().cloneInContext(this.u);
        if (this.v == null) {
            g();
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
        cloneInContext.setFactory(this.v);
        return cloneInContext;
    }

    public static Animation d() {
        return null;
    }

    public static void e() {
    }

    public void onConfigurationChanged(Configuration configuration) {
        this.G = true;
    }

    public void onLowMemory() {
        this.G = true;
    }

    public static void f() {
    }

    /* access modifiers changed from: package-private */
    public final void g() {
        this.v = new h();
        this.v.a(this.u, (f) new f() {
            public final View a(int i) {
                if (d.this.J != null) {
                    return d.this.J.findViewById(i);
                }
                throw new IllegalStateException("Fragment does not have a view");
            }

            public final boolean a() {
                return d.this.J != null;
            }
        }, this);
    }

    /* access modifiers changed from: package-private */
    public final View h() {
        if (this.v == null) {
            return null;
        }
        this.v.s = false;
        return null;
    }

    /* access modifiers changed from: package-private */
    public final void i() {
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

    /* access modifiers changed from: package-private */
    public final void a(Bundle bundle) {
        Parcelable c2;
        if (this.v != null && (c2 = this.v.c()) != null) {
            bundle.putParcelable("android:support:fragments", c2);
        }
    }

    /* access modifiers changed from: package-private */
    public final void j() {
        if (this.v != null) {
            this.v.a(2);
        }
        if (this.O) {
            this.O = false;
            if (!this.P) {
                this.P = true;
                this.N = this.u.b(this.h);
            }
            if (this.N == null) {
                return;
            }
            if (!this.u.h) {
                this.N.c();
            } else {
                this.N.d();
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final void k() {
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

    public void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
        this.u.onCreateContextMenu(contextMenu, view, contextMenuInfo);
    }
}
