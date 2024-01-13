package android.support.v4.view;

import android.os.Build;
import android.view.VelocityTracker;

public final class s {
    static final c a;

    interface c {
        float a(VelocityTracker velocityTracker, int i);
    }

    static class a implements c {
        a() {
        }

        public final float a(VelocityTracker velocityTracker, int i) {
            return velocityTracker.getXVelocity();
        }
    }

    static class b implements c {
        b() {
        }

        public final float a(VelocityTracker velocityTracker, int i) {
            return t.a(velocityTracker, i);
        }
    }

    static {
        if (Build.VERSION.SDK_INT >= 11) {
            a = new b();
        } else {
            a = new a();
        }
    }

    public static float a(VelocityTracker velocityTracker, int i) {
        return a.a(velocityTracker, i);
    }
}
