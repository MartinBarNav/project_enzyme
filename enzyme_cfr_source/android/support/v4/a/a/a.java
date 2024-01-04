/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  android.content.res.ColorStateList
 *  android.graphics.PorterDuff$Mode
 *  android.graphics.drawable.Drawable
 *  android.os.Build$VERSION
 */
package android.support.v4.a.a;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;

public final class a {
    static final b a;

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    static {
        int n2 = Build.VERSION.SDK_INT;
        if (n2 >= 21) {
            a = new e();
            return;
        }
        if (n2 >= 19) {
            a = new d();
            return;
        }
        if (n2 >= 11) {
            a = new c();
            return;
        }
        a = new a();
    }

    public static void a(Drawable drawable) {
        a.a(drawable);
    }

    public static void a(Drawable drawable, float f2, float f3) {
        a.a(drawable, f2, f3);
    }

    public static void a(Drawable drawable, int n2) {
        a.a(drawable, n2);
    }

    public static void a(Drawable drawable, int n2, int n3, int n4, int n5) {
        a.a(drawable, n2, n3, n4, n5);
    }

    public static void a(Drawable drawable, ColorStateList colorStateList) {
        a.a(drawable, colorStateList);
    }

    public static void a(Drawable drawable, PorterDuff.Mode mode) {
        a.a(drawable, mode);
    }

    public static void a(Drawable drawable, boolean bl) {
        a.a(drawable, bl);
    }

    public static boolean b(Drawable drawable) {
        return a.b(drawable);
    }

    static class a
    implements b {
        a() {
        }

        @Override
        public void a(Drawable drawable) {
        }

        @Override
        public void a(Drawable drawable, float f2, float f3) {
        }

        @Override
        public void a(Drawable drawable, int n2) {
        }

        @Override
        public void a(Drawable drawable, int n2, int n3, int n4, int n5) {
        }

        @Override
        public void a(Drawable drawable, ColorStateList colorStateList) {
        }

        @Override
        public void a(Drawable drawable, PorterDuff.Mode mode) {
        }

        @Override
        public void a(Drawable drawable, boolean bl) {
        }

        @Override
        public boolean b(Drawable drawable) {
            return false;
        }
    }

    static interface b {
        public void a(Drawable var1);

        public void a(Drawable var1, float var2, float var3);

        public void a(Drawable var1, int var2);

        public void a(Drawable var1, int var2, int var3, int var4, int var5);

        public void a(Drawable var1, ColorStateList var2);

        public void a(Drawable var1, PorterDuff.Mode var2);

        public void a(Drawable var1, boolean var2);

        public boolean b(Drawable var1);
    }

    static class c
    extends a {
        c() {
        }

        @Override
        public final void a(Drawable drawable) {
            android.support.v4.a.a.b.a(drawable);
        }
    }

    static class d
    extends c {
        d() {
        }

        @Override
        public final void a(Drawable drawable, boolean bl) {
            android.support.v4.a.a.c.a(drawable, bl);
        }

        @Override
        public final boolean b(Drawable drawable) {
            return android.support.v4.a.a.c.a(drawable);
        }
    }

    static final class e
    extends d {
        e() {
        }

        @Override
        public final void a(Drawable drawable, float f2, float f3) {
            android.support.v4.a.a.d.a(drawable, f2, f3);
        }

        @Override
        public final void a(Drawable drawable, int n2) {
            android.support.v4.a.a.d.a(drawable, n2);
        }

        @Override
        public final void a(Drawable drawable, int n2, int n3, int n4, int n5) {
            android.support.v4.a.a.d.a(drawable, n2, n3, n4, n5);
        }

        @Override
        public final void a(Drawable drawable, ColorStateList colorStateList) {
            android.support.v4.a.a.d.a(drawable, colorStateList);
        }

        @Override
        public final void a(Drawable drawable, PorterDuff.Mode mode) {
            android.support.v4.a.a.d.a(drawable, mode);
        }
    }
}

