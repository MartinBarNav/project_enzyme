// 
// Decompiled by Procyon v0.5.36
// 

package com.saterskog.cell_lab;

import java.util.ArrayList;
import android.app.FragmentManager;
import android.support.a.a.d;
import android.app.FragmentTransaction;
import android.app.ActionBar$Tab;
import java.io.Serializable;
import android.os.Parcelable;
import android.os.Build$VERSION;
import android.view.MenuItem;
import android.view.MenuInflater;
import android.widget.Button;
import android.view.Menu;
import android.os.Bundle;
import java.io.IOException;
import java.io.StreamCorruptedException;
import java.io.BufferedInputStream;
import android.app.Fragment;
import android.widget.ListAdapter;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.content.Intent;
import com.saterskog.b.a;
import android.app.AlertDialog;
import android.preference.PreferenceManager;
import java.io.FileOutputStream;
import java.io.FileNotFoundException;
import java.io.OutputStream;
import android.widget.TextView;
import android.widget.Toast;
import android.content.DialogInterface;
import android.content.DialogInterface$OnClickListener;
import android.view.View;
import android.widget.EditText;
import android.content.Context;
import android.app.AlertDialog$Builder;
import android.app.Activity;
import android.support.v4.view.ViewPager;
import java.io.InputStream;
import android.media.MediaPlayer;
import android.media.SoundPool;
import android.net.Uri;
import android.widget.ImageButton;
import java.io.File;
import android.view.View$OnClickListener;
import android.app.ActionBar$TabListener;
import android.support.v4.app.e;

public class PlayActivity extends e implements ActionBar$TabListener, View$OnClickListener, b, o.a, p.a, t.a
{
    int A;
    int[] B;
    int[] C;
    File D;
    boolean E;
    private int[] F;
    private Environment G;
    private int H;
    private int I;
    private ImageButton J;
    private long K;
    private Uri L;
    private ImageButton M;
    private ImageButton N;
    private String O;
    a n;
    boolean o;
    boolean p;
    int q;
    int r;
    int s;
    String t;
    CustomViewPager u;
    CellWorld v;
    boolean w;
    boolean x;
    SoundPool y;
    MediaPlayer z;
    
    public PlayActivity() {
        this.u = null;
        this.F = new int[h.values().length];
        this.G = new Environment();
        this.J = null;
        this.K = -1L;
        this.B = new int[12];
        this.C = new int[27];
        this.E = false;
    }
    
    private void a(final InputStream p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: ifnonnull       5
        //     4: return         
        //     5: new             Ljava/io/ObjectInputStream;
        //     8: dup            
        //     9: aload_1        
        //    10: invokespecial   java/io/ObjectInputStream.<init>:(Ljava/io/InputStream;)V
        //    13: astore_2       
        //    14: aload_2        
        //    15: invokevirtual   java/io/ObjectInputStream.readInt:()I
        //    18: istore_3       
        //    19: iload_3        
        //    20: sipush          3054
        //    23: if_icmple       94
        //    26: aload_0        
        //    27: aload_0        
        //    28: ldc             2131624342
        //    30: invokevirtual   com/saterskog/cell_lab/PlayActivity.getString:(I)Ljava/lang/String;
        //    33: iconst_1       
        //    34: invokestatic    android/widget/Toast.makeText:(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;
        //    37: invokevirtual   android/widget/Toast.show:()V
        //    40: aload_2        
        //    41: invokevirtual   java/io/ObjectInputStream.close:()V
        //    44: ldc             "tried Opening file from newer version"
        //    46: invokestatic    com/saterskog/b/a.a:(Ljava/lang/String;)V
        //    49: aload_0        
        //    50: iconst_m1      
        //    51: invokevirtual   com/saterskog/cell_lab/PlayActivity.setResult:(I)V
        //    54: aload_0        
        //    55: invokevirtual   com/saterskog/cell_lab/PlayActivity.finish:()V
        //    58: goto            4
        //    61: astore_1       
        //    62: new             Ljava/lang/RuntimeException;
        //    65: dup            
        //    66: ldc             "can't load env 1"
        //    68: invokespecial   java/lang/RuntimeException.<init>:(Ljava/lang/String;)V
        //    71: athrow         
        //    72: astore_1       
        //    73: new             Ljava/lang/RuntimeException;
        //    76: dup            
        //    77: ldc             "io40"
        //    79: invokespecial   java/lang/RuntimeException.<init>:(Ljava/lang/String;)V
        //    82: athrow         
        //    83: astore_1       
        //    84: new             Ljava/lang/RuntimeException;
        //    87: dup            
        //    88: ldc             "io38"
        //    90: invokespecial   java/lang/RuntimeException.<init>:(Ljava/lang/String;)V
        //    93: athrow         
        //    94: aload_2        
        //    95: invokevirtual   java/io/ObjectInputStream.readDouble:()D
        //    98: pop2           
        //    99: aload_2        
        //   100: invokevirtual   java/io/ObjectInputStream.readInt:()I
        //   103: pop            
        //   104: aload_0        
        //   105: getfield        com/saterskog/cell_lab/PlayActivity.G:Lcom/saterskog/cell_lab/Environment;
        //   108: aload_2        
        //   109: invokevirtual   com/saterskog/cell_lab/Environment.a:(Ljava/io/ObjectInputStream;)V
        //   112: iconst_m1      
        //   113: aload_0        
        //   114: invokestatic    com/saterskog/cell_lab/j.i:(ILandroid/content/Context;)[Z
        //   117: astore_1       
        //   118: iconst_0       
        //   119: istore          4
        //   121: iconst_0       
        //   122: istore_3       
        //   123: iload           4
        //   125: getstatic       com/saterskog/cell_lab/h.B:[Lcom/saterskog/cell_lab/h;
        //   128: arraylength    
        //   129: if_icmpge       233
        //   132: aload_0        
        //   133: getfield        com/saterskog/cell_lab/PlayActivity.G:Lcom/saterskog/cell_lab/Environment;
        //   136: getfield        com/saterskog/cell_lab/Environment.t:[Z
        //   139: astore          5
        //   141: aload_0        
        //   142: getfield        com/saterskog/cell_lab/PlayActivity.G:Lcom/saterskog/cell_lab/Environment;
        //   145: getfield        com/saterskog/cell_lab/Environment.t:[Z
        //   148: iload           4
        //   150: baload         
        //   151: ifeq            222
        //   154: aload_1        
        //   155: iload           4
        //   157: baload         
        //   158: ifeq            222
        //   161: iconst_1       
        //   162: istore          6
        //   164: aload           5
        //   166: iload           4
        //   168: iload           6
        //   170: bastore        
        //   171: iload_3        
        //   172: ifne            192
        //   175: aload_0        
        //   176: getfield        com/saterskog/cell_lab/PlayActivity.G:Lcom/saterskog/cell_lab/Environment;
        //   179: getfield        com/saterskog/cell_lab/Environment.t:[Z
        //   182: iload           4
        //   184: baload         
        //   185: istore          6
        //   187: iload           6
        //   189: ifeq            228
        //   192: iconst_1       
        //   193: istore_3       
        //   194: iinc            4, 1
        //   197: goto            123
        //   200: astore_1       
        //   201: new             Ljava/lang/RuntimeException;
        //   204: dup            
        //   205: ldc             "io37"
        //   207: invokespecial   java/lang/RuntimeException.<init>:(Ljava/lang/String;)V
        //   210: athrow         
        //   211: astore_1       
        //   212: new             Ljava/lang/RuntimeException;
        //   215: dup            
        //   216: ldc             "io36"
        //   218: invokespecial   java/lang/RuntimeException.<init>:(Ljava/lang/String;)V
        //   221: athrow         
        //   222: iconst_0       
        //   223: istore          6
        //   225: goto            164
        //   228: iconst_0       
        //   229: istore_3       
        //   230: goto            194
        //   233: iload_3        
        //   234: ifne            252
        //   237: aload_0        
        //   238: getfield        com/saterskog/cell_lab/PlayActivity.G:Lcom/saterskog/cell_lab/Environment;
        //   241: getfield        com/saterskog/cell_lab/Environment.t:[Z
        //   244: getstatic       com/saterskog/cell_lab/h.c:Lcom/saterskog/cell_lab/h;
        //   247: invokevirtual   com/saterskog/cell_lab/h.ordinal:()I
        //   250: iconst_1       
        //   251: bastore        
        //   252: aload_2        
        //   253: invokevirtual   java/io/ObjectInputStream.close:()V
        //   256: goto            4
        //   259: astore_1       
        //   260: new             Ljava/lang/RuntimeException;
        //   263: dup            
        //   264: ldc             "io34"
        //   266: invokespecial   java/lang/RuntimeException.<init>:(Ljava/lang/String;)V
        //   269: athrow         
        //   270: astore_1       
        //   271: new             Ljava/lang/RuntimeException;
        //   274: dup            
        //   275: ldc             "io35"
        //   277: invokespecial   java/lang/RuntimeException.<init>:(Ljava/lang/String;)V
        //   280: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                 
        //  -----  -----  -----  -----  ---------------------
        //  5      14     61     72     Ljava/io/IOException;
        //  14     19     72     83     Ljava/io/IOException;
        //  40     44     83     94     Ljava/io/IOException;
        //  94     99     200    211    Ljava/io/IOException;
        //  99     104    211    222    Ljava/io/IOException;
        //  104    118    270    281    Ljava/io/IOException;
        //  123    154    270    281    Ljava/io/IOException;
        //  175    187    270    281    Ljava/io/IOException;
        //  237    252    270    281    Ljava/io/IOException;
        //  252    256    259    270    Ljava/io/IOException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index 147 out of bounds for length 147
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
    
    private void c(final int n) {
        ((ViewPager)this.findViewById(2131230813)).a(n, false);
        if (n == 1) {
            com.saterskog.cell_lab.t.b(this, 0, 0);
        }
        if (n == 2) {
            com.saterskog.cell_lab.t.b(this, 1, 0);
        }
    }
    
    private void c(final String p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: astore_2       
        //     4: aload_2        
        //     5: aload_0        
        //     6: getfield        com/saterskog/cell_lab/PlayActivity.D:Ljava/io/File;
        //     9: iconst_1       
        //    10: invokespecial   java/io/FileOutputStream.<init>:(Ljava/io/File;Z)V
        //    13: aload_2        
        //    14: astore_3       
        //    15: aload_2        
        //    16: aload_1        
        //    17: ldc_w           "UTF-8"
        //    20: invokestatic    java/nio/charset/Charset.forName:(Ljava/lang/String;)Ljava/nio/charset/Charset;
        //    23: invokevirtual   java/lang/String.getBytes:(Ljava/nio/charset/Charset;)[B
        //    26: invokevirtual   java/io/FileOutputStream.write:([B)V
        //    29: aload_2        
        //    30: invokevirtual   java/io/FileOutputStream.close:()V
        //    33: return         
        //    34: astore_1       
        //    35: aload_1        
        //    36: invokevirtual   java/io/IOException.printStackTrace:()V
        //    39: goto            33
        //    42: astore_1       
        //    43: aconst_null    
        //    44: astore_2       
        //    45: aload_2        
        //    46: astore_3       
        //    47: aload_1        
        //    48: invokevirtual   java/io/FileNotFoundException.printStackTrace:()V
        //    51: aload_2        
        //    52: ifnull          33
        //    55: aload_2        
        //    56: invokevirtual   java/io/FileOutputStream.close:()V
        //    59: goto            33
        //    62: astore_1       
        //    63: aload_1        
        //    64: invokevirtual   java/io/IOException.printStackTrace:()V
        //    67: goto            33
        //    70: astore_1       
        //    71: aconst_null    
        //    72: astore_2       
        //    73: aload_2        
        //    74: astore_3       
        //    75: aload_1        
        //    76: invokevirtual   java/io/IOException.printStackTrace:()V
        //    79: aload_2        
        //    80: ifnull          33
        //    83: aload_2        
        //    84: invokevirtual   java/io/FileOutputStream.close:()V
        //    87: goto            33
        //    90: astore_1       
        //    91: aload_1        
        //    92: invokevirtual   java/io/IOException.printStackTrace:()V
        //    95: goto            33
        //    98: astore_1       
        //    99: aconst_null    
        //   100: astore_3       
        //   101: aload_3        
        //   102: ifnull          109
        //   105: aload_3        
        //   106: invokevirtual   java/io/FileOutputStream.close:()V
        //   109: aload_1        
        //   110: athrow         
        //   111: astore_3       
        //   112: aload_3        
        //   113: invokevirtual   java/io/IOException.printStackTrace:()V
        //   116: goto            109
        //   119: astore_1       
        //   120: goto            101
        //   123: astore_1       
        //   124: goto            73
        //   127: astore_1       
        //   128: goto            45
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                           
        //  -----  -----  -----  -----  -------------------------------
        //  0      13     42     45     Ljava/io/FileNotFoundException;
        //  0      13     70     73     Ljava/io/IOException;
        //  0      13     98     101    Any
        //  15     29     127    131    Ljava/io/FileNotFoundException;
        //  15     29     123    127    Ljava/io/IOException;
        //  15     29     119    123    Any
        //  29     33     34     42     Ljava/io/IOException;
        //  47     51     119    123    Any
        //  55     59     62     70     Ljava/io/IOException;
        //  75     79     119    123    Any
        //  83     87     90     98     Ljava/io/IOException;
        //  105    109    111    119    Ljava/io/IOException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0033:
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
    
    static /* synthetic */ void f(final PlayActivity playActivity) {
        final AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder((Context)playActivity);
        alertDialog$Builder.setTitle((CharSequence)playActivity.getString(2131624199));
        final EditText view = new EditText((Context)playActivity);
        view.setInputType(1);
        if (!playActivity.p) {
            view.setText((CharSequence)playActivity.t);
        }
        alertDialog$Builder.setView((View)view);
        alertDialog$Builder.setPositiveButton((CharSequence)playActivity.getString(2131624029), (DialogInterface$OnClickListener)new DialogInterface$OnClickListener() {
            public final void onClick(final DialogInterface dialogInterface, int i) {
                i = 0;
                final String string = view.getText().toString();
                final String a = f.a(string);
                for (String[] fileList = PlayActivity.this.fileList(); i < fileList.length; ++i) {
                    if (fileList[i].equals(a) && !view.getText().toString().equals(PlayActivity.this.t)) {
                        final Toast text = Toast.makeText((Context)PlayActivity.this, (CharSequence)PlayActivity.this.getString(2131624200), 1);
                        PlayActivity.this.a((short)1);
                        ((TextView)text.getView().findViewById(16908299)).setTextColor(-65536);
                        text.show();
                        return;
                    }
                }
                try {
                    final FileOutputStream openFileOutput = PlayActivity.this.openFileOutput(a, 0);
                    final PlayActivity b = PlayActivity.this;
                    final p p2 = (p)b.b(1);
                    if (p2 != null && p2.a != null) {
                        p2.a.queueEvent((Runnable)new Runnable() {
                            final /* synthetic */ OutputStream b = openFileOutput;
                            
                            @Override
                            public final void run() {
                                p2.a.a.N = this.b;
                            }
                        });
                    }
                    PlayActivity.this.O = string;
                    PlayActivity.this.s = -1;
                    PlayActivity.this.t = string;
                    PlayActivity.this.o = true;
                    PlayActivity.this.getActionBar().setTitle((CharSequence)PlayActivity.this.O);
                    Toast.makeText((Context)PlayActivity.this, (CharSequence)PlayActivity.this.getString(2131624349), 1).show();
                }
                catch (FileNotFoundException ex) {
                    ex.printStackTrace();
                }
                catch (IllegalArgumentException ex2) {
                    PlayActivity.this.a((short)1);
                    final Toast text2 = Toast.makeText((Context)PlayActivity.this, (CharSequence)PlayActivity.this.getString(2131624339), 1);
                    ((TextView)text2.getView().findViewById(16908299)).setTextColor(-65536);
                    text2.show();
                }
            }
        });
        alertDialog$Builder.setNegativeButton((CharSequence)playActivity.getString(2131624033), (DialogInterface$OnClickListener)new DialogInterface$OnClickListener() {
            public final void onClick(final DialogInterface dialogInterface, final int n) {
                dialogInterface.cancel();
            }
        });
        alertDialog$Builder.show();
    }
    
    static /* synthetic */ void g(final PlayActivity playActivity) {
        if (playActivity.q == -1) {
            playActivity.a(playActivity.b());
            final o o = (o)playActivity.b(0);
            if (o != null) {
                o.a.a(playActivity.G);
                o.a();
            }
        }
        final InputStream b = playActivity.b();
        final p p = (p)playActivity.b(1);
        playActivity.a((short)0);
        p.a.queueEvent((Runnable)new Runnable() {
            @Override
            public final void run() {
                p.a.a.a(b, -1);
            }
        });
    }
    
    private void i() {
        this.a((short)11);
        if (PreferenceManager.getDefaultSharedPreferences((Context)this).getBoolean("ask_discard_sample", true)) {
            final AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder((Context)this);
            alertDialog$Builder.setTitle((CharSequence)this.getString(2131624035));
            alertDialog$Builder.setMessage((CharSequence)this.getString(2131624034));
            alertDialog$Builder.setPositiveButton((CharSequence)this.getString(2131624028), (DialogInterface$OnClickListener)new DialogInterface$OnClickListener() {
                public final void onClick(final DialogInterface dialogInterface, final int n) {
                    PlayActivity.this.j();
                }
            });
            alertDialog$Builder.setNegativeButton((CharSequence)this.getString(2131624027), (DialogInterface$OnClickListener)new DialogInterface$OnClickListener() {
                public final void onClick(final DialogInterface dialogInterface, final int n) {
                    dialogInterface.cancel();
                }
            });
            final AlertDialog create = alertDialog$Builder.create();
            create.show();
            final View viewById = create.findViewById(create.getContext().getResources().getIdentifier("android:id/titleDivider", (String)null, (String)null));
            if (viewById != null) {
                viewById.setBackgroundColor(this.getResources().getColor(2131034132));
            }
        }
        else {
            this.j();
        }
    }
    
    private void j() {
        if (this.q != -1 && !j.b(this.q, (Context)this)) {
            if (j.b((Context)this, this.q) + (com.saterskog.b.a.c() - this.K) > 600000L) {
                b.a(this, this.getString(2131624192), this.getString(2131624190) + this.getString(2131624071) + "<br><br>" + this.getString(2131624371), "need_help", null, (DialogInterface$OnClickListener)new DialogInterface$OnClickListener() {
                    public final void onClick(final DialogInterface dialogInterface, final int n) {
                        PlayActivity.this.finish();
                    }
                });
            }
            else {
                this.finish();
            }
        }
        else if (this.E && this.q >= j.a("26.6", (Context)this)) {
            b.a(this, this.getString(2131624048), this.getString(2131624047), "donation_appeal", (DialogInterface$OnClickListener)new DialogInterface$OnClickListener() {
                public final void onClick(final DialogInterface dialogInterface, final int n) {
                    final Intent intent = new Intent();
                    intent.putExtra("go_to_donate", 1);
                    PlayActivity.this.setResult(-1, intent);
                }
            }, (DialogInterface$OnClickListener)new DialogInterface$OnClickListener() {
                public final void onClick(final DialogInterface dialogInterface, final int n) {
                    PlayActivity.this.finish();
                }
            });
        }
        else {
            this.finish();
        }
    }
    
    private void k() {
        final int n = 0;
        this.getResources().getStringArray(2130837515);
        new AlertDialog$Builder((Context)this);
        final boolean[] a = j.a(this.q);
        final int length = a.length;
        int i = 0;
        int n2 = 0;
        while (i < length) {
            int n3 = n2;
            if (a[i]) {
                n3 = n2 + 1;
            }
            ++i;
            n2 = n3;
        }
        final Integer[] array = new Integer[n2];
        int n4 = 0;
        int n5;
        for (int j = n; j < 5; ++j, n4 = n5) {
            n5 = n4;
            if (a[j]) {
                array[n4] = new Integer(j);
                n5 = n4 + 1;
            }
        }
        final AlertDialog show = new AlertDialog$Builder((Context)this).setAdapter((ListAdapter)new ArrayAdapter<Integer>(this, array) {
            public final View getView(final int n, final View view, final ViewGroup viewGroup) {
                final View view2 = super.getView(n, view, viewGroup);
                final TextView textView = (TextView)view2.findViewById(16908308);
                int n2;
                if (array[n] == 0) {
                    n2 = 2131165295;
                    textView.setText((CharSequence)(" " + PlayActivity.this.getString(2131624353)));
                }
                else {
                    n2 = 0;
                }
                if (array[n] == 1) {
                    n2 = 2131165297;
                    textView.setText((CharSequence)(" " + PlayActivity.this.getString(2131624355)));
                }
                if (array[n] == 2) {
                    n2 = 2131165294;
                    textView.setText((CharSequence)(" " + PlayActivity.this.getString(2131624352)));
                }
                if (array[n] == 3) {
                    n2 = 2131165298;
                    textView.setText((CharSequence)(" " + PlayActivity.this.getString(2131624356)));
                }
                if (array[n] == 4) {
                    n2 = 2131165296;
                    textView.setText((CharSequence)(" " + PlayActivity.this.getString(2131624354)));
                }
                textView.setCompoundDrawablesWithIntrinsicBounds(n2, 0, 0, 0);
                return view2;
            }
        }, (DialogInterface$OnClickListener)new DialogInterface$OnClickListener() {
            public final void onClick(final DialogInterface dialogInterface, int c) {
                int imageResource = 0;
                if (array[c] == 0) {
                    imageResource = 2131165295;
                }
                if (array[c] == 1) {
                    imageResource = 2131165297;
                }
                if (array[c] == 2) {
                    imageResource = 2131165294;
                }
                if (array[c] == 3) {
                    imageResource = 2131165298;
                }
                if (array[c] == 4) {
                    imageResource = 2131165296;
                }
                PlayActivity.this.N.setImageResource(imageResource);
                PlayActivity.this.I = array[c];
                c = PlayActivity.this.I;
                final p p2 = (p)PlayActivity.this.b(1);
                if (p2 != null) {
                    p2.a.queueEvent((Runnable)new Runnable() {
                        @Override
                        public final void run() {
                            p2.a.a.A = c;
                        }
                    });
                    p2.a(PlayActivity.this.I);
                }
                PlayActivity.this.a((short)11);
            }
        }).setTitle(2131624193).show();
        final View viewById = show.findViewById(show.getContext().getResources().getIdentifier("android:id/titleDivider", (String)null, (String)null));
        if (viewById != null) {
            viewById.setBackgroundColor(this.getResources().getColor(2131034132));
        }
    }
    
    public final void a(final float n) {
        if (this.w) {
            this.y.play(this.B[10], n, n, 0, 0, 1.0f);
        }
    }
    
    public final void a(final CellWorld cellWorld) {
        final int n = 0;
        if (this.D != null) {
            final String string = "\n" + cellWorld.M + ", " + cellWorld.f() + ", " + cellWorld.S + ", " + cellWorld.R;
            cellWorld.S = 0;
            cellWorld.R = 0;
            for (int i = 0; i < 27; ++i) {
                this.C[i] = 0;
            }
            for (int j = 0; j < cellWorld.z; ++j) {
                int n2;
                if ((n2 = (int)(cellWorld.x[j].J[0] * 3.0f)) < 0) {
                    n2 = 0;
                }
                int n3;
                if ((n3 = n2) >= 3) {
                    n3 = 2;
                }
                int n4;
                if ((n4 = (int)(cellWorld.x[j].J[1] * 3.0f)) < 0) {
                    n4 = 0;
                }
                int n5;
                if ((n5 = n4) >= 3) {
                    n5 = 2;
                }
                int n6;
                if ((n6 = (int)(cellWorld.x[j].J[2] * 3.0f)) < 0) {
                    n6 = 0;
                }
                int n7;
                if ((n7 = n6) >= 3) {
                    n7 = 2;
                }
                final int[] c = this.C;
                final int n8 = n3 * 3 * 3 + n5 * 3 + n7;
                ++c[n8];
            }
            String string2 = string;
            for (int k = n; k < 27; ++k) {
                string2 = string2 + ", " + this.C[k];
            }
            this.c(string2);
        }
    }
    
    public final void a(final CellWorld cellWorld, final boolean b) {
        if (this.q == -1) {
            final int z = cellWorld.z;
            final double f = cellWorld.f();
            final double m = cellWorld.M;
            if (this.u.getCurrentItem() == 0) {
                final o o = (o)this.b(0);
                if (o != null && o.b != null) {
                    o.b.post((Runnable)new Runnable() {
                        @Override
                        public final void run() {
                            o.a(o.this).setText((CharSequence)o.a(o.this, z, f, m));
                        }
                    });
                }
            }
        }
        else {
            final int z2 = cellWorld.z;
            final int b2 = cellWorld.b(0);
            final int b3 = cellWorld.b(3);
            final int b4 = cellWorld.b(6);
            final int b5 = cellWorld.b(1);
            final int d = cellWorld.d();
            final int e = cellWorld.e();
            final int c = cellWorld.c();
            final int v = cellWorld.V;
            final int w = cellWorld.W;
            final double n = cellWorld.N;
            final double i = cellWorld.M;
            double n2 = 0.0;
            for (int j = 0; j < cellWorld.B; ++j) {
                n2 += cellWorld.A[j].c;
            }
            final double k = cellWorld.M;
            if (this.u.getCurrentItem() == 0) {
                final m l = (m)this.b(0);
                if (l != null) {
                    final i i2 = (i)this.b(2);
                    if (i2 != null) {
                        final int[] f2 = this.F;
                        for (int n3 = 0; n3 < h.B.length; ++n3) {
                            f2[n3] = 0;
                        }
                        if (i2.a != null) {
                            for (int n4 = 0; n4 < 80; ++n4) {
                                final int ordinal = i2.a[n4].s.ordinal();
                                ++f2[ordinal];
                            }
                        }
                    }
                    final int[] f3 = this.F;
                    if (l.b != 0 && l.b != 1) {
                        final int b6 = l.b;
                        l.d = (l.d || b);
                        final boolean d2 = l.d;
                        final boolean e2 = l.e;
                        if (l.a != null) {
                            l.a.post((Runnable)new Runnable() {
                                @Override
                                public final void run() {
                                    com.saterskog.cell_lab.m.a(com.saterskog.cell_lab.m.this).setText((CharSequence)com.saterskog.cell_lab.m.a(com.saterskog.cell_lab.m.this, d2, e2, b2, b3, b4, d, e, c, b5, z2, k, b6, v, w, n, i, f3));
                                }
                            });
                        }
                    }
                }
            }
        }
    }
    
    public final void a(final Environment environment) {
        final p p = (p)this.b(1);
        if (p != null && p.a != null) {
            p.a.queueEvent((Runnable)new Runnable() {
                @Override
                public final void run() {
                    final q a = p.a.a;
                    final Environment b = environment;
                    a.t = true;
                    a.s.a(b);
                }
            });
        }
    }
    
    public final void a(final short n) {
        if (this.w) {
            this.y.play(this.B[n], 1.0f, 1.0f, 1, 0, 1.0f);
        }
    }
    
    public final boolean a(int h) {
        switch (h) {
            case 0: {
                this.M.setImageResource(2131165290);
                this.H = 0;
                this.a((short)11);
                break;
            }
            case 1: {
                this.M.setImageResource(2131165291);
                this.H = 1;
                this.a((short)11);
                break;
            }
            case 2: {
                this.M.setImageResource(2131165289);
                this.H = 2;
                this.a((short)11);
                break;
            }
            case 3: {
                this.M.setImageResource(2131165292);
                this.H = 3;
                this.a((short)11);
                break;
            }
        }
        h = this.H;
        final p p = (p)this.b(1);
        if (h == 1) {
            com.saterskog.cell_lab.t.a(this, 0, 4, 3000);
        }
        if (h == 2) {
            com.saterskog.cell_lab.t.a(this, 0, 5, 2000);
        }
        if (p != null) {
            p.a.queueEvent((Runnable)new Runnable() {
                @Override
                public final void run() {
                    p.a.a.O = h;
                }
            });
        }
        return true;
    }
    
    public final Gene[] a() {
        final p p = (p)this.b(1);
        Gene[] c;
        if (p != null && p.a != null) {
            c = p.a.a.c();
        }
        else {
            c = null;
        }
        return c;
    }
    
    public final Fragment b(final int n) {
        return this.getFragmentManager().findFragmentByTag("android:switcher:" + this.u.getId() + ":" + (long)n);
    }
    
    final InputStream b() {
        InputStream inputStream = null;
        com.saterskog.b.a.b("old: " + this.o);
        com.saterskog.b.a.b("external: " + this.p);
        com.saterskog.b.a.b("mUri: " + this.L);
        com.saterskog.b.a.b("loadChallenge: " + this.s);
        com.saterskog.b.a.b("name: " + this.t);
        if (this.o) {
            Label_0165: {
                if (!this.p) {
                    break Label_0165;
                }
                try {
                    inputStream = new BufferedInputStream(this.getContentResolver().openInputStream(this.L));
                    return inputStream;
                }
                catch (FileNotFoundException ex) {
                    ex.printStackTrace();
                    inputStream = null;
                    return inputStream;
                }
            }
            if (this.s == -1) {
                try {
                    inputStream = new BufferedInputStream(this.openFileInput(f.a(this.t)));
                    return inputStream;
                }
                catch (FileNotFoundException ex3) {
                    throw new RuntimeException("file not found");
                }
            }
            try {
                inputStream = new BufferedInputStream(this.getAssets().open(j.h(this.s, (Context)this)));
                return inputStream;
            }
            catch (StreamCorruptedException ex2) {
                ex2.printStackTrace();
                inputStream = null;
                return inputStream;
            }
            catch (IOException ex4) {
                throw new RuntimeException("io41");
            }
        }
        return inputStream;
    }
    
    public final Environment c() {
        return this.G;
    }
    
    public final void d() {
        this.a((short)5);
    }
    
    public final void e() {
        final p p = (p)this.b(1);
        if (this.q == -1) {
            if (PreferenceManager.getDefaultSharedPreferences((Context)this).getBoolean("ask_sterilize_sample", true)) {
                this.a((short)11);
                final AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder((Context)this);
                alertDialog$Builder.setTitle((CharSequence)this.getString(2131624039));
                alertDialog$Builder.setMessage((CharSequence)this.getString(2131624038));
                alertDialog$Builder.setPositiveButton((CharSequence)this.getString(2131624028), (DialogInterface$OnClickListener)new DialogInterface$OnClickListener() {
                    public final void onClick(final DialogInterface dialogInterface, final int n) {
                        p.a.queueEvent((Runnable)new Runnable() {
                            @Override
                            public final void run() {
                                p.a.a.P = true;
                            }
                        });
                    }
                });
                alertDialog$Builder.setNegativeButton((CharSequence)this.getString(2131624027), (DialogInterface$OnClickListener)new DialogInterface$OnClickListener() {
                    public final void onClick(final DialogInterface dialogInterface, final int n) {
                        dialogInterface.cancel();
                    }
                });
                final AlertDialog create = alertDialog$Builder.create();
                create.show();
                final View viewById = create.findViewById(create.getContext().getResources().getIdentifier("android:id/titleDivider", (String)null, (String)null));
                if (viewById != null) {
                    viewById.setBackgroundColor(this.getResources().getColor(2131034132));
                }
            }
            else {
                p.a.queueEvent((Runnable)new Runnable() {
                    @Override
                    public final void run() {
                        p.a.a.P = true;
                    }
                });
            }
        }
        else {
            this.a((short)0);
            p.a.queueEvent((Runnable)new Runnable() {
                final /* synthetic */ int b = PlayActivity.this.q;
                
                @Override
                public final void run() {
                    try {
                        p.a.a.a(PlayActivity.this.getAssets().open(j.h(this.b, (Context)PlayActivity.this)), 0);
                    }
                    catch (StreamCorruptedException ex) {
                        ex.printStackTrace();
                    }
                    catch (IOException ex2) {
                        ex2.printStackTrace();
                    }
                }
            });
        }
        com.saterskog.cell_lab.t.b(this, 0, 9);
    }
    
    public final Gene[] f() {
        return ((i)this.b(2)).a;
    }
    
    public final boolean g() {
        return this.w;
    }
    
    public final void h() {
        final long lng = j.b((Context)this, this.q) + (com.saterskog.b.a.c() - this.K);
        com.saterskog.b.a.a("win:playTime", ((j.a)j.a.get(this.q)).b, com.saterskog.b.a.a(lng), lng, this);
        final long b = com.saterskog.b.a.b((Context)this);
        com.saterskog.b.a.a("win:installTime", ((j.a)j.a.get(this.q)).b, com.saterskog.b.a.a(b), b, this);
        com.saterskog.b.a.a("win:id_play_now_install", ((j.a)j.a.get(this.q)).b + "," + lng + "," + com.saterskog.b.a.c() + "," + com.saterskog.b.a.a((Context)this), "", b, this);
    }
    
    @Override
    public void onBackPressed() {
        this.i();
    }
    
    public void onClick(final View view) {
        if (view.getId() == 2131230824) {
            if (this.q == -1) {
                Integer[] array;
                if (this.O == null) {
                    array = new Integer[2];
                }
                else {
                    array = new Integer[3];
                }
                for (int i = 0; i < array.length; ++i) {
                    array[i] = new Integer(i);
                }
                final AlertDialog show = new AlertDialog$Builder((Context)this).setAdapter((ListAdapter)new ArrayAdapter<Integer>((Context)this, array) {
                    public final View getView(final int n, final View view, final ViewGroup viewGroup) {
                        final View view2 = super.getView(n, view, viewGroup);
                        final TextView textView = (TextView)view2.findViewById(16908308);
                        int n2;
                        if (n == 0) {
                            n2 = 2131165277;
                            textView.setText((CharSequence)(PlayActivity.this.getString(2131624201) + "..."));
                        }
                        else {
                            n2 = 0;
                        }
                        int n3 = n2;
                        if (n == array.length - 2) {
                            n3 = n2;
                            if (PlayActivity.this.O != null) {
                                n3 = 2131165276;
                                textView.setText(2131624256);
                            }
                        }
                        if (n == array.length - 1) {
                            n3 = 2131165275;
                            textView.setText(2131624257);
                        }
                        textView.setCompoundDrawablesWithIntrinsicBounds(n3, 0, 0, 0);
                        return view2;
                    }
                }, (DialogInterface$OnClickListener)new DialogInterface$OnClickListener() {
                    public final void onClick(final DialogInterface dialogInterface, final int n) {
                        if (n == 0) {
                            PlayActivity.f(PlayActivity.this);
                        }
                        if (n == array.length - 2 && PlayActivity.this.O != null) {
                            if (PreferenceManager.getDefaultSharedPreferences((Context)PlayActivity.this).getBoolean("ask_sterilize_sample", true)) {
                                PlayActivity.this.a((short)11);
                                final AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder((Context)PlayActivity.this);
                                alertDialog$Builder.setTitle(2131624036);
                                alertDialog$Builder.setMessage((CharSequence)PlayActivity.this.getString(2131624038));
                                alertDialog$Builder.setPositiveButton((CharSequence)PlayActivity.this.getString(2131624028), (DialogInterface$OnClickListener)new DialogInterface$OnClickListener() {
                                    public final void onClick(final DialogInterface dialogInterface, final int n) {
                                        PlayActivity.g(PlayActivity.this);
                                    }
                                });
                                alertDialog$Builder.setNegativeButton((CharSequence)PlayActivity.this.getString(2131624027), (DialogInterface$OnClickListener)new DialogInterface$OnClickListener() {
                                    public final void onClick(final DialogInterface dialogInterface, final int n) {
                                        dialogInterface.cancel();
                                    }
                                });
                                final AlertDialog create = alertDialog$Builder.create();
                                create.show();
                                final View viewById = create.findViewById(create.getContext().getResources().getIdentifier("android:id/titleDivider", (String)null, (String)null));
                                if (viewById != null) {
                                    viewById.setBackgroundColor(PlayActivity.this.getResources().getColor(2131034132));
                                }
                            }
                            else {
                                PlayActivity.g(PlayActivity.this);
                            }
                        }
                        if (n == array.length - 1) {
                            PlayActivity.this.e();
                        }
                        PlayActivity.this.a((short)11);
                    }
                }).setTitle(2131624211).show();
                final View viewById = show.findViewById(show.getContext().getResources().getIdentifier("android:id/titleDivider", (String)null, (String)null));
                if (viewById != null) {
                    viewById.setBackgroundColor(this.getResources().getColor(2131034132));
                }
            }
            else if (PreferenceManager.getDefaultSharedPreferences((Context)this).getBoolean("ask_sterilize_sample", true)) {
                this.a((short)11);
                final AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder((Context)this);
                alertDialog$Builder.setTitle(2131624036);
                alertDialog$Builder.setMessage((CharSequence)this.getString(2131624038));
                alertDialog$Builder.setPositiveButton(2131624030, (DialogInterface$OnClickListener)new DialogInterface$OnClickListener() {
                    public final void onClick(final DialogInterface dialogInterface, final int n) {
                        PlayActivity.this.e();
                    }
                });
                alertDialog$Builder.setNegativeButton((CharSequence)this.getString(2131624027), (DialogInterface$OnClickListener)new DialogInterface$OnClickListener() {
                    public final void onClick(final DialogInterface dialogInterface, final int n) {
                        dialogInterface.cancel();
                    }
                });
                final AlertDialog create = alertDialog$Builder.create();
                create.show();
                final View viewById2 = create.findViewById(create.getContext().getResources().getIdentifier("android:id/titleDivider", (String)null, (String)null));
                if (viewById2 != null) {
                    viewById2.setBackgroundColor(this.getResources().getColor(2131034132));
                }
            }
            else {
                this.e();
            }
        }
        if (view.getId() == 2131230924) {
            this.a((short)9);
            final String[] stringArray = this.getResources().getStringArray(2130837515);
            int n;
            if (this.x) {
                n = 4;
            }
            else {
                n = 3;
            }
            final CharSequence[] array2 = new CharSequence[n];
            this.getResources().getColor(2131034160);
            array2[0] = stringArray[0];
            int n2;
            if (this.x) {
                array2[1] = stringArray[3];
                n2 = 2;
            }
            else {
                n2 = 1;
            }
            array2[n2] = stringArray[1];
            array2[n2 + 1] = stringArray[2];
            final AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder((Context)this);
            alertDialog$Builder2.setTitle(2131624281);
            if (this.H == 0) {
                alertDialog$Builder2.setIcon(2131165290);
            }
            if (this.H == 1) {
                alertDialog$Builder2.setIcon(2131165291);
            }
            if (this.H == 2) {
                alertDialog$Builder2.setIcon(2131165289);
            }
            if (this.H == 3) {
                alertDialog$Builder2.setIcon(2131165292);
            }
            alertDialog$Builder2.setItems(array2, (DialogInterface$OnClickListener)new DialogInterface$OnClickListener() {
                public final void onClick(final DialogInterface dialogInterface, final int n) {
                    if (PlayActivity.this.x) {
                        if (n == 0) {
                            PlayActivity.this.a(0);
                        }
                        if (n == 1) {
                            PlayActivity.this.a(3);
                        }
                        if (n == 2) {
                            PlayActivity.this.a(1);
                        }
                        if (n == 3) {
                            PlayActivity.this.a(2);
                        }
                    }
                    else {
                        if (n == 0) {
                            PlayActivity.this.a(0);
                        }
                        if (n == 1) {
                            PlayActivity.this.a(1);
                        }
                        if (n == 2) {
                            PlayActivity.this.a(2);
                        }
                    }
                }
            });
            final AlertDialog create2 = alertDialog$Builder2.create();
            create2.setCanceledOnTouchOutside(true);
            create2.show();
            final View viewById3 = create2.findViewById(create2.getContext().getResources().getIdentifier("android:id/titleDivider", (String)null, (String)null));
            if (viewById3 != null) {
                viewById3.setBackgroundColor(this.getResources().getColor(2131034132));
            }
        }
        if (view.getId() == 2131230962) {
            this.a((short)9);
            this.k();
        }
    }
    
    protected void onCreate(final Bundle p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: istore_2       
        //     2: aload_0        
        //     3: aload_1        
        //     4: invokespecial   android/support/v4/app/e.onCreate:(Landroid/os/Bundle;)V
        //     7: aload_0        
        //     8: invokestatic    com/saterskog/cell_lab/CellLabApplication.a:(Landroid/app/Activity;)V
        //    11: aload_0        
        //    12: invokestatic    android/preference/PreferenceManager.getDefaultSharedPreferences:(Landroid/content/Context;)Landroid/content/SharedPreferences;
        //    15: astore_3       
        //    16: aload_3        
        //    17: ldc_w           "keep_on"
        //    20: iconst_0       
        //    21: invokeinterface android/content/SharedPreferences.getBoolean:(Ljava/lang/String;Z)Z
        //    26: ifeq            39
        //    29: aload_0        
        //    30: invokevirtual   com/saterskog/cell_lab/PlayActivity.getWindow:()Landroid/view/Window;
        //    33: sipush          128
        //    36: invokevirtual   android/view/Window.addFlags:(I)V
        //    39: aload_0        
        //    40: invokevirtual   com/saterskog/cell_lab/PlayActivity.getWindow:()Landroid/view/Window;
        //    43: sipush          1024
        //    46: invokevirtual   android/view/Window.addFlags:(I)V
        //    49: aload_0        
        //    50: aload_3        
        //    51: ldc_w           "sound_effects"
        //    54: iconst_1       
        //    55: invokeinterface android/content/SharedPreferences.getBoolean:(Ljava/lang/String;Z)Z
        //    60: putfield        com/saterskog/cell_lab/PlayActivity.w:Z
        //    63: aload_0        
        //    64: getfield        com/saterskog/cell_lab/PlayActivity.w:Z
        //    67: ifeq            325
        //    70: getstatic       android/os/Build$VERSION.SDK_INT:I
        //    73: bipush          21
        //    75: if_icmplt       552
        //    78: aload_0        
        //    79: new             Landroid/media/SoundPool$Builder;
        //    82: dup            
        //    83: invokespecial   android/media/SoundPool$Builder.<init>:()V
        //    86: iconst_3       
        //    87: invokevirtual   android/media/SoundPool$Builder.setMaxStreams:(I)Landroid/media/SoundPool$Builder;
        //    90: invokevirtual   android/media/SoundPool$Builder.build:()Landroid/media/SoundPool;
        //    93: putfield        com/saterskog/cell_lab/PlayActivity.y:Landroid/media/SoundPool;
        //    96: aload_0        
        //    97: getfield        com/saterskog/cell_lab/PlayActivity.w:Z
        //   100: ifeq            325
        //   103: aload_0        
        //   104: getfield        com/saterskog/cell_lab/PlayActivity.B:[I
        //   107: bipush          8
        //   109: aload_0        
        //   110: getfield        com/saterskog/cell_lab/PlayActivity.y:Landroid/media/SoundPool;
        //   113: aload_0        
        //   114: ldc_w           2131558446
        //   117: iconst_1       
        //   118: invokevirtual   android/media/SoundPool.load:(Landroid/content/Context;II)I
        //   121: iastore        
        //   122: aload_0        
        //   123: getfield        com/saterskog/cell_lab/PlayActivity.B:[I
        //   126: iconst_2       
        //   127: aload_0        
        //   128: getfield        com/saterskog/cell_lab/PlayActivity.y:Landroid/media/SoundPool;
        //   131: aload_0        
        //   132: ldc_w           2131558415
        //   135: iconst_1       
        //   136: invokevirtual   android/media/SoundPool.load:(Landroid/content/Context;II)I
        //   139: iastore        
        //   140: aload_0        
        //   141: getfield        com/saterskog/cell_lab/PlayActivity.B:[I
        //   144: iconst_1       
        //   145: aload_0        
        //   146: getfield        com/saterskog/cell_lab/PlayActivity.y:Landroid/media/SoundPool;
        //   149: aload_0        
        //   150: ldc_w           2131558424
        //   153: iconst_1       
        //   154: invokevirtual   android/media/SoundPool.load:(Landroid/content/Context;II)I
        //   157: iastore        
        //   158: aload_0        
        //   159: getfield        com/saterskog/cell_lab/PlayActivity.B:[I
        //   162: iconst_0       
        //   163: aload_0        
        //   164: getfield        com/saterskog/cell_lab/PlayActivity.y:Landroid/media/SoundPool;
        //   167: aload_0        
        //   168: ldc_w           2131558453
        //   171: iconst_1       
        //   172: invokevirtual   android/media/SoundPool.load:(Landroid/content/Context;II)I
        //   175: iastore        
        //   176: aload_0        
        //   177: getfield        com/saterskog/cell_lab/PlayActivity.B:[I
        //   180: iconst_3       
        //   181: aload_0        
        //   182: getfield        com/saterskog/cell_lab/PlayActivity.y:Landroid/media/SoundPool;
        //   185: aload_0        
        //   186: ldc_w           2131558444
        //   189: iconst_1       
        //   190: invokevirtual   android/media/SoundPool.load:(Landroid/content/Context;II)I
        //   193: iastore        
        //   194: aload_0        
        //   195: getfield        com/saterskog/cell_lab/PlayActivity.B:[I
        //   198: iconst_4       
        //   199: aload_0        
        //   200: getfield        com/saterskog/cell_lab/PlayActivity.y:Landroid/media/SoundPool;
        //   203: aload_0        
        //   204: ldc_w           2131558463
        //   207: iconst_1       
        //   208: invokevirtual   android/media/SoundPool.load:(Landroid/content/Context;II)I
        //   211: iastore        
        //   212: aload_0        
        //   213: getfield        com/saterskog/cell_lab/PlayActivity.B:[I
        //   216: iconst_5       
        //   217: aload_0        
        //   218: getfield        com/saterskog/cell_lab/PlayActivity.y:Landroid/media/SoundPool;
        //   221: aload_0        
        //   222: ldc_w           2131558458
        //   225: iconst_1       
        //   226: invokevirtual   android/media/SoundPool.load:(Landroid/content/Context;II)I
        //   229: iastore        
        //   230: aload_0        
        //   231: getfield        com/saterskog/cell_lab/PlayActivity.B:[I
        //   234: bipush          6
        //   236: aload_0        
        //   237: getfield        com/saterskog/cell_lab/PlayActivity.y:Landroid/media/SoundPool;
        //   240: aload_0        
        //   241: ldc_w           2131558408
        //   244: iconst_1       
        //   245: invokevirtual   android/media/SoundPool.load:(Landroid/content/Context;II)I
        //   248: iastore        
        //   249: aload_0        
        //   250: getfield        com/saterskog/cell_lab/PlayActivity.B:[I
        //   253: bipush          7
        //   255: aload_0        
        //   256: getfield        com/saterskog/cell_lab/PlayActivity.y:Landroid/media/SoundPool;
        //   259: aload_0        
        //   260: ldc_w           2131558445
        //   263: iconst_1       
        //   264: invokevirtual   android/media/SoundPool.load:(Landroid/content/Context;II)I
        //   267: iastore        
        //   268: aload_0        
        //   269: getfield        com/saterskog/cell_lab/PlayActivity.B:[I
        //   272: bipush          9
        //   274: aload_0        
        //   275: getfield        com/saterskog/cell_lab/PlayActivity.y:Landroid/media/SoundPool;
        //   278: aload_0        
        //   279: ldc_w           2131558408
        //   282: iconst_1       
        //   283: invokevirtual   android/media/SoundPool.load:(Landroid/content/Context;II)I
        //   286: iastore        
        //   287: aload_0        
        //   288: getfield        com/saterskog/cell_lab/PlayActivity.B:[I
        //   291: bipush          10
        //   293: aload_0        
        //   294: getfield        com/saterskog/cell_lab/PlayActivity.y:Landroid/media/SoundPool;
        //   297: aload_0        
        //   298: ldc_w           2131558448
        //   301: iconst_1       
        //   302: invokevirtual   android/media/SoundPool.load:(Landroid/content/Context;II)I
        //   305: iastore        
        //   306: aload_0        
        //   307: getfield        com/saterskog/cell_lab/PlayActivity.B:[I
        //   310: bipush          11
        //   312: aload_0        
        //   313: getfield        com/saterskog/cell_lab/PlayActivity.y:Landroid/media/SoundPool;
        //   316: aload_0        
        //   317: ldc_w           2131558409
        //   320: iconst_1       
        //   321: invokevirtual   android/media/SoundPool.load:(Landroid/content/Context;II)I
        //   324: iastore        
        //   325: aload_3        
        //   326: ldc_w           "log_stats"
        //   329: ldc_w           "none"
        //   332: invokeinterface android/content/SharedPreferences.getString:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
        //   337: ldc_w           "none"
        //   340: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //   343: ifne            587
        //   346: aload_1        
        //   347: ifnull          364
        //   350: aload_0        
        //   351: aload_1        
        //   352: ldc_w           "logFile"
        //   355: invokevirtual   android/os/Bundle.getSerializable:(Ljava/lang/String;)Ljava/io/Serializable;
        //   358: checkcast       Ljava/io/File;
        //   361: putfield        com/saterskog/cell_lab/PlayActivity.D:Ljava/io/File;
        //   364: aload_0        
        //   365: getfield        com/saterskog/cell_lab/PlayActivity.D:Ljava/io/File;
        //   368: ifnonnull       587
        //   371: aload_0        
        //   372: aconst_null    
        //   373: invokevirtual   com/saterskog/cell_lab/PlayActivity.getExternalFilesDir:(Ljava/lang/String;)Ljava/io/File;
        //   376: astore          4
        //   378: aload           4
        //   380: ifnull          391
        //   383: aload           4
        //   385: invokevirtual   java/io/File.exists:()Z
        //   388: ifne            399
        //   391: aload           4
        //   393: invokevirtual   java/io/File.mkdirs:()Z
        //   396: ifeq            1007
        //   399: iconst_0       
        //   400: istore          5
        //   402: iinc            5, 1
        //   405: aload_0        
        //   406: new             Ljava/io/File;
        //   409: dup            
        //   410: new             Ljava/lang/StringBuilder;
        //   413: dup            
        //   414: invokespecial   java/lang/StringBuilder.<init>:()V
        //   417: aload           4
        //   419: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
        //   422: getstatic       java/io/File.separator:Ljava/lang/String;
        //   425: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   428: ldc_w           "stats"
        //   431: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   434: iload           5
        //   436: invokevirtual   java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
        //   439: ldc_w           ".csv"
        //   442: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   445: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   448: invokespecial   java/io/File.<init>:(Ljava/lang/String;)V
        //   451: putfield        com/saterskog/cell_lab/PlayActivity.D:Ljava/io/File;
        //   454: aload_0        
        //   455: getfield        com/saterskog/cell_lab/PlayActivity.D:Ljava/io/File;
        //   458: invokevirtual   java/io/File.exists:()Z
        //   461: ifne            402
        //   464: ldc_w           "time, food mass, number of cell splits, number of cell deaths, "
        //   467: astore          4
        //   469: iconst_0       
        //   470: istore          5
        //   472: iload           5
        //   474: iconst_3       
        //   475: if_icmpge       581
        //   478: iconst_0       
        //   479: istore          6
        //   481: iload           6
        //   483: iconst_3       
        //   484: if_icmpge       575
        //   487: iconst_0       
        //   488: istore          7
        //   490: iload           7
        //   492: iconst_3       
        //   493: if_icmpge       569
        //   496: new             Ljava/lang/StringBuilder;
        //   499: dup            
        //   500: invokespecial   java/lang/StringBuilder.<init>:()V
        //   503: aload           4
        //   505: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   508: ldc_w           ", r"
        //   511: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   514: iload           5
        //   516: invokevirtual   java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
        //   519: ldc_w           "g"
        //   522: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   525: iload           6
        //   527: invokevirtual   java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
        //   530: ldc_w           "b"
        //   533: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   536: iload           7
        //   538: invokevirtual   java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
        //   541: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   544: astore          4
        //   546: iinc            7, 1
        //   549: goto            490
        //   552: aload_0        
        //   553: new             Landroid/media/SoundPool;
        //   556: dup            
        //   557: iconst_3       
        //   558: iconst_3       
        //   559: iconst_0       
        //   560: invokespecial   android/media/SoundPool.<init>:(III)V
        //   563: putfield        com/saterskog/cell_lab/PlayActivity.y:Landroid/media/SoundPool;
        //   566: goto            96
        //   569: iinc            6, 1
        //   572: goto            481
        //   575: iinc            5, 1
        //   578: goto            472
        //   581: aload_0        
        //   582: aload           4
        //   584: invokespecial   com/saterskog/cell_lab/PlayActivity.c:(Ljava/lang/String;)V
        //   587: aload_0        
        //   588: ldc_w           2131361820
        //   591: invokevirtual   com/saterskog/cell_lab/PlayActivity.setContentView:(I)V
        //   594: aload_1        
        //   595: ifnull          1027
        //   598: aload_0        
        //   599: aload_1        
        //   600: ldc_w           "ienv"
        //   603: invokevirtual   android/os/Bundle.getParcelable:(Ljava/lang/String;)Landroid/os/Parcelable;
        //   606: checkcast       Lcom/saterskog/cell_lab/Environment;
        //   609: putfield        com/saterskog/cell_lab/PlayActivity.G:Lcom/saterskog/cell_lab/Environment;
        //   612: aload_0        
        //   613: aload_1        
        //   614: ldc_w           "mUri"
        //   617: invokevirtual   android/os/Bundle.getParcelable:(Ljava/lang/String;)Landroid/os/Parcelable;
        //   620: checkcast       Landroid/net/Uri;
        //   623: putfield        com/saterskog/cell_lab/PlayActivity.L:Landroid/net/Uri;
        //   626: aload_0        
        //   627: aload_1        
        //   628: ldc_w           "challenge"
        //   631: invokevirtual   android/os/Bundle.getInt:(Ljava/lang/String;)I
        //   634: putfield        com/saterskog/cell_lab/PlayActivity.q:I
        //   637: aload_0        
        //   638: aload_1        
        //   639: ldc_w           "tutorial"
        //   642: invokevirtual   android/os/Bundle.getInt:(Ljava/lang/String;)I
        //   645: putfield        com/saterskog/cell_lab/PlayActivity.r:I
        //   648: aload_0        
        //   649: aload_1        
        //   650: ldc_w           "plateName"
        //   653: invokevirtual   android/os/Bundle.getString:(Ljava/lang/String;)Ljava/lang/String;
        //   656: putfield        com/saterskog/cell_lab/PlayActivity.O:Ljava/lang/String;
        //   659: aload_0        
        //   660: aload_1        
        //   661: ldc_w           "name"
        //   664: invokevirtual   android/os/Bundle.getString:(Ljava/lang/String;)Ljava/lang/String;
        //   667: putfield        com/saterskog/cell_lab/PlayActivity.t:Ljava/lang/String;
        //   670: aload_0        
        //   671: aload_1        
        //   672: ldc_w           "loadChallenge"
        //   675: invokevirtual   android/os/Bundle.getInt:(Ljava/lang/String;)I
        //   678: putfield        com/saterskog/cell_lab/PlayActivity.s:I
        //   681: aload_0        
        //   682: aload_1        
        //   683: ldc_w           "old"
        //   686: invokevirtual   android/os/Bundle.getBoolean:(Ljava/lang/String;)Z
        //   689: putfield        com/saterskog/cell_lab/PlayActivity.o:Z
        //   692: aload_0        
        //   693: aload_1        
        //   694: ldc_w           "external"
        //   697: invokevirtual   android/os/Bundle.getBoolean:(Ljava/lang/String;)Z
        //   700: putfield        com/saterskog/cell_lab/PlayActivity.p:Z
        //   703: aload_0        
        //   704: invokevirtual   com/saterskog/cell_lab/PlayActivity.getActionBar:()Landroid/app/ActionBar;
        //   707: astore          8
        //   709: aload_0        
        //   710: getfield        com/saterskog/cell_lab/PlayActivity.O:Ljava/lang/String;
        //   713: ifnonnull       1849
        //   716: aload_0        
        //   717: ldc_w           2131624075
        //   720: invokevirtual   com/saterskog/cell_lab/PlayActivity.getString:(I)Ljava/lang/String;
        //   723: astore          4
        //   725: aload           8
        //   727: aload           4
        //   729: invokevirtual   android/app/ActionBar.setTitle:(Ljava/lang/CharSequence;)V
        //   732: aload_0        
        //   733: invokevirtual   com/saterskog/cell_lab/PlayActivity.getActionBar:()Landroid/app/ActionBar;
        //   736: new             Landroid/graphics/drawable/ColorDrawable;
        //   739: dup            
        //   740: aload_0        
        //   741: invokevirtual   com/saterskog/cell_lab/PlayActivity.getResources:()Landroid/content/res/Resources;
        //   744: ldc_w           17170445
        //   747: invokevirtual   android/content/res/Resources.getColor:(I)I
        //   750: invokespecial   android/graphics/drawable/ColorDrawable.<init>:(I)V
        //   753: invokevirtual   android/app/ActionBar.setIcon:(Landroid/graphics/drawable/Drawable;)V
        //   756: aload_3        
        //   757: ldc_w           "music"
        //   760: iconst_1       
        //   761: invokeinterface android/content/SharedPreferences.getBoolean:(Ljava/lang/String;Z)Z
        //   766: ifeq            853
        //   769: aload_0        
        //   770: getfield        com/saterskog/cell_lab/PlayActivity.q:I
        //   773: iconst_m1      
        //   774: if_icmpne       1858
        //   777: aload_0        
        //   778: aload_0        
        //   779: ldc_w           2131558416
        //   782: invokestatic    android/media/MediaPlayer.create:(Landroid/content/Context;I)Landroid/media/MediaPlayer;
        //   785: putfield        com/saterskog/cell_lab/PlayActivity.z:Landroid/media/MediaPlayer;
        //   788: aload_0        
        //   789: getfield        com/saterskog/cell_lab/PlayActivity.z:Landroid/media/MediaPlayer;
        //   792: iconst_1       
        //   793: invokevirtual   android/media/MediaPlayer.setLooping:(Z)V
        //   796: aload_0        
        //   797: getfield        com/saterskog/cell_lab/PlayActivity.z:Landroid/media/MediaPlayer;
        //   800: ldc_w           0.5
        //   803: ldc_w           0.5
        //   806: invokevirtual   android/media/MediaPlayer.setVolume:(FF)V
        //   809: aload_1        
        //   810: ifnull          846
        //   813: aload_1        
        //   814: ldc_w           "song_pos"
        //   817: iconst_m1      
        //   818: invokevirtual   android/os/Bundle.getInt:(Ljava/lang/String;I)I
        //   821: istore          5
        //   823: iload           5
        //   825: iconst_m1      
        //   826: if_icmpeq       846
        //   829: aload_0        
        //   830: iload           5
        //   832: putfield        com/saterskog/cell_lab/PlayActivity.A:I
        //   835: aload_0        
        //   836: getfield        com/saterskog/cell_lab/PlayActivity.z:Landroid/media/MediaPlayer;
        //   839: aload_0        
        //   840: getfield        com/saterskog/cell_lab/PlayActivity.A:I
        //   843: invokevirtual   android/media/MediaPlayer.seekTo:(I)V
        //   846: aload_0        
        //   847: getfield        com/saterskog/cell_lab/PlayActivity.z:Landroid/media/MediaPlayer;
        //   850: invokevirtual   android/media/MediaPlayer.start:()V
        //   853: aload_3        
        //   854: ldc_w           "slow_motion"
        //   857: iconst_0       
        //   858: invokeinterface android/content/SharedPreferences.getBoolean:(Ljava/lang/String;Z)Z
        //   863: ifeq            1872
        //   866: aload_0        
        //   867: getfield        com/saterskog/cell_lab/PlayActivity.q:I
        //   870: iconst_m1      
        //   871: if_icmpne       1872
        //   874: iconst_1       
        //   875: istore          9
        //   877: aload_0        
        //   878: iload           9
        //   880: putfield        com/saterskog/cell_lab/PlayActivity.x:Z
        //   883: aload_0        
        //   884: new             Lcom/saterskog/cell_lab/PlayActivity$a;
        //   887: dup            
        //   888: aload_0        
        //   889: aload_0        
        //   890: invokevirtual   com/saterskog/cell_lab/PlayActivity.getFragmentManager:()Landroid/app/FragmentManager;
        //   893: invokespecial   com/saterskog/cell_lab/PlayActivity$a.<init>:(Lcom/saterskog/cell_lab/PlayActivity;Landroid/app/FragmentManager;)V
        //   896: putfield        com/saterskog/cell_lab/PlayActivity.n:Lcom/saterskog/cell_lab/PlayActivity$a;
        //   899: aload_0        
        //   900: aload_0        
        //   901: ldc             2131230813
        //   903: invokevirtual   com/saterskog/cell_lab/PlayActivity.findViewById:(I)Landroid/view/View;
        //   906: checkcast       Lcom/saterskog/cell_lab/CustomViewPager;
        //   909: putfield        com/saterskog/cell_lab/PlayActivity.u:Lcom/saterskog/cell_lab/CustomViewPager;
        //   912: aload_0        
        //   913: getfield        com/saterskog/cell_lab/PlayActivity.u:Lcom/saterskog/cell_lab/CustomViewPager;
        //   916: aload_0        
        //   917: getfield        com/saterskog/cell_lab/PlayActivity.n:Lcom/saterskog/cell_lab/PlayActivity$a;
        //   920: invokevirtual   com/saterskog/cell_lab/CustomViewPager.setAdapter:(Landroid/support/v4/view/p;)V
        //   923: aload           8
        //   925: iconst_2       
        //   926: invokevirtual   android/app/ActionBar.setNavigationMode:(I)V
        //   929: aload           8
        //   931: iconst_1       
        //   932: invokevirtual   android/app/ActionBar.setDisplayShowTitleEnabled:(Z)V
        //   935: aload_0        
        //   936: invokevirtual   com/saterskog/cell_lab/PlayActivity.getResources:()Landroid/content/res/Resources;
        //   939: astore          4
        //   941: aload_0        
        //   942: getfield        com/saterskog/cell_lab/PlayActivity.q:I
        //   945: iconst_m1      
        //   946: if_icmpne       1878
        //   949: ldc_w           2130837516
        //   952: istore          5
        //   954: aload           4
        //   956: iload           5
        //   958: invokevirtual   android/content/res/Resources.getStringArray:(I)[Ljava/lang/String;
        //   961: astore_3       
        //   962: aload_3        
        //   963: arraylength    
        //   964: istore          6
        //   966: iconst_0       
        //   967: istore          5
        //   969: iload           5
        //   971: iload           6
        //   973: if_icmpge       1886
        //   976: aload_3        
        //   977: iload           5
        //   979: aaload         
        //   980: astore          4
        //   982: aload           8
        //   984: aload           8
        //   986: invokevirtual   android/app/ActionBar.newTab:()Landroid/app/ActionBar$Tab;
        //   989: aload           4
        //   991: invokevirtual   android/app/ActionBar$Tab.setText:(Ljava/lang/CharSequence;)Landroid/app/ActionBar$Tab;
        //   994: aload_0        
        //   995: invokevirtual   android/app/ActionBar$Tab.setTabListener:(Landroid/app/ActionBar$TabListener;)Landroid/app/ActionBar$Tab;
        //   998: invokevirtual   android/app/ActionBar.addTab:(Landroid/app/ActionBar$Tab;)V
        //  1001: iinc            5, 1
        //  1004: goto            969
        //  1007: ldc_w           "couldn't create cell_lab folder"
        //  1010: invokestatic    com/saterskog/b/a.a:(Ljava/lang/String;)V
        //  1013: aload_0        
        //  1014: ldc_w           "Couldn't create log file"
        //  1017: iconst_1       
        //  1018: invokestatic    android/widget/Toast.makeText:(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;
        //  1021: invokevirtual   android/widget/Toast.show:()V
        //  1024: goto            587
        //  1027: aload_0        
        //  1028: invokevirtual   com/saterskog/cell_lab/PlayActivity.getIntent:()Landroid/content/Intent;
        //  1031: astore          8
        //  1033: aload           8
        //  1035: invokevirtual   android/content/Intent.getData:()Landroid/net/Uri;
        //  1038: astore          10
        //  1040: aload           10
        //  1042: ifnonnull       1512
        //  1045: aload_0        
        //  1046: aload           8
        //  1048: ldc_w           "name"
        //  1051: invokevirtual   android/content/Intent.getStringExtra:(Ljava/lang/String;)Ljava/lang/String;
        //  1054: putfield        com/saterskog/cell_lab/PlayActivity.t:Ljava/lang/String;
        //  1057: aload           8
        //  1059: ldc_w           "old"
        //  1062: iconst_0       
        //  1063: invokevirtual   android/content/Intent.getIntExtra:(Ljava/lang/String;I)I
        //  1066: ifeq            1474
        //  1069: iconst_1       
        //  1070: istore          9
        //  1072: aload_0        
        //  1073: iload           9
        //  1075: putfield        com/saterskog/cell_lab/PlayActivity.o:Z
        //  1078: aload           8
        //  1080: ldc_w           "experimentOnChallenge"
        //  1083: iconst_0       
        //  1084: invokevirtual   android/content/Intent.getIntExtra:(Ljava/lang/String;I)I
        //  1087: ifeq            1480
        //  1090: iconst_1       
        //  1091: istore          5
        //  1093: aload_0        
        //  1094: aload           8
        //  1096: ldc_w           "challenge"
        //  1099: iconst_m1      
        //  1100: invokevirtual   android/content/Intent.getIntExtra:(Ljava/lang/String;I)I
        //  1103: putfield        com/saterskog/cell_lab/PlayActivity.q:I
        //  1106: aload_0        
        //  1107: getfield        com/saterskog/cell_lab/PlayActivity.q:I
        //  1110: iconst_m1      
        //  1111: if_icmpeq       1486
        //  1114: aload_0        
        //  1115: aload_0        
        //  1116: invokestatic    com/saterskog/cell_lab/j.b:(Landroid/content/Context;)[Ljava/lang/String;
        //  1119: aload_0        
        //  1120: getfield        com/saterskog/cell_lab/PlayActivity.q:I
        //  1123: aaload         
        //  1124: putfield        com/saterskog/cell_lab/PlayActivity.O:Ljava/lang/String;
        //  1127: aload_0        
        //  1128: iconst_1       
        //  1129: putfield        com/saterskog/cell_lab/PlayActivity.o:Z
        //  1132: aload_0        
        //  1133: aconst_null    
        //  1134: putfield        com/saterskog/cell_lab/PlayActivity.t:Ljava/lang/String;
        //  1137: aload_0        
        //  1138: iconst_0       
        //  1139: putfield        com/saterskog/cell_lab/PlayActivity.p:Z
        //  1142: aload_0        
        //  1143: aload_0        
        //  1144: getfield        com/saterskog/cell_lab/PlayActivity.q:I
        //  1147: putfield        com/saterskog/cell_lab/PlayActivity.s:I
        //  1150: iload           5
        //  1152: ifeq            1160
        //  1155: aload_0        
        //  1156: iconst_m1      
        //  1157: putfield        com/saterskog/cell_lab/PlayActivity.q:I
        //  1160: aload_0        
        //  1161: getfield        com/saterskog/cell_lab/PlayActivity.o:Z
        //  1164: ifne            1838
        //  1167: ldc_w           "aha"
        //  1170: invokestatic    com/saterskog/b/a.b:(Ljava/lang/String;)V
        //  1173: aload_0        
        //  1174: aload           8
        //  1176: ldc_w           "preloadedCW"
        //  1179: invokevirtual   android/content/Intent.getParcelableExtra:(Ljava/lang/String;)Landroid/os/Parcelable;
        //  1182: checkcast       Lcom/saterskog/cell_lab/CellWorld;
        //  1185: putfield        com/saterskog/cell_lab/PlayActivity.v:Lcom/saterskog/cell_lab/CellWorld;
        //  1188: aload_0        
        //  1189: getfield        com/saterskog/cell_lab/PlayActivity.G:Lcom/saterskog/cell_lab/Environment;
        //  1192: ldc2_w          60.0
        //  1195: putfield        com/saterskog/cell_lab/Environment.g:D
        //  1198: aload_0        
        //  1199: getfield        com/saterskog/cell_lab/PlayActivity.G:Lcom/saterskog/cell_lab/Environment;
        //  1202: ldc2_w          10.499999999999998
        //  1205: putfield        com/saterskog/cell_lab/Environment.a:D
        //  1208: aload_0        
        //  1209: getfield        com/saterskog/cell_lab/PlayActivity.G:Lcom/saterskog/cell_lab/Environment;
        //  1212: ldc2_w          0.25
        //  1215: putfield        com/saterskog/cell_lab/Environment.b:D
        //  1218: aload_0        
        //  1219: getfield        com/saterskog/cell_lab/PlayActivity.G:Lcom/saterskog/cell_lab/Environment;
        //  1222: dconst_0       
        //  1223: putfield        com/saterskog/cell_lab/Environment.p:D
        //  1226: aload_0        
        //  1227: getfield        com/saterskog/cell_lab/PlayActivity.G:Lcom/saterskog/cell_lab/Environment;
        //  1230: ldc2_w          0.03
        //  1233: putfield        com/saterskog/cell_lab/Environment.q:D
        //  1236: aload_0        
        //  1237: getfield        com/saterskog/cell_lab/PlayActivity.G:Lcom/saterskog/cell_lab/Environment;
        //  1240: dconst_0       
        //  1241: putfield        com/saterskog/cell_lab/Environment.f:D
        //  1244: aload_0        
        //  1245: getfield        com/saterskog/cell_lab/PlayActivity.G:Lcom/saterskog/cell_lab/Environment;
        //  1248: dconst_0       
        //  1249: putfield        com/saterskog/cell_lab/Environment.c:D
        //  1252: aload_0        
        //  1253: getfield        com/saterskog/cell_lab/PlayActivity.G:Lcom/saterskog/cell_lab/Environment;
        //  1256: ldc_w           0.3
        //  1259: putfield        com/saterskog/cell_lab/Environment.n:F
        //  1262: aload_0        
        //  1263: getfield        com/saterskog/cell_lab/PlayActivity.G:Lcom/saterskog/cell_lab/Environment;
        //  1266: dconst_0       
        //  1267: putfield        com/saterskog/cell_lab/Environment.h:D
        //  1270: aload_0        
        //  1271: getfield        com/saterskog/cell_lab/PlayActivity.G:Lcom/saterskog/cell_lab/Environment;
        //  1274: dconst_0       
        //  1275: putfield        com/saterskog/cell_lab/Environment.i:D
        //  1278: aload_0        
        //  1279: getfield        com/saterskog/cell_lab/PlayActivity.G:Lcom/saterskog/cell_lab/Environment;
        //  1282: dconst_0       
        //  1283: putfield        com/saterskog/cell_lab/Environment.j:D
        //  1286: aload_0        
        //  1287: getfield        com/saterskog/cell_lab/PlayActivity.G:Lcom/saterskog/cell_lab/Environment;
        //  1290: dconst_1       
        //  1291: putfield        com/saterskog/cell_lab/Environment.z:D
        //  1294: aload_0        
        //  1295: getfield        com/saterskog/cell_lab/PlayActivity.G:Lcom/saterskog/cell_lab/Environment;
        //  1298: iconst_0       
        //  1299: putfield        com/saterskog/cell_lab/Environment.w:Z
        //  1302: aload_0        
        //  1303: getfield        com/saterskog/cell_lab/PlayActivity.G:Lcom/saterskog/cell_lab/Environment;
        //  1306: iconst_0       
        //  1307: putfield        com/saterskog/cell_lab/Environment.x:Z
        //  1310: aload_0        
        //  1311: getfield        com/saterskog/cell_lab/PlayActivity.G:Lcom/saterskog/cell_lab/Environment;
        //  1314: iconst_0       
        //  1315: putfield        com/saterskog/cell_lab/Environment.u:Z
        //  1318: aload_0        
        //  1319: getfield        com/saterskog/cell_lab/PlayActivity.G:Lcom/saterskog/cell_lab/Environment;
        //  1322: iconst_1       
        //  1323: putfield        com/saterskog/cell_lab/Environment.v:Z
        //  1326: aload_0        
        //  1327: getfield        com/saterskog/cell_lab/PlayActivity.G:Lcom/saterskog/cell_lab/Environment;
        //  1330: aload           8
        //  1332: ldc_w           "maxCells"
        //  1335: sipush          1000
        //  1338: invokevirtual   android/content/Intent.getIntExtra:(Ljava/lang/String;I)I
        //  1341: putfield        com/saterskog/cell_lab/Environment.r:I
        //  1344: aload_0        
        //  1345: getfield        com/saterskog/cell_lab/PlayActivity.G:Lcom/saterskog/cell_lab/Environment;
        //  1348: aload           8
        //  1350: ldc_w           "maxFoods"
        //  1353: sipush          3500
        //  1356: invokevirtual   android/content/Intent.getIntExtra:(Ljava/lang/String;I)I
        //  1359: putfield        com/saterskog/cell_lab/Environment.s:I
        //  1362: aload_0        
        //  1363: getfield        com/saterskog/cell_lab/PlayActivity.G:Lcom/saterskog/cell_lab/Environment;
        //  1366: aload           8
        //  1368: ldc_w           "radius"
        //  1371: dconst_1       
        //  1372: invokevirtual   android/content/Intent.getDoubleExtra:(Ljava/lang/String;D)D
        //  1375: putfield        com/saterskog/cell_lab/Environment.k:D
        //  1378: aload_0        
        //  1379: getfield        com/saterskog/cell_lab/PlayActivity.q:I
        //  1382: aload_0        
        //  1383: invokestatic    com/saterskog/cell_lab/j.i:(ILandroid/content/Context;)[Z
        //  1386: astore          4
        //  1388: iconst_0       
        //  1389: istore          6
        //  1391: iconst_0       
        //  1392: istore          5
        //  1394: iload           5
        //  1396: getstatic       com/saterskog/cell_lab/h.B:[Lcom/saterskog/cell_lab/h;
        //  1399: arraylength    
        //  1400: if_icmpge       1815
        //  1403: aload_0        
        //  1404: getfield        com/saterskog/cell_lab/PlayActivity.G:Lcom/saterskog/cell_lab/Environment;
        //  1407: getfield        com/saterskog/cell_lab/Environment.t:[Z
        //  1410: astore          8
        //  1412: aload           4
        //  1414: iload           5
        //  1416: baload         
        //  1417: ifeq            1809
        //  1420: iload           5
        //  1422: getstatic       com/saterskog/cell_lab/h.a:Lcom/saterskog/cell_lab/h;
        //  1425: invokevirtual   com/saterskog/cell_lab/h.ordinal:()I
        //  1428: if_icmpeq       1442
        //  1431: iload           5
        //  1433: getstatic       com/saterskog/cell_lab/h.b:Lcom/saterskog/cell_lab/h;
        //  1436: invokevirtual   com/saterskog/cell_lab/h.ordinal:()I
        //  1439: if_icmpne       1809
        //  1442: iconst_1       
        //  1443: istore          9
        //  1445: aload           8
        //  1447: iload           5
        //  1449: iload           9
        //  1451: bastore        
        //  1452: aload_0        
        //  1453: getfield        com/saterskog/cell_lab/PlayActivity.G:Lcom/saterskog/cell_lab/Environment;
        //  1456: getfield        com/saterskog/cell_lab/Environment.t:[Z
        //  1459: iload           5
        //  1461: baload         
        //  1462: ifeq            1468
        //  1465: iconst_1       
        //  1466: istore          6
        //  1468: iinc            5, 1
        //  1471: goto            1394
        //  1474: iconst_0       
        //  1475: istore          9
        //  1477: goto            1072
        //  1480: iconst_0       
        //  1481: istore          5
        //  1483: goto            1093
        //  1486: aload_0        
        //  1487: getfield        com/saterskog/cell_lab/PlayActivity.o:Z
        //  1490: ifeq            1504
        //  1493: aload_0        
        //  1494: aload_0        
        //  1495: getfield        com/saterskog/cell_lab/PlayActivity.t:Ljava/lang/String;
        //  1498: putfield        com/saterskog/cell_lab/PlayActivity.O:Ljava/lang/String;
        //  1501: goto            1137
        //  1504: aload_0        
        //  1505: aconst_null    
        //  1506: putfield        com/saterskog/cell_lab/PlayActivity.O:Ljava/lang/String;
        //  1509: goto            1137
        //  1512: aload_0        
        //  1513: iconst_m1      
        //  1514: putfield        com/saterskog/cell_lab/PlayActivity.q:I
        //  1517: new             Ljava/lang/StringBuilder;
        //  1520: dup            
        //  1521: ldc_w           "scheme: "
        //  1524: invokespecial   java/lang/StringBuilder.<init>:(Ljava/lang/String;)V
        //  1527: aload           8
        //  1529: invokevirtual   android/content/Intent.getScheme:()Ljava/lang/String;
        //  1532: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //  1535: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //  1538: invokestatic    com/saterskog/b/a.b:(Ljava/lang/String;)V
        //  1541: aload_0        
        //  1542: aload           10
        //  1544: invokevirtual   android/net/Uri.getPath:()Ljava/lang/String;
        //  1547: putfield        com/saterskog/cell_lab/PlayActivity.t:Ljava/lang/String;
        //  1550: aload_0        
        //  1551: invokevirtual   com/saterskog/cell_lab/PlayActivity.getContentResolver:()Landroid/content/ContentResolver;
        //  1554: aload           10
        //  1556: invokevirtual   android/content/ContentResolver.openInputStream:(Landroid/net/Uri;)Ljava/io/InputStream;
        //  1559: astore          4
        //  1561: aload           4
        //  1563: ifnull          2346
        //  1566: iconst_1       
        //  1567: istore          5
        //  1569: aload           4
        //  1571: invokevirtual   java/io/InputStream.close:()V
        //  1574: iload           5
        //  1576: istore          6
        //  1578: iload           5
        //  1580: ifeq            1683
        //  1583: new             Ljava/lang/StringBuilder;
        //  1586: dup            
        //  1587: ldc_w           "exists: "
        //  1590: invokespecial   java/lang/StringBuilder.<init>:(Ljava/lang/String;)V
        //  1593: aload_0        
        //  1594: getfield        com/saterskog/cell_lab/PlayActivity.t:Ljava/lang/String;
        //  1597: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //  1600: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //  1603: invokestatic    com/saterskog/b/a.b:(Ljava/lang/String;)V
        //  1606: aload_0        
        //  1607: aload           10
        //  1609: putfield        com/saterskog/cell_lab/PlayActivity.L:Landroid/net/Uri;
        //  1612: aload_0        
        //  1613: aload_0        
        //  1614: getfield        com/saterskog/cell_lab/PlayActivity.t:Ljava/lang/String;
        //  1617: aload_0        
        //  1618: getfield        com/saterskog/cell_lab/PlayActivity.t:Ljava/lang/String;
        //  1621: ldc_w           "/"
        //  1624: invokevirtual   java/lang/String.lastIndexOf:(Ljava/lang/String;)I
        //  1627: iconst_1       
        //  1628: iadd           
        //  1629: invokevirtual   java/lang/String.substring:(I)Ljava/lang/String;
        //  1632: putfield        com/saterskog/cell_lab/PlayActivity.O:Ljava/lang/String;
        //  1635: aload_0        
        //  1636: getfield        com/saterskog/cell_lab/PlayActivity.O:Ljava/lang/String;
        //  1639: invokevirtual   java/lang/String.length:()I
        //  1642: bipush          10
        //  1644: if_icmple       1770
        //  1647: aload_0        
        //  1648: getfield        com/saterskog/cell_lab/PlayActivity.O:Ljava/lang/String;
        //  1651: aload_0        
        //  1652: getfield        com/saterskog/cell_lab/PlayActivity.O:Ljava/lang/String;
        //  1655: invokevirtual   java/lang/String.length:()I
        //  1658: bipush          10
        //  1660: isub           
        //  1661: aload_0        
        //  1662: getfield        com/saterskog/cell_lab/PlayActivity.O:Ljava/lang/String;
        //  1665: invokevirtual   java/lang/String.length:()I
        //  1668: invokevirtual   java/lang/String.substring:(II)Ljava/lang/String;
        //  1671: ldc_w           ".substrate"
        //  1674: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //  1677: ifne            1770
        //  1680: iconst_0       
        //  1681: istore          6
        //  1683: iload           6
        //  1685: ifne            1738
        //  1688: new             Ljava/lang/StringBuilder;
        //  1691: dup            
        //  1692: ldc_w           "doesn't exists: "
        //  1695: invokespecial   java/lang/StringBuilder.<init>:(Ljava/lang/String;)V
        //  1698: aload_0        
        //  1699: getfield        com/saterskog/cell_lab/PlayActivity.t:Ljava/lang/String;
        //  1702: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //  1705: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //  1708: invokestatic    com/saterskog/b/a.b:(Ljava/lang/String;)V
        //  1711: aload_0        
        //  1712: aconst_null    
        //  1713: putfield        com/saterskog/cell_lab/PlayActivity.L:Landroid/net/Uri;
        //  1716: aload_0        
        //  1717: aconst_null    
        //  1718: putfield        com/saterskog/cell_lab/PlayActivity.O:Ljava/lang/String;
        //  1721: aload_0        
        //  1722: ldc_w           ""
        //  1725: putfield        com/saterskog/cell_lab/PlayActivity.t:Ljava/lang/String;
        //  1728: aload_0        
        //  1729: iconst_0       
        //  1730: putfield        com/saterskog/cell_lab/PlayActivity.o:Z
        //  1733: aload_0        
        //  1734: iconst_0       
        //  1735: putfield        com/saterskog/cell_lab/PlayActivity.p:Z
        //  1738: iconst_0       
        //  1739: istore          5
        //  1741: goto            1142
        //  1744: astore          4
        //  1746: iconst_0       
        //  1747: istore          5
        //  1749: aload           4
        //  1751: invokevirtual   java/io/FileNotFoundException.printStackTrace:()V
        //  1754: goto            1574
        //  1757: astore          4
        //  1759: iconst_0       
        //  1760: istore          5
        //  1762: aload           4
        //  1764: invokevirtual   java/io/IOException.printStackTrace:()V
        //  1767: goto            1574
        //  1770: aload_0        
        //  1771: aload_0        
        //  1772: getfield        com/saterskog/cell_lab/PlayActivity.O:Ljava/lang/String;
        //  1775: iconst_0       
        //  1776: aload_0        
        //  1777: getfield        com/saterskog/cell_lab/PlayActivity.O:Ljava/lang/String;
        //  1780: invokevirtual   java/lang/String.length:()I
        //  1783: bipush          10
        //  1785: isub           
        //  1786: invokevirtual   java/lang/String.substring:(II)Ljava/lang/String;
        //  1789: putfield        com/saterskog/cell_lab/PlayActivity.O:Ljava/lang/String;
        //  1792: aload_0        
        //  1793: iconst_1       
        //  1794: putfield        com/saterskog/cell_lab/PlayActivity.o:Z
        //  1797: aload_0        
        //  1798: iconst_1       
        //  1799: putfield        com/saterskog/cell_lab/PlayActivity.p:Z
        //  1802: iload           5
        //  1804: istore          6
        //  1806: goto            1683
        //  1809: iconst_0       
        //  1810: istore          9
        //  1812: goto            1445
        //  1815: iload           6
        //  1817: ifne            703
        //  1820: aload_0        
        //  1821: getfield        com/saterskog/cell_lab/PlayActivity.G:Lcom/saterskog/cell_lab/Environment;
        //  1824: getfield        com/saterskog/cell_lab/Environment.t:[Z
        //  1827: getstatic       com/saterskog/cell_lab/h.c:Lcom/saterskog/cell_lab/h;
        //  1830: invokevirtual   com/saterskog/cell_lab/h.ordinal:()I
        //  1833: iconst_1       
        //  1834: bastore        
        //  1835: goto            703
        //  1838: aload_0        
        //  1839: aload_0        
        //  1840: invokevirtual   com/saterskog/cell_lab/PlayActivity.b:()Ljava/io/InputStream;
        //  1843: invokespecial   com/saterskog/cell_lab/PlayActivity.a:(Ljava/io/InputStream;)V
        //  1846: goto            703
        //  1849: aload_0        
        //  1850: getfield        com/saterskog/cell_lab/PlayActivity.O:Ljava/lang/String;
        //  1853: astore          4
        //  1855: goto            725
        //  1858: aload_0        
        //  1859: aload_0        
        //  1860: ldc_w           2131558412
        //  1863: invokestatic    android/media/MediaPlayer.create:(Landroid/content/Context;I)Landroid/media/MediaPlayer;
        //  1866: putfield        com/saterskog/cell_lab/PlayActivity.z:Landroid/media/MediaPlayer;
        //  1869: goto            788
        //  1872: iconst_0       
        //  1873: istore          9
        //  1875: goto            877
        //  1878: ldc_w           2130837509
        //  1881: istore          5
        //  1883: goto            954
        //  1886: aload_0        
        //  1887: getfield        com/saterskog/cell_lab/PlayActivity.u:Lcom/saterskog/cell_lab/CustomViewPager;
        //  1890: new             Lcom/saterskog/cell_lab/PlayActivity$1;
        //  1893: dup            
        //  1894: aload_0        
        //  1895: invokespecial   com/saterskog/cell_lab/PlayActivity$1.<init>:(Lcom/saterskog/cell_lab/PlayActivity;)V
        //  1898: invokevirtual   com/saterskog/cell_lab/CustomViewPager.setOnPageChangeListener:(Landroid/support/v4/view/ViewPager$f;)V
        //  1901: aload_1        
        //  1902: ifnull          2050
        //  1905: aload           8
        //  1907: aload_1        
        //  1908: ldc_w           "tab"
        //  1911: iconst_0       
        //  1912: invokevirtual   android/os/Bundle.getInt:(Ljava/lang/String;I)I
        //  1915: invokevirtual   android/app/ActionBar.setSelectedNavigationItem:(I)V
        //  1918: aload_0        
        //  1919: aload_1        
        //  1920: ldc_w           "modeSpinner"
        //  1923: iconst_0       
        //  1924: invokevirtual   android/os/Bundle.getInt:(Ljava/lang/String;I)I
        //  1927: putfield        com/saterskog/cell_lab/PlayActivity.H:I
        //  1930: aload_0        
        //  1931: aload_1        
        //  1932: ldc_w           "toolSpinner"
        //  1935: iconst_0       
        //  1936: invokevirtual   android/os/Bundle.getInt:(Ljava/lang/String;I)I
        //  1939: putfield        com/saterskog/cell_lab/PlayActivity.I:I
        //  1942: aload_0        
        //  1943: aload_0        
        //  1944: aload_1        
        //  1945: invokestatic    com/saterskog/cell_lab/t.a:(Lcom/saterskog/cell_lab/PlayActivity;Lcom/saterskog/cell_lab/t$a;Landroid/os/Bundle;)V
        //  1948: aload           8
        //  1950: invokevirtual   android/app/ActionBar.getSelectedNavigationIndex:()I
        //  1953: istore          5
        //  1955: aload_0        
        //  1956: getfield        com/saterskog/cell_lab/PlayActivity.q:I
        //  1959: iconst_m1      
        //  1960: if_icmpne       2188
        //  1963: iload           5
        //  1965: tableswitch {
        //                0: 2158
        //                1: 2168
        //                2: 2178
        //          default: 1992
        //        }
        //  1992: aload_0        
        //  1993: getfield        com/saterskog/cell_lab/PlayActivity.q:I
        //  1996: iconst_m1      
        //  1997: if_icmpeq       2049
        //  2000: aload_0        
        //  2001: aload_0        
        //  2002: getfield        com/saterskog/cell_lab/PlayActivity.q:I
        //  2005: invokestatic    com/saterskog/cell_lab/j.b:(Landroid/content/Context;I)J
        //  2008: lconst_0       
        //  2009: lcmp           
        //  2010: ifne            2049
        //  2013: aload_0        
        //  2014: invokestatic    com/saterskog/b/a.b:(Landroid/content/Context;)J
        //  2017: lstore          11
        //  2019: ldc_w           "start:installTime"
        //  2022: getstatic       com/saterskog/cell_lab/j.a:Ljava/util/ArrayList;
        //  2025: aload_0        
        //  2026: getfield        com/saterskog/cell_lab/PlayActivity.q:I
        //  2029: invokevirtual   java/util/ArrayList.get:(I)Ljava/lang/Object;
        //  2032: checkcast       Lcom/saterskog/cell_lab/j$a;
        //  2035: getfield        com/saterskog/cell_lab/j$a.b:Ljava/lang/String;
        //  2038: lload           11
        //  2040: invokestatic    com/saterskog/b/a.a:(J)Ljava/lang/String;
        //  2043: lload           11
        //  2045: aload_0        
        //  2046: invokestatic    com/saterskog/b/a.a:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JLandroid/app/Activity;)V
        //  2049: return         
        //  2050: aload_0        
        //  2051: iconst_0       
        //  2052: putfield        com/saterskog/cell_lab/PlayActivity.H:I
        //  2055: aload_0        
        //  2056: getfield        com/saterskog/cell_lab/PlayActivity.q:I
        //  2059: iconst_m1      
        //  2060: if_icmpeq       2138
        //  2063: aload_0        
        //  2064: aload_0        
        //  2065: invokestatic    com/saterskog/cell_lab/j.a:(Landroid/content/Context;)Ljava/util/ArrayList;
        //  2068: aload_0        
        //  2069: getfield        com/saterskog/cell_lab/PlayActivity.q:I
        //  2072: invokevirtual   java/util/ArrayList.get:(I)Ljava/lang/Object;
        //  2075: checkcast       Lcom/saterskog/cell_lab/j$a;
        //  2078: getfield        com/saterskog/cell_lab/j$a.i:I
        //  2081: putfield        com/saterskog/cell_lab/PlayActivity.r:I
        //  2084: aload_0        
        //  2085: getfield        com/saterskog/cell_lab/PlayActivity.r:I
        //  2088: iconst_m1      
        //  2089: if_icmpeq       2146
        //  2092: aload_0        
        //  2093: aload_0        
        //  2094: getfield        com/saterskog/cell_lab/PlayActivity.r:I
        //  2097: aload_0        
        //  2098: invokestatic    com/saterskog/cell_lab/t.a:(Lcom/saterskog/cell_lab/PlayActivity;ILcom/saterskog/cell_lab/t$a;)V
        //  2101: aload_0        
        //  2102: invokestatic    com/saterskog/cell_lab/t.a:(Landroid/app/Activity;)V
        //  2105: aload_0        
        //  2106: getfield        com/saterskog/cell_lab/PlayActivity.q:I
        //  2109: invokestatic    com/saterskog/cell_lab/j.a:(I)[Z
        //  2112: astore_1       
        //  2113: iload_2        
        //  2114: istore          5
        //  2116: iload           5
        //  2118: iconst_5       
        //  2119: if_icmpge       1948
        //  2122: aload_1        
        //  2123: iload           5
        //  2125: baload         
        //  2126: ifeq            2152
        //  2129: aload_0        
        //  2130: iload           5
        //  2132: putfield        com/saterskog/cell_lab/PlayActivity.I:I
        //  2135: goto            1948
        //  2138: aload_0        
        //  2139: iconst_m1      
        //  2140: putfield        com/saterskog/cell_lab/PlayActivity.r:I
        //  2143: goto            2084
        //  2146: invokestatic    com/saterskog/cell_lab/t.a:()V
        //  2149: goto            2105
        //  2152: iinc            5, 1
        //  2155: goto            2116
        //  2158: ldc_w           "experiment/sample_info"
        //  2161: aload_0        
        //  2162: invokestatic    com/saterskog/b/a.a:(Ljava/lang/String;Landroid/app/Activity;)V
        //  2165: goto            1992
        //  2168: ldc_w           "experiment/microscope"
        //  2171: aload_0        
        //  2172: invokestatic    com/saterskog/b/a.a:(Ljava/lang/String;Landroid/app/Activity;)V
        //  2175: goto            1992
        //  2178: ldc_w           "experiment/genome_editor"
        //  2181: aload_0        
        //  2182: invokestatic    com/saterskog/b/a.a:(Ljava/lang/String;Landroid/app/Activity;)V
        //  2185: goto            1992
        //  2188: new             Ljava/lang/StringBuilder;
        //  2191: dup            
        //  2192: ldc_w           "level:"
        //  2195: invokespecial   java/lang/StringBuilder.<init>:(Ljava/lang/String;)V
        //  2198: aload_0        
        //  2199: invokestatic    com/saterskog/cell_lab/j.a:(Landroid/content/Context;)Ljava/util/ArrayList;
        //  2202: aload_0        
        //  2203: getfield        com/saterskog/cell_lab/PlayActivity.q:I
        //  2206: invokevirtual   java/util/ArrayList.get:(I)Ljava/lang/Object;
        //  2209: checkcast       Lcom/saterskog/cell_lab/j$a;
        //  2212: getfield        com/saterskog/cell_lab/j$a.b:Ljava/lang/String;
        //  2215: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //  2218: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //  2221: astore_1       
        //  2222: iload           5
        //  2224: tableswitch {
        //                0: 2255
        //                1: 2282
        //                2: 2309
        //          default: 2252
        //        }
        //  2252: goto            1992
        //  2255: new             Ljava/lang/StringBuilder;
        //  2258: dup            
        //  2259: invokespecial   java/lang/StringBuilder.<init>:()V
        //  2262: aload_1        
        //  2263: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //  2266: ldc_w           "/objective"
        //  2269: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //  2272: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //  2275: aload_0        
        //  2276: invokestatic    com/saterskog/b/a.a:(Ljava/lang/String;Landroid/app/Activity;)V
        //  2279: goto            1992
        //  2282: new             Ljava/lang/StringBuilder;
        //  2285: dup            
        //  2286: invokespecial   java/lang/StringBuilder.<init>:()V
        //  2289: aload_1        
        //  2290: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //  2293: ldc_w           "/microscope"
        //  2296: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //  2299: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //  2302: aload_0        
        //  2303: invokestatic    com/saterskog/b/a.a:(Ljava/lang/String;Landroid/app/Activity;)V
        //  2306: goto            1992
        //  2309: new             Ljava/lang/StringBuilder;
        //  2312: dup            
        //  2313: invokespecial   java/lang/StringBuilder.<init>:()V
        //  2316: aload_1        
        //  2317: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //  2320: ldc_w           "/genome_editor"
        //  2323: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //  2326: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //  2329: aload_0        
        //  2330: invokestatic    com/saterskog/b/a.a:(Ljava/lang/String;Landroid/app/Activity;)V
        //  2333: goto            1992
        //  2336: astore          4
        //  2338: goto            1762
        //  2341: astore          4
        //  2343: goto            1749
        //  2346: iconst_0       
        //  2347: istore          5
        //  2349: goto            1569
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                           
        //  -----  -----  -----  -----  -------------------------------
        //  1550   1561   1744   1749   Ljava/io/FileNotFoundException;
        //  1550   1561   1757   1762   Ljava/io/IOException;
        //  1569   1574   2341   2346   Ljava/io/FileNotFoundException;
        //  1569   1574   2336   2341   Ljava/io/IOException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_1569:
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
    
    public boolean onCreateOptionsMenu(final Menu menu) {
        final MenuInflater menuInflater = this.getMenuInflater();
        if (this.q == -1) {
            menuInflater.inflate(2131427328, menu);
        }
        else if (this.r == -1) {
            menuInflater.inflate(2131427329, menu);
        }
        else {
            menuInflater.inflate(2131427330, menu);
            ((Button)menu.findItem(2131230802).getActionView().findViewById(2131230909)).setOnClickListener((View$OnClickListener)new View$OnClickListener() {
                public final void onClick(final View view) {
                    com.saterskog.cell_lab.t.a(PlayActivity.this);
                }
            });
        }
        this.M = (ImageButton)menu.findItem(2131230802).getActionView().findViewById(2131230924);
        this.N = (ImageButton)menu.findItem(2131230802).getActionView().findViewById(2131230962);
        this.M.setOnClickListener((View$OnClickListener)this);
        if (this.H == 0) {
            this.M.setImageResource(2131165290);
        }
        if (this.H == 1) {
            this.M.setImageResource(2131165291);
        }
        if (this.H == 2) {
            this.M.setImageResource(2131165289);
        }
        if (this.H == 3) {
            this.M.setImageResource(2131165292);
        }
        if (this.N != null) {
            this.N.setOnClickListener((View$OnClickListener)this);
            if (this.I == 0) {
                this.N.setImageResource(2131165295);
            }
            if (this.I == 1) {
                this.N.setImageResource(2131165297);
            }
            if (this.I == 2) {
                this.N.setImageResource(2131165294);
            }
            if (this.I == 3) {
                this.N.setImageResource(2131165298);
            }
            if (this.I == 4) {
                this.N.setImageResource(2131165296);
            }
        }
        final View viewById = menu.findItem(2131230802).getActionView().findViewById(2131230824);
        if (viewById == null) {
            com.saterskog.b.a.a("wefwef222");
        }
        (this.J = (ImageButton)viewById).setOnClickListener((View$OnClickListener)this);
        return super.onCreateOptionsMenu(menu);
    }
    
    @Override
    public void onDestroy() {
        if (this.y != null) {
            this.y.release();
            this.y = null;
        }
        if (this.z != null) {
            this.z.release();
            this.z = null;
        }
        super.onDestroy();
    }
    
    @Override
    public final boolean onMenuItemSelected(final int n, final MenuItem menuItem) {
        if (Build$VERSION.SDK_INT < 18 && menuItem.getTitleCondensed() != null) {
            menuItem.setTitleCondensed((CharSequence)menuItem.getTitleCondensed().toString());
        }
        return super.onMenuItemSelected(n, menuItem);
    }
    
    public boolean onOptionsItemSelected(final MenuItem menuItem) {
        boolean onOptionsItemSelected = false;
        switch (menuItem.getItemId()) {
            default: {
                onOptionsItemSelected = super.onOptionsItemSelected(menuItem);
                break;
            }
            case 16908332: {
                this.i();
                onOptionsItemSelected = true;
                break;
            }
        }
        return onOptionsItemSelected;
    }
    
    @Override
    public void onPause() {
        if (this.q != -1 && this.K != -1L) {
            j.a((Context)this, this.q, this.K);
        }
        if (this.z != null) {
            this.z.pause();
            this.A = this.z.getCurrentPosition();
        }
        super.onPause();
    }
    
    @Override
    public void onResume() {
        if (this.q != -1) {
            this.K = com.saterskog.b.a.c();
        }
        if (this.z != null && PreferenceManager.getDefaultSharedPreferences((Context)this).getBoolean("music", true)) {
            this.z.seekTo(this.A);
            this.z.start();
        }
        super.onResume();
    }
    
    protected void onSaveInstanceState(final Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putInt("tab", this.getActionBar().getSelectedNavigationIndex());
        bundle.putInt("modeSpinner", this.H);
        bundle.putInt("toolSpinner", this.I);
        bundle.putInt("challenge", this.q);
        bundle.putInt("tutorial", this.r);
        bundle.putInt("loadChallenge", this.s);
        bundle.putBoolean("old", this.o);
        bundle.putBoolean("external", this.p);
        bundle.putString("plateName", this.O);
        bundle.putString("name", this.t);
        bundle.putParcelable("ienv", (Parcelable)this.G);
        bundle.putParcelable("mUri", (Parcelable)this.L);
        if (this.z != null) {
            bundle.putInt("song_pos", this.z.getCurrentPosition());
        }
        if (this.D != null) {
            bundle.putSerializable("logFile", (Serializable)this.D);
        }
        com.saterskog.cell_lab.t.a(bundle);
    }
    
    public void onTabReselected(final ActionBar$Tab actionBar$Tab, final FragmentTransaction fragmentTransaction) {
        this.c(actionBar$Tab.getPosition());
    }
    
    public void onTabSelected(final ActionBar$Tab actionBar$Tab, final FragmentTransaction fragmentTransaction) {
        this.c(actionBar$Tab.getPosition());
    }
    
    public void onTabUnselected(final ActionBar$Tab actionBar$Tab, final FragmentTransaction fragmentTransaction) {
        this.a((short)6);
    }
    
    public final class a extends d
    {
        public a(final FragmentManager fragmentManager) {
            super(fragmentManager);
        }
        
        @Override
        public final Fragment a(int i) {
            final int n = 0;
            boolean l = false;
            Fragment fragment = null;
            switch (i) {
                default: {
                    com.saterskog.b.a.a("skit:navigated past end");
                    fragment = null;
                    break;
                }
                case 0: {
                    if (PlayActivity.this.q == -1) {
                        fragment = new o();
                        break;
                    }
                    fragment = new m();
                    ((m)fragment).b = PlayActivity.this.q;
                    break;
                }
                case 1: {
                    fragment = new p();
                    ((p)fragment).j = PlayActivity.this.b();
                    ((p)fragment).h = PlayActivity.this.o;
                    ((p)fragment).i = PlayActivity.this.t;
                    ((p)fragment).k = PlayActivity.this.p;
                    if (PlayActivity.this.q != -1) {
                        l = true;
                    }
                    ((p)fragment).l = l;
                    ((p)fragment).c = PlayActivity.this.q;
                    ((p)fragment).d = PlayActivity.this.s;
                    ((p)fragment).f = PlayActivity.this.G.k;
                    ((p)fragment).e = PlayActivity.this.I;
                    break;
                }
                case 2: {
                    fragment = new i();
                    final boolean[] j = com.saterskog.cell_lab.j.i(PlayActivity.this.q, (Context)PlayActivity.this);
                    ((i)fragment).e = new ArrayList<h>();
                    for (i = n; i < h.B.length; ++i) {
                        if (j[i]) {
                            ((i)fragment).e.add(h.B[i]);
                        }
                    }
                    break;
                }
            }
            return fragment;
        }
        
        @Override
        public final int b() {
            return 3;
        }
    }
}
