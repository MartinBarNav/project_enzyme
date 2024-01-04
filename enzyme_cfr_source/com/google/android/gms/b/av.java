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
import com.google.android.gms.b.j;
import com.google.android.gms.b.n;

final class av
extends aj<j> {
    public av(Context context) {
        super(context, new a());
    }

    private static final class a
    implements aj.a<j> {
        private final j a = new j();

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
            if ("ga_dispatchPeriod".equals(string)) {
                this.a.d = n2;
                return;
            }
            n.d("int configuration name not recognized:  " + string);
        }

        @Override
        public final void a(String string, String string2) {
        }

        /*
         * Enabled aggressive block sorting
         */
        @Override
        public final void a(String object, boolean bl) {
            if (!"ga_dryRun".equals(object)) {
                n.d("bool configuration name not recognized:  " + (String)object);
                return;
            }
            object = this.a;
            int n2 = bl ? 1 : 0;
            ((j)object).e = n2;
        }

        /*
         * Enabled force condition propagation
         * Lifted jumps to return sites
         */
        @Override
        public final void b(String string, String string2) {
            if ("ga_appName".equals(string)) {
                this.a.a = string2;
                return;
            }
            if ("ga_appVersion".equals(string)) {
                this.a.b = string2;
                return;
            }
            if ("ga_logLevel".equals(string)) {
                this.a.c = string2;
                return;
            }
            n.d("string configuration name not recognized:  " + string);
        }
    }
}

