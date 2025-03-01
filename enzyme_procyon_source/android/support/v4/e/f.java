// 
// Decompiled by Procyon v0.5.36
// 

package android.support.v4.e;

import java.lang.reflect.Array;
import java.util.Set;
import java.util.Iterator;
import java.util.Collection;
import java.util.Map;

public abstract class f<K, V>
{
    b b;
    c c;
    e d;
    
    f() {
    }
    
    public static <K, V> boolean a(final Map<K, V> map, final Collection<?> collection) {
        final int size = map.size();
        final Iterator<K> iterator = map.keySet().iterator();
        while (iterator.hasNext()) {
            if (!collection.contains(iterator.next())) {
                iterator.remove();
            }
        }
        return size != map.size();
    }
    
    public static <T> boolean a(final Set<T> set, final Object o) {
        boolean b = true;
        if (set != o) {
            if (o instanceof Set) {
                final Set set2 = (Set)o;
                try {
                    if (set.size() != set2.size() || !set.containsAll(set2)) {
                        b = false;
                    }
                }
                catch (NullPointerException ex) {
                    b = false;
                }
                catch (ClassCastException ex2) {
                    b = false;
                }
            }
            else {
                b = false;
            }
        }
        return b;
    }
    
    protected abstract int a();
    
    protected abstract int a(final Object p0);
    
    protected abstract Object a(final int p0, final int p1);
    
    protected abstract V a(final int p0, final V p1);
    
    protected abstract void a(final int p0);
    
    protected abstract void a(final K p0, final V p1);
    
    public final <T> T[] a(T[] array, final int n) {
        final int a = this.a();
        if (array.length < a) {
            array = (T[])Array.newInstance(array.getClass().getComponentType(), a);
        }
        for (int i = 0; i < a; ++i) {
            array[i] = (T)this.a(i, n);
        }
        if (array.length > a) {
            array[a] = null;
        }
        return array;
    }
    
    protected abstract int b(final Object p0);
    
    protected abstract Map<K, V> b();
    
    public final Object[] b(final int n) {
        final int a = this.a();
        final Object[] array = new Object[a];
        for (int i = 0; i < a; ++i) {
            array[i] = this.a(i, n);
        }
        return array;
    }
    
    protected abstract void c();
    
    final class a<T> implements Iterator<T>
    {
        final int a;
        int b;
        int c;
        boolean d;
        
        a(final int a) {
            this.d = false;
            this.a = a;
            this.b = f.this.a();
        }
        
        @Override
        public final boolean hasNext() {
            return this.c < this.b;
        }
        
        @Override
        public final T next() {
            final Object a = f.this.a(this.c, this.a);
            ++this.c;
            this.d = true;
            return (T)a;
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
    
    final class b implements Set<Map.Entry<K, V>>
    {
        @Override
        public final boolean addAll(final Collection<? extends Map.Entry<K, V>> collection) {
            final int a = f.this.a();
            for (final Map.Entry<K, V> entry : collection) {
                f.this.a(entry.getKey(), entry.getValue());
            }
            return a != f.this.a();
        }
        
        @Override
        public final void clear() {
            f.this.c();
        }
        
        @Override
        public final boolean contains(final Object o) {
            boolean a = false;
            if (o instanceof Map.Entry) {
                final Map.Entry entry = (Map.Entry)o;
                final int a2 = f.this.a(entry.getKey());
                if (a2 >= 0) {
                    a = android.support.v4.e.b.a(f.this.a(a2, 1), entry.getValue());
                }
            }
            return a;
        }
        
        @Override
        public final boolean containsAll(final Collection<?> collection) {
            final Iterator<?> iterator = collection.iterator();
            while (iterator.hasNext()) {
                if (!this.contains(iterator.next())) {
                    return false;
                }
            }
            return true;
        }
        
        @Override
        public final boolean equals(final Object o) {
            return f.a((Set<Object>)this, o);
        }
        
        @Override
        public final int hashCode() {
            int i;
            int n;
            int hashCode;
            int hashCode2;
            for (i = f.this.a() - 1, n = 0; i >= 0; --i, n += (hashCode2 ^ hashCode)) {
                final Object a = f.this.a(i, 0);
                final Object a2 = f.this.a(i, 1);
                if (a == null) {
                    hashCode = 0;
                }
                else {
                    hashCode = a.hashCode();
                }
                if (a2 == null) {
                    hashCode2 = 0;
                }
                else {
                    hashCode2 = a2.hashCode();
                }
            }
            return n;
        }
        
        @Override
        public final boolean isEmpty() {
            return f.this.a() == 0;
        }
        
        @Override
        public final Iterator<Map.Entry<K, V>> iterator() {
            return new d();
        }
        
        @Override
        public final boolean remove(final Object o) {
            throw new UnsupportedOperationException();
        }
        
        @Override
        public final boolean removeAll(final Collection<?> collection) {
            throw new UnsupportedOperationException();
        }
        
        @Override
        public final boolean retainAll(final Collection<?> collection) {
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
        public final <T> T[] toArray(final T[] array) {
            throw new UnsupportedOperationException();
        }
    }
    
    final class c implements Set<K>
    {
        @Override
        public final boolean add(final K k) {
            throw new UnsupportedOperationException();
        }
        
        @Override
        public final boolean addAll(final Collection<? extends K> collection) {
            throw new UnsupportedOperationException();
        }
        
        @Override
        public final void clear() {
            f.this.c();
        }
        
        @Override
        public final boolean contains(final Object o) {
            return f.this.a(o) >= 0;
        }
        
        @Override
        public final boolean containsAll(final Collection<?> collection) {
            final Map<K, V> b = f.this.b();
            final Iterator<?> iterator = collection.iterator();
            while (iterator.hasNext()) {
                if (!b.containsKey(iterator.next())) {
                    return false;
                }
            }
            return true;
        }
        
        @Override
        public final boolean equals(final Object o) {
            return f.a((Set<Object>)this, o);
        }
        
        @Override
        public final int hashCode() {
            int i = f.this.a() - 1;
            int n = 0;
            while (i >= 0) {
                final Object a = f.this.a(i, 0);
                int hashCode;
                if (a == null) {
                    hashCode = 0;
                }
                else {
                    hashCode = a.hashCode();
                }
                n += hashCode;
                --i;
            }
            return n;
        }
        
        @Override
        public final boolean isEmpty() {
            return f.this.a() == 0;
        }
        
        @Override
        public final Iterator<K> iterator() {
            return new a<K>(0);
        }
        
        @Override
        public final boolean remove(final Object o) {
            final int a = f.this.a(o);
            boolean b;
            if (a >= 0) {
                f.this.a(a);
                b = true;
            }
            else {
                b = false;
            }
            return b;
        }
        
        @Override
        public final boolean removeAll(final Collection<?> collection) {
            final Map<K, V> b = f.this.b();
            final int size = b.size();
            final Iterator<?> iterator = collection.iterator();
            while (iterator.hasNext()) {
                b.remove(iterator.next());
            }
            return size != b.size();
        }
        
        @Override
        public final boolean retainAll(final Collection<?> collection) {
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
        public final <T> T[] toArray(final T[] array) {
            return f.this.a(array, 0);
        }
    }
    
    final class d implements Iterator<Entry<K, V>>, Entry<K, V>
    {
        int a;
        int b;
        boolean c;
        
        d() {
            this.c = false;
            this.a = f.this.a() - 1;
            this.b = -1;
        }
        
        @Override
        public final boolean equals(final Object o) {
            final boolean b = false;
            if (!this.c) {
                throw new IllegalStateException("This container does not support retaining Map.Entry objects");
            }
            boolean b2;
            if (!(o instanceof Entry)) {
                b2 = b;
            }
            else {
                final Entry entry = (Entry)o;
                b2 = b;
                if (android.support.v4.e.b.a(entry.getKey(), f.this.a(this.b, 0))) {
                    b2 = b;
                    if (android.support.v4.e.b.a(entry.getValue(), f.this.a(this.b, 1))) {
                        b2 = true;
                    }
                }
            }
            return b2;
        }
        
        @Override
        public final K getKey() {
            if (!this.c) {
                throw new IllegalStateException("This container does not support retaining Map.Entry objects");
            }
            return (K)f.this.a(this.b, 0);
        }
        
        @Override
        public final V getValue() {
            if (!this.c) {
                throw new IllegalStateException("This container does not support retaining Map.Entry objects");
            }
            return (V)f.this.a(this.b, 1);
        }
        
        @Override
        public final boolean hasNext() {
            return this.b < this.a;
        }
        
        @Override
        public final int hashCode() {
            int hashCode = 0;
            if (!this.c) {
                throw new IllegalStateException("This container does not support retaining Map.Entry objects");
            }
            final Object a = f.this.a(this.b, 0);
            final Object a2 = f.this.a(this.b, 1);
            int hashCode2;
            if (a == null) {
                hashCode2 = 0;
            }
            else {
                hashCode2 = a.hashCode();
            }
            if (a2 != null) {
                hashCode = a2.hashCode();
            }
            return hashCode ^ hashCode2;
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
        public final V setValue(final V v) {
            if (!this.c) {
                throw new IllegalStateException("This container does not support retaining Map.Entry objects");
            }
            return f.this.a(this.b, v);
        }
        
        @Override
        public final String toString() {
            return this.getKey() + "=" + this.getValue();
        }
    }
    
    final class e implements Collection<V>
    {
        @Override
        public final boolean add(final V v) {
            throw new UnsupportedOperationException();
        }
        
        @Override
        public final boolean addAll(final Collection<? extends V> collection) {
            throw new UnsupportedOperationException();
        }
        
        @Override
        public final void clear() {
            f.this.c();
        }
        
        @Override
        public final boolean contains(final Object o) {
            return f.this.b(o) >= 0;
        }
        
        @Override
        public final boolean containsAll(final Collection<?> collection) {
            final Iterator<?> iterator = collection.iterator();
            while (iterator.hasNext()) {
                if (!this.contains(iterator.next())) {
                    return false;
                }
            }
            return true;
        }
        
        @Override
        public final boolean isEmpty() {
            return f.this.a() == 0;
        }
        
        @Override
        public final Iterator<V> iterator() {
            return new a<V>(1);
        }
        
        @Override
        public final boolean remove(final Object o) {
            final int b = f.this.b(o);
            boolean b2;
            if (b >= 0) {
                f.this.a(b);
                b2 = true;
            }
            else {
                b2 = false;
            }
            return b2;
        }
        
        @Override
        public final boolean removeAll(final Collection<?> collection) {
            int i = 0;
            int a = f.this.a();
            boolean b = false;
            while (i < a) {
                int n = i;
                int n2 = a;
                if (collection.contains(f.this.a(i, 1))) {
                    f.this.a(i);
                    n = i - 1;
                    n2 = a - 1;
                    b = true;
                }
                i = n + 1;
                a = n2;
            }
            return b;
        }
        
        @Override
        public final boolean retainAll(final Collection<?> collection) {
            int i = 0;
            int a = f.this.a();
            boolean b = false;
            while (i < a) {
                int n = i;
                int n2 = a;
                if (!collection.contains(f.this.a(i, 1))) {
                    f.this.a(i);
                    n = i - 1;
                    n2 = a - 1;
                    b = true;
                }
                i = n + 1;
                a = n2;
            }
            return b;
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
        public final <T> T[] toArray(final T[] array) {
            return f.this.a(array, 1);
        }
    }
}
