package android.support.v4.e;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public abstract class f<K, V> {
    f<K, V>.b b;
    f<K, V>.c c;
    f<K, V>.e d;

    /* access modifiers changed from: protected */
    public abstract int a();

    /* access modifiers changed from: protected */
    public abstract int a(Object obj);

    /* access modifiers changed from: protected */
    public abstract Object a(int i, int i2);

    /* access modifiers changed from: protected */
    public abstract V a(int i, V v);

    /* access modifiers changed from: protected */
    public abstract void a(int i);

    /* access modifiers changed from: protected */
    public abstract void a(K k, V v);

    /* access modifiers changed from: protected */
    public abstract int b(Object obj);

    /* access modifiers changed from: protected */
    public abstract Map<K, V> b();

    /* access modifiers changed from: protected */
    public abstract void c();

    f() {
    }

    final class a<T> implements Iterator<T> {
        final int a;
        int b;
        int c;
        boolean d = false;

        a(int i) {
            this.a = i;
            this.b = f.this.a();
        }

        public final boolean hasNext() {
            return this.c < this.b;
        }

        public final T next() {
            T a2 = f.this.a(this.c, this.a);
            this.c++;
            this.d = true;
            return a2;
        }

        public final void remove() {
            if (!this.d) {
                throw new IllegalStateException();
            }
            this.c--;
            this.b--;
            this.d = false;
            f.this.a(this.c);
        }
    }

    final class d implements Iterator<Map.Entry<K, V>>, Map.Entry<K, V> {
        int a;
        int b;
        boolean c = false;

        d() {
            this.a = f.this.a() - 1;
            this.b = -1;
        }

        public final boolean hasNext() {
            return this.b < this.a;
        }

        public final void remove() {
            if (!this.c) {
                throw new IllegalStateException();
            }
            f.this.a(this.b);
            this.b--;
            this.a--;
            this.c = false;
        }

        public final K getKey() {
            if (this.c) {
                return f.this.a(this.b, 0);
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        public final V getValue() {
            if (this.c) {
                return f.this.a(this.b, 1);
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        public final V setValue(V v) {
            if (this.c) {
                return f.this.a(this.b, v);
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        public final boolean equals(Object obj) {
            if (!this.c) {
                throw new IllegalStateException("This container does not support retaining Map.Entry objects");
            } else if (!(obj instanceof Map.Entry)) {
                return false;
            } else {
                Map.Entry entry = (Map.Entry) obj;
                if (!b.a(entry.getKey(), f.this.a(this.b, 0)) || !b.a(entry.getValue(), f.this.a(this.b, 1))) {
                    return false;
                }
                return true;
            }
        }

        public final int hashCode() {
            int i = 0;
            if (!this.c) {
                throw new IllegalStateException("This container does not support retaining Map.Entry objects");
            }
            Object a2 = f.this.a(this.b, 0);
            Object a3 = f.this.a(this.b, 1);
            int hashCode = a2 == null ? 0 : a2.hashCode();
            if (a3 != null) {
                i = a3.hashCode();
            }
            return i ^ hashCode;
        }

        public final String toString() {
            return getKey() + "=" + getValue();
        }

        public final /* bridge */ /* synthetic */ Object next() {
            this.b++;
            this.c = true;
            return this;
        }
    }

    final class b implements Set<Map.Entry<K, V>> {
        b() {
        }

        public final boolean addAll(Collection<? extends Map.Entry<K, V>> collection) {
            int a2 = f.this.a();
            for (Map.Entry entry : collection) {
                f.this.a(entry.getKey(), entry.getValue());
            }
            return a2 != f.this.a();
        }

        public final void clear() {
            f.this.c();
        }

        public final boolean contains(Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            int a2 = f.this.a(entry.getKey());
            if (a2 >= 0) {
                return b.a(f.this.a(a2, 1), entry.getValue());
            }
            return false;
        }

        public final boolean containsAll(Collection<?> collection) {
            for (Object contains : collection) {
                if (!contains(contains)) {
                    return false;
                }
            }
            return true;
        }

        public final boolean isEmpty() {
            return f.this.a() == 0;
        }

        public final Iterator<Map.Entry<K, V>> iterator() {
            return new d();
        }

        public final boolean remove(Object obj) {
            throw new UnsupportedOperationException();
        }

        public final boolean removeAll(Collection<?> collection) {
            throw new UnsupportedOperationException();
        }

        public final boolean retainAll(Collection<?> collection) {
            throw new UnsupportedOperationException();
        }

        public final int size() {
            return f.this.a();
        }

        public final Object[] toArray() {
            throw new UnsupportedOperationException();
        }

        public final <T> T[] toArray(T[] tArr) {
            throw new UnsupportedOperationException();
        }

        public final boolean equals(Object obj) {
            return f.a(this, obj);
        }

        public final int hashCode() {
            int a2 = f.this.a() - 1;
            int i = 0;
            while (a2 >= 0) {
                Object a3 = f.this.a(a2, 0);
                Object a4 = f.this.a(a2, 1);
                a2--;
                i += (a4 == null ? 0 : a4.hashCode()) ^ (a3 == null ? 0 : a3.hashCode());
            }
            return i;
        }

        public final /* synthetic */ boolean add(Object obj) {
            throw new UnsupportedOperationException();
        }
    }

    final class c implements Set<K> {
        c() {
        }

        public final boolean add(K k) {
            throw new UnsupportedOperationException();
        }

        public final boolean addAll(Collection<? extends K> collection) {
            throw new UnsupportedOperationException();
        }

        public final void clear() {
            f.this.c();
        }

        public final boolean contains(Object obj) {
            return f.this.a(obj) >= 0;
        }

        public final boolean containsAll(Collection<?> collection) {
            Map b = f.this.b();
            for (Object containsKey : collection) {
                if (!b.containsKey(containsKey)) {
                    return false;
                }
            }
            return true;
        }

        public final boolean isEmpty() {
            return f.this.a() == 0;
        }

        public final Iterator<K> iterator() {
            return new a(0);
        }

        public final boolean remove(Object obj) {
            int a2 = f.this.a(obj);
            if (a2 < 0) {
                return false;
            }
            f.this.a(a2);
            return true;
        }

        public final boolean removeAll(Collection<?> collection) {
            Map b = f.this.b();
            int size = b.size();
            for (Object remove : collection) {
                b.remove(remove);
            }
            return size != b.size();
        }

        public final boolean retainAll(Collection<?> collection) {
            return f.a(f.this.b(), collection);
        }

        public final int size() {
            return f.this.a();
        }

        public final Object[] toArray() {
            return f.this.b(0);
        }

        public final <T> T[] toArray(T[] tArr) {
            return f.this.a(tArr, 0);
        }

        public final boolean equals(Object obj) {
            return f.a(this, obj);
        }

        public final int hashCode() {
            int i = 0;
            for (int a2 = f.this.a() - 1; a2 >= 0; a2--) {
                Object a3 = f.this.a(a2, 0);
                i += a3 == null ? 0 : a3.hashCode();
            }
            return i;
        }
    }

    final class e implements Collection<V> {
        e() {
        }

        public final boolean add(V v) {
            throw new UnsupportedOperationException();
        }

        public final boolean addAll(Collection<? extends V> collection) {
            throw new UnsupportedOperationException();
        }

        public final void clear() {
            f.this.c();
        }

        public final boolean contains(Object obj) {
            return f.this.b(obj) >= 0;
        }

        public final boolean containsAll(Collection<?> collection) {
            for (Object contains : collection) {
                if (!contains(contains)) {
                    return false;
                }
            }
            return true;
        }

        public final boolean isEmpty() {
            return f.this.a() == 0;
        }

        public final Iterator<V> iterator() {
            return new a(1);
        }

        public final boolean remove(Object obj) {
            int b = f.this.b(obj);
            if (b < 0) {
                return false;
            }
            f.this.a(b);
            return true;
        }

        public final boolean removeAll(Collection<?> collection) {
            int i = 0;
            int a2 = f.this.a();
            boolean z = false;
            while (i < a2) {
                if (collection.contains(f.this.a(i, 1))) {
                    f.this.a(i);
                    i--;
                    a2--;
                    z = true;
                }
                i++;
            }
            return z;
        }

        public final boolean retainAll(Collection<?> collection) {
            int i = 0;
            int a2 = f.this.a();
            boolean z = false;
            while (i < a2) {
                if (!collection.contains(f.this.a(i, 1))) {
                    f.this.a(i);
                    i--;
                    a2--;
                    z = true;
                }
                i++;
            }
            return z;
        }

        public final int size() {
            return f.this.a();
        }

        public final Object[] toArray() {
            return f.this.b(1);
        }

        public final <T> T[] toArray(T[] tArr) {
            return f.this.a(tArr, 1);
        }
    }

    public static <K, V> boolean a(Map<K, V> map, Collection<?> collection) {
        int size = map.size();
        Iterator<K> it = map.keySet().iterator();
        while (it.hasNext()) {
            if (!collection.contains(it.next())) {
                it.remove();
            }
        }
        return size != map.size();
    }

    public final Object[] b(int i) {
        int a2 = a();
        Object[] objArr = new Object[a2];
        for (int i2 = 0; i2 < a2; i2++) {
            objArr[i2] = a(i2, i);
        }
        return objArr;
    }

    public final <T> T[] a(T[] tArr, int i) {
        T[] tArr2;
        int a2 = a();
        if (tArr.length < a2) {
            tArr2 = (Object[]) Array.newInstance(tArr.getClass().getComponentType(), a2);
        } else {
            tArr2 = tArr;
        }
        for (int i2 = 0; i2 < a2; i2++) {
            tArr2[i2] = a(i2, i);
        }
        if (tArr2.length > a2) {
            tArr2[a2] = null;
        }
        return tArr2;
    }

    public static <T> boolean a(Set<T> set, Object obj) {
        if (set == obj) {
            return true;
        }
        if (!(obj instanceof Set)) {
            return false;
        }
        Set set2 = (Set) obj;
        try {
            if (set.size() != set2.size() || !set.containsAll(set2)) {
                return false;
            }
            return true;
        } catch (NullPointerException e2) {
            return false;
        } catch (ClassCastException e3) {
            return false;
        }
    }
}
