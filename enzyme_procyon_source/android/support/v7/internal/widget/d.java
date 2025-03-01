// 
// Decompiled by Procyon v0.5.36
// 

package android.support.v7.internal.widget;

import android.database.DataSetObserver;
import android.view.View$OnClickListener;
import android.view.ViewDebug$CapturedViewProperty;
import android.util.SparseArray;
import android.view.accessibility.AccessibilityEvent;
import android.os.SystemClock;
import android.view.ViewGroup$LayoutParams;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.content.Context;
import android.view.View;
import android.view.ViewDebug$ExportedProperty;
import android.view.ViewGroup;
import android.widget.Adapter;

public abstract class d<T extends Adapter> extends ViewGroup
{
    @ViewDebug$ExportedProperty(category = "list")
    int A;
    int B;
    int C;
    long D;
    boolean E;
    private View a;
    private boolean b;
    private boolean c;
    private e d;
    @ViewDebug$ExportedProperty(category = "scrolling")
    int j;
    int k;
    int l;
    long m;
    long n;
    boolean o;
    int p;
    int q;
    boolean r;
    d s;
    b t;
    c u;
    boolean v;
    @ViewDebug$ExportedProperty(category = "list")
    int w;
    long x;
    @ViewDebug$ExportedProperty(category = "list")
    int y;
    long z;
    
    d(final Context context, final int n) {
        super(context, (AttributeSet)null, n);
        this.j = 0;
        this.m = Long.MIN_VALUE;
        this.o = false;
        this.r = false;
        this.w = -1;
        this.x = Long.MIN_VALUE;
        this.y = -1;
        this.z = Long.MIN_VALUE;
        this.C = -1;
        this.D = Long.MIN_VALUE;
        this.E = false;
    }
    
    private long a(final int n) {
        final Adapter adapter = this.getAdapter();
        long itemId;
        if (adapter == null || n < 0) {
            itemId = Long.MIN_VALUE;
        }
        else {
            itemId = adapter.getItemId(n);
        }
        return itemId;
    }
    
    static /* synthetic */ Parcelable a(final d d) {
        return d.onSaveInstanceState();
    }
    
    private void a() {
        if (this.s != null) {
            final int selectedItemPosition = this.getSelectedItemPosition();
            if (selectedItemPosition >= 0) {
                this.getSelectedView();
                this.getAdapter().getItemId(selectedItemPosition);
            }
        }
    }
    
    static /* synthetic */ void a(final d d, final Parcelable parcelable) {
        d.onRestoreInstanceState(parcelable);
    }
    
    private void a(final boolean b) {
        if (b) {
            if (this.a != null) {
                this.a.setVisibility(0);
                this.setVisibility(8);
            }
            else {
                this.setVisibility(0);
            }
            if (this.v) {
                this.onLayout(false, this.getLeft(), this.getTop(), this.getRight(), this.getBottom());
            }
        }
        else {
            if (this.a != null) {
                this.a.setVisibility(8);
            }
            this.setVisibility(0);
        }
    }
    
    public final boolean a(final View view) {
        final boolean b = true;
        boolean b2;
        if (this.t != null) {
            this.playSoundEffect(0);
            b2 = b;
            if (view != null) {
                view.sendAccessibilityEvent(1);
                b2 = b;
            }
        }
        else {
            b2 = false;
        }
        return b2;
    }
    
    public void addView(final View view) {
        throw new UnsupportedOperationException("addView(View) is not supported in AdapterView");
    }
    
    public void addView(final View view, final int n) {
        throw new UnsupportedOperationException("addView(View, int) is not supported in AdapterView");
    }
    
    public void addView(final View view, final int n, final ViewGroup$LayoutParams viewGroup$LayoutParams) {
        throw new UnsupportedOperationException("addView(View, int, LayoutParams) is not supported in AdapterView");
    }
    
    public void addView(final View view, final ViewGroup$LayoutParams viewGroup$LayoutParams) {
        throw new UnsupportedOperationException("addView(View, LayoutParams) is not supported in AdapterView");
    }
    
    final void b() {
        final boolean b = false;
        final Adapter adapter = this.getAdapter();
        int n;
        if (adapter == null || adapter.getCount() == 0) {
            n = 1;
        }
        else {
            n = 0;
        }
        boolean b2;
        if (n == 0) {
            b2 = true;
        }
        else {
            b2 = false;
        }
        super.setFocusableInTouchMode(b2 && this.c);
        super.setFocusable(b2 && this.b);
        if (this.a != null) {
            boolean b3 = false;
            Label_0094: {
                if (adapter != null) {
                    b3 = b;
                    if (!adapter.isEmpty()) {
                        break Label_0094;
                    }
                }
                b3 = true;
            }
            this.a(b3);
        }
    }
    
    final void c() {
        final int a = this.A;
        int n6 = 0;
        Label_0208: {
            if (a > 0) {
            Label_0139:
                while (true) {
                    Label_0350: {
                        if (this.o) {
                            this.o = false;
                            final int a2 = this.A;
                        Label_0125:
                            while (true) {
                                Label_0344: {
                                    if (a2 == 0) {
                                        break Label_0344;
                                    }
                                    final long m = this.m;
                                    final int l = this.l;
                                    if (m == Long.MIN_VALUE) {
                                        break Label_0344;
                                    }
                                    final int min = Math.min(a2 - 1, Math.max(0, l));
                                    final long uptimeMillis = SystemClock.uptimeMillis();
                                    final int n = 0;
                                    final Adapter adapter = this.getAdapter();
                                    if (adapter != null) {
                                        int n2 = min;
                                        int nextSelectedPositionInt = min;
                                        int n3 = min;
                                        int n4 = n;
                                        while (SystemClock.uptimeMillis() <= 100L + uptimeMillis) {
                                            if (adapter.getItemId(nextSelectedPositionInt) == m) {
                                                break Label_0125;
                                            }
                                            boolean b;
                                            if (n3 == a2 - 1) {
                                                b = true;
                                            }
                                            else {
                                                b = false;
                                            }
                                            boolean b2;
                                            if (n2 == 0) {
                                                b2 = true;
                                            }
                                            else {
                                                b2 = false;
                                            }
                                            if (b && b2) {
                                                break;
                                            }
                                            if (b2 || (n4 != 0 && !b)) {
                                                ++n3;
                                                n4 = 0;
                                                nextSelectedPositionInt = n3;
                                            }
                                            else {
                                                if (!b && (n4 != 0 || b2)) {
                                                    continue;
                                                }
                                                --n2;
                                                n4 = 1;
                                                nextSelectedPositionInt = n2;
                                            }
                                        }
                                    }
                                    break Label_0344;
                                    int nextSelectedPositionInt = 0;
                                    if (nextSelectedPositionInt >= 0) {
                                        this.setNextSelectedPositionInt(nextSelectedPositionInt);
                                        final int n5 = 1;
                                        break Label_0139;
                                    }
                                    break Label_0350;
                                }
                                int nextSelectedPositionInt = -1;
                                continue Label_0125;
                            }
                        }
                        break Label_0350;
                        int n5 = 0;
                        n6 = n5;
                        if (n5 != 0) {
                            break Label_0208;
                        }
                        int selectedItemPosition;
                        if ((selectedItemPosition = this.getSelectedItemPosition()) >= a) {
                            selectedItemPosition = a - 1;
                        }
                        int nextSelectedPositionInt2;
                        if ((nextSelectedPositionInt2 = selectedItemPosition) < 0) {
                            nextSelectedPositionInt2 = 0;
                        }
                        if (nextSelectedPositionInt2 < 0) {}
                        n6 = n5;
                        if (nextSelectedPositionInt2 >= 0) {
                            this.setNextSelectedPositionInt(nextSelectedPositionInt2);
                            this.d();
                            n6 = 1;
                        }
                        break Label_0208;
                    }
                    final int n5 = 0;
                    continue Label_0139;
                }
            }
            n6 = 0;
        }
        if (n6 == 0) {
            this.y = -1;
            this.z = Long.MIN_VALUE;
            this.w = -1;
            this.x = Long.MIN_VALUE;
            this.o = false;
            this.d();
        }
    }
    
    protected boolean canAnimate() {
        return super.canAnimate() && this.A > 0;
    }
    
    final void d() {
        if (this.y != this.C || this.z != this.D) {
            if (this.s != null) {
                if (this.r || this.E) {
                    if (this.d == null) {
                        this.d = new e((byte)0);
                    }
                    this.post((Runnable)this.d);
                }
                else {
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
    
    public boolean dispatchPopulateAccessibilityEvent(final AccessibilityEvent accessibilityEvent) {
        final View selectedView = this.getSelectedView();
        return selectedView != null && selectedView.getVisibility() == 0 && selectedView.dispatchPopulateAccessibilityEvent(accessibilityEvent);
    }
    
    protected void dispatchRestoreInstanceState(final SparseArray<Parcelable> sparseArray) {
        this.dispatchThawSelfOnly((SparseArray)sparseArray);
    }
    
    protected void dispatchSaveInstanceState(final SparseArray<Parcelable> sparseArray) {
        this.dispatchFreezeSelfOnly((SparseArray)sparseArray);
    }
    
    public abstract T getAdapter();
    
    @ViewDebug$CapturedViewProperty
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
    
    public Object getSelectedItem() {
        final Adapter adapter = this.getAdapter();
        final int selectedItemPosition = this.getSelectedItemPosition();
        Object item;
        if (adapter != null && adapter.getCount() > 0 && selectedItemPosition >= 0) {
            item = adapter.getItem(selectedItemPosition);
        }
        else {
            item = null;
        }
        return item;
    }
    
    @ViewDebug$CapturedViewProperty
    public long getSelectedItemId() {
        return this.x;
    }
    
    @ViewDebug$CapturedViewProperty
    public int getSelectedItemPosition() {
        return this.w;
    }
    
    public abstract View getSelectedView();
    
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.removeCallbacks((Runnable)this.d);
    }
    
    protected void onLayout(final boolean b, final int n, final int n2, final int n3, final int n4) {
        this.q = this.getHeight();
    }
    
    public void removeAllViews() {
        throw new UnsupportedOperationException("removeAllViews() is not supported in AdapterView");
    }
    
    public void removeView(final View view) {
        throw new UnsupportedOperationException("removeView(View) is not supported in AdapterView");
    }
    
    public void removeViewAt(final int n) {
        throw new UnsupportedOperationException("removeViewAt(int) is not supported in AdapterView");
    }
    
    public abstract void setAdapter(final T p0);
    
    public void setEmptyView(final View a) {
        this.a = a;
        final Adapter adapter = this.getAdapter();
        this.a(adapter == null || adapter.isEmpty());
    }
    
    public void setFocusable(final boolean b) {
        final boolean b2 = true;
        final Adapter adapter = this.getAdapter();
        boolean b3;
        if (adapter == null || adapter.getCount() == 0) {
            b3 = true;
        }
        else {
            b3 = false;
        }
        if (!(this.b = b)) {
            this.c = false;
        }
        super.setFocusable(b && !b3 && b2);
    }
    
    public void setFocusableInTouchMode(final boolean c) {
        final boolean b = true;
        final Adapter adapter = this.getAdapter();
        boolean b2;
        if (adapter == null || adapter.getCount() == 0) {
            b2 = true;
        }
        else {
            b2 = false;
        }
        this.c = c;
        if (c) {
            this.b = true;
        }
        super.setFocusableInTouchMode(c && !b2 && b);
    }
    
    void setNextSelectedPositionInt(final int n) {
        this.w = n;
        this.x = this.a(n);
        if (this.o && this.p == 0 && n >= 0) {
            this.l = n;
            this.m = this.x;
        }
    }
    
    public void setOnClickListener(final View$OnClickListener view$OnClickListener) {
        throw new RuntimeException("Don't call setOnClickListener for an AdapterView. You probably want setOnItemClickListener instead");
    }
    
    public void setOnItemClickListener(final b t) {
        this.t = t;
    }
    
    public void setOnItemLongClickListener(final c u) {
        if (!this.isLongClickable()) {
            this.setLongClickable(true);
        }
        this.u = u;
    }
    
    public void setOnItemSelectedListener(final d s) {
        this.s = s;
    }
    
    void setSelectedPositionInt(final int y) {
        this.y = y;
        this.z = this.a(y);
    }
    
    public abstract void setSelection(final int p0);
    
    final class a extends DataSetObserver
    {
        private Parcelable b;
        
        a() {
            this.b = null;
        }
        
        public final void onChanged() {
            android.support.v7.internal.widget.d.this.v = true;
            android.support.v7.internal.widget.d.this.B = android.support.v7.internal.widget.d.this.A;
            android.support.v7.internal.widget.d.this.A = android.support.v7.internal.widget.d.this.getAdapter().getCount();
            if (android.support.v7.internal.widget.d.this.getAdapter().hasStableIds() && this.b != null && android.support.v7.internal.widget.d.this.B == 0 && android.support.v7.internal.widget.d.this.A > 0) {
                android.support.v7.internal.widget.d.a(android.support.v7.internal.widget.d.this, this.b);
                this.b = null;
            }
            else {
                final d a = android.support.v7.internal.widget.d.this;
                if (a.getChildCount() > 0) {
                    a.o = true;
                    a.n = a.q;
                    if (a.y >= 0) {
                        final View child = a.getChildAt(a.y - a.j);
                        a.m = a.x;
                        a.l = a.w;
                        if (child != null) {
                            a.k = child.getTop();
                        }
                        a.p = 0;
                    }
                    else {
                        final View child2 = a.getChildAt(0);
                        final Adapter adapter = a.getAdapter();
                        if (a.j >= 0 && a.j < adapter.getCount()) {
                            a.m = adapter.getItemId(a.j);
                        }
                        else {
                            a.m = -1L;
                        }
                        a.l = a.j;
                        if (child2 != null) {
                            a.k = child2.getTop();
                        }
                        a.p = 1;
                    }
                }
            }
            android.support.v7.internal.widget.d.this.b();
            android.support.v7.internal.widget.d.this.requestLayout();
        }
        
        public final void onInvalidated() {
            android.support.v7.internal.widget.d.this.v = true;
            if (android.support.v7.internal.widget.d.this.getAdapter().hasStableIds()) {
                this.b = android.support.v7.internal.widget.d.a(android.support.v7.internal.widget.d.this);
            }
            android.support.v7.internal.widget.d.this.B = android.support.v7.internal.widget.d.this.A;
            android.support.v7.internal.widget.d.this.A = 0;
            android.support.v7.internal.widget.d.this.y = -1;
            android.support.v7.internal.widget.d.this.z = Long.MIN_VALUE;
            android.support.v7.internal.widget.d.this.w = -1;
            android.support.v7.internal.widget.d.this.x = Long.MIN_VALUE;
            android.support.v7.internal.widget.d.this.o = false;
            android.support.v7.internal.widget.d.this.b();
            android.support.v7.internal.widget.d.this.requestLayout();
        }
    }
    
    public interface b
    {
    }
    
    public interface c
    {
    }
    
    public interface d
    {
    }
    
    private final class e implements Runnable
    {
        @Override
        public final void run() {
            if (android.support.v7.internal.widget.d.this.v) {
                if (android.support.v7.internal.widget.d.this.getAdapter() != null) {
                    android.support.v7.internal.widget.d.this.post((Runnable)this);
                }
            }
            else {
                android.support.v7.internal.widget.d.this.a();
            }
        }
    }
}
