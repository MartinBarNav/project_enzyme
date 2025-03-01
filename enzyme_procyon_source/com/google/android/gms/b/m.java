// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.b;

final class m implements q
{
    private final long a;
    private final int b;
    private double c;
    private long d;
    private final Object e;
    private final String f;
    
    private m(final String f) {
        this.e = new Object();
        this.b = 60;
        this.c = this.b;
        this.a = 2000L;
        this.f = f;
    }
    
    public m(final String s, final byte b) {
        this(s);
    }
    
    @Override
    public final boolean a() {
        synchronized (this.e) {
            final long currentTimeMillis = System.currentTimeMillis();
            if (this.c < this.b) {
                final double n = (currentTimeMillis - this.d) / (double)this.a;
                if (n > 0.0) {
                    this.c = Math.min(this.b, n + this.c);
                }
            }
            this.d = currentTimeMillis;
            boolean b;
            if (this.c >= 1.0) {
                --this.c;
                b = true;
            }
            else {
                n.d("Excessive " + this.f + " detected; call ignored.");
                b = false;
            }
            // monitorexit(this.e)
            return b;
        }
    }
}
