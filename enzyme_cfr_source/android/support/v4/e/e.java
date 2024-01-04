/*
 * Decompiled with CFR 0.150.
 */
package android.support.v4.e;

import java.util.LinkedHashMap;

public class e<K, V> {
    private final LinkedHashMap<K, V> a = new LinkedHashMap(0, 0.75f, true);
    private int b;
    private int c = 6;
    private int d;
    private int e;
    private int f;
    private int g;

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private void a(int n2) {
        while (true) {
            synchronized (this) {
                Object object;
                StringBuilder stringBuilder;
                if (this.b < 0 || this.a.isEmpty() && this.b != 0) {
                    stringBuilder = new StringBuilder();
                    object = new IllegalStateException(stringBuilder.append(this.getClass().getName()).append(".sizeOf() is reporting inconsistent results!").toString());
                    throw object;
                }
                if (this.b <= n2 || this.a.isEmpty()) {
                    return;
                }
                object = this.a.entrySet().iterator().next();
                stringBuilder = object.getKey();
                object.getValue();
                this.a.remove(stringBuilder);
                --this.b;
                ++this.e;
            }
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final V a(K object) {
        if (object == null) {
            throw new NullPointerException("key == null");
        }
        synchronized (this) {
            object = this.a.get(object);
            if (object != null) {
                ++this.f;
                return (V)object;
            }
            ++this.g;
        }
        object = null;
        return (V)object;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final V a(K object, V v2) {
        if (object == null) {
            throw new NullPointerException("key == null || value == null");
        }
        synchronized (this) {
            ++this.d;
            ++this.b;
            object = this.a.put(object, v2);
            if (object != null) {
                --this.b;
            }
        }
        this.a(this.c);
        return (V)object;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final String toString() {
        int n2 = 0;
        synchronized (this) {
            int n3 = this.f + this.g;
            if (n3 == 0) return String.format("LruCache[maxSize=%d,hits=%d,misses=%d,hitRate=%d%%]", this.c, this.f, this.g, n2);
            n2 = this.f * 100 / n3;
            return String.format("LruCache[maxSize=%d,hits=%d,misses=%d,hitRate=%d%%]", this.c, this.f, this.g, n2);
        }
    }
}

