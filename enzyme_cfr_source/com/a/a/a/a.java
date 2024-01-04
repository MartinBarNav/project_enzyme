/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  android.os.Binder
 *  android.os.Bundle
 *  android.os.IBinder
 *  android.os.IInterface
 *  android.os.Parcel
 */
package com.a.a.a;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import java.util.List;

public interface a
extends IInterface {
    public int a(int var1, String var2, String var3);

    public Bundle a(int var1, String var2, String var3, Bundle var4);

    public Bundle a(int var1, String var2, String var3, String var4);

    public Bundle a(int var1, String var2, String var3, String var4, Bundle var5);

    public Bundle a(int var1, String var2, String var3, String var4, String var5);

    public Bundle a(int var1, String var2, String var3, String var4, String var5, Bundle var6);

    public Bundle a(int var1, String var2, List<String> var3, String var4, String var5, String var6);

    public int b(int var1, String var2, String var3);

    public int b(int var1, String var2, String var3, Bundle var4);

    public int c(int var1, String var2, String var3);

    public static abstract class com.a.a.a.a$a
    extends Binder
    implements com.a.a.a.a {
        /*
         * WARNING - void declaration
         * Enabled force condition propagation
         * Lifted jumps to return sites
         */
        public static com.a.a.a.a a(IBinder object) {
            void var0_2;
            if (object == null) {
                return var0_2;
            }
            IInterface iInterface = object.queryLocalInterface("com.android.vending.billing.IInAppBillingService");
            if (iInterface != null && iInterface instanceof com.a.a.a.a) {
                com.a.a.a.a a2 = (com.a.a.a.a)iInterface;
                return var0_2;
            }
            a a3 = new a((IBinder)object);
            return var0_2;
        }

        /*
         * Enabled aggressive block sorting
         */
        public boolean onTransact(int n2, Parcel object, Parcel parcel, int n3) {
            String string = null;
            String string2 = null;
            switch (n2) {
                default: {
                    return super.onTransact(n2, object, parcel, n3);
                }
                case 1598968902: {
                    parcel.writeString("com.android.vending.billing.IInAppBillingService");
                    return true;
                }
                case 1: {
                    object.enforceInterface("com.android.vending.billing.IInAppBillingService");
                    n2 = this.a(object.readInt(), object.readString(), object.readString());
                    parcel.writeNoException();
                    parcel.writeInt(n2);
                    return true;
                }
                case 2: {
                    object.enforceInterface("com.android.vending.billing.IInAppBillingService");
                    n2 = object.readInt();
                    string = object.readString();
                    String string3 = object.readString();
                    if (object.readInt() != 0) {
                        string2 = (Bundle)Bundle.CREATOR.createFromParcel(object);
                    }
                    object = this.a(n2, string, string3, (Bundle)string2);
                    parcel.writeNoException();
                    if (object != null) {
                        parcel.writeInt(1);
                        object.writeToParcel(parcel, 1);
                        return true;
                    } else {
                        parcel.writeInt(0);
                    }
                    return true;
                }
                case 3: {
                    object.enforceInterface("com.android.vending.billing.IInAppBillingService");
                    object = this.a(object.readInt(), object.readString(), object.readString(), object.readString(), object.readString());
                    parcel.writeNoException();
                    if (object != null) {
                        parcel.writeInt(1);
                        object.writeToParcel(parcel, 1);
                        return true;
                    } else {
                        parcel.writeInt(0);
                    }
                    return true;
                }
                case 4: {
                    object.enforceInterface("com.android.vending.billing.IInAppBillingService");
                    object = this.a(object.readInt(), object.readString(), object.readString(), object.readString());
                    parcel.writeNoException();
                    if (object != null) {
                        parcel.writeInt(1);
                        object.writeToParcel(parcel, 1);
                        return true;
                    } else {
                        parcel.writeInt(0);
                    }
                    return true;
                }
                case 5: {
                    object.enforceInterface("com.android.vending.billing.IInAppBillingService");
                    n2 = this.b(object.readInt(), object.readString(), object.readString());
                    parcel.writeNoException();
                    parcel.writeInt(n2);
                    return true;
                }
                case 6: {
                    object.enforceInterface("com.android.vending.billing.IInAppBillingService");
                    n2 = this.c(object.readInt(), object.readString(), object.readString());
                    parcel.writeNoException();
                    parcel.writeInt(n2);
                    return true;
                }
                case 7: {
                    object.enforceInterface("com.android.vending.billing.IInAppBillingService");
                    object = this.a(object.readInt(), object.readString(), object.createStringArrayList(), object.readString(), object.readString(), object.readString());
                    parcel.writeNoException();
                    if (object != null) {
                        parcel.writeInt(1);
                        object.writeToParcel(parcel, 1);
                        return true;
                    } else {
                        parcel.writeInt(0);
                    }
                    return true;
                }
                case 8: {
                    object.enforceInterface("com.android.vending.billing.IInAppBillingService");
                    n2 = object.readInt();
                    String string4 = object.readString();
                    string = object.readString();
                    String string5 = object.readString();
                    string2 = object.readString();
                    object = object.readInt() != 0 ? (Bundle)Bundle.CREATOR.createFromParcel(object) : null;
                    object = this.a(n2, string4, string, string5, string2, (Bundle)object);
                    parcel.writeNoException();
                    if (object != null) {
                        parcel.writeInt(1);
                        object.writeToParcel(parcel, 1);
                        return true;
                    } else {
                        parcel.writeInt(0);
                    }
                    return true;
                }
                case 9: {
                    object.enforceInterface("com.android.vending.billing.IInAppBillingService");
                    n2 = object.readInt();
                    String string6 = object.readString();
                    string = object.readString();
                    string2 = object.readString();
                    object = object.readInt() != 0 ? (Bundle)Bundle.CREATOR.createFromParcel(object) : null;
                    object = this.a(n2, string6, string, string2, (Bundle)object);
                    parcel.writeNoException();
                    if (object != null) {
                        parcel.writeInt(1);
                        object.writeToParcel(parcel, 1);
                        return true;
                    } else {
                        parcel.writeInt(0);
                    }
                    return true;
                }
                case 10: 
            }
            object.enforceInterface("com.android.vending.billing.IInAppBillingService");
            n2 = object.readInt();
            String string7 = object.readString();
            String string8 = object.readString();
            string2 = string;
            if (object.readInt() != 0) {
                string2 = (Bundle)Bundle.CREATOR.createFromParcel(object);
            }
            n2 = this.b(n2, string7, string8, (Bundle)string2);
            parcel.writeNoException();
            parcel.writeInt(n2);
            return true;
        }

        private static final class a
        implements com.a.a.a.a {
            private IBinder a;

            a(IBinder iBinder) {
                this.a = iBinder;
            }

            @Override
            public final int a(int n2, String string, String string2) {
                Parcel parcel = Parcel.obtain();
                Parcel parcel2 = Parcel.obtain();
                try {
                    parcel.writeInterfaceToken("com.android.vending.billing.IInAppBillingService");
                    parcel.writeInt(n2);
                    parcel.writeString(string);
                    parcel.writeString(string2);
                    this.a.transact(1, parcel, parcel2, 0);
                    parcel2.readException();
                    n2 = parcel2.readInt();
                    return n2;
                }
                finally {
                    parcel2.recycle();
                    parcel.recycle();
                }
            }

            /*
             * Enabled aggressive block sorting
             * Enabled unnecessary exception pruning
             * Enabled aggressive exception aggregation
             */
            @Override
            public final Bundle a(int n2, String string, String string2, Bundle bundle) {
                Parcel parcel = Parcel.obtain();
                Parcel parcel2 = Parcel.obtain();
                try {
                    parcel.writeInterfaceToken("com.android.vending.billing.IInAppBillingService");
                    parcel.writeInt(n2);
                    parcel.writeString(string);
                    parcel.writeString(string2);
                    if (bundle != null) {
                        parcel.writeInt(1);
                        bundle.writeToParcel(parcel, 0);
                    } else {
                        parcel.writeInt(0);
                    }
                    this.a.transact(2, parcel, parcel2, 0);
                    parcel2.readException();
                    string = parcel2.readInt() != 0 ? (Bundle)Bundle.CREATOR.createFromParcel(parcel2) : null;
                    return string;
                }
                finally {
                    parcel2.recycle();
                    parcel.recycle();
                }
            }

            /*
             * Enabled aggressive block sorting
             * Enabled unnecessary exception pruning
             * Enabled aggressive exception aggregation
             */
            @Override
            public final Bundle a(int n2, String string, String string2, String string3) {
                Parcel parcel = Parcel.obtain();
                Parcel parcel2 = Parcel.obtain();
                try {
                    parcel.writeInterfaceToken("com.android.vending.billing.IInAppBillingService");
                    parcel.writeInt(n2);
                    parcel.writeString(string);
                    parcel.writeString(string2);
                    parcel.writeString(string3);
                    this.a.transact(4, parcel, parcel2, 0);
                    parcel2.readException();
                    string = parcel2.readInt() != 0 ? (Bundle)Bundle.CREATOR.createFromParcel(parcel2) : null;
                    return string;
                }
                finally {
                    parcel2.recycle();
                    parcel.recycle();
                }
            }

            /*
             * Enabled aggressive block sorting
             * Enabled unnecessary exception pruning
             * Enabled aggressive exception aggregation
             */
            @Override
            public final Bundle a(int n2, String string, String string2, String string3, Bundle bundle) {
                Parcel parcel = Parcel.obtain();
                Parcel parcel2 = Parcel.obtain();
                try {
                    parcel.writeInterfaceToken("com.android.vending.billing.IInAppBillingService");
                    parcel.writeInt(n2);
                    parcel.writeString(string);
                    parcel.writeString(string2);
                    parcel.writeString(string3);
                    if (bundle != null) {
                        parcel.writeInt(1);
                        bundle.writeToParcel(parcel, 0);
                    } else {
                        parcel.writeInt(0);
                    }
                    this.a.transact(9, parcel, parcel2, 0);
                    parcel2.readException();
                    string = parcel2.readInt() != 0 ? (Bundle)Bundle.CREATOR.createFromParcel(parcel2) : null;
                    return string;
                }
                finally {
                    parcel2.recycle();
                    parcel.recycle();
                }
            }

            /*
             * Enabled aggressive block sorting
             * Enabled unnecessary exception pruning
             * Enabled aggressive exception aggregation
             */
            @Override
            public final Bundle a(int n2, String string, String string2, String string3, String string4) {
                Parcel parcel = Parcel.obtain();
                Parcel parcel2 = Parcel.obtain();
                try {
                    parcel.writeInterfaceToken("com.android.vending.billing.IInAppBillingService");
                    parcel.writeInt(n2);
                    parcel.writeString(string);
                    parcel.writeString(string2);
                    parcel.writeString(string3);
                    parcel.writeString(string4);
                    this.a.transact(3, parcel, parcel2, 0);
                    parcel2.readException();
                    string = parcel2.readInt() != 0 ? (Bundle)Bundle.CREATOR.createFromParcel(parcel2) : null;
                    return string;
                }
                finally {
                    parcel2.recycle();
                    parcel.recycle();
                }
            }

            /*
             * Enabled aggressive block sorting
             * Enabled unnecessary exception pruning
             * Enabled aggressive exception aggregation
             */
            @Override
            public final Bundle a(int n2, String string, String string2, String string3, String string4, Bundle bundle) {
                Parcel parcel = Parcel.obtain();
                Parcel parcel2 = Parcel.obtain();
                try {
                    parcel.writeInterfaceToken("com.android.vending.billing.IInAppBillingService");
                    parcel.writeInt(n2);
                    parcel.writeString(string);
                    parcel.writeString(string2);
                    parcel.writeString(string3);
                    parcel.writeString(string4);
                    if (bundle != null) {
                        parcel.writeInt(1);
                        bundle.writeToParcel(parcel, 0);
                    } else {
                        parcel.writeInt(0);
                    }
                    this.a.transact(8, parcel, parcel2, 0);
                    parcel2.readException();
                    string = parcel2.readInt() != 0 ? (Bundle)Bundle.CREATOR.createFromParcel(parcel2) : null;
                    return string;
                }
                finally {
                    parcel2.recycle();
                    parcel.recycle();
                }
            }

            /*
             * Enabled aggressive block sorting
             * Enabled unnecessary exception pruning
             * Enabled aggressive exception aggregation
             */
            @Override
            public final Bundle a(int n2, String string, List<String> list, String string2, String string3, String string4) {
                Parcel parcel = Parcel.obtain();
                Parcel parcel2 = Parcel.obtain();
                try {
                    parcel.writeInterfaceToken("com.android.vending.billing.IInAppBillingService");
                    parcel.writeInt(n2);
                    parcel.writeString(string);
                    parcel.writeStringList(list);
                    parcel.writeString(string2);
                    parcel.writeString(string3);
                    parcel.writeString(string4);
                    this.a.transact(7, parcel, parcel2, 0);
                    parcel2.readException();
                    string = parcel2.readInt() != 0 ? (Bundle)Bundle.CREATOR.createFromParcel(parcel2) : null;
                    return string;
                }
                finally {
                    parcel2.recycle();
                    parcel.recycle();
                }
            }

            public final IBinder asBinder() {
                return this.a;
            }

            @Override
            public final int b(int n2, String string, String string2) {
                Parcel parcel = Parcel.obtain();
                Parcel parcel2 = Parcel.obtain();
                try {
                    parcel.writeInterfaceToken("com.android.vending.billing.IInAppBillingService");
                    parcel.writeInt(n2);
                    parcel.writeString(string);
                    parcel.writeString(string2);
                    this.a.transact(5, parcel, parcel2, 0);
                    parcel2.readException();
                    n2 = parcel2.readInt();
                    return n2;
                }
                finally {
                    parcel2.recycle();
                    parcel.recycle();
                }
            }

            /*
             * Enabled aggressive block sorting
             * Enabled unnecessary exception pruning
             * Enabled aggressive exception aggregation
             */
            @Override
            public final int b(int n2, String string, String string2, Bundle bundle) {
                Parcel parcel = Parcel.obtain();
                Parcel parcel2 = Parcel.obtain();
                try {
                    parcel.writeInterfaceToken("com.android.vending.billing.IInAppBillingService");
                    parcel.writeInt(n2);
                    parcel.writeString(string);
                    parcel.writeString(string2);
                    if (bundle != null) {
                        parcel.writeInt(1);
                        bundle.writeToParcel(parcel, 0);
                    } else {
                        parcel.writeInt(0);
                    }
                    this.a.transact(10, parcel, parcel2, 0);
                    parcel2.readException();
                    n2 = parcel2.readInt();
                    return n2;
                }
                finally {
                    parcel2.recycle();
                    parcel.recycle();
                }
            }

            @Override
            public final int c(int n2, String string, String string2) {
                Parcel parcel = Parcel.obtain();
                Parcel parcel2 = Parcel.obtain();
                try {
                    parcel.writeInterfaceToken("com.android.vending.billing.IInAppBillingService");
                    parcel.writeInt(n2);
                    parcel.writeString(string);
                    parcel.writeString(string2);
                    this.a.transact(6, parcel, parcel2, 0);
                    parcel2.readException();
                    n2 = parcel2.readInt();
                    return n2;
                }
                finally {
                    parcel2.recycle();
                    parcel.recycle();
                }
            }
        }
    }
}

