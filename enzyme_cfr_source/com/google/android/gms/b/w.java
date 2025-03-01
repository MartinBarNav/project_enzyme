/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  android.text.TextUtils
 */
package com.google.android.gms.b;

import android.text.TextUtils;
import com.google.android.gms.b.am;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

public final class w {
    private static final char[] a = new char[]{'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    static String a() {
        return "1";
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     */
    public static String a(Locale locale) {
        void var1_2;
        Object var1_1 = null;
        if (locale == null) {
            return var1_2;
        }
        if (TextUtils.isEmpty((CharSequence)locale.getLanguage())) return var1_2;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(locale.getLanguage().toLowerCase());
        if (!TextUtils.isEmpty((CharSequence)locale.getCountry())) {
            stringBuilder.append("-").append(locale.getCountry().toLowerCase());
        }
        String string = stringBuilder.toString();
        return var1_2;
    }

    /*
     * Enabled aggressive block sorting
     */
    public static Map<String, String> a(String arrstring) {
        HashMap<String, String> hashMap = new HashMap<String, String>();
        arrstring = arrstring.split("&");
        int n2 = arrstring.length;
        int n3 = 0;
        while (n3 < n2) {
            String[] arrstring2 = arrstring[n3].split("=");
            if (arrstring2.length > 1) {
                hashMap.put(arrstring2[0], arrstring2[1]);
            } else if (arrstring2.length == 1 && arrstring2[0].length() != 0) {
                hashMap.put(arrstring2[0], null);
            }
            ++n3;
        }
        return hashMap;
    }

    public static void a(Map<String, String> map, String string, am am2) {
        if (!map.containsKey(string)) {
            map.put(string, am2.a(string));
        }
    }

    public static void a(Map<String, String> map, String string, String string2) {
        if (!map.containsKey(string)) {
            map.put(string, string2);
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static double b(String string) {
        double d2 = 100.0;
        if (string == null) {
            return d2;
        }
        try {
            return Double.parseDouble(string);
        }
        catch (NumberFormatException numberFormatException) {
            return d2;
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static boolean c(String string) {
        boolean bl;
        boolean bl2 = bl = true;
        if (string == null) return bl2;
        bl2 = bl;
        if (string.equalsIgnoreCase("true")) return bl2;
        bl2 = bl;
        if (string.equalsIgnoreCase("yes")) return bl2;
        if (string.equalsIgnoreCase("1")) {
            return bl;
        }
        if (string.equalsIgnoreCase("false")) return false;
        if (string.equalsIgnoreCase("no")) return false;
        bl2 = bl;
        if (!string.equalsIgnoreCase("0")) return bl2;
        return false;
    }

    /*
     * Loose catch block
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    public static String d(String object) {
        void var0_4;
        void var0_2;
        int n2 = 0;
        StringBuilder stringBuilder = null;
        if (TextUtils.isEmpty((CharSequence)object)) {
            StringBuilder stringBuilder2 = stringBuilder;
            return var0_2;
        }
        Object object2 = object;
        if (((String)object).contains("?")) {
            String[] arrstring = ((String)object).split("[\\?]");
            object2 = object;
            if (arrstring.length > 1) {
                object2 = arrstring[1];
            }
        }
        if (((String)object2).contains("%3D")) {
            String string = URLDecoder.decode((String)object2, "UTF-8");
        } else {
            Object object3 = object2;
            if (!((String)object2).contains("=")) {
                StringBuilder stringBuilder3 = stringBuilder;
                return var0_2;
            }
        }
        object2 = w.a((String)var0_4);
        String[] arrstring = new String[]{"dclid", "utm_source", "gclid", "utm_campaign", "utm_medium", "utm_term", "utm_content", "utm_id", "gmob_t"};
        stringBuilder = new StringBuilder();
        while (true) {
            if (n2 >= 9) {
                String string = stringBuilder.toString();
                return var0_2;
            }
            if (!TextUtils.isEmpty((CharSequence)((CharSequence)object2.get(arrstring[n2])))) {
                if (stringBuilder.length() > 0) {
                    stringBuilder.append("&");
                }
                stringBuilder.append(arrstring[n2]).append("=").append((String)object2.get(arrstring[n2]));
            }
            ++n2;
        }
        catch (UnsupportedEncodingException unsupportedEncodingException) {
            StringBuilder stringBuilder4 = stringBuilder;
            return var0_2;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static MessageDigest e(String string) {
        int n2 = 0;
        while (true) {
            block4: {
                if (n2 >= 2) {
                    return null;
                }
                try {
                    MessageDigest messageDigest = MessageDigest.getInstance(string);
                    if (messageDigest == null) break block4;
                    return messageDigest;
                }
                catch (NoSuchAlgorithmException noSuchAlgorithmException) {
                    // empty catch block
                }
            }
            ++n2;
        }
    }
}

