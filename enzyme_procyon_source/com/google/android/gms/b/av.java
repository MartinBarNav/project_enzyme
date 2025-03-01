// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.b;

import android.content.Context;

final class av extends aj<j>
{
    public av(final Context context) {
        super(context, (aj.a)new a());
    }
    
    private static final class a implements aj.a<j>
    {
        private final j a;
        
        public a() {
            this.a = new j();
        }
        
        @Override
        public final void a(final String s, final int d) {
            if ("ga_dispatchPeriod".equals(s)) {
                this.a.d = d;
            }
            else {
                n.d("int configuration name not recognized:  " + s);
            }
        }
        
        @Override
        public final void a(final String s, final String s2) {
        }
        
        @Override
        public final void a(final String s, final boolean b) {
            if ("ga_dryRun".equals(s)) {
                final j a = this.a;
                int e;
                if (b) {
                    e = 1;
                }
                else {
                    e = 0;
                }
                a.e = e;
            }
            else {
                n.d("bool configuration name not recognized:  " + s);
            }
        }
        
        @Override
        public final void b(final String s, final String c) {
            if ("ga_appName".equals(s)) {
                this.a.a = c;
            }
            else if ("ga_appVersion".equals(s)) {
                this.a.b = c;
            }
            else if ("ga_logLevel".equals(s)) {
                this.a.c = c;
            }
            else {
                n.d("string configuration name not recognized:  " + s);
            }
        }
    }
}
