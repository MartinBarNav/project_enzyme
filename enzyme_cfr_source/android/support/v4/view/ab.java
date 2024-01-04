/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  android.os.Build$VERSION
 *  android.view.ViewConfiguration
 */
package android.support.v4.view;

import android.os.Build;
import android.support.v4.view.ac;
import android.support.v4.view.ad;
import android.view.ViewConfiguration;

public final class ab {
    static final e a;

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    static {
        if (Build.VERSION.SDK_INT >= 14) {
            a = new d();
            return;
        }
        if (Build.VERSION.SDK_INT >= 11) {
            a = new c();
            return;
        }
        if (Build.VERSION.SDK_INT >= 8) {
            a = new b();
            return;
        }
        a = new a();
    }

    public static int a(ViewConfiguration viewConfiguration) {
        return a.a(viewConfiguration);
    }

    public static boolean b(ViewConfiguration viewConfiguration) {
        return a.b(viewConfiguration);
    }

    static class a
    implements e {
        a() {
        }

        @Override
        public int a(ViewConfiguration viewConfiguration) {
            return viewConfiguration.getScaledTouchSlop();
        }

        @Override
        public boolean b(ViewConfiguration viewConfiguration) {
            return true;
        }
    }

    static class b
    extends a {
        b() {
        }

        @Override
        public final int a(ViewConfiguration viewConfiguration) {
            return ac.a(viewConfiguration);
        }
    }

    static class c
    extends b {
        c() {
        }

        @Override
        public boolean b(ViewConfiguration viewConfiguration) {
            return false;
        }
    }

    static final class d
    extends c {
        d() {
        }

        @Override
        public final boolean b(ViewConfiguration viewConfiguration) {
            return ad.a(viewConfiguration);
        }
    }

    static interface e {
        public int a(ViewConfiguration var1);

        public boolean b(ViewConfiguration var1);
    }
}

