// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.internal;

import android.os.Parcelable$Creator;
import android.os.Parcel;
import android.os.IBinder;
import android.os.Binder;
import java.util.List;
import java.util.Map;
import android.os.IInterface;

public interface a extends IInterface
{
    void a();
    
    void a(final Map p0, final long p1, final String p2, final List<ha> p3);
    
    String b();
    
    public abstract static class a extends Binder implements a
    {
        public static a a(final IBinder binder) {
            a a;
            if (binder == null) {
                a = null;
            }
            else {
                final IInterface queryLocalInterface = binder.queryLocalInterface("com.google.android.gms.analytics.internal.IAnalyticsService");
                if (queryLocalInterface != null && queryLocalInterface instanceof a) {
                    a = (a)queryLocalInterface;
                }
                else {
                    a = new a(binder);
                }
            }
            return a;
        }
        
        public boolean onTransact(final int n, final Parcel parcel, final Parcel parcel2, final int n2) {
            boolean onTransact = false;
            switch (n) {
                default: {
                    onTransact = super.onTransact(n, parcel, parcel2, n2);
                    break;
                }
                case 1598968902: {
                    parcel2.writeString("com.google.android.gms.analytics.internal.IAnalyticsService");
                    onTransact = true;
                    break;
                }
                case 1: {
                    parcel.enforceInterface("com.google.android.gms.analytics.internal.IAnalyticsService");
                    this.a(parcel.readHashMap(this.getClass().getClassLoader()), parcel.readLong(), parcel.readString(), parcel.createTypedArrayList((Parcelable$Creator)ha.CREATOR));
                    parcel2.writeNoException();
                    onTransact = true;
                    break;
                }
                case 2: {
                    parcel.enforceInterface("com.google.android.gms.analytics.internal.IAnalyticsService");
                    this.a();
                    parcel2.writeNoException();
                    onTransact = true;
                    break;
                }
                case 3: {
                    parcel.enforceInterface("com.google.android.gms.analytics.internal.IAnalyticsService");
                    final String b = this.b();
                    parcel2.writeNoException();
                    parcel2.writeString(b);
                    onTransact = true;
                    break;
                }
            }
            return onTransact;
        }
        
        private static final class a implements com.google.android.gms.internal.a
        {
            private IBinder a;
            
            a(final IBinder a) {
                this.a = a;
            }
            
            @Override
            public final void a() {
                final Parcel obtain = Parcel.obtain();
                final Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.analytics.internal.IAnalyticsService");
                    this.a.transact(2, obtain, obtain2, 0);
                    obtain2.readException();
                }
                finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
            
            @Override
            public final void a(final Map map, final long n, final String s, final List<ha> list) {
                final Parcel obtain = Parcel.obtain();
                final Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.analytics.internal.IAnalyticsService");
                    obtain.writeMap(map);
                    obtain.writeLong(n);
                    obtain.writeString(s);
                    obtain.writeTypedList((List)list);
                    this.a.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                }
                finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
            
            public final IBinder asBinder() {
                return this.a;
            }
            
            @Override
            public final String b() {
                final Parcel obtain = Parcel.obtain();
                final Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.analytics.internal.IAnalyticsService");
                    this.a.transact(3, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readString();
                }
                finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }
    }
}
