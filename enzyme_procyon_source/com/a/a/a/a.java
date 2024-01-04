// 
// Decompiled by Procyon v0.5.36
// 

package com.a.a.a;

import android.os.Parcel;
import android.os.IBinder;
import android.os.Binder;
import java.util.List;
import android.os.Bundle;
import android.os.IInterface;

public interface a extends IInterface
{
    int a(final int p0, final String p1, final String p2);
    
    Bundle a(final int p0, final String p1, final String p2, final Bundle p3);
    
    Bundle a(final int p0, final String p1, final String p2, final String p3);
    
    Bundle a(final int p0, final String p1, final String p2, final String p3, final Bundle p4);
    
    Bundle a(final int p0, final String p1, final String p2, final String p3, final String p4);
    
    Bundle a(final int p0, final String p1, final String p2, final String p3, final String p4, final Bundle p5);
    
    Bundle a(final int p0, final String p1, final List<String> p2, final String p3, final String p4, final String p5);
    
    int b(final int p0, final String p1, final String p2);
    
    int b(final int p0, final String p1, final String p2, final Bundle p3);
    
    int c(final int p0, final String p1, final String p2);
    
    public abstract static class a extends Binder implements a
    {
        public static a a(final IBinder binder) {
            a a;
            if (binder == null) {
                a = null;
            }
            else {
                final IInterface queryLocalInterface = binder.queryLocalInterface("com.android.vending.billing.IInAppBillingService");
                if (queryLocalInterface != null && queryLocalInterface instanceof a) {
                    a = (a)queryLocalInterface;
                }
                else {
                    a = new a(binder);
                }
            }
            return a;
        }
        
        public boolean onTransact(int n, final Parcel parcel, final Parcel parcel2, final int n2) {
            final Bundle bundle = null;
            Bundle bundle2 = null;
            boolean onTransact = false;
            switch (n) {
                default: {
                    onTransact = super.onTransact(n, parcel, parcel2, n2);
                    break;
                }
                case 1598968902: {
                    parcel2.writeString("com.android.vending.billing.IInAppBillingService");
                    onTransact = true;
                    break;
                }
                case 1: {
                    parcel.enforceInterface("com.android.vending.billing.IInAppBillingService");
                    n = this.a(parcel.readInt(), parcel.readString(), parcel.readString());
                    parcel2.writeNoException();
                    parcel2.writeInt(n);
                    onTransact = true;
                    break;
                }
                case 2: {
                    parcel.enforceInterface("com.android.vending.billing.IInAppBillingService");
                    n = parcel.readInt();
                    final String string = parcel.readString();
                    final String string2 = parcel.readString();
                    if (parcel.readInt() != 0) {
                        bundle2 = (Bundle)Bundle.CREATOR.createFromParcel(parcel);
                    }
                    final Bundle a = this.a(n, string, string2, bundle2);
                    parcel2.writeNoException();
                    if (a != null) {
                        parcel2.writeInt(1);
                        a.writeToParcel(parcel2, 1);
                    }
                    else {
                        parcel2.writeInt(0);
                    }
                    onTransact = true;
                    break;
                }
                case 3: {
                    parcel.enforceInterface("com.android.vending.billing.IInAppBillingService");
                    final Bundle a2 = this.a(parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
                    parcel2.writeNoException();
                    if (a2 != null) {
                        parcel2.writeInt(1);
                        a2.writeToParcel(parcel2, 1);
                    }
                    else {
                        parcel2.writeInt(0);
                    }
                    onTransact = true;
                    break;
                }
                case 4: {
                    parcel.enforceInterface("com.android.vending.billing.IInAppBillingService");
                    final Bundle a3 = this.a(parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readString());
                    parcel2.writeNoException();
                    if (a3 != null) {
                        parcel2.writeInt(1);
                        a3.writeToParcel(parcel2, 1);
                    }
                    else {
                        parcel2.writeInt(0);
                    }
                    onTransact = true;
                    break;
                }
                case 5: {
                    parcel.enforceInterface("com.android.vending.billing.IInAppBillingService");
                    n = this.b(parcel.readInt(), parcel.readString(), parcel.readString());
                    parcel2.writeNoException();
                    parcel2.writeInt(n);
                    onTransact = true;
                    break;
                }
                case 6: {
                    parcel.enforceInterface("com.android.vending.billing.IInAppBillingService");
                    n = this.c(parcel.readInt(), parcel.readString(), parcel.readString());
                    parcel2.writeNoException();
                    parcel2.writeInt(n);
                    onTransact = true;
                    break;
                }
                case 7: {
                    parcel.enforceInterface("com.android.vending.billing.IInAppBillingService");
                    final Bundle a4 = this.a(parcel.readInt(), parcel.readString(), parcel.createStringArrayList(), parcel.readString(), parcel.readString(), parcel.readString());
                    parcel2.writeNoException();
                    if (a4 != null) {
                        parcel2.writeInt(1);
                        a4.writeToParcel(parcel2, 1);
                    }
                    else {
                        parcel2.writeInt(0);
                    }
                    onTransact = true;
                    break;
                }
                case 8: {
                    parcel.enforceInterface("com.android.vending.billing.IInAppBillingService");
                    n = parcel.readInt();
                    final String string3 = parcel.readString();
                    final String string4 = parcel.readString();
                    final String string5 = parcel.readString();
                    final String string6 = parcel.readString();
                    Bundle bundle3;
                    if (parcel.readInt() != 0) {
                        bundle3 = (Bundle)Bundle.CREATOR.createFromParcel(parcel);
                    }
                    else {
                        bundle3 = null;
                    }
                    final Bundle a5 = this.a(n, string3, string4, string5, string6, bundle3);
                    parcel2.writeNoException();
                    if (a5 != null) {
                        parcel2.writeInt(1);
                        a5.writeToParcel(parcel2, 1);
                    }
                    else {
                        parcel2.writeInt(0);
                    }
                    onTransact = true;
                    break;
                }
                case 9: {
                    parcel.enforceInterface("com.android.vending.billing.IInAppBillingService");
                    n = parcel.readInt();
                    final String string7 = parcel.readString();
                    final String string8 = parcel.readString();
                    final String string9 = parcel.readString();
                    Bundle bundle4;
                    if (parcel.readInt() != 0) {
                        bundle4 = (Bundle)Bundle.CREATOR.createFromParcel(parcel);
                    }
                    else {
                        bundle4 = null;
                    }
                    final Bundle a6 = this.a(n, string7, string8, string9, bundle4);
                    parcel2.writeNoException();
                    if (a6 != null) {
                        parcel2.writeInt(1);
                        a6.writeToParcel(parcel2, 1);
                    }
                    else {
                        parcel2.writeInt(0);
                    }
                    onTransact = true;
                    break;
                }
                case 10: {
                    parcel.enforceInterface("com.android.vending.billing.IInAppBillingService");
                    n = parcel.readInt();
                    final String string10 = parcel.readString();
                    final String string11 = parcel.readString();
                    Bundle bundle5 = bundle;
                    if (parcel.readInt() != 0) {
                        bundle5 = (Bundle)Bundle.CREATOR.createFromParcel(parcel);
                    }
                    n = this.b(n, string10, string11, bundle5);
                    parcel2.writeNoException();
                    parcel2.writeInt(n);
                    onTransact = true;
                    break;
                }
            }
            return onTransact;
        }
        
        private static final class a implements com.a.a.a.a
        {
            private IBinder a;
            
            a(final IBinder a) {
                this.a = a;
            }
            
            @Override
            public final int a(int int1, final String s, final String s2) {
                final Parcel obtain = Parcel.obtain();
                final Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.android.vending.billing.IInAppBillingService");
                    obtain.writeInt(int1);
                    obtain.writeString(s);
                    obtain.writeString(s2);
                    this.a.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                    int1 = obtain2.readInt();
                    return int1;
                }
                finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
            
            @Override
            public final Bundle a(final int n, final String s, final String s2, final Bundle bundle) {
                while (true) {
                    final Parcel obtain = Parcel.obtain();
                    final Parcel obtain2 = Parcel.obtain();
                    try {
                        obtain.writeInterfaceToken("com.android.vending.billing.IInAppBillingService");
                        obtain.writeInt(n);
                        obtain.writeString(s);
                        obtain.writeString(s2);
                        if (bundle != null) {
                            obtain.writeInt(1);
                            bundle.writeToParcel(obtain, 0);
                        }
                        else {
                            obtain.writeInt(0);
                        }
                        this.a.transact(2, obtain, obtain2, 0);
                        obtain2.readException();
                        if (obtain2.readInt() != 0) {
                            return (Bundle)Bundle.CREATOR.createFromParcel(obtain2);
                        }
                    }
                    finally {
                        obtain2.recycle();
                        obtain.recycle();
                    }
                    return null;
                }
            }
            
            @Override
            public final Bundle a(final int n, final String s, final String s2, final String s3) {
                final Parcel obtain = Parcel.obtain();
                final Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.android.vending.billing.IInAppBillingService");
                    obtain.writeInt(n);
                    obtain.writeString(s);
                    obtain.writeString(s2);
                    obtain.writeString(s3);
                    this.a.transact(4, obtain, obtain2, 0);
                    obtain2.readException();
                    Bundle bundle;
                    if (obtain2.readInt() != 0) {
                        bundle = (Bundle)Bundle.CREATOR.createFromParcel(obtain2);
                    }
                    else {
                        bundle = null;
                    }
                    return bundle;
                }
                finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
            
            @Override
            public final Bundle a(final int n, final String s, final String s2, final String s3, final Bundle bundle) {
                while (true) {
                    final Parcel obtain = Parcel.obtain();
                    final Parcel obtain2 = Parcel.obtain();
                    try {
                        obtain.writeInterfaceToken("com.android.vending.billing.IInAppBillingService");
                        obtain.writeInt(n);
                        obtain.writeString(s);
                        obtain.writeString(s2);
                        obtain.writeString(s3);
                        if (bundle != null) {
                            obtain.writeInt(1);
                            bundle.writeToParcel(obtain, 0);
                        }
                        else {
                            obtain.writeInt(0);
                        }
                        this.a.transact(9, obtain, obtain2, 0);
                        obtain2.readException();
                        if (obtain2.readInt() != 0) {
                            return (Bundle)Bundle.CREATOR.createFromParcel(obtain2);
                        }
                    }
                    finally {
                        obtain2.recycle();
                        obtain.recycle();
                    }
                    return null;
                }
            }
            
            @Override
            public final Bundle a(final int n, final String s, final String s2, final String s3, final String s4) {
                final Parcel obtain = Parcel.obtain();
                final Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.android.vending.billing.IInAppBillingService");
                    obtain.writeInt(n);
                    obtain.writeString(s);
                    obtain.writeString(s2);
                    obtain.writeString(s3);
                    obtain.writeString(s4);
                    this.a.transact(3, obtain, obtain2, 0);
                    obtain2.readException();
                    Bundle bundle;
                    if (obtain2.readInt() != 0) {
                        bundle = (Bundle)Bundle.CREATOR.createFromParcel(obtain2);
                    }
                    else {
                        bundle = null;
                    }
                    return bundle;
                }
                finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
            
            @Override
            public final Bundle a(final int n, final String s, final String s2, final String s3, final String s4, final Bundle bundle) {
                while (true) {
                    final Parcel obtain = Parcel.obtain();
                    final Parcel obtain2 = Parcel.obtain();
                    try {
                        obtain.writeInterfaceToken("com.android.vending.billing.IInAppBillingService");
                        obtain.writeInt(n);
                        obtain.writeString(s);
                        obtain.writeString(s2);
                        obtain.writeString(s3);
                        obtain.writeString(s4);
                        if (bundle != null) {
                            obtain.writeInt(1);
                            bundle.writeToParcel(obtain, 0);
                        }
                        else {
                            obtain.writeInt(0);
                        }
                        this.a.transact(8, obtain, obtain2, 0);
                        obtain2.readException();
                        if (obtain2.readInt() != 0) {
                            return (Bundle)Bundle.CREATOR.createFromParcel(obtain2);
                        }
                    }
                    finally {
                        obtain2.recycle();
                        obtain.recycle();
                    }
                    return null;
                }
            }
            
            @Override
            public final Bundle a(final int n, final String s, final List<String> list, final String s2, final String s3, final String s4) {
                final Parcel obtain = Parcel.obtain();
                final Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.android.vending.billing.IInAppBillingService");
                    obtain.writeInt(n);
                    obtain.writeString(s);
                    obtain.writeStringList((List)list);
                    obtain.writeString(s2);
                    obtain.writeString(s3);
                    obtain.writeString(s4);
                    this.a.transact(7, obtain, obtain2, 0);
                    obtain2.readException();
                    Bundle bundle;
                    if (obtain2.readInt() != 0) {
                        bundle = (Bundle)Bundle.CREATOR.createFromParcel(obtain2);
                    }
                    else {
                        bundle = null;
                    }
                    return bundle;
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
            public final int b(int int1, final String s, final String s2) {
                final Parcel obtain = Parcel.obtain();
                final Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.android.vending.billing.IInAppBillingService");
                    obtain.writeInt(int1);
                    obtain.writeString(s);
                    obtain.writeString(s2);
                    this.a.transact(5, obtain, obtain2, 0);
                    obtain2.readException();
                    int1 = obtain2.readInt();
                    return int1;
                }
                finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
            
            @Override
            public final int b(int int1, final String s, final String s2, final Bundle bundle) {
                final Parcel obtain = Parcel.obtain();
                final Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.android.vending.billing.IInAppBillingService");
                    obtain.writeInt(int1);
                    obtain.writeString(s);
                    obtain.writeString(s2);
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    }
                    else {
                        obtain.writeInt(0);
                    }
                    this.a.transact(10, obtain, obtain2, 0);
                    obtain2.readException();
                    int1 = obtain2.readInt();
                    return int1;
                }
                finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
            
            @Override
            public final int c(int int1, final String s, final String s2) {
                final Parcel obtain = Parcel.obtain();
                final Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.android.vending.billing.IInAppBillingService");
                    obtain.writeInt(int1);
                    obtain.writeString(s);
                    obtain.writeString(s2);
                    this.a.transact(6, obtain, obtain2, 0);
                    obtain2.readException();
                    int1 = obtain2.readInt();
                    return int1;
                }
                finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }
    }
}
