/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.graphics.Canvas
 *  android.util.AttributeSet
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 *  android.view.ViewGroup$LayoutParams
 *  android.view.ViewParent
 */
package android.support.v7.internal.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.support.v7.b.a;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import java.lang.ref.WeakReference;

public final class ViewStubCompat
extends View {
    private int a = 0;
    private int b;
    private WeakReference<View> c;
    private LayoutInflater d;
    private a e;

    public ViewStubCompat(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ViewStubCompat(Context context, AttributeSet attributeSet, int n2) {
        super(context, attributeSet, n2);
        context = context.obtainStyledAttributes(attributeSet, a.i.ViewStubCompat, n2, 0);
        this.b = context.getResourceId(a.i.ViewStubCompat_android_inflatedId, -1);
        this.a = context.getResourceId(a.i.ViewStubCompat_android_layout, 0);
        this.setId(context.getResourceId(a.i.ViewStubCompat_android_id, -1));
        context.recycle();
        this.setVisibility(8);
        this.setWillNotDraw(true);
    }

    protected final void dispatchDraw(Canvas canvas) {
    }

    public final void draw(Canvas canvas) {
    }

    public final int getInflatedId() {
        return this.b;
    }

    public final LayoutInflater getLayoutInflater() {
        return this.d;
    }

    public final int getLayoutResource() {
        return this.a;
    }

    protected final void onMeasure(int n2, int n3) {
        this.setMeasuredDimension(0, 0);
    }

    public final void setInflatedId(int n2) {
        this.b = n2;
    }

    public final void setLayoutInflater(LayoutInflater layoutInflater) {
        this.d = layoutInflater;
    }

    public final void setLayoutResource(int n2) {
        this.a = n2;
    }

    public final void setOnInflateListener(a a2) {
        this.e = a2;
    }

    /*
     * Enabled aggressive block sorting
     */
    public final void setVisibility(int n2) {
        ViewParent viewParent;
        if (this.c != null) {
            View view = (View)this.c.get();
            if (view == null) throw new IllegalStateException("setVisibility called on un-referenced view");
            view.setVisibility(n2);
            return;
        }
        super.setVisibility(n2);
        if (n2 != 0) {
            if (n2 != 4) return;
        }
        if ((viewParent = this.getParent()) == null) throw new IllegalStateException("ViewStub must have a non-null ViewGroup viewParent");
        if (!(viewParent instanceof ViewGroup)) throw new IllegalStateException("ViewStub must have a non-null ViewGroup viewParent");
        if (this.a == 0) throw new IllegalArgumentException("ViewStub must have a valid layoutResource");
        ViewGroup viewGroup = (ViewGroup)viewParent;
        viewParent = this.d != null ? this.d : LayoutInflater.from((Context)this.getContext());
        viewParent = viewParent.inflate(this.a, viewGroup, false);
        if (this.b != -1) {
            viewParent.setId(this.b);
        }
        n2 = viewGroup.indexOfChild((View)this);
        viewGroup.removeViewInLayout((View)this);
        ViewGroup.LayoutParams layoutParams = this.getLayoutParams();
        if (layoutParams != null) {
            viewGroup.addView((View)viewParent, n2, layoutParams);
        } else {
            viewGroup.addView((View)viewParent, n2);
        }
        this.c = new WeakReference<ViewParent>(viewParent);
    }

    public static interface a {
    }
}

