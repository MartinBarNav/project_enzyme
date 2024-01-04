// 
// Decompiled by Procyon v0.5.36
// 

package android.support.v4.app;

import android.os.Parcel;
import android.os.Bundle;
import android.os.Parcelable$Creator;
import android.os.Parcelable;

final class FragmentState implements Parcelable
{
    public static final Parcelable$Creator<FragmentState> CREATOR;
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
    
    static {
        CREATOR = (Parcelable$Creator)new Parcelable$Creator<FragmentState>() {};
    }
    
    public FragmentState(final Parcel parcel) {
        final boolean b = true;
        this.a = parcel.readString();
        this.b = parcel.readInt();
        this.c = (parcel.readInt() != 0);
        this.d = parcel.readInt();
        this.e = parcel.readInt();
        this.f = parcel.readString();
        this.g = (parcel.readInt() != 0);
        this.h = (parcel.readInt() != 0 && b);
        this.i = parcel.readBundle();
        this.j = parcel.readBundle();
    }
    
    public FragmentState(final d d) {
        this.a = d.getClass().getName();
        this.b = d.g;
        this.c = d.p;
        this.d = d.x;
        this.e = d.y;
        this.f = d.z;
        this.g = d.C;
        this.h = d.B;
        this.i = d.i;
    }
    
    public final int describeContents() {
        return 0;
    }
    
    public final void writeToParcel(final Parcel parcel, int n) {
        final int n2 = 1;
        parcel.writeString(this.a);
        parcel.writeInt(this.b);
        if (this.c) {
            n = 1;
        }
        else {
            n = 0;
        }
        parcel.writeInt(n);
        parcel.writeInt(this.d);
        parcel.writeInt(this.e);
        parcel.writeString(this.f);
        if (this.g) {
            n = 1;
        }
        else {
            n = 0;
        }
        parcel.writeInt(n);
        if (this.h) {
            n = n2;
        }
        else {
            n = 0;
        }
        parcel.writeInt(n);
        parcel.writeBundle(this.i);
        parcel.writeBundle(this.j);
    }
}
