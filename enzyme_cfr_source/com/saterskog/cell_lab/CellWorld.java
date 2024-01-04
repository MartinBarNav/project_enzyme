/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.opengl.GLES20
 *  android.os.Parcel
 *  android.os.Parcelable
 *  android.os.Parcelable$Creator
 */
package com.saterskog.cell_lab;

import android.content.Context;
import android.opengl.GLES20;
import android.os.Parcel;
import android.os.Parcelable;
import com.saterskog.b.a;
import com.saterskog.b.b;
import com.saterskog.b.c;
import com.saterskog.b.d;
import com.saterskog.cell_lab.Cell;
import com.saterskog.cell_lab.Environment;
import com.saterskog.cell_lab.Food;
import com.saterskog.cell_lab.Gene;
import com.saterskog.cell_lab.Link;
import com.saterskog.cell_lab.e;
import com.saterskog.cell_lab.h;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import java.nio.ShortBuffer;
import java.util.Arrays;
import java.util.Random;
import java.util.zip.GZIPInputStream;

public class CellWorld
implements Parcelable {
    public static final Parcelable.Creator<CellWorld> CREATOR;
    static final double a;
    static final double b;
    static final double c;
    Food[] A;
    int B;
    int C;
    int[][] D;
    int[] E;
    public float F;
    public float G;
    public float H;
    public boolean I;
    final Link[] J;
    final int[] K;
    public boolean L;
    double M;
    double N;
    double O;
    double P;
    double Q;
    int R;
    int S;
    double T;
    boolean U;
    public int V;
    public int W;
    int X;
    public d Y;
    private final int Z;
    private int[] aA;
    private int[] aB;
    private int aC;
    private int aD;
    private int aE;
    private int aF;
    private int aG;
    private int aH;
    private int aI;
    private int aJ;
    private int aK;
    private int aL;
    private int aM;
    private int aN;
    private int aO;
    private int aP;
    private int[] aQ;
    private int aR;
    private int aS;
    private int aT;
    private int aU;
    private int[][] aV;
    private int[] aW;
    private int aX;
    private int[] aY;
    private int[] aZ;
    private final int aa;
    private int ab;
    private int ac;
    private final float[] ad;
    private final float[] ae;
    private final float[] af;
    private final float[] ag;
    private final float[] ah;
    private final float[] ai;
    private final float[] aj;
    private final float[] ak;
    private final float[] al;
    private final float[] am;
    private final float[] an;
    private final float[] ao;
    private int ap;
    private final short[] aq;
    private int ar;
    private int as;
    private int at;
    private int[] au;
    private int[] av;
    private int[] aw;
    private int[] ax;
    private int[] ay;
    private int[] az;
    private int[][] ba;
    private short[][] bb;
    private int[] bc;
    private final int bd;
    private int be;
    private int bf;
    private boolean bg;
    private int bh;
    private int bi;
    final int d;
    final Environment e;
    ByteBuffer f;
    ByteBuffer g;
    ByteBuffer h;
    ByteBuffer i;
    ByteBuffer j;
    FloatBuffer k;
    FloatBuffer l;
    FloatBuffer m;
    FloatBuffer n;
    FloatBuffer o;
    ShortBuffer p;
    final int[][] q;
    final int[][] r;
    final int[][] s;
    final int[][] t;
    final int[] u;
    final double[] v;
    final double[] w;
    Cell[] x;
    e[] y;
    int z;

    static {
        a = Math.sqrt(2.0);
        b = Math.sqrt(3.0) / 4.0;
        c = 2.0 / Math.sqrt(Math.sqrt(2.0) + 2.0);
        CREATOR = new Parcelable.Creator<CellWorld>(){

            public final /* synthetic */ Object createFromParcel(Parcel parcel) {
                return new CellWorld(parcel);
            }
        };
    }

    /*
     * Enabled aggressive block sorting
     */
    public CellWorld(Parcel parcel) {
        boolean bl = parcel.readInt() == 1;
        this(bl, (Environment)parcel.readParcelable(Environment.class.getClassLoader()));
        this.z = parcel.readInt();
        this.x = (Cell[])parcel.createTypedArray(Cell.ad);
        this.B = parcel.readInt();
        this.A = (Food[])parcel.createTypedArray(Food.g);
        this.M = parcel.readDouble();
        this.O = parcel.readDouble();
        this.V = parcel.readInt();
        this.W = parcel.readInt();
        this.S = parcel.readInt();
        this.R = parcel.readInt();
    }

    /*
     * Enabled aggressive block sorting
     */
    public CellWorld(boolean bl, Environment object) {
        int n2;
        int n3;
        this.e = new Environment();
        this.ac = 202;
        this.v = new double[9];
        this.w = new double[9];
        this.D = new int[com.saterskog.cell_lab.h.B.length + 1][];
        this.E = new int[com.saterskog.cell_lab.h.B.length + 1];
        this.H = -1.0f;
        this.I = false;
        this.J = new Link[20];
        this.be = 0;
        this.bf = 0;
        this.N = 0.0;
        this.O = 1.5707963267948966;
        this.Y = new d();
        this.bg = bl;
        if (!bl) {
            this.d = ((Environment)object).r;
            this.aa = ((Environment)object).s;
            this.ab = this.d / 10;
        } else {
            this.d = 100;
            this.aa = 0;
        }
        this.ac = (this.d + 3) / 4;
        if (this.e == null) {
            com.saterskog.b.a.a("changeEnvironment: env is null");
        }
        if (object == null) {
            com.saterskog.b.a.a("changeEnvironment: e is null");
        }
        this.e.a((Environment)object);
        this.Z = Math.min(206, (int)(this.e.k / 0.03 - 0.1)) / 2 * 2;
        this.bd = Math.min(207, (int)(2.0 * this.e.k / 0.36));
        if (0.06 >= this.e.k * 2.0 / (double)this.Z) {
            com.saterskog.b.a.a("skit:Too large Cell.MAX_R for grid.");
        }
        this.K = new int[this.d + 3];
        this.x = new Cell[this.d];
        for (n3 = 0; n3 < this.d; ++n3) {
            this.x[n3] = new Cell();
        }
        this.z = 0;
        if (bl) {
            this.A = null;
        } else {
            this.A = new Food[this.aa];
            for (n3 = 0; n3 < this.aa; ++n3) {
                this.A[n3] = new Food();
            }
        }
        this.B = 0;
        this.y = new e[this.ac];
        for (n3 = 0; n3 < this.ac; ++n3) {
            this.y[n3] = new e();
        }
        this.C = 0;
        this.M = 0.0;
        for (n3 = 0; n3 < 20; ++n3) {
            this.J[n3] = new Link();
        }
        this.aV = new int[(this.Z + 2) * (this.Z + 2)][];
        this.aW = new int[(this.Z + 2) * (this.Z + 2)];
        for (n3 = 0; n3 < (this.Z + 2) * (this.Z + 2); ++n3) {
            this.aV[n3] = new int[203];
            this.aW[n3] = 0;
        }
        this.ba = new int[(this.bd + 2) * (this.bd + 2)][];
        this.bb = new short[(this.bd + 2) * (this.bd + 2)][];
        this.bc = new int[(this.bd + 2) * (this.bd + 2)];
        for (n3 = 0; n3 < (this.bd + 2) * (this.bd + 2); ++n3) {
            this.ba[n3] = new int[404];
            this.bb[n3] = new short[404];
            this.bc[n3] = 0;
        }
        this.aY = new int[this.d * 20];
        this.aZ = new int[this.d * 20];
        n3 = this.bg ? 2 : 1;
        this.ad = new float[this.d * 28 * 4 * n3];
        this.ae = new float[this.d * 56 * 4 * n3];
        this.af = new float[this.d * 28 * 4 * n3];
        this.ag = new float[this.d * 56 * 4 * n3];
        this.aq = new short[n3 * (this.d * 21 * 4)];
        this.ah = new float[this.aa * 6 * 2];
        this.ai = new float[this.aa * 6 * 2];
        this.aj = new float[this.aa * 6 * 4];
        this.ak = new float[this.ac * 6 * 4];
        this.al = new float[this.ac * 6 * 2];
        this.am = new float[this.ac * 6 * 4];
        this.an = new float[this.d * 12 * 7];
        this.ao = new float[this.d * 6 * 7];
        this.f = ByteBuffer.allocateDirect(Math.max(this.ad.length, Math.max(this.ah.length, Math.max(this.ak.length, this.an.length))) * 4).order(ByteOrder.nativeOrder());
        this.l = this.f.asFloatBuffer();
        this.g = ByteBuffer.allocateDirect(Math.max(this.af.length, Math.max(this.ai.length, this.al.length)) * 4).order(ByteOrder.nativeOrder());
        this.m = this.g.asFloatBuffer();
        this.h = ByteBuffer.allocateDirect(Math.max(this.ae.length, this.ao.length) * 4).order(ByteOrder.nativeOrder());
        this.n = this.h.asFloatBuffer();
        this.i = ByteBuffer.allocateDirect(Math.max(this.ag.length, Math.max(this.am.length, this.aj.length)) * 4).order(ByteOrder.nativeOrder());
        this.o = this.i.asFloatBuffer();
        this.j = ByteBuffer.allocateDirect(this.aq.length * 2).order(ByteOrder.nativeOrder());
        this.p = this.j.asShortBuffer();
        int n4 = com.saterskog.cell_lab.h.B.length;
        n3 = this.bg ? 1 : 0;
        this.u = new int[n3 + n4];
        n4 = com.saterskog.cell_lab.h.B.length;
        n3 = this.bg ? 1 : 0;
        this.q = new int[n3 + n4][];
        n4 = com.saterskog.cell_lab.h.B.length;
        n3 = this.bg ? 1 : 0;
        this.r = new int[n3 + n4][];
        n4 = com.saterskog.cell_lab.h.B.length;
        n3 = this.bg ? 1 : 0;
        this.s = new int[n3 + n4][];
        n4 = com.saterskog.cell_lab.h.B.length;
        n3 = this.bg ? 1 : 0;
        this.t = new int[n3 + n4][];
        for (n3 = 0; n3 < (n4 = this.bg ? 1 : 0) + (n2 = com.saterskog.cell_lab.h.B.length); ++n3) {
            this.q[n3] = new int[201];
            this.r[n3] = new int[201];
            this.s[n3] = new int[201];
            this.t[n3] = new int[201];
        }
        object = ByteBuffer.allocateDirect(48);
        ((ByteBuffer)object).order(ByteOrder.nativeOrder());
        this.k = ((ByteBuffer)object).asFloatBuffer();
        this.k.put(new float[]{1.1f, 1.1f, 1.1f, -1.1f, -1.1f, -1.1f, -1.1f, -1.1f, -1.1f, 1.1f, 1.1f, 1.1f}, 0, 12);
        this.k.position(0);
        this.aU = 0;
        this.L = false;
        for (n3 = 0; n3 < (n4 = bl ? 1 : 0) + (n2 = com.saterskog.cell_lab.h.B.length); ++n3) {
            this.E[n3] = 0;
            this.D[n3] = new int[this.d];
        }
        if (Math.sqrt(1.7999999999999998E-4) * this.e.g / 0.072 * 0.02 > 1.0) {
            com.saterskog.b.a.a("skit:Too large timestep, close to unstable simulation.");
        }
        this.a(true, 0.0);
    }

    public static long a(Environment environment) {
        long l2 = Math.min(206, (int)(environment.k / 0.03 - 0.1)) / 2 * 2;
        long l3 = Math.min(207, (int)(2.0 * environment.k / 0.36));
        long l4 = environment.r;
        long l5 = environment.r;
        long l6 = environment.r;
        long l7 = environment.r;
        long l8 = environment.r;
        long l9 = environment.s * 6 * 2;
        long l10 = environment.s * 6 * 2;
        long l11 = environment.s * 6 * 4;
        int n2 = environment.r / 4;
        long l12 = n2 * 6 * 4;
        long l13 = n2 * 6 * 2;
        long l14 = n2 * 6 * 4;
        long l15 = environment.r * 12;
        long l16 = environment.r * 6;
        return (l2 + 2L) * (2L + l2) * 203L * 4L + ((long)environment.r * 24320L + (long)environment.s * 80L) + (l3 + 2L) * (2L + l3) * 404L * 6L + (28L * l4 * 4L + 56L * l5 * 4L + 28L * l6 * 4L + 56L * l7 * 4L + 21L * l8 * 4L + l9 + l10 + l11 + l12 + l13 + l14 + l15 * 7L + l16 * 7L) * 8L;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    private void b(double var1_1) {
        var3_2 = (float)var1_1 / 4.0f;
        var4_3 = 0;
        var5_4 = 4;
        var6_5 = 0;
        block0: while (true) {
            if (var4_3 >= 4) return;
            var7_6 = 0;
            block1: while (true) {
                if (var7_6 >= this.z) ** GOTO lbl44
                var8_7 = this.x[var7_6];
                if (var4_3 != 0) ** GOTO lbl21
                if (Double.isNaN(var8_7.Q)) {
                    com.saterskog.b.a.b("NaN final");
                    var8_7.Q = 0.0;
                    this.a(var7_6, false);
                    var9_8 = var7_6 - 1;
                } else {
                    var8_7.w = var8_7.Q;
                    var8_7.X = var8_7.Z;
                    var8_7.p = var8_7.R;
lbl21:
                    // 2 sources

                    var10_9 = var8_7.I[var8_7.D];
                    if (var10_9.s == com.saterskog.cell_lab.h.n) {
                        for (var11_10 = 0; var11_10 < 4; ++var11_10) {
                            var8_7.W[var11_10] = 0.0f;
                        }
                        for (var11_10 = 0; var11_10 < 4; ++var11_10) {
                            var13_12 = var12_11 = var8_7.a(var11_10 + 7, var6_5);
                            if (var12_11 < -20.0f) {
                                var13_12 = -20.0f;
                            }
                            var12_11 = var13_12;
                            if (var13_12 > 20.0f) {
                                var12_11 = 20.0f;
                            }
                            var14_13 = var8_7.W;
                            var9_8 = var10_9.u[var11_10 + 5];
                            var14_13[var9_8] = var12_11 + var14_13[var9_8];
                        }
                    }
                    for (var11_10 = 0; var11_10 < 4; ++var11_10) {
                        var8_7.U[var5_4 + var11_10] = var8_7.U[var6_5 + var11_10] + (var8_7.W[var11_10] - 5.0f * var8_7.U[var6_5 + var11_10]) * var3_2;
                        if (var4_3 != 3) continue;
                        var8_7.V[var11_10] = var8_7.W[var11_10];
                        var8_7.W[var11_10] = 0.0f;
                    }
                    break block0;
lbl44:
                    // 1 sources

                    ++var4_3;
                    var5_4 = var6_5;
                    var6_5 = 4 - var6_5;
                    continue block0;
                }
                while (true) {
                    var7_6 = var9_8 + 1;
                    continue block1;
                    break;
                }
                break;
            }
            break;
        }
        for (var11_10 = 0; var11_10 < var8_7.C; ++var11_10) {
            if (var8_7.H[var11_10].a < 0) continue;
            var15_14 = this.x[var8_7.H[var11_10].a];
            if (var10_9.s == com.saterskog.cell_lab.h.e || var15_14.I[var15_14.D].s == com.saterskog.cell_lab.h.e) continue;
            for (var9_8 = 0; var9_8 < 4; ++var9_8) {
                var14_13 = var8_7.U;
                var16_15 = var5_4 + var9_8;
                var14_13[var16_15] = var14_13[var16_15] + 5.0f * (var15_14.U[var6_5 + var9_8] - var8_7.U[var6_5 + var9_8]) * var3_2;
            }
        }
        var11_10 = 0;
        while (true) {
            var9_8 = var7_6;
            if (var11_10 >= 4) ** continue;
            if (var8_7.U[var5_4 + var11_10] < -1.0f) {
                var8_7.U[var5_4 + var11_10] = -1.0f;
            }
            if (var8_7.U[var5_4 + var11_10] > 1.0f) {
                var8_7.U[var5_4 + var11_10] = 1.0f;
            }
            ++var11_10;
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    private void b(double d2, double d3) {
        if (!this.a((Cell)null)) return;
        Cell cell = this.x[this.z - 1];
        cell.b = d2;
        cell.c = d3;
        cell.w = 0.21599999999999997;
        cell.d = Math.sqrt(cell.w / 400.0);
        cell.E = 2;
        cell.F = 0;
        cell.p = 1.0;
        cell.T = -1;
        boolean bl = this.Y.nextInt(1) == 1;
        cell.y = bl;
        int n2 = 0;
        while (true) {
            int n3;
            if (n2 < 80) {
                cell.I[n2].b = (float)(0.072 + this.Y.nextDouble() * 0.288);
                cell.I[n2].a[0] = (float)this.Y.nextDouble();
                cell.I[n2].a[1] = (float)this.Y.nextDouble();
                cell.I[n2].a[2] = (float)this.Y.nextDouble();
                cell.I[n2].d = (float)(this.Y.nextDouble() * 2.0 * Math.PI);
                cell.I[n2].c = (float)(0.5 + this.Y.b() * 0.2);
                cell.I[n2].e = (float)(this.Y.nextDouble() * 2.0 * Math.PI);
                cell.I[n2].f = (float)(this.Y.nextDouble() * 2.0 * Math.PI);
                cell.I[n2].g = (float)(10.0 + this.Y.b() * 3.0);
                do {
                    cell.I[n2].s = com.saterskog.cell_lab.h.B[this.Y.nextInt(com.saterskog.cell_lab.h.B.length)];
                } while (!this.e.t[cell.I[n2].s.ordinal()]);
                cell.I[n2].i = this.Y.nextInt(80);
                cell.I[n2].j = this.Y.nextInt(80);
                Gene gene = cell.I[n2];
                bl = this.Y.b() > 0.0;
                gene.l = bl;
                gene = cell.I[n2];
                bl = this.Y.b() > 0.0;
                gene.m = bl;
                gene = cell.I[n2];
                bl = this.Y.b() > 0.0;
                gene.n = bl;
                cell.I[n2].h = (float)this.Y.nextDouble() * 35.0f;
                gene = cell.I[n2];
                bl = this.Y.nextInt(1) == 1;
                gene.q = bl;
                gene = cell.I[n2];
                bl = this.Y.nextInt(1) == 1;
                gene.r = bl;
            } else {
                cell.D = this.Y.nextInt(80);
                if (cell.I[cell.D].s == com.saterskog.cell_lab.h.e) {
                    cell.S = 1.8f * (float)this.Y.nextDouble();
                }
                cell.J[0] = cell.I[cell.D].a[0];
                cell.J[1] = cell.I[cell.D].a[1];
                cell.J[2] = cell.I[cell.D].a[2];
                cell.J[3] = 1.0f;
                cell.e = 0.0;
                cell.f = 0.0;
                cell.x = false;
                cell.l = 0.0;
                cell.n = 0.0;
                cell.k = this.Y.b() * Math.PI;
                cell.m = this.Y.b() * Math.PI;
                cell.C = 0;
                cell.o = 0.0;
                cell.G = 0;
                return;
            }
            for (n3 = 0; n3 < 11; ++n3) {
                if (this.e.t[com.saterskog.cell_lab.h.n.ordinal()] || this.e.t[com.saterskog.cell_lab.h.l.ordinal()] || this.e.t[com.saterskog.cell_lab.h.k.ordinal()]) {
                    cell.I[n2].t[n3].e = (short)(this.Y.nextInt(2) + 1);
                    cell.I[n2].t[n3].d = (short)this.Y.nextInt(8);
                    cell.I[n2].t[n3].b = (float)this.Y.b() * 8.0f;
                    cell.I[n2].t[n3].a = (float)this.Y.b() * 8.0f;
                    cell.I[n2].t[n3].c = (float)this.Y.b() * 8.0f;
                    continue;
                }
                cell.I[n2].t[n3].e = (short)(false ? 1 : 0);
                cell.I[n2].t[n3].d = (short)this.Y.nextInt(8);
                cell.I[n2].t[n3].b = (float)this.Y.b();
                cell.I[n2].t[n3].a = 0.0f;
                cell.I[n2].t[n3].c = 0.0f;
            }
            for (n3 = 0; n3 < 11; ++n3) {
                cell.I[n2].u[n3] = this.Y.nextInt(Gene.w[n3]);
            }
            for (n3 = 0; n3 < 7; ++n3) {
                cell.I[n2].v[n3] = Gene.z[n3] + (float)this.Y.nextDouble() * (Gene.A[n3] - Gene.z[n3]);
            }
            cell.I[n2].v[5] = (float)Math.pow(this.Y.nextDouble(), 3.0) * Gene.A[5];
            ++n2;
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    private void b(float f2, float f3, float f4, float f5) {
        int n2 = 0;
        for (int i2 = 0; i2 < this.B; ++i2) {
            Food food = this.A[i2];
            int n3 = n2;
            if (!(food.a < f2 - 0.007f)) {
                n3 = n2;
                if (!(food.a > f3 + 0.007f)) {
                    n3 = n2;
                    if (!(food.b < f4 - 0.007f)) {
                        n3 = n2;
                        if (!(food.b > f5 + 0.007f)) {
                            float f6;
                            float f7;
                            float f8;
                            float f9 = (float)((double)0.007f * Math.sqrt((double)food.c / 1.152));
                            if (food.f <= 0.0f) {
                                f8 = 0.6f;
                                f7 = 0.4f;
                                f6 = 0.2f;
                            } else {
                                f8 = 0.8f + 0.2f * food.f;
                                f7 = (1.0f - food.f) * 0.4f;
                                f6 = 0.2f * (1.0f - food.f);
                            }
                            this.ah[n2] = 1.0f;
                            this.ah[n2 + 1] = 1.0f;
                            this.ah[n2 + 2] = 1.0f;
                            this.ah[n2 + 3] = -1.0f;
                            this.ah[n2 + 4] = -1.0f;
                            this.ah[n2 + 5] = -1.0f;
                            this.ai[n2] = food.a + f9;
                            this.ai[n2 + 1] = food.b + f9;
                            this.ai[n2 + 2] = food.a + f9;
                            this.ai[n2 + 3] = food.b - f9;
                            this.ai[n2 + 4] = food.a - f9;
                            this.ai[n2 + 5] = food.b - f9;
                            this.aj[n2 * 2 + 0] = f8;
                            this.aj[n2 * 2 + 1] = f7;
                            this.aj[n2 * 2 + 2] = f6;
                            this.aj[n2 * 2 + 3] = 0.4f;
                            this.aj[n2 * 2 + 4] = f8;
                            this.aj[n2 * 2 + 5] = f7;
                            this.aj[n2 * 2 + 6] = f6;
                            this.aj[n2 * 2 + 7] = 0.4f;
                            this.aj[n2 * 2 + 8] = f8;
                            this.aj[n2 * 2 + 9] = f7;
                            this.aj[n2 * 2 + 10] = f6;
                            this.aj[n2 * 2 + 11] = 0.4f;
                            n3 = n2 + 6;
                            this.ah[n3] = -1.0f;
                            this.ah[n3 + 1] = -1.0f;
                            this.ah[n3 + 2] = -1.0f;
                            this.ah[n3 + 3] = 1.0f;
                            this.ah[n3 + 4] = 1.0f;
                            this.ah[n3 + 5] = 1.0f;
                            this.ai[n3] = food.a - f9;
                            this.ai[n3 + 1] = food.b - f9;
                            this.ai[n3 + 2] = food.a - f9;
                            this.ai[n3 + 3] = food.b + f9;
                            this.ai[n3 + 4] = food.a + f9;
                            this.ai[n3 + 5] = food.b + f9;
                            this.aj[n3 * 2 + 0] = f8;
                            this.aj[n3 * 2 + 1] = f7;
                            this.aj[n3 * 2 + 2] = f6;
                            this.aj[n3 * 2 + 3] = 0.4f;
                            this.aj[n3 * 2 + 4] = f8;
                            this.aj[n3 * 2 + 5] = f7;
                            this.aj[n3 * 2 + 6] = f6;
                            this.aj[n3 * 2 + 7] = 0.4f;
                            this.aj[n3 * 2 + 8] = f8;
                            this.aj[n3 * 2 + 9] = f7;
                            this.aj[n3 * 2 + 10] = f6;
                            this.aj[n3 * 2 + 11] = 0.4f;
                            n3 += 6;
                        }
                    }
                }
            }
            n2 = n3;
        }
        this.be = n2 / 2;
        if (this.be * 2 > this.ai.length) {
            com.saterskog.b.a.a("skit2centerCoordsF");
        }
        if (this.be * 2 > this.ah.length) {
            com.saterskog.b.a.a("skit2triCoordsF");
        }
        if (this.be * 4 > this.aj.length) {
            com.saterskog.b.a.a("skit2foodColor");
        }
    }

    private double c(double d2, double d3) {
        double d4 = (this.P * d2 + this.Q * d3) / this.e.k;
        d3 = (1.0 - this.e.f) * (1.0 - Math.sqrt(d2 * d2 + d3 * d3) / this.e.k) / this.e.f + 1.0;
        d2 = this.e.d;
        return Math.max((d4 * (1.0 - this.e.f) + this.e.f) * d2 / (d3 * d3), 0.0);
    }

    /*
     * Enabled aggressive block sorting
     */
    private void c(double d2) {
        int n2 = this.z;
        int n3 = 0;
        while (true) {
            Cell cell;
            block12: {
                double d3;
                double d4;
                double d5;
                double d6;
                double d7;
                double d8;
                double d9;
                double d10;
                double d11;
                block15: {
                    block13: {
                        block14: {
                            if (n3 >= n2) {
                                return;
                            }
                            cell = this.x[n3];
                            d11 = cell.w;
                            d10 = 0.7 * (cell.w * cell.d * cell.d);
                            d9 = cell.g / d11 * d2;
                            d8 = cell.h / d11 * d2;
                            d7 = cell.j * d2 / d10;
                            cell.q += cell.i * d2 * 10.0;
                            d11 = d6 = 1.0 - cell.q * 3.0;
                            if (d6 < 0.0) {
                                d11 = 0.0;
                            }
                            d6 = d11;
                            if (d11 > 4.0) {
                                d6 = 4.0;
                            }
                            d5 = cell.w * d6;
                            if (cell.z && (d9 * d9 + d8 * d8 > (d11 = this.e.l * d5) * d11 * d2 * d2 || Math.abs(d7) > d11 * d2 * 0.6666666666666666)) {
                                cell.z = false;
                            }
                            if (cell.z) break block12;
                            d9 = cell.e + d9;
                            d4 = d7 + cell.l;
                            d3 = Math.sqrt(d9 * d9 + (d8 += cell.f) * d8);
                            if (cell.l == 0.0) break block13;
                            d7 = d3 / (cell.d * Math.abs(cell.l));
                            d11 = d7 * d7;
                            d6 = (0.1 * d7 + d11) / (0.1 * d7 + d11 + 0.15);
                            d7 = (1.0 - (d11 + d7) / (d7 + d11 + 5.0)) * 0.65;
                            if (Double.isNaN(d6)) break block14;
                            d11 = d7;
                            if (!Double.isNaN(d7)) break block15;
                        }
                        d6 = 1.0;
                        d11 = 0.0;
                        break block15;
                    }
                    d6 = 1.0;
                    d11 = 0.0;
                }
                double d12 = this.e.m;
                d7 = this.e.m;
                double d13 = cell.w;
                d6 = d6 * d12 * d5 / cell.w * d2;
                d11 = d11 * d7 * d13 / d10 * d2;
                boolean bl = false;
                if (d9 * d9 + d8 * d8 <= d6 * d6) {
                    cell.e = 0.0;
                    cell.f = 0.0;
                    bl = true;
                } else {
                    cell.e = d9 - d9 * d6 / d3;
                    cell.f = d8 - d6 * d8 / d3;
                }
                if (Math.abs(d4) <= d11) {
                    cell.l = 0.0;
                    if (bl) {
                        cell.z = true;
                    }
                } else {
                    cell.l = d4 - Math.signum(cell.l) * d11;
                }
            }
            cell.g = cell.e;
            cell.h = cell.f;
            cell.j = cell.l;
            ++n3;
        }
    }

    private void c(float f2, float f3, float f4, float f5) {
        int n2 = 0;
        for (int i2 = 0; i2 < this.C; ++i2) {
            e e2 = this.y[i2];
            int n3 = n2;
            if (!(e2.a < (double)(f2 - 0.063111f))) {
                n3 = n2;
                if (!(e2.a > (double)(f3 + 0.063111f))) {
                    n3 = n2;
                    if (!(e2.b < (double)(f4 - 0.063111f))) {
                        n3 = n2;
                        if (!(e2.b > (double)(f5 + 0.063111f))) {
                            float f6 = 0.063111f * (float)(e2.c / 0.03);
                            float f7 = (float)Math.sqrt(e2.d);
                            this.ak[n2 * 2] = f6;
                            this.ak[n2 * 2 + 1] = f6;
                            this.ak[n2 * 2 + 2] = f7;
                            this.ak[n2 * 2 + 3] = 0.0f;
                            this.ak[n2 * 2 + 4] = f6;
                            this.ak[n2 * 2 + 5] = -f6;
                            this.ak[n2 * 2 + 6] = f7;
                            this.ak[n2 * 2 + 7] = 0.0f;
                            this.ak[n2 * 2 + 8] = -f6;
                            this.ak[n2 * 2 + 9] = -f6;
                            this.ak[n2 * 2 + 10] = f7;
                            this.ak[n2 * 2 + 11] = 0.0f;
                            this.al[n2] = (float)e2.a;
                            this.al[n2 + 1] = (float)e2.b;
                            this.al[n2 + 2] = (float)e2.a;
                            this.al[n2 + 3] = (float)e2.b;
                            this.al[n2 + 4] = (float)e2.a;
                            this.al[n2 + 5] = (float)e2.b;
                            this.am[n2 * 2] = e2.e[0];
                            this.am[n2 * 2 + 1] = e2.e[1];
                            this.am[n2 * 2 + 2] = e2.e[2];
                            this.am[n2 * 2 + 3] = (float)e2.c;
                            this.am[n2 * 2 + 4] = e2.e[0];
                            this.am[n2 * 2 + 5] = e2.e[1];
                            this.am[n2 * 2 + 6] = e2.e[2];
                            this.am[n2 * 2 + 7] = (float)e2.c;
                            this.am[n2 * 2 + 8] = e2.e[0];
                            this.am[n2 * 2 + 9] = e2.e[1];
                            this.am[n2 * 2 + 10] = e2.e[2];
                            this.am[n2 * 2 + 11] = (float)e2.c;
                            n3 = n2 + 6;
                            this.ak[n3 * 2] = -f6;
                            this.ak[n3 * 2 + 1] = -f6;
                            this.ak[n3 * 2 + 2] = f7;
                            this.ak[n3 * 2 + 3] = 0.0f;
                            this.ak[n3 * 2 + 4] = -f6;
                            this.ak[n3 * 2 + 5] = f6;
                            this.ak[n3 * 2 + 6] = f7;
                            this.ak[n3 * 2 + 7] = 0.0f;
                            this.ak[n3 * 2 + 8] = f6;
                            this.ak[n3 * 2 + 9] = f6;
                            this.ak[n3 * 2 + 10] = f7;
                            this.ak[n3 * 2 + 11] = 0.0f;
                            this.al[n3] = (float)e2.a;
                            this.al[n3 + 1] = (float)e2.b;
                            this.al[n3 + 2] = (float)e2.a;
                            this.al[n3 + 3] = (float)e2.b;
                            this.al[n3 + 4] = (float)e2.a;
                            this.al[n3 + 5] = (float)e2.b;
                            this.am[n3 * 2] = e2.e[0];
                            this.am[n3 * 2 + 1] = e2.e[1];
                            this.am[n3 * 2 + 2] = e2.e[2];
                            this.am[n3 * 2 + 3] = (float)e2.c;
                            this.am[n3 * 2 + 4] = e2.e[0];
                            this.am[n3 * 2 + 5] = e2.e[1];
                            this.am[n3 * 2 + 6] = e2.e[2];
                            this.am[n3 * 2 + 7] = (float)e2.c;
                            this.am[n3 * 2 + 8] = e2.e[0];
                            this.am[n3 * 2 + 9] = e2.e[1];
                            this.am[n3 * 2 + 10] = e2.e[2];
                            this.am[n3 * 2 + 11] = (float)e2.c;
                            n3 += 6;
                        }
                    }
                }
            }
            n2 = n3;
        }
        this.bf = n2 / 2;
        if (this.bf * 2 > this.al.length) {
            com.saterskog.b.a.a("skit2centerCoordsdc");
        }
        if (this.bf * 4 > this.ak.length) {
            com.saterskog.b.a.a("skit2triCoordsdc");
        }
        if (this.bf * 4 > this.am.length) {
            com.saterskog.b.a.a("skit2colordc");
        }
    }

    private void c(boolean bl, double d2) {
        this.T = d2;
        this.U = bl;
        this.aX = 0;
        for (int i2 = 0; i2 < this.z; ++i2) {
            this.d(i2);
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private double d(double d2, double d3) {
        double d4 = (this.P * d2 + this.Q * d3) / this.e.k;
        double d5 = this.e.d;
        double d6 = Math.sqrt(d2 * d2 + d3 * d3);
        double d7 = 1.0 + (1.0 - this.e.f) * (1.0 - d6 / this.e.k) / this.e.f;
        if (!((d4 * (1.0 - this.e.f) + this.e.f) * d5 / (d7 * d7) < 0.0)) return -(this.e.d * (-1.0 + this.e.f) * this.e.f * this.e.f * this.e.k * ((this.P - this.P * this.e.f) * d6 * d6 + this.P * d6 * this.e.k + 2.0 * this.e.f * this.e.k * d2 - 2.0 * (-1.0 + this.e.f) * this.Q * d2 * d3 + 2.0 * this.P * (-1.0 + this.e.f) * d3 * d3) / (d6 * Math.pow((-1.0 + this.e.f) * d6 + this.e.k, 3.0)));
        return 0.0;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    private void d(double var1_1) {
        block19: {
            block20: {
                block18: {
                    var3_2 = 0;
                    block0: while (var3_2 < this.B) {
                        var4_3 = this.A[var3_2];
                        var5_4 = var4_3.d;
                        var6_5 = var4_3.e;
                        var4_3.c = (float)((double)var4_3.c - 0.006 * var1_1);
                        if (!(var4_3.c < 0.0f)) {
                            var8_7 = (int)((this.e.k + (double)var4_3.a) / (2.0 * this.e.k) * (double)this.bd + 1.0) + (int)((this.e.k + (double)var4_3.b) / (2.0 * this.e.k) * (double)this.bd + 1.0) * (this.bd + 2);
                            if (var8_7 >= 0 && var8_7 < this.bc.length) {
                                var7_6 = this.bc[var8_7];
                                if (var7_6 < 404) {
                                    this.ba[var8_7][var7_6] = var3_2;
                                    this.bb[var8_7][var7_6] = var4_3.f <= 0.0f ? (short)(true ? 1 : 0) : (short)2;
                                    var9_8 = this.bc;
                                    var9_8[var8_7] = var9_8[var8_7] + 1;
                                } else {
                                    com.saterskog.b.a.a("smellGridnMAX exhausted, food");
                                }
                            }
                            if ((var14_11 = (int)(((var10_9 = (double)var4_3.a) + this.e.k) / (2.0 * this.e.k) * (double)this.Z) + 1 + ((int)((this.e.k + (var12_10 = (double)var4_3.b)) / (2.0 * this.e.k) * (double)this.Z) + 1) * (this.Z + 2)) < 0 || var14_11 >= this.aW.length) {
                                com.saterskog.b.a.b("x:" + var4_3.a + " y:" + var4_3.b + " r:" + this.e.k);
                                throw new RuntimeException("sadfae");
                            }
                            var8_7 = 0;
                            var7_6 = 0;
                            break block18;
                        }
                        var4_3.a(this.A[this.B - 1]);
                        --this.B;
                        var7_6 = var3_2 - 1;
lbl27:
                        // 5 sources

                        while (true) {
                            var3_2 = var7_6 + 1;
                            continue block0;
                            break;
                        }
                    }
                    return;
                }
                while (var7_6 < this.aW[var14_11]) {
                    var9_8 = this.x[this.aV[var14_11][var7_6]];
                    var15_12 = var9_8.b;
                    var10_9 = var4_3.a;
                    var17_13 = var9_8.b;
                    var12_10 = var4_3.a;
                    var17_13 = (var9_8.c - (double)var4_3.b) * (var9_8.c - (double)var4_3.b) + (var15_12 - var10_9) * (var17_13 - var12_10);
                    var19_14 = var7_6;
                    var20_15 = var8_7;
                    var21_16 = var6_5;
                    var22_17 = var5_4;
                    var23_18 = var3_2;
                    if (var17_13 < (var9_8.d + 0.007000000216066837) * (var9_8.d + 0.007000000216066837)) {
                        var24_19 = var9_8.I[var9_8.D].s;
                        var25_20 = var6_5;
                        var26_21 = var5_4;
                        if (this.e.y) {
                            var22_17 = var6_5;
                            var21_16 = var5_4;
                            if (var24_19 == com.saterskog.cell_lab.h.r) {
                                var10_9 = Math.sqrt(var17_13);
                                var12_10 = ((double)var4_3.a - var9_8.b) / var10_9;
                                var15_12 = ((double)var4_3.b - var9_8.c) / var10_9;
                                var10_9 = Math.cos(var9_8.k) * var15_12 - Math.sin(var9_8.k) * var12_10;
                                var27_22 = 0.0 < var10_9;
                                var10_9 = var27_22 != var9_8.y ? var10_9 * 0.075 * (double)var9_8.a(2, 0) : var10_9 * 0.075 * (double)var9_8.a(4, 0);
                                var10_9 = (var10_9 - ((double)var4_3.d - var9_8.e) * var15_12 + ((double)var4_3.e - var9_8.f) * var12_10 - var9_8.l * var9_8.d) * 40.0;
                                var21_16 = (float)((double)var5_4 + (-0.12 * var12_10 + var15_12 * var10_9) * var1_1);
                                var22_17 = (float)((var15_12 * -0.12 - var10_9 * var12_10) * var1_1 + (double)var6_5);
                            }
                            var25_20 = var22_17;
                            var26_21 = var21_16;
                            if (var17_13 < var9_8.d * var9_8.d) {
                                var10_9 = Math.sqrt(var17_13);
                                var10_9 = 500.0 * (var9_8.d - var10_9) * 3.0 / var10_9;
                                var15_12 = var4_3.a;
                                var28_23 = var9_8.b;
                                var17_13 = var4_3.b;
                                var12_10 = var9_8.c;
                                var26_21 = (float)((var15_12 - var28_23) * var10_9 * var1_1 + (double)var21_16);
                                var25_20 = (float)(var10_9 * (var17_13 - var12_10) * var1_1 + (double)var22_17);
                            }
                        }
                        if (var24_19 == com.saterskog.cell_lab.h.o && var9_8.b(4) == 2) {
                            var4_3.f = (float)((double)var4_3.f - var1_1);
                        }
                        var19_14 = var7_6;
                        var20_15 = var8_7;
                        var21_16 = var25_20;
                        var22_17 = var26_21;
                        var23_18 = var3_2;
                        if (var4_3.f <= 0.0f) {
                            var19_14 = var7_6;
                            var20_15 = var8_7;
                            var21_16 = var25_20;
                            var22_17 = var26_21;
                            var23_18 = var3_2;
                            if (var24_19 == com.saterskog.cell_lab.h.a) {
                                var10_9 = 1.0 * var1_1;
                                var12_10 = Math.min((double)var4_3.c, 0.36 - var9_8.w);
                                if (var10_9 < var12_10) {
                                    var9_8.e *= var9_8.w;
                                    var9_8.f *= var9_8.w;
                                    var9_8.w += var10_9;
                                    var9_8.e /= var9_8.w;
                                    var9_8.f /= var9_8.w;
                                    var4_3.c = (float)((double)var4_3.c - var10_9);
                                    var23_18 = var3_2;
                                    var22_17 = var26_21;
                                    var21_16 = var25_20;
                                    var20_15 = var8_7;
                                    var19_14 = var7_6;
                                } else {
                                    var9_8.e *= var9_8.w;
                                    var9_8.f *= var9_8.w;
                                    var9_8.w += var12_10;
                                    var9_8.e /= var9_8.w;
                                    var9_8.f /= var9_8.w;
                                    var4_3.c = (float)((double)var4_3.c - var12_10);
                                    var19_14 = var7_6;
                                    var20_15 = var8_7;
                                    var21_16 = var25_20;
                                    var22_17 = var26_21;
                                    var23_18 = var3_2;
                                    if ((double)var4_3.c <= 0.0) {
                                        var4_3.a(this.A[this.B - 1]);
                                        --this.B;
                                        var23_18 = var3_2 - 1;
                                        var19_14 = this.aW[var14_11];
                                        var20_15 = 1;
                                        var21_16 = var25_20;
                                        var22_17 = var26_21;
                                    }
                                }
                            }
                        }
                    }
                    var7_6 = var19_14 + 1;
                    var8_7 = var20_15;
                    var6_5 = var21_16;
                    var5_4 = var22_17;
                    var3_2 = var23_18;
                }
                var7_6 = var3_2;
                if (var8_7 != 0) ** GOTO lbl27
                var7_6 = var3_2;
                if (!this.e.y) ** GOTO lbl27
                var25_20 = (float)((double)var5_4 - 0.2 * (double)var4_3.d * this.e.g * var1_1);
                var26_21 = (float)((double)var6_5 - 0.2 * (double)var4_3.e * this.e.g * var1_1);
                var4_3.a = (float)((double)var4_3.a + (double)var25_20 * var1_1);
                var4_3.b = (float)((double)var4_3.b + (double)var26_21 * var1_1);
                var5_4 = var26_21;
                var6_5 = var25_20;
                if (!((double)(var4_3.a * var4_3.a + var4_3.b * var4_3.b) >= this.e.k * this.e.k)) break block19;
                if (!this.e.x) break block20;
                var4_3.a(this.A[this.B - 1]);
                --this.B;
                var7_6 = var3_2 - 1;
                ** GOTO lbl27
            }
            var6_5 = (float)Math.sqrt(var4_3.a * var4_3.a + var4_3.b * var4_3.b);
            var4_3.a = (float)this.e.k * var4_3.a / var6_5;
            var4_3.b = (float)this.e.k * var4_3.b / var6_5;
            var5_4 = 2.0f * (var4_3.a * var25_20 + var4_3.b * var26_21) / (var6_5 * var6_5);
            var6_5 = var25_20 - var4_3.a * var5_4;
            var5_4 = var26_21 - var5_4 * var4_3.b;
        }
        var4_3.d = var6_5;
        var4_3.e = var5_4;
        var7_6 = var3_2;
        ** while (true)
    }

    /*
     * Unable to fully structure code
     */
    private void d(int var1_1) {
        block145: {
            block134: {
                block132: {
                    block131: {
                        block139: {
                            block138: {
                                block137: {
                                    block136: {
                                        block135: {
                                            block157: {
                                                block156: {
                                                    block133: {
                                                        block121: {
                                                            block154: {
                                                                block128: {
                                                                    block129: {
                                                                        block130: {
                                                                            block127: {
                                                                                block126: {
                                                                                    block125: {
                                                                                        block153: {
                                                                                            block124: {
                                                                                                block123: {
                                                                                                    block122: {
                                                                                                        block120: {
                                                                                                            block152: {
                                                                                                                block119: {
                                                                                                                    block117: {
                                                                                                                        block118: {
                                                                                                                            block144: {
                                                                                                                                block111: {
                                                                                                                                    block115: {
                                                                                                                                        block112: {
                                                                                                                                            block116: {
                                                                                                                                                block143: {
                                                                                                                                                    block142: {
                                                                                                                                                        block113: {
                                                                                                                                                            block114: {
                                                                                                                                                                block110: {
                                                                                                                                                                    block109: {
                                                                                                                                                                        block141: {
                                                                                                                                                                            block140: {
                                                                                                                                                                                var2_2 = this.x[var1_1];
                                                                                                                                                                                var3_3 = var2_2.I[var2_2.D].s;
                                                                                                                                                                                if (var3_3 != com.saterskog.cell_lab.h.k && var3_3 != com.saterskog.cell_lab.h.l) ** GOTO lbl152
                                                                                                                                                                                var4_4 = 0.0;
                                                                                                                                                                                var6_5 = 0.0;
                                                                                                                                                                                if (var3_3 == com.saterskog.cell_lab.h.k) {
                                                                                                                                                                                    var4_4 = Math.cos(var2_2.k);
                                                                                                                                                                                    var6_5 = Math.sin(var2_2.k);
                                                                                                                                                                                }
                                                                                                                                                                                var8_6 = (int)((this.e.k + var2_2.b) / (2.0 * this.e.k) * (double)this.bd + 1.0);
                                                                                                                                                                                var9_7 = (int)((this.e.k + var2_2.c) / (2.0 * this.e.k) * (double)this.bd + 1.0);
                                                                                                                                                                                var10_8 = 0.0f;
                                                                                                                                                                                if (var2_2.I[var2_2.D].u[3] != 3) break block140;
                                                                                                                                                                                if (var3_3 != com.saterskog.cell_lab.h.l) break block141;
                                                                                                                                                                                var10_8 = (float)(0.0 + this.c(var2_2.b, var2_2.c) * 0.2);
                                                                                                                                                                            }
lbl16:
                                                                                                                                                                            // 2 sources

                                                                                                                                                                            while (true) {
                                                                                                                                                                                var11_9 = var10_8;
                                                                                                                                                                                if (var2_2.I[var2_2.D].u[3] == 4) {
                                                                                                                                                                                    if (var3_3 != com.saterskog.cell_lab.h.l) break block109;
                                                                                                                                                                                    var11_9 = (float)((double)var10_8 + Math.sqrt(var2_2.e * var2_2.e + var2_2.f * var2_2.f) * 3.0);
                                                                                                                                                                                }
lbl21:
                                                                                                                                                                                // 4 sources

                                                                                                                                                                                while (true) {
                                                                                                                                                                                    var10_8 = var11_9;
                                                                                                                                                                                    if (var2_2.I[var2_2.D].u[3] == 5) {
                                                                                                                                                                                        var12_10 = Math.sqrt(var2_2.b * var2_2.b + var2_2.c * var2_2.c);
                                                                                                                                                                                        var14_11 = Math.max(Math.min(1.0, 1.0 - (this.e.k - var12_10) / 0.27), 0.0);
                                                                                                                                                                                        if (var3_3 != com.saterskog.cell_lab.h.l) break block110;
                                                                                                                                                                                        var10_8 = (float)((double)var11_9 + var14_11);
                                                                                                                                                                                    }
lbl28:
                                                                                                                                                                                    // 5 sources

                                                                                                                                                                                    while (true) {
                                                                                                                                                                                        if (var2_2.I[var2_2.D].u[3] != 0 && var2_2.I[var2_2.D].u[3] != 1 && var2_2.I[var2_2.D].u[3] != 2 && var2_2.I[var2_2.D].u[3] != 3) {
                                                                                                                                                                                            var11_9 = var10_8;
                                                                                                                                                                                            if (var2_2.I[var2_2.D].u[3] != 5) break block111;
                                                                                                                                                                                        }
                                                                                                                                                                                        var16_12 = -1;
lbl33:
                                                                                                                                                                                        // 2 sources

                                                                                                                                                                                        while (true) {
                                                                                                                                                                                            var11_9 = var10_8;
                                                                                                                                                                                            if (var16_12 >= 2) break block111;
                                                                                                                                                                                            var17_13 = -1;
lbl37:
                                                                                                                                                                                            // 2 sources

                                                                                                                                                                                            while (var17_13 < 2) {
                                                                                                                                                                                                var18_14 = var8_6 + var16_12;
                                                                                                                                                                                                var19_15 = var9_7 + var17_13;
                                                                                                                                                                                                var20_16 = var10_8;
                                                                                                                                                                                                if (var18_14 < 0) break block112;
                                                                                                                                                                                                var20_16 = var10_8;
                                                                                                                                                                                                if (var18_14 >= this.bd + 2) break block112;
                                                                                                                                                                                                var20_16 = var10_8;
                                                                                                                                                                                                if (var19_15 < 0) break block112;
                                                                                                                                                                                                var20_16 = var10_8;
                                                                                                                                                                                                if (var19_15 >= this.bd + 2) break block112;
                                                                                                                                                                                                var19_15 = var18_14 + var19_15 * (this.bd + 2);
                                                                                                                                                                                                var18_14 = 0;
                                                                                                                                                                                                var11_9 = var10_8;
                                                                                                                                                                                                block5: while (true) {
                                                                                                                                                                                                    var20_16 = var11_9;
                                                                                                                                                                                                    if (var18_14 >= this.bc[var19_15]) break block112;
                                                                                                                                                                                                    var10_8 = var11_9;
                                                                                                                                                                                                    if (this.bb[var19_15][var18_14] == var2_2.I[var2_2.D].u[3]) {
                                                                                                                                                                                                        var10_8 = var11_9;
                                                                                                                                                                                                        if (this.ba[var19_15][var18_14] != var1_1) {
                                                                                                                                                                                                            if (var2_2.I[var2_2.D].u[3] != 0) break block113;
                                                                                                                                                                                                            var21_17 = this.x[this.ba[var19_15][var18_14]];
                                                                                                                                                                                                            var20_16 = var2_2.I[var2_2.D].v[1] - var21_17.J[0];
                                                                                                                                                                                                            var22_18 = var2_2.I[var2_2.D].v[2] - var21_17.J[1];
                                                                                                                                                                                                            var23_19 = var2_2.I[var2_2.D].v[3] - var21_17.J[2];
                                                                                                                                                                                                            var24_20 = var2_2.I[var2_2.D].v[4];
                                                                                                                                                                                                            var10_8 = var11_9;
                                                                                                                                                                                                            if (var20_16 * var20_16 + var22_18 * var22_18 + var23_19 * var23_19 < var24_20 * var24_20) {
                                                                                                                                                                                                                var25_21 = var2_2.b - var21_17.b;
                                                                                                                                                                                                                var14_11 = var2_2.c - var21_17.c;
                                                                                                                                                                                                                var12_10 = Math.sqrt(var25_21 * var25_21 + var14_11 * var14_11);
                                                                                                                                                                                                                var10_8 = var11_9;
                                                                                                                                                                                                                if (var12_10 > 0.0) {
                                                                                                                                                                                                                    if (var3_3 != com.saterskog.cell_lab.h.l) break block114;
                                                                                                                                                                                                                    var14_11 = var11_9;
                                                                                                                                                                                                                    var10_8 = (float)(var21_17.w * com.saterskog.b.b.a(var12_10 / 0.09) * 10.0 + var14_11);
                                                                                                                                                                                                                }
                                                                                                                                                                                                            }
                                                                                                                                                                                                        }
                                                                                                                                                                                                    }
lbl74:
                                                                                                                                                                                                    // 12 sources

                                                                                                                                                                                                    while (true) {
                                                                                                                                                                                                        ++var18_14;
                                                                                                                                                                                                        var11_9 = var10_8;
                                                                                                                                                                                                        continue block5;
                                                                                                                                                                                                        break;
                                                                                                                                                                                                    }
                                                                                                                                                                                                    break;
                                                                                                                                                                                                }
                                                                                                                                                                                            }
                                                                                                                                                                                            break block115;
                                                                                                                                                                                            break;
                                                                                                                                                                                        }
                                                                                                                                                                                        break;
                                                                                                                                                                                    }
                                                                                                                                                                                    break;
                                                                                                                                                                                }
                                                                                                                                                                                break;
                                                                                                                                                                            }
                                                                                                                                                                        }
                                                                                                                                                                        var10_8 = (float)(0.0 + -(this.d(var2_2.b, var2_2.c) * var6_5 - this.e(var2_2.b, var2_2.c) * var4_4) * 0.2);
                                                                                                                                                                        ** while (true)
                                                                                                                                                                    }
                                                                                                                                                                    var11_9 = (float)((double)var10_8 + (var2_2.e * var6_5 - var2_2.f * var4_4) * 3.0);
                                                                                                                                                                    ** while (true)
                                                                                                                                                                }
                                                                                                                                                                var10_8 = var11_9;
                                                                                                                                                                if (var12_10 == 0.0) ** GOTO lbl28
                                                                                                                                                                var10_8 = (float)((double)var11_9 + -var14_11 * (var2_2.b * var6_5 - var2_2.c * var4_4) / var12_10);
                                                                                                                                                                ** while (true)
                                                                                                                                                            }
                                                                                                                                                            var27_22 = var11_9;
                                                                                                                                                            var10_8 = (float)(var21_17.w * com.saterskog.b.b.b(var12_10 / 0.09) * (var25_21 * var6_5 - var14_11 * var4_4) / var12_10 * 10.0 + var27_22);
                                                                                                                                                            ** GOTO lbl74
                                                                                                                                                        }
                                                                                                                                                        if (this.ba[var19_15][var18_14] >= 0) break block142;
                                                                                                                                                        var21_17 = this.x[-(this.ba[var19_15][var18_14] + 1)];
                                                                                                                                                        var27_22 = 0.25 * (var2_2.b - var21_17.b);
                                                                                                                                                        var25_21 = (var2_2.c - var21_17.c) * 0.25;
                                                                                                                                                        var12_10 = Math.sqrt(var27_22 * var27_22 + var25_21 * var25_21);
                                                                                                                                                        var14_11 = var21_17.w * 10.0;
lbl101:
                                                                                                                                                        // 4 sources

                                                                                                                                                        while (true) {
                                                                                                                                                            var10_8 = var11_9;
                                                                                                                                                            if (var12_10 > 0.0) {
                                                                                                                                                                if (var3_3 != com.saterskog.cell_lab.h.l) break block116;
                                                                                                                                                                var27_22 = var11_9;
                                                                                                                                                                var10_8 = (float)(var14_11 * com.saterskog.b.b.a(var12_10 / 0.09) + var27_22);
                                                                                                                                                            }
                                                                                                                                                            ** GOTO lbl74
                                                                                                                                                            break;
                                                                                                                                                        }
                                                                                                                                                    }
                                                                                                                                                    var21_17 = this.A[this.ba[var19_15][var18_14]];
                                                                                                                                                    var29_23 = 0.0;
                                                                                                                                                    var31_24 = 0.0;
                                                                                                                                                    var33_25 = 0.0;
                                                                                                                                                    var35_26 = 0.0;
                                                                                                                                                    if (var21_17.f <= 0.0f && var2_2.I[var2_2.D].u[3] == 1) break block143;
                                                                                                                                                    var14_11 = var29_23;
                                                                                                                                                    var25_21 = var35_26;
                                                                                                                                                    var27_22 = var33_25;
                                                                                                                                                    var12_10 = var31_24;
                                                                                                                                                    if (!(var21_17.f > 0.0f)) ** GOTO lbl101
                                                                                                                                                    var14_11 = var29_23;
                                                                                                                                                    var25_21 = var35_26;
                                                                                                                                                    var27_22 = var33_25;
                                                                                                                                                    var12_10 = var31_24;
                                                                                                                                                    if (var2_2.I[var2_2.D].u[3] != 2) ** GOTO lbl101
                                                                                                                                                }
                                                                                                                                                var27_22 = var2_2.b - (double)var21_17.a;
                                                                                                                                                var25_21 = var2_2.c - (double)var21_17.b;
                                                                                                                                                var12_10 = Math.sqrt(var27_22 * var27_22 + var25_21 * var25_21);
                                                                                                                                                var14_11 = var21_17.c * 10.0f;
                                                                                                                                                ** while (true)
                                                                                                                                            }
                                                                                                                                            var31_24 = var11_9;
                                                                                                                                            var10_8 = (float)(var14_11 * com.saterskog.b.b.b(var12_10 / 0.09) * (var27_22 * var6_5 - var25_21 * var4_4) / var12_10 + var31_24);
                                                                                                                                            ** while (true)
                                                                                                                                        }
                                                                                                                                        ++var17_13;
                                                                                                                                        var10_8 = var20_16;
                                                                                                                                        ** GOTO lbl37
                                                                                                                                    }
                                                                                                                                    ++var16_12;
                                                                                                                                    ** while (true)
                                                                                                                                }
                                                                                                                                var10_8 = var11_9;
                                                                                                                                if (var3_3 != com.saterskog.cell_lab.h.k) ** GOTO lbl149
                                                                                                                                if (!var2_2.y) break block144;
                                                                                                                                var16_12 = -1;
lbl147:
                                                                                                                                // 2 sources

                                                                                                                                while (true) {
                                                                                                                                    var10_8 = var11_9 * (float)var16_12;
lbl149:
                                                                                                                                    // 2 sources

                                                                                                                                    var21_17 = var2_2.W;
                                                                                                                                    var16_12 = var2_2.b(2);
                                                                                                                                    var21_17[var16_12] = var21_17[var16_12] + Math.max(Math.min(var2_2.I[var2_2.D].v[0] * var10_8, 20.0f), -20.0f);
lbl152:
                                                                                                                                    // 2 sources

                                                                                                                                    var16_12 = 0;
                                                                                                                                    block9: while (var16_12 < var2_2.C) {
                                                                                                                                        var37_27 = var2_2.H[var16_12];
                                                                                                                                        var17_13 = var16_12;
                                                                                                                                        if (var37_27.a <= var1_1) {
                                                                                                                                            if (var37_27.a != -1) break block117;
                                                                                                                                            var12_10 = Math.cos(var2_2.k + var2_2.H[var16_12].c);
                                                                                                                                            var14_11 = Math.sin(var2_2.k + var2_2.H[var16_12].c);
                                                                                                                                            var37_27.g = (float)((var2_2.d - Cell.a) * var12_10 * 0.8);
                                                                                                                                            var37_27.h = (float)((var2_2.d - Cell.a) * var14_11 * 0.8);
                                                                                                                                            if (!((var37_27.e - (var12_10 *= var2_2.d * 0.6) - var2_2.b) * (var37_27.e - var12_10 - var2_2.b) + (var37_27.f - (var14_11 *= var2_2.d * 0.6) - var2_2.c) * (var37_27.f - var14_11 - var2_2.c) > var2_2.d * var2_2.d * 2.0 * 2.0)) break block118;
                                                                                                                                            var2_2.H[var16_12].a(var2_2.H[var2_2.C - 1]);
                                                                                                                                            --var2_2.C;
                                                                                                                                            var17_13 = var16_12 - 1;
                                                                                                                                        }
lbl166:
                                                                                                                                        // 6 sources

                                                                                                                                        while (true) {
                                                                                                                                            var16_12 = var17_13 + 1;
                                                                                                                                            continue block9;
                                                                                                                                            break;
                                                                                                                                        }
                                                                                                                                    }
                                                                                                                                    break block119;
                                                                                                                                    break;
                                                                                                                                }
                                                                                                                            }
                                                                                                                            var16_12 = 1;
                                                                                                                            ** while (true)
                                                                                                                        }
                                                                                                                        var29_23 = var2_2.e;
                                                                                                                        var31_24 = var2_2.l;
                                                                                                                        var6_5 = -var14_11;
                                                                                                                        var25_21 = var2_2.f;
                                                                                                                        var27_22 = var2_2.l;
                                                                                                                        var4_4 = 50.0 * var2_2.d;
                                                                                                                        var4_4 *= 1.0 - 1.0 * this.T * var4_4 * 0.5 / var2_2.w;
                                                                                                                        var6_5 = (0.0 - (var29_23 + var31_24 * var6_5)) * var4_4 + (var37_27.e - var12_10 - var2_2.b) * 30.0 * 3.0;
                                                                                                                        var27_22 = (0.0 - (var25_21 + var27_22 * var12_10)) * var4_4 + (var37_27.f - var14_11 - var2_2.c) * 30.0 * 3.0;
                                                                                                                        var2_2.g += var6_5;
                                                                                                                        var2_2.h += var27_22;
                                                                                                                        var25_21 = var2_2.j;
                                                                                                                        var2_2.j = var12_10 * var27_22 + var14_11 * -var6_5 + var25_21;
                                                                                                                        var17_13 = var16_12;
                                                                                                                        ** GOTO lbl166
                                                                                                                    }
                                                                                                                    var21_17 = this.x[var37_27.a];
                                                                                                                    var4_4 = Math.min(var2_2.d, var21_17.d);
                                                                                                                    var33_25 = Math.max(var2_2.d, var21_17.d);
                                                                                                                    var31_24 = var4_4 * 0.4;
                                                                                                                    var27_22 = var2_2.H[var16_12].c;
                                                                                                                    var6_5 = var2_2.H[var16_12].d;
                                                                                                                    var14_11 = var29_23 = -var2_2.q + var21_17.q;
                                                                                                                    var25_21 = var27_22;
                                                                                                                    var12_10 = var31_24;
                                                                                                                    if (var2_2.I[var2_2.D].s == com.saterskog.cell_lab.h.m) {
                                                                                                                        var25_21 = Math.cos(var27_22);
                                                                                                                        var14_11 = var29_23 - (double)var2_2.ac * var25_21;
                                                                                                                        var12_10 = var31_24 + var25_21 * var25_21 * var2_2.d * (double)var2_2.aa;
                                                                                                                        var25_21 = var27_22 + var25_21 * (double)var2_2.ab;
                                                                                                                    }
                                                                                                                    if (var21_17.I[var21_17.D].s != com.saterskog.cell_lab.h.m) break block145;
                                                                                                                    var31_24 = Math.cos(var6_5);
                                                                                                                    var27_22 = var21_17.ac;
                                                                                                                    var35_26 = var21_17.d;
                                                                                                                    var29_23 = var21_17.aa;
                                                                                                                    var6_5 = (double)var21_17.ab * var31_24 + var6_5;
                                                                                                                    var27_22 = var14_11 + var27_22 * var31_24;
                                                                                                                    var12_10 = var31_24 * var31_24 * var35_26 * var29_23 + var12_10;
lbl212:
                                                                                                                    // 2 sources

                                                                                                                    while (true) {
                                                                                                                        block146: {
                                                                                                                            var14_11 = var12_10;
                                                                                                                            if (var12_10 < 0.0 * var4_4 * 0.4) {
                                                                                                                                var14_11 = 0.0 * var4_4 * 0.4;
                                                                                                                            }
                                                                                                                            var12_10 = var14_11;
                                                                                                                            if (var14_11 > var4_4) {
                                                                                                                                var12_10 = var4_4;
                                                                                                                            }
                                                                                                                            var14_11 = Math.cos(var2_2.k + var25_21);
                                                                                                                            var25_21 = Math.sin(var25_21 + var2_2.k);
                                                                                                                            var29_23 = Math.cos(var21_17.k + var6_5);
                                                                                                                            var31_24 = Math.sin(var6_5 + var21_17.k);
                                                                                                                            var2_2.H[var16_12].g = (float)((var2_2.d - Cell.a) * var14_11 * 0.8);
                                                                                                                            var2_2.H[var16_12].h = (float)((var2_2.d - Cell.a) * var25_21 * 0.8);
                                                                                                                            var2_2.H[var16_12].i = (float)((var21_17.d - Cell.a) * var29_23 * 0.8);
                                                                                                                            var2_2.H[var16_12].j = (float)((var21_17.d - Cell.a) * var31_24 * 0.8);
                                                                                                                            var6_5 = var29_23 * (var21_17.d - var12_10 + (double)var37_27.l);
                                                                                                                            if (!((var21_17.b + var6_5 - var2_2.b - (var14_11 *= var2_2.d - var12_10 + (double)var37_27.l)) * (var21_17.b + var6_5 - var2_2.b - var14_11) + (var21_17.c + (var31_24 *= var21_17.d - var12_10 + (double)var37_27.l) - var2_2.c - (var25_21 *= var2_2.d - var12_10 + (double)var37_27.l)) * (var21_17.c + var31_24 - var2_2.c - var25_21) > var33_25 * var33_25 * 2.0 * 2.0)) break block146;
                                                                                                                            var17_13 = 0;
                                                                                                                            while (true) {
                                                                                                                                block148: {
                                                                                                                                    block147: {
                                                                                                                                        if (var17_13 >= var21_17.C) break block147;
                                                                                                                                        if (var21_17.H[var17_13].a != var1_1) break block148;
                                                                                                                                        var21_17.H[var17_13].a(var21_17.H[var21_17.C - 1]);
                                                                                                                                        --var21_17.C;
                                                                                                                                    }
                                                                                                                                    var2_2.H[var16_12].a(var2_2.H[var2_2.C - 1]);
                                                                                                                                    --var2_2.C;
                                                                                                                                    var17_13 = var16_12 - 1;
                                                                                                                                    ** GOTO lbl166
                                                                                                                                }
                                                                                                                                ++var17_13;
                                                                                                                            }
                                                                                                                        }
                                                                                                                        var38_32 = var2_2.e;
                                                                                                                        var40_33 = var2_2.l;
                                                                                                                        var42_34 = -var25_21;
                                                                                                                        var33_25 = var2_2.f;
                                                                                                                        var35_26 = var2_2.l;
                                                                                                                        var44_35 = var21_17.e;
                                                                                                                        var46_36 = var21_17.l;
                                                                                                                        var48_37 = -var31_24;
                                                                                                                        var29_23 = var21_17.f;
                                                                                                                        var50_38 = var21_17.l;
                                                                                                                        var12_10 = 25.0 * var2_2.w * var21_17.w / (var2_2.w + var21_17.w);
                                                                                                                        if (var2_2.C > var21_17.C) {
                                                                                                                            var12_10 /= (double)var2_2.C;
lbl257:
                                                                                                                            // 2 sources

                                                                                                                            while (true) {
                                                                                                                                var52_39 = var21_17.b + var6_5 - var14_11 - var2_2.b;
                                                                                                                                var54_40 = var21_17.c + var31_24 - var25_21 - var2_2.c;
                                                                                                                                var56_41 = 1.0 + 2.0 * (var52_39 * var52_39 + var54_40 * var54_40) / 0.0036;
                                                                                                                                var58_42 = 30.0 * Cell.a / (Cell.a + (double)(var37_27.l * 2.0f));
                                                                                                                                var38_32 = (var46_36 * var48_37 + var44_35 - (var40_33 * var42_34 + var38_32)) * var12_10 + var52_39 * var56_41 * var58_42;
                                                                                                                                var12_10 = var12_10 * (var50_38 * var6_5 + var29_23 - (var35_26 * var14_11 + var33_25)) + var54_40 * var56_41 * var58_42;
                                                                                                                                var2_2.g += var38_32;
                                                                                                                                var2_2.h += var12_10;
                                                                                                                                var2_2.i += var27_22;
                                                                                                                                var21_17.g -= var38_32;
                                                                                                                                var21_17.h -= var12_10;
                                                                                                                                var21_17.i -= var27_22;
                                                                                                                                var29_23 = 0.5 * (var2_2.b + var14_11 + var21_17.b + var6_5);
                                                                                                                                var27_22 = 0.5 * (var2_2.c + var25_21 + var21_17.c + var31_24);
                                                                                                                                var2_2.j += -var38_32 * (var27_22 - var2_2.c) + (var29_23 - var2_2.b) * var12_10;
                                                                                                                                var33_25 = var21_17.j;
                                                                                                                                var50_38 = -var38_32;
                                                                                                                                var35_26 = var21_17.c;
                                                                                                                                var21_17.j = var33_25 - (var12_10 * (var29_23 - var21_17.b) + var50_38 * (var27_22 - var35_26));
                                                                                                                                var12_10 = var25_21 * var6_5 - var14_11 * var31_24;
                                                                                                                                var14_11 = Math.signum(var12_10);
                                                                                                                                var12_10 = Math.sqrt(Math.abs(var12_10)) * var14_11 * var4_4 * (double)var2_2.H[var16_12].k;
                                                                                                                                var2_2.j += var12_10;
                                                                                                                                var21_17.j -= var12_10;
                                                                                                                                var17_13 = var16_12;
                                                                                                                                ** continue;
                                                                                                                                break;
                                                                                                                            }
                                                                                                                        }
                                                                                                                        var12_10 /= (double)var21_17.C;
                                                                                                                        ** continue;
                                                                                                                        break;
                                                                                                                    }
                                                                                                                }
                                                                                                                var16_12 = 0;
                                                                                                                for (var18_14 = 0; var18_14 < 4; ++var18_14) {
                                                                                                                    block149: {
                                                                                                                        var17_13 = -1;
                                                                                                                        if (var18_14 == 0) {
                                                                                                                            var17_13 = var2_2.K;
                                                                                                                        }
                                                                                                                        if (var18_14 == 1) {
                                                                                                                            var17_13 = var2_2.L;
                                                                                                                        }
                                                                                                                        if (var18_14 == 2) {
                                                                                                                            var17_13 = var2_2.M;
                                                                                                                        }
                                                                                                                        if (var18_14 == 3) {
                                                                                                                            var17_13 = var2_2.N;
                                                                                                                        }
                                                                                                                        var8_6 = var16_12;
                                                                                                                        if (var17_13 == -1) break block149;
                                                                                                                        var21_17 = this.aV[var17_13];
                                                                                                                        var9_7 = 0;
                                                                                                                        block15: while (true) {
                                                                                                                            var8_6 = var16_12;
                                                                                                                            if (var9_7 >= this.aW[var17_13]) break;
                                                                                                                            var60_43 = var21_17[var9_7];
                                                                                                                            var19_15 = var16_12;
                                                                                                                            if (var60_43 <= var1_1) ** GOTO lbl320
                                                                                                                            var61_44 = 1;
                                                                                                                            var19_15 = 0;
                                                                                                                            while (true) {
                                                                                                                                block151: {
                                                                                                                                    block150: {
                                                                                                                                        var8_6 = var61_44;
                                                                                                                                        if (var19_15 >= var16_12) break block150;
                                                                                                                                        if (this.K[var19_15] != var60_43) break block151;
                                                                                                                                        var8_6 = 0;
                                                                                                                                    }
                                                                                                                                    var19_15 = var16_12;
                                                                                                                                    if (var8_6 != 0) {
                                                                                                                                        this.K[var16_12] = (int)var60_43;
                                                                                                                                        var19_15 = var16_12 + 1;
                                                                                                                                    }
lbl320:
                                                                                                                                    // 4 sources

                                                                                                                                    ++var9_7;
                                                                                                                                    var16_12 = var19_15;
                                                                                                                                    continue block15;
                                                                                                                                }
                                                                                                                                ++var19_15;
                                                                                                                            }
                                                                                                                            break;
                                                                                                                        }
                                                                                                                    }
                                                                                                                    var16_12 = var8_6;
                                                                                                                }
                                                                                                                var25_21 = var2_2.b;
                                                                                                                var27_22 = var2_2.c;
                                                                                                                if (var3_3 != com.saterskog.cell_lab.h.f) break block152;
                                                                                                                var17_13 = 1;
lbl333:
                                                                                                                // 2 sources

                                                                                                                while (var17_13 == 0) {
                                                                                                                    var18_14 = 0;
lbl335:
                                                                                                                    // 2 sources

                                                                                                                    while (var18_14 < var2_2.C) {
                                                                                                                        if (var2_2.H[var18_14].a < 0) break block120;
                                                                                                                        var21_17 = this.x[var2_2.H[var18_14].a];
                                                                                                                        if (var21_17.I[var21_17.D].s != com.saterskog.cell_lab.h.f) break block120;
                                                                                                                        var18_14 = 1;
lbl340:
                                                                                                                        // 2 sources

                                                                                                                        while (true) {
                                                                                                                            var9_7 = 0;
lbl342:
                                                                                                                            // 2 sources

                                                                                                                            while (var9_7 < var16_12) {
                                                                                                                                var19_15 = this.K[var9_7];
                                                                                                                                var21_17 = this.x[var19_15];
                                                                                                                                var37_29 = var21_17.I[var21_17.D].s;
                                                                                                                                var6_5 = var21_17.c;
                                                                                                                                var4_4 = var21_17.b;
                                                                                                                                var35_26 = (var27_22 - var6_5) * (var27_22 - var6_5) + (var25_21 - var4_4) * (var25_21 - var4_4);
                                                                                                                                var50_38 = var2_2.d;
                                                                                                                                var33_25 = var21_17.d;
                                                                                                                                var12_10 = var50_38 + var33_25;
                                                                                                                                if (!(var35_26 < var12_10 * var12_10) || var35_26 == 0.0 || var2_2.x || var21_17.x) break block121;
                                                                                                                                var14_11 = Math.sqrt(var35_26);
                                                                                                                                var12_10 = (-var14_11 + var50_38 - var33_25) * (-var14_11 - var50_38 + var33_25) * (-var14_11 + var50_38 + var33_25) * (var14_11 + var50_38 + var33_25) / var35_26;
                                                                                                                                var42_34 = (var14_11 * var14_11 - var33_25 * var33_25 + var50_38 * var50_38) / (2.0 * var14_11);
                                                                                                                                var29_23 = (var4_4 - var25_21) / var14_11;
                                                                                                                                var31_24 = (var6_5 - var27_22) / var14_11;
                                                                                                                                var38_32 = var42_34 * var29_23;
                                                                                                                                var42_34 *= var31_24;
                                                                                                                                if (this.U) {
                                                                                                                                    if (var2_2.B < 20 && var21_17.B < 20) break block122;
                                                                                                                                    com.saterskog.b.a.a("skit: Cell touches too many neighbors (>" + Integer.toString(20) + "), not supposed to normally happen and programmer was lazy enough to not gracefully handle this case.");
                                                                                                                                }
lbl363:
                                                                                                                                // 4 sources

                                                                                                                                while (true) {
                                                                                                                                    if (var3_3 != com.saterskog.cell_lab.h.r && var37_29 != com.saterskog.cell_lab.h.r) ** GOTO lbl383
                                                                                                                                    var12_10 = (-var14_11 + var50_38 - var33_25) * (-var14_11 - var50_38 + var33_25) * (-var14_11 + var50_38 + var33_25) * (var50_38 + var14_11 + var33_25) / var35_26;
                                                                                                                                    var35_26 = var2_2.w * var21_17.w / (var2_2.w + var21_17.w);
                                                                                                                                    var33_25 = (var21_17.e - var2_2.e) * var35_26 / 0.02;
                                                                                                                                    var33_25 = var35_26 * (var21_17.f - var2_2.f) / 0.02 * 0.2 * var31_24 + var33_25 * 0.2 * var29_23;
                                                                                                                                    var31_24 = var33_25 * var31_24;
                                                                                                                                    var2_2.g += (var29_23 *= var33_25);
                                                                                                                                    var2_2.h += var31_24;
                                                                                                                                    var21_17.g -= var29_23;
                                                                                                                                    var21_17.h -= var31_24;
                                                                                                                                    var17_13 = 0;
lbl375:
                                                                                                                                    // 2 sources

                                                                                                                                    while (var17_13 < var2_2.C) {
                                                                                                                                        if (var2_2.H[var17_13].a != var19_15) break block123;
                                                                                                                                        var17_13 = 0;
lbl378:
                                                                                                                                        // 2 sources

                                                                                                                                        while (true) {
                                                                                                                                            if (var17_13 != 0) {
                                                                                                                                                this.aY[this.aX] = var1_1;
                                                                                                                                                this.aZ[this.aX] = var19_15;
                                                                                                                                                ++this.aX;
                                                                                                                                            }
lbl383:
                                                                                                                                            // 4 sources

                                                                                                                                            var12_10 = var14_11 = var12_10 * 500.0 / (0.5 / (double)var2_2.a(6) + 0.5 / (double)var21_17.a(6)) / var14_11;
                                                                                                                                            if (var3_3 == com.saterskog.cell_lab.h.q) {
                                                                                                                                                var12_10 = var14_11;
                                                                                                                                                if (var37_29 == com.saterskog.cell_lab.h.q) {
                                                                                                                                                    var12_10 = var14_11;
                                                                                                                                                    if (var2_2.o > 0.5) {
                                                                                                                                                        var12_10 = var14_11;
                                                                                                                                                        if (var21_17.o > 0.5) {
                                                                                                                                                            if (var2_2.D != var21_17.b(1) || var2_2.b(1) != var21_17.D) break block124;
                                                                                                                                                            var12_10 = var14_11 * -0.6;
                                                                                                                                                        }
                                                                                                                                                    }
                                                                                                                                                }
                                                                                                                                            }
lbl393:
                                                                                                                                            // 11 sources

                                                                                                                                            while (true) {
                                                                                                                                                var14_11 = (var25_21 - var4_4) * var12_10;
                                                                                                                                                var2_2.g += var14_11;
                                                                                                                                                var2_2.h += (var12_10 *= var27_22 - var6_5);
                                                                                                                                                var21_17.g -= var14_11;
                                                                                                                                                var21_17.h -= var12_10;
                                                                                                                                                if (var37_29 != com.saterskog.cell_lab.h.f) break block125;
                                                                                                                                                var17_13 = 1;
lbl401:
                                                                                                                                                // 2 sources

                                                                                                                                                while (true) {
                                                                                                                                                    if (var17_13 != 0) ** GOTO lbl410
                                                                                                                                                    var8_6 = 0;
lbl404:
                                                                                                                                                    // 2 sources

                                                                                                                                                    while (true) {
                                                                                                                                                        if (var8_6 < var21_17.C) {
                                                                                                                                                            if (var21_17.H[var8_6].a < 0) break block126;
                                                                                                                                                            var62_45 = this.x[var21_17.H[var8_6].a];
                                                                                                                                                            if (var62_45.I[var62_45.D].s != com.saterskog.cell_lab.h.f) break block126;
                                                                                                                                                            var17_13 = 1;
                                                                                                                                                        }
lbl410:
                                                                                                                                                        // 4 sources

                                                                                                                                                        if (!this.bg) {
                                                                                                                                                            if (var3_3 == com.saterskog.cell_lab.h.i && var17_13 == 0 && this.Y.a() < this.T * 5.0) {
                                                                                                                                                                if (var21_17.E == 1) {
                                                                                                                                                                    var21_17.E = 4;
                                                                                                                                                                }
                                                                                                                                                                if (var21_17.E == 0) {
                                                                                                                                                                    var21_17.E = 3;
                                                                                                                                                                }
                                                                                                                                                                if (var21_17.E == 2) {
                                                                                                                                                                    var21_17.E = 5;
                                                                                                                                                                }
                                                                                                                                                                var61_44 = var2_2.b(0);
                                                                                                                                                                var8_6 = var61_44 - var61_44 + 80;
                                                                                                                                                                var63_46 = var2_2.I[var61_44];
                                                                                                                                                                var21_17.I[var61_44].a((Gene)var63_46);
                                                                                                                                                                var21_17.I[(var63_46.i + var8_6) % 80].a(var2_2.I[var63_46.i]);
                                                                                                                                                                var21_17.I[(var63_46.j + var8_6) % 80].a(var2_2.I[var63_46.j]);
                                                                                                                                                                var62_45 = var2_2.I[var63_46.i];
                                                                                                                                                                var21_17.I[(var62_45.i + var8_6) % 80].a(var2_2.I[var62_45.i]);
                                                                                                                                                                var21_17.I[(var62_45.j + var8_6) % 80].a(var2_2.I[var62_45.j]);
                                                                                                                                                                var62_45 = var2_2.I[var63_46.j];
                                                                                                                                                                var21_17.I[(var62_45.i + var8_6) % 80].a(var2_2.I[var62_45.i]);
                                                                                                                                                                var21_17.I[(var8_6 + var62_45.j) % 80].a(var2_2.I[var62_45.j]);
                                                                                                                                                            }
                                                                                                                                                            if (var37_29 == com.saterskog.cell_lab.h.i && var18_14 == 0 && this.Y.a() < this.T * 5.0) {
                                                                                                                                                                if (var2_2.E == 1) {
                                                                                                                                                                    var2_2.E = 4;
                                                                                                                                                                }
                                                                                                                                                                if (var2_2.E == 0) {
                                                                                                                                                                    var2_2.E = 3;
                                                                                                                                                                }
                                                                                                                                                                if (var2_2.E == 2) {
                                                                                                                                                                    var2_2.E = 5;
                                                                                                                                                                }
                                                                                                                                                                var61_44 = var21_17.b(0);
                                                                                                                                                                var8_6 = var61_44 - var61_44 + 80;
                                                                                                                                                                var63_46 = var21_17.I[var61_44];
                                                                                                                                                                var2_2.I[var61_44].a((Gene)var63_46);
                                                                                                                                                                var2_2.I[(var63_46.i + var8_6) % 80].a(var21_17.I[var63_46.i]);
                                                                                                                                                                var2_2.I[(var63_46.j + var8_6) % 80].a(var21_17.I[var63_46.j]);
                                                                                                                                                                var62_45 = var21_17.I[var63_46.i];
                                                                                                                                                                var2_2.I[(var62_45.i + var8_6) % 80].a(var21_17.I[var62_45.i]);
                                                                                                                                                                var2_2.I[(var62_45.j + var8_6) % 80].a(var21_17.I[var62_45.j]);
                                                                                                                                                                var62_45 = var21_17.I[var63_46.j];
                                                                                                                                                                var2_2.I[(var62_45.i + var8_6) % 80].a(var21_17.I[var62_45.i]);
                                                                                                                                                                var2_2.I[(var8_6 + var62_45.j) % 80].a(var21_17.I[var62_45.j]);
                                                                                                                                                            }
                                                                                                                                                        }
                                                                                                                                                        if ((var3_3 != com.saterskog.cell_lab.h.h || var2_2.C >= 5 || var17_13 != 0) && (var21_17.I[var21_17.D].s != com.saterskog.cell_lab.h.h || var21_17.C >= 5 || var18_14 != 0) || var2_2.C >= 20 || var21_17.C >= 20 || !(var2_2.o >= 0.1) || !(var21_17.o >= 0.1)) ** GOTO lbl473
                                                                                                                                                        var8_6 = 0;
lbl451:
                                                                                                                                                        // 2 sources

                                                                                                                                                        while (var8_6 < var2_2.C) {
                                                                                                                                                            if (var2_2.H[var8_6].a != var19_15) break block127;
                                                                                                                                                            var8_6 = 0;
lbl454:
                                                                                                                                                            // 2 sources

                                                                                                                                                            while (true) {
                                                                                                                                                                if (var8_6 != 0) {
                                                                                                                                                                    var62_45 = var2_2.H[var2_2.C];
                                                                                                                                                                    var63_46 = var21_17.H[var21_17.C];
                                                                                                                                                                    var62_45.b = false;
                                                                                                                                                                    var63_46.b = false;
                                                                                                                                                                    var62_45.a = var19_15;
                                                                                                                                                                    var63_46.a = var1_1;
                                                                                                                                                                    var14_11 = Math.atan2(var21_17.c - var2_2.c, var21_17.b - var2_2.b);
                                                                                                                                                                    var63_46.d = var12_10 = var14_11 - var2_2.k;
                                                                                                                                                                    var62_45.c = var12_10;
                                                                                                                                                                    var62_45.d = var12_10 = var14_11 + 3.141592653589793 - var21_17.k;
                                                                                                                                                                    var63_46.c = var12_10;
                                                                                                                                                                    var62_45.k = 0.5f;
                                                                                                                                                                    var63_46.k = 0.5f;
                                                                                                                                                                    var62_45.l = 0.0f;
                                                                                                                                                                    var63_46.l = 0.0f;
                                                                                                                                                                    ++var2_2.C;
                                                                                                                                                                    ++var21_17.C;
                                                                                                                                                                }
lbl473:
                                                                                                                                                                // 4 sources

                                                                                                                                                                if (var3_3 == com.saterskog.cell_lab.h.d && var17_13 == 0) {
                                                                                                                                                                    var12_10 = var14_11 = 0.72 * this.T;
                                                                                                                                                                    if (var14_11 > var21_17.w - 0.036) {
                                                                                                                                                                        var12_10 = var21_17.w - 0.036;
                                                                                                                                                                    }
                                                                                                                                                                    var2_2.w += var12_10;
                                                                                                                                                                    var21_17.w -= var12_10;
                                                                                                                                                                    var2_2.p += var21_17.p * var12_10 / var21_17.w;
                                                                                                                                                                    var21_17.p -= var21_17.p * var12_10 / var21_17.w;
                                                                                                                                                                    var2_2.X = (float)((double)var2_2.X + (double)var21_17.X * var12_10 / var21_17.w);
                                                                                                                                                                    var21_17.X = (float)((double)var21_17.X - var12_10 * (double)var21_17.X / var21_17.w);
                                                                                                                                                                }
                                                                                                                                                                if (var37_29 == com.saterskog.cell_lab.h.d && var18_14 == 0) {
                                                                                                                                                                    var12_10 = var14_11 = 0.72 * this.T;
                                                                                                                                                                    if (var14_11 > var2_2.w - 0.036) {
                                                                                                                                                                        var12_10 = var2_2.w - 0.036;
                                                                                                                                                                    }
                                                                                                                                                                    var21_17.w += var12_10;
                                                                                                                                                                    var2_2.w -= var12_10;
                                                                                                                                                                    var21_17.p += var2_2.p * var12_10 / var2_2.w;
                                                                                                                                                                    var2_2.p -= var2_2.p * var12_10 / var2_2.w;
                                                                                                                                                                    var21_17.X = (float)((double)var21_17.X + (double)var2_2.X * var12_10 / var2_2.w);
                                                                                                                                                                    var2_2.X = (float)((double)var2_2.X - var12_10 * (double)var2_2.X / var2_2.w);
                                                                                                                                                                }
                                                                                                                                                                if (var3_3 != com.saterskog.cell_lab.h.o || !(var2_2.p >= 0.2)) break block128;
                                                                                                                                                                var61_44 = var2_2.I[var2_2.D].u[4];
                                                                                                                                                                if (var61_44 == 1 && var17_13 == 0 && (var37_29 != com.saterskog.cell_lab.h.o || var21_17.b(4) != 1)) {
                                                                                                                                                                    var21_17.X = (float)((double)var21_17.X + 60.0 * this.T);
                                                                                                                                                                }
                                                                                                                                                                if (var61_44 == 2 && var37_29 != com.saterskog.cell_lab.h.f && (var37_29 != com.saterskog.cell_lab.h.o || var21_17.b(4) != 2)) {
                                                                                                                                                                    var21_17.Y = (float)((double)var21_17.Y + 0.10000000149011612 * this.T);
                                                                                                                                                                }
                                                                                                                                                                if (var61_44 != 3 || !(var2_2.o > 0.5)) break block129;
                                                                                                                                                                var17_13 = 0;
                                                                                                                                                                block29: while (var17_13 < var21_17.C) {
                                                                                                                                                                    if (var21_17.H[var17_13].a != -1) break block130;
                                                                                                                                                                    var8_6 = var17_13;
                                                                                                                                                                    if (!((var2_2.b - 0.0) * (var2_2.b - 0.0) + (var2_2.c - 0.0) * (var2_2.c - 0.0) >= (this.e.k - var2_2.d) * (this.e.k - var2_2.d))) ** GOTO lbl509
                                                                                                                                                                    --var21_17.C;
                                                                                                                                                                    var21_17.H[var17_13].a(var21_17.H[var21_17.C]);
                                                                                                                                                                    while (true) {
                                                                                                                                                                        var8_6 = var17_13 - 1;
lbl509:
                                                                                                                                                                        // 3 sources

                                                                                                                                                                        while (true) {
                                                                                                                                                                            var17_13 = var8_6 + 1;
                                                                                                                                                                            continue block29;
                                                                                                                                                                            break;
                                                                                                                                                                        }
                                                                                                                                                                        break;
                                                                                                                                                                    }
                                                                                                                                                                }
                                                                                                                                                                break block129;
                                                                                                                                                                break;
                                                                                                                                                            }
                                                                                                                                                        }
                                                                                                                                                        break block131;
                                                                                                                                                        break;
                                                                                                                                                    }
                                                                                                                                                    break;
                                                                                                                                                }
                                                                                                                                                break;
                                                                                                                                            }
                                                                                                                                            break;
                                                                                                                                        }
                                                                                                                                    }
                                                                                                                                    break block132;
                                                                                                                                    break;
                                                                                                                                }
                                                                                                                            }
                                                                                                                            break block133;
                                                                                                                            break;
                                                                                                                        }
                                                                                                                    }
                                                                                                                    break block134;
                                                                                                                }
                                                                                                                break block134;
                                                                                                            }
                                                                                                            var17_13 = 0;
                                                                                                            ** GOTO lbl333
                                                                                                        }
                                                                                                        ++var18_14;
                                                                                                        ** GOTO lbl335
                                                                                                    }
                                                                                                    var46_36 = Math.sqrt(var12_10);
                                                                                                    var62_45 = var2_2.A[var2_2.B];
                                                                                                    ++var2_2.B;
                                                                                                    var63_46 = var21_17.A[var21_17.B];
                                                                                                    ++var21_17.B;
                                                                                                    var62_45.a = (var6_5 - var27_22) * (var46_36 /= 2.0 * var14_11) + var38_32;
                                                                                                    var62_45.b = var42_34 - (var4_4 - var25_21) * var46_36;
                                                                                                    var62_45.c = var38_32 - (var6_5 - var27_22) * var46_36;
                                                                                                    var62_45.d = var42_34 + (var4_4 - var25_21) * var46_36;
                                                                                                    var62_45.g = var19_15;
                                                                                                    var63_46.g = var1_1;
                                                                                                    var62_45.e = false;
                                                                                                    var62_45.f = false;
                                                                                                    var63_46.a = var62_45.c + var25_21 - var4_4;
                                                                                                    var63_46.b = var62_45.d + var27_22 - var6_5;
                                                                                                    var63_46.c = var62_45.a + var25_21 - var4_4;
                                                                                                    var63_46.d = var62_45.b + var27_22 - var6_5;
                                                                                                    var63_46.e = false;
                                                                                                    var63_46.f = false;
                                                                                                    ** while (true)
                                                                                                }
                                                                                                ++var17_13;
                                                                                                ** GOTO lbl375
                                                                                            }
                                                                                            if (var2_2.D == var21_17.b(1)) break block153;
                                                                                            var12_10 = var14_11;
                                                                                            if (var2_2.b(1) != var21_17.D) ** GOTO lbl393
                                                                                        }
                                                                                        var12_10 = var14_11 * 0.0;
                                                                                        ** while (true)
                                                                                    }
                                                                                    var17_13 = 0;
                                                                                    ** while (true)
                                                                                }
                                                                                ++var8_6;
                                                                                ** while (true)
                                                                            }
                                                                            ++var8_6;
                                                                            ** GOTO lbl451
                                                                        }
                                                                        var62_45 = this.x[var21_17.H[var17_13].a];
                                                                        var8_6 = var17_13;
                                                                        ** while (!((var2_2.b - var62_45.b) * (var2_2.b - var62_45.b) + (var2_2.c - var62_45.c) * (var2_2.c - var62_45.c) <= (var2_2.d + var62_45.d) * (var2_2.d + var62_45.d)))
lbl568:
                                                                        // 1 sources

                                                                        --var21_17.C;
                                                                        var21_17.H[var17_13].a(var21_17.H[var21_17.C]);
                                                                        var8_6 = 0;
                                                                        while (true) {
                                                                            if (var8_6 >= var62_45.C) ** continue;
                                                                            if (var62_45.H[var8_6].a == var19_15) {
                                                                                --var62_45.C;
                                                                                var62_45.H[var8_6].a(var62_45.H[var62_45.C]);
                                                                            }
                                                                            ++var8_6;
                                                                        }
                                                                    }
                                                                    if (7 <= var61_44 && var61_44 < 11 && var37_29 != com.saterskog.cell_lab.h.e) {
                                                                        var62_45 = var21_17.U;
                                                                        var17_13 = var61_44 - 7;
                                                                        var62_45[var17_13] = (float)((double)var62_45[var17_13] - 60.0 * this.T);
                                                                    }
                                                                    if (11 <= var61_44 && var61_44 < 15 && var37_29 != com.saterskog.cell_lab.h.e) {
                                                                        var62_45 = var21_17.U;
                                                                        var17_13 = var61_44 - 7 - 4;
                                                                        var62_45[var17_13] = (float)((double)var62_45[var17_13] + 60.0 * this.T);
                                                                    }
                                                                }
                                                                if (var37_29 != com.saterskog.cell_lab.h.o || !(var21_17.p >= 0.2)) break block121;
                                                                var19_15 = var21_17.I[var21_17.D].u[4];
                                                                if (var19_15 == 1 && var18_14 == 0 && (var3_3 != com.saterskog.cell_lab.h.o || var2_2.b(4) != 1)) {
                                                                    var2_2.X = (float)((double)var2_2.X + 60.0 * this.T);
                                                                }
                                                                if (var19_15 == 2 && var3_3 != com.saterskog.cell_lab.h.f && (var3_3 != com.saterskog.cell_lab.h.o || var2_2.b(4) != 2)) {
                                                                    var2_2.Y = (float)((double)var2_2.Y + 0.10000000149011612 * this.T);
                                                                }
                                                                if (var19_15 != 3 || !(var21_17.o > 0.5)) break block154;
                                                                var17_13 = 0;
                                                                block33: while (var17_13 < var2_2.C) {
                                                                    block155: {
                                                                        if (var2_2.H[var17_13].a != -1) break block155;
                                                                        var8_6 = var17_13;
                                                                        if (!((var21_17.b - 0.0) * (var21_17.b - 0.0) + (var21_17.c - 0.0) * (var21_17.c - 0.0) >= (this.e.k - var21_17.d) * (this.e.k - var21_17.d))) ** GOTO lbl604
                                                                        --var2_2.C;
                                                                        var2_2.H[var17_13].a(var2_2.H[var2_2.C]);
                                                                        while (true) {
                                                                            var8_6 = var17_13 - 1;
lbl604:
                                                                            // 4 sources

                                                                            while (true) {
                                                                                var17_13 = var8_6 + 1;
                                                                                continue block33;
                                                                                break;
                                                                            }
                                                                            break;
                                                                        }
                                                                    }
                                                                    var37_31 = this.x[var2_2.H[var17_13].a];
                                                                    var8_6 = var17_13;
                                                                    if (var2_2.H[var17_13].a == var1_1) ** GOTO lbl604
                                                                    var8_6 = var17_13;
                                                                    if (!((var21_17.b - var37_31.b) * (var21_17.b - var37_31.b) + (var21_17.c - var37_31.c) * (var21_17.c - var37_31.c) <= (var21_17.d + var37_31.d) * (var21_17.d + var37_31.d))) ** continue;
                                                                    --var2_2.C;
                                                                    var2_2.H[var17_13].a(var2_2.H[var2_2.C]);
                                                                    var8_6 = 0;
                                                                    while (true) {
                                                                        if (var8_6 >= var37_31.C) ** continue;
                                                                        if (var37_31.H[var8_6].a == var1_1) {
                                                                            --var37_31.C;
                                                                            var37_31.H[var8_6].a(var37_31.H[var37_31.C]);
                                                                        }
                                                                        ++var8_6;
                                                                    }
                                                                }
                                                            }
                                                            if (7 <= var19_15 && var19_15 < 11 && var3_3 != com.saterskog.cell_lab.h.e) {
                                                                var21_17 = var2_2.U;
                                                                var17_13 = var19_15 - 7;
                                                                var21_17[var17_13] = (float)((double)var21_17[var17_13] - 60.0 * this.T);
                                                            }
                                                            if (11 <= var19_15 && var19_15 < 15 && var3_3 != com.saterskog.cell_lab.h.e) {
                                                                var21_17 = var2_2.U;
                                                                var17_13 = var19_15 - 7 - 4;
                                                                var21_17[var17_13] = (float)((double)var21_17[var17_13] + 60.0 * this.T);
                                                            }
                                                        }
                                                        ++var9_7;
                                                        ** GOTO lbl342
                                                    }
                                                    var12_10 = var2_2.b * var2_2.b + var2_2.c * var2_2.c;
                                                    if (!(var12_10 >= (this.e.k - var2_2.d) * (this.e.k - var2_2.d))) ** GOTO lbl676
                                                    var12_10 = Math.sqrt(var12_10);
                                                    var6_5 = var2_2.d;
                                                    var14_11 = Math.sqrt((-var12_10 + var6_5 - this.e.k) * (-var12_10 - var6_5 + this.e.k) * (-var12_10 + var6_5 + this.e.k) * (var12_10 + var6_5 + this.e.k)) / var12_10;
                                                    if (!this.U) break block156;
                                                    if (var2_2.B < 20) break block157;
                                                    com.saterskog.b.a.a("skit: Cell touches too many neighbors (border in this case) (>" + Integer.toString(20) + "), not supposed to normally happen and programmer was lazy enough to not gracefully handle this case.");
                                                }
lbl645:
                                                // 2 sources

                                                while (true) {
                                                    if (this.e.x) ** GOTO lbl676
                                                    var14_11 = 500.0 / var12_10 * var14_11 * var14_11 * 2.0 * (double)var2_2.a(6);
                                                    var2_2.g -= var2_2.b * var14_11;
                                                    var2_2.h -= var14_11 * var2_2.c;
                                                    if (var3_3 != com.saterskog.cell_lab.h.h || var2_2.C >= 5 || var2_2.C >= 20) ** GOTO lbl666
                                                    var16_12 = 0;
lbl652:
                                                    // 2 sources

                                                    while (var16_12 < var2_2.C) {
                                                        if (var2_2.H[var16_12].a != -1) break block135;
                                                        var16_12 = 0;
lbl655:
                                                        // 2 sources

                                                        while (true) {
                                                            if (var16_12 != 0) {
                                                                var21_17 = var2_2.H[var2_2.C];
                                                                var21_17.b = false;
                                                                var21_17.a = -1;
                                                                var21_17.c = Math.atan2(var2_2.c, var2_2.b) - var2_2.k;
                                                                var21_17.e = var2_2.b / var12_10 * (this.e.k + Cell.a * 0.4);
                                                                var21_17.f = var2_2.c / var12_10 * (this.e.k + Cell.a * 0.4);
                                                                var21_17.k = 0.5f;
                                                                var21_17.l = 0.0f;
                                                                ++var2_2.C;
                                                            }
lbl666:
                                                            // 4 sources

                                                            if (var3_3 != com.saterskog.cell_lab.h.r) ** GOTO lbl676
                                                            var16_12 = 0;
lbl668:
                                                            // 2 sources

                                                            while (var16_12 < var2_2.C) {
                                                                if (var2_2.H[var16_12].a != -1) break block136;
                                                                var16_12 = 0;
lbl671:
                                                                // 2 sources

                                                                while (true) {
                                                                    if (var16_12 != 0) {
                                                                        this.aY[this.aX] = var1_1;
                                                                        this.aZ[this.aX] = -1;
                                                                        ++this.aX;
                                                                    }
lbl676:
                                                                    // 6 sources

                                                                    var12_10 = var2_2.d * this.e.g;
                                                                    var12_10 *= 1.0 - 1.0 * this.T * var12_10 * 0.5 / var2_2.w;
                                                                    var2_2.g -= var2_2.e * var12_10;
                                                                    var2_2.h -= var12_10 * var2_2.f;
                                                                    if (this.bg) ** GOTO lbl689
                                                                    var12_10 = this.e.h;
                                                                    var27_22 = this.e.j * var2_2.c / this.e.k;
                                                                    var25_21 = var2_2.h;
                                                                    var14_11 = var2_2.w;
                                                                    if (var2_2.I[var2_2.D].s != com.saterskog.cell_lab.h.g) break block137;
                                                                    var10_8 = var2_2.a(1, 0);
lbl687:
                                                                    // 2 sources

                                                                    while (true) {
                                                                        var2_2.h = var25_21 - ((double)var10_8 - (var27_22 + var12_10)) * var14_11 * this.e.i;
lbl689:
                                                                        // 2 sources

                                                                        var2_2.j -= var2_2.l * var2_2.d * var2_2.d * var2_2.d * this.e.g * 0.5;
                                                                        return;
                                                                    }
                                                                    break;
                                                                }
                                                            }
                                                            break block138;
                                                            break;
                                                        }
                                                    }
                                                    break block139;
                                                    break;
                                                }
                                            }
                                            var4_4 = (var6_5 * var6_5 + (var12_10 * var12_10 - this.e.k * this.e.k)) / (2.0 * var12_10);
                                            var6_5 = (0.0 - var25_21) * var4_4 / var12_10;
                                            var4_4 = var4_4 * (0.0 - var27_22) / var12_10;
                                            var21_17 = var2_2.A[var2_2.B];
                                            ++var2_2.B;
                                            var21_17.c = (0.0 - var27_22) * var14_11 / (2.0 * var12_10) + var6_5;
                                            var21_17.d = var4_4 - (0.0 - var25_21) * var14_11 / (2.0 * var12_10);
                                            var21_17.a = var6_5 - (0.0 - var27_22) * var14_11 / (2.0 * var12_10);
                                            var21_17.b = var4_4 + (0.0 - var25_21) * var14_11 / (2.0 * var12_10);
                                            var21_17.g = -1;
                                            var21_17.e = false;
                                            var21_17.f = false;
                                            ** while (true)
                                        }
                                        ++var16_12;
                                        ** GOTO lbl652
                                    }
                                    ++var16_12;
                                    ** GOTO lbl668
                                }
                                var10_8 = 0.0f;
                                ** while (true)
                            }
                            var16_12 = 1;
                            ** while (true)
                        }
                        var16_12 = 1;
                        ** while (true)
                    }
                    var8_6 = 1;
                    ** while (true)
                }
                var17_13 = 1;
                ** while (true)
            }
            var18_14 = var17_13;
            ** while (true)
        }
        var27_22 = var14_11;
        ** while (true)
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private double e(double d2, double d3) {
        double d4 = (this.P * d2 + this.Q * d3) / this.e.k;
        double d5 = this.e.d;
        double d6 = Math.sqrt(d2 * d2 + d3 * d3);
        double d7 = 1.0 + (1.0 - this.e.f) * (1.0 - d6 / this.e.k) / this.e.f;
        if (!((d4 * (1.0 - this.e.f) + this.e.f) * d5 / (d7 * d7) < 0.0)) return -(this.e.d * (-1.0 + this.e.f) * this.e.f * this.e.f * this.e.k * ((-1.0 + this.e.f) * d6 * d6 * this.Q + this.e.k * d6 * this.Q + 2.0 * d3 * (this.P * d2 + this.Q * d3 + this.e.f * (this.e.k - this.P * d2 - this.Q * d3))) / (d6 * Math.pow((-1.0 + this.e.f) * d6 + this.e.k, 3.0)));
        return 0.0;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    private void e(double var1_1) {
        var3_2 = 0;
        block0: while (true) {
            if (var3_2 >= this.z) return;
            var4_3 = this.x[var3_2];
            var5_4 = var4_3.w;
            if (var4_3.I[var4_3.D].s == com.saterskog.cell_lab.h.e) {
                var5_4 = 0.072 + (var4_3.w + (double)var4_3.S - 0.072) / 2.088 * 0.288;
            }
            var7_5 = var3_2;
            if (!(var5_4 > (double)var4_3.I[var4_3.D].b)) ** GOTO lbl259
            var7_5 = var3_2;
            if (!(var4_3.o > 0.5)) ** GOTO lbl259
            var7_5 = var3_2;
            if (var4_3.P > var4_3.I[var4_3.D].u[9]) ** GOTO lbl259
            var7_5 = var3_2;
            if (!(var4_3.p > 0.2)) ** GOTO lbl259
            var7_5 = var3_2;
            if (var4_3.x) ** GOTO lbl259
            var7_5 = var3_2;
            if (var4_3.I[var4_3.D].s == com.saterskog.cell_lab.h.q) ** GOTO lbl259
            var7_5 = var3_2;
            if (!this.a((Cell)null)) ** GOTO lbl259
            ++this.S;
            var8_6 = this.x[this.z - 1];
            if (!this.bg && this.I) {
                var9_7 = (float)var4_3.b - this.F;
                var10_8 = (float)var4_3.c - this.G;
                var10_8 = var9_7 * var9_7 + var10_8 * var10_8;
                if (this.H < 0.0f || var10_8 < this.H) {
                    this.H = var10_8;
                }
            }
            var4_3.O = 0;
            var8_6.O = 0;
            var8_6.B = 0;
            var8_6.a(var4_3);
            var8_6.F = 0;
            var11_9 = var4_3.k;
            var13_10 = var4_3.I[var4_3.D].d;
            var5_4 = var4_3.y != false ? -1.0 : 1.0;
            var15_11 = var11_9 + var5_4 * var13_10;
            var5_4 = var4_3.d * 0.05 * 2.0;
            var17_12 = Math.cos(var15_11);
            var19_13 = Math.sin(var15_11);
            var4_3.e -= 0.0 * var17_12;
            var4_3.f -= 0.0 * var19_13;
            var4_3.b -= var17_12 * var5_4 + Math.sin((double)this.z * 10.34 + 43.0) * 1.0E-7;
            var4_3.c -= var19_13 * var5_4 + Math.sin((double)this.z * 17.34 + 137.0) * 1.0E-7;
            var8_6.e += 0.0 * var17_12;
            var8_6.f += 0.0 * var19_13;
            var8_6.b += var17_12 * var5_4 + Math.sin((double)this.z * 12.34 + 13.4) * 1.0E-7;
            var13_10 = var8_6.c;
            var8_6.c = var5_4 * var19_13 + Math.sin((double)this.z * 19.34 + 63.0) * 1.0E-7 + var13_10;
            var5_4 = var13_10 = var4_3.w;
            if (var4_3.I[var4_3.D].s == com.saterskog.cell_lab.h.e) {
                var5_4 = var13_10 + (double)var4_3.S;
            }
            var8_6.w = (double)var4_3.I[var4_3.D].c * var5_4 - var4_3.I[var4_3.I[var4_3.D].j].s.v;
            var4_3.w = var5_4 * (double)(1.0f - var4_3.I[var4_3.D].c) - var4_3.I[var4_3.I[var4_3.D].i].s.v;
            var4_3.w -= (double)(Math.max(0.0f, var4_3.I[var4_3.I[var4_3.D].i].v[6] - 1.0f) * 0.054000005f);
            var8_6.w -= (double)(Math.max(0.0f, var4_3.I[var4_3.I[var4_3.D].j].v[6] - 1.0f) * 0.054000005f);
            for (var7_5 = 0; var7_5 < 4; ++var7_5) {
                var10_8 = var4_3.U[var7_5];
                var4_3.U[var7_5] = var4_3.I[var4_3.D].c * var10_8 + 1.0E-4f;
                var8_6.U[var7_5] = var10_8 * (1.0f - var4_3.I[var4_3.D].c) + 1.0E-4f;
            }
            var4_3.S = 0.0f;
            var8_6.S = 0.0f;
            var8_6.X = var4_3.X * (1.0f - var4_3.I[var4_3.D].c);
            var4_3.X *= var4_3.I[var4_3.D].c;
            var8_6.Y = var4_3.Y * (1.0f - var4_3.I[var4_3.D].c);
            var4_3.Y *= var4_3.I[var4_3.D].c;
            var8_6.p = 0.5 * var4_3.p;
            var4_3.p = 0.5 * var4_3.p;
            var8_6.o = 0.0;
            var4_3.o = 0.0;
            var13_10 = var4_3.I[var4_3.D].e;
            var5_4 = var4_3.y != false ? -1.0 : 1.0;
            var4_3.k = var5_4 * var13_10 + var15_11;
            var13_10 = var4_3.I[var4_3.D].f;
            var5_4 = var4_3.y != false ? -1.0 : 1.0;
            var8_6.k = var5_4 * var13_10 + var15_11;
            var21_14 = var4_3.y != var4_3.I[var4_3.D].r;
            var8_6.y = var21_14;
            var21_14 = var4_3.y != var4_3.I[var4_3.D].q;
            var4_3.y = var21_14;
            var4_3.m += 1.0;
            var8_6.m -= 1.0;
            var7_5 = 0;
            while (true) {
                block35: {
                    block36: {
                        block34: {
                            if (var7_5 >= var4_3.C) break block34;
                            if (var4_3.H[var7_5].a == -1) break block35;
                            break block36;
                        }
                        var24_21 = var4_3.C;
                        var4_3.C = 0;
                        var8_6.C = 0;
                        var4_3.x = false;
                        var8_6.x = false;
                        if (var4_3.T != -1) {
                            --var4_3.T;
                            --var8_6.T;
                            if (var4_3.T <= 0) {
                                var4_3.x = true;
                                var8_6.x = true;
                            }
                        }
                        var25_22 = -1;
                        var26_23 = -1.0;
                        var13_10 = 1.0;
                        if (var4_3.I[var4_3.D].m || var4_3.I[var4_3.D].n) {
                            break;
                        }
                        ** GOTO lbl210
                    }
                    for (var22_15 = 0; var22_15 < this.x[var4_3.H[var7_5].a].C; ++var22_15) {
                        if (this.x[var4_3.H[var7_5].a].H[var22_15].a != var3_2) continue;
                        this.x[var4_3.H[var7_5].a].H[var22_15].a(this.x[var4_3.H[var7_5].a].H[this.x[var4_3.H[var7_5].a].C - 1]);
                        var23_17 = this.x[var4_3.H[var7_5].a];
                        --var23_17.C;
                        break;
                    }
                }
                this.J[var7_5].a(var4_3.H[var7_5]);
                ++var7_5;
            }
            var7_5 = 0;
            var28_24 = 1.0;
            var5_4 = -1.0;
            var30_25 = -1;
            var31_26 = -1;
            var22_15 = -1;
            while (true) {
                block40: {
                    block38: {
                        block37: {
                            block39: {
                                if (var7_5 >= var24_21) break block37;
                                var32_27 = var13_10;
                                var34_28 = var5_4;
                                var36_29 = var30_25;
                                var37_30 = var22_15;
                                if (this.J[var7_5].a == -1) break block38;
                                var38_31 = Math.cos(this.J[var7_5].c + var11_9);
                                var40_32 = Math.sin(this.J[var7_5].c + var11_9);
                                var42_33 = var17_12 * var38_31 + var19_13 * var40_32 - 2.0 * (0.5 - (double)var4_3.b().c);
                                var32_27 = var13_10;
                                var34_28 = var5_4;
                                var36_29 = var30_25;
                                var37_30 = var22_15;
                                if (var42_33 > 0.2) break block38;
                                var32_27 = var13_10;
                                var34_28 = var5_4;
                                var36_29 = var30_25;
                                var37_30 = var22_15;
                                if (var42_33 < -0.2) break block38;
                                var42_33 = (this.x[this.J[var7_5].a].b - var4_3.b) * var17_12 + (this.x[this.J[var7_5].a].c - var4_3.c) * var19_13;
                                if (!(var38_31 * -var19_13 + var40_32 * var17_12 > 0.0)) break block39;
                                var40_32 = var5_4;
                                if (var42_33 > var5_4) {
                                    var40_32 = var42_33;
                                    var22_15 = var7_5;
                                }
                                var32_27 = var13_10;
                                var34_28 = var40_32;
                                var36_29 = var30_25;
                                var37_30 = var22_15;
                                if (!(var42_33 < var28_24)) break block38;
                                var28_24 = var40_32;
                                var37_30 = var30_25;
                                var31_26 = var7_5;
                                var5_4 = var13_10;
                                var30_25 = var22_15;
                                var22_15 = var37_30;
                                var13_10 = var42_33;
                                break block40;
                            }
                            var40_32 = var13_10;
                            if (var42_33 < var13_10) {
                                var40_32 = var42_33;
                                var30_25 = var7_5;
                            }
                            var32_27 = var40_32;
                            var34_28 = var5_4;
                            var36_29 = var30_25;
                            var37_30 = var22_15;
                            if (!(var42_33 > var26_23)) break block38;
                            var25_22 = var7_5;
                            var13_10 = var28_24;
                            var28_24 = var5_4;
                            var37_30 = var22_15;
                            var26_23 = var42_33;
                            var5_4 = var40_32;
                            var22_15 = var30_25;
                            var30_25 = var37_30;
                            break block40;
                        }
                        for (var7_5 = 0; var7_5 < var24_21; ++var7_5) {
                            if (this.J[var7_5].a == -1) continue;
                            var5_4 = Math.cos(this.J[var7_5].c + var11_9) * var17_12 + Math.sin(this.J[var7_5].c + var11_9) * var19_13 - 2.0 * (0.5 - (double)var4_3.b().c);
                            if (var4_3.I[var4_3.D].n && (var5_4 > 0.2 || var5_4 > -0.2 && (var7_5 == var22_15 || var7_5 == var25_22)) && var8_6.C < 20 && this.x[this.J[var7_5].a].C < 20) {
                                var8_6.H[var8_6.C].a(this.J[var7_5]);
                                var8_6.H[var8_6.C].c = this.J[var7_5].c + var11_9 - var8_6.k;
                                var8_6.H[var8_6.C].d = this.J[var7_5].d;
                                this.x[this.J[var7_5].a].H[this.x[this.J[var7_5].a].C].a(this.J[var7_5]);
                                this.x[this.J[var7_5].a].H[this.x[this.J[var7_5].a].C].a = this.z - 1;
                                this.x[this.J[var7_5].a].H[this.x[this.J[var7_5].a].C].c = var8_6.H[var8_6.C].d;
                                this.x[this.J[var7_5].a].H[this.x[this.J[var7_5].a].C].d = var8_6.H[var8_6.C].c;
                                var23_18 = this.x[this.J[var7_5].a];
                                ++var23_18.C;
                                ++var8_6.C;
                            }
                            if (!var4_3.I[var4_3.D].m || !(var5_4 < -0.2) && (!(var5_4 < 0.2) || var7_5 != var31_26 && var7_5 != var30_25) || var4_3.C >= 20 || this.x[this.J[var7_5].a].C >= 20) continue;
                            var4_3.H[var4_3.C].a(this.J[var7_5]);
                            var4_3.H[var4_3.C].c = this.J[var7_5].c + var11_9 - var4_3.k;
                            var4_3.H[var4_3.C].d = this.J[var7_5].d;
                            this.x[this.J[var7_5].a].H[this.x[this.J[var7_5].a].C].a(this.J[var7_5]);
                            this.x[this.J[var7_5].a].H[this.x[this.J[var7_5].a].C].a = var3_2;
                            this.x[this.J[var7_5].a].H[this.x[this.J[var7_5].a].C].c = var4_3.H[var4_3.C].d;
                            this.x[this.J[var7_5].a].H[this.x[this.J[var7_5].a].C].d = var4_3.H[var4_3.C].c;
                            var23_19 = this.x[this.J[var7_5].a];
                            ++var23_19.C;
                            ++var4_3.C;
                        }
lbl210:
                        // 2 sources

                        if (var4_3.I[var4_3.D].l && 20 > var4_3.C && 20 > var8_6.C) {
                            var44_34 = var4_3.H[var4_3.C];
                            var23_20 = var8_6.H[var8_6.C];
                            var44_34.b = true;
                            var23_20.b = true;
                            var44_34.a = this.z - 1;
                            var23_20.a = var3_2;
                            var44_34.c = var5_4 = var15_11 - var4_3.k;
                            var23_20.d = var5_4;
                            var23_20.c = var5_4 = 3.141592653589793 + var15_11 - var8_6.k;
                            var44_34.d = var5_4;
                            var44_34.k = var10_8 = var4_3.I[var4_3.D].h;
                            var23_20.k = var10_8;
                            var44_34.l = var10_8 = var4_3.a(5);
                            var23_20.l = var10_8;
                            ++var4_3.C;
                            ++var8_6.C;
                        }
                        var8_6.D = var4_3.I[var4_3.D].j;
                        var4_3.D = var4_3.I[var4_3.D].i;
                        if (var4_3.I[var4_3.D].s == com.saterskog.cell_lab.h.e) {
                            if (var4_3.w > 0.36) {
                                var4_3.S = (float)(var4_3.w - 0.36);
                                var4_3.w = 0.36;
                            }
                        } else if (var4_3.w > 0.36) {
                            var4_3.w = 0.36;
                        }
                        if (var8_6.I[var8_6.D].s == com.saterskog.cell_lab.h.e) {
                            if (var8_6.w > 0.36) {
                                var8_6.S = (float)(var8_6.w - 0.36);
                                var8_6.w = 0.36;
                            }
                        } else if (var8_6.w > 0.36) {
                            var8_6.w = 0.36;
                        }
                        if (var4_3.I[var4_3.D].s == com.saterskog.cell_lab.h.b) {
                            for (var7_5 = 0; var7_5 < var4_3.C; ++var7_5) {
                                if (!(Math.cos(var4_3.H[var7_5].c) < -0.8)) continue;
                                var4_3.x = true;
                            }
                        }
                        if (var8_6.I[var8_6.D].s == com.saterskog.cell_lab.h.b) {
                            for (var7_5 = 0; var7_5 < var8_6.C; ++var7_5) {
                                if (!(Math.cos(var8_6.H[var7_5].c) < -0.8)) continue;
                                var8_6.x = true;
                            }
                        }
                        if (var8_6.w <= 0.0) {
                            this.a(this.z - 1, false);
                        }
                        var7_5 = var3_2;
                        if (var4_3.w <= 0.0) {
                            this.a(var3_2, false);
                            var7_5 = var3_2 - 1;
                        }
lbl259:
                        // 10 sources

                        var4_3.j = 0.0;
                        var4_3.h = 0.0;
                        var4_3.g = 0.0;
                        var4_3.i = -var4_3.q * 0.30000001192092896;
                        if (var4_3.I[var4_3.D].s == com.saterskog.cell_lab.h.b) {
                            var10_8 = var4_3.a(0, 0);
                            var4_3.r = (float)((double)var4_3.r + (double)var10_8 * var1_1);
                            while ((double)var4_3.r * 112.5 > 62.83185307179586) {
                                var4_3.r = (float)((double)var4_3.r - 0.5585053606381855);
                            }
                            if (!this.bg) {
                                var4_3.g += Math.cos(var4_3.k) * (double)var10_8;
                                var4_3.h += Math.sin(var4_3.k) * (double)var10_8;
                            }
                        }
                        var3_2 = var7_5 + 1;
                        continue block0;
                    }
                    var5_4 = var32_27;
                    var13_10 = var28_24;
                    var28_24 = var34_28;
                    var22_15 = var36_29;
                    var30_25 = var37_30;
                }
                ++var7_5;
                var37_30 = var30_25;
                var42_33 = var28_24;
                var28_24 = var13_10;
                var13_10 = var5_4;
                var5_4 = var42_33;
                var30_25 = var22_15;
                var22_15 = var37_30;
            }
            break;
        }
    }

    private void f(double d2) {
        for (int i2 = 0; i2 < this.z; ++i2) {
            Cell cell = this.x[i2];
            if (cell.o > 5.0 * d2) {
                cell.d += (cell.w / 400.0 / cell.d - cell.d) * 0.5 * 10.0 * d2;
                if (cell.d > 0.03) {
                    cell.d = 0.03;
                }
            }
            if (cell.d > 0.03 || cell.d < Cell.a || cell.w < 0.072 || cell.Y > 1.0f) {
                cell.x = true;
            }
            if (cell.F < 100) {
                cell.b += cell.e * d2;
                cell.c += cell.f * d2;
                cell.k += cell.l * d2;
            }
            cell.m += cell.n * d2;
            if (cell.k > Math.PI) {
                cell.k -= Math.PI * 2;
            }
            if (cell.k < -Math.PI) {
                cell.k += Math.PI * 2;
            }
            if (cell.m > Math.PI * 2) {
                cell.m -= Math.PI * 4;
            }
            if (cell.m < Math.PI * -2) {
                cell.m += Math.PI * 4;
            }
            cell.B = 0;
            cell.P = cell.C;
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    private void g() {
        int n2;
        for (n2 = 0; n2 < this.aW.length; ++n2) {
            this.aW[n2] = 0;
        }
        for (n2 = 0; n2 < this.bc.length; ++n2) {
            this.bc[n2] = 0;
        }
        int n3 = this.z;
        n2 = 0;
        while (n2 < n3) {
            int[] arrn;
            Cell cell = this.x[n2];
            int n4 = (int)((this.e.k + cell.b) / (2.0 * this.e.k) * (double)this.bd + 1.0) + (int)((this.e.k + cell.c) / (2.0 * this.e.k) * (double)this.bd + 1.0) * (this.bd + 2);
            int n5 = this.bc[n4];
            if (n5 < 404) {
                this.ba[n4][n5] = n2;
                this.bb[n4][n5] = (short)(false ? 1 : 0);
                arrn = this.bc;
                arrn[n4] = arrn[n4] + 1;
                if (cell.I[cell.D].s == com.saterskog.cell_lab.h.o && cell.p >= 0.2) {
                    if (cell.I[cell.D].u[4] == 0) {
                        this.ba[n4][n5] = -1 - n2;
                        this.bb[n4][n5] = (short)(true ? 1 : 0);
                        arrn = this.bc;
                        arrn[n4] = arrn[n4] + 1;
                    }
                    if (cell.I[cell.D].u[4] == 4) {
                        this.ba[n4][n5] = -1 - n2;
                        this.bb[n4][n5] = (short)2;
                        arrn = this.bc;
                        arrn[n4] = arrn[n4] + 1;
                    }
                    if (cell.I[cell.D].u[4] == 5) {
                        this.ba[n4][n5] = -1 - n2;
                        this.bb[n4][n5] = (short)3;
                        arrn = this.bc;
                        arrn[n4] = arrn[n4] + 1;
                    }
                    if (cell.I[cell.D].u[4] == 6) {
                        this.ba[n4][n5] = -1 - n2;
                        this.bb[n4][n5] = (short)5;
                        arrn = this.bc;
                        arrn[n4] = arrn[n4] + 1;
                    }
                }
            } else {
                com.saterskog.b.a.a("smellGridnMAX exhausted");
            }
            n5 = (int)((this.e.k + cell.b - cell.d) / (2.0 * this.e.k) * (double)this.Z + 1.0);
            cell.K = (int)((this.e.k + cell.c - cell.d) / (2.0 * this.e.k) * (double)this.Z + 1.0) * (this.Z + 2) + n5;
            if (this.aW[cell.K] < 203) {
                this.aV[cell.K][this.aW[cell.K]] = n2;
                arrn = this.aW;
                n4 = cell.K;
                arrn[n4] = arrn[n4] + 1;
            } else {
                com.saterskog.b.a.a("gridnMAX exhausted: 203, " + cell.K);
            }
            n4 = (int)((this.e.k + cell.c + cell.d) / (2.0 * this.e.k) * (double)this.Z + 1.0);
            cell.L = n5 + (this.Z + 2) * n4;
            if (cell.L == cell.K) {
                cell.L = -1;
            } else if (this.aW[cell.L] < 203) {
                this.aV[cell.L][this.aW[cell.L]] = n2;
                arrn = this.aW;
                n5 = cell.L;
                arrn[n5] = arrn[n5] + 1;
            } else {
                com.saterskog.b.a.a("gridnMAX exhausted: 203");
            }
            n5 = (int)((this.e.k + cell.b + cell.d) / (2.0 * this.e.k) * (double)this.Z + 1.0);
            cell.M = n4 * (this.Z + 2) + n5;
            if (cell.M == cell.K || cell.M == cell.L) {
                cell.M = -1;
            } else if (this.aW[cell.M] < 203) {
                this.aV[cell.M][this.aW[cell.M]] = n2;
                arrn = this.aW;
                n4 = cell.M;
                arrn[n4] = arrn[n4] + 1;
            } else {
                com.saterskog.b.a.a("gridnMAX exhausted: 203");
            }
            cell.N = n5 + (int)((this.e.k + cell.c - cell.d) / (2.0 * this.e.k) * (double)this.Z + 1.0) * (this.Z + 2);
            if (cell.N == cell.K || cell.N == cell.L || cell.N == cell.M) {
                cell.N = -1;
            } else if (this.aW[cell.N] < 203) {
                this.aV[cell.N][this.aW[cell.N]] = n2;
                arrn = this.aW;
                n4 = cell.N;
                arrn[n4] = arrn[n4] + 1;
            } else {
                com.saterskog.b.a.a("gridnMAX exhausted: 203");
            }
            ++n2;
        }
        return;
    }

    /*
     * Enabled aggressive block sorting
     */
    private void g(double d2) {
        int n2 = 0;
        while (n2 < this.z) {
            double d3;
            double d4;
            int n3;
            Cell cell = this.x[n2];
            Gene gene = cell.b();
            cell.Q = cell.w;
            cell.Z = cell.X - 0.05f * cell.X * (float)d2;
            cell.Y = (float)((double)cell.Y + (double)((Math.min(cell.X, 10.0f) - cell.Y) * 0.05f) * d2);
            cell.R = cell.p;
            if (cell.p < this.e.z) {
                cell.R += 1.2 * (this.e.z - cell.p) * d2;
            }
            if (this.bg && gene.s.s) {
                cell.Q += 280.0 * cell.d * cell.d * d2;
            }
            Environment environment = this.e;
            Object object = cell.b();
            Object object2 = ((Gene)object).s;
            cell.o += d2;
            switch (Cell.2.a[object2.ordinal()]) {
                case 1: {
                    float f2 = cell.a(0, 0);
                    cell.Q -= (double)f2 * (0.008 + (double)f2 * 0.0409756) * d2;
                    break;
                }
                case 2: {
                    if (!(cell.o > 0.5)) break;
                    if (cell.a(5, 0) > 0.5f) {
                        cell.D = cell.b(0);
                        object2 = ((Gene)object).s;
                        cell.o = 0.0;
                        break;
                    }
                    if (!(cell.a(6, 0) > 0.5f)) break;
                    cell.D = cell.b(1);
                    object2 = ((Gene)object).s;
                    cell.o = 0.0;
                    break;
                }
                case 3: {
                    if (d2 == 0.0) break;
                    float f2 = cell.a(3, 0);
                    float f3 = cell.a(2, 0);
                    n3 = cell.y ? -1 : 1;
                    f3 = (float)n3 * f3;
                    float f4 = cell.a(4, 0);
                    cell.Q -= (double)8.0E-5f / d2 * (double)((f2 - cell.aa) * (f2 - cell.aa) + (f3 - cell.ab) * (f3 - cell.ab) + (f4 - cell.ac) * (f4 - cell.ac));
                    cell.aa = f2;
                    cell.ab = f3;
                    cell.ac = f4;
                    break;
                }
                case 4: {
                    cell.R = 1.0;
                    break;
                }
                case 5: {
                    cell.Q += 400.0 * this.c(cell.b, cell.c) * cell.d * cell.d * d2;
                }
                case 6: 
                case 7: {
                    cell.n += (cell.l - cell.n) * Math.abs(cell.l - cell.n) * 1.0 * d2;
                    break;
                }
                case 8: {
                    break;
                }
                case 9: {
                    cell.t += (-cell.l * cell.d - cell.t * 100.0 * Math.abs(cell.t)) * d2;
                    d4 = Math.sqrt(cell.u * cell.u + cell.v * cell.v);
                    cell.u += (-cell.e - cell.u * 100.0 * d4) * d2;
                    d3 = cell.v;
                    cell.v = (-cell.f - d4 * (cell.v * 100.0)) * d2 + d3;
                    break;
                }
                case 10: {
                    d4 = (double)cell.a(2, 0) * d2;
                    d3 = (double)cell.a(4, 0) * d2;
                    cell.Q -= (Math.abs(d4) + Math.abs(d3)) * 0.001;
                    cell.r = (float)(d4 * 0.3 + (double)cell.r);
                    cell.s = (float)((double)cell.s + d3 * 0.3);
                    while ((double)cell.r * 112.5 > 62.83185307179586) {
                        cell.r = (float)((double)cell.r - 0.5585053606381855);
                    }
                    while ((double)cell.r * 112.5 < -62.83185307179586) {
                        cell.r = (float)((double)cell.r + 0.5585053606381855);
                    }
                    while ((double)cell.s * 112.5 > 62.83185307179586) {
                        cell.s = (float)((double)cell.s - 0.5585053606381855);
                    }
                    while ((double)cell.s * 112.5 < -62.83185307179586) {
                        cell.s = (float)((double)cell.s + 0.5585053606381855);
                    }
                    break;
                }
                case 11: {
                    if (cell.R > 0.25) {
                        cell.R -= 0.44999999999999996 * d2;
                        if (cell.R < 0.25) {
                            cell.R = 0.25;
                        }
                    }
                    if (!(cell.R >= 0.2)) break;
                    cell.r = (float)((double)cell.r + d2);
                }
            }
            cell.Q -= object2.u * (1.38571428571 - 1.28571428571 * (double)environment.n) * 400.0 * (cell.d + 0.0075) * cell.d * d2;
            if (environment.v && cell.o > 240.0) {
                cell.x = true;
            }
            if (cell.b != cell.b || cell.c != cell.c || cell.w != cell.w) {
                cell.x = true;
            }
            ++cell.O;
            if (cell.O == 15) {
                cell.O = 0;
                if (this.Y.nextDouble() < environment.c * d2 * 40.0 * 15.0 / 3.0) {
                    for (n3 = 0; n3 < 3; ++n3) {
                        int n4;
                        int n5;
                        int n6;
                        if (this.Y.nextInt(5) != 0) {
                            ++cell.G;
                            Gene gene2 = cell.I[this.Y.nextInt(80)];
                            object = this.Y;
                            boolean bl = environment.u;
                            n6 = ((Random)object).nextInt(3054);
                            switch (n6) {
                                case 0: {
                                    for (n5 = 0; n5 < 3; ++n5) {
                                        object2 = gene2.a;
                                        object2[n5] = (h)((float)((double)object2[n5] + ((Random)object).nextGaussian() * 0.15));
                                        if (gene2.a[n5] < 0.0f) {
                                            gene2.a[n5] = 0.0f;
                                        }
                                        if (!(gene2.a[n5] > 1.0f)) continue;
                                        gene2.a[n5] = 1.0f;
                                    }
                                    break;
                                }
                                case 1: {
                                    gene2.d = (float)((double)gene2.d + ((Random)object).nextGaussian());
                                    while (gene2.d < 0.0f) {
                                        gene2.d = (float)((double)gene2.d + Math.PI * 2);
                                    }
                                    while ((double)gene2.d > Math.PI * 2) {
                                        gene2.d = (float)((double)gene2.d - Math.PI * 2);
                                    }
                                    break;
                                }
                                case 2: {
                                    gene2.e = (float)((double)gene2.e + ((Random)object).nextGaussian());
                                    while (gene2.e < 0.0f) {
                                        gene2.e = (float)((double)gene2.e + Math.PI * 2);
                                    }
                                    while ((double)gene2.e > Math.PI * 2) {
                                        gene2.e = (float)((double)gene2.e - Math.PI * 2);
                                    }
                                    break;
                                }
                                case 3: {
                                    gene2.f = (float)((double)gene2.f + ((Random)object).nextGaussian());
                                    while (gene2.f < 0.0f) {
                                        gene2.f = (float)((double)gene2.f + Math.PI * 2);
                                    }
                                    while ((double)gene2.f > Math.PI * 2) {
                                        gene2.f = (float)((double)gene2.f - Math.PI * 2);
                                    }
                                    break;
                                }
                                case 4: {
                                    gene2.g = (float)((double)gene2.g * Math.exp(((Random)object).nextGaussian() / 2.0));
                                    if (gene2.g > 10.0f) {
                                        gene2.g = 10.0f;
                                    }
                                    if (!(gene2.g < 0.1f)) break;
                                    gene2.g = 0.1f;
                                    break;
                                }
                                case 5: {
                                    gene2.b = (float)((double)gene2.b * Math.exp(((Random)object).nextGaussian() / 2.0));
                                    if (gene2.b > 0.3672f) {
                                        gene2.b = 0.3672f;
                                    }
                                    if (!(gene2.b < 0.0648f)) break;
                                    gene2.b = 0.0648f;
                                    break;
                                }
                                case 6: {
                                    gene2.c = (float)((double)gene2.c + ((Random)object).nextGaussian() * 0.2);
                                    if (gene2.c < 0.1f) {
                                        gene2.c = 0.1f;
                                    }
                                    if (!(gene2.c > 0.9f)) break;
                                    gene2.c = 0.9f;
                                    break;
                                }
                                case 7: {
                                    if (bl) break;
                                    gene2.i = ((Random)object).nextInt(80);
                                    break;
                                }
                                case 8: {
                                    if (bl) break;
                                    gene2.j = ((Random)object).nextInt(80);
                                    break;
                                }
                                case 9: {
                                    if (bl) break;
                                    boolean bl2 = !gene2.l;
                                    gene2.l = bl2;
                                    break;
                                }
                                case 10: {
                                    if (bl) break;
                                    boolean bl2 = !gene2.m;
                                    gene2.m = bl2;
                                    break;
                                }
                                case 11: {
                                    if (bl) break;
                                    boolean bl2 = !gene2.n;
                                    gene2.n = bl2;
                                    break;
                                }
                                case 12: {
                                    if (bl) break;
                                    do {
                                        gene2.s = com.saterskog.cell_lab.h.B[((Random)object).nextInt(com.saterskog.cell_lab.h.B.length)];
                                    } while (!environment.t[gene2.s.ordinal()]);
                                    break;
                                }
                                case 14: {
                                    boolean bl2 = !gene2.o;
                                    gene2.o = bl2;
                                    break;
                                }
                                case 18: {
                                    boolean bl2 = !gene2.q;
                                    gene2.q = bl2;
                                    break;
                                }
                                case 19: {
                                    boolean bl2 = !gene2.r;
                                    gene2.r = bl2;
                                    break;
                                }
                                case 20: {
                                    gene2.h = Gene.a(0.0f, 35.0f, gene2.h, (d)object);
                                    break;
                                }
                            }
                            if (n6 >= 22 && n6 < 33) {
                                n5 = n6 - 22;
                                if (!bl && n5 != 10) {
                                    gene2.u[n5] = ((Random)object).nextInt(Gene.w[n5]);
                                }
                            }
                            if (n6 >= 33 && n6 < 44 && !bl) {
                                gene2.t[n6 - 33].d = (short)((Random)object).nextInt(8);
                            }
                            if (n6 >= 44 && n6 < 55 && !bl) {
                                gene2.t[n6 - 44].e = (short)((Random)object).nextInt(3);
                            }
                            if (n6 >= 55 && n6 < 66) {
                                n5 = n6 - 55;
                                gene2.t[n5].a = Gene.a(-8.0f, 8.0f, gene2.t[n5].a, (d)object);
                            }
                            if (n6 >= 66 && n6 < 77) {
                                n5 = n6 - 66;
                                gene2.t[n5].b = Gene.a(-8.0f, 8.0f, gene2.t[n5].b, (d)object);
                            }
                            if (n6 >= 77 && n6 < 88) {
                                n5 = n6 - 77;
                                gene2.t[n5].c = Gene.a(-8.0f, 8.0f, gene2.t[n5].c, (d)object);
                            }
                            if (n6 < 88 || n6 >= 3054) continue;
                            n5 = n6 - 88;
                            gene2.v[n5] = Gene.a(Gene.z[n5], Gene.A[n5], gene2.v[n5], (d)object);
                            continue;
                        }
                        if (environment.u) continue;
                        ++cell.G;
                        n6 = n5 = this.Y.nextInt(80);
                        while (n5 == n6) {
                            n6 = this.Y.nextInt(80);
                        }
                        int n7 = this.Y.nextInt(3);
                        if (n7 == 0) {
                            if (this.Y.nextInt(2) == 0) {
                                cell.I[n6].a(cell.I[cell.I[n5].i]);
                                cell.I[n5].i = n6;
                            } else {
                                cell.I[n6].a(cell.I[cell.I[n5].j]);
                                cell.I[n5].j = n6;
                            }
                        }
                        if (n7 == 1) {
                            cell.I[n6].l = true;
                            if (this.Y.nextInt(2) == 0) {
                                cell.I[n6].i = cell.I[n5].i;
                                cell.I[n6].j = cell.I[n5].i;
                                cell.I[n5].i = n6;
                            } else {
                                cell.I[n6].i = cell.I[n5].j;
                                cell.I[n6].j = cell.I[n5].j;
                                cell.I[n5].j = n6;
                            }
                        }
                        if (n7 != 2) continue;
                        n7 = n5;
                        while (n7 == n5 || n7 == n6) {
                            n7 = this.Y.nextInt(80);
                        }
                        if (this.Y.nextInt(2) == 0) {
                            n4 = cell.I[n5].j;
                            cell.I[n5].j = n6;
                            if (this.Y.nextInt(2) == 0) {
                                cell.I[n6].i = n7;
                                cell.I[n6].j = n4;
                                continue;
                            }
                            cell.I[n6].i = n4;
                            cell.I[n6].j = n7;
                            continue;
                        }
                        n4 = cell.I[n5].i;
                        cell.I[n5].i = n6;
                        if (this.Y.nextInt(2) == 0) {
                            cell.I[n6].i = n7;
                            cell.I[n6].j = n4;
                            continue;
                        }
                        cell.I[n6].i = n4;
                        cell.I[n6].j = n7;
                    }
                }
            }
            for (n3 = 0; n3 < 3; ++n3) {
                object2 = cell.J;
                object2[n3] = (h)((float)((double)object2[n3] + (double)(cell.I[cell.D].a[n3] - cell.J[n3]) * 8.0 * d2));
            }
            double d5 = cell.a();
            d3 = d4 = (double)gene.g;
            if ((double)gene.b > 0.36) {
                d3 = d4;
                if (d5 > 0.34559999999999996) {
                    d3 = 0.0;
                }
            }
            d4 = d3;
            if (gene.o) {
                d4 = d3;
                if (cell.w < 0.0936) {
                    d4 = d3 + 462.96296296296276 * (0.0936 - cell.w);
                }
            }
            for (n3 = 0; n3 < cell.C; ++n3) {
                if (cell.H[n3].a == -1) continue;
                object2 = this.x[cell.H[n3].a];
                double d6 = object2.I[object2.D].g;
                double d7 = ((Cell)object2).a();
                d3 = d6;
                if ((double)object2.I[object2.D].b > 0.36) {
                    d3 = d6;
                    if (d7 > 0.34559999999999996) {
                        d3 = 0.0;
                    }
                }
                d6 = d3;
                if (object2.I[object2.D].o) {
                    d6 = d3;
                    if (((Cell)object2).w < 0.0936) {
                        d6 = d3 + 462.96296296296276 * (0.0936 - ((Cell)object2).w);
                    }
                }
                d3 = d6 = d6 * d5 - d7 * d4;
                if (d6 > 0.1) {
                    d3 = 0.1;
                }
                d6 = d3;
                if (d3 < -0.1) {
                    d6 = -0.1;
                }
                cell.Q -= d6 * d2;
                d3 = d6 = cell.p - ((Cell)object2).p;
                if (d6 > 0.6) {
                    d3 = 0.6;
                }
                d6 = d3;
                if (d3 < -0.6) {
                    d6 = -0.6;
                }
                cell.R -= d6 * d2;
                cell.Z = (float)((double)cell.Z + (double)((((Cell)object2).X - cell.X) * 3.0f) * d2);
            }
            if (gene.s == com.saterskog.cell_lab.h.e) {
                if (cell.Q > 0.36) {
                    cell.S = (float)((double)cell.S + (cell.Q - 0.36));
                    cell.Q = 0.36;
                    if (cell.S > 1.8f) {
                        cell.S = 1.8f;
                    }
                } else if (cell.S > 0.0f) {
                    d3 = Math.min((double)cell.S, 0.36 - cell.Q);
                    cell.Q += d3;
                    cell.S = (float)((double)cell.S - d3);
                }
            } else if (cell.Q > 0.36) {
                cell.Q = 0.36;
            }
            if (cell.R > 1.0) {
                cell.R = 1.0;
            }
            if (cell.p < 0.1) {
                cell.x = true;
            }
            ++n2;
        }
        return;
    }

    /*
     * Enabled aggressive block sorting
     */
    private void h() {
        int n2 = 0;
        while (true) {
            double d2;
            double d3;
            double d4;
            double d5;
            double d6;
            double d7;
            double d8;
            double d9;
            double d10;
            double d11;
            Cell cell;
            Cell cell2;
            block15: {
                boolean bl;
                block16: {
                    block13: {
                        block14: {
                            if (n2 >= this.aX) {
                                return;
                            }
                            cell2 = this.x[this.aY[n2]];
                            cell = null;
                            d11 = cell2.b;
                            d10 = cell2.c;
                            d9 = cell2.d;
                            d8 = 0.0;
                            d7 = 0.0;
                            if (this.aZ[n2] == -1) {
                                d6 = Math.sqrt(d11 * d11 + d10 * d10);
                                d5 = this.e.k - d6;
                                d4 = d11 / d6;
                                d3 = d10 / d6;
                                d9 = d5 * d4;
                                d2 = d5 * d3;
                            } else {
                                cell = this.x[this.aZ[n2]];
                                d7 = cell.b;
                                d8 = cell.c;
                                d5 = cell.d;
                                d6 = Math.sqrt((d11 - d7) * (d11 - d7) + (d10 - d8) * (d10 - d8));
                                d5 = (d9 * d9 + (d6 * d6 - d5 * d5)) / (2.0 * d6);
                                d4 = (d7 - d11) / d6;
                                d3 = (d8 - d10) / d6;
                                d9 = d5 * d4;
                                d2 = d5 * d3;
                                d8 = cell.g - (d10 + d2 - d8) * cell.j;
                                d10 = cell.h;
                                d7 = (d11 + d9 - d7) * cell.j + d10;
                            }
                            d8 = cell2.g - d2 * cell2.j - d8;
                            d2 = cell2.h;
                            d10 = d9 * cell2.j + d2 - d7;
                            d11 = d4 * d8 + d3 * d10;
                            d9 = d7 = 0.0;
                            if (cell2.I[cell2.D].s != com.saterskog.cell_lab.h.r) break block13;
                            d2 = Math.cos(cell2.k) * d3 - Math.sin(cell2.k) * d4;
                            if (d2 < -0.2) break block14;
                            d9 = d7;
                            if (!(d2 > 0.2)) break block13;
                        }
                        bl = 0.0 < d2;
                        d9 = bl != cell2.y ? 0.0 + d2 * 0.075 * (double)cell2.a(2, 0) : 0.0 + d2 * 0.075 * (double)cell2.a(4, 0);
                    }
                    d7 = d9;
                    if (this.aZ[n2] == -1) break block15;
                    d7 = d9;
                    if (cell.I[cell.D].s != com.saterskog.cell_lab.h.r) break block15;
                    d7 = Math.cos(cell.k);
                    d2 = Math.sin(cell.k) * d4 + d7 * -d3;
                    if (d2 < -0.2) break block16;
                    d7 = d9;
                    if (!(d2 > 0.2)) break block15;
                }
                bl = 0.0 < d2;
                d7 = bl != cell.y ? d9 + 0.075 * d2 * (double)cell.a(2, 0) : d9 + 0.075 * d2 * (double)cell.a(4, 0);
            }
            double d12 = cell2.w * cell2.d * cell2.d * 0.7;
            d9 = 0.0;
            if (this.aZ[n2] == -1) {
                d2 = 1.0 / (1.0 / cell2.w + 1.0 * (d5 * d5 / d12)) / 0.02 * 0.9;
            } else {
                d9 = cell.w * cell.d * cell.d * 0.7;
                d2 = 1.0 / (1.0 / cell2.w + 1.0 / cell.w + 1.0 * (d5 * d5 / d12 + (d6 - d5) * (d6 - d5) / d9)) / 0.02 * 0.9;
            }
            d8 = -(d8 - d4 * d11 + d3 * d7) * d2;
            d7 = d2 * -(d10 - d3 * d11 - d7 * d4);
            cell2.e += 0.02 * d8 / cell2.w;
            cell2.f += 0.02 * d7 / cell2.w;
            cell2.l += 1.0 * d5 * (-d8 * d3 + d7 * d4) * 0.02 / d12;
            if (this.aZ[n2] != -1) {
                cell.e -= 0.02 * d8 / cell.w;
                cell.f -= 0.02 * d7 / cell.w;
                d2 = cell.l;
                cell.l = (d6 - d5) * 1.0 * (-d8 * d3 + d7 * d4) * 0.02 / d9 + d2;
            }
            ++n2;
        }
    }

    private void h(double d2) {
        int n2 = 0;
        while (n2 < this.C) {
            e e2 = this.y[n2];
            e2.d += 0.5 * d2;
            double d3 = this.y[n2].c / 0.03;
            int n3 = n2;
            if (this.y[n2].d > d3 * (1.0 * d3)) {
                e e3 = this.y[n2];
                e2 = this.y[this.C - 1];
                e3.a = e2.a;
                e3.b = e2.b;
                e3.c = e2.c;
                e3.d = e2.d;
                e3.e[0] = e2.e[0];
                e3.e[1] = e2.e[1];
                e3.e[2] = e2.e[2];
                e3.e[3] = e2.e[3];
                --this.C;
                n3 = n2 - 1;
            }
            n2 = n3 + 1;
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    private void i() {
        int n2 = 0;
        block0: while (n2 < this.z) {
            Cell cell = this.x[n2];
            cell.B = 0;
            int n3 = 0;
            while (true) {
                block25: {
                    int n4;
                    int n5;
                    block26: {
                        block24: {
                            if (n3 >= 4) break block24;
                            n5 = -1;
                            if (n3 == 0) {
                                n5 = cell.K;
                            }
                            if (n3 == 1) {
                                n5 = cell.L;
                            }
                            if (n3 == 2) {
                                n5 = cell.M;
                            }
                            if ((n4 = n3 == 3 ? cell.N : n5) == -1) break block25;
                            break block26;
                        }
                        ++n2;
                        continue block0;
                    }
                    for (int i2 = 0; i2 < this.aW[n4]; ++i2) {
                        Cell cell2;
                        n5 = this.aV[n4][i2];
                        if (n5 <= n2) continue;
                        Cell cell3 = this.x[n5];
                        double d2 = (cell.b - cell3.b) * (cell.b - cell3.b) + (cell.c - cell3.c) * (cell.c - cell3.c);
                        double d3 = cell.d;
                        double d4 = cell3.d;
                        double d5 = d3 + d4;
                        if (!(d2 < d5 * d5) || d2 == 0.0) continue;
                        if ((d4 = d3 * d3 - d4 * d4) > d2) {
                            cell3.x = true;
                        }
                        if (-d4 > d2) {
                            cell.x = true;
                        }
                        int n6 = 0;
                        Cell cell4 = null;
                        Cell cell5 = cell2 = null;
                        Cell cell6 = cell4;
                        n5 = n6;
                        if (d4 > d2 - Cell.a * Cell.a * 0.01) {
                            cell5 = cell2;
                            cell6 = cell4;
                            n5 = n6;
                            if (cell.I[cell.D].s == com.saterskog.cell_lab.h.q) {
                                cell5 = cell2;
                                cell6 = cell4;
                                n5 = n6;
                                if (cell3.I[cell3.D].s == com.saterskog.cell_lab.h.q) {
                                    cell5 = cell2;
                                    cell6 = cell4;
                                    n5 = n6;
                                    if (cell.o > 0.5) {
                                        cell5 = cell2;
                                        cell6 = cell4;
                                        n5 = n6;
                                        if (cell3.o > 0.5) {
                                            if (d4 > d2 || this.Y.nextInt(2) == 0) {
                                                cell6 = cell3;
                                                n5 = 1;
                                                cell5 = cell;
                                            } else {
                                                cell6 = cell;
                                                n5 = 1;
                                                cell5 = cell3;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        if (-d4 > d2 - Cell.a * Cell.a * 0.01 && cell.I[cell.D].s == com.saterskog.cell_lab.h.q && cell3.I[cell3.D].s == com.saterskog.cell_lab.h.q && cell.o > 0.5 && cell3.o > 0.5) {
                            n5 = 1;
                            if (-d4 > d2 || this.Y.nextInt(2) == 0) {
                                cell6 = cell;
                            } else {
                                cell6 = cell3;
                                cell3 = cell;
                            }
                        } else {
                            cell3 = cell5;
                        }
                        if (n5 == 0) continue;
                        cell6.x = true;
                        cell3.o = 0.0;
                        cell3.w += cell6.w;
                        cell6.w = 0.0;
                        cell3.T = Gene.B[cell3.b(10)];
                        cell3.p += cell6.p;
                        cell3.D = cell3.b(0);
                        if (cell6.E != cell3.E) {
                            cell3.E = 6;
                        }
                        if (cell3.w > 0.36) {
                            cell3.w = 0.36;
                        }
                        if (cell3.p > 1.0) {
                            cell3.p = 1.0;
                        }
                        for (n5 = 0; n5 < 80; ++n5) {
                            if (this.Y.nextInt(2) != 1) continue;
                            cell3.I[n5].a(cell6.I[n5]);
                        }
                    }
                }
                ++n3;
            }
            break;
        }
        return;
    }

    private void i(double d2) {
        int n2 = this.Y.a(this.e.a * this.e.k * this.e.k / this.e.b / (1.0 + this.e.p) * d2);
        for (int i2 = 0; i2 < n2; ++i2) {
            double d3;
            while ((d3 = this.Y.b() * this.e.k) * d3 + (d2 = this.Y.b() * this.e.k) * d2 > this.e.k * this.e.k) {
            }
            int n3 = 1;
            if (this.e.p > 0.0) {
                n3 = this.Y.a(1.0 + this.e.p);
            }
            for (int i3 = 0; i3 < n3; ++i3) {
                this.a(this.Y.nextGaussian() * this.e.q + d3, this.Y.nextGaussian() * this.e.q + d2, this.e.b, this.e.o);
            }
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    private void j() {
        int n2 = 0;
        while (n2 < this.z) {
            boolean bl;
            Cell cell = this.x[n2];
            if (cell.b * cell.b + cell.c * cell.c >= this.e.k * this.e.k) {
                cell.x = true;
                bl = true;
            } else {
                bl = false;
            }
            int n3 = n2;
            if (cell.x) {
                boolean bl2 = !bl && !this.bg;
                this.a(n2, bl2);
                n3 = n2 - 1;
            }
            n2 = n3 + 1;
        }
        return;
    }

    /*
     * Enabled aggressive block sorting
     */
    private void k() {
        double d2;
        double d3;
        boolean bl = false;
        if (!this.e.w) return;
        boolean[] arrbl = this.e.t;
        int n2 = arrbl.length;
        int n3 = 0;
        while (true) {
            block7: {
                boolean bl2;
                block6: {
                    bl2 = bl;
                    if (n3 >= n2) break block6;
                    if (!arrbl[n3]) break block7;
                    bl2 = true;
                }
                if (bl2) break;
                return;
            }
            ++n3;
        }
        while (this.z < this.ab) {
            while ((d3 = this.Y.b() * this.e.k) * d3 + (d2 = this.Y.b() * this.e.k) * d2 > this.e.k * this.e.k) {
            }
            this.b(d3, d2);
        }
        if (this.Y.nextInt(15) != 0) return;
        while ((d3 = this.Y.b() * this.e.k) * d3 + (d2 = this.Y.b() * this.e.k) * d2 > this.e.k * this.e.k) {
        }
        this.b(d3, d2);
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    private void l() {
        block9: {
            if (!this.L) {
                com.saterskog.b.a.b("ctdextras:Tried to construct primitives for not yet calculated geometry");
                return;
            }
            var1_1 = com.saterskog.cell_lab.h.B.length;
            var2_2 = this.bg != false ? 1 : 0;
            var3_3 = var1_1 + var2_2;
            var2_2 = this.aw[var3_3 - 1];
            var2_2 = this.av[var3_3 - 1] + var2_2;
            var4_4 = 0;
            block0: while (var4_4 < var1_1) {
                block11: {
                    block10: {
                        var5_5 = this.D[var4_4];
                        var6_6 = com.saterskog.cell_lab.h.B[var4_4];
                        if (var6_6.y != -1) break block10;
                        this.aw[var3_3 + var4_4] = var2_2;
                        this.av[var3_3 + var4_4] = 0;
                        break block11;
                    }
                    this.aw[var3_3 + var4_4] = var2_2;
                    if (!var6_6.t) break block9;
                    var7_7 = 1.0 / (var6_6.A * 33.333333333333336);
                    var9_8 = Math.sqrt(1.0 - var7_7 * var7_7);
                    var11_9 = 0;
                    while (true) {
                        var12_10 = var2_2;
                        if (var11_9 < this.E[var4_4]) {
                            var12_10 = var5_5[var11_9];
                            var13_11 = this.x[var12_10];
                            var14_12 = var13_11.J[0] + var13_11.X * 0.1f;
                            var15_13 = var13_11.J[1] + var13_11.Y;
                            var16_14 = var13_11.J[2];
                            var17_15 = Math.sin(var13_11.k) * var13_11.d;
                            var19_16 = Math.cos(var13_11.k) * var13_11.d;
                            this.ad[var2_2 * 2] = (float)(-var17_15 * var9_8 - var19_16 * var7_7);
                            this.ad[var2_2 * 2 + 1] = (float)(var19_16 * var9_8 - var17_15 * var7_7);
                            this.ad[var2_2 * 2 + 2] = (float)(var17_15 * var9_8 - var19_16 * var7_7);
                            this.ad[var2_2 * 2 + 3] = (float)(-var19_16 * var9_8 - var17_15 * var7_7);
                            this.ad[var2_2 * 2 + 4] = (float)(var19_16 * -var6_6.A * 33.333333333333336);
                            this.ad[var2_2 * 2 + 5] = (float)(var17_15 * -var6_6.A * 33.333333333333336);
                            var21_17 = var13_11.r;
                            this.ae[var2_2 * 4] = (float)var7_7;
                            this.ae[var2_2 * 4 + 1] = (float)var9_8;
                            this.ae[var2_2 * 4 + 2] = var21_17;
                            this.ae[var2_2 * 4 + 3] = 0.0f;
                            this.ae[var2_2 * 4 + 4] = (float)var7_7;
                            this.ae[var2_2 * 4 + 5] = (float)(-var9_8);
                            this.ae[var2_2 * 4 + 6] = var21_17;
                            this.ae[var2_2 * 4 + 7] = 0.0f;
                            this.ae[var2_2 * 4 + 8] = (float)(var6_6.A * 33.333333333333336);
                            this.ae[var2_2 * 4 + 9] = 0.0f;
                            this.ae[var2_2 * 4 + 10] = var21_17;
                            this.ae[var2_2 * 4 + 11] = 0.0f;
                            this.ag[var2_2 * 4] = var14_12;
                            this.ag[var2_2 * 4 + 1] = var15_13;
                            this.ag[var2_2 * 4 + 2] = var16_14;
                            this.ag[var2_2 * 4 + 3] = (float)var13_11.d;
                            this.ag[var2_2 * 4 + 4] = var14_12;
                            this.ag[var2_2 * 4 + 5] = var15_13;
                            this.ag[var2_2 * 4 + 6] = var16_14;
                            this.ag[var2_2 * 4 + 7] = (float)var13_11.d;
                            this.ag[var2_2 * 4 + 8] = var14_12;
                            this.ag[var2_2 * 4 + 9] = var15_13;
                            this.ag[var2_2 * 4 + 10] = var16_14;
                            this.ag[var2_2 * 4 + 11] = (float)var13_11.d;
                            this.af[var2_2 * 4] = (float)var13_11.b;
                            this.af[var2_2 * 4 + 1] = (float)var13_11.c;
                            this.af[var2_2 * 4 + 2] = 0.0f;
                            this.af[var2_2 * 4 + 3] = 0.0f;
                            this.af[var2_2 * 4 + 4] = (float)var13_11.b;
                            this.af[var2_2 * 4 + 5] = (float)var13_11.c;
                            this.af[var2_2 * 4 + 6] = 0.0f;
                            this.af[var2_2 * 4 + 7] = 0.0f;
                            this.af[var2_2 * 4 + 8] = (float)var13_11.b;
                            this.af[var2_2 * 4 + 9] = (float)var13_11.c;
                            this.af[var2_2 * 4 + 10] = 0.0f;
                            this.af[var2_2 * 4 + 11] = 0.0f;
                            var2_2 += 3;
                            ++var11_9;
                            continue;
                        }
                        ** GOTO lbl110
                        break;
                    }
                }
lbl81:
                // 2 sources

                while (true) {
                    ++var4_4;
                    continue block0;
                    break;
                }
            }
            return;
        }
        var11_9 = 0;
        while (true) {
            block14: {
                block13: {
                    block12: {
                        var12_10 = var2_2;
                        if (var11_9 >= this.E[var4_4]) break block12;
                        var12_10 = var5_5[var11_9];
                        var13_11 = this.x[var12_10];
                        var22_18 = var13_11.J[0] + var13_11.X * 0.1f;
                        var23_19 = var13_11.J[1] + var13_11.Y;
                        var24_20 = var13_11.J[2];
                        var25_21 = (float)(Math.cos(var13_11.k) * (var13_11.d + var6_6.A));
                        var26_22 = (float)(Math.sin(var13_11.k) * (var13_11.d + var6_6.A));
                        var27_23 = -var26_22;
                        var16_14 = 0.0f;
                        var21_17 = 0.0f;
                        var15_13 = 0.0f;
                        if (var6_6 == com.saterskog.cell_lab.h.k || var6_6 == com.saterskog.cell_lab.h.l || var6_6 == com.saterskog.cell_lab.h.o) {
                            var16_14 = (float)var13_11.k;
                        }
                        if (var6_6 == com.saterskog.cell_lab.h.h) {
                            var21_17 = (float)var13_11.u;
                            var15_13 = (float)var13_11.v;
                        }
                        if (var6_6 != com.saterskog.cell_lab.h.r) break block13;
                        var15_13 = var13_11.y != false ? var13_11.s : var13_11.r;
                        var21_17 = var13_11.y ? var13_11.r : var13_11.s;
                        break block14;
                    }
                    this.av[var3_3 + var4_4] = var12_10 - this.aw[var3_3 + var4_4];
                    var2_2 = var12_10;
                    ** continue;
                }
                var14_12 = var21_17;
                var21_17 = var15_13;
                var15_13 = var14_12;
            }
            this.ad[var2_2 * 2 + 0] = -var25_21 + var27_23;
            this.ad[var2_2 * 2 + 1] = -var26_22 + var25_21;
            this.ad[var2_2 * 2 + 2] = var25_21 - var27_23;
            this.ad[var2_2 * 2 + 3] = var26_22 - var25_21;
            this.ad[var2_2 * 2 + 4] = var25_21 + var27_23;
            this.ad[var2_2 * 2 + 5] = var26_22 + var25_21;
            this.ad[var2_2 * 2 + 6] = -var25_21 + var27_23;
            this.ad[var2_2 * 2 + 7] = -var26_22 + var25_21;
            this.ad[var2_2 * 2 + 8] = -var25_21 - var27_23;
            this.ad[var2_2 * 2 + 9] = -var26_22 - var25_21;
            this.ad[var2_2 * 2 + 10] = var25_21 - var27_23;
            this.ad[var2_2 * 2 + 11] = var26_22 - var25_21;
            this.ae[var2_2 * 4] = -1.0f;
            this.ae[var2_2 * 4 + 1] = 1.0f;
            this.ae[var2_2 * 4 + 2] = var15_13;
            this.ae[var2_2 * 4 + 3] = var21_17;
            this.ae[var2_2 * 4 + 4] = 1.0f;
            this.ae[var2_2 * 4 + 5] = -1.0f;
            this.ae[var2_2 * 4 + 6] = var15_13;
            this.ae[var2_2 * 4 + 7] = var21_17;
            this.ae[var2_2 * 4 + 8] = 1.0f;
            this.ae[var2_2 * 4 + 9] = 1.0f;
            this.ae[var2_2 * 4 + 10] = var15_13;
            this.ae[var2_2 * 4 + 11] = var21_17;
            this.ae[var2_2 * 4 + 12] = -1.0f;
            this.ae[var2_2 * 4 + 13] = 1.0f;
            this.ae[var2_2 * 4 + 14] = var15_13;
            this.ae[var2_2 * 4 + 15] = var21_17;
            this.ae[var2_2 * 4 + 16] = -1.0f;
            this.ae[var2_2 * 4 + 17] = -1.0f;
            this.ae[var2_2 * 4 + 18] = var15_13;
            this.ae[var2_2 * 4 + 19] = var21_17;
            this.ae[var2_2 * 4 + 20] = 1.0f;
            this.ae[var2_2 * 4 + 21] = -1.0f;
            this.ae[var2_2 * 4 + 22] = var15_13;
            this.ae[var2_2 * 4 + 23] = var21_17;
            this.ag[var2_2 * 4] = var22_18;
            this.ag[var2_2 * 4 + 1] = var23_19;
            this.ag[var2_2 * 4 + 2] = var24_20;
            this.ag[var2_2 * 4 + 3] = (float)var13_11.d;
            this.ag[var2_2 * 4 + 4] = var22_18;
            this.ag[var2_2 * 4 + 5] = var23_19;
            this.ag[var2_2 * 4 + 6] = var24_20;
            this.ag[var2_2 * 4 + 7] = (float)var13_11.d;
            this.ag[var2_2 * 4 + 8] = var22_18;
            this.ag[var2_2 * 4 + 9] = var23_19;
            this.ag[var2_2 * 4 + 10] = var24_20;
            this.ag[var2_2 * 4 + 11] = (float)var13_11.d;
            this.ag[var2_2 * 4 + 12] = var22_18;
            this.ag[var2_2 * 4 + 13] = var23_19;
            this.ag[var2_2 * 4 + 14] = var24_20;
            this.ag[var2_2 * 4 + 15] = (float)var13_11.d;
            this.ag[var2_2 * 4 + 16] = var22_18;
            this.ag[var2_2 * 4 + 17] = var23_19;
            this.ag[var2_2 * 4 + 18] = var24_20;
            this.ag[var2_2 * 4 + 19] = (float)var13_11.d;
            this.ag[var2_2 * 4 + 20] = var22_18;
            this.ag[var2_2 * 4 + 21] = var23_19;
            this.ag[var2_2 * 4 + 22] = var24_20;
            this.ag[var2_2 * 4 + 23] = (float)var13_11.d;
            var15_13 = (float)var13_11.t;
            if (var6_6 == com.saterskog.cell_lab.h.o) {
                var15_13 = var13_11.r;
            }
            this.af[var2_2 * 4] = (float)var13_11.b;
            this.af[var2_2 * 4 + 1] = (float)var13_11.c;
            this.af[var2_2 * 4 + 2] = var15_13;
            this.af[var2_2 * 4 + 3] = var16_14;
            this.af[var2_2 * 4 + 4] = (float)var13_11.b;
            this.af[var2_2 * 4 + 5] = (float)var13_11.c;
            this.af[var2_2 * 4 + 6] = var15_13;
            this.af[var2_2 * 4 + 7] = var16_14;
            this.af[var2_2 * 4 + 8] = (float)var13_11.b;
            this.af[var2_2 * 4 + 9] = (float)var13_11.c;
            this.af[var2_2 * 4 + 10] = var15_13;
            this.af[var2_2 * 4 + 11] = var16_14;
            this.af[var2_2 * 4 + 12] = (float)var13_11.b;
            this.af[var2_2 * 4 + 13] = (float)var13_11.c;
            this.af[var2_2 * 4 + 14] = var15_13;
            this.af[var2_2 * 4 + 15] = var16_14;
            this.af[var2_2 * 4 + 16] = (float)var13_11.b;
            this.af[var2_2 * 4 + 17] = (float)var13_11.c;
            this.af[var2_2 * 4 + 18] = var15_13;
            this.af[var2_2 * 4 + 19] = var16_14;
            this.af[var2_2 * 4 + 20] = (float)var13_11.b;
            this.af[var2_2 * 4 + 21] = (float)var13_11.c;
            this.af[var2_2 * 4 + 22] = var15_13;
            this.af[var2_2 * 4 + 23] = var16_14;
            var2_2 += 6;
            ++var11_9;
        }
    }

    public final int a(double d2, double d3) {
        double d4 = 0.009;
        int n2 = -1;
        for (int i2 = 0; i2 < this.z; ++i2) {
            double d5 = (d2 - this.x[i2].b) * (d2 - this.x[i2].b) + (d3 - this.x[i2].c) * (d3 - this.x[i2].c);
            int n3 = n2;
            double d6 = d4;
            if (d5 <= this.x[i2].d * this.x[i2].d) {
                n3 = n2;
                d6 = d4;
                if (d5 < d4) {
                    n3 = i2;
                    d6 = d5;
                }
            }
            n2 = n3;
            d4 = d6;
        }
        return n2;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final int a(int n2) {
        int n3 = 0;
        while (n3 < this.z) {
            if (this.x[n3].F == n2) {
                return n3;
            }
            ++n3;
        }
        return -1;
    }

    /*
     * Enabled aggressive block sorting
     */
    public final int a(InputStream object) {
        int n2;
        Object object2 = new ObjectInputStream((InputStream)object);
        int n3 = ((ObjectInputStream)object2).readInt();
        if (n3 > 3054) {
            throw new RuntimeException("bad cellworld format for load: " + n3 + "!=95");
        }
        this.M = ((ObjectInputStream)object2).readDouble();
        this.z = ((ObjectInputStream)object2).readInt();
        this.e.a((ObjectInputStream)object2);
        object = n3 <= 12 ? object2 : new ObjectInputStream(new GZIPInputStream((InputStream)object, 65536));
        if (n3 > 23) {
            this.O = ((ObjectInputStream)object).readDouble();
        }
        for (n2 = 0; n2 < this.z; ++n2) {
            this.x[n2].a((ObjectInputStream)object);
        }
        this.B = ((ObjectInputStream)object).readInt();
        n2 = 0;
        while (true) {
            if (n2 >= this.B) {
                this.a(true, 0.0);
                this.C = 0;
                this.V = 0;
                this.W = 0;
                return n3;
            }
            object2 = this.A[n2];
            if (n3 >= 8) {
                ((Food)object2).a = ((ObjectInputStream)object).readFloat();
                ((Food)object2).b = ((ObjectInputStream)object).readFloat();
                ((Food)object2).c = ((ObjectInputStream)object).readFloat();
            } else {
                ((Food)object2).a = (float)((ObjectInputStream)object).readDouble();
                ((Food)object2).b = (float)((ObjectInputStream)object).readDouble();
                ((Food)object2).c = (float)((ObjectInputStream)object).readDouble();
            }
            if (n3 >= 22) {
                ((Food)object2).d = ((ObjectInputStream)object).readFloat();
                ((Food)object2).e = ((ObjectInputStream)object).readFloat();
                ((Food)object2).f = ((ObjectInputStream)object).readFloat();
            } else {
                ((Food)object2).d = 0.0f;
                ((Food)object2).e = 0.0f;
                ((Food)object2).f = 0.0f;
            }
            ++n2;
        }
    }

    public final void a() {
        this.z = 0;
        this.B = 0;
        this.M = 0.0;
        this.O = 1.5707963267948966;
    }

    public final void a(double d2) {
        if (this.X != 2) {
            throw new RuntimeException("Tried to run update2 too early");
        }
        d2 = 0.02 * d2;
        this.g(d2);
        com.saterskog.b.a.b();
        this.b(d2);
        this.X = 0;
    }

    /*
     * Enabled aggressive block sorting
     */
    public final void a(double d2, double d3, double d4, float f2) {
        if (this.B >= this.aa) {
            com.saterskog.b.a.a("skit:Maximum number of foods reached (" + Integer.toString(this.aa) + "). This was not supposed to happen, maybe increase CellWorld.MAX_FOODS?");
            return;
        }
        if (!(d2 * d2 + d3 * d3 < this.e.k * this.e.k)) return;
        this.A[this.B].a = (float)d2;
        this.A[this.B].b = (float)d3;
        this.A[this.B].c = (float)d4;
        this.A[this.B].d = 0.0f;
        this.A[this.B].e = 0.0f;
        this.A[this.B].f = f2;
        ++this.B;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    public final void a(float var1_1, float var2_2, float var3_3, float var4_4) {
        block48: {
            com.saterskog.b.a.b();
            if (!this.L) {
                com.saterskog.b.a.b("ctd:Tried to construct primitives for not yet calculated geometry");
                return;
            }
            for (var5_5 = 0; var5_5 < com.saterskog.cell_lab.h.B.length + 1; ++var5_5) {
                this.E[var5_5] = 0;
            }
            for (var5_5 = 0; var5_5 < this.z; ++var5_5) {
                var6_6 /* !! */  = this.x[var5_5];
                if (var6_6 /* !! */ .b < (double)(var1_1 - 0.12f) || var6_6 /* !! */ .b > (double)(var2_2 + 0.12f) || var6_6 /* !! */ .c < (double)(var3_3 - 0.12f) || var6_6 /* !! */ .c > (double)(var4_4 + 0.12f) || var6_6 /* !! */ .x) continue;
                var7_7 = var6_6 /* !! */ .I[var6_6 /* !! */ .D].s.ordinal();
                this.D[var7_7][this.E[var7_7]] = var5_5;
                var6_6 /* !! */  = this.E;
                var6_6 /* !! */ [var7_7] = var6_6 /* !! */ [var7_7] + true;
            }
            if (this.bg) {
                var5_5 = 0;
                while (var5_5 < this.z) {
                    this.D[com.saterskog.cell_lab.h.B.length][this.E[com.saterskog.cell_lab.h.B.length]] = var5_5++;
                    var6_6 /* !! */  = this.E;
                    var7_7 = com.saterskog.cell_lab.h.B.length;
                    var6_6 /* !! */ [var7_7] = var6_6 /* !! */ [var7_7] + true;
                }
            }
            com.saterskog.b.a.b();
            var5_5 = 0;
            var8_8 = 0;
            var9_9 = 0;
            block11: while (true) {
                if (var9_9 >= (var7_7 = this.bg != false ? 1 : 0) + (var10_10 = com.saterskog.cell_lab.h.B.length)) break block48;
                var6_6 /* !! */  = var9_9 < com.saterskog.cell_lab.h.B.length ? com.saterskog.cell_lab.h.B[var9_9] : null;
                this.aw[var9_9] = var5_5;
                if (var6_6 /* !! */  == null || var6_6 /* !! */ .w != -1) break;
                this.av[var9_9] = 0;
lbl34:
                // 2 sources

                while (true) {
                    ++var9_9;
                    continue block11;
                    break;
                }
                break;
            }
            var11_11 /* !! */  = 0;
            this.q[var9_9][0] = var5_5;
            this.r[var9_9][0] = var8_8;
            var12_12 = this.D[var9_9];
            var10_10 = 0;
            var7_7 = var5_5;
            var13_13 = var5_5;
            var5_5 = var8_8;
            var8_8 = var11_11 /* !! */ ;
            block13: while (true) {
                block53: {
                    block50: {
                        block51: {
                            block52: {
                                if (var10_10 >= this.E[var9_9]) break block50;
                                var11_11 /* !! */  = (int)var12_12[var10_10];
                                var14_14 = this.x[var11_11 /* !! */ ];
                                var15_15 = var14_14.b();
                                var11_11 /* !! */  = 0;
                                while (true) {
                                    if (var11_11 /* !! */  >= var14_14.B) break;
                                    for (var16_16 = 1; var16_16 < var14_14.B; ++var16_16) {
                                        var17_17 = (var11_11 /* !! */  + var16_16) % var14_14.B;
                                        if (var14_14.A[var17_17].e) continue;
                                        var18_18 = var14_14.A[var11_11 /* !! */ ].c - var14_14.A[var11_11 /* !! */ ].a;
                                        var20_19 = var14_14.A[var17_17].a - var14_14.A[var17_17].c;
                                        var22_20 = var14_14.A[var11_11 /* !! */ ].d - var14_14.A[var11_11 /* !! */ ].b;
                                        var24_21 = var14_14.A[var17_17].b - var14_14.A[var17_17].d;
                                        var26_22 = var14_14.A[var17_17].a - var14_14.A[var11_11 /* !! */ ].a;
                                        var28_23 = var14_14.A[var17_17].b - var14_14.A[var11_11 /* !! */ ].b;
                                        var30_24 = var18_18 * var24_21 - var20_19 * var22_20;
                                        var32_25 = (var24_21 * var26_22 - var20_19 * var28_23) / var30_24;
                                        var28_23 = (var18_18 * var28_23 + -var22_20 * var26_22) / var30_24;
                                        var18_18 = var14_14.A[var11_11 /* !! */ ].c;
                                        var22_20 = var14_14.A[var17_17].a;
                                        var26_22 = var14_14.A[var11_11 /* !! */ ].d;
                                        var30_24 = var14_14.A[var17_17].b;
                                        if (!(0.0 < var32_25) || !(var32_25 < 1.0) || !(1.0 > var28_23) || !(var28_23 > 0.0)) continue;
                                        if ((var18_18 - var22_20) * var24_21 - var20_19 * (var26_22 - var30_24) < 0.0) {
                                            var34_26 = var14_14.A[var17_17];
                                            var35_27 = var14_14.A[var11_11 /* !! */ ];
                                            var35_27.c = var24_21 = var14_14.A[var11_11 /* !! */ ].a + (var14_14.A[var11_11 /* !! */ ].c - var14_14.A[var11_11 /* !! */ ].a) * var32_25;
                                            var34_26.a = var24_21;
                                            var35_27 = var14_14.A[var17_17];
                                            var34_26 = var14_14.A[var11_11 /* !! */ ];
                                            var34_26.d = var32_25 = var14_14.A[var11_11 /* !! */ ].b + (var14_14.A[var11_11 /* !! */ ].d - var14_14.A[var11_11 /* !! */ ].b) * var32_25;
                                            var35_27.b = var32_25;
                                            var14_14.A[var11_11 /* !! */ ].f = true;
                                        } else {
                                            var35_27 = var14_14.A[var17_17];
                                            var34_26 = var14_14.A[var11_11 /* !! */ ];
                                            var34_26.a = var24_21 = var14_14.A[var11_11 /* !! */ ].a + (var14_14.A[var11_11 /* !! */ ].c - var14_14.A[var11_11 /* !! */ ].a) * var32_25;
                                            var35_27.c = var24_21;
                                            var35_27 = var14_14.A[var17_17];
                                            var34_26 = var14_14.A[var11_11 /* !! */ ];
                                            var34_26.b = var32_25 = var14_14.A[var11_11 /* !! */ ].b + (var14_14.A[var11_11 /* !! */ ].d - var14_14.A[var11_11 /* !! */ ].b) * var32_25;
                                            var35_27.d = var32_25;
                                            var14_14.A[var17_17].f = true;
                                        }
                                        if (var14_14.A[var11_11 /* !! */ ].a * var14_14.A[var11_11 /* !! */ ].d - var14_14.A[var11_11 /* !! */ ].b * var14_14.A[var11_11 /* !! */ ].c < 0.0) {
                                            var14_14.A[var11_11 /* !! */ ].e = true;
                                        }
                                        if (!(var14_14.A[var17_17].a * var14_14.A[var17_17].d - var14_14.A[var17_17].b * var14_14.A[var17_17].c < 0.0)) continue;
                                        var14_14.A[var17_17].e = true;
                                    }
                                    ++var11_11 /* !! */ ;
                                }
                                for (var11_11 /* !! */  = 0; var11_11 /* !! */  < var14_14.B; ++var11_11 /* !! */ ) {
                                    if (var14_14.A[var11_11 /* !! */ ].e) continue;
                                    for (var16_16 = 0; var16_16 < var14_14.B; ++var16_16) {
                                        if (var16_16 == var11_11 /* !! */  || var14_14.A[var11_11 /* !! */ ].a == var14_14.A[var16_16].c && var14_14.A[var11_11 /* !! */ ].b == var14_14.A[var16_16].d || var14_14.A[var11_11 /* !! */ ].c == var14_14.A[var16_16].a && var14_14.A[var11_11 /* !! */ ].d == var14_14.A[var16_16].b) continue;
                                        var24_21 = var14_14.A[var11_11 /* !! */ ].a;
                                        var20_19 = var14_14.A[var16_16].a - var14_14.A[var16_16].c;
                                        var26_22 = var14_14.A[var11_11 /* !! */ ].b;
                                        var32_25 = var14_14.A[var16_16].b - var14_14.A[var16_16].d;
                                        if (!((var32_25 = (var32_25 * (var14_14.A[var16_16].a - 0.0) - var20_19 * (var14_14.A[var16_16].b - 0.0)) / ((var24_21 - 0.0) * var32_25 - (var26_22 - 0.0) * var20_19)) > 0.0) || !(1.0 > var32_25)) continue;
                                        var14_14.A[var11_11 /* !! */ ].e = true;
                                    }
                                }
                                if (var14_14.B > 1) {
                                    if (var14_14.B == 2) {
                                        if (var14_14.A[0].a(var14_14.A[1]) == 1) {
                                            var34_26 = var14_14.A[0];
                                            var14_14.A[0] = var14_14.A[1];
                                            var14_14.A[1] = var34_26;
                                        }
                                    } else {
                                        Arrays.sort(var14_14.A, 0, var14_14.B);
                                    }
                                }
                                var36_28 = var14_14.J[0] + var14_14.X * 0.1f;
                                var37_29 = var14_14.J[1] + var14_14.Y;
                                var38_30 = var14_14.J[2];
                                var16_16 = var8_8;
                                var11_11 /* !! */  = var13_13;
                                if (var7_7 - var13_13 <= 32557) break block51;
                                this.s[var9_9][var8_8] = var7_7 - this.q[var9_9][var8_8];
                                this.t[var9_9][var8_8] = var5_5 - this.r[var9_9][var8_8];
                                if (var8_8 < 201) break block52;
                                com.saterskog.b.a.a("Too many bunches..");
                                break block50;
                            }
                            var16_16 = var8_8 + 1;
                            this.q[var9_9][var16_16] = var7_7;
                            this.r[var9_9][var16_16] = var5_5;
                            var11_11 /* !! */  = var7_7;
                        }
                        var39_31 = 0.0f;
                        var40_32 = 0.0f;
                        var41_33 = (float)var14_14.k;
                        if (var6_6 /* !! */  == null) {
                            var32_25 = var14_14.k;
                            var39_31 = var15_15.d;
                            var8_8 = var14_14.y != false ? -1 : 1;
                            var39_31 = (float)(var32_25 + (double)((float)var8_8 * var39_31));
                            var40_32 = (float)(var14_14.d * 2.0 * (0.5 - (double)var15_15.c));
                        } else {
                            switch (2.a[var6_6 /* !! */ .ordinal()]) {
                                default: {
                                    break;
                                }
                                case 1: {
                                    var39_31 = var14_14.S / 1.8f;
                                    break;
                                }
                                case 2: {
                                    var39_31 = var14_14.r;
                                    break;
                                }
                                case 3: 
                                case 4: {
                                    var40_32 = (float)var14_14.m;
                                    break;
                                }
                                case 5: 
                                case 6: 
                                case 7: {
                                    var39_31 = 0.05f * var14_14.V[0];
                                    var40_32 = var14_14.V[1] * 0.05f;
                                    break;
                                }
                                case 8: {
                                    var39_31 = -var14_14.aa;
                                    var40_32 = var14_14.ab;
                                    break;
                                }
                                case 9: {
                                    var44_36 = Math.max(0.0f, var14_14.a(5, 0) + 0.5f);
                                    var40_32 = Math.max(0.0f, var14_14.a(6, 0) + 0.5f);
                                    var39_31 = var44_36 / (1.0f + var40_32 * var40_32) * 3.1415927f;
                                    var40_32 = var40_32 / (var44_36 * var44_36 + 1.0f) * 3.1415927f;
                                }
                            }
                        }
                        var42_34 = (float)var14_14.b;
                        var43_35 = (float)var14_14.c;
                        var44_36 = (float)var14_14.d;
                        if (var14_14.B != 0) break;
                        this.ad[var7_7 * 2] = var44_36;
                        this.ad[var7_7 * 2 + 1] = var44_36;
                        this.ad[var7_7 * 2 + 2] = var44_36;
                        this.ad[var7_7 * 2 + 3] = -var44_36;
                        this.ad[var7_7 * 2 + 4] = -var44_36;
                        this.ad[var7_7 * 2 + 5] = -var44_36;
                        this.ad[var7_7 * 2 + 6] = -var44_36;
                        this.ad[var7_7 * 2 + 7] = var44_36;
                        this.ae[var7_7 * 4] = var39_31;
                        this.ae[var7_7 * 4 + 1] = 0.0f;
                        this.ae[var7_7 * 4 + 2] = var41_33;
                        this.ae[var7_7 * 4 + 3] = var40_32;
                        this.ae[var7_7 * 4 + 4] = var39_31;
                        this.ae[var7_7 * 4 + 5] = 0.0f;
                        this.ae[var7_7 * 4 + 6] = var41_33;
                        this.ae[var7_7 * 4 + 7] = var40_32;
                        this.ae[var7_7 * 4 + 8] = var39_31;
                        this.ae[var7_7 * 4 + 9] = 0.0f;
                        this.ae[var7_7 * 4 + 10] = var41_33;
                        this.ae[var7_7 * 4 + 11] = var40_32;
                        this.ae[var7_7 * 4 + 12] = var39_31;
                        this.ae[var7_7 * 4 + 13] = 0.0f;
                        this.ae[var7_7 * 4 + 14] = var41_33;
                        this.ae[var7_7 * 4 + 15] = var40_32;
                        this.af[var7_7 * 2 + 0] = var42_34;
                        this.af[var7_7 * 2 + 1] = var43_35;
                        this.af[var7_7 * 2 + 2] = var42_34;
                        this.af[var7_7 * 2 + 3] = var43_35;
                        this.af[var7_7 * 2 + 4] = var42_34;
                        this.af[var7_7 * 2 + 5] = var43_35;
                        this.af[var7_7 * 2 + 6] = var42_34;
                        this.af[var7_7 * 2 + 7] = var43_35;
                        this.ag[var7_7 * 4] = var36_28;
                        this.ag[var7_7 * 4 + 1] = var37_29;
                        this.ag[var7_7 * 4 + 2] = var38_30;
                        this.ag[var7_7 * 4 + 3] = var44_36;
                        this.ag[var7_7 * 4 + 4] = var36_28;
                        this.ag[var7_7 * 4 + 5] = var37_29;
                        this.ag[var7_7 * 4 + 6] = var38_30;
                        this.ag[var7_7 * 4 + 7] = var44_36;
                        this.ag[var7_7 * 4 + 8] = var36_28;
                        this.ag[var7_7 * 4 + 9] = var37_29;
                        this.ag[var7_7 * 4 + 10] = var38_30;
                        this.ag[var7_7 * 4 + 11] = var44_36;
                        this.ag[var7_7 * 4 + 12] = var36_28;
                        this.ag[var7_7 * 4 + 13] = var37_29;
                        this.ag[var7_7 * 4 + 14] = var38_30;
                        this.ag[var7_7 * 4 + 15] = var44_36;
                        var14_14 = this.aq;
                        var8_8 = var5_5 + 1;
                        var14_14[var5_5] = (short)(var7_7 - var11_11 /* !! */  + 0);
                        var14_14 = this.aq;
                        var5_5 = var8_8 + 1;
                        var14_14[var8_8] = (short)(var7_7 - var11_11 /* !! */  + 1);
                        var14_14 = this.aq;
                        var8_8 = var5_5 + 1;
                        var14_14[var5_5] = (short)(var7_7 - var11_11 /* !! */  + 2);
                        var14_14 = this.aq;
                        var5_5 = var8_8 + 1;
                        var14_14[var8_8] = (short)(var7_7 - var11_11 /* !! */  + 0);
                        var14_14 = this.aq;
                        var8_8 = var5_5 + 1;
                        var14_14[var5_5] = (short)(var7_7 - var11_11 /* !! */  + 2);
                        var14_14 = this.aq;
                        var5_5 = var8_8 + 1;
                        var14_14[var8_8] = (short)(var7_7 - var11_11 /* !! */  + 3);
                        var7_7 += 4;
                        break block53;
                    }
                    this.s[var9_9][var8_8] = var7_7 - this.q[var9_9][var8_8];
                    this.t[var9_9][var8_8] = var5_5 - this.r[var9_9][var8_8];
                    this.u[var9_9] = var8_8 + 1;
                    this.av[var9_9] = var7_7 - this.aw[var9_9];
                    var8_8 = var5_5;
                    var5_5 = var7_7;
                    ** continue;
                }
lbl251:
                // 2 sources

                while (true) {
                    ++var10_10;
                    var8_8 = var16_16;
                    var13_13 = var11_11 /* !! */ ;
                    continue block13;
                    break;
                }
                break;
            }
            var45_37 = (short)(var7_7 - var11_11 /* !! */ );
            this.ad[var7_7 * 2] = 0.0f;
            this.ad[var7_7 * 2 + 1] = 0.0f;
            this.ae[var7_7 * 4] = var39_31;
            this.ae[var7_7 * 4 + 1] = 0.0f;
            this.ae[var7_7 * 4 + 2] = var41_33;
            this.ae[var7_7 * 4 + 3] = var40_32;
            this.af[var7_7 * 2 + 0] = var42_34;
            this.af[var7_7 * 2 + 1] = var43_35;
            this.ag[var7_7 * 4] = var36_28;
            this.ag[var7_7 * 4 + 1] = var37_29;
            this.ag[var7_7 * 4 + 2] = var38_30;
            this.ag[var7_7 * 4 + 3] = var44_36;
            var8_8 = var7_7 + 1;
            var13_13 = 0;
            while (true) {
                block49: {
                    block55: {
                        block56: {
                            block54: {
                                if (var13_13 >= var14_14.B) break block54;
                                var7_7 = var8_8;
                                if (var14_14.A[var13_13].e) break block49;
                                this.ad[var8_8 * 2 + 0] = (float)var14_14.A[var13_13].a;
                                this.ad[var8_8 * 2 + 1] = (float)var14_14.A[var13_13].b;
                                this.ae[var8_8 * 4 + 0] = var39_31;
                                this.ae[var8_8 * 4 + 1] = var6_6 /* !! */  == null ? 0.0f : var44_36;
                                this.ae[var8_8 * 4 + 2] = var41_33;
                                this.ae[var8_8 * 4 + 3] = var40_32;
                                this.af[var8_8 * 2 + 0] = var42_34;
                                this.af[var8_8 * 2 + 1] = var43_35;
                                this.ag[var8_8 * 4 + 0] = var36_28;
                                this.ag[var8_8 * 4 + 1] = var37_29;
                                this.ag[var8_8 * 4 + 2] = var38_30;
                                this.ag[var8_8 * 4 + 3] = var44_36;
                                var7_7 = ++var8_8;
                                if (var14_14.A[var13_13].f) break block49;
                                var7_7 = var17_17 = (var13_13 + 1) % var14_14.B;
                                if (var14_14.A[var17_17].e) {
                                    var7_7 = 0;
                                }
                                if (!(var14_14.A[var13_13].c * var14_14.A[var7_7].b - var14_14.A[var7_7].a * var14_14.A[var13_13].d > 0.0)) break block55;
                                this.v[0] = var14_14.A[var13_13].c;
                                this.v[3] = var14_14.A[var7_7].a;
                                this.w[0] = var14_14.A[var13_13].d;
                                this.w[3] = var14_14.A[var7_7].b;
                                var32_25 = this.v[0] + this.v[3];
                                var20_19 = this.w[0] + this.w[3];
                                var24_21 = var14_14.d / Math.sqrt(var32_25 * var32_25 + var20_19 * var20_19);
                                var32_25 *= var24_21;
                                var20_19 *= var24_21;
                                break block56;
                            }
                            for (var7_7 = (int)((short)(var45_37 + 1)); var7_7 < (short)(var8_8 - var11_11 /* !! */  - 1); var7_7 = (int)((short)(var7_7 + 1))) {
                                var14_14 = this.aq;
                                var17_17 = var5_5 + 1;
                                var14_14[var5_5] = var45_37;
                                var14_14 = this.aq;
                                var13_13 = var17_17 + 1;
                                var14_14[var17_17] = (short)var7_7;
                                var14_14 = this.aq;
                                var5_5 = var13_13 + 1;
                                var14_14[var13_13] = (short)(var7_7 + 1);
                            }
                            var14_14 = this.aq;
                            var13_13 = var5_5 + 1;
                            var14_14[var5_5] = var45_37;
                            var14_14 = this.aq;
                            var7_7 = var13_13 + 1;
                            var14_14[var13_13] = (short)(var8_8 - var11_11 /* !! */  - 1);
                            var14_14 = this.aq;
                            var5_5 = var7_7 + 1;
                            var14_14[var7_7] = (short)(var45_37 + 1);
                            var7_7 = var8_8;
                            ** continue;
                        }
                        var24_21 = var14_14.d * var14_14.d / (this.w[0] * var32_25 - this.v[0] * var20_19);
                        this.v[1] = (this.w[0] - var20_19) * var24_21;
                        this.w[1] = -(this.v[0] - var32_25) * var24_21;
                        this.v[2] = -(this.w[3] - var20_19) * var24_21;
                        this.w[2] = (this.v[3] - var32_25) * var24_21;
                        var17_17 = 0;
                        while (true) {
                            var7_7 = ++var8_8;
                            if (var17_17 < 3) {
                                this.ad[var8_8 * 2 + 0] = (float)this.v[var17_17];
                                this.ad[var8_8 * 2 + 1] = (float)this.w[var17_17];
                                this.ae[var8_8 * 4 + 0] = var39_31;
                                this.ae[var8_8 * 4 + 1] = var6_6 /* !! */  == null ? 0.0f : var44_36;
                                this.ae[var8_8 * 4 + 2] = var41_33;
                                this.ae[var8_8 * 4 + 3] = var40_32;
                                this.af[var8_8 * 2 + 0] = var42_34;
                                this.af[var8_8 * 2 + 1] = var43_35;
                                this.ag[var8_8 * 4 + 0] = var36_28;
                                this.ag[var8_8 * 4 + 1] = var37_29;
                                this.ag[var8_8 * 4 + 2] = var38_30;
                                this.ag[var8_8 * 4 + 3] = var44_36;
                                ++var17_17;
                                continue;
                            }
                            break block49;
                            break;
                        }
                    }
                    this.v[0] = var14_14.A[var13_13].c;
                    this.v[4] = var14_14.A[var7_7].a;
                    this.w[0] = var14_14.A[var13_13].d;
                    this.w[4] = var14_14.A[var7_7].b;
                    this.v[2] = this.v[0] + this.v[4];
                    this.w[2] = this.w[0] + this.w[4];
                    var32_25 = -2.0 * var14_14.d / Math.sqrt(this.v[2] * this.v[2] + this.w[2] * this.w[2]);
                    var15_15 = this.v;
                    var15_15[2] = var15_15[2] * var32_25;
                    var15_15 = this.w;
                    var15_15[2] = var32_25 * var15_15[2];
                    var20_19 = this.v[2] * 0.25 + this.w[2] * CellWorld.b;
                    var24_21 = this.w[2] * 0.25 - this.v[2] * CellWorld.b;
                    var32_25 = var14_14.d * var14_14.d / (this.w[0] * var20_19 - this.v[0] * var24_21);
                    this.v[1] = (this.w[0] - var24_21) * var32_25;
                    this.w[1] = (var20_19 - this.v[0]) * var32_25;
                    var24_21 = this.v[2] * 0.25 - this.w[2] * CellWorld.b;
                    var32_25 = this.w[2] * 0.25 + this.v[2] * CellWorld.b;
                    var20_19 = var14_14.d * var14_14.d / (this.w[4] * var24_21 - this.v[4] * var32_25);
                    this.v[3] = (this.w[4] - var32_25) * var20_19;
                    this.w[3] = (var24_21 - this.v[4]) * var20_19;
                    var17_17 = 0;
                    while (true) {
                        var7_7 = ++var8_8;
                        if (var17_17 >= 4) break;
                        this.ad[var8_8 * 2] = (float)this.v[var17_17];
                        this.ad[var8_8 * 2 + 1] = (float)this.w[var17_17];
                        this.ae[var8_8 * 4] = var39_31;
                        this.ae[var8_8 * 4 + 1] = var6_6 /* !! */  == null ? 0.0f : var44_36;
                        this.ae[var8_8 * 4 + 2] = var41_33;
                        this.ae[var8_8 * 4 + 3] = var40_32;
                        this.af[var8_8 * 2] = var42_34;
                        this.af[var8_8 * 2 + 1] = var43_35;
                        this.ag[var8_8 * 4] = var36_28;
                        this.ag[var8_8 * 4 + 1] = var37_29;
                        this.ag[var8_8 * 4 + 2] = var38_30;
                        this.ag[var8_8 * 4 + 3] = var44_36;
                        ++var17_17;
                    }
                }
                ++var13_13;
                var8_8 = var7_7;
            }
        }
        com.saterskog.b.a.b();
        this.ap = 0;
        var5_5 = 0;
        while (true) {
            if (var5_5 >= this.z) {
                com.saterskog.b.a.b();
                this.l();
                com.saterskog.b.a.b();
                this.b(var1_1, var2_2, var3_3, var4_4);
                com.saterskog.b.a.b();
                this.c(var1_1, var2_2, var3_3, var4_4);
                com.saterskog.b.a.b();
                return;
            }
            var12_12 = this.x[var5_5];
            if (!(var12_12.b < (double)(var1_1 - 0.06f) || var12_12.b > (double)(var2_2 + 0.06f) || var12_12.c < (double)(var3_3 - 0.06f) || var12_12.c > (double)(var4_4 + 0.06f) || var12_12.C == 0)) {
                for (var7_7 = 0; var7_7 < var12_12.C; ++var7_7) {
                    var6_6 /* !! */  = var12_12.H[var7_7];
                    if (var6_6 /* !! */ .a > var5_5) continue;
                    for (var8_8 = 0; var8_8 < var12_12.B && var6_6 /* !! */ .a != var12_12.A[var8_8].g; ++var8_8) {
                    }
                    var43_35 = (float)Cell.a * 0.7f;
                    if (var8_8 == var12_12.B) {
                        if (var6_6 /* !! */ .a == -1) {
                            var24_21 = Math.sqrt(var12_12.b * var12_12.b + var12_12.c * var12_12.c);
                            var32_25 = var12_12.b;
                            var32_25 = var6_6 /* !! */ .e * 0.5 + var32_25 * 0.5;
                            var20_19 = var12_12.c;
                            var20_19 = var6_6 /* !! */ .f * 0.5 + var20_19 * 0.5;
                            var24_21 = (double)(0.5f * var43_35) / var24_21;
                            var37_29 = (float)(var12_12.c * var24_21 + var32_25);
                            var38_30 = (float)(var32_25 - var12_12.c * var24_21);
                            var40_32 = (float)(var20_19 - var12_12.b * var24_21);
                            var39_31 = (float)(var24_21 * var12_12.b + var20_19);
                        } else {
                            var14_14 = this.x[var6_6 /* !! */ .a];
                            var24_21 = Math.sqrt((var12_12.b - var14_14.b) * (var12_12.b - var14_14.b) + (var12_12.c - var14_14.c) * (var12_12.c - var14_14.c));
                            var20_19 = (var12_12.d + 0.5 * (var24_21 - var12_12.d - var14_14.d)) / var24_21;
                            var32_25 = var12_12.b * var20_19 + var14_14.b * (1.0 - var20_19);
                            var26_22 = var12_12.c;
                            var20_19 = (1.0 - var20_19) * var14_14.c + var26_22 * var20_19;
                            var24_21 = (double)(0.5f * var43_35) / var24_21;
                            var37_29 = (float)(var32_25 - (var14_14.c - var12_12.c) * var24_21);
                            var38_30 = (float)(var32_25 + (var14_14.c - var12_12.c) * var24_21);
                            var40_32 = (float)((var14_14.b - var12_12.b) * var24_21 + var20_19);
                            var39_31 = (float)(var20_19 - var24_21 * (var14_14.b - var12_12.b));
                        }
                    } else {
                        var14_14 = var12_12.A[var8_8];
                        if (var14_14.e) continue;
                        var44_36 = (float)(var14_14.a + var12_12.b);
                        var42_34 = (float)(var14_14.c + var12_12.b);
                        var41_33 = (float)(var14_14.b + var12_12.c);
                        var36_28 = (float)(var14_14.d + var12_12.c);
                        var46_38 = (var42_34 - var44_36) * (var42_34 - var44_36) + (var36_28 - var41_33) * (var36_28 - var41_33);
                        var39_31 = var36_28;
                        var40_32 = var41_33;
                        var38_30 = var42_34;
                        var37_29 = var44_36;
                        if (var46_38 < var43_35 * var43_35) {
                            var38_30 = (float)Math.sqrt(var46_38);
                            var39_31 = 0.5f * (var44_36 + var42_34);
                            var40_32 = 0.5f * (var41_33 + var36_28);
                            var43_35 /= var38_30;
                            var38_30 = (var42_34 - var39_31) * var43_35 + var39_31;
                            var37_29 = (var44_36 - var39_31) * var43_35 + var39_31;
                            var39_31 = (var36_28 - var40_32) * var43_35 + var40_32;
                            var40_32 = (var41_33 - var40_32) * var43_35 + var40_32;
                        }
                    }
                    this.an[this.ap * 4] = (float)((double)var6_6 /* !! */ .g + var12_12.b);
                    this.an[this.ap * 4 + 1] = (float)((double)var6_6 /* !! */ .h + var12_12.c);
                    this.an[this.ap * 4 + 2] = 0.0f;
                    this.an[this.ap * 4 + 3] = 1.0f;
                    this.an[this.ap * 4 + 4] = var37_29;
                    this.an[this.ap * 4 + 5] = var40_32;
                    this.an[this.ap * 4 + 6] = -1.0f;
                    this.an[this.ap * 4 + 7] = 0.0f;
                    this.an[this.ap * 4 + 8] = var38_30;
                    this.an[this.ap * 4 + 9] = var39_31;
                    this.an[this.ap * 4 + 10] = 1.0f;
                    this.an[this.ap * 4 + 11] = 0.0f;
                    this.ao[this.ap] = (float)(-1.0 + 2.0 * (((double)var6_6 /* !! */ .g + var12_12.b - (double)var37_29) * (double)(var38_30 - var37_29) + ((double)var6_6 /* !! */ .h + var12_12.c - (double)var40_32) * (double)(var39_31 - var40_32)) / (double)((var38_30 - var37_29) * (var38_30 - var37_29) + (var39_31 - var40_32) * (var39_31 - var40_32)));
                    this.ao[this.ap + 1] = -1.0f;
                    this.ao[this.ap + 2] = 1.0f;
                    this.ap += 3;
                    if (var6_6 /* !! */ .a == -1) {
                        this.an[this.ap * 4] = (float)var6_6 /* !! */ .e;
                        this.an[this.ap * 4 + 1] = (float)var6_6 /* !! */ .f;
                        this.an[this.ap * 4 + 2] = 0.0f;
                        this.an[this.ap * 4 + 3] = 1.0f;
                        this.an[this.ap * 4 + 4] = var37_29;
                        this.an[this.ap * 4 + 5] = var40_32;
                        this.an[this.ap * 4 + 6] = -1.0f;
                        this.an[this.ap * 4 + 7] = 0.0f;
                        this.an[this.ap * 4 + 8] = var38_30;
                        this.an[this.ap * 4 + 9] = var39_31;
                        this.an[this.ap * 4 + 10] = 1.0f;
                        this.an[this.ap * 4 + 11] = 0.0f;
                        this.ao[this.ap] = (float)(2.0 * ((var6_6 /* !! */ .e - (double)var37_29) * (double)(var38_30 - var37_29) + (var6_6 /* !! */ .f - (double)var40_32) * (double)(var39_31 - var40_32)) / (double)((var39_31 - var40_32) * (var39_31 - var40_32) + (var38_30 - var37_29) * (var38_30 - var37_29)) - 1.0);
                        this.ao[this.ap + 1] = -1.0f;
                        this.ao[this.ap + 2] = 1.0f;
                    } else {
                        var14_14 = this.x[var6_6 /* !! */ .a];
                        this.an[this.ap * 4] = (float)((double)var6_6 /* !! */ .i + var14_14.b);
                        this.an[this.ap * 4 + 1] = (float)((double)var6_6 /* !! */ .j + var14_14.c);
                        this.an[this.ap * 4 + 2] = 0.0f;
                        this.an[this.ap * 4 + 3] = 1.0f;
                        this.an[this.ap * 4 + 4] = var37_29;
                        this.an[this.ap * 4 + 5] = var40_32;
                        this.an[this.ap * 4 + 6] = -1.0f;
                        this.an[this.ap * 4 + 7] = 0.0f;
                        this.an[this.ap * 4 + 8] = var38_30;
                        this.an[this.ap * 4 + 9] = var39_31;
                        this.an[this.ap * 4 + 10] = 1.0f;
                        this.an[this.ap * 4 + 11] = 0.0f;
                        this.ao[this.ap] = (float)(2.0 * (((double)var6_6 /* !! */ .i + var14_14.b - (double)var37_29) * (double)(var38_30 - var37_29) + ((double)var6_6 /* !! */ .j + var14_14.c - (double)var40_32) * (double)(var39_31 - var40_32)) / (double)((var39_31 - var40_32) * (var39_31 - var40_32) + (var38_30 - var37_29) * (var38_30 - var37_29)) - 1.0);
                        this.ao[this.ap + 1] = -1.0f;
                        this.ao[this.ap + 2] = 1.0f;
                    }
                    this.ap += 3;
                }
            }
            ++var5_5;
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    public final void a(int n2, boolean bl) {
        Cell cell;
        int n3;
        int n4 = 0;
        while (true) {
            if (n4 >= this.x[n2].C) break;
            if (this.x[n2].H[n4].a != -1) {
                for (n3 = 0; n3 < this.x[this.x[n2].H[n4].a].C; ++n3) {
                    if (this.x[this.x[n2].H[n4].a].H[n3].a != n2) continue;
                    this.x[this.x[n2].H[n4].a].H[n3].a(this.x[this.x[n2].H[n4].a].H[this.x[this.x[n2].H[n4].a].C - 1]);
                    cell = this.x[this.x[n2].H[n4].a];
                    --cell.C;
                    break;
                }
            }
            ++n4;
        }
        n4 = 0;
        while (true) {
            block11: {
                block12: {
                    block10: {
                        if (n4 >= this.x[this.z - 1].C) break block10;
                        if (this.x[this.z - 1].H[n4].a == -1) break block11;
                        break block12;
                    }
                    if (bl) {
                        if (this.B >= this.aa) {
                            com.saterskog.b.a.a("Too many pieces of food!!");
                        } else {
                            double d2 = this.x[n2].b;
                            double d3 = this.x[n2].c;
                            double d4 = this.x[n2].w;
                            float f2 = this.x[n2].b().s == com.saterskog.cell_lab.h.e ? 0.5f : 0.0f;
                            this.a(d2, d3, 0.9 * d4, f2);
                        }
                    }
                    if (this.C < this.ac) {
                        cell = this.x[n2];
                        if (cell.b * cell.b + cell.c * cell.c <= this.e.k * this.e.k) {
                            this.y[this.C].a = cell.b;
                            this.y[this.C].b = cell.c;
                            this.y[this.C].c = cell.d;
                            this.y[this.C].d = 0.0;
                            this.y[this.C].e[0] = cell.J[0];
                            this.y[this.C].e[1] = cell.J[1];
                            this.y[this.C].e[2] = cell.J[2];
                            this.y[this.C].e[3] = cell.J[3];
                            ++this.C;
                        }
                    }
                    this.x[n2].a(this.x[this.z - 1]);
                    --this.z;
                    ++this.R;
                    return;
                }
                for (n3 = 0; n3 < this.x[this.x[this.z - 1].H[n4].a].C; ++n3) {
                    if (this.x[this.x[this.z - 1].H[n4].a].H[n3].a != this.z - 1) continue;
                    this.x[this.x[this.z - 1].H[n4].a].H[n3].a = n2;
                    break;
                }
            }
            ++n4;
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    public final void a(Context context) {
        int n2 = com.saterskog.cell_lab.h.B.length;
        int n3 = this.bg ? 1 : 0;
        n2 = n2 * 2 + n3;
        this.au = new int[n2];
        this.ax = new int[n2];
        this.ay = new int[n2];
        this.az = new int[n2];
        this.aA = new int[n2];
        this.aB = new int[n2];
        this.av = new int[n2];
        this.aw = new int[n2];
        this.aQ = new int[n2];
        int n4 = com.saterskog.cell_lab.h.B.length;
        n3 = this.bg ? 1 : 0;
        n4 += n3;
        n3 = 0;
        while (true) {
            block8: {
                block6: {
                    block7: {
                        block5: {
                            if (n3 >= n2) {
                                this.ar = com.saterskog.b.c.a(context, 2131558418, 2131558417);
                                this.aC = GLES20.glGetAttribLocation((int)this.ar, (String)"vPosition");
                                this.aD = GLES20.glGetAttribLocation((int)this.ar, (String)"vCenter");
                                this.aE = GLES20.glGetAttribLocation((int)this.ar, (String)"color");
                                this.aF = GLES20.glGetUniformLocation((int)this.ar, (String)"uMVPMatrix");
                                this.at = com.saterskog.b.c.a(context, 2131558414, 2131558413);
                                this.aG = GLES20.glGetAttribLocation((int)this.at, (String)"vPosition");
                                this.aI = GLES20.glGetAttribLocation((int)this.at, (String)"vCenter");
                                this.aH = GLES20.glGetAttribLocation((int)this.at, (String)"vColor");
                                this.aJ = GLES20.glGetUniformLocation((int)this.at, (String)"uMVPMatrix");
                                this.aT = GLES20.glGetUniformLocation((int)this.at, (String)"tex1");
                                this.aM = com.saterskog.b.c.a(context, 2131558430, 2131558429);
                                this.aN = GLES20.glGetAttribLocation((int)this.aM, (String)"vPosition");
                                this.aO = GLES20.glGetAttribLocation((int)this.aM, (String)"vTP");
                                this.aP = GLES20.glGetUniformLocation((int)this.aM, (String)"uMVPMatrix");
                                this.as = com.saterskog.b.c.a(context, 2131558405, 2131558404);
                                this.aK = GLES20.glGetAttribLocation((int)this.as, (String)"vPosition");
                                this.bi = GLES20.glGetUniformLocation((int)this.as, (String)"radius");
                                this.bh = GLES20.glGetUniformLocation((int)this.as, (String)"dir");
                                this.aL = GLES20.glGetUniformLocation((int)this.as, (String)"uMVPMatrix");
                                this.aR = com.saterskog.b.c.a(context, 2131165286, false);
                                this.aS = com.saterskog.b.c.a(context, 2131165269, true);
                                return;
                            }
                            if (n3 >= com.saterskog.cell_lab.h.B.length) break block5;
                            this.au[n3] = com.saterskog.b.c.a(context, com.saterskog.cell_lab.h.B[n3].w, com.saterskog.cell_lab.h.B[n3].x);
                            break block6;
                        }
                        if (!this.bg || n3 != com.saterskog.cell_lab.h.B.length) break block7;
                        this.au[n3] = com.saterskog.b.c.a(context, 2131558403, 2131558402);
                        break block6;
                    }
                    if (com.saterskog.cell_lab.h.B[n3 - n4].y == -1) break block8;
                    this.au[n3] = com.saterskog.b.c.a(context, com.saterskog.cell_lab.h.B[n3 - n4].y, com.saterskog.cell_lab.h.B[n3 - n4].z);
                }
                GLES20.glUseProgram((int)this.au[n3]);
                this.ax[n3] = GLES20.glGetAttribLocation((int)this.au[n3], (String)"vPosition");
                this.ay[n3] = GLES20.glGetAttribLocation((int)this.au[n3], (String)"vTPosition");
                this.az[n3] = GLES20.glGetAttribLocation((int)this.au[n3], (String)"vCenter");
                this.aA[n3] = GLES20.glGetAttribLocation((int)this.au[n3], (String)"vColor");
                this.aB[n3] = GLES20.glGetUniformLocation((int)this.au[n3], (String)"tex1");
                this.aQ[n3] = GLES20.glGetUniformLocation((int)this.au[n3], (String)"uMVPMatrix");
            }
            ++n3;
        }
    }

    public final void a(boolean bl, double d2) {
        this.b(bl, d2);
        this.a(d2);
    }

    public final void a(float[] arrf) {
        GLES20.glDisable((int)2929);
        GLES20.glDepthMask((boolean)false);
        GLES20.glBlendFunc((int)1, (int)770);
        GLES20.glEnable((int)3042);
        GLES20.glUseProgram((int)this.as);
        GLES20.glEnableVertexAttribArray((int)this.aK);
        GLES20.glVertexAttribPointer((int)this.aK, (int)2, (int)5126, (boolean)false, (int)8, (Buffer)this.k);
        GLES20.glUniformMatrix4fv((int)this.aL, (int)1, (boolean)false, (float[])arrf, (int)0);
        GLES20.glUniform4f((int)this.bh, (float)((float)Math.cos(this.O)), (float)((float)Math.sin(this.O)), (float)((float)this.e.f), (float)((float)this.e.d));
        GLES20.glUniform1f((int)this.bi, (float)((float)this.e.k));
        GLES20.glDrawArrays((int)4, (int)0, (int)6);
        GLES20.glDisableVertexAttribArray((int)this.aK);
        GLES20.glBlendFunc((int)770, (int)771);
        GLES20.glUseProgram((int)this.ar);
        GLES20.glEnableVertexAttribArray((int)this.aC);
        GLES20.glEnableVertexAttribArray((int)this.aD);
        GLES20.glEnableVertexAttribArray((int)this.aE);
        int n2 = 0;
        while (this.be > n2 * 32766) {
            int n3 = n2 * 32766;
            int n4 = Math.min(this.be - n3, 32766);
            this.l.put(this.ah, n3 * 2, n4 * 2);
            this.l.position(0);
            this.m.put(this.ai, n3 * 2, n4 * 2);
            this.m.position(0);
            this.o.put(this.aj, n3 * 4, n4 * 4);
            this.o.position(0);
            GLES20.glVertexAttribPointer((int)this.aC, (int)2, (int)5126, (boolean)false, (int)8, (Buffer)this.l);
            GLES20.glVertexAttribPointer((int)this.aD, (int)2, (int)5126, (boolean)false, (int)8, (Buffer)this.m);
            GLES20.glVertexAttribPointer((int)this.aE, (int)4, (int)5126, (boolean)false, (int)16, (Buffer)this.o);
            GLES20.glUniformMatrix4fv((int)this.aF, (int)1, (boolean)false, (float[])arrf, (int)0);
            GLES20.glDrawArrays((int)4, (int)0, (int)n4);
            ++n2;
        }
        GLES20.glDisableVertexAttribArray((int)this.aC);
        GLES20.glDisableVertexAttribArray((int)this.aD);
        GLES20.glDisableVertexAttribArray((int)this.aE);
        this.c(arrf);
        GLES20.glEnable((int)2929);
        GLES20.glDepthFunc((int)519);
        this.b(arrf);
        GLES20.glDepthMask((boolean)true);
        this.d(arrf);
        GLES20.glEnable((int)2929);
        GLES20.glDepthFunc((int)513);
        GLES20.glDepthMask((boolean)false);
        this.e(arrf);
        GLES20.glDisable((int)3042);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final boolean a(Cell cell) {
        if (this.z >= this.d) return false;
        if (cell != null) {
            if (!(cell.b * cell.b + cell.c * cell.c < this.e.k * this.e.k)) return false;
        }
        if (cell != null) {
            this.x[this.z].a(cell);
        }
        ++this.z;
        return true;
    }

    public final int b(int n2) {
        int n3 = 0;
        for (int i2 = 0; i2 < this.z; ++i2) {
            int n4 = n3;
            if (this.x[i2].E == n2) {
                n4 = n3 + 1;
            }
            n3 = n4;
        }
        return n3;
    }

    public final void b() {
        for (int i2 = 0; i2 < this.z; ++i2) {
            this.x[i2].F = 0;
        }
    }

    public final void b(boolean bl, double d2) {
        if (this.X != 0) {
            throw new RuntimeException("Tried to run update1 too early");
        }
        ++this.X;
        d2 = 0.02 * d2;
        this.M += d2;
        this.O += this.e.e * d2;
        this.P = Math.cos(this.O);
        this.Q = Math.sin(this.O);
        com.saterskog.b.a.b();
        if (!this.bg) {
            this.i(d2);
            this.k();
        }
        com.saterskog.b.a.b();
        this.f(d2);
        com.saterskog.b.a.b();
        this.e(d2);
        com.saterskog.b.a.b();
        this.j();
        com.saterskog.b.a.b();
        this.g();
        com.saterskog.b.a.b();
        if (!this.bg) {
            this.d(d2);
        }
        com.saterskog.b.a.b();
        this.h(d2);
        com.saterskog.b.a.b();
        this.i();
        com.saterskog.b.a.b();
        this.c(bl, d2);
        com.saterskog.b.a.b();
        this.c(d2);
        this.h();
        this.L = true;
        com.saterskog.b.a.b();
        com.saterskog.b.a.a();
        ++this.X;
    }

    final void b(float[] arrf) {
        GLES20.glUseProgram((int)this.at);
        GLES20.glEnableVertexAttribArray((int)this.aG);
        GLES20.glEnableVertexAttribArray((int)this.aI);
        GLES20.glEnableVertexAttribArray((int)this.aH);
        GLES20.glActiveTexture((int)33984);
        GLES20.glBindTexture((int)3553, (int)this.aS);
        GLES20.glUniform1i((int)this.aT, (int)0);
        int n2 = 0;
        while (this.bf > n2 * 32766) {
            int n3 = n2 * 32766;
            int n4 = Math.min(this.bf - n3, 32766);
            this.l.put(this.ak, n3 * 4, n4 * 4);
            this.l.position(0);
            this.m.put(this.al, n3 * 2, n4 * 2);
            this.m.position(0);
            this.o.put(this.am, n3 * 4, n4 * 4);
            this.o.position(0);
            GLES20.glVertexAttribPointer((int)this.aG, (int)4, (int)5126, (boolean)false, (int)16, (Buffer)this.l);
            GLES20.glVertexAttribPointer((int)this.aI, (int)2, (int)5126, (boolean)false, (int)8, (Buffer)this.m);
            GLES20.glVertexAttribPointer((int)this.aH, (int)4, (int)5126, (boolean)false, (int)16, (Buffer)this.o);
            GLES20.glUniformMatrix4fv((int)this.aJ, (int)1, (boolean)false, (float[])arrf, (int)0);
            GLES20.glDrawArrays((int)4, (int)0, (int)n4);
            ++n2;
        }
        GLES20.glDisableVertexAttribArray((int)this.aG);
        GLES20.glDisableVertexAttribArray((int)this.aI);
        GLES20.glDisableVertexAttribArray((int)this.aH);
    }

    public final int c() {
        int n2 = 0;
        for (int i2 = 0; i2 < this.z; ++i2) {
            int n3 = n2;
            if (this.x[i2].E == 0) {
                n3 = n2;
                if (Math.abs(this.x[i2].J[0] - 0.0f) + Math.abs(this.x[i2].J[1] - 0.0f) + Math.abs(this.x[i2].J[2] - 0.0f) < 0.1f) {
                    n3 = n2 + 1;
                }
            }
            n2 = n3;
        }
        return n2;
    }

    public final void c(int n2) {
        for (int i2 = 0; i2 < this.z; ++i2) {
            this.x[i2].E = n2;
        }
    }

    final void c(float[] arrf) {
        GLES20.glUseProgram((int)this.aM);
        GLES20.glEnableVertexAttribArray((int)this.aN);
        GLES20.glEnableVertexAttribArray((int)this.aO);
        int n2 = 0;
        while (this.ap > n2 * 32766) {
            int n3 = n2 * 32766;
            int n4 = Math.min(this.ap - n3, 32766);
            this.l.put(this.an, n3 * 4, n4 * 4);
            this.l.position(0);
            this.n.put(this.ao, n3, n4);
            this.n.position(0);
            GLES20.glVertexAttribPointer((int)this.aN, (int)4, (int)5126, (boolean)false, (int)16, (Buffer)this.l);
            GLES20.glVertexAttribPointer((int)this.aO, (int)1, (int)5126, (boolean)false, (int)4, (Buffer)this.n);
            GLES20.glUniformMatrix4fv((int)this.aP, (int)1, (boolean)false, (float[])arrf, (int)0);
            GLES20.glDrawArrays((int)4, (int)0, (int)n4);
            ++n2;
        }
        GLES20.glDisableVertexAttribArray((int)this.aN);
        GLES20.glDisableVertexAttribArray((int)this.aO);
    }

    public final int d() {
        int n2 = 0;
        for (int i2 = 0; i2 < this.z; ++i2) {
            int n3 = n2;
            if (this.x[i2].E == 0) {
                n3 = n2;
                if (this.x[i2].J[0] > 0.65f) {
                    n3 = n2;
                    if (this.x[i2].J[1] < 0.35f) {
                        n3 = n2;
                        if (this.x[i2].J[2] < 0.35f) {
                            n3 = n2 + 1;
                        }
                    }
                }
            }
            n2 = n3;
        }
        return n2;
    }

    /*
     * Enabled aggressive block sorting
     */
    final void d(float[] arrf) {
        int n2 = com.saterskog.cell_lab.h.B.length;
        if (this.bg) {
            ++n2;
        }
        int n3 = 0;
        while (true) {
            block18: {
                block19: {
                    block17: {
                        if (n3 >= n2) {
                            return;
                        }
                        if (n3 >= com.saterskog.cell_lab.h.B.length) break block17;
                        if (com.saterskog.cell_lab.h.B[n3].w == -1) break block18;
                        break block19;
                    }
                    GLES20.glEnable((int)3042);
                }
                GLES20.glUseProgram((int)this.au[n3]);
                if (this.ax[n3] != -1) {
                    GLES20.glEnableVertexAttribArray((int)this.ax[n3]);
                }
                if (this.ay[n3] != -1) {
                    GLES20.glEnableVertexAttribArray((int)this.ay[n3]);
                }
                if (this.aA[n3] != -1) {
                    GLES20.glEnableVertexAttribArray((int)this.aA[n3]);
                }
                if (this.az[n3] != -1) {
                    GLES20.glEnableVertexAttribArray((int)this.az[n3]);
                }
                if (this.aB[n3] != -1) {
                    GLES20.glActiveTexture((int)33984);
                    GLES20.glBindTexture((int)3553, (int)this.aR);
                    GLES20.glUniform1i((int)this.aB[n3], (int)0);
                }
                for (int i2 = 0; i2 < this.u[n3]; ++i2) {
                    int n4 = this.q[n3][i2];
                    int n5 = this.s[n3][i2];
                    if (this.ax[n3] != -1) {
                        this.l.put(this.ad, n4 * 2, n5 * 2);
                        this.l.position(0);
                        GLES20.glVertexAttribPointer((int)this.ax[n3], (int)2, (int)5126, (boolean)false, (int)8, (Buffer)this.l);
                    }
                    if (this.az[n3] != -1) {
                        this.m.put(this.af, n4 * 2, n5 * 2);
                        this.m.position(0);
                        GLES20.glVertexAttribPointer((int)this.az[n3], (int)2, (int)5126, (boolean)false, (int)8, (Buffer)this.m);
                    }
                    if (this.ay[n3] != -1) {
                        this.n.put(this.ae, n4 * 4, n5 * 4);
                        this.n.position(0);
                        GLES20.glVertexAttribPointer((int)this.ay[n3], (int)4, (int)5126, (boolean)false, (int)16, (Buffer)this.n);
                    }
                    if (this.aA[n3] != -1) {
                        this.o.put(this.ag, n4 * 4, n5 * 4);
                        this.o.position(0);
                        GLES20.glVertexAttribPointer((int)this.aA[n3], (int)4, (int)5126, (boolean)false, (int)16, (Buffer)this.o);
                    }
                    GLES20.glUniformMatrix4fv((int)this.aQ[n3], (int)1, (boolean)false, (float[])arrf, (int)0);
                    this.p.put(this.aq, this.r[n3][i2], this.t[n3][i2]);
                    this.p.position(0);
                    GLES20.glDrawElements((int)4, (int)this.t[n3][i2], (int)5123, (Buffer)this.p);
                }
                if (this.ax[n3] != -1) {
                    GLES20.glDisableVertexAttribArray((int)this.ax[n3]);
                }
                if (this.az[n3] != -1) {
                    GLES20.glDisableVertexAttribArray((int)this.az[n3]);
                }
                if (this.ay[n3] != -1) {
                    GLES20.glDisableVertexAttribArray((int)this.ay[n3]);
                }
                if (this.aA[n3] != -1) {
                    GLES20.glDisableVertexAttribArray((int)this.aA[n3]);
                }
            }
            ++n3;
        }
    }

    public int describeContents() {
        return 0;
    }

    public final int e() {
        int n2 = 0;
        for (int i2 = 0; i2 < this.z; ++i2) {
            int n3 = n2;
            if (this.x[i2].E == 0) {
                n3 = n2;
                if (this.x[i2].J[0] > 0.65f) {
                    n3 = n2;
                    if (this.x[i2].J[1] > 0.65f) {
                        n3 = n2;
                        if (this.x[i2].J[2] < 0.35f) {
                            n3 = n2 + 1;
                        }
                    }
                }
            }
            n2 = n3;
        }
        return n2;
    }

    /*
     * Enabled aggressive block sorting
     */
    final void e(float[] arrf) {
        int n2 = com.saterskog.cell_lab.h.B.length;
        int n3 = this.bg ? 1 : 0;
        int n4 = n2 + n3;
        n3 = 0;
        while (n3 < n2) {
            if (com.saterskog.cell_lab.h.B[n3].y != -1) {
                GLES20.glUseProgram((int)this.au[n4 + n3]);
                if (this.ax[n4 + n3] != -1) {
                    GLES20.glEnableVertexAttribArray((int)this.ax[n4 + n3]);
                }
                if (this.ay[n4 + n3] != -1) {
                    GLES20.glEnableVertexAttribArray((int)this.ay[n4 + n3]);
                }
                if (this.aA[n4 + n3] != -1) {
                    GLES20.glEnableVertexAttribArray((int)this.aA[n4 + n3]);
                }
                if (this.az[n4 + n3] != -1) {
                    GLES20.glEnableVertexAttribArray((int)this.az[n4 + n3]);
                }
                int n5 = 0;
                while (this.av[n4 + n3] > n5 * 32766) {
                    int n6 = this.aw[n4 + n3] + n5 * 32766;
                    int n7 = Math.min(this.av[n4 + n3] - n5 * 32766, 32766);
                    if (this.ax[n4 + n3] != -1) {
                        this.l.put(this.ad, n6 * 2, n7 * 2);
                        this.l.position(0);
                        GLES20.glVertexAttribPointer((int)this.ax[n4 + n3], (int)2, (int)5126, (boolean)false, (int)8, (Buffer)this.l);
                    }
                    if (this.az[n4 + n3] != -1) {
                        this.m.put(this.af, n6 * 4, n7 * 4);
                        this.m.position(0);
                        GLES20.glVertexAttribPointer((int)this.az[n4 + n3], (int)4, (int)5126, (boolean)false, (int)16, (Buffer)this.m);
                    }
                    if (this.ay[n4 + n3] != -1) {
                        this.n.put(this.ae, n6 * 4, n7 * 4);
                        this.n.position(0);
                        GLES20.glVertexAttribPointer((int)this.ay[n4 + n3], (int)4, (int)5126, (boolean)false, (int)16, (Buffer)this.n);
                    }
                    if (this.aA[n4 + n3] != -1) {
                        this.o.put(this.ag, n6 * 4, n7 * 4);
                        this.o.position(0);
                        GLES20.glVertexAttribPointer((int)this.aA[n4 + n3], (int)4, (int)5126, (boolean)false, (int)16, (Buffer)this.o);
                    }
                    GLES20.glUniformMatrix4fv((int)this.aQ[n4 + n3], (int)1, (boolean)false, (float[])arrf, (int)0);
                    GLES20.glDrawArrays((int)4, (int)0, (int)n7);
                    ++n5;
                }
                if (this.ax[n4 + n3] != -1) {
                    GLES20.glDisableVertexAttribArray((int)this.ax[n4 + n3]);
                }
                if (this.az[n4 + n3] != -1) {
                    GLES20.glDisableVertexAttribArray((int)this.az[n4 + n3]);
                }
                if (this.ay[n4 + n3] != -1) {
                    GLES20.glDisableVertexAttribArray((int)this.ay[n4 + n3]);
                }
                if (this.aA[n4 + n3] != -1) {
                    GLES20.glDisableVertexAttribArray((int)this.aA[n4 + n3]);
                }
            }
            ++n3;
        }
        return;
    }

    public final double f() {
        double d2 = 0.0;
        for (int i2 = 0; i2 < this.B; ++i2) {
            d2 += (double)this.A[i2].c;
        }
        return d2;
    }

    /*
     * Enabled aggressive block sorting
     */
    public void writeToParcel(Parcel parcel, int n2) {
        int n3 = this.bg ? 1 : 0;
        parcel.writeInt(n3);
        parcel.writeParcelable((Parcelable)this.e, n2);
        parcel.writeInt(this.z);
        parcel.writeArray((Object[])this.x);
        parcel.writeInt(this.B);
        parcel.writeArray((Object[])this.A);
        parcel.writeDouble(this.M);
        parcel.writeDouble(this.O);
        parcel.writeInt(this.V);
        parcel.writeInt(this.W);
        parcel.writeInt(this.S);
        parcel.writeInt(this.R);
    }
}

