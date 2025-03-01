package android.support.v7.internal.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.support.v7.a.a;
import android.support.v7.b.a;
import android.support.v7.internal.widget.d;
import android.support.v7.widget.LinearLayoutCompat;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
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

public final class m extends HorizontalScrollView implements d.b {
    private static final Interpolator i = new DecelerateInterpolator();
    Runnable a;
    int b;
    int c;
    /* access modifiers changed from: private */
    public LinearLayoutCompat d;
    private SpinnerCompat e;
    private boolean f;
    private int g;
    private int h;

    public final void onMeasure(int i2, int i3) {
        boolean z = true;
        int mode = View.MeasureSpec.getMode(i2);
        boolean z2 = mode == 1073741824;
        setFillViewport(z2);
        int childCount = this.d.getChildCount();
        if (childCount <= 1 || !(mode == 1073741824 || mode == Integer.MIN_VALUE)) {
            this.b = -1;
        } else {
            if (childCount > 2) {
                this.b = (int) (((float) View.MeasureSpec.getSize(i2)) * 0.4f);
            } else {
                this.b = View.MeasureSpec.getSize(i2) / 2;
            }
            this.b = Math.min(this.b, this.c);
        }
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(this.g, 1073741824);
        if (z2 || !this.f) {
            z = false;
        }
        if (z) {
            this.d.measure(0, makeMeasureSpec);
            if (this.d.getMeasuredWidth() <= View.MeasureSpec.getSize(i2)) {
                b();
            } else if (!a()) {
                if (this.e == null) {
                    SpinnerCompat spinnerCompat = new SpinnerCompat(getContext(), a.C0011a.actionDropDownStyle);
                    spinnerCompat.setLayoutParams(new LinearLayoutCompat.a(-2, -1));
                    spinnerCompat.a((d.b) this);
                    this.e = spinnerCompat;
                }
                removeView(this.d);
                addView(this.e, new ViewGroup.LayoutParams(-2, -1));
                if (this.e.a == null) {
                    this.e.setAdapter((SpinnerAdapter) new a(this, (byte) 0));
                }
                if (this.a != null) {
                    removeCallbacks(this.a);
                    this.a = null;
                }
                this.e.setSelection(this.h);
            }
        } else {
            b();
        }
        int measuredWidth = getMeasuredWidth();
        super.onMeasure(i2, makeMeasureSpec);
        int measuredWidth2 = getMeasuredWidth();
        if (z2 && measuredWidth != measuredWidth2) {
            setTabSelected(this.h);
        }
    }

    private boolean a() {
        return this.e != null && this.e.getParent() == this;
    }

    public final void setAllowCollapse(boolean z) {
        this.f = z;
    }

    private boolean b() {
        if (a()) {
            removeView(this.e);
            addView(this.d, new ViewGroup.LayoutParams(-2, -1));
            setTabSelected(this.e.getSelectedItemPosition());
        }
        return false;
    }

    public final void setTabSelected(int i2) {
        boolean z;
        this.h = i2;
        int childCount = this.d.getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = this.d.getChildAt(i3);
            if (i3 == i2) {
                z = true;
            } else {
                z = false;
            }
            childAt.setSelected(z);
            if (z) {
                final View childAt2 = this.d.getChildAt(i2);
                if (this.a != null) {
                    removeCallbacks(this.a);
                }
                this.a = new Runnable() {
                    public final void run() {
                        m.this.smoothScrollTo(childAt2.getLeft() - ((m.this.getWidth() - childAt2.getWidth()) / 2), 0);
                        m.this.a = null;
                    }
                };
                post(this.a);
            }
        }
        if (this.e != null && i2 >= 0) {
            this.e.setSelection(i2);
        }
    }

    public final void setContentHeight(int i2) {
        this.g = i2;
        requestLayout();
    }

    /* access modifiers changed from: protected */
    public final void onConfigurationChanged(Configuration configuration) {
        boolean z;
        if (Build.VERSION.SDK_INT >= 8) {
            super.onConfigurationChanged(configuration);
        }
        android.support.v7.internal.view.a a2 = android.support.v7.internal.view.a.a(getContext());
        TypedArray obtainStyledAttributes = a2.a.obtainStyledAttributes((AttributeSet) null, a.i.ActionBar, a.C0011a.actionBarStyle, 0);
        int layoutDimension = obtainStyledAttributes.getLayoutDimension(a.i.ActionBar_height, 0);
        Resources resources = a2.a.getResources();
        if (a2.a.getApplicationInfo().targetSdkVersion >= 16) {
            z = a2.a.getResources().getBoolean(a.b.abc_action_bar_embed_tabs);
        } else {
            z = a2.a.getResources().getBoolean(a.b.abc_action_bar_embed_tabs_pre_jb);
        }
        if (!z) {
            layoutDimension = Math.min(layoutDimension, resources.getDimensionPixelSize(a.c.abc_action_bar_stacked_max_height));
        }
        obtainStyledAttributes.recycle();
        setContentHeight(layoutDimension);
        this.c = a2.a.getResources().getDimensionPixelSize(a.c.abc_action_bar_stacked_tab_max_width);
    }

    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.a != null) {
            post(this.a);
        }
    }

    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.a != null) {
            removeCallbacks(this.a);
        }
    }

    private class b extends LinearLayoutCompat implements View.OnLongClickListener {
        a.b a;
        private final int[] c = {16842964};
        private TextView d;
        private ImageView e;
        private View f;

        public b(Context context, a.b bVar) {
            super(context, (AttributeSet) null, a.C0011a.actionBarTabStyle);
            this.a = bVar;
            q a2 = q.a(context, (AttributeSet) null, this.c, a.C0011a.actionBarTabStyle);
            if (a2.c(0)) {
                setBackgroundDrawable(a2.a(0));
            }
            a2.a.recycle();
            setGravity(8388627);
            a();
        }

        public final void setSelected(boolean z) {
            boolean z2 = isSelected() != z;
            super.setSelected(z);
            if (z2 && z) {
                sendAccessibilityEvent(4);
            }
        }

        public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
            super.onInitializeAccessibilityEvent(accessibilityEvent);
            accessibilityEvent.setClassName(a.b.class.getName());
        }

        public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
            super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
            if (Build.VERSION.SDK_INT >= 14) {
                accessibilityNodeInfo.setClassName(a.b.class.getName());
            }
        }

        public final void onMeasure(int i, int i2) {
            super.onMeasure(i, i2);
            if (m.this.b > 0 && getMeasuredWidth() > m.this.b) {
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(m.this.b, 1073741824), i2);
            }
        }

        public final void a() {
            boolean z;
            a.b bVar = this.a;
            View c2 = bVar.c();
            if (c2 != null) {
                ViewParent parent = c2.getParent();
                if (parent != this) {
                    if (parent != null) {
                        ((ViewGroup) parent).removeView(c2);
                    }
                    addView(c2);
                }
                this.f = c2;
                if (this.d != null) {
                    this.d.setVisibility(8);
                }
                if (this.e != null) {
                    this.e.setVisibility(8);
                    this.e.setImageDrawable((Drawable) null);
                    return;
                }
                return;
            }
            if (this.f != null) {
                removeView(this.f);
                this.f = null;
            }
            Drawable a2 = bVar.a();
            CharSequence b2 = bVar.b();
            if (a2 != null) {
                if (this.e == null) {
                    ImageView imageView = new ImageView(getContext());
                    LinearLayoutCompat.a aVar = new LinearLayoutCompat.a(-2, -2);
                    aVar.h = 16;
                    imageView.setLayoutParams(aVar);
                    addView(imageView, 0);
                    this.e = imageView;
                }
                this.e.setImageDrawable(a2);
                this.e.setVisibility(0);
            } else if (this.e != null) {
                this.e.setVisibility(8);
                this.e.setImageDrawable((Drawable) null);
            }
            if (!TextUtils.isEmpty(b2)) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                if (this.d == null) {
                    f fVar = new f(getContext(), (AttributeSet) null, a.C0011a.actionBarTabTextStyle);
                    fVar.setEllipsize(TextUtils.TruncateAt.END);
                    LinearLayoutCompat.a aVar2 = new LinearLayoutCompat.a(-2, -2);
                    aVar2.h = 16;
                    fVar.setLayoutParams(aVar2);
                    addView(fVar);
                    this.d = fVar;
                }
                this.d.setText(b2);
                this.d.setVisibility(0);
            } else if (this.d != null) {
                this.d.setVisibility(8);
                this.d.setText((CharSequence) null);
            }
            if (this.e != null) {
                this.e.setContentDescription(bVar.d());
            }
            if (z || TextUtils.isEmpty(bVar.d())) {
                setOnLongClickListener((View.OnLongClickListener) null);
                setLongClickable(false);
                return;
            }
            setOnLongClickListener(this);
        }

        public final boolean onLongClick(View view) {
            int[] iArr = new int[2];
            getLocationOnScreen(iArr);
            Context context = getContext();
            int width = getWidth();
            int height = getHeight();
            int i = context.getResources().getDisplayMetrics().widthPixels;
            Toast makeText = Toast.makeText(context, this.a.d(), 0);
            makeText.setGravity(49, (iArr[0] + (width / 2)) - (i / 2), height);
            makeText.show();
            return true;
        }
    }

    private class a extends BaseAdapter {
        private a() {
        }

        /* synthetic */ a(m mVar, byte b) {
            this();
        }

        public final int getCount() {
            return m.this.d.getChildCount();
        }

        public final Object getItem(int i) {
            return ((b) m.this.d.getChildAt(i)).a;
        }

        public final long getItemId(int i) {
            return (long) i;
        }

        public final View getView(int i, View view, ViewGroup viewGroup) {
            if (view == null) {
                return m.a(m.this, (a.b) getItem(i));
            }
            b bVar = (b) view;
            bVar.a = (a.b) getItem(i);
            bVar.a();
            return view;
        }
    }

    static /* synthetic */ b a(m mVar, a.b bVar) {
        b bVar2 = new b(mVar.getContext(), bVar);
        bVar2.setBackgroundDrawable((Drawable) null);
        bVar2.setLayoutParams(new AbsListView.LayoutParams(-1, mVar.g));
        return bVar2;
    }
}
