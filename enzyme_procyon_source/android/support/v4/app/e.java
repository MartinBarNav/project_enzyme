// 
// Decompiled by Procyon v0.5.36
// 

package android.support.v4.app;

import android.view.MenuItem;
import android.view.KeyEvent;
import android.util.AttributeSet;
import android.content.Context;
import android.view.Menu;
import java.util.ArrayList;
import android.os.Parcelable;
import android.view.LayoutInflater$Factory;
import android.os.Bundle;
import android.content.res.Configuration;
import android.util.SparseArray;
import android.util.Log;
import android.content.Intent;
import android.os.Build$VERSION;
import java.io.FileDescriptor;
import android.view.ViewGroup;
import java.io.PrintWriter;
import android.content.res.Resources;
import android.content.res.Resources$NotFoundException;
import android.view.Window;
import android.view.View;
import android.os.Message;
import android.support.v4.e.g;
import android.os.Handler;
import android.app.Activity;

public class e extends Activity
{
    final Handler a;
    final h b;
    final f c;
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
    
    public e() {
        this.a = new Handler() {
            public final void handleMessage(final Message message) {
                switch (message.what) {
                    default: {
                        super.handleMessage(message);
                        break;
                    }
                    case 1: {
                        if (android.support.v4.app.e.this.f) {
                            android.support.v4.app.e.this.a(false);
                            break;
                        }
                        break;
                    }
                    case 2: {
                        android.support.v4.app.e.this.b.g();
                        android.support.v4.app.e.this.b.a();
                        break;
                    }
                }
            }
        };
        this.b = new h();
        this.c = new f() {
            @Override
            public final View a(final int n) {
                return android.support.v4.app.e.this.findViewById(n);
            }
            
            @Override
            public final boolean a() {
                final Window window = android.support.v4.app.e.this.getWindow();
                return window != null && window.peekDecorView() != null;
            }
        };
    }
    
    private static String a(final View view) {
        final char c = 'F';
        final char c2 = '.';
        final StringBuilder sb = new StringBuilder(128);
        sb.append(view.getClass().getName());
        sb.append('{');
        sb.append(Integer.toHexString(System.identityHashCode(view)));
        sb.append(' ');
        Resources resources;
        int id = 0;
        String resourcePackageName;
        String resourceTypeName;
        String resourceEntryName;
        char c3 = '\0';
        char c4 = '\0';
        char c5 = '\0';
        char c6 = '\0';
        char c7 = '\0';
        char c8 = '\0';
        char c9 = '\0';
        char c10 = '\0';
        char c11 = '\0';
        char c12;
        Label_0520_Outer:Label_0657_Outer:
        while (true) {
        Label_0663_Outer:
            while (true) {
                while (true) {
                    Label_0542_Outer:Label_0584_Outer:Label_0639_Outer:Label_0648_Outer:
                    while (true) {
                        Label_0290: {
                            while (true) {
                                Label_0270: {
                                    Label_0617_Outer:Label_0628_Outer:
                                    while (true) {
                                        Label_0246: {
                                            while (true) {
                                                Label_0224: {
                                                Label_0606_Outer:
                                                    while (true) {
                                                        Label_0202: {
                                                            while (true) {
                                                                Label_0180: {
                                                                    while (true) {
                                                                        Label_0158: {
                                                                            while (true) {
                                                                                Label_0136: {
                                                                                    while (true) {
                                                                                        Label_0114: {
                                                                                            while (true) {
                                                                                                while (true) {
                                                                                                    while (true) {
                                                                                                        switch (view.getVisibility()) {
                                                                                                            default: {
                                                                                                                sb.append('.');
                                                                                                                break;
                                                                                                            }
                                                                                                            case 0: {
                                                                                                                Label_0532: {
                                                                                                                    break Label_0532;
                                                                                                                    try {
                                                                                                                        resourcePackageName = resources.getResourcePackageName(id);
                                                                                                                        while (true) {
                                                                                                                            resourceTypeName = resources.getResourceTypeName(id);
                                                                                                                            resourceEntryName = resources.getResourceEntryName(id);
                                                                                                                            sb.append(" ");
                                                                                                                            sb.append(resourcePackageName);
                                                                                                                            sb.append(":");
                                                                                                                            sb.append(resourceTypeName);
                                                                                                                            sb.append("/");
                                                                                                                            sb.append(resourceEntryName);
                                                                                                                            sb.append("}");
                                                                                                                            return sb.toString();
                                                                                                                            sb.append('I');
                                                                                                                            break;
                                                                                                                            c3 = 'D';
                                                                                                                            break Label_0158;
                                                                                                                            c4 = '.';
                                                                                                                            break Label_0270;
                                                                                                                            c5 = '.';
                                                                                                                            break Label_0224;
                                                                                                                            c6 = '.';
                                                                                                                            break Label_0202;
                                                                                                                            c7 = '.';
                                                                                                                            break Label_0136;
                                                                                                                            c8 = '.';
                                                                                                                            break Label_0290;
                                                                                                                            resourcePackageName = "app";
                                                                                                                            continue Label_0520_Outer;
                                                                                                                            resourcePackageName = "android";
                                                                                                                            continue Label_0520_Outer;
                                                                                                                        }
                                                                                                                        c9 = '.';
                                                                                                                        break Label_0180;
                                                                                                                        c10 = '.';
                                                                                                                        break Label_0246;
                                                                                                                        sb.append('V');
                                                                                                                        break;
                                                                                                                        c11 = '.';
                                                                                                                        break Label_0114;
                                                                                                                        sb.append('G');
                                                                                                                        break;
                                                                                                                    }
                                                                                                                    catch (Resources$NotFoundException ex) {
                                                                                                                        continue Label_0542_Outer;
                                                                                                                    }
                                                                                                                }
                                                                                                                break;
                                                                                                            }
                                                                                                            case 4: {
                                                                                                                continue Label_0584_Outer;
                                                                                                            }
                                                                                                            case 8: {
                                                                                                                continue;
                                                                                                            }
                                                                                                        }
                                                                                                        break;
                                                                                                    }
                                                                                                    break;
                                                                                                }
                                                                                                if (!view.isFocusable()) {
                                                                                                    continue;
                                                                                                }
                                                                                                break;
                                                                                            }
                                                                                            c11 = 'F';
                                                                                        }
                                                                                        sb.append(c11);
                                                                                        if (!view.isEnabled()) {
                                                                                            continue Label_0648_Outer;
                                                                                        }
                                                                                        break;
                                                                                    }
                                                                                    c7 = 'E';
                                                                                }
                                                                                sb.append(c7);
                                                                                if (!view.willNotDraw()) {
                                                                                    continue Label_0639_Outer;
                                                                                }
                                                                                break;
                                                                            }
                                                                            c3 = '.';
                                                                        }
                                                                        sb.append(c3);
                                                                        if (!view.isHorizontalScrollBarEnabled()) {
                                                                            continue Label_0628_Outer;
                                                                        }
                                                                        break;
                                                                    }
                                                                    c9 = 'H';
                                                                }
                                                                sb.append(c9);
                                                                if (!view.isVerticalScrollBarEnabled()) {
                                                                    continue Label_0648_Outer;
                                                                }
                                                                break;
                                                            }
                                                            c6 = 'V';
                                                        }
                                                        sb.append(c6);
                                                        if (!view.isClickable()) {
                                                            continue Label_0606_Outer;
                                                        }
                                                        break;
                                                    }
                                                    c5 = 'C';
                                                }
                                                sb.append(c5);
                                                if (!view.isLongClickable()) {
                                                    continue;
                                                }
                                                break;
                                            }
                                            c10 = 'L';
                                        }
                                        sb.append(c10);
                                        sb.append(' ');
                                        if (!view.isFocused()) {
                                            continue Label_0617_Outer;
                                        }
                                        break;
                                    }
                                    c4 = c;
                                }
                                sb.append(c4);
                                if (!view.isSelected()) {
                                    continue Label_0657_Outer;
                                }
                                break;
                            }
                            c8 = 'S';
                        }
                        sb.append(c8);
                        c12 = c2;
                        if (view.isPressed()) {
                            c12 = 'P';
                        }
                        sb.append(c12);
                        sb.append(' ');
                        sb.append(view.getLeft());
                        sb.append(',');
                        sb.append(view.getTop());
                        sb.append('-');
                        sb.append(view.getRight());
                        sb.append(',');
                        sb.append(view.getBottom());
                        id = view.getId();
                        if (id == -1) {
                            continue Label_0584_Outer;
                        }
                        sb.append(" #");
                        sb.append(Integer.toHexString(id));
                        resources = view.getResources();
                        if (id == 0 || resources == null) {
                            continue Label_0584_Outer;
                        }
                        break;
                    }
                    switch (0xFF000000 & id) {
                        default: {
                            continue Label_0520_Outer;
                        }
                        case 2130706432: {
                            continue Label_0663_Outer;
                        }
                        case 16777216: {
                            continue;
                        }
                    }
                    break;
                }
                break;
            }
            break;
        }
    }
    
    private void a(String string, final PrintWriter printWriter, final View view) {
        printWriter.print(string);
        if (view == null) {
            printWriter.println("null");
        }
        else {
            printWriter.println(a(view));
            if (view instanceof ViewGroup) {
                final ViewGroup viewGroup = (ViewGroup)view;
                final int childCount = viewGroup.getChildCount();
                if (childCount > 0) {
                    string += "  ";
                    for (int i = 0; i < childCount; ++i) {
                        this.a(string, printWriter, viewGroup.getChildAt(i));
                    }
                }
            }
        }
    }
    
    final void a(final String s) {
        if (this.l != null) {
            final l l = this.l.get(s);
            if (l != null && !l.g) {
                l.g();
                this.l.remove(s);
            }
        }
    }
    
    final void a(final boolean h) {
        if (!this.g) {
            this.g = true;
            this.h = h;
            this.a.removeMessages(1);
            if (this.k) {
                this.k = false;
                if (this.m != null) {
                    if (!this.h) {
                        this.m.c();
                    }
                    else {
                        this.m.d();
                    }
                }
            }
            this.b.a(2);
        }
    }
    
    final l b(final String s) {
        if (this.l == null) {
            this.l = new g<String, l>();
        }
        final l l = this.l.get(s);
        if (l != null) {
            l.e = this;
        }
        return l;
    }
    
    public void dump(final String s, final FileDescriptor fileDescriptor, final PrintWriter printWriter, final String[] array) {
        final int sdk_INT = Build$VERSION.SDK_INT;
        printWriter.print(s);
        printWriter.print("Local FragmentActivity ");
        printWriter.print(Integer.toHexString(System.identityHashCode(this)));
        printWriter.println(" State:");
        final String string = s + "  ";
        printWriter.print(string);
        printWriter.print("mCreated=");
        printWriter.print(this.d);
        printWriter.print("mResumed=");
        printWriter.print(this.e);
        printWriter.print(" mStopped=");
        printWriter.print(this.f);
        printWriter.print(" mReallyStopped=");
        printWriter.println(this.g);
        printWriter.print(string);
        printWriter.print("mLoadersStarted=");
        printWriter.println(this.k);
        if (this.m != null) {
            printWriter.print(s);
            printWriter.print("Loader Manager ");
            printWriter.print(Integer.toHexString(System.identityHashCode(this.m)));
            printWriter.println(":");
            this.m.a(s + "  ", printWriter);
        }
        this.b.a(s, fileDescriptor, printWriter, array);
        printWriter.print(s);
        printWriter.println("View Hierarchy:");
        this.a(s + "  ", printWriter, this.getWindow().getDecorView());
    }
    
    protected void onActivityResult(final int n, int index, final Intent intent) {
        this.b.s = false;
        final int n2 = n >> 16;
        if (n2 != 0) {
            index = n2 - 1;
            if (this.b.f == null || index < 0 || index >= this.b.f.size()) {
                Log.w("FragmentActivity", "Activity result fragment index out of range: 0x" + Integer.toHexString(n));
            }
            else if (this.b.f.get(index) == null) {
                Log.w("FragmentActivity", "Activity result no fragment exists for index: 0x" + Integer.toHexString(n));
            }
            else {
                android.support.v4.app.d.b();
            }
        }
        else {
            super.onActivityResult(n, index, intent);
        }
    }
    
    public void onBackPressed() {
        int n = 0;
        final h b = this.b;
        if (b.s) {
            throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
        }
        if (b.u != null) {
            throw new IllegalStateException("Can not perform this action inside of " + b.u);
        }
        b.a();
        if (b.i != null) {
            final int index = b.i.size() - 1;
            if (index >= 0) {
                final c c = b.i.remove(index);
                final SparseArray sparseArray = new SparseArray();
                final SparseArray sparseArray2 = new SparseArray();
                c.a((SparseArray<d>)sparseArray, (SparseArray<d>)sparseArray2);
                c.a(null, (SparseArray<d>)sparseArray, (SparseArray<d>)sparseArray2);
                b.b();
                n = 1;
            }
        }
        if (n == 0) {
            if (Build$VERSION.SDK_INT >= 21) {
                android.support.v4.app.a.a(this);
            }
            else {
                this.finish();
            }
        }
    }
    
    public void onConfigurationChanged(final Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.b.a(configuration);
    }
    
    public void onCreate(final Bundle bundle) {
        this.b.a(this, this.c, null);
        if (this.getLayoutInflater().getFactory() == null) {
            this.getLayoutInflater().setFactory((LayoutInflater$Factory)this);
        }
        super.onCreate(bundle);
        final a a = (a)this.getLastNonConfigurationInstance();
        if (a != null) {
            this.l = a.e;
        }
        if (bundle != null) {
            final Parcelable parcelable = bundle.getParcelable("android:support:fragments");
            final h b = this.b;
            ArrayList<d> d;
            if (a != null) {
                d = a.d;
            }
            else {
                d = null;
            }
            b.a(parcelable, d);
        }
        this.b.d();
    }
    
    public boolean onCreatePanelMenu(final int n, final Menu menu) {
        boolean onCreatePanelMenu;
        if (n == 0) {
            onCreatePanelMenu = (super.onCreatePanelMenu(n, menu) | this.b.a(menu, this.getMenuInflater()));
            if (Build$VERSION.SDK_INT < 11) {
                onCreatePanelMenu = true;
            }
        }
        else {
            onCreatePanelMenu = super.onCreatePanelMenu(n, menu);
        }
        return onCreatePanelMenu;
    }
    
    public View onCreateView(final String anObject, final Context context, final AttributeSet set) {
        View view;
        if (!"fragment".equals(anObject)) {
            view = super.onCreateView(anObject, context, set);
        }
        else if ((view = this.b.onCreateView(anObject, context, set)) == null) {
            view = super.onCreateView(anObject, context, set);
        }
        return view;
    }
    
    public void onDestroy() {
        super.onDestroy();
        this.a(false);
        this.b.i();
        if (this.m != null) {
            this.m.g();
        }
    }
    
    public boolean onKeyDown(final int n, final KeyEvent keyEvent) {
        boolean onKeyDown;
        if (Build$VERSION.SDK_INT < 5 && n == 4 && keyEvent.getRepeatCount() == 0) {
            this.onBackPressed();
            onKeyDown = true;
        }
        else {
            onKeyDown = super.onKeyDown(n, keyEvent);
        }
        return onKeyDown;
    }
    
    public void onLowMemory() {
        super.onLowMemory();
        this.b.j();
    }
    
    public boolean onMenuItemSelected(final int n, final MenuItem menuItem) {
        boolean b = false;
        if (super.onMenuItemSelected(n, menuItem)) {
            b = true;
        }
        else {
            switch (n) {
                default: {
                    b = false;
                    break;
                }
                case 0: {
                    b = this.b.a(menuItem);
                    break;
                }
                case 6: {
                    b = this.b.b(menuItem);
                    break;
                }
            }
        }
        return b;
    }
    
    protected void onNewIntent(final Intent intent) {
        super.onNewIntent(intent);
        this.b.s = false;
    }
    
    public void onPanelClosed(final int n, final Menu menu) {
        switch (n) {
            case 0: {
                this.b.b(menu);
                break;
            }
        }
        super.onPanelClosed(n, menu);
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
    
    protected void onPostResume() {
        super.onPostResume();
        this.a.removeMessages(2);
        this.b.g();
        this.b.a();
    }
    
    public boolean onPreparePanel(final int n, final View view, final Menu menu) {
        boolean onPreparePanel;
        if (n == 0 && menu != null) {
            if (this.i) {
                this.i = false;
                menu.clear();
                this.onCreatePanelMenu(n, menu);
            }
            onPreparePanel = (super.onPreparePanel(0, view, menu) | this.b.a(menu));
        }
        else {
            onPreparePanel = super.onPreparePanel(n, view, menu);
        }
        return onPreparePanel;
    }
    
    public void onResume() {
        super.onResume();
        this.a.sendEmptyMessage(2);
        this.e = true;
        this.b.a();
    }
    
    public final Object onRetainNonConfigurationInstance() {
        final int n = 0;
        final a a = null;
        if (this.f) {
            this.a(true);
        }
        final h b = this.b;
        ArrayList<d> d;
        if (b.f != null) {
            int index = 0;
            ArrayList<d> list = null;
            while (true) {
                d = list;
                if (index >= b.f.size()) {
                    break;
                }
                final d d2 = b.f.get(index);
                ArrayList<d> list2 = list;
                if (d2 != null) {
                    list2 = list;
                    if (d2.C) {
                        ArrayList<d> list3;
                        if ((list3 = list) == null) {
                            list3 = new ArrayList<d>();
                        }
                        list3.add(d2);
                        d2.D = true;
                        int g;
                        if (d2.j != null) {
                            g = d2.j.g;
                        }
                        else {
                            g = -1;
                        }
                        d2.k = g;
                        list2 = list3;
                        if (android.support.v4.app.h.a) {
                            Log.v("FragmentManager", "retainNonConfig: keeping retained " + d2);
                            list2 = list3;
                        }
                    }
                }
                ++index;
                list = list2;
            }
        }
        else {
            d = null;
        }
        int n4;
        if (this.l != null) {
            final int size = this.l.size();
            final l[] array = new l[size];
            for (int i = size - 1; i >= 0; --i) {
                array[i] = this.l.c(i);
            }
            int n2 = 0;
            int n3 = n;
            while (true) {
                n4 = n2;
                if (n3 >= size) {
                    break;
                }
                final l l = array[n3];
                if (l.g) {
                    n2 = 1;
                }
                else {
                    l.g();
                    this.l.remove(l.d);
                }
                ++n3;
            }
        }
        else {
            n4 = 0;
        }
        a a2;
        if (d == null && n4 == 0) {
            a2 = a;
        }
        else {
            a2 = new a();
            a2.a = null;
            a2.b = null;
            a2.c = null;
            a2.d = d;
            a2.e = this.l;
        }
        return a2;
    }
    
    public void onSaveInstanceState(final Bundle bundle) {
        super.onSaveInstanceState(bundle);
        final Parcelable c = this.b.c();
        if (c != null) {
            bundle.putParcelable("android:support:fragments", c);
        }
    }
    
    protected void onStart() {
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
            }
            else if (!this.j) {
                this.m = this.b("(root)");
                if (this.m != null && !this.m.f) {
                    this.m.b();
                }
            }
            this.j = true;
        }
        this.b.f();
        if (this.l != null) {
            final int size = this.l.size();
            final l[] array = new l[size];
            for (int i = size - 1; i >= 0; --i) {
                array[i] = this.l.c(i);
            }
            for (final l obj : array) {
                if (obj.g) {
                    if (android.support.v4.app.l.a) {
                        Log.v("LoaderManager", "Finished Retaining in " + obj);
                    }
                    obj.g = false;
                    for (int k = obj.b.a() - 1; k >= 0; --k) {
                        final l.a obj2 = obj.b.b(k);
                        if (obj2.i) {
                            if (android.support.v4.app.l.a) {
                                Log.v("LoaderManager", "  Finished Retaining: " + obj2);
                            }
                            obj2.i = false;
                            if (obj2.h != obj2.j && !obj2.h) {
                                obj2.a();
                            }
                        }
                        if (obj2.h && obj2.e && !obj2.k) {
                            obj2.a(obj2.d, obj2.g);
                        }
                    }
                }
                obj.f();
            }
        }
    }
    
    protected void onStop() {
        super.onStop();
        this.f = true;
        this.a.sendEmptyMessage(1);
        this.b.h();
    }
    
    public void startActivityForResult(final Intent intent, final int n) {
        if (n != -1 && (0xFFFF0000 & n) != 0x0) {
            throw new IllegalArgumentException("Can only use lower 16 bits for requestCode");
        }
        super.startActivityForResult(intent, n);
    }
    
    static final class a
    {
        Object a;
        Object b;
        g<String, Object> c;
        ArrayList<d> d;
        g<String, l> e;
    }
}
