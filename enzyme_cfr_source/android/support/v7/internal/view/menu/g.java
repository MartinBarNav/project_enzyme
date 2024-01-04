/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  android.annotation.TargetApi
 *  android.content.Context
 *  android.content.Intent
 *  android.graphics.drawable.Drawable
 *  android.view.ActionProvider
 *  android.view.CollapsibleActionView
 *  android.view.ContextMenu$ContextMenuInfo
 *  android.view.MenuItem
 *  android.view.MenuItem$OnActionExpandListener
 *  android.view.MenuItem$OnMenuItemClickListener
 *  android.view.SubMenu
 *  android.view.View
 *  android.widget.FrameLayout
 */
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

@TargetApi(value=14)
public class g
extends android.support.v7.internal.view.menu.c<android.support.v4.b.a.b>
implements MenuItem {
    public Method e;

    g(Context context, android.support.v4.b.a.b b2) {
        super(context, b2);
    }

    a a(ActionProvider actionProvider) {
        return new a(this.a, actionProvider);
    }

    public boolean collapseActionView() {
        return ((android.support.v4.b.a.b)this.d).collapseActionView();
    }

    public boolean expandActionView() {
        return ((android.support.v4.b.a.b)this.d).expandActionView();
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public ActionProvider getActionProvider() {
        android.support.v4.view.d d2 = ((android.support.v4.b.a.b)this.d).a();
        if (!(d2 instanceof a)) return null;
        return ((a)d2).b;
    }

    public View getActionView() {
        View view;
        View view2 = view = ((android.support.v4.b.a.b)this.d).getActionView();
        if (view instanceof b) {
            view2 = (View)((b)view).a;
        }
        return view2;
    }

    public char getAlphabeticShortcut() {
        return ((android.support.v4.b.a.b)this.d).getAlphabeticShortcut();
    }

    public int getGroupId() {
        return ((android.support.v4.b.a.b)this.d).getGroupId();
    }

    public Drawable getIcon() {
        return ((android.support.v4.b.a.b)this.d).getIcon();
    }

    public Intent getIntent() {
        return ((android.support.v4.b.a.b)this.d).getIntent();
    }

    public int getItemId() {
        return ((android.support.v4.b.a.b)this.d).getItemId();
    }

    public ContextMenu.ContextMenuInfo getMenuInfo() {
        return ((android.support.v4.b.a.b)this.d).getMenuInfo();
    }

    public char getNumericShortcut() {
        return ((android.support.v4.b.a.b)this.d).getNumericShortcut();
    }

    public int getOrder() {
        return ((android.support.v4.b.a.b)this.d).getOrder();
    }

    public SubMenu getSubMenu() {
        return this.a(((android.support.v4.b.a.b)this.d).getSubMenu());
    }

    public CharSequence getTitle() {
        return ((android.support.v4.b.a.b)this.d).getTitle();
    }

    public CharSequence getTitleCondensed() {
        return ((android.support.v4.b.a.b)this.d).getTitleCondensed();
    }

    public boolean hasSubMenu() {
        return ((android.support.v4.b.a.b)this.d).hasSubMenu();
    }

    public boolean isActionViewExpanded() {
        return ((android.support.v4.b.a.b)this.d).isActionViewExpanded();
    }

    public boolean isCheckable() {
        return ((android.support.v4.b.a.b)this.d).isCheckable();
    }

    public boolean isChecked() {
        return ((android.support.v4.b.a.b)this.d).isChecked();
    }

    public boolean isEnabled() {
        return ((android.support.v4.b.a.b)this.d).isEnabled();
    }

    public boolean isVisible() {
        return ((android.support.v4.b.a.b)this.d).isVisible();
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     */
    public MenuItem setActionProvider(ActionProvider object) {
        void var1_3;
        android.support.v4.b.a.b b2 = (android.support.v4.b.a.b)this.d;
        if (object != null) {
            a a2 = this.a((ActionProvider)object);
        } else {
            Object var1_4 = null;
        }
        b2.a((android.support.v4.view.d)var1_3);
        return this;
    }

    public MenuItem setActionView(int n2) {
        ((android.support.v4.b.a.b)this.d).setActionView(n2);
        View view = ((android.support.v4.b.a.b)this.d).getActionView();
        if (view instanceof CollapsibleActionView) {
            ((android.support.v4.b.a.b)this.d).setActionView((View)new b(view));
        }
        return this;
    }

    public MenuItem setActionView(View view) {
        Object object = view;
        if (view instanceof CollapsibleActionView) {
            object = new b(view);
        }
        ((android.support.v4.b.a.b)this.d).setActionView((View)object);
        return this;
    }

    public MenuItem setAlphabeticShortcut(char c2) {
        ((android.support.v4.b.a.b)this.d).setAlphabeticShortcut(c2);
        return this;
    }

    public MenuItem setCheckable(boolean bl) {
        ((android.support.v4.b.a.b)this.d).setCheckable(bl);
        return this;
    }

    public MenuItem setChecked(boolean bl) {
        ((android.support.v4.b.a.b)this.d).setChecked(bl);
        return this;
    }

    public MenuItem setEnabled(boolean bl) {
        ((android.support.v4.b.a.b)this.d).setEnabled(bl);
        return this;
    }

    public MenuItem setIcon(int n2) {
        ((android.support.v4.b.a.b)this.d).setIcon(n2);
        return this;
    }

    public MenuItem setIcon(Drawable drawable) {
        ((android.support.v4.b.a.b)this.d).setIcon(drawable);
        return this;
    }

    public MenuItem setIntent(Intent intent) {
        ((android.support.v4.b.a.b)this.d).setIntent(intent);
        return this;
    }

    public MenuItem setNumericShortcut(char c2) {
        ((android.support.v4.b.a.b)this.d).setNumericShortcut(c2);
        return this;
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     */
    public MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener object) {
        void var1_3;
        android.support.v4.b.a.b b2 = (android.support.v4.b.a.b)this.d;
        if (object != null) {
            c c2 = new c((MenuItem.OnActionExpandListener)object);
        } else {
            Object var1_4 = null;
        }
        b2.a((k.e)var1_3);
        return this;
    }

    /*
     * Enabled aggressive block sorting
     */
    public MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        android.support.v4.b.a.b b2 = (android.support.v4.b.a.b)this.d;
        onMenuItemClickListener = onMenuItemClickListener != null ? new d(onMenuItemClickListener) : null;
        b2.setOnMenuItemClickListener(onMenuItemClickListener);
        return this;
    }

    public MenuItem setShortcut(char c2, char c3) {
        ((android.support.v4.b.a.b)this.d).setShortcut(c2, c3);
        return this;
    }

    public void setShowAsAction(int n2) {
        ((android.support.v4.b.a.b)this.d).setShowAsAction(n2);
    }

    public MenuItem setShowAsActionFlags(int n2) {
        ((android.support.v4.b.a.b)this.d).setShowAsActionFlags(n2);
        return this;
    }

    public MenuItem setTitle(int n2) {
        ((android.support.v4.b.a.b)this.d).setTitle(n2);
        return this;
    }

    public MenuItem setTitle(CharSequence charSequence) {
        ((android.support.v4.b.a.b)this.d).setTitle(charSequence);
        return this;
    }

    public MenuItem setTitleCondensed(CharSequence charSequence) {
        ((android.support.v4.b.a.b)this.d).setTitleCondensed(charSequence);
        return this;
    }

    public MenuItem setVisible(boolean bl) {
        return ((android.support.v4.b.a.b)this.d).setVisible(bl);
    }

    class a
    extends android.support.v4.view.d {
        final ActionProvider b;

        public a(Context context, ActionProvider actionProvider) {
            super(context);
            this.b = actionProvider;
        }

        @Override
        public final View a() {
            return this.b.onCreateActionView();
        }

        @Override
        public final void a(SubMenu subMenu) {
            this.b.onPrepareSubMenu(g.this.a(subMenu));
        }

        @Override
        public final boolean d() {
            return this.b.onPerformDefaultAction();
        }

        @Override
        public final boolean e() {
            return this.b.hasSubMenu();
        }
    }

    static final class b
    extends FrameLayout
    implements android.support.v7.c.a {
        final CollapsibleActionView a;

        b(View view) {
            super(view.getContext());
            this.a = (CollapsibleActionView)view;
            this.addView(view);
        }

        @Override
        public final void a() {
            this.a.onActionViewExpanded();
        }

        @Override
        public final void a_() {
            this.a.onActionViewCollapsed();
        }
    }

    private final class c
    extends android.support.v7.internal.view.menu.d<MenuItem.OnActionExpandListener>
    implements k.e {
        c(MenuItem.OnActionExpandListener onActionExpandListener) {
            super(onActionExpandListener);
        }

        @Override
        public final boolean a(MenuItem menuItem) {
            return ((MenuItem.OnActionExpandListener)this.d).onMenuItemActionExpand(g.this.a(menuItem));
        }

        @Override
        public final boolean b(MenuItem menuItem) {
            return ((MenuItem.OnActionExpandListener)this.d).onMenuItemActionCollapse(g.this.a(menuItem));
        }
    }

    private final class d
    extends android.support.v7.internal.view.menu.d<MenuItem.OnMenuItemClickListener>
    implements MenuItem.OnMenuItemClickListener {
        d(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
            super(onMenuItemClickListener);
        }

        public final boolean onMenuItemClick(MenuItem menuItem) {
            return ((MenuItem.OnMenuItemClickListener)this.d).onMenuItemClick(g.this.a(menuItem));
        }
    }
}

