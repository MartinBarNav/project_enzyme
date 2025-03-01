// 
// Decompiled by Procyon v0.5.36
// 

package android.support.v4.f;

import android.view.animation.Interpolator;
import android.content.Context;
import android.widget.OverScroller;

final class k
{
    public static int a(final Object o) {
        return ((OverScroller)o).getFinalY();
    }
    
    public static Object a(final Context context, final Interpolator interpolator) {
        return new OverScroller(context);
    }
    
    public static void a(final Object o, final int n) {
        ((OverScroller)o).fling(0, 0, 0, n, 0, 0, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }
}
