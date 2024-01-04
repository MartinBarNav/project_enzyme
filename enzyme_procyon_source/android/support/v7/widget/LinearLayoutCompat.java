// 
// Decompiled by Procyon v0.5.36
// 

package android.support.v7.widget;

import android.content.res.TypedArray;
import android.view.ViewGroup$MarginLayoutParams;
import android.support.v4.view.e;
import android.view.accessibility.AccessibilityNodeInfo;
import android.os.Build$VERSION;
import android.view.accessibility.AccessibilityEvent;
import android.view.ViewGroup$LayoutParams;
import android.support.v7.internal.widget.s;
import android.support.v4.view.u;
import android.graphics.Canvas;
import android.view.View;
import android.view.View$MeasureSpec;
import android.support.v7.internal.widget.q;
import android.support.v7.b.a;
import android.util.AttributeSet;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.ViewGroup;

public class LinearLayoutCompat extends ViewGroup
{
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
    
    public LinearLayoutCompat(final Context context) {
        this(context, null);
    }
    
    public LinearLayoutCompat(final Context context, final AttributeSet set) {
        this(context, set, 0);
    }
    
    public LinearLayoutCompat(final Context context, final AttributeSet set, int n) {
        super(context, set, n);
        this.a = true;
        this.b = -1;
        this.c = 0;
        this.e = 8388659;
        final q a = q.a(context, set, android.support.v7.b.a.i.LinearLayoutCompat, n);
        n = a.a(android.support.v7.b.a.i.LinearLayoutCompat_android_orientation, -1);
        if (n >= 0) {
            this.setOrientation(n);
        }
        n = a.a(android.support.v7.b.a.i.LinearLayoutCompat_android_gravity, -1);
        if (n >= 0) {
            this.setGravity(n);
        }
        final boolean a2 = a.a(android.support.v7.b.a.i.LinearLayoutCompat_android_baselineAligned, true);
        if (!a2) {
            this.setBaselineAligned(a2);
        }
        n = android.support.v7.b.a.i.LinearLayoutCompat_android_weightSum;
        this.g = a.a.getFloat(n, -1.0f);
        this.b = a.a(android.support.v7.b.a.i.LinearLayoutCompat_android_baselineAlignedChildIndex, -1);
        this.h = a.a(android.support.v7.b.a.i.LinearLayoutCompat_measureWithLargestChild, false);
        this.setDividerDrawable(a.a(android.support.v7.b.a.i.LinearLayoutCompat_divider));
        this.n = a.a(android.support.v7.b.a.i.LinearLayoutCompat_showDividers, 0);
        this.o = a.c(android.support.v7.b.a.i.LinearLayoutCompat_dividerPadding, 0);
        a.a.recycle();
    }
    
    private void a(final int n, final int n2) {
        final int measureSpec = View$MeasureSpec.makeMeasureSpec(this.getMeasuredWidth(), 1073741824);
        for (int i = 0; i < n; ++i) {
            final View child = this.getChildAt(i);
            if (child.getVisibility() != 8) {
                final a a = (a)child.getLayoutParams();
                if (a.width == -1) {
                    final int height = a.height;
                    a.height = child.getMeasuredHeight();
                    this.measureChildWithMargins(child, measureSpec, 0, n2, 0);
                    a.height = height;
                }
            }
        }
    }
    
    private void a(final Canvas canvas, final int n) {
        this.k.setBounds(this.getPaddingLeft() + this.o, n, this.getWidth() - this.getPaddingRight() - this.o, this.m + n);
        this.k.draw(canvas);
    }
    
    private void a(final View view, final int n, final int n2, final int n3, final int n4) {
        this.measureChildWithMargins(view, n, n2, n3, n4);
    }
    
    private boolean a(int i) {
        final boolean b = true;
        boolean b2;
        if (i == 0) {
            b2 = ((this.n & 0x1) != 0x0 && b);
        }
        else if (i == this.getChildCount()) {
            b2 = b;
            if ((this.n & 0x4) == 0x0) {
                b2 = false;
            }
        }
        else if ((this.n & 0x2) != 0x0) {
            --i;
            while (i >= 0) {
                b2 = b;
                if (this.getChildAt(i).getVisibility() != 8) {
                    return b2;
                }
                --i;
            }
            b2 = false;
        }
        else {
            b2 = false;
        }
        return b2;
    }
    
    private void b(final int n, int i) {
        this.f = 0;
        int n2 = 0;
        int n3 = 0;
        int a = 0;
        int n4 = 0;
        int n5 = 1;
        float g = 0.0f;
        final int virtualChildCount = this.getVirtualChildCount();
        final int mode = View$MeasureSpec.getMode(n);
        final int mode2 = View$MeasureSpec.getMode(i);
        boolean b = false;
        int n6 = 0;
        if (this.i == null || this.j == null) {
            this.i = new int[4];
            this.j = new int[4];
        }
        final int[] j = this.i;
        final int[] k = this.j;
        j[2] = (j[3] = -1);
        j[0] = (j[1] = -1);
        k[2] = (k[3] = -1);
        k[0] = (k[1] = -1);
        final boolean a2 = this.a;
        final boolean h = this.h;
        final boolean b2 = mode == 1073741824;
        int max = Integer.MIN_VALUE;
        int n7;
        for (int l = 0; l < virtualChildCount; l = n7) {
            final View child = this.getChildAt(l);
            int n8;
            int n9;
            int n10;
            if (child == null) {
                this.f += 0;
                n7 = l;
                n8 = n2;
                n9 = a;
                n10 = n4;
            }
            else {
                int n17;
                int n19;
                int n20;
                int n21;
                int n22;
                if (child.getVisibility() != 8) {
                    if (this.a(l)) {
                        this.f += this.l;
                    }
                    final a a3 = (a)child.getLayoutParams();
                    g += a3.g;
                    if (mode == 1073741824 && a3.width == 0 && a3.g > 0.0f) {
                        if (b2) {
                            this.f += a3.leftMargin + a3.rightMargin;
                        }
                        else {
                            final int f = this.f;
                            this.f = Math.max(f, a3.leftMargin + f + a3.rightMargin);
                        }
                        if (a2) {
                            final int measureSpec = View$MeasureSpec.makeMeasureSpec(0, 0);
                            child.measure(measureSpec, measureSpec);
                        }
                        else {
                            n6 = 1;
                        }
                    }
                    else {
                        int width;
                        final int n11 = width = Integer.MIN_VALUE;
                        if (a3.width == 0) {
                            width = n11;
                            if (a3.g > 0.0f) {
                                width = 0;
                                a3.width = -2;
                            }
                        }
                        int f2;
                        if (g == 0.0f) {
                            f2 = this.f;
                        }
                        else {
                            f2 = 0;
                        }
                        this.a(child, n, f2, i, 0);
                        if (width != Integer.MIN_VALUE) {
                            a3.width = width;
                        }
                        final int measuredWidth = child.getMeasuredWidth();
                        if (b2) {
                            this.f += a3.leftMargin + measuredWidth + a3.rightMargin + 0;
                        }
                        else {
                            final int f3 = this.f;
                            this.f = Math.max(f3, f3 + measuredWidth + a3.leftMargin + a3.rightMargin + 0);
                        }
                        if (h) {
                            max = Math.max(measuredWidth, max);
                        }
                    }
                    boolean b3 = false;
                    if (mode2 != 1073741824 && a3.height == -1) {
                        b = true;
                        b3 = true;
                    }
                    int b4 = a3.topMargin + a3.bottomMargin;
                    int n12 = child.getMeasuredHeight() + b4;
                    final int a4 = s.a(n3, u.f(child));
                    if (a2) {
                        final int baseline = child.getBaseline();
                        if (baseline != -1) {
                            int n13;
                            if (a3.h < 0) {
                                n13 = this.e;
                            }
                            else {
                                n13 = a3.h;
                            }
                            final int n14 = ((n13 & 0x70) >> 4 & 0xFFFFFFFE) >> 1;
                            j[n14] = Math.max(j[n14], baseline);
                            k[n14] = Math.max(k[n14], n12 - baseline);
                        }
                    }
                    final int max2 = Math.max(n2, n12);
                    int n15;
                    if (n5 != 0 && a3.height == -1) {
                        n15 = 1;
                    }
                    else {
                        n15 = 0;
                    }
                    if (a3.g > 0.0f) {
                        if (b3) {
                            n12 = b4;
                        }
                        final int max3 = Math.max(n4, n12);
                        n5 = n15;
                        final int n16 = a;
                        n17 = max2;
                        final int n18 = max;
                        n19 = a4;
                        n9 = n16;
                        n20 = max3;
                        n21 = n6;
                        n22 = n18;
                    }
                    else {
                        if (!b3) {
                            b4 = n12;
                        }
                        final int max4 = Math.max(a, b4);
                        final int n23 = n6;
                        final int n24 = max2;
                        n22 = max;
                        n21 = n23;
                        n5 = n15;
                        n20 = n4;
                        n9 = max4;
                        n19 = a4;
                        n17 = n24;
                    }
                }
                else {
                    final int n25 = max;
                    n21 = n6;
                    final int n26 = n4;
                    final int n27 = a;
                    n17 = n2;
                    final int n28 = n3;
                    n22 = n25;
                    n20 = n26;
                    n9 = n27;
                    n19 = n28;
                }
                n7 = l + 0;
                final int n29 = n21;
                max = n22;
                n6 = n29;
                n10 = n20;
                n3 = n19;
                n8 = n17;
            }
            ++n7;
            n4 = n10;
            a = n9;
            n2 = n8;
        }
        if (this.f > 0 && this.a(virtualChildCount)) {
            this.f += this.l;
        }
        int max5;
        if (j[1] != -1 || j[0] != -1 || j[2] != -1 || j[3] != -1) {
            max5 = Math.max(n2, Math.max(j[3], Math.max(j[0], Math.max(j[1], j[2]))) + Math.max(k[3], Math.max(k[0], Math.max(k[1], k[2]))));
        }
        else {
            max5 = n2;
        }
        if (h && (mode == Integer.MIN_VALUE || mode == 0)) {
            this.f = 0;
            for (int n30 = 0; n30 < virtualChildCount; ++n30) {
                final View child2 = this.getChildAt(n30);
                if (child2 == null) {
                    this.f += 0;
                }
                else if (child2.getVisibility() == 8) {
                    n30 += 0;
                }
                else {
                    final a a5 = (a)child2.getLayoutParams();
                    if (b2) {
                        this.f += a5.rightMargin + (a5.leftMargin + max) + 0;
                    }
                    else {
                        final int f4 = this.f;
                        this.f = Math.max(f4, a5.rightMargin + (f4 + max + a5.leftMargin) + 0);
                    }
                }
            }
        }
        this.f += this.getPaddingLeft() + this.getPaddingRight();
        final int a6 = u.a(Math.max(this.f, this.getSuggestedMinimumWidth()), n, 0);
        final int n31 = (0xFFFFFF & a6) - this.f;
        int n59;
        int n60;
        if (n6 != 0 || (n31 != 0 && g > 0.0f)) {
            if (this.g > 0.0f) {
                g = this.g;
            }
            j[2] = (j[3] = -1);
            j[0] = (j[1] = -1);
            k[2] = (k[3] = -1);
            k[0] = (k[1] = -1);
            this.f = 0;
            int n32 = 0;
            int n33 = n5;
            final int n34 = -1;
            int n35 = n3;
            int n36 = n34;
            int n37 = n31;
            while (n32 < virtualChildCount) {
                final View child3 = this.getChildAt(n32);
                int n42;
                int max7;
                int n50;
                int n51;
                int n52;
                if (child3 != null && child3.getVisibility() != 8) {
                    final a a7 = (a)child3.getLayoutParams();
                    final float g2 = a7.g;
                    int n41;
                    if (g2 > 0.0f) {
                        final int n38 = (int)(n37 * g2 / g);
                        final int childMeasureSpec = getChildMeasureSpec(i, this.getPaddingTop() + this.getPaddingBottom() + a7.topMargin + a7.bottomMargin, a7.height);
                        int n39;
                        if (a7.width != 0 || mode != 1073741824) {
                            if ((n39 = n38 + child3.getMeasuredWidth()) < 0) {
                                n39 = 0;
                            }
                        }
                        else if (n38 > 0) {
                            n39 = n38;
                        }
                        else {
                            n39 = 0;
                        }
                        child3.measure(View$MeasureSpec.makeMeasureSpec(n39, 1073741824), childMeasureSpec);
                        final int a8 = s.a(n35, u.f(child3) & 0xFF000000);
                        g -= g2;
                        final int n40 = n37 - n38;
                        n41 = a8;
                        n42 = n40;
                    }
                    else {
                        final int n43 = n35;
                        n42 = n37;
                        n41 = n43;
                    }
                    if (b2) {
                        this.f += child3.getMeasuredWidth() + a7.leftMargin + a7.rightMargin + 0;
                    }
                    else {
                        final int f5 = this.f;
                        this.f = Math.max(f5, child3.getMeasuredWidth() + f5 + a7.leftMargin + a7.rightMargin + 0);
                    }
                    int n44;
                    if (mode2 != 1073741824 && a7.height == -1) {
                        n44 = 1;
                    }
                    else {
                        n44 = 0;
                    }
                    final int n45 = a7.topMargin + a7.bottomMargin;
                    final int b5 = child3.getMeasuredHeight() + n45;
                    final int max6 = Math.max(n36, b5);
                    int b6;
                    if (n44 != 0) {
                        b6 = n45;
                    }
                    else {
                        b6 = b5;
                    }
                    max7 = Math.max(a, b6);
                    int n46;
                    if (n33 != 0 && a7.height == -1) {
                        n46 = 1;
                    }
                    else {
                        n46 = 0;
                    }
                    if (a2) {
                        final int baseline2 = child3.getBaseline();
                        if (baseline2 != -1) {
                            int n47;
                            if (a7.h < 0) {
                                n47 = this.e;
                            }
                            else {
                                n47 = a7.h;
                            }
                            final int n48 = ((n47 & 0x70) >> 4 & 0xFFFFFFFE) >> 1;
                            j[n48] = Math.max(j[n48], baseline2);
                            k[n48] = Math.max(k[n48], b5 - baseline2);
                        }
                    }
                    final int n49 = n41;
                    n50 = n46;
                    n51 = max6;
                    n52 = n49;
                }
                else {
                    final int n53 = n33;
                    n52 = n35;
                    final int n54 = n36;
                    n42 = n37;
                    n50 = n53;
                    max7 = a;
                    n51 = n54;
                }
                final int n55 = n32 + 1;
                final int n56 = n50;
                final int n57 = max7;
                n36 = n51;
                n37 = n42;
                n35 = n52;
                n33 = n56;
                a = n57;
                n32 = n55;
            }
            this.f += this.getPaddingLeft() + this.getPaddingRight();
            int max8 = 0;
            Label_1945: {
                if (j[1] == -1 && j[0] == -1 && j[2] == -1) {
                    max8 = n36;
                    if (j[3] == -1) {
                        break Label_1945;
                    }
                }
                max8 = Math.max(n36, Math.max(j[3], Math.max(j[0], Math.max(j[1], j[2]))) + Math.max(k[3], Math.max(k[0], Math.max(k[1], k[2]))));
            }
            n3 = n35;
            final int n58 = max8;
            n5 = n33;
            n59 = n58;
            n60 = a;
        }
        else {
            final int max9 = Math.max(a, n4);
            if (h && mode != 1073741824) {
                for (int n61 = 0; n61 < virtualChildCount; ++n61) {
                    final View child4 = this.getChildAt(n61);
                    if (child4 != null && child4.getVisibility() != 8 && ((a)child4.getLayoutParams()).g > 0.0f) {
                        child4.measure(View$MeasureSpec.makeMeasureSpec(max, 1073741824), View$MeasureSpec.makeMeasureSpec(child4.getMeasuredHeight(), 1073741824));
                    }
                }
            }
            n60 = max9;
            n59 = max5;
        }
        if (n5 != 0 || mode2 == 1073741824) {
            n60 = n59;
        }
        this.setMeasuredDimension((0xFF000000 & n3) | a6, u.a(Math.max(n60 + (this.getPaddingTop() + this.getPaddingBottom()), this.getSuggestedMinimumHeight()), i, n3 << 16));
        if (b) {
            final int measureSpec2 = View$MeasureSpec.makeMeasureSpec(this.getMeasuredHeight(), 1073741824);
            View child5;
            a a9;
            int width2;
            for (i = 0; i < virtualChildCount; ++i) {
                child5 = this.getChildAt(i);
                if (child5.getVisibility() != 8) {
                    a9 = (a)child5.getLayoutParams();
                    if (a9.height == -1) {
                        width2 = a9.width;
                        a9.width = child5.getMeasuredWidth();
                        this.measureChildWithMargins(child5, n, 0, measureSpec2, 0);
                        a9.width = width2;
                    }
                }
            }
        }
    }
    
    private void b(final Canvas canvas, final int n) {
        this.k.setBounds(n, this.getPaddingTop() + this.o, this.l + n, this.getHeight() - this.getPaddingBottom() - this.o);
        this.k.draw(canvas);
    }
    
    private static void b(final View view, final int n, final int n2, final int n3, final int n4) {
        view.layout(n, n2, n + n3, n2 + n4);
    }
    
    private static int getChildrenSkipCount$5359dca7() {
        return 0;
    }
    
    private static int getLocationOffset$3c7ec8d0() {
        return 0;
    }
    
    private static int getNextLocationOffset$3c7ec8d0() {
        return 0;
    }
    
    public a a(final AttributeSet set) {
        return new a(this.getContext(), set);
    }
    
    protected a b() {
        a a;
        if (this.d == 0) {
            a = new a(-2, -2);
        }
        else if (this.d == 1) {
            a = new a(-1, -2);
        }
        else {
            a = null;
        }
        return a;
    }
    
    protected a b(final ViewGroup$LayoutParams viewGroup$LayoutParams) {
        return new a(viewGroup$LayoutParams);
    }
    
    protected boolean checkLayoutParams(final ViewGroup$LayoutParams viewGroup$LayoutParams) {
        return viewGroup$LayoutParams instanceof a;
    }
    
    public int getBaseline() {
        int baseline = -1;
        if (this.b < 0) {
            baseline = super.getBaseline();
        }
        else {
            if (this.getChildCount() <= this.b) {
                throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout set to an index that is out of bounds.");
            }
            final View child = this.getChildAt(this.b);
            final int baseline2 = child.getBaseline();
            if (baseline2 == -1) {
                if (this.b != 0) {
                    throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout points to a View that doesn't know how to get its baseline.");
                }
            }
            else {
                int c = this.c;
                if (this.d == 1) {
                    final int n = this.e & 0x70;
                    if (n != 48) {
                        switch (n) {
                            case 80: {
                                c = this.getBottom() - this.getTop() - this.getPaddingBottom() - this.f;
                                break;
                            }
                            case 16: {
                                c += (this.getBottom() - this.getTop() - this.getPaddingTop() - this.getPaddingBottom() - this.f) / 2;
                                break;
                            }
                        }
                    }
                }
                baseline = ((a)child.getLayoutParams()).topMargin + c + baseline2;
            }
        }
        return baseline;
    }
    
    public int getBaselineAlignedChildIndex() {
        return this.b;
    }
    
    public Drawable getDividerDrawable() {
        return this.k;
    }
    
    public int getDividerPadding() {
        return this.o;
    }
    
    public int getDividerWidth() {
        return this.l;
    }
    
    public int getOrientation() {
        return this.d;
    }
    
    public int getShowDividers() {
        return this.n;
    }
    
    int getVirtualChildCount() {
        return this.getChildCount();
    }
    
    public float getWeightSum() {
        return this.g;
    }
    
    protected void onDraw(final Canvas canvas) {
        if (this.k != null) {
            if (this.d == 1) {
                final int virtualChildCount = this.getVirtualChildCount();
                for (int i = 0; i < virtualChildCount; ++i) {
                    final View child = this.getChildAt(i);
                    if (child != null && child.getVisibility() != 8 && this.a(i)) {
                        this.a(canvas, child.getTop() - ((a)child.getLayoutParams()).topMargin - this.m);
                    }
                }
                if (this.a(virtualChildCount)) {
                    final View child2 = this.getChildAt(virtualChildCount - 1);
                    int n;
                    if (child2 == null) {
                        n = this.getHeight() - this.getPaddingBottom() - this.m;
                    }
                    else {
                        n = ((a)child2.getLayoutParams()).bottomMargin + child2.getBottom();
                    }
                    this.a(canvas, n);
                }
            }
            else {
                final int virtualChildCount2 = this.getVirtualChildCount();
                final boolean a = s.a((View)this);
                for (int j = 0; j < virtualChildCount2; ++j) {
                    final View child3 = this.getChildAt(j);
                    if (child3 != null && child3.getVisibility() != 8 && this.a(j)) {
                        final a a2 = (a)child3.getLayoutParams();
                        int n2;
                        if (a) {
                            n2 = a2.rightMargin + child3.getRight();
                        }
                        else {
                            n2 = child3.getLeft() - a2.leftMargin - this.l;
                        }
                        this.b(canvas, n2);
                    }
                }
                if (this.a(virtualChildCount2)) {
                    final View child4 = this.getChildAt(virtualChildCount2 - 1);
                    int paddingLeft;
                    if (child4 == null) {
                        if (a) {
                            paddingLeft = this.getPaddingLeft();
                        }
                        else {
                            paddingLeft = this.getWidth() - this.getPaddingRight() - this.l;
                        }
                    }
                    else {
                        final a a3 = (a)child4.getLayoutParams();
                        if (a) {
                            paddingLeft = child4.getLeft() - a3.leftMargin - this.l;
                        }
                        else {
                            paddingLeft = a3.rightMargin + child4.getRight();
                        }
                    }
                    this.b(canvas, paddingLeft);
                }
            }
        }
    }
    
    public void onInitializeAccessibilityEvent(final AccessibilityEvent accessibilityEvent) {
        if (Build$VERSION.SDK_INT >= 14) {
            super.onInitializeAccessibilityEvent(accessibilityEvent);
            accessibilityEvent.setClassName((CharSequence)LinearLayoutCompat.class.getName());
        }
    }
    
    public void onInitializeAccessibilityNodeInfo(final AccessibilityNodeInfo accessibilityNodeInfo) {
        if (Build$VERSION.SDK_INT >= 14) {
            super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
            accessibilityNodeInfo.setClassName((CharSequence)LinearLayoutCompat.class.getName());
        }
    }
    
    protected void onLayout(final boolean b, int i, int j, int n, int h) {
        if (this.d == 1) {
            final int paddingLeft = this.getPaddingLeft();
            final int n2 = n - i;
            final int paddingRight = this.getPaddingRight();
            final int paddingRight2 = this.getPaddingRight();
            final int virtualChildCount = this.getVirtualChildCount();
            i = this.e;
            final int e = this.e;
            switch (i & 0x70) {
                default: {
                    i = this.getPaddingTop();
                    break;
                }
                case 80: {
                    i = this.getPaddingTop() + h - j - this.f;
                    break;
                }
                case 16: {
                    i = this.getPaddingTop() + (h - j - this.f) / 2;
                    break;
                }
            }
            n = 0;
            j = i;
            View child;
            int measuredWidth;
            int measuredHeight;
            a a;
            for (i = n; i < virtualChildCount; ++i) {
                child = this.getChildAt(i);
                if (child == null) {
                    j += 0;
                }
                else if (child.getVisibility() != 8) {
                    measuredWidth = child.getMeasuredWidth();
                    measuredHeight = child.getMeasuredHeight();
                    a = (a)child.getLayoutParams();
                    h = a.h;
                    if ((n = h) < 0) {
                        n = (0x800007 & e);
                    }
                    switch (android.support.v4.view.e.a(n, u.e((View)this)) & 0x7) {
                        default: {
                            n = a.leftMargin + paddingLeft;
                            break;
                        }
                        case 1: {
                            n = (n2 - paddingLeft - paddingRight2 - measuredWidth) / 2 + paddingLeft + a.leftMargin - a.rightMargin;
                            break;
                        }
                        case 5: {
                            n = n2 - paddingRight - measuredWidth - a.rightMargin;
                            break;
                        }
                    }
                    h = j;
                    if (this.a(i)) {
                        h = j + this.m;
                    }
                    j = h + a.topMargin;
                    b(child, n, j + 0, measuredWidth, measuredHeight);
                    j += a.bottomMargin + measuredHeight + 0;
                    i += 0;
                }
            }
        }
        else {
            final boolean a2 = s.a((View)this);
            final int paddingTop = this.getPaddingTop();
            final int n3 = h - j;
            final int paddingBottom = this.getPaddingBottom();
            final int paddingBottom2 = this.getPaddingBottom();
            final int virtualChildCount2 = this.getVirtualChildCount();
            j = this.e;
            final int e2 = this.e;
            final boolean a3 = this.a;
            final int[] k = this.i;
            final int[] l = this.j;
            switch (android.support.v4.view.e.a(j & 0x800007, u.e((View)this))) {
                default: {
                    i = this.getPaddingLeft();
                    break;
                }
                case 5: {
                    i = this.getPaddingLeft() + n - i - this.f;
                    break;
                }
                case 1: {
                    i = this.getPaddingLeft() + (n - i - this.f) / 2;
                    break;
                }
            }
            int n4;
            if (a2) {
                n4 = virtualChildCount2 - 1;
                h = -1;
            }
            else {
                n4 = 0;
                h = 1;
            }
            j = 0;
            n = i;
            while (j < virtualChildCount2) {
                final int n5 = n4 + h * j;
                final View child2 = this.getChildAt(n5);
                Label_0537: {
                    if (child2 == null) {
                        n += 0;
                        i = j;
                    }
                    else {
                        if (child2.getVisibility() != 8) {
                            final int measuredWidth2 = child2.getMeasuredWidth();
                            final int measuredHeight2 = child2.getMeasuredHeight();
                            i = -1;
                            final a a4 = (a)child2.getLayoutParams();
                            int baseline = i;
                            if (a3) {
                                baseline = i;
                                if (a4.height != -1) {
                                    baseline = child2.getBaseline();
                                }
                            }
                            if ((i = a4.h) < 0) {
                                i = (e2 & 0x70);
                            }
                            switch (i & 0x70) {
                                default: {
                                    i = paddingTop;
                                    break;
                                }
                                case 48: {
                                    final int n6 = i = a4.topMargin + paddingTop;
                                    if (baseline != -1) {
                                        i = k[1] - baseline + n6;
                                        break;
                                    }
                                    break;
                                }
                                case 16: {
                                    i = (n3 - paddingTop - paddingBottom2 - measuredHeight2) / 2 + paddingTop + a4.topMargin - a4.bottomMargin;
                                    break;
                                }
                                case 80: {
                                    final int n7 = i = n3 - paddingBottom - measuredHeight2 - a4.bottomMargin;
                                    if (baseline != -1) {
                                        i = child2.getMeasuredHeight();
                                        i = n7 - (l[2] - (i - baseline));
                                        break;
                                    }
                                    break;
                                }
                            }
                            while (true) {
                                if (this.a(n5)) {
                                    n += this.l;
                                }
                                n += a4.leftMargin;
                                b(child2, n + 0, i, measuredWidth2, measuredHeight2);
                                n += a4.rightMargin + measuredWidth2 + 0;
                                i = j + 0;
                                break Label_0537;
                                continue;
                            }
                        }
                        i = j;
                    }
                }
                j = i + 1;
            }
        }
    }
    
    public void onMeasure(final int n, final int n2) {
        if (this.d == 1) {
            this.f = 0;
            int max = 0;
            int n3 = 0;
            int n4 = 0;
            int n5 = 0;
            int n6 = 1;
            float g = 0.0f;
            final int virtualChildCount = this.getVirtualChildCount();
            final int mode = View$MeasureSpec.getMode(n);
            final int mode2 = View$MeasureSpec.getMode(n2);
            boolean b = false;
            int n7 = 0;
            final int b2 = this.b;
            final boolean h = this.h;
            int max2 = Integer.MIN_VALUE;
            int n8;
            for (int i = 0; i < virtualChildCount; i = n8) {
                final View child = this.getChildAt(i);
                int n9;
                int n10;
                int n11;
                int n12;
                if (child == null) {
                    this.f += 0;
                    n8 = i;
                    n9 = n5;
                    n10 = n6;
                    n11 = n7;
                    n12 = max2;
                }
                else {
                    int n18;
                    int n19;
                    int n20;
                    int n21;
                    int n22;
                    int n23;
                    if (child.getVisibility() != 8) {
                        if (this.a(i)) {
                            this.f += this.m;
                        }
                        final a a = (a)child.getLayoutParams();
                        g += a.g;
                        if (mode2 == 1073741824 && a.height == 0 && a.g > 0.0f) {
                            final int f = this.f;
                            this.f = Math.max(f, a.topMargin + f + a.bottomMargin);
                            n7 = 1;
                        }
                        else {
                            int height;
                            final int n13 = height = Integer.MIN_VALUE;
                            if (a.height == 0) {
                                height = n13;
                                if (a.g > 0.0f) {
                                    height = 0;
                                    a.height = -2;
                                }
                            }
                            int f2;
                            if (g == 0.0f) {
                                f2 = this.f;
                            }
                            else {
                                f2 = 0;
                            }
                            this.a(child, n, 0, n2, f2);
                            if (height != Integer.MIN_VALUE) {
                                a.height = height;
                            }
                            final int measuredHeight = child.getMeasuredHeight();
                            final int f3 = this.f;
                            this.f = Math.max(f3, f3 + measuredHeight + a.topMargin + a.bottomMargin + 0);
                            if (h) {
                                max2 = Math.max(measuredHeight, max2);
                            }
                        }
                        if (b2 >= 0 && b2 == i + 1) {
                            this.c = this.f;
                        }
                        if (i < b2 && a.g > 0.0f) {
                            throw new RuntimeException("A child of LinearLayout with index less than mBaselineAlignedChildIndex has weight > 0, which won't work.  Either remove the weight, or don't set mBaselineAlignedChildIndex.");
                        }
                        boolean b3 = false;
                        if (mode != 1073741824 && a.width == -1) {
                            b = true;
                            b3 = true;
                        }
                        final int n14 = a.leftMargin + a.rightMargin;
                        int b4 = child.getMeasuredWidth() + n14;
                        max = Math.max(max, b4);
                        final int a2 = s.a(n3, u.f(child));
                        boolean b5;
                        if (n6 != 0 && a.width == -1) {
                            b5 = true;
                        }
                        else {
                            b5 = false;
                        }
                        if (a.g > 0.0f) {
                            if (b3) {
                                b4 = n14;
                            }
                            final int max3 = Math.max(n5, b4);
                            final int n15 = n4;
                            final int n16 = n7;
                            final int n17 = max2;
                            n18 = a2;
                            n19 = n15;
                            n20 = max3;
                            n21 = (b5 ? 1 : 0);
                            n22 = n16;
                            n23 = n17;
                        }
                        else {
                            if (b3) {
                                b4 = n14;
                            }
                            final int max4 = Math.max(n4, b4);
                            final boolean b6 = b5;
                            n22 = n7;
                            n23 = max2;
                            n21 = (b6 ? 1 : 0);
                            n20 = n5;
                            n19 = max4;
                            n18 = a2;
                        }
                    }
                    else {
                        final int n24 = max2;
                        final int n25 = n7;
                        n21 = n6;
                        n20 = n5;
                        n19 = n4;
                        n18 = n3;
                        n23 = n24;
                        n22 = n25;
                    }
                    n8 = i + 0;
                    n12 = n23;
                    n11 = n22;
                    n10 = n21;
                    n9 = n20;
                    n4 = n19;
                    n3 = n18;
                }
                ++n8;
                max2 = n12;
                n7 = n11;
                n6 = n10;
                n5 = n9;
            }
            if (this.f > 0 && this.a(virtualChildCount)) {
                this.f += this.m;
            }
            if (h && (mode2 == Integer.MIN_VALUE || mode2 == 0)) {
                this.f = 0;
                for (int j = 0; j < virtualChildCount; ++j) {
                    final View child2 = this.getChildAt(j);
                    if (child2 == null) {
                        this.f += 0;
                    }
                    else if (child2.getVisibility() == 8) {
                        j += 0;
                    }
                    else {
                        final a a3 = (a)child2.getLayoutParams();
                        final int f4 = this.f;
                        this.f = Math.max(f4, a3.bottomMargin + (f4 + max2 + a3.topMargin) + 0);
                    }
                }
            }
            this.f += this.getPaddingTop() + this.getPaddingBottom();
            final int a4 = u.a(Math.max(this.f, this.getSuggestedMinimumHeight()), n2, 0);
            final int n26 = (0xFFFFFF & a4) - this.f;
            int n46;
            if (n7 != 0 || (n26 != 0 && g > 0.0f)) {
                if (this.g > 0.0f) {
                    g = this.g;
                }
                this.f = 0;
                int k = 0;
                final int n27 = n6;
                int a5 = max;
                int max5 = n4;
                int n28 = n27;
                int n29 = n26;
                while (k < virtualChildCount) {
                    final View child3 = this.getChildAt(k);
                    int n33;
                    int n34;
                    int n38;
                    int n39;
                    if (child3.getVisibility() != 8) {
                        final a a6 = (a)child3.getLayoutParams();
                        final float g2 = a6.g;
                        if (g2 > 0.0f) {
                            final int n30 = (int)(n29 * g2 / g);
                            final int childMeasureSpec = getChildMeasureSpec(n, this.getPaddingLeft() + this.getPaddingRight() + a6.leftMargin + a6.rightMargin, a6.width);
                            int n31;
                            if (a6.height != 0 || mode2 != 1073741824) {
                                if ((n31 = n30 + child3.getMeasuredHeight()) < 0) {
                                    n31 = 0;
                                }
                            }
                            else if (n30 > 0) {
                                n31 = n30;
                            }
                            else {
                                n31 = 0;
                            }
                            child3.measure(childMeasureSpec, View$MeasureSpec.makeMeasureSpec(n31, 1073741824));
                            final int a7 = s.a(n3, u.f(child3) & 0xFFFFFF00);
                            final int n32 = n29 - n30;
                            n33 = a7;
                            g -= g2;
                            n34 = n32;
                        }
                        else {
                            final int n35 = n29;
                            n33 = n3;
                            n34 = n35;
                        }
                        final int n36 = a6.leftMargin + a6.rightMargin;
                        final int b7 = child3.getMeasuredWidth() + n36;
                        final int max6 = Math.max(a5, b7);
                        int n37;
                        if (mode != 1073741824 && a6.width == -1) {
                            n37 = 1;
                        }
                        else {
                            n37 = 0;
                        }
                        int b8;
                        if (n37 != 0) {
                            b8 = n36;
                        }
                        else {
                            b8 = b7;
                        }
                        max5 = Math.max(max5, b8);
                        if (n28 != 0 && a6.width == -1) {
                            n38 = 1;
                        }
                        else {
                            n38 = 0;
                        }
                        final int f5 = this.f;
                        this.f = Math.max(f5, a6.bottomMargin + (child3.getMeasuredHeight() + f5 + a6.topMargin) + 0);
                        n39 = max6;
                    }
                    else {
                        final int n40 = n28;
                        n39 = a5;
                        final int n41 = n29;
                        n33 = n3;
                        n34 = n41;
                        n38 = n40;
                    }
                    final int n42 = k + 1;
                    final int n43 = n33;
                    final int n44 = n39;
                    n29 = n34;
                    n3 = n43;
                    n28 = n38;
                    a5 = n44;
                    k = n42;
                }
                this.f += this.getPaddingTop() + this.getPaddingBottom();
                final int n45 = max5;
                max = a5;
                n6 = n28;
                n46 = n45;
            }
            else {
                final int max7 = Math.max(n4, n5);
                if (h && mode2 != 1073741824) {
                    for (int l = 0; l < virtualChildCount; ++l) {
                        final View child4 = this.getChildAt(l);
                        if (child4 != null && child4.getVisibility() != 8 && ((a)child4.getLayoutParams()).g > 0.0f) {
                            child4.measure(View$MeasureSpec.makeMeasureSpec(child4.getMeasuredWidth(), 1073741824), View$MeasureSpec.makeMeasureSpec(max2, 1073741824));
                        }
                    }
                }
                n46 = max7;
            }
            if (n6 != 0 || mode == 1073741824) {
                n46 = max;
            }
            this.setMeasuredDimension(u.a(Math.max(n46 + (this.getPaddingLeft() + this.getPaddingRight()), this.getSuggestedMinimumWidth()), n, n3), a4);
            if (b) {
                this.a(virtualChildCount, n2);
            }
        }
        else {
            this.b(n, n2);
        }
    }
    
    public void setBaselineAligned(final boolean a) {
        this.a = a;
    }
    
    public void setBaselineAlignedChildIndex(final int b) {
        if (b < 0 || b >= this.getChildCount()) {
            throw new IllegalArgumentException("base aligned child index out of range (0, " + this.getChildCount() + ")");
        }
        this.b = b;
    }
    
    public void setDividerDrawable(final Drawable k) {
        boolean willNotDraw = false;
        if (k != this.k) {
            if ((this.k = k) != null) {
                this.l = k.getIntrinsicWidth();
                this.m = k.getIntrinsicHeight();
            }
            else {
                this.l = 0;
                this.m = 0;
            }
            if (k == null) {
                willNotDraw = true;
            }
            this.setWillNotDraw(willNotDraw);
            this.requestLayout();
        }
    }
    
    public void setDividerPadding(final int o) {
        this.o = o;
    }
    
    public void setGravity(int n) {
        if (this.e != n) {
            if ((0x800007 & n) == 0x0) {
                n |= 0x800003;
            }
            int e = n;
            if ((n & 0x70) == 0x0) {
                e = (n | 0x30);
            }
            this.e = e;
            this.requestLayout();
        }
    }
    
    public void setHorizontalGravity(int n) {
        n &= 0x800007;
        if ((this.e & 0x800007) != n) {
            this.e = (n | (this.e & 0xFF7FFFF8));
            this.requestLayout();
        }
    }
    
    public void setMeasureWithLargestChildEnabled(final boolean h) {
        this.h = h;
    }
    
    public void setOrientation(final int d) {
        if (this.d != d) {
            this.d = d;
            this.requestLayout();
        }
    }
    
    public void setShowDividers(final int n) {
        if (n != this.n) {
            this.requestLayout();
        }
        this.n = n;
    }
    
    public void setVerticalGravity(int n) {
        n &= 0x70;
        if ((this.e & 0x70) != n) {
            this.e = (n | (this.e & 0xFFFFFF8F));
            this.requestLayout();
        }
    }
    
    public void setWeightSum(final float b) {
        this.g = Math.max(0.0f, b);
    }
    
    public boolean shouldDelayChildPressedState() {
        return false;
    }
    
    public static class a extends ViewGroup$MarginLayoutParams
    {
        public float g;
        public int h;
        
        public a(final int n, final int n2) {
            super(n, n2);
            this.h = -1;
            this.g = 0.0f;
        }
        
        public a(final Context context, final AttributeSet set) {
            super(context, set);
            this.h = -1;
            final TypedArray obtainStyledAttributes = context.obtainStyledAttributes(set, android.support.v7.b.a.i.LinearLayoutCompat_Layout);
            this.g = obtainStyledAttributes.getFloat(android.support.v7.b.a.i.LinearLayoutCompat_Layout_android_layout_weight, 0.0f);
            this.h = obtainStyledAttributes.getInt(android.support.v7.b.a.i.LinearLayoutCompat_Layout_android_layout_gravity, -1);
            obtainStyledAttributes.recycle();
        }
        
        public a(final ViewGroup$LayoutParams viewGroup$LayoutParams) {
            super(viewGroup$LayoutParams);
            this.h = -1;
        }
    }
}
