package com.google.android.gms.b;

import android.util.Log;

final class al implements e {
    private int a = 2;

    al() {
    }

    private static String e(String str) {
        return Thread.currentThread().toString() + ": " + str;
    }

    public final int a() {
        return this.a;
    }

    public final void a(int i) {
        this.a = i;
    }

    public final void a(String str) {
        if (this.a <= 0) {
            Log.v("GAV4", e(str));
        }
    }

    public final void b(String str) {
        if (this.a <= 1) {
            Log.i("GAV4", e(str));
        }
    }

    public final void c(String str) {
        if (this.a <= 2) {
            Log.w("GAV4", e(str));
        }
    }

    public final void d(String str) {
        if (this.a <= 3) {
            Log.e("GAV4", e(str));
        }
    }
}
