// 
// Decompiled by Procyon v0.5.36
// 

package android.support.v4.c;

import android.os.Parcel;
import android.os.Parcelable$ClassLoaderCreator;

final class c<T> implements Parcelable$ClassLoaderCreator<T>
{
    private final b<T> a;
    
    public c(final b<T> a) {
        this.a = a;
    }
    
    public final T createFromParcel(final Parcel parcel) {
        return this.a.a(parcel, null);
    }
    
    public final T createFromParcel(final Parcel parcel, final ClassLoader classLoader) {
        return this.a.a(parcel, classLoader);
    }
    
    public final T[] newArray(final int n) {
        return this.a.a(n);
    }
}
