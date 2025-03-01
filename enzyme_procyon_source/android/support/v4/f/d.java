// 
// Decompiled by Procyon v0.5.36
// 

package android.support.v4.f;

import android.graphics.Canvas;
import android.content.Context;
import android.os.Build$VERSION;

public final class d
{
    private static final c b;
    private Object a;
    
    static {
        if (Build$VERSION.SDK_INT >= 14) {
            b = (c)new b();
        }
        else {
            b = (c)new a();
        }
    }
    
    public d(final Context context) {
        this.a = d.b.a(context);
    }
    
    public final void a(final int n, final int n2) {
        d.b.a(this.a, n, n2);
    }
    
    public final boolean a() {
        return d.b.a(this.a);
    }
    
    public final boolean a(final float n) {
        return d.b.a(this.a, n);
    }
    
    public final boolean a(final Canvas canvas) {
        return d.b.a(this.a, canvas);
    }
    
    public final void b() {
        d.b.b(this.a);
    }
    
    public final boolean c() {
        return d.b.c(this.a);
    }
    
    static final class a implements c
    {
        @Override
        public final Object a(final Context context) {
            return null;
        }
        
        @Override
        public final void a(final Object o, final int n, final int n2) {
        }
        
        @Override
        public final boolean a(final Object o) {
            return true;
        }
        
        @Override
        public final boolean a(final Object o, final float n) {
            return false;
        }
        
        @Override
        public final boolean a(final Object o, final Canvas canvas) {
            return false;
        }
        
        @Override
        public final void b(final Object o) {
        }
        
        @Override
        public final boolean c(final Object o) {
            return false;
        }
    }
    
    static final class b implements c
    {
        @Override
        public final Object a(final Context context) {
            return e.a(context);
        }
        
        @Override
        public final void a(final Object o, final int n, final int n2) {
            e.a(o, n, n2);
        }
        
        @Override
        public final boolean a(final Object o) {
            return e.a(o);
        }
        
        @Override
        public final boolean a(final Object o, final float n) {
            return e.a(o, n);
        }
        
        @Override
        public final boolean a(final Object o, final Canvas canvas) {
            return e.a(o, canvas);
        }
        
        @Override
        public final void b(final Object o) {
            e.b(o);
        }
        
        @Override
        public final boolean c(final Object o) {
            return e.c(o);
        }
    }
    
    interface c
    {
        Object a(final Context p0);
        
        void a(final Object p0, final int p1, final int p2);
        
        boolean a(final Object p0);
        
        boolean a(final Object p0, final float p1);
        
        boolean a(final Object p0, final Canvas p1);
        
        void b(final Object p0);
        
        boolean c(final Object p0);
    }
}
