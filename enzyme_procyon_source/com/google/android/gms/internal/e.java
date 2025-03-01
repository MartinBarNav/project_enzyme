// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.internal;

import android.content.Context;
import java.util.regex.Pattern;

public final class e
{
    private static Pattern a;
    
    static {
        e.a = null;
    }
    
    public static int a(final int n) {
        return n / 1000;
    }
    
    public static boolean a(final Context context) {
        return context.getPackageManager().hasSystemFeature("android.hardware.type.watch");
    }
    
    public static boolean b(final int n) {
        return n % 1000 / 100 == 3;
    }
}
