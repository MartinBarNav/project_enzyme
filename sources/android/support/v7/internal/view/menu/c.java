package android.support.v7.internal.view.menu;

import android.content.Context;
import android.os.Build;
import android.support.v4.b.a.b;
import android.support.v4.e.a;
import android.view.MenuItem;
import android.view.SubMenu;
import java.util.Map;

abstract class c<T> extends d<T> {
    final Context a;
    Map<b, MenuItem> b;
    Map<android.support.v4.b.a.c, SubMenu> c;

    c(Context context, T t) {
        super(t);
        this.a = context;
    }

    /* access modifiers changed from: package-private */
    public final MenuItem a(MenuItem menuItem) {
        MenuItem gVar;
        if (!(menuItem instanceof b)) {
            return menuItem;
        }
        b bVar = (b) menuItem;
        if (this.b == null) {
            this.b = new a();
        }
        MenuItem menuItem2 = this.b.get(menuItem);
        if (menuItem2 != null) {
            return menuItem2;
        }
        Context context = this.a;
        if (Build.VERSION.SDK_INT >= 16) {
            gVar = new h(context, bVar);
        } else if (Build.VERSION.SDK_INT >= 14) {
            gVar = new g(context, bVar);
        } else {
            throw new UnsupportedOperationException();
        }
        this.b.put(bVar, gVar);
        return gVar;
    }

    /* access modifiers changed from: package-private */
    public final SubMenu a(SubMenu subMenu) {
        if (!(subMenu instanceof android.support.v4.b.a.c)) {
            return subMenu;
        }
        android.support.v4.b.a.c cVar = (android.support.v4.b.a.c) subMenu;
        if (this.c == null) {
            this.c = new a();
        }
        SubMenu subMenu2 = this.c.get(cVar);
        if (subMenu2 != null) {
            return subMenu2;
        }
        Context context = this.a;
        if (Build.VERSION.SDK_INT >= 14) {
            n nVar = new n(context, cVar);
            this.c.put(cVar, nVar);
            return nVar;
        }
        throw new UnsupportedOperationException();
    }
}
