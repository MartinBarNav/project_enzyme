package android.support.v4.view;

import android.database.DataSetObservable;
import android.database.DataSetObserver;
import android.view.View;
import android.view.ViewGroup;

public abstract class p {
    private DataSetObservable a = new DataSetObservable();

    public abstract boolean a(View view, Object obj);

    public abstract int b();

    public void b(Object obj) {
    }

    public void a() {
    }

    public final void a(DataSetObserver dataSetObserver) {
        this.a.registerObserver(dataSetObserver);
    }

    public final void b(DataSetObserver dataSetObserver) {
        this.a.unregisterObserver(dataSetObserver);
    }

    public CharSequence b(int i) {
        return null;
    }

    public Object a(ViewGroup viewGroup, int i) {
        throw new UnsupportedOperationException("Required method instantiateItem was not overridden");
    }

    public void a(Object obj) {
        throw new UnsupportedOperationException("Required method destroyItem was not overridden");
    }
}
