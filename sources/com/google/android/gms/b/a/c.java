package com.google.android.gms.b.a;

import java.util.HashMap;
import java.util.Map;

public final class c {
    Map<String, String> a = new HashMap();

    public final Map<String, String> a(String str) {
        HashMap hashMap = new HashMap();
        for (Map.Entry next : this.a.entrySet()) {
            hashMap.put(str + ((String) next.getKey()), next.getValue());
        }
        return hashMap;
    }
}
