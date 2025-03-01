// 
// Decompiled by Procyon v0.5.36
// 

package android.support.v4.f;

import android.view.View;
import android.widget.ListView;

public final class f extends a
{
    private final ListView a;
    
    public f(final ListView a) {
        super((View)a);
        this.a = a;
    }
    
    @Override
    public final void a(final int n) {
        final ListView a = this.a;
        final int firstVisiblePosition = a.getFirstVisiblePosition();
        if (firstVisiblePosition != -1) {
            final View child = a.getChildAt(0);
            if (child != null) {
                a.setSelectionFromTop(firstVisiblePosition, child.getTop() - n);
            }
        }
    }
    
    @Override
    public final boolean b(final int n) {
        final boolean b = false;
        final ListView a = this.a;
        final int count = a.getCount();
        boolean b2;
        if (count == 0) {
            b2 = b;
        }
        else {
            final int childCount = a.getChildCount();
            final int firstVisiblePosition = a.getFirstVisiblePosition();
            if (n > 0) {
                if (firstVisiblePosition + childCount >= count) {
                    b2 = b;
                    if (a.getChildAt(childCount - 1).getBottom() <= a.getHeight()) {
                        return b2;
                    }
                }
            }
            else {
                b2 = b;
                if (n >= 0) {
                    return b2;
                }
                if (firstVisiblePosition <= 0 && a.getChildAt(0).getTop() >= 0) {
                    b2 = b;
                    return b2;
                }
            }
            b2 = true;
        }
        return b2;
    }
}
