/*
 * Decompiled with CFR 0.150.
 */
package android.support.v4.e;

public final class h<E>
implements Cloneable {
    private static final Object a = new Object();
    private boolean b = false;
    private int[] c = new int[13];
    private Object[] d = new Object[13];
    private int e = 0;

    public h() {
        this(0);
    }

    private h(byte by) {
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private h<E> c() {
        h h2;
        try {
            h2 = (h)super.clone();
        }
        catch (CloneNotSupportedException cloneNotSupportedException) {
            return null;
        }
        try {
            h2.c = (int[])this.c.clone();
            h2.d = (Object[])this.d.clone();
        }
        catch (CloneNotSupportedException cloneNotSupportedException) {
            return h2;
        }
        return h2;
    }

    private void d() {
        int n2 = this.e;
        int[] arrn = this.c;
        Object[] arrobject = this.d;
        int n3 = 0;
        for (int i2 = 0; i2 < n2; ++i2) {
            Object object = arrobject[i2];
            int n4 = n3;
            if (object != a) {
                if (i2 != n3) {
                    arrn[n3] = arrn[i2];
                    arrobject[n3] = object;
                    arrobject[i2] = null;
                }
                n4 = n3 + 1;
            }
            n3 = n4;
        }
        this.b = false;
        this.e = n3;
    }

    public final int a() {
        if (this.b) {
            this.d();
        }
        return this.e;
    }

    public final int a(int n2) {
        if (this.b) {
            this.d();
        }
        return this.c[n2];
    }

    public final E b(int n2) {
        if (this.b) {
            this.d();
        }
        return (E)this.d[n2];
    }

    public final void b() {
        int n2 = this.e;
        Object[] arrobject = this.d;
        for (int i2 = 0; i2 < n2; ++i2) {
            arrobject[i2] = null;
        }
        this.e = 0;
        this.b = false;
    }

    public final /* synthetic */ Object clone() {
        return this.c();
    }

    /*
     * Enabled aggressive block sorting
     */
    public final String toString() {
        if (this.a() <= 0) {
            return "{}";
        }
        CharSequence charSequence = new StringBuilder(this.e * 28);
        ((StringBuilder)charSequence).append('{');
        int n2 = 0;
        while (true) {
            if (n2 >= this.e) {
                ((StringBuilder)charSequence).append('}');
                return ((StringBuilder)charSequence).toString();
            }
            if (n2 > 0) {
                ((StringBuilder)charSequence).append(", ");
            }
            ((StringBuilder)charSequence).append(this.a(n2));
            ((StringBuilder)charSequence).append('=');
            E e2 = this.b(n2);
            if (e2 != this) {
                ((StringBuilder)charSequence).append(e2);
            } else {
                ((StringBuilder)charSequence).append("(this Map)");
            }
            ++n2;
        }
    }
}

