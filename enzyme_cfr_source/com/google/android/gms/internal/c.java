/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  android.content.Intent
 *  android.net.Uri
 */
package com.google.android.gms.internal;

import android.content.Intent;
import android.net.Uri;

public final class c {
    private static final Uri a;
    private static final Uri b;

    static {
        Uri uri;
        a = uri = Uri.parse((String)"http://plus.google.com/");
        b = uri.buildUpon().appendPath("circles").appendPath("find").build();
    }

    public static Intent a() {
        Intent intent = new Intent("com.google.android.clockwork.home.UPDATE_ANDROID_WEAR_ACTION");
        intent.setPackage("com.google.android.wearable.app");
        return intent;
    }

    public static Intent a(String string) {
        Uri uri = Uri.fromParts((String)"package", (String)string, null);
        string = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
        string.setData(uri);
        return string;
    }

    public static Intent b(String string) {
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setData(Uri.parse((String)"market://details").buildUpon().appendQueryParameter("id", string).build());
        intent.setPackage("com.android.vending");
        intent.addFlags(524288);
        return intent;
    }
}

