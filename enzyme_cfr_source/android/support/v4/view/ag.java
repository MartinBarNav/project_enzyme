/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  android.animation.Animator
 *  android.animation.Animator$AnimatorListener
 *  android.animation.AnimatorListenerAdapter
 *  android.view.View
 */
package android.support.v4.view;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.support.v4.view.ah;
import android.view.View;

final class ag {
    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static void a(final View view, final ah ah2) {
        if (ah2 != null) {
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
            return;
        }
        view.animate().setListener(null);
    }
}

