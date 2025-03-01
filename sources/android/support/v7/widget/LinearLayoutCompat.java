package android.support.v7.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.support.v4.view.u;
import android.support.v7.b.a;
import android.support.v7.internal.widget.q;
import android.support.v7.internal.widget.s;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;

public class LinearLayoutCompat extends ViewGroup {
    private boolean a;
    private int b;
    private int c;
    private int d;
    private int e;
    private int f;
    private float g;
    private boolean h;
    private int[] i;
    private int[] j;
    private Drawable k;
    private int l;
    private int m;
    private int n;
    private int o;

    public LinearLayoutCompat(Context context) {
        this(context, (AttributeSet) null);
    }

    public LinearLayoutCompat(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public LinearLayoutCompat(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.a = true;
        this.b = -1;
        this.c = 0;
        this.e = 8388659;
        q a2 = q.a(context, attributeSet, a.i.LinearLayoutCompat, i2);
        int a3 = a2.a(a.i.LinearLayoutCompat_android_orientation, -1);
        if (a3 >= 0) {
            setOrientation(a3);
        }
        int a4 = a2.a(a.i.LinearLayoutCompat_android_gravity, -1);
        if (a4 >= 0) {
            setGravity(a4);
        }
        boolean a5 = a2.a(a.i.LinearLayoutCompat_android_baselineAligned, true);
        if (!a5) {
            setBaselineAligned(a5);
        }
        this.g = a2.a.getFloat(a.i.LinearLayoutCompat_android_weightSum, -1.0f);
        this.b = a2.a(a.i.LinearLayoutCompat_android_baselineAlignedChildIndex, -1);
        this.h = a2.a(a.i.LinearLayoutCompat_measureWithLargestChild, false);
        setDividerDrawable(a2.a(a.i.LinearLayoutCompat_divider));
        this.n = a2.a(a.i.LinearLayoutCompat_showDividers, 0);
        this.o = a2.c(a.i.LinearLayoutCompat_dividerPadding, 0);
        a2.a.recycle();
    }

    public void setShowDividers(int i2) {
        if (i2 != this.n) {
            requestLayout();
        }
        this.n = i2;
    }

    public boolean shouldDelayChildPressedState() {
        return false;
    }

    public int getShowDividers() {
        return this.n;
    }

    public Drawable getDividerDrawable() {
        return this.k;
    }

    public void setDividerDrawable(Drawable drawable) {
        boolean z = false;
        if (drawable != this.k) {
            this.k = drawable;
            if (drawable != null) {
                this.l = drawable.getIntrinsicWidth();
                this.m = drawable.getIntrinsicHeight();
            } else {
                this.l = 0;
                this.m = 0;
            }
            if (drawable == null) {
                z = true;
            }
            setWillNotDraw(z);
            requestLayout();
        }
    }

    public void setDividerPadding(int i2) {
        this.o = i2;
    }

    public int getDividerPadding() {
        return this.o;
    }

    public int getDividerWidth() {
        return this.l;
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        int right;
        int left;
        int bottom;
        if (this.k != null) {
            if (this.d == 1) {
                int virtualChildCount = getVirtualChildCount();
                for (int i2 = 0; i2 < virtualChildCount; i2++) {
                    View childAt = getChildAt(i2);
                    if (!(childAt == null || childAt.getVisibility() == 8 || !a(i2))) {
                        a(canvas, (childAt.getTop() - ((a) childAt.getLayoutParams()).topMargin) - this.m);
                    }
                }
                if (a(virtualChildCount)) {
                    View childAt2 = getChildAt(virtualChildCount - 1);
                    if (childAt2 == null) {
                        bottom = (getHeight() - getPaddingBottom()) - this.m;
                    } else {
                        bottom = ((a) childAt2.getLayoutParams()).bottomMargin + childAt2.getBottom();
                    }
                    a(canvas, bottom);
                    return;
                }
                return;
            }
            int virtualChildCount2 = getVirtualChildCount();
            boolean a2 = s.a(this);
            for (int i3 = 0; i3 < virtualChildCount2; i3++) {
                View childAt3 = getChildAt(i3);
                if (!(childAt3 == null || childAt3.getVisibility() == 8 || !a(i3))) {
                    a aVar = (a) childAt3.getLayoutParams();
                    if (a2) {
                        left = aVar.rightMargin + childAt3.getRight();
                    } else {
                        left = (childAt3.getLeft() - aVar.leftMargin) - this.l;
                    }
                    b(canvas, left);
                }
            }
            if (a(virtualChildCount2)) {
                View childAt4 = getChildAt(virtualChildCount2 - 1);
                if (childAt4 != null) {
                    a aVar2 = (a) childAt4.getLayoutParams();
                    if (a2) {
                        right = (childAt4.getLeft() - aVar2.leftMargin) - this.l;
                    } else {
                        right = aVar2.rightMargin + childAt4.getRight();
                    }
                } else if (a2) {
                    right = getPaddingLeft();
                } else {
                    right = (getWidth() - getPaddingRight()) - this.l;
                }
                b(canvas, right);
            }
        }
    }

    private void a(Canvas canvas, int i2) {
        this.k.setBounds(getPaddingLeft() + this.o, i2, (getWidth() - getPaddingRight()) - this.o, this.m + i2);
        this.k.draw(canvas);
    }

    private void b(Canvas canvas, int i2) {
        this.k.setBounds(i2, getPaddingTop() + this.o, this.l + i2, (getHeight() - getPaddingBottom()) - this.o);
        this.k.draw(canvas);
    }

    public void setBaselineAligned(boolean z) {
        this.a = z;
    }

    public void setMeasureWithLargestChildEnabled(boolean z) {
        this.h = z;
    }

    public int getBaseline() {
        int i2;
        int i3;
        if (this.b < 0) {
            return super.getBaseline();
        }
        if (getChildCount() <= this.b) {
            throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout set to an index that is out of bounds.");
        }
        View childAt = getChildAt(this.b);
        int baseline = childAt.getBaseline();
        if (baseline != -1) {
            int i4 = this.c;
            if (this.d == 1 && (i3 = this.e & 112) != 48) {
                switch (i3) {
                    case 16:
                        i2 = i4 + (((((getBottom() - getTop()) - getPaddingTop()) - getPaddingBottom()) - this.f) / 2);
                        break;
                    case a.i.Theme_windowFixedHeightMinor:
                        i2 = ((getBottom() - getTop()) - getPaddingBottom()) - this.f;
                        break;
                }
            }
            i2 = i4;
            return ((a) childAt.getLayoutParams()).topMargin + i2 + baseline;
        } else if (this.b == 0) {
            return -1;
        } else {
            throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout points to a View that doesn't know how to get its baseline.");
        }
    }

    public int getBaselineAlignedChildIndex() {
        return this.b;
    }

    public void setBaselineAlignedChildIndex(int i2) {
        if (i2 < 0 || i2 >= getChildCount()) {
            throw new IllegalArgumentException("base aligned child index out of range (0, " + getChildCount() + ")");
        }
        this.b = i2;
    }

    /* access modifiers changed from: package-private */
    public int getVirtualChildCount() {
        return getChildCount();
    }

    public float getWeightSum() {
        return this.g;
    }

    public void setWeightSum(float f2) {
        this.g = Math.max(0.0f, f2);
    }

    public void onMeasure(int i2, int i3) {
        int i4;
        int i5;
        float f2;
        boolean z;
        int i6;
        int i7;
        int i8;
        int i9;
        View view;
        int i10;
        int i11;
        boolean z2;
        float f3;
        boolean z3;
        int i12;
        int i13;
        boolean z4;
        int i14;
        int i15;
        int i16;
        int i17;
        boolean z5;
        int i18;
        if (this.d == 1) {
            this.f = 0;
            int i19 = 0;
            int i20 = 0;
            int i21 = 0;
            int i22 = 0;
            boolean z6 = true;
            float f4 = 0.0f;
            int virtualChildCount = getVirtualChildCount();
            int mode = View.MeasureSpec.getMode(i2);
            int mode2 = View.MeasureSpec.getMode(i3);
            boolean z7 = false;
            boolean z8 = false;
            int i23 = this.b;
            boolean z9 = this.h;
            int i24 = Integer.MIN_VALUE;
            int i25 = 0;
            while (i25 < virtualChildCount) {
                View childAt = getChildAt(i25);
                if (childAt == null) {
                    this.f += 0;
                    i16 = i25;
                } else {
                    if (childAt.getVisibility() != 8) {
                        if (a(i25)) {
                            this.f += this.m;
                        }
                        a aVar = (a) childAt.getLayoutParams();
                        float f5 = f4 + aVar.g;
                        if (mode2 == 1073741824 && aVar.height == 0 && aVar.g > 0.0f) {
                            int i26 = this.f;
                            this.f = Math.max(i26, aVar.topMargin + i26 + aVar.bottomMargin);
                            i17 = i24;
                            z5 = true;
                        } else {
                            int i27 = Integer.MIN_VALUE;
                            if (aVar.height == 0 && aVar.g > 0.0f) {
                                i27 = 0;
                                aVar.height = -2;
                            }
                            int i28 = i27;
                            a(childAt, i2, 0, i3, f5 == 0.0f ? this.f : 0);
                            if (i28 != Integer.MIN_VALUE) {
                                aVar.height = i28;
                            }
                            int measuredHeight = childAt.getMeasuredHeight();
                            int i29 = this.f;
                            this.f = Math.max(i29, i29 + measuredHeight + aVar.topMargin + aVar.bottomMargin + 0);
                            if (z9) {
                                i17 = Math.max(measuredHeight, i24);
                                z5 = z8;
                            } else {
                                i17 = i24;
                                z5 = z8;
                            }
                        }
                        if (i23 >= 0 && i23 == i25 + 1) {
                            this.c = this.f;
                        }
                        if (i25 >= i23 || aVar.g <= 0.0f) {
                            boolean z10 = false;
                            if (mode == 1073741824 || aVar.width != -1) {
                                z4 = z7;
                            } else {
                                z4 = true;
                                z10 = true;
                            }
                            int i30 = aVar.leftMargin + aVar.rightMargin;
                            int measuredWidth = childAt.getMeasuredWidth() + i30;
                            int max = Math.max(i19, measuredWidth);
                            i15 = s.a(i20, u.f(childAt));
                            boolean z11 = z6 && aVar.width == -1;
                            if (aVar.g > 0.0f) {
                                if (z10) {
                                    i18 = i30;
                                } else {
                                    i18 = measuredWidth;
                                }
                                f3 = f5;
                                z3 = z11;
                                i13 = i21;
                                z2 = z5;
                                i14 = max;
                                int i31 = i17;
                                i12 = Math.max(i22, i18);
                                i11 = i31;
                            } else {
                                if (!z10) {
                                    i30 = measuredWidth;
                                }
                                int max2 = Math.max(i21, i30);
                                f3 = f5;
                                z3 = z11;
                                i13 = max2;
                                z2 = z5;
                                i11 = i17;
                                i12 = i22;
                                i14 = max;
                            }
                        } else {
                            throw new RuntimeException("A child of LinearLayout with index less than mBaselineAlignedChildIndex has weight > 0, which won't work.  Either remove the weight, or don't set mBaselineAlignedChildIndex.");
                        }
                    } else {
                        i11 = i24;
                        z2 = z8;
                        f3 = f4;
                        z3 = z6;
                        i12 = i22;
                        i13 = i21;
                        z4 = z7;
                        i14 = i19;
                        i15 = i20;
                    }
                    z6 = z3;
                    i22 = i12;
                    i21 = i13;
                    i20 = i15;
                    i19 = i14;
                    i24 = i11;
                    z7 = z4;
                    i16 = i25 + 0;
                    f4 = f3;
                    z8 = z2;
                }
                i25 = i16 + 1;
            }
            if (this.f > 0 && a(virtualChildCount)) {
                this.f += this.m;
            }
            if (z9 && (mode2 == Integer.MIN_VALUE || mode2 == 0)) {
                this.f = 0;
                int i32 = 0;
                while (i32 < virtualChildCount) {
                    View childAt2 = getChildAt(i32);
                    if (childAt2 == null) {
                        this.f += 0;
                        i10 = i32;
                    } else if (childAt2.getVisibility() == 8) {
                        i10 = i32 + 0;
                    } else {
                        a aVar2 = (a) childAt2.getLayoutParams();
                        int i33 = this.f;
                        this.f = Math.max(i33, aVar2.bottomMargin + i33 + i24 + aVar2.topMargin + 0);
                        i10 = i32;
                    }
                    i32 = i10 + 1;
                }
            }
            this.f += getPaddingTop() + getPaddingBottom();
            int a2 = u.a(Math.max(this.f, getSuggestedMinimumHeight()), i3, 0);
            int i34 = (16777215 & a2) - this.f;
            if (z8 || (i34 != 0 && f4 > 0.0f)) {
                if (this.g > 0.0f) {
                    f4 = this.g;
                }
                this.f = 0;
                int i35 = 0;
                boolean z12 = z6;
                int i36 = i21;
                int i37 = i20;
                int i38 = i19;
                while (i35 < virtualChildCount) {
                    View childAt3 = getChildAt(i35);
                    if (childAt3.getVisibility() != 8) {
                        a aVar3 = (a) childAt3.getLayoutParams();
                        float f6 = aVar3.g;
                        if (f6 > 0.0f) {
                            int i39 = (int) ((((float) i34) * f6) / f4);
                            float f7 = f4 - f6;
                            int i40 = i34 - i39;
                            int childMeasureSpec = getChildMeasureSpec(i2, getPaddingLeft() + getPaddingRight() + aVar3.leftMargin + aVar3.rightMargin, aVar3.width);
                            if (aVar3.height != 0 || mode2 != 1073741824) {
                                i39 += childAt3.getMeasuredHeight();
                                if (i39 < 0) {
                                    i39 = 0;
                                }
                                view = childAt3;
                            } else if (i39 > 0) {
                                view = childAt3;
                            } else {
                                i39 = 0;
                                view = childAt3;
                            }
                            view.measure(childMeasureSpec, View.MeasureSpec.makeMeasureSpec(i39, 1073741824));
                            i8 = i40;
                            i9 = s.a(i37, u.f(childAt3) & -256);
                            f2 = f7;
                        } else {
                            f2 = f4;
                            i8 = i34;
                            i9 = i37;
                        }
                        int i41 = aVar3.leftMargin + aVar3.rightMargin;
                        int measuredWidth2 = childAt3.getMeasuredWidth() + i41;
                        int max3 = Math.max(i38, measuredWidth2);
                        if (!(mode != 1073741824 && aVar3.width == -1)) {
                            i41 = measuredWidth2;
                        }
                        int max4 = Math.max(i36, i41);
                        z = z12 && aVar3.width == -1;
                        int i42 = this.f;
                        this.f = Math.max(i42, aVar3.bottomMargin + childAt3.getMeasuredHeight() + i42 + aVar3.topMargin + 0);
                        i6 = max4;
                        i7 = max3;
                    } else {
                        f2 = f4;
                        z = z12;
                        i6 = i36;
                        i7 = i38;
                        i8 = i34;
                        i9 = i37;
                    }
                    i35++;
                    z12 = z;
                    i36 = i6;
                    i37 = i9;
                    i38 = i7;
                    i34 = i8;
                    f4 = f2;
                }
                this.f += getPaddingTop() + getPaddingBottom();
                i5 = i36;
                i20 = i37;
                i4 = i38;
                z6 = z12;
            } else {
                int max5 = Math.max(i21, i22);
                if (z9 && mode2 != 1073741824) {
                    int i43 = 0;
                    while (true) {
                        int i44 = i43;
                        if (i44 >= virtualChildCount) {
                            break;
                        }
                        View childAt4 = getChildAt(i44);
                        if (!(childAt4 == null || childAt4.getVisibility() == 8 || ((a) childAt4.getLayoutParams()).g <= 0.0f)) {
                            childAt4.measure(View.MeasureSpec.makeMeasureSpec(childAt4.getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(i24, 1073741824));
                        }
                        i43 = i44 + 1;
                    }
                }
                i5 = max5;
                i4 = i19;
            }
            if (z6 || mode == 1073741824) {
                i5 = i4;
            }
            setMeasuredDimension(u.a(Math.max(i5 + getPaddingLeft() + getPaddingRight(), getSuggestedMinimumWidth()), i2, i20), a2);
            if (z7) {
                a(virtualChildCount, i3);
                return;
            }
            return;
        }
        b(i2, i3);
    }

    private boolean a(int i2) {
        if (i2 == 0) {
            if ((this.n & 1) != 0) {
                return true;
            }
            return false;
        } else if (i2 == getChildCount()) {
            if ((this.n & 4) == 0) {
                return false;
            }
            return true;
        } else if ((this.n & 2) == 0) {
            return false;
        } else {
            for (int i3 = i2 - 1; i3 >= 0; i3--) {
                if (getChildAt(i3).getVisibility() != 8) {
                    return true;
                }
            }
            return false;
        }
    }

    private void a(int i2, int i3) {
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824);
        for (int i4 = 0; i4 < i2; i4++) {
            View childAt = getChildAt(i4);
            if (childAt.getVisibility() != 8) {
                a aVar = (a) childAt.getLayoutParams();
                if (aVar.width == -1) {
                    int i5 = aVar.height;
                    aVar.height = childAt.getMeasuredHeight();
                    measureChildWithMargins(childAt, makeMeasureSpec, 0, i3, 0);
                    aVar.height = i5;
                }
            }
        }
    }

    private void b(int i2, int i3) {
        boolean z;
        int i4;
        int i5;
        int i6;
        float f2;
        int i7;
        int i8;
        boolean z2;
        int i9;
        int i10;
        int i11;
        int i12;
        float f3;
        int i13;
        int baseline;
        View view;
        int i14;
        int i15;
        boolean z3;
        float f4;
        boolean z4;
        int i16;
        int i17;
        boolean z5;
        int i18;
        int i19;
        int i20;
        int i21;
        boolean z6;
        int i22;
        int baseline2;
        this.f = 0;
        int i23 = 0;
        int i24 = 0;
        int i25 = 0;
        int i26 = 0;
        boolean z7 = true;
        float f5 = 0.0f;
        int virtualChildCount = getVirtualChildCount();
        int mode = View.MeasureSpec.getMode(i2);
        int mode2 = View.MeasureSpec.getMode(i3);
        boolean z8 = false;
        boolean z9 = false;
        if (this.i == null || this.j == null) {
            this.i = new int[4];
            this.j = new int[4];
        }
        int[] iArr = this.i;
        int[] iArr2 = this.j;
        iArr[3] = -1;
        iArr[2] = -1;
        iArr[1] = -1;
        iArr[0] = -1;
        iArr2[3] = -1;
        iArr2[2] = -1;
        iArr2[1] = -1;
        iArr2[0] = -1;
        boolean z10 = this.a;
        boolean z11 = this.h;
        if (mode == 1073741824) {
            z = true;
        } else {
            z = false;
        }
        int i27 = Integer.MIN_VALUE;
        int i28 = 0;
        while (i28 < virtualChildCount) {
            View childAt = getChildAt(i28);
            if (childAt == null) {
                this.f += 0;
                i20 = i28;
            } else {
                if (childAt.getVisibility() != 8) {
                    if (a(i28)) {
                        this.f += this.l;
                    }
                    a aVar = (a) childAt.getLayoutParams();
                    float f6 = f5 + aVar.g;
                    if (mode == 1073741824 && aVar.width == 0 && aVar.g > 0.0f) {
                        if (z) {
                            this.f += aVar.leftMargin + aVar.rightMargin;
                        } else {
                            int i29 = this.f;
                            this.f = Math.max(i29, aVar.leftMargin + i29 + aVar.rightMargin);
                        }
                        if (z10) {
                            int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
                            childAt.measure(makeMeasureSpec, makeMeasureSpec);
                            i21 = i27;
                            z6 = z9;
                        } else {
                            i21 = i27;
                            z6 = true;
                        }
                    } else {
                        int i30 = Integer.MIN_VALUE;
                        if (aVar.width == 0 && aVar.g > 0.0f) {
                            i30 = 0;
                            aVar.width = -2;
                        }
                        int i31 = i30;
                        a(childAt, i2, f6 == 0.0f ? this.f : 0, i3, 0);
                        if (i31 != Integer.MIN_VALUE) {
                            aVar.width = i31;
                        }
                        int measuredWidth = childAt.getMeasuredWidth();
                        if (z) {
                            this.f += aVar.leftMargin + measuredWidth + aVar.rightMargin + 0;
                        } else {
                            int i32 = this.f;
                            this.f = Math.max(i32, i32 + measuredWidth + aVar.leftMargin + aVar.rightMargin + 0);
                        }
                        if (z11) {
                            i21 = Math.max(measuredWidth, i27);
                            z6 = z9;
                        } else {
                            i21 = i27;
                            z6 = z9;
                        }
                    }
                    boolean z12 = false;
                    if (mode2 == 1073741824 || aVar.height != -1) {
                        z5 = z8;
                    } else {
                        z5 = true;
                        z12 = true;
                    }
                    int i33 = aVar.topMargin + aVar.bottomMargin;
                    int measuredHeight = childAt.getMeasuredHeight() + i33;
                    i19 = s.a(i24, u.f(childAt));
                    if (z10 && (baseline2 = childAt.getBaseline()) != -1) {
                        int i34 = ((((aVar.h < 0 ? this.e : aVar.h) & 112) >> 4) & -2) >> 1;
                        iArr[i34] = Math.max(iArr[i34], baseline2);
                        iArr2[i34] = Math.max(iArr2[i34], measuredHeight - baseline2);
                    }
                    int max = Math.max(i23, measuredHeight);
                    boolean z13 = z7 && aVar.height == -1;
                    if (aVar.g > 0.0f) {
                        if (z12) {
                            i22 = i33;
                        } else {
                            i22 = measuredHeight;
                        }
                        f4 = f6;
                        z4 = z13;
                        i17 = i25;
                        z3 = z6;
                        i18 = max;
                        int i35 = i21;
                        i16 = Math.max(i26, i22);
                        i15 = i35;
                    } else {
                        if (!z12) {
                            i33 = measuredHeight;
                        }
                        int max2 = Math.max(i25, i33);
                        f4 = f6;
                        z4 = z13;
                        i17 = max2;
                        z3 = z6;
                        i15 = i21;
                        i16 = i26;
                        i18 = max;
                    }
                } else {
                    i15 = i27;
                    z3 = z9;
                    f4 = f5;
                    z4 = z7;
                    i16 = i26;
                    i17 = i25;
                    z5 = z8;
                    i18 = i23;
                    i19 = i24;
                }
                z7 = z4;
                i26 = i16;
                i25 = i17;
                i24 = i19;
                i23 = i18;
                i27 = i15;
                z8 = z5;
                i20 = i28 + 0;
                f5 = f4;
                z9 = z3;
            }
            i28 = i20 + 1;
        }
        if (this.f > 0 && a(virtualChildCount)) {
            this.f += this.l;
        }
        if (iArr[1] == -1 && iArr[0] == -1 && iArr[2] == -1 && iArr[3] == -1) {
            i4 = i23;
        } else {
            i4 = Math.max(i23, Math.max(iArr[3], Math.max(iArr[0], Math.max(iArr[1], iArr[2]))) + Math.max(iArr2[3], Math.max(iArr2[0], Math.max(iArr2[1], iArr2[2]))));
        }
        if (z11 && (mode == Integer.MIN_VALUE || mode == 0)) {
            this.f = 0;
            int i36 = 0;
            while (i36 < virtualChildCount) {
                View childAt2 = getChildAt(i36);
                if (childAt2 == null) {
                    this.f += 0;
                    i14 = i36;
                } else if (childAt2.getVisibility() == 8) {
                    i14 = i36 + 0;
                } else {
                    a aVar2 = (a) childAt2.getLayoutParams();
                    if (z) {
                        this.f = aVar2.rightMargin + aVar2.leftMargin + i27 + 0 + this.f;
                        i14 = i36;
                    } else {
                        int i37 = this.f;
                        this.f = Math.max(i37, aVar2.rightMargin + i37 + i27 + aVar2.leftMargin + 0);
                        i14 = i36;
                    }
                }
                i36 = i14 + 1;
            }
        }
        this.f += getPaddingLeft() + getPaddingRight();
        int a2 = u.a(Math.max(this.f, getSuggestedMinimumWidth()), i2, 0);
        int i38 = (16777215 & a2) - this.f;
        if (z9 || (i38 != 0 && f5 > 0.0f)) {
            if (this.g > 0.0f) {
                f5 = this.g;
            }
            iArr[3] = -1;
            iArr[2] = -1;
            iArr[1] = -1;
            iArr[0] = -1;
            iArr2[3] = -1;
            iArr2[2] = -1;
            iArr2[1] = -1;
            iArr2[0] = -1;
            this.f = 0;
            int i39 = 0;
            boolean z14 = z7;
            int i40 = i25;
            int i41 = -1;
            int i42 = i24;
            while (i39 < virtualChildCount) {
                View childAt3 = getChildAt(i39);
                if (childAt3 == null || childAt3.getVisibility() == 8) {
                    f2 = f5;
                    i7 = i38;
                    i8 = i40;
                    z2 = z14;
                    i9 = i42;
                    i10 = i41;
                } else {
                    a aVar3 = (a) childAt3.getLayoutParams();
                    float f7 = aVar3.g;
                    if (f7 > 0.0f) {
                        int i43 = (int) ((((float) i38) * f7) / f5);
                        float f8 = f5 - f7;
                        int i44 = i38 - i43;
                        int childMeasureSpec = getChildMeasureSpec(i3, getPaddingTop() + getPaddingBottom() + aVar3.topMargin + aVar3.bottomMargin, aVar3.height);
                        if (aVar3.width != 0 || mode != 1073741824) {
                            i43 += childAt3.getMeasuredWidth();
                            if (i43 < 0) {
                                i43 = 0;
                            }
                            view = childAt3;
                        } else if (i43 > 0) {
                            view = childAt3;
                        } else {
                            i43 = 0;
                            view = childAt3;
                        }
                        view.measure(View.MeasureSpec.makeMeasureSpec(i43, 1073741824), childMeasureSpec);
                        i12 = s.a(i42, u.f(childAt3) & -16777216);
                        f3 = f8;
                        i11 = i44;
                    } else {
                        i11 = i38;
                        i12 = i42;
                        f3 = f5;
                    }
                    if (z) {
                        this.f += childAt3.getMeasuredWidth() + aVar3.leftMargin + aVar3.rightMargin + 0;
                    } else {
                        int i45 = this.f;
                        this.f = Math.max(i45, childAt3.getMeasuredWidth() + i45 + aVar3.leftMargin + aVar3.rightMargin + 0);
                    }
                    boolean z15 = mode2 != 1073741824 && aVar3.height == -1;
                    int i46 = aVar3.topMargin + aVar3.bottomMargin;
                    int measuredHeight2 = childAt3.getMeasuredHeight() + i46;
                    int max3 = Math.max(i41, measuredHeight2);
                    if (z15) {
                        i13 = i46;
                    } else {
                        i13 = measuredHeight2;
                    }
                    int max4 = Math.max(i40, i13);
                    boolean z16 = z14 && aVar3.height == -1;
                    if (z10 && (baseline = childAt3.getBaseline()) != -1) {
                        int i47 = ((((aVar3.h < 0 ? this.e : aVar3.h) & 112) >> 4) & -2) >> 1;
                        iArr[i47] = Math.max(iArr[i47], baseline);
                        iArr2[i47] = Math.max(iArr2[i47], measuredHeight2 - baseline);
                    }
                    f2 = f3;
                    i8 = max4;
                    i9 = i12;
                    z2 = z16;
                    i10 = max3;
                    i7 = i11;
                }
                i39++;
                z14 = z2;
                i40 = i8;
                i41 = i10;
                i42 = i9;
                f5 = f2;
                i38 = i7;
            }
            this.f += getPaddingLeft() + getPaddingRight();
            if (!(iArr[1] == -1 && iArr[0] == -1 && iArr[2] == -1 && iArr[3] == -1)) {
                i41 = Math.max(i41, Math.max(iArr[3], Math.max(iArr[0], Math.max(iArr[1], iArr[2]))) + Math.max(iArr2[3], Math.max(iArr2[0], Math.max(iArr2[1], iArr2[2]))));
            }
            i6 = i40;
            i24 = i42;
            i5 = i41;
            z7 = z14;
        } else {
            int max5 = Math.max(i25, i26);
            if (z11 && mode != 1073741824) {
                int i48 = 0;
                while (true) {
                    int i49 = i48;
                    if (i49 >= virtualChildCount) {
                        break;
                    }
                    View childAt4 = getChildAt(i49);
                    if (!(childAt4 == null || childAt4.getVisibility() == 8 || ((a) childAt4.getLayoutParams()).g <= 0.0f)) {
                        childAt4.measure(View.MeasureSpec.makeMeasureSpec(i27, 1073741824), View.MeasureSpec.makeMeasureSpec(childAt4.getMeasuredHeight(), 1073741824));
                    }
                    i48 = i49 + 1;
                }
            }
            i6 = max5;
            i5 = i4;
        }
        if (z7 || mode2 == 1073741824) {
            i6 = i5;
        }
        setMeasuredDimension((-16777216 & i24) | a2, u.a(Math.max(i6 + getPaddingTop() + getPaddingBottom(), getSuggestedMinimumHeight()), i3, i24 << 16));
        if (z8) {
            int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824);
            int i50 = 0;
            while (true) {
                int i51 = i50;
                if (i51 < virtualChildCount) {
                    View childAt5 = getChildAt(i51);
                    if (childAt5.getVisibility() != 8) {
                        a aVar4 = (a) childAt5.getLayoutParams();
                        if (aVar4.height == -1) {
                            int i52 = aVar4.width;
                            aVar4.width = childAt5.getMeasuredWidth();
                            measureChildWithMargins(childAt5, i2, 0, makeMeasureSpec2, 0);
                            aVar4.width = i52;
                        }
                    }
                    i50 = i51 + 1;
                } else {
                    return;
                }
            }
        }
    }

    private static int getChildrenSkipCount$5359dca7() {
        return 0;
    }

    private void a(View view, int i2, int i3, int i4, int i5) {
        measureChildWithMargins(view, i2, i3, i4, i5);
    }

    private static int getLocationOffset$3c7ec8d0() {
        return 0;
    }

    private static int getNextLocationOffset$3c7ec8d0() {
        return 0;
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x01d9, code lost:
        r6 = r7;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onLayout(boolean r24, int r25, int r26, int r27, int r28) {
        /*
            r23 = this;
            r0 = r23
            int r3 = r0.d
            r4 = 1
            if (r3 != r4) goto L_0x00bd
            int r8 = r23.getPaddingLeft()
            int r3 = r27 - r25
            int r4 = r23.getPaddingRight()
            int r9 = r3 - r4
            int r3 = r3 - r8
            int r4 = r23.getPaddingRight()
            int r10 = r3 - r4
            int r11 = r23.getVirtualChildCount()
            r0 = r23
            int r3 = r0.e
            r3 = r3 & 112(0x70, float:1.57E-43)
            r0 = r23
            int r4 = r0.e
            r5 = 8388615(0x800007, float:1.1754953E-38)
            r5 = r5 & r4
            switch(r3) {
                case 16: goto L_0x0053;
                case 80: goto L_0x0045;
                default: goto L_0x002f;
            }
        L_0x002f:
            int r3 = r23.getPaddingTop()
        L_0x0033:
            r7 = 0
            r6 = r3
        L_0x0035:
            if (r7 >= r11) goto L_0x01d6
            r0 = r23
            android.view.View r12 = r0.getChildAt(r7)
            if (r12 != 0) goto L_0x0062
            int r6 = r6 + 0
            r3 = r7
        L_0x0042:
            int r7 = r3 + 1
            goto L_0x0035
        L_0x0045:
            int r3 = r23.getPaddingTop()
            int r3 = r3 + r28
            int r3 = r3 - r26
            r0 = r23
            int r4 = r0.f
            int r3 = r3 - r4
            goto L_0x0033
        L_0x0053:
            int r3 = r23.getPaddingTop()
            int r4 = r28 - r26
            r0 = r23
            int r6 = r0.f
            int r4 = r4 - r6
            int r4 = r4 / 2
            int r3 = r3 + r4
            goto L_0x0033
        L_0x0062:
            int r3 = r12.getVisibility()
            r4 = 8
            if (r3 == r4) goto L_0x01e2
            int r13 = r12.getMeasuredWidth()
            int r14 = r12.getMeasuredHeight()
            android.view.ViewGroup$LayoutParams r3 = r12.getLayoutParams()
            android.support.v7.widget.LinearLayoutCompat$a r3 = (android.support.v7.widget.LinearLayoutCompat.a) r3
            int r4 = r3.h
            if (r4 >= 0) goto L_0x007d
            r4 = r5
        L_0x007d:
            int r15 = android.support.v4.view.u.e(r23)
            int r4 = android.support.v4.view.e.a(r4, r15)
            r4 = r4 & 7
            switch(r4) {
                case 1: goto L_0x00ab;
                case 5: goto L_0x00b7;
                default: goto L_0x008a;
            }
        L_0x008a:
            int r4 = r3.leftMargin
            int r4 = r4 + r8
        L_0x008d:
            r0 = r23
            boolean r15 = r0.a((int) r7)
            if (r15 == 0) goto L_0x009a
            r0 = r23
            int r15 = r0.m
            int r6 = r6 + r15
        L_0x009a:
            int r15 = r3.topMargin
            int r6 = r6 + r15
            int r15 = r6 + 0
            b(r12, r4, r15, r13, r14)
            int r3 = r3.bottomMargin
            int r3 = r3 + r14
            int r3 = r3 + 0
            int r6 = r6 + r3
            int r3 = r7 + 0
            goto L_0x0042
        L_0x00ab:
            int r4 = r10 - r13
            int r4 = r4 / 2
            int r4 = r4 + r8
            int r15 = r3.leftMargin
            int r4 = r4 + r15
            int r15 = r3.rightMargin
            int r4 = r4 - r15
            goto L_0x008d
        L_0x00b7:
            int r4 = r9 - r13
            int r15 = r3.rightMargin
            int r4 = r4 - r15
            goto L_0x008d
        L_0x00bd:
            boolean r5 = android.support.v7.internal.widget.s.a(r23)
            int r8 = r23.getPaddingTop()
            int r3 = r28 - r26
            int r4 = r23.getPaddingBottom()
            int r12 = r3 - r4
            int r3 = r3 - r8
            int r4 = r23.getPaddingBottom()
            int r13 = r3 - r4
            int r14 = r23.getVirtualChildCount()
            r0 = r23
            int r3 = r0.e
            r4 = 8388615(0x800007, float:1.1754953E-38)
            r3 = r3 & r4
            r0 = r23
            int r4 = r0.e
            r11 = r4 & 112(0x70, float:1.57E-43)
            r0 = r23
            boolean r15 = r0.a
            r0 = r23
            int[] r0 = r0.i
            r16 = r0
            r0 = r23
            int[] r0 = r0.j
            r17 = r0
            int r4 = android.support.v4.view.u.e(r23)
            int r3 = android.support.v4.view.e.a(r3, r4)
            switch(r3) {
                case 1: goto L_0x0134;
                case 5: goto L_0x0125;
                default: goto L_0x0101;
            }
        L_0x0101:
            int r9 = r23.getPaddingLeft()
        L_0x0105:
            r4 = 0
            r3 = 1
            if (r5 == 0) goto L_0x01de
            int r4 = r14 + -1
            r3 = -1
            r5 = r4
            r4 = r3
        L_0x010e:
            r10 = 0
        L_0x010f:
            if (r10 >= r14) goto L_0x01d6
            int r3 = r4 * r10
            int r18 = r5 + r3
            r0 = r23
            r1 = r18
            android.view.View r19 = r0.getChildAt(r1)
            if (r19 != 0) goto L_0x0144
            int r9 = r9 + 0
            r3 = r10
        L_0x0122:
            int r10 = r3 + 1
            goto L_0x010f
        L_0x0125:
            int r3 = r23.getPaddingLeft()
            int r3 = r3 + r27
            int r3 = r3 - r25
            r0 = r23
            int r4 = r0.f
            int r9 = r3 - r4
            goto L_0x0105
        L_0x0134:
            int r3 = r23.getPaddingLeft()
            int r4 = r27 - r25
            r0 = r23
            int r6 = r0.f
            int r4 = r4 - r6
            int r4 = r4 / 2
            int r9 = r3 + r4
            goto L_0x0105
        L_0x0144:
            int r3 = r19.getVisibility()
            r6 = 8
            if (r3 == r6) goto L_0x01db
            int r20 = r19.getMeasuredWidth()
            int r21 = r19.getMeasuredHeight()
            r6 = -1
            android.view.ViewGroup$LayoutParams r3 = r19.getLayoutParams()
            android.support.v7.widget.LinearLayoutCompat$a r3 = (android.support.v7.widget.LinearLayoutCompat.a) r3
            if (r15 == 0) goto L_0x0169
            int r7 = r3.height
            r22 = -1
            r0 = r22
            if (r7 == r0) goto L_0x0169
            int r6 = r19.getBaseline()
        L_0x0169:
            int r7 = r3.h
            if (r7 >= 0) goto L_0x016e
            r7 = r11
        L_0x016e:
            r7 = r7 & 112(0x70, float:1.57E-43)
            switch(r7) {
                case 16: goto L_0x01ad;
                case 48: goto L_0x019c;
                case 80: goto L_0x01b9;
                default: goto L_0x0173;
            }
        L_0x0173:
            r6 = r8
        L_0x0174:
            r0 = r23
            r1 = r18
            boolean r7 = r0.a((int) r1)
            if (r7 == 0) goto L_0x01d7
            r0 = r23
            int r7 = r0.l
            int r7 = r7 + r9
        L_0x0183:
            int r9 = r3.leftMargin
            int r7 = r7 + r9
            int r9 = r7 + 0
            r0 = r19
            r1 = r20
            r2 = r21
            b(r0, r9, r6, r1, r2)
            int r3 = r3.rightMargin
            int r3 = r3 + r20
            int r3 = r3 + 0
            int r9 = r7 + r3
            int r3 = r10 + 0
            goto L_0x0122
        L_0x019c:
            int r7 = r3.topMargin
            int r7 = r7 + r8
            r22 = -1
            r0 = r22
            if (r6 == r0) goto L_0x01d9
            r22 = 1
            r22 = r16[r22]
            int r6 = r22 - r6
            int r6 = r6 + r7
            goto L_0x0174
        L_0x01ad:
            int r6 = r13 - r21
            int r6 = r6 / 2
            int r6 = r6 + r8
            int r7 = r3.topMargin
            int r6 = r6 + r7
            int r7 = r3.bottomMargin
            int r6 = r6 - r7
            goto L_0x0174
        L_0x01b9:
            int r7 = r12 - r21
            int r0 = r3.bottomMargin
            r22 = r0
            int r7 = r7 - r22
            r22 = -1
            r0 = r22
            if (r6 == r0) goto L_0x01d9
            int r22 = r19.getMeasuredHeight()
            int r6 = r22 - r6
            r22 = 2
            r22 = r17[r22]
            int r6 = r22 - r6
            int r6 = r7 - r6
            goto L_0x0174
        L_0x01d6:
            return
        L_0x01d7:
            r7 = r9
            goto L_0x0183
        L_0x01d9:
            r6 = r7
            goto L_0x0174
        L_0x01db:
            r3 = r10
            goto L_0x0122
        L_0x01de:
            r5 = r4
            r4 = r3
            goto L_0x010e
        L_0x01e2:
            r3 = r7
            goto L_0x0042
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.widget.LinearLayoutCompat.onLayout(boolean, int, int, int, int):void");
    }

    private static void b(View view, int i2, int i3, int i4, int i5) {
        view.layout(i2, i3, i2 + i4, i3 + i5);
    }

    public void setOrientation(int i2) {
        if (this.d != i2) {
            this.d = i2;
            requestLayout();
        }
    }

    public int getOrientation() {
        return this.d;
    }

    public void setGravity(int i2) {
        int i3;
        if (this.e != i2) {
            if ((8388615 & i2) == 0) {
                i3 = 8388611 | i2;
            } else {
                i3 = i2;
            }
            if ((i3 & 112) == 0) {
                i3 |= 48;
            }
            this.e = i3;
            requestLayout();
        }
    }

    public void setHorizontalGravity(int i2) {
        int i3 = i2 & 8388615;
        if ((this.e & 8388615) != i3) {
            this.e = i3 | (this.e & -8388616);
            requestLayout();
        }
    }

    public void setVerticalGravity(int i2) {
        int i3 = i2 & 112;
        if ((this.e & 112) != i3) {
            this.e = i3 | (this.e & -113);
            requestLayout();
        }
    }

    /* renamed from: a */
    public a generateLayoutParams(AttributeSet attributeSet) {
        return new a(getContext(), attributeSet);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public a generateDefaultLayoutParams() {
        if (this.d == 0) {
            return new a(-2, -2);
        }
        if (this.d == 1) {
            return new a(-1, -2);
        }
        return null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public a generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new a(layoutParams);
    }

    /* access modifiers changed from: protected */
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof a;
    }

    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        if (Build.VERSION.SDK_INT >= 14) {
            super.onInitializeAccessibilityEvent(accessibilityEvent);
            accessibilityEvent.setClassName(LinearLayoutCompat.class.getName());
        }
    }

    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        if (Build.VERSION.SDK_INT >= 14) {
            super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
            accessibilityNodeInfo.setClassName(LinearLayoutCompat.class.getName());
        }
    }

    public static class a extends ViewGroup.MarginLayoutParams {
        public float g;
        public int h;

        public a(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.h = -1;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, a.i.LinearLayoutCompat_Layout);
            this.g = obtainStyledAttributes.getFloat(a.i.LinearLayoutCompat_Layout_android_layout_weight, 0.0f);
            this.h = obtainStyledAttributes.getInt(a.i.LinearLayoutCompat_Layout_android_layout_gravity, -1);
            obtainStyledAttributes.recycle();
        }

        public a(int i, int i2) {
            super(i, i2);
            this.h = -1;
            this.g = 0.0f;
        }

        public a(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.h = -1;
        }
    }
}
