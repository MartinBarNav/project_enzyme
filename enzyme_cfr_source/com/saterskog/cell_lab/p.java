/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.app.ActivityManager
 *  android.app.ActivityManager$MemoryInfo
 *  android.app.Fragment
 *  android.content.ActivityNotFoundException
 *  android.content.Context
 *  android.content.Intent
 *  android.graphics.Color
 *  android.net.Uri
 *  android.os.Bundle
 *  android.os.Parcelable
 *  android.preference.PreferenceManager
 *  android.text.Html
 *  android.util.DisplayMetrics
 *  android.util.TypedValue
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.view.ViewGroup
 *  android.view.ViewGroup$LayoutParams
 *  android.widget.RelativeLayout
 *  android.widget.RelativeLayout$LayoutParams
 *  android.widget.TextView
 *  android.widget.Toast
 */
package com.saterskog.cell_lab;

import android.app.Activity;
import android.app.ActivityManager;
import android.app.Fragment;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import android.preference.PreferenceManager;
import android.text.Html;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;
import com.saterskog.cell_lab.Cell;
import com.saterskog.cell_lab.CellWorld;
import com.saterskog.cell_lab.Environment;
import com.saterskog.cell_lab.Gene;
import com.saterskog.cell_lab.PlayActivity;
import com.saterskog.cell_lab.h;
import com.saterskog.cell_lab.j;
import com.saterskog.cell_lab.q;
import com.saterskog.cell_lab.r;
import com.saterskog.cell_lab.t;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.StreamCorruptedException;
import java.util.concurrent.ExecutionException;

public final class p
extends Fragment
implements q.a {
    public r a;
    float b;
    int c = -1;
    int d;
    int e;
    double f;
    CellWorld g;
    boolean h = false;
    String i;
    InputStream j;
    public boolean k;
    boolean l = false;
    TextView m;
    TextView n;
    TextView o;
    private a p;

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public final void a(float f2) {
        if (f2 == -1.0f) {
            this.o.setText((CharSequence)"");
            return;
        }
        if ((double)(f2 = this.b / f2) > 300.0) {
            t.b(this.getActivity(), 0, 1);
        }
        if (1000.0f < f2) {
            int n2 = (int)Math.floor(Math.log10(f2));
            this.o.setText((CharSequence)Html.fromHtml((String)String.format("%.2f\u00b710<sup><small>%d</small></sup>\u00d7", (double)f2 * Math.pow(10.0, -n2), n2)));
            return;
        }
        this.o.setText((CharSequence)String.format("%.0f\u00d7", Float.valueOf(f2)));
    }

    /*
     * Enabled aggressive block sorting
     */
    public final void a(int n2) {
        TextView textView;
        int n3 = 0;
        if (this.m != null) {
            textView = this.m;
            int n4 = n2 == 4 ? 0 : 8;
            textView.setVisibility(n4);
        }
        if (this.m != null) {
            textView = this.n;
            n2 = n2 == 4 ? n3 : 8;
            textView.setVisibility(n2);
        }
    }

    @Override
    public final void a(CellWorld cellWorld) {
        if (this.p != null) {
            this.p.a(cellWorld);
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public final void a(CellWorld object, int n2) {
        Object object2;
        block44: {
            block45: {
                Object object3;
                Object object4;
                Cell cell;
                block48: {
                    h h2;
                    block47: {
                        block46: {
                            float f2;
                            if (!this.isAdded()) {
                                return;
                            }
                            if (n2 == -1) break block45;
                            cell = ((CellWorld)object).x[n2];
                            object = "" + String.format(this.getString(2131623967), cell.o) + "\n";
                            object = (String)object + String.format(this.getString(2131623973), cell.w * 10.0) + "\n";
                            object = (String)object + String.format(this.getString(2131623969), cell.d * 1000.0) + "\n";
                            object = (String)object + String.format(this.getString(2131623976), cell.p * 100.0) + "\n";
                            object4 = object = (String)object + String.format(this.getString(2131623989), Float.valueOf(cell.X)) + " " + this.getString(2131624228) + "\n";
                            if (cell.Y != 0.0f) {
                                object4 = (String)object + String.format(this.getString(2131623970), Float.valueOf(100.0f * cell.Y));
                            }
                            object = object4;
                            if (cell.q != 0.0) {
                                object = (String)object4 + String.format(this.getString(2131623971), cell.q);
                            }
                            object3 = object;
                            if (com.saterskog.cell_lab.j.a((Context)this.getActivity(), 2)) {
                                int n3 = 0;
                                while (true) {
                                    object3 = object;
                                    if (n3 >= 4) break;
                                    object = (String)object + "\n" + this.getString(2131624227) + (n3 + 1) + ": " + String.format("%.2f ", Math.min(1.0, (double)Math.max(-1.0f, cell.U[n3]))) + this.getString(2131624228);
                                    ++n3;
                                }
                            }
                            object = "" + this.getString(2131623966) + "<font color='" + String.format("#%02x%02x%02x", (int)(255.0f * cell.J[0]), (int)(255.0f * cell.J[1]), (int)(255.0f * cell.J[2])) + "'>M" + (cell.D + 1) + "</font><br>";
                            object = (String)object + this.getString(2131623990) + this.getResources().getStringArray(2130837507)[cell.b().s.ordinal()] + "<br>";
                            object4 = new StringBuilder().append((String)object).append(this.getString(2131623974));
                            object = cell.y ? this.getString(2131624369) : this.getString(2131624368);
                            object = ((StringBuilder)object4).append((String)object).append("<br>").toString();
                            object4 = object = (String)object + this.getString(2131623980);
                            if (cell.E == 1) {
                                object4 = (String)object + this.getString(2131623987);
                            }
                            object = object4;
                            if (cell.E == 0) {
                                object = (String)object4 + this.getString(2131623981);
                            }
                            object4 = object;
                            if (cell.E == 2) {
                                object4 = (String)object + this.getString(2131623982);
                            }
                            object = object4;
                            if (cell.E == 4) {
                                object = (String)object4 + this.getString(2131623986);
                            }
                            object4 = object;
                            if (cell.E == 3) {
                                object4 = (String)object + this.getString(2131623984);
                            }
                            object = object4;
                            if (cell.E == 5) {
                                object = (String)object4 + this.getString(2131623985);
                            }
                            object4 = object;
                            if (cell.E == 6) {
                                object4 = (String)object + this.getString(2131623983);
                            }
                            object = (String)object4 + "<br>";
                            object4 = object = (String)object + this.getString(2131623975) + cell.G + "<br>";
                            if (cell.T != -1) {
                                object4 = (String)object + this.getString(2131623988) + cell.T + "<br>";
                            }
                            object2 = object3;
                            object = object4;
                            if (n2 == -1) break block44;
                            h2 = cell.b().s;
                            object = object4;
                            if (h2 == com.saterskog.cell_lab.h.g) {
                                f2 = cell.a(1, 0);
                                object4 = new StringBuilder().append((String)object4).append(this.getString(2131623968)).append("\u03c1<sub><small>H<sub><small>2</small></sub>O</small></sub> ");
                                object = f2 < 0.0f ? "- " : "+ ";
                                object = ((StringBuilder)object4).append((String)object).append(String.format("%.0f", Float.valueOf(Math.abs(f2) * 100.0f))).append(" kg/m<sup><small>3</small></sup>").toString();
                            }
                            object4 = object;
                            if (h2 == com.saterskog.cell_lab.h.b) {
                                f2 = cell.a(0, 0);
                                object = (String)object + String.format(this.getString(2131623979), Float.valueOf(f2 * 3.8580246f));
                                object4 = (String)object + String.format(this.getString(2131623978), 500.0 * Math.sqrt(cell.e * cell.e + cell.f * cell.f));
                            }
                            object = object4;
                            if (h2 == com.saterskog.cell_lab.h.m) {
                                object = (String)object4 + this.getString(2131624162) + String.format(": %.2f", Float.valueOf(cell.a(3, 0))) + "<br>";
                                object = (String)object + this.getString(2131624161) + String.format(": %.2f", Float.valueOf(cell.a(2, 0))) + "<br>";
                                object = (String)object + this.getString(2131624163) + String.format(": %.2f", Float.valueOf(cell.a(4, 0))) + "<br>";
                            }
                            object4 = object;
                            if (h2 == com.saterskog.cell_lab.h.e) {
                                object4 = (String)object + String.format(this.getString(2131623972), Float.valueOf(cell.S * 10.0f));
                            }
                            object = object4;
                            if (h2 == com.saterskog.cell_lab.h.o) {
                                object4 = (String)object4 + this.getString(2131624137) + ": ";
                                n2 = cell.b(4);
                                object = object4;
                                if (n2 == 1) {
                                    object = (String)object4 + this.getString(2131624205);
                                }
                                object2 = object;
                                if (n2 == 0) {
                                    object2 = (String)object + this.getString(2131624206);
                                }
                                object4 = object2;
                                if (n2 == 4) {
                                    object4 = (String)object2 + this.getString(2131624204);
                                }
                                object = object4;
                                if (n2 == 2) {
                                    object = (String)object4 + this.getString(2131624209);
                                }
                                object2 = object;
                                if (n2 == 3) {
                                    object2 = (String)object + this.getString(2131624208);
                                }
                                object4 = object2;
                                if (n2 == 5) {
                                    object4 = (String)object2 + this.getString(2131624207);
                                }
                                object = object4;
                                if (n2 == 6) {
                                    object = (String)object4 + this.getString(2131624210);
                                }
                                object4 = object;
                                if (n2 >= 7) {
                                    object4 = object;
                                    if (n2 < 11) {
                                        object4 = (String)object + "-" + this.getString(2131624227) + (n2 + 1 - 7);
                                    }
                                }
                                object = object4;
                                if (n2 >= 7) {
                                    object = object4;
                                    if (n2 >= 11) {
                                        object = (String)object4 + "+" + this.getString(2131624227) + (n2 + 1 - 7 - 4);
                                    }
                                }
                            }
                            if (h2 == com.saterskog.cell_lab.h.l) break block46;
                            object4 = object;
                            if (h2 != com.saterskog.cell_lab.h.k) break block47;
                        }
                        object4 = (String)object + this.getString(2131624095) + ": ";
                        n2 = cell.b(3);
                        object = object4;
                        if (n2 == 0) {
                            object = (String)object4 + this.getString(2131624242);
                        }
                        object4 = object;
                        if (n2 == 5) {
                            object4 = (String)object + this.getString(2131624247);
                        }
                        object = object4;
                        if (n2 == 3) {
                            object = (String)object4 + this.getString(2131624244);
                        }
                        object4 = object;
                        if (n2 == 1) {
                            object4 = (String)object + this.getString(2131624243);
                        }
                        object = object4;
                        if (n2 == 2) {
                            object = (String)object4 + this.getString(2131624245);
                        }
                        object4 = object;
                        if (n2 == 4) {
                            object4 = (String)object + this.getString(2131624246);
                        }
                        object4 = (String)object4 + "<br>";
                    }
                    if (h2 == com.saterskog.cell_lab.h.n || h2 == com.saterskog.cell_lab.h.l) break block48;
                    object2 = object3;
                    object = object4;
                    if (h2 != com.saterskog.cell_lab.h.k) break block44;
                }
                n2 = 0;
                while (true) {
                    object2 = object3;
                    object = object4;
                    if (n2 < 4) {
                        object4 = (String)object4 + this.getString(2131624227) + (n2 + 1) + String.format(this.getString(2131623965), Float.valueOf(cell.V[n2])) + " " + this.getString(2131624228) + "/" + this.getString(2131624145) + "<br>";
                        ++n2;
                        continue;
                    }
                    break block44;
                    break;
                }
                break block44;
            }
            object2 = this.getString(2131623977);
            object = "";
        }
        this.getActivity().runOnUiThread(new Runnable((String)object2, (String)object){
            final /* synthetic */ String a;
            final /* synthetic */ String b;
            {
                this.a = string;
                this.b = string2;
            }

            @Override
            public final void run() {
                p.this.m.setText((CharSequence)this.a);
                p.this.n.setText((CharSequence)Html.fromHtml((String)this.b));
            }
        });
    }

    public final void onAttach(Activity activity) {
        super.onAttach(activity);
        try {
            this.p = (a)activity;
            return;
        }
        catch (ClassCastException classCastException) {
            throw new ClassCastException(activity.toString() + " must implement CellProvider");
        }
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    public final View onCreateView(LayoutInflater var1_1, ViewGroup var2_6, Bundle var3_7) {
        block21: {
            block20: {
                super.onCreateView((LayoutInflater)var1_1, var2_6 /* !! */ , var3_7 /* !! */ );
                if (var3_7 /* !! */  == null) ** GOTO lbl9
                try {
                    this.g = (CellWorld)var3_7 /* !! */ .getParcelable("mCellWorld");
                    this.f = var3_7 /* !! */ .getDouble("radius");
                    this.c = var3_7 /* !! */ .getInt("challenge");
                    break block20;
lbl9:
                    // 1 sources

                    var1_1 = this.p.c();
                    var5_8 /* !! */  = (ActivityManager)this.getActivity().getSystemService("activity");
                    var2_6 /* !! */  = new ActivityManager.MemoryInfo();
                    var5_8 /* !! */ .getMemoryInfo((ActivityManager.MemoryInfo)var2_6 /* !! */ );
                    if (var2_6 /* !! */ .availMem < CellWorld.a((Environment)var1_1)) {
                        com.saterskog.b.a.a("Estimated memory to not be enough");
                        var1_1 = new OutOfMemoryError();
                        throw var1_1;
                    }
                    var2_6 /* !! */  = new CellWorld(false, (Environment)var1_1);
                    this.g = var2_6 /* !! */ ;
                    var1_1 = this.j;
                    if (var1_1 == null) break block20;
                    ** try [egrp 3[TRYBLOCK] [4, 5, 6 : 432->555)] { 
lbl22:
                    // 1 sources

                }
                catch (OutOfMemoryError var1_2) {
                    this.g = null;
                    Toast.makeText((Context)this.getActivity(), (CharSequence)this.getString(2131624348), (int)1).show();
                    this.getActivity().finish();
                    break block21;
                }
                {
                    var7_9 = this.g.a(this.j);
                    if (this.c == -1 && this.k && var7_9 < 95) {
                        var2_6 /* !! */  = this.getActivity();
                        var1_1 = new StringBuilder("format conversion v");
                        Toast.makeText((Context)var2_6 /* !! */ , (CharSequence)var1_1.append(var7_9).append(" \u2192 v95").toString(), (int)1).show();
                    }
                    if (this.c != -1) {
                        this.g.c(0);
                        this.g.M = 0.0;
                    }
                    this.j.close();
                    if (this.l) {
                        this.g.c(0);
                    }
                }
lbl41:
                // 1 sources

                catch (FileNotFoundException var1_3) {
                    var1_3.printStackTrace();
                }
lbl44:
                // 1 sources

                catch (StreamCorruptedException var1_4) {
                    var1_4.printStackTrace();
                }
lbl47:
                // 1 sources

                catch (IOException var1_5) {
                    com.saterskog.b.a.a("io this is bad");
                    var1_5.printStackTrace();
                }
            }
            this.f = this.g.e.k;
        }
        var2_6 /* !! */  = new RelativeLayout((Context)this.getActivity());
        if (this.g != null) {
            this.a = new r(this.getActivity(), this.g, this.p, this, this.c, this.f);
            this.a.setId(2131230831);
            if (var3_7 /* !! */  != null) {
                this.a.a.z = var3_7 /* !! */ .getInt("mode");
                this.a.a.A = var3_7 /* !! */ .getInt("tool");
                this.a.a.M = var3_7 /* !! */ .getBoolean("hasWon");
            } else {
                this.a.a.A = this.e;
            }
            var2_6 /* !! */ .addView((View)this.a);
        }
        var4_10 = (int)TypedValue.applyDimension((int)1, (float)8.0f, (DisplayMetrics)this.getActivity().getResources().getDisplayMetrics());
        var5_8 /* !! */  = (PlayActivity)this.getActivity();
        if (var5_8 /* !! */  != null && var5_8 /* !! */ .D != null) {
            var1_1 = new TextView((Context)this.getActivity());
            var1_1.setId(2131230830);
            var3_7 /* !! */  = PreferenceManager.getDefaultSharedPreferences((Context)this.getActivity()).getString("log_stats", "none");
            var6_11 = this.getResources().getStringArray(2130837514);
            for (var7_9 = 0; var7_9 < var6_11.length && !var6_11[var7_9].equals((Object)var3_7 /* !! */ ); ++var7_9) {
            }
            var1_1.setText((CharSequence)(this.getString(2131624149) + this.getResources().getStringArray(2130837513)[var7_9].toLowerCase() + this.getString(2131624150) + var5_8 /* !! */ .D.getAbsolutePath()));
            var1_1.setTextColor(-1);
            var1_1.setTextSize(1, 14.0f);
            var1_1.setBackgroundColor(Color.argb((int)192, (int)0, (int)0, (int)0));
            var1_1.setOnClickListener(new View.OnClickListener(var5_8 /* !! */ .D.getParentFile()){
                final /* synthetic */ File a;
                {
                    this.a = file;
                }

                /*
                 * Enabled force condition propagation
                 * Lifted jumps to return sites
                 */
                public final void onClick(View view) {
                    Uri uri = Uri.fromFile((File)this.a);
                    view = new Intent("android.intent.action.VIEW");
                    view.setDataAndType(uri, "*/*");
                    view.setPackage("com.android.chrome");
                    try {
                        p.this.startActivity((Intent)view);
                        return;
                    }
                    catch (ActivityNotFoundException activityNotFoundException) {
                        Toast.makeText((Context)p.this.getActivity(), (CharSequence)"Please install Chrome.", (int)1).show();
                        return;
                    }
                }
            });
            var1_1.setPadding(var4_10, var4_10, var4_10, var4_10);
            var3_7 /* !! */  = new RelativeLayout.LayoutParams(-1, -2);
            var3_7 /* !! */ .addRule(12);
            var2_6 /* !! */ .addView((View)var1_1, (ViewGroup.LayoutParams)var3_7 /* !! */ );
            var7_9 = 0;
        } else {
            var1_1 = null;
            var7_9 = var4_10;
        }
        this.m = new TextView((Context)this.getActivity());
        this.m.setTextColor(-1);
        this.m.setTextSize(1, 14.0f);
        this.m.setBackgroundColor(Color.argb((int)192, (int)0, (int)0, (int)0));
        this.m.setPadding(var4_10, var4_10, var4_10, var7_9);
        this.m.setMinimumWidth(var2_6 /* !! */ .getWidth() / 2);
        this.m.setVisibility(4);
        var3_7 /* !! */  = new RelativeLayout.LayoutParams(-2, -2);
        var5_8 /* !! */  = new RelativeLayout.LayoutParams(-2, -2);
        if (var1_1 == null) {
            var3_7 /* !! */ .addRule(12);
            var5_8 /* !! */ .addRule(12);
        } else {
            var3_7 /* !! */ .addRule(2, 2131230830);
            var5_8 /* !! */ .addRule(2, 2131230830);
        }
        var3_7 /* !! */ .addRule(9);
        this.m.setId(2131230828);
        var2_6 /* !! */ .addView((View)this.m, (ViewGroup.LayoutParams)var3_7 /* !! */ );
        this.n = new TextView((Context)this.getActivity());
        this.n.setTextColor(-1);
        this.n.setTextSize(1, 14.0f);
        this.n.setBackgroundColor(Color.argb((int)192, (int)0, (int)0, (int)0));
        this.n.setPadding(var4_10, var4_10, var4_10, var7_9);
        this.n.setMinimumWidth(var2_6 /* !! */ .getWidth() / 2);
        this.n.setVisibility(4);
        var5_8 /* !! */ .addRule(11);
        this.n.setId(2131230829);
        var5_8 /* !! */ .addRule(1, 2131230828);
        var5_8 /* !! */ .addRule(6, 2131230828);
        var2_6 /* !! */ .addView((View)this.n, (ViewGroup.LayoutParams)var5_8 /* !! */ );
        this.o = new TextView((Context)this.getActivity());
        this.o.setTextColor(-16777216);
        this.o.setTextSize(1, 18.0f);
        this.o.setPadding(var4_10, var4_10, var4_10, var4_10);
        var1_1 = new RelativeLayout.LayoutParams(-2, -2);
        var1_1.addRule(11);
        var1_1.addRule(10);
        var2_6 /* !! */ .addView((View)this.o, (ViewGroup.LayoutParams)var1_1);
        var1_1 = this.getResources().getDisplayMetrics();
        var8_12 = var1_1.density * 160.0f;
        this.b = (float)((double)var1_1.widthPixels * 0.0254 / var8_12);
        if (this.g == null) return var2_6 /* !! */ ;
        this.a(this.a.a.A);
        return var2_6 /* !! */ ;
    }

    public final void onDestroy() {
        super.onDestroy();
    }

    public final void onPause() {
        super.onPause();
    }

    public final void onResume() {
        super.onResume();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        q q2 = this.a.a;
        if (q2.F != null) {
            try {
                q2.F.get();
            }
            catch (InterruptedException interruptedException) {
                interruptedException.printStackTrace();
            }
            catch (ExecutionException executionException) {
                executionException.printStackTrace();
            }
        }
        try {
            bundle.putParcelable("mCellWorld", (Parcelable)this.g);
            bundle.putDouble("radius", this.f);
            bundle.putInt("mode", this.a.a.z);
            bundle.putInt("tool", this.a.a.A);
            bundle.putInt("challenge", this.c);
            bundle.putBoolean("hasWon", this.a.a.M);
            return;
        }
        catch (OutOfMemoryError outOfMemoryError) {
            Toast.makeText((Context)this.getActivity(), (CharSequence)"Not enough memory", (int)1).show();
            return;
        }
    }

    public final void onStart() {
        super.onStart();
    }

    public final void onStop() {
        super.onStop();
    }

    public static interface a {
        public void a(float var1);

        public void a(CellWorld var1);

        public void a(CellWorld var1, boolean var2);

        public void a(short var1);

        public Environment c();

        public Gene[] f();

        public boolean g();
    }
}

