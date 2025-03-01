package android.support.a.a;

import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.support.v4.view.p;
import android.view.View;
import android.view.ViewGroup;

public abstract class d extends p {
    private final FragmentManager a;
    private FragmentTransaction b = null;
    private Fragment c = null;

    public abstract Fragment a(int i);

    public d(FragmentManager fragmentManager) {
        this.a = fragmentManager;
    }

    public final Object a(ViewGroup viewGroup, int i) {
        if (this.b == null) {
            this.b = this.a.beginTransaction();
        }
        long j = (long) i;
        Fragment findFragmentByTag = this.a.findFragmentByTag(a(viewGroup.getId(), j));
        if (findFragmentByTag != null) {
            this.b.attach(findFragmentByTag);
        } else {
            findFragmentByTag = a(i);
            this.b.add(viewGroup.getId(), findFragmentByTag, a(viewGroup.getId(), j));
        }
        if (findFragmentByTag != this.c) {
            a.a(findFragmentByTag, false);
            a.b(findFragmentByTag, false);
        }
        return findFragmentByTag;
    }

    public final void a(Object obj) {
        if (this.b == null) {
            this.b = this.a.beginTransaction();
        }
        this.b.detach((Fragment) obj);
    }

    public final void b(Object obj) {
        Fragment fragment = (Fragment) obj;
        if (fragment != this.c) {
            if (this.c != null) {
                a.a(this.c, false);
                a.b(this.c, false);
            }
            if (fragment != null) {
                a.a(fragment, true);
                a.b(fragment, true);
            }
            this.c = fragment;
        }
    }

    public final void a() {
        if (this.b != null) {
            this.b.commitAllowingStateLoss();
            this.b = null;
            this.a.executePendingTransactions();
        }
    }

    public final boolean a(View view, Object obj) {
        return ((Fragment) obj).getView() == view;
    }

    private static String a(int i, long j) {
        return "android:switcher:" + i + ":" + j;
    }
}
