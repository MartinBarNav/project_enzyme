// 
// Decompiled by Procyon v0.5.36
// 

package android.support.v7.internal.widget;

import android.content.res.TypedArray;
import android.text.method.TransformationMethod;
import android.support.v7.b.a;
import android.util.AttributeSet;
import android.content.Context;
import android.widget.TextView;

public class f extends TextView
{
    public f(final Context context) {
        this(context, null);
    }
    
    public f(final Context context, final AttributeSet set) {
        this(context, set, 0);
    }
    
    public f(final Context context, final AttributeSet set, final int n) {
        super(context, set, n);
        final TypedArray obtainStyledAttributes = context.obtainStyledAttributes(set, a.i.CompatTextView, n, 0);
        final boolean boolean1 = obtainStyledAttributes.getBoolean(a.i.CompatTextView_textAllCaps, false);
        obtainStyledAttributes.recycle();
        if (boolean1) {
            this.setTransformationMethod((TransformationMethod)new android.support.v7.internal.b.a(context));
        }
    }
}
