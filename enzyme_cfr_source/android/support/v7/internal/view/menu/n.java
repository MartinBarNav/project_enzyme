/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.graphics.drawable.Drawable
 *  android.view.MenuItem
 *  android.view.SubMenu
 *  android.view.View
 */
package android.support.v7.internal.view.menu;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.support.v4.b.a.c;
import android.support.v7.internal.view.menu.l;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;

final class n
extends l
implements SubMenu {
    n(Context context, c c2) {
        super(context, c2);
    }

    public final void clearHeader() {
        ((c)this.d).clearHeader();
    }

    public final MenuItem getItem() {
        return this.a(((c)this.d).getItem());
    }

    public final SubMenu setHeaderIcon(int n2) {
        ((c)this.d).setHeaderIcon(n2);
        return this;
    }

    public final SubMenu setHeaderIcon(Drawable drawable) {
        ((c)this.d).setHeaderIcon(drawable);
        return this;
    }

    public final SubMenu setHeaderTitle(int n2) {
        ((c)this.d).setHeaderTitle(n2);
        return this;
    }

    public final SubMenu setHeaderTitle(CharSequence charSequence) {
        ((c)this.d).setHeaderTitle(charSequence);
        return this;
    }

    public final SubMenu setHeaderView(View view) {
        ((c)this.d).setHeaderView(view);
        return this;
    }

    public final SubMenu setIcon(int n2) {
        ((c)this.d).setIcon(n2);
        return this;
    }

    public final SubMenu setIcon(Drawable drawable) {
        ((c)this.d).setIcon(drawable);
        return this;
    }
}

