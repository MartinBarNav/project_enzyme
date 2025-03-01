// 
// Decompiled by Procyon v0.5.36
// 

package com.saterskog.b;

public final class e
{
    public static String a(final String s) {
        return s.substring(0, Math.min(1, s.length())).toUpperCase() + s.substring(1, s.length()).toLowerCase();
    }
}
