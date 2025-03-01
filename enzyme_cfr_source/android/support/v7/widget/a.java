/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.res.Resources
 *  android.graphics.drawable.Drawable
 *  android.os.Build$VERSION
 *  android.util.SparseBooleanArray
 *  android.view.MenuItem
 *  android.view.View
 *  android.view.View$MeasureSpec
 *  android.view.ViewConfiguration
 *  android.view.ViewGroup
 *  android.view.ViewGroup$LayoutParams
 */
package android.support.v7.widget;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.support.v4.view.ab;
import android.support.v4.view.d;
import android.support.v7.b.a;
import android.support.v7.internal.view.menu.ActionMenuItemView;
import android.support.v7.internal.view.menu.e;
import android.support.v7.internal.view.menu.i;
import android.support.v7.internal.view.menu.j;
import android.support.v7.internal.view.menu.k;
import android.support.v7.internal.view.menu.m;
import android.support.v7.internal.widget.TintImageView;
import android.support.v7.widget.ActionMenuView;
import android.support.v7.widget.b;
import android.util.SparseBooleanArray;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import java.util.ArrayList;

public final class a
extends android.support.v7.internal.view.menu.b
implements d.a {
    View h;
    boolean i;
    boolean j;
    public int k;
    public int l;
    public boolean m;
    public boolean n;
    public boolean o;
    boolean p;
    e q;
    a r;
    c s;
    final f t;
    int u;
    private int v;
    private int w;
    private final SparseBooleanArray x = new SparseBooleanArray();
    private View y;
    private b z;

    public a(Context context) {
        super(context, a.g.abc_action_menu_layout, a.g.abc_action_menu_item_layout);
        this.t = new f(0);
    }

    @Override
    public final k a(ViewGroup object) {
        object = super.a((ViewGroup)object);
        ((ActionMenuView)object).setPresenter(this);
        return object;
    }

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public final View a(android.support.v7.internal.view.menu.f f2, View object, ViewGroup viewGroup) {
        View view = f2.getActionView();
        if (view == null || f2.i()) {
            view = super.a(f2, (View)object, viewGroup);
        }
        int n2 = f2.isActionViewExpanded() ? 8 : 0;
        view.setVisibility(n2);
        object = (ActionMenuView)viewGroup;
        f2 = view.getLayoutParams();
        if (!((ActionMenuView)object).checkLayoutParams((ViewGroup.LayoutParams)f2)) {
            view.setLayoutParams((ViewGroup.LayoutParams)ActionMenuView.a((ViewGroup.LayoutParams)f2));
        }
        return view;
    }

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public final void a(Context object, android.support.v7.internal.view.menu.e e2) {
        Resources resources;
        boolean bl = true;
        super.a((Context)object, (android.support.v7.internal.view.menu.e)resources);
        resources = object.getResources();
        android.support.v7.internal.view.a a2 = android.support.v7.internal.view.a.a(object);
        if (!this.j) {
            if (Build.VERSION.SDK_INT < 19 && ab.b(ViewConfiguration.get((Context)a2.a))) {
                bl = false;
            }
            this.i = bl;
        }
        if (!this.o) {
            this.k = a2.a.getResources().getDisplayMetrics().widthPixels / 2;
        }
        if (!this.m) {
            this.l = a2.a.getResources().getInteger(a.f.abc_max_action_buttons);
        }
        int n2 = this.k;
        if (this.i) {
            if (this.h == null) {
                this.h = new d(this.a);
                int n3 = View.MeasureSpec.makeMeasureSpec((int)0, (int)0);
                this.h.measure(n3, n3);
            }
            n2 -= this.h.getMeasuredWidth();
        } else {
            this.h = null;
        }
        this.v = n2;
        this.w = (int)(56.0f * resources.getDisplayMetrics().density);
        this.y = null;
    }

    @Override
    public final void a(android.support.v7.internal.view.menu.e e2, boolean bl) {
        this.e();
        super.a(e2, bl);
    }

    @Override
    public final void a(android.support.v7.internal.view.menu.f object, k.a a2) {
        a2.a((android.support.v7.internal.view.menu.f)object);
        object = (ActionMenuView)this.g;
        a2 = (ActionMenuItemView)a2;
        ((ActionMenuItemView)a2).setItemInvoker((e.b)object);
        if (this.z == null) {
            this.z = new b(0);
        }
        ((ActionMenuItemView)a2).setPopupCallback(this.z);
    }

    public final void a(ActionMenuView actionMenuView) {
        this.g = actionMenuView;
        actionMenuView.a = this.c;
    }

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public final void a(boolean bl) {
        int n2;
        Object object;
        int n3 = 1;
        int n4 = 0;
        ((View)this.g).getParent();
        super.a(bl);
        ((View)this.g).requestLayout();
        if (this.c != null) {
            object = this.c;
            object.f();
            object = object.c;
            int n5 = object.size();
            for (n2 = 0; n2 < n5; ++n2) {
                android.support.v4.view.d d2 = object.get((int)n2).d;
                if (d2 == null) continue;
                d2.a = this;
            }
        }
        object = this.c != null ? this.c.g() : null;
        n2 = n4;
        if (this.i) {
            n2 = n4;
            if (object != null) {
                n2 = object.size();
                n2 = n2 == 1 ? (!((android.support.v7.internal.view.menu.f)object.get(0)).isActionViewExpanded() ? 1 : 0) : (n2 > 0 ? n3 : 0);
            }
        }
        if (n2 != 0) {
            if (this.h == null) {
                this.h = new d(this.a);
            }
            if ((object = (ViewGroup)this.h.getParent()) != this.g) {
                if (object != null) {
                    object.removeView(this.h);
                }
                ((ActionMenuView)this.g).addView(this.h, (ViewGroup.LayoutParams)ActionMenuView.a());
            }
        } else if (this.h != null && this.h.getParent() == this.g) {
            ((ViewGroup)this.g).removeView(this.h);
        }
        ((ActionMenuView)this.g).setOverflowReserved(this.i);
    }

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public final boolean a() {
        int n2;
        android.support.v7.internal.view.menu.f f2;
        int n3;
        int n4;
        int n5;
        int n6;
        ViewGroup viewGroup;
        int n7;
        int n8;
        int n9;
        int n10;
        ArrayList<android.support.v7.internal.view.menu.f> arrayList;
        block32: {
            block33: {
                arrayList = this.c.e();
                n10 = arrayList.size();
                n9 = this.l;
                n8 = this.v;
                n7 = View.MeasureSpec.makeMeasureSpec((int)0, (int)0);
                viewGroup = (ViewGroup)this.g;
                n6 = 0;
                n5 = 0;
                n4 = 0;
                for (n3 = 0; n3 < n10; ++n3) {
                    f2 = arrayList.get(n3);
                    if (f2.h()) {
                        ++n6;
                    } else if (f2.g()) {
                        ++n5;
                    } else {
                        n4 = 1;
                    }
                    if (!this.p || !f2.isActionViewExpanded()) continue;
                    n9 = 0;
                }
                n3 = n9;
                if (!this.i) break block32;
                if (n4 != 0) break block33;
                n3 = n9;
                if (n6 + n5 <= n9) break block32;
            }
            n3 = n9 - 1;
        }
        n3 -= n6;
        SparseBooleanArray sparseBooleanArray = this.x;
        sparseBooleanArray.clear();
        if (this.n) {
            n9 = n8 / this.w;
            n5 = this.w;
            n6 = this.w;
            n2 = n8 % n5 / n9 + n6;
        } else {
            n2 = 0;
            n9 = 0;
        }
        n4 = 0;
        int n11 = 0;
        n6 = n9;
        n9 = n3;
        n5 = n8;
        n3 = n4;
        while (true) {
            block35: {
                int n12;
                boolean bl;
                int n13;
                Object object;
                block38: {
                    block37: {
                        block36: {
                            block34: {
                                if (n11 >= n10) {
                                    return true;
                                }
                                f2 = arrayList.get(n11);
                                if (!f2.h()) break block34;
                                object = this.a(f2, this.y, viewGroup);
                                if (this.y == null) {
                                    this.y = object;
                                }
                                if (this.n) {
                                    n4 = n6 - ActionMenuView.a((View)object, n2, n6, n7, 0);
                                } else {
                                    object.measure(n7, n7);
                                    n4 = n6;
                                }
                                n6 = object.getMeasuredWidth();
                                if (n3 == 0) {
                                    n3 = n6;
                                }
                                if ((n8 = f2.getGroupId()) != 0) {
                                    sparseBooleanArray.put(n8, true);
                                }
                                f2.c(true);
                                n6 = n5 - n6;
                                n5 = n9;
                                n9 = n4;
                                break block35;
                            }
                            if (!f2.g()) break block36;
                            n13 = f2.getGroupId();
                            bl = sparseBooleanArray.get(n13);
                            n12 = !(n9 <= 0 && !bl || n5 <= 0 || this.n && n6 <= 0) ? 1 : 0;
                            if (n12 == 0) break block37;
                            object = this.a(f2, this.y, viewGroup);
                            if (this.y == null) {
                                this.y = object;
                            }
                            if (this.n) {
                                n8 = ActionMenuView.a((View)object, n2, n6, n7, 0);
                                n6 = n4 = n6 - n8;
                                if (n8 == 0) {
                                    n12 = 0;
                                    n6 = n4;
                                }
                            } else {
                                object.measure(n7, n7);
                            }
                            n8 = object.getMeasuredWidth();
                            n5 -= n8;
                            n4 = n3;
                            if (n3 == 0) {
                                n4 = n8;
                            }
                            if (this.n) {
                                n3 = n5 >= 0 ? 1 : 0;
                                n12 &= n3;
                                n3 = n6;
                                n6 = n4;
                            } else {
                                n3 = n5 + n4 > 0 ? 1 : 0;
                                n12 &= n3;
                                n3 = n6;
                                n6 = n4;
                            }
                            break block38;
                        }
                        f2.c(false);
                        n4 = n6;
                        n6 = n5;
                        n5 = n9;
                        n9 = n4;
                        break block35;
                    }
                    n4 = n6;
                    n6 = n3;
                    n3 = n4;
                }
                if (n12 != 0 && n13 != 0) {
                    sparseBooleanArray.put(n13, true);
                } else if (bl) {
                    sparseBooleanArray.put(n13, false);
                    for (n8 = 0; n8 < n11; ++n8) {
                        object = arrayList.get(n8);
                        n4 = n9;
                        if (((android.support.v7.internal.view.menu.f)object).getGroupId() == n13) {
                            n4 = n9;
                            if (((android.support.v7.internal.view.menu.f)object).f()) {
                                n4 = n9 + 1;
                            }
                            ((android.support.v7.internal.view.menu.f)object).c(false);
                        }
                        n9 = n4;
                    }
                }
                n4 = n9;
                if (n12 != 0) {
                    n4 = n9 - 1;
                }
                f2.c(n12 != 0);
                n8 = n6;
                n6 = n5;
                n5 = n4;
                n9 = n3;
                n3 = n8;
            }
            n8 = n11 + 1;
            n4 = n6;
            n11 = n5;
            n6 = n9;
            n5 = n4;
            n9 = n11;
            n11 = n8;
        }
    }

    @Override
    public final boolean a(android.support.v7.internal.view.menu.f f2) {
        return f2.f();
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     */
    @Override
    public final boolean a(m m2) {
        void var5_8;
        if (!m2.hasVisibleItems()) {
            return false;
        }
        m m3 = m2;
        while (m3.i != this.c) {
            m3 = (m)m3.i;
        }
        MenuItem menuItem = m3.getItem();
        ViewGroup viewGroup = (ViewGroup)this.g;
        if (viewGroup != null) {
            int n2 = viewGroup.getChildCount();
            for (int i2 = 0; i2 < n2; ++i2) {
                m3 = viewGroup.getChildAt(i2);
                if (!(m3 instanceof k.a) || ((k.a)((Object)m3)).getItemData() != menuItem) {
                    continue;
                }
                break;
            }
        } else {
            m3 = null;
        }
        m m4 = m3;
        if (m3 == null) {
            if (this.h == null) {
                return false;
            }
            View view = this.h;
        }
        this.u = m2.getItem().getItemId();
        this.r = new a(this, this.b, m2);
        this.r.b = var5_8;
        if (!this.r.b()) {
            throw new IllegalStateException("MenuPopupHelper cannot be used without an anchor");
        }
        super.a(m2);
        return true;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public final boolean a(ViewGroup viewGroup, int n2) {
        if (viewGroup.getChildAt(n2) != this.h) return super.a(viewGroup, n2);
        return false;
    }

    public final void b() {
        if (!this.m) {
            this.l = this.b.getResources().getInteger(a.f.abc_max_action_buttons);
        }
        if (this.c != null) {
            this.c.b(true);
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final boolean c() {
        if (!this.i) return false;
        if (this.g()) return false;
        if (this.c == null) return false;
        if (this.g == null) return false;
        if (this.s != null) return false;
        if (this.c.g().isEmpty()) return false;
        this.s = new c(new e(this.b, this.c, this.h));
        ((View)this.g).post((Runnable)this.s);
        super.a((m)null);
        return true;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final boolean d() {
        if (this.s != null && this.g != null) {
            ((View)this.g).removeCallbacks((Runnable)this.s);
            this.s = null;
            return true;
        }
        e e2 = this.q;
        if (e2 == null) return false;
        e2.c();
        return true;
    }

    public final boolean e() {
        return this.d() | this.f();
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final boolean f() {
        if (this.r == null) return false;
        this.r.c();
        return true;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final boolean g() {
        if (this.q == null) return false;
        if (!this.q.d()) return false;
        return true;
    }

    private final class a
    extends i {
        final /* synthetic */ a g;
        private m h;

        /*
         * Enabled aggressive block sorting
         */
        public a(a a2, Context context, m m2) {
            boolean bl = false;
            this.g = a2;
            super(context, m2, null, false, a.a.actionOverflowMenuStyle);
            this.h = m2;
            if (!((android.support.v7.internal.view.menu.f)m2.getItem()).f()) {
                context = a2.h == null ? (View)a2.g : a2.h;
                this.b = context;
            }
            this.d = a2.t;
            int n2 = m2.size();
            int n3 = 0;
            while (true) {
                block6: {
                    boolean bl2;
                    block5: {
                        bl2 = bl;
                        if (n3 >= n2) break block5;
                        a2 = m2.getItem(n3);
                        if (!a2.isVisible() || a2.getIcon() == null) break block6;
                        bl2 = true;
                    }
                    this.e = bl2;
                    return;
                }
                ++n3;
            }
        }

        @Override
        public final void onDismiss() {
            super.onDismiss();
            this.g.r = null;
            this.g.u = 0;
        }
    }

    private final class b
    extends ActionMenuItemView.b {
        private b() {
        }

        /* synthetic */ b(byte by) {
            this();
        }

        /*
         * Enabled force condition propagation
         * Lifted jumps to return sites
         */
        @Override
        public final android.support.v7.widget.b a() {
            if (a.this.r == null) return null;
            return a.this.r.c;
        }
    }

    private final class c
    implements Runnable {
        private e b;

        public c(e e2) {
            this.b = e2;
        }

        @Override
        public final void run() {
            View view = (View)a.this.g;
            if (view != null && view.getWindowToken() != null && this.b.b()) {
                a.this.q = this.b;
            }
            a.this.s = null;
        }
    }

    private final class d
    extends TintImageView
    implements ActionMenuView.a {
        private final float[] b;

        public d(Context context) {
            super(context, null, a.a.actionOverflowButtonStyle);
            this.b = new float[2];
            this.setClickable(true);
            this.setFocusable(true);
            this.setVisibility(0);
            this.setEnabled(true);
            this.setOnTouchListener(new b.b((View)this){

                /*
                 * Enabled force condition propagation
                 * Lifted jumps to return sites
                 */
                @Override
                public final android.support.v7.widget.b a() {
                    if (a.this.q != null) return a.this.q.c;
                    return null;
                }

                @Override
                public final boolean b() {
                    a.this.c();
                    return true;
                }

                /*
                 * Enabled force condition propagation
                 * Lifted jumps to return sites
                 */
                @Override
                public final boolean c() {
                    if (a.this.s != null) {
                        return false;
                    }
                    a.this.d();
                    return true;
                }
            });
        }

        @Override
        public final boolean c() {
            return false;
        }

        @Override
        public final boolean d() {
            return false;
        }

        /*
         * Enabled force condition propagation
         * Lifted jumps to return sites
         */
        public final boolean performClick() {
            if (super.performClick()) {
                return true;
            }
            this.playSoundEffect(0);
            a.this.c();
            return true;
        }

        protected final boolean setFrame(int n2, int n3, int n4, int n5) {
            boolean bl = super.setFrame(n2, n3, n4, n5);
            Drawable drawable = this.getDrawable();
            Drawable drawable2 = this.getBackground();
            if (drawable != null && drawable2 != null) {
                float[] arrf = this.b;
                arrf[0] = drawable.getBounds().centerX();
                this.getImageMatrix().mapPoints(arrf);
                n2 = (int)arrf[0] - this.getWidth() / 2;
                android.support.v4.a.a.a.a(drawable2, n2, 0, this.getWidth() + n2, this.getHeight());
            }
            return bl;
        }
    }

    private final class e
    extends i {
        public e(Context context, android.support.v7.internal.view.menu.e e2, View view) {
            super(context, e2, view, true, a.a.actionOverflowMenuStyle);
            this.f = 0x800005;
            this.d = a.this.t;
        }

        @Override
        public final void onDismiss() {
            super.onDismiss();
            a.this.c.close();
            a.this.q = null;
        }
    }

    private final class f
    implements j.a {
        private f() {
        }

        /* synthetic */ f(byte by) {
            this();
        }

        @Override
        public final void a(android.support.v7.internal.view.menu.e e2, boolean bl) {
            j.a a2;
            if (e2 instanceof m) {
                ((m)e2).i.a(false);
            }
            if ((a2 = a.this.f) != null) {
                a2.a(e2, bl);
            }
        }

        /*
         * Enabled force condition propagation
         * Lifted jumps to return sites
         */
        @Override
        public final boolean a(android.support.v7.internal.view.menu.e e2) {
            if (e2 == null) {
                return false;
            }
            a.this.u = ((m)e2).getItem().getItemId();
            j.a a2 = a.this.f;
            if (a2 == null) return false;
            return a2.a(e2);
        }
    }
}

