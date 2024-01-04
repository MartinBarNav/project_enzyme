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
import android.support.v4.content.a;
import android.support.v7.internal.view.menu.e;
import android.support.v7.internal.view.menu.f;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;

public final class m
extends e
implements SubMenu {
    public e i;
    private f j;

    public m(Context context, e e2, f f2) {
        super(context);
        this.i = e2;
        this.j = f2;
    }

    @Override
    public final void a(e.a a2) {
        this.i.a(a2);
    }

    @Override
    public final boolean a() {
        return this.i.a();
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    final boolean a(e e2, MenuItem menuItem) {
        if (super.a(e2, menuItem)) return true;
        if (!this.i.a(e2, menuItem)) return false;
        return true;
    }

    @Override
    public final boolean a(f f2) {
        return this.i.a(f2);
    }

    @Override
    public final boolean b() {
        return this.i.b();
    }

    @Override
    public final boolean b(f f2) {
        return this.i.b(f2);
    }

    public final MenuItem getItem() {
        return this.j;
    }

    @Override
    public final e h() {
        return this.i;
    }

    public final SubMenu setHeaderIcon(int n2) {
        super.a(android.support.v4.content.a.a(this.a, n2));
        return this;
    }

    public final SubMenu setHeaderIcon(Drawable drawable) {
        super.a(drawable);
        return this;
    }

    public final SubMenu setHeaderTitle(int n2) {
        super.a(this.a.getResources().getString(n2));
        return this;
    }

    public final SubMenu setHeaderTitle(CharSequence charSequence) {
        super.a(charSequence);
        return this;
    }

    public final SubMenu setHeaderView(View view) {
        super.a(null, null, view);
        return this;
    }

    public final SubMenu setIcon(int n2) {
        this.j.setIcon(n2);
        return this;
    }

    public final SubMenu setIcon(Drawable drawable) {
        this.j.setIcon(drawable);
        return this;
    }

    @Override
    public final void setQwertyMode(boolean bl) {
        this.i.setQwertyMode(bl);
    }
}

