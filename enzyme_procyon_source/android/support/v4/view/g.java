// 
// Decompiled by Procyon v0.5.36
// 

package android.support.v4.view;

import android.view.KeyEvent;
import android.os.Build$VERSION;

public final class g
{
    static final d a;
    
    static {
        if (Build$VERSION.SDK_INT >= 11) {
            a = (d)new c();
        }
        else {
            a = (d)new a();
        }
    }
    
    public static boolean a(final KeyEvent keyEvent) {
        return g.a.b(keyEvent.getMetaState());
    }
    
    public static boolean b(final KeyEvent keyEvent) {
        return g.a.c(keyEvent.getMetaState());
    }
    
    static class a implements d
    {
        private static int a(final int n, final int n2, int n3, int n4) {
            final int n5 = 1;
            int n6;
            if ((n2 & 0x1) != 0x0) {
                n6 = 1;
            }
            else {
                n6 = 0;
            }
            n3 |= n4;
            if ((n3 & 0x1) != 0x0) {
                n4 = n5;
            }
            else {
                n4 = 0;
            }
            if (n6 != 0) {
                if (n4 != 0) {
                    throw new IllegalArgumentException("bad arguments");
                }
                n3 = (n & ~n3);
            }
            else {
                n3 = n;
                if (n4 != 0) {
                    n3 = (n & ~n2);
                }
            }
            return n3;
        }
        
        public int a(int n) {
            if ((n & 0xC0) != 0x0) {
                n |= 0x1;
            }
            int n2 = n;
            if ((n & 0x30) != 0x0) {
                n2 = (n | 0x2);
            }
            return n2 & 0xF7;
        }
        
        @Override
        public boolean b(final int n) {
            boolean b = true;
            if (a(a(this.a(n) & 0xF7, 1, 64, 128), 2, 16, 32) != 1) {
                b = false;
            }
            return b;
        }
        
        @Override
        public boolean c(final int n) {
            return (this.a(n) & 0xF7) == 0x0;
        }
    }
    
    static class b extends a
    {
    }
    
    static final class c extends b
    {
        @Override
        public final int a(final int n) {
            return h.a(n);
        }
        
        @Override
        public final boolean b(final int n) {
            return h.b(n);
        }
        
        @Override
        public final boolean c(final int n) {
            return h.c(n);
        }
    }
    
    interface d
    {
        boolean b(final int p0);
        
        boolean c(final int p0);
    }
}
