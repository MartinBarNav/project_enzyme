package android.support.v7.internal.widget;

import android.content.Context;
import android.database.DataSetObserver;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewDebug;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.widget.Adapter;

public abstract class d<T extends Adapter> extends ViewGroup {
    @ViewDebug.ExportedProperty(category = "list")
    int A;
    int B;
    int C = -1;
    long D = Long.MIN_VALUE;
    boolean E = false;
    private View a;
    private boolean b;
    private boolean c;
    private d<T>.e d;
    @ViewDebug.ExportedProperty(category = "scrolling")
    int j = 0;
    int k;
    int l;
    long m = Long.MIN_VALUE;
    long n;
    boolean o = false;
    int p;
    int q;
    boolean r = false;
    C0014d s;
    b t;
    c u;
    boolean v;
    @ViewDebug.ExportedProperty(category = "list")
    int w = -1;
    long x = Long.MIN_VALUE;
    @ViewDebug.ExportedProperty(category = "list")
    int y = -1;
    long z = Long.MIN_VALUE;

    public interface b {
    }

    public interface c {
    }

    /* renamed from: android.support.v7.internal.widget.d$d  reason: collision with other inner class name */
    public interface C0014d {
    }

    public abstract T getAdapter();

    public abstract View getSelectedView();

    public abstract void setAdapter(T t2);

    public abstract void setSelection(int i);

    d(Context context, int i) {
        super(context, (AttributeSet) null, i);
    }

    public void setOnItemClickListener(b bVar) {
        this.t = bVar;
    }

    public final b getOnItemClickListener() {
        return this.t;
    }

    public final boolean a(View view) {
        if (this.t == null) {
            return false;
        }
        playSoundEffect(0);
        if (view == null) {
            return true;
        }
        view.sendAccessibilityEvent(1);
        return true;
    }

    public void setOnItemLongClickListener(c cVar) {
        if (!isLongClickable()) {
            setLongClickable(true);
        }
        this.u = cVar;
    }

    public final c getOnItemLongClickListener() {
        return this.u;
    }

    public void setOnItemSelectedListener(C0014d dVar) {
        this.s = dVar;
    }

    public final C0014d getOnItemSelectedListener() {
        return this.s;
    }

    public void addView(View view) {
        throw new UnsupportedOperationException("addView(View) is not supported in AdapterView");
    }

    public void addView(View view, int i) {
        throw new UnsupportedOperationException("addView(View, int) is not supported in AdapterView");
    }

    public void addView(View view, ViewGroup.LayoutParams layoutParams) {
        throw new UnsupportedOperationException("addView(View, LayoutParams) is not supported in AdapterView");
    }

    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        throw new UnsupportedOperationException("addView(View, int, LayoutParams) is not supported in AdapterView");
    }

    public void removeView(View view) {
        throw new UnsupportedOperationException("removeView(View) is not supported in AdapterView");
    }

    public void removeViewAt(int i) {
        throw new UnsupportedOperationException("removeViewAt(int) is not supported in AdapterView");
    }

    public void removeAllViews() {
        throw new UnsupportedOperationException("removeAllViews() is not supported in AdapterView");
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z2, int i, int i2, int i3, int i4) {
        this.q = getHeight();
    }

    @ViewDebug.CapturedViewProperty
    public int getSelectedItemPosition() {
        return this.w;
    }

    @ViewDebug.CapturedViewProperty
    public long getSelectedItemId() {
        return this.x;
    }

    public Object getSelectedItem() {
        Adapter adapter = getAdapter();
        int selectedItemPosition = getSelectedItemPosition();
        if (adapter == null || adapter.getCount() <= 0 || selectedItemPosition < 0) {
            return null;
        }
        return adapter.getItem(selectedItemPosition);
    }

    @ViewDebug.CapturedViewProperty
    public int getCount() {
        return this.A;
    }

    public int getFirstVisiblePosition() {
        return this.j;
    }

    public int getLastVisiblePosition() {
        return (this.j + getChildCount()) - 1;
    }

    public void setEmptyView(View view) {
        this.a = view;
        Adapter adapter = getAdapter();
        a(adapter == null || adapter.isEmpty());
    }

    public View getEmptyView() {
        return this.a;
    }

    public void setFocusable(boolean z2) {
        boolean z3 = true;
        Adapter adapter = getAdapter();
        boolean z4 = adapter == null || adapter.getCount() == 0;
        this.b = z2;
        if (!z2) {
            this.c = false;
        }
        if (!z2 || z4) {
            z3 = false;
        }
        super.setFocusable(z3);
    }

    public void setFocusableInTouchMode(boolean z2) {
        boolean z3 = true;
        Adapter adapter = getAdapter();
        boolean z4 = adapter == null || adapter.getCount() == 0;
        this.c = z2;
        if (z2) {
            this.b = true;
        }
        if (!z2 || z4) {
            z3 = false;
        }
        super.setFocusableInTouchMode(z3);
    }

    /* access modifiers changed from: package-private */
    public final void b() {
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5 = false;
        Adapter adapter = getAdapter();
        if (!(adapter == null || adapter.getCount() == 0)) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (!z2 || !this.c) {
            z3 = false;
        } else {
            z3 = true;
        }
        super.setFocusableInTouchMode(z3);
        if (!z2 || !this.b) {
            z4 = false;
        } else {
            z4 = true;
        }
        super.setFocusable(z4);
        if (this.a != null) {
            if (adapter == null || adapter.isEmpty()) {
                z5 = true;
            }
            a(z5);
        }
    }

    private void a(boolean z2) {
        if (z2) {
            if (this.a != null) {
                this.a.setVisibility(0);
                setVisibility(8);
            } else {
                setVisibility(0);
            }
            if (this.v) {
                onLayout(false, getLeft(), getTop(), getRight(), getBottom());
                return;
            }
            return;
        }
        if (this.a != null) {
            this.a.setVisibility(8);
        }
        setVisibility(0);
    }

    private long a(int i) {
        Adapter adapter = getAdapter();
        if (adapter == null || i < 0) {
            return Long.MIN_VALUE;
        }
        return adapter.getItemId(i);
    }

    public void setOnClickListener(View.OnClickListener onClickListener) {
        throw new RuntimeException("Don't call setOnClickListener for an AdapterView. You probably want setOnItemClickListener instead");
    }

    /* access modifiers changed from: protected */
    public void dispatchSaveInstanceState(SparseArray<Parcelable> sparseArray) {
        dispatchFreezeSelfOnly(sparseArray);
    }

    /* access modifiers changed from: protected */
    public void dispatchRestoreInstanceState(SparseArray<Parcelable> sparseArray) {
        dispatchThawSelfOnly(sparseArray);
    }

    class a extends DataSetObserver {
        private Parcelable b = null;

        a() {
        }

        public final void onChanged() {
            d.this.v = true;
            d.this.B = d.this.A;
            d.this.A = d.this.getAdapter().getCount();
            if (!d.this.getAdapter().hasStableIds() || this.b == null || d.this.B != 0 || d.this.A <= 0) {
                d dVar = d.this;
                if (dVar.getChildCount() > 0) {
                    dVar.o = true;
                    dVar.n = (long) dVar.q;
                    if (dVar.y >= 0) {
                        View childAt = dVar.getChildAt(dVar.y - dVar.j);
                        dVar.m = dVar.x;
                        dVar.l = dVar.w;
                        if (childAt != null) {
                            dVar.k = childAt.getTop();
                        }
                        dVar.p = 0;
                    } else {
                        View childAt2 = dVar.getChildAt(0);
                        Adapter adapter = dVar.getAdapter();
                        if (dVar.j < 0 || dVar.j >= adapter.getCount()) {
                            dVar.m = -1;
                        } else {
                            dVar.m = adapter.getItemId(dVar.j);
                        }
                        dVar.l = dVar.j;
                        if (childAt2 != null) {
                            dVar.k = childAt2.getTop();
                        }
                        dVar.p = 1;
                    }
                }
            } else {
                d.this.onRestoreInstanceState(this.b);
                this.b = null;
            }
            d.this.b();
            d.this.requestLayout();
        }

        public final void onInvalidated() {
            d.this.v = true;
            if (d.this.getAdapter().hasStableIds()) {
                this.b = d.this.onSaveInstanceState();
            }
            d.this.B = d.this.A;
            d.this.A = 0;
            d.this.y = -1;
            d.this.z = Long.MIN_VALUE;
            d.this.w = -1;
            d.this.x = Long.MIN_VALUE;
            d.this.o = false;
            d.this.b();
            d.this.requestLayout();
        }
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeCallbacks(this.d);
    }

    private class e implements Runnable {
        private e() {
        }

        /* synthetic */ e(d dVar, byte b) {
            this();
        }

        public final void run() {
            if (!d.this.v) {
                d.this.a();
            } else if (d.this.getAdapter() != null) {
                d.this.post(this);
            }
        }
    }

    /* access modifiers changed from: private */
    public void a() {
        int selectedItemPosition;
        if (this.s != null && (selectedItemPosition = getSelectedItemPosition()) >= 0) {
            getSelectedView();
            getAdapter().getItemId(selectedItemPosition);
        }
    }

    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        View selectedView = getSelectedView();
        if (selectedView == null || selectedView.getVisibility() != 0 || !selectedView.dispatchPopulateAccessibilityEvent(accessibilityEvent)) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: protected */
    public boolean canAnimate() {
        return super.canAnimate() && this.A > 0;
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x005e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void c() {
        /*
            r18 = this;
            r0 = r18
            int r9 = r0.A
            r6 = 0
            if (r9 <= 0) goto L_0x00c3
            r0 = r18
            boolean r2 = r0.o
            if (r2 == 0) goto L_0x00c1
            r2 = 0
            r0 = r18
            r0.o = r2
            r0 = r18
            int r10 = r0.A
            if (r10 == 0) goto L_0x00bf
            r0 = r18
            long r12 = r0.m
            r0 = r18
            int r2 = r0.l
            r4 = -9223372036854775808
            int r3 = (r12 > r4 ? 1 : (r12 == r4 ? 0 : -1))
            if (r3 == 0) goto L_0x00bf
            r3 = 0
            int r2 = java.lang.Math.max(r3, r2)
            int r3 = r10 + -1
            int r3 = java.lang.Math.min(r3, r2)
            long r4 = android.os.SystemClock.uptimeMillis()
            r14 = 100
            long r14 = r14 + r4
            r2 = 0
            android.widget.Adapter r11 = r18.getAdapter()
            if (r11 == 0) goto L_0x00bf
            r4 = r3
            r5 = r3
        L_0x0041:
            long r16 = android.os.SystemClock.uptimeMillis()
            int r7 = (r16 > r14 ? 1 : (r16 == r14 ? 0 : -1))
            if (r7 > 0) goto L_0x00bf
            long r16 = r11.getItemId(r5)
            int r7 = (r16 > r12 ? 1 : (r16 == r12 ? 0 : -1))
            if (r7 != 0) goto L_0x0097
        L_0x0051:
            if (r5 < 0) goto L_0x00c1
            if (r5 != r5) goto L_0x00c1
            r0 = r18
            r0.setNextSelectedPositionInt(r5)
            r6 = 1
            r2 = r6
        L_0x005c:
            if (r2 != 0) goto L_0x0076
            int r3 = r18.getSelectedItemPosition()
            if (r3 < r9) goto L_0x0066
            int r3 = r9 + -1
        L_0x0066:
            if (r3 >= 0) goto L_0x0069
            r3 = 0
        L_0x0069:
            if (r3 >= 0) goto L_0x006b
        L_0x006b:
            if (r3 < 0) goto L_0x0076
            r0 = r18
            r0.setNextSelectedPositionInt(r3)
            r18.d()
            r2 = 1
        L_0x0076:
            if (r2 != 0) goto L_0x0096
            r2 = -1
            r0 = r18
            r0.y = r2
            r2 = -9223372036854775808
            r0 = r18
            r0.z = r2
            r2 = -1
            r0 = r18
            r0.w = r2
            r2 = -9223372036854775808
            r0 = r18
            r0.x = r2
            r2 = 0
            r0 = r18
            r0.o = r2
            r18.d()
        L_0x0096:
            return
        L_0x0097:
            int r7 = r10 + -1
            if (r3 != r7) goto L_0x00af
            r7 = 1
            r8 = r7
        L_0x009d:
            if (r4 != 0) goto L_0x00b2
            r7 = 1
        L_0x00a0:
            if (r8 == 0) goto L_0x00a4
            if (r7 != 0) goto L_0x00bf
        L_0x00a4:
            if (r7 != 0) goto L_0x00aa
            if (r2 == 0) goto L_0x00b4
            if (r8 != 0) goto L_0x00b4
        L_0x00aa:
            int r3 = r3 + 1
            r2 = 0
            r5 = r3
            goto L_0x0041
        L_0x00af:
            r7 = 0
            r8 = r7
            goto L_0x009d
        L_0x00b2:
            r7 = 0
            goto L_0x00a0
        L_0x00b4:
            if (r8 != 0) goto L_0x00ba
            if (r2 != 0) goto L_0x0041
            if (r7 != 0) goto L_0x0041
        L_0x00ba:
            int r4 = r4 + -1
            r2 = 1
            r5 = r4
            goto L_0x0041
        L_0x00bf:
            r5 = -1
            goto L_0x0051
        L_0x00c1:
            r2 = r6
            goto L_0x005c
        L_0x00c3:
            r2 = r6
            goto L_0x0076
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.internal.widget.d.c():void");
    }

    /* access modifiers changed from: package-private */
    public final void d() {
        if (this.y != this.C || this.z != this.D) {
            if (this.s != null) {
                if (this.r || this.E) {
                    if (this.d == null) {
                        this.d = new e(this, (byte) 0);
                    }
                    post(this.d);
                } else {
                    a();
                }
            }
            if (this.y != -1 && isShown() && !isInTouchMode()) {
                sendAccessibilityEvent(4);
            }
            this.C = this.y;
            this.D = this.z;
        }
    }

    /* access modifiers changed from: package-private */
    public void setSelectedPositionInt(int i) {
        this.y = i;
        this.z = a(i);
    }

    /* access modifiers changed from: package-private */
    public void setNextSelectedPositionInt(int i) {
        this.w = i;
        this.x = a(i);
        if (this.o && this.p == 0 && i >= 0) {
            this.l = i;
            this.m = this.x;
        }
    }
}
