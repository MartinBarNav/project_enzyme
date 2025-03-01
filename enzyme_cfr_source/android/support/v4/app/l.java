/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 *  android.util.Log
 */
package android.support.v4.app;

import android.os.Bundle;
import android.support.v4.app.e;
import android.support.v4.app.k;
import android.support.v4.content.c;
import android.support.v4.e.c;
import android.support.v4.e.h;
import android.util.Log;
import java.io.PrintWriter;
import java.lang.reflect.Modifier;

final class l
extends k {
    static boolean a = false;
    final h<a> b;
    final h<a> c;
    final String d;
    e e;
    boolean f;
    boolean g;

    public final void a(String string, PrintWriter printWriter) {
        Object object;
        int n2;
        Object object2;
        int n3 = 0;
        if (this.b.a() > 0) {
            printWriter.print(string);
            printWriter.println("Active Loaders:");
            object2 = string + "    ";
            for (n2 = 0; n2 < this.b.a(); ++n2) {
                object = this.b.b(n2);
                printWriter.print(string);
                printWriter.print("  #");
                printWriter.print(this.b.a(n2));
                printWriter.print(": ");
                printWriter.println(((a)object).toString());
                ((a)object).a((String)object2, printWriter);
            }
        }
        if (this.c.a() > 0) {
            printWriter.print(string);
            printWriter.println("Inactive Loaders:");
            object = string + "    ";
            for (n2 = n3; n2 < this.c.a(); ++n2) {
                object2 = this.c.b(n2);
                printWriter.print(string);
                printWriter.print("  #");
                printWriter.print(this.c.a(n2));
                printWriter.print(": ");
                printWriter.println(((a)object2).toString());
                ((a)object2).a((String)object, printWriter);
            }
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public final boolean a() {
        int n2 = this.b.a();
        int n3 = 0;
        boolean bl = false;
        while (n3 < n2) {
            a a2 = this.b.b(n3);
            boolean bl2 = a2.h && !a2.f;
            bl |= bl2;
            ++n3;
        }
        return bl;
    }

    /*
     * Enabled aggressive block sorting
     */
    final void b() {
        if (a) {
            Log.v((String)"LoaderManager", (String)("Starting in " + this));
        }
        if (this.f) {
            RuntimeException runtimeException = new RuntimeException("here");
            runtimeException.fillInStackTrace();
            Log.w((String)"LoaderManager", (String)("Called doStart when already started: " + this), (Throwable)runtimeException);
            return;
        }
        this.f = true;
        int n2 = this.b.a() - 1;
        while (n2 >= 0) {
            Object object = this.b.b(n2);
            if (((a)object).i && ((a)object).j) {
                ((a)object).h = true;
            } else if (!((a)object).h) {
                ((a)object).h = true;
                if (a) {
                    Log.v((String)"LoaderManager", (String)("  Starting: " + object));
                }
                if (((a)object).d == null && ((a)object).c != null) {
                    ((a)object).d = ((a)object).c.a();
                }
                if (((a)object).d != null) {
                    if (((a)object).d.getClass().isMemberClass() && !Modifier.isStatic(((a)object).d.getClass().getModifiers())) {
                        throw new IllegalArgumentException("Object returned from onCreateLoader must not be a non-static inner member class: " + ((a)object).d);
                    }
                    if (!((a)object).m) {
                        android.support.v4.content.c<Object> c2 = ((a)object).d;
                        int n3 = ((a)object).a;
                        if (c2.b != null) {
                            throw new IllegalStateException("There is already a listener registered");
                        }
                        c2.b = object;
                        c2.a = n3;
                        ((a)object).m = true;
                    }
                    object = ((a)object).d;
                    ((android.support.v4.content.c)object).c = true;
                    ((android.support.v4.content.c)object).e = false;
                    ((android.support.v4.content.c)object).d = false;
                }
            }
            --n2;
        }
        return;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    final void c() {
        if (a) {
            Log.v((String)"LoaderManager", (String)("Stopping in " + this));
        }
        if (!this.f) {
            RuntimeException runtimeException = new RuntimeException("here");
            runtimeException.fillInStackTrace();
            Log.w((String)"LoaderManager", (String)("Called doStop when not started: " + this), (Throwable)runtimeException);
            return;
        }
        for (int i2 = this.b.a() - 1; i2 >= 0; --i2) {
            this.b.b(i2).a();
        }
        this.f = false;
    }

    /*
     * Enabled aggressive block sorting
     */
    final void d() {
        if (a) {
            Log.v((String)"LoaderManager", (String)("Retaining in " + this));
        }
        if (!this.f) {
            RuntimeException runtimeException = new RuntimeException("here");
            runtimeException.fillInStackTrace();
            Log.w((String)"LoaderManager", (String)("Called doRetain when not started: " + this), (Throwable)runtimeException);
            return;
        } else {
            this.g = true;
            this.f = false;
            for (int i2 = this.b.a() - 1; i2 >= 0; --i2) {
                a a2 = this.b.b(i2);
                if (a) {
                    Log.v((String)"LoaderManager", (String)("  Retaining: " + a2));
                }
                a2.i = true;
                a2.j = a2.h;
                a2.h = false;
                a2.c = null;
            }
        }
    }

    final void e() {
        for (int i2 = this.b.a() - 1; i2 >= 0; --i2) {
            this.b.b((int)i2).k = true;
        }
    }

    final void f() {
        for (int i2 = this.b.a() - 1; i2 >= 0; --i2) {
            a a2 = this.b.b(i2);
            if (!a2.h || !a2.k) continue;
            a2.k = false;
            if (!a2.e) continue;
            a2.a(a2.d, a2.g);
        }
    }

    final void g() {
        int n2;
        if (!this.g) {
            if (a) {
                Log.v((String)"LoaderManager", (String)("Destroying Active in " + this));
            }
            for (n2 = this.b.a() - 1; n2 >= 0; --n2) {
                this.b.b(n2).b();
            }
            this.b.b();
        }
        if (a) {
            Log.v((String)"LoaderManager", (String)("Destroying Inactive in " + this));
        }
        for (n2 = this.c.a() - 1; n2 >= 0; --n2) {
            this.c.b(n2).b();
        }
        this.c.b();
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder(128);
        stringBuilder.append("LoaderManager{");
        stringBuilder.append(Integer.toHexString(System.identityHashCode(this)));
        stringBuilder.append(" in ");
        android.support.v4.e.c.a((Object)this.e, stringBuilder);
        stringBuilder.append("}}");
        return stringBuilder.toString();
    }

    final class a
    implements c.a<Object> {
        final int a;
        final Bundle b;
        k.a<Object> c;
        android.support.v4.content.c<Object> d;
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
            if (a) {
                Log.v((String)"LoaderManager", (String)("  Stopping: " + this));
            }
            this.h = false;
            if (!this.i && this.d != null && this.m) {
                this.m = false;
                this.d.a(this);
                this.d.c = false;
            }
        }

        /*
         * Enabled aggressive block sorting
         * Enabled unnecessary exception pruning
         * Enabled aggressive exception aggregation
         */
        final void a(android.support.v4.content.c<Object> object, Object object2) {
            String string;
            if (this.c != null) {
                if (this.o.e != null) {
                    string = this.o.e.b.u;
                    this.o.e.b.u = "onLoadFinished";
                } else {
                    string = null;
                }
                if (a) {
                    StringBuilder stringBuilder = new StringBuilder("  onLoadFinished in ");
                    object = stringBuilder.append(object).append(": ");
                    stringBuilder = new StringBuilder(64);
                    android.support.v4.e.c.a(object2, stringBuilder);
                    stringBuilder.append("}");
                    Log.v((String)"LoaderManager", (String)((StringBuilder)object).append(stringBuilder.toString()).toString());
                }
                this.f = true;
            }
            return;
            finally {
                if (this.o.e != null) {
                    this.o.e.b.u = string;
                }
            }
        }

        public final void a(String object, PrintWriter printWriter) {
            String string = object;
            object = this;
            while (true) {
                printWriter.print(string);
                printWriter.print("mId=");
                printWriter.print(((a)object).a);
                printWriter.print(" mArgs=");
                printWriter.println((Object)((a)object).b);
                printWriter.print(string);
                printWriter.print("mCallbacks=");
                printWriter.println(((a)object).c);
                printWriter.print(string);
                printWriter.print("mLoader=");
                printWriter.println(((a)object).d);
                if (((a)object).d != null) {
                    android.support.v4.content.c<Object> c2 = ((a)object).d;
                    String string2 = string + "  ";
                    printWriter.print(string2);
                    printWriter.print("mId=");
                    printWriter.print(c2.a);
                    printWriter.print(" mListener=");
                    printWriter.println(c2.b);
                    if (c2.c || c2.f || c2.g) {
                        printWriter.print(string2);
                        printWriter.print("mStarted=");
                        printWriter.print(c2.c);
                        printWriter.print(" mContentChanged=");
                        printWriter.print(c2.f);
                        printWriter.print(" mProcessingChange=");
                        printWriter.println(c2.g);
                    }
                    if (c2.d || c2.e) {
                        printWriter.print(string2);
                        printWriter.print("mAbandoned=");
                        printWriter.print(c2.d);
                        printWriter.print(" mReset=");
                        printWriter.println(c2.e);
                    }
                }
                if (((a)object).e || ((a)object).f) {
                    printWriter.print(string);
                    printWriter.print("mHaveData=");
                    printWriter.print(((a)object).e);
                    printWriter.print("  mDeliveredData=");
                    printWriter.println(((a)object).f);
                    printWriter.print(string);
                    printWriter.print("mData=");
                    printWriter.println(((a)object).g);
                }
                printWriter.print(string);
                printWriter.print("mStarted=");
                printWriter.print(((a)object).h);
                printWriter.print(" mReportNextStart=");
                printWriter.print(((a)object).k);
                printWriter.print(" mDestroyed=");
                printWriter.println(((a)object).l);
                printWriter.print(string);
                printWriter.print("mRetaining=");
                printWriter.print(((a)object).i);
                printWriter.print(" mRetainingStarted=");
                printWriter.print(((a)object).j);
                printWriter.print(" mListenerRegistered=");
                printWriter.println(((a)object).m);
                if (((a)object).n == null) break;
                printWriter.print(string);
                printWriter.println("Pending Loader ");
                printWriter.print(((a)object).n);
                printWriter.println(":");
                object = ((a)object).n;
                string = string + "  ";
            }
        }

        /*
         * Enabled aggressive block sorting
         */
        final void b() {
            a a2 = this;
            while (true) {
                Object object;
                if (a) {
                    Log.v((String)"LoaderManager", (String)("  Destroying: " + a2));
                }
                a2.l = true;
                boolean bl = a2.f;
                a2.f = false;
                if (a2.c != null && a2.d != null && a2.e && bl) {
                    if (a) {
                        Log.v((String)"LoaderManager", (String)("  Reseting: " + a2));
                    }
                    if (a2.o.e != null) {
                        object = a2.o.e.b.u;
                        a2.o.e.b.u = "onLoaderReset";
                    } else {
                        object = null;
                    }
                    if (a2.o.e != null) {
                        a2.o.e.b.u = object;
                    }
                }
                a2.c = null;
                a2.g = null;
                a2.e = false;
                if (a2.d != null) {
                    if (a2.m) {
                        a2.m = false;
                        a2.d.a(a2);
                    }
                    object = a2.d;
                    ((android.support.v4.content.c)object).e = true;
                    ((android.support.v4.content.c)object).c = false;
                    ((android.support.v4.content.c)object).d = false;
                    ((android.support.v4.content.c)object).f = false;
                    ((android.support.v4.content.c)object).g = false;
                }
                if (a2.n == null) {
                    return;
                }
                a2 = a2.n;
            }
        }

        public final String toString() {
            StringBuilder stringBuilder = new StringBuilder(64);
            stringBuilder.append("LoaderInfo{");
            stringBuilder.append(Integer.toHexString(System.identityHashCode(this)));
            stringBuilder.append(" #");
            stringBuilder.append(this.a);
            stringBuilder.append(" : ");
            android.support.v4.e.c.a(this.d, stringBuilder);
            stringBuilder.append("}}");
            return stringBuilder.toString();
        }
    }
}

