/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.graphics.drawable.Drawable
 *  android.util.AttributeSet
 *  android.view.View
 *  android.view.ViewGroup$LayoutParams
 *  android.view.ViewGroup$MarginLayoutParams
 */
package android.support.v7.a;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.support.v7.b.a;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;

public abstract class a {

    public static class a
    extends ViewGroup.MarginLayoutParams {
        public int a = 0;

        public a() {
            super(-2, -2);
            this.a = 8388627;
        }

        public a(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            context = context.obtainStyledAttributes(attributeSet, a.i.ActionBarLayout);
            this.a = context.getInt(a.i.ActionBarLayout_android_layout_gravity, 0);
            context.recycle();
        }

        public a(a a2) {
            super((ViewGroup.MarginLayoutParams)a2);
            this.a = a2.a;
        }

        public a(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }
    }

    public static abstract class b {
        public abstract Drawable a();

        public abstract CharSequence b();

        public abstract View c();

        public abstract CharSequence d();
    }
}

