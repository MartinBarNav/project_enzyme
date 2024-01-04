// 
// Decompiled by Procyon v0.5.36
// 

package android.support.v4.e;

import java.util.Map;
import java.util.LinkedHashMap;

public class e<K, V>
{
    private final LinkedHashMap<K, V> a;
    private int b;
    private int c;
    private int d;
    private int e;
    private int f;
    private int g;
    
    public e() {
        this.c = 6;
        this.a = new LinkedHashMap<K, V>(0, 0.75f, true);
    }
    
    private void a(final int n) {
        while (true) {
            synchronized (this) {
                if (this.b < 0 || (this.a.isEmpty() && this.b != 0)) {
                    throw new IllegalStateException(this.getClass().getName() + ".sizeOf() is reporting inconsistent results!");
                }
            }
            if (this.b <= n || this.a.isEmpty()) {
                break;
            }
            final Map.Entry<K, V> entry = this.a.entrySet().iterator().next();
            final K key = entry.getKey();
            entry.getValue();
            this.a.remove(key);
            --this.b;
            ++this.e;
        }
        // monitorexit(this)
    }
    // monitorexit(this)
    
    public final V a(final K key) {
        if (key == null) {
            throw new NullPointerException("key == null");
        }
        synchronized (this) {
            V value = this.a.get(key);
            if (value != null) {
                ++this.f;
            }
            else {
                ++this.g;
                // monitorexit(this)
                value = null;
            }
            return value;
        }
    }
    
    public final V a(final K key, final V value) {
        if (key == null) {
            throw new NullPointerException("key == null || value == null");
        }
        synchronized (this) {
            ++this.d;
            ++this.b;
            final V put = this.a.put(key, value);
            if (put != null) {
                --this.b;
            }
            // monitorexit(this)
            this.a(this.c);
            return put;
        }
    }
    
    @Override
    public final String toString() {
        int i = 0;
        synchronized (this) {
            final int n = this.f + this.g;
            if (n != 0) {
                i = this.f * 100 / n;
            }
            return String.format("LruCache[maxSize=%d,hits=%d,misses=%d,hitRate=%d%%]", this.c, this.f, this.g, i);
        }
    }
}
