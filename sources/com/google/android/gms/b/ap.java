package com.google.android.gms.b;

import android.os.Build;

public final class ap {
    public static int a() {
        try {
            return Integer.parseInt(Build.VERSION.SDK);
        } catch (NumberFormatException e) {
            n.a("Invalid version number: " + Build.VERSION.SDK);
            return 0;
        }
    }
}
