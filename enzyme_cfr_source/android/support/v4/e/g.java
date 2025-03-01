/*
 * Decompiled with CFR 0.150.
 */
package android.support.v4.e;

import android.support.v4.e.a;
import android.support.v4.e.b;
import java.util.Map;

public class g<K, V> {
    static Object[] b;
    static int c;
    static Object[] d;
    static int e;
    int[] f = android.support.v4.e.b.a;
    Object[] g = android.support.v4.e.b.c;
    int h = 0;

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private int a() {
        int n2;
        int n3;
        int n4 = this.h;
        if (n4 == 0) {
            return -1;
        }
        int n5 = n3 = android.support.v4.e.b.a(this.f, n4, 0);
        if (n3 < 0) return n5;
        n5 = n3;
        if (this.g[n3 << 1] == null) return n5;
        for (n2 = n3 + 1; n2 < n4 && this.f[n2] == 0; ++n2) {
            if (this.g[n2 << 1] != null) continue;
            return n2;
        }
        --n3;
        while (n3 >= 0) {
            if (this.f[n3] != 0) return ~n2;
            n5 = n3;
            if (this.g[n3 << 1] == null) return n5;
            --n3;
        }
        return ~n2;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private int a(Object object, int n2) {
        int n3;
        int n4;
        int n5 = this.h;
        if (n5 == 0) {
            return -1;
        }
        int n6 = n4 = android.support.v4.e.b.a(this.f, n5, n2);
        if (n4 < 0) return n6;
        n6 = n4;
        if (object.equals(this.g[n4 << 1])) return n6;
        for (n3 = n4 + 1; n3 < n5 && this.f[n3] == n2; ++n3) {
            if (!object.equals(this.g[n3 << 1])) continue;
            return n3;
        }
        --n4;
        while (n4 >= 0) {
            if (this.f[n4] != n2) return ~n3;
            n6 = n4;
            if (object.equals(this.g[n4 << 1])) return n6;
            --n4;
        }
        return ~n3;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    static void a(int[] arrn, Object[] arrobject, int n2) {
        if (arrn.length == 8) {
            synchronized (a.class) {
                if (e >= 10) return;
                arrobject[0] = d;
                arrobject[1] = arrn;
                n2 = (n2 << 1) - 1;
                while (true) {
                    if (n2 < 2) {
                        d = arrobject;
                        ++e;
                        return;
                    }
                    arrobject[n2] = null;
                    --n2;
                }
            }
        }
        if (arrn.length != 4) return;
        synchronized (a.class) {
            if (c >= 10) return;
            arrobject[0] = b;
            arrobject[1] = arrn;
            n2 = (n2 << 1) - 1;
            while (true) {
                if (n2 < 2) {
                    b = arrobject;
                    ++c;
                    return;
                }
                arrobject[n2] = null;
                --n2;
            }
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final int a(Object object) {
        if (object != null) return this.a(object, object.hashCode());
        return this.a();
    }

    public final V a(int n2, V v2) {
        n2 = (n2 << 1) + 1;
        Object object = this.g[n2];
        this.g[n2] = v2;
        return (V)object;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    final void a(int n2) {
        if (n2 == 8) {
            synchronized (a.class) {
                if (d != null) {
                    Object[] arrobject = d;
                    this.g = arrobject;
                    d = (Object[])arrobject[0];
                    this.f = (int[])arrobject[1];
                    arrobject[1] = null;
                    arrobject[0] = null;
                    --e;
                    return;
                }
            }
        } else if (n2 == 4) {
            synchronized (a.class) {
                if (b != null) {
                    Object[] arrobject = b;
                    this.g = arrobject;
                    b = (Object[])arrobject[0];
                    this.f = (int[])arrobject[1];
                    arrobject[1] = null;
                    arrobject[0] = null;
                    --c;
                    return;
                }
            }
        }
        this.f = new int[n2];
        this.g = new Object[n2 << 1];
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    final int b(Object var1_1) {
        var2_2 = 1;
        var3_3 = 1;
        var4_4 = this.h * 2;
        var5_5 = this.g;
        if (var1_1 != null) ** GOTO lbl15
        var2_2 = var3_3;
        while (var2_2 < var4_4) {
            if (var5_5[var2_2] == null) {
                var2_2 >>= 1;
                return var2_2;
            }
            var2_2 += 2;
        }
        return -1;
lbl-1000:
        // 1 sources

        {
            var2_2 += 2;
lbl15:
            // 2 sources

            if (var2_2 >= var4_4) return -1;
            ** while (!var1_1.equals((Object)var5_5[var2_2]))
        }
lbl17:
        // 1 sources

        return var2_2 >>= 1;
    }

    public final K b(int n2) {
        return (K)this.g[n2 << 1];
    }

    public final V c(int n2) {
        return (V)this.g[(n2 << 1) + 1];
    }

    public void clear() {
        if (this.h != 0) {
            android.support.v4.e.g.a(this.f, this.g, this.h);
            this.f = android.support.v4.e.b.a;
            this.g = android.support.v4.e.b.c;
            this.h = 0;
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public boolean containsKey(Object object) {
        if (this.a(object) < 0) return false;
        return true;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public boolean containsValue(Object object) {
        if (this.b(object) < 0) return false;
        return true;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final V d(int n2) {
        int n3 = 8;
        Object object = this.g[(n2 << 1) + 1];
        if (this.h <= 1) {
            android.support.v4.e.g.a(this.f, this.g, this.h);
            this.f = android.support.v4.e.b.a;
            this.g = android.support.v4.e.b.c;
            this.h = 0;
            return (V)object;
        }
        if (this.f.length > 8 && this.h < this.f.length / 3) {
            if (this.h > 8) {
                n3 = this.h + (this.h >> 1);
            }
            int[] arrn = this.f;
            Object[] arrobject = this.g;
            this.a(n3);
            --this.h;
            if (n2 > 0) {
                System.arraycopy(arrn, 0, this.f, 0, n2);
                System.arraycopy(arrobject, 0, this.g, 0, n2 << 1);
            }
            if (n2 >= this.h) return (V)object;
            System.arraycopy(arrn, n2 + 1, this.f, n2, this.h - n2);
            System.arraycopy(arrobject, n2 + 1 << 1, this.g, n2 << 1, this.h - n2 << 1);
            return (V)object;
        }
        --this.h;
        if (n2 < this.h) {
            System.arraycopy(this.f, n2 + 1, this.f, n2, this.h - n2);
            System.arraycopy(this.g, n2 + 1 << 1, this.g, n2 << 1, this.h - n2 << 1);
        }
        this.g[this.h << 1] = null;
        this.g[(this.h << 1) + 1] = null;
        return (V)object;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public boolean equals(Object object) {
        boolean bl = true;
        if (this == object) {
            return bl;
        }
        if (!(object instanceof Map)) {
            return false;
        }
        Map map = (Map)object;
        if (this.size() != map.size()) {
            return false;
        }
        int n2 = 0;
        while (true) {
            boolean bl2 = bl;
            try {
                if (n2 >= this.h) return bl2;
                K k2 = this.b(n2);
                V v2 = this.c(n2);
                object = map.get(k2);
                if (v2 == null) {
                    if (object != null) return false;
                    if (!map.containsKey(k2)) {
                        return false;
                    }
                } else {
                    bl2 = v2.equals(object);
                    if (!bl2) {
                        return false;
                    }
                }
                ++n2;
            }
            catch (NullPointerException nullPointerException) {
                return false;
            }
            catch (ClassCastException classCastException) {
                return false;
            }
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public V get(Object object) {
        int n2 = this.a(object);
        if (n2 >= 0) {
            object = this.g[(n2 << 1) + 1];
            return (V)object;
        }
        object = null;
        return (V)object;
    }

    /*
     * Enabled aggressive block sorting
     */
    public int hashCode() {
        int[] arrn = this.f;
        Object[] arrobject = this.g;
        int n2 = this.h;
        int n3 = 1;
        int n4 = 0;
        int n5 = 0;
        while (n4 < n2) {
            Object object = arrobject[n3];
            int n6 = arrn[n4];
            int n7 = object == null ? 0 : object.hashCode();
            n5 += n7 ^ n6;
            ++n4;
            n3 += 2;
        }
        return n5;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public boolean isEmpty() {
        if (this.h > 0) return false;
        return true;
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     */
    public V put(K object, V v2) {
        void var1_3;
        void var2_5;
        int n2;
        int n3;
        int n4 = 8;
        if (object == null) {
            n3 = this.a();
            n2 = 0;
        } else {
            n2 = object.hashCode();
            n3 = this.a(object, n2);
        }
        if (n3 >= 0) {
            n3 = (n3 << 1) + 1;
            Object object2 = this.g[n3];
            this.g[n3] = var2_5;
            return var1_3;
        }
        int n5 = ~n3;
        if (this.h >= this.f.length) {
            if (this.h >= 8) {
                n3 = this.h + (this.h >> 1);
            } else {
                n3 = n4;
                if (this.h < 4) {
                    n3 = 4;
                }
            }
            int[] arrn = this.f;
            Object[] arrobject = this.g;
            this.a(n3);
            if (this.f.length > 0) {
                System.arraycopy(arrn, 0, this.f, 0, arrn.length);
                System.arraycopy(arrobject, 0, this.g, 0, arrobject.length);
            }
            android.support.v4.e.g.a(arrn, arrobject, this.h);
        }
        if (n5 < this.h) {
            System.arraycopy(this.f, n5, this.f, n5 + 1, this.h - n5);
            System.arraycopy(this.g, n5 << 1, this.g, n5 + 1 << 1, this.h - n5 << 1);
        }
        this.f[n5] = n2;
        this.g[n5 << 1] = object;
        this.g[(n5 << 1) + 1] = var2_5;
        ++this.h;
        return var1_3;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public V remove(Object object) {
        int n2 = this.a(object);
        if (n2 >= 0) {
            object = this.d(n2);
            return (V)object;
        }
        object = null;
        return (V)object;
    }

    public int size() {
        return this.h;
    }

    /*
     * Enabled aggressive block sorting
     */
    public String toString() {
        if (this.isEmpty()) {
            return "{}";
        }
        CharSequence charSequence = new StringBuilder(this.h * 28);
        ((StringBuilder)charSequence).append('{');
        int n2 = 0;
        while (true) {
            K k2;
            if (n2 >= this.h) {
                ((StringBuilder)charSequence).append('}');
                return ((StringBuilder)charSequence).toString();
            }
            if (n2 > 0) {
                ((StringBuilder)charSequence).append(", ");
            }
            if ((k2 = this.b(n2)) != this) {
                ((StringBuilder)charSequence).append(k2);
            } else {
                ((StringBuilder)charSequence).append("(this Map)");
            }
            ((StringBuilder)charSequence).append('=');
            V v2 = this.c(n2);
            if (v2 != this) {
                ((StringBuilder)charSequence).append(v2);
            } else {
                ((StringBuilder)charSequence).append("(this Map)");
            }
            ++n2;
        }
    }
}

