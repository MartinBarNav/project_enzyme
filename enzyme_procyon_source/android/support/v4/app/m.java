// 
// Decompiled by Procyon v0.5.36
// 

package android.support.v4.app;

import android.os.Parcelable;
import android.util.SparseArray;
import android.view.ViewGroup$LayoutParams;
import android.widget.FrameLayout$LayoutParams;
import android.view.ViewGroup;
import android.view.View;
import android.content.Context;
import android.widget.FrameLayout;

final class m extends FrameLayout
{
    private m(final Context context) {
        super(context);
    }
    
    static ViewGroup a(final View view) {
        final m m = new m(view.getContext());
        final ViewGroup$LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams != null) {
            m.setLayoutParams(layoutParams);
        }
        view.setLayoutParams((ViewGroup$LayoutParams)new FrameLayout$LayoutParams(-1, -1));
        m.addView(view);
        return (ViewGroup)m;
    }
    
    protected final void dispatchRestoreInstanceState(final SparseArray<Parcelable> sparseArray) {
        this.dispatchThawSelfOnly((SparseArray)sparseArray);
    }
    
    protected final void dispatchSaveInstanceState(final SparseArray<Parcelable> sparseArray) {
        this.dispatchFreezeSelfOnly((SparseArray)sparseArray);
    }
}
