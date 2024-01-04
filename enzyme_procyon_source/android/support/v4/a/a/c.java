// 
// Decompiled by Procyon v0.5.36
// 

package android.support.v4.a.a;

import android.graphics.drawable.Drawable;

final class c
{
    public static void a(final Drawable drawable, final boolean autoMirrored) {
        drawable.setAutoMirrored(autoMirrored);
    }
    
    public static boolean a(final Drawable drawable) {
        return drawable.isAutoMirrored();
    }
}
