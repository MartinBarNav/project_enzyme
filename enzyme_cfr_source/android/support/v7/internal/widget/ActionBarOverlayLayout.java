/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.res.Configuration
 *  android.content.res.TypedArray
 *  android.graphics.Canvas
 *  android.graphics.Rect
 *  android.graphics.drawable.Drawable
 *  android.os.Build$VERSION
 *  android.util.AttributeSet
 *  android.view.View
 *  android.view.ViewGroup
 *  android.view.ViewGroup$LayoutParams
 *  android.view.ViewGroup$MarginLayoutParams
 */
package android.support.v7.internal.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.support.v4.f.j;
import android.support.v4.view.ae;
import android.support.v4.view.ah;
import android.support.v4.view.ai;
import android.support.v4.view.u;
import android.support.v7.b.a;
import android.support.v7.internal.widget.ActionBarContainer;
import android.support.v7.internal.widget.g;
import android.support.v7.internal.widget.h;
import android.support.v7.internal.widget.s;
import android.support.v7.widget.Toolbar;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;

public class ActionBarOverlayLayout
extends ViewGroup {
    static final int[] a = new int[]{a.a.actionBarSize, 16842841};
    private final ah A;
    private final ah B;
    private final Runnable C;
    private final Runnable D;
    private int b;
    private int c = 0;
    private g d;
    private ActionBarContainer e;
    private ActionBarContainer f;
    private h g;
    private Drawable h;
    private boolean i;
    private boolean j;
    private boolean k;
    private boolean l;
    private boolean m;
    private int n;
    private int o;
    private final Rect p = new Rect();
    private final Rect q = new Rect();
    private final Rect r = new Rect();
    private final Rect s = new Rect();
    private final Rect t = new Rect();
    private final Rect u = new Rect();
    private a v;
    private final int w;
    private j x;
    private ae y;
    private ae z;

    public ActionBarOverlayLayout(Context context) {
        super(context);
        this.w = 600;
        this.A = new ai(){

            @Override
            public final void b(View view) {
                ActionBarOverlayLayout.a(ActionBarOverlayLayout.this, null);
                ActionBarOverlayLayout.a(ActionBarOverlayLayout.this);
            }

            @Override
            public final void c(View view) {
                ActionBarOverlayLayout.a(ActionBarOverlayLayout.this, null);
                ActionBarOverlayLayout.a(ActionBarOverlayLayout.this);
            }
        };
        this.B = new ai(){

            @Override
            public final void b(View view) {
                ActionBarOverlayLayout.b(ActionBarOverlayLayout.this, null);
                ActionBarOverlayLayout.a(ActionBarOverlayLayout.this);
            }

            @Override
            public final void c(View view) {
                ActionBarOverlayLayout.b(ActionBarOverlayLayout.this, null);
                ActionBarOverlayLayout.a(ActionBarOverlayLayout.this);
            }
        };
        this.C = new Runnable(){

            @Override
            public final void run() {
                ActionBarOverlayLayout.this.b();
                ActionBarOverlayLayout.a(ActionBarOverlayLayout.this, android.support.v4.view.u.i((View)ActionBarOverlayLayout.this.f).a(0.0f).a(ActionBarOverlayLayout.this.A));
                if (ActionBarOverlayLayout.this.e != null && ActionBarOverlayLayout.this.e.getVisibility() != 8) {
                    ActionBarOverlayLayout.b(ActionBarOverlayLayout.this, android.support.v4.view.u.i((View)ActionBarOverlayLayout.this.e).a(0.0f).a(ActionBarOverlayLayout.this.B));
                }
            }
        };
        this.D = new Runnable(){

            @Override
            public final void run() {
                ActionBarOverlayLayout.this.b();
                ActionBarOverlayLayout.a(ActionBarOverlayLayout.this, android.support.v4.view.u.i((View)ActionBarOverlayLayout.this.f).a((float)(-ActionBarOverlayLayout.this.f.getHeight())).a(ActionBarOverlayLayout.this.A));
                if (ActionBarOverlayLayout.this.e != null && ActionBarOverlayLayout.this.e.getVisibility() != 8) {
                    ActionBarOverlayLayout.b(ActionBarOverlayLayout.this, android.support.v4.view.u.i((View)ActionBarOverlayLayout.this.e).a((float)ActionBarOverlayLayout.this.e.getHeight()).a(ActionBarOverlayLayout.this.B));
                }
            }
        };
        this.a(context);
    }

    public ActionBarOverlayLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.w = 600;
        this.A = new /* invalid duplicate definition of identical inner class */;
        this.B = new /* invalid duplicate definition of identical inner class */;
        this.C = new /* invalid duplicate definition of identical inner class */;
        this.D = new /* invalid duplicate definition of identical inner class */;
        this.a(context);
    }

    static /* synthetic */ ae a(ActionBarOverlayLayout actionBarOverlayLayout, ae ae2) {
        actionBarOverlayLayout.y = ae2;
        return ae2;
    }

    /*
     * Enabled aggressive block sorting
     */
    private void a() {
        if (this.d == null) {
            this.d = (g)this.findViewById(a.e.action_bar_activity_content);
            this.f = (ActionBarContainer)this.findViewById(a.e.action_bar_container);
            Object object = this.findViewById(a.e.action_bar);
            if (object instanceof h) {
                object = (h)object;
            } else {
                if (!(object instanceof Toolbar)) {
                    throw new IllegalStateException("Can't make a decor toolbar out of " + object.getClass().getSimpleName());
                }
                object = ((Toolbar)((Object)object)).getWrapper();
            }
            this.g = object;
            this.e = (ActionBarContainer)this.findViewById(a.e.split_action_bar);
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    private void a(Context context) {
        boolean bl = true;
        TypedArray typedArray = this.getContext().getTheme().obtainStyledAttributes(a);
        this.b = typedArray.getDimensionPixelSize(0, 0);
        this.h = typedArray.getDrawable(1);
        boolean bl2 = this.h == null;
        this.setWillNotDraw(bl2);
        typedArray.recycle();
        bl2 = context.getApplicationInfo().targetSdkVersion < 19 ? bl : false;
        this.i = bl2;
        this.x = new j(context);
    }

    static /* synthetic */ boolean a(ActionBarOverlayLayout actionBarOverlayLayout) {
        actionBarOverlayLayout.m = false;
        return false;
    }

    private static boolean a(View object, Rect rect, boolean bl, boolean bl2) {
        boolean bl3 = true;
        boolean bl4 = false;
        object = (b)object.getLayoutParams();
        if (object.leftMargin != rect.left) {
            object.leftMargin = rect.left;
            bl4 = true;
        }
        boolean bl5 = bl4;
        if (bl) {
            bl5 = bl4;
            if (object.topMargin != rect.top) {
                object.topMargin = rect.top;
                bl5 = true;
            }
        }
        if (object.rightMargin != rect.right) {
            object.rightMargin = rect.right;
            bl5 = true;
        }
        if (bl2 && object.bottomMargin != rect.bottom) {
            object.bottomMargin = rect.bottom;
            bl5 = bl3;
        }
        return bl5;
    }

    static /* synthetic */ ae b(ActionBarOverlayLayout actionBarOverlayLayout, ae ae2) {
        actionBarOverlayLayout.z = ae2;
        return ae2;
    }

    private void b() {
        this.removeCallbacks(this.C);
        this.removeCallbacks(this.D);
        if (this.y != null) {
            this.y.a();
        }
        if (this.z != null) {
            this.z.a();
        }
    }

    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof b;
    }

    /*
     * Enabled aggressive block sorting
     */
    public void draw(Canvas canvas) {
        super.draw(canvas);
        if (this.h != null && !this.i) {
            int n2 = this.f.getVisibility() == 0 ? (int)((float)this.f.getBottom() + android.support.v4.view.u.g((View)this.f) + 0.5f) : 0;
            this.h.setBounds(0, n2, this.getWidth(), this.h.getIntrinsicHeight() + n2);
            this.h.draw(canvas);
        }
    }

    protected boolean fitSystemWindows(Rect rect) {
        boolean bl;
        this.a();
        android.support.v4.view.u.k((View)this);
        boolean bl2 = bl = ActionBarOverlayLayout.a((View)this.f, rect, true, false);
        if (this.e != null) {
            bl2 = bl | ActionBarOverlayLayout.a((View)this.e, rect, false, true);
        }
        this.s.set(rect);
        android.support.v7.internal.widget.s.a((View)this, this.s, this.p);
        if (!this.q.equals((Object)this.p)) {
            this.q.set(this.p);
            bl2 = true;
        }
        if (bl2) {
            this.requestLayout();
        }
        return true;
    }

    protected /* synthetic */ ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new b();
    }

    public /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new b(this.getContext(), attributeSet);
    }

    protected ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new b(layoutParams);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public int getActionBarHideOffset() {
        if (this.f == null) return 0;
        return -((int)android.support.v4.view.u.g((View)this.f));
    }

    public CharSequence getTitle() {
        this.a();
        return this.g.a();
    }

    protected void onConfigurationChanged(Configuration configuration) {
        if (Build.VERSION.SDK_INT >= 8) {
            super.onConfigurationChanged(configuration);
        }
        this.a(this.getContext());
        android.support.v4.view.u.l((View)this);
    }

    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.b();
    }

    /*
     * Enabled aggressive block sorting
     */
    protected void onLayout(boolean bl, int n2, int n3, int n4, int n5) {
        int n6 = this.getChildCount();
        int n7 = this.getPaddingLeft();
        this.getPaddingRight();
        int n8 = this.getPaddingTop();
        int n9 = this.getPaddingBottom();
        n2 = 0;
        while (n2 < n6) {
            View view = this.getChildAt(n2);
            if (view.getVisibility() != 8) {
                b b2 = (b)view.getLayoutParams();
                int n10 = view.getMeasuredWidth();
                int n11 = view.getMeasuredHeight();
                int n12 = b2.leftMargin + n7;
                n4 = view == this.e ? n5 - n3 - n9 - n11 - b2.bottomMargin : b2.topMargin + n8;
                view.layout(n12, n4, n10 + n12, n11 + n4);
            }
            ++n2;
        }
        return;
    }

    /*
     * Enabled aggressive block sorting
     */
    protected void onMeasure(int n2, int n3) {
        this.a();
        this.measureChildWithMargins((View)this.f, n2, 0, n3, 0);
        b b2 = (b)this.f.getLayoutParams();
        int n4 = Math.max(0, this.f.getMeasuredWidth() + b2.leftMargin + b2.rightMargin);
        int n5 = this.f.getMeasuredHeight();
        int n6 = b2.topMargin;
        int n7 = Math.max(0, b2.bottomMargin + (n5 + n6));
        int n8 = n6 = android.support.v7.internal.widget.s.a(0, android.support.v4.view.u.f((View)this.f));
        int n9 = n4;
        n5 = n7;
        if (this.e != null) {
            this.measureChildWithMargins((View)this.e, n2, 0, n3, 0);
            b2 = (b)this.e.getLayoutParams();
            n9 = Math.max(n4, this.e.getMeasuredWidth() + b2.leftMargin + b2.rightMargin);
            n8 = this.e.getMeasuredHeight();
            n5 = b2.topMargin;
            n5 = Math.max(n7, b2.bottomMargin + (n8 + n5));
            n8 = android.support.v7.internal.widget.s.a(n6, android.support.v4.view.u.f((View)this.e));
        }
        if ((n7 = (android.support.v4.view.u.k((View)this) & 0x100) != 0 ? 1 : 0) != 0) {
            n6 = n4 = this.b;
            if (this.k) {
                n6 = n4;
                if (this.f.getTabContainer() != null) {
                    n6 = n4 + this.b;
                }
            }
        } else {
            n6 = this.f.getVisibility() != 8 ? this.f.getMeasuredHeight() : 0;
        }
        this.r.set(this.p);
        this.t.set(this.s);
        if (!this.j && n7 == 0) {
            b2 = this.r;
            ((Rect)b2).top = n6 + ((Rect)b2).top;
            b2 = this.r;
            ((Rect)b2).bottom += 0;
        } else {
            b2 = this.t;
            ((Rect)b2).top = n6 + ((Rect)b2).top;
            b2 = this.t;
            ((Rect)b2).bottom += 0;
        }
        ActionBarOverlayLayout.a((View)this.d, this.r, true, true);
        if (!this.u.equals((Object)this.t)) {
            this.u.set(this.t);
            this.d.a(this.t);
        }
        this.measureChildWithMargins((View)this.d, n2, 0, n3, 0);
        b2 = (b)this.d.getLayoutParams();
        n6 = Math.max(n9, this.d.getMeasuredWidth() + b2.leftMargin + b2.rightMargin);
        n7 = this.d.getMeasuredHeight();
        n9 = b2.topMargin;
        n9 = Math.max(n5, b2.bottomMargin + (n7 + n9));
        n7 = android.support.v7.internal.widget.s.a(n8, android.support.v4.view.u.f((View)this.d));
        n8 = this.getPaddingLeft();
        n5 = this.getPaddingRight();
        n9 = Math.max(n9 + (this.getPaddingTop() + this.getPaddingBottom()), this.getSuggestedMinimumHeight());
        this.setMeasuredDimension(android.support.v4.view.u.a(Math.max(n6 + (n8 + n5), this.getSuggestedMinimumWidth()), n2, n7), android.support.v4.view.u.a(n9, n3, n7 << 16));
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     */
    public boolean onNestedFling(View object, float f2, float f3, boolean bl) {
        void var3_5;
        boolean bl2;
        boolean bl3 = false;
        boolean bl4 = true;
        if (!this.l) return false;
        if (!bl2) {
            return false;
        }
        j j2 = this.x;
        int n2 = (int)var3_5;
        j2.b.a(j2.a, n2);
        j j3 = this.x;
        if (j3.b.a(j3.a) > this.f.getHeight()) {
            bl3 = true;
        }
        if (bl3) {
            this.b();
            this.D.run();
        } else {
            this.b();
            this.C.run();
        }
        this.m = true;
        return bl4;
    }

    public void onNestedScroll(View view, int n2, int n3, int n4, int n5) {
        this.n += n3;
        this.setActionBarHideOffset(this.n);
    }

    public void onNestedScrollAccepted(View view, View view2, int n2) {
        super.onNestedScrollAccepted(view, view2, n2);
        this.n = this.getActionBarHideOffset();
        this.b();
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public boolean onStartNestedScroll(View view, View view2, int n2) {
        if ((n2 & 2) == 0) return false;
        if (this.f.getVisibility() == 0) return this.l;
        return false;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public void onStopNestedScroll(View view) {
        block4: {
            block3: {
                super.onStopNestedScroll(view);
                if (!this.l || this.m) break block3;
                if (this.n > this.f.getHeight()) break block4;
                this.b();
                this.postDelayed(this.C, 600L);
            }
            return;
        }
        this.b();
        this.postDelayed(this.D, 600L);
    }

    public void onWindowSystemUiVisibilityChanged(int n2) {
        if (Build.VERSION.SDK_INT >= 16) {
            super.onWindowSystemUiVisibilityChanged(n2);
        }
        this.a();
        int n3 = this.o;
        this.o = n2;
        if (((n3 ^ n2) & 0x100) != 0 && this.v != null) {
            android.support.v4.view.u.l((View)this);
        }
    }

    protected void onWindowVisibilityChanged(int n2) {
        super.onWindowVisibilityChanged(n2);
        this.c = n2;
    }

    public void setActionBarHideOffset(int n2) {
        this.b();
        int n3 = this.f.getHeight();
        n2 = Math.max(0, Math.min(n2, n3));
        android.support.v4.view.u.b((View)this.f, (float)(-n2));
        if (this.e != null && this.e.getVisibility() != 8) {
            n2 = (int)((float)n2 / (float)n3 * (float)this.e.getHeight());
            android.support.v4.view.u.b((View)this.e, (float)n2);
        }
    }

    public void setActionBarVisibilityCallback(a a2) {
        this.v = a2;
        if (this.getWindowToken() != null && this.o != 0) {
            this.onWindowSystemUiVisibilityChanged(this.o);
            android.support.v4.view.u.l((View)this);
        }
    }

    public void setHasNonEmbeddedTabs(boolean bl) {
        this.k = bl;
    }

    public void setHideOnContentScrollEnabled(boolean bl) {
        if (bl != this.l) {
            this.l = bl;
            if (!bl) {
                if (android.support.v7.internal.a.a()) {
                    this.stopNestedScroll();
                }
                this.b();
                this.setActionBarHideOffset(0);
            }
        }
    }

    public void setIcon(int n2) {
        this.a();
        this.g.a(n2);
    }

    public void setIcon(Drawable drawable) {
        this.a();
        this.g.a(drawable);
    }

    public void setLogo(int n2) {
        this.a();
        this.g.b(n2);
    }

    /*
     * Enabled aggressive block sorting
     */
    public void setOverlayMode(boolean bl) {
        this.j = bl;
        bl = bl && this.getContext().getApplicationInfo().targetSdkVersion < 19;
        this.i = bl;
    }

    public void setShowingForActionMode(boolean bl) {
    }

    public void setUiOptions(int n2) {
    }

    public void setWindowCallback(android.support.v7.internal.a.a a2) {
        this.a();
        this.g.a(a2);
    }

    public void setWindowTitle(CharSequence charSequence) {
        this.a();
        this.g.a(charSequence);
    }

    public boolean shouldDelayChildPressedState() {
        return false;
    }

    public static interface a {
    }

    public static final class b
    extends ViewGroup.MarginLayoutParams {
        public b() {
            super(-1, -1);
        }

        public b(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public b(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }
    }
}

