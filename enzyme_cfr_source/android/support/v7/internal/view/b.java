/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.content.Context
 *  android.content.ContextWrapper
 *  android.util.AttributeSet
 *  android.util.Log
 *  android.view.InflateException
 *  android.view.Menu
 *  android.view.MenuInflater
 *  android.view.MenuItem
 *  android.view.MenuItem$OnMenuItemClickListener
 *  android.view.SubMenu
 *  android.view.View
 *  org.xmlpull.v1.XmlPullParser
 */
package android.support.v7.internal.view;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.support.v4.view.d;
import android.support.v4.view.k;
import android.support.v7.b.a;
import android.support.v7.internal.view.menu.f;
import android.support.v7.internal.view.menu.g;
import android.util.AttributeSet;
import android.util.Log;
import android.view.InflateException;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import java.lang.reflect.Method;
import org.xmlpull.v1.XmlPullParser;

public final class b
extends MenuInflater {
    private static final Class<?>[] a;
    private static final Class<?>[] b;
    private final Object[] c;
    private final Object[] d;
    private Context e;
    private Object f;

    static {
        Class[] arrclass = new Class[]{Context.class};
        a = arrclass;
        b = arrclass;
    }

    public b(Context context) {
        super(context);
        this.e = context;
        this.c = new Object[]{context};
        this.d = this.c;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    private void a(XmlPullParser var1_1, AttributeSet var2_2, Menu var3_3) {
        var4_8 = new b(var3_3 /* !! */ );
        var5_9 = var1_1.getEventType();
        var6_10 = false;
        var3_4 = null;
        do {
            if (var5_9 == 2) {
                var7_12 = var1_1.getName();
                if (!var7_12.equals("menu")) throw new RuntimeException("Expecting menu, got " + var7_12);
                var8_11 = var1_1.next();
                break;
            }
            var5_9 = var8_11 = var1_1.next();
        } while (var8_11 != 1);
        var5_9 = 0;
        block6: while (true) {
            if (var5_9 != 0) {
                return;
            }
            switch (var8_11) {
                case 2: {
                    if (!var6_10) {
                        var7_12 = var1_1.getName();
                        if (var7_12.equals("group")) {
                            var7_12 = var4_8.b.this.e.obtainStyledAttributes(var2_2, a.i.MenuGroup);
                            var4_8.b = var7_12.getResourceId(a.i.MenuGroup_android_id, 0);
                            var4_8.c = var7_12.getInt(a.i.MenuGroup_android_menuCategory, 0);
                            var4_8.d = var7_12.getInt(a.i.MenuGroup_android_orderInCategory, 0);
                            var4_8.e = var7_12.getInt(a.i.MenuGroup_android_checkableBehavior, 0);
                            var4_8.f = var7_12.getBoolean(a.i.MenuGroup_android_visible, true);
                            var4_8.g = var7_12.getBoolean(a.i.MenuGroup_android_enabled, true);
                            var7_12.recycle();
                            ** break;
                        }
                        if (var7_12.equals("item")) {
                            var7_12 = var4_8.b.this.e.obtainStyledAttributes(var2_2, a.i.MenuItem);
                            var4_8.i = var7_12.getResourceId(a.i.MenuItem_android_id, 0);
                            var4_8.j = var7_12.getInt(a.i.MenuItem_android_menuCategory, var4_8.c) & -65536 | var7_12.getInt(a.i.MenuItem_android_orderInCategory, var4_8.d) & 65535;
                            var4_8.k = var7_12.getText(a.i.MenuItem_android_title);
                            var4_8.l = var7_12.getText(a.i.MenuItem_android_titleCondensed);
                            var4_8.m = var7_12.getResourceId(a.i.MenuItem_android_icon, 0);
                            var4_8.n = android.support.v7.internal.view.b$b.a(var7_12.getString(a.i.MenuItem_android_alphabeticShortcut));
                            var4_8.o = android.support.v7.internal.view.b$b.a(var7_12.getString(a.i.MenuItem_android_numericShortcut));
                            if (var7_12.hasValue(a.i.MenuItem_android_checkable)) {
                                var8_11 = var7_12.getBoolean(a.i.MenuItem_android_checkable, false) != false ? 1 : 0;
                                var4_8.p = var8_11;
                            } else {
                                var4_8.p = var4_8.e;
                            }
                            var4_8.q = var7_12.getBoolean(a.i.MenuItem_android_checked, false);
                            var4_8.r = var7_12.getBoolean(a.i.MenuItem_android_visible, var4_8.f);
                            var4_8.s = var7_12.getBoolean(a.i.MenuItem_android_enabled, var4_8.g);
                            var4_8.t = var7_12.getInt(a.i.MenuItem_showAsAction, -1);
                            var4_8.x = var7_12.getString(a.i.MenuItem_android_onClick);
                            var4_8.u = var7_12.getResourceId(a.i.MenuItem_actionLayout, 0);
                            var4_8.v = var7_12.getString(a.i.MenuItem_actionViewClass);
                            var4_8.w = var7_12.getString(a.i.MenuItem_actionProviderClass);
                            var8_11 = var4_8.w != null ? 1 : 0;
                            if (var8_11 != 0 && var4_8.u == 0 && var4_8.v == null) {
                                var4_8.y = (d)var4_8.a(var4_8.w, android.support.v7.internal.view.b.b, var4_8.b.this.d);
                            } else {
                                if (var8_11 != 0) {
                                    Log.w((String)"SupportMenuInflater", (String)"Ignoring attribute 'actionProviderClass'. Action view already specified.");
                                }
                                var4_8.y = null;
                            }
                            var7_12.recycle();
                            var4_8.h = false;
                            ** break;
                        }
                        if (var7_12.equals("menu")) {
                            this.a(var1_1, var2_2, (Menu)var4_8.b());
                            ** break;
                        }
                        var6_10 = true;
                        var3_6 = var7_12;
                        ** break;
                    }
                    ** GOTO lbl92
                }
                case 3: {
                    var7_12 = var1_1.getName();
                    if (var6_10 && var7_12.equals(var3_5)) {
                        var6_10 = false;
                        var3_7 = null;
                        ** break;
                    }
                    if (var7_12.equals("group")) {
                        var4_8.a();
                        ** break;
                    }
                    if (!var7_12.equals("item")) ** GOTO lbl90
                    if (!var4_8.h) {
                        if (var4_8.y != null && var4_8.y.e()) {
                            var4_8.b();
                            ** break;
                        }
                        var4_8.h = true;
                        var4_8.a(var4_8.a.add(var4_8.b, var4_8.i, var4_8.j, var4_8.k));
                        ** break;
                    }
                    ** GOTO lbl92
lbl90:
                    // 1 sources

                    if (var7_12.equals("menu")) {
                        var5_9 = 1;
                    }
                }
lbl92:
                // 14 sources

                default: {
                    var8_11 = var1_1.next();
                    continue block6;
                }
                case 1: 
            }
            break;
        }
        throw new RuntimeException("Unexpected end of document");
    }

    static /* synthetic */ Object b(b b2) {
        if (b2.f == null) {
            Context context = b2.e;
            while (!(context instanceof Activity) && context instanceof ContextWrapper) {
                context = ((ContextWrapper)context).getBaseContext();
            }
            b2.f = context;
        }
        return b2.f;
    }

    /*
     * Exception decompiling
     */
    public final void inflate(int var1_1, Menu var2_2) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [3[CATCHBLOCK]], but top level block is 5[CATCHBLOCK]
         * org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.processEndingBlocks(Op04StructuredStatement.java:429)
         * org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.buildNestedBlocks(Op04StructuredStatement.java:478)
         * org.benf.cfr.reader.bytecode.analysis.opgraph.Op03SimpleStatement.createInitialStructuredBlock(Op03SimpleStatement.java:728)
         * org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:806)
         * org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisOrWrapFail(CodeAnalyser.java:258)
         * org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysis(CodeAnalyser.java:192)
         * org.benf.cfr.reader.entities.attributes.AttributeCode.analyse(AttributeCode.java:94)
         * org.benf.cfr.reader.entities.Method.analyse(Method.java:521)
         * org.benf.cfr.reader.entities.ClassFile.analyseMid(ClassFile.java:1035)
         * org.benf.cfr.reader.entities.ClassFile.analyseTop(ClassFile.java:922)
         * org.benf.cfr.reader.Driver.doJarVersionTypes(Driver.java:253)
         * org.benf.cfr.reader.Driver.doJar(Driver.java:135)
         * org.benf.cfr.reader.CfrDriverImpl.analyse(CfrDriverImpl.java:65)
         * org.benf.cfr.reader.Main.main(Main.java:49)
         */
        throw new IllegalStateException(Decompilation failed);
    }

    private static final class a
    implements MenuItem.OnMenuItemClickListener {
        private static final Class<?>[] a = new Class[]{MenuItem.class};
        private Object b;
        private Method c;

        public a(Object object, String string) {
            this.b = object;
            Class<?> class_ = object.getClass();
            try {
                this.c = class_.getMethod(string, a);
                return;
            }
            catch (Exception exception) {
                string = new InflateException("Couldn't resolve menu item onClick handler " + string + " in class " + class_.getName());
                string.initCause((Throwable)exception);
                throw string;
            }
        }

        /*
         * Enabled force condition propagation
         * Lifted jumps to return sites
         */
        public final boolean onMenuItemClick(MenuItem menuItem) {
            boolean bl;
            block4: {
                bl = true;
                try {
                    if (this.c.getReturnType() != Boolean.TYPE) break block4;
                    return (Boolean)this.c.invoke(this.b, new Object[]{menuItem});
                }
                catch (Exception exception) {
                    throw new RuntimeException(exception);
                }
            }
            this.c.invoke(this.b, new Object[]{menuItem});
            return bl;
        }
    }

    private final class b {
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

        public b(Menu menu) {
            this.a = menu;
            this.a();
        }

        /*
         * Enabled force condition propagation
         * Lifted jumps to return sites
         */
        static char a(String string) {
            char c2 = '\u0000';
            c2 = string.charAt(0);
            if (string != null) return c2;
            return c2;
        }

        /*
         * WARNING - void declaration
         * Enabled force condition propagation
         * Lifted jumps to return sites
         */
        final <T> T a(String object, Class<?>[] object2, Object[] arrobject) {
            void var1_3;
            try {
                void var3_8;
                void var2_5;
                Object obj;
                Object obj2 = obj = b.this.e.getClassLoader().loadClass((String)object).getConstructor((Class<?>)var2_5).newInstance((Object[])var3_8);
            }
            catch (Exception exception) {
                Log.w((String)"SupportMenuInflater", (String)("Cannot instantiate class: " + object), (Throwable)exception);
                return var1_3;
            }
            return var1_3;
        }

        public final void a() {
            this.b = 0;
            this.c = 0;
            this.d = 0;
            this.e = 0;
            this.f = true;
            this.g = true;
        }

        /*
         * Enabled aggressive block sorting
         * Enabled unnecessary exception pruning
         * Enabled aggressive exception aggregation
         */
        final void a(MenuItem menuItem) {
            boolean bl = true;
            MenuItem menuItem2 = menuItem.setChecked(this.q).setVisible(this.r).setEnabled(this.s);
            boolean bl2 = this.p > 0;
            menuItem2.setCheckable(bl2).setTitleCondensed(this.l).setIcon(this.m).setAlphabeticShortcut(this.n).setNumericShortcut(this.o);
            if (this.t >= 0) {
                android.support.v4.view.k.a(menuItem, this.t);
            }
            if (this.x != null) {
                if (b.this.e.isRestricted()) {
                    throw new IllegalStateException("The android:onClick attribute cannot be used within a restricted context");
                }
                menuItem.setOnMenuItemClickListener((MenuItem.OnMenuItemClickListener)new a(android.support.v7.internal.view.b.b(b.this), this.x));
            }
            if (this.p >= 2) {
                if (menuItem instanceof f) {
                    ((f)menuItem).a(true);
                } else if (menuItem instanceof g) {
                    menuItem2 = (g)menuItem;
                    try {
                        if (menuItem2.e == null) {
                            menuItem2.e = ((android.support.v4.b.a.b)menuItem2.d).getClass().getDeclaredMethod("setExclusiveCheckable", Boolean.TYPE);
                        }
                        menuItem2.e.invoke(menuItem2.d, true);
                    }
                    catch (Exception exception) {
                        Log.w((String)"MenuItemWrapper", (String)"Error while calling setExclusiveCheckable", (Throwable)exception);
                    }
                }
            }
            if (this.v != null) {
                android.support.v4.view.k.a(menuItem, (View)this.a(this.v, a, b.this.c));
            } else {
                bl = false;
            }
            if (this.u > 0) {
                if (!bl) {
                    android.support.v4.view.k.b(menuItem, this.u);
                } else {
                    Log.w((String)"SupportMenuInflater", (String)"Ignoring attribute 'itemActionViewLayout'. Action view already specified.");
                }
            }
            if (this.y != null) {
                android.support.v4.view.k.a(menuItem, this.y);
            }
        }

        public final SubMenu b() {
            this.h = true;
            SubMenu subMenu = this.a.addSubMenu(this.b, this.i, this.j, this.k);
            this.a(subMenu.getItem());
            return subMenu;
        }
    }
}

