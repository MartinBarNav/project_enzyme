// 
// Decompiled by Procyon v0.5.36
// 

package com.saterskog.cell_lab;

import java.io.ObjectOutputStream;
import com.saterskog.b.d;
import java.io.ObjectInputStream;
import android.os.Parcel;
import android.os.Parcelable$Creator;
import android.os.Parcelable;

public class Cell implements Parcelable
{
    public static final double a;
    static final Parcelable$Creator<Cell> ad;
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
    
    static {
        a = Math.sqrt(1.7999999999999998E-4);
        ad = (Parcelable$Creator)new Parcelable$Creator<Cell>() {};
    }
    
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
        for (int i = 0; i < 80; ++i) {
            this.I[i] = new Gene();
        }
        for (int j = 0; j < 20; ++j) {
            this.A[j] = new u();
            this.H[j] = new Link();
        }
        this.t = 0.0;
        this.u = 0.0;
        this.v = 0.0;
        this.G = 0;
    }
    
    public Cell(final Parcel parcel) {
        final boolean b = true;
        final int n = 0;
        this.A = new u[20];
        this.H = new Link[20];
        this.I = new Gene[80];
        this.J = new float[4];
        this.U = new float[8];
        this.V = new float[4];
        this.W = new float[4];
        for (int i = 0; i < 20; ++i) {
            this.A[i] = new u();
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
        for (int j = 0; j < 20; ++j) {
            this.H[j] = (Link)parcel.readParcelable(Link.class.getClassLoader());
        }
        this.C = parcel.readInt();
        this.x = (parcel.readByte() != 0);
        parcel.readFloatArray(this.J);
        for (int k = 0; k < 80; ++k) {
            this.I[k] = (Gene)parcel.readParcelable(Gene.class.getClassLoader());
        }
        this.D = parcel.readInt();
        this.E = parcel.readInt();
        this.F = parcel.readInt();
        this.t = parcel.readDouble();
        this.u = parcel.readDouble();
        this.v = parcel.readDouble();
        this.p = parcel.readDouble();
        this.y = (parcel.readByte() != 0 && b);
        for (int l = n; l < 4; ++l) {
            this.U[l] = parcel.readFloat();
            this.W[l] = parcel.readFloat();
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
    
    private void c() {
        int i = 0;
        int n = 0;
        while (i < 80) {
            if (n != 0) {
                this.I[i].p = false;
            }
            if (this.I[i].p) {
                n = 1;
            }
            ++i;
        }
        if (n == 0) {
            this.I[0].p = true;
        }
    }
    
    public final double a() {
        double w;
        if (this.I[this.D].s == com.saterskog.cell_lab.h.e) {
            w = (this.w + this.S) * 0.36 / 2.16;
        }
        else {
            w = this.w;
        }
        return w;
    }
    
    public final float a(final int n) {
        return this.I[this.D].v[n];
    }
    
    public final float a(final int n, final int n2) {
        final Gene.a a = this.I[this.D].t[n];
        while (true) {
            Label_0237: {
                if (a.e == 0) {
                    break Label_0237;
                }
                float n3 = 0.0f;
                if (a.d < 4) {
                    n3 = this.U[a.d + n2];
                }
                else {
                    switch (a.d) {
                        case 4: {
                            n3 = (float)(this.w / 0.36);
                            break;
                        }
                        case 5: {
                            n3 = (float)(this.o * 0.004166666666666667);
                            break;
                        }
                        case 6: {
                            n3 = (float)this.p;
                            break;
                        }
                        case 7: {
                            n3 = this.C / 20.0f;
                            break;
                        }
                    }
                }
                float n4;
                if (a.e == 1) {
                    n4 = n3 * a.a + a.b;
                }
                else {
                    if (n3 >= a.c) {
                        break Label_0237;
                    }
                    n4 = a.a;
                }
                float n5 = n4;
                if (n4 < -1.0f) {
                    n5 = -1.0f;
                }
                float n6 = n5;
                if (n5 > 1.0f) {
                    n6 = 1.0f;
                }
                return (n6 + 1.0f) * ((Gene.y[n] - Gene.x[n]) * 0.5f) + Gene.x[n];
            }
            float n4 = a.b;
            continue;
        }
    }
    
    public final void a(final Cell cell) {
        final int n = 0;
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
        for (int i = 0; i < 20; ++i) {
            this.H[i].a(cell.H[i]);
        }
        this.C = cell.C;
        for (int j = 0; j < 4; ++j) {
            this.J[j] = cell.J[j];
        }
        this.x = cell.x;
        for (int k = 0; k < 80; ++k) {
            this.I[k].a(cell.I[k]);
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
        for (int l = 0; l < this.B; ++l) {
            final u u = this.A[l];
            final u u2 = cell.A[l];
            u.a = u2.a;
            u.c = u2.c;
            u.b = u2.b;
            u.d = u2.d;
            u.g = u2.g;
            u.e = u2.e;
            u.f = u2.f;
        }
        this.y = cell.y;
        for (int n2 = n; n2 < 4; ++n2) {
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
    
    public final void a(final ObjectInputStream objectInputStream) {
        final int n = 0;
        final int n2 = 0;
        final int int1 = objectInputStream.readInt();
        if (int1 < 2 || int1 > 3054) {
            throw new RuntimeException("bad cell format version " + int1);
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
        final int int2 = objectInputStream.readInt();
        for (int i = 0; i < Math.min(int2, 20); ++i) {
            this.H[i].a(objectInputStream, int1);
        }
        for (int j = 0; j < int2 - Math.min(int2, 20); ++j) {
            new Link().a(objectInputStream, int1);
        }
        this.C = objectInputStream.readInt();
        this.x = objectInputStream.readBoolean();
        this.J[0] = objectInputStream.readFloat();
        this.J[1] = objectInputStream.readFloat();
        this.J[2] = objectInputStream.readFloat();
        final int int3 = objectInputStream.readInt();
        for (int k = 0; k < Math.min(int3, 80); ++k) {
            this.I[k].a(objectInputStream, int1);
        }
        for (int l = 0; l < int3 - Math.min(int3, 80); ++l) {
            new Gene().a(objectInputStream, int1);
        }
        for (int n3 = 0; n3 < Math.max(int3, 80) - int3; ++n3) {
            this.I[int3 + n3].a(this.I[0]);
            this.I[int3 + n3].p = false;
        }
        this.D = objectInputStream.readInt();
        this.E = objectInputStream.readInt();
        this.F = objectInputStream.readInt();
        this.t = objectInputStream.readDouble();
        this.u = objectInputStream.readDouble();
        this.v = objectInputStream.readDouble();
        this.p = objectInputStream.readDouble();
        if (int1 >= 4) {
            this.y = objectInputStream.readBoolean();
        }
        this.O = com.saterskog.b.d.a.nextInt(15);
        int n4 = n;
        if (int1 >= 9) {
            for (int n5 = n2; n5 < 4; ++n5) {
                this.U[n5] = objectInputStream.readFloat();
                this.W[n5] = objectInputStream.readFloat();
            }
            this.X = objectInputStream.readFloat();
            this.Y = objectInputStream.readFloat();
            this.aa = objectInputStream.readFloat();
            this.ab = objectInputStream.readFloat();
            this.ac = objectInputStream.readFloat();
            if (int1 > 11) {
                this.S = objectInputStream.readFloat();
            }
            else {
                this.S = 0.0f;
            }
        }
        else {
            while (n4 < 4) {
                this.U[n4] = 0.01f;
                this.W[n4] = 0.01f;
                ++n4;
            }
            this.S = 0.0f;
        }
        if (int1 >= 15) {
            this.G = objectInputStream.readInt();
        }
        if (int1 >= 19) {
            this.T = objectInputStream.readInt();
        }
        else {
            this.T = -1;
        }
        if (int1 >= 23) {
            this.q = objectInputStream.readDouble();
        }
        else {
            this.q = 0.0;
        }
        this.c();
    }
    
    public final void a(final ObjectOutputStream objectOutputStream) {
        final int n = 0;
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
        for (int i = 0; i < 20; ++i) {
            final Link link = this.H[i];
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
        for (int j = 0; j < 80; ++j) {
            this.I[j].a(objectOutputStream);
        }
        objectOutputStream.writeInt(this.D);
        objectOutputStream.writeInt(this.E);
        objectOutputStream.writeInt(this.F);
        objectOutputStream.writeDouble(this.t);
        objectOutputStream.writeDouble(this.u);
        objectOutputStream.writeDouble(this.v);
        objectOutputStream.writeDouble(this.p);
        objectOutputStream.writeBoolean(this.y);
        for (int k = n; k < 4; ++k) {
            objectOutputStream.writeFloat(this.U[k]);
            objectOutputStream.writeFloat(this.W[k]);
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
    
    public final int b(final int n) {
        return this.I[this.D].u[n];
    }
    
    public final Gene b() {
        return this.I[this.D];
    }
    
    public int describeContents() {
        return 0;
    }
    
    public void writeToParcel(final Parcel parcel, int i) {
        final int n = 1;
        final int n2 = 0;
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
        for (i = 0; i < 20; ++i) {
            parcel.writeParcelable((Parcelable)this.H[i], 0);
        }
        parcel.writeInt(this.C);
        if (this.x) {
            i = 1;
        }
        else {
            i = 0;
        }
        parcel.writeByte((byte)i);
        parcel.writeFloatArray(this.J);
        for (i = 0; i < 80; ++i) {
            parcel.writeParcelable((Parcelable)this.I[i], 0);
        }
        parcel.writeInt(this.D);
        parcel.writeInt(this.E);
        parcel.writeInt(this.F);
        parcel.writeDouble(this.t);
        parcel.writeDouble(this.u);
        parcel.writeDouble(this.v);
        parcel.writeDouble(this.p);
        if (this.y) {
            i = n;
        }
        else {
            i = 0;
        }
        parcel.writeByte((byte)i);
        for (i = n2; i < 4; ++i) {
            parcel.writeFloat(this.U[i]);
            parcel.writeFloat(this.W[i]);
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
}
