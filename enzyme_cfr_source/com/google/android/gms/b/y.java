/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  android.content.ComponentName
 *  android.content.Context
 *  android.content.Intent
 *  android.content.ServiceConnection
 *  android.os.IBinder
 *  android.os.RemoteException
 */
package com.google.android.gms.b;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.RemoteException;
import com.google.android.gms.b.n;
import com.google.android.gms.b.x;
import com.google.android.gms.internal.a;
import com.google.android.gms.internal.ha;
import java.util.List;
import java.util.Map;

final class y
implements x {
    ServiceConnection a;
    b b;
    c c;
    Context d;
    com.google.android.gms.internal.a e;

    public y(Context context, b b2, c c2) {
        this.d = context;
        if (b2 == null) {
            throw new IllegalArgumentException("onConnectedListener cannot be null");
        }
        this.b = b2;
        if (c2 == null) {
            throw new IllegalArgumentException("onConnectionFailedListener cannot be null");
        }
        this.c = c2;
    }

    /*
     * Enabled aggressive block sorting
     */
    private com.google.android.gms.internal.a d() {
        boolean bl = this.e != null;
        if (!bl) {
            throw new IllegalStateException("Not connected. Call connect() and wait for onConnected() to be called.");
        }
        return this.e;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public final void a() {
        try {
            this.d().a();
            return;
        }
        catch (RemoteException remoteException) {
            n.a("clear hits failed: " + (Object)((Object)remoteException));
            return;
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public final void a(Map<String, String> map, long l2, String string, List<ha> list) {
        try {
            this.d().a(map, l2, string, list);
            return;
        }
        catch (RemoteException remoteException) {
            n.a("sendHit failed: " + (Object)((Object)remoteException));
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public final void b() {
        Intent intent = new Intent("com.google.android.gms.analytics.service.START");
        intent.setComponent(new ComponentName("com.google.android.gms", "com.google.android.gms.analytics.service.AnalyticsService"));
        intent.putExtra("app_package_name", this.d.getPackageName());
        if (this.a != null) {
            n.a("Calling connect() while still connected, missing disconnect().");
            return;
        }
        this.a = new a();
        boolean bl = this.d.bindService(intent, this.a, 129);
        n.c("connect: bindService returned " + bl + " for " + (Object)intent);
        if (bl) return;
        this.a = null;
        this.c.a(1);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public final void c() {
        this.e = null;
        if (this.a != null) {
            try {
                this.d.unbindService(this.a);
            }
            catch (IllegalArgumentException illegalArgumentException) {
            }
            catch (IllegalStateException illegalStateException) {}
            this.a = null;
            this.b.e();
        }
    }

    final class a
    implements ServiceConnection {
        a() {
        }

        /*
         * Enabled aggressive block sorting
         * Enabled unnecessary exception pruning
         * Enabled aggressive exception aggregation
         */
        public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            n.c("service connected, binder: " + (Object)iBinder);
            try {
                if ("com.google.android.gms.analytics.internal.IAnalyticsService".equals(iBinder.getInterfaceDescriptor())) {
                    n.c("bound to service");
                    y.this.e = a.a.a(iBinder);
                    y.this.b.d();
                    return;
                }
            }
            catch (RemoteException remoteException) {
                // empty catch block
            }
            try {
                y.this.d.unbindService((ServiceConnection)this);
            }
            catch (IllegalArgumentException illegalArgumentException) {}
            y.this.a = null;
            y.this.c.a(2);
        }

        public final void onServiceDisconnected(ComponentName componentName) {
            n.c("service disconnected: " + (Object)componentName);
            y.this.a = null;
            y.this.b.e();
        }
    }

    public static interface b {
        public void d();

        public void e();
    }

    public static interface c {
        public void a(int var1);
    }
}

