package com.saterskog.cell_lab;

import android.os.Parcel;
import android.os.Parcelable;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Environment implements Parcelable {
    static final Parcelable.Creator<Environment> A = new Parcelable.Creator<Environment>() {
        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new Environment[i];
        }

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
        this.l = 0.0d;
        this.m = 0.0d;
        this.t = new boolean[h.B.length];
    }

    public Environment(Parcel parcel) {
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6 = true;
        this.l = 0.0d;
        this.m = 0.0d;
        this.a = parcel.readDouble();
        this.b = parcel.readDouble();
        this.c = parcel.readDouble();
        this.d = parcel.readDouble();
        this.e = parcel.readDouble();
        this.f = parcel.readDouble();
        this.g = parcel.readDouble();
        this.t = new boolean[h.B.length];
        for (int i2 = 0; i2 < h.B.length; i2++) {
            boolean[] zArr = this.t;
            if (parcel.readInt() != 0) {
                z5 = true;
            } else {
                z5 = false;
            }
            zArr[i2] = z5;
        }
        this.w = parcel.readInt() != 0;
        this.i = parcel.readDouble();
        this.h = parcel.readDouble();
        this.j = parcel.readDouble();
        if (parcel.readInt() != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        this.x = z2;
        this.z = parcel.readDouble();
        this.r = parcel.readInt();
        this.s = parcel.readInt();
        this.k = parcel.readDouble();
        this.m = parcel.readDouble();
        this.l = parcel.readDouble();
        if (parcel.readInt() == 1) {
            z3 = true;
        } else {
            z3 = false;
        }
        this.u = z3;
        this.n = parcel.readFloat();
        if (parcel.readInt() == 1) {
            z4 = true;
        } else {
            z4 = false;
        }
        this.v = z4;
        this.p = parcel.readDouble();
        this.q = parcel.readDouble();
        this.y = parcel.readInt() != 1 ? false : z6;
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
        System.arraycopy(environment.t, 0, this.t, 0, h.B.length);
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

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7 = 1;
        parcel.writeDouble(this.a);
        parcel.writeDouble(this.b);
        parcel.writeDouble(this.c);
        parcel.writeDouble(this.d);
        parcel.writeDouble(this.e);
        parcel.writeDouble(this.f);
        parcel.writeDouble(this.g);
        for (int i8 = 0; i8 < h.B.length; i8++) {
            if (this.t[i8]) {
                i6 = 1;
            } else {
                i6 = 0;
            }
            parcel.writeInt(i6);
        }
        parcel.writeInt(this.w ? 1 : 0);
        parcel.writeDouble(this.i);
        parcel.writeDouble(this.h);
        parcel.writeDouble(this.j);
        if (this.x) {
            i3 = 1;
        } else {
            i3 = 0;
        }
        parcel.writeInt(i3);
        parcel.writeDouble(this.z);
        parcel.writeInt(this.r);
        parcel.writeInt(this.s);
        parcel.writeDouble(this.k);
        parcel.writeDouble(this.m);
        parcel.writeDouble(this.l);
        if (this.u) {
            i4 = 1;
        } else {
            i4 = 0;
        }
        parcel.writeInt(i4);
        parcel.writeFloat(this.n);
        if (this.v) {
            i5 = 1;
        } else {
            i5 = 0;
        }
        parcel.writeInt(i5);
        parcel.writeDouble(this.p);
        parcel.writeDouble(this.q);
        if (!this.y) {
            i7 = 0;
        }
        parcel.writeInt(i7);
        parcel.writeFloat(this.o);
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
        objectOutputStream.writeInt(h.B.length);
        for (int i2 = 0; i2 < h.B.length; i2++) {
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

    public final void a(ObjectInputStream objectInputStream) {
        double d2;
        Environment environment;
        int readInt = objectInputStream.readInt();
        if (readInt > 3054 || readInt <= 0) {
            throw new RuntimeException("Incompatible environment format");
        }
        this.a = objectInputStream.readDouble();
        if (readInt == 1) {
            this.a *= 0.15d;
        }
        if (readInt > 1) {
            this.b = objectInputStream.readDouble();
        } else {
            this.b = 0.15d;
        }
        this.c = objectInputStream.readDouble();
        this.d = objectInputStream.readDouble();
        this.e = objectInputStream.readDouble();
        this.f = objectInputStream.readDouble();
        if (readInt <= 23) {
            objectInputStream.readDouble();
        }
        this.g = objectInputStream.readDouble();
        int readInt2 = objectInputStream.readInt();
        for (int i2 = 0; i2 < h.B.length; i2++) {
            this.t[i2] = false;
        }
        for (int i3 = 0; i3 < readInt2; i3++) {
            this.t[i3] = objectInputStream.readBoolean();
        }
        this.w = objectInputStream.readBoolean();
        this.i = objectInputStream.readDouble();
        this.h = objectInputStream.readDouble();
        this.j = objectInputStream.readDouble();
        this.x = objectInputStream.readBoolean();
        if (readInt > 20) {
            d2 = objectInputStream.readDouble();
            environment = this;
        } else if (objectInputStream.readBoolean()) {
            d2 = 1.0d;
            environment = this;
        } else {
            d2 = 0.0d;
            environment = this;
        }
        environment.z = d2;
        if (readInt < 3) {
            this.r = 800;
            this.s = 3500;
            this.k = 1.0d;
        } else {
            this.r = objectInputStream.readInt();
            this.s = objectInputStream.readInt();
            this.k = objectInputStream.readDouble();
        }
        if (readInt < 9) {
            this.m = 0.0d;
            this.l = 0.0d;
            this.u = false;
        } else {
            this.m = objectInputStream.readDouble();
            this.l = objectInputStream.readDouble();
            this.u = objectInputStream.readBoolean();
        }
        if (readInt < 10) {
            this.n = 0.3f;
        } else {
            this.n = objectInputStream.readFloat();
        }
        if (readInt >= 14) {
            this.v = objectInputStream.readBoolean();
            this.p = objectInputStream.readDouble();
            this.q = objectInputStream.readDouble();
        } else {
            this.v = true;
            this.p = 0.0d;
            this.q = 0.009999999776482582d;
        }
        if (readInt >= 22) {
            this.y = objectInputStream.readBoolean();
            this.o = objectInputStream.readFloat();
            return;
        }
        this.y = false;
        this.o = 0.0f;
    }
}
