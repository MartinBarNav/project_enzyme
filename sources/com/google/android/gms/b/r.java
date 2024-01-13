package com.google.android.gms.b;

import android.content.Context;
import android.util.DisplayMetrics;

final class r implements am {
    private static r a;
    private static Object b = new Object();
    private final Context c;

    private r(Context context) {
        this.c = context;
    }

    public static r a() {
        r rVar;
        synchronized (b) {
            rVar = a;
        }
        return rVar;
    }

    public static void a(Context context) {
        synchronized (b) {
            if (a == null) {
                a = new r(context);
            }
        }
    }

    public final String a(String str) {
        if (str == null || !str.equals("&sr")) {
            return null;
        }
        DisplayMetrics displayMetrics = this.c.getResources().getDisplayMetrics();
        return displayMetrics.widthPixels + "x" + displayMetrics.heightPixels;
    }
}
