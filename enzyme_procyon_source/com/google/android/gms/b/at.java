// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.b;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Collection;
import java.util.Map;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.FileNotFoundException;
import java.io.OutputStream;
import java.io.PrintStream;
import java.io.ByteArrayOutputStream;
import android.text.TextUtils;
import java.util.concurrent.locks.ReentrantLock;
import java.util.ArrayList;
import com.google.android.gms.internal.ha;
import java.util.List;
import java.util.concurrent.locks.Lock;
import android.content.Context;
import java.util.concurrent.LinkedBlockingQueue;

final class at extends Thread implements ab
{
    private static at e;
    private final LinkedBlockingQueue<Runnable> a;
    private volatile boolean b;
    private volatile boolean c;
    private volatile String d;
    private volatile t f;
    private final Context g;
    private final Lock h;
    private final List<ha> i;
    
    private at(final Context g) {
        super("GAThread");
        this.a = new LinkedBlockingQueue<Runnable>();
        this.b = false;
        this.c = false;
        this.i = new ArrayList<ha>();
        if (g != null) {
            this.g = g.getApplicationContext();
        }
        else {
            this.g = g;
        }
        this.i.add(new ha("appendVersion", "&_v".substring(1), "ma4.0.4"));
        this.h = new ReentrantLock();
        this.start();
    }
    
    static int a(final String s) {
        int n = 1;
        if (!TextUtils.isEmpty((CharSequence)s)) {
            int length = s.length();
            int n2 = 0;
            --length;
            while (true) {
                n = n2;
                if (length < 0) {
                    break;
                }
                final char char1 = s.charAt(length);
                final int n3 = (n2 << 6 & 0xFFFFFFF) + char1 + (char1 << 14);
                final int n4 = 0xFE00000 & n3;
                n2 = n3;
                if (n4 != 0) {
                    n2 = (n3 ^ n4 >> 21);
                }
                --length;
            }
        }
        return n;
    }
    
    static at a(final Context context) {
        if (at.e == null) {
            at.e = new at(context);
        }
        return at.e;
    }
    
    private static String a(final Throwable t) {
        final ByteArrayOutputStream out = new ByteArrayOutputStream();
        final PrintStream s = new PrintStream(out);
        t.printStackTrace(s);
        s.flush();
        return new String(out.toByteArray());
    }
    
    private void a(final Runnable e) {
        this.a.add(e);
    }
    
    private static String b(Context o) {
        final Object o2 = null;
        try {
            final FileInputStream openFileInput = ((Context)o).openFileInput("gaInstallData");
            final int read = openFileInput.read(new byte[8192], 0, 8192);
            if (openFileInput.available() > 0) {
                n.a("Too much campaign data, ignoring it.");
                openFileInput.close();
                ((Context)o).deleteFile("gaInstallData");
                o = o2;
            }
            else {
                openFileInput.close();
                ((Context)o).deleteFile("gaInstallData");
                if (read > 0) {
                    goto Label_0090;
                }
                n.d("Campaign file is empty.");
                o = o2;
            }
            return (String)o;
        }
        catch (FileNotFoundException ex) {
            n.b("No campaign data found.");
            o = o2;
            return (String)o;
        }
        catch (IOException ex2) {
            n.a("Error reading campaign data.");
            ((Context)o).deleteFile("gaInstallData");
            o = o2;
            return (String)o;
        }
        return (String)o;
    }
    
    private void f() {
        synchronized (this) {
            if (this.f == null) {
                (this.f = new as(this.g, this)).c();
            }
        }
    }
    
    @Override
    public final void a() {
        this.a(new a((byte)0));
    }
    
    @Override
    public final void a(final Map<String, String> map) {
        this.a(new c(map));
    }
    
    @Override
    public final void b() {
        this.a(new b((byte)0));
    }
    
    @Override
    public final LinkedBlockingQueue<Runnable> c() {
        return this.a;
    }
    
    @Override
    public final Thread d() {
        return this;
    }
    
    @Override
    public final void e() {
        this.f();
        final ArrayList<Runnable> c = new ArrayList<Runnable>();
        this.a.drainTo(c);
        this.h.lock();
        try {
            this.b = true;
            for (final Runnable runnable : c) {
                try {
                    runnable.run();
                    continue;
                }
                catch (Throwable t) {
                    n.a("Error dispatching all events on exit, giving up: " + a(t));
                }
                break;
            }
        }
        finally {
            this.h.unlock();
        }
    }
    
    @Override
    public final void run() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     2: invokestatic    android/os/Process.setThreadPriority:(I)V
        //     5: ldc2_w          5000
        //     8: invokestatic    java/lang/Thread.sleep:(J)V
        //    11: aload_0        
        //    12: invokespecial   com/google/android/gms/b/at.f:()V
        //    15: aload_0        
        //    16: aload_0        
        //    17: getfield        com/google/android/gms/b/at.g:Landroid/content/Context;
        //    20: invokestatic    com/google/android/gms/b/at.b:(Landroid/content/Context;)Ljava/lang/String;
        //    23: putfield        com/google/android/gms/b/at.d:Ljava/lang/String;
        //    26: ldc_w           "Initialized GA Thread"
        //    29: invokestatic    com/google/android/gms/b/n.c:(Ljava/lang/String;)V
        //    32: aload_0        
        //    33: getfield        com/google/android/gms/b/at.c:Z
        //    36: ifne            193
        //    39: aload_0        
        //    40: getfield        com/google/android/gms/b/at.a:Ljava/util/concurrent/LinkedBlockingQueue;
        //    43: invokevirtual   java/util/concurrent/LinkedBlockingQueue.take:()Ljava/lang/Object;
        //    46: checkcast       Ljava/lang/Runnable;
        //    49: astore_1       
        //    50: aload_0        
        //    51: getfield        com/google/android/gms/b/at.h:Ljava/util/concurrent/locks/Lock;
        //    54: invokeinterface java/util/concurrent/locks/Lock.lock:()V
        //    59: aload_0        
        //    60: getfield        com/google/android/gms/b/at.b:Z
        //    63: ifne            72
        //    66: aload_1        
        //    67: invokeinterface java/lang/Runnable.run:()V
        //    72: aload_0        
        //    73: getfield        com/google/android/gms/b/at.h:Ljava/util/concurrent/locks/Lock;
        //    76: invokeinterface java/util/concurrent/locks/Lock.unlock:()V
        //    81: goto            32
        //    84: astore_1       
        //    85: aload_1        
        //    86: invokevirtual   java/lang/InterruptedException.toString:()Ljava/lang/String;
        //    89: invokestatic    com/google/android/gms/b/n.b:(Ljava/lang/String;)V
        //    92: goto            32
        //    95: astore_1       
        //    96: new             Ljava/lang/StringBuilder;
        //    99: dup            
        //   100: ldc_w           "Error on GAThread: "
        //   103: invokespecial   java/lang/StringBuilder.<init>:(Ljava/lang/String;)V
        //   106: aload_1        
        //   107: invokestatic    com/google/android/gms/b/at.a:(Ljava/lang/Throwable;)Ljava/lang/String;
        //   110: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   113: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   116: invokestatic    com/google/android/gms/b/n.a:(Ljava/lang/String;)V
        //   119: ldc_w           "Google Analytics is shutting down."
        //   122: invokestatic    com/google/android/gms/b/n.a:(Ljava/lang/String;)V
        //   125: aload_0        
        //   126: iconst_1       
        //   127: putfield        com/google/android/gms/b/at.b:Z
        //   130: goto            32
        //   133: astore_1       
        //   134: ldc_w           "sleep interrupted in GAThread initialize"
        //   137: invokestatic    com/google/android/gms/b/n.d:(Ljava/lang/String;)V
        //   140: goto            11
        //   143: astore_1       
        //   144: new             Ljava/lang/StringBuilder;
        //   147: dup            
        //   148: ldc_w           "Error initializing the GAThread: "
        //   151: invokespecial   java/lang/StringBuilder.<init>:(Ljava/lang/String;)V
        //   154: aload_1        
        //   155: invokestatic    com/google/android/gms/b/at.a:(Ljava/lang/Throwable;)Ljava/lang/String;
        //   158: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   161: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   164: invokestatic    com/google/android/gms/b/n.a:(Ljava/lang/String;)V
        //   167: ldc_w           "Google Analytics will not start up."
        //   170: invokestatic    com/google/android/gms/b/n.a:(Ljava/lang/String;)V
        //   173: aload_0        
        //   174: iconst_1       
        //   175: putfield        com/google/android/gms/b/at.b:Z
        //   178: goto            32
        //   181: astore_1       
        //   182: aload_0        
        //   183: getfield        com/google/android/gms/b/at.h:Ljava/util/concurrent/locks/Lock;
        //   186: invokeinterface java/util/concurrent/locks/Lock.unlock:()V
        //   191: aload_1        
        //   192: athrow         
        //   193: return         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                            
        //  -----  -----  -----  -----  --------------------------------
        //  5      11     133    143    Ljava/lang/InterruptedException;
        //  11     32     143    181    Ljava/lang/Throwable;
        //  39     59     84     95     Ljava/lang/InterruptedException;
        //  39     59     95     133    Ljava/lang/Throwable;
        //  59     72     181    193    Any
        //  72     81     84     95     Ljava/lang/InterruptedException;
        //  72     81     95     133    Ljava/lang/Throwable;
        //  85     92     95     133    Ljava/lang/Throwable;
        //  182    193    84     95     Ljava/lang/InterruptedException;
        //  182    193    95     133    Ljava/lang/Throwable;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index 81 out of bounds for length 81
        //     at java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
        //     at java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
        //     at java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:248)
        //     at java.base/java.util.Objects.checkIndex(Objects.java:372)
        //     at java.base/java.util.ArrayList.get(ArrayList.java:458)
        //     at com.strobel.decompiler.ast.AstBuilder.convertToAst(AstBuilder.java:3321)
        //     at com.strobel.decompiler.ast.AstBuilder.build(AstBuilder.java:113)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:211)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:99)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethodBody(AstBuilder.java:782)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethod(AstBuilder.java:675)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addTypeMembers(AstBuilder.java:552)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeCore(AstBuilder.java:519)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeNoCache(AstBuilder.java:161)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createType(AstBuilder.java:150)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addType(AstBuilder.java:125)
        //     at com.strobel.decompiler.languages.java.JavaLanguage.buildAst(JavaLanguage.java:71)
        //     at com.strobel.decompiler.languages.java.JavaLanguage.decompileType(JavaLanguage.java:59)
        //     at com.strobel.decompiler.DecompilerDriver.decompileType(DecompilerDriver.java:330)
        //     at com.strobel.decompiler.DecompilerDriver.decompileJar(DecompilerDriver.java:251)
        //     at com.strobel.decompiler.DecompilerDriver.main(DecompilerDriver.java:126)
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    private final class a implements Runnable
    {
        @Override
        public final void run() {
            at.this.f.b();
        }
    }
    
    private final class b implements Runnable
    {
        @Override
        public final void run() {
            at.this.f.a();
        }
    }
    
    private final class c implements Runnable
    {
        private final Map<String, String> b;
        
        c(final Map<String, String> m) {
            this.b = new HashMap<String, String>(m);
            String s2;
            final String s = s2 = m.get("&ht");
            while (true) {
                if (s == null) {
                    break Label_0046;
                }
                try {
                    Long.valueOf(s);
                    s2 = s;
                    if (s2 == null) {
                        this.b.put("&ht", Long.toString(System.currentTimeMillis()));
                    }
                }
                catch (NumberFormatException ex) {
                    s2 = null;
                    continue;
                }
                break;
            }
        }
        
        @Override
        public final void run() {
            final Map<String, String> b = this.b;
            final am a = com.google.android.gms.b.i.a(at.this.g);
            w.a(b, "&adid", a);
            w.a(b, "&ate", a);
            if (TextUtils.isEmpty((CharSequence)this.b.get("&cid"))) {
                this.b.put("&cid", ag.a().a("&cid"));
            }
            final com.google.android.gms.b.c a2 = com.google.android.gms.b.c.a(at.this.g);
            au.a().a(au.a.R);
            if (!a2.e) {
                final Map<String, String> b2 = this.b;
                while (true) {
                    Label_0221: {
                        if (b2.get("&sf") == null) {
                            break Label_0221;
                        }
                        final double b3 = w.b(b2.get("&sf"));
                        if (b3 >= 100.0 || at.a(b2.get("&cid")) % 10000 < b3 * 100.0) {
                            break Label_0221;
                        }
                        String s;
                        if (b2.get("&t") == null) {
                            s = "unknown";
                        }
                        else {
                            s = b2.get("&t");
                        }
                        n.c(String.format("%s hit sampled out", s));
                        final int n = 1;
                        if (n != 0) {
                            return;
                        }
                        if (!TextUtils.isEmpty((CharSequence)at.this.d)) {
                            au.a().a(true);
                            final Map<String, String> b4 = this.b;
                            final d.d d = new d.d();
                            final String b5 = at.this.d;
                            au.a().a(au.a.d);
                            final String d2 = w.d(b5);
                            if (!TextUtils.isEmpty((CharSequence)d2)) {
                                final Map<String, String> a3 = w.a(d2);
                                d.a("&cc", a3.get("utm_content"));
                                d.a("&cm", a3.get("utm_medium"));
                                d.a("&cn", a3.get("utm_campaign"));
                                d.a("&cs", a3.get("utm_source"));
                                d.a("&ck", a3.get("utm_term"));
                                d.a("&ci", a3.get("utm_id"));
                                d.a("&gclid", a3.get("gclid"));
                                d.a("&dclid", a3.get("dclid"));
                                d.a("&gmob_t", a3.get("gmob_t"));
                            }
                            b4.putAll(d.a());
                            au.a().a(false);
                            at.this.d = null;
                        }
                        final Map<String, String> b6 = this.b;
                        final ac a4 = ac.a();
                        w.a(b6, "&an", a4);
                        w.a(b6, "&av", a4);
                        w.a(b6, "&aid", a4);
                        w.a(b6, "&aiid", a4);
                        b6.put("&v", "1");
                        final Map<String, String> b7 = this.b;
                        final HashMap<String, String> hashMap = new HashMap<String, String>();
                        for (final Map.Entry<String, String> entry : b7.entrySet()) {
                            if (entry.getKey().startsWith("&") && entry.getValue() != null) {
                                final String substring = entry.getKey().substring(1);
                                if (TextUtils.isEmpty((CharSequence)substring)) {
                                    continue;
                                }
                                hashMap.put(substring, (V)entry.getValue());
                            }
                        }
                        final t e = at.this.f;
                        final long longValue = Long.valueOf(this.b.get("&ht"));
                        final Map<String, String> b8 = this.b;
                        String s2;
                        if (b8.containsKey("useSecure") && !w.c(b8.get("useSecure"))) {
                            s2 = "http:";
                        }
                        else {
                            s2 = "https:";
                        }
                        e.a(hashMap, longValue, s2, at.this.i);
                        return;
                    }
                    final int n = 0;
                    continue;
                }
            }
        }
    }
}
