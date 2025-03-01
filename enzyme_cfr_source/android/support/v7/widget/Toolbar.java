/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.res.TypedArray
 *  android.graphics.drawable.Drawable
 *  android.os.Build$VERSION
 *  android.os.Parcel
 *  android.os.Parcelable
 *  android.os.Parcelable$Creator
 *  android.text.TextUtils
 *  android.text.TextUtils$TruncateAt
 *  android.util.AttributeSet
 *  android.view.ContextThemeWrapper
 *  android.view.Menu
 *  android.view.MenuInflater
 *  android.view.MenuItem
 *  android.view.MotionEvent
 *  android.view.View
 *  android.view.View$BaseSavedState
 *  android.view.View$MeasureSpec
 *  android.view.View$OnClickListener
 *  android.view.ViewGroup
 *  android.view.ViewGroup$LayoutParams
 *  android.view.ViewGroup$MarginLayoutParams
 *  android.widget.ImageButton
 *  android.widget.ImageView
 *  android.widget.TextView
 */
package android.support.v7.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.view.i;
import android.support.v4.view.k;
import android.support.v4.view.n;
import android.support.v4.view.u;
import android.support.v7.a.a;
import android.support.v7.b.a;
import android.support.v7.internal.view.menu.e;
import android.support.v7.internal.view.menu.f;
import android.support.v7.internal.view.menu.j;
import android.support.v7.internal.view.menu.m;
import android.support.v7.internal.widget.h;
import android.support.v7.internal.widget.l;
import android.support.v7.internal.widget.o;
import android.support.v7.internal.widget.q;
import android.support.v7.internal.widget.r;
import android.support.v7.internal.widget.s;
import android.support.v7.widget.ActionMenuView;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.List;

public class Toolbar
extends ViewGroup {
    private boolean A;
    private final ArrayList<View> B;
    private final int[] C;
    private c D;
    private final ActionMenuView.e E;
    private r F;
    private j.a G;
    private e.a H;
    private boolean I;
    private int J;
    private final Runnable K;
    private final o L;
    ActionMenuView a;
    public TextView b;
    public TextView c;
    View d;
    public int e;
    public int f;
    public final l g;
    a h;
    private ImageButton i;
    private ImageView j;
    private Drawable k;
    private CharSequence l;
    private ImageButton m;
    private Context n;
    private int o;
    private int p;
    private int q;
    private int r;
    private int s;
    private int t;
    private int u;
    private int v;
    private CharSequence w;
    private CharSequence x;
    private int y;
    private int z;

    public Toolbar(Context context) {
        this(context, null);
    }

    public Toolbar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, a.a.toolbarStyle);
    }

    public Toolbar(Context object, AttributeSet object2, int n2) {
        TypedArray typedArray = object.obtainStyledAttributes(object2, a.i.Toolbar, n2, 0);
        int n3 = typedArray.getResourceId(a.i.Toolbar_theme, 0);
        Context context = object;
        if (n3 != 0) {
            context = new ContextThemeWrapper((Context)object, n3);
        }
        typedArray.recycle();
        super(context, object2, n2);
        this.g = new l();
        this.v = 8388627;
        this.B = new ArrayList();
        this.C = new int[2];
        this.E = new ActionMenuView.e(){

            /*
             * Enabled force condition propagation
             * Lifted jumps to return sites
             */
            @Override
            public final boolean a() {
                if (Toolbar.this.D == null) return false;
                return Toolbar.this.D.a();
            }
        };
        this.K = new Runnable(){

            @Override
            public final void run() {
                ViewGroup viewGroup = Toolbar.this;
                if (viewGroup.a != null) {
                    viewGroup = viewGroup.a;
                    if (viewGroup.b != null) {
                        viewGroup.b.c();
                    }
                }
            }
        };
        object = android.support.v7.internal.widget.q.a(this.getContext(), object2, a.i.Toolbar, n2);
        this.e = ((q)object).e(a.i.Toolbar_titleTextAppearance, 0);
        this.f = ((q)object).e(a.i.Toolbar_subtitleTextAppearance, 0);
        n3 = a.i.Toolbar_android_gravity;
        n2 = this.v;
        this.v = ((q)object).a.getInteger(n3, n2);
        this.p = 48;
        this.u = n2 = ((q)object).b(a.i.Toolbar_titleMargins, 0);
        this.t = n2;
        this.s = n2;
        this.r = n2;
        n2 = ((q)object).b(a.i.Toolbar_titleMarginStart, -1);
        if (n2 >= 0) {
            this.r = n2;
        }
        if ((n2 = ((q)object).b(a.i.Toolbar_titleMarginEnd, -1)) >= 0) {
            this.s = n2;
        }
        if ((n2 = ((q)object).b(a.i.Toolbar_titleMarginTop, -1)) >= 0) {
            this.t = n2;
        }
        if ((n2 = ((q)object).b(a.i.Toolbar_titleMarginBottom, -1)) >= 0) {
            this.u = n2;
        }
        this.q = ((q)object).c(a.i.Toolbar_maxButtonHeight, -1);
        int n4 = ((q)object).b(a.i.Toolbar_contentInsetStart, Integer.MIN_VALUE);
        n2 = ((q)object).b(a.i.Toolbar_contentInsetEnd, Integer.MIN_VALUE);
        n3 = ((q)object).c(a.i.Toolbar_contentInsetLeft, 0);
        int n5 = ((q)object).c(a.i.Toolbar_contentInsetRight, 0);
        object2 = this.g;
        object2.h = false;
        if (n3 != Integer.MIN_VALUE) {
            object2.e = n3;
            object2.a = n3;
        }
        if (n5 != Integer.MIN_VALUE) {
            object2.f = n5;
            object2.b = n5;
        }
        if (n4 != Integer.MIN_VALUE || n2 != Integer.MIN_VALUE) {
            this.g.a(n4, n2);
        }
        this.k = ((q)object).a(a.i.Toolbar_collapseIcon);
        this.l = ((q)object).b(a.i.Toolbar_collapseContentDescription);
        object2 = ((q)object).b(a.i.Toolbar_title);
        if (!TextUtils.isEmpty((CharSequence)object2)) {
            this.setTitle((CharSequence)object2);
        }
        if (!TextUtils.isEmpty((CharSequence)(object2 = ((q)object).b(a.i.Toolbar_subtitle)))) {
            this.setSubtitle((CharSequence)object2);
        }
        this.n = this.getContext();
        this.setPopupTheme(((q)object).e(a.i.Toolbar_popupTheme, 0));
        object2 = ((q)object).a(a.i.Toolbar_navigationIcon);
        if (object2 != null) {
            this.setNavigationIcon((Drawable)object2);
        }
        if (!TextUtils.isEmpty((CharSequence)(object2 = ((q)object).b(a.i.Toolbar_navigationContentDescription)))) {
            this.setNavigationContentDescription((CharSequence)object2);
        }
        this.J = ((q)object).c(a.i.Toolbar_android_minHeight, 0);
        ((q)object).a.recycle();
        this.L = ((q)object).a();
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private int a(int n2) {
        int n3;
        int n4 = android.support.v4.view.u.e((View)this);
        n2 = n3 = android.support.v4.view.e.a(n2, n4) & 7;
        switch (n3) {
            default: {
                if (n4 != 1) return 3;
                n2 = 5;
            }
            case 1: 
            case 3: 
            case 5: {
                return n2;
            }
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    private int a(View view, int n2) {
        int n3;
        block8: {
            int n4;
            int n5;
            b b2 = (b)view.getLayoutParams();
            int n6 = view.getMeasuredHeight();
            n2 = n2 > 0 ? (n6 - n2) / 2 : 0;
            n3 = n5 = b2.a & 0x70;
            switch (n5) {
                default: {
                    n3 = this.v & 0x70;
                    break;
                }
                case 16: 
                case 48: 
                case 80: 
            }
            switch (n3) {
                default: {
                    n3 = this.getPaddingTop();
                    n4 = this.getPaddingBottom();
                    n5 = this.getHeight();
                    n2 = (n5 - n3 - n4 - n6) / 2;
                    if (n2 >= b2.topMargin) break;
                    n2 = b2.topMargin;
                    break block8;
                }
                case 48: {
                    return this.getPaddingTop() - n2;
                }
                case 80: {
                    return this.getHeight() - this.getPaddingBottom() - n6 - b2.bottomMargin - n2;
                }
            }
            if ((n5 = n5 - n4 - n6 - n2 - n3) < b2.bottomMargin) {
                n2 = Math.max(0, n2 - (b2.bottomMargin - n5));
            }
        }
        n2 += n3;
        return n2;
    }

    private int a(View view, int n2, int n3, int n4, int n5, int[] arrn) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams)view.getLayoutParams();
        int n6 = marginLayoutParams.leftMargin - arrn[0];
        int n7 = marginLayoutParams.rightMargin - arrn[1];
        int n8 = Math.max(0, n6) + Math.max(0, n7);
        arrn[0] = Math.max(0, -n6);
        arrn[1] = Math.max(0, -n7);
        view.measure(Toolbar.getChildMeasureSpec((int)n2, (int)(this.getPaddingLeft() + this.getPaddingRight() + n8 + n3), (int)marginLayoutParams.width), Toolbar.getChildMeasureSpec((int)n4, (int)(this.getPaddingTop() + this.getPaddingBottom() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + n5), (int)marginLayoutParams.height));
        return view.getMeasuredWidth() + n8;
    }

    private int a(View view, int n2, int[] arrn, int n3) {
        b b2 = (b)view.getLayoutParams();
        int n4 = b2.leftMargin - arrn[0];
        n2 = Math.max(0, n4) + n2;
        arrn[0] = Math.max(0, -n4);
        n4 = this.a(view, n3);
        n3 = view.getMeasuredWidth();
        view.layout(n2, n4, n2 + n3, view.getMeasuredHeight() + n4);
        return b2.rightMargin + n3 + n2;
    }

    protected static b a() {
        return new b();
    }

    /*
     * WARNING - void declaration
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private static b a(ViewGroup.LayoutParams object) {
        void var0_2;
        if (object instanceof b) {
            b b2 = new b((b)((Object)object));
            return var0_2;
        }
        if (object instanceof a.a) {
            b b3 = new b((a.a)((Object)object));
            return var0_2;
        }
        if (object instanceof ViewGroup.MarginLayoutParams) {
            b b4 = new b((ViewGroup.MarginLayoutParams)object);
            return var0_2;
        }
        b b5 = new b((ViewGroup.LayoutParams)object);
        return var0_2;
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     */
    private void a(View view) {
        void var2_4;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            b b2 = new b();
        } else if (!this.checkLayoutParams(layoutParams)) {
            b b3 = Toolbar.a(layoutParams);
        } else {
            b b4 = (b)layoutParams;
        }
        var2_4.b = 1;
        this.addView(view, (ViewGroup.LayoutParams)var2_4);
    }

    private void a(View view, int n2, int n3, int n4, int n5) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams)view.getLayoutParams();
        int n6 = Toolbar.getChildMeasureSpec((int)n2, (int)(this.getPaddingLeft() + this.getPaddingRight() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + n3), (int)marginLayoutParams.width);
        n3 = Toolbar.getChildMeasureSpec((int)n4, (int)(this.getPaddingTop() + this.getPaddingBottom() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + 0), (int)marginLayoutParams.height);
        n4 = View.MeasureSpec.getMode((int)n3);
        n2 = n3;
        if (n4 != 0x40000000) {
            n2 = n3;
            if (n5 >= 0) {
                n2 = n5;
                if (n4 != 0) {
                    n2 = Math.min(View.MeasureSpec.getSize((int)n3), n5);
                }
                n2 = View.MeasureSpec.makeMeasureSpec((int)n2, (int)0x40000000);
            }
        }
        view.measure(n6, n2);
    }

    /*
     * Enabled aggressive block sorting
     */
    private void a(List<View> list, int n2) {
        boolean bl = true;
        int n3 = 0;
        if (android.support.v4.view.u.e((View)this) != 1) {
            bl = false;
        }
        int n4 = this.getChildCount();
        int n5 = android.support.v4.view.e.a(n2, android.support.v4.view.u.e((View)this));
        list.clear();
        if (bl) {
            for (n2 = n4 - 1; n2 >= 0; --n2) {
                View view = this.getChildAt(n2);
                b b2 = (b)view.getLayoutParams();
                if (b2.b != 0 || !this.b(view) || this.a(b2.a) != n5) continue;
                list.add(view);
            }
            return;
        } else {
            for (n2 = n3; n2 < n4; ++n2) {
                View view = this.getChildAt(n2);
                b b3 = (b)view.getLayoutParams();
                if (b3.b != 0 || !this.b(view) || this.a(b3.a) != n5) continue;
                list.add(view);
            }
        }
    }

    private int b(View view, int n2, int[] arrn, int n3) {
        b b2 = (b)view.getLayoutParams();
        int n4 = b2.rightMargin - arrn[1];
        n2 -= Math.max(0, n4);
        arrn[1] = Math.max(0, -n4);
        n3 = this.a(view, n3);
        n4 = view.getMeasuredWidth();
        view.layout(n2 - n4, n3, n2, view.getMeasuredHeight() + n3);
        return n2 - (b2.leftMargin + n4);
    }

    private void b() {
        if (this.j == null) {
            this.j = new ImageView(this.getContext());
        }
    }

    static /* synthetic */ void b(Toolbar toolbar) {
        if (toolbar.m == null) {
            toolbar.m = new ImageButton(toolbar.getContext(), null, a.a.toolbarNavigationButtonStyle);
            toolbar.m.setImageDrawable(toolbar.k);
            toolbar.m.setContentDescription(toolbar.l);
            b b2 = new b();
            b2.a = 0x800003 | toolbar.p & 0x70;
            b2.b = 2;
            toolbar.m.setLayoutParams((ViewGroup.LayoutParams)b2);
            toolbar.m.setOnClickListener(new View.OnClickListener(){

                /*
                 * Enabled aggressive block sorting
                 */
                public final void onClick(View object) {
                    object = Toolbar.this;
                    if (((Toolbar)object).h == null) {
                        return;
                    }
                    object = object.h.b;
                    if (object == null) return;
                    ((f)object).collapseActionView();
                }
            });
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private boolean b(View view) {
        if (view == null) return false;
        if (view.getParent() != this) return false;
        if (view.getVisibility() == 8) return false;
        return true;
    }

    private static int c(View view) {
        view = (ViewGroup.MarginLayoutParams)view.getLayoutParams();
        int n2 = android.support.v4.view.i.a((ViewGroup.MarginLayoutParams)view);
        return android.support.v4.view.i.b((ViewGroup.MarginLayoutParams)view) + n2;
    }

    private void c() {
        if (this.i == null) {
            this.i = new ImageButton(this.getContext(), null, a.a.toolbarNavigationButtonStyle);
            b b2 = new b();
            b2.a = 0x800003 | this.p & 0x70;
            this.i.setLayoutParams((ViewGroup.LayoutParams)b2);
        }
    }

    private static int d(View view) {
        view = (ViewGroup.MarginLayoutParams)view.getLayoutParams();
        int n2 = view.topMargin;
        return view.bottomMargin + n2;
    }

    /*
     * Enabled aggressive block sorting
     */
    private void e(View view) {
        if (((b)view.getLayoutParams()).b != 2 && view != this.a) {
            int n2 = this.d != null ? 8 : 0;
            view.setVisibility(n2);
        }
    }

    private MenuInflater getMenuInflater() {
        return new android.support.v7.internal.view.b(this.getContext());
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private int getMinimumHeightCompat() {
        if (Build.VERSION.SDK_INT < 16) return this.J;
        return android.support.v4.view.u.h((View)this);
    }

    /*
     * Enabled aggressive block sorting
     */
    private void setChildVisibilityForExpandedActionView(boolean bl) {
        int n2 = this.getChildCount();
        int n3 = 0;
        while (n3 < n2) {
            View view = this.getChildAt(n3);
            if (((b)view.getLayoutParams()).b != 2 && view != this.a) {
                int n4 = bl ? 8 : 0;
                view.setVisibility(n4);
            }
            ++n3;
        }
        return;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (!super.checkLayoutParams(layoutParams)) return false;
        if (!(layoutParams instanceof b)) return false;
        return true;
    }

    protected /* synthetic */ ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new b();
    }

    public /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new b(this.getContext(), attributeSet);
    }

    protected /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return Toolbar.a(layoutParams);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public int getContentInsetEnd() {
        l l2 = this.g;
        if (!l2.g) return l2.b;
        return l2.a;
    }

    public int getContentInsetLeft() {
        return this.g.a;
    }

    public int getContentInsetRight() {
        return this.g.b;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public int getContentInsetStart() {
        l l2 = this.g;
        if (!l2.g) return l2.a;
        return l2.b;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public Drawable getLogo() {
        if (this.j == null) return null;
        return this.j.getDrawable();
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public CharSequence getLogoDescription() {
        if (this.j == null) return null;
        return this.j.getContentDescription();
    }

    public Menu getMenu() {
        Object object;
        if (this.a == null) {
            this.a = new ActionMenuView(this.getContext());
            this.a.setPopupTheme(this.o);
            this.a.setOnMenuItemClickListener(this.E);
            ActionMenuView actionMenuView = this.a;
            object = this.G;
            e.a a2 = this.H;
            actionMenuView.c = object;
            actionMenuView.d = a2;
            object = new b();
            ((b)object).a = 0x800005 | this.p & 0x70;
            this.a.setLayoutParams((ViewGroup.LayoutParams)object);
            this.a((View)this.a);
        }
        if (this.a.a == null) {
            object = (e)this.a.getMenu();
            if (this.h == null) {
                this.h = new a(0);
            }
            this.a.setExpandedActionViewsExclusive(true);
            ((e)object).a(this.h, this.n);
        }
        return this.a.getMenu();
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public CharSequence getNavigationContentDescription() {
        if (this.i == null) return null;
        return this.i.getContentDescription();
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public Drawable getNavigationIcon() {
        if (this.i == null) return null;
        return this.i.getDrawable();
    }

    public int getPopupTheme() {
        return this.o;
    }

    public CharSequence getSubtitle() {
        return this.x;
    }

    public CharSequence getTitle() {
        return this.w;
    }

    public h getWrapper() {
        if (this.F == null) {
            this.F = new r(this);
        }
        return this.F;
    }

    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.removeCallbacks(this.K);
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    protected void onLayout(boolean var1_1, int var2_2, int var3_3, int var4_4, int var5_5) {
        block40: {
            block44: {
                block43: {
                    block42: {
                        block41: {
                            block39: {
                                var6_6 = android.support.v4.view.u.e((View)this) == 1 ? 1 : 0;
                                var7_7 = this.getWidth();
                                var8_8 = this.getHeight();
                                var9_9 = this.getPaddingLeft();
                                var10_10 = this.getPaddingRight();
                                var11_11 = this.getPaddingTop();
                                var12_12 = this.getPaddingBottom();
                                var5_5 = var7_7 - var10_10;
                                var13_13 = this.C;
                                var13_13[1] = 0;
                                var13_13[0] = 0;
                                var14_14 = this.getMinimumHeightCompat();
                                if (this.b((View)this.i)) {
                                    if (var6_6 != 0) {
                                        var5_5 = this.b((View)this.i, var5_5, var13_13, var14_14);
                                        var2_2 = var9_9;
                                    } else {
                                        var2_2 = this.a((View)this.i, var9_9, var13_13, var14_14);
                                    }
                                } else {
                                    var2_2 = var9_9;
                                }
                                var4_4 = var5_5;
                                var3_3 = var2_2;
                                if (this.b((View)this.m)) {
                                    if (var6_6 != 0) {
                                        var4_4 = this.b((View)this.m, var5_5, var13_13, var14_14);
                                        var3_3 = var2_2;
                                    } else {
                                        var3_3 = this.a((View)this.m, var2_2, var13_13, var14_14);
                                        var4_4 = var5_5;
                                    }
                                }
                                var2_2 = var4_4;
                                var5_5 = var3_3;
                                if (this.b((View)this.a)) {
                                    if (var6_6 != 0) {
                                        var5_5 = this.a((View)this.a, var3_3, var13_13, var14_14);
                                        var2_2 = var4_4;
                                    } else {
                                        var2_2 = this.b((View)this.a, var4_4, var13_13, var14_14);
                                        var5_5 = var3_3;
                                    }
                                }
                                var13_13[0] = Math.max(0, this.getContentInsetLeft() - var5_5);
                                var13_13[1] = Math.max(0, this.getContentInsetRight() - (var7_7 - var10_10 - var2_2));
                                var4_4 = Math.max(var5_5, this.getContentInsetLeft());
                                var3_3 = var5_5 = Math.min(var2_2, var7_7 - var10_10 - this.getContentInsetRight());
                                var2_2 = var4_4;
                                if (this.b(this.d)) {
                                    if (var6_6 != 0) {
                                        var3_3 = this.b(this.d, var5_5, var13_13, var14_14);
                                        var2_2 = var4_4;
                                    } else {
                                        var2_2 = this.a(this.d, var4_4, var13_13, var14_14);
                                        var3_3 = var5_5;
                                    }
                                }
                                if (this.b((View)this.j)) {
                                    if (var6_6 != 0) {
                                        var3_3 = this.b((View)this.j, var3_3, var13_13, var14_14);
                                        var4_4 = var2_2;
                                    } else {
                                        var4_4 = this.a((View)this.j, var2_2, var13_13, var14_14);
                                    }
                                } else {
                                    var4_4 = var2_2;
                                }
                                var15_15 = this.b((View)this.b);
                                var1_1 = this.b((View)this.c);
                                var2_2 = 0;
                                if (var15_15) {
                                    var16_16 /* !! */  = (b)this.b.getLayoutParams();
                                    var2_2 = var16_16 /* !! */ .topMargin;
                                    var5_5 = this.b.getMeasuredHeight();
                                    var2_2 = var16_16 /* !! */ .bottomMargin + (var2_2 + var5_5) + 0;
                                }
                                if (var1_1) {
                                    var16_16 /* !! */  = (b)this.c.getLayoutParams();
                                    var5_5 = var16_16 /* !! */ .topMargin;
                                    var17_17 = this.c.getMeasuredHeight();
                                    var18_18 = var16_16 /* !! */ .bottomMargin + (var5_5 + var17_17) + var2_2;
                                } else {
                                    var18_18 = var2_2;
                                }
                                if (var15_15) break block39;
                                var5_5 = var3_3;
                                var2_2 = var4_4;
                                if (!var1_1) break block40;
                            }
                            var16_16 /* !! */  = var15_15 != false ? this.b : this.c;
                            var19_19 /* !! */  = var1_1 != false ? this.c : this.b;
                            var16_16 /* !! */  = (b)var16_16 /* !! */ .getLayoutParams();
                            var19_19 /* !! */  = (b)var19_19 /* !! */ .getLayoutParams();
                            var17_17 = var15_15 != false && this.b.getMeasuredWidth() > 0 || var1_1 != false && this.c.getMeasuredWidth() > 0 ? 1 : 0;
                            switch (this.v & 112) {
                                default: {
                                    var2_2 = (var8_8 - var11_11 - var12_12 - var18_18) / 2;
                                    if (var2_2 >= var16_16 /* !! */ .topMargin + this.t) ** GOTO lbl94
                                    var2_2 = var16_16 /* !! */ .topMargin + this.t;
                                    ** GOTO lbl97
                                }
                                case 48: {
                                    var2_2 = this.getPaddingTop();
                                    var2_2 = var16_16 /* !! */ .topMargin + var2_2 + this.t;
                                    break block41;
                                }
lbl94:
                                // 1 sources

                                var5_5 = var8_8 - var12_12 - var18_18 - var2_2 - var11_11;
                                if (var5_5 < var16_16 /* !! */ .bottomMargin + this.u) {
                                    var2_2 = Math.max(0, var2_2 - (var19_19 /* !! */ .bottomMargin + this.u - var5_5));
                                }
lbl97:
                                // 4 sources

                                var2_2 = var11_11 + var2_2;
                                break block41;
                                case 80: 
                            }
                            var2_2 = var8_8 - var12_12 - var19_19 /* !! */ .bottomMargin - this.u - var18_18;
                        }
                        if (var6_6 == 0) break block42;
                        var5_5 = var17_17 != 0 ? this.r : 0;
                        var3_3 -= Math.max(0, var5_5 -= var13_13[1]);
                        var13_13[1] = Math.max(0, -var5_5);
                        if (!var15_15) break block43;
                        var16_16 /* !! */  = (b)this.b.getLayoutParams();
                        var5_5 = var3_3 - this.b.getMeasuredWidth();
                        var18_18 = this.b.getMeasuredHeight() + var2_2;
                        this.b.layout(var5_5, var2_2, var3_3, var18_18);
                        var6_6 = this.s;
                        var2_2 = var18_18 + var16_16 /* !! */ .bottomMargin;
                        var5_5 -= var6_6;
                        break block44;
                    }
                    var5_5 = var17_17 != 0 ? this.r : 0;
                    var4_4 += Math.max(0, var5_5 -= var13_13[0]);
                    var13_13[0] = Math.max(0, -var5_5);
                    if (var15_15) {
                        var16_16 /* !! */  = (b)this.b.getLayoutParams();
                        var6_6 = this.b.getMeasuredWidth() + var4_4;
                        var5_5 = this.b.getMeasuredHeight() + var2_2;
                        this.b.layout(var4_4, var2_2, var6_6, var5_5);
                        var18_18 = this.s;
                        var2_2 = var16_16 /* !! */ .bottomMargin;
                        var6_6 += var18_18;
                        var2_2 += var5_5;
                    } else {
                        var6_6 = var4_4;
                    }
                    if (var1_1) {
                        var16_16 /* !! */  = (b)this.c.getLayoutParams();
                        var18_18 = var2_2 + var16_16 /* !! */ .topMargin;
                        var2_2 = this.c.getMeasuredWidth() + var4_4;
                        var5_5 = this.c.getMeasuredHeight();
                        this.c.layout(var4_4, var18_18, var2_2, var5_5 + var18_18);
                        var18_18 = this.s;
                        var5_5 = var16_16 /* !! */ .bottomMargin;
                        var18_18 += var2_2;
                    } else {
                        var18_18 = var4_4;
                    }
                    var5_5 = var3_3;
                    var2_2 = var4_4;
                    if (var17_17 != 0) {
                        var2_2 = Math.max(var6_6, var18_18);
                        var5_5 = var3_3;
                    }
                    break block40;
                }
                var5_5 = var3_3;
            }
            if (var1_1) {
                var16_16 /* !! */  = (b)this.c.getLayoutParams();
                var18_18 = var16_16 /* !! */ .topMargin + var2_2;
                var6_6 = this.c.getMeasuredWidth();
                var2_2 = this.c.getMeasuredHeight();
                this.c.layout(var3_3 - var6_6, var18_18, var3_3, var2_2 + var18_18);
                var2_2 = this.s;
                var6_6 = var16_16 /* !! */ .bottomMargin;
                var2_2 = var3_3 - var2_2;
            } else {
                var2_2 = var3_3;
            }
            var2_2 = var17_17 != 0 ? Math.min(var5_5, var2_2) : var3_3;
            var5_5 = var2_2;
            var2_2 = var4_4;
        }
        this.a(this.B, 3);
        var4_4 = this.B.size();
        for (var3_3 = 0; var3_3 < var4_4; ++var3_3) {
            var2_2 = this.a(this.B.get(var3_3), var2_2, var13_13, var14_14);
        }
        this.a(this.B, 5);
        var17_17 = this.B.size();
        var3_3 = var5_5;
        for (var4_4 = 0; var4_4 < var17_17; ++var4_4) {
            var3_3 = this.b(this.B.get(var4_4), var3_3, var13_13, var14_14);
        }
        this.a(this.B, 1);
        var16_16 /* !! */  = this.B;
        var6_6 = var13_13[0];
        var17_17 = var13_13[1];
        var18_18 = var16_16 /* !! */ .size();
        var4_4 = 0;
        for (var5_5 = 0; var5_5 < var18_18; ++var5_5, var4_4 += var8_8 + var11_11 + var12_12) {
            var20_20 = (View)var16_16 /* !! */ .get(var5_5);
            var19_19 /* !! */  = (b)var20_20.getLayoutParams();
            var6_6 = var19_19 /* !! */ .leftMargin - var6_6;
            var17_17 = var19_19 /* !! */ .rightMargin - var17_17;
            var11_11 = Math.max(0, var6_6);
            var12_12 = Math.max(0, var17_17);
            var6_6 = Math.max(0, -var6_6);
            var17_17 = Math.max(0, -var17_17);
            var8_8 = var20_20.getMeasuredWidth();
        }
        var5_5 = (var7_7 - var9_9 - var10_10) / 2 + var9_9 - var4_4 / 2;
        var4_4 = var5_5 + var4_4;
        if (var5_5 >= var2_2) {
            var2_2 = var5_5;
            if (var4_4 > var3_3) {
                var2_2 = var5_5 - (var4_4 - var3_3);
            }
        }
        var5_5 = this.B.size();
        var4_4 = 0;
        var3_3 = var2_2;
        var2_2 = var4_4;
        while (true) {
            if (var2_2 >= var5_5) {
                this.B.clear();
                return;
            }
            var3_3 = this.a(this.B.get(var2_2), var3_3, var13_13, var14_14);
            ++var2_2;
        }
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    protected void onMeasure(int var1_1, int var2_2) {
        var3_3 = this.C;
        if (android.support.v7.internal.widget.s.a((View)this)) {
            var4_6 = 0;
            var5_7 = 1;
        } else {
            var4_6 = 1;
            var5_7 = 0;
        }
        var6_8 = 0;
        if (this.b((View)this.i)) {
            this.a((View)this.i, var1_1, 0, var2_2, this.q);
            var6_8 = this.i.getMeasuredWidth() + Toolbar.c((View)this.i);
            var7_9 = Math.max(0, this.i.getMeasuredHeight() + Toolbar.d((View)this.i));
            var8_10 = android.support.v7.internal.widget.s.a(0, android.support.v4.view.u.f((View)this.i));
        } else {
            var8_10 = 0;
            var7_9 = 0;
        }
        var9_11 = var6_8;
        var10_12 = var8_10;
        var6_8 = var7_9;
        if (this.b((View)this.m)) {
            this.a((View)this.m, var1_1, 0, var2_2, this.q);
            var9_11 = this.m.getMeasuredWidth() + Toolbar.c((View)this.m);
            var6_8 = Math.max(var7_9, this.m.getMeasuredHeight() + Toolbar.d((View)this.m));
            var10_12 = android.support.v7.internal.widget.s.a(var8_10, android.support.v4.view.u.f((View)this.m));
        }
        var8_10 = this.getContentInsetStart();
        var11_13 = Math.max(var8_10, var9_11) + 0;
        var3_3[var5_7] = Math.max(0, var8_10 - var9_11);
        var5_7 = 0;
        var8_10 = var10_12;
        var7_9 = var6_8;
        if (this.b((View)this.a)) {
            this.a((View)this.a, var1_1, var11_13, var2_2, this.q);
            var5_7 = this.a.getMeasuredWidth() + Toolbar.c((View)this.a);
            var7_9 = Math.max(var6_8, this.a.getMeasuredHeight() + Toolbar.d((View)this.a));
            var8_10 = android.support.v7.internal.widget.s.a(var10_12, android.support.v4.view.u.f((View)this.a));
        }
        var6_8 = this.getContentInsetEnd();
        var9_11 = var11_13 + Math.max(var6_8, var5_7);
        var3_3[var4_6] = Math.max(0, var6_8 - var5_7);
        var5_7 = var9_11;
        var6_8 = var8_10;
        var10_12 = var7_9;
        if (this.b(this.d)) {
            var5_7 = var9_11 + this.a(this.d, var1_1, var9_11, var2_2, 0, var3_3);
            var10_12 = Math.max(var7_9, this.d.getMeasuredHeight() + Toolbar.d(this.d));
            var6_8 = android.support.v7.internal.widget.s.a(var8_10, android.support.v4.view.u.f(this.d));
        }
        var8_10 = var5_7;
        var4_6 = var6_8;
        var7_9 = var10_12;
        if (this.b((View)this.j)) {
            var8_10 = var5_7 + this.a((View)this.j, var1_1, var5_7, var2_2, 0, var3_3);
            var7_9 = Math.max(var10_12, this.j.getMeasuredHeight() + Toolbar.d((View)this.j));
            var4_6 = android.support.v7.internal.widget.s.a(var6_8, android.support.v4.view.u.f((View)this.j));
        }
        var9_11 = this.getChildCount();
        var5_7 = 0;
        var6_8 = var4_6;
        var10_12 = var7_9;
        var7_9 = var5_7;
        var5_7 = var8_10;
        while (var7_9 < var9_11) {
            var12_14 = this.getChildAt(var7_9);
            if (((b)var12_14.getLayoutParams()).b == 0 && this.b(var12_14)) {
                var5_7 += this.a(var12_14, var1_1, var5_7, var2_2, 0, var3_3);
                var8_10 = Math.max(var10_12, var12_14.getMeasuredHeight() + Toolbar.d(var12_14));
                var10_12 = android.support.v7.internal.widget.s.a(var6_8, android.support.v4.view.u.f(var12_14));
                var6_8 = var8_10;
            } else {
                var8_10 = var10_12;
                var10_12 = var6_8;
                var6_8 = var8_10;
            }
            ++var7_9;
            var8_10 = var10_12;
            var10_12 = var6_8;
            var6_8 = var8_10;
        }
        var4_6 = 0;
        var7_9 = 0;
        var13_15 = this.t + this.u;
        var14_16 = this.r + this.s;
        var8_10 = var6_8;
        if (this.b((View)this.b)) {
            this.a((View)this.b, var1_1, var5_7 + var14_16, var2_2, var13_15, var3_3);
            var8_10 = this.b.getMeasuredWidth();
            var4_6 = Toolbar.c((View)this.b) + var8_10;
            var7_9 = this.b.getMeasuredHeight() + Toolbar.d((View)this.b);
            var8_10 = android.support.v7.internal.widget.s.a(var6_8, android.support.v4.view.u.f((View)this.b));
        }
        var11_13 = var7_9;
        var9_11 = var4_6;
        var6_8 = var8_10;
        if (this.b((View)this.c)) {
            var9_11 = Math.max(var4_6, this.a((View)this.c, var1_1, var5_7 + var14_16, var2_2, var13_15 + var7_9, var3_3));
            var11_13 = var7_9 + (this.c.getMeasuredHeight() + Toolbar.d((View)this.c));
            var6_8 = android.support.v7.internal.widget.s.a(var8_10, android.support.v4.view.u.f((View)this.c));
        }
        var4_6 = Math.max(var10_12, var11_13);
        var11_13 = this.getPaddingLeft();
        var10_12 = this.getPaddingRight();
        var8_10 = this.getPaddingTop();
        var7_9 = this.getPaddingBottom();
        var10_12 = android.support.v4.view.u.a(Math.max(var9_11 + var5_7 + (var11_13 + var10_12), this.getSuggestedMinimumWidth()), var1_1, -16777216 & var6_8);
        var2_2 = android.support.v4.view.u.a(Math.max(var4_6 + (var8_10 + var7_9), this.getSuggestedMinimumHeight()), var2_2, var6_8 << 16);
        if (this.I) {
            var6_8 = this.getChildCount();
        } else {
            var1_1 = 0;
lbl105:
            // 3 sources

            while (true) {
                if (var1_1 != 0) {
                    var2_2 = 0;
                }
                this.setMeasuredDimension(var10_12, var2_2);
                return;
            }
        }
        for (var1_1 = 0; var1_1 < var6_8; ++var1_1) {
            var3_5 = this.getChildAt(var1_1);
            if (!this.b(var3_5) || var3_5.getMeasuredWidth() <= 0 || var3_5.getMeasuredHeight() <= 0) continue;
            var1_1 = 0;
            ** GOTO lbl105
        }
        var1_1 = 1;
        ** while (true)
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     */
    protected void onRestoreInstanceState(Parcelable object) {
        MenuItem menuItem;
        void var1_3;
        SavedState savedState = (SavedState)((Object)object);
        super.onRestoreInstanceState(savedState.getSuperState());
        if (this.a != null) {
            e e2 = this.a.a;
        } else {
            Object var1_5 = null;
        }
        if (savedState.a != 0 && this.h != null && var1_3 != null && (menuItem = var1_3.findItem(savedState.a)) != null) {
            android.support.v4.view.k.a(menuItem);
        }
        if (savedState.b) {
            this.removeCallbacks(this.K);
            this.post(this.K);
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    public void onRtlPropertiesChanged(int n2) {
        boolean bl = true;
        if (Build.VERSION.SDK_INT >= 17) {
            super.onRtlPropertiesChanged(n2);
        }
        l l2 = this.g;
        if (n2 != 1) {
            bl = false;
        }
        if (bl == l2.g) return;
        l2.g = bl;
        if (!l2.h) {
            l2.a = l2.e;
            l2.b = l2.f;
            return;
        }
        if (bl) {
            n2 = l2.d != Integer.MIN_VALUE ? l2.d : l2.e;
            l2.a = n2;
            n2 = l2.c != Integer.MIN_VALUE ? l2.c : l2.f;
            l2.b = n2;
            return;
        }
        n2 = l2.c != Integer.MIN_VALUE ? l2.c : l2.e;
        l2.a = n2;
        n2 = l2.d != Integer.MIN_VALUE ? l2.d : l2.f;
        l2.b = n2;
    }

    /*
     * Enabled aggressive block sorting
     */
    protected Parcelable onSaveInstanceState() {
        SavedState savedState;
        boolean bl;
        block5: {
            block4: {
                bl = true;
                savedState = new SavedState(super.onSaveInstanceState());
                if (this.h != null && this.h.b != null) {
                    savedState.a = this.h.b.getItemId();
                }
                if (this.a == null) break block4;
                ActionMenuView actionMenuView = this.a;
                boolean bl2 = actionMenuView.b != null && actionMenuView.b.g();
                if (bl2) break block5;
            }
            bl = false;
        }
        savedState.b = bl;
        return savedState;
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        int n2 = android.support.v4.view.n.a(motionEvent);
        if (n2 == 0) {
            this.A = false;
        }
        if (!this.A) {
            boolean bl = super.onTouchEvent(motionEvent);
            if (n2 == 0 && !bl) {
                this.A = true;
            }
        }
        if (n2 == 1 || n2 == 3) {
            this.A = false;
        }
        return true;
    }

    public void setCollapsible(boolean bl) {
        this.I = bl;
        this.requestLayout();
    }

    public void setLogo(int n2) {
        this.setLogo(this.L.a(n2));
    }

    /*
     * Enabled aggressive block sorting
     */
    public void setLogo(Drawable drawable) {
        if (drawable != null) {
            this.b();
            if (this.j.getParent() == null) {
                this.a((View)this.j);
                this.e((View)this.j);
            }
        } else if (this.j != null && this.j.getParent() != null) {
            this.removeView((View)this.j);
        }
        if (this.j != null) {
            this.j.setImageDrawable(drawable);
        }
    }

    public void setLogoDescription(int n2) {
        this.setLogoDescription(this.getContext().getText(n2));
    }

    public void setLogoDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty((CharSequence)charSequence)) {
            this.b();
        }
        if (this.j != null) {
            this.j.setContentDescription(charSequence);
        }
    }

    public void setMinimumHeight(int n2) {
        this.J = n2;
        super.setMinimumHeight(n2);
    }

    /*
     * Enabled aggressive block sorting
     */
    public void setNavigationContentDescription(int n2) {
        CharSequence charSequence = n2 != 0 ? this.getContext().getText(n2) : null;
        this.setNavigationContentDescription(charSequence);
    }

    public void setNavigationContentDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty((CharSequence)charSequence)) {
            this.c();
        }
        if (this.i != null) {
            this.i.setContentDescription(charSequence);
        }
    }

    public void setNavigationIcon(int n2) {
        this.setNavigationIcon(this.L.a(n2));
    }

    /*
     * Enabled aggressive block sorting
     */
    public void setNavigationIcon(Drawable drawable) {
        if (drawable != null) {
            this.c();
            if (this.i.getParent() == null) {
                this.a((View)this.i);
                this.e((View)this.i);
            }
        } else if (this.i != null && this.i.getParent() != null) {
            this.removeView((View)this.i);
        }
        if (this.i != null) {
            this.i.setImageDrawable(drawable);
        }
    }

    public void setNavigationOnClickListener(View.OnClickListener onClickListener) {
        this.c();
        this.i.setOnClickListener(onClickListener);
    }

    public void setOnMenuItemClickListener(c c2) {
        this.D = c2;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public void setPopupTheme(int n2) {
        block4: {
            block3: {
                if (this.o == n2) break block3;
                this.o = n2;
                if (n2 != 0) break block4;
                this.n = this.getContext();
            }
            return;
        }
        this.n = new ContextThemeWrapper(this.getContext(), n2);
    }

    public void setSubtitle(int n2) {
        this.setSubtitle(this.getContext().getText(n2));
    }

    /*
     * Enabled aggressive block sorting
     */
    public void setSubtitle(CharSequence charSequence) {
        if (!TextUtils.isEmpty((CharSequence)charSequence)) {
            if (this.c == null) {
                Context context = this.getContext();
                this.c = new TextView(context);
                this.c.setSingleLine();
                this.c.setEllipsize(TextUtils.TruncateAt.END);
                if (this.f != 0) {
                    this.c.setTextAppearance(context, this.f);
                }
                if (this.z != 0) {
                    this.c.setTextColor(this.z);
                }
            }
            if (this.c.getParent() == null) {
                this.a((View)this.c);
                this.e((View)this.c);
            }
        } else if (this.c != null && this.c.getParent() != null) {
            this.removeView((View)this.c);
        }
        if (this.c != null) {
            this.c.setText(charSequence);
        }
        this.x = charSequence;
    }

    public void setSubtitleTextColor(int n2) {
        this.z = n2;
        if (this.c != null) {
            this.c.setTextColor(n2);
        }
    }

    public void setTitle(int n2) {
        this.setTitle(this.getContext().getText(n2));
    }

    /*
     * Enabled aggressive block sorting
     */
    public void setTitle(CharSequence charSequence) {
        if (!TextUtils.isEmpty((CharSequence)charSequence)) {
            if (this.b == null) {
                Context context = this.getContext();
                this.b = new TextView(context);
                this.b.setSingleLine();
                this.b.setEllipsize(TextUtils.TruncateAt.END);
                if (this.e != 0) {
                    this.b.setTextAppearance(context, this.e);
                }
                if (this.y != 0) {
                    this.b.setTextColor(this.y);
                }
            }
            if (this.b.getParent() == null) {
                this.a((View)this.b);
                this.e((View)this.b);
            }
        } else if (this.b != null && this.b.getParent() != null) {
            this.removeView((View)this.b);
        }
        if (this.b != null) {
            this.b.setText(charSequence);
        }
        this.w = charSequence;
    }

    public void setTitleTextColor(int n2) {
        this.y = n2;
        if (this.b != null) {
            this.b.setTextColor(n2);
        }
    }

    static class SavedState
    extends View.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new Parcelable.Creator<SavedState>(){

            public final /* synthetic */ Object createFromParcel(Parcel parcel) {
                return new SavedState(parcel);
            }
        };
        public int a;
        public boolean b;

        /*
         * Enabled aggressive block sorting
         */
        public SavedState(Parcel parcel) {
            super(parcel);
            this.a = parcel.readInt();
            boolean bl = parcel.readInt() != 0;
            this.b = bl;
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        /*
         * Enabled aggressive block sorting
         */
        public void writeToParcel(Parcel parcel, int n2) {
            super.writeToParcel(parcel, n2);
            parcel.writeInt(this.a);
            n2 = this.b ? 1 : 0;
            parcel.writeInt(n2);
        }
    }

    private final class a
    implements j {
        e a;
        f b;

        private a() {
        }

        /* synthetic */ a(byte by) {
            this();
        }

        @Override
        public final void a(Context context, e e2) {
            if (this.a != null && this.b != null) {
                this.a.b(this.b);
            }
            this.a = e2;
        }

        @Override
        public final void a(e e2, boolean bl) {
        }

        /*
         * Enabled aggressive block sorting
         */
        @Override
        public final void a(boolean bl) {
            boolean bl2 = false;
            if (this.b == null) return;
            boolean bl3 = bl2;
            if (this.a != null) {
                int n2 = this.a.size();
                int n3 = 0;
                while (true) {
                    bl3 = bl2;
                    if (n3 >= n2) break;
                    if (this.a.getItem(n3) == this.b) {
                        return;
                    }
                    ++n3;
                }
            }
            if (bl3) return;
            this.c(this.b);
        }

        @Override
        public final boolean a() {
            return false;
        }

        @Override
        public final boolean a(m m2) {
            return false;
        }

        @Override
        public final boolean b(f f2) {
            Toolbar.b(Toolbar.this);
            if (Toolbar.this.m.getParent() != Toolbar.this) {
                Toolbar.this.addView((View)Toolbar.this.m);
            }
            Toolbar.this.d = f2.getActionView();
            this.b = f2;
            if (Toolbar.this.d.getParent() != Toolbar.this) {
                b b2 = Toolbar.a();
                b2.a = 0x800003 | Toolbar.this.p & 0x70;
                b2.b = 2;
                Toolbar.this.d.setLayoutParams((ViewGroup.LayoutParams)b2);
                Toolbar.this.addView(Toolbar.this.d);
            }
            Toolbar.this.setChildVisibilityForExpandedActionView(true);
            Toolbar.this.requestLayout();
            f2.d(true);
            if (Toolbar.this.d instanceof android.support.v7.c.a) {
                ((android.support.v7.c.a)Toolbar.this.d).a();
            }
            return true;
        }

        @Override
        public final boolean c(f f2) {
            if (Toolbar.this.d instanceof android.support.v7.c.a) {
                ((android.support.v7.c.a)Toolbar.this.d).a_();
            }
            Toolbar.this.removeView(Toolbar.this.d);
            Toolbar.this.removeView((View)Toolbar.this.m);
            Toolbar.this.d = null;
            Toolbar.this.setChildVisibilityForExpandedActionView(false);
            this.b = null;
            Toolbar.this.requestLayout();
            f2.d(false);
            return true;
        }
    }

    public static final class b
    extends a.a {
        int b = 0;

        public b() {
            this.a = 8388627;
        }

        public b(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public b(a.a a2) {
            super(a2);
        }

        public b(b b2) {
            super(b2);
            this.b = b2.b;
        }

        public b(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public b(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super((ViewGroup.LayoutParams)marginLayoutParams);
            this.leftMargin = marginLayoutParams.leftMargin;
            this.topMargin = marginLayoutParams.topMargin;
            this.rightMargin = marginLayoutParams.rightMargin;
            this.bottomMargin = marginLayoutParams.bottomMargin;
        }
    }

    public static interface c {
        public boolean a();
    }
}

