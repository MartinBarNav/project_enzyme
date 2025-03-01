// 
// Decompiled by Procyon v0.5.36
// 

package android.support.v7.internal.widget;

import android.util.SparseArray;
import android.os.Parcel;
import android.os.Parcelable$Creator;
import android.view.View$BaseSavedState;
import android.os.Parcelable;
import android.support.v4.view.u;
import android.view.ViewGroup;
import android.view.View$MeasureSpec;
import android.widget.Adapter;
import android.view.ViewGroup$LayoutParams;
import android.view.View;
import android.content.Context;
import android.graphics.Rect;
import android.database.DataSetObserver;
import android.widget.SpinnerAdapter;

abstract class AbsSpinnerCompat extends d<SpinnerAdapter>
{
    private DataSetObserver F;
    SpinnerAdapter a;
    int b;
    int c;
    int d;
    int e;
    int f;
    int g;
    final Rect h;
    final a i;
    
    AbsSpinnerCompat(final Context context, final int n) {
        super(context, n);
        this.d = 0;
        this.e = 0;
        this.f = 0;
        this.g = 0;
        this.h = new Rect();
        this.i = new a();
        this.setFocusable(true);
        this.setWillNotDraw(false);
    }
    
    static /* synthetic */ void a(final AbsSpinnerCompat absSpinnerCompat, final View view) {
        absSpinnerCompat.removeDetachedView(view, true);
    }
    
    final void a() {
        this.v = false;
        this.o = false;
        this.removeAllViewsInLayout();
        this.C = -1;
        this.D = Long.MIN_VALUE;
        this.setSelectedPositionInt(-1);
        this.setNextSelectedPositionInt(-1);
        this.invalidate();
    }
    
    public void a(final SpinnerAdapter a) {
        int n = -1;
        if (this.a != null) {
            this.a.unregisterDataSetObserver(this.F);
            this.a();
        }
        this.a = a;
        this.C = -1;
        this.D = Long.MIN_VALUE;
        if (this.a != null) {
            this.B = this.A;
            this.A = this.a.getCount();
            this.b();
            this.F = new android.support.v7.internal.widget.d.a();
            this.a.registerDataSetObserver(this.F);
            if (this.A > 0) {
                n = 0;
            }
            this.setSelectedPositionInt(n);
            this.setNextSelectedPositionInt(n);
            if (this.A == 0) {
                this.d();
            }
        }
        else {
            this.b();
            this.a();
            this.d();
        }
        this.requestLayout();
    }
    
    protected ViewGroup$LayoutParams generateDefaultLayoutParams() {
        return new ViewGroup$LayoutParams(-1, -2);
    }
    
    @Override
    public int getCount() {
        return this.A;
    }
    
    @Override
    public View getSelectedView() {
        View child;
        if (this.A > 0 && this.y >= 0) {
            child = this.getChildAt(this.y - this.j);
        }
        else {
            child = null;
        }
        return child;
    }
    
    protected void onMeasure(final int c, final int b) {
        final int mode = View$MeasureSpec.getMode(c);
        int paddingLeft = this.getPaddingLeft();
        final int paddingTop = this.getPaddingTop();
        final int paddingRight = this.getPaddingRight();
        final int paddingBottom = this.getPaddingBottom();
        final Rect h = this.h;
        int d;
        if (paddingLeft > this.d) {
            d = paddingLeft;
        }
        else {
            d = this.d;
        }
        h.left = d;
        final Rect h2 = this.h;
        int e;
        if (paddingTop > this.e) {
            e = paddingTop;
        }
        else {
            e = this.e;
        }
        h2.top = e;
        final Rect h3 = this.h;
        int f;
        if (paddingRight > this.f) {
            f = paddingRight;
        }
        else {
            f = this.f;
        }
        h3.right = f;
        final Rect h4 = this.h;
        int g;
        if (paddingBottom > this.g) {
            g = paddingBottom;
        }
        else {
            g = this.g;
        }
        h4.bottom = g;
        if (this.v) {
            this.c();
        }
        final int selectedItemPosition = this.getSelectedItemPosition();
        while (true) {
            Label_0461: {
                if (selectedItemPosition < 0 || this.a == null || selectedItemPosition >= this.a.getCount()) {
                    break Label_0461;
                }
                View view;
                if ((view = this.i.a(selectedItemPosition)) == null) {
                    view = this.a.getView(selectedItemPosition, (View)null, (ViewGroup)this);
                }
                if (view == null) {
                    break Label_0461;
                }
                this.i.a(selectedItemPosition, view);
                if (view.getLayoutParams() == null) {
                    this.E = true;
                    view.setLayoutParams(this.generateDefaultLayoutParams());
                    this.E = false;
                }
                this.measureChild(view, c, b);
                paddingLeft = view.getMeasuredHeight() + this.h.top + this.h.bottom;
                final int n = view.getMeasuredWidth() + this.h.left + this.h.right;
                final int n2 = 0;
                int a = n;
                if (n2 != 0) {
                    final int n3 = this.h.top + this.h.bottom;
                    a = n;
                    paddingLeft = n3;
                    if (mode == 0) {
                        a = this.h.left + this.h.right;
                        paddingLeft = n3;
                    }
                }
                this.setMeasuredDimension(android.support.v4.view.u.a(Math.max(a, this.getSuggestedMinimumWidth()), c, 0), android.support.v4.view.u.a(Math.max(paddingLeft, this.getSuggestedMinimumHeight()), b, 0));
                this.b = b;
                this.c = c;
                return;
            }
            final int n2 = 1;
            final int n = 0;
            continue;
        }
    }
    
    public void onRestoreInstanceState(final Parcelable parcelable) {
        final SavedState savedState = (SavedState)parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        if (savedState.a >= 0L) {
            this.v = true;
            this.o = true;
            this.m = savedState.a;
            this.l = savedState.b;
            this.p = 0;
            this.requestLayout();
        }
    }
    
    public Parcelable onSaveInstanceState() {
        final SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.a = this.getSelectedItemId();
        if (savedState.a >= 0L) {
            savedState.b = this.getSelectedItemPosition();
        }
        else {
            savedState.b = -1;
        }
        return (Parcelable)savedState;
    }
    
    public void requestLayout() {
        if (!this.E) {
            super.requestLayout();
        }
    }
    
    @Override
    public void setSelection(final int nextSelectedPositionInt) {
        this.setNextSelectedPositionInt(nextSelectedPositionInt);
        this.requestLayout();
        this.invalidate();
    }
    
    static class SavedState extends View$BaseSavedState
    {
        public static final Parcelable$Creator<SavedState> CREATOR;
        long a;
        int b;
        
        static {
            CREATOR = (Parcelable$Creator)new Parcelable$Creator<SavedState>() {};
        }
        
        SavedState(final Parcel parcel) {
            super(parcel);
            this.a = parcel.readLong();
            this.b = parcel.readInt();
        }
        
        SavedState(final Parcelable parcelable) {
            super(parcelable);
        }
        
        public String toString() {
            return "AbsSpinner.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " selectedId=" + this.a + " position=" + this.b + "}";
        }
        
        public void writeToParcel(final Parcel parcel, final int n) {
            super.writeToParcel(parcel, n);
            parcel.writeLong(this.a);
            parcel.writeInt(this.b);
        }
    }
    
    final class a
    {
        private final SparseArray<View> b;
        
        a() {
            this.b = (SparseArray<View>)new SparseArray();
        }
        
        final View a(final int n) {
            final View view = (View)this.b.get(n);
            if (view != null) {
                this.b.delete(n);
            }
            return view;
        }
        
        final void a() {
            final SparseArray<View> b = this.b;
            for (int size = b.size(), i = 0; i < size; ++i) {
                final View view = (View)b.valueAt(i);
                if (view != null) {
                    AbsSpinnerCompat.a(AbsSpinnerCompat.this, view);
                }
            }
            b.clear();
        }
        
        public final void a(final int n, final View view) {
            this.b.put(n, (Object)view);
        }
    }
}
