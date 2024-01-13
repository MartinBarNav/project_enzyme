package android.support.v4.f;

import android.content.Context;
import android.os.Build;
import android.view.animation.Interpolator;
import android.widget.Scroller;

public final class j {
    public Object a;
    public a b;

    interface a {
        int a(Object obj);

        Object a(Context context);

        void a(Object obj, int i);
    }

    static class b implements a {
        b() {
        }

        public final Object a(Context context) {
            return new Scroller(context);
        }

        public final void a(Object obj, int i) {
            ((Scroller) obj).fling(0, 0, 0, i, 0, 0, Integer.MIN_VALUE, Integer.MAX_VALUE);
        }

        public final int a(Object obj) {
            return ((Scroller) obj).getFinalY();
        }
    }

    static class c implements a {
        c() {
        }

        public final Object a(Context context) {
            return k.a(context, (Interpolator) null);
        }

        public final void a(Object obj, int i) {
            k.a(obj, i);
        }

        public final int a(Object obj) {
            return k.a(obj);
        }
    }

    static class d extends c {
        d() {
        }
    }

    public j(Context context) {
        this(Build.VERSION.SDK_INT, context);
    }

    private j(int i, Context context) {
        if (i >= 14) {
            this.b = new d();
        } else if (i >= 9) {
            this.b = new c();
        } else {
            this.b = new b();
        }
        this.a = this.b.a(context);
    }
}
