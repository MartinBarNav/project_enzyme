package android.support.v4.app;

import android.os.Build;
import android.support.v4.app.j;
import android.support.v4.e.d;
import android.support.v4.e.f;
import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;

final class c extends i implements Runnable {
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

    static /* synthetic */ android.support.v4.e.a a(c cVar, b bVar, boolean z, d dVar) {
        android.support.v4.e.a<String, View> aVar = new android.support.v4.e.a<>();
        View view = dVar.J;
        if (!(view == null || cVar.t == null)) {
            j.a((Map<String, View>) aVar, view);
            if (z) {
                aVar = a(cVar.t, cVar.u, aVar);
            } else {
                f.a(aVar, (Collection<?>) cVar.u);
            }
        }
        if (z) {
            if (dVar.Z != null) {
                n nVar = dVar.Z;
            }
            cVar.a(bVar, aVar, true);
        } else {
            if (dVar.Y != null) {
                n nVar2 = dVar.Y;
            }
            b(bVar, aVar, true);
        }
        return aVar;
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

    public final String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("BackStackEntry{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        if (this.o >= 0) {
            sb.append(" #");
            sb.append(this.o);
        }
        if (this.m != null) {
            sb.append(" ");
            sb.append(this.m);
        }
        sb.append("}");
        return sb.toString();
    }

    public final void a(String str, PrintWriter printWriter) {
        a(str, printWriter, true);
    }

    public final void a(String str, PrintWriter printWriter, boolean z) {
        String str2;
        if (z) {
            printWriter.print(str);
            printWriter.print("mName=");
            printWriter.print(this.m);
            printWriter.print(" mIndex=");
            printWriter.print(this.o);
            printWriter.print(" mCommitted=");
            printWriter.println(this.n);
            if (this.i != 0) {
                printWriter.print(str);
                printWriter.print("mTransition=#");
                printWriter.print(Integer.toHexString(this.i));
                printWriter.print(" mTransitionStyle=#");
                printWriter.println(Integer.toHexString(this.j));
            }
            if (!(this.e == 0 && this.f == 0)) {
                printWriter.print(str);
                printWriter.print("mEnterAnim=#");
                printWriter.print(Integer.toHexString(this.e));
                printWriter.print(" mExitAnim=#");
                printWriter.println(Integer.toHexString(this.f));
            }
            if (!(this.g == 0 && this.h == 0)) {
                printWriter.print(str);
                printWriter.print("mPopEnterAnim=#");
                printWriter.print(Integer.toHexString(this.g));
                printWriter.print(" mPopExitAnim=#");
                printWriter.println(Integer.toHexString(this.h));
            }
            if (!(this.p == 0 && this.q == null)) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbTitleRes=#");
                printWriter.print(Integer.toHexString(this.p));
                printWriter.print(" mBreadCrumbTitleText=");
                printWriter.println(this.q);
            }
            if (!(this.r == 0 && this.s == null)) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbShortTitleRes=#");
                printWriter.print(Integer.toHexString(this.r));
                printWriter.print(" mBreadCrumbShortTitleText=");
                printWriter.println(this.s);
            }
        }
        if (this.b != null) {
            printWriter.print(str);
            printWriter.println("Operations:");
            String str3 = str + "    ";
            int i2 = 0;
            a aVar = this.b;
            while (aVar != null) {
                switch (aVar.c) {
                    case 0:
                        str2 = "NULL";
                        break;
                    case 1:
                        str2 = "ADD";
                        break;
                    case 2:
                        str2 = "REPLACE";
                        break;
                    case 3:
                        str2 = "REMOVE";
                        break;
                    case 4:
                        str2 = "HIDE";
                        break;
                    case 5:
                        str2 = "SHOW";
                        break;
                    case 6:
                        str2 = "DETACH";
                        break;
                    case 7:
                        str2 = "ATTACH";
                        break;
                    default:
                        str2 = "cmd=" + aVar.c;
                        break;
                }
                printWriter.print(str);
                printWriter.print("  Op #");
                printWriter.print(i2);
                printWriter.print(": ");
                printWriter.print(str2);
                printWriter.print(" ");
                printWriter.println(aVar.d);
                if (z) {
                    if (!(aVar.e == 0 && aVar.f == 0)) {
                        printWriter.print(str);
                        printWriter.print("enterAnim=#");
                        printWriter.print(Integer.toHexString(aVar.e));
                        printWriter.print(" exitAnim=#");
                        printWriter.println(Integer.toHexString(aVar.f));
                    }
                    if (!(aVar.g == 0 && aVar.h == 0)) {
                        printWriter.print(str);
                        printWriter.print("popEnterAnim=#");
                        printWriter.print(Integer.toHexString(aVar.g));
                        printWriter.print(" popExitAnim=#");
                        printWriter.println(Integer.toHexString(aVar.h));
                    }
                }
                if (aVar.i != null && aVar.i.size() > 0) {
                    for (int i3 = 0; i3 < aVar.i.size(); i3++) {
                        printWriter.print(str3);
                        if (aVar.i.size() == 1) {
                            printWriter.print("Removed: ");
                        } else {
                            if (i3 == 0) {
                                printWriter.println("Removed:");
                            }
                            printWriter.print(str3);
                            printWriter.print("  #");
                            printWriter.print(i3);
                            printWriter.print(": ");
                        }
                        printWriter.println(aVar.i.get(i3));
                    }
                }
                aVar = aVar.a;
                i2++;
            }
        }
    }

    public c(h hVar) {
        this.a = hVar;
    }

    /* access modifiers changed from: package-private */
    public final void a(int i2) {
        if (this.k) {
            if (h.a) {
                Log.v("FragmentManager", "Bump nesting in " + this + " by " + i2);
            }
            for (a aVar = this.b; aVar != null; aVar = aVar.a) {
                if (aVar.d != null) {
                    aVar.d.s += i2;
                    if (h.a) {
                        Log.v("FragmentManager", "Bump nesting of " + aVar.d + " to " + aVar.d.s);
                    }
                }
                if (aVar.i != null) {
                    for (int size = aVar.i.size() - 1; size >= 0; size--) {
                        d dVar = aVar.i.get(size);
                        dVar.s += i2;
                        if (h.a) {
                            Log.v("FragmentManager", "Bump nesting of " + dVar + " to " + dVar.s);
                        }
                    }
                }
            }
        }
    }

    public final void run() {
        b bVar;
        d dVar;
        if (h.a) {
            Log.v("FragmentManager", "Run: " + this);
        }
        if (!this.k || this.o >= 0) {
            a(1);
            if (Build.VERSION.SDK_INT >= 21) {
                SparseArray sparseArray = new SparseArray();
                SparseArray sparseArray2 = new SparseArray();
                b((SparseArray<d>) sparseArray, (SparseArray<d>) sparseArray2);
                bVar = a((SparseArray<d>) sparseArray, (SparseArray<d>) sparseArray2, false);
            } else {
                bVar = null;
            }
            int i2 = bVar != null ? 0 : this.j;
            int i3 = bVar != null ? 0 : this.i;
            for (a aVar = this.b; aVar != null; aVar = aVar.a) {
                int i4 = bVar != null ? 0 : aVar.e;
                int i5 = bVar != null ? 0 : aVar.f;
                switch (aVar.c) {
                    case 1:
                        d dVar2 = aVar.d;
                        dVar2.H = i4;
                        this.a.a(dVar2, false);
                        break;
                    case 2:
                        d dVar3 = aVar.d;
                        if (this.a.g != null) {
                            dVar = dVar3;
                            for (int i6 = 0; i6 < this.a.g.size(); i6++) {
                                d dVar4 = this.a.g.get(i6);
                                if (h.a) {
                                    Log.v("FragmentManager", "OP_REPLACE: adding=" + dVar + " old=" + dVar4);
                                }
                                if (dVar == null || dVar4.y == dVar.y) {
                                    if (dVar4 == dVar) {
                                        aVar.d = null;
                                        dVar = null;
                                    } else {
                                        if (aVar.i == null) {
                                            aVar.i = new ArrayList<>();
                                        }
                                        aVar.i.add(dVar4);
                                        dVar4.H = i5;
                                        if (this.k) {
                                            dVar4.s++;
                                            if (h.a) {
                                                Log.v("FragmentManager", "Bump nesting of " + dVar4 + " to " + dVar4.s);
                                            }
                                        }
                                        this.a.a(dVar4, i3, i2);
                                    }
                                }
                            }
                        } else {
                            dVar = dVar3;
                        }
                        if (dVar == null) {
                            break;
                        } else {
                            dVar.H = i4;
                            this.a.a(dVar, false);
                            break;
                        }
                    case 3:
                        d dVar5 = aVar.d;
                        dVar5.H = i5;
                        this.a.a(dVar5, i3, i2);
                        break;
                    case 4:
                        d dVar6 = aVar.d;
                        dVar6.H = i5;
                        this.a.b(dVar6, i3, i2);
                        break;
                    case 5:
                        d dVar7 = aVar.d;
                        dVar7.H = i4;
                        this.a.c(dVar7, i3, i2);
                        break;
                    case 6:
                        d dVar8 = aVar.d;
                        dVar8.H = i5;
                        this.a.d(dVar8, i3, i2);
                        break;
                    case 7:
                        d dVar9 = aVar.d;
                        dVar9.H = i4;
                        this.a.e(dVar9, i3, i2);
                        break;
                    default:
                        throw new IllegalArgumentException("Unknown cmd: " + aVar.c);
                }
            }
            this.a.a(this.a.n, i3, i2, true);
            if (this.k) {
                h hVar = this.a;
                if (hVar.i == null) {
                    hVar.i = new ArrayList<>();
                }
                hVar.i.add(this);
                hVar.b();
                return;
            }
            return;
        }
        throw new IllegalStateException("addToBackStack() called after commit()");
    }

    private static void a(SparseArray<d> sparseArray, d dVar) {
        int i2;
        boolean z;
        if (dVar != null && (i2 = dVar.y) != 0 && !dVar.A) {
            if (dVar.u == null || !dVar.m) {
                z = false;
            } else {
                z = true;
            }
            if (z && dVar.J != null && sparseArray.get(i2) == null) {
                sparseArray.put(i2, dVar);
            }
        }
    }

    private static void b(SparseArray<d> sparseArray, d dVar) {
        int i2;
        if (dVar != null && (i2 = dVar.y) != 0) {
            sparseArray.put(i2, dVar);
        }
    }

    private void b(SparseArray<d> sparseArray, SparseArray<d> sparseArray2) {
        d dVar;
        if (this.a.p.a()) {
            for (a aVar = this.b; aVar != null; aVar = aVar.a) {
                switch (aVar.c) {
                    case 1:
                        b(sparseArray2, aVar.d);
                        break;
                    case 2:
                        d dVar2 = aVar.d;
                        if (this.a.g != null) {
                            int i2 = 0;
                            dVar = dVar2;
                            while (true) {
                                int i3 = i2;
                                if (i3 < this.a.g.size()) {
                                    d dVar3 = this.a.g.get(i3);
                                    if (dVar == null || dVar3.y == dVar.y) {
                                        if (dVar3 == dVar) {
                                            dVar = null;
                                        } else {
                                            a(sparseArray, dVar3);
                                        }
                                    }
                                    i2 = i3 + 1;
                                }
                            }
                        } else {
                            dVar = dVar2;
                        }
                        b(sparseArray2, dVar);
                        break;
                    case 3:
                        a(sparseArray, aVar.d);
                        break;
                    case 4:
                        a(sparseArray, aVar.d);
                        break;
                    case 5:
                        b(sparseArray2, aVar.d);
                        break;
                    case 6:
                        a(sparseArray, aVar.d);
                        break;
                    case 7:
                        b(sparseArray2, aVar.d);
                        break;
                }
            }
        }
    }

    public final void a(SparseArray<d> sparseArray, SparseArray<d> sparseArray2) {
        if (this.a.p.a()) {
            for (a aVar = this.b; aVar != null; aVar = aVar.a) {
                switch (aVar.c) {
                    case 1:
                        a(sparseArray, aVar.d);
                        break;
                    case 2:
                        if (aVar.i != null) {
                            for (int size = aVar.i.size() - 1; size >= 0; size--) {
                                b(sparseArray2, aVar.i.get(size));
                            }
                        }
                        a(sparseArray, aVar.d);
                        break;
                    case 3:
                        b(sparseArray2, aVar.d);
                        break;
                    case 4:
                        b(sparseArray2, aVar.d);
                        break;
                    case 5:
                        a(sparseArray, aVar.d);
                        break;
                    case 6:
                        b(sparseArray2, aVar.d);
                        break;
                    case 7:
                        a(sparseArray, aVar.d);
                        break;
                }
            }
        }
    }

    public final b a(b bVar, SparseArray<d> sparseArray, SparseArray<d> sparseArray2) {
        if (h.a) {
            Log.v("FragmentManager", "popFromBackStack: " + this);
            a("  ", new PrintWriter(new d("FragmentManager")));
        }
        if (!(sparseArray.size() == 0 && sparseArray2.size() == 0)) {
            bVar = a(sparseArray, sparseArray2, true);
        }
        a(-1);
        int i2 = bVar != null ? 0 : this.j;
        int i3 = bVar != null ? 0 : this.i;
        for (a aVar = this.c; aVar != null; aVar = aVar.b) {
            int i4 = bVar != null ? 0 : aVar.g;
            int i5 = bVar != null ? 0 : aVar.h;
            switch (aVar.c) {
                case 1:
                    d dVar = aVar.d;
                    dVar.H = i5;
                    this.a.a(dVar, h.b(i3), i2);
                    break;
                case 2:
                    d dVar2 = aVar.d;
                    if (dVar2 != null) {
                        dVar2.H = i5;
                        this.a.a(dVar2, h.b(i3), i2);
                    }
                    if (aVar.i == null) {
                        break;
                    } else {
                        for (int i6 = 0; i6 < aVar.i.size(); i6++) {
                            d dVar3 = aVar.i.get(i6);
                            dVar3.H = i4;
                            this.a.a(dVar3, false);
                        }
                        break;
                    }
                case 3:
                    d dVar4 = aVar.d;
                    dVar4.H = i4;
                    this.a.a(dVar4, false);
                    break;
                case 4:
                    d dVar5 = aVar.d;
                    dVar5.H = i4;
                    this.a.c(dVar5, h.b(i3), i2);
                    break;
                case 5:
                    d dVar6 = aVar.d;
                    dVar6.H = i5;
                    this.a.b(dVar6, h.b(i3), i2);
                    break;
                case 6:
                    d dVar7 = aVar.d;
                    dVar7.H = i4;
                    this.a.e(dVar7, h.b(i3), i2);
                    break;
                case 7:
                    d dVar8 = aVar.d;
                    dVar8.H = i4;
                    this.a.d(dVar8, h.b(i3), i2);
                    break;
                default:
                    throw new IllegalArgumentException("Unknown cmd: " + aVar.c);
            }
        }
        this.a.a(this.a.n, h.b(i3), i2, true);
        if (this.o >= 0) {
            h hVar = this.a;
            int i7 = this.o;
            synchronized (hVar) {
                hVar.k.set(i7, (Object) null);
                if (hVar.l == null) {
                    hVar.l = new ArrayList<>();
                }
                if (h.a) {
                    Log.v("FragmentManager", "Freeing back stack index " + i7);
                }
                hVar.l.add(Integer.valueOf(i7));
            }
            this.o = -1;
        }
        return null;
    }

    private b a(SparseArray<d> sparseArray, SparseArray<d> sparseArray2, boolean z) {
        boolean z2;
        b bVar = new b();
        bVar.d = new View(this.a.o);
        int i2 = 0;
        boolean z3 = false;
        while (i2 < sparseArray.size()) {
            if (a(sparseArray.keyAt(i2), bVar, z, sparseArray, sparseArray2)) {
                z2 = true;
            } else {
                z2 = z3;
            }
            i2++;
            z3 = z2;
        }
        for (int i3 = 0; i3 < sparseArray2.size(); i3++) {
            int keyAt = sparseArray2.keyAt(i3);
            if (sparseArray.get(keyAt) == null && a(keyAt, bVar, z, sparseArray, sparseArray2)) {
                z3 = true;
            }
        }
        if (!z3) {
            return null;
        }
        return bVar;
    }

    private android.support.v4.e.a<String, View> a(b bVar, d dVar, boolean z) {
        android.support.v4.e.a<String, View> aVar = new android.support.v4.e.a<>();
        if (this.t != null) {
            j.a((Map<String, View>) aVar, dVar.J);
            if (z) {
                f.a(aVar, (Collection<?>) this.u);
            } else {
                aVar = a(this.t, this.u, aVar);
            }
        }
        if (z) {
            if (dVar.Y != null) {
                n nVar = dVar.Y;
            }
            a(bVar, aVar, false);
        } else {
            if (dVar.Z != null) {
                n nVar2 = dVar.Z;
            }
            b(bVar, aVar, false);
        }
        return aVar;
    }

    private boolean a(int i2, b bVar, boolean z, SparseArray<d> sparseArray, SparseArray<d> sparseArray2) {
        Object obj;
        Object a2;
        final Object obj2;
        Object obj3;
        Object a3;
        boolean booleanValue;
        View view;
        Object obj4;
        final ViewGroup viewGroup = (ViewGroup) this.a.p.a(i2);
        if (viewGroup == null) {
            return false;
        }
        final d dVar = sparseArray2.get(i2);
        final d dVar2 = sparseArray.get(i2);
        if (dVar == null) {
            a2 = null;
        } else {
            if (!z) {
                obj = dVar.Q;
            } else if (dVar.T == d.a) {
                obj = dVar.S;
            } else {
                obj = dVar.T;
            }
            a2 = j.a(obj);
        }
        if (dVar == null || dVar2 == null) {
            obj2 = null;
        } else {
            if (!z) {
                obj4 = dVar.U;
            } else if (dVar2.V == d.a) {
                obj4 = dVar2.U;
            } else {
                obj4 = dVar2.V;
            }
            obj2 = j.a(obj4);
        }
        if (dVar2 == null) {
            a3 = null;
        } else {
            if (!z) {
                obj3 = dVar2.S;
            } else if (dVar2.R == d.a) {
                obj3 = dVar2.Q;
            } else {
                obj3 = dVar2.R;
            }
            a3 = j.a(obj3);
        }
        if (a2 == null && obj2 == null && a3 == null) {
            return false;
        }
        android.support.v4.e.a<String, View> aVar = null;
        final ArrayList arrayList = new ArrayList();
        if (obj2 != null) {
            aVar = a(bVar, dVar2, z);
            if (aVar.isEmpty()) {
                arrayList.add(bVar.d);
            } else {
                arrayList.addAll(aVar.values());
            }
            if ((z ? dVar2.Y : dVar.Y) != null) {
                new ArrayList(aVar.keySet());
                new ArrayList(aVar.values());
            }
        }
        ArrayList arrayList2 = new ArrayList();
        if (a3 != null) {
            a3 = j.a(a3, dVar2.J, (ArrayList<View>) arrayList2, (Map<String, View>) aVar);
        }
        if (!(this.u == null || aVar == null || (view = aVar.get(this.u.get(0))) == null)) {
            if (a3 != null) {
                j.a(a3, view);
            }
            if (obj2 != null) {
                j.a(obj2, view);
            }
        }
        AnonymousClass1 r0 = new j.b() {
            public final View a() {
                return dVar.J;
            }
        };
        if (obj2 != null) {
            final b bVar2 = bVar;
            final boolean z2 = z;
            viewGroup.getViewTreeObserver().addOnPreDrawListener(new ViewTreeObserver.OnPreDrawListener() {
                public final boolean onPreDraw() {
                    viewGroup.getViewTreeObserver().removeOnPreDrawListener(this);
                    if (obj2 == null) {
                        return true;
                    }
                    j.a(obj2, (ArrayList<View>) arrayList);
                    arrayList.clear();
                    android.support.v4.e.a a2 = c.a(c.this, bVar2, z2, dVar);
                    if (a2.isEmpty()) {
                        arrayList.add(bVar2.d);
                    } else {
                        arrayList.addAll(a2.values());
                    }
                    j.b(obj2, arrayList);
                    c.a(c.this, a2, bVar2);
                    c.a(dVar, dVar2, z2, a2);
                    return true;
                }
            });
        }
        ArrayList arrayList3 = new ArrayList();
        android.support.v4.e.a aVar2 = new android.support.v4.e.a();
        if (z) {
            booleanValue = dVar.W == null ? true : dVar.W.booleanValue();
        } else {
            booleanValue = dVar.X == null ? true : dVar.X.booleanValue();
        }
        Object a4 = j.a(a2, a3, obj2, booleanValue);
        if (a4 != null) {
            j.a(a2, obj2, viewGroup, r0, bVar.d, bVar.c, bVar.a, arrayList3, aVar2, arrayList);
            final ViewGroup viewGroup2 = viewGroup;
            final b bVar3 = bVar;
            final int i3 = i2;
            final Object obj5 = a4;
            viewGroup.getViewTreeObserver().addOnPreDrawListener(new ViewTreeObserver.OnPreDrawListener() {
                public final boolean onPreDraw() {
                    viewGroup2.getViewTreeObserver().removeOnPreDrawListener(this);
                    c.this.a(bVar3, i3, obj5);
                    return true;
                }
            });
            j.a(a4, bVar.d, true);
            a(bVar, i2, a4);
            j.a(viewGroup, a4);
            j.a(viewGroup, bVar.d, a2, arrayList3, a3, arrayList2, obj2, arrayList, a4, bVar.b, aVar2);
        }
        if (a4 != null) {
            return true;
        }
        return false;
    }

    private static android.support.v4.e.a<String, View> a(ArrayList<String> arrayList, ArrayList<String> arrayList2, android.support.v4.e.a<String, View> aVar) {
        if (aVar.isEmpty()) {
            return aVar;
        }
        android.support.v4.e.a<String, View> aVar2 = new android.support.v4.e.a<>();
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            View view = aVar.get(arrayList.get(i2));
            if (view != null) {
                aVar2.put(arrayList2.get(i2), view);
            }
        }
        return aVar2;
    }

    /* access modifiers changed from: private */
    public void a(b bVar, int i2, Object obj) {
        if (this.a.g != null) {
            for (int i3 = 0; i3 < this.a.g.size(); i3++) {
                d dVar = this.a.g.get(i3);
                if (!(dVar.J == null || dVar.I == null || dVar.y != i2)) {
                    if (!dVar.A) {
                        j.a(obj, dVar.J, false);
                        bVar.b.remove(dVar.J);
                    } else if (!bVar.b.contains(dVar.J)) {
                        j.a(obj, dVar.J, true);
                        bVar.b.add(dVar.J);
                    }
                }
            }
        }
    }

    private static void a(android.support.v4.e.a<String, String> aVar, String str, String str2) {
        if (str != null && str2 != null && !str.equals(str2)) {
            for (int i2 = 0; i2 < aVar.size(); i2++) {
                if (str.equals(aVar.c(i2))) {
                    aVar.a(i2, str2);
                    return;
                }
            }
            aVar.put(str, str2);
        }
    }

    private void a(b bVar, android.support.v4.e.a<String, View> aVar, boolean z) {
        int size = this.u == null ? 0 : this.u.size();
        for (int i2 = 0; i2 < size; i2++) {
            String str = this.t.get(i2);
            View view = aVar.get(this.u.get(i2));
            if (view != null) {
                String a2 = j.a(view);
                if (z) {
                    a(bVar.a, str, a2);
                } else {
                    a(bVar.a, a2, str);
                }
            }
        }
    }

    private static void b(b bVar, android.support.v4.e.a<String, View> aVar, boolean z) {
        int size = aVar.size();
        for (int i2 = 0; i2 < size; i2++) {
            String b2 = aVar.b(i2);
            String a2 = j.a(aVar.c(i2));
            if (z) {
                a(bVar.a, b2, a2);
            } else {
                a(bVar.a, a2, b2);
            }
        }
    }

    public class b {
        public android.support.v4.e.a<String, String> a = new android.support.v4.e.a<>();
        public ArrayList<View> b = new ArrayList<>();
        public j.a c = new j.a();
        public View d;

        public b() {
        }
    }

    static /* synthetic */ void a(c cVar, android.support.v4.e.a aVar, b bVar) {
        View view;
        if (cVar.u != null && !aVar.isEmpty() && (view = (View) aVar.get(cVar.u.get(0))) != null) {
            bVar.c.a = view;
        }
    }

    static /* synthetic */ void a(d dVar, d dVar2, boolean z, android.support.v4.e.a aVar) {
        if ((z ? dVar2.Y : dVar.Y) != null) {
            new ArrayList(aVar.keySet());
            new ArrayList(aVar.values());
        }
    }
}
