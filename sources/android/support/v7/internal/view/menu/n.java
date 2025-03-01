package android.support.v7.internal.view.menu;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.support.v4.b.a.c;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;

final class n extends l implements SubMenu {
    n(Context context, c cVar) {
        super(context, cVar);
    }

    public final SubMenu setHeaderTitle(int i) {
        ((c) this.d).setHeaderTitle(i);
        return this;
    }

    public final SubMenu setHeaderTitle(CharSequence charSequence) {
        ((c) this.d).setHeaderTitle(charSequence);
        return this;
    }

    public final SubMenu setHeaderIcon(int i) {
        ((c) this.d).setHeaderIcon(i);
        return this;
    }

    public final SubMenu setHeaderIcon(Drawable drawable) {
        ((c) this.d).setHeaderIcon(drawable);
        return this;
    }

    public final SubMenu setHeaderView(View view) {
        ((c) this.d).setHeaderView(view);
        return this;
    }

    public final void clearHeader() {
        ((c) this.d).clearHeader();
    }

    public final SubMenu setIcon(int i) {
        ((c) this.d).setIcon(i);
        return this;
    }

    public final SubMenu setIcon(Drawable drawable) {
        ((c) this.d).setIcon(drawable);
        return this;
    }

    public final MenuItem getItem() {
        return a(((c) this.d).getItem());
    }
}
