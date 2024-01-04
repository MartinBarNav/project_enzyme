// 
// Decompiled by Procyon v0.5.36
// 

package android.support.v7.internal.widget;

import android.widget.AdapterView;
import android.widget.AdapterView$OnItemClickListener;
import android.database.DataSetObserver;
import android.app.AlertDialog$Builder;
import android.app.AlertDialog;
import android.os.Parcel;
import android.os.Parcelable$Creator;
import android.widget.Adapter;
import android.view.MotionEvent;
import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver$OnGlobalLayoutListener;
import android.os.Parcelable;
import android.graphics.drawable.Drawable;
import android.view.View$MeasureSpec;
import android.support.v4.view.e;
import android.support.v4.view.u;
import android.content.DialogInterface;
import android.widget.SpinnerAdapter;
import android.view.ViewGroup$LayoutParams;
import android.view.ViewGroup;
import android.widget.ListAdapter;
import android.view.View;
import android.util.AttributeSet;
import android.support.v7.b.a;
import android.content.Context;
import android.graphics.Rect;
import android.support.v7.widget.b;
import android.content.DialogInterface$OnClickListener;

final class SpinnerCompat extends AbsSpinnerCompat implements DialogInterface$OnClickListener
{
    int F;
    private android.support.v7.widget.b.b G;
    private d H;
    private b I;
    private int J;
    private boolean K;
    private Rect L;
    private final o M;
    
    SpinnerCompat(final Context context, final int n) {
        this(context, n, (byte)0);
    }
    
    private SpinnerCompat(final Context context, int spinner_prompt, final byte b) {
        super(context, spinner_prompt);
        this.L = new Rect();
        final q a = android.support.v7.internal.widget.q.a(context, null, android.support.v7.b.a.i.Spinner, spinner_prompt);
        this.setBackgroundDrawable(a.a(android.support.v7.b.a.i.Spinner_android_background));
        switch (a.a(android.support.v7.b.a.i.Spinner_spinnerMode, 0)) {
            case 0: {
                this.H = (d)new a((byte)0);
                break;
            }
            case 1: {
                final c h = new c(context, spinner_prompt);
                this.F = a.d(android.support.v7.b.a.i.Spinner_android_dropDownWidth, -2);
                h.b.setBackgroundDrawable(a.a(android.support.v7.b.a.i.Spinner_android_popupBackground));
                this.H = (d)h;
                this.G = new android.support.v7.widget.b.b(this) {
                    @Override
                    public final b a() {
                        return h;
                    }
                    
                    @Override
                    public final boolean b() {
                        if (!SpinnerCompat.this.H.b()) {
                            SpinnerCompat.this.H.c();
                        }
                        return true;
                    }
                };
                break;
            }
        }
        this.J = a.a(android.support.v7.b.a.i.Spinner_android_gravity, 17);
        final d h2 = this.H;
        spinner_prompt = android.support.v7.b.a.i.Spinner_prompt;
        h2.a(a.a.getString(spinner_prompt));
        this.K = a.a(android.support.v7.b.a.i.Spinner_disableChildrenWhenDisabled, false);
        a.a.recycle();
        if (this.I != null) {
            this.H.a((ListAdapter)this.I);
            this.I = null;
        }
        this.M = a.a();
    }
    
    private View a(final int n, final boolean b) {
        Label_0028: {
            if (this.v) {
                break Label_0028;
            }
            final View view = this.i.a(n);
            if (view == null) {
                break Label_0028;
            }
            this.a(view, b);
            return view;
        }
        final View view = this.a.getView(n, (View)null, (ViewGroup)this);
        this.a(view, b);
        return view;
    }
    
    private void a(final View view, final boolean b) {
        ViewGroup$LayoutParams viewGroup$LayoutParams;
        if ((viewGroup$LayoutParams = view.getLayoutParams()) == null) {
            viewGroup$LayoutParams = this.generateDefaultLayoutParams();
        }
        if (b) {
            this.addViewInLayout(view, 0, viewGroup$LayoutParams);
        }
        view.setSelected(this.hasFocus());
        if (this.K) {
            view.setEnabled(this.isEnabled());
        }
        view.measure(ViewGroup.getChildMeasureSpec(this.c, this.h.left + this.h.right, viewGroup$LayoutParams.width), ViewGroup.getChildMeasureSpec(this.b, this.h.top + this.h.bottom, viewGroup$LayoutParams.height));
        final int n = this.h.top + (this.getMeasuredHeight() - this.h.bottom - this.h.top - view.getMeasuredHeight()) / 2;
        view.layout(0, n, view.getMeasuredWidth() + 0, view.getMeasuredHeight() + n);
    }
    
    final void a(final android.support.v7.internal.widget.d.b onItemClickListener) {
        super.setOnItemClickListener(onItemClickListener);
    }
    
    @Override
    public final void a(final SpinnerAdapter spinnerAdapter) {
        super.a(spinnerAdapter);
        this.i.a();
        if (this.getContext().getApplicationInfo().targetSdkVersion >= 21 && spinnerAdapter != null && spinnerAdapter.getViewTypeCount() != 1) {
            throw new IllegalArgumentException("Spinner adapter view type count must be 1");
        }
        if (this.H != null) {
            this.H.a((ListAdapter)new b(spinnerAdapter));
        }
        else {
            this.I = new b(spinnerAdapter);
        }
    }
    
    public final int getBaseline() {
        final int n = -1;
        final View view = null;
        View view2;
        if (this.getChildCount() > 0) {
            view2 = this.getChildAt(0);
        }
        else {
            view2 = view;
            if (this.a != null) {
                view2 = view;
                if (this.a.getCount() > 0) {
                    view2 = this.a(0, false);
                    this.i.a(0, view2);
                }
            }
        }
        int n2 = n;
        if (view2 != null) {
            final int baseline = view2.getBaseline();
            n2 = n;
            if (baseline >= 0) {
                n2 = view2.getTop() + baseline;
            }
        }
        return n2;
    }
    
    public final void onClick(final DialogInterface dialogInterface, final int selection) {
        this.setSelection(selection);
        dialogInterface.dismiss();
    }
    
    protected final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.H != null && this.H.b()) {
            this.H.a();
        }
    }
    
    protected final void onLayout(final boolean b, int i, int left, int n, int n2) {
        super.onLayout(b, i, left, n, n2);
        this.r = true;
        left = this.h.left;
        n = this.getRight() - this.getLeft() - this.h.left - this.h.right;
        if (this.v) {
            this.c();
        }
        if (this.A == 0) {
            this.a();
        }
        else {
            if (this.w >= 0) {
                this.setSelectedPositionInt(this.w);
            }
            n2 = this.getChildCount();
            final AbsSpinnerCompat.a j = super.i;
            final int k = super.j;
            for (i = 0; i < n2; ++i) {
                j.a(k + i, this.getChildAt(i));
            }
            this.removeAllViewsInLayout();
            this.j = this.y;
            if (this.a != null) {
                final View a = this.a(this.y, true);
                i = a.getMeasuredWidth();
                n2 = android.support.v4.view.u.e((View)this);
                switch (android.support.v4.view.e.a(this.J, n2) & 0x7) {
                    default: {
                        i = left;
                        break;
                    }
                    case 1: {
                        i = left + n / 2 - i / 2;
                        break;
                    }
                    case 5: {
                        i = left + n - i;
                        break;
                    }
                }
                a.offsetLeftAndRight(i);
            }
            this.i.a();
            this.invalidate();
            this.d();
            this.v = false;
            this.o = false;
            this.setNextSelectedPositionInt(this.y);
        }
        this.r = false;
    }
    
    @Override
    protected final void onMeasure(final int n, int n2) {
        final int n3 = 0;
        super.onMeasure(n, n2);
        if (this.H != null && View$MeasureSpec.getMode(n) == Integer.MIN_VALUE) {
            final int measuredWidth = this.getMeasuredWidth();
            final SpinnerAdapter a = super.a;
            final Drawable background = this.getBackground();
            if (a == null) {
                n2 = n3;
            }
            else {
                final int measureSpec = View$MeasureSpec.makeMeasureSpec(0, 0);
                final int measureSpec2 = View$MeasureSpec.makeMeasureSpec(0, 0);
                n2 = Math.max(0, this.getSelectedItemPosition());
                final int min = Math.min(a.getCount(), n2 + 15);
                int i = Math.max(0, n2 - (15 - (min - n2)));
                View view = null;
                n2 = 0;
                int n4 = 0;
                while (i < min) {
                    final int itemViewType = a.getItemViewType(i);
                    if (itemViewType != n4) {
                        view = null;
                        n4 = itemViewType;
                    }
                    view = a.getView(i, view, (ViewGroup)this);
                    if (view.getLayoutParams() == null) {
                        view.setLayoutParams(new ViewGroup$LayoutParams(-2, -2));
                    }
                    view.measure(measureSpec, measureSpec2);
                    n2 = Math.max(n2, view.getMeasuredWidth());
                    ++i;
                }
                if (background != null) {
                    background.getPadding(this.L);
                    n2 += this.L.left + this.L.right;
                }
            }
            this.setMeasuredDimension(Math.min(Math.max(measuredWidth, n2), View$MeasureSpec.getSize(n)), this.getMeasuredHeight());
        }
    }
    
    @Override
    public final void onRestoreInstanceState(final Parcelable parcelable) {
        final SavedState savedState = (SavedState)parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        if (savedState.c) {
            final ViewTreeObserver viewTreeObserver = this.getViewTreeObserver();
            if (viewTreeObserver != null) {
                viewTreeObserver.addOnGlobalLayoutListener((ViewTreeObserver$OnGlobalLayoutListener)new ViewTreeObserver$OnGlobalLayoutListener() {
                    public final void onGlobalLayout() {
                        if (!SpinnerCompat.this.H.b()) {
                            SpinnerCompat.this.H.c();
                        }
                        final ViewTreeObserver viewTreeObserver = SpinnerCompat.this.getViewTreeObserver();
                        if (viewTreeObserver != null) {
                            viewTreeObserver.removeGlobalOnLayoutListener((ViewTreeObserver$OnGlobalLayoutListener)this);
                        }
                    }
                });
            }
        }
    }
    
    @Override
    public final Parcelable onSaveInstanceState() {
        final SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.c = (this.H != null && this.H.b());
        return (Parcelable)savedState;
    }
    
    public final boolean onTouchEvent(final MotionEvent motionEvent) {
        return (this.G != null && this.G.onTouch((View)this, motionEvent)) || super.onTouchEvent(motionEvent);
    }
    
    public final boolean performClick() {
        boolean performClick;
        if (!(performClick = super.performClick())) {
            performClick = true;
            if (!this.H.b()) {
                this.H.c();
                performClick = performClick;
            }
        }
        return performClick;
    }
    
    public final void setEnabled(final boolean b) {
        super.setEnabled(b);
        if (this.K) {
            for (int childCount = this.getChildCount(), i = 0; i < childCount; ++i) {
                this.getChildAt(i).setEnabled(b);
            }
        }
    }
    
    public final void setOnItemClickListener(final android.support.v7.internal.widget.d.b b) {
        throw new RuntimeException("setOnItemClickListener cannot be used with a spinner.");
    }
    
    static class SavedState extends AbsSpinnerCompat.SavedState
    {
        public static final Parcelable$Creator<SavedState> CREATOR;
        boolean c;
        
        static {
            CREATOR = (Parcelable$Creator)new Parcelable$Creator<SavedState>() {};
        }
        
        private SavedState(final Parcel parcel) {
            super(parcel);
            this.c = (parcel.readByte() != 0);
        }
        
        SavedState(final Parcelable parcelable) {
            super(parcelable);
        }
        
        @Override
        public void writeToParcel(final Parcel parcel, int n) {
            super.writeToParcel(parcel, n);
            if (this.c) {
                n = 1;
            }
            else {
                n = 0;
            }
            parcel.writeByte((byte)n);
        }
    }
    
    private final class a implements DialogInterface$OnClickListener, d
    {
        private AlertDialog b;
        private ListAdapter c;
        private CharSequence d;
        
        public final void a() {
            if (this.b != null) {
                this.b.dismiss();
                this.b = null;
            }
        }
        
        public final void a(final ListAdapter c) {
            this.c = c;
        }
        
        public final void a(final CharSequence d) {
            this.d = d;
        }
        
        public final boolean b() {
            return this.b != null && this.b.isShowing();
        }
        
        public final void c() {
            if (this.c != null) {
                final AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(SpinnerCompat.this.getContext());
                if (this.d != null) {
                    alertDialog$Builder.setTitle(this.d);
                }
                (this.b = alertDialog$Builder.setSingleChoiceItems(this.c, SpinnerCompat.this.getSelectedItemPosition(), (DialogInterface$OnClickListener)this).create()).show();
            }
        }
        
        public final void onClick(final DialogInterface dialogInterface, final int selection) {
            SpinnerCompat.this.setSelection(selection);
            if (SpinnerCompat.this.t != null) {
                final SpinnerCompat a = SpinnerCompat.this;
                this.c.getItemId(selection);
                a.a((View)null);
            }
            this.a();
        }
    }
    
    private static final class b implements ListAdapter, SpinnerAdapter
    {
        private SpinnerAdapter a;
        private ListAdapter b;
        
        public b(final SpinnerAdapter a) {
            this.a = a;
            if (a instanceof ListAdapter) {
                this.b = (ListAdapter)a;
            }
        }
        
        public final boolean areAllItemsEnabled() {
            final ListAdapter b = this.b;
            return b == null || b.areAllItemsEnabled();
        }
        
        public final int getCount() {
            int count;
            if (this.a == null) {
                count = 0;
            }
            else {
                count = this.a.getCount();
            }
            return count;
        }
        
        public final View getDropDownView(final int n, View dropDownView, final ViewGroup viewGroup) {
            if (this.a == null) {
                dropDownView = null;
            }
            else {
                dropDownView = this.a.getDropDownView(n, dropDownView, viewGroup);
            }
            return dropDownView;
        }
        
        public final Object getItem(final int n) {
            Object item;
            if (this.a == null) {
                item = null;
            }
            else {
                item = this.a.getItem(n);
            }
            return item;
        }
        
        public final long getItemId(final int n) {
            long itemId;
            if (this.a == null) {
                itemId = -1L;
            }
            else {
                itemId = this.a.getItemId(n);
            }
            return itemId;
        }
        
        public final int getItemViewType(final int n) {
            return 0;
        }
        
        public final View getView(final int n, final View view, final ViewGroup viewGroup) {
            return this.getDropDownView(n, view, viewGroup);
        }
        
        public final int getViewTypeCount() {
            return 1;
        }
        
        public final boolean hasStableIds() {
            return this.a != null && this.a.hasStableIds();
        }
        
        public final boolean isEmpty() {
            return this.getCount() == 0;
        }
        
        public final boolean isEnabled(final int n) {
            final ListAdapter b = this.b;
            return b == null || b.isEnabled(n);
        }
        
        public final void registerDataSetObserver(final DataSetObserver dataSetObserver) {
            if (this.a != null) {
                this.a.registerDataSetObserver(dataSetObserver);
            }
        }
        
        public final void unregisterDataSetObserver(final DataSetObserver dataSetObserver) {
            if (this.a != null) {
                this.a.unregisterDataSetObserver(dataSetObserver);
            }
        }
    }
    
    private final class c extends b implements SpinnerCompat.d
    {
        private CharSequence k;
        private ListAdapter l;
        
        public c(final Context context, final int n) {
            super(context, n);
            super.h = (View)SpinnerCompat.this;
            this.d();
            super.g = 0;
            super.i = (AdapterView$OnItemClickListener)new AdapterView$OnItemClickListener() {
                public final void onItemClick(final AdapterView<?> adapterView, final View view, final int selection, final long n) {
                    SpinnerCompat.this.setSelection(selection);
                    if (SpinnerCompat.this.t != null) {
                        final SpinnerCompat a = SpinnerCompat.this;
                        c.this.l.getItemId(selection);
                        a.a(view);
                    }
                    c.this.a();
                }
            };
        }
        
        @Override
        public final void a(final ListAdapter l) {
            super.a(l);
            this.l = l;
        }
        
        @Override
        public final void a(final CharSequence k) {
            this.k = k;
        }
    }
    
    private interface d
    {
        void a();
        
        void a(final ListAdapter p0);
        
        void a(final CharSequence p0);
        
        boolean b();
        
        void c();
    }
}
