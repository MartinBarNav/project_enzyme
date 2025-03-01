/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.graphics.Rect
 *  android.text.method.TransformationMethod
 *  android.view.View
 */
package android.support.v7.internal.b;

import android.content.Context;
import android.graphics.Rect;
import android.text.method.TransformationMethod;
import android.view.View;
import java.util.Locale;

public final class a
implements TransformationMethod {
    private Locale a;

    public a(Context context) {
        this.a = context.getResources().getConfiguration().locale;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final CharSequence getTransformation(CharSequence charSequence, View view) {
        if (charSequence == null) return null;
        return charSequence.toString().toUpperCase(this.a);
    }

    public final void onFocusChanged(View view, CharSequence charSequence, boolean bl, int n2, Rect rect) {
    }
}

