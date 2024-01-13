package com.saterskog.a;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public final class d {
    Map<String, g> a = new HashMap();
    public Map<String, e> b = new HashMap();

    d() {
    }

    public final g a(String str) {
        return this.a.get(str);
    }

    public final boolean b(String str) {
        return this.b.containsKey(str);
    }

    /* access modifiers changed from: package-private */
    public final List<String> c(String str) {
        ArrayList arrayList = new ArrayList();
        for (e next : this.b.values()) {
            if (next.a.equals(str)) {
                arrayList.add(next.d);
            }
        }
        return arrayList;
    }
}
