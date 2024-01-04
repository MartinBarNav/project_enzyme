/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  android.graphics.Rect
 *  android.transition.Transition
 *  android.transition.Transition$EpicenterCallback
 *  android.transition.TransitionManager
 *  android.transition.TransitionSet
 *  android.view.View
 *  android.view.ViewGroup
 *  android.view.ViewTreeObserver$OnPreDrawListener
 */
package android.support.v4.app;

import android.graphics.Rect;
import android.transition.Transition;
import android.transition.TransitionManager;
import android.transition.TransitionSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import java.util.ArrayList;
import java.util.Map;

final class j {
    public static Object a(Object object) {
        Object object2 = object;
        if (object != null) {
            object2 = ((Transition)object).clone();
        }
        return object2;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static Object a(Object object, View view, ArrayList<View> arrayList, Map<String, View> map) {
        Object object2 = object;
        if (object == null) return object2;
        j.a(arrayList, view);
        if (map != null) {
            arrayList.removeAll(map.values());
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        j.b((Object)((Transition)object), arrayList);
        return object;
    }

    /*
     * Enabled aggressive block sorting
     */
    public static Object a(Object object, Object object2, Object object3, boolean bl) {
        Transition transition = (Transition)object;
        object = (Transition)object2;
        object3 = (Transition)object3;
        if (transition == null || object == null) {
            bl = true;
        }
        if (bl) {
            object2 = new TransitionSet();
            if (transition != null) {
                object2.addTransition(transition);
            }
            if (object != null) {
                object2.addTransition((Transition)object);
            }
            object = object2;
            if (object3 == null) return object;
            object2.addTransition((Transition)object3);
            return object2;
        }
        object2 = null;
        if (object != null && transition != null) {
            object = new TransitionSet().addTransition((Transition)object).addTransition(transition).setOrdering(1);
        } else if (object == null) {
            object = object2;
            if (transition != null) {
                object = transition;
            }
        }
        if (object3 == null) return object;
        object2 = new TransitionSet();
        if (object != null) {
            object2.addTransition((Transition)object);
        }
        object2.addTransition((Transition)object3);
        return object2;
    }

    public static String a(View view) {
        return view.getTransitionName();
    }

    public static void a(final View view, View view2, Object object, ArrayList<View> arrayList, Object object2, ArrayList<View> arrayList2, Object object3, ArrayList<View> arrayList3, Object object4, ArrayList<View> arrayList4, Map<String, View> map) {
        object = (Transition)object;
        object2 = (Transition)object2;
        object3 = (Transition)object3;
        if ((object4 = (Transition)object4) != null) {
            view.getViewTreeObserver().addOnPreDrawListener(new ViewTreeObserver.OnPreDrawListener((Transition)object, view2, arrayList, (Transition)object2, arrayList2, (Transition)object3, arrayList3, map, arrayList4, (Transition)object4){
                final /* synthetic */ Transition b;
                final /* synthetic */ View c;
                final /* synthetic */ ArrayList d;
                final /* synthetic */ Transition e;
                final /* synthetic */ ArrayList f;
                final /* synthetic */ Transition g;
                final /* synthetic */ ArrayList h;
                final /* synthetic */ Map i;
                final /* synthetic */ ArrayList j;
                final /* synthetic */ Transition k;
                {
                    this.b = transition;
                    this.c = view2;
                    this.d = arrayList;
                    this.e = transition2;
                    this.f = arrayList2;
                    this.g = transition3;
                    this.h = arrayList3;
                    this.i = map;
                    this.j = arrayList4;
                    this.k = transition4;
                }

                public final boolean onPreDraw() {
                    view.getViewTreeObserver().removeOnPreDrawListener((ViewTreeObserver.OnPreDrawListener)this);
                    if (this.b != null) {
                        this.b.removeTarget(this.c);
                        j.a((Object)this.b, this.d);
                    }
                    if (this.e != null) {
                        j.a((Object)this.e, this.f);
                    }
                    if (this.g != null) {
                        j.a((Object)this.g, this.h);
                    }
                    for (Map.Entry entry : this.i.entrySet()) {
                        ((View)entry.getValue()).setTransitionName((String)entry.getKey());
                    }
                    int n2 = this.j.size();
                    for (int i2 = 0; i2 < n2; ++i2) {
                        this.k.excludeTarget((View)this.j.get(i2), false);
                    }
                    this.k.excludeTarget(this.c, false);
                    return true;
                }
            });
        }
    }

    public static void a(ViewGroup viewGroup, Object object) {
        TransitionManager.beginDelayedTransition((ViewGroup)viewGroup, (Transition)((Transition)object));
    }

    public static void a(Object object, View view) {
        ((Transition)object).setEpicenterCallback(new Transition.EpicenterCallback(j.b(view)){
            final /* synthetic */ Rect a;
            {
                this.a = rect;
            }

            public final Rect onGetEpicenter(Transition transition) {
                return this.a;
            }
        });
    }

    public static void a(Object object, View view, boolean bl) {
        ((Transition)object).excludeTarget(view, bl);
    }

    public static void a(Object object, Object object2, final View view, final b b2, View view2, final a a2, final Map<String, String> map, ArrayList<View> arrayList, final Map<String, View> map2, ArrayList<View> arrayList2) {
        if (object != null || object2 != null) {
            if ((object = (Transition)object) != null) {
                object.addTarget(view2);
            }
            if (object2 != null) {
                j.b((Object)((Transition)object2), arrayList2);
            }
            view.getViewTreeObserver().addOnPreDrawListener(new ViewTreeObserver.OnPreDrawListener((Transition)object, arrayList){
                final /* synthetic */ Transition e;
                final /* synthetic */ ArrayList f;
                {
                    this.e = transition;
                    this.f = arrayList;
                }

                public final boolean onPreDraw() {
                    view.getViewTreeObserver().removeOnPreDrawListener((ViewTreeObserver.OnPreDrawListener)this);
                    View view2 = b2.a();
                    if (view2 != null) {
                        if (!map.isEmpty()) {
                            j.a(map2, view2);
                            map2.keySet().retainAll(map.values());
                            for (Map.Entry entry : map.entrySet()) {
                                String string = (String)entry.getValue();
                                if ((string = (View)map2.get(string)) == null) continue;
                                string.setTransitionName((String)entry.getKey());
                            }
                        }
                        if (this.e != null) {
                            j.a(this.f, view2);
                            this.f.removeAll(map2.values());
                            j.b((Object)this.e, this.f);
                        }
                    }
                    return true;
                }
            });
            if (object != null) {
                object.setEpicenterCallback(new Transition.EpicenterCallback(){
                    private Rect b;

                    public final Rect onGetEpicenter(Transition transition) {
                        if (this.b == null && a2.a != null) {
                            this.b = j.b(a2.a);
                        }
                        return this.b;
                    }
                });
            }
        }
    }

    public static void a(Object object, ArrayList<View> arrayList) {
        object = (Transition)object;
        int n2 = arrayList.size();
        for (int i2 = 0; i2 < n2; ++i2) {
            object.removeTarget(arrayList.get(i2));
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    static void a(ArrayList<View> arrayList, View view) {
        if (view.getVisibility() != 0) return;
        if (!(view instanceof ViewGroup)) {
            arrayList.add(view);
            return;
        }
        if ((view = (ViewGroup)view).isTransitionGroup()) {
            arrayList.add(view);
            return;
        }
        int n2 = view.getChildCount();
        int n3 = 0;
        while (n3 < n2) {
            j.a(arrayList, view.getChildAt(n3));
            ++n3;
        }
    }

    public static void a(Map<String, View> map, View view) {
        if (view.getVisibility() == 0) {
            String string = view.getTransitionName();
            if (string != null) {
                map.put(string, view);
            }
            if (view instanceof ViewGroup) {
                view = (ViewGroup)view;
                int n2 = view.getChildCount();
                for (int i2 = 0; i2 < n2; ++i2) {
                    j.a(map, view.getChildAt(i2));
                }
            }
        }
    }

    static Rect b(View view) {
        Rect rect = new Rect();
        int[] arrn = new int[2];
        view.getLocationOnScreen(arrn);
        rect.set(arrn[0], arrn[1], arrn[0] + view.getWidth(), arrn[1] + view.getHeight());
        return rect;
    }

    public static void b(Object object, ArrayList<View> arrayList) {
        object = (Transition)object;
        int n2 = arrayList.size();
        for (int i2 = 0; i2 < n2; ++i2) {
            object.addTarget(arrayList.get(i2));
        }
    }

    public static final class a {
        public View a;
    }

    public static interface b {
        public View a();
    }
}

