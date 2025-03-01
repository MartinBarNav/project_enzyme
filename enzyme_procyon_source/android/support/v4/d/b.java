// 
// Decompiled by Procyon v0.5.36
// 

package android.support.v4.d;

import java.lang.reflect.InvocationTargetException;
import android.util.Log;
import java.lang.reflect.Method;

final class b
{
    private static Method a;
    private static Method b;
    
    static {
        try {
            final Class<?> forName = Class.forName("libcore.icu.ICU");
            if (forName != null) {
                android.support.v4.d.b.a = forName.getMethod("getScript", String.class);
                android.support.v4.d.b.b = forName.getMethod("addLikelySubtags", String.class);
            }
        }
        catch (Exception ex) {
            Log.w("ICUCompatIcs", (Throwable)ex);
        }
    }
    
    public static String a(String s) {
        try {
            if (android.support.v4.d.b.a != null) {
                s = (String)android.support.v4.d.b.a.invoke(null, s);
                return s;
            }
            goto Label_0035;
        }
        catch (IllegalAccessException ex) {
            Log.w("ICUCompatIcs", (Throwable)ex);
        }
        catch (InvocationTargetException ex2) {
            Log.w("ICUCompatIcs", (Throwable)ex2);
            goto Label_0035;
        }
    }
    
    public static String b(String s) {
        try {
            if (android.support.v4.d.b.b != null) {
                s = (String)android.support.v4.d.b.b.invoke(null, s);
                return s;
            }
            goto Label_0037;
        }
        catch (IllegalAccessException ex) {
            Log.w("ICUCompatIcs", (Throwable)ex);
        }
        catch (InvocationTargetException ex2) {
            Log.w("ICUCompatIcs", (Throwable)ex2);
            goto Label_0037;
        }
    }
}
