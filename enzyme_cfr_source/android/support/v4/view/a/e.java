/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 *  android.view.accessibility.AccessibilityNodeInfo
 *  android.view.accessibility.AccessibilityNodeProvider
 */
package android.support.v4.view.a;

import android.os.Bundle;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import java.util.List;

final class e {
    public static Object a(final a a2) {
        return new AccessibilityNodeProvider(){

            public final AccessibilityNodeInfo createAccessibilityNodeInfo(int n2) {
                a2.c();
                return null;
            }

            public final List<AccessibilityNodeInfo> findAccessibilityNodeInfosByText(String string, int n2) {
                return a2.b();
            }

            public final boolean performAction(int n2, int n3, Bundle bundle) {
                return a2.a();
            }
        };
    }

    static interface a {
        public boolean a();

        public List<Object> b();

        public Object c();
    }
}

