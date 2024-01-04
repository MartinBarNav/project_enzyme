// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.b;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;

public final class l
{
    public static String a(final k k, long lng) {
        final StringBuilder sb = new StringBuilder();
        sb.append(k.a);
        if (k.c > 0L) {
            lng -= k.c;
            if (lng >= 0L) {
                sb.append("&qt=").append(lng);
            }
        }
        sb.append("&z=").append(k.b);
        return sb.toString();
    }
    
    public static String a(final String s) {
        try {
            return URLEncoder.encode(s, "UTF-8");
        }
        catch (UnsupportedEncodingException ex) {
            throw new AssertionError((Object)("URL encoding failed for: " + s));
        }
    }
}
