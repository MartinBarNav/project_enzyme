/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
 *  android.os.Parcelable
 *  android.os.Parcelable$Creator
 */
package com.google.android.gms.internal;

import android.os.Parcel;
import android.os.Parcelable;

public class ha
implements Parcelable {
    @Deprecated
    public static final Parcelable.Creator<ha> CREATOR = new Parcelable.Creator<ha>(){

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new ha(parcel);
        }

        public final /* synthetic */ Object[] newArray(int n2) {
            return new ha[n2];
        }
    };
    public String a;
    public String b;
    private String c;

    @Deprecated
    public ha() {
    }

    @Deprecated
    ha(Parcel parcel) {
        this.a = parcel.readString();
        this.c = parcel.readString();
        this.b = parcel.readString();
    }

    public ha(String string, String string2, String string3) {
        this.a = string;
        this.c = string2;
        this.b = string3;
    }

    @Deprecated
    public int describeContents() {
        return 0;
    }

    @Deprecated
    public void writeToParcel(Parcel parcel, int n2) {
        parcel.writeString(this.a);
        parcel.writeString(this.c);
        parcel.writeString(this.b);
    }
}

