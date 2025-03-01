/*
 * Decompiled with CFR 0.150.
 */
package android.support.v7.internal.widget;

public final class l {
    public int a = 0;
    public int b = 0;
    public int c = Integer.MIN_VALUE;
    public int d = Integer.MIN_VALUE;
    public int e = 0;
    public int f = 0;
    public boolean g = false;
    public boolean h = false;

    /*
     * Enabled aggressive block sorting
     */
    public final void a(int n2, int n3) {
        this.c = n2;
        this.d = n3;
        this.h = true;
        if (this.g) {
            if (n3 != Integer.MIN_VALUE) {
                this.a = n3;
            }
            if (n2 == Integer.MIN_VALUE) return;
            this.b = n2;
            return;
        }
        if (n2 != Integer.MIN_VALUE) {
            this.a = n2;
        }
        if (n3 == Integer.MIN_VALUE) return;
        this.b = n3;
    }
}

