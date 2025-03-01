/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.app.AlertDialog$Builder
 *  android.content.Context
 *  android.content.DialogInterface
 *  android.content.DialogInterface$OnClickListener
 *  android.os.Bundle
 *  android.os.Handler
 *  android.os.Looper
 *  android.view.View
 *  android.widget.TextView
 */
package com.saterskog.cell_lab;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.widget.TextView;
import com.saterskog.cell_lab.PlayActivity;
import com.saterskog.cell_lab.j;

public final class t {
    private static int a = -1;
    private static int b;
    private static int[] c;
    private static int[] d;
    private static CharSequence[] e;
    private static CharSequence[] f;
    private static a g;
    private static PlayActivity h;

    static {
        c = new int[]{2130837521, 2130837522, 2130837523, 2130837524};
        d = new int[]{2130837517, 2130837518, 2130837519, 2130837520};
    }

    public static void a() {
        a = -1;
    }

    /*
     * Enabled aggressive block sorting
     */
    public static void a(final Activity activity) {
        if (a == -1) return;
        if (e == null) return;
        if (f == null) {
            return;
        }
        final CharSequence charSequence = e[b];
        final CharSequence charSequence2 = f[b];
        if (b == e.length - 1) {
            boolean bl = !j.b(t.h.q, (Context)activity);
            if (bl) {
                j.c(a, (Context)activity);
                h.h();
            }
            t.h.E = true;
        }
        activity.runOnUiThread(new Runnable(){

            @Override
            public final void run() {
                t.a(activity, charSequence, charSequence2);
            }
        });
    }

    public static void a(Activity activity, int n2, int n3) {
        if (activity != null && a == n2 && b == n3) {
            if (g != null) {
                g.d();
            }
            ++b;
            long l2 = com.saterskog.b.a.b((Context)activity);
            com.saterskog.b.a.a("tutCheckPoint:installTime", Integer.toString(n2) + ":" + Integer.toString(n3), com.saterskog.b.a.a(l2), l2, activity);
            t.a(activity);
        }
    }

    public static void a(final Activity activity, final int n2, final int n3, int n4) {
        new Handler(Looper.getMainLooper()).postDelayed(new Runnable(){

            @Override
            public final void run() {
                t.a(activity, n2, n3);
            }
        }, (long)n4);
    }

    static /* synthetic */ void a(Activity activity, CharSequence charSequence, CharSequence charSequence2) {
        AlertDialog.Builder builder = new AlertDialog.Builder((Context)activity);
        View view = activity.getLayoutInflater().inflate(2131361829, null);
        ((TextView)view.findViewById(2131230953)).setText(charSequence);
        ((TextView)view.findViewById(2131230933)).setText(charSequence2);
        builder.setView(view);
        builder.setNeutralButton((CharSequence)activity.getString(2131624029), new DialogInterface.OnClickListener(){

            public final void onClick(DialogInterface dialogInterface, int n2) {
                dialogInterface.cancel();
            }
        });
        builder.show();
    }

    public static void a(Bundle bundle) {
        bundle.putInt("TMtut", a);
        bundle.putInt("TMpop", b);
    }

    public static void a(PlayActivity playActivity, int n2, a a2) {
        h = playActivity;
        g = a2;
        a = n2;
        b = 0;
        if (a != -1) {
            if (playActivity == null) {
                com.saterskog.b.a.a("nulll context passed to TutorialManager.init");
            }
            e = playActivity.getResources().getTextArray(c[a]);
            f = playActivity.getResources().getTextArray(d[a]);
        }
    }

    public static void a(PlayActivity playActivity, a a2, Bundle bundle) {
        h = playActivity;
        g = a2;
        a = bundle.getInt("TMtut", -1);
        b = bundle.getInt("TMpop", 0);
    }

    public static void b(Activity activity, int n2, int n3) {
        t.a(activity, n2, n3, 500);
    }

    public static interface a {
        public void d();
    }
}

