// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.internal;

import android.os.Parcel;
import android.os.IBinder;
import android.os.Binder;
import android.os.IInterface;

public interface h extends IInterface
{
    String a();
    
    String a(final String p0);
    
    void a(final String p0, final boolean p1);
    
    boolean a(final boolean p0);
    
    public abstract static class a extends Binder implements h
    {
        public static h a(final IBinder binder) {
            h h;
            if (binder == null) {
                h = null;
            }
            else {
                final IInterface queryLocalInterface = binder.queryLocalInterface("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                if (queryLocalInterface != null && queryLocalInterface instanceof h) {
                    h = (h)queryLocalInterface;
                }
                else {
                    h = new h.a.a(binder);
                }
            }
            return h;
        }
        
        public boolean onTransact(int n, final Parcel parcel, final Parcel parcel2, final int n2) {
            boolean b = false;
            final int n3 = 0;
            final boolean b2 = true;
            boolean onTransact = false;
            switch (n) {
                default: {
                    onTransact = super.onTransact(n, parcel, parcel2, n2);
                    break;
                }
                case 1598968902: {
                    parcel2.writeString("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                    onTransact = b2;
                    break;
                }
                case 1: {
                    parcel.enforceInterface("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                    final String a = this.a();
                    parcel2.writeNoException();
                    parcel2.writeString(a);
                    onTransact = b2;
                    break;
                }
                case 2: {
                    parcel.enforceInterface("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                    final boolean a2 = this.a(parcel.readInt() != 0);
                    parcel2.writeNoException();
                    n = n3;
                    if (a2) {
                        n = 1;
                    }
                    parcel2.writeInt(n);
                    onTransact = b2;
                    break;
                }
                case 3: {
                    parcel.enforceInterface("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                    final String a3 = this.a(parcel.readString());
                    parcel2.writeNoException();
                    parcel2.writeString(a3);
                    onTransact = b2;
                    break;
                }
                case 4: {
                    parcel.enforceInterface("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                    final String string = parcel.readString();
                    if (parcel.readInt() != 0) {
                        b = true;
                    }
                    this.a(string, b);
                    parcel2.writeNoException();
                    onTransact = b2;
                    break;
                }
            }
            return onTransact;
        }
        
        private static final class a implements h
        {
            private IBinder a;
            
            a(final IBinder a) {
                this.a = a;
            }
            
            @Override
            public final String a() {
                final Parcel obtain = Parcel.obtain();
                final Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                    this.a.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readString();
                }
                finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
            
            @Override
            public final String a(String string) {
                final Parcel obtain = Parcel.obtain();
                final Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                    obtain.writeString(string);
                    this.a.transact(3, obtain, obtain2, 0);
                    obtain2.readException();
                    string = obtain2.readString();
                    return string;
                }
                finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
            
            @Override
            public final void a(final String s, final boolean b) {
                int n = 0;
                final Parcel obtain = Parcel.obtain();
                final Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                    obtain.writeString(s);
                    if (b) {
                        n = 1;
                    }
                    obtain.writeInt(n);
                    this.a.transact(4, obtain, obtain2, 0);
                    obtain2.readException();
                }
                finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
            
            @Override
            public final boolean a(final boolean b) {
                final boolean b2 = true;
                final Parcel obtain = Parcel.obtain();
                final Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                    int n;
                    if (b) {
                        n = 1;
                    }
                    else {
                        n = 0;
                    }
                    obtain.writeInt(n);
                    this.a.transact(2, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt() != 0 && b2;
                }
                finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
            
            public final IBinder asBinder() {
                return this.a;
            }
        }
    }
}
