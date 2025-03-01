package android.support.v4.view.a;

import android.os.Build;
import android.support.v4.view.a.e;
import android.support.v4.view.a.f;
import java.util.ArrayList;
import java.util.List;

public final class d {
    private static final a b;
    public final Object a;

    interface a {
        Object a(d dVar);
    }

    /* renamed from: android.support.v4.view.a.d$d  reason: collision with other inner class name */
    static class C0008d implements a {
        C0008d() {
        }

        public Object a(d dVar) {
            return null;
        }
    }

    static class b extends C0008d {
        b() {
        }

        public final Object a(final d dVar) {
            return e.a(new e.a() {
                public final boolean a() {
                    return d.b();
                }

                public final List<Object> b() {
                    List list = null;
                    d.c();
                    ArrayList arrayList = new ArrayList();
                    int size = list.size();
                    for (int i = 0; i < size; i++) {
                        arrayList.add(((a) list.get(i)).b);
                    }
                    return arrayList;
                }

                public final Object c() {
                    d.a();
                    return null;
                }
            });
        }
    }

    static class c extends C0008d {
        c() {
        }

        public final Object a(final d dVar) {
            return f.a(new f.a() {
                public final boolean a() {
                    return d.b();
                }

                public final List<Object> b() {
                    List list = null;
                    d.c();
                    ArrayList arrayList = new ArrayList();
                    int size = list.size();
                    for (int i = 0; i < size; i++) {
                        arrayList.add(((a) list.get(i)).b);
                    }
                    return arrayList;
                }

                public final Object c() {
                    d.a();
                    return null;
                }

                public final Object d() {
                    d.d();
                    return null;
                }
            });
        }
    }

    static {
        if (Build.VERSION.SDK_INT >= 19) {
            b = new c();
        } else if (Build.VERSION.SDK_INT >= 16) {
            b = new b();
        } else {
            b = new C0008d();
        }
    }

    public d() {
        this.a = b.a(this);
    }

    public d(Object obj) {
        this.a = obj;
    }

    public static a a() {
        return null;
    }

    public static boolean b() {
        return false;
    }

    public static List<a> c() {
        return null;
    }

    public static a d() {
        return null;
    }
}
