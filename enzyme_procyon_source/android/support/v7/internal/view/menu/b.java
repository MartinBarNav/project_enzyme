// 
// Decompiled by Procyon v0.5.36
// 

package android.support.v7.internal.view.menu;

import java.util.ArrayList;
import android.support.v4.view.u;
import android.view.View;
import android.view.ViewGroup;
import android.view.LayoutInflater;
import android.content.Context;

public abstract class b implements j
{
    protected Context a;
    protected Context b;
    protected e c;
    protected LayoutInflater d;
    protected LayoutInflater e;
    public a f;
    protected k g;
    private int h;
    private int i;
    
    public b(final Context a, final int h, final int i) {
        this.a = a;
        this.d = LayoutInflater.from(a);
        this.h = h;
        this.i = i;
    }
    
    public k a(final ViewGroup viewGroup) {
        if (this.g == null) {
            (this.g = (k)this.d.inflate(this.h, viewGroup, false)).a(this.c);
            this.a(true);
        }
        return this.g;
    }
    
    public View a(final f f, final View view, final ViewGroup viewGroup) {
        k.a a;
        if (view instanceof k.a) {
            a = (k.a)view;
        }
        else {
            a = (k.a)this.d.inflate(this.i, viewGroup, false);
        }
        this.a(f, a);
        return (View)a;
    }
    
    @Override
    public void a(final Context b, final e c) {
        this.b = b;
        this.e = LayoutInflater.from(this.b);
        this.c = c;
    }
    
    @Override
    public void a(final e e, final boolean b) {
        if (this.f != null) {
            this.f.a(e, b);
        }
    }
    
    public abstract void a(final f p0, final k.a p1);
    
    @Override
    public void a(final boolean b) {
        final ViewGroup viewGroup = (ViewGroup)this.g;
        if (viewGroup != null) {
            int i;
            if (this.c != null) {
                this.c.f();
                final ArrayList<f> e = this.c.e();
                final int size = e.size();
                int index = 0;
                int n = 0;
                while (true) {
                    i = n;
                    if (index >= size) {
                        break;
                    }
                    final f f = e.get(index);
                    if (this.a(f)) {
                        final View child = viewGroup.getChildAt(n);
                        f itemData;
                        if (child instanceof k.a) {
                            itemData = ((k.a)child).getItemData();
                        }
                        else {
                            itemData = null;
                        }
                        final View a = this.a(f, child, viewGroup);
                        if (f != itemData) {
                            a.setPressed(false);
                            u.m(a);
                        }
                        if (a != child) {
                            final ViewGroup viewGroup2 = (ViewGroup)a.getParent();
                            if (viewGroup2 != null) {
                                viewGroup2.removeView(a);
                            }
                            ((ViewGroup)this.g).addView(a, n);
                        }
                        ++n;
                    }
                    ++index;
                }
            }
            else {
                i = 0;
            }
            while (i < viewGroup.getChildCount()) {
                if (!this.a(viewGroup, i)) {
                    ++i;
                }
            }
        }
    }
    
    @Override
    public boolean a() {
        return false;
    }
    
    public boolean a(final f f) {
        return true;
    }
    
    @Override
    public boolean a(final m m) {
        return this.f != null && this.f.a(m);
    }
    
    public boolean a(final ViewGroup viewGroup, final int n) {
        viewGroup.removeViewAt(n);
        return true;
    }
    
    @Override
    public final boolean b(final f f) {
        return false;
    }
    
    @Override
    public final boolean c(final f f) {
        return false;
    }
}
