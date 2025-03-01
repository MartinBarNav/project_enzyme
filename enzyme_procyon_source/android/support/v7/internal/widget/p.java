// 
// Decompiled by Procyon v0.5.36
// 

package android.support.v7.internal.widget;

import android.graphics.drawable.Drawable;
import android.content.res.Resources;

final class p extends Resources
{
    private final o a;
    
    public p(final Resources resources, final o a) {
        super(resources.getAssets(), resources.getDisplayMetrics(), resources.getConfiguration());
        this.a = a;
    }
    
    public final Drawable getDrawable(final int n) {
        final Drawable drawable = super.getDrawable(n);
        if (drawable != null) {
            this.a.a(n, drawable);
        }
        return drawable;
    }
}
