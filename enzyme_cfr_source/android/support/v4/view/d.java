/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.util.Log
 *  android.view.MenuItem
 *  android.view.SubMenu
 *  android.view.View
 */
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

    public d(Context context) {
        this.b = context;
    }

    public abstract View a();

    public View a(MenuItem menuItem) {
        return this.a();
    }

    public void a(b b2) {
        if (this.c != null && b2 != null) {
            Log.w((String)"ActionProvider(support)", (String)("setVisibilityListener: Setting a new ActionProvider.VisibilityListener when one is already set. Are you reusing this " + this.getClass().getSimpleName() + " instance while it is still in use somewhere else?"));
        }
        this.c = b2;
    }

    public void a(SubMenu subMenu) {
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

    public static interface a {
    }

    public static interface b {
        public void a();
    }
}

