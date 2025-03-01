package android.support.v4.view;

import android.animation.ValueAnimator;
import android.graphics.Paint;
import android.view.View;

final class x {
    static long a() {
        return ValueAnimator.getFrameDelay();
    }

    public static void a(View view, int i) {
        view.setLayerType(i, (Paint) null);
    }

    public static int a(int i, int i2, int i3) {
        return View.resolveSizeAndState(i, i2, i3);
    }

    public static int a(View view) {
        return view.getMeasuredState();
    }

    public static float b(View view) {
        return view.getTranslationY();
    }

    public static void a(View view, float f) {
        view.setTranslationX(f);
    }

    public static void b(View view, float f) {
        view.setTranslationY(f);
    }

    public static void c(View view) {
        view.setScaleY(0.0f);
    }

    public static void d(View view) {
        view.jumpDrawablesToCurrentState();
    }
}
