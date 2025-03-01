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

    public e(String str, String str2, String str3) {
        this.a = str;
        this.i = str2;
        JSONObject jSONObject = new JSONObject(this.i);
        this.b = jSONObject.optString("orderId");
        this.c = jSONObject.optString("packageName");
        this.d = jSONObject.optString("productId");
        this.e = jSONObject.optLong("purchaseTime");
        this.f = jSONObject.optInt("purchaseState");
        this.g = jSONObject.optString("developerPayload");
        this.h = jSONObject.optString("token", jSONObject.optString("purchaseToken"));
        this.k = jSONObject.optBoolean("autoRenewing");
        this.j = str3;
    }

    public final String toString() {
        return "PurchaseInfo(type:" + this.a + "):" + this.i;
    }
}
