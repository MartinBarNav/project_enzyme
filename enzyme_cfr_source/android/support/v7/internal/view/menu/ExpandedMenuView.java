/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.util.AttributeSet
 *  android.view.View
 *  android.widget.AdapterView
 *  android.widget.AdapterView$OnItemClickListener
 *  android.widget.ListView
 */
package android.support.v7.internal.view.menu;

import android.content.Context;
import android.support.v7.internal.view.menu.e;
import android.support.v7.internal.view.menu.f;
import android.support.v7.internal.view.menu.k;
import android.support.v7.internal.widget.q;
import android.util.AttributeSet;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

public final class ExpandedMenuView
extends ListView
implements e.b,
k,
AdapterView.OnItemClickListener {
    private static final int[] a = new int[]{16842964, 16843049};
    private e b;
    private int c;

    public ExpandedMenuView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 16842868);
    }

    public ExpandedMenuView(Context object, AttributeSet attributeSet, int n2) {
        super((Context)object, attributeSet);
        this.setOnItemClickListener(this);
        object = q.a((Context)object, attributeSet, a, n2);
        if (((q)object).c(0)) {
            this.setBackgroundDrawable(((q)object).a(0));
        }
        if (((q)object).c(1)) {
            this.setDivider(((q)object).a(1));
        }
        ((q)object).a.recycle();
    }

    @Override
    public final void a(e e2) {
        this.b = e2;
    }

    @Override
    public final boolean a(f f2) {
        return this.b.a(f2, 0);
    }

    public final int getWindowAnimations() {
        return this.c;
    }

    protected final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.setChildrenDrawingCacheEnabled(false);
    }

    public final void onItemClick(AdapterView adapterView, View view, int n2, long l2) {
        this.a((f)this.getAdapter().getItem(n2));
    }
}

