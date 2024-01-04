/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  android.os.Looper
 */
package com.google.android.gms.internal;

import android.os.Looper;

public final class d {
    public static <T> T a(T t2) {
        if (t2 == null) {
            throw new NullPointerException("null reference");
        }
        return t2;
    }

    public static void a(String string) {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            throw new IllegalStateException(string);
        }
    }
}

