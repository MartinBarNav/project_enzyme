/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  android.graphics.Rect
 *  android.os.Build$VERSION
 *  android.util.Log
 *  android.view.View
 */
package android.support.v7.internal.widget;

import android.graphics.Rect;
import android.os.Build;
import android.support.v4.view.u;
import android.util.Log;
import android.view.View;
import java.lang.reflect.Method;

public final class s {
    private static Method a;

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    static {
        if (Build.VERSION.SDK_INT < 18) return;
        try {
            Method method;
            a = method = View.class.getDeclaredMethod("computeFitSystemWindows", Rect.class, Rect.class);
            if (method.isAccessible()) return;
            a.setAccessible(true);
            return;
        }
        catch (NoSuchMethodException noSuchMethodException) {
            Log.d((String)"ViewUtils", (String)"Could not find method computeFitSystemWindows. Oh well.");
            return;
        }
    }

    public static int a(int n2, int n3) {
        return n2 | n3;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static void a(View view, Rect rect, Rect rect2) {
        if (a == null) return;
        try {
            a.invoke((Object)view, new Object[]{rect, rect2});
            return;
        }
        catch (Exception exception) {
            Log.d((String)"ViewUtils", (String)"Could not invoke computeFitSystemWindows", (Throwable)exception);
            return;
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static boolean a(View view) {
        boolean bl = true;
        if (u.e(view) != 1) return false;
        return bl;
    }
}

