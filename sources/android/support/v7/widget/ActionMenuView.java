package android.support.v7.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.os.Build;
import android.support.v7.internal.view.menu.ActionMenuItemView;
import android.support.v7.internal.view.menu.e;
import android.support.v7.internal.view.menu.f;
import android.support.v7.internal.view.menu.j;
import android.support.v7.internal.view.menu.k;
import android.support.v7.internal.widget.s;
import android.support.v7.widget.LinearLayoutCompat;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewDebug;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;

public class ActionMenuView extends LinearLayoutCompat implements e.b, k {
    android.support.v7.internal.view.menu.e a;
    a b;
    j.a c;
    e.a d;
    private Context e;
    private Context f;
    private int g;
    private boolean h;
    private boolean i;
    private int j;
    private int k;
    private int l;
    /* access modifiers changed from: private */
    public e m;

    public interface a {
        boolean c();

        boolean d();
    }

    public interface e {
        boolean a();
    }

    /* access modifiers changed from: protected */
    public final /* synthetic */ LinearLayoutCompat.a b() {
        return c();
    }

    /* access modifiers changed from: protected */
    public final /* synthetic */ LinearLayoutCompat.a b(ViewGroup.LayoutParams layoutParams) {
        return a(layoutParams);
    }

    /* access modifiers changed from: protected */
    public /* synthetic */ ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return c();
    }

    /* access modifiers changed from: protected */
    public /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return a(layoutParams);
    }

    public ActionMenuView(Context context) {
        this(context, (AttributeSet) null);
    }

    public ActionMenuView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.e = context;
        setBaselineAligned(false);
        float f2 = context.getResources().getDisplayMetrics().density;
        this.k = (int) (56.0f * f2);
        this.l = (int) (f2 * 4.0f);
        this.f = context;
        this.g = 0;
    }

    public void setPopupTheme(int i2) {
        if (this.g != i2) {
            this.g = i2;
            if (i2 == 0) {
                this.f = this.e;
            } else {
                this.f = new ContextThemeWrapper(this.e, i2);
            }
        }
    }

    public int getPopupTheme() {
        return this.g;
    }

    public void setPresenter(a aVar) {
        this.b = aVar;
        this.b.a(this);
    }

    public void onConfigurationChanged(Configuration configuration) {
        if (Build.VERSION.SDK_INT >= 8) {
            super.onConfigurationChanged(configuration);
        }
        this.b.a(false);
        if (this.b != null && this.b.g()) {
            this.b.d();
            this.b.c();
        }
    }

    public void setOnMenuItemClickListener(e eVar) {
        this.m = eVar;
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:114:0x0296  */
    /* JADX WARNING: Removed duplicated region for block: B:118:0x02a5  */
    /* JADX WARNING: Removed duplicated region for block: B:130:0x02d8  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onMeasure(int r35, int r36) {
        /*
            r34 = this;
            r0 = r34
            boolean r7 = r0.i
            int r6 = android.view.View.MeasureSpec.getMode(r35)
            r8 = 1073741824(0x40000000, float:2.0)
            if (r6 != r8) goto L_0x008b
            r6 = 1
        L_0x000d:
            r0 = r34
            r0.i = r6
            r0 = r34
            boolean r6 = r0.i
            if (r7 == r6) goto L_0x001c
            r6 = 0
            r0 = r34
            r0.j = r6
        L_0x001c:
            int r6 = android.view.View.MeasureSpec.getSize(r35)
            r0 = r34
            boolean r7 = r0.i
            if (r7 == 0) goto L_0x003e
            r0 = r34
            android.support.v7.internal.view.menu.e r7 = r0.a
            if (r7 == 0) goto L_0x003e
            r0 = r34
            int r7 = r0.j
            if (r6 == r7) goto L_0x003e
            r0 = r34
            r0.j = r6
            r0 = r34
            android.support.v7.internal.view.menu.e r6 = r0.a
            r7 = 1
            r6.b((boolean) r7)
        L_0x003e:
            int r8 = r34.getChildCount()
            r0 = r34
            boolean r6 = r0.i
            if (r6 == 0) goto L_0x033c
            if (r8 <= 0) goto L_0x033c
            int r23 = android.view.View.MeasureSpec.getMode(r36)
            int r6 = android.view.View.MeasureSpec.getSize(r35)
            int r17 = android.view.View.MeasureSpec.getSize(r36)
            int r7 = r34.getPaddingLeft()
            int r8 = r34.getPaddingRight()
            int r7 = r7 + r8
            int r8 = r34.getPaddingTop()
            int r9 = r34.getPaddingBottom()
            int r19 = r8 + r9
            r8 = -2
            r0 = r36
            r1 = r19
            int r24 = getChildMeasureSpec(r0, r1, r8)
            int r25 = r6 - r7
            r0 = r34
            int r6 = r0.k
            int r9 = r25 / r6
            r0 = r34
            int r6 = r0.k
            int r6 = r25 % r6
            if (r9 != 0) goto L_0x008d
            r6 = 0
            r0 = r34
            r1 = r25
            r0.setMeasuredDimension(r1, r6)
        L_0x008a:
            return
        L_0x008b:
            r6 = 0
            goto L_0x000d
        L_0x008d:
            r0 = r34
            int r7 = r0.k
            int r6 = r6 / r9
            int r26 = r7 + r6
            r16 = 0
            r15 = 0
            r10 = 0
            r7 = 0
            r11 = 0
            r12 = 0
            int r27 = r34.getChildCount()
            r6 = 0
            r18 = r6
        L_0x00a3:
            r0 = r18
            r1 = r27
            if (r0 >= r1) goto L_0x0148
            r0 = r34
            r1 = r18
            android.view.View r8 = r0.getChildAt(r1)
            int r6 = r8.getVisibility()
            r14 = 8
            if (r6 == r14) goto L_0x0379
            boolean r0 = r8 instanceof android.support.v7.internal.view.menu.ActionMenuItemView
            r20 = r0
            int r14 = r7 + 1
            if (r20 == 0) goto L_0x00d5
            r0 = r34
            int r6 = r0.l
            r7 = 0
            r0 = r34
            int r0 = r0.l
            r21 = r0
            r22 = 0
            r0 = r21
            r1 = r22
            r8.setPadding(r6, r7, r0, r1)
        L_0x00d5:
            android.view.ViewGroup$LayoutParams r6 = r8.getLayoutParams()
            android.support.v7.widget.ActionMenuView$c r6 = (android.support.v7.widget.ActionMenuView.c) r6
            r7 = 0
            r6.f = r7
            r7 = 0
            r6.c = r7
            r7 = 0
            r6.b = r7
            r7 = 0
            r6.d = r7
            r7 = 0
            r6.leftMargin = r7
            r7 = 0
            r6.rightMargin = r7
            if (r20 == 0) goto L_0x0144
            r7 = r8
            android.support.v7.internal.view.menu.ActionMenuItemView r7 = (android.support.v7.internal.view.menu.ActionMenuItemView) r7
            boolean r7 = r7.b()
            if (r7 == 0) goto L_0x0144
            r7 = 1
        L_0x00f9:
            r6.e = r7
            boolean r7 = r6.a
            if (r7 == 0) goto L_0x0146
            r7 = 1
        L_0x0100:
            r0 = r26
            r1 = r24
            r2 = r19
            int r20 = a(r8, r0, r7, r1, r2)
            r0 = r20
            int r15 = java.lang.Math.max(r15, r0)
            boolean r7 = r6.d
            if (r7 == 0) goto L_0x0376
            int r7 = r10 + 1
        L_0x0116:
            boolean r6 = r6.a
            if (r6 == 0) goto L_0x0373
            r6 = 1
        L_0x011b:
            int r11 = r9 - r20
            int r8 = r8.getMeasuredHeight()
            r0 = r16
            int r10 = java.lang.Math.max(r0, r8)
            r8 = 1
            r0 = r20
            if (r0 != r8) goto L_0x0367
            r8 = 1
            int r8 = r8 << r18
            long r8 = (long) r8
            long r8 = r8 | r12
            r12 = r10
            r13 = r11
            r10 = r7
            r11 = r6
            r6 = r8
            r9 = r15
            r8 = r14
        L_0x0138:
            int r14 = r18 + 1
            r18 = r14
            r15 = r9
            r16 = r12
            r9 = r13
            r12 = r6
            r7 = r8
            goto L_0x00a3
        L_0x0144:
            r7 = 0
            goto L_0x00f9
        L_0x0146:
            r7 = r9
            goto L_0x0100
        L_0x0148:
            if (r11 == 0) goto L_0x0192
            r6 = 2
            if (r7 != r6) goto L_0x0192
            r6 = 1
            r8 = r6
        L_0x014f:
            r18 = 0
            r20 = r12
            r19 = r9
        L_0x0155:
            if (r10 <= 0) goto L_0x0230
            if (r19 <= 0) goto L_0x0230
            r14 = 2147483647(0x7fffffff, float:NaN)
            r12 = 0
            r9 = 0
            r6 = 0
            r22 = r6
        L_0x0162:
            r0 = r22
            r1 = r27
            if (r0 >= r1) goto L_0x01a5
            r0 = r34
            r1 = r22
            android.view.View r6 = r0.getChildAt(r1)
            android.view.ViewGroup$LayoutParams r6 = r6.getLayoutParams()
            android.support.v7.widget.ActionMenuView$c r6 = (android.support.v7.widget.ActionMenuView.c) r6
            boolean r0 = r6.d
            r28 = r0
            if (r28 == 0) goto L_0x0363
            int r0 = r6.b
            r28 = r0
            r0 = r28
            if (r0 >= r14) goto L_0x0195
            int r9 = r6.b
            r6 = 1
            int r6 = r6 << r22
            long r12 = (long) r6
            r6 = 1
        L_0x018b:
            int r14 = r22 + 1
            r22 = r14
            r14 = r9
            r9 = r6
            goto L_0x0162
        L_0x0192:
            r6 = 0
            r8 = r6
            goto L_0x014f
        L_0x0195:
            int r6 = r6.b
            if (r6 != r14) goto L_0x0363
            r6 = 1
            int r6 = r6 << r22
            long r0 = (long) r6
            r28 = r0
            long r12 = r12 | r28
            int r6 = r9 + 1
            r9 = r14
            goto L_0x018b
        L_0x01a5:
            long r20 = r20 | r12
            r0 = r19
            if (r9 > r0) goto L_0x0230
            int r22 = r14 + 1
            r6 = 0
            r14 = r6
            r9 = r19
            r18 = r20
        L_0x01b3:
            r0 = r27
            if (r14 >= r0) goto L_0x0227
            r0 = r34
            android.view.View r20 = r0.getChildAt(r14)
            android.view.ViewGroup$LayoutParams r6 = r20.getLayoutParams()
            android.support.v7.widget.ActionMenuView$c r6 = (android.support.v7.widget.ActionMenuView.c) r6
            r21 = 1
            int r21 = r21 << r14
            r0 = r21
            long r0 = (long) r0
            r28 = r0
            long r28 = r28 & r12
            r30 = 0
            int r21 = (r28 > r30 ? 1 : (r28 == r30 ? 0 : -1))
            if (r21 != 0) goto L_0x01e7
            int r6 = r6.b
            r0 = r22
            if (r6 != r0) goto L_0x0360
            r6 = 1
            int r6 = r6 << r14
            long r0 = (long) r6
            r20 = r0
            long r18 = r18 | r20
            r6 = r9
        L_0x01e2:
            int r9 = r14 + 1
            r14 = r9
            r9 = r6
            goto L_0x01b3
        L_0x01e7:
            if (r8 == 0) goto L_0x0214
            boolean r0 = r6.e
            r21 = r0
            if (r21 == 0) goto L_0x0214
            r21 = 1
            r0 = r21
            if (r9 != r0) goto L_0x0214
            r0 = r34
            int r0 = r0.l
            r21 = r0
            int r21 = r21 + r26
            r28 = 0
            r0 = r34
            int r0 = r0.l
            r29 = r0
            r30 = 0
            r0 = r20
            r1 = r21
            r2 = r28
            r3 = r29
            r4 = r30
            r0.setPadding(r1, r2, r3, r4)
        L_0x0214:
            int r0 = r6.b
            r20 = r0
            int r20 = r20 + 1
            r0 = r20
            r6.b = r0
            r20 = 1
            r0 = r20
            r6.f = r0
            int r6 = r9 + -1
            goto L_0x01e2
        L_0x0227:
            r6 = 1
            r20 = r18
            r18 = r6
            r19 = r9
            goto L_0x0155
        L_0x0230:
            r12 = r20
            if (r11 != 0) goto L_0x02d5
            r6 = 1
            if (r7 != r6) goto L_0x02d5
            r6 = 1
        L_0x0238:
            if (r19 <= 0) goto L_0x02fb
            r8 = 0
            int r8 = (r12 > r8 ? 1 : (r12 == r8 ? 0 : -1))
            if (r8 == 0) goto L_0x02fb
            int r7 = r7 + -1
            r0 = r19
            if (r0 < r7) goto L_0x024b
            if (r6 != 0) goto L_0x024b
            r7 = 1
            if (r15 <= r7) goto L_0x02fb
        L_0x024b:
            int r7 = java.lang.Long.bitCount(r12)
            float r7 = (float) r7
            if (r6 != 0) goto L_0x035d
            r8 = 1
            long r8 = r8 & r12
            r10 = 0
            int r6 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r6 == 0) goto L_0x026f
            r6 = 0
            r0 = r34
            android.view.View r6 = r0.getChildAt(r6)
            android.view.ViewGroup$LayoutParams r6 = r6.getLayoutParams()
            android.support.v7.widget.ActionMenuView$c r6 = (android.support.v7.widget.ActionMenuView.c) r6
            boolean r6 = r6.e
            if (r6 != 0) goto L_0x026f
            r6 = 1056964608(0x3f000000, float:0.5)
            float r7 = r7 - r6
        L_0x026f:
            r6 = 1
            int r8 = r27 + -1
            int r6 = r6 << r8
            long r8 = (long) r6
            long r8 = r8 & r12
            r10 = 0
            int r6 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r6 == 0) goto L_0x035d
            int r6 = r27 + -1
            r0 = r34
            android.view.View r6 = r0.getChildAt(r6)
            android.view.ViewGroup$LayoutParams r6 = r6.getLayoutParams()
            android.support.v7.widget.ActionMenuView$c r6 = (android.support.v7.widget.ActionMenuView.c) r6
            boolean r6 = r6.e
            if (r6 != 0) goto L_0x035d
            r6 = 1056964608(0x3f000000, float:0.5)
            float r6 = r7 - r6
        L_0x0291:
            r7 = 0
            int r7 = (r6 > r7 ? 1 : (r6 == r7 ? 0 : -1))
            if (r7 <= 0) goto L_0x02d8
            int r7 = r19 * r26
            float r7 = (float) r7
            float r6 = r7 / r6
            int r6 = (int) r6
            r7 = r6
        L_0x029d:
            r6 = 0
            r9 = r6
            r8 = r18
        L_0x02a1:
            r0 = r27
            if (r9 >= r0) goto L_0x02fd
            r6 = 1
            int r6 = r6 << r9
            long r10 = (long) r6
            long r10 = r10 & r12
            r14 = 0
            int r6 = (r10 > r14 ? 1 : (r10 == r14 ? 0 : -1))
            if (r6 == 0) goto L_0x02f9
            r0 = r34
            android.view.View r10 = r0.getChildAt(r9)
            android.view.ViewGroup$LayoutParams r6 = r10.getLayoutParams()
            android.support.v7.widget.ActionMenuView$c r6 = (android.support.v7.widget.ActionMenuView.c) r6
            boolean r10 = r10 instanceof android.support.v7.internal.view.menu.ActionMenuItemView
            if (r10 == 0) goto L_0x02db
            r6.c = r7
            r8 = 1
            r6.f = r8
            if (r9 != 0) goto L_0x02cf
            boolean r8 = r6.e
            if (r8 != 0) goto L_0x02cf
            int r8 = -r7
            int r8 = r8 / 2
            r6.leftMargin = r8
        L_0x02cf:
            r6 = 1
        L_0x02d0:
            int r8 = r9 + 1
            r9 = r8
            r8 = r6
            goto L_0x02a1
        L_0x02d5:
            r6 = 0
            goto L_0x0238
        L_0x02d8:
            r6 = 0
            r7 = r6
            goto L_0x029d
        L_0x02db:
            boolean r10 = r6.a
            if (r10 == 0) goto L_0x02eb
            r6.c = r7
            r8 = 1
            r6.f = r8
            int r8 = -r7
            int r8 = r8 / 2
            r6.rightMargin = r8
            r6 = 1
            goto L_0x02d0
        L_0x02eb:
            if (r9 == 0) goto L_0x02f1
            int r10 = r7 / 2
            r6.leftMargin = r10
        L_0x02f1:
            int r10 = r27 + -1
            if (r9 == r10) goto L_0x02f9
            int r10 = r7 / 2
            r6.rightMargin = r10
        L_0x02f9:
            r6 = r8
            goto L_0x02d0
        L_0x02fb:
            r8 = r18
        L_0x02fd:
            if (r8 == 0) goto L_0x032b
            r6 = 0
            r7 = r6
        L_0x0301:
            r0 = r27
            if (r7 >= r0) goto L_0x032b
            r0 = r34
            android.view.View r8 = r0.getChildAt(r7)
            android.view.ViewGroup$LayoutParams r6 = r8.getLayoutParams()
            android.support.v7.widget.ActionMenuView$c r6 = (android.support.v7.widget.ActionMenuView.c) r6
            boolean r9 = r6.f
            if (r9 == 0) goto L_0x0327
            int r9 = r6.b
            int r9 = r9 * r26
            int r6 = r6.c
            int r6 = r6 + r9
            r9 = 1073741824(0x40000000, float:2.0)
            int r6 = android.view.View.MeasureSpec.makeMeasureSpec(r6, r9)
            r0 = r24
            r8.measure(r6, r0)
        L_0x0327:
            int r6 = r7 + 1
            r7 = r6
            goto L_0x0301
        L_0x032b:
            r6 = 1073741824(0x40000000, float:2.0)
            r0 = r23
            if (r0 == r6) goto L_0x035a
        L_0x0331:
            r0 = r34
            r1 = r25
            r2 = r16
            r0.setMeasuredDimension(r1, r2)
            goto L_0x008a
        L_0x033c:
            r6 = 0
            r7 = r6
        L_0x033e:
            if (r7 >= r8) goto L_0x0355
            r0 = r34
            android.view.View r6 = r0.getChildAt(r7)
            android.view.ViewGroup$LayoutParams r6 = r6.getLayoutParams()
            android.support.v7.widget.ActionMenuView$c r6 = (android.support.v7.widget.ActionMenuView.c) r6
            r9 = 0
            r6.rightMargin = r9
            r6.leftMargin = r9
            int r6 = r7 + 1
            r7 = r6
            goto L_0x033e
        L_0x0355:
            super.onMeasure(r35, r36)
            goto L_0x008a
        L_0x035a:
            r16 = r17
            goto L_0x0331
        L_0x035d:
            r6 = r7
            goto L_0x0291
        L_0x0360:
            r6 = r9
            goto L_0x01e2
        L_0x0363:
            r6 = r9
            r9 = r14
            goto L_0x018b
        L_0x0367:
            r8 = r14
            r9 = r15
            r32 = r12
            r12 = r10
            r13 = r11
            r11 = r6
            r10 = r7
            r6 = r32
            goto L_0x0138
        L_0x0373:
            r6 = r11
            goto L_0x011b
        L_0x0376:
            r7 = r10
            goto L_0x0116
        L_0x0379:
            r8 = r7
            r6 = r12
            r12 = r16
            r13 = r9
            r9 = r15
            goto L_0x0138
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.widget.ActionMenuView.onMeasure(int, int):void");
    }

    static int a(View view, int i2, int i3, int i4, int i5) {
        boolean z;
        int i6;
        boolean z2 = false;
        c cVar = (c) view.getLayoutParams();
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i4) - i5, View.MeasureSpec.getMode(i4));
        ActionMenuItemView actionMenuItemView = view instanceof ActionMenuItemView ? (ActionMenuItemView) view : null;
        if (actionMenuItemView == null || !actionMenuItemView.b()) {
            z = false;
        } else {
            z = true;
        }
        if (i3 <= 0 || (z && i3 < 2)) {
            i6 = 0;
        } else {
            view.measure(View.MeasureSpec.makeMeasureSpec(i2 * i3, Integer.MIN_VALUE), makeMeasureSpec);
            int measuredWidth = view.getMeasuredWidth();
            i6 = measuredWidth / i2;
            if (measuredWidth % i2 != 0) {
                i6++;
            }
            if (z && i6 < 2) {
                i6 = 2;
            }
        }
        if (!cVar.a && z) {
            z2 = true;
        }
        cVar.d = z2;
        cVar.b = i6;
        view.measure(View.MeasureSpec.makeMeasureSpec(i6 * i2, 1073741824), makeMeasureSpec);
        return i6;
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i2, int i3, int i4, int i5) {
        int i6;
        int i7;
        int i8;
        int i9;
        int width;
        int i10;
        if (!this.i) {
            super.onLayout(z, i2, i3, i4, i5);
            return;
        }
        int childCount = getChildCount();
        int i11 = (i5 - i3) / 2;
        int dividerWidth = getDividerWidth();
        int i12 = 0;
        int paddingRight = ((i4 - i2) - getPaddingRight()) - getPaddingLeft();
        boolean z2 = false;
        boolean a2 = s.a(this);
        int i13 = 0;
        while (i13 < childCount) {
            View childAt = getChildAt(i13);
            if (childAt.getVisibility() != 8) {
                c cVar = (c) childAt.getLayoutParams();
                if (cVar.a) {
                    int measuredWidth = childAt.getMeasuredWidth();
                    if (a(i13)) {
                        measuredWidth += dividerWidth;
                    }
                    int measuredHeight = childAt.getMeasuredHeight();
                    if (a2) {
                        i10 = cVar.leftMargin + getPaddingLeft();
                        width = i10 + measuredWidth;
                    } else {
                        width = (getWidth() - getPaddingRight()) - cVar.rightMargin;
                        i10 = width - measuredWidth;
                    }
                    int i14 = i11 - (measuredHeight / 2);
                    childAt.layout(i10, i14, width, measuredHeight + i14);
                    i8 = paddingRight - measuredWidth;
                    z2 = true;
                    i9 = i12;
                } else {
                    i8 = paddingRight - (cVar.rightMargin + (childAt.getMeasuredWidth() + cVar.leftMargin));
                    a(i13);
                    i9 = i12 + 1;
                }
            } else {
                i8 = paddingRight;
                i9 = i12;
            }
            i13++;
            i12 = i9;
            paddingRight = i8;
        }
        if (childCount != 1 || z2) {
            int i15 = i12 - (z2 ? 0 : 1);
            int max = Math.max(0, i15 > 0 ? paddingRight / i15 : 0);
            if (a2) {
                int width2 = getWidth() - getPaddingRight();
                int i16 = 0;
                while (i16 < childCount) {
                    View childAt2 = getChildAt(i16);
                    c cVar2 = (c) childAt2.getLayoutParams();
                    if (childAt2.getVisibility() == 8 || cVar2.a) {
                        i7 = width2;
                    } else {
                        int i17 = width2 - cVar2.rightMargin;
                        int measuredWidth2 = childAt2.getMeasuredWidth();
                        int measuredHeight2 = childAt2.getMeasuredHeight();
                        int i18 = i11 - (measuredHeight2 / 2);
                        childAt2.layout(i17 - measuredWidth2, i18, i17, measuredHeight2 + i18);
                        i7 = i17 - ((cVar2.leftMargin + measuredWidth2) + max);
                    }
                    i16++;
                    width2 = i7;
                }
                return;
            }
            int paddingLeft = getPaddingLeft();
            int i19 = 0;
            while (i19 < childCount) {
                View childAt3 = getChildAt(i19);
                c cVar3 = (c) childAt3.getLayoutParams();
                if (childAt3.getVisibility() == 8 || cVar3.a) {
                    i6 = paddingLeft;
                } else {
                    int i20 = paddingLeft + cVar3.leftMargin;
                    int measuredWidth3 = childAt3.getMeasuredWidth();
                    int measuredHeight3 = childAt3.getMeasuredHeight();
                    int i21 = i11 - (measuredHeight3 / 2);
                    childAt3.layout(i20, i21, i20 + measuredWidth3, measuredHeight3 + i21);
                    i6 = cVar3.rightMargin + measuredWidth3 + max + i20;
                }
                i19++;
                paddingLeft = i6;
            }
            return;
        }
        View childAt4 = getChildAt(0);
        int measuredWidth4 = childAt4.getMeasuredWidth();
        int measuredHeight4 = childAt4.getMeasuredHeight();
        int i22 = ((i4 - i2) / 2) - (measuredWidth4 / 2);
        int i23 = i11 - (measuredHeight4 / 2);
        childAt4.layout(i22, i23, measuredWidth4 + i22, measuredHeight4 + i23);
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.b != null) {
            this.b.e();
        }
    }

    public void setOverflowReserved(boolean z) {
        this.h = z;
    }

    private static c c() {
        c cVar = new c();
        cVar.h = 16;
        return cVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public c generateLayoutParams(AttributeSet attributeSet) {
        return new c(getContext(), attributeSet);
    }

    protected static c a(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams == null) {
            return c();
        }
        c cVar = layoutParams instanceof c ? new c((c) layoutParams) : new c(layoutParams);
        if (cVar.h > 0) {
            return cVar;
        }
        cVar.h = 16;
        return cVar;
    }

    /* access modifiers changed from: protected */
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams != null && (layoutParams instanceof c);
    }

    public static c a() {
        c c2 = c();
        c2.a = true;
        return c2;
    }

    public final boolean a(f fVar) {
        return this.a.a((MenuItem) fVar, 0);
    }

    public int getWindowAnimations() {
        return 0;
    }

    public final void a(android.support.v7.internal.view.menu.e eVar) {
        this.a = eVar;
    }

    public Menu getMenu() {
        j.a bVar;
        if (this.a == null) {
            Context context = getContext();
            this.a = new android.support.v7.internal.view.menu.e(context);
            this.a.a((e.a) new d(this, (byte) 0));
            this.b = new a(context);
            a aVar = this.b;
            aVar.i = true;
            aVar.j = true;
            a aVar2 = this.b;
            if (this.c != null) {
                bVar = this.c;
            } else {
                bVar = new b(this, (byte) 0);
            }
            aVar2.f = bVar;
            this.a.a((j) this.b, this.f);
            this.b.a(this);
        }
        return this.a;
    }

    private boolean a(int i2) {
        boolean z = false;
        if (i2 == 0) {
            return false;
        }
        View childAt = getChildAt(i2 - 1);
        View childAt2 = getChildAt(i2);
        if (i2 < getChildCount() && (childAt instanceof a)) {
            z = ((a) childAt).d() | false;
        }
        return (i2 <= 0 || !(childAt2 instanceof a)) ? z : ((a) childAt2).c() | z;
    }

    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return false;
    }

    public void setExpandedActionViewsExclusive(boolean z) {
        this.b.p = z;
    }

    private class d implements e.a {
        private d() {
        }

        /* synthetic */ d(ActionMenuView actionMenuView, byte b) {
            this();
        }

        public final boolean a() {
            return ActionMenuView.this.m != null && ActionMenuView.this.m.a();
        }
    }

    private class b implements j.a {
        private b() {
        }

        /* synthetic */ b(ActionMenuView actionMenuView, byte b) {
            this();
        }

        public final void a(android.support.v7.internal.view.menu.e eVar, boolean z) {
        }

        public final boolean a(android.support.v7.internal.view.menu.e eVar) {
            return false;
        }
    }

    public static class c extends LinearLayoutCompat.a {
        @ViewDebug.ExportedProperty
        public boolean a;
        @ViewDebug.ExportedProperty
        public int b;
        @ViewDebug.ExportedProperty
        public int c;
        @ViewDebug.ExportedProperty
        public boolean d;
        @ViewDebug.ExportedProperty
        public boolean e;
        boolean f;

        public c(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public c(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public c(c cVar) {
            super(cVar);
            this.a = cVar.a;
        }

        public c() {
            super(-2, -2);
            this.a = false;
        }
    }
}
