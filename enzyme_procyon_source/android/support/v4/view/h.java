// 
// Decompiled by Procyon v0.5.36
// 

package android.support.v4.view;

import android.view.KeyEvent;

final class h
{
    public static int a(final int n) {
        return KeyEvent.normalizeMetaState(n);
    }
    
    public static boolean b(final int n) {
        return KeyEvent.metaStateHasModifiers(n, 1);
    }
    
    public static boolean c(final int n) {
        return KeyEvent.metaStateHasNoModifiers(n);
    }
}
