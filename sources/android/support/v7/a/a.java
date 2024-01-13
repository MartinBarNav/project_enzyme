package android.support.v7.a;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.support.v7.b.a;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;

public abstract class a {

    public static abstract class b {
        public abstract Drawable a();

        public abstract CharSequence b();

        public abstract View c();

        public abstract CharSequence d();
    }

    /* renamed from: android.support.v7.a.a$a  reason: collision with other inner class name */
    public static class C0010a extends ViewGroup.MarginLayoutParams {
        public int a;

        public C0010a(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.a = 0;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, a.i.ActionBarLayout);
            this.a = obtainStyledAttributes.getInt(a.i.ActionBarLayout_android_layout_gravity, 0);
            obtainStyledAttributes.recycle();
        }

        public C0010a() {
            super(-2, -2);
            this.a = 0;
            this.a = 8388627;
        }

        public C0010a(C0010a aVar) {
            super(aVar);
            this.a = 0;
            this.a = aVar.a;
        }

        public C0010a(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.a = 0;
        }
    }
}
