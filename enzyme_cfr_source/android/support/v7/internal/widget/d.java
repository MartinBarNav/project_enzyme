/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.database.DataSetObserver
 *  android.os.Parcelable
 *  android.os.SystemClock
 *  android.util.SparseArray
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.view.ViewDebug$CapturedViewProperty
 *  android.view.ViewDebug$ExportedProperty
 *  android.view.ViewGroup
 *  android.view.ViewGroup$LayoutParams
 *  android.view.accessibility.AccessibilityEvent
 *  android.widget.Adapter
 */
package android.support.v7.internal.widget;

import android.content.Context;
import android.database.DataSetObserver;
import android.os.Parcelable;
import android.os.SystemClock;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewDebug;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.widget.Adapter;

public abstract class d<T extends Adapter>
extends ViewGroup {
    @ViewDebug.ExportedProperty(category="list")
    int A;
    int B;
    int C = -1;
    long D;
    boolean E = false;
    private View a;
    private boolean b;
    private boolean c;
    private e d;
    @ViewDebug.ExportedProperty(category="scrolling")
    int j = 0;
    int k;
    int l;
    long m = Long.MIN_VALUE;
    long n;
    boolean o = false;
    int p;
    int q;
    boolean r = false;
    d s;
    b t;
    c u;
    boolean v;
    @ViewDebug.ExportedProperty(category="list")
    int w = -1;
    long x = Long.MIN_VALUE;
    @ViewDebug.ExportedProperty(category="list")
    int y = -1;
    long z = Long.MIN_VALUE;

    d(Context context, int n2) {
        super(context, null, n2);
        this.D = Long.MIN_VALUE;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private long a(int n2) {
        T t2 = this.getAdapter();
        if (t2 == null) return Long.MIN_VALUE;
        if (n2 >= 0) return t2.getItemId(n2);
        return Long.MIN_VALUE;
    }

    /*
     * Enabled aggressive block sorting
     */
    private void a() {
        if (this.s == null) {
            return;
        }
        int n2 = this.getSelectedItemPosition();
        if (n2 < 0) return;
        this.getSelectedView();
        this.getAdapter().getItemId(n2);
    }

    /*
     * Enabled aggressive block sorting
     */
    private void a(boolean bl) {
        if (bl) {
            if (this.a != null) {
                this.a.setVisibility(0);
                this.setVisibility(8);
            } else {
                this.setVisibility(0);
            }
            if (!this.v) return;
            this.onLayout(false, this.getLeft(), this.getTop(), this.getRight(), this.getBottom());
            return;
        }
        if (this.a != null) {
            this.a.setVisibility(8);
        }
        this.setVisibility(0);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final boolean a(View view) {
        boolean bl = true;
        if (this.t == null) return false;
        this.playSoundEffect(0);
        boolean bl2 = bl;
        if (view == null) return bl2;
        view.sendAccessibilityEvent(1);
        return bl;
    }

    public void addView(View view) {
        throw new UnsupportedOperationException("addView(View) is not supported in AdapterView");
    }

    public void addView(View view, int n2) {
        throw new UnsupportedOperationException("addView(View, int) is not supported in AdapterView");
    }

    public void addView(View view, int n2, ViewGroup.LayoutParams layoutParams) {
        throw new UnsupportedOperationException("addView(View, int, LayoutParams) is not supported in AdapterView");
    }

    public void addView(View view, ViewGroup.LayoutParams layoutParams) {
        throw new UnsupportedOperationException("addView(View, LayoutParams) is not supported in AdapterView");
    }

    /*
     * Enabled aggressive block sorting
     */
    final void b() {
        block2: {
            boolean bl;
            block4: {
                block3: {
                    boolean bl2 = false;
                    T t2 = this.getAdapter();
                    boolean bl3 = t2 == null || t2.getCount() == 0;
                    bl3 = !bl3;
                    bl = bl3 && this.c;
                    super.setFocusableInTouchMode(bl);
                    bl = bl3 && this.b;
                    super.setFocusable(bl);
                    if (this.a == null) break block2;
                    if (t2 == null) break block3;
                    bl = bl2;
                    if (!t2.isEmpty()) break block4;
                }
                bl = true;
            }
            this.a(bl);
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    final void c() {
        int n2;
        block14: {
            int n3;
            int n4;
            int n5;
            block11: {
                block9: {
                    block12: {
                        int n6;
                        T t2;
                        int n7;
                        long l2;
                        long l3;
                        int n8;
                        block13: {
                            block10: {
                                n5 = this.A;
                                if (n5 <= 0) break block10;
                                if (!this.o) break block11;
                                this.o = false;
                                n8 = this.A;
                                if (n8 == 0) break block12;
                                l3 = this.m;
                                n4 = this.l;
                                if (l3 == Long.MIN_VALUE) break block12;
                                n2 = Math.min(n8 - 1, Math.max(0, n4));
                                l2 = SystemClock.uptimeMillis();
                                n7 = 0;
                                t2 = this.getAdapter();
                                if (t2 == null) break block12;
                                n3 = n2;
                                n4 = n2;
                                n6 = n2;
                                n2 = n7;
                                break block13;
                            }
                            n2 = 0;
                            break block14;
                        }
                        while (SystemClock.uptimeMillis() <= 100L + l2) {
                            if (t2.getItemId(n4) != l3) {
                                n7 = n6 == n8 - 1 ? 1 : 0;
                                boolean bl = n3 == 0;
                                if (n7 != 0 && bl) break;
                                if (bl || n2 != 0 && n7 == 0) {
                                    n2 = 0;
                                    n4 = ++n6;
                                    continue;
                                }
                                if (n7 == 0 && (n2 != 0 || bl)) continue;
                                n2 = 1;
                                n4 = --n3;
                                continue;
                            }
                            break block9;
                        }
                    }
                    n4 = -1;
                }
                if (n4 >= 0) {
                    this.setNextSelectedPositionInt(n4);
                    return;
                }
            }
            n4 = 0;
            n2 = n4;
            if (n4 == 0) {
                n2 = n3 = this.getSelectedItemPosition();
                if (n3 >= n5) {
                    n2 = n5 - 1;
                }
                n3 = n2;
                if (n2 < 0) {
                    n3 = 0;
                }
                if (n3 < 0) {
                    // empty if block
                }
                n2 = n4;
                if (n3 >= 0) {
                    this.setNextSelectedPositionInt(n3);
                    this.d();
                    return;
                }
            }
        }
        if (n2 != 0) return;
        this.y = -1;
        this.z = Long.MIN_VALUE;
        this.w = -1;
        this.x = Long.MIN_VALUE;
        this.o = false;
        this.d();
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    protected boolean canAnimate() {
        if (!super.canAnimate()) return false;
        if (this.A <= 0) return false;
        return true;
    }

    /*
     * Enabled aggressive block sorting
     */
    final void d() {
        if (this.y != this.C || this.z != this.D) {
            if (this.s != null) {
                if (this.r || this.E) {
                    if (this.d == null) {
                        this.d = new e(0);
                    }
                    this.post(this.d);
                } else {
                    this.a();
                }
            }
            if (this.y != -1 && this.isShown() && !this.isInTouchMode()) {
                this.sendAccessibilityEvent(4);
            }
            this.C = this.y;
            this.D = this.z;
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        View view = this.getSelectedView();
        if (view == null) return false;
        if (view.getVisibility() != 0) return false;
        if (!view.dispatchPopulateAccessibilityEvent(accessibilityEvent)) return false;
        return true;
    }

    protected void dispatchRestoreInstanceState(SparseArray<Parcelable> sparseArray) {
        this.dispatchThawSelfOnly(sparseArray);
    }

    protected void dispatchSaveInstanceState(SparseArray<Parcelable> sparseArray) {
        this.dispatchFreezeSelfOnly(sparseArray);
    }

    public abstract T getAdapter();

    @ViewDebug.CapturedViewProperty
    public int getCount() {
        return this.A;
    }

    public View getEmptyView() {
        return this.a;
    }

    public int getFirstVisiblePosition() {
        return this.j;
    }

    public int getLastVisiblePosition() {
        return this.j + this.getChildCount() - 1;
    }

    public final b getOnItemClickListener() {
        return this.t;
    }

    public final c getOnItemLongClickListener() {
        return this.u;
    }

    public final d getOnItemSelectedListener() {
        return this.s;
    }

    /*
     * WARNING - void declaration
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public Object getSelectedItem() {
        void var1_3;
        T t2 = this.getAdapter();
        int n2 = this.getSelectedItemPosition();
        if (t2 != null && t2.getCount() > 0 && n2 >= 0) {
            Object object = t2.getItem(n2);
            return var1_3;
        }
        Object var1_4 = null;
        return var1_3;
    }

    @ViewDebug.CapturedViewProperty
    public long getSelectedItemId() {
        return this.x;
    }

    @ViewDebug.CapturedViewProperty
    public int getSelectedItemPosition() {
        return this.w;
    }

    public abstract View getSelectedView();

    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.removeCallbacks(this.d);
    }

    protected void onLayout(boolean bl, int n2, int n3, int n4, int n5) {
        this.q = this.getHeight();
    }

    public void removeAllViews() {
        throw new UnsupportedOperationException("removeAllViews() is not supported in AdapterView");
    }

    public void removeView(View view) {
        throw new UnsupportedOperationException("removeView(View) is not supported in AdapterView");
    }

    public void removeViewAt(int n2) {
        throw new UnsupportedOperationException("removeViewAt(int) is not supported in AdapterView");
    }

    public abstract void setAdapter(T var1);

    /*
     * Enabled aggressive block sorting
     */
    public void setEmptyView(View object) {
        this.a = object;
        T t2 = this.getAdapter();
        boolean bl = t2 == null || t2.isEmpty();
        this.a(bl);
    }

    /*
     * Enabled aggressive block sorting
     */
    public void setFocusable(boolean bl) {
        boolean bl2 = true;
        T t2 = this.getAdapter();
        boolean bl3 = t2 == null || t2.getCount() == 0;
        this.b = bl;
        if (!bl) {
            this.c = false;
        }
        bl = bl && !bl3 ? bl2 : false;
        super.setFocusable(bl);
    }

    /*
     * Enabled aggressive block sorting
     */
    public void setFocusableInTouchMode(boolean bl) {
        boolean bl2 = true;
        T t2 = this.getAdapter();
        boolean bl3 = t2 == null || t2.getCount() == 0;
        this.c = bl;
        if (bl) {
            this.b = true;
        }
        bl = bl && !bl3 ? bl2 : false;
        super.setFocusableInTouchMode(bl);
    }

    void setNextSelectedPositionInt(int n2) {
        this.w = n2;
        this.x = this.a(n2);
        if (this.o && this.p == 0 && n2 >= 0) {
            this.l = n2;
            this.m = this.x;
        }
    }

    public void setOnClickListener(View.OnClickListener onClickListener) {
        throw new RuntimeException("Don't call setOnClickListener for an AdapterView. You probably want setOnItemClickListener instead");
    }

    public void setOnItemClickListener(b b2) {
        this.t = b2;
    }

    public void setOnItemLongClickListener(c c2) {
        if (!this.isLongClickable()) {
            this.setLongClickable(true);
        }
        this.u = c2;
    }

    public void setOnItemSelectedListener(d d2) {
        this.s = d2;
    }

    void setSelectedPositionInt(int n2) {
        this.y = n2;
        this.z = this.a(n2);
    }

    public abstract void setSelection(int var1);

    final class a
    extends DataSetObserver {
        private Parcelable b = null;

        a() {
        }

        /*
         * Enabled aggressive block sorting
         */
        public final void onChanged() {
            d.this.v = true;
            d.this.B = d.this.A;
            d.this.A = d.this.getAdapter().getCount();
            if (d.this.getAdapter().hasStableIds() && this.b != null && d.this.B == 0 && d.this.A > 0) {
                d.this.onRestoreInstanceState(this.b);
                this.b = null;
            } else {
                d d2 = d.this;
                if (d2.getChildCount() > 0) {
                    d2.o = true;
                    d2.n = d2.q;
                    if (d2.y >= 0) {
                        View view = d2.getChildAt(d2.y - d2.j);
                        d2.m = d2.x;
                        d2.l = d2.w;
                        if (view != null) {
                            d2.k = view.getTop();
                        }
                        d2.p = 0;
                    } else {
                        View view = d2.getChildAt(0);
                        Object t2 = d2.getAdapter();
                        d2.m = d2.j >= 0 && d2.j < t2.getCount() ? t2.getItemId(d2.j) : -1L;
                        d2.l = d2.j;
                        if (view != null) {
                            d2.k = view.getTop();
                        }
                        d2.p = 1;
                    }
                }
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

    public static interface b {
    }

    public static interface c {
    }

    public static interface d {
    }

    private final class e
    implements Runnable {
        private e() {
        }

        /* synthetic */ e(byte by) {
            this();
        }

        /*
         * Enabled force condition propagation
         * Lifted jumps to return sites
         */
        @Override
        public final void run() {
            if (d.this.v) {
                if (d.this.getAdapter() != null) {
                    d.this.post(this);
                }
                return;
            }
            d.this.a();
        }
    }
}

