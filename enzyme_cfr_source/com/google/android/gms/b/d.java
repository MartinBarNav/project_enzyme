/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  android.text.TextUtils
 */
package com.google.android.gms.b;

import android.text.TextUtils;
import com.google.android.gms.b.ao;
import com.google.android.gms.b.au;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public final class d {

    @Deprecated
    public static final class a
    extends d<a> {
        public a() {
            au.a().a(au.a.ak);
            this.a("&t", "screenview");
        }
    }

    public static final class b
    extends d<b> {
        public b() {
            au.a().a(au.a.Y);
            this.a("&t", "event");
        }
    }

    public static final class c
    extends d<c> {
        public c() {
            au.a().a(au.a.H);
            this.a("&t", "exception");
        }
    }

    protected static class d<T extends d> {
        com.google.android.gms.b.a.b a;
        Map<String, List<com.google.android.gms.b.a.a>> b;
        List<com.google.android.gms.b.a.c> c;
        List<com.google.android.gms.b.a.a> d;
        private Map<String, String> e = new HashMap<String, String>();

        protected d() {
            this.b = new HashMap<String, List<com.google.android.gms.b.a.a>>();
            this.c = new ArrayList<com.google.android.gms.b.a.c>();
            this.d = new ArrayList<com.google.android.gms.b.a.a>();
        }

        public final T a(String string, String string2) {
            au.a().a(au.a.a);
            this.e.put(string, string2);
            return (T)this;
        }

        public Map<String, String> a() {
            HashMap<String, String> hashMap = new HashMap<String, String>(this.e);
            if (this.a != null) {
                hashMap.putAll(new HashMap<String, String>(this.a.a));
            }
            Object object = this.c.iterator();
            int n2 = 1;
            while (object.hasNext()) {
                hashMap.putAll(object.next().a(ao.a("&promo", n2)));
                ++n2;
            }
            object = this.d.iterator();
            n2 = 1;
            while (object.hasNext()) {
                hashMap.putAll(((com.google.android.gms.b.a.a)object.next()).a(ao.a("&pr", n2)));
                ++n2;
            }
            Iterator<Map.Entry<String, List<com.google.android.gms.b.a.a>>> iterator = this.b.entrySet().iterator();
            n2 = 1;
            while (iterator.hasNext()) {
                object = iterator.next();
                Object object2 = (List)object.getValue();
                String string = ao.a("&il", n2);
                object2 = object2.iterator();
                int n3 = 1;
                while (object2.hasNext()) {
                    hashMap.putAll(((com.google.android.gms.b.a.a)object2.next()).a(string + ao.a("pi", n3)));
                    ++n3;
                }
                if (!TextUtils.isEmpty((CharSequence)((CharSequence)object.getKey()))) {
                    hashMap.put(string + "nm", (String)object.getKey());
                }
                ++n2;
            }
            return hashMap;
        }
    }

    public static final class e
    extends d<e> {
        public e() {
            au.a().a(au.a.J);
            this.a("&t", "timing");
        }
    }
}

