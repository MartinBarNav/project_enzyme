// 
// Decompiled by Procyon v0.5.36
// 

package android.support.v4.view;

import android.view.View;
import android.content.Context;
import java.util.Locale;
import android.text.method.SingleLineTransformationMethod;
import android.text.method.TransformationMethod;
import android.widget.TextView;

final class r
{
    public static void a(final TextView textView) {
        textView.setTransformationMethod((TransformationMethod)new a(textView.getContext()));
    }
    
    private static final class a extends SingleLineTransformationMethod
    {
        private Locale a;
        
        public a(final Context context) {
            this.a = context.getResources().getConfiguration().locale;
        }
        
        public final CharSequence getTransformation(CharSequence transformation, final View view) {
            transformation = super.getTransformation(transformation, view);
            String upperCase;
            if (transformation != null) {
                upperCase = transformation.toString().toUpperCase(this.a);
            }
            else {
                upperCase = null;
            }
            return upperCase;
        }
    }
}
