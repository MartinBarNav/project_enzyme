/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  android.view.MenuItem
 *  android.view.View
 */
package android.support.v4.view;

import android.view.MenuItem;
import android.view.View;

final class l {
    public static MenuItem a(MenuItem menuItem, View view) {
        return menuItem.setActionView(view);
    }

    public static void a(MenuItem menuItem, int n2) {
        menuItem.setShowAsAction(n2);
    }

    public static MenuItem b(MenuItem menuItem, int n2) {
        return menuItem.setActionView(n2);
    }
}

