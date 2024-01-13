package com.saterskog.cell_lab;

import android.os.Parcel;
import android.os.Parcelable;
import com.saterskog.b.d;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Cell implements Parcelable {
    public static final double a = Math.sqrt(1.7999999999999998E-4d);
    static final Parcelable.Creator<Cell> ad = new Parcelable.Creator<Cell>() {
        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new Cell[i];
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new Cell(parcel);
        }
    };
    public final transient u[] A;
    public int B;
    public int C;
    public int D;
    public int E;
    public int F;
    public int G;
    public final Link[] H;
    public Gene[] I;
    public final float[] J;
    public int K;
    public int L;
    public int M;
    public int N;
    public transient int O;
    public transient int P;
    public transient double Q;
    public transient double R;
    public float S;
    public int T;
    public final float[] U;
    public final float[] V;
    public final float[] W;
    public float X;
    public float Y;
    public float Z;
    public float aa;
    public float ab;
    public float ac;
    public double b;
    public double c;
    public double d;
    public double e;
    public int enzyme_splitCount;
    public double f;
    public double g;
    public double h;
    public double i;
    public double j;
    public double k;
    public double l;
    public double m;
    public double n;
    public double o;
    public double p;
    public double q;
    public float r;
    public float s;
    public double t;
    public double u;
    public double v;
    public double w;
    boolean x;
    boolean y;
    boolean z;

    public Cell() {
        this.A = new u[20];
        this.H = new Link[20];
        this.I = new Gene[80];
        this.J = new float[4];
        this.U = new float[8];
        this.V = new float[4];
        this.W = new float[4];
        this.r = 0.0f;
        this.s = 0.0f;
        this.O = 0;
        this.C = 0;
        for (int i2 = 0; i2 < 80; i2++) {
            this.I[i2] = new Gene();
        }
        for (int i3 = 0; i3 < 20; i3++) {
            this.A[i3] = new u();
            this.H[i3] = new Link();
        }
        this.t = 0.0d;
        this.u = 0.0d;
        this.v = 0.0d;
        this.G = 0;
        this.enzyme_splitCount = 0;
    }

    public final double a() {
        if (this.I[this.D].s == h.LIPOCYTE) {
            return ((this.w + ((double) this.S)) * 0.36d) / 2.16d;
        }
        return this.w;
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x002e  */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0033  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final float a(int r9, int r10) {
        /*
            r8 = this;
            r2 = -1082130432(0xffffffffbf800000, float:-1.0)
            r1 = 1065353216(0x3f800000, float:1.0)
            com.saterskog.cell_lab.Gene[] r0 = r8.I
            int r3 = r8.D
            r0 = r0[r3]
            com.saterskog.cell_lab.Gene$a[] r0 = r0.t
            r3 = r0[r9]
            short r0 = r3.e
            if (r0 == 0) goto L_0x0076
            r0 = 0
            short r4 = r3.d
            r5 = 4
            if (r4 >= r5) goto L_0x0048
            float[] r0 = r8.U
            short r4 = r3.d
            int r4 = r4 + r10
            r0 = r0[r4]
        L_0x001f:
            short r4 = r3.e
            r5 = 1
            if (r4 != r5) goto L_0x006d
            float r4 = r3.a
            float r0 = r0 * r4
            float r3 = r3.b
            float r0 = r0 + r3
        L_0x002a:
            int r3 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r3 >= 0) goto L_0x002f
            r0 = r2
        L_0x002f:
            int r2 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r2 <= 0) goto L_0x0034
            r0 = r1
        L_0x0034:
            float[] r2 = com.saterskog.cell_lab.Gene.x
            r2 = r2[r9]
            float[] r3 = com.saterskog.cell_lab.Gene.y
            r3 = r3[r9]
            float[] r4 = com.saterskog.cell_lab.Gene.x
            r4 = r4[r9]
            float r3 = r3 - r4
            r4 = 1056964608(0x3f000000, float:0.5)
            float r3 = r3 * r4
            float r0 = r0 + r1
            float r0 = r0 * r3
            float r0 = r0 + r2
            return r0
        L_0x0048:
            short r4 = r3.d
            switch(r4) {
                case 4: goto L_0x004e;
                case 5: goto L_0x0058;
                case 6: goto L_0x0062;
                case 7: goto L_0x0066;
                default: goto L_0x004d;
            }
        L_0x004d:
            goto L_0x001f
        L_0x004e:
            double r4 = r8.w
            r6 = 4600156803381319434(0x3fd70a3d70a3d70a, double:0.36)
            double r4 = r4 / r6
            float r0 = (float) r4
            goto L_0x001f
        L_0x0058:
            double r4 = r8.o
            r6 = 4571453861756211473(0x3f71111111111111, double:0.004166666666666667)
            double r4 = r4 * r6
            float r0 = (float) r4
            goto L_0x001f
        L_0x0062:
            double r4 = r8.p
            float r0 = (float) r4
            goto L_0x001f
        L_0x0066:
            int r0 = r8.C
            float r0 = (float) r0
            r4 = 1101004800(0x41a00000, float:20.0)
            float r0 = r0 / r4
            goto L_0x001f
        L_0x006d:
            float r4 = r3.c
            int r0 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r0 >= 0) goto L_0x0076
            float r0 = r3.a
            goto L_0x002a
        L_0x0076:
            float r0 = r3.b
            goto L_0x002a
        */
        throw new UnsupportedOperationException("Method not decompiled: com.saterskog.cell_lab.Cell.a(int, int):float");
    }

    public final float a(int i2) {
        return this.I[this.D].v[i2];
    }

    public final int b(int i2) {
        return this.I[this.D].u[i2];
    }

    /* renamed from: com.saterskog.cell_lab.Cell$2  reason: invalid class name */
    static /* synthetic */ class AnonymousClass2 {
        static final /* synthetic */ int[] a = new int[h.values().length];

        static {
            try {
                a[h.FLAGELLOCYTE.ordinal()] = 1;
            } catch (NoSuchFieldError e) {
            }
            try {
                a[h.STEMOCYTE.ordinal()] = 2;
            } catch (NoSuchFieldError e2) {
            }
            try {
                a[h.MYOCYTE.ordinal()] = 3;
            } catch (NoSuchFieldError e3) {
            }
            try {
                a[h.NITROCYTE.ordinal()] = 4;
            } catch (NoSuchFieldError e4) {
            }
            try {
                a[h.PHOTOCYTE.ordinal()] = 5;
            } catch (NoSuchFieldError e5) {
            }
            try {
                a[h.BUOYOCYTE.ordinal()] = 6;
            } catch (NoSuchFieldError e6) {
            }
            try {
                a[h.GAMETE.ordinal()] = 7;
            } catch (NoSuchFieldError e7) {
            }
            try {
                a[h.NEUROCYTE.ordinal()] = 8;
            } catch (NoSuchFieldError e8) {
            }
            try {
                a[h.GLUEOCYTE.ordinal()] = 9;
            } catch (NoSuchFieldError e9) {
            }
            try {
                a[h.CILIOCYTE.ordinal()] = 10;
            } catch (NoSuchFieldError e10) {
            }
            try {
                a[h.SECROCYTE.ordinal()] = 11;
            } catch (NoSuchFieldError e11) {
            }
        }
    }

    public Cell(Parcel parcel) {
        boolean z2;
        boolean z3 = true;
        this.A = new u[20];
        this.H = new Link[20];
        this.I = new Gene[80];
        this.J = new float[4];
        this.U = new float[8];
        this.V = new float[4];
        this.W = new float[4];
        for (int i2 = 0; i2 < 20; i2++) {
            this.A[i2] = new u();
        }
        this.b = parcel.readDouble();
        this.c = parcel.readDouble();
        this.k = parcel.readDouble();
        this.m = parcel.readDouble();
        this.e = parcel.readDouble();
        this.f = parcel.readDouble();
        this.l = parcel.readDouble();
        this.n = parcel.readDouble();
        this.d = parcel.readDouble();
        this.w = parcel.readDouble();
        this.o = parcel.readDouble();
        for (int i3 = 0; i3 < 20; i3++) {
            this.H[i3] = (Link) parcel.readParcelable(Link.class.getClassLoader());
        }
        this.C = parcel.readInt();
        if (parcel.readByte() != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        this.x = z2;
        parcel.readFloatArray(this.J);
        for (int i4 = 0; i4 < 80; i4++) {
            this.I[i4] = (Gene) parcel.readParcelable(Gene.class.getClassLoader());
        }
        this.D = parcel.readInt();
        this.E = parcel.readInt();
        this.F = parcel.readInt();
        this.t = parcel.readDouble();
        this.u = parcel.readDouble();
        this.v = parcel.readDouble();
        this.p = parcel.readDouble();
        this.y = parcel.readByte() == 0 ? false : z3;
        for (int i5 = 0; i5 < 4; i5++) {
            this.U[i5] = parcel.readFloat();
            this.W[i5] = parcel.readFloat();
        }
        this.X = parcel.readFloat();
        this.Y = parcel.readFloat();
        this.aa = parcel.readFloat();
        this.ab = parcel.readFloat();
        this.ac = parcel.readFloat();
        this.S = parcel.readFloat();
        this.G = parcel.readInt();
        this.T = parcel.readInt();
        this.q = parcel.readDouble();
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i2) {
        int i3;
        int i4 = 1;
        parcel.writeDouble(this.b);
        parcel.writeDouble(this.c);
        parcel.writeDouble(this.k);
        parcel.writeDouble(this.m);
        parcel.writeDouble(this.e);
        parcel.writeDouble(this.f);
        parcel.writeDouble(this.l);
        parcel.writeDouble(this.n);
        parcel.writeDouble(this.d);
        parcel.writeDouble(this.w);
        parcel.writeDouble(this.o);
        for (int i5 = 0; i5 < 20; i5++) {
            parcel.writeParcelable(this.H[i5], 0);
        }
        parcel.writeInt(this.C);
        if (this.x) {
            i3 = 1;
        } else {
            i3 = 0;
        }
        parcel.writeByte((byte) i3);
        parcel.writeFloatArray(this.J);
        for (int i6 = 0; i6 < 80; i6++) {
            parcel.writeParcelable(this.I[i6], 0);
        }
        parcel.writeInt(this.D);
        parcel.writeInt(this.E);
        parcel.writeInt(this.F);
        parcel.writeDouble(this.t);
        parcel.writeDouble(this.u);
        parcel.writeDouble(this.v);
        parcel.writeDouble(this.p);
        if (!this.y) {
            i4 = 0;
        }
        parcel.writeByte((byte) i4);
        for (int i7 = 0; i7 < 4; i7++) {
            parcel.writeFloat(this.U[i7]);
            parcel.writeFloat(this.W[i7]);
        }
        parcel.writeFloat(this.X);
        parcel.writeFloat(this.Y);
        parcel.writeFloat(this.aa);
        parcel.writeFloat(this.ab);
        parcel.writeFloat(this.ac);
        parcel.writeFloat(this.S);
        parcel.writeInt(this.G);
        parcel.writeInt(this.T);
        parcel.writeDouble(this.q);
    }

    public final void a(ObjectOutputStream objectOutputStream) {
        objectOutputStream.writeInt(3054);
        objectOutputStream.writeDouble(this.b);
        objectOutputStream.writeDouble(this.c);
        objectOutputStream.writeDouble(this.k);
        objectOutputStream.writeDouble(this.m);
        objectOutputStream.writeDouble(this.e);
        objectOutputStream.writeDouble(this.f);
        objectOutputStream.writeDouble(this.l);
        objectOutputStream.writeDouble(this.n);
        objectOutputStream.writeDouble(this.d);
        objectOutputStream.writeDouble(this.w);
        objectOutputStream.writeDouble(this.o);
        objectOutputStream.writeInt(20);
        for (int i2 = 0; i2 < 20; i2++) {
            Link link = this.H[i2];
            objectOutputStream.writeInt(link.a);
            objectOutputStream.writeDouble(link.c);
            objectOutputStream.writeDouble(link.d);
            objectOutputStream.writeBoolean(link.b);
            objectOutputStream.writeDouble(link.e);
            objectOutputStream.writeDouble(link.f);
            objectOutputStream.writeFloat(link.k);
            objectOutputStream.writeFloat(link.l);
        }
        objectOutputStream.writeInt(this.C);
        objectOutputStream.writeBoolean(this.x);
        objectOutputStream.writeFloat(this.J[0]);
        objectOutputStream.writeFloat(this.J[1]);
        objectOutputStream.writeFloat(this.J[2]);
        objectOutputStream.writeInt(80);
        for (int i3 = 0; i3 < 80; i3++) {
            this.I[i3].a(objectOutputStream);
        }
        objectOutputStream.writeInt(this.D);
        objectOutputStream.writeInt(this.E);
        objectOutputStream.writeInt(this.F);
        objectOutputStream.writeDouble(this.t);
        objectOutputStream.writeDouble(this.u);
        objectOutputStream.writeDouble(this.v);
        objectOutputStream.writeDouble(this.p);
        objectOutputStream.writeBoolean(this.y);
        for (int i4 = 0; i4 < 4; i4++) {
            objectOutputStream.writeFloat(this.U[i4]);
            objectOutputStream.writeFloat(this.W[i4]);
        }
        objectOutputStream.writeFloat(this.X);
        objectOutputStream.writeFloat(this.Y);
        objectOutputStream.writeFloat(this.aa);
        objectOutputStream.writeFloat(this.ab);
        objectOutputStream.writeFloat(this.ac);
        objectOutputStream.writeFloat(this.S);
        objectOutputStream.writeInt(this.G);
        objectOutputStream.writeInt(this.T);
        objectOutputStream.writeDouble(this.q);
    }

    public final void a(ObjectInputStream objectInputStream) {
        int i2 = 0;
        int readInt = objectInputStream.readInt();
        if (readInt < 2 || readInt > 3054) {
            throw new RuntimeException("bad cell format version " + readInt);
        }
        this.b = objectInputStream.readDouble();
        this.c = objectInputStream.readDouble();
        this.k = objectInputStream.readDouble();
        this.m = objectInputStream.readDouble();
        this.e = objectInputStream.readDouble();
        this.f = objectInputStream.readDouble();
        this.l = objectInputStream.readDouble();
        this.n = objectInputStream.readDouble();
        this.d = objectInputStream.readDouble();
        this.w = objectInputStream.readDouble();
        this.o = objectInputStream.readDouble();
        int readInt2 = objectInputStream.readInt();
        for (int i3 = 0; i3 < Math.min(readInt2, 20); i3++) {
            this.H[i3].a(objectInputStream, readInt);
        }
        for (int i4 = 0; i4 < readInt2 - Math.min(readInt2, 20); i4++) {
            new Link().a(objectInputStream, readInt);
        }
        this.C = objectInputStream.readInt();
        this.x = objectInputStream.readBoolean();
        this.J[0] = objectInputStream.readFloat();
        this.J[1] = objectInputStream.readFloat();
        this.J[2] = objectInputStream.readFloat();
        int readInt3 = objectInputStream.readInt();
        for (int i5 = 0; i5 < Math.min(readInt3, 80); i5++) {
            this.I[i5].a(objectInputStream, readInt);
        }
        for (int i6 = 0; i6 < readInt3 - Math.min(readInt3, 80); i6++) {
            new Gene().a(objectInputStream, readInt);
        }
        for (int i7 = 0; i7 < Math.max(readInt3, 80) - readInt3; i7++) {
            this.I[readInt3 + i7].a(this.I[0]);
            this.I[readInt3 + i7].p = false;
        }
        this.D = objectInputStream.readInt();
        this.E = objectInputStream.readInt();
        this.F = objectInputStream.readInt();
        this.t = objectInputStream.readDouble();
        this.u = objectInputStream.readDouble();
        this.v = objectInputStream.readDouble();
        this.p = objectInputStream.readDouble();
        if (readInt >= 4) {
            this.y = objectInputStream.readBoolean();
        }
        this.O = d.a.nextInt(15);
        if (readInt >= 9) {
            while (i2 < 4) {
                this.U[i2] = objectInputStream.readFloat();
                this.W[i2] = objectInputStream.readFloat();
                i2++;
            }
            this.X = objectInputStream.readFloat();
            this.Y = objectInputStream.readFloat();
            this.aa = objectInputStream.readFloat();
            this.ab = objectInputStream.readFloat();
            this.ac = objectInputStream.readFloat();
            if (readInt > 11) {
                this.S = objectInputStream.readFloat();
            } else {
                this.S = 0.0f;
            }
        } else {
            while (i2 < 4) {
                this.U[i2] = 0.01f;
                this.W[i2] = 0.01f;
                i2++;
            }
            this.S = 0.0f;
        }
        if (readInt >= 15) {
            this.G = objectInputStream.readInt();
        }
        if (readInt >= 19) {
            this.T = objectInputStream.readInt();
        } else {
            this.T = -1;
        }
        if (readInt >= 23) {
            this.q = objectInputStream.readDouble();
        } else {
            this.q = 0.0d;
        }
        c();
    }

    private void c() {
        boolean z2 = false;
        for (int i2 = 0; i2 < 80; i2++) {
            if (z2) {
                this.I[i2].p = false;
            }
            if (this.I[i2].p) {
                z2 = true;
            }
        }
        if (!z2) {
            this.I[0].p = true;
        }
    }

    public final void a(Cell cell) {
        this.b = cell.b;
        this.c = cell.c;
        this.e = cell.e;
        this.f = cell.f;
        this.k = cell.k;
        this.l = cell.l;
        this.m = cell.m;
        this.n = cell.n;
        this.d = cell.d;
        this.w = cell.w;
        this.o = cell.o;
        for (int i2 = 0; i2 < 20; i2++) {
            this.H[i2].a(cell.H[i2]);
        }
        this.C = cell.C;
        for (int i3 = 0; i3 < 4; i3++) {
            this.J[i3] = cell.J[i3];
        }
        this.x = cell.x;
        for (int i4 = 0; i4 < 80; i4++) {
            this.I[i4].a(cell.I[i4]);
        }
        this.D = cell.D;
        this.E = cell.E;
        this.F = cell.F;
        this.O = cell.O;
        this.t = cell.t;
        this.u = cell.u;
        this.v = cell.v;
        this.p = cell.p;
        this.B = cell.B;
        for (int i5 = 0; i5 < this.B; i5++) {
            u uVar = this.A[i5];
            u uVar2 = cell.A[i5];
            uVar.a = uVar2.a;
            uVar.c = uVar2.c;
            uVar.b = uVar2.b;
            uVar.d = uVar2.d;
            uVar.g = uVar2.g;
            uVar.e = uVar2.e;
            uVar.f = uVar2.f;
        }
        this.y = cell.y;
        for (int i6 = 0; i6 < 4; i6++) {
            this.U[i6] = cell.U[i6];
            this.W[i6] = cell.W[i6];
        }
        this.z = cell.z;
        this.X = cell.X;
        this.Y = cell.Y;
        this.aa = cell.aa;
        this.ab = cell.ab;
        this.ac = cell.ac;
        this.S = cell.S;
        this.r = cell.r;
        this.s = cell.s;
        this.g = cell.g;
        this.h = cell.h;
        this.i = cell.i;
        this.G = cell.G;
        this.T = cell.T;
        this.q = cell.q;
        this.enzyme_splitCount = cell.enzyme_splitCount;
    }

    public final Gene b() {
        return this.I[this.D];
    }
}
