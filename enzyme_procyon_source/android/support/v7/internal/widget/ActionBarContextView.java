// 
// Decompiled by Procyon v0.5.36
// 

package android.support.v7.internal.widget;

import android.support.v7.widget.ActionMenuView;
import android.view.View$MeasureSpec;
import android.view.animation.Interpolator;
import android.view.animation.DecelerateInterpolator;
import android.support.v4.view.u;
import android.os.Build$VERSION;
import android.view.accessibility.AccessibilityEvent;
import android.view.ViewGroup$MarginLayoutParams;
import android.view.ViewGroup$LayoutParams;
import java.util.Iterator;
import android.support.v4.view.ae;
import android.text.TextUtils;
import android.view.ViewGroup;
import android.view.LayoutInflater;
import android.util.AttributeSet;
import android.content.Context;
import android.support.v7.internal.view.c;
import android.graphics.drawable.Drawable;
import android.widget.TextView;
import android.widget.LinearLayout;
import android.view.View;
import android.support.v4.view.ah;

public class ActionBarContextView extends a implements ah
{
    private CharSequence j;
    private CharSequence k;
    private View l;
    private View m;
    private LinearLayout n;
    private TextView o;
    private TextView p;
    private int q;
    private int r;
    private Drawable s;
    private boolean t;
    private int u;
    private c v;
    private boolean w;
    private int x;
    
    public ActionBarContextView(final Context context) {
        this(context, null);
    }
    
    public ActionBarContextView(final Context context, final AttributeSet set) {
        this(context, set, android.support.v7.b.a.a.actionModeStyle);
    }
    
    public ActionBarContextView(final Context context, final AttributeSet set, final int n) {
        super(context, set, n);
        final q a = android.support.v7.internal.widget.q.a(context, set, android.support.v7.b.a.i.ActionMode, n);
        this.setBackgroundDrawable(a.a(android.support.v7.b.a.i.ActionMode_background));
        this.q = a.e(android.support.v7.b.a.i.ActionMode_titleTextStyle, 0);
        this.r = a.e(android.support.v7.b.a.i.ActionMode_subtitleTextStyle, 0);
        this.h = a.d(android.support.v7.b.a.i.ActionMode_height, 0);
        this.s = a.a(android.support.v7.b.a.i.ActionMode_backgroundSplit);
        this.u = a.e(android.support.v7.b.a.i.ActionMode_closeItemLayout, android.support.v7.b.a.g.abc_action_mode_close_item_material);
        a.a.recycle();
    }
    
    private void a() {
        final int n = 8;
        boolean b = true;
        if (this.n == null) {
            LayoutInflater.from(this.getContext()).inflate(android.support.v7.b.a.g.abc_action_bar_title_item, (ViewGroup)this);
            this.n = (LinearLayout)this.getChildAt(this.getChildCount() - 1);
            this.o = (TextView)this.n.findViewById(android.support.v7.b.a.e.action_bar_title);
            this.p = (TextView)this.n.findViewById(android.support.v7.b.a.e.action_bar_subtitle);
            if (this.q != 0) {
                this.o.setTextAppearance(this.getContext(), this.q);
            }
            if (this.r != 0) {
                this.p.setTextAppearance(this.getContext(), this.r);
            }
        }
        this.o.setText(this.j);
        this.p.setText(this.k);
        int n2;
        if (!TextUtils.isEmpty(this.j)) {
            n2 = 1;
        }
        else {
            n2 = 0;
        }
        if (TextUtils.isEmpty(this.k)) {
            b = false;
        }
        final TextView p = this.p;
        int visibility;
        if (b) {
            visibility = 0;
        }
        else {
            visibility = 8;
        }
        p.setVisibility(visibility);
        final LinearLayout n3 = this.n;
        int visibility2 = 0;
        Label_0204: {
            if (n2 == 0) {
                visibility2 = n;
                if (!b) {
                    break Label_0204;
                }
            }
            visibility2 = 0;
        }
        n3.setVisibility(visibility2);
        if (this.n.getParent() == null) {
            this.addView((View)this.n);
        }
    }
    
    @Override
    public final void a(final View view) {
    }
    
    @Override
    public final void b(final View view) {
        if (this.x == 2) {
            final c v = this.v;
            if (v != null) {
                this.v = null;
                if (v.c) {
                    final Iterator<ae> iterator = v.a.iterator();
                    while (iterator.hasNext()) {
                        iterator.next().a();
                    }
                    v.c = false;
                }
            }
            this.removeAllViews();
            if (this.e != null) {
                this.e.removeView((View)this.c);
            }
            this.m = null;
            this.c = null;
            this.w = false;
        }
        this.x = 0;
    }
    
    @Override
    public final void c(final View view) {
    }
    
    protected ViewGroup$LayoutParams generateDefaultLayoutParams() {
        return (ViewGroup$LayoutParams)new ViewGroup$MarginLayoutParams(-1, -2);
    }
    
    public ViewGroup$LayoutParams generateLayoutParams(final AttributeSet set) {
        return (ViewGroup$LayoutParams)new ViewGroup$MarginLayoutParams(this.getContext(), set);
    }
    
    public CharSequence getSubtitle() {
        return this.k;
    }
    
    public CharSequence getTitle() {
        return this.j;
    }
    
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.d != null) {
            this.d.d();
            this.d.f();
        }
    }
    
    public void onInitializeAccessibilityEvent(final AccessibilityEvent accessibilityEvent) {
        if (Build$VERSION.SDK_INT >= 14) {
            if (accessibilityEvent.getEventType() == 32) {
                accessibilityEvent.setSource((View)this);
                accessibilityEvent.setClassName((CharSequence)this.getClass().getName());
                accessibilityEvent.setPackageName((CharSequence)this.getContext().getPackageName());
                accessibilityEvent.setContentDescription(this.j);
            }
            else {
                super.onInitializeAccessibilityEvent(accessibilityEvent);
            }
        }
    }
    
    protected void onLayout(final boolean b, int paddingLeft, int i, final int n, int n2) {
        final boolean a = android.support.v7.internal.widget.s.a((View)this);
        int paddingLeft2;
        if (a) {
            paddingLeft2 = n - paddingLeft - this.getPaddingRight();
        }
        else {
            paddingLeft2 = this.getPaddingLeft();
        }
        final int paddingTop = this.getPaddingTop();
        final int n3 = n2 - i - this.getPaddingTop() - this.getPaddingBottom();
        i = paddingLeft2;
        if (this.l != null) {
            i = paddingLeft2;
            if (this.l.getVisibility() != 8) {
                final ViewGroup$MarginLayoutParams viewGroup$MarginLayoutParams = (ViewGroup$MarginLayoutParams)this.l.getLayoutParams();
                if (a) {
                    i = viewGroup$MarginLayoutParams.rightMargin;
                }
                else {
                    i = viewGroup$MarginLayoutParams.leftMargin;
                }
                if (a) {
                    n2 = viewGroup$MarginLayoutParams.leftMargin;
                }
                else {
                    n2 = viewGroup$MarginLayoutParams.rightMargin;
                }
                i = android.support.v7.internal.widget.a.a(paddingLeft2, i, a);
                n2 = (i = android.support.v7.internal.widget.a.a(i + android.support.v7.internal.widget.a.a(this.l, i, paddingTop, n3, a), n2, a));
                if (this.w) {
                    this.x = 1;
                    android.support.v4.view.u.a(this.l, (float)(-this.l.getWidth() - ((ViewGroup$MarginLayoutParams)this.l.getLayoutParams()).leftMargin));
                    final ae j = android.support.v4.view.u.i(this.l);
                    final View view = j.a.get();
                    if (view != null) {
                        ae.b.a(j, view);
                    }
                    j.a(200L);
                    j.a(this);
                    j.a((Interpolator)new DecelerateInterpolator());
                    final c v = new c();
                    v.a(j);
                    if (this.c != null) {
                        i = this.c.getChildCount();
                        if (i > 0) {
                            --i;
                            while (i >= 0) {
                                final View child = this.c.getChildAt(i);
                                android.support.v4.view.u.j(child);
                                final ae k = android.support.v4.view.u.i(child);
                                final View view2 = k.a.get();
                                if (view2 != null) {
                                    ae.b.b(k, view2);
                                }
                                k.a(300L);
                                v.a(k);
                                --i;
                            }
                        }
                    }
                    (this.v = v).a();
                    this.w = false;
                    i = n2;
                }
            }
        }
        n2 = i;
        if (this.n != null) {
            n2 = i;
            if (this.m == null) {
                n2 = i;
                if (this.n.getVisibility() != 8) {
                    n2 = i + android.support.v7.internal.widget.a.a((View)this.n, i, paddingTop, n3, a);
                }
            }
        }
        if (this.m != null) {
            android.support.v7.internal.widget.a.a(this.m, n2, paddingTop, n3, a);
        }
        if (a) {
            paddingLeft = this.getPaddingLeft();
        }
        else {
            paddingLeft = n - paddingLeft - this.getPaddingRight();
        }
        if (this.c != null) {
            android.support.v7.internal.widget.a.a((View)this.c, paddingLeft, paddingTop, n3, !a);
        }
    }
    
    protected void onMeasure(int visibility, int i) {
        final int n = 1073741824;
        final int n2 = 0;
        if (View$MeasureSpec.getMode(visibility) != 1073741824) {
            throw new IllegalStateException(this.getClass().getSimpleName() + " can only be used with android:layout_width=\"match_parent\" (or fill_parent)");
        }
        if (View$MeasureSpec.getMode(i) == 0) {
            throw new IllegalStateException(this.getClass().getSimpleName() + " can only be used with android:layout_height=\"wrap_content\"");
        }
        final int size = View$MeasureSpec.getSize(visibility);
        int n3;
        if (this.h > 0) {
            n3 = this.h;
        }
        else {
            n3 = View$MeasureSpec.getSize(i);
        }
        final int n4 = this.getPaddingTop() + this.getPaddingBottom();
        visibility = size - this.getPaddingLeft() - this.getPaddingRight();
        final int b = n3 - n4;
        final int measureSpec = View$MeasureSpec.makeMeasureSpec(b, Integer.MIN_VALUE);
        i = visibility;
        if (this.l != null) {
            i = android.support.v7.internal.widget.a.a(this.l, visibility, measureSpec);
            final ViewGroup$MarginLayoutParams viewGroup$MarginLayoutParams = (ViewGroup$MarginLayoutParams)this.l.getLayoutParams();
            visibility = viewGroup$MarginLayoutParams.leftMargin;
            i -= viewGroup$MarginLayoutParams.rightMargin + visibility;
        }
        visibility = i;
        if (this.c != null) {
            visibility = i;
            if (this.c.getParent() == this) {
                visibility = android.support.v7.internal.widget.a.a((View)this.c, i, measureSpec);
            }
        }
        i = visibility;
        if (this.n != null) {
            i = visibility;
            if (this.m == null) {
                if (this.t) {
                    i = View$MeasureSpec.makeMeasureSpec(0, 0);
                    this.n.measure(i, measureSpec);
                    final int measuredWidth = this.n.getMeasuredWidth();
                    boolean b2;
                    if (measuredWidth <= visibility) {
                        b2 = true;
                    }
                    else {
                        b2 = false;
                    }
                    i = visibility;
                    if (b2) {
                        i = visibility - measuredWidth;
                    }
                    final LinearLayout n5 = this.n;
                    if (b2) {
                        visibility = 0;
                    }
                    else {
                        visibility = 8;
                    }
                    n5.setVisibility(visibility);
                }
                else {
                    i = android.support.v7.internal.widget.a.a((View)this.n, visibility, measureSpec);
                }
            }
        }
        if (this.m != null) {
            final ViewGroup$LayoutParams layoutParams = this.m.getLayoutParams();
            if (layoutParams.width != -2) {
                visibility = 1073741824;
            }
            else {
                visibility = Integer.MIN_VALUE;
            }
            int min = i;
            if (layoutParams.width >= 0) {
                min = Math.min(layoutParams.width, i);
            }
            if (layoutParams.height != -2) {
                i = n;
            }
            else {
                i = Integer.MIN_VALUE;
            }
            int min2;
            if (layoutParams.height >= 0) {
                min2 = Math.min(layoutParams.height, b);
            }
            else {
                min2 = b;
            }
            this.m.measure(View$MeasureSpec.makeMeasureSpec(min, visibility), View$MeasureSpec.makeMeasureSpec(min2, i));
        }
        if (this.h <= 0) {
            final int childCount = this.getChildCount();
            visibility = 0;
            int n6;
            for (i = n2; i < childCount; ++i) {
                n6 = this.getChildAt(i).getMeasuredHeight() + n4;
                if (n6 > visibility) {
                    visibility = n6;
                }
            }
            this.setMeasuredDimension(size, visibility);
        }
        else {
            this.setMeasuredDimension(size, n3);
        }
    }
    
    @Override
    public void setContentHeight(final int h) {
        this.h = h;
    }
    
    public void setCustomView(final View m) {
        if (this.m != null) {
            this.removeView(this.m);
        }
        this.m = m;
        if (this.n != null) {
            this.removeView((View)this.n);
            this.n = null;
        }
        if (m != null) {
            this.addView(m);
        }
        this.requestLayout();
    }
    
    @Override
    public void setSplitToolbar(final boolean splitToolbar) {
        if (this.f != splitToolbar) {
            if (this.d != null) {
                final ViewGroup$LayoutParams viewGroup$LayoutParams = new ViewGroup$LayoutParams(-2, -1);
                if (!splitToolbar) {
                    (this.c = (ActionMenuView)this.d.a(this)).setBackgroundDrawable((Drawable)null);
                    final ViewGroup viewGroup = (ViewGroup)this.c.getParent();
                    if (viewGroup != null) {
                        viewGroup.removeView((View)this.c);
                    }
                    this.addView((View)this.c, viewGroup$LayoutParams);
                }
                else {
                    final android.support.v7.widget.a d = this.d;
                    d.k = this.getContext().getResources().getDisplayMetrics().widthPixels;
                    d.n = true;
                    d.o = true;
                    final android.support.v7.widget.a d2 = this.d;
                    d2.l = Integer.MAX_VALUE;
                    d2.m = true;
                    viewGroup$LayoutParams.width = -1;
                    viewGroup$LayoutParams.height = this.h;
                    (this.c = (ActionMenuView)this.d.a(this)).setBackgroundDrawable(this.s);
                    final ViewGroup viewGroup2 = (ViewGroup)this.c.getParent();
                    if (viewGroup2 != null) {
                        viewGroup2.removeView((View)this.c);
                    }
                    this.e.addView((View)this.c, viewGroup$LayoutParams);
                }
            }
            super.setSplitToolbar(splitToolbar);
        }
    }
    
    public void setSubtitle(final CharSequence k) {
        this.k = k;
        this.a();
    }
    
    public void setTitle(final CharSequence j) {
        this.j = j;
        this.a();
    }
    
    public void setTitleOptional(final boolean t) {
        if (t != this.t) {
            this.requestLayout();
        }
        this.t = t;
    }
    
    public boolean shouldDelayChildPressedState() {
        return false;
    }
}
