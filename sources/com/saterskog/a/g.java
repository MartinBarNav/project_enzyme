package com.saterskog.a;

import org.json.JSONObject;

public final class g {
    final String a;
    public final String b;
    private final String c;
    private final String d;
    private final long e;
    private final String f;
    private final String g;
    private final String h;
    private final String i;

    public g(String str, String str2) {
        this.c = str;
        this.i = str2;
        JSONObject jSONObject = new JSONObject(this.i);
        this.a = jSONObject.optString("productId");
        this.d = jSONObject.optString("type");
        this.b = jSONObject.optString("price");
        this.e = jSONObject.optLong("price_amount_micros");
        this.f = jSONObject.optString("price_currency_code");
        this.g = jSONObject.optString("title");
        this.h = jSONObject.optString("description");
    }

    public final String toString() {
        return "SkuDetails:" + this.i;
    }
}
