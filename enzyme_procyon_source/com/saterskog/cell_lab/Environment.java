// 
// Decompiled by Procyon v0.5.36
// 

package com.saterskog.cell_lab;

import java.io.ObjectOutputStream;
import java.io.ObjectInputStream;
import android.os.Parcel;
import android.os.Parcelable$Creator;
import android.os.Parcelable;

public class Environment implements Parcelable
{
    static final Parcelable$Creator<Environment> A;
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
    
    static {
        A = (Parcelable$Creator)new Parcelable$Creator<Environment>() {};
    }
    
    public Environment() {
        this.l = 0.0;
        this.m = 0.0;
        this.t = new boolean[com.saterskog.cell_lab.h.B.length];
    }
    
    public Environment(final Parcel parcel) {
        final boolean b = true;
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
        for (int i = 0; i < com.saterskog.cell_lab.h.B.length; ++i) {
            this.t[i] = (parcel.readInt() != 0);
        }
        this.w = (parcel.readInt() != 0);
        this.i = parcel.readDouble();
        this.h = parcel.readDouble();
        this.j = parcel.readDouble();
        this.x = (parcel.readInt() != 0);
        this.z = parcel.readDouble();
        this.r = parcel.readInt();
        this.s = parcel.readInt();
        this.k = parcel.readDouble();
        this.m = parcel.readDouble();
        this.l = parcel.readDouble();
        this.u = (parcel.readInt() == 1);
        this.n = parcel.readFloat();
        this.v = (parcel.readInt() == 1);
        this.p = parcel.readDouble();
        this.q = parcel.readDouble();
        this.y = (parcel.readInt() == 1 && b);
        this.o = parcel.readFloat();
    }
    
    public final void a(final Environment environment) {
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
    
    public final void a(final ObjectInputStream objectInputStream) {
        final int int1 = objectInputStream.readInt();
        if (int1 > 3054 || int1 <= 0) {
            throw new RuntimeException("Incompatible environment format");
        }
        this.a = objectInputStream.readDouble();
        if (int1 == 1) {
            this.a *= 0.15;
        }
        if (int1 > 1) {
            this.b = objectInputStream.readDouble();
        }
        else {
            this.b = 0.15;
        }
        this.c = objectInputStream.readDouble();
        this.d = objectInputStream.readDouble();
        this.e = objectInputStream.readDouble();
        this.f = objectInputStream.readDouble();
        if (int1 <= 23) {
            objectInputStream.readDouble();
        }
        this.g = objectInputStream.readDouble();
        final int int2 = objectInputStream.readInt();
        for (int i = 0; i < com.saterskog.cell_lab.h.B.length; ++i) {
            this.t[i] = false;
        }
        for (int j = 0; j < int2; ++j) {
            this.t[j] = objectInputStream.readBoolean();
        }
        this.w = objectInputStream.readBoolean();
        this.i = objectInputStream.readDouble();
        this.h = objectInputStream.readDouble();
        this.j = objectInputStream.readDouble();
        this.x = objectInputStream.readBoolean();
        double double1;
        if (int1 > 20) {
            double1 = objectInputStream.readDouble();
        }
        else if (objectInputStream.readBoolean()) {
            double1 = 1.0;
        }
        else {
            double1 = 0.0;
        }
        this.z = double1;
        if (int1 < 3) {
            this.r = 800;
            this.s = 3500;
            this.k = 1.0;
        }
        else {
            this.r = objectInputStream.readInt();
            this.s = objectInputStream.readInt();
            this.k = objectInputStream.readDouble();
        }
        if (int1 < 9) {
            this.m = 0.0;
            this.l = 0.0;
            this.u = false;
        }
        else {
            this.m = objectInputStream.readDouble();
            this.l = objectInputStream.readDouble();
            this.u = objectInputStream.readBoolean();
        }
        if (int1 < 10) {
            this.n = 0.3f;
        }
        else {
            this.n = objectInputStream.readFloat();
        }
        if (int1 >= 14) {
            this.v = objectInputStream.readBoolean();
            this.p = objectInputStream.readDouble();
            this.q = objectInputStream.readDouble();
        }
        else {
            this.v = true;
            this.p = 0.0;
            this.q = 0.009999999776482582;
        }
        if (int1 >= 22) {
            this.y = objectInputStream.readBoolean();
            this.o = objectInputStream.readFloat();
        }
        else {
            this.y = false;
            this.o = 0.0f;
        }
    }
    
    public final void a(final ObjectOutputStream objectOutputStream) {
        objectOutputStream.writeInt(3054);
        objectOutputStream.writeDouble(this.a);
        objectOutputStream.writeDouble(this.b);
        objectOutputStream.writeDouble(this.c);
        objectOutputStream.writeDouble(this.d);
        objectOutputStream.writeDouble(this.e);
        objectOutputStream.writeDouble(this.f);
        objectOutputStream.writeDouble(this.g);
        objectOutputStream.writeInt(com.saterskog.cell_lab.h.B.length);
        for (int i = 0; i < com.saterskog.cell_lab.h.B.length; ++i) {
            objectOutputStream.writeBoolean(this.t[i]);
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
    
    public void writeToParcel(final Parcel parcel, int i) {
        final int n = 1;
        parcel.writeDouble(this.a);
        parcel.writeDouble(this.b);
        parcel.writeDouble(this.c);
        parcel.writeDouble(this.d);
        parcel.writeDouble(this.e);
        parcel.writeDouble(this.f);
        parcel.writeDouble(this.g);
        int n2;
        for (i = 0; i < com.saterskog.cell_lab.h.B.length; ++i) {
            if (this.t[i]) {
                n2 = 1;
            }
            else {
                n2 = 0;
            }
            parcel.writeInt(n2);
        }
        if (this.w) {
            i = 1;
        }
        else {
            i = 0;
        }
        parcel.writeInt(i);
        parcel.writeDouble(this.i);
        parcel.writeDouble(this.h);
        parcel.writeDouble(this.j);
        if (this.x) {
            i = 1;
        }
        else {
            i = 0;
        }
        parcel.writeInt(i);
        parcel.writeDouble(this.z);
        parcel.writeInt(this.r);
        parcel.writeInt(this.s);
        parcel.writeDouble(this.k);
        parcel.writeDouble(this.m);
        parcel.writeDouble(this.l);
        if (this.u) {
            i = 1;
        }
        else {
            i = 0;
        }
        parcel.writeInt(i);
        parcel.writeFloat(this.n);
        if (this.v) {
            i = 1;
        }
        else {
            i = 0;
        }
        parcel.writeInt(i);
        parcel.writeDouble(this.p);
        parcel.writeDouble(this.q);
        if (this.y) {
            i = n;
        }
        else {
            i = 0;
        }
        parcel.writeInt(i);
        parcel.writeFloat(this.o);
    }
}
