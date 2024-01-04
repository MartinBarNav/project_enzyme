/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.graphics.Canvas
 *  android.graphics.drawable.Drawable
 *  android.os.Build$VERSION
 *  android.util.AttributeSet
 *  android.view.View
 *  android.view.View$MeasureSpec
 *  android.view.ViewGroup
 *  android.view.ViewGroup$LayoutParams
 *  android.view.ViewGroup$MarginLayoutParams
 *  android.view.accessibility.AccessibilityEvent
 *  android.view.accessibility.AccessibilityNodeInfo
 */
package android.support.v7.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.support.v4.view.e;
import android.support.v4.view.u;
import android.support.v7.b.a;
import android.support.v7.internal.widget.q;
import android.support.v7.internal.widget.s;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;

public class LinearLayoutCompat
extends ViewGroup {
    private boolean a = true;
    private int b = -1;
    private int c = 0;
    private int d;
    private int e = 0x800033;
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
        this(context, null);
    }

    public LinearLayoutCompat(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public LinearLayoutCompat(Context object, AttributeSet attributeSet, int n2) {
        super((Context)object, attributeSet, n2);
        boolean bl;
        object = q.a((Context)object, attributeSet, a.i.LinearLayoutCompat, n2);
        n2 = ((q)object).a(a.i.LinearLayoutCompat_android_orientation, -1);
        if (n2 >= 0) {
            this.setOrientation(n2);
        }
        if ((n2 = ((q)object).a(a.i.LinearLayoutCompat_android_gravity, -1)) >= 0) {
            this.setGravity(n2);
        }
        if (!(bl = ((q)object).a(a.i.LinearLayoutCompat_android_baselineAligned, true))) {
            this.setBaselineAligned(bl);
        }
        n2 = a.i.LinearLayoutCompat_android_weightSum;
        this.g = ((q)object).a.getFloat(n2, -1.0f);
        this.b = ((q)object).a(a.i.LinearLayoutCompat_android_baselineAlignedChildIndex, -1);
        this.h = ((q)object).a(a.i.LinearLayoutCompat_measureWithLargestChild, false);
        this.setDividerDrawable(((q)object).a(a.i.LinearLayoutCompat_divider));
        this.n = ((q)object).a(a.i.LinearLayoutCompat_showDividers, 0);
        this.o = ((q)object).c(a.i.LinearLayoutCompat_dividerPadding, 0);
        ((q)object).a.recycle();
    }

    private void a(int n2, int n3) {
        int n4 = View.MeasureSpec.makeMeasureSpec((int)this.getMeasuredWidth(), (int)0x40000000);
        for (int i2 = 0; i2 < n2; ++i2) {
            View view = this.getChildAt(i2);
            if (view.getVisibility() == 8) continue;
            a a2 = (a)view.getLayoutParams();
            if (a2.width != -1) continue;
            int n5 = a2.height;
            a2.height = view.getMeasuredHeight();
            this.measureChildWithMargins(view, n4, 0, n3, 0);
            a2.height = n5;
        }
    }

    private void a(Canvas canvas, int n2) {
        this.k.setBounds(this.getPaddingLeft() + this.o, n2, this.getWidth() - this.getPaddingRight() - this.o, this.m + n2);
        this.k.draw(canvas);
    }

    private void a(View view, int n2, int n3, int n4, int n5) {
        this.measureChildWithMargins(view, n2, n3, n4, n5);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private boolean a(int n2) {
        boolean bl;
        boolean bl2 = true;
        if (n2 == 0) {
            if ((this.n & 1) == 0) return false;
            return bl2;
        }
        if (n2 == this.getChildCount()) {
            bl = bl2;
            if ((this.n & 4) != 0) return bl;
            return false;
        }
        if ((this.n & 2) == 0) return false;
        --n2;
        while (n2 >= 0) {
            bl = bl2;
            if (this.getChildAt(n2).getVisibility() != 8) return bl;
            --n2;
        }
        return false;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    private void b(int var1_1, int var2_2) {
        block51: {
            block45: {
                this.f = 0;
                var3_3 = 0;
                var4_4 = 0;
                var5_5 = 0;
                var6_6 = 0;
                var7_7 = 1;
                var8_8 = 0.0f;
                var9_9 = this.getVirtualChildCount();
                var10_10 = View.MeasureSpec.getMode((int)var1_1);
                var11_11 = View.MeasureSpec.getMode((int)var2_2);
                var12_12 = false;
                var13_13 = 0;
                if (this.i == null || this.j == null) {
                    this.i = new int[4];
                    this.j = new int[4];
                }
                var14_14 = this.i;
                var15_19 = this.j;
                var14_14[3] = -1;
                var14_14[2] = -1;
                var14_14[1] = -1;
                var14_14[0] = -1;
                var15_19[3] = -1;
                var15_19[2] = -1;
                var15_19[1] = -1;
                var15_19[0] = -1;
                var16_22 = this.a;
                var17_23 = this.h;
                var18_24 = var10_10 == 0x40000000;
                var19_25 = -2147483648;
                var20_26 = 0;
                while (true) {
                    block48: {
                        block50: {
                            block49: {
                                block46: {
                                    block47: {
                                        if (var20_26 >= var9_9) break block46;
                                        var21_27 = this.getChildAt(var20_26);
                                        if (var21_27 != null) break block47;
                                        this.f += 0;
                                        var22_34 = var20_26;
                                        var23_35 = var3_3;
                                        var3_3 = var5_5;
                                        var20_26 = var6_6;
                                        break block48;
                                    }
                                    if (var21_27.getVisibility() == 8) break block49;
                                    if (this.a(var20_26)) {
                                        this.f += this.l;
                                    }
                                    var24_36 = (a)var21_27.getLayoutParams();
                                    var8_8 += var24_36.g;
                                    if (var10_10 == 0x40000000 && var24_36.width == 0 && var24_36.g > 0.0f) {
                                        if (var18_24) {
                                            this.f += var24_36.leftMargin + var24_36.rightMargin;
                                        } else {
                                            var23_35 = this.f;
                                            this.f = Math.max(var23_35, var24_36.leftMargin + var23_35 + var24_36.rightMargin);
                                        }
                                        if (var16_22) {
                                            var23_35 = View.MeasureSpec.makeMeasureSpec((int)0, (int)0);
                                            var21_27.measure(var23_35, var23_35);
                                        } else {
                                            var13_13 = 1;
                                        }
                                    } else {
                                        var23_35 = var22_34 = -2147483648;
                                        if (var24_36.width == 0) {
                                            var23_35 = var22_34;
                                            if (var24_36.g > 0.0f) {
                                                var23_35 = 0;
                                                var24_36.width = -2;
                                            }
                                        }
                                        var22_34 = var8_8 == 0.0f ? this.f : 0;
                                        this.a(var21_27, var1_1, var22_34, var2_2, 0);
                                        if (var23_35 != -2147483648) {
                                            var24_36.width = var23_35;
                                        }
                                        var23_35 = var21_27.getMeasuredWidth();
                                        if (var18_24) {
                                            this.f += var24_36.leftMargin + var23_35 + var24_36.rightMargin + 0;
                                        } else {
                                            var22_34 = this.f;
                                            this.f = Math.max(var22_34, var22_34 + var23_35 + var24_36.leftMargin + var24_36.rightMargin + 0);
                                        }
                                        if (var17_23) {
                                            var19_25 = Math.max(var23_35, var19_25);
                                        }
                                    }
                                    var23_35 = 0;
                                    if (var11_11 != 0x40000000 && var24_36.height == -1) {
                                        var12_12 = true;
                                        var23_35 = 1;
                                    }
                                    var22_34 = var24_36.topMargin + var24_36.bottomMargin;
                                    var25_37 = var21_27.getMeasuredHeight() + var22_34;
                                    var26_38 = s.a(var4_4, u.f(var21_27));
                                    if (var16_22 && (var27_39 = var21_27.getBaseline()) != -1) {
                                        var4_4 = var24_36.h < 0 ? this.e : var24_36.h;
                                        var4_4 = ((var4_4 & 112) >> 4 & -2) >> 1;
                                        var14_14[var4_4] = Math.max(var14_14[var4_4], var27_39);
                                        var15_19[var4_4] = Math.max(var15_19[var4_4], var25_37 - var27_39);
                                    }
                                    var3_3 = Math.max(var3_3, var25_37);
                                    var4_4 = var7_7 != 0 && var24_36.height == -1 ? 1 : 0;
                                    if (var24_36.g > 0.0f) {
                                        if (var23_35 != 0) {
                                            var25_37 = var22_34;
                                        }
                                        var22_34 = Math.max(var6_6, var25_37);
                                        var7_7 = var4_4;
                                        var4_4 = var5_5;
                                        var5_5 = var3_3;
                                        var23_35 = var19_25;
                                        var6_6 = var26_38;
                                        var3_3 = var4_4;
                                        var4_4 = var22_34;
                                        var19_25 = var13_13;
                                        var13_13 = var23_35;
                                    } else {
                                        if (var23_35 == 0) {
                                            var22_34 = var25_37;
                                        }
                                        var5_5 = Math.max(var5_5, var22_34);
                                        var7_7 = var13_13;
                                        var23_35 = var3_3;
                                        var13_13 = var19_25;
                                        var19_25 = var7_7;
                                        var7_7 = var4_4;
                                        var4_4 = var6_6;
                                        var3_3 = var5_5;
                                        var6_6 = var26_38;
                                        var5_5 = var23_35;
                                    }
                                    break block50;
                                }
                                if (this.f > 0 && this.a(var9_9)) {
                                    this.f += this.l;
                                }
                                var20_26 = var14_14[1] != -1 || var14_14[0] != -1 || var14_14[2] != -1 || var14_14[3] != -1 ? Math.max(var3_3, Math.max(var14_14[3], Math.max(var14_14[0], Math.max(var14_14[1], var14_14[2]))) + Math.max(var15_19[3], Math.max(var15_19[0], Math.max(var15_19[1], var15_19[2])))) : var3_3;
                                if (var17_23 && (var10_10 == -2147483648 || var10_10 == 0)) {
                                    this.f = 0;
                                    break;
                                }
                                break block45;
                            }
                            var22_34 = var19_25;
                            var19_25 = var13_13;
                            var23_35 = var6_6;
                            var6_6 = var5_5;
                            var5_5 = var3_3;
                            var25_37 = var4_4;
                            var13_13 = var22_34;
                            var4_4 = var23_35;
                            var3_3 = var6_6;
                            var6_6 = var25_37;
                        }
                        var22_34 = var20_26 + 0;
                        var20_26 = var19_25;
                        var19_25 = var13_13;
                        var13_13 = var20_26;
                        var20_26 = var4_4;
                        var4_4 = var6_6;
                        var23_35 = var5_5;
                    }
                    var6_6 = var20_26;
                    var5_5 = var3_3;
                    var3_3 = var23_35;
                    var20_26 = ++var22_34;
                }
                for (var3_3 = 0; var3_3 < var9_9; ++var3_3) {
                    var21_29 = this.getChildAt(var3_3);
                    if (var21_29 == null) {
                        this.f += 0;
                        continue;
                    }
                    if (var21_29.getVisibility() == 8) {
                        var3_3 += 0;
                        continue;
                    }
                    var21_31 = (a)var21_29.getLayoutParams();
                    if (var18_24) {
                        var22_34 = this.f;
                        var23_35 = var21_31.leftMargin;
                        this.f = var21_31.rightMargin + (var23_35 + var19_25) + 0 + var22_34;
                        continue;
                    }
                    var22_34 = this.f;
                    var23_35 = var21_31.leftMargin;
                    this.f = Math.max(var22_34, var21_31.rightMargin + (var22_34 + var19_25 + var23_35) + 0);
                }
            }
            this.f += this.getPaddingLeft() + this.getPaddingRight();
            var25_37 = u.a(Math.max(this.f, this.getSuggestedMinimumWidth()), var1_1, 0);
            var3_3 = (0xFFFFFF & var25_37) - this.f;
            if (var13_13 != 0 || var3_3 != 0 && var8_8 > 0.0f) break block51;
            var5_5 = Math.max(var5_5, var6_6);
            if (var17_23 && var10_10 != 0x40000000) {
                for (var13_13 = 0; var13_13 < var9_9; ++var13_13) {
                    var14_18 = this.getChildAt(var13_13);
                    if (var14_18 == null || var14_18.getVisibility() == 8 || !(((a)var14_18.getLayoutParams()).g > 0.0f)) continue;
                    var14_18.measure(View.MeasureSpec.makeMeasureSpec((int)var19_25, (int)0x40000000), View.MeasureSpec.makeMeasureSpec((int)var14_18.getMeasuredHeight(), (int)0x40000000));
                }
            }
            var19_25 = var5_5;
            var13_13 = var20_26;
            ** GOTO lbl237
        }
        if (this.g > 0.0f) {
            var8_8 = this.g;
        }
        var14_14[3] = -1;
        var14_14[2] = -1;
        var14_14[1] = -1;
        var14_14[0] = -1;
        var15_19[3] = -1;
        var15_19[2] = -1;
        var15_19[1] = -1;
        var15_19[0] = -1;
        this.f = 0;
        var6_6 = 0;
        var13_13 = var7_7;
        var7_7 = -1;
        var19_25 = var4_4;
        var4_4 = var7_7;
        var7_7 = var3_3;
        while (true) {
            block58: {
                block53: {
                    block55: {
                        block54: {
                            block57: {
                                block56: {
                                    block52: {
                                        if (var6_6 >= var9_9) break block52;
                                        var24_36 = this.getChildAt(var6_6);
                                        if (var24_36 == null || var24_36.getVisibility() == 8) break block53;
                                        var21_33 = (a)var24_36.getLayoutParams();
                                        var28_40 = var21_33.g;
                                        if (!(var28_40 > 0.0f)) break block54;
                                        var20_26 = (int)((float)var7_7 * var28_40 / var8_8);
                                        var22_34 = LinearLayoutCompat.getChildMeasureSpec((int)var2_2, (int)(this.getPaddingTop() + this.getPaddingBottom() + var21_33.topMargin + var21_33.bottomMargin), (int)var21_33.height);
                                        if (var21_33.width != 0 || var10_10 != 0x40000000) {
                                            var3_3 = var23_35 = var20_26 + var24_36.getMeasuredWidth();
                                            if (var23_35 < 0) {
                                                var3_3 = 0;
                                            }
                                        } else {
                                            var3_3 = var20_26 > 0 ? var20_26 : 0;
                                        }
                                        var24_36.measure(View.MeasureSpec.makeMeasureSpec((int)var3_3, (int)0x40000000), var22_34);
                                        var19_25 = s.a(var19_25, u.f((View)var24_36) & -16777216);
                                        var8_8 -= var28_40;
                                        var3_3 = var7_7 - var20_26;
                                        var7_7 = var19_25;
                                        var19_25 = var3_3;
                                        break block55;
                                    }
                                    this.f += this.getPaddingLeft() + this.getPaddingRight();
                                    if (var14_14[1] != -1 || var14_14[0] != -1 || var14_14[2] != -1) break block56;
                                    var7_7 = var4_4;
                                    if (var14_14[3] == -1) break block57;
                                }
                                var7_7 = Math.max(var4_4, Math.max(var14_14[3], Math.max(var14_14[0], Math.max(var14_14[1], var14_14[2]))) + Math.max(var15_19[3], Math.max(var15_19[0], Math.max(var15_19[1], var15_19[2]))));
                            }
                            var4_4 = var19_25;
                            var19_25 = var7_7;
                            var7_7 = var13_13;
                            var13_13 = var19_25;
                            var19_25 = var5_5;
lbl237:
                            // 2 sources

                            if (var7_7 != 0 || var11_11 == 0x40000000) {
                                var19_25 = var13_13;
                            }
                            this.setMeasuredDimension(-16777216 & var4_4 | var25_37, u.a(Math.max(var19_25 + (this.getPaddingTop() + this.getPaddingBottom()), this.getSuggestedMinimumHeight()), var2_2, var4_4 << 16));
                            if (var12_12 == false) return;
                            var19_25 = View.MeasureSpec.makeMeasureSpec((int)this.getMeasuredHeight(), (int)0x40000000);
                            var2_2 = 0;
                            while (var2_2 < var9_9) {
                                var14_17 = this.getChildAt(var2_2);
                                if (var14_17.getVisibility() != 8) {
                                    var15_21 = (a)var14_17.getLayoutParams();
                                    if (var15_21.height == -1) {
                                        var13_13 = var15_21.width;
                                        var15_21.width = var14_17.getMeasuredWidth();
                                        this.measureChildWithMargins(var14_17, var1_1, 0, var19_25, 0);
                                        var15_21.width = var13_13;
                                    }
                                }
                                ++var2_2;
                            }
                            return;
                        }
                        var3_3 = var19_25;
                        var19_25 = var7_7;
                        var7_7 = var3_3;
                    }
                    if (var18_24) {
                        this.f += var24_36.getMeasuredWidth() + var21_33.leftMargin + var21_33.rightMargin + 0;
                    } else {
                        var3_3 = this.f;
                        this.f = Math.max(var3_3, var24_36.getMeasuredWidth() + var3_3 + var21_33.leftMargin + var21_33.rightMargin + 0);
                    }
                    var3_3 = var11_11 != 0x40000000 && var21_33.height == -1 ? 1 : 0;
                    var22_34 = var21_33.topMargin + var21_33.bottomMargin;
                    var23_35 = var24_36.getMeasuredHeight() + var22_34;
                    var20_26 = Math.max(var4_4, var23_35);
                    var4_4 = var3_3 != 0 ? var22_34 : var23_35;
                    var4_4 = Math.max(var5_5, var4_4);
                    var13_13 = var13_13 != 0 && var21_33.height == -1 ? 1 : 0;
                    if (var16_22 && (var3_3 = var24_36.getBaseline()) != -1) {
                        var5_5 = var21_33.h < 0 ? this.e : var21_33.h;
                        var5_5 = ((var5_5 & 112) >> 4 & -2) >> 1;
                        var14_14[var5_5] = Math.max(var14_14[var5_5], var3_3);
                        var15_19[var5_5] = Math.max(var15_19[var5_5], var23_35 - var3_3);
                    }
                    var3_3 = var7_7;
                    var7_7 = var13_13;
                    var5_5 = var20_26;
                    var13_13 = var3_3;
                    break block58;
                }
                var20_26 = var13_13;
                var13_13 = var19_25;
                var3_3 = var4_4;
                var19_25 = var7_7;
                var7_7 = var20_26;
                var4_4 = var5_5;
                var5_5 = var3_3;
            }
            var20_26 = var6_6 + 1;
            var3_3 = var7_7;
            var6_6 = var4_4;
            var4_4 = var5_5;
            var7_7 = var19_25;
            var19_25 = var13_13;
            var13_13 = var3_3;
            var5_5 = var6_6;
            var6_6 = var20_26;
        }
    }

    private void b(Canvas canvas, int n2) {
        this.k.setBounds(n2, this.getPaddingTop() + this.o, this.l + n2, this.getHeight() - this.getPaddingBottom() - this.o);
        this.k.draw(canvas);
    }

    private static void b(View view, int n2, int n3, int n4, int n5) {
        view.layout(n2, n3, n2 + n4, n3 + n5);
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

    public a a(AttributeSet attributeSet) {
        return new a(this.getContext(), attributeSet);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    protected a b() {
        if (this.d == 0) {
            return new a(-2, -2);
        }
        if (this.d != 1) return null;
        return new a(-1, -2);
    }

    protected a b(ViewGroup.LayoutParams layoutParams) {
        return new a(layoutParams);
    }

    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof a;
    }

    protected /* synthetic */ ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return this.b();
    }

    public /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return this.a(attributeSet);
    }

    protected /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return this.b(layoutParams);
    }

    /*
     * Enabled aggressive block sorting
     */
    public int getBaseline() {
        int n2 = -1;
        if (this.b < 0) {
            return super.getBaseline();
        }
        if (this.getChildCount() <= this.b) {
            throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout set to an index that is out of bounds.");
        }
        View view = this.getChildAt(this.b);
        int n3 = view.getBaseline();
        if (n3 == -1) {
            if (this.b == 0) return n2;
            throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout points to a View that doesn't know how to get its baseline.");
        }
        n2 = this.c;
        if (this.d != 1) return ((a)view.getLayoutParams()).topMargin + n2 + n3;
        int n4 = this.e & 0x70;
        if (n4 == 48) return ((a)view.getLayoutParams()).topMargin + n2 + n3;
        switch (n4) {
            case 80: {
                n2 = this.getBottom() - this.getTop() - this.getPaddingBottom() - this.f;
            }
            default: {
                return ((a)view.getLayoutParams()).topMargin + n2 + n3;
            }
            case 16: {
                n2 += (this.getBottom() - this.getTop() - this.getPaddingTop() - this.getPaddingBottom() - this.f) / 2;
            }
        }
        return ((a)view.getLayoutParams()).topMargin + n2 + n3;
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

    /*
     * Enabled aggressive block sorting
     */
    protected void onDraw(Canvas canvas) {
        int n2;
        if (this.k == null) {
            return;
        }
        if (this.d == 1) {
            int n3;
            int n4 = this.getVirtualChildCount();
            for (n3 = 0; n3 < n4; ++n3) {
                View view = this.getChildAt(n3);
                if (view == null || view.getVisibility() == 8 || !this.a(n3)) continue;
                a a2 = (a)view.getLayoutParams();
                this.a(canvas, view.getTop() - a2.topMargin - this.m);
            }
            if (!this.a(n4)) return;
            View view = this.getChildAt(n4 - 1);
            if (view == null) {
                n3 = this.getHeight() - this.getPaddingBottom() - this.m;
            } else {
                a a3 = (a)view.getLayoutParams();
                n3 = view.getBottom();
                n3 = a3.bottomMargin + n3;
            }
            this.a(canvas, n3);
            return;
        }
        int n5 = this.getVirtualChildCount();
        boolean bl = s.a((View)this);
        for (n2 = 0; n2 < n5; ++n2) {
            int n6;
            View view = this.getChildAt(n2);
            if (view == null || view.getVisibility() == 8 || !this.a(n2)) continue;
            a a4 = (a)view.getLayoutParams();
            if (bl) {
                n6 = view.getRight();
                n6 = a4.rightMargin + n6;
            } else {
                n6 = view.getLeft() - a4.leftMargin - this.l;
            }
            this.b(canvas, n6);
        }
        if (!this.a(n5)) return;
        View view = this.getChildAt(n5 - 1);
        if (view == null) {
            n2 = bl ? this.getPaddingLeft() : this.getWidth() - this.getPaddingRight() - this.l;
        } else {
            a a5 = (a)view.getLayoutParams();
            if (bl) {
                n2 = view.getLeft() - a5.leftMargin - this.l;
            } else {
                n2 = view.getRight();
                n2 = a5.rightMargin + n2;
            }
        }
        this.b(canvas, n2);
    }

    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        if (Build.VERSION.SDK_INT >= 14) {
            super.onInitializeAccessibilityEvent(accessibilityEvent);
            accessibilityEvent.setClassName((CharSequence)LinearLayoutCompat.class.getName());
        }
    }

    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        if (Build.VERSION.SDK_INT >= 14) {
            super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
            accessibilityNodeInfo.setClassName((CharSequence)LinearLayoutCompat.class.getName());
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    protected void onLayout(boolean bl, int n2, int n3, int n4, int n5) {
        if (this.d == 1) {
            int n6 = this.getPaddingLeft();
            int n7 = n4 - n2;
            int n8 = this.getPaddingRight();
            int n9 = this.getPaddingRight();
            int n10 = this.getVirtualChildCount();
            n2 = this.e;
            int n11 = this.e;
            switch (n2 & 0x70) {
                default: {
                    n2 = this.getPaddingTop();
                    break;
                }
                case 80: {
                    n2 = this.getPaddingTop() + n5 - n3 - this.f;
                    break;
                }
                case 16: {
                    n2 = this.getPaddingTop() + (n5 - n3 - this.f) / 2;
                }
            }
            n4 = 0;
            n3 = n2;
            for (n2 = n4; n2 < n10; ++n2) {
                View view = this.getChildAt(n2);
                if (view == null) {
                    n3 += 0;
                    continue;
                }
                if (view.getVisibility() == 8) continue;
                int n12 = view.getMeasuredWidth();
                int n13 = view.getMeasuredHeight();
                a a2 = (a)view.getLayoutParams();
                n4 = n5 = a2.h;
                if (n5 < 0) {
                    n4 = 0x800007 & n11;
                }
                switch (android.support.v4.view.e.a(n4, u.e((View)this)) & 7) {
                    default: {
                        n4 = a2.leftMargin + n6;
                        break;
                    }
                    case 1: {
                        n4 = (n7 - n6 - n9 - n12) / 2 + n6 + a2.leftMargin - a2.rightMargin;
                        break;
                    }
                    case 5: {
                        n4 = n7 - n8 - n12 - a2.rightMargin;
                    }
                }
                n5 = n3;
                if (this.a(n2)) {
                    n5 = n3 + this.m;
                }
                n3 = n5 + a2.topMargin;
                LinearLayoutCompat.b(view, n4, n3 + 0, n12, n13);
                n3 += a2.bottomMargin + n13 + 0;
                n2 += 0;
            }
            return;
        } else {
            int n14;
            boolean bl2 = s.a((View)this);
            int n15 = this.getPaddingTop();
            int n16 = n5 - n3;
            int n17 = this.getPaddingBottom();
            int n18 = this.getPaddingBottom();
            int n19 = this.getVirtualChildCount();
            n3 = this.e;
            int n20 = this.e;
            bl = this.a;
            int[] arrn = this.i;
            int[] arrn2 = this.j;
            switch (android.support.v4.view.e.a(n3 & 0x800007, u.e((View)this))) {
                default: {
                    n2 = this.getPaddingLeft();
                    break;
                }
                case 5: {
                    n2 = this.getPaddingLeft() + n4 - n2 - this.f;
                    break;
                }
                case 1: {
                    n2 = this.getPaddingLeft() + (n4 - n2 - this.f) / 2;
                }
            }
            if (bl2) {
                n14 = n19 - 1;
                n5 = -1;
            } else {
                n14 = 0;
                n5 = 1;
            }
            n3 = 0;
            n4 = n2;
            while (n3 < n19) {
                int n21 = n14 + n5 * n3;
                View view = this.getChildAt(n21);
                if (view == null) {
                    n4 += 0;
                    n2 = n3;
                } else if (view.getVisibility() != 8) {
                    int n22;
                    int n23 = view.getMeasuredWidth();
                    int n24 = view.getMeasuredHeight();
                    n2 = -1;
                    a a3 = (a)view.getLayoutParams();
                    int n25 = n2;
                    if (bl) {
                        n25 = n2;
                        if (a3.height != -1) {
                            n25 = view.getBaseline();
                        }
                    }
                    n2 = n22 = a3.h;
                    if (n22 < 0) {
                        n2 = n20 & 0x70;
                    }
                    switch (n2 & 0x70) {
                        default: {
                            n2 = n15;
                            break;
                        }
                        case 48: {
                            n2 = n22 = a3.topMargin + n15;
                            if (n25 == -1) break;
                            n2 = arrn[1] - n25 + n22;
                            break;
                        }
                        case 16: {
                            n2 = (n16 - n15 - n18 - n24) / 2 + n15 + a3.topMargin - a3.bottomMargin;
                            break;
                        }
                        case 80: {
                            n2 = n22 = n16 - n17 - n24 - a3.bottomMargin;
                            if (n25 == -1) break;
                            n2 = view.getMeasuredHeight();
                            n2 = n22 - (arrn2[2] - (n2 - n25));
                        }
                    }
                    if (this.a(n21)) {
                        n4 = this.l + n4;
                    }
                    LinearLayoutCompat.b(view, (n4 += a3.leftMargin) + 0, n2, n23, n24);
                    n4 += a3.rightMargin + n23 + 0;
                    n2 = n3 + 0;
                } else {
                    n2 = n3;
                }
                n3 = n2 + 1;
            }
        }
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    public void onMeasure(int var1_1, int var2_2) {
        block35: {
            block29: {
                if (this.d != 1) {
                    this.b(var1_1, var2_2);
                    return;
                }
                this.f = 0;
                var3_3 = 0;
                var4_4 = 0;
                var5_5 = 0;
                var6_6 = 0;
                var7_7 = 1;
                var8_8 = 0.0f;
                var9_9 = this.getVirtualChildCount();
                var10_10 = View.MeasureSpec.getMode((int)var1_1);
                var11_11 = View.MeasureSpec.getMode((int)var2_2);
                var12_12 = false;
                var13_13 = 0;
                var14_14 = this.b;
                var15_15 = this.h;
                var16_16 = -2147483648;
                var17_17 = 0;
                while (true) {
                    block32: {
                        block34: {
                            block33: {
                                block30: {
                                    block31: {
                                        if (var17_17 >= var9_9) break block30;
                                        var18_18 = this.getChildAt(var17_17);
                                        if (var18_18 != null) break block31;
                                        this.f += 0;
                                        var19_27 = var17_17;
                                        var17_17 = var6_6;
                                        var20_28 = var7_7;
                                        var21_29 = var13_13;
                                        var22_30 = var16_16;
                                        break block32;
                                    }
                                    if (var18_18.getVisibility() == 8) break block33;
                                    if (this.a(var17_17)) {
                                        this.f += this.m;
                                    }
                                    var23_31 = (a)var18_18.getLayoutParams();
                                    var8_8 += var23_31.g;
                                    if (var11_11 == 0x40000000 && var23_31.height == 0 && var23_31.g > 0.0f) {
                                        var13_13 = this.f;
                                        this.f = Math.max(var13_13, var23_31.topMargin + var13_13 + var23_31.bottomMargin);
                                        var13_13 = 1;
                                    } else {
                                        var20_28 = var21_29 = -2147483648;
                                        if (var23_31.height == 0) {
                                            var20_28 = var21_29;
                                            if (var23_31.g > 0.0f) {
                                                var20_28 = 0;
                                                var23_31.height = -2;
                                            }
                                        }
                                        var21_29 = var8_8 == 0.0f ? this.f : 0;
                                        this.a(var18_18, var1_1, 0, var2_2, var21_29);
                                        if (var20_28 != -2147483648) {
                                            var23_31.height = var20_28;
                                        }
                                        var20_28 = var18_18.getMeasuredHeight();
                                        var21_29 = this.f;
                                        this.f = Math.max(var21_29, var21_29 + var20_28 + var23_31.topMargin + var23_31.bottomMargin + 0);
                                        if (var15_15) {
                                            var16_16 = Math.max(var20_28, var16_16);
                                        }
                                    }
                                    if (var14_14 >= 0 && var14_14 == var17_17 + 1) {
                                        this.c = this.f;
                                    }
                                    if (var17_17 < var14_14 && var23_31.g > 0.0f) {
                                        throw new RuntimeException("A child of LinearLayout with index less than mBaselineAlignedChildIndex has weight > 0, which won't work.  Either remove the weight, or don't set mBaselineAlignedChildIndex.");
                                    }
                                    var20_28 = 0;
                                    if (var10_10 != 0x40000000 && var23_31.width == -1) {
                                        var12_12 = true;
                                        var20_28 = 1;
                                    }
                                    var22_30 = var23_31.leftMargin + var23_31.rightMargin;
                                    var21_29 = var18_18.getMeasuredWidth() + var22_30;
                                    var3_3 = Math.max(var3_3, var21_29);
                                    var19_27 = s.a(var4_4, u.f(var18_18));
                                    var4_4 = var7_7 != 0 && var23_31.width == -1 ? 1 : 0;
                                    if (var23_31.g > 0.0f) {
                                        if (var20_28 != 0) {
                                            var21_29 = var22_30;
                                        }
                                        var21_29 = Math.max(var6_6, var21_29);
                                        var7_7 = var5_5;
                                        var5_5 = var13_13;
                                        var20_28 = var16_16;
                                        var6_6 = var19_27;
                                        var13_13 = var7_7;
                                        var7_7 = var21_29;
                                        var16_16 = var4_4;
                                        var4_4 = var5_5;
                                        var5_5 = var20_28;
                                    } else {
                                        if (var20_28 != 0) {
                                            var21_29 = var22_30;
                                        }
                                        var20_28 = Math.max(var5_5, var21_29);
                                        var7_7 = var4_4;
                                        var4_4 = var13_13;
                                        var5_5 = var16_16;
                                        var16_16 = var7_7;
                                        var7_7 = var6_6;
                                        var13_13 = var20_28;
                                        var6_6 = var19_27;
                                    }
                                    break block34;
                                }
                                if (this.f > 0 && this.a(var9_9)) {
                                    this.f += this.m;
                                }
                                if (var15_15 && (var11_11 == -2147483648 || var11_11 == 0)) {
                                    this.f = 0;
                                    break;
                                }
                                break block29;
                            }
                            var20_28 = var16_16;
                            var21_29 = var13_13;
                            var16_16 = var7_7;
                            var7_7 = var6_6;
                            var13_13 = var5_5;
                            var6_6 = var4_4;
                            var5_5 = var20_28;
                            var4_4 = var21_29;
                        }
                        var19_27 = var17_17 + 0;
                        var22_30 = var5_5;
                        var21_29 = var4_4;
                        var20_28 = var16_16;
                        var17_17 = var7_7;
                        var5_5 = var13_13;
                        var4_4 = var6_6;
                    }
                    var16_16 = var22_30;
                    var13_13 = var21_29;
                    var7_7 = var20_28;
                    var6_6 = var17_17;
                    var17_17 = ++var19_27;
                }
                for (var17_17 = 0; var17_17 < var9_9; ++var17_17) {
                    var18_20 = this.getChildAt(var17_17);
                    if (var18_20 == null) {
                        this.f += 0;
                        continue;
                    }
                    if (var18_20.getVisibility() == 8) {
                        var17_17 += 0;
                        continue;
                    }
                    var18_22 = (a)var18_20.getLayoutParams();
                    var20_28 = this.f;
                    var21_29 = var18_22.topMargin;
                    this.f = Math.max(var20_28, var18_22.bottomMargin + (var20_28 + var16_16 + var21_29) + 0);
                }
            }
            this.f += this.getPaddingTop() + this.getPaddingBottom();
            var21_29 = u.a(Math.max(this.f, this.getSuggestedMinimumHeight()), var2_2, 0);
            var17_17 = (0xFFFFFF & var21_29) - this.f;
            if (var13_13 != 0 || var17_17 != 0 && var8_8 > 0.0f) break block35;
            var13_13 = Math.max(var5_5, var6_6);
            if (var15_15 && var11_11 != 0x40000000) {
                for (var5_5 = 0; var5_5 < var9_9; ++var5_5) {
                    var18_26 = this.getChildAt(var5_5);
                    if (var18_26 == null || var18_26.getVisibility() == 8 || !(((a)var18_26.getLayoutParams()).g > 0.0f)) continue;
                    var18_26.measure(View.MeasureSpec.makeMeasureSpec((int)var18_26.getMeasuredWidth(), (int)0x40000000), View.MeasureSpec.makeMeasureSpec((int)var16_16, (int)0x40000000));
                }
            }
            var5_5 = var13_13;
            ** GOTO lbl191
        }
        if (this.g > 0.0f) {
            var8_8 = this.g;
        }
        this.f = 0;
        var6_6 = 0;
        var16_16 = var7_7;
        var7_7 = var3_3;
        var3_3 = var5_5;
        var5_5 = var16_16;
        var16_16 = var17_17;
        while (true) {
            block40: {
                block37: {
                    block39: {
                        block38: {
                            block36: {
                                if (var6_6 >= var9_9) break block36;
                                var23_31 = this.getChildAt(var6_6);
                                if (var23_31.getVisibility() == 8) break block37;
                                var18_24 = (a)var23_31.getLayoutParams();
                                var24_32 = var18_24.g;
                                if (!(var24_32 > 0.0f)) break block38;
                                var17_17 = (int)((float)var16_16 * var24_32 / var8_8);
                                var22_30 = LinearLayoutCompat.getChildMeasureSpec((int)var1_1, (int)(this.getPaddingLeft() + this.getPaddingRight() + var18_24.leftMargin + var18_24.rightMargin), (int)var18_24.width);
                                if (var18_24.height != 0 || var11_11 != 0x40000000) {
                                    var13_13 = var20_28 = var17_17 + var23_31.getMeasuredHeight();
                                    if (var20_28 < 0) {
                                        var13_13 = 0;
                                    }
                                } else {
                                    var13_13 = var17_17 > 0 ? var17_17 : 0;
                                }
                                var23_31.measure(var22_30, View.MeasureSpec.makeMeasureSpec((int)var13_13, (int)0x40000000));
                                var4_4 = s.a(var4_4, u.f((View)var23_31) & -256);
                                var13_13 = var16_16 - var17_17;
                                var16_16 = var4_4;
                                var8_8 -= var24_32;
                                var4_4 = var13_13;
                                break block39;
                            }
                            this.f += this.getPaddingTop() + this.getPaddingBottom();
                            var16_16 = var3_3;
                            var3_3 = var7_7;
                            var7_7 = var5_5;
                            var5_5 = var16_16;
lbl191:
                            // 2 sources

                            if (var7_7 != 0 || var10_10 == 0x40000000) {
                                var5_5 = var3_3;
                            }
                            this.setMeasuredDimension(u.a(Math.max(var5_5 + (this.getPaddingLeft() + this.getPaddingRight()), this.getSuggestedMinimumWidth()), var1_1, var4_4), var21_29);
                            if (var12_12 == false) return;
                            this.a(var9_9, var2_2);
                            return;
                        }
                        var13_13 = var16_16;
                        var16_16 = var4_4;
                        var4_4 = var13_13;
                    }
                    var17_17 = var18_24.leftMargin + var18_24.rightMargin;
                    var20_28 = var23_31.getMeasuredWidth() + var17_17;
                    var13_13 = Math.max(var7_7, var20_28);
                    var7_7 = var10_10 != 0x40000000 && var18_24.width == -1 ? 1 : 0;
                    var7_7 = var7_7 != 0 ? var17_17 : var20_28;
                    var3_3 = Math.max(var3_3, var7_7);
                    var7_7 = var5_5 != 0 && var18_24.width == -1 ? 1 : 0;
                    var20_28 = this.f;
                    var5_5 = var23_31.getMeasuredHeight();
                    var17_17 = var18_24.topMargin;
                    this.f = Math.max(var20_28, var18_24.bottomMargin + (var5_5 + var20_28 + var17_17) + 0);
                    var5_5 = var13_13;
                    break block40;
                }
                var13_13 = var5_5;
                var5_5 = var7_7;
                var7_7 = var16_16;
                var16_16 = var4_4;
                var4_4 = var7_7;
                var7_7 = var13_13;
            }
            var17_17 = var6_6 + 1;
            var6_6 = var16_16;
            var13_13 = var5_5;
            var16_16 = var4_4;
            var4_4 = var6_6;
            var5_5 = var7_7;
            var7_7 = var13_13;
            var6_6 = var17_17;
        }
    }

    public void setBaselineAligned(boolean bl) {
        this.a = bl;
    }

    public void setBaselineAlignedChildIndex(int n2) {
        if (n2 < 0 || n2 >= this.getChildCount()) {
            throw new IllegalArgumentException("base aligned child index out of range (0, " + this.getChildCount() + ")");
        }
        this.b = n2;
    }

    /*
     * Enabled aggressive block sorting
     */
    public void setDividerDrawable(Drawable drawable) {
        boolean bl = false;
        if (drawable == this.k) {
            return;
        }
        this.k = drawable;
        if (drawable != null) {
            this.l = drawable.getIntrinsicWidth();
            this.m = drawable.getIntrinsicHeight();
        } else {
            this.l = 0;
            this.m = 0;
        }
        if (drawable == null) {
            bl = true;
        }
        this.setWillNotDraw(bl);
        this.requestLayout();
    }

    public void setDividerPadding(int n2) {
        this.o = n2;
    }

    public void setGravity(int n2) {
        if (this.e != n2) {
            if ((0x800007 & n2) == 0) {
                n2 = 0x800003 | n2;
            }
            int n3 = n2;
            if ((n2 & 0x70) == 0) {
                n3 = n2 | 0x30;
            }
            this.e = n3;
            this.requestLayout();
        }
    }

    public void setHorizontalGravity(int n2) {
        if ((this.e & 0x800007) != (n2 &= 0x800007)) {
            this.e = n2 | this.e & 0xFF7FFFF8;
            this.requestLayout();
        }
    }

    public void setMeasureWithLargestChildEnabled(boolean bl) {
        this.h = bl;
    }

    public void setOrientation(int n2) {
        if (this.d != n2) {
            this.d = n2;
            this.requestLayout();
        }
    }

    public void setShowDividers(int n2) {
        if (n2 != this.n) {
            this.requestLayout();
        }
        this.n = n2;
    }

    public void setVerticalGravity(int n2) {
        if ((this.e & 0x70) != (n2 &= 0x70)) {
            this.e = n2 | this.e & 0xFFFFFF8F;
            this.requestLayout();
        }
    }

    public void setWeightSum(float f2) {
        this.g = Math.max(0.0f, f2);
    }

    public boolean shouldDelayChildPressedState() {
        return false;
    }

    public static class a
    extends ViewGroup.MarginLayoutParams {
        public float g;
        public int h = -1;

        public a(int n2, int n3) {
            super(n2, n3);
            this.g = 0.0f;
        }

        public a(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            context = context.obtainStyledAttributes(attributeSet, a.i.LinearLayoutCompat_Layout);
            this.g = context.getFloat(a.i.LinearLayoutCompat_Layout_android_layout_weight, 0.0f);
            this.h = context.getInt(a.i.LinearLayoutCompat_Layout_android_layout_gravity, -1);
            context.recycle();
        }

        public a(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }
    }
}

