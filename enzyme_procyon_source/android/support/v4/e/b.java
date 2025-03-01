// 
// Decompiled by Procyon v0.5.36
// 

package android.support.v4.e;

final class b
{
    static final int[] a;
    static final long[] b;
    static final Object[] c;
    
    static {
        a = new int[0];
        b = new long[0];
        c = new Object[0];
    }
    
    static int a(final int[] array, int n, final int n2) {
        --n;
        int i = 0;
        while (i <= n) {
            final int n3 = i + n >>> 1;
            final int n4 = array[n3];
            if (n4 < n2) {
                i = n3 + 1;
            }
            else {
                n = n3;
                if (n4 <= n2) {
                    return n;
                }
                n = n3 - 1;
            }
        }
        n = ~i;
        return n;
    }
    
    public static boolean a(final Object o, final Object obj) {
        return o == obj || (o != null && o.equals(obj));
    }
}
