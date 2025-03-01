// 
// Decompiled by Procyon v0.5.36
// 

package android.support.v4.view.a;

import android.view.accessibility.AccessibilityRecord;

final class h
{
    public static Object a() {
        return AccessibilityRecord.obtain();
    }
    
    public static void a(final Object o, final int fromIndex) {
        ((AccessibilityRecord)o).setFromIndex(fromIndex);
    }
    
    public static void a(final Object o, final boolean scrollable) {
        ((AccessibilityRecord)o).setScrollable(scrollable);
    }
    
    public static void b(final Object o, final int itemCount) {
        ((AccessibilityRecord)o).setItemCount(itemCount);
    }
    
    public static void c(final Object o, final int toIndex) {
        ((AccessibilityRecord)o).setToIndex(toIndex);
    }
}
