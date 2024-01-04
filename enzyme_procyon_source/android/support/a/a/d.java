// 
// Decompiled by Procyon v0.5.36
// 

package android.support.a.a;

import android.view.View;
import android.view.ViewGroup;
import android.app.Fragment;
import android.app.FragmentTransaction;
import android.app.FragmentManager;
import android.support.v4.view.p;

public abstract class d extends p
{
    private final FragmentManager a;
    private FragmentTransaction b;
    private Fragment c;
    
    public d(final FragmentManager a) {
        this.b = null;
        this.c = null;
        this.a = a;
    }
    
    private static String a(final int i, final long lng) {
        return "android:switcher:" + i + ":" + lng;
    }
    
    public abstract Fragment a(final int p0);
    
    @Override
    public final Object a(final ViewGroup viewGroup, final int n) {
        if (this.b == null) {
            this.b = this.a.beginTransaction();
        }
        final long n2 = n;
        final Fragment fragmentByTag = this.a.findFragmentByTag(a(viewGroup.getId(), n2));
        Fragment fragment;
        if (fragmentByTag != null) {
            this.b.attach(fragmentByTag);
            fragment = fragmentByTag;
        }
        else {
            final Fragment a = this.a(n);
            this.b.add(viewGroup.getId(), a, a(viewGroup.getId(), n2));
            fragment = a;
        }
        if (fragment != this.c) {
            android.support.a.a.a.a(fragment, false);
            android.support.a.a.a.b(fragment, false);
        }
        return fragment;
    }
    
    @Override
    public final void a() {
        if (this.b != null) {
            this.b.commitAllowingStateLoss();
            this.b = null;
            this.a.executePendingTransactions();
        }
    }
    
    @Override
    public final void a(final Object o) {
        if (this.b == null) {
            this.b = this.a.beginTransaction();
        }
        this.b.detach((Fragment)o);
    }
    
    @Override
    public final boolean a(final View view, final Object o) {
        return ((Fragment)o).getView() == view;
    }
    
    @Override
    public final void b(final Object o) {
        final Fragment c = (Fragment)o;
        if (c != this.c) {
            if (this.c != null) {
                android.support.a.a.a.a(this.c, false);
                android.support.a.a.a.b(this.c, false);
            }
            if (c != null) {
                android.support.a.a.a.a(c, true);
                android.support.a.a.a.b(c, true);
            }
            this.c = c;
        }
    }
}
