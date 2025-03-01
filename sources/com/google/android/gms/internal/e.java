package com.google.android.gms.internal;

import android.content.Context;
import java.util.regex.Pattern;

public final class e {
    private static Pattern a = null;

    public static int a(int i) {
        return i / 1000;
    }

    public static boolean a(Context context) {
        return context.getPackageManager().hasSystemFeature("android.hardware.type.watch");
    }

    public static boolean b(int i) {
        return (i % 1000) / 100 == 3;
    }
}
