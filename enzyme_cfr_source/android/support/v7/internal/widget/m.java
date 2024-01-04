/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.res.Configuration
 *  android.content.res.Resources
 *  android.content.res.TypedArray
 *  android.graphics.drawable.Drawable
 *  android.os.Build$VERSION
 *  android.text.TextUtils
 *  android.text.TextUtils$TruncateAt
 *  android.view.View
 *  android.view.View$MeasureSpec
 *  android.view.View$OnLongClickListener
 *  android.view.ViewGroup
 *  android.view.ViewGroup$LayoutParams
 *  android.view.accessibility.AccessibilityEvent
 *  android.view.accessibility.AccessibilityNodeInfo
 *  android.view.animation.DecelerateInterpolator
 *  android.view.animation.Interpolator
 *  android.widget.AbsListView$LayoutParams
 *  android.widget.BaseAdapter
 *  android.widget.HorizontalScrollView
 *  android.widget.ImageView
 *  android.widget.SpinnerAdapter
 *  android.widget.TextView
 *  android.widget.Toast
 */
package android.support.v7.internal.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.support.v7.a.a;
import android.support.v7.b.a;
import android.support.v7.internal.widget.SpinnerCompat;
import android.support.v7.internal.widget.d;
import android.support.v7.internal.widget.f;
import android.support.v7.internal.widget.q;
import android.support.v7.widget.LinearLayoutCompat;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.widget.AbsListView;
import android.widget.BaseAdapter;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.SpinnerAdapter;
import android.widget.TextView;
import android.widget.Toast;

public final class m
extends HorizontalScrollView
implements d.b {
    private static final Interpolator i = new DecelerateInterpolator();
    Runnable a;
    int b;
    int c;
    private LinearLayoutCompat d;
    private SpinnerCompat e;
    private boolean f;
    private int g;
    private int h;

    static /* synthetic */ b a(m m2, a.b object) {
        object = m2.new b(m2.getContext(), (a.b)object);
        object.setBackgroundDrawable(null);
        object.setLayoutParams((ViewGroup.LayoutParams)new AbsListView.LayoutParams(-1, m2.g));
        return object;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private boolean a() {
        if (this.e == null) return false;
        if (this.e.getParent() != this) return false;
        return true;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private boolean b() {
        if (!this.a()) {
            return false;
        }
        this.removeView((View)this.e);
        this.addView((View)this.d, new ViewGroup.LayoutParams(-2, -1));
        this.setTabSelected(this.e.getSelectedItemPosition());
        return false;
    }

    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.a != null) {
            this.post(this.a);
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    protected final void onConfigurationChanged(Configuration object) {
        if (Build.VERSION.SDK_INT >= 8) {
            super.onConfigurationChanged(object);
        }
        android.support.v7.internal.view.a a2 = android.support.v7.internal.view.a.a(this.getContext());
        TypedArray typedArray = a2.a.obtainStyledAttributes(null, a.i.ActionBar, a.a.actionBarStyle, 0);
        int n2 = typedArray.getLayoutDimension(a.i.ActionBar_height, 0);
        Resources resources = a2.a.getResources();
        boolean bl = a2.a.getApplicationInfo().targetSdkVersion >= 16 ? a2.a.getResources().getBoolean(a.b.abc_action_bar_embed_tabs) : a2.a.getResources().getBoolean(a.b.abc_action_bar_embed_tabs_pre_jb);
        int n3 = n2;
        if (!bl) {
            n3 = Math.min(n2, resources.getDimensionPixelSize(a.c.abc_action_bar_stacked_max_height));
        }
        typedArray.recycle();
        this.setContentHeight(n3);
        this.c = a2.a.getResources().getDimensionPixelSize(a.c.abc_action_bar_stacked_tab_max_width);
    }

    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.a != null) {
            this.removeCallbacks(this.a);
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    public final void onMeasure(int n2, int n3) {
        n3 = 1;
        int n4 = View.MeasureSpec.getMode((int)n2);
        boolean bl = n4 == 0x40000000;
        this.setFillViewport(bl);
        int n5 = this.d.getChildCount();
        if (n5 > 1 && (n4 == 0x40000000 || n4 == Integer.MIN_VALUE)) {
            this.b = n5 > 2 ? (int)((float)View.MeasureSpec.getSize((int)n2) * 0.4f) : View.MeasureSpec.getSize((int)n2) / 2;
            this.b = Math.min(this.b, this.c);
        } else {
            this.b = -1;
        }
        n4 = View.MeasureSpec.makeMeasureSpec((int)this.g, (int)0x40000000);
        if (bl || !this.f) {
            n3 = 0;
        }
        if (n3 != 0) {
            this.d.measure(0, n4);
            if (this.d.getMeasuredWidth() > View.MeasureSpec.getSize((int)n2)) {
                if (!this.a()) {
                    if (this.e == null) {
                        SpinnerCompat spinnerCompat = new SpinnerCompat(this.getContext(), a.a.actionDropDownStyle);
                        spinnerCompat.setLayoutParams((ViewGroup.LayoutParams)new LinearLayoutCompat.a(-2, -1));
                        spinnerCompat.a(this);
                        this.e = spinnerCompat;
                    }
                    this.removeView((View)this.d);
                    this.addView((View)this.e, new ViewGroup.LayoutParams(-2, -1));
                    if (this.e.a == null) {
                        this.e.a((SpinnerAdapter)new a(0));
                    }
                    if (this.a != null) {
                        this.removeCallbacks(this.a);
                        this.a = null;
                    }
                    this.e.setSelection(this.h);
                }
            } else {
                this.b();
            }
        } else {
            this.b();
        }
        n3 = this.getMeasuredWidth();
        super.onMeasure(n2, n4);
        n2 = this.getMeasuredWidth();
        if (bl && n3 != n2) {
            this.setTabSelected(this.h);
        }
    }

    public final void setAllowCollapse(boolean bl) {
        this.f = bl;
    }

    public final void setContentHeight(int n2) {
        this.g = n2;
        this.requestLayout();
    }

    /*
     * Enabled aggressive block sorting
     */
    public final void setTabSelected(int n2) {
        this.h = n2;
        int n3 = this.d.getChildCount();
        for (int i2 = 0; i2 < n3; ++i2) {
            final View view = this.d.getChildAt(i2);
            boolean bl = i2 == n2;
            view.setSelected(bl);
            if (!bl) continue;
            view = this.d.getChildAt(n2);
            if (this.a != null) {
                this.removeCallbacks(this.a);
            }
            this.a = new Runnable(){

                @Override
                public final void run() {
                    int n2 = view.getLeft();
                    int n3 = (m.this.getWidth() - view.getWidth()) / 2;
                    m.this.smoothScrollTo(n2 - n3, 0);
                    m.this.a = null;
                }
            };
            this.post(this.a);
        }
        if (this.e != null && n2 >= 0) {
            this.e.setSelection(n2);
        }
    }

    private final class a
    extends BaseAdapter {
        private a() {
        }

        /* synthetic */ a(byte by) {
            this();
        }

        public final int getCount() {
            return m.this.d.getChildCount();
        }

        public final Object getItem(int n2) {
            return ((b)((m)m.this).d.getChildAt((int)n2)).a;
        }

        public final long getItemId(int n2) {
            return n2;
        }

        /*
         * WARNING - void declaration
         * Enabled force condition propagation
         * Lifted jumps to return sites
         */
        public final View getView(int n2, View object, ViewGroup viewGroup) {
            void var2_4;
            if (object == null) {
                b b2 = m.a(m.this, (a.b)this.getItem(n2));
                return var2_4;
            }
            b b3 = (b)((Object)object);
            b3.a = (a.b)this.getItem(n2);
            b3.a();
            return var2_4;
        }
    }

    private final class b
    extends LinearLayoutCompat
    implements View.OnLongClickListener {
        a.b a;
        private final int[] c;
        private TextView d;
        private ImageView e;
        private View f;

        public b(Context context, a.b b2) {
            super(context, null, a.a.actionBarTabStyle);
            this.c = new int[]{16842964};
            this.a = b2;
            m.this = q.a(context, null, this.c, a.a.actionBarTabStyle);
            if (((q)m.this).c(0)) {
                this.setBackgroundDrawable(((q)m.this).a(0));
            }
            ((q)m.this).a.recycle();
            this.setGravity(8388627);
            this.a();
        }

        /*
         * Enabled aggressive block sorting
         */
        public final void a() {
            LinearLayoutCompat.a a2;
            a.b b2 = this.a;
            View view = b2.c();
            if (view != null) {
                b2 = view.getParent();
                if (b2 != this) {
                    if (b2 != null) {
                        ((ViewGroup)b2).removeView(view);
                    }
                    this.addView(view);
                }
                this.f = view;
                if (this.d != null) {
                    this.d.setVisibility(8);
                }
                if (this.e == null) return;
                this.e.setVisibility(8);
                this.e.setImageDrawable(null);
                return;
            }
            if (this.f != null) {
                this.removeView(this.f);
                this.f = null;
            }
            Drawable drawable = b2.a();
            CharSequence charSequence = b2.b();
            if (drawable != null) {
                if (this.e == null) {
                    ImageView imageView = new ImageView(this.getContext());
                    a2 = new LinearLayoutCompat.a(-2, -2);
                    a2.h = 16;
                    imageView.setLayoutParams((ViewGroup.LayoutParams)a2);
                    this.addView((View)imageView, 0);
                    this.e = imageView;
                }
                this.e.setImageDrawable(drawable);
                this.e.setVisibility(0);
            } else if (this.e != null) {
                this.e.setVisibility(8);
                this.e.setImageDrawable(null);
            }
            boolean bl = !TextUtils.isEmpty((CharSequence)charSequence);
            if (bl) {
                if (this.d == null) {
                    f f2 = new f(this.getContext(), null, a.a.actionBarTabTextStyle);
                    f2.setEllipsize(TextUtils.TruncateAt.END);
                    a2 = new LinearLayoutCompat.a(-2, -2);
                    a2.h = 16;
                    f2.setLayoutParams((ViewGroup.LayoutParams)a2);
                    this.addView((View)f2);
                    this.d = f2;
                }
                this.d.setText(charSequence);
                this.d.setVisibility(0);
            } else if (this.d != null) {
                this.d.setVisibility(8);
                this.d.setText(null);
            }
            if (this.e != null) {
                this.e.setContentDescription(b2.d());
            }
            if (!bl && !TextUtils.isEmpty((CharSequence)b2.d())) {
                this.setOnLongClickListener(this);
                return;
            }
            this.setOnLongClickListener(null);
            this.setLongClickable(false);
        }

        @Override
        public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
            super.onInitializeAccessibilityEvent(accessibilityEvent);
            accessibilityEvent.setClassName((CharSequence)a.b.class.getName());
        }

        @Override
        public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
            super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
            if (Build.VERSION.SDK_INT >= 14) {
                accessibilityNodeInfo.setClassName((CharSequence)a.b.class.getName());
            }
        }

        public final boolean onLongClick(View object) {
            object = new int[2];
            this.getLocationOnScreen((int[])object);
            Context context = this.getContext();
            int n2 = this.getWidth();
            int n3 = this.getHeight();
            int n4 = context.getResources().getDisplayMetrics().widthPixels;
            context = Toast.makeText((Context)context, (CharSequence)this.a.d(), (int)0);
            context.setGravity(49, (int)(object[0] + n2 / 2 - n4 / 2), n3);
            context.show();
            return true;
        }

        @Override
        public final void onMeasure(int n2, int n3) {
            super.onMeasure(n2, n3);
            if (m.this.b > 0 && this.getMeasuredWidth() > m.this.b) {
                super.onMeasure(View.MeasureSpec.makeMeasureSpec((int)m.this.b, (int)0x40000000), n3);
            }
        }

        /*
         * Enabled aggressive block sorting
         */
        public final void setSelected(boolean bl) {
            boolean bl2 = this.isSelected() != bl;
            super.setSelected(bl);
            if (bl2 && bl) {
                this.sendAccessibilityEvent(4);
            }
        }
    }
}

