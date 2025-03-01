/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
package com.google.android.gms.b;

import android.content.Context;
import com.google.android.gms.b.ab;
import com.google.android.gms.b.ar;
import com.google.android.gms.b.au;
import com.google.android.gms.b.n;
import com.google.android.gms.b.t;
import com.google.android.gms.b.x;
import com.google.android.gms.b.y;
import com.google.android.gms.b.z;
import com.google.android.gms.internal.f;
import com.google.android.gms.internal.g;
import com.google.android.gms.internal.ha;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.ConcurrentLinkedQueue;

final class as
implements t,
y.b,
y.c {
    volatile long a;
    volatile int b;
    final Queue<d> c = new ConcurrentLinkedQueue<d>();
    volatile Timer d;
    f e;
    long f = 300000L;
    private volatile x g;
    private z h;
    private z i = null;
    private final com.google.android.gms.b.c j;
    private final ab k;
    private final Context l;
    private volatile int m;
    private volatile Timer n;
    private volatile Timer o;
    private boolean p;
    private boolean q;
    private boolean r;
    private boolean s;

    as(Context context, ab ab2) {
        this(context, ab2, com.google.android.gms.b.c.a(context));
    }

    private as(Context context, ab ab2, com.google.android.gms.b.c c2) {
        this.l = context;
        this.k = ab2;
        this.j = c2;
        this.e = com.google.android.gms.internal.g.c();
        this.m = 0;
        this.b = com.google.android.gms.b.as$a.g;
    }

    private static Timer a(Timer timer) {
        if (timer != null) {
            timer.cancel();
        }
        return null;
    }

    private void j() {
        this.n = as.a(this.n);
        this.o = as.a(this.o);
        this.d = as.a(this.d);
    }

    private void k() {
        this.h.b();
        this.p = false;
    }

    private void l() {
        this.n = as.a(this.n);
        this.n = new Timer("Service Reconnect");
        this.n.schedule((TimerTask)new e(0), 5000L);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public final void a() {
        synchronized (this) {
            boolean bl = this.s;
            if (!bl) {
                com.google.android.gms.b.n.c("setForceLocalDispatch called.");
                this.s = true;
                switch (2.a[this.b - 1]) {
                    case 1: {
                        break;
                    }
                    default: {
                        break;
                    }
                    case 2: {
                        this.i();
                        break;
                    }
                    case 3: {
                        this.r = true;
                    }
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
    @Override
    public final void a(int n2) {
        synchronized (this) {
            this.b = com.google.android.gms.b.as$a.e;
            if (this.m < 2) {
                StringBuilder stringBuilder = new StringBuilder("Service unavailable (code=");
                com.google.android.gms.b.n.d(stringBuilder.append(n2).append("), will retry.").toString());
                this.l();
            } else {
                StringBuilder stringBuilder = new StringBuilder("Service unavailable (code=");
                com.google.android.gms.b.n.d(stringBuilder.append(n2).append("), using local store.").toString());
                this.g();
            }
            return;
        }
    }

    @Override
    public final void a(Map<String, String> map, long l2, String string, List<ha> list) {
        com.google.android.gms.b.n.c("putHit called");
        this.c.add(new d(map, l2, string, list));
        this.f();
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public final void b() {
        switch (2.a[this.b - 1]) {
            default: {
                this.p = true;
            }
            case 2: {
                return;
            }
            case 1: 
        }
        this.k();
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public final void c() {
        if (this.g != null) {
            return;
        }
        this.g = new y(this.l, this, this);
        this.h();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public final void d() {
        synchronized (this) {
            this.o = as.a(this.o);
            this.m = 0;
            com.google.android.gms.b.n.c("Connected to service");
            this.b = com.google.android.gms.b.as$a.b;
            if (this.r) {
                this.i();
                this.r = false;
            } else {
                Timer timer;
                this.f();
                this.d = as.a(this.d);
                timer = this.d = (timer = new Timer("disconnect check"));
                b b2 = new b(0);
                timer.schedule((TimerTask)b2, this.f);
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
    public final void e() {
        synchronized (this) {
            if (this.b == com.google.android.gms.b.as$a.d) {
                com.google.android.gms.b.n.c("Service blocked.");
                this.j();
            } else if (this.b == com.google.android.gms.b.as$a.f) {
                com.google.android.gms.b.n.c("Disconnected from service");
                this.j();
                this.b = com.google.android.gms.b.as$a.g;
            } else {
                com.google.android.gms.b.n.c("Unexpected disconnect.");
                this.b = com.google.android.gms.b.as$a.e;
                if (this.m < 2) {
                    this.l();
                } else {
                    this.g();
                }
            }
            return;
        }
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    final void f() {
        block22: {
            // MONITORENTER : this
            if (!Thread.currentThread().equals(this.k.d())) {
                var1_1 = this.k.c();
                var2_4 = new Runnable(){

                    @Override
                    public final void run() {
                        as.this.f();
                    }
                };
                var1_1.add(var2_4);
                return;
            }
            if (this.q) {
                com.google.android.gms.b.n.c("clearHits called");
                this.c.clear();
                switch (2.a[this.b - 1]) {
                    default: {
                        this.q = true;
                        break;
                    }
                    case 1: {
                        this.h.a();
                        this.q = false;
                        break;
                    }
                    case 2: {
                        this.g.a();
                        this.q = false;
                        break;
                    }
                }
            }
            switch (2.a[this.b - 1]) {
                default: {
                    return;
                }
                case 1: {
                    while (!this.c.isEmpty()) {
                        var1_2 = this.c.poll();
                        var2_5 = new StringBuilder("Sending hit to store  ");
                        com.google.android.gms.b.n.c(var2_5.append(var1_2).toString());
                        this.h.a(var1_2.a, var1_2.b, var1_2.c, var1_2.d);
                    }
                    ** GOTO lbl38
                }
                case 7: {
                    com.google.android.gms.b.n.c("Blocked. Dropping hits.");
                    this.c.clear();
                    return;
                }
lbl38:
                // 1 sources

                if (!this.p) return;
                this.k();
                return;
                case 2: {
                    break block22;
                }
                case 6: 
            }
            com.google.android.gms.b.n.c("Need to reconnect");
            if (!this.c.isEmpty()) {
                this.h();
                return;
            }
            // MONITOREXIT : this
            return;
        }
        while (true) {
            if (this.c.isEmpty()) {
                this.a = this.e.b();
                return;
            }
            var2_6 = this.c.peek();
            var1_3 = new StringBuilder("Sending hit to service   ");
            com.google.android.gms.b.n.c(var1_3.append(var2_6).toString());
            var1_3 = this.j;
            au.a().a(au.a.ad);
            if (!var1_3.a) {
                this.g.a(var2_6.a, var2_6.b, var2_6.c, var2_6.d);
            } else {
                com.google.android.gms.b.n.c("Dry run enabled. Hit not actually sent to service.");
            }
            this.c.poll();
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    final void g() {
        synchronized (this) {
            int n2 = this.b;
            int n3 = com.google.android.gms.b.as$a.c;
            if (n2 != n3) {
                if (this.l != null && "com.google.android.gms".equals(this.l.getPackageName())) {
                    this.b = com.google.android.gms.b.as$a.d;
                    this.g.c();
                    com.google.android.gms.b.n.d("Attempted to fall back to local store from service.");
                } else {
                    this.j();
                    com.google.android.gms.b.n.c("falling back to local store");
                    if (this.i != null) {
                        this.h = this.i;
                    } else {
                        ar ar2 = ar.c();
                        ar2.a(this.l, this.k);
                        this.h = ar2.d();
                    }
                    this.b = com.google.android.gms.b.as$a.c;
                    this.f();
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
    final void h() {
        synchronized (this) {
            int n2;
            int n3;
            if (!this.s && this.g != null && (n3 = this.b) != (n2 = com.google.android.gms.b.as$a.c)) {
                try {
                    Timer timer;
                    ++this.m;
                    as.a(this.o);
                    this.b = com.google.android.gms.b.as$a.a;
                    timer = this.o = (timer = new Timer("Failed Connect"));
                    c c2 = new c(0);
                    timer.schedule((TimerTask)c2, 3000L);
                    com.google.android.gms.b.n.c("connecting to Analytics service");
                    this.g.b();
                }
                catch (SecurityException securityException) {
                    com.google.android.gms.b.n.d("security exception on connectToService");
                    this.g();
                }
            } else {
                com.google.android.gms.b.n.d("client not initialized.");
                this.g();
            }
            return;
        }
    }

    final void i() {
        synchronized (this) {
            if (this.g != null && this.b == com.google.android.gms.b.as$a.b) {
                this.b = com.google.android.gms.b.as$a.f;
                this.g.c();
            }
            return;
        }
    }

    private static final class a
    extends Enum<a> {
        public static final int a = 1;
        public static final int b = 2;
        public static final int c = 3;
        public static final int d = 4;
        public static final int e = 5;
        public static final int f = 6;
        public static final int g = 7;
        private static final /* synthetic */ int[] h;

        static {
            h = new int[]{a, b, c, d, e, f, g};
        }

        public static int[] a() {
            return (int[])h.clone();
        }
    }

    private final class b
    extends TimerTask {
        private b() {
        }

        /* synthetic */ b(byte by) {
            this();
        }

        /*
         * Enabled force condition propagation
         * Lifted jumps to return sites
         */
        @Override
        public final void run() {
            if (as.this.b == com.google.android.gms.b.as$a.b && as.this.c.isEmpty() && as.this.a + as.this.f < as.this.e.b()) {
                com.google.android.gms.b.n.c("Disconnecting due to inactivity");
                as.this.i();
                return;
            }
            as.this.d.schedule((TimerTask)new b(), as.this.f);
        }
    }

    private final class c
    extends TimerTask {
        private c() {
        }

        /* synthetic */ c(byte by) {
            this();
        }

        @Override
        public final void run() {
            if (as.this.b == com.google.android.gms.b.as$a.a) {
                as.this.g();
            }
        }
    }

    private static final class d {
        final Map<String, String> a;
        final long b;
        final String c;
        final List<ha> d;

        public d(Map<String, String> map, long l2, String string, List<ha> list) {
            this.a = map;
            this.b = l2;
            this.c = string;
            this.d = list;
        }

        public final String toString() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("PATH: ");
            stringBuilder.append(this.c);
            if (this.a != null) {
                stringBuilder.append("  PARAMS: ");
                for (Map.Entry<String, String> entry : this.a.entrySet()) {
                    stringBuilder.append(entry.getKey());
                    stringBuilder.append("=");
                    stringBuilder.append(entry.getValue());
                    stringBuilder.append(",  ");
                }
            }
            return stringBuilder.toString();
        }
    }

    private final class e
    extends TimerTask {
        private e() {
        }

        /* synthetic */ e(byte by) {
            this();
        }

        @Override
        public final void run() {
            as.this.h();
        }
    }
}

