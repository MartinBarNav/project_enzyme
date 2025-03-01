// 
// Decompiled by Procyon v0.5.36
// 

package android.support.v7.internal.widget;

import android.support.v4.view.u;
import android.util.Log;
import android.graphics.Rect;
import android.view.View;
import android.os.Build$VERSION;
import java.lang.reflect.Method;

public final class s
{
    private static Method a;
    
    static {
        if (Build$VERSION.SDK_INT < 18) {
            return;
        }
        try {
            if (!(s.a = View.class.getDeclaredMethod("computeFitSystemWindows", Rect.class, Rect.class)).isAccessible()) {
                s.a.setAccessible(true);
            }
        }
        catch (NoSuchMethodException ex) {
            Log.d("ViewUtils", "Could not find method computeFitSystemWindows. Oh well.");
        }
    }
    
    public static int a(final int n, final int n2) {
        return n | n2;
    }
    
    public static void a(final View obj, final Rect rect, final Rect rect2) {
        if (s.a == null) {
            return;
        }
        try {
            s.a.invoke(obj, rect, rect2);
        }
        catch (Exception ex) {
            Log.d("ViewUtils", "Could not invoke computeFitSystemWindows", (Throwable)ex);
        }
    }
    
    public static boolean a(final View view) {
        boolean b = true;
        if (u.e(view) != 1) {
            b = false;
        }
        return b;
    }
}
