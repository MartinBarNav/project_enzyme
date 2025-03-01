/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.util.AttributeSet
 *  android.widget.ImageView
 */
package android.support.v7.internal.widget;

import android.content.Context;
import android.support.v7.internal.widget.o;
import android.support.v7.internal.widget.q;
import android.util.AttributeSet;
import android.widget.ImageView;

public class TintImageView
extends ImageView {
    private static final int[] a = new int[]{16842964, 0x1010119};
    private final o b;

    public TintImageView(Context context) {
        this(context, null);
    }

    public TintImageView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public TintImageView(Context object, AttributeSet attributeSet, int n2) {
        super((Context)object, attributeSet, n2);
        object = q.a((Context)object, attributeSet, a, n2);
        if (((q)object).a.length() > 0) {
            if (((q)object).c(0)) {
                this.setBackgroundDrawable(((q)object).a(0));
            }
            if (((q)object).c(1)) {
                this.setImageDrawable(((q)object).a(1));
            }
        }
        ((q)object).a.recycle();
        this.b = ((q)object).a();
    }

    public void setImageResource(int n2) {
        this.setImageDrawable(this.b.a(n2));
    }
}

