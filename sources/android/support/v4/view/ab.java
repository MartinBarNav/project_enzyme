package android.support.v4.view;

import android.os.Build;
import android.view.ViewConfiguration;

public final class ab {
    static final e a;

    interface e {
        int a(ViewConfiguration viewConfiguration);

        boolean b(ViewConfiguration viewConfiguration);
    }

    static class a implements e {
        a() {
        }

        public int a(ViewConfiguration viewConfiguration) {
            return viewConfiguration.getScaledTouchSlop();
        }

        public boolean b(ViewConfiguration viewConfiguration) {
            return true;
        }
    }

    static class b extends a {
        b() {
        }

        public final int a(ViewConfiguration viewConfiguration) {
            return ac.a(viewConfiguration);
        }
    }

    static class c extends b {
        c() {
        }

        public boolean b(ViewConfiguration viewConfiguration) {
            return false;
        }
    }

    static class d extends c {
        d() {
        }

        public final boolean b(ViewConfiguration viewConfiguration) {
            return ad.a(viewConfiguration);
        }
    }

    static {
        if (Build.VERSION.SDK_INT >= 14) {
            a = new d();
        } else if (Build.VERSION.SDK_INT >= 11) {
            a = new c();
        } else if (Build.VERSION.SDK_INT >= 8) {
            a = new b();
        } else {
            a = new a();
        }
    }

    public static int a(ViewConfiguration viewConfiguration) {
        return a.a(viewConfiguration);
    }

    public static boolean b(ViewConfiguration viewConfiguration) {
        return a.b(viewConfiguration);
    }
}
