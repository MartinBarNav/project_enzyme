/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  android.graphics.Outline
 */
package android.support.v7.internal.widget;

import android.graphics.Outline;
import android.support.v7.internal.widget.ActionBarContainer;
import android.support.v7.internal.widget.b;

final class c
extends b {
    public c(ActionBarContainer actionBarContainer) {
        super(actionBarContainer);
    }

    /*
     * Enabled aggressive block sorting
     */
    public final void getOutline(Outline outline) {
        if (this.a.d) {
            if (this.a.c == null) return;
            this.a.c.getOutline(outline);
            return;
        }
        if (this.a.a == null) return;
        this.a.a.getOutline(outline);
    }
}

