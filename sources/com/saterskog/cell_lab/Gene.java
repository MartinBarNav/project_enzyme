package com.saterskog.cell_lab;

import android.os.Parcel;
import android.os.Parcelable;
import com.saterskog.b.d;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Gene implements Parcelable {
    public static final float[] A = new float[7];
    public static final int[] B = {-1, 5, 10, 20, 40, 80};
    static final Parcelable.Creator<Gene> C = new Parcelable.Creator<Gene>() {
        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new Gene[i];
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new Gene(parcel);
        }
    };
    public static final int[] w = new int[11];
    public static final float[] x = new float[11];
    public static final float[] y = new float[11];
    public static final float[] z = new float[7];
    public final float[] a;
    public float b;
    public float c;
    public float d;
    public float e;
    public float f;
    public float g;
    public float h;
    public int i;
    public int j;
    public int k;
    boolean l;
    boolean m;
    boolean n;
    boolean o;
    boolean p;
    boolean q;
    boolean r;
    public h s;
    public final a[] t;
    public final int[] u;
    public final float[] v;

    public class a {
        float a;
        float b;
        float c;
        short d;
        short e;

        public a() {
        }
    }

    static {
        w[0] = 80;
        w[1] = 80;
        w[2] = 4;
        w[3] = 6;
        w[4] = 15;
        for (int i2 = 0; i2 < 4; i2++) {
            w[i2 + 5] = 4;
        }
        w[9] = 20;
        w[10] = B.length;
        x[0] = 0.0f;
        y[0] = 1.0f;
        x[1] = -3.0f;
        y[1] = 3.0f;
        x[2] = -1.0f;
        y[2] = 1.0f;
        x[3] = -0.5f;
        y[3] = 0.5f;
        x[4] = -1.0f;
        y[4] = 1.0f;
        x[5] = -1.0f;
        y[5] = 1.0f;
        x[6] = -1.0f;
        y[6] = 1.0f;
        for (int i3 = 0; i3 < 4; i3++) {
            x[i3 + 7] = -20.0f;
            y[i3 + 7] = 20.0f;
        }
        z[0] = -60.0f;
        A[0] = 60.0f;
        z[1] = 0.0f;
        A[1] = 1.0f;
        z[2] = 0.0f;
        A[2] = 1.0f;
        z[3] = 0.0f;
        A[3] = 1.0f;
        z[4] = 0.0f;
        A[4] = (float) Math.sqrt(3.0d);
        z[5] = 0.0f;
        A[5] = 0.01f;
        z[6] = 0.5f;
        A[6] = 2.0f;
    }

    public Gene(Parcel parcel) {
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        boolean z7 = true;
        this.a = new float[3];
        this.t = new a[11];
        this.u = new int[11];
        this.v = new float[7];
        parcel.readFloatArray(this.a);
        this.b = parcel.readFloat();
        this.c = parcel.readFloat();
        this.d = parcel.readFloat();
        this.e = parcel.readFloat();
        this.f = parcel.readFloat();
        this.g = parcel.readFloat();
        this.i = parcel.readInt();
        this.j = parcel.readInt();
        this.l = parcel.readInt() == 1;
        if (parcel.readInt() == 1) {
            z2 = true;
        } else {
            z2 = false;
        }
        this.m = z2;
        if (parcel.readInt() == 1) {
            z3 = true;
        } else {
            z3 = false;
        }
        this.n = z3;
        this.s = h.B[parcel.readInt()];
        this.k = parcel.readInt();
        if (parcel.readInt() == 1) {
            z4 = true;
        } else {
            z4 = false;
        }
        this.o = z4;
        if (parcel.readInt() == 1) {
            z5 = true;
        } else {
            z5 = false;
        }
        this.p = z5;
        if (parcel.readInt() == 1) {
            z6 = true;
        } else {
            z6 = false;
        }
        this.q = z6;
        this.r = parcel.readInt() != 1 ? false : z7;
        this.h = parcel.readFloat();
        for (int i2 = 0; i2 < 11; i2++) {
            this.t[i2] = new a();
            this.t[i2].d = (short) parcel.readInt();
            this.t[i2].e = (short) parcel.readInt();
            this.t[i2].a = parcel.readFloat();
            this.t[i2].b = parcel.readFloat();
            this.t[i2].c = parcel.readFloat();
        }
        for (int i3 = 0; i3 < 11; i3++) {
            this.u[i3] = parcel.readInt();
        }
        for (int i4 = 0; i4 < 7; i4++) {
            this.v[i4] = parcel.readFloat();
        }
    }

    public Gene(Gene gene) {
        this.a = new float[3];
        this.t = new a[11];
        this.u = new int[12];
        this.v = new float[7];
        for (int i2 = 0; i2 < 11; i2++) {
            this.t[i2] = new a();
        }
        a(gene);
    }

    public Gene() {
        this.a = new float[3];
        this.t = new a[11];
        this.u = new int[12];
        this.v = new float[7];
        this.s = h.PHAGOCYTE;
        for (int i2 = 0; i2 < 11; i2++) {
            this.t[i2] = new a();
        }
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8 = 1;
        parcel.writeFloatArray(this.a);
        parcel.writeFloat(this.b);
        parcel.writeFloat(this.c);
        parcel.writeFloat(this.d);
        parcel.writeFloat(this.e);
        parcel.writeFloat(this.f);
        parcel.writeFloat(this.g);
        parcel.writeInt(this.i);
        parcel.writeInt(this.j);
        parcel.writeInt(this.l ? 1 : 0);
        if (this.m) {
            i3 = 1;
        } else {
            i3 = 0;
        }
        parcel.writeInt(i3);
        if (this.n) {
            i4 = 1;
        } else {
            i4 = 0;
        }
        parcel.writeInt(i4);
        parcel.writeInt(this.s.ordinal());
        parcel.writeInt(this.k);
        if (this.o) {
            i5 = 1;
        } else {
            i5 = 0;
        }
        parcel.writeInt(i5);
        if (this.p) {
            i6 = 1;
        } else {
            i6 = 0;
        }
        parcel.writeInt(i6);
        if (this.q) {
            i7 = 1;
        } else {
            i7 = 0;
        }
        parcel.writeInt(i7);
        if (!this.r) {
            i8 = 0;
        }
        parcel.writeInt(i8);
        parcel.writeFloat(this.h);
        for (int i9 = 0; i9 < 11; i9++) {
            parcel.writeInt(this.t[i9].d);
            parcel.writeInt(this.t[i9].e);
            parcel.writeFloat(this.t[i9].a);
            parcel.writeFloat(this.t[i9].b);
            parcel.writeFloat(this.t[i9].c);
        }
        for (int i10 = 0; i10 < 11; i10++) {
            parcel.writeInt(this.u[i10]);
        }
        for (int i11 = 0; i11 < 7; i11++) {
            parcel.writeFloat(this.v[i11]);
        }
    }

    public final void a(Gene gene) {
        this.a[0] = gene.a[0];
        this.a[1] = gene.a[1];
        this.a[2] = gene.a[2];
        this.b = gene.b;
        this.c = gene.c;
        this.d = gene.d;
        this.e = gene.e;
        this.f = gene.f;
        this.g = gene.g;
        this.i = gene.i;
        this.j = gene.j;
        this.l = gene.l;
        this.m = gene.m;
        this.n = gene.n;
        this.s = gene.s;
        this.k = gene.k;
        this.o = gene.o;
        this.p = gene.p;
        this.q = gene.q;
        this.r = gene.r;
        this.h = gene.h;
        for (int i2 = 0; i2 < 11; i2++) {
            this.t[i2].d = gene.t[i2].d;
            this.t[i2].e = gene.t[i2].e;
            this.t[i2].a = gene.t[i2].a;
            this.t[i2].b = gene.t[i2].b;
            this.t[i2].c = gene.t[i2].c;
        }
        System.arraycopy(gene.u, 0, this.u, 0, 12);
        System.arraycopy(gene.v, 0, this.v, 0, 7);
    }

    public final void a(ObjectOutputStream objectOutputStream) {
        objectOutputStream.writeInt(3054);
        objectOutputStream.writeFloat(this.a[0]);
        objectOutputStream.writeFloat(this.a[1]);
        objectOutputStream.writeFloat(this.a[2]);
        objectOutputStream.writeFloat(this.b);
        objectOutputStream.writeFloat(this.c);
        objectOutputStream.writeFloat(this.d);
        objectOutputStream.writeFloat(this.e);
        objectOutputStream.writeFloat(this.f);
        objectOutputStream.writeFloat(this.g);
        objectOutputStream.writeInt(this.i);
        objectOutputStream.writeInt(this.j);
        objectOutputStream.writeBoolean(this.l);
        objectOutputStream.writeBoolean(this.m);
        objectOutputStream.writeBoolean(this.n);
        objectOutputStream.writeInt(this.s.ordinal());
        objectOutputStream.writeInt(this.k);
        objectOutputStream.writeBoolean(this.o);
        objectOutputStream.writeBoolean(this.p);
        objectOutputStream.writeBoolean(this.q);
        objectOutputStream.writeBoolean(this.r);
        objectOutputStream.writeFloat(this.h);
        for (int i2 = 0; i2 < 11; i2++) {
            objectOutputStream.writeShort(this.t[i2].d);
            objectOutputStream.writeShort(this.t[i2].e);
            objectOutputStream.writeFloat(this.t[i2].a);
            objectOutputStream.writeFloat(this.t[i2].b);
            objectOutputStream.writeFloat(this.t[i2].c);
        }
        for (int i3 = 0; i3 < 11; i3++) {
            objectOutputStream.writeInt(this.u[i3]);
        }
        for (int i4 = 0; i4 < 7; i4++) {
            objectOutputStream.writeFloat(this.v[i4]);
        }
    }

    public final void a(ObjectInputStream objectInputStream, int i2) {
        int i3;
        int i4;
        int i5;
        float f2;
        int i6;
        float f3;
        int i7;
        float f4;
        int i8;
        int i9;
        boolean z2 = false;
        if (i2 > 2) {
            i3 = objectInputStream.readInt();
        } else {
            i3 = 1;
        }
        if (i3 < 7) {
            this.a[0] = objectInputStream.readFloat();
            this.a[1] = objectInputStream.readFloat();
            this.a[2] = objectInputStream.readFloat();
            this.b = (float) objectInputStream.readDouble();
            this.c = (float) objectInputStream.readDouble();
            this.d = (float) objectInputStream.readDouble();
            if (i3 == 5) {
                this.e = (float) (objectInputStream.readDouble() + 3.141592653589793d);
            } else {
                this.e = (float) objectInputStream.readDouble();
            }
            this.f = (float) objectInputStream.readDouble();
            if (i3 < 9) {
                this.d = (float) (((double) this.d) + 3.141592653589793d);
                this.e = (float) (((double) this.e) + 3.141592653589793d);
                this.f = (float) (((double) this.f) + 3.141592653589793d);
            }
            this.g = (float) objectInputStream.readDouble();
            this.i = objectInputStream.readInt();
            this.j = objectInputStream.readInt();
            this.l = objectInputStream.readBoolean();
            this.m = objectInputStream.readBoolean();
            this.n = objectInputStream.readBoolean();
            this.s = h.B[objectInputStream.readInt()];
            this.k = objectInputStream.readInt();
            this.o = objectInputStream.readBoolean();
            float readDouble = (float) objectInputStream.readDouble();
            if (i3 >= 3) {
                i9 = objectInputStream.readInt();
                i8 = objectInputStream.readInt();
            } else {
                i8 = 0;
                i9 = 0;
            }
            if (i3 >= 4) {
                this.p = objectInputStream.readBoolean();
                this.q = objectInputStream.readBoolean();
                this.r = objectInputStream.readBoolean();
                this.h = (float) objectInputStream.readDouble();
                i6 = i9;
                f3 = readDouble;
                i7 = i8;
            } else {
                this.p = false;
                this.q = false;
                this.r = false;
                this.h = 0.0f;
                i6 = i9;
                f3 = readDouble;
                i7 = i8;
            }
        } else {
            this.a[0] = objectInputStream.readFloat();
            this.a[1] = objectInputStream.readFloat();
            this.a[2] = objectInputStream.readFloat();
            this.b = objectInputStream.readFloat();
            this.c = objectInputStream.readFloat();
            this.d = objectInputStream.readFloat();
            this.e = objectInputStream.readFloat();
            this.f = objectInputStream.readFloat();
            if (i3 < 9) {
                this.d = (float) (((double) this.d) + 3.141592653589793d);
                this.e = (float) (((double) this.e) + 3.141592653589793d);
                this.f = (float) (((double) this.f) + 3.141592653589793d);
                this.c = 1.0f - this.c;
            }
            this.g = objectInputStream.readFloat();
            this.i = objectInputStream.readInt();
            this.j = objectInputStream.readInt();
            this.l = objectInputStream.readBoolean();
            this.m = objectInputStream.readBoolean();
            this.n = objectInputStream.readBoolean();
            this.s = h.B[objectInputStream.readInt()];
            this.k = objectInputStream.readInt();
            this.o = objectInputStream.readBoolean();
            if (i3 < 9) {
                f2 = objectInputStream.readFloat();
                i5 = objectInputStream.readInt();
                i4 = objectInputStream.readInt();
            } else {
                i4 = 0;
                i5 = 0;
                f2 = 0.0f;
            }
            this.p = objectInputStream.readBoolean();
            this.q = objectInputStream.readBoolean();
            this.r = objectInputStream.readBoolean();
            if (i3 < 16) {
                this.h = objectInputStream.readFloat() * 35.0f;
                i6 = i5;
                f3 = f2;
                i7 = i4;
            } else {
                this.h = objectInputStream.readFloat();
                i6 = i5;
                f3 = f2;
                i7 = i4;
            }
        }
        if (i3 < 8) {
            f4 = 0.4f;
        } else if (i3 == 8) {
            f4 = objectInputStream.readFloat();
        } else {
            f4 = 0.0f;
        }
        if (this.i >= 80) {
            this.i = 0;
        }
        if (this.j >= 80) {
            this.j = 0;
        }
        if (this.i < 0) {
            this.i = 0;
        }
        if (this.j < 0) {
            this.j = 0;
        }
        if (i3 < 9) {
            for (int i10 = 0; i10 < 11; i10++) {
                this.t[i10].d = 0;
                this.t[i10].a = 0.0f;
                this.t[i10].b = 0.0f;
                this.t[i10].c = 0.0f;
            }
            for (int i11 = 0; i11 < 11; i11++) {
                this.u[i11] = 0;
            }
            for (int i12 = 0; i12 < 7; i12++) {
                this.v[i12] = 0.0f;
            }
            this.t[0].b = (((f4 - x[0]) * 2.0f) / (y[0] - x[0])) - 4.0f;
            this.t[1].b = -1.0f + ((2.0f * (f3 - x[0])) / (y[0] - x[0]));
            this.u[0] = i6;
            this.u[1] = i7;
            this.v[6] = 1.0f;
            this.u[9] = w[9] - 1;
        } else {
            for (int i13 = 0; i13 < 11; i13++) {
                this.t[i13].d = objectInputStream.readShort();
                if (i3 >= 17) {
                    this.t[i13].e = objectInputStream.readShort();
                } else if (this.t[i13].d == -1) {
                    this.t[i13].d = 0;
                    this.t[i13].e = 0;
                } else if (this.t[i13].d < 4) {
                    this.t[i13].e = 1;
                } else {
                    a aVar = this.t[i13];
                    aVar.d = (short) (aVar.d - 4);
                    this.t[i13].e = 2;
                }
                this.t[i13].a = objectInputStream.readFloat();
                this.t[i13].b = objectInputStream.readFloat();
                this.t[i13].c = objectInputStream.readFloat();
            }
            for (int i14 = 0; i14 < 11; i14++) {
                if (i3 == 10 && i14 == 4) {
                    this.u[i14] = 1;
                } else if (i3 < 15 && i14 == 9) {
                    this.u[i14] = 18;
                } else if (i3 >= 20 || i14 != 10) {
                    this.u[i14] = objectInputStream.readInt();
                } else {
                    this.u[i14] = 0;
                }
            }
            for (int i15 = 0; i15 < 7; i15++) {
                if (i3 < 14 && i15 == 6) {
                    this.v[i15] = 1.0f;
                } else if (i3 >= 16 || i15 != 5) {
                    this.v[i15] = objectInputStream.readFloat();
                } else {
                    this.v[i15] = 0.0f;
                }
            }
        }
        this.d = (float) (((double) this.d) - (6.283185307179586d * Math.floor(((double) this.d) / 6.283185307179586d)));
        this.e = (float) (((double) this.e) - (6.283185307179586d * Math.floor(((double) this.e) / 6.283185307179586d)));
        this.f = (float) (((double) this.f) - (6.283185307179586d * Math.floor(((double) this.f) / 6.283185307179586d)));
        for (int i16 = 0; i16 < 7; i16++) {
            if (this.v[i16] < z[i16]) {
                this.v[i16] = z[i16];
            }
            if (this.v[i16] > A[i16]) {
                this.v[i16] = A[i16];
            }
        }
        for (int i17 = 0; i17 < 11; i17++) {
            if (this.u[i17] < 0) {
                this.u[i17] = 0;
            }
            if (this.u[i17] >= w[i17]) {
                this.u[i17] = w[i17] - 1;
            }
        }
        for (int i18 = 0; i18 < 11; i18++) {
            if (this.t[i18].a < -8.0f) {
                this.t[i18].a = -8.0f;
            }
            if (this.t[i18].b < -8.0f) {
                this.t[i18].b = -8.0f;
            }
            if (this.t[i18].c < -8.0f) {
                this.t[i18].c = -8.0f;
            }
            if (this.t[i18].a > 8.0f) {
                this.t[i18].a = 8.0f;
            }
            if (this.t[i18].b > 8.0f) {
                this.t[i18].b = 8.0f;
            }
            if (this.t[i18].c > 8.0f) {
                this.t[i18].c = 8.0f;
            }
            if (this.t[i18].e < 0) {
                this.t[i18].e = 0;
            }
            if (this.t[i18].e > 2) {
                this.t[i18].e = 2;
            }
            if (this.t[i18].d < 0) {
                this.t[i18].d = 0;
            }
            if (this.t[i18].d >= 8) {
                this.t[i18].d = 7;
            }
        }
        if (this.c < 0.1f) {
            this.c = 0.1f;
        }
        if (this.c > 0.9f) {
            this.c = 0.9f;
        }
        if (this.g > 10.0f) {
            this.g = 10.0f;
        }
        if (this.g < 0.1f) {
            this.g = 0.1f;
        }
        if (this.g <= 10.0f && this.g >= 0.1f && this.c >= 0.1f && ((double) this.c) <= 0.8999999985098839d) {
            z2 = true;
        }
        if (!z2) {
            com.saterskog.b.a.a("Illegal values, cosmic radiation or cheater..");
        }
    }

    static float a(float f2, float f3, float f4, d dVar) {
        if (dVar.nextInt(2) == 0) {
            return f2 + ((f3 - f2) * ((float) dVar.nextDouble()));
        }
        float nextGaussian = ((f3 - f2) * ((float) dVar.nextGaussian()) * 0.03f) + f4;
        if (nextGaussian < f2) {
            nextGaussian = f2;
        }
        if (nextGaussian <= f3) {
            return nextGaussian;
        }
        return f3;
    }
}
