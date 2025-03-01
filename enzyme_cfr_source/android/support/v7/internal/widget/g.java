/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.graphics.Rect
 *  android.util.AttributeSet
 *  android.widget.FrameLayout
 */
package android.support.v7.internal.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.widget.FrameLayout;

public class g
extends FrameLayout {
    public g(Context context) {
        this(context, null);
    }

    public g(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public g(Context context, AttributeSet attributeSet, int n2) {
        super(context, attributeSet, n2);
    }

    public final void a(Rect rect) {
        this.fitSystemWindows(rect);
    }
}

