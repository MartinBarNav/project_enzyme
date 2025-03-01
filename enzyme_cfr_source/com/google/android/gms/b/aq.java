/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  android.content.BroadcastReceiver
 *  android.content.Context
 *  android.content.Intent
 */
package com.google.android.gms.b;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.google.android.gms.b.s;

class aq
extends BroadcastReceiver {
    static final String a = aq.class.getName();
    private final s b;

    aq(s s2) {
        this.b = s2;
    }

    /*
     * Enabled aggressive block sorting
     */
    public void onReceive(Context object, Intent intent) {
        boolean bl = false;
        object = intent.getAction();
        if (!"android.net.conn.CONNECTIVITY_CHANGE".equals(object)) {
            if (!"com.google.analytics.RADIO_POWERED".equals(object)) return;
            if (intent.hasExtra(a)) return;
            this.b.b();
            return;
        }
        boolean bl2 = intent.getBooleanExtra("noConnectivity", false);
        object = this.b;
        if (!bl2) {
            bl = true;
        }
        ((s)object).a(bl);
    }
}

