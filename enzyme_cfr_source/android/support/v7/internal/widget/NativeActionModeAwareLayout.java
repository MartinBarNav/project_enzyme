/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  android.annotation.TargetApi
 *  android.content.Context
 *  android.util.AttributeSet
 *  android.view.ActionMode
 *  android.view.ActionMode$Callback
 *  android.view.View
 */
package android.support.v7.internal.widget;

import android.annotation.TargetApi;
import android.content.Context;
import android.support.v7.internal.widget.g;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.View;

@TargetApi(value=11)
public class NativeActionModeAwareLayout
extends g {
    private a a;

    public NativeActionModeAwareLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public void setActionModeForChildListener(a a2) {
        this.a = a2;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public ActionMode startActionModeForChild(View view, ActionMode.Callback callback) {
        if (this.a == null) return super.startActionModeForChild(view, callback);
        return this.a.a();
    }

    public static interface a {
        public ActionMode a();
    }
}

