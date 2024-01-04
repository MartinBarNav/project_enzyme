/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  android.content.res.Resources
 *  android.graphics.drawable.Drawable
 */
package android.support.v7.internal.widget;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.support.v7.internal.widget.o;

final class p
extends Resources {
    private final o a;

    public p(Resources resources, o o2) {
        super(resources.getAssets(), resources.getDisplayMetrics(), resources.getConfiguration());
        this.a = o2;
    }

    public final Drawable getDrawable(int n2) {
        Drawable drawable = super.getDrawable(n2);
        if (drawable != null) {
            this.a.a(n2, drawable);
        }
        return drawable;
    }
}

