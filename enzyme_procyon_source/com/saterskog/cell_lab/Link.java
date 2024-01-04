// 
// Decompiled by Procyon v0.5.36
// 

package com.saterskog.cell_lab;

import java.io.ObjectInputStream;
import android.os.Parcel;
import android.os.Parcelable$Creator;
import android.os.Parcelable;

public class Link implements Parcelable
{
    static final Parcelable$Creator<Link> m;
    int a;
    boolean b;
    double c;
    double d;
    double e;
    double f;
    float g;
    float h;
    float i;
    float j;
    public float k;
    public float l;
    
    static {
        m = (Parcelable$Creator)new Parcelable$Creator<Link>() {};
    }
    
    public Link() {
        this.a = -1;
        this.b = true;
    }
    
    public Link(final Parcel parcel) {
        this.a = parcel.readInt();
        this.c = parcel.readDouble();
        this.d = parcel.readDouble();
        this.b = (parcel.readInt() != 0);
        this.e = parcel.readDouble();
        this.f = parcel.readDouble();
        this.k = parcel.readFloat();
        this.l = parcel.readFloat();
    }
    
    public final void a(final Link link) {
        this.a = link.a;
        this.c = link.c;
        this.d = link.d;
        this.b = link.b;
        this.e = link.e;
        this.f = link.f;
        this.g = link.g;
        this.h = link.h;
        this.i = link.i;
        this.j = link.j;
        this.k = link.k;
        this.l = link.l;
    }
    
    public final void a(final ObjectInputStream objectInputStream, final int n) {
        this.a = objectInputStream.readInt();
        this.c = objectInputStream.readDouble();
        this.d = objectInputStream.readDouble();
        this.b = objectInputStream.readBoolean();
        this.e = objectInputStream.readDouble();
        this.f = objectInputStream.readDouble();
        if (n >= 4) {
            if (n >= 7) {
                this.k = objectInputStream.readFloat();
            }
            else {
                this.k = (float)objectInputStream.readDouble();
            }
        }
        else {
            this.k = 0.0f;
        }
        if (n >= 16) {
            this.l = objectInputStream.readFloat();
        }
        else {
            this.l = 0.0f;
        }
    }
    
    public int describeContents() {
        return 0;
    }
    
    public void writeToParcel(final Parcel parcel, int n) {
        parcel.writeInt(this.a);
        parcel.writeDouble(this.c);
        parcel.writeDouble(this.d);
        if (this.b) {
            n = 1;
        }
        else {
            n = 0;
        }
        parcel.writeInt(n);
        parcel.writeDouble(this.e);
        parcel.writeDouble(this.f);
        parcel.writeFloat(this.k);
        parcel.writeFloat(this.l);
    }
}
