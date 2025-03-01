/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  android.app.Fragment
 *  android.os.Build$VERSION
 */
package android.support.a.a;

import android.app.Fragment;
import android.os.Build;

public final class a {
    static final b a;

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    static {
        if (Build.VERSION.SDK_INT >= 15) {
            a = new d();
            return;
        }
        if (Build.VERSION.SDK_INT >= 14) {
            a = new c();
            return;
        }
        a = new a();
    }

    public static void a(Fragment fragment, boolean bl) {
        a.a(fragment, bl);
    }

    public static void b(Fragment fragment, boolean bl) {
        a.b(fragment, bl);
    }

    static class a
    implements b {
        a() {
        }

        @Override
        public void a(Fragment fragment, boolean bl) {
        }

        @Override
        public void b(Fragment fragment, boolean bl) {
        }
    }

    static interface b {
        public void a(Fragment var1, boolean var2);

        public void b(Fragment var1, boolean var2);
    }

    static class c
    extends a {
        c() {
        }

        @Override
        public final void a(Fragment fragment, boolean bl) {
            android.support.a.a.b.a(fragment, bl);
        }
    }

    static final class d
    extends c {
        d() {
        }

        @Override
        public final void b(Fragment fragment, boolean bl) {
            android.support.a.a.c.a(fragment, bl);
        }
    }
}

