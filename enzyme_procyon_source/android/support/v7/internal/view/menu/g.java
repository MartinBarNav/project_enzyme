// 
// Decompiled by Procyon v0.5.36
// 

package android.support.v7.internal.view.menu;

import android.support.v7.c.a;
import android.widget.FrameLayout;
import android.view.MenuItem$OnMenuItemClickListener;
import android.support.v4.view.k;
import android.view.MenuItem$OnActionExpandListener;
import android.view.CollapsibleActionView;
import android.view.SubMenu;
import android.view.ContextMenu$ContextMenuInfo;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.support.v4.view.d;
import android.view.ActionProvider;
import android.content.Context;
import java.lang.reflect.Method;
import android.annotation.TargetApi;
import android.view.MenuItem;
import android.support.v4.b.a.b;

@TargetApi(14)
public class g extends android.support.v7.internal.view.menu.c<android.support.v4.b.a.b> implements MenuItem
{
    public Method e;
    
    g(final Context context, final android.support.v4.b.a.b b) {
        super(context, b);
    }
    
    a a(final ActionProvider actionProvider) {
        return new a(this.a, actionProvider);
    }
    
    public boolean collapseActionView() {
        return ((android.support.v4.b.a.b)this.d).collapseActionView();
    }
    
    public boolean expandActionView() {
        return ((android.support.v4.b.a.b)this.d).expandActionView();
    }
    
    public ActionProvider getActionProvider() {
        final android.support.v4.view.d a = ((android.support.v4.b.a.b)this.d).a();
        ActionProvider b;
        if (a instanceof a) {
            b = ((a)a).b;
        }
        else {
            b = null;
        }
        return b;
    }
    
    public View getActionView() {
        View actionView;
        final View view = actionView = ((android.support.v4.b.a.b)this.d).getActionView();
        if (view instanceof b) {
            actionView = (View)((b)view).a;
        }
        return actionView;
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
    
    public ContextMenu$ContextMenuInfo getMenuInfo() {
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
    
    public MenuItem setActionProvider(final ActionProvider actionProvider) {
        final android.support.v4.b.a.b b = (android.support.v4.b.a.b)this.d;
        a a;
        if (actionProvider != null) {
            a = this.a(actionProvider);
        }
        else {
            a = null;
        }
        b.a(a);
        return (MenuItem)this;
    }
    
    public MenuItem setActionView(final int actionView) {
        ((android.support.v4.b.a.b)this.d).setActionView(actionView);
        final View actionView2 = ((android.support.v4.b.a.b)this.d).getActionView();
        if (actionView2 instanceof CollapsibleActionView) {
            ((android.support.v4.b.a.b)this.d).setActionView((View)new b(actionView2));
        }
        return (MenuItem)this;
    }
    
    public MenuItem setActionView(final View view) {
        Object actionView = view;
        if (view instanceof CollapsibleActionView) {
            actionView = new b(view);
        }
        ((android.support.v4.b.a.b)this.d).setActionView((View)actionView);
        return (MenuItem)this;
    }
    
    public MenuItem setAlphabeticShortcut(final char alphabeticShortcut) {
        ((android.support.v4.b.a.b)this.d).setAlphabeticShortcut(alphabeticShortcut);
        return (MenuItem)this;
    }
    
    public MenuItem setCheckable(final boolean checkable) {
        ((android.support.v4.b.a.b)this.d).setCheckable(checkable);
        return (MenuItem)this;
    }
    
    public MenuItem setChecked(final boolean checked) {
        ((android.support.v4.b.a.b)this.d).setChecked(checked);
        return (MenuItem)this;
    }
    
    public MenuItem setEnabled(final boolean enabled) {
        ((android.support.v4.b.a.b)this.d).setEnabled(enabled);
        return (MenuItem)this;
    }
    
    public MenuItem setIcon(final int icon) {
        ((android.support.v4.b.a.b)this.d).setIcon(icon);
        return (MenuItem)this;
    }
    
    public MenuItem setIcon(final Drawable icon) {
        ((android.support.v4.b.a.b)this.d).setIcon(icon);
        return (MenuItem)this;
    }
    
    public MenuItem setIntent(final Intent intent) {
        ((android.support.v4.b.a.b)this.d).setIntent(intent);
        return (MenuItem)this;
    }
    
    public MenuItem setNumericShortcut(final char numericShortcut) {
        ((android.support.v4.b.a.b)this.d).setNumericShortcut(numericShortcut);
        return (MenuItem)this;
    }
    
    public MenuItem setOnActionExpandListener(final MenuItem$OnActionExpandListener menuItem$OnActionExpandListener) {
        final android.support.v4.b.a.b b = (android.support.v4.b.a.b)this.d;
        c c;
        if (menuItem$OnActionExpandListener != null) {
            c = new c(menuItem$OnActionExpandListener);
        }
        else {
            c = null;
        }
        b.a(c);
        return (MenuItem)this;
    }
    
    public MenuItem setOnMenuItemClickListener(final MenuItem$OnMenuItemClickListener menuItem$OnMenuItemClickListener) {
        final android.support.v4.b.a.b b = (android.support.v4.b.a.b)this.d;
        Object onMenuItemClickListener;
        if (menuItem$OnMenuItemClickListener != null) {
            onMenuItemClickListener = new d(menuItem$OnMenuItemClickListener);
        }
        else {
            onMenuItemClickListener = null;
        }
        b.setOnMenuItemClickListener((MenuItem$OnMenuItemClickListener)onMenuItemClickListener);
        return (MenuItem)this;
    }
    
    public MenuItem setShortcut(final char c, final char c2) {
        ((android.support.v4.b.a.b)this.d).setShortcut(c, c2);
        return (MenuItem)this;
    }
    
    public void setShowAsAction(final int showAsAction) {
        ((android.support.v4.b.a.b)this.d).setShowAsAction(showAsAction);
    }
    
    public MenuItem setShowAsActionFlags(final int showAsActionFlags) {
        ((android.support.v4.b.a.b)this.d).setShowAsActionFlags(showAsActionFlags);
        return (MenuItem)this;
    }
    
    public MenuItem setTitle(final int title) {
        ((android.support.v4.b.a.b)this.d).setTitle(title);
        return (MenuItem)this;
    }
    
    public MenuItem setTitle(final CharSequence title) {
        ((android.support.v4.b.a.b)this.d).setTitle(title);
        return (MenuItem)this;
    }
    
    public MenuItem setTitleCondensed(final CharSequence titleCondensed) {
        ((android.support.v4.b.a.b)this.d).setTitleCondensed(titleCondensed);
        return (MenuItem)this;
    }
    
    public MenuItem setVisible(final boolean visible) {
        return ((android.support.v4.b.a.b)this.d).setVisible(visible);
    }
    
    class a extends d
    {
        final ActionProvider b;
        
        public a(final Context context, final ActionProvider b) {
            super(context);
            this.b = b;
        }
        
        @Override
        public final View a() {
            return this.b.onCreateActionView();
        }
        
        @Override
        public final void a(final SubMenu subMenu) {
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
    
    static final class b extends FrameLayout implements a
    {
        final CollapsibleActionView a;
        
        b(final View view) {
            super(view.getContext());
            this.a = (CollapsibleActionView)view;
            this.addView(view);
        }
        
        public final void a() {
            this.a.onActionViewExpanded();
        }
        
        public final void a_() {
            this.a.onActionViewCollapsed();
        }
    }
    
    private final class c extends d<MenuItem$OnActionExpandListener> implements e
    {
        c(final MenuItem$OnActionExpandListener menuItem$OnActionExpandListener) {
            super(menuItem$OnActionExpandListener);
        }
        
        @Override
        public final boolean a(final MenuItem menuItem) {
            return ((MenuItem$OnActionExpandListener)this.d).onMenuItemActionExpand(g.this.a(menuItem));
        }
        
        @Override
        public final boolean b(final MenuItem menuItem) {
            return ((MenuItem$OnActionExpandListener)this.d).onMenuItemActionCollapse(g.this.a(menuItem));
        }
    }
    
    private final class d extends android.support.v7.internal.view.menu.d<MenuItem$OnMenuItemClickListener> implements MenuItem$OnMenuItemClickListener
    {
        d(final MenuItem$OnMenuItemClickListener menuItem$OnMenuItemClickListener) {
            super(menuItem$OnMenuItemClickListener);
        }
        
        public final boolean onMenuItemClick(final MenuItem menuItem) {
            return ((MenuItem$OnMenuItemClickListener)this.d).onMenuItemClick(g.this.a(menuItem));
        }
    }
}
