package com.google.android.gms.common;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public final class e implements ServiceConnection {
    public boolean a = false;
    public final BlockingQueue<IBinder> b = new LinkedBlockingQueue();

    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        this.b.add(iBinder);
    }

    public final void onServiceDisconnected(ComponentName componentName) {
    }
}
