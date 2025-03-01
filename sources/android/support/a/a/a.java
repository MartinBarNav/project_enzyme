package android.support.a.a;

import android.app.Fragment;
import android.os.Build;

public final class a {
    static final b a;

    interface b {
        void a(Fragment fragment, boolean z);

        void b(Fragment fragment, boolean z);
    }

    /* renamed from: android.support.a.a.a$a  reason: collision with other inner class name */
    static class C0000a implements b {
        C0000a() {
        }

        public void a(Fragment fragment, boolean z) {
        }

        public void b(Fragment fragment, boolean z) {
        }
    }

    static class c extends C0000a {
        c() {
        }

        public final void a(Fragment fragment, boolean z) {
            b.a(fragment, z);
        }
    }

    static class d extends c {
        d() {
        }

        public final void b(Fragment fragment, boolean z) {
            c.a(fragment, z);
        }
    }

    static {
        if (Build.VERSION.SDK_INT >= 15) {
            a = new d();
        } else if (Build.VERSION.SDK_INT >= 14) {
            a = new c();
        } else {
            a = new C0000a();
        }
    }

    public static void a(Fragment fragment, boolean z) {
        a.a(fragment, z);
    }

    public static void b(Fragment fragment, boolean z) {
        a.b(fragment, z);
    }
}
