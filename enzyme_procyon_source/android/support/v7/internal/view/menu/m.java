// 
// Decompiled by Procyon v0.5.36
// 

package android.support.v7.internal.view.menu;

import android.view.View;
import android.graphics.drawable.Drawable;
import android.support.v4.content.a;
import android.view.MenuItem;
import android.content.Context;
import android.view.SubMenu;

public final class m extends e implements SubMenu
{
    public e i;
    private f j;
    
    public m(final Context context, final e i, final f j) {
        super(context);
        this.i = i;
        this.j = j;
    }
    
    @Override
    public final void a(final a a) {
        this.i.a(a);
    }
    
    public final boolean a() {
        return this.i.a();
    }
    
    @Override
    final boolean a(final e e, final MenuItem menuItem) {
        return super.a(e, menuItem) || this.i.a(e, menuItem);
    }
    
    @Override
    public final boolean a(final f f) {
        return this.i.a(f);
    }
    
    @Override
    public final boolean b() {
        return this.i.b();
    }
    
    @Override
    public final boolean b(final f f) {
        return this.i.b(f);
    }
    
    public final MenuItem getItem() {
        return (MenuItem)this.j;
    }
    
    @Override
    public final e h() {
        return this.i;
    }
    
    public final SubMenu setHeaderIcon(final int n) {
        super.a(android.support.v4.content.a.a(super.a, n));
        return (SubMenu)this;
    }
    
    public final SubMenu setHeaderIcon(final Drawable drawable) {
        super.a(drawable);
        return (SubMenu)this;
    }
    
    public final SubMenu setHeaderTitle(final int n) {
        super.a(super.a.getResources().getString(n));
        return (SubMenu)this;
    }
    
    public final SubMenu setHeaderTitle(final CharSequence charSequence) {
        super.a(charSequence);
        return (SubMenu)this;
    }
    
    public final SubMenu setHeaderView(final View view) {
        super.a(null, null, view);
        return (SubMenu)this;
    }
    
    public final SubMenu setIcon(final int icon) {
        this.j.setIcon(icon);
        return (SubMenu)this;
    }
    
    public final SubMenu setIcon(final Drawable icon) {
        this.j.setIcon(icon);
        return (SubMenu)this;
    }
    
    @Override
    public final void setQwertyMode(final boolean qwertyMode) {
        this.i.setQwertyMode(qwertyMode);
    }
}
