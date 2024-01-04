// 
// Decompiled by Procyon v0.5.36
// 

package android.support.v7.internal.view.menu;

import android.view.View;
import android.graphics.drawable.Drawable;
import android.view.MenuItem;
import android.support.v4.b.a.a;
import android.support.v4.b.a.c;
import android.content.Context;
import android.view.SubMenu;

final class n extends l implements SubMenu
{
    n(final Context context, final android.support.v4.b.a.c c) {
        super(context, c);
    }
    
    public final void clearHeader() {
        ((android.support.v4.b.a.c)this.d).clearHeader();
    }
    
    public final MenuItem getItem() {
        return this.a(((android.support.v4.b.a.c)this.d).getItem());
    }
    
    public final SubMenu setHeaderIcon(final int headerIcon) {
        ((android.support.v4.b.a.c)this.d).setHeaderIcon(headerIcon);
        return (SubMenu)this;
    }
    
    public final SubMenu setHeaderIcon(final Drawable headerIcon) {
        ((android.support.v4.b.a.c)this.d).setHeaderIcon(headerIcon);
        return (SubMenu)this;
    }
    
    public final SubMenu setHeaderTitle(final int headerTitle) {
        ((android.support.v4.b.a.c)this.d).setHeaderTitle(headerTitle);
        return (SubMenu)this;
    }
    
    public final SubMenu setHeaderTitle(final CharSequence headerTitle) {
        ((android.support.v4.b.a.c)this.d).setHeaderTitle(headerTitle);
        return (SubMenu)this;
    }
    
    public final SubMenu setHeaderView(final View headerView) {
        ((android.support.v4.b.a.c)this.d).setHeaderView(headerView);
        return (SubMenu)this;
    }
    
    public final SubMenu setIcon(final int icon) {
        ((android.support.v4.b.a.c)this.d).setIcon(icon);
        return (SubMenu)this;
    }
    
    public final SubMenu setIcon(final Drawable icon) {
        ((android.support.v4.b.a.c)this.d).setIcon(icon);
        return (SubMenu)this;
    }
}
