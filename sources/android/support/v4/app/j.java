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

    public static class a {
        public View a;
    }

    public interface b {
        View a();
    }

    public static String a(View view) {
        return view.getTransitionName();
    }

    public static Object a(Object obj) {
        if (obj != null) {
            return ((Transition) obj).clone();
        }
        return obj;
    }

    public static Object a(Object obj, View view, ArrayList<View> arrayList, Map<String, View> map) {
        if (obj == null) {
            return obj;
        }
        a(arrayList, view);
        if (map != null) {
            arrayList.removeAll(map.values());
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        b((Transition) obj, arrayList);
        return obj;
    }

    public static void a(Object obj, View view, boolean z) {
        ((Transition) obj).excludeTarget(view, z);
    }

    public static void a(ViewGroup viewGroup, Object obj) {
        TransitionManager.beginDelayedTransition(viewGroup, (Transition) obj);
    }

    public static void a(Object obj, View view) {
        final Rect b2 = b(view);
        ((Transition) obj).setEpicenterCallback(new Transition.EpicenterCallback() {
            public final Rect onGetEpicenter(Transition transition) {
                return b2;
            }
        });
    }

    public static void a(Object obj, Object obj2, View view, b bVar, View view2, final a aVar, Map<String, String> map, ArrayList<View> arrayList, Map<String, View> map2, ArrayList<View> arrayList2) {
        if (obj != null || obj2 != null) {
            final Transition transition = (Transition) obj;
            if (transition != null) {
                transition.addTarget(view2);
            }
            if (obj2 != null) {
                b((Transition) obj2, arrayList2);
            }
            final View view3 = view;
            final b bVar2 = bVar;
            final Map<String, String> map3 = map;
            final Map<String, View> map4 = map2;
            final ArrayList<View> arrayList3 = arrayList;
            view.getViewTreeObserver().addOnPreDrawListener(new ViewTreeObserver.OnPreDrawListener() {
                public final boolean onPreDraw() {
                    view3.getViewTreeObserver().removeOnPreDrawListener(this);
                    View a2 = bVar2.a();
                    if (a2 == null) {
                        return true;
                    }
                    if (!map3.isEmpty()) {
                        j.a((Map<String, View>) map4, a2);
                        map4.keySet().retainAll(map3.values());
                        for (Map.Entry entry : map3.entrySet()) {
                            View view = (View) map4.get((String) entry.getValue());
                            if (view != null) {
                                view.setTransitionName((String) entry.getKey());
                            }
                        }
                    }
                    if (transition == null) {
                        return true;
                    }
                    j.a((ArrayList<View>) arrayList3, a2);
                    arrayList3.removeAll(map4.values());
                    j.b(transition, arrayList3);
                    return true;
                }
            });
            if (transition != null) {
                transition.setEpicenterCallback(new Transition.EpicenterCallback() {
                    private Rect b;

                    public final Rect onGetEpicenter(Transition transition) {
                        if (this.b == null && aVar.a != null) {
                            this.b = j.b(aVar.a);
                        }
                        return this.b;
                    }
                });
            }
        }
    }

    public static Object a(Object obj, Object obj2, Object obj3, boolean z) {
        Transition transition = (Transition) obj;
        Transition transition2 = (Transition) obj2;
        Transition transition3 = (Transition) obj3;
        if (transition == null || transition2 == null) {
            z = true;
        }
        if (z) {
            TransitionSet transitionSet = new TransitionSet();
            if (transition != null) {
                transitionSet.addTransition(transition);
            }
            if (transition2 != null) {
                transitionSet.addTransition(transition2);
            }
            if (transition3 == null) {
                return transitionSet;
            }
            transitionSet.addTransition(transition3);
            return transitionSet;
        }
        Transition transition4 = null;
        if (transition2 != null && transition != null) {
            transition4 = new TransitionSet().addTransition(transition2).addTransition(transition).setOrdering(1);
        } else if (transition2 != null) {
            transition4 = transition2;
        } else if (transition != null) {
            transition4 = transition;
        }
        if (transition3 == null) {
            return transition4;
        }
        TransitionSet transitionSet2 = new TransitionSet();
        if (transition4 != null) {
            transitionSet2.addTransition(transition4);
        }
        transitionSet2.addTransition(transition3);
        return transitionSet2;
    }

    static Rect b(View view) {
        Rect rect = new Rect();
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        rect.set(iArr[0], iArr[1], iArr[0] + view.getWidth(), iArr[1] + view.getHeight());
        return rect;
    }

    static void a(ArrayList<View> arrayList, View view) {
        if (view.getVisibility() != 0) {
            return;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            if (viewGroup.isTransitionGroup()) {
                arrayList.add(viewGroup);
                return;
            }
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                a(arrayList, viewGroup.getChildAt(i));
            }
            return;
        }
        arrayList.add(view);
    }

    public static void a(Map<String, View> map, View view) {
        if (view.getVisibility() == 0) {
            String transitionName = view.getTransitionName();
            if (transitionName != null) {
                map.put(transitionName, view);
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                int childCount = viewGroup.getChildCount();
                for (int i = 0; i < childCount; i++) {
                    a(map, viewGroup.getChildAt(i));
                }
            }
        }
    }

    public static void a(View view, View view2, Object obj, ArrayList<View> arrayList, Object obj2, ArrayList<View> arrayList2, Object obj3, ArrayList<View> arrayList3, Object obj4, ArrayList<View> arrayList4, Map<String, View> map) {
        final Transition transition = (Transition) obj;
        final Transition transition2 = (Transition) obj2;
        final Transition transition3 = (Transition) obj3;
        final Transition transition4 = (Transition) obj4;
        if (transition4 != null) {
            final View view3 = view;
            final View view4 = view2;
            final ArrayList<View> arrayList5 = arrayList;
            final ArrayList<View> arrayList6 = arrayList2;
            final ArrayList<View> arrayList7 = arrayList3;
            final Map<String, View> map2 = map;
            final ArrayList<View> arrayList8 = arrayList4;
            view.getViewTreeObserver().addOnPreDrawListener(new ViewTreeObserver.OnPreDrawListener() {
                public final boolean onPreDraw() {
                    view3.getViewTreeObserver().removeOnPreDrawListener(this);
                    if (transition != null) {
                        transition.removeTarget(view4);
                        j.a((Object) transition, (ArrayList<View>) arrayList5);
                    }
                    if (transition2 != null) {
                        j.a((Object) transition2, (ArrayList<View>) arrayList6);
                    }
                    if (transition3 != null) {
                        j.a((Object) transition3, (ArrayList<View>) arrayList7);
                    }
                    for (Map.Entry entry : map2.entrySet()) {
                        ((View) entry.getValue()).setTransitionName((String) entry.getKey());
                    }
                    int size = arrayList8.size();
                    for (int i2 = 0; i2 < size; i2++) {
                        transition4.excludeTarget((View) arrayList8.get(i2), false);
                    }
                    transition4.excludeTarget(view4, false);
                    return true;
                }
            });
        }
    }

    public static void a(Object obj, ArrayList<View> arrayList) {
        Transition transition = (Transition) obj;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            transition.removeTarget(arrayList.get(i));
        }
    }

    public static void b(Object obj, ArrayList<View> arrayList) {
        Transition transition = (Transition) obj;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            transition.addTarget(arrayList.get(i));
        }
    }
}
