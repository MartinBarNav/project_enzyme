/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
 *  android.os.Parcelable
 *  android.os.Parcelable$Creator
 */
package android.support.v4.app;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.app.BackStackState;
import android.support.v4.app.FragmentState;

final class FragmentManagerState
implements Parcelable {
    public static final Parcelable.Creator<FragmentManagerState> CREATOR = new Parcelable.Creator<FragmentManagerState>(){

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new FragmentManagerState(parcel);
        }
    };
    FragmentState[] a;
    int[] b;
    BackStackState[] c;

    public FragmentManagerState() {
    }

    public FragmentManagerState(Parcel parcel) {
        this.a = (FragmentState[])parcel.createTypedArray(FragmentState.CREATOR);
        this.b = parcel.createIntArray();
        this.c = (BackStackState[])parcel.createTypedArray(BackStackState.CREATOR);
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int n2) {
        parcel.writeTypedArray((Parcelable[])this.a, n2);
        parcel.writeIntArray(this.b);
        parcel.writeTypedArray((Parcelable[])this.c, n2);
    }
}

