package com.saterskog.a;

public final class c {
    int a;
    String b;

    public c(int i, String str) {
        this.a = i;
        if (str == null || str.trim().length() == 0) {
            this.b = b.a(i);
        } else {
            this.b = str + " (response: " + b.a(i) + ")";
        }
    }

    public final boolean a() {
        return this.a == 0;
    }

    public final boolean b() {
        return !a();
    }

    public final String toString() {
        return "IabResult: " + this.b;
    }
}
