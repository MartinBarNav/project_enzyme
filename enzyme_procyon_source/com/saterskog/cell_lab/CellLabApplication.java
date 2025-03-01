// 
// Decompiled by Procyon v0.5.36
// 

package com.saterskog.cell_lab;

import com.google.android.gms.b.c;
import android.content.Context;
import android.preference.PreferenceManager;
import android.app.Activity;
import com.google.android.gms.b.g;
import com.saterskog.b.a;
import android.app.Application;

public class CellLabApplication extends Application implements a
{
    g a;
    
    public CellLabApplication() {
        this.a = null;
    }
    
    public static void a(final Activity activity) {
        ((CellLabApplication)activity.getApplication()).a();
        PreferenceManager.setDefaultValues((Context)activity, 2131820545, false);
        s.a((Context)activity);
    }
    
    public final g a() {
        synchronized (this) {
            if (this.a == null) {
                this.a = com.google.android.gms.b.c.a((Context)this).b();
            }
            return this.a;
        }
    }
}
