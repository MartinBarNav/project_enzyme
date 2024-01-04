// 
// Decompiled by Procyon v0.5.36
// 

package android.support.v7.a;

import android.view.View;
import android.graphics.drawable.Drawable;
import android.view.ViewGroup$LayoutParams;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.content.Context;
import android.view.ViewGroup$MarginLayoutParams;

public abstract class a
{
    public static class a extends ViewGroup$MarginLayoutParams
    {
        public int a;
        
        public a() {
            super(-2, -2);
            this.a = 0;
            this.a = 8388627;
        }
        
        public a(final Context context, final AttributeSet set) {
            super(context, set);
            this.a = 0;
            final TypedArray obtainStyledAttributes = context.obtainStyledAttributes(set, android.support.v7.b.a.i.ActionBarLayout);
            this.a = obtainStyledAttributes.getInt(android.support.v7.b.a.i.ActionBarLayout_android_layout_gravity, 0);
            obtainStyledAttributes.recycle();
        }
        
        public a(final a a) {
            super((ViewGroup$MarginLayoutParams)a);
            this.a = 0;
            this.a = a.a;
        }
        
        public a(final ViewGroup$LayoutParams viewGroup$LayoutParams) {
            super(viewGroup$LayoutParams);
            this.a = 0;
        }
    }
    
    public abstract static class b
    {
        public abstract Drawable a();
        
        public abstract CharSequence b();
        
        public abstract View c();
        
        public abstract CharSequence d();
    }
}
