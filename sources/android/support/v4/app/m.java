package android.support.v4.app;

import android.content.Context;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;

final class m extends FrameLayout {
    static ViewGroup a(View view) {
        m mVar = new m(view.getContext());
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams != null) {
            mVar.setLayoutParams(layoutParams);
        }
        view.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        mVar.addView(view);
        return mVar;
    }

    private m(Context context) {
        super(context);
    }

    /* access modifiers changed from: protected */
    public final void dispatchSaveInstanceState(SparseArray<Parcelable> sparseArray) {
        dispatchFreezeSelfOnly(sparseArray);
    }

    /* access modifiers changed from: protected */
    public final void dispatchRestoreInstanceState(SparseArray<Parcelable> sparseArray) {
        dispatchThawSelfOnly(sparseArray);
    }
}
