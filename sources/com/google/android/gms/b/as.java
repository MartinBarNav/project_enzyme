package com.google.android.gms.b;

import android.content.Context;
import com.google.android.gms.b.y;
import com.google.android.gms.internal.f;
import com.google.android.gms.internal.g;
import com.google.android.gms.internal.ha;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.ConcurrentLinkedQueue;

final class as implements t, y.b, y.c {
    volatile long a;
    volatile int b;
    final Queue<d> c;
    volatile Timer d;
    f e;
    long f;
    private volatile x g;
    private z h;
    private z i;
    private final c j;
    private final ab k;
    private final Context l;
    private volatile int m;
    private volatile Timer n;
    private volatile Timer o;
    private boolean p;
    private boolean q;
    private boolean r;
    private boolean s;

    /* renamed from: com.google.android.gms.b.as$2  reason: invalid class name */
    static /* synthetic */ class AnonymousClass2 {
        static final /* synthetic */ int[] a = new int[a.a().length];

        static {
            try {
                a[a.c - 1] = 1;
            } catch (NoSuchFieldError e) {
            }
            try {
                a[a.b - 1] = 2;
            } catch (NoSuchFieldError e2) {
            }
            try {
                a[a.a - 1] = 3;
            } catch (NoSuchFieldError e3) {
            }
            try {
                a[a.e - 1] = 4;
            } catch (NoSuchFieldError e4) {
            }
            try {
                a[a.f - 1] = 5;
            } catch (NoSuchFieldError e5) {
            }
            try {
                a[a.g - 1] = 6;
            } catch (NoSuchFieldError e6) {
            }
            try {
                a[a.d - 1] = 7;
            } catch (NoSuchFieldError e7) {
            }
        }
    }

    private enum a {
        ;
        
        public static final int a = 0;
        public static final int b = 0;
        public static final int c = 0;
        public static final int d = 0;
        public static final int e = 0;
        public static final int f = 0;
        public static final int g = 0;

        static {
            a = 1;
            b = 2;
            c = 3;
            d = 4;
            e = 5;
            f = 6;
            g = 7;
            h = new int[]{a, b, c, d, e, f, g};
        }

        public static int[] a() {
            return (int[]) h.clone();
        }
    }

    private static class d {
        final Map<String, String> a;
        final long b;
        final String c;
        final List<ha> d;

        public d(Map<String, String> map, long j, String str, List<ha> list) {
            this.a = map;
            this.b = j;
            this.c = str;
            this.d = list;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("PATH: ");
            sb.append(this.c);
            if (this.a != null) {
                sb.append("  PARAMS: ");
                for (Map.Entry next : this.a.entrySet()) {
                    sb.append((String) next.getKey());
                    sb.append("=");
                    sb.append((String) next.getValue());
                    sb.append(",  ");
                }
            }
            return sb.toString();
        }
    }

    as(Context context, ab abVar) {
        this(context, abVar, c.a(context));
    }

    private as(Context context, ab abVar, c cVar) {
        this.c = new ConcurrentLinkedQueue();
        this.f = 300000;
        this.i = null;
        this.l = context;
        this.k = abVar;
        this.j = cVar;
        this.e = g.c();
        this.m = 0;
        this.b = a.g;
    }

    private static Timer a(Timer timer) {
        if (timer == null) {
            return null;
        }
        timer.cancel();
        return null;
    }

    private void j() {
        this.n = a(this.n);
        this.o = a(this.o);
        this.d = a(this.d);
    }

    private void k() {
        this.h.b();
        this.p = false;
    }

    private void l() {
        this.n = a(this.n);
        this.n = new Timer("Service Reconnect");
        this.n.schedule(new e(this, (byte) 0), 5000);
    }

    public final synchronized void a() {
        if (!this.s) {
            n.c("setForceLocalDispatch called.");
            this.s = true;
            switch (AnonymousClass2.a[this.b - 1]) {
                case 1:
                    break;
                case 2:
                    i();
                    break;
                case 3:
                    this.r = true;
                    break;
            }
        }
    }

    public final synchronized void a(int i2) {
        this.b = a.e;
        if (this.m < 2) {
            n.d("Service unavailable (code=" + i2 + "), will retry.");
            l();
        } else {
            n.d("Service unavailable (code=" + i2 + "), using local store.");
            g();
        }
    }

    public final void a(Map<String, String> map, long j2, String str, List<ha> list) {
        n.c("putHit called");
        this.c.add(new d(map, j2, str, list));
        f();
    }

    public final void b() {
        switch (AnonymousClass2.a[this.b - 1]) {
            case 1:
                k();
                return;
            case 2:
                return;
            default:
                this.p = true;
                return;
        }
    }

    public final void c() {
        if (this.g == null) {
            this.g = new y(this.l, this, this);
            h();
        }
    }

    public final synchronized void d() {
        this.o = a(this.o);
        this.m = 0;
        n.c("Connected to service");
        this.b = a.b;
        if (this.r) {
            i();
            this.r = false;
        } else {
            f();
            this.d = a(this.d);
            this.d = new Timer("disconnect check");
            this.d.schedule(new b(this, (byte) 0), this.f);
        }
    }

    public final synchronized void e() {
        if (this.b == a.d) {
            n.c("Service blocked.");
            j();
        } else if (this.b == a.f) {
            n.c("Disconnected from service");
            j();
            this.b = a.g;
        } else {
            n.c("Unexpected disconnect.");
            this.b = a.e;
            if (this.m < 2) {
                l();
            } else {
                g();
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final synchronized void g() {
        if (this.b != a.c) {
            if (this.l == null || !"com.google.android.gms".equals(this.l.getPackageName())) {
                j();
                n.c("falling back to local store");
                if (this.i != null) {
                    this.h = this.i;
                } else {
                    ar c2 = ar.c();
                    c2.a(this.l, this.k);
                    this.h = c2.d();
                }
                this.b = a.c;
                f();
            } else {
                this.b = a.d;
                this.g.c();
                n.d("Attempted to fall back to local store from service.");
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final synchronized void h() {
        if (this.s || this.g == null || this.b == a.c) {
            n.d("client not initialized.");
            g();
        } else {
            try {
                this.m++;
                a(this.o);
                this.b = a.a;
                this.o = new Timer("Failed Connect");
                this.o.schedule(new c(this, (byte) 0), 3000);
                n.c("connecting to Analytics service");
                this.g.b();
            } catch (SecurityException e2) {
                n.d("security exception on connectToService");
                g();
            }
        }
        return;
    }

    /* access modifiers changed from: package-private */
    public final synchronized void i() {
        if (this.g != null && this.b == a.b) {
            this.b = a.f;
            this.g.c();
        }
    }

    private class b extends TimerTask {
        private b() {
        }

        /* synthetic */ b(as asVar, byte b) {
            this();
        }

        public final void run() {
            if (as.this.b != a.b || !as.this.c.isEmpty() || as.this.a + as.this.f >= as.this.e.b()) {
                as.this.d.schedule(new b(), as.this.f);
                return;
            }
            n.c("Disconnecting due to inactivity");
            as.this.i();
        }
    }

    private class c extends TimerTask {
        private c() {
        }

        /* synthetic */ c(as asVar, byte b) {
            this();
        }

        public final void run() {
            if (as.this.b == a.a) {
                as.this.g();
            }
        }
    }

    private class e extends TimerTask {
        private e() {
        }

        /* synthetic */ e(as asVar, byte b) {
            this();
        }

        public final void run() {
            as.this.h();
        }
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x009d, code lost:
        if (r8.p == false) goto L_0x001f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x009f, code lost:
        k();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00f0, code lost:
        r8.a = r8.e.b();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void f() {
        /*
            r8 = this;
            monitor-enter(r8)
            java.lang.Thread r2 = java.lang.Thread.currentThread()     // Catch:{ all -> 0x007b }
            com.google.android.gms.b.ab r3 = r8.k     // Catch:{ all -> 0x007b }
            java.lang.Thread r3 = r3.d()     // Catch:{ all -> 0x007b }
            boolean r2 = r2.equals(r3)     // Catch:{ all -> 0x007b }
            if (r2 != 0) goto L_0x0021
            com.google.android.gms.b.ab r2 = r8.k     // Catch:{ all -> 0x007b }
            java.util.concurrent.LinkedBlockingQueue r2 = r2.c()     // Catch:{ all -> 0x007b }
            com.google.android.gms.b.as$1 r3 = new com.google.android.gms.b.as$1     // Catch:{ all -> 0x007b }
            r3.<init>()     // Catch:{ all -> 0x007b }
            r2.add(r3)     // Catch:{ all -> 0x007b }
        L_0x001f:
            monitor-exit(r8)
            return
        L_0x0021:
            boolean r2 = r8.q     // Catch:{ all -> 0x007b }
            if (r2 == 0) goto L_0x003d
            java.lang.String r2 = "clearHits called"
            com.google.android.gms.b.n.c(r2)     // Catch:{ all -> 0x007b }
            java.util.Queue<com.google.android.gms.b.as$d> r2 = r8.c     // Catch:{ all -> 0x007b }
            r2.clear()     // Catch:{ all -> 0x007b }
            int[] r2 = com.google.android.gms.b.as.AnonymousClass2.a     // Catch:{ all -> 0x007b }
            int r3 = r8.b     // Catch:{ all -> 0x007b }
            int r3 = r3 + -1
            r2 = r2[r3]     // Catch:{ all -> 0x007b }
            switch(r2) {
                case 1: goto L_0x007e;
                case 2: goto L_0x0087;
                default: goto L_0x003a;
            }     // Catch:{ all -> 0x007b }
        L_0x003a:
            r2 = 1
            r8.q = r2     // Catch:{ all -> 0x007b }
        L_0x003d:
            int[] r2 = com.google.android.gms.b.as.AnonymousClass2.a     // Catch:{ all -> 0x007b }
            int r3 = r8.b     // Catch:{ all -> 0x007b }
            int r3 = r3 + -1
            r2 = r2[r3]     // Catch:{ all -> 0x007b }
            switch(r2) {
                case 1: goto L_0x0049;
                case 2: goto L_0x00a4;
                case 3: goto L_0x0048;
                case 4: goto L_0x0048;
                case 5: goto L_0x0048;
                case 6: goto L_0x00fa;
                case 7: goto L_0x0090;
                default: goto L_0x0048;
            }     // Catch:{ all -> 0x007b }
        L_0x0048:
            goto L_0x001f
        L_0x0049:
            java.util.Queue<com.google.android.gms.b.as$d> r2 = r8.c     // Catch:{ all -> 0x007b }
            boolean r2 = r2.isEmpty()     // Catch:{ all -> 0x007b }
            if (r2 != 0) goto L_0x009b
            java.util.Queue<com.google.android.gms.b.as$d> r2 = r8.c     // Catch:{ all -> 0x007b }
            java.lang.Object r2 = r2.poll()     // Catch:{ all -> 0x007b }
            r0 = r2
            com.google.android.gms.b.as$d r0 = (com.google.android.gms.b.as.d) r0     // Catch:{ all -> 0x007b }
            r7 = r0
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x007b }
            java.lang.String r3 = "Sending hit to store  "
            r2.<init>(r3)     // Catch:{ all -> 0x007b }
            java.lang.StringBuilder r2 = r2.append(r7)     // Catch:{ all -> 0x007b }
            java.lang.String r2 = r2.toString()     // Catch:{ all -> 0x007b }
            com.google.android.gms.b.n.c(r2)     // Catch:{ all -> 0x007b }
            com.google.android.gms.b.z r2 = r8.h     // Catch:{ all -> 0x007b }
            java.util.Map<java.lang.String, java.lang.String> r3 = r7.a     // Catch:{ all -> 0x007b }
            long r4 = r7.b     // Catch:{ all -> 0x007b }
            java.lang.String r6 = r7.c     // Catch:{ all -> 0x007b }
            java.util.List<com.google.android.gms.internal.ha> r7 = r7.d     // Catch:{ all -> 0x007b }
            r2.a(r3, r4, r6, r7)     // Catch:{ all -> 0x007b }
            goto L_0x0049
        L_0x007b:
            r2 = move-exception
            monitor-exit(r8)
            throw r2
        L_0x007e:
            com.google.android.gms.b.z r2 = r8.h     // Catch:{ all -> 0x007b }
            r2.a()     // Catch:{ all -> 0x007b }
            r2 = 0
            r8.q = r2     // Catch:{ all -> 0x007b }
            goto L_0x003d
        L_0x0087:
            com.google.android.gms.b.x r2 = r8.g     // Catch:{ all -> 0x007b }
            r2.a()     // Catch:{ all -> 0x007b }
            r2 = 0
            r8.q = r2     // Catch:{ all -> 0x007b }
            goto L_0x003d
        L_0x0090:
            java.lang.String r2 = "Blocked. Dropping hits."
            com.google.android.gms.b.n.c(r2)     // Catch:{ all -> 0x007b }
            java.util.Queue<com.google.android.gms.b.as$d> r2 = r8.c     // Catch:{ all -> 0x007b }
            r2.clear()     // Catch:{ all -> 0x007b }
            goto L_0x001f
        L_0x009b:
            boolean r2 = r8.p     // Catch:{ all -> 0x007b }
            if (r2 == 0) goto L_0x001f
            r8.k()     // Catch:{ all -> 0x007b }
            goto L_0x001f
        L_0x00a4:
            java.util.Queue<com.google.android.gms.b.as$d> r2 = r8.c     // Catch:{ all -> 0x007b }
            boolean r2 = r2.isEmpty()     // Catch:{ all -> 0x007b }
            if (r2 != 0) goto L_0x00f0
            java.util.Queue<com.google.android.gms.b.as$d> r2 = r8.c     // Catch:{ all -> 0x007b }
            java.lang.Object r2 = r2.peek()     // Catch:{ all -> 0x007b }
            r0 = r2
            com.google.android.gms.b.as$d r0 = (com.google.android.gms.b.as.d) r0     // Catch:{ all -> 0x007b }
            r7 = r0
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x007b }
            java.lang.String r3 = "Sending hit to service   "
            r2.<init>(r3)     // Catch:{ all -> 0x007b }
            java.lang.StringBuilder r2 = r2.append(r7)     // Catch:{ all -> 0x007b }
            java.lang.String r2 = r2.toString()     // Catch:{ all -> 0x007b }
            com.google.android.gms.b.n.c(r2)     // Catch:{ all -> 0x007b }
            com.google.android.gms.b.c r2 = r8.j     // Catch:{ all -> 0x007b }
            com.google.android.gms.b.au r3 = com.google.android.gms.b.au.a()     // Catch:{ all -> 0x007b }
            com.google.android.gms.b.au$a r4 = com.google.android.gms.b.au.a.GET_DRY_RUN     // Catch:{ all -> 0x007b }
            r3.a((com.google.android.gms.b.au.a) r4)     // Catch:{ all -> 0x007b }
            boolean r2 = r2.a     // Catch:{ all -> 0x007b }
            if (r2 != 0) goto L_0x00ea
            com.google.android.gms.b.x r2 = r8.g     // Catch:{ all -> 0x007b }
            java.util.Map<java.lang.String, java.lang.String> r3 = r7.a     // Catch:{ all -> 0x007b }
            long r4 = r7.b     // Catch:{ all -> 0x007b }
            java.lang.String r6 = r7.c     // Catch:{ all -> 0x007b }
            java.util.List<com.google.android.gms.internal.ha> r7 = r7.d     // Catch:{ all -> 0x007b }
            r2.a(r3, r4, r6, r7)     // Catch:{ all -> 0x007b }
        L_0x00e4:
            java.util.Queue<com.google.android.gms.b.as$d> r2 = r8.c     // Catch:{ all -> 0x007b }
            r2.poll()     // Catch:{ all -> 0x007b }
            goto L_0x00a4
        L_0x00ea:
            java.lang.String r2 = "Dry run enabled. Hit not actually sent to service."
            com.google.android.gms.b.n.c(r2)     // Catch:{ all -> 0x007b }
            goto L_0x00e4
        L_0x00f0:
            com.google.android.gms.internal.f r2 = r8.e     // Catch:{ all -> 0x007b }
            long r2 = r2.b()     // Catch:{ all -> 0x007b }
            r8.a = r2     // Catch:{ all -> 0x007b }
            goto L_0x001f
        L_0x00fa:
            java.lang.String r2 = "Need to reconnect"
            com.google.android.gms.b.n.c(r2)     // Catch:{ all -> 0x007b }
            java.util.Queue<com.google.android.gms.b.as$d> r2 = r8.c     // Catch:{ all -> 0x007b }
            boolean r2 = r2.isEmpty()     // Catch:{ all -> 0x007b }
            if (r2 != 0) goto L_0x001f
            r8.h()     // Catch:{ all -> 0x007b }
            goto L_0x001f
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.b.as.f():void");
    }
}
