// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.b;

import android.util.Log;

final class al implements e
{
    private int a;
    
    al() {
        this.a = 2;
    }
    
    private static String e(final String str) {
        return Thread.currentThread().toString() + ": " + str;
    }
    
    @Override
    public final int a() {
        return this.a;
    }
    
    @Override
    public final void a(final int a) {
        this.a = a;
    }
    
    @Override
    public final void a(final String s) {
        if (this.a <= 0) {
            Log.v("GAV4", e(s));
        }
    }
    
    @Override
    public final void b(final String s) {
        if (this.a <= 1) {
            Log.i("GAV4", e(s));
        }
    }
    
    @Override
    public final void c(final String s) {
        if (this.a <= 2) {
            Log.w("GAV4", e(s));
        }
    }
    
    @Override
    public final void d(final String s) {
        if (this.a <= 3) {
            Log.e("GAV4", e(s));
        }
    }
}
