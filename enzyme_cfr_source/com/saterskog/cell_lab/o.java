/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.app.AlertDialog$Builder
 *  android.app.Fragment
 *  android.content.Context
 *  android.content.DialogInterface
 *  android.content.DialogInterface$OnClickListener
 *  android.os.Bundle
 *  android.os.Handler
 *  android.os.Parcelable
 *  android.text.Html
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.view.ViewGroup
 *  android.widget.CheckBox
 *  android.widget.CompoundButton
 *  android.widget.CompoundButton$OnCheckedChangeListener
 *  android.widget.SeekBar
 *  android.widget.SeekBar$OnSeekBarChangeListener
 *  android.widget.TextView
 */
package com.saterskog.cell_lab;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Fragment;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.os.Handler;
import android.os.Parcelable;
import android.text.Html;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.SeekBar;
import android.widget.TextView;
import com.saterskog.cell_lab.Environment;
import com.saterskog.cell_lab.GenePoolView;
import com.saterskog.cell_lab.h;
import com.saterskog.cell_lab.j;

public final class o
extends Fragment
implements View.OnClickListener,
CompoundButton.OnCheckedChangeListener,
SeekBar.OnSeekBarChangeListener {
    Environment a;
    TextView b;
    private a c = null;
    private GenePoolView d;

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private String a(int n2, double d2, double d3) {
        if (!this.isAdded()) {
            return "";
        }
        String string = this.getActivity().getString(2131624195) + String.format("%1$,.1f", d3) + " " + this.getActivity().getString(2131624145) + ".";
        string = string + "\n" + this.getActivity().getString(2131624196);
        string = string + n2;
        return string + "\n" + this.getActivity().getString(2131624197) + String.format("%1$,.1f", d2);
    }

    private void a(int n2, double d2) {
        SeekBar seekBar = (SeekBar)this.getActivity().findViewById(n2);
        if (seekBar != null) {
            seekBar.setProgress((int)(1000.0 * d2));
        }
    }

    private void a(int n2, boolean bl) {
        CheckBox checkBox = (CheckBox)this.getActivity().findViewById(n2);
        if (checkBox != null) {
            checkBox.setChecked(bl);
        }
    }

    private void a(View view, int n2) {
        ((CheckBox)view.findViewById(n2)).setOnCheckedChangeListener((CompoundButton.OnCheckedChangeListener)this);
    }

    private void b() {
        this.c.a(this.a);
    }

    private void b(View view, int n2) {
        ((SeekBar)view.findViewById(n2)).setOnSeekBarChangeListener((SeekBar.OnSeekBarChangeListener)this);
    }

    /*
     * Enabled aggressive block sorting
     */
    public final void a() {
        int n2;
        int n3 = 0;
        this.a(2131230870, this.a.c / 0.09);
        this.a(2131230844, this.a.a / 14.999999999999998);
        this.a(2131230851, (this.a.b - 0.021599999999999998) / 1.1303999999999998);
        this.a(2131230847, this.a.p / 100.0);
        this.a(2131230848, (this.a.q - 0.01) / 0.19);
        this.a(2131230845, this.a.o);
        this.a(2131230872, this.a.n);
        this.a(2131230862, this.a.d / 2.0);
        this.a(2131230865, this.a.e / 1.0);
        this.a(2131230863, this.a.f / 1.0);
        this.a(2131230874, this.a.g / 150.0);
        this.a(2131230854, this.a.m / 8.0);
        this.a(2131230856, this.a.l / 8.0);
        this.a(2131230842, (this.a.h + 3.3) / 6.6);
        this.a(2131230860, (this.a.i - 0.0) / 1.0);
        this.a(2131230858, (this.a.j - 0.0) / -2.0);
        this.a(2131230869, this.a.z);
        this.a(2131230751, this.a.w);
        this.a(2131230753, this.a.x);
        this.a(2131230755, this.a.u);
        this.a(2131230752, this.a.v);
        this.a(2131230754, this.a.y);
        if (this.d != null) {
            for (n2 = 0; n2 < this.d.a.length; ++n2) {
                this.d.a[n2].setChecked(this.a.t[this.d.b[n2]]);
            }
        }
        int n4 = -1;
        int n5 = 0;
        for (n2 = 0; n2 < h.B.length; ++n2) {
            int n6 = n5;
            if (this.a.t[n2]) {
                n6 = n5 + 1;
                n4 = n2;
            }
            n5 = n6;
        }
        if (n5 != 1) {
            for (n2 = n3; n2 < this.d.a.length; ++n2) {
                this.d.a[n2].setEnabled(true);
            }
            return;
        }
        for (n2 = 0; n2 < this.d.a.length; ++n2) {
            if (this.d.b[n2] != n4) continue;
            this.d.a[n2].setEnabled(false);
            return;
        }
    }

    public final void onAttach(Activity activity) {
        super.onAttach(activity);
        try {
            this.c = (a)activity;
            return;
        }
        catch (ClassCastException classCastException) {
            throw new ClassCastException(activity.toString() + " must implement SampleInfoReceiver");
        }
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    public final void onCheckedChanged(CompoundButton var1_1, boolean var2_2) {
        block14: {
            block15: {
                var3_3 = 0;
                switch (var1_1.getId()) {
                    default: {
                        break;
                    }
                    case 2131230751: {
                        this.a.w = var2_2;
                        break block15;
                    }
                    case 2131230753: {
                        this.a.x = var2_2;
                        break block15;
                    }
                    case 2131230755: {
                        this.a.u = var2_2;
                        break block15;
                    }
                    case 2131230752: {
                        this.a.v = var2_2;
                        break block15;
                    }
                    case 2131230754: {
                        this.a.y = var2_2;
                        break block15;
                    }
                }
                for (var4_4 = 0; var4_4 < this.d.a.length; ++var4_4) {
                    if (this.d.a[var4_4] != var1_1) continue;
                    this.a.t[this.d.b[var4_4]] = var2_2;
                    var5_5 = -1;
                    var6_6 = 0;
                    for (var4_4 = 0; var4_4 < h.B.length; ++var4_4) {
                        var7_7 = var6_6;
                        if (this.a.t[var4_4]) {
                            var7_7 = var6_6 + 1;
                            var5_5 = var4_4;
                        }
                        var6_6 = var7_7;
                    }
                    if (var6_6 == 1) break block14;
                    for (var4_4 = var3_3; var4_4 < this.d.a.length; ++var4_4) {
                        this.d.a[var4_4].setEnabled(true);
                    }
                    break;
                }
            }
lbl38:
            // 3 sources

            while (true) {
                this.b();
                return;
            }
        }
        var4_4 = 0;
        while (true) {
            if (var4_4 >= this.d.a.length) ** GOTO lbl38
            if (this.d.b[var4_4] == var5_5) {
                this.d.a[var4_4].setEnabled(false);
                ** continue;
            }
            ++var4_4;
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final void onClick(View view) {
        switch (view.getId()) {
            default: {
                return;
            }
            case 2131230825: 
        }
        String string = this.getString(2131624266);
        view = Html.fromHtml((String)this.getString(2131624265));
        AlertDialog.Builder builder = new AlertDialog.Builder((Context)this.getActivity());
        View view2 = this.getActivity().getLayoutInflater().inflate(2131361829, null);
        ((TextView)view2.findViewById(2131230953)).setText((CharSequence)string);
        ((TextView)view2.findViewById(2131230933)).setText((CharSequence)view);
        builder.setView(view2);
        builder.setNeutralButton((CharSequence)this.getActivity().getString(2131624029), new DialogInterface.OnClickListener(){

            public final void onClick(DialogInterface dialogInterface, int n2) {
                dialogInterface.cancel();
            }
        });
        builder.show();
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle == null) {
            this.a = new Environment();
            this.a.a(((a)this.getActivity()).c());
            return;
        }
        this.a = (Environment)bundle.getParcelable("mEnv");
    }

    public final View onCreateView(LayoutInflater arrcheckBox, ViewGroup viewGroup, Bundle bundle) {
        viewGroup = arrcheckBox.inflate(2131361827, viewGroup, false);
        ((TextView)viewGroup.findViewById(2131230943)).setText((CharSequence)this.a(0, 0.0, 0.0));
        this.a((View)viewGroup, 2131230751);
        this.a((View)viewGroup, 2131230753);
        this.a((View)viewGroup, 2131230755);
        this.a((View)viewGroup, 2131230752);
        this.a((View)viewGroup, 2131230754);
        this.d = (GenePoolView)viewGroup.findViewById(2131230787);
        this.b = (TextView)viewGroup.findViewById(2131230943);
        arrcheckBox = this.d.a;
        int n2 = arrcheckBox.length;
        for (int i2 = 0; i2 < n2; ++i2) {
            arrcheckBox[i2].setOnCheckedChangeListener((CompoundButton.OnCheckedChangeListener)this);
        }
        this.b((View)viewGroup, 2131230844);
        this.b((View)viewGroup, 2131230851);
        this.b((View)viewGroup, 2131230847);
        this.b((View)viewGroup, 2131230848);
        this.b((View)viewGroup, 2131230845);
        this.b((View)viewGroup, 2131230872);
        this.b((View)viewGroup, 2131230874);
        this.b((View)viewGroup, 2131230854);
        this.b((View)viewGroup, 2131230856);
        this.b((View)viewGroup, 2131230870);
        this.b((View)viewGroup, 2131230862);
        this.b((View)viewGroup, 2131230863);
        this.b((View)viewGroup, 2131230865);
        this.b((View)viewGroup, 2131230842);
        this.b((View)viewGroup, 2131230860);
        this.b((View)viewGroup, 2131230858);
        this.b((View)viewGroup, 2131230869);
        viewGroup.findViewById(2131230825).setOnClickListener((View.OnClickListener)this);
        if (!j.a((Context)this.getActivity(), 0)) {
            viewGroup.findViewById(2131230847).setVisibility(8);
            viewGroup.findViewById(2131230850).setVisibility(8);
            viewGroup.findViewById(2131230848).setVisibility(8);
            viewGroup.findViewById(2131230849).setVisibility(8);
            viewGroup.findViewById(2131230845).setVisibility(8);
            viewGroup.findViewById(2131230846).setVisibility(8);
            viewGroup.findViewById(2131230854).setVisibility(8);
            viewGroup.findViewById(2131230855).setVisibility(8);
            viewGroup.findViewById(2131230856).setVisibility(8);
            viewGroup.findViewById(2131230857).setVisibility(8);
            viewGroup.findViewById(2131230858).setVisibility(8);
            viewGroup.findViewById(2131230859).setVisibility(8);
            viewGroup.findViewById(2131230865).setVisibility(8);
            viewGroup.findViewById(2131230866).setVisibility(8);
            viewGroup.findViewById(2131230872).setVisibility(8);
            viewGroup.findViewById(2131230873).setVisibility(8);
            viewGroup.findViewById(2131230868).setVisibility(8);
            viewGroup.findViewById(2131230869).setVisibility(8);
        }
        this.a();
        return viewGroup;
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     */
    public final void onProgressChanged(SeekBar object, int n2, boolean bl) {
        void var3_18;
        void var2_17;
        double d2 = 0.0;
        if (this.c == null) {
            return;
        }
        double d3 = (double)var2_17 / 1000.0;
        double d4 = d2;
        switch (object.getId()) {
            default: {
                d4 = d2;
                break;
            }
            case 2131230844: {
                Environment environment = this.a;
                environment.a = d4 = d3 * 14.999999999999998;
                break;
            }
            case 2131230851: {
                Environment environment = this.a;
                environment.b = d4 = d3 * 1.1303999999999998 + 0.021599999999999998;
                break;
            }
            case 2131230847: {
                Environment environment = this.a;
                environment.p = d4 = d3 * 100.0;
                break;
            }
            case 2131230848: {
                Environment environment = this.a;
                environment.q = d4 = d3 * 0.19 + 0.01;
                break;
            }
            case 2131230845: {
                float f2;
                Environment environment = this.a;
                environment.o = f2 = (float)d3;
                d4 = f2;
                break;
            }
            case 2131230872: {
                float f3;
                Environment environment = this.a;
                environment.n = f3 = (float)d3;
                d4 = f3;
                break;
            }
            case 2131230870: {
                Environment environment = this.a;
                environment.c = d4 = d3 * 0.09;
                break;
            }
            case 2131230874: {
                Environment environment = this.a;
                environment.g = d4 = d3 * 150.0;
                break;
            }
            case 2131230854: {
                Environment environment = this.a;
                environment.m = d4 = d3 * 8.0;
                break;
            }
            case 2131230856: {
                Environment environment = this.a;
                environment.l = d4 = d3 * 8.0;
                break;
            }
            case 2131230862: {
                Environment environment = this.a;
                environment.d = d4 = d3 * 2.0;
                break;
            }
            case 2131230863: {
                Environment environment = this.a;
                environment.f = d4 = d3 * 1.0;
                break;
            }
            case 2131230865: {
                this.a.e = d3;
                d4 = d3;
                break;
            }
            case 2131230842: {
                Environment environment = this.a;
                environment.h = d4 = d3 * 6.6 - 3.3;
                break;
            }
            case 2131230860: {
                Environment environment = this.a;
                environment.i = d4 = d3 * 1.0 + 0.0;
                break;
            }
            case 2131230858: {
                Environment environment = this.a;
                environment.j = d4 = d3 * -2.0 + 0.0;
            }
            case 2131230843: 
            case 2131230846: 
            case 2131230849: 
            case 2131230850: 
            case 2131230852: 
            case 2131230853: 
            case 2131230855: 
            case 2131230857: 
            case 2131230859: 
            case 2131230861: 
            case 2131230864: 
            case 2131230866: 
            case 2131230867: 
            case 2131230868: 
            case 2131230871: 
            case 2131230873: {
                break;
            }
            case 2131230869: {
                this.a.z = d3;
                d4 = d3;
            }
        }
        if (var3_18 != false) {
            ((TextView)this.getActivity().findViewById(2131230945)).setText((CharSequence)(this.getString(2131624240) + ": " + String.format("%1$,.3f", d4)));
        }
        this.b();
    }

    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putParcelable("mEnv", (Parcelable)this.a);
    }

    public final void onStart() {
        super.onStart();
        this.a();
    }

    public final void onStartTrackingTouch(SeekBar seekBar) {
    }

    public final void onStopTrackingTouch(SeekBar seekBar) {
        new Handler().postDelayed(new Runnable(){

            @Override
            public final void run() {
                Activity activity = o.this.getActivity();
                if (activity != null && (activity = (TextView)activity.findViewById(2131230945)) != null) {
                    activity.setText((CharSequence)"");
                }
            }
        }, 500L);
    }

    public static interface a {
        public void a(Environment var1);

        public Environment c();
    }
}

