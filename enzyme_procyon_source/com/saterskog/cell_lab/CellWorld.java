// 
// Decompiled by Procyon v0.5.36
// 

package com.saterskog.cell_lab;

import java.nio.Buffer;
import android.opengl.GLES20;
import com.saterskog.b.c;
import android.content.Context;
import java.util.Arrays;
import java.util.zip.GZIPInputStream;
import java.io.ObjectInputStream;
import java.io.InputStream;
import com.saterskog.b.b;
import java.nio.ByteOrder;
import com.saterskog.b.a;
import android.os.Parcel;
import java.nio.ShortBuffer;
import java.nio.FloatBuffer;
import java.nio.ByteBuffer;
import com.saterskog.b.d;
import android.os.Parcelable$Creator;
import android.os.Parcelable;

public class CellWorld implements Parcelable
{
    public static final Parcelable$Creator<CellWorld> CREATOR;
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
        CREATOR = (Parcelable$Creator)new Parcelable$Creator<CellWorld>() {};
    }
    
    public CellWorld(final Parcel parcel) {
        this(parcel.readInt() == 1, (Environment)parcel.readParcelable(Environment.class.getClassLoader()));
        this.z = parcel.readInt();
        this.x = (Cell[])parcel.createTypedArray((Parcelable$Creator)Cell.ad);
        this.B = parcel.readInt();
        this.A = (Food[])parcel.createTypedArray((Parcelable$Creator)Food.g);
        this.M = parcel.readDouble();
        this.O = parcel.readDouble();
        this.V = parcel.readInt();
        this.W = parcel.readInt();
        this.S = parcel.readInt();
        this.R = parcel.readInt();
    }
    
    public CellWorld(final boolean bg, final Environment environment) {
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
        if (!(this.bg = bg)) {
            this.d = environment.r;
            this.aa = environment.s;
            this.ab = this.d / 10;
        }
        else {
            this.d = 100;
            this.aa = 0;
        }
        this.ac = (this.d + 3) / 4;
        if (this.e == null) {
            com.saterskog.b.a.a("changeEnvironment: env is null");
        }
        if (environment == null) {
            com.saterskog.b.a.a("changeEnvironment: e is null");
        }
        this.e.a(environment);
        this.Z = Math.min(206, (int)(this.e.k / 0.03 - 0.1)) / 2 * 2;
        this.bd = Math.min(207, (int)(2.0 * this.e.k / 0.36));
        if (0.06 >= this.e.k * 2.0 / this.Z) {
            com.saterskog.b.a.a("skit:Too large Cell.MAX_R for grid.");
        }
        this.K = new int[this.d + 3];
        this.x = new Cell[this.d];
        for (int i = 0; i < this.d; ++i) {
            this.x[i] = new Cell();
        }
        this.z = 0;
        if (bg) {
            this.A = null;
        }
        else {
            this.A = new Food[this.aa];
            for (int j = 0; j < this.aa; ++j) {
                this.A[j] = new Food();
            }
        }
        this.B = 0;
        this.y = new e[this.ac];
        for (int k = 0; k < this.ac; ++k) {
            this.y[k] = new e();
        }
        this.C = 0;
        this.M = 0.0;
        for (int l = 0; l < 20; ++l) {
            this.J[l] = new Link();
        }
        this.aV = new int[(this.Z + 2) * (this.Z + 2)][];
        this.aW = new int[(this.Z + 2) * (this.Z + 2)];
        for (int n = 0; n < (this.Z + 2) * (this.Z + 2); ++n) {
            this.aV[n] = new int[203];
            this.aW[n] = 0;
        }
        this.ba = new int[(this.bd + 2) * (this.bd + 2)][];
        this.bb = new short[(this.bd + 2) * (this.bd + 2)][];
        this.bc = new int[(this.bd + 2) * (this.bd + 2)];
        for (int n2 = 0; n2 < (this.bd + 2) * (this.bd + 2); ++n2) {
            this.ba[n2] = new int[404];
            this.bb[n2] = new short[404];
            this.bc[n2] = 0;
        }
        this.aY = new int[this.d * 20];
        this.aZ = new int[this.d * 20];
        int n3;
        if (this.bg) {
            n3 = 2;
        }
        else {
            n3 = 1;
        }
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
        final int length = com.saterskog.cell_lab.h.B.length;
        int n4;
        if (this.bg) {
            n4 = 1;
        }
        else {
            n4 = 0;
        }
        this.u = new int[n4 + length];
        final int length2 = com.saterskog.cell_lab.h.B.length;
        int n5;
        if (this.bg) {
            n5 = 1;
        }
        else {
            n5 = 0;
        }
        this.q = new int[n5 + length2][];
        final int length3 = com.saterskog.cell_lab.h.B.length;
        int n6;
        if (this.bg) {
            n6 = 1;
        }
        else {
            n6 = 0;
        }
        this.r = new int[n6 + length3][];
        final int length4 = com.saterskog.cell_lab.h.B.length;
        int n7;
        if (this.bg) {
            n7 = 1;
        }
        else {
            n7 = 0;
        }
        this.s = new int[n7 + length4][];
        final int length5 = com.saterskog.cell_lab.h.B.length;
        int n8;
        if (this.bg) {
            n8 = 1;
        }
        else {
            n8 = 0;
        }
        this.t = new int[n8 + length5][];
        int n9 = 0;
        while (true) {
            final int length6 = com.saterskog.cell_lab.h.B.length;
            int n10;
            if (this.bg) {
                n10 = 1;
            }
            else {
                n10 = 0;
            }
            if (n9 >= n10 + length6) {
                break;
            }
            this.q[n9] = new int[201];
            this.r[n9] = new int[201];
            this.s[n9] = new int[201];
            this.t[n9] = new int[201];
            ++n9;
        }
        final ByteBuffer allocateDirect = ByteBuffer.allocateDirect(48);
        allocateDirect.order(ByteOrder.nativeOrder());
        (this.k = allocateDirect.asFloatBuffer()).put(new float[] { 1.1f, 1.1f, 1.1f, -1.1f, -1.1f, -1.1f, -1.1f, -1.1f, -1.1f, 1.1f, 1.1f, 1.1f }, 0, 12);
        this.k.position(0);
        this.aU = 0;
        this.L = false;
        int n11 = 0;
        while (true) {
            final int length7 = com.saterskog.cell_lab.h.B.length;
            int n12;
            if (bg) {
                n12 = 1;
            }
            else {
                n12 = 0;
            }
            if (n11 >= n12 + length7) {
                break;
            }
            this.E[n11] = 0;
            this.D[n11] = new int[this.d];
            ++n11;
        }
        if (Math.sqrt(1.7999999999999998E-4) * this.e.g / 0.072 * 0.02 > 1.0) {
            com.saterskog.b.a.a("skit:Too large timestep, close to unstable simulation.");
        }
        this.a(true, 0.0);
    }
    
    public static long a(final Environment environment) {
        final long n = Math.min(206, (int)(environment.k / 0.03 - 0.1)) / 2 * 2;
        final long n2 = Math.min(207, (int)(2.0 * environment.k / 0.36));
        final long n3 = environment.r;
        final long n4 = environment.r;
        final long n5 = environment.r;
        final long n6 = environment.r;
        final long n7 = environment.r;
        final long n8 = environment.s * 6 * 2;
        final long n9 = environment.s * 6 * 2;
        final long n10 = environment.s * 6 * 4;
        final int n11 = environment.r / 4;
        return (n + 2L) * (2L + n) * 203L * 4L + (environment.r * 24320L + environment.s * 80L) + (n2 + 2L) * (2L + n2) * 404L * 6L + (28L * n3 * 4L + 56L * n4 * 4L + 28L * n5 * 4L + 56L * n6 * 4L + 21L * n7 * 4L + n8 + n9 + n10 + n11 * 6 * 4 + n11 * 6 * 2 + n11 * 6 * 4 + environment.r * 12 * 7L + environment.r * 6 * 7L) * 8L;
    }
    
    private void b(final double n) {
        final float n2 = (float)n / 4.0f;
        int i = 0;
        int n3 = 4;
        for (int n4 = 0; i < 4; ++i, n3 = n4, n4 = 4 - n4) {
            int j = 0;
        Label_0084_Outer:
            while (j < this.z) {
                final Cell cell = this.x[j];
            Label_0084:
                while (true) {
                    Label_0123: {
                        if (i != 0) {
                            break Label_0123;
                        }
                        if (!Double.isNaN(cell.Q)) {
                            cell.w = cell.Q;
                            cell.X = cell.Z;
                            cell.p = cell.R;
                            break Label_0123;
                        }
                        com.saterskog.b.a.b("NaN final");
                        cell.Q = 0.0;
                        this.a(j, false);
                        final int n5 = j - 1;
                        j = n5 + 1;
                        continue Label_0084_Outer;
                    }
                    final Gene gene = cell.I[cell.D];
                    if (gene.s == com.saterskog.cell_lab.h.n) {
                        for (int k = 0; k < 4; ++k) {
                            cell.W[k] = 0.0f;
                        }
                        for (int l = 0; l < 4; ++l) {
                            float a;
                            if ((a = cell.a(l + 7, n4)) < -20.0f) {
                                a = -20.0f;
                            }
                            float n6 = a;
                            if (a > 20.0f) {
                                n6 = 20.0f;
                            }
                            final float[] w = cell.W;
                            final int n7 = gene.u[l + 5];
                            w[n7] += n6;
                        }
                    }
                    for (int n8 = 0; n8 < 4; ++n8) {
                        cell.U[n3 + n8] = cell.U[n4 + n8] + (cell.W[n8] - 5.0f * cell.U[n4 + n8]) * n2;
                        if (i == 3) {
                            cell.V[n8] = cell.W[n8];
                            cell.W[n8] = 0.0f;
                        }
                    }
                    for (int n9 = 0; n9 < cell.C; ++n9) {
                        if (cell.H[n9].a >= 0) {
                            final Cell cell2 = this.x[cell.H[n9].a];
                            if (gene.s != com.saterskog.cell_lab.h.e && cell2.I[cell2.D].s != com.saterskog.cell_lab.h.e) {
                                for (int n10 = 0; n10 < 4; ++n10) {
                                    final float[] u = cell.U;
                                    final int n11 = n3 + n10;
                                    u[n11] += 5.0f * (cell2.U[n4 + n10] - cell.U[n4 + n10]) * n2;
                                }
                            }
                        }
                    }
                    int n12 = 0;
                    while (true) {
                        final int n5 = j;
                        if (n12 >= 4) {
                            continue Label_0084;
                        }
                        if (cell.U[n3 + n12] < -1.0f) {
                            cell.U[n3 + n12] = -1.0f;
                        }
                        if (cell.U[n3 + n12] > 1.0f) {
                            cell.U[n3 + n12] = 1.0f;
                        }
                        ++n12;
                    }
                    break;
                }
            }
        }
    }
    
    private void b(final double b, final double c) {
        if (this.a((Cell)null)) {
            final Cell cell = this.x[this.z - 1];
            cell.b = b;
            cell.c = c;
            cell.w = 0.21599999999999997;
            cell.d = Math.sqrt(cell.w / 400.0);
            cell.E = 2;
            cell.F = 0;
            cell.p = 1.0;
            cell.T = -1;
            cell.y = (this.Y.nextInt(1) == 1);
            for (int i = 0; i < 80; ++i) {
                cell.I[i].b = (float)(0.072 + this.Y.nextDouble() * 0.288);
                cell.I[i].a[0] = (float)this.Y.nextDouble();
                cell.I[i].a[1] = (float)this.Y.nextDouble();
                cell.I[i].a[2] = (float)this.Y.nextDouble();
                cell.I[i].d = (float)(this.Y.nextDouble() * 2.0 * 3.141592653589793);
                cell.I[i].c = (float)(0.5 + this.Y.b() * 0.2);
                cell.I[i].e = (float)(this.Y.nextDouble() * 2.0 * 3.141592653589793);
                cell.I[i].f = (float)(this.Y.nextDouble() * 2.0 * 3.141592653589793);
                cell.I[i].g = (float)(10.0 + this.Y.b() * 3.0);
                do {
                    cell.I[i].s = com.saterskog.cell_lab.h.B[this.Y.nextInt(com.saterskog.cell_lab.h.B.length)];
                } while (!this.e.t[cell.I[i].s.ordinal()]);
                cell.I[i].i = this.Y.nextInt(80);
                cell.I[i].j = this.Y.nextInt(80);
                cell.I[i].l = (this.Y.b() > 0.0);
                cell.I[i].m = (this.Y.b() > 0.0);
                cell.I[i].n = (this.Y.b() > 0.0);
                cell.I[i].h = (float)this.Y.nextDouble() * 35.0f;
                cell.I[i].q = (this.Y.nextInt(1) == 1);
                cell.I[i].r = (this.Y.nextInt(1) == 1);
                for (int j = 0; j < 11; ++j) {
                    if (this.e.t[com.saterskog.cell_lab.h.n.ordinal()] || this.e.t[com.saterskog.cell_lab.h.l.ordinal()] || this.e.t[com.saterskog.cell_lab.h.k.ordinal()]) {
                        cell.I[i].t[j].e = (short)(this.Y.nextInt(2) + 1);
                        cell.I[i].t[j].d = (short)this.Y.nextInt(8);
                        cell.I[i].t[j].b = (float)this.Y.b() * 8.0f;
                        cell.I[i].t[j].a = (float)this.Y.b() * 8.0f;
                        cell.I[i].t[j].c = (float)this.Y.b() * 8.0f;
                    }
                    else {
                        cell.I[i].t[j].e = 0;
                        cell.I[i].t[j].d = (short)this.Y.nextInt(8);
                        cell.I[i].t[j].b = (float)this.Y.b();
                        cell.I[i].t[j].a = 0.0f;
                        cell.I[i].t[j].c = 0.0f;
                    }
                }
                for (int k = 0; k < 11; ++k) {
                    cell.I[i].u[k] = this.Y.nextInt(Gene.w[k]);
                }
                for (int l = 0; l < 7; ++l) {
                    cell.I[i].v[l] = Gene.z[l] + (float)this.Y.nextDouble() * (Gene.A[l] - Gene.z[l]);
                }
                cell.I[i].v[5] = (float)Math.pow(this.Y.nextDouble(), 3.0) * Gene.A[5];
            }
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
            cell.k = this.Y.b() * 3.141592653589793;
            cell.m = this.Y.b() * 3.141592653589793;
            cell.C = 0;
            cell.o = 0.0;
            cell.G = 0;
        }
    }
    
    private void b(final float n, final float n2, final float n3, final float n4) {
        int n5 = 0;
        int n6;
        for (int i = 0; i < this.B; ++i, n5 = n6) {
            final Food food = this.A[i];
            n6 = n5;
            if (food.a >= n - 0.007f) {
                n6 = n5;
                if (food.a <= n2 + 0.007f) {
                    n6 = n5;
                    if (food.b >= n3 - 0.007f) {
                        n6 = n5;
                        if (food.b <= n4 + 0.007f) {
                            final float n7 = (float)(0.007000000216066837 * Math.sqrt(food.c / 1.152));
                            float n8;
                            float n9;
                            float n10;
                            if (food.f <= 0.0f) {
                                n8 = 0.6f;
                                n9 = 0.4f;
                                n10 = 0.2f;
                            }
                            else {
                                n8 = 0.8f + 0.2f * food.f;
                                n9 = (1.0f - food.f) * 0.4f;
                                n10 = 0.2f * (1.0f - food.f);
                            }
                            this.ah[n5] = 1.0f;
                            this.ah[n5 + 1] = 1.0f;
                            this.ah[n5 + 2] = 1.0f;
                            this.ah[n5 + 3] = -1.0f;
                            this.ah[n5 + 4] = -1.0f;
                            this.ah[n5 + 5] = -1.0f;
                            this.ai[n5] = food.a + n7;
                            this.ai[n5 + 1] = food.b + n7;
                            this.ai[n5 + 2] = food.a + n7;
                            this.ai[n5 + 3] = food.b - n7;
                            this.ai[n5 + 4] = food.a - n7;
                            this.ai[n5 + 5] = food.b - n7;
                            this.aj[n5 * 2 + 0] = n8;
                            this.aj[n5 * 2 + 1] = n9;
                            this.aj[n5 * 2 + 2] = n10;
                            this.aj[n5 * 2 + 3] = 0.4f;
                            this.aj[n5 * 2 + 4] = n8;
                            this.aj[n5 * 2 + 5] = n9;
                            this.aj[n5 * 2 + 6] = n10;
                            this.aj[n5 * 2 + 7] = 0.4f;
                            this.aj[n5 * 2 + 8] = n8;
                            this.aj[n5 * 2 + 9] = n9;
                            this.aj[n5 * 2 + 10] = n10;
                            this.aj[n5 * 2 + 11] = 0.4f;
                            n6 = n5 + 6;
                            this.ah[n6] = -1.0f;
                            this.ah[n6 + 1] = -1.0f;
                            this.ah[n6 + 2] = -1.0f;
                            this.ah[n6 + 3] = 1.0f;
                            this.ah[n6 + 4] = 1.0f;
                            this.ah[n6 + 5] = 1.0f;
                            this.ai[n6] = food.a - n7;
                            this.ai[n6 + 1] = food.b - n7;
                            this.ai[n6 + 2] = food.a - n7;
                            this.ai[n6 + 3] = food.b + n7;
                            this.ai[n6 + 4] = food.a + n7;
                            this.ai[n6 + 5] = food.b + n7;
                            this.aj[n6 * 2 + 0] = n8;
                            this.aj[n6 * 2 + 1] = n9;
                            this.aj[n6 * 2 + 2] = n10;
                            this.aj[n6 * 2 + 3] = 0.4f;
                            this.aj[n6 * 2 + 4] = n8;
                            this.aj[n6 * 2 + 5] = n9;
                            this.aj[n6 * 2 + 6] = n10;
                            this.aj[n6 * 2 + 7] = 0.4f;
                            this.aj[n6 * 2 + 8] = n8;
                            this.aj[n6 * 2 + 9] = n9;
                            this.aj[n6 * 2 + 10] = n10;
                            this.aj[n6 * 2 + 11] = 0.4f;
                            n6 += 6;
                        }
                    }
                }
            }
        }
        this.be = n5 / 2;
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
    
    private double c(double d, double n) {
        final double n2 = (this.P * d + this.Q * n) / this.e.k;
        n = (1.0 - this.e.f) * (1.0 - Math.sqrt(d * d + n * n) / this.e.k) / this.e.f + 1.0;
        d = this.e.d;
        return Math.max((n2 * (1.0 - this.e.f) + this.e.f) * d / (n * n), 0.0);
    }
    
    private void c(final double n) {
        for (int z = this.z, i = 0; i < z; ++i) {
            final Cell cell = this.x[i];
            final double w = cell.w;
            final double n2 = 0.7 * (cell.w * cell.d * cell.d);
            final double n3 = cell.g / w * n;
            final double n4 = cell.h / w * n;
            final double a = cell.j * n / n2;
            cell.q += cell.i * n * 10.0;
            double n5;
            if ((n5 = 1.0 - cell.q * 3.0) < 0.0) {
                n5 = 0.0;
            }
            double n6 = n5;
            if (n5 > 4.0) {
                n6 = 4.0;
            }
            final double n7 = cell.w * n6;
            if (cell.z) {
                final double n8 = this.e.l * n7;
                if (n3 * n3 + n4 * n4 > n8 * n8 * n * n || Math.abs(a) > n8 * n * 0.6666666666666666) {
                    cell.z = false;
                }
            }
            if (!cell.z) {
                final double n9 = cell.e + n3;
                final double n10 = n4 + cell.f;
                final double a2 = a + cell.l;
                final double sqrt = Math.sqrt(n9 * n9 + n10 * n10);
                double v = 0.0;
                double n13 = 0.0;
                Label_0397: {
                    if (cell.l != 0.0) {
                        final double n11 = sqrt / (cell.d * Math.abs(cell.l));
                        final double n12 = n11 * n11;
                        v = (0.1 * n11 + n12) / (0.1 * n11 + n12 + 0.15);
                        final double v2 = (1.0 - (n12 + n11) / (n11 + n12 + 5.0)) * 0.65;
                        if (!Double.isNaN(v)) {
                            n13 = v2;
                            if (!Double.isNaN(v2)) {
                                break Label_0397;
                            }
                        }
                        v = 1.0;
                        n13 = 0.0;
                    }
                    else {
                        v = 1.0;
                        n13 = 0.0;
                    }
                }
                final double m = this.e.m;
                final double j = this.e.m;
                final double w2 = cell.w;
                final double n14 = v * m * n7 / cell.w * n;
                final double n15 = n13 * j * w2 / n2 * n;
                boolean b = false;
                if (n9 * n9 + n10 * n10 <= n14 * n14) {
                    cell.e = 0.0;
                    cell.f = 0.0;
                    b = true;
                }
                else {
                    cell.e = n9 - n9 * n14 / sqrt;
                    cell.f = n10 - n14 * n10 / sqrt;
                }
                if (Math.abs(a2) <= n15) {
                    cell.l = 0.0;
                    if (b) {
                        cell.z = true;
                    }
                }
                else {
                    cell.l = a2 - Math.signum(cell.l) * n15;
                }
            }
            cell.g = cell.e;
            cell.h = cell.f;
            cell.j = cell.l;
        }
    }
    
    private void c(final float n, final float n2, final float n3, final float n4) {
        int n5 = 0;
        int n6;
        for (int i = 0; i < this.C; ++i, n5 = n6) {
            final e e = this.y[i];
            n6 = n5;
            if (e.a >= n - 0.063111f) {
                n6 = n5;
                if (e.a <= n2 + 0.063111f) {
                    n6 = n5;
                    if (e.b >= n3 - 0.063111f) {
                        n6 = n5;
                        if (e.b <= n4 + 0.063111f) {
                            final float n7 = 0.063111f * (float)(e.c / 0.03);
                            final float n8 = (float)Math.sqrt(e.d);
                            this.ak[n5 * 2] = n7;
                            this.ak[n5 * 2 + 1] = n7;
                            this.ak[n5 * 2 + 2] = n8;
                            this.ak[n5 * 2 + 3] = 0.0f;
                            this.ak[n5 * 2 + 4] = n7;
                            this.ak[n5 * 2 + 5] = -n7;
                            this.ak[n5 * 2 + 6] = n8;
                            this.ak[n5 * 2 + 7] = 0.0f;
                            this.ak[n5 * 2 + 8] = -n7;
                            this.ak[n5 * 2 + 9] = -n7;
                            this.ak[n5 * 2 + 10] = n8;
                            this.ak[n5 * 2 + 11] = 0.0f;
                            this.al[n5] = (float)e.a;
                            this.al[n5 + 1] = (float)e.b;
                            this.al[n5 + 2] = (float)e.a;
                            this.al[n5 + 3] = (float)e.b;
                            this.al[n5 + 4] = (float)e.a;
                            this.al[n5 + 5] = (float)e.b;
                            this.am[n5 * 2] = e.e[0];
                            this.am[n5 * 2 + 1] = e.e[1];
                            this.am[n5 * 2 + 2] = e.e[2];
                            this.am[n5 * 2 + 3] = (float)e.c;
                            this.am[n5 * 2 + 4] = e.e[0];
                            this.am[n5 * 2 + 5] = e.e[1];
                            this.am[n5 * 2 + 6] = e.e[2];
                            this.am[n5 * 2 + 7] = (float)e.c;
                            this.am[n5 * 2 + 8] = e.e[0];
                            this.am[n5 * 2 + 9] = e.e[1];
                            this.am[n5 * 2 + 10] = e.e[2];
                            this.am[n5 * 2 + 11] = (float)e.c;
                            n6 = n5 + 6;
                            this.ak[n6 * 2] = -n7;
                            this.ak[n6 * 2 + 1] = -n7;
                            this.ak[n6 * 2 + 2] = n8;
                            this.ak[n6 * 2 + 3] = 0.0f;
                            this.ak[n6 * 2 + 4] = -n7;
                            this.ak[n6 * 2 + 5] = n7;
                            this.ak[n6 * 2 + 6] = n8;
                            this.ak[n6 * 2 + 7] = 0.0f;
                            this.ak[n6 * 2 + 8] = n7;
                            this.ak[n6 * 2 + 9] = n7;
                            this.ak[n6 * 2 + 10] = n8;
                            this.ak[n6 * 2 + 11] = 0.0f;
                            this.al[n6] = (float)e.a;
                            this.al[n6 + 1] = (float)e.b;
                            this.al[n6 + 2] = (float)e.a;
                            this.al[n6 + 3] = (float)e.b;
                            this.al[n6 + 4] = (float)e.a;
                            this.al[n6 + 5] = (float)e.b;
                            this.am[n6 * 2] = e.e[0];
                            this.am[n6 * 2 + 1] = e.e[1];
                            this.am[n6 * 2 + 2] = e.e[2];
                            this.am[n6 * 2 + 3] = (float)e.c;
                            this.am[n6 * 2 + 4] = e.e[0];
                            this.am[n6 * 2 + 5] = e.e[1];
                            this.am[n6 * 2 + 6] = e.e[2];
                            this.am[n6 * 2 + 7] = (float)e.c;
                            this.am[n6 * 2 + 8] = e.e[0];
                            this.am[n6 * 2 + 9] = e.e[1];
                            this.am[n6 * 2 + 10] = e.e[2];
                            this.am[n6 * 2 + 11] = (float)e.c;
                            n6 += 6;
                        }
                    }
                }
            }
        }
        this.bf = n5 / 2;
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
    
    private void c(final boolean u, final double t) {
        int i = 0;
        this.T = t;
        this.U = u;
        this.aX = 0;
        while (i < this.z) {
            this.d(i);
            ++i;
        }
    }
    
    private double d(double n, final double n2) {
        final double n3 = (this.P * n + this.Q * n2) / this.e.k;
        final double sqrt = Math.sqrt(n * n + n2 * n2);
        final double n4 = 1.0 + (1.0 - this.e.f) * (1.0 - sqrt / this.e.k) / this.e.f;
        if ((n3 * (1.0 - this.e.f) + this.e.f) * this.e.d / (n4 * n4) < 0.0) {
            n = 0.0;
        }
        else {
            n = -(this.e.d * (-1.0 + this.e.f) * this.e.f * this.e.f * this.e.k * ((this.P - this.P * this.e.f) * sqrt * sqrt + this.P * sqrt * this.e.k + 2.0 * this.e.f * this.e.k * n - 2.0 * (-1.0 + this.e.f) * this.Q * n * n2 + 2.0 * this.P * (-1.0 + this.e.f) * n2 * n2) / (sqrt * Math.pow((-1.0 + this.e.f) * sqrt + this.e.k, 3.0)));
        }
        return n;
    }
    
    private void d(final double n) {
        int n2;
        for (int i = 0; i < this.B; i = n2 + 1) {
            final Food food = this.A[i];
            float d = food.d;
            float e = food.e;
            food.c -= (float)(0.006 * n);
            if (food.c < 0.0f) {
                food.a(this.A[this.B - 1]);
                --this.B;
                n2 = i - 1;
            }
            else {
                final int n3 = (int)((this.e.k + food.a) / (2.0 * this.e.k) * this.bd + 1.0) + (int)((this.e.k + food.b) / (2.0 * this.e.k) * this.bd + 1.0) * (this.bd + 2);
                if (n3 >= 0 && n3 < this.bc.length) {
                    final int n4 = this.bc[n3];
                    if (n4 < 404) {
                        this.ba[n3][n4] = i;
                        if (food.f <= 0.0f) {
                            this.bb[n3][n4] = 1;
                        }
                        else {
                            this.bb[n3][n4] = 2;
                        }
                        final int[] bc = this.bc;
                        ++bc[n3];
                    }
                    else {
                        com.saterskog.b.a.a("smellGridnMAX exhausted, food");
                    }
                }
                final int n5 = (int)((food.a + this.e.k) / (2.0 * this.e.k) * this.Z) + 1 + ((int)((this.e.k + food.b) / (2.0 * this.e.k) * this.Z) + 1) * (this.Z + 2);
                if (n5 < 0 || n5 >= this.aW.length) {
                    com.saterskog.b.a.b("x:" + food.a + " y:" + food.b + " r:" + this.e.k);
                    throw new RuntimeException("sadfae");
                }
                int n6 = 0;
                int n8;
                int n9;
                float n10;
                float n11;
                int n12;
                for (int j = 0; j < this.aW[n5]; j = n8 + 1, n6 = n9, e = n10, d = n11, i = n12) {
                    final Cell cell = this.x[this.aV[n5][j]];
                    final double n7 = (cell.c - food.b) * (cell.c - food.b) + (cell.b - food.a) * (cell.b - food.a);
                    n8 = j;
                    n9 = n6;
                    n10 = e;
                    n11 = d;
                    n12 = i;
                    if (n7 < (cell.d + 0.007000000216066837) * (cell.d + 0.007000000216066837)) {
                        final h s = cell.I[cell.D].s;
                        float n13 = e;
                        float n14 = d;
                        if (this.e.y) {
                            float n15 = e;
                            float n16 = d;
                            if (s == com.saterskog.cell_lab.h.r) {
                                final double sqrt = Math.sqrt(n7);
                                final double n17 = (food.a - cell.b) / sqrt;
                                final double n18 = (food.b - cell.c) / sqrt;
                                final double n19 = Math.cos(cell.k) * n18 - Math.sin(cell.k) * n17;
                                double n20;
                                if (0.0 < n19 != cell.y) {
                                    n20 = n19 * 0.075 * cell.a(2, 0);
                                }
                                else {
                                    n20 = n19 * 0.075 * cell.a(4, 0);
                                }
                                final double n21 = (n20 - (food.d - cell.e) * n18 + (food.e - cell.f) * n17 - cell.l * cell.d) * 40.0;
                                n16 = (float)(d + (-0.12 * n17 + n18 * n21) * n);
                                n15 = (float)((n18 * -0.12 - n21 * n17) * n + e);
                            }
                            n13 = n15;
                            n14 = n16;
                            if (n7 < cell.d * cell.d) {
                                final double sqrt2 = Math.sqrt(n7);
                                final double n22 = 500.0 * (cell.d - sqrt2) * 3.0 / sqrt2;
                                final double n23 = food.a;
                                final double b = cell.b;
                                final double n24 = food.b;
                                final double c = cell.c;
                                n14 = (float)((n23 - b) * n22 * n + n16);
                                n13 = (float)(n22 * (n24 - c) * n + n15);
                            }
                        }
                        if (s == com.saterskog.cell_lab.h.o && cell.b(4) == 2) {
                            food.f -= (float)n;
                        }
                        n8 = j;
                        n9 = n6;
                        n10 = n13;
                        n11 = n14;
                        n12 = i;
                        if (food.f <= 0.0f) {
                            n8 = j;
                            n9 = n6;
                            n10 = n13;
                            n11 = n14;
                            n12 = i;
                            if (s == com.saterskog.cell_lab.h.a) {
                                final double min = Math.min(food.c, 0.36 - cell.w);
                                final double n25 = 1.0 * n;
                                if (n25 < min) {
                                    cell.e *= cell.w;
                                    cell.f *= cell.w;
                                    cell.w += n25;
                                    cell.e /= cell.w;
                                    cell.f /= cell.w;
                                    food.c -= (float)n25;
                                    n12 = i;
                                    n11 = n14;
                                    n10 = n13;
                                    n9 = n6;
                                    n8 = j;
                                }
                                else {
                                    cell.e *= cell.w;
                                    cell.f *= cell.w;
                                    cell.w += min;
                                    cell.e /= cell.w;
                                    cell.f /= cell.w;
                                    food.c -= (float)min;
                                    n8 = j;
                                    n9 = n6;
                                    n10 = n13;
                                    n11 = n14;
                                    n12 = i;
                                    if (food.c <= 0.0) {
                                        food.a(this.A[this.B - 1]);
                                        --this.B;
                                        n12 = i - 1;
                                        n8 = this.aW[n5];
                                        n9 = 1;
                                        n10 = n13;
                                        n11 = n14;
                                    }
                                }
                            }
                        }
                    }
                }
                n2 = i;
                if (n6 == 0) {
                    n2 = i;
                    if (this.e.y) {
                        final float n26 = (float)(d - 0.2 * food.d * this.e.g * n);
                        final float n27 = (float)(e - 0.2 * food.e * this.e.g * n);
                        food.a += (float)(n26 * n);
                        food.b += (float)(n27 * n);
                        float e2 = n27;
                        float d2 = n26;
                        if (food.a * food.a + food.b * food.b >= this.e.k * this.e.k) {
                            if (this.e.x) {
                                food.a(this.A[this.B - 1]);
                                --this.B;
                                n2 = i - 1;
                                continue;
                            }
                            final float n28 = (float)Math.sqrt(food.a * food.a + food.b * food.b);
                            food.a = (float)this.e.k * food.a / n28;
                            food.b = (float)this.e.k * food.b / n28;
                            final float n29 = 2.0f * (food.a * n26 + food.b * n27) / (n28 * n28);
                            d2 = n26 - food.a * n29;
                            e2 = n27 - n29 * food.b;
                        }
                        food.d = d2;
                        food.e = e2;
                        n2 = i;
                    }
                }
            }
        }
    }
    
    private void d(final int n) {
        final Cell cell = this.x[n];
        final h s = cell.I[cell.D].s;
        if (s == com.saterskog.cell_lab.h.k || s == com.saterskog.cell_lab.h.l) {
            double cos = 0.0;
            double sin = 0.0;
            if (s == com.saterskog.cell_lab.h.k) {
                cos = Math.cos(cell.k);
                sin = Math.sin(cell.k);
            }
            final int n2 = (int)((this.e.k + cell.b) / (2.0 * this.e.k) * this.bd + 1.0);
            final int n3 = (int)((this.e.k + cell.c) / (2.0 * this.e.k) * this.bd + 1.0);
            float n4 = 0.0f;
            if (cell.I[cell.D].u[3] == 3) {
                if (s == com.saterskog.cell_lab.h.l) {
                    n4 = (float)(0.0 + this.c(cell.b, cell.c) * 0.2);
                }
                else {
                    n4 = (float)(0.0 + -(this.d(cell.b, cell.c) * sin - this.e(cell.b, cell.c) * cos) * 0.2);
                }
            }
            float n5 = n4;
            if (cell.I[cell.D].u[3] == 4) {
                if (s == com.saterskog.cell_lab.h.l) {
                    n5 = (float)(n4 + Math.sqrt(cell.e * cell.e + cell.f * cell.f) * 3.0);
                }
                else {
                    n5 = (float)(n4 + (cell.e * sin - cell.f * cos) * 3.0);
                }
            }
            float n6 = n5;
            if (cell.I[cell.D].u[3] == 5) {
                final double sqrt = Math.sqrt(cell.b * cell.b + cell.c * cell.c);
                final double max = Math.max(Math.min(1.0, 1.0 - (this.e.k - sqrt) / 0.27), 0.0);
                if (s == com.saterskog.cell_lab.h.l) {
                    n6 = (float)(n5 + max);
                }
                else {
                    n6 = n5;
                    if (sqrt != 0.0) {
                        n6 = (float)(n5 + -max * (cell.b * sin - cell.c * cos) / sqrt);
                    }
                }
            }
            float n7 = 0.0f;
            Label_1378: {
                if (cell.I[cell.D].u[3] != 0 && cell.I[cell.D].u[3] != 1 && cell.I[cell.D].u[3] != 2 && cell.I[cell.D].u[3] != 3) {
                    n7 = n6;
                    if (cell.I[cell.D].u[3] != 5) {
                        break Label_1378;
                    }
                }
                int n8 = -1;
                while (true) {
                    n7 = n6;
                    if (n8 >= 2) {
                        break;
                    }
                    float n11;
                    for (int i = -1; i < 2; ++i, n6 = n11) {
                        final int n9 = n2 + n8;
                        final int n10 = n3 + i;
                        n11 = n6;
                        if (n9 >= 0) {
                            n11 = n6;
                            if (n9 < this.bd + 2) {
                                n11 = n6;
                                if (n10 >= 0) {
                                    n11 = n6;
                                    if (n10 < this.bd + 2) {
                                        final int n12 = n9 + n10 * (this.bd + 2);
                                        int n13 = 0;
                                        float n14 = n6;
                                        while (true) {
                                            n11 = n14;
                                            if (n13 >= this.bc[n12]) {
                                                break;
                                            }
                                            float n15 = n14;
                                            if (this.bb[n12][n13] == cell.I[cell.D].u[3]) {
                                                n15 = n14;
                                                if (this.ba[n12][n13] != n) {
                                                    if (cell.I[cell.D].u[3] == 0) {
                                                        final Cell cell2 = this.x[this.ba[n12][n13]];
                                                        final float n16 = cell.I[cell.D].v[1] - cell2.J[0];
                                                        final float n17 = cell.I[cell.D].v[2] - cell2.J[1];
                                                        final float n18 = cell.I[cell.D].v[3] - cell2.J[2];
                                                        final float n19 = cell.I[cell.D].v[4];
                                                        n15 = n14;
                                                        if (n16 * n16 + n17 * n17 + n18 * n18 < n19 * n19) {
                                                            final double n20 = cell.b - cell2.b;
                                                            final double n21 = cell.c - cell2.c;
                                                            final double sqrt2 = Math.sqrt(n20 * n20 + n21 * n21);
                                                            n15 = n14;
                                                            if (sqrt2 > 0.0) {
                                                                if (s == com.saterskog.cell_lab.h.l) {
                                                                    n15 = (float)(cell2.w * com.saterskog.b.b.a(sqrt2 / 0.09) * 10.0 + n14);
                                                                }
                                                                else {
                                                                    n15 = (float)(cell2.w * com.saterskog.b.b.b(sqrt2 / 0.09) * (n20 * sin - n21 * cos) / sqrt2 * 10.0 + n14);
                                                                }
                                                            }
                                                        }
                                                    }
                                                    else {
                                                        double n22 = 0.0;
                                                        double n23 = 0.0;
                                                        double n24 = 0.0;
                                                        double n25 = 0.0;
                                                        Label_1103: {
                                                            if (this.ba[n12][n13] < 0) {
                                                                final Cell cell3 = this.x[-(this.ba[n12][n13] + 1)];
                                                                n22 = 0.25 * (cell.b - cell3.b);
                                                                n23 = (cell.c - cell3.c) * 0.25;
                                                                n24 = Math.sqrt(n22 * n22 + n23 * n23);
                                                                n25 = cell3.w * 10.0;
                                                            }
                                                            else {
                                                                final Food food = this.A[this.ba[n12][n13]];
                                                                final double n26 = 0.0;
                                                                final double n27 = 0.0;
                                                                final double n28 = 0.0;
                                                                final double n29 = 0.0;
                                                                if (food.f > 0.0f || cell.I[cell.D].u[3] != 1) {
                                                                    n25 = n26;
                                                                    n23 = n29;
                                                                    n22 = n28;
                                                                    n24 = n27;
                                                                    if (food.f <= 0.0f) {
                                                                        break Label_1103;
                                                                    }
                                                                    n25 = n26;
                                                                    n23 = n29;
                                                                    n22 = n28;
                                                                    n24 = n27;
                                                                    if (cell.I[cell.D].u[3] != 2) {
                                                                        break Label_1103;
                                                                    }
                                                                }
                                                                n22 = cell.b - food.a;
                                                                n23 = cell.c - food.b;
                                                                n24 = Math.sqrt(n22 * n22 + n23 * n23);
                                                                n25 = food.c * 10.0f;
                                                            }
                                                        }
                                                        n15 = n14;
                                                        if (n24 > 0.0) {
                                                            if (s == com.saterskog.cell_lab.h.l) {
                                                                n15 = (float)(n25 * com.saterskog.b.b.a(n24 / 0.09) + n14);
                                                            }
                                                            else {
                                                                n15 = (float)(n25 * com.saterskog.b.b.b(n24 / 0.09) * (n22 * sin - n23 * cos) / n24 + n14);
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                            ++n13;
                                            n14 = n15;
                                        }
                                    }
                                }
                            }
                        }
                    }
                    ++n8;
                }
            }
            float n30 = n7;
            if (s == com.saterskog.cell_lab.h.k) {
                int n31;
                if (cell.y) {
                    n31 = -1;
                }
                else {
                    n31 = 1;
                }
                n30 = n7 * n31;
            }
            final float[] w = cell.W;
            final int b = cell.b(2);
            w[b] += Math.max(Math.min(cell.I[cell.D].v[0] * n30, 20.0f), -20.0f);
        }
        int n32;
        for (int j = 0; j < cell.C; j = n32 + 1) {
            final Link link = cell.H[j];
            n32 = j;
            if (link.a <= n) {
                if (link.a == -1) {
                    final double cos2 = Math.cos(cell.k + cell.H[j].c);
                    final double sin2 = Math.sin(cell.k + cell.H[j].c);
                    link.g = (float)((cell.d - Cell.a) * cos2 * 0.8);
                    link.h = (float)((cell.d - Cell.a) * sin2 * 0.8);
                    final double n33 = cos2 * (cell.d * 0.6);
                    final double n34 = sin2 * (cell.d * 0.6);
                    if ((link.e - n33 - cell.b) * (link.e - n33 - cell.b) + (link.f - n34 - cell.c) * (link.f - n34 - cell.c) > cell.d * cell.d * 2.0 * 2.0) {
                        cell.H[j].a(cell.H[cell.C - 1]);
                        --cell.C;
                        n32 = j - 1;
                    }
                    else {
                        final double e = cell.e;
                        final double l = cell.l;
                        final double n35 = -n34;
                        final double f = cell.f;
                        final double k = cell.l;
                        final double n36 = 50.0 * cell.d;
                        final double n37 = n36 * (1.0 - 1.0 * this.T * n36 * 0.5 / cell.w);
                        final double n38 = (0.0 - (e + l * n35)) * n37 + (link.e - n33 - cell.b) * 30.0 * 3.0;
                        final double n39 = (0.0 - (f + k * n33)) * n37 + (link.f - n34 - cell.c) * 30.0 * 3.0;
                        cell.g += n38;
                        cell.h += n39;
                        cell.j += n33 * n39 + n34 * -n38;
                        n32 = j;
                    }
                }
                else {
                    final Cell cell4 = this.x[link.a];
                    final double min = Math.min(cell.d, cell4.d);
                    final double max2 = Math.max(cell.d, cell4.d);
                    final double n40 = min * 0.4;
                    final double c = cell.H[j].c;
                    double d = cell.H[j].d;
                    double n42;
                    final double n41 = n42 = -cell.q + cell4.q;
                    double n43 = c;
                    double n44 = n40;
                    if (cell.I[cell.D].s == com.saterskog.cell_lab.h.m) {
                        final double cos3 = Math.cos(c);
                        n42 = n41 - cell.ac * cos3;
                        n44 = n40 + cos3 * cos3 * cell.d * cell.aa;
                        n43 = c + cos3 * cell.ab;
                    }
                    double n47;
                    if (cell4.I[cell4.D].s == com.saterskog.cell_lab.h.m) {
                        final double cos4 = Math.cos(d);
                        final double n45 = cell4.ac;
                        final double d2 = cell4.d;
                        final double n46 = cell4.aa;
                        d += cell4.ab * cos4;
                        n47 = n42 + n45 * cos4;
                        n44 += cos4 * cos4 * d2 * n46;
                    }
                    else {
                        n47 = n42;
                    }
                    double n48 = n44;
                    if (n44 < 0.0 * min * 0.4) {
                        n48 = 0.0 * min * 0.4;
                    }
                    double n49 = n48;
                    if (n48 > min) {
                        n49 = min;
                    }
                    final double cos5 = Math.cos(cell.k + n43);
                    final double sin3 = Math.sin(n43 + cell.k);
                    final double cos6 = Math.cos(cell4.k + d);
                    final double sin4 = Math.sin(d + cell4.k);
                    cell.H[j].g = (float)((cell.d - Cell.a) * cos5 * 0.8);
                    cell.H[j].h = (float)((cell.d - Cell.a) * sin3 * 0.8);
                    cell.H[j].i = (float)((cell4.d - Cell.a) * cos6 * 0.8);
                    cell.H[j].j = (float)((cell4.d - Cell.a) * sin4 * 0.8);
                    final double n50 = cos5 * (cell.d - n49 + link.l);
                    final double n51 = sin3 * (cell.d - n49 + link.l);
                    final double n52 = cos6 * (cell4.d - n49 + link.l);
                    final double n53 = sin4 * (cell4.d - n49 + link.l);
                    if ((cell4.b + n52 - cell.b - n50) * (cell4.b + n52 - cell.b - n50) + (cell4.c + n53 - cell.c - n51) * (cell4.c + n53 - cell.c - n51) > max2 * max2 * 2.0 * 2.0) {
                        for (int n54 = 0; n54 < cell4.C; ++n54) {
                            if (cell4.H[n54].a == n) {
                                cell4.H[n54].a(cell4.H[cell4.C - 1]);
                                --cell4.C;
                                break;
                            }
                        }
                        cell.H[j].a(cell.H[cell.C - 1]);
                        --cell.C;
                        n32 = j - 1;
                    }
                    else {
                        final double e2 = cell.e;
                        final double m = cell.l;
                        final double n55 = -n51;
                        final double f2 = cell.f;
                        final double l2 = cell.l;
                        final double e3 = cell4.e;
                        final double l3 = cell4.l;
                        final double n56 = -n53;
                        final double f3 = cell4.f;
                        final double l4 = cell4.l;
                        final double n57 = 25.0 * cell.w * cell4.w / (cell.w + cell4.w);
                        double n58;
                        if (cell.C > cell4.C) {
                            n58 = n57 / cell.C;
                        }
                        else {
                            n58 = n57 / cell4.C;
                        }
                        final double n59 = cell4.b + n52 - n50 - cell.b;
                        final double n60 = cell4.c + n53 - n51 - cell.c;
                        final double n61 = 1.0 + 2.0 * (n59 * n59 + n60 * n60) / 0.0036;
                        final double n62 = 30.0 * Cell.a / (Cell.a + link.l * 2.0f);
                        final double n63 = (l3 * n56 + e3 - (m * n55 + e2)) * n58 + n59 * n61 * n62;
                        final double n64 = n58 * (l4 * n52 + f3 - (l2 * n50 + f2)) + n60 * n61 * n62;
                        cell.g += n63;
                        cell.h += n64;
                        cell.i += n47;
                        cell4.g -= n63;
                        cell4.h -= n64;
                        cell4.i -= n47;
                        final double n65 = 0.5 * (cell.b + n50 + cell4.b + n52);
                        final double n66 = 0.5 * (cell.c + n51 + cell4.c + n53);
                        cell.j += -n63 * (n66 - cell.c) + (n65 - cell.b) * n64;
                        cell4.j -= n64 * (n65 - cell4.b) + -n63 * (n66 - cell4.c);
                        final double n67 = n51 * n52 - n50 * n53;
                        final double n68 = Math.sqrt(Math.abs(n67)) * Math.signum(n67) * min * cell.H[j].k;
                        cell.j += n68;
                        cell4.j -= n68;
                        n32 = j;
                    }
                }
            }
        }
        int n69 = 0;
        int n72;
        for (int n70 = 0; n70 < 4; ++n70, n69 = n72) {
            int n71 = -1;
            if (n70 == 0) {
                n71 = cell.K;
            }
            if (n70 == 1) {
                n71 = cell.L;
            }
            if (n70 == 2) {
                n71 = cell.M;
            }
            if (n70 == 3) {
                n71 = cell.N;
            }
            n72 = n69;
            if (n71 != -1) {
                final int[] array = this.aV[n71];
                int n73 = 0;
                while (true) {
                    n72 = n69;
                    if (n73 >= this.aW[n71]) {
                        break;
                    }
                    final int n74 = array[n73];
                    int n75 = n69;
                    if (n74 > n) {
                        final int n76 = 1;
                        int n77 = 0;
                        int n78;
                        while (true) {
                            n78 = n76;
                            if (n77 >= n69) {
                                break;
                            }
                            if (this.K[n77] == n74) {
                                n78 = 0;
                                break;
                            }
                            ++n77;
                        }
                        n75 = n69;
                        if (n78 != 0) {
                            this.K[n69] = n74;
                            n75 = n69 + 1;
                        }
                    }
                    ++n73;
                    n69 = n75;
                }
            }
        }
        final double b2 = cell.b;
        final double c2 = cell.c;
        boolean b3;
        if (s == com.saterskog.cell_lab.h.f) {
            b3 = true;
        }
        else {
            b3 = false;
        }
    Label_3494:
        while (true) {
            if (!b3) {
                for (int n79 = 0; n79 < cell.C; ++n79) {
                    if (cell.H[n79].a >= 0) {
                        final Cell cell5 = this.x[cell.H[n79].a];
                        if (cell5.I[cell5.D].s == com.saterskog.cell_lab.h.f) {
                            final boolean b4 = true;
                            break Label_3494;
                        }
                    }
                }
            }
            Label_8099: {
                break Label_8099;
                final boolean b4;
                int n81;
                Cell cell6;
                h s2;
                double b5;
                double c3;
                double a;
                double d3;
                double d4;
                double n82;
                double sqrt3;
                double a2;
                double n83;
                double n84;
                double n85;
                double n86;
                double n87;
                double sqrt4;
                u u;
                u u2;
                double n88;
                double n89;
                double n90;
                double n91;
                double n92;
                int n93;
                int n94;
                double n96;
                double n95;
                double n97;
                double n98;
                int n99;
                Cell cell7;
                int b6;
                int n101;
                Gene gene;
                Gene gene2;
                Gene gene3;
                int b7;
                int n102;
                Gene gene4;
                Gene gene5;
                Gene gene6;
                int n103;
                int n104;
                Link link2;
                Link link3;
                double atan2;
                double n105;
                double n106;
                double n107;
                double n108;
                int n109;
                int n111;
                Cell cell8;
                float[] u3;
                int n113;
                float[] u4;
                int n114;
                int n115;
                int n117;
                Cell cell9;
                float[] u5;
                int n119;
                float[] u6;
                int n120;
                Label_4336_Outer:Label_7145:
                for (int n80 = 0; n80 < n69; ++n80) {
                    n81 = this.K[n80];
                    cell6 = this.x[n81];
                    s2 = cell6.I[cell6.D].s;
                    b5 = cell6.b;
                    c3 = cell6.c;
                    a = (c2 - c3) * (c2 - c3) + (b2 - b5) * (b2 - b5);
                    d3 = cell.d;
                    d4 = cell6.d;
                    n82 = d3 + d4;
                    if (a < n82 * n82 && a != 0.0 && !cell.x && !cell6.x) {
                        sqrt3 = Math.sqrt(a);
                        a2 = (-sqrt3 + d3 - d4) * (-sqrt3 - d3 + d4) * (-sqrt3 + d3 + d4) * (sqrt3 + d3 + d4) / a;
                        n83 = (sqrt3 * sqrt3 - d4 * d4 + d3 * d3) / (2.0 * sqrt3);
                        n84 = (b5 - b2) / sqrt3;
                        n85 = (c3 - c2) / sqrt3;
                        n86 = n83 * n84;
                        n87 = n83 * n85;
                        if (this.U) {
                            if (cell.B >= 20 || cell6.B >= 20) {
                                com.saterskog.b.a.a("skit: Cell touches too many neighbors (>" + Integer.toString(20) + "), not supposed to normally happen and programmer was lazy enough to not gracefully handle this case.");
                            }
                            else {
                                sqrt4 = Math.sqrt(a2);
                                u = cell.A[cell.B];
                                ++cell.B;
                                u2 = cell6.A[cell6.B];
                                ++cell6.B;
                                n88 = sqrt4 / (2.0 * sqrt3);
                                u.a = (c3 - c2) * n88 + n86;
                                u.b = n87 - (b5 - b2) * n88;
                                u.c = n86 - (c3 - c2) * n88;
                                u.d = n87 + (b5 - b2) * n88;
                                u.g = n81;
                                u2.g = n;
                                u.e = false;
                                u.f = false;
                                u2.a = u.c + b2 - b5;
                                u2.b = u.d + c2 - c3;
                                u2.c = u.a + b2 - b5;
                                u2.d = u.b + c2 - c3;
                                u2.e = false;
                                u2.f = false;
                            }
                        }
                        Label_4060: {
                            if (s == com.saterskog.cell_lab.h.r || s2 == com.saterskog.cell_lab.h.r) {
                                a2 = (-sqrt3 + d3 - d4) * (-sqrt3 - d3 + d4) * (-sqrt3 + d3 + d4) * (d3 + sqrt3 + d4) / a;
                                n89 = cell.w * cell6.w / (cell.w + cell6.w);
                                n90 = n89 * (cell6.f - cell.f) / 0.02 * 0.2 * n85 + (cell6.e - cell.e) * n89 / 0.02 * 0.2 * n84;
                                n91 = n84 * n90;
                                n92 = n90 * n85;
                                cell.g += n91;
                                cell.h += n92;
                                cell6.g -= n91;
                                cell6.h -= n92;
                                n93 = 0;
                                while (true) {
                                    while (n93 < cell.C) {
                                        if (cell.H[n93].a == n81) {
                                            n94 = 0;
                                            if (n94 != 0) {
                                                this.aY[this.aX] = n;
                                                this.aZ[this.aX] = n81;
                                                ++this.aX;
                                            }
                                            break Label_4060;
                                        }
                                        else {
                                            ++n93;
                                        }
                                    }
                                    n94 = 1;
                                    continue Label_4336_Outer;
                                }
                            }
                        }
                        n95 = (n96 = a2 * 500.0 / (0.5 / cell.a(6) + 0.5 / cell6.a(6)) / sqrt3);
                        Label_4184: {
                            if (s == com.saterskog.cell_lab.h.q) {
                                n96 = n95;
                                if (s2 == com.saterskog.cell_lab.h.q) {
                                    n96 = n95;
                                    if (cell.o > 0.5) {
                                        n96 = n95;
                                        if (cell6.o > 0.5) {
                                            if (cell.D == cell6.b(1) && cell.b(1) == cell6.D) {
                                                n96 = n95 * -0.6;
                                            }
                                            else {
                                                if (cell.D != cell6.b(1)) {
                                                    n96 = n95;
                                                    if (cell.b(1) != cell6.D) {
                                                        break Label_4184;
                                                    }
                                                }
                                                n96 = n95 * 0.0;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        n97 = (b2 - b5) * n96;
                        n98 = n96 * (c2 - c3);
                        cell.g += n97;
                        cell.h += n98;
                        cell6.g -= n97;
                        cell6.h -= n98;
                        if (s2 == com.saterskog.cell_lab.h.f) {
                            n99 = 1;
                        }
                        else {
                            n99 = 0;
                        }
                        if (n99 == 0) {
                            for (int n100 = 0; n100 < cell6.C; ++n100) {
                                if (cell6.H[n100].a >= 0) {
                                    cell7 = this.x[cell6.H[n100].a];
                                    if (cell7.I[cell7.D].s == com.saterskog.cell_lab.h.f) {
                                        n99 = 1;
                                        break;
                                    }
                                }
                            }
                        }
                        while (true) {
                            if (!this.bg) {
                                if (s == com.saterskog.cell_lab.h.i && n99 == 0 && this.Y.a() < this.T * 5.0) {
                                    if (cell6.E == 1) {
                                        cell6.E = 4;
                                    }
                                    if (cell6.E == 0) {
                                        cell6.E = 3;
                                    }
                                    if (cell6.E == 2) {
                                        cell6.E = 5;
                                    }
                                    b6 = cell.b(0);
                                    n101 = b6 - b6 + 80;
                                    gene = cell.I[b6];
                                    cell6.I[b6].a(gene);
                                    cell6.I[(gene.i + n101) % 80].a(cell.I[gene.i]);
                                    cell6.I[(gene.j + n101) % 80].a(cell.I[gene.j]);
                                    gene2 = cell.I[gene.i];
                                    cell6.I[(gene2.i + n101) % 80].a(cell.I[gene2.i]);
                                    cell6.I[(gene2.j + n101) % 80].a(cell.I[gene2.j]);
                                    gene3 = cell.I[gene.j];
                                    cell6.I[(gene3.i + n101) % 80].a(cell.I[gene3.i]);
                                    cell6.I[(n101 + gene3.j) % 80].a(cell.I[gene3.j]);
                                }
                                if (s2 == com.saterskog.cell_lab.h.i && !b4 && this.Y.a() < this.T * 5.0) {
                                    if (cell.E == 1) {
                                        cell.E = 4;
                                    }
                                    if (cell.E == 0) {
                                        cell.E = 3;
                                    }
                                    if (cell.E == 2) {
                                        cell.E = 5;
                                    }
                                    b7 = cell6.b(0);
                                    n102 = b7 - b7 + 80;
                                    gene4 = cell6.I[b7];
                                    cell.I[b7].a(gene4);
                                    cell.I[(gene4.i + n102) % 80].a(cell6.I[gene4.i]);
                                    cell.I[(gene4.j + n102) % 80].a(cell6.I[gene4.j]);
                                    gene5 = cell6.I[gene4.i];
                                    cell.I[(gene5.i + n102) % 80].a(cell6.I[gene5.i]);
                                    cell.I[(gene5.j + n102) % 80].a(cell6.I[gene5.j]);
                                    gene6 = cell6.I[gene4.j];
                                    cell.I[(gene6.i + n102) % 80].a(cell6.I[gene6.i]);
                                    cell.I[(n102 + gene6.j) % 80].a(cell6.I[gene6.j]);
                                }
                            }
                            Label_5283: {
                                if (((s == com.saterskog.cell_lab.h.h && cell.C < 5 && n99 == 0) || (cell6.I[cell6.D].s == com.saterskog.cell_lab.h.h && cell6.C < 5 && !b4)) && cell.C < 20 && cell6.C < 20 && cell.o >= 0.1 && cell6.o >= 0.1) {
                                    n103 = 0;
                                    while (true) {
                                        while (n103 < cell.C) {
                                            if (cell.H[n103].a == n81) {
                                                n104 = 0;
                                                if (n104 != 0) {
                                                    link2 = cell.H[cell.C];
                                                    link3 = cell6.H[cell6.C];
                                                    link2.b = false;
                                                    link3.b = false;
                                                    link2.a = n81;
                                                    link3.a = n;
                                                    atan2 = Math.atan2(cell6.c - cell.c, cell6.b - cell.b);
                                                    n105 = atan2 - cell.k;
                                                    link3.d = n105;
                                                    link2.c = n105;
                                                    n106 = atan2 + 3.141592653589793 - cell6.k;
                                                    link2.d = n106;
                                                    link3.c = n106;
                                                    link2.k = 0.5f;
                                                    link3.k = 0.5f;
                                                    link2.l = 0.0f;
                                                    link3.l = 0.0f;
                                                    ++cell.C;
                                                    ++cell6.C;
                                                }
                                                break Label_5283;
                                            }
                                            else {
                                                ++n103;
                                            }
                                        }
                                        n104 = 1;
                                        continue;
                                    }
                                }
                            }
                            if (s == com.saterskog.cell_lab.h.d && n99 == 0) {
                                if ((n107 = 0.72 * this.T) > cell6.w - 0.036) {
                                    n107 = cell6.w - 0.036;
                                }
                                cell.w += n107;
                                cell6.w -= n107;
                                cell.p += cell6.p * n107 / cell6.w;
                                cell6.p -= cell6.p * n107 / cell6.w;
                                cell.X += (float)(cell6.X * n107 / cell6.w);
                                cell6.X -= (float)(n107 * cell6.X / cell6.w);
                            }
                            if (s2 == com.saterskog.cell_lab.h.d && !b4) {
                                if ((n108 = 0.72 * this.T) > cell.w - 0.036) {
                                    n108 = cell.w - 0.036;
                                }
                                cell6.w += n108;
                                cell.w -= n108;
                                cell6.p += cell.p * n108 / cell.w;
                                cell.p -= cell.p * n108 / cell.w;
                                cell6.X += (float)(cell.X * n108 / cell.w);
                                cell.X -= (float)(n108 * cell.X / cell.w);
                            }
                            if (s == com.saterskog.cell_lab.h.o && cell.p >= 0.2) {
                                n109 = cell.I[cell.D].u[4];
                                if (n109 == 1 && n99 == 0 && (s2 != com.saterskog.cell_lab.h.o || cell6.b(4) != 1)) {
                                    cell6.X += (float)(60.0 * this.T);
                                }
                                if (n109 == 2 && s2 != com.saterskog.cell_lab.h.f && (s2 != com.saterskog.cell_lab.h.o || cell6.b(4) != 2)) {
                                    cell6.Y += (float)(0.10000000149011612 * this.T);
                                }
                                if (n109 == 3 && cell.o > 0.5) {
                                    for (int n110 = 0; n110 < cell6.C; n110 = n111 + 1) {
                                        if (cell6.H[n110].a == -1) {
                                            n111 = n110;
                                            if ((cell.b - 0.0) * (cell.b - 0.0) + (cell.c - 0.0) * (cell.c - 0.0) < (this.e.k - cell.d) * (this.e.k - cell.d)) {
                                                continue;
                                            }
                                            --cell6.C;
                                            cell6.H[n110].a(cell6.H[cell6.C]);
                                        }
                                        else {
                                            cell8 = this.x[cell6.H[n110].a];
                                            n111 = n110;
                                            if ((cell.b - cell8.b) * (cell.b - cell8.b) + (cell.c - cell8.c) * (cell.c - cell8.c) > (cell.d + cell8.d) * (cell.d + cell8.d)) {
                                                continue;
                                            }
                                            --cell6.C;
                                            cell6.H[n110].a(cell6.H[cell6.C]);
                                            for (int n112 = 0; n112 < cell8.C; ++n112) {
                                                if (cell8.H[n112].a == n81) {
                                                    --cell8.C;
                                                    cell8.H[n112].a(cell8.H[cell8.C]);
                                                }
                                            }
                                        }
                                        n111 = n110 - 1;
                                    }
                                }
                                if (7 <= n109 && n109 < 11 && s2 != com.saterskog.cell_lab.h.e) {
                                    u3 = cell6.U;
                                    n113 = n109 - 7;
                                    u3[n113] -= (float)(60.0 * this.T);
                                }
                                if (11 <= n109 && n109 < 15 && s2 != com.saterskog.cell_lab.h.e) {
                                    u4 = cell6.U;
                                    n114 = n109 - 7 - 4;
                                    u4[n114] += (float)(60.0 * this.T);
                                }
                            }
                            if (s2 != com.saterskog.cell_lab.h.o || cell6.p < 0.2) {
                                continue Label_7145;
                            }
                            n115 = cell6.I[cell6.D].u[4];
                            if (n115 == 1 && !b4 && (s != com.saterskog.cell_lab.h.o || cell.b(4) != 1)) {
                                cell.X += (float)(60.0 * this.T);
                            }
                            if (n115 == 2 && s != com.saterskog.cell_lab.h.f && (s != com.saterskog.cell_lab.h.o || cell.b(4) != 2)) {
                                cell.Y += (float)(0.10000000149011612 * this.T);
                            }
                            if (n115 == 3 && cell6.o > 0.5) {
                                for (int n116 = 0; n116 < cell.C; n116 = n117 + 1) {
                                    if (cell.H[n116].a == -1) {
                                        n117 = n116;
                                        if ((cell6.b - 0.0) * (cell6.b - 0.0) + (cell6.c - 0.0) * (cell6.c - 0.0) < (this.e.k - cell6.d) * (this.e.k - cell6.d)) {
                                            continue;
                                        }
                                        --cell.C;
                                        cell.H[n116].a(cell.H[cell.C]);
                                    }
                                    else {
                                        cell9 = this.x[cell.H[n116].a];
                                        n117 = n116;
                                        if (cell.H[n116].a == n) {
                                            continue;
                                        }
                                        n117 = n116;
                                        if ((cell6.b - cell9.b) * (cell6.b - cell9.b) + (cell6.c - cell9.c) * (cell6.c - cell9.c) > (cell6.d + cell9.d) * (cell6.d + cell9.d)) {
                                            continue;
                                        }
                                        --cell.C;
                                        cell.H[n116].a(cell.H[cell.C]);
                                        for (int n118 = 0; n118 < cell9.C; ++n118) {
                                            if (cell9.H[n118].a == n) {
                                                --cell9.C;
                                                cell9.H[n118].a(cell9.H[cell9.C]);
                                            }
                                        }
                                    }
                                    n117 = n116 - 1;
                                }
                            }
                            if (7 <= n115 && n115 < 11 && s != com.saterskog.cell_lab.h.e) {
                                u5 = cell.U;
                                n119 = n115 - 7;
                                u5[n119] -= (float)(60.0 * this.T);
                            }
                            if (11 <= n115 && n115 < 15 && s != com.saterskog.cell_lab.h.e) {
                                u6 = cell.U;
                                n120 = n115 - 7 - 4;
                                u6[n120] += (float)(60.0 * this.T);
                            }
                            continue Label_7145;
                            continue;
                        }
                    }
                }
                final double a3 = cell.b * cell.b + cell.c * cell.c;
                Label_7649: {
                    if (a3 >= (this.e.k - cell.d) * (this.e.k - cell.d)) {
                        final double sqrt5 = Math.sqrt(a3);
                        final double d5 = cell.d;
                        final double n121 = Math.sqrt((-sqrt5 + d5 - this.e.k) * (-sqrt5 - d5 + this.e.k) * (-sqrt5 + d5 + this.e.k) * (sqrt5 + d5 + this.e.k)) / sqrt5;
                        if (this.U) {
                            if (cell.B >= 20) {
                                com.saterskog.b.a.a("skit: Cell touches too many neighbors (border in this case) (>" + Integer.toString(20) + "), not supposed to normally happen and programmer was lazy enough to not gracefully handle this case.");
                            }
                            else {
                                final double n122 = (d5 * d5 + (sqrt5 * sqrt5 - this.e.k * this.e.k)) / (2.0 * sqrt5);
                                final double n123 = (0.0 - b2) * n122 / sqrt5;
                                final double n124 = n122 * (0.0 - c2) / sqrt5;
                                final u u7 = cell.A[cell.B];
                                ++cell.B;
                                u7.c = (0.0 - c2) * n121 / (2.0 * sqrt5) + n123;
                                u7.d = n124 - (0.0 - b2) * n121 / (2.0 * sqrt5);
                                u7.a = n123 - (0.0 - c2) * n121 / (2.0 * sqrt5);
                                u7.b = n124 + (0.0 - b2) * n121 / (2.0 * sqrt5);
                                u7.g = -1;
                                u7.e = false;
                                u7.f = false;
                            }
                        }
                        if (!this.e.x) {
                            final double n125 = 500.0 / sqrt5 * n121 * n121 * 2.0 * cell.a(6);
                            cell.g -= cell.b * n125;
                            cell.h -= n125 * cell.c;
                            Label_7578: {
                                if (s == com.saterskog.cell_lab.h.h && cell.C < 5 && cell.C < 20) {
                                    int n126 = 0;
                                    while (true) {
                                        while (n126 < cell.C) {
                                            if (cell.H[n126].a == -1) {
                                                final int n127 = 0;
                                                if (n127 != 0) {
                                                    final Link link4 = cell.H[cell.C];
                                                    link4.b = false;
                                                    link4.a = -1;
                                                    link4.c = Math.atan2(cell.c, cell.b) - cell.k;
                                                    link4.e = cell.b / sqrt5 * (this.e.k + Cell.a * 0.4);
                                                    link4.f = cell.c / sqrt5 * (this.e.k + Cell.a * 0.4);
                                                    link4.k = 0.5f;
                                                    link4.l = 0.0f;
                                                    ++cell.C;
                                                }
                                                break Label_7578;
                                            }
                                            else {
                                                ++n126;
                                            }
                                        }
                                        final int n127 = 1;
                                        continue;
                                    }
                                }
                            }
                            if (s == com.saterskog.cell_lab.h.r) {
                                int n128 = 0;
                                while (true) {
                                    while (n128 < cell.C) {
                                        if (cell.H[n128].a == -1) {
                                            final int n129 = 0;
                                            if (n129 != 0) {
                                                this.aY[this.aX] = n;
                                                this.aZ[this.aX] = -1;
                                                ++this.aX;
                                            }
                                            break Label_7649;
                                        }
                                        else {
                                            ++n128;
                                        }
                                    }
                                    final int n129 = 1;
                                    continue;
                                }
                            }
                        }
                    }
                }
                final double n130 = cell.d * this.e.g;
                final double n131 = n130 * (1.0 - 1.0 * this.T * n130 * 0.5 / cell.w);
                cell.g -= cell.e * n131;
                cell.h -= n131 * cell.f;
                if (!this.bg) {
                    final double h = this.e.h;
                    final double n132 = this.e.j * cell.c / this.e.k;
                    final double h2 = cell.h;
                    final double w2 = cell.w;
                    float a4;
                    if (cell.I[cell.D].s == com.saterskog.cell_lab.h.g) {
                        a4 = cell.a(1, 0);
                    }
                    else {
                        a4 = 0.0f;
                    }
                    cell.h = h2 - (a4 - (n132 + h)) * w2 * this.e.i;
                }
                cell.j -= cell.l * cell.d * cell.d * cell.d * this.e.g * 0.5;
                return;
            }
            final boolean b4 = b3;
            continue Label_3494;
        }
    }
    
    private double e(double n, final double n2) {
        final double n3 = (this.P * n + this.Q * n2) / this.e.k;
        final double sqrt = Math.sqrt(n * n + n2 * n2);
        final double n4 = 1.0 + (1.0 - this.e.f) * (1.0 - sqrt / this.e.k) / this.e.f;
        if ((n3 * (1.0 - this.e.f) + this.e.f) * this.e.d / (n4 * n4) < 0.0) {
            n = 0.0;
        }
        else {
            n = -(this.e.d * (-1.0 + this.e.f) * this.e.f * this.e.f * this.e.k * ((-1.0 + this.e.f) * sqrt * sqrt * this.Q + this.e.k * sqrt * this.Q + 2.0 * n2 * (this.P * n + this.Q * n2 + this.e.f * (this.e.k - this.P * n - this.Q * n2))) / (sqrt * Math.pow((-1.0 + this.e.f) * sqrt + this.e.k, 3.0)));
        }
        return n;
    }
    
    private void e(final double n) {
        int n2;
        for (int i = 0; i < this.z; i = n2 + 1) {
            final Cell cell = this.x[i];
            double w = cell.w;
            if (cell.I[cell.D].s == com.saterskog.cell_lab.h.e) {
                w = 0.072 + (cell.w + cell.S - 0.072) / 2.088 * 0.288;
            }
            n2 = i;
            if (w > cell.I[cell.D].b) {
                n2 = i;
                if (cell.o > 0.5) {
                    n2 = i;
                    if (cell.P <= cell.I[cell.D].u[9]) {
                        n2 = i;
                        if (cell.p > 0.2) {
                            n2 = i;
                            if (!cell.x) {
                                n2 = i;
                                if (cell.I[cell.D].s != com.saterskog.cell_lab.h.q) {
                                    n2 = i;
                                    if (this.a((Cell)null)) {
                                        ++this.S;
                                        final Cell cell2 = this.x[this.z - 1];
                                        if (!this.bg && this.I) {
                                            final float n3 = (float)cell.b - this.F;
                                            final float n4 = (float)cell.c - this.G;
                                            final float h = n3 * n3 + n4 * n4;
                                            if (this.H < 0.0f || h < this.H) {
                                                this.H = h;
                                            }
                                        }
                                        cell.O = 0;
                                        cell2.O = 0;
                                        cell2.B = 0;
                                        cell2.a(cell);
                                        cell2.F = 0;
                                        final double k = cell.k;
                                        final double n5 = cell.I[cell.D].d;
                                        double n6;
                                        if (cell.y) {
                                            n6 = -1.0;
                                        }
                                        else {
                                            n6 = 1.0;
                                        }
                                        final double n7 = k + n6 * n5;
                                        final double n8 = cell.d * 0.05 * 2.0;
                                        final double cos = Math.cos(n7);
                                        final double sin = Math.sin(n7);
                                        cell.e -= 0.0 * cos;
                                        cell.f -= 0.0 * sin;
                                        cell.b -= cos * n8 + Math.sin(this.z * 10.34 + 43.0) * 1.0E-7;
                                        cell.c -= sin * n8 + Math.sin(this.z * 17.34 + 137.0) * 1.0E-7;
                                        cell2.e += 0.0 * cos;
                                        cell2.f += 0.0 * sin;
                                        cell2.b += cos * n8 + Math.sin(this.z * 12.34 + 13.4) * 1.0E-7;
                                        cell2.c += n8 * sin + Math.sin(this.z * 19.34 + 63.0) * 1.0E-7;
                                        double w2;
                                        final double n9 = w2 = cell.w;
                                        if (cell.I[cell.D].s == com.saterskog.cell_lab.h.e) {
                                            w2 = n9 + cell.S;
                                        }
                                        cell2.w = cell.I[cell.D].c * w2 - cell.I[cell.I[cell.D].j].s.v;
                                        cell.w = w2 * (1.0f - cell.I[cell.D].c) - cell.I[cell.I[cell.D].i].s.v;
                                        cell.w -= Math.max(0.0f, cell.I[cell.I[cell.D].i].v[6] - 1.0f) * 0.054000005f;
                                        cell2.w -= Math.max(0.0f, cell.I[cell.I[cell.D].j].v[6] - 1.0f) * 0.054000005f;
                                        for (int j = 0; j < 4; ++j) {
                                            final float n10 = cell.U[j];
                                            cell.U[j] = cell.I[cell.D].c * n10 + 1.0E-4f;
                                            cell2.U[j] = n10 * (1.0f - cell.I[cell.D].c) + 1.0E-4f;
                                        }
                                        cell.S = 0.0f;
                                        cell2.S = 0.0f;
                                        cell2.X = cell.X * (1.0f - cell.I[cell.D].c);
                                        cell.X *= cell.I[cell.D].c;
                                        cell2.Y = cell.Y * (1.0f - cell.I[cell.D].c);
                                        cell.Y *= cell.I[cell.D].c;
                                        cell2.p = 0.5 * cell.p;
                                        cell.p *= 0.5;
                                        cell2.o = 0.0;
                                        cell.o = 0.0;
                                        final double n11 = cell.I[cell.D].e;
                                        double n12;
                                        if (cell.y) {
                                            n12 = -1.0;
                                        }
                                        else {
                                            n12 = 1.0;
                                        }
                                        cell.k = n12 * n11 + n7;
                                        final double n13 = cell.I[cell.D].f;
                                        double n14;
                                        if (cell.y) {
                                            n14 = -1.0;
                                        }
                                        else {
                                            n14 = 1.0;
                                        }
                                        cell2.k = n14 * n13 + n7;
                                        cell2.y = (cell.y != cell.I[cell.D].r);
                                        cell.y = (cell.y != cell.I[cell.D].q);
                                        ++cell.m;
                                        --cell2.m;
                                        for (int l = 0; l < cell.C; ++l) {
                                            if (cell.H[l].a != -1) {
                                                for (int n15 = 0; n15 < this.x[cell.H[l].a].C; ++n15) {
                                                    if (this.x[cell.H[l].a].H[n15].a == i) {
                                                        this.x[cell.H[l].a].H[n15].a(this.x[cell.H[l].a].H[this.x[cell.H[l].a].C - 1]);
                                                        final Cell cell3 = this.x[cell.H[l].a];
                                                        --cell3.C;
                                                        break;
                                                    }
                                                }
                                            }
                                            this.J[l].a(cell.H[l]);
                                        }
                                        final int c = cell.C;
                                        cell.C = 0;
                                        cell2.C = 0;
                                        cell.x = false;
                                        cell2.x = false;
                                        if (cell.T != -1) {
                                            --cell.T;
                                            --cell2.T;
                                            if (cell.T <= 0) {
                                                cell.x = true;
                                                cell2.x = true;
                                            }
                                        }
                                        int n16 = -1;
                                        double n17 = -1.0;
                                        double n18 = 1.0;
                                        if (cell.I[cell.D].m || cell.I[cell.D].n) {
                                            int n19 = 0;
                                            double n20 = 1.0;
                                            double n21 = -1.0;
                                            int n22 = -1;
                                            int n23 = -1;
                                            int n24 = -1;
                                        Label_1966_Outer:
                                            while (n19 < c) {
                                                double n25 = n18;
                                                double n26 = n21;
                                                int n27 = n22;
                                                int n28 = n24;
                                                while (true) {
                                                    Label_3736: {
                                                        if (this.J[n19].a == -1) {
                                                            break Label_3736;
                                                        }
                                                        final double cos2 = Math.cos(this.J[n19].c + k);
                                                        final double sin2 = Math.sin(this.J[n19].c + k);
                                                        final double n29 = cos * cos2 + sin * sin2 - 2.0 * (0.5 - cell.b().c);
                                                        n25 = n18;
                                                        n26 = n21;
                                                        n27 = n22;
                                                        n28 = n24;
                                                        if (n29 > 0.2) {
                                                            break Label_3736;
                                                        }
                                                        n25 = n18;
                                                        n26 = n21;
                                                        n27 = n22;
                                                        n28 = n24;
                                                        if (n29 < -0.2) {
                                                            break Label_3736;
                                                        }
                                                        final double n30 = (this.x[this.J[n19].a].b - cell.b) * cos + (this.x[this.J[n19].a].c - cell.c) * sin;
                                                        double n32;
                                                        double n34;
                                                        int n35;
                                                        int n36;
                                                        double n37;
                                                        if (cos2 * -sin + sin2 * cos > 0.0) {
                                                            double n31 = n21;
                                                            if (n30 > n21) {
                                                                n31 = n30;
                                                                n24 = n19;
                                                            }
                                                            n25 = n18;
                                                            n26 = n31;
                                                            n27 = n22;
                                                            n28 = n24;
                                                            if (n30 >= n20) {
                                                                break Label_3736;
                                                            }
                                                            n32 = n31;
                                                            final int n33 = n22;
                                                            n23 = n19;
                                                            n34 = n18;
                                                            n35 = n24;
                                                            n36 = n33;
                                                            n37 = n30;
                                                        }
                                                        else {
                                                            double n38 = n18;
                                                            if (n30 < n18) {
                                                                n38 = n30;
                                                                n22 = n19;
                                                            }
                                                            n25 = n38;
                                                            n26 = n21;
                                                            n27 = n22;
                                                            n28 = n24;
                                                            if (n30 <= n17) {
                                                                break Label_3736;
                                                            }
                                                            n16 = n19;
                                                            n37 = n20;
                                                            n32 = n21;
                                                            final int n39 = n24;
                                                            n17 = n30;
                                                            n34 = n38;
                                                            n36 = n22;
                                                            n35 = n39;
                                                        }
                                                        ++n19;
                                                        final int n40 = n35;
                                                        final double n41 = n32;
                                                        n20 = n37;
                                                        n18 = n34;
                                                        n21 = n41;
                                                        n22 = n36;
                                                        n24 = n40;
                                                        continue Label_1966_Outer;
                                                    }
                                                    double n34 = n25;
                                                    double n37 = n20;
                                                    double n32 = n26;
                                                    int n36 = n27;
                                                    int n35 = n28;
                                                    continue;
                                                }
                                            }
                                            for (int n42 = 0; n42 < c; ++n42) {
                                                if (this.J[n42].a != -1) {
                                                    final double n43 = Math.cos(this.J[n42].c + k) * cos + Math.sin(this.J[n42].c + k) * sin - 2.0 * (0.5 - cell.b().c);
                                                    if (cell.I[cell.D].n && (n43 > 0.2 || (n43 > -0.2 && (n42 == n24 || n42 == n16))) && cell2.C < 20 && this.x[this.J[n42].a].C < 20) {
                                                        cell2.H[cell2.C].a(this.J[n42]);
                                                        cell2.H[cell2.C].c = this.J[n42].c + k - cell2.k;
                                                        cell2.H[cell2.C].d = this.J[n42].d;
                                                        this.x[this.J[n42].a].H[this.x[this.J[n42].a].C].a(this.J[n42]);
                                                        this.x[this.J[n42].a].H[this.x[this.J[n42].a].C].a = this.z - 1;
                                                        this.x[this.J[n42].a].H[this.x[this.J[n42].a].C].c = cell2.H[cell2.C].d;
                                                        this.x[this.J[n42].a].H[this.x[this.J[n42].a].C].d = cell2.H[cell2.C].c;
                                                        final Cell cell4 = this.x[this.J[n42].a];
                                                        ++cell4.C;
                                                        ++cell2.C;
                                                    }
                                                    if (cell.I[cell.D].m && (n43 < -0.2 || (n43 < 0.2 && (n42 == n23 || n42 == n22))) && cell.C < 20 && this.x[this.J[n42].a].C < 20) {
                                                        cell.H[cell.C].a(this.J[n42]);
                                                        cell.H[cell.C].c = this.J[n42].c + k - cell.k;
                                                        cell.H[cell.C].d = this.J[n42].d;
                                                        this.x[this.J[n42].a].H[this.x[this.J[n42].a].C].a(this.J[n42]);
                                                        this.x[this.J[n42].a].H[this.x[this.J[n42].a].C].a = i;
                                                        this.x[this.J[n42].a].H[this.x[this.J[n42].a].C].c = cell.H[cell.C].d;
                                                        this.x[this.J[n42].a].H[this.x[this.J[n42].a].C].d = cell.H[cell.C].c;
                                                        final Cell cell5 = this.x[this.J[n42].a];
                                                        ++cell5.C;
                                                        ++cell.C;
                                                    }
                                                }
                                            }
                                        }
                                        if (cell.I[cell.D].l && 20 > cell.C && 20 > cell2.C) {
                                            final Link link = cell.H[cell.C];
                                            final Link link2 = cell2.H[cell2.C];
                                            link.b = true;
                                            link2.b = true;
                                            link.a = this.z - 1;
                                            link2.a = i;
                                            final double n44 = n7 - cell.k;
                                            link.c = n44;
                                            link2.d = n44;
                                            final double n45 = 3.141592653589793 + n7 - cell2.k;
                                            link2.c = n45;
                                            link.d = n45;
                                            final float h2 = cell.I[cell.D].h;
                                            link.k = h2;
                                            link2.k = h2;
                                            final float a = cell.a(5);
                                            link.l = a;
                                            link2.l = a;
                                            ++cell.C;
                                            ++cell2.C;
                                        }
                                        cell2.D = cell.I[cell.D].j;
                                        cell.D = cell.I[cell.D].i;
                                        if (cell.I[cell.D].s == com.saterskog.cell_lab.h.e) {
                                            if (cell.w > 0.36) {
                                                cell.S = (float)(cell.w - 0.36);
                                                cell.w = 0.36;
                                            }
                                        }
                                        else if (cell.w > 0.36) {
                                            cell.w = 0.36;
                                        }
                                        if (cell2.I[cell2.D].s == com.saterskog.cell_lab.h.e) {
                                            if (cell2.w > 0.36) {
                                                cell2.S = (float)(cell2.w - 0.36);
                                                cell2.w = 0.36;
                                            }
                                        }
                                        else if (cell2.w > 0.36) {
                                            cell2.w = 0.36;
                                        }
                                        if (cell.I[cell.D].s == com.saterskog.cell_lab.h.b) {
                                            for (int n46 = 0; n46 < cell.C; ++n46) {
                                                if (Math.cos(cell.H[n46].c) < -0.8) {
                                                    cell.x = true;
                                                }
                                            }
                                        }
                                        if (cell2.I[cell2.D].s == com.saterskog.cell_lab.h.b) {
                                            for (int n47 = 0; n47 < cell2.C; ++n47) {
                                                if (Math.cos(cell2.H[n47].c) < -0.8) {
                                                    cell2.x = true;
                                                }
                                            }
                                        }
                                        if (cell2.w <= 0.0) {
                                            this.a(this.z - 1, false);
                                        }
                                        n2 = i;
                                        if (cell.w <= 0.0) {
                                            this.a(i, false);
                                            n2 = i - 1;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            cell.j = 0.0;
            cell.h = 0.0;
            cell.g = 0.0;
            cell.i = -cell.q * 0.30000001192092896;
            if (cell.I[cell.D].s == com.saterskog.cell_lab.h.b) {
                final float a2 = cell.a(0, 0);
                cell.r += (float)(a2 * n);
                while (cell.r * 112.5 > 62.83185307179586) {
                    cell.r -= (float)0.5585053606381855;
                }
                if (!this.bg) {
                    cell.g += Math.cos(cell.k) * a2;
                    cell.h += Math.sin(cell.k) * a2;
                }
            }
        }
    }
    
    private void f(final double n) {
        for (int i = 0; i < this.z; ++i) {
            final Cell cell = this.x[i];
            if (cell.o > 5.0 * n) {
                cell.d += (cell.w / 400.0 / cell.d - cell.d) * 0.5 * 10.0 * n;
                if (cell.d > 0.03) {
                    cell.d = 0.03;
                }
            }
            if (cell.d > 0.03 || cell.d < Cell.a || cell.w < 0.072 || cell.Y > 1.0f) {
                cell.x = true;
            }
            if (cell.F < 100) {
                cell.b += cell.e * n;
                cell.c += cell.f * n;
                cell.k += cell.l * n;
            }
            cell.m += cell.n * n;
            if (cell.k > 3.141592653589793) {
                cell.k -= 6.283185307179586;
            }
            if (cell.k < -3.141592653589793) {
                cell.k += 6.283185307179586;
            }
            if (cell.m > 6.283185307179586) {
                cell.m -= 12.566370614359172;
            }
            if (cell.m < -6.283185307179586) {
                cell.m += 12.566370614359172;
            }
            cell.B = 0;
            cell.P = cell.C;
        }
    }
    
    private void g() {
        for (int i = 0; i < this.aW.length; ++i) {
            this.aW[i] = 0;
        }
        for (int j = 0; j < this.bc.length; ++j) {
            this.bc[j] = 0;
        }
        for (int z = this.z, k = 0; k < z; ++k) {
            final Cell cell = this.x[k];
            final int n = (int)((this.e.k + cell.b) / (2.0 * this.e.k) * this.bd + 1.0) + (int)((this.e.k + cell.c) / (2.0 * this.e.k) * this.bd + 1.0) * (this.bd + 2);
            final int n2 = this.bc[n];
            if (n2 < 404) {
                this.ba[n][n2] = k;
                this.bb[n][n2] = 0;
                final int[] bc = this.bc;
                ++bc[n];
                if (cell.I[cell.D].s == com.saterskog.cell_lab.h.o && cell.p >= 0.2) {
                    if (cell.I[cell.D].u[4] == 0) {
                        this.ba[n][n2] = -1 - k;
                        this.bb[n][n2] = 1;
                        final int[] bc2 = this.bc;
                        ++bc2[n];
                    }
                    if (cell.I[cell.D].u[4] == 4) {
                        this.ba[n][n2] = -1 - k;
                        this.bb[n][n2] = 2;
                        final int[] bc3 = this.bc;
                        ++bc3[n];
                    }
                    if (cell.I[cell.D].u[4] == 5) {
                        this.ba[n][n2] = -1 - k;
                        this.bb[n][n2] = 3;
                        final int[] bc4 = this.bc;
                        ++bc4[n];
                    }
                    if (cell.I[cell.D].u[4] == 6) {
                        this.ba[n][n2] = -1 - k;
                        this.bb[n][n2] = 5;
                        final int[] bc5 = this.bc;
                        ++bc5[n];
                    }
                }
            }
            else {
                com.saterskog.b.a.a("smellGridnMAX exhausted");
            }
            final int n3 = (int)((this.e.k + cell.b - cell.d) / (2.0 * this.e.k) * this.Z + 1.0);
            cell.K = (int)((this.e.k + cell.c - cell.d) / (2.0 * this.e.k) * this.Z + 1.0) * (this.Z + 2) + n3;
            if (this.aW[cell.K] < 203) {
                this.aV[cell.K][this.aW[cell.K]] = k;
                final int[] aw = this.aW;
                final int l = cell.K;
                ++aw[l];
            }
            else {
                com.saterskog.b.a.a("gridnMAX exhausted: 203, " + cell.K);
            }
            final int n4 = (int)((this.e.k + cell.c + cell.d) / (2.0 * this.e.k) * this.Z + 1.0);
            cell.L = n3 + (this.Z + 2) * n4;
            if (cell.L == cell.K) {
                cell.L = -1;
            }
            else if (this.aW[cell.L] < 203) {
                this.aV[cell.L][this.aW[cell.L]] = k;
                final int[] aw2 = this.aW;
                final int m = cell.L;
                ++aw2[m];
            }
            else {
                com.saterskog.b.a.a("gridnMAX exhausted: 203");
            }
            final int n5 = (int)((this.e.k + cell.b + cell.d) / (2.0 * this.e.k) * this.Z + 1.0);
            cell.M = n4 * (this.Z + 2) + n5;
            if (cell.M == cell.K || cell.M == cell.L) {
                cell.M = -1;
            }
            else if (this.aW[cell.M] < 203) {
                this.aV[cell.M][this.aW[cell.M]] = k;
                final int[] aw3 = this.aW;
                final int m2 = cell.M;
                ++aw3[m2];
            }
            else {
                com.saterskog.b.a.a("gridnMAX exhausted: 203");
            }
            cell.N = n5 + (int)((this.e.k + cell.c - cell.d) / (2.0 * this.e.k) * this.Z + 1.0) * (this.Z + 2);
            if (cell.N == cell.K || cell.N == cell.L || cell.N == cell.M) {
                cell.N = -1;
            }
            else if (this.aW[cell.N] < 203) {
                this.aV[cell.N][this.aW[cell.N]] = k;
                final int[] aw4 = this.aW;
                final int n6 = cell.N;
                ++aw4[n6];
            }
            else {
                com.saterskog.b.a.a("gridnMAX exhausted: 203");
            }
        }
    }
    
    private void g(final double n) {
        for (int i = 0; i < this.z; ++i) {
            final Cell cell = this.x[i];
            final Gene b = cell.b();
            cell.Q = cell.w;
            cell.Z = cell.X - 0.05f * cell.X * (float)n;
            cell.Y += (float)((Math.min(cell.X, 10.0f) - cell.Y) * 0.05f * n);
            cell.R = cell.p;
            if (cell.p < this.e.z) {
                cell.R += 1.2 * (this.e.z - cell.p) * n;
            }
            if (this.bg && b.s.s) {
                cell.Q += 280.0 * cell.d * cell.d * n;
            }
            final Environment e = this.e;
            final Gene b2 = cell.b();
            h h = b2.s;
            cell.o += n;
            switch (Cell.Cell$2.a[h.ordinal()]) {
                case 1: {
                    final float a = cell.a(0, 0);
                    cell.Q -= a * (0.008 + a * 0.0409756) * n;
                    break;
                }
                case 2: {
                    if (cell.o <= 0.5) {
                        break;
                    }
                    if (cell.a(5, 0) > 0.5f) {
                        cell.D = cell.b(0);
                        h = b2.s;
                        cell.o = 0.0;
                        break;
                    }
                    if (cell.a(6, 0) > 0.5f) {
                        cell.D = cell.b(1);
                        h = b2.s;
                        cell.o = 0.0;
                        break;
                    }
                    break;
                }
                case 3: {
                    if (n != 0.0) {
                        final float a2 = cell.a(3, 0);
                        final float a3 = cell.a(2, 0);
                        int n2;
                        if (cell.y) {
                            n2 = -1;
                        }
                        else {
                            n2 = 1;
                        }
                        final float ab = n2 * a3;
                        final float a4 = cell.a(4, 0);
                        cell.Q -= 7.999999797903001E-5 / n * ((a2 - cell.aa) * (a2 - cell.aa) + (ab - cell.ab) * (ab - cell.ab) + (a4 - cell.ac) * (a4 - cell.ac));
                        cell.aa = a2;
                        cell.ab = ab;
                        cell.ac = a4;
                        break;
                    }
                    break;
                }
                case 4: {
                    cell.R = 1.0;
                    break;
                }
                case 5: {
                    cell.Q += 400.0 * this.c(cell.b, cell.c) * cell.d * cell.d * n;
                }
                case 6:
                case 7: {
                    cell.n += (cell.l - cell.n) * Math.abs(cell.l - cell.n) * 1.0 * n;
                }
                case 9: {
                    cell.t += (-cell.l * cell.d - cell.t * 100.0 * Math.abs(cell.t)) * n;
                    final double sqrt = Math.sqrt(cell.u * cell.u + cell.v * cell.v);
                    cell.u += (-cell.e - cell.u * 100.0 * sqrt) * n;
                    cell.v += (-cell.f - sqrt * (cell.v * 100.0)) * n;
                    break;
                }
                case 10: {
                    final double a5 = cell.a(2, 0) * n;
                    final double a6 = cell.a(4, 0) * n;
                    cell.Q -= (Math.abs(a5) + Math.abs(a6)) * 0.001;
                    cell.r += (float)(a5 * 0.3);
                    cell.s += (float)(a6 * 0.3);
                    while (cell.r * 112.5 > 62.83185307179586) {
                        cell.r -= (float)0.5585053606381855;
                    }
                    while (cell.r * 112.5 < -62.83185307179586) {
                        cell.r += (float)0.5585053606381855;
                    }
                    while (cell.s * 112.5 > 62.83185307179586) {
                        cell.s -= (float)0.5585053606381855;
                    }
                    while (cell.s * 112.5 < -62.83185307179586) {
                        cell.s += (float)0.5585053606381855;
                    }
                    break;
                }
                case 11: {
                    if (cell.R > 0.25) {
                        cell.R -= 0.44999999999999996 * n;
                        if (cell.R < 0.25) {
                            cell.R = 0.25;
                        }
                    }
                    if (cell.R >= 0.2) {
                        cell.r += (float)n;
                        break;
                    }
                    break;
                }
            }
            cell.Q -= h.u * (1.38571428571 - 1.28571428571 * e.n) * 400.0 * (cell.d + 0.0075) * cell.d * n;
            if (e.v && cell.o > 240.0) {
                cell.x = true;
            }
            if (cell.b != cell.b || cell.c != cell.c || cell.w != cell.w) {
                cell.x = true;
            }
            ++cell.O;
            if (cell.O == 15) {
                cell.O = 0;
                if (this.Y.nextDouble() < e.c * n * 40.0 * 15.0 / 3.0) {
                    for (int j = 0; j < 3; ++j) {
                        if (this.Y.nextInt(5) != 0) {
                            ++cell.G;
                            final Gene gene = cell.I[this.Y.nextInt(80)];
                            final d y = this.Y;
                            final boolean u = e.u;
                            final int nextInt = y.nextInt(3054);
                            switch (nextInt) {
                                case 0: {
                                    for (int k = 0; k < 3; ++k) {
                                        final float[] a7 = gene.a;
                                        a7[k] += (float)(y.nextGaussian() * 0.15);
                                        if (gene.a[k] < 0.0f) {
                                            gene.a[k] = 0.0f;
                                        }
                                        if (gene.a[k] > 1.0f) {
                                            gene.a[k] = 1.0f;
                                        }
                                    }
                                    break;
                                }
                                case 1: {
                                    gene.d += (float)y.nextGaussian();
                                    while (gene.d < 0.0f) {
                                        gene.d += (float)6.283185307179586;
                                    }
                                    while (gene.d > 6.283185307179586) {
                                        gene.d -= (float)6.283185307179586;
                                    }
                                    break;
                                }
                                case 2: {
                                    gene.e += (float)y.nextGaussian();
                                    while (gene.e < 0.0f) {
                                        gene.e += (float)6.283185307179586;
                                    }
                                    while (gene.e > 6.283185307179586) {
                                        gene.e -= (float)6.283185307179586;
                                    }
                                    break;
                                }
                                case 3: {
                                    gene.f += (float)y.nextGaussian();
                                    while (gene.f < 0.0f) {
                                        gene.f += (float)6.283185307179586;
                                    }
                                    while (gene.f > 6.283185307179586) {
                                        gene.f -= (float)6.283185307179586;
                                    }
                                    break;
                                }
                                case 4: {
                                    gene.g *= (float)Math.exp(y.nextGaussian() / 2.0);
                                    if (gene.g > 10.0f) {
                                        gene.g = 10.0f;
                                    }
                                    if (gene.g < 0.1f) {
                                        gene.g = 0.1f;
                                        break;
                                    }
                                    break;
                                }
                                case 5: {
                                    gene.b *= (float)Math.exp(y.nextGaussian() / 2.0);
                                    if (gene.b > 0.3672f) {
                                        gene.b = 0.3672f;
                                    }
                                    if (gene.b < 0.0648f) {
                                        gene.b = 0.0648f;
                                        break;
                                    }
                                    break;
                                }
                                case 6: {
                                    gene.c += (float)(y.nextGaussian() * 0.2);
                                    if (gene.c < 0.1f) {
                                        gene.c = 0.1f;
                                    }
                                    if (gene.c > 0.9f) {
                                        gene.c = 0.9f;
                                        break;
                                    }
                                    break;
                                }
                                case 7: {
                                    if (!u) {
                                        gene.i = y.nextInt(80);
                                        break;
                                    }
                                    break;
                                }
                                case 8: {
                                    if (!u) {
                                        gene.j = y.nextInt(80);
                                        break;
                                    }
                                    break;
                                }
                                case 9: {
                                    if (!u) {
                                        gene.l = !gene.l;
                                        break;
                                    }
                                    break;
                                }
                                case 10: {
                                    if (!u) {
                                        gene.m = !gene.m;
                                        break;
                                    }
                                    break;
                                }
                                case 11: {
                                    if (!u) {
                                        gene.n = !gene.n;
                                        break;
                                    }
                                    break;
                                }
                                case 12: {
                                    if (!u) {
                                        do {
                                            gene.s = com.saterskog.cell_lab.h.B[y.nextInt(com.saterskog.cell_lab.h.B.length)];
                                        } while (!e.t[gene.s.ordinal()]);
                                        break;
                                    }
                                    break;
                                }
                                case 14: {
                                    gene.o = !gene.o;
                                    break;
                                }
                                case 18: {
                                    gene.q = !gene.q;
                                    break;
                                }
                                case 19: {
                                    gene.r = !gene.r;
                                    break;
                                }
                                case 20: {
                                    gene.h = Gene.a(0.0f, 35.0f, gene.h, y);
                                    break;
                                }
                            }
                            if (nextInt >= 22 && nextInt < 33) {
                                final int n3 = nextInt - 22;
                                if (!u && n3 != 10) {
                                    gene.u[n3] = y.nextInt(Gene.w[n3]);
                                }
                            }
                            if (nextInt >= 33 && nextInt < 44 && !u) {
                                gene.t[nextInt - 33].d = (short)y.nextInt(8);
                            }
                            if (nextInt >= 44 && nextInt < 55 && !u) {
                                gene.t[nextInt - 44].e = (short)y.nextInt(3);
                            }
                            if (nextInt >= 55 && nextInt < 66) {
                                final int n4 = nextInt - 55;
                                gene.t[n4].a = Gene.a(-8.0f, 8.0f, gene.t[n4].a, y);
                            }
                            if (nextInt >= 66 && nextInt < 77) {
                                final int n5 = nextInt - 66;
                                gene.t[n5].b = Gene.a(-8.0f, 8.0f, gene.t[n5].b, y);
                            }
                            if (nextInt >= 77 && nextInt < 88) {
                                final int n6 = nextInt - 77;
                                gene.t[n6].c = Gene.a(-8.0f, 8.0f, gene.t[n6].c, y);
                            }
                            if (nextInt >= 88 && nextInt < 3054) {
                                final int n7 = nextInt - 88;
                                gene.v[n7] = Gene.a(Gene.z[n7], Gene.A[n7], gene.v[n7], y);
                            }
                        }
                        else if (!e.u) {
                            ++cell.G;
                            int n8;
                            int l;
                            for (l = (n8 = this.Y.nextInt(80)); l == n8; n8 = this.Y.nextInt(80)) {}
                            final int nextInt2 = this.Y.nextInt(3);
                            if (nextInt2 == 0) {
                                if (this.Y.nextInt(2) == 0) {
                                    cell.I[n8].a(cell.I[cell.I[l].i]);
                                    cell.I[l].i = n8;
                                }
                                else {
                                    cell.I[n8].a(cell.I[cell.I[l].j]);
                                    cell.I[l].j = n8;
                                }
                            }
                            if (nextInt2 == 1) {
                                cell.I[n8].l = true;
                                if (this.Y.nextInt(2) == 0) {
                                    cell.I[n8].i = cell.I[l].i;
                                    cell.I[n8].j = cell.I[l].i;
                                    cell.I[l].i = n8;
                                }
                                else {
                                    cell.I[n8].i = cell.I[l].j;
                                    cell.I[n8].j = cell.I[l].j;
                                    cell.I[l].j = n8;
                                }
                            }
                            if (nextInt2 == 2) {
                                int nextInt3;
                                for (nextInt3 = l; nextInt3 == l || nextInt3 == n8; nextInt3 = this.Y.nextInt(80)) {}
                                if (this.Y.nextInt(2) == 0) {
                                    final int m = cell.I[l].j;
                                    cell.I[l].j = n8;
                                    if (this.Y.nextInt(2) == 0) {
                                        cell.I[n8].i = nextInt3;
                                        cell.I[n8].j = m;
                                    }
                                    else {
                                        cell.I[n8].i = m;
                                        cell.I[n8].j = nextInt3;
                                    }
                                }
                                else {
                                    final int i2 = cell.I[l].i;
                                    cell.I[l].i = n8;
                                    if (this.Y.nextInt(2) == 0) {
                                        cell.I[n8].i = nextInt3;
                                        cell.I[n8].j = i2;
                                    }
                                    else {
                                        cell.I[n8].i = i2;
                                        cell.I[n8].j = nextInt3;
                                    }
                                }
                            }
                        }
                    }
                }
            }
            for (int n9 = 0; n9 < 3; ++n9) {
                final float[] j2 = cell.J;
                j2[n9] += (float)((cell.I[cell.D].a[n9] - cell.J[n9]) * 8.0 * n);
            }
            final double a8 = cell.a();
            double n11;
            final double n10 = n11 = b.g;
            if (b.b > 0.36) {
                n11 = n10;
                if (a8 > 0.34559999999999996) {
                    n11 = 0.0;
                }
            }
            double n12 = n11;
            if (b.o) {
                n12 = n11;
                if (cell.w < 0.0936) {
                    n12 = n11 + 462.96296296296276 * (0.0936 - cell.w);
                }
            }
            for (int n13 = 0; n13 < cell.C; ++n13) {
                if (cell.H[n13].a != -1) {
                    final Cell cell2 = this.x[cell.H[n13].a];
                    final double n14 = cell2.I[cell2.D].g;
                    final double a9 = cell2.a();
                    double n15 = n14;
                    if (cell2.I[cell2.D].b > 0.36) {
                        n15 = n14;
                        if (a9 > 0.34559999999999996) {
                            n15 = 0.0;
                        }
                    }
                    double n16 = n15;
                    if (cell2.I[cell2.D].o) {
                        n16 = n15;
                        if (cell2.w < 0.0936) {
                            n16 = n15 + 462.96296296296276 * (0.0936 - cell2.w);
                        }
                    }
                    double n17;
                    if ((n17 = n16 * a8 - a9 * n12) > 0.1) {
                        n17 = 0.1;
                    }
                    double n18 = n17;
                    if (n17 < -0.1) {
                        n18 = -0.1;
                    }
                    cell.Q -= n18 * n;
                    double n19;
                    if ((n19 = cell.p - cell2.p) > 0.6) {
                        n19 = 0.6;
                    }
                    double n20 = n19;
                    if (n19 < -0.6) {
                        n20 = -0.6;
                    }
                    cell.R -= n20 * n;
                    cell.Z += (float)((cell2.X - cell.X) * 3.0f * n);
                }
            }
            if (b.s == com.saterskog.cell_lab.h.e) {
                if (cell.Q > 0.36) {
                    cell.S += (float)(cell.Q - 0.36);
                    cell.Q = 0.36;
                    if (cell.S > 1.8f) {
                        cell.S = 1.8f;
                    }
                }
                else if (cell.S > 0.0f) {
                    final double min = Math.min(cell.S, 0.36 - cell.Q);
                    cell.Q += min;
                    cell.S -= (float)min;
                }
            }
            else if (cell.Q > 0.36) {
                cell.Q = 0.36;
            }
            if (cell.R > 1.0) {
                cell.R = 1.0;
            }
            if (cell.p < 0.1) {
                cell.x = true;
            }
        }
    }
    
    private void h() {
        for (int i = 0; i < this.aX; ++i) {
            final Cell cell = this.x[this.aY[i]];
            Cell cell2 = null;
            final double b = cell.b;
            final double c = cell.c;
            final double d = cell.d;
            double n = 0.0;
            double n2 = 0.0;
            double n3;
            double n4;
            double n5;
            double n6;
            double n7;
            double n8;
            if (this.aZ[i] == -1) {
                n3 = Math.sqrt(b * b + c * c);
                n4 = this.e.k - n3;
                n5 = b / n3;
                n6 = c / n3;
                n7 = n4 * n5;
                n8 = n4 * n6;
            }
            else {
                cell2 = this.x[this.aZ[i]];
                final double b2 = cell2.b;
                final double c2 = cell2.c;
                final double d2 = cell2.d;
                n3 = Math.sqrt((b - b2) * (b - b2) + (c - c2) * (c - c2));
                n4 = (d * d + (n3 * n3 - d2 * d2)) / (2.0 * n3);
                n5 = (b2 - b) / n3;
                n6 = (c2 - c) / n3;
                n7 = n4 * n5;
                n8 = n4 * n6;
                n = cell2.g - (c + n8 - c2) * cell2.j;
                n2 = (b + n7 - b2) * cell2.j + cell2.h;
            }
            final double n9 = cell.g - n8 * cell.j - n;
            final double n10 = n7 * cell.j + cell.h - n2;
            final double n11 = n5 * n9 + n6 * n10;
            double n13;
            final double n12 = n13 = 0.0;
            Label_0272: {
                if (cell.I[cell.D].s == com.saterskog.cell_lab.h.r) {
                    final double n14 = Math.cos(cell.k) * n6 - Math.sin(cell.k) * n5;
                    if (n14 >= -0.2) {
                        n13 = n12;
                        if (n14 <= 0.2) {
                            break Label_0272;
                        }
                    }
                    if (0.0 < n14 != cell.y) {
                        n13 = 0.0 + n14 * 0.075 * cell.a(2, 0);
                    }
                    else {
                        n13 = 0.0 + n14 * 0.075 * cell.a(4, 0);
                    }
                }
            }
            double n15 = n13;
            Label_0396: {
                if (this.aZ[i] != -1) {
                    n15 = n13;
                    if (cell2.I[cell2.D].s == com.saterskog.cell_lab.h.r) {
                        final double n16 = Math.sin(cell2.k) * n5 + Math.cos(cell2.k) * -n6;
                        if (n16 >= -0.2) {
                            n15 = n13;
                            if (n16 <= 0.2) {
                                break Label_0396;
                            }
                        }
                        if (0.0 < n16 != cell2.y) {
                            n15 = n13 + 0.075 * n16 * cell2.a(2, 0);
                        }
                        else {
                            n15 = n13 + 0.075 * n16 * cell2.a(4, 0);
                        }
                    }
                }
            }
            final double n17 = cell.w * cell.d * cell.d * 0.7;
            double n18 = 0.0;
            double n19;
            if (this.aZ[i] == -1) {
                n19 = 1.0 / (1.0 / cell.w + 1.0 * (n4 * n4 / n17)) / 0.02 * 0.9;
            }
            else {
                n18 = cell2.w * cell2.d * cell2.d * 0.7;
                n19 = 1.0 / (1.0 / cell.w + 1.0 / cell2.w + 1.0 * (n4 * n4 / n17 + (n3 - n4) * (n3 - n4) / n18)) / 0.02 * 0.9;
            }
            final double n20 = -(n9 - n5 * n11 + n6 * n15) * n19;
            final double n21 = n19 * -(n10 - n6 * n11 - n15 * n5);
            cell.e += 0.02 * n20 / cell.w;
            cell.f += 0.02 * n21 / cell.w;
            cell.l += 1.0 * n4 * (-n20 * n6 + n21 * n5) * 0.02 / n17;
            if (this.aZ[i] != -1) {
                cell2.e -= 0.02 * n20 / cell2.w;
                cell2.f -= 0.02 * n21 / cell2.w;
                cell2.l += (n3 - n4) * 1.0 * (-n20 * n6 + n21 * n5) * 0.02 / n18;
            }
        }
    }
    
    private void h(final double n) {
        int n3;
        for (int i = 0; i < this.C; i = n3 + 1) {
            final e e = this.y[i];
            e.d += 0.5 * n;
            final double n2 = this.y[i].c / 0.03;
            n3 = i;
            if (this.y[i].d > n2 * (1.0 * n2)) {
                final e e2 = this.y[i];
                final e e3 = this.y[this.C - 1];
                e2.a = e3.a;
                e2.b = e3.b;
                e2.c = e3.c;
                e2.d = e3.d;
                e2.e[0] = e3.e[0];
                e2.e[1] = e3.e[1];
                e2.e[2] = e3.e[2];
                e2.e[3] = e3.e[3];
                --this.C;
                n3 = i - 1;
            }
        }
    }
    
    private void i() {
        for (int i = 0; i < this.z; ++i) {
            final Cell cell = this.x[i];
            cell.B = 0;
            for (int j = 0; j < 4; ++j) {
                int n = -1;
                if (j == 0) {
                    n = cell.K;
                }
                if (j == 1) {
                    n = cell.L;
                }
                if (j == 2) {
                    n = cell.M;
                }
                int n2;
                if (j == 3) {
                    n2 = cell.N;
                }
                else {
                    n2 = n;
                }
                if (n2 != -1) {
                    for (int k = 0; k < this.aW[n2]; ++k) {
                        final int n3 = this.aV[n2][k];
                        if (n3 > i) {
                            Cell cell2 = this.x[n3];
                            final double n4 = (cell.b - cell2.b) * (cell.b - cell2.b) + (cell.c - cell2.c) * (cell.c - cell2.c);
                            final double d = cell.d;
                            final double d2 = cell2.d;
                            final double n5 = d + d2;
                            if (n4 < n5 * n5 && n4 != 0.0) {
                                final double n6 = d * d - d2 * d2;
                                if (n6 > n4) {
                                    cell2.x = true;
                                }
                                if (-n6 > n4) {
                                    cell.x = true;
                                }
                                final boolean b = false;
                                final Cell cell3 = null;
                                Cell cell5;
                                final Cell cell4 = cell5 = null;
                                Cell cell6 = cell3;
                                int n7 = b ? 1 : 0;
                                if (n6 > n4 - Cell.a * Cell.a * 0.01) {
                                    cell5 = cell4;
                                    cell6 = cell3;
                                    n7 = (b ? 1 : 0);
                                    if (cell.I[cell.D].s == com.saterskog.cell_lab.h.q) {
                                        cell5 = cell4;
                                        cell6 = cell3;
                                        n7 = (b ? 1 : 0);
                                        if (cell2.I[cell2.D].s == com.saterskog.cell_lab.h.q) {
                                            cell5 = cell4;
                                            cell6 = cell3;
                                            n7 = (b ? 1 : 0);
                                            if (cell.o > 0.5) {
                                                cell5 = cell4;
                                                cell6 = cell3;
                                                n7 = (b ? 1 : 0);
                                                if (cell2.o > 0.5) {
                                                    if (n6 > n4 || this.Y.nextInt(2) == 0) {
                                                        cell6 = cell2;
                                                        n7 = 1;
                                                        cell5 = cell;
                                                    }
                                                    else {
                                                        cell6 = cell;
                                                        n7 = 1;
                                                        cell5 = cell2;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                                if (-n6 > n4 - Cell.a * Cell.a * 0.01 && cell.I[cell.D].s == com.saterskog.cell_lab.h.q && cell2.I[cell2.D].s == com.saterskog.cell_lab.h.q && cell.o > 0.5 && cell2.o > 0.5) {
                                    n7 = 1;
                                    if (-n6 > n4 || this.Y.nextInt(2) == 0) {
                                        cell6 = cell;
                                    }
                                    else {
                                        cell6 = cell2;
                                        cell2 = cell;
                                    }
                                }
                                else {
                                    cell2 = cell5;
                                }
                                if (n7 != 0) {
                                    cell6.x = true;
                                    cell2.o = 0.0;
                                    cell2.w += cell6.w;
                                    cell6.w = 0.0;
                                    cell2.T = Gene.B[cell2.b(10)];
                                    cell2.p += cell6.p;
                                    cell2.D = cell2.b(0);
                                    if (cell6.E != cell2.E) {
                                        cell2.E = 6;
                                    }
                                    if (cell2.w > 0.36) {
                                        cell2.w = 0.36;
                                    }
                                    if (cell2.p > 1.0) {
                                        cell2.p = 1.0;
                                    }
                                    for (int l = 0; l < 80; ++l) {
                                        if (this.Y.nextInt(2) == 1) {
                                            cell2.I[l].a(cell6.I[l]);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }
    
    private void i(double n) {
        for (int a = this.Y.a(this.e.a * this.e.k * this.e.k / this.e.b / (1.0 + this.e.p) * n), i = 0; i < a; ++i) {
            double n2;
            do {
                n2 = this.Y.b() * this.e.k;
                n = this.Y.b() * this.e.k;
            } while (n2 * n2 + n * n > this.e.k * this.e.k);
            int a2 = 1;
            if (this.e.p > 0.0) {
                a2 = this.Y.a(1.0 + this.e.p);
            }
            for (int j = 0; j < a2; ++j) {
                this.a(this.Y.nextGaussian() * this.e.q + n2, this.Y.nextGaussian() * this.e.q + n, this.e.b, this.e.o);
            }
        }
    }
    
    private void j() {
        int n;
        for (int i = 0; i < this.z; i = n + 1) {
            final Cell cell = this.x[i];
            boolean b;
            if (cell.b * cell.b + cell.c * cell.c >= this.e.k * this.e.k) {
                cell.x = true;
                b = true;
            }
            else {
                b = false;
            }
            n = i;
            if (cell.x) {
                this.a(i, !b && !this.bg);
                n = i - 1;
            }
        }
    }
    
    private void k() {
        final int n = 0;
        if (this.e.w) {
            final boolean[] t = this.e.t;
            final int length = t.length;
            int n2 = 0;
            int n3;
            while (true) {
                n3 = n;
                if (n2 >= length) {
                    break;
                }
                if (t[n2]) {
                    n3 = 1;
                    break;
                }
                ++n2;
            }
            if (n3 != 0) {
                while (this.z < this.ab) {
                    double n4;
                    double n5;
                    do {
                        n4 = this.Y.b() * this.e.k;
                        n5 = this.Y.b() * this.e.k;
                    } while (n4 * n4 + n5 * n5 > this.e.k * this.e.k);
                    this.b(n4, n5);
                }
                if (this.Y.nextInt(15) == 0) {
                    double n6;
                    double n7;
                    do {
                        n6 = this.Y.b() * this.e.k;
                        n7 = this.Y.b() * this.e.k;
                    } while (n6 * n6 + n7 * n7 > this.e.k * this.e.k);
                    this.b(n6, n7);
                }
            }
        }
    }
    
    private void l() {
        if (!this.L) {
            com.saterskog.b.a.b("ctdextras:Tried to construct primitives for not yet calculated geometry");
        }
        else {
            final int length = com.saterskog.cell_lab.h.B.length;
            int n;
            if (this.bg) {
                n = 1;
            }
            else {
                n = 0;
            }
            final int n2 = length + n;
            int n3 = this.av[n2 - 1] + this.aw[n2 - 1];
            for (int i = 0; i < length; ++i) {
                final int[] array = this.D[i];
                final h h = com.saterskog.cell_lab.h.B[i];
                if (h.y == -1) {
                    this.aw[n2 + i] = n3;
                    this.av[n2 + i] = 0;
                }
                else {
                    this.aw[n2 + i] = n3;
                    int n6;
                    if (h.t) {
                        final double n4 = 1.0 / (h.A * 33.333333333333336);
                        final double sqrt = Math.sqrt(1.0 - n4 * n4);
                        int n5 = 0;
                        while (true) {
                            n6 = n3;
                            if (n5 >= this.E[i]) {
                                break;
                            }
                            final Cell cell = this.x[array[n5]];
                            final float n7 = cell.J[0] + cell.X * 0.1f;
                            final float n8 = cell.J[1] + cell.Y;
                            final float n9 = cell.J[2];
                            final double n10 = Math.sin(cell.k) * cell.d;
                            final double n11 = Math.cos(cell.k) * cell.d;
                            this.ad[n3 * 2] = (float)(-n10 * sqrt - n11 * n4);
                            this.ad[n3 * 2 + 1] = (float)(n11 * sqrt - n10 * n4);
                            this.ad[n3 * 2 + 2] = (float)(n10 * sqrt - n11 * n4);
                            this.ad[n3 * 2 + 3] = (float)(-n11 * sqrt - n10 * n4);
                            this.ad[n3 * 2 + 4] = (float)(n11 * -h.A * 33.333333333333336);
                            this.ad[n3 * 2 + 5] = (float)(n10 * -h.A * 33.333333333333336);
                            final float r = cell.r;
                            this.ae[n3 * 4] = (float)n4;
                            this.ae[n3 * 4 + 1] = (float)sqrt;
                            this.ae[n3 * 4 + 2] = r;
                            this.ae[n3 * 4 + 3] = 0.0f;
                            this.ae[n3 * 4 + 4] = (float)n4;
                            this.ae[n3 * 4 + 5] = (float)(-sqrt);
                            this.ae[n3 * 4 + 6] = r;
                            this.ae[n3 * 4 + 7] = 0.0f;
                            this.ae[n3 * 4 + 8] = (float)(h.A * 33.333333333333336);
                            this.ae[n3 * 4 + 9] = 0.0f;
                            this.ae[n3 * 4 + 10] = r;
                            this.ae[n3 * 4 + 11] = 0.0f;
                            this.ag[n3 * 4] = n7;
                            this.ag[n3 * 4 + 1] = n8;
                            this.ag[n3 * 4 + 2] = n9;
                            this.ag[n3 * 4 + 3] = (float)cell.d;
                            this.ag[n3 * 4 + 4] = n7;
                            this.ag[n3 * 4 + 5] = n8;
                            this.ag[n3 * 4 + 6] = n9;
                            this.ag[n3 * 4 + 7] = (float)cell.d;
                            this.ag[n3 * 4 + 8] = n7;
                            this.ag[n3 * 4 + 9] = n8;
                            this.ag[n3 * 4 + 10] = n9;
                            this.ag[n3 * 4 + 11] = (float)cell.d;
                            this.af[n3 * 4] = (float)cell.b;
                            this.af[n3 * 4 + 1] = (float)cell.c;
                            this.af[n3 * 4 + 2] = 0.0f;
                            this.af[n3 * 4 + 3] = 0.0f;
                            this.af[n3 * 4 + 4] = (float)cell.b;
                            this.af[n3 * 4 + 5] = (float)cell.c;
                            this.af[n3 * 4 + 6] = 0.0f;
                            this.af[n3 * 4 + 7] = 0.0f;
                            this.af[n3 * 4 + 8] = (float)cell.b;
                            this.af[n3 * 4 + 9] = (float)cell.c;
                            this.af[n3 * 4 + 10] = 0.0f;
                            this.af[n3 * 4 + 11] = 0.0f;
                            n3 += 3;
                            ++n5;
                        }
                    }
                    else {
                        int n12 = 0;
                        while (true) {
                            n6 = n3;
                            if (n12 >= this.E[i]) {
                                break;
                            }
                            final Cell cell2 = this.x[array[n12]];
                            final float n13 = cell2.J[0] + cell2.X * 0.1f;
                            final float n14 = cell2.J[1] + cell2.Y;
                            final float n15 = cell2.J[2];
                            final float n16 = (float)(Math.cos(cell2.k) * (cell2.d + h.A));
                            final float n17 = (float)(Math.sin(cell2.k) * (cell2.d + h.A));
                            final float n18 = -n17;
                            float n19 = 0.0f;
                            float n20 = 0.0f;
                            float n21 = 0.0f;
                            if (h == com.saterskog.cell_lab.h.k || h == com.saterskog.cell_lab.h.l || h == com.saterskog.cell_lab.h.o) {
                                n19 = (float)cell2.k;
                            }
                            if (h == com.saterskog.cell_lab.h.h) {
                                n20 = (float)cell2.u;
                                n21 = (float)cell2.v;
                            }
                            float n22;
                            float n23;
                            if (h == com.saterskog.cell_lab.h.r) {
                                if (cell2.y) {
                                    n22 = cell2.s;
                                }
                                else {
                                    n22 = cell2.r;
                                }
                                if (cell2.y) {
                                    n23 = cell2.r;
                                }
                                else {
                                    n23 = cell2.s;
                                }
                            }
                            else {
                                final float n24 = n20;
                                n23 = n21;
                                n22 = n24;
                            }
                            this.ad[n3 * 2 + 0] = -n16 + n18;
                            this.ad[n3 * 2 + 1] = -n17 + n16;
                            this.ad[n3 * 2 + 2] = n16 - n18;
                            this.ad[n3 * 2 + 3] = n17 - n16;
                            this.ad[n3 * 2 + 4] = n16 + n18;
                            this.ad[n3 * 2 + 5] = n17 + n16;
                            this.ad[n3 * 2 + 6] = -n16 + n18;
                            this.ad[n3 * 2 + 7] = -n17 + n16;
                            this.ad[n3 * 2 + 8] = -n16 - n18;
                            this.ad[n3 * 2 + 9] = -n17 - n16;
                            this.ad[n3 * 2 + 10] = n16 - n18;
                            this.ad[n3 * 2 + 11] = n17 - n16;
                            this.ae[n3 * 4] = -1.0f;
                            this.ae[n3 * 4 + 1] = 1.0f;
                            this.ae[n3 * 4 + 2] = n22;
                            this.ae[n3 * 4 + 3] = n23;
                            this.ae[n3 * 4 + 4] = 1.0f;
                            this.ae[n3 * 4 + 5] = -1.0f;
                            this.ae[n3 * 4 + 6] = n22;
                            this.ae[n3 * 4 + 7] = n23;
                            this.ae[n3 * 4 + 8] = 1.0f;
                            this.ae[n3 * 4 + 9] = 1.0f;
                            this.ae[n3 * 4 + 10] = n22;
                            this.ae[n3 * 4 + 11] = n23;
                            this.ae[n3 * 4 + 12] = -1.0f;
                            this.ae[n3 * 4 + 13] = 1.0f;
                            this.ae[n3 * 4 + 14] = n22;
                            this.ae[n3 * 4 + 15] = n23;
                            this.ae[n3 * 4 + 16] = -1.0f;
                            this.ae[n3 * 4 + 17] = -1.0f;
                            this.ae[n3 * 4 + 18] = n22;
                            this.ae[n3 * 4 + 19] = n23;
                            this.ae[n3 * 4 + 20] = 1.0f;
                            this.ae[n3 * 4 + 21] = -1.0f;
                            this.ae[n3 * 4 + 22] = n22;
                            this.ae[n3 * 4 + 23] = n23;
                            this.ag[n3 * 4] = n13;
                            this.ag[n3 * 4 + 1] = n14;
                            this.ag[n3 * 4 + 2] = n15;
                            this.ag[n3 * 4 + 3] = (float)cell2.d;
                            this.ag[n3 * 4 + 4] = n13;
                            this.ag[n3 * 4 + 5] = n14;
                            this.ag[n3 * 4 + 6] = n15;
                            this.ag[n3 * 4 + 7] = (float)cell2.d;
                            this.ag[n3 * 4 + 8] = n13;
                            this.ag[n3 * 4 + 9] = n14;
                            this.ag[n3 * 4 + 10] = n15;
                            this.ag[n3 * 4 + 11] = (float)cell2.d;
                            this.ag[n3 * 4 + 12] = n13;
                            this.ag[n3 * 4 + 13] = n14;
                            this.ag[n3 * 4 + 14] = n15;
                            this.ag[n3 * 4 + 15] = (float)cell2.d;
                            this.ag[n3 * 4 + 16] = n13;
                            this.ag[n3 * 4 + 17] = n14;
                            this.ag[n3 * 4 + 18] = n15;
                            this.ag[n3 * 4 + 19] = (float)cell2.d;
                            this.ag[n3 * 4 + 20] = n13;
                            this.ag[n3 * 4 + 21] = n14;
                            this.ag[n3 * 4 + 22] = n15;
                            this.ag[n3 * 4 + 23] = (float)cell2.d;
                            float r2 = (float)cell2.t;
                            if (h == com.saterskog.cell_lab.h.o) {
                                r2 = cell2.r;
                            }
                            this.af[n3 * 4] = (float)cell2.b;
                            this.af[n3 * 4 + 1] = (float)cell2.c;
                            this.af[n3 * 4 + 2] = r2;
                            this.af[n3 * 4 + 3] = n19;
                            this.af[n3 * 4 + 4] = (float)cell2.b;
                            this.af[n3 * 4 + 5] = (float)cell2.c;
                            this.af[n3 * 4 + 6] = r2;
                            this.af[n3 * 4 + 7] = n19;
                            this.af[n3 * 4 + 8] = (float)cell2.b;
                            this.af[n3 * 4 + 9] = (float)cell2.c;
                            this.af[n3 * 4 + 10] = r2;
                            this.af[n3 * 4 + 11] = n19;
                            this.af[n3 * 4 + 12] = (float)cell2.b;
                            this.af[n3 * 4 + 13] = (float)cell2.c;
                            this.af[n3 * 4 + 14] = r2;
                            this.af[n3 * 4 + 15] = n19;
                            this.af[n3 * 4 + 16] = (float)cell2.b;
                            this.af[n3 * 4 + 17] = (float)cell2.c;
                            this.af[n3 * 4 + 18] = r2;
                            this.af[n3 * 4 + 19] = n19;
                            this.af[n3 * 4 + 20] = (float)cell2.b;
                            this.af[n3 * 4 + 21] = (float)cell2.c;
                            this.af[n3 * 4 + 22] = r2;
                            this.af[n3 * 4 + 23] = n19;
                            n3 += 6;
                            ++n12;
                        }
                    }
                    this.av[n2 + i] = n6 - this.aw[n2 + i];
                    n3 = n6;
                }
            }
        }
    }
    
    public final int a(final double n, final double n2) {
        double n3 = 0.009;
        int n4 = -1;
        int n6;
        double n7;
        for (int i = 0; i < this.z; ++i, n4 = n6, n3 = n7) {
            final double n5 = (n - this.x[i].b) * (n - this.x[i].b) + (n2 - this.x[i].c) * (n2 - this.x[i].c);
            n6 = n4;
            n7 = n3;
            if (n5 <= this.x[i].d * this.x[i].d) {
                n6 = n4;
                n7 = n3;
                if (n5 < n3) {
                    n6 = i;
                    n7 = n5;
                }
            }
        }
        return n4;
    }
    
    public final int a(final int n) {
        for (int i = 0; i < this.z; ++i) {
            if (this.x[i].F == n) {
                return i;
            }
        }
        return -1;
    }
    
    public final int a(final InputStream inputStream) {
        final ObjectInputStream objectInputStream = new ObjectInputStream(inputStream);
        final int int1 = objectInputStream.readInt();
        if (int1 > 3054) {
            throw new RuntimeException("bad cellworld format for load: " + int1 + "!=95");
        }
        this.M = objectInputStream.readDouble();
        this.z = objectInputStream.readInt();
        this.e.a(objectInputStream);
        ObjectInputStream objectInputStream2;
        if (int1 <= 12) {
            objectInputStream2 = objectInputStream;
        }
        else {
            objectInputStream2 = new ObjectInputStream(new GZIPInputStream(inputStream, 65536));
        }
        if (int1 > 23) {
            this.O = objectInputStream2.readDouble();
        }
        for (int i = 0; i < this.z; ++i) {
            this.x[i].a(objectInputStream2);
        }
        this.B = objectInputStream2.readInt();
        for (int j = 0; j < this.B; ++j) {
            final Food food = this.A[j];
            if (int1 >= 8) {
                food.a = objectInputStream2.readFloat();
                food.b = objectInputStream2.readFloat();
                food.c = objectInputStream2.readFloat();
            }
            else {
                food.a = (float)objectInputStream2.readDouble();
                food.b = (float)objectInputStream2.readDouble();
                food.c = (float)objectInputStream2.readDouble();
            }
            if (int1 >= 22) {
                food.d = objectInputStream2.readFloat();
                food.e = objectInputStream2.readFloat();
                food.f = objectInputStream2.readFloat();
            }
            else {
                food.d = 0.0f;
                food.e = 0.0f;
                food.f = 0.0f;
            }
        }
        this.a(true, 0.0);
        this.C = 0;
        this.V = 0;
        this.W = 0;
        return int1;
    }
    
    public final void a() {
        this.z = 0;
        this.B = 0;
        this.M = 0.0;
        this.O = 1.5707963267948966;
    }
    
    public final void a(double n) {
        if (this.X != 2) {
            throw new RuntimeException("Tried to run update2 too early");
        }
        n *= 0.02;
        this.g(n);
        com.saterskog.b.a.b();
        this.b(n);
        this.X = 0;
    }
    
    public final void a(final double n, final double n2, final double n3, final float f) {
        if (this.B >= this.aa) {
            com.saterskog.b.a.a("skit:Maximum number of foods reached (" + Integer.toString(this.aa) + "). This was not supposed to happen, maybe increase CellWorld.MAX_FOODS?");
        }
        else if (n * n + n2 * n2 < this.e.k * this.e.k) {
            this.A[this.B].a = (float)n;
            this.A[this.B].b = (float)n2;
            this.A[this.B].c = (float)n3;
            this.A[this.B].d = 0.0f;
            this.A[this.B].e = 0.0f;
            this.A[this.B].f = f;
            ++this.B;
        }
    }
    
    public final void a(final float n, final float n2, final float n3, final float n4) {
        com.saterskog.b.a.b();
        if (!this.L) {
            com.saterskog.b.a.b("ctd:Tried to construct primitives for not yet calculated geometry");
        }
        else {
            for (int i = 0; i < com.saterskog.cell_lab.h.B.length + 1; ++i) {
                this.E[i] = 0;
            }
            for (int j = 0; j < this.z; ++j) {
                final Cell cell = this.x[j];
                if (cell.b >= n - 0.12f && cell.b <= n2 + 0.12f && cell.c >= n3 - 0.12f && cell.c <= n4 + 0.12f && !cell.x) {
                    final int ordinal = cell.I[cell.D].s.ordinal();
                    this.D[ordinal][this.E[ordinal]] = j;
                    final int[] e = this.E;
                    ++e[ordinal];
                }
            }
            if (this.bg) {
                for (int k = 0; k < this.z; ++k) {
                    this.D[com.saterskog.cell_lab.h.B.length][this.E[com.saterskog.cell_lab.h.B.length]] = k;
                    final int[] e2 = this.E;
                    final int length = com.saterskog.cell_lab.h.B.length;
                    ++e2[length];
                }
            }
            com.saterskog.b.a.b();
            int n5 = 0;
            int n6 = 0;
            int n7 = 0;
            while (true) {
                final int length2 = com.saterskog.cell_lab.h.B.length;
                int n8;
                if (this.bg) {
                    n8 = 1;
                }
                else {
                    n8 = 0;
                }
                if (n7 >= n8 + length2) {
                    break;
                }
                h h;
                if (n7 < com.saterskog.cell_lab.h.B.length) {
                    h = com.saterskog.cell_lab.h.B[n7];
                }
                else {
                    h = null;
                }
                this.aw[n7] = n5;
                if (h != null && h.w == -1) {
                    this.av[n7] = 0;
                }
                else {
                    final int n9 = 0;
                    this.q[n7][0] = n5;
                    this.r[n7][0] = n6;
                    final int[] array = this.D[n7];
                    int l = 0;
                    int n10 = n5;
                    int n11 = n5;
                    int n12 = n6;
                    int n13 = n9;
                    while (l < this.E[n7]) {
                        final Cell cell2 = this.x[array[l]];
                        final Gene b = cell2.b();
                        for (int n14 = 0; n14 < cell2.B; ++n14) {
                            for (int n15 = 1; n15 < cell2.B; ++n15) {
                                final int n16 = (n14 + n15) % cell2.B;
                                if (!cell2.A[n16].e) {
                                    final double n17 = cell2.A[n14].c - cell2.A[n14].a;
                                    final double n18 = cell2.A[n16].a - cell2.A[n16].c;
                                    final double n19 = cell2.A[n14].d - cell2.A[n14].b;
                                    final double n20 = cell2.A[n16].b - cell2.A[n16].d;
                                    final double n21 = cell2.A[n16].a - cell2.A[n14].a;
                                    final double n22 = cell2.A[n16].b - cell2.A[n14].b;
                                    final double n23 = n17 * n20 - n18 * n19;
                                    final double n24 = (n20 * n21 - n18 * n22) / n23;
                                    final double n25 = (n17 * n22 + -n19 * n21) / n23;
                                    final double c = cell2.A[n14].c;
                                    final double a = cell2.A[n16].a;
                                    final double d = cell2.A[n14].d;
                                    final double b2 = cell2.A[n16].b;
                                    if (0.0 < n24 && n24 < 1.0 && 1.0 > n25 && n25 > 0.0) {
                                        if ((c - a) * n20 - n18 * (d - b2) < 0.0) {
                                            final u u = cell2.A[n16];
                                            final u u2 = cell2.A[n14];
                                            final double n26 = cell2.A[n14].a + (cell2.A[n14].c - cell2.A[n14].a) * n24;
                                            u2.c = n26;
                                            u.a = n26;
                                            final u u3 = cell2.A[n16];
                                            final u u4 = cell2.A[n14];
                                            final double n27 = cell2.A[n14].b + (cell2.A[n14].d - cell2.A[n14].b) * n24;
                                            u4.d = n27;
                                            u3.b = n27;
                                            cell2.A[n14].f = true;
                                        }
                                        else {
                                            final u u5 = cell2.A[n16];
                                            final u u6 = cell2.A[n14];
                                            final double n28 = cell2.A[n14].a + (cell2.A[n14].c - cell2.A[n14].a) * n24;
                                            u6.a = n28;
                                            u5.c = n28;
                                            final u u7 = cell2.A[n16];
                                            final u u8 = cell2.A[n14];
                                            final double n29 = cell2.A[n14].b + (cell2.A[n14].d - cell2.A[n14].b) * n24;
                                            u8.b = n29;
                                            u7.d = n29;
                                            cell2.A[n16].f = true;
                                        }
                                        if (cell2.A[n14].a * cell2.A[n14].d - cell2.A[n14].b * cell2.A[n14].c < 0.0) {
                                            cell2.A[n14].e = true;
                                        }
                                        if (cell2.A[n16].a * cell2.A[n16].d - cell2.A[n16].b * cell2.A[n16].c < 0.0) {
                                            cell2.A[n16].e = true;
                                        }
                                    }
                                }
                            }
                        }
                        for (int n30 = 0; n30 < cell2.B; ++n30) {
                            if (!cell2.A[n30].e) {
                                for (int n31 = 0; n31 < cell2.B; ++n31) {
                                    if (n31 != n30 && (cell2.A[n30].a != cell2.A[n31].c || cell2.A[n30].b != cell2.A[n31].d) && (cell2.A[n30].c != cell2.A[n31].a || cell2.A[n30].d != cell2.A[n31].b)) {
                                        final double a2 = cell2.A[n30].a;
                                        final double n32 = cell2.A[n31].a - cell2.A[n31].c;
                                        final double b3 = cell2.A[n30].b;
                                        final double n33 = cell2.A[n31].b - cell2.A[n31].d;
                                        final double n34 = (n33 * (cell2.A[n31].a - 0.0) - n32 * (cell2.A[n31].b - 0.0)) / ((a2 - 0.0) * n33 - (b3 - 0.0) * n32);
                                        if (n34 > 0.0 && 1.0 > n34) {
                                            cell2.A[n30].e = true;
                                        }
                                    }
                                }
                            }
                        }
                        if (cell2.B > 1) {
                            if (cell2.B == 2) {
                                if (cell2.A[0].a(cell2.A[1]) == 1) {
                                    final u u9 = cell2.A[0];
                                    cell2.A[0] = cell2.A[1];
                                    cell2.A[1] = u9;
                                }
                            }
                            else {
                                Arrays.sort(cell2.A, 0, cell2.B);
                            }
                        }
                        final float n35 = cell2.J[0] + cell2.X * 0.1f;
                        final float n36 = cell2.J[1] + cell2.Y;
                        final float n37 = cell2.J[2];
                        int n38 = n13;
                        int n39 = n11;
                        if (n10 - n11 > 32557) {
                            this.s[n7][n13] = n10 - this.q[n7][n13];
                            this.t[n7][n13] = n12 - this.r[n7][n13];
                            if (n13 >= 201) {
                                com.saterskog.b.a.a("Too many bunches..");
                                break;
                            }
                            n38 = n13 + 1;
                            this.q[n7][n38] = n10;
                            this.r[n7][n38] = n12;
                            n39 = n10;
                        }
                        float r = 0.0f;
                        float ab = 0.0f;
                        final float n40 = (float)cell2.k;
                        if (h == null) {
                            final double m = cell2.k;
                            final float d2 = b.d;
                            int n41;
                            if (cell2.y) {
                                n41 = -1;
                            }
                            else {
                                n41 = 1;
                            }
                            r = (float)(m + n41 * d2);
                            ab = (float)(cell2.d * 2.0 * (0.5 - b.c));
                        }
                        else {
                            switch (CellWorld$2.a[h.ordinal()]) {
                                case 1: {
                                    r = cell2.S / 1.8f;
                                    break;
                                }
                                case 2: {
                                    r = cell2.r;
                                    break;
                                }
                                case 3:
                                case 4: {
                                    ab = (float)cell2.m;
                                    break;
                                }
                                case 5:
                                case 6:
                                case 7: {
                                    r = 0.05f * cell2.V[0];
                                    ab = cell2.V[1] * 0.05f;
                                    break;
                                }
                                case 8: {
                                    r = -cell2.aa;
                                    ab = cell2.ab;
                                    break;
                                }
                                case 9: {
                                    final float max = Math.max(0.0f, cell2.a(5, 0) + 0.5f);
                                    final float max2 = Math.max(0.0f, cell2.a(6, 0) + 0.5f);
                                    r = max / (1.0f + max2 * max2) * 3.1415927f;
                                    ab = max2 / (max * max + 1.0f) * 3.1415927f;
                                    break;
                                }
                            }
                        }
                        final float n42 = (float)cell2.b;
                        final float n43 = (float)cell2.c;
                        final float n44 = (float)cell2.d;
                        if (cell2.B == 0) {
                            this.ad[n10 * 2] = n44;
                            this.ad[n10 * 2 + 1] = n44;
                            this.ad[n10 * 2 + 2] = n44;
                            this.ad[n10 * 2 + 3] = -n44;
                            this.ad[n10 * 2 + 4] = -n44;
                            this.ad[n10 * 2 + 5] = -n44;
                            this.ad[n10 * 2 + 6] = -n44;
                            this.ad[n10 * 2 + 7] = n44;
                            this.ae[n10 * 4] = r;
                            this.ae[n10 * 4 + 1] = 0.0f;
                            this.ae[n10 * 4 + 2] = n40;
                            this.ae[n10 * 4 + 3] = ab;
                            this.ae[n10 * 4 + 4] = r;
                            this.ae[n10 * 4 + 5] = 0.0f;
                            this.ae[n10 * 4 + 6] = n40;
                            this.ae[n10 * 4 + 7] = ab;
                            this.ae[n10 * 4 + 8] = r;
                            this.ae[n10 * 4 + 9] = 0.0f;
                            this.ae[n10 * 4 + 10] = n40;
                            this.ae[n10 * 4 + 11] = ab;
                            this.ae[n10 * 4 + 12] = r;
                            this.ae[n10 * 4 + 13] = 0.0f;
                            this.ae[n10 * 4 + 14] = n40;
                            this.ae[n10 * 4 + 15] = ab;
                            this.af[n10 * 2 + 0] = n42;
                            this.af[n10 * 2 + 1] = n43;
                            this.af[n10 * 2 + 2] = n42;
                            this.af[n10 * 2 + 3] = n43;
                            this.af[n10 * 2 + 4] = n42;
                            this.af[n10 * 2 + 5] = n43;
                            this.af[n10 * 2 + 6] = n42;
                            this.af[n10 * 2 + 7] = n43;
                            this.ag[n10 * 4] = n35;
                            this.ag[n10 * 4 + 1] = n36;
                            this.ag[n10 * 4 + 2] = n37;
                            this.ag[n10 * 4 + 3] = n44;
                            this.ag[n10 * 4 + 4] = n35;
                            this.ag[n10 * 4 + 5] = n36;
                            this.ag[n10 * 4 + 6] = n37;
                            this.ag[n10 * 4 + 7] = n44;
                            this.ag[n10 * 4 + 8] = n35;
                            this.ag[n10 * 4 + 9] = n36;
                            this.ag[n10 * 4 + 10] = n37;
                            this.ag[n10 * 4 + 11] = n44;
                            this.ag[n10 * 4 + 12] = n35;
                            this.ag[n10 * 4 + 13] = n36;
                            this.ag[n10 * 4 + 14] = n37;
                            this.ag[n10 * 4 + 15] = n44;
                            final short[] aq = this.aq;
                            final int n45 = n12 + 1;
                            aq[n12] = (short)(n10 - n39 + 0);
                            final short[] aq2 = this.aq;
                            final int n46 = n45 + 1;
                            aq2[n45] = (short)(n10 - n39 + 1);
                            final short[] aq3 = this.aq;
                            final int n47 = n46 + 1;
                            aq3[n46] = (short)(n10 - n39 + 2);
                            final short[] aq4 = this.aq;
                            final int n48 = n47 + 1;
                            aq4[n47] = (short)(n10 - n39 + 0);
                            final short[] aq5 = this.aq;
                            final int n49 = n48 + 1;
                            aq5[n48] = (short)(n10 - n39 + 2);
                            final short[] aq6 = this.aq;
                            n12 = n49 + 1;
                            aq6[n49] = (short)(n10 - n39 + 3);
                            n10 += 4;
                        }
                        else {
                            final short n50 = (short)(n10 - n39);
                            this.ad[n10 * 2] = 0.0f;
                            this.ad[n10 * 2 + 1] = 0.0f;
                            this.ae[n10 * 4] = r;
                            this.ae[n10 * 4 + 1] = 0.0f;
                            this.ae[n10 * 4 + 2] = n40;
                            this.ae[n10 * 4 + 3] = ab;
                            this.af[n10 * 2 + 0] = n42;
                            this.af[n10 * 2 + 1] = n43;
                            this.ag[n10 * 4] = n35;
                            this.ag[n10 * 4 + 1] = n36;
                            this.ag[n10 * 4 + 2] = n37;
                            this.ag[n10 * 4 + 3] = n44;
                            int n51 = n10 + 1;
                            int n53;
                            for (int n52 = 0; n52 < cell2.B; ++n52, n51 = n53) {
                                n53 = n51;
                                if (!cell2.A[n52].e) {
                                    this.ad[n51 * 2 + 0] = (float)cell2.A[n52].a;
                                    this.ad[n51 * 2 + 1] = (float)cell2.A[n52].b;
                                    this.ae[n51 * 4 + 0] = r;
                                    if (h == null) {
                                        this.ae[n51 * 4 + 1] = 0.0f;
                                    }
                                    else {
                                        this.ae[n51 * 4 + 1] = n44;
                                    }
                                    this.ae[n51 * 4 + 2] = n40;
                                    this.ae[n51 * 4 + 3] = ab;
                                    this.af[n51 * 2 + 0] = n42;
                                    this.af[n51 * 2 + 1] = n43;
                                    this.ag[n51 * 4 + 0] = n35;
                                    this.ag[n51 * 4 + 1] = n36;
                                    this.ag[n51 * 4 + 2] = n37;
                                    this.ag[n51 * 4 + 3] = n44;
                                    n53 = ++n51;
                                    if (!cell2.A[n52].f) {
                                        int n54;
                                        if (cell2.A[n54 = (n52 + 1) % cell2.B].e) {
                                            n54 = 0;
                                        }
                                        if (cell2.A[n52].c * cell2.A[n54].b - cell2.A[n54].a * cell2.A[n52].d > 0.0) {
                                            this.v[0] = cell2.A[n52].c;
                                            this.v[3] = cell2.A[n54].a;
                                            this.w[0] = cell2.A[n52].d;
                                            this.w[3] = cell2.A[n54].b;
                                            final double n55 = this.v[0] + this.v[3];
                                            final double n56 = this.w[0] + this.w[3];
                                            final double n57 = cell2.d / Math.sqrt(n55 * n55 + n56 * n56);
                                            final double n58 = n55 * n57;
                                            final double n59 = n56 * n57;
                                            final double n60 = cell2.d * cell2.d / (this.w[0] * n58 - this.v[0] * n59);
                                            this.v[1] = (this.w[0] - n59) * n60;
                                            this.w[1] = -(this.v[0] - n58) * n60;
                                            this.v[2] = -(this.w[3] - n59) * n60;
                                            this.w[2] = (this.v[3] - n58) * n60;
                                            int n61 = 0;
                                            while (true) {
                                                n53 = n51;
                                                if (n61 >= 3) {
                                                    break;
                                                }
                                                this.ad[n51 * 2 + 0] = (float)this.v[n61];
                                                this.ad[n51 * 2 + 1] = (float)this.w[n61];
                                                this.ae[n51 * 4 + 0] = r;
                                                if (h == null) {
                                                    this.ae[n51 * 4 + 1] = 0.0f;
                                                }
                                                else {
                                                    this.ae[n51 * 4 + 1] = n44;
                                                }
                                                this.ae[n51 * 4 + 2] = n40;
                                                this.ae[n51 * 4 + 3] = ab;
                                                this.af[n51 * 2 + 0] = n42;
                                                this.af[n51 * 2 + 1] = n43;
                                                this.ag[n51 * 4 + 0] = n35;
                                                this.ag[n51 * 4 + 1] = n36;
                                                this.ag[n51 * 4 + 2] = n37;
                                                this.ag[n51 * 4 + 3] = n44;
                                                ++n61;
                                                ++n51;
                                            }
                                        }
                                        else {
                                            this.v[0] = cell2.A[n52].c;
                                            this.v[4] = cell2.A[n54].a;
                                            this.w[0] = cell2.A[n52].d;
                                            this.w[4] = cell2.A[n54].b;
                                            this.v[2] = this.v[0] + this.v[4];
                                            this.w[2] = this.w[0] + this.w[4];
                                            final double n62 = -2.0 * cell2.d / Math.sqrt(this.v[2] * this.v[2] + this.w[2] * this.w[2]);
                                            final double[] v = this.v;
                                            v[2] *= n62;
                                            final double[] w = this.w;
                                            w[2] *= n62;
                                            final double n63 = this.v[2] * 0.25 + this.w[2] * CellWorld.b;
                                            final double n64 = this.w[2] * 0.25 - this.v[2] * CellWorld.b;
                                            final double n65 = cell2.d * cell2.d / (this.w[0] * n63 - this.v[0] * n64);
                                            this.v[1] = (this.w[0] - n64) * n65;
                                            this.w[1] = (n63 - this.v[0]) * n65;
                                            final double n66 = this.v[2] * 0.25 - this.w[2] * CellWorld.b;
                                            final double n67 = this.w[2] * 0.25 + this.v[2] * CellWorld.b;
                                            final double n68 = cell2.d * cell2.d / (this.w[4] * n66 - this.v[4] * n67);
                                            this.v[3] = (this.w[4] - n67) * n68;
                                            this.w[3] = (n66 - this.v[4]) * n68;
                                            int n69 = 0;
                                            while (true) {
                                                n53 = n51;
                                                if (n69 >= 4) {
                                                    break;
                                                }
                                                this.ad[n51 * 2] = (float)this.v[n69];
                                                this.ad[n51 * 2 + 1] = (float)this.w[n69];
                                                this.ae[n51 * 4] = r;
                                                if (h == null) {
                                                    this.ae[n51 * 4 + 1] = 0.0f;
                                                }
                                                else {
                                                    this.ae[n51 * 4 + 1] = n44;
                                                }
                                                this.ae[n51 * 4 + 2] = n40;
                                                this.ae[n51 * 4 + 3] = ab;
                                                this.af[n51 * 2] = n42;
                                                this.af[n51 * 2 + 1] = n43;
                                                this.ag[n51 * 4] = n35;
                                                this.ag[n51 * 4 + 1] = n36;
                                                this.ag[n51 * 4 + 2] = n37;
                                                this.ag[n51 * 4 + 3] = n44;
                                                ++n69;
                                                ++n51;
                                            }
                                        }
                                    }
                                }
                            }
                            for (short n70 = (short)(n50 + 1); n70 < (short)(n51 - n39 - 1); ++n70) {
                                final short[] aq7 = this.aq;
                                final int n71 = n12 + 1;
                                aq7[n12] = n50;
                                final short[] aq8 = this.aq;
                                final int n72 = n71 + 1;
                                aq8[n71] = n70;
                                final short[] aq9 = this.aq;
                                n12 = n72 + 1;
                                aq9[n72] = (short)(n70 + 1);
                            }
                            final short[] aq10 = this.aq;
                            final int n73 = n12 + 1;
                            aq10[n12] = n50;
                            final short[] aq11 = this.aq;
                            final int n74 = n73 + 1;
                            aq11[n73] = (short)(n51 - n39 - 1);
                            final short[] aq12 = this.aq;
                            n12 = n74 + 1;
                            aq12[n74] = (short)(n50 + 1);
                            n10 = n51;
                        }
                        ++l;
                        n13 = n38;
                        n11 = n39;
                    }
                    this.s[n7][n13] = n10 - this.q[n7][n13];
                    this.t[n7][n13] = n12 - this.r[n7][n13];
                    this.u[n7] = n13 + 1;
                    this.av[n7] = n10 - this.aw[n7];
                    n6 = n12;
                    n5 = n10;
                }
                ++n7;
            }
            com.saterskog.b.a.b();
            this.ap = 0;
            for (int n75 = 0; n75 < this.z; ++n75) {
                final Cell cell3 = this.x[n75];
                if (cell3.b >= n - 0.06f && cell3.b <= n2 + 0.06f && cell3.c >= n3 - 0.06f && cell3.c <= n4 + 0.06f && cell3.C != 0) {
                    for (int n76 = 0; n76 < cell3.C; ++n76) {
                        final Link link = cell3.H[n76];
                        if (link.a <= n75) {
                            int n77;
                            for (n77 = 0; n77 < cell3.B && link.a != cell3.A[n77].g; ++n77) {}
                            final float n78 = (float)Cell.a * 0.7f;
                            float n82;
                            float n83;
                            float n84;
                            float n85;
                            if (n77 == cell3.B) {
                                if (link.a == -1) {
                                    final double sqrt = Math.sqrt(cell3.b * cell3.b + cell3.c * cell3.c);
                                    final double n79 = link.e * 0.5 + cell3.b * 0.5;
                                    final double n80 = link.f * 0.5 + cell3.c * 0.5;
                                    final double n81 = 0.5f * n78 / sqrt;
                                    n82 = (float)(cell3.c * n81 + n79);
                                    n83 = (float)(n79 - cell3.c * n81);
                                    n84 = (float)(n80 - cell3.b * n81);
                                    n85 = (float)(n81 * cell3.b + n80);
                                }
                                else {
                                    final Cell cell4 = this.x[link.a];
                                    final double sqrt2 = Math.sqrt((cell3.b - cell4.b) * (cell3.b - cell4.b) + (cell3.c - cell4.c) * (cell3.c - cell4.c));
                                    final double n86 = (cell3.d + 0.5 * (sqrt2 - cell3.d - cell4.d)) / sqrt2;
                                    final double n87 = cell3.b * n86 + cell4.b * (1.0 - n86);
                                    final double n88 = (1.0 - n86) * cell4.c + cell3.c * n86;
                                    final double n89 = 0.5f * n78 / sqrt2;
                                    n82 = (float)(n87 - (cell4.c - cell3.c) * n89);
                                    n83 = (float)(n87 + (cell4.c - cell3.c) * n89);
                                    n84 = (float)((cell4.b - cell3.b) * n89 + n88);
                                    n85 = (float)(n88 - n89 * (cell4.b - cell3.b));
                                }
                            }
                            else {
                                final u u10 = cell3.A[n77];
                                if (u10.e) {
                                    continue;
                                }
                                final float n90 = (float)(u10.a + cell3.b);
                                final float n91 = (float)(u10.c + cell3.b);
                                final float n92 = (float)(u10.b + cell3.c);
                                final float n93 = (float)(u10.d + cell3.c);
                                final float n94 = (n91 - n90) * (n91 - n90) + (n93 - n92) * (n93 - n92);
                                n85 = n93;
                                n84 = n92;
                                n83 = n91;
                                n82 = n90;
                                if (n94 < n78 * n78) {
                                    final float n95 = (float)Math.sqrt(n94);
                                    final float n96 = 0.5f * (n90 + n91);
                                    final float n97 = 0.5f * (n92 + n93);
                                    final float n98 = n78 / n95;
                                    n83 = (n91 - n96) * n98 + n96;
                                    n82 = (n90 - n96) * n98 + n96;
                                    n85 = (n93 - n97) * n98 + n97;
                                    n84 = (n92 - n97) * n98 + n97;
                                }
                            }
                            this.an[this.ap * 4] = (float)(link.g + cell3.b);
                            this.an[this.ap * 4 + 1] = (float)(link.h + cell3.c);
                            this.an[this.ap * 4 + 2] = 0.0f;
                            this.an[this.ap * 4 + 3] = 1.0f;
                            this.an[this.ap * 4 + 4] = n82;
                            this.an[this.ap * 4 + 5] = n84;
                            this.an[this.ap * 4 + 6] = -1.0f;
                            this.an[this.ap * 4 + 7] = 0.0f;
                            this.an[this.ap * 4 + 8] = n83;
                            this.an[this.ap * 4 + 9] = n85;
                            this.an[this.ap * 4 + 10] = 1.0f;
                            this.an[this.ap * 4 + 11] = 0.0f;
                            this.ao[this.ap] = (float)(-1.0 + 2.0 * ((link.g + cell3.b - n82) * (n83 - n82) + (link.h + cell3.c - n84) * (n85 - n84)) / ((n83 - n82) * (n83 - n82) + (n85 - n84) * (n85 - n84)));
                            this.ao[this.ap + 1] = -1.0f;
                            this.ao[this.ap + 2] = 1.0f;
                            this.ap += 3;
                            if (link.a == -1) {
                                this.an[this.ap * 4] = (float)link.e;
                                this.an[this.ap * 4 + 1] = (float)link.f;
                                this.an[this.ap * 4 + 2] = 0.0f;
                                this.an[this.ap * 4 + 3] = 1.0f;
                                this.an[this.ap * 4 + 4] = n82;
                                this.an[this.ap * 4 + 5] = n84;
                                this.an[this.ap * 4 + 6] = -1.0f;
                                this.an[this.ap * 4 + 7] = 0.0f;
                                this.an[this.ap * 4 + 8] = n83;
                                this.an[this.ap * 4 + 9] = n85;
                                this.an[this.ap * 4 + 10] = 1.0f;
                                this.an[this.ap * 4 + 11] = 0.0f;
                                this.ao[this.ap] = (float)(2.0 * ((link.e - n82) * (n83 - n82) + (link.f - n84) * (n85 - n84)) / ((n85 - n84) * (n85 - n84) + (n83 - n82) * (n83 - n82)) - 1.0);
                                this.ao[this.ap + 1] = -1.0f;
                                this.ao[this.ap + 2] = 1.0f;
                            }
                            else {
                                final Cell cell5 = this.x[link.a];
                                this.an[this.ap * 4] = (float)(link.i + cell5.b);
                                this.an[this.ap * 4 + 1] = (float)(link.j + cell5.c);
                                this.an[this.ap * 4 + 2] = 0.0f;
                                this.an[this.ap * 4 + 3] = 1.0f;
                                this.an[this.ap * 4 + 4] = n82;
                                this.an[this.ap * 4 + 5] = n84;
                                this.an[this.ap * 4 + 6] = -1.0f;
                                this.an[this.ap * 4 + 7] = 0.0f;
                                this.an[this.ap * 4 + 8] = n83;
                                this.an[this.ap * 4 + 9] = n85;
                                this.an[this.ap * 4 + 10] = 1.0f;
                                this.an[this.ap * 4 + 11] = 0.0f;
                                this.ao[this.ap] = (float)(2.0 * ((link.i + cell5.b - n82) * (n83 - n82) + (link.j + cell5.c - n84) * (n85 - n84)) / ((n85 - n84) * (n85 - n84) + (n83 - n82) * (n83 - n82)) - 1.0);
                                this.ao[this.ap + 1] = -1.0f;
                                this.ao[this.ap + 2] = 1.0f;
                            }
                            this.ap += 3;
                        }
                    }
                }
            }
            com.saterskog.b.a.b();
            this.l();
            com.saterskog.b.a.b();
            this.b(n, n2, n3, n4);
            com.saterskog.b.a.b();
            this.c(n, n2, n3, n4);
            com.saterskog.b.a.b();
        }
    }
    
    public final void a(final int a, final boolean b) {
        for (int i = 0; i < this.x[a].C; ++i) {
            if (this.x[a].H[i].a != -1) {
                for (int j = 0; j < this.x[this.x[a].H[i].a].C; ++j) {
                    if (this.x[this.x[a].H[i].a].H[j].a == a) {
                        this.x[this.x[a].H[i].a].H[j].a(this.x[this.x[a].H[i].a].H[this.x[this.x[a].H[i].a].C - 1]);
                        final Cell cell = this.x[this.x[a].H[i].a];
                        --cell.C;
                        break;
                    }
                }
            }
        }
        for (int k = 0; k < this.x[this.z - 1].C; ++k) {
            if (this.x[this.z - 1].H[k].a != -1) {
                for (int l = 0; l < this.x[this.x[this.z - 1].H[k].a].C; ++l) {
                    if (this.x[this.x[this.z - 1].H[k].a].H[l].a == this.z - 1) {
                        this.x[this.x[this.z - 1].H[k].a].H[l].a = a;
                        break;
                    }
                }
            }
        }
        if (b) {
            if (this.B >= this.aa) {
                a.a("Too many pieces of food!!");
            }
            else {
                final double b2 = this.x[a].b;
                final double c = this.x[a].c;
                final double w = this.x[a].w;
                float n;
                if (this.x[a].b().s == com.saterskog.cell_lab.h.e) {
                    n = 0.5f;
                }
                else {
                    n = 0.0f;
                }
                this.a(b2, c, 0.9 * w, n);
            }
        }
        if (this.C < this.ac) {
            final Cell cell2 = this.x[a];
            if (cell2.b * cell2.b + cell2.c * cell2.c <= this.e.k * this.e.k) {
                this.y[this.C].a = cell2.b;
                this.y[this.C].b = cell2.c;
                this.y[this.C].c = cell2.d;
                this.y[this.C].d = 0.0;
                this.y[this.C].e[0] = cell2.J[0];
                this.y[this.C].e[1] = cell2.J[1];
                this.y[this.C].e[2] = cell2.J[2];
                this.y[this.C].e[3] = cell2.J[3];
                ++this.C;
            }
        }
        this.x[a].a(this.x[this.z - 1]);
        --this.z;
        ++this.R;
    }
    
    public final void a(final Context context) {
        final int length = com.saterskog.cell_lab.h.B.length;
        int n;
        if (this.bg) {
            n = 1;
        }
        else {
            n = 0;
        }
        final int n2 = length * 2 + n;
        this.au = new int[n2];
        this.ax = new int[n2];
        this.ay = new int[n2];
        this.az = new int[n2];
        this.aA = new int[n2];
        this.aB = new int[n2];
        this.av = new int[n2];
        this.aw = new int[n2];
        this.aQ = new int[n2];
        final int length2 = com.saterskog.cell_lab.h.B.length;
        int n3;
        if (this.bg) {
            n3 = 1;
        }
        else {
            n3 = 0;
        }
        final int n4 = length2 + n3;
        for (int i = 0; i < n2; ++i) {
            if (i < com.saterskog.cell_lab.h.B.length) {
                this.au[i] = com.saterskog.b.c.a(context, com.saterskog.cell_lab.h.B[i].w, com.saterskog.cell_lab.h.B[i].x);
            }
            else if (this.bg && i == com.saterskog.cell_lab.h.B.length) {
                this.au[i] = com.saterskog.b.c.a(context, 2131558403, 2131558402);
            }
            else {
                if (com.saterskog.cell_lab.h.B[i - n4].y == -1) {
                    continue;
                }
                this.au[i] = com.saterskog.b.c.a(context, com.saterskog.cell_lab.h.B[i - n4].y, com.saterskog.cell_lab.h.B[i - n4].z);
            }
            GLES20.glUseProgram(this.au[i]);
            this.ax[i] = GLES20.glGetAttribLocation(this.au[i], "vPosition");
            this.ay[i] = GLES20.glGetAttribLocation(this.au[i], "vTPosition");
            this.az[i] = GLES20.glGetAttribLocation(this.au[i], "vCenter");
            this.aA[i] = GLES20.glGetAttribLocation(this.au[i], "vColor");
            this.aB[i] = GLES20.glGetUniformLocation(this.au[i], "tex1");
            this.aQ[i] = GLES20.glGetUniformLocation(this.au[i], "uMVPMatrix");
        }
        this.ar = com.saterskog.b.c.a(context, 2131558418, 2131558417);
        this.aC = GLES20.glGetAttribLocation(this.ar, "vPosition");
        this.aD = GLES20.glGetAttribLocation(this.ar, "vCenter");
        this.aE = GLES20.glGetAttribLocation(this.ar, "color");
        this.aF = GLES20.glGetUniformLocation(this.ar, "uMVPMatrix");
        this.at = com.saterskog.b.c.a(context, 2131558414, 2131558413);
        this.aG = GLES20.glGetAttribLocation(this.at, "vPosition");
        this.aI = GLES20.glGetAttribLocation(this.at, "vCenter");
        this.aH = GLES20.glGetAttribLocation(this.at, "vColor");
        this.aJ = GLES20.glGetUniformLocation(this.at, "uMVPMatrix");
        this.aT = GLES20.glGetUniformLocation(this.at, "tex1");
        this.aM = com.saterskog.b.c.a(context, 2131558430, 2131558429);
        this.aN = GLES20.glGetAttribLocation(this.aM, "vPosition");
        this.aO = GLES20.glGetAttribLocation(this.aM, "vTP");
        this.aP = GLES20.glGetUniformLocation(this.aM, "uMVPMatrix");
        this.as = com.saterskog.b.c.a(context, 2131558405, 2131558404);
        this.aK = GLES20.glGetAttribLocation(this.as, "vPosition");
        this.bi = GLES20.glGetUniformLocation(this.as, "radius");
        this.bh = GLES20.glGetUniformLocation(this.as, "dir");
        this.aL = GLES20.glGetUniformLocation(this.as, "uMVPMatrix");
        this.aR = com.saterskog.b.c.a(context, 2131165286, false);
        this.aS = com.saterskog.b.c.a(context, 2131165269, true);
    }
    
    public final void a(final boolean b, final double n) {
        this.b(b, n);
        this.a(n);
    }
    
    public final void a(final float[] array) {
        GLES20.glDisable(2929);
        GLES20.glDepthMask(false);
        GLES20.glBlendFunc(1, 770);
        GLES20.glEnable(3042);
        GLES20.glUseProgram(this.as);
        GLES20.glEnableVertexAttribArray(this.aK);
        GLES20.glVertexAttribPointer(this.aK, 2, 5126, false, 8, (Buffer)this.k);
        GLES20.glUniformMatrix4fv(this.aL, 1, false, array, 0);
        GLES20.glUniform4f(this.bh, (float)Math.cos(this.O), (float)Math.sin(this.O), (float)this.e.f, (float)this.e.d);
        GLES20.glUniform1f(this.bi, (float)this.e.k);
        GLES20.glDrawArrays(4, 0, 6);
        GLES20.glDisableVertexAttribArray(this.aK);
        GLES20.glBlendFunc(770, 771);
        GLES20.glUseProgram(this.ar);
        GLES20.glEnableVertexAttribArray(this.aC);
        GLES20.glEnableVertexAttribArray(this.aD);
        GLES20.glEnableVertexAttribArray(this.aE);
        for (int n = 0; this.be > n * 32766; ++n) {
            final int n2 = n * 32766;
            final int min = Math.min(this.be - n2, 32766);
            this.l.put(this.ah, n2 * 2, min * 2);
            this.l.position(0);
            this.m.put(this.ai, n2 * 2, min * 2);
            this.m.position(0);
            this.o.put(this.aj, n2 * 4, min * 4);
            this.o.position(0);
            GLES20.glVertexAttribPointer(this.aC, 2, 5126, false, 8, (Buffer)this.l);
            GLES20.glVertexAttribPointer(this.aD, 2, 5126, false, 8, (Buffer)this.m);
            GLES20.glVertexAttribPointer(this.aE, 4, 5126, false, 16, (Buffer)this.o);
            GLES20.glUniformMatrix4fv(this.aF, 1, false, array, 0);
            GLES20.glDrawArrays(4, 0, min);
        }
        GLES20.glDisableVertexAttribArray(this.aC);
        GLES20.glDisableVertexAttribArray(this.aD);
        GLES20.glDisableVertexAttribArray(this.aE);
        this.c(array);
        GLES20.glEnable(2929);
        GLES20.glDepthFunc(519);
        this.b(array);
        GLES20.glDepthMask(true);
        this.d(array);
        GLES20.glEnable(2929);
        GLES20.glDepthFunc(513);
        GLES20.glDepthMask(false);
        this.e(array);
        GLES20.glDisable(3042);
    }
    
    public final boolean a(final Cell cell) {
        boolean b;
        if (this.z < this.d && (cell == null || cell.b * cell.b + cell.c * cell.c < this.e.k * this.e.k)) {
            if (cell != null) {
                this.x[this.z].a(cell);
            }
            ++this.z;
            b = true;
        }
        else {
            b = false;
        }
        return b;
    }
    
    public final int b(final int n) {
        int i = 0;
        int n2 = 0;
        while (i < this.z) {
            int n3 = n2;
            if (this.x[i].E == n) {
                n3 = n2 + 1;
            }
            ++i;
            n2 = n3;
        }
        return n2;
    }
    
    public final void b() {
        for (int i = 0; i < this.z; ++i) {
            this.x[i].F = 0;
        }
    }
    
    public final void b(final boolean b, double n) {
        if (this.X != 0) {
            throw new RuntimeException("Tried to run update1 too early");
        }
        ++this.X;
        n *= 0.02;
        this.M += n;
        this.O += this.e.e * n;
        this.P = Math.cos(this.O);
        this.Q = Math.sin(this.O);
        com.saterskog.b.a.b();
        if (!this.bg) {
            this.i(n);
            this.k();
        }
        com.saterskog.b.a.b();
        this.f(n);
        com.saterskog.b.a.b();
        this.e(n);
        com.saterskog.b.a.b();
        this.j();
        com.saterskog.b.a.b();
        this.g();
        com.saterskog.b.a.b();
        if (!this.bg) {
            this.d(n);
        }
        com.saterskog.b.a.b();
        this.h(n);
        com.saterskog.b.a.b();
        this.i();
        com.saterskog.b.a.b();
        this.c(b, n);
        com.saterskog.b.a.b();
        this.c(n);
        this.h();
        this.L = true;
        com.saterskog.b.a.b();
        com.saterskog.b.a.a();
        ++this.X;
    }
    
    final void b(final float[] array) {
        GLES20.glUseProgram(this.at);
        GLES20.glEnableVertexAttribArray(this.aG);
        GLES20.glEnableVertexAttribArray(this.aI);
        GLES20.glEnableVertexAttribArray(this.aH);
        GLES20.glActiveTexture(33984);
        GLES20.glBindTexture(3553, this.aS);
        GLES20.glUniform1i(this.aT, 0);
        for (int n = 0; this.bf > n * 32766; ++n) {
            final int n2 = n * 32766;
            final int min = Math.min(this.bf - n2, 32766);
            this.l.put(this.ak, n2 * 4, min * 4);
            this.l.position(0);
            this.m.put(this.al, n2 * 2, min * 2);
            this.m.position(0);
            this.o.put(this.am, n2 * 4, min * 4);
            this.o.position(0);
            GLES20.glVertexAttribPointer(this.aG, 4, 5126, false, 16, (Buffer)this.l);
            GLES20.glVertexAttribPointer(this.aI, 2, 5126, false, 8, (Buffer)this.m);
            GLES20.glVertexAttribPointer(this.aH, 4, 5126, false, 16, (Buffer)this.o);
            GLES20.glUniformMatrix4fv(this.aJ, 1, false, array, 0);
            GLES20.glDrawArrays(4, 0, min);
        }
        GLES20.glDisableVertexAttribArray(this.aG);
        GLES20.glDisableVertexAttribArray(this.aI);
        GLES20.glDisableVertexAttribArray(this.aH);
    }
    
    public final int c() {
        int i = 0;
        int n = 0;
        while (i < this.z) {
            int n2 = n;
            if (this.x[i].E == 0) {
                n2 = n;
                if (Math.abs(this.x[i].J[0] - 0.0f) + Math.abs(this.x[i].J[1] - 0.0f) + Math.abs(this.x[i].J[2] - 0.0f) < 0.1f) {
                    n2 = n + 1;
                }
            }
            ++i;
            n = n2;
        }
        return n;
    }
    
    public final void c(final int e) {
        for (int i = 0; i < this.z; ++i) {
            this.x[i].E = e;
        }
    }
    
    final void c(final float[] array) {
        GLES20.glUseProgram(this.aM);
        GLES20.glEnableVertexAttribArray(this.aN);
        GLES20.glEnableVertexAttribArray(this.aO);
        for (int n = 0; this.ap > n * 32766; ++n) {
            final int offset = n * 32766;
            final int min = Math.min(this.ap - offset, 32766);
            this.l.put(this.an, offset * 4, min * 4);
            this.l.position(0);
            this.n.put(this.ao, offset, min);
            this.n.position(0);
            GLES20.glVertexAttribPointer(this.aN, 4, 5126, false, 16, (Buffer)this.l);
            GLES20.glVertexAttribPointer(this.aO, 1, 5126, false, 4, (Buffer)this.n);
            GLES20.glUniformMatrix4fv(this.aP, 1, false, array, 0);
            GLES20.glDrawArrays(4, 0, min);
        }
        GLES20.glDisableVertexAttribArray(this.aN);
        GLES20.glDisableVertexAttribArray(this.aO);
    }
    
    public final int d() {
        int i = 0;
        int n = 0;
        while (i < this.z) {
            int n2 = n;
            if (this.x[i].E == 0) {
                n2 = n;
                if (this.x[i].J[0] > 0.65f) {
                    n2 = n;
                    if (this.x[i].J[1] < 0.35f) {
                        n2 = n;
                        if (this.x[i].J[2] < 0.35f) {
                            n2 = n + 1;
                        }
                    }
                }
            }
            ++i;
            n = n2;
        }
        return n;
    }
    
    final void d(final float[] array) {
        int length = com.saterskog.cell_lab.h.B.length;
        if (this.bg) {
            ++length;
        }
        for (int i = 0; i < length; ++i) {
            if (i < com.saterskog.cell_lab.h.B.length) {
                if (com.saterskog.cell_lab.h.B[i].w == -1) {
                    continue;
                }
            }
            else {
                GLES20.glEnable(3042);
            }
            GLES20.glUseProgram(this.au[i]);
            if (this.ax[i] != -1) {
                GLES20.glEnableVertexAttribArray(this.ax[i]);
            }
            if (this.ay[i] != -1) {
                GLES20.glEnableVertexAttribArray(this.ay[i]);
            }
            if (this.aA[i] != -1) {
                GLES20.glEnableVertexAttribArray(this.aA[i]);
            }
            if (this.az[i] != -1) {
                GLES20.glEnableVertexAttribArray(this.az[i]);
            }
            if (this.aB[i] != -1) {
                GLES20.glActiveTexture(33984);
                GLES20.glBindTexture(3553, this.aR);
                GLES20.glUniform1i(this.aB[i], 0);
            }
            for (int j = 0; j < this.u[i]; ++j) {
                final int n = this.q[i][j];
                final int n2 = this.s[i][j];
                if (this.ax[i] != -1) {
                    this.l.put(this.ad, n * 2, n2 * 2);
                    this.l.position(0);
                    GLES20.glVertexAttribPointer(this.ax[i], 2, 5126, false, 8, (Buffer)this.l);
                }
                if (this.az[i] != -1) {
                    this.m.put(this.af, n * 2, n2 * 2);
                    this.m.position(0);
                    GLES20.glVertexAttribPointer(this.az[i], 2, 5126, false, 8, (Buffer)this.m);
                }
                if (this.ay[i] != -1) {
                    this.n.put(this.ae, n * 4, n2 * 4);
                    this.n.position(0);
                    GLES20.glVertexAttribPointer(this.ay[i], 4, 5126, false, 16, (Buffer)this.n);
                }
                if (this.aA[i] != -1) {
                    this.o.put(this.ag, n * 4, n2 * 4);
                    this.o.position(0);
                    GLES20.glVertexAttribPointer(this.aA[i], 4, 5126, false, 16, (Buffer)this.o);
                }
                GLES20.glUniformMatrix4fv(this.aQ[i], 1, false, array, 0);
                this.p.put(this.aq, this.r[i][j], this.t[i][j]);
                this.p.position(0);
                GLES20.glDrawElements(4, this.t[i][j], 5123, (Buffer)this.p);
            }
            if (this.ax[i] != -1) {
                GLES20.glDisableVertexAttribArray(this.ax[i]);
            }
            if (this.az[i] != -1) {
                GLES20.glDisableVertexAttribArray(this.az[i]);
            }
            if (this.ay[i] != -1) {
                GLES20.glDisableVertexAttribArray(this.ay[i]);
            }
            if (this.aA[i] != -1) {
                GLES20.glDisableVertexAttribArray(this.aA[i]);
            }
        }
    }
    
    public int describeContents() {
        return 0;
    }
    
    public final int e() {
        int i = 0;
        int n = 0;
        while (i < this.z) {
            int n2 = n;
            if (this.x[i].E == 0) {
                n2 = n;
                if (this.x[i].J[0] > 0.65f) {
                    n2 = n;
                    if (this.x[i].J[1] > 0.65f) {
                        n2 = n;
                        if (this.x[i].J[2] < 0.35f) {
                            n2 = n + 1;
                        }
                    }
                }
            }
            ++i;
            n = n2;
        }
        return n;
    }
    
    final void e(final float[] array) {
        final int length = com.saterskog.cell_lab.h.B.length;
        int n;
        if (this.bg) {
            n = 1;
        }
        else {
            n = 0;
        }
        final int n2 = length + n;
        for (int i = 0; i < length; ++i) {
            if (com.saterskog.cell_lab.h.B[i].y != -1) {
                GLES20.glUseProgram(this.au[n2 + i]);
                if (this.ax[n2 + i] != -1) {
                    GLES20.glEnableVertexAttribArray(this.ax[n2 + i]);
                }
                if (this.ay[n2 + i] != -1) {
                    GLES20.glEnableVertexAttribArray(this.ay[n2 + i]);
                }
                if (this.aA[n2 + i] != -1) {
                    GLES20.glEnableVertexAttribArray(this.aA[n2 + i]);
                }
                if (this.az[n2 + i] != -1) {
                    GLES20.glEnableVertexAttribArray(this.az[n2 + i]);
                }
                for (int n3 = 0; this.av[n2 + i] > n3 * 32766; ++n3) {
                    final int n4 = this.aw[n2 + i] + n3 * 32766;
                    final int min = Math.min(this.av[n2 + i] - n3 * 32766, 32766);
                    if (this.ax[n2 + i] != -1) {
                        this.l.put(this.ad, n4 * 2, min * 2);
                        this.l.position(0);
                        GLES20.glVertexAttribPointer(this.ax[n2 + i], 2, 5126, false, 8, (Buffer)this.l);
                    }
                    if (this.az[n2 + i] != -1) {
                        this.m.put(this.af, n4 * 4, min * 4);
                        this.m.position(0);
                        GLES20.glVertexAttribPointer(this.az[n2 + i], 4, 5126, false, 16, (Buffer)this.m);
                    }
                    if (this.ay[n2 + i] != -1) {
                        this.n.put(this.ae, n4 * 4, min * 4);
                        this.n.position(0);
                        GLES20.glVertexAttribPointer(this.ay[n2 + i], 4, 5126, false, 16, (Buffer)this.n);
                    }
                    if (this.aA[n2 + i] != -1) {
                        this.o.put(this.ag, n4 * 4, min * 4);
                        this.o.position(0);
                        GLES20.glVertexAttribPointer(this.aA[n2 + i], 4, 5126, false, 16, (Buffer)this.o);
                    }
                    GLES20.glUniformMatrix4fv(this.aQ[n2 + i], 1, false, array, 0);
                    GLES20.glDrawArrays(4, 0, min);
                }
                if (this.ax[n2 + i] != -1) {
                    GLES20.glDisableVertexAttribArray(this.ax[n2 + i]);
                }
                if (this.az[n2 + i] != -1) {
                    GLES20.glDisableVertexAttribArray(this.az[n2 + i]);
                }
                if (this.ay[n2 + i] != -1) {
                    GLES20.glDisableVertexAttribArray(this.ay[n2 + i]);
                }
                if (this.aA[n2 + i] != -1) {
                    GLES20.glDisableVertexAttribArray(this.aA[n2 + i]);
                }
            }
        }
    }
    
    public final double f() {
        double n = 0.0;
        for (int i = 0; i < this.B; ++i) {
            n += this.A[i].c;
        }
        return n;
    }
    
    public void writeToParcel(final Parcel parcel, final int n) {
        int n2;
        if (this.bg) {
            n2 = 1;
        }
        else {
            n2 = 0;
        }
        parcel.writeInt(n2);
        parcel.writeParcelable((Parcelable)this.e, n);
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
