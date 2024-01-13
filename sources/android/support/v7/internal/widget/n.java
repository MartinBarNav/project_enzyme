package android.support.v7.internal.widget;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;

final class n extends i {
    private final ColorStateList a;
    private final PorterDuff.Mode b;
    private int c;

    public n(Drawable drawable, ColorStateList colorStateList) {
        this(drawable, colorStateList, o.a);
    }

    public n(Drawable drawable, ColorStateList colorStateList, PorterDuff.Mode mode) {
        super(drawable);
        this.a = colorStateList;
        this.b = mode;
    }

    public final boolean isStateful() {
        return (this.a != null && this.a.isStateful()) || super.isStateful();
    }

    public final boolean setState(int[] iArr) {
        boolean z;
        int colorForState;
        boolean state = super.setState(iArr);
        if (this.a == null || (colorForState = this.a.getColorForState(iArr, this.c)) == this.c) {
            z = false;
        } else {
            if (colorForState != 0) {
                setColorFilter(colorForState, this.b);
            } else {
                clearColorFilter();
            }
            this.c = colorForState;
            z = true;
        }
        if (z || state) {
            return true;
        }
        return false;
    }
}
