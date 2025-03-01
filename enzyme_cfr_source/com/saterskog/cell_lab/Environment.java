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
import com.saterskog.cell_lab.h;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Environment
implements Parcelable {
    static final Parcelable.Creator<Environment> A = new Parcelable.Creator<Environment>(){

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new Environment(parcel);
        }
    };
    double a;
    double b;
    double c;
    double d;
    double e;
    double f;
    double g;
    double h;
    double i;
    double j;
    double k;
    double l;
    double m;
    float n;
    float o;
    double p;
    double q;
    int r;
    int s;
    boolean[] t;
    boolean u;
    boolean v;
    boolean w;
    boolean x;
    boolean y;
    double z;

    public Environment() {
        this.l = 0.0;
        this.m = 0.0;
        this.t = new boolean[com.saterskog.cell_lab.h.B.length];
    }

    /*
     * Enabled aggressive block sorting
     */
    public Environment(Parcel parcel) {
        boolean bl;
        boolean bl2 = true;
        this.l = 0.0;
        this.m = 0.0;
        this.a = parcel.readDouble();
        this.b = parcel.readDouble();
        this.c = parcel.readDouble();
        this.d = parcel.readDouble();
        this.e = parcel.readDouble();
        this.f = parcel.readDouble();
        this.g = parcel.readDouble();
        this.t = new boolean[com.saterskog.cell_lab.h.B.length];
        for (int i2 = 0; i2 < com.saterskog.cell_lab.h.B.length; ++i2) {
            boolean[] arrbl = this.t;
            bl = parcel.readInt() != 0;
            arrbl[i2] = bl;
        }
        bl = parcel.readInt() != 0;
        this.w = bl;
        this.i = parcel.readDouble();
        this.h = parcel.readDouble();
        this.j = parcel.readDouble();
        bl = parcel.readInt() != 0;
        this.x = bl;
        this.z = parcel.readDouble();
        this.r = parcel.readInt();
        this.s = parcel.readInt();
        this.k = parcel.readDouble();
        this.m = parcel.readDouble();
        this.l = parcel.readDouble();
        bl = parcel.readInt() == 1;
        this.u = bl;
        this.n = parcel.readFloat();
        bl = parcel.readInt() == 1;
        this.v = bl;
        this.p = parcel.readDouble();
        this.q = parcel.readDouble();
        bl = parcel.readInt() == 1 ? bl2 : false;
        this.y = bl;
        this.o = parcel.readFloat();
    }

    public final void a(Environment environment) {
        this.a = environment.a;
        this.b = environment.b;
        this.c = environment.c;
        this.d = environment.d;
        this.e = environment.e;
        this.g = environment.g;
        this.f = environment.f;
        System.arraycopy(environment.t, 0, this.t, 0, com.saterskog.cell_lab.h.B.length);
        this.w = environment.w;
        this.i = environment.i;
        this.h = environment.h;
        this.j = environment.j;
        this.x = environment.x;
        this.z = environment.z;
        this.r = environment.r;
        this.s = environment.s;
        this.k = environment.k;
        this.m = environment.m;
        this.l = environment.l;
        this.u = environment.u;
        this.n = environment.n;
        this.v = environment.v;
        this.p = environment.p;
        this.q = environment.q;
        this.y = environment.y;
        this.o = environment.o;
    }

    /*
     * Enabled aggressive block sorting
     */
    public final void a(ObjectInputStream objectInputStream) {
        int n2;
        int n3 = objectInputStream.readInt();
        if (n3 > 3054) throw new RuntimeException("Incompatible environment format");
        if (n3 <= 0) {
            throw new RuntimeException("Incompatible environment format");
        }
        this.a = objectInputStream.readDouble();
        if (n3 == 1) {
            this.a *= 0.15;
        }
        this.b = n3 > 1 ? objectInputStream.readDouble() : 0.15;
        this.c = objectInputStream.readDouble();
        this.d = objectInputStream.readDouble();
        this.e = objectInputStream.readDouble();
        this.f = objectInputStream.readDouble();
        if (n3 <= 23) {
            objectInputStream.readDouble();
        }
        this.g = objectInputStream.readDouble();
        int n4 = objectInputStream.readInt();
        for (n2 = 0; n2 < com.saterskog.cell_lab.h.B.length; ++n2) {
            this.t[n2] = false;
        }
        for (n2 = 0; n2 < n4; ++n2) {
            this.t[n2] = objectInputStream.readBoolean();
        }
        this.w = objectInputStream.readBoolean();
        this.i = objectInputStream.readDouble();
        this.h = objectInputStream.readDouble();
        this.j = objectInputStream.readDouble();
        this.x = objectInputStream.readBoolean();
        double d2 = n3 > 20 ? objectInputStream.readDouble() : (objectInputStream.readBoolean() ? 1.0 : 0.0);
        this.z = d2;
        if (n3 < 3) {
            this.r = 800;
            this.s = 3500;
            this.k = 1.0;
        } else {
            this.r = objectInputStream.readInt();
            this.s = objectInputStream.readInt();
            this.k = objectInputStream.readDouble();
        }
        if (n3 < 9) {
            this.m = 0.0;
            this.l = 0.0;
            this.u = false;
        } else {
            this.m = objectInputStream.readDouble();
            this.l = objectInputStream.readDouble();
            this.u = objectInputStream.readBoolean();
        }
        this.n = n3 < 10 ? 0.3f : objectInputStream.readFloat();
        if (n3 >= 14) {
            this.v = objectInputStream.readBoolean();
            this.p = objectInputStream.readDouble();
            this.q = objectInputStream.readDouble();
        } else {
            this.v = true;
            this.p = 0.0;
            this.q = 0.01f;
        }
        if (n3 >= 22) {
            this.y = objectInputStream.readBoolean();
            this.o = objectInputStream.readFloat();
            return;
        }
        this.y = false;
        this.o = 0.0f;
    }

    public final void a(ObjectOutputStream objectOutputStream) {
        objectOutputStream.writeInt(3054);
        objectOutputStream.writeDouble(this.a);
        objectOutputStream.writeDouble(this.b);
        objectOutputStream.writeDouble(this.c);
        objectOutputStream.writeDouble(this.d);
        objectOutputStream.writeDouble(this.e);
        objectOutputStream.writeDouble(this.f);
        objectOutputStream.writeDouble(this.g);
        objectOutputStream.writeInt(com.saterskog.cell_lab.h.B.length);
        for (int i2 = 0; i2 < com.saterskog.cell_lab.h.B.length; ++i2) {
            objectOutputStream.writeBoolean(this.t[i2]);
        }
        objectOutputStream.writeBoolean(this.w);
        objectOutputStream.writeDouble(this.i);
        objectOutputStream.writeDouble(this.h);
        objectOutputStream.writeDouble(this.j);
        objectOutputStream.writeBoolean(this.x);
        objectOutputStream.writeDouble(this.z);
        objectOutputStream.writeInt(this.r);
        objectOutputStream.writeInt(this.s);
        objectOutputStream.writeDouble(this.k);
        objectOutputStream.writeDouble(this.m);
        objectOutputStream.writeDouble(this.l);
        objectOutputStream.writeBoolean(this.u);
        objectOutputStream.writeFloat(this.n);
        objectOutputStream.writeBoolean(this.v);
        objectOutputStream.writeDouble(this.p);
        objectOutputStream.writeDouble(this.q);
        objectOutputStream.writeBoolean(this.y);
        objectOutputStream.writeFloat(this.o);
    }

    public int describeContents() {
        return 0;
    }

    /*
     * Enabled aggressive block sorting
     */
    public void writeToParcel(Parcel parcel, int n2) {
        int n3 = 1;
        parcel.writeDouble(this.a);
        parcel.writeDouble(this.b);
        parcel.writeDouble(this.c);
        parcel.writeDouble(this.d);
        parcel.writeDouble(this.e);
        parcel.writeDouble(this.f);
        parcel.writeDouble(this.g);
        for (n2 = 0; n2 < com.saterskog.cell_lab.h.B.length; ++n2) {
            int n4 = this.t[n2] ? 1 : 0;
            parcel.writeInt(n4);
        }
        n2 = this.w ? 1 : 0;
        parcel.writeInt(n2);
        parcel.writeDouble(this.i);
        parcel.writeDouble(this.h);
        parcel.writeDouble(this.j);
        n2 = this.x ? 1 : 0;
        parcel.writeInt(n2);
        parcel.writeDouble(this.z);
        parcel.writeInt(this.r);
        parcel.writeInt(this.s);
        parcel.writeDouble(this.k);
        parcel.writeDouble(this.m);
        parcel.writeDouble(this.l);
        n2 = this.u ? 1 : 0;
        parcel.writeInt(n2);
        parcel.writeFloat(this.n);
        n2 = this.v ? 1 : 0;
        parcel.writeInt(n2);
        parcel.writeDouble(this.p);
        parcel.writeDouble(this.q);
        n2 = this.y ? n3 : 0;
        parcel.writeInt(n2);
        parcel.writeFloat(this.o);
    }
}

