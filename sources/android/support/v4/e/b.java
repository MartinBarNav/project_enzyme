package android.support.v4.e;

final class b {
    static final int[] a = new int[0];
    static final long[] b = new long[0];
    static final Object[] c = new Object[0];

    public static boolean a(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    static int a(int[] iArr, int i, int i2) {
        int i3 = i - 1;
        int i4 = 0;
        while (i4 <= i3) {
            int i5 = (i4 + i3) >>> 1;
            int i6 = iArr[i5];
            if (i6 < i2) {
                i4 = i5 + 1;
            } else if (i6 <= i2) {
                return i5;
            } else {
                i3 = i5 - 1;
            }
        }
        return i4 ^ -1;
    }
}
