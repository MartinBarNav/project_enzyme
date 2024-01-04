/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  android.app.AlertDialog
 *  android.app.AlertDialog$Builder
 *  android.content.Context
 *  android.content.DialogInterface
 *  android.content.DialogInterface$OnClickListener
 *  android.database.DataSetObserver
 *  android.graphics.Rect
 *  android.graphics.drawable.Drawable
 *  android.os.Parcel
 *  android.os.Parcelable
 *  android.os.Parcelable$Creator
 *  android.view.MotionEvent
 *  android.view.View
 *  android.view.View$MeasureSpec
 *  android.view.ViewGroup
 *  android.view.ViewGroup$LayoutParams
 *  android.view.ViewTreeObserver
 *  android.view.ViewTreeObserver$OnGlobalLayoutListener
 *  android.widget.Adapter
 *  android.widget.AdapterView
 *  android.widget.AdapterView$OnItemClickListener
 *  android.widget.ListAdapter
 *  android.widget.SpinnerAdapter
 */
package android.support.v7.internal.widget;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.database.DataSetObserver;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.view.e;
import android.support.v4.view.u;
import android.support.v7.b.a;
import android.support.v7.internal.widget.AbsSpinnerCompat;
import android.support.v7.internal.widget.d;
import android.support.v7.internal.widget.o;
import android.support.v7.internal.widget.q;
import android.support.v7.widget.b;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.SpinnerAdapter;

final class SpinnerCompat
extends AbsSpinnerCompat
implements DialogInterface.OnClickListener {
    int F;
    private b.b G;
    private d H;
    private b I;
    private int J;
    private boolean K;
    private Rect L = new Rect();
    private final o M;

    SpinnerCompat(Context context, int n2) {
        this(context, n2, 0);
    }

    /*
     * Enabled aggressive block sorting
     */
    private SpinnerCompat(Context object, int n2, byte by) {
        super((Context)object, n2);
        q q2 = android.support.v7.internal.widget.q.a((Context)object, null, a.i.Spinner, n2);
        this.setBackgroundDrawable(q2.a(a.i.Spinner_android_background));
        switch (q2.a(a.i.Spinner_spinnerMode, 0)) {
            case 0: {
                this.H = new a(0);
            }
            default: {
                break;
            }
            case 1: {
                final c c2 = new c((Context)object, n2);
                this.F = q2.d(a.i.Spinner_android_dropDownWidth, -2);
                object = q2.a(a.i.Spinner_android_popupBackground);
                c2.b.setBackgroundDrawable((Drawable)object);
                this.H = c2;
                this.G = new b.b((View)this){

                    @Override
                    public final android.support.v7.widget.b a() {
                        return c2;
                    }

                    @Override
                    public final boolean b() {
                        if (!SpinnerCompat.this.H.b()) {
                            SpinnerCompat.this.H.c();
                        }
                        return true;
                    }
                };
            }
        }
        this.J = q2.a(a.i.Spinner_android_gravity, 17);
        object = this.H;
        n2 = a.i.Spinner_prompt;
        object.a(q2.a.getString(n2));
        this.K = q2.a(a.i.Spinner_disableChildrenWhenDisabled, false);
        q2.a.recycle();
        if (this.I != null) {
            this.H.a(this.I);
            this.I = null;
        }
        this.M = q2.a();
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private View a(int n2, boolean bl) {
        View view;
        if (!this.v && (view = this.i.a(n2)) != null) {
            this.a(view, bl);
            return view;
        }
        view = this.a.getView(n2, null, (ViewGroup)this);
        this.a(view, bl);
        return view;
    }

    private void a(View view, boolean bl) {
        ViewGroup.LayoutParams layoutParams;
        ViewGroup.LayoutParams layoutParams2 = layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            layoutParams2 = this.generateDefaultLayoutParams();
        }
        if (bl) {
            this.addViewInLayout(view, 0, layoutParams2);
        }
        view.setSelected(this.hasFocus());
        if (this.K) {
            view.setEnabled(this.isEnabled());
        }
        int n2 = ViewGroup.getChildMeasureSpec((int)this.b, (int)(this.h.top + this.h.bottom), (int)layoutParams2.height);
        view.measure(ViewGroup.getChildMeasureSpec((int)this.c, (int)(this.h.left + this.h.right), (int)layoutParams2.width), n2);
        n2 = this.h.top + (this.getMeasuredHeight() - this.h.bottom - this.h.top - view.getMeasuredHeight()) / 2;
        int n3 = view.getMeasuredHeight();
        view.layout(0, n2, view.getMeasuredWidth() + 0, n3 + n2);
    }

    final void a(d.b b2) {
        super.setOnItemClickListener(b2);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public final void a(SpinnerAdapter spinnerAdapter) {
        super.a(spinnerAdapter);
        this.i.a();
        if (this.getContext().getApplicationInfo().targetSdkVersion >= 21 && spinnerAdapter != null && spinnerAdapter.getViewTypeCount() != 1) {
            throw new IllegalArgumentException("Spinner adapter view type count must be 1");
        }
        if (this.H != null) {
            this.H.a(new b(spinnerAdapter));
            return;
        }
        this.I = new b(spinnerAdapter);
    }

    /*
     * Enabled aggressive block sorting
     */
    public final int getBaseline() {
        View view;
        int n2 = -1;
        View view2 = null;
        if (this.getChildCount() > 0) {
            view = this.getChildAt(0);
        } else {
            view = view2;
            if (this.a != null) {
                view = view2;
                if (this.a.getCount() > 0) {
                    view = this.a(0, false);
                    this.i.a(0, view);
                }
            }
        }
        int n3 = n2;
        if (view == null) return n3;
        int n4 = view.getBaseline();
        n3 = n2;
        if (n4 < 0) return n3;
        return view.getTop() + n4;
    }

    public final void onClick(DialogInterface dialogInterface, int n2) {
        this.setSelection(n2);
        dialogInterface.dismiss();
    }

    @Override
    protected final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.H != null && this.H.b()) {
            this.H.a();
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    @Override
    protected final void onLayout(boolean bl, int n2, int n3, int n4, int n5) {
        super.onLayout(bl, n2, n3, n4, n5);
        this.r = true;
        n3 = this.h.left;
        n4 = this.getRight() - this.getLeft() - this.h.left - this.h.right;
        if (this.v) {
            this.c();
        }
        if (this.A == 0) {
            this.a();
        } else {
            if (this.w >= 0) {
                this.setSelectedPositionInt(this.w);
            }
            n5 = this.getChildCount();
            AbsSpinnerCompat.a a2 = this.i;
            int n6 = this.j;
            for (n2 = 0; n2 < n5; ++n2) {
                a2.a(n6 + n2, this.getChildAt(n2));
            }
            this.removeAllViewsInLayout();
            this.j = this.y;
            if (this.a != null) {
                a2 = this.a(this.y, true);
                n2 = a2.getMeasuredWidth();
                n5 = android.support.v4.view.u.e((View)this);
                switch (android.support.v4.view.e.a(this.J, n5) & 7) {
                    default: {
                        n2 = n3;
                        break;
                    }
                    case 1: {
                        n2 = n3 + n4 / 2 - n2 / 2;
                        break;
                    }
                    case 5: {
                        n2 = n3 + n4 - n2;
                    }
                }
                a2.offsetLeftAndRight(n2);
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

    /*
     * Enabled aggressive block sorting
     */
    @Override
    protected final void onMeasure(int n2, int n3) {
        int n4 = 0;
        super.onMeasure(n2, n3);
        if (this.H != null && View.MeasureSpec.getMode((int)n2) == Integer.MIN_VALUE) {
            int n5 = this.getMeasuredWidth();
            SpinnerAdapter spinnerAdapter = this.a;
            Drawable drawable = this.getBackground();
            if (spinnerAdapter == null) {
                n3 = n4;
            } else {
                int n6 = View.MeasureSpec.makeMeasureSpec((int)0, (int)0);
                int n7 = View.MeasureSpec.makeMeasureSpec((int)0, (int)0);
                n3 = Math.max(0, this.getSelectedItemPosition());
                int n8 = Math.min(spinnerAdapter.getCount(), n3 + 15);
                int n9 = Math.max(0, n3 - (15 - (n8 - n3)));
                View view = null;
                n3 = 0;
                n4 = 0;
                while (n9 < n8) {
                    int n10 = spinnerAdapter.getItemViewType(n9);
                    if (n10 != n4) {
                        view = null;
                        n4 = n10;
                    }
                    if ((view = spinnerAdapter.getView(n9, view, (ViewGroup)this)).getLayoutParams() == null) {
                        view.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
                    }
                    view.measure(n6, n7);
                    n3 = Math.max(n3, view.getMeasuredWidth());
                    ++n9;
                }
                if (drawable != null) {
                    drawable.getPadding(this.L);
                    n3 = this.L.left + this.L.right + n3;
                }
            }
            this.setMeasuredDimension(Math.min(Math.max(n5, n3), View.MeasureSpec.getSize((int)n2)), this.getMeasuredHeight());
        }
    }

    @Override
    public final void onRestoreInstanceState(Parcelable object) {
        object = (SavedState)((Object)object);
        super.onRestoreInstanceState(object.getSuperState());
        if (object.c && (object = this.getViewTreeObserver()) != null) {
            object.addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener(){

                public final void onGlobalLayout() {
                    ViewTreeObserver viewTreeObserver;
                    if (!SpinnerCompat.this.H.b()) {
                        SpinnerCompat.this.H.c();
                    }
                    if ((viewTreeObserver = SpinnerCompat.this.getViewTreeObserver()) != null) {
                        viewTreeObserver.removeGlobalOnLayoutListener((ViewTreeObserver.OnGlobalLayoutListener)this);
                    }
                }
            });
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public final Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        boolean bl = this.H != null && this.H.b();
        savedState.c = bl;
        return savedState;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.G == null) return super.onTouchEvent(motionEvent);
        if (!this.G.onTouch((View)this, motionEvent)) return super.onTouchEvent(motionEvent);
        return true;
    }

    public final boolean performClick() {
        boolean bl;
        boolean bl2 = bl = super.performClick();
        if (!bl) {
            bl2 = bl = true;
            if (!this.H.b()) {
                this.H.c();
                bl2 = bl;
            }
        }
        return bl2;
    }

    @Override
    public final /* synthetic */ void setAdapter(Adapter adapter) {
        this.a((SpinnerAdapter)adapter);
    }

    public final void setEnabled(boolean bl) {
        super.setEnabled(bl);
        if (this.K) {
            int n2 = this.getChildCount();
            for (int i2 = 0; i2 < n2; ++i2) {
                this.getChildAt(i2).setEnabled(bl);
            }
        }
    }

    @Override
    public final void setOnItemClickListener(d.b b2) {
        throw new RuntimeException("setOnItemClickListener cannot be used with a spinner.");
    }

    static class SavedState
    extends AbsSpinnerCompat.SavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new Parcelable.Creator<SavedState>(){

            public final /* synthetic */ Object createFromParcel(Parcel parcel) {
                return new SavedState(parcel, 0);
            }
        };
        boolean c;

        /*
         * Enabled aggressive block sorting
         */
        private SavedState(Parcel parcel) {
            super(parcel);
            boolean bl = parcel.readByte() != 0;
            this.c = bl;
        }

        /* synthetic */ SavedState(Parcel parcel, byte by) {
            this(parcel);
        }

        SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        /*
         * Enabled aggressive block sorting
         */
        @Override
        public void writeToParcel(Parcel parcel, int n2) {
            super.writeToParcel(parcel, n2);
            n2 = this.c ? 1 : 0;
            parcel.writeByte((byte)n2);
        }
    }

    private final class a
    implements DialogInterface.OnClickListener,
    d {
        private AlertDialog b;
        private ListAdapter c;
        private CharSequence d;

        private a() {
        }

        /* synthetic */ a(byte by) {
            this();
        }

        @Override
        public final void a() {
            if (this.b != null) {
                this.b.dismiss();
                this.b = null;
            }
        }

        @Override
        public final void a(ListAdapter listAdapter) {
            this.c = listAdapter;
        }

        @Override
        public final void a(CharSequence charSequence) {
            this.d = charSequence;
        }

        /*
         * Enabled force condition propagation
         * Lifted jumps to return sites
         */
        @Override
        public final boolean b() {
            if (this.b == null) return false;
            return this.b.isShowing();
        }

        /*
         * Enabled force condition propagation
         * Lifted jumps to return sites
         */
        @Override
        public final void c() {
            if (this.c == null) {
                return;
            }
            AlertDialog.Builder builder = new AlertDialog.Builder(SpinnerCompat.this.getContext());
            if (this.d != null) {
                builder.setTitle(this.d);
            }
            this.b = builder.setSingleChoiceItems(this.c, SpinnerCompat.this.getSelectedItemPosition(), (DialogInterface.OnClickListener)this).create();
            this.b.show();
        }

        public final void onClick(DialogInterface object, int n2) {
            SpinnerCompat.this.setSelection(n2);
            if (SpinnerCompat.this.t != null) {
                object = SpinnerCompat.this;
                this.c.getItemId(n2);
                ((android.support.v7.internal.widget.d)((Object)object)).a(null);
            }
            this.a();
        }
    }

    private static final class b
    implements ListAdapter,
    SpinnerAdapter {
        private SpinnerAdapter a;
        private ListAdapter b;

        public b(SpinnerAdapter spinnerAdapter) {
            this.a = spinnerAdapter;
            if (spinnerAdapter instanceof ListAdapter) {
                this.b = (ListAdapter)spinnerAdapter;
            }
        }

        /*
         * Enabled force condition propagation
         * Lifted jumps to return sites
         */
        public final boolean areAllItemsEnabled() {
            ListAdapter listAdapter = this.b;
            if (listAdapter == null) return true;
            return listAdapter.areAllItemsEnabled();
        }

        /*
         * Enabled force condition propagation
         * Lifted jumps to return sites
         */
        public final int getCount() {
            if (this.a != null) return this.a.getCount();
            return 0;
        }

        /*
         * Enabled force condition propagation
         * Lifted jumps to return sites
         */
        public final View getDropDownView(int n2, View view, ViewGroup viewGroup) {
            if (this.a != null) return this.a.getDropDownView(n2, view, viewGroup);
            return null;
        }

        /*
         * Enabled force condition propagation
         * Lifted jumps to return sites
         */
        public final Object getItem(int n2) {
            if (this.a != null) return this.a.getItem(n2);
            return null;
        }

        /*
         * Enabled force condition propagation
         * Lifted jumps to return sites
         */
        public final long getItemId(int n2) {
            if (this.a != null) return this.a.getItemId(n2);
            return -1L;
        }

        public final int getItemViewType(int n2) {
            return 0;
        }

        public final View getView(int n2, View view, ViewGroup viewGroup) {
            return this.getDropDownView(n2, view, viewGroup);
        }

        public final int getViewTypeCount() {
            return 1;
        }

        /*
         * Enabled force condition propagation
         * Lifted jumps to return sites
         */
        public final boolean hasStableIds() {
            if (this.a == null) return false;
            if (!this.a.hasStableIds()) return false;
            return true;
        }

        /*
         * Enabled force condition propagation
         * Lifted jumps to return sites
         */
        public final boolean isEmpty() {
            if (this.getCount() != 0) return false;
            return true;
        }

        /*
         * Enabled force condition propagation
         * Lifted jumps to return sites
         */
        public final boolean isEnabled(int n2) {
            ListAdapter listAdapter = this.b;
            if (listAdapter == null) return true;
            return listAdapter.isEnabled(n2);
        }

        public final void registerDataSetObserver(DataSetObserver dataSetObserver) {
            if (this.a != null) {
                this.a.registerDataSetObserver(dataSetObserver);
            }
        }

        public final void unregisterDataSetObserver(DataSetObserver dataSetObserver) {
            if (this.a != null) {
                this.a.unregisterDataSetObserver(dataSetObserver);
            }
        }
    }

    private final class c
    extends android.support.v7.widget.b
    implements d {
        private CharSequence k;
        private ListAdapter l;

        public c(Context context, int n2) {
            super(context, n2);
            this.h = SpinnerCompat.this;
            this.d();
            this.g = 0;
            this.i = new AdapterView.OnItemClickListener(){

                public final void onItemClick(AdapterView<?> object, View view, int n2, long l2) {
                    SpinnerCompat.this.setSelection(n2);
                    if (SpinnerCompat.this.t != null) {
                        object = SpinnerCompat.this;
                        c.this.l.getItemId(n2);
                        ((android.support.v7.internal.widget.d)((Object)object)).a(view);
                    }
                    c.this.a();
                }
            };
        }

        @Override
        public final void a(ListAdapter listAdapter) {
            super.a(listAdapter);
            this.l = listAdapter;
        }

        @Override
        public final void a(CharSequence charSequence) {
            this.k = charSequence;
        }
    }

    private static interface d {
        public void a();

        public void a(ListAdapter var1);

        public void a(CharSequence var1);

        public boolean b();

        public void c();
    }
}

