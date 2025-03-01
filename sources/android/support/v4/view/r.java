package android.support.v4.view;

import android.content.Context;
import android.text.method.SingleLineTransformationMethod;
import android.view.View;
import android.widget.TextView;
import java.util.Locale;

final class r {
    public static void a(TextView textView) {
        textView.setTransformationMethod(new a(textView.getContext()));
    }

    private static class a extends SingleLineTransformationMethod {
        private Locale a;

        public a(Context context) {
            this.a = context.getResources().getConfiguration().locale;
        }

        public final CharSequence getTransformation(CharSequence charSequence, View view) {
            CharSequence transformation = super.getTransformation(charSequence, view);
            if (transformation != null) {
                return transformation.toString().toUpperCase(this.a);
            }
            return null;
        }
    }
}
