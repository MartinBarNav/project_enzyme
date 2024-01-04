// 
// Decompiled by Procyon v0.5.36
// 

package android.support.v7.internal.view.menu;

import android.view.View;
import android.view.MenuItem;
import android.support.v4.view.d;
import android.view.ActionProvider$VisibilityListener;
import android.view.ActionProvider;
import android.support.v4.b.a.b;
import android.content.Context;
import android.annotation.TargetApi;

@TargetApi(16)
final class h extends g
{
    h(final Context context, final android.support.v4.b.a.b b) {
        super(context, b);
    }
    
    @Override
    final g.a a(final ActionProvider actionProvider) {
        return new a(this.a, actionProvider);
    }
    
    final class a extends g.a implements ActionProvider$VisibilityListener
    {
        b d;
        
        public a(final Context context, final ActionProvider actionProvider) {
            super(context, actionProvider);
        }
        
        public final View a(final MenuItem menuItem) {
            return this.b.onCreateActionView(menuItem);
        }
        
        public final void a(final b d) {
            this.d = d;
            final ActionProvider b = this.b;
            Object visibilityListener;
            if (d != null) {
                visibilityListener = this;
            }
            else {
                visibilityListener = null;
            }
            b.setVisibilityListener((ActionProvider$VisibilityListener)visibilityListener);
        }
        
        public final boolean b() {
            return this.b.overridesItemVisibility();
        }
        
        public final boolean c() {
            return this.b.isVisible();
        }
        
        public final void onActionProviderVisibilityChanged(final boolean b) {
            if (this.d != null) {
                this.d.a();
            }
        }
    }
}
