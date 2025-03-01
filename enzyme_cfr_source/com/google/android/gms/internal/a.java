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
import com.google.android.gms.internal.ha;
import java.util.List;
import java.util.Map;

public interface a
extends IInterface {
    public void a();

    public void a(Map var1, long var2, String var4, List<ha> var5);

    public String b();

    public static abstract class com.google.android.gms.internal.a$a
    extends Binder
    implements com.google.android.gms.internal.a {
        /*
         * WARNING - void declaration
         * Enabled force condition propagation
         * Lifted jumps to return sites
         */
        public static com.google.android.gms.internal.a a(IBinder object) {
            void var0_2;
            if (object == null) {
                return var0_2;
            }
            IInterface iInterface = object.queryLocalInterface("com.google.android.gms.analytics.internal.IAnalyticsService");
            if (iInterface != null && iInterface instanceof com.google.android.gms.internal.a) {
                com.google.android.gms.internal.a a2 = (com.google.android.gms.internal.a)iInterface;
                return var0_2;
            }
            a a3 = new a((IBinder)object);
            return var0_2;
        }

        /*
         * WARNING - void declaration
         * Enabled force condition propagation
         * Lifted jumps to return sites
         */
        public boolean onTransact(int n2, Parcel object, Parcel parcel, int n3) {
            void var3_4;
            switch (n2) {
                default: {
                    void var4_5;
                    return super.onTransact(n2, object, (Parcel)var3_4, (int)var4_5);
                }
                case 1598968902: {
                    var3_4.writeString("com.google.android.gms.analytics.internal.IAnalyticsService");
                    return true;
                }
                case 1: {
                    object.enforceInterface("com.google.android.gms.analytics.internal.IAnalyticsService");
                    this.a(object.readHashMap(this.getClass().getClassLoader()), object.readLong(), object.readString(), object.createTypedArrayList(ha.CREATOR));
                    var3_4.writeNoException();
                    return true;
                }
                case 2: {
                    object.enforceInterface("com.google.android.gms.analytics.internal.IAnalyticsService");
                    this.a();
                    var3_4.writeNoException();
                    return true;
                }
                case 3: 
            }
            object.enforceInterface("com.google.android.gms.analytics.internal.IAnalyticsService");
            String string = this.b();
            var3_4.writeNoException();
            var3_4.writeString(string);
            return true;
        }

        private static final class a
        implements com.google.android.gms.internal.a {
            private IBinder a;

            a(IBinder iBinder) {
                this.a = iBinder;
            }

            @Override
            public final void a() {
                Parcel parcel = Parcel.obtain();
                Parcel parcel2 = Parcel.obtain();
                try {
                    parcel.writeInterfaceToken("com.google.android.gms.analytics.internal.IAnalyticsService");
                    this.a.transact(2, parcel, parcel2, 0);
                    parcel2.readException();
                    return;
                }
                finally {
                    parcel2.recycle();
                    parcel.recycle();
                }
            }

            @Override
            public final void a(Map map, long l2, String string, List<ha> list) {
                Parcel parcel = Parcel.obtain();
                Parcel parcel2 = Parcel.obtain();
                try {
                    parcel.writeInterfaceToken("com.google.android.gms.analytics.internal.IAnalyticsService");
                    parcel.writeMap(map);
                    parcel.writeLong(l2);
                    parcel.writeString(string);
                    parcel.writeTypedList(list);
                    this.a.transact(1, parcel, parcel2, 0);
                    parcel2.readException();
                    return;
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
            public final String b() {
                Parcel parcel = Parcel.obtain();
                Parcel parcel2 = Parcel.obtain();
                try {
                    parcel.writeInterfaceToken("com.google.android.gms.analytics.internal.IAnalyticsService");
                    this.a.transact(3, parcel, parcel2, 0);
                    parcel2.readException();
                    String string = parcel2.readString();
                    return string;
                }
                finally {
                    parcel2.recycle();
                    parcel.recycle();
                }
            }
        }
    }
}

