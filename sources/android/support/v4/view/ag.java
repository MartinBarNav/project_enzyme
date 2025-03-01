package android.support.v4.view;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;

final class ag {
    public static void a(final View view, final ah ahVar) {
        if (ahVar != null) {
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
        } else {
            view.animate().setListener((Animator.AnimatorListener) null);
        }
    }
}
