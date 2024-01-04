/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  android.content.ActivityNotFoundException
 *  android.content.Context
 *  android.content.Intent
 *  android.graphics.drawable.Drawable
 *  android.os.Build$VERSION
 *  android.util.Log
 *  android.view.ActionProvider
 *  android.view.ContextMenu$ContextMenuInfo
 *  android.view.LayoutInflater
 *  android.view.MenuItem
 *  android.view.MenuItem$OnActionExpandListener
 *  android.view.MenuItem$OnMenuItemClickListener
 *  android.view.SubMenu
 *  android.view.View
 *  android.view.ViewDebug$CapturedViewProperty
 *  android.view.ViewGroup
 *  android.widget.LinearLayout
 */
package android.support.v7.internal.view.menu;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.support.v4.b.a.b;
import android.support.v4.view.d;
import android.support.v4.view.k;
import android.support.v7.internal.view.menu.e;
import android.support.v7.internal.view.menu.k;
import android.support.v7.internal.view.menu.m;
import android.support.v7.internal.widget.o;
import android.util.Log;
import android.view.ActionProvider;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewDebug;
import android.view.ViewGroup;
import android.widget.LinearLayout;

public final class f
implements b {
    static String f;
    static String g;
    static String h;
    static String i;
    final int a;
    e b;
    int c = 0;
    public d d;
    ContextMenu.ContextMenuInfo e;
    private final int j;
    private final int k;
    private final int l;
    private CharSequence m;
    private CharSequence n;
    private Intent o;
    private char p;
    private char q;
    private Drawable r;
    private int s = 0;
    private m t;
    private Runnable u;
    private MenuItem.OnMenuItemClickListener v;
    private int w = 16;
    private View x;
    private k.e y;
    private boolean z = false;

    f(e e2, int n2, int n3, int n4, int n5, CharSequence charSequence, int n6) {
        this.b = e2;
        this.j = n3;
        this.k = n2;
        this.l = n4;
        this.a = n5;
        this.m = charSequence;
        this.c = n6;
    }

    private b a(View view) {
        this.x = view;
        this.d = null;
        if (view != null && view.getId() == -1 && this.j > 0) {
            view.setId(this.j);
        }
        this.b.d();
        return this;
    }

    /*
     * Enabled aggressive block sorting
     */
    private void e(boolean bl) {
        int n2 = this.w;
        int n3 = this.w;
        int n4 = bl ? 2 : 0;
        this.w = n4 | n3 & 0xFFFFFFFD;
        if (n2 != this.w) {
            this.b.b(false);
        }
    }

    @Override
    public final b a(d d2) {
        if (this.d != null) {
            this.d.a((d.b)null);
        }
        this.x = null;
        this.d = d2;
        this.b.b(true);
        if (this.d != null) {
            this.d.a(new d.b(){

                @Override
                public final void a() {
                    f.this.b.c();
                }
            });
        }
        return this;
    }

    @Override
    public final b a(k.e e2) {
        this.y = e2;
        return this;
    }

    @Override
    public final d a() {
        return this.d;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    final CharSequence a(k.a object) {
        if (object == null) return this.getTitle();
        if (!object.a()) return this.getTitle();
        return this.getTitleCondensed();
    }

    final void a(m m2) {
        this.t = m2;
        m2.setHeaderTitle(this.getTitle());
    }

    /*
     * Enabled aggressive block sorting
     */
    public final void a(boolean bl) {
        int n2 = this.w;
        int n3 = bl ? 4 : 0;
        this.w = n3 | n2 & 0xFFFFFFFB;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final boolean b() {
        boolean bl = true;
        if (this.v != null && this.v.onMenuItemClick((MenuItem)this)) {
            return bl;
        }
        boolean bl2 = bl;
        if (this.b.a(this.b.h(), this)) return bl2;
        if (this.u != null) {
            this.u.run();
            return bl;
        }
        if (this.o != null) {
            try {
                this.b.a.startActivity(this.o);
                return bl;
            }
            catch (ActivityNotFoundException activityNotFoundException) {
                Log.e((String)"MenuItemImpl", (String)"Can't find activity to handle intent; ignoring", (Throwable)activityNotFoundException);
            }
        }
        if (this.d == null) return false;
        bl2 = bl;
        if (this.d.d()) return bl2;
        return false;
    }

    /*
     * Enabled aggressive block sorting
     */
    final boolean b(boolean bl) {
        boolean bl2 = false;
        int n2 = this.w;
        int n3 = this.w;
        int n4 = bl ? 0 : 8;
        this.w = n4 | n3 & 0xFFFFFFF7;
        bl = bl2;
        if (n2 == this.w) return bl;
        return true;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    final char c() {
        if (!this.b.a()) char c2;
        return c2 = this.p;
        char c3 = this.q;
        return c3;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final void c(boolean bl) {
        if (bl) {
            this.w |= 0x20;
            return;
        }
        this.w &= 0xFFFFFFDF;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public final boolean collapseActionView() {
        boolean bl = false;
        if ((this.c & 8) == 0) {
            return bl;
        }
        if (this.x == null) {
            return true;
        }
        if (this.y == null) return this.b.b(this);
        if (!this.y.b(this)) return bl;
        return this.b.b(this);
    }

    public final void d(boolean bl) {
        this.z = bl;
        this.b.b(false);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    final boolean d() {
        if (!this.b.b()) return false;
        if (this.c() == '\u0000') return false;
        return true;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final boolean e() {
        if ((this.w & 4) == 0) return false;
        return true;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public final boolean expandActionView() {
        boolean bl = false;
        if (!this.i()) {
            return bl;
        }
        if (this.y == null) return this.b.a(this);
        if (!this.y.a(this)) return bl;
        return this.b.a(this);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final boolean f() {
        if ((this.w & 0x20) != 32) return false;
        return true;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final boolean g() {
        boolean bl = true;
        if ((this.c & 1) != 1) return false;
        return bl;
    }

    public final ActionProvider getActionProvider() {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.getActionProvider()");
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public final View getActionView() {
        if (this.x != null) {
            return this.x;
        }
        if (this.d == null) return null;
        this.x = this.d.a(this);
        return this.x;
    }

    public final char getAlphabeticShortcut() {
        return this.q;
    }

    public final int getGroupId() {
        return this.k;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final Drawable getIcon() {
        if (this.r != null) {
            return this.r;
        }
        if (this.s == 0) return null;
        Drawable drawable = android.support.v7.internal.widget.o.a(this.b.a, this.s);
        this.s = 0;
        this.r = drawable;
        return drawable;
    }

    public final Intent getIntent() {
        return this.o;
    }

    @ViewDebug.CapturedViewProperty
    public final int getItemId() {
        return this.j;
    }

    public final ContextMenu.ContextMenuInfo getMenuInfo() {
        return this.e;
    }

    public final char getNumericShortcut() {
        return this.p;
    }

    public final int getOrder() {
        return this.l;
    }

    public final SubMenu getSubMenu() {
        return this.t;
    }

    @ViewDebug.CapturedViewProperty
    public final CharSequence getTitle() {
        return this.m;
    }

    /*
     * Enabled aggressive block sorting
     */
    public final CharSequence getTitleCondensed() {
        CharSequence charSequence = this.n != null ? this.n : this.m;
        CharSequence charSequence2 = charSequence;
        if (Build.VERSION.SDK_INT >= 18) return charSequence2;
        charSequence2 = charSequence;
        if (charSequence == null) return charSequence2;
        charSequence2 = charSequence;
        if (charSequence instanceof String) return charSequence2;
        return charSequence.toString();
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final boolean h() {
        if ((this.c & 2) != 2) return false;
        return true;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final boolean hasSubMenu() {
        if (this.t == null) return false;
        return true;
    }

    public final boolean i() {
        boolean bl;
        boolean bl2 = bl = false;
        if ((this.c & 8) != 0) {
            if (this.x == null && this.d != null) {
                this.x = this.d.a(this);
            }
            bl2 = bl;
            if (this.x != null) {
                bl2 = true;
            }
        }
        return bl2;
    }

    @Override
    public final boolean isActionViewExpanded() {
        return this.z;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final boolean isCheckable() {
        boolean bl = true;
        if ((this.w & 1) != 1) return false;
        return bl;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final boolean isChecked() {
        if ((this.w & 2) != 2) return false;
        return true;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final boolean isEnabled() {
        if ((this.w & 0x10) == 0) return false;
        return true;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final boolean isVisible() {
        boolean bl = true;
        if (this.d != null && this.d.b()) {
            if ((this.w & 8) != 0) return false;
            if (!this.d.c()) return false;
            return bl;
        }
        if ((this.w & 8) == 0) return bl;
        return false;
    }

    public final MenuItem setActionProvider(ActionProvider actionProvider) {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.setActionProvider()");
    }

    @Override
    public final /* synthetic */ MenuItem setActionView(int n2) {
        Context context = this.b.a;
        this.a(LayoutInflater.from((Context)context).inflate(n2, (ViewGroup)new LinearLayout(context), false));
        return this;
    }

    @Override
    public final /* synthetic */ MenuItem setActionView(View view) {
        return this.a(view);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final MenuItem setAlphabeticShortcut(char c2) {
        if (this.q == c2) {
            return this;
        }
        this.q = Character.toLowerCase(c2);
        this.b.b(false);
        return this;
    }

    /*
     * Enabled aggressive block sorting
     */
    public final MenuItem setCheckable(boolean bl) {
        int n2 = this.w;
        int n3 = this.w;
        int n4 = bl ? 1 : 0;
        this.w = n4 | n3 & 0xFFFFFFFE;
        if (n2 != this.w) {
            this.b.b(false);
        }
        return this;
    }

    /*
     * Enabled aggressive block sorting
     */
    public final MenuItem setChecked(boolean bl) {
        if ((this.w & 4) == 0) {
            this.e(bl);
            return this;
        } else {
            e e2 = this.b;
            int n2 = this.getGroupId();
            int n3 = e2.b.size();
            for (int i2 = 0; i2 < n3; ++i2) {
                f f2 = e2.b.get(i2);
                if (f2.getGroupId() != n2 || !f2.e() || !f2.isCheckable()) continue;
                bl = f2 == this;
                f2.e(bl);
            }
        }
        return this;
    }

    /*
     * Enabled aggressive block sorting
     */
    public final MenuItem setEnabled(boolean bl) {
        this.w = bl ? (this.w |= 0x10) : (this.w &= 0xFFFFFFEF);
        this.b.b(false);
        return this;
    }

    public final MenuItem setIcon(int n2) {
        this.r = null;
        this.s = n2;
        this.b.b(false);
        return this;
    }

    public final MenuItem setIcon(Drawable drawable) {
        this.s = 0;
        this.r = drawable;
        this.b.b(false);
        return this;
    }

    public final MenuItem setIntent(Intent intent) {
        this.o = intent;
        return this;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final MenuItem setNumericShortcut(char c2) {
        if (this.p == c2) {
            return this;
        }
        this.p = c2;
        this.b.b(false);
        return this;
    }

    public final MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.setOnActionExpandListener()");
    }

    public final MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.v = onMenuItemClickListener;
        return this;
    }

    public final MenuItem setShortcut(char c2, char c3) {
        this.p = c2;
        this.q = Character.toLowerCase(c3);
        this.b.b(false);
        return this;
    }

    @Override
    public final void setShowAsAction(int n2) {
        switch (n2 & 3) {
            default: {
                throw new IllegalArgumentException("SHOW_AS_ACTION_ALWAYS, SHOW_AS_ACTION_IF_ROOM, and SHOW_AS_ACTION_NEVER are mutually exclusive.");
            }
            case 0: 
            case 1: 
            case 2: 
        }
        this.c = n2;
        this.b.d();
    }

    @Override
    public final /* synthetic */ MenuItem setShowAsActionFlags(int n2) {
        this.setShowAsAction(n2);
        return this;
    }

    public final MenuItem setTitle(int n2) {
        return this.setTitle(this.b.a.getString(n2));
    }

    public final MenuItem setTitle(CharSequence charSequence) {
        this.m = charSequence;
        this.b.b(false);
        if (this.t != null) {
            this.t.setHeaderTitle(charSequence);
        }
        return this;
    }

    public final MenuItem setTitleCondensed(CharSequence charSequence) {
        this.n = charSequence;
        this.b.b(false);
        return this;
    }

    public final MenuItem setVisible(boolean bl) {
        if (this.b(bl)) {
            this.b.c();
        }
        return this;
    }

    public final String toString() {
        return this.m.toString();
    }
}

