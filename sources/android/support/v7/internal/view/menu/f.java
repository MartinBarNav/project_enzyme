package android.support.v7.internal.view.menu;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.support.v4.b.a.b;
import android.support.v4.view.d;
import android.support.v4.view.k;
import android.support.v7.internal.view.menu.k;
import android.support.v7.internal.widget.o;
import android.util.Log;
import android.view.ActionProvider;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewDebug;
import android.widget.LinearLayout;

public final class f implements b {
    static String f;
    static String g;
    static String h;
    static String i;
    final int a;
    /* access modifiers changed from: package-private */
    public e b;
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

    f(e eVar, int i2, int i3, int i4, int i5, CharSequence charSequence, int i6) {
        this.b = eVar;
        this.j = i3;
        this.k = i2;
        this.l = i4;
        this.a = i5;
        this.m = charSequence;
        this.c = i6;
    }

    public final boolean b() {
        if ((this.v != null && this.v.onMenuItemClick(this)) || this.b.a(this.b.h(), (MenuItem) this)) {
            return true;
        }
        if (this.u != null) {
            this.u.run();
            return true;
        }
        if (this.o != null) {
            try {
                this.b.a.startActivity(this.o);
                return true;
            } catch (ActivityNotFoundException e2) {
                Log.e("MenuItemImpl", "Can't find activity to handle intent; ignoring", e2);
            }
        }
        if (this.d == null || !this.d.d()) {
            return false;
        }
        return true;
    }

    public final boolean isEnabled() {
        return (this.w & 16) != 0;
    }

    public final MenuItem setEnabled(boolean z2) {
        if (z2) {
            this.w |= 16;
        } else {
            this.w &= -17;
        }
        this.b.b(false);
        return this;
    }

    public final int getGroupId() {
        return this.k;
    }

    @ViewDebug.CapturedViewProperty
    public final int getItemId() {
        return this.j;
    }

    public final int getOrder() {
        return this.l;
    }

    public final Intent getIntent() {
        return this.o;
    }

    public final MenuItem setIntent(Intent intent) {
        this.o = intent;
        return this;
    }

    public final char getAlphabeticShortcut() {
        return this.q;
    }

    public final MenuItem setAlphabeticShortcut(char c2) {
        if (this.q != c2) {
            this.q = Character.toLowerCase(c2);
            this.b.b(false);
        }
        return this;
    }

    public final char getNumericShortcut() {
        return this.p;
    }

    public final MenuItem setNumericShortcut(char c2) {
        if (this.p != c2) {
            this.p = c2;
            this.b.b(false);
        }
        return this;
    }

    public final MenuItem setShortcut(char c2, char c3) {
        this.p = c2;
        this.q = Character.toLowerCase(c3);
        this.b.b(false);
        return this;
    }

    /* access modifiers changed from: package-private */
    public final char c() {
        return this.b.a() ? this.q : this.p;
    }

    /* access modifiers changed from: package-private */
    public final boolean d() {
        return this.b.b() && c() != 0;
    }

    public final SubMenu getSubMenu() {
        return this.t;
    }

    public final boolean hasSubMenu() {
        return this.t != null;
    }

    /* access modifiers changed from: package-private */
    public final void a(m mVar) {
        this.t = mVar;
        mVar.setHeaderTitle(getTitle());
    }

    @ViewDebug.CapturedViewProperty
    public final CharSequence getTitle() {
        return this.m;
    }

    /* access modifiers changed from: package-private */
    public final CharSequence a(k.a aVar) {
        return (aVar == null || !aVar.a()) ? getTitle() : getTitleCondensed();
    }

    public final MenuItem setTitle(CharSequence charSequence) {
        this.m = charSequence;
        this.b.b(false);
        if (this.t != null) {
            this.t.setHeaderTitle(charSequence);
        }
        return this;
    }

    public final MenuItem setTitle(int i2) {
        return setTitle((CharSequence) this.b.a.getString(i2));
    }

    public final CharSequence getTitleCondensed() {
        CharSequence charSequence = this.n != null ? this.n : this.m;
        if (Build.VERSION.SDK_INT >= 18 || charSequence == null || (charSequence instanceof String)) {
            return charSequence;
        }
        return charSequence.toString();
    }

    public final MenuItem setTitleCondensed(CharSequence charSequence) {
        this.n = charSequence;
        this.b.b(false);
        return this;
    }

    public final Drawable getIcon() {
        if (this.r != null) {
            return this.r;
        }
        if (this.s == 0) {
            return null;
        }
        Drawable a2 = o.a(this.b.a, this.s);
        this.s = 0;
        this.r = a2;
        return a2;
    }

    public final MenuItem setIcon(Drawable drawable) {
        this.s = 0;
        this.r = drawable;
        this.b.b(false);
        return this;
    }

    public final MenuItem setIcon(int i2) {
        this.r = null;
        this.s = i2;
        this.b.b(false);
        return this;
    }

    public final boolean isCheckable() {
        return (this.w & 1) == 1;
    }

    public final MenuItem setCheckable(boolean z2) {
        int i2 = this.w;
        this.w = (z2 ? 1 : 0) | (this.w & -2);
        if (i2 != this.w) {
            this.b.b(false);
        }
        return this;
    }

    public final void a(boolean z2) {
        this.w = (z2 ? 4 : 0) | (this.w & -5);
    }

    public final boolean e() {
        return (this.w & 4) != 0;
    }

    public final boolean isChecked() {
        return (this.w & 2) == 2;
    }

    public final MenuItem setChecked(boolean z2) {
        if ((this.w & 4) != 0) {
            e eVar = this.b;
            int groupId = getGroupId();
            int size = eVar.b.size();
            for (int i2 = 0; i2 < size; i2++) {
                f fVar = eVar.b.get(i2);
                if (fVar.getGroupId() == groupId && fVar.e() && fVar.isCheckable()) {
                    fVar.e(fVar == this);
                }
            }
        } else {
            e(z2);
        }
        return this;
    }

    private void e(boolean z2) {
        int i2;
        int i3 = this.w;
        int i4 = this.w & -3;
        if (z2) {
            i2 = 2;
        } else {
            i2 = 0;
        }
        this.w = i2 | i4;
        if (i3 != this.w) {
            this.b.b(false);
        }
    }

    public final boolean isVisible() {
        if (this.d == null || !this.d.b()) {
            if ((this.w & 8) != 0) {
                return false;
            }
            return true;
        } else if ((this.w & 8) != 0 || !this.d.c()) {
            return false;
        } else {
            return true;
        }
    }

    /* access modifiers changed from: package-private */
    public final boolean b(boolean z2) {
        int i2 = this.w;
        this.w = (z2 ? 0 : 8) | (this.w & -9);
        if (i2 != this.w) {
            return true;
        }
        return false;
    }

    public final MenuItem setVisible(boolean z2) {
        if (b(z2)) {
            this.b.c();
        }
        return this;
    }

    public final MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.v = onMenuItemClickListener;
        return this;
    }

    public final String toString() {
        return this.m.toString();
    }

    public final ContextMenu.ContextMenuInfo getMenuInfo() {
        return this.e;
    }

    public final boolean f() {
        return (this.w & 32) == 32;
    }

    public final boolean g() {
        return (this.c & 1) == 1;
    }

    public final boolean h() {
        return (this.c & 2) == 2;
    }

    public final void c(boolean z2) {
        if (z2) {
            this.w |= 32;
        } else {
            this.w &= -33;
        }
    }

    public final void setShowAsAction(int i2) {
        switch (i2 & 3) {
            case 0:
            case 1:
            case 2:
                this.c = i2;
                this.b.d();
                return;
            default:
                throw new IllegalArgumentException("SHOW_AS_ACTION_ALWAYS, SHOW_AS_ACTION_IF_ROOM, and SHOW_AS_ACTION_NEVER are mutually exclusive.");
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public b setActionView(View view) {
        this.x = view;
        this.d = null;
        if (view != null && view.getId() == -1 && this.j > 0) {
            view.setId(this.j);
        }
        this.b.d();
        return this;
    }

    public final View getActionView() {
        if (this.x != null) {
            return this.x;
        }
        if (this.d == null) {
            return null;
        }
        this.x = this.d.a((MenuItem) this);
        return this.x;
    }

    public final MenuItem setActionProvider(ActionProvider actionProvider) {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.setActionProvider()");
    }

    public final ActionProvider getActionProvider() {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.getActionProvider()");
    }

    public final d a() {
        return this.d;
    }

    public final b a(d dVar) {
        if (this.d != null) {
            this.d.a((d.b) null);
        }
        this.x = null;
        this.d = dVar;
        this.b.b(true);
        if (this.d != null) {
            this.d.a((d.b) new d.b() {
                public final void a() {
                    f.this.b.c();
                }
            });
        }
        return this;
    }

    public final boolean expandActionView() {
        if (!i()) {
            return false;
        }
        if (this.y == null || this.y.a(this)) {
            return this.b.a(this);
        }
        return false;
    }

    public final boolean collapseActionView() {
        if ((this.c & 8) == 0) {
            return false;
        }
        if (this.x == null) {
            return true;
        }
        if (this.y == null || this.y.b(this)) {
            return this.b.b(this);
        }
        return false;
    }

    public final b a(k.e eVar) {
        this.y = eVar;
        return this;
    }

    public final boolean i() {
        if ((this.c & 8) == 0) {
            return false;
        }
        if (this.x == null && this.d != null) {
            this.x = this.d.a((MenuItem) this);
        }
        if (this.x != null) {
            return true;
        }
        return false;
    }

    public final void d(boolean z2) {
        this.z = z2;
        this.b.b(false);
    }

    public final boolean isActionViewExpanded() {
        return this.z;
    }

    public final MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.setOnActionExpandListener()");
    }

    public final /* synthetic */ MenuItem setActionView(int i2) {
        Context context = this.b.a;
        setActionView(LayoutInflater.from(context).inflate(i2, new LinearLayout(context), false));
        return this;
    }

    public final /* synthetic */ MenuItem setShowAsActionFlags(int i2) {
        setShowAsAction(i2);
        return this;
    }
}
