// 
// Decompiled by Procyon v0.5.36
// 

package android.support.v7.internal.view.menu;

import android.os.Build$VERSION;
import android.support.v4.e.a;
import android.view.SubMenu;
import android.view.MenuItem;
import android.support.v4.b.a.b;
import java.util.Map;
import android.content.Context;

abstract class c<T> extends d<T>
{
    final Context a;
    Map<b, MenuItem> b;
    Map<android.support.v4.b.a.c, SubMenu> c;
    
    c(final Context a, final T t) {
        super(t);
        this.a = a;
    }
    
    final MenuItem a(MenuItem o) {
        if (o instanceof b) {
            final b b = (b)o;
            if (this.b == null) {
                this.b = new a<b, MenuItem>();
            }
            if ((o = this.b.get(o)) == null) {
                final Context a = this.a;
                if (Build$VERSION.SDK_INT >= 16) {
                    o = new h(a, b);
                }
                else {
                    if (Build$VERSION.SDK_INT < 14) {
                        throw new UnsupportedOperationException();
                    }
                    o = new g(a, b);
                }
                this.b.put(b, (MenuItem)o);
            }
        }
        return (MenuItem)o;
    }
    
    final SubMenu a(SubMenu o) {
        if (o instanceof android.support.v4.b.a.c) {
            final android.support.v4.b.a.c c = (android.support.v4.b.a.c)o;
            if (this.c == null) {
                this.c = new a<android.support.v4.b.a.c, SubMenu>();
            }
            if ((o = this.c.get(c)) == null) {
                final Context a = this.a;
                if (Build$VERSION.SDK_INT < 14) {
                    throw new UnsupportedOperationException();
                }
                o = new n(a, c);
                this.c.put(c, (SubMenu)o);
            }
        }
        return (SubMenu)o;
    }
}
