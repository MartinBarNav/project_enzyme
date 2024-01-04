// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.b;

import android.app.Application$ActivityLifecycleCallbacks;
import android.os.Build$VERSION;
import android.app.Application;
import android.content.Intent;
import android.net.Uri;
import android.app.Activity;
import com.google.android.gms.internal.f;
import java.util.Iterator;
import android.text.TextUtils;
import java.util.Random;
import java.util.HashMap;
import java.util.Map;
import android.content.Context;

public final class g
{
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
    
    g(final h h, final Context context) {
        this(h, ag.a(), r.a(), ac.a(), new m("tracking", (byte)0), context);
    }
    
    private g(final h g, final ag j, final r k, final ac l, final q i, final Context context) {
        this.h = new HashMap<String, String>();
        this.b = new HashMap<String, String>();
        this.g = g;
        if (context != null) {
            this.a = context.getApplicationContext();
        }
        this.h.put("useSecure", "1");
        this.j = j;
        this.k = k;
        this.l = l;
        this.h.put("&a", Integer.toString(new Random().nextInt(Integer.MAX_VALUE) + 1));
        this.i = i;
        this.d = new a();
        this.h.put("&ate", null);
        this.h.put("&adid", null);
    }
    
    public final void a(final String s, final String s2) {
        au.a().a(au.a.k);
        this.h.put(s, s2);
    }
    
    public final void a(final Map<String, String> map) {
        au.a().a(au.a.l);
        final HashMap<Object, Object> hashMap = new HashMap<Object, Object>();
        hashMap.putAll(this.h);
        if (map != null) {
            hashMap.putAll(map);
        }
        for (final String s : this.b.keySet()) {
            if (!hashMap.containsKey(s)) {
                hashMap.put(s, this.b.get(s));
            }
        }
        this.b.clear();
        if (TextUtils.isEmpty((CharSequence)hashMap.get("&tid"))) {
            n.d(String.format("Missing tracking id (%s) parameter.", "&tid"));
        }
        String s2;
        if (TextUtils.isEmpty((CharSequence)(s2 = hashMap.get("&t")))) {
            n.d(String.format("Missing hit type (%s) parameter.", "&t"));
            s2 = "";
        }
        final a d = this.d;
        final boolean c = d.c;
        d.c = false;
        if (c) {
            hashMap.put("&sc", "start");
        }
        final String lowerCase = s2.toLowerCase();
        if ("screenview".equals(lowerCase) || "pageview".equals(lowerCase) || "appview".equals(lowerCase) || TextUtils.isEmpty((CharSequence)lowerCase)) {
            int i;
            if ((i = Integer.parseInt(this.h.get("&a")) + 1) >= Integer.MAX_VALUE) {
                i = 1;
            }
            this.h.put("&a", Integer.toString(i));
        }
        if (!lowerCase.equals("transaction") && !lowerCase.equals("item") && !this.i.a()) {
            n.d("Too many hits sent too quickly, rate limiting invoked.");
        }
        else {
            this.g.a((Map<String, String>)hashMap);
        }
    }
    
    private final class a implements c.a
    {
        boolean a;
        long b;
        boolean c;
        private int e;
        private long f;
        private f g;
        
        public a() {
            this.a = false;
            this.e = 0;
            this.b = -1L;
            this.c = false;
            this.g = com.google.android.gms.internal.g.c();
        }
        
        @Override
        public final void a() {
            au.a().a(au.a.aj);
            --this.e;
            this.e = Math.max(0, this.e);
            if (this.e == 0) {
                this.f = this.g.b();
            }
        }
        
        @Override
        public final void a(final Activity activity) {
            au.a().a(au.a.ai);
            if (this.e == 0) {
                int n;
                if (this.g.b() >= this.f + Math.max(1000L, this.b)) {
                    n = 1;
                }
                else {
                    n = 0;
                }
                if (n != 0) {
                    this.c = true;
                }
            }
            ++this.e;
            if (this.a) {
                final Intent intent = activity.getIntent();
                if (intent != null) {
                    final g d = com.google.android.gms.b.g.this;
                    final Uri data = intent.getData();
                    if (data != null) {
                        final String queryParameter = data.getQueryParameter("referrer");
                        if (!TextUtils.isEmpty((CharSequence)queryParameter)) {
                            final Uri parse = Uri.parse("http://hostname/?" + queryParameter);
                            final String queryParameter2 = parse.getQueryParameter("utm_id");
                            if (queryParameter2 != null) {
                                d.b.put("&ci", queryParameter2);
                            }
                            final String queryParameter3 = parse.getQueryParameter("utm_campaign");
                            if (queryParameter3 != null) {
                                d.b.put("&cn", queryParameter3);
                            }
                            final String queryParameter4 = parse.getQueryParameter("utm_content");
                            if (queryParameter4 != null) {
                                d.b.put("&cc", queryParameter4);
                            }
                            final String queryParameter5 = parse.getQueryParameter("utm_medium");
                            if (queryParameter5 != null) {
                                d.b.put("&cm", queryParameter5);
                            }
                            final String queryParameter6 = parse.getQueryParameter("utm_source");
                            if (queryParameter6 != null) {
                                d.b.put("&cs", queryParameter6);
                            }
                            final String queryParameter7 = parse.getQueryParameter("utm_term");
                            if (queryParameter7 != null) {
                                d.b.put("&ck", queryParameter7);
                            }
                            final String queryParameter8 = parse.getQueryParameter("dclid");
                            if (queryParameter8 != null) {
                                d.b.put("&dclid", queryParameter8);
                            }
                            final String queryParameter9 = parse.getQueryParameter("gclid");
                            if (queryParameter9 != null) {
                                d.b.put("&gclid", queryParameter9);
                            }
                        }
                    }
                }
                final HashMap<String, String> hashMap = new HashMap<String, String>();
                hashMap.put("&t", "screenview");
                au.a().a(true);
                final g d2 = com.google.android.gms.b.g.this;
                String s;
                if (com.google.android.gms.b.g.this.e != null) {
                    final v e = com.google.android.gms.b.g.this.e;
                    s = activity.getClass().getCanonicalName();
                    final String s2 = e.g.get(s);
                    if (s2 != null) {
                        s = s2;
                    }
                }
                else {
                    s = activity.getClass().getCanonicalName();
                }
                d2.a("&cd", s);
                com.google.android.gms.b.g.this.a(hashMap);
                au.a().a(false);
            }
        }
        
        final void b() {
            final c a = com.google.android.gms.b.c.a();
            if (a == null) {
                n.a("GoogleAnalytics isn't initialized for the Tracker!");
            }
            else if (this.b >= 0L || this.a) {
                a.g.add((c.a)com.google.android.gms.b.g.this.d);
                if (a.d instanceof Application) {
                    final Application application = (Application)a.d;
                    if (Build$VERSION.SDK_INT >= 14 && !a.h) {
                        application.registerActivityLifecycleCallbacks((Application$ActivityLifecycleCallbacks)a.new b());
                        a.h = true;
                    }
                }
            }
            else {
                a.g.remove(com.google.android.gms.b.g.this.d);
            }
        }
    }
}
