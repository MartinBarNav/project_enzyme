package android.support.v7.internal.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.support.v4.view.ae;
import android.support.v4.view.ah;
import android.support.v4.view.u;
import android.support.v7.b.a;
import android.support.v7.internal.view.c;
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
import java.util.Iterator;

public class ActionBarContextView extends a implements ah {
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

    public /* bridge */ /* synthetic */ int getAnimatedVisibility() {
        return super.getAnimatedVisibility();
    }

    public /* bridge */ /* synthetic */ int getContentHeight() {
        return super.getContentHeight();
    }

    public /* bridge */ /* synthetic */ void setSplitView(ViewGroup viewGroup) {
        super.setSplitView(viewGroup);
    }

    public /* bridge */ /* synthetic */ void setSplitWhenNarrow(boolean z) {
        super.setSplitWhenNarrow(z);
    }

    public ActionBarContextView(Context context) {
        this(context, (AttributeSet) null);
    }

    public ActionBarContextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, a.C0011a.actionModeStyle);
    }

    public ActionBarContextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        q a = q.a(context, attributeSet, a.i.ActionMode, i);
        setBackgroundDrawable(a.a(a.i.ActionMode_background));
        this.q = a.e(a.i.ActionMode_titleTextStyle, 0);
        this.r = a.e(a.i.ActionMode_subtitleTextStyle, 0);
        this.h = a.d(a.i.ActionMode_height, 0);
        this.s = a.a(a.i.ActionMode_backgroundSplit);
        this.u = a.e(a.i.ActionMode_closeItemLayout, a.g.abc_action_mode_close_item_material);
        a.a.recycle();
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.d != null) {
            this.d.d();
            this.d.f();
        }
    }

    public void setSplitToolbar(boolean z) {
        if (this.f != z) {
            if (this.d != null) {
                ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-2, -1);
                if (!z) {
                    this.c = (ActionMenuView) this.d.a((ViewGroup) this);
                    this.c.setBackgroundDrawable((Drawable) null);
                    ViewGroup viewGroup = (ViewGroup) this.c.getParent();
                    if (viewGroup != null) {
                        viewGroup.removeView(this.c);
                    }
                    addView(this.c, layoutParams);
                } else {
                    android.support.v7.widget.a aVar = this.d;
                    aVar.k = getContext().getResources().getDisplayMetrics().widthPixels;
                    aVar.n = true;
                    aVar.o = true;
                    android.support.v7.widget.a aVar2 = this.d;
                    aVar2.l = Integer.MAX_VALUE;
                    aVar2.m = true;
                    layoutParams.width = -1;
                    layoutParams.height = this.h;
                    this.c = (ActionMenuView) this.d.a((ViewGroup) this);
                    this.c.setBackgroundDrawable(this.s);
                    ViewGroup viewGroup2 = (ViewGroup) this.c.getParent();
                    if (viewGroup2 != null) {
                        viewGroup2.removeView(this.c);
                    }
                    this.e.addView(this.c, layoutParams);
                }
            }
            super.setSplitToolbar(z);
        }
    }

    public void setContentHeight(int i) {
        this.h = i;
    }

    public void setCustomView(View view) {
        if (this.m != null) {
            removeView(this.m);
        }
        this.m = view;
        if (this.n != null) {
            removeView(this.n);
            this.n = null;
        }
        if (view != null) {
            addView(view);
        }
        requestLayout();
    }

    public void setTitle(CharSequence charSequence) {
        this.j = charSequence;
        a();
    }

    public void setSubtitle(CharSequence charSequence) {
        this.k = charSequence;
        a();
    }

    public CharSequence getTitle() {
        return this.j;
    }

    public CharSequence getSubtitle() {
        return this.k;
    }

    private void a() {
        int i;
        int i2 = 8;
        boolean z = true;
        if (this.n == null) {
            LayoutInflater.from(getContext()).inflate(a.g.abc_action_bar_title_item, this);
            this.n = (LinearLayout) getChildAt(getChildCount() - 1);
            this.o = (TextView) this.n.findViewById(a.e.action_bar_title);
            this.p = (TextView) this.n.findViewById(a.e.action_bar_subtitle);
            if (this.q != 0) {
                this.o.setTextAppearance(getContext(), this.q);
            }
            if (this.r != 0) {
                this.p.setTextAppearance(getContext(), this.r);
            }
        }
        this.o.setText(this.j);
        this.p.setText(this.k);
        boolean z2 = !TextUtils.isEmpty(this.j);
        if (TextUtils.isEmpty(this.k)) {
            z = false;
        }
        TextView textView = this.p;
        if (z) {
            i = 0;
        } else {
            i = 8;
        }
        textView.setVisibility(i);
        LinearLayout linearLayout = this.n;
        if (z2 || z) {
            i2 = 0;
        }
        linearLayout.setVisibility(i2);
        if (this.n.getParent() == null) {
            addView(this.n);
        }
    }

    /* access modifiers changed from: protected */
    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new ViewGroup.MarginLayoutParams(-1, -2);
    }

    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new ViewGroup.MarginLayoutParams(getContext(), attributeSet);
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        int i3;
        int i4;
        int i5 = 1073741824;
        int i6 = 0;
        if (View.MeasureSpec.getMode(i) != 1073741824) {
            throw new IllegalStateException(getClass().getSimpleName() + " can only be used with android:layout_width=\"match_parent\" (or fill_parent)");
        } else if (View.MeasureSpec.getMode(i2) == 0) {
            throw new IllegalStateException(getClass().getSimpleName() + " can only be used with android:layout_height=\"wrap_content\"");
        } else {
            int size = View.MeasureSpec.getSize(i);
            int size2 = this.h > 0 ? this.h : View.MeasureSpec.getSize(i2);
            int paddingTop = getPaddingTop() + getPaddingBottom();
            int paddingLeft = (size - getPaddingLeft()) - getPaddingRight();
            int i7 = size2 - paddingTop;
            int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i7, Integer.MIN_VALUE);
            if (this.l != null) {
                int a = a(this.l, paddingLeft, makeMeasureSpec);
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.l.getLayoutParams();
                paddingLeft = a - (marginLayoutParams.rightMargin + marginLayoutParams.leftMargin);
            }
            if (this.c != null && this.c.getParent() == this) {
                paddingLeft = a((View) this.c, paddingLeft, makeMeasureSpec);
            }
            if (this.n != null && this.m == null) {
                if (this.t) {
                    this.n.measure(View.MeasureSpec.makeMeasureSpec(0, 0), makeMeasureSpec);
                    int measuredWidth = this.n.getMeasuredWidth();
                    boolean z = measuredWidth <= paddingLeft;
                    if (z) {
                        paddingLeft -= measuredWidth;
                    }
                    this.n.setVisibility(z ? 0 : 8);
                } else {
                    paddingLeft = a((View) this.n, paddingLeft, makeMeasureSpec);
                }
            }
            if (this.m != null) {
                ViewGroup.LayoutParams layoutParams = this.m.getLayoutParams();
                if (layoutParams.width != -2) {
                    i3 = 1073741824;
                } else {
                    i3 = Integer.MIN_VALUE;
                }
                if (layoutParams.width >= 0) {
                    paddingLeft = Math.min(layoutParams.width, paddingLeft);
                }
                if (layoutParams.height == -2) {
                    i5 = Integer.MIN_VALUE;
                }
                if (layoutParams.height >= 0) {
                    i4 = Math.min(layoutParams.height, i7);
                } else {
                    i4 = i7;
                }
                this.m.measure(View.MeasureSpec.makeMeasureSpec(paddingLeft, i3), View.MeasureSpec.makeMeasureSpec(i4, i5));
            }
            if (this.h <= 0) {
                int childCount = getChildCount();
                int i8 = 0;
                while (i6 < childCount) {
                    int measuredHeight = getChildAt(i6).getMeasuredHeight() + paddingTop;
                    if (measuredHeight <= i8) {
                        measuredHeight = i8;
                    }
                    i6++;
                    i8 = measuredHeight;
                }
                setMeasuredDimension(size, i8);
                return;
            }
            setMeasuredDimension(size, size2);
        }
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int childCount;
        boolean a = s.a(this);
        int paddingRight = a ? (i3 - i) - getPaddingRight() : getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingTop2 = ((i4 - i2) - getPaddingTop()) - getPaddingBottom();
        if (!(this.l == null || this.l.getVisibility() == 8)) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.l.getLayoutParams();
            int i5 = a ? marginLayoutParams.rightMargin : marginLayoutParams.leftMargin;
            int i6 = a ? marginLayoutParams.leftMargin : marginLayoutParams.rightMargin;
            int a2 = a(paddingRight, i5, a);
            paddingRight = a(a2 + a(this.l, a2, paddingTop, paddingTop2, a), i6, a);
            if (this.w) {
                this.x = 1;
                u.a(this.l, (float) ((-this.l.getWidth()) - ((ViewGroup.MarginLayoutParams) this.l.getLayoutParams()).leftMargin));
                ae i7 = u.i(this.l);
                View view = (View) i7.a.get();
                if (view != null) {
                    ae.b.a(i7, view);
                }
                i7.a(200);
                i7.a((ah) this);
                i7.a((Interpolator) new DecelerateInterpolator());
                c cVar = new c();
                cVar.a(i7);
                if (this.c != null && (childCount = this.c.getChildCount()) > 0) {
                    for (int i8 = childCount - 1; i8 >= 0; i8--) {
                        View childAt = this.c.getChildAt(i8);
                        u.j(childAt);
                        ae i9 = u.i(childAt);
                        View view2 = (View) i9.a.get();
                        if (view2 != null) {
                            ae.b.b(i9, view2);
                        }
                        i9.a(300);
                        cVar.a(i9);
                    }
                }
                this.v = cVar;
                this.v.a();
                this.w = false;
            }
        }
        if (!(this.n == null || this.m != null || this.n.getVisibility() == 8)) {
            paddingRight += a(this.n, paddingRight, paddingTop, paddingTop2, a);
        }
        if (this.m != null) {
            a(this.m, paddingRight, paddingTop, paddingTop2, a);
        }
        int paddingLeft = a ? getPaddingLeft() : (i3 - i) - getPaddingRight();
        if (this.c != null) {
            a(this.c, paddingLeft, paddingTop, paddingTop2, !a);
        }
    }

    public final void a(View view) {
    }

    public final void b(View view) {
        if (this.x == 2) {
            c cVar = this.v;
            if (cVar != null) {
                this.v = null;
                if (cVar.c) {
                    Iterator<ae> it = cVar.a.iterator();
                    while (it.hasNext()) {
                        it.next().a();
                    }
                    cVar.c = false;
                }
            }
            removeAllViews();
            if (this.e != null) {
                this.e.removeView(this.c);
            }
            this.m = null;
            this.c = null;
            this.w = false;
        }
        this.x = 0;
    }

    public final void c(View view) {
    }

    public boolean shouldDelayChildPressedState() {
        return false;
    }

    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        if (Build.VERSION.SDK_INT < 14) {
            return;
        }
        if (accessibilityEvent.getEventType() == 32) {
            accessibilityEvent.setSource(this);
            accessibilityEvent.setClassName(getClass().getName());
            accessibilityEvent.setPackageName(getContext().getPackageName());
            accessibilityEvent.setContentDescription(this.j);
            return;
        }
        super.onInitializeAccessibilityEvent(accessibilityEvent);
    }

    public void setTitleOptional(boolean z) {
        if (z != this.t) {
            requestLayout();
        }
        this.t = z;
    }
}
