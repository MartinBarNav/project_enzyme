// 
// Decompiled by Procyon v0.5.36
// 

package android.support.v7.internal.view.menu;

import android.view.MenuItem$OnActionExpandListener;
import android.content.Context;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.view.LayoutInflater;
import android.os.Build$VERSION;
import android.view.SubMenu;
import android.view.ViewDebug$CapturedViewProperty;
import android.support.v7.internal.widget.o;
import android.view.ActionProvider;
import android.content.ActivityNotFoundException;
import android.util.Log;
import android.view.MenuItem;
import android.support.v4.view.k;
import android.view.View;
import android.view.MenuItem$OnMenuItemClickListener;
import android.graphics.drawable.Drawable;
import android.content.Intent;
import android.view.ContextMenu$ContextMenuInfo;
import android.support.v4.view.d;
import android.support.v4.b.a.b;

public final class f implements b
{
    static String f;
    static String g;
    static String h;
    static String i;
    final int a;
    e b;
    int c;
    public d d;
    ContextMenu$ContextMenuInfo e;
    private final int j;
    private final int k;
    private final int l;
    private CharSequence m;
    private CharSequence n;
    private Intent o;
    private char p;
    private char q;
    private Drawable r;
    private int s;
    private m t;
    private Runnable u;
    private MenuItem$OnMenuItemClickListener v;
    private int w;
    private View x;
    private k.e y;
    private boolean z;
    
    f(final e b, final int k, final int j, final int l, final int a, final CharSequence m, final int c) {
        this.s = 0;
        this.w = 16;
        this.c = 0;
        this.z = false;
        this.b = b;
        this.j = j;
        this.k = k;
        this.l = l;
        this.a = a;
        this.m = m;
        this.c = c;
    }
    
    private b a(final View x) {
        this.x = x;
        this.d = null;
        if (x != null && x.getId() == -1 && this.j > 0) {
            x.setId(this.j);
        }
        this.b.d();
        return this;
    }
    
    private void e(final boolean b) {
        final int w = this.w;
        final int w2 = this.w;
        int n;
        if (b) {
            n = 2;
        }
        else {
            n = 0;
        }
        this.w = (n | (w2 & 0xFFFFFFFD));
        if (w != this.w) {
            this.b.b(false);
        }
    }
    
    @Override
    public final b a(final d d) {
        if (this.d != null) {
            this.d.a((d.b)null);
        }
        this.x = null;
        this.d = d;
        this.b.b(true);
        if (this.d != null) {
            this.d.a((d.b)new d.b() {
                @Override
                public final void a() {
                    android.support.v7.internal.view.menu.f.this.b.c();
                }
            });
        }
        return this;
    }
    
    @Override
    public final b a(final k.e y) {
        this.y = y;
        return this;
    }
    
    @Override
    public final d a() {
        return this.d;
    }
    
    final CharSequence a(final android.support.v7.internal.view.menu.k.a a) {
        CharSequence charSequence;
        if (a != null && a.a()) {
            charSequence = this.getTitleCondensed();
        }
        else {
            charSequence = this.getTitle();
        }
        return charSequence;
    }
    
    final void a(final m t) {
        (this.t = t).setHeaderTitle(this.getTitle());
    }
    
    public final void a(final boolean b) {
        final int w = this.w;
        int n;
        if (b) {
            n = 4;
        }
        else {
            n = 0;
        }
        this.w = (n | (w & 0xFFFFFFFB));
    }
    
    public final boolean b() {
        final boolean b = true;
        boolean b2;
        if (this.v != null && this.v.onMenuItemClick((MenuItem)this)) {
            b2 = b;
        }
        else {
            b2 = b;
            if (!this.b.a(this.b.h(), (MenuItem)this)) {
                if (this.u != null) {
                    this.u.run();
                    b2 = b;
                }
                else {
                    if (this.o != null) {
                        try {
                            this.b.a.startActivity(this.o);
                            b2 = b;
                            return b2;
                        }
                        catch (ActivityNotFoundException ex) {
                            Log.e("MenuItemImpl", "Can't find activity to handle intent; ignoring", (Throwable)ex);
                        }
                    }
                    if (this.d != null) {
                        b2 = b;
                        if (this.d.d()) {
                            return b2;
                        }
                    }
                    b2 = false;
                }
            }
        }
        return b2;
    }
    
    final boolean b(final boolean b) {
        final boolean b2 = false;
        final int w = this.w;
        final int w2 = this.w;
        int n;
        if (b) {
            n = 0;
        }
        else {
            n = 8;
        }
        this.w = (n | (w2 & 0xFFFFFFF7));
        boolean b3 = b2;
        if (w != this.w) {
            b3 = true;
        }
        return b3;
    }
    
    final char c() {
        char c;
        if (this.b.a()) {
            c = this.q;
        }
        else {
            c = this.p;
        }
        return c;
    }
    
    public final void c(final boolean b) {
        if (b) {
            this.w |= 0x20;
        }
        else {
            this.w &= 0xFFFFFFDF;
        }
    }
    
    @Override
    public final boolean collapseActionView() {
        boolean b = false;
        if ((this.c & 0x8) != 0x0) {
            if (this.x == null) {
                b = true;
            }
            else if (this.y == null || this.y.b((MenuItem)this)) {
                b = this.b.b(this);
            }
        }
        return b;
    }
    
    public final void d(final boolean z) {
        this.z = z;
        this.b.b(false);
    }
    
    final boolean d() {
        return this.b.b() && this.c() != '\0';
    }
    
    public final boolean e() {
        return (this.w & 0x4) != 0x0;
    }
    
    @Override
    public final boolean expandActionView() {
        boolean a = false;
        if (this.i() && (this.y == null || this.y.a((MenuItem)this))) {
            a = this.b.a(this);
        }
        return a;
    }
    
    public final boolean f() {
        return (this.w & 0x20) == 0x20;
    }
    
    public final boolean g() {
        boolean b = true;
        if ((this.c & 0x1) != 0x1) {
            b = false;
        }
        return b;
    }
    
    public final ActionProvider getActionProvider() {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.getActionProvider()");
    }
    
    @Override
    public final View getActionView() {
        View view;
        if (this.x != null) {
            view = this.x;
        }
        else if (this.d != null) {
            this.x = this.d.a((MenuItem)this);
            view = this.x;
        }
        else {
            view = null;
        }
        return view;
    }
    
    public final char getAlphabeticShortcut() {
        return this.q;
    }
    
    public final int getGroupId() {
        return this.k;
    }
    
    public final Drawable getIcon() {
        Drawable r;
        if (this.r != null) {
            r = this.r;
        }
        else if (this.s != 0) {
            r = android.support.v7.internal.widget.o.a(this.b.a, this.s);
            this.s = 0;
            this.r = r;
        }
        else {
            r = null;
        }
        return r;
    }
    
    public final Intent getIntent() {
        return this.o;
    }
    
    @ViewDebug$CapturedViewProperty
    public final int getItemId() {
        return this.j;
    }
    
    public final ContextMenu$ContextMenuInfo getMenuInfo() {
        return this.e;
    }
    
    public final char getNumericShortcut() {
        return this.p;
    }
    
    public final int getOrder() {
        return this.l;
    }
    
    public final SubMenu getSubMenu() {
        return (SubMenu)this.t;
    }
    
    @ViewDebug$CapturedViewProperty
    public final CharSequence getTitle() {
        return this.m;
    }
    
    public final CharSequence getTitleCondensed() {
        CharSequence charSequence;
        if (this.n != null) {
            charSequence = this.n;
        }
        else {
            charSequence = this.m;
        }
        CharSequence string = charSequence;
        if (Build$VERSION.SDK_INT < 18 && (string = charSequence) != null) {
            string = charSequence;
            if (!(charSequence instanceof String)) {
                string = charSequence.toString();
            }
        }
        return string;
    }
    
    public final boolean h() {
        return (this.c & 0x2) == 0x2;
    }
    
    public final boolean hasSubMenu() {
        return this.t != null;
    }
    
    public final boolean i() {
        boolean b = false;
        if ((this.c & 0x8) != 0x0) {
            if (this.x == null && this.d != null) {
                this.x = this.d.a((MenuItem)this);
            }
            b = b;
            if (this.x != null) {
                b = true;
            }
        }
        return b;
    }
    
    @Override
    public final boolean isActionViewExpanded() {
        return this.z;
    }
    
    public final boolean isCheckable() {
        boolean b = true;
        if ((this.w & 0x1) != 0x1) {
            b = false;
        }
        return b;
    }
    
    public final boolean isChecked() {
        return (this.w & 0x2) == 0x2;
    }
    
    public final boolean isEnabled() {
        return (this.w & 0x10) != 0x0;
    }
    
    public final boolean isVisible() {
        boolean b = true;
        if (this.d != null && this.d.b()) {
            if ((this.w & 0x8) != 0x0 || !this.d.c()) {
                b = false;
            }
        }
        else if ((this.w & 0x8) != 0x0) {
            b = false;
        }
        return b;
    }
    
    public final MenuItem setActionProvider(final ActionProvider actionProvider) {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.setActionProvider()");
    }
    
    public final MenuItem setAlphabeticShortcut(final char ch) {
        if (this.q != ch) {
            this.q = Character.toLowerCase(ch);
            this.b.b(false);
        }
        return (MenuItem)this;
    }
    
    public final MenuItem setCheckable(final boolean b) {
        final int w = this.w;
        final int w2 = this.w;
        boolean b2;
        if (b) {
            b2 = true;
        }
        else {
            b2 = false;
        }
        this.w = ((b2 ? 1 : 0) | (w2 & 0xFFFFFFFE));
        if (w != this.w) {
            this.b.b(false);
        }
        return (MenuItem)this;
    }
    
    public final MenuItem setChecked(final boolean b) {
        if ((this.w & 0x4) != 0x0) {
            final e b2 = this.b;
            final int groupId = ((MenuItem)this).getGroupId();
            for (int size = b2.b.size(), i = 0; i < size; ++i) {
                final f f = b2.b.get(i);
                if (f.getGroupId() == groupId && f.e() && f.isCheckable()) {
                    f.e(f == this);
                }
            }
        }
        else {
            this.e(b);
        }
        return (MenuItem)this;
    }
    
    public final MenuItem setEnabled(final boolean b) {
        if (b) {
            this.w |= 0x10;
        }
        else {
            this.w &= 0xFFFFFFEF;
        }
        this.b.b(false);
        return (MenuItem)this;
    }
    
    public final MenuItem setIcon(final int s) {
        this.r = null;
        this.s = s;
        this.b.b(false);
        return (MenuItem)this;
    }
    
    public final MenuItem setIcon(final Drawable r) {
        this.s = 0;
        this.r = r;
        this.b.b(false);
        return (MenuItem)this;
    }
    
    public final MenuItem setIntent(final Intent o) {
        this.o = o;
        return (MenuItem)this;
    }
    
    public final MenuItem setNumericShortcut(final char c) {
        if (this.p != c) {
            this.p = c;
            this.b.b(false);
        }
        return (MenuItem)this;
    }
    
    public final MenuItem setOnActionExpandListener(final MenuItem$OnActionExpandListener menuItem$OnActionExpandListener) {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.setOnActionExpandListener()");
    }
    
    public final MenuItem setOnMenuItemClickListener(final MenuItem$OnMenuItemClickListener v) {
        this.v = v;
        return (MenuItem)this;
    }
    
    public final MenuItem setShortcut(final char c, final char ch) {
        this.p = c;
        this.q = Character.toLowerCase(ch);
        this.b.b(false);
        return (MenuItem)this;
    }
    
    @Override
    public final void setShowAsAction(final int c) {
        switch (c & 0x3) {
            default: {
                throw new IllegalArgumentException("SHOW_AS_ACTION_ALWAYS, SHOW_AS_ACTION_IF_ROOM, and SHOW_AS_ACTION_NEVER are mutually exclusive.");
            }
            case 0:
            case 1:
            case 2: {
                this.c = c;
                this.b.d();
            }
        }
    }
    
    public final MenuItem setTitle(final int n) {
        return this.setTitle(this.b.a.getString(n));
    }
    
    public final MenuItem setTitle(final CharSequence charSequence) {
        this.m = charSequence;
        this.b.b(false);
        if (this.t != null) {
            this.t.setHeaderTitle(charSequence);
        }
        return (MenuItem)this;
    }
    
    public final MenuItem setTitleCondensed(final CharSequence n) {
        this.n = n;
        this.b.b(false);
        return (MenuItem)this;
    }
    
    public final MenuItem setVisible(final boolean b) {
        if (this.b(b)) {
            this.b.c();
        }
        return (MenuItem)this;
    }
    
    @Override
    public final String toString() {
        return this.m.toString();
    }
}
