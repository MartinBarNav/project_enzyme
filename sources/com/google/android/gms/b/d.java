package com.google.android.gms.b;

import android.text.TextUtils;
import com.google.android.gms.b.au;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public final class d {

    @Deprecated
    public static class a extends C0022d<a> {
        public a() {
            au.a().a(au.a.CONSTRUCT_APP_VIEW);
            a("&t", "screenview");
        }

        public final /* bridge */ /* synthetic */ Map a() {
            return super.a();
        }
    }

    public static class b extends C0022d<b> {
        public b() {
            au.a().a(au.a.CONSTRUCT_EVENT);
            a("&t", "event");
        }

        public final /* bridge */ /* synthetic */ Map a() {
            return super.a();
        }
    }

    public static class c extends C0022d<c> {
        public c() {
            au.a().a(au.a.CONSTRUCT_EXCEPTION);
            a("&t", "exception");
        }

        public final /* bridge */ /* synthetic */ Map a() {
            return super.a();
        }
    }

    public static class e extends C0022d<e> {
        public e() {
            au.a().a(au.a.CONSTRUCT_TIMING);
            a("&t", "timing");
        }

        public final /* bridge */ /* synthetic */ Map a() {
            return super.a();
        }
    }

    /* renamed from: com.google.android.gms.b.d$d  reason: collision with other inner class name */
    protected static class C0022d<T extends C0022d> {
        com.google.android.gms.b.a.b a;
        Map<String, List<com.google.android.gms.b.a.a>> b = new HashMap();
        List<com.google.android.gms.b.a.c> c = new ArrayList();
        List<com.google.android.gms.b.a.a> d = new ArrayList();
        private Map<String, String> e = new HashMap();

        protected C0022d() {
        }

        public final T a(String str, String str2) {
            au.a().a(au.a.MAP_BUILDER_SET);
            this.e.put(str, str2);
            return this;
        }

        public Map<String, String> a() {
            HashMap hashMap = new HashMap(this.e);
            if (this.a != null) {
                hashMap.putAll(new HashMap(this.a.a));
            }
            int i = 1;
            for (com.google.android.gms.b.a.c a2 : this.c) {
                hashMap.putAll(a2.a(ao.a("&promo", i)));
                i++;
            }
            int i2 = 1;
            for (com.google.android.gms.b.a.a a3 : this.d) {
                hashMap.putAll(a3.a(ao.a("&pr", i2)));
                i2++;
            }
            int i3 = 1;
            for (Map.Entry next : this.b.entrySet()) {
                String a4 = ao.a("&il", i3);
                int i4 = 1;
                for (com.google.android.gms.b.a.a a5 : (List) next.getValue()) {
                    hashMap.putAll(a5.a(a4 + ao.a("pi", i4)));
                    i4++;
                }
                if (!TextUtils.isEmpty((CharSequence) next.getKey())) {
                    hashMap.put(a4 + "nm", next.getKey());
                }
                i3++;
            }
            return hashMap;
        }
    }
}
