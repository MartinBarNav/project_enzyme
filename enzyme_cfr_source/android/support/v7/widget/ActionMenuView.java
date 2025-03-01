/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.res.Configuration
 *  android.os.Build$VERSION
 *  android.util.AttributeSet
 *  android.view.ContextThemeWrapper
 *  android.view.Menu
 *  android.view.View
 *  android.view.View$MeasureSpec
 *  android.view.ViewDebug$ExportedProperty
 *  android.view.ViewGroup$LayoutParams
 *  android.view.accessibility.AccessibilityEvent
 */
package android.support.v7.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.os.Build;
import android.support.v7.internal.view.menu.ActionMenuItemView;
import android.support.v7.internal.view.menu.e;
import android.support.v7.internal.view.menu.f;
import android.support.v7.internal.view.menu.j;
import android.support.v7.internal.view.menu.k;
import android.support.v7.internal.widget.s;
import android.support.v7.widget.LinearLayoutCompat;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.Menu;
import android.view.View;
import android.view.ViewDebug;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;

public class ActionMenuView
extends LinearLayoutCompat
implements e.b,
k {
    android.support.v7.internal.view.menu.e a;
    android.support.v7.widget.a b;
    j.a c;
    e.a d;
    private Context e;
    private Context f;
    private int g;
    private boolean h;
    private boolean i;
    private int j;
    private int k;
    private int l;
    private e m;

    public ActionMenuView(Context context) {
        this(context, null);
    }

    public ActionMenuView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.e = context;
        this.setBaselineAligned(false);
        float f2 = context.getResources().getDisplayMetrics().density;
        this.k = (int)(56.0f * f2);
        this.l = (int)(f2 * 4.0f);
        this.f = context;
        this.g = 0;
    }

    /*
     * Enabled aggressive block sorting
     */
    static int a(View view, int n2, int n3, int n4, int n5) {
        boolean bl = false;
        c c2 = (c)view.getLayoutParams();
        int n6 = View.MeasureSpec.makeMeasureSpec((int)(View.MeasureSpec.getSize((int)n4) - n5), (int)View.MeasureSpec.getMode((int)n4));
        ActionMenuItemView actionMenuItemView = view instanceof ActionMenuItemView ? (ActionMenuItemView)view : null;
        n5 = actionMenuItemView != null && actionMenuItemView.b() ? 1 : 0;
        if (n3 > 0 && (n5 == 0 || n3 >= 2)) {
            view.measure(View.MeasureSpec.makeMeasureSpec((int)(n2 * n3), (int)Integer.MIN_VALUE), n6);
            int n7 = view.getMeasuredWidth();
            n3 = n4 = n7 / n2;
            if (n7 % n2 != 0) {
                n3 = n4 + 1;
            }
            n4 = n3;
            if (n5 != 0) {
                n4 = n3;
                if (n3 < 2) {
                    n4 = 2;
                }
            }
        } else {
            n4 = 0;
        }
        boolean bl2 = bl;
        if (!c2.a) {
            bl2 = bl;
            if (n5 != 0) {
                bl2 = true;
            }
        }
        c2.d = bl2;
        c2.b = n4;
        view.measure(View.MeasureSpec.makeMeasureSpec((int)(n4 * n2), (int)0x40000000), n6);
        return n4;
    }

    public static c a() {
        c c2 = ActionMenuView.c();
        c2.a = true;
        return c2;
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     */
    protected static c a(ViewGroup.LayoutParams object) {
        void var0_2;
        if (object == null) {
            return ActionMenuView.c();
        }
        if (object instanceof c) {
            c c2 = new c((c)((Object)object));
        } else {
            c c3 = new c((ViewGroup.LayoutParams)object);
        }
        c c4 = var0_2;
        if (var0_2.h > 0) return c4;
        var0_2.h = 16;
        return var0_2;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private boolean a(int n2) {
        boolean bl = false;
        if (n2 == 0) {
            return false;
        }
        View view = this.getChildAt(n2 - 1);
        View view2 = this.getChildAt(n2);
        boolean bl2 = bl;
        if (n2 < this.getChildCount()) {
            bl2 = bl;
            if (view instanceof a) {
                bl2 = ((a)view).d() | false;
            }
        }
        if (n2 <= 0) return bl2;
        if (!(view2 instanceof a)) return bl2;
        return ((a)view2).c() | bl2;
    }

    private c b(AttributeSet attributeSet) {
        return new c(this.getContext(), attributeSet);
    }

    private static c c() {
        c c2 = new c();
        c2.h = 16;
        return c2;
    }

    @Override
    public final /* synthetic */ LinearLayoutCompat.a a(AttributeSet attributeSet) {
        return this.b(attributeSet);
    }

    @Override
    public final void a(android.support.v7.internal.view.menu.e e2) {
        this.a = e2;
    }

    @Override
    public final boolean a(f f2) {
        return this.a.a(f2, 0);
    }

    @Override
    protected final /* synthetic */ LinearLayoutCompat.a b() {
        return ActionMenuView.c();
    }

    @Override
    protected final /* synthetic */ LinearLayoutCompat.a b(ViewGroup.LayoutParams layoutParams) {
        return ActionMenuView.a(layoutParams);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams == null) return false;
        if (!(layoutParams instanceof c)) return false;
        return true;
    }

    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return false;
    }

    @Override
    protected /* synthetic */ ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return ActionMenuView.c();
    }

    @Override
    public /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return this.b(attributeSet);
    }

    @Override
    protected /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return ActionMenuView.a(layoutParams);
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     */
    public Menu getMenu() {
        if (this.a == null) {
            void var1_4;
            Context context = this.getContext();
            this.a = new android.support.v7.internal.view.menu.e(context);
            this.a.a(new d(0));
            android.support.v7.widget.a a2 = this.b = new android.support.v7.widget.a(context);
            a2.i = true;
            a2.j = true;
            android.support.v7.widget.a a3 = this.b;
            if (this.c != null) {
                j.a a4 = this.c;
            } else {
                b b2 = new b(0);
            }
            a3.f = var1_4;
            this.a.a(this.b, this.f);
            this.b.a(this);
        }
        return this.a;
    }

    public int getPopupTheme() {
        return this.g;
    }

    public int getWindowAnimations() {
        return 0;
    }

    public void onConfigurationChanged(Configuration configuration) {
        if (Build.VERSION.SDK_INT >= 8) {
            super.onConfigurationChanged(configuration);
        }
        this.b.a(false);
        if (this.b != null && this.b.g()) {
            this.b.d();
            this.b.c();
        }
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.b != null) {
            this.b.e();
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    @Override
    protected void onLayout(boolean bl, int n2, int n3, int n4, int n5) {
        if (!this.i) {
            super.onLayout(bl, n2, n3, n4, n5);
            return;
        }
        int n6 = this.getChildCount();
        int n7 = (n5 - n3) / 2;
        int n8 = this.getDividerWidth();
        n3 = 0;
        n5 = n4 - n2 - this.getPaddingRight() - this.getPaddingLeft();
        int n9 = 0;
        bl = s.a((View)this);
        int n10 = 0;
        while (true) {
            int n11;
            block15: {
                block14: {
                    c c2;
                    View view;
                    block13: {
                        int n12;
                        if (n10 >= n6) break block13;
                        view = this.getChildAt(n10);
                        if (view.getVisibility() == 8) break block14;
                        c2 = (c)view.getLayoutParams();
                        if (c2.a) {
                            n9 = n11 = view.getMeasuredWidth();
                            if (this.a(n10)) {
                                n9 = n11 + n8;
                            }
                            int n13 = view.getMeasuredHeight();
                            if (bl) {
                                n11 = this.getPaddingLeft();
                                n11 = c2.leftMargin + n11;
                                n12 = n11 + n9;
                            } else {
                                n12 = this.getWidth() - this.getPaddingRight() - c2.rightMargin;
                                n11 = n12 - n9;
                            }
                            int n14 = n7 - n13 / 2;
                            view.layout(n11, n14, n12, n13 + n14);
                            n11 = n5 - n9;
                            n9 = 1;
                            n5 = n3;
                            n3 = n11;
                        } else {
                            n12 = view.getMeasuredWidth();
                            n11 = c2.leftMargin;
                            n11 = n5 - (c2.rightMargin + (n12 + n11));
                            this.a(n10);
                            n5 = n3 + 1;
                            n3 = n11;
                        }
                        break block15;
                    }
                    if (n6 == 1 && n9 == 0) {
                        view = this.getChildAt(0);
                        n5 = view.getMeasuredWidth();
                        n3 = view.getMeasuredHeight();
                        n2 = (n4 - n2) / 2 - n5 / 2;
                        n4 = n7 - n3 / 2;
                        view.layout(n2, n4, n5 + n2, n3 + n4);
                        return;
                    }
                    n2 = n9 != 0 ? 0 : 1;
                    n2 = (n2 = n3 - n2) > 0 ? n5 / n2 : 0;
                    n4 = Math.max(0, n2);
                    if (bl) {
                        n2 = this.getWidth() - this.getPaddingRight();
                        n3 = 0;
                        while (n3 < n6) {
                            view = this.getChildAt(n3);
                            c2 = (c)view.getLayoutParams();
                            if (view.getVisibility() != 8 && !c2.a) {
                                n5 = n2 - c2.rightMargin;
                                n9 = view.getMeasuredWidth();
                                n10 = view.getMeasuredHeight();
                                n2 = n7 - n10 / 2;
                                view.layout(n5 - n9, n2, n5, n10 + n2);
                                n2 = n5 - (c2.leftMargin + n9 + n4);
                            }
                            ++n3;
                        }
                        return;
                    }
                    n2 = this.getPaddingLeft();
                    n3 = 0;
                    while (n3 < n6) {
                        view = this.getChildAt(n3);
                        c2 = (c)view.getLayoutParams();
                        if (view.getVisibility() != 8 && !c2.a) {
                            n5 = view.getMeasuredWidth();
                            n9 = view.getMeasuredHeight();
                            n10 = n7 - n9 / 2;
                            view.layout(n2 += c2.leftMargin, n10, n2 + n5, n9 + n10);
                            n2 = c2.rightMargin + n5 + n4 + n2;
                        }
                        ++n3;
                    }
                    return;
                }
                n11 = n5;
                n5 = n3;
                n3 = n11;
            }
            n11 = n10 + 1;
            n10 = n5;
            n5 = n3;
            n3 = n10;
            n10 = n11;
        }
    }

    /*
     * Handled impossible loop by adding 'first' condition
     * Enabled aggressive block sorting
     */
    @Override
    protected void onMeasure(int n2, int n3) {
        c c2;
        int n4;
        int n5;
        int n6;
        int n7;
        int n8;
        int n9;
        int n10;
        int n11;
        block36: {
            float f2;
            long l2;
            long l3;
            int n12;
            int n13;
            boolean bl = this.i;
            boolean bl2 = View.MeasureSpec.getMode((int)n2) == 0x40000000;
            this.i = bl2;
            if (bl != this.i) {
                this.j = 0;
            }
            n11 = View.MeasureSpec.getSize((int)n2);
            if (this.i && this.a != null && n11 != this.j) {
                this.j = n11;
                this.a.b(true);
            }
            int n14 = this.getChildCount();
            if (this.i && n14 > 0) {
                n10 = View.MeasureSpec.getMode((int)n3);
                n2 = View.MeasureSpec.getSize((int)n2);
                n9 = View.MeasureSpec.getSize((int)n3);
                n11 = this.getPaddingLeft();
                n14 = this.getPaddingRight();
                n13 = this.getPaddingTop() + this.getPaddingBottom();
                n8 = ActionMenuView.getChildMeasureSpec((int)n3, (int)n13, (int)-2);
                n7 = n2 - (n11 + n14);
                n2 = n7 / this.k;
                n3 = this.k;
                if (n2 == 0) {
                    this.setMeasuredDimension(n7, 0);
                    return;
                }
            } else {
                n11 = 0;
                while (true) {
                    if (n11 >= n14) {
                        super.onMeasure(n2, n3);
                        return;
                    }
                    c c3 = (c)this.getChildAt(n11).getLayoutParams();
                    c3.rightMargin = 0;
                    c3.leftMargin = 0;
                    ++n11;
                }
            }
            n6 = this.k + n7 % n3 / n2;
            n3 = 0;
            int n15 = 0;
            int n16 = 0;
            int n17 = 0;
            n5 = 0;
            long l4 = 0L;
            n4 = this.getChildCount();
            int n18 = 0;
            while (true) {
                if (n18 >= n4) break;
                View view = this.getChildAt(n18);
                if (view.getVisibility() != 8) {
                    bl2 = view instanceof ActionMenuItemView;
                    ++n17;
                    if (bl2) {
                        view.setPadding(this.l, 0, this.l, 0);
                    }
                    c2 = (c)view.getLayoutParams();
                    c2.f = false;
                    c2.c = 0;
                    c2.b = 0;
                    c2.d = false;
                    c2.leftMargin = 0;
                    c2.rightMargin = 0;
                    bl2 = bl2 && ((ActionMenuItemView)view).b();
                    c2.e = bl2;
                    n11 = c2.a ? 1 : n2;
                    n12 = ActionMenuView.a(view, n6, n11, n8, n13);
                    n15 = Math.max(n15, n12);
                    n11 = c2.d ? n16 + 1 : n16;
                    n14 = c2.a ? 1 : n5;
                    n2 -= n12;
                    n16 = Math.max(n3, view.getMeasuredHeight());
                    if (n12 == 1) {
                        l3 = 1 << n18;
                        n3 = n16;
                        n5 = n2;
                        n16 = n11;
                        n12 = n14;
                        l4 = l3 | l4;
                        n2 = n17;
                        n14 = n5;
                        n11 = n3;
                        n5 = n12;
                        n3 = n15;
                    } else {
                        n3 = n17;
                        n5 = n15;
                        n15 = n16;
                        n17 = n2;
                        n2 = n3;
                        n3 = n5;
                        n16 = n11;
                        n5 = n14;
                        n11 = n15;
                        n14 = n17;
                    }
                } else {
                    n11 = n3;
                    n14 = n2;
                    n3 = n15;
                    n2 = n17;
                }
                ++n18;
                n17 = n2;
                n2 = n14;
                n15 = n3;
                n3 = n11;
            }
            n12 = n5 != 0 && n17 == 2 ? 1 : 0;
            n11 = 0;
            n18 = n2;
            n2 = n11;
            block2: while (true) {
                l2 = l4;
                boolean bl3 = true;
                while (true) {
                    int n19;
                    block41: {
                        block39: {
                            block37: {
                                block38: {
                                    block40: {
                                        if (!bl3 || (bl3 = false)) continue;
                                        if (n16 <= 0) break block37;
                                        l2 = l4;
                                        if (n18 <= 0) break block37;
                                        n11 = Integer.MAX_VALUE;
                                        l3 = 0L;
                                        n14 = 0;
                                        n13 = 0;
                                        if (n13 >= n4) break block38;
                                        c2 = (c)this.getChildAt(n13).getLayoutParams();
                                        if (!c2.d) break block39;
                                        if (c2.b >= n11) break block40;
                                        n14 = c2.b;
                                        l3 = 1 << n13;
                                        n11 = 1;
                                        break block41;
                                    }
                                    if (c2.b != n11) break block39;
                                    l3 |= (long)(1 << n13);
                                    n19 = n14 + 1;
                                    n14 = n11;
                                    n11 = n19;
                                    break block41;
                                }
                                l2 = l4 |= l3;
                                if (n14 <= n18) {
                                    n2 = n18;
                                    break;
                                }
                            }
                            n11 = n5 == 0 && n17 == 1 ? 1 : 0;
                            if (n18 > 0 && l2 != 0L && (n18 < n17 - 1 || n11 != 0 || n15 > 1)) {
                                float f3;
                                f2 = f3 = (float)Long.bitCount(l2);
                                if (n11 == 0) {
                                    float f4 = f3;
                                    if ((1L & l2) != 0L) {
                                        f4 = f3;
                                        if (!((c)this.getChildAt((int)0).getLayoutParams()).e) {
                                            f4 = f3 - 0.5f;
                                        }
                                    }
                                    f2 = f4;
                                    if (((long)(1 << n4 - 1) & l2) != 0L) {
                                        f2 = f4;
                                        if (!((c)this.getChildAt((int)(n4 - 1)).getLayoutParams()).e) {
                                            f2 = f4 - 0.5f;
                                        }
                                    }
                                }
                                break block2;
                            }
                            n5 = n2;
                            break block36;
                        }
                        n19 = n11;
                        n11 = n14;
                        n14 = n19;
                    }
                    n19 = n13 + 1;
                    n13 = n14;
                    n14 = n11;
                    n11 = n13;
                    n13 = n19;
                }
                for (n14 = 0; n14 < n4; ++n14) {
                    View view = this.getChildAt(n14);
                    c2 = (c)view.getLayoutParams();
                    if (((long)(1 << n14) & l3) == 0L) {
                        if (c2.b != n11 + 1) continue;
                        l4 |= (long)(1 << n14);
                        continue;
                    }
                    if (n12 != 0 && c2.e && n2 == 1) {
                        view.setPadding(this.l + n6, 0, this.l, 0);
                    }
                    ++c2.b;
                    c2.f = true;
                    --n2;
                }
                n11 = 1;
                n18 = n2;
                n2 = n11;
            }
            n11 = f2 > 0.0f ? (int)((float)(n18 * n6) / f2) : 0;
            n14 = 0;
            while (true) {
                n5 = n2;
                if (n14 >= n4) break;
                if (((long)(1 << n14) & l2) != 0L) {
                    View view = this.getChildAt(n14);
                    c2 = (c)view.getLayoutParams();
                    if (view instanceof ActionMenuItemView) {
                        c2.c = n11;
                        c2.f = true;
                        if (n14 == 0 && !c2.e) {
                            c2.leftMargin = -n11 / 2;
                        }
                        n2 = 1;
                    } else if (c2.a) {
                        c2.c = n11;
                        c2.f = true;
                        c2.rightMargin = -n11 / 2;
                        n2 = 1;
                    } else {
                        if (n14 != 0) {
                            c2.leftMargin = n11 / 2;
                        }
                        if (n14 != n4 - 1) {
                            c2.rightMargin = n11 / 2;
                        }
                    }
                }
                ++n14;
            }
        }
        if (n5 != 0) {
            for (n2 = 0; n2 < n4; ++n2) {
                c2 = this.getChildAt(n2);
                c c4 = (c)c2.getLayoutParams();
                if (!c4.f) continue;
                n11 = c4.b;
                c2.measure(View.MeasureSpec.makeMeasureSpec((int)(c4.c + n11 * n6), (int)0x40000000), n8);
            }
        }
        n2 = n10 != 0x40000000 ? n3 : n9;
        this.setMeasuredDimension(n7, n2);
    }

    public void setExpandedActionViewsExclusive(boolean bl) {
        this.b.p = bl;
    }

    public void setOnMenuItemClickListener(e e2) {
        this.m = e2;
    }

    public void setOverflowReserved(boolean bl) {
        this.h = bl;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public void setPopupTheme(int n2) {
        block4: {
            block3: {
                if (this.g == n2) break block3;
                this.g = n2;
                if (n2 != 0) break block4;
                this.f = this.e;
            }
            return;
        }
        this.f = new ContextThemeWrapper(this.e, n2);
    }

    public void setPresenter(android.support.v7.widget.a a2) {
        this.b = a2;
        this.b.a(this);
    }

    public static interface a {
        public boolean c();

        public boolean d();
    }

    private final class b
    implements j.a {
        private b() {
        }

        /* synthetic */ b(byte by) {
            this();
        }

        @Override
        public final void a(android.support.v7.internal.view.menu.e e2, boolean bl) {
        }

        @Override
        public final boolean a(android.support.v7.internal.view.menu.e e2) {
            return false;
        }
    }

    public static final class c
    extends LinearLayoutCompat.a {
        @ViewDebug.ExportedProperty
        public boolean a;
        @ViewDebug.ExportedProperty
        public int b;
        @ViewDebug.ExportedProperty
        public int c;
        @ViewDebug.ExportedProperty
        public boolean d;
        @ViewDebug.ExportedProperty
        public boolean e;
        boolean f;

        public c() {
            super(-2, -2);
            this.a = false;
        }

        public c(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public c(c c2) {
            super((ViewGroup.LayoutParams)c2);
            this.a = c2.a;
        }

        public c(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }
    }

    private final class d
    implements e.a {
        private d() {
        }

        /* synthetic */ d(byte by) {
            this();
        }

        /*
         * Enabled force condition propagation
         * Lifted jumps to return sites
         */
        @Override
        public final boolean a() {
            if (ActionMenuView.this.m == null) return false;
            if (!ActionMenuView.this.m.a()) return false;
            return true;
        }
    }

    public static interface e {
        public boolean a();
    }
}

