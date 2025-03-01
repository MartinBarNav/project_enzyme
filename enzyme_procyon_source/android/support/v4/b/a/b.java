// 
// Decompiled by Procyon v0.5.36
// 

package android.support.v4.b.a;

import android.view.View;
import android.support.v4.view.k;
import android.support.v4.view.d;
import android.view.MenuItem;

public interface b extends MenuItem
{
    b a(final d p0);
    
    b a(final k.e p0);
    
    d a();
    
    boolean collapseActionView();
    
    boolean expandActionView();
    
    View getActionView();
    
    boolean isActionViewExpanded();
    
    MenuItem setActionView(final int p0);
    
    MenuItem setActionView(final View p0);
    
    void setShowAsAction(final int p0);
    
    MenuItem setShowAsActionFlags(final int p0);
}
