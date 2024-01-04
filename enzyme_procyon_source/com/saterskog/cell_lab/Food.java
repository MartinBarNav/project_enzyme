// 
// Decompiled by Procyon v0.5.36
// 

package com.saterskog.cell_lab;

import android.os.Parcel;
import android.os.Parcelable$Creator;
import java.io.Serializable;
import android.os.Parcelable;

public class Food implements Parcelable, Serializable
{
    static final Parcelable$Creator<Food> g;
    float a;
    float b;
    float c;
    float d;
    float e;
    float f;
    
    static {
        g = (Parcelable$Creator)new Parcelable$Creator<Food>() {};
    }
    
    public Food() {
    }
    
    Food(final Parcel parcel) {
        this.a = parcel.readFloat();
        this.b = parcel.readFloat();
        this.c = parcel.readFloat();
        this.d = parcel.readFloat();
        this.e = parcel.readFloat();
        this.f = parcel.readFloat();
    }
    
    public final void a(final Food food) {
        this.a = food.a;
        this.b = food.b;
        this.c = food.c;
        this.d = food.d;
        this.e = food.e;
        this.f = food.f;
    }
    
    public int describeContents() {
        return 0;
    }
    
    public void writeToParcel(final Parcel parcel, final int n) {
        parcel.writeFloat(this.a);
        parcel.writeFloat(this.b);
        parcel.writeFloat(this.c);
        parcel.writeFloat(this.d);
        parcel.writeFloat(this.e);
        parcel.writeFloat(this.f);
    }
}
