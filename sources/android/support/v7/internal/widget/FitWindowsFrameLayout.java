package android.support.v7.internal.widget;

import android.content.Context;
import android.graphics.Rect;
import android.support.v7.internal.widget.j;
import android.util.AttributeSet;
import android.widget.FrameLayout;

public class FitWindowsFrameLayout extends FrameLayout implements j {
    private j.a a;

    public FitWindowsFrameLayout(Context context) {
        super(context);
    }

    public FitWindowsFrameLayout(Context context, AttributeSet attributeSet) {
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
