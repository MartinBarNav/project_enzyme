// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.b;

import android.os.IBinder;
import android.content.ComponentName;
import android.content.Intent;
import com.google.android.gms.internal.ha;
import java.util.List;
import java.util.Map;
import android.os.RemoteException;
import com.google.android.gms.internal.a;
import android.content.Context;
import android.content.ServiceConnection;

final class y implements x
{
    ServiceConnection a;
    b b;
    c c;
    Context d;
    com.google.android.gms.internal.a e;
    
    public y(final Context d, final b b, final c c) {
        this.d = d;
        if (b == null) {
            throw new IllegalArgumentException("onConnectedListener cannot be null");
        }
        this.b = b;
        if (c == null) {
            throw new IllegalArgumentException("onConnectionFailedListener cannot be null");
        }
        this.c = c;
    }
    
    private com.google.android.gms.internal.a d() {
        int n;
        if (this.e != null) {
            n = 1;
        }
        else {
            n = 0;
        }
        if (n == 0) {
            throw new IllegalStateException("Not connected. Call connect() and wait for onConnected() to be called.");
        }
        return this.e;
    }
    
    @Override
    public final void a() {
        try {
            this.d().a();
        }
        catch (RemoteException obj) {
            n.a("clear hits failed: " + obj);
        }
    }
    
    @Override
    public final void a(final Map<String, String> map, final long n, final String s, final List<ha> list) {
        try {
            this.d().a(map, n, s, list);
        }
        catch (RemoteException obj) {
            n.a("sendHit failed: " + obj);
        }
    }
    
    @Override
    public final void b() {
        final Intent obj = new Intent("com.google.android.gms.analytics.service.START");
        obj.setComponent(new ComponentName("com.google.android.gms", "com.google.android.gms.analytics.service.AnalyticsService"));
        obj.putExtra("app_package_name", this.d.getPackageName());
        if (this.a != null) {
            n.a("Calling connect() while still connected, missing disconnect().");
        }
        else {
            this.a = (ServiceConnection)new a();
            final boolean bindService = this.d.bindService(obj, this.a, 129);
            n.c("connect: bindService returned " + bindService + " for " + obj);
            if (!bindService) {
                this.a = null;
                this.c.a(1);
            }
        }
    }
    
    @Override
    public final void c() {
        this.e = null;
        if (this.a == null) {
            return;
        }
        while (true) {
            try {
                this.d.unbindService(this.a);
                this.a = null;
                this.b.e();
            }
            catch (IllegalArgumentException ex) {
                continue;
            }
            catch (IllegalStateException ex2) {
                continue;
            }
            break;
        }
    }
    
    final class a implements ServiceConnection
    {
        public final void onServiceConnected(final ComponentName componentName, final IBinder obj) {
            while (true) {
                n.c("service connected, binder: " + obj);
                try {
                    if ("com.google.android.gms.analytics.internal.IAnalyticsService".equals(obj.getInterfaceDescriptor())) {
                        n.c("bound to service");
                        y.this.e = com.google.android.gms.internal.a.a.a(obj);
                        y.this.b.d();
                        return;
                    }
                }
                catch (RemoteException ex) {}
                while (true) {
                    try {
                        y.this.d.unbindService((ServiceConnection)this);
                        y.this.a = null;
                        y.this.c.a(2);
                    }
                    catch (IllegalArgumentException ex2) {
                        continue;
                    }
                    break;
                }
            }
        }
        
        public final void onServiceDisconnected(final ComponentName obj) {
            n.c("service disconnected: " + obj);
            y.this.a = null;
            y.this.b.e();
        }
    }
    
    public interface b
    {
        void d();
        
        void e();
    }
    
    public interface c
    {
        void a(final int p0);
    }
}
