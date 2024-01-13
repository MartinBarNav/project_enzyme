package com.google.android.gms.b;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

class aq extends BroadcastReceiver {
    static final String a = aq.class.getName();
    private final s b;

    aq(s sVar) {
        this.b = sVar;
    }

    public void onReceive(Context context, Intent intent) {
        boolean z = false;
        String action = intent.getAction();
        if ("android.net.conn.CONNECTIVITY_CHANGE".equals(action)) {
            boolean booleanExtra = intent.getBooleanExtra("noConnectivity", false);
            s sVar = this.b;
            if (!booleanExtra) {
                z = true;
            }
            sVar.a(z);
        } else if ("com.google.analytics.RADIO_POWERED".equals(action) && !intent.hasExtra(a)) {
            this.b.b();
        }
    }
}
