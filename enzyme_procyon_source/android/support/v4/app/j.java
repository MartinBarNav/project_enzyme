// 
// Decompiled by Procyon v0.5.36
// 

package android.support.v4.app;

import android.graphics.Rect;
import android.transition.Transition$EpicenterCallback;
import android.transition.TransitionManager;
import android.view.ViewGroup;
import java.util.Iterator;
import android.view.ViewTreeObserver$OnPreDrawListener;
import android.transition.TransitionSet;
import java.util.Collection;
import java.util.Map;
import java.util.ArrayList;
import android.view.View;
import android.transition.Transition;

final class j
{
    public static Object a(final Object o) {
        Object clone = o;
        if (o != null) {
            clone = ((Transition)o).clone();
        }
        return clone;
    }
    
    public static Object a(final Object o, final View view, final ArrayList<View> list, final Map<String, View> map) {
        Object o2 = o;
        if (o != null) {
            a(list, view);
            if (map != null) {
                list.removeAll(map.values());
            }
            if (list.isEmpty()) {
                o2 = null;
            }
            else {
                b(o, list);
                o2 = o;
            }
        }
        return o2;
    }
    
    public static Object a(Object setOrdering, Object o, final Object o2, boolean b) {
        final Transition transition = (Transition)setOrdering;
        setOrdering = o;
        final Transition transition2 = (Transition)o2;
        if (transition == null || setOrdering == null) {
            b = true;
        }
        if (b) {
            o = new TransitionSet();
            if (transition != null) {
                ((TransitionSet)o).addTransition(transition);
            }
            if (setOrdering != null) {
                ((TransitionSet)o).addTransition((Transition)setOrdering);
            }
            setOrdering = o;
            if (transition2 != null) {
                ((TransitionSet)o).addTransition(transition2);
                setOrdering = o;
            }
        }
        else {
            final Object o3 = null;
            if (setOrdering != null && transition != null) {
                setOrdering = new TransitionSet().addTransition((Transition)setOrdering).addTransition(transition).setOrdering(1);
            }
            else if (setOrdering == null) {
                setOrdering = o3;
                if (transition != null) {
                    setOrdering = transition;
                }
            }
            if (transition2 != null) {
                o = new TransitionSet();
                if (setOrdering != null) {
                    ((TransitionSet)o).addTransition((Transition)setOrdering);
                }
                ((TransitionSet)o).addTransition(transition2);
                setOrdering = o;
            }
        }
        return setOrdering;
    }
    
    public static String a(final View view) {
        return view.getTransitionName();
    }
    
    public static void a(final View view, final View view2, final Object o, final ArrayList<View> list, final Object o2, final ArrayList<View> list2, final Object o3, final ArrayList<View> list3, final Object o4, final ArrayList<View> list4, final Map<String, View> map) {
        final Transition transition = (Transition)o;
        final Transition transition2 = (Transition)o2;
        final Transition transition3 = (Transition)o3;
        final Transition transition4 = (Transition)o4;
        if (transition4 != null) {
            view.getViewTreeObserver().addOnPreDrawListener((ViewTreeObserver$OnPreDrawListener)new ViewTreeObserver$OnPreDrawListener() {
                public final boolean onPreDraw() {
                    view.getViewTreeObserver().removeOnPreDrawListener((ViewTreeObserver$OnPreDrawListener)this);
                    if (transition != null) {
                        transition.removeTarget(view2);
                        android.support.v4.app.j.a(transition, list);
                    }
                    if (transition2 != null) {
                        android.support.v4.app.j.a(transition2, list2);
                    }
                    if (transition3 != null) {
                        android.support.v4.app.j.a(transition3, list3);
                    }
                    for (final Map.Entry<K, View> entry : map.entrySet()) {
                        entry.getValue().setTransitionName((String)entry.getKey());
                    }
                    for (int size = list4.size(), i = 0; i < size; ++i) {
                        transition4.excludeTarget((View)list4.get(i), false);
                    }
                    transition4.excludeTarget(view2, false);
                    return true;
                }
            });
        }
    }
    
    public static void a(final ViewGroup viewGroup, final Object o) {
        TransitionManager.beginDelayedTransition(viewGroup, (Transition)o);
    }
    
    public static void a(final Object o, final View view) {
        ((Transition)o).setEpicenterCallback((Transition$EpicenterCallback)new Transition$EpicenterCallback() {
            final /* synthetic */ Rect a = b(view);
            
            public final Rect onGetEpicenter(final Transition transition) {
                return this.a;
            }
        });
    }
    
    public static void a(final Object o, final View view, final boolean b) {
        ((Transition)o).excludeTarget(view, b);
    }
    
    public static void a(final Object o, final Object o2, final View view, final b b, final View view2, final a a, final Map<String, String> map, final ArrayList<View> list, final Map<String, View> map2, final ArrayList<View> list2) {
        if (o != null || o2 != null) {
            final Transition transition = (Transition)o;
            if (transition != null) {
                transition.addTarget(view2);
            }
            if (o2 != null) {
                b(o2, list2);
            }
            view.getViewTreeObserver().addOnPreDrawListener((ViewTreeObserver$OnPreDrawListener)new ViewTreeObserver$OnPreDrawListener() {
                public final boolean onPreDraw() {
                    view.getViewTreeObserver().removeOnPreDrawListener((ViewTreeObserver$OnPreDrawListener)this);
                    final View a = b.a();
                    if (a != null) {
                        if (!map.isEmpty()) {
                            j.a(map2, a);
                            map2.keySet().retainAll(map.values());
                            for (final Map.Entry<K, String> entry : map.entrySet()) {
                                final View view = map2.get(entry.getValue());
                                if (view != null) {
                                    view.setTransitionName((String)entry.getKey());
                                }
                            }
                        }
                        if (transition != null) {
                            j.a(list, a);
                            list.removeAll(map2.values());
                            j.b(transition, list);
                        }
                    }
                    return true;
                }
            });
            if (transition != null) {
                transition.setEpicenterCallback((Transition$EpicenterCallback)new Transition$EpicenterCallback() {
                    private Rect b;
                    
                    public final Rect onGetEpicenter(final Transition transition) {
                        if (this.b == null && a.a != null) {
                            this.b = j.b(a.a);
                        }
                        return this.b;
                    }
                });
            }
        }
    }
    
    public static void a(final Object o, final ArrayList<View> list) {
        final Transition transition = (Transition)o;
        for (int size = list.size(), i = 0; i < size; ++i) {
            transition.removeTarget((View)list.get(i));
        }
    }
    
    static void a(final ArrayList<View> list, final View e) {
        if (e.getVisibility() == 0) {
            if (e instanceof ViewGroup) {
                final ViewGroup e2 = (ViewGroup)e;
                if (e2.isTransitionGroup()) {
                    list.add((View)e2);
                }
                else {
                    for (int childCount = e2.getChildCount(), i = 0; i < childCount; ++i) {
                        a(list, e2.getChildAt(i));
                    }
                }
            }
            else {
                list.add(e);
            }
        }
    }
    
    public static void a(final Map<String, View> map, final View view) {
        if (view.getVisibility() == 0) {
            final String transitionName = view.getTransitionName();
            if (transitionName != null) {
                map.put(transitionName, view);
            }
            if (view instanceof ViewGroup) {
                final ViewGroup viewGroup = (ViewGroup)view;
                for (int childCount = viewGroup.getChildCount(), i = 0; i < childCount; ++i) {
                    a(map, viewGroup.getChildAt(i));
                }
            }
        }
    }
    
    static Rect b(final View view) {
        final Rect rect = new Rect();
        final int[] array = new int[2];
        view.getLocationOnScreen(array);
        rect.set(array[0], array[1], array[0] + view.getWidth(), array[1] + view.getHeight());
        return rect;
    }
    
    public static void b(final Object o, final ArrayList<View> list) {
        final Transition transition = (Transition)o;
        for (int size = list.size(), i = 0; i < size; ++i) {
            transition.addTarget((View)list.get(i));
        }
    }
    
    public static final class a
    {
        public View a;
    }
    
    public interface b
    {
        View a();
    }
}
