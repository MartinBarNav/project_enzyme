// 
// Decompiled by Procyon v0.5.36
// 

package com.saterskog.a;

import java.util.Iterator;
import java.util.ArrayList;
import java.util.List;
import java.util.HashMap;
import java.util.Map;

public final class d
{
    Map<String, g> a;
    public Map<String, e> b;
    
    d() {
        this.a = new HashMap<String, g>();
        this.b = new HashMap<String, e>();
    }
    
    public final g a(final String s) {
        return this.a.get(s);
    }
    
    public final boolean b(final String s) {
        return this.b.containsKey(s);
    }
    
    final List<String> c(final String anObject) {
        final ArrayList<String> list = new ArrayList<String>();
        for (final e e : this.b.values()) {
            if (e.a.equals(anObject)) {
                list.add(e.d);
            }
        }
        return list;
    }
}
