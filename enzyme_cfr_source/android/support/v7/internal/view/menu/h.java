/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  android.annotation.TargetApi
 *  android.content.Context
 *  android.view.ActionProvider
 *  android.view.ActionProvider$VisibilityListener
 *  android.view.MenuItem
 *  android.view.View
 */
package android.support.v7.internal.view.menu;

import android.annotation.TargetApi;
import android.content.Context;
import android.support.v4.b.a.b;
import android.support.v4.view.d;
import android.support.v7.internal.view.menu.g;
import android.view.ActionProvider;
import android.view.MenuItem;
import android.view.View;

@TargetApi(value=16)
final class h
extends g {
    h(Context context, b b2) {
        super(context, b2);
    }

    @Override
    final g.a a(ActionProvider actionProvider) {
        return new a(this.a, actionProvider);
    }

    final class a
    extends g.a
    implements ActionProvider.VisibilityListener {
        d.b d;

        public a(Context context, ActionProvider actionProvider) {
            super(context, actionProvider);
        }

        @Override
        public final View a(MenuItem menuItem) {
            return this.b.onCreateActionView(menuItem);
        }

        /*
         * Enabled aggressive block sorting
         */
        @Override
        public final void a(d.b object) {
            this.d = object;
            ActionProvider actionProvider = this.b;
            object = object != null ? this : null;
            actionProvider.setVisibilityListener((ActionProvider.VisibilityListener)object);
        }

        @Override
        public final boolean b() {
            return this.b.overridesItemVisibility();
        }

        @Override
        public final boolean c() {
            return this.b.isVisible();
        }

        public final void onActionProviderVisibilityChanged(boolean bl) {
            if (this.d != null) {
                this.d.a();
            }
        }
    }
}

