package android.support.v7.internal.view.menu;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.support.v7.b.a;
import android.support.v7.internal.view.menu.j;
import android.support.v7.internal.view.menu.k;
import android.support.v7.widget.b;
import android.util.AttributeSet;
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

public class i implements j, View.OnKeyListener, ViewTreeObserver.OnGlobalLayoutListener, AdapterView.OnItemClickListener, PopupWindow.OnDismissListener {
    static final int a = a.g.abc_popup_menu_item_layout;
    public View b;
    public b c;
    protected j.a d;
    protected boolean e;
    protected int f;
    private final Context g;
    /* access modifiers changed from: private */
    public final LayoutInflater h;
    /* access modifiers changed from: private */
    public final e i;
    private final a j;
    /* access modifiers changed from: private */
    public final boolean k;
    private final int l;
    private final int m;
    private final int n;
    private ViewTreeObserver o;
    private ViewGroup p;
    private boolean q;
    private int r;

    private i(Context context, e eVar, View view) {
        this(context, eVar, view, false, a.C0011a.popupMenuStyle);
    }

    public i(Context context, e eVar, View view, boolean z, int i2) {
        this(context, eVar, view, z, i2, (byte) 0);
    }

    private i(Context context, e eVar, View view, boolean z, int i2, byte b2) {
        this.f = 0;
        this.g = context;
        this.h = LayoutInflater.from(context);
        this.i = eVar;
        this.j = new a(this.i);
        this.k = z;
        this.m = i2;
        this.n = 0;
        Resources resources = context.getResources();
        this.l = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(a.c.abc_config_prefDialogWidth));
        this.b = view;
        eVar.a((j) this, context);
    }

    public final boolean b() {
        View view;
        int i2 = 0;
        this.c = new b(this.g, (AttributeSet) null, this.m, this.n);
        this.c.b.setOnDismissListener(this);
        this.c.i = this;
        this.c.a((ListAdapter) this.j);
        this.c.d();
        View view2 = this.b;
        if (view2 == null) {
            return false;
        }
        boolean z = this.o == null;
        this.o = view2.getViewTreeObserver();
        if (z) {
            this.o.addOnGlobalLayoutListener(this);
        }
        this.c.h = view2;
        this.c.e = this.f;
        if (!this.q) {
            a aVar = this.j;
            int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
            int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(0, 0);
            int count = aVar.getCount();
            int i3 = 0;
            int i4 = 0;
            View view3 = null;
            while (true) {
                if (i3 >= count) {
                    break;
                }
                int itemViewType = aVar.getItemViewType(i3);
                if (itemViewType != i4) {
                    i4 = itemViewType;
                    view = null;
                } else {
                    view = view3;
                }
                if (this.p == null) {
                    this.p = new FrameLayout(this.g);
                }
                view3 = aVar.getView(i3, view, this.p);
                view3.measure(makeMeasureSpec, makeMeasureSpec2);
                int measuredWidth = view3.getMeasuredWidth();
                if (measuredWidth >= this.l) {
                    i2 = this.l;
                    break;
                }
                if (measuredWidth <= i2) {
                    measuredWidth = i2;
                }
                i3++;
                i2 = measuredWidth;
            }
            this.r = i2;
            this.q = true;
        }
        b bVar = this.c;
        int i5 = this.r;
        Drawable background = bVar.b.getBackground();
        if (background != null) {
            background.getPadding(bVar.j);
            bVar.d = i5 + bVar.j.left + bVar.j.right;
        } else {
            bVar.d = i5;
        }
        this.c.b.setInputMethodMode(2);
        this.c.c();
        this.c.c.setOnKeyListener(this);
        return true;
    }

    public final void c() {
        if (d()) {
            this.c.a();
        }
    }

    public void onDismiss() {
        this.c = null;
        this.i.close();
        if (this.o != null) {
            if (!this.o.isAlive()) {
                this.o = this.b.getViewTreeObserver();
            }
            this.o.removeGlobalOnLayoutListener(this);
            this.o = null;
        }
    }

    public final boolean d() {
        return this.c != null && this.c.b.isShowing();
    }

    public void onItemClick(AdapterView<?> adapterView, View view, int i2, long j2) {
        a aVar = this.j;
        aVar.b.a((MenuItem) aVar.getItem(i2), 0);
    }

    public boolean onKey(View view, int i2, KeyEvent keyEvent) {
        if (keyEvent.getAction() != 1 || i2 != 82) {
            return false;
        }
        c();
        return true;
    }

    public void onGlobalLayout() {
        if (d()) {
            View view = this.b;
            if (view == null || !view.isShown()) {
                c();
            } else if (d()) {
                this.c.c();
            }
        }
    }

    public final void a(Context context, e eVar) {
    }

    public final void a(boolean z) {
        this.q = false;
        if (this.j != null) {
            this.j.notifyDataSetChanged();
        }
    }

    public final boolean a(m mVar) {
        boolean z;
        if (mVar.hasVisibleItems()) {
            i iVar = new i(this.g, mVar, this.b);
            iVar.d = this.d;
            int size = mVar.size();
            int i2 = 0;
            while (true) {
                if (i2 >= size) {
                    z = false;
                    break;
                }
                MenuItem item = mVar.getItem(i2);
                if (item.isVisible() && item.getIcon() != null) {
                    z = true;
                    break;
                }
                i2++;
            }
            iVar.e = z;
            if (iVar.b()) {
                if (this.d == null) {
                    return true;
                }
                this.d.a(mVar);
                return true;
            }
        }
        return false;
    }

    public final void a(e eVar, boolean z) {
        if (eVar == this.i) {
            c();
            if (this.d != null) {
                this.d.a(eVar, z);
            }
        }
    }

    public final boolean a() {
        return false;
    }

    public final boolean b(f fVar) {
        return false;
    }

    public final boolean c(f fVar) {
        return false;
    }

    private class a extends BaseAdapter {
        /* access modifiers changed from: private */
        public e b;
        private int c = -1;

        public a(e eVar) {
            this.b = eVar;
            a();
        }

        public final int getCount() {
            ArrayList<f> g = i.this.k ? this.b.g() : this.b.e();
            if (this.c < 0) {
                return g.size();
            }
            return g.size() - 1;
        }

        /* renamed from: a */
        public final f getItem(int i) {
            ArrayList<f> g = i.this.k ? this.b.g() : this.b.e();
            if (this.c >= 0 && i >= this.c) {
                i++;
            }
            return g.get(i);
        }

        public final long getItemId(int i) {
            return (long) i;
        }

        public final View getView(int i, View view, ViewGroup viewGroup) {
            View view2;
            if (view == null) {
                view2 = i.this.h.inflate(i.a, viewGroup, false);
            } else {
                view2 = view;
            }
            k.a aVar = (k.a) view2;
            if (i.this.e) {
                ((ListMenuItemView) view2).setForceShowIcon(true);
            }
            aVar.a(getItem(i));
            return view2;
        }

        private void a() {
            f fVar = i.this.i.h;
            if (fVar != null) {
                ArrayList<f> g = i.this.i.g();
                int size = g.size();
                for (int i = 0; i < size; i++) {
                    if (g.get(i) == fVar) {
                        this.c = i;
                        return;
                    }
                }
            }
            this.c = -1;
        }

        public final void notifyDataSetChanged() {
            a();
            super.notifyDataSetChanged();
        }
    }
}
