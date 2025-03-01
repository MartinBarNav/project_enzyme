/*
 * Decompiled with CFR 0.150.
 */
package com.saterskog.a;

import com.saterskog.a.c;

public final class a
extends Exception {
    c a;

    public a(int n2, String string) {
        this(new c(n2, string));
    }

    public a(int n2, String string, Exception exception) {
        this(new c(n2, string), exception);
    }

    private a(c c2) {
        this(c2, null);
    }

    private a(c c2, Exception exception) {
        super(c2.b, exception);
        this.a = c2;
    }
}

