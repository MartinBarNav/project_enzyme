/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  android.view.MenuItem
 *  android.view.View
 */
package android.support.v4.b.a;

import android.support.v4.view.d;
import android.support.v4.view.k;
import android.view.MenuItem;
import android.view.View;

public interface b
extends MenuItem {
    public b a(d var1);

    public b a(k.e var1);

    public d a();

    public boolean collapseActionView();

    public boolean expandActionView();

    public View getActionView();

    public boolean isActionViewExpanded();

    public MenuItem setActionView(int var1);

    public MenuItem setActionView(View var1);

    public void setShowAsAction(int var1);

    public MenuItem setShowAsActionFlags(int var1);
}

