package com.google.android.gms.b;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.RemoteException;
import com.google.android.gms.internal.a;
import com.google.android.gms.internal.ha;
import java.util.List;
import java.util.Map;

final class y implements x {
    ServiceConnection a;
    b b;
    c c;
    Context d;
    com.google.android.gms.internal.a e;

    public interface b {
        void d();

        void e();
    }

    public interface c {
        void a(int i);
    }

    public y(Context context, b bVar, c cVar) {
        this.d = context;
        if (bVar == null) {
            throw new IllegalArgumentException("onConnectedListener cannot be null");
        }
        this.b = bVar;
        if (cVar == null) {
            throw new IllegalArgumentException("onConnectionFailedListener cannot be null");
        }
        this.c = cVar;
    }

    public final void a() {
        try {
            d().a();
        } catch (RemoteException e2) {
            n.a("clear hits failed: " + e2);
        }
    }

    public final void a(Map<String, String> map, long j, String str, List<ha> list) {
        try {
            d().a(map, j, str, list);
        } catch (RemoteException e2) {
            n.a("sendHit failed: " + e2);
        }
    }

    public final void b() {
        Intent intent = new Intent("com.google.android.gms.analytics.service.START");
        intent.setComponent(new ComponentName("com.google.android.gms", "com.google.android.gms.analytics.service.AnalyticsService"));
        intent.putExtra("app_package_name", this.d.getPackageName());
        if (this.a != null) {
            n.a("Calling connect() while still connected, missing disconnect().");
            return;
        }
        this.a = new a();
        boolean bindService = this.d.bindService(intent, this.a, 129);
        n.c("connect: bindService returned " + bindService + " for " + intent);
        if (!bindService) {
            this.a = null;
            this.c.a(1);
        }
    }

    public final void c() {
        this.e = null;
        if (this.a != null) {
            try {
                this.d.unbindService(this.a);
            } catch (IllegalArgumentException | IllegalStateException e2) {
            }
            this.a = null;
            this.b.e();
        }
    }

    final class a implements ServiceConnection {
        a() {
        }

        public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            n.c("service connected, binder: " + iBinder);
            try {
                if ("com.google.android.gms.analytics.internal.IAnalyticsService".equals(iBinder.getInterfaceDescriptor())) {
                    n.c("bound to service");
                    y.this.e = a.C0023a.a(iBinder);
                    y.this.b.d();
                    return;
                }
            } catch (RemoteException e) {
            }
            try {
                y.this.d.unbindService(this);
            } catch (IllegalArgumentException e2) {
            }
            y.this.a = null;
            y.this.c.a(2);
        }

        public final void onServiceDisconnected(ComponentName componentName) {
            n.c("service disconnected: " + componentName);
            y.this.a = null;
            y.this.b.e();
        }
    }

    private com.google.android.gms.internal.a d() {
        boolean z;
        if (this.e != null) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return this.e;
        }
        throw new IllegalStateException("Not connected. Call connect() and wait for onConnected() to be called.");
    }
}
