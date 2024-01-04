/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  android.view.KeyEvent
 */
package android.support.v4.view;

import android.view.KeyEvent;

final class h {
    public static int a(int n2) {
        return KeyEvent.normalizeMetaState((int)n2);
    }

    public static boolean b(int n2) {
        return KeyEvent.metaStateHasModifiers((int)n2, (int)1);
    }

    public static boolean c(int n2) {
        return KeyEvent.metaStateHasNoModifiers((int)n2);
    }
}

