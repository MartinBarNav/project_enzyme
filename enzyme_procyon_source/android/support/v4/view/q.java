// 
// Decompiled by Procyon v0.5.36
// 

package android.support.v4.view;

import android.view.ViewParent;
import android.graphics.drawable.Drawable;
import android.database.DataSetObserver;
import android.view.View$MeasureSpec;
import android.content.res.TypedArray;
import android.text.TextUtils$TruncateAt;
import android.view.View;
import android.util.AttributeSet;
import android.content.Context;
import android.os.Build$VERSION;
import java.lang.ref.WeakReference;
import android.widget.TextView;
import android.view.ViewGroup;

public class q extends ViewGroup implements ViewPager.a
{
    private static final int[] n;
    private static final int[] o;
    private static final b q;
    ViewPager a;
    TextView b;
    TextView c;
    TextView d;
    int e;
    private int f;
    private float g;
    private int h;
    private int i;
    private boolean j;
    private boolean k;
    private final a l;
    private WeakReference<p> m;
    private int p;
    
    static {
        n = new int[] { 16842804, 16842901, 16842904, 16842927 };
        o = new int[] { 16843660 };
        if (Build$VERSION.SDK_INT >= 14) {
            q = (b)new d();
        }
        else {
            q = (b)new c();
        }
    }
    
    public q(final Context context) {
        this(context, null);
    }
    
    public q(final Context context, final AttributeSet set) {
        boolean boolean1 = false;
        super(context, set);
        this.f = -1;
        this.g = -1.0f;
        this.l = new a((byte)0);
        this.addView((View)(this.b = new TextView(context)));
        this.addView((View)(this.c = new TextView(context)));
        this.addView((View)(this.d = new TextView(context)));
        final TypedArray obtainStyledAttributes = context.obtainStyledAttributes(set, android.support.v4.view.q.n);
        final int resourceId = obtainStyledAttributes.getResourceId(0, 0);
        if (resourceId != 0) {
            this.b.setTextAppearance(context, resourceId);
            this.c.setTextAppearance(context, resourceId);
            this.d.setTextAppearance(context, resourceId);
        }
        final int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(1, 0);
        if (dimensionPixelSize != 0) {
            final float n = (float)dimensionPixelSize;
            this.b.setTextSize(0, n);
            this.c.setTextSize(0, n);
            this.d.setTextSize(0, n);
        }
        if (obtainStyledAttributes.hasValue(2)) {
            final int color = obtainStyledAttributes.getColor(2, 0);
            this.b.setTextColor(color);
            this.c.setTextColor(color);
            this.d.setTextColor(color);
        }
        this.i = obtainStyledAttributes.getInteger(3, 80);
        obtainStyledAttributes.recycle();
        this.e = this.c.getTextColors().getDefaultColor();
        this.setNonPrimaryAlpha(0.6f);
        this.b.setEllipsize(TextUtils$TruncateAt.END);
        this.c.setEllipsize(TextUtils$TruncateAt.END);
        this.d.setEllipsize(TextUtils$TruncateAt.END);
        if (resourceId != 0) {
            final TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(resourceId, android.support.v4.view.q.o);
            boolean1 = obtainStyledAttributes2.getBoolean(0, false);
            obtainStyledAttributes2.recycle();
        }
        if (boolean1) {
            setSingleLineAllCaps(this.b);
            setSingleLineAllCaps(this.c);
            setSingleLineAllCaps(this.d);
        }
        else {
            this.b.setSingleLine();
            this.c.setSingleLine();
            this.d.setSingleLine();
        }
        this.h = (int)(context.getResources().getDisplayMetrics().density * 16.0f);
    }
    
    private static void setSingleLineAllCaps(final TextView textView) {
        android.support.v4.view.q.q.a(textView);
    }
    
    void a(int paddingTop, final float g, final boolean b) {
        if (paddingTop != this.f) {
            this.a(paddingTop, this.a.getAdapter());
        }
        else if (!b && g == this.g) {
            return;
        }
        this.k = true;
        final int measuredWidth = this.b.getMeasuredWidth();
        final int measuredWidth2 = this.c.getMeasuredWidth();
        final int measuredWidth3 = this.d.getMeasuredWidth();
        final int n = measuredWidth2 / 2;
        final int width = this.getWidth();
        final int height = this.getHeight();
        final int paddingLeft = this.getPaddingLeft();
        final int paddingRight = this.getPaddingRight();
        paddingTop = this.getPaddingTop();
        final int paddingBottom = this.getPaddingBottom();
        final int n2 = paddingRight + n;
        float n4;
        final float n3 = n4 = 0.5f + g;
        if (n3 > 1.0f) {
            n4 = n3 - 1.0f;
        }
        final int n5 = width - n2 - (int)(n4 * (width - (paddingLeft + n) - n2)) - n;
        final int n6 = n5 + measuredWidth2;
        final int baseline = this.b.getBaseline();
        final int baseline2 = this.c.getBaseline();
        final int baseline3 = this.d.getBaseline();
        final int max = Math.max(Math.max(baseline, baseline2), baseline3);
        final int n7 = max - baseline;
        final int n8 = max - baseline2;
        final int n9 = max - baseline3;
        final int max2 = Math.max(Math.max(this.b.getMeasuredHeight() + n7, this.c.getMeasuredHeight() + n8), this.d.getMeasuredHeight() + n9);
        int n10 = 0;
        int n11 = 0;
        switch (this.i & 0x70) {
            default: {
                n10 = paddingTop + n7;
                n11 = paddingTop + n8;
                paddingTop += n9;
                break;
            }
            case 16: {
                paddingTop = (height - paddingTop - paddingBottom - max2) / 2;
                n10 = paddingTop + n7;
                n11 = paddingTop + n8;
                paddingTop += n9;
                break;
            }
            case 80: {
                paddingTop = height - paddingBottom - max2;
                n10 = paddingTop + n7;
                n11 = paddingTop + n8;
                paddingTop += n9;
                break;
            }
        }
        this.c.layout(n5, n11, n6, this.c.getMeasuredHeight() + n11);
        final int min = Math.min(paddingLeft, n5 - this.h - measuredWidth);
        this.b.layout(min, n10, measuredWidth + min, this.b.getMeasuredHeight() + n10);
        final int max3 = Math.max(width - paddingRight - measuredWidth3, this.h + n6);
        this.d.layout(max3, paddingTop, max3 + measuredWidth3, this.d.getMeasuredHeight() + paddingTop);
        this.g = g;
        this.k = false;
    }
    
    final void a(final int f, final p p2) {
        final CharSequence charSequence = null;
        int b;
        if (p2 != null) {
            b = p2.b();
        }
        else {
            b = 0;
        }
        this.j = true;
        CharSequence b2;
        if (f > 0 && p2 != null) {
            b2 = p2.b(f - 1);
        }
        else {
            b2 = null;
        }
        this.b.setText(b2);
        final TextView c = this.c;
        CharSequence b3;
        if (p2 != null && f < b) {
            b3 = p2.b(f);
        }
        else {
            b3 = null;
        }
        c.setText(b3);
        CharSequence b4 = charSequence;
        if (f + 1 < b) {
            b4 = charSequence;
            if (p2 != null) {
                b4 = p2.b(f + 1);
            }
        }
        this.d.setText(b4);
        final int width = this.getWidth();
        final int paddingLeft = this.getPaddingLeft();
        final int paddingRight = this.getPaddingRight();
        final int height = this.getHeight();
        final int paddingTop = this.getPaddingTop();
        final int paddingBottom = this.getPaddingBottom();
        final int measureSpec = View$MeasureSpec.makeMeasureSpec((int)((width - paddingLeft - paddingRight) * 0.8f), Integer.MIN_VALUE);
        final int measureSpec2 = View$MeasureSpec.makeMeasureSpec(height - paddingTop - paddingBottom, Integer.MIN_VALUE);
        this.b.measure(measureSpec, measureSpec2);
        this.c.measure(measureSpec, measureSpec2);
        this.d.measure(measureSpec, measureSpec2);
        this.f = f;
        if (!this.k) {
            this.a(f, this.g, false);
        }
        this.j = false;
    }
    
    final void a(final p p2, final p referent) {
        if (p2 != null) {
            p2.b(this.l);
            this.m = null;
        }
        if (referent != null) {
            referent.a(this.l);
            this.m = new WeakReference<p>(referent);
        }
        if (this.a != null) {
            this.f = -1;
            this.g = -1.0f;
            this.a(this.a.getCurrentItem(), referent);
            this.requestLayout();
        }
    }
    
    int getMinHeight() {
        int intrinsicHeight = 0;
        final Drawable background = this.getBackground();
        if (background != null) {
            intrinsicHeight = background.getIntrinsicHeight();
        }
        return intrinsicHeight;
    }
    
    public int getTextSpacing() {
        return this.h;
    }
    
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        final ViewParent parent = this.getParent();
        if (!(parent instanceof ViewPager)) {
            throw new IllegalStateException("PagerTitleStrip must be a direct child of a ViewPager.");
        }
        final ViewPager a = (ViewPager)parent;
        final p adapter = a.getAdapter();
        a.a((ViewPager.f)this.l);
        a.setOnAdapterChangeListener((ViewPager.e)this.l);
        this.a = a;
        p p;
        if (this.m != null) {
            p = this.m.get();
        }
        else {
            p = null;
        }
        this.a(p, adapter);
    }
    
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.a != null) {
            this.a(this.a.getAdapter(), null);
            this.a.a((ViewPager.f)null);
            this.a.setOnAdapterChangeListener(null);
            this.a = null;
        }
    }
    
    protected void onLayout(final boolean b, final int n, final int n2, final int n3, final int n4) {
        float g = 0.0f;
        if (this.a != null) {
            if (this.g >= 0.0f) {
                g = this.g;
            }
            this.a(this.f, g, true);
        }
    }
    
    protected void onMeasure(int size, int size2) {
        final int mode = View$MeasureSpec.getMode(size);
        final int mode2 = View$MeasureSpec.getMode(size2);
        size = View$MeasureSpec.getSize(size);
        size2 = View$MeasureSpec.getSize(size2);
        if (mode != 1073741824) {
            throw new IllegalStateException("Must measure with an exact width");
        }
        final int minHeight = this.getMinHeight();
        final int n = this.getPaddingTop() + this.getPaddingBottom();
        final int measureSpec = View$MeasureSpec.makeMeasureSpec((int)(size * 0.8f), Integer.MIN_VALUE);
        final int measureSpec2 = View$MeasureSpec.makeMeasureSpec(size2 - n, Integer.MIN_VALUE);
        this.b.measure(measureSpec, measureSpec2);
        this.c.measure(measureSpec, measureSpec2);
        this.d.measure(measureSpec, measureSpec2);
        if (mode2 == 1073741824) {
            this.setMeasuredDimension(size, size2);
        }
        else {
            this.setMeasuredDimension(size, Math.max(minHeight, this.c.getMeasuredHeight() + n));
        }
    }
    
    public void requestLayout() {
        if (!this.j) {
            super.requestLayout();
        }
    }
    
    public void setGravity(final int i) {
        this.i = i;
        this.requestLayout();
    }
    
    public void setNonPrimaryAlpha(final float n) {
        this.p = ((int)(255.0f * n) & 0xFF);
        final int n2 = this.p << 24 | (this.e & 0xFFFFFF);
        this.b.setTextColor(n2);
        this.d.setTextColor(n2);
    }
    
    public void setTextColor(int n) {
        this.e = n;
        this.c.setTextColor(n);
        n = (this.p << 24 | (this.e & 0xFFFFFF));
        this.b.setTextColor(n);
        this.d.setTextColor(n);
    }
    
    public void setTextSpacing(final int h) {
        this.h = h;
        this.requestLayout();
    }
    
    private final class a extends DataSetObserver implements e, f
    {
        private int b;
        
        public final void a(final int n) {
            float a = 0.0f;
            if (this.b == 0) {
                q.this.a(q.this.a.getCurrentItem(), q.this.a.getAdapter());
                if (q.this.g >= 0.0f) {
                    a = q.this.g;
                }
                q.this.a(q.this.a.getCurrentItem(), a, true);
            }
        }
        
        public final void a(final int n, final float n2) {
            int n3 = n;
            if (n2 > 0.5f) {
                n3 = n + 1;
            }
            q.this.a(n3, n2, false);
        }
        
        public final void a(final p p2, final p p3) {
            q.this.a(p2, p3);
        }
        
        public final void b(final int b) {
            this.b = b;
        }
        
        public final void onChanged() {
            float a = 0.0f;
            q.this.a(q.this.a.getCurrentItem(), q.this.a.getAdapter());
            if (q.this.g >= 0.0f) {
                a = q.this.g;
            }
            q.this.a(q.this.a.getCurrentItem(), a, true);
        }
    }
    
    interface b
    {
        void a(final TextView p0);
    }
    
    static final class c implements b
    {
        @Override
        public final void a(final TextView textView) {
            textView.setSingleLine();
        }
    }
    
    static final class d implements b
    {
        @Override
        public final void a(final TextView textView) {
            android.support.v4.view.r.a(textView);
        }
    }
}
