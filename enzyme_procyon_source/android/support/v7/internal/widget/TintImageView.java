// 
// Decompiled by Procyon v0.5.36
// 

package android.support.v7.internal.widget;

import android.util.AttributeSet;
import android.content.Context;
import android.widget.ImageView;

public class TintImageView extends ImageView
{
    private static final int[] a;
    private final o b;
    
    static {
        a = new int[] { 16842964, 16843033 };
    }
    
    public TintImageView(final Context context) {
        this(context, null);
    }
    
    public TintImageView(final Context context, final AttributeSet set) {
        this(context, set, 0);
    }
    
    public TintImageView(final Context context, final AttributeSet set, final int n) {
        super(context, set, n);
        final q a = q.a(context, set, TintImageView.a, n);
        if (a.a.length() > 0) {
            if (a.c(0)) {
                this.setBackgroundDrawable(a.a(0));
            }
            if (a.c(1)) {
                this.setImageDrawable(a.a(1));
            }
        }
        a.a.recycle();
        this.b = a.a();
    }
    
    public void setImageResource(final int n) {
        this.setImageDrawable(this.b.a(n));
    }
}
