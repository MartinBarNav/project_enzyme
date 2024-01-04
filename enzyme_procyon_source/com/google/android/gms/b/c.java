// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.b;

import java.util.Iterator;
import android.app.Application$ActivityLifecycleCallbacks;
import android.app.Activity;
import java.util.Locale;
import java.util.Map;
import android.os.Bundle;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager$NameNotFoundException;
import java.util.HashSet;
import java.util.Set;
import android.content.Context;

public class c extends h
{
    private static boolean i;
    private static c l;
    boolean a;
    ab b;
    s c;
    Context d;
    volatile Boolean e;
    e f;
    Set<a> g;
    boolean h;
    private String j;
    private String k;
    
    private c(final Context context) {
        this(context, at.a(context), ar.c());
    }
    
    private c(final Context context, final ab b, final s c) {
        this.e = false;
        this.h = false;
        if (context == null) {
            throw new IllegalArgumentException("context cannot be null");
        }
        this.d = context.getApplicationContext();
        this.b = b;
        this.c = c;
        ac.a(this.d);
        r.a(this.d);
        ag.a(this.d);
        this.f = new al();
        this.g = new HashSet<a>();
        if (com.google.android.gms.b.c.i) {
            return;
        }
        while (true) {
            ApplicationInfo applicationInfo;
            while (true) {
                try {
                    applicationInfo = this.d.getPackageManager().getApplicationInfo(this.d.getPackageName(), 129);
                    if (applicationInfo == null) {
                        n.d("Couldn't get ApplicationInfo to load gloabl config.");
                        return;
                    }
                }
                catch (PackageManager$NameNotFoundException obj) {
                    n.c("PackageManager doesn't know about package: " + obj);
                    applicationInfo = null;
                    continue;
                }
                break;
            }
            final Bundle metaData = applicationInfo.metaData;
            if (metaData == null) {
                return;
            }
            final int int1 = metaData.getInt("com.google.android.gms.analytics.globalConfigResource");
            if (int1 <= 0) {
                return;
            }
            final j j = new av(this.d).a(int1);
            if (j == null) {
                return;
            }
            n.c("Loading global config values.");
            int n;
            if (j.a != null) {
                n = 1;
            }
            else {
                n = 0;
            }
            if (n != 0) {
                this.k = j.a;
                com.google.android.gms.b.n.c("app name loaded: " + this.k);
            }
            int n2;
            if (j.b != null) {
                n2 = 1;
            }
            else {
                n2 = 0;
            }
            if (n2 != 0) {
                this.j = j.b;
                com.google.android.gms.b.n.c("app version loaded: " + this.j);
            }
            int n3;
            if (j.c != null) {
                n3 = 1;
            }
            else {
                n3 = 0;
            }
            if (n3 != 0) {
                final String lowerCase = j.c.toLowerCase();
                int i;
                if ("verbose".equals(lowerCase)) {
                    i = 0;
                }
                else if ("info".equals(lowerCase)) {
                    i = 1;
                }
                else if ("warning".equals(lowerCase)) {
                    i = 2;
                }
                else if ("error".equals(lowerCase)) {
                    i = 3;
                }
                else {
                    i = -1;
                }
                if (i >= 0) {
                    com.google.android.gms.b.n.c("log level loaded: " + i);
                    this.f.a(i);
                }
            }
            int n4;
            if (j.d >= 0) {
                n4 = 1;
            }
            else {
                n4 = 0;
            }
            if (n4 != 0) {
                this.c.a(j.d);
            }
            int n5;
            if (j.e != -1) {
                n5 = 1;
            }
            else {
                n5 = 0;
            }
            if (n5 != 0) {
                final boolean a = j.e == 1;
                au.a().a(au.a.ac);
                this.a = a;
            }
        }
    }
    
    static c a() {
        synchronized (c.class) {
            return c.l;
        }
    }
    
    public static c a(final Context context) {
        synchronized (c.class) {
            if (c.l == null) {
                c.l = new c(context);
            }
            return c.l;
        }
    }
    
    @Override
    final void a(final Map<String, String> map) {
        synchronized (this) {
            w.a(map, "&ul", w.a(Locale.getDefault()));
            w.a(map, "&sr", r.a());
            map.put("&_u", au.a().c());
            au.a().b();
            this.b.a(map);
        }
    }
    
    public final g b() {
        while (true) {
            while (true) {
                Label_0565: {
                    synchronized (this) {
                        au.a().a(au.a.N);
                        final g g = new g(this, this.d);
                        final v e = new u(this.d).a(2131820546);
                        if (e != null) {
                            n.c("Loading Tracker config values.");
                            g.e = e;
                            int n;
                            if (g.e.a != null) {
                                n = 1;
                            }
                            else {
                                n = 0;
                            }
                            if (n != 0) {
                                final String a = g.e.a;
                                g.a("&tid", a);
                                com.google.android.gms.b.n.c("[Tracker] trackingId loaded: " + a);
                            }
                            int n2;
                            if (g.e.b >= 0.0) {
                                n2 = 1;
                            }
                            else {
                                n2 = 0;
                            }
                            if (n2 != 0) {
                                final String string = Double.toString(g.e.b);
                                g.a("&sf", string);
                                com.google.android.gms.b.n.c("[Tracker] sample frequency loaded: " + string);
                            }
                            int n3;
                            if (g.e.c >= 0) {
                                n3 = 1;
                            }
                            else {
                                n3 = 0;
                            }
                            if (n3 != 0) {
                                final long n4 = g.e.c;
                                final g.a d = g.d;
                                d.b = n4 * 1000L;
                                d.b();
                                com.google.android.gms.b.n.c("[Tracker] session timeout loaded: " + g.d.b);
                            }
                            int n5;
                            if (g.e.d != -1) {
                                n5 = 1;
                            }
                            else {
                                n5 = 0;
                            }
                            if (n5 != 0) {
                                final boolean a2 = g.e.d == 1;
                                final g.a d2 = g.d;
                                d2.a = a2;
                                d2.b();
                                com.google.android.gms.b.n.c("[Tracker] auto activity tracking loaded: " + g.d.a);
                            }
                            int n6;
                            if (g.e.e != -1) {
                                n6 = 1;
                            }
                            else {
                                n6 = 0;
                            }
                            if (n6 != 0) {
                                int n7;
                                if (g.e.e == 1) {
                                    n7 = 1;
                                }
                                else {
                                    n7 = 0;
                                }
                                if (n7 != 0) {
                                    g.a("&aip", "1");
                                    com.google.android.gms.b.n.c("[Tracker] anonymize ip loaded: true");
                                }
                                com.google.android.gms.b.n.c("[Tracker] anonymize ip loaded: false");
                            }
                            final boolean c = g.e.f == 1;
                            if (g.c != c) {
                                g.c = c;
                                if (c) {
                                    Thread.setDefaultUncaughtExceptionHandler((Thread.UncaughtExceptionHandler)(g.f = new com.google.android.gms.b.b(g, Thread.getDefaultUncaughtExceptionHandler(), g.a)));
                                    com.google.android.gms.b.n.c("Uncaught exceptions will be reported to Google Analytics.");
                                }
                                else {
                                    if (g.f == null) {
                                        break Label_0565;
                                    }
                                    Thread.setDefaultUncaughtExceptionHandler(g.f.a);
                                    com.google.android.gms.b.n.c("Uncaught exceptions will not be reported to Google Analytics.");
                                }
                            }
                        }
                        if (this.k != null) {
                            g.a("&an", this.k);
                        }
                        if (this.j != null) {
                            g.a("&av", this.j);
                        }
                        return g;
                    }
                }
                Thread.setDefaultUncaughtExceptionHandler(null);
                continue;
            }
        }
    }
    
    interface a
    {
        void a();
        
        void a(final Activity p0);
    }
    
    final class b implements Application$ActivityLifecycleCallbacks
    {
        public final void onActivityCreated(final Activity activity, final Bundle bundle) {
        }
        
        public final void onActivityDestroyed(final Activity activity) {
        }
        
        public final void onActivityPaused(final Activity activity) {
        }
        
        public final void onActivityResumed(final Activity activity) {
        }
        
        public final void onActivitySaveInstanceState(final Activity activity, final Bundle bundle) {
        }
        
        public final void onActivityStarted(final Activity activity) {
            final Iterator<a> iterator = com.google.android.gms.b.c.this.g.iterator();
            while (iterator.hasNext()) {
                ((a)iterator.next()).a(activity);
            }
        }
        
        public final void onActivityStopped(final Activity activity) {
            final Iterator<a> iterator = com.google.android.gms.b.c.this.g.iterator();
            while (iterator.hasNext()) {
                ((a)iterator.next()).a();
            }
        }
    }
}
