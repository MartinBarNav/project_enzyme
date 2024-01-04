/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  android.text.TextUtils
 */
package com.google.android.gms.b;

import android.text.TextUtils;
import java.util.HashMap;
import java.util.Map;

public final class o {
    final Map<String, Integer> a = new HashMap<String, Integer>();
    final Map<String, String> b = new HashMap<String, String>();
    final boolean c;
    final String d;

    public o(String string) {
        this.c = false;
        this.d = string;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final void a(String string, int n2) {
        Integer n3;
        if (!this.c) {
            return;
        }
        Integer n4 = n3 = this.a.get(string);
        if (n3 == null) {
            n4 = 0;
        }
        this.a.put(string, n4 + n2);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final void a(String string, String string2) {
        if (!this.c || TextUtils.isEmpty((CharSequence)string)) {
            return;
        }
        this.b.put(string, string2);
    }
}

