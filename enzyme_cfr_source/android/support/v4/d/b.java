/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  android.util.Log
 */
package android.support.v4.d;

import android.util.Log;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

final class b {
    private static Method a;
    private static Method b;

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    static {
        try {
            Class<?> class_ = Class.forName("libcore.icu.ICU");
            if (class_ == null) return;
            a = class_.getMethod("getScript", String.class);
            b = class_.getMethod("addLikelySubtags", String.class);
            return;
        }
        catch (Exception exception) {
            Log.w((String)"ICUCompatIcs", (Throwable)exception);
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static String a(String string) {
        try {
            if (a == null) return null;
            return (String)a.invoke(null, string);
        }
        catch (IllegalAccessException illegalAccessException) {
            Log.w((String)"ICUCompatIcs", (Throwable)illegalAccessException);
            return null;
        }
        catch (InvocationTargetException invocationTargetException) {
            Log.w((String)"ICUCompatIcs", (Throwable)invocationTargetException);
        }
        return null;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static String b(String string) {
        try {
            if (b == null) return string;
            String string2 = (String)b.invoke(null, string);
            return string2;
        }
        catch (IllegalAccessException illegalAccessException) {
            Log.w((String)"ICUCompatIcs", (Throwable)illegalAccessException);
            return string;
        }
        catch (InvocationTargetException invocationTargetException) {
            Log.w((String)"ICUCompatIcs", (Throwable)invocationTargetException);
            return string;
        }
    }
}

