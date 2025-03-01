// 
// Decompiled by Procyon v0.5.36
// 

package android.support.v4.view;

import java.util.WeakHashMap;
import android.view.animation.Interpolator;
import android.os.Build$VERSION;
import android.view.View;
import java.lang.ref.WeakReference;

public final class ae
{
    public static final f b;
    public WeakReference<View> a;
    private Runnable c;
    private Runnable d;
    private int e;
    
    static {
        final int sdk_INT = Build$VERSION.SDK_INT;
        if (sdk_INT >= 19) {
            b = (f)new e();
        }
        else if (sdk_INT >= 18) {
            b = (f)new c();
        }
        else if (sdk_INT >= 16) {
            b = (f)new d();
        }
        else if (sdk_INT >= 14) {
            b = (f)new b();
        }
        else {
            b = (f)new a();
        }
    }
    
    ae(final View referent) {
        this.c = null;
        this.d = null;
        this.e = -1;
        this.a = new WeakReference<View>(referent);
    }
    
    public final ae a(final float n) {
        final View view = this.a.get();
        if (view != null) {
            ae.b.a(this, view, n);
        }
        return this;
    }
    
    public final ae a(final long n) {
        final View view = this.a.get();
        if (view != null) {
            ae.b.a(view, n);
        }
        return this;
    }
    
    public final ae a(final ah ah) {
        final View view = this.a.get();
        if (view != null) {
            ae.b.a(this, view, ah);
        }
        return this;
    }
    
    public final ae a(final Interpolator interpolator) {
        final View view = this.a.get();
        if (view != null) {
            ae.b.a(view, interpolator);
        }
        return this;
    }
    
    public final void a() {
        final View view = this.a.get();
        if (view != null) {
            ae.b.c(this, view);
        }
    }
    
    static class a implements f
    {
        WeakHashMap<View, Runnable> a;
        
        a() {
            this.a = null;
        }
        
        private void f(final ae ae, final View view) {
            Runnable runnable = null;
            if (this.a != null) {
                runnable = this.a.get(view);
            }
            Runnable value;
            if ((value = runnable) == null) {
                value = ae.new a(view, (byte)0);
                if (this.a == null) {
                    this.a = new WeakHashMap<View, Runnable>();
                }
                this.a.put(view, value);
            }
            view.removeCallbacks(value);
            view.post(value);
        }
        
        @Override
        public void a(final ae ae, final View view) {
            this.f(ae, view);
        }
        
        @Override
        public void a(final ae ae, final View view, final float n) {
            this.f(ae, view);
        }
        
        @Override
        public void a(final ae ae, final View view, final ah ah) {
            view.setTag(2113929216, (Object)ah);
        }
        
        @Override
        public void a(final View view, final long n) {
        }
        
        @Override
        public void a(final View view, final Interpolator interpolator) {
        }
        
        @Override
        public void b(final ae ae, final View view) {
            this.f(ae, view);
        }
        
        @Override
        public void c(final ae ae, final View view) {
            this.f(ae, view);
        }
        
        @Override
        public void d(final ae ae, final View key) {
            if (this.a != null) {
                final Runnable runnable = this.a.get(key);
                if (runnable != null) {
                    key.removeCallbacks(runnable);
                }
            }
            this.e(ae, key);
        }
        
        final void e(final ae ae, final View key) {
            final Object tag = key.getTag(2113929216);
            ah ah;
            if (tag instanceof ah) {
                ah = (ah)tag;
            }
            else {
                ah = null;
            }
            final Runnable a = ae.c;
            final Runnable b = ae.d;
            if (a != null) {
                a.run();
            }
            if (ah != null) {
                ah.a(key);
                ah.b(key);
            }
            if (b != null) {
                b.run();
            }
            if (this.a != null) {
                this.a.remove(key);
            }
        }
        
        final class a implements Runnable
        {
            WeakReference<View> a;
            ae b;
            
            private a(final ae b, final View referent) {
                this.a = new WeakReference<View>(referent);
                this.b = b;
            }
            
            @Override
            public final void run() {
                ae.a.this.e(this.b, this.a.get());
            }
        }
    }
    
    static class b extends ae.a
    {
        WeakHashMap<View, Integer> b;
        
        b() {
            this.b = null;
        }
        
        @Override
        public final void a(final ae ae, final View view) {
            af.a(view);
        }
        
        @Override
        public final void a(final ae ae, final View view, final float n) {
            af.a(view, n);
        }
        
        @Override
        public void a(final ae ae, final View view, final ah ah) {
            view.setTag(2113929216, (Object)ah);
            af.a(view, new a(ae));
        }
        
        @Override
        public final void a(final View view, final long n) {
            af.a(view, n);
        }
        
        @Override
        public final void a(final View view, final Interpolator interpolator) {
            af.a(view, interpolator);
        }
        
        @Override
        public final void b(final ae ae, final View view) {
            af.b(view);
        }
        
        @Override
        public final void c(final ae ae, final View view) {
            af.c(view);
        }
        
        @Override
        public final void d(final ae ae, final View view) {
            af.d(view);
        }
        
        static final class a implements ah
        {
            ae a;
            
            a(final ae a) {
                this.a = a;
            }
            
            @Override
            public final void a(final View view) {
                if (this.a.e >= 0) {
                    u.b(view, 2);
                }
                if (this.a.c != null) {
                    this.a.c.run();
                }
                final Object tag = view.getTag(2113929216);
                ah ah;
                if (tag instanceof ah) {
                    ah = (ah)tag;
                }
                else {
                    ah = null;
                }
                if (ah != null) {
                    ah.a(view);
                }
            }
            
            @Override
            public final void b(final View view) {
                if (this.a.e >= 0) {
                    u.b(view, this.a.e);
                    this.a.e = -1;
                }
                if (this.a.d != null) {
                    this.a.d.run();
                }
                final Object tag = view.getTag(2113929216);
                ah ah;
                if (tag instanceof ah) {
                    ah = (ah)tag;
                }
                else {
                    ah = null;
                }
                if (ah != null) {
                    ah.b(view);
                }
            }
            
            @Override
            public final void c(final View view) {
                final Object tag = view.getTag(2113929216);
                ah ah;
                if (tag instanceof ah) {
                    ah = (ah)tag;
                }
                else {
                    ah = null;
                }
                if (ah != null) {
                    ah.c(view);
                }
            }
        }
    }
    
    static class c extends d
    {
    }
    
    static class d extends b
    {
        @Override
        public final void a(final ae ae, final View view, final ah ah) {
            ag.a(view, ah);
        }
    }
    
    static final class e extends c
    {
    }
    
    public interface f
    {
        void a(final ae p0, final View p1);
        
        void a(final ae p0, final View p1, final float p2);
        
        void a(final ae p0, final View p1, final ah p2);
        
        void a(final View p0, final long p1);
        
        void a(final View p0, final Interpolator p1);
        
        void b(final ae p0, final View p1);
        
        void c(final ae p0, final View p1);
        
        void d(final ae p0, final View p1);
    }
}
