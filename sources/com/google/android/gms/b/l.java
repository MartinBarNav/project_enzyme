package com.google.android.gms.b;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;

public final class l {
    public static String a(String str) {
        try {
            return URLEncoder.encode(str, "UTF-8");
        } catch (UnsupportedEncodingException e) {
            throw new AssertionError("URL encoding failed for: " + str);
        }
    }

    public static String a(k kVar, long j) {
        StringBuilder sb = new StringBuilder();
        sb.append(kVar.a);
        if (kVar.c > 0) {
            long j2 = j - kVar.c;
            if (j2 >= 0) {
                sb.append("&qt=").append(j2);
            }
        }
        sb.append("&z=").append(kVar.b);
        return sb.toString();
    }
}
