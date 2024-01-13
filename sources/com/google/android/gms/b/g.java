package com.google.android.gms.b;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.text.TextUtils;
import com.google.android.gms.b.au;
import com.google.android.gms.b.c;
import com.google.android.gms.internal.f;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public final class g {
    Context a;
    final Map<String, String> b;
    boolean c;
    a d;
    v e;
    b f;
    private final h g;
    private final Map<String, String> h;
    private q i;
    private final ag j;
    private final r k;
    private final ac l;

    g(h hVar, Context context) {
        this(hVar, ag.a(), r.a(), ac.a(), new m("tracking", (byte) 0), context);
    }

    public final void a(String str, String str2) {
        au.a().a(au.a.SET);
        this.h.put(str, str2);
    }

    private class a implements c.a {
        boolean a = false;
        long b = -1;
        boolean c = false;
        private int e = 0;
        private long f;
        private f g = com.google.android.gms.internal.g.c();

        public a() {
        }

        public final void a() {
            au.a().a(au.a.EASY_TRACKER_ACTIVITY_STOP);
            this.e--;
            this.e = Math.max(0, this.e);
            if (this.e == 0) {
                this.f = this.g.b();
            }
        }

        /* access modifiers changed from: package-private */
        public final void b() {
            c a2 = c.a();
            if (a2 == null) {
                n.a("GoogleAnalytics isn't initialized for the Tracker!");
            } else if (this.b >= 0 || this.a) {
                a2.g.add(g.this.d);
                if (a2.d instanceof Application) {
                    Application application = (Application) a2.d;
                    if (Build.VERSION.SDK_INT >= 14 && !a2.h) {
                        application.registerActivityLifecycleCallbacks(new c.b());
                        a2.h = true;
                    }
                }
            } else {
                a2.g.remove(g.this.d);
            }
        }

        public final void a(Activity activity) {
            String canonicalName;
            au.a().a(au.a.EASY_TRACKER_ACTIVITY_START);
            if (this.e == 0) {
                if (this.g.b() >= this.f + Math.max(1000, this.b)) {
                    this.c = true;
                }
            }
            this.e++;
            if (this.a) {
                Intent intent = activity.getIntent();
                if (intent != null) {
                    g gVar = g.this;
                    Uri data = intent.getData();
                    if (data != null) {
                        String queryParameter = data.getQueryParameter("referrer");
                        if (!TextUtils.isEmpty(queryParameter)) {
                            Uri parse = Uri.parse("http://hostname/?" + queryParameter);
                            String queryParameter2 = parse.getQueryParameter("utm_id");
                            if (queryParameter2 != null) {
                                gVar.b.put("&ci", queryParameter2);
                            }
                            String queryParameter3 = parse.getQueryParameter("utm_campaign");
                            if (queryParameter3 != null) {
                                gVar.b.put("&cn", queryParameter3);
                            }
                            String queryParameter4 = parse.getQueryParameter("utm_content");
                            if (queryParameter4 != null) {
                                gVar.b.put("&cc", queryParameter4);
                            }
                            String queryParameter5 = parse.getQueryParameter("utm_medium");
                            if (queryParameter5 != null) {
                                gVar.b.put("&cm", queryParameter5);
                            }
                            String queryParameter6 = parse.getQueryParameter("utm_source");
                            if (queryParameter6 != null) {
                                gVar.b.put("&cs", queryParameter6);
                            }
                            String queryParameter7 = parse.getQueryParameter("utm_term");
                            if (queryParameter7 != null) {
                                gVar.b.put("&ck", queryParameter7);
                            }
                            String queryParameter8 = parse.getQueryParameter("dclid");
                            if (queryParameter8 != null) {
                                gVar.b.put("&dclid", queryParameter8);
                            }
                            String queryParameter9 = parse.getQueryParameter("gclid");
                            if (queryParameter9 != null) {
                                gVar.b.put("&gclid", queryParameter9);
                            }
                        }
                    }
                }
                HashMap hashMap = new HashMap();
                hashMap.put("&t", "screenview");
                au.a().a(true);
                g gVar2 = g.this;
                if (g.this.e != null) {
                    v vVar = g.this.e;
                    String canonicalName2 = activity.getClass().getCanonicalName();
                    canonicalName = vVar.g.get(canonicalName2);
                    if (canonicalName == null) {
                        canonicalName = canonicalName2;
                    }
                } else {
                    canonicalName = activity.getClass().getCanonicalName();
                }
                gVar2.a("&cd", canonicalName);
                g.this.a(hashMap);
                au.a().a(false);
            }
        }
    }

    private g(h hVar, ag agVar, r rVar, ac acVar, q qVar, Context context) {
        this.h = new HashMap();
        this.b = new HashMap();
        this.g = hVar;
        if (context != null) {
            this.a = context.getApplicationContext();
        }
        this.h.put("useSecure", "1");
        this.j = agVar;
        this.k = rVar;
        this.l = acVar;
        this.h.put("&a", Integer.toString(new Random().nextInt(Integer.MAX_VALUE) + 1));
        this.i = qVar;
        this.d = new a();
        this.h.put("&ate", (Object) null);
        this.h.put("&adid", (Object) null);
    }

    public final void a(Map<String, String> map) {
        au.a().a(au.a.SEND);
        HashMap hashMap = new HashMap();
        hashMap.putAll(this.h);
        if (map != null) {
            hashMap.putAll(map);
        }
        for (String next : this.b.keySet()) {
            if (!hashMap.containsKey(next)) {
                hashMap.put(next, this.b.get(next));
            }
        }
        this.b.clear();
        if (TextUtils.isEmpty((CharSequence) hashMap.get("&tid"))) {
            n.d(String.format("Missing tracking id (%s) parameter.", new Object[]{"&tid"}));
        }
        String str = (String) hashMap.get("&t");
        if (TextUtils.isEmpty(str)) {
            n.d(String.format("Missing hit type (%s) parameter.", new Object[]{"&t"}));
            str = "";
        }
        a aVar = this.d;
        boolean z = aVar.c;
        aVar.c = false;
        if (z) {
            hashMap.put("&sc", "start");
        }
        String lowerCase = str.toLowerCase();
        if ("screenview".equals(lowerCase) || "pageview".equals(lowerCase) || "appview".equals(lowerCase) || TextUtils.isEmpty(lowerCase)) {
            int parseInt = Integer.parseInt(this.h.get("&a")) + 1;
            if (parseInt >= Integer.MAX_VALUE) {
                parseInt = 1;
            }
            this.h.put("&a", Integer.toString(parseInt));
        }
        if (lowerCase.equals("transaction") || lowerCase.equals("item") || this.i.a()) {
            this.g.a(hashMap);
        } else {
            n.d("Too many hits sent too quickly, rate limiting invoked.");
        }
    }
}
