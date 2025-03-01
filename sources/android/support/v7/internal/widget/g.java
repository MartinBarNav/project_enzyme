package android.support.v7.internal.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.widget.FrameLayout;

public class g extends FrameLayout {
    public g(Context context) {
        this(context, (AttributeSet) null);
    }

    public g(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public g(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public final void a(Rect rect) {
        fitSystemWindows(rect);
    }
}
