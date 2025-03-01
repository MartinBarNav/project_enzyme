/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.graphics.drawable.Drawable
 *  android.os.Build$VERSION
 *  android.text.TextUtils
 *  android.util.AttributeSet
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.View$MeasureSpec
 *  android.view.ViewGroup
 *  android.view.ViewGroup$LayoutParams
 *  android.view.ViewGroup$MarginLayoutParams
 *  android.view.accessibility.AccessibilityEvent
 *  android.view.animation.DecelerateInterpolator
 *  android.view.animation.Interpolator
 *  android.widget.LinearLayout
 *  android.widget.TextView
 */
package android.support.v7.internal.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.support.v4.view.ae;
import android.support.v4.view.ah;
import android.support.v4.view.u;
import android.support.v7.b.a;
import android.support.v7.internal.view.c;
import android.support.v7.internal.widget.a;
import android.support.v7.internal.widget.q;
import android.support.v7.internal.widget.s;
import android.support.v7.widget.ActionMenuView;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.widget.LinearLayout;
import android.widget.TextView;

public class ActionBarContextView
extends a
implements ah {
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

    public ActionBarContextView(Context context) {
        this(context, null);
    }

    public ActionBarContextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, a.a.actionModeStyle);
    }

    public ActionBarContextView(Context object, AttributeSet attributeSet, int n2) {
        super((Context)object, attributeSet, n2);
        object = android.support.v7.internal.widget.q.a((Context)object, attributeSet, a.i.ActionMode, n2);
        this.setBackgroundDrawable(((q)object).a(a.i.ActionMode_background));
        this.q = ((q)object).e(a.i.ActionMode_titleTextStyle, 0);
        this.r = ((q)object).e(a.i.ActionMode_subtitleTextStyle, 0);
        this.h = ((q)object).d(a.i.ActionMode_height, 0);
        this.s = ((q)object).a(a.i.ActionMode_backgroundSplit);
        this.u = ((q)object).e(a.i.ActionMode_closeItemLayout, a.g.abc_action_mode_close_item_material);
        ((q)object).a.recycle();
    }

    /*
     * Enabled aggressive block sorting
     */
    private void a() {
        TextView textView;
        int n2;
        block9: {
            block8: {
                int n3 = 8;
                boolean bl = true;
                if (this.n == null) {
                    LayoutInflater.from((Context)this.getContext()).inflate(a.g.abc_action_bar_title_item, (ViewGroup)this);
                    this.n = (LinearLayout)this.getChildAt(this.getChildCount() - 1);
                    this.o = (TextView)this.n.findViewById(a.e.action_bar_title);
                    this.p = (TextView)this.n.findViewById(a.e.action_bar_subtitle);
                    if (this.q != 0) {
                        this.o.setTextAppearance(this.getContext(), this.q);
                    }
                    if (this.r != 0) {
                        this.p.setTextAppearance(this.getContext(), this.r);
                    }
                }
                this.o.setText(this.j);
                this.p.setText(this.k);
                n2 = !TextUtils.isEmpty((CharSequence)this.j) ? 1 : 0;
                if (TextUtils.isEmpty((CharSequence)this.k)) {
                    bl = false;
                }
                textView = this.p;
                int n4 = bl ? 0 : 8;
                textView.setVisibility(n4);
                textView = this.n;
                if (n2 != 0) break block8;
                n2 = n3;
                if (!bl) break block9;
            }
            n2 = 0;
        }
        textView.setVisibility(n2);
        if (this.n.getParent() == null) {
            this.addView((View)this.n);
        }
    }

    @Override
    public final void a(View view) {
    }

    @Override
    public final void b(View object) {
        if (this.x == 2) {
            c c2 = this.v;
            if (c2 != null) {
                this.v = null;
                if (c2.c) {
                    object = c2.a.iterator();
                    while (object.hasNext()) {
                        ((ae)object.next()).a();
                    }
                    c2.c = false;
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
    public final void c(View view) {
    }

    protected ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new ViewGroup.MarginLayoutParams(-1, -2);
    }

    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new ViewGroup.MarginLayoutParams(this.getContext(), attributeSet);
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

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        block4: {
            block3: {
                if (Build.VERSION.SDK_INT < 14) break block3;
                if (accessibilityEvent.getEventType() != 32) break block4;
                accessibilityEvent.setSource((View)this);
                accessibilityEvent.setClassName((CharSequence)this.getClass().getName());
                accessibilityEvent.setPackageName((CharSequence)this.getContext().getPackageName());
                accessibilityEvent.setContentDescription(this.j);
            }
            return;
        }
        super.onInitializeAccessibilityEvent(accessibilityEvent);
    }

    /*
     * Enabled aggressive block sorting
     */
    protected void onLayout(boolean bl, int n2, int n3, int n4, int n5) {
        Object object;
        bl = android.support.v7.internal.widget.s.a((View)this);
        int n6 = bl ? n4 - n2 - this.getPaddingRight() : this.getPaddingLeft();
        int n7 = this.getPaddingTop();
        int n8 = n5 - n3 - this.getPaddingTop() - this.getPaddingBottom();
        n3 = n6;
        if (this.l != null) {
            n3 = n6;
            if (this.l.getVisibility() != 8) {
                object = (ViewGroup.MarginLayoutParams)this.l.getLayoutParams();
                n3 = bl ? ((ViewGroup.MarginLayoutParams)object).rightMargin : ((ViewGroup.MarginLayoutParams)object).leftMargin;
                n5 = bl ? ((ViewGroup.MarginLayoutParams)object).leftMargin : ((ViewGroup.MarginLayoutParams)object).rightMargin;
                n3 = ActionBarContextView.a(n6, n3, bl);
                n3 = n5 = ActionBarContextView.a(n3 + ActionBarContextView.a(this.l, n3, n7, n8, bl), n5, bl);
                if (this.w) {
                    this.x = 1;
                    android.support.v4.view.u.a(this.l, (float)(-this.l.getWidth() - ((ViewGroup.MarginLayoutParams)this.l.getLayoutParams()).leftMargin));
                    ae ae2 = android.support.v4.view.u.i(this.l);
                    object = (View)ae2.a.get();
                    if (object != null) {
                        ae.b.a(ae2, (View)object);
                    }
                    ae2.a(200L);
                    ae2.a(this);
                    ae2.a((Interpolator)new DecelerateInterpolator());
                    object = new c();
                    ((c)object).a(ae2);
                    if (this.c != null && (n3 = this.c.getChildCount()) > 0) {
                        --n3;
                        while (n3 >= 0) {
                            ae2 = this.c.getChildAt(n3);
                            android.support.v4.view.u.j((View)ae2);
                            ae2 = android.support.v4.view.u.i((View)ae2);
                            View view = (View)ae2.a.get();
                            if (view != null) {
                                ae.b.b(ae2, view);
                            }
                            ae2.a(300L);
                            ((c)object).a(ae2);
                            --n3;
                        }
                    }
                    this.v = object;
                    this.v.a();
                    this.w = false;
                    n3 = n5;
                }
            }
        }
        n5 = n3;
        if (this.n != null) {
            n5 = n3;
            if (this.m == null) {
                n5 = n3;
                if (this.n.getVisibility() != 8) {
                    n5 = n3 + ActionBarContextView.a((View)this.n, n3, n7, n8, bl);
                }
            }
        }
        if (this.m != null) {
            ActionBarContextView.a(this.m, n5, n7, n8, bl);
        }
        n2 = bl ? this.getPaddingLeft() : n4 - n2 - this.getPaddingRight();
        if (this.c != null) {
            object = this.c;
            bl = !bl;
            ActionBarContextView.a((View)object, n2, n7, n8, bl);
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    protected void onMeasure(int n2, int n3) {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        int n4 = 0x40000000;
        int n5 = 0;
        if (View.MeasureSpec.getMode((int)n2) != 0x40000000) {
            throw new IllegalStateException(this.getClass().getSimpleName() + " can only be used with android:layout_width=\"match_parent\" (or fill_parent)");
        }
        if (View.MeasureSpec.getMode((int)n3) == 0) {
            throw new IllegalStateException(this.getClass().getSimpleName() + " can only be used with android:layout_height=\"wrap_content\"");
        }
        int n6 = View.MeasureSpec.getSize((int)n2);
        int n7 = this.h > 0 ? this.h : View.MeasureSpec.getSize((int)n3);
        int n8 = this.getPaddingTop() + this.getPaddingBottom();
        n2 = n6 - this.getPaddingLeft() - this.getPaddingRight();
        int n9 = n7 - n8;
        int n10 = View.MeasureSpec.makeMeasureSpec((int)n9, (int)Integer.MIN_VALUE);
        n3 = n2;
        if (this.l != null) {
            n3 = ActionBarContextView.a(this.l, n2, n10);
            marginLayoutParams = (ViewGroup.MarginLayoutParams)this.l.getLayoutParams();
            n2 = marginLayoutParams.leftMargin;
            n3 -= marginLayoutParams.rightMargin + n2;
        }
        n2 = n3;
        if (this.c != null) {
            n2 = n3;
            if (this.c.getParent() == this) {
                n2 = ActionBarContextView.a((View)this.c, n3, n10);
            }
        }
        n3 = n2;
        if (this.n != null) {
            n3 = n2;
            if (this.m == null) {
                if (this.t) {
                    n3 = View.MeasureSpec.makeMeasureSpec((int)0, (int)0);
                    this.n.measure(n3, n10);
                    int n11 = this.n.getMeasuredWidth();
                    n10 = n11 <= n2 ? 1 : 0;
                    n3 = n2;
                    if (n10 != 0) {
                        n3 = n2 - n11;
                    }
                    marginLayoutParams = this.n;
                    n2 = n10 != 0 ? 0 : 8;
                    marginLayoutParams.setVisibility(n2);
                } else {
                    n3 = ActionBarContextView.a((View)this.n, n2, n10);
                }
            }
        }
        if (this.m != null) {
            marginLayoutParams = this.m.getLayoutParams();
            n2 = marginLayoutParams.width != -2 ? 0x40000000 : Integer.MIN_VALUE;
            n10 = n3;
            if (marginLayoutParams.width >= 0) {
                n10 = Math.min(marginLayoutParams.width, n3);
            }
            n3 = marginLayoutParams.height != -2 ? n4 : Integer.MIN_VALUE;
            n4 = marginLayoutParams.height >= 0 ? Math.min(marginLayoutParams.height, n9) : n9;
            this.m.measure(View.MeasureSpec.makeMeasureSpec((int)n10, (int)n2), View.MeasureSpec.makeMeasureSpec((int)n4, (int)n3));
        }
        if (this.h > 0) {
            this.setMeasuredDimension(n6, n7);
            return;
        }
        n10 = this.getChildCount();
        n2 = 0;
        n3 = n5;
        while (true) {
            if (n3 >= n10) {
                this.setMeasuredDimension(n6, n2);
                return;
            }
            n7 = this.getChildAt(n3).getMeasuredHeight() + n8;
            if (n7 > n2) {
                n2 = n7;
            }
            ++n3;
        }
    }

    @Override
    public void setContentHeight(int n2) {
        this.h = n2;
    }

    public void setCustomView(View view) {
        if (this.m != null) {
            this.removeView(this.m);
        }
        this.m = view;
        if (this.n != null) {
            this.removeView((View)this.n);
            this.n = null;
        }
        if (view != null) {
            this.addView(view);
        }
        this.requestLayout();
    }

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public void setSplitToolbar(boolean bl) {
        if (this.f != bl) {
            if (this.d != null) {
                ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-2, -1);
                if (!bl) {
                    this.c = (ActionMenuView)this.d.a(this);
                    this.c.setBackgroundDrawable(null);
                    ViewGroup viewGroup = (ViewGroup)this.c.getParent();
                    if (viewGroup != null) {
                        viewGroup.removeView((View)this.c);
                    }
                    this.addView((View)this.c, layoutParams);
                } else {
                    android.support.v7.widget.a a2 = this.d;
                    a2.k = this.getContext().getResources().getDisplayMetrics().widthPixels;
                    a2.n = true;
                    a2.o = true;
                    a2 = this.d;
                    a2.l = Integer.MAX_VALUE;
                    a2.m = true;
                    layoutParams.width = -1;
                    layoutParams.height = this.h;
                    this.c = (ActionMenuView)this.d.a(this);
                    this.c.setBackgroundDrawable(this.s);
                    a2 = (ViewGroup)this.c.getParent();
                    if (a2 != null) {
                        a2.removeView((View)this.c);
                    }
                    this.e.addView((View)this.c, layoutParams);
                }
            }
            super.setSplitToolbar(bl);
        }
    }

    public void setSubtitle(CharSequence charSequence) {
        this.k = charSequence;
        this.a();
    }

    public void setTitle(CharSequence charSequence) {
        this.j = charSequence;
        this.a();
    }

    public void setTitleOptional(boolean bl) {
        if (bl != this.t) {
            this.requestLayout();
        }
        this.t = bl;
    }

    public boolean shouldDelayChildPressedState() {
        return false;
    }
}

