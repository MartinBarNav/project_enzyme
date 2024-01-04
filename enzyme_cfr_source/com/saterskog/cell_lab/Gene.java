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
import com.saterskog.cell_lab.h;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Gene
implements Parcelable {
    public static final float[] A;
    public static final int[] B;
    static final Parcelable.Creator<Gene> C;
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
        int n2;
        w = new int[11];
        x = new float[11];
        y = new float[11];
        z = new float[7];
        A = new float[7];
        B = new int[]{-1, 5, 10, 20, 40, 80};
        Gene.w[0] = 80;
        Gene.w[1] = 80;
        Gene.w[2] = 4;
        Gene.w[3] = 6;
        Gene.w[4] = 15;
        for (n2 = 0; n2 < 4; ++n2) {
            Gene.w[n2 + 5] = 4;
        }
        Gene.w[9] = 20;
        Gene.w[10] = B.length;
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
        for (n2 = 0; n2 < 4; ++n2) {
            Gene.x[n2 + 7] = -20.0f;
            Gene.y[n2 + 7] = 20.0f;
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
        C = new Parcelable.Creator<Gene>(){

            public final /* synthetic */ Object createFromParcel(Parcel parcel) {
                return new Gene(parcel);
            }
        };
    }

    public Gene() {
        this.a = new float[3];
        this.t = new a[11];
        this.u = new int[11];
        this.v = new float[7];
        this.s = com.saterskog.cell_lab.h.a;
        for (int i2 = 0; i2 < 11; ++i2) {
            this.t[i2] = new a();
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    public Gene(Parcel parcel) {
        int n2;
        int n3 = 0;
        boolean bl = true;
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
        boolean bl2 = parcel.readInt() == 1;
        this.l = bl2;
        bl2 = parcel.readInt() == 1;
        this.m = bl2;
        bl2 = parcel.readInt() == 1;
        this.n = bl2;
        this.s = com.saterskog.cell_lab.h.B[parcel.readInt()];
        this.k = parcel.readInt();
        bl2 = parcel.readInt() == 1;
        this.o = bl2;
        bl2 = parcel.readInt() == 1;
        this.p = bl2;
        bl2 = parcel.readInt() == 1;
        this.q = bl2;
        bl2 = parcel.readInt() == 1 ? bl : false;
        this.r = bl2;
        this.h = parcel.readFloat();
        for (n2 = 0; n2 < 11; ++n2) {
            this.t[n2] = new a();
            this.t[n2].d = (short)parcel.readInt();
            this.t[n2].e = (short)parcel.readInt();
            this.t[n2].a = parcel.readFloat();
            this.t[n2].b = parcel.readFloat();
            this.t[n2].c = parcel.readFloat();
        }
        int n4 = 0;
        while (true) {
            n2 = n3;
            if (n4 >= 11) break;
            this.u[n4] = parcel.readInt();
            ++n4;
        }
        while (n2 < 7) {
            this.v[n2] = parcel.readFloat();
            ++n2;
        }
        return;
    }

    public Gene(Gene gene) {
        this.a = new float[3];
        this.t = new a[11];
        this.u = new int[11];
        this.v = new float[7];
        for (int i2 = 0; i2 < 11; ++i2) {
            this.t[i2] = new a();
        }
        this.a(gene);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    static float a(float f2, float f3, float f4, d d2) {
        float f5;
        if (d2.nextInt(2) == 0) {
            f2 += (f3 - f2) * (float)d2.nextDouble();
            return f2;
        }
        f4 = f5 = (f3 - f2) * (float)d2.nextGaussian() * 0.03f + f4;
        if (f5 < f2) {
            f4 = f2;
        }
        f2 = f3;
        if (f4 > f3) return f2;
        return f4;
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
        for (int i2 = 0; i2 < 11; ++i2) {
            this.t[i2].d = gene.t[i2].d;
            this.t[i2].e = gene.t[i2].e;
            this.t[i2].a = gene.t[i2].a;
            this.t[i2].b = gene.t[i2].b;
            this.t[i2].c = gene.t[i2].c;
        }
        System.arraycopy(gene.u, 0, this.u, 0, 11);
        System.arraycopy(gene.v, 0, this.v, 0, 7);
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    public final void a(ObjectInputStream var1_1, int var2_2) {
        var3_3 = 0;
        var4_4 = var2_2 > 2 ? var1_1.readInt() : 1;
        if (var4_4 < 7) {
            this.a[0] = var1_1.readFloat();
            this.a[1] = var1_1.readFloat();
            this.a[2] = var1_1.readFloat();
            this.b = (float)var1_1.readDouble();
            this.c = (float)var1_1.readDouble();
            this.d = (float)var1_1.readDouble();
            this.e = var4_4 == 5 ? (float)(var1_1.readDouble() + 3.141592653589793) : (float)var1_1.readDouble();
            this.f = (float)var1_1.readDouble();
            if (var4_4 < 9) {
                this.d = (float)((double)this.d + 3.141592653589793);
                this.e = (float)((double)this.e + 3.141592653589793);
                this.f = (float)((double)this.f + 3.141592653589793);
            }
            this.g = (float)var1_1.readDouble();
            this.i = var1_1.readInt();
            this.j = var1_1.readInt();
            this.l = var1_1.readBoolean();
            this.m = var1_1.readBoolean();
            this.n = var1_1.readBoolean();
            this.s = com.saterskog.cell_lab.h.B[var1_1.readInt()];
            this.k = var1_1.readInt();
            this.o = var1_1.readBoolean();
            var5_5 = (float)var1_1.readDouble();
            if (var4_4 >= 3) {
                var6_6 = var1_1.readInt();
                var2_2 = var1_1.readInt();
            } else {
                var2_2 = 0;
                var6_6 = 0;
            }
            if (var4_4 >= 4) {
                this.p = var1_1.readBoolean();
                this.q = var1_1.readBoolean();
                this.r = var1_1.readBoolean();
                this.h = (float)var1_1.readDouble();
            } else {
                this.p = false;
                this.q = false;
                this.r = false;
                this.h = 0.0f;
            }
        } else {
            this.a[0] = var1_1.readFloat();
            this.a[1] = var1_1.readFloat();
            this.a[2] = var1_1.readFloat();
            this.b = var1_1.readFloat();
            this.c = var1_1.readFloat();
            this.d = var1_1.readFloat();
            this.e = var1_1.readFloat();
            this.f = var1_1.readFloat();
            if (var4_4 < 9) {
                this.d = (float)((double)this.d + 3.141592653589793);
                this.e = (float)((double)this.e + 3.141592653589793);
                this.f = (float)((double)this.f + 3.141592653589793);
                this.c = 1.0f - this.c;
            }
            this.g = var1_1.readFloat();
            this.i = var1_1.readInt();
            this.j = var1_1.readInt();
            this.l = var1_1.readBoolean();
            this.m = var1_1.readBoolean();
            this.n = var1_1.readBoolean();
            this.s = com.saterskog.cell_lab.h.B[var1_1.readInt()];
            this.k = var1_1.readInt();
            this.o = var1_1.readBoolean();
            if (var4_4 < 9) {
                var5_5 = var1_1.readFloat();
                var6_6 = var1_1.readInt();
                var2_2 = var1_1.readInt();
            } else {
                var2_2 = 0;
                var6_6 = 0;
                var5_5 = 0.0f;
            }
            this.p = var1_1.readBoolean();
            this.q = var1_1.readBoolean();
            this.r = var1_1.readBoolean();
            this.h = var4_4 < 16 ? var1_1.readFloat() * 35.0f : var1_1.readFloat();
        }
        var7_7 = var4_4 < 8 ? 0.4f : (var4_4 == 8 ? var1_1.readFloat() : 0.0f);
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
        if (var4_4 < 9) {
            for (var4_4 = 0; var4_4 < 11; ++var4_4) {
                this.t[var4_4].d = (short)(false ? 1 : 0);
                this.t[var4_4].a = 0.0f;
                this.t[var4_4].b = 0.0f;
                this.t[var4_4].c = 0.0f;
            }
            for (var4_4 = 0; var4_4 < 11; ++var4_4) {
                this.u[var4_4] = 0;
            }
            for (var4_4 = 0; var4_4 < 7; ++var4_4) {
                this.v[var4_4] = 0.0f;
            }
            this.t[0].b = (var7_7 - Gene.x[0]) * 2.0f / (Gene.y[0] - Gene.x[0]) - 1.0f;
            this.t[1].b = -1.0f + 2.0f * (var5_5 - Gene.x[0]) / (Gene.y[0] - Gene.x[0]);
            this.u[0] = var6_6;
            this.u[1] = var2_2;
            this.v[6] = 1.0f;
            this.u[9] = Gene.w[9] - 1;
            while (true) {
                this.d = (float)((double)this.d - 6.283185307179586 * Math.floor((double)this.d / 6.283185307179586));
                this.e = (float)((double)this.e - 6.283185307179586 * Math.floor((double)this.e / 6.283185307179586));
                this.f = (float)((double)this.f - 6.283185307179586 * Math.floor((double)this.f / 6.283185307179586));
                for (var2_2 = 0; var2_2 < 7; ++var2_2) {
                    if (this.v[var2_2] < Gene.z[var2_2]) {
                        this.v[var2_2] = Gene.z[var2_2];
                    }
                    if (!(this.v[var2_2] > Gene.A[var2_2])) continue;
                    this.v[var2_2] = Gene.A[var2_2];
                }
                for (var2_2 = 0; var2_2 < 11; ++var2_2) {
                    if (this.u[var2_2] < 0) {
                        this.u[var2_2] = 0;
                    }
                    if (this.u[var2_2] < Gene.w[var2_2]) continue;
                    this.u[var2_2] = Gene.w[var2_2] - 1;
                }
                for (var2_2 = 0; var2_2 < 11; ++var2_2) {
                    if (this.t[var2_2].a < -8.0f) {
                        this.t[var2_2].a = -8.0f;
                    }
                    if (this.t[var2_2].b < -8.0f) {
                        this.t[var2_2].b = -8.0f;
                    }
                    if (this.t[var2_2].c < -8.0f) {
                        this.t[var2_2].c = -8.0f;
                    }
                    if (this.t[var2_2].a > 8.0f) {
                        this.t[var2_2].a = 8.0f;
                    }
                    if (this.t[var2_2].b > 8.0f) {
                        this.t[var2_2].b = 8.0f;
                    }
                    if (this.t[var2_2].c > 8.0f) {
                        this.t[var2_2].c = 8.0f;
                    }
                    if (this.t[var2_2].e < 0) {
                        this.t[var2_2].e = (short)(false ? 1 : 0);
                    }
                    if (this.t[var2_2].e > 2) {
                        this.t[var2_2].e = (short)2;
                    }
                    if (this.t[var2_2].d < 0) {
                        this.t[var2_2].d = (short)(false ? 1 : 0);
                    }
                    if (this.t[var2_2].d < 8) continue;
                    this.t[var2_2].d = (short)7;
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
                    var2_2 = var3_3;
                } else {
                    var2_2 = var3_3;
                    if (!(this.g < 0.1f)) {
                        var2_2 = var3_3;
                        if (!(this.c < 0.1f)) {
                            var2_2 = var3_3;
                            if (!((double)this.c > 0.8999999985098839)) {
                                var2_2 = 1;
                            }
                        }
                    }
                }
                if (var2_2 != 0) return;
                com.saterskog.b.a.a("Illegal values, cosmic radiation or cheater..");
                return;
            }
        }
        for (var2_2 = 0; var2_2 < 11; ++var2_2) {
            this.t[var2_2].d = var1_1.readShort();
            if (var4_4 >= 17) {
                this.t[var2_2].e = var1_1.readShort();
            } else if (this.t[var2_2].d == -1) {
                this.t[var2_2].d = (short)(false ? 1 : 0);
                this.t[var2_2].e = (short)(false ? 1 : 0);
            } else if (this.t[var2_2].d < 4) {
                this.t[var2_2].e = (short)(true ? 1 : 0);
            } else {
                var8_8 = this.t[var2_2];
                var8_8.d = (short)(var8_8.d - 4);
                this.t[var2_2].e = (short)2;
            }
            this.t[var2_2].a = var1_1.readFloat();
            this.t[var2_2].b = var1_1.readFloat();
            this.t[var2_2].c = var1_1.readFloat();
        }
        for (var2_2 = 0; var2_2 < 11; ++var2_2) {
            this.u[var2_2] = var4_4 == 10 && var2_2 == 4 ? 1 : (var4_4 < 15 && var2_2 == 9 ? 18 : (var4_4 < 20 && var2_2 == 10 ? 0 : var1_1.readInt()));
        }
        var2_2 = 0;
        while (true) {
            if (var2_2 >= 7) ** continue;
            this.v[var2_2] = var4_4 < 14 && var2_2 == 6 ? 1.0f : (var4_4 < 16 && var2_2 == 5 ? 0.0f : var1_1.readFloat());
            ++var2_2;
        }
    }

    public final void a(ObjectOutputStream objectOutputStream) {
        int n2;
        int n3 = 0;
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
        for (n2 = 0; n2 < 11; ++n2) {
            objectOutputStream.writeShort(this.t[n2].d);
            objectOutputStream.writeShort(this.t[n2].e);
            objectOutputStream.writeFloat(this.t[n2].a);
            objectOutputStream.writeFloat(this.t[n2].b);
            objectOutputStream.writeFloat(this.t[n2].c);
        }
        n2 = 0;
        while (true) {
            if (n2 >= 11) break;
            objectOutputStream.writeInt(this.u[n2]);
            ++n2;
        }
        for (int i2 = n3; i2 < 7; ++i2) {
            objectOutputStream.writeFloat(this.v[i2]);
        }
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
        parcel.writeFloatArray(this.a);
        parcel.writeFloat(this.b);
        parcel.writeFloat(this.c);
        parcel.writeFloat(this.d);
        parcel.writeFloat(this.e);
        parcel.writeFloat(this.f);
        parcel.writeFloat(this.g);
        parcel.writeInt(this.i);
        parcel.writeInt(this.j);
        n2 = this.l ? 1 : 0;
        parcel.writeInt(n2);
        n2 = this.m ? 1 : 0;
        parcel.writeInt(n2);
        n2 = this.n ? 1 : 0;
        parcel.writeInt(n2);
        parcel.writeInt(this.s.ordinal());
        parcel.writeInt(this.k);
        n2 = this.o ? 1 : 0;
        parcel.writeInt(n2);
        n2 = this.p ? 1 : 0;
        parcel.writeInt(n2);
        n2 = this.q ? 1 : 0;
        parcel.writeInt(n2);
        n2 = this.r ? n3 : 0;
        parcel.writeInt(n2);
        parcel.writeFloat(this.h);
        for (n2 = 0; n2 < 11; ++n2) {
            parcel.writeInt((int)this.t[n2].d);
            parcel.writeInt((int)this.t[n2].e);
            parcel.writeFloat(this.t[n2].a);
            parcel.writeFloat(this.t[n2].b);
            parcel.writeFloat(this.t[n2].c);
        }
        n2 = 0;
        while (true) {
            n3 = n4;
            if (n2 >= 11) break;
            parcel.writeInt(this.u[n2]);
            ++n2;
        }
        while (n3 < 7) {
            parcel.writeFloat(this.v[n3]);
            ++n3;
        }
        return;
    }

    public final class a {
        float a;
        float b;
        float c;
        short d;
        short e;
    }
}

