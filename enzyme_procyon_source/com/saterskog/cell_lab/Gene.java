// 
// Decompiled by Procyon v0.5.36
// 

package com.saterskog.cell_lab;

import java.io.ObjectOutputStream;
import com.saterskog.b.a;
import java.io.ObjectInputStream;
import com.saterskog.b.d;
import android.os.Parcel;
import android.os.Parcelable$Creator;
import android.os.Parcelable;

public class Gene implements Parcelable
{
    public static final float[] A;
    public static final int[] B;
    static final Parcelable$Creator<Gene> C;
    public static final int[] w;
    public static final float[] x;
    public static final float[] y;
    public static final float[] z;
    public final float[] a;
    public float b;
    public float c;
    public float d;
    public float e;
    public int enzyme_maxSplit;
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
    
    static {
        w = new int[11];
        x = new float[11];
        y = new float[11];
        z = new float[7];
        A = new float[7];
        B = new int[] { -1, 5, 10, 20, 40, 80 };
        Gene.w[0] = 80;
        Gene.w[1] = 80;
        Gene.w[2] = 4;
        Gene.w[3] = 6;
        Gene.w[4] = 15;
        for (int i = 0; i < 4; ++i) {
            Gene.w[i + 5] = 4;
        }
        Gene.w[9] = 20;
        Gene.w[10] = Gene.B.length;
        Gene.x[0] = 0.0f;
        Gene.y[0] = 1.0f;
        Gene.x[1] = -3.0f;
        Gene.y[1] = 3.0f;
        Gene.x[2] = -1.0f;
        Gene.y[2] = 1.0f;
        Gene.x[3] = -0.5f;
        Gene.y[3] = 0.5f;
        Gene.x[4] = -1.0f;
        Gene.y[4] = 1.0f;
        Gene.x[5] = -1.0f;
        Gene.y[5] = 1.0f;
        Gene.x[6] = -1.0f;
        Gene.y[6] = 1.0f;
        for (int j = 0; j < 4; ++j) {
            Gene.x[j + 7] = -20.0f;
            Gene.y[j + 7] = 20.0f;
        }
        Gene.z[0] = -60.0f;
        Gene.A[0] = 60.0f;
        Gene.z[1] = 0.0f;
        Gene.A[1] = 1.0f;
        Gene.z[2] = 0.0f;
        Gene.A[2] = 1.0f;
        Gene.z[3] = 0.0f;
        Gene.A[3] = 1.0f;
        Gene.z[4] = 0.0f;
        Gene.A[4] = (float)Math.sqrt(3.0);
        Gene.z[5] = 0.0f;
        Gene.A[5] = 0.01f;
        Gene.z[6] = 0.5f;
        Gene.A[6] = 2.0f;
        C = (Parcelable$Creator)new Parcelable$Creator<Gene>() {};
    }
    
    public Gene() {
        this.a = new float[3];
        this.t = new a[11];
        this.u = new int[11];
        this.v = new float[7];
        this.s = com.saterskog.cell_lab.h.a;
        for (int i = 0; i < 11; ++i) {
            this.t[i] = new a();
        }
    }
    
    public Gene(final Parcel parcel) {
        final int n = 0;
        final boolean b = true;
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
        this.l = (parcel.readInt() == 1);
        this.m = (parcel.readInt() == 1);
        this.n = (parcel.readInt() == 1);
        this.s = com.saterskog.cell_lab.h.B[parcel.readInt()];
        this.k = parcel.readInt();
        this.o = (parcel.readInt() == 1);
        this.p = (parcel.readInt() == 1);
        this.q = (parcel.readInt() == 1);
        this.r = (parcel.readInt() == 1 && b);
        this.h = parcel.readFloat();
        for (int i = 0; i < 11; ++i) {
            this.t[i] = new a();
            this.t[i].d = (short)parcel.readInt();
            this.t[i].e = (short)parcel.readInt();
            this.t[i].a = parcel.readFloat();
            this.t[i].b = parcel.readFloat();
            this.t[i].c = parcel.readFloat();
        }
        int n2 = 0;
        int j;
        while (true) {
            j = n;
            if (n2 >= 11) {
                break;
            }
            this.u[n2] = parcel.readInt();
            ++n2;
        }
        while (j < 7) {
            this.v[j] = parcel.readFloat();
            ++j;
        }
    }
    
    public Gene(final Gene gene) {
        this.a = new float[3];
        this.t = new a[11];
        this.u = new int[11];
        this.v = new float[7];
        for (int i = 0; i < 11; ++i) {
            this.t[i] = new a();
        }
        this.a(gene);
    }
    
    static float a(float n, final float n2, float n3, final d d) {
        if (d.nextInt(2) == 0) {
            n += (n2 - n) * (float)d.nextDouble();
        }
        else {
            if ((n3 += (n2 - n) * (float)d.nextGaussian() * 0.03f) < n) {
                n3 = n;
            }
            n = n2;
            if (n3 <= n2) {
                n = n3;
            }
        }
        return n;
    }
    
    public final void a(final Gene gene) {
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
        for (int i = 0; i < 11; ++i) {
            this.t[i].d = gene.t[i].d;
            this.t[i].e = gene.t[i].e;
            this.t[i].a = gene.t[i].a;
            this.t[i].b = gene.t[i].b;
            this.t[i].c = gene.t[i].c;
        }
        System.arraycopy(gene.u, 0, this.u, 0, 11);
        System.arraycopy(gene.v, 0, this.v, 0, 7);
    }
    
    public final void a(final ObjectInputStream objectInputStream, int i) {
        final int n = 0;
        int int1;
        if (i > 2) {
            int1 = objectInputStream.readInt();
        }
        else {
            int1 = 1;
        }
        float float1;
        int n2;
        if (int1 < 7) {
            this.a[0] = objectInputStream.readFloat();
            this.a[1] = objectInputStream.readFloat();
            this.a[2] = objectInputStream.readFloat();
            this.b = (float)objectInputStream.readDouble();
            this.c = (float)objectInputStream.readDouble();
            this.d = (float)objectInputStream.readDouble();
            if (int1 == 5) {
                this.e = (float)(objectInputStream.readDouble() + 3.141592653589793);
            }
            else {
                this.e = (float)objectInputStream.readDouble();
            }
            this.f = (float)objectInputStream.readDouble();
            if (int1 < 9) {
                this.d += (float)3.141592653589793;
                this.e += (float)3.141592653589793;
                this.f += (float)3.141592653589793;
            }
            this.g = (float)objectInputStream.readDouble();
            this.i = objectInputStream.readInt();
            this.j = objectInputStream.readInt();
            this.l = objectInputStream.readBoolean();
            this.m = objectInputStream.readBoolean();
            this.n = objectInputStream.readBoolean();
            this.s = com.saterskog.cell_lab.h.B[objectInputStream.readInt()];
            this.k = objectInputStream.readInt();
            this.o = objectInputStream.readBoolean();
            float1 = (float)objectInputStream.readDouble();
            if (int1 >= 3) {
                n2 = objectInputStream.readInt();
                i = objectInputStream.readInt();
            }
            else {
                i = 0;
                n2 = 0;
            }
            if (int1 >= 4) {
                this.p = objectInputStream.readBoolean();
                this.q = objectInputStream.readBoolean();
                this.r = objectInputStream.readBoolean();
                this.h = (float)objectInputStream.readDouble();
            }
            else {
                this.p = false;
                this.q = false;
                this.r = false;
                this.h = 0.0f;
            }
        }
        else {
            this.a[0] = objectInputStream.readFloat();
            this.a[1] = objectInputStream.readFloat();
            this.a[2] = objectInputStream.readFloat();
            this.b = objectInputStream.readFloat();
            this.c = objectInputStream.readFloat();
            this.d = objectInputStream.readFloat();
            this.e = objectInputStream.readFloat();
            this.f = objectInputStream.readFloat();
            if (int1 < 9) {
                this.d += (float)3.141592653589793;
                this.e += (float)3.141592653589793;
                this.f += (float)3.141592653589793;
                this.c = 1.0f - this.c;
            }
            this.g = objectInputStream.readFloat();
            this.i = objectInputStream.readInt();
            this.j = objectInputStream.readInt();
            this.l = objectInputStream.readBoolean();
            this.m = objectInputStream.readBoolean();
            this.n = objectInputStream.readBoolean();
            this.s = com.saterskog.cell_lab.h.B[objectInputStream.readInt()];
            this.k = objectInputStream.readInt();
            this.o = objectInputStream.readBoolean();
            if (int1 < 9) {
                float1 = objectInputStream.readFloat();
                n2 = objectInputStream.readInt();
                i = objectInputStream.readInt();
            }
            else {
                i = 0;
                n2 = 0;
                float1 = 0.0f;
            }
            this.p = objectInputStream.readBoolean();
            this.q = objectInputStream.readBoolean();
            this.r = objectInputStream.readBoolean();
            if (int1 < 16) {
                this.h = objectInputStream.readFloat() * 35.0f;
            }
            else {
                this.h = objectInputStream.readFloat();
            }
        }
        float float2;
        if (int1 < 8) {
            float2 = 0.4f;
        }
        else if (int1 == 8) {
            float2 = objectInputStream.readFloat();
        }
        else {
            float2 = 0.0f;
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
        if (int1 < 9) {
            for (int j = 0; j < 11; ++j) {
                this.t[j].d = 0;
                this.t[j].a = 0.0f;
                this.t[j].b = 0.0f;
                this.t[j].c = 0.0f;
            }
            for (int k = 0; k < 11; ++k) {
                this.u[k] = 0;
            }
            for (int l = 0; l < 7; ++l) {
                this.v[l] = 0.0f;
            }
            this.t[0].b = (float2 - Gene.x[0]) * 2.0f / (Gene.y[0] - Gene.x[0]) - 1.0f;
            this.t[1].b = -1.0f + 2.0f * (float1 - Gene.x[0]) / (Gene.y[0] - Gene.x[0]);
            this.u[0] = n2;
            this.u[1] = i;
            this.v[6] = 1.0f;
            this.u[9] = Gene.w[9] - 1;
        }
        else {
            a a;
            for (i = 0; i < 11; ++i) {
                this.t[i].d = objectInputStream.readShort();
                if (int1 >= 17) {
                    this.t[i].e = objectInputStream.readShort();
                }
                else if (this.t[i].d == -1) {
                    this.t[i].d = 0;
                    this.t[i].e = 0;
                }
                else if (this.t[i].d < 4) {
                    this.t[i].e = 1;
                }
                else {
                    a = this.t[i];
                    a.d -= 4;
                    this.t[i].e = 2;
                }
                this.t[i].a = objectInputStream.readFloat();
                this.t[i].b = objectInputStream.readFloat();
                this.t[i].c = objectInputStream.readFloat();
            }
            for (i = 0; i < 11; ++i) {
                if (int1 == 10 && i == 4) {
                    this.u[i] = 1;
                }
                else if (int1 < 15 && i == 9) {
                    this.u[i] = 18;
                }
                else if (int1 < 20 && i == 10) {
                    this.u[i] = 0;
                }
                else {
                    this.u[i] = objectInputStream.readInt();
                }
            }
            for (i = 0; i < 7; ++i) {
                if (int1 < 14 && i == 6) {
                    this.v[i] = 1.0f;
                }
                else if (int1 < 16 && i == 5) {
                    this.v[i] = 0.0f;
                }
                else {
                    this.v[i] = objectInputStream.readFloat();
                }
            }
        }
        this.d -= (float)(6.283185307179586 * Math.floor(this.d / 6.283185307179586));
        this.e -= (float)(6.283185307179586 * Math.floor(this.e / 6.283185307179586));
        this.f -= (float)(6.283185307179586 * Math.floor(this.f / 6.283185307179586));
        for (i = 0; i < 7; ++i) {
            if (this.v[i] < Gene.z[i]) {
                this.v[i] = Gene.z[i];
            }
            if (this.v[i] > Gene.A[i]) {
                this.v[i] = Gene.A[i];
            }
        }
        for (i = 0; i < 11; ++i) {
            if (this.u[i] < 0) {
                this.u[i] = 0;
            }
            if (this.u[i] >= Gene.w[i]) {
                this.u[i] = Gene.w[i] - 1;
            }
        }
        for (i = 0; i < 11; ++i) {
            if (this.t[i].a < -8.0f) {
                this.t[i].a = -8.0f;
            }
            if (this.t[i].b < -8.0f) {
                this.t[i].b = -8.0f;
            }
            if (this.t[i].c < -8.0f) {
                this.t[i].c = -8.0f;
            }
            if (this.t[i].a > 8.0f) {
                this.t[i].a = 8.0f;
            }
            if (this.t[i].b > 8.0f) {
                this.t[i].b = 8.0f;
            }
            if (this.t[i].c > 8.0f) {
                this.t[i].c = 8.0f;
            }
            if (this.t[i].e < 0) {
                this.t[i].e = 0;
            }
            if (this.t[i].e > 2) {
                this.t[i].e = 2;
            }
            if (this.t[i].d < 0) {
                this.t[i].d = 0;
            }
            if (this.t[i].d >= 8) {
                this.t[i].d = 7;
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
        if (this.g > 10.0f) {
            i = n;
        }
        else {
            i = n;
            if (this.g >= 0.1f) {
                i = n;
                if (this.c >= 0.1f) {
                    i = n;
                    if (this.c <= 0.8999999985098839) {
                        i = 1;
                    }
                }
            }
        }
        if (i == 0) {
            com.saterskog.b.a.a("Illegal values, cosmic radiation or cheater..");
        }
    }
    
    public final void a(final ObjectOutputStream objectOutputStream) {
        final int n = 0;
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
        for (int i = 0; i < 11; ++i) {
            objectOutputStream.writeShort(this.t[i].d);
            objectOutputStream.writeShort(this.t[i].e);
            objectOutputStream.writeFloat(this.t[i].a);
            objectOutputStream.writeFloat(this.t[i].b);
            objectOutputStream.writeFloat(this.t[i].c);
        }
        int n2 = 0;
        int j;
        while (true) {
            j = n;
            if (n2 >= 11) {
                break;
            }
            objectOutputStream.writeInt(this.u[n2]);
            ++n2;
        }
        while (j < 7) {
            objectOutputStream.writeFloat(this.v[j]);
            ++j;
        }
    }
    
    public int describeContents() {
        return 0;
    }
    
    public void writeToParcel(final Parcel parcel, int i) {
        final int n = 1;
        final int n2 = 0;
        parcel.writeFloatArray(this.a);
        parcel.writeFloat(this.b);
        parcel.writeFloat(this.c);
        parcel.writeFloat(this.d);
        parcel.writeFloat(this.e);
        parcel.writeFloat(this.f);
        parcel.writeFloat(this.g);
        parcel.writeInt(this.i);
        parcel.writeInt(this.j);
        if (this.l) {
            i = 1;
        }
        else {
            i = 0;
        }
        parcel.writeInt(i);
        if (this.m) {
            i = 1;
        }
        else {
            i = 0;
        }
        parcel.writeInt(i);
        if (this.n) {
            i = 1;
        }
        else {
            i = 0;
        }
        parcel.writeInt(i);
        parcel.writeInt(this.s.ordinal());
        parcel.writeInt(this.k);
        if (this.o) {
            i = 1;
        }
        else {
            i = 0;
        }
        parcel.writeInt(i);
        if (this.p) {
            i = 1;
        }
        else {
            i = 0;
        }
        parcel.writeInt(i);
        if (this.q) {
            i = 1;
        }
        else {
            i = 0;
        }
        parcel.writeInt(i);
        if (this.r) {
            i = n;
        }
        else {
            i = 0;
        }
        parcel.writeInt(i);
        parcel.writeFloat(this.h);
        for (i = 0; i < 11; ++i) {
            parcel.writeInt((int)this.t[i].d);
            parcel.writeInt((int)this.t[i].e);
            parcel.writeFloat(this.t[i].a);
            parcel.writeFloat(this.t[i].b);
            parcel.writeFloat(this.t[i].c);
        }
        i = 0;
        int j;
        while (true) {
            j = n2;
            if (i >= 11) {
                break;
            }
            parcel.writeInt(this.u[i]);
            ++i;
        }
        while (j < 7) {
            parcel.writeFloat(this.v[j]);
            ++j;
        }
    }
    
    public final class a
    {
        float a;
        float b;
        float c;
        short d;
        short e;
    }
}
