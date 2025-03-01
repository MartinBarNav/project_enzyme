// 
// Decompiled by Procyon v0.5.36
// 

package android.support.v4.a.a;

import android.graphics.PorterDuff$Mode;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;

final class d
{
    public static void a(final Drawable drawable, final float n, final float n2) {
        drawable.setHotspot(n, n2);
    }
    
    public static void a(final Drawable drawable, final int tint) {
        drawable.setTint(tint);
    }
    
    public static void a(final Drawable drawable, final int n, final int n2, final int n3, final int n4) {
        drawable.setHotspotBounds(n, n2, n3, n4);
    }
    
    public static void a(final Drawable drawable, final ColorStateList tintList) {
        drawable.setTintList(tintList);
    }
    
    public static void a(final Drawable drawable, final PorterDuff$Mode tintMode) {
        drawable.setTintMode(tintMode);
    }
}
