/*
 * Decompiled with CFR 0.150.
 */
package android.support.v4.content;

public final class c<D> {
    public int a;
    public a<D> b;
    public boolean c;
    public boolean d;
    public boolean e;
    public boolean f;
    public boolean g;

    public final void a(a<D> a2) {
        if (this.b == null) {
            throw new IllegalStateException("No listener register");
        }
        if (this.b != a2) {
            throw new IllegalArgumentException("Attempting to unregister the wrong listener");
        }
        this.b = null;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder(64);
        android.support.v4.e.c.a(this, stringBuilder);
        stringBuilder.append(" id=");
        stringBuilder.append(this.a);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }

    public static interface a<D> {
    }
}

