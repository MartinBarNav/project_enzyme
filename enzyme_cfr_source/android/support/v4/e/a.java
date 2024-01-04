/*
 * Decompiled with CFR 0.150.
 */
package android.support.v4.e;

import android.support.v4.e.f;
import android.support.v4.e.g;
import java.util.Collection;
import java.util.Map;
import java.util.Set;

public class a<K, V>
extends g<K, V>
implements Map<K, V> {
    f<K, V> a;

    private f<K, V> a() {
        if (this.a == null) {
            this.a = new f<K, V>(){

                @Override
                protected final int a() {
                    return a.this.h;
                }

                @Override
                protected final int a(Object object) {
                    return a.this.a(object);
                }

                @Override
                protected final Object a(int n2, int n3) {
                    return a.this.g[(n2 << 1) + n3];
                }

                @Override
                protected final V a(int n2, V v2) {
                    return a.this.a(n2, v2);
                }

                @Override
                protected final void a(int n2) {
                    a.this.d(n2);
                }

                @Override
                protected final void a(K k2, V v2) {
                    a.this.put(k2, v2);
                }

                @Override
                protected final int b(Object object) {
                    return a.this.b(object);
                }

                @Override
                protected final Map<K, V> b() {
                    return a.this;
                }

                @Override
                protected final void c() {
                    a.this.clear();
                }
            };
        }
        return this.a;
    }

    @Override
    public Set<Map.Entry<K, V>> entrySet() {
        f<K, V> f2 = this.a();
        if (f2.b == null) {
            f2.b = f2.new f.b();
        }
        return f2.b;
    }

    @Override
    public Set<K> keySet() {
        f<K, V> f2 = this.a();
        if (f2.c == null) {
            f2.c = f2.new f.c();
        }
        return f2.c;
    }

    @Override
    public void putAll(Map<? extends K, ? extends V> object) {
        int n2 = this.h + object.size();
        if (this.f.length < n2) {
            int[] arrn = this.f;
            Object[] object2 = this.g;
            super.a(n2);
            if (this.h > 0) {
                System.arraycopy(arrn, 0, this.f, 0, this.h);
                System.arraycopy(object2, 0, this.g, 0, this.h << 1);
            }
            android.support.v4.e.g.a(arrn, object2, this.h);
        }
        for (Map.Entry entry : object.entrySet()) {
            this.put(entry.getKey(), entry.getValue());
        }
    }

    @Override
    public Collection<V> values() {
        f<K, V> f2 = this.a();
        if (f2.d == null) {
            f2.d = f2.new f.e();
        }
        return f2.d;
    }
}

