/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  android.app.ActionBar$Tab
 *  android.app.ActionBar$TabListener
 *  android.app.AlertDialog
 *  android.app.AlertDialog$Builder
 *  android.app.Fragment
 *  android.app.FragmentManager
 *  android.app.FragmentTransaction
 *  android.content.Context
 *  android.content.DialogInterface
 *  android.content.DialogInterface$OnClickListener
 *  android.content.Intent
 *  android.media.MediaPlayer
 *  android.media.SoundPool
 *  android.net.Uri
 *  android.os.Build$VERSION
 *  android.os.Bundle
 *  android.os.Parcelable
 *  android.preference.PreferenceManager
 *  android.view.Menu
 *  android.view.MenuInflater
 *  android.view.MenuItem
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.view.ViewGroup
 *  android.widget.ArrayAdapter
 *  android.widget.Button
 *  android.widget.EditText
 *  android.widget.ImageButton
 *  android.widget.ListAdapter
 *  android.widget.TextView
 *  android.widget.Toast
 */
package com.saterskog.cell_lab;

import android.app.ActionBar;
import android.app.AlertDialog;
import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.media.MediaPlayer;
import android.media.SoundPool;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.preference.PreferenceManager;
import android.support.a.a.d;
import android.support.v4.app.e;
import android.support.v4.view.ViewPager;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ListAdapter;
import android.widget.TextView;
import android.widget.Toast;
import com.saterskog.cell_lab.CellWorld;
import com.saterskog.cell_lab.CustomViewPager;
import com.saterskog.cell_lab.Environment;
import com.saterskog.cell_lab.Gene;
import com.saterskog.cell_lab.b;
import com.saterskog.cell_lab.f;
import com.saterskog.cell_lab.h;
import com.saterskog.cell_lab.i;
import com.saterskog.cell_lab.j;
import com.saterskog.cell_lab.m;
import com.saterskog.cell_lab.o;
import com.saterskog.cell_lab.p;
import com.saterskog.cell_lab.q;
import com.saterskog.cell_lab.r;
import com.saterskog.cell_lab.t;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Serializable;
import java.io.StreamCorruptedException;
import java.util.ArrayList;

public class PlayActivity
extends e
implements ActionBar.TabListener,
View.OnClickListener,
i.b,
o.a,
p.a,
t.a {
    int A;
    int[] B;
    int[] C;
    File D;
    boolean E = false;
    private int[] F = new int[h.values().length];
    private Environment G = new Environment();
    private int H;
    private int I;
    private ImageButton J = null;
    private long K = -1L;
    private Uri L;
    private ImageButton M;
    private ImageButton N;
    private String O;
    a n;
    boolean o;
    boolean p;
    int q;
    int r;
    int s;
    String t;
    CustomViewPager u = null;
    CellWorld v;
    boolean w;
    boolean x;
    SoundPool y;
    MediaPlayer z;

    public PlayActivity() {
        this.B = new int[12];
        this.C = new int[27];
    }

    static /* synthetic */ int a(PlayActivity playActivity, int n2) {
        playActivity.I = n2;
        return n2;
    }

    static /* synthetic */ String a(PlayActivity playActivity, String string) {
        playActivity.O = string;
        return string;
    }

    /*
     * Exception decompiling
     */
    private void a(InputStream var1_1) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [5[TRYBLOCK]], but top level block is 16[FORLOOP]
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

    private void c(int n2) {
        ((ViewPager)this.findViewById(2131230813)).a(n2, false);
        if (n2 == 1) {
            com.saterskog.cell_lab.t.b(this, 0, 0);
        }
        if (n2 == 2) {
            com.saterskog.cell_lab.t.b(this, 1, 0);
        }
    }

    /*
     * Exception decompiling
     */
    private void c(String var1_1) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [9[CATCHBLOCK], 11[CATCHBLOCK]], but top level block is 19[UNCONDITIONALDOLOOP]
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

    static /* synthetic */ void f(PlayActivity playActivity) {
        AlertDialog.Builder builder = new AlertDialog.Builder((Context)playActivity);
        builder.setTitle((CharSequence)playActivity.getString(2131624199));
        final EditText editText = new EditText((Context)playActivity);
        editText.setInputType(1);
        if (!playActivity.p) {
            editText.setText((CharSequence)playActivity.t);
        }
        builder.setView((View)editText);
        builder.setPositiveButton((CharSequence)playActivity.getString(2131624029), new DialogInterface.OnClickListener(){

            /*
             * Enabled aggressive block sorting
             * Enabled unnecessary exception pruning
             * Enabled aggressive exception aggregation
             */
            public final void onClick(DialogInterface object, int n2) {
                String string = editText.getText().toString();
                Object object2 = f.a(string);
                String[] arrstring = PlayActivity.this.fileList();
                int n3 = arrstring.length;
                for (int i2 = 0; i2 < n3; ++i2) {
                    if (!arrstring[i2].equals(object2) || editText.getText().toString().equals(PlayActivity.this.t)) continue;
                    Toast toast = Toast.makeText((Context)PlayActivity.this, (CharSequence)PlayActivity.this.getString(2131624200), (int)1);
                    PlayActivity.this.a((short)1);
                    ((TextView)toast.getView().findViewById(16908299)).setTextColor(-65536);
                    toast.show();
                    return;
                }
                try {
                    FileOutputStream fileOutputStream = PlayActivity.this.openFileOutput((String)object2, 0);
                    PlayActivity playActivity = PlayActivity.this;
                    object2 = (p)playActivity.b(1);
                    if (object2 != null && ((p)object2).a != null) {
                        r r2 = ((p)object2).a;
                        Runnable runnable = new Runnable((p)object2, fileOutputStream){
                            final /* synthetic */ p a;
                            final /* synthetic */ OutputStream b;
                            {
                                this.a = p2;
                                this.b = outputStream;
                            }

                            @Override
                            public final void run() {
                                this.a.a.a.N = this.b;
                            }
                        };
                        r2.queueEvent(runnable);
                    }
                    PlayActivity.a(PlayActivity.this, string);
                    PlayActivity.this.s = -1;
                    PlayActivity.this.t = string;
                    PlayActivity.this.o = true;
                    PlayActivity.this.getActionBar().setTitle((CharSequence)PlayActivity.this.O);
                    Toast.makeText((Context)PlayActivity.this, (CharSequence)PlayActivity.this.getString(2131624349), (int)1).show();
                    return;
                }
                catch (FileNotFoundException fileNotFoundException) {
                    fileNotFoundException.printStackTrace();
                    return;
                }
                catch (IllegalArgumentException illegalArgumentException) {
                    PlayActivity.this.a((short)1);
                    Toast toast = Toast.makeText((Context)PlayActivity.this, (CharSequence)PlayActivity.this.getString(2131624339), (int)1);
                    ((TextView)toast.getView().findViewById(16908299)).setTextColor(-65536);
                    toast.show();
                    return;
                }
            }
        });
        builder.setNegativeButton((CharSequence)playActivity.getString(2131624033), new DialogInterface.OnClickListener(){

            public final void onClick(DialogInterface dialogInterface, int n2) {
                dialogInterface.cancel();
            }
        });
        builder.show();
    }

    static /* synthetic */ void g(PlayActivity playActivity) {
        Object object;
        Object object2;
        if (playActivity.q == -1) {
            playActivity.a(playActivity.b());
            object2 = (o)playActivity.b(0);
            if (object2 != null) {
                object = playActivity.G;
                ((o)object2).a.a((Environment)object);
                ((o)((Object)object2)).a();
            }
        }
        object2 = playActivity.b();
        object = (p)playActivity.b(1);
        playActivity.a((short)0);
        ((p)object).a.queueEvent(new Runnable((p)object, (InputStream)object2){
            final /* synthetic */ p a;
            final /* synthetic */ InputStream b;
            {
                this.a = p2;
                this.b = inputStream;
            }

            @Override
            public final void run() {
                this.a.a.a.a(this.b, -1);
            }
        });
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private void i() {
        this.a((short)11);
        if (PreferenceManager.getDefaultSharedPreferences((Context)this).getBoolean("ask_discard_sample", true)) {
            AlertDialog.Builder builder = new AlertDialog.Builder((Context)this);
            builder.setTitle((CharSequence)this.getString(2131624035));
            builder.setMessage((CharSequence)this.getString(2131624034));
            builder.setPositiveButton((CharSequence)this.getString(2131624028), new DialogInterface.OnClickListener(){

                public final void onClick(DialogInterface dialogInterface, int n2) {
                    PlayActivity.this.j();
                }
            });
            builder.setNegativeButton((CharSequence)this.getString(2131624027), new DialogInterface.OnClickListener(){

                public final void onClick(DialogInterface dialogInterface, int n2) {
                    dialogInterface.cancel();
                }
            });
            builder = builder.create();
            builder.show();
            builder = builder.findViewById(builder.getContext().getResources().getIdentifier("android:id/titleDivider", null, null));
            if (builder != null) {
                builder.setBackgroundColor(this.getResources().getColor(2131034132));
            }
            return;
        }
        this.j();
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private void j() {
        if (this.q != -1 && !j.b(this.q, (Context)this)) {
            if (j.b((Context)this, this.q) + (com.saterskog.b.a.c() - this.K) > 600000L) {
                b.a(this, this.getString(2131624192), this.getString(2131624190) + this.getString(2131624071) + "<br><br>" + this.getString(2131624371), "need_help", null, new DialogInterface.OnClickListener(){

                    public final void onClick(DialogInterface dialogInterface, int n2) {
                        PlayActivity.this.finish();
                    }
                });
                return;
            }
            this.finish();
            return;
        }
        if (this.E && this.q >= j.a("26.6", (Context)this)) {
            b.a(this, this.getString(2131624048), this.getString(2131624047), "donation_appeal", new DialogInterface.OnClickListener(){

                public final void onClick(DialogInterface dialogInterface, int n2) {
                    dialogInterface = new Intent();
                    dialogInterface.putExtra("go_to_donate", 1);
                    PlayActivity.this.setResult(-1, (Intent)dialogInterface);
                }
            }, new DialogInterface.OnClickListener(){

                public final void onClick(DialogInterface dialogInterface, int n2) {
                    PlayActivity.this.finish();
                }
            });
            return;
        }
        this.finish();
    }

    private void k() {
        int n2;
        int n3;
        int n4 = 0;
        this.getResources().getStringArray(2130837515);
        new AlertDialog.Builder((Context)this);
        Object object = j.a(this.q);
        int n5 = ((boolean[])object).length;
        int n6 = 0;
        for (n3 = 0; n3 < n5; ++n3) {
            n2 = n6;
            if (object[n3]) {
                n2 = n6 + 1;
            }
            n6 = n2;
        }
        AlertDialog alertDialog = new Integer[n6];
        n6 = 0;
        for (n3 = n4; n3 < 5; ++n3) {
            n2 = n6;
            if (object[n3]) {
                alertDialog[n6] = new Integer(n3);
                n2 = n6 + 1;
            }
            n6 = n2;
        }
        object = new ArrayAdapter<Integer>((Context)this, (Integer[])alertDialog, (Integer[])alertDialog){
            final /* synthetic */ Integer[] a;
            {
                this.a = arrinteger2;
                super(context, 0x1090011, 16908308, (Object[])arrinteger);
            }

            /*
             * Enabled aggressive block sorting
             */
            public final View getView(int n2, View view, ViewGroup viewGroup) {
                int n3;
                viewGroup = super.getView(n2, view, viewGroup);
                view = (TextView)viewGroup.findViewById(16908308);
                if (this.a[n2] == 0) {
                    n3 = 2131165295;
                    view.setText((CharSequence)(" " + PlayActivity.this.getString(2131624353)));
                } else {
                    n3 = 0;
                }
                if (this.a[n2] == 1) {
                    n3 = 2131165297;
                    view.setText((CharSequence)(" " + PlayActivity.this.getString(2131624355)));
                }
                if (this.a[n2] == 2) {
                    n3 = 2131165294;
                    view.setText((CharSequence)(" " + PlayActivity.this.getString(2131624352)));
                }
                if (this.a[n2] == 3) {
                    n3 = 2131165298;
                    view.setText((CharSequence)(" " + PlayActivity.this.getString(2131624356)));
                }
                if (this.a[n2] == 4) {
                    n3 = 0x7F070070;
                    view.setText((CharSequence)(" " + PlayActivity.this.getString(2131624354)));
                }
                view.setCompoundDrawablesWithIntrinsicBounds(n3, 0, 0, 0);
                return viewGroup;
            }
        };
        alertDialog = new AlertDialog.Builder((Context)this).setAdapter((ListAdapter)object, new DialogInterface.OnClickListener((Integer[])alertDialog){
            final /* synthetic */ Integer[] a;
            {
                this.a = arrinteger;
            }

            public final void onClick(DialogInterface object, int n2) {
                int n3 = 0;
                if (this.a[n2] == 0) {
                    n3 = 2131165295;
                }
                if (this.a[n2] == 1) {
                    n3 = 2131165297;
                }
                if (this.a[n2] == 2) {
                    n3 = 2131165294;
                }
                if (this.a[n2] == 3) {
                    n3 = 2131165298;
                }
                if (this.a[n2] == 4) {
                    n3 = 0x7F070070;
                }
                PlayActivity.this.N.setImageResource(n3);
                PlayActivity.a(PlayActivity.this, this.a[n2]);
                n2 = PlayActivity.this.I;
                object = (p)PlayActivity.this.b(1);
                if (object != null) {
                    ((p)object).a.queueEvent(new Runnable((p)object, n2){
                        final /* synthetic */ p a;
                        final /* synthetic */ int b;
                        {
                            this.a = p2;
                            this.b = n2;
                        }

                        @Override
                        public final void run() {
                            this.a.a.a.A = this.b;
                        }
                    });
                    ((p)object).a(PlayActivity.this.I);
                }
                PlayActivity.this.a((short)11);
            }
        }).setTitle(2131624193).show();
        if ((alertDialog = alertDialog.findViewById(alertDialog.getContext().getResources().getIdentifier("android:id/titleDivider", null, null))) != null) {
            alertDialog.setBackgroundColor(this.getResources().getColor(2131034132));
        }
    }

    @Override
    public final void a(float f2) {
        if (this.w) {
            this.y.play(this.B[10], f2, f2, 0, 0, 1.0f);
        }
    }

    @Override
    public final void a(CellWorld object) {
        int n2 = 0;
        if (this.D != null) {
            int n3;
            String string = "\n" + ((CellWorld)object).M + ", " + ((CellWorld)object).f() + ", " + ((CellWorld)object).S + ", " + ((CellWorld)object).R;
            ((CellWorld)object).S = 0;
            ((CellWorld)object).R = 0;
            for (n3 = 0; n3 < 27; ++n3) {
                this.C[n3] = 0;
            }
            for (int i2 = 0; i2 < ((CellWorld)object).z; ++i2) {
                int n4;
                int n5;
                int n6;
                n3 = n6 = (int)(object.x[i2].J[0] * 3.0f);
                if (n6 < 0) {
                    n3 = 0;
                }
                n6 = n3;
                if (n3 >= 3) {
                    n6 = 2;
                }
                n3 = n5 = (int)(object.x[i2].J[1] * 3.0f);
                if (n5 < 0) {
                    n3 = 0;
                }
                n5 = n3;
                if (n3 >= 3) {
                    n5 = 2;
                }
                n3 = n4 = (int)(object.x[i2].J[2] * 3.0f);
                if (n4 < 0) {
                    n3 = 0;
                }
                n4 = n3;
                if (n3 >= 3) {
                    n4 = 2;
                }
                int[] arrn = this.C;
                n3 = n6 * 3 * 3 + n5 * 3 + n4;
                arrn[n3] = arrn[n3] + 1;
            }
            object = string;
            for (n3 = n2; n3 < 27; ++n3) {
                object = (String)object + ", " + this.C[n3];
            }
            this.c((String)object);
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public final void a(CellWorld object, boolean bl) {
        boolean bl2;
        int[] arrn;
        int n2;
        if (this.q == -1) {
            int n3 = ((CellWorld)object).z;
            double d2 = ((CellWorld)object).f();
            double d3 = ((CellWorld)object).M;
            if (this.u.getCurrentItem() != 0) return;
            o o2 = (o)this.b(0);
            if (o2 == null) return;
            if (o2.b == null) return;
            o2.b.post(new Runnable(o2, n3, d2, d3){
                final /* synthetic */ int a;
                final /* synthetic */ double b;
                final /* synthetic */ double c;
                final /* synthetic */ o d;
                {
                    this.d = o2;
                    this.a = n2;
                    this.b = d2;
                    this.c = d3;
                }

                public final void run() {
                    com.saterskog.cell_lab.o.a(this.d).setText((CharSequence)com.saterskog.cell_lab.o.a(this.d, this.a, this.b, this.c));
                }
            });
            return;
        }
        int n4 = ((CellWorld)object).z;
        int n5 = ((CellWorld)object).b(0);
        int n6 = ((CellWorld)object).b(3);
        int n7 = ((CellWorld)object).b(6);
        int n8 = ((CellWorld)object).b(1);
        int n9 = ((CellWorld)object).d();
        int n10 = ((CellWorld)object).e();
        int n11 = ((CellWorld)object).c();
        int n12 = ((CellWorld)object).V;
        int n13 = ((CellWorld)object).W;
        double d4 = ((CellWorld)object).N;
        double d5 = ((CellWorld)object).M;
        double d6 = 0.0;
        for (n2 = 0; n2 < ((CellWorld)object).B; d6 += (double)object.A[n2].c, ++n2) {
        }
        double d7 = ((CellWorld)object).M;
        if (this.u.getCurrentItem() != 0) return;
        m m2 = (m)this.b(0);
        if (m2 == null) return;
        i i2 = (i)this.b(2);
        if (i2 != null) {
            arrn = this.F;
            for (n2 = 0; n2 < h.B.length; ++n2) {
                arrn[n2] = 0;
            }
            if (i2.a != null) {
                for (n2 = 0; n2 < 80; ++n2) {
                    int n14 = i2.a[n2].s.ordinal();
                    arrn[n14] = arrn[n14] + 1;
                }
            }
        }
        arrn = this.F;
        if (m2.b == 0) return;
        if (m2.b == 1) return;
        n2 = m2.b;
        bl2 = m2.d || bl2;
        bl2 = m2.d = bl2;
        boolean bl3 = m2.e;
        if (m2.a == null) return;
        m2.a.post(new Runnable(m2, bl2, bl3, n5, n6, n7, n9, n10, n11, n8, n4, d6, d7, n2, n12, n13, d4, d5, arrn){
            final /* synthetic */ boolean a;
            final /* synthetic */ boolean b;
            final /* synthetic */ int c;
            final /* synthetic */ int d;
            final /* synthetic */ int e;
            final /* synthetic */ int f;
            final /* synthetic */ int g;
            final /* synthetic */ int h;
            final /* synthetic */ int i;
            final /* synthetic */ int j;
            final /* synthetic */ double k;
            final /* synthetic */ double l;
            final /* synthetic */ int m;
            final /* synthetic */ int n;
            final /* synthetic */ int o;
            final /* synthetic */ double p;
            final /* synthetic */ double q;
            final /* synthetic */ int[] r;
            final /* synthetic */ m s;
            {
                this.s = m2;
                this.a = bl;
                this.b = bl2;
                this.c = n2;
                this.d = n3;
                this.e = n4;
                this.f = n5;
                this.g = n6;
                this.h = n7;
                this.i = n8;
                this.j = n9;
                this.k = d2;
                this.l = d3;
                this.m = n10;
                this.n = n11;
                this.o = n12;
                this.p = d4;
                this.q = d5;
                this.r = arrn;
            }

            public final void run() {
                m.a(this.s).setText((CharSequence)m.a(this.s, this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.l, this.m, this.n, this.o, this.p, this.q, this.r));
            }
        });
    }

    @Override
    public final void a(final Environment environment) {
        final p p2 = (p)this.b(1);
        if (p2 != null && p2.a != null) {
            p2.a.queueEvent(new Runnable(){

                @Override
                public final void run() {
                    q q2 = p2.a.a;
                    Environment environment2 = environment;
                    q2.t = true;
                    q2.s.a(environment2);
                }
            });
        }
    }

    @Override
    public final void a(short s2) {
        if (this.w) {
            this.y.play(this.B[s2], 1.0f, 1.0f, 1, 0, 1.0f);
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    public final boolean a(final int n2) {
        switch (n2) {
            case 0: {
                this.M.setImageResource(2131165290);
                this.H = 0;
                this.a((short)11);
                break;
            }
            case 1: {
                this.M.setImageResource(2131165291);
                this.H = 1;
                this.a((short)11);
                break;
            }
            case 2: {
                this.M.setImageResource(2131165289);
                this.H = 2;
                this.a((short)11);
                break;
            }
            case 3: {
                this.M.setImageResource(2131165292);
                this.H = 3;
                this.a((short)11);
                break;
            }
        }
        n2 = this.H;
        final p p2 = (p)this.b(1);
        if (n2 == 1) {
            com.saterskog.cell_lab.t.a(this, 0, 4, 3000);
        }
        if (n2 == 2) {
            com.saterskog.cell_lab.t.a(this, 0, 5, 2000);
        }
        if (p2 != null) {
            p2.a.queueEvent(new Runnable(){

                @Override
                public final void run() {
                    p2.a.a.O = n2;
                }
            });
        }
        return true;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public final Gene[] a() {
        Gene[] arrgene = (Gene[])this.b(1);
        if (arrgene == null) return null;
        if (arrgene.a == null) return null;
        return arrgene.a.a.c();
    }

    public final Fragment b(int n2) {
        return this.getFragmentManager().findFragmentByTag("android:switcher:" + this.u.getId() + ":" + (long)n2);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    final InputStream b() {
        BufferedInputStream bufferedInputStream = null;
        com.saterskog.b.a.b("old: " + this.o);
        com.saterskog.b.a.b("external: " + this.p);
        com.saterskog.b.a.b("mUri: " + (Object)this.L);
        com.saterskog.b.a.b("loadChallenge: " + this.s);
        com.saterskog.b.a.b("name: " + this.t);
        if (!this.o) {
            return bufferedInputStream;
        }
        if (this.p) {
            try {
                return new BufferedInputStream(this.getContentResolver().openInputStream(this.L));
            }
            catch (FileNotFoundException fileNotFoundException) {
                fileNotFoundException.printStackTrace();
                return null;
            }
        }
        if (this.s == -1) {
            try {
                return new BufferedInputStream(this.openFileInput(f.a(this.t)));
            }
            catch (FileNotFoundException fileNotFoundException) {
                throw new RuntimeException("file not found");
            }
        }
        try {
            return new BufferedInputStream(this.getAssets().open(j.h(this.s, (Context)this)));
        }
        catch (StreamCorruptedException streamCorruptedException) {
            streamCorruptedException.printStackTrace();
            return null;
        }
        catch (IOException iOException) {
            throw new RuntimeException("io41");
        }
    }

    @Override
    public final Environment c() {
        return this.G;
    }

    @Override
    public final void d() {
        this.a((short)5);
    }

    /*
     * Enabled aggressive block sorting
     */
    public final void e() {
        final p p2 = (p)this.b(1);
        if (this.q == -1) {
            if (PreferenceManager.getDefaultSharedPreferences((Context)this).getBoolean("ask_sterilize_sample", true)) {
                this.a((short)11);
                AlertDialog.Builder builder = new AlertDialog.Builder((Context)this);
                builder.setTitle((CharSequence)this.getString(2131624039));
                builder.setMessage((CharSequence)this.getString(2131624038));
                builder.setPositiveButton((CharSequence)this.getString(2131624028), new DialogInterface.OnClickListener(){

                    public final void onClick(DialogInterface dialogInterface, int n2) {
                        p2.a.queueEvent(new Runnable(){

                            @Override
                            public final void run() {
                                p2.a.a.P = true;
                            }
                        });
                    }
                });
                builder.setNegativeButton((CharSequence)this.getString(2131624027), new DialogInterface.OnClickListener(){

                    public final void onClick(DialogInterface dialogInterface, int n2) {
                        dialogInterface.cancel();
                    }
                });
                p2 = builder.create();
                p2.show();
                p2 = p2.findViewById(p2.getContext().getResources().getIdentifier("android:id/titleDivider", null, null));
                if (p2 != null) {
                    p2.setBackgroundColor(this.getResources().getColor(2131034132));
                }
            } else {
                p2.a.queueEvent(new Runnable(){

                    @Override
                    public final void run() {
                        p2.a.a.P = true;
                    }
                });
            }
        } else {
            this.a((short)0);
            final int n2 = this.q;
            p2.a.queueEvent(new Runnable(){

                /*
                 * Enabled force condition propagation
                 * Lifted jumps to return sites
                 */
                @Override
                public final void run() {
                    try {
                        p2.a.a.a(PlayActivity.this.getAssets().open(j.h(n2, (Context)PlayActivity.this)), 0);
                        return;
                    }
                    catch (StreamCorruptedException streamCorruptedException) {
                        streamCorruptedException.printStackTrace();
                        return;
                    }
                    catch (IOException iOException) {
                        iOException.printStackTrace();
                        return;
                    }
                }
            });
        }
        com.saterskog.cell_lab.t.b(this, 0, 9);
    }

    @Override
    public final Gene[] f() {
        return ((i)this.b((int)2)).a;
    }

    @Override
    public final boolean g() {
        return this.w;
    }

    public final void h() {
        long l2 = j.b((Context)this, this.q) + (com.saterskog.b.a.c() - this.K);
        com.saterskog.b.a.a("win:playTime", j.a.get((int)this.q).b, com.saterskog.b.a.a(l2), l2, this);
        long l3 = com.saterskog.b.a.b((Context)this);
        com.saterskog.b.a.a("win:installTime", j.a.get((int)this.q).b, com.saterskog.b.a.a(l3), l3, this);
        com.saterskog.b.a.a("win:id_play_now_install", j.a.get((int)this.q).b + "," + l2 + "," + com.saterskog.b.a.c() + "," + com.saterskog.b.a.a((Context)this), "", l3, this);
    }

    @Override
    public void onBackPressed() {
        this.i();
    }

    /*
     * Enabled aggressive block sorting
     */
    public void onClick(View view) {
        AlertDialog.Builder builder;
        int n2;
        Object object;
        if (view.getId() == 2131230824) {
            if (this.q == -1) {
                object = this.O == null ? new Integer[2] : new Integer[3];
                for (n2 = 0; n2 < ((Integer[])object).length; ++n2) {
                    object[n2] = new Integer(n2);
                }
                builder = new ArrayAdapter<Integer>((Context)this, (Integer[])object, (Integer[])object){
                    final /* synthetic */ Integer[] a;
                    {
                        this.a = arrinteger2;
                        super(context, 0x1090011, 16908308, (Object[])arrinteger);
                    }

                    /*
                     * Enabled aggressive block sorting
                     */
                    public final View getView(int n2, View view, ViewGroup viewGroup) {
                        int n3;
                        viewGroup = super.getView(n2, view, viewGroup);
                        view = (TextView)viewGroup.findViewById(16908308);
                        if (n2 == 0) {
                            n3 = 2131165277;
                            view.setText((CharSequence)(PlayActivity.this.getString(2131624201) + "..."));
                        } else {
                            n3 = 0;
                        }
                        int n4 = n3;
                        if (n2 == this.a.length - 2) {
                            n4 = n3;
                            if (PlayActivity.this.O != null) {
                                n4 = 2131165276;
                                view.setText(2131624256);
                            }
                        }
                        if (n2 == this.a.length - 1) {
                            n4 = 2131165275;
                            view.setText(2131624257);
                        }
                        view.setCompoundDrawablesWithIntrinsicBounds(n4, 0, 0, 0);
                        return viewGroup;
                    }
                };
                object = new AlertDialog.Builder((Context)this).setAdapter((ListAdapter)builder, new DialogInterface.OnClickListener((Integer[])object){
                    final /* synthetic */ Integer[] a;
                    {
                        this.a = arrinteger;
                    }

                    /*
                     * Enabled aggressive block sorting
                     */
                    public final void onClick(DialogInterface dialogInterface, int n2) {
                        if (n2 == 0) {
                            PlayActivity.f(PlayActivity.this);
                        }
                        if (n2 == this.a.length - 2 && PlayActivity.this.O != null) {
                            if (PreferenceManager.getDefaultSharedPreferences((Context)PlayActivity.this).getBoolean("ask_sterilize_sample", true)) {
                                PlayActivity.this.a((short)11);
                                dialogInterface = new AlertDialog.Builder((Context)PlayActivity.this);
                                dialogInterface.setTitle(2131624036);
                                dialogInterface.setMessage((CharSequence)PlayActivity.this.getString(2131624038));
                                dialogInterface.setPositiveButton((CharSequence)PlayActivity.this.getString(2131624028), new DialogInterface.OnClickListener(){

                                    public final void onClick(DialogInterface dialogInterface, int n2) {
                                        PlayActivity.g(PlayActivity.this);
                                    }
                                });
                                dialogInterface.setNegativeButton((CharSequence)PlayActivity.this.getString(2131624027), new DialogInterface.OnClickListener(){

                                    public final void onClick(DialogInterface dialogInterface, int n2) {
                                        dialogInterface.cancel();
                                    }
                                });
                                dialogInterface = dialogInterface.create();
                                dialogInterface.show();
                                dialogInterface = dialogInterface.findViewById(dialogInterface.getContext().getResources().getIdentifier("android:id/titleDivider", null, null));
                                if (dialogInterface != null) {
                                    dialogInterface.setBackgroundColor(PlayActivity.this.getResources().getColor(2131034132));
                                }
                            } else {
                                PlayActivity.g(PlayActivity.this);
                            }
                        }
                        if (n2 == this.a.length - 1) {
                            PlayActivity.this.e();
                        }
                        PlayActivity.this.a((short)11);
                    }
                }).setTitle(2131624211).show();
                if ((object = object.findViewById(object.getContext().getResources().getIdentifier("android:id/titleDivider", null, null))) != null) {
                    object.setBackgroundColor(this.getResources().getColor(2131034132));
                }
            } else if (PreferenceManager.getDefaultSharedPreferences((Context)this).getBoolean("ask_sterilize_sample", true)) {
                this.a((short)11);
                object = new AlertDialog.Builder((Context)this);
                object.setTitle(2131624036);
                object.setMessage((CharSequence)this.getString(2131624038));
                object.setPositiveButton(2131624030, new DialogInterface.OnClickListener(){

                    public final void onClick(DialogInterface dialogInterface, int n2) {
                        PlayActivity.this.e();
                    }
                });
                object.setNegativeButton((CharSequence)this.getString(2131624027), new DialogInterface.OnClickListener(){

                    public final void onClick(DialogInterface dialogInterface, int n2) {
                        dialogInterface.cancel();
                    }
                });
                object = object.create();
                object.show();
                if ((object = object.findViewById(object.getContext().getResources().getIdentifier("android:id/titleDivider", null, null))) != null) {
                    object.setBackgroundColor(this.getResources().getColor(2131034132));
                }
            } else {
                this.e();
            }
        }
        if (view.getId() == 2131230924) {
            this.a((short)9);
            builder = this.getResources().getStringArray(2130837515);
            n2 = this.x ? 4 : 3;
            object = new CharSequence[n2];
            this.getResources().getColor(2131034160);
            object[0] = builder[0];
            if (this.x) {
                object[1] = builder[3];
                n2 = 2;
            } else {
                n2 = 1;
            }
            object[n2] = builder[1];
            object[n2 + 1] = builder[2];
            builder = new AlertDialog.Builder((Context)this);
            builder.setTitle(2131624281);
            if (this.H == 0) {
                builder.setIcon(2131165290);
            }
            if (this.H == 1) {
                builder.setIcon(2131165291);
            }
            if (this.H == 2) {
                builder.setIcon(2131165289);
            }
            if (this.H == 3) {
                builder.setIcon(2131165292);
            }
            builder.setItems((CharSequence[])object, new DialogInterface.OnClickListener(){

                /*
                 * Enabled aggressive block sorting
                 */
                public final void onClick(DialogInterface dialogInterface, int n2) {
                    if (PlayActivity.this.x) {
                        if (n2 == 0) {
                            PlayActivity.this.a(0);
                        }
                        if (n2 == 1) {
                            PlayActivity.this.a(3);
                        }
                        if (n2 == 2) {
                            PlayActivity.this.a(1);
                        }
                        if (n2 != 3) return;
                        PlayActivity.this.a(2);
                        return;
                    }
                    if (n2 == 0) {
                        PlayActivity.this.a(0);
                    }
                    if (n2 == 1) {
                        PlayActivity.this.a(1);
                    }
                    if (n2 != 2) return;
                    PlayActivity.this.a(2);
                }
            });
            object = builder.create();
            object.setCanceledOnTouchOutside(true);
            object.show();
            object = object.findViewById(object.getContext().getResources().getIdentifier("android:id/titleDivider", null, null));
            if (object != null) {
                object.setBackgroundColor(this.getResources().getColor(2131034132));
            }
        }
        if (view.getId() == 2131230962) {
            this.a((short)9);
            this.k();
        }
    }

    /*
     * Exception decompiling
     */
    @Override
    protected void onCreate(Bundle var1_1) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * java.lang.IllegalStateException: Backjump on non jumping statement [17, 12] lbl89 : ExpressionStatement: var4_20.printStackTrace();
         * 
         * org.benf.cfr.reader.bytecode.analysis.opgraph.op3rewriters.Cleaner$1.call(Cleaner.java:44)
         * org.benf.cfr.reader.bytecode.analysis.opgraph.op3rewriters.Cleaner$1.call(Cleaner.java:22)
         * org.benf.cfr.reader.util.graph.GraphVisitorDFS.process(GraphVisitorDFS.java:68)
         * org.benf.cfr.reader.bytecode.analysis.opgraph.op3rewriters.Cleaner.removeUnreachableCode(Cleaner.java:54)
         * org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:677)
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
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater menuInflater = this.getMenuInflater();
        if (this.q == -1) {
            menuInflater.inflate(2131427328, menu);
        } else if (this.r == -1) {
            menuInflater.inflate(2131427329, menu);
        } else {
            menuInflater.inflate(2131427330, menu);
            ((Button)menu.findItem(2131230802).getActionView().findViewById(2131230909)).setOnClickListener(new View.OnClickListener(){

                public final void onClick(View view) {
                    com.saterskog.cell_lab.t.a(PlayActivity.this);
                }
            });
        }
        this.M = (ImageButton)menu.findItem(2131230802).getActionView().findViewById(2131230924);
        this.N = (ImageButton)menu.findItem(2131230802).getActionView().findViewById(2131230962);
        this.M.setOnClickListener((View.OnClickListener)this);
        if (this.H == 0) {
            this.M.setImageResource(2131165290);
        }
        if (this.H == 1) {
            this.M.setImageResource(2131165291);
        }
        if (this.H == 2) {
            this.M.setImageResource(2131165289);
        }
        if (this.H == 3) {
            this.M.setImageResource(2131165292);
        }
        if (this.N != null) {
            this.N.setOnClickListener((View.OnClickListener)this);
            if (this.I == 0) {
                this.N.setImageResource(2131165295);
            }
            if (this.I == 1) {
                this.N.setImageResource(2131165297);
            }
            if (this.I == 2) {
                this.N.setImageResource(2131165294);
            }
            if (this.I == 3) {
                this.N.setImageResource(2131165298);
            }
            if (this.I == 4) {
                this.N.setImageResource(0x7F070070);
            }
        }
        if ((menuInflater = menu.findItem(2131230802).getActionView().findViewById(2131230824)) == null) {
            com.saterskog.b.a.a("wefwef222");
        }
        this.J = (ImageButton)menuInflater;
        this.J.setOnClickListener((View.OnClickListener)this);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public void onDestroy() {
        if (this.y != null) {
            this.y.release();
            this.y = null;
        }
        if (this.z != null) {
            this.z.release();
            this.z = null;
        }
        super.onDestroy();
    }

    @Override
    public final boolean onMenuItemSelected(int n2, MenuItem menuItem) {
        if (Build.VERSION.SDK_INT < 18 && menuItem.getTitleCondensed() != null) {
            menuItem.setTitleCondensed((CharSequence)menuItem.getTitleCondensed().toString());
        }
        return super.onMenuItemSelected(n2, menuItem);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        switch (menuItem.getItemId()) {
            default: {
                return super.onOptionsItemSelected(menuItem);
            }
            case 16908332: 
        }
        this.i();
        return true;
    }

    @Override
    public void onPause() {
        if (this.q != -1 && this.K != -1L) {
            j.a((Context)this, this.q, this.K);
        }
        if (this.z != null) {
            this.z.pause();
            this.A = this.z.getCurrentPosition();
        }
        super.onPause();
    }

    @Override
    public void onResume() {
        if (this.q != -1) {
            this.K = com.saterskog.b.a.c();
        }
        if (this.z != null && PreferenceManager.getDefaultSharedPreferences((Context)this).getBoolean("music", true)) {
            this.z.seekTo(this.A);
            this.z.start();
        }
        super.onResume();
    }

    @Override
    protected void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putInt("tab", this.getActionBar().getSelectedNavigationIndex());
        bundle.putInt("modeSpinner", this.H);
        bundle.putInt("toolSpinner", this.I);
        bundle.putInt("challenge", this.q);
        bundle.putInt("tutorial", this.r);
        bundle.putInt("loadChallenge", this.s);
        bundle.putBoolean("old", this.o);
        bundle.putBoolean("external", this.p);
        bundle.putString("plateName", this.O);
        bundle.putString("name", this.t);
        bundle.putParcelable("ienv", (Parcelable)this.G);
        bundle.putParcelable("mUri", (Parcelable)this.L);
        if (this.z != null) {
            bundle.putInt("song_pos", this.z.getCurrentPosition());
        }
        if (this.D != null) {
            bundle.putSerializable("logFile", (Serializable)this.D);
        }
        com.saterskog.cell_lab.t.a(bundle);
    }

    public void onTabReselected(ActionBar.Tab tab, FragmentTransaction fragmentTransaction) {
        this.c(tab.getPosition());
    }

    public void onTabSelected(ActionBar.Tab tab, FragmentTransaction fragmentTransaction) {
        this.c(tab.getPosition());
    }

    public void onTabUnselected(ActionBar.Tab tab, FragmentTransaction fragmentTransaction) {
        this.a((short)6);
    }

    public final class a
    extends d {
        public a(FragmentManager fragmentManager) {
            super(fragmentManager);
        }

        /*
         * Enabled force condition propagation
         * Lifted jumps to return sites
         */
        @Override
        public final Fragment a(int n2) {
            Fragment fragment;
            int n3 = 0;
            boolean bl = false;
            switch (n2) {
                default: {
                    com.saterskog.b.a.a("skit:navigated past end");
                    return null;
                }
                case 0: {
                    if (PlayActivity.this.q == -1) {
                        return new o();
                    }
                    fragment = new m();
                    fragment.b = PlayActivity.this.q;
                    return fragment;
                }
                case 1: {
                    fragment = new p();
                    fragment.j = PlayActivity.this.b();
                    fragment.h = PlayActivity.this.o;
                    fragment.i = PlayActivity.this.t;
                    fragment.k = PlayActivity.this.p;
                    if (PlayActivity.this.q != -1) {
                        bl = true;
                    }
                    fragment.l = bl;
                    fragment.c = PlayActivity.this.q;
                    fragment.d = PlayActivity.this.s;
                    fragment.f = ((PlayActivity)PlayActivity.this).G.k;
                    fragment.e = PlayActivity.this.I;
                    return fragment;
                }
                case 2: 
            }
            fragment = new i();
            boolean[] arrbl = j.i(PlayActivity.this.q, (Context)PlayActivity.this);
            fragment.e = new ArrayList();
            n2 = n3;
            while (n2 < h.B.length) {
                if (arrbl[n2]) {
                    fragment.e.add(h.B[n2]);
                }
                ++n2;
            }
            return fragment;
        }

        @Override
        public final int b() {
            return 3;
        }
    }
}

