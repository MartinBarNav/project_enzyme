/*
 * Decompiled with CFR 0.150.
 */
package android.support.v4.e;

public final class c {
    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static void a(Object object, StringBuilder stringBuilder) {
        String string;
        block7: {
            String string2;
            block6: {
                if (object == null) {
                    stringBuilder.append("null");
                    return;
                }
                string2 = object.getClass().getSimpleName();
                if (string2 == null) break block6;
                string = string2;
                if (string2.length() > 0) break block7;
            }
            string2 = object.getClass().getName();
            int n2 = string2.lastIndexOf(46);
            string = string2;
            if (n2 > 0) {
                string = string2.substring(n2 + 1);
            }
        }
        stringBuilder.append(string);
        stringBuilder.append('{');
        stringBuilder.append(Integer.toHexString(System.identityHashCode(object)));
    }
}

