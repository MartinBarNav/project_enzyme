package android.support.v4.content;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Build;

public final class a {
    public static final Drawable a(Context context, int i) {
        if (Build.VERSION.SDK_INT >= 21) {
            return b.a(context, i);
        }
        return context.getResources().getDrawable(i);
    }
}
