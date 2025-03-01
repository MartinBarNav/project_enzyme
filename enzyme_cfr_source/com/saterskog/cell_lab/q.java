/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.content.Context
 *  android.opengl.GLES20
 *  android.opengl.GLSurfaceView$Renderer
 *  android.preference.PreferenceManager
 *  android.widget.Toast
 *  javax.microedition.khronos.egl.EGLConfig
 *  javax.microedition.khronos.opengles.GL10
 */
package com.saterskog.cell_lab;

import android.app.Activity;
import android.content.Context;
import android.opengl.GLES20;
import android.opengl.GLSurfaceView;
import android.preference.PreferenceManager;
import android.widget.Toast;
import com.saterskog.cell_lab.Cell;
import com.saterskog.cell_lab.CellWorld;
import com.saterskog.cell_lab.Environment;
import com.saterskog.cell_lab.Gene;
import com.saterskog.cell_lab.PlayActivity;
import com.saterskog.cell_lab.d;
import com.saterskog.cell_lab.h;
import com.saterskog.cell_lab.j;
import com.saterskog.cell_lab.p;
import com.saterskog.cell_lab.t;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.zip.GZIPOutputStream;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;

public final class q
extends d
implements GLSurfaceView.Renderer {
    private static int am = 1;
    public int A;
    public int B;
    float C = 0.05f;
    float[] D;
    Future E;
    Future F;
    public boolean G = false;
    public float[] H;
    public float[] I;
    final float[] J;
    final float[] K;
    final float[] L;
    public boolean M;
    protected OutputStream N = null;
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
    private long ar = -1000000000L;
    private InputStream as;
    private int at;
    private boolean au;
    private boolean av;
    private Activity aw;
    double p;
    a q;
    CellWorld r;
    Environment s = new Environment();
    boolean t = false;
    boolean u;
    double v;
    double w;
    double x;
    double y;
    public int z;

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public q(CellWorld object, Activity object2, p.a a2, a a3, int n2, double d2) {
        super((float)(1.1 * d2), false, (Context)object2);
        this.D = new float[]{0.8f, 0.8f, 1.0f};
        this.H = new float[4];
        this.I = new float[4];
        this.J = new float[]{0.0f, 0.0f, 0.0f};
        this.K = new float[16];
        this.L = new float[16];
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
        this.aw = object2;
        this.ap = a2;
        this.q = a3;
        if (n2 != -1) {
            this.M = false;
        }
        if (object == null) {
            com.saterskog.b.a.a("skit");
        }
        this.r = object;
        this.F = null;
        this.E = null;
        this.B = n2;
        this.ao = new LinkedBlockingQueue<Runnable>();
        this.an = new ThreadPoolExecutor(1, 1, 1L, TimeUnit.SECONDS, this.ao);
        object2 = this.R;
        synchronized (object2) {
            this.Q = new Gene[80];
            for (n2 = 0; n2 < 80; ++n2) {
                this.Q[n2] = new Gene();
            }
            this.au = false;
        }
        this.b = 0.0f;
        this.c = 0.0f;
        this.aq = false;
        this.d = 1.0f / (float)d2;
        this.z = 0;
        this.e = 1.0f;
        this.u = false;
        this.O = -1;
        this.as = null;
        this.P = false;
        this.av = true;
        object = PreferenceManager.getDefaultSharedPreferences((Context)this.aw).getString("log_stats", "none");
        this.p = -1.0;
        if (((String)object).equals("12m")) {
            this.p = 0.2;
        }
        if (((String)object).equals("1h")) {
            this.p = 1.0;
        }
        if (((String)object).equals("5h")) {
            this.p = 5.0;
        }
        if (((String)object).equals("25h")) {
            this.p = 25.0;
        }
        if (((String)object).equals("125h")) {
            this.p = 125.0;
        }
        if (((String)object).equals("625h")) {
            this.p = 625.0;
        }
        this.b();
    }

    /*
     * Enabled aggressive block sorting
     */
    private void a(double d2, double d3) {
        int n2;
        Cell cell = new Cell();
        cell.b = d2;
        cell.c = d3;
        cell.p = 1.0;
        cell.T = -1;
        for (n2 = 0; n2 < 4; ++n2) {
            cell.U[n2] = 0.01f;
        }
        Gene[] arrgene = this.ap.f();
        cell.D = 0;
        for (n2 = 0; n2 < 80; ++n2) {
            cell.I[n2] = new Gene(arrgene[n2]);
            if (!cell.I[n2].p) continue;
            cell.D = n2;
        }
        cell.w = cell.I[cell.D].s == com.saterskog.cell_lab.h.e ? 1.728 : 0.288;
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
        cell.m = com.saterskog.b.d.a.b() * Math.PI;
        cell.C = 0;
        cell.E = 1;
        cell.F = 0;
        cell.y = false;
        cell.o = 0.1;
        cell.G = 0;
        if (this.r.z == this.r.e.r && this.r.z > 0) {
            this.r.x[com.saterskog.b.d.a.nextInt(this.r.z)].a(this.r.x[this.r.z - 1]);
            CellWorld cellWorld = this.r;
            --cellWorld.z;
        }
        this.r.a(cell);
        if (cell.I[0].u[5] == 0 && cell.I[0].t[7].e == 0 && Math.abs((double)cell.I[0].t[7].b - 1.0) < 0.1) {
            com.saterskog.cell_lab.t.a(this.aw, 3, 4, 2500);
        }
        if (cell.I[2].u[5] == 0 && cell.I[2].u[6] == 1 && cell.I[2].t[7].d == 1 && cell.I[2].t[8].d == 0 && Math.abs(cell.I[2].t[7].a - 0.4355f) < 0.2f && Math.abs(cell.I[2].t[8].a + 0.4355f) < 0.2f) {
            com.saterskog.cell_lab.t.a(this.aw, 3, 6, 2500);
        }
    }

    static /* synthetic */ void a(q q2, boolean bl) {
        long l2 = 0L;
        if (q2.p > 0.0) {
            l2 = Math.round(q2.r.M / q2.p);
        }
        q2.r.b(bl, 1.0);
        q2.r.a(1.0);
        if (q2.p > 0.0 && l2 != Math.round(q2.r.M / q2.p)) {
            q2.q.a(q2.r);
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    private void d() {
        int n2;
        int n3;
        block15: {
            int n4;
            if (this.A != 1) break block15;
            n3 = 0;
            while (true) {
                if (n3 >= this.ac) break;
                if (this.ab == this.aa) {
                    for (n2 = 0; n2 < 20; ++n2) {
                        if (this.Z[n2]) continue;
                        n4 = this.r.a(this.af[n3], (double)this.ag[n3]);
                        if (n4 == -1) break;
                        this.Y[n2] = this.aj[n3];
                        this.U[n2] = this.af[n3];
                        this.V[n2] = this.ag[n3];
                        this.r.x[n4].F = n2 + 100;
                        this.W[n2] = this.af[n3] - (float)this.r.x[n4].b;
                        this.X[n2] = this.ag[n3] - (float)this.r.x[n4].c;
                        this.Z[n2] = true;
                        ++this.ab;
                        break;
                    }
                }
                ++this.aa;
                ++n3;
            }
            this.ac = 0;
            n3 = 0;
            while (true) {
                block17: {
                    block18: {
                        block16: {
                            if (n3 >= this.ae) break block16;
                            if (this.ab != this.aa) break block17;
                            break block18;
                        }
                        this.ae = 0;
                        break;
                    }
                    for (n2 = 0; n2 < 20; ++n2) {
                        if (!this.Z[n2] || this.Y[n2] != this.al[n3]) continue;
                        if (this.r.a(n2 + 100) == -1) {
                            this.Z[n2] = false;
                            --this.ab;
                            break;
                        }
                        this.U[n2] = this.ah[n3];
                        this.V[n2] = this.ai[n3];
                        break;
                    }
                }
                ++n3;
            }
            for (n3 = 0; n3 < this.ad; --this.aa, ++n3) {
                for (n2 = 0; n2 < 20; ++n2) {
                    if (!this.Z[n2] || this.Y[n2] != this.ak[n3]) continue;
                    n4 = this.r.a(n2 + 100);
                    if (n4 != -1) {
                        this.r.x[n4].F = 0;
                    }
                    this.Z[n2] = false;
                    --this.ab;
                }
            }
            this.ad = 0;
        }
        n3 = 0;
        while (n3 < 20) {
            if (this.Z[n3] && (n2 = this.r.a(n3 + 100)) != -1) {
                double d2 = this.W[n3];
                double d3 = this.X[n3];
                double d4 = this.r.x[n2].b;
                double d5 = this.r.x[n2].c;
                double d6 = this.U[n3];
                double d7 = (((double)this.V[n3] - (d5 + d3)) * d2 - (d6 - (d4 + d2)) * d3) / (this.r.x[n2].d * this.r.x[n2].d) * 0.5;
                d4 = this.r.x[n2].b;
                d6 = this.r.x[n2].c;
                d5 = this.r.x[n2].k;
                Object object = this.r.x[n2];
                ((Cell)object).k += d7;
                this.W[n3] = (float)(Math.cos(d7) * d2 - Math.sin(d7) * d3);
                object = this.X;
                double d8 = Math.cos(d7);
                object[n3] = (float)(d2 * Math.sin(d7) + d3 * d8);
                this.r.x[n2].b = this.U[n3] - this.W[n3];
                this.r.x[n2].c = this.V[n3] - this.X[n3];
                d2 = 1.0;
                if (this.z == 1) {
                    d2 = 0.02;
                }
                if (this.z == 3) {
                    d2 = 0.02 * (double)this.C;
                }
                if (this.z == 1 || this.z == 3) {
                    this.r.x[n2].z = false;
                    this.r.x[n2].e = (this.r.x[n2].b - d4) / d2;
                    this.r.x[n2].f = (this.r.x[n2].c - d6) / d2;
                    this.r.x[n2].l = (this.r.x[n2].k - d5) / d2;
                }
                this.r.L = false;
            }
            ++n3;
        }
        return;
    }

    /*
     * Enabled aggressive block sorting
     */
    public final void a(float f2, float f3) {
        if (this.A == 1) {
            for (int i2 = 0; i2 < 20; ++i2) {
                if (!this.Z[i2]) continue;
                return;
            }
        }
        if (this.aq) return;
        if (!this.l) return;
        if (f2 * f2 + f3 * f3 > 1.0f) {
            this.av = true;
        }
        this.b -= f2 / this.a;
        this.c += f3 / this.a;
        if ((double)this.c > 0.7 && this.h != null && this.h instanceof Activity) {
            com.saterskog.cell_lab.t.b((Activity)this.h, 0, 2);
        }
        this.b();
    }

    /*
     * Enabled aggressive block sorting
     */
    public final void a(float f2, float f3, float f4) {
        if (this.A == 1) {
            for (int i2 = 0; i2 < 20; ++i2) {
                if (!this.Z[i2]) continue;
                return;
            }
        }
        if (!this.l) return;
        this.d *= f2;
        if (!this.aq) {
            if ((double)Math.abs(1.0f - f2) > 1.0E-4) {
                this.av = true;
            }
            this.b = (float)((double)this.b + (this.a(f3) - (double)this.b) * (double)(f2 - 1.0f));
            this.c = (float)((double)this.c + (this.b(f4) - (double)this.c) * (double)(f2 - 1.0f));
        }
        this.b();
        if (this.q == null) return;
        this.q.a(this.f * 5.0E-4f);
    }

    public final void a(int n2) {
        if (this.ad < 200) {
            this.ak[this.ad] = n2;
            ++this.ad;
        }
    }

    public final void a(InputStream inputStream, int n2) {
        this.at = n2;
        this.as = inputStream;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    @Override
    public final void a(float[] var1_1) {
        block100: {
            block101: {
                block103: {
                    block104: {
                        block98: {
                            block102: {
                                block99: {
                                    if (this.z == 0) {
                                        this.J[0] = 0.85f;
                                        this.J[1] = 0.85f;
                                        this.J[2] = 1.0f;
                                    }
                                    if (this.z == 1) {
                                        this.J[0] = 0.73f;
                                        this.J[1] = 0.7f;
                                        this.J[2] = 0.95f;
                                    }
                                    if (this.z == 2) {
                                        this.J[0] = 0.9f;
                                        this.J[1] = 0.75f;
                                        this.J[2] = 0.65f;
                                    }
                                    if (this.z == 3) {
                                        this.J[0] = 0.85f;
                                        this.J[1] = 1.0f;
                                        this.J[2] = 0.85f;
                                    }
                                    for (var2_3 = 0; var2_3 < 3; ++var2_3) {
                                        var3_4 /* !! */  = this.D;
                                        var3_4 /* !! */ [var2_3] = (float)((double)var3_4 /* !! */ [var2_3] + (double)(this.J[var2_3] - this.D[var2_3]) * 0.1);
                                    }
                                    this.a(this.S * 0.01f, this.T * 0.01f);
                                    this.S = (float)((double)this.S * 0.92);
                                    this.T = (float)((double)this.T * 0.92);
                                    GLES20.glClearColor((float)this.D[0], (float)this.D[1], (float)this.D[2], (float)1.0f);
                                    GLES20.glDepthMask((boolean)true);
                                    GLES20.glClear((int)16640);
                                    this.av = false;
                                    if (this.z == 1 || this.z == 3) {
                                        if (this.E != null) {
                                            try {
                                                this.E.get();
                                            }
                                            catch (InterruptedException var3_5) {
                                                var3_5.printStackTrace();
                                            }
                                            catch (ExecutionException var3_6) {
                                                var3_6.printStackTrace();
                                            }
                                        }
                                        if (this.z != 0) {
                                            if (this.z != 2) {
                                                // empty if block
                                            }
                                            var4_12 = Math.max(this.f, this.g) * 0.1f;
                                        } else {
                                            var4_12 = 0.0f;
                                        }
                                        var5_13 = this.f / 2.0f + var4_12;
                                        this.r.a(this.b - var5_13, var5_13 + this.b, this.c - (var4_12 += this.g / 2.0f), var4_12 + this.c);
                                    }
                                    if (this.z != 1 && this.z != 3 || this.av || this.F == null) break block99;
                                    try {
                                        this.F.get();
                                    }
                                    catch (InterruptedException var3_7) {}
                                    ** GOTO lbl-1000
                                    catch (ExecutionException var3_11) {}
lbl-1000:
                                    // 2 sources

                                    {
                                        var3_4 /* !! */ .printStackTrace();
                                    }
                                }
                                if (this.F != null && !this.F.isDone()) break block100;
                                if (this.O != -1) {
                                    this.z = this.O;
                                    for (var2_3 = 0; var2_3 < 20; ++var2_3) {
                                        this.Z[var2_3] = false;
                                    }
                                    this.aa = 0;
                                    this.ab = 0;
                                    this.O = -1;
                                }
                                if (this.z != 1 && this.z != 3) {
                                    if (this.z != 0) {
                                        if (this.z != 2) {
                                            // empty if block
                                        }
                                        var4_12 = Math.max(this.f, this.g) * 0.1f;
                                    } else {
                                        var4_12 = 0.0f;
                                    }
                                    var5_13 = this.f / 2.0f + var4_12;
                                    this.r.a(this.b - var5_13, var5_13 + this.b, this.c - (var4_12 += this.g / 2.0f), var4_12 + this.c);
                                }
                                if (this.r.X != 0) break block101;
                                if (this.N != null) {
                                    try {
                                        var3_4 /* !! */  = (float[])this.r;
                                        var6_14 = this.N;
                                        var7_15 = new ObjectOutputStream((OutputStream)var6_14);
                                        var7_15.writeInt(3054);
                                        var7_15.writeDouble(var3_4 /* !! */ .M);
                                        var7_15.writeInt(var3_4 /* !! */ .z);
                                        var3_4 /* !! */ .e.a((ObjectOutputStream)var7_15);
                                        var7_15.flush();
                                        var7_15 = new GZIPOutputStream((OutputStream)var6_14);
                                        var8_16 = new ObjectOutputStream((OutputStream)var7_15);
                                        var8_16.writeDouble(var3_4 /* !! */ .O);
                                        for (var2_3 = 0; var2_3 < var3_4 /* !! */ .z; ++var2_3) {
                                            var3_4 /* !! */ .x[var2_3].a(var8_16);
                                        }
                                        var8_16.writeInt(var3_4 /* !! */ .B);
                                        for (var2_3 = 0; var2_3 < var3_4 /* !! */ .B; ++var2_3) {
                                            var6_14 = var3_4 /* !! */ .A[var2_3];
                                            var8_16.writeFloat(var6_14.a);
                                            var8_16.writeFloat(var6_14.b);
                                            var8_16.writeFloat(var6_14.c);
                                            var8_16.writeFloat(var6_14.d);
                                            var8_16.writeFloat(var6_14.e);
                                            var8_16.writeFloat(var6_14.f);
                                        }
                                        var8_16.flush();
                                        var8_16.close();
                                        var7_15.close();
                                        this.ap.a((short)7);
                                    }
                                    catch (IOException var3_8) {
                                        var3_8.printStackTrace();
                                    }
                                    try {
                                        this.N.close();
                                    }
                                    catch (IOException var3_9) {
                                        var3_9.printStackTrace();
                                    }
                                    this.N = null;
                                }
                                if (this.as != null) {
                                    this.D[0] = 1.0f;
                                    this.D[1] = 1.0f;
                                    this.D[2] = 1.0f;
                                    this.r.a();
                                    try {
                                        this.r.a(this.as);
                                        this.as.close();
                                    }
                                    catch (IOException var3_10) {
                                        var3_10.printStackTrace();
                                    }
                                    if (this.at != -1) {
                                        this.r.c(this.at);
                                    }
                                    if (this.B != -1) {
                                        this.r.M = 0.0;
                                    }
                                    this.as = null;
                                    this.r.L = false;
                                }
                                if (this.P) {
                                    this.ap.a((short)0);
                                    this.r.a();
                                    this.P = false;
                                    this.r.L = false;
                                }
                                if (this.aq && (this.A == 2 || this.A == 3 || this.A == 1)) {
                                    this.r.b();
                                    this.ap.a((short)2);
                                    this.aq = false;
                                }
                                if (this.u) {
                                    var9_17 = this.r.a(this.v, this.w);
                                    if (var9_17 == -1) {
                                        if (!this.aq) {
                                            if (this.r.e.k * this.r.e.k > this.v * this.v + this.w * this.w && this.A == 0) {
                                                if (this.B != -1) {
                                                    var9_17 = com.saterskog.cell_lab.j.a((Context)this.aw).get((int)this.B).q;
                                                    if (this.r.V >= var9_17) {
                                                        var2_3 = 0;
                                                        this.D[0] = 1.0f;
                                                        this.D[1] = 0.3f;
                                                        this.D[2] = 0.3f;
                                                        this.aw.runOnUiThread(new Runnable(){

                                                            @Override
                                                            public final void run() {
                                                                Toast.makeText((Context)q.this.aw, (CharSequence)(q.this.aw.getString(2131624202) + var9_17 + " " + q.this.aw.getString(2131624203)), (int)1).show();
                                                            }
                                                        });
                                                    } else {
                                                        var2_3 = 1;
                                                    }
                                                    if (!com.saterskog.cell_lab.j.a(this.B, this.ap.f(), (Context)this.aw)) {
                                                        var2_3 = 0;
                                                        this.aw.runOnUiThread(new Runnable(){

                                                            @Override
                                                            public final void run() {
                                                                Toast.makeText((Context)q.this.aw, (int)2131624340, (int)1).show();
                                                            }
                                                        });
                                                    }
                                                    if (var2_3 != 0) {
                                                        this.ap.a((short)3);
                                                        this.a(this.v, this.w);
                                                        var3_4 /* !! */  = (float[])this.r;
                                                        ++var3_4 /* !! */ .V;
                                                        com.saterskog.cell_lab.t.a(this.aw, 0, 3, 1500);
                                                        com.saterskog.cell_lab.t.a(this.aw, 1, 9, 1500);
                                                        if (this.z == 1) {
                                                            com.saterskog.cell_lab.t.a(this.aw, 3, 3, 1500);
                                                        }
                                                    } else {
                                                        this.ap.a((short)1);
                                                    }
                                                } else {
                                                    this.ap.a((short)3);
                                                    this.a(this.v, this.w);
                                                    var3_4 /* !! */  = (float[])this.r;
                                                    ++var3_4 /* !! */ .V;
                                                }
                                            }
                                        } else {
                                            this.ap.a((short)2);
                                            this.aq = false;
                                            this.r.b();
                                            var3_4 /* !! */  = (float[])this.R;
                                            // MONITORENTER : var3_4 /* !! */ 
                                            this.au = false;
                                            // MONITOREXIT : var3_4 /* !! */ 
                                        }
                                        if (this.A == 2) {
                                            this.ap.a((short)3);
                                            this.r.a(this.v, this.w, 1.152, 0.0f);
                                        }
                                        if (this.A == 3 || this.A == 4) {
                                            this.ap.a((short)1);
                                        }
                                    } else {
                                        if (this.A == 4 || this.A == 0) {
                                            this.aq = true;
                                            if (this.r.x[var9_17].F != 1) {
                                                this.ap.a((short)8);
                                                this.aq = true;
                                                this.r.b();
                                                this.r.x[var9_17].F = 1;
                                            } else {
                                                this.ap.a((short)2);
                                                this.aq = false;
                                                this.r.b();
                                            }
                                            this.x = (double)this.b - this.r.x[var9_17].b;
                                            this.y = (double)this.c - this.r.x[var9_17].c;
                                            this.aw.runOnUiThread(new Runnable(){

                                                @Override
                                                public final void run() {
                                                    com.saterskog.cell_lab.t.b(q.this.aw, 0, 6);
                                                    if (q.this.z == 0) {
                                                        com.saterskog.cell_lab.t.b(q.this.aw, 0, 7);
                                                    }
                                                }
                                            });
                                        }
                                        if (this.A == 2) {
                                            this.r.x[var9_17].w = 0.36;
                                            this.r.x[var9_17].J[0] = 1.0f;
                                            this.r.x[var9_17].J[1] = 0.0f;
                                            this.r.x[var9_17].J[2] = 1.0f;
                                            this.r.x[var9_17].p = 1.0;
                                            this.r.x[var9_17].o = 0.0;
                                            if (this.r.x[var9_17].I[this.r.x[var9_17].D].s == com.saterskog.cell_lab.h.e) {
                                                this.r.x[var9_17].S = 1.8f;
                                            }
                                            this.ap.a((short)10);
                                        }
                                        if (this.A == 3) {
                                            var2_3 = -1;
                                            if (this.B != -1) {
                                                var2_3 = com.saterskog.cell_lab.j.a((Context)this.aw).get((int)this.B).A;
                                            }
                                            if (this.r.W < var2_3 || var2_3 == -1) {
                                                this.r.a(var9_17, false);
                                                var3_4 /* !! */  = (float[])this.r;
                                                ++var3_4 /* !! */ .W;
                                                this.ap.a((short)10);
                                            } else {
                                                this.D[0] = 1.0f;
                                                this.D[1] = 0.3f;
                                                this.D[2] = 0.3f;
                                                this.ap.a((short)1);
                                            }
                                        }
                                    }
                                    this.u = false;
                                    this.r.L = false;
                                }
                                this.d();
                                if (this.t) {
                                    this.r.e.a(this.s);
                                    this.r.L = false;
                                    this.t = false;
                                }
                                if (!this.r.L && this.z == 0) {
                                    this.r.a(true, 0.0);
                                }
                                if ((this.z == 1 || this.z == 3) && this.r.H > 0.0f && this.r.H < 2.89f) {
                                    var4_12 = (float)Math.sqrt(this.r.H);
                                    var10_18 = Math.max(this.f, this.g);
                                    var5_13 = Math.min(1.0f, 0.085f / var10_18 - 0.05f);
                                    if (var5_13 > 0.0f && (var4_12 = Math.min(1.5f - var4_12 * 3.0f / var10_18, 1.0f) * var5_13) > 0.003f) {
                                        this.ap.a(var4_12);
                                    }
                                    this.r.H = -1.0f;
                                }
                                if (this.B != -1 && com.saterskog.cell_lab.j.a(this.B, this.r) && !this.M) {
                                    this.M = true;
                                    var11_19 = com.saterskog.cell_lab.j.b(this.B, (Context)this.aw) == false;
                                    if (var11_19) {
                                        com.saterskog.cell_lab.j.c(this.B, (Context)this.aw);
                                    }
                                    this.D[0] = 0.3f;
                                    this.D[1] = 1.0f;
                                    this.D[2] = 0.3f;
                                    var3_4 /* !! */  = (float[])((PlayActivity)this.aw);
                                    this.aw.runOnUiThread(new Runnable((PlayActivity)var3_4 /* !! */ ){
                                        final /* synthetic */ PlayActivity b;
                                        {
                                            this.b = playActivity;
                                        }

                                        @Override
                                        public final void run() {
                                            q.this.ap.a((short)4);
                                            if (var11_19) {
                                                this.b.h();
                                            }
                                            this.b.E = true;
                                            Toast.makeText((Context)q.this.aw, (CharSequence)q.this.aw.getString(2131624341), (int)1).show();
                                        }
                                    });
                                }
                                this.ap.a(this.r, this.M);
                                if (this.aq) break block102;
                                if (this.A == 4) {
                                    this.q.a(this.r, -1);
                                }
                                break block103;
                            }
                            this.aq = false;
                            for (var2_3 = 0; var2_3 < this.r.z; ++var2_3) {
                                if (this.r.x[var2_3].F != 1) continue;
                                var12_20 = this.r.x[var2_3].b;
                                var14_21 = this.r.x[var2_3].c;
                                var16_22 = this.r.x[var2_3].d;
                                this.aq = true;
                                if (this.A == 4) {
                                    this.q.a(this.r, var2_3);
                                }
                                var3_4 /* !! */  = (float[])this.R;
                                // MONITORENTER : var3_4 /* !! */ 
                                this.au = true;
                                break block98;
                            }
                            var16_22 = 0.0;
                            var14_21 = 0.0;
                            var12_20 = 0.0;
                            break block104;
                        }
                        for (var9_17 = 0; var9_17 < 80; ++var9_17) {
                            this.Q[var9_17].a(this.r.x[var2_3].I[var9_17]);
                            var7_15 = this.Q[var9_17];
                            var11_19 = this.r.x[var2_3].D == var9_17;
                            var7_15.p = var11_19;
                        }
                        // MONITOREXIT : var3_4 /* !! */ 
                    }
                    if (this.aq) {
                        this.x *= 0.8;
                        this.y *= 0.8;
                        this.b = (float)(this.x + var12_20);
                        this.c = (float)(this.y + var14_21);
                        this.H[0] = (float)var12_20;
                        this.H[1] = (float)var14_21;
                        this.H[2] = (float)(var16_22 + 0.01);
                        this.b();
                    } else {
                        var3_4 /* !! */  = (float[])this.R;
                        // MONITORENTER : var3_4 /* !! */ 
                        this.au = false;
                        // MONITOREXIT : var3_4 /* !! */ 
                    }
                    if (!this.aq) {
                        this.ap.a((short)2);
                    }
                }
                if ((this.z == 1 || this.z == 3) && this.ap.g()) {
                    this.r.I = true;
                    this.r.F = this.b;
                    this.r.G = this.c;
                } else {
                    this.r.I = false;
                }
            }
            if (this.z == 1 || this.z == 3) {
                var16_22 = this.z == 1 ? 1.0 : (double)this.C;
                this.E = this.an.submit(new Runnable(){

                    @Override
                    public final void run() {
                        q.this.r.b(true, var16_22);
                    }
                });
                this.F = this.an.submit(new Runnable(){

                    @Override
                    public final void run() {
                        q.this.r.a(var16_22);
                    }
                });
            } else if (this.z == 2) {
                this.F = this.an.submit(new Runnable(){

                    @Override
                    public final void run() {
                        long l2 = System.currentTimeMillis();
                        do {
                            for (int i2 = 0; i2 < 15; ++i2) {
                                com.saterskog.cell_lab.q.a(q.this, false);
                            }
                        } while ((q.this.B == -1 || !com.saterskog.cell_lab.j.a(q.this.B, q.this.r) || q.this.M) && System.currentTimeMillis() - l2 < 50L);
                        com.saterskog.cell_lab.q.a(q.this, true);
                    }
                });
            }
        }
        this.L[0] = 2.0f / this.f;
        this.L[1] = 0.0f;
        this.L[2] = 0.0f;
        this.L[3] = 0.0f;
        this.L[4] = 0.0f;
        this.L[5] = 2.0f / this.g;
        this.L[6] = 0.0f;
        this.L[7] = 0.0f;
        this.L[8] = 0.0f;
        this.L[9] = 0.0f;
        this.L[10] = 1.0f;
        this.L[11] = 0.0f;
        this.L[12] = -2.0f * this.b / this.f;
        this.L[13] = -2.0f * this.c / this.g;
        this.L[14] = 0.0f;
        this.L[15] = 1.0f;
        var2_3 = 0;
        while (true) {
            if (var2_3 < 4) {
            } else {
                this.r.a(this.K);
                GLES20.glDisable((int)2929);
                GLES20.glEnable((int)3042);
                GLES20.glBlendFunc((int)1, (int)770);
                if (this.G || this.aq) {
                    this.a(this.K, this.H[0], this.H[1], this.H[2], 1.0f);
                }
                if ((var20_25 = System.nanoTime() - this.ar) < 16666666L && var20_25 > 0L) {
                    try {
                        Thread.sleep((16666666L - var20_25) / 1000000L);
                    }
                    catch (InterruptedException var1_2) {
                        var1_2.printStackTrace();
                    }
                }
                this.ar = System.nanoTime();
                return;
            }
            for (var9_17 = 0; var9_17 < 4; ++var9_17) {
                this.K[var9_17 * 4 + var2_3] = 0.0f;
                for (var18_23 = 0; var18_23 < 4; ++var18_23) {
                    var3_4 /* !! */  = this.K;
                    var19_24 = var9_17 * 4 + var2_3;
                    var3_4 /* !! */ [var19_24] = var3_4 /* !! */ [var19_24] + this.L[var9_17 * 4 + var18_23] * var1_1[var18_23 * 4 + var2_3];
                }
            }
            ++var2_3;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final Gene[] c() {
        Object object = this.R;
        synchronized (object) {
            if (!this.au) {
                return null;
            }
            Gene[] arrgene = new Gene[80];
            int n2 = 0;
            while (n2 < 80) {
                arrgene[n2] = new Gene(this.Q[n2]);
                ++n2;
            }
            return arrgene;
        }
    }

    public final void onSurfaceCreated(GL10 gL10, EGLConfig eGLConfig) {
        GLES20.glClearColor((float)0.8f, (float)0.8f, (float)1.0f, (float)1.0f);
        this.r.a((Context)this.aw);
        this.a();
    }

    public static interface a {
        public void a(float var1);

        public void a(CellWorld var1);

        public void a(CellWorld var1, int var2);
    }
}

