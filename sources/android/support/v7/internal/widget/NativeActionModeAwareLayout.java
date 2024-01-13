package android.support.v7.internal.widget;

import android.annotation.TargetApi;
import android.content.Context;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.View;

@TargetApi(11)
public class NativeActionModeAwareLayout extends g {
    private a a;

    public interface a {
        ActionMode a();
    }

    public NativeActionModeAwareLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public void setActionModeForChildListener(a aVar) {
        this.a = aVar;
    }

    public ActionMode startActionModeForChild(View view, ActionMode.Callback callback) {
        if (this.a != null) {
            return this.a.a();
        }
        return super.startActionModeForChild(view, callback);
    }
}
