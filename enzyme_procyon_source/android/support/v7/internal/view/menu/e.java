// 
// Decompiled by Procyon v0.5.36
// 

package android.support.v7.internal.view.menu;

import java.util.Collection;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.Intent;
import android.content.ComponentName;
import android.support.v4.view.d;
import android.view.SubMenu;
import java.util.Iterator;
import android.view.MenuItem;
import android.view.KeyCharacterMap$KeyData;
import java.util.List;
import android.view.KeyEvent;
import java.lang.ref.WeakReference;
import java.util.concurrent.CopyOnWriteArrayList;
import android.view.ContextMenu$ContextMenuInfo;
import android.content.res.Resources;
import android.view.View;
import android.graphics.drawable.Drawable;
import java.util.ArrayList;
import android.content.Context;
import android.support.v4.b.a.a;

public class e implements android.support.v4.b.a.a
{
    private static final int[] i;
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
    private ContextMenu$ContextMenuInfo s;
    private boolean t;
    private boolean u;
    private boolean v;
    private ArrayList<f> w;
    private CopyOnWriteArrayList<WeakReference<j>> x;
    
    static {
        i = new int[] { 1, 4, 5, 3, 2, 0 };
    }
    
    public e(final Context a) {
        boolean l = true;
        this.r = 0;
        this.t = false;
        this.u = false;
        this.g = false;
        this.v = false;
        this.w = new ArrayList<f>();
        this.x = new CopyOnWriteArrayList<WeakReference<j>>();
        this.a = a;
        this.j = a.getResources();
        this.b = new ArrayList<f>();
        this.n = new ArrayList<f>();
        this.o = true;
        this.c = new ArrayList<f>();
        this.p = new ArrayList<f>();
        this.q = true;
        if (this.j.getConfiguration().keyboard == 1 || !this.j.getBoolean(android.support.v7.b.a.b.abc_config_showMenuShortcutsWhenKeyboardPresent)) {
            l = false;
        }
        this.l = l;
    }
    
    private static int a(final ArrayList<f> list, int n) {
        for (int i = list.size() - 1; i >= 0; --i) {
            if (list.get(i).a <= n) {
                n = i + 1;
                return n;
            }
        }
        n = 0;
        return n;
    }
    
    private f a(final int n, final KeyEvent keyEvent) {
        final ArrayList<f> w = this.w;
        w.clear();
        this.a(w, n, keyEvent);
        f f;
        if (w.isEmpty()) {
            f = null;
        }
        else {
            final int metaState = keyEvent.getMetaState();
            final KeyCharacterMap$KeyData keyCharacterMap$KeyData = new KeyCharacterMap$KeyData();
            keyEvent.getKeyData(keyCharacterMap$KeyData);
            final int size = w.size();
            if (size == 1) {
                f = w.get(0);
            }
            else {
                final boolean a = this.a();
                for (int i = 0; i < size; ++i) {
                    final f f2 = w.get(i);
                    char c;
                    if (a) {
                        c = f2.getAlphabeticShortcut();
                    }
                    else {
                        c = f2.getNumericShortcut();
                    }
                    if (c == keyCharacterMap$KeyData.meta[0]) {
                        f = f2;
                        if ((metaState & 0x2) == 0x0) {
                            return f;
                        }
                    }
                    if (c == keyCharacterMap$KeyData.meta[2]) {
                        f = f2;
                        if ((metaState & 0x2) != 0x0) {
                            return f;
                        }
                    }
                    if (a && c == '\b') {
                        f = f2;
                        if (n == 67) {
                            return f;
                        }
                    }
                }
                f = null;
            }
        }
        return f;
    }
    
    private MenuItem a(final int n, final int n2, final int n3, final CharSequence charSequence) {
        final int n4 = (0xFFFF0000 & n3) >> 16;
        if (n4 < 0 || n4 >= android.support.v7.internal.view.menu.e.i.length) {
            throw new IllegalArgumentException("order does not contain a valid category.");
        }
        final int n5 = android.support.v7.internal.view.menu.e.i[n4] << 16 | (0xFFFF & n3);
        final f element = new f(this, n, n2, n3, n5, charSequence, this.r);
        if (this.s != null) {
            element.e = this.s;
        }
        this.b.add(a(this.b, n5), element);
        this.b(true);
        return (MenuItem)element;
    }
    
    private void a(final int index, final boolean b) {
        if (index >= 0 && index < this.b.size()) {
            this.b.remove(index);
            if (b) {
                this.b(true);
            }
        }
    }
    
    private void a(final List<f> list, final int n, final KeyEvent keyEvent) {
        final boolean a = this.a();
        final int metaState = keyEvent.getMetaState();
        final KeyCharacterMap$KeyData keyCharacterMap$KeyData = new KeyCharacterMap$KeyData();
        if (keyEvent.getKeyData(keyCharacterMap$KeyData) || n == 67) {
            for (int size = this.b.size(), i = 0; i < size; ++i) {
                final f f = this.b.get(i);
                if (f.hasSubMenu()) {
                    ((e)f.getSubMenu()).a(list, n, keyEvent);
                }
                char c;
                if (a) {
                    c = f.getAlphabeticShortcut();
                }
                else {
                    c = f.getNumericShortcut();
                }
                if ((metaState & 0x5) == 0x0 && c != '\0' && (c == keyCharacterMap$KeyData.meta[0] || c == keyCharacterMap$KeyData.meta[2] || (a && c == '\b' && n == 67)) && f.isEnabled()) {
                    list.add(f);
                }
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
    
    protected final e a(final Drawable drawable) {
        this.a(null, drawable, null);
        return this;
    }
    
    protected final e a(final CharSequence charSequence) {
        this.a(charSequence, null, null);
        return this;
    }
    
    public void a(final a m) {
        this.m = m;
    }
    
    public final void a(final j referent, final Context context) {
        this.x.add(new WeakReference<j>(referent));
        referent.a(context, this);
        this.q = true;
    }
    
    final void a(final CharSequence d, final Drawable e, final View f) {
        if (f != null) {
            this.f = f;
            this.d = null;
            this.e = null;
        }
        else {
            if (d != null) {
                this.d = d;
            }
            if (e != null) {
                this.e = e;
            }
            this.f = null;
        }
        this.b(false);
    }
    
    public final void a(final boolean b) {
        if (!this.v) {
            this.v = true;
            for (final WeakReference<j> o : this.x) {
                final j j = o.get();
                if (j == null) {
                    this.x.remove(o);
                }
                else {
                    j.a(this, b);
                }
            }
            this.v = false;
        }
    }
    
    boolean a() {
        return this.k;
    }
    
    boolean a(final e e, final MenuItem menuItem) {
        return this.m != null && this.m.a();
    }
    
    public boolean a(final f h) {
        boolean b = false;
        if (!this.x.isEmpty()) {
            this.i();
            final Iterator<WeakReference<j>> iterator = this.x.iterator();
            int b2 = 0;
            while (true) {
                while (iterator.hasNext()) {
                    final WeakReference<j> o = iterator.next();
                    final j j = o.get();
                    if (j == null) {
                        this.x.remove(o);
                    }
                    else {
                        b2 = (j.b(h) ? 1 : 0);
                        if (b2 == 0) {
                            continue;
                        }
                        this.j();
                        b = (b2 != 0);
                        if (b2 != 0) {
                            this.h = h;
                            b = (b2 != 0);
                            return b;
                        }
                        return b;
                    }
                }
                continue;
            }
        }
        return b;
    }
    
    public final boolean a(final MenuItem menuItem, final int n) {
        int a = 0;
        final f f = (f)menuItem;
        boolean b;
        if (f == null || !f.isEnabled()) {
            b = false;
        }
        else {
            final boolean b2 = f.b();
            final d d = f.d;
            final boolean b3 = d != null && d.e();
            if (f.i()) {
                final boolean b4 = b = (f.expandActionView() | b2);
                if (b4) {
                    this.a(true);
                    b = b4;
                }
            }
            else if (f.hasSubMenu() || b3) {
                this.a(false);
                if (!f.hasSubMenu()) {
                    f.a(new m(this.a, this, f));
                }
                final m m = (m)f.getSubMenu();
                if (b3) {
                    d.a((SubMenu)m);
                }
                if (!this.x.isEmpty()) {
                    final Iterator<WeakReference<j>> iterator = this.x.iterator();
                    a = 0;
                    while (iterator.hasNext()) {
                        final WeakReference<j> o = iterator.next();
                        final j j = o.get();
                        if (j == null) {
                            this.x.remove(o);
                        }
                        else {
                            if (a != 0) {
                                continue;
                            }
                            a = (j.a(m) ? 1 : 0);
                        }
                    }
                }
                final boolean b5 = b = (((b2 ? 1 : 0) | a) != 0x0);
                if (!b5) {
                    this.a(true);
                    b = b5;
                }
            }
            else {
                if ((n & 0x1) == 0x0) {
                    this.a(true);
                }
                b = b2;
            }
        }
        return b;
    }
    
    public MenuItem add(final int n) {
        return this.a(0, 0, 0, this.j.getString(n));
    }
    
    public MenuItem add(final int n, final int n2, final int n3, final int n4) {
        return this.a(n, n2, n3, this.j.getString(n4));
    }
    
    public MenuItem add(final int n, final int n2, final int n3, final CharSequence charSequence) {
        return this.a(n, n2, n3, charSequence);
    }
    
    public MenuItem add(final CharSequence charSequence) {
        return this.a(0, 0, 0, charSequence);
    }
    
    public int addIntentOptions(final int n, final int n2, final int n3, final ComponentName componentName, final Intent[] array, final Intent intent, int i, final MenuItem[] array2) {
        final PackageManager packageManager = this.a.getPackageManager();
        final List queryIntentActivityOptions = packageManager.queryIntentActivityOptions(componentName, array, intent, 0);
        int size;
        if (queryIntentActivityOptions != null) {
            size = queryIntentActivityOptions.size();
        }
        else {
            size = 0;
        }
        if ((i & 0x1) == 0x0) {
            this.removeGroup(n);
        }
        ResolveInfo resolveInfo;
        Intent intent2;
        Intent intent3;
        MenuItem setIntent;
        for (i = 0; i < size; ++i) {
            resolveInfo = queryIntentActivityOptions.get(i);
            if (resolveInfo.specificIndex < 0) {
                intent2 = intent;
            }
            else {
                intent2 = array[resolveInfo.specificIndex];
            }
            intent3 = new Intent(intent2);
            intent3.setComponent(new ComponentName(resolveInfo.activityInfo.applicationInfo.packageName, resolveInfo.activityInfo.name));
            setIntent = this.add(n, n2, n3, resolveInfo.loadLabel(packageManager)).setIcon(resolveInfo.loadIcon(packageManager)).setIntent(intent3);
            if (array2 != null && resolveInfo.specificIndex >= 0) {
                array2[resolveInfo.specificIndex] = setIntent;
            }
        }
        return size;
    }
    
    public SubMenu addSubMenu(final int n) {
        return this.addSubMenu(0, 0, 0, this.j.getString(n));
    }
    
    public SubMenu addSubMenu(final int n, final int n2, final int n3, final int n4) {
        return this.addSubMenu(n, n2, n3, this.j.getString(n4));
    }
    
    public SubMenu addSubMenu(final int n, final int n2, final int n3, final CharSequence charSequence) {
        final f f = (f)this.a(n, n2, n3, charSequence);
        final m m = new m(this.a, this, f);
        f.a(m);
        return (SubMenu)m;
    }
    
    public SubMenu addSubMenu(final CharSequence charSequence) {
        return this.addSubMenu(0, 0, 0, charSequence);
    }
    
    public final void b(final boolean b) {
        if (!this.t) {
            if (b) {
                this.o = true;
                this.q = true;
            }
            if (!this.x.isEmpty()) {
                this.i();
                for (final WeakReference<j> o : this.x) {
                    final j j = o.get();
                    if (j == null) {
                        this.x.remove(o);
                    }
                    else {
                        j.a(b);
                    }
                }
                this.j();
            }
        }
        else {
            this.u = true;
        }
    }
    
    public boolean b() {
        return this.l;
    }
    
    public boolean b(final f f) {
        boolean b = false;
        if (!this.x.isEmpty()) {
            if (this.h == f) {
                this.i();
                final Iterator<WeakReference<j>> iterator = this.x.iterator();
                int c = 0;
                while (true) {
                    while (iterator.hasNext()) {
                        final WeakReference<j> o = iterator.next();
                        final j j = o.get();
                        if (j == null) {
                            this.x.remove(o);
                        }
                        else {
                            c = (j.c(f) ? 1 : 0);
                            if (c == 0) {
                                continue;
                            }
                            this.j();
                            b = (c != 0);
                            if (c != 0) {
                                this.h = null;
                                b = (c != 0);
                                return b;
                            }
                            return b;
                        }
                    }
                    continue;
                }
            }
            b = b;
        }
        return b;
    }
    
    final void c() {
        this.b(this.o = true);
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
        this.b(this.q = true);
    }
    
    public final ArrayList<f> e() {
        ArrayList<f> list;
        if (!this.o) {
            list = this.n;
        }
        else {
            this.n.clear();
            for (int size = this.b.size(), i = 0; i < size; ++i) {
                final f e = this.b.get(i);
                if (e.isVisible()) {
                    this.n.add(e);
                }
            }
            this.o = false;
            this.q = true;
            list = this.n;
        }
        return list;
    }
    
    public final void f() {
        final ArrayList<f> e = this.e();
        if (this.q) {
            final Iterator<WeakReference<j>> iterator = this.x.iterator();
            boolean b = false;
            while (iterator.hasNext()) {
                final WeakReference<j> o = iterator.next();
                final j j = o.get();
                if (j == null) {
                    this.x.remove(o);
                }
                else {
                    b |= j.a();
                }
            }
            if (b) {
                this.c.clear();
                this.p.clear();
                for (int size = e.size(), i = 0; i < size; ++i) {
                    final f f = e.get(i);
                    if (f.f()) {
                        this.c.add(f);
                    }
                    else {
                        this.p.add(f);
                    }
                }
            }
            else {
                this.c.clear();
                this.p.clear();
                this.p.addAll(this.e());
            }
            this.q = false;
        }
    }
    
    public MenuItem findItem(final int n) {
        for (int size = this.size(), i = 0; i < size; ++i) {
            Object item = this.b.get(i);
            if (((f)item).getItemId() == n || (((f)item).hasSubMenu() && (item = ((f)item).getSubMenu().findItem(n)) != null)) {
                return (MenuItem)item;
            }
        }
        Object item = null;
        return (MenuItem)item;
    }
    
    public final ArrayList<f> g() {
        this.f();
        return this.p;
    }
    
    public MenuItem getItem(final int index) {
        return (MenuItem)this.b.get(index);
    }
    
    public e h() {
        return this;
    }
    
    public boolean hasVisibleItems() {
        for (int size = this.size(), i = 0; i < size; ++i) {
            if (this.b.get(i).isVisible()) {
                return true;
            }
        }
        return false;
    }
    
    public boolean isShortcutKey(final int n, final KeyEvent keyEvent) {
        return this.a(n, keyEvent) != null;
    }
    
    public boolean performIdentifierAction(final int n, final int n2) {
        return this.a(this.findItem(n), n2);
    }
    
    public boolean performShortcut(final int n, final KeyEvent keyEvent, final int n2) {
        final f a = this.a(n, keyEvent);
        boolean a2 = false;
        if (a != null) {
            a2 = this.a((MenuItem)a, n2);
        }
        if ((n2 & 0x2) != 0x0) {
            this.a(true);
        }
        return a2;
    }
    
    public void removeGroup(final int n) {
        while (true) {
            for (int size = this.size(), i = 0; i < size; ++i) {
                if (this.b.get(i).getGroupId() == n) {
                    if (i >= 0) {
                        for (int size2 = this.b.size(), n2 = 0; n2 < size2 - i && this.b.get(i).getGroupId() == n; ++n2) {
                            this.a(i, false);
                        }
                        this.b(true);
                    }
                    return;
                }
            }
            int i = -1;
            continue;
        }
    }
    
    public void removeItem(final int n) {
        while (true) {
            for (int size = this.size(), i = 0; i < size; ++i) {
                if (this.b.get(i).getItemId() == n) {
                    this.a(i, true);
                    return;
                }
            }
            int i = -1;
            continue;
        }
    }
    
    public void setGroupCheckable(final int n, final boolean checkable, final boolean b) {
        for (int size = this.b.size(), i = 0; i < size; ++i) {
            final f f = this.b.get(i);
            if (f.getGroupId() == n) {
                f.a(b);
                f.setCheckable(checkable);
            }
        }
    }
    
    public void setGroupEnabled(final int n, final boolean enabled) {
        for (int size = this.b.size(), i = 0; i < size; ++i) {
            final f f = this.b.get(i);
            if (f.getGroupId() == n) {
                f.setEnabled(enabled);
            }
        }
    }
    
    public void setGroupVisible(final int n, final boolean b) {
        final int size = this.b.size();
        int i = 0;
        boolean b2 = false;
        while (i < size) {
            final f f = this.b.get(i);
            if (f.getGroupId() == n && f.b(b)) {
                b2 = true;
            }
            ++i;
        }
        if (b2) {
            this.b(true);
        }
    }
    
    public void setQwertyMode(final boolean k) {
        this.k = k;
        this.b(false);
    }
    
    public int size() {
        return this.b.size();
    }
    
    public interface a
    {
        boolean a();
    }
    
    public interface b
    {
        boolean a(final f p0);
    }
}
