// 
// Decompiled by Procyon v0.5.36
// 

package android.support.v7.internal.view.menu;

import android.view.MenuItem$OnActionExpandListener;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.ContextMenu$ContextMenuInfo;
import android.view.View;
import android.view.ActionProvider;
import android.support.v4.view.k;
import android.support.v4.view.d;
import android.view.MenuItem$OnMenuItemClickListener;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.content.Intent;
import android.support.v4.b.a.b;

public final class a implements b
{
    private final int a;
    private final int b;
    private final int c;
    private final int d;
    private CharSequence e;
    private CharSequence f;
    private Intent g;
    private char h;
    private char i;
    private Drawable j;
    private int k;
    private Context l;
    private MenuItem$OnMenuItemClickListener m;
    private int n;
    
    public a(final Context l, final CharSequence e) {
        this.k = 0;
        this.n = 16;
        this.l = l;
        this.a = 16908332;
        this.b = 0;
        this.c = 0;
        this.d = 0;
        this.e = e;
    }
    
    @Override
    public final b a(final d d) {
        throw new UnsupportedOperationException();
    }
    
    @Override
    public final b a(final k.e e) {
        return this;
    }
    
    @Override
    public final d a() {
        return null;
    }
    
    @Override
    public final boolean collapseActionView() {
        return false;
    }
    
    @Override
    public final boolean expandActionView() {
        return false;
    }
    
    public final ActionProvider getActionProvider() {
        throw new UnsupportedOperationException();
    }
    
    @Override
    public final View getActionView() {
        return null;
    }
    
    public final char getAlphabeticShortcut() {
        return this.i;
    }
    
    public final int getGroupId() {
        return this.b;
    }
    
    public final Drawable getIcon() {
        return this.j;
    }
    
    public final Intent getIntent() {
        return this.g;
    }
    
    public final int getItemId() {
        return this.a;
    }
    
    public final ContextMenu$ContextMenuInfo getMenuInfo() {
        return null;
    }
    
    public final char getNumericShortcut() {
        return this.h;
    }
    
    public final int getOrder() {
        return this.d;
    }
    
    public final SubMenu getSubMenu() {
        return null;
    }
    
    public final CharSequence getTitle() {
        return this.e;
    }
    
    public final CharSequence getTitleCondensed() {
        CharSequence charSequence;
        if (this.f != null) {
            charSequence = this.f;
        }
        else {
            charSequence = this.e;
        }
        return charSequence;
    }
    
    public final boolean hasSubMenu() {
        return false;
    }
    
    @Override
    public final boolean isActionViewExpanded() {
        return false;
    }
    
    public final boolean isCheckable() {
        return (this.n & 0x1) != 0x0;
    }
    
    public final boolean isChecked() {
        return (this.n & 0x2) != 0x0;
    }
    
    public final boolean isEnabled() {
        return (this.n & 0x10) != 0x0;
    }
    
    public final boolean isVisible() {
        return (this.n & 0x8) == 0x0;
    }
    
    public final MenuItem setActionProvider(final ActionProvider actionProvider) {
        throw new UnsupportedOperationException();
    }
    
    public final MenuItem setAlphabeticShortcut(final char c) {
        this.i = c;
        return (MenuItem)this;
    }
    
    public final MenuItem setCheckable(final boolean b) {
        final int n = this.n;
        boolean b2;
        if (b) {
            b2 = true;
        }
        else {
            b2 = false;
        }
        this.n = ((b2 ? 1 : 0) | (n & 0xFFFFFFFE));
        return (MenuItem)this;
    }
    
    public final MenuItem setChecked(final boolean b) {
        final int n = this.n;
        int n2;
        if (b) {
            n2 = 2;
        }
        else {
            n2 = 0;
        }
        this.n = (n2 | (n & 0xFFFFFFFD));
        return (MenuItem)this;
    }
    
    public final MenuItem setEnabled(final boolean b) {
        final int n = this.n;
        int n2;
        if (b) {
            n2 = 16;
        }
        else {
            n2 = 0;
        }
        this.n = (n2 | (n & 0xFFFFFFEF));
        return (MenuItem)this;
    }
    
    public final MenuItem setIcon(final int k) {
        this.k = k;
        this.j = android.support.v4.content.a.a(this.l, k);
        return (MenuItem)this;
    }
    
    public final MenuItem setIcon(final Drawable j) {
        this.j = j;
        this.k = 0;
        return (MenuItem)this;
    }
    
    public final MenuItem setIntent(final Intent g) {
        this.g = g;
        return (MenuItem)this;
    }
    
    public final MenuItem setNumericShortcut(final char c) {
        this.h = c;
        return (MenuItem)this;
    }
    
    public final MenuItem setOnActionExpandListener(final MenuItem$OnActionExpandListener menuItem$OnActionExpandListener) {
        throw new UnsupportedOperationException();
    }
    
    public final MenuItem setOnMenuItemClickListener(final MenuItem$OnMenuItemClickListener m) {
        this.m = m;
        return (MenuItem)this;
    }
    
    public final MenuItem setShortcut(final char c, final char c2) {
        this.h = c;
        this.i = c2;
        return (MenuItem)this;
    }
    
    @Override
    public final void setShowAsAction(final int n) {
    }
    
    public final MenuItem setTitle(final int n) {
        this.e = this.l.getResources().getString(n);
        return (MenuItem)this;
    }
    
    public final MenuItem setTitle(final CharSequence e) {
        this.e = e;
        return (MenuItem)this;
    }
    
    public final MenuItem setTitleCondensed(final CharSequence f) {
        this.f = f;
        return (MenuItem)this;
    }
    
    public final MenuItem setVisible(final boolean b) {
        final int n = this.n;
        int n2;
        if (b) {
            n2 = 0;
        }
        else {
            n2 = 8;
        }
        this.n = (n2 | (n & 0x8));
        return (MenuItem)this;
    }
}
