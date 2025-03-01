// 
// Decompiled by Procyon v0.5.36
// 

package android.support.v7.internal.widget;

import android.widget.Toast;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityEvent;
import android.view.ViewParent;
import android.text.TextUtils$TruncateAt;
import android.text.TextUtils;
import android.content.Context;
import android.widget.ImageView;
import android.widget.TextView;
import android.view.View$OnLongClickListener;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.SpinnerAdapter;
import android.view.View$MeasureSpec;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.os.Build$VERSION;
import android.content.res.Configuration;
import android.view.View;
import android.view.ViewGroup$LayoutParams;
import android.widget.AbsListView$LayoutParams;
import android.graphics.drawable.Drawable;
import android.support.v7.a.a;
import android.view.animation.DecelerateInterpolator;
import android.support.v7.widget.LinearLayoutCompat;
import android.view.animation.Interpolator;
import android.widget.HorizontalScrollView;

public final class m extends HorizontalScrollView implements android.support.v7.internal.widget.d.b
{
    private static final Interpolator i;
    Runnable a;
    int b;
    int c;
    private LinearLayoutCompat d;
    private SpinnerCompat e;
    private boolean f;
    private int g;
    private int h;
    
    static {
        i = (Interpolator)new DecelerateInterpolator();
    }
    
    static /* synthetic */ b a(final m m, final android.support.v7.a.a.b b) {
        final b b2 = m.new b(m.getContext(), b);
        b2.setBackgroundDrawable((Drawable)null);
        b2.setLayoutParams((ViewGroup$LayoutParams)new AbsListView$LayoutParams(-1, m.g));
        return b2;
    }
    
    private boolean a() {
        return this.e != null && this.e.getParent() == this;
    }
    
    private boolean b() {
        if (this.a()) {
            this.removeView((View)this.e);
            this.addView((View)this.d, new ViewGroup$LayoutParams(-2, -1));
            this.setTabSelected(this.e.getSelectedItemPosition());
        }
        return false;
    }
    
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.a != null) {
            this.post(this.a);
        }
    }
    
    protected final void onConfigurationChanged(final Configuration configuration) {
        if (Build$VERSION.SDK_INT >= 8) {
            super.onConfigurationChanged(configuration);
        }
        final android.support.v7.internal.view.a a = android.support.v7.internal.view.a.a(this.getContext());
        final TypedArray obtainStyledAttributes = a.a.obtainStyledAttributes((AttributeSet)null, android.support.v7.b.a.i.ActionBar, android.support.v7.b.a.a.actionBarStyle, 0);
        final int layoutDimension = obtainStyledAttributes.getLayoutDimension(android.support.v7.b.a.i.ActionBar_height, 0);
        final Resources resources = a.a.getResources();
        boolean b;
        if (a.a.getApplicationInfo().targetSdkVersion >= 16) {
            b = a.a.getResources().getBoolean(android.support.v7.b.a.b.abc_action_bar_embed_tabs);
        }
        else {
            b = a.a.getResources().getBoolean(android.support.v7.b.a.b.abc_action_bar_embed_tabs_pre_jb);
        }
        int min = layoutDimension;
        if (!b) {
            min = Math.min(layoutDimension, resources.getDimensionPixelSize(android.support.v7.b.a.c.abc_action_bar_stacked_max_height));
        }
        obtainStyledAttributes.recycle();
        this.setContentHeight(min);
        this.c = a.a.getResources().getDimensionPixelSize(android.support.v7.b.a.c.abc_action_bar_stacked_tab_max_width);
    }
    
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.a != null) {
            this.removeCallbacks(this.a);
        }
    }
    
    public final void onMeasure(int measuredWidth, int measuredWidth2) {
        measuredWidth2 = 1;
        final int mode = View$MeasureSpec.getMode(measuredWidth);
        final boolean fillViewport = mode == 1073741824;
        this.setFillViewport(fillViewport);
        final int childCount = this.d.getChildCount();
        if (childCount > 1 && (mode == 1073741824 || mode == Integer.MIN_VALUE)) {
            if (childCount > 2) {
                this.b = (int)(View$MeasureSpec.getSize(measuredWidth) * 0.4f);
            }
            else {
                this.b = View$MeasureSpec.getSize(measuredWidth) / 2;
            }
            this.b = Math.min(this.b, this.c);
        }
        else {
            this.b = -1;
        }
        final int measureSpec = View$MeasureSpec.makeMeasureSpec(this.g, 1073741824);
        if (fillViewport || !this.f) {
            measuredWidth2 = 0;
        }
        if (measuredWidth2 != 0) {
            this.d.measure(0, measureSpec);
            if (this.d.getMeasuredWidth() > View$MeasureSpec.getSize(measuredWidth)) {
                if (!this.a()) {
                    if (this.e == null) {
                        final SpinnerCompat e = new SpinnerCompat(this.getContext(), android.support.v7.b.a.a.actionDropDownStyle);
                        e.setLayoutParams((ViewGroup$LayoutParams)new LinearLayoutCompat.a(-2, -1));
                        e.a(this);
                        this.e = e;
                    }
                    this.removeView((View)this.d);
                    this.addView((View)this.e, new ViewGroup$LayoutParams(-2, -1));
                    if (this.e.a == null) {
                        this.e.a((SpinnerAdapter)new a((byte)0));
                    }
                    if (this.a != null) {
                        this.removeCallbacks(this.a);
                        this.a = null;
                    }
                    this.e.setSelection(this.h);
                }
            }
            else {
                this.b();
            }
        }
        else {
            this.b();
        }
        measuredWidth2 = this.getMeasuredWidth();
        super.onMeasure(measuredWidth, measureSpec);
        measuredWidth = this.getMeasuredWidth();
        if (fillViewport && measuredWidth2 != measuredWidth) {
            this.setTabSelected(this.h);
        }
    }
    
    public final void setAllowCollapse(final boolean f) {
        this.f = f;
    }
    
    public final void setContentHeight(final int g) {
        this.g = g;
        this.requestLayout();
    }
    
    public final void setTabSelected(final int n) {
        this.h = n;
        for (int childCount = this.d.getChildCount(), i = 0; i < childCount; ++i) {
            final View child = this.d.getChildAt(i);
            final boolean selected = i == n;
            child.setSelected(selected);
            if (selected) {
                final View child2 = this.d.getChildAt(n);
                if (this.a != null) {
                    this.removeCallbacks(this.a);
                }
                this.post(this.a = new Runnable() {
                    @Override
                    public final void run() {
                        m.this.smoothScrollTo(child2.getLeft() - (m.this.getWidth() - child2.getWidth()) / 2, 0);
                        m.this.a = null;
                    }
                });
            }
        }
        if (this.e != null && n >= 0) {
            this.e.setSelection(n);
        }
    }
    
    private final class a extends BaseAdapter
    {
        public final int getCount() {
            return m.this.d.getChildCount();
        }
        
        public final Object getItem(final int n) {
            return ((b)m.this.d.getChildAt(n)).a;
        }
        
        public final long getItemId(final int n) {
            return n;
        }
        
        public final View getView(final int n, View a, final ViewGroup viewGroup) {
            if (a == null) {
                a = (View)m.a(m.this, (android.support.v7.a.a.b)this.getItem(n));
            }
            else {
                final b b = (b)a;
                b.a = (android.support.v7.a.a.b)this.getItem(n);
                b.a();
            }
            return a;
        }
    }
    
    private final class b extends LinearLayoutCompat implements View$OnLongClickListener
    {
        android.support.v7.a.a.b a;
        private final int[] c;
        private TextView d;
        private ImageView e;
        private View f;
        
        public b(final Context context, final android.support.v7.a.a.b a) {
            super(context, null, android.support.v7.b.a.a.actionBarTabStyle);
            this.c = new int[] { 16842964 };
            this.a = a;
            final q a2 = android.support.v7.internal.widget.q.a(context, null, this.c, android.support.v7.b.a.a.actionBarTabStyle);
            if (a2.c(0)) {
                this.setBackgroundDrawable(a2.a(0));
            }
            a2.a.recycle();
            this.setGravity(8388627);
            this.a();
        }
        
        public final void a() {
            final android.support.v7.a.a.b a = this.a;
            final View c = a.c();
            if (c != null) {
                final ViewParent parent = c.getParent();
                if (parent != this) {
                    if (parent != null) {
                        ((b)parent).removeView(c);
                    }
                    this.addView(c);
                }
                this.f = c;
                if (this.d != null) {
                    this.d.setVisibility(8);
                }
                if (this.e != null) {
                    this.e.setVisibility(8);
                    this.e.setImageDrawable((Drawable)null);
                }
            }
            else {
                if (this.f != null) {
                    this.removeView(this.f);
                    this.f = null;
                }
                final Drawable a2 = a.a();
                final CharSequence b = a.b();
                if (a2 != null) {
                    if (this.e == null) {
                        final ImageView e = new ImageView(this.getContext());
                        final LinearLayoutCompat.a layoutParams = new LinearLayoutCompat.a(-2, -2);
                        layoutParams.h = 16;
                        e.setLayoutParams((ViewGroup$LayoutParams)layoutParams);
                        this.addView((View)e, 0);
                        this.e = e;
                    }
                    this.e.setImageDrawable(a2);
                    this.e.setVisibility(0);
                }
                else if (this.e != null) {
                    this.e.setVisibility(8);
                    this.e.setImageDrawable((Drawable)null);
                }
                boolean b2;
                if (!TextUtils.isEmpty(b)) {
                    b2 = true;
                }
                else {
                    b2 = false;
                }
                if (b2) {
                    if (this.d == null) {
                        final f d = new f(this.getContext(), null, android.support.v7.b.a.a.actionBarTabTextStyle);
                        d.setEllipsize(TextUtils$TruncateAt.END);
                        final LinearLayoutCompat.a layoutParams2 = new LinearLayoutCompat.a(-2, -2);
                        layoutParams2.h = 16;
                        d.setLayoutParams((ViewGroup$LayoutParams)layoutParams2);
                        this.addView((View)d);
                        this.d = d;
                    }
                    this.d.setText(b);
                    this.d.setVisibility(0);
                }
                else if (this.d != null) {
                    this.d.setVisibility(8);
                    this.d.setText((CharSequence)null);
                }
                if (this.e != null) {
                    this.e.setContentDescription(a.d());
                }
                if (!b2 && !TextUtils.isEmpty(a.d())) {
                    this.setOnLongClickListener((View$OnLongClickListener)this);
                }
                else {
                    this.setOnLongClickListener((View$OnLongClickListener)null);
                    this.setLongClickable(false);
                }
            }
        }
        
        @Override
        public final void onInitializeAccessibilityEvent(final AccessibilityEvent accessibilityEvent) {
            super.onInitializeAccessibilityEvent(accessibilityEvent);
            accessibilityEvent.setClassName((CharSequence)android.support.v7.a.a.b.class.getName());
        }
        
        @Override
        public final void onInitializeAccessibilityNodeInfo(final AccessibilityNodeInfo accessibilityNodeInfo) {
            super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
            if (Build$VERSION.SDK_INT >= 14) {
                accessibilityNodeInfo.setClassName((CharSequence)android.support.v7.a.a.b.class.getName());
            }
        }
        
        public final boolean onLongClick(final View view) {
            final int[] array = new int[2];
            this.getLocationOnScreen(array);
            final Context context = this.getContext();
            final int width = this.getWidth();
            final int height = this.getHeight();
            final int widthPixels = context.getResources().getDisplayMetrics().widthPixels;
            final Toast text = Toast.makeText(context, this.a.d(), 0);
            text.setGravity(49, array[0] + width / 2 - widthPixels / 2, height);
            text.show();
            return true;
        }
        
        @Override
        public final void onMeasure(final int n, final int n2) {
            super.onMeasure(n, n2);
            if (m.this.b > 0 && this.getMeasuredWidth() > m.this.b) {
                super.onMeasure(View$MeasureSpec.makeMeasureSpec(m.this.b, 1073741824), n2);
            }
        }
        
        public final void setSelected(final boolean selected) {
            boolean b;
            if (this.isSelected() != selected) {
                b = true;
            }
            else {
                b = false;
            }
            super.setSelected(selected);
            if (b && selected) {
                this.sendAccessibilityEvent(4);
            }
        }
    }
}
