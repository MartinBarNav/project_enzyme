/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.graphics.Canvas
 *  android.os.Build$VERSION
 */
package android.support.v4.f;

import android.content.Context;
import android.graphics.Canvas;
import android.os.Build;
import android.support.v4.f.e;

public final class d {
    private static final c b;
    private Object a;

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    static {
        if (Build.VERSION.SDK_INT >= 14) {
            b = new b();
            return;
        }
        b = new a();
    }

    public d(Context context) {
        this.a = b.a(context);
    }

    public final void a(int n2, int n3) {
        b.a(this.a, n2, n3);
    }

    public final boolean a() {
        return b.a(this.a);
    }

    public final boolean a(float f2) {
        return b.a(this.a, f2);
    }

    public final boolean a(Canvas canvas) {
        return b.a(this.a, canvas);
    }

    public final void b() {
        b.b(this.a);
    }

    public final boolean c() {
        return b.c(this.a);
    }

    static final class a
    implements c {
        a() {
        }

        @Override
        public final Object a(Context context) {
            return null;
        }

        @Override
        public final void a(Object object, int n2, int n3) {
        }

        @Override
        public final boolean a(Object object) {
            return true;
        }

        @Override
        public final boolean a(Object object, float f2) {
            return false;
        }

        @Override
        public final boolean a(Object object, Canvas canvas) {
            return false;
        }

        @Override
        public final void b(Object object) {
        }

        @Override
        public final boolean c(Object object) {
            return false;
        }
    }

    static final class b
    implements c {
        b() {
        }

        @Override
        public final Object a(Context context) {
            return e.a(context);
        }

        @Override
        public final void a(Object object, int n2, int n3) {
            e.a(object, n2, n3);
        }

        @Override
        public final boolean a(Object object) {
            return e.a(object);
        }

        @Override
        public final boolean a(Object object, float f2) {
            return e.a(object, f2);
        }

        @Override
        public final boolean a(Object object, Canvas canvas) {
            return e.a(object, canvas);
        }

        @Override
        public final void b(Object object) {
            e.b(object);
        }

        @Override
        public final boolean c(Object object) {
            return e.c(object);
        }
    }

    static interface c {
        public Object a(Context var1);

        public void a(Object var1, int var2, int var3);

        public boolean a(Object var1);

        public boolean a(Object var1, float var2);

        public boolean a(Object var1, Canvas var2);

        public void b(Object var1);

        public boolean c(Object var1);
    }
}

