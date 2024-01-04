// 
// Decompiled by Procyon v0.5.36
// 

package android.support.v7.internal.widget;

import android.view.ViewGroup$LayoutParams;
import android.view.ViewParent;
import android.view.ViewGroup;
import android.graphics.Canvas;
import android.content.res.TypedArray;
import android.support.v7.b.a;
import android.util.AttributeSet;
import android.content.Context;
import android.view.LayoutInflater;
import java.lang.ref.WeakReference;
import android.view.View;

public final class ViewStubCompat extends View
{
    private int a;
    private int b;
    private WeakReference<View> c;
    private LayoutInflater d;
    private a e;
    
    public ViewStubCompat(final Context context, final AttributeSet set) {
        this(context, set, 0);
    }
    
    public ViewStubCompat(final Context context, final AttributeSet set, final int n) {
        super(context, set, n);
        this.a = 0;
        final TypedArray obtainStyledAttributes = context.obtainStyledAttributes(set, android.support.v7.b.a.i.ViewStubCompat, n, 0);
        this.b = obtainStyledAttributes.getResourceId(android.support.v7.b.a.i.ViewStubCompat_android_inflatedId, -1);
        this.a = obtainStyledAttributes.getResourceId(android.support.v7.b.a.i.ViewStubCompat_android_layout, 0);
        this.setId(obtainStyledAttributes.getResourceId(android.support.v7.b.a.i.ViewStubCompat_android_id, -1));
        obtainStyledAttributes.recycle();
        this.setVisibility(8);
        this.setWillNotDraw(true);
    }
    
    protected final void dispatchDraw(final Canvas canvas) {
    }
    
    public final void draw(final Canvas canvas) {
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
    
    protected final void onMeasure(final int n, final int n2) {
        this.setMeasuredDimension(0, 0);
    }
    
    public final void setInflatedId(final int b) {
        this.b = b;
    }
    
    public final void setLayoutInflater(final LayoutInflater d) {
        this.d = d;
    }
    
    public final void setLayoutResource(final int a) {
        this.a = a;
    }
    
    public final void setOnInflateListener(final a e) {
        this.e = e;
    }
    
    public final void setVisibility(int indexOfChild) {
        if (this.c != null) {
            final View view = this.c.get();
            if (view == null) {
                throw new IllegalStateException("setVisibility called on un-referenced view");
            }
            view.setVisibility(indexOfChild);
        }
        else {
            super.setVisibility(indexOfChild);
            if (indexOfChild == 0 || indexOfChild == 4) {
                final ViewParent parent = this.getParent();
                if (parent == null || !(parent instanceof ViewGroup)) {
                    throw new IllegalStateException("ViewStub must have a non-null ViewGroup viewParent");
                }
                if (this.a == 0) {
                    throw new IllegalArgumentException("ViewStub must have a valid layoutResource");
                }
                final ViewGroup viewGroup = (ViewGroup)parent;
                LayoutInflater layoutInflater;
                if (this.d != null) {
                    layoutInflater = this.d;
                }
                else {
                    layoutInflater = LayoutInflater.from(this.getContext());
                }
                final View inflate = layoutInflater.inflate(this.a, viewGroup, false);
                if (this.b != -1) {
                    inflate.setId(this.b);
                }
                indexOfChild = viewGroup.indexOfChild((View)this);
                viewGroup.removeViewInLayout((View)this);
                final ViewGroup$LayoutParams layoutParams = this.getLayoutParams();
                if (layoutParams != null) {
                    viewGroup.addView(inflate, indexOfChild, layoutParams);
                }
                else {
                    viewGroup.addView(inflate, indexOfChild);
                }
                this.c = new WeakReference<View>(inflate);
            }
        }
    }
    
    public interface a
    {
    }
}
