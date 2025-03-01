package com.google.android.gms.b;

import android.text.TextUtils;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

public final class w {
    private static final char[] a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    static String a() {
        return "1";
    }

    public static String a(Locale locale) {
        if (locale == null || TextUtils.isEmpty(locale.getLanguage())) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(locale.getLanguage().toLowerCase());
        if (!TextUtils.isEmpty(locale.getCountry())) {
            sb.append("-").append(locale.getCountry().toLowerCase());
        }
        return sb.toString();
    }

    public static Map<String, String> a(String str) {
        HashMap hashMap = new HashMap();
        for (String split : str.split("&")) {
            String[] split2 = split.split("=");
            if (split2.length > 1) {
                hashMap.put(split2[0], split2[1]);
            } else if (split2.length == 1 && split2[0].length() != 0) {
                hashMap.put(split2[0], (Object) null);
            }
        }
        return hashMap;
    }

    public static void a(Map<String, String> map, String str, am amVar) {
        if (!map.containsKey(str)) {
            map.put(str, amVar.a(str));
        }
    }

    public static void a(Map<String, String> map, String str, String str2) {
        if (!map.containsKey(str)) {
            map.put(str, str2);
        }
    }

    public static double b(String str) {
        if (str == null) {
            return 100.0d;
        }
        try {
            return Double.parseDouble(str);
        } catch (NumberFormatException e) {
            return 100.0d;
        }
    }

    public static boolean c(String str) {
        if (str == null || str.equalsIgnoreCase("true") || str.equalsIgnoreCase("yes") || str.equalsIgnoreCase("1")) {
            return true;
        }
        return !str.equalsIgnoreCase("false") && !str.equalsIgnoreCase("no") && !str.equalsIgnoreCase("0");
    }

    public static String d(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (str.contains("?")) {
            String[] split = str.split("[\\?]");
            if (split.length > 1) {
                str = split[1];
            }
        }
        if (str.contains("%3D")) {
            try {
                str = URLDecoder.decode(str, "UTF-8");
            } catch (UnsupportedEncodingException e) {
                return null;
            }
        } else if (!str.contains("=")) {
            return null;
        }
        Map<String, String> a2 = a(str);
        String[] strArr = {"dclid", "utm_source", "gclid", "utm_campaign", "utm_medium", "utm_term", "utm_content", "utm_id", "gmob_t"};
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 9; i++) {
            if (!TextUtils.isEmpty(a2.get(strArr[i]))) {
                if (sb.length() > 0) {
                    sb.append("&");
                }
                sb.append(strArr[i]).append("=").append(a2.get(strArr[i]));
            }
        }
        return sb.toString();
    }

    public static MessageDigest e(String str) {
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 >= 2) {
                return null;
            }
            try {
                MessageDigest instance = MessageDigest.getInstance(str);
                if (instance != null) {
                    return instance;
                }
                i = i2 + 1;
            } catch (NoSuchAlgorithmException e) {
            }
        }
    }
}
