/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  android.database.DataSetObservable
 *  android.database.DataSetObserver
 *  android.view.View
 *  android.view.ViewGroup
 */
package android.support.v4.view;

import android.database.DataSetObservable;
import android.database.DataSetObserver;
import android.view.View;
import android.view.ViewGroup;

public abstract class p {
    private DataSetObservable a = new DataSetObservable();

    public Object a(ViewGroup viewGroup, int n2) {
        throw new UnsupportedOperationException("Required method instantiateItem was not overridden");
    }

    public void a() {
    }

    public final void a(DataSetObserver dataSetObserver) {
        this.a.registerObserver((Object)dataSetObserver);
    }

    public void a(Object object) {
        throw new UnsupportedOperationException("Required method destroyItem was not overridden");
    }

    public abstract boolean a(View var1, Object var2);

    public abstract int b();

    public CharSequence b(int n2) {
        return null;
    }

    public final void b(DataSetObserver dataSetObserver) {
        this.a.unregisterObserver((Object)dataSetObserver);
    }

    public void b(Object object) {
    }
}

