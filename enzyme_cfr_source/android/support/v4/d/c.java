/*
 * Decompiled with CFR 0.150.
 */
package android.support.v4.d;

import android.support.v4.d.a;
import java.util.Locale;

public final class c {
    public static final Locale a = new Locale("", "");
    private static String b = "Arab";
    private static String c = "Hebr";

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static int a(Locale locale) {
        int n2;
        int n3 = 1;
        if (locale == null) return 0;
        if (locale.equals(a)) return 0;
        String string = android.support.v4.d.a.a(android.support.v4.d.a.b(locale.toString()));
        if (string == null) {
            n2 = n3;
            switch (Character.getDirectionality(locale.getDisplayName(locale).charAt(0))) {
                default: {
                    return 0;
                }
                case 1: 
                case 2: 
            }
            return n2;
        }
        n2 = n3;
        if (string.equalsIgnoreCase(b)) return n2;
        n2 = n3;
        if (string.equalsIgnoreCase(c)) return n2;
        return 0;
    }
}

