package android.support.v4.app;

import android.os.Bundle;
import android.support.v4.app.k;
import android.support.v4.content.c;
import android.support.v4.e.h;
import android.util.Log;
import java.io.PrintWriter;
import java.lang.reflect.Modifier;

final class l extends k {
    static boolean a = false;
    final h<a> b;
    final h<a> c;
    final String d;
    e e;
    boolean f;
    boolean g;

    final class a implements c.a<Object> {
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

        /* access modifiers changed from: package-private */
        public final void a() {
            if (l.a) {
                Log.v("LoaderManager", "  Stopping: " + this);
            }
            this.h = false;
            if (!this.i && this.d != null && this.m) {
                this.m = false;
                this.d.a(this);
                this.d.c = false;
            }
        }

        /* access modifiers changed from: package-private */
        public final void b() {
            String str;
            while (true) {
                if (l.a) {
                    Log.v("LoaderManager", "  Destroying: " + this);
                }
                this.l = true;
                boolean z = this.f;
                this.f = false;
                if (this.c != null && this.d != null && this.e && z) {
                    if (l.a) {
                        Log.v("LoaderManager", "  Reseting: " + this);
                    }
                    if (this.o.e != null) {
                        str = this.o.e.b.u;
                        this.o.e.b.u = "onLoaderReset";
                    } else {
                        str = null;
                    }
                    if (this.o.e != null) {
                        this.o.e.b.u = str;
                    }
                }
                this.c = null;
                this.g = null;
                this.e = false;
                if (this.d != null) {
                    if (this.m) {
                        this.m = false;
                        this.d.a(this);
                    }
                    c<Object> cVar = this.d;
                    cVar.e = true;
                    cVar.c = false;
                    cVar.d = false;
                    cVar.f = false;
                    cVar.g = false;
                }
                if (this.n != null) {
                    this = this.n;
                } else {
                    return;
                }
            }
        }

        /* access modifiers changed from: package-private */
        public final void a(c<Object> cVar, Object obj) {
            String str;
            if (this.c != null) {
                if (this.o.e != null) {
                    String str2 = this.o.e.b.u;
                    this.o.e.b.u = "onLoadFinished";
                    str = str2;
                } else {
                    str = null;
                }
                try {
                    if (l.a) {
                        StringBuilder append = new StringBuilder("  onLoadFinished in ").append(cVar).append(": ");
                        StringBuilder sb = new StringBuilder(64);
                        android.support.v4.e.c.a(obj, sb);
                        sb.append("}");
                        Log.v("LoaderManager", append.append(sb.toString()).toString());
                    }
                    this.f = true;
                } finally {
                    if (this.o.e != null) {
                        this.o.e.b.u = str;
                    }
                }
            }
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder(64);
            sb.append("LoaderInfo{");
            sb.append(Integer.toHexString(System.identityHashCode(this)));
            sb.append(" #");
            sb.append(this.a);
            sb.append(" : ");
            android.support.v4.e.c.a(this.d, sb);
            sb.append("}}");
            return sb.toString();
        }

        public final void a(String str, PrintWriter printWriter) {
            while (true) {
                printWriter.print(str);
                printWriter.print("mId=");
                printWriter.print(this.a);
                printWriter.print(" mArgs=");
                printWriter.println(this.b);
                printWriter.print(str);
                printWriter.print("mCallbacks=");
                printWriter.println(this.c);
                printWriter.print(str);
                printWriter.print("mLoader=");
                printWriter.println(this.d);
                if (this.d != null) {
                    c<Object> cVar = this.d;
                    String str2 = str + "  ";
                    printWriter.print(str2);
                    printWriter.print("mId=");
                    printWriter.print(cVar.a);
                    printWriter.print(" mListener=");
                    printWriter.println(cVar.b);
                    if (cVar.c || cVar.f || cVar.g) {
                        printWriter.print(str2);
                        printWriter.print("mStarted=");
                        printWriter.print(cVar.c);
                        printWriter.print(" mContentChanged=");
                        printWriter.print(cVar.f);
                        printWriter.print(" mProcessingChange=");
                        printWriter.println(cVar.g);
                    }
                    if (cVar.d || cVar.e) {
                        printWriter.print(str2);
                        printWriter.print("mAbandoned=");
                        printWriter.print(cVar.d);
                        printWriter.print(" mReset=");
                        printWriter.println(cVar.e);
                    }
                }
                if (this.e || this.f) {
                    printWriter.print(str);
                    printWriter.print("mHaveData=");
                    printWriter.print(this.e);
                    printWriter.print("  mDeliveredData=");
                    printWriter.println(this.f);
                    printWriter.print(str);
                    printWriter.print("mData=");
                    printWriter.println(this.g);
                }
                printWriter.print(str);
                printWriter.print("mStarted=");
                printWriter.print(this.h);
                printWriter.print(" mReportNextStart=");
                printWriter.print(this.k);
                printWriter.print(" mDestroyed=");
                printWriter.println(this.l);
                printWriter.print(str);
                printWriter.print("mRetaining=");
                printWriter.print(this.i);
                printWriter.print(" mRetainingStarted=");
                printWriter.print(this.j);
                printWriter.print(" mListenerRegistered=");
                printWriter.println(this.m);
                if (this.n != null) {
                    printWriter.print(str);
                    printWriter.println("Pending Loader ");
                    printWriter.print(this.n);
                    printWriter.println(":");
                    this = this.n;
                    str = str + "  ";
                } else {
                    return;
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final void b() {
        if (a) {
            Log.v("LoaderManager", "Starting in " + this);
        }
        if (this.f) {
            RuntimeException runtimeException = new RuntimeException("here");
            runtimeException.fillInStackTrace();
            Log.w("LoaderManager", "Called doStart when already started: " + this, runtimeException);
            return;
        }
        this.f = true;
        for (int a2 = this.b.a() - 1; a2 >= 0; a2--) {
            a b2 = this.b.b(a2);
            if (b2.i && b2.j) {
                b2.h = true;
            } else if (!b2.h) {
                b2.h = true;
                if (a) {
                    Log.v("LoaderManager", "  Starting: " + b2);
                }
                if (b2.d == null && b2.c != null) {
                    b2.d = b2.c.a();
                }
                if (b2.d == null) {
                    continue;
                } else if (!b2.d.getClass().isMemberClass() || Modifier.isStatic(b2.d.getClass().getModifiers())) {
                    if (!b2.m) {
                        c<Object> cVar = b2.d;
                        int i = b2.a;
                        if (cVar.b != null) {
                            throw new IllegalStateException("There is already a listener registered");
                        }
                        cVar.b = b2;
                        cVar.a = i;
                        b2.m = true;
                    }
                    c<Object> cVar2 = b2.d;
                    cVar2.c = true;
                    cVar2.e = false;
                    cVar2.d = false;
                } else {
                    throw new IllegalArgumentException("Object returned from onCreateLoader must not be a non-static inner member class: " + b2.d);
                }
            } else {
                continue;
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final void c() {
        if (a) {
            Log.v("LoaderManager", "Stopping in " + this);
        }
        if (!this.f) {
            RuntimeException runtimeException = new RuntimeException("here");
            runtimeException.fillInStackTrace();
            Log.w("LoaderManager", "Called doStop when not started: " + this, runtimeException);
            return;
        }
        for (int a2 = this.b.a() - 1; a2 >= 0; a2--) {
            this.b.b(a2).a();
        }
        this.f = false;
    }

    /* access modifiers changed from: package-private */
    public final void d() {
        if (a) {
            Log.v("LoaderManager", "Retaining in " + this);
        }
        if (!this.f) {
            RuntimeException runtimeException = new RuntimeException("here");
            runtimeException.fillInStackTrace();
            Log.w("LoaderManager", "Called doRetain when not started: " + this, runtimeException);
            return;
        }
        this.g = true;
        this.f = false;
        for (int a2 = this.b.a() - 1; a2 >= 0; a2--) {
            a b2 = this.b.b(a2);
            if (a) {
                Log.v("LoaderManager", "  Retaining: " + b2);
            }
            b2.i = true;
            b2.j = b2.h;
            b2.h = false;
            b2.c = null;
        }
    }

    /* access modifiers changed from: package-private */
    public final void e() {
        for (int a2 = this.b.a() - 1; a2 >= 0; a2--) {
            this.b.b(a2).k = true;
        }
    }

    /* access modifiers changed from: package-private */
    public final void f() {
        for (int a2 = this.b.a() - 1; a2 >= 0; a2--) {
            a b2 = this.b.b(a2);
            if (b2.h && b2.k) {
                b2.k = false;
                if (b2.e) {
                    b2.a(b2.d, b2.g);
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final void g() {
        if (!this.g) {
            if (a) {
                Log.v("LoaderManager", "Destroying Active in " + this);
            }
            for (int a2 = this.b.a() - 1; a2 >= 0; a2--) {
                this.b.b(a2).b();
            }
            this.b.b();
        }
        if (a) {
            Log.v("LoaderManager", "Destroying Inactive in " + this);
        }
        for (int a3 = this.c.a() - 1; a3 >= 0; a3--) {
            this.c.b(a3).b();
        }
        this.c.b();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("LoaderManager{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" in ");
        android.support.v4.e.c.a(this.e, sb);
        sb.append("}}");
        return sb.toString();
    }

    public final void a(String str, PrintWriter printWriter) {
        if (this.b.a() > 0) {
            printWriter.print(str);
            printWriter.println("Active Loaders:");
            String str2 = str + "    ";
            for (int i = 0; i < this.b.a(); i++) {
                a b2 = this.b.b(i);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(this.b.a(i));
                printWriter.print(": ");
                printWriter.println(b2.toString());
                b2.a(str2, printWriter);
            }
        }
        if (this.c.a() > 0) {
            printWriter.print(str);
            printWriter.println("Inactive Loaders:");
            String str3 = str + "    ";
            for (int i2 = 0; i2 < this.c.a(); i2++) {
                a b3 = this.c.b(i2);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(this.c.a(i2));
                printWriter.print(": ");
                printWriter.println(b3.toString());
                b3.a(str3, printWriter);
            }
        }
    }

    public final boolean a() {
        boolean z;
        int a2 = this.b.a();
        boolean z2 = false;
        for (int i = 0; i < a2; i++) {
            a b2 = this.b.b(i);
            if (!b2.h || b2.f) {
                z = false;
            } else {
                z = true;
            }
            z2 |= z;
        }
        return z2;
    }
}
