/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.database.DataSetObserver
 *  android.graphics.drawable.Drawable
 *  android.os.Build$VERSION
 *  android.text.TextUtils$TruncateAt
 *  android.util.AttributeSet
 *  android.view.View
 *  android.view.View$MeasureSpec
 *  android.view.ViewGroup
 *  android.widget.TextView
 */
package android.support.v4.view;

import android.content.Context;
import android.database.DataSetObserver;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.support.v4.view.ViewPager;
import android.support.v4.view.p;
import android.support.v4.view.r;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import java.lang.ref.WeakReference;

public class q
extends ViewGroup
implements ViewPager.a {
    private static final int[] n = new int[]{16842804, 16842901, 16842904, 16842927};
    private static final int[] o = new int[]{16843660};
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

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    static {
        if (Build.VERSION.SDK_INT >= 14) {
            q = new d();
            return;
        }
        q = new c();
    }

    public q(Context context) {
        this(context, null);
    }

    /*
     * Enabled aggressive block sorting
     */
    public q(Context context, AttributeSet attributeSet) {
        int n2;
        TextView textView;
        boolean bl = false;
        super(context, attributeSet);
        this.f = -1;
        this.g = -1.0f;
        this.l = new a(0);
        this.b = textView = new TextView(context);
        this.addView((View)textView);
        this.c = textView = new TextView(context);
        this.addView((View)textView);
        this.d = textView = new TextView(context);
        this.addView((View)textView);
        attributeSet = context.obtainStyledAttributes(attributeSet, n);
        int n3 = attributeSet.getResourceId(0, 0);
        if (n3 != 0) {
            this.b.setTextAppearance(context, n3);
            this.c.setTextAppearance(context, n3);
            this.d.setTextAppearance(context, n3);
        }
        if ((n2 = attributeSet.getDimensionPixelSize(1, 0)) != 0) {
            float f2 = n2;
            this.b.setTextSize(0, f2);
            this.c.setTextSize(0, f2);
            this.d.setTextSize(0, f2);
        }
        if (attributeSet.hasValue(2)) {
            n2 = attributeSet.getColor(2, 0);
            this.b.setTextColor(n2);
            this.c.setTextColor(n2);
            this.d.setTextColor(n2);
        }
        this.i = attributeSet.getInteger(3, 80);
        attributeSet.recycle();
        this.e = this.c.getTextColors().getDefaultColor();
        this.setNonPrimaryAlpha(0.6f);
        this.b.setEllipsize(TextUtils.TruncateAt.END);
        this.c.setEllipsize(TextUtils.TruncateAt.END);
        this.d.setEllipsize(TextUtils.TruncateAt.END);
        if (n3 != 0) {
            attributeSet = context.obtainStyledAttributes(n3, o);
            bl = attributeSet.getBoolean(0, false);
            attributeSet.recycle();
        }
        if (bl) {
            android.support.v4.view.q.setSingleLineAllCaps(this.b);
            android.support.v4.view.q.setSingleLineAllCaps(this.c);
            android.support.v4.view.q.setSingleLineAllCaps(this.d);
        } else {
            this.b.setSingleLine();
            this.c.setSingleLine();
            this.d.setSingleLine();
        }
        this.h = (int)(context.getResources().getDisplayMetrics().density * 16.0f);
    }

    private static void setSingleLineAllCaps(TextView textView) {
        q.a(textView);
    }

    /*
     * Enabled aggressive block sorting
     */
    void a(int n2, float f2, boolean bl) {
        float f3;
        if (n2 != this.f) {
            this.a(n2, this.a.getAdapter());
        } else if (!bl && f2 == this.g) {
            return;
        }
        this.k = true;
        int n3 = this.b.getMeasuredWidth();
        int n4 = this.c.getMeasuredWidth();
        int n5 = this.d.getMeasuredWidth();
        int n6 = n4 / 2;
        int n7 = this.getWidth();
        int n8 = this.getHeight();
        int n9 = this.getPaddingLeft();
        int n10 = this.getPaddingRight();
        n2 = this.getPaddingTop();
        int n11 = this.getPaddingBottom();
        int n12 = n10 + n6;
        float f4 = f3 = 0.5f + f2;
        if (f3 > 1.0f) {
            f4 = f3 - 1.0f;
        }
        n6 = n7 - n12 - (int)(f4 * (float)(n7 - (n9 + n6) - n12)) - n6;
        n4 = n6 + n4;
        int n13 = this.b.getBaseline();
        int n14 = this.c.getBaseline();
        int n15 = this.d.getBaseline();
        n12 = Math.max(Math.max(n13, n14), n15);
        n13 = n12 - n13;
        n14 = n12 - n14;
        n12 -= n15;
        n15 = this.b.getMeasuredHeight();
        int n16 = this.c.getMeasuredHeight();
        int n17 = this.d.getMeasuredHeight();
        n15 = Math.max(Math.max(n15 + n13, n16 + n14), n17 + n12);
        switch (this.i & 0x70) {
            default: {
                n8 = n2 + n13;
                n11 = n2 + n14;
                n2 += n12;
                break;
            }
            case 16: {
                n2 = (n8 - n2 - n11 - n15) / 2;
                n8 = n2 + n13;
                n11 = n2 + n14;
                n2 += n12;
                break;
            }
            case 80: {
                n2 = n8 - n11 - n15;
                n8 = n2 + n13;
                n11 = n2 + n14;
                n2 += n12;
            }
        }
        this.c.layout(n6, n11, n4, this.c.getMeasuredHeight() + n11);
        n11 = Math.min(n9, n6 - this.h - n3);
        this.b.layout(n11, n8, n3 + n11, this.b.getMeasuredHeight() + n8);
        n11 = Math.max(n7 - n10 - n5, this.h + n4);
        this.d.layout(n11, n2, n11 + n5, this.d.getMeasuredHeight() + n2);
        this.g = f2;
        this.k = false;
    }

    /*
     * Enabled aggressive block sorting
     */
    final void a(int n2, p p2) {
        Object var3_3 = null;
        int n3 = p2 != null ? p2.b() : 0;
        this.j = true;
        CharSequence charSequence = n2 > 0 && p2 != null ? p2.b(n2 - 1) : null;
        this.b.setText(charSequence);
        TextView textView = this.c;
        charSequence = p2 != null && n2 < n3 ? p2.b(n2) : null;
        textView.setText(charSequence);
        charSequence = var3_3;
        if (n2 + 1 < n3) {
            charSequence = var3_3;
            if (p2 != null) {
                charSequence = p2.b(n2 + 1);
            }
        }
        this.d.setText(charSequence);
        int n4 = this.getWidth();
        int n5 = this.getPaddingLeft();
        int n6 = this.getPaddingRight();
        int n7 = this.getHeight();
        n3 = this.getPaddingTop();
        int n8 = this.getPaddingBottom();
        n6 = View.MeasureSpec.makeMeasureSpec((int)((int)((float)(n4 - n5 - n6) * 0.8f)), (int)Integer.MIN_VALUE);
        n3 = View.MeasureSpec.makeMeasureSpec((int)(n7 - n3 - n8), (int)Integer.MIN_VALUE);
        this.b.measure(n6, n3);
        this.c.measure(n6, n3);
        this.d.measure(n6, n3);
        this.f = n2;
        if (!this.k) {
            this.a(n2, this.g, false);
        }
        this.j = false;
    }

    final void a(p p2, p p3) {
        if (p2 != null) {
            p2.b(this.l);
            this.m = null;
        }
        if (p3 != null) {
            p3.a(this.l);
            this.m = new WeakReference<p>(p3);
        }
        if (this.a != null) {
            this.f = -1;
            this.g = -1.0f;
            this.a(this.a.getCurrentItem(), p3);
            this.requestLayout();
        }
    }

    int getMinHeight() {
        int n2 = 0;
        Drawable drawable = this.getBackground();
        if (drawable != null) {
            n2 = drawable.getIntrinsicHeight();
        }
        return n2;
    }

    public int getTextSpacing() {
        return this.h;
    }

    /*
     * Enabled aggressive block sorting
     */
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        Object object = this.getParent();
        if (!(object instanceof ViewPager)) {
            throw new IllegalStateException("PagerTitleStrip must be a direct child of a ViewPager.");
        }
        object = (ViewPager)((Object)object);
        p p2 = ((ViewPager)((Object)object)).getAdapter();
        ((ViewPager)((Object)object)).a(this.l);
        ((ViewPager)((Object)object)).setOnAdapterChangeListener(this.l);
        this.a = object;
        object = this.m != null ? (p)this.m.get() : null;
        this.a((p)object, p2);
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

    protected void onLayout(boolean bl, int n2, int n3, int n4, int n5) {
        float f2 = 0.0f;
        if (this.a != null) {
            if (this.g >= 0.0f) {
                f2 = this.g;
            }
            this.a(this.f, f2, true);
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    protected void onMeasure(int n2, int n3) {
        int n4 = View.MeasureSpec.getMode((int)n2);
        int n5 = View.MeasureSpec.getMode((int)n3);
        n2 = View.MeasureSpec.getSize((int)n2);
        n3 = View.MeasureSpec.getSize((int)n3);
        if (n4 != 0x40000000) {
            throw new IllegalStateException("Must measure with an exact width");
        }
        n4 = this.getMinHeight();
        int n6 = this.getPaddingTop() + this.getPaddingBottom();
        int n7 = View.MeasureSpec.makeMeasureSpec((int)((int)((float)n2 * 0.8f)), (int)Integer.MIN_VALUE);
        int n8 = View.MeasureSpec.makeMeasureSpec((int)(n3 - n6), (int)Integer.MIN_VALUE);
        this.b.measure(n7, n8);
        this.c.measure(n7, n8);
        this.d.measure(n7, n8);
        if (n5 == 0x40000000) {
            this.setMeasuredDimension(n2, n3);
            return;
        }
        this.setMeasuredDimension(n2, Math.max(n4, this.c.getMeasuredHeight() + n6));
    }

    public void requestLayout() {
        if (!this.j) {
            super.requestLayout();
        }
    }

    public void setGravity(int n2) {
        this.i = n2;
        this.requestLayout();
    }

    public void setNonPrimaryAlpha(float f2) {
        this.p = (int)(255.0f * f2) & 0xFF;
        int n2 = this.p << 24 | this.e & 0xFFFFFF;
        this.b.setTextColor(n2);
        this.d.setTextColor(n2);
    }

    public void setTextColor(int n2) {
        this.e = n2;
        this.c.setTextColor(n2);
        n2 = this.p << 24 | this.e & 0xFFFFFF;
        this.b.setTextColor(n2);
        this.d.setTextColor(n2);
    }

    public void setTextSpacing(int n2) {
        this.h = n2;
        this.requestLayout();
    }

    private final class a
    extends DataSetObserver
    implements ViewPager.e,
    ViewPager.f {
        private int b;

        private a() {
        }

        /* synthetic */ a(byte by) {
            this();
        }

        @Override
        public final void a(int n2) {
            float f2 = 0.0f;
            if (this.b == 0) {
                q.this.a(q.this.a.getCurrentItem(), q.this.a.getAdapter());
                if (q.this.g >= 0.0f) {
                    f2 = q.this.g;
                }
                q.this.a(q.this.a.getCurrentItem(), f2, true);
            }
        }

        @Override
        public final void a(int n2, float f2) {
            int n3 = n2;
            if (f2 > 0.5f) {
                n3 = n2 + 1;
            }
            q.this.a(n3, f2, false);
        }

        @Override
        public final void a(p p2, p p3) {
            q.this.a(p2, p3);
        }

        @Override
        public final void b(int n2) {
            this.b = n2;
        }

        public final void onChanged() {
            float f2 = 0.0f;
            q.this.a(q.this.a.getCurrentItem(), q.this.a.getAdapter());
            if (q.this.g >= 0.0f) {
                f2 = q.this.g;
            }
            q.this.a(q.this.a.getCurrentItem(), f2, true);
        }
    }

    static interface b {
        public void a(TextView var1);
    }

    static final class c
    implements b {
        c() {
        }

        @Override
        public final void a(TextView textView) {
            textView.setSingleLine();
        }
    }

    static final class d
    implements b {
        d() {
        }

        @Override
        public final void a(TextView textView) {
            r.a(textView);
        }
    }
}

