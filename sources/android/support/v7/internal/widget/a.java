package android.support.v7.internal.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.os.Build;
import android.support.v4.view.ae;
import android.support.v4.view.ah;
import android.support.v7.b.a;
import android.support.v7.widget.ActionMenuView;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;

abstract class a extends ViewGroup {
    private static final Interpolator j = new DecelerateInterpolator();
    protected final C0013a a;
    protected final Context b;
    protected ActionMenuView c;
    protected android.support.v7.widget.a d;
    protected ViewGroup e;
    protected boolean f;
    protected boolean g;
    protected int h;
    protected ae i;

    a(Context context) {
        this(context, (AttributeSet) null);
    }

    a(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    a(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.a = new C0013a();
        TypedValue typedValue = new TypedValue();
        if (!context.getTheme().resolveAttribute(a.C0011a.actionBarPopupTheme, typedValue, true) || typedValue.resourceId == 0) {
            this.b = context;
        } else {
            this.b = new ContextThemeWrapper(context, typedValue.resourceId);
        }
    }

    /* access modifiers changed from: protected */
    public void onConfigurationChanged(Configuration configuration) {
        if (Build.VERSION.SDK_INT >= 8) {
            super.onConfigurationChanged(configuration);
        }
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes((AttributeSet) null, a.i.ActionBar, a.C0011a.actionBarStyle, 0);
        setContentHeight(obtainStyledAttributes.getLayoutDimension(a.i.ActionBar_height, 0));
        obtainStyledAttributes.recycle();
        if (this.d != null) {
            this.d.b();
        }
    }

    public void setSplitToolbar(boolean z) {
        this.f = z;
    }

    public void setSplitWhenNarrow(boolean z) {
        this.g = z;
    }

    public void setContentHeight(int i2) {
        this.h = i2;
        requestLayout();
    }

    public int getContentHeight() {
        return this.h;
    }

    public void setSplitView(ViewGroup viewGroup) {
        this.e = viewGroup;
    }

    public int getAnimatedVisibility() {
        if (this.i != null) {
            return this.a.a;
        }
        return getVisibility();
    }

    protected static int a(View view, int i2, int i3) {
        view.measure(View.MeasureSpec.makeMeasureSpec(i2, Integer.MIN_VALUE), i3);
        return Math.max(0, (i2 - view.getMeasuredWidth()) + 0);
    }

    protected static int a(int i2, int i3, boolean z) {
        return z ? i2 - i3 : i2 + i3;
    }

    protected static int a(View view, int i2, int i3, int i4, boolean z) {
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        int i5 = ((i4 - measuredHeight) / 2) + i3;
        if (z) {
            view.layout(i2 - measuredWidth, i5, i2, measuredHeight + i5);
        } else {
            view.layout(i2, i5, i2 + measuredWidth, measuredHeight + i5);
        }
        return z ? -measuredWidth : measuredWidth;
    }

    /* renamed from: android.support.v7.internal.widget.a$a  reason: collision with other inner class name */
    protected class C0013a implements ah {
        int a;
        private boolean c = false;

        protected C0013a() {
        }

        public final void a(View view) {
            a.this.setVisibility(0);
            this.c = false;
        }

        public final void b(View view) {
            if (!this.c) {
                a.this.i = null;
                a.this.setVisibility(this.a);
                if (a.this.e != null && a.this.c != null) {
                    a.this.c.setVisibility(this.a);
                }
            }
        }

        public final void c(View view) {
            this.c = true;
        }
    }
}
