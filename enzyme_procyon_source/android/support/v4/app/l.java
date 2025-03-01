// 
// Decompiled by Procyon v0.5.36
// 

package android.support.v4.app;

import android.os.Bundle;
import android.support.v4.content.c;
import java.lang.reflect.Modifier;
import android.util.Log;
import java.io.PrintWriter;
import android.support.v4.e.h;

final class l extends k
{
    static boolean a;
    final h<a> b;
    final h<a> c;
    final String d;
    e e;
    boolean f;
    boolean g;
    
    static {
        l.a = false;
    }
    
    public final void a(final String s, final PrintWriter printWriter) {
        final int n = 0;
        if (this.b.a() > 0) {
            printWriter.print(s);
            printWriter.println("Active Loaders:");
            final String string = s + "    ";
            for (int i = 0; i < this.b.a(); ++i) {
                final a a = this.b.b(i);
                printWriter.print(s);
                printWriter.print("  #");
                printWriter.print(this.b.a(i));
                printWriter.print(": ");
                printWriter.println(a.toString());
                a.a(string, printWriter);
            }
        }
        if (this.c.a() > 0) {
            printWriter.print(s);
            printWriter.println("Inactive Loaders:");
            final String string2 = s + "    ";
            for (int j = n; j < this.c.a(); ++j) {
                final a a2 = this.c.b(j);
                printWriter.print(s);
                printWriter.print("  #");
                printWriter.print(this.c.a(j));
                printWriter.print(": ");
                printWriter.println(a2.toString());
                a2.a(string2, printWriter);
            }
        }
    }
    
    @Override
    public final boolean a() {
        final int a = this.b.a();
        int i = 0;
        boolean b = false;
        while (i < a) {
            final a a2 = this.b.b(i);
            b |= (a2.h && !a2.f);
            ++i;
        }
        return b;
    }
    
    final void b() {
        if (l.a) {
            Log.v("LoaderManager", "Starting in " + this);
        }
        if (this.f) {
            final RuntimeException ex = new RuntimeException("here");
            ex.fillInStackTrace();
            Log.w("LoaderManager", "Called doStart when already started: " + this, (Throwable)ex);
        }
        else {
            this.f = true;
            for (int i = this.b.a() - 1; i >= 0; --i) {
                final a a = this.b.b(i);
                if (a.i && a.j) {
                    a.h = true;
                }
                else if (!a.h) {
                    a.h = true;
                    if (l.a) {
                        Log.v("LoaderManager", "  Starting: " + a);
                    }
                    if (a.d == null && a.c != null) {
                        a.d = a.c.a();
                    }
                    if (a.d != null) {
                        if (a.d.getClass().isMemberClass() && !Modifier.isStatic(a.d.getClass().getModifiers())) {
                            throw new IllegalArgumentException("Object returned from onCreateLoader must not be a non-static inner member class: " + a.d);
                        }
                        if (!a.m) {
                            final c<Object> d = a.d;
                            final int a2 = a.a;
                            if (d.b != null) {
                                throw new IllegalStateException("There is already a listener registered");
                            }
                            d.b = (c.a<Object>)a;
                            d.a = a2;
                            a.m = true;
                        }
                        final c<Object> d2 = a.d;
                        d2.c = true;
                        d2.e = false;
                        d2.d = false;
                    }
                }
            }
        }
    }
    
    final void c() {
        if (l.a) {
            Log.v("LoaderManager", "Stopping in " + this);
        }
        if (!this.f) {
            final RuntimeException ex = new RuntimeException("here");
            ex.fillInStackTrace();
            Log.w("LoaderManager", "Called doStop when not started: " + this, (Throwable)ex);
        }
        else {
            for (int i = this.b.a() - 1; i >= 0; --i) {
                this.b.b(i).a();
            }
            this.f = false;
        }
    }
    
    final void d() {
        if (l.a) {
            Log.v("LoaderManager", "Retaining in " + this);
        }
        if (!this.f) {
            final RuntimeException ex = new RuntimeException("here");
            ex.fillInStackTrace();
            Log.w("LoaderManager", "Called doRetain when not started: " + this, (Throwable)ex);
        }
        else {
            this.g = true;
            this.f = false;
            for (int i = this.b.a() - 1; i >= 0; --i) {
                final a obj = this.b.b(i);
                if (l.a) {
                    Log.v("LoaderManager", "  Retaining: " + obj);
                }
                obj.i = true;
                obj.j = obj.h;
                obj.h = false;
                obj.c = null;
            }
        }
    }
    
    final void e() {
        for (int i = this.b.a() - 1; i >= 0; --i) {
            this.b.b(i).k = true;
        }
    }
    
    final void f() {
        for (int i = this.b.a() - 1; i >= 0; --i) {
            final a a = this.b.b(i);
            if (a.h && a.k) {
                a.k = false;
                if (a.e) {
                    a.a(a.d, a.g);
                }
            }
        }
    }
    
    final void g() {
        if (!this.g) {
            if (l.a) {
                Log.v("LoaderManager", "Destroying Active in " + this);
            }
            for (int i = this.b.a() - 1; i >= 0; --i) {
                this.b.b(i).b();
            }
            this.b.b();
        }
        if (l.a) {
            Log.v("LoaderManager", "Destroying Inactive in " + this);
        }
        for (int j = this.c.a() - 1; j >= 0; --j) {
            this.c.b(j).b();
        }
        this.c.b();
    }
    
    @Override
    public final String toString() {
        final StringBuilder sb = new StringBuilder(128);
        sb.append("LoaderManager{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" in ");
        android.support.v4.e.c.a(this.e, sb);
        sb.append("}}");
        return sb.toString();
    }
    
    final class a implements c.a<Object>
    {
        final int a;
        final Bundle b;
        k.a<Object> c;
        c<Object> d;
        boolean e;
        boolean f;
        Object g;
        boolean h;
        boolean i;
        boolean j;
        boolean k;
        boolean l;
        boolean m;
        a n;
        final /* synthetic */ l o;
        
        final void a() {
            if (android.support.v4.app.l.a) {
                Log.v("LoaderManager", "  Stopping: " + this);
            }
            this.h = false;
            if (!this.i && this.d != null && this.m) {
                this.m = false;
                this.d.a((c.a<Object>)this);
                this.d.c = false;
            }
        }
        
        final void a(final c<Object> obj, final Object o) {
            if (this.c == null) {
                return;
            }
            while (true) {
                Label_0177: {
                    if (this.o.e == null) {
                        break Label_0177;
                    }
                    final String u = this.o.e.b.u;
                    this.o.e.b.u = "onLoadFinished";
                    try {
                        if (android.support.v4.app.l.a) {
                            final StringBuilder append = new StringBuilder("  onLoadFinished in ").append(obj).append(": ");
                            final StringBuilder sb = new StringBuilder(64);
                            android.support.v4.e.c.a(o, sb);
                            sb.append("}");
                            Log.v("LoaderManager", append.append(sb.toString()).toString());
                        }
                        if (this.o.e != null) {
                            this.o.e.b.u = u;
                        }
                        this.f = true;
                        return;
                    }
                    finally {
                        if (this.o.e != null) {
                            this.o.e.b.u = u;
                        }
                    }
                }
                final String u = null;
                continue;
            }
        }
        
        public final void a(final String s, final PrintWriter printWriter) {
            String string = s;
            a n = this;
            while (true) {
                printWriter.print(string);
                printWriter.print("mId=");
                printWriter.print(n.a);
                printWriter.print(" mArgs=");
                printWriter.println(n.b);
                printWriter.print(string);
                printWriter.print("mCallbacks=");
                printWriter.println(n.c);
                printWriter.print(string);
                printWriter.print("mLoader=");
                printWriter.println(n.d);
                if (n.d != null) {
                    final c<Object> d = n.d;
                    final String string2 = string + "  ";
                    printWriter.print(string2);
                    printWriter.print("mId=");
                    printWriter.print(d.a);
                    printWriter.print(" mListener=");
                    printWriter.println(d.b);
                    if (d.c || d.f || d.g) {
                        printWriter.print(string2);
                        printWriter.print("mStarted=");
                        printWriter.print(d.c);
                        printWriter.print(" mContentChanged=");
                        printWriter.print(d.f);
                        printWriter.print(" mProcessingChange=");
                        printWriter.println(d.g);
                    }
                    if (d.d || d.e) {
                        printWriter.print(string2);
                        printWriter.print("mAbandoned=");
                        printWriter.print(d.d);
                        printWriter.print(" mReset=");
                        printWriter.println(d.e);
                    }
                }
                if (n.e || n.f) {
                    printWriter.print(string);
                    printWriter.print("mHaveData=");
                    printWriter.print(n.e);
                    printWriter.print("  mDeliveredData=");
                    printWriter.println(n.f);
                    printWriter.print(string);
                    printWriter.print("mData=");
                    printWriter.println(n.g);
                }
                printWriter.print(string);
                printWriter.print("mStarted=");
                printWriter.print(n.h);
                printWriter.print(" mReportNextStart=");
                printWriter.print(n.k);
                printWriter.print(" mDestroyed=");
                printWriter.println(n.l);
                printWriter.print(string);
                printWriter.print("mRetaining=");
                printWriter.print(n.i);
                printWriter.print(" mRetainingStarted=");
                printWriter.print(n.j);
                printWriter.print(" mListenerRegistered=");
                printWriter.println(n.m);
                if (n.n == null) {
                    break;
                }
                printWriter.print(string);
                printWriter.println("Pending Loader ");
                printWriter.print(n.n);
                printWriter.println(":");
                n = n.n;
                string += "  ";
            }
        }
        
        final void b() {
            a n = this;
            while (true) {
                if (android.support.v4.app.l.a) {
                    Log.v("LoaderManager", "  Destroying: " + n);
                }
                n.l = true;
                final boolean f = n.f;
                n.f = false;
                if (n.c != null && n.d != null && n.e && f) {
                    if (android.support.v4.app.l.a) {
                        Log.v("LoaderManager", "  Reseting: " + n);
                    }
                    String u;
                    if (n.o.e != null) {
                        u = n.o.e.b.u;
                        n.o.e.b.u = "onLoaderReset";
                    }
                    else {
                        u = null;
                    }
                    if (n.o.e != null) {
                        n.o.e.b.u = u;
                    }
                }
                n.c = null;
                n.g = null;
                n.e = false;
                if (n.d != null) {
                    if (n.m) {
                        n.m = false;
                        n.d.a((c.a<Object>)n);
                    }
                    final c<Object> d = n.d;
                    d.e = true;
                    d.c = false;
                    d.d = false;
                    d.f = false;
                    d.g = false;
                }
                if (n.n == null) {
                    break;
                }
                n = n.n;
            }
        }
        
        @Override
        public final String toString() {
            final StringBuilder sb = new StringBuilder(64);
            sb.append("LoaderInfo{");
            sb.append(Integer.toHexString(System.identityHashCode(this)));
            sb.append(" #");
            sb.append(this.a);
            sb.append(" : ");
            android.support.v4.e.c.a(this.d, sb);
            sb.append("}}");
            return sb.toString();
        }
    }
}
