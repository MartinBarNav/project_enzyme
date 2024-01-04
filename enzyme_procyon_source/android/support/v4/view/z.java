// 
// Decompiled by Procyon v0.5.36
// 

package android.support.v4.view;

import android.view.View;

final class z
{
    public static void a(final View view) {
        view.postInvalidateOnAnimation();
    }
    
    public static void a(final View view, final Runnable runnable) {
        view.postOnAnimation(runnable);
    }
    
    public static void a(final View view, final Runnable runnable, final long n) {
        view.postOnAnimationDelayed(runnable, n);
    }
    
    public static int b(final View view) {
        return view.getImportantForAccessibility();
    }
    
    public static void c(final View view) {
        view.setImportantForAccessibility(1);
    }
    
    public static int d(final View view) {
        return view.getMinimumHeight();
    }
    
    public static void e(final View view) {
        view.requestFitSystemWindows();
    }
}
