package android.support.v4.a.a;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;

public final class a {
    static final b a;

    interface b {
        void a(Drawable drawable);

        void a(Drawable drawable, float f, float f2);

        void a(Drawable drawable, int i);

        void a(Drawable drawable, int i, int i2, int i3, int i4);

        void a(Drawable drawable, ColorStateList colorStateList);

        void a(Drawable drawable, PorterDuff.Mode mode);

        void a(Drawable drawable, boolean z);

        boolean b(Drawable drawable);
    }

    /* renamed from: android.support.v4.a.a.a$a  reason: collision with other inner class name */
    static class C0001a implements b {
        C0001a() {
        }

        public void a(Drawable drawable) {
        }

        public void a(Drawable drawable, boolean z) {
        }

        public boolean b(Drawable drawable) {
            return false;
        }

        public void a(Drawable drawable, float f, float f2) {
        }

        public void a(Drawable drawable, int i, int i2, int i3, int i4) {
        }

        public void a(Drawable drawable, int i) {
        }

        public void a(Drawable drawable, ColorStateList colorStateList) {
        }

        public void a(Drawable drawable, PorterDuff.Mode mode) {
        }
    }

    static class c extends C0001a {
        c() {
        }

        public final void a(Drawable drawable) {
            b.a(drawable);
        }
    }

    static class d extends c {
        d() {
        }

        public final void a(Drawable drawable, boolean z) {
            c.a(drawable, z);
        }

        public final boolean b(Drawable drawable) {
            return c.a(drawable);
        }
    }

    static class e extends d {
        e() {
        }

        public final void a(Drawable drawable, float f, float f2) {
            d.a(drawable, f, f2);
        }

        public final void a(Drawable drawable, int i, int i2, int i3, int i4) {
            d.a(drawable, i, i2, i3, i4);
        }

        public final void a(Drawable drawable, int i) {
            d.a(drawable, i);
        }

        public final void a(Drawable drawable, ColorStateList colorStateList) {
            d.a(drawable, colorStateList);
        }

        public final void a(Drawable drawable, PorterDuff.Mode mode) {
            d.a(drawable, mode);
        }
    }

    static {
        int i = Build.VERSION.SDK_INT;
        if (i >= 21) {
            a = new e();
        } else if (i >= 19) {
            a = new d();
        } else if (i >= 11) {
            a = new c();
        } else {
            a = new C0001a();
        }
    }

    public static void a(Drawable drawable) {
        a.a(drawable);
    }

    public static void a(Drawable drawable, boolean z) {
        a.a(drawable, z);
    }

    public static boolean b(Drawable drawable) {
        return a.b(drawable);
    }

    public static void a(Drawable drawable, float f, float f2) {
        a.a(drawable, f, f2);
    }

    public static void a(Drawable drawable, int i, int i2, int i3, int i4) {
        a.a(drawable, i, i2, i3, i4);
    }

    public static void a(Drawable drawable, int i) {
        a.a(drawable, i);
    }

    public static void a(Drawable drawable, ColorStateList colorStateList) {
        a.a(drawable, colorStateList);
    }

    public static void a(Drawable drawable, PorterDuff.Mode mode) {
        a.a(drawable, mode);
    }
}
