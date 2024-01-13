package com.saterskog.cell_lab;

import android.content.Context;
import android.opengl.GLES20;
import android.os.Parcel;
import android.os.Parcelable;
import com.saterskog.b.a;
import com.saterskog.b.c;
import com.saterskog.b.d;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import java.nio.ShortBuffer;
import java.util.Arrays;
import java.util.zip.GZIPInputStream;

public class CellWorld implements Parcelable {
    public static final Parcelable.Creator<CellWorld> CREATOR = new Parcelable.Creator<CellWorld>() {
        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new CellWorld[i];
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new CellWorld(parcel);
        }
    };
    static final double a = Math.sqrt(2.0d);
    static final double b = (Math.sqrt(3.0d) / 4.0d);
    static final double c = (2.0d / Math.sqrt(Math.sqrt(2.0d) + 2.0d));
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

    public static long a(Environment environment) {
        long min = (long) ((Math.min(206, (int) ((environment.k / 0.03d) - 0.1d)) / 2) * 2);
        long min2 = (long) Math.min(207, (int) ((2.0d * environment.k) / 0.36d));
        long j2 = (28 * ((long) environment.r) * 4) + (56 * ((long) environment.r) * 4) + (28 * ((long) environment.r) * 4) + (56 * ((long) environment.r) * 4) + (21 * ((long) environment.r) * 4) + ((long) (environment.s * 6 * 2)) + ((long) (environment.s * 6 * 2)) + ((long) (environment.s * 6 * 4));
        int i2 = environment.r / 4;
        long j3 = ((min + 2) * (2 + min) * 203 * 4) + (((long) environment.r) * 24320) + (((long) environment.s) * 80);
        return j3 + ((min2 + 2) * (2 + min2) * 404 * 6) + ((j2 + ((long) (i2 * 6 * 4)) + ((long) (i2 * 6 * 2)) + ((long) (i2 * 6 * 4)) + (((long) (environment.r * 12)) * 7) + (((long) (environment.r * 6)) * 7)) * 8);
    }

    public CellWorld(boolean z2, Environment environment) {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        this.e = new Environment();
        this.ac = 202;
        this.v = new double[9];
        this.w = new double[9];
        this.D = new int[(h.B.length + 1)][];
        this.E = new int[(h.B.length + 1)];
        this.H = -1.0f;
        this.I = false;
        this.J = new Link[20];
        this.be = 0;
        this.bf = 0;
        this.N = 0.0d;
        this.O = 1.5707963267948966d;
        this.Y = new d();
        this.bg = z2;
        if (!z2) {
            this.d = environment.r;
            this.aa = environment.s;
            this.ab = this.d / 10;
        } else {
            this.d = 100;
            this.aa = 0;
        }
        this.ac = (this.d + 3) / 4;
        if (this.e == null) {
            a.a("changeEnvironment: env is null");
        }
        if (environment == null) {
            a.a("changeEnvironment: e is null");
        }
        this.e.a(environment);
        this.Z = (Math.min(206, (int) ((this.e.k / 0.03d) - 0.1d)) / 2) * 2;
        this.bd = Math.min(207, (int) ((2.0d * this.e.k) / 0.36d));
        if (0.06d >= (this.e.k * 2.0d) / ((double) this.Z)) {
            a.a("skit:Too large Cell.MAX_R for grid.");
        }
        this.K = new int[(this.d + 3)];
        this.x = new Cell[this.d];
        for (int i8 = 0; i8 < this.d; i8++) {
            this.x[i8] = new Cell();
        }
        this.z = 0;
        if (z2) {
            this.A = null;
        } else {
            this.A = new Food[this.aa];
            for (int i9 = 0; i9 < this.aa; i9++) {
                this.A[i9] = new Food();
            }
        }
        this.B = 0;
        this.y = new e[this.ac];
        for (int i10 = 0; i10 < this.ac; i10++) {
            this.y[i10] = new e();
        }
        this.C = 0;
        this.M = 0.0d;
        for (int i11 = 0; i11 < 20; i11++) {
            this.J[i11] = new Link();
        }
        this.aV = new int[((this.Z + 2) * (this.Z + 2))][];
        this.aW = new int[((this.Z + 2) * (this.Z + 2))];
        for (int i12 = 0; i12 < (this.Z + 2) * (this.Z + 2); i12++) {
            this.aV[i12] = new int[203];
            this.aW[i12] = 0;
        }
        this.ba = new int[((this.bd + 2) * (this.bd + 2))][];
        this.bb = new short[((this.bd + 2) * (this.bd + 2))][];
        this.bc = new int[((this.bd + 2) * (this.bd + 2))];
        for (int i13 = 0; i13 < (this.bd + 2) * (this.bd + 2); i13++) {
            this.ba[i13] = new int[404];
            this.bb[i13] = new short[404];
            this.bc[i13] = 0;
        }
        this.aY = new int[(this.d * 20)];
        this.aZ = new int[(this.d * 20)];
        int i14 = this.bg ? 2 : 1;
        this.ad = new float[(this.d * 28 * 4 * i14)];
        this.ae = new float[(this.d * 56 * 4 * i14)];
        this.af = new float[(this.d * 28 * 4 * i14)];
        this.ag = new float[(this.d * 56 * 4 * i14)];
        this.aq = new short[(i14 * this.d * 21 * 4)];
        this.ah = new float[(this.aa * 6 * 2)];
        this.ai = new float[(this.aa * 6 * 2)];
        this.aj = new float[(this.aa * 6 * 4)];
        this.ak = new float[(this.ac * 6 * 4)];
        this.al = new float[(this.ac * 6 * 2)];
        this.am = new float[(this.ac * 6 * 4)];
        this.an = new float[(this.d * 12 * 7)];
        this.ao = new float[(this.d * 6 * 7)];
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
        this.u = new int[((this.bg ? 1 : 0) + h.B.length)];
        int length = h.B.length;
        if (this.bg) {
            i2 = 1;
        } else {
            i2 = 0;
        }
        this.q = new int[(i2 + length)][];
        int length2 = h.B.length;
        if (this.bg) {
            i3 = 1;
        } else {
            i3 = 0;
        }
        this.r = new int[(i3 + length2)][];
        int length3 = h.B.length;
        if (this.bg) {
            i4 = 1;
        } else {
            i4 = 0;
        }
        this.s = new int[(i4 + length3)][];
        int length4 = h.B.length;
        if (this.bg) {
            i5 = 1;
        } else {
            i5 = 0;
        }
        this.t = new int[(i5 + length4)][];
        int i15 = 0;
        while (true) {
            int length5 = h.B.length;
            if (this.bg) {
                i6 = 1;
            } else {
                i6 = 0;
            }
            if (i15 >= i6 + length5) {
                break;
            }
            this.q[i15] = new int[201];
            this.r[i15] = new int[201];
            this.s[i15] = new int[201];
            this.t[i15] = new int[201];
            i15++;
        }
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(48);
        allocateDirect.order(ByteOrder.nativeOrder());
        this.k = allocateDirect.asFloatBuffer();
        this.k.put(new float[]{1.1f, 1.1f, 1.1f, -1.1f, -1.1f, -1.1f, -1.1f, -1.1f, -1.1f, 1.1f, 1.1f, 1.1f}, 0, 12);
        this.k.position(0);
        this.aU = 0;
        this.L = false;
        int i16 = 0;
        while (true) {
            int length6 = h.B.length;
            if (z2) {
                i7 = 1;
            } else {
                i7 = 0;
            }
            if (i16 >= i7 + length6) {
                break;
            }
            this.E[i16] = 0;
            this.D[i16] = new int[this.d];
            i16++;
        }
        if (((Math.sqrt(1.7999999999999998E-4d) * this.e.g) / 0.072d) * 0.02d > 1.0d) {
            a.a("skit:Too large timestep, close to unstable simulation.");
        }
        a(true, 0.0d);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public CellWorld(Parcel parcel) {
        this(parcel.readInt() == 1, (Environment) parcel.readParcelable(Environment.class.getClassLoader()));
        this.z = parcel.readInt();
        this.x = (Cell[]) parcel.createTypedArray(Cell.ad);
        this.B = parcel.readInt();
        this.A = (Food[]) parcel.createTypedArray(Food.g);
        this.M = parcel.readDouble();
        this.O = parcel.readDouble();
        this.V = parcel.readInt();
        this.W = parcel.readInt();
        this.S = parcel.readInt();
        this.R = parcel.readInt();
    }

    public final int a(InputStream inputStream) {
        ObjectInputStream objectInputStream;
        ObjectInputStream objectInputStream2 = new ObjectInputStream(inputStream);
        int readInt = objectInputStream2.readInt();
        if (readInt > 3054) {
            throw new RuntimeException("bad cellworld format for load: " + readInt + "!=95");
        }
        this.M = objectInputStream2.readDouble();
        this.z = objectInputStream2.readInt();
        this.e.a(objectInputStream2);
        if (readInt <= 12) {
            objectInputStream = objectInputStream2;
        } else {
            objectInputStream = new ObjectInputStream(new GZIPInputStream(inputStream, 65536));
        }
        if (readInt > 23) {
            this.O = objectInputStream.readDouble();
        }
        for (int i2 = 0; i2 < this.z; i2++) {
            this.x[i2].a(objectInputStream);
        }
        this.B = objectInputStream.readInt();
        for (int i3 = 0; i3 < this.B; i3++) {
            Food food = this.A[i3];
            if (readInt >= 8) {
                food.a = objectInputStream.readFloat();
                food.b = objectInputStream.readFloat();
                food.c = objectInputStream.readFloat();
            } else {
                food.a = (float) objectInputStream.readDouble();
                food.b = (float) objectInputStream.readDouble();
                food.c = (float) objectInputStream.readDouble();
            }
            if (readInt >= 22) {
                food.d = objectInputStream.readFloat();
                food.e = objectInputStream.readFloat();
                food.f = objectInputStream.readFloat();
            } else {
                food.d = 0.0f;
                food.e = 0.0f;
                food.f = 0.0f;
            }
        }
        a(true, 0.0d);
        this.C = 0;
        this.V = 0;
        this.W = 0;
        return readInt;
    }

    private void g() {
        for (int i2 = 0; i2 < this.aW.length; i2++) {
            this.aW[i2] = 0;
        }
        for (int i3 = 0; i3 < this.bc.length; i3++) {
            this.bc[i3] = 0;
        }
        int i4 = this.z;
        for (int i5 = 0; i5 < i4; i5++) {
            Cell cell = this.x[i5];
            int i6 = ((int) ((((this.e.k + cell.b) / (2.0d * this.e.k)) * ((double) this.bd)) + 1.0d)) + (((int) ((((this.e.k + cell.c) / (2.0d * this.e.k)) * ((double) this.bd)) + 1.0d)) * (this.bd + 2));
            int i7 = this.bc[i6];
            if (i7 < 404) {
                this.ba[i6][i7] = i5;
                this.bb[i6][i7] = 0;
                int[] iArr = this.bc;
                iArr[i6] = iArr[i6] + 1;
                if (cell.I[cell.D].s == h.SECROCYTE && cell.p >= 0.2d) {
                    if (cell.I[cell.D].u[4] == 0) {
                        this.ba[i6][i7] = -1 - i5;
                        this.bb[i6][i7] = 1;
                        int[] iArr2 = this.bc;
                        iArr2[i6] = iArr2[i6] + 1;
                    }
                    if (cell.I[cell.D].u[4] == 4) {
                        this.ba[i6][i7] = -1 - i5;
                        this.bb[i6][i7] = 2;
                        int[] iArr3 = this.bc;
                        iArr3[i6] = iArr3[i6] + 1;
                    }
                    if (cell.I[cell.D].u[4] == 5) {
                        this.ba[i6][i7] = -1 - i5;
                        this.bb[i6][i7] = 3;
                        int[] iArr4 = this.bc;
                        iArr4[i6] = iArr4[i6] + 1;
                    }
                    if (cell.I[cell.D].u[4] == 6) {
                        this.ba[i6][i7] = -1 - i5;
                        this.bb[i6][i7] = 5;
                        int[] iArr5 = this.bc;
                        iArr5[i6] = iArr5[i6] + 1;
                    }
                }
            } else {
                a.a("smellGridnMAX exhausted");
            }
            int i8 = (int) (((((this.e.k + cell.b) - cell.d) / (2.0d * this.e.k)) * ((double) this.Z)) + 1.0d);
            cell.K = (((int) (((((this.e.k + cell.c) - cell.d) / (2.0d * this.e.k)) * ((double) this.Z)) + 1.0d)) * (this.Z + 2)) + i8;
            if (this.aW[cell.K] < 203) {
                this.aV[cell.K][this.aW[cell.K]] = i5;
                int[] iArr6 = this.aW;
                int i9 = cell.K;
                iArr6[i9] = iArr6[i9] + 1;
            } else {
                a.a("gridnMAX exhausted: 203, " + cell.K);
            }
            int i10 = (int) (((((this.e.k + cell.c) + cell.d) / (2.0d * this.e.k)) * ((double) this.Z)) + 1.0d);
            cell.L = i8 + ((this.Z + 2) * i10);
            if (cell.L == cell.K) {
                cell.L = -1;
            } else if (this.aW[cell.L] < 203) {
                this.aV[cell.L][this.aW[cell.L]] = i5;
                int[] iArr7 = this.aW;
                int i11 = cell.L;
                iArr7[i11] = iArr7[i11] + 1;
            } else {
                a.a("gridnMAX exhausted: 203");
            }
            int i12 = (int) (((((this.e.k + cell.b) + cell.d) / (2.0d * this.e.k)) * ((double) this.Z)) + 1.0d);
            cell.M = (i10 * (this.Z + 2)) + i12;
            if (cell.M == cell.K || cell.M == cell.L) {
                cell.M = -1;
            } else if (this.aW[cell.M] < 203) {
                this.aV[cell.M][this.aW[cell.M]] = i5;
                int[] iArr8 = this.aW;
                int i13 = cell.M;
                iArr8[i13] = iArr8[i13] + 1;
            } else {
                a.a("gridnMAX exhausted: 203");
            }
            cell.N = i12 + (((int) (((((this.e.k + cell.c) - cell.d) / (2.0d * this.e.k)) * ((double) this.Z)) + 1.0d)) * (this.Z + 2));
            if (cell.N == cell.K || cell.N == cell.L || cell.N == cell.M) {
                cell.N = -1;
            } else if (this.aW[cell.N] < 203) {
                this.aV[cell.N][this.aW[cell.N]] = i5;
                int[] iArr9 = this.aW;
                int i14 = cell.N;
                iArr9[i14] = iArr9[i14] + 1;
            } else {
                a.a("gridnMAX exhausted: 203");
            }
        }
    }

    public final boolean a(Cell cell) {
        if (this.z >= this.d || (cell != null && (cell.b * cell.b) + (cell.c * cell.c) >= this.e.k * this.e.k)) {
            return false;
        }
        if (cell != null) {
            this.x[this.z].a(cell);
        }
        this.z++;
        return true;
    }

    private void b(double d2, double d3) {
        if (a((Cell) null)) {
            Cell cell = this.x[this.z - 1];
            cell.b = d2;
            cell.c = d3;
            cell.w = 0.21599999999999997d;
            cell.d = Math.sqrt(cell.w / 400.0d);
            cell.E = 2;
            cell.F = 0;
            cell.p = 1.0d;
            cell.T = -1;
            cell.y = this.Y.nextInt(1) == 1;
            int i2 = 0;
            while (true) {
                int i3 = i2;
                if (i3 >= 80) {
                    break;
                }
                cell.I[i3].b = (float) (0.072d + (this.Y.nextDouble() * 0.288d));
                cell.I[i3].a[0] = (float) this.Y.nextDouble();
                cell.I[i3].a[1] = (float) this.Y.nextDouble();
                cell.I[i3].a[2] = (float) this.Y.nextDouble();
                cell.I[i3].d = (float) (this.Y.nextDouble() * 2.0d * 3.141592653589793d);
                cell.I[i3].c = (float) (0.5d + (this.Y.b() * 0.2d));
                cell.I[i3].e = (float) (this.Y.nextDouble() * 2.0d * 3.141592653589793d);
                cell.I[i3].f = (float) (this.Y.nextDouble() * 2.0d * 3.141592653589793d);
                cell.I[i3].g = (float) (10.0d + (this.Y.b() * 3.0d));
                do {
                    cell.I[i3].s = h.B[this.Y.nextInt(h.B.length)];
                } while (!this.e.t[cell.I[i3].s.ordinal()]);
                cell.I[i3].i = this.Y.nextInt(80);
                cell.I[i3].j = this.Y.nextInt(80);
                cell.I[i3].l = this.Y.b() > 0.0d;
                cell.I[i3].m = this.Y.b() > 0.0d;
                cell.I[i3].n = this.Y.b() > 0.0d;
                cell.I[i3].h = ((float) this.Y.nextDouble()) * 35.0f;
                cell.I[i3].q = this.Y.nextInt(1) == 1;
                cell.I[i3].r = this.Y.nextInt(1) == 1;
                for (int i4 = 0; i4 < 11; i4++) {
                    if (this.e.t[h.NEUROCYTE.ordinal()] || this.e.t[h.SENSEOCYTE.ordinal()] || this.e.t[h.STEREOCYTE.ordinal()]) {
                        cell.I[i3].t[i4].e = (short) (this.Y.nextInt(2) + 1);
                        cell.I[i3].t[i4].d = (short) this.Y.nextInt(8);
                        cell.I[i3].t[i4].b = ((float) this.Y.b()) * 8.0f;
                        cell.I[i3].t[i4].a = ((float) this.Y.b()) * 8.0f;
                        cell.I[i3].t[i4].c = ((float) this.Y.b()) * 8.0f;
                    } else {
                        cell.I[i3].t[i4].e = 0;
                        cell.I[i3].t[i4].d = (short) this.Y.nextInt(8);
                        cell.I[i3].t[i4].b = (float) this.Y.b();
                        cell.I[i3].t[i4].a = 0.0f;
                        cell.I[i3].t[i4].c = 0.0f;
                    }
                }
                for (int i5 = 0; i5 < 11; i5++) {
                    cell.I[i3].u[i5] = this.Y.nextInt(Gene.w[i5]);
                }
                for (int i6 = 0; i6 < 7; i6++) {
                    cell.I[i3].v[i6] = Gene.z[i6] + (((float) this.Y.nextDouble()) * (Gene.A[i6] - Gene.z[i6]));
                }
                cell.I[i3].v[5] = ((float) Math.pow(this.Y.nextDouble(), 3.0d)) * Gene.A[5];
                i2 = i3 + 1;
            }
            cell.D = this.Y.nextInt(80);
            if (cell.I[cell.D].s == h.LIPOCYTE) {
                cell.S = 1.8f * ((float) this.Y.nextDouble());
            }
            cell.J[0] = cell.I[cell.D].a[0];
            cell.J[1] = cell.I[cell.D].a[1];
            cell.J[2] = cell.I[cell.D].a[2];
            cell.J[3] = 1.0f;
            cell.e = 0.0d;
            cell.f = 0.0d;
            cell.x = false;
            cell.l = 0.0d;
            cell.n = 0.0d;
            cell.k = this.Y.b() * 3.141592653589793d;
            cell.m = this.Y.b() * 3.141592653589793d;
            cell.C = 0;
            cell.o = 0.0d;
            cell.G = 0;
        }
    }

    public final void a(double d2, double d3, double d4, float f2) {
        if (this.B >= this.aa) {
            a.a("skit:Maximum number of foods reached (" + Integer.toString(this.aa) + "). This was not supposed to happen, maybe increase CellWorld.MAX_FOODS?");
        } else if ((d2 * d2) + (d3 * d3) < this.e.k * this.e.k) {
            this.A[this.B].a = (float) d2;
            this.A[this.B].b = (float) d3;
            this.A[this.B].c = (float) d4;
            this.A[this.B].d = 0.0f;
            this.A[this.B].e = 0.0f;
            this.A[this.B].f = f2;
            this.B++;
        }
    }

    public final void a(Context context) {
        int i2;
        int length = (h.B.length * 2) + (this.bg ? 1 : 0);
        this.au = new int[length];
        this.ax = new int[length];
        this.ay = new int[length];
        this.az = new int[length];
        this.aA = new int[length];
        this.aB = new int[length];
        this.av = new int[length];
        this.aw = new int[length];
        this.aQ = new int[length];
        int length2 = h.B.length;
        if (this.bg) {
            i2 = 1;
        } else {
            i2 = 0;
        }
        int i3 = length2 + i2;
        for (int i4 = 0; i4 < length; i4++) {
            if (i4 < h.B.length) {
                this.au[i4] = c.a(context, h.B[i4].w, h.B[i4].x);
            } else if (this.bg && i4 == h.B.length) {
                this.au[i4] = c.a(context, (int) C0028R.raw.arrow_vert, (int) C0028R.raw.arrow_frag);
            } else if (h.B[i4 - i3].y != -1) {
                this.au[i4] = c.a(context, h.B[i4 - i3].y, h.B[i4 - i3].z);
            }
            GLES20.glUseProgram(this.au[i4]);
            this.ax[i4] = GLES20.glGetAttribLocation(this.au[i4], "vPosition");
            this.ay[i4] = GLES20.glGetAttribLocation(this.au[i4], "vTPosition");
            this.az[i4] = GLES20.glGetAttribLocation(this.au[i4], "vCenter");
            this.aA[i4] = GLES20.glGetAttribLocation(this.au[i4], "vColor");
            this.aB[i4] = GLES20.glGetUniformLocation(this.au[i4], "tex1");
            this.aQ[i4] = GLES20.glGetUniformLocation(this.au[i4], "uMVPMatrix");
        }
        this.ar = c.a(context, (int) C0028R.raw.food_vert, (int) C0028R.raw.food_frag);
        this.aC = GLES20.glGetAttribLocation(this.ar, "vPosition");
        this.aD = GLES20.glGetAttribLocation(this.ar, "vCenter");
        this.aE = GLES20.glGetAttribLocation(this.ar, "color");
        this.aF = GLES20.glGetUniformLocation(this.ar, "uMVPMatrix");
        this.at = c.a(context, (int) C0028R.raw.dead_vert, (int) C0028R.raw.dead_frag);
        this.aG = GLES20.glGetAttribLocation(this.at, "vPosition");
        this.aI = GLES20.glGetAttribLocation(this.at, "vCenter");
        this.aH = GLES20.glGetAttribLocation(this.at, "vColor");
        this.aJ = GLES20.glGetUniformLocation(this.at, "uMVPMatrix");
        this.aT = GLES20.glGetUniformLocation(this.at, "tex1");
        this.aM = c.a(context, (int) C0028R.raw.link_vert, (int) C0028R.raw.link_frag);
        this.aN = GLES20.glGetAttribLocation(this.aM, "vPosition");
        this.aO = GLES20.glGetAttribLocation(this.aM, "vTP");
        this.aP = GLES20.glGetUniformLocation(this.aM, "uMVPMatrix");
        this.as = c.a(context, (int) C0028R.raw.bg_vert, (int) C0028R.raw.bg_frag);
        this.aK = GLES20.glGetAttribLocation(this.as, "vPosition");
        this.bi = GLES20.glGetUniformLocation(this.as, "radius");
        this.bh = GLES20.glGetUniformLocation(this.as, "dir");
        this.aL = GLES20.glGetUniformLocation(this.as, "uMVPMatrix");
        this.aR = c.a(context, (int) C0028R.drawable.small_dots, false);
        this.aS = c.a(context, (int) C0028R.drawable.gauss_bessel_integral, true);
    }

    public final void a(int i2, boolean z2) {
        for (int i3 = 0; i3 < this.x[i2].C; i3++) {
            if (this.x[i2].H[i3].a != -1) {
                int i4 = 0;
                while (true) {
                    if (i4 >= this.x[this.x[i2].H[i3].a].C) {
                        break;
                    } else if (this.x[this.x[i2].H[i3].a].H[i4].a == i2) {
                        this.x[this.x[i2].H[i3].a].H[i4].a(this.x[this.x[i2].H[i3].a].H[this.x[this.x[i2].H[i3].a].C - 1]);
                        Cell cell = this.x[this.x[i2].H[i3].a];
                        cell.C--;
                        break;
                    } else {
                        i4++;
                    }
                }
            }
        }
        for (int i5 = 0; i5 < this.x[this.z - 1].C; i5++) {
            if (this.x[this.z - 1].H[i5].a != -1) {
                int i6 = 0;
                while (true) {
                    if (i6 >= this.x[this.x[this.z - 1].H[i5].a].C) {
                        break;
                    } else if (this.x[this.x[this.z - 1].H[i5].a].H[i6].a == this.z - 1) {
                        this.x[this.x[this.z - 1].H[i5].a].H[i6].a = i2;
                        break;
                    } else {
                        i6++;
                    }
                }
            }
        }
        if (z2) {
            if (this.B >= this.aa) {
                a.a("Too many pieces of food!!");
            } else {
                a(this.x[i2].b, this.x[i2].c, 0.9d * this.x[i2].w, this.x[i2].b().s == h.LIPOCYTE ? 0.5f : 0.0f);
            }
        }
        if (this.C < this.ac) {
            Cell cell2 = this.x[i2];
            if ((cell2.b * cell2.b) + (cell2.c * cell2.c) <= this.e.k * this.e.k) {
                this.y[this.C].a = cell2.b;
                this.y[this.C].b = cell2.c;
                this.y[this.C].c = cell2.d;
                this.y[this.C].d = 0.0d;
                this.y[this.C].e[0] = cell2.J[0];
                this.y[this.C].e[1] = cell2.J[1];
                this.y[this.C].e[2] = cell2.J[2];
                this.y[this.C].e[3] = cell2.J[3];
                this.C++;
            }
        }
        this.x[i2].a(this.x[this.z - 1]);
        this.z--;
        this.R++;
    }

    public final int a(double d2, double d3) {
        double d4 = 0.009d;
        int i2 = -1;
        for (int i3 = 0; i3 < this.z; i3++) {
            double d5 = ((d2 - this.x[i3].b) * (d2 - this.x[i3].b)) + ((d3 - this.x[i3].c) * (d3 - this.x[i3].c));
            if (d5 <= this.x[i3].d * this.x[i3].d && d5 < d4) {
                i2 = i3;
                d4 = d5;
            }
        }
        return i2;
    }

    public final int a(int i2) {
        for (int i3 = 0; i3 < this.z; i3++) {
            if (this.x[i3].F == i2) {
                return i3;
            }
        }
        return -1;
    }

    public final void a(boolean z2, double d2) {
        b(z2, d2);
        a(d2);
    }

    public final void b(boolean z2, double d2) {
        if (this.X != 0) {
            throw new RuntimeException("Tried to run update1 too early");
        }
        this.X++;
        double d3 = 0.02d * d2;
        this.M += d3;
        this.O += this.e.e * d3;
        this.P = Math.cos(this.O);
        this.Q = Math.sin(this.O);
        a.b();
        if (!this.bg) {
            i(d3);
            k();
        }
        a.b();
        f(d3);
        a.b();
        e(d3);
        a.b();
        j();
        a.b();
        g();
        a.b();
        if (!this.bg) {
            d(d3);
        }
        a.b();
        h(d3);
        a.b();
        i();
        a.b();
        c(z2, d3);
        a.b();
        c(d3);
        h();
        this.L = true;
        a.b();
        a.a();
        this.X++;
    }

    private void b(double d2) {
        float f2 = ((float) d2) / 4.0f;
        int i2 = 4;
        int i3 = 0;
        int i4 = 0;
        while (true) {
            int i5 = i4;
            int i6 = i2;
            i2 = i3;
            if (i5 < 4) {
                int i7 = 0;
                while (i7 < this.z) {
                    Cell cell = this.x[i7];
                    if (i5 == 0) {
                        if (Double.isNaN(cell.Q)) {
                            a.b("NaN final");
                            cell.Q = 0.0d;
                            a(i7, false);
                            i7--;
                            i7++;
                        } else {
                            cell.w = cell.Q;
                            cell.X = cell.Z;
                            cell.p = cell.R;
                        }
                    }
                    Gene gene = cell.I[cell.D];
                    if (gene.s == h.NEUROCYTE) {
                        for (int i8 = 0; i8 < 4; i8++) {
                            cell.W[i8] = 0.0f;
                        }
                        int i9 = 0;
                        while (true) {
                            int i10 = i9;
                            if (i10 >= 4) {
                                break;
                            }
                            float a2 = cell.a(i10 + 7, i2);
                            if (a2 < -20.0f) {
                                a2 = -20.0f;
                            }
                            if (a2 > 20.0f) {
                                a2 = 20.0f;
                            }
                            float[] fArr = cell.W;
                            int i11 = gene.u[i10 + 5];
                            fArr[i11] = a2 + fArr[i11];
                            i9 = i10 + 1;
                        }
                    }
                    for (int i12 = 0; i12 < 4; i12++) {
                        cell.U[i6 + i12] = cell.U[i2 + i12] + ((cell.W[i12] - (5.0f * cell.U[i2 + i12])) * f2);
                        if (i5 == 3) {
                            cell.V[i12] = cell.W[i12];
                            cell.W[i12] = 0.0f;
                        }
                    }
                    for (int i13 = 0; i13 < cell.C; i13++) {
                        if (cell.H[i13].a >= 0) {
                            Cell cell2 = this.x[cell.H[i13].a];
                            if (!(gene.s == h.LIPOCYTE || cell2.I[cell2.D].s == h.LIPOCYTE)) {
                                for (int i14 = 0; i14 < 4; i14++) {
                                    float[] fArr2 = cell.U;
                                    int i15 = i6 + i14;
                                    fArr2[i15] = fArr2[i15] + (5.0f * (cell2.U[i2 + i14] - cell.U[i2 + i14]) * f2);
                                }
                            }
                        }
                    }
                    for (int i16 = 0; i16 < 4; i16++) {
                        if (cell.U[i6 + i16] < -1.0f) {
                            cell.U[i6 + i16] = -1.0f;
                        }
                        if (cell.U[i6 + i16] > 1.0f) {
                            cell.U[i6 + i16] = 1.0f;
                        }
                    }
                    i7++;
                }
                i3 = 4 - i2;
                i4 = i5 + 1;
            } else {
                return;
            }
        }
    }

    public final void a(double d2) {
        if (this.X != 2) {
            throw new RuntimeException("Tried to run update2 too early");
        }
        double d3 = 0.02d * d2;
        g(d3);
        a.b();
        b(d3);
        this.X = 0;
    }

    private void c(double d2) {
        double d3;
        double d4;
        int i2 = this.z;
        for (int i3 = 0; i3 < i2; i3++) {
            Cell cell = this.x[i3];
            double d5 = cell.w;
            double d6 = 0.7d * cell.w * cell.d * cell.d;
            double d7 = (cell.g / d5) * d2;
            double d8 = (cell.h / d5) * d2;
            double d9 = (cell.j * d2) / d6;
            cell.q += cell.i * d2 * 10.0d;
            double d10 = 1.0d - (cell.q * 3.0d);
            if (d10 < 0.0d) {
                d10 = 0.0d;
            }
            if (d10 > 4.0d) {
                d10 = 4.0d;
            }
            double d11 = cell.w * d10;
            if (cell.z) {
                double d12 = this.e.l * d11;
                if ((d7 * d7) + (d8 * d8) > d12 * d12 * d2 * d2 || Math.abs(d9) > d12 * d2 * 0.6666666666666666d) {
                    cell.z = false;
                }
            }
            if (!cell.z) {
                double d13 = cell.e + d7;
                double d14 = d8 + cell.f;
                double d15 = d9 + cell.l;
                double sqrt = Math.sqrt((d13 * d13) + (d14 * d14));
                if (cell.l != 0.0d) {
                    double abs = sqrt / (cell.d * Math.abs(cell.l));
                    double d16 = abs * abs;
                    d3 = ((0.1d * abs) + d16) / (((0.1d * abs) + d16) + 0.15d);
                    d4 = (1.0d - ((d16 + abs) / ((abs + d16) + 5.0d))) * 0.65d;
                    if (Double.isNaN(d3) || Double.isNaN(d4)) {
                        d3 = 1.0d;
                        d4 = 0.0d;
                    }
                } else {
                    d3 = 1.0d;
                    d4 = 0.0d;
                }
                double d17 = d3 * this.e.m * d11;
                double d18 = d4 * this.e.m * cell.w;
                double d19 = (d17 / cell.w) * d2;
                double d20 = (d18 / d6) * d2;
                boolean z2 = false;
                if ((d13 * d13) + (d14 * d14) <= d19 * d19) {
                    cell.e = 0.0d;
                    cell.f = 0.0d;
                    z2 = true;
                } else {
                    cell.e = d13 - ((d13 * d19) / sqrt);
                    cell.f = d14 - ((d19 * d14) / sqrt);
                }
                if (Math.abs(d15) <= d20) {
                    cell.l = 0.0d;
                    if (z2) {
                        cell.z = true;
                    }
                } else {
                    cell.l = d15 - (Math.signum(cell.l) * d20);
                }
            }
            cell.g = cell.e;
            cell.h = cell.f;
            cell.j = cell.l;
        }
    }

    private void h() {
        double sqrt;
        double d2;
        double d3;
        double d4;
        double d5;
        double d6;
        double d7;
        for (int i2 = 0; i2 < this.aX; i2++) {
            Cell cell = this.x[this.aY[i2]];
            Cell cell2 = null;
            double d8 = cell.b;
            double d9 = cell.c;
            double d10 = cell.d;
            double d11 = 0.0d;
            double d12 = 0.0d;
            if (this.aZ[i2] == -1) {
                sqrt = Math.sqrt((d8 * d8) + (d9 * d9));
                d2 = this.e.k - sqrt;
                d3 = d8 / sqrt;
                d4 = d9 / sqrt;
                d5 = d2 * d3;
                d6 = d2 * d4;
            } else {
                cell2 = this.x[this.aZ[i2]];
                double d13 = cell2.b;
                double d14 = cell2.c;
                double d15 = cell2.d;
                sqrt = Math.sqrt(((d8 - d13) * (d8 - d13)) + ((d9 - d14) * (d9 - d14)));
                d2 = ((d10 * d10) + ((sqrt * sqrt) - (d15 * d15))) / (2.0d * sqrt);
                d3 = (d13 - d8) / sqrt;
                d4 = (d14 - d9) / sqrt;
                d5 = d2 * d3;
                d6 = d2 * d4;
                d11 = cell2.g - (((d9 + d6) - d14) * cell2.j);
                d12 = (((d8 + d5) - d13) * cell2.j) + cell2.h;
            }
            double d16 = (cell.g - (d6 * cell.j)) - d11;
            double d17 = ((d5 * cell.j) + cell.h) - d12;
            double d18 = (d3 * d16) + (d4 * d17);
            double d19 = d16 - (d3 * d18);
            double d20 = d17 - (d4 * d18);
            double d21 = 0;
            if (cell.I[cell.D].s == h.CILIOCYTE) {
                double cos = (Math.cos(cell.k) * d4) - (Math.sin(cell.k) * d3);
                if (cos < -0.2d || cos > 0.2d) {
                    d21 = ((0.0d > cos ? 1 : (0.0d == cos ? 0 : -1)) < 0) != cell.y ? 0.0d + (cos * 0.075d * ((double) cell.a(2, 0))) : 0.0d + (cos * 0.075d * ((double) cell.a(4, 0)));
                }
            }
            if (this.aZ[i2] != -1 && cell2.I[cell2.D].s == h.CILIOCYTE) {
                double sin = (Math.sin(cell2.k) * d3) + (Math.cos(cell2.k) * (-d4));
                if (sin < -0.2d || sin > 0.2d) {
                    if ((0.0d < sin) != cell2.y) {
                        d21 += 0.075d * sin * ((double) cell2.a(2, 0));
                    } else {
                        d21 += 0.075d * sin * ((double) cell2.a(4, 0));
                    }
                }
            }
            double d22 = d19 + (d4 * d21);
            double d23 = d20 - (d21 * d3);
            double d24 = cell.w * cell.d * cell.d * 0.7d;
            double d25 = 0.0d;
            if (this.aZ[i2] == -1) {
                d7 = ((1.0d / ((1.0d / cell.w) + (1.0d * ((d2 * d2) / d24)))) / 0.02d) * 0.9d;
            } else {
                d25 = cell2.w * cell2.d * cell2.d * 0.7d;
                d7 = ((1.0d / (((1.0d / cell.w) + (1.0d / cell2.w)) + (1.0d * (((d2 * d2) / d24) + (((sqrt - d2) * (sqrt - d2)) / d25))))) / 0.02d) * 0.9d;
            }
            double d26 = (-d22) * d7;
            double d27 = d7 * (-d23);
            cell.e += (0.02d * d26) / cell.w;
            cell.f += (0.02d * d27) / cell.w;
            cell.l += (((1.0d * d2) * (((-d26) * d4) + (d27 * d3))) * 0.02d) / d24;
            if (this.aZ[i2] != -1) {
                cell2.e -= (0.02d * d26) / cell2.w;
                cell2.f -= (0.02d * d27) / cell2.w;
                cell2.l = (((((sqrt - d2) * 1.0d) * (((-d26) * d4) + (d27 * d3))) * 0.02d) / d25) + cell2.l;
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:181:0x0b51  */
    /* JADX WARNING: Removed duplicated region for block: B:236:0x0e20  */
    /* JADX WARNING: Removed duplicated region for block: B:287:0x10c0  */
    /* JADX WARNING: Removed duplicated region for block: B:291:0x10cd  */
    /* JADX WARNING: Removed duplicated region for block: B:297:0x1180  */
    /* JADX WARNING: Removed duplicated region for block: B:304:0x1249  */
    /* JADX WARNING: Removed duplicated region for block: B:334:0x137f  */
    /* JADX WARNING: Removed duplicated region for block: B:404:0x16b8  */
    /* JADX WARNING: Removed duplicated region for block: B:439:0x1876  */
    /* JADX WARNING: Removed duplicated region for block: B:472:0x1a2f  */
    /* JADX WARNING: Removed duplicated region for block: B:544:0x1b52 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void d(int r47) {
        /*
            r46 = this;
            r0 = r46
            com.saterskog.cell_lab.Cell[] r4 = r0.x
            r20 = r4[r47]
            r0 = r20
            com.saterskog.cell_lab.Gene[] r4 = r0.I
            r0 = r20
            int r5 = r0.D
            r4 = r4[r5]
            com.saterskog.cell_lab.h r0 = r4.s
            r21 = r0
            com.saterskog.cell_lab.h r4 = com.saterskog.cell_lab.h.STEREOCYTE
            r0 = r21
            if (r0 == r4) goto L_0x0020
            com.saterskog.cell_lab.h r4 = com.saterskog.cell_lab.h.SENSEOCYTE
            r0 = r21
            if (r0 != r4) goto L_0x0480
        L_0x0020:
            r6 = 0
            r4 = 0
            com.saterskog.cell_lab.h r8 = com.saterskog.cell_lab.h.STEREOCYTE
            r0 = r21
            if (r0 != r8) goto L_0x003a
            r0 = r20
            double r4 = r0.k
            double r6 = java.lang.Math.cos(r4)
            r0 = r20
            double r4 = r0.k
            double r4 = java.lang.Math.sin(r4)
        L_0x003a:
            r0 = r46
            com.saterskog.cell_lab.Environment r8 = r0.e
            double r8 = r8.k
            r0 = r20
            double r10 = r0.b
            double r8 = r8 + r10
            r10 = 4611686018427387904(0x4000000000000000, double:2.0)
            r0 = r46
            com.saterskog.cell_lab.Environment r12 = r0.e
            double r12 = r12.k
            double r10 = r10 * r12
            double r8 = r8 / r10
            r0 = r46
            int r10 = r0.bd
            double r10 = (double) r10
            double r8 = r8 * r10
            r10 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            double r8 = r8 + r10
            int r0 = (int) r8
            r22 = r0
            r0 = r46
            com.saterskog.cell_lab.Environment r8 = r0.e
            double r8 = r8.k
            r0 = r20
            double r10 = r0.c
            double r8 = r8 + r10
            r10 = 4611686018427387904(0x4000000000000000, double:2.0)
            r0 = r46
            com.saterskog.cell_lab.Environment r12 = r0.e
            double r12 = r12.k
            double r10 = r10 * r12
            double r8 = r8 / r10
            r0 = r46
            int r10 = r0.bd
            double r10 = (double) r10
            double r8 = r8 * r10
            r10 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            double r8 = r8 + r10
            int r0 = (int) r8
            r23 = r0
            r8 = 0
            r0 = r20
            com.saterskog.cell_lab.Gene[] r9 = r0.I
            r0 = r20
            int r10 = r0.D
            r9 = r9[r10]
            int[] r9 = r9.u
            r10 = 3
            r9 = r9[r10]
            r10 = 3
            if (r9 != r10) goto L_0x00ad
            com.saterskog.cell_lab.h r8 = com.saterskog.cell_lab.h.SENSEOCYTE
            r0 = r21
            if (r0 != r8) goto L_0x02a6
            r8 = 0
            r0 = r20
            double r10 = r0.b
            r0 = r20
            double r12 = r0.c
            r0 = r46
            double r10 = r0.c((double) r10, (double) r12)
            r12 = 4596373779694328218(0x3fc999999999999a, double:0.2)
            double r10 = r10 * r12
            double r8 = r8 + r10
            float r8 = (float) r8
        L_0x00ad:
            r0 = r20
            com.saterskog.cell_lab.Gene[] r9 = r0.I
            r0 = r20
            int r10 = r0.D
            r9 = r9[r10]
            int[] r9 = r9.u
            r10 = 3
            r9 = r9[r10]
            r10 = 4
            if (r9 != r10) goto L_0x00e2
            com.saterskog.cell_lab.h r9 = com.saterskog.cell_lab.h.SENSEOCYTE
            r0 = r21
            if (r0 != r9) goto L_0x02d2
            double r8 = (double) r8
            r0 = r20
            double r10 = r0.e
            r0 = r20
            double r12 = r0.e
            double r10 = r10 * r12
            r0 = r20
            double r12 = r0.f
            r0 = r20
            double r14 = r0.f
            double r12 = r12 * r14
            double r10 = r10 + r12
            double r10 = java.lang.Math.sqrt(r10)
            r12 = 4613937818241073152(0x4008000000000000, double:3.0)
            double r10 = r10 * r12
            double r8 = r8 + r10
            float r8 = (float) r8
        L_0x00e2:
            r0 = r20
            com.saterskog.cell_lab.Gene[] r9 = r0.I
            r0 = r20
            int r10 = r0.D
            r9 = r9[r10]
            int[] r9 = r9.u
            r10 = 3
            r9 = r9[r10]
            r10 = 5
            if (r9 != r10) goto L_0x0135
            r0 = r20
            double r10 = r0.b
            r0 = r20
            double r12 = r0.b
            double r10 = r10 * r12
            r0 = r20
            double r12 = r0.c
            r0 = r20
            double r14 = r0.c
            double r12 = r12 * r14
            double r10 = r10 + r12
            double r10 = java.lang.Math.sqrt(r10)
            r12 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            r14 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            r0 = r46
            com.saterskog.cell_lab.Environment r9 = r0.e
            double r0 = r9.k
            r16 = r0
            double r16 = r16 - r10
            r18 = 4598535507515466056(0x3fd147ae147ae148, double:0.27)
            double r16 = r16 / r18
            double r14 = r14 - r16
            double r12 = java.lang.Math.min(r12, r14)
            r14 = 0
            double r12 = java.lang.Math.max(r12, r14)
            com.saterskog.cell_lab.h r9 = com.saterskog.cell_lab.h.SENSEOCYTE
            r0 = r21
            if (r0 != r9) goto L_0x02e5
            double r8 = (double) r8
            double r8 = r8 + r12
            float r8 = (float) r8
        L_0x0135:
            r0 = r20
            com.saterskog.cell_lab.Gene[] r9 = r0.I
            r0 = r20
            int r10 = r0.D
            r9 = r9[r10]
            int[] r9 = r9.u
            r10 = 3
            r9 = r9[r10]
            if (r9 == 0) goto L_0x018e
            r0 = r20
            com.saterskog.cell_lab.Gene[] r9 = r0.I
            r0 = r20
            int r10 = r0.D
            r9 = r9[r10]
            int[] r9 = r9.u
            r10 = 3
            r9 = r9[r10]
            r10 = 1
            if (r9 == r10) goto L_0x018e
            r0 = r20
            com.saterskog.cell_lab.Gene[] r9 = r0.I
            r0 = r20
            int r10 = r0.D
            r9 = r9[r10]
            int[] r9 = r9.u
            r10 = 3
            r9 = r9[r10]
            r10 = 2
            if (r9 == r10) goto L_0x018e
            r0 = r20
            com.saterskog.cell_lab.Gene[] r9 = r0.I
            r0 = r20
            int r10 = r0.D
            r9 = r9[r10]
            int[] r9 = r9.u
            r10 = 3
            r9 = r9[r10]
            r10 = 3
            if (r9 == r10) goto L_0x018e
            r0 = r20
            com.saterskog.cell_lab.Gene[] r9 = r0.I
            r0 = r20
            int r10 = r0.D
            r9 = r9[r10]
            int[] r9 = r9.u
            r10 = 3
            r9 = r9[r10]
            r10 = 5
            if (r9 != r10) goto L_0x0445
        L_0x018e:
            r9 = -1
            r19 = r9
        L_0x0191:
            r9 = 2
            r0 = r19
            if (r0 >= r9) goto L_0x0445
            r9 = -1
            r18 = r9
            r9 = r8
        L_0x019a:
            r8 = 2
            r0 = r18
            if (r0 >= r8) goto L_0x043e
            int r8 = r22 + r19
            int r10 = r23 + r18
            if (r8 < 0) goto L_0x0438
            r0 = r46
            int r11 = r0.bd
            int r11 = r11 + 2
            if (r8 >= r11) goto L_0x0438
            if (r10 < 0) goto L_0x0438
            r0 = r46
            int r11 = r0.bd
            int r11 = r11 + 2
            if (r10 >= r11) goto L_0x0438
            r0 = r46
            int r11 = r0.bd
            int r11 = r11 + 2
            int r10 = r10 * r11
            int r24 = r8 + r10
            r8 = 0
        L_0x01c1:
            r0 = r46
            int[] r10 = r0.bc
            r10 = r10[r24]
            if (r8 >= r10) goto L_0x0438
            r0 = r46
            short[][] r10 = r0.bb
            r10 = r10[r24]
            short r10 = r10[r8]
            r0 = r20
            com.saterskog.cell_lab.Gene[] r11 = r0.I
            r0 = r20
            int r12 = r0.D
            r11 = r11[r12]
            int[] r11 = r11.u
            r12 = 3
            r11 = r11[r12]
            if (r10 != r11) goto L_0x02a2
            r0 = r46
            int[][] r10 = r0.ba
            r10 = r10[r24]
            r10 = r10[r8]
            r0 = r47
            if (r10 == r0) goto L_0x02a2
            r0 = r20
            com.saterskog.cell_lab.Gene[] r10 = r0.I
            r0 = r20
            int r11 = r0.D
            r10 = r10[r11]
            int[] r10 = r10.u
            r11 = 3
            r10 = r10[r11]
            if (r10 != 0) goto L_0x0322
            r0 = r46
            com.saterskog.cell_lab.Cell[] r10 = r0.x
            r0 = r46
            int[][] r11 = r0.ba
            r11 = r11[r24]
            r11 = r11[r8]
            r10 = r10[r11]
            r0 = r20
            com.saterskog.cell_lab.Gene[] r11 = r0.I
            r0 = r20
            int r12 = r0.D
            r11 = r11[r12]
            float[] r11 = r11.v
            r12 = 1
            r11 = r11[r12]
            float[] r12 = r10.J
            r13 = 0
            r12 = r12[r13]
            float r11 = r11 - r12
            r0 = r20
            com.saterskog.cell_lab.Gene[] r12 = r0.I
            r0 = r20
            int r13 = r0.D
            r12 = r12[r13]
            float[] r12 = r12.v
            r13 = 2
            r12 = r12[r13]
            float[] r13 = r10.J
            r14 = 1
            r13 = r13[r14]
            float r12 = r12 - r13
            r0 = r20
            com.saterskog.cell_lab.Gene[] r13 = r0.I
            r0 = r20
            int r14 = r0.D
            r13 = r13[r14]
            float[] r13 = r13.v
            r14 = 3
            r13 = r13[r14]
            float[] r14 = r10.J
            r15 = 2
            r14 = r14[r15]
            float r13 = r13 - r14
            r0 = r20
            com.saterskog.cell_lab.Gene[] r14 = r0.I
            r0 = r20
            int r15 = r0.D
            r14 = r14[r15]
            float[] r14 = r14.v
            r15 = 4
            r14 = r14[r15]
            float r11 = r11 * r11
            float r12 = r12 * r12
            float r11 = r11 + r12
            float r12 = r13 * r13
            float r11 = r11 + r12
            float r12 = r14 * r14
            int r11 = (r11 > r12 ? 1 : (r11 == r12 ? 0 : -1))
            if (r11 >= 0) goto L_0x02a2
            r0 = r20
            double r12 = r0.b
            double r14 = r10.b
            double r12 = r12 - r14
            r0 = r20
            double r14 = r0.c
            double r0 = r10.c
            r16 = r0
            double r14 = r14 - r16
            double r16 = r12 * r12
            double r26 = r14 * r14
            double r16 = r16 + r26
            double r16 = java.lang.Math.sqrt(r16)
            r26 = 0
            int r11 = (r16 > r26 ? 1 : (r16 == r26 ? 0 : -1))
            if (r11 <= 0) goto L_0x02a2
            com.saterskog.cell_lab.h r11 = com.saterskog.cell_lab.h.SENSEOCYTE
            r0 = r21
            if (r0 != r11) goto L_0x0303
            double r12 = (double) r9
            double r10 = r10.w
            r14 = 4591149604126578442(0x3fb70a3d70a3d70a, double:0.09)
            double r14 = r16 / r14
            double r14 = com.saterskog.b.b.a(r14)
            double r10 = r10 * r14
            r14 = 4621819117588971520(0x4024000000000000, double:10.0)
            double r10 = r10 * r14
            double r10 = r10 + r12
            float r9 = (float) r10
        L_0x02a2:
            int r8 = r8 + 1
            goto L_0x01c1
        L_0x02a6:
            r8 = 0
            r0 = r20
            double r10 = r0.b
            r0 = r20
            double r12 = r0.c
            r0 = r46
            double r10 = r0.d(r10, r12)
            double r10 = r10 * r4
            r0 = r20
            double r12 = r0.b
            r0 = r20
            double r14 = r0.c
            r0 = r46
            double r12 = r0.e(r12, r14)
            double r12 = r12 * r6
            double r10 = r10 - r12
            double r10 = -r10
            r12 = 4596373779694328218(0x3fc999999999999a, double:0.2)
            double r10 = r10 * r12
            double r8 = r8 + r10
            float r8 = (float) r8
            goto L_0x00ad
        L_0x02d2:
            double r8 = (double) r8
            r0 = r20
            double r10 = r0.e
            double r10 = r10 * r4
            r0 = r20
            double r12 = r0.f
            double r12 = r12 * r6
            double r10 = r10 - r12
            r12 = 4613937818241073152(0x4008000000000000, double:3.0)
            double r10 = r10 * r12
            double r8 = r8 + r10
            float r8 = (float) r8
            goto L_0x00e2
        L_0x02e5:
            r14 = 0
            int r9 = (r10 > r14 ? 1 : (r10 == r14 ? 0 : -1))
            if (r9 == 0) goto L_0x0135
            double r8 = (double) r8
            double r12 = -r12
            r0 = r20
            double r14 = r0.b
            double r14 = r14 * r4
            r0 = r20
            double r0 = r0.c
            r16 = r0
            double r16 = r16 * r6
            double r14 = r14 - r16
            double r12 = r12 * r14
            double r10 = r12 / r10
            double r8 = r8 + r10
            float r8 = (float) r8
            goto L_0x0135
        L_0x0303:
            double r0 = (double) r9
            r26 = r0
            double r10 = r10.w
            r28 = 4591149604126578442(0x3fb70a3d70a3d70a, double:0.09)
            double r28 = r16 / r28
            double r28 = com.saterskog.b.b.b(r28)
            double r10 = r10 * r28
            double r12 = r12 * r4
            double r14 = r14 * r6
            double r12 = r12 - r14
            double r10 = r10 * r12
            double r10 = r10 / r16
            r12 = 4621819117588971520(0x4024000000000000, double:10.0)
            double r10 = r10 * r12
            double r10 = r10 + r26
            float r9 = (float) r10
            goto L_0x02a2
        L_0x0322:
            r0 = r46
            int[][] r10 = r0.ba
            r10 = r10[r24]
            r10 = r10[r8]
            if (r10 >= 0) goto L_0x0384
            r0 = r46
            com.saterskog.cell_lab.Cell[] r10 = r0.x
            r0 = r46
            int[][] r11 = r0.ba
            r11 = r11[r24]
            r11 = r11[r8]
            int r11 = r11 + 1
            int r11 = -r11
            r10 = r10[r11]
            r0 = r20
            double r12 = r0.b
            double r14 = r10.b
            double r12 = r12 - r14
            r14 = 4598175219545276416(0x3fd0000000000000, double:0.25)
            double r14 = r14 * r12
            r0 = r20
            double r12 = r0.c
            double r0 = r10.c
            r16 = r0
            double r12 = r12 - r16
            r16 = 4598175219545276416(0x3fd0000000000000, double:0.25)
            double r12 = r12 * r16
            double r16 = r14 * r14
            double r26 = r12 * r12
            double r16 = r16 + r26
            double r16 = java.lang.Math.sqrt(r16)
            double r10 = r10.w
            r26 = 4621819117588971520(0x4024000000000000, double:10.0)
            double r10 = r10 * r26
        L_0x0365:
            r26 = 0
            int r25 = (r16 > r26 ? 1 : (r16 == r26 ? 0 : -1))
            if (r25 <= 0) goto L_0x02a2
            com.saterskog.cell_lab.h r25 = com.saterskog.cell_lab.h.SENSEOCYTE
            r0 = r21
            r1 = r25
            if (r0 != r1) goto L_0x041c
            double r12 = (double) r9
            r14 = 4591149604126578442(0x3fb70a3d70a3d70a, double:0.09)
            double r14 = r16 / r14
            double r14 = com.saterskog.b.b.a(r14)
            double r10 = r10 * r14
            double r10 = r10 + r12
            float r9 = (float) r10
            goto L_0x02a2
        L_0x0384:
            r0 = r46
            com.saterskog.cell_lab.Food[] r10 = r0.A
            r0 = r46
            int[][] r11 = r0.ba
            r11 = r11[r24]
            r11 = r11[r8]
            r25 = r10[r11]
            r10 = 0
            r16 = 0
            r14 = 0
            r12 = 0
            r0 = r25
            float r0 = r0.f
            r26 = r0
            r27 = 0
            int r26 = (r26 > r27 ? 1 : (r26 == r27 ? 0 : -1))
            if (r26 > 0) goto L_0x03c6
            r0 = r20
            com.saterskog.cell_lab.Gene[] r0 = r0.I
            r26 = r0
            r0 = r20
            int r0 = r0.D
            r27 = r0
            r26 = r26[r27]
            r0 = r26
            int[] r0 = r0.u
            r26 = r0
            r27 = 3
            r26 = r26[r27]
            r27 = 1
            r0 = r26
            r1 = r27
            if (r0 == r1) goto L_0x03f2
        L_0x03c6:
            r0 = r25
            float r0 = r0.f
            r26 = r0
            r27 = 0
            int r26 = (r26 > r27 ? 1 : (r26 == r27 ? 0 : -1))
            if (r26 <= 0) goto L_0x0365
            r0 = r20
            com.saterskog.cell_lab.Gene[] r0 = r0.I
            r26 = r0
            r0 = r20
            int r0 = r0.D
            r27 = r0
            r26 = r26[r27]
            r0 = r26
            int[] r0 = r0.u
            r26 = r0
            r27 = 3
            r26 = r26[r27]
            r27 = 2
            r0 = r26
            r1 = r27
            if (r0 != r1) goto L_0x0365
        L_0x03f2:
            r0 = r20
            double r10 = r0.b
            r0 = r25
            float r12 = r0.a
            double r12 = (double) r12
            double r14 = r10 - r12
            r0 = r20
            double r10 = r0.c
            r0 = r25
            float r12 = r0.b
            double r12 = (double) r12
            double r12 = r10 - r12
            double r10 = r14 * r14
            double r16 = r12 * r12
            double r10 = r10 + r16
            double r16 = java.lang.Math.sqrt(r10)
            r0 = r25
            float r10 = r0.c
            r11 = 1092616192(0x41200000, float:10.0)
            float r10 = r10 * r11
            double r10 = (double) r10
            goto L_0x0365
        L_0x041c:
            double r0 = (double) r9
            r26 = r0
            r28 = 4591149604126578442(0x3fb70a3d70a3d70a, double:0.09)
            double r28 = r16 / r28
            double r28 = com.saterskog.b.b.b(r28)
            double r10 = r10 * r28
            double r14 = r14 * r4
            double r12 = r12 * r6
            double r12 = r14 - r12
            double r10 = r10 * r12
            double r10 = r10 / r16
            double r10 = r10 + r26
            float r9 = (float) r10
            goto L_0x02a2
        L_0x0438:
            int r8 = r18 + 1
            r18 = r8
            goto L_0x019a
        L_0x043e:
            int r8 = r19 + 1
            r19 = r8
            r8 = r9
            goto L_0x0191
        L_0x0445:
            com.saterskog.cell_lab.h r4 = com.saterskog.cell_lab.h.STEREOCYTE
            r0 = r21
            if (r0 != r4) goto L_0x0454
            r0 = r20
            boolean r4 = r0.y
            if (r4 == 0) goto L_0x0550
            r4 = -1
        L_0x0452:
            float r4 = (float) r4
            float r8 = r8 * r4
        L_0x0454:
            r0 = r20
            float[] r4 = r0.W
            r5 = 2
            r0 = r20
            int r5 = r0.b(r5)
            r6 = r4[r5]
            r0 = r20
            com.saterskog.cell_lab.Gene[] r7 = r0.I
            r0 = r20
            int r9 = r0.D
            r7 = r7[r9]
            float[] r7 = r7.v
            r9 = 0
            r7 = r7[r9]
            float r7 = r7 * r8
            r8 = 1101004800(0x41a00000, float:20.0)
            float r7 = java.lang.Math.min(r7, r8)
            r8 = -1046478848(0xffffffffc1a00000, float:-20.0)
            float r7 = java.lang.Math.max(r7, r8)
            float r6 = r6 + r7
            r4[r5] = r6
        L_0x0480:
            r4 = 0
        L_0x0481:
            r0 = r20
            int r5 = r0.C
            if (r4 >= r5) goto L_0x0ab4
            r0 = r20
            com.saterskog.cell_lab.Link[] r5 = r0.H
            r5 = r5[r4]
            int r6 = r5.a
            r0 = r47
            if (r6 > r0) goto L_0x054c
            int r6 = r5.a
            r7 = -1
            if (r6 != r7) goto L_0x05eb
            r0 = r20
            double r6 = r0.k
            r0 = r20
            com.saterskog.cell_lab.Link[] r8 = r0.H
            r8 = r8[r4]
            double r8 = r8.c
            double r6 = r6 + r8
            double r6 = java.lang.Math.cos(r6)
            r0 = r20
            double r8 = r0.k
            r0 = r20
            com.saterskog.cell_lab.Link[] r10 = r0.H
            r10 = r10[r4]
            double r10 = r10.c
            double r8 = r8 + r10
            double r8 = java.lang.Math.sin(r8)
            r0 = r20
            double r10 = r0.d
            double r12 = com.saterskog.cell_lab.Cell.a
            double r10 = r10 - r12
            double r10 = r10 * r6
            r12 = 4605380978949069210(0x3fe999999999999a, double:0.8)
            double r10 = r10 * r12
            float r10 = (float) r10
            r5.g = r10
            r0 = r20
            double r10 = r0.d
            double r12 = com.saterskog.cell_lab.Cell.a
            double r10 = r10 - r12
            double r10 = r10 * r8
            r12 = 4605380978949069210(0x3fe999999999999a, double:0.8)
            double r10 = r10 * r12
            float r10 = (float) r10
            r5.h = r10
            r0 = r20
            double r10 = r0.d
            r12 = 4603579539098121011(0x3fe3333333333333, double:0.6)
            double r10 = r10 * r12
            double r6 = r6 * r10
            r0 = r20
            double r10 = r0.d
            r12 = 4603579539098121011(0x3fe3333333333333, double:0.6)
            double r10 = r10 * r12
            double r8 = r8 * r10
            double r10 = r5.e
            double r10 = r10 - r6
            r0 = r20
            double r12 = r0.b
            double r10 = r10 - r12
            double r12 = r5.e
            double r12 = r12 - r6
            r0 = r20
            double r14 = r0.b
            double r12 = r12 - r14
            double r10 = r10 * r12
            double r12 = r5.f
            double r12 = r12 - r8
            r0 = r20
            double r14 = r0.c
            double r12 = r12 - r14
            double r14 = r5.f
            double r14 = r14 - r8
            r0 = r20
            double r0 = r0.c
            r16 = r0
            double r14 = r14 - r16
            double r12 = r12 * r14
            double r10 = r10 + r12
            r0 = r20
            double r12 = r0.d
            r0 = r20
            double r14 = r0.d
            double r12 = r12 * r14
            r14 = 4611686018427387904(0x4000000000000000, double:2.0)
            double r12 = r12 * r14
            r14 = 4611686018427387904(0x4000000000000000, double:2.0)
            double r12 = r12 * r14
            int r10 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r10 <= 0) goto L_0x0553
            r0 = r20
            com.saterskog.cell_lab.Link[] r5 = r0.H
            r5 = r5[r4]
            r0 = r20
            com.saterskog.cell_lab.Link[] r6 = r0.H
            r0 = r20
            int r7 = r0.C
            int r7 = r7 + -1
            r6 = r6[r7]
            r5.a(r6)
            r0 = r20
            int r5 = r0.C
            int r5 = r5 + -1
            r0 = r20
            r0.C = r5
            int r4 = r4 + -1
        L_0x054c:
            int r4 = r4 + 1
            goto L_0x0481
        L_0x0550:
            r4 = 1
            goto L_0x0452
        L_0x0553:
            r0 = r20
            double r10 = r0.e
            r0 = r20
            double r12 = r0.l
            double r14 = -r8
            double r12 = r12 * r14
            double r10 = r10 + r12
            r0 = r20
            double r12 = r0.f
            r0 = r20
            double r14 = r0.l
            double r14 = r14 * r6
            double r12 = r12 + r14
            r14 = 4632233691727265792(0x4049000000000000, double:50.0)
            r0 = r20
            double r0 = r0.d
            r16 = r0
            double r14 = r14 * r16
            r16 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            r18 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            r0 = r46
            double r0 = r0.T
            r22 = r0
            double r18 = r18 * r22
            double r18 = r18 * r14
            r22 = 4602678819172646912(0x3fe0000000000000, double:0.5)
            double r18 = r18 * r22
            r0 = r20
            double r0 = r0.w
            r22 = r0
            double r18 = r18 / r22
            double r16 = r16 - r18
            double r14 = r14 * r16
            double r0 = r5.e
            r16 = r0
            double r16 = r16 - r6
            r0 = r20
            double r0 = r0.b
            r18 = r0
            double r16 = r16 - r18
            r18 = 4629137466983448576(0x403e000000000000, double:30.0)
            double r16 = r16 * r18
            r18 = 4613937818241073152(0x4008000000000000, double:3.0)
            double r16 = r16 * r18
            r18 = 0
            double r10 = r18 - r10
            double r10 = r10 * r14
            double r10 = r10 + r16
            double r0 = r5.f
            r16 = r0
            double r16 = r16 - r8
            r0 = r20
            double r0 = r0.c
            r18 = r0
            double r16 = r16 - r18
            r18 = 4629137466983448576(0x403e000000000000, double:30.0)
            double r16 = r16 * r18
            r18 = 4613937818241073152(0x4008000000000000, double:3.0)
            double r16 = r16 * r18
            r18 = 0
            double r12 = r18 - r12
            double r12 = r12 * r14
            double r12 = r12 + r16
            r0 = r20
            double r14 = r0.g
            double r14 = r14 + r10
            r0 = r20
            r0.g = r14
            r0 = r20
            double r14 = r0.h
            double r14 = r14 + r12
            r0 = r20
            r0.h = r14
            r0 = r20
            double r14 = r0.j
            double r10 = -r10
            double r8 = r8 * r10
            double r6 = r6 * r12
            double r6 = r6 + r8
            double r6 = r6 + r14
            r0 = r20
            r0.j = r6
            goto L_0x054c
        L_0x05eb:
            r0 = r46
            com.saterskog.cell_lab.Cell[] r6 = r0.x
            int r7 = r5.a
            r18 = r6[r7]
            r0 = r20
            double r6 = r0.d
            r0 = r18
            double r8 = r0.d
            double r12 = java.lang.Math.min(r6, r8)
            r0 = r20
            double r6 = r0.d
            r0 = r18
            double r8 = r0.d
            double r22 = java.lang.Math.max(r6, r8)
            r6 = 4600877379321698714(0x3fd999999999999a, double:0.4)
            double r10 = r12 * r6
            r0 = r20
            com.saterskog.cell_lab.Link[] r6 = r0.H
            r6 = r6[r4]
            double r8 = r6.c
            r0 = r20
            com.saterskog.cell_lab.Link[] r6 = r0.H
            r6 = r6[r4]
            double r14 = r6.d
            r0 = r20
            double r6 = r0.q
            double r6 = -r6
            r0 = r18
            double r0 = r0.q
            r16 = r0
            double r6 = r6 + r16
            r0 = r20
            com.saterskog.cell_lab.Gene[] r0 = r0.I
            r16 = r0
            r0 = r20
            int r0 = r0.D
            r17 = r0
            r16 = r16[r17]
            r0 = r16
            com.saterskog.cell_lab.h r0 = r0.s
            r16 = r0
            com.saterskog.cell_lab.h r17 = com.saterskog.cell_lab.h.MYOCYTE
            r0 = r16
            r1 = r17
            if (r0 != r1) goto L_0x0686
            double r16 = java.lang.Math.cos(r8)
            r0 = r20
            float r0 = r0.ac
            r19 = r0
            r0 = r19
            double r0 = (double) r0
            r24 = r0
            double r24 = r24 * r16
            double r6 = r6 - r24
            double r24 = r16 * r16
            r0 = r20
            double r0 = r0.d
            r26 = r0
            double r24 = r24 * r26
            r0 = r20
            float r0 = r0.aa
            r19 = r0
            r0 = r19
            double r0 = (double) r0
            r26 = r0
            double r24 = r24 * r26
            double r10 = r10 + r24
            r0 = r20
            float r0 = r0.ab
            r19 = r0
            r0 = r19
            double r0 = (double) r0
            r24 = r0
            double r16 = r16 * r24
            double r8 = r8 + r16
        L_0x0686:
            r0 = r18
            com.saterskog.cell_lab.Gene[] r0 = r0.I
            r16 = r0
            r0 = r18
            int r0 = r0.D
            r17 = r0
            r16 = r16[r17]
            r0 = r16
            com.saterskog.cell_lab.h r0 = r0.s
            r16 = r0
            com.saterskog.cell_lab.h r17 = com.saterskog.cell_lab.h.MYOCYTE
            r0 = r16
            r1 = r17
            if (r0 != r1) goto L_0x1b61
            double r24 = java.lang.Math.cos(r14)
            r0 = r18
            float r0 = r0.ac
            r16 = r0
            r0 = r16
            double r0 = (double) r0
            r16 = r0
            double r16 = r16 * r24
            double r6 = r6 + r16
            double r16 = r24 * r24
            r0 = r18
            double r0 = r0.d
            r26 = r0
            double r16 = r16 * r26
            r0 = r18
            float r0 = r0.aa
            r19 = r0
            r0 = r19
            double r0 = (double) r0
            r26 = r0
            double r16 = r16 * r26
            double r16 = r16 + r10
            r0 = r18
            float r10 = r0.ab
            double r10 = (double) r10
            double r10 = r10 * r24
            double r10 = r10 + r14
            r14 = r10
            r10 = r6
            r6 = r16
        L_0x06da:
            r16 = 0
            double r16 = r16 * r12
            r24 = 4600877379321698714(0x3fd999999999999a, double:0.4)
            double r16 = r16 * r24
            int r16 = (r6 > r16 ? 1 : (r6 == r16 ? 0 : -1))
            if (r16 >= 0) goto L_0x06f3
            r6 = 0
            double r6 = r6 * r12
            r16 = 4600877379321698714(0x3fd999999999999a, double:0.4)
            double r6 = r6 * r16
        L_0x06f3:
            int r16 = (r6 > r12 ? 1 : (r6 == r12 ? 0 : -1))
            if (r16 <= 0) goto L_0x06f8
            r6 = r12
        L_0x06f8:
            r0 = r20
            double r0 = r0.k
            r16 = r0
            double r16 = r16 + r8
            double r16 = java.lang.Math.cos(r16)
            r0 = r20
            double r0 = r0.k
            r24 = r0
            double r8 = r8 + r24
            double r8 = java.lang.Math.sin(r8)
            r0 = r18
            double r0 = r0.k
            r24 = r0
            double r24 = r24 + r14
            double r24 = java.lang.Math.cos(r24)
            r0 = r18
            double r0 = r0.k
            r26 = r0
            double r14 = r14 + r26
            double r14 = java.lang.Math.sin(r14)
            r0 = r20
            com.saterskog.cell_lab.Link[] r0 = r0.H
            r19 = r0
            r19 = r19[r4]
            r0 = r20
            double r0 = r0.d
            r26 = r0
            double r28 = com.saterskog.cell_lab.Cell.a
            double r26 = r26 - r28
            double r26 = r26 * r16
            r28 = 4605380978949069210(0x3fe999999999999a, double:0.8)
            double r26 = r26 * r28
            r0 = r26
            float r0 = (float) r0
            r26 = r0
            r0 = r26
            r1 = r19
            r1.g = r0
            r0 = r20
            com.saterskog.cell_lab.Link[] r0 = r0.H
            r19 = r0
            r19 = r19[r4]
            r0 = r20
            double r0 = r0.d
            r26 = r0
            double r28 = com.saterskog.cell_lab.Cell.a
            double r26 = r26 - r28
            double r26 = r26 * r8
            r28 = 4605380978949069210(0x3fe999999999999a, double:0.8)
            double r26 = r26 * r28
            r0 = r26
            float r0 = (float) r0
            r26 = r0
            r0 = r26
            r1 = r19
            r1.h = r0
            r0 = r20
            com.saterskog.cell_lab.Link[] r0 = r0.H
            r19 = r0
            r19 = r19[r4]
            r0 = r18
            double r0 = r0.d
            r26 = r0
            double r28 = com.saterskog.cell_lab.Cell.a
            double r26 = r26 - r28
            double r26 = r26 * r24
            r28 = 4605380978949069210(0x3fe999999999999a, double:0.8)
            double r26 = r26 * r28
            r0 = r26
            float r0 = (float) r0
            r26 = r0
            r0 = r26
            r1 = r19
            r1.i = r0
            r0 = r20
            com.saterskog.cell_lab.Link[] r0 = r0.H
            r19 = r0
            r19 = r19[r4]
            r0 = r18
            double r0 = r0.d
            r26 = r0
            double r28 = com.saterskog.cell_lab.Cell.a
            double r26 = r26 - r28
            double r26 = r26 * r14
            r28 = 4605380978949069210(0x3fe999999999999a, double:0.8)
            double r26 = r26 * r28
            r0 = r26
            float r0 = (float) r0
            r26 = r0
            r0 = r26
            r1 = r19
            r1.j = r0
            r0 = r20
            double r0 = r0.d
            r26 = r0
            double r26 = r26 - r6
            float r0 = r5.l
            r19 = r0
            r0 = r19
            double r0 = (double) r0
            r28 = r0
            double r26 = r26 + r28
            double r16 = r16 * r26
            r0 = r20
            double r0 = r0.d
            r26 = r0
            double r26 = r26 - r6
            float r0 = r5.l
            r19 = r0
            r0 = r19
            double r0 = (double) r0
            r28 = r0
            double r26 = r26 + r28
            double r8 = r8 * r26
            r0 = r18
            double r0 = r0.d
            r26 = r0
            double r26 = r26 - r6
            float r0 = r5.l
            r19 = r0
            r0 = r19
            double r0 = (double) r0
            r28 = r0
            double r26 = r26 + r28
            double r24 = r24 * r26
            r0 = r18
            double r0 = r0.d
            r26 = r0
            double r6 = r26 - r6
            float r0 = r5.l
            r19 = r0
            r0 = r19
            double r0 = (double) r0
            r26 = r0
            double r6 = r6 + r26
            double r14 = r14 * r6
            r0 = r18
            double r6 = r0.b
            double r6 = r6 + r24
            r0 = r20
            double r0 = r0.b
            r26 = r0
            double r6 = r6 - r26
            double r6 = r6 - r16
            r0 = r18
            double r0 = r0.b
            r26 = r0
            double r26 = r26 + r24
            r0 = r20
            double r0 = r0.b
            r28 = r0
            double r26 = r26 - r28
            double r26 = r26 - r16
            double r6 = r6 * r26
            r0 = r18
            double r0 = r0.c
            r26 = r0
            double r26 = r26 + r14
            r0 = r20
            double r0 = r0.c
            r28 = r0
            double r26 = r26 - r28
            double r26 = r26 - r8
            r0 = r18
            double r0 = r0.c
            r28 = r0
            double r28 = r28 + r14
            r0 = r20
            double r0 = r0.c
            r30 = r0
            double r28 = r28 - r30
            double r28 = r28 - r8
            double r26 = r26 * r28
            double r6 = r6 + r26
            double r22 = r22 * r22
            r26 = 4611686018427387904(0x4000000000000000, double:2.0)
            double r22 = r22 * r26
            r26 = 4611686018427387904(0x4000000000000000, double:2.0)
            double r22 = r22 * r26
            int r6 = (r6 > r22 ? 1 : (r6 == r22 ? 0 : -1))
            if (r6 <= 0) goto L_0x08c5
            r5 = 0
        L_0x086e:
            r0 = r18
            int r6 = r0.C
            if (r5 >= r6) goto L_0x089f
            r0 = r18
            com.saterskog.cell_lab.Link[] r6 = r0.H
            r6 = r6[r5]
            int r6 = r6.a
            r0 = r47
            if (r6 != r0) goto L_0x08c2
            r0 = r18
            com.saterskog.cell_lab.Link[] r6 = r0.H
            r5 = r6[r5]
            r0 = r18
            com.saterskog.cell_lab.Link[] r6 = r0.H
            r0 = r18
            int r7 = r0.C
            int r7 = r7 + -1
            r6 = r6[r7]
            r5.a(r6)
            r0 = r18
            int r5 = r0.C
            int r5 = r5 + -1
            r0 = r18
            r0.C = r5
        L_0x089f:
            r0 = r20
            com.saterskog.cell_lab.Link[] r5 = r0.H
            r5 = r5[r4]
            r0 = r20
            com.saterskog.cell_lab.Link[] r6 = r0.H
            r0 = r20
            int r7 = r0.C
            int r7 = r7 + -1
            r6 = r6[r7]
            r5.a(r6)
            r0 = r20
            int r5 = r0.C
            int r5 = r5 + -1
            r0 = r20
            r0.C = r5
            int r4 = r4 + -1
            goto L_0x054c
        L_0x08c2:
            int r5 = r5 + 1
            goto L_0x086e
        L_0x08c5:
            r0 = r20
            double r6 = r0.e
            r0 = r20
            double r0 = r0.l
            r22 = r0
            double r0 = -r8
            r26 = r0
            double r22 = r22 * r26
            double r22 = r22 + r6
            r0 = r20
            double r6 = r0.f
            r0 = r20
            double r0 = r0.l
            r26 = r0
            double r26 = r26 * r16
            double r26 = r26 + r6
            r0 = r18
            double r6 = r0.e
            r0 = r18
            double r0 = r0.l
            r28 = r0
            double r0 = -r14
            r30 = r0
            double r28 = r28 * r30
            double r28 = r28 + r6
            r0 = r18
            double r6 = r0.f
            r0 = r18
            double r0 = r0.l
            r30 = r0
            double r30 = r30 * r24
            double r30 = r30 + r6
            r6 = 4627730092099895296(0x4039000000000000, double:25.0)
            r0 = r20
            double r0 = r0.w
            r32 = r0
            double r6 = r6 * r32
            r0 = r18
            double r0 = r0.w
            r32 = r0
            double r6 = r6 * r32
            r0 = r20
            double r0 = r0.w
            r32 = r0
            r0 = r18
            double r0 = r0.w
            r34 = r0
            double r32 = r32 + r34
            double r6 = r6 / r32
            r0 = r20
            int r0 = r0.C
            r19 = r0
            r0 = r18
            int r0 = r0.C
            r32 = r0
            r0 = r19
            r1 = r32
            if (r0 <= r1) goto L_0x0aa5
            r0 = r20
            int r0 = r0.C
            r19 = r0
            r0 = r19
            double r0 = (double) r0
            r32 = r0
            double r6 = r6 / r32
        L_0x0944:
            r0 = r18
            double r0 = r0.b
            r32 = r0
            double r32 = r32 + r24
            double r32 = r32 - r16
            r0 = r20
            double r0 = r0.b
            r34 = r0
            double r32 = r32 - r34
            r0 = r18
            double r0 = r0.c
            r34 = r0
            double r34 = r34 + r14
            double r34 = r34 - r8
            r0 = r20
            double r0 = r0.c
            r36 = r0
            double r34 = r34 - r36
            r36 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            r38 = 4611686018427387904(0x4000000000000000, double:2.0)
            double r40 = r32 * r32
            double r42 = r34 * r34
            double r40 = r40 + r42
            double r38 = r38 * r40
            r40 = 4570447457359481746(0x3f6d7dbf487fcb92, double:0.0036)
            double r38 = r38 / r40
            double r36 = r36 + r38
            r38 = 4629137466983448576(0x403e000000000000, double:30.0)
            double r40 = com.saterskog.cell_lab.Cell.a
            double r38 = r38 * r40
            double r40 = com.saterskog.cell_lab.Cell.a
            r19 = 1073741824(0x40000000, float:2.0)
            float r5 = r5.l
            float r5 = r5 * r19
            double r0 = (double) r5
            r42 = r0
            double r40 = r40 + r42
            double r38 = r38 / r40
            double r32 = r32 * r36
            double r32 = r32 * r38
            double r22 = r28 - r22
            double r22 = r22 * r6
            double r22 = r22 + r32
            double r28 = r34 * r36
            double r28 = r28 * r38
            double r26 = r30 - r26
            double r6 = r6 * r26
            double r6 = r6 + r28
            r0 = r20
            double r0 = r0.g
            r26 = r0
            double r26 = r26 + r22
            r0 = r26
            r2 = r20
            r2.g = r0
            r0 = r20
            double r0 = r0.h
            r26 = r0
            double r26 = r26 + r6
            r0 = r26
            r2 = r20
            r2.h = r0
            r0 = r20
            double r0 = r0.i
            r26 = r0
            double r26 = r26 + r10
            r0 = r26
            r2 = r20
            r2.i = r0
            r0 = r18
            double r0 = r0.g
            r26 = r0
            double r26 = r26 - r22
            r0 = r26
            r2 = r18
            r2.g = r0
            r0 = r18
            double r0 = r0.h
            r26 = r0
            double r26 = r26 - r6
            r0 = r26
            r2 = r18
            r2.h = r0
            r0 = r18
            double r0 = r0.i
            r26 = r0
            double r10 = r26 - r10
            r0 = r18
            r0.i = r10
            r10 = 4602678819172646912(0x3fe0000000000000, double:0.5)
            r0 = r20
            double r0 = r0.b
            r26 = r0
            double r26 = r26 + r16
            r0 = r18
            double r0 = r0.b
            r28 = r0
            double r26 = r26 + r28
            double r26 = r26 + r24
            double r10 = r10 * r26
            r26 = 4602678819172646912(0x3fe0000000000000, double:0.5)
            r0 = r20
            double r0 = r0.c
            r28 = r0
            double r28 = r28 + r8
            r0 = r18
            double r0 = r0.c
            r30 = r0
            double r28 = r28 + r30
            double r28 = r28 + r14
            double r26 = r26 * r28
            r0 = r20
            double r0 = r0.j
            r28 = r0
            r0 = r22
            double r0 = -r0
            r30 = r0
            r0 = r20
            double r0 = r0.c
            r32 = r0
            double r32 = r26 - r32
            double r30 = r30 * r32
            r0 = r20
            double r0 = r0.b
            r32 = r0
            double r32 = r10 - r32
            double r32 = r32 * r6
            double r30 = r30 + r32
            double r28 = r28 + r30
            r0 = r28
            r2 = r20
            r2.j = r0
            r0 = r18
            double r0 = r0.j
            r28 = r0
            r0 = r22
            double r0 = -r0
            r22 = r0
            r0 = r18
            double r0 = r0.c
            r30 = r0
            double r26 = r26 - r30
            double r22 = r22 * r26
            r0 = r18
            double r0 = r0.b
            r26 = r0
            double r10 = r10 - r26
            double r6 = r6 * r10
            double r6 = r6 + r22
            double r6 = r28 - r6
            r0 = r18
            r0.j = r6
            double r6 = r8 * r24
            double r8 = r16 * r14
            double r6 = r6 - r8
            double r8 = java.lang.Math.signum(r6)
            double r6 = java.lang.Math.abs(r6)
            double r6 = java.lang.Math.sqrt(r6)
            double r6 = r6 * r8
            double r6 = r6 * r12
            r0 = r20
            com.saterskog.cell_lab.Link[] r5 = r0.H
            r5 = r5[r4]
            float r5 = r5.k
            double r8 = (double) r5
            double r6 = r6 * r8
            r0 = r20
            double r8 = r0.j
            double r8 = r8 + r6
            r0 = r20
            r0.j = r8
            r0 = r18
            double r8 = r0.j
            double r6 = r8 - r6
            r0 = r18
            r0.j = r6
            goto L_0x054c
        L_0x0aa5:
            r0 = r18
            int r0 = r0.C
            r19 = r0
            r0 = r19
            double r0 = (double) r0
            r32 = r0
            double r6 = r6 / r32
            goto L_0x0944
        L_0x0ab4:
            r5 = 0
            r4 = 0
            r9 = r4
        L_0x0ab7:
            r4 = 4
            if (r9 >= r4) goto L_0x0b10
            r4 = -1
            if (r9 != 0) goto L_0x0ac1
            r0 = r20
            int r4 = r0.K
        L_0x0ac1:
            r6 = 1
            if (r9 != r6) goto L_0x0ac8
            r0 = r20
            int r4 = r0.L
        L_0x0ac8:
            r6 = 2
            if (r9 != r6) goto L_0x0acf
            r0 = r20
            int r4 = r0.M
        L_0x0acf:
            r6 = 3
            if (r9 != r6) goto L_0x1b5e
            r0 = r20
            int r4 = r0.N
            r8 = r4
        L_0x0ad7:
            r4 = -1
            if (r8 == r4) goto L_0x0b0c
            r0 = r46
            int[][] r4 = r0.aV
            r10 = r4[r8]
            r4 = 0
        L_0x0ae1:
            r0 = r46
            int[] r6 = r0.aW
            r6 = r6[r8]
            if (r4 >= r6) goto L_0x0b0c
            r11 = r10[r4]
            r0 = r47
            if (r11 <= r0) goto L_0x0b06
            r6 = 1
            r7 = 0
        L_0x0af1:
            if (r7 >= r5) goto L_0x0afc
            r0 = r46
            int[] r12 = r0.K
            r12 = r12[r7]
            if (r12 != r11) goto L_0x0b09
            r6 = 0
        L_0x0afc:
            if (r6 == 0) goto L_0x0b06
            r0 = r46
            int[] r6 = r0.K
            r6[r5] = r11
            int r5 = r5 + 1
        L_0x0b06:
            int r4 = r4 + 1
            goto L_0x0ae1
        L_0x0b09:
            int r7 = r7 + 1
            goto L_0x0af1
        L_0x0b0c:
            int r4 = r9 + 1
            r9 = r4
            goto L_0x0ab7
        L_0x0b10:
            r0 = r20
            double r12 = r0.b
            r0 = r20
            double r14 = r0.c
            com.saterskog.cell_lab.h r4 = com.saterskog.cell_lab.h.KERATINOCYTE
            r0 = r21
            if (r0 != r4) goto L_0x1403
            r6 = 1
        L_0x0b1f:
            if (r6 != 0) goto L_0x1b5b
            r4 = 0
        L_0x0b22:
            r0 = r20
            int r7 = r0.C
            if (r4 >= r7) goto L_0x1b5b
            r0 = r20
            com.saterskog.cell_lab.Link[] r7 = r0.H
            r7 = r7[r4]
            int r7 = r7.a
            if (r7 < 0) goto L_0x1406
            r0 = r46
            com.saterskog.cell_lab.Cell[] r7 = r0.x
            r0 = r20
            com.saterskog.cell_lab.Link[] r8 = r0.H
            r8 = r8[r4]
            int r8 = r8.a
            r7 = r7[r8]
            com.saterskog.cell_lab.Gene[] r8 = r7.I
            int r7 = r7.D
            r7 = r8[r7]
            com.saterskog.cell_lab.h r7 = r7.s
            com.saterskog.cell_lab.h r8 = com.saterskog.cell_lab.h.KERATINOCYTE
            if (r7 != r8) goto L_0x1406
            r4 = 1
        L_0x0b4d:
            r6 = 0
            r10 = r6
        L_0x0b4f:
            if (r10 >= r5) goto L_0x1848
            r0 = r46
            int[] r6 = r0.K
            r11 = r6[r10]
            r0 = r46
            com.saterskog.cell_lab.Cell[] r6 = r0.x
            r16 = r6[r11]
            r0 = r16
            com.saterskog.cell_lab.Gene[] r6 = r0.I
            r0 = r16
            int r7 = r0.D
            r6 = r6[r7]
            com.saterskog.cell_lab.h r0 = r6.s
            r17 = r0
            r0 = r16
            double r0 = r0.b
            r18 = r0
            r0 = r16
            double r0 = r0.c
            r22 = r0
            double r6 = r12 - r18
            double r8 = r12 - r18
            double r6 = r6 * r8
            double r8 = r14 - r22
            double r24 = r14 - r22
            double r8 = r8 * r24
            double r8 = r8 + r6
            r0 = r20
            double r0 = r0.d
            r24 = r0
            r0 = r16
            double r0 = r0.d
            r26 = r0
            double r6 = r24 + r26
            double r6 = r6 * r6
            int r6 = (r8 > r6 ? 1 : (r8 == r6 ? 0 : -1))
            if (r6 >= 0) goto L_0x1843
            r6 = 0
            int r6 = (r8 > r6 ? 1 : (r8 == r6 ? 0 : -1))
            if (r6 == 0) goto L_0x1843
            r0 = r20
            boolean r6 = r0.x
            if (r6 != 0) goto L_0x1843
            r0 = r16
            boolean r6 = r0.x
            if (r6 != 0) goto L_0x1843
            double r28 = java.lang.Math.sqrt(r8)
            r0 = r28
            double r6 = -r0
            double r6 = r6 + r24
            double r6 = r6 - r26
            r0 = r28
            double r0 = -r0
            r30 = r0
            double r30 = r30 - r24
            double r30 = r30 + r26
            double r6 = r6 * r30
            r0 = r28
            double r0 = -r0
            r30 = r0
            double r30 = r30 + r24
            double r30 = r30 + r26
            double r6 = r6 * r30
            double r30 = r28 + r24
            double r30 = r30 + r26
            double r6 = r6 * r30
            double r6 = r6 / r8
            double r30 = r28 * r28
            double r32 = r26 * r26
            double r30 = r30 - r32
            double r32 = r24 * r24
            double r30 = r30 + r32
            r32 = 4611686018427387904(0x4000000000000000, double:2.0)
            double r32 = r32 * r28
            double r30 = r30 / r32
            double r32 = r18 - r12
            double r32 = r32 / r28
            double r34 = r22 - r14
            double r34 = r34 / r28
            double r36 = r30 * r32
            double r30 = r30 * r34
            r0 = r46
            boolean r0 = r0.U
            r38 = r0
            if (r38 == 0) goto L_0x0c2e
            r0 = r20
            int r0 = r0.B
            r38 = r0
            r39 = 20
            r0 = r38
            r1 = r39
            if (r0 >= r1) goto L_0x0c10
            r0 = r16
            int r0 = r0.B
            r38 = r0
            r39 = 20
            r0 = r38
            r1 = r39
            if (r0 < r1) goto L_0x140a
        L_0x0c10:
            java.lang.StringBuilder r30 = new java.lang.StringBuilder
            java.lang.String r31 = "skit: Cell touches too many neighbors (>"
            r30.<init>(r31)
            r31 = 20
            java.lang.String r31 = java.lang.Integer.toString(r31)
            java.lang.StringBuilder r30 = r30.append(r31)
            java.lang.String r31 = "), not supposed to normally happen and programmer was lazy enough to not gracefully handle this case."
            java.lang.StringBuilder r30 = r30.append(r31)
            java.lang.String r30 = r30.toString()
            com.saterskog.b.a.a((java.lang.String) r30)
        L_0x0c2e:
            com.saterskog.cell_lab.h r30 = com.saterskog.cell_lab.h.CILIOCYTE
            r0 = r21
            r1 = r30
            if (r0 == r1) goto L_0x0c3e
            com.saterskog.cell_lab.h r30 = com.saterskog.cell_lab.h.CILIOCYTE
            r0 = r17
            r1 = r30
            if (r0 != r1) goto L_0x0d3b
        L_0x0c3e:
            r0 = r28
            double r6 = -r0
            double r6 = r6 + r24
            double r6 = r6 - r26
            r0 = r28
            double r0 = -r0
            r30 = r0
            double r30 = r30 - r24
            double r30 = r30 + r26
            double r6 = r6 * r30
            r0 = r28
            double r0 = -r0
            r30 = r0
            double r30 = r30 + r24
            double r30 = r30 + r26
            double r6 = r6 * r30
            double r24 = r24 + r28
            double r24 = r24 + r26
            double r6 = r6 * r24
            double r8 = r6 / r8
            r0 = r20
            double r6 = r0.w
            r0 = r16
            double r0 = r0.w
            r24 = r0
            double r6 = r6 * r24
            r0 = r20
            double r0 = r0.w
            r24 = r0
            r0 = r16
            double r0 = r0.w
            r26 = r0
            double r24 = r24 + r26
            double r6 = r6 / r24
            r0 = r16
            double r0 = r0.e
            r24 = r0
            r0 = r20
            double r0 = r0.e
            r26 = r0
            double r24 = r24 - r26
            double r24 = r24 * r6
            r26 = 4581421828931458171(0x3f947ae147ae147b, double:0.02)
            double r24 = r24 / r26
            r26 = 4596373779694328218(0x3fc999999999999a, double:0.2)
            double r24 = r24 * r26
            r0 = r16
            double r0 = r0.f
            r26 = r0
            r0 = r20
            double r0 = r0.f
            r30 = r0
            double r26 = r26 - r30
            double r6 = r6 * r26
            r26 = 4581421828931458171(0x3f947ae147ae147b, double:0.02)
            double r6 = r6 / r26
            r26 = 4596373779694328218(0x3fc999999999999a, double:0.2)
            double r6 = r6 * r26
            double r24 = r24 * r32
            double r6 = r6 * r34
            double r6 = r6 + r24
            double r24 = r32 * r6
            double r6 = r6 * r34
            r0 = r20
            double r0 = r0.g
            r26 = r0
            double r26 = r26 + r24
            r0 = r26
            r2 = r20
            r2.g = r0
            r0 = r20
            double r0 = r0.h
            r26 = r0
            double r26 = r26 + r6
            r0 = r26
            r2 = r20
            r2.h = r0
            r0 = r16
            double r0 = r0.g
            r26 = r0
            double r24 = r26 - r24
            r0 = r24
            r2 = r16
            r2.g = r0
            r0 = r16
            double r0 = r0.h
            r24 = r0
            double r6 = r24 - r6
            r0 = r16
            r0.h = r6
            r7 = 1
            r6 = 0
        L_0x0cfd:
            r0 = r20
            int r0 = r0.C
            r24 = r0
            r0 = r24
            if (r6 >= r0) goto L_0x1b58
            r0 = r20
            com.saterskog.cell_lab.Link[] r0 = r0.H
            r24 = r0
            r24 = r24[r6]
            r0 = r24
            int r0 = r0.a
            r24 = r0
            r0 = r24
            if (r0 != r11) goto L_0x14e8
            r6 = 0
        L_0x0d1a:
            if (r6 == 0) goto L_0x0d3a
            r0 = r46
            int[] r6 = r0.aY
            r0 = r46
            int r7 = r0.aX
            r6[r7] = r47
            r0 = r46
            int[] r6 = r0.aZ
            r0 = r46
            int r7 = r0.aX
            r6[r7] = r11
            r0 = r46
            int r6 = r0.aX
            int r6 = r6 + 1
            r0 = r46
            r0.aX = r6
        L_0x0d3a:
            r6 = r8
        L_0x0d3b:
            r8 = 4647503709213818880(0x407f400000000000, double:500.0)
            double r6 = r6 * r8
            r8 = 4602678819172646912(0x3fe0000000000000, double:0.5)
            r24 = 6
            r0 = r20
            r1 = r24
            float r24 = r0.a((int) r1)
            r0 = r24
            double r0 = (double) r0
            r24 = r0
            double r8 = r8 / r24
            r24 = 4602678819172646912(0x3fe0000000000000, double:0.5)
            r26 = 6
            r0 = r16
            r1 = r26
            float r26 = r0.a((int) r1)
            r0 = r26
            double r0 = (double) r0
            r26 = r0
            double r24 = r24 / r26
            double r8 = r8 + r24
            double r6 = r6 / r8
            double r6 = r6 / r28
            com.saterskog.cell_lab.h r8 = com.saterskog.cell_lab.h.GAMETE
            r0 = r21
            if (r0 != r8) goto L_0x0dac
            com.saterskog.cell_lab.h r8 = com.saterskog.cell_lab.h.GAMETE
            r0 = r17
            if (r0 != r8) goto L_0x0dac
            r0 = r20
            double r8 = r0.o
            r24 = 4602678819172646912(0x3fe0000000000000, double:0.5)
            int r8 = (r8 > r24 ? 1 : (r8 == r24 ? 0 : -1))
            if (r8 <= 0) goto L_0x0dac
            r0 = r16
            double r8 = r0.o
            r24 = 4602678819172646912(0x3fe0000000000000, double:0.5)
            int r8 = (r8 > r24 ? 1 : (r8 == r24 ? 0 : -1))
            if (r8 <= 0) goto L_0x0dac
            r0 = r20
            int r8 = r0.D
            r9 = 1
            r0 = r16
            int r9 = r0.b(r9)
            if (r8 != r9) goto L_0x14ec
            r8 = 1
            r0 = r20
            int r8 = r0.b(r8)
            r0 = r16
            int r9 = r0.D
            if (r8 != r9) goto L_0x14ec
            r8 = -4619792497756654797(0xbfe3333333333333, double:-0.6)
            double r6 = r6 * r8
        L_0x0dac:
            double r8 = r12 - r18
            double r8 = r8 * r6
            double r18 = r14 - r22
            double r6 = r6 * r18
            r0 = r20
            double r0 = r0.g
            r18 = r0
            double r18 = r18 + r8
            r0 = r18
            r2 = r20
            r2.g = r0
            r0 = r20
            double r0 = r0.h
            r18 = r0
            double r18 = r18 + r6
            r0 = r18
            r2 = r20
            r2.h = r0
            r0 = r16
            double r0 = r0.g
            r18 = r0
            double r8 = r18 - r8
            r0 = r16
            r0.g = r8
            r0 = r16
            double r8 = r0.h
            double r6 = r8 - r6
            r0 = r16
            r0.h = r6
            com.saterskog.cell_lab.h r6 = com.saterskog.cell_lab.h.KERATINOCYTE
            r0 = r17
            if (r0 != r6) goto L_0x150b
            r7 = 1
        L_0x0dec:
            if (r7 != 0) goto L_0x1b55
            r6 = 0
        L_0x0def:
            r0 = r16
            int r8 = r0.C
            if (r6 >= r8) goto L_0x1b55
            r0 = r16
            com.saterskog.cell_lab.Link[] r8 = r0.H
            r8 = r8[r6]
            int r8 = r8.a
            if (r8 < 0) goto L_0x150e
            r0 = r46
            com.saterskog.cell_lab.Cell[] r8 = r0.x
            r0 = r16
            com.saterskog.cell_lab.Link[] r9 = r0.H
            r9 = r9[r6]
            int r9 = r9.a
            r8 = r8[r9]
            com.saterskog.cell_lab.Gene[] r9 = r8.I
            int r8 = r8.D
            r8 = r9[r8]
            com.saterskog.cell_lab.h r8 = r8.s
            com.saterskog.cell_lab.h r9 = com.saterskog.cell_lab.h.KERATINOCYTE
            if (r8 != r9) goto L_0x150e
            r6 = 1
        L_0x0e1a:
            r0 = r46
            boolean r7 = r0.bg
            if (r7 != 0) goto L_0x1066
            com.saterskog.cell_lab.h r7 = com.saterskog.cell_lab.h.VIROCYTE
            r0 = r21
            if (r0 != r7) goto L_0x0f43
            if (r6 != 0) goto L_0x0f43
            r0 = r46
            com.saterskog.b.d r7 = r0.Y
            double r8 = r7.a()
            r0 = r46
            double r0 = r0.T
            r18 = r0
            r22 = 4617315517961601024(0x4014000000000000, double:5.0)
            double r18 = r18 * r22
            int r7 = (r8 > r18 ? 1 : (r8 == r18 ? 0 : -1))
            if (r7 >= 0) goto L_0x0f43
            r0 = r16
            int r7 = r0.E
            r8 = 1
            if (r7 != r8) goto L_0x0e4a
            r7 = 4
            r0 = r16
            r0.E = r7
        L_0x0e4a:
            r0 = r16
            int r7 = r0.E
            if (r7 != 0) goto L_0x0e55
            r7 = 3
            r0 = r16
            r0.E = r7
        L_0x0e55:
            r0 = r16
            int r7 = r0.E
            r8 = 2
            if (r7 != r8) goto L_0x0e61
            r7 = 5
            r0 = r16
            r0.E = r7
        L_0x0e61:
            r7 = 0
            r0 = r20
            int r7 = r0.b(r7)
            int r8 = r7 - r7
            int r8 = r8 + 80
            r0 = r20
            com.saterskog.cell_lab.Gene[] r9 = r0.I
            r9 = r9[r7]
            r0 = r16
            com.saterskog.cell_lab.Gene[] r0 = r0.I
            r18 = r0
            r7 = r18[r7]
            r7.a((com.saterskog.cell_lab.Gene) r9)
            r0 = r16
            com.saterskog.cell_lab.Gene[] r7 = r0.I
            int r0 = r9.i
            r18 = r0
            int r18 = r18 + r8
            int r18 = r18 % 80
            r7 = r7[r18]
            r0 = r20
            com.saterskog.cell_lab.Gene[] r0 = r0.I
            r18 = r0
            int r0 = r9.i
            r19 = r0
            r18 = r18[r19]
            r0 = r18
            r7.a((com.saterskog.cell_lab.Gene) r0)
            r0 = r16
            com.saterskog.cell_lab.Gene[] r7 = r0.I
            int r0 = r9.j
            r18 = r0
            int r18 = r18 + r8
            int r18 = r18 % 80
            r7 = r7[r18]
            r0 = r20
            com.saterskog.cell_lab.Gene[] r0 = r0.I
            r18 = r0
            int r0 = r9.j
            r19 = r0
            r18 = r18[r19]
            r0 = r18
            r7.a((com.saterskog.cell_lab.Gene) r0)
            r0 = r20
            com.saterskog.cell_lab.Gene[] r7 = r0.I
            int r0 = r9.i
            r18 = r0
            r7 = r7[r18]
            r0 = r16
            com.saterskog.cell_lab.Gene[] r0 = r0.I
            r18 = r0
            int r0 = r7.i
            r19 = r0
            int r19 = r19 + r8
            int r19 = r19 % 80
            r18 = r18[r19]
            r0 = r20
            com.saterskog.cell_lab.Gene[] r0 = r0.I
            r19 = r0
            int r0 = r7.i
            r22 = r0
            r19 = r19[r22]
            r18.a((com.saterskog.cell_lab.Gene) r19)
            r0 = r16
            com.saterskog.cell_lab.Gene[] r0 = r0.I
            r18 = r0
            int r0 = r7.j
            r19 = r0
            int r19 = r19 + r8
            int r19 = r19 % 80
            r18 = r18[r19]
            r0 = r20
            com.saterskog.cell_lab.Gene[] r0 = r0.I
            r19 = r0
            int r7 = r7.j
            r7 = r19[r7]
            r0 = r18
            r0.a((com.saterskog.cell_lab.Gene) r7)
            r0 = r20
            com.saterskog.cell_lab.Gene[] r7 = r0.I
            int r9 = r9.j
            r7 = r7[r9]
            r0 = r16
            com.saterskog.cell_lab.Gene[] r9 = r0.I
            int r0 = r7.i
            r18 = r0
            int r18 = r18 + r8
            int r18 = r18 % 80
            r9 = r9[r18]
            r0 = r20
            com.saterskog.cell_lab.Gene[] r0 = r0.I
            r18 = r0
            int r0 = r7.i
            r19 = r0
            r18 = r18[r19]
            r0 = r18
            r9.a((com.saterskog.cell_lab.Gene) r0)
            r0 = r16
            com.saterskog.cell_lab.Gene[] r9 = r0.I
            int r0 = r7.j
            r18 = r0
            int r8 = r8 + r18
            int r8 = r8 % 80
            r8 = r9[r8]
            r0 = r20
            com.saterskog.cell_lab.Gene[] r9 = r0.I
            int r7 = r7.j
            r7 = r9[r7]
            r8.a((com.saterskog.cell_lab.Gene) r7)
        L_0x0f43:
            com.saterskog.cell_lab.h r7 = com.saterskog.cell_lab.h.VIROCYTE
            r0 = r17
            if (r0 != r7) goto L_0x1066
            if (r4 != 0) goto L_0x1066
            r0 = r46
            com.saterskog.b.d r7 = r0.Y
            double r8 = r7.a()
            r0 = r46
            double r0 = r0.T
            r18 = r0
            r22 = 4617315517961601024(0x4014000000000000, double:5.0)
            double r18 = r18 * r22
            int r7 = (r8 > r18 ? 1 : (r8 == r18 ? 0 : -1))
            if (r7 >= 0) goto L_0x1066
            r0 = r20
            int r7 = r0.E
            r8 = 1
            if (r7 != r8) goto L_0x0f6d
            r7 = 4
            r0 = r20
            r0.E = r7
        L_0x0f6d:
            r0 = r20
            int r7 = r0.E
            if (r7 != 0) goto L_0x0f78
            r7 = 3
            r0 = r20
            r0.E = r7
        L_0x0f78:
            r0 = r20
            int r7 = r0.E
            r8 = 2
            if (r7 != r8) goto L_0x0f84
            r7 = 5
            r0 = r20
            r0.E = r7
        L_0x0f84:
            r7 = 0
            r0 = r16
            int r7 = r0.b(r7)
            int r8 = r7 - r7
            int r8 = r8 + 80
            r0 = r16
            com.saterskog.cell_lab.Gene[] r9 = r0.I
            r9 = r9[r7]
            r0 = r20
            com.saterskog.cell_lab.Gene[] r0 = r0.I
            r18 = r0
            r7 = r18[r7]
            r7.a((com.saterskog.cell_lab.Gene) r9)
            r0 = r20
            com.saterskog.cell_lab.Gene[] r7 = r0.I
            int r0 = r9.i
            r18 = r0
            int r18 = r18 + r8
            int r18 = r18 % 80
            r7 = r7[r18]
            r0 = r16
            com.saterskog.cell_lab.Gene[] r0 = r0.I
            r18 = r0
            int r0 = r9.i
            r19 = r0
            r18 = r18[r19]
            r0 = r18
            r7.a((com.saterskog.cell_lab.Gene) r0)
            r0 = r20
            com.saterskog.cell_lab.Gene[] r7 = r0.I
            int r0 = r9.j
            r18 = r0
            int r18 = r18 + r8
            int r18 = r18 % 80
            r7 = r7[r18]
            r0 = r16
            com.saterskog.cell_lab.Gene[] r0 = r0.I
            r18 = r0
            int r0 = r9.j
            r19 = r0
            r18 = r18[r19]
            r0 = r18
            r7.a((com.saterskog.cell_lab.Gene) r0)
            r0 = r16
            com.saterskog.cell_lab.Gene[] r7 = r0.I
            int r0 = r9.i
            r18 = r0
            r7 = r7[r18]
            r0 = r20
            com.saterskog.cell_lab.Gene[] r0 = r0.I
            r18 = r0
            int r0 = r7.i
            r19 = r0
            int r19 = r19 + r8
            int r19 = r19 % 80
            r18 = r18[r19]
            r0 = r16
            com.saterskog.cell_lab.Gene[] r0 = r0.I
            r19 = r0
            int r0 = r7.i
            r22 = r0
            r19 = r19[r22]
            r18.a((com.saterskog.cell_lab.Gene) r19)
            r0 = r20
            com.saterskog.cell_lab.Gene[] r0 = r0.I
            r18 = r0
            int r0 = r7.j
            r19 = r0
            int r19 = r19 + r8
            int r19 = r19 % 80
            r18 = r18[r19]
            r0 = r16
            com.saterskog.cell_lab.Gene[] r0 = r0.I
            r19 = r0
            int r7 = r7.j
            r7 = r19[r7]
            r0 = r18
            r0.a((com.saterskog.cell_lab.Gene) r7)
            r0 = r16
            com.saterskog.cell_lab.Gene[] r7 = r0.I
            int r9 = r9.j
            r7 = r7[r9]
            r0 = r20
            com.saterskog.cell_lab.Gene[] r9 = r0.I
            int r0 = r7.i
            r18 = r0
            int r18 = r18 + r8
            int r18 = r18 % 80
            r9 = r9[r18]
            r0 = r16
            com.saterskog.cell_lab.Gene[] r0 = r0.I
            r18 = r0
            int r0 = r7.i
            r19 = r0
            r18 = r18[r19]
            r0 = r18
            r9.a((com.saterskog.cell_lab.Gene) r0)
            r0 = r20
            com.saterskog.cell_lab.Gene[] r9 = r0.I
            int r0 = r7.j
            r18 = r0
            int r8 = r8 + r18
            int r8 = r8 % 80
            r8 = r9[r8]
            r0 = r16
            com.saterskog.cell_lab.Gene[] r9 = r0.I
            int r7 = r7.j
            r7 = r9[r7]
            r8.a((com.saterskog.cell_lab.Gene) r7)
        L_0x1066:
            com.saterskog.cell_lab.h r7 = com.saterskog.cell_lab.h.GLUEOCYTE
            r0 = r21
            if (r0 != r7) goto L_0x1075
            r0 = r20
            int r7 = r0.C
            r8 = 5
            if (r7 >= r8) goto L_0x1075
            if (r6 == 0) goto L_0x108e
        L_0x1075:
            r0 = r16
            com.saterskog.cell_lab.Gene[] r7 = r0.I
            r0 = r16
            int r8 = r0.D
            r7 = r7[r8]
            com.saterskog.cell_lab.h r7 = r7.s
            com.saterskog.cell_lab.h r8 = com.saterskog.cell_lab.h.GLUEOCYTE
            if (r7 != r8) goto L_0x115a
            r0 = r16
            int r7 = r0.C
            r8 = 5
            if (r7 >= r8) goto L_0x115a
            if (r4 != 0) goto L_0x115a
        L_0x108e:
            r0 = r20
            int r7 = r0.C
            r8 = 20
            if (r7 >= r8) goto L_0x115a
            r0 = r16
            int r7 = r0.C
            r8 = 20
            if (r7 >= r8) goto L_0x115a
            r0 = r20
            double r8 = r0.o
            r18 = 4591870180066957722(0x3fb999999999999a, double:0.1)
            int r7 = (r8 > r18 ? 1 : (r8 == r18 ? 0 : -1))
            if (r7 < 0) goto L_0x115a
            r0 = r16
            double r8 = r0.o
            r18 = 4591870180066957722(0x3fb999999999999a, double:0.1)
            int r7 = (r8 > r18 ? 1 : (r8 == r18 ? 0 : -1))
            if (r7 < 0) goto L_0x115a
            r8 = 1
            r7 = 0
        L_0x10ba:
            r0 = r20
            int r9 = r0.C
            if (r7 >= r9) goto L_0x1b52
            r0 = r20
            com.saterskog.cell_lab.Link[] r9 = r0.H
            r9 = r9[r7]
            int r9 = r9.a
            if (r9 != r11) goto L_0x1512
            r7 = 0
        L_0x10cb:
            if (r7 == 0) goto L_0x115a
            r0 = r20
            com.saterskog.cell_lab.Link[] r7 = r0.H
            r0 = r20
            int r8 = r0.C
            r7 = r7[r8]
            r0 = r16
            com.saterskog.cell_lab.Link[] r8 = r0.H
            r0 = r16
            int r9 = r0.C
            r8 = r8[r9]
            r9 = 0
            r7.b = r9
            r9 = 0
            r8.b = r9
            r7.a = r11
            r0 = r47
            r8.a = r0
            r0 = r16
            double r0 = r0.c
            r18 = r0
            r0 = r20
            double r0 = r0.c
            r22 = r0
            double r18 = r18 - r22
            r0 = r16
            double r0 = r0.b
            r22 = r0
            r0 = r20
            double r0 = r0.b
            r24 = r0
            double r22 = r22 - r24
            r0 = r18
            r2 = r22
            double r18 = java.lang.Math.atan2(r0, r2)
            r0 = r20
            double r0 = r0.k
            r22 = r0
            double r22 = r18 - r22
            r0 = r22
            r8.d = r0
            r0 = r22
            r7.c = r0
            r22 = 4614256656552045848(0x400921fb54442d18, double:3.141592653589793)
            double r18 = r18 + r22
            r0 = r16
            double r0 = r0.k
            r22 = r0
            double r18 = r18 - r22
            r0 = r18
            r7.d = r0
            r0 = r18
            r8.c = r0
            r9 = 1056964608(0x3f000000, float:0.5)
            r7.k = r9
            r9 = 1056964608(0x3f000000, float:0.5)
            r8.k = r9
            r9 = 0
            r7.l = r9
            r7 = 0
            r8.l = r7
            r0 = r20
            int r7 = r0.C
            int r7 = r7 + 1
            r0 = r20
            r0.C = r7
            r0 = r16
            int r7 = r0.C
            int r7 = r7 + 1
            r0 = r16
            r0.C = r7
        L_0x115a:
            com.saterskog.cell_lab.h r7 = com.saterskog.cell_lab.h.DEVOROCYTE
            r0 = r21
            if (r0 != r7) goto L_0x1223
            if (r6 != 0) goto L_0x1223
            r8 = 4604660403008689930(0x3fe70a3d70a3d70a, double:0.72)
            r0 = r46
            double r0 = r0.T
            r18 = r0
            double r8 = r8 * r18
            r0 = r16
            double r0 = r0.w
            r18 = r0
            r22 = 4585348967806525243(0x3fa26e978d4fdf3b, double:0.036)
            double r18 = r18 - r22
            int r7 = (r8 > r18 ? 1 : (r8 == r18 ? 0 : -1))
            if (r7 <= 0) goto L_0x118b
            r0 = r16
            double r8 = r0.w
            r18 = 4585348967806525243(0x3fa26e978d4fdf3b, double:0.036)
            double r8 = r8 - r18
        L_0x118b:
            r0 = r20
            double r0 = r0.w
            r18 = r0
            double r18 = r18 + r8
            r0 = r18
            r2 = r20
            r2.w = r0
            r0 = r16
            double r0 = r0.w
            r18 = r0
            double r18 = r18 - r8
            r0 = r18
            r2 = r16
            r2.w = r0
            r0 = r20
            double r0 = r0.p
            r18 = r0
            r0 = r16
            double r0 = r0.p
            r22 = r0
            double r22 = r22 * r8
            r0 = r16
            double r0 = r0.w
            r24 = r0
            double r22 = r22 / r24
            double r18 = r18 + r22
            r0 = r18
            r2 = r20
            r2.p = r0
            r0 = r16
            double r0 = r0.p
            r18 = r0
            r0 = r16
            double r0 = r0.p
            r22 = r0
            double r22 = r22 * r8
            r0 = r16
            double r0 = r0.w
            r24 = r0
            double r22 = r22 / r24
            double r18 = r18 - r22
            r0 = r18
            r2 = r16
            r2.p = r0
            r0 = r20
            float r7 = r0.X
            double r0 = (double) r7
            r18 = r0
            r0 = r16
            float r7 = r0.X
            double r0 = (double) r7
            r22 = r0
            double r22 = r22 * r8
            r0 = r16
            double r0 = r0.w
            r24 = r0
            double r22 = r22 / r24
            double r18 = r18 + r22
            r0 = r18
            float r7 = (float) r0
            r0 = r20
            r0.X = r7
            r0 = r16
            float r7 = r0.X
            double r0 = (double) r7
            r18 = r0
            r0 = r16
            float r7 = r0.X
            double r0 = (double) r7
            r22 = r0
            double r8 = r8 * r22
            r0 = r16
            double r0 = r0.w
            r22 = r0
            double r8 = r8 / r22
            double r8 = r18 - r8
            float r7 = (float) r8
            r0 = r16
            r0.X = r7
        L_0x1223:
            com.saterskog.cell_lab.h r7 = com.saterskog.cell_lab.h.DEVOROCYTE
            r0 = r17
            if (r0 != r7) goto L_0x12ec
            if (r4 != 0) goto L_0x12ec
            r8 = 4604660403008689930(0x3fe70a3d70a3d70a, double:0.72)
            r0 = r46
            double r0 = r0.T
            r18 = r0
            double r8 = r8 * r18
            r0 = r20
            double r0 = r0.w
            r18 = r0
            r22 = 4585348967806525243(0x3fa26e978d4fdf3b, double:0.036)
            double r18 = r18 - r22
            int r7 = (r8 > r18 ? 1 : (r8 == r18 ? 0 : -1))
            if (r7 <= 0) goto L_0x1254
            r0 = r20
            double r8 = r0.w
            r18 = 4585348967806525243(0x3fa26e978d4fdf3b, double:0.036)
            double r8 = r8 - r18
        L_0x1254:
            r0 = r16
            double r0 = r0.w
            r18 = r0
            double r18 = r18 + r8
            r0 = r18
            r2 = r16
            r2.w = r0
            r0 = r20
            double r0 = r0.w
            r18 = r0
            double r18 = r18 - r8
            r0 = r18
            r2 = r20
            r2.w = r0
            r0 = r16
            double r0 = r0.p
            r18 = r0
            r0 = r20
            double r0 = r0.p
            r22 = r0
            double r22 = r22 * r8
            r0 = r20
            double r0 = r0.w
            r24 = r0
            double r22 = r22 / r24
            double r18 = r18 + r22
            r0 = r18
            r2 = r16
            r2.p = r0
            r0 = r20
            double r0 = r0.p
            r18 = r0
            r0 = r20
            double r0 = r0.p
            r22 = r0
            double r22 = r22 * r8
            r0 = r20
            double r0 = r0.w
            r24 = r0
            double r22 = r22 / r24
            double r18 = r18 - r22
            r0 = r18
            r2 = r20
            r2.p = r0
            r0 = r16
            float r7 = r0.X
            double r0 = (double) r7
            r18 = r0
            r0 = r20
            float r7 = r0.X
            double r0 = (double) r7
            r22 = r0
            double r22 = r22 * r8
            r0 = r20
            double r0 = r0.w
            r24 = r0
            double r22 = r22 / r24
            double r18 = r18 + r22
            r0 = r18
            float r7 = (float) r0
            r0 = r16
            r0.X = r7
            r0 = r20
            float r7 = r0.X
            double r0 = (double) r7
            r18 = r0
            r0 = r20
            float r7 = r0.X
            double r0 = (double) r7
            r22 = r0
            double r8 = r8 * r22
            r0 = r20
            double r0 = r0.w
            r22 = r0
            double r8 = r8 / r22
            double r8 = r18 - r8
            float r7 = (float) r8
            r0 = r20
            r0.X = r7
        L_0x12ec:
            com.saterskog.cell_lab.h r7 = com.saterskog.cell_lab.h.SECROCYTE
            r0 = r21
            if (r0 != r7) goto L_0x1625
            r0 = r20
            double r8 = r0.p
            r18 = 4596373779694328218(0x3fc999999999999a, double:0.2)
            int r7 = (r8 > r18 ? 1 : (r8 == r18 ? 0 : -1))
            if (r7 < 0) goto L_0x1625
            r0 = r20
            com.saterskog.cell_lab.Gene[] r7 = r0.I
            r0 = r20
            int r8 = r0.D
            r7 = r7[r8]
            int[] r7 = r7.u
            r8 = 4
            r8 = r7[r8]
            r7 = 1
            if (r8 != r7) goto L_0x1339
            if (r6 != 0) goto L_0x1339
            com.saterskog.cell_lab.h r6 = com.saterskog.cell_lab.h.SECROCYTE
            r0 = r17
            if (r0 != r6) goto L_0x1323
            r6 = 4
            r0 = r16
            int r6 = r0.b(r6)
            r7 = 1
            if (r6 == r7) goto L_0x1339
        L_0x1323:
            r0 = r16
            float r6 = r0.X
            double r6 = (double) r6
            r18 = 4633641066610819072(0x404e000000000000, double:60.0)
            r0 = r46
            double r0 = r0.T
            r22 = r0
            double r18 = r18 * r22
            double r6 = r6 + r18
            float r6 = (float) r6
            r0 = r16
            r0.X = r6
        L_0x1339:
            r6 = 2
            if (r8 != r6) goto L_0x136b
            com.saterskog.cell_lab.h r6 = com.saterskog.cell_lab.h.KERATINOCYTE
            r0 = r17
            if (r0 == r6) goto L_0x136b
            com.saterskog.cell_lab.h r6 = com.saterskog.cell_lab.h.SECROCYTE
            r0 = r17
            if (r0 != r6) goto L_0x1352
            r6 = 4
            r0 = r16
            int r6 = r0.b(r6)
            r7 = 2
            if (r6 == r7) goto L_0x136b
        L_0x1352:
            r0 = r16
            float r6 = r0.Y
            double r6 = (double) r6
            r18 = 4591870180174331904(0x3fb99999a0000000, double:0.10000000149011612)
            r0 = r46
            double r0 = r0.T
            r22 = r0
            double r18 = r18 * r22
            double r6 = r6 + r18
            float r6 = (float) r6
            r0 = r16
            r0.Y = r6
        L_0x136b:
            r6 = 3
            if (r8 != r6) goto L_0x15d4
            r0 = r20
            double r6 = r0.o
            r18 = 4602678819172646912(0x3fe0000000000000, double:0.5)
            int r6 = (r6 > r18 ? 1 : (r6 == r18 ? 0 : -1))
            if (r6 <= 0) goto L_0x15d4
            r6 = 0
        L_0x1379:
            r0 = r16
            int r7 = r0.C
            if (r6 >= r7) goto L_0x15d4
            r0 = r16
            com.saterskog.cell_lab.Link[] r7 = r0.H
            r7 = r7[r6]
            int r7 = r7.a
            r9 = -1
            if (r7 != r9) goto L_0x1516
            r0 = r20
            double r0 = r0.b
            r18 = r0
            r22 = 0
            double r18 = r18 - r22
            r0 = r20
            double r0 = r0.b
            r22 = r0
            r24 = 0
            double r22 = r22 - r24
            double r18 = r18 * r22
            r0 = r20
            double r0 = r0.c
            r22 = r0
            r24 = 0
            double r22 = r22 - r24
            r0 = r20
            double r0 = r0.c
            r24 = r0
            r26 = 0
            double r24 = r24 - r26
            double r22 = r22 * r24
            double r18 = r18 + r22
            r0 = r46
            com.saterskog.cell_lab.Environment r7 = r0.e
            double r0 = r7.k
            r22 = r0
            r0 = r20
            double r0 = r0.d
            r24 = r0
            double r22 = r22 - r24
            r0 = r46
            com.saterskog.cell_lab.Environment r7 = r0.e
            double r0 = r7.k
            r24 = r0
            r0 = r20
            double r0 = r0.d
            r26 = r0
            double r24 = r24 - r26
            double r22 = r22 * r24
            int r7 = (r18 > r22 ? 1 : (r18 == r22 ? 0 : -1))
            if (r7 < 0) goto L_0x13ff
            r0 = r16
            int r7 = r0.C
            int r7 = r7 + -1
            r0 = r16
            r0.C = r7
            r0 = r16
            com.saterskog.cell_lab.Link[] r7 = r0.H
            r7 = r7[r6]
            r0 = r16
            com.saterskog.cell_lab.Link[] r9 = r0.H
            r0 = r16
            int r0 = r0.C
            r18 = r0
            r9 = r9[r18]
            r7.a(r9)
        L_0x13fd:
            int r6 = r6 + -1
        L_0x13ff:
            int r6 = r6 + 1
            goto L_0x1379
        L_0x1403:
            r6 = 0
            goto L_0x0b1f
        L_0x1406:
            int r4 = r4 + 1
            goto L_0x0b22
        L_0x140a:
            double r38 = java.lang.Math.sqrt(r6)
            r0 = r20
            com.saterskog.cell_lab.u[] r0 = r0.A
            r40 = r0
            r0 = r20
            int r0 = r0.B
            r41 = r0
            r40 = r40[r41]
            r0 = r20
            int r0 = r0.B
            r41 = r0
            int r41 = r41 + 1
            r0 = r41
            r1 = r20
            r1.B = r0
            r0 = r16
            com.saterskog.cell_lab.u[] r0 = r0.A
            r41 = r0
            r0 = r16
            int r0 = r0.B
            r42 = r0
            r41 = r41[r42]
            r0 = r16
            int r0 = r0.B
            r42 = r0
            int r42 = r42 + 1
            r0 = r42
            r1 = r16
            r1.B = r0
            r42 = 4611686018427387904(0x4000000000000000, double:2.0)
            double r42 = r42 * r28
            double r38 = r38 / r42
            double r42 = r22 - r14
            double r42 = r42 * r38
            double r42 = r42 + r36
            r0 = r42
            r2 = r40
            r2.a = r0
            double r42 = r18 - r12
            double r42 = r42 * r38
            double r42 = r30 - r42
            r0 = r42
            r2 = r40
            r2.b = r0
            double r42 = r22 - r14
            double r42 = r42 * r38
            double r36 = r36 - r42
            r0 = r36
            r2 = r40
            r2.c = r0
            double r36 = r18 - r12
            double r36 = r36 * r38
            double r30 = r30 + r36
            r0 = r30
            r2 = r40
            r2.d = r0
            r0 = r40
            r0.g = r11
            r0 = r47
            r1 = r41
            r1.g = r0
            r30 = 0
            r0 = r30
            r1 = r40
            r1.e = r0
            r30 = 0
            r0 = r30
            r1 = r40
            r1.f = r0
            r0 = r40
            double r0 = r0.c
            r30 = r0
            double r30 = r30 + r12
            double r30 = r30 - r18
            r0 = r30
            r2 = r41
            r2.a = r0
            r0 = r40
            double r0 = r0.d
            r30 = r0
            double r30 = r30 + r14
            double r30 = r30 - r22
            r0 = r30
            r2 = r41
            r2.b = r0
            r0 = r40
            double r0 = r0.a
            r30 = r0
            double r30 = r30 + r12
            double r30 = r30 - r18
            r0 = r30
            r2 = r41
            r2.c = r0
            r0 = r40
            double r0 = r0.b
            r30 = r0
            double r30 = r30 + r14
            double r30 = r30 - r22
            r0 = r30
            r2 = r41
            r2.d = r0
            r30 = 0
            r0 = r30
            r1 = r41
            r1.e = r0
            r30 = 0
            r0 = r30
            r1 = r41
            r1.f = r0
            goto L_0x0c2e
        L_0x14e8:
            int r6 = r6 + 1
            goto L_0x0cfd
        L_0x14ec:
            r0 = r20
            int r8 = r0.D
            r9 = 1
            r0 = r16
            int r9 = r0.b(r9)
            if (r8 == r9) goto L_0x1506
            r8 = 1
            r0 = r20
            int r8 = r0.b(r8)
            r0 = r16
            int r9 = r0.D
            if (r8 != r9) goto L_0x0dac
        L_0x1506:
            r8 = 0
            double r6 = r6 * r8
            goto L_0x0dac
        L_0x150b:
            r7 = 0
            goto L_0x0dec
        L_0x150e:
            int r6 = r6 + 1
            goto L_0x0def
        L_0x1512:
            int r7 = r7 + 1
            goto L_0x10ba
        L_0x1516:
            r0 = r46
            com.saterskog.cell_lab.Cell[] r7 = r0.x
            r0 = r16
            com.saterskog.cell_lab.Link[] r9 = r0.H
            r9 = r9[r6]
            int r9 = r9.a
            r9 = r7[r9]
            r0 = r20
            double r0 = r0.b
            r18 = r0
            double r0 = r9.b
            r22 = r0
            double r18 = r18 - r22
            r0 = r20
            double r0 = r0.b
            r22 = r0
            double r0 = r9.b
            r24 = r0
            double r22 = r22 - r24
            double r18 = r18 * r22
            r0 = r20
            double r0 = r0.c
            r22 = r0
            double r0 = r9.c
            r24 = r0
            double r22 = r22 - r24
            r0 = r20
            double r0 = r0.c
            r24 = r0
            double r0 = r9.c
            r26 = r0
            double r24 = r24 - r26
            double r22 = r22 * r24
            double r18 = r18 + r22
            r0 = r20
            double r0 = r0.d
            r22 = r0
            double r0 = r9.d
            r24 = r0
            double r22 = r22 + r24
            r0 = r20
            double r0 = r0.d
            r24 = r0
            double r0 = r9.d
            r26 = r0
            double r24 = r24 + r26
            double r22 = r22 * r24
            int r7 = (r18 > r22 ? 1 : (r18 == r22 ? 0 : -1))
            if (r7 > 0) goto L_0x13ff
            r0 = r16
            int r7 = r0.C
            int r7 = r7 + -1
            r0 = r16
            r0.C = r7
            r0 = r16
            com.saterskog.cell_lab.Link[] r7 = r0.H
            r7 = r7[r6]
            r0 = r16
            com.saterskog.cell_lab.Link[] r0 = r0.H
            r18 = r0
            r0 = r16
            int r0 = r0.C
            r19 = r0
            r18 = r18[r19]
            r0 = r18
            r7.a(r0)
            r7 = 0
        L_0x159c:
            int r0 = r9.C
            r18 = r0
            r0 = r18
            if (r7 >= r0) goto L_0x13fd
            com.saterskog.cell_lab.Link[] r0 = r9.H
            r18 = r0
            r18 = r18[r7]
            r0 = r18
            int r0 = r0.a
            r18 = r0
            r0 = r18
            if (r0 != r11) goto L_0x15d1
            int r0 = r9.C
            r18 = r0
            int r18 = r18 + -1
            r0 = r18
            r9.C = r0
            com.saterskog.cell_lab.Link[] r0 = r9.H
            r18 = r0
            r18 = r18[r7]
            com.saterskog.cell_lab.Link[] r0 = r9.H
            r19 = r0
            int r0 = r9.C
            r22 = r0
            r19 = r19[r22]
            r18.a(r19)
        L_0x15d1:
            int r7 = r7 + 1
            goto L_0x159c
        L_0x15d4:
            r6 = 7
            if (r6 > r8) goto L_0x15fd
            r6 = 11
            if (r8 >= r6) goto L_0x15fd
            com.saterskog.cell_lab.h r6 = com.saterskog.cell_lab.h.LIPOCYTE
            r0 = r17
            if (r0 == r6) goto L_0x15fd
            r0 = r16
            float[] r6 = r0.U
            int r7 = r8 + -7
            r9 = r6[r7]
            double r0 = (double) r9
            r18 = r0
            r22 = 4633641066610819072(0x404e000000000000, double:60.0)
            r0 = r46
            double r0 = r0.T
            r24 = r0
            double r22 = r22 * r24
            double r18 = r18 - r22
            r0 = r18
            float r9 = (float) r0
            r6[r7] = r9
        L_0x15fd:
            r6 = 11
            if (r6 > r8) goto L_0x1625
            r6 = 15
            if (r8 >= r6) goto L_0x1625
            com.saterskog.cell_lab.h r6 = com.saterskog.cell_lab.h.LIPOCYTE
            r0 = r17
            if (r0 == r6) goto L_0x1625
            r0 = r16
            float[] r6 = r0.U
            int r7 = r8 + -7
            int r7 = r7 + -4
            r8 = r6[r7]
            double r8 = (double) r8
            r18 = 4633641066610819072(0x404e000000000000, double:60.0)
            r0 = r46
            double r0 = r0.T
            r22 = r0
            double r18 = r18 * r22
            double r8 = r8 + r18
            float r8 = (float) r8
            r6[r7] = r8
        L_0x1625:
            com.saterskog.cell_lab.h r6 = com.saterskog.cell_lab.h.SECROCYTE
            r0 = r17
            if (r0 != r6) goto L_0x1843
            r0 = r16
            double r6 = r0.p
            r8 = 4596373779694328218(0x3fc999999999999a, double:0.2)
            int r6 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r6 < 0) goto L_0x1843
            r0 = r16
            com.saterskog.cell_lab.Gene[] r6 = r0.I
            r0 = r16
            int r7 = r0.D
            r6 = r6[r7]
            int[] r6 = r6.u
            r7 = 4
            r8 = r6[r7]
            r6 = 1
            if (r8 != r6) goto L_0x1672
            if (r4 != 0) goto L_0x1672
            com.saterskog.cell_lab.h r6 = com.saterskog.cell_lab.h.SECROCYTE
            r0 = r21
            if (r0 != r6) goto L_0x165c
            r6 = 4
            r0 = r20
            int r6 = r0.b(r6)
            r7 = 1
            if (r6 == r7) goto L_0x1672
        L_0x165c:
            r0 = r20
            float r6 = r0.X
            double r6 = (double) r6
            r18 = 4633641066610819072(0x404e000000000000, double:60.0)
            r0 = r46
            double r0 = r0.T
            r22 = r0
            double r18 = r18 * r22
            double r6 = r6 + r18
            float r6 = (float) r6
            r0 = r20
            r0.X = r6
        L_0x1672:
            r6 = 2
            if (r8 != r6) goto L_0x16a4
            com.saterskog.cell_lab.h r6 = com.saterskog.cell_lab.h.KERATINOCYTE
            r0 = r21
            if (r0 == r6) goto L_0x16a4
            com.saterskog.cell_lab.h r6 = com.saterskog.cell_lab.h.SECROCYTE
            r0 = r21
            if (r0 != r6) goto L_0x168b
            r6 = 4
            r0 = r20
            int r6 = r0.b(r6)
            r7 = 2
            if (r6 == r7) goto L_0x16a4
        L_0x168b:
            r0 = r20
            float r6 = r0.Y
            double r6 = (double) r6
            r18 = 4591870180174331904(0x3fb99999a0000000, double:0.10000000149011612)
            r0 = r46
            double r0 = r0.T
            r22 = r0
            double r18 = r18 * r22
            double r6 = r6 + r18
            float r6 = (float) r6
            r0 = r20
            r0.Y = r6
        L_0x16a4:
            r6 = 3
            if (r8 != r6) goto L_0x17f2
            r0 = r16
            double r6 = r0.o
            r18 = 4602678819172646912(0x3fe0000000000000, double:0.5)
            int r6 = (r6 > r18 ? 1 : (r6 == r18 ? 0 : -1))
            if (r6 <= 0) goto L_0x17f2
            r6 = 0
        L_0x16b2:
            r0 = r20
            int r7 = r0.C
            if (r6 >= r7) goto L_0x17f2
            r0 = r20
            com.saterskog.cell_lab.Link[] r7 = r0.H
            r7 = r7[r6]
            int r7 = r7.a
            r9 = -1
            if (r7 != r9) goto L_0x173a
            r0 = r16
            double r0 = r0.b
            r18 = r0
            r22 = 0
            double r18 = r18 - r22
            r0 = r16
            double r0 = r0.b
            r22 = r0
            r24 = 0
            double r22 = r22 - r24
            double r18 = r18 * r22
            r0 = r16
            double r0 = r0.c
            r22 = r0
            r24 = 0
            double r22 = r22 - r24
            r0 = r16
            double r0 = r0.c
            r24 = r0
            r26 = 0
            double r24 = r24 - r26
            double r22 = r22 * r24
            double r18 = r18 + r22
            r0 = r46
            com.saterskog.cell_lab.Environment r7 = r0.e
            double r0 = r7.k
            r22 = r0
            r0 = r16
            double r0 = r0.d
            r24 = r0
            double r22 = r22 - r24
            r0 = r46
            com.saterskog.cell_lab.Environment r7 = r0.e
            double r0 = r7.k
            r24 = r0
            r0 = r16
            double r0 = r0.d
            r26 = r0
            double r24 = r24 - r26
            double r22 = r22 * r24
            int r7 = (r18 > r22 ? 1 : (r18 == r22 ? 0 : -1))
            if (r7 < 0) goto L_0x1736
            r0 = r20
            int r7 = r0.C
            int r7 = r7 + -1
            r0 = r20
            r0.C = r7
            r0 = r20
            com.saterskog.cell_lab.Link[] r7 = r0.H
            r7 = r7[r6]
            r0 = r20
            com.saterskog.cell_lab.Link[] r9 = r0.H
            r0 = r20
            int r11 = r0.C
            r9 = r9[r11]
            r7.a(r9)
        L_0x1734:
            int r6 = r6 + -1
        L_0x1736:
            int r6 = r6 + 1
            goto L_0x16b2
        L_0x173a:
            r0 = r46
            com.saterskog.cell_lab.Cell[] r7 = r0.x
            r0 = r20
            com.saterskog.cell_lab.Link[] r9 = r0.H
            r9 = r9[r6]
            int r9 = r9.a
            r9 = r7[r9]
            r0 = r20
            com.saterskog.cell_lab.Link[] r7 = r0.H
            r7 = r7[r6]
            int r7 = r7.a
            r0 = r47
            if (r7 == r0) goto L_0x1736
            r0 = r16
            double r0 = r0.b
            r18 = r0
            double r0 = r9.b
            r22 = r0
            double r18 = r18 - r22
            r0 = r16
            double r0 = r0.b
            r22 = r0
            double r0 = r9.b
            r24 = r0
            double r22 = r22 - r24
            double r18 = r18 * r22
            r0 = r16
            double r0 = r0.c
            r22 = r0
            double r0 = r9.c
            r24 = r0
            double r22 = r22 - r24
            r0 = r16
            double r0 = r0.c
            r24 = r0
            double r0 = r9.c
            r26 = r0
            double r24 = r24 - r26
            double r22 = r22 * r24
            double r18 = r18 + r22
            r0 = r16
            double r0 = r0.d
            r22 = r0
            double r0 = r9.d
            r24 = r0
            double r22 = r22 + r24
            r0 = r16
            double r0 = r0.d
            r24 = r0
            double r0 = r9.d
            r26 = r0
            double r24 = r24 + r26
            double r22 = r22 * r24
            int r7 = (r18 > r22 ? 1 : (r18 == r22 ? 0 : -1))
            if (r7 > 0) goto L_0x1736
            r0 = r20
            int r7 = r0.C
            int r7 = r7 + -1
            r0 = r20
            r0.C = r7
            r0 = r20
            com.saterskog.cell_lab.Link[] r7 = r0.H
            r7 = r7[r6]
            r0 = r20
            com.saterskog.cell_lab.Link[] r11 = r0.H
            r0 = r20
            int r0 = r0.C
            r17 = r0
            r11 = r11[r17]
            r7.a(r11)
            r7 = 0
        L_0x17c8:
            int r11 = r9.C
            if (r7 >= r11) goto L_0x1734
            com.saterskog.cell_lab.Link[] r11 = r9.H
            r11 = r11[r7]
            int r11 = r11.a
            r0 = r47
            if (r11 != r0) goto L_0x17ef
            int r11 = r9.C
            int r11 = r11 + -1
            r9.C = r11
            com.saterskog.cell_lab.Link[] r11 = r9.H
            r11 = r11[r7]
            com.saterskog.cell_lab.Link[] r0 = r9.H
            r17 = r0
            int r0 = r9.C
            r18 = r0
            r17 = r17[r18]
            r0 = r17
            r11.a(r0)
        L_0x17ef:
            int r7 = r7 + 1
            goto L_0x17c8
        L_0x17f2:
            r6 = 7
            if (r6 > r8) goto L_0x181b
            r6 = 11
            if (r8 >= r6) goto L_0x181b
            com.saterskog.cell_lab.h r6 = com.saterskog.cell_lab.h.LIPOCYTE
            r0 = r21
            if (r0 == r6) goto L_0x181b
            r0 = r20
            float[] r6 = r0.U
            int r7 = r8 + -7
            r9 = r6[r7]
            double r0 = (double) r9
            r16 = r0
            r18 = 4633641066610819072(0x404e000000000000, double:60.0)
            r0 = r46
            double r0 = r0.T
            r22 = r0
            double r18 = r18 * r22
            double r16 = r16 - r18
            r0 = r16
            float r9 = (float) r0
            r6[r7] = r9
        L_0x181b:
            r6 = 11
            if (r6 > r8) goto L_0x1843
            r6 = 15
            if (r8 >= r6) goto L_0x1843
            com.saterskog.cell_lab.h r6 = com.saterskog.cell_lab.h.LIPOCYTE
            r0 = r21
            if (r0 == r6) goto L_0x1843
            r0 = r20
            float[] r6 = r0.U
            int r7 = r8 + -7
            int r7 = r7 + -4
            r8 = r6[r7]
            double r8 = (double) r8
            r16 = 4633641066610819072(0x404e000000000000, double:60.0)
            r0 = r46
            double r0 = r0.T
            r18 = r0
            double r16 = r16 * r18
            double r8 = r8 + r16
            float r8 = (float) r8
            r6[r7] = r8
        L_0x1843:
            int r6 = r10 + 1
            r10 = r6
            goto L_0x0b4f
        L_0x1848:
            r0 = r20
            double r4 = r0.b
            r0 = r20
            double r6 = r0.b
            double r4 = r4 * r6
            r0 = r20
            double r6 = r0.c
            r0 = r20
            double r8 = r0.c
            double r6 = r6 * r8
            double r4 = r4 + r6
            r0 = r46
            com.saterskog.cell_lab.Environment r6 = r0.e
            double r6 = r6.k
            r0 = r20
            double r8 = r0.d
            double r6 = r6 - r8
            r0 = r46
            com.saterskog.cell_lab.Environment r8 = r0.e
            double r8 = r8.k
            r0 = r20
            double r10 = r0.d
            double r8 = r8 - r10
            double r6 = r6 * r8
            int r6 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r6 < 0) goto L_0x19ed
            double r6 = java.lang.Math.sqrt(r4)
            r0 = r20
            double r4 = r0.d
            double r8 = -r6
            double r8 = r8 + r4
            r0 = r46
            com.saterskog.cell_lab.Environment r10 = r0.e
            double r10 = r10.k
            double r8 = r8 - r10
            double r10 = -r6
            double r10 = r10 - r4
            r0 = r46
            com.saterskog.cell_lab.Environment r0 = r0.e
            r16 = r0
            r0 = r16
            double r0 = r0.k
            r16 = r0
            double r10 = r10 + r16
            double r8 = r8 * r10
            double r10 = -r6
            double r10 = r10 + r4
            r0 = r46
            com.saterskog.cell_lab.Environment r0 = r0.e
            r16 = r0
            r0 = r16
            double r0 = r0.k
            r16 = r0
            double r10 = r10 + r16
            double r8 = r8 * r10
            double r10 = r6 + r4
            r0 = r46
            com.saterskog.cell_lab.Environment r0 = r0.e
            r16 = r0
            r0 = r16
            double r0 = r0.k
            r16 = r0
            double r10 = r10 + r16
            double r8 = r8 * r10
            double r8 = java.lang.Math.sqrt(r8)
            double r8 = r8 / r6
            r0 = r46
            boolean r10 = r0.U
            if (r10 == 0) goto L_0x18eb
            r0 = r20
            int r10 = r0.B
            r11 = 20
            if (r10 < r11) goto L_0x1a9f
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r5 = "skit: Cell touches too many neighbors (border in this case) (>"
            r4.<init>(r5)
            r5 = 20
            java.lang.String r5 = java.lang.Integer.toString(r5)
            java.lang.StringBuilder r4 = r4.append(r5)
            java.lang.String r5 = "), not supposed to normally happen and programmer was lazy enough to not gracefully handle this case."
            java.lang.StringBuilder r4 = r4.append(r5)
            java.lang.String r4 = r4.toString()
            com.saterskog.b.a.a((java.lang.String) r4)
        L_0x18eb:
            r0 = r46
            com.saterskog.cell_lab.Environment r4 = r0.e
            boolean r4 = r4.x
            if (r4 != 0) goto L_0x19ed
            r4 = 4647503709213818880(0x407f400000000000, double:500.0)
            double r4 = r4 / r6
            double r4 = r4 * r8
            double r4 = r4 * r8
            r8 = 4611686018427387904(0x4000000000000000, double:2.0)
            double r4 = r4 * r8
            r8 = 6
            r0 = r20
            float r8 = r0.a((int) r8)
            double r8 = (double) r8
            double r4 = r4 * r8
            r0 = r20
            double r8 = r0.g
            r0 = r20
            double r10 = r0.b
            double r10 = r10 * r4
            double r8 = r8 - r10
            r0 = r20
            r0.g = r8
            r0 = r20
            double r8 = r0.h
            r0 = r20
            double r10 = r0.c
            double r4 = r4 * r10
            double r4 = r8 - r4
            r0 = r20
            r0.h = r4
            com.saterskog.cell_lab.h r4 = com.saterskog.cell_lab.h.GLUEOCYTE
            r0 = r21
            if (r0 != r4) goto L_0x19b2
            r0 = r20
            int r4 = r0.C
            r5 = 5
            if (r4 >= r5) goto L_0x19b2
            r0 = r20
            int r4 = r0.C
            r5 = 20
            if (r4 >= r5) goto L_0x19b2
            r5 = 1
            r4 = 0
        L_0x193b:
            r0 = r20
            int r8 = r0.C
            if (r4 >= r8) goto L_0x1b4f
            r0 = r20
            com.saterskog.cell_lab.Link[] r8 = r0.H
            r8 = r8[r4]
            int r8 = r8.a
            r9 = -1
            if (r8 != r9) goto L_0x1b41
            r4 = 0
        L_0x194d:
            if (r4 == 0) goto L_0x19b2
            r0 = r20
            com.saterskog.cell_lab.Link[] r4 = r0.H
            r0 = r20
            int r5 = r0.C
            r4 = r4[r5]
            r5 = 0
            r4.b = r5
            r5 = -1
            r4.a = r5
            r0 = r20
            double r8 = r0.c
            r0 = r20
            double r10 = r0.b
            double r8 = java.lang.Math.atan2(r8, r10)
            r0 = r20
            double r10 = r0.k
            double r8 = r8 - r10
            r4.c = r8
            r0 = r20
            double r8 = r0.b
            double r8 = r8 / r6
            r0 = r46
            com.saterskog.cell_lab.Environment r5 = r0.e
            double r10 = r5.k
            double r12 = com.saterskog.cell_lab.Cell.a
            r14 = 4600877379321698714(0x3fd999999999999a, double:0.4)
            double r12 = r12 * r14
            double r10 = r10 + r12
            double r8 = r8 * r10
            r4.e = r8
            r0 = r20
            double r8 = r0.c
            double r6 = r8 / r6
            r0 = r46
            com.saterskog.cell_lab.Environment r5 = r0.e
            double r8 = r5.k
            double r10 = com.saterskog.cell_lab.Cell.a
            r12 = 4600877379321698714(0x3fd999999999999a, double:0.4)
            double r10 = r10 * r12
            double r8 = r8 + r10
            double r6 = r6 * r8
            r4.f = r6
            r5 = 1056964608(0x3f000000, float:0.5)
            r4.k = r5
            r5 = 0
            r4.l = r5
            r0 = r20
            int r4 = r0.C
            int r4 = r4 + 1
            r0 = r20
            r0.C = r4
        L_0x19b2:
            com.saterskog.cell_lab.h r4 = com.saterskog.cell_lab.h.CILIOCYTE
            r0 = r21
            if (r0 != r4) goto L_0x19ed
            r5 = 1
            r4 = 0
        L_0x19ba:
            r0 = r20
            int r6 = r0.C
            if (r4 >= r6) goto L_0x1b4c
            r0 = r20
            com.saterskog.cell_lab.Link[] r6 = r0.H
            r6 = r6[r4]
            int r6 = r6.a
            r7 = -1
            if (r6 != r7) goto L_0x1b45
            r4 = 0
        L_0x19cc:
            if (r4 == 0) goto L_0x19ed
            r0 = r46
            int[] r4 = r0.aY
            r0 = r46
            int r5 = r0.aX
            r4[r5] = r47
            r0 = r46
            int[] r4 = r0.aZ
            r0 = r46
            int r5 = r0.aX
            r6 = -1
            r4[r5] = r6
            r0 = r46
            int r4 = r0.aX
            int r4 = r4 + 1
            r0 = r46
            r0.aX = r4
        L_0x19ed:
            r0 = r20
            double r4 = r0.d
            r0 = r46
            com.saterskog.cell_lab.Environment r6 = r0.e
            double r6 = r6.g
            double r4 = r4 * r6
            r6 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            r8 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            r0 = r46
            double r10 = r0.T
            double r8 = r8 * r10
            double r8 = r8 * r4
            r10 = 4602678819172646912(0x3fe0000000000000, double:0.5)
            double r8 = r8 * r10
            r0 = r20
            double r10 = r0.w
            double r8 = r8 / r10
            double r6 = r6 - r8
            double r4 = r4 * r6
            r0 = r20
            double r6 = r0.g
            r0 = r20
            double r8 = r0.e
            double r8 = r8 * r4
            double r6 = r6 - r8
            r0 = r20
            r0.g = r6
            r0 = r20
            double r6 = r0.h
            r0 = r20
            double r8 = r0.f
            double r4 = r4 * r8
            double r4 = r6 - r4
            r0 = r20
            r0.h = r4
            r0 = r46
            boolean r4 = r0.bg
            if (r4 != 0) goto L_0x1a78
            r0 = r46
            com.saterskog.cell_lab.Environment r4 = r0.e
            double r4 = r4.h
            r0 = r46
            com.saterskog.cell_lab.Environment r6 = r0.e
            double r6 = r6.j
            r0 = r20
            double r8 = r0.c
            double r6 = r6 * r8
            r0 = r46
            com.saterskog.cell_lab.Environment r8 = r0.e
            double r8 = r8.k
            double r6 = r6 / r8
            double r6 = r6 + r4
            r0 = r20
            double r8 = r0.h
            r0 = r20
            double r10 = r0.w
            r0 = r20
            com.saterskog.cell_lab.Gene[] r4 = r0.I
            r0 = r20
            int r5 = r0.D
            r4 = r4[r5]
            com.saterskog.cell_lab.h r4 = r4.s
            com.saterskog.cell_lab.h r5 = com.saterskog.cell_lab.h.BUOYOCYTE
            if (r4 != r5) goto L_0x1b49
            r4 = 1
            r5 = 0
            r0 = r20
            float r4 = r0.a(r4, r5)
        L_0x1a68:
            double r4 = (double) r4
            double r4 = r4 - r6
            double r4 = r4 * r10
            r0 = r46
            com.saterskog.cell_lab.Environment r6 = r0.e
            double r6 = r6.i
            double r4 = r4 * r6
            double r4 = r8 - r4
            r0 = r20
            r0.h = r4
        L_0x1a78:
            r0 = r20
            double r4 = r0.j
            r0 = r20
            double r6 = r0.l
            r0 = r20
            double r8 = r0.d
            double r6 = r6 * r8
            r0 = r20
            double r8 = r0.d
            double r6 = r6 * r8
            r0 = r20
            double r8 = r0.d
            double r6 = r6 * r8
            r0 = r46
            com.saterskog.cell_lab.Environment r8 = r0.e
            double r8 = r8.g
            double r6 = r6 * r8
            r8 = 4602678819172646912(0x3fe0000000000000, double:0.5)
            double r6 = r6 * r8
            double r4 = r4 - r6
            r0 = r20
            r0.j = r4
            return
        L_0x1a9f:
            double r10 = r6 * r6
            r0 = r46
            com.saterskog.cell_lab.Environment r0 = r0.e
            r16 = r0
            r0 = r16
            double r0 = r0.k
            r16 = r0
            r0 = r46
            com.saterskog.cell_lab.Environment r0 = r0.e
            r18 = r0
            r0 = r18
            double r0 = r0.k
            r18 = r0
            double r16 = r16 * r18
            double r10 = r10 - r16
            double r4 = r4 * r4
            double r4 = r4 + r10
            r10 = 4611686018427387904(0x4000000000000000, double:2.0)
            double r10 = r10 * r6
            double r4 = r4 / r10
            r10 = 0
            double r10 = r10 - r12
            double r10 = r10 * r4
            double r10 = r10 / r6
            r16 = 0
            double r16 = r16 - r14
            double r4 = r4 * r16
            double r4 = r4 / r6
            r0 = r20
            com.saterskog.cell_lab.u[] r0 = r0.A
            r16 = r0
            r0 = r20
            int r0 = r0.B
            r17 = r0
            r16 = r16[r17]
            r0 = r20
            int r0 = r0.B
            r17 = r0
            int r17 = r17 + 1
            r0 = r17
            r1 = r20
            r1.B = r0
            r18 = 0
            double r18 = r18 - r14
            double r18 = r18 * r8
            r22 = 4611686018427387904(0x4000000000000000, double:2.0)
            double r22 = r22 * r6
            double r18 = r18 / r22
            double r18 = r18 + r10
            r0 = r18
            r2 = r16
            r2.c = r0
            r18 = 0
            double r18 = r18 - r12
            double r18 = r18 * r8
            r22 = 4611686018427387904(0x4000000000000000, double:2.0)
            double r22 = r22 * r6
            double r18 = r18 / r22
            double r18 = r4 - r18
            r0 = r18
            r2 = r16
            r2.d = r0
            r18 = 0
            double r14 = r18 - r14
            double r14 = r14 * r8
            r18 = 4611686018427387904(0x4000000000000000, double:2.0)
            double r18 = r18 * r6
            double r14 = r14 / r18
            double r10 = r10 - r14
            r0 = r16
            r0.a = r10
            r10 = 0
            double r10 = r10 - r12
            double r10 = r10 * r8
            r12 = 4611686018427387904(0x4000000000000000, double:2.0)
            double r12 = r12 * r6
            double r10 = r10 / r12
            double r4 = r4 + r10
            r0 = r16
            r0.b = r4
            r4 = -1
            r0 = r16
            r0.g = r4
            r4 = 0
            r0 = r16
            r0.e = r4
            r4 = 0
            r0 = r16
            r0.f = r4
            goto L_0x18eb
        L_0x1b41:
            int r4 = r4 + 1
            goto L_0x193b
        L_0x1b45:
            int r4 = r4 + 1
            goto L_0x19ba
        L_0x1b49:
            r4 = 0
            goto L_0x1a68
        L_0x1b4c:
            r4 = r5
            goto L_0x19cc
        L_0x1b4f:
            r4 = r5
            goto L_0x194d
        L_0x1b52:
            r7 = r8
            goto L_0x10cb
        L_0x1b55:
            r6 = r7
            goto L_0x0e1a
        L_0x1b58:
            r6 = r7
            goto L_0x0d1a
        L_0x1b5b:
            r4 = r6
            goto L_0x0b4d
        L_0x1b5e:
            r8 = r4
            goto L_0x0ad7
        L_0x1b61:
            r44 = r6
            r6 = r10
            r10 = r44
            goto L_0x06da
        */
        throw new UnsupportedOperationException("Method not decompiled: com.saterskog.cell_lab.CellWorld.d(int):void");
    }

    private void c(boolean z2, double d2) {
        this.T = d2;
        this.U = z2;
        this.aX = 0;
        for (int i2 = 0; i2 < this.z; i2++) {
            d(i2);
        }
    }

    private void i() {
        int i2;
        for (int i3 = 0; i3 < this.z; i3++) {
            Cell cell = this.x[i3];
            cell.B = 0;
            int i4 = 0;
            while (true) {
                int i5 = i4;
                if (i5 >= 4) {
                    break;
                }
                int i6 = -1;
                if (i5 == 0) {
                    i6 = cell.K;
                }
                if (i5 == 1) {
                    i6 = cell.L;
                }
                if (i5 == 2) {
                    i6 = cell.M;
                }
                if (i5 == 3) {
                    i2 = cell.N;
                } else {
                    i2 = i6;
                }
                if (i2 != -1) {
                    for (int i7 = 0; i7 < this.aW[i2]; i7++) {
                        int i8 = this.aV[i2][i7];
                        if (i8 > i3) {
                            Cell cell2 = this.x[i8];
                            double d2 = ((cell.b - cell2.b) * (cell.b - cell2.b)) + ((cell.c - cell2.c) * (cell.c - cell2.c));
                            double d3 = cell.d;
                            double d4 = cell2.d;
                            double d5 = d3 + d4;
                            if (d2 < d5 * d5 && d2 != 0.0d) {
                                double d6 = (d3 * d3) - (d4 * d4);
                                if (d6 > d2) {
                                    cell2.x = true;
                                }
                                if ((-d6) > d2) {
                                    cell.x = true;
                                }
                                boolean z2 = false;
                                Cell cell3 = null;
                                Cell cell4 = null;
                                if (d6 > d2 - ((Cell.a * Cell.a) * 0.01d) && cell.I[cell.D].s == h.GAMETE && cell2.I[cell2.D].s == h.GAMETE && cell.o > 0.5d && cell2.o > 0.5d) {
                                    if (d6 > d2 || this.Y.nextInt(2) == 0) {
                                        cell3 = cell2;
                                        z2 = true;
                                        cell4 = cell;
                                    } else {
                                        cell3 = cell;
                                        z2 = true;
                                        cell4 = cell2;
                                    }
                                }
                                if ((-d6) <= d2 - ((Cell.a * Cell.a) * 0.01d) || cell.I[cell.D].s != h.GAMETE || cell2.I[cell2.D].s != h.GAMETE || cell.o <= 0.5d || cell2.o <= 0.5d) {
                                    cell2 = cell4;
                                } else {
                                    z2 = true;
                                    if ((-d6) > d2 || this.Y.nextInt(2) == 0) {
                                        cell3 = cell;
                                    } else {
                                        cell3 = cell2;
                                        cell2 = cell;
                                    }
                                }
                                if (z2) {
                                    cell3.x = true;
                                    cell2.o = 0.0d;
                                    cell2.w += cell3.w;
                                    cell3.w = 0.0d;
                                    cell2.T = Gene.B[cell2.b(10)];
                                    cell2.p += cell3.p;
                                    cell2.D = cell2.b(0);
                                    if (cell3.E != cell2.E) {
                                        cell2.E = 6;
                                    }
                                    if (cell2.w > 0.36d) {
                                        cell2.w = 0.36d;
                                    }
                                    if (cell2.p > 1.0d) {
                                        cell2.p = 1.0d;
                                    }
                                    for (int i9 = 0; i9 < 80; i9++) {
                                        if (this.Y.nextInt(2) == 1) {
                                            cell2.I[i9].a(cell3.I[i9]);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                i4 = i5 + 1;
            }
        }
    }

    private void d(double d2) {
        int i2;
        double a2;
        for (int i3 = 0; i3 < this.B; i3 = i2 + 1) {
            Food food = this.A[i3];
            float f2 = food.d;
            float f3 = food.e;
            food.c = (float) (((double) food.c) - (0.006d * d2));
            if (food.c < 0.0f) {
                food.a(this.A[this.B - 1]);
                this.B--;
                i2 = i3 - 1;
            } else {
                int i4 = ((int) ((((this.e.k + ((double) food.a)) / (2.0d * this.e.k)) * ((double) this.bd)) + 1.0d)) + (((int) ((((this.e.k + ((double) food.b)) / (2.0d * this.e.k)) * ((double) this.bd)) + 1.0d)) * (this.bd + 2));
                if (i4 >= 0 && i4 < this.bc.length) {
                    int i5 = this.bc[i4];
                    if (i5 < 404) {
                        this.ba[i4][i5] = i3;
                        if (food.f <= 0.0f) {
                            this.bb[i4][i5] = 1;
                        } else {
                            this.bb[i4][i5] = 2;
                        }
                        int[] iArr = this.bc;
                        iArr[i4] = iArr[i4] + 1;
                    } else {
                        a.a("smellGridnMAX exhausted, food");
                    }
                }
                int i6 = ((int) (((((double) food.a) + this.e.k) / (2.0d * this.e.k)) * ((double) this.Z))) + 1 + ((((int) (((this.e.k + ((double) food.b)) / (2.0d * this.e.k)) * ((double) this.Z))) + 1) * (this.Z + 2));
                if (i6 < 0 || i6 >= this.aW.length) {
                    a.b("x:" + food.a + " y:" + food.b + " r:" + this.e.k);
                    throw new RuntimeException("sadfae");
                }
                boolean z2 = false;
                float f4 = f3;
                float f5 = f2;
                i2 = i3;
                int i7 = 0;
                while (i7 < this.aW[i6]) {
                    Cell cell = this.x[this.aV[i6][i7]];
                    double d3 = ((cell.c - ((double) food.b)) * (cell.c - ((double) food.b))) + ((cell.b - ((double) food.a)) * (cell.b - ((double) food.a)));
                    if (d3 < (cell.d + 0.007000000216066837d) * (cell.d + 0.007000000216066837d)) {
                        h hVar = cell.I[cell.D].s;
                        if (this.e.y) {
                            if (hVar == h.CILIOCYTE) {
                                double sqrt = Math.sqrt(d3);
                                double d4 = (((double) food.a) - cell.b) / sqrt;
                                double d5 = (((double) food.b) - cell.c) / sqrt;
                                double cos = (Math.cos(cell.k) * d5) - (Math.sin(cell.k) * d4);
                                if ((0.0d < cos) != cell.y) {
                                    a2 = cos * 0.075d * ((double) cell.a(2, 0));
                                } else {
                                    a2 = cos * 0.075d * ((double) cell.a(4, 0));
                                }
                                double d6 = (((a2 - ((((double) food.d) - cell.e) * d5)) + ((((double) food.e) - cell.f) * d4)) - (cell.l * cell.d)) * 40.0d;
                                f5 = (float) (((double) f5) + (((-0.12d * d4) + (d5 * d6)) * d2));
                                f4 = (float) ((((d5 * -0.12d) - (d6 * d4)) * d2) + ((double) f4));
                            }
                            if (d3 < cell.d * cell.d) {
                                double sqrt2 = Math.sqrt(d3);
                                double d7 = ((500.0d * (cell.d - sqrt2)) * 3.0d) / sqrt2;
                                f5 = (float) (((((double) food.a) - cell.b) * d7 * d2) + ((double) f5));
                                f4 = (float) ((d7 * (((double) food.b) - cell.c) * d2) + ((double) f4));
                            }
                        }
                        if (hVar == h.SECROCYTE && cell.b(4) == 2) {
                            food.f = (float) (((double) food.f) - d2);
                        }
                        if (food.f <= 0.0f && hVar == h.PHAGOCYTE) {
                            double min = Math.min((double) food.c, 0.36d - cell.w);
                            double d8 = 1.0d * d2;
                            if (d8 < min) {
                                cell.e *= cell.w;
                                cell.f *= cell.w;
                                cell.w += d8;
                                cell.e /= cell.w;
                                cell.f /= cell.w;
                                food.c = (float) (((double) food.c) - d8);
                            } else {
                                cell.e *= cell.w;
                                cell.f *= cell.w;
                                cell.w += min;
                                cell.e /= cell.w;
                                cell.f /= cell.w;
                                food.c = (float) (((double) food.c) - min);
                                if (((double) food.c) <= 0.0d) {
                                    food.a(this.A[this.B - 1]);
                                    this.B--;
                                    i2--;
                                    i7 = this.aW[i6];
                                    z2 = true;
                                }
                            }
                        }
                    }
                    i7++;
                }
                if (!z2 && this.e.y) {
                    float f6 = (float) (((double) f5) - (((0.2d * ((double) food.d)) * this.e.g) * d2));
                    float f7 = (float) (((double) f4) - (((0.2d * ((double) food.e)) * this.e.g) * d2));
                    food.a = (float) (((double) food.a) + (((double) f6) * d2));
                    food.b = (float) (((double) food.b) + (((double) f7) * d2));
                    if (((double) ((food.a * food.a) + (food.b * food.b))) >= this.e.k * this.e.k) {
                        if (this.e.x) {
                            food.a(this.A[this.B - 1]);
                            this.B--;
                            i2--;
                        } else {
                            float sqrt3 = (float) Math.sqrt((double) ((food.a * food.a) + (food.b * food.b)));
                            food.a = (((float) this.e.k) * food.a) / sqrt3;
                            food.b = (((float) this.e.k) * food.b) / sqrt3;
                            float f8 = (2.0f * ((food.a * f6) + (food.b * f7))) / (sqrt3 * sqrt3);
                            f6 -= food.a * f8;
                            f7 -= f8 * food.b;
                        }
                    }
                    food.d = f6;
                    food.e = f7;
                }
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v5, resolved type: com.saterskog.cell_lab.h} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v163, resolved type: float} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v164, resolved type: com.saterskog.cell_lab.h} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v165, resolved type: com.saterskog.cell_lab.h} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:190:0x0b4f  */
    /* JADX WARNING: Removed duplicated region for block: B:202:0x0bb6 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void e(double r44) {
        /*
            r43 = this;
            r2 = 0
        L_0x0001:
            r0 = r43
            int r3 = r0.z
            if (r2 >= r3) goto L_0x0bba
            r0 = r43
            com.saterskog.cell_lab.Cell[] r3 = r0.x
            r18 = r3[r2]
            r0 = r18
            double r4 = r0.w
            r0 = r18
            com.saterskog.cell_lab.Gene[] r3 = r0.I
            r0 = r18
            int r6 = r0.D
            r3 = r3[r6]
            com.saterskog.cell_lab.h r3 = r3.s
            com.saterskog.cell_lab.h r6 = com.saterskog.cell_lab.h.LIPOCYTE
            if (r3 != r6) goto L_0x0043
            r4 = 4589852567433895739(0x3fb26e978d4fdf3b, double:0.072)
            r0 = r18
            double r6 = r0.w
            r0 = r18
            float r3 = r0.S
            double r8 = (double) r3
            double r6 = r6 + r8
            r8 = 4589852567433895739(0x3fb26e978d4fdf3b, double:0.072)
            double r6 = r6 - r8
            r8 = 4611884176810992206(0x4000b4395810624e, double:2.088)
            double r6 = r6 / r8
            r8 = 4598859766688636731(0x3fd26e978d4fdf3b, double:0.288)
            double r6 = r6 * r8
            double r4 = r4 + r6
        L_0x0043:
            r0 = r18
            r40 = r3
            com.saterskog.cell_lab.Gene[] r3 = r0.I
            int r6 = r0.D
            r3 = r3[r6]
            int[] r9 = r3.u
            r1 = 11
            r9 = r9[r1]
            r3 = r40
            r1 = 20
            if (r9 < r1) goto L_0x005a
            goto L_0x007c
        L_0x005a:
            java.lang.String r6 = "Enzyme Debugger"
            java.lang.String r1 = "v9 < 20, checking split count..."
            android.util.Log.d(r6, r1)
            r0 = r18
            int r1 = r0.enzyme_splitCount
            int r9 = r9 + 1
            if (r1 >= r9) goto L_0x006a
            goto L_0x007c
        L_0x006a:
            java.lang.String r6 = "Enzyme Debugger"
            java.lang.String r0 = "Split count reached:"
            android.util.Log.d(r6, r0)
            java.lang.String r6 = "Enzyme Debugger"
            java.lang.String r1 = java.lang.String.valueOf(r1)
            android.util.Log.d(r6, r1)
            goto L_0x0b22
        L_0x007c:
            r0 = r18
            com.saterskog.cell_lab.Gene[] r3 = r0.I
            r0 = r18
            int r6 = r0.D
            r3 = r3[r6]
            float r3 = r3.b
            double r6 = (double) r3
            int r3 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r3 <= 0) goto L_0x0b22
            r0 = r18
            double r4 = r0.o
            r6 = 4602678819172646912(0x3fe0000000000000, double:0.5)
            int r3 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r3 <= 0) goto L_0x0b22
            r0 = r18
            int r3 = r0.P
            r0 = r18
            com.saterskog.cell_lab.Gene[] r4 = r0.I
            r0 = r18
            int r5 = r0.D
            r4 = r4[r5]
            int[] r4 = r4.u
            r5 = 9
            r4 = r4[r5]
            if (r3 > r4) goto L_0x0b22
            r0 = r18
            double r4 = r0.p
            r6 = 4596373779694328218(0x3fc999999999999a, double:0.2)
            int r3 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r3 <= 0) goto L_0x0b22
            r0 = r18
            boolean r3 = r0.x
            if (r3 != 0) goto L_0x0b22
            r0 = r18
            com.saterskog.cell_lab.Gene[] r3 = r0.I
            r0 = r18
            int r4 = r0.D
            r3 = r3[r4]
            com.saterskog.cell_lab.h r3 = r3.s
            com.saterskog.cell_lab.h r4 = com.saterskog.cell_lab.h.GAMETE
            if (r3 == r4) goto L_0x0b22
            r3 = 0
            r0 = r43
            boolean r3 = r0.a((com.saterskog.cell_lab.Cell) r3)
            if (r3 == 0) goto L_0x0b22
            r0 = r43
            int r3 = r0.S
            int r3 = r3 + 1
            r0 = r43
            r0.S = r3
            r0 = r43
            com.saterskog.cell_lab.Cell[] r3 = r0.x
            r0 = r43
            int r4 = r0.z
            int r4 = r4 + -1
            r19 = r3[r4]
            r0 = r43
            boolean r3 = r0.bg
            if (r3 != 0) goto L_0x0127
            r0 = r43
            boolean r3 = r0.I
            if (r3 == 0) goto L_0x0127
            r0 = r18
            double r4 = r0.b
            float r3 = (float) r4
            r0 = r43
            float r4 = r0.F
            float r3 = r3 - r4
            r0 = r18
            double r4 = r0.c
            float r4 = (float) r4
            r0 = r43
            float r5 = r0.G
            float r4 = r4 - r5
            float r3 = r3 * r3
            float r4 = r4 * r4
            float r3 = r3 + r4
            r0 = r43
            float r4 = r0.H
            r5 = 0
            int r4 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r4 < 0) goto L_0x0123
            r0 = r43
            float r4 = r0.H
            int r4 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
            if (r4 >= 0) goto L_0x0127
        L_0x0123:
            r0 = r43
            r0.H = r3
        L_0x0127:
            r3 = 0
            r0 = r18
            r0.O = r3
            r3 = 0
            r0 = r19
            r0.O = r3
            r0 = r18
            int r1 = r0.enzyme_splitCount
            r0 = r18
            int r1 = r0.enzyme_splitCount
            int r1 = r1 + 1
            r0.enzyme_splitCount = r1
            r3 = 0
            r0 = r19
            r0.B = r3
            r0 = r19
            r1 = r18
            r0.a((com.saterskog.cell_lab.Cell) r1)
            r1 = 0
            r0.enzyme_splitCount = r1
            r1 = r18
            r3 = 0
            r0 = r19
            r0.F = r3
            r0 = r18
            double r0 = r0.k
            r20 = r0
            r0 = r18
            com.saterskog.cell_lab.Gene[] r3 = r0.I
            r0 = r18
            int r4 = r0.D
            r3 = r3[r4]
            float r3 = r3.d
            double r6 = (double) r3
            r0 = r18
            boolean r3 = r0.y
            if (r3 == 0) goto L_0x035e
            r4 = -4616189618054758400(0xbff0000000000000, double:-1.0)
        L_0x016f:
            double r4 = r4 * r6
            double r22 = r20 + r4
            r0 = r18
            double r4 = r0.d
            r6 = 4587366580439587226(0x3fa999999999999a, double:0.05)
            double r4 = r4 * r6
            r6 = 4611686018427387904(0x4000000000000000, double:2.0)
            double r4 = r4 * r6
            double r24 = java.lang.Math.cos(r22)
            double r26 = java.lang.Math.sin(r22)
            r0 = r18
            double r6 = r0.e
            r8 = 0
            double r8 = r8 * r24
            double r6 = r6 - r8
            r0 = r18
            r0.e = r6
            r0 = r18
            double r6 = r0.f
            r8 = 0
            double r8 = r8 * r26
            double r6 = r6 - r8
            r0 = r18
            r0.f = r6
            r0 = r18
            double r6 = r0.b
            double r8 = r24 * r4
            r0 = r43
            int r3 = r0.z
            double r10 = (double) r3
            r12 = 4622010520573134766(0x4024ae147ae147ae, double:10.34)
            double r10 = r10 * r12
            r12 = 4631248529308778496(0x4045800000000000, double:43.0)
            double r10 = r10 + r12
            double r10 = java.lang.Math.sin(r10)
            r12 = 4502148214488346440(0x3e7ad7f29abcaf48, double:1.0E-7)
            double r10 = r10 * r12
            double r8 = r8 + r10
            double r6 = r6 - r8
            r0 = r18
            r0.b = r6
            r0 = r18
            double r6 = r0.c
            double r8 = r26 * r4
            r0 = r43
            int r3 = r0.z
            double r10 = (double) r3
            r12 = 4625573993778291671(0x4031570a3d70a3d7, double:17.34)
            double r10 = r10 * r12
            r12 = 4639024275540410368(0x4061200000000000, double:137.0)
            double r10 = r10 + r12
            double r10 = java.lang.Math.sin(r10)
            r12 = 4502148214488346440(0x3e7ad7f29abcaf48, double:1.0E-7)
            double r10 = r10 * r12
            double r8 = r8 + r10
            double r6 = r6 - r8
            r0 = r18
            r0.c = r6
            r0 = r19
            double r6 = r0.e
            r8 = 0
            double r8 = r8 * r24
            double r6 = r6 + r8
            r0 = r19
            r0.e = r6
            r0 = r19
            double r6 = r0.f
            r8 = 0
            double r8 = r8 * r26
            double r6 = r6 + r8
            r0 = r19
            r0.f = r6
            r0 = r19
            double r6 = r0.b
            double r8 = r24 * r4
            r0 = r43
            int r3 = r0.z
            double r10 = (double) r3
            r12 = 4623136420479977390(0x4028ae147ae147ae, double:12.34)
            double r10 = r10 * r12
            r12 = 4623733147430603981(0x402acccccccccccd, double:13.4)
            double r10 = r10 + r12
            double r10 = java.lang.Math.sin(r10)
            r12 = 4502148214488346440(0x3e7ad7f29abcaf48, double:1.0E-7)
            double r10 = r10 * r12
            double r8 = r8 + r10
            double r6 = r6 + r8
            r0 = r19
            r0.b = r6
            r0 = r19
            double r6 = r0.c
            double r4 = r4 * r26
            r0 = r43
            int r3 = r0.z
            double r8 = (double) r3
            r10 = 4626136943731712983(0x4033570a3d70a3d7, double:19.34)
            double r8 = r8 * r10
            r10 = 4634063279075885056(0x404f800000000000, double:63.0)
            double r8 = r8 + r10
            double r8 = java.lang.Math.sin(r8)
            r10 = 4502148214488346440(0x3e7ad7f29abcaf48, double:1.0E-7)
            double r8 = r8 * r10
            double r4 = r4 + r8
            double r4 = r4 + r6
            r0 = r19
            r0.c = r4
            r0 = r18
            double r4 = r0.w
            r0 = r18
            com.saterskog.cell_lab.Gene[] r3 = r0.I
            r0 = r18
            int r6 = r0.D
            r3 = r3[r6]
            com.saterskog.cell_lab.h r3 = r3.s
            com.saterskog.cell_lab.h r6 = com.saterskog.cell_lab.h.LIPOCYTE
            if (r3 != r6) goto L_0x0271
            r0 = r18
            float r3 = r0.S
            double r6 = (double) r3
            double r4 = r4 + r6
        L_0x0271:
            r0 = r18
            com.saterskog.cell_lab.Gene[] r3 = r0.I
            r0 = r18
            int r6 = r0.D
            r3 = r3[r6]
            float r3 = r3.c
            double r6 = (double) r3
            double r6 = r6 * r4
            r0 = r18
            com.saterskog.cell_lab.Gene[] r3 = r0.I
            r0 = r18
            com.saterskog.cell_lab.Gene[] r8 = r0.I
            r0 = r18
            int r9 = r0.D
            r8 = r8[r9]
            int r8 = r8.j
            r3 = r3[r8]
            com.saterskog.cell_lab.h r3 = r3.s
            double r8 = r3.v
            double r6 = r6 - r8
            r0 = r19
            r0.w = r6
            r3 = 1065353216(0x3f800000, float:1.0)
            r0 = r18
            com.saterskog.cell_lab.Gene[] r6 = r0.I
            r0 = r18
            int r7 = r0.D
            r6 = r6[r7]
            float r6 = r6.c
            float r3 = r3 - r6
            double r6 = (double) r3
            double r4 = r4 * r6
            r0 = r18
            com.saterskog.cell_lab.Gene[] r3 = r0.I
            r0 = r18
            com.saterskog.cell_lab.Gene[] r6 = r0.I
            r0 = r18
            int r7 = r0.D
            r6 = r6[r7]
            int r6 = r6.i
            r3 = r3[r6]
            com.saterskog.cell_lab.h r3 = r3.s
            double r6 = r3.v
            double r4 = r4 - r6
            r0 = r18
            r0.w = r4
            r0 = r18
            double r4 = r0.w
            r3 = 0
            r0 = r18
            com.saterskog.cell_lab.Gene[] r6 = r0.I
            r0 = r18
            com.saterskog.cell_lab.Gene[] r7 = r0.I
            r0 = r18
            int r8 = r0.D
            r7 = r7[r8]
            int r7 = r7.i
            r6 = r6[r7]
            float[] r6 = r6.v
            r7 = 6
            r6 = r6[r7]
            r7 = 1065353216(0x3f800000, float:1.0)
            float r6 = r6 - r7
            float r3 = java.lang.Math.max(r3, r6)
            r6 = 1029517084(0x3d5d2f1c, float:0.054000005)
            float r3 = r3 * r6
            double r6 = (double) r3
            double r4 = r4 - r6
            r0 = r18
            r0.w = r4
            r0 = r19
            double r4 = r0.w
            r3 = 0
            r0 = r18
            com.saterskog.cell_lab.Gene[] r6 = r0.I
            r0 = r18
            com.saterskog.cell_lab.Gene[] r7 = r0.I
            r0 = r18
            int r8 = r0.D
            r7 = r7[r8]
            int r7 = r7.j
            r6 = r6[r7]
            float[] r6 = r6.v
            r7 = 6
            r6 = r6[r7]
            r7 = 1065353216(0x3f800000, float:1.0)
            float r6 = r6 - r7
            float r3 = java.lang.Math.max(r3, r6)
            r6 = 1029517084(0x3d5d2f1c, float:0.054000005)
            float r3 = r3 * r6
            double r6 = (double) r3
            double r4 = r4 - r6
            r0 = r19
            r0.w = r4
            r3 = 0
        L_0x0321:
            r4 = 4
            if (r3 >= r4) goto L_0x0362
            r0 = r18
            float[] r4 = r0.U
            r4 = r4[r3]
            r0 = r18
            float[] r5 = r0.U
            r0 = r18
            com.saterskog.cell_lab.Gene[] r6 = r0.I
            r0 = r18
            int r7 = r0.D
            r6 = r6[r7]
            float r6 = r6.c
            float r6 = r6 * r4
            r7 = 953267991(0x38d1b717, float:1.0E-4)
            float r6 = r6 + r7
            r5[r3] = r6
            r0 = r19
            float[] r5 = r0.U
            r6 = 1065353216(0x3f800000, float:1.0)
            r0 = r18
            com.saterskog.cell_lab.Gene[] r7 = r0.I
            r0 = r18
            int r8 = r0.D
            r7 = r7[r8]
            float r7 = r7.c
            float r6 = r6 - r7
            float r4 = r4 * r6
            r6 = 953267991(0x38d1b717, float:1.0E-4)
            float r4 = r4 + r6
            r5[r3] = r4
            int r3 = r3 + 1
            goto L_0x0321
        L_0x035e:
            r4 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            goto L_0x016f
        L_0x0362:
            r3 = 0
            r0 = r18
            r0.S = r3
            r3 = 0
            r0 = r19
            r0.S = r3
            r0 = r18
            float r3 = r0.X
            r4 = 1065353216(0x3f800000, float:1.0)
            r0 = r18
            com.saterskog.cell_lab.Gene[] r5 = r0.I
            r0 = r18
            int r6 = r0.D
            r5 = r5[r6]
            float r5 = r5.c
            float r4 = r4 - r5
            float r3 = r3 * r4
            r0 = r19
            r0.X = r3
            r0 = r18
            float r3 = r0.X
            r0 = r18
            com.saterskog.cell_lab.Gene[] r4 = r0.I
            r0 = r18
            int r5 = r0.D
            r4 = r4[r5]
            float r4 = r4.c
            float r3 = r3 * r4
            r0 = r18
            r0.X = r3
            r0 = r18
            float r3 = r0.Y
            r4 = 1065353216(0x3f800000, float:1.0)
            r0 = r18
            com.saterskog.cell_lab.Gene[] r5 = r0.I
            r0 = r18
            int r6 = r0.D
            r5 = r5[r6]
            float r5 = r5.c
            float r4 = r4 - r5
            float r3 = r3 * r4
            r0 = r19
            r0.Y = r3
            r0 = r18
            float r3 = r0.Y
            r0 = r18
            com.saterskog.cell_lab.Gene[] r4 = r0.I
            r0 = r18
            int r5 = r0.D
            r4 = r4[r5]
            float r4 = r4.c
            float r3 = r3 * r4
            r0 = r18
            r0.Y = r3
            r4 = 4602678819172646912(0x3fe0000000000000, double:0.5)
            r0 = r18
            double r6 = r0.p
            double r4 = r4 * r6
            r0 = r19
            r0.p = r4
            r4 = 4602678819172646912(0x3fe0000000000000, double:0.5)
            r0 = r18
            double r6 = r0.p
            double r4 = r4 * r6
            r0 = r18
            r0.p = r4
            r4 = 0
            r0 = r19
            r0.o = r4
            r4 = 0
            r0 = r18
            r0.o = r4
            r0 = r18
            com.saterskog.cell_lab.Gene[] r3 = r0.I
            r0 = r18
            int r4 = r0.D
            r3 = r3[r4]
            float r3 = r3.e
            double r6 = (double) r3
            r0 = r18
            boolean r3 = r0.y
            if (r3 == 0) goto L_0x04ff
            r4 = -4616189618054758400(0xbff0000000000000, double:-1.0)
        L_0x03fd:
            double r4 = r4 * r6
            double r4 = r4 + r22
            r0 = r18
            r0.k = r4
            r0 = r18
            com.saterskog.cell_lab.Gene[] r3 = r0.I
            r0 = r18
            int r4 = r0.D
            r3 = r3[r4]
            float r3 = r3.f
            double r6 = (double) r3
            r0 = r18
            boolean r3 = r0.y
            if (r3 == 0) goto L_0x0503
            r4 = -4616189618054758400(0xbff0000000000000, double:-1.0)
        L_0x0419:
            double r4 = r4 * r6
            double r4 = r4 + r22
            r0 = r19
            r0.k = r4
            r0 = r18
            boolean r3 = r0.y
            r0 = r18
            com.saterskog.cell_lab.Gene[] r4 = r0.I
            r0 = r18
            int r5 = r0.D
            r4 = r4[r5]
            boolean r4 = r4.r
            if (r3 == r4) goto L_0x0507
            r3 = 1
        L_0x0433:
            r0 = r19
            r0.y = r3
            r0 = r18
            boolean r3 = r0.y
            r0 = r18
            com.saterskog.cell_lab.Gene[] r4 = r0.I
            r0 = r18
            int r5 = r0.D
            r4 = r4[r5]
            boolean r4 = r4.q
            if (r3 == r4) goto L_0x050a
            r3 = 1
        L_0x044a:
            r0 = r18
            r0.y = r3
            r0 = r18
            double r4 = r0.m
            r6 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            double r4 = r4 + r6
            r0 = r18
            r0.m = r4
            r0 = r19
            double r4 = r0.m
            r6 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            double r4 = r4 - r6
            r0 = r19
            r0.m = r4
            r3 = 0
        L_0x0465:
            r0 = r18
            int r4 = r0.C
            if (r3 >= r4) goto L_0x0511
            r0 = r18
            com.saterskog.cell_lab.Link[] r4 = r0.H
            r4 = r4[r3]
            int r4 = r4.a
            r5 = -1
            if (r4 == r5) goto L_0x04ec
            r4 = 0
        L_0x0477:
            r0 = r43
            com.saterskog.cell_lab.Cell[] r5 = r0.x
            r0 = r18
            com.saterskog.cell_lab.Link[] r6 = r0.H
            r6 = r6[r3]
            int r6 = r6.a
            r5 = r5[r6]
            int r5 = r5.C
            if (r4 >= r5) goto L_0x04ec
            r0 = r43
            com.saterskog.cell_lab.Cell[] r5 = r0.x
            r0 = r18
            com.saterskog.cell_lab.Link[] r6 = r0.H
            r6 = r6[r3]
            int r6 = r6.a
            r5 = r5[r6]
            com.saterskog.cell_lab.Link[] r5 = r5.H
            r5 = r5[r4]
            int r5 = r5.a
            if (r5 != r2) goto L_0x050d
            r0 = r43
            com.saterskog.cell_lab.Cell[] r5 = r0.x
            r0 = r18
            com.saterskog.cell_lab.Link[] r6 = r0.H
            r6 = r6[r3]
            int r6 = r6.a
            r5 = r5[r6]
            com.saterskog.cell_lab.Link[] r5 = r5.H
            r4 = r5[r4]
            r0 = r43
            com.saterskog.cell_lab.Cell[] r5 = r0.x
            r0 = r18
            com.saterskog.cell_lab.Link[] r6 = r0.H
            r6 = r6[r3]
            int r6 = r6.a
            r5 = r5[r6]
            com.saterskog.cell_lab.Link[] r5 = r5.H
            r0 = r43
            com.saterskog.cell_lab.Cell[] r6 = r0.x
            r0 = r18
            com.saterskog.cell_lab.Link[] r7 = r0.H
            r7 = r7[r3]
            int r7 = r7.a
            r6 = r6[r7]
            int r6 = r6.C
            int r6 = r6 + -1
            r5 = r5[r6]
            r4.a(r5)
            r0 = r43
            com.saterskog.cell_lab.Cell[] r4 = r0.x
            r0 = r18
            com.saterskog.cell_lab.Link[] r5 = r0.H
            r5 = r5[r3]
            int r5 = r5.a
            r4 = r4[r5]
            int r5 = r4.C
            int r5 = r5 + -1
            r4.C = r5
        L_0x04ec:
            r0 = r43
            com.saterskog.cell_lab.Link[] r4 = r0.J
            r4 = r4[r3]
            r0 = r18
            com.saterskog.cell_lab.Link[] r5 = r0.H
            r5 = r5[r3]
            r4.a(r5)
            int r3 = r3 + 1
            goto L_0x0465
        L_0x04ff:
            r4 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            goto L_0x03fd
        L_0x0503:
            r4 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            goto L_0x0419
        L_0x0507:
            r3 = 0
            goto L_0x0433
        L_0x050a:
            r3 = 0
            goto L_0x044a
        L_0x050d:
            int r4 = r4 + 1
            goto L_0x0477
        L_0x0511:
            r0 = r18
            int r0 = r0.C
            r28 = r0
            r3 = 0
            r0 = r18
            r0.C = r3
            r3 = 0
            r0 = r19
            r0.C = r3
            r3 = 0
            r0 = r18
            r0.x = r3
            r3 = 0
            r0 = r19
            r0.x = r3
            r0 = r18
            int r3 = r0.T
            r4 = -1
            if (r3 == r4) goto L_0x0556
            r0 = r18
            int r3 = r0.T
            int r3 = r3 + -1
            r0 = r18
            r0.T = r3
            r0 = r19
            int r3 = r0.T
            int r3 = r3 + -1
            r0 = r19
            r0.T = r3
            r0 = r18
            int r3 = r0.T
            if (r3 > 0) goto L_0x0556
            r3 = 1
            r0 = r18
            r0.x = r3
            r3 = 1
            r0 = r19
            r0.x = r3
        L_0x0556:
            r3 = -1
            r4 = -4616189618054758400(0xbff0000000000000, double:-1.0)
            r8 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            r0 = r18
            com.saterskog.cell_lab.Gene[] r6 = r0.I
            r0 = r18
            int r7 = r0.D
            r6 = r6[r7]
            boolean r6 = r6.m
            if (r6 != 0) goto L_0x0577
            r0 = r18
            com.saterskog.cell_lab.Gene[] r6 = r0.I
            r0 = r18
            int r7 = r0.D
            r6 = r6[r7]
            boolean r6 = r6.n
            if (r6 == 0) goto L_0x094f
        L_0x0577:
            r14 = 0
            r10 = r8
            r12 = r4
            r15 = r3
            r16 = r3
            r17 = r3
        L_0x057f:
            r0 = r28
            if (r14 >= r0) goto L_0x0664
            r0 = r43
            com.saterskog.cell_lab.Link[] r6 = r0.J
            r6 = r6[r14]
            int r6 = r6.a
            r7 = -1
            if (r6 == r7) goto L_0x0bbb
            r0 = r43
            com.saterskog.cell_lab.Link[] r6 = r0.J
            r6 = r6[r14]
            double r6 = r6.c
            double r6 = r6 + r20
            double r30 = java.lang.Math.cos(r6)
            r0 = r43
            com.saterskog.cell_lab.Link[] r6 = r0.J
            r6 = r6[r14]
            double r6 = r6.c
            double r6 = r6 + r20
            double r32 = java.lang.Math.sin(r6)
            double r6 = r24 * r30
            double r34 = r26 * r32
            double r6 = r6 + r34
            r34 = 4611686018427387904(0x4000000000000000, double:2.0)
            r36 = 4602678819172646912(0x3fe0000000000000, double:0.5)
            com.saterskog.cell_lab.Gene r29 = r18.b()
            r0 = r29
            float r0 = r0.c
            r29 = r0
            r0 = r29
            double r0 = (double) r0
            r38 = r0
            double r36 = r36 - r38
            double r34 = r34 * r36
            double r6 = r6 - r34
            r34 = 4596373779694328218(0x3fc999999999999a, double:0.2)
            int r29 = (r6 > r34 ? 1 : (r6 == r34 ? 0 : -1))
            if (r29 > 0) goto L_0x0bbb
            r34 = -4626998257160447590(0xbfc999999999999a, double:-0.2)
            int r6 = (r6 > r34 ? 1 : (r6 == r34 ? 0 : -1))
            if (r6 < 0) goto L_0x0bbb
            r0 = r43
            com.saterskog.cell_lab.Cell[] r6 = r0.x
            r0 = r43
            com.saterskog.cell_lab.Link[] r7 = r0.J
            r7 = r7[r14]
            int r7 = r7.a
            r6 = r6[r7]
            double r6 = r6.b
            r0 = r18
            double r0 = r0.b
            r34 = r0
            double r6 = r6 - r34
            double r6 = r6 * r24
            r0 = r43
            com.saterskog.cell_lab.Cell[] r0 = r0.x
            r29 = r0
            r0 = r43
            com.saterskog.cell_lab.Link[] r0 = r0.J
            r34 = r0
            r34 = r34[r14]
            r0 = r34
            int r0 = r0.a
            r34 = r0
            r29 = r29[r34]
            r0 = r29
            double r0 = r0.c
            r34 = r0
            r0 = r18
            double r0 = r0.c
            r36 = r0
            double r34 = r34 - r36
            double r34 = r34 * r26
            double r6 = r6 + r34
            r0 = r26
            double r0 = -r0
            r34 = r0
            double r30 = r30 * r34
            double r32 = r32 * r24
            double r30 = r30 + r32
            r32 = 0
            int r29 = (r30 > r32 ? 1 : (r30 == r32 ? 0 : -1))
            if (r29 <= 0) goto L_0x064f
            int r29 = (r6 > r12 ? 1 : (r6 == r12 ? 0 : -1))
            if (r29 <= 0) goto L_0x0635
            r12 = r6
            r17 = r14
        L_0x0635:
            int r29 = (r6 > r10 ? 1 : (r6 == r10 ? 0 : -1))
            if (r29 >= 0) goto L_0x0bbb
            r10 = r12
            r12 = r15
            r13 = r14
            r15 = r17
            r40 = r8
            r8 = r6
            r6 = r40
        L_0x0643:
            int r14 = r14 + 1
            r16 = r13
            r17 = r15
            r15 = r12
            r12 = r10
            r10 = r8
            r8 = r6
            goto L_0x057f
        L_0x064f:
            int r29 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r29 >= 0) goto L_0x0655
            r8 = r6
            r15 = r14
        L_0x0655:
            int r29 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r29 <= 0) goto L_0x0bbb
            r4 = r6
            r3 = r14
            r6 = r8
            r8 = r10
            r10 = r12
            r12 = r15
            r13 = r16
            r15 = r17
            goto L_0x0643
        L_0x0664:
            r4 = 0
        L_0x0665:
            r0 = r28
            if (r4 >= r0) goto L_0x094f
            r0 = r43
            com.saterskog.cell_lab.Link[] r5 = r0.J
            r5 = r5[r4]
            int r5 = r5.a
            r6 = -1
            if (r5 == r6) goto L_0x094b
            r0 = r43
            com.saterskog.cell_lab.Link[] r5 = r0.J
            r5 = r5[r4]
            double r6 = r5.c
            double r6 = r6 + r20
            double r6 = java.lang.Math.cos(r6)
            double r6 = r6 * r24
            r0 = r43
            com.saterskog.cell_lab.Link[] r5 = r0.J
            r5 = r5[r4]
            double r8 = r5.c
            double r8 = r8 + r20
            double r8 = java.lang.Math.sin(r8)
            double r8 = r8 * r26
            double r6 = r6 + r8
            r8 = 4611686018427387904(0x4000000000000000, double:2.0)
            r10 = 4602678819172646912(0x3fe0000000000000, double:0.5)
            com.saterskog.cell_lab.Gene r5 = r18.b()
            float r5 = r5.c
            double r12 = (double) r5
            double r10 = r10 - r12
            double r8 = r8 * r10
            double r6 = r6 - r8
            r0 = r18
            com.saterskog.cell_lab.Gene[] r5 = r0.I
            r0 = r18
            int r8 = r0.D
            r5 = r5[r8]
            boolean r5 = r5.n
            if (r5 == 0) goto L_0x07fa
            r8 = 4596373779694328218(0x3fc999999999999a, double:0.2)
            int r5 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r5 > 0) goto L_0x06c9
            r8 = -4626998257160447590(0xbfc999999999999a, double:-0.2)
            int r5 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r5 <= 0) goto L_0x07fa
            r0 = r17
            if (r4 == r0) goto L_0x06c9
            if (r4 != r3) goto L_0x07fa
        L_0x06c9:
            r0 = r19
            int r5 = r0.C
            r8 = 20
            if (r5 >= r8) goto L_0x07fa
            r0 = r43
            com.saterskog.cell_lab.Cell[] r5 = r0.x
            r0 = r43
            com.saterskog.cell_lab.Link[] r8 = r0.J
            r8 = r8[r4]
            int r8 = r8.a
            r5 = r5[r8]
            int r5 = r5.C
            r8 = 20
            if (r5 >= r8) goto L_0x07fa
            r0 = r19
            com.saterskog.cell_lab.Link[] r5 = r0.H
            r0 = r19
            int r8 = r0.C
            r5 = r5[r8]
            r0 = r43
            com.saterskog.cell_lab.Link[] r8 = r0.J
            r8 = r8[r4]
            r5.a(r8)
            r0 = r19
            com.saterskog.cell_lab.Link[] r5 = r0.H
            r0 = r19
            int r8 = r0.C
            r5 = r5[r8]
            r0 = r43
            com.saterskog.cell_lab.Link[] r8 = r0.J
            r8 = r8[r4]
            double r8 = r8.c
            double r8 = r8 + r20
            r0 = r19
            double r10 = r0.k
            double r8 = r8 - r10
            r5.c = r8
            r0 = r19
            com.saterskog.cell_lab.Link[] r5 = r0.H
            r0 = r19
            int r8 = r0.C
            r5 = r5[r8]
            r0 = r43
            com.saterskog.cell_lab.Link[] r8 = r0.J
            r8 = r8[r4]
            double r8 = r8.d
            r5.d = r8
            r0 = r43
            com.saterskog.cell_lab.Cell[] r5 = r0.x
            r0 = r43
            com.saterskog.cell_lab.Link[] r8 = r0.J
            r8 = r8[r4]
            int r8 = r8.a
            r5 = r5[r8]
            com.saterskog.cell_lab.Link[] r5 = r5.H
            r0 = r43
            com.saterskog.cell_lab.Cell[] r8 = r0.x
            r0 = r43
            com.saterskog.cell_lab.Link[] r9 = r0.J
            r9 = r9[r4]
            int r9 = r9.a
            r8 = r8[r9]
            int r8 = r8.C
            r5 = r5[r8]
            r0 = r43
            com.saterskog.cell_lab.Link[] r8 = r0.J
            r8 = r8[r4]
            r5.a(r8)
            r0 = r43
            com.saterskog.cell_lab.Cell[] r5 = r0.x
            r0 = r43
            com.saterskog.cell_lab.Link[] r8 = r0.J
            r8 = r8[r4]
            int r8 = r8.a
            r5 = r5[r8]
            com.saterskog.cell_lab.Link[] r5 = r5.H
            r0 = r43
            com.saterskog.cell_lab.Cell[] r8 = r0.x
            r0 = r43
            com.saterskog.cell_lab.Link[] r9 = r0.J
            r9 = r9[r4]
            int r9 = r9.a
            r8 = r8[r9]
            int r8 = r8.C
            r5 = r5[r8]
            r0 = r43
            int r8 = r0.z
            int r8 = r8 + -1
            r5.a = r8
            r0 = r43
            com.saterskog.cell_lab.Cell[] r5 = r0.x
            r0 = r43
            com.saterskog.cell_lab.Link[] r8 = r0.J
            r8 = r8[r4]
            int r8 = r8.a
            r5 = r5[r8]
            com.saterskog.cell_lab.Link[] r5 = r5.H
            r0 = r43
            com.saterskog.cell_lab.Cell[] r8 = r0.x
            r0 = r43
            com.saterskog.cell_lab.Link[] r9 = r0.J
            r9 = r9[r4]
            int r9 = r9.a
            r8 = r8[r9]
            int r8 = r8.C
            r5 = r5[r8]
            r0 = r19
            com.saterskog.cell_lab.Link[] r8 = r0.H
            r0 = r19
            int r9 = r0.C
            r8 = r8[r9]
            double r8 = r8.d
            r5.c = r8
            r0 = r43
            com.saterskog.cell_lab.Cell[] r5 = r0.x
            r0 = r43
            com.saterskog.cell_lab.Link[] r8 = r0.J
            r8 = r8[r4]
            int r8 = r8.a
            r5 = r5[r8]
            com.saterskog.cell_lab.Link[] r5 = r5.H
            r0 = r43
            com.saterskog.cell_lab.Cell[] r8 = r0.x
            r0 = r43
            com.saterskog.cell_lab.Link[] r9 = r0.J
            r9 = r9[r4]
            int r9 = r9.a
            r8 = r8[r9]
            int r8 = r8.C
            r5 = r5[r8]
            r0 = r19
            com.saterskog.cell_lab.Link[] r8 = r0.H
            r0 = r19
            int r9 = r0.C
            r8 = r8[r9]
            double r8 = r8.c
            r5.d = r8
            r0 = r43
            com.saterskog.cell_lab.Cell[] r5 = r0.x
            r0 = r43
            com.saterskog.cell_lab.Link[] r8 = r0.J
            r8 = r8[r4]
            int r8 = r8.a
            r5 = r5[r8]
            int r8 = r5.C
            int r8 = r8 + 1
            r5.C = r8
            r0 = r19
            int r5 = r0.C
            int r5 = r5 + 1
            r0 = r19
            r0.C = r5
        L_0x07fa:
            r0 = r18
            com.saterskog.cell_lab.Gene[] r5 = r0.I
            r0 = r18
            int r8 = r0.D
            r5 = r5[r8]
            boolean r5 = r5.m
            if (r5 == 0) goto L_0x094b
            r8 = -4626998257160447590(0xbfc999999999999a, double:-0.2)
            int r5 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r5 < 0) goto L_0x0820
            r8 = 4596373779694328218(0x3fc999999999999a, double:0.2)
            int r5 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r5 >= 0) goto L_0x094b
            r0 = r16
            if (r4 == r0) goto L_0x0820
            if (r4 != r15) goto L_0x094b
        L_0x0820:
            r0 = r18
            int r5 = r0.C
            r6 = 20
            if (r5 >= r6) goto L_0x094b
            r0 = r43
            com.saterskog.cell_lab.Cell[] r5 = r0.x
            r0 = r43
            com.saterskog.cell_lab.Link[] r6 = r0.J
            r6 = r6[r4]
            int r6 = r6.a
            r5 = r5[r6]
            int r5 = r5.C
            r6 = 20
            if (r5 >= r6) goto L_0x094b
            r0 = r18
            com.saterskog.cell_lab.Link[] r5 = r0.H
            r0 = r18
            int r6 = r0.C
            r5 = r5[r6]
            r0 = r43
            com.saterskog.cell_lab.Link[] r6 = r0.J
            r6 = r6[r4]
            r5.a(r6)
            r0 = r18
            com.saterskog.cell_lab.Link[] r5 = r0.H
            r0 = r18
            int r6 = r0.C
            r5 = r5[r6]
            r0 = r43
            com.saterskog.cell_lab.Link[] r6 = r0.J
            r6 = r6[r4]
            double r6 = r6.c
            double r6 = r6 + r20
            r0 = r18
            double r8 = r0.k
            double r6 = r6 - r8
            r5.c = r6
            r0 = r18
            com.saterskog.cell_lab.Link[] r5 = r0.H
            r0 = r18
            int r6 = r0.C
            r5 = r5[r6]
            r0 = r43
            com.saterskog.cell_lab.Link[] r6 = r0.J
            r6 = r6[r4]
            double r6 = r6.d
            r5.d = r6
            r0 = r43
            com.saterskog.cell_lab.Cell[] r5 = r0.x
            r0 = r43
            com.saterskog.cell_lab.Link[] r6 = r0.J
            r6 = r6[r4]
            int r6 = r6.a
            r5 = r5[r6]
            com.saterskog.cell_lab.Link[] r5 = r5.H
            r0 = r43
            com.saterskog.cell_lab.Cell[] r6 = r0.x
            r0 = r43
            com.saterskog.cell_lab.Link[] r7 = r0.J
            r7 = r7[r4]
            int r7 = r7.a
            r6 = r6[r7]
            int r6 = r6.C
            r5 = r5[r6]
            r0 = r43
            com.saterskog.cell_lab.Link[] r6 = r0.J
            r6 = r6[r4]
            r5.a(r6)
            r0 = r43
            com.saterskog.cell_lab.Cell[] r5 = r0.x
            r0 = r43
            com.saterskog.cell_lab.Link[] r6 = r0.J
            r6 = r6[r4]
            int r6 = r6.a
            r5 = r5[r6]
            com.saterskog.cell_lab.Link[] r5 = r5.H
            r0 = r43
            com.saterskog.cell_lab.Cell[] r6 = r0.x
            r0 = r43
            com.saterskog.cell_lab.Link[] r7 = r0.J
            r7 = r7[r4]
            int r7 = r7.a
            r6 = r6[r7]
            int r6 = r6.C
            r5 = r5[r6]
            r5.a = r2
            r0 = r43
            com.saterskog.cell_lab.Cell[] r5 = r0.x
            r0 = r43
            com.saterskog.cell_lab.Link[] r6 = r0.J
            r6 = r6[r4]
            int r6 = r6.a
            r5 = r5[r6]
            com.saterskog.cell_lab.Link[] r5 = r5.H
            r0 = r43
            com.saterskog.cell_lab.Cell[] r6 = r0.x
            r0 = r43
            com.saterskog.cell_lab.Link[] r7 = r0.J
            r7 = r7[r4]
            int r7 = r7.a
            r6 = r6[r7]
            int r6 = r6.C
            r5 = r5[r6]
            r0 = r18
            com.saterskog.cell_lab.Link[] r6 = r0.H
            r0 = r18
            int r7 = r0.C
            r6 = r6[r7]
            double r6 = r6.d
            r5.c = r6
            r0 = r43
            com.saterskog.cell_lab.Cell[] r5 = r0.x
            r0 = r43
            com.saterskog.cell_lab.Link[] r6 = r0.J
            r6 = r6[r4]
            int r6 = r6.a
            r5 = r5[r6]
            com.saterskog.cell_lab.Link[] r5 = r5.H
            r0 = r43
            com.saterskog.cell_lab.Cell[] r6 = r0.x
            r0 = r43
            com.saterskog.cell_lab.Link[] r7 = r0.J
            r7 = r7[r4]
            int r7 = r7.a
            r6 = r6[r7]
            int r6 = r6.C
            r5 = r5[r6]
            r0 = r18
            com.saterskog.cell_lab.Link[] r6 = r0.H
            r0 = r18
            int r7 = r0.C
            r6 = r6[r7]
            double r6 = r6.c
            r5.d = r6
            r0 = r43
            com.saterskog.cell_lab.Cell[] r5 = r0.x
            r0 = r43
            com.saterskog.cell_lab.Link[] r6 = r0.J
            r6 = r6[r4]
            int r6 = r6.a
            r5 = r5[r6]
            int r6 = r5.C
            int r6 = r6 + 1
            r5.C = r6
            r0 = r18
            int r5 = r0.C
            int r5 = r5 + 1
            r0 = r18
            r0.C = r5
        L_0x094b:
            int r4 = r4 + 1
            goto L_0x0665
        L_0x094f:
            r0 = r18
            com.saterskog.cell_lab.Gene[] r3 = r0.I
            r0 = r18
            int r4 = r0.D
            r3 = r3[r4]
            boolean r3 = r3.l
            if (r3 == 0) goto L_0x09da
            r3 = 20
            r0 = r18
            int r4 = r0.C
            if (r3 <= r4) goto L_0x09da
            r3 = 20
            r0 = r19
            int r4 = r0.C
            if (r3 <= r4) goto L_0x09da
            r0 = r18
            com.saterskog.cell_lab.Link[] r3 = r0.H
            r0 = r18
            int r4 = r0.C
            r3 = r3[r4]
            r0 = r19
            com.saterskog.cell_lab.Link[] r4 = r0.H
            r0 = r19
            int r5 = r0.C
            r4 = r4[r5]
            r5 = 1
            r3.b = r5
            r5 = 1
            r4.b = r5
            r0 = r43
            int r5 = r0.z
            int r5 = r5 + -1
            r3.a = r5
            r4.a = r2
            r0 = r18
            double r6 = r0.k
            double r6 = r22 - r6
            r3.c = r6
            r4.d = r6
            r6 = 4614256656552045848(0x400921fb54442d18, double:3.141592653589793)
            double r6 = r6 + r22
            r0 = r19
            double r8 = r0.k
            double r6 = r6 - r8
            r4.c = r6
            r3.d = r6
            r0 = r18
            com.saterskog.cell_lab.Gene[] r5 = r0.I
            r0 = r18
            int r6 = r0.D
            r5 = r5[r6]
            float r5 = r5.h
            r3.k = r5
            r4.k = r5
            r5 = 5
            r0 = r18
            float r5 = r0.a((int) r5)
            r3.l = r5
            r4.l = r5
            r0 = r18
            int r3 = r0.C
            int r3 = r3 + 1
            r0 = r18
            r0.C = r3
            r0 = r19
            int r3 = r0.C
            int r3 = r3 + 1
            r0 = r19
            r0.C = r3
        L_0x09da:
            r0 = r18
            com.saterskog.cell_lab.Gene[] r3 = r0.I
            r0 = r18
            int r4 = r0.D
            r3 = r3[r4]
            int r3 = r3.j
            r0 = r19
            r0.D = r3
            r0 = r18
            com.saterskog.cell_lab.Gene[] r3 = r0.I
            r0 = r18
            int r4 = r0.D
            r3 = r3[r4]
            int r3 = r3.i
            r0 = r18
            r0.D = r3
            r0 = r18
            com.saterskog.cell_lab.Gene[] r3 = r0.I
            r0 = r18
            int r4 = r0.D
            r3 = r3[r4]
            com.saterskog.cell_lab.h r3 = r3.s
            com.saterskog.cell_lab.h r4 = com.saterskog.cell_lab.h.LIPOCYTE
            if (r3 != r4) goto L_0x0a98
            r0 = r18
            double r4 = r0.w
            r6 = 4600156803381319434(0x3fd70a3d70a3d70a, double:0.36)
            int r3 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r3 <= 0) goto L_0x0a2f
            r0 = r18
            double r4 = r0.w
            r6 = 4600156803381319434(0x3fd70a3d70a3d70a, double:0.36)
            double r4 = r4 - r6
            float r3 = (float) r4
            r0 = r18
            r0.S = r3
            r4 = 4600156803381319434(0x3fd70a3d70a3d70a, double:0.36)
            r0 = r18
            r0.w = r4
        L_0x0a2f:
            r0 = r19
            com.saterskog.cell_lab.Gene[] r3 = r0.I
            r0 = r19
            int r4 = r0.D
            r3 = r3[r4]
            com.saterskog.cell_lab.h r3 = r3.s
            com.saterskog.cell_lab.h r4 = com.saterskog.cell_lab.h.LIPOCYTE
            if (r3 != r4) goto L_0x0aaf
            r0 = r19
            double r4 = r0.w
            r6 = 4600156803381319434(0x3fd70a3d70a3d70a, double:0.36)
            int r3 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r3 <= 0) goto L_0x0a64
            r0 = r19
            double r4 = r0.w
            r6 = 4600156803381319434(0x3fd70a3d70a3d70a, double:0.36)
            double r4 = r4 - r6
            float r3 = (float) r4
            r0 = r19
            r0.S = r3
            r4 = 4600156803381319434(0x3fd70a3d70a3d70a, double:0.36)
            r0 = r19
            r0.w = r4
        L_0x0a64:
            r0 = r18
            com.saterskog.cell_lab.Gene[] r3 = r0.I
            r0 = r18
            int r4 = r0.D
            r3 = r3[r4]
            com.saterskog.cell_lab.h r3 = r3.s
            com.saterskog.cell_lab.h r4 = com.saterskog.cell_lab.h.FLAGELLOCYTE
            if (r3 != r4) goto L_0x0ac6
            r3 = 0
        L_0x0a75:
            r0 = r18
            int r4 = r0.C
            if (r3 >= r4) goto L_0x0ac6
            r0 = r18
            com.saterskog.cell_lab.Link[] r4 = r0.H
            r4 = r4[r3]
            double r4 = r4.c
            double r4 = java.lang.Math.cos(r4)
            r6 = -4617991057905706598(0xbfe999999999999a, double:-0.8)
            int r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r4 >= 0) goto L_0x0a95
            r4 = 1
            r0 = r18
            r0.x = r4
        L_0x0a95:
            int r3 = r3 + 1
            goto L_0x0a75
        L_0x0a98:
            r0 = r18
            double r4 = r0.w
            r6 = 4600156803381319434(0x3fd70a3d70a3d70a, double:0.36)
            int r3 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r3 <= 0) goto L_0x0a2f
            r4 = 4600156803381319434(0x3fd70a3d70a3d70a, double:0.36)
            r0 = r18
            r0.w = r4
            goto L_0x0a2f
        L_0x0aaf:
            r0 = r19
            double r4 = r0.w
            r6 = 4600156803381319434(0x3fd70a3d70a3d70a, double:0.36)
            int r3 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r3 <= 0) goto L_0x0a64
            r4 = 4600156803381319434(0x3fd70a3d70a3d70a, double:0.36)
            r0 = r19
            r0.w = r4
            goto L_0x0a64
        L_0x0ac6:
            r0 = r19
            com.saterskog.cell_lab.Gene[] r3 = r0.I
            r0 = r19
            int r4 = r0.D
            r3 = r3[r4]
            com.saterskog.cell_lab.h r3 = r3.s
            com.saterskog.cell_lab.h r4 = com.saterskog.cell_lab.h.FLAGELLOCYTE
            if (r3 != r4) goto L_0x0afa
            r3 = 0
        L_0x0ad7:
            r0 = r19
            int r4 = r0.C
            if (r3 >= r4) goto L_0x0afa
            r0 = r19
            com.saterskog.cell_lab.Link[] r4 = r0.H
            r4 = r4[r3]
            double r4 = r4.c
            double r4 = java.lang.Math.cos(r4)
            r6 = -4617991057905706598(0xbfe999999999999a, double:-0.8)
            int r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r4 >= 0) goto L_0x0af7
            r4 = 1
            r0 = r19
            r0.x = r4
        L_0x0af7:
            int r3 = r3 + 1
            goto L_0x0ad7
        L_0x0afa:
            r0 = r19
            double r4 = r0.w
            r6 = 0
            int r3 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r3 > 0) goto L_0x0b10
            r0 = r43
            int r3 = r0.z
            int r3 = r3 + -1
            r4 = 0
            r0 = r43
            r0.a((int) r3, (boolean) r4)
        L_0x0b10:
            r0 = r18
            double r4 = r0.w
            r6 = 0
            int r3 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r3 > 0) goto L_0x0b22
            r3 = 0
            r0 = r43
            r0.a((int) r2, (boolean) r3)
            int r2 = r2 + -1
        L_0x0b22:
            r4 = 0
            r0 = r18
            r0.j = r4
            r0 = r18
            r0.h = r4
            r0 = r18
            r0.g = r4
            r0 = r18
            double r4 = r0.q
            double r4 = -r4
            r6 = 4599075939685498880(0x3fd3333340000000, double:0.30000001192092896)
            double r4 = r4 * r6
            r0 = r18
            r0.i = r4
            r0 = r18
            com.saterskog.cell_lab.Gene[] r3 = r0.I
            r0 = r18
            int r4 = r0.D
            r3 = r3[r4]
            com.saterskog.cell_lab.h r3 = r3.s
            com.saterskog.cell_lab.h r4 = com.saterskog.cell_lab.h.FLAGELLOCYTE
            if (r3 != r4) goto L_0x0bb6
            r3 = 0
            r4 = 0
            r0 = r18
            float r3 = r0.a(r3, r4)
            r0 = r18
            float r4 = r0.r
            double r4 = (double) r4
            double r6 = (double) r3
            double r6 = r6 * r44
            double r4 = r4 + r6
            float r4 = (float) r4
            r0 = r18
            r0.r = r4
        L_0x0b65:
            r0 = r18
            float r4 = r0.r
            double r4 = (double) r4
            r6 = 4637616900656857088(0x405c200000000000, double:112.5)
            double r4 = r4 * r6
            r6 = 4634039614499534942(0x404f6a7a2955385e, double:62.83185307179586)
            int r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r4 <= 0) goto L_0x0b8a
            r0 = r18
            float r4 = r0.r
            double r4 = (double) r4
            r6 = 4603205788613385529(0x3fe1df46a2529d39, double:0.5585053606381855)
            double r4 = r4 - r6
            float r4 = (float) r4
            r0 = r18
            r0.r = r4
            goto L_0x0b65
        L_0x0b8a:
            r0 = r43
            boolean r4 = r0.bg
            if (r4 != 0) goto L_0x0bb6
            r0 = r18
            double r4 = r0.g
            r0 = r18
            double r6 = r0.k
            double r6 = java.lang.Math.cos(r6)
            double r8 = (double) r3
            double r6 = r6 * r8
            double r4 = r4 + r6
            r0 = r18
            r0.g = r4
            r0 = r18
            double r4 = r0.h
            r0 = r18
            double r6 = r0.k
            double r6 = java.lang.Math.sin(r6)
            double r8 = (double) r3
            double r6 = r6 * r8
            double r4 = r4 + r6
            r0 = r18
            r0.h = r4
        L_0x0bb6:
            int r2 = r2 + 1
            goto L_0x0001
        L_0x0bba:
            return
        L_0x0bbb:
            r6 = r8
            r8 = r10
            r10 = r12
            r12 = r15
            r13 = r16
            r15 = r17
            goto L_0x0643
        */
        throw new UnsupportedOperationException("Method not decompiled: com.saterskog.cell_lab.CellWorld.e(double):void");
    }

    private void j() {
        boolean z2;
        boolean z3;
        int i2 = 0;
        while (i2 < this.z) {
            Cell cell = this.x[i2];
            if ((cell.b * cell.b) + (cell.c * cell.c) >= this.e.k * this.e.k) {
                cell.x = true;
                z2 = true;
            } else {
                z2 = false;
            }
            if (cell.x) {
                if (z2 || this.bg) {
                    z3 = false;
                } else {
                    z3 = true;
                }
                a(i2, z3);
                i2--;
            }
            i2++;
        }
    }

    private void f(double d2) {
        for (int i2 = 0; i2 < this.z; i2++) {
            Cell cell = this.x[i2];
            if (cell.o > 5.0d * d2) {
                cell.d += (((cell.w / 400.0d) / cell.d) - cell.d) * 0.5d * 10.0d * d2;
                if (cell.d > 0.03d) {
                    cell.d = 0.03d;
                }
            }
            if (cell.d > 0.03d || cell.d < Cell.a || cell.w < 0.072d || cell.Y > 1.0f) {
                cell.x = true;
            }
            if (cell.F < 100) {
                cell.b += cell.e * d2;
                cell.c += cell.f * d2;
                cell.k += cell.l * d2;
            }
            cell.m += cell.n * d2;
            if (cell.k > 3.141592653589793d) {
                cell.k -= 6.283185307179586d;
            }
            if (cell.k < -3.141592653589793d) {
                cell.k += 6.283185307179586d;
            }
            if (cell.m > 6.283185307179586d) {
                cell.m -= 12.566370614359172d;
            }
            if (cell.m < -6.283185307179586d) {
                cell.m += 12.566370614359172d;
            }
            cell.B = 0;
            cell.P = cell.C;
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:123:0x0508, code lost:
        r7 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:125:0x050d, code lost:
        if (r7 >= 3) goto L_0x015d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:126:0x050f, code lost:
        r16 = r8.a;
        r16[r7] = (float) (((double) r16[r7]) + (r9.nextGaussian() * 0.15d));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:127:0x0538, code lost:
        if (r8.a[r7] >= 0.0f) goto L_0x0542;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:128:0x053a, code lost:
        r8.a[r7] = 0.0f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:130:0x054c, code lost:
        if (r8.a[r7] <= 1.0f) goto L_0x0556;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:131:0x054e, code lost:
        r8.a[r7] = 1.0f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:132:0x0556, code lost:
        r7 = r7 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:133:0x0559, code lost:
        r8.d = (float) (((double) r8.d) + r9.nextGaussian());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:135:0x056f, code lost:
        if (r8.d >= 0.0f) goto L_0x0583;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:136:0x0571, code lost:
        r8.d = (float) (((double) r8.d) + 6.283185307179586d);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:138:0x058f, code lost:
        if (((double) r8.d) <= 6.283185307179586d) goto L_0x015d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:139:0x0591, code lost:
        r8.d = (float) (((double) r8.d) - 6.283185307179586d);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:140:0x05a3, code lost:
        r8.e = (float) (((double) r8.e) + r9.nextGaussian());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:142:0x05b9, code lost:
        if (r8.e >= 0.0f) goto L_0x05cd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:143:0x05bb, code lost:
        r8.e = (float) (((double) r8.e) + 6.283185307179586d);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:145:0x05d9, code lost:
        if (((double) r8.e) <= 6.283185307179586d) goto L_0x015d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:146:0x05db, code lost:
        r8.e = (float) (((double) r8.e) - 6.283185307179586d);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:147:0x05ed, code lost:
        r8.f = (float) (((double) r8.f) + r9.nextGaussian());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:149:0x0603, code lost:
        if (r8.f >= 0.0f) goto L_0x0617;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x00a0, code lost:
        r12.Q -= ((((r7.u * (1.38571428571d - (1.28571428571d * ((double) r11.n)))) * 400.0d) * (r12.d + 0.0075d)) * r12.d) * r28;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:150:0x0605, code lost:
        r8.f = (float) (((double) r8.f) + 6.283185307179586d);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:152:0x0623, code lost:
        if (((double) r8.f) <= 6.283185307179586d) goto L_0x015d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:153:0x0625, code lost:
        r8.f = (float) (((double) r8.f) - 6.283185307179586d);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:154:0x0637, code lost:
        r8.g = (float) (((double) r8.g) * java.lang.Math.exp(r9.nextGaussian() / 2.0d));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:155:0x0655, code lost:
        if (r8.g <= 10.0f) goto L_0x065b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:156:0x0657, code lost:
        r8.g = 10.0f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:158:0x0662, code lost:
        if (r8.g >= 0.1f) goto L_0x015d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:159:0x0664, code lost:
        r8.g = 0.1f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x00d7, code lost:
        if (r11.v == false) goto L_0x00e4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:160:0x066b, code lost:
        r8.b = (float) (((double) r8.b) * java.lang.Math.exp(r9.nextGaussian() / 2.0d));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:161:0x068a, code lost:
        if (r8.b <= 0.3672f) goto L_0x0691;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:162:0x068c, code lost:
        r8.b = 0.3672f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:164:0x0698, code lost:
        if (r8.b >= 0.0648f) goto L_0x015d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:165:0x069a, code lost:
        r8.b = 0.0648f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:166:0x06a1, code lost:
        r8.c = (float) (((double) r8.c) + (r9.nextGaussian() * 0.2d));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:167:0x06bf, code lost:
        if (r8.c >= 0.1f) goto L_0x06c6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:168:0x06c1, code lost:
        r8.c = 0.1f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:170:0x06cd, code lost:
        if (r8.c <= 0.9f) goto L_0x015d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:171:0x06cf, code lost:
        r8.c = 0.9f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:172:0x06d6, code lost:
        if (r14 != false) goto L_0x015d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:173:0x06d8, code lost:
        r8.i = r9.nextInt(80);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:174:0x06e2, code lost:
        if (r14 != false) goto L_0x015d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:175:0x06e4, code lost:
        r8.j = r9.nextInt(80);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:176:0x06ee, code lost:
        if (r14 != false) goto L_0x015d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:178:0x06f2, code lost:
        if (r8.l != false) goto L_0x06f9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:179:0x06f4, code lost:
        r7 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x00df, code lost:
        if (r12.o <= 240.0d) goto L_0x00e4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:180:0x06f5, code lost:
        r8.l = r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:181:0x06f9, code lost:
        r7 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:182:0x06fb, code lost:
        if (r14 != false) goto L_0x015d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:184:0x06ff, code lost:
        if (r8.m != false) goto L_0x0706;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:185:0x0701, code lost:
        r7 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:186:0x0702, code lost:
        r8.m = r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:187:0x0706, code lost:
        r7 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:188:0x0708, code lost:
        if (r14 != false) goto L_0x015d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x00e1, code lost:
        r12.x = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:190:0x070c, code lost:
        if (r8.n != false) goto L_0x0713;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:191:0x070e, code lost:
        r7 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:192:0x070f, code lost:
        r8.n = r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:193:0x0713, code lost:
        r7 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:194:0x0715, code lost:
        if (r14 != false) goto L_0x015d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:195:0x0717, code lost:
        r8.s = com.saterskog.cell_lab.h.B[r9.nextInt(com.saterskog.cell_lab.h.B.length)];
     */
    /* JADX WARNING: Code restructure failed: missing block: B:196:0x0736, code lost:
        if (r11.t[r8.s.ordinal()] == false) goto L_0x0717;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:198:0x073c, code lost:
        if (r8.o != false) goto L_0x0743;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:199:0x073e, code lost:
        r7 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:200:0x073f, code lost:
        r8.o = r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:201:0x0743, code lost:
        r7 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:203:0x0747, code lost:
        if (r8.q != false) goto L_0x074e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:204:0x0749, code lost:
        r7 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:205:0x074a, code lost:
        r8.q = r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:206:0x074e, code lost:
        r7 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:208:0x0752, code lost:
        if (r8.r != false) goto L_0x0759;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:209:0x0754, code lost:
        r7 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x00ea, code lost:
        if (r12.b != r12.b) goto L_0x00fc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:210:0x0755, code lost:
        r8.r = r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:211:0x0759, code lost:
        r7 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:212:0x075b, code lost:
        r8.h = com.saterskog.cell_lab.Gene.a(0.0f, 35.0f, r8.h, r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:214:0x0770, code lost:
        if (r11.u != false) goto L_0x0246;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:215:0x0772, code lost:
        r12.G++;
        r8 = r27.Y.nextInt(80);
        r9 = r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:216:0x0783, code lost:
        if (r8 != r9) goto L_0x0791;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:217:0x0785, code lost:
        r9 = r27.Y.nextInt(80);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:218:0x0791, code lost:
        r7 = r27.Y.nextInt(3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:219:0x079a, code lost:
        if (r7 != 0) goto L_0x07c4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:221:0x07a5, code lost:
        if (r27.Y.nextInt(2) != 0) goto L_0x080a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:222:0x07a7, code lost:
        r12.I[r9].a(r12.I[r12.I[r8].i]);
        r12.I[r8].i = r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:224:0x07c5, code lost:
        if (r7 != 1) goto L_0x07f7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:225:0x07c7, code lost:
        r12.I[r9].l = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:226:0x07d7, code lost:
        if (r27.Y.nextInt(2) != 0) goto L_0x0828;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:227:0x07d9, code lost:
        r12.I[r9].i = r12.I[r8].i;
        r12.I[r9].j = r12.I[r8].i;
        r12.I[r8].i = r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:229:0x07f8, code lost:
        if (r7 != 2) goto L_0x0246;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x00f2, code lost:
        if (r12.c != r12.c) goto L_0x00fc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:230:0x07fa, code lost:
        r7 = r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:231:0x07fb, code lost:
        if (r7 == r8) goto L_0x07ff;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:232:0x07fd, code lost:
        if (r7 != r9) goto L_0x0847;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:233:0x07ff, code lost:
        r7 = r27.Y.nextInt(80);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:234:0x080a, code lost:
        r12.I[r9].a(r12.I[r12.I[r8].j]);
        r12.I[r8].j = r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:235:0x0828, code lost:
        r12.I[r9].i = r12.I[r8].j;
        r12.I[r9].j = r12.I[r8].j;
        r12.I[r8].j = r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:237:0x0850, code lost:
        if (r27.Y.nextInt(2) != 0) goto L_0x0885;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:238:0x0852, code lost:
        r14 = r12.I[r8].j;
        r12.I[r8].j = r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:239:0x0867, code lost:
        if (r27.Y.nextInt(2) != 0) goto L_0x0877;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:240:0x0869, code lost:
        r12.I[r9].i = r7;
        r12.I[r9].j = r14;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:241:0x0877, code lost:
        r12.I[r9].i = r14;
        r12.I[r9].j = r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:242:0x0885, code lost:
        r14 = r12.I[r8].i;
        r12.I[r8].i = r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:243:0x089a, code lost:
        if (r27.Y.nextInt(2) != 0) goto L_0x08aa;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:244:0x089c, code lost:
        r12.I[r9].i = r7;
        r12.I[r9].j = r14;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:245:0x08aa, code lost:
        r12.I[r9].i = r14;
        r12.I[r9].j = r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:246:0x08b8, code lost:
        r7 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:248:0x08ba, code lost:
        if (r7 >= 3) goto L_0x08de;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:249:0x08bc, code lost:
        r8 = r12.J;
        r8[r7] = (float) (((double) r8[r7]) + ((((double) (r12.I[r12.D].a[r7] - r12.J[r7])) * 8.0d) * r28));
        r7 = r7 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x00fa, code lost:
        if (r12.w == r12.w) goto L_0x00ff;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:250:0x08de, code lost:
        r14 = r12.a();
        r8 = (double) r13.g;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:251:0x08ef, code lost:
        if (((double) r13.b) <= 0.36d) goto L_0x08fc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:253:0x08f8, code lost:
        if (r14 <= 0.34559999999999996d) goto L_0x08fc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:254:0x08fa, code lost:
        r8 = 0.0d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:256:0x08fe, code lost:
        if (r13.o == false) goto L_0x091e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:258:0x0909, code lost:
        if (r12.w >= 0.0936d) goto L_0x091e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:259:0x090b, code lost:
        r8 = r8 + (462.96296296296276d * (0.0936d - r12.w));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x00fc, code lost:
        r12.x = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:260:0x091e, code lost:
        r7 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:262:0x0921, code lost:
        if (r7 >= r12.C) goto L_0x0a2f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:264:0x092a, code lost:
        if (r12.H[r7].a == -1) goto L_0x0a2b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:265:0x092c, code lost:
        r16 = r27.x[r12.H[r7].a];
        r10 = (double) r16.I[r16.D].g;
        r18 = r16.a();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:266:0x0969, code lost:
        if (((double) r16.I[r16.D].b) <= 0.36d) goto L_0x0976;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:268:0x0972, code lost:
        if (r18 <= 0.34559999999999996d) goto L_0x0976;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:269:0x0974, code lost:
        r10 = 0.0d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x00ff, code lost:
        r12.O++;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:271:0x098a, code lost:
        if (r16.I[r16.D].o == false) goto L_0x09b1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:273:0x0999, code lost:
        if (r16.w >= 0.0936d) goto L_0x09b1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:274:0x099b, code lost:
        r10 = r10 + (462.96296296296276d * (0.0936d - r16.w));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:275:0x09b1, code lost:
        r10 = (r10 * r14) - (r18 * r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:276:0x09bd, code lost:
        if (r10 <= 0.1d) goto L_0x09c4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:277:0x09bf, code lost:
        r10 = 0.1d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:279:0x09cb, code lost:
        if (r10 >= -0.1d) goto L_0x09d2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0109, code lost:
        if (r12.O != 15) goto L_0x08b8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:280:0x09cd, code lost:
        r10 = -0.1d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:281:0x09d2, code lost:
        r12.Q -= r10 * r28;
        r10 = r12.p - r16.p;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:282:0x09ed, code lost:
        if (r10 <= 0.6d) goto L_0x09f4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:283:0x09ef, code lost:
        r10 = 0.6d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:285:0x09fb, code lost:
        if (r10 >= -0.6d) goto L_0x0a02;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:286:0x09fd, code lost:
        r10 = -0.6d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:287:0x0a02, code lost:
        r12.R -= r10 * r28;
        r12.Z = (float) (((double) r12.Z) + (((double) ((r16.X - r12.X) * 3.0f)) * r28));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:288:0x0a2b, code lost:
        r7 = r7 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x010b, code lost:
        r12.O = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:290:0x0a33, code lost:
        if (r13.s != com.saterskog.cell_lab.h.LIPOCYTE) goto L_0x0aa6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:292:0x0a3e, code lost:
        if (r12.Q <= 0.36d) goto L_0x0a82;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:293:0x0a40, code lost:
        r12.S = (float) (((double) r12.S) + (r12.Q - 0.36d));
        r12.Q = 0.36d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:294:0x0a5d, code lost:
        if (r12.S <= 1.8f) goto L_0x0a64;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:295:0x0a5f, code lost:
        r12.S = 1.8f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:297:0x0a6a, code lost:
        if (r12.R <= 1.0d) goto L_0x0a70;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:298:0x0a6c, code lost:
        r12.R = 1.0d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0128, code lost:
        if (r27.Y.nextDouble() >= ((((r11.c * r28) * 40.0d) * 15.0d) / 3.0d)) goto L_0x08b8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:300:0x0a79, code lost:
        if (r12.p >= 0.1d) goto L_0x0a7e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:301:0x0a7b, code lost:
        r12.x = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:302:0x0a7e, code lost:
        r6 = r6 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:304:0x0a87, code lost:
        if (r12.S <= 0.0f) goto L_0x0a64;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:305:0x0a89, code lost:
        r8 = java.lang.Math.min((double) r12.S, 0.36d - r12.Q);
        r12.Q += r8;
        r12.S = (float) (((double) r12.S) - r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:307:0x0aaf, code lost:
        if (r12.Q <= 0.36d) goto L_0x0a64;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:308:0x0ab1, code lost:
        r12.Q = 0.36d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x012a, code lost:
        r7 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x012c, code lost:
        r10 = r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x012d, code lost:
        if (r10 >= 3) goto L_0x08b8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0138, code lost:
        if (r27.Y.nextInt(5) == 0) goto L_0x076e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x013a, code lost:
        r12.G++;
        r8 = r12.I[r27.Y.nextInt(80)];
        r9 = r27.Y;
        r14 = r11.u;
        r15 = r9.nextInt(3054);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x015a, code lost:
        switch(r15) {
            case 0: goto L_0x0508;
            case 1: goto L_0x0559;
            case 2: goto L_0x05a3;
            case 3: goto L_0x05ed;
            case 4: goto L_0x0637;
            case 5: goto L_0x066b;
            case 6: goto L_0x06a1;
            case 7: goto L_0x06d6;
            case 8: goto L_0x06e2;
            case 9: goto L_0x06ee;
            case 10: goto L_0x06fb;
            case 11: goto L_0x0708;
            case 12: goto L_0x0715;
            case 13: goto L_0x015d;
            case 14: goto L_0x073a;
            case 15: goto L_0x015d;
            case 16: goto L_0x015d;
            case 17: goto L_0x015d;
            case 18: goto L_0x0745;
            case 19: goto L_0x0750;
            case 20: goto L_0x075b;
            default: goto L_0x015d;
        };
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x015f, code lost:
        if (r15 < 22) goto L_0x017f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x0163, code lost:
        if (r15 >= 33) goto L_0x017f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x0165, code lost:
        r7 = r15 - 22;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x0167, code lost:
        if (r14 != false) goto L_0x017f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x016d, code lost:
        if (r7 == 10) goto L_0x017f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x016f, code lost:
        r8.u[r7] = r9.nextInt(com.saterskog.cell_lab.Gene.w[r7]);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x0181, code lost:
        if (r15 < 33) goto L_0x01a2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x0185, code lost:
        if (r15 >= 44) goto L_0x01a2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x0187, code lost:
        r7 = r15 - 33;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x0189, code lost:
        if (r14 != false) goto L_0x01a2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x018b, code lost:
        r8.t[r7].d = (short) r9.nextInt(8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x01a4, code lost:
        if (r15 < 44) goto L_0x01ba;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x01a8, code lost:
        if (r15 >= 55) goto L_0x01ba;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x01aa, code lost:
        r7 = r15 - 44;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x01ac, code lost:
        if (r14 != false) goto L_0x01ba;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x01ae, code lost:
        r8.t[r7].e = (short) r9.nextInt(3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x01bc, code lost:
        if (r15 < 55) goto L_0x01de;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x01c0, code lost:
        if (r15 >= 66) goto L_0x01de;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x01c2, code lost:
        r7 = r15 - 55;
        r8.t[r7].a = com.saterskog.cell_lab.Gene.a(-8.0f, 8.0f, r8.t[r7].a, r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x01e0, code lost:
        if (r15 < 66) goto L_0x0202;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x01e4, code lost:
        if (r15 >= 77) goto L_0x0202;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x01e6, code lost:
        r7 = r15 - 66;
        r8.t[r7].b = com.saterskog.cell_lab.Gene.a(-8.0f, 8.0f, r8.t[r7].b, r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x0204, code lost:
        if (r15 < 77) goto L_0x0226;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x0208, code lost:
        if (r15 >= 88) goto L_0x0226;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x020a, code lost:
        r7 = r15 - 77;
        r8.t[r7].c = com.saterskog.cell_lab.Gene.a(-8.0f, 8.0f, r8.t[r7].c, r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x0228, code lost:
        if (r15 < 88) goto L_0x0246;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x022c, code lost:
        if (r15 >= 3054) goto L_0x0246;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x022e, code lost:
        r7 = r15 - 88;
        r8.v[r7] = com.saterskog.cell_lab.Gene.a(com.saterskog.cell_lab.Gene.z[r7], com.saterskog.cell_lab.Gene.A[r7], r8.v[r7], r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x0246, code lost:
        r7 = r10 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:99:0x034d, code lost:
        r12.n += (((r12.l - r12.n) * java.lang.Math.abs(r12.l - r12.n)) * 1.0d) * r28;
        r7 = r8;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void g(double r28) {
        /*
            r27 = this;
            r6 = 0
        L_0x0001:
            r0 = r27
            int r7 = r0.z
            if (r6 >= r7) goto L_0x0ab9
            r0 = r27
            com.saterskog.cell_lab.Cell[] r7 = r0.x
            r12 = r7[r6]
            com.saterskog.cell_lab.Gene r13 = r12.b()
            double r8 = r12.w
            r12.Q = r8
            float r7 = r12.X
            r8 = 1028443341(0x3d4ccccd, float:0.05)
            float r9 = r12.X
            float r8 = r8 * r9
            r0 = r28
            float r9 = (float) r0
            float r8 = r8 * r9
            float r7 = r7 - r8
            r12.Z = r7
            float r7 = r12.Y
            double r8 = (double) r7
            float r7 = r12.X
            r10 = 1092616192(0x41200000, float:10.0)
            float r7 = java.lang.Math.min(r7, r10)
            float r10 = r12.Y
            float r7 = r7 - r10
            r10 = 1028443341(0x3d4ccccd, float:0.05)
            float r7 = r7 * r10
            double r10 = (double) r7
            double r10 = r10 * r28
            double r8 = r8 + r10
            float r7 = (float) r8
            r12.Y = r7
            double r8 = r12.p
            r12.R = r8
            double r8 = r12.p
            r0 = r27
            com.saterskog.cell_lab.Environment r7 = r0.e
            double r10 = r7.z
            int r7 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r7 >= 0) goto L_0x0066
            double r8 = r12.R
            r10 = 4608083138725491507(0x3ff3333333333333, double:1.2)
            r0 = r27
            com.saterskog.cell_lab.Environment r7 = r0.e
            double r14 = r7.z
            double r0 = r12.p
            r16 = r0
            double r14 = r14 - r16
            double r10 = r10 * r14
            double r10 = r10 * r28
            double r8 = r8 + r10
            r12.R = r8
        L_0x0066:
            r0 = r27
            boolean r7 = r0.bg
            if (r7 == 0) goto L_0x0084
            com.saterskog.cell_lab.h r7 = r13.s
            boolean r7 = r7.s
            if (r7 == 0) goto L_0x0084
            double r8 = r12.Q
            r10 = 4643633428284047360(0x4071800000000000, double:280.0)
            double r14 = r12.d
            double r10 = r10 * r14
            double r14 = r12.d
            double r10 = r10 * r14
            double r10 = r10 * r28
            double r8 = r8 + r10
            r12.Q = r8
        L_0x0084:
            r0 = r27
            com.saterskog.cell_lab.Environment r11 = r0.e
            com.saterskog.cell_lab.Gene r7 = r12.b()
            com.saterskog.cell_lab.h r8 = r7.s
            double r14 = r12.o
            double r14 = r14 + r28
            r12.o = r14
            int[] r9 = com.saterskog.cell_lab.Cell.AnonymousClass2.a
            int r10 = r8.ordinal()
            r9 = r9[r10]
            switch(r9) {
                case 1: goto L_0x024b;
                case 2: goto L_0x0272;
                case 3: goto L_0x02b0;
                case 4: goto L_0x031c;
                case 5: goto L_0x0323;
                case 6: goto L_0x034d;
                case 7: goto L_0x034d;
                case 8: goto L_0x0376;
                case 9: goto L_0x0379;
                case 10: goto L_0x03ff;
                case 11: goto L_0x04d2;
                default: goto L_0x009f;
            }
        L_0x009f:
            r7 = r8
        L_0x00a0:
            double r8 = r12.Q
            double r14 = r7.u
            r16 = 4608919521513412441(0x3ff62be2be2b9759, double:1.38571428571)
            r18 = 4608469161550675391(0x3ff492492491fdbf, double:1.28571428571)
            float r7 = r11.n
            double r0 = (double) r7
            r20 = r0
            double r18 = r18 * r20
            double r16 = r16 - r18
            double r14 = r14 * r16
            r16 = 4645744490609377280(0x4079000000000000, double:400.0)
            double r14 = r14 * r16
            double r0 = r12.d
            r16 = r0
            r18 = 4575296933438234296(0x3f7eb851eb851eb8, double:0.0075)
            double r16 = r16 + r18
            double r14 = r14 * r16
            double r0 = r12.d
            r16 = r0
            double r14 = r14 * r16
            double r14 = r14 * r28
            double r8 = r8 - r14
            r12.Q = r8
            boolean r7 = r11.v
            if (r7 == 0) goto L_0x00e4
            double r8 = r12.o
            r14 = 4642648265865560064(0x406e000000000000, double:240.0)
            int r7 = (r8 > r14 ? 1 : (r8 == r14 ? 0 : -1))
            if (r7 <= 0) goto L_0x00e4
            r7 = 1
            r12.x = r7
        L_0x00e4:
            double r8 = r12.b
            double r14 = r12.b
            int r7 = (r8 > r14 ? 1 : (r8 == r14 ? 0 : -1))
            if (r7 != 0) goto L_0x00fc
            double r8 = r12.c
            double r14 = r12.c
            int r7 = (r8 > r14 ? 1 : (r8 == r14 ? 0 : -1))
            if (r7 != 0) goto L_0x00fc
            double r8 = r12.w
            double r14 = r12.w
            int r7 = (r8 > r14 ? 1 : (r8 == r14 ? 0 : -1))
            if (r7 == 0) goto L_0x00ff
        L_0x00fc:
            r7 = 1
            r12.x = r7
        L_0x00ff:
            int r7 = r12.O
            int r7 = r7 + 1
            r12.O = r7
            int r7 = r12.O
            r8 = 15
            if (r7 != r8) goto L_0x08b8
            r7 = 0
            r12.O = r7
            r0 = r27
            com.saterskog.b.d r7 = r0.Y
            double r8 = r7.nextDouble()
            double r14 = r11.c
            double r14 = r14 * r28
            r16 = 4630826316843712512(0x4044000000000000, double:40.0)
            double r14 = r14 * r16
            r16 = 4624633867356078080(0x402e000000000000, double:15.0)
            double r14 = r14 * r16
            r16 = 4613937818241073152(0x4008000000000000, double:3.0)
            double r14 = r14 / r16
            int r7 = (r8 > r14 ? 1 : (r8 == r14 ? 0 : -1))
            if (r7 >= 0) goto L_0x08b8
            r7 = 0
            r10 = r7
        L_0x012c:
            r7 = 3
            if (r10 >= r7) goto L_0x08b8
            r0 = r27
            com.saterskog.b.d r7 = r0.Y
            r8 = 5
            int r7 = r7.nextInt(r8)
            if (r7 == 0) goto L_0x076e
            int r7 = r12.G
            int r7 = r7 + 1
            r12.G = r7
            com.saterskog.cell_lab.Gene[] r7 = r12.I
            r0 = r27
            com.saterskog.b.d r8 = r0.Y
            r9 = 80
            int r8 = r8.nextInt(r9)
            r8 = r7[r8]
            r0 = r27
            com.saterskog.b.d r9 = r0.Y
            boolean r14 = r11.u
            r7 = 3054(0xbee, float:4.28E-42)
            int r15 = r9.nextInt(r7)
            switch(r15) {
                case 0: goto L_0x0508;
                case 1: goto L_0x0559;
                case 2: goto L_0x05a3;
                case 3: goto L_0x05ed;
                case 4: goto L_0x0637;
                case 5: goto L_0x066b;
                case 6: goto L_0x06a1;
                case 7: goto L_0x06d6;
                case 8: goto L_0x06e2;
                case 9: goto L_0x06ee;
                case 10: goto L_0x06fb;
                case 11: goto L_0x0708;
                case 12: goto L_0x0715;
                case 13: goto L_0x015d;
                case 14: goto L_0x073a;
                case 15: goto L_0x015d;
                case 16: goto L_0x015d;
                case 17: goto L_0x015d;
                case 18: goto L_0x0745;
                case 19: goto L_0x0750;
                case 20: goto L_0x075b;
                default: goto L_0x015d;
            }
        L_0x015d:
            r7 = 22
            if (r15 < r7) goto L_0x017f
            r7 = 33
            if (r15 >= r7) goto L_0x017f
            int r7 = r15 + -22
            if (r14 != 0) goto L_0x017f
            r16 = 10
            r0 = r16
            if (r7 == r0) goto L_0x017f
            int[] r0 = r8.u
            r16 = r0
            int[] r17 = com.saterskog.cell_lab.Gene.w
            r17 = r17[r7]
            r0 = r17
            int r17 = r9.nextInt(r0)
            r16[r7] = r17
        L_0x017f:
            r7 = 33
            if (r15 < r7) goto L_0x01a2
            r7 = 44
            if (r15 >= r7) goto L_0x01a2
            int r7 = r15 + -33
            if (r14 != 0) goto L_0x01a2
            com.saterskog.cell_lab.Gene$a[] r0 = r8.t
            r16 = r0
            r7 = r16[r7]
            r16 = 8
            r0 = r16
            int r16 = r9.nextInt(r0)
            r0 = r16
            short r0 = (short) r0
            r16 = r0
            r0 = r16
            r7.d = r0
        L_0x01a2:
            r7 = 44
            if (r15 < r7) goto L_0x01ba
            r7 = 55
            if (r15 >= r7) goto L_0x01ba
            int r7 = r15 + -44
            if (r14 != 0) goto L_0x01ba
            com.saterskog.cell_lab.Gene$a[] r14 = r8.t
            r7 = r14[r7]
            r14 = 3
            int r14 = r9.nextInt(r14)
            short r14 = (short) r14
            r7.e = r14
        L_0x01ba:
            r7 = 55
            if (r15 < r7) goto L_0x01de
            r7 = 66
            if (r15 >= r7) goto L_0x01de
            int r7 = r15 + -55
            com.saterskog.cell_lab.Gene$a[] r14 = r8.t
            r14 = r14[r7]
            r16 = -1056964608(0xffffffffc1000000, float:-8.0)
            r17 = 1090519040(0x41000000, float:8.0)
            com.saterskog.cell_lab.Gene$a[] r0 = r8.t
            r18 = r0
            r7 = r18[r7]
            float r7 = r7.a
            r0 = r16
            r1 = r17
            float r7 = com.saterskog.cell_lab.Gene.a(r0, r1, r7, r9)
            r14.a = r7
        L_0x01de:
            r7 = 66
            if (r15 < r7) goto L_0x0202
            r7 = 77
            if (r15 >= r7) goto L_0x0202
            int r7 = r15 + -66
            com.saterskog.cell_lab.Gene$a[] r14 = r8.t
            r14 = r14[r7]
            r16 = -1056964608(0xffffffffc1000000, float:-8.0)
            r17 = 1090519040(0x41000000, float:8.0)
            com.saterskog.cell_lab.Gene$a[] r0 = r8.t
            r18 = r0
            r7 = r18[r7]
            float r7 = r7.b
            r0 = r16
            r1 = r17
            float r7 = com.saterskog.cell_lab.Gene.a(r0, r1, r7, r9)
            r14.b = r7
        L_0x0202:
            r7 = 77
            if (r15 < r7) goto L_0x0226
            r7 = 88
            if (r15 >= r7) goto L_0x0226
            int r7 = r15 + -77
            com.saterskog.cell_lab.Gene$a[] r14 = r8.t
            r14 = r14[r7]
            r16 = -1056964608(0xffffffffc1000000, float:-8.0)
            r17 = 1090519040(0x41000000, float:8.0)
            com.saterskog.cell_lab.Gene$a[] r0 = r8.t
            r18 = r0
            r7 = r18[r7]
            float r7 = r7.c
            r0 = r16
            r1 = r17
            float r7 = com.saterskog.cell_lab.Gene.a(r0, r1, r7, r9)
            r14.c = r7
        L_0x0226:
            r7 = 88
            if (r15 < r7) goto L_0x0246
            r7 = 3054(0xbee, float:4.28E-42)
            if (r15 >= r7) goto L_0x0246
            int r7 = r15 + -88
            float[] r14 = r8.v
            float[] r15 = com.saterskog.cell_lab.Gene.z
            r15 = r15[r7]
            float[] r16 = com.saterskog.cell_lab.Gene.A
            r16 = r16[r7]
            float[] r8 = r8.v
            r8 = r8[r7]
            r0 = r16
            float r8 = com.saterskog.cell_lab.Gene.a(r15, r0, r8, r9)
            r14[r7] = r8
        L_0x0246:
            int r7 = r10 + 1
            r10 = r7
            goto L_0x012c
        L_0x024b:
            r7 = 0
            r9 = 0
            float r7 = r12.a(r7, r9)
            double r14 = r12.Q
            double r0 = (double) r7
            r16 = r0
            r18 = 4575765307799480828(0x3f80624dd2f1a9fc, double:0.008)
            double r0 = (double) r7
            r20 = r0
            r22 = 4586066027336315472(0x3fa4fac0fbde3250, double:0.0409756)
            double r20 = r20 * r22
            double r18 = r18 + r20
            double r16 = r16 * r18
            double r16 = r16 * r28
            double r14 = r14 - r16
            r12.Q = r14
            r7 = r8
            goto L_0x00a0
        L_0x0272:
            double r14 = r12.o
            r16 = 4602678819172646912(0x3fe0000000000000, double:0.5)
            int r9 = (r14 > r16 ? 1 : (r14 == r16 ? 0 : -1))
            if (r9 <= 0) goto L_0x009f
            r9 = 5
            r10 = 0
            float r9 = r12.a(r9, r10)
            r10 = 1056964608(0x3f000000, float:0.5)
            int r9 = (r9 > r10 ? 1 : (r9 == r10 ? 0 : -1))
            if (r9 <= 0) goto L_0x0295
            r8 = 0
            int r8 = r12.b(r8)
            r12.D = r8
            com.saterskog.cell_lab.h r7 = r7.s
            r8 = 0
            r12.o = r8
            goto L_0x00a0
        L_0x0295:
            r9 = 6
            r10 = 0
            float r9 = r12.a(r9, r10)
            r10 = 1056964608(0x3f000000, float:0.5)
            int r9 = (r9 > r10 ? 1 : (r9 == r10 ? 0 : -1))
            if (r9 <= 0) goto L_0x009f
            r8 = 1
            int r8 = r12.b(r8)
            r12.D = r8
            com.saterskog.cell_lab.h r7 = r7.s
            r8 = 0
            r12.o = r8
            goto L_0x00a0
        L_0x02b0:
            r14 = 0
            int r7 = (r28 > r14 ? 1 : (r28 == r14 ? 0 : -1))
            if (r7 == 0) goto L_0x009f
            r7 = 3
            r9 = 0
            float r9 = r12.a(r7, r9)
            r7 = 2
            r10 = 0
            float r10 = r12.a(r7, r10)
            boolean r7 = r12.y
            if (r7 == 0) goto L_0x031a
            r7 = -1
        L_0x02c7:
            float r7 = (float) r7
            float r7 = r7 * r10
            r10 = 4
            r14 = 0
            float r10 = r12.a(r10, r14)
            double r14 = r12.Q
            r16 = 4545531382343925760(0x3f14f8b580000000, double:7.999999797903001E-5)
            double r16 = r16 / r28
            float r0 = r12.aa
            r18 = r0
            float r18 = r9 - r18
            float r0 = r12.aa
            r19 = r0
            float r19 = r9 - r19
            float r18 = r18 * r19
            float r0 = r12.ab
            r19 = r0
            float r19 = r7 - r19
            float r0 = r12.ab
            r20 = r0
            float r20 = r7 - r20
            float r19 = r19 * r20
            float r18 = r18 + r19
            float r0 = r12.ac
            r19 = r0
            float r19 = r10 - r19
            float r0 = r12.ac
            r20 = r0
            float r20 = r10 - r20
            float r19 = r19 * r20
            float r18 = r18 + r19
            r0 = r18
            double r0 = (double) r0
            r18 = r0
            double r16 = r16 * r18
            double r14 = r14 - r16
            r12.Q = r14
            r12.aa = r9
            r12.ab = r7
            r12.ac = r10
            r7 = r8
            goto L_0x00a0
        L_0x031a:
            r7 = 1
            goto L_0x02c7
        L_0x031c:
            r14 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            r12.R = r14
            r7 = r8
            goto L_0x00a0
        L_0x0323:
            double r14 = r12.Q
            r16 = 4645744490609377280(0x4079000000000000, double:400.0)
            double r0 = r12.b
            r18 = r0
            double r0 = r12.c
            r20 = r0
            r0 = r27
            r1 = r18
            r3 = r20
            double r18 = r0.c((double) r1, (double) r3)
            double r16 = r16 * r18
            double r0 = r12.d
            r18 = r0
            double r16 = r16 * r18
            double r0 = r12.d
            r18 = r0
            double r16 = r16 * r18
            double r16 = r16 * r28
            double r14 = r14 + r16
            r12.Q = r14
        L_0x034d:
            double r14 = r12.n
            double r0 = r12.l
            r16 = r0
            double r0 = r12.n
            r18 = r0
            double r16 = r16 - r18
            double r0 = r12.l
            r18 = r0
            double r0 = r12.n
            r20 = r0
            double r18 = r18 - r20
            double r18 = java.lang.Math.abs(r18)
            double r16 = r16 * r18
            r18 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            double r16 = r16 * r18
            double r16 = r16 * r28
            double r14 = r14 + r16
            r12.n = r14
            r7 = r8
            goto L_0x00a0
        L_0x0376:
            r7 = r8
            goto L_0x00a0
        L_0x0379:
            double r14 = r12.t
            double r0 = r12.l
            r16 = r0
            r0 = r16
            double r0 = -r0
            r16 = r0
            double r0 = r12.d
            r18 = r0
            double r16 = r16 * r18
            double r0 = r12.t
            r18 = r0
            r20 = 4636737291354636288(0x4059000000000000, double:100.0)
            double r18 = r18 * r20
            double r0 = r12.t
            r20 = r0
            double r20 = java.lang.Math.abs(r20)
            double r18 = r18 * r20
            double r16 = r16 - r18
            double r16 = r16 * r28
            double r14 = r14 + r16
            r12.t = r14
            double r14 = r12.u
            double r0 = r12.u
            r16 = r0
            double r14 = r14 * r16
            double r0 = r12.v
            r16 = r0
            double r0 = r12.v
            r18 = r0
            double r16 = r16 * r18
            double r14 = r14 + r16
            double r14 = java.lang.Math.sqrt(r14)
            double r0 = r12.u
            r16 = r0
            double r0 = r12.e
            r18 = r0
            r0 = r18
            double r0 = -r0
            r18 = r0
            double r0 = r12.u
            r20 = r0
            r22 = 4636737291354636288(0x4059000000000000, double:100.0)
            double r20 = r20 * r22
            double r20 = r20 * r14
            double r18 = r18 - r20
            double r18 = r18 * r28
            double r16 = r16 + r18
            r0 = r16
            r12.u = r0
            double r0 = r12.v
            r16 = r0
            double r0 = r12.f
            r18 = r0
            r0 = r18
            double r0 = -r0
            r18 = r0
            double r0 = r12.v
            r20 = r0
            r22 = 4636737291354636288(0x4059000000000000, double:100.0)
            double r20 = r20 * r22
            double r14 = r14 * r20
            double r14 = r18 - r14
            double r14 = r14 * r28
            double r14 = r14 + r16
            r12.v = r14
            r7 = r8
            goto L_0x00a0
        L_0x03ff:
            r7 = 2
            r9 = 0
            float r7 = r12.a(r7, r9)
            double r14 = (double) r7
            double r14 = r14 * r28
            r7 = 4
            r9 = 0
            float r7 = r12.a(r7, r9)
            double r0 = (double) r7
            r16 = r0
            double r16 = r16 * r28
            double r0 = r12.Q
            r18 = r0
            double r20 = java.lang.Math.abs(r14)
            double r22 = java.lang.Math.abs(r16)
            double r20 = r20 + r22
            r22 = 4562254508917369340(0x3f50624dd2f1a9fc, double:0.001)
            double r20 = r20 * r22
            double r18 = r18 - r20
            r0 = r18
            r12.Q = r0
            float r7 = r12.r
            double r0 = (double) r7
            r18 = r0
            r20 = 4599075939470750515(0x3fd3333333333333, double:0.3)
            double r14 = r14 * r20
            double r14 = r14 + r18
            float r7 = (float) r14
            r12.r = r7
            float r7 = r12.s
            double r14 = (double) r7
            r18 = 4599075939470750515(0x3fd3333333333333, double:0.3)
            double r16 = r16 * r18
            double r14 = r14 + r16
            float r7 = (float) r14
            r12.s = r7
        L_0x044e:
            float r7 = r12.r
            double r14 = (double) r7
            r16 = 4637616900656857088(0x405c200000000000, double:112.5)
            double r14 = r14 * r16
            r16 = 4634039614499534942(0x404f6a7a2955385e, double:62.83185307179586)
            int r7 = (r14 > r16 ? 1 : (r14 == r16 ? 0 : -1))
            if (r7 <= 0) goto L_0x046f
            float r7 = r12.r
            double r14 = (double) r7
            r16 = 4603205788613385529(0x3fe1df46a2529d39, double:0.5585053606381855)
            double r14 = r14 - r16
            float r7 = (float) r14
            r12.r = r7
            goto L_0x044e
        L_0x046f:
            float r7 = r12.r
            double r14 = (double) r7
            r16 = 4637616900656857088(0x405c200000000000, double:112.5)
            double r14 = r14 * r16
            r16 = -4589332422355240866(0xc04f6a7a2955385e, double:-62.83185307179586)
            int r7 = (r14 > r16 ? 1 : (r14 == r16 ? 0 : -1))
            if (r7 >= 0) goto L_0x0490
            float r7 = r12.r
            double r14 = (double) r7
            r16 = 4603205788613385529(0x3fe1df46a2529d39, double:0.5585053606381855)
            double r14 = r14 + r16
            float r7 = (float) r14
            r12.r = r7
            goto L_0x046f
        L_0x0490:
            float r7 = r12.s
            double r14 = (double) r7
            r16 = 4637616900656857088(0x405c200000000000, double:112.5)
            double r14 = r14 * r16
            r16 = 4634039614499534942(0x404f6a7a2955385e, double:62.83185307179586)
            int r7 = (r14 > r16 ? 1 : (r14 == r16 ? 0 : -1))
            if (r7 <= 0) goto L_0x04b1
            float r7 = r12.s
            double r14 = (double) r7
            r16 = 4603205788613385529(0x3fe1df46a2529d39, double:0.5585053606381855)
            double r14 = r14 - r16
            float r7 = (float) r14
            r12.s = r7
            goto L_0x0490
        L_0x04b1:
            float r7 = r12.s
            double r14 = (double) r7
            r16 = 4637616900656857088(0x405c200000000000, double:112.5)
            double r14 = r14 * r16
            r16 = -4589332422355240866(0xc04f6a7a2955385e, double:-62.83185307179586)
            int r7 = (r14 > r16 ? 1 : (r14 == r16 ? 0 : -1))
            if (r7 >= 0) goto L_0x009f
            float r7 = r12.s
            double r14 = (double) r7
            r16 = 4603205788613385529(0x3fe1df46a2529d39, double:0.5585053606381855)
            double r14 = r14 + r16
            float r7 = (float) r14
            r12.s = r7
            goto L_0x04b1
        L_0x04d2:
            double r14 = r12.R
            r16 = 4598175219545276416(0x3fd0000000000000, double:0.25)
            int r7 = (r14 > r16 ? 1 : (r14 == r16 ? 0 : -1))
            if (r7 <= 0) goto L_0x04f3
            double r14 = r12.R
            r16 = 4601778099247172812(0x3fdccccccccccccc, double:0.44999999999999996)
            double r16 = r16 * r28
            double r14 = r14 - r16
            r12.R = r14
            double r14 = r12.R
            r16 = 4598175219545276416(0x3fd0000000000000, double:0.25)
            int r7 = (r14 > r16 ? 1 : (r14 == r16 ? 0 : -1))
            if (r7 >= 0) goto L_0x04f3
            r14 = 4598175219545276416(0x3fd0000000000000, double:0.25)
            r12.R = r14
        L_0x04f3:
            double r14 = r12.R
            r16 = 4596373779694328218(0x3fc999999999999a, double:0.2)
            int r7 = (r14 > r16 ? 1 : (r14 == r16 ? 0 : -1))
            if (r7 < 0) goto L_0x009f
            float r7 = r12.r
            double r14 = (double) r7
            double r14 = r14 + r28
            float r7 = (float) r14
            r12.r = r7
            goto L_0x009f
        L_0x0508:
            r7 = 0
        L_0x0509:
            r16 = 3
            r0 = r16
            if (r7 >= r0) goto L_0x015d
            float[] r0 = r8.a
            r16 = r0
            r17 = r16[r7]
            r0 = r17
            double r0 = (double) r0
            r18 = r0
            double r20 = r9.nextGaussian()
            r22 = 4594572339843380019(0x3fc3333333333333, double:0.15)
            double r20 = r20 * r22
            double r18 = r18 + r20
            r0 = r18
            float r0 = (float) r0
            r17 = r0
            r16[r7] = r17
            float[] r0 = r8.a
            r16 = r0
            r16 = r16[r7]
            r17 = 0
            int r16 = (r16 > r17 ? 1 : (r16 == r17 ? 0 : -1))
            if (r16 >= 0) goto L_0x0542
            float[] r0 = r8.a
            r16 = r0
            r17 = 0
            r16[r7] = r17
        L_0x0542:
            float[] r0 = r8.a
            r16 = r0
            r16 = r16[r7]
            r17 = 1065353216(0x3f800000, float:1.0)
            int r16 = (r16 > r17 ? 1 : (r16 == r17 ? 0 : -1))
            if (r16 <= 0) goto L_0x0556
            float[] r0 = r8.a
            r16 = r0
            r17 = 1065353216(0x3f800000, float:1.0)
            r16[r7] = r17
        L_0x0556:
            int r7 = r7 + 1
            goto L_0x0509
        L_0x0559:
            float r7 = r8.d
            double r0 = (double) r7
            r16 = r0
            double r18 = r9.nextGaussian()
            double r16 = r16 + r18
            r0 = r16
            float r7 = (float) r0
            r8.d = r7
        L_0x0569:
            float r7 = r8.d
            r16 = 0
            int r7 = (r7 > r16 ? 1 : (r7 == r16 ? 0 : -1))
            if (r7 >= 0) goto L_0x0583
            float r7 = r8.d
            double r0 = (double) r7
            r16 = r0
            r18 = 4618760256179416344(0x401921fb54442d18, double:6.283185307179586)
            double r16 = r16 + r18
            r0 = r16
            float r7 = (float) r0
            r8.d = r7
            goto L_0x0569
        L_0x0583:
            float r7 = r8.d
            double r0 = (double) r7
            r16 = r0
            r18 = 4618760256179416344(0x401921fb54442d18, double:6.283185307179586)
            int r7 = (r16 > r18 ? 1 : (r16 == r18 ? 0 : -1))
            if (r7 <= 0) goto L_0x015d
            float r7 = r8.d
            double r0 = (double) r7
            r16 = r0
            r18 = 4618760256179416344(0x401921fb54442d18, double:6.283185307179586)
            double r16 = r16 - r18
            r0 = r16
            float r7 = (float) r0
            r8.d = r7
            goto L_0x0583
        L_0x05a3:
            float r7 = r8.e
            double r0 = (double) r7
            r16 = r0
            double r18 = r9.nextGaussian()
            double r16 = r16 + r18
            r0 = r16
            float r7 = (float) r0
            r8.e = r7
        L_0x05b3:
            float r7 = r8.e
            r16 = 0
            int r7 = (r7 > r16 ? 1 : (r7 == r16 ? 0 : -1))
            if (r7 >= 0) goto L_0x05cd
            float r7 = r8.e
            double r0 = (double) r7
            r16 = r0
            r18 = 4618760256179416344(0x401921fb54442d18, double:6.283185307179586)
            double r16 = r16 + r18
            r0 = r16
            float r7 = (float) r0
            r8.e = r7
            goto L_0x05b3
        L_0x05cd:
            float r7 = r8.e
            double r0 = (double) r7
            r16 = r0
            r18 = 4618760256179416344(0x401921fb54442d18, double:6.283185307179586)
            int r7 = (r16 > r18 ? 1 : (r16 == r18 ? 0 : -1))
            if (r7 <= 0) goto L_0x015d
            float r7 = r8.e
            double r0 = (double) r7
            r16 = r0
            r18 = 4618760256179416344(0x401921fb54442d18, double:6.283185307179586)
            double r16 = r16 - r18
            r0 = r16
            float r7 = (float) r0
            r8.e = r7
            goto L_0x05cd
        L_0x05ed:
            float r7 = r8.f
            double r0 = (double) r7
            r16 = r0
            double r18 = r9.nextGaussian()
            double r16 = r16 + r18
            r0 = r16
            float r7 = (float) r0
            r8.f = r7
        L_0x05fd:
            float r7 = r8.f
            r16 = 0
            int r7 = (r7 > r16 ? 1 : (r7 == r16 ? 0 : -1))
            if (r7 >= 0) goto L_0x0617
            float r7 = r8.f
            double r0 = (double) r7
            r16 = r0
            r18 = 4618760256179416344(0x401921fb54442d18, double:6.283185307179586)
            double r16 = r16 + r18
            r0 = r16
            float r7 = (float) r0
            r8.f = r7
            goto L_0x05fd
        L_0x0617:
            float r7 = r8.f
            double r0 = (double) r7
            r16 = r0
            r18 = 4618760256179416344(0x401921fb54442d18, double:6.283185307179586)
            int r7 = (r16 > r18 ? 1 : (r16 == r18 ? 0 : -1))
            if (r7 <= 0) goto L_0x015d
            float r7 = r8.f
            double r0 = (double) r7
            r16 = r0
            r18 = 4618760256179416344(0x401921fb54442d18, double:6.283185307179586)
            double r16 = r16 - r18
            r0 = r16
            float r7 = (float) r0
            r8.f = r7
            goto L_0x0617
        L_0x0637:
            float r7 = r8.g
            double r0 = (double) r7
            r16 = r0
            double r18 = r9.nextGaussian()
            r20 = 4611686018427387904(0x4000000000000000, double:2.0)
            double r18 = r18 / r20
            double r18 = java.lang.Math.exp(r18)
            double r16 = r16 * r18
            r0 = r16
            float r7 = (float) r0
            r8.g = r7
            float r7 = r8.g
            r16 = 1092616192(0x41200000, float:10.0)
            int r7 = (r7 > r16 ? 1 : (r7 == r16 ? 0 : -1))
            if (r7 <= 0) goto L_0x065b
            r7 = 1092616192(0x41200000, float:10.0)
            r8.g = r7
        L_0x065b:
            float r7 = r8.g
            r16 = 1036831949(0x3dcccccd, float:0.1)
            int r7 = (r7 > r16 ? 1 : (r7 == r16 ? 0 : -1))
            if (r7 >= 0) goto L_0x015d
            r7 = 1036831949(0x3dcccccd, float:0.1)
            r8.g = r7
            goto L_0x015d
        L_0x066b:
            float r7 = r8.b
            double r0 = (double) r7
            r16 = r0
            double r18 = r9.nextGaussian()
            r20 = 4611686018427387904(0x4000000000000000, double:2.0)
            double r18 = r18 / r20
            double r18 = java.lang.Math.exp(r18)
            double r16 = r16 * r18
            r0 = r16
            float r7 = (float) r0
            r8.b = r7
            float r7 = r8.b
            r16 = 1052508579(0x3ebc01a3, float:0.3672)
            int r7 = (r7 > r16 ? 1 : (r7 == r16 ? 0 : -1))
            if (r7 <= 0) goto L_0x0691
            r7 = 1052508579(0x3ebc01a3, float:0.3672)
            r8.b = r7
        L_0x0691:
            float r7 = r8.b
            r16 = 1032107485(0x3d84b5dd, float:0.0648)
            int r7 = (r7 > r16 ? 1 : (r7 == r16 ? 0 : -1))
            if (r7 >= 0) goto L_0x015d
            r7 = 1032107485(0x3d84b5dd, float:0.0648)
            r8.b = r7
            goto L_0x015d
        L_0x06a1:
            float r7 = r8.c
            double r0 = (double) r7
            r16 = r0
            double r18 = r9.nextGaussian()
            r20 = 4596373779694328218(0x3fc999999999999a, double:0.2)
            double r18 = r18 * r20
            double r16 = r16 + r18
            r0 = r16
            float r7 = (float) r0
            r8.c = r7
            float r7 = r8.c
            r16 = 1036831949(0x3dcccccd, float:0.1)
            int r7 = (r7 > r16 ? 1 : (r7 == r16 ? 0 : -1))
            if (r7 >= 0) goto L_0x06c6
            r7 = 1036831949(0x3dcccccd, float:0.1)
            r8.c = r7
        L_0x06c6:
            float r7 = r8.c
            r16 = 1063675494(0x3f666666, float:0.9)
            int r7 = (r7 > r16 ? 1 : (r7 == r16 ? 0 : -1))
            if (r7 <= 0) goto L_0x015d
            r7 = 1063675494(0x3f666666, float:0.9)
            r8.c = r7
            goto L_0x015d
        L_0x06d6:
            if (r14 != 0) goto L_0x015d
            r7 = 80
            int r7 = r9.nextInt(r7)
            r8.i = r7
            goto L_0x015d
        L_0x06e2:
            if (r14 != 0) goto L_0x015d
            r7 = 80
            int r7 = r9.nextInt(r7)
            r8.j = r7
            goto L_0x015d
        L_0x06ee:
            if (r14 != 0) goto L_0x015d
            boolean r7 = r8.l
            if (r7 != 0) goto L_0x06f9
            r7 = 1
        L_0x06f5:
            r8.l = r7
            goto L_0x015d
        L_0x06f9:
            r7 = 0
            goto L_0x06f5
        L_0x06fb:
            if (r14 != 0) goto L_0x015d
            boolean r7 = r8.m
            if (r7 != 0) goto L_0x0706
            r7 = 1
        L_0x0702:
            r8.m = r7
            goto L_0x015d
        L_0x0706:
            r7 = 0
            goto L_0x0702
        L_0x0708:
            if (r14 != 0) goto L_0x015d
            boolean r7 = r8.n
            if (r7 != 0) goto L_0x0713
            r7 = 1
        L_0x070f:
            r8.n = r7
            goto L_0x015d
        L_0x0713:
            r7 = 0
            goto L_0x070f
        L_0x0715:
            if (r14 != 0) goto L_0x015d
        L_0x0717:
            com.saterskog.cell_lab.h[] r7 = com.saterskog.cell_lab.h.B
            com.saterskog.cell_lab.h[] r16 = com.saterskog.cell_lab.h.B
            r0 = r16
            int r0 = r0.length
            r16 = r0
            r0 = r16
            int r16 = r9.nextInt(r0)
            r7 = r7[r16]
            r8.s = r7
            boolean[] r7 = r11.t
            com.saterskog.cell_lab.h r0 = r8.s
            r16 = r0
            int r16 = r16.ordinal()
            boolean r7 = r7[r16]
            if (r7 == 0) goto L_0x0717
            goto L_0x015d
        L_0x073a:
            boolean r7 = r8.o
            if (r7 != 0) goto L_0x0743
            r7 = 1
        L_0x073f:
            r8.o = r7
            goto L_0x015d
        L_0x0743:
            r7 = 0
            goto L_0x073f
        L_0x0745:
            boolean r7 = r8.q
            if (r7 != 0) goto L_0x074e
            r7 = 1
        L_0x074a:
            r8.q = r7
            goto L_0x015d
        L_0x074e:
            r7 = 0
            goto L_0x074a
        L_0x0750:
            boolean r7 = r8.r
            if (r7 != 0) goto L_0x0759
            r7 = 1
        L_0x0755:
            r8.r = r7
            goto L_0x015d
        L_0x0759:
            r7 = 0
            goto L_0x0755
        L_0x075b:
            r7 = 0
            r16 = 1108082688(0x420c0000, float:35.0)
            float r0 = r8.h
            r17 = r0
            r0 = r16
            r1 = r17
            float r7 = com.saterskog.cell_lab.Gene.a(r7, r0, r1, r9)
            r8.h = r7
            goto L_0x015d
        L_0x076e:
            boolean r7 = r11.u
            if (r7 != 0) goto L_0x0246
            int r7 = r12.G
            int r7 = r7 + 1
            r12.G = r7
            r0 = r27
            com.saterskog.b.d r7 = r0.Y
            r8 = 80
            int r8 = r7.nextInt(r8)
            r9 = r8
        L_0x0783:
            if (r8 != r9) goto L_0x0791
            r0 = r27
            com.saterskog.b.d r7 = r0.Y
            r9 = 80
            int r7 = r7.nextInt(r9)
            r9 = r7
            goto L_0x0783
        L_0x0791:
            r0 = r27
            com.saterskog.b.d r7 = r0.Y
            r14 = 3
            int r7 = r7.nextInt(r14)
            if (r7 != 0) goto L_0x07c4
            r0 = r27
            com.saterskog.b.d r14 = r0.Y
            r15 = 2
            int r14 = r14.nextInt(r15)
            if (r14 != 0) goto L_0x080a
            com.saterskog.cell_lab.Gene[] r14 = r12.I
            r14 = r14[r9]
            com.saterskog.cell_lab.Gene[] r15 = r12.I
            com.saterskog.cell_lab.Gene[] r0 = r12.I
            r16 = r0
            r16 = r16[r8]
            r0 = r16
            int r0 = r0.i
            r16 = r0
            r15 = r15[r16]
            r14.a((com.saterskog.cell_lab.Gene) r15)
            com.saterskog.cell_lab.Gene[] r14 = r12.I
            r14 = r14[r8]
            r14.i = r9
        L_0x07c4:
            r14 = 1
            if (r7 != r14) goto L_0x07f7
            com.saterskog.cell_lab.Gene[] r14 = r12.I
            r14 = r14[r9]
            r15 = 1
            r14.l = r15
            r0 = r27
            com.saterskog.b.d r14 = r0.Y
            r15 = 2
            int r14 = r14.nextInt(r15)
            if (r14 != 0) goto L_0x0828
            com.saterskog.cell_lab.Gene[] r14 = r12.I
            r14 = r14[r9]
            com.saterskog.cell_lab.Gene[] r15 = r12.I
            r15 = r15[r8]
            int r15 = r15.i
            r14.i = r15
            com.saterskog.cell_lab.Gene[] r14 = r12.I
            r14 = r14[r9]
            com.saterskog.cell_lab.Gene[] r15 = r12.I
            r15 = r15[r8]
            int r15 = r15.i
            r14.j = r15
            com.saterskog.cell_lab.Gene[] r14 = r12.I
            r14 = r14[r8]
            r14.i = r9
        L_0x07f7:
            r14 = 2
            if (r7 != r14) goto L_0x0246
            r7 = r8
        L_0x07fb:
            if (r7 == r8) goto L_0x07ff
            if (r7 != r9) goto L_0x0847
        L_0x07ff:
            r0 = r27
            com.saterskog.b.d r7 = r0.Y
            r14 = 80
            int r7 = r7.nextInt(r14)
            goto L_0x07fb
        L_0x080a:
            com.saterskog.cell_lab.Gene[] r14 = r12.I
            r14 = r14[r9]
            com.saterskog.cell_lab.Gene[] r15 = r12.I
            com.saterskog.cell_lab.Gene[] r0 = r12.I
            r16 = r0
            r16 = r16[r8]
            r0 = r16
            int r0 = r0.j
            r16 = r0
            r15 = r15[r16]
            r14.a((com.saterskog.cell_lab.Gene) r15)
            com.saterskog.cell_lab.Gene[] r14 = r12.I
            r14 = r14[r8]
            r14.j = r9
            goto L_0x07c4
        L_0x0828:
            com.saterskog.cell_lab.Gene[] r14 = r12.I
            r14 = r14[r9]
            com.saterskog.cell_lab.Gene[] r15 = r12.I
            r15 = r15[r8]
            int r15 = r15.j
            r14.i = r15
            com.saterskog.cell_lab.Gene[] r14 = r12.I
            r14 = r14[r9]
            com.saterskog.cell_lab.Gene[] r15 = r12.I
            r15 = r15[r8]
            int r15 = r15.j
            r14.j = r15
            com.saterskog.cell_lab.Gene[] r14 = r12.I
            r14 = r14[r8]
            r14.j = r9
            goto L_0x07f7
        L_0x0847:
            r0 = r27
            com.saterskog.b.d r14 = r0.Y
            r15 = 2
            int r14 = r14.nextInt(r15)
            if (r14 != 0) goto L_0x0885
            com.saterskog.cell_lab.Gene[] r14 = r12.I
            r14 = r14[r8]
            int r14 = r14.j
            com.saterskog.cell_lab.Gene[] r15 = r12.I
            r8 = r15[r8]
            r8.j = r9
            r0 = r27
            com.saterskog.b.d r8 = r0.Y
            r15 = 2
            int r8 = r8.nextInt(r15)
            if (r8 != 0) goto L_0x0877
            com.saterskog.cell_lab.Gene[] r8 = r12.I
            r8 = r8[r9]
            r8.i = r7
            com.saterskog.cell_lab.Gene[] r7 = r12.I
            r7 = r7[r9]
            r7.j = r14
            goto L_0x0246
        L_0x0877:
            com.saterskog.cell_lab.Gene[] r8 = r12.I
            r8 = r8[r9]
            r8.i = r14
            com.saterskog.cell_lab.Gene[] r8 = r12.I
            r8 = r8[r9]
            r8.j = r7
            goto L_0x0246
        L_0x0885:
            com.saterskog.cell_lab.Gene[] r14 = r12.I
            r14 = r14[r8]
            int r14 = r14.i
            com.saterskog.cell_lab.Gene[] r15 = r12.I
            r8 = r15[r8]
            r8.i = r9
            r0 = r27
            com.saterskog.b.d r8 = r0.Y
            r15 = 2
            int r8 = r8.nextInt(r15)
            if (r8 != 0) goto L_0x08aa
            com.saterskog.cell_lab.Gene[] r8 = r12.I
            r8 = r8[r9]
            r8.i = r7
            com.saterskog.cell_lab.Gene[] r7 = r12.I
            r7 = r7[r9]
            r7.j = r14
            goto L_0x0246
        L_0x08aa:
            com.saterskog.cell_lab.Gene[] r8 = r12.I
            r8 = r8[r9]
            r8.i = r14
            com.saterskog.cell_lab.Gene[] r8 = r12.I
            r8 = r8[r9]
            r8.j = r7
            goto L_0x0246
        L_0x08b8:
            r7 = 0
        L_0x08b9:
            r8 = 3
            if (r7 >= r8) goto L_0x08de
            float[] r8 = r12.J
            r9 = r8[r7]
            double r10 = (double) r9
            com.saterskog.cell_lab.Gene[] r9 = r12.I
            int r14 = r12.D
            r9 = r9[r14]
            float[] r9 = r9.a
            r9 = r9[r7]
            float[] r14 = r12.J
            r14 = r14[r7]
            float r9 = r9 - r14
            double r14 = (double) r9
            r16 = 4620693217682128896(0x4020000000000000, double:8.0)
            double r14 = r14 * r16
            double r14 = r14 * r28
            double r10 = r10 + r14
            float r9 = (float) r10
            r8[r7] = r9
            int r7 = r7 + 1
            goto L_0x08b9
        L_0x08de:
            double r14 = r12.a()
            float r7 = r13.g
            double r8 = (double) r7
            float r7 = r13.b
            double r10 = (double) r7
            r16 = 4600156803381319434(0x3fd70a3d70a3d70a, double:0.36)
            int r7 = (r10 > r16 ? 1 : (r10 == r16 ? 0 : -1))
            if (r7 <= 0) goto L_0x08fc
            r10 = 4599897396042782893(0x3fd61e4f765fd8ad, double:0.34559999999999996)
            int r7 = (r14 > r10 ? 1 : (r14 == r10 ? 0 : -1))
            if (r7 <= 0) goto L_0x08fc
            r8 = 0
        L_0x08fc:
            boolean r7 = r13.o
            if (r7 == 0) goto L_0x091e
            double r10 = r12.w
            r16 = 4591409011465114983(0x3fb7f62b6ae7d567, double:0.0936)
            int r7 = (r10 > r16 ? 1 : (r10 == r16 ? 0 : -1))
            if (r7 >= 0) goto L_0x091e
            r10 = 4646852146767729395(0x407cef684bda12f3, double:462.96296296296276)
            r16 = 4591409011465114983(0x3fb7f62b6ae7d567, double:0.0936)
            double r0 = r12.w
            r18 = r0
            double r16 = r16 - r18
            double r10 = r10 * r16
            double r8 = r8 + r10
        L_0x091e:
            r7 = 0
        L_0x091f:
            int r10 = r12.C
            if (r7 >= r10) goto L_0x0a2f
            com.saterskog.cell_lab.Link[] r10 = r12.H
            r10 = r10[r7]
            int r10 = r10.a
            r11 = -1
            if (r10 == r11) goto L_0x0a2b
            r0 = r27
            com.saterskog.cell_lab.Cell[] r10 = r0.x
            com.saterskog.cell_lab.Link[] r11 = r12.H
            r11 = r11[r7]
            int r11 = r11.a
            r16 = r10[r11]
            r0 = r16
            com.saterskog.cell_lab.Gene[] r10 = r0.I
            r0 = r16
            int r11 = r0.D
            r10 = r10[r11]
            float r10 = r10.g
            double r10 = (double) r10
            double r18 = r16.a()
            r0 = r16
            com.saterskog.cell_lab.Gene[] r0 = r0.I
            r17 = r0
            r0 = r16
            int r0 = r0.D
            r20 = r0
            r17 = r17[r20]
            r0 = r17
            float r0 = r0.b
            r17 = r0
            r0 = r17
            double r0 = (double) r0
            r20 = r0
            r22 = 4600156803381319434(0x3fd70a3d70a3d70a, double:0.36)
            int r17 = (r20 > r22 ? 1 : (r20 == r22 ? 0 : -1))
            if (r17 <= 0) goto L_0x0976
            r20 = 4599897396042782893(0x3fd61e4f765fd8ad, double:0.34559999999999996)
            int r17 = (r18 > r20 ? 1 : (r18 == r20 ? 0 : -1))
            if (r17 <= 0) goto L_0x0976
            r10 = 0
        L_0x0976:
            r0 = r16
            com.saterskog.cell_lab.Gene[] r0 = r0.I
            r17 = r0
            r0 = r16
            int r0 = r0.D
            r20 = r0
            r17 = r17[r20]
            r0 = r17
            boolean r0 = r0.o
            r17 = r0
            if (r17 == 0) goto L_0x09b1
            r0 = r16
            double r0 = r0.w
            r20 = r0
            r22 = 4591409011465114983(0x3fb7f62b6ae7d567, double:0.0936)
            int r17 = (r20 > r22 ? 1 : (r20 == r22 ? 0 : -1))
            if (r17 >= 0) goto L_0x09b1
            r20 = 4646852146767729395(0x407cef684bda12f3, double:462.96296296296276)
            r22 = 4591409011465114983(0x3fb7f62b6ae7d567, double:0.0936)
            r0 = r16
            double r0 = r0.w
            r24 = r0
            double r22 = r22 - r24
            double r20 = r20 * r22
            double r10 = r10 + r20
        L_0x09b1:
            double r10 = r10 * r14
            double r18 = r18 * r8
            double r10 = r10 - r18
            r18 = 4591870180066957722(0x3fb999999999999a, double:0.1)
            int r17 = (r10 > r18 ? 1 : (r10 == r18 ? 0 : -1))
            if (r17 <= 0) goto L_0x09c4
            r10 = 4591870180066957722(0x3fb999999999999a, double:0.1)
        L_0x09c4:
            r18 = -4631501856787818086(0xbfb999999999999a, double:-0.1)
            int r17 = (r10 > r18 ? 1 : (r10 == r18 ? 0 : -1))
            if (r17 >= 0) goto L_0x09d2
            r10 = -4631501856787818086(0xbfb999999999999a, double:-0.1)
        L_0x09d2:
            double r0 = r12.Q
            r18 = r0
            double r10 = r10 * r28
            double r10 = r18 - r10
            r12.Q = r10
            double r10 = r12.p
            r0 = r16
            double r0 = r0.p
            r18 = r0
            double r10 = r10 - r18
            r18 = 4603579539098121011(0x3fe3333333333333, double:0.6)
            int r17 = (r10 > r18 ? 1 : (r10 == r18 ? 0 : -1))
            if (r17 <= 0) goto L_0x09f4
            r10 = 4603579539098121011(0x3fe3333333333333, double:0.6)
        L_0x09f4:
            r18 = -4619792497756654797(0xbfe3333333333333, double:-0.6)
            int r17 = (r10 > r18 ? 1 : (r10 == r18 ? 0 : -1))
            if (r17 >= 0) goto L_0x0a02
            r10 = -4619792497756654797(0xbfe3333333333333, double:-0.6)
        L_0x0a02:
            double r0 = r12.R
            r18 = r0
            double r10 = r10 * r28
            double r10 = r18 - r10
            r12.R = r10
            float r10 = r12.Z
            double r10 = (double) r10
            r17 = 1077936128(0x40400000, float:3.0)
            r0 = r16
            float r0 = r0.X
            r16 = r0
            float r0 = r12.X
            r18 = r0
            float r16 = r16 - r18
            float r16 = r16 * r17
            r0 = r16
            double r0 = (double) r0
            r16 = r0
            double r16 = r16 * r28
            double r10 = r10 + r16
            float r10 = (float) r10
            r12.Z = r10
        L_0x0a2b:
            int r7 = r7 + 1
            goto L_0x091f
        L_0x0a2f:
            com.saterskog.cell_lab.h r7 = r13.s
            com.saterskog.cell_lab.h r8 = com.saterskog.cell_lab.h.LIPOCYTE
            if (r7 != r8) goto L_0x0aa6
            double r8 = r12.Q
            r10 = 4600156803381319434(0x3fd70a3d70a3d70a, double:0.36)
            int r7 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r7 <= 0) goto L_0x0a82
            float r7 = r12.S
            double r8 = (double) r7
            double r10 = r12.Q
            r14 = 4600156803381319434(0x3fd70a3d70a3d70a, double:0.36)
            double r10 = r10 - r14
            double r8 = r8 + r10
            float r7 = (float) r8
            r12.S = r7
            r8 = 4600156803381319434(0x3fd70a3d70a3d70a, double:0.36)
            r12.Q = r8
            float r7 = r12.S
            r8 = 1072064102(0x3fe66666, float:1.8)
            int r7 = (r7 > r8 ? 1 : (r7 == r8 ? 0 : -1))
            if (r7 <= 0) goto L_0x0a64
            r7 = 1072064102(0x3fe66666, float:1.8)
            r12.S = r7
        L_0x0a64:
            double r8 = r12.R
            r10 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            int r7 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r7 <= 0) goto L_0x0a70
            r8 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            r12.R = r8
        L_0x0a70:
            double r8 = r12.p
            r10 = 4591870180066957722(0x3fb999999999999a, double:0.1)
            int r7 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r7 >= 0) goto L_0x0a7e
            r7 = 1
            r12.x = r7
        L_0x0a7e:
            int r6 = r6 + 1
            goto L_0x0001
        L_0x0a82:
            float r7 = r12.S
            r8 = 0
            int r7 = (r7 > r8 ? 1 : (r7 == r8 ? 0 : -1))
            if (r7 <= 0) goto L_0x0a64
            float r7 = r12.S
            double r8 = (double) r7
            r10 = 4600156803381319434(0x3fd70a3d70a3d70a, double:0.36)
            double r14 = r12.Q
            double r10 = r10 - r14
            double r8 = java.lang.Math.min(r8, r10)
            double r10 = r12.Q
            double r10 = r10 + r8
            r12.Q = r10
            float r7 = r12.S
            double r10 = (double) r7
            double r8 = r10 - r8
            float r7 = (float) r8
            r12.S = r7
            goto L_0x0a64
        L_0x0aa6:
            double r8 = r12.Q
            r10 = 4600156803381319434(0x3fd70a3d70a3d70a, double:0.36)
            int r7 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r7 <= 0) goto L_0x0a64
            r8 = 4600156803381319434(0x3fd70a3d70a3d70a, double:0.36)
            r12.Q = r8
            goto L_0x0a64
        L_0x0ab9:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.saterskog.cell_lab.CellWorld.g(double):void");
    }

    private void h(double d2) {
        int i2 = 0;
        while (i2 < this.C) {
            this.y[i2].d += 0.5d * d2;
            double d3 = this.y[i2].c / 0.03d;
            if (this.y[i2].d > d3 * 1.0d * d3) {
                e eVar = this.y[i2];
                e eVar2 = this.y[this.C - 1];
                eVar.a = eVar2.a;
                eVar.b = eVar2.b;
                eVar.c = eVar2.c;
                eVar.d = eVar2.d;
                eVar.e[0] = eVar2.e[0];
                eVar.e[1] = eVar2.e[1];
                eVar.e[2] = eVar2.e[2];
                eVar.e[3] = eVar2.e[3];
                this.C--;
                i2--;
            }
            i2++;
        }
    }

    private void k() {
        double b2;
        double b3;
        double b4;
        double b5;
        boolean z2 = false;
        if (this.e.w) {
            boolean[] zArr = this.e.t;
            int length = zArr.length;
            int i2 = 0;
            while (true) {
                if (i2 >= length) {
                    break;
                } else if (zArr[i2]) {
                    z2 = true;
                    break;
                } else {
                    i2++;
                }
            }
            if (z2) {
                while (this.z < this.ab) {
                    do {
                        b4 = this.Y.b() * this.e.k;
                        b5 = this.Y.b() * this.e.k;
                    } while ((b4 * b4) + (b5 * b5) > this.e.k * this.e.k);
                    b(b4, b5);
                }
                if (this.Y.nextInt(15) == 0) {
                    do {
                        b2 = this.Y.b() * this.e.k;
                        b3 = this.Y.b() * this.e.k;
                    } while ((b2 * b2) + (b3 * b3) > this.e.k * this.e.k);
                    b(b2, b3);
                }
            }
        }
    }

    private void i(double d2) {
        double b2;
        double b3;
        int a2 = this.Y.a(((((this.e.a * this.e.k) * this.e.k) / this.e.b) / (1.0d + this.e.p)) * d2);
        for (int i2 = 0; i2 < a2; i2++) {
            do {
                b2 = this.Y.b() * this.e.k;
                b3 = this.Y.b() * this.e.k;
            } while ((b2 * b2) + (b3 * b3) > this.e.k * this.e.k);
            int i3 = 1;
            if (this.e.p > 0.0d) {
                i3 = this.Y.a(1.0d + this.e.p);
            }
            for (int i4 = 0; i4 < i3; i4++) {
                a((this.Y.nextGaussian() * this.e.q) + b2, (this.Y.nextGaussian() * this.e.q) + b3, this.e.b, this.e.o);
            }
        }
    }

    private void l() {
        float f2;
        float f3;
        if (!this.L) {
            a.b("ctdextras:Tried to construct primitives for not yet calculated geometry");
            return;
        }
        int length = h.B.length;
        int i2 = length + (this.bg ? 1 : 0);
        int i3 = this.av[i2 - 1] + this.aw[i2 - 1];
        for (int i4 = 0; i4 < length; i4++) {
            int[] iArr = this.D[i4];
            h hVar = h.B[i4];
            if (hVar.y == -1) {
                this.aw[i2 + i4] = i3;
                this.av[i2 + i4] = 0;
            } else {
                this.aw[i2 + i4] = i3;
                if (hVar.t) {
                    double d2 = 1.0d / (hVar.A * 33.333333333333336d);
                    double sqrt = Math.sqrt(1.0d - (d2 * d2));
                    for (int i5 = 0; i5 < this.E[i4]; i5++) {
                        Cell cell = this.x[iArr[i5]];
                        float f4 = cell.J[0] + (cell.X * 0.1f);
                        float f5 = cell.J[1] + cell.Y;
                        float f6 = cell.J[2];
                        double sin = Math.sin(cell.k) * cell.d;
                        double cos = Math.cos(cell.k) * cell.d;
                        this.ad[i3 * 2] = (float) (((-sin) * sqrt) - (cos * d2));
                        this.ad[(i3 * 2) + 1] = (float) ((cos * sqrt) - (sin * d2));
                        this.ad[(i3 * 2) + 2] = (float) ((sin * sqrt) - (cos * d2));
                        this.ad[(i3 * 2) + 3] = (float) (((-cos) * sqrt) - (sin * d2));
                        this.ad[(i3 * 2) + 4] = (float) (cos * (-hVar.A) * 33.333333333333336d);
                        this.ad[(i3 * 2) + 5] = (float) (sin * (-hVar.A) * 33.333333333333336d);
                        float f7 = cell.r;
                        this.ae[i3 * 4] = (float) d2;
                        this.ae[(i3 * 4) + 1] = (float) sqrt;
                        this.ae[(i3 * 4) + 2] = f7;
                        this.ae[(i3 * 4) + 3] = 0.0f;
                        this.ae[(i3 * 4) + 4] = (float) d2;
                        this.ae[(i3 * 4) + 5] = (float) (-sqrt);
                        this.ae[(i3 * 4) + 6] = f7;
                        this.ae[(i3 * 4) + 7] = 0.0f;
                        this.ae[(i3 * 4) + 8] = (float) (hVar.A * 33.333333333333336d);
                        this.ae[(i3 * 4) + 9] = 0.0f;
                        this.ae[(i3 * 4) + 10] = f7;
                        this.ae[(i3 * 4) + 11] = 0.0f;
                        this.ag[i3 * 4] = f4;
                        this.ag[(i3 * 4) + 1] = f5;
                        this.ag[(i3 * 4) + 2] = f6;
                        this.ag[(i3 * 4) + 3] = (float) cell.d;
                        this.ag[(i3 * 4) + 4] = f4;
                        this.ag[(i3 * 4) + 5] = f5;
                        this.ag[(i3 * 4) + 6] = f6;
                        this.ag[(i3 * 4) + 7] = (float) cell.d;
                        this.ag[(i3 * 4) + 8] = f4;
                        this.ag[(i3 * 4) + 9] = f5;
                        this.ag[(i3 * 4) + 10] = f6;
                        this.ag[(i3 * 4) + 11] = (float) cell.d;
                        this.af[i3 * 4] = (float) cell.b;
                        this.af[(i3 * 4) + 1] = (float) cell.c;
                        this.af[(i3 * 4) + 2] = 0.0f;
                        this.af[(i3 * 4) + 3] = 0.0f;
                        this.af[(i3 * 4) + 4] = (float) cell.b;
                        this.af[(i3 * 4) + 5] = (float) cell.c;
                        this.af[(i3 * 4) + 6] = 0.0f;
                        this.af[(i3 * 4) + 7] = 0.0f;
                        this.af[(i3 * 4) + 8] = (float) cell.b;
                        this.af[(i3 * 4) + 9] = (float) cell.c;
                        this.af[(i3 * 4) + 10] = 0.0f;
                        this.af[(i3 * 4) + 11] = 0.0f;
                        i3 += 3;
                    }
                } else {
                    for (int i6 = 0; i6 < this.E[i4]; i6++) {
                        Cell cell2 = this.x[iArr[i6]];
                        float f8 = cell2.J[0] + (cell2.X * 0.1f);
                        float f9 = cell2.J[1] + cell2.Y;
                        float f10 = cell2.J[2];
                        float cos2 = (float) (Math.cos(cell2.k) * (cell2.d + hVar.A));
                        float sin2 = (float) (Math.sin(cell2.k) * (cell2.d + hVar.A));
                        float f11 = -sin2;
                        float f12 = 0.0f;
                        float f13 = 0.0f;
                        float f14 = 0.0f;
                        if (hVar == h.STEREOCYTE || hVar == h.SENSEOCYTE || hVar == h.SECROCYTE) {
                            f12 = (float) cell2.k;
                        }
                        if (hVar == h.GLUEOCYTE) {
                            f13 = (float) cell2.u;
                            f14 = (float) cell2.v;
                        }
                        if (hVar == h.CILIOCYTE) {
                            f2 = cell2.y ? cell2.s : cell2.r;
                            f3 = cell2.y ? cell2.r : cell2.s;
                        } else {
                            float f15 = f14;
                            f2 = f13;
                            f3 = f15;
                        }
                        this.ad[(i3 * 2) + 0] = (-cos2) + f11;
                        this.ad[(i3 * 2) + 1] = (-sin2) + cos2;
                        this.ad[(i3 * 2) + 2] = cos2 - f11;
                        this.ad[(i3 * 2) + 3] = sin2 - cos2;
                        this.ad[(i3 * 2) + 4] = cos2 + f11;
                        this.ad[(i3 * 2) + 5] = sin2 + cos2;
                        this.ad[(i3 * 2) + 6] = (-cos2) + f11;
                        this.ad[(i3 * 2) + 7] = (-sin2) + cos2;
                        this.ad[(i3 * 2) + 8] = (-cos2) - f11;
                        this.ad[(i3 * 2) + 9] = (-sin2) - cos2;
                        this.ad[(i3 * 2) + 10] = cos2 - f11;
                        this.ad[(i3 * 2) + 11] = sin2 - cos2;
                        this.ae[i3 * 4] = -1.0f;
                        this.ae[(i3 * 4) + 1] = 1.0f;
                        this.ae[(i3 * 4) + 2] = f2;
                        this.ae[(i3 * 4) + 3] = f3;
                        this.ae[(i3 * 4) + 4] = 1.0f;
                        this.ae[(i3 * 4) + 5] = -1.0f;
                        this.ae[(i3 * 4) + 6] = f2;
                        this.ae[(i3 * 4) + 7] = f3;
                        this.ae[(i3 * 4) + 8] = 1.0f;
                        this.ae[(i3 * 4) + 9] = 1.0f;
                        this.ae[(i3 * 4) + 10] = f2;
                        this.ae[(i3 * 4) + 11] = f3;
                        this.ae[(i3 * 4) + 12] = -1.0f;
                        this.ae[(i3 * 4) + 13] = 1.0f;
                        this.ae[(i3 * 4) + 14] = f2;
                        this.ae[(i3 * 4) + 15] = f3;
                        this.ae[(i3 * 4) + 16] = -1.0f;
                        this.ae[(i3 * 4) + 17] = -1.0f;
                        this.ae[(i3 * 4) + 18] = f2;
                        this.ae[(i3 * 4) + 19] = f3;
                        this.ae[(i3 * 4) + 20] = 1.0f;
                        this.ae[(i3 * 4) + 21] = -1.0f;
                        this.ae[(i3 * 4) + 22] = f2;
                        this.ae[(i3 * 4) + 23] = f3;
                        this.ag[i3 * 4] = f8;
                        this.ag[(i3 * 4) + 1] = f9;
                        this.ag[(i3 * 4) + 2] = f10;
                        this.ag[(i3 * 4) + 3] = (float) cell2.d;
                        this.ag[(i3 * 4) + 4] = f8;
                        this.ag[(i3 * 4) + 5] = f9;
                        this.ag[(i3 * 4) + 6] = f10;
                        this.ag[(i3 * 4) + 7] = (float) cell2.d;
                        this.ag[(i3 * 4) + 8] = f8;
                        this.ag[(i3 * 4) + 9] = f9;
                        this.ag[(i3 * 4) + 10] = f10;
                        this.ag[(i3 * 4) + 11] = (float) cell2.d;
                        this.ag[(i3 * 4) + 12] = f8;
                        this.ag[(i3 * 4) + 13] = f9;
                        this.ag[(i3 * 4) + 14] = f10;
                        this.ag[(i3 * 4) + 15] = (float) cell2.d;
                        this.ag[(i3 * 4) + 16] = f8;
                        this.ag[(i3 * 4) + 17] = f9;
                        this.ag[(i3 * 4) + 18] = f10;
                        this.ag[(i3 * 4) + 19] = (float) cell2.d;
                        this.ag[(i3 * 4) + 20] = f8;
                        this.ag[(i3 * 4) + 21] = f9;
                        this.ag[(i3 * 4) + 22] = f10;
                        this.ag[(i3 * 4) + 23] = (float) cell2.d;
                        float f16 = (float) cell2.t;
                        if (hVar == h.SECROCYTE) {
                            f16 = cell2.r;
                        }
                        this.af[i3 * 4] = (float) cell2.b;
                        this.af[(i3 * 4) + 1] = (float) cell2.c;
                        this.af[(i3 * 4) + 2] = f16;
                        this.af[(i3 * 4) + 3] = f12;
                        this.af[(i3 * 4) + 4] = (float) cell2.b;
                        this.af[(i3 * 4) + 5] = (float) cell2.c;
                        this.af[(i3 * 4) + 6] = f16;
                        this.af[(i3 * 4) + 7] = f12;
                        this.af[(i3 * 4) + 8] = (float) cell2.b;
                        this.af[(i3 * 4) + 9] = (float) cell2.c;
                        this.af[(i3 * 4) + 10] = f16;
                        this.af[(i3 * 4) + 11] = f12;
                        this.af[(i3 * 4) + 12] = (float) cell2.b;
                        this.af[(i3 * 4) + 13] = (float) cell2.c;
                        this.af[(i3 * 4) + 14] = f16;
                        this.af[(i3 * 4) + 15] = f12;
                        this.af[(i3 * 4) + 16] = (float) cell2.b;
                        this.af[(i3 * 4) + 17] = (float) cell2.c;
                        this.af[(i3 * 4) + 18] = f16;
                        this.af[(i3 * 4) + 19] = f12;
                        this.af[(i3 * 4) + 20] = (float) cell2.b;
                        this.af[(i3 * 4) + 21] = (float) cell2.c;
                        this.af[(i3 * 4) + 22] = f16;
                        this.af[(i3 * 4) + 23] = f12;
                        i3 += 6;
                    }
                }
                this.av[i2 + i4] = i3 - this.aw[i2 + i4];
            }
        }
    }

    public final void a(float f2, float f3, float f4, float f5) {
        float f6;
        float f7;
        float f8;
        float f9;
        h hVar;
        a.b();
        if (!this.L) {
            a.b("ctd:Tried to construct primitives for not yet calculated geometry");
            return;
        }
        float f10 = f2 - 0.12f;
        float f11 = f3 + 0.12f;
        float f12 = f4 - 0.12f;
        float f13 = f5 + 0.12f;
        for (int i2 = 0; i2 < h.B.length + 1; i2++) {
            this.E[i2] = 0;
        }
        for (int i3 = 0; i3 < this.z; i3++) {
            Cell cell = this.x[i3];
            if (cell.b >= ((double) f10) && cell.b <= ((double) f11) && cell.c >= ((double) f12) && cell.c <= ((double) f13) && !cell.x) {
                int ordinal = cell.I[cell.D].s.ordinal();
                this.D[ordinal][this.E[ordinal]] = i3;
                int[] iArr = this.E;
                iArr[ordinal] = iArr[ordinal] + 1;
            }
        }
        if (this.bg) {
            for (int i4 = 0; i4 < this.z; i4++) {
                this.D[h.B.length][this.E[h.B.length]] = i4;
                int[] iArr2 = this.E;
                int length = h.B.length;
                iArr2[length] = iArr2[length] + 1;
            }
        }
        a.b();
        int i5 = 0;
        int i6 = 0;
        int i7 = 0;
        while (true) {
            int i8 = i7;
            if (i8 < (this.bg ? 1 : 0) + h.B.length) {
                if (i8 < h.B.length) {
                    hVar = h.B[i8];
                } else {
                    hVar = null;
                }
                this.aw[i8] = i5;
                if (hVar == null || hVar.w != -1) {
                    int i9 = 0;
                    this.q[i8][0] = i5;
                    this.r[i8][0] = i6;
                    int[] iArr3 = this.D[i8];
                    int i10 = 0;
                    int i11 = i5;
                    while (true) {
                        if (i10 < this.E[i8]) {
                            Cell cell2 = this.x[iArr3[i10]];
                            Gene b2 = cell2.b();
                            for (int i12 = 0; i12 < cell2.B; i12++) {
                                for (int i13 = 1; i13 < cell2.B; i13++) {
                                    int i14 = (i12 + i13) % cell2.B;
                                    if (!cell2.A[i14].e) {
                                        double d2 = cell2.A[i12].c - cell2.A[i12].a;
                                        double d3 = cell2.A[i14].a - cell2.A[i14].c;
                                        double d4 = cell2.A[i12].d - cell2.A[i12].b;
                                        double d5 = cell2.A[i14].b - cell2.A[i14].d;
                                        double d6 = cell2.A[i14].a - cell2.A[i12].a;
                                        double d7 = cell2.A[i14].b - cell2.A[i12].b;
                                        double d8 = (d2 * d5) - (d3 * d4);
                                        double d9 = ((d5 * d6) - (d3 * d7)) / d8;
                                        double d10 = ((d2 * d7) + ((-d4) * d6)) / d8;
                                        double d11 = ((cell2.A[i12].c - cell2.A[i14].a) * d5) - (d3 * (cell2.A[i12].d - cell2.A[i14].b));
                                        if (0.0d < d9 && d9 < 1.0d && 1.0d > d10 && d10 > 0.0d) {
                                            if (d11 < 0.0d) {
                                                u uVar = cell2.A[i14];
                                                u uVar2 = cell2.A[i12];
                                                double d12 = cell2.A[i12].a + ((cell2.A[i12].c - cell2.A[i12].a) * d9);
                                                uVar2.c = d12;
                                                uVar.a = d12;
                                                u uVar3 = cell2.A[i14];
                                                u uVar4 = cell2.A[i12];
                                                double d13 = cell2.A[i12].b + ((cell2.A[i12].d - cell2.A[i12].b) * d9);
                                                uVar4.d = d13;
                                                uVar3.b = d13;
                                                cell2.A[i12].f = true;
                                            } else {
                                                u uVar5 = cell2.A[i14];
                                                u uVar6 = cell2.A[i12];
                                                double d14 = cell2.A[i12].a + ((cell2.A[i12].c - cell2.A[i12].a) * d9);
                                                uVar6.a = d14;
                                                uVar5.c = d14;
                                                u uVar7 = cell2.A[i14];
                                                u uVar8 = cell2.A[i12];
                                                double d15 = cell2.A[i12].b + ((cell2.A[i12].d - cell2.A[i12].b) * d9);
                                                uVar8.b = d15;
                                                uVar7.d = d15;
                                                cell2.A[i14].f = true;
                                            }
                                            if ((cell2.A[i12].a * cell2.A[i12].d) - (cell2.A[i12].b * cell2.A[i12].c) < 0.0d) {
                                                cell2.A[i12].e = true;
                                            }
                                            if ((cell2.A[i14].a * cell2.A[i14].d) - (cell2.A[i14].b * cell2.A[i14].c) < 0.0d) {
                                                cell2.A[i14].e = true;
                                            }
                                        }
                                    }
                                }
                            }
                            for (int i15 = 0; i15 < cell2.B; i15++) {
                                if (!cell2.A[i15].e) {
                                    for (int i16 = 0; i16 < cell2.B; i16++) {
                                        if (!(i16 == i15 || ((cell2.A[i15].a == cell2.A[i16].c && cell2.A[i15].b == cell2.A[i16].d) || (cell2.A[i15].c == cell2.A[i16].a && cell2.A[i15].d == cell2.A[i16].b)))) {
                                            double d16 = cell2.A[i16].a - cell2.A[i16].c;
                                            double d17 = cell2.A[i16].b - cell2.A[i16].d;
                                            double d18 = ((d17 * (cell2.A[i16].a - 0.0d)) - (d16 * (cell2.A[i16].b - 0.0d))) / (((cell2.A[i15].a - 0.0d) * d17) - ((cell2.A[i15].b - 0.0d) * d16));
                                            if (d18 > 0.0d && 1.0d > d18) {
                                                cell2.A[i15].e = true;
                                            }
                                        }
                                    }
                                }
                            }
                            if (cell2.B > 1) {
                                if (cell2.B != 2) {
                                    Arrays.sort(cell2.A, 0, cell2.B);
                                } else if (cell2.A[0].compareTo(cell2.A[1]) == 1) {
                                    u uVar9 = cell2.A[0];
                                    cell2.A[0] = cell2.A[1];
                                    cell2.A[1] = uVar9;
                                }
                            }
                            float f14 = cell2.J[0] + (cell2.X * 0.1f);
                            float f15 = cell2.J[1] + cell2.Y;
                            float f16 = cell2.J[2];
                            if (i11 - i5 > 32557) {
                                this.s[i8][i9] = i11 - this.q[i8][i9];
                                this.t[i8][i9] = i6 - this.r[i8][i9];
                                if (i9 >= 201) {
                                    a.a("Too many bunches..");
                                } else {
                                    i9++;
                                    this.q[i8][i9] = i11;
                                    this.r[i8][i9] = i6;
                                    i5 = i11;
                                }
                            }
                            float f17 = 0.0f;
                            float f18 = 0.0f;
                            float f19 = (float) cell2.k;
                            if (hVar != null) {
                                switch (hVar) {
                                    case LIPOCYTE:
                                        f17 = cell2.S / 1.8f;
                                        break;
                                    case SECROCYTE:
                                        f17 = cell2.r;
                                        break;
                                    case PHOTOCYTE:
                                    case GAMETE:
                                        f18 = (float) cell2.m;
                                        break;
                                    case NEUROCYTE:
                                    case STEREOCYTE:
                                    case SENSEOCYTE:
                                        f17 = 0.05f * cell2.V[0];
                                        f18 = cell2.V[1] * 0.05f;
                                        break;
                                    case MYOCYTE:
                                        f17 = -cell2.aa;
                                        f18 = cell2.ab;
                                        break;
                                    case STEMOCYTE:
                                        float max = Math.max(0.0f, cell2.a(5, 0) + 0.5f);
                                        float max2 = Math.max(0.0f, cell2.a(6, 0) + 0.5f);
                                        f17 = (max / (1.0f + (max2 * max2))) * 3.1415927f;
                                        f18 = (max2 / ((max * max) + 1.0f)) * 3.1415927f;
                                        break;
                                }
                            } else {
                                f17 = (float) (cell2.k + ((double) (((float) (cell2.y ? -1 : 1)) * b2.d)));
                                f18 = (float) (cell2.d * 2.0d * (0.5d - ((double) b2.c)));
                            }
                            float f20 = (float) cell2.b;
                            float f21 = (float) cell2.c;
                            float f22 = (float) cell2.d;
                            if (cell2.B == 0) {
                                this.ad[i11 * 2] = f22;
                                this.ad[(i11 * 2) + 1] = f22;
                                this.ad[(i11 * 2) + 2] = f22;
                                this.ad[(i11 * 2) + 3] = -f22;
                                this.ad[(i11 * 2) + 4] = -f22;
                                this.ad[(i11 * 2) + 5] = -f22;
                                this.ad[(i11 * 2) + 6] = -f22;
                                this.ad[(i11 * 2) + 7] = f22;
                                this.ae[i11 * 4] = f17;
                                this.ae[(i11 * 4) + 1] = 0.0f;
                                this.ae[(i11 * 4) + 2] = f19;
                                this.ae[(i11 * 4) + 3] = f18;
                                this.ae[(i11 * 4) + 4] = f17;
                                this.ae[(i11 * 4) + 5] = 0.0f;
                                this.ae[(i11 * 4) + 6] = f19;
                                this.ae[(i11 * 4) + 7] = f18;
                                this.ae[(i11 * 4) + 8] = f17;
                                this.ae[(i11 * 4) + 9] = 0.0f;
                                this.ae[(i11 * 4) + 10] = f19;
                                this.ae[(i11 * 4) + 11] = f18;
                                this.ae[(i11 * 4) + 12] = f17;
                                this.ae[(i11 * 4) + 13] = 0.0f;
                                this.ae[(i11 * 4) + 14] = f19;
                                this.ae[(i11 * 4) + 15] = f18;
                                this.af[(i11 * 2) + 0] = f20;
                                this.af[(i11 * 2) + 1] = f21;
                                this.af[(i11 * 2) + 2] = f20;
                                this.af[(i11 * 2) + 3] = f21;
                                this.af[(i11 * 2) + 4] = f20;
                                this.af[(i11 * 2) + 5] = f21;
                                this.af[(i11 * 2) + 6] = f20;
                                this.af[(i11 * 2) + 7] = f21;
                                this.ag[i11 * 4] = f14;
                                this.ag[(i11 * 4) + 1] = f15;
                                this.ag[(i11 * 4) + 2] = f16;
                                this.ag[(i11 * 4) + 3] = f22;
                                this.ag[(i11 * 4) + 4] = f14;
                                this.ag[(i11 * 4) + 5] = f15;
                                this.ag[(i11 * 4) + 6] = f16;
                                this.ag[(i11 * 4) + 7] = f22;
                                this.ag[(i11 * 4) + 8] = f14;
                                this.ag[(i11 * 4) + 9] = f15;
                                this.ag[(i11 * 4) + 10] = f16;
                                this.ag[(i11 * 4) + 11] = f22;
                                this.ag[(i11 * 4) + 12] = f14;
                                this.ag[(i11 * 4) + 13] = f15;
                                this.ag[(i11 * 4) + 14] = f16;
                                this.ag[(i11 * 4) + 15] = f22;
                                int i17 = i6 + 1;
                                this.aq[i6] = (short) ((i11 - i5) + 0);
                                int i18 = i17 + 1;
                                this.aq[i17] = (short) ((i11 - i5) + 1);
                                int i19 = i18 + 1;
                                this.aq[i18] = (short) ((i11 - i5) + 2);
                                int i20 = i19 + 1;
                                this.aq[i19] = (short) ((i11 - i5) + 0);
                                int i21 = i20 + 1;
                                this.aq[i20] = (short) ((i11 - i5) + 2);
                                i6 = i21 + 1;
                                this.aq[i21] = (short) ((i11 - i5) + 3);
                                i11 += 4;
                            } else {
                                short s2 = (short) (i11 - i5);
                                this.ad[i11 * 2] = 0.0f;
                                this.ad[(i11 * 2) + 1] = 0.0f;
                                this.ae[i11 * 4] = f17;
                                this.ae[(i11 * 4) + 1] = 0.0f;
                                this.ae[(i11 * 4) + 2] = f19;
                                this.ae[(i11 * 4) + 3] = f18;
                                this.af[(i11 * 2) + 0] = f20;
                                this.af[(i11 * 2) + 1] = f21;
                                this.ag[i11 * 4] = f14;
                                this.ag[(i11 * 4) + 1] = f15;
                                this.ag[(i11 * 4) + 2] = f16;
                                this.ag[(i11 * 4) + 3] = f22;
                                i11++;
                                for (int i22 = 0; i22 < cell2.B; i22++) {
                                    if (!cell2.A[i22].e) {
                                        this.ad[(i11 * 2) + 0] = (float) cell2.A[i22].a;
                                        this.ad[(i11 * 2) + 1] = (float) cell2.A[i22].b;
                                        this.ae[(i11 * 4) + 0] = f17;
                                        if (hVar == null) {
                                            this.ae[(i11 * 4) + 1] = 0.0f;
                                        } else {
                                            this.ae[(i11 * 4) + 1] = f22;
                                        }
                                        this.ae[(i11 * 4) + 2] = f19;
                                        this.ae[(i11 * 4) + 3] = f18;
                                        this.af[(i11 * 2) + 0] = f20;
                                        this.af[(i11 * 2) + 1] = f21;
                                        this.ag[(i11 * 4) + 0] = f14;
                                        this.ag[(i11 * 4) + 1] = f15;
                                        this.ag[(i11 * 4) + 2] = f16;
                                        this.ag[(i11 * 4) + 3] = f22;
                                        i11++;
                                        if (!cell2.A[i22].f) {
                                            int i23 = (i22 + 1) % cell2.B;
                                            if (cell2.A[i23].e) {
                                                i23 = 0;
                                            }
                                            if ((cell2.A[i22].c * cell2.A[i23].b) - (cell2.A[i23].a * cell2.A[i22].d) > 0.0d) {
                                                this.v[0] = cell2.A[i22].c;
                                                this.v[3] = cell2.A[i23].a;
                                                this.w[0] = cell2.A[i22].d;
                                                this.w[3] = cell2.A[i23].b;
                                                double d19 = this.v[0] + this.v[3];
                                                double d20 = this.w[0] + this.w[3];
                                                double sqrt = cell2.d / Math.sqrt((d19 * d19) + (d20 * d20));
                                                double d21 = d19 * sqrt;
                                                double d22 = d20 * sqrt;
                                                double d23 = (cell2.d * cell2.d) / ((this.w[0] * d21) - (this.v[0] * d22));
                                                this.v[1] = (this.w[0] - d22) * d23;
                                                this.w[1] = (-(this.v[0] - d21)) * d23;
                                                this.v[2] = (-(this.w[3] - d22)) * d23;
                                                this.w[2] = (this.v[3] - d21) * d23;
                                                int i24 = 0;
                                                while (i24 < 3) {
                                                    this.ad[(i11 * 2) + 0] = (float) this.v[i24];
                                                    this.ad[(i11 * 2) + 1] = (float) this.w[i24];
                                                    this.ae[(i11 * 4) + 0] = f17;
                                                    if (hVar == null) {
                                                        this.ae[(i11 * 4) + 1] = 0.0f;
                                                    } else {
                                                        this.ae[(i11 * 4) + 1] = f22;
                                                    }
                                                    this.ae[(i11 * 4) + 2] = f19;
                                                    this.ae[(i11 * 4) + 3] = f18;
                                                    this.af[(i11 * 2) + 0] = f20;
                                                    this.af[(i11 * 2) + 1] = f21;
                                                    this.ag[(i11 * 4) + 0] = f14;
                                                    this.ag[(i11 * 4) + 1] = f15;
                                                    this.ag[(i11 * 4) + 2] = f16;
                                                    this.ag[(i11 * 4) + 3] = f22;
                                                    i24++;
                                                    i11++;
                                                }
                                            } else {
                                                this.v[0] = cell2.A[i22].c;
                                                this.v[4] = cell2.A[i23].a;
                                                this.w[0] = cell2.A[i22].d;
                                                this.w[4] = cell2.A[i23].b;
                                                this.v[2] = this.v[0] + this.v[4];
                                                this.w[2] = this.w[0] + this.w[4];
                                                double sqrt2 = (-2.0d * cell2.d) / Math.sqrt((this.v[2] * this.v[2]) + (this.w[2] * this.w[2]));
                                                double[] dArr = this.v;
                                                dArr[2] = dArr[2] * sqrt2;
                                                double[] dArr2 = this.w;
                                                dArr2[2] = sqrt2 * dArr2[2];
                                                double d24 = (this.v[2] * 0.25d) + (this.w[2] * b);
                                                double d25 = (this.w[2] * 0.25d) - (this.v[2] * b);
                                                double d26 = (cell2.d * cell2.d) / ((this.w[0] * d24) - (this.v[0] * d25));
                                                this.v[1] = (this.w[0] - d25) * d26;
                                                this.w[1] = (d24 - this.v[0]) * d26;
                                                double d27 = (this.v[2] * 0.25d) - (this.w[2] * b);
                                                double d28 = (this.w[2] * 0.25d) + (this.v[2] * b);
                                                double d29 = (cell2.d * cell2.d) / ((this.w[4] * d27) - (this.v[4] * d28));
                                                this.v[3] = (this.w[4] - d28) * d29;
                                                this.w[3] = (d27 - this.v[4]) * d29;
                                                int i25 = 0;
                                                while (i25 < 4) {
                                                    this.ad[i11 * 2] = (float) this.v[i25];
                                                    this.ad[(i11 * 2) + 1] = (float) this.w[i25];
                                                    this.ae[i11 * 4] = f17;
                                                    if (hVar == null) {
                                                        this.ae[(i11 * 4) + 1] = 0.0f;
                                                    } else {
                                                        this.ae[(i11 * 4) + 1] = f22;
                                                    }
                                                    this.ae[(i11 * 4) + 2] = f19;
                                                    this.ae[(i11 * 4) + 3] = f18;
                                                    this.af[i11 * 2] = f20;
                                                    this.af[(i11 * 2) + 1] = f21;
                                                    this.ag[i11 * 4] = f14;
                                                    this.ag[(i11 * 4) + 1] = f15;
                                                    this.ag[(i11 * 4) + 2] = f16;
                                                    this.ag[(i11 * 4) + 3] = f22;
                                                    i25++;
                                                    i11++;
                                                }
                                            }
                                        }
                                    }
                                }
                                int i26 = i6;
                                for (short s3 = (short) (s2 + 1); s3 < ((short) ((i11 - i5) - 1)); s3 = (short) (s3 + 1)) {
                                    int i27 = i26 + 1;
                                    this.aq[i26] = s2;
                                    int i28 = i27 + 1;
                                    this.aq[i27] = s3;
                                    i26 = i28 + 1;
                                    this.aq[i28] = (short) (s3 + 1);
                                }
                                int i29 = i26 + 1;
                                this.aq[i26] = s2;
                                int i30 = i29 + 1;
                                this.aq[i29] = (short) ((i11 - i5) - 1);
                                i6 = i30 + 1;
                                this.aq[i30] = (short) (s2 + 1);
                            }
                            i10++;
                        }
                    }
                    this.s[i8][i9] = i11 - this.q[i8][i9];
                    this.t[i8][i9] = i6 - this.r[i8][i9];
                    this.u[i8] = i9 + 1;
                    this.av[i8] = i11 - this.aw[i8];
                    i5 = i11;
                } else {
                    this.av[i8] = 0;
                }
                i7 = i8 + 1;
            } else {
                a.b();
                float f23 = f2 - 0.06f;
                float f24 = f3 + 0.06f;
                float f25 = f4 - 0.06f;
                float f26 = f5 + 0.06f;
                this.ap = 0;
                for (int i31 = 0; i31 < this.z; i31++) {
                    Cell cell3 = this.x[i31];
                    if (cell3.b >= ((double) f23) && cell3.b <= ((double) f24) && cell3.c >= ((double) f25) && cell3.c <= ((double) f26) && cell3.C != 0) {
                        for (int i32 = 0; i32 < cell3.C; i32++) {
                            Link link = cell3.H[i32];
                            if (link.a <= i31) {
                                int i33 = 0;
                                while (i33 < cell3.B && link.a != cell3.A[i33].g) {
                                    i33++;
                                }
                                float f27 = ((float) Cell.a) * 0.7f;
                                if (i33 != cell3.B) {
                                    u uVar10 = cell3.A[i33];
                                    if (!uVar10.e) {
                                        f6 = (float) (uVar10.a + cell3.b);
                                        f7 = (float) (uVar10.c + cell3.b);
                                        f8 = (float) (uVar10.b + cell3.c);
                                        f9 = (float) (uVar10.d + cell3.c);
                                        float f28 = ((f7 - f6) * (f7 - f6)) + ((f9 - f8) * (f9 - f8));
                                        if (f28 < f27 * f27) {
                                            float f29 = 0.5f * (f6 + f7);
                                            float f30 = 0.5f * (f8 + f9);
                                            float sqrt3 = f27 / ((float) Math.sqrt((double) f28));
                                            f7 = ((f7 - f29) * sqrt3) + f29;
                                            f6 = ((f6 - f29) * sqrt3) + f29;
                                            f9 = ((f9 - f30) * sqrt3) + f30;
                                            f8 = ((f8 - f30) * sqrt3) + f30;
                                        }
                                    }
                                } else if (link.a == -1) {
                                    double sqrt4 = Math.sqrt((cell3.b * cell3.b) + (cell3.c * cell3.c));
                                    double d30 = (link.e * 0.5d) + (cell3.b * 0.5d);
                                    double d31 = (link.f * 0.5d) + (cell3.c * 0.5d);
                                    double d32 = ((double) (0.5f * f27)) / sqrt4;
                                    f6 = (float) ((cell3.c * d32) + d30);
                                    f7 = (float) (d30 - (cell3.c * d32));
                                    f8 = (float) (d31 - (cell3.b * d32));
                                    f9 = (float) ((d32 * cell3.b) + d31);
                                } else {
                                    Cell cell4 = this.x[link.a];
                                    double sqrt5 = Math.sqrt(((cell3.b - cell4.b) * (cell3.b - cell4.b)) + ((cell3.c - cell4.c) * (cell3.c - cell4.c)));
                                    double d33 = (cell3.d + (0.5d * ((sqrt5 - cell3.d) - cell4.d))) / sqrt5;
                                    double d34 = (cell3.b * d33) + (cell4.b * (1.0d - d33));
                                    double d35 = ((1.0d - d33) * cell4.c) + (cell3.c * d33);
                                    double d36 = ((double) (0.5f * f27)) / sqrt5;
                                    f6 = (float) (d34 - ((cell4.c - cell3.c) * d36));
                                    f7 = (float) (d34 + ((cell4.c - cell3.c) * d36));
                                    f8 = (float) (((cell4.b - cell3.b) * d36) + d35);
                                    f9 = (float) (d35 - (d36 * (cell4.b - cell3.b)));
                                }
                                this.an[this.ap * 4] = (float) (((double) link.g) + cell3.b);
                                this.an[(this.ap * 4) + 1] = (float) (((double) link.h) + cell3.c);
                                this.an[(this.ap * 4) + 2] = 0.0f;
                                this.an[(this.ap * 4) + 3] = 1.0f;
                                this.an[(this.ap * 4) + 4] = f6;
                                this.an[(this.ap * 4) + 5] = f8;
                                this.an[(this.ap * 4) + 6] = -1.0f;
                                this.an[(this.ap * 4) + 7] = 0.0f;
                                this.an[(this.ap * 4) + 8] = f7;
                                this.an[(this.ap * 4) + 9] = f9;
                                this.an[(this.ap * 4) + 10] = 1.0f;
                                this.an[(this.ap * 4) + 11] = 0.0f;
                                this.ao[this.ap] = (float) (-1.0d + ((2.0d * ((((((double) link.g) + cell3.b) - ((double) f6)) * ((double) (f7 - f6))) + (((((double) link.h) + cell3.c) - ((double) f8)) * ((double) (f9 - f8))))) / ((double) (((f7 - f6) * (f7 - f6)) + ((f9 - f8) * (f9 - f8))))));
                                this.ao[this.ap + 1] = -1.0f;
                                this.ao[this.ap + 2] = 1.0f;
                                this.ap += 3;
                                if (link.a == -1) {
                                    this.an[this.ap * 4] = (float) link.e;
                                    this.an[(this.ap * 4) + 1] = (float) link.f;
                                    this.an[(this.ap * 4) + 2] = 0.0f;
                                    this.an[(this.ap * 4) + 3] = 1.0f;
                                    this.an[(this.ap * 4) + 4] = f6;
                                    this.an[(this.ap * 4) + 5] = f8;
                                    this.an[(this.ap * 4) + 6] = -1.0f;
                                    this.an[(this.ap * 4) + 7] = 0.0f;
                                    this.an[(this.ap * 4) + 8] = f7;
                                    this.an[(this.ap * 4) + 9] = f9;
                                    this.an[(this.ap * 4) + 10] = 1.0f;
                                    this.an[(this.ap * 4) + 11] = 0.0f;
                                    this.ao[this.ap] = (float) (((2.0d * (((link.e - ((double) f6)) * ((double) (f7 - f6))) + ((link.f - ((double) f8)) * ((double) (f9 - f8))))) / ((double) (((f9 - f8) * (f9 - f8)) + ((f7 - f6) * (f7 - f6))))) - 4.0d);
                                    this.ao[this.ap + 1] = -1.0f;
                                    this.ao[this.ap + 2] = 1.0f;
                                } else {
                                    Cell cell5 = this.x[link.a];
                                    this.an[this.ap * 4] = (float) (((double) link.i) + cell5.b);
                                    this.an[(this.ap * 4) + 1] = (float) (((double) link.j) + cell5.c);
                                    this.an[(this.ap * 4) + 2] = 0.0f;
                                    this.an[(this.ap * 4) + 3] = 1.0f;
                                    this.an[(this.ap * 4) + 4] = f6;
                                    this.an[(this.ap * 4) + 5] = f8;
                                    this.an[(this.ap * 4) + 6] = -1.0f;
                                    this.an[(this.ap * 4) + 7] = 0.0f;
                                    this.an[(this.ap * 4) + 8] = f7;
                                    this.an[(this.ap * 4) + 9] = f9;
                                    this.an[(this.ap * 4) + 10] = 1.0f;
                                    this.an[(this.ap * 4) + 11] = 0.0f;
                                    this.ao[this.ap] = (float) (((2.0d * ((((((double) link.i) + cell5.b) - ((double) f6)) * ((double) (f7 - f6))) + (((((double) link.j) + cell5.c) - ((double) f8)) * ((double) (f9 - f8))))) / ((double) (((f9 - f8) * (f9 - f8)) + ((f7 - f6) * (f7 - f6))))) - 4.0d);
                                    this.ao[this.ap + 1] = -1.0f;
                                    this.ao[this.ap + 2] = 1.0f;
                                }
                                this.ap += 3;
                            }
                        }
                    }
                }
                a.b();
                l();
                a.b();
                b(f2, f3, f4, f5);
                a.b();
                c(f2, f3, f4, f5);
                a.b();
                return;
            }
        }
    }

    private void b(float f2, float f3, float f4, float f5) {
        float f6;
        float f7;
        float f8;
        int i2 = 0;
        float f9 = f2 - 0.007f;
        float f10 = f3 + 0.007f;
        float f11 = f4 - 0.007f;
        float f12 = f5 + 0.007f;
        for (int i3 = 0; i3 < this.B; i3++) {
            Food food = this.A[i3];
            if (food.a >= f9 && food.a <= f10 && food.b >= f11 && food.b <= f12) {
                float sqrt = (float) (0.007000000216066837d * Math.sqrt(((double) food.c) / 1.152d));
                if (food.f <= 0.0f) {
                    f6 = 0.6f;
                    f7 = 0.4f;
                    f8 = 0.2f;
                } else {
                    f6 = 0.8f + (0.2f * food.f);
                    f7 = (1.0f - food.f) * 0.4f;
                    f8 = 0.2f * (1.0f - food.f);
                }
                this.ah[i2] = 1.0f;
                this.ah[i2 + 1] = 1.0f;
                this.ah[i2 + 2] = 1.0f;
                this.ah[i2 + 3] = -1.0f;
                this.ah[i2 + 4] = -1.0f;
                this.ah[i2 + 5] = -1.0f;
                this.ai[i2] = food.a + sqrt;
                this.ai[i2 + 1] = food.b + sqrt;
                this.ai[i2 + 2] = food.a + sqrt;
                this.ai[i2 + 3] = food.b - sqrt;
                this.ai[i2 + 4] = food.a - sqrt;
                this.ai[i2 + 5] = food.b - sqrt;
                this.aj[(i2 * 2) + 0] = f6;
                this.aj[(i2 * 2) + 1] = f7;
                this.aj[(i2 * 2) + 2] = f8;
                this.aj[(i2 * 2) + 3] = 0.4f;
                this.aj[(i2 * 2) + 4] = f6;
                this.aj[(i2 * 2) + 5] = f7;
                this.aj[(i2 * 2) + 6] = f8;
                this.aj[(i2 * 2) + 7] = 0.4f;
                this.aj[(i2 * 2) + 8] = f6;
                this.aj[(i2 * 2) + 9] = f7;
                this.aj[(i2 * 2) + 10] = f8;
                this.aj[(i2 * 2) + 11] = 0.4f;
                int i4 = i2 + 6;
                this.ah[i4] = -1.0f;
                this.ah[i4 + 1] = -1.0f;
                this.ah[i4 + 2] = -1.0f;
                this.ah[i4 + 3] = 1.0f;
                this.ah[i4 + 4] = 1.0f;
                this.ah[i4 + 5] = 1.0f;
                this.ai[i4] = food.a - sqrt;
                this.ai[i4 + 1] = food.b - sqrt;
                this.ai[i4 + 2] = food.a - sqrt;
                this.ai[i4 + 3] = food.b + sqrt;
                this.ai[i4 + 4] = food.a + sqrt;
                this.ai[i4 + 5] = food.b + sqrt;
                this.aj[(i4 * 2) + 0] = f6;
                this.aj[(i4 * 2) + 1] = f7;
                this.aj[(i4 * 2) + 2] = f8;
                this.aj[(i4 * 2) + 3] = 0.4f;
                this.aj[(i4 * 2) + 4] = f6;
                this.aj[(i4 * 2) + 5] = f7;
                this.aj[(i4 * 2) + 6] = f8;
                this.aj[(i4 * 2) + 7] = 0.4f;
                this.aj[(i4 * 2) + 8] = f6;
                this.aj[(i4 * 2) + 9] = f7;
                this.aj[(i4 * 2) + 10] = f8;
                this.aj[(i4 * 2) + 11] = 0.4f;
                i2 = i4 + 6;
            }
        }
        this.be = i2 / 2;
        if (this.be * 2 > this.ai.length) {
            a.a("skit2centerCoordsF");
        }
        if (this.be * 2 > this.ah.length) {
            a.a("skit2triCoordsF");
        }
        if (this.be * 4 > this.aj.length) {
            a.a("skit2foodColor");
        }
    }

    private void c(float f2, float f3, float f4, float f5) {
        int i2 = 0;
        float f6 = f2 - 0.063111f;
        float f7 = f3 + 0.063111f;
        float f8 = f4 - 0.063111f;
        float f9 = f5 + 0.063111f;
        for (int i3 = 0; i3 < this.C; i3++) {
            e eVar = this.y[i3];
            if (eVar.a >= ((double) f6) && eVar.a <= ((double) f7) && eVar.b >= ((double) f8) && eVar.b <= ((double) f9)) {
                float f10 = 0.063111f * ((float) (eVar.c / 0.03d));
                float sqrt = (float) Math.sqrt(eVar.d);
                this.ak[i2 * 2] = f10;
                this.ak[(i2 * 2) + 1] = f10;
                this.ak[(i2 * 2) + 2] = sqrt;
                this.ak[(i2 * 2) + 3] = 0.0f;
                this.ak[(i2 * 2) + 4] = f10;
                this.ak[(i2 * 2) + 5] = -f10;
                this.ak[(i2 * 2) + 6] = sqrt;
                this.ak[(i2 * 2) + 7] = 0.0f;
                this.ak[(i2 * 2) + 8] = -f10;
                this.ak[(i2 * 2) + 9] = -f10;
                this.ak[(i2 * 2) + 10] = sqrt;
                this.ak[(i2 * 2) + 11] = 0.0f;
                this.al[i2] = (float) eVar.a;
                this.al[i2 + 1] = (float) eVar.b;
                this.al[i2 + 2] = (float) eVar.a;
                this.al[i2 + 3] = (float) eVar.b;
                this.al[i2 + 4] = (float) eVar.a;
                this.al[i2 + 5] = (float) eVar.b;
                this.am[i2 * 2] = eVar.e[0];
                this.am[(i2 * 2) + 1] = eVar.e[1];
                this.am[(i2 * 2) + 2] = eVar.e[2];
                this.am[(i2 * 2) + 3] = (float) eVar.c;
                this.am[(i2 * 2) + 4] = eVar.e[0];
                this.am[(i2 * 2) + 5] = eVar.e[1];
                this.am[(i2 * 2) + 6] = eVar.e[2];
                this.am[(i2 * 2) + 7] = (float) eVar.c;
                this.am[(i2 * 2) + 8] = eVar.e[0];
                this.am[(i2 * 2) + 9] = eVar.e[1];
                this.am[(i2 * 2) + 10] = eVar.e[2];
                this.am[(i2 * 2) + 11] = (float) eVar.c;
                int i4 = i2 + 6;
                this.ak[i4 * 2] = -f10;
                this.ak[(i4 * 2) + 1] = -f10;
                this.ak[(i4 * 2) + 2] = sqrt;
                this.ak[(i4 * 2) + 3] = 0.0f;
                this.ak[(i4 * 2) + 4] = -f10;
                this.ak[(i4 * 2) + 5] = f10;
                this.ak[(i4 * 2) + 6] = sqrt;
                this.ak[(i4 * 2) + 7] = 0.0f;
                this.ak[(i4 * 2) + 8] = f10;
                this.ak[(i4 * 2) + 9] = f10;
                this.ak[(i4 * 2) + 10] = sqrt;
                this.ak[(i4 * 2) + 11] = 0.0f;
                this.al[i4] = (float) eVar.a;
                this.al[i4 + 1] = (float) eVar.b;
                this.al[i4 + 2] = (float) eVar.a;
                this.al[i4 + 3] = (float) eVar.b;
                this.al[i4 + 4] = (float) eVar.a;
                this.al[i4 + 5] = (float) eVar.b;
                this.am[i4 * 2] = eVar.e[0];
                this.am[(i4 * 2) + 1] = eVar.e[1];
                this.am[(i4 * 2) + 2] = eVar.e[2];
                this.am[(i4 * 2) + 3] = (float) eVar.c;
                this.am[(i4 * 2) + 4] = eVar.e[0];
                this.am[(i4 * 2) + 5] = eVar.e[1];
                this.am[(i4 * 2) + 6] = eVar.e[2];
                this.am[(i4 * 2) + 7] = (float) eVar.c;
                this.am[(i4 * 2) + 8] = eVar.e[0];
                this.am[(i4 * 2) + 9] = eVar.e[1];
                this.am[(i4 * 2) + 10] = eVar.e[2];
                this.am[(i4 * 2) + 11] = (float) eVar.c;
                i2 = i4 + 6;
            }
        }
        this.bf = i2 / 2;
        if (this.bf * 2 > this.al.length) {
            a.a("skit2centerCoordsdc");
        }
        if (this.bf * 4 > this.ak.length) {
            a.a("skit2triCoordsdc");
        }
        if (this.bf * 4 > this.am.length) {
            a.a("skit2colordc");
        }
    }

    public final void a(float[] fArr) {
        GLES20.glDisable(2929);
        GLES20.glDepthMask(false);
        GLES20.glBlendFunc(1, 770);
        GLES20.glEnable(3042);
        GLES20.glUseProgram(this.as);
        GLES20.glEnableVertexAttribArray(this.aK);
        GLES20.glVertexAttribPointer(this.aK, 2, 5126, false, 8, this.k);
        GLES20.glUniformMatrix4fv(this.aL, 1, false, fArr, 0);
        GLES20.glUniform4f(this.bh, (float) Math.cos(this.O), (float) Math.sin(this.O), (float) this.e.f, (float) this.e.d);
        GLES20.glUniform1f(this.bi, (float) this.e.k);
        GLES20.glDrawArrays(4, 0, 6);
        GLES20.glDisableVertexAttribArray(this.aK);
        GLES20.glBlendFunc(770, 771);
        GLES20.glUseProgram(this.ar);
        GLES20.glEnableVertexAttribArray(this.aC);
        GLES20.glEnableVertexAttribArray(this.aD);
        GLES20.glEnableVertexAttribArray(this.aE);
        for (int i2 = 0; this.be > i2 * 32766; i2++) {
            int i3 = i2 * 32766;
            int min = Math.min(this.be - i3, 32766);
            this.l.put(this.ah, i3 * 2, min * 2);
            this.l.position(0);
            this.m.put(this.ai, i3 * 2, min * 2);
            this.m.position(0);
            this.o.put(this.aj, i3 * 4, min * 4);
            this.o.position(0);
            GLES20.glVertexAttribPointer(this.aC, 2, 5126, false, 8, this.l);
            GLES20.glVertexAttribPointer(this.aD, 2, 5126, false, 8, this.m);
            GLES20.glVertexAttribPointer(this.aE, 4, 5126, false, 16, this.o);
            GLES20.glUniformMatrix4fv(this.aF, 1, false, fArr, 0);
            GLES20.glDrawArrays(4, 0, min);
        }
        GLES20.glDisableVertexAttribArray(this.aC);
        GLES20.glDisableVertexAttribArray(this.aD);
        GLES20.glDisableVertexAttribArray(this.aE);
        c(fArr);
        GLES20.glEnable(2929);
        GLES20.glDepthFunc(519);
        b(fArr);
        GLES20.glDepthMask(true);
        d(fArr);
        GLES20.glEnable(2929);
        GLES20.glDepthFunc(513);
        GLES20.glDepthMask(false);
        e(fArr);
        GLES20.glDisable(3042);
    }

    /* access modifiers changed from: package-private */
    public final void b(float[] fArr) {
        GLES20.glUseProgram(this.at);
        GLES20.glEnableVertexAttribArray(this.aG);
        GLES20.glEnableVertexAttribArray(this.aI);
        GLES20.glEnableVertexAttribArray(this.aH);
        GLES20.glActiveTexture(33984);
        GLES20.glBindTexture(3553, this.aS);
        GLES20.glUniform1i(this.aT, 0);
        for (int i2 = 0; this.bf > i2 * 32766; i2++) {
            int i3 = i2 * 32766;
            int min = Math.min(this.bf - i3, 32766);
            this.l.put(this.ak, i3 * 4, min * 4);
            this.l.position(0);
            this.m.put(this.al, i3 * 2, min * 2);
            this.m.position(0);
            this.o.put(this.am, i3 * 4, min * 4);
            this.o.position(0);
            GLES20.glVertexAttribPointer(this.aG, 4, 5126, false, 16, this.l);
            GLES20.glVertexAttribPointer(this.aI, 2, 5126, false, 8, this.m);
            GLES20.glVertexAttribPointer(this.aH, 4, 5126, false, 16, this.o);
            GLES20.glUniformMatrix4fv(this.aJ, 1, false, fArr, 0);
            GLES20.glDrawArrays(4, 0, min);
        }
        GLES20.glDisableVertexAttribArray(this.aG);
        GLES20.glDisableVertexAttribArray(this.aI);
        GLES20.glDisableVertexAttribArray(this.aH);
    }

    /* access modifiers changed from: package-private */
    public final void c(float[] fArr) {
        GLES20.glUseProgram(this.aM);
        GLES20.glEnableVertexAttribArray(this.aN);
        GLES20.glEnableVertexAttribArray(this.aO);
        for (int i2 = 0; this.ap > i2 * 32766; i2++) {
            int i3 = i2 * 32766;
            int min = Math.min(this.ap - i3, 32766);
            this.l.put(this.an, i3 * 4, min * 4);
            this.l.position(0);
            this.n.put(this.ao, i3, min);
            this.n.position(0);
            GLES20.glVertexAttribPointer(this.aN, 4, 5126, false, 16, this.l);
            GLES20.glVertexAttribPointer(this.aO, 1, 5126, false, 4, this.n);
            GLES20.glUniformMatrix4fv(this.aP, 1, false, fArr, 0);
            GLES20.glDrawArrays(4, 0, min);
        }
        GLES20.glDisableVertexAttribArray(this.aN);
        GLES20.glDisableVertexAttribArray(this.aO);
    }

    /* access modifiers changed from: package-private */
    public final void d(float[] fArr) {
        int i2;
        int length = h.B.length;
        if (this.bg) {
            i2 = length + 1;
        } else {
            i2 = length;
        }
        for (int i3 = 0; i3 < i2; i3++) {
            if (i3 >= h.B.length) {
                GLES20.glEnable(3042);
            } else if (h.B[i3].w == -1) {
            }
            GLES20.glUseProgram(this.au[i3]);
            if (this.ax[i3] != -1) {
                GLES20.glEnableVertexAttribArray(this.ax[i3]);
            }
            if (this.ay[i3] != -1) {
                GLES20.glEnableVertexAttribArray(this.ay[i3]);
            }
            if (this.aA[i3] != -1) {
                GLES20.glEnableVertexAttribArray(this.aA[i3]);
            }
            if (this.az[i3] != -1) {
                GLES20.glEnableVertexAttribArray(this.az[i3]);
            }
            if (this.aB[i3] != -1) {
                GLES20.glActiveTexture(33984);
                GLES20.glBindTexture(3553, this.aR);
                GLES20.glUniform1i(this.aB[i3], 0);
            }
            int i4 = 0;
            while (true) {
                int i5 = i4;
                if (i5 >= this.u[i3]) {
                    break;
                }
                int i6 = this.q[i3][i5];
                int i7 = this.s[i3][i5];
                if (this.ax[i3] != -1) {
                    this.l.put(this.ad, i6 * 2, i7 * 2);
                    this.l.position(0);
                    GLES20.glVertexAttribPointer(this.ax[i3], 2, 5126, false, 8, this.l);
                }
                if (this.az[i3] != -1) {
                    this.m.put(this.af, i6 * 2, i7 * 2);
                    this.m.position(0);
                    GLES20.glVertexAttribPointer(this.az[i3], 2, 5126, false, 8, this.m);
                }
                if (this.ay[i3] != -1) {
                    this.n.put(this.ae, i6 * 4, i7 * 4);
                    this.n.position(0);
                    GLES20.glVertexAttribPointer(this.ay[i3], 4, 5126, false, 16, this.n);
                }
                if (this.aA[i3] != -1) {
                    this.o.put(this.ag, i6 * 4, i7 * 4);
                    this.o.position(0);
                    GLES20.glVertexAttribPointer(this.aA[i3], 4, 5126, false, 16, this.o);
                }
                GLES20.glUniformMatrix4fv(this.aQ[i3], 1, false, fArr, 0);
                this.p.put(this.aq, this.r[i3][i5], this.t[i3][i5]);
                this.p.position(0);
                GLES20.glDrawElements(4, this.t[i3][i5], 5123, this.p);
                i4 = i5 + 1;
            }
            if (this.ax[i3] != -1) {
                GLES20.glDisableVertexAttribArray(this.ax[i3]);
            }
            if (this.az[i3] != -1) {
                GLES20.glDisableVertexAttribArray(this.az[i3]);
            }
            if (this.ay[i3] != -1) {
                GLES20.glDisableVertexAttribArray(this.ay[i3]);
            }
            if (this.aA[i3] != -1) {
                GLES20.glDisableVertexAttribArray(this.aA[i3]);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final void e(float[] fArr) {
        int length = h.B.length;
        int i2 = length + (this.bg ? 1 : 0);
        for (int i3 = 0; i3 < length; i3++) {
            if (h.B[i3].y != -1) {
                GLES20.glUseProgram(this.au[i2 + i3]);
                if (this.ax[i2 + i3] != -1) {
                    GLES20.glEnableVertexAttribArray(this.ax[i2 + i3]);
                }
                if (this.ay[i2 + i3] != -1) {
                    GLES20.glEnableVertexAttribArray(this.ay[i2 + i3]);
                }
                if (this.aA[i2 + i3] != -1) {
                    GLES20.glEnableVertexAttribArray(this.aA[i2 + i3]);
                }
                if (this.az[i2 + i3] != -1) {
                    GLES20.glEnableVertexAttribArray(this.az[i2 + i3]);
                }
                int i4 = 0;
                while (true) {
                    int i5 = i4;
                    if (this.av[i2 + i3] <= i5 * 32766) {
                        break;
                    }
                    int i6 = this.aw[i2 + i3] + (i5 * 32766);
                    int min = Math.min(this.av[i2 + i3] - (i5 * 32766), 32766);
                    if (this.ax[i2 + i3] != -1) {
                        this.l.put(this.ad, i6 * 2, min * 2);
                        this.l.position(0);
                        GLES20.glVertexAttribPointer(this.ax[i2 + i3], 2, 5126, false, 8, this.l);
                    }
                    if (this.az[i2 + i3] != -1) {
                        this.m.put(this.af, i6 * 4, min * 4);
                        this.m.position(0);
                        GLES20.glVertexAttribPointer(this.az[i2 + i3], 4, 5126, false, 16, this.m);
                    }
                    if (this.ay[i2 + i3] != -1) {
                        this.n.put(this.ae, i6 * 4, min * 4);
                        this.n.position(0);
                        GLES20.glVertexAttribPointer(this.ay[i2 + i3], 4, 5126, false, 16, this.n);
                    }
                    if (this.aA[i2 + i3] != -1) {
                        this.o.put(this.ag, i6 * 4, min * 4);
                        this.o.position(0);
                        GLES20.glVertexAttribPointer(this.aA[i2 + i3], 4, 5126, false, 16, this.o);
                    }
                    GLES20.glUniformMatrix4fv(this.aQ[i2 + i3], 1, false, fArr, 0);
                    GLES20.glDrawArrays(4, 0, min);
                    i4 = i5 + 1;
                }
                if (this.ax[i2 + i3] != -1) {
                    GLES20.glDisableVertexAttribArray(this.ax[i2 + i3]);
                }
                if (this.az[i2 + i3] != -1) {
                    GLES20.glDisableVertexAttribArray(this.az[i2 + i3]);
                }
                if (this.ay[i2 + i3] != -1) {
                    GLES20.glDisableVertexAttribArray(this.ay[i2 + i3]);
                }
                if (this.aA[i2 + i3] != -1) {
                    GLES20.glDisableVertexAttribArray(this.aA[i2 + i3]);
                }
            }
        }
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeInt(this.bg ? 1 : 0);
        parcel.writeParcelable(this.e, i2);
        parcel.writeInt(this.z);
        parcel.writeArray(this.x);
        parcel.writeInt(this.B);
        parcel.writeArray(this.A);
        parcel.writeDouble(this.M);
        parcel.writeDouble(this.O);
        parcel.writeInt(this.V);
        parcel.writeInt(this.W);
        parcel.writeInt(this.S);
        parcel.writeInt(this.R);
    }

    public final void a() {
        this.z = 0;
        this.B = 0;
        this.M = 0.0d;
        this.O = 1.5707963267948966d;
    }

    public final void b() {
        for (int i2 = 0; i2 < this.z; i2++) {
            this.x[i2].F = 0;
        }
    }

    public final int b(int i2) {
        int i3 = 0;
        for (int i4 = 0; i4 < this.z; i4++) {
            if (this.x[i4].E == i2) {
                i3++;
            }
        }
        return i3;
    }

    public final int c() {
        int i2 = 0;
        for (int i3 = 0; i3 < this.z; i3++) {
            if (this.x[i3].E == 0 && Math.abs(this.x[i3].J[0] - 0.0f) + Math.abs(this.x[i3].J[1] - 0.0f) + Math.abs(this.x[i3].J[2] - 0.0f) < 0.1f) {
                i2++;
            }
        }
        return i2;
    }

    public final int d() {
        int i2 = 0;
        for (int i3 = 0; i3 < this.z; i3++) {
            if (this.x[i3].E == 0 && this.x[i3].J[0] > 0.65f && this.x[i3].J[1] < 0.35f && this.x[i3].J[2] < 0.35f) {
                i2++;
            }
        }
        return i2;
    }

    public final int e() {
        int i2 = 0;
        for (int i3 = 0; i3 < this.z; i3++) {
            if (this.x[i3].E == 0 && this.x[i3].J[0] > 0.65f && this.x[i3].J[1] > 0.65f && this.x[i3].J[2] < 0.35f) {
                i2++;
            }
        }
        return i2;
    }

    public final void c(int i2) {
        for (int i3 = 0; i3 < this.z; i3++) {
            this.x[i3].E = i2;
        }
    }

    public final double f() {
        double d2 = 0.0d;
        for (int i2 = 0; i2 < this.B; i2++) {
            d2 += (double) this.A[i2].c;
        }
        return d2;
    }

    private double c(double d2, double d3) {
        double d4 = ((this.P * d2) + (this.Q * d3)) / this.e.k;
        double sqrt = (((1.0d - this.e.f) * (1.0d - (Math.sqrt((d2 * d2) + (d3 * d3)) / this.e.k))) / this.e.f) + 1.0d;
        return Math.max((((d4 * (1.0d - this.e.f)) + this.e.f) * this.e.d) / (sqrt * sqrt), 0.0d);
    }

    private double d(double d2, double d3) {
        double d4 = ((this.P * d2) + (this.Q * d3)) / this.e.k;
        double sqrt = Math.sqrt((d2 * d2) + (d3 * d3));
        double d5 = 1.0d + (((1.0d - this.e.f) * (1.0d - (sqrt / this.e.k))) / this.e.f);
        if ((((d4 * (1.0d - this.e.f)) + this.e.f) * this.e.d) / (d5 * d5) < 0.0d) {
            return 0.0d;
        }
        return -((((((this.e.d * (-1.0d + this.e.f)) * this.e.f) * this.e.f) * this.e.k) * (((((((this.P - (this.P * this.e.f)) * sqrt) * sqrt) + ((this.P * sqrt) * this.e.k)) + (((2.0d * this.e.f) * this.e.k) * d2)) - ((((2.0d * (-1.0d + this.e.f)) * this.Q) * d2) * d3)) + ((((2.0d * this.P) * (-1.0d + this.e.f)) * d3) * d3))) / (sqrt * Math.pow(((-1.0d + this.e.f) * sqrt) + this.e.k, 3.0d)));
    }

    private double e(double d2, double d3) {
        double d4 = ((this.P * d2) + (this.Q * d3)) / this.e.k;
        double sqrt = Math.sqrt((d2 * d2) + (d3 * d3));
        double d5 = 1.0d + (((1.0d - this.e.f) * (1.0d - (sqrt / this.e.k))) / this.e.f);
        if ((((d4 * (1.0d - this.e.f)) + this.e.f) * this.e.d) / (d5 * d5) < 0.0d) {
            return 0.0d;
        }
        return -((((((this.e.d * (-1.0d + this.e.f)) * this.e.f) * this.e.f) * this.e.k) * ((((((-1.0d + this.e.f) * sqrt) * sqrt) * this.Q) + ((this.e.k * sqrt) * this.Q)) + ((2.0d * d3) * (((this.P * d2) + (this.Q * d3)) + (this.e.f * ((this.e.k - (this.P * d2)) - (this.Q * d3))))))) / (sqrt * Math.pow(((-1.0d + this.e.f) * sqrt) + this.e.k, 3.0d)));
    }
}
