// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.internal;

import android.os.Looper;

public final class d
{
    public static <T> T a(final T t) {
        if (t == null) {
            throw new NullPointerException("null reference");
        }
        return t;
    }
    
    public static void a(final String s) {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            throw new IllegalStateException(s);
        }
    }
}
