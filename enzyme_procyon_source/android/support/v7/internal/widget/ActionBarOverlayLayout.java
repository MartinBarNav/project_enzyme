// 
// Decompiled by Procyon v0.5.36
// 

package android.support.v7.internal.widget;

import android.view.ViewGroup$MarginLayoutParams;
import android.os.Build$VERSION;
import android.content.res.Configuration;
import android.graphics.Canvas;
import android.view.ViewGroup$LayoutParams;
import android.content.res.TypedArray;
import android.support.v7.widget.Toolbar;
import android.util.AttributeSet;
import android.support.v4.view.u;
import android.view.View;
import android.support.v4.view.ai;
import android.content.Context;
import android.support.v7.b.a;
import android.support.v4.view.ae;
import android.support.v4.f.j;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.support.v4.view.ah;
import android.view.ViewGroup;

public class ActionBarOverlayLayout extends ViewGroup
{
    static final int[] a;
    private final ah A;
    private final ah B;
    private final Runnable C;
    private final Runnable D;
    private int b;
    private int c;
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
    private final Rect p;
    private final Rect q;
    private final Rect r;
    private final Rect s;
    private final Rect t;
    private final Rect u;
    private a v;
    private final int w;
    private j x;
    private ae y;
    private ae z;
    
    static {
        a = new int[] { android.support.v7.b.a.a.actionBarSize, 16842841 };
    }
    
    public ActionBarOverlayLayout(final Context context) {
        super(context);
        this.c = 0;
        this.p = new Rect();
        this.q = new Rect();
        this.r = new Rect();
        this.s = new Rect();
        this.t = new Rect();
        this.u = new Rect();
        this.w = 600;
        this.A = new ai() {
            @Override
            public final void b(final View view) {
                ActionBarOverlayLayout.this.y = null;
                ActionBarOverlayLayout.this.m = false;
            }
            
            @Override
            public final void c(final View view) {
                ActionBarOverlayLayout.this.y = null;
                ActionBarOverlayLayout.this.m = false;
            }
        };
        this.B = new ai() {
            @Override
            public final void b(final View view) {
                ActionBarOverlayLayout.this.z = null;
                ActionBarOverlayLayout.this.m = false;
            }
            
            @Override
            public final void c(final View view) {
                ActionBarOverlayLayout.this.z = null;
                ActionBarOverlayLayout.this.m = false;
            }
        };
        this.C = new Runnable() {
            @Override
            public final void run() {
                ActionBarOverlayLayout.this.b();
                ActionBarOverlayLayout.this.y = android.support.v4.view.u.i((View)ActionBarOverlayLayout.this.f).a(0.0f).a(ActionBarOverlayLayout.this.A);
                if (ActionBarOverlayLayout.this.e != null && ActionBarOverlayLayout.this.e.getVisibility() != 8) {
                    ActionBarOverlayLayout.this.z = android.support.v4.view.u.i((View)ActionBarOverlayLayout.this.e).a(0.0f).a(ActionBarOverlayLayout.this.B);
                }
            }
        };
        this.D = new Runnable() {
            @Override
            public final void run() {
                ActionBarOverlayLayout.this.b();
                ActionBarOverlayLayout.this.y = android.support.v4.view.u.i((View)ActionBarOverlayLayout.this.f).a((float)(-ActionBarOverlayLayout.this.f.getHeight())).a(ActionBarOverlayLayout.this.A);
                if (ActionBarOverlayLayout.this.e != null && ActionBarOverlayLayout.this.e.getVisibility() != 8) {
                    ActionBarOverlayLayout.this.z = android.support.v4.view.u.i((View)ActionBarOverlayLayout.this.e).a((float)ActionBarOverlayLayout.this.e.getHeight()).a(ActionBarOverlayLayout.this.B);
                }
            }
        };
        this.a(context);
    }
    
    public ActionBarOverlayLayout(final Context context, final AttributeSet set) {
        super(context, set);
        this.c = 0;
        this.p = new Rect();
        this.q = new Rect();
        this.r = new Rect();
        this.s = new Rect();
        this.t = new Rect();
        this.u = new Rect();
        this.w = 600;
        this.A = new ai() {
            @Override
            public final void b(final View view) {
                ActionBarOverlayLayout.this.y = null;
                ActionBarOverlayLayout.this.m = false;
            }
            
            @Override
            public final void c(final View view) {
                ActionBarOverlayLayout.this.y = null;
                ActionBarOverlayLayout.this.m = false;
            }
        };
        this.B = new ai() {
            @Override
            public final void b(final View view) {
                ActionBarOverlayLayout.this.z = null;
                ActionBarOverlayLayout.this.m = false;
            }
            
            @Override
            public final void c(final View view) {
                ActionBarOverlayLayout.this.z = null;
                ActionBarOverlayLayout.this.m = false;
            }
        };
        this.C = new Runnable() {
            @Override
            public final void run() {
                ActionBarOverlayLayout.this.b();
                ActionBarOverlayLayout.this.y = android.support.v4.view.u.i((View)ActionBarOverlayLayout.this.f).a(0.0f).a(ActionBarOverlayLayout.this.A);
                if (ActionBarOverlayLayout.this.e != null && ActionBarOverlayLayout.this.e.getVisibility() != 8) {
                    ActionBarOverlayLayout.this.z = android.support.v4.view.u.i((View)ActionBarOverlayLayout.this.e).a(0.0f).a(ActionBarOverlayLayout.this.B);
                }
            }
        };
        this.D = new Runnable() {
            @Override
            public final void run() {
                ActionBarOverlayLayout.this.b();
                ActionBarOverlayLayout.this.y = android.support.v4.view.u.i((View)ActionBarOverlayLayout.this.f).a((float)(-ActionBarOverlayLayout.this.f.getHeight())).a(ActionBarOverlayLayout.this.A);
                if (ActionBarOverlayLayout.this.e != null && ActionBarOverlayLayout.this.e.getVisibility() != 8) {
                    ActionBarOverlayLayout.this.z = android.support.v4.view.u.i((View)ActionBarOverlayLayout.this.e).a((float)ActionBarOverlayLayout.this.e.getHeight()).a(ActionBarOverlayLayout.this.B);
                }
            }
        };
        this.a(context);
    }
    
    private void a() {
        if (this.d == null) {
            this.d = (g)this.findViewById(android.support.v7.b.a.e.action_bar_activity_content);
            this.f = (ActionBarContainer)this.findViewById(android.support.v7.b.a.e.action_bar_container);
            final View viewById = this.findViewById(android.support.v7.b.a.e.action_bar);
            h wrapper;
            if (viewById instanceof h) {
                wrapper = (h)viewById;
            }
            else {
                if (!(viewById instanceof Toolbar)) {
                    throw new IllegalStateException("Can't make a decor toolbar out of " + ((Toolbar)viewById).getClass().getSimpleName());
                }
                wrapper = ((Toolbar)viewById).getWrapper();
            }
            this.g = wrapper;
            this.e = (ActionBarContainer)this.findViewById(android.support.v7.b.a.e.split_action_bar);
        }
    }
    
    private void a(final Context context) {
        final boolean b = true;
        final TypedArray obtainStyledAttributes = this.getContext().getTheme().obtainStyledAttributes(ActionBarOverlayLayout.a);
        this.b = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        this.h = obtainStyledAttributes.getDrawable(1);
        this.setWillNotDraw(this.h == null);
        obtainStyledAttributes.recycle();
        this.i = (context.getApplicationInfo().targetSdkVersion < 19 && b);
        this.x = new j(context);
    }
    
    private static boolean a(final View view, final Rect rect, final boolean b, final boolean b2) {
        final boolean b3 = true;
        boolean b4 = false;
        final b b5 = (b)view.getLayoutParams();
        if (b5.leftMargin != rect.left) {
            b5.leftMargin = rect.left;
            b4 = true;
        }
        boolean b6 = b4;
        if (b) {
            b6 = b4;
            if (b5.topMargin != rect.top) {
                b5.topMargin = rect.top;
                b6 = true;
            }
        }
        if (b5.rightMargin != rect.right) {
            b5.rightMargin = rect.right;
            b6 = true;
        }
        if (b2 && b5.bottomMargin != rect.bottom) {
            b5.bottomMargin = rect.bottom;
            b6 = b3;
        }
        return b6;
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
    
    protected boolean checkLayoutParams(final ViewGroup$LayoutParams viewGroup$LayoutParams) {
        return viewGroup$LayoutParams instanceof b;
    }
    
    public void draw(final Canvas canvas) {
        super.draw(canvas);
        if (this.h != null && !this.i) {
            int n;
            if (this.f.getVisibility() == 0) {
                n = (int)(this.f.getBottom() + android.support.v4.view.u.g((View)this.f) + 0.5f);
            }
            else {
                n = 0;
            }
            this.h.setBounds(0, n, this.getWidth(), this.h.getIntrinsicHeight() + n);
            this.h.draw(canvas);
        }
    }
    
    protected boolean fitSystemWindows(final Rect rect) {
        this.a();
        android.support.v4.view.u.k((View)this);
        boolean a;
        final boolean b = a = a((View)this.f, rect, (boolean)(1 != 0), (boolean)(0 != 0));
        if (this.e != null) {
            a = (b | a((View)this.e, rect, false, true));
        }
        this.s.set(rect);
        android.support.v7.internal.widget.s.a((View)this, this.s, this.p);
        if (!this.q.equals((Object)this.p)) {
            this.q.set(this.p);
            a = true;
        }
        if (a) {
            this.requestLayout();
        }
        return true;
    }
    
    protected ViewGroup$LayoutParams generateLayoutParams(final ViewGroup$LayoutParams viewGroup$LayoutParams) {
        return (ViewGroup$LayoutParams)new b(viewGroup$LayoutParams);
    }
    
    public int getActionBarHideOffset() {
        int n;
        if (this.f != null) {
            n = -(int)android.support.v4.view.u.g((View)this.f);
        }
        else {
            n = 0;
        }
        return n;
    }
    
    public CharSequence getTitle() {
        this.a();
        return this.g.a();
    }
    
    protected void onConfigurationChanged(final Configuration configuration) {
        if (Build$VERSION.SDK_INT >= 8) {
            super.onConfigurationChanged(configuration);
        }
        this.a(this.getContext());
        android.support.v4.view.u.l((View)this);
    }
    
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.b();
    }
    
    protected void onLayout(final boolean b, int i, final int n, int n2, final int n3) {
        final int childCount = this.getChildCount();
        final int paddingLeft = this.getPaddingLeft();
        this.getPaddingRight();
        final int paddingTop = this.getPaddingTop();
        final int paddingBottom = this.getPaddingBottom();
        View child;
        b b2;
        int measuredWidth;
        int measuredHeight;
        int n4;
        for (i = 0; i < childCount; ++i) {
            child = this.getChildAt(i);
            if (child.getVisibility() != 8) {
                b2 = (b)child.getLayoutParams();
                measuredWidth = child.getMeasuredWidth();
                measuredHeight = child.getMeasuredHeight();
                n4 = b2.leftMargin + paddingLeft;
                if (child == this.e) {
                    n2 = n3 - n - paddingBottom - measuredHeight - b2.bottomMargin;
                }
                else {
                    n2 = b2.topMargin + paddingTop;
                }
                child.layout(n4, n2, measuredWidth + n4, measuredHeight + n2);
            }
        }
    }
    
    protected void onMeasure(final int n, final int n2) {
        this.a();
        this.measureChildWithMargins((View)this.f, n, 0, n2, 0);
        final b b = (b)this.f.getLayoutParams();
        final int max = Math.max(0, this.f.getMeasuredWidth() + b.leftMargin + b.rightMargin);
        final int max2 = Math.max(0, b.bottomMargin + (this.f.getMeasuredHeight() + b.topMargin));
        int n3 = android.support.v7.internal.widget.s.a(0, android.support.v4.view.u.f((View)this.f));
        int max3 = max;
        int max4 = max2;
        if (this.e != null) {
            this.measureChildWithMargins((View)this.e, n, 0, n2, 0);
            final b b2 = (b)this.e.getLayoutParams();
            max3 = Math.max(max, this.e.getMeasuredWidth() + b2.leftMargin + b2.rightMargin);
            max4 = Math.max(max2, b2.bottomMargin + (this.e.getMeasuredHeight() + b2.topMargin));
            n3 = android.support.v7.internal.widget.s.a(n3, android.support.v4.view.u.f((View)this.e));
        }
        boolean b3;
        if ((android.support.v4.view.u.k((View)this) & 0x100) != 0x0) {
            b3 = true;
        }
        else {
            b3 = false;
        }
        int n5;
        if (b3) {
            final int n4 = n5 = this.b;
            if (this.k) {
                n5 = n4;
                if (this.f.getTabContainer() != null) {
                    n5 = n4 + this.b;
                }
            }
        }
        else if (this.f.getVisibility() != 8) {
            n5 = this.f.getMeasuredHeight();
        }
        else {
            n5 = 0;
        }
        this.r.set(this.p);
        this.t.set(this.s);
        if (!this.j && !b3) {
            final Rect r = this.r;
            r.top += n5;
            final Rect r2 = this.r;
            r2.bottom += 0;
        }
        else {
            final Rect t = this.t;
            t.top += n5;
            final Rect t2 = this.t;
            t2.bottom += 0;
        }
        a((View)this.d, this.r, true, true);
        if (!this.u.equals((Object)this.t)) {
            this.u.set(this.t);
            this.d.a(this.t);
        }
        this.measureChildWithMargins((View)this.d, n, 0, n2, 0);
        final b b4 = (b)this.d.getLayoutParams();
        final int max5 = Math.max(max3, this.d.getMeasuredWidth() + b4.leftMargin + b4.rightMargin);
        final int max6 = Math.max(max4, b4.bottomMargin + (this.d.getMeasuredHeight() + b4.topMargin));
        final int a = android.support.v7.internal.widget.s.a(n3, android.support.v4.view.u.f((View)this.d));
        this.setMeasuredDimension(android.support.v4.view.u.a(Math.max(max5 + (this.getPaddingLeft() + this.getPaddingRight()), this.getSuggestedMinimumWidth()), n, a), android.support.v4.view.u.a(Math.max(max6 + (this.getPaddingTop() + this.getPaddingBottom()), this.getSuggestedMinimumHeight()), n2, a << 16));
    }
    
    public boolean onNestedFling(final View view, final float n, final float n2, final boolean b) {
        boolean b2 = false;
        final boolean b3 = true;
        boolean b4;
        if (!this.l || !b) {
            b4 = false;
        }
        else {
            final j x = this.x;
            x.b.a(x.a, (int)n2);
            final j x2 = this.x;
            if (x2.b.a(x2.a) > this.f.getHeight()) {
                b2 = true;
            }
            if (b2) {
                this.b();
                this.D.run();
            }
            else {
                this.b();
                this.C.run();
            }
            this.m = true;
            b4 = b3;
        }
        return b4;
    }
    
    public void onNestedScroll(final View view, final int n, final int n2, final int n3, final int n4) {
        this.setActionBarHideOffset(this.n += n2);
    }
    
    public void onNestedScrollAccepted(final View view, final View view2, final int n) {
        super.onNestedScrollAccepted(view, view2, n);
        this.n = this.getActionBarHideOffset();
        this.b();
    }
    
    public boolean onStartNestedScroll(final View view, final View view2, final int n) {
        return (n & 0x2) != 0x0 && this.f.getVisibility() == 0 && this.l;
    }
    
    public void onStopNestedScroll(final View view) {
        super.onStopNestedScroll(view);
        if (this.l && !this.m) {
            if (this.n <= this.f.getHeight()) {
                this.b();
                this.postDelayed(this.C, 600L);
            }
            else {
                this.b();
                this.postDelayed(this.D, 600L);
            }
        }
    }
    
    public void onWindowSystemUiVisibilityChanged(final int o) {
        if (Build$VERSION.SDK_INT >= 16) {
            super.onWindowSystemUiVisibilityChanged(o);
        }
        this.a();
        final int o2 = this.o;
        this.o = o;
        if (((o2 ^ o) & 0x100) != 0x0 && this.v != null) {
            android.support.v4.view.u.l((View)this);
        }
    }
    
    protected void onWindowVisibilityChanged(final int c) {
        super.onWindowVisibilityChanged(c);
        this.c = c;
    }
    
    public void setActionBarHideOffset(int max) {
        this.b();
        final int height = this.f.getHeight();
        max = Math.max(0, Math.min(max, height));
        android.support.v4.view.u.b((View)this.f, (float)(-max));
        if (this.e != null && this.e.getVisibility() != 8) {
            max = (int)(max / (float)height * this.e.getHeight());
            android.support.v4.view.u.b((View)this.e, (float)max);
        }
    }
    
    public void setActionBarVisibilityCallback(final a v) {
        this.v = v;
        if (this.getWindowToken() != null && this.o != 0) {
            this.onWindowSystemUiVisibilityChanged(this.o);
            android.support.v4.view.u.l((View)this);
        }
    }
    
    public void setHasNonEmbeddedTabs(final boolean k) {
        this.k = k;
    }
    
    public void setHideOnContentScrollEnabled(final boolean l) {
        if (l != this.l && !(this.l = l)) {
            if (android.support.v7.internal.a.a()) {
                this.stopNestedScroll();
            }
            this.b();
            this.setActionBarHideOffset(0);
        }
    }
    
    public void setIcon(final int n) {
        this.a();
        this.g.a(n);
    }
    
    public void setIcon(final Drawable drawable) {
        this.a();
        this.g.a(drawable);
    }
    
    public void setLogo(final int n) {
        this.a();
        this.g.b(n);
    }
    
    public void setOverlayMode(final boolean j) {
        this.j = j;
        this.i = (j && this.getContext().getApplicationInfo().targetSdkVersion < 19);
    }
    
    public void setShowingForActionMode(final boolean b) {
    }
    
    public void setUiOptions(final int n) {
    }
    
    public void setWindowCallback(final android.support.v7.internal.a.a a) {
        this.a();
        this.g.a(a);
    }
    
    public void setWindowTitle(final CharSequence charSequence) {
        this.a();
        this.g.a(charSequence);
    }
    
    public boolean shouldDelayChildPressedState() {
        return false;
    }
    
    public interface a
    {
    }
    
    public static final class b extends ViewGroup$MarginLayoutParams
    {
        public b() {
            super(-1, -1);
        }
        
        public b(final Context context, final AttributeSet set) {
            super(context, set);
        }
        
        public b(final ViewGroup$LayoutParams viewGroup$LayoutParams) {
            super(viewGroup$LayoutParams);
        }
    }
}
