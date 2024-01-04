/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  android.graphics.Rect
 *  android.view.accessibility.AccessibilityNodeInfo
 */
package android.support.v4.view.a;

import android.graphics.Rect;
import android.view.accessibility.AccessibilityNodeInfo;

final class b {
    public static int a(Object object) {
        return ((AccessibilityNodeInfo)object).getActions();
    }

    public static void a(Object object, int n2) {
        ((AccessibilityNodeInfo)object).addAction(n2);
    }

    public static void a(Object object, Rect rect) {
        ((AccessibilityNodeInfo)object).getBoundsInParent(rect);
    }

    public static void a(Object object, CharSequence charSequence) {
        ((AccessibilityNodeInfo)object).setClassName(charSequence);
    }

    public static void a(Object object, boolean bl) {
        ((AccessibilityNodeInfo)object).setScrollable(bl);
    }

    public static CharSequence b(Object object) {
        return ((AccessibilityNodeInfo)object).getClassName();
    }

    public static void b(Object object, Rect rect) {
        ((AccessibilityNodeInfo)object).getBoundsInScreen(rect);
    }

    public static CharSequence c(Object object) {
        return ((AccessibilityNodeInfo)object).getContentDescription();
    }

    public static CharSequence d(Object object) {
        return ((AccessibilityNodeInfo)object).getPackageName();
    }

    public static CharSequence e(Object object) {
        return ((AccessibilityNodeInfo)object).getText();
    }

    public static boolean f(Object object) {
        return ((AccessibilityNodeInfo)object).isCheckable();
    }

    public static boolean g(Object object) {
        return ((AccessibilityNodeInfo)object).isChecked();
    }

    public static boolean h(Object object) {
        return ((AccessibilityNodeInfo)object).isClickable();
    }

    public static boolean i(Object object) {
        return ((AccessibilityNodeInfo)object).isEnabled();
    }

    public static boolean j(Object object) {
        return ((AccessibilityNodeInfo)object).isFocusable();
    }

    public static boolean k(Object object) {
        return ((AccessibilityNodeInfo)object).isFocused();
    }

    public static boolean l(Object object) {
        return ((AccessibilityNodeInfo)object).isLongClickable();
    }

    public static boolean m(Object object) {
        return ((AccessibilityNodeInfo)object).isPassword();
    }

    public static boolean n(Object object) {
        return ((AccessibilityNodeInfo)object).isScrollable();
    }

    public static boolean o(Object object) {
        return ((AccessibilityNodeInfo)object).isSelected();
    }
}

