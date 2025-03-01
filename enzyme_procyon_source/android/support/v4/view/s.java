// 
// Decompiled by Procyon v0.5.36
// 

package android.support.v4.view;

import android.view.VelocityTracker;
import android.os.Build$VERSION;

public final class s
{
    static final c a;
    
    static {
        if (Build$VERSION.SDK_INT >= 11) {
            a = (c)new b();
        }
        else {
            a = (c)new a();
        }
    }
    
    public static float a(final VelocityTracker velocityTracker, final int n) {
        return s.a.a(velocityTracker, n);
    }
    
    static final class a implements c
    {
        @Override
        public final float a(final VelocityTracker velocityTracker, final int n) {
            return velocityTracker.getXVelocity();
        }
    }
    
    static final class b implements c
    {
        @Override
        public final float a(final VelocityTracker velocityTracker, final int n) {
            return t.a(velocityTracker, n);
        }
    }
    
    interface c
    {
        float a(final VelocityTracker p0, final int p1);
    }
}
