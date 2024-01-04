/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.app.Application
 *  android.content.Context
 *  android.preference.PreferenceManager
 */
package com.saterskog.cell_lab;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.preference.PreferenceManager;
import com.google.android.gms.b.c;
import com.google.android.gms.b.g;
import com.saterskog.b.a;
import com.saterskog.cell_lab.s;

public class CellLabApplication
extends Application
implements a.a {
    g a = null;

    public static void a(Activity activity) {
        ((CellLabApplication)activity.getApplication()).a();
        PreferenceManager.setDefaultValues((Context)activity, (int)2131820545, (boolean)false);
        s.a((Context)activity);
    }

    @Override
    public final g a() {
        synchronized (this) {
            if (this.a == null) {
                this.a = c.a((Context)this).b();
            }
            g g2 = this.a;
            return g2;
        }
    }
}

