// 
// Decompiled by Procyon v0.5.36
// 

package android.support.v4.view.a;

import java.util.ArrayList;
import java.util.List;
import android.os.Build$VERSION;

public final class d
{
    private static final a b;
    public final Object a;
    
    static {
        if (Build$VERSION.SDK_INT >= 19) {
            b = (a)new c();
        }
        else if (Build$VERSION.SDK_INT >= 16) {
            b = (a)new b();
        }
        else {
            b = (a)new d();
        }
    }
    
    public d() {
        this.a = d.b.a(this);
    }
    
    public d(final Object a) {
        this.a = a;
    }
    
    public static android.support.v4.view.a.a a() {
        return null;
    }
    
    public static boolean b() {
        return false;
    }
    
    public static List<android.support.v4.view.a.a> c() {
        return null;
    }
    
    public static android.support.v4.view.a.a d() {
        return null;
    }
    
    interface a
    {
        Object a(final d p0);
    }
    
    static final class b extends d
    {
        @Override
        public final Object a(final d d) {
            return e.a((e.a)new e.a() {
                @Override
                public final boolean a() {
                    return d.b();
                }
                
                @Override
                public final List<Object> b() {
                    d.c();
                    new ArrayList();
                    throw new NullPointerException();
                }
                
                @Override
                public final Object c() {
                    d.a();
                    return null;
                }
            });
        }
    }
    
    static final class c extends d
    {
        @Override
        public final Object a(final d d) {
            return f.a((f.a)new f.a() {
                @Override
                public final boolean a() {
                    return d.b();
                }
                
                @Override
                public final List<Object> b() {
                    d.c();
                    new ArrayList();
                    throw new NullPointerException();
                }
                
                @Override
                public final Object c() {
                    d.a();
                    return null;
                }
                
                @Override
                public final Object d() {
                    d.d();
                    return null;
                }
            });
        }
    }
    
    static class d implements a
    {
        @Override
        public Object a(final android.support.v4.view.a.d d) {
            return null;
        }
    }
}
