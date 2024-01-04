/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.View$AccessibilityDelegate
 */
package android.support.v4.view;

import android.view.View;

final class y {
    public static void a(View view, Object object) {
        view.setAccessibilityDelegate((View.AccessibilityDelegate)object);
    }

    public static boolean a(View view, int n2) {
        return view.canScrollHorizontally(n2);
    }
}

