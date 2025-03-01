package com.saterskog.a;

public final class a extends Exception {
    c a;

    private a(c cVar) {
        this(cVar, (Exception) null);
    }

    public a(int i, String str) {
        this(new c(i, str));
    }

    public a(int i, String str, Exception exc) {
        this(new c(i, str), exc);
    }

    private a(c cVar, Exception exc) {
        super(cVar.b, exc);
        this.a = cVar;
    }
}
