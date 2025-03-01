package android.support.v4.view;

import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;

final class b {

    public interface a {
        void a(View view, int i);

        void a(View view, Object obj);

        boolean a(View view, AccessibilityEvent accessibilityEvent);

        boolean a(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent);

        void b(View view, AccessibilityEvent accessibilityEvent);

        void c(View view, AccessibilityEvent accessibilityEvent);

        void d(View view, AccessibilityEvent accessibilityEvent);
    }

    public static Object a() {
        return new View.AccessibilityDelegate();
    }

    public static Object a(final a aVar) {
        return new View.AccessibilityDelegate() {
            public final boolean dispatchPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
                return aVar.a(view, accessibilityEvent);
            }

            public final void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
                aVar.b(view, accessibilityEvent);
            }

            public final void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
                aVar.a(view, (Object) accessibilityNodeInfo);
            }

            public final void onPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
                aVar.c(view, accessibilityEvent);
            }

            public final boolean onRequestSendAccessibilityEvent(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
                return aVar.a(viewGroup, view, accessibilityEvent);
            }

            public final void sendAccessibilityEvent(View view, int i) {
                aVar.a(view, i);
            }

            public final void sendAccessibilityEventUnchecked(View view, AccessibilityEvent accessibilityEvent) {
                aVar.d(view, accessibilityEvent);
            }
        };
    }

    public static boolean a(Object obj, View view, AccessibilityEvent accessibilityEvent) {
        return ((View.AccessibilityDelegate) obj).dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    public static void b(Object obj, View view, AccessibilityEvent accessibilityEvent) {
        ((View.AccessibilityDelegate) obj).onInitializeAccessibilityEvent(view, accessibilityEvent);
    }

    public static void a(Object obj, View view, Object obj2) {
        ((View.AccessibilityDelegate) obj).onInitializeAccessibilityNodeInfo(view, (AccessibilityNodeInfo) obj2);
    }

    public static void c(Object obj, View view, AccessibilityEvent accessibilityEvent) {
        ((View.AccessibilityDelegate) obj).onPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    public static boolean a(Object obj, ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        return ((View.AccessibilityDelegate) obj).onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
    }

    public static void a(Object obj, View view, int i) {
        ((View.AccessibilityDelegate) obj).sendAccessibilityEvent(view, i);
    }

    public static void d(Object obj, View view, AccessibilityEvent accessibilityEvent) {
        ((View.AccessibilityDelegate) obj).sendAccessibilityEventUnchecked(view, accessibilityEvent);
    }
}
