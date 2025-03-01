/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  android.animation.Animator
 *  android.animation.Animator$AnimatorListener
 *  android.animation.AnimatorListenerAdapter
 *  android.animation.TimeInterpolator
 *  android.view.View
 *  android.view.animation.Interpolator
 */
package android.support.v4.view;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.support.v4.view.ah;
import android.view.View;
import android.view.animation.Interpolator;

final class af {
    public static void a(View view) {
        view.animate().translationX(0.0f);
    }

    public static void a(View view, float f2) {
        view.animate().translationY(f2);
    }

    public static void a(View view, long l2) {
        view.animate().setDuration(l2);
    }

    public static void a(final View view, final ah ah2) {
        view.animate().setListener((Animator.AnimatorListener)new AnimatorListenerAdapter(){

            public final void onAnimationCancel(Animator animator) {
                ah2.c(view);
            }

            public final void onAnimationEnd(Animator animator) {
                ah2.b(view);
            }

            public final void onAnimationStart(Animator animator) {
                ah2.a(view);
            }
        });
    }

    public static void a(View view, Interpolator interpolator) {
        view.animate().setInterpolator((TimeInterpolator)interpolator);
    }

    public static void b(View view) {
        view.animate().scaleY(1.0f);
    }

    public static void c(View view) {
        view.animate().cancel();
    }

    public static void d(View view) {
        view.animate().start();
    }
}

