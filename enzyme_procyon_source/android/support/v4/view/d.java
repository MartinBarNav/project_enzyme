// 
// Decompiled by Procyon v0.5.36
// 

package android.support.v4.view;

import android.view.SubMenu;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;
import android.content.Context;

public abstract class d
{
    public a a;
    private final Context b;
    private b c;
    
    public d(final Context b) {
        this.b = b;
    }
    
    public abstract View a();
    
    public View a(final MenuItem menuItem) {
        return this.a();
    }
    
    public void a(final b c) {
        if (this.c != null && c != null) {
            Log.w("ActionProvider(support)", "setVisibilityListener: Setting a new ActionProvider.VisibilityListener when one is already set. Are you reusing this " + this.getClass().getSimpleName() + " instance while it is still in use somewhere else?");
        }
        this.c = c;
    }
    
    public void a(final SubMenu subMenu) {
    }
    
    public boolean b() {
        return false;
    }
    
    public boolean c() {
        return true;
    }
    
    public boolean d() {
        return false;
    }
    
    public boolean e() {
        return false;
    }
    
    public interface a
    {
    }
    
    public interface b
    {
        void a();
    }
}
