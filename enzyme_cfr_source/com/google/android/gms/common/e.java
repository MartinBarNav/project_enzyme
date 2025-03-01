/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  android.content.ComponentName
 *  android.content.ServiceConnection
 *  android.os.IBinder
 */
package com.google.android.gms.common;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public final class e
implements ServiceConnection {
    public boolean a = false;
    public final BlockingQueue<IBinder> b = new LinkedBlockingQueue<IBinder>();

    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        this.b.add(iBinder);
    }

    public final void onServiceDisconnected(ComponentName componentName) {
    }
}

