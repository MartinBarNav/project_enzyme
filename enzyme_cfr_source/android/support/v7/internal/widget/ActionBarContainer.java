/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.graphics.drawable.Drawable
 *  android.graphics.drawable.Drawable$Callback
 *  android.os.Build$VERSION
 *  android.util.AttributeSet
 *  android.view.ActionMode
 *  android.view.ActionMode$Callback
 *  android.view.MotionEvent
 *  android.view.View
 *  android.view.View$MeasureSpec
 *  android.view.ViewGroup$LayoutParams
 *  android.widget.FrameLayout
 *  android.widget.FrameLayout$LayoutParams
 */
package android.support.v7.internal.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.support.v7.b.a;
import android.support.v7.internal.a;
import android.support.v7.internal.widget.b;
import android.support.v7.internal.widget.c;
import android.support.v7.internal.widget.m;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;

public class ActionBarContainer
extends FrameLayout {
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
        this(context, null);
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     */
    public ActionBarContainer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        void var3_4;
        if (android.support.v7.internal.a.a()) {
            c c2 = new c(this);
        } else {
            b b2 = new b(this);
        }
        this.setBackgroundDrawable((Drawable)var3_4);
        context = context.obtainStyledAttributes(attributeSet, a.i.ActionBar);
        this.a = context.getDrawable(a.i.ActionBar_background);
        this.b = context.getDrawable(a.i.ActionBar_backgroundStacked);
        this.j = context.getDimensionPixelSize(a.i.ActionBar_height, -1);
        if (this.getId() == a.e.split_action_bar) {
            this.d = true;
            this.c = context.getDrawable(a.i.ActionBar_backgroundSplit);
        }
        context.recycle();
        boolean bl = this.d ? this.c == null : this.a == null && this.b == null;
        this.setWillNotDraw(bl);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private static boolean a(View view) {
        if (view == null) return true;
        if (view.getVisibility() == 8) return true;
        if (view.getMeasuredHeight() != 0) return false;
        return true;
    }

    private static int b(View view) {
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams)view.getLayoutParams();
        int n2 = view.getMeasuredHeight();
        int n3 = layoutParams.topMargin;
        return layoutParams.bottomMargin + (n2 + n3);
    }

    protected void drawableStateChanged() {
        super.drawableStateChanged();
        if (this.a != null && this.a.isStateful()) {
            this.a.setState(this.getDrawableState());
        }
        if (this.b != null && this.b.isStateful()) {
            this.b.setState(this.getDrawableState());
        }
        if (this.c != null && this.c.isStateful()) {
            this.c.setState(this.getDrawableState());
        }
    }

    public View getTabContainer() {
        return this.g;
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

    public void onFinishInflate() {
        super.onFinishInflate();
        this.h = this.findViewById(a.e.action_bar);
        this.i = this.findViewById(a.e.action_context_bar);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.f) return true;
        if (!super.onInterceptTouchEvent(motionEvent)) return false;
        return true;
    }

    /*
     * Enabled aggressive block sorting
     */
    public void onLayout(boolean bl, int n2, int n3, int n4, int n5) {
        int n6 = 1;
        super.onLayout(bl, n2, n3, n4, n5);
        View view = this.g;
        bl = view != null && view.getVisibility() != 8;
        if (view != null && view.getVisibility() != 8) {
            n3 = this.getMeasuredHeight();
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams)view.getLayoutParams();
            view.layout(n2, n3 - view.getMeasuredHeight() - layoutParams.bottomMargin, n4, n3 - layoutParams.bottomMargin);
        }
        if (this.d) {
            if (this.c == null) return;
            this.c.setBounds(0, 0, this.getMeasuredWidth(), this.getMeasuredHeight());
            n2 = n6;
        } else {
            if (this.a != null) {
                if (this.h.getVisibility() == 0) {
                    this.a.setBounds(this.h.getLeft(), this.h.getTop(), this.h.getRight(), this.h.getBottom());
                } else if (this.i != null && this.i.getVisibility() == 0) {
                    this.a.setBounds(this.i.getLeft(), this.i.getTop(), this.i.getRight(), this.i.getBottom());
                } else {
                    this.a.setBounds(0, 0, 0, 0);
                }
                n2 = 1;
            } else {
                n2 = 0;
            }
            this.e = bl;
            if (bl && this.b != null) {
                this.b.setBounds(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
                n2 = n6;
            }
        }
        if (n2 == 0) return;
        this.invalidate();
    }

    /*
     * Enabled aggressive block sorting
     */
    public void onMeasure(int n2, int n3) {
        int n4 = n3;
        if (this.h == null) {
            n4 = n3;
            if (View.MeasureSpec.getMode((int)n3) == Integer.MIN_VALUE) {
                n4 = n3;
                if (this.j >= 0) {
                    n4 = View.MeasureSpec.makeMeasureSpec((int)Math.min(this.j, View.MeasureSpec.getSize((int)n3)), (int)Integer.MIN_VALUE);
                }
            }
        }
        super.onMeasure(n2, n4);
        if (this.h == null) {
            return;
        }
        n3 = View.MeasureSpec.getMode((int)n4);
        if (this.g == null) return;
        if (this.g.getVisibility() == 8) return;
        if (n3 == 0x40000000) return;
        n2 = !ActionBarContainer.a(this.h) ? ActionBarContainer.b(this.h) : (!ActionBarContainer.a(this.i) ? ActionBarContainer.b(this.i) : 0);
        n3 = n3 == Integer.MIN_VALUE ? View.MeasureSpec.getSize((int)n4) : Integer.MAX_VALUE;
        this.setMeasuredDimension(this.getMeasuredWidth(), Math.min(n2 + ActionBarContainer.b(this.g), n3));
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        super.onTouchEvent(motionEvent);
        return true;
    }

    /*
     * Enabled aggressive block sorting
     */
    public void setPrimaryBackground(Drawable drawable) {
        boolean bl = true;
        if (this.a != null) {
            this.a.setCallback(null);
            this.unscheduleDrawable(this.a);
        }
        this.a = drawable;
        if (drawable != null) {
            drawable.setCallback((Drawable.Callback)this);
            if (this.h != null) {
                this.a.setBounds(this.h.getLeft(), this.h.getTop(), this.h.getRight(), this.h.getBottom());
            }
        }
        if (this.d) {
            if (this.c != null) {
                bl = false;
            }
        } else if (this.a != null || this.b != null) {
            bl = false;
        }
        this.setWillNotDraw(bl);
        this.invalidate();
    }

    /*
     * Enabled aggressive block sorting
     */
    public void setSplitBackground(Drawable drawable) {
        boolean bl = true;
        if (this.c != null) {
            this.c.setCallback(null);
            this.unscheduleDrawable(this.c);
        }
        this.c = drawable;
        if (drawable != null) {
            drawable.setCallback((Drawable.Callback)this);
            if (this.d && this.c != null) {
                this.c.setBounds(0, 0, this.getMeasuredWidth(), this.getMeasuredHeight());
            }
        }
        if (this.d) {
            if (this.c != null) {
                bl = false;
            }
        } else if (this.a != null || this.b != null) {
            bl = false;
        }
        this.setWillNotDraw(bl);
        this.invalidate();
    }

    /*
     * Enabled aggressive block sorting
     */
    public void setStackedBackground(Drawable drawable) {
        boolean bl = true;
        if (this.b != null) {
            this.b.setCallback(null);
            this.unscheduleDrawable(this.b);
        }
        this.b = drawable;
        if (drawable != null) {
            drawable.setCallback((Drawable.Callback)this);
            if (this.e && this.b != null) {
                this.b.setBounds(this.g.getLeft(), this.g.getTop(), this.g.getRight(), this.g.getBottom());
            }
        }
        if (this.d) {
            if (this.c != null) {
                bl = false;
            }
        } else if (this.a != null || this.b != null) {
            bl = false;
        }
        this.setWillNotDraw(bl);
        this.invalidate();
    }

    public void setTabContainer(m m2) {
        if (this.g != null) {
            this.removeView(this.g);
        }
        this.g = m2;
        if (m2 != null) {
            this.addView((View)m2);
            ViewGroup.LayoutParams layoutParams = m2.getLayoutParams();
            layoutParams.width = -1;
            layoutParams.height = -2;
            m2.setAllowCollapse(false);
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    public void setTransitioning(boolean bl) {
        this.f = bl;
        int n2 = bl ? 393216 : 262144;
        this.setDescendantFocusability(n2);
    }

    /*
     * Enabled aggressive block sorting
     */
    public void setVisibility(int n2) {
        super.setVisibility(n2);
        boolean bl = n2 == 0;
        if (this.a != null) {
            this.a.setVisible(bl, false);
        }
        if (this.b != null) {
            this.b.setVisible(bl, false);
        }
        if (this.c != null) {
            this.c.setVisible(bl, false);
        }
    }

    public ActionMode startActionModeForChild(View view, ActionMode.Callback callback) {
        return null;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    protected boolean verifyDrawable(Drawable drawable) {
        if (drawable == this.a) {
            if (!this.d) return true;
        }
        if (drawable == this.b) {
            if (this.e) return true;
        }
        if (drawable == this.c) {
            if (this.d) return true;
        }
        if (!super.verifyDrawable(drawable)) return false;
        return true;
    }
}

