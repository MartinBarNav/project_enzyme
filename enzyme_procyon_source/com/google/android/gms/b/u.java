// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.b;

import android.content.Context;

final class u extends aj<v>
{
    public u(final Context context) {
        super(context, (aj.a)new a());
    }
    
    private static final class a implements aj.a<v>
    {
        private final v a;
        
        public a() {
            this.a = new v();
        }
        
        @Override
        public final void a(final String s, final int c) {
            if ("ga_sessionTimeout".equals(s)) {
                this.a.c = c;
            }
            else {
                n.d("int configuration name not recognized:  " + s);
            }
        }
        
        @Override
        public final void a(final String s, final String s2) {
            this.a.g.put(s, s2);
        }
        
        @Override
        public final void a(final String s, final boolean b) {
            final int n = 1;
            final int n2 = 1;
            int d = 1;
            if ("ga_autoActivityTracking".equals(s)) {
                final v a = this.a;
                if (!b) {
                    d = 0;
                }
                a.d = d;
            }
            else if ("ga_anonymizeIp".equals(s)) {
                final v a2 = this.a;
                int e;
                if (b) {
                    e = n;
                }
                else {
                    e = 0;
                }
                a2.e = e;
            }
            else if ("ga_reportUncaughtExceptions".equals(s)) {
                final v a3 = this.a;
                int f;
                if (b) {
                    f = n2;
                }
                else {
                    f = 0;
                }
                a3.f = f;
            }
            else {
                com.google.android.gms.b.n.d("bool configuration name not recognized:  " + s);
            }
        }
        
        @Override
        public final void b(final String str, final String str2) {
            if ("ga_trackingId".equals(str)) {
                this.a.a = str2;
            }
            else if ("ga_sampleFrequency".equals(str)) {
                try {
                    this.a.b = Double.parseDouble(str2);
                }
                catch (NumberFormatException ex) {
                    n.a("Error parsing ga_sampleFrequency value: " + str2);
                }
            }
            else {
                n.d("string configuration name not recognized:  " + str);
            }
        }
    }
}
