package android.support.v4.view;

import android.os.Build;
import android.view.ViewGroup;

public final class i {
    static final a a;

    interface a {
        int a(ViewGroup.MarginLayoutParams marginLayoutParams);

        int b(ViewGroup.MarginLayoutParams marginLayoutParams);
    }

    static class b implements a {
        b() {
        }

        public final int a(ViewGroup.MarginLayoutParams marginLayoutParams) {
            return marginLayoutParams.leftMargin;
        }

        public final int b(ViewGroup.MarginLayoutParams marginLayoutParams) {
            return marginLayoutParams.rightMargin;
        }
    }

    static class c implements a {
        c() {
        }

        public final int a(ViewGroup.MarginLayoutParams marginLayoutParams) {
            return j.a(marginLayoutParams);
        }

        public final int b(ViewGroup.MarginLayoutParams marginLayoutParams) {
            return j.b(marginLayoutParams);
        }
    }

    static {
        if (Build.VERSION.SDK_INT >= 17) {
            a = new c();
        } else {
            a = new b();
        }
    }

    public static int a(ViewGroup.MarginLayoutParams marginLayoutParams) {
        return a.a(marginLayoutParams);
    }

    public static int b(ViewGroup.MarginLayoutParams marginLayoutParams) {
        return a.b(marginLayoutParams);
    }
}
