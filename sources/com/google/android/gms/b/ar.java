package com.google.android.gms.b;

import android.content.Context;
import android.content.IntentFilter;
import android.os.Handler;
import android.os.Message;
import com.google.android.gms.b.au;

final class ar extends s {
    /* access modifiers changed from: private */
    public static final Object a = new Object();
    private static ar p;
    private Context b;
    private z c;
    private volatile ab d;
    /* access modifiers changed from: private */
    public int e = 1800;
    private boolean f = true;
    private boolean g;
    private String h;
    /* access modifiers changed from: private */
    public boolean i = true;
    private boolean j = true;
    private aa k = new aa() {
        public final void a(boolean z) {
            ar.this.a(z, ar.this.i);
        }
    };
    /* access modifiers changed from: private */
    public Handler l;
    private aq m;
    /* access modifiers changed from: private */
    public boolean n = false;
    private boolean o = false;

    private ar() {
    }

    public static ar c() {
        if (p == null) {
            p = new ar();
        }
        return p;
    }

    /* access modifiers changed from: package-private */
    public final synchronized void a() {
        if (this.d == null) {
            n.c("Dispatch call queued. Dispatch will run once initialization is complete.");
            this.f = true;
        } else {
            au.a().a(au.a.DISPATCH);
            this.d.a();
        }
    }

    /* access modifiers changed from: package-private */
    public final synchronized void a(int i2) {
        if (this.l == null) {
            n.c("Dispatch period set with null handler. Dispatch will run once initialization is complete.");
            this.e = i2;
        } else {
            au.a().a(au.a.SET_DISPATCH_PERIOD);
            if (!this.n && this.i && this.e > 0) {
                this.l.removeMessages(1, a);
            }
            this.e = i2;
            if (i2 > 0 && !this.n && this.i) {
                this.l.sendMessageDelayed(this.l.obtainMessage(1, a), (long) (i2 * 1000));
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final synchronized void a(boolean z) {
        a(this.n, z);
    }

    /* access modifiers changed from: package-private */
    public final synchronized void a(boolean z, boolean z2) {
        if (!(this.n == z && this.i == z2)) {
            if (z || !z2) {
                if (this.e > 0) {
                    this.l.removeMessages(1, a);
                }
            }
            if (!z && z2 && this.e > 0) {
                this.l.sendMessageDelayed(this.l.obtainMessage(1, a), (long) (this.e * 1000));
            }
            n.c("PowerSaveMode " + ((z || !z2) ? "initiated." : "terminated."));
            this.n = z;
            this.i = z2;
        }
    }

    /* access modifiers changed from: package-private */
    public final synchronized void b() {
        if (!this.n && this.i && this.e > 0) {
            this.l.removeMessages(1, a);
            this.l.sendMessage(this.l.obtainMessage(1, a));
        }
    }

    /* access modifiers changed from: package-private */
    public final synchronized void a(Context context, ab abVar) {
        if (this.b == null) {
            this.b = context.getApplicationContext();
            if (this.d == null) {
                this.d = abVar;
                if (this.f) {
                    a();
                    this.f = false;
                }
                if (this.g) {
                    if (this.d == null) {
                        n.c("setForceLocalDispatch() queued. It will be called once initialization is complete.");
                        this.g = true;
                    } else {
                        au.a().a(au.a.SET_FORCE_LOCAL_DISPATCH);
                        this.d.b();
                    }
                    this.g = false;
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final synchronized z d() {
        if (this.c == null) {
            if (this.b == null) {
                throw new IllegalStateException("Cant get a store unless we have a context");
            }
            this.c = new p(this.k, this.b, new af());
            this.c.a(this.o);
            if (this.h != null) {
                this.c.c().a(this.h);
                this.h = null;
            }
        }
        if (this.l == null) {
            this.l = new Handler(this.b.getMainLooper(), new Handler.Callback() {
                public final boolean handleMessage(Message message) {
                    if (1 == message.what && ar.a.equals(message.obj)) {
                        au.a().a(true);
                        ar.this.a();
                        au.a().a(false);
                        if (ar.this.e > 0 && !ar.this.n) {
                            ar.this.l.sendMessageDelayed(ar.this.l.obtainMessage(1, ar.a), (long) (ar.this.e * 1000));
                        }
                    }
                    return true;
                }
            });
            if (this.e > 0) {
                this.l.sendMessageDelayed(this.l.obtainMessage(1, a), (long) (this.e * 1000));
            }
        }
        if (this.m == null && this.j) {
            this.m = new aq(this);
            aq aqVar = this.m;
            Context context = this.b;
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
            context.registerReceiver(aqVar, intentFilter);
            IntentFilter intentFilter2 = new IntentFilter();
            intentFilter2.addAction("com.google.analytics.RADIO_POWERED");
            intentFilter2.addCategory(context.getPackageName());
            context.registerReceiver(aqVar, intentFilter2);
        }
        return this.c;
    }
}
