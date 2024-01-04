// 
// Decompiled by Procyon v0.5.36
// 

package android.support.v4.f;

import android.view.View;
import android.widget.PopupWindow;
import android.os.Build$VERSION;

public final class g
{
    static final c a;
    
    static {
        if (Build$VERSION.SDK_INT >= 19) {
            a = (c)new b();
        }
        else {
            a = (c)new a();
        }
    }
    
    public static void a(final PopupWindow popupWindow, final View view, final int n, final int n2, final int n3) {
        g.a.a(popupWindow, view, n, n2, n3);
    }
    
    static class a implements c
    {
        @Override
        public void a(final PopupWindow popupWindow, final View view, final int n, final int n2, final int n3) {
            popupWindow.showAsDropDown(view, n, n2);
        }
    }
    
    static final class b extends a
    {
        @Override
        public final void a(final PopupWindow popupWindow, final View view, final int n, final int n2, final int n3) {
            h.a(popupWindow, view, n, n2, n3);
        }
    }
    
    interface c
    {
        void a(final PopupWindow p0, final View p1, final int p2, final int p3, final int p4);
    }
}
