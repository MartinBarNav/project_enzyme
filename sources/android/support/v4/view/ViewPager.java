package android.support.v4.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.c.a;
import android.support.v7.b.a;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.animation.Interpolator;
import android.widget.Scroller;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ViewPager extends ViewGroup {
    /* access modifiers changed from: private */
    public static final int[] a = {16842931};
    private static final j ag = new j();
    private static final Comparator<b> c = new Comparator<b>() {
        public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
            return ((b) obj).b - ((b) obj2).b;
        }
    };
    private static final Interpolator d = new Interpolator() {
        public final float getInterpolation(float f) {
            float f2 = f - 1.0f;
            return (f2 * f2 * f2 * f2 * f2) + 1.0f;
        }
    };
    private boolean A;
    private boolean B;
    private int C;
    private int D;
    private int E;
    private float F;
    private float G;
    private float H;
    private float I;
    private int J = -1;
    private VelocityTracker K;
    private int L;
    private int M;
    private int N;
    private int O;
    private boolean P;
    private android.support.v4.f.d Q;
    private android.support.v4.f.d R;
    private boolean S = true;
    private boolean T = false;
    private boolean U;
    private int V;
    private f W;
    private f aa;
    private e ab;
    private g ac;
    private Method ad;
    private int ae;
    private ArrayList<View> af;
    private final Runnable ah = new Runnable() {
        public final void run() {
            ViewPager.this.setScrollState(0);
            ViewPager.this.b();
        }
    };
    private int ai = 0;
    private int b;
    private final ArrayList<b> e = new ArrayList<>();
    private final b f = new b();
    private final Rect g = new Rect();
    /* access modifiers changed from: private */
    public p h;
    /* access modifiers changed from: private */
    public int i;
    private int j = -1;
    private Parcelable k = null;
    private ClassLoader l = null;
    private Scroller m;
    private h n;
    private int o;
    private Drawable p;
    private int q;
    private int r;
    private float s = -3.4028235E38f;
    private float t = Float.MAX_VALUE;
    private int u;
    private int v;
    private boolean w;
    private boolean x;
    private boolean y;
    private int z = 1;

    interface a {
    }

    interface e {
        void a(p pVar, p pVar2);
    }

    public interface f {
        void a(int i);

        void a(int i, float f);

        void b(int i);
    }

    public interface g {
    }

    static class b {
        Object a;
        int b;
        boolean c;
        float d;
        float e;

        b() {
        }
    }

    public static class i implements f {
        public final void a(int i, float f) {
        }

        public void a(int i) {
        }

        public final void b(int i) {
        }
    }

    public ViewPager(Context context) {
        super(context);
        d();
    }

    public ViewPager(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        d();
    }

    private void d() {
        setWillNotDraw(false);
        setDescendantFocusability(262144);
        setFocusable(true);
        Context context = getContext();
        this.m = new Scroller(context, d);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        float f2 = context.getResources().getDisplayMetrics().density;
        this.E = ab.a(viewConfiguration);
        this.L = (int) (400.0f * f2);
        this.M = viewConfiguration.getScaledMaximumFlingVelocity();
        this.Q = new android.support.v4.f.d(context);
        this.R = new android.support.v4.f.d(context);
        this.N = (int) (25.0f * f2);
        this.O = (int) (2.0f * f2);
        this.C = (int) (16.0f * f2);
        u.a((View) this, (a) new d());
        if (u.c(this) == 0) {
            u.d(this);
        }
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        removeCallbacks(this.ah);
        super.onDetachedFromWindow();
    }

    /* access modifiers changed from: private */
    public void setScrollState(int i2) {
        boolean z2;
        if (this.ai != i2) {
            this.ai = i2;
            if (this.ac != null) {
                if (i2 != 0) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                int childCount = getChildCount();
                for (int i3 = 0; i3 < childCount; i3++) {
                    u.b(getChildAt(i3), z2 ? 2 : 0);
                }
            }
            if (this.W != null) {
                this.W.b(i2);
            }
        }
    }

    public void setAdapter(p pVar) {
        if (this.h != null) {
            this.h.b((DataSetObserver) this.n);
            for (int i2 = 0; i2 < this.e.size(); i2++) {
                this.h.a(this.e.get(i2).a);
            }
            this.h.a();
            this.e.clear();
            int i3 = 0;
            while (i3 < getChildCount()) {
                if (!((c) getChildAt(i3).getLayoutParams()).a) {
                    removeViewAt(i3);
                    i3--;
                }
                i3++;
            }
            this.i = 0;
            scrollTo(0, 0);
        }
        p pVar2 = this.h;
        this.h = pVar;
        this.b = 0;
        if (this.h != null) {
            if (this.n == null) {
                this.n = new h(this, (byte) 0);
            }
            this.h.a((DataSetObserver) this.n);
            this.y = false;
            boolean z2 = this.S;
            this.S = true;
            this.b = this.h.b();
            if (this.j >= 0) {
                a(this.j, false, true);
                this.j = -1;
                this.k = null;
                this.l = null;
            } else if (!z2) {
                b();
            } else {
                requestLayout();
            }
        }
        if (this.ab != null && pVar2 != pVar) {
            this.ab.a(pVar2, pVar);
        }
    }

    public p getAdapter() {
        return this.h;
    }

    /* access modifiers changed from: package-private */
    public void setOnAdapterChangeListener(e eVar) {
        this.ab = eVar;
    }

    private int getClientWidth() {
        return (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
    }

    public void setCurrentItem(int i2) {
        boolean z2;
        this.y = false;
        if (!this.S) {
            z2 = true;
        } else {
            z2 = false;
        }
        a(i2, z2, false);
    }

    public final void a(int i2, boolean z2) {
        this.y = false;
        a(i2, z2, false);
    }

    public int getCurrentItem() {
        return this.i;
    }

    private void a(int i2, boolean z2, boolean z3) {
        a(i2, z2, z3, 0);
    }

    private void a(int i2, boolean z2, boolean z3, int i3) {
        boolean z4 = false;
        if (this.h == null || this.h.b() <= 0) {
            setScrollingCacheEnabled(false);
        } else if (z3 || this.i != i2 || this.e.size() == 0) {
            if (i2 < 0) {
                i2 = 0;
            } else if (i2 >= this.h.b()) {
                i2 = this.h.b() - 1;
            }
            int i4 = this.z;
            if (i2 > this.i + i4 || i2 < this.i - i4) {
                for (int i5 = 0; i5 < this.e.size(); i5++) {
                    this.e.get(i5).c = true;
                }
            }
            if (this.i != i2) {
                z4 = true;
            }
            if (this.S) {
                this.i = i2;
                if (z4 && this.W != null) {
                    this.W.a(i2);
                }
                if (z4 && this.aa != null) {
                    this.aa.a(i2);
                }
                requestLayout();
                return;
            }
            a(i2);
            a(i2, z2, i3, z4);
        } else {
            setScrollingCacheEnabled(false);
        }
    }

    private void a(int i2, boolean z2, int i3, boolean z3) {
        int abs;
        b b2 = b(i2);
        int i4 = 0;
        if (b2 != null) {
            i4 = (int) (((float) getClientWidth()) * Math.max(this.s, Math.min(b2.e, this.t)));
        }
        if (z2) {
            if (getChildCount() == 0) {
                setScrollingCacheEnabled(false);
            } else {
                int scrollX = getScrollX();
                int scrollY = getScrollY();
                int i5 = i4 - scrollX;
                int i6 = 0 - scrollY;
                if (i5 == 0 && i6 == 0) {
                    a(false);
                    b();
                    setScrollState(0);
                } else {
                    setScrollingCacheEnabled(true);
                    setScrollState(2);
                    int clientWidth = getClientWidth();
                    int i7 = clientWidth / 2;
                    float f2 = (float) i7;
                    float sin = (((float) i7) * ((float) Math.sin((double) ((float) (((double) (Math.min(1.0f, (1.0f * ((float) Math.abs(i5))) / ((float) clientWidth)) - 0.5f)) * 0.4712389167638204d))))) + f2;
                    int abs2 = Math.abs(i3);
                    if (abs2 > 0) {
                        abs = Math.round(1000.0f * Math.abs(sin / ((float) abs2))) * 4;
                    } else {
                        abs = (int) (((((float) Math.abs(i5)) / ((((float) clientWidth) * 1.0f) + ((float) this.o))) + 1.0f) * 100.0f);
                    }
                    this.m.startScroll(scrollX, scrollY, i5, i6, Math.min(abs, 600));
                    u.b(this);
                }
            }
            if (z3 && this.W != null) {
                this.W.a(i2);
            }
            if (z3 && this.aa != null) {
                this.aa.a(i2);
                return;
            }
            return;
        }
        if (z3 && this.W != null) {
            this.W.a(i2);
        }
        if (z3 && this.aa != null) {
            this.aa.a(i2);
        }
        a(false);
        scrollTo(i4, 0);
        c(i4);
    }

    public void setOnPageChangeListener(f fVar) {
        this.W = fVar;
    }

    /* access modifiers changed from: package-private */
    public void setChildrenDrawingOrderEnabledCompat(boolean z2) {
        if (Build.VERSION.SDK_INT >= 7) {
            if (this.ad == null) {
                Class<ViewGroup> cls = ViewGroup.class;
                try {
                    this.ad = cls.getDeclaredMethod("setChildrenDrawingOrderEnabled", new Class[]{Boolean.TYPE});
                } catch (NoSuchMethodException e2) {
                    Log.e("ViewPager", "Can't find setChildrenDrawingOrderEnabled", e2);
                }
            }
            try {
                this.ad.invoke(this, new Object[]{Boolean.valueOf(z2)});
            } catch (Exception e3) {
                Log.e("ViewPager", "Error changing children drawing order", e3);
            }
        }
    }

    /* access modifiers changed from: protected */
    public int getChildDrawingOrder(int i2, int i3) {
        if (this.ae == 2) {
            i3 = (i2 - 1) - i3;
        }
        return ((c) this.af.get(i3).getLayoutParams()).f;
    }

    /* access modifiers changed from: package-private */
    public final f a(f fVar) {
        f fVar2 = this.aa;
        this.aa = fVar;
        return fVar2;
    }

    public int getOffscreenPageLimit() {
        return this.z;
    }

    public void setOffscreenPageLimit(int i2) {
        if (i2 <= 0) {
            Log.w("ViewPager", "Requested offscreen page limit " + i2 + " too small; defaulting to 1");
            i2 = 1;
        }
        if (i2 != this.z) {
            this.z = i2;
            b();
        }
    }

    public void setPageMargin(int i2) {
        int i3 = this.o;
        this.o = i2;
        int width = getWidth();
        a(width, width, i2, i3);
        requestLayout();
    }

    public int getPageMargin() {
        return this.o;
    }

    public void setPageMarginDrawable(Drawable drawable) {
        this.p = drawable;
        if (drawable != null) {
            refreshDrawableState();
        }
        setWillNotDraw(drawable == null);
        invalidate();
    }

    public void setPageMarginDrawable(int i2) {
        setPageMarginDrawable(getContext().getResources().getDrawable(i2));
    }

    /* access modifiers changed from: protected */
    public boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.p;
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.p;
        if (drawable != null && drawable.isStateful()) {
            drawable.setState(getDrawableState());
        }
    }

    private b a(int i2, int i3) {
        b bVar = new b();
        bVar.b = i2;
        bVar.a = this.h.a((ViewGroup) this, i2);
        bVar.d = 1.0f;
        if (i3 < 0 || i3 >= this.e.size()) {
            this.e.add(bVar);
        } else {
            this.e.add(i3, bVar);
        }
        return bVar;
    }

    /* access modifiers changed from: package-private */
    public final void a() {
        int b2 = this.h.b();
        this.b = b2;
        boolean z2 = this.e.size() < (this.z * 2) + 1 && this.e.size() < b2;
        int i2 = this.i;
        for (int i3 = 0; i3 < this.e.size(); i3++) {
            this.e.get(i3);
        }
        Collections.sort(this.e, c);
        if (z2) {
            int childCount = getChildCount();
            for (int i4 = 0; i4 < childCount; i4++) {
                c cVar = (c) getChildAt(i4).getLayoutParams();
                if (!cVar.a) {
                    cVar.c = 0.0f;
                }
            }
            a(i2, false, true);
            requestLayout();
        }
    }

    /* access modifiers changed from: package-private */
    public final void b() {
        a(this.i);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:29:0x00f2, code lost:
        if (r2.b == r18.i) goto L_0x00f4;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void a(int r19) {
        /*
            r18 = this;
            r3 = 0
            r2 = 2
            r0 = r18
            int r4 = r0.i
            r0 = r19
            if (r4 == r0) goto L_0x031f
            r0 = r18
            int r2 = r0.i
            r0 = r19
            if (r2 >= r0) goto L_0x0030
            r2 = 66
        L_0x0014:
            r0 = r18
            int r3 = r0.i
            r0 = r18
            android.support.v4.view.ViewPager$b r3 = r0.b((int) r3)
            r0 = r19
            r1 = r18
            r1.i = r0
            r4 = r3
            r3 = r2
        L_0x0026:
            r0 = r18
            android.support.v4.view.p r2 = r0.h
            if (r2 != 0) goto L_0x0033
            r18.e()
        L_0x002f:
            return
        L_0x0030:
            r2 = 17
            goto L_0x0014
        L_0x0033:
            r0 = r18
            boolean r2 = r0.y
            if (r2 == 0) goto L_0x003d
            r18.e()
            goto L_0x002f
        L_0x003d:
            android.os.IBinder r2 = r18.getWindowToken()
            if (r2 == 0) goto L_0x002f
            r0 = r18
            int r2 = r0.z
            r5 = 0
            r0 = r18
            int r6 = r0.i
            int r6 = r6 - r2
            int r11 = java.lang.Math.max(r5, r6)
            r0 = r18
            android.support.v4.view.p r5 = r0.h
            int r12 = r5.b()
            int r5 = r12 + -1
            r0 = r18
            int r6 = r0.i
            int r2 = r2 + r6
            int r13 = java.lang.Math.min(r5, r2)
            r0 = r18
            int r2 = r0.b
            if (r12 == r2) goto L_0x00cd
            android.content.res.Resources r2 = r18.getResources()     // Catch:{ NotFoundException -> 0x00c3 }
            int r3 = r18.getId()     // Catch:{ NotFoundException -> 0x00c3 }
            java.lang.String r2 = r2.getResourceName(r3)     // Catch:{ NotFoundException -> 0x00c3 }
        L_0x0076:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r5 = "The application's PagerAdapter changed the adapter's contents without calling PagerAdapter#notifyDataSetChanged! Expected adapter item count: "
            r4.<init>(r5)
            r0 = r18
            int r5 = r0.b
            java.lang.StringBuilder r4 = r4.append(r5)
            java.lang.String r5 = ", found: "
            java.lang.StringBuilder r4 = r4.append(r5)
            java.lang.StringBuilder r4 = r4.append(r12)
            java.lang.String r5 = " Pager id: "
            java.lang.StringBuilder r4 = r4.append(r5)
            java.lang.StringBuilder r2 = r4.append(r2)
            java.lang.String r4 = " Pager class: "
            java.lang.StringBuilder r2 = r2.append(r4)
            java.lang.Class r4 = r18.getClass()
            java.lang.StringBuilder r2 = r2.append(r4)
            java.lang.String r4 = " Problematic adapter: "
            java.lang.StringBuilder r2 = r2.append(r4)
            r0 = r18
            android.support.v4.view.p r4 = r0.h
            java.lang.Class r4 = r4.getClass()
            java.lang.StringBuilder r2 = r2.append(r4)
            java.lang.String r2 = r2.toString()
            r3.<init>(r2)
            throw r3
        L_0x00c3:
            r2 = move-exception
            int r2 = r18.getId()
            java.lang.String r2 = java.lang.Integer.toHexString(r2)
            goto L_0x0076
        L_0x00cd:
            r6 = 0
            r2 = 0
            r5 = r2
        L_0x00d0:
            r0 = r18
            java.util.ArrayList<android.support.v4.view.ViewPager$b> r2 = r0.e
            int r2 = r2.size()
            if (r5 >= r2) goto L_0x031c
            r0 = r18
            java.util.ArrayList<android.support.v4.view.ViewPager$b> r2 = r0.e
            java.lang.Object r2 = r2.get(r5)
            android.support.v4.view.ViewPager$b r2 = (android.support.v4.view.ViewPager.b) r2
            int r7 = r2.b
            r0 = r18
            int r8 = r0.i
            if (r7 < r8) goto L_0x0160
            int r7 = r2.b
            r0 = r18
            int r8 = r0.i
            if (r7 != r8) goto L_0x031c
        L_0x00f4:
            if (r2 != 0) goto L_0x0319
            if (r12 <= 0) goto L_0x0319
            r0 = r18
            int r2 = r0.i
            r0 = r18
            android.support.v4.view.ViewPager$b r2 = r0.a((int) r2, (int) r5)
            r10 = r2
        L_0x0103:
            if (r10 == 0) goto L_0x0282
            r9 = 0
            int r8 = r5 + -1
            if (r8 < 0) goto L_0x0165
            r0 = r18
            java.util.ArrayList<android.support.v4.view.ViewPager$b> r2 = r0.e
            java.lang.Object r2 = r2.get(r8)
            android.support.v4.view.ViewPager$b r2 = (android.support.v4.view.ViewPager.b) r2
        L_0x0114:
            int r14 = r18.getClientWidth()
            if (r14 > 0) goto L_0x0167
            r6 = 0
        L_0x011b:
            r0 = r18
            int r7 = r0.i
            int r7 = r7 + -1
            r16 = r7
            r7 = r9
            r9 = r16
            r17 = r8
            r8 = r5
            r5 = r17
        L_0x012b:
            if (r9 < 0) goto L_0x01ad
            int r15 = (r7 > r6 ? 1 : (r7 == r6 ? 0 : -1))
            if (r15 < 0) goto L_0x0177
            if (r9 >= r11) goto L_0x0177
            if (r2 == 0) goto L_0x01ad
            int r15 = r2.b
            if (r9 != r15) goto L_0x015d
            boolean r15 = r2.c
            if (r15 != 0) goto L_0x015d
            r0 = r18
            java.util.ArrayList<android.support.v4.view.ViewPager$b> r15 = r0.e
            r15.remove(r5)
            r0 = r18
            android.support.v4.view.p r15 = r0.h
            java.lang.Object r2 = r2.a
            r15.a((java.lang.Object) r2)
            int r5 = r5 + -1
            int r8 = r8 + -1
            if (r5 < 0) goto L_0x0175
            r0 = r18
            java.util.ArrayList<android.support.v4.view.ViewPager$b> r2 = r0.e
            java.lang.Object r2 = r2.get(r5)
            android.support.v4.view.ViewPager$b r2 = (android.support.v4.view.ViewPager.b) r2
        L_0x015d:
            int r9 = r9 + -1
            goto L_0x012b
        L_0x0160:
            int r2 = r5 + 1
            r5 = r2
            goto L_0x00d0
        L_0x0165:
            r2 = 0
            goto L_0x0114
        L_0x0167:
            r6 = 1073741824(0x40000000, float:2.0)
            float r7 = r10.d
            float r6 = r6 - r7
            int r7 = r18.getPaddingLeft()
            float r7 = (float) r7
            float r15 = (float) r14
            float r7 = r7 / r15
            float r6 = r6 + r7
            goto L_0x011b
        L_0x0175:
            r2 = 0
            goto L_0x015d
        L_0x0177:
            if (r2 == 0) goto L_0x0191
            int r15 = r2.b
            if (r9 != r15) goto L_0x0191
            float r2 = r2.d
            float r7 = r7 + r2
            int r5 = r5 + -1
            if (r5 < 0) goto L_0x018f
            r0 = r18
            java.util.ArrayList<android.support.v4.view.ViewPager$b> r2 = r0.e
            java.lang.Object r2 = r2.get(r5)
            android.support.v4.view.ViewPager$b r2 = (android.support.v4.view.ViewPager.b) r2
            goto L_0x015d
        L_0x018f:
            r2 = 0
            goto L_0x015d
        L_0x0191:
            int r2 = r5 + 1
            r0 = r18
            android.support.v4.view.ViewPager$b r2 = r0.a((int) r9, (int) r2)
            float r2 = r2.d
            float r7 = r7 + r2
            int r8 = r8 + 1
            if (r5 < 0) goto L_0x01ab
            r0 = r18
            java.util.ArrayList<android.support.v4.view.ViewPager$b> r2 = r0.e
            java.lang.Object r2 = r2.get(r5)
            android.support.v4.view.ViewPager$b r2 = (android.support.v4.view.ViewPager.b) r2
            goto L_0x015d
        L_0x01ab:
            r2 = 0
            goto L_0x015d
        L_0x01ad:
            float r6 = r10.d
            int r9 = r8 + 1
            r2 = 1073741824(0x40000000, float:2.0)
            int r2 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
            if (r2 >= 0) goto L_0x027d
            r0 = r18
            java.util.ArrayList<android.support.v4.view.ViewPager$b> r2 = r0.e
            int r2 = r2.size()
            if (r9 >= r2) goto L_0x021f
            r0 = r18
            java.util.ArrayList<android.support.v4.view.ViewPager$b> r2 = r0.e
            java.lang.Object r2 = r2.get(r9)
            android.support.v4.view.ViewPager$b r2 = (android.support.v4.view.ViewPager.b) r2
            r7 = r2
        L_0x01cc:
            if (r14 > 0) goto L_0x0221
            r2 = 0
            r5 = r2
        L_0x01d0:
            r0 = r18
            int r2 = r0.i
            int r2 = r2 + 1
            r16 = r7
            r7 = r9
            r9 = r2
            r2 = r16
        L_0x01dc:
            if (r9 >= r12) goto L_0x027d
            int r11 = (r6 > r5 ? 1 : (r6 == r5 ? 0 : -1))
            if (r11 < 0) goto L_0x022f
            if (r9 <= r13) goto L_0x022f
            if (r2 == 0) goto L_0x027d
            int r11 = r2.b
            if (r9 != r11) goto L_0x0312
            boolean r11 = r2.c
            if (r11 != 0) goto L_0x0312
            r0 = r18
            java.util.ArrayList<android.support.v4.view.ViewPager$b> r11 = r0.e
            r11.remove(r7)
            r0 = r18
            android.support.v4.view.p r11 = r0.h
            java.lang.Object r2 = r2.a
            r11.a((java.lang.Object) r2)
            r0 = r18
            java.util.ArrayList<android.support.v4.view.ViewPager$b> r2 = r0.e
            int r2 = r2.size()
            if (r7 >= r2) goto L_0x022d
            r0 = r18
            java.util.ArrayList<android.support.v4.view.ViewPager$b> r2 = r0.e
            java.lang.Object r2 = r2.get(r7)
            android.support.v4.view.ViewPager$b r2 = (android.support.v4.view.ViewPager.b) r2
        L_0x0212:
            r16 = r6
            r6 = r2
            r2 = r16
        L_0x0217:
            int r9 = r9 + 1
            r16 = r2
            r2 = r6
            r6 = r16
            goto L_0x01dc
        L_0x021f:
            r7 = 0
            goto L_0x01cc
        L_0x0221:
            int r2 = r18.getPaddingRight()
            float r2 = (float) r2
            float r5 = (float) r14
            float r2 = r2 / r5
            r5 = 1073741824(0x40000000, float:2.0)
            float r2 = r2 + r5
            r5 = r2
            goto L_0x01d0
        L_0x022d:
            r2 = 0
            goto L_0x0212
        L_0x022f:
            if (r2 == 0) goto L_0x0256
            int r11 = r2.b
            if (r9 != r11) goto L_0x0256
            float r2 = r2.d
            float r6 = r6 + r2
            int r7 = r7 + 1
            r0 = r18
            java.util.ArrayList<android.support.v4.view.ViewPager$b> r2 = r0.e
            int r2 = r2.size()
            if (r7 >= r2) goto L_0x0254
            r0 = r18
            java.util.ArrayList<android.support.v4.view.ViewPager$b> r2 = r0.e
            java.lang.Object r2 = r2.get(r7)
            android.support.v4.view.ViewPager$b r2 = (android.support.v4.view.ViewPager.b) r2
        L_0x024e:
            r16 = r6
            r6 = r2
            r2 = r16
            goto L_0x0217
        L_0x0254:
            r2 = 0
            goto L_0x024e
        L_0x0256:
            r0 = r18
            android.support.v4.view.ViewPager$b r2 = r0.a((int) r9, (int) r7)
            int r7 = r7 + 1
            float r2 = r2.d
            float r6 = r6 + r2
            r0 = r18
            java.util.ArrayList<android.support.v4.view.ViewPager$b> r2 = r0.e
            int r2 = r2.size()
            if (r7 >= r2) goto L_0x027b
            r0 = r18
            java.util.ArrayList<android.support.v4.view.ViewPager$b> r2 = r0.e
            java.lang.Object r2 = r2.get(r7)
            android.support.v4.view.ViewPager$b r2 = (android.support.v4.view.ViewPager.b) r2
        L_0x0275:
            r16 = r6
            r6 = r2
            r2 = r16
            goto L_0x0217
        L_0x027b:
            r2 = 0
            goto L_0x0275
        L_0x027d:
            r0 = r18
            r0.a((android.support.v4.view.ViewPager.b) r10, (int) r8, (android.support.v4.view.ViewPager.b) r4)
        L_0x0282:
            r0 = r18
            android.support.v4.view.p r4 = r0.h
            if (r10 == 0) goto L_0x02c9
            java.lang.Object r2 = r10.a
        L_0x028a:
            r4.b((java.lang.Object) r2)
            r0 = r18
            android.support.v4.view.p r2 = r0.h
            r2.a()
            int r5 = r18.getChildCount()
            r2 = 0
            r4 = r2
        L_0x029a:
            if (r4 >= r5) goto L_0x02cb
            r0 = r18
            android.view.View r6 = r0.getChildAt(r4)
            android.view.ViewGroup$LayoutParams r2 = r6.getLayoutParams()
            android.support.v4.view.ViewPager$c r2 = (android.support.v4.view.ViewPager.c) r2
            r2.f = r4
            boolean r7 = r2.a
            if (r7 != 0) goto L_0x02c5
            float r7 = r2.c
            r8 = 0
            int r7 = (r7 > r8 ? 1 : (r7 == r8 ? 0 : -1))
            if (r7 != 0) goto L_0x02c5
            r0 = r18
            android.support.v4.view.ViewPager$b r6 = r0.a((android.view.View) r6)
            if (r6 == 0) goto L_0x02c5
            float r7 = r6.d
            r2.c = r7
            int r6 = r6.b
            r2.e = r6
        L_0x02c5:
            int r2 = r4 + 1
            r4 = r2
            goto L_0x029a
        L_0x02c9:
            r2 = 0
            goto L_0x028a
        L_0x02cb:
            r18.e()
            boolean r2 = r18.hasFocus()
            if (r2 == 0) goto L_0x002f
            android.view.View r2 = r18.findFocus()
            if (r2 == 0) goto L_0x0310
            r0 = r18
            android.support.v4.view.ViewPager$b r2 = r0.b((android.view.View) r2)
        L_0x02e0:
            if (r2 == 0) goto L_0x02ea
            int r2 = r2.b
            r0 = r18
            int r4 = r0.i
            if (r2 == r4) goto L_0x002f
        L_0x02ea:
            r2 = 0
        L_0x02eb:
            int r4 = r18.getChildCount()
            if (r2 >= r4) goto L_0x002f
            r0 = r18
            android.view.View r4 = r0.getChildAt(r2)
            r0 = r18
            android.support.v4.view.ViewPager$b r5 = r0.a((android.view.View) r4)
            if (r5 == 0) goto L_0x030d
            int r5 = r5.b
            r0 = r18
            int r6 = r0.i
            if (r5 != r6) goto L_0x030d
            boolean r4 = r4.requestFocus(r3)
            if (r4 != 0) goto L_0x002f
        L_0x030d:
            int r2 = r2 + 1
            goto L_0x02eb
        L_0x0310:
            r2 = 0
            goto L_0x02e0
        L_0x0312:
            r16 = r6
            r6 = r2
            r2 = r16
            goto L_0x0217
        L_0x0319:
            r10 = r2
            goto L_0x0103
        L_0x031c:
            r2 = r6
            goto L_0x00f4
        L_0x031f:
            r4 = r3
            r3 = r2
            goto L_0x0026
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v4.view.ViewPager.a(int):void");
    }

    private void e() {
        if (this.ae != 0) {
            if (this.af == null) {
                this.af = new ArrayList<>();
            } else {
                this.af.clear();
            }
            int childCount = getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                this.af.add(getChildAt(i2));
            }
            Collections.sort(this.af, ag);
        }
    }

    private void a(b bVar, int i2, b bVar2) {
        float f2;
        b bVar3;
        b bVar4;
        int b2 = this.h.b();
        int clientWidth = getClientWidth();
        if (clientWidth > 0) {
            f2 = ((float) this.o) / ((float) clientWidth);
        } else {
            f2 = 0.0f;
        }
        if (bVar2 != null) {
            int i3 = bVar2.b;
            if (i3 < bVar.b) {
                int i4 = i3 + 1;
                float f3 = bVar2.e + bVar2.d + f2;
                int i5 = 0;
                while (true) {
                    int i6 = i4;
                    if (i6 > bVar.b || i5 >= this.e.size()) {
                        break;
                    }
                    Object obj = this.e.get(i5);
                    while (true) {
                        bVar4 = (b) obj;
                        if (i6 <= bVar4.b || i5 >= this.e.size() - 1) {
                            int i7 = i6;
                            float f4 = f3;
                            int i8 = i7;
                        } else {
                            i5++;
                            obj = this.e.get(i5);
                        }
                    }
                    int i72 = i6;
                    float f42 = f3;
                    int i82 = i72;
                    while (i82 < bVar4.b) {
                        i82++;
                        f42 = 1.0f + f2 + f42;
                    }
                    bVar4.e = f42;
                    float f5 = f42 + bVar4.d + f2;
                    i4 = i82 + 1;
                    f3 = f5;
                }
            } else if (i3 > bVar.b) {
                int size = this.e.size() - 1;
                float f6 = bVar2.e;
                int i9 = i3 - 1;
                int i10 = size;
                while (true) {
                    float f7 = f6;
                    int i11 = i9;
                    if (i11 < bVar.b || i10 < 0) {
                        break;
                    }
                    Object obj2 = this.e.get(i10);
                    while (true) {
                        bVar3 = (b) obj2;
                        if (i11 >= bVar3.b || i10 <= 0) {
                            int i12 = i11;
                            float f8 = f7;
                            int i13 = i12;
                        } else {
                            i10--;
                            obj2 = this.e.get(i10);
                        }
                    }
                    int i122 = i11;
                    float f82 = f7;
                    int i132 = i122;
                    while (i132 > bVar3.b) {
                        i132--;
                        f82 -= 1.0f + f2;
                    }
                    f6 = f82 - (bVar3.d + f2);
                    bVar3.e = f6;
                    i9 = i132 - 1;
                }
            }
        }
        int size2 = this.e.size();
        float f9 = bVar.e;
        int i14 = bVar.b - 1;
        this.s = bVar.b == 0 ? bVar.e : -3.4028235E38f;
        this.t = bVar.b == b2 + -1 ? (bVar.e + bVar.d) - 1.0f : Float.MAX_VALUE;
        for (int i15 = i2 - 1; i15 >= 0; i15--) {
            b bVar5 = this.e.get(i15);
            while (i14 > bVar5.b) {
                i14--;
                f9 -= 1.0f + f2;
            }
            f9 -= bVar5.d + f2;
            bVar5.e = f9;
            if (bVar5.b == 0) {
                this.s = f9;
            }
            i14--;
        }
        float f10 = bVar.e + bVar.d + f2;
        int i16 = bVar.b + 1;
        for (int i17 = i2 + 1; i17 < size2; i17++) {
            b bVar6 = this.e.get(i17);
            while (i16 < bVar6.b) {
                i16++;
                f10 += 1.0f + f2;
            }
            if (bVar6.b == b2 - 1) {
                this.t = (bVar6.d + f10) - 1.0f;
            }
            bVar6.e = f10;
            f10 += bVar6.d + f2;
            i16++;
        }
        this.T = false;
    }

    public static class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR;
        int a;
        Parcelable b;
        ClassLoader c;

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.a);
            parcel.writeParcelable(this.b, i);
        }

        public String toString() {
            return "FragmentPager.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " position=" + this.a + "}";
        }

        static {
            AnonymousClass1 r0 = new android.support.v4.c.b<SavedState>() {
                public final /* bridge */ /* synthetic */ Object[] a(int i) {
                    return new SavedState[i];
                }

                public final /* synthetic */ Object a(Parcel parcel, ClassLoader classLoader) {
                    return new SavedState(parcel, classLoader);
                }
            };
            if (Build.VERSION.SDK_INT >= 13) {
                android.support.v4.c.d.a(r0);
            }
            CREATOR = new a.C0002a(r0);
        }

        SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel);
            classLoader = classLoader == null ? getClass().getClassLoader() : classLoader;
            this.a = parcel.readInt();
            this.b = parcel.readParcelable(classLoader);
            this.c = classLoader;
        }
    }

    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.a = this.i;
        if (this.h != null) {
            savedState.b = null;
        }
        return savedState;
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        if (this.h != null) {
            Parcelable parcelable2 = savedState.b;
            ClassLoader classLoader = savedState.c;
            a(savedState.a, false, true);
            return;
        }
        this.j = savedState.a;
        this.k = savedState.b;
        this.l = savedState.c;
    }

    public void addView(View view, int i2, ViewGroup.LayoutParams layoutParams) {
        ViewGroup.LayoutParams layoutParams2;
        if (!checkLayoutParams(layoutParams)) {
            layoutParams2 = generateLayoutParams(layoutParams);
        } else {
            layoutParams2 = layoutParams;
        }
        c cVar = (c) layoutParams2;
        cVar.a |= view instanceof a;
        if (!this.w) {
            super.addView(view, i2, layoutParams2);
        } else if (cVar == null || !cVar.a) {
            cVar.d = true;
            addViewInLayout(view, i2, layoutParams2);
        } else {
            throw new IllegalStateException("Cannot add pager decor view during layout");
        }
    }

    public void removeView(View view) {
        if (this.w) {
            removeViewInLayout(view);
        } else {
            super.removeView(view);
        }
    }

    private b a(View view) {
        int i2 = 0;
        while (true) {
            int i3 = i2;
            if (i3 >= this.e.size()) {
                return null;
            }
            b bVar = this.e.get(i3);
            if (this.h.a(view, bVar.a)) {
                return bVar;
            }
            i2 = i3 + 1;
        }
    }

    private b b(View view) {
        while (true) {
            ViewParent parent = view.getParent();
            if (parent == this) {
                return a(view);
            }
            if (parent == null || !(parent instanceof View)) {
                return null;
            }
            view = (View) parent;
        }
        return null;
    }

    private b b(int i2) {
        int i3 = 0;
        while (true) {
            int i4 = i3;
            if (i4 >= this.e.size()) {
                return null;
            }
            b bVar = this.e.get(i4);
            if (bVar.b == i2) {
                return bVar;
            }
            i3 = i4 + 1;
        }
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.S = true;
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00a0  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00b4  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onMeasure(int r14, int r15) {
        /*
            r13 = this;
            r0 = 0
            int r0 = getDefaultSize(r0, r14)
            r1 = 0
            int r1 = getDefaultSize(r1, r15)
            r13.setMeasuredDimension(r0, r1)
            int r0 = r13.getMeasuredWidth()
            int r1 = r0 / 10
            int r2 = r13.C
            int r1 = java.lang.Math.min(r1, r2)
            r13.D = r1
            int r1 = r13.getPaddingLeft()
            int r0 = r0 - r1
            int r1 = r13.getPaddingRight()
            int r3 = r0 - r1
            int r0 = r13.getMeasuredHeight()
            int r1 = r13.getPaddingTop()
            int r0 = r0 - r1
            int r1 = r13.getPaddingBottom()
            int r5 = r0 - r1
            int r9 = r13.getChildCount()
            r0 = 0
            r8 = r0
        L_0x003b:
            if (r8 >= r9) goto L_0x00bc
            android.view.View r10 = r13.getChildAt(r8)
            int r0 = r10.getVisibility()
            r1 = 8
            if (r0 == r1) goto L_0x00a5
            android.view.ViewGroup$LayoutParams r0 = r10.getLayoutParams()
            android.support.v4.view.ViewPager$c r0 = (android.support.v4.view.ViewPager.c) r0
            if (r0 == 0) goto L_0x00a5
            boolean r1 = r0.a
            if (r1 == 0) goto L_0x00a5
            int r1 = r0.b
            r6 = r1 & 7
            int r1 = r0.b
            r4 = r1 & 112(0x70, float:1.57E-43)
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r7 = 48
            if (r4 == r7) goto L_0x0069
            r7 = 80
            if (r4 != r7) goto L_0x00a9
        L_0x0069:
            r4 = 1
            r7 = r4
        L_0x006b:
            r4 = 3
            if (r6 == r4) goto L_0x0071
            r4 = 5
            if (r6 != r4) goto L_0x00ac
        L_0x0071:
            r4 = 1
            r6 = r4
        L_0x0073:
            if (r7 == 0) goto L_0x00af
            r2 = 1073741824(0x40000000, float:2.0)
        L_0x0077:
            int r4 = r0.width
            r11 = -2
            if (r4 == r11) goto L_0x010f
            r4 = 1073741824(0x40000000, float:2.0)
            int r2 = r0.width
            r11 = -1
            if (r2 == r11) goto L_0x010c
            int r2 = r0.width
        L_0x0085:
            int r11 = r0.height
            r12 = -2
            if (r11 == r12) goto L_0x010a
            r1 = 1073741824(0x40000000, float:2.0)
            int r11 = r0.height
            r12 = -1
            if (r11 == r12) goto L_0x010a
            int r0 = r0.height
        L_0x0093:
            int r2 = android.view.View.MeasureSpec.makeMeasureSpec(r2, r4)
            int r0 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r1)
            r10.measure(r2, r0)
            if (r7 == 0) goto L_0x00b4
            int r0 = r10.getMeasuredHeight()
            int r5 = r5 - r0
        L_0x00a5:
            int r0 = r8 + 1
            r8 = r0
            goto L_0x003b
        L_0x00a9:
            r4 = 0
            r7 = r4
            goto L_0x006b
        L_0x00ac:
            r4 = 0
            r6 = r4
            goto L_0x0073
        L_0x00af:
            if (r6 == 0) goto L_0x0077
            r1 = 1073741824(0x40000000, float:2.0)
            goto L_0x0077
        L_0x00b4:
            if (r6 == 0) goto L_0x00a5
            int r0 = r10.getMeasuredWidth()
            int r3 = r3 - r0
            goto L_0x00a5
        L_0x00bc:
            r0 = 1073741824(0x40000000, float:2.0)
            int r0 = android.view.View.MeasureSpec.makeMeasureSpec(r3, r0)
            r13.u = r0
            r0 = 1073741824(0x40000000, float:2.0)
            int r0 = android.view.View.MeasureSpec.makeMeasureSpec(r5, r0)
            r13.v = r0
            r0 = 1
            r13.w = r0
            r13.b()
            r0 = 0
            r13.w = r0
            int r2 = r13.getChildCount()
            r0 = 0
            r1 = r0
        L_0x00db:
            if (r1 >= r2) goto L_0x0109
            android.view.View r4 = r13.getChildAt(r1)
            int r0 = r4.getVisibility()
            r5 = 8
            if (r0 == r5) goto L_0x0105
            android.view.ViewGroup$LayoutParams r0 = r4.getLayoutParams()
            android.support.v4.view.ViewPager$c r0 = (android.support.v4.view.ViewPager.c) r0
            if (r0 == 0) goto L_0x00f5
            boolean r5 = r0.a
            if (r5 != 0) goto L_0x0105
        L_0x00f5:
            float r5 = (float) r3
            float r0 = r0.c
            float r0 = r0 * r5
            int r0 = (int) r0
            r5 = 1073741824(0x40000000, float:2.0)
            int r0 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r5)
            int r5 = r13.v
            r4.measure(r0, r5)
        L_0x0105:
            int r0 = r1 + 1
            r1 = r0
            goto L_0x00db
        L_0x0109:
            return
        L_0x010a:
            r0 = r5
            goto L_0x0093
        L_0x010c:
            r2 = r3
            goto L_0x0085
        L_0x010f:
            r4 = r2
            r2 = r3
            goto L_0x0085
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v4.view.ViewPager.onMeasure(int, int):void");
    }

    /* access modifiers changed from: protected */
    public void onSizeChanged(int i2, int i3, int i4, int i5) {
        super.onSizeChanged(i2, i3, i4, i5);
        if (i2 != i4) {
            a(i2, i4, this.o, this.o);
        }
    }

    private void a(int i2, int i3, int i4, int i5) {
        if (i3 <= 0 || this.e.isEmpty()) {
            b b2 = b(this.i);
            int min = (int) ((b2 != null ? Math.min(b2.e, this.t) : 0.0f) * ((float) ((i2 - getPaddingLeft()) - getPaddingRight())));
            if (min != getScrollX()) {
                a(false);
                scrollTo(min, getScrollY());
                return;
            }
            return;
        }
        int paddingLeft = (int) (((float) (((i2 - getPaddingLeft()) - getPaddingRight()) + i4)) * (((float) getScrollX()) / ((float) (((i3 - getPaddingLeft()) - getPaddingRight()) + i5))));
        scrollTo(paddingLeft, getScrollY());
        if (!this.m.isFinished()) {
            this.m.startScroll(paddingLeft, 0, (int) (b(this.i).e * ((float) i2)), 0, this.m.getDuration() - this.m.timePassed());
        }
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
        b a2;
        int i6;
        int i7;
        int i8;
        int measuredHeight;
        int i9;
        int i10;
        int childCount = getChildCount();
        int i11 = i4 - i2;
        int i12 = i5 - i3;
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingRight = getPaddingRight();
        int paddingBottom = getPaddingBottom();
        int scrollX = getScrollX();
        int i13 = 0;
        int i14 = 0;
        while (i14 < childCount) {
            View childAt = getChildAt(i14);
            if (childAt.getVisibility() != 8) {
                c cVar = (c) childAt.getLayoutParams();
                if (cVar.a) {
                    int i15 = cVar.b & 7;
                    int i16 = cVar.b & 112;
                    switch (i15) {
                        case 1:
                            i8 = Math.max((i11 - childAt.getMeasuredWidth()) / 2, paddingLeft);
                            break;
                        case 3:
                            i8 = paddingLeft;
                            paddingLeft = childAt.getMeasuredWidth() + paddingLeft;
                            break;
                        case 5:
                            int measuredWidth = (i11 - paddingRight) - childAt.getMeasuredWidth();
                            paddingRight += childAt.getMeasuredWidth();
                            i8 = measuredWidth;
                            break;
                        default:
                            i8 = paddingLeft;
                            break;
                    }
                    switch (i16) {
                        case 16:
                            measuredHeight = Math.max((i12 - childAt.getMeasuredHeight()) / 2, paddingTop);
                            int i17 = paddingBottom;
                            i9 = paddingTop;
                            i10 = i17;
                            break;
                        case a.i.Theme_homeAsUpIndicator:
                            int measuredHeight2 = childAt.getMeasuredHeight() + paddingTop;
                            int i18 = paddingTop;
                            i10 = paddingBottom;
                            i9 = measuredHeight2;
                            measuredHeight = i18;
                            break;
                        case a.i.Theme_windowFixedHeightMinor:
                            measuredHeight = (i12 - paddingBottom) - childAt.getMeasuredHeight();
                            int measuredHeight3 = paddingBottom + childAt.getMeasuredHeight();
                            i9 = paddingTop;
                            i10 = measuredHeight3;
                            break;
                        default:
                            measuredHeight = paddingTop;
                            int i19 = paddingBottom;
                            i9 = paddingTop;
                            i10 = i19;
                            break;
                    }
                    int i20 = i8 + scrollX;
                    childAt.layout(i20, measuredHeight, childAt.getMeasuredWidth() + i20, childAt.getMeasuredHeight() + measuredHeight);
                    i6 = i13 + 1;
                    i7 = i9;
                    paddingBottom = i10;
                    i14++;
                    paddingLeft = paddingLeft;
                    paddingRight = paddingRight;
                    paddingTop = i7;
                    i13 = i6;
                }
            }
            i6 = i13;
            i7 = paddingTop;
            i14++;
            paddingLeft = paddingLeft;
            paddingRight = paddingRight;
            paddingTop = i7;
            i13 = i6;
        }
        int i21 = (i11 - paddingLeft) - paddingRight;
        for (int i22 = 0; i22 < childCount; i22++) {
            View childAt2 = getChildAt(i22);
            if (childAt2.getVisibility() != 8) {
                c cVar2 = (c) childAt2.getLayoutParams();
                if (!cVar2.a && (a2 = a(childAt2)) != null) {
                    int i23 = ((int) (a2.e * ((float) i21))) + paddingLeft;
                    if (cVar2.d) {
                        cVar2.d = false;
                        childAt2.measure(View.MeasureSpec.makeMeasureSpec((int) (cVar2.c * ((float) i21)), 1073741824), View.MeasureSpec.makeMeasureSpec((i12 - paddingTop) - paddingBottom, 1073741824));
                    }
                    childAt2.layout(i23, paddingTop, childAt2.getMeasuredWidth() + i23, childAt2.getMeasuredHeight() + paddingTop);
                }
            }
        }
        this.q = paddingTop;
        this.r = i12 - paddingBottom;
        this.V = i13;
        if (this.S) {
            a(this.i, false, 0, false);
        }
        this.S = false;
    }

    public void computeScroll() {
        if (this.m.isFinished() || !this.m.computeScrollOffset()) {
            a(true);
            return;
        }
        int scrollX = getScrollX();
        int scrollY = getScrollY();
        int currX = this.m.getCurrX();
        int currY = this.m.getCurrY();
        if (!(scrollX == currX && scrollY == currY)) {
            scrollTo(currX, currY);
            if (!c(currX)) {
                this.m.abortAnimation();
                scrollTo(0, currY);
            }
        }
        u.b(this);
    }

    private boolean c(int i2) {
        if (this.e.size() == 0) {
            this.U = false;
            a(0, 0.0f);
            if (this.U) {
                return false;
            }
            throw new IllegalStateException("onPageScrolled did not call superclass implementation");
        }
        b g2 = g();
        int clientWidth = getClientWidth();
        float f2 = ((float) this.o) / ((float) clientWidth);
        this.U = false;
        a(g2.b, ((((float) i2) / ((float) clientWidth)) - g2.e) / (g2.d + f2));
        if (this.U) {
            return true;
        }
        throw new IllegalStateException("onPageScrolled did not call superclass implementation");
    }

    private void a(int i2, float f2) {
        int i3;
        int i4;
        int measuredWidth;
        if (this.V > 0) {
            int scrollX = getScrollX();
            int paddingLeft = getPaddingLeft();
            int paddingRight = getPaddingRight();
            int width = getWidth();
            int childCount = getChildCount();
            int i5 = 0;
            while (i5 < childCount) {
                View childAt = getChildAt(i5);
                c cVar = (c) childAt.getLayoutParams();
                if (cVar.a) {
                    switch (cVar.b & 7) {
                        case 1:
                            measuredWidth = Math.max((width - childAt.getMeasuredWidth()) / 2, paddingLeft);
                            int i6 = paddingRight;
                            i3 = paddingLeft;
                            i4 = i6;
                            break;
                        case 3:
                            int width2 = childAt.getWidth() + paddingLeft;
                            int i7 = paddingLeft;
                            i4 = paddingRight;
                            i3 = width2;
                            measuredWidth = i7;
                            break;
                        case 5:
                            measuredWidth = (width - paddingRight) - childAt.getMeasuredWidth();
                            int measuredWidth2 = paddingRight + childAt.getMeasuredWidth();
                            i3 = paddingLeft;
                            i4 = measuredWidth2;
                            break;
                        default:
                            measuredWidth = paddingLeft;
                            int i8 = paddingRight;
                            i3 = paddingLeft;
                            i4 = i8;
                            break;
                    }
                    int left = (measuredWidth + scrollX) - childAt.getLeft();
                    if (left != 0) {
                        childAt.offsetLeftAndRight(left);
                    }
                } else {
                    int i9 = paddingRight;
                    i3 = paddingLeft;
                    i4 = i9;
                }
                i5++;
                int i10 = i4;
                paddingLeft = i3;
                paddingRight = i10;
            }
        }
        if (this.W != null) {
            this.W.a(i2, f2);
        }
        if (this.aa != null) {
            this.aa.a(i2, f2);
        }
        if (this.ac != null) {
            getScrollX();
            int childCount2 = getChildCount();
            for (int i11 = 0; i11 < childCount2; i11++) {
                View childAt2 = getChildAt(i11);
                if (!((c) childAt2.getLayoutParams()).a) {
                    childAt2.getLeft();
                    getClientWidth();
                }
            }
        }
        this.U = true;
    }

    private void a(boolean z2) {
        boolean z3 = this.ai == 2;
        if (z3) {
            setScrollingCacheEnabled(false);
            this.m.abortAnimation();
            int scrollX = getScrollX();
            int scrollY = getScrollY();
            int currX = this.m.getCurrX();
            int currY = this.m.getCurrY();
            if (!(scrollX == currX && scrollY == currY)) {
                scrollTo(currX, currY);
            }
        }
        this.y = false;
        boolean z4 = z3;
        for (int i2 = 0; i2 < this.e.size(); i2++) {
            b bVar = this.e.get(i2);
            if (bVar.c) {
                bVar.c = false;
                z4 = true;
            }
        }
        if (!z4) {
            return;
        }
        if (z2) {
            u.a((View) this, this.ah);
        } else {
            this.ah.run();
        }
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean z2;
        int action = motionEvent.getAction() & 255;
        if (action == 3 || action == 1) {
            this.A = false;
            this.B = false;
            this.J = -1;
            if (this.K == null) {
                return false;
            }
            this.K.recycle();
            this.K = null;
            return false;
        }
        if (action != 0) {
            if (this.A) {
                return true;
            }
            if (this.B) {
                return false;
            }
        }
        switch (action) {
            case 0:
                float x2 = motionEvent.getX();
                this.H = x2;
                this.F = x2;
                float y2 = motionEvent.getY();
                this.I = y2;
                this.G = y2;
                this.J = n.b(motionEvent, 0);
                this.B = false;
                this.m.computeScrollOffset();
                if (this.ai == 2 && Math.abs(this.m.getFinalX() - this.m.getCurrX()) > this.O) {
                    this.m.abortAnimation();
                    this.y = false;
                    b();
                    this.A = true;
                    f();
                    setScrollState(1);
                    break;
                } else {
                    a(false);
                    this.A = false;
                    break;
                }
                break;
            case 2:
                int i2 = this.J;
                if (i2 != -1) {
                    int a2 = n.a(motionEvent, i2);
                    float c2 = n.c(motionEvent, a2);
                    float f2 = c2 - this.F;
                    float abs = Math.abs(f2);
                    float d2 = n.d(motionEvent, a2);
                    float abs2 = Math.abs(d2 - this.I);
                    if (f2 != 0.0f) {
                        float f3 = this.F;
                        if ((f3 >= ((float) this.D) || f2 <= 0.0f) && (f3 <= ((float) (getWidth() - this.D)) || f2 >= 0.0f)) {
                            z2 = false;
                        } else {
                            z2 = true;
                        }
                        if (!z2) {
                            if (a(this, false, (int) f2, (int) c2, (int) d2)) {
                                this.F = c2;
                                this.G = d2;
                                this.B = true;
                                return false;
                            }
                        }
                    }
                    if (abs > ((float) this.E) && 0.5f * abs > abs2) {
                        this.A = true;
                        f();
                        setScrollState(1);
                        this.F = f2 > 0.0f ? this.H + ((float) this.E) : this.H - ((float) this.E);
                        this.G = d2;
                        setScrollingCacheEnabled(true);
                    } else if (abs2 > ((float) this.E)) {
                        this.B = true;
                    }
                    if (this.A && a(c2)) {
                        u.b(this);
                        break;
                    }
                }
                break;
            case 6:
                a(motionEvent);
                break;
        }
        if (this.K == null) {
            this.K = VelocityTracker.obtain();
        }
        this.K.addMovement(motionEvent);
        return this.A;
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        int i2;
        float f2;
        boolean z2 = false;
        if (this.P) {
            return true;
        }
        if (motionEvent.getAction() == 0 && motionEvent.getEdgeFlags() != 0) {
            return false;
        }
        if (this.h == null || this.h.b() == 0) {
            return false;
        }
        if (this.K == null) {
            this.K = VelocityTracker.obtain();
        }
        this.K.addMovement(motionEvent);
        switch (motionEvent.getAction() & 255) {
            case 0:
                this.m.abortAnimation();
                this.y = false;
                b();
                float x2 = motionEvent.getX();
                this.H = x2;
                this.F = x2;
                float y2 = motionEvent.getY();
                this.I = y2;
                this.G = y2;
                this.J = n.b(motionEvent, 0);
                break;
            case 1:
                if (this.A) {
                    VelocityTracker velocityTracker = this.K;
                    velocityTracker.computeCurrentVelocity(1000, (float) this.M);
                    int a2 = (int) s.a(velocityTracker, this.J);
                    this.y = true;
                    int clientWidth = getClientWidth();
                    int scrollX = getScrollX();
                    b g2 = g();
                    int i3 = g2.b;
                    float f3 = ((((float) scrollX) / ((float) clientWidth)) - g2.e) / g2.d;
                    if (Math.abs((int) (n.c(motionEvent, n.a(motionEvent, this.J)) - this.H)) <= this.N || Math.abs(a2) <= this.L) {
                        i2 = (int) (((float) i3) + f3 + (i3 >= this.i ? 0.4f : 0.6f));
                    } else {
                        if (a2 <= 0) {
                            i3++;
                        }
                        i2 = i3;
                    }
                    if (this.e.size() > 0) {
                        i2 = Math.max(this.e.get(0).b, Math.min(i2, this.e.get(this.e.size() - 1).b));
                    }
                    a(i2, true, true, a2);
                    this.J = -1;
                    h();
                    z2 = this.Q.c() | this.R.c();
                    break;
                }
                break;
            case 2:
                if (!this.A) {
                    int a3 = n.a(motionEvent, this.J);
                    float c2 = n.c(motionEvent, a3);
                    float abs = Math.abs(c2 - this.F);
                    float d2 = n.d(motionEvent, a3);
                    float abs2 = Math.abs(d2 - this.G);
                    if (abs > ((float) this.E) && abs > abs2) {
                        this.A = true;
                        f();
                        if (c2 - this.H > 0.0f) {
                            f2 = this.H + ((float) this.E);
                        } else {
                            f2 = this.H - ((float) this.E);
                        }
                        this.F = f2;
                        this.G = d2;
                        setScrollState(1);
                        setScrollingCacheEnabled(true);
                        ViewParent parent = getParent();
                        if (parent != null) {
                            parent.requestDisallowInterceptTouchEvent(true);
                        }
                    }
                }
                if (this.A) {
                    z2 = a(n.c(motionEvent, n.a(motionEvent, this.J))) | false;
                    break;
                }
                break;
            case 3:
                if (this.A) {
                    a(this.i, true, 0, false);
                    this.J = -1;
                    h();
                    z2 = this.Q.c() | this.R.c();
                    break;
                }
                break;
            case 5:
                int b2 = n.b(motionEvent);
                this.F = n.c(motionEvent, b2);
                this.J = n.b(motionEvent, b2);
                break;
            case 6:
                a(motionEvent);
                this.F = n.c(motionEvent, n.a(motionEvent, this.J));
                break;
        }
        if (z2) {
            u.b(this);
        }
        return true;
    }

    private void f() {
        ViewParent parent = getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(true);
        }
    }

    private boolean a(float f2) {
        boolean z2;
        float f3;
        boolean z3 = true;
        boolean z4 = false;
        this.F = f2;
        float scrollX = ((float) getScrollX()) + (this.F - f2);
        int clientWidth = getClientWidth();
        float f4 = ((float) clientWidth) * this.s;
        float f5 = ((float) clientWidth) * this.t;
        b bVar = this.e.get(0);
        b bVar2 = this.e.get(this.e.size() - 1);
        if (bVar.b != 0) {
            f4 = bVar.e * ((float) clientWidth);
            z2 = false;
        } else {
            z2 = true;
        }
        if (bVar2.b != this.h.b() - 1) {
            f3 = bVar2.e * ((float) clientWidth);
            z3 = false;
        } else {
            f3 = f5;
        }
        if (scrollX < f4) {
            if (z2) {
                z4 = this.Q.a(Math.abs(f4 - scrollX) / ((float) clientWidth));
            }
        } else if (scrollX > f3) {
            if (z3) {
                z4 = this.R.a(Math.abs(scrollX - f3) / ((float) clientWidth));
            }
            f4 = f3;
        } else {
            f4 = scrollX;
        }
        this.F += f4 - ((float) ((int) f4));
        scrollTo((int) f4, getScrollY());
        c((int) f4);
        return z4;
    }

    private b g() {
        float f2;
        int i2;
        b bVar;
        int clientWidth = getClientWidth();
        float scrollX = clientWidth > 0 ? ((float) getScrollX()) / ((float) clientWidth) : 0.0f;
        if (clientWidth > 0) {
            f2 = ((float) this.o) / ((float) clientWidth);
        } else {
            f2 = 0.0f;
        }
        float f3 = 0.0f;
        float f4 = 0.0f;
        int i3 = -1;
        int i4 = 0;
        boolean z2 = true;
        b bVar2 = null;
        while (i4 < this.e.size()) {
            b bVar3 = this.e.get(i4);
            if (z2 || bVar3.b == i3 + 1) {
                b bVar4 = bVar3;
                i2 = i4;
                bVar = bVar4;
            } else {
                b bVar5 = this.f;
                bVar5.e = f3 + f4 + f2;
                bVar5.b = i3 + 1;
                bVar5.d = 1.0f;
                b bVar6 = bVar5;
                i2 = i4 - 1;
                bVar = bVar6;
            }
            float f5 = bVar.e;
            float f6 = bVar.d + f5 + f2;
            if (!z2 && scrollX < f5) {
                return bVar2;
            }
            if (scrollX < f6 || i2 == this.e.size() - 1) {
                return bVar;
            }
            f4 = f5;
            i3 = bVar.b;
            z2 = false;
            f3 = bVar.d;
            bVar2 = bVar;
            i4 = i2 + 1;
        }
        return bVar2;
    }

    public void draw(Canvas canvas) {
        super.draw(canvas);
        boolean z2 = false;
        int a2 = u.a(this);
        if (a2 == 0 || (a2 == 1 && this.h != null && this.h.b() > 1)) {
            if (!this.Q.a()) {
                int save = canvas.save();
                int height = (getHeight() - getPaddingTop()) - getPaddingBottom();
                int width = getWidth();
                canvas.rotate(270.0f);
                canvas.translate((float) ((-height) + getPaddingTop()), this.s * ((float) width));
                this.Q.a(height, width);
                z2 = this.Q.a(canvas) | false;
                canvas.restoreToCount(save);
            }
            if (!this.R.a()) {
                int save2 = canvas.save();
                int width2 = getWidth();
                int height2 = (getHeight() - getPaddingTop()) - getPaddingBottom();
                canvas.rotate(90.0f);
                canvas.translate((float) (-getPaddingTop()), (-(this.t + 1.0f)) * ((float) width2));
                this.R.a(height2, width2);
                z2 |= this.R.a(canvas);
                canvas.restoreToCount(save2);
            }
        } else {
            this.Q.b();
            this.R.b();
        }
        if (z2) {
            u.b(this);
        }
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        float f2;
        super.onDraw(canvas);
        if (this.o > 0 && this.p != null && this.e.size() > 0 && this.h != null) {
            int scrollX = getScrollX();
            int width = getWidth();
            float f3 = ((float) this.o) / ((float) width);
            b bVar = this.e.get(0);
            float f4 = bVar.e;
            int size = this.e.size();
            int i2 = bVar.b;
            int i3 = this.e.get(size - 1).b;
            int i4 = 0;
            int i5 = i2;
            while (i5 < i3) {
                while (i5 > bVar.b && i4 < size) {
                    i4++;
                    bVar = this.e.get(i4);
                }
                if (i5 == bVar.b) {
                    f2 = (bVar.e + bVar.d) * ((float) width);
                    f4 = bVar.e + bVar.d + f3;
                } else {
                    f2 = (1.0f + f4) * ((float) width);
                    f4 += 1.0f + f3;
                }
                if (((float) this.o) + f2 > ((float) scrollX)) {
                    this.p.setBounds((int) f2, this.q, (int) (((float) this.o) + f2 + 0.5f), this.r);
                    this.p.draw(canvas);
                }
                if (f2 <= ((float) (scrollX + width))) {
                    i5++;
                } else {
                    return;
                }
            }
        }
    }

    private void a(MotionEvent motionEvent) {
        int b2 = n.b(motionEvent);
        if (n.b(motionEvent, b2) == this.J) {
            int i2 = b2 == 0 ? 1 : 0;
            this.F = n.c(motionEvent, i2);
            this.J = n.b(motionEvent, i2);
            if (this.K != null) {
                this.K.clear();
            }
        }
    }

    private void h() {
        this.A = false;
        this.B = false;
        if (this.K != null) {
            this.K.recycle();
            this.K = null;
        }
    }

    private void setScrollingCacheEnabled(boolean z2) {
        if (this.x != z2) {
            this.x = z2;
        }
    }

    public boolean canScrollHorizontally(int i2) {
        if (this.h == null) {
            return false;
        }
        int clientWidth = getClientWidth();
        int scrollX = getScrollX();
        if (i2 < 0) {
            if (scrollX > ((int) (((float) clientWidth) * this.s))) {
                return true;
            }
            return false;
        } else if (i2 <= 0 || scrollX >= ((int) (((float) clientWidth) * this.t))) {
            return false;
        } else {
            return true;
        }
    }

    private boolean a(View view, boolean z2, int i2, int i3, int i4) {
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int scrollX = view.getScrollX();
            int scrollY = view.getScrollY();
            for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                View childAt = viewGroup.getChildAt(childCount);
                if (i3 + scrollX >= childAt.getLeft() && i3 + scrollX < childAt.getRight() && i4 + scrollY >= childAt.getTop() && i4 + scrollY < childAt.getBottom()) {
                    if (a(childAt, true, i2, (i3 + scrollX) - childAt.getLeft(), (i4 + scrollY) - childAt.getTop())) {
                        return true;
                    }
                }
            }
        }
        if (!z2 || !u.a(view, -i2)) {
            return false;
        }
        return true;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean dispatchKeyEvent(android.view.KeyEvent r5) {
        /*
            r4 = this;
            r1 = 1
            r0 = 0
            boolean r2 = super.dispatchKeyEvent(r5)
            if (r2 != 0) goto L_0x0018
            int r2 = r5.getAction()
            if (r2 != 0) goto L_0x0015
            int r2 = r5.getKeyCode()
            switch(r2) {
                case 21: goto L_0x001a;
                case 22: goto L_0x0021;
                case 61: goto L_0x0028;
                default: goto L_0x0015;
            }
        L_0x0015:
            r2 = r0
        L_0x0016:
            if (r2 == 0) goto L_0x0019
        L_0x0018:
            r0 = r1
        L_0x0019:
            return r0
        L_0x001a:
            r2 = 17
            boolean r2 = r4.d(r2)
            goto L_0x0016
        L_0x0021:
            r2 = 66
            boolean r2 = r4.d(r2)
            goto L_0x0016
        L_0x0028:
            int r2 = android.os.Build.VERSION.SDK_INT
            r3 = 11
            if (r2 < r3) goto L_0x0015
            boolean r2 = android.support.v4.view.g.b(r5)
            if (r2 == 0) goto L_0x003a
            r2 = 2
            boolean r2 = r4.d(r2)
            goto L_0x0016
        L_0x003a:
            boolean r2 = android.support.v4.view.g.a(r5)
            if (r2 == 0) goto L_0x0015
            boolean r2 = r4.d(r1)
            goto L_0x0016
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v4.view.ViewPager.dispatchKeyEvent(android.view.KeyEvent):boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00ca, code lost:
        if (r10 != 2) goto L_0x0035;
     */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0037  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00dc  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00e6  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean d(int r10) {
        /*
            r9 = this;
            r1 = 0
            r8 = 66
            r7 = 17
            r4 = 0
            r3 = 1
            android.view.View r2 = r9.findFocus()
            if (r2 != r9) goto L_0x003f
            r0 = r1
        L_0x000e:
            android.view.FocusFinder r1 = android.view.FocusFinder.getInstance()
            android.view.View r1 = r1.findNextFocus(r9, r0, r10)
            if (r1 == 0) goto L_0x00bd
            if (r1 == r0) goto L_0x00bd
            if (r10 != r7) goto L_0x00a1
            android.graphics.Rect r2 = r9.g
            android.graphics.Rect r2 = r9.a((android.graphics.Rect) r2, (android.view.View) r1)
            int r2 = r2.left
            android.graphics.Rect r3 = r9.g
            android.graphics.Rect r3 = r9.a((android.graphics.Rect) r3, (android.view.View) r0)
            int r3 = r3.left
            if (r0 == 0) goto L_0x009c
            if (r2 < r3) goto L_0x009c
            boolean r0 = r9.i()
        L_0x0034:
            r4 = r0
        L_0x0035:
            if (r4 == 0) goto L_0x003e
            int r0 = android.view.SoundEffectConstants.getContantForFocusDirection(r10)
            r9.playSoundEffect(r0)
        L_0x003e:
            return r4
        L_0x003f:
            if (r2 == 0) goto L_0x00e9
            android.view.ViewParent r0 = r2.getParent()
        L_0x0045:
            boolean r5 = r0 instanceof android.view.ViewGroup
            if (r5 == 0) goto L_0x00ec
            if (r0 != r9) goto L_0x007c
            r0 = r3
        L_0x004c:
            if (r0 != 0) goto L_0x00e9
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.Class r0 = r2.getClass()
            java.lang.String r0 = r0.getSimpleName()
            r5.append(r0)
            android.view.ViewParent r0 = r2.getParent()
        L_0x0062:
            boolean r2 = r0 instanceof android.view.ViewGroup
            if (r2 == 0) goto L_0x0081
            java.lang.String r2 = " => "
            java.lang.StringBuilder r2 = r5.append(r2)
            java.lang.Class r6 = r0.getClass()
            java.lang.String r6 = r6.getSimpleName()
            r2.append(r6)
            android.view.ViewParent r0 = r0.getParent()
            goto L_0x0062
        L_0x007c:
            android.view.ViewParent r0 = r0.getParent()
            goto L_0x0045
        L_0x0081:
            java.lang.String r0 = "ViewPager"
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r6 = "arrowScroll tried to find focus based on non-child current focused view "
            r2.<init>(r6)
            java.lang.String r5 = r5.toString()
            java.lang.StringBuilder r2 = r2.append(r5)
            java.lang.String r2 = r2.toString()
            android.util.Log.e(r0, r2)
            r0 = r1
            goto L_0x000e
        L_0x009c:
            boolean r0 = r1.requestFocus()
            goto L_0x0034
        L_0x00a1:
            if (r10 != r8) goto L_0x0035
            android.graphics.Rect r2 = r9.g
            android.graphics.Rect r2 = r9.a((android.graphics.Rect) r2, (android.view.View) r1)
            int r2 = r2.left
            android.graphics.Rect r5 = r9.g
            android.graphics.Rect r5 = r9.a((android.graphics.Rect) r5, (android.view.View) r0)
            int r5 = r5.left
            if (r0 == 0) goto L_0x00b7
            if (r2 <= r5) goto L_0x00cc
        L_0x00b7:
            boolean r0 = r1.requestFocus()
            goto L_0x0034
        L_0x00bd:
            if (r10 == r7) goto L_0x00c1
            if (r10 != r3) goto L_0x00c7
        L_0x00c1:
            boolean r0 = r9.i()
            goto L_0x0034
        L_0x00c7:
            if (r10 == r8) goto L_0x00cc
            r0 = 2
            if (r10 != r0) goto L_0x0035
        L_0x00cc:
            android.support.v4.view.p r0 = r9.h
            if (r0 == 0) goto L_0x00e6
            int r0 = r9.i
            android.support.v4.view.p r1 = r9.h
            int r1 = r1.b()
            int r1 = r1 + -1
            if (r0 >= r1) goto L_0x00e6
            int r0 = r9.i
            int r0 = r0 + 1
            r9.a((int) r0, (boolean) r3)
            r0 = r3
            goto L_0x0034
        L_0x00e6:
            r0 = r4
            goto L_0x0034
        L_0x00e9:
            r0 = r2
            goto L_0x000e
        L_0x00ec:
            r0 = r4
            goto L_0x004c
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v4.view.ViewPager.d(int):boolean");
    }

    private Rect a(Rect rect, View view) {
        Rect rect2;
        if (rect == null) {
            rect2 = new Rect();
        } else {
            rect2 = rect;
        }
        if (view == null) {
            rect2.set(0, 0, 0, 0);
            return rect2;
        }
        rect2.left = view.getLeft();
        rect2.right = view.getRight();
        rect2.top = view.getTop();
        rect2.bottom = view.getBottom();
        ViewParent parent = view.getParent();
        while ((parent instanceof ViewGroup) && parent != this) {
            ViewGroup viewGroup = (ViewGroup) parent;
            rect2.left += viewGroup.getLeft();
            rect2.right += viewGroup.getRight();
            rect2.top += viewGroup.getTop();
            rect2.bottom += viewGroup.getBottom();
            parent = viewGroup.getParent();
        }
        return rect2;
    }

    private boolean i() {
        if (this.i <= 0) {
            return false;
        }
        a(this.i - 1, true);
        return true;
    }

    public void addFocusables(ArrayList<View> arrayList, int i2, int i3) {
        b a2;
        int size = arrayList.size();
        int descendantFocusability = getDescendantFocusability();
        if (descendantFocusability != 393216) {
            for (int i4 = 0; i4 < getChildCount(); i4++) {
                View childAt = getChildAt(i4);
                if (childAt.getVisibility() == 0 && (a2 = a(childAt)) != null && a2.b == this.i) {
                    childAt.addFocusables(arrayList, i2, i3);
                }
            }
        }
        if ((descendantFocusability == 262144 && size != arrayList.size()) || !isFocusable()) {
            return;
        }
        if (((i3 & 1) != 1 || !isInTouchMode() || isFocusableInTouchMode()) && arrayList != null) {
            arrayList.add(this);
        }
    }

    public void addTouchables(ArrayList<View> arrayList) {
        b a2;
        for (int i2 = 0; i2 < getChildCount(); i2++) {
            View childAt = getChildAt(i2);
            if (childAt.getVisibility() == 0 && (a2 = a(childAt)) != null && a2.b == this.i) {
                childAt.addTouchables(arrayList);
            }
        }
    }

    /* access modifiers changed from: protected */
    public boolean onRequestFocusInDescendants(int i2, Rect rect) {
        int i3;
        b a2;
        int i4 = -1;
        int childCount = getChildCount();
        if ((i2 & 2) != 0) {
            i4 = 1;
            i3 = 0;
        } else {
            i3 = childCount - 1;
            childCount = -1;
        }
        while (i3 != childCount) {
            View childAt = getChildAt(i3);
            if (childAt.getVisibility() == 0 && (a2 = a(childAt)) != null && a2.b == this.i && childAt.requestFocus(i2, rect)) {
                return true;
            }
            i3 += i4;
        }
        return false;
    }

    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        b a2;
        if (accessibilityEvent.getEventType() == 4096) {
            return super.dispatchPopulateAccessibilityEvent(accessibilityEvent);
        }
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            if (childAt.getVisibility() == 0 && (a2 = a(childAt)) != null && a2.b == this.i && childAt.dispatchPopulateAccessibilityEvent(accessibilityEvent)) {
                return true;
            }
        }
        return false;
    }

    /* access modifiers changed from: protected */
    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new c();
    }

    /* access modifiers changed from: protected */
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return generateDefaultLayoutParams();
    }

    /* access modifiers changed from: protected */
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof c) && super.checkLayoutParams(layoutParams);
    }

    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new c(getContext(), attributeSet);
    }

    class d extends a {
        d() {
        }

        public final void d(View view, AccessibilityEvent accessibilityEvent) {
            super.d(view, accessibilityEvent);
            accessibilityEvent.setClassName(ViewPager.class.getName());
            android.support.v4.view.a.g a = android.support.v4.view.a.g.a();
            android.support.v4.view.a.g.a.a(a.b, a());
            if (accessibilityEvent.getEventType() == 4096 && ViewPager.this.h != null) {
                android.support.v4.view.a.g.a.b(a.b, ViewPager.this.h.b());
                android.support.v4.view.a.g.a.a(a.b, ViewPager.this.i);
                android.support.v4.view.a.g.a.c(a.b, ViewPager.this.i);
            }
        }

        public final void a(View view, android.support.v4.view.a.a aVar) {
            super.a(view, aVar);
            android.support.v4.view.a.a.a.a(aVar.b, (CharSequence) ViewPager.class.getName());
            android.support.v4.view.a.a.a.a(aVar.b, a());
            if (ViewPager.this.canScrollHorizontally(1)) {
                aVar.a(4096);
            }
            if (ViewPager.this.canScrollHorizontally(-1)) {
                aVar.a(8192);
            }
        }

        public final boolean a(View view, int i, Bundle bundle) {
            if (super.a(view, i, bundle)) {
                return true;
            }
            switch (i) {
                case 4096:
                    if (!ViewPager.this.canScrollHorizontally(1)) {
                        return false;
                    }
                    ViewPager.this.setCurrentItem(ViewPager.this.i + 1);
                    return true;
                case 8192:
                    if (!ViewPager.this.canScrollHorizontally(-1)) {
                        return false;
                    }
                    ViewPager.this.setCurrentItem(ViewPager.this.i - 1);
                    return true;
                default:
                    return false;
            }
        }

        private boolean a() {
            return ViewPager.this.h != null && ViewPager.this.h.b() > 1;
        }
    }

    private class h extends DataSetObserver {
        private h() {
        }

        /* synthetic */ h(ViewPager viewPager, byte b) {
            this();
        }

        public final void onChanged() {
            ViewPager.this.a();
        }

        public final void onInvalidated() {
            ViewPager.this.a();
        }
    }

    public static class c extends ViewGroup.LayoutParams {
        public boolean a;
        public int b;
        float c = 0.0f;
        boolean d;
        int e;
        int f;

        public c() {
            super(-1, -1);
        }

        public c(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, ViewPager.a);
            this.b = obtainStyledAttributes.getInteger(0, 48);
            obtainStyledAttributes.recycle();
        }
    }

    static class j implements Comparator<View> {
        j() {
        }

        public final /* synthetic */ int compare(Object obj, Object obj2) {
            c cVar = (c) ((View) obj).getLayoutParams();
            c cVar2 = (c) ((View) obj2).getLayoutParams();
            if (cVar.a != cVar2.a) {
                return cVar.a ? 1 : -1;
            }
            return cVar.e - cVar2.e;
        }
    }
}
