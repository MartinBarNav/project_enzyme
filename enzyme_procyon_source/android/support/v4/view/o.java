// 
// Decompiled by Procyon v0.5.36
// 

package android.support.v4.view;

import android.view.MotionEvent;

final class o
{
    public static int a(final MotionEvent motionEvent, final int n) {
        return motionEvent.findPointerIndex(n);
    }
    
    public static int b(final MotionEvent motionEvent, final int n) {
        return motionEvent.getPointerId(n);
    }
    
    public static float c(final MotionEvent motionEvent, final int n) {
        return motionEvent.getX(n);
    }
    
    public static float d(final MotionEvent motionEvent, final int n) {
        return motionEvent.getY(n);
    }
}
