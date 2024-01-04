// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.b;

import java.util.Iterator;
import java.util.Collection;
import com.google.android.gms.internal.ha;
import java.util.List;
import java.util.Map;
import java.util.TimerTask;
import com.google.android.gms.internal.g;
import java.util.concurrent.ConcurrentLinkedQueue;
import android.content.Context;
import com.google.android.gms.internal.f;
import java.util.Timer;
import java.util.Queue;

final class as implements t, y.b, y.c
{
    volatile long a;
    volatile int b;
    final Queue<d> c;
    volatile Timer d;
    f e;
    long f;
    private volatile x g;
    private z h;
    private z i;
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
    
    as(final Context context, final ab ab) {
        this(context, ab, com.google.android.gms.b.c.a(context));
    }
    
    private as(final Context l, final ab k, final com.google.android.gms.b.c j) {
        this.c = new ConcurrentLinkedQueue<d>();
        this.f = 300000L;
        this.i = null;
        this.l = l;
        this.k = k;
        this.j = j;
        this.e = com.google.android.gms.internal.g.c();
        this.m = 0;
        this.b = as.a.g;
    }
    
    private static Timer a(final Timer timer) {
        if (timer != null) {
            timer.cancel();
        }
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
        (this.n = new Timer("Service Reconnect")).schedule(new e((byte)0), 5000L);
    }
    
    @Override
    public final void a() {
        while (true) {
            Label_0075: {
                synchronized (this) {
                    if (!this.s) {
                        com.google.android.gms.b.n.c("setForceLocalDispatch called.");
                        this.s = true;
                        switch (as$2.a[this.b - 1]) {
                            case 2: {
                                this.i();
                            }
                            case 3: {
                                break Label_0075;
                            }
                        }
                    }
                    return;
                }
            }
            this.r = true;
        }
    }
    
    @Override
    public final void a(final int n) {
        synchronized (this) {
            this.b = as.a.e;
            if (this.m < 2) {
                n.d("Service unavailable (code=" + n + "), will retry.");
                this.l();
            }
            else {
                n.d("Service unavailable (code=" + n + "), using local store.");
                this.g();
            }
        }
    }
    
    @Override
    public final void a(final Map<String, String> map, final long n, final String s, final List<ha> list) {
        n.c("putHit called");
        this.c.add(new d(map, n, s, list));
        this.f();
    }
    
    @Override
    public final void b() {
        switch (as$2.a[this.b - 1]) {
            default: {
                this.p = true;
            }
            case 1: {
                this.k();
            }
            case 2: {}
        }
    }
    
    @Override
    public final void c() {
        if (this.g == null) {
            this.g = new y(this.l, (y.b)this, (y.c)this);
            this.h();
        }
    }
    
    @Override
    public final void d() {
        synchronized (this) {
            this.o = a(this.o);
            this.m = 0;
            com.google.android.gms.b.n.c("Connected to service");
            this.b = as.a.b;
            if (this.r) {
                this.i();
                this.r = false;
            }
            else {
                this.f();
                this.d = a(this.d);
                (this.d = new Timer("disconnect check")).schedule(new b((byte)0), this.f);
            }
        }
    }
    
    @Override
    public final void e() {
        while (true) {
            Label_0058: {
                synchronized (this) {
                    if (this.b == as.a.d) {
                        com.google.android.gms.b.n.c("Service blocked.");
                        this.j();
                    }
                    else {
                        if (this.b != as.a.f) {
                            break Label_0058;
                        }
                        com.google.android.gms.b.n.c("Disconnected from service");
                        this.j();
                        this.b = as.a.g;
                    }
                    return;
                }
            }
            com.google.android.gms.b.n.c("Unexpected disconnect.");
            this.b = as.a.e;
            if (this.m < 2) {
                this.l();
                return;
            }
            this.g();
        }
    }
    
    final void f() {
        while (true) {
            Label_0436: {
                Label_0291: {
                Label_0273:
                    while (true) {
                        Label_0256: {
                            Label_0239: {
                                Label_0305: {
                                    synchronized (this) {
                                        if (!Thread.currentThread().equals(this.k.d())) {
                                            this.k.c().add(new Runnable() {
                                                @Override
                                                public final void run() {
                                                    as.this.f();
                                                }
                                            });
                                        }
                                        else {
                                            if (this.q) {
                                                com.google.android.gms.b.n.c("clearHits called");
                                                this.c.clear();
                                                switch (as$2.a[this.b - 1]) {
                                                    default: {
                                                        this.q = true;
                                                        break;
                                                    }
                                                    case 1: {
                                                        break Label_0239;
                                                    }
                                                    case 2: {
                                                        break Label_0256;
                                                    }
                                                }
                                            }
                                            switch (as$2.a[this.b - 1]) {
                                                case 1: {
                                                    while (!this.c.isEmpty()) {
                                                        final d obj = this.c.poll();
                                                        com.google.android.gms.b.n.c("Sending hit to store  " + obj);
                                                        this.h.a(obj.a, obj.b, obj.c, obj.d);
                                                    }
                                                    break Label_0291;
                                                }
                                                case 7: {
                                                    break Label_0273;
                                                }
                                                case 2: {
                                                    break Label_0305;
                                                }
                                                case 6: {
                                                    break Label_0436;
                                                }
                                            }
                                        }
                                        return;
                                    }
                                    break Label_0239;
                                }
                                while (!this.c.isEmpty()) {
                                    final d obj2 = this.c.peek();
                                    com.google.android.gms.b.n.c("Sending hit to service   " + obj2);
                                    final com.google.android.gms.b.c j = this.j;
                                    au.a().a(au.a.ad);
                                    if (!j.a) {
                                        this.g.a(obj2.a, obj2.b, obj2.c, obj2.d);
                                    }
                                    else {
                                        com.google.android.gms.b.n.c("Dry run enabled. Hit not actually sent to service.");
                                    }
                                    this.c.poll();
                                }
                                this.a = this.e.b();
                                return;
                            }
                            this.h.a();
                            this.q = false;
                            continue;
                        }
                        this.g.a();
                        this.q = false;
                        continue;
                    }
                    com.google.android.gms.b.n.c("Blocked. Dropping hits.");
                    this.c.clear();
                    return;
                }
                if (this.p) {
                    this.k();
                    return;
                }
                return;
            }
            com.google.android.gms.b.n.c("Need to reconnect");
            if (!this.c.isEmpty()) {
                this.h();
            }
        }
    }
    
    final void g() {
        while (true) {
            Label_0072: {
                synchronized (this) {
                    if (this.b != as.a.c) {
                        if (this.l == null || !"com.google.android.gms".equals(this.l.getPackageName())) {
                            break Label_0072;
                        }
                        this.b = as.a.d;
                        this.g.c();
                        com.google.android.gms.b.n.d("Attempted to fall back to local store from service.");
                    }
                    return;
                }
            }
            this.j();
            com.google.android.gms.b.n.c("falling back to local store");
            if (this.i != null) {
                this.h = this.i;
            }
            else {
                final ar c = ar.c();
                c.a(this.l, this.k);
                this.h = c.d();
            }
            this.b = as.a.c;
            this.f();
        }
    }
    
    final void h() {
        while (true) {
            synchronized (this) {
                if (!this.s && this.g != null && this.b != as.a.c) {
                    try {
                        ++this.m;
                        a(this.o);
                        this.b = as.a.a;
                        (this.o = new Timer("Failed Connect")).schedule(new c((byte)0), 3000L);
                        com.google.android.gms.b.n.c("connecting to Analytics service");
                        this.g.b();
                        return;
                    }
                    catch (SecurityException ex) {
                        com.google.android.gms.b.n.d("security exception on connectToService");
                        this.g();
                    }
                }
            }
            com.google.android.gms.b.n.d("client not initialized.");
            this.g();
        }
    }
    
    final void i() {
        synchronized (this) {
            if (this.g != null && this.b == as.a.b) {
                this.b = as.a.f;
                this.g.c();
            }
        }
    }
    
    private enum a
    {
        public static final int a;
        public static final int b;
        public static final int c;
        public static final int d;
        public static final int e;
        public static final int f;
        public static final int g;
        private static final /* synthetic */ int[] h;
        
        static {
            a = 1;
            b = 2;
            c = 3;
            d = 4;
            e = 5;
            f = 6;
            g = 7;
            h = new int[] { as.a.a, as.a.b, as.a.c, as.a.d, as.a.e, as.a.f, as.a.g };
        }
        
        public static int[] a() {
            return as.a.h.clone();
        }
    }
    
    private final class b extends TimerTask
    {
        @Override
        public final void run() {
            if (as.this.b == as.a.b && as.this.c.isEmpty() && as.this.a + as.this.f < as.this.e.b()) {
                com.google.android.gms.b.n.c("Disconnecting due to inactivity");
                as.this.i();
            }
            else {
                as.this.d.schedule(new b(), as.this.f);
            }
        }
    }
    
    private final class c extends TimerTask
    {
        @Override
        public final void run() {
            if (as.this.b == as.a.a) {
                as.this.g();
            }
        }
    }
    
    private static final class d
    {
        final Map<String, String> a;
        final long b;
        final String c;
        final List<ha> d;
        
        public d(final Map<String, String> a, final long b, final String c, final List<ha> d) {
            this.a = a;
            this.b = b;
            this.c = c;
            this.d = d;
        }
        
        @Override
        public final String toString() {
            final StringBuilder sb = new StringBuilder();
            sb.append("PATH: ");
            sb.append(this.c);
            if (this.a != null) {
                sb.append("  PARAMS: ");
                for (final Map.Entry<String, String> entry : this.a.entrySet()) {
                    sb.append(entry.getKey());
                    sb.append("=");
                    sb.append(entry.getValue());
                    sb.append(",  ");
                }
            }
            return sb.toString();
        }
    }
    
    private final class e extends TimerTask
    {
        @Override
        public final void run() {
            as.this.h();
        }
    }
}
