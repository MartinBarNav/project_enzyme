// 
// Decompiled by Procyon v0.5.36
// 

package android.support.v7.internal.view.menu;

import java.util.ArrayList;
import android.widget.BaseAdapter;
import android.view.KeyEvent;
import android.widget.AdapterView;
import android.graphics.drawable.Drawable;
import android.widget.FrameLayout;
import android.view.View$MeasureSpec;
import android.widget.ListAdapter;
import android.util.AttributeSet;
import android.view.MenuItem;
import android.content.res.Resources;
import android.support.v7.b.a;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.LayoutInflater;
import android.content.Context;
import android.support.v7.widget.b;
import android.view.View;
import android.widget.PopupWindow$OnDismissListener;
import android.widget.AdapterView$OnItemClickListener;
import android.view.ViewTreeObserver$OnGlobalLayoutListener;
import android.view.View$OnKeyListener;

public class i implements j, View$OnKeyListener, ViewTreeObserver$OnGlobalLayoutListener, AdapterView$OnItemClickListener, PopupWindow$OnDismissListener
{
    static final int a;
    public View b;
    public b c;
    protected j.a d;
    protected boolean e;
    protected int f;
    private final Context g;
    private final LayoutInflater h;
    private final e i;
    private final a j;
    private final boolean k;
    private final int l;
    private final int m;
    private final int n;
    private ViewTreeObserver o;
    private ViewGroup p;
    private boolean q;
    private int r;
    
    static {
        a = android.support.v7.b.a.g.abc_popup_menu_item_layout;
    }
    
    private i(final Context context, final e e, final View view) {
        this(context, e, view, false, android.support.v7.b.a.a.popupMenuStyle);
    }
    
    public i(final Context context, final e e, final View view, final boolean b, final int n) {
        this(context, e, view, b, n, (byte)0);
    }
    
    private i(final Context g, final e i, final View b, final boolean k, final int m, final byte b2) {
        this.f = 0;
        this.g = g;
        this.h = LayoutInflater.from(g);
        this.i = i;
        this.j = new a(this.i);
        this.k = k;
        this.m = m;
        this.n = 0;
        final Resources resources = g.getResources();
        this.l = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(android.support.v7.b.a.c.abc_config_prefDialogWidth));
        this.b = b;
        i.a(this, g);
    }
    
    @Override
    public final void a(final Context context, final e e) {
    }
    
    @Override
    public final void a(final e e, final boolean b) {
        if (e == this.i) {
            this.c();
            if (this.d != null) {
                this.d.a(e, b);
            }
        }
    }
    
    @Override
    public final void a(final boolean b) {
        this.q = false;
        if (this.j != null) {
            this.j.notifyDataSetChanged();
        }
    }
    
    @Override
    public final boolean a() {
        return false;
    }
    
    @Override
    public final boolean a(final m m) {
        final boolean b = true;
        if (m.hasVisibleItems()) {
            final i i = new i(this.g, m, this.b);
            i.d = this.d;
            final int size = m.size();
            int j = 0;
            while (true) {
                while (j < size) {
                    final MenuItem item = m.getItem(j);
                    if (item.isVisible() && item.getIcon() != null) {
                        final boolean e = true;
                        i.e = e;
                        if (!i.b()) {
                            return false;
                        }
                        boolean b2 = b;
                        if (this.d != null) {
                            this.d.a(m);
                            b2 = b;
                            return b2;
                        }
                        return b2;
                    }
                    else {
                        ++j;
                    }
                }
                final boolean e = false;
                continue;
            }
        }
        return false;
        return false;
    }
    
    public final boolean b() {
        boolean b = true;
        final int n = 0;
        this.c = new b(this.g, null, this.m, this.n);
        this.c.b.setOnDismissListener((PopupWindow$OnDismissListener)this);
        this.c.i = (AdapterView$OnItemClickListener)this;
        this.c.a((ListAdapter)this.j);
        this.c.d();
        final View b2 = this.b;
        if (b2 != null) {
            int n2;
            if (this.o == null) {
                n2 = 1;
            }
            else {
                n2 = 0;
            }
            this.o = b2.getViewTreeObserver();
            if (n2 != 0) {
                this.o.addOnGlobalLayoutListener((ViewTreeObserver$OnGlobalLayoutListener)this);
            }
            this.c.h = b2;
            this.c.e = this.f;
            if (!this.q) {
                final a j = this.j;
                final int measureSpec = View$MeasureSpec.makeMeasureSpec(0, 0);
                final int measureSpec2 = View$MeasureSpec.makeMeasureSpec(0, 0);
                final int count = ((ListAdapter)j).getCount();
                int n3 = 0;
                int n4 = 0;
                View view = null;
                int n5 = n;
                int l;
                while (true) {
                    l = n5;
                    if (n3 >= count) {
                        break;
                    }
                    final int itemViewType = ((ListAdapter)j).getItemViewType(n3);
                    if (itemViewType != n4) {
                        n4 = itemViewType;
                        view = null;
                    }
                    if (this.p == null) {
                        this.p = (ViewGroup)new FrameLayout(this.g);
                    }
                    view = ((ListAdapter)j).getView(n3, view, this.p);
                    view.measure(measureSpec, measureSpec2);
                    final int measuredWidth = view.getMeasuredWidth();
                    if (measuredWidth >= this.l) {
                        l = this.l;
                        break;
                    }
                    if (measuredWidth > n5) {
                        n5 = measuredWidth;
                    }
                    ++n3;
                }
                this.r = l;
                this.q = true;
            }
            final b c = this.c;
            final int r = this.r;
            final Drawable background = c.b.getBackground();
            if (background != null) {
                background.getPadding(c.j);
                c.d = r + (c.j.left + c.j.right);
            }
            else {
                c.d = r;
            }
            this.c.b.setInputMethodMode(2);
            this.c.c();
            this.c.c.setOnKeyListener((View$OnKeyListener)this);
        }
        else {
            b = false;
        }
        return b;
    }
    
    @Override
    public final boolean b(final f f) {
        return false;
    }
    
    public final void c() {
        if (this.d()) {
            this.c.a();
        }
    }
    
    @Override
    public final boolean c(final f f) {
        return false;
    }
    
    public final boolean d() {
        return this.c != null && this.c.b.isShowing();
    }
    
    public void onDismiss() {
        this.c = null;
        this.i.close();
        if (this.o != null) {
            if (!this.o.isAlive()) {
                this.o = this.b.getViewTreeObserver();
            }
            this.o.removeGlobalOnLayoutListener((ViewTreeObserver$OnGlobalLayoutListener)this);
            this.o = null;
        }
    }
    
    public void onGlobalLayout() {
        if (this.d()) {
            final View b = this.b;
            if (b == null || !b.isShown()) {
                this.c();
            }
            else if (this.d()) {
                this.c.c();
            }
        }
    }
    
    public void onItemClick(final AdapterView<?> adapterView, final View view, final int n, final long n2) {
        final a j = this.j;
        j.b.a((MenuItem)j.a(n), 0);
    }
    
    public boolean onKey(final View view, final int n, final KeyEvent keyEvent) {
        boolean b = true;
        if (keyEvent.getAction() == 1 && n == 82) {
            this.c();
        }
        else {
            b = false;
        }
        return b;
    }
    
    private final class a extends BaseAdapter
    {
        private e b;
        private int c;
        
        public a(final e b) {
            this.c = -1;
            this.b = b;
            this.a();
        }
        
        private void a() {
            final f h = android.support.v7.internal.view.menu.i.this.i.h;
            if (h != null) {
                final ArrayList<f> g = android.support.v7.internal.view.menu.i.this.i.g();
                for (int size = g.size(), i = 0; i < size; ++i) {
                    if (g.get(i) == h) {
                        this.c = i;
                        return;
                    }
                }
            }
            Label_0066: {
                break Label_0066;
            }
            this.c = -1;
        }
        
        public final f a(final int n) {
            ArrayList<f> list;
            if (android.support.v7.internal.view.menu.i.this.k) {
                list = this.b.g();
            }
            else {
                list = this.b.e();
            }
            int index = n;
            if (this.c >= 0 && (index = n) >= this.c) {
                index = n + 1;
            }
            return list.get(index);
        }
        
        public final int getCount() {
            ArrayList<f> list;
            if (android.support.v7.internal.view.menu.i.this.k) {
                list = this.b.g();
            }
            else {
                list = this.b.e();
            }
            int size;
            if (this.c < 0) {
                size = list.size();
            }
            else {
                size = list.size() - 1;
            }
            return size;
        }
        
        public final long getItemId(final int n) {
            return n;
        }
        
        public final View getView(final int n, View inflate, final ViewGroup viewGroup) {
            if (inflate == null) {
                inflate = android.support.v7.internal.view.menu.i.this.h.inflate(android.support.v7.internal.view.menu.i.a, viewGroup, false);
            }
            final k.a a = (k.a)inflate;
            if (android.support.v7.internal.view.menu.i.this.e) {
                ((ListMenuItemView)inflate).setForceShowIcon(true);
            }
            a.a(this.a(n));
            return inflate;
        }
        
        public final void notifyDataSetChanged() {
            this.a();
            super.notifyDataSetChanged();
        }
    }
}
