/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  org.json.JSONObject
 */
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

    public g(String string, String string2) {
        this.c = string;
        this.i = string2;
        string = new JSONObject(this.i);
        this.a = string.optString("productId");
        this.d = string.optString("type");
        this.b = string.optString("price");
        this.e = string.optLong("price_amount_micros");
        this.f = string.optString("price_currency_code");
        this.g = string.optString("title");
        this.h = string.optString("description");
    }

    public final String toString() {
        return "SkuDetails:" + this.i;
    }
}

