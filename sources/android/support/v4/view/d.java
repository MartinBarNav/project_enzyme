package android.support.v4.view;

import android.content.Context;
import android.util.Log;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;

public abstract class d {
    public a a;
    private final Context b;
    private b c;

    public interface a {
    }

    public interface b {
        void a();
    }

    public abstract View a();

    public d(Context context) {
        this.b = context;
    }

    public View a(MenuItem menuItem) {
        return a();
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

    public void a(SubMenu subMenu) {
    }

    public void a(b bVar) {
        if (!(this.c == null || bVar == null)) {
            Log.w("ActionProvider(support)", "setVisibilityListener: Setting a new ActionProvider.VisibilityListener when one is already set. Are you reusing this " + getClass().getSimpleName() + " instance while it is still in use somewhere else?");
        }
        this.c = bVar;
    }
}
