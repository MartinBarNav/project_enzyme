/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  android.util.Log
 */
package com.google.android.gms.b;

import android.util.Log;
import com.google.android.gms.b.e;

final class al
implements e {
    private int a = 2;

    al() {
    }

    private static String e(String string) {
        return Thread.currentThread().toString() + ": " + string;
    }

    @Override
    public final int a() {
        return this.a;
    }

    @Override
    public final void a(int n2) {
        this.a = n2;
    }

    @Override
    public final void a(String string) {
        if (this.a <= 0) {
            Log.v((String)"GAV4", (String)al.e(string));
        }
    }

    @Override
    public final void b(String string) {
        if (this.a <= 1) {
            Log.i((String)"GAV4", (String)al.e(string));
        }
    }

    @Override
    public final void c(String string) {
        if (this.a <= 2) {
            Log.w((String)"GAV4", (String)al.e(string));
        }
    }

    @Override
    public final void d(String string) {
        if (this.a <= 3) {
            Log.e((String)"GAV4", (String)al.e(string));
        }
    }
}

