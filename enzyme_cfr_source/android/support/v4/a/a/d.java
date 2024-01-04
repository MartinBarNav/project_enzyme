/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  android.content.res.ColorStateList
 *  android.graphics.PorterDuff$Mode
 *  android.graphics.drawable.Drawable
 */
package android.support.v4.a.a;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;

final class d {
    public static void a(Drawable drawable, float f2, float f3) {
        drawable.setHotspot(f2, f3);
    }

    public static void a(Drawable drawable, int n2) {
        drawable.setTint(n2);
    }

    public static void a(Drawable drawable, int n2, int n3, int n4, int n5) {
        drawable.setHotspotBounds(n2, n3, n4, n5);
    }

    public static void a(Drawable drawable, ColorStateList colorStateList) {
        drawable.setTintList(colorStateList);
    }

    public static void a(Drawable drawable, PorterDuff.Mode mode) {
        drawable.setTintMode(mode);
    }
}

