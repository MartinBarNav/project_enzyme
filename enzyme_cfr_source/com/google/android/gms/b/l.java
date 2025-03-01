/*
 * Decompiled with CFR 0.150.
 */
package com.google.android.gms.b;

import com.google.android.gms.b.k;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;

public final class l {
    public static String a(k k2, long l2) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(k2.a);
        if (k2.c > 0L && (l2 -= k2.c) >= 0L) {
            stringBuilder.append("&qt=").append(l2);
        }
        stringBuilder.append("&z=").append(k2.b);
        return stringBuilder.toString();
    }

    public static String a(String string) {
        try {
            String string2 = URLEncoder.encode(string, "UTF-8");
            return string2;
        }
        catch (UnsupportedEncodingException unsupportedEncodingException) {
            throw new AssertionError((Object)("URL encoding failed for: " + string));
        }
    }
}

