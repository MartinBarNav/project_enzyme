/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.graphics.Rect
 *  android.util.AttributeSet
 *  android.widget.LinearLayout
 */
package android.support.v7.internal.widget;

import android.content.Context;
import android.graphics.Rect;
import android.support.v7.internal.widget.j;
import android.util.AttributeSet;
import android.widget.LinearLayout;

public class FitWindowsLinearLayout
extends LinearLayout
implements j {
    private j.a a;

    public FitWindowsLinearLayout(Context context) {
        super(context);
    }

    public FitWindowsLinearLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    protected boolean fitSystemWindows(Rect rect) {
        return super.fitSystemWindows(rect);
    }

    public void setOnFitSystemWindowsListener(j.a a2) {
        this.a = a2;
    }
}

