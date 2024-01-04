// 
// Decompiled by Procyon v0.5.36
// 

package android.support.v4.app;

import android.os.Parcel;
import android.os.Parcelable$Creator;
import android.os.Parcelable;

final class FragmentManagerState implements Parcelable
{
    public static final Parcelable$Creator<FragmentManagerState> CREATOR;
    FragmentState[] a;
    int[] b;
    BackStackState[] c;
    
    static {
        CREATOR = (Parcelable$Creator)new Parcelable$Creator<FragmentManagerState>() {};
    }
    
    public FragmentManagerState() {
    }
    
    public FragmentManagerState(final Parcel parcel) {
        this.a = (FragmentState[])parcel.createTypedArray((Parcelable$Creator)FragmentState.CREATOR);
        this.b = parcel.createIntArray();
        this.c = (BackStackState[])parcel.createTypedArray((Parcelable$Creator)BackStackState.CREATOR);
    }
    
    public final int describeContents() {
        return 0;
    }
    
    public final void writeToParcel(final Parcel parcel, final int n) {
        parcel.writeTypedArray((Parcelable[])this.a, n);
        parcel.writeIntArray(this.b);
        parcel.writeTypedArray((Parcelable[])this.c, n);
    }
}
