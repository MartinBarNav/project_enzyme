// 
// Decompiled by Procyon v0.5.36
// 

package android.support.a.a;

import android.app.Fragment;
import android.os.Build$VERSION;

public final class a
{
    static final b a;
    
    static {
        if (Build$VERSION.SDK_INT >= 15) {
            a = (b)new d();
        }
        else if (Build$VERSION.SDK_INT >= 14) {
            a = (b)new c();
        }
        else {
            a = (b)new a();
        }
    }
    
    public static void a(final Fragment fragment, final boolean b) {
        android.support.a.a.a.a.a(fragment, b);
    }
    
    public static void b(final Fragment fragment, final boolean b) {
        android.support.a.a.a.a.b(fragment, b);
    }
    
    static class a implements b
    {
        @Override
        public void a(final Fragment fragment, final boolean b) {
        }
        
        @Override
        public void b(final Fragment fragment, final boolean b) {
        }
    }
    
    interface b
    {
        void a(final Fragment p0, final boolean p1);
        
        void b(final Fragment p0, final boolean p1);
    }
    
    static class c extends a
    {
        @Override
        public final void a(final Fragment fragment, final boolean b) {
            b.a(fragment, b);
        }
    }
    
    static final class d extends c
    {
        @Override
        public final void b(final Fragment fragment, final boolean b) {
            android.support.a.a.c.a(fragment, b);
        }
    }
}
