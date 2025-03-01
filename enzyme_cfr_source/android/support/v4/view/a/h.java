/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  android.view.accessibility.AccessibilityRecord
 */
package android.support.v4.view.a;

import android.view.accessibility.AccessibilityRecord;

final class h {
    public static Object a() {
        return AccessibilityRecord.obtain();
    }

    public static void a(Object object, int n2) {
        ((AccessibilityRecord)object).setFromIndex(n2);
    }

    public static void a(Object object, boolean bl) {
        ((AccessibilityRecord)object).setScrollable(bl);
    }

    public static void b(Object object, int n2) {
        ((AccessibilityRecord)object).setItemCount(n2);
    }

    public static void c(Object object, int n2) {
        ((AccessibilityRecord)object).setToIndex(n2);
    }
}

