package com.saterskog.cell_lab;

import android.os.Parcel;
import android.os.Parcelable;
import java.io.ObjectInputStream;

public class Link implements Parcelable {
    static final Parcelable.Creator<Link> m = new Parcelable.Creator<Link>() {
        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new Link[i];
        }

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

    public Link(Parcel parcel) {
        this.a = parcel.readInt();
        this.c = parcel.readDouble();
        this.d = parcel.readDouble();
        this.b = parcel.readInt() != 0;
        this.e = parcel.readDouble();
        this.f = parcel.readDouble();
        this.k = parcel.readFloat();
        this.l = parcel.readFloat();
    }

    public Link() {
        this.a = -1;
        this.b = true;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeInt(this.a);
        parcel.writeDouble(this.c);
        parcel.writeDouble(this.d);
        parcel.writeInt(this.b ? 1 : 0);
        parcel.writeDouble(this.e);
        parcel.writeDouble(this.f);
        parcel.writeFloat(this.k);
        parcel.writeFloat(this.l);
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

    public final void a(ObjectInputStream objectInputStream, int i2) {
        this.a = objectInputStream.readInt();
        this.c = objectInputStream.readDouble();
        this.d = objectInputStream.readDouble();
        this.b = objectInputStream.readBoolean();
        this.e = objectInputStream.readDouble();
        this.f = objectInputStream.readDouble();
        if (i2 < 4) {
            this.k = 0.0f;
        } else if (i2 >= 7) {
            this.k = objectInputStream.readFloat();
        } else {
            this.k = (float) objectInputStream.readDouble();
        }
        if (i2 >= 16) {
            this.l = objectInputStream.readFloat();
        } else {
            this.l = 0.0f;
        }
    }
}
