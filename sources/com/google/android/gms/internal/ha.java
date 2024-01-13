package com.google.android.gms.internal;

import android.os.Parcel;
import android.os.Parcelable;

public class ha implements Parcelable {
    @Deprecated
    public static final Parcelable.Creator<ha> CREATOR = new Parcelable.Creator<ha>() {
        public final /* synthetic */ Object[] newArray(int i) {
            return new ha[i];
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new ha(parcel);
        }
    };
    public String a;
    public String b;
    private String c;

    @Deprecated
    public ha() {
    }

    public ha(String str, String str2, String str3) {
        this.a = str;
        this.c = str2;
        this.b = str3;
    }

    @Deprecated
    public int describeContents() {
        return 0;
    }

    @Deprecated
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeString(this.c);
        parcel.writeString(this.b);
    }

    @Deprecated
    ha(Parcel parcel) {
        this.a = parcel.readString();
        this.c = parcel.readString();
        this.b = parcel.readString();
    }
}
