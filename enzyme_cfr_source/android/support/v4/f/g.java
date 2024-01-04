/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  android.os.Build$VERSION
 *  android.view.View
 *  android.widget.PopupWindow
 */
package android.support.v4.f;

import android.os.Build;
import android.support.v4.f.h;
import android.view.View;
import android.widget.PopupWindow;

public final class g {
    static final c a;

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    static {
        if (Build.VERSION.SDK_INT >= 19) {
            a = new b();
            return;
        }
        a = new a();
    }

    public static void a(PopupWindow popupWindow, View view, int n2, int n3, int n4) {
        a.a(popupWindow, view, n2, n3, n4);
    }

    static class a
    implements c {
        a() {
        }

        @Override
        public void a(PopupWindow popupWindow, View view, int n2, int n3, int n4) {
            popupWindow.showAsDropDown(view, n2, n3);
        }
    }

    static final class b
    extends a {
        b() {
        }

        @Override
        public final void a(PopupWindow popupWindow, View view, int n2, int n3, int n4) {
            h.a(popupWindow, view, n2, n3, n4);
        }
    }

    static interface c {
        public void a(PopupWindow var1, View var2, int var3, int var4, int var5);
    }
}

