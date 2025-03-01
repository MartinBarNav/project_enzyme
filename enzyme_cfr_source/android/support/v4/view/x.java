/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  android.animation.ValueAnimator
 *  android.view.View
 */
package android.support.v4.view;

import android.animation.ValueAnimator;
import android.view.View;

final class x {
    public static int a(int n2, int n3, int n4) {
        return View.resolveSizeAndState((int)n2, (int)n3, (int)n4);
    }

    public static int a(View view) {
        return view.getMeasuredState();
    }

    static long a() {
        return ValueAnimator.getFrameDelay();
    }

    public static void a(View view, float f2) {
        view.setTranslationX(f2);
    }

    public static void a(View view, int n2) {
        view.setLayerType(n2, null);
    }

    public static float b(View view) {
        return view.getTranslationY();
    }

    public static void b(View view, float f2) {
        view.setTranslationY(f2);
    }

    public static void c(View view) {
        view.setScaleY(0.0f);
    }

    public static void d(View view) {
        view.jumpDrawablesToCurrentState();
    }
}

