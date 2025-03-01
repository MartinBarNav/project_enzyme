package com.saterskog.cell_lab;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Fragment;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.os.Handler;
import android.text.Html;
import android.text.Spanned;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.SeekBar;
import android.widget.TextView;

public final class o extends Fragment implements View.OnClickListener, CompoundButton.OnCheckedChangeListener, SeekBar.OnSeekBarChangeListener {
    Environment a;
    /* access modifiers changed from: package-private */
    public TextView b;
    private a c = null;
    private GenePoolView d;

    public interface a {
        void a(Environment environment);

        Environment c();
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(C0028R.layout.fragment_sample_info, viewGroup, false);
        ((TextView) inflate.findViewById(C0028R.id.text_sample_info)).setText(a(0, 0.0d, 0.0d));
        a(inflate, (int) C0028R.id.checkBox_add_random);
        a(inflate, (int) C0028R.id.checkBox_die_edge);
        a(inflate, (int) C0028R.id.checkBox_tweak);
        a(inflate, (int) C0028R.id.checkBox_aging);
        a(inflate, (int) C0028R.id.checkBox_mobile_food);
        this.d = (GenePoolView) inflate.findViewById(C0028R.id.gene_pool_view);
        this.b = (TextView) inflate.findViewById(C0028R.id.text_sample_info);
        for (CheckBox onCheckedChangeListener : this.d.a) {
            onCheckedChangeListener.setOnCheckedChangeListener(this);
        }
        b(inflate, C0028R.id.seekBar_food);
        b(inflate, C0028R.id.seekBar_food_size);
        b(inflate, C0028R.id.seekBar_food_lump);
        b(inflate, C0028R.id.seekBar_food_lump_size);
        b(inflate, C0028R.id.seekBar_food_layer);
        b(inflate, C0028R.id.seekBar_salinity);
        b(inflate, C0028R.id.seekBar_viscosity);
        b(inflate, C0028R.id.seekBar_fricd);
        b(inflate, C0028R.id.seekBar_frics);
        b(inflate, C0028R.id.seekBar_radiation);
        b(inflate, C0028R.id.seekBar_light);
        b(inflate, C0028R.id.seekBar_lightRange);
        b(inflate, C0028R.id.seekBar_lightT);
        b(inflate, C0028R.id.seekBar_dens);
        b(inflate, C0028R.id.seekBar_grav);
        b(inflate, C0028R.id.seekBar_grad);
        b(inflate, C0028R.id.seekBar_nitrates);
        inflate.findViewById(C0028R.id.sample_info_info_button).setOnClickListener(this);
        if (!j.a((Context) getActivity(), 0)) {
            inflate.findViewById(C0028R.id.seekBar_food_lump).setVisibility(8);
            inflate.findViewById(C0028R.id.seekBar_food_lump_text).setVisibility(8);
            inflate.findViewById(C0028R.id.seekBar_food_lump_size).setVisibility(8);
            inflate.findViewById(C0028R.id.seekBar_food_lump_size_text).setVisibility(8);
            inflate.findViewById(C0028R.id.seekBar_food_layer).setVisibility(8);
            inflate.findViewById(C0028R.id.seekBar_food_layer_text).setVisibility(8);
            inflate.findViewById(C0028R.id.seekBar_fricd).setVisibility(8);
            inflate.findViewById(C0028R.id.seekBar_fricd_text).setVisibility(8);
            inflate.findViewById(C0028R.id.seekBar_frics).setVisibility(8);
            inflate.findViewById(C0028R.id.seekBar_frics_text).setVisibility(8);
            inflate.findViewById(C0028R.id.seekBar_grad).setVisibility(8);
            inflate.findViewById(C0028R.id.seekBar_grad_text).setVisibility(8);
            inflate.findViewById(C0028R.id.seekBar_lightT).setVisibility(8);
            inflate.findViewById(C0028R.id.seekBar_lightT_text).setVisibility(8);
            inflate.findViewById(C0028R.id.seekBar_salinity).setVisibility(8);
            inflate.findViewById(C0028R.id.seekBar_salinity_text).setVisibility(8);
            inflate.findViewById(C0028R.id.seekBar_nitrate_text).setVisibility(8);
            inflate.findViewById(C0028R.id.seekBar_nitrates).setVisibility(8);
        }
        a();
        return inflate;
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle == null) {
            this.a = new Environment();
            this.a.a(((a) getActivity()).c());
            return;
        }
        this.a = (Environment) bundle.getParcelable("mEnv");
    }

    public final void onStart() {
        super.onStart();
        a();
    }

    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putParcelable("mEnv", this.a);
    }

    private void a(View view, int i) {
        ((CheckBox) view.findViewById(i)).setOnCheckedChangeListener(this);
    }

    private void b(View view, int i) {
        ((SeekBar) view.findViewById(i)).setOnSeekBarChangeListener(this);
    }

    public final void onAttach(Activity activity) {
        super.onAttach(activity);
        try {
            this.c = (a) activity;
        } catch (ClassCastException e) {
            throw new ClassCastException(activity.toString() + " must implement SampleInfoReceiver");
        }
    }

    public final void onProgressChanged(SeekBar seekBar, int i, boolean z) {
        double d2 = 0.0d;
        if (this.c != null) {
            double d3 = ((double) i) / 1000.0d;
            switch (seekBar.getId()) {
                case C0028R.id.seekBar_dens /*2131230842*/:
                    double d4 = (d3 * 6.6d) - 1.35d;
                    this.a.h = d4;
                    d2 = d4;
                    break;
                case C0028R.id.seekBar_food /*2131230844*/:
                    double d5 = d3 * 14.999999999999998d;
                    this.a.a = d5;
                    d2 = d5;
                    break;
                case C0028R.id.seekBar_food_layer /*2131230845*/:
                    float f = (float) d3;
                    this.a.o = f;
                    d2 = (double) f;
                    break;
                case C0028R.id.seekBar_food_lump /*2131230847*/:
                    double d6 = d3 * 100.0d;
                    this.a.p = d6;
                    d2 = d6;
                    break;
                case C0028R.id.seekBar_food_lump_size /*2131230848*/:
                    double d7 = (d3 * 0.19d) + 0.01d;
                    this.a.q = d7;
                    d2 = d7;
                    break;
                case C0028R.id.seekBar_food_size /*2131230851*/:
                    double d8 = (d3 * 1.1303999999999998d) + 0.021599999999999998d;
                    this.a.b = d8;
                    d2 = d8;
                    break;
                case C0028R.id.seekBar_fricd /*2131230854*/:
                    double d9 = d3 * 8.0d;
                    this.a.m = d9;
                    d2 = d9;
                    break;
                case C0028R.id.seekBar_frics /*2131230856*/:
                    double d10 = d3 * 8.0d;
                    this.a.l = d10;
                    d2 = d10;
                    break;
                case C0028R.id.seekBar_grad /*2131230858*/:
                    double d11 = (d3 * -2.0d) + 0.0d;
                    this.a.j = d11;
                    d2 = d11;
                    break;
                case C0028R.id.seekBar_grav /*2131230860*/:
                    double d12 = (d3 * 1.0d) + 0.0d;
                    this.a.i = d12;
                    d2 = d12;
                    break;
                case C0028R.id.seekBar_light /*2131230862*/:
                    double d13 = d3 * 2.0d;
                    this.a.d = d13;
                    d2 = d13;
                    break;
                case C0028R.id.seekBar_lightRange /*2131230863*/:
                    double d14 = d3 * 1.0d;
                    this.a.f = d14;
                    d2 = d14;
                    break;
                case C0028R.id.seekBar_lightT /*2131230865*/:
                    this.a.e = d3;
                    d2 = d3;
                    break;
                case C0028R.id.seekBar_nitrates /*2131230869*/:
                    this.a.z = d3;
                    d2 = d3;
                    break;
                case C0028R.id.seekBar_radiation /*2131230870*/:
                    double d15 = d3 * 0.09d;
                    this.a.c = d15;
                    d2 = d15;
                    break;
                case C0028R.id.seekBar_salinity /*2131230872*/:
                    float f2 = (float) d3;
                    this.a.n = f2;
                    d2 = (double) f2;
                    break;
                case C0028R.id.seekBar_viscosity /*2131230874*/:
                    double d16 = d3 * 150.0d;
                    this.a.g = d16;
                    d2 = d16;
                    break;
            }
            if (z) {
                ((TextView) getActivity().findViewById(C0028R.id.text_sample_info_value)).setText(getString(C0028R.string.signal_val_dialog_value) + ": " + String.format("%1$,.3f", new Object[]{Double.valueOf(d2)}));
            }
            b();
        }
    }

    public final void onStartTrackingTouch(SeekBar seekBar) {
    }

    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        switch (compoundButton.getId()) {
            case C0028R.id.checkBox_add_random /*2131230751*/:
                this.a.w = z;
                break;
            case C0028R.id.checkBox_aging /*2131230752*/:
                this.a.v = z;
                break;
            case C0028R.id.checkBox_die_edge /*2131230753*/:
                this.a.x = z;
                break;
            case C0028R.id.checkBox_mobile_food /*2131230754*/:
                this.a.y = z;
                break;
            case C0028R.id.checkBox_tweak /*2131230755*/:
                this.a.u = z;
                break;
            default:
                int i = 0;
                while (true) {
                    if (i >= this.d.a.length) {
                        break;
                    } else if (this.d.a[i] == compoundButton) {
                        this.a.t[this.d.b[i]] = z;
                        int i2 = -1;
                        int i3 = 0;
                        for (int i4 = 0; i4 < h.B.length; i4++) {
                            if (this.a.t[i4]) {
                                i3++;
                                i2 = i4;
                            }
                        }
                        if (i3 != 1) {
                            for (CheckBox enabled : this.d.a) {
                                enabled.setEnabled(true);
                            }
                            break;
                        } else {
                            int i5 = 0;
                            while (true) {
                                if (i5 >= this.d.a.length) {
                                    break;
                                } else if (this.d.b[i5] == i2) {
                                    this.d.a[i5].setEnabled(false);
                                    break;
                                } else {
                                    i5++;
                                }
                            }
                        }
                    } else {
                        i++;
                    }
                }
        }
        b();
    }

    private void b() {
        this.c.a(this.a);
    }

    public final void a() {
        a((int) C0028R.id.seekBar_radiation, this.a.c / 0.09d);
        a((int) C0028R.id.seekBar_food, this.a.a / 14.999999999999998d);
        a((int) C0028R.id.seekBar_food_size, (this.a.b - 0.021599999999999998d) / 1.1303999999999998d);
        a((int) C0028R.id.seekBar_food_lump, this.a.p / 100.0d);
        a((int) C0028R.id.seekBar_food_lump_size, (this.a.q - 0.01d) / 0.19d);
        a((int) C0028R.id.seekBar_food_layer, (double) this.a.o);
        a((int) C0028R.id.seekBar_salinity, (double) this.a.n);
        a((int) C0028R.id.seekBar_light, this.a.d / 2.0d);
        a((int) C0028R.id.seekBar_lightT, this.a.e / 1.0d);
        a((int) C0028R.id.seekBar_lightRange, this.a.f / 1.0d);
        a((int) C0028R.id.seekBar_viscosity, this.a.g / 150.0d);
        a((int) C0028R.id.seekBar_fricd, this.a.m / 8.0d);
        a((int) C0028R.id.seekBar_frics, this.a.l / 8.0d);
        a((int) C0028R.id.seekBar_dens, (this.a.h - -3.3d) / 6.6d);
        a((int) C0028R.id.seekBar_grav, (this.a.i - 0.0d) / 1.0d);
        a((int) C0028R.id.seekBar_grad, (this.a.j - 0.0d) / -2.0d);
        a((int) C0028R.id.seekBar_nitrates, this.a.z);
        a((int) C0028R.id.checkBox_add_random, this.a.w);
        a((int) C0028R.id.checkBox_die_edge, this.a.x);
        a((int) C0028R.id.checkBox_tweak, this.a.u);
        a((int) C0028R.id.checkBox_aging, this.a.v);
        a((int) C0028R.id.checkBox_mobile_food, this.a.y);
        if (this.d != null) {
            for (int i = 0; i < this.d.a.length; i++) {
                this.d.a[i].setChecked(this.a.t[this.d.b[i]]);
            }
        }
        int i2 = -1;
        int i3 = 0;
        for (int i4 = 0; i4 < h.B.length; i4++) {
            if (this.a.t[i4]) {
                i3++;
                i2 = i4;
            }
        }
        if (i3 == 1) {
            for (int i5 = 0; i5 < this.d.a.length; i5++) {
                if (this.d.b[i5] == i2) {
                    this.d.a[i5].setEnabled(false);
                    return;
                }
            }
            return;
        }
        for (CheckBox enabled : this.d.a) {
            enabled.setEnabled(true);
        }
    }

    private void a(int i, double d2) {
        SeekBar seekBar = (SeekBar) getActivity().findViewById(i);
        if (seekBar != null) {
            seekBar.setProgress((int) (1000.0d * d2));
        }
    }

    private void a(int i, boolean z) {
        CheckBox checkBox = (CheckBox) getActivity().findViewById(i);
        if (checkBox != null) {
            checkBox.setChecked(z);
        }
    }

    public final void onClick(View view) {
        switch (view.getId()) {
            case C0028R.id.sample_info_info_button /*2131230825*/:
                String string = getString(C0028R.string.substrate_help_title);
                Spanned fromHtml = Html.fromHtml(getString(C0028R.string.substrate_help));
                AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
                View inflate = getActivity().getLayoutInflater().inflate(C0028R.layout.help_dialog, (ViewGroup) null);
                ((TextView) inflate.findViewById(C0028R.id.text_title)).setText(string);
                ((TextView) inflate.findViewById(C0028R.id.text_help)).setText(fromHtml);
                builder.setView(inflate);
                builder.setNeutralButton(getActivity().getString(C0028R.string.dialog_button_ok), new DialogInterface.OnClickListener() {
                    public final void onClick(DialogInterface dialogInterface, int i) {
                        dialogInterface.cancel();
                    }
                });
                builder.show();
                return;
            default:
                return;
        }
    }

    public final void onStopTrackingTouch(SeekBar seekBar) {
        new Handler().postDelayed(new Runnable() {
            public final void run() {
                TextView textView;
                Activity activity = o.this.getActivity();
                if (activity != null && (textView = (TextView) activity.findViewById(C0028R.id.text_sample_info_value)) != null) {
                    textView.setText("");
                }
            }
        }, 500);
    }

    /* access modifiers changed from: private */
    public String a(int i, double d2, double d3) {
        if (!isAdded()) {
            return "";
        }
        return (((getActivity().getString(C0028R.string.sample_info_age) + String.format("%1$,.1f", new Object[]{Double.valueOf(d3)}) + " " + getActivity().getString(C0028R.string.hour_abbreviation) + ".") + "\n" + getActivity().getString(C0028R.string.sample_info_cells)) + i) + "\n" + getActivity().getString(C0028R.string.sample_info_food) + String.format("%1$,.1f", new Object[]{Double.valueOf(d2)});
    }
}
