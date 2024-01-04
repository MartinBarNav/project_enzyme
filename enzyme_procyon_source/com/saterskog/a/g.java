// 
// Decompiled by Procyon v0.5.36
// 

package com.saterskog.a;

import org.json.JSONObject;

public final class g
{
    final String a;
    public final String b;
    private final String c;
    private final String d;
    private final long e;
    private final String f;
    private final String g;
    private final String h;
    private final String i;
    
    public g(final String c, final String i) {
        this.c = c;
        this.i = i;
        final JSONObject jsonObject = new JSONObject(this.i);
        this.a = jsonObject.optString("productId");
        this.d = jsonObject.optString("type");
        this.b = jsonObject.optString("price");
        this.e = jsonObject.optLong("price_amount_micros");
        this.f = jsonObject.optString("price_currency_code");
        this.g = jsonObject.optString("title");
        this.h = jsonObject.optString("description");
    }
    
    @Override
    public final String toString() {
        return "SkuDetails:" + this.i;
    }
}
