package android.support.v7.internal.view.menu;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.support.v4.content.a;
import android.support.v7.internal.view.menu.e;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;

public final class m extends e implements SubMenu {
    public e i;
    private f j;

    public m(Context context, e eVar, f fVar) {
        super(context);
        this.i = eVar;
        this.j = fVar;
    }

    public final void setQwertyMode(boolean z) {
        this.i.setQwertyMode(z);
    }

    public final boolean a() {
        return this.i.a();
    }

    public final boolean b() {
        return this.i.b();
    }

    public final MenuItem getItem() {
        return this.j;
    }

    public final void a(e.a aVar) {
        this.i.a(aVar);
    }

    public final e h() {
        return this.i;
    }

    /* access modifiers changed from: package-private */
    public final boolean a(e eVar, MenuItem menuItem) {
        return super.a(eVar, menuItem) || this.i.a(eVar, menuItem);
    }

    public final SubMenu setIcon(Drawable drawable) {
        this.j.setIcon(drawable);
        return this;
    }

    public final SubMenu setIcon(int i2) {
        this.j.setIcon(i2);
        return this;
    }

    public final SubMenu setHeaderIcon(Drawable drawable) {
        super.a(drawable);
        return this;
    }

    public final SubMenu setHeaderTitle(CharSequence charSequence) {
        super.a(charSequence);
        return this;
    }

    public final SubMenu setHeaderView(View view) {
        super.a((CharSequence) null, (Drawable) null, view);
        return this;
    }

    public final boolean a(f fVar) {
        return this.i.a(fVar);
    }

    public final boolean b(f fVar) {
        return this.i.b(fVar);
    }

    public final SubMenu setHeaderIcon(int i2) {
        super.a(a.a(this.a, i2));
        return this;
    }

    public final SubMenu setHeaderTitle(int i2) {
        super.a((CharSequence) this.a.getResources().getString(i2));
        return this;
    }
}
