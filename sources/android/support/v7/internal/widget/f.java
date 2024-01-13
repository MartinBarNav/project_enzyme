package android.support.v7.internal.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.support.v7.b.a;
import android.util.AttributeSet;
import android.widget.TextView;

public class f extends TextView {
    public f(Context context) {
        this(context, (AttributeSet) null);
    }

    public f(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public f(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, a.i.CompatTextView, i, 0);
        boolean z = obtainStyledAttributes.getBoolean(a.i.CompatTextView_textAllCaps, false);
        obtainStyledAttributes.recycle();
        if (z) {
            setTransformationMethod(new android.support.v7.internal.b.a(context));
        }
    }
}
