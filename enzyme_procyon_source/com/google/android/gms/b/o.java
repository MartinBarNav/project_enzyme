// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.b;

import android.text.TextUtils;
import java.util.HashMap;
import java.util.Map;

public final class o
{
    final Map<String, Integer> a;
    final Map<String, String> b;
    final boolean c;
    final String d;
    
    public o(final String d) {
        this.a = new HashMap<String, Integer>();
        this.b = new HashMap<String, String>();
        this.c = false;
        this.d = d;
    }
    
    public final void a(final String s, final int n) {
        if (this.c) {
            Integer value;
            if ((value = this.a.get(s)) == null) {
                value = 0;
            }
            this.a.put(s, value + n);
        }
    }
    
    public final void a(final String s, final String s2) {
        if (this.c && !TextUtils.isEmpty((CharSequence)s)) {
            this.b.put(s, s2);
        }
    }
}
