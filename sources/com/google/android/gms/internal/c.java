package com.google.android.gms.internal;

import android.content.Intent;
import android.net.Uri;

public final class c {
    private static final Uri a;
    private static final Uri b;

    static {
        Uri parse = Uri.parse("http://plus.google.com/");
        a = parse;
        b = parse.buildUpon().appendPath("circles").appendPath("find").build();
    }

    public static Intent a() {
        Intent intent = new Intent("com.google.android.clockwork.home.UPDATE_ANDROID_WEAR_ACTION");
        intent.setPackage("com.google.android.wearable.app");
        return intent;
    }

    public static Intent a(String str) {
        Uri fromParts = Uri.fromParts("package", str, (String) null);
        Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
        intent.setData(fromParts);
        return intent;
    }

    public static Intent b(String str) {
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setData(Uri.parse("market://details").buildUpon().appendQueryParameter("id", str).build());
        intent.setPackage("com.android.vending");
        intent.addFlags(524288);
        return intent;
    }
}
