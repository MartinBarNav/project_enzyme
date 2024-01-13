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
import android.view.ContextMenu;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class e implements android.support.v4.b.a.a {
    private static final int[] i = {1, 4, 5, 3, 2, 0};
    final Context a;
    ArrayList<f> b;
    public ArrayList<f> c;
    CharSequence d;
    Drawable e;
    View f;
    boolean g = false;
    f h;
    private final Resources j;
    private boolean k;
    private boolean l;
    private a m;
    private ArrayList<f> n;
    private boolean o;
    private ArrayList<f> p;
    private boolean q;
    private int r = 0;
    private ContextMenu.ContextMenuInfo s;
    private boolean t = false;
    private boolean u = false;
    private boolean v = false;
    private ArrayList<f> w = new ArrayList<>();
    private CopyOnWriteArrayList<WeakReference<j>> x = new CopyOnWriteArrayList<>();

    public interface a {
        boolean a();
    }

    public interface b {
        boolean a(f fVar);
    }

    public e(Context context) {
        boolean z = true;
        this.a = context;
        this.j = context.getResources();
        this.b = new ArrayList<>();
        this.n = new ArrayList<>();
        this.o = true;
        this.c = new ArrayList<>();
        this.p = new ArrayList<>();
        this.q = true;
        this.l = (this.j.getConfiguration().keyboard == 1 || !this.j.getBoolean(a.b.abc_config_showMenuShortcutsWhenKeyboardPresent)) ? false : z;
    }

    public final void a(j jVar, Context context) {
        this.x.add(new WeakReference(jVar));
        jVar.a(context, this);
        this.q = true;
    }

    public void a(a aVar) {
        this.m = aVar;
    }

    public MenuItem add(CharSequence charSequence) {
        return a(0, 0, 0, charSequence);
    }

    public MenuItem add(int i2) {
        return a(0, 0, 0, this.j.getString(i2));
    }

    public MenuItem add(int i2, int i3, int i4, CharSequence charSequence) {
        return a(i2, i3, i4, charSequence);
    }

    public MenuItem add(int i2, int i3, int i4, int i5) {
        return a(i2, i3, i4, this.j.getString(i5));
    }

    public SubMenu addSubMenu(CharSequence charSequence) {
        return addSubMenu(0, 0, 0, charSequence);
    }

    public SubMenu addSubMenu(int i2) {
        return addSubMenu(0, 0, 0, (CharSequence) this.j.getString(i2));
    }

    public SubMenu addSubMenu(int i2, int i3, int i4, CharSequence charSequence) {
        f fVar = (f) a(i2, i3, i4, charSequence);
        m mVar = new m(this.a, this, fVar);
        fVar.a(mVar);
        return mVar;
    }

    public SubMenu addSubMenu(int i2, int i3, int i4, int i5) {
        return addSubMenu(i2, i3, i4, (CharSequence) this.j.getString(i5));
    }

    public int addIntentOptions(int i2, int i3, int i4, ComponentName componentName, Intent[] intentArr, Intent intent, int i5, MenuItem[] menuItemArr) {
        Intent intent2;
        PackageManager packageManager = this.a.getPackageManager();
        List<ResolveInfo> queryIntentActivityOptions = packageManager.queryIntentActivityOptions(componentName, intentArr, intent, 0);
        int size = queryIntentActivityOptions != null ? queryIntentActivityOptions.size() : 0;
        if ((i5 & 1) == 0) {
            removeGroup(i2);
        }
        for (int i6 = 0; i6 < size; i6++) {
            ResolveInfo resolveInfo = queryIntentActivityOptions.get(i6);
            if (resolveInfo.specificIndex < 0) {
                intent2 = intent;
            } else {
                intent2 = intentArr[resolveInfo.specificIndex];
            }
            Intent intent3 = new Intent(intent2);
            intent3.setComponent(new ComponentName(resolveInfo.activityInfo.applicationInfo.packageName, resolveInfo.activityInfo.name));
            MenuItem intent4 = add(i2, i3, i4, resolveInfo.loadLabel(packageManager)).setIcon(resolveInfo.loadIcon(packageManager)).setIntent(intent3);
            if (menuItemArr != null && resolveInfo.specificIndex >= 0) {
                menuItemArr[resolveInfo.specificIndex] = intent4;
            }
        }
        return size;
    }

    public void removeGroup(int i2) {
        int i3;
        int size = size();
        int i4 = 0;
        while (true) {
            if (i4 >= size) {
                i3 = -1;
                break;
            } else if (this.b.get(i4).getGroupId() == i2) {
                i3 = i4;
                break;
            } else {
                i4++;
            }
        }
        if (i3 >= 0) {
            int size2 = this.b.size() - i3;
            int i5 = 0;
            while (true) {
                int i6 = i5 + 1;
                if (i5 >= size2 || this.b.get(i3).getGroupId() != i2) {
                    b(true);
                } else {
                    a(i3, false);
                    i5 = i6;
                }
            }
            b(true);
        }
    }

    private void a(int i2, boolean z) {
        if (i2 >= 0 && i2 < this.b.size()) {
            this.b.remove(i2);
            if (z) {
                b(true);
            }
        }
    }

    public void clear() {
        if (this.h != null) {
            b(this.h);
        }
        this.b.clear();
        b(true);
    }

    public void setGroupCheckable(int i2, boolean z, boolean z2) {
        int size = this.b.size();
        for (int i3 = 0; i3 < size; i3++) {
            f fVar = this.b.get(i3);
            if (fVar.getGroupId() == i2) {
                fVar.a(z2);
                fVar.setCheckable(z);
            }
        }
    }

    public void setGroupVisible(int i2, boolean z) {
        boolean z2;
        int size = this.b.size();
        int i3 = 0;
        boolean z3 = false;
        while (i3 < size) {
            f fVar = this.b.get(i3);
            if (fVar.getGroupId() != i2 || !fVar.b(z)) {
                z2 = z3;
            } else {
                z2 = true;
            }
            i3++;
            z3 = z2;
        }
        if (z3) {
            b(true);
        }
    }

    public void setGroupEnabled(int i2, boolean z) {
        int size = this.b.size();
        for (int i3 = 0; i3 < size; i3++) {
            f fVar = this.b.get(i3);
            if (fVar.getGroupId() == i2) {
                fVar.setEnabled(z);
            }
        }
    }

    public boolean hasVisibleItems() {
        int size = size();
        for (int i2 = 0; i2 < size; i2++) {
            if (this.b.get(i2).isVisible()) {
                return true;
            }
        }
        return false;
    }

    public MenuItem findItem(int i2) {
        MenuItem findItem;
        int size = size();
        for (int i3 = 0; i3 < size; i3++) {
            f fVar = this.b.get(i3);
            if (fVar.getItemId() == i2) {
                return fVar;
            }
            if (fVar.hasSubMenu() && (findItem = fVar.getSubMenu().findItem(i2)) != null) {
                return findItem;
            }
        }
        return null;
    }

    public int size() {
        return this.b.size();
    }

    public MenuItem getItem(int i2) {
        return this.b.get(i2);
    }

    public boolean isShortcutKey(int i2, KeyEvent keyEvent) {
        return a(i2, keyEvent) != null;
    }

    public void setQwertyMode(boolean z) {
        this.k = z;
        b(false);
    }

    /* access modifiers changed from: package-private */
    public boolean a() {
        return this.k;
    }

    public boolean b() {
        return this.l;
    }

    /* access modifiers changed from: package-private */
    public boolean a(e eVar, MenuItem menuItem) {
        return this.m != null && this.m.a();
    }

    private static int a(ArrayList<f> arrayList, int i2) {
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            if (arrayList.get(size).a <= i2) {
                return size + 1;
            }
        }
        return 0;
    }

    public boolean performShortcut(int i2, KeyEvent keyEvent, int i3) {
        f a2 = a(i2, keyEvent);
        boolean z = false;
        if (a2 != null) {
            z = a((MenuItem) a2, i3);
        }
        if ((i3 & 2) != 0) {
            a(true);
        }
        return z;
    }

    private void a(List<f> list, int i2, KeyEvent keyEvent) {
        boolean a2 = a();
        int metaState = keyEvent.getMetaState();
        KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
        if (keyEvent.getKeyData(keyData) || i2 == 67) {
            int size = this.b.size();
            for (int i3 = 0; i3 < size; i3++) {
                f fVar = this.b.get(i3);
                if (fVar.hasSubMenu()) {
                    ((e) fVar.getSubMenu()).a(list, i2, keyEvent);
                }
                char alphabeticShortcut = a2 ? fVar.getAlphabeticShortcut() : fVar.getNumericShortcut();
                if ((metaState & 5) == 0 && alphabeticShortcut != 0 && ((alphabeticShortcut == keyData.meta[0] || alphabeticShortcut == keyData.meta[2] || (a2 && alphabeticShortcut == 8 && i2 == 67)) && fVar.isEnabled())) {
                    list.add(fVar);
                }
            }
        }
    }

    private f a(int i2, KeyEvent keyEvent) {
        ArrayList<f> arrayList = this.w;
        arrayList.clear();
        a((List<f>) arrayList, i2, keyEvent);
        if (arrayList.isEmpty()) {
            return null;
        }
        int metaState = keyEvent.getMetaState();
        KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
        keyEvent.getKeyData(keyData);
        int size = arrayList.size();
        if (size == 1) {
            return arrayList.get(0);
        }
        boolean a2 = a();
        for (int i3 = 0; i3 < size; i3++) {
            f fVar = arrayList.get(i3);
            char alphabeticShortcut = a2 ? fVar.getAlphabeticShortcut() : fVar.getNumericShortcut();
            if (alphabeticShortcut == keyData.meta[0] && (metaState & 2) == 0) {
                return fVar;
            }
            if (alphabeticShortcut == keyData.meta[2] && (metaState & 2) != 0) {
                return fVar;
            }
            if (a2 && alphabeticShortcut == 8 && i2 == 67) {
                return fVar;
            }
        }
        return null;
    }

    public boolean performIdentifierAction(int i2, int i3) {
        return a(findItem(i2), i3);
    }

    public final boolean a(MenuItem menuItem, int i2) {
        boolean z;
        boolean z2;
        boolean z3 = false;
        f fVar = (f) menuItem;
        if (fVar == null || !fVar.isEnabled()) {
            return false;
        }
        boolean b2 = fVar.b();
        d dVar = fVar.d;
        if (dVar == null || !dVar.e()) {
            z = false;
        } else {
            z = true;
        }
        if (fVar.i()) {
            boolean expandActionView = fVar.expandActionView() | b2;
            if (!expandActionView) {
                return expandActionView;
            }
            a(true);
            return expandActionView;
        } else if (fVar.hasSubMenu() || z) {
            a(false);
            if (!fVar.hasSubMenu()) {
                fVar.a(new m(this.a, this, fVar));
            }
            m mVar = (m) fVar.getSubMenu();
            if (z) {
                dVar.a((SubMenu) mVar);
            }
            if (!this.x.isEmpty()) {
                Iterator<WeakReference<j>> it = this.x.iterator();
                boolean z4 = false;
                while (it.hasNext()) {
                    WeakReference next = it.next();
                    j jVar = (j) next.get();
                    if (jVar == null) {
                        this.x.remove(next);
                    } else {
                        if (!z4) {
                            z2 = jVar.a(mVar);
                        } else {
                            z2 = z4;
                        }
                        z4 = z2;
                    }
                }
                z3 = z4;
            }
            boolean z5 = b2 | z3;
            if (z5) {
                return z5;
            }
            a(true);
            return z5;
        } else {
            if ((i2 & 1) == 0) {
                a(true);
            }
            return b2;
        }
    }

    public final void a(boolean z) {
        if (!this.v) {
            this.v = true;
            Iterator<WeakReference<j>> it = this.x.iterator();
            while (it.hasNext()) {
                WeakReference next = it.next();
                j jVar = (j) next.get();
                if (jVar == null) {
                    this.x.remove(next);
                } else {
                    jVar.a(this, z);
                }
            }
            this.v = false;
        }
    }

    public void close() {
        a(true);
    }

    public final void b(boolean z) {
        if (!this.t) {
            if (z) {
                this.o = true;
                this.q = true;
            }
            if (!this.x.isEmpty()) {
                i();
                Iterator<WeakReference<j>> it = this.x.iterator();
                while (it.hasNext()) {
                    WeakReference next = it.next();
                    j jVar = (j) next.get();
                    if (jVar == null) {
                        this.x.remove(next);
                    } else {
                        jVar.a(z);
                    }
                }
                j();
                return;
            }
            return;
        }
        this.u = true;
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
            b(true);
        }
    }

    /* access modifiers changed from: package-private */
    public final void c() {
        this.o = true;
        b(true);
    }

    /* access modifiers changed from: package-private */
    public final void d() {
        this.q = true;
        b(true);
    }

    public final ArrayList<f> e() {
        if (!this.o) {
            return this.n;
        }
        this.n.clear();
        int size = this.b.size();
        for (int i2 = 0; i2 < size; i2++) {
            f fVar = this.b.get(i2);
            if (fVar.isVisible()) {
                this.n.add(fVar);
            }
        }
        this.o = false;
        this.q = true;
        return this.n;
    }

    public final void f() {
        ArrayList<f> e2 = e();
        if (this.q) {
            Iterator<WeakReference<j>> it = this.x.iterator();
            boolean z = false;
            while (it.hasNext()) {
                WeakReference next = it.next();
                j jVar = (j) next.get();
                if (jVar == null) {
                    this.x.remove(next);
                } else {
                    z = jVar.a() | z;
                }
            }
            if (z) {
                this.c.clear();
                this.p.clear();
                int size = e2.size();
                for (int i2 = 0; i2 < size; i2++) {
                    f fVar = e2.get(i2);
                    if (fVar.f()) {
                        this.c.add(fVar);
                    } else {
                        this.p.add(fVar);
                    }
                }
            } else {
                this.c.clear();
                this.p.clear();
                this.p.addAll(e());
            }
            this.q = false;
        }
    }

    public final ArrayList<f> g() {
        f();
        return this.p;
    }

    public void clearHeader() {
        this.e = null;
        this.d = null;
        this.f = null;
        b(false);
    }

    /* access modifiers changed from: package-private */
    public final void a(CharSequence charSequence, Drawable drawable, View view) {
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
        b(false);
    }

    /* access modifiers changed from: protected */
    public final e a(CharSequence charSequence) {
        a(charSequence, (Drawable) null, (View) null);
        return this;
    }

    /* access modifiers changed from: protected */
    public final e a(Drawable drawable) {
        a((CharSequence) null, drawable, (View) null);
        return this;
    }

    public e h() {
        return this;
    }

    public boolean a(f fVar) {
        boolean z = false;
        if (!this.x.isEmpty()) {
            i();
            Iterator<WeakReference<j>> it = this.x.iterator();
            boolean z2 = false;
            while (true) {
                if (!it.hasNext()) {
                    z = z2;
                    break;
                }
                WeakReference next = it.next();
                j jVar = (j) next.get();
                if (jVar == null) {
                    this.x.remove(next);
                } else {
                    z = jVar.b(fVar);
                    if (z) {
                        break;
                    }
                    z2 = z;
                }
            }
            j();
            if (z) {
                this.h = fVar;
            }
        }
        return z;
    }

    public boolean b(f fVar) {
        boolean z = false;
        if (!this.x.isEmpty() && this.h == fVar) {
            i();
            Iterator<WeakReference<j>> it = this.x.iterator();
            boolean z2 = false;
            while (true) {
                if (!it.hasNext()) {
                    z = z2;
                    break;
                }
                WeakReference next = it.next();
                j jVar = (j) next.get();
                if (jVar == null) {
                    this.x.remove(next);
                } else {
                    z = jVar.c(fVar);
                    if (z) {
                        break;
                    }
                    z2 = z;
                }
            }
            j();
            if (z) {
                this.h = null;
            }
        }
        return z;
    }

    private MenuItem a(int i2, int i3, int i4, CharSequence charSequence) {
        int i5 = (-65536 & i4) >> 16;
        if (i5 < 0 || i5 >= i.length) {
            throw new IllegalArgumentException("order does not contain a valid category.");
        }
        int i6 = (i[i5] << 16) | (65535 & i4);
        f fVar = new f(this, i2, i3, i4, i6, charSequence, this.r);
        if (this.s != null) {
            fVar.e = this.s;
        }
        this.b.add(a(this.b, i6), fVar);
        b(true);
        return fVar;
    }

    public void removeItem(int i2) {
        int i3;
        int size = size();
        int i4 = 0;
        while (true) {
            if (i4 >= size) {
                i3 = -1;
                break;
            } else if (this.b.get(i4).getItemId() == i2) {
                i3 = i4;
                break;
            } else {
                i4++;
            }
        }
        a(i3, true);
    }
}
