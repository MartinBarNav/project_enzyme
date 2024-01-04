// 
// Decompiled by Procyon v0.5.36
// 

package android.support.v4.content;

import android.os.Build$VERSION;
import android.graphics.drawable.Drawable;
import android.content.Context;

public final class a
{
    public static final Drawable a(final Context context, final int n) {
        Drawable drawable;
        if (Build$VERSION.SDK_INT >= 21) {
            drawable = b.a(context, n);
        }
        else {
            drawable = context.getResources().getDrawable(n);
        }
        return drawable;
    }
}
