/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  android.graphics.drawable.Drawable
 */
package android.support.v4.a.a;

import android.graphics.drawable.Drawable;

final class c {
    public static void a(Drawable drawable, boolean bl) {
        drawable.setAutoMirrored(bl);
    }

    public static boolean a(Drawable drawable) {
        return drawable.isAutoMirrored();
    }
}

