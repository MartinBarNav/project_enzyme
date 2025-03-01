package android.support.v4.app;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.app.c;
import android.text.TextUtils;
import android.util.Log;
import java.util.ArrayList;

final class BackStackState implements Parcelable {
    public static final Parcelable.Creator<BackStackState> CREATOR = new Parcelable.Creator<BackStackState>() {
        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new BackStackState[i];
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new BackStackState(parcel);
        }
    };
    final int[] a;
    final int b;
    final int c;
    final String d;
    final int e;
    final int f;
    final CharSequence g;
    final int h;
    final CharSequence i;
    final ArrayList<String> j;
    final ArrayList<String> k;

    public BackStackState(c cVar) {
        int i2 = 0;
        for (c.a aVar = cVar.b; aVar != null; aVar = aVar.a) {
            if (aVar.i != null) {
                i2 += aVar.i.size();
            }
        }
        this.a = new int[(i2 + (cVar.d * 7))];
        if (!cVar.k) {
            throw new IllegalStateException("Not on back stack");
        }
        int i3 = 0;
        for (c.a aVar2 = cVar.b; aVar2 != null; aVar2 = aVar2.a) {
            int i4 = i3 + 1;
            this.a[i3] = aVar2.c;
            int i5 = i4 + 1;
            this.a[i4] = aVar2.d != null ? aVar2.d.g : -1;
            int i6 = i5 + 1;
            this.a[i5] = aVar2.e;
            int i7 = i6 + 1;
            this.a[i6] = aVar2.f;
            int i8 = i7 + 1;
            this.a[i7] = aVar2.g;
            int i9 = i8 + 1;
            this.a[i8] = aVar2.h;
            if (aVar2.i != null) {
                int size = aVar2.i.size();
                int i10 = i9 + 1;
                this.a[i9] = size;
                int i11 = 0;
                while (i11 < size) {
                    this.a[i10] = aVar2.i.get(i11).g;
                    i11++;
                    i10++;
                }
                i3 = i10;
            } else {
                i3 = i9 + 1;
                this.a[i9] = 0;
            }
        }
        this.b = cVar.i;
        this.c = cVar.j;
        this.d = cVar.m;
        this.e = cVar.o;
        this.f = cVar.p;
        this.g = cVar.q;
        this.h = cVar.r;
        this.i = cVar.s;
        this.j = cVar.t;
        this.k = cVar.u;
    }

    public BackStackState(Parcel parcel) {
        this.a = parcel.createIntArray();
        this.b = parcel.readInt();
        this.c = parcel.readInt();
        this.d = parcel.readString();
        this.e = parcel.readInt();
        this.f = parcel.readInt();
        this.g = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.h = parcel.readInt();
        this.i = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.j = parcel.createStringArrayList();
        this.k = parcel.createStringArrayList();
    }

    public final c a(h hVar) {
        int i2;
        c cVar = new c(hVar);
        int i3 = 0;
        for (int i4 = 0; i4 < this.a.length; i4 = i2) {
            c.a aVar = new c.a();
            int i5 = i4 + 1;
            aVar.c = this.a[i4];
            if (h.a) {
                Log.v("FragmentManager", "Instantiate " + cVar + " op #" + i3 + " base fragment #" + this.a[i5]);
            }
            int i6 = i5 + 1;
            int i7 = this.a[i5];
            if (i7 >= 0) {
                aVar.d = hVar.f.get(i7);
            } else {
                aVar.d = null;
            }
            int i8 = i6 + 1;
            aVar.e = this.a[i6];
            int i9 = i8 + 1;
            aVar.f = this.a[i8];
            int i10 = i9 + 1;
            aVar.g = this.a[i9];
            int i11 = i10 + 1;
            aVar.h = this.a[i10];
            i2 = i11 + 1;
            int i12 = this.a[i11];
            if (i12 > 0) {
                aVar.i = new ArrayList<>(i12);
                int i13 = 0;
                while (i13 < i12) {
                    if (h.a) {
                        Log.v("FragmentManager", "Instantiate " + cVar + " set remove fragment #" + this.a[i2]);
                    }
                    aVar.i.add(hVar.f.get(this.a[i2]));
                    i13++;
                    i2++;
                }
            }
            if (cVar.b == null) {
                cVar.c = aVar;
                cVar.b = aVar;
            } else {
                aVar.b = cVar.c;
                cVar.c.a = aVar;
                cVar.c = aVar;
            }
            aVar.e = cVar.e;
            aVar.f = cVar.f;
            aVar.g = cVar.g;
            aVar.h = cVar.h;
            cVar.d++;
            i3++;
        }
        cVar.i = this.b;
        cVar.j = this.c;
        cVar.m = this.d;
        cVar.o = this.e;
        cVar.k = true;
        cVar.p = this.f;
        cVar.q = this.g;
        cVar.r = this.h;
        cVar.s = this.i;
        cVar.t = this.j;
        cVar.u = this.k;
        cVar.a(1);
        return cVar;
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        parcel.writeIntArray(this.a);
        parcel.writeInt(this.b);
        parcel.writeInt(this.c);
        parcel.writeString(this.d);
        parcel.writeInt(this.e);
        parcel.writeInt(this.f);
        TextUtils.writeToParcel(this.g, parcel, 0);
        parcel.writeInt(this.h);
        TextUtils.writeToParcel(this.i, parcel, 0);
        parcel.writeStringList(this.j);
        parcel.writeStringList(this.k);
    }
}
