/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.graphics.drawable.Drawable
 *  android.os.Build$VERSION
 */
package android.support.v4.content;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.support.v4.content.b;

public final class a {
    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static final Drawable a(Context context, int n2) {
        if (Build.VERSION.SDK_INT < 21) return context.getResources().getDrawable(n2);
        return b.a(context, n2);
    }
}

