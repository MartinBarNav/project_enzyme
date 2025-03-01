package android.support.v7.internal.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;

public final class q {
    public final TypedArray a;
    private final Context b;
    private o c;

    public static q a(Context context, AttributeSet attributeSet, int[] iArr, int i) {
        return new q(context, context.obtainStyledAttributes(attributeSet, iArr, i, 0));
    }

    private q(Context context, TypedArray typedArray) {
        this.b = context;
        this.a = typedArray;
    }

    public final Drawable a(int i) {
        int resourceId;
        if (!this.a.hasValue(i) || (resourceId = this.a.getResourceId(i, 0)) == 0) {
            return this.a.getDrawable(i);
        }
        return a().a(resourceId);
    }

    public final CharSequence b(int i) {
        return this.a.getText(i);
    }

    public final boolean a(int i, boolean z) {
        return this.a.getBoolean(i, z);
    }

    public final int a(int i, int i2) {
        return this.a.getInt(i, i2);
    }

    public final int b(int i, int i2) {
        return this.a.getDimensionPixelOffset(i, i2);
    }

    public final int c(int i, int i2) {
        return this.a.getDimensionPixelSize(i, i2);
    }

    public final int d(int i, int i2) {
        return this.a.getLayoutDimension(i, i2);
    }

    public final int e(int i, int i2) {
        return this.a.getResourceId(i, i2);
    }

    public final boolean c(int i) {
        return this.a.hasValue(i);
    }

    public final o a() {
        if (this.c == null) {
            this.c = new o(this.b);
        }
        return this.c;
    }
}
