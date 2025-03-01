package android.support.v4.view;

import android.os.Build;
import android.view.KeyEvent;

public final class g {
    static final d a;

    interface d {
        boolean b(int i);

        boolean c(int i);
    }

    static class a implements d {
        a() {
        }

        private static int a(int i, int i2, int i3, int i4) {
            boolean z = true;
            boolean z2 = (i2 & 1) != 0;
            int i5 = i3 | i4;
            if ((i5 & 1) == 0) {
                z = false;
            }
            if (z2) {
                if (!z) {
                    return i & (i5 ^ -1);
                }
                throw new IllegalArgumentException("bad arguments");
            } else if (z) {
                return i & (i2 ^ -1);
            } else {
                return i;
            }
        }

        public int a(int i) {
            int i2;
            if ((i & 192) != 0) {
                i2 = i | 1;
            } else {
                i2 = i;
            }
            if ((i2 & 48) != 0) {
                i2 |= 2;
            }
            return i2 & 247;
        }

        public boolean b(int i) {
            if (a(a(a(i) & 247, 1, 64, 128), 2, 16, 32) == 1) {
                return true;
            }
            return false;
        }

        public boolean c(int i) {
            return (a(i) & 247) == 0;
        }
    }

    static class b extends a {
        b() {
        }
    }

    static class c extends b {
        c() {
        }

        public final int a(int i) {
            return h.a(i);
        }

        public final boolean b(int i) {
            return h.b(i);
        }

        public final boolean c(int i) {
            return h.c(i);
        }
    }

    static {
        if (Build.VERSION.SDK_INT >= 11) {
            a = new c();
        } else {
            a = new a();
        }
    }

    public static boolean a(KeyEvent keyEvent) {
        return a.b(keyEvent.getMetaState());
    }

    public static boolean b(KeyEvent keyEvent) {
        return a.c(keyEvent.getMetaState());
    }
}
