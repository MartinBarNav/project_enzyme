// 
// Decompiled by Procyon v0.5.36
// 

package android.support.v4.view;

import android.view.View$AccessibilityDelegate;
import android.view.View;

final class y
{
    public static void a(final View view, final Object o) {
        view.setAccessibilityDelegate((View$AccessibilityDelegate)o);
    }
    
    public static boolean a(final View view, final int n) {
        return view.canScrollHorizontally(n);
    }
}
