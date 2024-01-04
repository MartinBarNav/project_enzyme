// 
// Decompiled by Procyon v0.5.36
// 

package android.support.v4.d;

import android.os.Build$VERSION;

public final class a
{
    private static final a a;
    
    static {
        if (Build$VERSION.SDK_INT >= 14) {
            a = (a)new c();
        }
        else {
            a = (a)new b();
        }
    }
    
    public static String a(final String s) {
        return android.support.v4.d.a.a.a(s);
    }
    
    public static String b(final String s) {
        return android.support.v4.d.a.a.b(s);
    }
    
    interface a
    {
        String a(final String p0);
        
        String b(final String p0);
    }
    
    static final class b implements a
    {
        @Override
        public final String a(final String s) {
            return null;
        }
        
        @Override
        public final String b(final String s) {
            return s;
        }
    }
    
    static final class c implements a
    {
        @Override
        public final String a(final String s) {
            return android.support.v4.d.b.a(s);
        }
        
        @Override
        public final String b(final String s) {
            return android.support.v4.d.b.b(s);
        }
    }
}
