/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  android.graphics.Rect
 *  android.os.Build$VERSION
 */
package android.support.v4.view.a;

import android.graphics.Rect;
import android.os.Build;

public final class a {
    public static final c a;
    public final Object b;

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    static {
        if (Build.VERSION.SDK_INT >= 21) {
            a = new a();
            return;
        }
        if (Build.VERSION.SDK_INT >= 19) {
            a = new f();
            return;
        }
        if (Build.VERSION.SDK_INT >= 18) {
            a = new e();
            return;
        }
        if (Build.VERSION.SDK_INT >= 16) {
            a = new d();
            return;
        }
        if (Build.VERSION.SDK_INT >= 14) {
            a = new b();
            return;
        }
        a = new g();
    }

    public a(Object object) {
        this.b = object;
    }

    public final void a(int n2) {
        a.a(this.b, n2);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final boolean equals(Object object) {
        boolean bl = true;
        if (this == object) {
            return bl;
        }
        if (object == null) {
            return false;
        }
        if (this.getClass() != object.getClass()) {
            return false;
        }
        object = (a)object;
        if (this.b == null) {
            if (((a)object).b == null) return bl;
            return false;
        }
        if (this.b.equals(((a)object).b)) return bl;
        return false;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final int hashCode() {
        if (this.b != null) return this.b.hashCode();
        return 0;
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     */
    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(super.toString());
        Rect rect = new Rect();
        a.a(this.b, rect);
        stringBuilder.append("; boundsInParent: " + (Object)rect);
        a.b(this.b, rect);
        stringBuilder.append("; boundsInScreen: " + (Object)rect);
        stringBuilder.append("; packageName: ").append(a.d(this.b));
        stringBuilder.append("; className: ").append(a.b(this.b));
        stringBuilder.append("; text: ").append(a.e(this.b));
        stringBuilder.append("; contentDescription: ").append(a.c(this.b));
        stringBuilder.append("; viewId: ").append(a.p(this.b));
        stringBuilder.append("; checkable: ").append(a.f(this.b));
        stringBuilder.append("; checked: ").append(a.g(this.b));
        stringBuilder.append("; focusable: ").append(a.j(this.b));
        stringBuilder.append("; focused: ").append(a.k(this.b));
        stringBuilder.append("; selected: ").append(a.o(this.b));
        stringBuilder.append("; clickable: ").append(a.h(this.b));
        stringBuilder.append("; longClickable: ").append(a.l(this.b));
        stringBuilder.append("; enabled: ").append(a.i(this.b));
        stringBuilder.append("; password: ").append(a.m(this.b));
        stringBuilder.append("; scrollable: " + a.n(this.b));
        stringBuilder.append("; [");
        int n2 = a.a(this.b);
        while (true) {
            void var2_5;
            if (n2 == 0) {
                stringBuilder.append("]");
                return stringBuilder.toString();
            }
            int n3 = 1 << Integer.numberOfTrailingZeros(n2);
            n2 = ~n3 & n2;
            switch (n3) {
                default: {
                    String string = "ACTION_UNKNOWN";
                    break;
                }
                case 1: {
                    String string = "ACTION_FOCUS";
                    break;
                }
                case 2: {
                    String string = "ACTION_CLEAR_FOCUS";
                    break;
                }
                case 4: {
                    String string = "ACTION_SELECT";
                    break;
                }
                case 8: {
                    String string = "ACTION_CLEAR_SELECTION";
                    break;
                }
                case 16: {
                    String string = "ACTION_CLICK";
                    break;
                }
                case 32: {
                    String string = "ACTION_LONG_CLICK";
                    break;
                }
                case 64: {
                    String string = "ACTION_ACCESSIBILITY_FOCUS";
                    break;
                }
                case 128: {
                    String string = "ACTION_CLEAR_ACCESSIBILITY_FOCUS";
                    break;
                }
                case 256: {
                    String string = "ACTION_NEXT_AT_MOVEMENT_GRANULARITY";
                    break;
                }
                case 512: {
                    String string = "ACTION_PREVIOUS_AT_MOVEMENT_GRANULARITY";
                    break;
                }
                case 1024: {
                    String string = "ACTION_NEXT_HTML_ELEMENT";
                    break;
                }
                case 2048: {
                    String string = "ACTION_PREVIOUS_HTML_ELEMENT";
                    break;
                }
                case 4096: {
                    String string = "ACTION_SCROLL_FORWARD";
                    break;
                }
                case 8192: {
                    String string = "ACTION_SCROLL_BACKWARD";
                    break;
                }
                case 65536: {
                    String string = "ACTION_CUT";
                    break;
                }
                case 16384: {
                    String string = "ACTION_COPY";
                    break;
                }
                case 32768: {
                    String string = "ACTION_PASTE";
                    break;
                }
                case 131072: {
                    String string = "ACTION_SET_SELECTION";
                }
            }
            stringBuilder.append((String)var2_5);
            if (n2 == 0) continue;
            stringBuilder.append(", ");
        }
    }

    static final class a
    extends f {
        a() {
        }
    }

    static class b
    extends g {
        b() {
        }

        @Override
        public final int a(Object object) {
            return android.support.v4.view.a.b.a(object);
        }

        @Override
        public final void a(Object object, int n2) {
            android.support.v4.view.a.b.a(object, n2);
        }

        @Override
        public final void a(Object object, Rect rect) {
            android.support.v4.view.a.b.a(object, rect);
        }

        @Override
        public final void a(Object object, CharSequence charSequence) {
            android.support.v4.view.a.b.a(object, charSequence);
        }

        @Override
        public final void a(Object object, boolean bl) {
            android.support.v4.view.a.b.a(object, bl);
        }

        @Override
        public final CharSequence b(Object object) {
            return android.support.v4.view.a.b.b(object);
        }

        @Override
        public final void b(Object object, Rect rect) {
            android.support.v4.view.a.b.b(object, rect);
        }

        @Override
        public final CharSequence c(Object object) {
            return android.support.v4.view.a.b.c(object);
        }

        @Override
        public final CharSequence d(Object object) {
            return android.support.v4.view.a.b.d(object);
        }

        @Override
        public final CharSequence e(Object object) {
            return android.support.v4.view.a.b.e(object);
        }

        @Override
        public final boolean f(Object object) {
            return android.support.v4.view.a.b.f(object);
        }

        @Override
        public final boolean g(Object object) {
            return android.support.v4.view.a.b.g(object);
        }

        @Override
        public final boolean h(Object object) {
            return android.support.v4.view.a.b.h(object);
        }

        @Override
        public final boolean i(Object object) {
            return android.support.v4.view.a.b.i(object);
        }

        @Override
        public final boolean j(Object object) {
            return android.support.v4.view.a.b.j(object);
        }

        @Override
        public final boolean k(Object object) {
            return android.support.v4.view.a.b.k(object);
        }

        @Override
        public final boolean l(Object object) {
            return android.support.v4.view.a.b.l(object);
        }

        @Override
        public final boolean m(Object object) {
            return android.support.v4.view.a.b.m(object);
        }

        @Override
        public final boolean n(Object object) {
            return android.support.v4.view.a.b.n(object);
        }

        @Override
        public final boolean o(Object object) {
            return android.support.v4.view.a.b.o(object);
        }
    }

    public static interface c {
        public int a(Object var1);

        public void a(Object var1, int var2);

        public void a(Object var1, Rect var2);

        public void a(Object var1, CharSequence var2);

        public void a(Object var1, boolean var2);

        public CharSequence b(Object var1);

        public void b(Object var1, Rect var2);

        public CharSequence c(Object var1);

        public CharSequence d(Object var1);

        public CharSequence e(Object var1);

        public boolean f(Object var1);

        public boolean g(Object var1);

        public boolean h(Object var1);

        public boolean i(Object var1);

        public boolean j(Object var1);

        public boolean k(Object var1);

        public boolean l(Object var1);

        public boolean m(Object var1);

        public boolean n(Object var1);

        public boolean o(Object var1);

        public String p(Object var1);
    }

    static class d
    extends b {
        d() {
        }
    }

    static class e
    extends d {
        e() {
        }

        @Override
        public final String p(Object object) {
            return android.support.v4.view.a.c.a(object);
        }
    }

    static class f
    extends e {
        f() {
        }
    }

    static class g
    implements c {
        g() {
        }

        @Override
        public int a(Object object) {
            return 0;
        }

        @Override
        public void a(Object object, int n2) {
        }

        @Override
        public void a(Object object, Rect rect) {
        }

        @Override
        public void a(Object object, CharSequence charSequence) {
        }

        @Override
        public void a(Object object, boolean bl) {
        }

        @Override
        public CharSequence b(Object object) {
            return null;
        }

        @Override
        public void b(Object object, Rect rect) {
        }

        @Override
        public CharSequence c(Object object) {
            return null;
        }

        @Override
        public CharSequence d(Object object) {
            return null;
        }

        @Override
        public CharSequence e(Object object) {
            return null;
        }

        @Override
        public boolean f(Object object) {
            return false;
        }

        @Override
        public boolean g(Object object) {
            return false;
        }

        @Override
        public boolean h(Object object) {
            return false;
        }

        @Override
        public boolean i(Object object) {
            return false;
        }

        @Override
        public boolean j(Object object) {
            return false;
        }

        @Override
        public boolean k(Object object) {
            return false;
        }

        @Override
        public boolean l(Object object) {
            return false;
        }

        @Override
        public boolean m(Object object) {
            return false;
        }

        @Override
        public boolean n(Object object) {
            return false;
        }

        @Override
        public boolean o(Object object) {
            return false;
        }

        @Override
        public String p(Object object) {
            return null;
        }
    }
}

