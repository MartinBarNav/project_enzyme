/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  android.os.Build$VERSION
 *  android.view.VelocityTracker
 */
package android.support.v4.view;

import android.os.Build;
import android.support.v4.view.t;
import android.view.VelocityTracker;

public final class s {
    static final c a;

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    static {
        if (Build.VERSION.SDK_INT >= 11) {
            a = new b();
            return;
        }
        a = new a();
    }

    public static float a(VelocityTracker velocityTracker, int n2) {
        return a.a(velocityTracker, n2);
    }

    static final class a
    implements c {
        a() {
        }

        @Override
        public final float a(VelocityTracker velocityTracker, int n2) {
            return velocityTracker.getXVelocity();
        }
    }

    static final class b
    implements c {
        b() {
        }

        @Override
        public final float a(VelocityTracker velocityTracker, int n2) {
            return t.a(velocityTracker, n2);
        }
    }

    static interface c {
        public float a(VelocityTracker var1, int var2);
    }
}

