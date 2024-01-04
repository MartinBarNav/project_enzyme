// 
// Decompiled by Procyon v0.5.36
// 

package android.support.v4.d;

import java.util.Locale;

public final class c
{
    public static final Locale a;
    private static String b;
    private static String c;
    
    static {
        a = new Locale("", "");
        android.support.v4.d.c.b = "Arab";
        android.support.v4.d.c.c = "Hebr";
    }
    
    public static int a(final Locale inLocale) {
        final int n = 1;
        if (inLocale == null || inLocale.equals(android.support.v4.d.c.a)) {
            return 0;
        }
        final String a = android.support.v4.d.a.a(android.support.v4.d.a.b(inLocale.toString()));
        int n2;
        if (a == null) {
            n2 = n;
            switch (Character.getDirectionality(inLocale.getDisplayName(inLocale).charAt(0))) {
                default: {
                    n2 = 0;
                    break;
                }
                case 1:
                case 2: {
                    break;
                }
            }
        }
        else {
            n2 = n;
            if (!a.equalsIgnoreCase(android.support.v4.d.c.b)) {
                n2 = n;
                if (!a.equalsIgnoreCase(android.support.v4.d.c.c)) {
                    return 0;
                }
            }
        }
        return n2;
        n2 = 0;
        return n2;
    }
}
