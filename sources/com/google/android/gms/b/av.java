package com.google.android.gms.b;

import android.content.Context;
import com.google.android.gms.b.aj;

final class av extends aj<j> {
    public av(Context context) {
        super(context, new a());
    }

    private static class a implements aj.a<j> {
        private final j a = new j();

        public final void a(String str, int i) {
            if ("ga_dispatchPeriod".equals(str)) {
                this.a.d = i;
            } else {
                n.d("int configuration name not recognized:  " + str);
            }
        }

        public final void a(String str, String str2) {
        }

        public final void a(String str, boolean z) {
            if ("ga_dryRun".equals(str)) {
                this.a.e = z ? 1 : 0;
                return;
            }
            n.d("bool configuration name not recognized:  " + str);
        }

        public final void b(String str, String str2) {
            if ("ga_appName".equals(str)) {
                this.a.a = str2;
            } else if ("ga_appVersion".equals(str)) {
                this.a.b = str2;
            } else if ("ga_logLevel".equals(str)) {
                this.a.c = str2;
            } else {
                n.d("string configuration name not recognized:  " + str);
            }
        }

        public final /* synthetic */ ai a() {
            return this.a;
        }
    }
}
