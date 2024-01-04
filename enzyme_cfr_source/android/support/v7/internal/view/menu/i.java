/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.res.Resources
 *  android.view.KeyEvent
 *  android.view.LayoutInflater
 *  android.view.MenuItem
 *  android.view.View
 *  android.view.View$MeasureSpec
 *  android.view.View$OnKeyListener
 *  android.view.ViewGroup
 *  android.view.ViewTreeObserver
 *  android.view.ViewTreeObserver$OnGlobalLayoutListener
 *  android.widget.AdapterView
 *  android.widget.AdapterView$OnItemClickListener
 *  android.widget.BaseAdapter
 *  android.widget.FrameLayout
 *  android.widget.ListAdapter
 *  android.widget.PopupWindow$OnDismissListener
 */
package android.support.v7.internal.view.menu;

import android.content.Context;
import android.content.res.Resources;
import android.support.v7.b.a;
import android.support.v7.internal.view.menu.ListMenuItemView;
import android.support.v7.internal.view.menu.e;
import android.support.v7.internal.view.menu.f;
import android.support.v7.internal.view.menu.j;
import android.support.v7.internal.view.menu.k;
import android.support.v7.internal.view.menu.m;
import android.support.v7.widget.b;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.FrameLayout;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import java.util.ArrayList;

public class i
implements j,
View.OnKeyListener,
ViewTreeObserver.OnGlobalLayoutListener,
AdapterView.OnItemClickListener,
PopupWindow.OnDismissListener {
    static final int a = a.g.abc_popup_menu_item_layout;
    public View b;
    public b c;
    protected j.a d;
    protected boolean e;
    protected int f = 0;
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

    private i(Context context, e e2, View view) {
        this(context, e2, view, false, a.a.popupMenuStyle);
    }

    public i(Context context, e e2, View view, boolean bl, int n2) {
        this(context, e2, view, bl, n2, 0);
    }

    private i(Context context, e e2, View view, boolean bl, int n2, byte by) {
        this.g = context;
        this.h = LayoutInflater.from((Context)context);
        this.i = e2;
        this.j = new a(this.i);
        this.k = bl;
        this.m = n2;
        this.n = 0;
        Resources resources = context.getResources();
        this.l = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(a.c.abc_config_prefDialogWidth));
        this.b = view;
        e2.a(this, context);
    }

    @Override
    public final void a(Context context, e e2) {
    }

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public final void a(e e2, boolean bl) {
        if (e2 != this.i) {
            return;
        }
        this.c();
        if (this.d == null) return;
        this.d.a(e2, bl);
    }

    @Override
    public final void a(boolean bl) {
        this.q = false;
        if (this.j != null) {
            this.j.notifyDataSetChanged();
        }
    }

    @Override
    public final boolean a() {
        return false;
    }

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public final boolean a(m m2) {
        boolean bl;
        i i2;
        boolean bl2;
        block1: {
            bl2 = true;
            if (!m2.hasVisibleItems()) return false;
            i2 = new i(this.g, m2, this.b);
            i2.d = this.d;
            int n2 = m2.size();
            for (int i3 = 0; i3 < n2; ++i3) {
                MenuItem menuItem = m2.getItem(i3);
                if (!menuItem.isVisible() || menuItem.getIcon() == null) continue;
                bl = true;
                break block1;
            }
            bl = false;
        }
        i2.e = bl;
        if (!i2.b()) return false;
        bl = bl2;
        if (this.d == null) return bl;
        this.d.a(m2);
        return bl2;
    }

    /*
     * Handled impossible loop by adding 'first' condition
     * Enabled aggressive block sorting
     */
    public final boolean b() {
        boolean bl = true;
        int n2 = 0;
        this.c = new b(this.g, null, this.m, this.n);
        this.c.b.setOnDismissListener((PopupWindow.OnDismissListener)this);
        this.c.i = this;
        this.c.a((ListAdapter)this.j);
        this.c.d();
        View view = this.b;
        if (view == null) {
            return false;
        }
        int n3 = this.o == null ? 1 : 0;
        this.o = view.getViewTreeObserver();
        if (n3 != 0) {
            this.o.addOnGlobalLayoutListener((ViewTreeObserver.OnGlobalLayoutListener)this);
        }
        this.c.h = view;
        this.c.e = this.f;
        boolean bl2 = true;
        while (true) {
            int n4;
            block13: {
                block11: {
                    block12: {
                        if (!bl2 || (bl2 = false)) continue;
                        if (this.q) break block11;
                        a a2 = this.j;
                        int n5 = View.MeasureSpec.makeMeasureSpec((int)0, (int)0);
                        int n6 = View.MeasureSpec.makeMeasureSpec((int)0, (int)0);
                        int n7 = a2.getCount();
                        n4 = 0;
                        int n8 = 0;
                        view = null;
                        n3 = n2;
                        n2 = n3;
                        if (n4 >= n7) break block12;
                        n2 = a2.getItemViewType(n4);
                        if (n2 != n8) {
                            n8 = n2;
                            view = null;
                        }
                        if (this.p == null) {
                            this.p = new FrameLayout(this.g);
                        }
                        view = a2.getView(n4, view, this.p);
                        view.measure(n5, n6);
                        n2 = view.getMeasuredWidth();
                        if (n2 < this.l) break block13;
                        n2 = this.l;
                    }
                    this.r = n2;
                    this.q = true;
                }
                b b2 = this.c;
                n3 = this.r;
                view = b2.b.getBackground();
                if (view != null) {
                    view.getPadding(b2.j);
                    b2.d = n3 + (b2.j.left + b2.j.right);
                } else {
                    b2.d = n3;
                }
                this.c.b.setInputMethodMode(2);
                this.c.c();
                this.c.c.setOnKeyListener(this);
                return bl;
            }
            if (n2 > n3) {
                n3 = n2;
            }
            ++n4;
        }
    }

    @Override
    public final boolean b(f f2) {
        return false;
    }

    public final void c() {
        if (this.d()) {
            this.c.a();
        }
    }

    @Override
    public final boolean c(f f2) {
        return false;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final boolean d() {
        if (this.c == null) return false;
        if (!this.c.b.isShowing()) return false;
        return true;
    }

    public void onDismiss() {
        this.c = null;
        this.i.close();
        if (this.o != null) {
            if (!this.o.isAlive()) {
                this.o = this.b.getViewTreeObserver();
            }
            this.o.removeGlobalOnLayoutListener((ViewTreeObserver.OnGlobalLayoutListener)this);
            this.o = null;
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    public void onGlobalLayout() {
        if (!this.d()) return;
        View view = this.b;
        if (view != null && view.isShown()) {
            if (!this.d()) return;
            this.c.c();
            return;
        }
        this.c();
    }

    public void onItemClick(AdapterView<?> object, View view, int n2, long l2) {
        object = this.j;
        ((a)object).b.a(((a)((Object)object)).a(n2), 0);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public boolean onKey(View view, int n2, KeyEvent keyEvent) {
        boolean bl = true;
        if (keyEvent.getAction() != 1) return false;
        if (n2 != 82) return false;
        this.c();
        return bl;
    }

    private final class a
    extends BaseAdapter {
        private e b;
        private int c = -1;

        public a(e e2) {
            this.b = e2;
            this.a();
        }

        /*
         * Enabled force condition propagation
         * Lifted jumps to return sites
         */
        private void a() {
            f f2 = ((i)i.this).i.h;
            if (f2 != null) {
                ArrayList<f> arrayList = i.this.i.g();
                int n2 = arrayList.size();
                for (int i2 = 0; i2 < n2; ++i2) {
                    if (arrayList.get(i2) != f2) continue;
                    this.c = i2;
                    return;
                }
            }
            this.c = -1;
        }

        /*
         * Enabled aggressive block sorting
         */
        public final f a(int n2) {
            ArrayList<f> arrayList = i.this.k ? this.b.g() : this.b.e();
            int n3 = n2;
            if (this.c >= 0) {
                n3 = n2;
                if (n2 >= this.c) {
                    n3 = n2 + 1;
                }
            }
            return arrayList.get(n3);
        }

        /*
         * Enabled aggressive block sorting
         */
        public final int getCount() {
            ArrayList<f> arrayList = i.this.k ? this.b.g() : this.b.e();
            if (this.c >= 0) return arrayList.size() - 1;
            return arrayList.size();
        }

        public final /* synthetic */ Object getItem(int n2) {
            return this.a(n2);
        }

        public final long getItemId(int n2) {
            return n2;
        }

        public final View getView(int n2, View view, ViewGroup object) {
            if (view == null) {
                view = i.this.h.inflate(a, (ViewGroup)object, false);
            }
            object = (k.a)view;
            if (i.this.e) {
                ((ListMenuItemView)view).setForceShowIcon(true);
            }
            object.a(this.a(n2));
            return view;
        }

        public final void notifyDataSetChanged() {
            this.a();
            super.notifyDataSetChanged();
        }
    }
}

