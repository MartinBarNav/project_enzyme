package android.support.v4.f;

import android.content.Context;
import android.graphics.Canvas;
import android.os.Build;

public final class d {
    private static final c b;
    private Object a;

    interface c {
        Object a(Context context);

        void a(Object obj, int i, int i2);

        boolean a(Object obj);

        boolean a(Object obj, float f);

        boolean a(Object obj, Canvas canvas);

        void b(Object obj);

        boolean c(Object obj);
    }

    static {
        if (Build.VERSION.SDK_INT >= 14) {
            b = new b();
        } else {
            b = new a();
        }
    }

    static class a implements c {
        a() {
        }

        public final Object a(Context context) {
            return null;
        }

        public final void a(Object obj, int i, int i2) {
        }

        public final boolean a(Object obj) {
            return true;
        }

        public final void b(Object obj) {
        }

        public final boolean a(Object obj, float f) {
            return false;
        }

        public final boolean c(Object obj) {
            return false;
        }

        public final boolean a(Object obj, Canvas canvas) {
            return false;
        }
    }

    static class b implements c {
        b() {
        }

        public final Object a(Context context) {
            return e.a(context);
        }

        public final void a(Object obj, int i, int i2) {
            e.a(obj, i, i2);
        }

        public final boolean a(Object obj) {
            return e.a(obj);
        }

        public final void b(Object obj) {
            e.b(obj);
        }

        public final boolean a(Object obj, float f) {
            return e.a(obj, f);
        }

        public final boolean c(Object obj) {
            return e.c(obj);
        }

        public final boolean a(Object obj, Canvas canvas) {
            return e.a(obj, canvas);
        }
    }

    public d(Context context) {
        this.a = b.a(context);
    }

    public final void a(int i, int i2) {
        b.a(this.a, i, i2);
    }

    public final boolean a() {
        return b.a(this.a);
    }

    public final void b() {
        b.b(this.a);
    }

    public final boolean a(float f) {
        return b.a(this.a, f);
    }

    public final boolean c() {
        return b.c(this.a);
    }

    public final boolean a(Canvas canvas) {
        return b.a(this.a, canvas);
    }
}
