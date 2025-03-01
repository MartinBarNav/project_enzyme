package android.support.v4.view;

import android.view.KeyEvent;

final class h {
    public static int a(int i) {
        return KeyEvent.normalizeMetaState(i);
    }

    public static boolean b(int i) {
        return KeyEvent.metaStateHasModifiers(i, 1);
    }

    public static boolean c(int i) {
        return KeyEvent.metaStateHasNoModifiers(i);
    }
}
