// 
// Decompiled by Procyon v0.5.36
// 

package android.support.v7.internal.widget;

import android.graphics.drawable.Drawable;
import android.graphics.PorterDuff$Mode;
import android.content.res.ColorStateList;

final class n extends i
{
    private final ColorStateList a;
    private final PorterDuff$Mode b;
    private int c;
    
    public n(final Drawable drawable, final ColorStateList list) {
        this(drawable, list, o.a);
    }
    
    public n(final Drawable drawable, final ColorStateList a, final PorterDuff$Mode b) {
        super(drawable);
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final boolean isStateful() {
        return (this.a != null && this.a.isStateful()) || super.isStateful();
    }
    
    @Override
    public final boolean setState(final int[] state) {
        boolean b = false;
        final boolean setState = super.setState(state);
        while (true) {
            Label_0082: {
                if (this.a == null) {
                    break Label_0082;
                }
                final int colorForState = this.a.getColorForState(state, this.c);
                if (colorForState == this.c) {
                    break Label_0082;
                }
                if (colorForState != 0) {
                    this.setColorFilter(colorForState, this.b);
                }
                else {
                    this.clearColorFilter();
                }
                this.c = colorForState;
                final int n = 1;
                if (n != 0 || setState) {
                    b = true;
                }
                return b;
            }
            final int n = 0;
            continue;
        }
    }
}
