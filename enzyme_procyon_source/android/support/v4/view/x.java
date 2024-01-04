// 
// Decompiled by Procyon v0.5.36
// 

package android.support.v4.view;

import android.graphics.Paint;
import android.animation.ValueAnimator;
import android.view.View;

final class x
{
    public static int a(final int n, final int n2, final int n3) {
        return View.resolveSizeAndState(n, n2, n3);
    }
    
    public static int a(final View view) {
        return view.getMeasuredState();
    }
    
    static long a() {
        return ValueAnimator.getFrameDelay();
    }
    
    public static void a(final View view, final float translationX) {
        view.setTranslationX(translationX);
    }
    
    public static void a(final View view, final int n) {
        view.setLayerType(n, (Paint)null);
    }
    
    public static float b(final View view) {
        return view.getTranslationY();
    }
    
    public static void b(final View view, final float translationY) {
        view.setTranslationY(translationY);
    }
    
    public static void c(final View view) {
        view.setScaleY(0.0f);
    }
    
    public static void d(final View view) {
        view.jumpDrawablesToCurrentState();
    }
}
