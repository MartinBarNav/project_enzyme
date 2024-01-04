/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.os.Build$VERSION
 *  android.view.MenuItem
 *  android.view.SubMenu
 */
package android.support.v7.internal.view.menu;

import android.content.Context;
import android.os.Build;
import android.support.v4.b.a.b;
import android.support.v4.e.a;
import android.support.v7.internal.view.menu.d;
import android.support.v7.internal.view.menu.g;
import android.support.v7.internal.view.menu.h;
import android.support.v7.internal.view.menu.n;
import android.view.MenuItem;
import android.view.SubMenu;
import java.util.Map;

abstract class c<T>
extends d<T> {
    final Context a;
    Map<b, MenuItem> b;
    Map<android.support.v4.b.a.c, SubMenu> c;

    c(Context context, T t2) {
        super(t2);
        this.a = context;
    }

    /*
     * Enabled aggressive block sorting
     */
    final MenuItem a(MenuItem menuItem) {
        if (menuItem instanceof b) {
            MenuItem menuItem2;
            b b2 = (b)menuItem;
            if (this.b == null) {
                this.b = new a<b, MenuItem>();
            }
            menuItem = menuItem2 = this.b.get((Object)menuItem);
            if (menuItem2 == null) {
                menuItem = this.a;
                if (Build.VERSION.SDK_INT >= 16) {
                    menuItem = new h((Context)menuItem, b2);
                } else {
                    if (Build.VERSION.SDK_INT < 14) {
                        throw new UnsupportedOperationException();
                    }
                    menuItem = new g((Context)menuItem, b2);
                }
                this.b.put(b2, menuItem);
            }
        }
        return menuItem;
    }

    final SubMenu a(SubMenu subMenu) {
        block5: {
            block4: {
                SubMenu subMenu2;
                if (!(subMenu instanceof android.support.v4.b.a.c)) break block4;
                android.support.v4.b.a.c c2 = (android.support.v4.b.a.c)subMenu;
                if (this.c == null) {
                    this.c = new a<android.support.v4.b.a.c, SubMenu>();
                }
                subMenu = subMenu2 = this.c.get(c2);
                if (subMenu2 != null) break block4;
                subMenu = this.a;
                if (Build.VERSION.SDK_INT < 14) break block5;
                subMenu = new n((Context)subMenu, c2);
                this.c.put(c2, subMenu);
            }
            return subMenu;
        }
        throw new UnsupportedOperationException();
    }
}

