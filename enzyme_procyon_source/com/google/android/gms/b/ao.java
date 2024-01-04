// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.b;

public final class ao
{
    static String a(String string, final int n) {
        if (n <= 0) {
            n.a("index out of range for " + string + " (" + n + ")");
            string = "";
        }
        else {
            string += n;
        }
        return string;
    }
}
