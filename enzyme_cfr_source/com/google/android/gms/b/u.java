/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
package com.google.android.gms.b;

import android.content.Context;
import com.google.android.gms.b.ai;
import com.google.android.gms.b.aj;
import com.google.android.gms.b.n;
import com.google.android.gms.b.v;

final class u
extends aj<v> {
    public u(Context context) {
        super(context, new a());
    }

    private static final class a
    implements aj.a<v> {
        private final v a = new v();

        @Override
        public final /* synthetic */ ai a() {
            return this.a;
        }

        /*
         * Enabled force condition propagation
         * Lifted jumps to return sites
         */
        @Override
        public final void a(String string, int n2) {
            if ("ga_sessionTimeout".equals(string)) {
                this.a.c = n2;
                return;
            }
            n.d("int configuration name not recognized:  " + string);
        }

        @Override
        public final void a(String string, String string2) {
            this.a.g.put(string, string2);
        }

        /*
         * Enabled aggressive block sorting
         */
        @Override
        public final void a(String object, boolean bl) {
            int n2 = 1;
            int n3 = 1;
            int n4 = 1;
            if ("ga_autoActivityTracking".equals(object)) {
                object = this.a;
                if (!bl) {
                    n4 = 0;
                }
                ((v)object).d = n4;
                return;
            }
            if ("ga_anonymizeIp".equals(object)) {
                object = this.a;
                n4 = bl ? n2 : 0;
                ((v)object).e = n4;
                return;
            }
            if (!"ga_reportUncaughtExceptions".equals(object)) {
                n.d("bool configuration name not recognized:  " + (String)object);
                return;
            }
            object = this.a;
            n4 = bl ? n3 : 0;
            ((v)object).f = n4;
        }

        /*
         * Enabled force condition propagation
         * Lifted jumps to return sites
         */
        @Override
        public final void b(String string, String string2) {
            if ("ga_trackingId".equals(string)) {
                this.a.a = string2;
                return;
            }
            if ("ga_sampleFrequency".equals(string)) {
                try {
                    this.a.b = Double.parseDouble(string2);
                    return;
                }
                catch (NumberFormatException numberFormatException) {
                    n.a("Error parsing ga_sampleFrequency value: " + string2);
                }
                return;
            }
            n.d("string configuration name not recognized:  " + string);
        }
    }
}

