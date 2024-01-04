/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.util.AttributeSet
 *  android.widget.TextView
 */
package android.support.v7.internal.widget;

import android.content.Context;
import android.support.v7.b.a;
import android.support.v7.internal.b.a;
import android.util.AttributeSet;
import android.widget.TextView;

public class f
extends TextView {
    public f(Context context) {
        this(context, null);
    }

    public f(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public f(Context context, AttributeSet attributeSet, int n2) {
        super(context, attributeSet, n2);
        attributeSet = context.obtainStyledAttributes(attributeSet, a.i.CompatTextView, n2, 0);
        boolean bl = attributeSet.getBoolean(a.i.CompatTextView_textAllCaps, false);
        attributeSet.recycle();
        if (bl) {
            this.setTransformationMethod(new a(context));
        }
    }
}

