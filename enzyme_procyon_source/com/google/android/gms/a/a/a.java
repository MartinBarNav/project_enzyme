// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.a.a;

import java.util.concurrent.TimeUnit;
import java.lang.ref.WeakReference;
import java.util.concurrent.CountDownLatch;
import android.content.pm.PackageManager$NameNotFoundException;
import android.content.ServiceConnection;
import android.content.Intent;
import com.google.android.gms.common.c;
import android.os.IBinder;
import java.io.IOException;
import android.os.Looper;
import com.google.android.gms.internal.d;
import android.content.Context;
import com.google.android.gms.internal.h;
import com.google.android.gms.common.e;

public final class a
{
    e a;
    h b;
    boolean c;
    Object d;
    b e;
    final long f;
    private final Context g;
    
    private a(final Context g) {
        this.d = new Object();
        com.google.android.gms.internal.d.a(g);
        this.g = g;
        this.c = false;
        this.f = -1L;
    }
    
    public static a a(Context context) {
        context = (Context)new a(context);
        try {
            ((a)context).b();
            return ((a)context).c();
        }
        finally {
            ((a)context).a();
        }
    }
    
    private static h a(final e e) {
        try {
            if (Looper.myLooper() == Looper.getMainLooper()) {
                throw new IllegalStateException("BlockingServiceConnection.getService() called on main thread");
            }
        }
        catch (InterruptedException ex) {
            throw new IOException("Interrupted exception");
        }
        if (e.a) {
            throw new IllegalStateException();
        }
        e.a = true;
        return h.a.a(e.b.take());
    }
    
    private static e b(final Context context) {
        try {
            context.getPackageManager().getPackageInfo("com.android.vending", 0);
            final Context context2 = context;
            c.a(context2);
            final e e = new e();
            final String s = "com.google.android.gms.ads.identifier.service.START";
            final Intent intent = new Intent(s);
            final Intent intent3;
            final Intent intent2 = intent3 = intent;
            final String s2 = "com.google.android.gms";
            intent3.setPackage(s2);
            final Context context3 = context;
            final Intent intent4 = intent2;
            final Object o = e;
            final int n = 1;
            final boolean b = context3.bindService(intent4, (ServiceConnection)o, n);
            if (b) {
                return e;
            }
            throw new IOException("Connection failure");
        }
        catch (PackageManager$NameNotFoundException ex) {
            throw new a(9);
        }
        try {
            final Context context2 = context;
            c.a(context2);
            final e e = new e();
            final String s = "com.google.android.gms.ads.identifier.service.START";
            final Intent intent = new Intent(s);
            final Intent intent3;
            final Intent intent2 = intent3 = intent;
            final String s2 = "com.google.android.gms";
            intent3.setPackage(s2);
            final Context context3 = context;
            final Intent intent4 = intent2;
            final Object o = e;
            final int n = 1;
            final boolean b = context3.bindService(intent4, (ServiceConnection)o, n);
            if (b) {
                return e;
            }
        }
        catch (a cause) {
            throw new IOException(cause);
        }
        throw new IOException("Connection failure");
    }
    
    private void b() {
        com.google.android.gms.internal.d.a("Calling this from your main thread can lead to deadlock");
        synchronized (this) {
            if (this.c) {
                this.a();
            }
            this.a = b(this.g);
            this.b = a(this.a);
            this.c = true;
        }
    }
    
    private a c() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     2: invokestatic    com/google/android/gms/internal/d.a:(Ljava/lang/String;)V
        //     5: aload_0        
        //     6: monitorenter   
        //     7: aload_0        
        //     8: getfield        com/google/android/gms/a/a/a.c:Z
        //    11: ifne            99
        //    14: aload_0        
        //    15: getfield        com/google/android/gms/a/a/a.d:Ljava/lang/Object;
        //    18: astore_1       
        //    19: aload_1        
        //    20: monitorenter   
        //    21: aload_0        
        //    22: getfield        com/google/android/gms/a/a/a.e:Lcom/google/android/gms/a/a/a$b;
        //    25: ifnull          38
        //    28: aload_0        
        //    29: getfield        com/google/android/gms/a/a/a.e:Lcom/google/android/gms/a/a/a$b;
        //    32: getfield        com/google/android/gms/a/a/a$b.b:Z
        //    35: ifne            60
        //    38: new             Ljava/io/IOException;
        //    41: astore_2       
        //    42: aload_2        
        //    43: ldc             "AdvertisingIdClient is not connected."
        //    45: invokespecial   java/io/IOException.<init>:(Ljava/lang/String;)V
        //    48: aload_2        
        //    49: athrow         
        //    50: astore_2       
        //    51: aload_1        
        //    52: monitorexit    
        //    53: aload_2        
        //    54: athrow         
        //    55: astore_1       
        //    56: aload_0        
        //    57: monitorexit    
        //    58: aload_1        
        //    59: athrow         
        //    60: aload_1        
        //    61: monitorexit    
        //    62: aload_0        
        //    63: invokespecial   com/google/android/gms/a/a/a.b:()V
        //    66: aload_0        
        //    67: getfield        com/google/android/gms/a/a/a.c:Z
        //    70: ifne            99
        //    73: new             Ljava/io/IOException;
        //    76: astore_1       
        //    77: aload_1        
        //    78: ldc             "AdvertisingIdClient cannot reconnect."
        //    80: invokespecial   java/io/IOException.<init>:(Ljava/lang/String;)V
        //    83: aload_1        
        //    84: athrow         
        //    85: astore_2       
        //    86: new             Ljava/io/IOException;
        //    89: astore_1       
        //    90: aload_1        
        //    91: ldc             "AdvertisingIdClient cannot reconnect."
        //    93: aload_2        
        //    94: invokespecial   java/io/IOException.<init>:(Ljava/lang/String;Ljava/lang/Throwable;)V
        //    97: aload_1        
        //    98: athrow         
        //    99: aload_0        
        //   100: getfield        com/google/android/gms/a/a/a.a:Lcom/google/android/gms/common/e;
        //   103: invokestatic    com/google/android/gms/internal/d.a:(Ljava/lang/Object;)Ljava/lang/Object;
        //   106: pop            
        //   107: aload_0        
        //   108: getfield        com/google/android/gms/a/a/a.b:Lcom/google/android/gms/internal/h;
        //   111: invokestatic    com/google/android/gms/internal/d.a:(Ljava/lang/Object;)Ljava/lang/Object;
        //   114: pop            
        //   115: new             Lcom/google/android/gms/a/a/a$a;
        //   118: astore_2       
        //   119: aload_2        
        //   120: aload_0        
        //   121: getfield        com/google/android/gms/a/a/a.b:Lcom/google/android/gms/internal/h;
        //   124: invokeinterface com/google/android/gms/internal/h.a:()Ljava/lang/String;
        //   129: aload_0        
        //   130: getfield        com/google/android/gms/a/a/a.b:Lcom/google/android/gms/internal/h;
        //   133: iconst_1       
        //   134: invokeinterface com/google/android/gms/internal/h.a:(Z)Z
        //   139: invokespecial   com/google/android/gms/a/a/a$a.<init>:(Ljava/lang/String;Z)V
        //   142: aload_0        
        //   143: monitorexit    
        //   144: aload_0        
        //   145: getfield        com/google/android/gms/a/a/a.d:Ljava/lang/Object;
        //   148: astore_1       
        //   149: aload_1        
        //   150: monitorenter   
        //   151: aload_0        
        //   152: getfield        com/google/android/gms/a/a/a.e:Lcom/google/android/gms/a/a/a$b;
        //   155: ifnull          175
        //   158: aload_0        
        //   159: getfield        com/google/android/gms/a/a/a.e:Lcom/google/android/gms/a/a/a$b;
        //   162: getfield        com/google/android/gms/a/a/a$b.a:Ljava/util/concurrent/CountDownLatch;
        //   165: invokevirtual   java/util/concurrent/CountDownLatch.countDown:()V
        //   168: aload_0        
        //   169: getfield        com/google/android/gms/a/a/a.e:Lcom/google/android/gms/a/a/a$b;
        //   172: invokevirtual   com/google/android/gms/a/a/a$b.join:()V
        //   175: aload_0        
        //   176: getfield        com/google/android/gms/a/a/a.f:J
        //   179: lconst_0       
        //   180: lcmp           
        //   181: ifle            202
        //   184: new             Lcom/google/android/gms/a/a/a$b;
        //   187: astore_3       
        //   188: aload_3        
        //   189: aload_0        
        //   190: aload_0        
        //   191: getfield        com/google/android/gms/a/a/a.f:J
        //   194: invokespecial   com/google/android/gms/a/a/a$b.<init>:(Lcom/google/android/gms/a/a/a;J)V
        //   197: aload_0        
        //   198: aload_3        
        //   199: putfield        com/google/android/gms/a/a/a.e:Lcom/google/android/gms/a/a/a$b;
        //   202: aload_1        
        //   203: monitorexit    
        //   204: aload_2        
        //   205: areturn        
        //   206: astore_1       
        //   207: ldc             "AdvertisingIdClient"
        //   209: ldc             "GMS remote exception "
        //   211: aload_1        
        //   212: invokestatic    android/util/Log.i:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
        //   215: pop            
        //   216: new             Ljava/io/IOException;
        //   219: astore_1       
        //   220: aload_1        
        //   221: ldc             "Remote exception"
        //   223: invokespecial   java/io/IOException.<init>:(Ljava/lang/String;)V
        //   226: aload_1        
        //   227: athrow         
        //   228: astore_2       
        //   229: aload_1        
        //   230: monitorexit    
        //   231: aload_2        
        //   232: athrow         
        //   233: astore_3       
        //   234: goto            175
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                            
        //  -----  -----  -----  -----  --------------------------------
        //  7      21     55     60     Any
        //  21     38     50     55     Any
        //  38     50     50     55     Any
        //  51     53     50     55     Any
        //  53     55     55     60     Any
        //  56     58     55     60     Any
        //  60     62     50     55     Any
        //  62     66     85     99     Ljava/lang/Exception;
        //  62     66     55     60     Any
        //  66     85     55     60     Any
        //  86     99     55     60     Any
        //  99     115    55     60     Any
        //  115    142    206    228    Landroid/os/RemoteException;
        //  115    142    55     60     Any
        //  142    144    55     60     Any
        //  151    168    228    233    Any
        //  168    175    233    237    Ljava/lang/InterruptedException;
        //  168    175    228    233    Any
        //  175    202    228    233    Any
        //  202    204    228    233    Any
        //  207    228    55     60     Any
        //  229    231    228    233    Any
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index 134 out of bounds for length 134
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
    
    public final void a() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     2: invokestatic    com/google/android/gms/internal/d.a:(Ljava/lang/String;)V
        //     5: aload_0        
        //     6: monitorenter   
        //     7: aload_0        
        //     8: getfield        com/google/android/gms/a/a/a.g:Landroid/content/Context;
        //    11: ifnull          21
        //    14: aload_0        
        //    15: getfield        com/google/android/gms/a/a/a.a:Lcom/google/android/gms/common/e;
        //    18: ifnonnull       24
        //    21: aload_0        
        //    22: monitorexit    
        //    23: return         
        //    24: aload_0        
        //    25: getfield        com/google/android/gms/a/a/a.c:Z
        //    28: ifeq            42
        //    31: aload_0        
        //    32: getfield        com/google/android/gms/a/a/a.g:Landroid/content/Context;
        //    35: aload_0        
        //    36: getfield        com/google/android/gms/a/a/a.a:Lcom/google/android/gms/common/e;
        //    39: invokevirtual   android/content/Context.unbindService:(Landroid/content/ServiceConnection;)V
        //    42: aload_0        
        //    43: iconst_0       
        //    44: putfield        com/google/android/gms/a/a/a.c:Z
        //    47: aload_0        
        //    48: aconst_null    
        //    49: putfield        com/google/android/gms/a/a/a.b:Lcom/google/android/gms/internal/h;
        //    52: aload_0        
        //    53: aconst_null    
        //    54: putfield        com/google/android/gms/a/a/a.a:Lcom/google/android/gms/common/e;
        //    57: aload_0        
        //    58: monitorexit    
        //    59: goto            23
        //    62: astore_1       
        //    63: aload_0        
        //    64: monitorexit    
        //    65: aload_1        
        //    66: athrow         
        //    67: astore_1       
        //    68: ldc             "AdvertisingIdClient"
        //    70: ldc             "AdvertisingIdClient unbindService failed."
        //    72: aload_1        
        //    73: invokestatic    android/util/Log.i:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
        //    76: pop            
        //    77: goto            42
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                
        //  -----  -----  -----  -----  ------------------------------------
        //  7      21     62     67     Any
        //  21     23     62     67     Any
        //  24     42     67     80     Ljava/lang/IllegalArgumentException;
        //  24     42     62     67     Any
        //  42     59     62     67     Any
        //  63     65     62     67     Any
        //  68     77     62     67     Any
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0024:
        //     at com.strobel.decompiler.ast.Error.expressionLinkedFromMultipleLocations(Error.java:27)
        //     at com.strobel.decompiler.ast.AstOptimizer.mergeDisparateObjectInitializations(AstOptimizer.java:2596)
        //     at com.strobel.decompiler.ast.AstOptimizer.optimize(AstOptimizer.java:235)
        //     at com.strobel.decompiler.ast.AstOptimizer.optimize(AstOptimizer.java:42)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:214)
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
    
    @Override
    protected final void finalize() {
        this.a();
        super.finalize();
    }
    
    public static final class a
    {
        public final String a;
        public final boolean b;
        
        public a(final String a, final boolean b) {
            this.a = a;
            this.b = b;
        }
        
        @Override
        public final String toString() {
            return "{" + this.a + "}" + this.b;
        }
    }
    
    static final class b extends Thread
    {
        CountDownLatch a;
        boolean b;
        private WeakReference<a> c;
        private long d;
        
        public b(final a referent, final long d) {
            this.c = new WeakReference<a>(referent);
            this.d = d;
            this.a = new CountDownLatch(1);
            this.b = false;
            this.start();
        }
        
        private void a() {
            final a a = this.c.get();
            if (a != null) {
                a.a();
                this.b = true;
            }
        }
        
        @Override
        public final void run() {
            try {
                if (!this.a.await(this.d, TimeUnit.MILLISECONDS)) {
                    this.a();
                }
            }
            catch (InterruptedException ex) {
                this.a();
            }
        }
    }
}
