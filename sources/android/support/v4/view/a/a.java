package android.support.v4.view.a;

import android.graphics.Rect;
import android.os.Build;
import android.support.v7.b.a;

public final class a {
    public static final c a;
    public final Object b;

    interface c {
        int a(Object obj);

        void a(Object obj, int i);

        void a(Object obj, Rect rect);

        void a(Object obj, CharSequence charSequence);

        void a(Object obj, boolean z);

        CharSequence b(Object obj);

        void b(Object obj, Rect rect);

        CharSequence c(Object obj);

        CharSequence d(Object obj);

        CharSequence e(Object obj);

        boolean f(Object obj);

        boolean g(Object obj);

        boolean h(Object obj);

        boolean i(Object obj);

        boolean j(Object obj);

        boolean k(Object obj);

        boolean l(Object obj);

        boolean m(Object obj);

        boolean n(Object obj);

        boolean o(Object obj);

        String p(Object obj);
    }

    static class g implements c {
        g() {
        }

        public void a(Object obj, int i) {
        }

        public int a(Object obj) {
            return 0;
        }

        public void a(Object obj, Rect rect) {
        }

        public void b(Object obj, Rect rect) {
        }

        public CharSequence b(Object obj) {
            return null;
        }

        public CharSequence c(Object obj) {
            return null;
        }

        public CharSequence d(Object obj) {
            return null;
        }

        public CharSequence e(Object obj) {
            return null;
        }

        public boolean f(Object obj) {
            return false;
        }

        public boolean g(Object obj) {
            return false;
        }

        public boolean h(Object obj) {
            return false;
        }

        public boolean i(Object obj) {
            return false;
        }

        public boolean j(Object obj) {
            return false;
        }

        public boolean k(Object obj) {
            return false;
        }

        public boolean l(Object obj) {
            return false;
        }

        public boolean m(Object obj) {
            return false;
        }

        public boolean n(Object obj) {
            return false;
        }

        public boolean o(Object obj) {
            return false;
        }

        public void a(Object obj, CharSequence charSequence) {
        }

        public void a(Object obj, boolean z) {
        }

        public String p(Object obj) {
            return null;
        }
    }

    static class b extends g {
        b() {
        }

        public final void a(Object obj, int i) {
            b.a(obj, i);
        }

        public final int a(Object obj) {
            return b.a(obj);
        }

        public final void a(Object obj, Rect rect) {
            b.a(obj, rect);
        }

        public final void b(Object obj, Rect rect) {
            b.b(obj, rect);
        }

        public final CharSequence b(Object obj) {
            return b.b(obj);
        }

        public final CharSequence c(Object obj) {
            return b.c(obj);
        }

        public final CharSequence d(Object obj) {
            return b.d(obj);
        }

        public final CharSequence e(Object obj) {
            return b.e(obj);
        }

        public final boolean f(Object obj) {
            return b.f(obj);
        }

        public final boolean g(Object obj) {
            return b.g(obj);
        }

        public final boolean h(Object obj) {
            return b.h(obj);
        }

        public final boolean i(Object obj) {
            return b.i(obj);
        }

        public final boolean j(Object obj) {
            return b.j(obj);
        }

        public final boolean k(Object obj) {
            return b.k(obj);
        }

        public final boolean l(Object obj) {
            return b.l(obj);
        }

        public final boolean m(Object obj) {
            return b.m(obj);
        }

        public final boolean n(Object obj) {
            return b.n(obj);
        }

        public final boolean o(Object obj) {
            return b.o(obj);
        }

        public final void a(Object obj, CharSequence charSequence) {
            b.a(obj, charSequence);
        }

        public final void a(Object obj, boolean z) {
            b.a(obj, z);
        }
    }

    static class d extends b {
        d() {
        }
    }

    static class e extends d {
        e() {
        }

        public final String p(Object obj) {
            return c.a(obj);
        }
    }

    static class f extends e {
        f() {
        }
    }

    /* renamed from: android.support.v4.view.a.a$a  reason: collision with other inner class name */
    static class C0007a extends f {
        C0007a() {
        }
    }

    static {
        if (Build.VERSION.SDK_INT >= 21) {
            a = new C0007a();
        } else if (Build.VERSION.SDK_INT >= 19) {
            a = new f();
        } else if (Build.VERSION.SDK_INT >= 18) {
            a = new e();
        } else if (Build.VERSION.SDK_INT >= 16) {
            a = new d();
        } else if (Build.VERSION.SDK_INT >= 14) {
            a = new b();
        } else {
            a = new g();
        }
    }

    public a(Object obj) {
        this.b = obj;
    }

    public final void a(int i) {
        a.a(this.b, i);
    }

    public final int hashCode() {
        if (this.b == null) {
            return 0;
        }
        return this.b.hashCode();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        a aVar = (a) obj;
        if (this.b == null) {
            if (aVar.b != null) {
                return false;
            }
            return true;
        } else if (!this.b.equals(aVar.b)) {
            return false;
        } else {
            return true;
        }
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        Rect rect = new Rect();
        a.a(this.b, rect);
        sb.append("; boundsInParent: " + rect);
        a.b(this.b, rect);
        sb.append("; boundsInScreen: " + rect);
        sb.append("; packageName: ").append(a.d(this.b));
        sb.append("; className: ").append(a.b(this.b));
        sb.append("; text: ").append(a.e(this.b));
        sb.append("; contentDescription: ").append(a.c(this.b));
        sb.append("; viewId: ").append(a.p(this.b));
        sb.append("; checkable: ").append(a.f(this.b));
        sb.append("; checked: ").append(a.g(this.b));
        sb.append("; focusable: ").append(a.j(this.b));
        sb.append("; focused: ").append(a.k(this.b));
        sb.append("; selected: ").append(a.o(this.b));
        sb.append("; clickable: ").append(a.h(this.b));
        sb.append("; longClickable: ").append(a.l(this.b));
        sb.append("; enabled: ").append(a.i(this.b));
        sb.append("; password: ").append(a.m(this.b));
        sb.append("; scrollable: " + a.n(this.b));
        sb.append("; [");
        int a2 = a.a(this.b);
        while (a2 != 0) {
            int numberOfTrailingZeros = 1 << Integer.numberOfTrailingZeros(a2);
            int i = (numberOfTrailingZeros ^ -1) & a2;
            switch (numberOfTrailingZeros) {
                case 1:
                    str = "ACTION_FOCUS";
                    break;
                case 2:
                    str = "ACTION_CLEAR_FOCUS";
                    break;
                case 4:
                    str = "ACTION_SELECT";
                    break;
                case 8:
                    str = "ACTION_CLEAR_SELECTION";
                    break;
                case 16:
                    str = "ACTION_CLICK";
                    break;
                case a.i.Theme_buttonBarButtonStyle /*32*/:
                    str = "ACTION_LONG_CLICK";
                    break;
                case a.i.Theme_spinnerDropDownItemStyle /*64*/:
                    str = "ACTION_ACCESSIBILITY_FOCUS";
                    break;
                case 128:
                    str = "ACTION_CLEAR_ACCESSIBILITY_FOCUS";
                    break;
                case 256:
                    str = "ACTION_NEXT_AT_MOVEMENT_GRANULARITY";
                    break;
                case 512:
                    str = "ACTION_PREVIOUS_AT_MOVEMENT_GRANULARITY";
                    break;
                case 1024:
                    str = "ACTION_NEXT_HTML_ELEMENT";
                    break;
                case 2048:
                    str = "ACTION_PREVIOUS_HTML_ELEMENT";
                    break;
                case 4096:
                    str = "ACTION_SCROLL_FORWARD";
                    break;
                case 8192:
                    str = "ACTION_SCROLL_BACKWARD";
                    break;
                case 16384:
                    str = "ACTION_COPY";
                    break;
                case 32768:
                    str = "ACTION_PASTE";
                    break;
                case 65536:
                    str = "ACTION_CUT";
                    break;
                case 131072:
                    str = "ACTION_SET_SELECTION";
                    break;
                default:
                    str = "ACTION_UNKNOWN";
                    break;
            }
            sb.append(str);
            if (i != 0) {
                sb.append(", ");
            }
            a2 = i;
        }
        sb.append("]");
        return sb.toString();
    }
}
