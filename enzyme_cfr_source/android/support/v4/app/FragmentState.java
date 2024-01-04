/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 *  android.os.Parcel
 *  android.os.Parcelable
 *  android.os.Parcelable$Creator
 */
package android.support.v4.app;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.app.d;

final class FragmentState
implements Parcelable {
    public static final Parcelable.Creator<FragmentState> CREATOR = new Parcelable.Creator<FragmentState>(){

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

    /*
     * Enabled aggressive block sorting
     */
    public FragmentState(Parcel parcel) {
        boolean bl = true;
        this.a = parcel.readString();
        this.b = parcel.readInt();
        boolean bl2 = parcel.readInt() != 0;
        this.c = bl2;
        this.d = parcel.readInt();
        this.e = parcel.readInt();
        this.f = parcel.readString();
        bl2 = parcel.readInt() != 0;
        this.g = bl2;
        bl2 = parcel.readInt() != 0 ? bl : false;
        this.h = bl2;
        this.i = parcel.readBundle();
        this.j = parcel.readBundle();
    }

    public FragmentState(d d2) {
        this.a = d2.getClass().getName();
        this.b = d2.g;
        this.c = d2.p;
        this.d = d2.x;
        this.e = d2.y;
        this.f = d2.z;
        this.g = d2.C;
        this.h = d2.B;
        this.i = d2.i;
    }

    public final int describeContents() {
        return 0;
    }

    /*
     * Enabled aggressive block sorting
     */
    public final void writeToParcel(Parcel parcel, int n2) {
        int n3 = 1;
        parcel.writeString(this.a);
        parcel.writeInt(this.b);
        n2 = this.c ? 1 : 0;
        parcel.writeInt(n2);
        parcel.writeInt(this.d);
        parcel.writeInt(this.e);
        parcel.writeString(this.f);
        n2 = this.g ? 1 : 0;
        parcel.writeInt(n2);
        n2 = this.h ? n3 : 0;
        parcel.writeInt(n2);
        parcel.writeBundle(this.i);
        parcel.writeBundle(this.j);
    }
}

