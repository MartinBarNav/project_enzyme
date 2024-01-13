package com.saterskog.cell_lab;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public final class t {
    private static int a = -1;
    private static int b;
    private static int[] c = {C0028R.array.tut_title_1, C0028R.array.tut_title_2, C0028R.array.tut_title_3, C0028R.array.tut_title_4};
    private static int[] d = {C0028R.array.tut_text_1, C0028R.array.tut_text_2, C0028R.array.tut_text_3, C0028R.array.tut_text_4};
    private static CharSequence[] e;
    private static CharSequence[] f;
    private static a g;
    private static PlayActivity h;

    public interface a {
        void d();
    }

    public static void a() {
        a = -1;
    }

    public static void a(PlayActivity playActivity, int i, a aVar) {
        h = playActivity;
        g = aVar;
        a = i;
        b = 0;
        if (a != -1) {
            if (playActivity == null) {
                com.saterskog.b.a.a("nulll context passed to TutorialManager.init");
            }
            e = playActivity.getResources().getTextArray(c[a]);
            f = playActivity.getResources().getTextArray(d[a]);
        }
    }

    public static void a(final Activity activity) {
        if (a != -1 && e != null && f != null) {
            final CharSequence charSequence = e[b];
            final CharSequence charSequence2 = f[b];
            if (b == e.length - 1) {
                if (!j.b(h.q, (Context) activity)) {
                    j.c(a, activity);
                    h.h();
                }
                h.E = true;
            }
            activity.runOnUiThread(new Runnable() {
                public final void run() {
                    t.a(activity, charSequence, charSequence2);
                }
            });
        }
    }

    public static void a(Activity activity, int i, int i2) {
        if (activity != null && a == i && b == i2) {
            if (g != null) {
                g.d();
            }
            b++;
            long b2 = com.saterskog.b.a.b((Context) activity);
            com.saterskog.b.a.a("tutCheckPoint:installTime", Integer.toString(i) + ":" + Integer.toString(i2), com.saterskog.b.a.a(b2), b2, activity);
            a(activity);
        }
    }

    public static void b(Activity activity, int i, int i2) {
        a(activity, i, i2, 500);
    }

    public static void a(final Activity activity, final int i, final int i2, int i3) {
        new Handler(Looper.getMainLooper()).postDelayed(new Runnable() {
            public final void run() {
                t.a(activity, i, i2);
            }
        }, (long) i3);
    }

    public static void a(PlayActivity playActivity, a aVar, Bundle bundle) {
        h = playActivity;
        g = aVar;
        a = bundle.getInt("TMtut", -1);
        b = bundle.getInt("TMpop", 0);
    }

    public static void a(Bundle bundle) {
        bundle.putInt("TMtut", a);
        bundle.putInt("TMpop", b);
    }

    static /* synthetic */ void a(Activity activity, CharSequence charSequence, CharSequence charSequence2) {
        AlertDialog.Builder builder = new AlertDialog.Builder(activity);
        View inflate = activity.getLayoutInflater().inflate(C0028R.layout.help_dialog, (ViewGroup) null);
        ((TextView) inflate.findViewById(C0028R.id.text_title)).setText(charSequence);
        ((TextView) inflate.findViewById(C0028R.id.text_help)).setText(charSequence2);
        builder.setView(inflate);
        builder.setNeutralButton(activity.getString(C0028R.string.dialog_button_ok), new DialogInterface.OnClickListener() {
            public final void onClick(DialogInterface dialogInterface, int i) {
                dialogInterface.cancel();
            }
        });
        builder.show();
    }
}
