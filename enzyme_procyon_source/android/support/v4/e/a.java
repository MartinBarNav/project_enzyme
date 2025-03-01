// 
// Decompiled by Procyon v0.5.36
// 

package android.support.v4.e;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import java.util.Map;

public class a<K, V> extends g<K, V> implements Map<K, V>
{
    f<K, V> a;
    
    private f<K, V> a() {
        if (this.a == null) {
            this.a = new f<K, V>() {
                @Override
                protected final int a() {
                    return android.support.v4.e.a.this.h;
                }
                
                @Override
                protected final int a(final Object o) {
                    return android.support.v4.e.a.this.a(o);
                }
                
                @Override
                protected final Object a(final int n, final int n2) {
                    return android.support.v4.e.a.this.g[(n << 1) + n2];
                }
                
                @Override
                protected final V a(final int n, final V v) {
                    return android.support.v4.e.a.this.a(n, v);
                }
                
                @Override
                protected final void a(final int n) {
                    android.support.v4.e.a.this.d(n);
                }
                
                @Override
                protected final void a(final K k, final V v) {
                    android.support.v4.e.a.this.put(k, v);
                }
                
                @Override
                protected final int b(final Object o) {
                    return android.support.v4.e.a.this.b(o);
                }
                
                @Override
                protected final Map<K, V> b() {
                    return (Map<K, V>)android.support.v4.e.a.this;
                }
                
                @Override
                protected final void c() {
                    android.support.v4.e.a.this.clear();
                }
            };
        }
        return this.a;
    }
    
    @Override
    public Set<Entry<K, V>> entrySet() {
        final f<K, V> a = this.a();
        if (a.b == null) {
            a.b = a.new b();
        }
        return (Set<Entry<K, V>>)a.b;
    }
    
    @Override
    public Set<K> keySet() {
        final f<K, V> a = this.a();
        if (a.c == null) {
            a.c = a.new c();
        }
        return (Set<K>)a.c;
    }
    
    @Override
    public void putAll(final Map<? extends K, ? extends V> map) {
        final int n = this.h + map.size();
        if (super.f.length < n) {
            final int[] f = super.f;
            final Object[] g = super.g;
            super.a(n);
            if (super.h > 0) {
                System.arraycopy(f, 0, super.f, 0, super.h);
                System.arraycopy(g, 0, super.g, 0, super.h << 1);
            }
            android.support.v4.e.g.a(f, g, super.h);
        }
        for (final Entry<? extends K, ? extends V> entry : map.entrySet()) {
            this.put((K)entry.getKey(), (V)entry.getValue());
        }
    }
    
    @Override
    public Collection<V> values() {
        final f<K, V> a = this.a();
        if (a.d == null) {
            a.d = a.new e();
        }
        return (Collection<V>)a.d;
    }
}
