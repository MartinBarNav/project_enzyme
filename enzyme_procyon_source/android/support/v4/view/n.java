// 
// Decompiled by Procyon v0.5.36
// 

package android.support.v4.view;

import android.view.MotionEvent;
import android.os.Build$VERSION;

public final class n
{
    static final c a;
    
    static {
        if (Build$VERSION.SDK_INT >= 5) {
            a = (c)new b();
        }
        else {
            a = (c)new a();
        }
    }
    
    public static int a(final MotionEvent motionEvent) {
        return motionEvent.getAction() & 0xFF;
    }
    
    public static int a(final MotionEvent motionEvent, final int n) {
        return n.a.a(motionEvent, n);
    }
    
    public static int b(final MotionEvent motionEvent) {
        return (motionEvent.getAction() & 0xFF00) >> 8;
    }
    
    public static int b(final MotionEvent motionEvent, final int n) {
        return n.a.b(motionEvent, n);
    }
    
    public static float c(final MotionEvent motionEvent, final int n) {
        return n.a.c(motionEvent, n);
    }
    
    public static float d(final MotionEvent motionEvent, final int n) {
        return n.a.d(motionEvent, n);
    }
    
    static final class a implements c
    {
        @Override
        public final int a(final MotionEvent motionEvent, int n) {
            if (n == 0) {
                n = 0;
            }
            else {
                n = -1;
            }
            return n;
        }
        
        @Override
        public final int b(final MotionEvent motionEvent, final int n) {
            if (n == 0) {
                return 0;
            }
            throw new IndexOutOfBoundsException("Pre-Eclair does not support multiple pointers");
        }
        
        @Override
        public final float c(final MotionEvent motionEvent, final int n) {
            if (n == 0) {
                return motionEvent.getX();
            }
            throw new IndexOutOfBoundsException("Pre-Eclair does not support multiple pointers");
        }
        
        @Override
        public final float d(final MotionEvent motionEvent, final int n) {
            if (n == 0) {
                return motionEvent.getY();
            }
            throw new IndexOutOfBoundsException("Pre-Eclair does not support multiple pointers");
        }
    }
    
    static final class b implements c
    {
        @Override
        public final int a(final MotionEvent motionEvent, final int n) {
            return o.a(motionEvent, n);
        }
        
        @Override
        public final int b(final MotionEvent motionEvent, final int n) {
            return o.b(motionEvent, n);
        }
        
        @Override
        public final float c(final MotionEvent motionEvent, final int n) {
            return o.c(motionEvent, n);
        }
        
        @Override
        public final float d(final MotionEvent motionEvent, final int n) {
            return o.d(motionEvent, n);
        }
    }
    
    interface c
    {
        int a(final MotionEvent p0, final int p1);
        
        int b(final MotionEvent p0, final int p1);
        
        float c(final MotionEvent p0, final int p1);
        
        float d(final MotionEvent p0, final int p1);
    }
}
