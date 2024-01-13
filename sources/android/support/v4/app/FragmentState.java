package android.support.v4.app;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

final class FragmentState implements Parcelable {
    public static final Parcelable.Creator<FragmentState> CREATOR = new Parcelable.Creator<FragmentState>() {
        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new FragmentState[i];
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new FragmentState(parcel);
        }
    };
    final String a;
    final int b;
    final boolean c;
    final int d;
    final int e;
    final String f;
    final boolean g;
    final boolean h;
    final Bundle i;
    Bundle j;
    d k;

    public FragmentState(d dVar) {
        this.a = dVar.getClass().getName();
        this.b = dVar.g;
        this.c = dVar.p;
        this.d = dVar.x;
        this.e = dVar.y;
        this.f = dVar.z;
        this.g = dVar.C;
        this.h = dVar.B;
        this.i = dVar.i;
    }

    public FragmentState(Parcel parcel) {
        boolean z;
        boolean z2 = true;
        this.a = parcel.readString();
        this.b = parcel.readInt();
        this.c = parcel.readInt() != 0;
        this.d = parcel.readInt();
        this.e = parcel.readInt();
        this.f = parcel.readString();
        if (parcel.readInt() != 0) {
            z = true;
        } else {
            z = false;
        }
        this.g = z;
        this.h = parcel.readInt() == 0 ? false : z2;
        this.i = parcel.readBundle();
        this.j = parcel.readBundle();
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        int i3;
        int i4 = 1;
        parcel.writeString(this.a);
        parcel.writeInt(this.b);
        parcel.writeInt(this.c ? 1 : 0);
        parcel.writeInt(this.d);
        parcel.writeInt(this.e);
        parcel.writeString(this.f);
        if (this.g) {
            i3 = 1;
        } else {
            i3 = 0;
        }
        parcel.writeInt(i3);
        if (!this.h) {
            i4 = 0;
        }
        parcel.writeInt(i4);
        parcel.writeBundle(this.i);
        parcel.writeBundle(this.j);
    }
}
