package com.saterskog.cell_lab;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.preference.PreferenceManager;
import com.google.android.gms.b.c;
import com.google.android.gms.b.g;
import com.saterskog.b.a;

public class CellLabApplication extends Application implements a.C0027a {
    g a = null;

    public final synchronized g a() {
        if (this.a == null) {
            this.a = c.a((Context) this).b();
        }
        return this.a;
    }

    public static void a(Activity activity) {
        ((CellLabApplication) activity.getApplication()).a();
        PreferenceManager.setDefaultValues(activity, C0028R.xml.preferences, false);
        s.a(activity);
    }
}
