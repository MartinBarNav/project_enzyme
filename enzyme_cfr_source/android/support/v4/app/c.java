/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.os.Build$VERSION
 *  android.util.Log
 *  android.util.SparseArray
 *  android.view.View
 *  android.view.ViewGroup
 *  android.view.ViewTreeObserver$OnPreDrawListener
 */
package android.support.v4.app;

import android.content.Context;
import android.os.Build;
import android.support.v4.app.d;
import android.support.v4.app.h;
import android.support.v4.app.i;
import android.support.v4.app.j;
import android.support.v4.app.n;
import android.support.v4.e.f;
import android.support.v4.e.g;
import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Map;

final class c
extends i
implements Runnable {
    final h a;
    a b;
    a c;
    int d;
    int e;
    int f;
    int g;
    int h;
    int i;
    int j;
    boolean k;
    boolean l = true;
    String m;
    boolean n;
    int o = -1;
    int p;
    CharSequence q;
    int r;
    CharSequence s;
    ArrayList<String> t;
    ArrayList<String> u;

    public c(h h2) {
        this.a = h2;
    }

    private b a(SparseArray<d> object, SparseArray<d> sparseArray, boolean bl) {
        boolean bl2;
        int n2 = 0;
        b b2 = new b();
        b2.d = new View((Context)this.a.o);
        int n3 = 0;
        boolean bl3 = false;
        while (true) {
            bl2 = bl3;
            if (n3 >= object.size()) break;
            if (this.a(object.keyAt(n3), b2, bl, (SparseArray<d>)object, sparseArray)) {
                bl3 = true;
            }
            ++n3;
        }
        for (int i2 = n2; i2 < sparseArray.size(); ++i2) {
            n3 = sparseArray.keyAt(i2);
            bl3 = bl2;
            if (object.get(n3) == null) {
                bl3 = bl2;
                if (this.a(n3, b2, bl, (SparseArray<d>)object, sparseArray)) {
                    bl3 = true;
                }
            }
            bl2 = bl3;
        }
        object = b2;
        if (!bl2) {
            object = null;
        }
        return object;
    }

    /*
     * Enabled aggressive block sorting
     */
    private android.support.v4.e.a<String, View> a(b b2, d object, boolean bl) {
        android.support.v4.e.a<String, View> a2;
        android.support.v4.e.a<String, View> a3 = a2 = new android.support.v4.e.a<String, View>();
        if (this.t != null) {
            android.support.v4.app.j.a(a2, ((d)object).J);
            if (bl) {
                android.support.v4.e.f.a(a2, this.u);
                a3 = a2;
            } else {
                a3 = android.support.v4.app.c.a(this.t, this.u, a2);
            }
        }
        if (bl) {
            if (((d)object).Y != null) {
                object = ((d)object).Y;
            }
            this.a(b2, a3, false);
            return a3;
        }
        if (((d)object).Z != null) {
            object = ((d)object).Z;
        }
        android.support.v4.app.c.b(b2, a3, false);
        return a3;
    }

    /*
     * Enabled aggressive block sorting
     */
    static /* synthetic */ android.support.v4.e.a a(c object, b b2, boolean bl, d object2) {
        android.support.v4.e.a<String, View> a2 = new android.support.v4.e.a<String, View>();
        View view = ((d)object2).J;
        android.support.v4.e.a<String, View> a3 = a2;
        if (view != null) {
            a3 = a2;
            if (((c)object).t != null) {
                android.support.v4.app.j.a(a2, view);
                if (bl) {
                    a3 = android.support.v4.app.c.a(((c)object).t, ((c)object).u, a2);
                } else {
                    android.support.v4.e.f.a(a2, ((c)object).u);
                    a3 = a2;
                }
            }
        }
        if (bl) {
            if (((d)object2).Z != null) {
                object2 = ((d)object2).Z;
            }
            super.a(b2, a3, true);
            return a3;
        }
        if (((d)object2).Y != null) {
            object = ((d)object2).Y;
        }
        android.support.v4.app.c.b(b2, a3, true);
        return a3;
    }

    /*
     * WARNING - void declaration
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private static android.support.v4.e.a<String, View> a(ArrayList<String> arrayList, ArrayList<String> arrayList2, android.support.v4.e.a<String, View> a2) {
        void var2_3;
        if (a2.isEmpty()) {
            return var2_3;
        }
        android.support.v4.e.a<String, View> a3 = new android.support.v4.e.a<String, View>();
        int n2 = arrayList.size();
        for (int i2 = 0; i2 < n2; ++i2) {
            View view = (View)a2.get(arrayList.get(i2));
            if (view == null) continue;
            a3.put(arrayList2.get(i2), view);
        }
        android.support.v4.e.a<String, View> a4 = a3;
        return var2_3;
    }

    /*
     * Enabled aggressive block sorting
     */
    private void a(b b2, int n2, Object object) {
        if (this.a.g != null) {
            for (int i2 = 0; i2 < this.a.g.size(); ++i2) {
                d d2 = this.a.g.get(i2);
                if (d2.J == null || d2.I == null || d2.y != n2) continue;
                if (d2.A) {
                    if (b2.b.contains((Object)d2.J)) continue;
                    android.support.v4.app.j.a(object, d2.J, true);
                    b2.b.add(d2.J);
                    continue;
                }
                android.support.v4.app.j.a(object, d2.J, false);
                b2.b.remove((Object)d2.J);
            }
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    private void a(b b2, android.support.v4.e.a<String, View> a2, boolean bl) {
        if (this.u == null) {
            return;
        }
        int n2 = this.u.size();
        int n3 = 0;
        while (n3 < n2) {
            String string = this.t.get(n3);
            View view = (View)a2.get(this.u.get(n3));
            if (view != null) {
                String string2 = android.support.v4.app.j.a(view);
                if (bl) {
                    android.support.v4.app.c.a(b2.a, string, string2);
                } else {
                    android.support.v4.app.c.a(b2.a, string2, string);
                }
            }
            ++n3;
        }
        return;
    }

    static /* synthetic */ void a(c c2, android.support.v4.e.a a2, b b2) {
        if (c2.u != null && !a2.isEmpty() && (c2 = (View)a2.get(c2.u.get(0))) != null) {
            b2.c.a = c2;
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    static /* synthetic */ void a(d object, d d2, boolean bl, android.support.v4.e.a a2) {
        object = bl ? d2.Y : ((d)object).Y;
        if (object != null) {
            new ArrayList(a2.keySet());
            new ArrayList(a2.values());
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    private static void a(android.support.v4.e.a<String, String> a2, String string, String string2) {
        if (string == null) return;
        if (string2 == null) return;
        if (string.equals(string2)) return;
        int n2 = 0;
        while (true) {
            if (n2 >= a2.size()) {
                a2.put(string, string2);
                return;
            }
            if (string.equals(a2.c(n2))) {
                a2.a(n2, string2);
                return;
            }
            ++n2;
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private static void a(SparseArray<d> sparseArray, d d2) {
        if (d2 == null) return;
        int n2 = d2.y;
        if (n2 == 0) return;
        if (d2.A) return;
        if (d2.u == null) return;
        if (!d2.m) return;
        boolean bl = true;
        if (!bl) return;
        if (d2.J == null) return;
        if (sparseArray.get(n2) != null) return;
        sparseArray.put(n2, (Object)d2);
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     */
    private boolean a(int n2, b b2, boolean bl, SparseArray<d> object, SparseArray<d> object2) {
        void var13_20;
        android.support.v4.e.a<String, View> a2;
        void var5_7;
        Object object3;
        ViewGroup viewGroup = (ViewGroup)this.a.p.a(n2);
        if (viewGroup == null) {
            return false;
        }
        Object object4 = (d)object2.get(n2);
        Object object5 = (d)object.get(n2);
        if (object4 == null) {
            Object var5_6 = null;
        } else {
            object = bl ? (((d)object4).T == android.support.v4.app.d.a ? ((d)object4).S : ((d)object4).T) : ((d)object4).Q;
            Object object6 = android.support.v4.app.j.a(object);
        }
        if (object4 == null || object5 == null) {
            object3 = null;
        } else {
            object = bl ? (((d)object5).V == android.support.v4.app.d.a ? ((d)object5).U : ((d)object5).V) : ((d)object4).U;
            object3 = android.support.v4.app.j.a(object);
        }
        if (object5 == null) {
            object = null;
        } else {
            object = bl ? (((d)object5).R == android.support.v4.app.d.a ? ((d)object5).Q : ((d)object5).R) : ((d)object5).S;
            object = android.support.v4.app.j.a(object);
        }
        if (var5_7 == null && object3 == null && object == null) {
            return false;
        }
        Object object7 = null;
        ArrayList<View> arrayList = new ArrayList<View>();
        if (object3 != null) {
            void var13_17;
            a2 = this.a(b2, (d)object5, bl);
            if (a2.isEmpty()) {
                arrayList.add(b2.d);
            } else {
                arrayList.addAll(a2.values());
            }
            if (bl) {
                n n3 = ((d)object5).Y;
            } else {
                n n4 = ((d)object4).Y;
            }
            object7 = a2;
            if (var13_17 != null) {
                new ArrayList(a2.keySet());
                new ArrayList(a2.values());
                object7 = a2;
            }
        }
        a2 = new ArrayList();
        Object object8 = object;
        if (object != null) {
            Object object9 = android.support.v4.app.j.a(object, ((d)object5).J, (ArrayList<View>)((Object)a2), object7);
        }
        if (this.u != null && object7 != null && (object = (View)((g)object7).get(this.u.get(0))) != null) {
            if (var13_20 != null) {
                android.support.v4.app.j.a((Object)var13_20, object);
            }
            if (object3 != null) {
                android.support.v4.app.j.a(object3, object);
            }
        }
        object = new j.b((d)object4){
            final /* synthetic */ d a;
            {
                this.a = d2;
            }

            @Override
            public final View a() {
                return this.a.J;
            }
        };
        if (object3 != null) {
            viewGroup.getViewTreeObserver().addOnPreDrawListener(new ViewTreeObserver.OnPreDrawListener((View)viewGroup, object3, arrayList, b2, bl, (d)object4, (d)object5){
                final /* synthetic */ View a;
                final /* synthetic */ Object b;
                final /* synthetic */ ArrayList c;
                final /* synthetic */ b d;
                final /* synthetic */ boolean e;
                final /* synthetic */ d f;
                final /* synthetic */ d g;
                {
                    this.a = view;
                    this.b = object;
                    this.c = arrayList;
                    this.d = b2;
                    this.e = bl;
                    this.f = d2;
                    this.g = d3;
                }

                /*
                 * Enabled aggressive block sorting
                 */
                public final boolean onPreDraw() {
                    this.a.getViewTreeObserver().removeOnPreDrawListener((ViewTreeObserver.OnPreDrawListener)this);
                    if (this.b != null) {
                        android.support.v4.app.j.a(this.b, this.c);
                        this.c.clear();
                        android.support.v4.e.a a2 = android.support.v4.app.c.a(c.this, this.d, this.e, this.f);
                        if (a2.isEmpty()) {
                            this.c.add(this.d.d);
                        } else {
                            this.c.addAll(a2.values());
                        }
                        android.support.v4.app.j.b(this.b, this.c);
                        android.support.v4.app.c.a(c.this, a2, this.d);
                        android.support.v4.app.c.a(this.f, this.g, this.e, a2);
                    }
                    return true;
                }
            });
        }
        object5 = new ArrayList();
        object7 = new android.support.v4.e.a();
        bl = bl ? (((d)object4).W == null ? true : ((d)object4).W) : (((d)object4).X == null ? true : ((d)object4).X);
        object4 = android.support.v4.app.j.a((Object)var5_7, var13_20, object3, bl);
        if (object4 != null) {
            android.support.v4.app.j.a(var5_7, object3, (View)viewGroup, (j.b)object, b2.d, b2.c, b2.a, (ArrayList<View>)object5, (Map<String, View>)object7, arrayList);
            viewGroup.getViewTreeObserver().addOnPreDrawListener(new ViewTreeObserver.OnPreDrawListener((View)viewGroup, b2, n2, object4){
                final /* synthetic */ View a;
                final /* synthetic */ b b;
                final /* synthetic */ int c;
                final /* synthetic */ Object d;
                {
                    this.a = view;
                    this.b = b2;
                    this.c = n2;
                    this.d = object;
                }

                public final boolean onPreDraw() {
                    this.a.getViewTreeObserver().removeOnPreDrawListener((ViewTreeObserver.OnPreDrawListener)this);
                    c.this.a(this.b, this.c, this.d);
                    return true;
                }
            });
            android.support.v4.app.j.a(object4, b2.d, true);
            this.a(b2, n2, object4);
            android.support.v4.app.j.a(viewGroup, object4);
            android.support.v4.app.j.a((View)viewGroup, b2.d, var5_7, (ArrayList<View>)object5, var13_20, (ArrayList<View>)((Object)a2), object3, arrayList, object4, b2.b, (Map<String, View>)object7);
        }
        if (object4 == null) return false;
        return true;
    }

    /*
     * Enabled aggressive block sorting
     */
    private static void b(b b2, android.support.v4.e.a<String, View> a2, boolean bl) {
        int n2 = a2.size();
        int n3 = 0;
        while (n3 < n2) {
            String string = (String)a2.b(n3);
            String string2 = android.support.v4.app.j.a((View)a2.c(n3));
            if (bl) {
                android.support.v4.app.c.a(b2.a, string, string2);
            } else {
                android.support.v4.app.c.a(b2.a, string2, string);
            }
            ++n3;
        }
        return;
    }

    private static void b(SparseArray<d> sparseArray, d d2) {
        int n2;
        if (d2 != null && (n2 = d2.y) != 0) {
            sparseArray.put(n2, (Object)d2);
        }
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    private void b(SparseArray<d> var1_1, SparseArray<d> var2_2) {
        block20: {
            if (!this.a.p.a()) {
                return;
            }
            var3_3 = this.b;
            while (var3_3 != null) {
                block21: {
                    switch (var3_3.c) {
                        case 1: {
                            android.support.v4.app.c.b(var2_2, var3_3.d);
                            ** break;
                        }
                        case 2: {
                            var4_4 = var3_3.d;
                            if (this.a.g != null) {
                                var5_5 = 0;
                                break block20;
                            }
                            var6_6 = var4_4;
                            while (true) {
                                android.support.v4.app.c.b(var2_2, var6_6);
                                ** break;
                                break;
                            }
                        }
                        case 3: {
                            android.support.v4.app.c.a(var1_1, var3_3.d);
                            ** break;
                        }
                        case 4: {
                            android.support.v4.app.c.a(var1_1, var3_3.d);
                            ** break;
                        }
                        case 5: {
                            android.support.v4.app.c.b(var2_2, var3_3.d);
                            ** break;
                        }
                        case 6: {
                            android.support.v4.app.c.a(var1_1, var3_3.d);
                        }
lbl29:
                        // 7 sources

                        default: {
                            break block21;
                        }
                        case 7: 
                    }
                    android.support.v4.app.c.b(var2_2, var3_3.d);
                }
                var3_3 = var3_3.a;
            }
            return;
        }
        while (true) {
            block23: {
                block22: {
                    var6_6 = var4_4;
                    if (var5_5 >= this.a.g.size()) ** continue;
                    var7_7 = this.a.g.get(var5_5);
                    if (var4_4 == null) break block22;
                    var6_6 = var4_4;
                    if (var7_7.y != var4_4.y) break block23;
                }
                if (var7_7 == var4_4) {
                    var6_6 = null;
                } else {
                    android.support.v4.app.c.a(var1_1, var7_7);
                    var6_6 = var4_4;
                }
            }
            ++var5_5;
            var4_4 = var6_6;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final b a(b object, SparseArray<d> object2, SparseArray<d> object3) {
        if (android.support.v4.app.h.a) {
            Log.v((String)"FragmentManager", (String)("popFromBackStack: " + this));
            this.a("  ", new PrintWriter(new android.support.v4.e.d("FragmentManager")));
        }
        if (object2.size() != 0 || object3.size() != 0) {
            object = this.a((SparseArray<d>)object2, (SparseArray<d>)object3, true);
        }
        this.a(-1);
        int n2 = object != null ? 0 : this.j;
        int n3 = object != null ? 0 : this.i;
        object2 = this.c;
        while (object2 != null) {
            int n4 = object != null ? 0 : ((a)object2).g;
            int n5 = object != null ? 0 : ((a)object2).h;
            switch (((a)object2).c) {
                default: {
                    throw new IllegalArgumentException("Unknown cmd: " + ((a)object2).c);
                }
                case 1: {
                    object3 = ((a)object2).d;
                    object3.H = n5;
                    this.a.a((d)object3, android.support.v4.app.h.b(n3), n2);
                    break;
                }
                case 2: {
                    object3 = ((a)object2).d;
                    if (object3 != null) {
                        object3.H = n5;
                        this.a.a((d)object3, android.support.v4.app.h.b(n3), n2);
                    }
                    if (((a)object2).i == null) break;
                    for (n5 = 0; n5 < ((a)object2).i.size(); ++n5) {
                        object3 = ((a)object2).i.get(n5);
                        object3.H = n4;
                        this.a.a((d)object3, false);
                    }
                    break;
                }
                case 3: {
                    object3 = ((a)object2).d;
                    object3.H = n4;
                    this.a.a((d)object3, false);
                    break;
                }
                case 4: {
                    object3 = ((a)object2).d;
                    object3.H = n4;
                    this.a.c((d)object3, android.support.v4.app.h.b(n3), n2);
                    break;
                }
                case 5: {
                    object3 = ((a)object2).d;
                    object3.H = n5;
                    this.a.b((d)object3, android.support.v4.app.h.b(n3), n2);
                    break;
                }
                case 6: {
                    object3 = ((a)object2).d;
                    object3.H = n4;
                    this.a.e((d)object3, android.support.v4.app.h.b(n3), n2);
                    break;
                }
                case 7: {
                    object3 = ((a)object2).d;
                    object3.H = n4;
                    this.a.d((d)object3, android.support.v4.app.h.b(n3), n2);
                }
            }
            object2 = ((a)object2).b;
        }
        this.a.a(this.a.n, android.support.v4.app.h.b(n3), n2, true);
        if (this.o >= 0) {
            object = this.a;
            n2 = this.o;
            synchronized (object) {
                ((h)object).k.set(n2, null);
                if (((h)object).l == null) {
                    object2 = new ArrayList();
                    ((h)object).l = object2;
                }
                if (android.support.v4.app.h.a) {
                    object2 = new StringBuilder("Freeing back stack index ");
                    Log.v((String)"FragmentManager", (String)((StringBuilder)object2).append(n2).toString());
                }
                ((h)object).l.add(n2);
            }
            this.o = -1;
        }
        return null;
    }

    /*
     * Enabled aggressive block sorting
     */
    final void a(int n2) {
        if (this.k) {
            if (android.support.v4.app.h.a) {
                Log.v((String)"FragmentManager", (String)("Bump nesting in " + this + " by " + n2));
            }
            a a2 = this.b;
            while (a2 != null) {
                d d2;
                if (a2.d != null) {
                    d2 = a2.d;
                    d2.s += n2;
                    if (android.support.v4.app.h.a) {
                        Log.v((String)"FragmentManager", (String)("Bump nesting of " + a2.d + " to " + a2.d.s));
                    }
                }
                if (a2.i != null) {
                    for (int i2 = a2.i.size() - 1; i2 >= 0; --i2) {
                        d2 = a2.i.get(i2);
                        d2.s += n2;
                        if (!android.support.v4.app.h.a) continue;
                        Log.v((String)"FragmentManager", (String)("Bump nesting of " + d2 + " to " + d2.s));
                    }
                }
                a2 = a2.a;
            }
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    public final void a(SparseArray<d> sparseArray, SparseArray<d> sparseArray2) {
        if (this.a.p.a()) {
            a a2 = this.b;
            while (a2 != null) {
                switch (a2.c) {
                    case 1: {
                        android.support.v4.app.c.a(sparseArray, a2.d);
                        break;
                    }
                    case 2: {
                        if (a2.i != null) {
                            for (int i2 = a2.i.size() - 1; i2 >= 0; --i2) {
                                android.support.v4.app.c.b(sparseArray2, a2.i.get(i2));
                            }
                        }
                        android.support.v4.app.c.a(sparseArray, a2.d);
                        break;
                    }
                    case 3: {
                        android.support.v4.app.c.b(sparseArray2, a2.d);
                        break;
                    }
                    case 4: {
                        android.support.v4.app.c.b(sparseArray2, a2.d);
                        break;
                    }
                    case 5: {
                        android.support.v4.app.c.a(sparseArray, a2.d);
                        break;
                    }
                    case 6: {
                        android.support.v4.app.c.b(sparseArray2, a2.d);
                        break;
                    }
                    case 7: {
                        android.support.v4.app.c.a(sparseArray, a2.d);
                        break;
                    }
                }
                a2 = a2.a;
            }
        }
    }

    public final void a(String string, PrintWriter printWriter) {
        this.a(string, printWriter, true);
    }

    /*
     * Enabled aggressive block sorting
     */
    public final void a(String string, PrintWriter printWriter, boolean bl) {
        if (bl) {
            printWriter.print(string);
            printWriter.print("mName=");
            printWriter.print(this.m);
            printWriter.print(" mIndex=");
            printWriter.print(this.o);
            printWriter.print(" mCommitted=");
            printWriter.println(this.n);
            if (this.i != 0) {
                printWriter.print(string);
                printWriter.print("mTransition=#");
                printWriter.print(Integer.toHexString(this.i));
                printWriter.print(" mTransitionStyle=#");
                printWriter.println(Integer.toHexString(this.j));
            }
            if (this.e != 0 || this.f != 0) {
                printWriter.print(string);
                printWriter.print("mEnterAnim=#");
                printWriter.print(Integer.toHexString(this.e));
                printWriter.print(" mExitAnim=#");
                printWriter.println(Integer.toHexString(this.f));
            }
            if (this.g != 0 || this.h != 0) {
                printWriter.print(string);
                printWriter.print("mPopEnterAnim=#");
                printWriter.print(Integer.toHexString(this.g));
                printWriter.print(" mPopExitAnim=#");
                printWriter.println(Integer.toHexString(this.h));
            }
            if (this.p != 0 || this.q != null) {
                printWriter.print(string);
                printWriter.print("mBreadCrumbTitleRes=#");
                printWriter.print(Integer.toHexString(this.p));
                printWriter.print(" mBreadCrumbTitleText=");
                printWriter.println(this.q);
            }
            if (this.r != 0 || this.s != null) {
                printWriter.print(string);
                printWriter.print("mBreadCrumbShortTitleRes=#");
                printWriter.print(Integer.toHexString(this.r));
                printWriter.print(" mBreadCrumbShortTitleText=");
                printWriter.println(this.s);
            }
        }
        if (this.b != null) {
            printWriter.print(string);
            printWriter.println("Operations:");
            String string2 = string + "    ";
            a a2 = this.b;
            int n2 = 0;
            while (a2 != null) {
                String string3;
                switch (a2.c) {
                    default: {
                        string3 = "cmd=" + a2.c;
                        break;
                    }
                    case 0: {
                        string3 = "NULL";
                        break;
                    }
                    case 1: {
                        string3 = "ADD";
                        break;
                    }
                    case 2: {
                        string3 = "REPLACE";
                        break;
                    }
                    case 3: {
                        string3 = "REMOVE";
                        break;
                    }
                    case 4: {
                        string3 = "HIDE";
                        break;
                    }
                    case 5: {
                        string3 = "SHOW";
                        break;
                    }
                    case 6: {
                        string3 = "DETACH";
                        break;
                    }
                    case 7: {
                        string3 = "ATTACH";
                    }
                }
                printWriter.print(string);
                printWriter.print("  Op #");
                printWriter.print(n2);
                printWriter.print(": ");
                printWriter.print(string3);
                printWriter.print(" ");
                printWriter.println(a2.d);
                if (bl) {
                    if (a2.e != 0 || a2.f != 0) {
                        printWriter.print(string);
                        printWriter.print("enterAnim=#");
                        printWriter.print(Integer.toHexString(a2.e));
                        printWriter.print(" exitAnim=#");
                        printWriter.println(Integer.toHexString(a2.f));
                    }
                    if (a2.g != 0 || a2.h != 0) {
                        printWriter.print(string);
                        printWriter.print("popEnterAnim=#");
                        printWriter.print(Integer.toHexString(a2.g));
                        printWriter.print(" popExitAnim=#");
                        printWriter.println(Integer.toHexString(a2.h));
                    }
                }
                if (a2.i != null && a2.i.size() > 0) {
                    for (int i2 = 0; i2 < a2.i.size(); ++i2) {
                        printWriter.print(string2);
                        if (a2.i.size() == 1) {
                            printWriter.print("Removed: ");
                        } else {
                            if (i2 == 0) {
                                printWriter.println("Removed:");
                            }
                            printWriter.print(string2);
                            printWriter.print("  #");
                            printWriter.print(i2);
                            printWriter.print(": ");
                        }
                        printWriter.println(a2.i.get(i2));
                    }
                }
                a2 = a2.a;
                ++n2;
            }
        }
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    @Override
    public final void run() {
        if (android.support.v4.app.h.a) {
            Log.v((String)"FragmentManager", (String)("Run: " + this));
        }
        if (this.k && this.o < 0) {
            throw new IllegalStateException("addToBackStack() called after commit()");
        }
        this.a(1);
        if (Build.VERSION.SDK_INT >= 21) {
            var1_1 /* !! */  = new SparseArray();
            var2_2 = new SparseArray();
            this.b((SparseArray<d>)var1_1 /* !! */ , (SparseArray<d>)var2_2);
            var1_1 /* !! */  = this.a((SparseArray<d>)var1_1 /* !! */ , (SparseArray<d>)var2_2, false);
        } else {
            var1_1 /* !! */  = null;
        }
        var3_3 = var1_1 /* !! */  != null ? 0 : this.j;
        var4_4 = var1_1 /* !! */  != null ? 0 : this.i;
        var5_5 = this.b;
        block9: while (true) {
            if (var5_5 == null) {
                this.a.a(this.a.n, var4_4, var3_3, true);
                if (this.k == false) return;
                var2_2 = this.a;
                if (var2_2.i == null) {
                    var2_2.i = new ArrayList<E>();
                }
                var2_2.i.add(this);
                var2_2.b();
                return;
            }
            var6_6 = var1_1 /* !! */  != null ? 0 : var5_5.e;
            var7_7 = var1_1 /* !! */  != null ? 0 : var5_5.f;
            block0 : switch (var5_5.c) {
                default: {
                    throw new IllegalArgumentException("Unknown cmd: " + var5_5.c);
                }
                case 1: {
                    var2_2 = var5_5.d;
                    var2_2.H = var6_6;
                    this.a.a((d)var2_2, false);
                    break;
                }
                case 2: {
                    var2_2 = var5_5.d;
                    if (this.a.g != null) {
                        var8_8 = 0;
                        break block9;
                    }
                    var9_9 = var2_2;
                    while (true) {
                        if (var9_9 == null) break block0;
                        var9_9.H = var6_6;
                        this.a.a((d)var9_9, false);
                        break block0;
                        break;
                    }
                }
                case 3: {
                    var2_2 = var5_5.d;
                    var2_2.H = var7_7;
                    this.a.a((d)var2_2, var4_4, var3_3);
                    break;
                }
                case 4: {
                    var2_2 = var5_5.d;
                    var2_2.H = var7_7;
                    this.a.b((d)var2_2, var4_4, var3_3);
                    break;
                }
                case 5: {
                    var2_2 = var5_5.d;
                    var2_2.H = var6_6;
                    this.a.c((d)var2_2, var4_4, var3_3);
                    break;
                }
                case 6: {
                    var2_2 = var5_5.d;
                    var2_2.H = var7_7;
                    this.a.d((d)var2_2, var4_4, var3_3);
                    break;
                }
                case 7: {
                    var2_2 = var5_5.d;
                    var2_2.H = var6_6;
                    this.a.e((d)var2_2, var4_4, var3_3);
                    break;
                }
            }
            var5_5 = var5_5.a;
        }
        while (true) {
            block30: {
                block29: {
                    var9_9 = var2_2;
                    if (var8_8 >= this.a.g.size()) ** continue;
                    var10_10 = this.a.g.get(var8_8);
                    if (android.support.v4.app.h.a) {
                        Log.v((String)"FragmentManager", (String)("OP_REPLACE: adding=" + var2_2 + " old=" + var10_10));
                    }
                    if (var2_2 == null) break block29;
                    var9_9 = var2_2;
                    if (var10_10.y != var2_2.y) break block30;
                }
                if (var10_10 == var2_2) {
                    var5_5.d = null;
                    var9_9 = null;
                } else {
                    if (var5_5.i == null) {
                        var5_5.i = new ArrayList<E>();
                    }
                    var5_5.i.add(var10_10);
                    var10_10.H = var7_7;
                    if (this.k) {
                        ++var10_10.s;
                        if (android.support.v4.app.h.a) {
                            Log.v((String)"FragmentManager", (String)("Bump nesting of " + var10_10 + " to " + var10_10.s));
                        }
                    }
                    this.a.a(var10_10, var4_4, var3_3);
                    var9_9 = var2_2;
                }
            }
            ++var8_8;
            var2_2 = var9_9;
        }
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder(128);
        stringBuilder.append("BackStackEntry{");
        stringBuilder.append(Integer.toHexString(System.identityHashCode(this)));
        if (this.o >= 0) {
            stringBuilder.append(" #");
            stringBuilder.append(this.o);
        }
        if (this.m != null) {
            stringBuilder.append(" ");
            stringBuilder.append(this.m);
        }
        stringBuilder.append("}");
        return stringBuilder.toString();
    }

    static final class a {
        a a;
        a b;
        int c;
        d d;
        int e;
        int f;
        int g;
        int h;
        ArrayList<d> i;

        a() {
        }
    }

    public final class b {
        public android.support.v4.e.a<String, String> a = new android.support.v4.e.a();
        public ArrayList<View> b = new ArrayList();
        public j.a c = new j.a();
        public View d;
    }
}

