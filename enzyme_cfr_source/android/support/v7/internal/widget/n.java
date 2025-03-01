/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  android.content.res.ColorStateList
 *  android.graphics.PorterDuff$Mode
 *  android.graphics.drawable.Drawable
 */
package android.support.v7.internal.widget;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.support.v7.internal.widget.i;
import android.support.v7.internal.widget.o;

final class n
extends i {
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

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public final boolean isStateful() {
        if (this.a != null) {
            if (this.a.isStateful()) return true;
        }
        if (!super.isStateful()) return false;
        return true;
    }

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public final boolean setState(int[] arrn) {
        int n2;
        boolean bl = false;
        boolean bl2 = super.setState(arrn);
        if (this.a != null && (n2 = this.a.getColorForState(arrn, this.c)) != this.c) {
            if (n2 != 0) {
                this.setColorFilter(n2, this.b);
            } else {
                this.clearColorFilter();
            }
            this.c = n2;
            return true;
        }
        n2 = 0;
        if (n2 != 0) return true;
        if (!bl2) return bl;
        return true;
    }
}

