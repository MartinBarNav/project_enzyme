// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.internal;

import android.os.Parcel;
import android.os.Parcelable$Creator;
import android.os.Parcelable;

public class ha implements Parcelable
{
    @Deprecated
    public static final Parcelable$Creator<ha> CREATOR;
    public String a;
    public String b;
    private String c;
    
    static {
        CREATOR = (Parcelable$Creator)new Parcelable$Creator<ha>() {};
    }
    
    @Deprecated
    public ha() {
    }
    
    @Deprecated
    ha(final Parcel parcel) {
        this.a = parcel.readString();
        this.c = parcel.readString();
        this.b = parcel.readString();
    }
    
    public ha(final String a, final String c, final String b) {
        this.a = a;
        this.c = c;
        this.b = b;
    }
    
    @Deprecated
    public int describeContents() {
        return 0;
    }
    
    @Deprecated
    public void writeToParcel(final Parcel parcel, final int n) {
        parcel.writeString(this.a);
        parcel.writeString(this.c);
        parcel.writeString(this.b);
    }
}
