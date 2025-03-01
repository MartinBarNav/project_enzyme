package android.support.v4.e;

public final class h<E> implements Cloneable {
    private static final Object a = new Object();
    private boolean b;
    private int[] c;
    private Object[] d;
    private int e;

    public h() {
        this((byte) 0);
    }

    private h(byte b2) {
        this.b = false;
        this.c = new int[13];
        this.d = new Object[13];
        this.e = 0;
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public h<E> clone() {
        try {
            h<E> hVar = (h) super.clone();
            try {
                hVar.c = (int[]) this.c.clone();
                hVar.d = (Object[]) this.d.clone();
                return hVar;
            } catch (CloneNotSupportedException e2) {
                return hVar;
            }
        } catch (CloneNotSupportedException e3) {
            return null;
        }
    }

    private void d() {
        int i = this.e;
        int[] iArr = this.c;
        Object[] objArr = this.d;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            Object obj = objArr[i3];
            if (obj != a) {
                if (i3 != i2) {
                    iArr[i2] = iArr[i3];
                    objArr[i2] = obj;
                    objArr[i3] = null;
                }
                i2++;
            }
        }
        this.b = false;
        this.e = i2;
    }

    public final int a() {
        if (this.b) {
            d();
        }
        return this.e;
    }

    public final int a(int i) {
        if (this.b) {
            d();
        }
        return this.c[i];
    }

    public final E b(int i) {
        if (this.b) {
            d();
        }
        return this.d[i];
    }

    public final void b() {
        int i = this.e;
        Object[] objArr = this.d;
        for (int i2 = 0; i2 < i; i2++) {
            objArr[i2] = null;
        }
        this.e = 0;
        this.b = false;
    }

    public final String toString() {
        if (a() <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.e * 28);
        sb.append('{');
        for (int i = 0; i < this.e; i++) {
            if (i > 0) {
                sb.append(", ");
            }
            sb.append(a(i));
            sb.append('=');
            Object b2 = b(i);
            if (b2 != this) {
                sb.append(b2);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }
}
