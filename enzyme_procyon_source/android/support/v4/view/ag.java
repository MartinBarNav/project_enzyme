// 
// Decompiled by Procyon v0.5.36
// 

package android.support.v4.view;

import android.animation.Animator$AnimatorListener;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;

final class ag
{
    public static void a(final View view, final ah ah) {
        if (ah != null) {
            view.animate().setListener((Animator$AnimatorListener)new AnimatorListenerAdapter() {
                public final void onAnimationCancel(final Animator animator) {
                    ah.c(view);
                }
                
                public final void onAnimationEnd(final Animator animator) {
                    ah.b(view);
                }
                
                public final void onAnimationStart(final Animator animator) {
                    ah.a(view);
                }
            });
        }
        else {
            view.animate().setListener((Animator$AnimatorListener)null);
        }
    }
}
