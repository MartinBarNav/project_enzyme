package android.support.v7.internal.view.menu;

import android.annotation.TargetApi;
import android.content.Context;
import android.support.v4.b.a.b;
import android.support.v4.view.d;
import android.support.v7.internal.view.menu.g;
import android.view.ActionProvider;
import android.view.MenuItem;
import android.view.View;

@TargetApi(16)
final class h extends g {
    h(Context context, b bVar) {
        super(context, bVar);
    }

    /* access modifiers changed from: package-private */
    public final g.a a(ActionProvider actionProvider) {
        return new a(this.a, actionProvider);
    }

    class a extends g.a implements ActionProvider.VisibilityListener {
        d.b d;

        public a(Context context, ActionProvider actionProvider) {
            super(context, actionProvider);
        }

        public final View a(MenuItem menuItem) {
            return this.b.onCreateActionView(menuItem);
        }

        public final boolean b() {
            return this.b.overridesItemVisibility();
        }

        public final boolean c() {
            return this.b.isVisible();
        }

        public final void a(d.b bVar) {
            this.d = bVar;
            ActionProvider actionProvider = this.b;
            if (bVar == null) {
                this = null;
            }
            actionProvider.setVisibilityListener(this);
        }

        public final void onActionProviderVisibilityChanged(boolean z) {
            if (this.d != null) {
                this.d.a();
            }
        }
    }
}
