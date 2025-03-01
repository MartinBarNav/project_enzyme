package android.support.v4.view;

import android.os.Build;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;

public final class k {
    static final d a;

    interface d {
        MenuItem a(MenuItem menuItem, View view);

        void a(MenuItem menuItem, int i);

        boolean a(MenuItem menuItem);

        MenuItem b(MenuItem menuItem, int i);
    }

    public interface e {
        boolean a(MenuItem menuItem);

        boolean b(MenuItem menuItem);
    }

    static class a implements d {
        a() {
        }

        public final void a(MenuItem menuItem, int i) {
        }

        public final MenuItem a(MenuItem menuItem, View view) {
            return menuItem;
        }

        public final MenuItem b(MenuItem menuItem, int i) {
            return menuItem;
        }

        public final boolean a(MenuItem menuItem) {
            return false;
        }
    }

    static class b implements d {
        b() {
        }

        public final void a(MenuItem menuItem, int i) {
            l.a(menuItem, i);
        }

        public final MenuItem a(MenuItem menuItem, View view) {
            return l.a(menuItem, view);
        }

        public final MenuItem b(MenuItem menuItem, int i) {
            return l.b(menuItem, i);
        }

        public boolean a(MenuItem menuItem) {
            return false;
        }
    }

    static class c extends b {
        c() {
        }

        public final boolean a(MenuItem menuItem) {
            return m.a(menuItem);
        }
    }

    static {
        int i = Build.VERSION.SDK_INT;
        if (i >= 14) {
            a = new c();
        } else if (i >= 11) {
            a = new b();
        } else {
            a = new a();
        }
    }

    public static void a(MenuItem menuItem, int i) {
        if (menuItem instanceof android.support.v4.b.a.b) {
            ((android.support.v4.b.a.b) menuItem).setShowAsAction(i);
        } else {
            a.a(menuItem, i);
        }
    }

    public static MenuItem a(MenuItem menuItem, View view) {
        if (menuItem instanceof android.support.v4.b.a.b) {
            return ((android.support.v4.b.a.b) menuItem).setActionView(view);
        }
        return a.a(menuItem, view);
    }

    public static MenuItem b(MenuItem menuItem, int i) {
        if (menuItem instanceof android.support.v4.b.a.b) {
            return ((android.support.v4.b.a.b) menuItem).setActionView(i);
        }
        return a.b(menuItem, i);
    }

    public static MenuItem a(MenuItem menuItem, d dVar) {
        if (menuItem instanceof android.support.v4.b.a.b) {
            return ((android.support.v4.b.a.b) menuItem).a(dVar);
        }
        Log.w("MenuItemCompat", "setActionProvider: item does not implement SupportMenuItem; ignoring");
        return menuItem;
    }

    public static boolean a(MenuItem menuItem) {
        if (menuItem instanceof android.support.v4.b.a.b) {
            return ((android.support.v4.b.a.b) menuItem).expandActionView();
        }
        return a.a(menuItem);
    }
}
