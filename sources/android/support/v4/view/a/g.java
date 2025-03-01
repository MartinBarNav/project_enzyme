package android.support.v4.view.a;

import android.os.Build;

public final class g {
    public static final c a;
    public final Object b;

    interface c {
        Object a();

        void a(Object obj, int i);

        void a(Object obj, boolean z);

        void b(Object obj, int i);

        void c(Object obj, int i);
    }

    static class e implements c {
        e() {
        }

        public Object a() {
            return null;
        }

        public void a(Object obj, int i) {
        }

        public void b(Object obj, int i) {
        }

        public void a(Object obj, boolean z) {
        }

        public void c(Object obj, int i) {
        }
    }

    static class a extends e {
        a() {
        }

        public final Object a() {
            return h.a();
        }

        public final void a(Object obj, int i) {
            h.a(obj, i);
        }

        public final void b(Object obj, int i) {
            h.b(obj, i);
        }

        public final void a(Object obj, boolean z) {
            h.a(obj, z);
        }

        public final void c(Object obj, int i) {
            h.c(obj, i);
        }
    }

    static class b extends a {
        b() {
        }
    }

    static class d extends b {
        d() {
        }
    }

    static {
        if (Build.VERSION.SDK_INT >= 16) {
            a = new d();
        } else if (Build.VERSION.SDK_INT >= 15) {
            a = new b();
        } else if (Build.VERSION.SDK_INT >= 14) {
            a = new a();
        } else {
            a = new e();
        }
    }

    private g(Object obj) {
        this.b = obj;
    }

    public static g a() {
        return new g(a.a());
    }

    public final int hashCode() {
        if (this.b == null) {
            return 0;
        }
        return this.b.hashCode();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        g gVar = (g) obj;
        if (this.b == null) {
            if (gVar.b != null) {
                return false;
            }
            return true;
        } else if (!this.b.equals(gVar.b)) {
            return false;
        } else {
            return true;
        }
    }
}
