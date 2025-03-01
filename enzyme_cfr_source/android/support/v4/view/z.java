/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  android.view.View
 */
package android.support.v4.view;

import android.view.View;

final class z {
    public static void a(View view) {
        view.postInvalidateOnAnimation();
    }

    public static void a(View view, Runnable runnable) {
        view.postOnAnimation(runnable);
    }

    public static void a(View view, Runnable runnable, long l2) {
        view.postOnAnimationDelayed(runnable, l2);
    }

    public static int b(View view) {
        return view.getImportantForAccessibility();
    }

    public static void c(View view) {
        view.setImportantForAccessibility(1);
    }

    public static int d(View view) {
        return view.getMinimumHeight();
    }

    public static void e(View view) {
        view.requestFitSystemWindows();
    }
}

