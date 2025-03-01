// 
// Decompiled by Procyon v0.5.36
// 

package android.support.v4.view.a;

import android.os.Bundle;
import java.util.List;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;

final class f
{
    public static Object a(final a a) {
        return new AccessibilityNodeProvider() {
            public final AccessibilityNodeInfo createAccessibilityNodeInfo(final int n) {
                a.c();
                return null;
            }
            
            public final List<AccessibilityNodeInfo> findAccessibilityNodeInfosByText(final String s, final int n) {
                return (List<AccessibilityNodeInfo>)a.b();
            }
            
            public final AccessibilityNodeInfo findFocus(final int n) {
                a.d();
                return null;
            }
            
            public final boolean performAction(final int n, final int n2, final Bundle bundle) {
                return a.a();
            }
        };
    }
    
    interface a
    {
        boolean a();
        
        List<Object> b();
        
        Object c();
        
        Object d();
    }
}
