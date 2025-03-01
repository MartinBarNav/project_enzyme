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
import android.support.v7.widget.Toolbar;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;

public class ActionBarOverlayLayout extends ViewGroup {
    static final int[] a = {a.C0011a.actionBarSize, 16842841};
    /* access modifiers changed from: private */
    public final ah A = new ai() {
        public final void b(View view) {
            ae unused = ActionBarOverlayLayout.this.y = null;
            boolean unused2 = ActionBarOverlayLayout.this.m = false;
        }

        public final void c(View view) {
            ae unused = ActionBarOverlayLayout.this.y = null;
            boolean unused2 = ActionBarOverlayLayout.this.m = false;
        }
    };
    /* access modifiers changed from: private */
    public final ah B = new ai() {
        public final void b(View view) {
            ae unused = ActionBarOverlayLayout.this.z = null;
            boolean unused2 = ActionBarOverlayLayout.this.m = false;
        }

        public final void c(View view) {
            ae unused = ActionBarOverlayLayout.this.z = null;
            boolean unused2 = ActionBarOverlayLayout.this.m = false;
        }
    };
    private final Runnable C = new Runnable() {
        public final void run() {
            ActionBarOverlayLayout.this.b();
            ae unused = ActionBarOverlayLayout.this.y = u.i(ActionBarOverlayLayout.this.f).a(0.0f).a(ActionBarOverlayLayout.this.A);
            if (ActionBarOverlayLayout.this.e != null && ActionBarOverlayLayout.this.e.getVisibility() != 8) {
                ae unused2 = ActionBarOverlayLayout.this.z = u.i(ActionBarOverlayLayout.this.e).a(0.0f).a(ActionBarOverlayLayout.this.B);
            }
        }
    };
    private final Runnable D = new Runnable() {
        public final void run() {
            ActionBarOverlayLayout.this.b();
            ae unused = ActionBarOverlayLayout.this.y = u.i(ActionBarOverlayLayout.this.f).a((float) (-ActionBarOverlayLayout.this.f.getHeight())).a(ActionBarOverlayLayout.this.A);
            if (ActionBarOverlayLayout.this.e != null && ActionBarOverlayLayout.this.e.getVisibility() != 8) {
                ae unused2 = ActionBarOverlayLayout.this.z = u.i(ActionBarOverlayLayout.this.e).a((float) ActionBarOverlayLayout.this.e.getHeight()).a(ActionBarOverlayLayout.this.B);
            }
        }
    };
    private int b;
    private int c = 0;
    private g d;
    /* access modifiers changed from: private */
    public ActionBarContainer e;
    /* access modifiers changed from: private */
    public ActionBarContainer f;
    private h g;
    private Drawable h;
    private boolean i;
    private boolean j;
    private boolean k;
    private boolean l;
    /* access modifiers changed from: private */
    public boolean m;
    private int n;
    private int o;
    private final Rect p = new Rect();
    private final Rect q = new Rect();
    private final Rect r = new Rect();
    private final Rect s = new Rect();
    private final Rect t = new Rect();
    private final Rect u = new Rect();
    private a v;
    private final int w = 600;
    private j x;
    /* access modifiers changed from: private */
    public ae y;
    /* access modifiers changed from: private */
    public ae z;

    public interface a {
    }

    public ActionBarOverlayLayout(Context context) {
        super(context);
        a(context);
    }

    public ActionBarOverlayLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        a(context);
    }

    private void a(Context context) {
        boolean z2 = true;
        TypedArray obtainStyledAttributes = getContext().getTheme().obtainStyledAttributes(a);
        this.b = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        this.h = obtainStyledAttributes.getDrawable(1);
        setWillNotDraw(this.h == null);
        obtainStyledAttributes.recycle();
        if (context.getApplicationInfo().targetSdkVersion >= 19) {
            z2 = false;
        }
        this.i = z2;
        this.x = new j(context);
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        b();
    }

    public void setActionBarVisibilityCallback(a aVar) {
        this.v = aVar;
        if (getWindowToken() != null && this.o != 0) {
            onWindowSystemUiVisibilityChanged(this.o);
            u.l(this);
        }
    }

    public void setOverlayMode(boolean z2) {
        this.j = z2;
        this.i = z2 && getContext().getApplicationInfo().targetSdkVersion < 19;
    }

    public void setHasNonEmbeddedTabs(boolean z2) {
        this.k = z2;
    }

    public void setShowingForActionMode(boolean z2) {
    }

    /* access modifiers changed from: protected */
    public void onConfigurationChanged(Configuration configuration) {
        if (Build.VERSION.SDK_INT >= 8) {
            super.onConfigurationChanged(configuration);
        }
        a(getContext());
        u.l(this);
    }

    public void onWindowSystemUiVisibilityChanged(int i2) {
        if (Build.VERSION.SDK_INT >= 16) {
            super.onWindowSystemUiVisibilityChanged(i2);
        }
        a();
        this.o = i2;
        if (((this.o ^ i2) & 256) != 0 && this.v != null) {
            u.l(this);
        }
    }

    /* access modifiers changed from: protected */
    public void onWindowVisibilityChanged(int i2) {
        super.onWindowVisibilityChanged(i2);
        this.c = i2;
    }

    private static boolean a(View view, Rect rect, boolean z2, boolean z3) {
        boolean z4 = false;
        b bVar = (b) view.getLayoutParams();
        if (bVar.leftMargin != rect.left) {
            bVar.leftMargin = rect.left;
            z4 = true;
        }
        if (z2 && bVar.topMargin != rect.top) {
            bVar.topMargin = rect.top;
            z4 = true;
        }
        if (bVar.rightMargin != rect.right) {
            bVar.rightMargin = rect.right;
            z4 = true;
        }
        if (!z3 || bVar.bottomMargin == rect.bottom) {
            return z4;
        }
        bVar.bottomMargin = rect.bottom;
        return true;
    }

    /* access modifiers changed from: protected */
    public boolean fitSystemWindows(Rect rect) {
        a();
        u.k(this);
        boolean a2 = a(this.f, rect, true, false);
        if (this.e != null) {
            a2 |= a(this.e, rect, false, true);
        }
        this.s.set(rect);
        s.a(this, this.s, this.p);
        if (!this.q.equals(this.p)) {
            this.q.set(this.p);
            a2 = true;
        }
        if (a2) {
            requestLayout();
        }
        return true;
    }

    /* access modifiers changed from: protected */
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new b(layoutParams);
    }

    /* access modifiers changed from: protected */
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof b;
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i2, int i3) {
        int measuredHeight;
        a();
        measureChildWithMargins(this.f, i2, 0, i3, 0);
        b bVar = (b) this.f.getLayoutParams();
        int max = Math.max(0, this.f.getMeasuredWidth() + bVar.leftMargin + bVar.rightMargin);
        int max2 = Math.max(0, bVar.bottomMargin + this.f.getMeasuredHeight() + bVar.topMargin);
        int a2 = s.a(0, u.f(this.f));
        if (this.e != null) {
            measureChildWithMargins(this.e, i2, 0, i3, 0);
            b bVar2 = (b) this.e.getLayoutParams();
            int max3 = Math.max(max, this.e.getMeasuredWidth() + bVar2.leftMargin + bVar2.rightMargin);
            int max4 = Math.max(max2, bVar2.bottomMargin + this.e.getMeasuredHeight() + bVar2.topMargin);
            a2 = s.a(a2, u.f(this.e));
            max = max3;
            max2 = max4;
        }
        boolean z2 = (u.k(this) & 256) != 0;
        if (z2) {
            measuredHeight = this.b;
            if (this.k && this.f.getTabContainer() != null) {
                measuredHeight += this.b;
            }
        } else {
            measuredHeight = this.f.getVisibility() != 8 ? this.f.getMeasuredHeight() : 0;
        }
        this.r.set(this.p);
        this.t.set(this.s);
        if (this.j || z2) {
            Rect rect = this.t;
            rect.top = measuredHeight + rect.top;
            this.t.bottom += 0;
        } else {
            Rect rect2 = this.r;
            rect2.top = measuredHeight + rect2.top;
            this.r.bottom += 0;
        }
        a(this.d, this.r, true, true);
        if (!this.u.equals(this.t)) {
            this.u.set(this.t);
            this.d.a(this.t);
        }
        measureChildWithMargins(this.d, i2, 0, i3, 0);
        b bVar3 = (b) this.d.getLayoutParams();
        int max5 = Math.max(max, this.d.getMeasuredWidth() + bVar3.leftMargin + bVar3.rightMargin);
        int max6 = Math.max(max2, bVar3.bottomMargin + this.d.getMeasuredHeight() + bVar3.topMargin);
        int a3 = s.a(a2, u.f(this.d));
        setMeasuredDimension(u.a(Math.max(max5 + getPaddingLeft() + getPaddingRight(), getSuggestedMinimumWidth()), i2, a3), u.a(Math.max(max6 + getPaddingTop() + getPaddingBottom(), getSuggestedMinimumHeight()), i3, a3 << 16));
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
        int i6;
        int childCount = getChildCount();
        int paddingLeft = getPaddingLeft();
        getPaddingRight();
        int paddingTop = getPaddingTop();
        int paddingBottom = (i5 - i3) - getPaddingBottom();
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt = getChildAt(i7);
            if (childAt.getVisibility() != 8) {
                b bVar = (b) childAt.getLayoutParams();
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight = childAt.getMeasuredHeight();
                int i8 = bVar.leftMargin + paddingLeft;
                if (childAt == this.e) {
                    i6 = (paddingBottom - measuredHeight) - bVar.bottomMargin;
                } else {
                    i6 = bVar.topMargin + paddingTop;
                }
                childAt.layout(i8, i6, measuredWidth + i8, measuredHeight + i6);
            }
        }
    }

    public void draw(Canvas canvas) {
        super.draw(canvas);
        if (this.h != null && !this.i) {
            int bottom = this.f.getVisibility() == 0 ? (int) (((float) this.f.getBottom()) + u.g(this.f) + 0.5f) : 0;
            this.h.setBounds(0, bottom, getWidth(), this.h.getIntrinsicHeight() + bottom);
            this.h.draw(canvas);
        }
    }

    public boolean shouldDelayChildPressedState() {
        return false;
    }

    public boolean onStartNestedScroll(View view, View view2, int i2) {
        if ((i2 & 2) == 0 || this.f.getVisibility() != 0) {
            return false;
        }
        return this.l;
    }

    public void onNestedScrollAccepted(View view, View view2, int i2) {
        super.onNestedScrollAccepted(view, view2, i2);
        this.n = getActionBarHideOffset();
        b();
    }

    public void onNestedScroll(View view, int i2, int i3, int i4, int i5) {
        this.n += i3;
        setActionBarHideOffset(this.n);
    }

    public void onStopNestedScroll(View view) {
        super.onStopNestedScroll(view);
        if (this.l && !this.m) {
            if (this.n <= this.f.getHeight()) {
                b();
                postDelayed(this.C, 600);
                return;
            }
            b();
            postDelayed(this.D, 600);
        }
    }

    public boolean onNestedFling(View view, float f2, float f3, boolean z2) {
        boolean z3 = false;
        if (!this.l || !z2) {
            return false;
        }
        j jVar = this.x;
        jVar.b.a(jVar.a, (int) f3);
        j jVar2 = this.x;
        if (jVar2.b.a(jVar2.a) > this.f.getHeight()) {
            z3 = true;
        }
        if (z3) {
            b();
            this.D.run();
        } else {
            b();
            this.C.run();
        }
        this.m = true;
        return true;
    }

    private void a() {
        h wrapper;
        if (this.d == null) {
            this.d = (g) findViewById(a.e.action_bar_activity_content);
            this.f = (ActionBarContainer) findViewById(a.e.action_bar_container);
            View findViewById = findViewById(a.e.action_bar);
            if (findViewById instanceof h) {
                wrapper = (h) findViewById;
            } else if (findViewById instanceof Toolbar) {
                wrapper = ((Toolbar) findViewById).getWrapper();
            } else {
                throw new IllegalStateException("Can't make a decor toolbar out of " + findViewById.getClass().getSimpleName());
            }
            this.g = wrapper;
            this.e = (ActionBarContainer) findViewById(a.e.split_action_bar);
        }
    }

    public void setHideOnContentScrollEnabled(boolean z2) {
        if (z2 != this.l) {
            this.l = z2;
            if (!z2) {
                if (android.support.v7.internal.a.a()) {
                    stopNestedScroll();
                }
                b();
                setActionBarHideOffset(0);
            }
        }
    }

    public int getActionBarHideOffset() {
        if (this.f != null) {
            return -((int) u.g(this.f));
        }
        return 0;
    }

    public void setActionBarHideOffset(int i2) {
        b();
        int height = this.f.getHeight();
        int max = Math.max(0, Math.min(i2, height));
        u.b((View) this.f, (float) (-max));
        if (this.e != null && this.e.getVisibility() != 8) {
            u.b((View) this.e, (float) ((int) ((((float) max) / ((float) height)) * ((float) this.e.getHeight()))));
        }
    }

    /* access modifiers changed from: private */
    public void b() {
        removeCallbacks(this.C);
        removeCallbacks(this.D);
        if (this.y != null) {
            this.y.a();
        }
        if (this.z != null) {
            this.z.a();
        }
    }

    public void setWindowCallback(android.support.v7.internal.a.a aVar) {
        a();
        this.g.a(aVar);
    }

    public void setWindowTitle(CharSequence charSequence) {
        a();
        this.g.a(charSequence);
    }

    public CharSequence getTitle() {
        a();
        return this.g.a();
    }

    public void setUiOptions(int i2) {
    }

    public void setIcon(int i2) {
        a();
        this.g.a(i2);
    }

    public void setIcon(Drawable drawable) {
        a();
        this.g.a(drawable);
    }

    public void setLogo(int i2) {
        a();
        this.g.b(i2);
    }

    public static class b extends ViewGroup.MarginLayoutParams {
        public b(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public b() {
            super(-1, -1);
        }

        public b(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }
    }

    /* access modifiers changed from: protected */
    public /* synthetic */ ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new b();
    }

    public /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new b(getContext(), attributeSet);
    }
}
