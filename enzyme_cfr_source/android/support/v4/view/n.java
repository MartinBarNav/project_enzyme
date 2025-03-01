/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  android.os.Build$VERSION
 *  android.view.MotionEvent
 */
package android.support.v4.view;

import android.os.Build;
import android.support.v4.view.o;
import android.view.MotionEvent;

public final class n {
    static final c a;

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    static {
        if (Build.VERSION.SDK_INT >= 5) {
            a = new b();
            return;
        }
        a = new a();
    }

    public static int a(MotionEvent motionEvent) {
        return motionEvent.getAction() & 0xFF;
    }

    public static int a(MotionEvent motionEvent, int n2) {
        return a.a(motionEvent, n2);
    }

    public static int b(MotionEvent motionEvent) {
        return (motionEvent.getAction() & 0xFF00) >> 8;
    }

    public static int b(MotionEvent motionEvent, int n2) {
        return a.b(motionEvent, n2);
    }

    public static float c(MotionEvent motionEvent, int n2) {
        return a.c(motionEvent, n2);
    }

    public static float d(MotionEvent motionEvent, int n2) {
        return a.d(motionEvent, n2);
    }

    static final class a
    implements c {
        a() {
        }

        /*
         * Enabled force condition propagation
         * Lifted jumps to return sites
         */
        @Override
        public final int a(MotionEvent motionEvent, int n2) {
            if (n2 != 0) return -1;
            return 0;
        }

        @Override
        public final int b(MotionEvent motionEvent, int n2) {
            if (n2 == 0) {
                return 0;
            }
            throw new IndexOutOfBoundsException("Pre-Eclair does not support multiple pointers");
        }

        @Override
        public final float c(MotionEvent motionEvent, int n2) {
            if (n2 == 0) {
                return motionEvent.getX();
            }
            throw new IndexOutOfBoundsException("Pre-Eclair does not support multiple pointers");
        }

        @Override
        public final float d(MotionEvent motionEvent, int n2) {
            if (n2 == 0) {
                return motionEvent.getY();
            }
            throw new IndexOutOfBoundsException("Pre-Eclair does not support multiple pointers");
        }
    }

    static final class b
    implements c {
        b() {
        }

        @Override
        public final int a(MotionEvent motionEvent, int n2) {
            return o.a(motionEvent, n2);
        }

        @Override
        public final int b(MotionEvent motionEvent, int n2) {
            return o.b(motionEvent, n2);
        }

        @Override
        public final float c(MotionEvent motionEvent, int n2) {
            return o.c(motionEvent, n2);
        }

        @Override
        public final float d(MotionEvent motionEvent, int n2) {
            return o.d(motionEvent, n2);
        }
    }

    static interface c {
        public int a(MotionEvent var1, int var2);

        public int b(MotionEvent var1, int var2);

        public float c(MotionEvent var1, int var2);

        public float d(MotionEvent var1, int var2);
    }
}

