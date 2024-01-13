package android.support.v4.f;

import android.content.Context;
import android.view.animation.Interpolator;
import android.widget.OverScroller;

final class k {
    public static Object a(Context context, Interpolator interpolator) {
        return new OverScroller(context);
    }

    public static void a(Object obj, int i) {
        ((OverScroller) obj).fling(0, 0, 0, i, 0, 0, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }

    public static int a(Object obj) {
        return ((OverScroller) obj).getFinalY();
    }
}
