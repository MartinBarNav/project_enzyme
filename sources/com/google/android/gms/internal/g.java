package com.google.android.gms.internal;

import android.os.SystemClock;

public final class g implements f {
    private static g a;

    public static synchronized f c() {
        g gVar;
        synchronized (g.class) {
            if (a == null) {
                a = new g();
            }
            gVar = a;
        }
        return gVar;
    }

    public final long a() {
        return System.currentTimeMillis();
    }

    public final long b() {
        return SystemClock.elapsedRealtime();
    }
}
