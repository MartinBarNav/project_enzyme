// 
// Decompiled by Procyon v0.5.36
// 

package android.support.v4.view;

import android.view.View;
import android.view.MenuItem;

final class l
{
    public static MenuItem a(final MenuItem menuItem, final View actionView) {
        return menuItem.setActionView(actionView);
    }
    
    public static void a(final MenuItem menuItem, final int showAsAction) {
        menuItem.setShowAsAction(showAsAction);
    }
    
    public static MenuItem b(final MenuItem menuItem, final int actionView) {
        return menuItem.setActionView(actionView);
    }
}
