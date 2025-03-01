/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.view.animation.Interpolator
 *  android.widget.OverScroller
 */
package android.support.v4.f;

import android.content.Context;
import android.view.animation.Interpolator;
import android.widget.OverScroller;

final class k {
    public static int a(Object object) {
        return ((OverScroller)object).getFinalY();
    }

    public static Object a(Context context, Interpolator interpolator) {
        return new OverScroller(context);
    }

    public static void a(Object object, int n2) {
        ((OverScroller)object).fling(0, 0, 0, n2, 0, 0, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }
}

