/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.util.DisplayMetrics
 */
package com.google.android.gms.b;

import android.content.Context;
import android.util.DisplayMetrics;
import com.google.android.gms.b.am;

final class r
implements am {
    private static r a;
    private static Object b;
    private final Context c;

    static {
        b = new Object();
    }

    private r(Context context) {
        this.c = context;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static r a() {
        Object object = b;
        synchronized (object) {
            return a;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static void a(Context context) {
        Object object = b;
        synchronized (object) {
            if (a == null) {
                r r2;
                a = r2 = new r(context);
            }
            return;
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public final String a(String string) {
        String string2 = null;
        if (string == null) {
            return string2;
        }
        if (!string.equals("&sr")) return string2;
        string = this.c.getResources().getDisplayMetrics();
        return ((DisplayMetrics)string).widthPixels + "x" + ((DisplayMetrics)string).heightPixels;
    }
}

