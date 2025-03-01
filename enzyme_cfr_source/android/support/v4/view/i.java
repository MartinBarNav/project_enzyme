/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  android.os.Build$VERSION
 *  android.view.ViewGroup$MarginLayoutParams
 */
package android.support.v4.view;

import android.os.Build;
import android.support.v4.view.j;
import android.view.ViewGroup;

public final class i {
    static final a a;

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    static {
        if (Build.VERSION.SDK_INT >= 17) {
            a = new c();
            return;
        }
        a = new b();
    }

    public static int a(ViewGroup.MarginLayoutParams marginLayoutParams) {
        return a.a(marginLayoutParams);
    }

    public static int b(ViewGroup.MarginLayoutParams marginLayoutParams) {
        return a.b(marginLayoutParams);
    }

    static interface a {
        public int a(ViewGroup.MarginLayoutParams var1);

        public int b(ViewGroup.MarginLayoutParams var1);
    }

    static final class b
    implements a {
        b() {
        }

        @Override
        public final int a(ViewGroup.MarginLayoutParams marginLayoutParams) {
            return marginLayoutParams.leftMargin;
        }

        @Override
        public final int b(ViewGroup.MarginLayoutParams marginLayoutParams) {
            return marginLayoutParams.rightMargin;
        }
    }

    static final class c
    implements a {
        c() {
        }

        @Override
        public final int a(ViewGroup.MarginLayoutParams marginLayoutParams) {
            return j.a(marginLayoutParams);
        }

        @Override
        public final int b(ViewGroup.MarginLayoutParams marginLayoutParams) {
            return j.b(marginLayoutParams);
        }
    }
}

