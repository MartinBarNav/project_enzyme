package android.support.v7.internal.view.menu;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.support.v4.view.k;
import android.view.ActionProvider;
import android.view.CollapsibleActionView;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.widget.FrameLayout;
import java.lang.reflect.Method;

@TargetApi(14)
public class g extends c<android.support.v4.b.a.b> implements MenuItem {
    public Method e;

    g(Context context, android.support.v4.b.a.b bVar) {
        super(context, bVar);
    }

    public int getItemId() {
        return ((android.support.v4.b.a.b) this.d).getItemId();
    }

    public int getGroupId() {
        return ((android.support.v4.b.a.b) this.d).getGroupId();
    }

    public int getOrder() {
        return ((android.support.v4.b.a.b) this.d).getOrder();
    }

    public MenuItem setTitle(CharSequence charSequence) {
        ((android.support.v4.b.a.b) this.d).setTitle(charSequence);
        return this;
    }

    public MenuItem setTitle(int i) {
        ((android.support.v4.b.a.b) this.d).setTitle(i);
        return this;
    }

    public CharSequence getTitle() {
        return ((android.support.v4.b.a.b) this.d).getTitle();
    }

    public MenuItem setTitleCondensed(CharSequence charSequence) {
        ((android.support.v4.b.a.b) this.d).setTitleCondensed(charSequence);
        return this;
    }

    public CharSequence getTitleCondensed() {
        return ((android.support.v4.b.a.b) this.d).getTitleCondensed();
    }

    public MenuItem setIcon(Drawable drawable) {
        ((android.support.v4.b.a.b) this.d).setIcon(drawable);
        return this;
    }

    public MenuItem setIcon(int i) {
        ((android.support.v4.b.a.b) this.d).setIcon(i);
        return this;
    }

    public Drawable getIcon() {
        return ((android.support.v4.b.a.b) this.d).getIcon();
    }

    public MenuItem setIntent(Intent intent) {
        ((android.support.v4.b.a.b) this.d).setIntent(intent);
        return this;
    }

    public Intent getIntent() {
        return ((android.support.v4.b.a.b) this.d).getIntent();
    }

    public MenuItem setShortcut(char c2, char c3) {
        ((android.support.v4.b.a.b) this.d).setShortcut(c2, c3);
        return this;
    }

    public MenuItem setNumericShortcut(char c2) {
        ((android.support.v4.b.a.b) this.d).setNumericShortcut(c2);
        return this;
    }

    public char getNumericShortcut() {
        return ((android.support.v4.b.a.b) this.d).getNumericShortcut();
    }

    public MenuItem setAlphabeticShortcut(char c2) {
        ((android.support.v4.b.a.b) this.d).setAlphabeticShortcut(c2);
        return this;
    }

    public char getAlphabeticShortcut() {
        return ((android.support.v4.b.a.b) this.d).getAlphabeticShortcut();
    }

    public MenuItem setCheckable(boolean z) {
        ((android.support.v4.b.a.b) this.d).setCheckable(z);
        return this;
    }

    public boolean isCheckable() {
        return ((android.support.v4.b.a.b) this.d).isCheckable();
    }

    public MenuItem setChecked(boolean z) {
        ((android.support.v4.b.a.b) this.d).setChecked(z);
        return this;
    }

    public boolean isChecked() {
        return ((android.support.v4.b.a.b) this.d).isChecked();
    }

    public MenuItem setVisible(boolean z) {
        return ((android.support.v4.b.a.b) this.d).setVisible(z);
    }

    public boolean isVisible() {
        return ((android.support.v4.b.a.b) this.d).isVisible();
    }

    public MenuItem setEnabled(boolean z) {
        ((android.support.v4.b.a.b) this.d).setEnabled(z);
        return this;
    }

    public boolean isEnabled() {
        return ((android.support.v4.b.a.b) this.d).isEnabled();
    }

    public boolean hasSubMenu() {
        return ((android.support.v4.b.a.b) this.d).hasSubMenu();
    }

    public SubMenu getSubMenu() {
        return a(((android.support.v4.b.a.b) this.d).getSubMenu());
    }

    public MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        ((android.support.v4.b.a.b) this.d).setOnMenuItemClickListener(onMenuItemClickListener != null ? new d(onMenuItemClickListener) : null);
        return this;
    }

    public ContextMenu.ContextMenuInfo getMenuInfo() {
        return ((android.support.v4.b.a.b) this.d).getMenuInfo();
    }

    public void setShowAsAction(int i) {
        ((android.support.v4.b.a.b) this.d).setShowAsAction(i);
    }

    public MenuItem setShowAsActionFlags(int i) {
        ((android.support.v4.b.a.b) this.d).setShowAsActionFlags(i);
        return this;
    }

    public MenuItem setActionView(View view) {
        if (view instanceof CollapsibleActionView) {
            view = new b(view);
        }
        ((android.support.v4.b.a.b) this.d).setActionView(view);
        return this;
    }

    public MenuItem setActionView(int i) {
        ((android.support.v4.b.a.b) this.d).setActionView(i);
        View actionView = ((android.support.v4.b.a.b) this.d).getActionView();
        if (actionView instanceof CollapsibleActionView) {
            ((android.support.v4.b.a.b) this.d).setActionView((View) new b(actionView));
        }
        return this;
    }

    public View getActionView() {
        View actionView = ((android.support.v4.b.a.b) this.d).getActionView();
        return actionView instanceof b ? (View) ((b) actionView).a : actionView;
    }

    public MenuItem setActionProvider(ActionProvider actionProvider) {
        ((android.support.v4.b.a.b) this.d).a((android.support.v4.view.d) actionProvider != null ? a(actionProvider) : null);
        return this;
    }

    public ActionProvider getActionProvider() {
        android.support.v4.view.d a2 = ((android.support.v4.b.a.b) this.d).a();
        if (a2 instanceof a) {
            return ((a) a2).b;
        }
        return null;
    }

    public boolean expandActionView() {
        return ((android.support.v4.b.a.b) this.d).expandActionView();
    }

    public boolean collapseActionView() {
        return ((android.support.v4.b.a.b) this.d).collapseActionView();
    }

    public boolean isActionViewExpanded() {
        return ((android.support.v4.b.a.b) this.d).isActionViewExpanded();
    }

    public MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        ((android.support.v4.b.a.b) this.d).a((k.e) onActionExpandListener != null ? new c(onActionExpandListener) : null);
        return this;
    }

    /* access modifiers changed from: package-private */
    public a a(ActionProvider actionProvider) {
        return new a(this.a, actionProvider);
    }

    private class d extends d<MenuItem.OnMenuItemClickListener> implements MenuItem.OnMenuItemClickListener {
        d(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
            super(onMenuItemClickListener);
        }

        public final boolean onMenuItemClick(MenuItem menuItem) {
            return ((MenuItem.OnMenuItemClickListener) this.d).onMenuItemClick(g.this.a(menuItem));
        }
    }

    private class c extends d<MenuItem.OnActionExpandListener> implements k.e {
        c(MenuItem.OnActionExpandListener onActionExpandListener) {
            super(onActionExpandListener);
        }

        public final boolean a(MenuItem menuItem) {
            return ((MenuItem.OnActionExpandListener) this.d).onMenuItemActionExpand(g.this.a(menuItem));
        }

        public final boolean b(MenuItem menuItem) {
            return ((MenuItem.OnActionExpandListener) this.d).onMenuItemActionCollapse(g.this.a(menuItem));
        }
    }

    class a extends android.support.v4.view.d {
        final ActionProvider b;

        public a(Context context, ActionProvider actionProvider) {
            super(context);
            this.b = actionProvider;
        }

        public final View a() {
            return this.b.onCreateActionView();
        }

        public final boolean d() {
            return this.b.onPerformDefaultAction();
        }

        public final boolean e() {
            return this.b.hasSubMenu();
        }

        public final void a(SubMenu subMenu) {
            this.b.onPrepareSubMenu(g.this.a(subMenu));
        }
    }

    static class b extends FrameLayout implements android.support.v7.c.a {
        final CollapsibleActionView a;

        b(View view) {
            super(view.getContext());
            this.a = (CollapsibleActionView) view;
            addView(view);
        }

        public final void a() {
            this.a.onActionViewExpanded();
        }

        public final void a_() {
            this.a.onActionViewCollapsed();
        }
    }
}
