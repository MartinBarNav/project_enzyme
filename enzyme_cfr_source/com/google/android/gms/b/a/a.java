/*
 * Decompiled with CFR 0.150.
 */
package com.google.android.gms.b.a;

import java.util.HashMap;
import java.util.Map;

public final class a {
    Map<String, String> a = new HashMap<String, String>();

    public final Map<String, String> a(String string) {
        HashMap<String, String> hashMap = new HashMap<String, String>();
        for (Map.Entry<String, String> entry : this.a.entrySet()) {
            hashMap.put(string + entry.getKey(), entry.getValue());
        }
        return hashMap;
    }
}

