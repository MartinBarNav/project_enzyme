// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.b.a;

import java.util.Iterator;
import java.util.HashMap;
import java.util.Map;

public final class a
{
    Map<String, String> a;
    
    public a() {
        this.a = new HashMap<String, String>();
    }
    
    public final Map<String, String> a(final String str) {
        final HashMap<String, Object> hashMap = new HashMap<String, Object>();
        for (final Map.Entry<String, String> entry : this.a.entrySet()) {
            hashMap.put(str + entry.getKey(), entry.getValue());
        }
        return (Map<String, String>)hashMap;
    }
}
