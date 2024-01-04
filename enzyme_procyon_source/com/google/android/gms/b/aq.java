// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.b;

import android.content.Intent;
import android.content.Context;
import android.content.BroadcastReceiver;

class aq extends BroadcastReceiver
{
    static final String a;
    private final s b;
    
    static {
        a = aq.class.getName();
    }
    
    aq(final s b) {
        this.b = b;
    }
    
    public void onReceive(final Context context, final Intent intent) {
        boolean b = false;
        final String action = intent.getAction();
        if ("android.net.conn.CONNECTIVITY_CHANGE".equals(action)) {
            final boolean booleanExtra = intent.getBooleanExtra("noConnectivity", false);
            final s b2 = this.b;
            if (!booleanExtra) {
                b = true;
            }
            b2.a(b);
        }
        else if ("com.google.analytics.RADIO_POWERED".equals(action) && !intent.hasExtra(aq.a)) {
            this.b.b();
        }
    }
}
