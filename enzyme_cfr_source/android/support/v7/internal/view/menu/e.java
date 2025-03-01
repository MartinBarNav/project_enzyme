/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  android.content.ComponentName
 *  android.content.Context
 *  android.content.Intent
 *  android.content.pm.PackageManager
 *  android.content.pm.ResolveInfo
 *  android.content.res.Resources
 *  android.graphics.drawable.Drawable
 *  android.view.ContextMenu$ContextMenuInfo
 *  android.view.KeyCharacterMap$KeyData
 *  android.view.KeyEvent
 *  android.view.MenuItem
 *  android.view.SubMenu
 *  android.view.View
 */
package android.support.v7.internal.view.menu;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.support.v4.view.d;
import android.support.v7.b.a;
import android.support.v7.internal.view.menu.f;
import android.support.v7.internal.view.menu.j;
import android.support.v7.internal.view.menu.m;
import android.view.ContextMenu;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class e
implements android.support.v4.b.a.a {
    private static final int[] i = new int[]{1, 4, 5, 3, 2, 0};
    final Context a;
    ArrayList<f> b;
    public ArrayList<f> c;
    CharSequence d;
    Drawable e;
    View f;
    boolean g;
    f h;
    private final Resources j;
    private boolean k;
    private boolean l;
    private a m;
    private ArrayList<f> n;
    private boolean o;
    private ArrayList<f> p;
    private boolean q;
    private int r;
    private ContextMenu.ContextMenuInfo s;
    private boolean t;
    private boolean u;
    private boolean v;
    private ArrayList<f> w;
    private CopyOnWriteArrayList<WeakReference<j>> x;

    /*
     * Enabled aggressive block sorting
     */
    public e(Context context) {
        boolean bl = true;
        this.r = 0;
        this.t = false;
        this.u = false;
        this.g = false;
        this.v = false;
        this.w = new ArrayList();
        this.x = new CopyOnWriteArrayList();
        this.a = context;
        this.j = context.getResources();
        this.b = new ArrayList();
        this.n = new ArrayList();
        this.o = true;
        this.c = new ArrayList();
        this.p = new ArrayList();
        this.q = true;
        if (this.j.getConfiguration().keyboard == 1 || !this.j.getBoolean(a.b.abc_config_showMenuShortcutsWhenKeyboardPresent)) {
            bl = false;
        }
        this.l = bl;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private static int a(ArrayList<f> arrayList, int n2) {
        int n3 = arrayList.size() - 1;
        while (n3 >= 0) {
            if (arrayList.get((int)n3).a <= n2) {
                return n3 + 1;
            }
            --n3;
        }
        return 0;
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     */
    private f a(int n2, KeyEvent object) {
        void var2_4;
        ArrayList<f> arrayList = this.w;
        arrayList.clear();
        this.a((List<f>)arrayList, n2, (KeyEvent)object);
        if (arrayList.isEmpty()) {
            return var2_4;
        }
        int n3 = object.getMetaState();
        KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
        object.getKeyData(keyData);
        int n4 = arrayList.size();
        if (n4 == 1) {
            f f2 = arrayList.get(0);
            return var2_4;
        }
        boolean bl = this.a();
        int n5 = 0;
        while (n5 < n4) {
            f f3 = arrayList.get(n5);
            char c2 = bl ? f3.getAlphabeticShortcut() : f3.getNumericShortcut();
            if (c2 == keyData.meta[0]) {
                f f4 = f3;
                if ((n3 & 2) == 0) return var2_4;
            }
            if (c2 == keyData.meta[2]) {
                f f5 = f3;
                if ((n3 & 2) != 0) return var2_4;
            }
            if (bl && c2 == '\b') {
                f f6 = f3;
                if (n2 == 67) return var2_4;
            }
            ++n5;
        }
        return var2_4;
    }

    private MenuItem a(int n2, int n3, int n4, CharSequence object) {
        int n5 = (0xFFFF0000 & n4) >> 16;
        if (n5 < 0 || n5 >= i.length) {
            throw new IllegalArgumentException("order does not contain a valid category.");
        }
        n5 = i[n5] << 16 | 0xFFFF & n4;
        object = new f(this, n2, n3, n4, n5, (CharSequence)object, this.r);
        if (this.s != null) {
            ((f)object).e = this.s;
        }
        this.b.add(android.support.v7.internal.view.menu.e.a(this.b, n5), (f)object);
        this.b(true);
        return object;
    }

    /*
     * Enabled aggressive block sorting
     */
    private void a(int n2, boolean bl) {
        if (n2 < 0) return;
        if (n2 >= this.b.size()) {
            return;
        }
        this.b.remove(n2);
        if (!bl) return;
        this.b(true);
    }

    /*
     * Enabled aggressive block sorting
     */
    private void a(List<f> list, int n2, KeyEvent keyEvent) {
        boolean bl = this.a();
        int n3 = keyEvent.getMetaState();
        KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
        if (keyEvent.getKeyData(keyData) || n2 == 67) {
            int n4 = this.b.size();
            for (int i2 = 0; i2 < n4; ++i2) {
                f f2 = this.b.get(i2);
                if (f2.hasSubMenu()) {
                    ((e)f2.getSubMenu()).a(list, n2, keyEvent);
                }
                char c2 = bl ? f2.getAlphabeticShortcut() : f2.getNumericShortcut();
                if ((n3 & 5) != 0 || c2 == '\u0000' || c2 != keyData.meta[0] && c2 != keyData.meta[2] && (!bl || c2 != '\b' || n2 != 67) || !f2.isEnabled()) continue;
                list.add(f2);
            }
        }
    }

    private void i() {
        if (!this.t) {
            this.t = true;
            this.u = false;
        }
    }

    private void j() {
        this.t = false;
        if (this.u) {
            this.u = false;
            this.b(true);
        }
    }

    protected final e a(Drawable drawable) {
        this.a(null, drawable, null);
        return this;
    }

    protected final e a(CharSequence charSequence) {
        this.a(charSequence, null, null);
        return this;
    }

    public void a(a a2) {
        this.m = a2;
    }

    public final void a(j j2, Context context) {
        this.x.add(new WeakReference<j>(j2));
        j2.a(context, this);
        this.q = true;
    }

    /*
     * Enabled aggressive block sorting
     */
    final void a(CharSequence charSequence, Drawable drawable, View view) {
        if (view != null) {
            this.f = view;
            this.d = null;
            this.e = null;
        } else {
            if (charSequence != null) {
                this.d = charSequence;
            }
            if (drawable != null) {
                this.e = drawable;
            }
            this.f = null;
        }
        this.b(false);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final void a(boolean bl) {
        if (this.v) {
            return;
        }
        this.v = true;
        for (WeakReference<j> weakReference : this.x) {
            j j2 = (j)weakReference.get();
            if (j2 == null) {
                this.x.remove(weakReference);
                continue;
            }
            j2.a(this, bl);
        }
        this.v = false;
    }

    boolean a() {
        return this.k;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    boolean a(e e2, MenuItem menuItem) {
        if (this.m == null) return false;
        if (!this.m.a()) return false;
        return true;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public boolean a(f f2) {
        boolean bl = false;
        if (this.x.isEmpty()) {
            return bl;
        }
        this.i();
        Iterator<WeakReference<j>> iterator = this.x.iterator();
        boolean bl2 = false;
        while (iterator.hasNext()) {
            WeakReference<j> weakReference = iterator.next();
            j j2 = (j)weakReference.get();
            if (j2 == null) {
                this.x.remove(weakReference);
                continue;
            }
            bl2 = j2.b(f2);
            if (!bl2) continue;
        }
        this.j();
        bl = bl2;
        if (!bl2) return bl;
        this.h = f2;
        return bl2;
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     */
    public final boolean a(MenuItem object, int n2) {
        boolean bl;
        boolean bl2;
        block7: {
            Iterator<WeakReference<j>> iterator;
            m m2;
            Object object2;
            block8: {
                void var2_4;
                block6: {
                    bl2 = false;
                    f f2 = (f)object;
                    if (f2 == null) return false;
                    if (!f2.isEnabled()) {
                        return false;
                    }
                    bl = f2.b();
                    object2 = f2.d;
                    boolean bl3 = object2 != null && ((d)object2).e();
                    if (f2.i()) {
                        bl2 = bl = f2.expandActionView() | bl;
                        if (!bl) return bl2;
                        this.a(true);
                        return bl;
                    }
                    if (!f2.hasSubMenu() && !bl3) break block6;
                    this.a(false);
                    if (!f2.hasSubMenu()) {
                        f2.a(new m(this.a, this, f2));
                    }
                    m2 = (m)f2.getSubMenu();
                    if (bl3) {
                        ((d)object2).a(m2);
                    }
                    if (this.x.isEmpty()) break block7;
                    iterator = this.x.iterator();
                    bl2 = false;
                    break block8;
                }
                if ((var2_4 & 1) != 0) return bl;
                this.a(true);
                return bl;
            }
            while (iterator.hasNext()) {
                WeakReference<j> weakReference = iterator.next();
                object2 = (j)weakReference.get();
                if (object2 == null) {
                    this.x.remove(weakReference);
                    continue;
                }
                if (bl2) continue;
                bl2 = object2.a(m2);
            }
        }
        bl |= bl2;
        bl2 = bl;
        if (bl) return bl2;
        this.a(true);
        return bl;
    }

    public MenuItem add(int n2) {
        return this.a(0, 0, 0, this.j.getString(n2));
    }

    public MenuItem add(int n2, int n3, int n4, int n5) {
        return this.a(n2, n3, n4, this.j.getString(n5));
    }

    public MenuItem add(int n2, int n3, int n4, CharSequence charSequence) {
        return this.a(n2, n3, n4, charSequence);
    }

    public MenuItem add(CharSequence charSequence) {
        return this.a(0, 0, 0, charSequence);
    }

    /*
     * Enabled aggressive block sorting
     */
    public int addIntentOptions(int n2, int n3, int n4, ComponentName componentName, Intent[] arrintent, Intent intent, int n5, MenuItem[] arrmenuItem) {
        PackageManager packageManager = this.a.getPackageManager();
        List list = packageManager.queryIntentActivityOptions(componentName, arrintent, intent, 0);
        int n6 = list != null ? list.size() : 0;
        if ((n5 & 1) == 0) {
            this.removeGroup(n2);
        }
        n5 = 0;
        while (n5 < n6) {
            ResolveInfo resolveInfo = (ResolveInfo)list.get(n5);
            componentName = resolveInfo.specificIndex < 0 ? intent : arrintent[resolveInfo.specificIndex];
            componentName = new Intent((Intent)componentName);
            componentName.setComponent(new ComponentName(resolveInfo.activityInfo.applicationInfo.packageName, resolveInfo.activityInfo.name));
            componentName = this.add(n2, n3, n4, resolveInfo.loadLabel(packageManager)).setIcon(resolveInfo.loadIcon(packageManager)).setIntent((Intent)componentName);
            if (arrmenuItem != null && resolveInfo.specificIndex >= 0) {
                arrmenuItem[resolveInfo.specificIndex] = componentName;
            }
            ++n5;
        }
        return n6;
    }

    public SubMenu addSubMenu(int n2) {
        return this.addSubMenu(0, 0, 0, this.j.getString(n2));
    }

    public SubMenu addSubMenu(int n2, int n3, int n4, int n5) {
        return this.addSubMenu(n2, n3, n4, this.j.getString(n5));
    }

    public SubMenu addSubMenu(int n2, int n3, int n4, CharSequence object) {
        object = (f)this.a(n2, n3, n4, (CharSequence)object);
        m m2 = new m(this.a, this, (f)object);
        ((f)object).a(m2);
        return m2;
    }

    public SubMenu addSubMenu(CharSequence charSequence) {
        return this.addSubMenu(0, 0, 0, charSequence);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final void b(boolean bl) {
        if (!this.t) {
            if (bl) {
                this.o = true;
                this.q = true;
            }
            if (!this.x.isEmpty()) {
                this.i();
                for (WeakReference<j> weakReference : this.x) {
                    j j2 = (j)weakReference.get();
                    if (j2 == null) {
                        this.x.remove(weakReference);
                        continue;
                    }
                    j2.a(bl);
                }
                this.j();
            }
            return;
        }
        this.u = true;
    }

    public boolean b() {
        return this.l;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public boolean b(f f2) {
        boolean bl;
        boolean bl2 = bl = false;
        if (this.x.isEmpty()) return bl2;
        if (this.h != f2) {
            return bl;
        }
        this.i();
        Iterator<WeakReference<j>> iterator = this.x.iterator();
        bl = false;
        while (iterator.hasNext()) {
            WeakReference<j> weakReference = iterator.next();
            j j2 = (j)weakReference.get();
            if (j2 == null) {
                this.x.remove(weakReference);
                continue;
            }
            bl = j2.c(f2);
            if (!bl) continue;
        }
        this.j();
        bl2 = bl;
        if (!bl) return bl2;
        this.h = null;
        return bl;
    }

    final void c() {
        this.o = true;
        this.b(true);
    }

    public void clear() {
        if (this.h != null) {
            this.b(this.h);
        }
        this.b.clear();
        this.b(true);
    }

    public void clearHeader() {
        this.e = null;
        this.d = null;
        this.f = null;
        this.b(false);
    }

    public void close() {
        this.a(true);
    }

    final void d() {
        this.q = true;
        this.b(true);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final ArrayList<f> e() {
        if (!this.o) {
            return this.n;
        }
        this.n.clear();
        int n2 = this.b.size();
        for (int i2 = 0; i2 < n2; ++i2) {
            f f2 = this.b.get(i2);
            if (!f2.isVisible()) continue;
            this.n.add(f2);
        }
        this.o = false;
        this.q = true;
        return this.n;
    }

    /*
     * Enabled aggressive block sorting
     */
    public final void f() {
        Object object;
        ArrayList<f> arrayList = this.e();
        if (!this.q) {
            return;
        }
        Iterator<WeakReference<j>> iterator = this.x.iterator();
        int n2 = 0;
        while (iterator.hasNext()) {
            object = iterator.next();
            j j2 = (j)((Reference)object).get();
            if (j2 == null) {
                this.x.remove(object);
                continue;
            }
            n2 = j2.a() | n2;
        }
        if (n2 == 0) {
            this.c.clear();
            this.p.clear();
            this.p.addAll(this.e());
        } else {
            this.c.clear();
            this.p.clear();
            int n3 = arrayList.size();
            for (n2 = 0; n2 < n3; ++n2) {
                object = arrayList.get(n2);
                if (((f)object).f()) {
                    this.c.add((f)object);
                    continue;
                }
                this.p.add((f)object);
            }
        }
        this.q = false;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public MenuItem findItem(int n2) {
        int n3 = this.size();
        int n4 = 0;
        while (n4 < n3) {
            f f2 = this.b.get(n4);
            if (f2.getItemId() == n2) {
                return f2;
            }
            if (f2.hasSubMenu()) {
                MenuItem menuItem = f2.getSubMenu().findItem(n2);
                f2 = menuItem;
                if (menuItem != null) return f2;
            }
            ++n4;
        }
        return null;
    }

    public final ArrayList<f> g() {
        this.f();
        return this.p;
    }

    public MenuItem getItem(int n2) {
        return this.b.get(n2);
    }

    public e h() {
        return this;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public boolean hasVisibleItems() {
        int n2 = this.size();
        int n3 = 0;
        while (n3 < n2) {
            if (this.b.get(n3).isVisible()) {
                return true;
            }
            ++n3;
        }
        return false;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public boolean isShortcutKey(int n2, KeyEvent keyEvent) {
        if (this.a(n2, keyEvent) == null) return false;
        return true;
    }

    public boolean performIdentifierAction(int n2, int n3) {
        return this.a(this.findItem(n2), n3);
    }

    public boolean performShortcut(int n2, KeyEvent object, int n3) {
        object = this.a(n2, (KeyEvent)object);
        boolean bl = false;
        if (object != null) {
            bl = this.a((MenuItem)object, n3);
        }
        if ((n3 & 2) != 0) {
            this.a(true);
        }
        return bl;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public void removeGroup(int n2) {
        block3: {
            int n3 = this.size();
            int n4 = 0;
            while (n4 < n3) {
                if (this.b.get(n4).getGroupId() == n2) {
                    if (n4 < 0) return;
                    int n5 = this.b.size();
                    for (n3 = 0; n3 < n5 - n4 && this.b.get(n4).getGroupId() == n2; ++n3) {
                        this.a(n4, false);
                    }
                    break block3;
                }
                ++n4;
            }
            return;
        }
        this.b(true);
    }

    /*
     * Enabled aggressive block sorting
     */
    public void removeItem(int n2) {
        int n3;
        block2: {
            int n4 = this.size();
            for (n3 = 0; n3 < n4; ++n3) {
                if (this.b.get(n3).getItemId() != n2) {
                    continue;
                }
                break block2;
            }
            n3 = -1;
        }
        this.a(n3, true);
    }

    public void setGroupCheckable(int n2, boolean bl, boolean bl2) {
        int n3 = this.b.size();
        for (int i2 = 0; i2 < n3; ++i2) {
            f f2 = this.b.get(i2);
            if (f2.getGroupId() != n2) continue;
            f2.a(bl2);
            f2.setCheckable(bl);
        }
    }

    public void setGroupEnabled(int n2, boolean bl) {
        int n3 = this.b.size();
        for (int i2 = 0; i2 < n3; ++i2) {
            f f2 = this.b.get(i2);
            if (f2.getGroupId() != n2) continue;
            f2.setEnabled(bl);
        }
    }

    public void setGroupVisible(int n2, boolean bl) {
        int n3 = this.b.size();
        boolean bl2 = false;
        for (int i2 = 0; i2 < n3; ++i2) {
            f f2 = this.b.get(i2);
            if (f2.getGroupId() != n2 || !f2.b(bl)) continue;
            bl2 = true;
        }
        if (bl2) {
            this.b(true);
        }
    }

    public void setQwertyMode(boolean bl) {
        this.k = bl;
        this.b(false);
    }

    public int size() {
        return this.b.size();
    }

    public static interface a {
        public boolean a();
    }

    public static interface b {
        public boolean a(f var1);
    }
}

