/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  android.os.Binder
 *  android.os.IBinder
 *  android.os.IInterface
 *  android.os.Parcel
 */
package com.google.android.gms.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

public interface h
extends IInterface {
    public String a();

    public String a(String var1);

    public void a(String var1, boolean var2);

    public boolean a(boolean var1);

    public static abstract class com.google.android.gms.internal.h$a
    extends Binder
    implements h {
        /*
         * WARNING - void declaration
         * Enabled force condition propagation
         * Lifted jumps to return sites
         */
        public static h a(IBinder object) {
            void var0_2;
            if (object == null) {
                return var0_2;
            }
            IInterface iInterface = object.queryLocalInterface("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
            if (iInterface != null && iInterface instanceof h) {
                h h2 = (h)iInterface;
                return var0_2;
            }
            a a2 = new a((IBinder)object);
            return var0_2;
        }

        /*
         * WARNING - void declaration
         * Enabled aggressive block sorting
         */
        public boolean onTransact(int n2, Parcel object, Parcel parcel, int n3) {
            void var3_5;
            boolean bl = false;
            int n4 = 0;
            boolean bl2 = true;
            switch (n2) {
                default: {
                    void var4_6;
                    return super.onTransact(n2, object, (Parcel)var3_5, (int)var4_6);
                }
                case 1598968902: {
                    var3_5.writeString("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                    return bl2;
                }
                case 1: {
                    object.enforceInterface("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                    String string = this.a();
                    var3_5.writeNoException();
                    var3_5.writeString(string);
                    return bl2;
                }
                case 2: {
                    object.enforceInterface("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                    bl = object.readInt() != 0;
                    bl = this.a(bl);
                    var3_5.writeNoException();
                    n2 = n4;
                    if (bl) {
                        n2 = 1;
                    }
                    var3_5.writeInt(n2);
                    return bl2;
                }
                case 3: {
                    object.enforceInterface("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                    String string = this.a(object.readString());
                    var3_5.writeNoException();
                    var3_5.writeString(string);
                    return bl2;
                }
                case 4: 
            }
            object.enforceInterface("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
            String string = object.readString();
            if (object.readInt() != 0) {
                bl = true;
            }
            this.a(string, bl);
            var3_5.writeNoException();
            return bl2;
        }

        private static final class a
        implements h {
            private IBinder a;

            a(IBinder iBinder) {
                this.a = iBinder;
            }

            @Override
            public final String a() {
                Parcel parcel = Parcel.obtain();
                Parcel parcel2 = Parcel.obtain();
                try {
                    parcel.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                    this.a.transact(1, parcel, parcel2, 0);
                    parcel2.readException();
                    String string = parcel2.readString();
                    return string;
                }
                finally {
                    parcel2.recycle();
                    parcel.recycle();
                }
            }

            @Override
            public final String a(String string) {
                Parcel parcel = Parcel.obtain();
                Parcel parcel2 = Parcel.obtain();
                try {
                    parcel.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                    parcel.writeString(string);
                    this.a.transact(3, parcel, parcel2, 0);
                    parcel2.readException();
                    string = parcel2.readString();
                    return string;
                }
                finally {
                    parcel2.recycle();
                    parcel.recycle();
                }
            }

            @Override
            public final void a(String string, boolean bl) {
                Parcel parcel;
                Parcel parcel2;
                int n2;
                block4: {
                    n2 = 0;
                    parcel2 = Parcel.obtain();
                    parcel = Parcel.obtain();
                    parcel2.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                    parcel2.writeString(string);
                    if (!bl) break block4;
                    n2 = 1;
                }
                try {
                    parcel2.writeInt(n2);
                    this.a.transact(4, parcel2, parcel, 0);
                    parcel.readException();
                    return;
                }
                finally {
                    parcel.recycle();
                    parcel2.recycle();
                }
            }

            /*
             * Enabled aggressive block sorting
             * Enabled unnecessary exception pruning
             * Enabled aggressive exception aggregation
             */
            @Override
            public final boolean a(boolean bl) {
                boolean bl2 = true;
                Parcel parcel = Parcel.obtain();
                Parcel parcel2 = Parcel.obtain();
                try {
                    parcel.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                    int n2 = bl ? 1 : 0;
                    parcel.writeInt(n2);
                    this.a.transact(2, parcel, parcel2, 0);
                    parcel2.readException();
                    n2 = parcel2.readInt();
                    bl = n2 != 0 ? bl2 : false;
                    return bl;
                }
                finally {
                    parcel2.recycle();
                    parcel.recycle();
                }
            }

            public final IBinder asBinder() {
                return this.a;
            }
        }
    }
}

