// 
// Decompiled by Procyon v0.5.36
// 

package android.support.v4.f;

import android.view.animation.Interpolator;
import android.widget.Scroller;
import android.os.Build$VERSION;
import android.content.Context;

public final class j
{
    public Object a;
    public a b;
    
    private j(final int n, final Context context) {
        if (n >= 14) {
            this.b = (a)new d();
        }
        else if (n >= 9) {
            this.b = (a)new c();
        }
        else {
            this.b = (a)new b();
        }
        this.a = this.b.a(context);
    }
    
    public j(final Context context) {
        this(Build$VERSION.SDK_INT, context);
    }
    
    public interface a
    {
        int a(final Object p0);
        
        Object a(final Context p0);
        
        void a(final Object p0, final int p1);
    }
    
    static final class b implements a
    {
        @Override
        public final int a(final Object o) {
            return ((Scroller)o).getFinalY();
        }
        
        @Override
        public final Object a(final Context context) {
            return new Scroller(context);
        }
        
        @Override
        public final void a(final Object o, final int n) {
            ((Scroller)o).fling(0, 0, 0, n, 0, 0, Integer.MIN_VALUE, Integer.MAX_VALUE);
        }
    }
    
    static class c implements a
    {
        @Override
        public final int a(final Object o) {
            return k.a(o);
        }
        
        @Override
        public final Object a(final Context context) {
            return k.a(context, null);
        }
        
        @Override
        public final void a(final Object o, final int n) {
            k.a(o, n);
        }
    }
    
    static final class d extends c
    {
    }
}
