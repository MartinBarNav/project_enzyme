/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.app.Application$ActivityLifecycleCallbacks
 *  android.content.Context
 *  android.content.pm.ApplicationInfo
 *  android.content.pm.PackageManager$NameNotFoundException
 *  android.os.Bundle
 */
package com.google.android.gms.b;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import com.google.android.gms.b.ab;
import com.google.android.gms.b.ac;
import com.google.android.gms.b.ag;
import com.google.android.gms.b.aj;
import com.google.android.gms.b.al;
import com.google.android.gms.b.ar;
import com.google.android.gms.b.at;
import com.google.android.gms.b.au;
import com.google.android.gms.b.av;
import com.google.android.gms.b.e;
import com.google.android.gms.b.g;
import com.google.android.gms.b.h;
import com.google.android.gms.b.j;
import com.google.android.gms.b.n;
import com.google.android.gms.b.r;
import com.google.android.gms.b.s;
import com.google.android.gms.b.u;
import com.google.android.gms.b.v;
import com.google.android.gms.b.w;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.Set;

public class c
extends h {
    private static boolean i;
    private static c l;
    boolean a;
    ab b;
    s c;
    Context d;
    volatile Boolean e = false;
    e f;
    Set<a> g;
    boolean h = false;
    private String j;
    private String k;

    private c(Context context) {
        this(context, at.a(context), ar.c());
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private c(Context object, ab object2, s s2) {
        String string;
        void var1_3;
        void var3_9;
        j j2;
        if (object == null) {
            throw new IllegalArgumentException("context cannot be null");
        }
        this.d = object.getApplicationContext();
        this.b = j2;
        this.c = var3_9;
        ac.a(this.d);
        r.a(this.d);
        ag.a(this.d);
        this.f = new al();
        this.g = new HashSet<a>();
        if (i) return;
        try {
            ApplicationInfo applicationInfo = this.d.getPackageManager().getApplicationInfo(this.d.getPackageName(), 129);
        }
        catch (PackageManager.NameNotFoundException nameNotFoundException) {
            n.c("PackageManager doesn't know about package: " + (Object)((Object)nameNotFoundException));
            Object var1_5 = null;
        }
        if (var1_3 == null) {
            n.d("Couldn't get ApplicationInfo to load gloabl config.");
            return;
        }
        Bundle bundle = var1_3.metaData;
        if (bundle == null) return;
        int n2 = bundle.getInt("com.google.android.gms.analytics.globalConfigResource");
        if (n2 <= 0) return;
        j2 = (j)new av(this.d).a(n2);
        if (j2 == null) return;
        n.c("Loading global config values.");
        n2 = j2.a != null ? 1 : 0;
        if (n2 != 0) {
            this.k = j2.a;
            n.c("app name loaded: " + this.k);
        }
        if ((n2 = j2.b != null ? 1 : 0) != 0) {
            this.j = j2.b;
            n.c("app version loaded: " + this.j);
        }
        if ((n2 = j2.c != null ? 1 : 0) != 0 && (n2 = "verbose".equals(string = j2.c.toLowerCase()) ? 0 : ("info".equals(string) ? 1 : ("warning".equals(string) ? 2 : ("error".equals(string) ? 3 : -1)))) >= 0) {
            n.c("log level loaded: " + n2);
            this.f.a(n2);
        }
        if ((n2 = j2.d >= 0 ? 1 : 0) != 0) {
            this.c.a(j2.d);
        }
        n2 = j2.e != -1 ? 1 : 0;
        if (n2 == 0) return;
        boolean bl = j2.e == 1;
        au.a().a(au.a.ac);
        this.a = bl;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    static c a() {
        synchronized (c.class) {
            return l;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static c a(Context object) {
        synchronized (c.class) {
            c c2;
            if (l != null) return l;
            l = c2 = new c((Context)object);
            return l;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    final void a(Map<String, String> map) {
        synchronized (this) {
            w.a(map, "&ul", w.a(Locale.getDefault()));
            w.a(map, "&sr", r.a());
            map.put("&_u", au.a().c());
            au.a().b();
            this.b.a(map);
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final g b() {
        synchronized (this) {
            au.a().a(au.a.N);
            g g2 = new g(this, this.d);
            Object object = new u(this.d);
            object = (v)((aj)object).a(2131820546);
            if (object != null) {
                boolean bl;
                CharSequence charSequence;
                n.c("Loading Tracker config values.");
                g2.e = object;
                boolean bl2 = g2.e.a != null;
                if (bl2) {
                    object = g2.e.a;
                    g2.a("&tid", (String)object);
                    charSequence = new StringBuilder("[Tracker] trackingId loaded: ");
                    n.c(charSequence.append((String)object).toString());
                }
                if (bl2 = g2.e.b >= 0.0) {
                    charSequence = Double.toString(g2.e.b);
                    g2.a("&sf", (String)charSequence);
                    object = new StringBuilder("[Tracker] sample frequency loaded: ");
                    n.c(((StringBuilder)object).append((String)charSequence).toString());
                }
                if (bl2 = g2.e.c >= 0) {
                    long l2 = g2.e.c;
                    object = g2.d;
                    ((g.a)object).b = l2 * 1000L;
                    ((g.a)object).b();
                    object = new StringBuilder("[Tracker] session timeout loaded: ");
                    n.c(((StringBuilder)object).append(g2.d.b).toString());
                }
                if (bl2 = g2.e.d != -1) {
                    bl = g2.e.d == 1;
                    object = g2.d;
                    ((g.a)object).a = bl;
                    ((g.a)object).b();
                    object = new StringBuilder("[Tracker] auto activity tracking loaded: ");
                    n.c(((StringBuilder)object).append(g2.d.a).toString());
                }
                if (bl2 = g2.e.e != -1) {
                    bl2 = g2.e.e == 1;
                    if (bl2) {
                        g2.a("&aip", "1");
                        n.c("[Tracker] anonymize ip loaded: true");
                    }
                    n.c("[Tracker] anonymize ip loaded: false");
                }
                if (g2.c != (bl = g2.e.f == 1)) {
                    g2.c = bl;
                    if (bl) {
                        g2.f = object = new com.google.android.gms.b.b(g2, Thread.getDefaultUncaughtExceptionHandler(), g2.a);
                        Thread.setDefaultUncaughtExceptionHandler(g2.f);
                        n.c("Uncaught exceptions will be reported to Google Analytics.");
                    } else {
                        if (g2.f != null) {
                            Thread.setDefaultUncaughtExceptionHandler(g2.f.a);
                        } else {
                            Thread.setDefaultUncaughtExceptionHandler(null);
                        }
                        n.c("Uncaught exceptions will not be reported to Google Analytics.");
                    }
                }
            }
            if (this.k != null) {
                g2.a("&an", this.k);
            }
            if (this.j != null) {
                g2.a("&av", this.j);
            }
            return g2;
        }
    }

    static interface a {
        public void a();

        public void a(Activity var1);
    }

    final class b
    implements Application.ActivityLifecycleCallbacks {
        b() {
        }

        public final void onActivityCreated(Activity activity, Bundle bundle) {
        }

        public final void onActivityDestroyed(Activity activity) {
        }

        public final void onActivityPaused(Activity activity) {
        }

        public final void onActivityResumed(Activity activity) {
        }

        public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        }

        public final void onActivityStarted(Activity activity) {
            Iterator<a> iterator = c.this.g.iterator();
            while (iterator.hasNext()) {
                iterator.next().a(activity);
            }
        }

        public final void onActivityStopped(Activity object) {
            object = c.this.g.iterator();
            while (object.hasNext()) {
                ((a)object.next()).a();
            }
        }
    }
}

