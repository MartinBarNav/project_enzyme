// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.internal;

import android.content.Intent;
import android.net.Uri;

public final class c
{
    private static final Uri a;
    private static final Uri b;
    
    static {
        b = (a = Uri.parse("http://plus.google.com/")).buildUpon().appendPath("circles").appendPath("find").build();
    }
    
    public static Intent a() {
        final Intent intent = new Intent("com.google.android.clockwork.home.UPDATE_ANDROID_WEAR_ACTION");
        intent.setPackage("com.google.android.wearable.app");
        return intent;
    }
    
    public static Intent a(final String s) {
        final Uri fromParts = Uri.fromParts("package", s, (String)null);
        final Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
        intent.setData(fromParts);
        return intent;
    }
    
    public static Intent b(final String s) {
        final Intent intent = new Intent("android.intent.action.VIEW");
        intent.setData(Uri.parse("market://details").buildUpon().appendQueryParameter("id", s).build());
        intent.setPackage("com.android.vending");
        intent.addFlags(524288);
        return intent;
    }
}
