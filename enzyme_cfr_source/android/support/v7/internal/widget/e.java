/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  android.annotation.TargetApi
 *  android.content.Context
 *  android.os.Build$VERSION
 *  android.util.AttributeSet
 *  android.view.View
 *  android.widget.PopupWindow
 */
package android.support.v7.internal.widget;

import android.annotation.TargetApi;
import android.content.Context;
import android.os.Build;
import android.support.v7.b.a;
import android.support.v7.internal.widget.q;
import android.util.AttributeSet;
import android.view.View;
import android.widget.PopupWindow;

public final class e
extends PopupWindow {
    private final boolean a;

    public e(Context object, AttributeSet attributeSet, int n2) {
        super((Context)object, attributeSet, n2);
        object = q.a((Context)object, attributeSet, a.i.PopupWindow, n2);
        this.a = ((q)object).a(a.i.PopupWindow_overlapAnchor, false);
        this.setBackgroundDrawable(((q)object).a(a.i.PopupWindow_android_popupBackground));
        ((q)object).a.recycle();
    }

    public final void showAsDropDown(View view, int n2, int n3) {
        int n4 = n3;
        if (Build.VERSION.SDK_INT < 21) {
            n4 = n3;
            if (this.a) {
                n4 = n3 - view.getHeight();
            }
        }
        super.showAsDropDown(view, n2, n4);
    }

    @TargetApi(value=19)
    public final void showAsDropDown(View view, int n2, int n3, int n4) {
        int n5 = n3;
        if (Build.VERSION.SDK_INT < 21) {
            n5 = n3;
            if (this.a) {
                n5 = n3 - view.getHeight();
            }
        }
        super.showAsDropDown(view, n2, n5, n4);
    }

    public final void update(View view, int n2, int n3, int n4, int n5) {
        if (Build.VERSION.SDK_INT < 21 && this.a) {
            n3 -= view.getHeight();
        }
        super.update(view, n2, n3, n4, n5);
    }
}

