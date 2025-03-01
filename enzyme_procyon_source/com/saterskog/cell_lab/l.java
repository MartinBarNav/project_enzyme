// 
// Decompiled by Procyon v0.5.36
// 

package com.saterskog.cell_lab;

import android.app.FragmentManager;
import java.io.FileOutputStream;
import java.io.InputStream;
import android.net.Uri;
import android.content.SharedPreferences;
import android.support.v4.view.PagerTabStrip;
import android.support.v4.view.p;
import java.util.Arrays;
import android.widget.Toast;
import android.os.RemoteException;
import android.os.IBinder;
import android.content.ComponentName;
import android.content.ServiceConnection;
import android.preference.PreferenceManager;
import android.os.Bundle;
import android.content.Intent;
import com.saterskog.a.e;
import com.saterskog.a.d;
import com.saterskog.a.c;
import java.util.List;
import android.os.Handler;
import java.util.ArrayList;
import android.app.Fragment;
import android.content.Context;
import android.media.SoundPool$Builder;
import android.os.Build$VERSION;
import android.media.SoundPool;
import android.media.MediaPlayer;
import android.support.v4.view.ViewPager;
import com.saterskog.a.b;
import android.app.Activity;

public abstract class l extends Activity implements b.b, d, f, s.a
{
    a a;
    b b;
    ViewPager c;
    MediaPlayer d;
    boolean e;
    SoundPool f;
    int[] g;
    protected com.saterskog.cell_lab.a h;
    String[] i;
    public boolean[] j;
    public String[] k;
    private int l;
    
    public l() {
        this.g = new int[5];
        this.i = new String[] { "donate_small", "donation_medium", "donation_large" };
    }
    
    private void b() {
        if (Build$VERSION.SDK_INT >= 21) {
            this.f = new SoundPool$Builder().setMaxStreams(3).build();
        }
        else {
            this.f = new SoundPool(3, 3, 0);
        }
        if (this.e) {
            this.g[1] = this.f.load((Context)this, 2131558446, 1);
            this.g[0] = this.f.load((Context)this, 2131558408, 1);
            this.g[2] = this.f.load((Context)this, 2131558445, 1);
            this.g[4] = this.f.load((Context)this, 2131558409, 1);
            this.g[3] = this.f.load((Context)this, 2131558424, 1);
        }
    }
    
    abstract Fragment a(final int p0);
    
    public final void a() {
        final ArrayList<String> list = new ArrayList<String>();
        final String[] i = this.i;
        for (int length = i.length, j = 0; j < length; ++j) {
            list.add(i[j]);
        }
        try {
            final b b = this.b;
            final Handler handler = new Handler();
            b.b();
            b.a("queryInventory");
            b.b("refresh inventory");
            new Thread(new Runnable() {
                final /* synthetic */ boolean a;
                final /* synthetic */ List b = list;
                final /* synthetic */ List c;
                final /* synthetic */ f d = this;
                
                @Override
                public final void run() {
                    com.saterskog.a.c a = new com.saterskog.a.c(0, "Inventory refresh successful.");
                    com.saterskog.a.d a2 = null;
                    while (true) {
                        try {
                            a2 = b.a(this.a, this.b, this.c);
                            b.c();
                            if (!b.d && this.d != null) {
                                handler.post((Runnable)new Runnable() {
                                    @Override
                                    public final void run() {
                                        Runnable.this.d.a(a, a2);
                                    }
                                });
                            }
                        }
                        catch (com.saterskog.a.a a3) {
                            a = a3.a;
                            continue;
                        }
                        break;
                    }
                }
            }).start();
        }
        catch (com.saterskog.a.b.a a) {
            com.saterskog.b.a.a("Couldn't query IAB", a);
        }
        catch (IllegalStateException ex) {
            com.saterskog.b.a.a("Couldn't query IAB, Illegal state", ex);
        }
        catch (NullPointerException ex2) {
            com.saterskog.b.a.a("Nullpointer", ex2);
        }
    }
    
    public final void a(final com.saterskog.a.c c, final com.saterskog.a.d d) {
        if (c.b()) {
            com.saterskog.b.a.b("IAP failed, 271.");
        }
        else {
            this.j = new boolean[this.i.length];
            this.k = new String[this.i.length];
            for (int i = 0; i < this.i.length; ++i) {
                this.j[i] = d.b(this.i[i]);
            Label_0108:
                while (true) {
                    if (!d.b(this.i[i])) {
                        break Label_0108;
                    }
                    while (true) {
                        while (true) {
                            try {
                                this.b.a(d.b.get(this.i[i]), (b.b)this);
                                if (d.a(this.i[i]) == null) {
                                    this.k[i] = "no connection";
                                    break;
                                }
                            }
                            catch (com.saterskog.a.b.a a) {
                                com.saterskog.b.a.a("couldn't consume donation 2", a);
                                continue Label_0108;
                            }
                            this.k[i] = d.a(this.i[i]).b;
                            continue;
                        }
                    }
                    break;
                }
            }
            com.saterskog.b.a.b("calling af.updateDonation(0);...");
            if (this.h != null) {
                this.h.a();
            }
        }
    }
    
    public final void a(final com.saterskog.a.c p0, final com.saterskog.a.e p1) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     2: invokestatic    com/saterskog/b/a.b:(Ljava/lang/String;)V
        //     5: aload_1        
        //     6: invokevirtual   com/saterskog/a/c.b:()Z
        //     9: ifeq            18
        //    12: ldc             "IAP failed, 271."
        //    14: invokestatic    com/saterskog/b/a.b:(Ljava/lang/String;)V
        //    17: return         
        //    18: aload_0        
        //    19: getfield        com/saterskog/cell_lab/l.i:[Ljava/lang/String;
        //    22: astore_1       
        //    23: aload_1        
        //    24: arraylength    
        //    25: istore_3       
        //    26: iconst_0       
        //    27: istore          4
        //    29: iload           4
        //    31: iload_3        
        //    32: if_icmpge       17
        //    35: aload_1        
        //    36: iload           4
        //    38: aaload         
        //    39: astore          5
        //    41: aload_2        
        //    42: getfield        com/saterskog/a/e.d:Ljava/lang/String;
        //    45: aload           5
        //    47: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //    50: ifeq            67
        //    53: ldc             "launching consume"
        //    55: invokestatic    com/saterskog/b/a.b:(Ljava/lang/String;)V
        //    58: aload_0        
        //    59: getfield        com/saterskog/cell_lab/l.b:Lcom/saterskog/a/b;
        //    62: aload_2        
        //    63: aload_0        
        //    64: invokevirtual   com/saterskog/a/b.a:(Lcom/saterskog/a/e;Lcom/saterskog/a/b$b;)V
        //    67: iinc            4, 1
        //    70: goto            29
        //    73: astore          5
        //    75: ldc             "couldn't consume donation"
        //    77: aload           5
        //    79: invokestatic    com/saterskog/b/a.a:(Ljava/lang/String;Ljava/lang/Throwable;)V
        //    82: goto            67
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                 
        //  -----  -----  -----  -----  ---------------------
        //  53     67     73     85     Lcom/saterskog/a/b$a;
        // 
        // The error that occurred was:
        // 
        // java.lang.NullPointerException
        //     at com.strobel.assembler.ir.StackMappingVisitor.push(StackMappingVisitor.java:290)
        //     at com.strobel.assembler.ir.StackMappingVisitor$InstructionAnalyzer.execute(StackMappingVisitor.java:833)
        //     at com.strobel.assembler.ir.StackMappingVisitor$InstructionAnalyzer.visit(StackMappingVisitor.java:398)
        //     at com.strobel.decompiler.ast.AstBuilder.performStackAnalysis(AstBuilder.java:2030)
        //     at com.strobel.decompiler.ast.AstBuilder.build(AstBuilder.java:108)
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
    
    public final void a(final com.saterskog.a.e p0, final com.saterskog.a.c p1) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     2: invokestatic    com/saterskog/b/a.b:(Ljava/lang/String;)V
        //     5: aload_2        
        //     6: invokevirtual   com/saterskog/a/c.a:()Z
        //     9: ifeq            121
        //    12: ldc             "cosnume is success"
        //    14: invokestatic    com/saterskog/b/a.b:(Ljava/lang/String;)V
        //    17: aconst_null    
        //    18: astore_2       
        //    19: aload_0        
        //    20: ldc             "consumptions"
        //    22: ldc             32768
        //    24: invokevirtual   com/saterskog/cell_lab/l.openFileOutput:(Ljava/lang/String;I)Ljava/io/FileOutputStream;
        //    27: astore_3       
        //    28: aload_3        
        //    29: astore_2       
        //    30: new             Ljava/io/BufferedWriter;
        //    33: dup            
        //    34: new             Ljava/io/OutputStreamWriter;
        //    37: dup            
        //    38: aload_2        
        //    39: invokespecial   java/io/OutputStreamWriter.<init>:(Ljava/io/OutputStream;)V
        //    42: invokespecial   java/io/BufferedWriter.<init>:(Ljava/io/Writer;)V
        //    45: astore          4
        //    47: aload           4
        //    49: invokevirtual   java/io/BufferedWriter.newLine:()V
        //    52: aload           4
        //    54: aload_1        
        //    55: getfield        com/saterskog/a/e.g:Ljava/lang/String;
        //    58: invokevirtual   java/io/BufferedWriter.write:(Ljava/lang/String;)V
        //    61: new             Ljava/lang/StringBuilder;
        //    64: astore_3       
        //    65: aload_3        
        //    66: ldc             "wrote payload: "
        //    68: invokespecial   java/lang/StringBuilder.<init>:(Ljava/lang/String;)V
        //    71: aload_3        
        //    72: aload_1        
        //    73: getfield        com/saterskog/a/e.g:Ljava/lang/String;
        //    76: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    79: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //    82: invokestatic    com/saterskog/b/a.b:(Ljava/lang/String;)V
        //    85: aload           4
        //    87: invokevirtual   java/io/BufferedWriter.close:()V
        //    90: aload_2        
        //    91: invokevirtual   java/io/FileOutputStream.close:()V
        //    94: aload_0        
        //    95: invokevirtual   com/saterskog/cell_lab/l.a:()V
        //    98: return         
        //    99: astore_3       
        //   100: ldc_w           "onConsumeFinished"
        //   103: aload_3        
        //   104: invokestatic    com/saterskog/b/a.a:(Ljava/lang/String;Ljava/lang/Throwable;)V
        //   107: goto            30
        //   110: astore_1       
        //   111: ldc_w           "onConsumeFinished2"
        //   114: aload_1        
        //   115: invokestatic    com/saterskog/b/a.a:(Ljava/lang/String;Ljava/lang/Throwable;)V
        //   118: goto            94
        //   121: ldc_w           "received erroneous consumption"
        //   124: invokestatic    com/saterskog/b/a.b:(Ljava/lang/String;)V
        //   127: goto            94
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                           
        //  -----  -----  -----  -----  -------------------------------
        //  19     28     99     110    Ljava/io/FileNotFoundException;
        //  47     94     110    121    Ljava/io/IOException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0094:
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
    
    public final void a(final short n) {
        if (this.e) {
            if (this.f == null) {
                this.b();
            }
            this.f.play(this.g[n], 1.0f, 1.0f, 1, 0, 1.0f);
        }
    }
    
    public final void a(final boolean b) {
        if (b) {
            if (this.d != null) {
                this.d.seekTo(this.l);
                this.d.start();
            }
            else {
                (this.d = MediaPlayer.create((Context)this, 2131558435)).setLooping(true);
                this.d.setVolume(0.5f, 0.5f);
                this.d.start();
            }
        }
        else if (this.d != null) {
            this.d.pause();
            this.l = this.d.getCurrentPosition();
        }
    }
    
    abstract String b(final int p0);
    
    public final void b(final boolean e) {
        this.e = e;
    }
    
    protected void onActivityResult(final int i, final int j, final Intent obj) {
        com.saterskog.b.a.b("onActivityResult(" + i + "," + j + "," + obj);
        if (!this.b.a(i, j, obj)) {
            super.onActivityResult(i, j, obj);
            switch (i) {
                case 1: {
                    if (j == -1 && obj.getIntExtra("go_to_donate", 0) == 1) {
                        this.c.setCurrentItem(4);
                        break;
                    }
                    break;
                }
            }
        }
        else {
            com.saterskog.b.a.b("onActivityResult handled by IABUtil.");
        }
    }
    
    protected void onCreate(final Bundle bundle) {
        int i = 0;
        super.onCreate(bundle);
        CellLabApplication.a(this);
        this.getWindow().addFlags(1024);
        this.setContentView(2131361819);
        final SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences((Context)this);
        this.e = defaultSharedPreferences.getBoolean("sound_effects", true);
        this.b = new b((Context)this, "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAhQlFw2sfDBGp4kmVU3x8xZOD3xp9wKzCsChUMUZUjr9HLgEmBZl8yXJ8K8NDL3WH+B657+1ABfHm4+J6OcwZU/a0h38Sb6GCsO8Fr4ToWMpbhoQAr8GKJZkWtygOwzACIk5QHAiAiCXnbb90ufK4wmpXlQfP2DQCCihRhIuU2Z1vcqeMTRd+oyC76ltRnCntW4WI8YH09SZYJfOwfTYHR01C9TeSoM2TWBAfn+mdMcRHVkssGrPaZjtmW7x86u3v/bAqbIE4ZP72/IG7VL4isFP0jlFqnkXV3zd/zJuOngZELR9/lgPPgR580daGWctbLcDBEao4cld/4MCly4utfwIDAQAB");
        final b b = this.b;
        final e e = new e() {
            @Override
            public final void a(final com.saterskog.a.c obj) {
                if (!obj.a()) {
                    com.saterskog.b.a.b("Problem setting up In-app Billing: " + obj);
                }
                else {
                    l.this.a();
                }
            }
        };
        b.b();
        if (b.c) {
            throw new IllegalStateException("IAB helper is already set up.");
        }
        b.c("Starting in-app billing setup.");
        b.l = (ServiceConnection)new ServiceConnection() {
            final /* synthetic */ e a = e;
            
            public final void onServiceConnected(final ComponentName componentName, final IBinder binder) {
                if (!b.d) {
                    b.c("Billing service connected.");
                    b.k = com.a.a.a.a.a.a(binder);
                    final String packageName = b.j.getPackageName();
                    Label_0157: {
                        try {
                            b.c("Checking for in-app billing 3 support.");
                            final int a = b.k.a(3, packageName, "inapp");
                            if (a == 0) {
                                break Label_0157;
                            }
                            if (this.a != null) {
                                this.a.a(new com.saterskog.a.c(a, "Error checking for billing v3 support."));
                            }
                            b.f = false;
                            b.g = false;
                        }
                        catch (RemoteException ex) {
                            if (this.a != null) {
                                this.a.a(new com.saterskog.a.c(-1001, "RemoteException while setting up in-app billing."));
                            }
                            ex.printStackTrace();
                        }
                        return;
                    }
                    b.c("In-app billing version 3 supported for " + packageName);
                    if (b.k.a(5, packageName, "subs") == 0) {
                        b.c("Subscription re-signup AVAILABLE.");
                        b.g = true;
                    }
                    else {
                        b.c("Subscription re-signup not available.");
                        b.g = false;
                    }
                    if (b.g) {
                        b.f = true;
                    }
                    else {
                        final int a2 = b.k.a(3, packageName, "subs");
                        if (a2 == 0) {
                            b.c("Subscriptions AVAILABLE.");
                            b.f = true;
                        }
                        else {
                            b.c("Subscriptions NOT AVAILABLE. Response: " + a2);
                            b.f = false;
                            b.g = false;
                        }
                    }
                    b.c = true;
                    if (this.a != null) {
                        this.a.a(new com.saterskog.a.c(0, "Setup successful."));
                    }
                }
            }
            
            public final void onServiceDisconnected(final ComponentName componentName) {
                b.c("Billing service disconnected.");
                b.k = null;
            }
        };
        final Intent intent = new Intent("com.android.vending.billing.InAppBillingService.BIND");
        intent.setPackage("com.android.vending");
        final List queryIntentServices = b.j.getPackageManager().queryIntentServices(intent, 0);
        if (queryIntentServices != null && !queryIntentServices.isEmpty()) {
            b.j.bindService(intent, b.l, 1);
        }
        else {
            ((e)e).a(new com.saterskog.a.c(3, "Billing service unavailable on device."));
        }
        if (this.e) {
            this.b();
        }
        if (defaultSharedPreferences.getBoolean("music", true)) {
            (this.d = MediaPlayer.create((Context)this, 2131558435)).setLooping(true);
            this.d.setVolume(0.5f, 0.5f);
            if (bundle != null) {
                final int int1 = bundle.getInt("song_pos", -1);
                if (int1 != -1) {
                    this.l = int1;
                    this.d.seekTo(this.l);
                }
            }
            this.d.start();
        }
        final Uri data = this.getIntent().getData();
        int n = 0;
        Label_0458: {
            if (data != null) {
                com.saterskog.b.a.b("uri received");
                for (String[] fileList = this.fileList(); i < fileList.length; ++i) {
                    if (fileList[i].equals(data.getLastPathSegment())) {
                        Toast.makeText((Context)this, (CharSequence)this.getString(2131624345), 1).show();
                        this.finish();
                    }
                }
                final byte[] array = new byte[1024];
                InputStream openInputStream = null;
                FileOutputStream openFileOutput = null;
                Label_0619: {
                    try {
                        openInputStream = this.getContentResolver().openInputStream(data);
                        openFileOutput = this.openFileOutput(data.getLastPathSegment(), 0);
                        while (true) {
                            final int read = openInputStream.read(array);
                            if (read <= 0) {
                                break Label_0619;
                            }
                            openFileOutput.write(Arrays.copyOfRange(array, 0, Math.max(0, read)));
                        }
                    }
                    catch (Exception ex) {
                        ex.printStackTrace();
                        n = 1;
                    }
                    break Label_0458;
                }
                openInputStream.close();
                openFileOutput.close();
                com.saterskog.b.a.b("uri written to " + data.getLastPathSegment());
                n = 1;
            }
            else {
                n = 0;
            }
        }
        this.a = new a(this.getFragmentManager());
        (this.c = (ViewPager)this.findViewById(2131230813)).setAdapter(this.a);
        this.c.setOnPageChangeListener((ViewPager.f)new ViewPager.i() {
            @Override
            public final void a(final int n) {
                switch (n) {
                    case 0: {
                        com.saterskog.b.a.a("main/challenge_tab", l.this);
                        break;
                    }
                    case 1: {
                        com.saterskog.b.a.a("main/experiment_tab", l.this);
                        break;
                    }
                    case 2: {
                        com.saterskog.b.a.a("main/gene_bank_tab", l.this);
                        break;
                    }
                    case 3: {
                        com.saterskog.b.a.a("main/about_tab", l.this);
                        break;
                    }
                }
                l.this.a((short)0);
            }
        });
        final PagerTabStrip pagerTabStrip = (PagerTabStrip)this.findViewById(2131230814);
        pagerTabStrip.setDrawFullUnderline(true);
        pagerTabStrip.setTabIndicatorColor(this.getResources().getColor(2131034160));
        if (n != 0) {
            this.c.setCurrentItem(2);
        }
        switch (this.c.getCurrentItem()) {
            case 0: {
                com.saterskog.b.a.a("main/challenge_tab", this);
                break;
            }
            case 1: {
                com.saterskog.b.a.a("main/experiment_tab", this);
                break;
            }
            case 2: {
                com.saterskog.b.a.a("main/gene_bank_tab", this);
                break;
            }
            case 3: {
                com.saterskog.b.a.a("main/about_tab", this);
                break;
            }
        }
        if (bundle == null) {
            new Thread(new Runnable() {
                final /* synthetic */ Activity a = this;
                
                @Override
                public final void run() {
                    // 
                    // This method could not be decompiled.
                    // 
                    // Original Bytecode:
                    // 
                    //     1: istore_1       
                    //     2: ldc             ""
                    //     4: astore_2       
                    //     5: new             Ljava/net/URL;
                    //     8: astore_3       
                    //     9: aload_3        
                    //    10: ldc             "http://www.cell-lab.net/announcement.txt"
                    //    12: invokespecial   java/net/URL.<init>:(Ljava/lang/String;)V
                    //    15: aload_3        
                    //    16: invokevirtual   java/net/URL.openConnection:()Ljava/net/URLConnection;
                    //    19: astore_3       
                    //    20: aload_3        
                    //    21: sipush          5000
                    //    24: invokevirtual   java/net/URLConnection.setReadTimeout:(I)V
                    //    27: aload_3        
                    //    28: sipush          10000
                    //    31: invokevirtual   java/net/URLConnection.setConnectTimeout:(I)V
                    //    34: aload_3        
                    //    35: invokevirtual   java/net/URLConnection.getInputStream:()Ljava/io/InputStream;
                    //    38: astore          4
                    //    40: new             Ljava/io/BufferedInputStream;
                    //    43: astore          5
                    //    45: aload           5
                    //    47: aload           4
                    //    49: sipush          5120
                    //    52: invokespecial   java/io/BufferedInputStream.<init>:(Ljava/io/InputStream;I)V
                    //    55: new             Ljava/io/BufferedReader;
                    //    58: astore          6
                    //    60: new             Ljava/io/InputStreamReader;
                    //    63: astore_3       
                    //    64: aload_3        
                    //    65: aload           4
                    //    67: invokespecial   java/io/InputStreamReader.<init>:(Ljava/io/InputStream;)V
                    //    70: aload           6
                    //    72: aload_3        
                    //    73: invokespecial   java/io/BufferedReader.<init>:(Ljava/io/Reader;)V
                    //    76: aload           6
                    //    78: invokevirtual   java/io/BufferedReader.readLine:()Ljava/lang/String;
                    //    81: astore_3       
                    //    82: aload_3        
                    //    83: ldc             "welcomeToCL94"
                    //    85: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
                    //    88: istore          7
                    //    90: iload           7
                    //    92: ifeq            244
                    //    95: iconst_1       
                    //    96: istore_1       
                    //    97: iload_1        
                    //    98: ifeq            307
                    //   101: aload           6
                    //   103: invokevirtual   java/io/BufferedReader.readLine:()Ljava/lang/String;
                    //   106: astore          4
                    //   108: aload           4
                    //   110: astore_2       
                    //   111: new             Ljava/lang/StringBuilder;
                    //   114: astore          8
                    //   116: aload           4
                    //   118: astore_2       
                    //   119: aload           8
                    //   121: invokespecial   java/lang/StringBuilder.<init>:()V
                    //   124: aload           4
                    //   126: astore_2       
                    //   127: aload           6
                    //   129: invokevirtual   java/io/BufferedReader.readLine:()Ljava/lang/String;
                    //   132: astore          9
                    //   134: aload           9
                    //   136: ifnull          262
                    //   139: aload           4
                    //   141: astore_2       
                    //   142: new             Ljava/lang/StringBuilder;
                    //   145: astore          10
                    //   147: aload           4
                    //   149: astore_2       
                    //   150: aload           10
                    //   152: invokespecial   java/lang/StringBuilder.<init>:()V
                    //   155: aload           4
                    //   157: astore_2       
                    //   158: aload           8
                    //   160: aload           10
                    //   162: aload           9
                    //   164: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
                    //   167: ldc             "\n"
                    //   169: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
                    //   172: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
                    //   175: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
                    //   178: pop            
                    //   179: goto            124
                    //   182: astore          6
                    //   184: ldc             ""
                    //   186: astore          4
                    //   188: aload           6
                    //   190: invokevirtual   java/lang/Exception.printStackTrace:()V
                    //   193: aload           4
                    //   195: invokevirtual   java/lang/String.length:()I
                    //   198: ifeq            243
                    //   201: aload_3        
                    //   202: invokevirtual   java/lang/String.length:()I
                    //   205: ifeq            243
                    //   208: aload_2        
                    //   209: invokevirtual   java/lang/String.length:()I
                    //   212: ifeq            243
                    //   215: aload_0        
                    //   216: getfield        com/saterskog/cell_lab/b$1.a:Landroid/app/Activity;
                    //   219: aload_2        
                    //   220: aload           4
                    //   222: new             Ljava/lang/StringBuilder;
                    //   225: dup            
                    //   226: ldc             "announcement_"
                    //   228: invokespecial   java/lang/StringBuilder.<init>:(Ljava/lang/String;)V
                    //   231: aload_3        
                    //   232: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
                    //   235: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
                    //   238: aconst_null    
                    //   239: aconst_null    
                    //   240: invokestatic    com/saterskog/cell_lab/b.a:(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroid/content/DialogInterface$OnClickListener;Landroid/content/DialogInterface$OnClickListener;)V
                    //   243: return         
                    //   244: aload_3        
                    //   245: ldc             "CellLabAnnouncement"
                    //   247: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
                    //   250: ifeq            317
                    //   253: aload           6
                    //   255: invokevirtual   java/io/BufferedReader.readLine:()Ljava/lang/String;
                    //   258: astore_3       
                    //   259: goto            97
                    //   262: aload           4
                    //   264: astore_2       
                    //   265: aload           8
                    //   267: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
                    //   270: astore          6
                    //   272: aload           4
                    //   274: astore_2       
                    //   275: aload           6
                    //   277: astore          4
                    //   279: aload           5
                    //   281: invokevirtual   java/io/BufferedInputStream.close:()V
                    //   284: goto            193
                    //   287: astore          6
                    //   289: ldc             ""
                    //   291: astore_3       
                    //   292: ldc             ""
                    //   294: astore_2       
                    //   295: ldc             ""
                    //   297: astore          4
                    //   299: goto            188
                    //   302: astore          6
                    //   304: goto            188
                    //   307: ldc             ""
                    //   309: astore_2       
                    //   310: ldc             ""
                    //   312: astore          4
                    //   314: goto            279
                    //   317: iconst_0       
                    //   318: istore_1       
                    //   319: goto            253
                    //    Exceptions:
                    //  Try           Handler
                    //  Start  End    Start  End    Type                 
                    //  -----  -----  -----  -----  ---------------------
                    //  5      90     287    302    Ljava/lang/Exception;
                    //  101    108    182    188    Ljava/lang/Exception;
                    //  111    116    182    188    Ljava/lang/Exception;
                    //  119    124    182    188    Ljava/lang/Exception;
                    //  127    134    182    188    Ljava/lang/Exception;
                    //  142    147    182    188    Ljava/lang/Exception;
                    //  150    155    182    188    Ljava/lang/Exception;
                    //  158    179    182    188    Ljava/lang/Exception;
                    //  244    253    287    302    Ljava/lang/Exception;
                    //  253    259    287    302    Ljava/lang/Exception;
                    //  265    272    182    188    Ljava/lang/Exception;
                    //  279    284    302    307    Ljava/lang/Exception;
                    // 
                    // The error that occurred was:
                    // 
                    // java.lang.IllegalStateException: Expression is linked from several locations: Label_0279:
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
                    //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.transformCall(AstMethodBodyBuilder.java:1164)
                    //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.transformByteCode(AstMethodBodyBuilder.java:1009)
                    //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.transformExpression(AstMethodBodyBuilder.java:540)
                    //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.transformByteCode(AstMethodBodyBuilder.java:554)
                    //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.transformExpression(AstMethodBodyBuilder.java:540)
                    //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.transformByteCode(AstMethodBodyBuilder.java:554)
                    //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.transformExpression(AstMethodBodyBuilder.java:540)
                    //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.transformNode(AstMethodBodyBuilder.java:392)
                    //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.transformBlock(AstMethodBodyBuilder.java:333)
                    //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.transformNode(AstMethodBodyBuilder.java:440)
                    //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.transformBlock(AstMethodBodyBuilder.java:333)
                    //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:294)
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
            }).start();
        }
    }
    
    public void onDestroy() {
        if (this.f != null) {
            this.f.release();
            this.f = null;
        }
        if (this.d != null) {
            this.d.release();
            this.d = null;
        }
        while (true) {
            if (this.b == null) {
                break Label_0052;
            }
            try {
                this.b.a();
                this.b = null;
                super.onDestroy();
            }
            catch (com.saterskog.a.b.a a) {
                com.saterskog.b.a.a("couldn't dispose IAP Helper..", a);
                continue;
            }
            break;
        }
    }
    
    public void onPause() {
        if (this.d != null) {
            this.d.pause();
            this.l = this.d.getCurrentPosition();
        }
        super.onPause();
    }
    
    public void onResume() {
        if (this.d != null && PreferenceManager.getDefaultSharedPreferences((Context)this).getBoolean("music", true)) {
            this.d.seekTo(this.l);
            this.d.start();
        }
        super.onResume();
    }
    
    protected void onSaveInstanceState(final Bundle bundle) {
        if (this.d != null) {
            bundle.putInt("song_pos", this.d.getCurrentPosition());
            this.d.pause();
        }
        super.onSaveInstanceState(bundle);
    }
    
    public final class a extends android.support.a.a.d
    {
        public a(final FragmentManager fragmentManager) {
            super(fragmentManager);
        }
        
        @Override
        public final Fragment a(final int n) {
            return com.saterskog.cell_lab.l.this.a(n);
        }
        
        @Override
        public final int b() {
            return 5;
        }
        
        @Override
        public final CharSequence b(final int n) {
            return com.saterskog.cell_lab.l.this.b(n);
        }
    }
}
