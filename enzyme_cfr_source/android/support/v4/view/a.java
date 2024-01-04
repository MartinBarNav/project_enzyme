/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  android.os.Build$VERSION
 *  android.os.Bundle
 *  android.view.View
 *  android.view.ViewGroup
 *  android.view.accessibility.AccessibilityEvent
 */
package android.support.v4.view;

import android.os.Build;
import android.os.Bundle;
import android.support.v4.view.b;
import android.support.v4.view.c;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;

public class a {
    private static final b b = Build.VERSION.SDK_INT >= 16 ? new c() : (Build.VERSION.SDK_INT >= 14 ? new a() : new d());
    private static final Object c = b.a();
    final Object a = b.a(this);

    public static android.support.v4.view.a.d a(View view) {
        return b.a(c, view);
    }

    public static void a(View view, int n2) {
        b.a(c, view, n2);
    }

    public static void a(View view, AccessibilityEvent accessibilityEvent) {
        b.d(c, view, accessibilityEvent);
    }

    public static boolean a(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        return b.a(c, viewGroup, view, accessibilityEvent);
    }

    public static boolean b(View view, AccessibilityEvent accessibilityEvent) {
        return b.a(c, view, accessibilityEvent);
    }

    public static void c(View view, AccessibilityEvent accessibilityEvent) {
        b.c(c, view, accessibilityEvent);
    }

    public void a(View view, android.support.v4.view.a.a a2) {
        b.a(c, view, a2);
    }

    public boolean a(View view, int n2, Bundle bundle) {
        return b.a(c, view, n2, bundle);
    }

    public void d(View view, AccessibilityEvent accessibilityEvent) {
        b.b(c, view, accessibilityEvent);
    }

    static class a
    extends d {
        a() {
        }

        @Override
        public final Object a() {
            return android.support.v4.view.b.a();
        }

        @Override
        public Object a(final a a2) {
            return android.support.v4.view.b.a(new b.a(){

                @Override
                public final void a(View view, int n2) {
                    android.support.v4.view.a.a(view, n2);
                }

                @Override
                public final void a(View view, Object object) {
                    a2.a(view, new android.support.v4.view.a.a(object));
                }

                @Override
                public final boolean a(View view, AccessibilityEvent accessibilityEvent) {
                    return android.support.v4.view.a.b(view, accessibilityEvent);
                }

                @Override
                public final boolean a(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
                    return android.support.v4.view.a.a(viewGroup, view, accessibilityEvent);
                }

                @Override
                public final void b(View view, AccessibilityEvent accessibilityEvent) {
                    a2.d(view, accessibilityEvent);
                }

                @Override
                public final void c(View view, AccessibilityEvent accessibilityEvent) {
                    android.support.v4.view.a.c(view, accessibilityEvent);
                }

                @Override
                public final void d(View view, AccessibilityEvent accessibilityEvent) {
                    android.support.v4.view.a.a(view, accessibilityEvent);
                }
            });
        }

        @Override
        public final void a(Object object, View view, int n2) {
            android.support.v4.view.b.a(object, view, n2);
        }

        @Override
        public final void a(Object object, View view, android.support.v4.view.a.a a2) {
            android.support.v4.view.b.a(object, view, a2.b);
        }

        @Override
        public final boolean a(Object object, View view, AccessibilityEvent accessibilityEvent) {
            return android.support.v4.view.b.a(object, view, accessibilityEvent);
        }

        @Override
        public final boolean a(Object object, ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
            return android.support.v4.view.b.a(object, viewGroup, view, accessibilityEvent);
        }

        @Override
        public final void b(Object object, View view, AccessibilityEvent accessibilityEvent) {
            android.support.v4.view.b.b(object, view, accessibilityEvent);
        }

        @Override
        public final void c(Object object, View view, AccessibilityEvent accessibilityEvent) {
            android.support.v4.view.b.c(object, view, accessibilityEvent);
        }

        @Override
        public final void d(Object object, View view, AccessibilityEvent accessibilityEvent) {
            android.support.v4.view.b.d(object, view, accessibilityEvent);
        }
    }

    static interface b {
        public android.support.v4.view.a.d a(Object var1, View var2);

        public Object a();

        public Object a(a var1);

        public void a(Object var1, View var2, int var3);

        public void a(Object var1, View var2, android.support.v4.view.a.a var3);

        public boolean a(Object var1, View var2, int var3, Bundle var4);

        public boolean a(Object var1, View var2, AccessibilityEvent var3);

        public boolean a(Object var1, ViewGroup var2, View var3, AccessibilityEvent var4);

        public void b(Object var1, View var2, AccessibilityEvent var3);

        public void c(Object var1, View var2, AccessibilityEvent var3);

        public void d(Object var1, View var2, AccessibilityEvent var3);
    }

    static final class c
    extends a {
        c() {
        }

        /*
         * Enabled force condition propagation
         * Lifted jumps to return sites
         */
        @Override
        public final android.support.v4.view.a.d a(Object object, View view) {
            if ((object = android.support.v4.view.c.a(object, view)) == null) return null;
            return new android.support.v4.view.a.d(object);
        }

        @Override
        public final Object a(final a a2) {
            return android.support.v4.view.c.a(new c.a(){

                /*
                 * WARNING - void declaration
                 * Enabled force condition propagation
                 * Lifted jumps to return sites
                 */
                @Override
                public final Object a(View object) {
                    void var1_4;
                    android.support.v4.view.a.d d2 = android.support.v4.view.a.a(object);
                    if (d2 == null) return var1_4;
                    Object object2 = d2.a;
                    return var1_4;
                }

                @Override
                public final void a(View view, int n2) {
                    android.support.v4.view.a.a(view, n2);
                }

                @Override
                public final void a(View view, Object object) {
                    a2.a(view, new android.support.v4.view.a.a(object));
                }

                @Override
                public final boolean a(View view, int n2, Bundle bundle) {
                    return a2.a(view, n2, bundle);
                }

                @Override
                public final boolean a(View view, AccessibilityEvent accessibilityEvent) {
                    return android.support.v4.view.a.b(view, accessibilityEvent);
                }

                @Override
                public final boolean a(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
                    return android.support.v4.view.a.a(viewGroup, view, accessibilityEvent);
                }

                @Override
                public final void b(View view, AccessibilityEvent accessibilityEvent) {
                    a2.d(view, accessibilityEvent);
                }

                @Override
                public final void c(View view, AccessibilityEvent accessibilityEvent) {
                    android.support.v4.view.a.c(view, accessibilityEvent);
                }

                @Override
                public final void d(View view, AccessibilityEvent accessibilityEvent) {
                    android.support.v4.view.a.a(view, accessibilityEvent);
                }
            });
        }

        @Override
        public final boolean a(Object object, View view, int n2, Bundle bundle) {
            return android.support.v4.view.c.a(object, view, n2, bundle);
        }
    }

    static class d
    implements b {
        d() {
        }

        @Override
        public android.support.v4.view.a.d a(Object object, View view) {
            return null;
        }

        @Override
        public Object a() {
            return null;
        }

        @Override
        public Object a(a a2) {
            return null;
        }

        @Override
        public void a(Object object, View view, int n2) {
        }

        @Override
        public void a(Object object, View view, android.support.v4.view.a.a a2) {
        }

        @Override
        public boolean a(Object object, View view, int n2, Bundle bundle) {
            return false;
        }

        @Override
        public boolean a(Object object, View view, AccessibilityEvent accessibilityEvent) {
            return false;
        }

        @Override
        public boolean a(Object object, ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
            return true;
        }

        @Override
        public void b(Object object, View view, AccessibilityEvent accessibilityEvent) {
        }

        @Override
        public void c(Object object, View view, AccessibilityEvent accessibilityEvent) {
        }

        @Override
        public void d(Object object, View view, AccessibilityEvent accessibilityEvent) {
        }
    }
}

