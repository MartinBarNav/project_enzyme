// 
// Decompiled by Procyon v0.5.36
// 

package android.support.v4.view;

import android.animation.TimeInterpolator;
import android.view.animation.Interpolator;
import android.animation.Animator$AnimatorListener;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;

final class af
{
    public static void a(final View view) {
        view.animate().translationX(0.0f);
    }
    
    public static void a(final View view, final float n) {
        view.animate().translationY(n);
    }
    
    public static void a(final View view, final long duration) {
        view.animate().setDuration(duration);
    }
    
    public static void a(final View view, final ah ah) {
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
    
    public static void a(final View view, final Interpolator interpolator) {
        view.animate().setInterpolator((TimeInterpolator)interpolator);
    }
    
    public static void b(final View view) {
        view.animate().scaleY(1.0f);
    }
    
    public static void c(final View view) {
        view.animate().cancel();
    }
    
    public static void d(final View view) {
        view.animate().start();
    }
}
