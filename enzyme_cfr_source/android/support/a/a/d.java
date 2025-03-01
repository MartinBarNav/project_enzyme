/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  android.app.Fragment
 *  android.app.FragmentManager
 *  android.app.FragmentTransaction
 *  android.view.View
 *  android.view.ViewGroup
 */
package android.support.a.a;

import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.support.a.a.a;
import android.support.v4.view.p;
import android.view.View;
import android.view.ViewGroup;

public abstract class d
extends p {
    private final FragmentManager a;
    private FragmentTransaction b = null;
    private Fragment c = null;

    public d(FragmentManager fragmentManager) {
        this.a = fragmentManager;
    }

    private static String a(int n2, long l2) {
        return "android:switcher:" + n2 + ":" + l2;
    }

    public abstract Fragment a(int var1);

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     */
    @Override
    public final Object a(ViewGroup object, int n2) {
        void var1_3;
        void var2_5;
        if (this.b == null) {
            this.b = this.a.beginTransaction();
        }
        long l2 = (long)var2_5;
        String string = d.a(object.getId(), l2);
        if ((string = this.a.findFragmentByTag(string)) != null) {
            this.b.attach((Fragment)string);
            String string2 = string;
        } else {
            string = this.a((int)var2_5);
            this.b.add(object.getId(), (Fragment)string, d.a(object.getId(), l2));
            String string3 = string;
        }
        if (var1_3 != this.c) {
            android.support.a.a.a.a((Fragment)var1_3, false);
            android.support.a.a.a.b((Fragment)var1_3, false);
        }
        return var1_3;
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
    public final void a(Object object) {
        if (this.b == null) {
            this.b = this.a.beginTransaction();
        }
        this.b.detach((Fragment)object);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public final boolean a(View view, Object object) {
        if (((Fragment)object).getView() != view) return false;
        return true;
    }

    @Override
    public final void b(Object object) {
        if ((object = (Fragment)object) != this.c) {
            if (this.c != null) {
                android.support.a.a.a.a(this.c, false);
                android.support.a.a.a.b(this.c, false);
            }
            if (object != null) {
                android.support.a.a.a.a((Fragment)object, true);
                android.support.a.a.a.b((Fragment)object, true);
            }
            this.c = object;
        }
    }
}

