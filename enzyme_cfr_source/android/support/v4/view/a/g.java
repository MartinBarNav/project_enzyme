/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  android.os.Build$VERSION
 */
package android.support.v4.view.a;

import android.os.Build;
import android.support.v4.view.a.h;

public final class g {
    public static final c a;
    public final Object b;

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    static {
        if (Build.VERSION.SDK_INT >= 16) {
            a = new d();
            return;
        }
        if (Build.VERSION.SDK_INT >= 15) {
            a = new b();
            return;
        }
        if (Build.VERSION.SDK_INT >= 14) {
            a = new a();
            return;
        }
        a = new e();
    }

    private g(Object object) {
        this.b = object;
    }

    public static g a() {
        return new g(a.a());
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final boolean equals(Object object) {
        boolean bl = true;
        if (this == object) {
            return bl;
        }
        if (object == null) {
            return false;
        }
        if (this.getClass() != object.getClass()) {
            return false;
        }
        object = (g)object;
        if (this.b == null) {
            if (((g)object).b == null) return bl;
            return false;
        }
        if (this.b.equals(((g)object).b)) return bl;
        return false;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final int hashCode() {
        if (this.b != null) return this.b.hashCode();
        return 0;
    }

    static class a
    extends e {
        a() {
        }

        @Override
        public final Object a() {
            return h.a();
        }

        @Override
        public final void a(Object object, int n2) {
            h.a(object, n2);
        }

        @Override
        public final void a(Object object, boolean bl) {
            h.a(object, bl);
        }

        @Override
        public final void b(Object object, int n2) {
            h.b(object, n2);
        }

        @Override
        public final void c(Object object, int n2) {
            h.c(object, n2);
        }
    }

    static class b
    extends a {
        b() {
        }
    }

    public static interface c {
        public Object a();

        public void a(Object var1, int var2);

        public void a(Object var1, boolean var2);

        public void b(Object var1, int var2);

        public void c(Object var1, int var2);
    }

    static final class d
    extends b {
        d() {
        }
    }

    static class e
    implements c {
        e() {
        }

        @Override
        public Object a() {
            return null;
        }

        @Override
        public void a(Object object, int n2) {
        }

        @Override
        public void a(Object object, boolean bl) {
        }

        @Override
        public void b(Object object, int n2) {
        }

        @Override
        public void c(Object object, int n2) {
        }
    }
}

