// 
// Decompiled by Procyon v0.5.36
// 

package android.support.v4.view;

import android.view.ViewGroup$MarginLayoutParams;
import android.os.Build$VERSION;

public final class i
{
    static final a a;
    
    static {
        if (Build$VERSION.SDK_INT >= 17) {
            a = (a)new c();
        }
        else {
            a = (a)new b();
        }
    }
    
    public static int a(final ViewGroup$MarginLayoutParams viewGroup$MarginLayoutParams) {
        return i.a.a(viewGroup$MarginLayoutParams);
    }
    
    public static int b(final ViewGroup$MarginLayoutParams viewGroup$MarginLayoutParams) {
        return i.a.b(viewGroup$MarginLayoutParams);
    }
    
    interface a
    {
        int a(final ViewGroup$MarginLayoutParams p0);
        
        int b(final ViewGroup$MarginLayoutParams p0);
    }
    
    static final class b implements a
    {
        @Override
        public final int a(final ViewGroup$MarginLayoutParams viewGroup$MarginLayoutParams) {
            return viewGroup$MarginLayoutParams.leftMargin;
        }
        
        @Override
        public final int b(final ViewGroup$MarginLayoutParams viewGroup$MarginLayoutParams) {
            return viewGroup$MarginLayoutParams.rightMargin;
        }
    }
    
    static final class c implements a
    {
        @Override
        public final int a(final ViewGroup$MarginLayoutParams viewGroup$MarginLayoutParams) {
            return j.a(viewGroup$MarginLayoutParams);
        }
        
        @Override
        public final int b(final ViewGroup$MarginLayoutParams viewGroup$MarginLayoutParams) {
            return j.b(viewGroup$MarginLayoutParams);
        }
    }
}
