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
import java.io.Serializable;

public class Food
implements Parcelable,
Serializable {
    static final Parcelable.Creator<Food> g = new Parcelable.Creator<Food>(){

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new Food(parcel);
        }
    };
    float a;
    float b;
    float c;
    float d;
    float e;
    float f;

    public Food() {
    }

    Food(Parcel parcel) {
        this.a = parcel.readFloat();
        this.b = parcel.readFloat();
        this.c = parcel.readFloat();
        this.d = parcel.readFloat();
        this.e = parcel.readFloat();
        this.f = parcel.readFloat();
    }

    public final void a(Food food) {
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

    public void writeToParcel(Parcel parcel, int n2) {
        parcel.writeFloat(this.a);
        parcel.writeFloat(this.b);
        parcel.writeFloat(this.c);
        parcel.writeFloat(this.d);
        parcel.writeFloat(this.e);
        parcel.writeFloat(this.f);
    }
}

