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
import java.io.ObjectInputStream;

public class Link
implements Parcelable {
    static final Parcelable.Creator<Link> m = new Parcelable.Creator<Link>(){

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new Link(parcel);
        }
    };
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

    public Link() {
        this.a = -1;
        this.b = true;
    }

    /*
     * Enabled aggressive block sorting
     */
    public Link(Parcel parcel) {
        this.a = parcel.readInt();
        this.c = parcel.readDouble();
        this.d = parcel.readDouble();
        boolean bl = parcel.readInt() != 0;
        this.b = bl;
        this.e = parcel.readDouble();
        this.f = parcel.readDouble();
        this.k = parcel.readFloat();
        this.l = parcel.readFloat();
    }

    public final void a(Link link) {
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

    /*
     * Enabled aggressive block sorting
     */
    public final void a(ObjectInputStream objectInputStream, int n2) {
        this.a = objectInputStream.readInt();
        this.c = objectInputStream.readDouble();
        this.d = objectInputStream.readDouble();
        this.b = objectInputStream.readBoolean();
        this.e = objectInputStream.readDouble();
        this.f = objectInputStream.readDouble();
        this.k = n2 >= 4 ? (n2 >= 7 ? objectInputStream.readFloat() : (float)objectInputStream.readDouble()) : 0.0f;
        if (n2 >= 16) {
            this.l = objectInputStream.readFloat();
            return;
        }
        this.l = 0.0f;
    }

    public int describeContents() {
        return 0;
    }

    /*
     * Enabled aggressive block sorting
     */
    public void writeToParcel(Parcel parcel, int n2) {
        parcel.writeInt(this.a);
        parcel.writeDouble(this.c);
        parcel.writeDouble(this.d);
        n2 = this.b ? 1 : 0;
        parcel.writeInt(n2);
        parcel.writeDouble(this.e);
        parcel.writeDouble(this.f);
        parcel.writeFloat(this.k);
        parcel.writeFloat(this.l);
    }
}

