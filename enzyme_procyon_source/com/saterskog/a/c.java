// 
// Decompiled by Procyon v0.5.36
// 

package com.saterskog.a;

public final class c
{
    int a;
    String b;
    
    public c(final int a, final String str) {
        this.a = a;
        if (str == null || str.trim().length() == 0) {
            this.b = com.saterskog.a.b.a(a);
        }
        else {
            this.b = str + " (response: " + com.saterskog.a.b.a(a) + ")";
        }
    }
    
    public final boolean a() {
        return this.a == 0;
    }
    
    public final boolean b() {
        return !this.a();
    }
    
    @Override
    public final String toString() {
        return "IabResult: " + this.b;
    }
}
