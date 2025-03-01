package android.support.v4.app;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.os.Parcelable;
import android.support.v4.app.c;
import android.support.v4.app.l;
import android.support.v4.e.g;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;

public class e extends Activity {
    final Handler a = new Handler() {
        public final void handleMessage(Message message) {
            switch (message.what) {
                case 1:
                    if (e.this.f) {
                        e.this.a(false);
                        return;
                    }
                    return;
                case 2:
                    e.this.b.g();
                    e.this.b.a();
                    return;
                default:
                    super.handleMessage(message);
                    return;
            }
        }
    };
    final h b = new h();
    final f c = new f() {
        public final View a(int i) {
            return e.this.findViewById(i);
        }

        public final boolean a() {
            Window window = e.this.getWindow();
            return (window == null || window.peekDecorView() == null) ? false : true;
        }
    };
    boolean d;
    boolean e;
    boolean f;
    boolean g;
    boolean h;
    boolean i;
    boolean j;
    boolean k;
    g<String, l> l;
    l m;

    static final class a {
        Object a;
        Object b;
        g<String, Object> c;
        ArrayList<d> d;
        g<String, l> e;

        a() {
        }
    }

    /* access modifiers changed from: protected */
    public void onActivityResult(int i2, int i3, Intent intent) {
        this.b.s = false;
        int i4 = i2 >> 16;
        if (i4 != 0) {
            int i5 = i4 - 1;
            if (this.b.f == null || i5 < 0 || i5 >= this.b.f.size()) {
                Log.w("FragmentActivity", "Activity result fragment index out of range: 0x" + Integer.toHexString(i2));
            } else if (this.b.f.get(i5) == null) {
                Log.w("FragmentActivity", "Activity result no fragment exists for index: 0x" + Integer.toHexString(i2));
            } else {
                d.b();
            }
        } else {
            super.onActivityResult(i2, i3, intent);
        }
    }

    public void onBackPressed() {
        int size;
        boolean z = false;
        h hVar = this.b;
        if (hVar.s) {
            throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
        } else if (hVar.u != null) {
            throw new IllegalStateException("Can not perform this action inside of " + hVar.u);
        } else {
            hVar.a();
            if (hVar.i != null && hVar.i.size() - 1 >= 0) {
                c remove = hVar.i.remove(size);
                SparseArray sparseArray = new SparseArray();
                SparseArray sparseArray2 = new SparseArray();
                remove.a((SparseArray<d>) sparseArray, (SparseArray<d>) sparseArray2);
                remove.a((c.b) null, (SparseArray<d>) sparseArray, (SparseArray<d>) sparseArray2);
                hVar.b();
                z = true;
            }
            if (z) {
                return;
            }
            if (Build.VERSION.SDK_INT >= 21) {
                a.a(this);
            } else {
                finish();
            }
        }
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.b.a(configuration);
    }

    public void onCreate(Bundle bundle) {
        ArrayList<d> arrayList;
        this.b.a(this, this.c, (d) null);
        if (getLayoutInflater().getFactory() == null) {
            getLayoutInflater().setFactory(this);
        }
        super.onCreate(bundle);
        a aVar = (a) getLastNonConfigurationInstance();
        if (aVar != null) {
            this.l = aVar.e;
        }
        if (bundle != null) {
            Parcelable parcelable = bundle.getParcelable("android:support:fragments");
            h hVar = this.b;
            if (aVar != null) {
                arrayList = aVar.d;
            } else {
                arrayList = null;
            }
            hVar.a(parcelable, arrayList);
        }
        this.b.d();
    }

    public boolean onCreatePanelMenu(int i2, Menu menu) {
        if (i2 != 0) {
            return super.onCreatePanelMenu(i2, menu);
        }
        boolean onCreatePanelMenu = super.onCreatePanelMenu(i2, menu) | this.b.a(menu, getMenuInflater());
        if (Build.VERSION.SDK_INT >= 11) {
            return onCreatePanelMenu;
        }
        return true;
    }

    public View onCreateView(String str, Context context, AttributeSet attributeSet) {
        if (!"fragment".equals(str)) {
            return super.onCreateView(str, context, attributeSet);
        }
        View onCreateView = this.b.onCreateView(str, context, attributeSet);
        if (onCreateView == null) {
            return super.onCreateView(str, context, attributeSet);
        }
        return onCreateView;
    }

    public void onDestroy() {
        super.onDestroy();
        a(false);
        this.b.i();
        if (this.m != null) {
            this.m.g();
        }
    }

    public boolean onKeyDown(int i2, KeyEvent keyEvent) {
        if (Build.VERSION.SDK_INT >= 5 || i2 != 4 || keyEvent.getRepeatCount() != 0) {
            return super.onKeyDown(i2, keyEvent);
        }
        onBackPressed();
        return true;
    }

    public void onLowMemory() {
        super.onLowMemory();
        this.b.j();
    }

    public boolean onMenuItemSelected(int i2, MenuItem menuItem) {
        if (super.onMenuItemSelected(i2, menuItem)) {
            return true;
        }
        switch (i2) {
            case 0:
                return this.b.a(menuItem);
            case 6:
                return this.b.b(menuItem);
            default:
                return false;
        }
    }

    public void onPanelClosed(int i2, Menu menu) {
        switch (i2) {
            case 0:
                this.b.b(menu);
                break;
        }
        super.onPanelClosed(i2, menu);
    }

    public void onPause() {
        super.onPause();
        this.e = false;
        if (this.a.hasMessages(2)) {
            this.a.removeMessages(2);
            this.b.g();
        }
        this.b.a(4);
    }

    /* access modifiers changed from: protected */
    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        this.b.s = false;
    }

    public void onResume() {
        super.onResume();
        this.a.sendEmptyMessage(2);
        this.e = true;
        this.b.a();
    }

    /* access modifiers changed from: protected */
    public void onPostResume() {
        super.onPostResume();
        this.a.removeMessages(2);
        this.b.g();
        this.b.a();
    }

    public boolean onPreparePanel(int i2, View view, Menu menu) {
        if (i2 != 0 || menu == null) {
            return super.onPreparePanel(i2, view, menu);
        }
        if (this.i) {
            this.i = false;
            menu.clear();
            onCreatePanelMenu(i2, menu);
        }
        return super.onPreparePanel(0, view, menu) | this.b.a(menu);
    }

    public final Object onRetainNonConfigurationInstance() {
        ArrayList<d> arrayList;
        boolean z;
        if (this.f) {
            a(true);
        }
        h hVar = this.b;
        if (hVar.f != null) {
            arrayList = null;
            for (int i2 = 0; i2 < hVar.f.size(); i2++) {
                d dVar = hVar.f.get(i2);
                if (dVar != null && dVar.C) {
                    if (arrayList == null) {
                        arrayList = new ArrayList<>();
                    }
                    arrayList.add(dVar);
                    dVar.D = true;
                    dVar.k = dVar.j != null ? dVar.j.g : -1;
                    if (h.a) {
                        Log.v("FragmentManager", "retainNonConfig: keeping retained " + dVar);
                    }
                }
            }
        } else {
            arrayList = null;
        }
        if (this.l != null) {
            int size = this.l.size();
            l[] lVarArr = new l[size];
            for (int i3 = size - 1; i3 >= 0; i3--) {
                lVarArr[i3] = this.l.c(i3);
            }
            z = false;
            for (int i4 = 0; i4 < size; i4++) {
                l lVar = lVarArr[i4];
                if (lVar.g) {
                    z = true;
                } else {
                    lVar.g();
                    this.l.remove(lVar.d);
                }
            }
        } else {
            z = false;
        }
        if (arrayList == null && !z) {
            return null;
        }
        a aVar = new a();
        aVar.a = null;
        aVar.b = null;
        aVar.c = null;
        aVar.d = arrayList;
        aVar.e = this.l;
        return aVar;
    }

    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        Parcelable c2 = this.b.c();
        if (c2 != null) {
            bundle.putParcelable("android:support:fragments", c2);
        }
    }

    /* access modifiers changed from: protected */
    public void onStart() {
        super.onStart();
        this.f = false;
        this.g = false;
        this.a.removeMessages(1);
        if (!this.d) {
            this.d = true;
            this.b.e();
        }
        this.b.s = false;
        this.b.a();
        if (!this.k) {
            this.k = true;
            if (this.m != null) {
                this.m.b();
            } else if (!this.j) {
                this.m = b("(root)");
                if (this.m != null && !this.m.f) {
                    this.m.b();
                }
            }
            this.j = true;
        }
        this.b.f();
        if (this.l != null) {
            int size = this.l.size();
            l[] lVarArr = new l[size];
            for (int i2 = size - 1; i2 >= 0; i2--) {
                lVarArr[i2] = this.l.c(i2);
            }
            for (int i3 = 0; i3 < size; i3++) {
                l lVar = lVarArr[i3];
                if (lVar.g) {
                    if (l.a) {
                        Log.v("LoaderManager", "Finished Retaining in " + lVar);
                    }
                    lVar.g = false;
                    for (int a2 = lVar.b.a() - 1; a2 >= 0; a2--) {
                        l.a b2 = lVar.b.b(a2);
                        if (b2.i) {
                            if (l.a) {
                                Log.v("LoaderManager", "  Finished Retaining: " + b2);
                            }
                            b2.i = false;
                            if (b2.h != b2.j && !b2.h) {
                                b2.a();
                            }
                        }
                        if (b2.h && b2.e && !b2.k) {
                            b2.a(b2.d, b2.g);
                        }
                    }
                }
                lVar.f();
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onStop() {
        super.onStop();
        this.f = true;
        this.a.sendEmptyMessage(1);
        this.b.h();
    }

    public void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        int i2 = Build.VERSION.SDK_INT;
        printWriter.print(str);
        printWriter.print("Local FragmentActivity ");
        printWriter.print(Integer.toHexString(System.identityHashCode(this)));
        printWriter.println(" State:");
        String str2 = str + "  ";
        printWriter.print(str2);
        printWriter.print("mCreated=");
        printWriter.print(this.d);
        printWriter.print("mResumed=");
        printWriter.print(this.e);
        printWriter.print(" mStopped=");
        printWriter.print(this.f);
        printWriter.print(" mReallyStopped=");
        printWriter.println(this.g);
        printWriter.print(str2);
        printWriter.print("mLoadersStarted=");
        printWriter.println(this.k);
        if (this.m != null) {
            printWriter.print(str);
            printWriter.print("Loader Manager ");
            printWriter.print(Integer.toHexString(System.identityHashCode(this.m)));
            printWriter.println(":");
            this.m.a(str + "  ", printWriter);
        }
        this.b.a(str, fileDescriptor, printWriter, strArr);
        printWriter.print(str);
        printWriter.println("View Hierarchy:");
        a(str + "  ", printWriter, getWindow().getDecorView());
    }

    private static String a(View view) {
        char c2;
        char c3;
        char c4;
        char c5;
        char c6;
        char c7;
        char c8;
        String str;
        char c9 = 'F';
        char c10 = '.';
        StringBuilder sb = new StringBuilder(128);
        sb.append(view.getClass().getName());
        sb.append('{');
        sb.append(Integer.toHexString(System.identityHashCode(view)));
        sb.append(' ');
        switch (view.getVisibility()) {
            case 0:
                sb.append('V');
                break;
            case 4:
                sb.append('I');
                break;
            case 8:
                sb.append('G');
                break;
            default:
                sb.append('.');
                break;
        }
        if (view.isFocusable()) {
            c2 = 'F';
        } else {
            c2 = '.';
        }
        sb.append(c2);
        if (view.isEnabled()) {
            c3 = 'E';
        } else {
            c3 = '.';
        }
        sb.append(c3);
        sb.append(view.willNotDraw() ? '.' : 'D');
        if (view.isHorizontalScrollBarEnabled()) {
            c4 = 'H';
        } else {
            c4 = '.';
        }
        sb.append(c4);
        if (view.isVerticalScrollBarEnabled()) {
            c5 = 'V';
        } else {
            c5 = '.';
        }
        sb.append(c5);
        if (view.isClickable()) {
            c6 = 'C';
        } else {
            c6 = '.';
        }
        sb.append(c6);
        if (view.isLongClickable()) {
            c7 = 'L';
        } else {
            c7 = '.';
        }
        sb.append(c7);
        sb.append(' ');
        if (!view.isFocused()) {
            c9 = '.';
        }
        sb.append(c9);
        if (view.isSelected()) {
            c8 = 'S';
        } else {
            c8 = '.';
        }
        sb.append(c8);
        if (view.isPressed()) {
            c10 = 'P';
        }
        sb.append(c10);
        sb.append(' ');
        sb.append(view.getLeft());
        sb.append(',');
        sb.append(view.getTop());
        sb.append('-');
        sb.append(view.getRight());
        sb.append(',');
        sb.append(view.getBottom());
        int id = view.getId();
        if (id != -1) {
            sb.append(" #");
            sb.append(Integer.toHexString(id));
            Resources resources = view.getResources();
            if (!(id == 0 || resources == null)) {
                switch (-16777216 & id) {
                    case 16777216:
                        str = "android";
                        break;
                    case 2130706432:
                        str = "app";
                        break;
                    default:
                        try {
                            str = resources.getResourcePackageName(id);
                            break;
                        } catch (Resources.NotFoundException e2) {
                            break;
                        }
                }
                String resourceTypeName = resources.getResourceTypeName(id);
                String resourceEntryName = resources.getResourceEntryName(id);
                sb.append(" ");
                sb.append(str);
                sb.append(":");
                sb.append(resourceTypeName);
                sb.append("/");
                sb.append(resourceEntryName);
            }
        }
        sb.append("}");
        return sb.toString();
    }

    private void a(String str, PrintWriter printWriter, View view) {
        ViewGroup viewGroup;
        int childCount;
        printWriter.print(str);
        if (view == null) {
            printWriter.println("null");
            return;
        }
        printWriter.println(a(view));
        if ((view instanceof ViewGroup) && (childCount = viewGroup.getChildCount()) > 0) {
            String str2 = str + "  ";
            for (int i2 = 0; i2 < childCount; i2++) {
                a(str2, printWriter, (viewGroup = (ViewGroup) view).getChildAt(i2));
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final void a(boolean z) {
        if (!this.g) {
            this.g = true;
            this.h = z;
            this.a.removeMessages(1);
            if (this.k) {
                this.k = false;
                if (this.m != null) {
                    if (!this.h) {
                        this.m.c();
                    } else {
                        this.m.d();
                    }
                }
            }
            this.b.a(2);
        }
    }

    public void startActivityForResult(Intent intent, int i2) {
        if (i2 == -1 || (-65536 & i2) == 0) {
            super.startActivityForResult(intent, i2);
            return;
        }
        throw new IllegalArgumentException("Can only use lower 16 bits for requestCode");
    }

    /* access modifiers changed from: package-private */
    public final void a(String str) {
        l lVar;
        if (this.l != null && (lVar = this.l.get(str)) != null && !lVar.g) {
            lVar.g();
            this.l.remove(str);
        }
    }

    /* access modifiers changed from: package-private */
    public final l b(String str) {
        if (this.l == null) {
            this.l = new g<>();
        }
        l lVar = this.l.get(str);
        if (lVar != null) {
            lVar.e = this;
        }
        return lVar;
    }
}
