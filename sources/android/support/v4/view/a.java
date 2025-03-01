package android.support.v4.view;

import android.os.Build;
import android.os.Bundle;
import android.support.v4.view.a.d;
import android.support.v4.view.b;
import android.support.v4.view.c;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;

public class a {
    private static final b b;
    private static final Object c = b.a();
    final Object a = b.a(this);

    interface b {
        d a(Object obj, View view);

        Object a();

        Object a(a aVar);

        void a(Object obj, View view, int i);

        void a(Object obj, View view, android.support.v4.view.a.a aVar);

        boolean a(Object obj, View view, int i, Bundle bundle);

        boolean a(Object obj, View view, AccessibilityEvent accessibilityEvent);

        boolean a(Object obj, ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent);

        void b(Object obj, View view, AccessibilityEvent accessibilityEvent);

        void c(Object obj, View view, AccessibilityEvent accessibilityEvent);

        void d(Object obj, View view, AccessibilityEvent accessibilityEvent);
    }

    static class d implements b {
        d() {
        }

        public Object a() {
            return null;
        }

        public Object a(a aVar) {
            return null;
        }

        public boolean a(Object obj, View view, AccessibilityEvent accessibilityEvent) {
            return false;
        }

        public void b(Object obj, View view, AccessibilityEvent accessibilityEvent) {
        }

        public void a(Object obj, View view, android.support.v4.view.a.a aVar) {
        }

        public void c(Object obj, View view, AccessibilityEvent accessibilityEvent) {
        }

        public boolean a(Object obj, ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
            return true;
        }

        public void a(Object obj, View view, int i) {
        }

        public void d(Object obj, View view, AccessibilityEvent accessibilityEvent) {
        }

        public android.support.v4.view.a.d a(Object obj, View view) {
            return null;
        }

        public boolean a(Object obj, View view, int i, Bundle bundle) {
            return false;
        }
    }

    /* renamed from: android.support.v4.view.a$a  reason: collision with other inner class name */
    static class C0006a extends d {
        C0006a() {
        }

        public final Object a() {
            return b.a();
        }

        public Object a(final a aVar) {
            return b.a(new b.a() {
                public final boolean a(View view, AccessibilityEvent accessibilityEvent) {
                    return a.b(view, accessibilityEvent);
                }

                public final void b(View view, AccessibilityEvent accessibilityEvent) {
                    aVar.d(view, accessibilityEvent);
                }

                public final void a(View view, Object obj) {
                    aVar.a(view, new android.support.v4.view.a.a(obj));
                }

                public final void c(View view, AccessibilityEvent accessibilityEvent) {
                    a.c(view, accessibilityEvent);
                }

                public final boolean a(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
                    return a.a(viewGroup, view, accessibilityEvent);
                }

                public final void a(View view, int i) {
                    a.a(view, i);
                }

                public final void d(View view, AccessibilityEvent accessibilityEvent) {
                    a.a(view, accessibilityEvent);
                }
            });
        }

        public final boolean a(Object obj, View view, AccessibilityEvent accessibilityEvent) {
            return b.a(obj, view, accessibilityEvent);
        }

        public final void b(Object obj, View view, AccessibilityEvent accessibilityEvent) {
            b.b(obj, view, accessibilityEvent);
        }

        public final void c(Object obj, View view, AccessibilityEvent accessibilityEvent) {
            b.c(obj, view, accessibilityEvent);
        }

        public final boolean a(Object obj, ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
            return b.a(obj, viewGroup, view, accessibilityEvent);
        }

        public final void a(Object obj, View view, int i) {
            b.a(obj, view, i);
        }

        public final void d(Object obj, View view, AccessibilityEvent accessibilityEvent) {
            b.d(obj, view, accessibilityEvent);
        }

        public final void a(Object obj, View view, android.support.v4.view.a.a aVar) {
            b.a(obj, view, aVar.b);
        }
    }

    static class c extends C0006a {
        c() {
        }

        public final Object a(final a aVar) {
            return c.a(new c.a() {
                public final boolean a(View view, AccessibilityEvent accessibilityEvent) {
                    return a.b(view, accessibilityEvent);
                }

                public final void b(View view, AccessibilityEvent accessibilityEvent) {
                    aVar.d(view, accessibilityEvent);
                }

                public final void a(View view, Object obj) {
                    aVar.a(view, new android.support.v4.view.a.a(obj));
                }

                public final void c(View view, AccessibilityEvent accessibilityEvent) {
                    a.c(view, accessibilityEvent);
                }

                public final boolean a(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
                    return a.a(viewGroup, view, accessibilityEvent);
                }

                public final void a(View view, int i) {
                    a.a(view, i);
                }

                public final void d(View view, AccessibilityEvent accessibilityEvent) {
                    a.a(view, accessibilityEvent);
                }

                public final Object a(View view) {
                    d a2 = a.a(view);
                    if (a2 != null) {
                        return a2.a;
                    }
                    return null;
                }

                public final boolean a(View view, int i, Bundle bundle) {
                    return aVar.a(view, i, bundle);
                }
            });
        }

        public final d a(Object obj, View view) {
            Object a = c.a(obj, view);
            if (a != null) {
                return new d(a);
            }
            return null;
        }

        public final boolean a(Object obj, View view, int i, Bundle bundle) {
            return c.a(obj, view, i, bundle);
        }
    }

    static {
        if (Build.VERSION.SDK_INT >= 16) {
            b = new c();
        } else if (Build.VERSION.SDK_INT >= 14) {
            b = new C0006a();
        } else {
            b = new d();
        }
    }

    public static void a(View view, int i) {
        b.a(c, view, i);
    }

    public static void a(View view, AccessibilityEvent accessibilityEvent) {
        b.d(c, view, accessibilityEvent);
    }

    public static boolean b(View view, AccessibilityEvent accessibilityEvent) {
        return b.a(c, view, accessibilityEvent);
    }

    public static void c(View view, AccessibilityEvent accessibilityEvent) {
        b.c(c, view, accessibilityEvent);
    }

    public void d(View view, AccessibilityEvent accessibilityEvent) {
        b.b(c, view, accessibilityEvent);
    }

    public void a(View view, android.support.v4.view.a.a aVar) {
        b.a(c, view, aVar);
    }

    public static boolean a(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        return b.a(c, viewGroup, view, accessibilityEvent);
    }

    public static d a(View view) {
        return b.a(c, view);
    }

    public boolean a(View view, int i, Bundle bundle) {
        return b.a(c, view, i, bundle);
    }
}
