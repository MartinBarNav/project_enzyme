package com.google.android.gms.b;

import android.content.Context;
import com.google.android.gms.b.aj;

final class u extends aj<v> {
    public u(Context context) {
        super(context, new a());
    }

    private static class a implements aj.a<v> {
        private final v a = new v();

        public final void a(String str, int i) {
            if ("ga_sessionTimeout".equals(str)) {
                this.a.c = i;
            } else {
                n.d("int configuration name not recognized:  " + str);
            }
        }

        public final void a(String str, String str2) {
            this.a.g.put(str, str2);
        }

        public final void a(String str, boolean z) {
            int i = 1;
            if ("ga_autoActivityTracking".equals(str)) {
                v vVar = this.a;
                if (!z) {
                    i = 0;
                }
                vVar.d = i;
            } else if ("ga_anonymizeIp".equals(str)) {
                v vVar2 = this.a;
                if (!z) {
                    i = 0;
                }
                vVar2.e = i;
            } else if ("ga_reportUncaughtExceptions".equals(str)) {
                v vVar3 = this.a;
                if (!z) {
                    i = 0;
                }
                vVar3.f = i;
            } else {
                n.d("bool configuration name not recognized:  " + str);
            }
        }

        public final void b(String str, String str2) {
            if ("ga_trackingId".equals(str)) {
                this.a.a = str2;
            } else if ("ga_sampleFrequency".equals(str)) {
                try {
                    this.a.b = Double.parseDouble(str2);
                } catch (NumberFormatException e) {
                    n.a("Error parsing ga_sampleFrequency value: " + str2);
                }
            } else {
                n.d("string configuration name not recognized:  " + str);
            }
        }

        public final /* synthetic */ ai a() {
            return this.a;
        }
    }
}
