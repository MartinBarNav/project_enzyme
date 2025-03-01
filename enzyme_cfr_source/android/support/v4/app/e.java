/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.content.Context
 *  android.content.Intent
 *  android.content.res.Configuration
 *  android.os.Build$VERSION
 *  android.os.Bundle
 *  android.os.Handler
 *  android.os.Message
 *  android.os.Parcelable
 *  android.util.AttributeSet
 *  android.util.Log
 *  android.util.SparseArray
 *  android.view.KeyEvent
 *  android.view.LayoutInflater$Factory
 *  android.view.Menu
 *  android.view.MenuItem
 *  android.view.View
 *  android.view.ViewGroup
 *  android.view.Window
 */
package android.support.v4.app;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.os.Parcelable;
import android.support.v4.app.c;
import android.support.v4.app.d;
import android.support.v4.app.f;
import android.support.v4.app.h;
import android.support.v4.app.l;
import android.support.v4.e.g;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;

public class e
extends Activity {
    final Handler a = new Handler(){

        /*
         * Enabled aggressive block sorting
         */
        public final void handleMessage(Message message) {
            switch (message.what) {
                default: {
                    super.handleMessage(message);
                    return;
                }
                case 1: {
                    if (!e.this.f) return;
                    e.this.a(false);
                    return;
                }
                case 2: 
            }
            e.this.b.g();
            e.this.b.a();
        }
    };
    final h b = new h();
    final f c = new f(){

        @Override
        public final View a(int n2) {
            return e.this.findViewById(n2);
        }

        /*
         * Enabled force condition propagation
         * Lifted jumps to return sites
         */
        @Override
        public final boolean a() {
            Window window = e.this.getWindow();
            if (window == null) return false;
            if (window.peekDecorView() == null) return false;
            return true;
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

    /*
     * Exception decompiling
     */
    private static String a(View var0) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [7[CASE]], but top level block is 0[TRYBLOCK]
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

    /*
     * Enabled aggressive block sorting
     */
    private void a(String string, PrintWriter printWriter, View view) {
        printWriter.print(string);
        if (view == null) {
            printWriter.println("null");
            return;
        } else {
            int n2;
            printWriter.println(android.support.v4.app.e.a(view));
            if (!(view instanceof ViewGroup) || (n2 = (view = (ViewGroup)view).getChildCount()) <= 0) return;
            string = string + "  ";
            for (int i2 = 0; i2 < n2; ++i2) {
                this.a(string, printWriter, view.getChildAt(i2));
            }
        }
    }

    final void a(String string) {
        l l2;
        if (this.l != null && (l2 = this.l.get(string)) != null && !l2.g) {
            l2.g();
            this.l.remove(string);
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    final void a(boolean bl) {
        if (!this.g) {
            this.g = true;
            this.h = bl;
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

    final l b(String object) {
        if (this.l == null) {
            this.l = new g();
        }
        if ((object = this.l.get(object)) != null) {
            ((l)object).e = this;
        }
        return object;
    }

    public void dump(String string, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] arrstring) {
        int n2 = Build.VERSION.SDK_INT;
        printWriter.print(string);
        printWriter.print("Local FragmentActivity ");
        printWriter.print(Integer.toHexString(System.identityHashCode((Object)this)));
        printWriter.println(" State:");
        String string2 = string + "  ";
        printWriter.print(string2);
        printWriter.print("mCreated=");
        printWriter.print(this.d);
        printWriter.print("mResumed=");
        printWriter.print(this.e);
        printWriter.print(" mStopped=");
        printWriter.print(this.f);
        printWriter.print(" mReallyStopped=");
        printWriter.println(this.g);
        printWriter.print(string2);
        printWriter.print("mLoadersStarted=");
        printWriter.println(this.k);
        if (this.m != null) {
            printWriter.print(string);
            printWriter.print("Loader Manager ");
            printWriter.print(Integer.toHexString(System.identityHashCode(this.m)));
            printWriter.println(":");
            this.m.a(string + "  ", printWriter);
        }
        this.b.a(string, fileDescriptor, printWriter, arrstring);
        printWriter.print(string);
        printWriter.println("View Hierarchy:");
        this.a(string + "  ", printWriter, this.getWindow().getDecorView());
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    protected void onActivityResult(int n2, int n3, Intent intent) {
        this.b.s = false;
        int n4 = n2 >> 16;
        if (n4 != 0) {
            n3 = n4 - 1;
            if (this.b.f == null || n3 < 0 || n3 >= this.b.f.size()) {
                Log.w((String)"FragmentActivity", (String)("Activity result fragment index out of range: 0x" + Integer.toHexString(n2)));
                return;
            }
            if (this.b.f.get(n3) == null) {
                Log.w((String)"FragmentActivity", (String)("Activity result no fragment exists for index: 0x" + Integer.toHexString(n2)));
                return;
            }
            android.support.v4.app.d.b();
            return;
        }
        super.onActivityResult(n2, n3, intent);
    }

    /*
     * Enabled aggressive block sorting
     */
    public void onBackPressed() {
        int n2;
        boolean bl = false;
        h h2 = this.b;
        if (h2.s) {
            throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
        }
        if (h2.u != null) {
            throw new IllegalStateException("Can not perform this action inside of " + h2.u);
        }
        h2.a();
        if (h2.i != null && (n2 = h2.i.size() - 1) >= 0) {
            c c2 = h2.i.remove(n2);
            SparseArray sparseArray = new SparseArray();
            SparseArray sparseArray2 = new SparseArray();
            c2.a((SparseArray<d>)sparseArray, (SparseArray<d>)sparseArray2);
            c2.a(null, (SparseArray<d>)sparseArray, (SparseArray<d>)sparseArray2);
            h2.b();
            bl = true;
        }
        if (bl) return;
        if (Build.VERSION.SDK_INT >= 21) {
            android.support.v4.app.a.a(this);
            return;
        }
        this.finish();
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.b.a(configuration);
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     */
    public void onCreate(Bundle object) {
        this.b.a(this, this.c, null);
        if (this.getLayoutInflater().getFactory() == null) {
            this.getLayoutInflater().setFactory((LayoutInflater.Factory)this);
        }
        super.onCreate(object);
        a a2 = (a)this.getLastNonConfigurationInstance();
        if (a2 != null) {
            this.l = a2.e;
        }
        if (object != null) {
            void var1_3;
            Parcelable parcelable = object.getParcelable("android:support:fragments");
            h h2 = this.b;
            if (a2 != null) {
                ArrayList<d> arrayList = a2.d;
            } else {
                Object var1_4 = null;
            }
            h2.a(parcelable, (ArrayList<d>)var1_3);
        }
        this.b.d();
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public boolean onCreatePanelMenu(int n2, Menu menu) {
        if (n2 != 0) return super.onCreatePanelMenu(n2, menu);
        boolean bl = super.onCreatePanelMenu(n2, menu) | this.b.a(menu, this.getMenuInflater());
        if (Build.VERSION.SDK_INT < 11) return true;
        return bl;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public View onCreateView(String string, Context context, AttributeSet attributeSet) {
        View view;
        if (!"fragment".equals(string)) {
            return super.onCreateView(string, context, attributeSet);
        }
        View view2 = view = this.b.onCreateView(string, context, attributeSet);
        if (view != null) return view2;
        return super.onCreateView(string, context, attributeSet);
    }

    public void onDestroy() {
        super.onDestroy();
        this.a(false);
        this.b.i();
        if (this.m != null) {
            this.m.g();
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public boolean onKeyDown(int n2, KeyEvent keyEvent) {
        if (Build.VERSION.SDK_INT >= 5) return super.onKeyDown(n2, keyEvent);
        if (n2 != 4) return super.onKeyDown(n2, keyEvent);
        if (keyEvent.getRepeatCount() != 0) return super.onKeyDown(n2, keyEvent);
        this.onBackPressed();
        return true;
    }

    public void onLowMemory() {
        super.onLowMemory();
        this.b.j();
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public boolean onMenuItemSelected(int n2, MenuItem menuItem) {
        if (super.onMenuItemSelected(n2, menuItem)) {
            return true;
        }
        switch (n2) {
            default: {
                return false;
            }
            case 0: {
                return this.b.a(menuItem);
            }
            case 6: 
        }
        return this.b.b(menuItem);
    }

    protected void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        this.b.s = false;
    }

    /*
     * Enabled aggressive block sorting
     */
    public void onPanelClosed(int n2, Menu menu) {
        switch (n2) {
            default: {
                break;
            }
            case 0: {
                this.b.b(menu);
            }
        }
        super.onPanelClosed(n2, menu);
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

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public boolean onPreparePanel(int n2, View view, Menu menu) {
        if (n2 != 0) return super.onPreparePanel(n2, view, menu);
        if (menu == null) return super.onPreparePanel(n2, view, menu);
        if (!this.i) return super.onPreparePanel(0, view, menu) | this.b.a(menu);
        this.i = false;
        menu.clear();
        this.onCreatePanelMenu(n2, menu);
        return super.onPreparePanel(0, view, menu) | this.b.a(menu);
    }

    public void onResume() {
        super.onResume();
        this.a.sendEmptyMessage(2);
        this.e = true;
        this.b.a();
    }

    /*
     * Enabled aggressive block sorting
     */
    public final Object onRetainNonConfigurationInstance() {
        int n2;
        Object object;
        Object object2;
        int n3;
        Object object3;
        int n4 = 0;
        Object var2_2 = null;
        if (this.f) {
            this.a(true);
        }
        h h2 = this.b;
        if (h2.f == null) {
            object3 = null;
        } else {
            n3 = 0;
            object2 = null;
            while (true) {
                object3 = object2;
                if (n3 >= h2.f.size()) break;
                d d2 = h2.f.get(n3);
                object = object2;
                if (d2 != null) {
                    object = object2;
                    if (d2.C) {
                        object3 = object2;
                        if (object2 == null) {
                            object3 = new ArrayList();
                        }
                        object3.add(d2);
                        d2.D = true;
                        n2 = d2.j != null ? d2.j.g : -1;
                        d2.k = n2;
                        object = object3;
                        if (android.support.v4.app.h.a) {
                            Log.v((String)"FragmentManager", (String)("retainNonConfig: keeping retained " + d2));
                            object = object3;
                        }
                    }
                }
                ++n3;
                object2 = object;
            }
        }
        if (this.l == null) {
            n4 = 0;
        } else {
            int n5 = this.l.size();
            object2 = new l[n5];
            for (n3 = n5 - 1; n3 >= 0; --n3) {
                object2[n3] = this.l.c(n3);
            }
            n3 = 0;
            n2 = n4;
            while (true) {
                n4 = n3;
                if (n2 >= n5) break;
                object = object2[n2];
                if (((l)object).g) {
                    n3 = 1;
                } else {
                    ((l)object).g();
                    this.l.remove(((l)object).d);
                }
                ++n2;
            }
        }
        if (object3 == null && n4 == 0) {
            return var2_2;
        }
        object2 = new a();
        object2.a = null;
        object2.b = null;
        object2.c = null;
        object2.d = object3;
        object2.e = this.l;
        return object2;
    }

    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        Parcelable parcelable = this.b.c();
        if (parcelable != null) {
            bundle.putParcelable("android:support:fragments", parcelable);
        }
    }

    /*
     * Enabled aggressive block sorting
     */
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
            } else if (!this.j) {
                this.m = this.b("(root)");
                if (this.m != null && !this.m.f) {
                    this.m.b();
                }
            }
            this.j = true;
        }
        this.b.f();
        if (this.l != null) {
            int n2;
            int n3 = this.l.size();
            l[] arrl = new l[n3];
            for (n2 = n3 - 1; n2 >= 0; --n2) {
                arrl[n2] = this.l.c(n2);
            }
            for (n2 = 0; n2 < n3; ++n2) {
                l l2 = arrl[n2];
                if (l2.g) {
                    if (android.support.v4.app.l.a) {
                        Log.v((String)"LoaderManager", (String)("Finished Retaining in " + l2));
                    }
                    l2.g = false;
                    for (int i2 = l2.b.a() - 1; i2 >= 0; --i2) {
                        l.a a2 = l2.b.b(i2);
                        if (a2.i) {
                            if (android.support.v4.app.l.a) {
                                Log.v((String)"LoaderManager", (String)("  Finished Retaining: " + a2));
                            }
                            a2.i = false;
                            if (a2.h != a2.j && !a2.h) {
                                a2.a();
                            }
                        }
                        if (!a2.h || !a2.e || a2.k) continue;
                        a2.a(a2.d, a2.g);
                    }
                }
                l2.f();
            }
        }
    }

    protected void onStop() {
        super.onStop();
        this.f = true;
        this.a.sendEmptyMessage(1);
        this.b.h();
    }

    public void startActivityForResult(Intent intent, int n2) {
        if (n2 != -1 && (0xFFFF0000 & n2) != 0) {
            throw new IllegalArgumentException("Can only use lower 16 bits for requestCode");
        }
        super.startActivityForResult(intent, n2);
    }

    static final class a {
        Object a;
        Object b;
        g<String, Object> c;
        ArrayList<d> d;
        g<String, l> e;

        a() {
        }
    }
}

