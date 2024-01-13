package android.support.v4.view;

import android.os.Build;
import android.view.MotionEvent;

public final class n {
    static final c a;

    interface c {
        int a(MotionEvent motionEvent, int i);

        int b(MotionEvent motionEvent, int i);

        float c(MotionEvent motionEvent, int i);

        float d(MotionEvent motionEvent, int i);
    }

    static class a implements c {
        a() {
        }

        public final int a(MotionEvent motionEvent, int i) {
            if (i == 0) {
                return 0;
            }
            return -1;
        }

        public final int b(MotionEvent motionEvent, int i) {
            if (i == 0) {
                return 0;
            }
            throw new IndexOutOfBoundsException("Pre-Eclair does not support multiple pointers");
        }

        public final float c(MotionEvent motionEvent, int i) {
            if (i == 0) {
                return motionEvent.getX();
            }
            throw new IndexOutOfBoundsException("Pre-Eclair does not support multiple pointers");
        }

        public final float d(MotionEvent motionEvent, int i) {
            if (i == 0) {
                return motionEvent.getY();
            }
            throw new IndexOutOfBoundsException("Pre-Eclair does not support multiple pointers");
        }
    }

    static class b implements c {
        b() {
        }

        public final int a(MotionEvent motionEvent, int i) {
            return o.a(motionEvent, i);
        }

        public final int b(MotionEvent motionEvent, int i) {
            return o.b(motionEvent, i);
        }

        public final float c(MotionEvent motionEvent, int i) {
            return o.c(motionEvent, i);
        }

        public final float d(MotionEvent motionEvent, int i) {
            return o.d(motionEvent, i);
        }
    }

    static {
        if (Build.VERSION.SDK_INT >= 5) {
            a = new b();
        } else {
            a = new a();
        }
    }

    public static int a(MotionEvent motionEvent) {
        return motionEvent.getAction() & 255;
    }

    public static int b(MotionEvent motionEvent) {
        return (motionEvent.getAction() & 65280) >> 8;
    }

    public static int a(MotionEvent motionEvent, int i) {
        return a.a(motionEvent, i);
    }

    public static int b(MotionEvent motionEvent, int i) {
        return a.b(motionEvent, i);
    }

    public static float c(MotionEvent motionEvent, int i) {
        return a.c(motionEvent, i);
    }

    public static float d(MotionEvent motionEvent, int i) {
        return a.d(motionEvent, i);
    }
}
