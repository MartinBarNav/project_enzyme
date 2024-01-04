/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.Intent
 *  android.content.ServiceConnection
 *  android.content.pm.PackageManager$NameNotFoundException
 *  android.os.Looper
 *  android.os.RemoteException
 *  android.util.Log
 */
package com.google.android.gms.a.a;

import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.PackageManager;
import android.os.Looper;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.c;
import com.google.android.gms.common.e;
import com.google.android.gms.internal.d;
import com.google.android.gms.internal.h;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

public final class a {
    e a;
    h b;
    boolean c;
    Object d = new Object();
    b e;
    final long f;
    private final Context g;

    private a(Context context) {
        com.google.android.gms.internal.d.a(context);
        this.g = context;
        this.c = false;
        this.f = -1L;
    }

    public static a a(Context object) {
        object = new a((Context)object);
        try {
            super.b();
            a a2 = super.c();
            return a2;
        }
        finally {
            ((a)object).a();
        }
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static h a(e object) {
        try {
            if (Looper.myLooper() == Looper.getMainLooper()) {
                object = new IllegalStateException("BlockingServiceConnection.getService() called on main thread");
                throw object;
            }
        }
        catch (InterruptedException interruptedException) {
            throw new IOException("Interrupted exception");
        }
        {
            if (((e)object).a) {
                object = new IllegalStateException();
                throw object;
            }
            ((e)object).a = true;
            return h.a.a(((e)object).b.take());
        }
    }

    private static e b(Context context) {
        e e2;
        try {
            context.getPackageManager().getPackageInfo("com.android.vending", 0);
        }
        catch (PackageManager.NameNotFoundException nameNotFoundException) {
            throw new com.google.android.gms.common.a(9);
        }
        try {
            com.google.android.gms.common.c.a(context);
            e2 = new e();
        }
        catch (com.google.android.gms.common.a a2) {
            throw new IOException(a2);
        }
        Intent intent = new Intent("com.google.android.gms.ads.identifier.service.START");
        intent.setPackage("com.google.android.gms");
        if (context.bindService(intent, (ServiceConnection)e2, 1)) {
            return e2;
        }
        throw new IOException("Connection failure");
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private void b() {
        com.google.android.gms.internal.d.a("Calling this from your main thread can lead to deadlock");
        synchronized (this) {
            if (this.c) {
                this.a();
            }
            this.a = com.google.android.gms.a.a.a.b(this.g);
            this.b = com.google.android.gms.a.a.a.a(this.a);
            this.c = true;
            return;
        }
    }

    /*
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    private a c() {
        a a2;
        block21: {
            Object object;
            block20: {
                com.google.android.gms.internal.d.a("Calling this from your main thread can lead to deadlock");
                // MONITORENTER : this
                if (!this.c) {
                    object = this.d;
                    // MONITORENTER : object
                    if (this.e == null || !this.e.b) {
                        IOException iOException = new IOException("AdvertisingIdClient is not connected.");
                        throw iOException;
                    }
                    // MONITOREXIT : object
                    try {
                        this.b();
                        if (this.c) break block20;
                        object = new IOException("AdvertisingIdClient cannot reconnect.");
                    }
                    catch (Exception exception) {
                        object = new IOException("AdvertisingIdClient cannot reconnect.", exception);
                        throw object;
                    }
                    throw object;
                }
            }
            com.google.android.gms.internal.d.a(this.a);
            com.google.android.gms.internal.d.a(this.b);
            try {
                a2 = new a(this.b.a(), this.b.a(true));
                // MONITOREXIT : this
                object = this.d;
            }
            catch (RemoteException remoteException) {
                Log.i((String)"AdvertisingIdClient", (String)"GMS remote exception ", (Throwable)remoteException);
                IOException iOException = new IOException("Remote exception");
                throw iOException;
            }
            if (this.e == null) break block21;
            this.e.a.countDown();
            this.e.join();
            break block21;
            catch (InterruptedException interruptedException) {}
        }
        if (this.f > 0L) {
            b b2;
            this.e = b2 = new b(this, this.f);
        }
        // MONITOREXIT : object
        return a2;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void a() {
        com.google.android.gms.internal.d.a("Calling this from your main thread can lead to deadlock");
        synchronized (this) {
            if (this.g == null) return;
            if (this.a == null) {
                return;
            }
            try {
                if (this.c) {
                    this.g.unbindService((ServiceConnection)this.a);
                }
            }
            catch (IllegalArgumentException illegalArgumentException) {
                Log.i((String)"AdvertisingIdClient", (String)"AdvertisingIdClient unbindService failed.", (Throwable)illegalArgumentException);
            }
            this.c = false;
            this.b = null;
            this.a = null;
            return;
        }
    }

    protected final void finalize() {
        this.a();
        super.finalize();
    }

    public static final class a {
        public final String a;
        public final boolean b;

        public a(String string, boolean bl) {
            this.a = string;
            this.b = bl;
        }

        public final String toString() {
            return "{" + this.a + "}" + this.b;
        }
    }

    static final class b
    extends Thread {
        CountDownLatch a;
        boolean b;
        private WeakReference<a> c;
        private long d;

        public b(a a2, long l2) {
            this.c = new WeakReference<a>(a2);
            this.d = l2;
            this.a = new CountDownLatch(1);
            this.b = false;
            this.start();
        }

        private void a() {
            a a2 = (a)this.c.get();
            if (a2 != null) {
                a2.a();
                this.b = true;
            }
        }

        /*
         * Enabled force condition propagation
         * Lifted jumps to return sites
         */
        @Override
        public final void run() {
            try {
                if (!this.a.await(this.d, TimeUnit.MILLISECONDS)) {
                    this.a();
                }
                return;
            }
            catch (InterruptedException interruptedException) {
                this.a();
                return;
            }
        }
    }
}

