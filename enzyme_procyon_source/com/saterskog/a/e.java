// 
// Decompiled by Procyon v0.5.36
// 

package com.saterskog.a;

import org.json.JSONObject;

public final class e
{
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
    
    public e(final String a, final String i, final String j) {
        this.a = a;
        this.i = i;
        final JSONObject jsonObject = new JSONObject(this.i);
        this.b = jsonObject.optString("orderId");
        this.c = jsonObject.optString("packageName");
        this.d = jsonObject.optString("productId");
        this.e = jsonObject.optLong("purchaseTime");
        this.f = jsonObject.optInt("purchaseState");
        this.g = jsonObject.optString("developerPayload");
        this.h = jsonObject.optString("token", jsonObject.optString("purchaseToken"));
        this.k = jsonObject.optBoolean("autoRenewing");
        this.j = j;
    }
    
    @Override
    public final String toString() {
        return "PurchaseInfo(type:" + this.a + "):" + this.i;
    }
}
