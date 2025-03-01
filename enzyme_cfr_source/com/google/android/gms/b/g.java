/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.app.Application
 *  android.content.Context
 *  android.net.Uri
 *  android.os.Build$VERSION
 *  android.text.TextUtils
 */
package com.google.android.gms.b;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.text.TextUtils;
import com.google.android.gms.b.ac;
import com.google.android.gms.b.ag;
import com.google.android.gms.b.au;
import com.google.android.gms.b.b;
import com.google.android.gms.b.c;
import com.google.android.gms.b.h;
import com.google.android.gms.b.m;
import com.google.android.gms.b.n;
import com.google.android.gms.b.q;
import com.google.android.gms.b.r;
import com.google.android.gms.b.v;
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
    private final Map<String, String> h = new HashMap<String, String>();
    private q i;
    private final ag j;
    private final r k;
    private final ac l;

    g(h h2, Context context) {
        this(h2, ag.a(), r.a(), ac.a(), new m("tracking", 0), context);
    }

    private g(h h2, ag ag2, r r2, ac ac2, q q2, Context context) {
        this.b = new HashMap<String, String>();
        this.g = h2;
        if (context != null) {
            this.a = context.getApplicationContext();
        }
        this.h.put("useSecure", "1");
        this.j = ag2;
        this.k = r2;
        this.l = ac2;
        this.h.put("&a", Integer.toString(new Random().nextInt(Integer.MAX_VALUE) + 1));
        this.i = q2;
        this.d = new a();
        this.h.put("&ate", null);
        this.h.put("&adid", null);
    }

    public final void a(String string, String string2) {
        au.a().a(au.a.k);
        this.h.put(string, string2);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final void a(Map<String, String> object) {
        au.a().a(au.a.l);
        HashMap<String, String> hashMap = new HashMap<String, String>();
        hashMap.putAll(this.h);
        if (object != null) {
            hashMap.putAll((Map<String, String>)object);
        }
        Object object2 = this.b.keySet().iterator();
        while (object2.hasNext()) {
            object = object2.next();
            if (hashMap.containsKey(object)) continue;
            hashMap.put((String)object, this.b.get(object));
        }
        this.b.clear();
        if (TextUtils.isEmpty((CharSequence)((CharSequence)hashMap.get("&tid")))) {
            n.d(String.format("Missing tracking id (%s) parameter.", "&tid"));
        }
        object = object2 = (String)hashMap.get("&t");
        if (TextUtils.isEmpty((CharSequence)object2)) {
            n.d(String.format("Missing hit type (%s) parameter.", "&t"));
            object = "";
        }
        object2 = this.d;
        boolean bl = ((a)object2).c;
        ((a)object2).c = false;
        if (bl) {
            hashMap.put("&sc", "start");
        }
        if ("screenview".equals(object = ((String)object).toLowerCase()) || "pageview".equals(object) || "appview".equals(object) || TextUtils.isEmpty((CharSequence)object)) {
            int n2;
            int n3 = n2 = Integer.parseInt(this.h.get("&a")) + 1;
            if (n2 >= Integer.MAX_VALUE) {
                n3 = 1;
            }
            this.h.put("&a", Integer.toString(n3));
        }
        if (!(((String)object).equals("transaction") || ((String)object).equals("item") || this.i.a())) {
            n.d("Too many hits sent too quickly, rate limiting invoked.");
            return;
        }
        this.g.a(hashMap);
    }

    private final class a
    implements c.a {
        boolean a = false;
        long b = -1L;
        boolean c = false;
        private int e = 0;
        private long f;
        private f g = com.google.android.gms.internal.g.c();

        @Override
        public final void a() {
            au.a().a(au.a.aj);
            --this.e;
            this.e = Math.max(0, this.e);
            if (this.e == 0) {
                this.f = this.g.b();
            }
        }

        /*
         * Enabled aggressive block sorting
         */
        @Override
        public final void a(Activity object) {
            boolean bl;
            au.a().a(au.a.ai);
            if (this.e == 0 && (bl = this.g.b() >= this.f + Math.max(1000L, this.b))) {
                this.c = true;
            }
            ++this.e;
            if (this.a) {
                Object object2;
                Object object3;
                Object object4 = object.getIntent();
                if (object4 != null) {
                    object3 = g.this;
                    if ((object4 = object4.getData()) != null && !TextUtils.isEmpty((CharSequence)(object4 = object4.getQueryParameter("referrer")))) {
                        object2 = (object4 = Uri.parse((String)("http://hostname/?" + (String)object4))).getQueryParameter("utm_id");
                        if (object2 != null) {
                            ((g)object3).b.put("&ci", (String)object2);
                        }
                        if ((object2 = object4.getQueryParameter("utm_campaign")) != null) {
                            ((g)object3).b.put("&cn", (String)object2);
                        }
                        if ((object2 = object4.getQueryParameter("utm_content")) != null) {
                            ((g)object3).b.put("&cc", (String)object2);
                        }
                        if ((object2 = object4.getQueryParameter("utm_medium")) != null) {
                            ((g)object3).b.put("&cm", (String)object2);
                        }
                        if ((object2 = object4.getQueryParameter("utm_source")) != null) {
                            ((g)object3).b.put("&cs", (String)object2);
                        }
                        if ((object2 = object4.getQueryParameter("utm_term")) != null) {
                            ((g)object3).b.put("&ck", (String)object2);
                        }
                        if ((object2 = object4.getQueryParameter("dclid")) != null) {
                            ((g)object3).b.put("&dclid", (String)object2);
                        }
                        if ((object4 = object4.getQueryParameter("gclid")) != null) {
                            ((g)object3).b.put("&gclid", (String)object4);
                        }
                    }
                }
                object2 = new HashMap<String, String>();
                object2.put("&t", "screenview");
                au.a().a(true);
                object4 = g.this;
                if (g.this.e != null) {
                    object3 = g.this.e;
                    object3 = ((v)object3).g.get(object = object.getClass().getCanonicalName());
                    if (object3 != null) {
                        object = object3;
                    }
                } else {
                    object = object.getClass().getCanonicalName();
                }
                ((g)object4).a("&cd", (String)object);
                g.this.a((Map<String, String>)object2);
                au.a().a(false);
            }
        }

        /*
         * Enabled aggressive block sorting
         */
        final void b() {
            c c2 = com.google.android.gms.b.c.a();
            if (c2 == null) {
                n.a("GoogleAnalytics isn't initialized for the Tracker!");
                return;
            }
            if (this.b < 0L && !this.a) {
                a a2 = g.this.d;
                c2.g.remove(a2);
                return;
            }
            a a3 = g.this.d;
            c2.g.add(a3);
            if (!(c2.d instanceof Application)) return;
            a3 = (Application)c2.d;
            if (Build.VERSION.SDK_INT < 14) return;
            if (c2.h) return;
            a3.registerActivityLifecycleCallbacks(c2.new c.b());
            c2.h = true;
        }
    }
}

