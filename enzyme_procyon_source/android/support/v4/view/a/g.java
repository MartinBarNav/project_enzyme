// 
// Decompiled by Procyon v0.5.36
// 

package android.support.v4.view.a;

import android.os.Build$VERSION;

public final class g
{
    public static final c a;
    public final Object b;
    
    static {
        if (Build$VERSION.SDK_INT >= 16) {
            a = (c)new d();
        }
        else if (Build$VERSION.SDK_INT >= 15) {
            a = (c)new b();
        }
        else if (Build$VERSION.SDK_INT >= 14) {
            a = (c)new a();
        }
        else {
            a = (c)new e();
        }
    }
    
    private g(final Object b) {
        this.b = b;
    }
    
    public static g a() {
        return new g(g.a.a());
    }
    
    @Override
    public final boolean equals(final Object o) {
        boolean b = true;
        if (this != o) {
            if (o == null) {
                b = false;
            }
            else if (this.getClass() != o.getClass()) {
                b = false;
            }
            else {
                final g g = (g)o;
                if (this.b == null) {
                    if (g.b != null) {
                        b = false;
                    }
                }
                else if (!this.b.equals(g.b)) {
                    b = false;
                }
            }
        }
        return b;
    }
    
    @Override
    public final int hashCode() {
        int hashCode;
        if (this.b == null) {
            hashCode = 0;
        }
        else {
            hashCode = this.b.hashCode();
        }
        return hashCode;
    }
    
    static class a extends e
    {
        @Override
        public final Object a() {
            return h.a();
        }
        
        @Override
        public final void a(final Object o, final int n) {
            h.a(o, n);
        }
        
        @Override
        public final void a(final Object o, final boolean b) {
            h.a(o, b);
        }
        
        @Override
        public final void b(final Object o, final int n) {
            h.b(o, n);
        }
        
        @Override
        public final void c(final Object o, final int n) {
            h.c(o, n);
        }
    }
    
    static class b extends a
    {
    }
    
    public interface c
    {
        Object a();
        
        void a(final Object p0, final int p1);
        
        void a(final Object p0, final boolean p1);
        
        void b(final Object p0, final int p1);
        
        void c(final Object p0, final int p1);
    }
    
    static final class d extends b
    {
    }
    
    static class e implements c
    {
        @Override
        public Object a() {
            return null;
        }
        
        @Override
        public void a(final Object o, final int n) {
        }
        
        @Override
        public void a(final Object o, final boolean b) {
        }
        
        @Override
        public void b(final Object o, final int n) {
        }
        
        @Override
        public void c(final Object o, final int n) {
        }
    }
}
