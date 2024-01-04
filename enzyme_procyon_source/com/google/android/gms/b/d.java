// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.b;

import java.util.Iterator;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.HashMap;
import com.google.android.gms.b.a.c;
import com.google.android.gms.b.a.a;
import java.util.List;
import com.google.android.gms.b.a.b;
import java.util.Map;

public final class d
{
    @Deprecated
    public static final class a extends d<a>
    {
        public a() {
            au.a().a(au.a.ak);
            this.a("&t", "screenview");
        }
    }
    
    public static final class b extends d<b>
    {
        public b() {
            au.a().a(au.a.Y);
            this.a("&t", "event");
        }
    }
    
    public static final class c extends d<c>
    {
        public c() {
            au.a().a(au.a.H);
            this.a("&t", "exception");
        }
    }
    
    protected static class d<T extends d>
    {
        com.google.android.gms.b.a.b a;
        Map<String, List<com.google.android.gms.b.a.a>> b;
        List<com.google.android.gms.b.a.c> c;
        List<com.google.android.gms.b.a.a> d;
        private Map<String, String> e;
        
        protected d() {
            this.e = new HashMap<String, String>();
            this.b = new HashMap<String, List<com.google.android.gms.b.a.a>>();
            this.c = new ArrayList<com.google.android.gms.b.a.c>();
            this.d = new ArrayList<com.google.android.gms.b.a.a>();
        }
        
        public final T a(final String s, final String s2) {
            au.a().a(au.a.a);
            this.e.put(s, s2);
            return (T)this;
        }
        
        public Map<String, String> a() {
            final HashMap<String, String> hashMap = new HashMap<String, String>(this.e);
            if (this.a != null) {
                hashMap.putAll((Map<?, ?>)new HashMap<Object, Object>(this.a.a));
            }
            final Iterator<com.google.android.gms.b.a.c> iterator = this.c.iterator();
            int n = 1;
            while (iterator.hasNext()) {
                hashMap.putAll((Map<?, ?>)iterator.next().a(ao.a("&promo", n)));
                ++n;
            }
            final Iterator<com.google.android.gms.b.a.a> iterator2 = this.d.iterator();
            int n2 = 1;
            while (iterator2.hasNext()) {
                hashMap.putAll((Map<?, ?>)iterator2.next().a(ao.a("&pr", n2)));
                ++n2;
            }
            final Iterator<Map.Entry<String, List<com.google.android.gms.b.a.a>>> iterator3 = this.b.entrySet().iterator();
            int n3 = 1;
            while (iterator3.hasNext()) {
                final Map.Entry<String, List<com.google.android.gms.b.a.a>> entry = iterator3.next();
                final List<com.google.android.gms.b.a.a> list = entry.getValue();
                final String a = ao.a("&il", n3);
                final Iterator<com.google.android.gms.b.a.a> iterator4 = list.iterator();
                int n4 = 1;
                while (iterator4.hasNext()) {
                    hashMap.putAll((Map<?, ?>)iterator4.next().a(a + ao.a("pi", n4)));
                    ++n4;
                }
                if (!TextUtils.isEmpty((CharSequence)entry.getKey())) {
                    hashMap.put(a + "nm", entry.getKey());
                }
                ++n3;
            }
            return hashMap;
        }
    }
    
    public static final class e extends d<e>
    {
        public e() {
            au.a().a(au.a.J);
            this.a("&t", "timing");
        }
    }
}
