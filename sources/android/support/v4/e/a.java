package android.support.v4.e;

import android.support.v4.e.f;
import java.util.Collection;
import java.util.Map;
import java.util.Set;

public class a<K, V> extends g<K, V> implements Map<K, V> {
    f<K, V> a;

    private f<K, V> a() {
        if (this.a == null) {
            this.a = new f<K, V>() {
                /* access modifiers changed from: protected */
                public final int a() {
                    return a.this.h;
                }

                /* access modifiers changed from: protected */
                public final Object a(int i, int i2) {
                    return a.this.g[(i << 1) + i2];
                }

                /* access modifiers changed from: protected */
                public final int a(Object obj) {
                    return a.this.a(obj);
                }

                /* access modifiers changed from: protected */
                public final int b(Object obj) {
                    return a.this.b(obj);
                }

                /* access modifiers changed from: protected */
                public final Map<K, V> b() {
                    return a.this;
                }

                /* access modifiers changed from: protected */
                public final void a(K k, V v) {
                    a.this.put(k, v);
                }

                /* access modifiers changed from: protected */
                public final V a(int i, V v) {
                    return a.this.a(i, v);
                }

                /* access modifiers changed from: protected */
                public final void a(int i) {
                    a.this.d(i);
                }

                /* access modifiers changed from: protected */
                public final void c() {
                    a.this.clear();
                }
            };
        }
        return this.a;
    }

    public void putAll(Map<? extends K, ? extends V> map) {
        int size = this.h + map.size();
        if (this.f.length < size) {
            int[] iArr = this.f;
            Object[] objArr = this.g;
            super.a(size);
            if (this.h > 0) {
                System.arraycopy(iArr, 0, this.f, 0, this.h);
                System.arraycopy(objArr, 0, this.g, 0, this.h << 1);
            }
            g.a(iArr, objArr, this.h);
        }
        for (Map.Entry next : map.entrySet()) {
            put(next.getKey(), next.getValue());
        }
    }

    public Set<Map.Entry<K, V>> entrySet() {
        f a2 = a();
        if (a2.b == null) {
            a2.b = new f.b();
        }
        return a2.b;
    }

    public Set<K> keySet() {
        f a2 = a();
        if (a2.c == null) {
            a2.c = new f.c();
        }
        return a2.c;
    }

    public Collection<V> values() {
        f a2 = a();
        if (a2.d == null) {
            a2.d = new f.e();
        }
        return a2.d;
    }
}
