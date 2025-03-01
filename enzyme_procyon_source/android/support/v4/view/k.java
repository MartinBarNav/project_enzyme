// 
// Decompiled by Procyon v0.5.36
// 

package android.support.v4.view;

import android.view.View;
import android.util.Log;
import android.support.v4.b.a.b;
import android.view.MenuItem;
import android.os.Build$VERSION;

public final class k
{
    static final d a;
    
    static {
        final int sdk_INT = Build$VERSION.SDK_INT;
        if (sdk_INT >= 14) {
            a = (d)new c();
        }
        else if (sdk_INT >= 11) {
            a = (d)new b();
        }
        else {
            a = (d)new a();
        }
    }
    
    public static MenuItem a(MenuItem a, final android.support.v4.view.d d) {
        if (a instanceof android.support.v4.b.a.b) {
            a = (MenuItem)((android.support.v4.b.a.b)a).a(d);
        }
        else {
            Log.w("MenuItemCompat", "setActionProvider: item does not implement SupportMenuItem; ignoring");
        }
        return a;
    }
    
    public static MenuItem a(MenuItem menuItem, final View actionView) {
        if (menuItem instanceof android.support.v4.b.a.b) {
            menuItem = ((android.support.v4.b.a.b)menuItem).setActionView(actionView);
        }
        else {
            menuItem = k.a.a(menuItem, actionView);
        }
        return menuItem;
    }
    
    public static void a(final MenuItem menuItem, final int showAsAction) {
        if (menuItem instanceof android.support.v4.b.a.b) {
            ((android.support.v4.b.a.b)menuItem).setShowAsAction(showAsAction);
        }
        else {
            k.a.a(menuItem, showAsAction);
        }
    }
    
    public static boolean a(final MenuItem menuItem) {
        boolean b;
        if (menuItem instanceof android.support.v4.b.a.b) {
            b = ((android.support.v4.b.a.b)menuItem).expandActionView();
        }
        else {
            b = k.a.a(menuItem);
        }
        return b;
    }
    
    public static MenuItem b(MenuItem menuItem, final int actionView) {
        if (menuItem instanceof android.support.v4.b.a.b) {
            menuItem = ((android.support.v4.b.a.b)menuItem).setActionView(actionView);
        }
        else {
            menuItem = k.a.b(menuItem, actionView);
        }
        return menuItem;
    }
    
    static final class a implements d
    {
        @Override
        public final MenuItem a(final MenuItem menuItem, final View view) {
            return menuItem;
        }
        
        @Override
        public final void a(final MenuItem menuItem, final int n) {
        }
        
        @Override
        public final boolean a(final MenuItem menuItem) {
            return false;
        }
        
        @Override
        public final MenuItem b(final MenuItem menuItem, final int n) {
            return menuItem;
        }
    }
    
    static class b implements d
    {
        @Override
        public final MenuItem a(final MenuItem menuItem, final View view) {
            return l.a(menuItem, view);
        }
        
        @Override
        public final void a(final MenuItem menuItem, final int n) {
            l.a(menuItem, n);
        }
        
        @Override
        public boolean a(final MenuItem menuItem) {
            return false;
        }
        
        @Override
        public final MenuItem b(final MenuItem menuItem, final int n) {
            return l.b(menuItem, n);
        }
    }
    
    static final class c extends b
    {
        @Override
        public final boolean a(final MenuItem menuItem) {
            return m.a(menuItem);
        }
    }
    
    interface d
    {
        MenuItem a(final MenuItem p0, final View p1);
        
        void a(final MenuItem p0, final int p1);
        
        boolean a(final MenuItem p0);
        
        MenuItem b(final MenuItem p0, final int p1);
    }
    
    public interface e
    {
        boolean a(final MenuItem p0);
        
        boolean b(final MenuItem p0);
    }
}
