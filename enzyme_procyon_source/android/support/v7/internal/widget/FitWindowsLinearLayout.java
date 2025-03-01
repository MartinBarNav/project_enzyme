// 
// Decompiled by Procyon v0.5.36
// 

package android.support.v7.internal.widget;

import android.graphics.Rect;
import android.util.AttributeSet;
import android.content.Context;
import android.widget.LinearLayout;

public class FitWindowsLinearLayout extends LinearLayout implements j
{
    private a a;
    
    public FitWindowsLinearLayout(final Context context) {
        super(context);
    }
    
    public FitWindowsLinearLayout(final Context context, final AttributeSet set) {
        super(context, set);
    }
    
    protected boolean fitSystemWindows(final Rect rect) {
        return super.fitSystemWindows(rect);
    }
    
    public void setOnFitSystemWindowsListener(final a a) {
        this.a = a;
    }
}
