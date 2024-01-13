package android.support.v7.internal.widget;

import android.annotation.TargetApi;
import android.content.Context;
import android.os.Build;
import android.support.v7.b.a;
import android.util.AttributeSet;
import android.view.View;
import android.widget.PopupWindow;

public final class e extends PopupWindow {
    private final boolean a;

    public e(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        q a2 = q.a(context, attributeSet, a.i.PopupWindow, i);
        this.a = a2.a(a.i.PopupWindow_overlapAnchor, false);
        setBackgroundDrawable(a2.a(a.i.PopupWindow_android_popupBackground));
        a2.a.recycle();
    }

    public final void showAsDropDown(View view, int i, int i2) {
        if (Build.VERSION.SDK_INT < 21 && this.a) {
            i2 -= view.getHeight();
        }
        super.showAsDropDown(view, i, i2);
    }

    @TargetApi(19)
    public final void showAsDropDown(View view, int i, int i2, int i3) {
        if (Build.VERSION.SDK_INT < 21 && this.a) {
            i2 -= view.getHeight();
        }
        super.showAsDropDown(view, i, i2, i3);
    }

    public final void update(View view, int i, int i2, int i3, int i4) {
        int i5;
        if (Build.VERSION.SDK_INT >= 21 || !this.a) {
            i5 = i2;
        } else {
            i5 = i2 - view.getHeight();
        }
        super.update(view, i, i5, i3, i4);
    }
}
