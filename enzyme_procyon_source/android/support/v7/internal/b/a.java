// 
// Decompiled by Procyon v0.5.36
// 

package android.support.v7.internal.b;

import android.graphics.Rect;
import android.view.View;
import android.content.Context;
import java.util.Locale;
import android.text.method.TransformationMethod;

public final class a implements TransformationMethod
{
    private Locale a;
    
    public a(final Context context) {
        this.a = context.getResources().getConfiguration().locale;
    }
    
    public final CharSequence getTransformation(final CharSequence charSequence, final View view) {
        String upperCase;
        if (charSequence != null) {
            upperCase = charSequence.toString().toUpperCase(this.a);
        }
        else {
            upperCase = null;
        }
        return upperCase;
    }
    
    public final void onFocusChanged(final View view, final CharSequence charSequence, final boolean b, final int n, final Rect rect) {
    }
}
