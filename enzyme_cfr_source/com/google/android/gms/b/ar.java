/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  android.content.BroadcastReceiver
 *  android.content.Context
 *  android.content.IntentFilter
 *  android.os.Handler
 *  android.os.Handler$Callback
 *  android.os.Looper
 *  android.os.Message
 */
package com.google.android.gms.b;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.google.android.gms.b.aa;
import com.google.android.gms.b.ab;
import com.google.android.gms.b.af;
import com.google.android.gms.b.ak;
import com.google.android.gms.b.aq;
import com.google.android.gms.b.au;
import com.google.android.gms.b.n;
import com.google.android.gms.b.p;
import com.google.android.gms.b.s;
import com.google.android.gms.b.z;

final class ar
extends s {
    private static final Object a = new Object();
    private static ar p;
    private Context b;
    private z c;
    private volatile ab d;
    private int e = 1800;
    private boolean f = true;
    private boolean g;
    private String h;
    private boolean i = true;
    private boolean j = true;
    private aa k = new aa(){

        @Override
        public final void a(boolean bl) {
            ar.this.a(bl, ar.this.i);
        }
    };
    private Handler l;
    private aq m;
    private boolean n = false;
    private boolean o = false;

    private ar() {
    }

    public static ar c() {
        if (p == null) {
            p = new ar();
        }
        return p;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    final void a() {
        synchronized (this) {
            if (this.d == null) {
                com.google.android.gms.b.n.c("Dispatch call queued. Dispatch will run once initialization is complete.");
                this.f = true;
            } else {
                au.a().a(au.a.S);
                this.d.a();
            }
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    final void a(int n2) {
        synchronized (this) {
            if (this.l == null) {
                com.google.android.gms.b.n.c("Dispatch period set with null handler. Dispatch will run once initialization is complete.");
                this.e = n2;
            } else {
                au.a().a(au.a.T);
                if (!this.n && this.i && this.e > 0) {
                    this.l.removeMessages(1, a);
                }
                this.e = n2;
                if (n2 > 0 && !this.n && this.i) {
                    this.l.sendMessageDelayed(this.l.obtainMessage(1, a), (long)(n2 * 1000));
                }
            }
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    final void a(Context context, ab ab2) {
        synchronized (this) {
            Context context2 = this.b;
            if (context2 == null) {
                this.b = context.getApplicationContext();
                if (this.d == null) {
                    this.d = ab2;
                    if (this.f) {
                        this.a();
                        this.f = false;
                    }
                    if (this.g) {
                        if (this.d == null) {
                            com.google.android.gms.b.n.c("setForceLocalDispatch() queued. It will be called once initialization is complete.");
                            this.g = true;
                        } else {
                            au.a().a(au.a.af);
                            this.d.b();
                        }
                        this.g = false;
                    }
                }
            }
            return;
        }
    }

    @Override
    final void a(boolean bl) {
        synchronized (this) {
            this.a(this.n, bl);
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    final void a(boolean bl, boolean bl2) {
        synchronized (this) {
            boolean bl3;
            if (this.n != bl || (bl3 = this.i) != bl2) {
                if ((bl || !bl2) && this.e > 0) {
                    this.l.removeMessages(1, a);
                }
                if (!bl && bl2 && this.e > 0) {
                    this.l.sendMessageDelayed(this.l.obtainMessage(1, a), (long)(this.e * 1000));
                }
                StringBuilder stringBuilder = new StringBuilder("PowerSaveMode ");
                String string = bl || !bl2 ? "initiated." : "terminated.";
                com.google.android.gms.b.n.c(stringBuilder.append(string).toString());
                this.n = bl;
                this.i = bl2;
            }
            return;
        }
    }

    @Override
    final void b() {
        synchronized (this) {
            if (!this.n && this.i && this.e > 0) {
                this.l.removeMessages(1, a);
                this.l.sendMessage(this.l.obtainMessage(1, a));
            }
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    final z d() {
        synchronized (this) {
            Object object;
            Object object2;
            Looper looper;
            if (this.c == null) {
                if (this.b == null) {
                    IllegalStateException illegalStateException = new IllegalStateException("Cant get a store unless we have a context");
                    throw illegalStateException;
                }
                aa aa2 = this.k;
                looper = this.b;
                object2 = new af();
                object = new p(aa2, (Context)looper, (ak)object2);
                this.c = object;
                this.c.a(this.o);
                if (this.h != null) {
                    this.c.c().a(this.h);
                    this.h = null;
                }
            }
            if (this.l == null) {
                looper = this.b.getMainLooper();
                object2 = new Handler.Callback(){

                    public final boolean handleMessage(Message message) {
                        if (1 == message.what && a.equals(message.obj)) {
                            au.a().a(true);
                            ar.this.a();
                            au.a().a(false);
                            if (ar.this.e > 0 && !ar.this.n) {
                                ar.this.l.sendMessageDelayed(ar.this.l.obtainMessage(1, a), (long)(ar.this.e * 1000));
                            }
                        }
                        return true;
                    }
                };
                object = new Handler(looper, (Handler.Callback)object2);
                this.l = object;
                if (this.e > 0) {
                    this.l.sendMessageDelayed(this.l.obtainMessage(1, a), (long)(this.e * 1000));
                }
            }
            if (this.m != null) return this.c;
            if (!this.j) return this.c;
            object = new aq(this);
            this.m = object;
            object2 = this.m;
            object = this.b;
            looper = new IntentFilter();
            looper.addAction("android.net.conn.CONNECTIVITY_CHANGE");
            object.registerReceiver((BroadcastReceiver)object2, (IntentFilter)looper);
            looper = new IntentFilter();
            looper.addAction("com.google.analytics.RADIO_POWERED");
            looper.addCategory(object.getPackageName());
            object.registerReceiver((BroadcastReceiver)object2, (IntentFilter)looper);
            return this.c;
        }
    }
}

