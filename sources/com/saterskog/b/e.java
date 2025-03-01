package com.saterskog.b;

public final class e {
    public static String a(String str) {
        return str.substring(0, Math.min(1, str.length())).toUpperCase() + str.substring(1, str.length()).toLowerCase();
    }
}
