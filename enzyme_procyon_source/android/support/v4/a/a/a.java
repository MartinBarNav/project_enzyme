// 
// Decompiled by Procyon v0.5.36
// 

package android.support.v4.a.a;

import android.graphics.PorterDuff$Mode;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.os.Build$VERSION;

public final class a
{
    static final b a;
    
    static {
        final int sdk_INT = Build$VERSION.SDK_INT;
        if (sdk_INT >= 21) {
            a = (b)new e();
        }
        else if (sdk_INT >= 19) {
            a = (b)new d();
        }
        else if (sdk_INT >= 11) {
            a = (b)new c();
        }
        else {
            a = (b)new a();
        }
    }
    
    public static void a(final Drawable drawable) {
        android.support.v4.a.a.a.a.a(drawable);
    }
    
    public static void a(final Drawable drawable, final float n, final float n2) {
        android.support.v4.a.a.a.a.a(drawable, n, n2);
    }
    
    public static void a(final Drawable drawable, final int n) {
        android.support.v4.a.a.a.a.a(drawable, n);
    }
    
    public static void a(final Drawable drawable, final int n, final int n2, final int n3, final int n4) {
        android.support.v4.a.a.a.a.a(drawable, n, n2, n3, n4);
    }
    
    public static void a(final Drawable drawable, final ColorStateList list) {
        android.support.v4.a.a.a.a.a(drawable, list);
    }
    
    public static void a(final Drawable drawable, final PorterDuff$Mode porterDuff$Mode) {
        android.support.v4.a.a.a.a.a(drawable, porterDuff$Mode);
    }
    
    public static void a(final Drawable drawable, final boolean b) {
        android.support.v4.a.a.a.a.a(drawable, b);
    }
    
    public static boolean b(final Drawable drawable) {
        return android.support.v4.a.a.a.a.b(drawable);
    }
    
    static class a implements b
    {
        @Override
        public void a(final Drawable drawable) {
        }
        
        @Override
        public void a(final Drawable drawable, final float n, final float n2) {
        }
        
        @Override
        public void a(final Drawable drawable, final int n) {
        }
        
        @Override
        public void a(final Drawable drawable, final int n, final int n2, final int n3, final int n4) {
        }
        
        @Override
        public void a(final Drawable drawable, final ColorStateList list) {
        }
        
        @Override
        public void a(final Drawable drawable, final PorterDuff$Mode porterDuff$Mode) {
        }
        
        @Override
        public void a(final Drawable drawable, final boolean b) {
        }
        
        @Override
        public boolean b(final Drawable drawable) {
            return false;
        }
    }
    
    interface b
    {
        void a(final Drawable p0);
        
        void a(final Drawable p0, final float p1, final float p2);
        
        void a(final Drawable p0, final int p1);
        
        void a(final Drawable p0, final int p1, final int p2, final int p3, final int p4);
        
        void a(final Drawable p0, final ColorStateList p1);
        
        void a(final Drawable p0, final PorterDuff$Mode p1);
        
        void a(final Drawable p0, final boolean p1);
        
        boolean b(final Drawable p0);
    }
    
    static class c extends a
    {
        @Override
        public final void a(final Drawable drawable) {
            android.support.v4.a.a.b.a(drawable);
        }
    }
    
    static class d extends c
    {
        @Override
        public final void a(final Drawable drawable, final boolean b) {
            android.support.v4.a.a.c.a(drawable, b);
        }
        
        @Override
        public final boolean b(final Drawable drawable) {
            return android.support.v4.a.a.c.a(drawable);
        }
    }
    
    static final class e extends d
    {
        @Override
        public final void a(final Drawable drawable, final float n, final float n2) {
            android.support.v4.a.a.d.a(drawable, n, n2);
        }
        
        @Override
        public final void a(final Drawable drawable, final int n) {
            android.support.v4.a.a.d.a(drawable, n);
        }
        
        @Override
        public final void a(final Drawable drawable, final int n, final int n2, final int n3, final int n4) {
            android.support.v4.a.a.d.a(drawable, n, n2, n3, n4);
        }
        
        @Override
        public final void a(final Drawable drawable, final ColorStateList list) {
            android.support.v4.a.a.d.a(drawable, list);
        }
        
        @Override
        public final void a(final Drawable drawable, final PorterDuff$Mode porterDuff$Mode) {
            android.support.v4.a.a.d.a(drawable, porterDuff$Mode);
        }
    }
}
