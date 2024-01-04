/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.Intent
 *  android.graphics.drawable.Drawable
 *  android.view.ActionProvider
 *  android.view.ContextMenu$ContextMenuInfo
 *  android.view.MenuItem
 *  android.view.MenuItem$OnActionExpandListener
 *  android.view.MenuItem$OnMenuItemClickListener
 *  android.view.SubMenu
 *  android.view.View
 */
package android.support.v7.internal.view.menu;

import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.support.v4.b.a.b;
import android.support.v4.view.d;
import android.support.v4.view.k;
import android.view.ActionProvider;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;

public final class a
implements b {
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
    private int k = 0;
    private Context l;
    private MenuItem.OnMenuItemClickListener m;
    private int n = 16;

    public a(Context context, CharSequence charSequence) {
        this.l = context;
        this.a = 16908332;
        this.b = 0;
        this.c = 0;
        this.d = 0;
        this.e = charSequence;
    }

    @Override
    public final b a(d d2) {
        throw new UnsupportedOperationException();
    }

    @Override
    public final b a(k.e e2) {
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

    public final ContextMenu.ContextMenuInfo getMenuInfo() {
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

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final CharSequence getTitleCondensed() {
        if (this.f == null) return this.e;
        return this.f;
    }

    public final boolean hasSubMenu() {
        return false;
    }

    @Override
    public final boolean isActionViewExpanded() {
        return false;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final boolean isCheckable() {
        if ((this.n & 1) == 0) return false;
        return true;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final boolean isChecked() {
        if ((this.n & 2) == 0) return false;
        return true;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final boolean isEnabled() {
        if ((this.n & 0x10) == 0) return false;
        return true;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final boolean isVisible() {
        if ((this.n & 8) != 0) return false;
        return true;
    }

    public final MenuItem setActionProvider(ActionProvider actionProvider) {
        throw new UnsupportedOperationException();
    }

    @Override
    public final /* synthetic */ MenuItem setActionView(int n2) {
        throw new UnsupportedOperationException();
    }

    @Override
    public final /* synthetic */ MenuItem setActionView(View view) {
        throw new UnsupportedOperationException();
    }

    public final MenuItem setAlphabeticShortcut(char c2) {
        this.i = c2;
        return this;
    }

    /*
     * Enabled aggressive block sorting
     */
    public final MenuItem setCheckable(boolean bl) {
        int n2 = this.n;
        int n3 = bl ? 1 : 0;
        this.n = n3 | n2 & 0xFFFFFFFE;
        return this;
    }

    /*
     * Enabled aggressive block sorting
     */
    public final MenuItem setChecked(boolean bl) {
        int n2 = this.n;
        int n3 = bl ? 2 : 0;
        this.n = n3 | n2 & 0xFFFFFFFD;
        return this;
    }

    /*
     * Enabled aggressive block sorting
     */
    public final MenuItem setEnabled(boolean bl) {
        int n2 = this.n;
        int n3 = bl ? 16 : 0;
        this.n = n3 | n2 & 0xFFFFFFEF;
        return this;
    }

    public final MenuItem setIcon(int n2) {
        this.k = n2;
        this.j = android.support.v4.content.a.a(this.l, n2);
        return this;
    }

    public final MenuItem setIcon(Drawable drawable) {
        this.j = drawable;
        this.k = 0;
        return this;
    }

    public final MenuItem setIntent(Intent intent) {
        this.g = intent;
        return this;
    }

    public final MenuItem setNumericShortcut(char c2) {
        this.h = c2;
        return this;
    }

    public final MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        throw new UnsupportedOperationException();
    }

    public final MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.m = onMenuItemClickListener;
        return this;
    }

    public final MenuItem setShortcut(char c2, char c3) {
        this.h = c2;
        this.i = c3;
        return this;
    }

    @Override
    public final void setShowAsAction(int n2) {
    }

    @Override
    public final /* synthetic */ MenuItem setShowAsActionFlags(int n2) {
        this.setShowAsAction(n2);
        return this;
    }

    public final MenuItem setTitle(int n2) {
        this.e = this.l.getResources().getString(n2);
        return this;
    }

    public final MenuItem setTitle(CharSequence charSequence) {
        this.e = charSequence;
        return this;
    }

    public final MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f = charSequence;
        return this;
    }

    /*
     * Enabled aggressive block sorting
     */
    public final MenuItem setVisible(boolean bl) {
        int n2 = this.n;
        int n3 = bl ? 0 : 8;
        this.n = n3 | n2 & 8;
        return this;
    }
}

