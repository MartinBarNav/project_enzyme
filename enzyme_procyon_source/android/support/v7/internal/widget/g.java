// 
// Decompiled by Procyon v0.5.36
// 

package android.support.v7.internal.widget;

import android.graphics.Rect;
import android.util.AttributeSet;
import android.content.Context;
import android.widget.FrameLayout;

public class g extends FrameLayout
{
    public g(final Context context) {
        this(context, null);
    }
    
    public g(final Context context, final AttributeSet set) {
        this(context, set, 0);
    }
    
    public g(final Context context, final AttributeSet set, final int n) {
        super(context, set, n);
    }
    
    public final void a(final Rect rect) {
        this.fitSystemWindows(rect);
    }
}
