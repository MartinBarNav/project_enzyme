// 
// Decompiled by Procyon v0.5.36
// 

package android.support.v4.view.a;

import android.graphics.Rect;
import android.os.Build$VERSION;

public final class a
{
    public static final c a;
    public final Object b;
    
    static {
        if (Build$VERSION.SDK_INT >= 21) {
            a = (c)new a();
        }
        else if (Build$VERSION.SDK_INT >= 19) {
            a = (c)new f();
        }
        else if (Build$VERSION.SDK_INT >= 18) {
            a = (c)new e();
        }
        else if (Build$VERSION.SDK_INT >= 16) {
            a = (c)new d();
        }
        else if (Build$VERSION.SDK_INT >= 14) {
            a = (c)new b();
        }
        else {
            a = (c)new g();
        }
    }
    
    public a(final Object b) {
        this.b = b;
    }
    
    public final void a(final int n) {
        android.support.v4.view.a.a.a.a(this.b, n);
    }
    
    @Override
    public final boolean equals(final Object o) {
        boolean b = true;
        if (this != o) {
            if (o == null) {
                b = false;
            }
            else if (this.getClass() != o.getClass()) {
                b = false;
            }
            else {
                final a a = (a)o;
                if (this.b == null) {
                    if (a.b != null) {
                        b = false;
                    }
                }
                else if (!this.b.equals(a.b)) {
                    b = false;
                }
            }
        }
        return b;
    }
    
    @Override
    public final int hashCode() {
        int hashCode;
        if (this.b == null) {
            hashCode = 0;
        }
        else {
            hashCode = this.b.hashCode();
        }
        return hashCode;
    }
    
    @Override
    public final String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        final Rect rect = new Rect();
        android.support.v4.view.a.a.a.a(this.b, rect);
        sb.append("; boundsInParent: " + rect);
        android.support.v4.view.a.a.a.b(this.b, rect);
        sb.append("; boundsInScreen: " + rect);
        sb.append("; packageName: ").append(android.support.v4.view.a.a.a.d(this.b));
        sb.append("; className: ").append(android.support.v4.view.a.a.a.b(this.b));
        sb.append("; text: ").append(android.support.v4.view.a.a.a.e(this.b));
        sb.append("; contentDescription: ").append(android.support.v4.view.a.a.a.c(this.b));
        sb.append("; viewId: ").append(android.support.v4.view.a.a.a.p(this.b));
        sb.append("; checkable: ").append(android.support.v4.view.a.a.a.f(this.b));
        sb.append("; checked: ").append(android.support.v4.view.a.a.a.g(this.b));
        sb.append("; focusable: ").append(android.support.v4.view.a.a.a.j(this.b));
        sb.append("; focused: ").append(android.support.v4.view.a.a.a.k(this.b));
        sb.append("; selected: ").append(android.support.v4.view.a.a.a.o(this.b));
        sb.append("; clickable: ").append(android.support.v4.view.a.a.a.h(this.b));
        sb.append("; longClickable: ").append(android.support.v4.view.a.a.a.l(this.b));
        sb.append("; enabled: ").append(android.support.v4.view.a.a.a.i(this.b));
        sb.append("; password: ").append(android.support.v4.view.a.a.a.m(this.b));
        sb.append("; scrollable: " + android.support.v4.view.a.a.a.n(this.b));
        sb.append("; [");
        int i = android.support.v4.view.a.a.a.a(this.b);
        while (i != 0) {
            final int n = 1 << Integer.numberOfTrailingZeros(i);
            i &= ~n;
            String str = null;
            switch (n) {
                default: {
                    str = "ACTION_UNKNOWN";
                    break;
                }
                case 1: {
                    str = "ACTION_FOCUS";
                    break;
                }
                case 2: {
                    str = "ACTION_CLEAR_FOCUS";
                    break;
                }
                case 4: {
                    str = "ACTION_SELECT";
                    break;
                }
                case 8: {
                    str = "ACTION_CLEAR_SELECTION";
                    break;
                }
                case 16: {
                    str = "ACTION_CLICK";
                    break;
                }
                case 32: {
                    str = "ACTION_LONG_CLICK";
                    break;
                }
                case 64: {
                    str = "ACTION_ACCESSIBILITY_FOCUS";
                    break;
                }
                case 128: {
                    str = "ACTION_CLEAR_ACCESSIBILITY_FOCUS";
                    break;
                }
                case 256: {
                    str = "ACTION_NEXT_AT_MOVEMENT_GRANULARITY";
                    break;
                }
                case 512: {
                    str = "ACTION_PREVIOUS_AT_MOVEMENT_GRANULARITY";
                    break;
                }
                case 1024: {
                    str = "ACTION_NEXT_HTML_ELEMENT";
                    break;
                }
                case 2048: {
                    str = "ACTION_PREVIOUS_HTML_ELEMENT";
                    break;
                }
                case 4096: {
                    str = "ACTION_SCROLL_FORWARD";
                    break;
                }
                case 8192: {
                    str = "ACTION_SCROLL_BACKWARD";
                    break;
                }
                case 65536: {
                    str = "ACTION_CUT";
                    break;
                }
                case 16384: {
                    str = "ACTION_COPY";
                    break;
                }
                case 32768: {
                    str = "ACTION_PASTE";
                    break;
                }
                case 131072: {
                    str = "ACTION_SET_SELECTION";
                    break;
                }
            }
            sb.append(str);
            if (i != 0) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }
    
    static final class a extends f
    {
    }
    
    static class b extends g
    {
        @Override
        public final int a(final Object o) {
            return android.support.v4.view.a.b.a(o);
        }
        
        @Override
        public final void a(final Object o, final int n) {
            android.support.v4.view.a.b.a(o, n);
        }
        
        @Override
        public final void a(final Object o, final Rect rect) {
            android.support.v4.view.a.b.a(o, rect);
        }
        
        @Override
        public final void a(final Object o, final CharSequence charSequence) {
            android.support.v4.view.a.b.a(o, charSequence);
        }
        
        @Override
        public final void a(final Object o, final boolean b) {
            b.a(o, b);
        }
        
        @Override
        public final CharSequence b(final Object o) {
            return android.support.v4.view.a.b.b(o);
        }
        
        @Override
        public final void b(final Object o, final Rect rect) {
            android.support.v4.view.a.b.b(o, rect);
        }
        
        @Override
        public final CharSequence c(final Object o) {
            return android.support.v4.view.a.b.c(o);
        }
        
        @Override
        public final CharSequence d(final Object o) {
            return android.support.v4.view.a.b.d(o);
        }
        
        @Override
        public final CharSequence e(final Object o) {
            return android.support.v4.view.a.b.e(o);
        }
        
        @Override
        public final boolean f(final Object o) {
            return android.support.v4.view.a.b.f(o);
        }
        
        @Override
        public final boolean g(final Object o) {
            return android.support.v4.view.a.b.g(o);
        }
        
        @Override
        public final boolean h(final Object o) {
            return android.support.v4.view.a.b.h(o);
        }
        
        @Override
        public final boolean i(final Object o) {
            return android.support.v4.view.a.b.i(o);
        }
        
        @Override
        public final boolean j(final Object o) {
            return android.support.v4.view.a.b.j(o);
        }
        
        @Override
        public final boolean k(final Object o) {
            return android.support.v4.view.a.b.k(o);
        }
        
        @Override
        public final boolean l(final Object o) {
            return android.support.v4.view.a.b.l(o);
        }
        
        @Override
        public final boolean m(final Object o) {
            return android.support.v4.view.a.b.m(o);
        }
        
        @Override
        public final boolean n(final Object o) {
            return android.support.v4.view.a.b.n(o);
        }
        
        @Override
        public final boolean o(final Object o) {
            return android.support.v4.view.a.b.o(o);
        }
    }
    
    public interface c
    {
        int a(final Object p0);
        
        void a(final Object p0, final int p1);
        
        void a(final Object p0, final Rect p1);
        
        void a(final Object p0, final CharSequence p1);
        
        void a(final Object p0, final boolean p1);
        
        CharSequence b(final Object p0);
        
        void b(final Object p0, final Rect p1);
        
        CharSequence c(final Object p0);
        
        CharSequence d(final Object p0);
        
        CharSequence e(final Object p0);
        
        boolean f(final Object p0);
        
        boolean g(final Object p0);
        
        boolean h(final Object p0);
        
        boolean i(final Object p0);
        
        boolean j(final Object p0);
        
        boolean k(final Object p0);
        
        boolean l(final Object p0);
        
        boolean m(final Object p0);
        
        boolean n(final Object p0);
        
        boolean o(final Object p0);
        
        String p(final Object p0);
    }
    
    static class d extends b
    {
    }
    
    static class e extends d
    {
        @Override
        public final String p(final Object o) {
            return android.support.v4.view.a.c.a(o);
        }
    }
    
    static class f extends e
    {
    }
    
    static class g implements c
    {
        @Override
        public int a(final Object o) {
            return 0;
        }
        
        @Override
        public void a(final Object o, final int n) {
        }
        
        @Override
        public void a(final Object o, final Rect rect) {
        }
        
        @Override
        public void a(final Object o, final CharSequence charSequence) {
        }
        
        @Override
        public void a(final Object o, final boolean b) {
        }
        
        @Override
        public CharSequence b(final Object o) {
            return null;
        }
        
        @Override
        public void b(final Object o, final Rect rect) {
        }
        
        @Override
        public CharSequence c(final Object o) {
            return null;
        }
        
        @Override
        public CharSequence d(final Object o) {
            return null;
        }
        
        @Override
        public CharSequence e(final Object o) {
            return null;
        }
        
        @Override
        public boolean f(final Object o) {
            return false;
        }
        
        @Override
        public boolean g(final Object o) {
            return false;
        }
        
        @Override
        public boolean h(final Object o) {
            return false;
        }
        
        @Override
        public boolean i(final Object o) {
            return false;
        }
        
        @Override
        public boolean j(final Object o) {
            return false;
        }
        
        @Override
        public boolean k(final Object o) {
            return false;
        }
        
        @Override
        public boolean l(final Object o) {
            return false;
        }
        
        @Override
        public boolean m(final Object o) {
            return false;
        }
        
        @Override
        public boolean n(final Object o) {
            return false;
        }
        
        @Override
        public boolean o(final Object o) {
            return false;
        }
        
        @Override
        public String p(final Object o) {
            return null;
        }
    }
}
