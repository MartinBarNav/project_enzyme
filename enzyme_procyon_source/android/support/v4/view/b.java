// 
// Decompiled by Procyon v0.5.36
// 

package android.support.v4.view;

import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityEvent;
import android.view.View;
import android.view.View$AccessibilityDelegate;

final class b
{
    public static Object a() {
        return new View$AccessibilityDelegate();
    }
    
    public static Object a(final a a) {
        return new View$AccessibilityDelegate() {
            public final boolean dispatchPopulateAccessibilityEvent(final View view, final AccessibilityEvent accessibilityEvent) {
                return a.a(view, accessibilityEvent);
            }
            
            public final void onInitializeAccessibilityEvent(final View view, final AccessibilityEvent accessibilityEvent) {
                a.b(view, accessibilityEvent);
            }
            
            public final void onInitializeAccessibilityNodeInfo(final View view, final AccessibilityNodeInfo accessibilityNodeInfo) {
                a.a(view, accessibilityNodeInfo);
            }
            
            public final void onPopulateAccessibilityEvent(final View view, final AccessibilityEvent accessibilityEvent) {
                a.c(view, accessibilityEvent);
            }
            
            public final boolean onRequestSendAccessibilityEvent(final ViewGroup viewGroup, final View view, final AccessibilityEvent accessibilityEvent) {
                return a.a(viewGroup, view, accessibilityEvent);
            }
            
            public final void sendAccessibilityEvent(final View view, final int n) {
                a.a(view, n);
            }
            
            public final void sendAccessibilityEventUnchecked(final View view, final AccessibilityEvent accessibilityEvent) {
                a.d(view, accessibilityEvent);
            }
        };
    }
    
    public static void a(final Object o, final View view, final int n) {
        ((View$AccessibilityDelegate)o).sendAccessibilityEvent(view, n);
    }
    
    public static void a(final Object o, final View view, final Object o2) {
        ((View$AccessibilityDelegate)o).onInitializeAccessibilityNodeInfo(view, (AccessibilityNodeInfo)o2);
    }
    
    public static boolean a(final Object o, final View view, final AccessibilityEvent accessibilityEvent) {
        return ((View$AccessibilityDelegate)o).dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
    }
    
    public static boolean a(final Object o, final ViewGroup viewGroup, final View view, final AccessibilityEvent accessibilityEvent) {
        return ((View$AccessibilityDelegate)o).onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
    }
    
    public static void b(final Object o, final View view, final AccessibilityEvent accessibilityEvent) {
        ((View$AccessibilityDelegate)o).onInitializeAccessibilityEvent(view, accessibilityEvent);
    }
    
    public static void c(final Object o, final View view, final AccessibilityEvent accessibilityEvent) {
        ((View$AccessibilityDelegate)o).onPopulateAccessibilityEvent(view, accessibilityEvent);
    }
    
    public static void d(final Object o, final View view, final AccessibilityEvent accessibilityEvent) {
        ((View$AccessibilityDelegate)o).sendAccessibilityEventUnchecked(view, accessibilityEvent);
    }
    
    public interface a
    {
        void a(final View p0, final int p1);
        
        void a(final View p0, final Object p1);
        
        boolean a(final View p0, final AccessibilityEvent p1);
        
        boolean a(final ViewGroup p0, final View p1, final AccessibilityEvent p2);
        
        void b(final View p0, final AccessibilityEvent p1);
        
        void c(final View p0, final AccessibilityEvent p1);
        
        void d(final View p0, final AccessibilityEvent p1);
    }
}
