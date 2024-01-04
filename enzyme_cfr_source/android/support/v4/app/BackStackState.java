/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
 *  android.os.Parcelable
 *  android.os.Parcelable$Creator
 *  android.text.TextUtils
 *  android.util.Log
 */
package android.support.v4.app;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.app.c;
import android.support.v4.app.d;
import android.support.v4.app.h;
import android.text.TextUtils;
import android.util.Log;
import java.util.ArrayList;

final class BackStackState
implements Parcelable {
    public static final Parcelable.Creator<BackStackState> CREATOR = new Parcelable.Creator<BackStackState>(){

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

    public BackStackState(Parcel parcel) {
        this.a = parcel.createIntArray();
        this.b = parcel.readInt();
        this.c = parcel.readInt();
        this.d = parcel.readString();
        this.e = parcel.readInt();
        this.f = parcel.readInt();
        this.g = (CharSequence)TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.h = parcel.readInt();
        this.i = (CharSequence)TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.j = parcel.createStringArrayList();
        this.k = parcel.createStringArrayList();
    }

    /*
     * Enabled aggressive block sorting
     */
    public BackStackState(c c2) {
        int n2;
        c.a a2 = c2.b;
        int n3 = 0;
        while (a2 != null) {
            n2 = n3;
            if (a2.i != null) {
                n2 = n3 + a2.i.size();
            }
            a2 = a2.a;
            n3 = n2;
        }
        this.a = new int[n3 + c2.d * 7];
        if (!c2.k) {
            throw new IllegalStateException("Not on back stack");
        }
        a2 = c2.b;
        n3 = 0;
        while (true) {
            if (a2 == null) {
                this.b = c2.i;
                this.c = c2.j;
                this.d = c2.m;
                this.e = c2.o;
                this.f = c2.p;
                this.g = c2.q;
                this.h = c2.r;
                this.i = c2.s;
                this.j = c2.t;
                this.k = c2.u;
                return;
            }
            int[] arrn = this.a;
            n2 = n3 + 1;
            arrn[n3] = a2.c;
            arrn = this.a;
            int n4 = n2 + 1;
            n3 = a2.d != null ? a2.d.g : -1;
            arrn[n2] = n3;
            arrn = this.a;
            n3 = n4 + 1;
            arrn[n4] = a2.e;
            arrn = this.a;
            n2 = n3 + 1;
            arrn[n3] = a2.f;
            arrn = this.a;
            n3 = n2 + 1;
            arrn[n2] = a2.g;
            arrn = this.a;
            n2 = n3 + 1;
            arrn[n3] = a2.h;
            if (a2.i != null) {
                n4 = a2.i.size();
                arrn = this.a;
                n3 = n2 + 1;
                arrn[n2] = n4;
                for (n2 = 0; n2 < n4; ++n2, ++n3) {
                    this.a[n3] = a2.i.get((int)n2).g;
                }
            } else {
                arrn = this.a;
                n3 = n2 + 1;
                arrn[n2] = 0;
            }
            a2 = a2.a;
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    public final c a(h h2) {
        c c2 = new c(h2);
        int n2 = 0;
        int n3 = 0;
        while (true) {
            if (n3 >= this.a.length) {
                c2.i = this.b;
                c2.j = this.c;
                c2.m = this.d;
                c2.o = this.e;
                c2.k = true;
                c2.p = this.f;
                c2.q = this.g;
                c2.r = this.h;
                c2.s = this.i;
                c2.t = this.j;
                c2.u = this.k;
                c2.a(1);
                return c2;
            }
            c.a a2 = new c.a();
            int[] arrn = this.a;
            int n4 = n3 + 1;
            a2.c = arrn[n3];
            if (android.support.v4.app.h.a) {
                Log.v((String)"FragmentManager", (String)("Instantiate " + c2 + " op #" + n2 + " base fragment #" + this.a[n4]));
            }
            int[] arrn2 = this.a;
            n3 = n4 + 1;
            a2.d = (n4 = arrn2[n4]) >= 0 ? h2.f.get(n4) : null;
            int[] arrn3 = this.a;
            n4 = n3 + 1;
            a2.e = arrn3[n3];
            int[] arrn4 = this.a;
            n3 = n4 + 1;
            a2.f = arrn4[n4];
            int[] arrn5 = this.a;
            n4 = n3 + 1;
            a2.g = arrn5[n3];
            int[] arrn6 = this.a;
            n3 = n4 + 1;
            a2.h = arrn6[n4];
            int[] arrn7 = this.a;
            n4 = n3 + 1;
            int n5 = arrn7[n3];
            n3 = n4;
            if (n5 > 0) {
                a2.i = new ArrayList(n5);
                int n6 = 0;
                while (true) {
                    n3 = ++n4;
                    if (n6 >= n5) break;
                    if (android.support.v4.app.h.a) {
                        Log.v((String)"FragmentManager", (String)("Instantiate " + c2 + " set remove fragment #" + this.a[n4]));
                    }
                    d d2 = h2.f.get(this.a[n4]);
                    a2.i.add(d2);
                    ++n6;
                }
            }
            if (c2.b == null) {
                c2.c = a2;
                c2.b = a2;
            } else {
                a2.b = c2.c;
                c2.c.a = a2;
                c2.c = a2;
            }
            a2.e = c2.e;
            a2.f = c2.f;
            a2.g = c2.g;
            a2.h = c2.h;
            ++c2.d;
            ++n2;
        }
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int n2) {
        parcel.writeIntArray(this.a);
        parcel.writeInt(this.b);
        parcel.writeInt(this.c);
        parcel.writeString(this.d);
        parcel.writeInt(this.e);
        parcel.writeInt(this.f);
        TextUtils.writeToParcel((CharSequence)this.g, (Parcel)parcel, (int)0);
        parcel.writeInt(this.h);
        TextUtils.writeToParcel((CharSequence)this.i, (Parcel)parcel, (int)0);
        parcel.writeStringList(this.j);
        parcel.writeStringList(this.k);
    }
}

