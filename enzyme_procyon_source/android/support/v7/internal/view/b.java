// 
// Decompiled by Procyon v0.5.36
// 

package android.support.v7.internal.view;

import android.view.SubMenu;
import android.view.View;
import android.support.v7.internal.view.menu.g;
import android.support.v7.internal.view.menu.f;
import android.support.v4.view.k;
import android.view.MenuItem;
import java.lang.reflect.Method;
import android.view.MenuItem$OnMenuItemClickListener;
import android.content.res.XmlResourceParser;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParserException;
import android.view.InflateException;
import android.util.Xml;
import android.content.ContextWrapper;
import android.app.Activity;
import android.content.res.TypedArray;
import android.util.Log;
import android.support.v4.view.d;
import android.support.v7.b.a;
import android.view.Menu;
import android.util.AttributeSet;
import org.xmlpull.v1.XmlPullParser;
import android.content.Context;
import android.view.MenuInflater;

public final class b extends MenuInflater
{
    private static final Class<?>[] a;
    private static final Class<?>[] b;
    private final Object[] c;
    private final Object[] d;
    private Context e;
    private Object f;
    
    static {
        b = (a = new Class[] { Context.class });
    }
    
    public b(final Context e) {
        super(e);
        this.e = e;
        this.c = new Object[] { e };
        this.d = this.c;
    }
    
    private void a(final XmlPullParser xmlPullParser, final AttributeSet set, final Menu menu) {
        final b b = new b(menu);
        int i = xmlPullParser.getEventType();
        int n = 0;
        Object anObject = null;
        String name3;
        while (true) {
            while (i != 2) {
                int n2 = xmlPullParser.next();
                if ((i = n2) == 1) {
                    int j = 0;
                    while (j == 0) {
                        switch (n2) {
                            case 2: {
                                if (n != 0) {
                                    break;
                                }
                                final String name = xmlPullParser.getName();
                                if (name.equals("group")) {
                                    final TypedArray obtainStyledAttributes = b.z.e.obtainStyledAttributes(set, android.support.v7.b.a.i.MenuGroup);
                                    b.b = obtainStyledAttributes.getResourceId(android.support.v7.b.a.i.MenuGroup_android_id, 0);
                                    b.c = obtainStyledAttributes.getInt(android.support.v7.b.a.i.MenuGroup_android_menuCategory, 0);
                                    b.d = obtainStyledAttributes.getInt(android.support.v7.b.a.i.MenuGroup_android_orderInCategory, 0);
                                    b.e = obtainStyledAttributes.getInt(android.support.v7.b.a.i.MenuGroup_android_checkableBehavior, 0);
                                    b.f = obtainStyledAttributes.getBoolean(android.support.v7.b.a.i.MenuGroup_android_visible, true);
                                    b.g = obtainStyledAttributes.getBoolean(android.support.v7.b.a.i.MenuGroup_android_enabled, true);
                                    obtainStyledAttributes.recycle();
                                    break;
                                }
                                if (name.equals("item")) {
                                    final TypedArray obtainStyledAttributes2 = b.z.e.obtainStyledAttributes(set, android.support.v7.b.a.i.MenuItem);
                                    b.i = obtainStyledAttributes2.getResourceId(android.support.v7.b.a.i.MenuItem_android_id, 0);
                                    b.j = ((obtainStyledAttributes2.getInt(android.support.v7.b.a.i.MenuItem_android_menuCategory, b.c) & 0xFFFF0000) | (obtainStyledAttributes2.getInt(android.support.v7.b.a.i.MenuItem_android_orderInCategory, b.d) & 0xFFFF));
                                    b.k = obtainStyledAttributes2.getText(android.support.v7.b.a.i.MenuItem_android_title);
                                    b.l = obtainStyledAttributes2.getText(android.support.v7.b.a.i.MenuItem_android_titleCondensed);
                                    b.m = obtainStyledAttributes2.getResourceId(android.support.v7.b.a.i.MenuItem_android_icon, 0);
                                    b.n = android.support.v7.internal.view.b.b.a(obtainStyledAttributes2.getString(android.support.v7.b.a.i.MenuItem_android_alphabeticShortcut));
                                    b.o = android.support.v7.internal.view.b.b.a(obtainStyledAttributes2.getString(android.support.v7.b.a.i.MenuItem_android_numericShortcut));
                                    if (obtainStyledAttributes2.hasValue(android.support.v7.b.a.i.MenuItem_android_checkable)) {
                                        int p3;
                                        if (obtainStyledAttributes2.getBoolean(android.support.v7.b.a.i.MenuItem_android_checkable, false)) {
                                            p3 = 1;
                                        }
                                        else {
                                            p3 = 0;
                                        }
                                        b.p = p3;
                                    }
                                    else {
                                        b.p = b.e;
                                    }
                                    b.q = obtainStyledAttributes2.getBoolean(android.support.v7.b.a.i.MenuItem_android_checked, false);
                                    b.r = obtainStyledAttributes2.getBoolean(android.support.v7.b.a.i.MenuItem_android_visible, b.f);
                                    b.s = obtainStyledAttributes2.getBoolean(android.support.v7.b.a.i.MenuItem_android_enabled, b.g);
                                    b.t = obtainStyledAttributes2.getInt(android.support.v7.b.a.i.MenuItem_showAsAction, -1);
                                    b.x = obtainStyledAttributes2.getString(android.support.v7.b.a.i.MenuItem_android_onClick);
                                    b.u = obtainStyledAttributes2.getResourceId(android.support.v7.b.a.i.MenuItem_actionLayout, 0);
                                    b.v = obtainStyledAttributes2.getString(android.support.v7.b.a.i.MenuItem_actionViewClass);
                                    b.w = obtainStyledAttributes2.getString(android.support.v7.b.a.i.MenuItem_actionProviderClass);
                                    boolean b2;
                                    if (b.w != null) {
                                        b2 = true;
                                    }
                                    else {
                                        b2 = false;
                                    }
                                    if (b2 && b.u == 0 && b.v == null) {
                                        b.y = (d)b.a(b.w, android.support.v7.internal.view.b.b, b.z.d);
                                    }
                                    else {
                                        if (b2) {
                                            Log.w("SupportMenuInflater", "Ignoring attribute 'actionProviderClass'. Action view already specified.");
                                        }
                                        b.y = null;
                                    }
                                    obtainStyledAttributes2.recycle();
                                    b.h = false;
                                    break;
                                }
                                if (name.equals("menu")) {
                                    this.a(xmlPullParser, set, (Menu)b.b());
                                    break;
                                }
                                n = 1;
                                anObject = name;
                                break;
                            }
                            case 3: {
                                final String name2 = xmlPullParser.getName();
                                if (n != 0 && name2.equals(anObject)) {
                                    n = 0;
                                    anObject = null;
                                    break;
                                }
                                if (name2.equals("group")) {
                                    b.a();
                                    break;
                                }
                                if (name2.equals("item")) {
                                    if (b.h) {
                                        break;
                                    }
                                    if (b.y != null && b.y.e()) {
                                        b.b();
                                        break;
                                    }
                                    b.h = true;
                                    b.a(b.a.add(b.b, b.i, b.j, b.k));
                                    break;
                                }
                                else {
                                    if (name2.equals("menu")) {
                                        j = 1;
                                        break;
                                    }
                                    break;
                                }
                                break;
                            }
                            case 1: {
                                throw new RuntimeException("Unexpected end of document");
                            }
                        }
                        n2 = xmlPullParser.next();
                    }
                    return;
                }
            }
            name3 = xmlPullParser.getName();
            if (name3.equals("menu")) {
                final int n2 = xmlPullParser.next();
                continue;
            }
            break;
        }
        throw new RuntimeException("Expecting menu, got " + name3);
    }
    
    static /* synthetic */ Object b(final b b) {
        if (b.f == null) {
            Context f;
            for (f = b.e; !(f instanceof Activity) && f instanceof ContextWrapper; f = ((ContextWrapper)f).getBaseContext()) {}
            b.f = f;
        }
        return b.f;
    }
    
    public final void inflate(final int n, final Menu menu) {
        if (!(menu instanceof android.support.v4.b.a.a)) {
            super.inflate(n, menu);
        }
        else {
            XmlResourceParser xmlResourceParser = null;
            XmlResourceParser xmlResourceParser2 = null;
            XmlResourceParser layout = null;
            try {
                final XmlResourceParser xmlResourceParser3 = xmlResourceParser2 = (xmlResourceParser = (layout = this.e.getResources().getLayout(n)));
                this.a((XmlPullParser)xmlResourceParser3, Xml.asAttributeSet((XmlPullParser)xmlResourceParser3), menu);
            }
            catch (XmlPullParserException ex2) {
                xmlResourceParser = layout;
                xmlResourceParser = layout;
                final InflateException ex = new InflateException("Error inflating menu XML", (Throwable)ex2);
                xmlResourceParser = layout;
                throw ex;
            }
            catch (IOException ex4) {
                xmlResourceParser = xmlResourceParser2;
                xmlResourceParser = xmlResourceParser2;
                final InflateException ex3 = new InflateException("Error inflating menu XML", (Throwable)ex4);
                xmlResourceParser = xmlResourceParser2;
                throw ex3;
            }
            finally {
                if (xmlResourceParser != null) {
                    xmlResourceParser.close();
                }
            }
        }
    }
    
    private static final class a implements MenuItem$OnMenuItemClickListener
    {
        private static final Class<?>[] a;
        private Object b;
        private Method c;
        
        static {
            a = new Class[] { MenuItem.class };
        }
        
        public a(final Object b, final String s) {
            this.b = b;
            final Class<?> class1 = b.getClass();
            try {
                this.c = class1.getMethod(s, android.support.v7.internal.view.b.a.a);
            }
            catch (Exception ex2) {
                final InflateException ex = new InflateException("Couldn't resolve menu item onClick handler " + s + " in class " + class1.getName());
                ex.initCause((Throwable)ex2);
                throw ex;
            }
        }
        
        public final boolean onMenuItemClick(final MenuItem menuItem) {
            boolean booleanValue = true;
            try {
                if (this.c.getReturnType() == Boolean.TYPE) {
                    booleanValue = (boolean)this.c.invoke(this.b, menuItem);
                }
                else {
                    this.c.invoke(this.b, menuItem);
                }
                return booleanValue;
            }
            catch (Exception cause) {
                throw new RuntimeException(cause);
            }
        }
    }
    
    private final class b
    {
        Menu a;
        int b;
        int c;
        int d;
        int e;
        boolean f;
        boolean g;
        boolean h;
        int i;
        int j;
        CharSequence k;
        CharSequence l;
        int m;
        char n;
        char o;
        int p;
        boolean q;
        boolean r;
        boolean s;
        int t;
        int u;
        String v;
        String w;
        String x;
        d y;
        final /* synthetic */ android.support.v7.internal.view.b z;
        
        public b(final Menu a) {
            this.a = a;
            this.a();
        }
        
        static char a(final String s) {
            final char c = '\0';
            char char1;
            if (s == null) {
                char1 = c;
            }
            else {
                char1 = s.charAt(0);
            }
            return char1;
        }
        
        final <T> T a(String instance, final Class<?>[] parameterTypes, final Object[] initargs) {
            try {
                instance = android.support.v7.internal.view.b.this.e.getClassLoader().loadClass((String)instance).getConstructor(parameterTypes).newInstance(initargs);
                return (T)instance;
            }
            catch (Exception ex) {
                Log.w("SupportMenuInflater", "Cannot instantiate class: " + (String)instance, (Throwable)ex);
                instance = null;
                return (T)instance;
            }
        }
        
        public final void a() {
            this.b = 0;
            this.c = 0;
            this.d = 0;
            this.e = 0;
            this.f = true;
            this.g = true;
        }
        
        final void a(final MenuItem menuItem) {
            int n = 1;
            menuItem.setChecked(this.q).setVisible(this.r).setEnabled(this.s).setCheckable(this.p > 0).setTitleCondensed(this.l).setIcon(this.m).setAlphabeticShortcut(this.n).setNumericShortcut(this.o);
            if (this.t >= 0) {
                android.support.v4.view.k.a(menuItem, this.t);
            }
            if (this.x != null) {
                if (android.support.v7.internal.view.b.this.e.isRestricted()) {
                    throw new IllegalStateException("The android:onClick attribute cannot be used within a restricted context");
                }
                menuItem.setOnMenuItemClickListener((MenuItem$OnMenuItemClickListener)new a(android.support.v7.internal.view.b.b(android.support.v7.internal.view.b.this), this.x));
            }
            if (this.p >= 2) {
                if (menuItem instanceof f) {
                    ((f)menuItem).a(true);
                }
                else if (menuItem instanceof g) {
                    final g g = (g)menuItem;
                    try {
                        if (g.e == null) {
                            g.e = ((android.support.v4.b.a.b)g.d).getClass().getDeclaredMethod("setExclusiveCheckable", Boolean.TYPE);
                        }
                        g.e.invoke(g.d, true);
                    }
                    catch (Exception ex) {
                        Log.w("MenuItemWrapper", "Error while calling setExclusiveCheckable", (Throwable)ex);
                    }
                }
            }
            if (this.v != null) {
                android.support.v4.view.k.a(menuItem, this.a(this.v, android.support.v7.internal.view.b.a, android.support.v7.internal.view.b.this.c));
            }
            else {
                n = 0;
            }
            if (this.u > 0) {
                if (n == 0) {
                    android.support.v4.view.k.b(menuItem, this.u);
                }
                else {
                    Log.w("SupportMenuInflater", "Ignoring attribute 'itemActionViewLayout'. Action view already specified.");
                }
            }
            if (this.y != null) {
                android.support.v4.view.k.a(menuItem, this.y);
            }
        }
        
        public final SubMenu b() {
            this.h = true;
            final SubMenu addSubMenu = this.a.addSubMenu(this.b, this.i, this.j, this.k);
            this.a(addSubMenu.getItem());
            return addSubMenu;
        }
    }
}
