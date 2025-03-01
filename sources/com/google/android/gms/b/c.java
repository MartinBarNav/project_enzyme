package com.google.android.gms.b;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import com.google.android.gms.b.au;
import com.google.android.gms.b.g;
import com.saterskog.cell_lab.C0028R;
import java.lang.Thread;
import java.util.HashSet;
import java.util.Locale;
import java.util.Map;
import java.util.Set;

public class c extends h {
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

    interface a {
        void a();

        void a(Activity activity);
    }

    private c(Context context) {
        this(context, at.a(context), ar.c());
    }

    static c a() {
        c cVar;
        synchronized (c.class) {
            cVar = l;
        }
        return cVar;
    }

    public static c a(Context context) {
        c cVar;
        synchronized (c.class) {
            if (l == null) {
                l = new c(context);
            }
            cVar = l;
        }
        return cVar;
    }

    /* access modifiers changed from: package-private */
    public final void a(Map<String, String> map) {
        synchronized (this) {
            w.a(map, "&ul", w.a(Locale.getDefault()));
            w.a(map, "&sr", (am) r.a());
            map.put("&_u", au.a().c());
            au.a().b();
            this.b.a(map);
        }
    }

    class b implements Application.ActivityLifecycleCallbacks {
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
            for (a a2 : c.this.g) {
                a2.a(activity);
            }
        }

        public final void onActivityStopped(Activity activity) {
            for (a a2 : c.this.g) {
                a2.a();
            }
        }
    }

    private c(Context context, ab abVar, s sVar) {
        ApplicationInfo applicationInfo;
        int i2;
        j jVar;
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        int i3;
        this.e = false;
        this.h = false;
        if (context == null) {
            throw new IllegalArgumentException("context cannot be null");
        }
        this.d = context.getApplicationContext();
        this.b = abVar;
        this.c = sVar;
        ac.a(this.d);
        r.a(this.d);
        ag.a(this.d);
        this.f = new al();
        this.g = new HashSet();
        if (!i) {
            try {
                applicationInfo = this.d.getPackageManager().getApplicationInfo(this.d.getPackageName(), 129);
            } catch (PackageManager.NameNotFoundException e2) {
                n.c("PackageManager doesn't know about package: " + e2);
                applicationInfo = null;
            }
            if (applicationInfo == null) {
                n.d("Couldn't get ApplicationInfo to load gloabl config.");
                return;
            }
            Bundle bundle = applicationInfo.metaData;
            if (bundle != null && (i2 = bundle.getInt("com.google.android.gms.analytics.globalConfigResource")) > 0 && (jVar = (j) new av(this.d).a(i2)) != null) {
                n.c("Loading global config values.");
                if (jVar.a != null) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    this.k = jVar.a;
                    n.c("app name loaded: " + this.k);
                }
                if (jVar.b != null) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (z2) {
                    this.j = jVar.b;
                    n.c("app version loaded: " + this.j);
                }
                if (jVar.c != null) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (z3) {
                    String lowerCase = jVar.c.toLowerCase();
                    if ("verbose".equals(lowerCase)) {
                        i3 = 0;
                    } else {
                        i3 = "info".equals(lowerCase) ? 1 : "warning".equals(lowerCase) ? 2 : "error".equals(lowerCase) ? 3 : -1;
                    }
                    if (i3 >= 0) {
                        n.c("log level loaded: " + i3);
                        this.f.a(i3);
                    }
                }
                if (jVar.d >= 0) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (z4) {
                    this.c.a(jVar.d);
                }
                if (jVar.e != -1) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                if (z5) {
                    if (jVar.e == 1) {
                        z6 = true;
                    } else {
                        z6 = false;
                    }
                    au.a().a(au.a.SET_DRY_RUN);
                    this.a = z6;
                }
            }
        }
    }

    public final g b() {
        g gVar;
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        boolean z7;
        boolean z8;
        synchronized (this) {
            au.a().a(au.a.GET_TRACKER);
            gVar = new g(this, this.d);
            v vVar = (v) new u(this.d).a((int) C0028R.xml.tracker);
            if (vVar != null) {
                n.c("Loading Tracker config values.");
                gVar.e = vVar;
                if (gVar.e.a != null) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    String str = gVar.e.a;
                    gVar.a("&tid", str);
                    n.c("[Tracker] trackingId loaded: " + str);
                }
                if (gVar.e.b >= 0.0d) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (z2) {
                    String d2 = Double.toString(gVar.e.b);
                    gVar.a("&sf", d2);
                    n.c("[Tracker] sample frequency loaded: " + d2);
                }
                if (gVar.e.c >= 0) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (z3) {
                    long j2 = (long) gVar.e.c;
                    g.a aVar = gVar.d;
                    aVar.b = j2 * 1000;
                    aVar.b();
                    n.c("[Tracker] session timeout loaded: " + gVar.d.b);
                }
                if (gVar.e.d != -1) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (z4) {
                    if (gVar.e.d == 1) {
                        z8 = true;
                    } else {
                        z8 = false;
                    }
                    g.a aVar2 = gVar.d;
                    aVar2.a = z8;
                    aVar2.b();
                    n.c("[Tracker] auto activity tracking loaded: " + gVar.d.a);
                }
                if (gVar.e.e != -1) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                if (z5) {
                    if (gVar.e.e == 1) {
                        z7 = true;
                    } else {
                        z7 = false;
                    }
                    if (z7) {
                        gVar.a("&aip", "1");
                        n.c("[Tracker] anonymize ip loaded: true");
                    }
                    n.c("[Tracker] anonymize ip loaded: false");
                }
                if (gVar.e.f == 1) {
                    z6 = true;
                } else {
                    z6 = false;
                }
                if (gVar.c != z6) {
                    gVar.c = z6;
                    if (z6) {
                        gVar.f = new b(gVar, Thread.getDefaultUncaughtExceptionHandler(), gVar.a);
                        Thread.setDefaultUncaughtExceptionHandler(gVar.f);
                        n.c("Uncaught exceptions will be reported to Google Analytics.");
                    } else {
                        if (gVar.f != null) {
                            Thread.setDefaultUncaughtExceptionHandler(gVar.f.a);
                        } else {
                            Thread.setDefaultUncaughtExceptionHandler((Thread.UncaughtExceptionHandler) null);
                        }
                        n.c("Uncaught exceptions will not be reported to Google Analytics.");
                    }
                }
            }
            if (this.k != null) {
                gVar.a("&an", this.k);
            }
            if (this.j != null) {
                gVar.a("&av", this.j);
            }
        }
        return gVar;
    }
}
