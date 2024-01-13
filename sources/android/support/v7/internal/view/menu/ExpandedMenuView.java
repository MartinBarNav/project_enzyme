package android.support.v7.internal.view.menu;

import android.content.Context;
import android.support.v7.internal.view.menu.e;
import android.support.v7.internal.widget.q;
import android.util.AttributeSet;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

public final class ExpandedMenuView extends ListView implements e.b, k, AdapterView.OnItemClickListener {
    private static final int[] a = {16842964, 16843049};
    private e b;
    private int c;

    public ExpandedMenuView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 16842868);
    }

    public ExpandedMenuView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet);
        setOnItemClickListener(this);
        q a2 = q.a(context, attributeSet, a, i);
        if (a2.c(0)) {
            setBackgroundDrawable(a2.a(0));
        }
        if (a2.c(1)) {
            setDivider(a2.a(1));
        }
        a2.a.recycle();
    }

    public final void a(e eVar) {
        this.b = eVar;
    }

    /* access modifiers changed from: protected */
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        setChildrenDrawingCacheEnabled(false);
    }

    public final boolean a(f fVar) {
        return this.b.a((MenuItem) fVar, 0);
    }

    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        a((f) getAdapter().getItem(i));
    }

    public final int getWindowAnimations() {
        return this.c;
    }
}
