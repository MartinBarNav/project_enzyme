package android.support.v4.view;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;

final class c {

    public interface a {
        Object a(View view);

        void a(View view, int i);

        void a(View view, Object obj);

        boolean a(View view, int i, Bundle bundle);

        boolean a(View view, AccessibilityEvent accessibilityEvent);

        boolean a(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent);

        void b(View view, AccessibilityEvent accessibilityEvent);

        void c(View view, AccessibilityEvent accessibilityEvent);

        void d(View view, AccessibilityEvent accessibilityEvent);
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

            public final AccessibilityNodeProvider getAccessibilityNodeProvider(View view) {
                return (AccessibilityNodeProvider) aVar.a(view);
            }

            public final boolean performAccessibilityAction(View view, int i, Bundle bundle) {
                return aVar.a(view, i, bundle);
            }
        };
    }

    public static Object a(Object obj, View view) {
        return ((View.AccessibilityDelegate) obj).getAccessibilityNodeProvider(view);
    }

    public static boolean a(Object obj, View view, int i, Bundle bundle) {
        return ((View.AccessibilityDelegate) obj).performAccessibilityAction(view, i, bundle);
    }
}
