// 
// Decompiled by Procyon v0.5.36
// 

package android.support.v4.c;

import android.os.Parcel;
import android.os.Parcelable$Creator;

public final class a
{
    public static final class a<T> implements Parcelable$Creator<T>
    {
        final b<T> a;
        
        public a(final b<T> a) {
            this.a = a;
        }
        
        public final T createFromParcel(final Parcel parcel) {
            return this.a.a(parcel, null);
        }
        
        public final T[] newArray(final int n) {
            return this.a.a(n);
        }
    }
}
