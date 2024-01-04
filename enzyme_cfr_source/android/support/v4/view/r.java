/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.text.method.SingleLineTransformationMethod
 *  android.text.method.TransformationMethod
 *  android.view.View
 *  android.widget.TextView
 */
package android.support.v4.view;

import android.content.Context;
import android.text.method.SingleLineTransformationMethod;
import android.text.method.TransformationMethod;
import android.view.View;
import android.widget.TextView;
import java.util.Locale;

final class r {
    public static void a(TextView textView) {
        textView.setTransformationMethod((TransformationMethod)new a(textView.getContext()));
    }

    private static final class a
    extends SingleLineTransformationMethod {
        private Locale a;

        public a(Context context) {
            this.a = context.getResources().getConfiguration().locale;
        }

        /*
         * Enabled force condition propagation
         * Lifted jumps to return sites
         */
        public final CharSequence getTransformation(CharSequence charSequence, View view) {
            if ((charSequence = super.getTransformation(charSequence, view)) == null) return null;
            return charSequence.toString().toUpperCase(this.a);
        }
    }
}

