package com.google.android.gms.b;

import android.text.TextUtils;
import java.util.HashMap;
import java.util.Map;

public final class o {
    final Map<String, Integer> a = new HashMap();
    final Map<String, String> b = new HashMap();
    final boolean c = false;
    final String d;

    public o(String str) {
        this.d = str;
    }

    public final void a(String str, int i) {
        if (this.c) {
            Integer num = this.a.get(str);
            if (num == null) {
                num = 0;
            }
            this.a.put(str, Integer.valueOf(num.intValue() + i));
        }
    }

    public final void a(String str, String str2) {
        if (this.c && !TextUtils.isEmpty(str)) {
            this.b.put(str, str2);
        }
    }
}
