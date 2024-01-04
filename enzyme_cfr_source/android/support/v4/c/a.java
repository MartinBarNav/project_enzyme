/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
 *  android.os.Parcelable$Creator
 */
package android.support.v4.c;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.c.b;

public final class a {

    public static final class a<T>
    implements Parcelable.Creator<T> {
        final b<T> a;

        public a(b<T> b2) {
            this.a = b2;
        }

        public final T createFromParcel(Parcel parcel) {
            return this.a.a(parcel, null);
        }

        public final T[] newArray(int n2) {
            return this.a.a(n2);
        }
    }
}

