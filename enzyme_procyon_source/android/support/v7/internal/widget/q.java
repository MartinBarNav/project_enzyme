// 
// Decompiled by Procyon v0.5.36
// 

package android.support.v7.internal.widget;

import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.content.Context;
import android.content.res.TypedArray;

public final class q
{
    public final TypedArray a;
    private final Context b;
    private o c;
    
    private q(final Context b, final TypedArray a) {
        this.b = b;
        this.a = a;
    }
    
    public static q a(final Context context, final AttributeSet set, final int[] array, final int n) {
        return new q(context, context.obtainStyledAttributes(set, array, n, 0));
    }
    
    public final int a(final int n, final int n2) {
        return this.a.getInt(n, n2);
    }
    
    public final Drawable a(final int n) {
        if (!this.a.hasValue(n)) {
            return this.a.getDrawable(n);
        }
        final int resourceId = this.a.getResourceId(n, 0);
        if (resourceId == 0) {
            return this.a.getDrawable(n);
        }
        return this.a().a(resourceId);
        drawable = this.a.getDrawable(n);
        return drawable;
    }
    
    public final o a() {
        if (this.c == null) {
            this.c = new o(this.b);
        }
        return this.c;
    }
    
    public final boolean a(final int n, final boolean b) {
        return this.a.getBoolean(n, b);
    }
    
    public final int b(final int n, final int n2) {
        return this.a.getDimensionPixelOffset(n, n2);
    }
    
    public final CharSequence b(final int n) {
        return this.a.getText(n);
    }
    
    public final int c(final int n, final int n2) {
        return this.a.getDimensionPixelSize(n, n2);
    }
    
    public final boolean c(final int n) {
        return this.a.hasValue(n);
    }
    
    public final int d(final int n, final int n2) {
        return this.a.getLayoutDimension(n, n2);
    }
    
    public final int e(final int n, final int n2) {
        return this.a.getResourceId(n, n2);
    }
}
