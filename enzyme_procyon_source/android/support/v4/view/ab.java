// 
// Decompiled by Procyon v0.5.36
// 

package android.support.v4.view;

import android.view.ViewConfiguration;
import android.os.Build$VERSION;

public final class ab
{
    static final e a;
    
    static {
        if (Build$VERSION.SDK_INT >= 14) {
            a = (e)new d();
        }
        else if (Build$VERSION.SDK_INT >= 11) {
            a = (e)new c();
        }
        else if (Build$VERSION.SDK_INT >= 8) {
            a = (e)new b();
        }
        else {
            a = (e)new a();
        }
    }
    
    public static int a(final ViewConfiguration viewConfiguration) {
        return ab.a.a(viewConfiguration);
    }
    
    public static boolean b(final ViewConfiguration viewConfiguration) {
        return ab.a.b(viewConfiguration);
    }
    
    static class a implements e
    {
        @Override
        public int a(final ViewConfiguration viewConfiguration) {
            return viewConfiguration.getScaledTouchSlop();
        }
        
        @Override
        public boolean b(final ViewConfiguration viewConfiguration) {
            return true;
        }
    }
    
    static class b extends a
    {
        @Override
        public final int a(final ViewConfiguration viewConfiguration) {
            return ac.a(viewConfiguration);
        }
    }
    
    static class c extends b
    {
        @Override
        public boolean b(final ViewConfiguration viewConfiguration) {
            return false;
        }
    }
    
    static final class d extends c
    {
        @Override
        public final boolean b(final ViewConfiguration viewConfiguration) {
            return ad.a(viewConfiguration);
        }
    }
    
    interface e
    {
        int a(final ViewConfiguration p0);
        
        boolean b(final ViewConfiguration p0);
    }
}
