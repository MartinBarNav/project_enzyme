// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.internal;

import android.os.SystemClock;

public final class g implements f
{
    private static g a;
    
    public static f c() {
        synchronized (g.class) {
            if (g.a == null) {
                g.a = new g();
            }
            return g.a;
        }
    }
    
    @Override
    public final long a() {
        return System.currentTimeMillis();
    }
    
    @Override
    public final long b() {
        return SystemClock.elapsedRealtime();
    }
}
