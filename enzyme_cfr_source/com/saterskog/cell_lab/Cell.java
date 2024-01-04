/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
 *  android.os.Parcelable
 *  android.os.Parcelable$Creator
 */
package com.saterskog.cell_lab;

import android.os.Parcel;
import android.os.Parcelable;
import com.saterskog.b.d;
import com.saterskog.cell_lab.Gene;
import com.saterskog.cell_lab.Link;
import com.saterskog.cell_lab.h;
import com.saterskog.cell_lab.u;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Cell
implements Parcelable {
    public static final double a = Math.sqrt(1.7999999999999998E-4);
    static final Parcelable.Creator<Cell> ad = new Parcelable.Creator<Cell>(){

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
        int n2;
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
        for (n2 = 0; n2 < 80; ++n2) {
            this.I[n2] = new Gene();
        }
        for (n2 = 0; n2 < 20; ++n2) {
            this.A[n2] = new u();
            this.H[n2] = new Link();
        }
        this.t = 0.0;
        this.u = 0.0;
        this.v = 0.0;
        this.G = 0;
    }

    /*
     * Enabled aggressive block sorting
     */
    public Cell(Parcel parcel) {
        int n2;
        boolean bl = true;
        int n3 = 0;
        this.A = new u[20];
        this.H = new Link[20];
        this.I = new Gene[80];
        this.J = new float[4];
        this.U = new float[8];
        this.V = new float[4];
        this.W = new float[4];
        for (n2 = 0; n2 < 20; ++n2) {
            this.A[n2] = new u();
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
        for (n2 = 0; n2 < 20; ++n2) {
            this.H[n2] = (Link)parcel.readParcelable(Link.class.getClassLoader());
        }
        this.C = parcel.readInt();
        boolean bl2 = parcel.readByte() != 0;
        this.x = bl2;
        parcel.readFloatArray(this.J);
        for (n2 = 0; n2 < 80; ++n2) {
            this.I[n2] = (Gene)parcel.readParcelable(Gene.class.getClassLoader());
        }
        this.D = parcel.readInt();
        this.E = parcel.readInt();
        this.F = parcel.readInt();
        this.t = parcel.readDouble();
        this.u = parcel.readDouble();
        this.v = parcel.readDouble();
        this.p = parcel.readDouble();
        bl2 = parcel.readByte() != 0 ? bl : false;
        this.y = bl2;
        n2 = n3;
        while (true) {
            if (n2 >= 4) {
                this.X = parcel.readFloat();
                this.Y = parcel.readFloat();
                this.aa = parcel.readFloat();
                this.ab = parcel.readFloat();
                this.ac = parcel.readFloat();
                this.S = parcel.readFloat();
                this.G = parcel.readInt();
                this.T = parcel.readInt();
                this.q = parcel.readDouble();
                return;
            }
            this.U[n2] = parcel.readFloat();
            this.W[n2] = parcel.readFloat();
            ++n2;
        }
    }

    private void c() {
        boolean bl = false;
        for (int i2 = 0; i2 < 80; ++i2) {
            if (bl) {
                this.I[i2].p = false;
            }
            if (!this.I[i2].p) continue;
            bl = true;
        }
        if (!bl) {
            this.I[0].p = true;
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final double a() {
        if (this.I[this.D].s != com.saterskog.cell_lab.h.e) return this.w;
        return (this.w + (double)this.S) * 0.36 / 2.16;
    }

    public final float a(int n2) {
        return this.I[this.D].v[n2];
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    public final float a(int var1_1, int var2_2) {
        var3_3 = this.I[this.D].t[var1_1];
        if (var3_3.e == 0) ** GOTO lbl-1000
        var4_4 = 0.0f;
        if (var3_3.d < 4) {
            var4_4 = this.U[var3_3.d + var2_2];
        } else {
            switch (var3_3.d) {
                default: {
                    break;
                }
                case 4: {
                    var4_4 = (float)(this.w / 0.36);
                    break;
                }
                case 5: {
                    var4_4 = (float)(this.o * 0.004166666666666667);
                    break;
                }
                case 6: {
                    var4_4 = (float)this.p;
                    break;
                }
                case 7: {
                    var4_4 = (float)this.C / 20.0f;
                }
            }
        }
        if (var3_3.e == 1) {
            var4_4 = var4_4 * var3_3.a + var3_3.b;
        } else if (var4_4 < var3_3.c) {
            var4_4 = var3_3.a;
        } else lbl-1000:
        // 2 sources

        {
            var4_4 = var3_3.b;
        }
        var5_5 = var4_4;
        if (var4_4 < -1.0f) {
            var5_5 = -1.0f;
        }
        var4_4 = var5_5;
        if (var5_5 > 1.0f) {
            var4_4 = 1.0f;
        }
        var5_5 = Gene.x[var1_1];
        return (var4_4 + 1.0f) * ((Gene.y[var1_1] - Gene.x[var1_1]) * 0.5f) + var5_5;
    }

    public final void a(Cell cell) {
        int n2;
        int n3 = 0;
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
        for (n2 = 0; n2 < 20; ++n2) {
            this.H[n2].a(cell.H[n2]);
        }
        this.C = cell.C;
        for (n2 = 0; n2 < 4; ++n2) {
            this.J[n2] = cell.J[n2];
        }
        this.x = cell.x;
        for (n2 = 0; n2 < 80; ++n2) {
            this.I[n2].a(cell.I[n2]);
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
        for (n2 = 0; n2 < this.B; ++n2) {
            u u2 = this.A[n2];
            u u3 = cell.A[n2];
            u2.a = u3.a;
            u2.c = u3.c;
            u2.b = u3.b;
            u2.d = u3.d;
            u2.g = u3.g;
            u2.e = u3.e;
            u2.f = u3.f;
        }
        this.y = cell.y;
        for (n2 = n3; n2 < 4; ++n2) {
            this.U[n2] = cell.U[n2];
            this.W[n2] = cell.W[n2];
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
    }

    /*
     * Enabled aggressive block sorting
     */
    public final void a(ObjectInputStream objectInputStream) {
        int n2;
        int n3 = 0;
        int n4 = 0;
        int n5 = objectInputStream.readInt();
        if (n5 < 2 || n5 > 3054) {
            throw new RuntimeException("bad cell format version " + n5);
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
        int n6 = objectInputStream.readInt();
        for (n2 = 0; n2 < Math.min(n6, 20); ++n2) {
            this.H[n2].a(objectInputStream, n5);
        }
        for (n2 = 0; n2 < n6 - Math.min(n6, 20); ++n2) {
            new Link().a(objectInputStream, n5);
        }
        this.C = objectInputStream.readInt();
        this.x = objectInputStream.readBoolean();
        this.J[0] = objectInputStream.readFloat();
        this.J[1] = objectInputStream.readFloat();
        this.J[2] = objectInputStream.readFloat();
        n6 = objectInputStream.readInt();
        for (n2 = 0; n2 < Math.min(n6, 80); ++n2) {
            this.I[n2].a(objectInputStream, n5);
        }
        for (n2 = 0; n2 < n6 - Math.min(n6, 80); ++n2) {
            new Gene().a(objectInputStream, n5);
        }
        for (n2 = 0; n2 < Math.max(n6, 80) - n6; ++n2) {
            this.I[n6 + n2].a(this.I[0]);
            this.I[n6 + n2].p = false;
        }
        this.D = objectInputStream.readInt();
        this.E = objectInputStream.readInt();
        this.F = objectInputStream.readInt();
        this.t = objectInputStream.readDouble();
        this.u = objectInputStream.readDouble();
        this.v = objectInputStream.readDouble();
        this.p = objectInputStream.readDouble();
        if (n5 >= 4) {
            this.y = objectInputStream.readBoolean();
        }
        this.O = com.saterskog.b.d.a.nextInt(15);
        if (n5 >= 9) {
            for (n2 = n4; n2 < 4; ++n2) {
                this.U[n2] = objectInputStream.readFloat();
                this.W[n2] = objectInputStream.readFloat();
            }
            this.X = objectInputStream.readFloat();
            this.Y = objectInputStream.readFloat();
            this.aa = objectInputStream.readFloat();
            this.ab = objectInputStream.readFloat();
            this.ac = objectInputStream.readFloat();
            this.S = n5 > 11 ? objectInputStream.readFloat() : 0.0f;
        } else {
            for (n2 = n3; n2 < 4; ++n2) {
                this.U[n2] = 0.01f;
                this.W[n2] = 0.01f;
            }
            this.S = 0.0f;
        }
        if (n5 >= 15) {
            this.G = objectInputStream.readInt();
        }
        this.T = n5 >= 19 ? objectInputStream.readInt() : -1;
        this.q = n5 >= 23 ? objectInputStream.readDouble() : 0.0;
        this.c();
    }

    public final void a(ObjectOutputStream objectOutputStream) {
        int n2;
        int n3 = 0;
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
        for (n2 = 0; n2 < 20; ++n2) {
            Link link = this.H[n2];
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
        for (n2 = 0; n2 < 80; ++n2) {
            this.I[n2].a(objectOutputStream);
        }
        objectOutputStream.writeInt(this.D);
        objectOutputStream.writeInt(this.E);
        objectOutputStream.writeInt(this.F);
        objectOutputStream.writeDouble(this.t);
        objectOutputStream.writeDouble(this.u);
        objectOutputStream.writeDouble(this.v);
        objectOutputStream.writeDouble(this.p);
        objectOutputStream.writeBoolean(this.y);
        for (n2 = n3; n2 < 4; ++n2) {
            objectOutputStream.writeFloat(this.U[n2]);
            objectOutputStream.writeFloat(this.W[n2]);
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

    public final int b(int n2) {
        return this.I[this.D].u[n2];
    }

    public final Gene b() {
        return this.I[this.D];
    }

    public int describeContents() {
        return 0;
    }

    /*
     * Enabled aggressive block sorting
     */
    public void writeToParcel(Parcel parcel, int n2) {
        int n3 = 1;
        int n4 = 0;
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
        for (n2 = 0; n2 < 20; ++n2) {
            parcel.writeParcelable((Parcelable)this.H[n2], 0);
        }
        parcel.writeInt(this.C);
        n2 = this.x ? 1 : 0;
        parcel.writeByte((byte)n2);
        parcel.writeFloatArray(this.J);
        for (n2 = 0; n2 < 80; ++n2) {
            parcel.writeParcelable((Parcelable)this.I[n2], 0);
        }
        parcel.writeInt(this.D);
        parcel.writeInt(this.E);
        parcel.writeInt(this.F);
        parcel.writeDouble(this.t);
        parcel.writeDouble(this.u);
        parcel.writeDouble(this.v);
        parcel.writeDouble(this.p);
        n2 = this.y ? n3 : 0;
        parcel.writeByte((byte)n2);
        n2 = n4;
        while (true) {
            if (n2 >= 4) {
                parcel.writeFloat(this.X);
                parcel.writeFloat(this.Y);
                parcel.writeFloat(this.aa);
                parcel.writeFloat(this.ab);
                parcel.writeFloat(this.ac);
                parcel.writeFloat(this.S);
                parcel.writeInt(this.G);
                parcel.writeInt(this.T);
                parcel.writeDouble(this.q);
                return;
            }
            parcel.writeFloat(this.U[n2]);
            parcel.writeFloat(this.W[n2]);
            ++n2;
        }
    }
}

