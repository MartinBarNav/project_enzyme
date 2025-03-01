// 
// Decompiled by Procyon v0.5.36
// 

package android.support.v4.view;

import android.os.Bundle;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.support.v4.view.a.d;
import android.view.View;
import android.os.Build$VERSION;

public class a
{
    private static final b b;
    private static final Object c;
    final Object a;
    
    static {
        if (Build$VERSION.SDK_INT >= 16) {
            b = (b)new c();
        }
        else if (Build$VERSION.SDK_INT >= 14) {
            b = (b)new a();
        }
        else {
            b = (b)new d();
        }
        c = a.b.a();
    }
    
    public a() {
        this.a = android.support.v4.view.a.b.a(this);
    }
    
    public static android.support.v4.view.a.d a(final View view) {
        return a.b.a(a.c, view);
    }
    
    public static void a(final View view, final int n) {
        a.b.a(a.c, view, n);
    }
    
    public static void a(final View view, final AccessibilityEvent accessibilityEvent) {
        a.b.d(a.c, view, accessibilityEvent);
    }
    
    public static boolean a(final ViewGroup viewGroup, final View view, final AccessibilityEvent accessibilityEvent) {
        return a.b.a(a.c, viewGroup, view, accessibilityEvent);
    }
    
    public static boolean b(final View view, final AccessibilityEvent accessibilityEvent) {
        return a.b.a(a.c, view, accessibilityEvent);
    }
    
    public static void c(final View view, final AccessibilityEvent accessibilityEvent) {
        a.b.c(a.c, view, accessibilityEvent);
    }
    
    public void a(final View view, final a a) {
        a.b.a(a.c, view, a);
    }
    
    public boolean a(final View view, final int n, final Bundle bundle) {
        return android.support.v4.view.a.b.a(android.support.v4.view.a.c, view, n, bundle);
    }
    
    public void d(final View view, final AccessibilityEvent accessibilityEvent) {
        android.support.v4.view.a.b.b(android.support.v4.view.a.c, view, accessibilityEvent);
    }
    
    static class a extends d
    {
        @Override
        public final Object a() {
            return b.a();
        }
        
        @Override
        public Object a(final android.support.v4.view.a a) {
            return b.a((android.support.v4.view.b.a)new android.support.v4.view.b.a() {
                @Override
                public final void a(final View view, final int n) {
                    android.support.v4.view.a.a(view, n);
                }
                
                @Override
                public final void a(final View view, final Object o) {
                    a.a(view, new a(o));
                }
                
                @Override
                public final boolean a(final View view, final AccessibilityEvent accessibilityEvent) {
                    return android.support.v4.view.a.b(view, accessibilityEvent);
                }
                
                @Override
                public final boolean a(final ViewGroup viewGroup, final View view, final AccessibilityEvent accessibilityEvent) {
                    return android.support.v4.view.a.a(viewGroup, view, accessibilityEvent);
                }
                
                @Override
                public final void b(final View view, final AccessibilityEvent accessibilityEvent) {
                    a.d(view, accessibilityEvent);
                }
                
                @Override
                public final void c(final View view, final AccessibilityEvent accessibilityEvent) {
                    android.support.v4.view.a.c(view, accessibilityEvent);
                }
                
                @Override
                public final void d(final View view, final AccessibilityEvent accessibilityEvent) {
                    android.support.v4.view.a.a(view, accessibilityEvent);
                }
            });
        }
        
        @Override
        public final void a(final Object o, final View view, final int n) {
            b.a(o, view, n);
        }
        
        @Override
        public final void a(final Object o, final View view, final android.support.v4.view.a.a a) {
            b.a(o, view, a.b);
        }
        
        @Override
        public final boolean a(final Object o, final View view, final AccessibilityEvent accessibilityEvent) {
            return b.a(o, view, accessibilityEvent);
        }
        
        @Override
        public final boolean a(final Object o, final ViewGroup viewGroup, final View view, final AccessibilityEvent accessibilityEvent) {
            return b.a(o, viewGroup, view, accessibilityEvent);
        }
        
        @Override
        public final void b(final Object o, final View view, final AccessibilityEvent accessibilityEvent) {
            b.b(o, view, accessibilityEvent);
        }
        
        @Override
        public final void c(final Object o, final View view, final AccessibilityEvent accessibilityEvent) {
            b.c(o, view, accessibilityEvent);
        }
        
        @Override
        public final void d(final Object o, final View view, final AccessibilityEvent accessibilityEvent) {
            b.d(o, view, accessibilityEvent);
        }
    }
    
    interface b
    {
        android.support.v4.view.a.d a(final Object p0, final View p1);
        
        Object a();
        
        Object a(final a p0);
        
        void a(final Object p0, final View p1, final int p2);
        
        void a(final Object p0, final View p1, final a p2);
        
        boolean a(final Object p0, final View p1, final int p2, final Bundle p3);
        
        boolean a(final Object p0, final View p1, final AccessibilityEvent p2);
        
        boolean a(final Object p0, final ViewGroup p1, final View p2, final AccessibilityEvent p3);
        
        void b(final Object p0, final View p1, final AccessibilityEvent p2);
        
        void c(final Object p0, final View p1, final AccessibilityEvent p2);
        
        void d(final Object p0, final View p1, final AccessibilityEvent p2);
    }
    
    static final class c extends a
    {
        @Override
        public final android.support.v4.view.a.d a(Object a, final View view) {
            a = android.support.v4.view.c.a(a, view);
            android.support.v4.view.a.d d;
            if (a != null) {
                d = new android.support.v4.view.a.d(a);
            }
            else {
                d = null;
            }
            return d;
        }
        
        @Override
        public final Object a(final a a) {
            return android.support.v4.view.c.a((android.support.v4.view.c.a)new android.support.v4.view.c.a() {
                @Override
                public final Object a(final View view) {
                    final android.support.v4.view.a.d a = android.support.v4.view.a.a(view);
                    Object a2;
                    if (a != null) {
                        a2 = a.a;
                    }
                    else {
                        a2 = null;
                    }
                    return a2;
                }
                
                @Override
                public final void a(final View view, final int n) {
                    android.support.v4.view.a.a(view, n);
                }
                
                @Override
                public final void a(final View view, final Object o) {
                    a.a(view, new a(o));
                }
                
                @Override
                public final boolean a(final View view, final int n, final Bundle bundle) {
                    return a.a(view, n, bundle);
                }
                
                @Override
                public final boolean a(final View view, final AccessibilityEvent accessibilityEvent) {
                    return android.support.v4.view.a.b(view, accessibilityEvent);
                }
                
                @Override
                public final boolean a(final ViewGroup viewGroup, final View view, final AccessibilityEvent accessibilityEvent) {
                    return android.support.v4.view.a.a(viewGroup, view, accessibilityEvent);
                }
                
                @Override
                public final void b(final View view, final AccessibilityEvent accessibilityEvent) {
                    a.d(view, accessibilityEvent);
                }
                
                @Override
                public final void c(final View view, final AccessibilityEvent accessibilityEvent) {
                    android.support.v4.view.a.c(view, accessibilityEvent);
                }
                
                @Override
                public final void d(final View view, final AccessibilityEvent accessibilityEvent) {
                    android.support.v4.view.a.a(view, accessibilityEvent);
                }
            });
        }
        
        @Override
        public final boolean a(final Object o, final View view, final int n, final Bundle bundle) {
            return android.support.v4.view.c.a(o, view, n, bundle);
        }
    }
    
    static class d implements b
    {
        @Override
        public android.support.v4.view.a.d a(final Object o, final View view) {
            return null;
        }
        
        @Override
        public Object a() {
            return null;
        }
        
        @Override
        public Object a(final a a) {
            return null;
        }
        
        @Override
        public void a(final Object o, final View view, final int n) {
        }
        
        @Override
        public void a(final Object o, final View view, final a a) {
        }
        
        @Override
        public boolean a(final Object o, final View view, final int n, final Bundle bundle) {
            return false;
        }
        
        @Override
        public boolean a(final Object o, final View view, final AccessibilityEvent accessibilityEvent) {
            return false;
        }
        
        @Override
        public boolean a(final Object o, final ViewGroup viewGroup, final View view, final AccessibilityEvent accessibilityEvent) {
            return true;
        }
        
        @Override
        public void b(final Object o, final View view, final AccessibilityEvent accessibilityEvent) {
        }
        
        @Override
        public void c(final Object o, final View view, final AccessibilityEvent accessibilityEvent) {
        }
        
        @Override
        public void d(final Object o, final View view, final AccessibilityEvent accessibilityEvent) {
        }
    }
}
