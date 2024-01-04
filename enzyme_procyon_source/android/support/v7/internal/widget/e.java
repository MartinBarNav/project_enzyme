// 
// Decompiled by Procyon v0.5.36
// 

package android.support.v7.internal.widget;

import android.annotation.TargetApi;
import android.os.Build$VERSION;
import android.view.View;
import android.support.v7.b.a;
import android.util.AttributeSet;
import android.content.Context;
import android.widget.PopupWindow;

public final class e extends PopupWindow
{
    private final boolean a;
    
    public e(final Context context, final AttributeSet set, final int n) {
        super(context, set, n);
        final q a = q.a(context, set, android.support.v7.b.a.i.PopupWindow, n);
        this.a = a.a(android.support.v7.b.a.i.PopupWindow_overlapAnchor, false);
        this.setBackgroundDrawable(a.a(android.support.v7.b.a.i.PopupWindow_android_popupBackground));
        a.a.recycle();
    }
    
    public final void showAsDropDown(final View view, final int n, final int n2) {
        int n3 = n2;
        if (Build$VERSION.SDK_INT < 21) {
            n3 = n2;
            if (this.a) {
                n3 = n2 - view.getHeight();
            }
        }
        super.showAsDropDown(view, n, n3);
    }
    
    @TargetApi(19)
    public final void showAsDropDown(final View view, final int n, final int n2, final int n3) {
        int n4 = n2;
        if (Build$VERSION.SDK_INT < 21) {
            n4 = n2;
            if (this.a) {
                n4 = n2 - view.getHeight();
            }
        }
        super.showAsDropDown(view, n, n4, n3);
    }
    
    public final void update(final View view, final int n, int n2, final int n3, final int n4) {
        if (Build$VERSION.SDK_INT < 21 && this.a) {
            n2 -= view.getHeight();
        }
        super.update(view, n, n2, n3, n4);
    }
}
