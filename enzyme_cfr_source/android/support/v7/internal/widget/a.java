/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.res.Configuration
 *  android.os.Build$VERSION
 *  android.util.AttributeSet
 *  android.util.TypedValue
 *  android.view.ContextThemeWrapper
 *  android.view.View
 *  android.view.View$MeasureSpec
 *  android.view.ViewGroup
 *  android.view.animation.DecelerateInterpolator
 *  android.view.animation.Interpolator
 */
package android.support.v7.internal.widget;

import android.content.Context;
import android.content.res.Configuration;
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

abstract class a
extends ViewGroup {
    private static final Interpolator j = new DecelerateInterpolator();
    protected final a a = new a();
    protected final Context b;
    protected ActionMenuView c;
    protected android.support.v7.widget.a d;
    protected ViewGroup e;
    protected boolean f;
    protected boolean g;
    protected int h;
    protected ae i;

    a(Context context) {
        this(context, null);
    }

    a(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    a(Context context, AttributeSet attributeSet, int n2) {
        super(context, attributeSet, n2);
        attributeSet = new TypedValue();
        if (context.getTheme().resolveAttribute(a.a.actionBarPopupTheme, (TypedValue)attributeSet, true) && attributeSet.resourceId != 0) {
            this.b = new ContextThemeWrapper(context, attributeSet.resourceId);
            return;
        }
        this.b = context;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    protected static int a(int n2, int n3, boolean bl) {
        if (bl) {
            n2 -= n3;
            return n2;
        }
        n2 += n3;
        return n2;
    }

    protected static int a(View view, int n2, int n3) {
        view.measure(View.MeasureSpec.makeMeasureSpec((int)n2, (int)Integer.MIN_VALUE), n3);
        return Math.max(0, n2 - view.getMeasuredWidth() + 0);
    }

    /*
     * Enabled aggressive block sorting
     */
    protected static int a(View view, int n2, int n3, int n4, boolean bl) {
        int n5 = view.getMeasuredWidth();
        int n6 = view.getMeasuredHeight();
        n3 = (n4 - n6) / 2 + n3;
        if (bl) {
            view.layout(n2 - n5, n3, n2, n6 + n3);
        } else {
            view.layout(n2, n3, n2 + n5, n6 + n3);
        }
        n2 = n5;
        if (!bl) return n2;
        return -n5;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public int getAnimatedVisibility() {
        if (this.i == null) return this.getVisibility();
        return this.a.a;
    }

    public int getContentHeight() {
        return this.h;
    }

    protected void onConfigurationChanged(Configuration configuration) {
        if (Build.VERSION.SDK_INT >= 8) {
            super.onConfigurationChanged(configuration);
        }
        configuration = this.getContext().obtainStyledAttributes(null, a.i.ActionBar, a.a.actionBarStyle, 0);
        this.setContentHeight(configuration.getLayoutDimension(a.i.ActionBar_height, 0));
        configuration.recycle();
        if (this.d != null) {
            this.d.b();
        }
    }

    public void setContentHeight(int n2) {
        this.h = n2;
        this.requestLayout();
    }

    public void setSplitToolbar(boolean bl) {
        this.f = bl;
    }

    public void setSplitView(ViewGroup viewGroup) {
        this.e = viewGroup;
    }

    public void setSplitWhenNarrow(boolean bl) {
        this.g = bl;
    }

    protected final class a
    implements ah {
        int a;
        private boolean c = false;

        protected a() {
        }

        @Override
        public final void a(View view) {
            a.this.setVisibility(0);
            this.c = false;
        }

        /*
         * Enabled aggressive block sorting
         */
        @Override
        public final void b(View view) {
            if (this.c) {
                return;
            }
            a.this.i = null;
            a.this.setVisibility(this.a);
            if (a.this.e == null) return;
            if (a.this.c == null) return;
            a.this.c.setVisibility(this.a);
        }

        @Override
        public final void c(View view) {
            this.c = true;
        }
    }
}

