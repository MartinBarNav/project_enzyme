// 
// Decompiled by Procyon v0.5.36
// 

package com.saterskog.a;

public final class a extends Exception
{
    c a;
    
    public a(final int n, final String s) {
        this(new c(n, s));
    }
    
    public a(final int n, final String s, final Exception ex) {
        this(new c(n, s), ex);
    }
    
    private a(final c c) {
        this(c, null);
    }
    
    private a(final c a, final Exception cause) {
        super(a.b, cause);
        this.a = a;
    }
}
