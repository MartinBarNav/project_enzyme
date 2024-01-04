// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.b;

import android.util.DisplayMetrics;
import android.content.Context;

final class r implements am
{
    private static r a;
    private static Object b;
    private final Context c;
    
    static {
        r.b = new Object();
    }
    
    private r(final Context c) {
        this.c = c;
    }
    
    public static r a() {
        synchronized (r.b) {
            return r.a;
        }
    }
    
    public static void a(final Context context) {
        synchronized (r.b) {
            if (r.a == null) {
                r.a = new r(context);
            }
        }
    }
    
    @Override
    public final String a(final String s) {
        String string = null;
        if (s != null && s.equals("&sr")) {
            final DisplayMetrics displayMetrics = this.c.getResources().getDisplayMetrics();
            string = displayMetrics.widthPixels + "x" + displayMetrics.heightPixels;
        }
        return string;
    }
}
