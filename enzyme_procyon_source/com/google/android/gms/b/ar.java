// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.b;

import android.content.BroadcastReceiver;
import android.content.IntentFilter;
import android.os.Message;
import android.os.Handler$Callback;
import android.os.Handler;
import android.content.Context;

final class ar extends s
{
    private static final Object a;
    private static ar p;
    private Context b;
    private z c;
    private volatile ab d;
    private int e;
    private boolean f;
    private boolean g;
    private String h;
    private boolean i;
    private boolean j;
    private aa k;
    private Handler l;
    private aq m;
    private boolean n;
    private boolean o;
    
    static {
        a = new Object();
    }
    
    private ar() {
        this.e = 1800;
        this.f = true;
        this.i = true;
        this.j = true;
        this.k = new aa() {
            @Override
            public final void a(final boolean b) {
                ar.this.a(b, ar.this.i);
            }
        };
        this.n = false;
        this.o = false;
    }
    
    public static ar c() {
        if (ar.p == null) {
            ar.p = new ar();
        }
        return ar.p;
    }
    
    @Override
    final void a() {
        synchronized (this) {
            if (this.d == null) {
                com.google.android.gms.b.n.c("Dispatch call queued. Dispatch will run once initialization is complete.");
                this.f = true;
            }
            else {
                au.a().a(au.a.S);
                this.d.a();
            }
        }
    }
    
    @Override
    final void a(final int n) {
        synchronized (this) {
            if (this.l == null) {
                n.c("Dispatch period set with null handler. Dispatch will run once initialization is complete.");
                this.e = n;
            }
            else {
                au.a().a(au.a.T);
                if (!this.n && this.i && this.e > 0) {
                    this.l.removeMessages(1, ar.a);
                }
                if ((this.e = n) > 0 && !this.n && this.i) {
                    this.l.sendMessageDelayed(this.l.obtainMessage(1, ar.a), (long)(n * 1000));
                }
            }
        }
    }
    
    final void a(final Context context, final ab d) {
        while (true) {
            while (true) {
                Label_0087: {
                    synchronized (this) {
                        if (this.b == null) {
                            this.b = context.getApplicationContext();
                            if (this.d == null) {
                                this.d = d;
                                if (this.f) {
                                    this.a();
                                    this.f = false;
                                }
                                if (this.g) {
                                    if (this.d != null) {
                                        break Label_0087;
                                    }
                                    com.google.android.gms.b.n.c("setForceLocalDispatch() queued. It will be called once initialization is complete.");
                                    this.g = true;
                                    this.g = false;
                                }
                            }
                        }
                        return;
                    }
                }
                au.a().a(au.a.af);
                this.d.b();
                continue;
            }
        }
    }
    
    @Override
    final void a(final boolean b) {
        synchronized (this) {
            this.a(this.n, b);
        }
    }
    
    final void a(final boolean n, final boolean i) {
        while (true) {
            while (true) {
                Label_0149: {
                    synchronized (this) {
                        if (this.n != n || this.i != i) {
                            if ((n || !i) && this.e > 0) {
                                this.l.removeMessages(1, ar.a);
                            }
                            if (!n && i && this.e > 0) {
                                this.l.sendMessageDelayed(this.l.obtainMessage(1, ar.a), (long)(this.e * 1000));
                            }
                            final StringBuilder sb = new StringBuilder("PowerSaveMode ");
                            if (!n && i) {
                                break Label_0149;
                            }
                            final String str = "initiated.";
                            n.c(sb.append(str).toString());
                            this.n = n;
                            this.i = i;
                        }
                        return;
                    }
                }
                final String str = "terminated.";
                continue;
            }
        }
    }
    
    @Override
    final void b() {
        synchronized (this) {
            if (!this.n && this.i && this.e > 0) {
                this.l.removeMessages(1, ar.a);
                this.l.sendMessage(this.l.obtainMessage(1, ar.a));
            }
        }
    }
    
    final z d() {
        Label_0113: {
            synchronized (this) {
                if (this.c != null) {
                    break Label_0113;
                }
                if (this.b == null) {
                    throw new IllegalStateException("Cant get a store unless we have a context");
                }
            }
            (this.c = new p(this.k, this.b, new af())).a(this.o);
            if (this.h != null) {
                this.c.c().a(this.h);
                this.h = null;
            }
        }
        if (this.l == null) {
            this.l = new Handler(this.b.getMainLooper(), (Handler$Callback)new Handler$Callback() {
                public final boolean handleMessage(final Message message) {
                    if (1 == message.what && ar.a.equals(message.obj)) {
                        au.a().a(true);
                        ar.this.a();
                        au.a().a(false);
                        if (ar.this.e > 0 && !ar.this.n) {
                            ar.this.l.sendMessageDelayed(ar.this.l.obtainMessage(1, ar.a), (long)(ar.this.e * 1000));
                        }
                    }
                    return true;
                }
            });
            if (this.e > 0) {
                this.l.sendMessageDelayed(this.l.obtainMessage(1, ar.a), (long)(this.e * 1000));
            }
        }
        if (this.m == null && this.j) {
            this.m = new aq(this);
            final aq m = this.m;
            final Context b = this.b;
            final IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
            b.registerReceiver((BroadcastReceiver)m, intentFilter);
            final IntentFilter intentFilter2 = new IntentFilter();
            intentFilter2.addAction("com.google.analytics.RADIO_POWERED");
            intentFilter2.addCategory(b.getPackageName());
            b.registerReceiver((BroadcastReceiver)m, intentFilter2);
        }
        // monitorexit(this)
        return this.c;
    }
}
