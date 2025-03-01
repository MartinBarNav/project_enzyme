/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  org.json.JSONObject
 */
package com.saterskog.a;

import org.json.JSONObject;

public final class e {
    String a;
    String b;
    String c;
    public String d;
    long e;
    int f;
    public String g;
    String h;
    String i;
    String j;
    boolean k;

    public e(String string, String string2, String string3) {
        this.a = string;
        this.i = string2;
        string = new JSONObject(this.i);
        this.b = string.optString("orderId");
        this.c = string.optString("packageName");
        this.d = string.optString("productId");
        this.e = string.optLong("purchaseTime");
        this.f = string.optInt("purchaseState");
        this.g = string.optString("developerPayload");
        this.h = string.optString("token", string.optString("purchaseToken"));
        this.k = string.optBoolean("autoRenewing");
        this.j = string3;
    }

    public final String toString() {
        return "PurchaseInfo(type:" + this.a + "):" + this.i;
    }
}

