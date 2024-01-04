// 
// Decompiled by Procyon v0.5.36
// 

package android.support.v7.internal.view.menu;

import android.support.v4.b.a.b;
import java.util.Iterator;
import android.view.KeyEvent;
import android.view.SubMenu;
import android.content.Intent;
import android.content.ComponentName;
import android.view.MenuItem;
import android.content.Context;
import android.view.Menu;
import android.support.v4.b.a.a;

class l extends c<a> implements Menu
{
    l(final Context context, final a a) {
        super(context, a);
    }
    
    public MenuItem add(final int n) {
        return this.a(((a)this.d).add(n));
    }
    
    public MenuItem add(final int n, final int n2, final int n3, final int n4) {
        return this.a(((a)this.d).add(n, n2, n3, n4));
    }
    
    public MenuItem add(final int n, final int n2, final int n3, final CharSequence charSequence) {
        return this.a(((a)this.d).add(n, n2, n3, charSequence));
    }
    
    public MenuItem add(final CharSequence charSequence) {
        return this.a(((a)this.d).add(charSequence));
    }
    
    public int addIntentOptions(int i, int addIntentOptions, int length, final ComponentName componentName, final Intent[] array, final Intent intent, final int n, final MenuItem[] array2) {
        MenuItem[] array3 = null;
        if (array2 != null) {
            array3 = new MenuItem[array2.length];
        }
        addIntentOptions = ((a)this.d).addIntentOptions(i, addIntentOptions, length, componentName, array, intent, n, array3);
        if (array3 != null) {
            for (i = 0, length = array3.length; i < length; ++i) {
                array2[i] = this.a(array3[i]);
            }
        }
        return addIntentOptions;
    }
    
    public SubMenu addSubMenu(final int n) {
        return this.a(((a)this.d).addSubMenu(n));
    }
    
    public SubMenu addSubMenu(final int n, final int n2, final int n3, final int n4) {
        return this.a(((a)this.d).addSubMenu(n, n2, n3, n4));
    }
    
    public SubMenu addSubMenu(final int n, final int n2, final int n3, final CharSequence charSequence) {
        return this.a(((a)this.d).addSubMenu(n, n2, n3, charSequence));
    }
    
    public SubMenu addSubMenu(final CharSequence charSequence) {
        return this.a(((a)this.d).addSubMenu(charSequence));
    }
    
    public void clear() {
        if (super.b != null) {
            super.b.clear();
        }
        if (super.c != null) {
            super.c.clear();
        }
        ((a)this.d).clear();
    }
    
    public void close() {
        ((a)this.d).close();
    }
    
    public MenuItem findItem(final int n) {
        return this.a(((a)this.d).findItem(n));
    }
    
    public MenuItem getItem(final int n) {
        return this.a(((a)this.d).getItem(n));
    }
    
    public boolean hasVisibleItems() {
        return ((a)this.d).hasVisibleItems();
    }
    
    public boolean isShortcutKey(final int n, final KeyEvent keyEvent) {
        return ((a)this.d).isShortcutKey(n, keyEvent);
    }
    
    public boolean performIdentifierAction(final int n, final int n2) {
        return ((a)this.d).performIdentifierAction(n, n2);
    }
    
    public boolean performShortcut(final int n, final KeyEvent keyEvent, final int n2) {
        return ((a)this.d).performShortcut(n, keyEvent, n2);
    }
    
    public void removeGroup(final int n) {
        if (super.b != null) {
            final Iterator<b> iterator = super.b.keySet().iterator();
            while (iterator.hasNext()) {
                if (n == ((MenuItem)iterator.next()).getGroupId()) {
                    iterator.remove();
                }
            }
        }
        ((a)this.d).removeGroup(n);
    }
    
    public void removeItem(final int n) {
        if (super.b != null) {
            final Iterator<b> iterator = super.b.keySet().iterator();
            while (iterator.hasNext()) {
                if (n == ((MenuItem)iterator.next()).getItemId()) {
                    iterator.remove();
                    break;
                }
            }
        }
        ((a)this.d).removeItem(n);
    }
    
    public void setGroupCheckable(final int n, final boolean b, final boolean b2) {
        ((a)this.d).setGroupCheckable(n, b, b2);
    }
    
    public void setGroupEnabled(final int n, final boolean b) {
        ((a)this.d).setGroupEnabled(n, b);
    }
    
    public void setGroupVisible(final int n, final boolean b) {
        ((a)this.d).setGroupVisible(n, b);
    }
    
    public void setQwertyMode(final boolean qwertyMode) {
        ((a)this.d).setQwertyMode(qwertyMode);
    }
    
    public int size() {
        return ((a)this.d).size();
    }
}
