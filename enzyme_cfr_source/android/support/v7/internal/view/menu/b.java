/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 */
package android.support.v7.internal.view.menu;

import android.content.Context;
import android.support.v4.view.u;
import android.support.v7.internal.view.menu.e;
import android.support.v7.internal.view.menu.f;
import android.support.v7.internal.view.menu.j;
import android.support.v7.internal.view.menu.k;
import android.support.v7.internal.view.menu.m;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;

public abstract class b
implements j {
    protected Context a;
    protected Context b;
    protected e c;
    protected LayoutInflater d;
    protected LayoutInflater e;
    public j.a f;
    protected k g;
    private int h;
    private int i;

    public b(Context context, int n2, int n3) {
        this.a = context;
        this.d = LayoutInflater.from((Context)context);
        this.h = n2;
        this.i = n3;
    }

    public k a(ViewGroup viewGroup) {
        if (this.g == null) {
            this.g = (k)this.d.inflate(this.h, viewGroup, false);
            this.g.a(this.c);
            this.a(true);
        }
        return this.g;
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     */
    public View a(f f2, View object, ViewGroup viewGroup) {
        void var2_4;
        if (object instanceof k.a) {
            k.a a2 = (k.a)object;
        } else {
            void var3_6;
            k.a a3 = (k.a)this.d.inflate(this.i, (ViewGroup)var3_6, false);
        }
        this.a(f2, (k.a)var2_4);
        return (View)var2_4;
    }

    @Override
    public void a(Context context, e e2) {
        this.b = context;
        this.e = LayoutInflater.from((Context)this.b);
        this.c = e2;
    }

    @Override
    public void a(e e2, boolean bl) {
        if (this.f != null) {
            this.f.a(e2, bl);
        }
    }

    public abstract void a(f var1, k.a var2);

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public void a(boolean bl) {
        ViewGroup viewGroup = (ViewGroup)this.g;
        if (viewGroup != null) {
            int n2;
            if (this.c == null) {
                n2 = 0;
            } else {
                this.c.f();
                ArrayList<f> arrayList = this.c.e();
                int n3 = arrayList.size();
                int n4 = 0;
                int n5 = 0;
                while (true) {
                    n2 = ++n5;
                    if (n4 >= n3) break;
                    f f2 = arrayList.get(n4);
                    if (this.a(f2)) {
                        View view = viewGroup.getChildAt(n5);
                        f f3 = view instanceof k.a ? ((k.a)view).getItemData() : null;
                        View view2 = this.a(f2, view, viewGroup);
                        if (f2 != f3) {
                            view2.setPressed(false);
                            u.m(view2);
                        }
                        if (view2 != view) {
                            f3 = (ViewGroup)view2.getParent();
                            if (f3 != null) {
                                f3.removeView(view2);
                            }
                            ((ViewGroup)this.g).addView(view2, n5);
                        }
                    }
                    ++n4;
                }
            }
            while (n2 < viewGroup.getChildCount()) {
                if (this.a(viewGroup, n2)) continue;
                ++n2;
            }
        }
    }

    @Override
    public boolean a() {
        return false;
    }

    public boolean a(f f2) {
        return true;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public boolean a(m m2) {
        if (this.f == null) return false;
        return this.f.a(m2);
    }

    public boolean a(ViewGroup viewGroup, int n2) {
        viewGroup.removeViewAt(n2);
        return true;
    }

    @Override
    public final boolean b(f f2) {
        return false;
    }

    @Override
    public final boolean c(f f2) {
        return false;
    }
}

