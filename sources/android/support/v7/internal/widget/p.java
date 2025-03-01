package android.support.v7.internal.widget;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;

final class p extends Resources {
    private final o a;

    public p(Resources resources, o oVar) {
        super(resources.getAssets(), resources.getDisplayMetrics(), resources.getConfiguration());
        this.a = oVar;
    }

    public final Drawable getDrawable(int i) {
        Drawable drawable = super.getDrawable(i);
        if (drawable != null) {
            this.a.a(i, drawable);
        }
        return drawable;
    }
}
