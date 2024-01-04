/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  android.os.Build$VERSION
 *  android.view.KeyEvent
 */
package android.support.v4.view;

import android.os.Build;
import android.support.v4.view.h;
import android.view.KeyEvent;

public final class g {
    static final d a;

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    static {
        if (Build.VERSION.SDK_INT >= 11) {
            a = new c();
            return;
        }
        a = new a();
    }

    public static boolean a(KeyEvent keyEvent) {
        return a.b(keyEvent.getMetaState());
    }

    public static boolean b(KeyEvent keyEvent) {
        return a.c(keyEvent.getMetaState());
    }

    static class a
    implements d {
        a() {
        }

        /*
         * Enabled aggressive block sorting
         */
        private static int a(int n2, int n3, int n4, int n5) {
            int n6 = 1;
            boolean bl = (n3 & 1) != 0;
            n5 = ((n4 |= n5) & 1) != 0 ? n6 : 0;
            if (!bl) {
                n4 = n2;
                if (n5 == 0) return n4;
                return n2 & ~n3;
            }
            if (n5 == 0) return n2 & ~n4;
            throw new IllegalArgumentException("bad arguments");
        }

        public int a(int n2) {
            if ((n2 & 0xC0) != 0) {
                n2 |= 1;
            }
            int n3 = n2;
            if ((n2 & 0x30) != 0) {
                n3 = n2 | 2;
            }
            return n3 & 0xF7;
        }

        /*
         * Enabled force condition propagation
         * Lifted jumps to return sites
         */
        @Override
        public boolean b(int n2) {
            boolean bl = true;
            if (android.support.v4.view.g$a.a(android.support.v4.view.g$a.a(this.a(n2) & 0xF7, 1, 64, 128), 2, 16, 32) != 1) return false;
            return bl;
        }

        /*
         * Enabled force condition propagation
         * Lifted jumps to return sites
         */
        @Override
        public boolean c(int n2) {
            if ((this.a(n2) & 0xF7) != 0) return false;
            return true;
        }
    }

    static class b
    extends a {
        b() {
        }
    }

    static final class c
    extends b {
        c() {
        }

        @Override
        public final int a(int n2) {
            return h.a(n2);
        }

        @Override
        public final boolean b(int n2) {
            return h.b(n2);
        }

        @Override
        public final boolean c(int n2) {
            return h.c(n2);
        }
    }

    static interface d {
        public boolean b(int var1);

        public boolean c(int var1);
    }
}

