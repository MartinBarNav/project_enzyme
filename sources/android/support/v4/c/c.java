package android.support.v4.c;

import android.os.Parcel;
import android.os.Parcelable;

final class c<T> implements Parcelable.ClassLoaderCreator<T> {
    private final b<T> a;

    public c(b<T> bVar) {
        this.a = bVar;
    }

    public final T createFromParcel(Parcel parcel) {
        return this.a.a(parcel, (ClassLoader) null);
    }

    public final T createFromParcel(Parcel parcel, ClassLoader classLoader) {
        return this.a.a(parcel, classLoader);
    }

    public final T[] newArray(int i) {
        return this.a.a(i);
    }
}
