// 
// Decompiled by Procyon v0.5.36
// 

package android.support.v7.internal.widget;

import android.support.v4.view.ah;
import android.content.res.TypedArray;
import android.os.Build$VERSION;
import android.content.res.Configuration;
import android.view.View$MeasureSpec;
import android.view.View;
import android.view.ContextThemeWrapper;
import android.util.TypedValue;
import android.util.AttributeSet;
import android.view.animation.DecelerateInterpolator;
import android.support.v4.view.ae;
import android.support.v7.widget.ActionMenuView;
import android.content.Context;
import android.view.animation.Interpolator;
import android.view.ViewGroup;

abstract class a extends ViewGroup
{
    private static final Interpolator j;
    protected final a a;
    protected final Context b;
    protected ActionMenuView c;
    protected a d;
    protected ViewGroup e;
    protected boolean f;
    protected boolean g;
    protected int h;
    protected ae i;
    
    static {
        j = (Interpolator)new DecelerateInterpolator();
    }
    
    a(final Context context) {
        this(context, null);
    }
    
    a(final Context context, final AttributeSet set) {
        this(context, set, 0);
    }
    
    a(final Context b, final AttributeSet set, final int n) {
        super(b, set, n);
        this.a = new a();
        final TypedValue typedValue = new TypedValue();
        if (b.getTheme().resolveAttribute(android.support.v7.b.a.a.actionBarPopupTheme, typedValue, true) && typedValue.resourceId != 0) {
            this.b = (Context)new ContextThemeWrapper(b, typedValue.resourceId);
        }
        else {
            this.b = b;
        }
    }
    
    protected static int a(int n, final int n2, final boolean b) {
        if (b) {
            n -= n2;
        }
        else {
            n += n2;
        }
        return n;
    }
    
    protected static int a(final View view, final int n, final int n2) {
        view.measure(View$MeasureSpec.makeMeasureSpec(n, Integer.MIN_VALUE), n2);
        return Math.max(0, n - view.getMeasuredWidth() + 0);
    }
    
    protected static int a(final View view, int n, int n2, final int n3, final boolean b) {
        final int measuredWidth = view.getMeasuredWidth();
        final int measuredHeight = view.getMeasuredHeight();
        n2 += (n3 - measuredHeight) / 2;
        if (b) {
            view.layout(n - measuredWidth, n2, n, measuredHeight + n2);
        }
        else {
            view.layout(n, n2, n + measuredWidth, measuredHeight + n2);
        }
        n = measuredWidth;
        if (b) {
            n = -measuredWidth;
        }
        return n;
    }
    
    public int getAnimatedVisibility() {
        int n;
        if (this.i != null) {
            n = this.a.a;
        }
        else {
            n = this.getVisibility();
        }
        return n;
    }
    
    public int getContentHeight() {
        return this.h;
    }
    
    protected void onConfigurationChanged(final Configuration configuration) {
        if (Build$VERSION.SDK_INT >= 8) {
            super.onConfigurationChanged(configuration);
        }
        final TypedArray obtainStyledAttributes = this.getContext().obtainStyledAttributes((AttributeSet)null, android.support.v7.b.a.i.ActionBar, android.support.v7.b.a.a.actionBarStyle, 0);
        this.setContentHeight(obtainStyledAttributes.getLayoutDimension(android.support.v7.b.a.i.ActionBar_height, 0));
        obtainStyledAttributes.recycle();
        if (this.d != null) {
            this.d.b();
        }
    }
    
    public void setContentHeight(final int h) {
        this.h = h;
        this.requestLayout();
    }
    
    public void setSplitToolbar(final boolean f) {
        this.f = f;
    }
    
    public void setSplitView(final ViewGroup e) {
        this.e = e;
    }
    
    public void setSplitWhenNarrow(final boolean g) {
        this.g = g;
    }
    
    protected final class a implements ah
    {
        int a;
        private boolean c;
        
        protected a() {
            this.c = false;
        }
        
        @Override
        public final void a(final View view) {
            android.support.v7.internal.widget.a.this.setVisibility(0);
            this.c = false;
        }
        
        @Override
        public final void b(final View view) {
            if (!this.c) {
                android.support.v7.internal.widget.a.this.i = null;
                android.support.v7.internal.widget.a.this.setVisibility(this.a);
                if (android.support.v7.internal.widget.a.this.e != null && android.support.v7.internal.widget.a.this.c != null) {
                    android.support.v7.internal.widget.a.this.c.setVisibility(this.a);
                }
            }
        }
        
        @Override
        public final void c(final View view) {
            this.c = true;
        }
    }
}
