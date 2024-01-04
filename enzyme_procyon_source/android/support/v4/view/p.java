// 
// Decompiled by Procyon v0.5.36
// 

package android.support.v4.view;

import android.view.View;
import android.database.DataSetObserver;
import android.view.ViewGroup;
import android.database.DataSetObservable;

public abstract class p
{
    private DataSetObservable a;
    
    public p() {
        this.a = new DataSetObservable();
    }
    
    public Object a(final ViewGroup viewGroup, final int n) {
        throw new UnsupportedOperationException("Required method instantiateItem was not overridden");
    }
    
    public void a() {
    }
    
    public final void a(final DataSetObserver dataSetObserver) {
        this.a.registerObserver((Object)dataSetObserver);
    }
    
    public void a(final Object o) {
        throw new UnsupportedOperationException("Required method destroyItem was not overridden");
    }
    
    public abstract boolean a(final View p0, final Object p1);
    
    public abstract int b();
    
    public CharSequence b(final int n) {
        return null;
    }
    
    public final void b(final DataSetObserver dataSetObserver) {
        this.a.unregisterObserver((Object)dataSetObserver);
    }
    
    public void b(final Object o) {
    }
}
