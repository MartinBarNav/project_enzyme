// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.common;

import android.content.ComponentName;
import java.util.concurrent.LinkedBlockingQueue;
import android.os.IBinder;
import java.util.concurrent.BlockingQueue;
import android.content.ServiceConnection;

public final class e implements ServiceConnection
{
    public boolean a;
    public final BlockingQueue<IBinder> b;
    
    public e() {
        this.a = false;
        this.b = new LinkedBlockingQueue<IBinder>();
    }
    
    public final void onServiceConnected(final ComponentName componentName, final IBinder binder) {
        this.b.add(binder);
    }
    
    public final void onServiceDisconnected(final ComponentName componentName) {
    }
}
