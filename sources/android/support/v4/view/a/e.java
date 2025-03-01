package android.support.v4.view.a;

import android.os.Bundle;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import java.util.List;

final class e {

    interface a {
        boolean a();

        List<Object> b();

        Object c();
    }

    public static Object a(final a aVar) {
        return new AccessibilityNodeProvider() {
            public final AccessibilityNodeInfo createAccessibilityNodeInfo(int i) {
                aVar.c();
                return null;
            }

            public final List<AccessibilityNodeInfo> findAccessibilityNodeInfosByText(String str, int i) {
                return aVar.b();
            }

            public final boolean performAction(int i, int i2, Bundle bundle) {
                return aVar.a();
            }
        };
    }
}
