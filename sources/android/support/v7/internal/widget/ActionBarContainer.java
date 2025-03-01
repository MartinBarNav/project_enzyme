package android.support.v7.internal.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.support.v7.b.a;
import android.support.v7.internal.a;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;

public class ActionBarContainer extends FrameLayout {
    Drawable a;
    Drawable b;
    Drawable c;
    boolean d;
    boolean e;
    private boolean f;
    private View g;
    private View h;
    private View i;
    private int j;

    public ActionBarContainer(Context context) {
        this(context, (AttributeSet) null);
    }

    public ActionBarContainer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Drawable bVar;
        if (a.a()) {
            bVar = new c(this);
        } else {
            bVar = new b(this);
        }
        setBackgroundDrawable(bVar);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, a.i.ActionBar);
        this.a = obtainStyledAttributes.getDrawable(a.i.ActionBar_background);
        this.b = obtainStyledAttributes.getDrawable(a.i.ActionBar_backgroundStacked);
        this.j = obtainStyledAttributes.getDimensionPixelSize(a.i.ActionBar_height, -1);
        if (getId() == a.e.split_action_bar) {
            this.d = true;
            this.c = obtainStyledAttributes.getDrawable(a.i.ActionBar_backgroundSplit);
        }
        obtainStyledAttributes.recycle();
        setWillNotDraw(this.d ? this.c == null : this.a == null && this.b == null);
    }

    public void onFinishInflate() {
        super.onFinishInflate();
        this.h = findViewById(a.e.action_bar);
        this.i = findViewById(a.e.action_context_bar);
    }

    public void setPrimaryBackground(Drawable drawable) {
        boolean z = true;
        if (this.a != null) {
            this.a.setCallback((Drawable.Callback) null);
            unscheduleDrawable(this.a);
        }
        this.a = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            if (this.h != null) {
                this.a.setBounds(this.h.getLeft(), this.h.getTop(), this.h.getRight(), this.h.getBottom());
            }
        }
        if (this.d) {
            if (this.c != null) {
                z = false;
            }
        } else if (!(this.a == null && this.b == null)) {
            z = false;
        }
        setWillNotDraw(z);
        invalidate();
    }

    public void setStackedBackground(Drawable drawable) {
        boolean z = true;
        if (this.b != null) {
            this.b.setCallback((Drawable.Callback) null);
            unscheduleDrawable(this.b);
        }
        this.b = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            if (this.e && this.b != null) {
                this.b.setBounds(this.g.getLeft(), this.g.getTop(), this.g.getRight(), this.g.getBottom());
            }
        }
        if (this.d) {
            if (this.c != null) {
                z = false;
            }
        } else if (!(this.a == null && this.b == null)) {
            z = false;
        }
        setWillNotDraw(z);
        invalidate();
    }

    public void setSplitBackground(Drawable drawable) {
        boolean z = true;
        if (this.c != null) {
            this.c.setCallback((Drawable.Callback) null);
            unscheduleDrawable(this.c);
        }
        this.c = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            if (this.d && this.c != null) {
                this.c.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            }
        }
        if (this.d) {
            if (this.c != null) {
                z = false;
            }
        } else if (!(this.a == null && this.b == null)) {
            z = false;
        }
        setWillNotDraw(z);
        invalidate();
    }

    public void setVisibility(int i2) {
        boolean z;
        super.setVisibility(i2);
        if (i2 == 0) {
            z = true;
        } else {
            z = false;
        }
        if (this.a != null) {
            this.a.setVisible(z, false);
        }
        if (this.b != null) {
            this.b.setVisible(z, false);
        }
        if (this.c != null) {
            this.c.setVisible(z, false);
        }
    }

    /* access modifiers changed from: protected */
    public boolean verifyDrawable(Drawable drawable) {
        return (drawable == this.a && !this.d) || (drawable == this.b && this.e) || ((drawable == this.c && this.d) || super.verifyDrawable(drawable));
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        if (this.a != null && this.a.isStateful()) {
            this.a.setState(getDrawableState());
        }
        if (this.b != null && this.b.isStateful()) {
            this.b.setState(getDrawableState());
        }
        if (this.c != null && this.c.isStateful()) {
            this.c.setState(getDrawableState());
        }
    }

    public void jumpDrawablesToCurrentState() {
        if (Build.VERSION.SDK_INT >= 11) {
            super.jumpDrawablesToCurrentState();
            if (this.a != null) {
                this.a.jumpToCurrentState();
            }
            if (this.b != null) {
                this.b.jumpToCurrentState();
            }
            if (this.c != null) {
                this.c.jumpToCurrentState();
            }
        }
    }

    public void setTransitioning(boolean z) {
        this.f = z;
        setDescendantFocusability(z ? 393216 : 262144);
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return this.f || super.onInterceptTouchEvent(motionEvent);
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        super.onTouchEvent(motionEvent);
        return true;
    }

    public void setTabContainer(m mVar) {
        if (this.g != null) {
            removeView(this.g);
        }
        this.g = mVar;
        if (mVar != null) {
            addView(mVar);
            ViewGroup.LayoutParams layoutParams = mVar.getLayoutParams();
            layoutParams.width = -1;
            layoutParams.height = -2;
            mVar.setAllowCollapse(false);
        }
    }

    public View getTabContainer() {
        return this.g;
    }

    public ActionMode startActionModeForChild(View view, ActionMode.Callback callback) {
        return null;
    }

    private static boolean a(View view) {
        return view == null || view.getVisibility() == 8 || view.getMeasuredHeight() == 0;
    }

    private static int b(View view) {
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view.getLayoutParams();
        return layoutParams.bottomMargin + view.getMeasuredHeight() + layoutParams.topMargin;
    }

    public void onMeasure(int i2, int i3) {
        int i4;
        if (this.h == null && View.MeasureSpec.getMode(i3) == Integer.MIN_VALUE && this.j >= 0) {
            i3 = View.MeasureSpec.makeMeasureSpec(Math.min(this.j, View.MeasureSpec.getSize(i3)), Integer.MIN_VALUE);
        }
        super.onMeasure(i2, i3);
        if (this.h != null) {
            int mode = View.MeasureSpec.getMode(i3);
            if (this.g != null && this.g.getVisibility() != 8 && mode != 1073741824) {
                if (!a(this.h)) {
                    i4 = b(this.h);
                } else if (!a(this.i)) {
                    i4 = b(this.i);
                } else {
                    i4 = 0;
                }
                setMeasuredDimension(getMeasuredWidth(), Math.min(i4 + b(this.g), mode == Integer.MIN_VALUE ? View.MeasureSpec.getSize(i3) : Integer.MAX_VALUE));
            }
        }
    }

    public void onLayout(boolean z, int i2, int i3, int i4, int i5) {
        boolean z2;
        boolean z3 = true;
        super.onLayout(z, i2, i3, i4, i5);
        View view = this.g;
        boolean z4 = (view == null || view.getVisibility() == 8) ? false : true;
        if (!(view == null || view.getVisibility() == 8)) {
            int measuredHeight = getMeasuredHeight();
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view.getLayoutParams();
            view.layout(i2, (measuredHeight - view.getMeasuredHeight()) - layoutParams.bottomMargin, i4, measuredHeight - layoutParams.bottomMargin);
        }
        if (!this.d) {
            if (this.a != null) {
                if (this.h.getVisibility() == 0) {
                    this.a.setBounds(this.h.getLeft(), this.h.getTop(), this.h.getRight(), this.h.getBottom());
                } else if (this.i == null || this.i.getVisibility() != 0) {
                    this.a.setBounds(0, 0, 0, 0);
                } else {
                    this.a.setBounds(this.i.getLeft(), this.i.getTop(), this.i.getRight(), this.i.getBottom());
                }
                z2 = true;
            } else {
                z2 = false;
            }
            this.e = z4;
            if (!z4 || this.b == null) {
                z3 = z2;
            } else {
                this.b.setBounds(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
            }
        } else if (this.c != null) {
            this.c.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
        } else {
            z3 = false;
        }
        if (z3) {
            invalidate();
        }
    }
}
