package android.support.v4.c;

import android.os.Parcel;
import android.os.Parcelable;

public final class a {

    /* renamed from: android.support.v4.c.a$a  reason: collision with other inner class name */
    static class C0002a<T> implements Parcelable.Creator<T> {
        final b<T> a;

        public C0002a(b<T> bVar) {
            this.a = bVar;
        }

        public final T createFromParcel(Parcel parcel) {
            return this.a.a(parcel, (ClassLoader) null);
        }

        public final T[] newArray(int i) {
            return this.a.a(i);
        }
    }
}
