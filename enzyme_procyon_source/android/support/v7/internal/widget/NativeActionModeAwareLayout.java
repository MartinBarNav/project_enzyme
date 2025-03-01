// 
// Decompiled by Procyon v0.5.36
// 

package android.support.v7.internal.widget;

import android.view.ActionMode;
import android.view.ActionMode$Callback;
import android.view.View;
import android.util.AttributeSet;
import android.content.Context;
import android.annotation.TargetApi;

@TargetApi(11)
public class NativeActionModeAwareLayout extends g
{
    private a a;
    
    public NativeActionModeAwareLayout(final Context context, final AttributeSet set) {
        super(context, set);
    }
    
    public void setActionModeForChildListener(final a a) {
        this.a = a;
    }
    
    public ActionMode startActionModeForChild(final View view, final ActionMode$Callback actionMode$Callback) {
        ActionMode actionMode;
        if (this.a != null) {
            actionMode = this.a.a();
        }
        else {
            actionMode = super.startActionModeForChild(view, actionMode$Callback);
        }
        return actionMode;
    }
    
    public interface a
    {
        ActionMode a();
    }
}
