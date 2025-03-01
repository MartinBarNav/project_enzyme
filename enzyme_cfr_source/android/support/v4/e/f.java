/*
 * Decompiled with CFR 0.150.
 */
package android.support.v4.e;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public abstract class f<K, V> {
    b b;
    c c;
    e d;

    f() {
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static <K, V> boolean a(Map<K, V> map, Collection<?> collection) {
        int n2 = map.size();
        Iterator<K> iterator = map.keySet().iterator();
        while (iterator.hasNext()) {
            if (collection.contains(iterator.next())) continue;
            iterator.remove();
        }
        if (n2 == map.size()) return false;
        return true;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static <T> boolean a(Set<T> set, Object object) {
        boolean bl = true;
        if (set == object) {
            return bl;
        }
        if (!(object instanceof Set)) return false;
        object = (Set)object;
        try {
            if (set.size() != object.size()) return false;
            boolean bl2 = set.containsAll((Collection<?>)object);
            if (bl2) return bl;
            return false;
        }
        catch (NullPointerException nullPointerException) {
            return false;
        }
        catch (ClassCastException classCastException) {
            return false;
        }
    }

    protected abstract int a();

    protected abstract int a(Object var1);

    protected abstract Object a(int var1, int var2);

    protected abstract V a(int var1, V var2);

    protected abstract void a(int var1);

    protected abstract void a(K var1, V var2);

    public final <T> T[] a(T[] arrobject, int n2) {
        int n3 = this.a();
        if (arrobject.length < n3) {
            arrobject = (Object[])Array.newInstance(arrobject.getClass().getComponentType(), n3);
        }
        for (int i2 = 0; i2 < n3; ++i2) {
            arrobject[i2] = this.a(i2, n2);
        }
        if (arrobject.length > n3) {
            arrobject[n3] = null;
        }
        return arrobject;
    }

    protected abstract int b(Object var1);

    protected abstract Map<K, V> b();

    public final Object[] b(int n2) {
        int n3 = this.a();
        Object[] arrobject = new Object[n3];
        for (int i2 = 0; i2 < n3; ++i2) {
            arrobject[i2] = this.a(i2, n2);
        }
        return arrobject;
    }

    protected abstract void c();

    final class a<T>
    implements Iterator<T> {
        final int a;
        int b;
        int c;
        boolean d = false;

        a(int n2) {
            this.a = n2;
            this.b = f.this.a();
        }

        /*
         * Enabled force condition propagation
         * Lifted jumps to return sites
         */
        @Override
        public final boolean hasNext() {
            if (this.c >= this.b) return false;
            return true;
        }

        @Override
        public final T next() {
            Object object = f.this.a(this.c, this.a);
            ++this.c;
            this.d = true;
            return (T)object;
        }

        @Override
        public final void remove() {
            if (!this.d) {
                throw new IllegalStateException();
            }
            --this.c;
            --this.b;
            this.d = false;
            f.this.a(this.c);
        }
    }

    final class b
    implements Set<Map.Entry<K, V>> {
        b() {
        }

        @Override
        public final /* synthetic */ boolean add(Object object) {
            throw new UnsupportedOperationException();
        }

        /*
         * Enabled force condition propagation
         * Lifted jumps to return sites
         */
        @Override
        public final boolean addAll(Collection<? extends Map.Entry<K, V>> object) {
            int n2 = f.this.a();
            Iterator iterator = object.iterator();
            while (iterator.hasNext()) {
                object = (Map.Entry)iterator.next();
                f.this.a(object.getKey(), object.getValue());
            }
            if (n2 == f.this.a()) return false;
            return true;
        }

        @Override
        public final void clear() {
            f.this.c();
        }

        /*
         * Enabled force condition propagation
         * Lifted jumps to return sites
         */
        @Override
        public final boolean contains(Object object) {
            boolean bl = false;
            if (!(object instanceof Map.Entry)) {
                return bl;
            }
            int n2 = f.this.a((object = (Map.Entry)object).getKey());
            if (n2 < 0) return bl;
            return android.support.v4.e.b.a(f.this.a(n2, 1), object.getValue());
        }

        /*
         * Enabled force condition propagation
         * Lifted jumps to return sites
         */
        @Override
        public final boolean containsAll(Collection<?> iterator) {
            iterator = iterator.iterator();
            do {
                if (!iterator.hasNext()) return true;
            } while (this.contains(iterator.next()));
            return false;
        }

        @Override
        public final boolean equals(Object object) {
            return f.a(this, object);
        }

        /*
         * Enabled aggressive block sorting
         */
        @Override
        public final int hashCode() {
            int n2 = f.this.a() - 1;
            int n3 = 0;
            while (n2 >= 0) {
                Object object = f.this.a(n2, 0);
                Object object2 = f.this.a(n2, 1);
                int n4 = object == null ? 0 : object.hashCode();
                int n5 = object2 == null ? 0 : object2.hashCode();
                --n2;
                n3 += n5 ^ n4;
            }
            return n3;
        }

        /*
         * Enabled force condition propagation
         * Lifted jumps to return sites
         */
        @Override
        public final boolean isEmpty() {
            if (f.this.a() != 0) return false;
            return true;
        }

        @Override
        public final Iterator<Map.Entry<K, V>> iterator() {
            return new d();
        }

        @Override
        public final boolean remove(Object object) {
            throw new UnsupportedOperationException();
        }

        @Override
        public final boolean removeAll(Collection<?> collection) {
            throw new UnsupportedOperationException();
        }

        @Override
        public final boolean retainAll(Collection<?> collection) {
            throw new UnsupportedOperationException();
        }

        @Override
        public final int size() {
            return f.this.a();
        }

        @Override
        public final Object[] toArray() {
            throw new UnsupportedOperationException();
        }

        @Override
        public final <T> T[] toArray(T[] arrT) {
            throw new UnsupportedOperationException();
        }
    }

    final class c
    implements Set<K> {
        c() {
        }

        @Override
        public final boolean add(K k2) {
            throw new UnsupportedOperationException();
        }

        @Override
        public final boolean addAll(Collection<? extends K> collection) {
            throw new UnsupportedOperationException();
        }

        @Override
        public final void clear() {
            f.this.c();
        }

        /*
         * Enabled force condition propagation
         * Lifted jumps to return sites
         */
        @Override
        public final boolean contains(Object object) {
            if (f.this.a(object) < 0) return false;
            return true;
        }

        /*
         * Enabled force condition propagation
         * Lifted jumps to return sites
         */
        @Override
        public final boolean containsAll(Collection<?> iterator) {
            Map map = f.this.b();
            iterator = iterator.iterator();
            do {
                if (!iterator.hasNext()) return true;
            } while (map.containsKey(iterator.next()));
            return false;
        }

        @Override
        public final boolean equals(Object object) {
            return f.a(this, object);
        }

        /*
         * Enabled aggressive block sorting
         */
        @Override
        public final int hashCode() {
            int n2 = f.this.a() - 1;
            int n3 = 0;
            while (n2 >= 0) {
                Object object = f.this.a(n2, 0);
                int n4 = object == null ? 0 : object.hashCode();
                n3 += n4;
                --n2;
            }
            return n3;
        }

        /*
         * Enabled force condition propagation
         * Lifted jumps to return sites
         */
        @Override
        public final boolean isEmpty() {
            if (f.this.a() != 0) return false;
            return true;
        }

        @Override
        public final Iterator<K> iterator() {
            return new a(0);
        }

        /*
         * Enabled force condition propagation
         * Lifted jumps to return sites
         */
        @Override
        public final boolean remove(Object object) {
            int n2 = f.this.a(object);
            if (n2 < 0) return false;
            f.this.a(n2);
            return true;
        }

        /*
         * Enabled force condition propagation
         * Lifted jumps to return sites
         */
        @Override
        public final boolean removeAll(Collection<?> iterator) {
            Map map = f.this.b();
            int n2 = map.size();
            iterator = iterator.iterator();
            while (iterator.hasNext()) {
                map.remove(iterator.next());
            }
            if (n2 == map.size()) return false;
            return true;
        }

        @Override
        public final boolean retainAll(Collection<?> collection) {
            return f.a(f.this.b(), collection);
        }

        @Override
        public final int size() {
            return f.this.a();
        }

        @Override
        public final Object[] toArray() {
            return f.this.b(0);
        }

        @Override
        public final <T> T[] toArray(T[] arrT) {
            return f.this.a(arrT, 0);
        }
    }

    final class d
    implements Iterator<Map.Entry<K, V>>,
    Map.Entry<K, V> {
        int a;
        int b;
        boolean c = false;

        d() {
            this.a = f.this.a() - 1;
            this.b = -1;
        }

        /*
         * Enabled force condition propagation
         * Lifted jumps to return sites
         */
        @Override
        public final boolean equals(Object object) {
            boolean bl = false;
            if (!this.c) {
                throw new IllegalStateException("This container does not support retaining Map.Entry objects");
            }
            if (!(object instanceof Map.Entry)) {
                return bl;
            }
            object = (Map.Entry)object;
            boolean bl2 = bl;
            if (!android.support.v4.e.b.a(object.getKey(), f.this.a(this.b, 0))) return bl2;
            bl2 = bl;
            if (!android.support.v4.e.b.a(object.getValue(), f.this.a(this.b, 1))) return bl2;
            return true;
        }

        @Override
        public final K getKey() {
            if (!this.c) {
                throw new IllegalStateException("This container does not support retaining Map.Entry objects");
            }
            return f.this.a(this.b, 0);
        }

        @Override
        public final V getValue() {
            if (!this.c) {
                throw new IllegalStateException("This container does not support retaining Map.Entry objects");
            }
            return f.this.a(this.b, 1);
        }

        /*
         * Enabled force condition propagation
         * Lifted jumps to return sites
         */
        @Override
        public final boolean hasNext() {
            if (this.b >= this.a) return false;
            return true;
        }

        /*
         * Enabled aggressive block sorting
         */
        @Override
        public final int hashCode() {
            int n2 = 0;
            if (!this.c) {
                throw new IllegalStateException("This container does not support retaining Map.Entry objects");
            }
            Object object = f.this.a(this.b, 0);
            Object object2 = f.this.a(this.b, 1);
            int n3 = object == null ? 0 : object.hashCode();
            if (object2 == null) {
                return n2 ^ n3;
            }
            n2 = object2.hashCode();
            return n2 ^ n3;
        }

        @Override
        public final void remove() {
            if (!this.c) {
                throw new IllegalStateException();
            }
            f.this.a(this.b);
            --this.b;
            --this.a;
            this.c = false;
        }

        @Override
        public final V setValue(V v2) {
            if (!this.c) {
                throw new IllegalStateException("This container does not support retaining Map.Entry objects");
            }
            return f.this.a(this.b, v2);
        }

        public final String toString() {
            return this.getKey() + "=" + this.getValue();
        }
    }

    final class e
    implements Collection<V> {
        e() {
        }

        @Override
        public final boolean add(V v2) {
            throw new UnsupportedOperationException();
        }

        @Override
        public final boolean addAll(Collection<? extends V> collection) {
            throw new UnsupportedOperationException();
        }

        @Override
        public final void clear() {
            f.this.c();
        }

        /*
         * Enabled force condition propagation
         * Lifted jumps to return sites
         */
        @Override
        public final boolean contains(Object object) {
            if (f.this.b(object) < 0) return false;
            return true;
        }

        /*
         * Enabled force condition propagation
         * Lifted jumps to return sites
         */
        @Override
        public final boolean containsAll(Collection<?> iterator) {
            iterator = iterator.iterator();
            do {
                if (!iterator.hasNext()) return true;
            } while (this.contains(iterator.next()));
            return false;
        }

        /*
         * Enabled force condition propagation
         * Lifted jumps to return sites
         */
        @Override
        public final boolean isEmpty() {
            if (f.this.a() != 0) return false;
            return true;
        }

        @Override
        public final Iterator<V> iterator() {
            return new a(1);
        }

        /*
         * Enabled force condition propagation
         * Lifted jumps to return sites
         */
        @Override
        public final boolean remove(Object object) {
            int n2 = f.this.b(object);
            if (n2 < 0) return false;
            f.this.a(n2);
            return true;
        }

        @Override
        public final boolean removeAll(Collection<?> collection) {
            int n2 = 0;
            int n3 = f.this.a();
            boolean bl = false;
            while (n2 < n3) {
                int n4 = n2;
                int n5 = n3;
                if (collection.contains(f.this.a(n2, 1))) {
                    f.this.a(n2);
                    n4 = n2 - 1;
                    n5 = n3 - 1;
                    bl = true;
                }
                n2 = n4 + 1;
                n3 = n5;
            }
            return bl;
        }

        @Override
        public final boolean retainAll(Collection<?> collection) {
            int n2 = 0;
            int n3 = f.this.a();
            boolean bl = false;
            while (n2 < n3) {
                int n4 = n2;
                int n5 = n3;
                if (!collection.contains(f.this.a(n2, 1))) {
                    f.this.a(n2);
                    n4 = n2 - 1;
                    n5 = n3 - 1;
                    bl = true;
                }
                n2 = n4 + 1;
                n3 = n5;
            }
            return bl;
        }

        @Override
        public final int size() {
            return f.this.a();
        }

        @Override
        public final Object[] toArray() {
            return f.this.b(1);
        }

        @Override
        public final <T> T[] toArray(T[] arrT) {
            return f.this.a(arrT, 1);
        }
    }
}

