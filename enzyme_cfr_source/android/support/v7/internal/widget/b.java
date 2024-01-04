/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  android.graphics.Canvas
 *  android.graphics.ColorFilter
 *  android.graphics.drawable.Drawable
 */
package android.support.v7.internal.widget;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;
import android.support.v7.internal.widget.ActionBarContainer;

class b
extends Drawable {
    final ActionBarContainer a;

    public b(ActionBarContainer actionBarContainer) {
        this.a = actionBarContainer;
    }

    /*
     * Enabled aggressive block sorting
     */
    public void draw(Canvas canvas) {
        if (this.a.d) {
            if (this.a.c == null) return;
            this.a.c.draw(canvas);
            return;
        }
        if (this.a.a != null) {
            this.a.a.draw(canvas);
        }
        if (this.a.b == null) return;
        if (!this.a.e) return;
        this.a.b.draw(canvas);
    }

    public int getOpacity() {
        return 0;
    }

    public void setAlpha(int n2) {
    }

    public void setColorFilter(ColorFilter colorFilter) {
    }
}

