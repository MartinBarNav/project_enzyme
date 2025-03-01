package android.support.v4.d;

import android.os.Build;

public final class a {
    private static final C0003a a;

    /* renamed from: android.support.v4.d.a$a  reason: collision with other inner class name */
    interface C0003a {
        String a(String str);

        String b(String str);
    }

    static class b implements C0003a {
        b() {
        }

        public final String a(String str) {
            return null;
        }

        public final String b(String str) {
            return str;
        }
    }

    static class c implements C0003a {
        c() {
        }

        public final String a(String str) {
            return b.a(str);
        }

        public final String b(String str) {
            return b.b(str);
        }
    }

    static {
        if (Build.VERSION.SDK_INT >= 14) {
            a = new c();
        } else {
            a = new b();
        }
    }

    public static String a(String str) {
        return a.a(str);
    }

    public static String b(String str) {
        return a.b(str);
    }
}
