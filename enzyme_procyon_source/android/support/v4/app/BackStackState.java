// 
// Decompiled by Procyon v0.5.36
// 

package android.support.v4.app;

import java.util.List;
import android.util.Log;
import android.text.TextUtils;
import android.os.Parcel;
import java.util.ArrayList;
import android.os.Parcelable$Creator;
import android.os.Parcelable;

final class BackStackState implements Parcelable
{
    public static final Parcelable$Creator<BackStackState> CREATOR;
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
    
    static {
        CREATOR = (Parcelable$Creator)new Parcelable$Creator<BackStackState>() {};
    }
    
    public BackStackState(final Parcel parcel) {
        this.a = parcel.createIntArray();
        this.b = parcel.readInt();
        this.c = parcel.readInt();
        this.d = parcel.readString();
        this.e = parcel.readInt();
        this.f = parcel.readInt();
        this.g = (CharSequence)TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.h = parcel.readInt();
        this.i = (CharSequence)TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.j = (ArrayList<String>)parcel.createStringArrayList();
        this.k = (ArrayList<String>)parcel.createStringArrayList();
    }
    
    public BackStackState(final c c) {
        c.a a = c.b;
        int n = 0;
        while (a != null) {
            int n2 = n;
            if (a.i != null) {
                n2 = n + a.i.size();
            }
            a = a.a;
            n = n2;
        }
        this.a = new int[n + c.d * 7];
        if (!c.k) {
            throw new IllegalStateException("Not on back stack");
        }
        c.a a2 = c.b;
        int n3 = 0;
        while (a2 != null) {
            final int[] a3 = this.a;
            final int n4 = n3 + 1;
            a3[n3] = a2.c;
            final int[] a4 = this.a;
            final int n5 = n4 + 1;
            int g;
            if (a2.d != null) {
                g = a2.d.g;
            }
            else {
                g = -1;
            }
            a4[n4] = g;
            final int[] a5 = this.a;
            final int n6 = n5 + 1;
            a5[n5] = a2.e;
            final int[] a6 = this.a;
            final int n7 = n6 + 1;
            a6[n6] = a2.f;
            final int[] a7 = this.a;
            final int n8 = n7 + 1;
            a7[n7] = a2.g;
            final int[] a8 = this.a;
            final int n9 = n8 + 1;
            a8[n8] = a2.h;
            if (a2.i != null) {
                final int size = a2.i.size();
                final int[] a9 = this.a;
                n3 = n9 + 1;
                a9[n9] = size;
                for (int i = 0; i < size; ++i, ++n3) {
                    this.a[n3] = a2.i.get(i).g;
                }
            }
            else {
                final int[] a10 = this.a;
                n3 = n9 + 1;
                a10[n9] = 0;
            }
            a2 = a2.a;
        }
        this.b = c.i;
        this.c = c.j;
        this.d = c.m;
        this.e = c.o;
        this.f = c.p;
        this.g = c.q;
        this.h = c.r;
        this.i = c.s;
        this.j = c.t;
        this.k = c.u;
    }
    
    public final c a(final h h) {
        final c c = new c(h);
        int i = 0;
        int j = 0;
        while (j < this.a.length) {
            final c.a a = new c.a();
            final int[] a2 = this.a;
            final int n = j + 1;
            a.c = a2[j];
            if (h.a) {
                Log.v("FragmentManager", "Instantiate " + c + " op #" + i + " base fragment #" + this.a[n]);
            }
            final int[] a3 = this.a;
            final int n2 = n + 1;
            final int index = a3[n];
            if (index >= 0) {
                a.d = h.f.get(index);
            }
            else {
                a.d = null;
            }
            final int[] a4 = this.a;
            final int n3 = n2 + 1;
            a.e = a4[n2];
            final int[] a5 = this.a;
            final int n4 = n3 + 1;
            a.f = a5[n3];
            final int[] a6 = this.a;
            final int n5 = n4 + 1;
            a.g = a6[n4];
            final int[] a7 = this.a;
            final int n6 = n5 + 1;
            a.h = a7[n5];
            final int[] a8 = this.a;
            int n7 = n6 + 1;
            final int initialCapacity = a8[n6];
            j = n7;
            if (initialCapacity > 0) {
                a.i = new ArrayList<d>(initialCapacity);
                int n8 = 0;
                while (true) {
                    j = n7;
                    if (n8 >= initialCapacity) {
                        break;
                    }
                    if (h.a) {
                        Log.v("FragmentManager", "Instantiate " + c + " set remove fragment #" + this.a[n7]);
                    }
                    a.i.add(h.f.get(this.a[n7]));
                    ++n8;
                    ++n7;
                }
            }
            if (c.b == null) {
                c.c = a;
                c.b = a;
            }
            else {
                a.b = c.c;
                c.c.a = a;
                c.c = a;
            }
            a.e = c.e;
            a.f = c.f;
            a.g = c.g;
            a.h = c.h;
            ++c.d;
            ++i;
        }
        c.i = this.b;
        c.j = this.c;
        c.m = this.d;
        c.o = this.e;
        c.k = true;
        c.p = this.f;
        c.q = this.g;
        c.r = this.h;
        c.s = this.i;
        c.t = this.j;
        c.u = this.k;
        c.a(1);
        return c;
    }
    
    public final int describeContents() {
        return 0;
    }
    
    public final void writeToParcel(final Parcel parcel, final int n) {
        parcel.writeIntArray(this.a);
        parcel.writeInt(this.b);
        parcel.writeInt(this.c);
        parcel.writeString(this.d);
        parcel.writeInt(this.e);
        parcel.writeInt(this.f);
        TextUtils.writeToParcel(this.g, parcel, 0);
        parcel.writeInt(this.h);
        TextUtils.writeToParcel(this.i, parcel, 0);
        parcel.writeStringList((List)this.j);
        parcel.writeStringList((List)this.k);
    }
}
