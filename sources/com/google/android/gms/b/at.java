package com.google.android.gms.b;

import android.content.Context;
import android.os.Process;
import android.text.TextUtils;
import com.google.android.gms.internal.ha;
import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

final class at extends Thread implements ab {
    private static at e;
    private final LinkedBlockingQueue<Runnable> a = new LinkedBlockingQueue<>();
    private volatile boolean b = false;
    private volatile boolean c = false;
    /* access modifiers changed from: private */
    public volatile String d;
    /* access modifiers changed from: private */
    public volatile t f;
    /* access modifiers changed from: private */
    public final Context g;
    private final Lock h;
    /* access modifiers changed from: private */
    public final List<ha> i = new ArrayList();

    private class a implements Runnable {
        private a() {
        }

        /* synthetic */ a(at atVar, byte b) {
            this();
        }

        public final void run() {
            at.this.f.b();
        }
    }

    private class b implements Runnable {
        private b() {
        }

        /* synthetic */ b(at atVar, byte b) {
            this();
        }

        public final void run() {
            at.this.f.a();
        }
    }

    private at(Context context) {
        super("GAThread");
        if (context != null) {
            this.g = context.getApplicationContext();
        } else {
            this.g = context;
        }
        this.i.add(new ha("appendVersion", "&_v".substring(1), "ma4.0.4"));
        this.h = new ReentrantLock();
        start();
    }

    static int a(String str) {
        int i2 = 1;
        if (!TextUtils.isEmpty(str)) {
            i2 = 0;
            for (int length = str.length() - 1; length >= 0; length--) {
                char charAt = str.charAt(length);
                i2 = ((i2 << 6) & 65535) + charAt + (charAt << 14);
                int i3 = 266338304 & i2;
                if (i3 != 0) {
                    i2 ^= i3 >> 21;
                }
            }
        }
        return i2;
    }

    static at a(Context context) {
        if (e == null) {
            e = new at(context);
        }
        return e;
    }

    private static String a(Throwable th) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        PrintStream printStream = new PrintStream(byteArrayOutputStream);
        th.printStackTrace(printStream);
        printStream.flush();
        return new String(byteArrayOutputStream.toByteArray());
    }

    private void a(Runnable runnable) {
        this.a.add(runnable);
    }

    private static String b(Context context) {
        try {
            FileInputStream openFileInput = context.openFileInput("gaInstallData");
            byte[] bArr = new byte[8192];
            int read = openFileInput.read(bArr, 0, 8192);
            if (openFileInput.available() > 0) {
                n.a("Too much campaign data, ignoring it.");
                openFileInput.close();
                context.deleteFile("gaInstallData");
                return null;
            }
            openFileInput.close();
            context.deleteFile("gaInstallData");
            if (read <= 0) {
                n.d("Campaign file is empty.");
                return null;
            }
            String str = new String(bArr, 0, read);
            n.b("Campaign found: " + str);
            return str;
        } catch (FileNotFoundException e2) {
            n.b("No campaign data found.");
            return null;
        } catch (IOException e3) {
            n.a("Error reading campaign data.");
            context.deleteFile("gaInstallData");
            return null;
        }
    }

    private synchronized void f() {
        if (this.f == null) {
            this.f = new as(this.g, this);
            this.f.c();
        }
    }

    public final void a() {
        a((Runnable) new a(this, (byte) 0));
    }

    public final void a(Map<String, String> map) {
        a((Runnable) new c(map));
    }

    public final void b() {
        a((Runnable) new b(this, (byte) 0));
    }

    public final LinkedBlockingQueue<Runnable> c() {
        return this.a;
    }

    public final Thread d() {
        return this;
    }

    public final void e() {
        f();
        ArrayList<Runnable> arrayList = new ArrayList<>();
        this.a.drainTo(arrayList);
        this.h.lock();
        try {
            this.b = true;
            for (Runnable run : arrayList) {
                run.run();
            }
        } catch (Throwable th) {
            this.h.unlock();
            throw th;
        }
        this.h.unlock();
    }

    public final void run() {
        Process.setThreadPriority(10);
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e2) {
            n.d("sleep interrupted in GAThread initialize");
        }
        try {
            f();
            this.d = b(this.g);
            n.c("Initialized GA Thread");
        } catch (Throwable th) {
            n.a("Error initializing the GAThread: " + a(th));
            n.a("Google Analytics will not start up.");
            this.b = true;
        }
        while (!this.c) {
            try {
                Runnable take = this.a.take();
                this.h.lock();
                if (!this.b) {
                    take.run();
                }
                this.h.unlock();
            } catch (InterruptedException e3) {
                n.b(e3.toString());
            } catch (Throwable th2) {
                n.a("Error on GAThread: " + a(th2));
                n.a("Google Analytics is shutting down.");
                this.b = true;
            }
        }
    }

    private class c implements Runnable {
        private final Map<String, String> b;

        c(Map<String, String> map) {
            this.b = new HashMap(map);
            String str = map.get("&ht");
            if (str != null) {
                try {
                    Long.valueOf(str);
                } catch (NumberFormatException e) {
                    str = null;
                }
            }
            if (str == null) {
                this.b.put("&ht", Long.toString(System.currentTimeMillis()));
            }
        }

        /* JADX WARNING: Removed duplicated region for block: B:18:0x00aa  */
        /* JADX WARNING: Removed duplicated region for block: B:49:? A[RETURN, SYNTHETIC] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void run() {
            /*
                r10 = this;
                r8 = 4636737291354636288(0x4059000000000000, double:100.0)
                r2 = 0
                r3 = 1
                java.util.Map<java.lang.String, java.lang.String> r0 = r10.b
                com.google.android.gms.b.at r1 = com.google.android.gms.b.at.this
                android.content.Context r1 = r1.g
                com.google.android.gms.b.am r1 = com.google.android.gms.b.i.a((android.content.Context) r1)
                java.lang.String r4 = "&adid"
                com.google.android.gms.b.w.a((java.util.Map<java.lang.String, java.lang.String>) r0, (java.lang.String) r4, (com.google.android.gms.b.am) r1)
                java.lang.String r4 = "&ate"
                com.google.android.gms.b.w.a((java.util.Map<java.lang.String, java.lang.String>) r0, (java.lang.String) r4, (com.google.android.gms.b.am) r1)
                java.util.Map<java.lang.String, java.lang.String> r0 = r10.b
                java.lang.String r1 = "&cid"
                java.lang.Object r0 = r0.get(r1)
                java.lang.CharSequence r0 = (java.lang.CharSequence) r0
                boolean r0 = android.text.TextUtils.isEmpty(r0)
                if (r0 == 0) goto L_0x003b
                java.util.Map<java.lang.String, java.lang.String> r0 = r10.b
                java.lang.String r1 = "&cid"
                com.google.android.gms.b.ag r4 = com.google.android.gms.b.ag.a()
                java.lang.String r5 = "&cid"
                java.lang.String r4 = r4.a((java.lang.String) r5)
                r0.put(r1, r4)
            L_0x003b:
                com.google.android.gms.b.at r0 = com.google.android.gms.b.at.this
                android.content.Context r0 = r0.g
                com.google.android.gms.b.c r0 = com.google.android.gms.b.c.a((android.content.Context) r0)
                com.google.android.gms.b.au r1 = com.google.android.gms.b.au.a()
                com.google.android.gms.b.au$a r4 = com.google.android.gms.b.au.a.GET_APP_OPT_OUT
                r1.a((com.google.android.gms.b.au.a) r4)
                java.lang.Boolean r0 = r0.e
                boolean r0 = r0.booleanValue()
                if (r0 != 0) goto L_0x009e
                java.util.Map<java.lang.String, java.lang.String> r1 = r10.b
                java.lang.String r0 = "&sf"
                java.lang.Object r0 = r1.get(r0)
                if (r0 == 0) goto L_0x00a8
                java.lang.String r0 = "&sf"
                java.lang.Object r0 = r1.get(r0)
                java.lang.String r0 = (java.lang.String) r0
                double r4 = com.google.android.gms.b.w.b(r0)
                int r0 = (r4 > r8 ? 1 : (r4 == r8 ? 0 : -1))
                if (r0 >= 0) goto L_0x00a8
                java.lang.String r0 = "&cid"
                java.lang.Object r0 = r1.get(r0)
                java.lang.String r0 = (java.lang.String) r0
                int r0 = com.google.android.gms.b.at.a((java.lang.String) r0)
                int r0 = r0 % 10000
                double r6 = (double) r0
                double r4 = r4 * r8
                int r0 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
                if (r0 < 0) goto L_0x00a8
                java.lang.String r0 = "&t"
                java.lang.Object r0 = r1.get(r0)
                if (r0 != 0) goto L_0x009f
                java.lang.String r0 = "unknown"
            L_0x008e:
                java.lang.String r1 = "%s hit sampled out"
                java.lang.Object[] r4 = new java.lang.Object[r3]
                r4[r2] = r0
                java.lang.String r0 = java.lang.String.format(r1, r4)
                com.google.android.gms.b.n.c(r0)
                r0 = r3
            L_0x009c:
                if (r0 == 0) goto L_0x00aa
            L_0x009e:
                return
            L_0x009f:
                java.lang.String r0 = "&t"
                java.lang.Object r0 = r1.get(r0)
                java.lang.String r0 = (java.lang.String) r0
                goto L_0x008e
            L_0x00a8:
                r0 = r2
                goto L_0x009c
            L_0x00aa:
                com.google.android.gms.b.at r0 = com.google.android.gms.b.at.this
                java.lang.String r0 = r0.d
                boolean r0 = android.text.TextUtils.isEmpty(r0)
                if (r0 != 0) goto L_0x00f1
                com.google.android.gms.b.au r0 = com.google.android.gms.b.au.a()
                r0.a((boolean) r3)
                java.util.Map<java.lang.String, java.lang.String> r4 = r10.b
                com.google.android.gms.b.d$d r1 = new com.google.android.gms.b.d$d
                r1.<init>()
                com.google.android.gms.b.at r0 = com.google.android.gms.b.at.this
                java.lang.String r0 = r0.d
                com.google.android.gms.b.au r5 = com.google.android.gms.b.au.a()
                com.google.android.gms.b.au$a r6 = com.google.android.gms.b.au.a.MAP_BUILDER_SET_CAMPAIGN_PARAMS
                r5.a((com.google.android.gms.b.au.a) r6)
                java.lang.String r0 = com.google.android.gms.b.w.d(r0)
                boolean r5 = android.text.TextUtils.isEmpty(r0)
                if (r5 == 0) goto L_0x0159
                r0 = r1
            L_0x00de:
                java.util.Map r0 = r0.a()
                r4.putAll(r0)
                com.google.android.gms.b.au r0 = com.google.android.gms.b.au.a()
                r0.a((boolean) r2)
                com.google.android.gms.b.at r0 = com.google.android.gms.b.at.this
                java.lang.String unused = r0.d = null
            L_0x00f1:
                java.util.Map<java.lang.String, java.lang.String> r0 = r10.b
                com.google.android.gms.b.ac r1 = com.google.android.gms.b.ac.a()
                java.lang.String r2 = "&an"
                com.google.android.gms.b.w.a((java.util.Map<java.lang.String, java.lang.String>) r0, (java.lang.String) r2, (com.google.android.gms.b.am) r1)
                java.lang.String r2 = "&av"
                com.google.android.gms.b.w.a((java.util.Map<java.lang.String, java.lang.String>) r0, (java.lang.String) r2, (com.google.android.gms.b.am) r1)
                java.lang.String r2 = "&aid"
                com.google.android.gms.b.w.a((java.util.Map<java.lang.String, java.lang.String>) r0, (java.lang.String) r2, (com.google.android.gms.b.am) r1)
                java.lang.String r2 = "&aiid"
                com.google.android.gms.b.w.a((java.util.Map<java.lang.String, java.lang.String>) r0, (java.lang.String) r2, (com.google.android.gms.b.am) r1)
                java.lang.String r1 = "&v"
                java.lang.String r2 = "1"
                r0.put(r1, r2)
                java.util.Map<java.lang.String, java.lang.String> r0 = r10.b
                java.util.HashMap r1 = new java.util.HashMap
                r1.<init>()
                java.util.Set r0 = r0.entrySet()
                java.util.Iterator r4 = r0.iterator()
            L_0x0121:
                boolean r0 = r4.hasNext()
                if (r0 == 0) goto L_0x01d5
                java.lang.Object r0 = r4.next()
                java.util.Map$Entry r0 = (java.util.Map.Entry) r0
                java.lang.Object r2 = r0.getKey()
                java.lang.String r2 = (java.lang.String) r2
                java.lang.String r5 = "&"
                boolean r2 = r2.startsWith(r5)
                if (r2 == 0) goto L_0x0121
                java.lang.Object r2 = r0.getValue()
                if (r2 == 0) goto L_0x0121
                java.lang.Object r2 = r0.getKey()
                java.lang.String r2 = (java.lang.String) r2
                java.lang.String r2 = r2.substring(r3)
                boolean r5 = android.text.TextUtils.isEmpty(r2)
                if (r5 != 0) goto L_0x0121
                java.lang.Object r0 = r0.getValue()
                r1.put(r2, r0)
                goto L_0x0121
            L_0x0159:
                java.util.Map r5 = com.google.android.gms.b.w.a((java.lang.String) r0)
                java.lang.String r6 = "&cc"
                java.lang.String r0 = "utm_content"
                java.lang.Object r0 = r5.get(r0)
                java.lang.String r0 = (java.lang.String) r0
                r1.a(r6, r0)
                java.lang.String r6 = "&cm"
                java.lang.String r0 = "utm_medium"
                java.lang.Object r0 = r5.get(r0)
                java.lang.String r0 = (java.lang.String) r0
                r1.a(r6, r0)
                java.lang.String r6 = "&cn"
                java.lang.String r0 = "utm_campaign"
                java.lang.Object r0 = r5.get(r0)
                java.lang.String r0 = (java.lang.String) r0
                r1.a(r6, r0)
                java.lang.String r6 = "&cs"
                java.lang.String r0 = "utm_source"
                java.lang.Object r0 = r5.get(r0)
                java.lang.String r0 = (java.lang.String) r0
                r1.a(r6, r0)
                java.lang.String r6 = "&ck"
                java.lang.String r0 = "utm_term"
                java.lang.Object r0 = r5.get(r0)
                java.lang.String r0 = (java.lang.String) r0
                r1.a(r6, r0)
                java.lang.String r6 = "&ci"
                java.lang.String r0 = "utm_id"
                java.lang.Object r0 = r5.get(r0)
                java.lang.String r0 = (java.lang.String) r0
                r1.a(r6, r0)
                java.lang.String r6 = "&gclid"
                java.lang.String r0 = "gclid"
                java.lang.Object r0 = r5.get(r0)
                java.lang.String r0 = (java.lang.String) r0
                r1.a(r6, r0)
                java.lang.String r6 = "&dclid"
                java.lang.String r0 = "dclid"
                java.lang.Object r0 = r5.get(r0)
                java.lang.String r0 = (java.lang.String) r0
                r1.a(r6, r0)
                java.lang.String r6 = "&gmob_t"
                java.lang.String r0 = "gmob_t"
                java.lang.Object r0 = r5.get(r0)
                java.lang.String r0 = (java.lang.String) r0
                r1.a(r6, r0)
                r0 = r1
                goto L_0x00de
            L_0x01d5:
                com.google.android.gms.b.at r0 = com.google.android.gms.b.at.this
                com.google.android.gms.b.t r0 = r0.f
                java.util.Map<java.lang.String, java.lang.String> r2 = r10.b
                java.lang.String r3 = "&ht"
                java.lang.Object r2 = r2.get(r3)
                java.lang.String r2 = (java.lang.String) r2
                java.lang.Long r2 = java.lang.Long.valueOf(r2)
                long r2 = r2.longValue()
                java.util.Map<java.lang.String, java.lang.String> r4 = r10.b
                java.lang.String r5 = "useSecure"
                boolean r5 = r4.containsKey(r5)
                if (r5 == 0) goto L_0x0212
                java.lang.String r5 = "useSecure"
                java.lang.Object r4 = r4.get(r5)
                java.lang.String r4 = (java.lang.String) r4
                boolean r4 = com.google.android.gms.b.w.c(r4)
                if (r4 != 0) goto L_0x0212
                java.lang.String r4 = "http:"
            L_0x0207:
                com.google.android.gms.b.at r5 = com.google.android.gms.b.at.this
                java.util.List r5 = r5.i
                r0.a(r1, r2, r4, r5)
                goto L_0x009e
            L_0x0212:
                java.lang.String r4 = "https:"
                goto L_0x0207
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.b.at.c.run():void");
        }
    }
}
