// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.b;

import java.security.NoSuchAlgorithmException;
import java.security.MessageDigest;
import java.io.Serializable;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.util.HashMap;
import java.util.Map;
import android.text.TextUtils;
import java.util.Locale;

public final class w
{
    private static final char[] a;
    
    static {
        a = new char[] { '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F' };
    }
    
    static String a() {
        return "1";
    }
    
    public static String a(final Locale locale) {
        String string = null;
        if (locale != null && !TextUtils.isEmpty((CharSequence)locale.getLanguage())) {
            final StringBuilder sb = new StringBuilder();
            sb.append(locale.getLanguage().toLowerCase());
            if (!TextUtils.isEmpty((CharSequence)locale.getCountry())) {
                sb.append("-").append(locale.getCountry().toLowerCase());
            }
            string = sb.toString();
        }
        return string;
    }
    
    public static Map<String, String> a(final String s) {
        final HashMap<String, String> hashMap = new HashMap<String, String>();
        final String[] split = s.split("&");
        for (int length = split.length, i = 0; i < length; ++i) {
            final String[] split2 = split[i].split("=");
            if (split2.length > 1) {
                hashMap.put(split2[0], split2[1]);
            }
            else if (split2.length == 1 && split2[0].length() != 0) {
                hashMap.put(split2[0], null);
            }
        }
        return hashMap;
    }
    
    public static void a(final Map<String, String> map, final String s, final am am) {
        if (!map.containsKey(s)) {
            map.put(s, am.a(s));
        }
    }
    
    public static void a(final Map<String, String> map, final String s, final String s2) {
        if (!map.containsKey(s)) {
            map.put(s, s2);
        }
    }
    
    public static double b(final String s) {
        final double n = 100.0;
        double double1;
        if (s == null) {
            double1 = n;
        }
        else {
            try {
                double1 = Double.parseDouble(s);
            }
            catch (NumberFormatException ex) {
                double1 = n;
            }
        }
        return double1;
    }
    
    public static boolean c(final String s) {
        boolean b2;
        final boolean b = b2 = true;
        if (s != null) {
            b2 = b;
            if (!s.equalsIgnoreCase("true")) {
                b2 = b;
                if (!s.equalsIgnoreCase("yes")) {
                    if (s.equalsIgnoreCase("1")) {
                        b2 = b;
                    }
                    else {
                        if (!s.equalsIgnoreCase("false") && !s.equalsIgnoreCase("no")) {
                            b2 = b;
                            if (!s.equalsIgnoreCase("0")) {
                                return b2;
                            }
                        }
                        b2 = false;
                    }
                }
            }
        }
        return b2;
    }
    
    public static String d(String s) {
        int i = 0;
        Serializable s2 = null;
        if (TextUtils.isEmpty((CharSequence)s)) {
            s = (String)s2;
        }
        else {
            String s3 = s;
            if (s.contains("?")) {
                final String[] split = s.split("[\\?]");
                s3 = s;
                if (split.length > 1) {
                    s3 = split[1];
                }
            }
            Label_0203: {
                if (!s3.contains("%3D")) {
                    break Label_0203;
                }
                try {
                    s = URLDecoder.decode(s3, "UTF-8");
                    final Map<String, String> a;
                    Label_0064: {
                        a = a(s);
                    }
                    final String[] array = { "dclid", "utm_source", "gclid", "utm_campaign", "utm_medium", "utm_term", "utm_content", "utm_id", "gmob_t" };
                    s2 = new StringBuilder();
                    while (i < 9) {
                        if (!TextUtils.isEmpty((CharSequence)a.get(array[i]))) {
                            if (((StringBuilder)s2).length() > 0) {
                                ((StringBuilder)s2).append("&");
                            }
                            ((StringBuilder)s2).append(array[i]).append("=").append(a.get(array[i]));
                        }
                        ++i;
                    }
                    s = ((StringBuilder)s2).toString();
                    return s;
                    s = s3;
                    // iftrue(Label_0064:, s3.contains((CharSequence)"="))
                    s = (String)s2;
                }
                catch (UnsupportedEncodingException ex) {
                    s = (String)s2;
                }
            }
        }
        return s;
    }
    
    public static MessageDigest e(final String algorithm) {
        int n = 0;
        while (true) {
            if (n >= 2) {
                return null;
            }
            try {
                final MessageDigest instance = MessageDigest.getInstance(algorithm);
                if (instance != null) {
                    return instance;
                }
            }
            catch (NoSuchAlgorithmException ex) {}
            ++n;
        }
    }
}
