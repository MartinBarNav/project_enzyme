package android.support.v7.internal.view.menu;

import android.content.Context;
import android.support.v4.view.u;
import android.support.v7.internal.view.menu.j;
import android.support.v7.internal.view.menu.k;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;

public abstract class b implements j {
    protected Context a;
    protected Context b;
    protected e c;
    protected LayoutInflater d;
    protected LayoutInflater e;
    public j.a f;
    protected k g;
    private int h;
    private int i;

    public abstract void a(f fVar, k.a aVar);

    public b(Context context, int i2, int i3) {
        this.a = context;
        this.d = LayoutInflater.from(context);
        this.h = i2;
        this.i = i3;
    }

    public void a(Context context, e eVar) {
        this.b = context;
        this.e = LayoutInflater.from(this.b);
        this.c = eVar;
    }

    public k a(ViewGroup viewGroup) {
        if (this.g == null) {
            this.g = (k) this.d.inflate(this.h, viewGroup, false);
            this.g.a(this.c);
            a(true);
        }
        return this.g;
    }

    public void a(boolean z) {
        int i2;
        int i3;
        ViewGroup viewGroup = (ViewGroup) this.g;
        if (viewGroup != null) {
            if (this.c != null) {
                this.c.f();
                ArrayList<f> e2 = this.c.e();
                int size = e2.size();
                int i4 = 0;
                i2 = 0;
                while (i4 < size) {
                    f fVar = e2.get(i4);
                    if (a(fVar)) {
                        View childAt = viewGroup.getChildAt(i2);
                        f itemData = childAt instanceof k.a ? ((k.a) childAt).getItemData() : null;
                        View a2 = a(fVar, childAt, viewGroup);
                        if (fVar != itemData) {
                            a2.setPressed(false);
                            u.m(a2);
                        }
                        if (a2 != childAt) {
                            ViewGroup viewGroup2 = (ViewGroup) a2.getParent();
                            if (viewGroup2 != null) {
                                viewGroup2.removeView(a2);
                            }
                            ((ViewGroup) this.g).addView(a2, i2);
                        }
                        i3 = i2 + 1;
                    } else {
                        i3 = i2;
                    }
                    i4++;
                    i2 = i3;
                }
            } else {
                i2 = 0;
            }
            while (i2 < viewGroup.getChildCount()) {
                if (!a(viewGroup, i2)) {
                    i2++;
                }
            }
        }
    }

    public boolean a(ViewGroup viewGroup, int i2) {
        viewGroup.removeViewAt(i2);
        return true;
    }

    public View a(f fVar, View view, ViewGroup viewGroup) {
        k.a aVar;
        if (view instanceof k.a) {
            aVar = (k.a) view;
        } else {
            aVar = (k.a) this.d.inflate(this.i, viewGroup, false);
        }
        a(fVar, aVar);
        return (View) aVar;
    }

    public boolean a(f fVar) {
        return true;
    }

    public void a(e eVar, boolean z) {
        if (this.f != null) {
            this.f.a(eVar, z);
        }
    }

    public boolean a(m mVar) {
        if (this.f != null) {
            return this.f.a(mVar);
        }
        return false;
    }

    public boolean a() {
        return false;
    }

    public final boolean b(f fVar) {
        return false;
    }

    public final boolean c(f fVar) {
        return false;
    }
}
