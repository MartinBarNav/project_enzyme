// 
// Decompiled by Procyon v0.5.36
// 

package com.saterskog.cell_lab;

import android.os.Bundle;
import android.view.View;
import android.content.DialogInterface;
import android.content.DialogInterface$OnClickListener;
import android.widget.TextView;
import android.view.ViewGroup;
import android.app.AlertDialog$Builder;
import android.os.Handler;
import android.os.Looper;
import com.saterskog.b.a;
import android.content.Context;
import android.app.Activity;

public final class t
{
    private static int a;
    private static int b;
    private static int[] c;
    private static int[] d;
    private static CharSequence[] e;
    private static CharSequence[] f;
    private static a g;
    private static PlayActivity h;
    
    static {
        t.a = -1;
        t.c = new int[] { 2130837521, 2130837522, 2130837523, 2130837524 };
        t.d = new int[] { 2130837517, 2130837518, 2130837519, 2130837520 };
    }
    
    public static void a() {
        t.a = -1;
    }
    
    public static void a(final Activity activity) {
        if (t.a != -1 && t.e != null && t.f != null) {
            final CharSequence charSequence = t.e[t.b];
            final CharSequence charSequence2 = t.f[t.b];
            if (t.b == t.e.length - 1) {
                int n;
                if (!j.b(t.h.q, (Context)activity)) {
                    n = 1;
                }
                else {
                    n = 0;
                }
                if (n != 0) {
                    j.c(t.a, (Context)activity);
                    t.h.h();
                }
                t.h.E = true;
            }
            activity.runOnUiThread((Runnable)new Runnable() {
                @Override
                public final void run() {
                    t.a(activity, charSequence, charSequence2);
                }
            });
        }
    }
    
    public static void a(final Activity activity, final int i, final int j) {
        if (activity != null && t.a == i && t.b == j) {
            if (t.g != null) {
                t.g.d();
            }
            ++t.b;
            final long b = com.saterskog.b.a.b((Context)activity);
            com.saterskog.b.a.a("tutCheckPoint:installTime", Integer.toString(i) + ":" + Integer.toString(j), com.saterskog.b.a.a(b), b, activity);
            a(activity);
        }
    }
    
    public static void a(final Activity activity, final int n, final int n2, final int n3) {
        new Handler(Looper.getMainLooper()).postDelayed((Runnable)new Runnable() {
            @Override
            public final void run() {
                t.a(activity, n, n2);
            }
        }, (long)n3);
    }
    
    static /* synthetic */ void a(final Activity activity, final CharSequence text, final CharSequence text2) {
        final AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder((Context)activity);
        final View inflate = activity.getLayoutInflater().inflate(2131361829, (ViewGroup)null);
        ((TextView)inflate.findViewById(2131230953)).setText(text);
        ((TextView)inflate.findViewById(2131230933)).setText(text2);
        alertDialog$Builder.setView(inflate);
        alertDialog$Builder.setNeutralButton((CharSequence)activity.getString(2131624029), (DialogInterface$OnClickListener)new DialogInterface$OnClickListener() {
            public final void onClick(final DialogInterface dialogInterface, final int n) {
                dialogInterface.cancel();
            }
        });
        alertDialog$Builder.show();
    }
    
    public static void a(final Bundle bundle) {
        bundle.putInt("TMtut", t.a);
        bundle.putInt("TMpop", t.b);
    }
    
    public static void a(final PlayActivity h, final int a, final a g) {
        t.h = h;
        t.g = g;
        t.a = a;
        t.b = 0;
        if (t.a != -1) {
            if (h == null) {
                a.a("nulll context passed to TutorialManager.init");
            }
            t.e = h.getResources().getTextArray(t.c[t.a]);
            t.f = h.getResources().getTextArray(t.d[t.a]);
        }
    }
    
    public static void a(final PlayActivity h, final a g, final Bundle bundle) {
        t.h = h;
        t.g = g;
        t.a = bundle.getInt("TMtut", -1);
        t.b = bundle.getInt("TMpop", 0);
    }
    
    public static void b(final Activity activity, final int n, final int n2) {
        a(activity, n, n2, 500);
    }
    
    public interface a
    {
        void d();
    }
}
