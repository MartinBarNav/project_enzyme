package android.support.v7.internal.widget;

import android.content.Context;
import android.graphics.Rect;
import android.support.v7.internal.widget.j;
import android.util.AttributeSet;
import android.widget.LinearLayout;

public class FitWindowsLinearLayout extends LinearLayout implements j {
    private j.a a;

    public FitWindowsLinearLayout(Context context) {
        super(context);
    }

    public FitWindowsLinearLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public void setOnFitSystemWindowsListener(j.a aVar) {
        this.a = aVar;
    }

    /* access modifiers changed from: protected */
    public boolean fitSystemWindows(Rect rect) {
        return super.fitSystemWindows(rect);
    }
}
