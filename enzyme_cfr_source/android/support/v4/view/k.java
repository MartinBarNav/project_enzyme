/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  android.os.Build$VERSION
 *  android.util.Log
 *  android.view.MenuItem
 *  android.view.View
 */
package android.support.v4.view;

import android.os.Build;
import android.support.v4.view.l;
import android.support.v4.view.m;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;

public final class k {
    static final d a;

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    static {
        int n2 = Build.VERSION.SDK_INT;
        if (n2 >= 14) {
            a = new c();
            return;
        }
        if (n2 >= 11) {
            a = new b();
            return;
        }
        a = new a();
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static MenuItem a(MenuItem menuItem, android.support.v4.view.d d2) {
        if (menuItem instanceof android.support.v4.b.a.b) {
            return ((android.support.v4.b.a.b)menuItem).a(d2);
        }
        Log.w((String)"MenuItemCompat", (String)"setActionProvider: item does not implement SupportMenuItem; ignoring");
        return menuItem;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static MenuItem a(MenuItem menuItem, View view) {
        if (!(menuItem instanceof android.support.v4.b.a.b)) return a.a(menuItem, view);
        return ((android.support.v4.b.a.b)menuItem).setActionView(view);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static void a(MenuItem menuItem, int n2) {
        if (menuItem instanceof android.support.v4.b.a.b) {
            ((android.support.v4.b.a.b)menuItem).setShowAsAction(n2);
            return;
        }
        a.a(menuItem, n2);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static boolean a(MenuItem menuItem) {
        if (!(menuItem instanceof android.support.v4.b.a.b)) return a.a(menuItem);
        return ((android.support.v4.b.a.b)menuItem).expandActionView();
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static MenuItem b(MenuItem menuItem, int n2) {
        if (!(menuItem instanceof android.support.v4.b.a.b)) return a.b(menuItem, n2);
        return ((android.support.v4.b.a.b)menuItem).setActionView(n2);
    }

    static final class a
    implements d {
        a() {
        }

        @Override
        public final MenuItem a(MenuItem menuItem, View view) {
            return menuItem;
        }

        @Override
        public final void a(MenuItem menuItem, int n2) {
        }

        @Override
        public final boolean a(MenuItem menuItem) {
            return false;
        }

        @Override
        public final MenuItem b(MenuItem menuItem, int n2) {
            return menuItem;
        }
    }

    static class b
    implements d {
        b() {
        }

        @Override
        public final MenuItem a(MenuItem menuItem, View view) {
            return l.a(menuItem, view);
        }

        @Override
        public final void a(MenuItem menuItem, int n2) {
            l.a(menuItem, n2);
        }

        @Override
        public boolean a(MenuItem menuItem) {
            return false;
        }

        @Override
        public final MenuItem b(MenuItem menuItem, int n2) {
            return l.b(menuItem, n2);
        }
    }

    static final class c
    extends b {
        c() {
        }

        @Override
        public final boolean a(MenuItem menuItem) {
            return m.a(menuItem);
        }
    }

    static interface d {
        public MenuItem a(MenuItem var1, View var2);

        public void a(MenuItem var1, int var2);

        public boolean a(MenuItem var1);

        public MenuItem b(MenuItem var1, int var2);
    }

    public static interface e {
        public boolean a(MenuItem var1);

        public boolean b(MenuItem var1);
    }
}

