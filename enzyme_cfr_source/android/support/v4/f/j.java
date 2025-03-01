/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.os.Build$VERSION
 *  android.widget.Scroller
 */
package android.support.v4.f;

import android.content.Context;
import android.os.Build;
import android.support.v4.f.k;
import android.widget.Scroller;

public final class j {
    public Object a;
    public a b;

    /*
     * Enabled aggressive block sorting
     */
    private j(int n2, Context context) {
        this.b = n2 >= 14 ? new d() : (n2 >= 9 ? new c() : new b());
        this.a = this.b.a(context);
    }

    public j(Context context) {
        this(Build.VERSION.SDK_INT, context);
    }

    public static interface a {
        public int a(Object var1);

        public Object a(Context var1);

        public void a(Object var1, int var2);
    }

    static final class b
    implements a {
        b() {
        }

        @Override
        public final int a(Object object) {
            return ((Scroller)object).getFinalY();
        }

        @Override
        public final Object a(Context context) {
            return new Scroller(context);
        }

        @Override
        public final void a(Object object, int n2) {
            ((Scroller)object).fling(0, 0, 0, n2, 0, 0, Integer.MIN_VALUE, Integer.MAX_VALUE);
        }
    }

    static class c
    implements a {
        c() {
        }

        @Override
        public final int a(Object object) {
            return k.a(object);
        }

        @Override
        public final Object a(Context context) {
            return k.a(context, null);
        }

        @Override
        public final void a(Object object, int n2) {
            k.a(object, n2);
        }
    }

    static final class d
    extends c {
        d() {
        }
    }
}

