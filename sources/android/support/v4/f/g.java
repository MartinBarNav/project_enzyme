package android.support.v4.f;

import android.os.Build;
import android.view.View;
import android.widget.PopupWindow;

public final class g {
    static final c a;

    interface c {
        void a(PopupWindow popupWindow, View view, int i, int i2, int i3);
    }

    static class a implements c {
        a() {
        }

        public void a(PopupWindow popupWindow, View view, int i, int i2, int i3) {
            popupWindow.showAsDropDown(view, i, i2);
        }
    }

    static class b extends a {
        b() {
        }

        public final void a(PopupWindow popupWindow, View view, int i, int i2, int i3) {
            h.a(popupWindow, view, i, i2, i3);
        }
    }

    static {
        if (Build.VERSION.SDK_INT >= 19) {
            a = new b();
        } else {
            a = new a();
        }
    }

    public static void a(PopupWindow popupWindow, View view, int i, int i2, int i3) {
        a.a(popupWindow, view, i, i2, i3);
    }
}
