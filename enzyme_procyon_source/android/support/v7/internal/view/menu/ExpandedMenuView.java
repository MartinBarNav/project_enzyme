// 
// Decompiled by Procyon v0.5.36
// 

package android.support.v7.internal.view.menu;

import android.view.View;
import android.widget.AdapterView;
import android.view.MenuItem;
import android.support.v7.internal.widget.q;
import android.util.AttributeSet;
import android.content.Context;
import android.widget.AdapterView$OnItemClickListener;
import android.widget.ListView;

public final class ExpandedMenuView extends ListView implements b, k, AdapterView$OnItemClickListener
{
    private static final int[] a;
    private e b;
    private int c;
    
    static {
        a = new int[] { 16842964, 16843049 };
    }
    
    public ExpandedMenuView(final Context context, final AttributeSet set) {
        this(context, set, 16842868);
    }
    
    public ExpandedMenuView(final Context context, final AttributeSet set, final int n) {
        super(context, set);
        this.setOnItemClickListener((AdapterView$OnItemClickListener)this);
        final q a = android.support.v7.internal.widget.q.a(context, set, ExpandedMenuView.a, n);
        if (a.c(0)) {
            this.setBackgroundDrawable(a.a(0));
        }
        if (a.c(1)) {
            this.setDivider(a.a(1));
        }
        a.a.recycle();
    }
    
    public final void a(final e b) {
        this.b = b;
    }
    
    public final boolean a(final f f) {
        return this.b.a((MenuItem)f, 0);
    }
    
    public final int getWindowAnimations() {
        return this.c;
    }
    
    protected final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.setChildrenDrawingCacheEnabled(false);
    }
    
    public final void onItemClick(final AdapterView adapterView, final View view, final int n, final long n2) {
        this.a((f)this.getAdapter().getItem(n));
    }
}
