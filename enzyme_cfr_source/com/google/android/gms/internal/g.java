/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  android.os.SystemClock
 */
package com.google.android.gms.internal;

import android.os.SystemClock;
import com.google.android.gms.internal.f;

public final class g
implements f {
    private static g a;

    public static f c() {
        synchronized (g.class) {
            g g2;
            if (a == null) {
                a = g2 = new g();
            }
            g2 = a;
            return g2;
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

