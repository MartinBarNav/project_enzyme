// 
// Decompiled by Procyon v0.5.36
// 

package android.support.v4.app;

import android.support.v4.e.g;
import android.os.Build$VERSION;
import java.io.Writer;
import java.io.PrintWriter;
import android.util.Log;
import android.view.ViewTreeObserver$OnPreDrawListener;
import android.view.ViewGroup;
import java.util.Collection;
import android.support.v4.e.f;
import java.util.Map;
import android.support.v4.e.a;
import android.content.Context;
import android.view.View;
import android.util.SparseArray;
import java.util.ArrayList;

final class c extends i implements Runnable
{
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
    boolean l;
    String m;
    boolean n;
    int o;
    int p;
    CharSequence q;
    int r;
    CharSequence s;
    ArrayList<String> t;
    ArrayList<String> u;
    
    public c(final h a) {
        this.l = true;
        this.o = -1;
        this.a = a;
    }
    
    private b a(final SparseArray<d> sparseArray, final SparseArray<d> sparseArray2, final boolean b) {
        final int n = 0;
        final b b2 = new b();
        b2.d = new View((Context)this.a.o);
        int n2 = 0;
        int n3 = 0;
        int i;
        int n4;
        while (true) {
            i = n;
            n4 = n3;
            if (n2 >= sparseArray.size()) {
                break;
            }
            if (this.a(sparseArray.keyAt(n2), b2, b, sparseArray, sparseArray2)) {
                n3 = 1;
            }
            ++n2;
        }
        while (i < sparseArray2.size()) {
            final int key = sparseArray2.keyAt(i);
            int n5 = n4;
            if (sparseArray.get(key) == null) {
                n5 = n4;
                if (this.a(key, b2, b, sparseArray, sparseArray2)) {
                    n5 = 1;
                }
            }
            ++i;
            n4 = n5;
        }
        b b3 = b2;
        if (n4 == 0) {
            b3 = null;
        }
        return b3;
    }
    
    private android.support.v4.e.a<String, View> a(final b b, final d d, final boolean b2) {
        android.support.v4.e.a<String, View> a2;
        final android.support.v4.e.a<String, View> a = a2 = new android.support.v4.e.a<String, View>();
        if (this.t != null) {
            android.support.v4.app.j.a(a, d.J);
            if (b2) {
                android.support.v4.e.f.a((Map<Object, Object>)a, this.u);
                a2 = a;
            }
            else {
                a2 = a(this.t, this.u, a);
            }
        }
        if (b2) {
            if (d.Y != null) {
                final n y = d.Y;
            }
            this.a(b, a2, false);
        }
        else {
            if (d.Z != null) {
                final n z = d.Z;
            }
            b(b, a2, false);
        }
        return a2;
    }
    
    static /* synthetic */ android.support.v4.e.a a(final c c, final b b, final boolean b2, final d d) {
        final android.support.v4.e.a<Object, Object> a = new android.support.v4.e.a<Object, Object>();
        final View j = d.J;
        Object a2 = a;
        if (j != null) {
            a2 = a;
            if (c.t != null) {
                android.support.v4.app.j.a((Map<String, View>)a, j);
                if (b2) {
                    a2 = a(c.t, c.u, (android.support.v4.e.a<String, View>)a);
                }
                else {
                    f.a(a, c.u);
                    a2 = a;
                }
            }
        }
        if (b2) {
            if (d.Z != null) {
                final n z = d.Z;
            }
            c.a(b, (android.support.v4.e.a<String, View>)a2, true);
        }
        else {
            if (d.Y != null) {
                final n y = d.Y;
            }
            b(b, (android.support.v4.e.a<String, View>)a2, true);
        }
        return (android.support.v4.e.a)a2;
    }
    
    private static android.support.v4.e.a<String, View> a(final ArrayList<String> list, final ArrayList<String> list2, android.support.v4.e.a<String, View> a) {
        if (!a.isEmpty()) {
            final android.support.v4.e.a<Object, Object> a2 = new android.support.v4.e.a<Object, Object>();
            for (int size = list.size(), i = 0; i < size; ++i) {
                final View view = a.get(list.get(i));
                if (view != null) {
                    a2.put(list2.get(i), view);
                }
            }
            a = (android.support.v4.e.a<Object, View>)a2;
        }
        return (android.support.v4.e.a<String, View>)a;
    }
    
    private void a(final b b, final int n, final Object o) {
        if (this.a.g != null) {
            for (int i = 0; i < this.a.g.size(); ++i) {
                final d d = this.a.g.get(i);
                if (d.J != null && d.I != null && d.y == n) {
                    if (d.A) {
                        if (!b.b.contains(d.J)) {
                            android.support.v4.app.j.a(o, d.J, true);
                            b.b.add(d.J);
                        }
                    }
                    else {
                        android.support.v4.app.j.a(o, d.J, false);
                        b.b.remove(d.J);
                    }
                }
            }
        }
    }
    
    private void a(final b b, final android.support.v4.e.a<String, View> a, final boolean b2) {
        int size;
        if (this.u == null) {
            size = 0;
        }
        else {
            size = this.u.size();
        }
        for (int i = 0; i < size; ++i) {
            final String s = this.t.get(i);
            final View view = a.get(this.u.get(i));
            if (view != null) {
                final String a2 = android.support.v4.app.j.a(view);
                if (b2) {
                    a(b.a, s, a2);
                }
                else {
                    a(b.a, a2, s);
                }
            }
        }
    }
    
    static /* synthetic */ void a(final c c, final android.support.v4.e.a a, final b b) {
        if (c.u != null && !a.isEmpty()) {
            final View a2 = a.get(c.u.get(0));
            if (a2 != null) {
                b.c.a = a2;
            }
        }
    }
    
    static /* synthetic */ void a(final d d, final d d2, final boolean b, final android.support.v4.e.a a) {
        n n;
        if (b) {
            n = d2.Y;
        }
        else {
            n = d.Y;
        }
        if (n != null) {
            new ArrayList(a.keySet());
            new ArrayList(a.values());
        }
    }
    
    private static void a(final android.support.v4.e.a<String, String> a, final String s, final String anObject) {
        if (s != null && anObject != null && !s.equals(anObject)) {
            for (int i = 0; i < a.size(); ++i) {
                if (s.equals(a.c(i))) {
                    a.a(i, anObject);
                    return;
                }
            }
            a.put(s, anObject);
        }
    }
    
    private static void a(final SparseArray<d> sparseArray, final d d) {
        if (d != null) {
            final int y = d.y;
            if (y != 0 && !d.A) {
                boolean b;
                if (d.u != null && d.m) {
                    b = true;
                }
                else {
                    b = false;
                }
                if (b && d.J != null && sparseArray.get(y) == null) {
                    sparseArray.put(y, (Object)d);
                }
            }
        }
    }
    
    private boolean a(final int n, final b b, final boolean b2, final SparseArray<d> sparseArray, final SparseArray<d> sparseArray2) {
        final ViewGroup viewGroup = (ViewGroup)this.a.p.a(n);
        boolean b3;
        if (viewGroup == null) {
            b3 = false;
        }
        else {
            final d d = (d)sparseArray2.get(n);
            final d d2 = (d)sparseArray.get(n);
            Object a;
            if (d == null) {
                a = null;
            }
            else {
                Object o;
                if (b2) {
                    if (d.T == android.support.v4.app.d.a) {
                        o = d.S;
                    }
                    else {
                        o = d.T;
                    }
                }
                else {
                    o = d.Q;
                }
                a = android.support.v4.app.j.a(o);
            }
            Object a2;
            if (d == null || d2 == null) {
                a2 = null;
            }
            else {
                Object o2;
                if (b2) {
                    if (d2.V == android.support.v4.app.d.a) {
                        o2 = d2.U;
                    }
                    else {
                        o2 = d2.V;
                    }
                }
                else {
                    o2 = d.U;
                }
                a2 = android.support.v4.app.j.a(o2);
            }
            Object a3;
            if (d2 == null) {
                a3 = null;
            }
            else {
                Object o3;
                if (b2) {
                    if (d2.R == android.support.v4.app.d.a) {
                        o3 = d2.Q;
                    }
                    else {
                        o3 = d2.R;
                    }
                }
                else {
                    o3 = d2.S;
                }
                a3 = android.support.v4.app.j.a(o3);
            }
            if (a == null && a2 == null && a3 == null) {
                b3 = false;
            }
            else {
                Object o4 = null;
                final ArrayList<View> list = new ArrayList<View>();
                if (a2 != null) {
                    final android.support.v4.e.a<String, View> a4 = this.a(b, d2, b2);
                    if (a4.isEmpty()) {
                        list.add(b.d);
                    }
                    else {
                        list.addAll(a4.values());
                    }
                    n n2;
                    if (b2) {
                        n2 = d2.Y;
                    }
                    else {
                        n2 = d.Y;
                    }
                    o4 = a4;
                    if (n2 != null) {
                        new ArrayList(a4.keySet());
                        new ArrayList(a4.values());
                        o4 = a4;
                    }
                }
                final ArrayList<View> list2 = new ArrayList<View>();
                Object a5;
                if ((a5 = a3) != null) {
                    a5 = android.support.v4.app.j.a(a3, d2.J, list2, (Map<String, View>)o4);
                }
                if (this.u != null && o4 != null) {
                    final View view = ((g<Object, View>)o4).get(this.u.get(0));
                    if (view != null) {
                        if (a5 != null) {
                            android.support.v4.app.j.a(a5, view);
                        }
                        if (a2 != null) {
                            android.support.v4.app.j.a(a2, view);
                        }
                    }
                }
                final j.b b4 = new j.b() {
                    @Override
                    public final View a() {
                        return d.J;
                    }
                };
                if (a2 != null) {
                    ((View)viewGroup).getViewTreeObserver().addOnPreDrawListener((ViewTreeObserver$OnPreDrawListener)new ViewTreeObserver$OnPreDrawListener() {
                        final /* synthetic */ View a = (View)viewGroup;
                        final /* synthetic */ ArrayList c = list;
                        
                        public final boolean onPreDraw() {
                            this.a.getViewTreeObserver().removeOnPreDrawListener((ViewTreeObserver$OnPreDrawListener)this);
                            if (a2 != null) {
                                android.support.v4.app.j.a(a2, this.c);
                                this.c.clear();
                                final android.support.v4.e.a a = android.support.v4.app.c.a(android.support.v4.app.c.this, b, b2, d);
                                if (a.isEmpty()) {
                                    this.c.add(b.d);
                                }
                                else {
                                    this.c.addAll(a.values());
                                }
                                android.support.v4.app.j.b(a2, this.c);
                                android.support.v4.app.c.a(android.support.v4.app.c.this, a, b);
                                android.support.v4.app.c.a(d, d2, b2, a);
                            }
                            return true;
                        }
                    });
                }
                final ArrayList<View> list3 = new ArrayList<View>();
                final android.support.v4.e.a<String, View> a6 = new android.support.v4.e.a<String, View>();
                boolean b5;
                if (b2) {
                    b5 = (d.W == null || d.W);
                }
                else {
                    b5 = (d.X == null || d.X);
                }
                final Object a7 = android.support.v4.app.j.a(a, a5, a2, b5);
                if (a7 != null) {
                    android.support.v4.app.j.a(a, a2, (View)viewGroup, (j.b)b4, b.d, b.c, b.a, list3, a6, list);
                    ((View)viewGroup).getViewTreeObserver().addOnPreDrawListener((ViewTreeObserver$OnPreDrawListener)new ViewTreeObserver$OnPreDrawListener() {
                        final /* synthetic */ View a = (View)viewGroup;
                        
                        public final boolean onPreDraw() {
                            this.a.getViewTreeObserver().removeOnPreDrawListener((ViewTreeObserver$OnPreDrawListener)this);
                            android.support.v4.app.c.this.a(b, n, a7);
                            return true;
                        }
                    });
                    android.support.v4.app.j.a(a7, b.d, true);
                    this.a(b, n, a7);
                    android.support.v4.app.j.a(viewGroup, a7);
                    android.support.v4.app.j.a((View)viewGroup, b.d, a, list3, a5, list2, a2, list, a7, b.b, a6);
                }
                b3 = (a7 != null);
            }
        }
        return b3;
    }
    
    private static void b(final b b, final android.support.v4.e.a<String, View> a, final boolean b2) {
        for (int size = a.size(), i = 0; i < size; ++i) {
            final String s = a.b(i);
            final String a2 = j.a(a.c(i));
            if (b2) {
                a(b.a, s, a2);
            }
            else {
                a(b.a, a2, s);
            }
        }
    }
    
    private static void b(final SparseArray<d> sparseArray, final d d) {
        if (d != null) {
            final int y = d.y;
            if (y != 0) {
                sparseArray.put(y, (Object)d);
            }
        }
    }
    
    private void b(final SparseArray<d> sparseArray, final SparseArray<d> sparseArray2) {
        if (this.a.p.a()) {
            for (a a = this.b; a != null; a = a.a) {
                switch (a.c) {
                    case 1: {
                        b(sparseArray2, a.d);
                        break;
                    }
                    case 2: {
                        d d = a.d;
                        d d2;
                        if (this.a.g != null) {
                            int index = 0;
                            while (true) {
                                d2 = d;
                                if (index >= this.a.g.size()) {
                                    break;
                                }
                                final d d3 = this.a.g.get(index);
                                d d4 = null;
                                Label_0178: {
                                    if (d != null) {
                                        d4 = d;
                                        if (d3.y != d.y) {
                                            break Label_0178;
                                        }
                                    }
                                    if (d3 == d) {
                                        d4 = null;
                                    }
                                    else {
                                        a(sparseArray, d3);
                                        d4 = d;
                                    }
                                }
                                ++index;
                                d = d4;
                            }
                        }
                        else {
                            d2 = d;
                        }
                        b(sparseArray2, d2);
                        break;
                    }
                    case 3: {
                        a(sparseArray, a.d);
                        break;
                    }
                    case 4: {
                        a(sparseArray, a.d);
                        break;
                    }
                    case 5: {
                        b(sparseArray2, a.d);
                        break;
                    }
                    case 6: {
                        a(sparseArray, a.d);
                        break;
                    }
                    case 7: {
                        b(sparseArray2, a.d);
                        break;
                    }
                }
            }
        }
    }
    
    public final b a(b b, final SparseArray<d> sparseArray, final SparseArray<d> sparseArray2) {
        if (android.support.v4.app.h.a) {
            Log.v("FragmentManager", "popFromBackStack: " + this);
            this.a("  ", new PrintWriter(new android.support.v4.e.d("FragmentManager")));
        }
        if (sparseArray.size() != 0 || sparseArray2.size() != 0) {
            b = this.a(sparseArray, sparseArray2, true);
        }
        this.a(-1);
        int j;
        if (b != null) {
            j = 0;
        }
        else {
            j = this.j;
        }
        int i;
        if (b != null) {
            i = 0;
        }
        else {
            i = this.i;
        }
        for (a a = this.c; a != null; a = a.b) {
            int g;
            if (b != null) {
                g = 0;
            }
            else {
                g = a.g;
            }
            int h;
            if (b != null) {
                h = 0;
            }
            else {
                h = a.h;
            }
            switch (a.c) {
                default: {
                    throw new IllegalArgumentException("Unknown cmd: " + a.c);
                }
                case 1: {
                    final d d = a.d;
                    d.H = h;
                    this.a.a(d, android.support.v4.app.h.b(i), j);
                    break;
                }
                case 2: {
                    final d d2 = a.d;
                    if (d2 != null) {
                        d2.H = h;
                        this.a.a(d2, android.support.v4.app.h.b(i), j);
                    }
                    if (a.i != null) {
                        for (int k = 0; k < a.i.size(); ++k) {
                            final d d3 = a.i.get(k);
                            d3.H = g;
                            this.a.a(d3, false);
                        }
                        break;
                    }
                    break;
                }
                case 3: {
                    final d d4 = a.d;
                    d4.H = g;
                    this.a.a(d4, false);
                    break;
                }
                case 4: {
                    final d d5 = a.d;
                    d5.H = g;
                    this.a.c(d5, android.support.v4.app.h.b(i), j);
                    break;
                }
                case 5: {
                    final d d6 = a.d;
                    d6.H = h;
                    this.a.b(d6, android.support.v4.app.h.b(i), j);
                    break;
                }
                case 6: {
                    final d d7 = a.d;
                    d7.H = g;
                    this.a.e(d7, android.support.v4.app.h.b(i), j);
                    break;
                }
                case 7: {
                    final d d8 = a.d;
                    d8.H = g;
                    this.a.d(d8, android.support.v4.app.h.b(i), j);
                    break;
                }
            }
        }
        this.a.a(this.a.n, android.support.v4.app.h.b(i), j, true);
        Label_0613: {
            if (this.o < 0) {
                break Label_0613;
            }
            b = (b)this.a;
            final int o = this.o;
            synchronized (b) {
                ((h)b).k.set(o, null);
                if (((h)b).l == null) {
                    ((h)b).l = new ArrayList<Integer>();
                }
                if (android.support.v4.app.h.a) {
                    Log.v("FragmentManager", "Freeing back stack index " + o);
                }
                ((h)b).l.add(o);
                // monitorexit(b)
                this.o = -1;
                return null;
            }
        }
    }
    
    final void a(final int i) {
        if (this.k) {
            if (android.support.v4.app.h.a) {
                Log.v("FragmentManager", "Bump nesting in " + this + " by " + i);
            }
            for (a a = this.b; a != null; a = a.a) {
                if (a.d != null) {
                    final d d = a.d;
                    d.s += i;
                    if (android.support.v4.app.h.a) {
                        Log.v("FragmentManager", "Bump nesting of " + a.d + " to " + a.d.s);
                    }
                }
                if (a.i != null) {
                    for (int j = a.i.size() - 1; j >= 0; --j) {
                        final d obj = a.i.get(j);
                        obj.s += i;
                        if (android.support.v4.app.h.a) {
                            Log.v("FragmentManager", "Bump nesting of " + obj + " to " + obj.s);
                        }
                    }
                }
            }
        }
    }
    
    public final void a(final SparseArray<d> sparseArray, final SparseArray<d> sparseArray2) {
        if (this.a.p.a()) {
            for (a a = this.b; a != null; a = a.a) {
                switch (a.c) {
                    case 1: {
                        a(sparseArray, a.d);
                        break;
                    }
                    case 2: {
                        if (a.i != null) {
                            for (int i = a.i.size() - 1; i >= 0; --i) {
                                b(sparseArray2, a.i.get(i));
                            }
                        }
                        a(sparseArray, a.d);
                        break;
                    }
                    case 3: {
                        b(sparseArray2, a.d);
                        break;
                    }
                    case 4: {
                        b(sparseArray2, a.d);
                        break;
                    }
                    case 5: {
                        a(sparseArray, a.d);
                        break;
                    }
                    case 6: {
                        b(sparseArray2, a.d);
                        break;
                    }
                    case 7: {
                        a(sparseArray, a.d);
                        break;
                    }
                }
            }
        }
    }
    
    public final void a(final String s, final PrintWriter printWriter) {
        this.a(s, printWriter, true);
    }
    
    public final void a(final String s, final PrintWriter printWriter, final boolean b) {
        if (b) {
            printWriter.print(s);
            printWriter.print("mName=");
            printWriter.print(this.m);
            printWriter.print(" mIndex=");
            printWriter.print(this.o);
            printWriter.print(" mCommitted=");
            printWriter.println(this.n);
            if (this.i != 0) {
                printWriter.print(s);
                printWriter.print("mTransition=#");
                printWriter.print(Integer.toHexString(this.i));
                printWriter.print(" mTransitionStyle=#");
                printWriter.println(Integer.toHexString(this.j));
            }
            if (this.e != 0 || this.f != 0) {
                printWriter.print(s);
                printWriter.print("mEnterAnim=#");
                printWriter.print(Integer.toHexString(this.e));
                printWriter.print(" mExitAnim=#");
                printWriter.println(Integer.toHexString(this.f));
            }
            if (this.g != 0 || this.h != 0) {
                printWriter.print(s);
                printWriter.print("mPopEnterAnim=#");
                printWriter.print(Integer.toHexString(this.g));
                printWriter.print(" mPopExitAnim=#");
                printWriter.println(Integer.toHexString(this.h));
            }
            if (this.p != 0 || this.q != null) {
                printWriter.print(s);
                printWriter.print("mBreadCrumbTitleRes=#");
                printWriter.print(Integer.toHexString(this.p));
                printWriter.print(" mBreadCrumbTitleText=");
                printWriter.println(this.q);
            }
            if (this.r != 0 || this.s != null) {
                printWriter.print(s);
                printWriter.print("mBreadCrumbShortTitleRes=#");
                printWriter.print(Integer.toHexString(this.r));
                printWriter.print(" mBreadCrumbShortTitleText=");
                printWriter.println(this.s);
            }
        }
        if (this.b != null) {
            printWriter.print(s);
            printWriter.println("Operations:");
            final String string = s + "    ";
            a a = this.b;
            for (int i = 0; a != null; a = a.a, ++i) {
                String string2 = null;
                switch (a.c) {
                    default: {
                        string2 = "cmd=" + a.c;
                        break;
                    }
                    case 0: {
                        string2 = "NULL";
                        break;
                    }
                    case 1: {
                        string2 = "ADD";
                        break;
                    }
                    case 2: {
                        string2 = "REPLACE";
                        break;
                    }
                    case 3: {
                        string2 = "REMOVE";
                        break;
                    }
                    case 4: {
                        string2 = "HIDE";
                        break;
                    }
                    case 5: {
                        string2 = "SHOW";
                        break;
                    }
                    case 6: {
                        string2 = "DETACH";
                        break;
                    }
                    case 7: {
                        string2 = "ATTACH";
                        break;
                    }
                }
                printWriter.print(s);
                printWriter.print("  Op #");
                printWriter.print(i);
                printWriter.print(": ");
                printWriter.print(string2);
                printWriter.print(" ");
                printWriter.println(a.d);
                if (b) {
                    if (a.e != 0 || a.f != 0) {
                        printWriter.print(s);
                        printWriter.print("enterAnim=#");
                        printWriter.print(Integer.toHexString(a.e));
                        printWriter.print(" exitAnim=#");
                        printWriter.println(Integer.toHexString(a.f));
                    }
                    if (a.g != 0 || a.h != 0) {
                        printWriter.print(s);
                        printWriter.print("popEnterAnim=#");
                        printWriter.print(Integer.toHexString(a.g));
                        printWriter.print(" popExitAnim=#");
                        printWriter.println(Integer.toHexString(a.h));
                    }
                }
                if (a.i != null && a.i.size() > 0) {
                    for (int j = 0; j < a.i.size(); ++j) {
                        printWriter.print(string);
                        if (a.i.size() == 1) {
                            printWriter.print("Removed: ");
                        }
                        else {
                            if (j == 0) {
                                printWriter.println("Removed:");
                            }
                            printWriter.print(string);
                            printWriter.print("  #");
                            printWriter.print(j);
                            printWriter.print(": ");
                        }
                        printWriter.println(a.i.get(j));
                    }
                }
            }
        }
    }
    
    @Override
    public final void run() {
        if (android.support.v4.app.h.a) {
            Log.v("FragmentManager", "Run: " + this);
        }
        if (this.k && this.o < 0) {
            throw new IllegalStateException("addToBackStack() called after commit()");
        }
        this.a(1);
        b a;
        if (Build$VERSION.SDK_INT >= 21) {
            final SparseArray sparseArray = new SparseArray();
            final SparseArray sparseArray2 = new SparseArray();
            this.b((SparseArray<d>)sparseArray, (SparseArray<d>)sparseArray2);
            a = this.a((SparseArray<d>)sparseArray, (SparseArray<d>)sparseArray2, false);
        }
        else {
            a = null;
        }
        int j;
        if (a != null) {
            j = 0;
        }
        else {
            j = this.j;
        }
        int i;
        if (a != null) {
            i = 0;
        }
        else {
            i = this.i;
        }
        for (a a2 = this.b; a2 != null; a2 = a2.a) {
            int e;
            if (a != null) {
                e = 0;
            }
            else {
                e = a2.e;
            }
            int f;
            if (a != null) {
                f = 0;
            }
            else {
                f = a2.f;
            }
            switch (a2.c) {
                default: {
                    throw new IllegalArgumentException("Unknown cmd: " + a2.c);
                }
                case 1: {
                    final d d = a2.d;
                    d.H = e;
                    this.a.a(d, false);
                    break;
                }
                case 2: {
                    d d2 = a2.d;
                    d d3;
                    if (this.a.g != null) {
                        int index = 0;
                        while (true) {
                            d3 = d2;
                            if (index >= this.a.g.size()) {
                                break;
                            }
                            final d obj = this.a.g.get(index);
                            if (android.support.v4.app.h.a) {
                                Log.v("FragmentManager", "OP_REPLACE: adding=" + d2 + " old=" + obj);
                            }
                            d d4 = null;
                            Label_0410: {
                                if (d2 != null) {
                                    d4 = d2;
                                    if (obj.y != d2.y) {
                                        break Label_0410;
                                    }
                                }
                                if (obj == d2) {
                                    a2.d = null;
                                    d4 = null;
                                }
                                else {
                                    if (a2.i == null) {
                                        a2.i = new ArrayList<d>();
                                    }
                                    a2.i.add(obj);
                                    obj.H = f;
                                    if (this.k) {
                                        ++obj.s;
                                        if (android.support.v4.app.h.a) {
                                            Log.v("FragmentManager", "Bump nesting of " + obj + " to " + obj.s);
                                        }
                                    }
                                    this.a.a(obj, i, j);
                                    d4 = d2;
                                }
                            }
                            ++index;
                            d2 = d4;
                        }
                    }
                    else {
                        d3 = d2;
                    }
                    if (d3 != null) {
                        d3.H = e;
                        this.a.a(d3, false);
                        break;
                    }
                    break;
                }
                case 3: {
                    final d d5 = a2.d;
                    d5.H = f;
                    this.a.a(d5, i, j);
                    break;
                }
                case 4: {
                    final d d6 = a2.d;
                    d6.H = f;
                    this.a.b(d6, i, j);
                    break;
                }
                case 5: {
                    final d d7 = a2.d;
                    d7.H = e;
                    this.a.c(d7, i, j);
                    break;
                }
                case 6: {
                    final d d8 = a2.d;
                    d8.H = f;
                    this.a.d(d8, i, j);
                    break;
                }
                case 7: {
                    final d d9 = a2.d;
                    d9.H = e;
                    this.a.e(d9, i, j);
                    break;
                }
            }
        }
        this.a.a(this.a.n, i, j, true);
        if (this.k) {
            final h a3 = this.a;
            if (a3.i == null) {
                a3.i = new ArrayList<c>();
            }
            a3.i.add(this);
            a3.b();
        }
    }
    
    @Override
    public final String toString() {
        final StringBuilder sb = new StringBuilder(128);
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
    
    static final class a
    {
        a a;
        a b;
        int c;
        d d;
        int e;
        int f;
        int g;
        int h;
        ArrayList<d> i;
    }
    
    public final class b
    {
        public android.support.v4.e.a<String, String> a;
        public ArrayList<View> b;
        public j.a c;
        public View d;
        
        public b() {
            this.a = new android.support.v4.e.a<String, String>();
            this.b = new ArrayList<View>();
            this.c = new j.a();
        }
    }
}
