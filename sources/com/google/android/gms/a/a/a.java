package com.google.android.gms.a.a;

import android.content.Context;
import android.content.Intent;
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

    /* renamed from: com.google.android.gms.a.a.a$a  reason: collision with other inner class name */
    public static final class C0021a {
        public final String a;
        public final boolean b;

        public C0021a(String str, boolean z) {
            this.a = str;
            this.b = z;
        }

        public final String toString() {
            return "{" + this.a + "}" + this.b;
        }
    }

    static class b extends Thread {
        CountDownLatch a = new CountDownLatch(1);
        boolean b = false;
        private WeakReference<a> c;
        private long d;

        public b(a aVar, long j) {
            this.c = new WeakReference<>(aVar);
            this.d = j;
            start();
        }

        private void a() {
            a aVar = (a) this.c.get();
            if (aVar != null) {
                aVar.a();
                this.b = true;
            }
        }

        public final void run() {
            try {
                if (!this.a.await(this.d, TimeUnit.MILLISECONDS)) {
                    a();
                }
            } catch (InterruptedException e) {
                a();
            }
        }
    }

    private a(Context context) {
        d.a(context);
        this.g = context;
        this.c = false;
        this.f = -1;
    }

    public static C0021a a(Context context) {
        a aVar = new a(context);
        try {
            aVar.b();
            return aVar.c();
        } finally {
            aVar.a();
        }
    }

    private static e b(Context context) {
        try {
            context.getPackageManager().getPackageInfo("com.android.vending", 0);
            try {
                c.a(context);
                e eVar = new e();
                Intent intent = new Intent("com.google.android.gms.ads.identifier.service.START");
                intent.setPackage("com.google.android.gms");
                if (context.bindService(intent, eVar, 1)) {
                    return eVar;
                }
                throw new IOException("Connection failure");
            } catch (com.google.android.gms.common.a e2) {
                throw new IOException(e2);
            }
        } catch (PackageManager.NameNotFoundException e3) {
            throw new com.google.android.gms.common.a(9);
        }
    }

    private void b() {
        d.a("Calling this from your main thread can lead to deadlock");
        synchronized (this) {
            if (this.c) {
                a();
            }
            this.a = b(this.g);
            this.b = a(this.a);
            this.c = true;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:?, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a() {
        /*
            r3 = this;
            java.lang.String r0 = "Calling this from your main thread can lead to deadlock"
            com.google.android.gms.internal.d.a((java.lang.String) r0)
            monitor-enter(r3)
            android.content.Context r0 = r3.g     // Catch:{ all -> 0x0026 }
            if (r0 == 0) goto L_0x000e
            com.google.android.gms.common.e r0 = r3.a     // Catch:{ all -> 0x0026 }
            if (r0 != 0) goto L_0x0010
        L_0x000e:
            monitor-exit(r3)     // Catch:{ all -> 0x0026 }
        L_0x000f:
            return
        L_0x0010:
            boolean r0 = r3.c     // Catch:{ IllegalArgumentException -> 0x0029 }
            if (r0 == 0) goto L_0x001b
            android.content.Context r0 = r3.g     // Catch:{ IllegalArgumentException -> 0x0029 }
            com.google.android.gms.common.e r1 = r3.a     // Catch:{ IllegalArgumentException -> 0x0029 }
            r0.unbindService(r1)     // Catch:{ IllegalArgumentException -> 0x0029 }
        L_0x001b:
            r0 = 0
            r3.c = r0     // Catch:{ all -> 0x0026 }
            r0 = 0
            r3.b = r0     // Catch:{ all -> 0x0026 }
            r0 = 0
            r3.a = r0     // Catch:{ all -> 0x0026 }
            monitor-exit(r3)     // Catch:{ all -> 0x0026 }
            goto L_0x000f
        L_0x0026:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x0026 }
            throw r0
        L_0x0029:
            r0 = move-exception
            java.lang.String r1 = "AdvertisingIdClient"
            java.lang.String r2 = "AdvertisingIdClient unbindService failed."
            android.util.Log.i(r1, r2, r0)     // Catch:{ all -> 0x0026 }
            goto L_0x001b
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.a.a.a.a():void");
    }

    /* access modifiers changed from: protected */
    public final void finalize() {
        a();
        super.finalize();
    }

    private C0021a c() {
        C0021a aVar;
        d.a("Calling this from your main thread can lead to deadlock");
        synchronized (this) {
            if (!this.c) {
                synchronized (this.d) {
                    if (this.e == null || !this.e.b) {
                        throw new IOException("AdvertisingIdClient is not connected.");
                    }
                }
                try {
                    b();
                    if (!this.c) {
                        throw new IOException("AdvertisingIdClient cannot reconnect.");
                    }
                } catch (RemoteException e2) {
                    Log.i("AdvertisingIdClient", "GMS remote exception ", e2);
                    throw new IOException("Remote exception");
                } catch (Exception e3) {
                    throw new IOException("AdvertisingIdClient cannot reconnect.", e3);
                }
            }
            d.a(this.a);
            d.a(this.b);
            aVar = new C0021a(this.b.a(), this.b.a(true));
        }
        synchronized (this.d) {
            if (this.e != null) {
                this.e.a.countDown();
                try {
                    this.e.join();
                } catch (InterruptedException e4) {
                }
            }
            if (this.f > 0) {
                this.e = new b(this, this.f);
            }
        }
        return aVar;
    }

    private static h a(e eVar) {
        try {
            if (Looper.myLooper() == Looper.getMainLooper()) {
                throw new IllegalStateException("BlockingServiceConnection.getService() called on main thread");
            } else if (eVar.a) {
                throw new IllegalStateException();
            } else {
                eVar.a = true;
                return h.a.a(eVar.b.take());
            }
        } catch (InterruptedException e2) {
            throw new IOException("Interrupted exception");
        }
    }
}
