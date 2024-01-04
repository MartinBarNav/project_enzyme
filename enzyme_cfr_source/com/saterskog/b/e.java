/*
 * Decompiled with CFR 0.150.
 */
package com.saterskog.b;

public final class e {
    public static String a(String string) {
        return string.substring(0, Math.min(1, string.length())).toUpperCase() + string.substring(1, string.length()).toLowerCase();
    }
}

