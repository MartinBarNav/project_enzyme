/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.widget.ListView
 */
package android.support.v4.f;

import android.support.v4.f.a;
import android.view.View;
import android.widget.ListView;

public final class f
extends a {
    private final ListView a;

    public f(ListView listView) {
        super((View)listView);
        this.a = listView;
    }

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public final void a(int n2) {
        ListView listView = this.a;
        int n3 = listView.getFirstVisiblePosition();
        if (n3 == -1) {
            return;
        }
        View view = listView.getChildAt(0);
        if (view == null) return;
        listView.setSelectionFromTop(n3, view.getTop() - n2);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public final boolean b(int n2) {
        boolean bl;
        boolean bl2 = false;
        ListView listView = this.a;
        int n3 = listView.getCount();
        if (n3 == 0) {
            return bl2;
        }
        int n4 = listView.getChildCount();
        int n5 = listView.getFirstVisiblePosition();
        if (n2 > 0) {
            if (n5 + n4 < n3) return true;
            bl = bl2;
            if (listView.getChildAt(n4 - 1).getBottom() <= listView.getHeight()) return bl;
            return true;
        }
        bl = bl2;
        if (n2 >= 0) return bl;
        if (n5 > 0) return true;
        if (listView.getChildAt(0).getTop() < 0) return true;
        return bl2;
    }
}

