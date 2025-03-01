// 
// Decompiled by Procyon v0.5.36
// 

package android.support.v7.internal.widget;

import android.graphics.Outline;

final class c extends b
{
    public c(final ActionBarContainer actionBarContainer) {
        super(actionBarContainer);
    }
    
    public final void getOutline(final Outline outline) {
        if (this.a.d) {
            if (this.a.c != null) {
                this.a.c.getOutline(outline);
            }
        }
        else if (this.a.a != null) {
            this.a.a.getOutline(outline);
        }
    }
}
