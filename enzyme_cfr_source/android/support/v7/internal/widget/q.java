/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.res.TypedArray
 *  android.graphics.drawable.Drawable
 *  android.util.AttributeSet
 */
package android.support.v7.internal.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.support.v7.internal.widget.o;
import android.util.AttributeSet;

public final class q {
    public final TypedArray a;
    private final Context b;
    private o c;

    private q(Context context, TypedArray typedArray) {
        this.b = context;
        this.a = typedArray;
    }

    public static q a(Context context, AttributeSet attributeSet, int[] arrn, int n2) {
        return new q(context, context.obtainStyledAttributes(attributeSet, arrn, n2, 0));
    }

    public final int a(int n2, int n3) {
        return this.a.getInt(n2, n3);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final Drawable a(int n2) {
        if (!this.a.hasValue(n2)) return this.a.getDrawable(n2);
        int n3 = this.a.getResourceId(n2, 0);
        if (n3 == 0) return this.a.getDrawable(n2);
        return this.a().a(n3);
    }

    public final o a() {
        if (this.c == null) {
            this.c = new o(this.b);
        }
        return this.c;
    }

    public final boolean a(int n2, boolean bl) {
        return this.a.getBoolean(n2, bl);
    }

    public final int b(int n2, int n3) {
        return this.a.getDimensionPixelOffset(n2, n3);
    }

    public final CharSequence b(int n2) {
        return this.a.getText(n2);
    }

    public final int c(int n2, int n3) {
        return this.a.getDimensionPixelSize(n2, n3);
    }

    public final boolean c(int n2) {
        return this.a.hasValue(n2);
    }

    public final int d(int n2, int n3) {
        return this.a.getLayoutDimension(n2, n3);
    }

    public final int e(int n2, int n3) {
        return this.a.getResourceId(n2, n3);
    }
}

