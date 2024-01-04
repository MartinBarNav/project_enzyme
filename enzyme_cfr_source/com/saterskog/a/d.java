/*
 * Decompiled with CFR 0.150.
 */
package com.saterskog.a;

import com.saterskog.a.e;
import com.saterskog.a.g;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public final class d {
    Map<String, g> a = new HashMap<String, g>();
    public Map<String, e> b = new HashMap<String, e>();

    d() {
    }

    public final g a(String string) {
        return this.a.get(string);
    }

    public final boolean b(String string) {
        return this.b.containsKey(string);
    }

    final List<String> c(String string) {
        ArrayList<String> arrayList = new ArrayList<String>();
        for (e e2 : this.b.values()) {
            if (!e2.a.equals(string)) continue;
            arrayList.add(e2.d);
        }
        return arrayList;
    }
}

