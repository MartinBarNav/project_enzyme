/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.os.Process
 *  android.text.TextUtils
 */
package com.google.android.gms.b;

import android.content.Context;
import android.os.Process;
import android.text.TextUtils;
import com.google.android.gms.b.ab;
import com.google.android.gms.b.ac;
import com.google.android.gms.b.ag;
import com.google.android.gms.b.am;
import com.google.android.gms.b.as;
import com.google.android.gms.b.au;
import com.google.android.gms.b.d;
import com.google.android.gms.b.i;
import com.google.android.gms.b.n;
import com.google.android.gms.b.t;
import com.google.android.gms.b.w;
import com.google.android.gms.internal.ha;
import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

final class at
extends Thread
implements ab {
    private static at e;
    private final LinkedBlockingQueue<Runnable> a = new LinkedBlockingQueue();
    private volatile boolean b = false;
    private volatile boolean c = false;
    private volatile String d;
    private volatile t f;
    private final Context g;
    private final Lock h;
    private final List<ha> i = new ArrayList<ha>();

    /*
     * Enabled aggressive block sorting
     */
    private at(Context context) {
        super("GAThread");
        this.g = context != null ? context.getApplicationContext() : context;
        this.i.add(new ha("appendVersion", "&_v".substring(1), "ma4.0.4"));
        this.h = new ReentrantLock();
        this.start();
    }

    static int a(String string) {
        int n2 = 1;
        if (!TextUtils.isEmpty((CharSequence)string)) {
            int n3 = string.length();
            int n4 = 0;
            --n3;
            while (true) {
                n2 = n4;
                if (n3 < 0) break;
                n2 = string.charAt(n3);
                n2 = (n4 << 6 & 0xFFFFFFF) + n2 + (n2 << 14);
                int n5 = 0xFE00000 & n2;
                n4 = n2;
                if (n5 != 0) {
                    n4 = n2 ^ n5 >> 21;
                }
                --n3;
            }
        }
        return n2;
    }

    static at a(Context context) {
        if (e == null) {
            e = new at(context);
        }
        return e;
    }

    private static String a(Throwable throwable) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        PrintStream printStream = new PrintStream(byteArrayOutputStream);
        throwable.printStackTrace(printStream);
        printStream.flush();
        return new String(byteArrayOutputStream.toByteArray());
    }

    private void a(Runnable runnable) {
        this.a.add(runnable);
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static String b(Context object) {
        int n2;
        Object object2;
        Object object3;
        Object var1_2 = null;
        try {
            object3 = object.openFileInput("gaInstallData");
            object2 = new byte[8192];
            n2 = ((FileInputStream)object3).read((byte[])object2, 0, 8192);
            if (((FileInputStream)object3).available() > 0) {
                n.a("Too much campaign data, ignoring it.");
                ((FileInputStream)object3).close();
                object.deleteFile("gaInstallData");
                return var1_2;
            }
            ((FileInputStream)object3).close();
            object.deleteFile("gaInstallData");
            if (n2 <= 0) {
                n.d("Campaign file is empty.");
                return var1_2;
            }
        }
        catch (FileNotFoundException fileNotFoundException) {
            n.b("No campaign data found.");
            return var1_2;
        }
        catch (IOException iOException) {
            n.a("Error reading campaign data.");
            object.deleteFile("gaInstallData");
            return var1_2;
        }
        {
            object3 = new String((byte[])object2, 0, n2);
            object2 = new StringBuilder;
            ((StringBuilder)object2)("Campaign found: ");
            n.b(((StringBuilder)object2).append((String)object3).toString());
            return object3;
        }
    }

    static /* synthetic */ String c(at at2) {
        at2.d = null;
        return null;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private void f() {
        synchronized (this) {
            t t2;
            block6: {
                t2 = this.f;
                if (t2 == null) break block6;
                return;
            }
            this.f = t2 = new as(this.g, this);
            this.f.c();
            return;
        }
    }

    @Override
    public final void a() {
        this.a(new a(0));
    }

    @Override
    public final void a(Map<String, String> map) {
        this.a(new c(this, map));
    }

    @Override
    public final void b() {
        this.a(new b(0));
    }

    @Override
    public final LinkedBlockingQueue<Runnable> c() {
        return this.a;
    }

    @Override
    public final Thread d() {
        return this;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public final void e() {
        this.f();
        Object object = new ArrayList();
        this.a.drainTo((Collection<Runnable>)object);
        this.h.lock();
        try {
            this.b = true;
            Object object2 = object.iterator();
            while (object2.hasNext()) {
                object = (Runnable)object2.next();
                try {
                    object.run();
                }
                catch (Throwable throwable) {
                    object2 = new StringBuilder("Error dispatching all events on exit, giving up: ");
                    n.a(((StringBuilder)object2).append(at.a(throwable)).toString());
                    return;
                }
            }
            return;
        }
        finally {
            this.h.unlock();
        }
    }

    /*
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    @Override
    public final void run() {
        Process.setThreadPriority((int)10);
        try {
            Thread.sleep(5000L);
        }
        catch (InterruptedException interruptedException) {
            n.d("sleep interrupted in GAThread initialize");
        }
        try {
            this.f();
            this.d = at.b(this.g);
            n.c("Initialized GA Thread");
        }
        catch (Throwable throwable) {
            n.a("Error initializing the GAThread: " + at.a(throwable));
            n.a("Google Analytics will not start up.");
            this.b = true;
        }
        while (!this.c) {
            block13: {
                Runnable runnable = this.a.take();
                this.h.lock();
                if (this.b) break block13;
                runnable.run();
            }
            this.h.unlock();
            catch (Throwable throwable) {
                try {
                    this.h.unlock();
                    throw throwable;
                }
                catch (InterruptedException interruptedException) {
                    n.b(interruptedException.toString());
                }
            }
            continue;
            {
                catch (Throwable throwable) {
                    n.a("Error on GAThread: " + at.a(throwable));
                    n.a("Google Analytics is shutting down.");
                    this.b = true;
                }
            }
        }
    }

    private final class a
    implements Runnable {
        private a() {
        }

        /* synthetic */ a(byte by) {
            this();
        }

        @Override
        public final void run() {
            at.this.f.b();
        }
    }

    private final class b
    implements Runnable {
        private b() {
        }

        /* synthetic */ b(byte by) {
            this();
        }

        @Override
        public final void run() {
            at.this.f.a();
        }
    }

    private static final class c
    implements Runnable {
        final /* synthetic */ at a;
        private final Map<String, String> b;

        /*
         * Enabled aggressive block sorting
         * Enabled unnecessary exception pruning
         * Enabled aggressive exception aggregation
         */
        c(at object, Map<String, String> object2) {
            this.a = object;
            this.b = new HashMap<String, String>((Map<String, String>)object2);
            object = object2 = (String)object2.get("&ht");
            if (object2 != null) {
                try {
                    Long.valueOf((String)object2);
                    object = object2;
                }
                catch (NumberFormatException numberFormatException) {
                    object = null;
                }
            }
            if (object == null) {
                long l2 = System.currentTimeMillis();
                this.b.put("&ht", Long.toString(l2));
            }
        }

        /*
         * Enabled aggressive block sorting
         */
        @Override
        public final void run() {
            double d2;
            Map<String, String> map = this.b;
            HashMap<String, String> hashMap = com.google.android.gms.b.i.a(this.a.g);
            w.a(map, "&adid", (am)((Object)hashMap));
            w.a(map, "&ate", (am)((Object)hashMap));
            if (TextUtils.isEmpty((CharSequence)this.b.get("&cid"))) {
                this.b.put("&cid", ag.a().a("&cid"));
            }
            map = com.google.android.gms.b.c.a(this.a.g);
            au.a().a(au.a.R);
            if (((com.google.android.gms.b.c)map).e != false) return;
            map = this.b;
            if (map.get("&sf") != null && !((d2 = w.b(map.get("&sf"))) >= 100.0) && (double)(at.a(map.get("&cid")) % 10000) >= d2 * 100.0) {
                map = map.get("&t") == null ? "unknown" : map.get("&t");
                n.c(String.format("%s hit sampled out", map));
                return;
            }
            boolean bl = false;
            if (bl) {
                return;
            }
            if (!TextUtils.isEmpty((CharSequence)this.a.d)) {
                au.a().a(true);
                map = this.b;
                hashMap = new d.d();
                String string = this.a.d;
                au.a().a(au.a.d);
                String string2 = w.d(string);
                if (!TextUtils.isEmpty((CharSequence)string2)) {
                    Map<String, String> map2 = w.a(string2);
                    ((d.d)((Object)hashMap)).a("&cc", map2.get("utm_content"));
                    ((d.d)((Object)hashMap)).a("&cm", map2.get("utm_medium"));
                    ((d.d)((Object)hashMap)).a("&cn", map2.get("utm_campaign"));
                    ((d.d)((Object)hashMap)).a("&cs", map2.get("utm_source"));
                    ((d.d)((Object)hashMap)).a("&ck", map2.get("utm_term"));
                    ((d.d)((Object)hashMap)).a("&ci", map2.get("utm_id"));
                    ((d.d)((Object)hashMap)).a("&gclid", map2.get("gclid"));
                    ((d.d)((Object)hashMap)).a("&dclid", map2.get("dclid"));
                    ((d.d)((Object)hashMap)).a("&gmob_t", map2.get("gmob_t"));
                }
                map.putAll(((d.d)((Object)hashMap)).a());
                au.a().a(false);
                at.c(this.a);
            }
            map = this.b;
            hashMap = ac.a();
            w.a(map, "&an", (am)((Object)hashMap));
            w.a(map, "&av", (am)((Object)hashMap));
            w.a(map, "&aid", (am)((Object)hashMap));
            w.a(map, "&aiid", (am)((Object)hashMap));
            map.put("&v", "1");
            map = this.b;
            hashMap = new HashMap<String, String>();
            for (Map.Entry entry : map.entrySet()) {
                String string;
                if (!((String)entry.getKey()).startsWith("&") || entry.getValue() == null || TextUtils.isEmpty((CharSequence)(string = ((String)entry.getKey()).substring(1)))) continue;
                hashMap.put(string, (String)entry.getValue());
            }
            t t2 = this.a.f;
            long l2 = Long.valueOf(this.b.get("&ht"));
            map = this.b;
            map = map.containsKey("useSecure") && !w.c(map.get("useSecure")) ? "http:" : "https:";
            t2.a(hashMap, l2, (String)((Object)map), this.a.i);
        }
    }
}

