// 
// Decompiled by Procyon v0.5.36
// 

package com.saterskog.cell_lab;

import android.opengl.GLES20;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;
import android.preference.PreferenceManager;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.LinkedBlockingQueue;
import com.saterskog.b.a;
import android.content.Context;
import android.app.Activity;
import java.io.InputStream;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.io.OutputStream;
import java.util.concurrent.Future;
import android.opengl.GLSurfaceView$Renderer;

public final class q extends d implements GLSurfaceView$Renderer
{
    private static int am;
    public int A;
    public int B;
    float C;
    float[] D;
    Future E;
    Future F;
    public boolean G;
    public float[] H;
    public float[] I;
    final float[] J;
    final float[] K;
    final float[] L;
    public boolean M;
    protected OutputStream N;
    public int O;
    boolean P;
    Gene[] Q;
    final Object R;
    float S;
    float T;
    float[] U;
    float[] V;
    float[] W;
    float[] X;
    int[] Y;
    boolean[] Z;
    int aa;
    int ab;
    int ac;
    int ad;
    int ae;
    float[] af;
    float[] ag;
    float[] ah;
    float[] ai;
    int[] aj;
    int[] ak;
    int[] al;
    private final ThreadPoolExecutor an;
    private BlockingQueue<Runnable> ao;
    private p.a ap;
    private boolean aq;
    private long ar;
    private InputStream as;
    private int at;
    private boolean au;
    private boolean av;
    private Activity aw;
    double p;
    a q;
    CellWorld r;
    Environment s;
    boolean t;
    boolean u;
    double v;
    double w;
    double x;
    double y;
    public int z;
    
    static {
        q.am = 1;
    }
    
    public q(final CellWorld r, final Activity aw, final p.a ap, final a q, int i, final double n) {
        super((float)(1.1 * n), false, (Context)aw);
        this.s = new Environment();
        this.t = false;
        this.C = 0.05f;
        this.D = new float[] { 0.8f, 0.8f, 1.0f };
        this.G = false;
        this.H = new float[4];
        this.I = new float[4];
        this.J = new float[] { 0.0f, 0.0f, 0.0f };
        this.K = new float[16];
        this.L = new float[16];
        this.ar = -1000000000L;
        this.N = null;
        this.R = new Object();
        this.U = new float[20];
        this.V = new float[20];
        this.W = new float[20];
        this.X = new float[20];
        this.Y = new int[20];
        this.Z = new boolean[20];
        this.af = new float[200];
        this.ag = new float[200];
        this.ah = new float[200];
        this.ai = new float[200];
        this.aj = new int[200];
        this.ak = new int[200];
        this.al = new int[200];
        this.aw = aw;
        this.ap = ap;
        this.q = q;
        if (i != -1) {
            this.M = false;
        }
        if (r == null) {
            com.saterskog.b.a.a("skit");
        }
        this.r = r;
        this.F = null;
        this.E = null;
        this.B = i;
        this.ao = new LinkedBlockingQueue<Runnable>();
        this.an = new ThreadPoolExecutor(1, 1, 1L, TimeUnit.SECONDS, this.ao);
        synchronized (this.R) {
            this.Q = new Gene[80];
            for (i = 0; i < 80; ++i) {
                this.Q[i] = new Gene();
            }
            this.au = false;
            // monitorexit(this.R)
            this.b = 0.0f;
            this.c = 0.0f;
            this.aq = false;
            this.d = 1.0f / (float)n;
            this.z = 0;
            this.e = 1.0f;
            this.u = false;
            this.O = -1;
            this.as = null;
            this.P = false;
            this.av = true;
            final String string = PreferenceManager.getDefaultSharedPreferences((Context)this.aw).getString("log_stats", "none");
            this.p = -1.0;
            if (string.equals("12m")) {
                this.p = 0.2;
            }
            if (string.equals("1h")) {
                this.p = 1.0;
            }
            if (string.equals("5h")) {
                this.p = 5.0;
            }
            if (string.equals("25h")) {
                this.p = 25.0;
            }
            if (string.equals("125h")) {
                this.p = 125.0;
            }
            if (string.equals("625h")) {
                this.p = 625.0;
            }
            this.b();
        }
    }
    
    private void a(final double b, final double c) {
        final Cell cell = new Cell();
        cell.b = b;
        cell.c = c;
        cell.p = 1.0;
        cell.T = -1;
        for (int i = 0; i < 4; ++i) {
            cell.U[i] = 0.01f;
        }
        final Gene[] f = this.ap.f();
        cell.D = 0;
        for (int j = 0; j < 80; ++j) {
            cell.I[j] = new Gene(f[j]);
            if (cell.I[j].p) {
                cell.D = j;
            }
        }
        if (cell.I[cell.D].s == com.saterskog.cell_lab.h.e) {
            cell.w = 1.728;
        }
        else {
            cell.w = 0.288;
        }
        cell.d = Math.min(Math.sqrt(cell.w / 400.0), 0.029699999999999997);
        cell.J[0] = cell.I[cell.D].a[0];
        cell.J[1] = cell.I[cell.D].a[1];
        cell.J[2] = cell.I[cell.D].a[2];
        cell.J[3] = 1.0f;
        cell.e = 0.0;
        cell.f = 0.0;
        cell.l = 0.0;
        cell.n = 0.0;
        cell.k = 0.0;
        cell.m = com.saterskog.b.d.a.b() * 3.141592653589793;
        cell.C = 0;
        cell.E = 1;
        cell.F = 0;
        cell.y = false;
        cell.o = 0.1;
        cell.G = 0;
        if (this.r.z == this.r.e.r && this.r.z > 0) {
            this.r.x[com.saterskog.b.d.a.nextInt(this.r.z)].a(this.r.x[this.r.z - 1]);
            final CellWorld r = this.r;
            --r.z;
        }
        this.r.a(cell);
        if (cell.I[0].u[5] == 0 && cell.I[0].t[7].e == 0 && Math.abs(cell.I[0].t[7].b - 1.0) < 0.1) {
            com.saterskog.cell_lab.t.a(this.aw, 3, 4, 2500);
        }
        if (cell.I[2].u[5] == 0 && cell.I[2].u[6] == 1 && cell.I[2].t[7].d == 1 && cell.I[2].t[8].d == 0 && Math.abs(cell.I[2].t[7].a - 0.4355f) < 0.2f && Math.abs(cell.I[2].t[8].a + 0.4355f) < 0.2f) {
            com.saterskog.cell_lab.t.a(this.aw, 3, 6, 2500);
        }
    }
    
    private void d() {
        if (this.A == 1) {
            for (int i = 0; i < this.ac; ++i) {
                if (this.ab == this.aa) {
                    int j = 0;
                    while (j < 20) {
                        if (!this.Z[j]) {
                            final int a = this.r.a(this.af[i], this.ag[i]);
                            if (a != -1) {
                                this.Y[j] = this.aj[i];
                                this.U[j] = this.af[i];
                                this.V[j] = this.ag[i];
                                this.r.x[a].F = j + 100;
                                this.W[j] = this.af[i] - (float)this.r.x[a].b;
                                this.X[j] = this.ag[i] - (float)this.r.x[a].c;
                                this.Z[j] = true;
                                ++this.ab;
                                break;
                            }
                            break;
                        }
                        else {
                            ++j;
                        }
                    }
                }
                ++this.aa;
            }
            this.ac = 0;
            for (int k = 0; k < this.ae; ++k) {
                if (this.ab == this.aa) {
                    int l = 0;
                    while (l < 20) {
                        if (this.Z[l] && this.Y[l] == this.al[k]) {
                            if (this.r.a(l + 100) == -1) {
                                this.Z[l] = false;
                                --this.ab;
                                break;
                            }
                            this.U[l] = this.ah[k];
                            this.V[l] = this.ai[k];
                            break;
                        }
                        else {
                            ++l;
                        }
                    }
                }
            }
            this.ae = 0;
            for (int n = 0; n < this.ad; ++n) {
                for (int n2 = 0; n2 < 20; ++n2) {
                    if (this.Z[n2] && this.Y[n2] == this.ak[n]) {
                        final int a2 = this.r.a(n2 + 100);
                        if (a2 != -1) {
                            this.r.x[a2].F = 0;
                        }
                        this.Z[n2] = false;
                        --this.ab;
                    }
                }
                --this.aa;
            }
            this.ad = 0;
        }
        for (int n3 = 0; n3 < 20; ++n3) {
            if (this.Z[n3]) {
                final int a3 = this.r.a(n3 + 100);
                if (a3 != -1) {
                    final double n4 = this.W[n3];
                    final double n5 = this.X[n3];
                    final double n6 = ((this.V[n3] - (this.r.x[a3].c + n5)) * n4 - (this.U[n3] - (this.r.x[a3].b + n4)) * n5) / (this.r.x[a3].d * this.r.x[a3].d) * 0.5;
                    final double b = this.r.x[a3].b;
                    final double c = this.r.x[a3].c;
                    final double m = this.r.x[a3].k;
                    final Cell cell = this.r.x[a3];
                    cell.k += n6;
                    this.W[n3] = (float)(Math.cos(n6) * n4 - Math.sin(n6) * n5);
                    this.X[n3] = (float)(n4 * Math.sin(n6) + n5 * Math.cos(n6));
                    this.r.x[a3].b = this.U[n3] - this.W[n3];
                    this.r.x[a3].c = this.V[n3] - this.X[n3];
                    double n7 = 1.0;
                    if (this.z == 1) {
                        n7 = 0.02;
                    }
                    if (this.z == 3) {
                        n7 = 0.02 * this.C;
                    }
                    if (this.z == 1 || this.z == 3) {
                        this.r.x[a3].z = false;
                        this.r.x[a3].e = (this.r.x[a3].b - b) / n7;
                        this.r.x[a3].f = (this.r.x[a3].c - c) / n7;
                        this.r.x[a3].l = (this.r.x[a3].k - m) / n7;
                    }
                    this.r.L = false;
                }
            }
        }
    }
    
    public final void a(final float n, final float n2) {
        if (this.A == 1) {
            for (int i = 0; i < 20; ++i) {
                if (this.Z[i]) {
                    return;
                }
            }
        }
        Label_0032: {
            break Label_0032;
        }
        if (!this.aq && this.l) {
            if (n * n + n2 * n2 > 1.0f) {
                this.av = true;
            }
            this.b -= n / this.a;
            this.c += n2 / this.a;
            if (this.c > 0.7 && this.h != null && this.h instanceof Activity) {
                com.saterskog.cell_lab.t.b((Activity)this.h, 0, 2);
            }
            this.b();
        }
    }
    
    public final void a(final float n, final float n2, final float n3) {
        if (this.A == 1) {
            for (int i = 0; i < 20; ++i) {
                if (this.Z[i]) {
                    return;
                }
            }
        }
        Label_0035: {
            break Label_0035;
        }
        if (!this.l) {
            return;
        }
        this.d *= n;
        if (!this.aq) {
            if (Math.abs(1.0f - n) > 1.0E-4) {
                this.av = true;
            }
            this.b += (float)((this.a(n2) - this.b) * (n - 1.0f));
            this.c += (float)((this.b(n3) - this.c) * (n - 1.0f));
        }
        this.b();
        if (this.q != null) {
            this.q.a(this.f * 5.0E-4f);
        }
    }
    
    public final void a(final int n) {
        if (this.ad < 200) {
            this.ak[this.ad] = n;
            ++this.ad;
        }
    }
    
    public final void a(final InputStream as, final int at) {
        this.at = at;
        this.as = as;
    }
    
    public final void a(final float[] p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: getfield        com/saterskog/cell_lab/q.z:I
        //     4: ifne            32
        //     7: aload_0        
        //     8: getfield        com/saterskog/cell_lab/q.J:[F
        //    11: iconst_0       
        //    12: ldc_w           0.85
        //    15: fastore        
        //    16: aload_0        
        //    17: getfield        com/saterskog/cell_lab/q.J:[F
        //    20: iconst_1       
        //    21: ldc_w           0.85
        //    24: fastore        
        //    25: aload_0        
        //    26: getfield        com/saterskog/cell_lab/q.J:[F
        //    29: iconst_2       
        //    30: fconst_1       
        //    31: fastore        
        //    32: aload_0        
        //    33: getfield        com/saterskog/cell_lab/q.z:I
        //    36: iconst_1       
        //    37: if_icmpne       67
        //    40: aload_0        
        //    41: getfield        com/saterskog/cell_lab/q.J:[F
        //    44: iconst_0       
        //    45: ldc_w           0.73
        //    48: fastore        
        //    49: aload_0        
        //    50: getfield        com/saterskog/cell_lab/q.J:[F
        //    53: iconst_1       
        //    54: ldc_w           0.7
        //    57: fastore        
        //    58: aload_0        
        //    59: getfield        com/saterskog/cell_lab/q.J:[F
        //    62: iconst_2       
        //    63: ldc_w           0.95
        //    66: fastore        
        //    67: aload_0        
        //    68: getfield        com/saterskog/cell_lab/q.z:I
        //    71: iconst_2       
        //    72: if_icmpne       102
        //    75: aload_0        
        //    76: getfield        com/saterskog/cell_lab/q.J:[F
        //    79: iconst_0       
        //    80: ldc_w           0.9
        //    83: fastore        
        //    84: aload_0        
        //    85: getfield        com/saterskog/cell_lab/q.J:[F
        //    88: iconst_1       
        //    89: ldc_w           0.75
        //    92: fastore        
        //    93: aload_0        
        //    94: getfield        com/saterskog/cell_lab/q.J:[F
        //    97: iconst_2       
        //    98: ldc_w           0.65
        //   101: fastore        
        //   102: aload_0        
        //   103: getfield        com/saterskog/cell_lab/q.z:I
        //   106: iconst_3       
        //   107: if_icmpne       135
        //   110: aload_0        
        //   111: getfield        com/saterskog/cell_lab/q.J:[F
        //   114: iconst_0       
        //   115: ldc_w           0.85
        //   118: fastore        
        //   119: aload_0        
        //   120: getfield        com/saterskog/cell_lab/q.J:[F
        //   123: iconst_1       
        //   124: fconst_1       
        //   125: fastore        
        //   126: aload_0        
        //   127: getfield        com/saterskog/cell_lab/q.J:[F
        //   130: iconst_2       
        //   131: ldc_w           0.85
        //   134: fastore        
        //   135: iconst_0       
        //   136: istore_2       
        //   137: iload_2        
        //   138: iconst_3       
        //   139: if_icmpge       180
        //   142: aload_0        
        //   143: getfield        com/saterskog/cell_lab/q.D:[F
        //   146: astore_3       
        //   147: aload_3        
        //   148: iload_2        
        //   149: aload_3        
        //   150: iload_2        
        //   151: faload         
        //   152: f2d            
        //   153: aload_0        
        //   154: getfield        com/saterskog/cell_lab/q.J:[F
        //   157: iload_2        
        //   158: faload         
        //   159: aload_0        
        //   160: getfield        com/saterskog/cell_lab/q.D:[F
        //   163: iload_2        
        //   164: faload         
        //   165: fsub           
        //   166: f2d            
        //   167: ldc2_w          0.1
        //   170: dmul           
        //   171: dadd           
        //   172: d2f            
        //   173: fastore        
        //   174: iinc            2, 1
        //   177: goto            137
        //   180: aload_0        
        //   181: aload_0        
        //   182: getfield        com/saterskog/cell_lab/q.S:F
        //   185: ldc_w           0.01
        //   188: fmul           
        //   189: aload_0        
        //   190: getfield        com/saterskog/cell_lab/q.T:F
        //   193: ldc_w           0.01
        //   196: fmul           
        //   197: invokevirtual   com/saterskog/cell_lab/q.a:(FF)V
        //   200: aload_0        
        //   201: aload_0        
        //   202: getfield        com/saterskog/cell_lab/q.S:F
        //   205: f2d            
        //   206: ldc2_w          0.92
        //   209: dmul           
        //   210: d2f            
        //   211: putfield        com/saterskog/cell_lab/q.S:F
        //   214: aload_0        
        //   215: aload_0        
        //   216: getfield        com/saterskog/cell_lab/q.T:F
        //   219: f2d            
        //   220: ldc2_w          0.92
        //   223: dmul           
        //   224: d2f            
        //   225: putfield        com/saterskog/cell_lab/q.T:F
        //   228: aload_0        
        //   229: getfield        com/saterskog/cell_lab/q.D:[F
        //   232: iconst_0       
        //   233: faload         
        //   234: aload_0        
        //   235: getfield        com/saterskog/cell_lab/q.D:[F
        //   238: iconst_1       
        //   239: faload         
        //   240: aload_0        
        //   241: getfield        com/saterskog/cell_lab/q.D:[F
        //   244: iconst_2       
        //   245: faload         
        //   246: fconst_1       
        //   247: invokestatic    android/opengl/GLES20.glClearColor:(FFFF)V
        //   250: iconst_1       
        //   251: invokestatic    android/opengl/GLES20.glDepthMask:(Z)V
        //   254: sipush          16640
        //   257: invokestatic    android/opengl/GLES20.glClear:(I)V
        //   260: aload_0        
        //   261: iconst_0       
        //   262: putfield        com/saterskog/cell_lab/q.av:Z
        //   265: aload_0        
        //   266: getfield        com/saterskog/cell_lab/q.z:I
        //   269: iconst_1       
        //   270: if_icmpeq       281
        //   273: aload_0        
        //   274: getfield        com/saterskog/cell_lab/q.z:I
        //   277: iconst_3       
        //   278: if_icmpne       387
        //   281: aload_0        
        //   282: getfield        com/saterskog/cell_lab/q.E:Ljava/util/concurrent/Future;
        //   285: ifnull          298
        //   288: aload_0        
        //   289: getfield        com/saterskog/cell_lab/q.E:Ljava/util/concurrent/Future;
        //   292: invokeinterface java/util/concurrent/Future.get:()Ljava/lang/Object;
        //   297: pop            
        //   298: aload_0        
        //   299: getfield        com/saterskog/cell_lab/q.z:I
        //   302: ifeq            499
        //   305: aload_0        
        //   306: getfield        com/saterskog/cell_lab/q.z:I
        //   309: iconst_2       
        //   310: if_icmpeq       313
        //   313: aload_0        
        //   314: getfield        com/saterskog/cell_lab/q.f:F
        //   317: aload_0        
        //   318: getfield        com/saterskog/cell_lab/q.g:F
        //   321: invokestatic    java/lang/Math.max:(FF)F
        //   324: ldc_w           0.1
        //   327: fmul           
        //   328: fstore          4
        //   330: aload_0        
        //   331: getfield        com/saterskog/cell_lab/q.f:F
        //   334: fconst_2       
        //   335: fdiv           
        //   336: fload           4
        //   338: fadd           
        //   339: fstore          5
        //   341: fload           4
        //   343: aload_0        
        //   344: getfield        com/saterskog/cell_lab/q.g:F
        //   347: fconst_2       
        //   348: fdiv           
        //   349: fadd           
        //   350: fstore          4
        //   352: aload_0        
        //   353: getfield        com/saterskog/cell_lab/q.r:Lcom/saterskog/cell_lab/CellWorld;
        //   356: aload_0        
        //   357: getfield        com/saterskog/cell_lab/q.b:F
        //   360: fload           5
        //   362: fsub           
        //   363: fload           5
        //   365: aload_0        
        //   366: getfield        com/saterskog/cell_lab/q.b:F
        //   369: fadd           
        //   370: aload_0        
        //   371: getfield        com/saterskog/cell_lab/q.c:F
        //   374: fload           4
        //   376: fsub           
        //   377: fload           4
        //   379: aload_0        
        //   380: getfield        com/saterskog/cell_lab/q.c:F
        //   383: fadd           
        //   384: invokevirtual   com/saterskog/cell_lab/CellWorld.a:(FFFF)V
        //   387: aload_0        
        //   388: getfield        com/saterskog/cell_lab/q.z:I
        //   391: iconst_1       
        //   392: if_icmpeq       403
        //   395: aload_0        
        //   396: getfield        com/saterskog/cell_lab/q.z:I
        //   399: iconst_3       
        //   400: if_icmpne       427
        //   403: aload_0        
        //   404: getfield        com/saterskog/cell_lab/q.av:Z
        //   407: ifne            427
        //   410: aload_0        
        //   411: getfield        com/saterskog/cell_lab/q.F:Ljava/util/concurrent/Future;
        //   414: ifnull          427
        //   417: aload_0        
        //   418: getfield        com/saterskog/cell_lab/q.F:Ljava/util/concurrent/Future;
        //   421: invokeinterface java/util/concurrent/Future.get:()Ljava/lang/Object;
        //   426: pop            
        //   427: aload_0        
        //   428: getfield        com/saterskog/cell_lab/q.F:Ljava/util/concurrent/Future;
        //   431: ifnull          446
        //   434: aload_0        
        //   435: getfield        com/saterskog/cell_lab/q.F:Ljava/util/concurrent/Future;
        //   438: invokeinterface java/util/concurrent/Future.isDone:()Z
        //   443: ifeq            2843
        //   446: aload_0        
        //   447: getfield        com/saterskog/cell_lab/q.O:I
        //   450: iconst_m1      
        //   451: if_icmpeq       528
        //   454: aload_0        
        //   455: aload_0        
        //   456: getfield        com/saterskog/cell_lab/q.O:I
        //   459: putfield        com/saterskog/cell_lab/q.z:I
        //   462: iconst_0       
        //   463: istore_2       
        //   464: iload_2        
        //   465: bipush          20
        //   467: if_icmpge       513
        //   470: aload_0        
        //   471: getfield        com/saterskog/cell_lab/q.Z:[Z
        //   474: iload_2        
        //   475: iconst_0       
        //   476: bastore        
        //   477: iinc            2, 1
        //   480: goto            464
        //   483: astore_3       
        //   484: aload_3        
        //   485: invokevirtual   java/lang/InterruptedException.printStackTrace:()V
        //   488: goto            298
        //   491: astore_3       
        //   492: aload_3        
        //   493: invokevirtual   java/util/concurrent/ExecutionException.printStackTrace:()V
        //   496: goto            298
        //   499: fconst_0       
        //   500: fstore          4
        //   502: goto            330
        //   505: astore_3       
        //   506: aload_3        
        //   507: invokevirtual   java/lang/Exception.printStackTrace:()V
        //   510: goto            427
        //   513: aload_0        
        //   514: iconst_0       
        //   515: putfield        com/saterskog/cell_lab/q.aa:I
        //   518: aload_0        
        //   519: iconst_0       
        //   520: putfield        com/saterskog/cell_lab/q.ab:I
        //   523: aload_0        
        //   524: iconst_m1      
        //   525: putfield        com/saterskog/cell_lab/q.O:I
        //   528: aload_0        
        //   529: getfield        com/saterskog/cell_lab/q.z:I
        //   532: iconst_1       
        //   533: if_icmpeq       633
        //   536: aload_0        
        //   537: getfield        com/saterskog/cell_lab/q.z:I
        //   540: iconst_3       
        //   541: if_icmpeq       633
        //   544: aload_0        
        //   545: getfield        com/saterskog/cell_lab/q.z:I
        //   548: ifeq            773
        //   551: aload_0        
        //   552: getfield        com/saterskog/cell_lab/q.z:I
        //   555: iconst_2       
        //   556: if_icmpeq       559
        //   559: aload_0        
        //   560: getfield        com/saterskog/cell_lab/q.f:F
        //   563: aload_0        
        //   564: getfield        com/saterskog/cell_lab/q.g:F
        //   567: invokestatic    java/lang/Math.max:(FF)F
        //   570: ldc_w           0.1
        //   573: fmul           
        //   574: fstore          4
        //   576: aload_0        
        //   577: getfield        com/saterskog/cell_lab/q.f:F
        //   580: fconst_2       
        //   581: fdiv           
        //   582: fload           4
        //   584: fadd           
        //   585: fstore          5
        //   587: fload           4
        //   589: aload_0        
        //   590: getfield        com/saterskog/cell_lab/q.g:F
        //   593: fconst_2       
        //   594: fdiv           
        //   595: fadd           
        //   596: fstore          4
        //   598: aload_0        
        //   599: getfield        com/saterskog/cell_lab/q.r:Lcom/saterskog/cell_lab/CellWorld;
        //   602: aload_0        
        //   603: getfield        com/saterskog/cell_lab/q.b:F
        //   606: fload           5
        //   608: fsub           
        //   609: fload           5
        //   611: aload_0        
        //   612: getfield        com/saterskog/cell_lab/q.b:F
        //   615: fadd           
        //   616: aload_0        
        //   617: getfield        com/saterskog/cell_lab/q.c:F
        //   620: fload           4
        //   622: fsub           
        //   623: fload           4
        //   625: aload_0        
        //   626: getfield        com/saterskog/cell_lab/q.c:F
        //   629: fadd           
        //   630: invokevirtual   com/saterskog/cell_lab/CellWorld.a:(FFFF)V
        //   633: aload_0        
        //   634: getfield        com/saterskog/cell_lab/q.r:Lcom/saterskog/cell_lab/CellWorld;
        //   637: getfield        com/saterskog/cell_lab/CellWorld.X:I
        //   640: ifne            2774
        //   643: aload_0        
        //   644: getfield        com/saterskog/cell_lab/q.N:Ljava/io/OutputStream;
        //   647: ifnull          910
        //   650: aload_0        
        //   651: getfield        com/saterskog/cell_lab/q.r:Lcom/saterskog/cell_lab/CellWorld;
        //   654: astore_3       
        //   655: aload_0        
        //   656: getfield        com/saterskog/cell_lab/q.N:Ljava/io/OutputStream;
        //   659: astore          6
        //   661: new             Ljava/io/ObjectOutputStream;
        //   664: astore          7
        //   666: aload           7
        //   668: aload           6
        //   670: invokespecial   java/io/ObjectOutputStream.<init>:(Ljava/io/OutputStream;)V
        //   673: aload           7
        //   675: sipush          3054
        //   678: invokevirtual   java/io/ObjectOutputStream.writeInt:(I)V
        //   681: aload           7
        //   683: aload_3        
        //   684: getfield        com/saterskog/cell_lab/CellWorld.M:D
        //   687: invokevirtual   java/io/ObjectOutputStream.writeDouble:(D)V
        //   690: aload           7
        //   692: aload_3        
        //   693: getfield        com/saterskog/cell_lab/CellWorld.z:I
        //   696: invokevirtual   java/io/ObjectOutputStream.writeInt:(I)V
        //   699: aload_3        
        //   700: getfield        com/saterskog/cell_lab/CellWorld.e:Lcom/saterskog/cell_lab/Environment;
        //   703: aload           7
        //   705: invokevirtual   com/saterskog/cell_lab/Environment.a:(Ljava/io/ObjectOutputStream;)V
        //   708: aload           7
        //   710: invokevirtual   java/io/ObjectOutputStream.flush:()V
        //   713: new             Ljava/util/zip/GZIPOutputStream;
        //   716: astore          7
        //   718: aload           7
        //   720: aload           6
        //   722: invokespecial   java/util/zip/GZIPOutputStream.<init>:(Ljava/io/OutputStream;)V
        //   725: new             Ljava/io/ObjectOutputStream;
        //   728: astore          8
        //   730: aload           8
        //   732: aload           7
        //   734: invokespecial   java/io/ObjectOutputStream.<init>:(Ljava/io/OutputStream;)V
        //   737: aload           8
        //   739: aload_3        
        //   740: getfield        com/saterskog/cell_lab/CellWorld.O:D
        //   743: invokevirtual   java/io/ObjectOutputStream.writeDouble:(D)V
        //   746: iconst_0       
        //   747: istore_2       
        //   748: iload_2        
        //   749: aload_3        
        //   750: getfield        com/saterskog/cell_lab/CellWorld.z:I
        //   753: if_icmpge       779
        //   756: aload_3        
        //   757: getfield        com/saterskog/cell_lab/CellWorld.x:[Lcom/saterskog/cell_lab/Cell;
        //   760: iload_2        
        //   761: aaload         
        //   762: aload           8
        //   764: invokevirtual   com/saterskog/cell_lab/Cell.a:(Ljava/io/ObjectOutputStream;)V
        //   767: iinc            2, 1
        //   770: goto            748
        //   773: fconst_0       
        //   774: fstore          4
        //   776: goto            576
        //   779: aload           8
        //   781: aload_3        
        //   782: getfield        com/saterskog/cell_lab/CellWorld.B:I
        //   785: invokevirtual   java/io/ObjectOutputStream.writeInt:(I)V
        //   788: iconst_0       
        //   789: istore_2       
        //   790: iload_2        
        //   791: aload_3        
        //   792: getfield        com/saterskog/cell_lab/CellWorld.B:I
        //   795: if_icmpge       872
        //   798: aload_3        
        //   799: getfield        com/saterskog/cell_lab/CellWorld.A:[Lcom/saterskog/cell_lab/Food;
        //   802: iload_2        
        //   803: aaload         
        //   804: astore          6
        //   806: aload           8
        //   808: aload           6
        //   810: getfield        com/saterskog/cell_lab/Food.a:F
        //   813: invokevirtual   java/io/ObjectOutputStream.writeFloat:(F)V
        //   816: aload           8
        //   818: aload           6
        //   820: getfield        com/saterskog/cell_lab/Food.b:F
        //   823: invokevirtual   java/io/ObjectOutputStream.writeFloat:(F)V
        //   826: aload           8
        //   828: aload           6
        //   830: getfield        com/saterskog/cell_lab/Food.c:F
        //   833: invokevirtual   java/io/ObjectOutputStream.writeFloat:(F)V
        //   836: aload           8
        //   838: aload           6
        //   840: getfield        com/saterskog/cell_lab/Food.d:F
        //   843: invokevirtual   java/io/ObjectOutputStream.writeFloat:(F)V
        //   846: aload           8
        //   848: aload           6
        //   850: getfield        com/saterskog/cell_lab/Food.e:F
        //   853: invokevirtual   java/io/ObjectOutputStream.writeFloat:(F)V
        //   856: aload           8
        //   858: aload           6
        //   860: getfield        com/saterskog/cell_lab/Food.f:F
        //   863: invokevirtual   java/io/ObjectOutputStream.writeFloat:(F)V
        //   866: iinc            2, 1
        //   869: goto            790
        //   872: aload           8
        //   874: invokevirtual   java/io/ObjectOutputStream.flush:()V
        //   877: aload           8
        //   879: invokevirtual   java/io/ObjectOutputStream.close:()V
        //   882: aload           7
        //   884: invokevirtual   java/util/zip/GZIPOutputStream.close:()V
        //   887: aload_0        
        //   888: getfield        com/saterskog/cell_lab/q.ap:Lcom/saterskog/cell_lab/p$a;
        //   891: bipush          7
        //   893: invokeinterface com/saterskog/cell_lab/p$a.a:(S)V
        //   898: aload_0        
        //   899: getfield        com/saterskog/cell_lab/q.N:Ljava/io/OutputStream;
        //   902: invokevirtual   java/io/OutputStream.close:()V
        //   905: aload_0        
        //   906: aconst_null    
        //   907: putfield        com/saterskog/cell_lab/q.N:Ljava/io/OutputStream;
        //   910: aload_0        
        //   911: getfield        com/saterskog/cell_lab/q.as:Ljava/io/InputStream;
        //   914: ifnull          1012
        //   917: aload_0        
        //   918: getfield        com/saterskog/cell_lab/q.D:[F
        //   921: iconst_0       
        //   922: fconst_1       
        //   923: fastore        
        //   924: aload_0        
        //   925: getfield        com/saterskog/cell_lab/q.D:[F
        //   928: iconst_1       
        //   929: fconst_1       
        //   930: fastore        
        //   931: aload_0        
        //   932: getfield        com/saterskog/cell_lab/q.D:[F
        //   935: iconst_2       
        //   936: fconst_1       
        //   937: fastore        
        //   938: aload_0        
        //   939: getfield        com/saterskog/cell_lab/q.r:Lcom/saterskog/cell_lab/CellWorld;
        //   942: invokevirtual   com/saterskog/cell_lab/CellWorld.a:()V
        //   945: aload_0        
        //   946: getfield        com/saterskog/cell_lab/q.r:Lcom/saterskog/cell_lab/CellWorld;
        //   949: aload_0        
        //   950: getfield        com/saterskog/cell_lab/q.as:Ljava/io/InputStream;
        //   953: invokevirtual   com/saterskog/cell_lab/CellWorld.a:(Ljava/io/InputStream;)I
        //   956: pop            
        //   957: aload_0        
        //   958: getfield        com/saterskog/cell_lab/q.as:Ljava/io/InputStream;
        //   961: invokevirtual   java/io/InputStream.close:()V
        //   964: aload_0        
        //   965: getfield        com/saterskog/cell_lab/q.at:I
        //   968: iconst_m1      
        //   969: if_icmpeq       983
        //   972: aload_0        
        //   973: getfield        com/saterskog/cell_lab/q.r:Lcom/saterskog/cell_lab/CellWorld;
        //   976: aload_0        
        //   977: getfield        com/saterskog/cell_lab/q.at:I
        //   980: invokevirtual   com/saterskog/cell_lab/CellWorld.c:(I)V
        //   983: aload_0        
        //   984: getfield        com/saterskog/cell_lab/q.B:I
        //   987: iconst_m1      
        //   988: if_icmpeq       999
        //   991: aload_0        
        //   992: getfield        com/saterskog/cell_lab/q.r:Lcom/saterskog/cell_lab/CellWorld;
        //   995: dconst_0       
        //   996: putfield        com/saterskog/cell_lab/CellWorld.M:D
        //   999: aload_0        
        //  1000: aconst_null    
        //  1001: putfield        com/saterskog/cell_lab/q.as:Ljava/io/InputStream;
        //  1004: aload_0        
        //  1005: getfield        com/saterskog/cell_lab/q.r:Lcom/saterskog/cell_lab/CellWorld;
        //  1008: iconst_0       
        //  1009: putfield        com/saterskog/cell_lab/CellWorld.L:Z
        //  1012: aload_0        
        //  1013: getfield        com/saterskog/cell_lab/q.P:Z
        //  1016: ifeq            1049
        //  1019: aload_0        
        //  1020: getfield        com/saterskog/cell_lab/q.ap:Lcom/saterskog/cell_lab/p$a;
        //  1023: iconst_0       
        //  1024: invokeinterface com/saterskog/cell_lab/p$a.a:(S)V
        //  1029: aload_0        
        //  1030: getfield        com/saterskog/cell_lab/q.r:Lcom/saterskog/cell_lab/CellWorld;
        //  1033: invokevirtual   com/saterskog/cell_lab/CellWorld.a:()V
        //  1036: aload_0        
        //  1037: iconst_0       
        //  1038: putfield        com/saterskog/cell_lab/q.P:Z
        //  1041: aload_0        
        //  1042: getfield        com/saterskog/cell_lab/q.r:Lcom/saterskog/cell_lab/CellWorld;
        //  1045: iconst_0       
        //  1046: putfield        com/saterskog/cell_lab/CellWorld.L:Z
        //  1049: aload_0        
        //  1050: getfield        com/saterskog/cell_lab/q.aq:Z
        //  1053: ifeq            1102
        //  1056: aload_0        
        //  1057: getfield        com/saterskog/cell_lab/q.A:I
        //  1060: iconst_2       
        //  1061: if_icmpeq       1080
        //  1064: aload_0        
        //  1065: getfield        com/saterskog/cell_lab/q.A:I
        //  1068: iconst_3       
        //  1069: if_icmpeq       1080
        //  1072: aload_0        
        //  1073: getfield        com/saterskog/cell_lab/q.A:I
        //  1076: iconst_1       
        //  1077: if_icmpne       1102
        //  1080: aload_0        
        //  1081: getfield        com/saterskog/cell_lab/q.r:Lcom/saterskog/cell_lab/CellWorld;
        //  1084: invokevirtual   com/saterskog/cell_lab/CellWorld.b:()V
        //  1087: aload_0        
        //  1088: getfield        com/saterskog/cell_lab/q.ap:Lcom/saterskog/cell_lab/p$a;
        //  1091: iconst_2       
        //  1092: invokeinterface com/saterskog/cell_lab/p$a.a:(S)V
        //  1097: aload_0        
        //  1098: iconst_0       
        //  1099: putfield        com/saterskog/cell_lab/q.aq:Z
        //  1102: aload_0        
        //  1103: getfield        com/saterskog/cell_lab/q.u:Z
        //  1106: ifeq            1478
        //  1109: aload_0        
        //  1110: getfield        com/saterskog/cell_lab/q.r:Lcom/saterskog/cell_lab/CellWorld;
        //  1113: aload_0        
        //  1114: getfield        com/saterskog/cell_lab/q.v:D
        //  1117: aload_0        
        //  1118: getfield        com/saterskog/cell_lab/q.w:D
        //  1121: invokevirtual   com/saterskog/cell_lab/CellWorld.a:(DD)I
        //  1124: istore          9
        //  1126: iload           9
        //  1128: iconst_m1      
        //  1129: if_icmpne       2140
        //  1132: aload_0        
        //  1133: getfield        com/saterskog/cell_lab/q.aq:Z
        //  1136: ifne            2096
        //  1139: aload_0        
        //  1140: getfield        com/saterskog/cell_lab/q.r:Lcom/saterskog/cell_lab/CellWorld;
        //  1143: getfield        com/saterskog/cell_lab/CellWorld.e:Lcom/saterskog/cell_lab/Environment;
        //  1146: getfield        com/saterskog/cell_lab/Environment.k:D
        //  1149: aload_0        
        //  1150: getfield        com/saterskog/cell_lab/q.r:Lcom/saterskog/cell_lab/CellWorld;
        //  1153: getfield        com/saterskog/cell_lab/CellWorld.e:Lcom/saterskog/cell_lab/Environment;
        //  1156: getfield        com/saterskog/cell_lab/Environment.k:D
        //  1159: dmul           
        //  1160: aload_0        
        //  1161: getfield        com/saterskog/cell_lab/q.v:D
        //  1164: aload_0        
        //  1165: getfield        com/saterskog/cell_lab/q.v:D
        //  1168: dmul           
        //  1169: aload_0        
        //  1170: getfield        com/saterskog/cell_lab/q.w:D
        //  1173: aload_0        
        //  1174: getfield        com/saterskog/cell_lab/q.w:D
        //  1177: dmul           
        //  1178: dadd           
        //  1179: dcmpl          
        //  1180: ifle            1402
        //  1183: aload_0        
        //  1184: getfield        com/saterskog/cell_lab/q.A:I
        //  1187: ifne            1402
        //  1190: aload_0        
        //  1191: getfield        com/saterskog/cell_lab/q.B:I
        //  1194: iconst_m1      
        //  1195: if_icmpeq       2056
        //  1198: aload_0        
        //  1199: getfield        com/saterskog/cell_lab/q.aw:Landroid/app/Activity;
        //  1202: invokestatic    com/saterskog/cell_lab/j.a:(Landroid/content/Context;)Ljava/util/ArrayList;
        //  1205: aload_0        
        //  1206: getfield        com/saterskog/cell_lab/q.B:I
        //  1209: invokevirtual   java/util/ArrayList.get:(I)Ljava/lang/Object;
        //  1212: checkcast       Lcom/saterskog/cell_lab/j$a;
        //  1215: getfield        com/saterskog/cell_lab/j$a.q:I
        //  1218: istore          9
        //  1220: aload_0        
        //  1221: getfield        com/saterskog/cell_lab/q.r:Lcom/saterskog/cell_lab/CellWorld;
        //  1224: getfield        com/saterskog/cell_lab/CellWorld.V:I
        //  1227: iload           9
        //  1229: if_icmplt       3348
        //  1232: iconst_0       
        //  1233: istore_2       
        //  1234: aload_0        
        //  1235: getfield        com/saterskog/cell_lab/q.D:[F
        //  1238: iconst_0       
        //  1239: fconst_1       
        //  1240: fastore        
        //  1241: aload_0        
        //  1242: getfield        com/saterskog/cell_lab/q.D:[F
        //  1245: iconst_1       
        //  1246: ldc_w           0.3
        //  1249: fastore        
        //  1250: aload_0        
        //  1251: getfield        com/saterskog/cell_lab/q.D:[F
        //  1254: iconst_2       
        //  1255: ldc_w           0.3
        //  1258: fastore        
        //  1259: aload_0        
        //  1260: getfield        com/saterskog/cell_lab/q.aw:Landroid/app/Activity;
        //  1263: new             Lcom/saterskog/cell_lab/q$4;
        //  1266: dup            
        //  1267: aload_0        
        //  1268: iload           9
        //  1270: invokespecial   com/saterskog/cell_lab/q$4.<init>:(Lcom/saterskog/cell_lab/q;I)V
        //  1273: invokevirtual   android/app/Activity.runOnUiThread:(Ljava/lang/Runnable;)V
        //  1276: aload_0        
        //  1277: getfield        com/saterskog/cell_lab/q.B:I
        //  1280: aload_0        
        //  1281: getfield        com/saterskog/cell_lab/q.ap:Lcom/saterskog/cell_lab/p$a;
        //  1284: invokeinterface com/saterskog/cell_lab/p$a.f:()[Lcom/saterskog/cell_lab/Gene;
        //  1289: aload_0        
        //  1290: getfield        com/saterskog/cell_lab/q.aw:Landroid/app/Activity;
        //  1293: invokestatic    com/saterskog/cell_lab/j.a:(I[Lcom/saterskog/cell_lab/Gene;Landroid/content/Context;)Z
        //  1296: ifne            1316
        //  1299: iconst_0       
        //  1300: istore_2       
        //  1301: aload_0        
        //  1302: getfield        com/saterskog/cell_lab/q.aw:Landroid/app/Activity;
        //  1305: new             Lcom/saterskog/cell_lab/q$5;
        //  1308: dup            
        //  1309: aload_0        
        //  1310: invokespecial   com/saterskog/cell_lab/q$5.<init>:(Lcom/saterskog/cell_lab/q;)V
        //  1313: invokevirtual   android/app/Activity.runOnUiThread:(Ljava/lang/Runnable;)V
        //  1316: iload_2        
        //  1317: ifeq            2043
        //  1320: aload_0        
        //  1321: getfield        com/saterskog/cell_lab/q.ap:Lcom/saterskog/cell_lab/p$a;
        //  1324: iconst_3       
        //  1325: invokeinterface com/saterskog/cell_lab/p$a.a:(S)V
        //  1330: aload_0        
        //  1331: aload_0        
        //  1332: getfield        com/saterskog/cell_lab/q.v:D
        //  1335: aload_0        
        //  1336: getfield        com/saterskog/cell_lab/q.w:D
        //  1339: invokespecial   com/saterskog/cell_lab/q.a:(DD)V
        //  1342: aload_0        
        //  1343: getfield        com/saterskog/cell_lab/q.r:Lcom/saterskog/cell_lab/CellWorld;
        //  1346: astore_3       
        //  1347: aload_3        
        //  1348: aload_3        
        //  1349: getfield        com/saterskog/cell_lab/CellWorld.V:I
        //  1352: iconst_1       
        //  1353: iadd           
        //  1354: putfield        com/saterskog/cell_lab/CellWorld.V:I
        //  1357: aload_0        
        //  1358: getfield        com/saterskog/cell_lab/q.aw:Landroid/app/Activity;
        //  1361: iconst_0       
        //  1362: iconst_3       
        //  1363: sipush          1500
        //  1366: invokestatic    com/saterskog/cell_lab/t.a:(Landroid/app/Activity;III)V
        //  1369: aload_0        
        //  1370: getfield        com/saterskog/cell_lab/q.aw:Landroid/app/Activity;
        //  1373: iconst_1       
        //  1374: bipush          9
        //  1376: sipush          1500
        //  1379: invokestatic    com/saterskog/cell_lab/t.a:(Landroid/app/Activity;III)V
        //  1382: aload_0        
        //  1383: getfield        com/saterskog/cell_lab/q.z:I
        //  1386: iconst_1       
        //  1387: if_icmpne       1402
        //  1390: aload_0        
        //  1391: getfield        com/saterskog/cell_lab/q.aw:Landroid/app/Activity;
        //  1394: iconst_3       
        //  1395: iconst_3       
        //  1396: sipush          1500
        //  1399: invokestatic    com/saterskog/cell_lab/t.a:(Landroid/app/Activity;III)V
        //  1402: aload_0        
        //  1403: getfield        com/saterskog/cell_lab/q.A:I
        //  1406: iconst_2       
        //  1407: if_icmpne       1439
        //  1410: aload_0        
        //  1411: getfield        com/saterskog/cell_lab/q.ap:Lcom/saterskog/cell_lab/p$a;
        //  1414: iconst_3       
        //  1415: invokeinterface com/saterskog/cell_lab/p$a.a:(S)V
        //  1420: aload_0        
        //  1421: getfield        com/saterskog/cell_lab/q.r:Lcom/saterskog/cell_lab/CellWorld;
        //  1424: aload_0        
        //  1425: getfield        com/saterskog/cell_lab/q.v:D
        //  1428: aload_0        
        //  1429: getfield        com/saterskog/cell_lab/q.w:D
        //  1432: ldc2_w          1.152
        //  1435: fconst_0       
        //  1436: invokevirtual   com/saterskog/cell_lab/CellWorld.a:(DDDF)V
        //  1439: aload_0        
        //  1440: getfield        com/saterskog/cell_lab/q.A:I
        //  1443: iconst_3       
        //  1444: if_icmpeq       1455
        //  1447: aload_0        
        //  1448: getfield        com/saterskog/cell_lab/q.A:I
        //  1451: iconst_4       
        //  1452: if_icmpne       1465
        //  1455: aload_0        
        //  1456: getfield        com/saterskog/cell_lab/q.ap:Lcom/saterskog/cell_lab/p$a;
        //  1459: iconst_1       
        //  1460: invokeinterface com/saterskog/cell_lab/p$a.a:(S)V
        //  1465: aload_0        
        //  1466: iconst_0       
        //  1467: putfield        com/saterskog/cell_lab/q.u:Z
        //  1470: aload_0        
        //  1471: getfield        com/saterskog/cell_lab/q.r:Lcom/saterskog/cell_lab/CellWorld;
        //  1474: iconst_0       
        //  1475: putfield        com/saterskog/cell_lab/CellWorld.L:Z
        //  1478: aload_0        
        //  1479: invokespecial   com/saterskog/cell_lab/q.d:()V
        //  1482: aload_0        
        //  1483: getfield        com/saterskog/cell_lab/q.t:Z
        //  1486: ifeq            1516
        //  1489: aload_0        
        //  1490: getfield        com/saterskog/cell_lab/q.r:Lcom/saterskog/cell_lab/CellWorld;
        //  1493: getfield        com/saterskog/cell_lab/CellWorld.e:Lcom/saterskog/cell_lab/Environment;
        //  1496: aload_0        
        //  1497: getfield        com/saterskog/cell_lab/q.s:Lcom/saterskog/cell_lab/Environment;
        //  1500: invokevirtual   com/saterskog/cell_lab/Environment.a:(Lcom/saterskog/cell_lab/Environment;)V
        //  1503: aload_0        
        //  1504: getfield        com/saterskog/cell_lab/q.r:Lcom/saterskog/cell_lab/CellWorld;
        //  1507: iconst_0       
        //  1508: putfield        com/saterskog/cell_lab/CellWorld.L:Z
        //  1511: aload_0        
        //  1512: iconst_0       
        //  1513: putfield        com/saterskog/cell_lab/q.t:Z
        //  1516: aload_0        
        //  1517: getfield        com/saterskog/cell_lab/q.r:Lcom/saterskog/cell_lab/CellWorld;
        //  1520: getfield        com/saterskog/cell_lab/CellWorld.L:Z
        //  1523: ifne            1542
        //  1526: aload_0        
        //  1527: getfield        com/saterskog/cell_lab/q.z:I
        //  1530: ifne            1542
        //  1533: aload_0        
        //  1534: getfield        com/saterskog/cell_lab/q.r:Lcom/saterskog/cell_lab/CellWorld;
        //  1537: iconst_1       
        //  1538: dconst_0       
        //  1539: invokevirtual   com/saterskog/cell_lab/CellWorld.a:(ZD)V
        //  1542: aload_0        
        //  1543: getfield        com/saterskog/cell_lab/q.z:I
        //  1546: iconst_1       
        //  1547: if_icmpeq       1558
        //  1550: aload_0        
        //  1551: getfield        com/saterskog/cell_lab/q.z:I
        //  1554: iconst_3       
        //  1555: if_icmpne       1685
        //  1558: aload_0        
        //  1559: getfield        com/saterskog/cell_lab/q.r:Lcom/saterskog/cell_lab/CellWorld;
        //  1562: getfield        com/saterskog/cell_lab/CellWorld.H:F
        //  1565: fconst_0       
        //  1566: fcmpl          
        //  1567: ifle            1685
        //  1570: aload_0        
        //  1571: getfield        com/saterskog/cell_lab/q.r:Lcom/saterskog/cell_lab/CellWorld;
        //  1574: getfield        com/saterskog/cell_lab/CellWorld.H:F
        //  1577: ldc_w           2.89
        //  1580: fcmpg          
        //  1581: ifge            1685
        //  1584: aload_0        
        //  1585: getfield        com/saterskog/cell_lab/q.r:Lcom/saterskog/cell_lab/CellWorld;
        //  1588: getfield        com/saterskog/cell_lab/CellWorld.H:F
        //  1591: f2d            
        //  1592: invokestatic    java/lang/Math.sqrt:(D)D
        //  1595: d2f            
        //  1596: fstore          4
        //  1598: aload_0        
        //  1599: getfield        com/saterskog/cell_lab/q.f:F
        //  1602: aload_0        
        //  1603: getfield        com/saterskog/cell_lab/q.g:F
        //  1606: invokestatic    java/lang/Math.max:(FF)F
        //  1609: fstore          10
        //  1611: fconst_1       
        //  1612: ldc_w           0.085
        //  1615: fload           10
        //  1617: fdiv           
        //  1618: ldc             0.05
        //  1620: fsub           
        //  1621: invokestatic    java/lang/Math.min:(FF)F
        //  1624: fstore          5
        //  1626: fload           5
        //  1628: fconst_0       
        //  1629: fcmpl          
        //  1630: ifle            1675
        //  1633: ldc_w           1.5
        //  1636: fload           4
        //  1638: ldc_w           3.0
        //  1641: fmul           
        //  1642: fload           10
        //  1644: fdiv           
        //  1645: fsub           
        //  1646: fconst_1       
        //  1647: invokestatic    java/lang/Math.min:(FF)F
        //  1650: fload           5
        //  1652: fmul           
        //  1653: fstore          4
        //  1655: fload           4
        //  1657: ldc_w           0.003
        //  1660: fcmpl          
        //  1661: ifle            1675
        //  1664: aload_0        
        //  1665: getfield        com/saterskog/cell_lab/q.ap:Lcom/saterskog/cell_lab/p$a;
        //  1668: fload           4
        //  1670: invokeinterface com/saterskog/cell_lab/p$a.a:(F)V
        //  1675: aload_0        
        //  1676: getfield        com/saterskog/cell_lab/q.r:Lcom/saterskog/cell_lab/CellWorld;
        //  1679: ldc_w           -1.0
        //  1682: putfield        com/saterskog/cell_lab/CellWorld.H:F
        //  1685: aload_0        
        //  1686: getfield        com/saterskog/cell_lab/q.B:I
        //  1689: iconst_m1      
        //  1690: if_icmpeq       1803
        //  1693: aload_0        
        //  1694: getfield        com/saterskog/cell_lab/q.B:I
        //  1697: aload_0        
        //  1698: getfield        com/saterskog/cell_lab/q.r:Lcom/saterskog/cell_lab/CellWorld;
        //  1701: invokestatic    com/saterskog/cell_lab/j.a:(ILcom/saterskog/cell_lab/CellWorld;)Z
        //  1704: ifeq            1803
        //  1707: aload_0        
        //  1708: getfield        com/saterskog/cell_lab/q.M:Z
        //  1711: ifne            1803
        //  1714: aload_0        
        //  1715: iconst_1       
        //  1716: putfield        com/saterskog/cell_lab/q.M:Z
        //  1719: aload_0        
        //  1720: getfield        com/saterskog/cell_lab/q.B:I
        //  1723: aload_0        
        //  1724: getfield        com/saterskog/cell_lab/q.aw:Landroid/app/Activity;
        //  1727: invokestatic    com/saterskog/cell_lab/j.b:(ILandroid/content/Context;)Z
        //  1730: ifne            2595
        //  1733: iconst_1       
        //  1734: istore          11
        //  1736: iload           11
        //  1738: ifeq            1752
        //  1741: aload_0        
        //  1742: getfield        com/saterskog/cell_lab/q.B:I
        //  1745: aload_0        
        //  1746: getfield        com/saterskog/cell_lab/q.aw:Landroid/app/Activity;
        //  1749: invokestatic    com/saterskog/cell_lab/j.c:(ILandroid/content/Context;)V
        //  1752: aload_0        
        //  1753: getfield        com/saterskog/cell_lab/q.D:[F
        //  1756: iconst_0       
        //  1757: ldc_w           0.3
        //  1760: fastore        
        //  1761: aload_0        
        //  1762: getfield        com/saterskog/cell_lab/q.D:[F
        //  1765: iconst_1       
        //  1766: fconst_1       
        //  1767: fastore        
        //  1768: aload_0        
        //  1769: getfield        com/saterskog/cell_lab/q.D:[F
        //  1772: iconst_2       
        //  1773: ldc_w           0.3
        //  1776: fastore        
        //  1777: aload_0        
        //  1778: getfield        com/saterskog/cell_lab/q.aw:Landroid/app/Activity;
        //  1781: checkcast       Lcom/saterskog/cell_lab/PlayActivity;
        //  1784: astore_3       
        //  1785: aload_0        
        //  1786: getfield        com/saterskog/cell_lab/q.aw:Landroid/app/Activity;
        //  1789: new             Lcom/saterskog/cell_lab/q$7;
        //  1792: dup            
        //  1793: aload_0        
        //  1794: iload           11
        //  1796: aload_3        
        //  1797: invokespecial   com/saterskog/cell_lab/q$7.<init>:(Lcom/saterskog/cell_lab/q;ZLcom/saterskog/cell_lab/PlayActivity;)V
        //  1800: invokevirtual   android/app/Activity.runOnUiThread:(Ljava/lang/Runnable;)V
        //  1803: aload_0        
        //  1804: getfield        com/saterskog/cell_lab/q.ap:Lcom/saterskog/cell_lab/p$a;
        //  1807: aload_0        
        //  1808: getfield        com/saterskog/cell_lab/q.r:Lcom/saterskog/cell_lab/CellWorld;
        //  1811: aload_0        
        //  1812: getfield        com/saterskog/cell_lab/q.M:Z
        //  1815: invokeinterface com/saterskog/cell_lab/p$a.a:(Lcom/saterskog/cell_lab/CellWorld;Z)V
        //  1820: aload_0        
        //  1821: getfield        com/saterskog/cell_lab/q.aq:Z
        //  1824: ifeq            3118
        //  1827: aload_0        
        //  1828: iconst_0       
        //  1829: putfield        com/saterskog/cell_lab/q.aq:Z
        //  1832: iconst_0       
        //  1833: istore_2       
        //  1834: iload_2        
        //  1835: aload_0        
        //  1836: getfield        com/saterskog/cell_lab/q.r:Lcom/saterskog/cell_lab/CellWorld;
        //  1839: getfield        com/saterskog/cell_lab/CellWorld.z:I
        //  1842: if_icmpge       3336
        //  1845: aload_0        
        //  1846: getfield        com/saterskog/cell_lab/q.r:Lcom/saterskog/cell_lab/CellWorld;
        //  1849: getfield        com/saterskog/cell_lab/CellWorld.x:[Lcom/saterskog/cell_lab/Cell;
        //  1852: iload_2        
        //  1853: aaload         
        //  1854: getfield        com/saterskog/cell_lab/Cell.F:I
        //  1857: iconst_1       
        //  1858: if_icmpne       3090
        //  1861: aload_0        
        //  1862: getfield        com/saterskog/cell_lab/q.r:Lcom/saterskog/cell_lab/CellWorld;
        //  1865: getfield        com/saterskog/cell_lab/CellWorld.x:[Lcom/saterskog/cell_lab/Cell;
        //  1868: iload_2        
        //  1869: aaload         
        //  1870: getfield        com/saterskog/cell_lab/Cell.b:D
        //  1873: dstore          12
        //  1875: aload_0        
        //  1876: getfield        com/saterskog/cell_lab/q.r:Lcom/saterskog/cell_lab/CellWorld;
        //  1879: getfield        com/saterskog/cell_lab/CellWorld.x:[Lcom/saterskog/cell_lab/Cell;
        //  1882: iload_2        
        //  1883: aaload         
        //  1884: getfield        com/saterskog/cell_lab/Cell.c:D
        //  1887: dstore          14
        //  1889: aload_0        
        //  1890: getfield        com/saterskog/cell_lab/q.r:Lcom/saterskog/cell_lab/CellWorld;
        //  1893: getfield        com/saterskog/cell_lab/CellWorld.x:[Lcom/saterskog/cell_lab/Cell;
        //  1896: iload_2        
        //  1897: aaload         
        //  1898: getfield        com/saterskog/cell_lab/Cell.d:D
        //  1901: dstore          16
        //  1903: aload_0        
        //  1904: iconst_1       
        //  1905: putfield        com/saterskog/cell_lab/q.aq:Z
        //  1908: aload_0        
        //  1909: getfield        com/saterskog/cell_lab/q.A:I
        //  1912: iconst_4       
        //  1913: if_icmpne       1930
        //  1916: aload_0        
        //  1917: getfield        com/saterskog/cell_lab/q.q:Lcom/saterskog/cell_lab/q$a;
        //  1920: aload_0        
        //  1921: getfield        com/saterskog/cell_lab/q.r:Lcom/saterskog/cell_lab/CellWorld;
        //  1924: iload_2        
        //  1925: invokeinterface com/saterskog/cell_lab/q$a.a:(Lcom/saterskog/cell_lab/CellWorld;I)V
        //  1930: aload_0        
        //  1931: getfield        com/saterskog/cell_lab/q.R:Ljava/lang/Object;
        //  1934: astore_3       
        //  1935: aload_3        
        //  1936: monitorenter   
        //  1937: aload_0        
        //  1938: iconst_1       
        //  1939: putfield        com/saterskog/cell_lab/q.au:Z
        //  1942: iconst_0       
        //  1943: istore          9
        //  1945: iload           9
        //  1947: bipush          80
        //  1949: if_icmpge       2607
        //  1952: aload_0        
        //  1953: getfield        com/saterskog/cell_lab/q.Q:[Lcom/saterskog/cell_lab/Gene;
        //  1956: iload           9
        //  1958: aaload         
        //  1959: aload_0        
        //  1960: getfield        com/saterskog/cell_lab/q.r:Lcom/saterskog/cell_lab/CellWorld;
        //  1963: getfield        com/saterskog/cell_lab/CellWorld.x:[Lcom/saterskog/cell_lab/Cell;
        //  1966: iload_2        
        //  1967: aaload         
        //  1968: getfield        com/saterskog/cell_lab/Cell.I:[Lcom/saterskog/cell_lab/Gene;
        //  1971: iload           9
        //  1973: aaload         
        //  1974: invokevirtual   com/saterskog/cell_lab/Gene.a:(Lcom/saterskog/cell_lab/Gene;)V
        //  1977: aload_0        
        //  1978: getfield        com/saterskog/cell_lab/q.Q:[Lcom/saterskog/cell_lab/Gene;
        //  1981: iload           9
        //  1983: aaload         
        //  1984: astore          7
        //  1986: aload_0        
        //  1987: getfield        com/saterskog/cell_lab/q.r:Lcom/saterskog/cell_lab/CellWorld;
        //  1990: getfield        com/saterskog/cell_lab/CellWorld.x:[Lcom/saterskog/cell_lab/Cell;
        //  1993: iload_2        
        //  1994: aaload         
        //  1995: getfield        com/saterskog/cell_lab/Cell.D:I
        //  1998: iload           9
        //  2000: if_icmpne       2601
        //  2003: iconst_1       
        //  2004: istore          11
        //  2006: aload           7
        //  2008: iload           11
        //  2010: putfield        com/saterskog/cell_lab/Gene.p:Z
        //  2013: iinc            9, 1
        //  2016: goto            1945
        //  2019: astore_3       
        //  2020: aload_3        
        //  2021: invokevirtual   java/io/IOException.printStackTrace:()V
        //  2024: goto            898
        //  2027: astore_3       
        //  2028: aload_3        
        //  2029: invokevirtual   java/io/IOException.printStackTrace:()V
        //  2032: goto            905
        //  2035: astore_3       
        //  2036: aload_3        
        //  2037: invokevirtual   java/io/IOException.printStackTrace:()V
        //  2040: goto            964
        //  2043: aload_0        
        //  2044: getfield        com/saterskog/cell_lab/q.ap:Lcom/saterskog/cell_lab/p$a;
        //  2047: iconst_1       
        //  2048: invokeinterface com/saterskog/cell_lab/p$a.a:(S)V
        //  2053: goto            1402
        //  2056: aload_0        
        //  2057: getfield        com/saterskog/cell_lab/q.ap:Lcom/saterskog/cell_lab/p$a;
        //  2060: iconst_3       
        //  2061: invokeinterface com/saterskog/cell_lab/p$a.a:(S)V
        //  2066: aload_0        
        //  2067: aload_0        
        //  2068: getfield        com/saterskog/cell_lab/q.v:D
        //  2071: aload_0        
        //  2072: getfield        com/saterskog/cell_lab/q.w:D
        //  2075: invokespecial   com/saterskog/cell_lab/q.a:(DD)V
        //  2078: aload_0        
        //  2079: getfield        com/saterskog/cell_lab/q.r:Lcom/saterskog/cell_lab/CellWorld;
        //  2082: astore_3       
        //  2083: aload_3        
        //  2084: aload_3        
        //  2085: getfield        com/saterskog/cell_lab/CellWorld.V:I
        //  2088: iconst_1       
        //  2089: iadd           
        //  2090: putfield        com/saterskog/cell_lab/CellWorld.V:I
        //  2093: goto            1402
        //  2096: aload_0        
        //  2097: getfield        com/saterskog/cell_lab/q.ap:Lcom/saterskog/cell_lab/p$a;
        //  2100: iconst_2       
        //  2101: invokeinterface com/saterskog/cell_lab/p$a.a:(S)V
        //  2106: aload_0        
        //  2107: iconst_0       
        //  2108: putfield        com/saterskog/cell_lab/q.aq:Z
        //  2111: aload_0        
        //  2112: getfield        com/saterskog/cell_lab/q.r:Lcom/saterskog/cell_lab/CellWorld;
        //  2115: invokevirtual   com/saterskog/cell_lab/CellWorld.b:()V
        //  2118: aload_0        
        //  2119: getfield        com/saterskog/cell_lab/q.R:Ljava/lang/Object;
        //  2122: astore_3       
        //  2123: aload_3        
        //  2124: monitorenter   
        //  2125: aload_0        
        //  2126: iconst_0       
        //  2127: putfield        com/saterskog/cell_lab/q.au:Z
        //  2130: aload_3        
        //  2131: monitorexit    
        //  2132: goto            1402
        //  2135: astore_1       
        //  2136: aload_3        
        //  2137: monitorexit    
        //  2138: aload_1        
        //  2139: athrow         
        //  2140: aload_0        
        //  2141: getfield        com/saterskog/cell_lab/q.A:I
        //  2144: iconst_4       
        //  2145: if_icmpeq       2155
        //  2148: aload_0        
        //  2149: getfield        com/saterskog/cell_lab/q.A:I
        //  2152: ifne            2275
        //  2155: aload_0        
        //  2156: iconst_1       
        //  2157: putfield        com/saterskog/cell_lab/q.aq:Z
        //  2160: aload_0        
        //  2161: getfield        com/saterskog/cell_lab/q.r:Lcom/saterskog/cell_lab/CellWorld;
        //  2164: getfield        com/saterskog/cell_lab/CellWorld.x:[Lcom/saterskog/cell_lab/Cell;
        //  2167: iload           9
        //  2169: aaload         
        //  2170: getfield        com/saterskog/cell_lab/Cell.F:I
        //  2173: iconst_1       
        //  2174: if_icmpeq       2532
        //  2177: aload_0        
        //  2178: getfield        com/saterskog/cell_lab/q.ap:Lcom/saterskog/cell_lab/p$a;
        //  2181: bipush          8
        //  2183: invokeinterface com/saterskog/cell_lab/p$a.a:(S)V
        //  2188: aload_0        
        //  2189: iconst_1       
        //  2190: putfield        com/saterskog/cell_lab/q.aq:Z
        //  2193: aload_0        
        //  2194: getfield        com/saterskog/cell_lab/q.r:Lcom/saterskog/cell_lab/CellWorld;
        //  2197: invokevirtual   com/saterskog/cell_lab/CellWorld.b:()V
        //  2200: aload_0        
        //  2201: getfield        com/saterskog/cell_lab/q.r:Lcom/saterskog/cell_lab/CellWorld;
        //  2204: getfield        com/saterskog/cell_lab/CellWorld.x:[Lcom/saterskog/cell_lab/Cell;
        //  2207: iload           9
        //  2209: aaload         
        //  2210: iconst_1       
        //  2211: putfield        com/saterskog/cell_lab/Cell.F:I
        //  2214: aload_0        
        //  2215: aload_0        
        //  2216: getfield        com/saterskog/cell_lab/q.b:F
        //  2219: f2d            
        //  2220: aload_0        
        //  2221: getfield        com/saterskog/cell_lab/q.r:Lcom/saterskog/cell_lab/CellWorld;
        //  2224: getfield        com/saterskog/cell_lab/CellWorld.x:[Lcom/saterskog/cell_lab/Cell;
        //  2227: iload           9
        //  2229: aaload         
        //  2230: getfield        com/saterskog/cell_lab/Cell.b:D
        //  2233: dsub           
        //  2234: putfield        com/saterskog/cell_lab/q.x:D
        //  2237: aload_0        
        //  2238: aload_0        
        //  2239: getfield        com/saterskog/cell_lab/q.c:F
        //  2242: f2d            
        //  2243: aload_0        
        //  2244: getfield        com/saterskog/cell_lab/q.r:Lcom/saterskog/cell_lab/CellWorld;
        //  2247: getfield        com/saterskog/cell_lab/CellWorld.x:[Lcom/saterskog/cell_lab/Cell;
        //  2250: iload           9
        //  2252: aaload         
        //  2253: getfield        com/saterskog/cell_lab/Cell.c:D
        //  2256: dsub           
        //  2257: putfield        com/saterskog/cell_lab/q.y:D
        //  2260: aload_0        
        //  2261: getfield        com/saterskog/cell_lab/q.aw:Landroid/app/Activity;
        //  2264: new             Lcom/saterskog/cell_lab/q$6;
        //  2267: dup            
        //  2268: aload_0        
        //  2269: invokespecial   com/saterskog/cell_lab/q$6.<init>:(Lcom/saterskog/cell_lab/q;)V
        //  2272: invokevirtual   android/app/Activity.runOnUiThread:(Ljava/lang/Runnable;)V
        //  2275: aload_0        
        //  2276: getfield        com/saterskog/cell_lab/q.A:I
        //  2279: iconst_2       
        //  2280: if_icmpne       2438
        //  2283: aload_0        
        //  2284: getfield        com/saterskog/cell_lab/q.r:Lcom/saterskog/cell_lab/CellWorld;
        //  2287: getfield        com/saterskog/cell_lab/CellWorld.x:[Lcom/saterskog/cell_lab/Cell;
        //  2290: iload           9
        //  2292: aaload         
        //  2293: ldc2_w          0.36
        //  2296: putfield        com/saterskog/cell_lab/Cell.w:D
        //  2299: aload_0        
        //  2300: getfield        com/saterskog/cell_lab/q.r:Lcom/saterskog/cell_lab/CellWorld;
        //  2303: getfield        com/saterskog/cell_lab/CellWorld.x:[Lcom/saterskog/cell_lab/Cell;
        //  2306: iload           9
        //  2308: aaload         
        //  2309: getfield        com/saterskog/cell_lab/Cell.J:[F
        //  2312: iconst_0       
        //  2313: fconst_1       
        //  2314: fastore        
        //  2315: aload_0        
        //  2316: getfield        com/saterskog/cell_lab/q.r:Lcom/saterskog/cell_lab/CellWorld;
        //  2319: getfield        com/saterskog/cell_lab/CellWorld.x:[Lcom/saterskog/cell_lab/Cell;
        //  2322: iload           9
        //  2324: aaload         
        //  2325: getfield        com/saterskog/cell_lab/Cell.J:[F
        //  2328: iconst_1       
        //  2329: fconst_0       
        //  2330: fastore        
        //  2331: aload_0        
        //  2332: getfield        com/saterskog/cell_lab/q.r:Lcom/saterskog/cell_lab/CellWorld;
        //  2335: getfield        com/saterskog/cell_lab/CellWorld.x:[Lcom/saterskog/cell_lab/Cell;
        //  2338: iload           9
        //  2340: aaload         
        //  2341: getfield        com/saterskog/cell_lab/Cell.J:[F
        //  2344: iconst_2       
        //  2345: fconst_1       
        //  2346: fastore        
        //  2347: aload_0        
        //  2348: getfield        com/saterskog/cell_lab/q.r:Lcom/saterskog/cell_lab/CellWorld;
        //  2351: getfield        com/saterskog/cell_lab/CellWorld.x:[Lcom/saterskog/cell_lab/Cell;
        //  2354: iload           9
        //  2356: aaload         
        //  2357: dconst_1       
        //  2358: putfield        com/saterskog/cell_lab/Cell.p:D
        //  2361: aload_0        
        //  2362: getfield        com/saterskog/cell_lab/q.r:Lcom/saterskog/cell_lab/CellWorld;
        //  2365: getfield        com/saterskog/cell_lab/CellWorld.x:[Lcom/saterskog/cell_lab/Cell;
        //  2368: iload           9
        //  2370: aaload         
        //  2371: dconst_0       
        //  2372: putfield        com/saterskog/cell_lab/Cell.o:D
        //  2375: aload_0        
        //  2376: getfield        com/saterskog/cell_lab/q.r:Lcom/saterskog/cell_lab/CellWorld;
        //  2379: getfield        com/saterskog/cell_lab/CellWorld.x:[Lcom/saterskog/cell_lab/Cell;
        //  2382: iload           9
        //  2384: aaload         
        //  2385: getfield        com/saterskog/cell_lab/Cell.I:[Lcom/saterskog/cell_lab/Gene;
        //  2388: aload_0        
        //  2389: getfield        com/saterskog/cell_lab/q.r:Lcom/saterskog/cell_lab/CellWorld;
        //  2392: getfield        com/saterskog/cell_lab/CellWorld.x:[Lcom/saterskog/cell_lab/Cell;
        //  2395: iload           9
        //  2397: aaload         
        //  2398: getfield        com/saterskog/cell_lab/Cell.D:I
        //  2401: aaload         
        //  2402: getfield        com/saterskog/cell_lab/Gene.s:Lcom/saterskog/cell_lab/h;
        //  2405: getstatic       com/saterskog/cell_lab/h.e:Lcom/saterskog/cell_lab/h;
        //  2408: if_acmpne       2427
        //  2411: aload_0        
        //  2412: getfield        com/saterskog/cell_lab/q.r:Lcom/saterskog/cell_lab/CellWorld;
        //  2415: getfield        com/saterskog/cell_lab/CellWorld.x:[Lcom/saterskog/cell_lab/Cell;
        //  2418: iload           9
        //  2420: aaload         
        //  2421: ldc_w           1.8
        //  2424: putfield        com/saterskog/cell_lab/Cell.S:F
        //  2427: aload_0        
        //  2428: getfield        com/saterskog/cell_lab/q.ap:Lcom/saterskog/cell_lab/p$a;
        //  2431: bipush          10
        //  2433: invokeinterface com/saterskog/cell_lab/p$a.a:(S)V
        //  2438: aload_0        
        //  2439: getfield        com/saterskog/cell_lab/q.A:I
        //  2442: iconst_3       
        //  2443: if_icmpne       1465
        //  2446: iconst_m1      
        //  2447: istore_2       
        //  2448: aload_0        
        //  2449: getfield        com/saterskog/cell_lab/q.B:I
        //  2452: iconst_m1      
        //  2453: if_icmpeq       2477
        //  2456: aload_0        
        //  2457: getfield        com/saterskog/cell_lab/q.aw:Landroid/app/Activity;
        //  2460: invokestatic    com/saterskog/cell_lab/j.a:(Landroid/content/Context;)Ljava/util/ArrayList;
        //  2463: aload_0        
        //  2464: getfield        com/saterskog/cell_lab/q.B:I
        //  2467: invokevirtual   java/util/ArrayList.get:(I)Ljava/lang/Object;
        //  2470: checkcast       Lcom/saterskog/cell_lab/j$a;
        //  2473: getfield        com/saterskog/cell_lab/j$a.A:I
        //  2476: istore_2       
        //  2477: aload_0        
        //  2478: getfield        com/saterskog/cell_lab/q.r:Lcom/saterskog/cell_lab/CellWorld;
        //  2481: getfield        com/saterskog/cell_lab/CellWorld.W:I
        //  2484: iload_2        
        //  2485: if_icmplt       2493
        //  2488: iload_2        
        //  2489: iconst_m1      
        //  2490: if_icmpne       2557
        //  2493: aload_0        
        //  2494: getfield        com/saterskog/cell_lab/q.r:Lcom/saterskog/cell_lab/CellWorld;
        //  2497: iload           9
        //  2499: iconst_0       
        //  2500: invokevirtual   com/saterskog/cell_lab/CellWorld.a:(IZ)V
        //  2503: aload_0        
        //  2504: getfield        com/saterskog/cell_lab/q.r:Lcom/saterskog/cell_lab/CellWorld;
        //  2507: astore_3       
        //  2508: aload_3        
        //  2509: aload_3        
        //  2510: getfield        com/saterskog/cell_lab/CellWorld.W:I
        //  2513: iconst_1       
        //  2514: iadd           
        //  2515: putfield        com/saterskog/cell_lab/CellWorld.W:I
        //  2518: aload_0        
        //  2519: getfield        com/saterskog/cell_lab/q.ap:Lcom/saterskog/cell_lab/p$a;
        //  2522: bipush          10
        //  2524: invokeinterface com/saterskog/cell_lab/p$a.a:(S)V
        //  2529: goto            1465
        //  2532: aload_0        
        //  2533: getfield        com/saterskog/cell_lab/q.ap:Lcom/saterskog/cell_lab/p$a;
        //  2536: iconst_2       
        //  2537: invokeinterface com/saterskog/cell_lab/p$a.a:(S)V
        //  2542: aload_0        
        //  2543: iconst_0       
        //  2544: putfield        com/saterskog/cell_lab/q.aq:Z
        //  2547: aload_0        
        //  2548: getfield        com/saterskog/cell_lab/q.r:Lcom/saterskog/cell_lab/CellWorld;
        //  2551: invokevirtual   com/saterskog/cell_lab/CellWorld.b:()V
        //  2554: goto            2214
        //  2557: aload_0        
        //  2558: getfield        com/saterskog/cell_lab/q.D:[F
        //  2561: iconst_0       
        //  2562: fconst_1       
        //  2563: fastore        
        //  2564: aload_0        
        //  2565: getfield        com/saterskog/cell_lab/q.D:[F
        //  2568: iconst_1       
        //  2569: ldc_w           0.3
        //  2572: fastore        
        //  2573: aload_0        
        //  2574: getfield        com/saterskog/cell_lab/q.D:[F
        //  2577: iconst_2       
        //  2578: ldc_w           0.3
        //  2581: fastore        
        //  2582: aload_0        
        //  2583: getfield        com/saterskog/cell_lab/q.ap:Lcom/saterskog/cell_lab/p$a;
        //  2586: iconst_1       
        //  2587: invokeinterface com/saterskog/cell_lab/p$a.a:(S)V
        //  2592: goto            1465
        //  2595: iconst_0       
        //  2596: istore          11
        //  2598: goto            1736
        //  2601: iconst_0       
        //  2602: istore          11
        //  2604: goto            2006
        //  2607: aload_3        
        //  2608: monitorexit    
        //  2609: aload_0        
        //  2610: getfield        com/saterskog/cell_lab/q.aq:Z
        //  2613: ifeq            3096
        //  2616: aload_0        
        //  2617: aload_0        
        //  2618: getfield        com/saterskog/cell_lab/q.x:D
        //  2621: ldc2_w          0.8
        //  2624: dmul           
        //  2625: putfield        com/saterskog/cell_lab/q.x:D
        //  2628: aload_0        
        //  2629: aload_0        
        //  2630: getfield        com/saterskog/cell_lab/q.y:D
        //  2633: ldc2_w          0.8
        //  2636: dmul           
        //  2637: putfield        com/saterskog/cell_lab/q.y:D
        //  2640: aload_0        
        //  2641: aload_0        
        //  2642: getfield        com/saterskog/cell_lab/q.x:D
        //  2645: dload           12
        //  2647: dadd           
        //  2648: d2f            
        //  2649: putfield        com/saterskog/cell_lab/q.b:F
        //  2652: aload_0        
        //  2653: aload_0        
        //  2654: getfield        com/saterskog/cell_lab/q.y:D
        //  2657: dload           14
        //  2659: dadd           
        //  2660: d2f            
        //  2661: putfield        com/saterskog/cell_lab/q.c:F
        //  2664: aload_0        
        //  2665: getfield        com/saterskog/cell_lab/q.H:[F
        //  2668: iconst_0       
        //  2669: dload           12
        //  2671: d2f            
        //  2672: fastore        
        //  2673: aload_0        
        //  2674: getfield        com/saterskog/cell_lab/q.H:[F
        //  2677: iconst_1       
        //  2678: dload           14
        //  2680: d2f            
        //  2681: fastore        
        //  2682: aload_0        
        //  2683: getfield        com/saterskog/cell_lab/q.H:[F
        //  2686: iconst_2       
        //  2687: dload           16
        //  2689: ldc2_w          0.01
        //  2692: dadd           
        //  2693: d2f            
        //  2694: fastore        
        //  2695: aload_0        
        //  2696: invokevirtual   com/saterskog/cell_lab/q.b:()V
        //  2699: aload_0        
        //  2700: getfield        com/saterskog/cell_lab/q.aq:Z
        //  2703: ifne            2716
        //  2706: aload_0        
        //  2707: getfield        com/saterskog/cell_lab/q.ap:Lcom/saterskog/cell_lab/p$a;
        //  2710: iconst_2       
        //  2711: invokeinterface com/saterskog/cell_lab/p$a.a:(S)V
        //  2716: aload_0        
        //  2717: getfield        com/saterskog/cell_lab/q.z:I
        //  2720: iconst_1       
        //  2721: if_icmpeq       2732
        //  2724: aload_0        
        //  2725: getfield        com/saterskog/cell_lab/q.z:I
        //  2728: iconst_3       
        //  2729: if_icmpne       3143
        //  2732: aload_0        
        //  2733: getfield        com/saterskog/cell_lab/q.ap:Lcom/saterskog/cell_lab/p$a;
        //  2736: invokeinterface com/saterskog/cell_lab/p$a.g:()Z
        //  2741: ifeq            3143
        //  2744: aload_0        
        //  2745: getfield        com/saterskog/cell_lab/q.r:Lcom/saterskog/cell_lab/CellWorld;
        //  2748: iconst_1       
        //  2749: putfield        com/saterskog/cell_lab/CellWorld.I:Z
        //  2752: aload_0        
        //  2753: getfield        com/saterskog/cell_lab/q.r:Lcom/saterskog/cell_lab/CellWorld;
        //  2756: aload_0        
        //  2757: getfield        com/saterskog/cell_lab/q.b:F
        //  2760: putfield        com/saterskog/cell_lab/CellWorld.F:F
        //  2763: aload_0        
        //  2764: getfield        com/saterskog/cell_lab/q.r:Lcom/saterskog/cell_lab/CellWorld;
        //  2767: aload_0        
        //  2768: getfield        com/saterskog/cell_lab/q.c:F
        //  2771: putfield        com/saterskog/cell_lab/CellWorld.G:F
        //  2774: aload_0        
        //  2775: getfield        com/saterskog/cell_lab/q.z:I
        //  2778: iconst_1       
        //  2779: if_icmpeq       2790
        //  2782: aload_0        
        //  2783: getfield        com/saterskog/cell_lab/q.z:I
        //  2786: iconst_3       
        //  2787: if_icmpne       3164
        //  2790: aload_0        
        //  2791: getfield        com/saterskog/cell_lab/q.z:I
        //  2794: iconst_1       
        //  2795: if_icmpne       3154
        //  2798: dconst_1       
        //  2799: dstore          16
        //  2801: aload_0        
        //  2802: aload_0        
        //  2803: getfield        com/saterskog/cell_lab/q.an:Ljava/util/concurrent/ThreadPoolExecutor;
        //  2806: new             Lcom/saterskog/cell_lab/q$1;
        //  2809: dup            
        //  2810: aload_0        
        //  2811: dload           16
        //  2813: invokespecial   com/saterskog/cell_lab/q$1.<init>:(Lcom/saterskog/cell_lab/q;D)V
        //  2816: invokevirtual   java/util/concurrent/ThreadPoolExecutor.submit:(Ljava/lang/Runnable;)Ljava/util/concurrent/Future;
        //  2819: putfield        com/saterskog/cell_lab/q.E:Ljava/util/concurrent/Future;
        //  2822: aload_0        
        //  2823: aload_0        
        //  2824: getfield        com/saterskog/cell_lab/q.an:Ljava/util/concurrent/ThreadPoolExecutor;
        //  2827: new             Lcom/saterskog/cell_lab/q$2;
        //  2830: dup            
        //  2831: aload_0        
        //  2832: dload           16
        //  2834: invokespecial   com/saterskog/cell_lab/q$2.<init>:(Lcom/saterskog/cell_lab/q;D)V
        //  2837: invokevirtual   java/util/concurrent/ThreadPoolExecutor.submit:(Ljava/lang/Runnable;)Ljava/util/concurrent/Future;
        //  2840: putfield        com/saterskog/cell_lab/q.F:Ljava/util/concurrent/Future;
        //  2843: aload_0        
        //  2844: getfield        com/saterskog/cell_lab/q.L:[F
        //  2847: iconst_0       
        //  2848: fconst_2       
        //  2849: aload_0        
        //  2850: getfield        com/saterskog/cell_lab/q.f:F
        //  2853: fdiv           
        //  2854: fastore        
        //  2855: aload_0        
        //  2856: getfield        com/saterskog/cell_lab/q.L:[F
        //  2859: iconst_1       
        //  2860: fconst_0       
        //  2861: fastore        
        //  2862: aload_0        
        //  2863: getfield        com/saterskog/cell_lab/q.L:[F
        //  2866: iconst_2       
        //  2867: fconst_0       
        //  2868: fastore        
        //  2869: aload_0        
        //  2870: getfield        com/saterskog/cell_lab/q.L:[F
        //  2873: iconst_3       
        //  2874: fconst_0       
        //  2875: fastore        
        //  2876: aload_0        
        //  2877: getfield        com/saterskog/cell_lab/q.L:[F
        //  2880: iconst_4       
        //  2881: fconst_0       
        //  2882: fastore        
        //  2883: aload_0        
        //  2884: getfield        com/saterskog/cell_lab/q.L:[F
        //  2887: iconst_5       
        //  2888: fconst_2       
        //  2889: aload_0        
        //  2890: getfield        com/saterskog/cell_lab/q.g:F
        //  2893: fdiv           
        //  2894: fastore        
        //  2895: aload_0        
        //  2896: getfield        com/saterskog/cell_lab/q.L:[F
        //  2899: bipush          6
        //  2901: fconst_0       
        //  2902: fastore        
        //  2903: aload_0        
        //  2904: getfield        com/saterskog/cell_lab/q.L:[F
        //  2907: bipush          7
        //  2909: fconst_0       
        //  2910: fastore        
        //  2911: aload_0        
        //  2912: getfield        com/saterskog/cell_lab/q.L:[F
        //  2915: bipush          8
        //  2917: fconst_0       
        //  2918: fastore        
        //  2919: aload_0        
        //  2920: getfield        com/saterskog/cell_lab/q.L:[F
        //  2923: bipush          9
        //  2925: fconst_0       
        //  2926: fastore        
        //  2927: aload_0        
        //  2928: getfield        com/saterskog/cell_lab/q.L:[F
        //  2931: bipush          10
        //  2933: fconst_1       
        //  2934: fastore        
        //  2935: aload_0        
        //  2936: getfield        com/saterskog/cell_lab/q.L:[F
        //  2939: bipush          11
        //  2941: fconst_0       
        //  2942: fastore        
        //  2943: aload_0        
        //  2944: getfield        com/saterskog/cell_lab/q.L:[F
        //  2947: bipush          12
        //  2949: ldc_w           -2.0
        //  2952: aload_0        
        //  2953: getfield        com/saterskog/cell_lab/q.b:F
        //  2956: fmul           
        //  2957: aload_0        
        //  2958: getfield        com/saterskog/cell_lab/q.f:F
        //  2961: fdiv           
        //  2962: fastore        
        //  2963: aload_0        
        //  2964: getfield        com/saterskog/cell_lab/q.L:[F
        //  2967: bipush          13
        //  2969: ldc_w           -2.0
        //  2972: aload_0        
        //  2973: getfield        com/saterskog/cell_lab/q.c:F
        //  2976: fmul           
        //  2977: aload_0        
        //  2978: getfield        com/saterskog/cell_lab/q.g:F
        //  2981: fdiv           
        //  2982: fastore        
        //  2983: aload_0        
        //  2984: getfield        com/saterskog/cell_lab/q.L:[F
        //  2987: bipush          14
        //  2989: fconst_0       
        //  2990: fastore        
        //  2991: aload_0        
        //  2992: getfield        com/saterskog/cell_lab/q.L:[F
        //  2995: bipush          15
        //  2997: fconst_1       
        //  2998: fastore        
        //  2999: iconst_0       
        //  3000: istore_2       
        //  3001: iload_2        
        //  3002: iconst_4       
        //  3003: if_icmpge       3206
        //  3006: iconst_0       
        //  3007: istore          9
        //  3009: iload           9
        //  3011: iconst_4       
        //  3012: if_icmpge       3200
        //  3015: aload_0        
        //  3016: getfield        com/saterskog/cell_lab/q.K:[F
        //  3019: iload           9
        //  3021: iconst_4       
        //  3022: imul           
        //  3023: iload_2        
        //  3024: iadd           
        //  3025: fconst_0       
        //  3026: fastore        
        //  3027: iconst_0       
        //  3028: istore          18
        //  3030: iload           18
        //  3032: iconst_4       
        //  3033: if_icmpge       3194
        //  3036: aload_0        
        //  3037: getfield        com/saterskog/cell_lab/q.K:[F
        //  3040: astore_3       
        //  3041: iload           9
        //  3043: iconst_4       
        //  3044: imul           
        //  3045: iload_2        
        //  3046: iadd           
        //  3047: istore          19
        //  3049: aload_3        
        //  3050: iload           19
        //  3052: aload_3        
        //  3053: iload           19
        //  3055: faload         
        //  3056: aload_0        
        //  3057: getfield        com/saterskog/cell_lab/q.L:[F
        //  3060: iload           9
        //  3062: iconst_4       
        //  3063: imul           
        //  3064: iload           18
        //  3066: iadd           
        //  3067: faload         
        //  3068: aload_1        
        //  3069: iload           18
        //  3071: iconst_4       
        //  3072: imul           
        //  3073: iload_2        
        //  3074: iadd           
        //  3075: faload         
        //  3076: fmul           
        //  3077: fadd           
        //  3078: fastore        
        //  3079: iinc            18, 1
        //  3082: goto            3030
        //  3085: astore_1       
        //  3086: aload_3        
        //  3087: monitorexit    
        //  3088: aload_1        
        //  3089: athrow         
        //  3090: iinc            2, 1
        //  3093: goto            1834
        //  3096: aload_0        
        //  3097: getfield        com/saterskog/cell_lab/q.R:Ljava/lang/Object;
        //  3100: astore_3       
        //  3101: aload_3        
        //  3102: monitorenter   
        //  3103: aload_0        
        //  3104: iconst_0       
        //  3105: putfield        com/saterskog/cell_lab/q.au:Z
        //  3108: aload_3        
        //  3109: monitorexit    
        //  3110: goto            2699
        //  3113: astore_1       
        //  3114: aload_3        
        //  3115: monitorexit    
        //  3116: aload_1        
        //  3117: athrow         
        //  3118: aload_0        
        //  3119: getfield        com/saterskog/cell_lab/q.A:I
        //  3122: iconst_4       
        //  3123: if_icmpne       2716
        //  3126: aload_0        
        //  3127: getfield        com/saterskog/cell_lab/q.q:Lcom/saterskog/cell_lab/q$a;
        //  3130: aload_0        
        //  3131: getfield        com/saterskog/cell_lab/q.r:Lcom/saterskog/cell_lab/CellWorld;
        //  3134: iconst_m1      
        //  3135: invokeinterface com/saterskog/cell_lab/q$a.a:(Lcom/saterskog/cell_lab/CellWorld;I)V
        //  3140: goto            2716
        //  3143: aload_0        
        //  3144: getfield        com/saterskog/cell_lab/q.r:Lcom/saterskog/cell_lab/CellWorld;
        //  3147: iconst_0       
        //  3148: putfield        com/saterskog/cell_lab/CellWorld.I:Z
        //  3151: goto            2774
        //  3154: aload_0        
        //  3155: getfield        com/saterskog/cell_lab/q.C:F
        //  3158: f2d            
        //  3159: dstore          16
        //  3161: goto            2801
        //  3164: aload_0        
        //  3165: getfield        com/saterskog/cell_lab/q.z:I
        //  3168: iconst_2       
        //  3169: if_icmpne       2843
        //  3172: aload_0        
        //  3173: aload_0        
        //  3174: getfield        com/saterskog/cell_lab/q.an:Ljava/util/concurrent/ThreadPoolExecutor;
        //  3177: new             Lcom/saterskog/cell_lab/q$3;
        //  3180: dup            
        //  3181: aload_0        
        //  3182: invokespecial   com/saterskog/cell_lab/q$3.<init>:(Lcom/saterskog/cell_lab/q;)V
        //  3185: invokevirtual   java/util/concurrent/ThreadPoolExecutor.submit:(Ljava/lang/Runnable;)Ljava/util/concurrent/Future;
        //  3188: putfield        com/saterskog/cell_lab/q.F:Ljava/util/concurrent/Future;
        //  3191: goto            2843
        //  3194: iinc            9, 1
        //  3197: goto            3009
        //  3200: iinc            2, 1
        //  3203: goto            3001
        //  3206: aload_0        
        //  3207: getfield        com/saterskog/cell_lab/q.r:Lcom/saterskog/cell_lab/CellWorld;
        //  3210: aload_0        
        //  3211: getfield        com/saterskog/cell_lab/q.K:[F
        //  3214: invokevirtual   com/saterskog/cell_lab/CellWorld.a:([F)V
        //  3217: sipush          2929
        //  3220: invokestatic    android/opengl/GLES20.glDisable:(I)V
        //  3223: sipush          3042
        //  3226: invokestatic    android/opengl/GLES20.glEnable:(I)V
        //  3229: iconst_1       
        //  3230: sipush          770
        //  3233: invokestatic    android/opengl/GLES20.glBlendFunc:(II)V
        //  3236: aload_0        
        //  3237: getfield        com/saterskog/cell_lab/q.G:Z
        //  3240: ifne            3250
        //  3243: aload_0        
        //  3244: getfield        com/saterskog/cell_lab/q.aq:Z
        //  3247: ifeq            3277
        //  3250: aload_0        
        //  3251: aload_0        
        //  3252: getfield        com/saterskog/cell_lab/q.K:[F
        //  3255: aload_0        
        //  3256: getfield        com/saterskog/cell_lab/q.H:[F
        //  3259: iconst_0       
        //  3260: faload         
        //  3261: aload_0        
        //  3262: getfield        com/saterskog/cell_lab/q.H:[F
        //  3265: iconst_1       
        //  3266: faload         
        //  3267: aload_0        
        //  3268: getfield        com/saterskog/cell_lab/q.H:[F
        //  3271: iconst_2       
        //  3272: faload         
        //  3273: fconst_1       
        //  3274: invokevirtual   com/saterskog/cell_lab/q.a:([FFFFF)V
        //  3277: invokestatic    java/lang/System.nanoTime:()J
        //  3280: aload_0        
        //  3281: getfield        com/saterskog/cell_lab/q.ar:J
        //  3284: lsub           
        //  3285: lstore          20
        //  3287: lload           20
        //  3289: ldc2_w          16666666
        //  3292: lcmp           
        //  3293: ifge            3316
        //  3296: lload           20
        //  3298: lconst_0       
        //  3299: lcmp           
        //  3300: ifle            3316
        //  3303: ldc2_w          16666666
        //  3306: lload           20
        //  3308: lsub           
        //  3309: ldc2_w          1000000
        //  3312: ldiv           
        //  3313: invokestatic    java/lang/Thread.sleep:(J)V
        //  3316: aload_0        
        //  3317: invokestatic    java/lang/System.nanoTime:()J
        //  3320: putfield        com/saterskog/cell_lab/q.ar:J
        //  3323: return         
        //  3324: astore_1       
        //  3325: aload_1        
        //  3326: invokevirtual   java/lang/InterruptedException.printStackTrace:()V
        //  3329: goto            3316
        //  3332: astore_3       
        //  3333: goto            506
        //  3336: dconst_0       
        //  3337: dstore          16
        //  3339: dconst_0       
        //  3340: dstore          14
        //  3342: dconst_0       
        //  3343: dstore          12
        //  3345: goto            2609
        //  3348: iconst_1       
        //  3349: istore_2       
        //  3350: goto            1276
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                     
        //  -----  -----  -----  -----  -----------------------------------------
        //  288    298    483    491    Ljava/lang/InterruptedException;
        //  288    298    491    499    Ljava/util/concurrent/ExecutionException;
        //  417    427    505    506    Ljava/lang/InterruptedException;
        //  417    427    3332   3336   Ljava/util/concurrent/ExecutionException;
        //  650    746    2019   2027   Ljava/io/IOException;
        //  748    767    2019   2027   Ljava/io/IOException;
        //  779    788    2019   2027   Ljava/io/IOException;
        //  790    866    2019   2027   Ljava/io/IOException;
        //  872    898    2019   2027   Ljava/io/IOException;
        //  898    905    2027   2035   Ljava/io/IOException;
        //  945    964    2035   2043   Ljava/io/IOException;
        //  1937   1942   3085   3090   Any
        //  1952   2003   3085   3090   Any
        //  2006   2013   3085   3090   Any
        //  2125   2132   2135   2140   Any
        //  2136   2138   2135   2140   Any
        //  2607   2609   3085   3090   Any
        //  3086   3088   3085   3090   Any
        //  3103   3110   3113   3118   Any
        //  3114   3116   3113   3118   Any
        //  3303   3316   3324   3332   Ljava/lang/InterruptedException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index 1711 out of bounds for length 1711
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
    
    public final Gene[] c() {
        synchronized (this.R) {
            Gene[] array;
            if (this.au) {
                array = new Gene[80];
                for (int i = 0; i < 80; ++i) {
                    array[i] = new Gene(this.Q[i]);
                }
            }
            else {
                array = null;
            }
            // monitorexit(this.R)
            return array;
        }
    }
    
    public final void onSurfaceCreated(final GL10 gl10, final EGLConfig eglConfig) {
        GLES20.glClearColor(0.8f, 0.8f, 1.0f, 1.0f);
        this.r.a((Context)this.aw);
        this.a();
    }
    
    public interface a
    {
        void a(final float p0);
        
        void a(final CellWorld p0);
        
        void a(final CellWorld p0, final int p1);
    }
}
