// 
// Decompiled by Procyon v0.5.36
// 

package android.support.v4.view;

import android.os.Build$VERSION;

public final class e
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
    
    public static int a(final int n, final int n2) {
        return e.a.a(n, n2);
    }
    
    interface a
    {
        int a(final int p0, final int p1);
    }
    
    static final class b implements a
    {
        @Override
        public final int a(final int n, final int n2) {
            return 0xFF7FFFFF & n;
        }
    }
    
    static final class c implements a
    {
        @Override
        public final int a(final int n, final int n2) {
            return f.a(n, n2);
        }
    }
}
