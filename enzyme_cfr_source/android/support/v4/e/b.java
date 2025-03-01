/*
 * Decompiled with CFR 0.150.
 */
package android.support.v4.e;

final class b {
    static final int[] a = new int[0];
    static final long[] b = new long[0];
    static final Object[] c = new Object[0];

    static int a(int[] arrn, int n2, int n3) {
        block3: {
            --n2;
            int n4 = 0;
            while (n4 <= n2) {
                int n5 = n4 + n2 >>> 1;
                int n6 = arrn[n5];
                if (n6 < n3) {
                    n4 = n5 + 1;
                    continue;
                }
                n2 = n5;
                if (n6 > n3) {
                    n2 = n5 - 1;
                    continue;
                }
                break block3;
            }
            n2 = ~n4;
        }
        return n2;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static boolean a(Object object, Object object2) {
        if (object == object2) return true;
        if (object == null) return false;
        if (!object.equals(object2)) return false;
        return true;
    }
}

