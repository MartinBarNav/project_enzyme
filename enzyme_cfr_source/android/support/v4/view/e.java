/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  android.os.Build$VERSION
 */
package android.support.v4.view;

import android.os.Build;
import android.support.v4.view.f;

public final class e {
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

    public static int a(int n2, int n3) {
        return a.a(n2, n3);
    }

    static interface a {
        public int a(int var1, int var2);
    }

    static final class b
    implements a {
        b() {
        }

        @Override
        public final int a(int n2, int n3) {
            return 0xFF7FFFFF & n2;
        }
    }

    static final class c
    implements a {
        c() {
        }

        @Override
        public final int a(int n2, int n3) {
            return f.a(n2, n3);
        }
    }
}

