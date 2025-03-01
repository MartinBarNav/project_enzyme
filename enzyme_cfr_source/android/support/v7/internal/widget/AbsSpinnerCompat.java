/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.database.DataSetObserver
 *  android.graphics.Rect
 *  android.os.Parcel
 *  android.os.Parcelable
 *  android.os.Parcelable$Creator
 *  android.util.SparseArray
 *  android.view.View
 *  android.view.View$BaseSavedState
 *  android.view.View$MeasureSpec
 *  android.view.ViewGroup
 *  android.view.ViewGroup$LayoutParams
 *  android.widget.Adapter
 *  android.widget.SpinnerAdapter
 */
package android.support.v7.internal.widget;

import android.content.Context;
import android.database.DataSetObserver;
import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.view.u;
import android.support.v7.internal.widget.d;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Adapter;
import android.widget.SpinnerAdapter;

abstract class AbsSpinnerCompat
extends d<SpinnerAdapter> {
    private DataSetObserver F;
    SpinnerAdapter a;
    int b;
    int c;
    int d = 0;
    int e = 0;
    int f = 0;
    int g = 0;
    final Rect h = new Rect();
    final a i = new a();

    AbsSpinnerCompat(Context context, int n2) {
        super(context, n2);
        this.setFocusable(true);
        this.setWillNotDraw(false);
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

    /*
     * Enabled aggressive block sorting
     */
    public void a(SpinnerAdapter spinnerAdapter) {
        int n2 = -1;
        if (this.a != null) {
            this.a.unregisterDataSetObserver(this.F);
            this.a();
        }
        this.a = spinnerAdapter;
        this.C = -1;
        this.D = Long.MIN_VALUE;
        if (this.a != null) {
            this.B = this.A;
            this.A = this.a.getCount();
            this.b();
            this.F = new d.a();
            this.a.registerDataSetObserver(this.F);
            if (this.A > 0) {
                n2 = 0;
            }
            this.setSelectedPositionInt(n2);
            this.setNextSelectedPositionInt(n2);
            if (this.A == 0) {
                this.d();
            }
        } else {
            this.b();
            this.a();
            this.d();
        }
        this.requestLayout();
    }

    protected ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new ViewGroup.LayoutParams(-1, -2);
    }

    @Override
    public int getCount() {
        return this.A;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public View getSelectedView() {
        if (this.A <= 0) return null;
        if (this.y < 0) return null;
        return this.getChildAt(this.y - this.j);
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    protected void onMeasure(int var1_1, int var2_2) {
        var3_3 = View.MeasureSpec.getMode((int)var1_1);
        var4_4 = this.getPaddingLeft();
        var5_5 = this.getPaddingTop();
        var6_6 = this.getPaddingRight();
        var7_7 = this.getPaddingBottom();
        var8_8 = this.h;
        var9_9 = var4_4 > this.d ? var4_4 : this.d;
        var8_8.left = var9_9;
        var8_8 = this.h;
        var9_9 = var5_5 > this.e ? var5_5 : this.e;
        var8_8.top = var9_9;
        var8_8 = this.h;
        var9_9 = var6_6 > this.f ? var6_6 : this.f;
        var8_8.right = var9_9;
        var8_8 = this.h;
        var9_9 = var7_7 > this.g ? var7_7 : this.g;
        var8_8.bottom = var9_9;
        if (this.v) {
            this.c();
        }
        if ((var9_9 = this.getSelectedItemPosition()) < 0 || this.a == null || var9_9 >= this.a.getCount()) ** GOTO lbl-1000
        var10_10 = this.i.a(var9_9);
        var8_8 = var10_10;
        if (var10_10 == null) {
            var8_8 = this.a.getView(var9_9, null, (ViewGroup)this);
        }
        if (var8_8 != null) {
            this.i.a(var9_9, (View)var8_8);
            if (var8_8.getLayoutParams() == null) {
                this.E = true;
                var8_8.setLayoutParams(this.generateDefaultLayoutParams());
                this.E = false;
            }
            this.measureChild((View)var8_8, var1_1, var2_2);
            var4_4 = var8_8.getMeasuredHeight() + this.h.top + this.h.bottom;
            var9_9 = var8_8.getMeasuredWidth() + this.h.left + this.h.right;
            var6_6 = 0;
        } else lbl-1000:
        // 2 sources

        {
            var6_6 = 1;
            var9_9 = 0;
        }
        var7_7 = var9_9;
        if (var6_6 != 0) {
            var6_6 = this.h.top + this.h.bottom;
            var7_7 = var9_9;
            var4_4 = var6_6;
            if (var3_3 == 0) {
                var7_7 = this.h.left + this.h.right;
                var4_4 = var6_6;
            }
        }
        var4_4 = Math.max(var4_4, this.getSuggestedMinimumHeight());
        var9_9 = Math.max(var7_7, this.getSuggestedMinimumWidth());
        var4_4 = android.support.v4.view.u.a(var4_4, var2_2, 0);
        this.setMeasuredDimension(android.support.v4.view.u.a(var9_9, var1_1, 0), var4_4);
        this.b = var2_2;
        this.c = var1_1;
    }

    public void onRestoreInstanceState(Parcelable object) {
        object = (SavedState)((Object)object);
        super.onRestoreInstanceState(object.getSuperState());
        if (object.a >= 0L) {
            this.v = true;
            this.o = true;
            this.m = object.a;
            this.l = object.b;
            this.p = 0;
            this.requestLayout();
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.a = this.getSelectedItemId();
        if (savedState.a >= 0L) {
            savedState.b = this.getSelectedItemPosition();
            return savedState;
        }
        savedState.b = -1;
        return savedState;
    }

    public void requestLayout() {
        if (!this.E) {
            super.requestLayout();
        }
    }

    @Override
    public /* synthetic */ void setAdapter(Adapter adapter) {
        this.a((SpinnerAdapter)adapter);
    }

    @Override
    public void setSelection(int n2) {
        this.setNextSelectedPositionInt(n2);
        this.requestLayout();
        this.invalidate();
    }

    static class SavedState
    extends View.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new Parcelable.Creator<SavedState>(){

            public final /* synthetic */ Object createFromParcel(Parcel parcel) {
                return new SavedState(parcel);
            }
        };
        long a;
        int b;

        SavedState(Parcel parcel) {
            super(parcel);
            this.a = parcel.readLong();
            this.b = parcel.readInt();
        }

        SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        public String toString() {
            return "AbsSpinner.SavedState{" + Integer.toHexString(System.identityHashCode((Object)this)) + " selectedId=" + this.a + " position=" + this.b + "}";
        }

        public void writeToParcel(Parcel parcel, int n2) {
            super.writeToParcel(parcel, n2);
            parcel.writeLong(this.a);
            parcel.writeInt(this.b);
        }
    }

    final class a {
        private final SparseArray<View> b = new SparseArray();

        a() {
        }

        final View a(int n2) {
            View view = (View)this.b.get(n2);
            if (view != null) {
                this.b.delete(n2);
            }
            return view;
        }

        final void a() {
            SparseArray<View> sparseArray = this.b;
            int n2 = sparseArray.size();
            for (int i2 = 0; i2 < n2; ++i2) {
                View view = (View)sparseArray.valueAt(i2);
                if (view == null) continue;
                AbsSpinnerCompat.this.removeDetachedView(view, true);
            }
            sparseArray.clear();
        }

        public final void a(int n2, View view) {
            this.b.put(n2, (Object)view);
        }
    }
}

