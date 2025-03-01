/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  android.os.Build$VERSION
 */
package android.support.v4.d;

import android.os.Build;

public final class a {
    private static final a a;

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    static {
        if (Build.VERSION.SDK_INT >= 14) {
            a = new c();
            return;
        }
        a = new b();
    }

    public static String a(String string) {
        return a.a(string);
    }

    public static String b(String string) {
        return a.b(string);
    }

    static interface a {
        public String a(String var1);

        public String b(String var1);
    }

    static final class b
    implements a {
        b() {
        }

        @Override
        public final String a(String string) {
            return null;
        }

        @Override
        public final String b(String string) {
            return string;
        }
    }

    static final class c
    implements a {
        c() {
        }

        @Override
        public final String a(String string) {
            return android.support.v4.d.b.a(string);
        }

        @Override
        public final String b(String string) {
            return android.support.v4.d.b.b(string);
        }
    }
}

