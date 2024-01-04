/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  android.content.ComponentName
 *  android.content.Context
 *  android.content.Intent
 *  android.view.KeyEvent
 *  android.view.Menu
 *  android.view.MenuItem
 *  android.view.SubMenu
 */
package android.support.v7.internal.view.menu;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.support.v4.b.a.a;
import android.support.v4.b.a.b;
import android.support.v7.internal.view.menu.c;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;
import java.util.Iterator;

class l
extends c<a>
implements Menu {
    l(Context context, a a2) {
        super(context, a2);
    }

    public MenuItem add(int n2) {
        return this.a(((a)this.d).add(n2));
    }

    public MenuItem add(int n2, int n3, int n4, int n5) {
        return this.a(((a)this.d).add(n2, n3, n4, n5));
    }

    public MenuItem add(int n2, int n3, int n4, CharSequence charSequence) {
        return this.a(((a)this.d).add(n2, n3, n4, charSequence));
    }

    public MenuItem add(CharSequence charSequence) {
        return this.a(((a)this.d).add(charSequence));
    }

    public int addIntentOptions(int n2, int n3, int n4, ComponentName componentName, Intent[] arrintent, Intent intent, int n5, MenuItem[] arrmenuItem) {
        MenuItem[] arrmenuItem2 = null;
        if (arrmenuItem != null) {
            arrmenuItem2 = new MenuItem[arrmenuItem.length];
        }
        n3 = ((a)this.d).addIntentOptions(n2, n3, n4, componentName, arrintent, intent, n5, arrmenuItem2);
        if (arrmenuItem2 != null) {
            n4 = arrmenuItem2.length;
            for (n2 = 0; n2 < n4; ++n2) {
                arrmenuItem[n2] = this.a(arrmenuItem2[n2]);
            }
        }
        return n3;
    }

    public SubMenu addSubMenu(int n2) {
        return this.a(((a)this.d).addSubMenu(n2));
    }

    public SubMenu addSubMenu(int n2, int n3, int n4, int n5) {
        return this.a(((a)this.d).addSubMenu(n2, n3, n4, n5));
    }

    public SubMenu addSubMenu(int n2, int n3, int n4, CharSequence charSequence) {
        return this.a(((a)this.d).addSubMenu(n2, n3, n4, charSequence));
    }

    public SubMenu addSubMenu(CharSequence charSequence) {
        return this.a(((a)this.d).addSubMenu(charSequence));
    }

    public void clear() {
        if (this.b != null) {
            this.b.clear();
        }
        if (this.c != null) {
            this.c.clear();
        }
        ((a)this.d).clear();
    }

    public void close() {
        ((a)this.d).close();
    }

    public MenuItem findItem(int n2) {
        return this.a(((a)this.d).findItem(n2));
    }

    public MenuItem getItem(int n2) {
        return this.a(((a)this.d).getItem(n2));
    }

    public boolean hasVisibleItems() {
        return ((a)this.d).hasVisibleItems();
    }

    public boolean isShortcutKey(int n2, KeyEvent keyEvent) {
        return ((a)this.d).isShortcutKey(n2, keyEvent);
    }

    public boolean performIdentifierAction(int n2, int n3) {
        return ((a)this.d).performIdentifierAction(n2, n3);
    }

    public boolean performShortcut(int n2, KeyEvent keyEvent, int n3) {
        return ((a)this.d).performShortcut(n2, keyEvent, n3);
    }

    public void removeGroup(int n2) {
        if (this.b != null) {
            Iterator<b> iterator = this.b.keySet().iterator();
            while (iterator.hasNext()) {
                if (n2 != ((MenuItem)iterator.next()).getGroupId()) continue;
                iterator.remove();
            }
        }
        ((a)this.d).removeGroup(n2);
    }

    public void removeItem(int n2) {
        if (this.b != null) {
            Iterator<b> iterator = this.b.keySet().iterator();
            while (iterator.hasNext()) {
                if (n2 != ((MenuItem)iterator.next()).getItemId()) continue;
                iterator.remove();
                break;
            }
        }
        ((a)this.d).removeItem(n2);
    }

    public void setGroupCheckable(int n2, boolean bl, boolean bl2) {
        ((a)this.d).setGroupCheckable(n2, bl, bl2);
    }

    public void setGroupEnabled(int n2, boolean bl) {
        ((a)this.d).setGroupEnabled(n2, bl);
    }

    public void setGroupVisible(int n2, boolean bl) {
        ((a)this.d).setGroupVisible(n2, bl);
    }

    public void setQwertyMode(boolean bl) {
        ((a)this.d).setQwertyMode(bl);
    }

    public int size() {
        return ((a)this.d).size();
    }
}

