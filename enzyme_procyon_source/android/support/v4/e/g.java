// 
// Decompiled by Procyon v0.5.36
// 

package android.support.v4.e;

import java.util.Map;

public class g<K, V>
{
    static Object[] b;
    static int c;
    static Object[] d;
    static int e;
    int[] f;
    Object[] g;
    int h;
    
    public g() {
        this.f = android.support.v4.e.b.a;
        this.g = android.support.v4.e.b.c;
        this.h = 0;
    }
    
    private int a() {
        final int h = this.h;
        int n;
        if (h == 0) {
            n = -1;
        }
        else {
            int a = android.support.v4.e.b.a(this.f, h, 0);
            if ((n = a) >= 0) {
                n = a;
                if (this.g[a << 1] != null) {
                    int n2;
                    for (n2 = a + 1; n2 < h && this.f[n2] == 0; ++n2) {
                        if (this.g[n2 << 1] == null) {
                            n = n2;
                            return n;
                        }
                    }
                    --a;
                    while (a >= 0 && this.f[a] == 0) {
                        n = a;
                        if (this.g[a << 1] == null) {
                            return n;
                        }
                        --a;
                    }
                    n = ~n2;
                }
            }
        }
        return n;
    }
    
    private int a(final Object o, final int n) {
        final int h = this.h;
        int n2;
        if (h == 0) {
            n2 = -1;
        }
        else {
            int a = android.support.v4.e.b.a(this.f, h, n);
            if ((n2 = a) >= 0) {
                n2 = a;
                if (!o.equals(this.g[a << 1])) {
                    int n3;
                    for (n3 = a + 1; n3 < h && this.f[n3] == n; ++n3) {
                        if (o.equals(this.g[n3 << 1])) {
                            n2 = n3;
                            return n2;
                        }
                    }
                    --a;
                    while (a >= 0 && this.f[a] == n) {
                        n2 = a;
                        if (o.equals(this.g[a << 1])) {
                            return n2;
                        }
                        --a;
                    }
                    n2 = ~n3;
                }
            }
        }
        return n2;
    }
    
    static void a(final int[] array, final Object[] array2, int i) {
        Label_0071: {
            if (array.length != 8) {
                break Label_0071;
            }
            synchronized (a.class) {
                if (g.e < 10) {
                    array2[0] = g.d;
                    array2[1] = array;
                    for (i = (i << 1) - 1; i >= 2; --i) {
                        array2[i] = null;
                    }
                    g.d = array2;
                    ++g.e;
                }
                return;
            }
        }
        if (array.length != 4) {
            return;
        }
        synchronized (a.class) {
            if (g.c < 10) {
                array2[0] = g.b;
                array2[1] = array;
                for (i = (i << 1) - 1; i >= 2; --i) {
                    array2[i] = null;
                }
                g.b = array2;
                ++g.c;
            }
        }
    }
    
    public final int a(final Object o) {
        int n;
        if (o == null) {
            n = this.a();
        }
        else {
            n = this.a(o, o.hashCode());
        }
        return n;
    }
    
    public final V a(int n, final V v) {
        n = (n << 1) + 1;
        final Object o = this.g[n];
        this.g[n] = v;
        return (V)o;
    }
    
    final void a(final int n) {
        while (true) {
            Label_0092: {
                if (n != 8) {
                    break Label_0092;
                }
                synchronized (a.class) {
                    if (android.support.v4.e.g.d != null) {
                        final Object[] d = android.support.v4.e.g.d;
                        this.g = d;
                        android.support.v4.e.g.d = (Object[])d[0];
                        this.f = (int[])d[1];
                        d[0] = (d[1] = null);
                        --android.support.v4.e.g.e;
                    }
                    else {
                        // monitorexit(a.class)
                        this.f = new int[n];
                        this.g = new Object[n << 1];
                    }
                    return;
                }
            }
            if (n == 4) {
                synchronized (a.class) {
                    if (android.support.v4.e.g.b != null) {
                        final Object[] b = android.support.v4.e.g.b;
                        this.g = b;
                        android.support.v4.e.g.b = (Object[])b[0];
                        this.f = (int[])b[1];
                        b[0] = (b[1] = null);
                        --android.support.v4.e.g.c;
                        return;
                    }
                }
                // monitorexit(a.class)
                continue;
            }
            continue;
        }
    }
    
    final int b(final Object o) {
        int i = 1;
        final int n = 1;
        final int n2 = this.h * 2;
        final Object[] g = this.g;
        if (o == null) {
            for (int j = n; j < n2; j += 2) {
                if (g[j] == null) {
                    return j >> 1;
                }
            }
            return -1;
        }
        while (i < n2) {
            if (o.equals(g[i])) {
                return i >> 1;
            }
            i += 2;
        }
        return -1;
        return -1;
    }
    
    public final K b(final int n) {
        return (K)this.g[n << 1];
    }
    
    public final V c(final int n) {
        return (V)this.g[(n << 1) + 1];
    }
    
    public void clear() {
        if (this.h != 0) {
            a(this.f, this.g, this.h);
            this.f = android.support.v4.e.b.a;
            this.g = android.support.v4.e.b.c;
            this.h = 0;
        }
    }
    
    public boolean containsKey(final Object o) {
        return this.a(o) >= 0;
    }
    
    public boolean containsValue(final Object o) {
        return this.b(o) >= 0;
    }
    
    public final V d(final int n) {
        int n2 = 8;
        final Object o = this.g[(n << 1) + 1];
        if (this.h <= 1) {
            a(this.f, this.g, this.h);
            this.f = android.support.v4.e.b.a;
            this.g = android.support.v4.e.b.c;
            this.h = 0;
        }
        else if (this.f.length > 8 && this.h < this.f.length / 3) {
            if (this.h > 8) {
                n2 = this.h + (this.h >> 1);
            }
            final int[] f = this.f;
            final Object[] g = this.g;
            this.a(n2);
            --this.h;
            if (n > 0) {
                System.arraycopy(f, 0, this.f, 0, n);
                System.arraycopy(g, 0, this.g, 0, n << 1);
            }
            if (n < this.h) {
                System.arraycopy(f, n + 1, this.f, n, this.h - n);
                System.arraycopy(g, n + 1 << 1, this.g, n << 1, this.h - n << 1);
            }
        }
        else {
            --this.h;
            if (n < this.h) {
                System.arraycopy(this.f, n + 1, this.f, n, this.h - n);
                System.arraycopy(this.g, n + 1 << 1, this.g, n << 1, this.h - n << 1);
            }
            this.g[this.h << 1] = null;
            this.g[(this.h << 1) + 1] = null;
        }
        return (V)o;
    }
    
    @Override
    public boolean equals(Object value) {
        final boolean b = true;
        boolean b2;
        if (this == value) {
            b2 = b;
        }
        else {
            if (value instanceof Map) {
                final Map map = (Map)value;
                if (this.size() != map.size()) {
                    b2 = false;
                    return b2;
                }
                int n = 0;
                while (true) {
                    b2 = b;
                    try {
                        if (n < this.h) {
                            final K b3 = this.b(n);
                            final V c = this.c(n);
                            value = map.get(b3);
                            if (c == null) {
                                if (value != null || !map.containsKey(b3)) {
                                    b2 = false;
                                    return b2;
                                }
                            }
                            else if (!c.equals(value)) {
                                b2 = false;
                                return b2;
                            }
                            ++n;
                            continue;
                        }
                        return b2;
                    }
                    catch (NullPointerException ex) {
                        b2 = false;
                        return b2;
                    }
                    catch (ClassCastException ex2) {
                        b2 = false;
                        return b2;
                    }
                    break;
                }
            }
            b2 = false;
        }
        return b2;
    }
    
    public V get(Object o) {
        final int a = this.a(o);
        if (a >= 0) {
            o = this.g[(a << 1) + 1];
        }
        else {
            o = null;
        }
        return (V)o;
    }
    
    @Override
    public int hashCode() {
        final int[] f = this.f;
        final Object[] g = this.g;
        final int h = this.h;
        int n = 1;
        int i = 0;
        int n2 = 0;
        while (i < h) {
            final Object o = g[n];
            final int n3 = f[i];
            int hashCode;
            if (o == null) {
                hashCode = 0;
            }
            else {
                hashCode = o.hashCode();
            }
            n2 += (hashCode ^ n3);
            ++i;
            n += 2;
        }
        return n2;
    }
    
    public boolean isEmpty() {
        return this.h <= 0;
    }
    
    public V put(final K k, final V v) {
        final int n = 8;
        int n2;
        int hashCode;
        if (k == null) {
            n2 = this.a();
            hashCode = 0;
        }
        else {
            hashCode = k.hashCode();
            n2 = this.a(k, hashCode);
        }
        Object o;
        if (n2 >= 0) {
            final int n3 = (n2 << 1) + 1;
            o = this.g[n3];
            this.g[n3] = v;
        }
        else {
            final int n4 = ~n2;
            if (this.h >= this.f.length) {
                int n5;
                if (this.h >= 8) {
                    n5 = this.h + (this.h >> 1);
                }
                else {
                    n5 = n;
                    if (this.h < 4) {
                        n5 = 4;
                    }
                }
                final int[] f = this.f;
                final Object[] g = this.g;
                this.a(n5);
                if (this.f.length > 0) {
                    System.arraycopy(f, 0, this.f, 0, f.length);
                    System.arraycopy(g, 0, this.g, 0, g.length);
                }
                a(f, g, this.h);
            }
            if (n4 < this.h) {
                System.arraycopy(this.f, n4, this.f, n4 + 1, this.h - n4);
                System.arraycopy(this.g, n4 << 1, this.g, n4 + 1 << 1, this.h - n4 << 1);
            }
            this.f[n4] = hashCode;
            this.g[n4 << 1] = k;
            this.g[(n4 << 1) + 1] = v;
            ++this.h;
            o = null;
        }
        return (V)o;
    }
    
    public V remove(Object d) {
        final int a = this.a(d);
        if (a >= 0) {
            d = this.d(a);
        }
        else {
            d = null;
        }
        return (V)d;
    }
    
    public int size() {
        return this.h;
    }
    
    @Override
    public String toString() {
        String string;
        if (this.isEmpty()) {
            string = "{}";
        }
        else {
            final StringBuilder sb = new StringBuilder(this.h * 28);
            sb.append('{');
            for (int i = 0; i < this.h; ++i) {
                if (i > 0) {
                    sb.append(", ");
                }
                final K b = this.b(i);
                if (b != this) {
                    sb.append(b);
                }
                else {
                    sb.append("(this Map)");
                }
                sb.append('=');
                final V c = this.c(i);
                if (c != this) {
                    sb.append(c);
                }
                else {
                    sb.append("(this Map)");
                }
            }
            sb.append('}');
            string = sb.toString();
        }
        return string;
    }
}
