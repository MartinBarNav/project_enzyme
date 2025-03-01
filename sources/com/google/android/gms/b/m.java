package com.google.android.gms.b;

final class m implements q {
    private final long a;
    private final int b;
    private double c;
    private long d;
    private final Object e;
    private final String f;

    private m(String str) {
        this.e = new Object();
        this.b = 60;
        this.c = (double) this.b;
        this.a = 2000;
        this.f = str;
    }

    public m(String str, byte b2) {
        this(str);
    }

    public final boolean a() {
        boolean z;
        synchronized (this.e) {
            long currentTimeMillis = System.currentTimeMillis();
            if (this.c < ((double) this.b)) {
                double d2 = ((double) (currentTimeMillis - this.d)) / ((double) this.a);
                if (d2 > 0.0d) {
                    this.c = Math.min((double) this.b, d2 + this.c);
                }
            }
            this.d = currentTimeMillis;
            if (this.c >= 1.0d) {
                this.c -= 1.0d;
                z = true;
            } else {
                n.d("Excessive " + this.f + " detected; call ignored.");
                z = false;
            }
        }
        return z;
    }
}
