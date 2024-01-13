package android.support.v4.view;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.animation.Interpolator;

final class af {
    public static void a(View view, long j) {
        view.animate().setDuration(j);
    }

    public static void a(View view) {
        view.animate().translationX(0.0f);
    }

    public static void a(View view, float f) {
        view.animate().translationY(f);
    }

    public static void a(View view, Interpolator interpolator) {
        view.animate().setInterpolator(interpolator);
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

    public static void a(final View view, final ah ahVar) {
        view.animate().setListener(new AnimatorListenerAdapter() {
            public final void onAnimationCancel(Animator animator) {
                ahVar.c(view);
            }

            public final void onAnimationEnd(Animator animator) {
                ahVar.b(view);
            }

            public final void onAnimationStart(Animator animator) {
                ahVar.a(view);
            }
        });
    }
}
