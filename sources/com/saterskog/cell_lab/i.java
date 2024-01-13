package com.saterskog.cell_lab;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Fragment;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.Resources;
import android.graphics.Color;
import android.os.Bundle;
import android.os.Handler;
import android.preference.PreferenceManager;
import android.text.Html;
import android.util.Log;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RelativeLayout;
import android.widget.SeekBar;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;
import com.saterskog.cell_lab.Gene;
import java.io.BufferedOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Iterator;

public final class i extends Fragment implements View.OnClickListener, AdapterView.OnItemSelectedListener, CompoundButton.OnCheckedChangeListener, SeekBar.OnSeekBarChangeListener, c {
    Gene[] a;
    Button b;
    int c;
    protected String d;
    /* access modifiers changed from: package-private */
    public ArrayList<h> e;
    public b f;
    /* access modifiers changed from: private */
    public boolean g;
    /* access modifiers changed from: private */
    public boolean h;
    private boolean i;
    private boolean j;
    private boolean k;
    /* access modifiers changed from: private */
    public int l;
    private GenomePreviewView m;
    private double n;
    /* access modifiers changed from: private */
    public View o;
    private a p;
    private ArrayList<e> q;

    public interface b {
        Gene[] a();
    }

    private abstract class e {
        TextView e = null;
        RelativeLayout f;
        h g;
        protected int h;
        String i;
        String j;
        int k;
        protected String l;

        /* access modifiers changed from: package-private */
        public abstract View a();

        /* access modifiers changed from: package-private */
        public abstract void b();

        public e(String str, String str2, int i2, h hVar, int i3) {
            this.g = hVar;
            this.h = i2;
            this.i = str;
            this.j = str2;
            this.k = i3;
        }

        public final String c() {
            return this.l + ": " + this.i;
        }
    }

    private class c extends e {
        Spinner a = null;
        String[] b = null;
        boolean c;

        public c(String str, String str2, int i, h hVar, String[] strArr, int i2, boolean z) {
            super(str, str2, i, hVar, i2);
            this.l = i.this.getActivity().getString(C0028R.string.tip_type_selector);
            this.b = strArr;
            this.c = z;
        }

        /* access modifiers changed from: package-private */
        public final View a() {
            this.f = new RelativeLayout(i.this.getActivity());
            this.f.setLayoutParams(new RelativeLayout.LayoutParams(-1, -2));
            this.f.setGravity(16);
            this.e = new TextView(i.this.getActivity());
            this.e.setText(this.i + ":");
            this.e.setClickable(true);
            this.e.setOnClickListener(i.this);
            this.e.setPaintFlags(this.e.getPaintFlags() | 8);
            this.e.setId(C0028R.id.ge_tv);
            this.a = new Spinner(i.this.getActivity());
            if (this.c) {
                this.a.setAdapter(i.this.a(false, this.b));
            } else {
                this.a.setAdapter(new ArrayAdapter(i.this.getActivity(), C0028R.layout.spinner_item, this.b));
            }
            this.a.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                public final void onItemSelected(AdapterView<?> adapterView, View view, int i, long j) {
                    i.this.a[i.this.c].u[c.this.h] = i;
                    i.this.a();
                }

                public final void onNothingSelected(AdapterView<?> adapterView) {
                }
            });
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
            layoutParams.addRule(9);
            layoutParams.addRule(15);
            this.e.setLayoutParams(layoutParams);
            RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-2, -2);
            layoutParams2.addRule(11);
            layoutParams2.addRule(15);
            this.a.setLayoutParams(layoutParams2);
            this.f.addView(this.e);
            this.f.addView(this.a);
            return this.f;
        }

        public final void b() {
            if (this.f != null) {
                this.f.setVisibility((this.g == null || this.g == i.this.a[i.this.c].s) ? 0 : 8);
            }
            Spinner spinner = this.a;
            int i = i.this.a[i.this.c].u[this.h];
            spinner.setSelection(i, true);
            Log.d("Enzyme Debugger", "Max Split Dropdown addToView(): Selection set to: ");
            Log.d("Enzyme Debugger", String.valueOf(i));
        }
    }

    private class a extends e implements SeekBar.OnSeekBarChangeListener {
        SeekBar a = null;
        float b = 1.0f;

        public a(String str, String str2, int i, h hVar) {
            super(str, str2, i, hVar, -1);
            this.l = i.this.getActivity().getString(C0028R.string.tip_title_slider);
        }

        /* access modifiers changed from: package-private */
        public final View a() {
            this.f = new RelativeLayout(i.this.getActivity());
            this.f.setLayoutParams(new RelativeLayout.LayoutParams(-1, -2));
            this.f.setGravity(16);
            this.e = new TextView(i.this.getActivity());
            this.e.setText(this.i + ":");
            this.e.setClickable(true);
            this.e.setOnClickListener(i.this);
            this.e.setPaintFlags(this.e.getPaintFlags() | 8);
            this.e.setId(C0028R.id.ge_tv);
            this.a = new SeekBar(i.this.getActivity());
            this.a.setMax(i.this.l);
            this.a.setOnSeekBarChangeListener(this);
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
            layoutParams.addRule(9);
            layoutParams.addRule(15);
            this.e.setLayoutParams(layoutParams);
            RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-2, -2);
            layoutParams2.addRule(11);
            layoutParams2.addRule(1, this.e.getId());
            layoutParams2.addRule(15);
            this.a.setLayoutParams(layoutParams2);
            this.f.addView(this.e);
            this.f.addView(this.a);
            return this.f;
        }

        public final void b() {
            int round = Math.round(((i.this.a[i.this.c].v[this.h] - Gene.z[this.h]) / (Gene.A[this.h] - Gene.z[this.h])) * ((float) i.this.l));
            if (this.f != null) {
                this.f.setVisibility((this.g == null || this.g == i.this.a[i.this.c].s) ? 0 : 8);
            }
            this.a.setMax(i.this.l);
            this.a.setProgress(round);
        }

        public final void a(boolean z) {
            if (this.a != null) {
                this.a.setEnabled(z);
            }
        }

        public final void onProgressChanged(SeekBar seekBar, int i, boolean z) {
            i.this.a[i.this.c].v[this.h] = Gene.z[this.h] + (((Gene.A[this.h] - Gene.z[this.h]) * ((float) i)) / ((float) seekBar.getMax()));
            TextView textView = (TextView) i.this.getActivity().findViewById(C0028R.id.text_time);
            if (textView != null) {
                textView.setText(String.format(this.i + ": %1$,.2f", new Object[]{Float.valueOf(this.b * i.this.a[i.this.c].v[this.h])}));
            }
            i.this.a();
        }

        public final void onStartTrackingTouch(SeekBar seekBar) {
        }

        public final void onStopTrackingTouch(SeekBar seekBar) {
            TextView textView = (TextView) i.this.getActivity().findViewById(C0028R.id.text_time);
            if (textView != null) {
                textView.setText("");
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final float a(int i2, boolean z) {
        if (!z) {
            if (i2 == this.l / 2) {
                return 0.0f;
            }
            return (float) (Math.pow(97.00586700439453d, (double) ((((float) Math.abs(i2 - (this.l / 2))) - 1.0f) / ((((float) this.l) / 2.0f) - 1.0f))) * 0.08246923983097076d * ((double) Math.signum((float) (i2 - (this.l / 2)))));
        } else if (i2 != 0) {
            return (float) (Math.pow(97.00586700439453d, (double) ((((float) i2) - 1.0f) / (((float) this.l) - 1.0f))) * 0.08246923983097076d);
        } else {
            return 0.0f;
        }
    }

    /* access modifiers changed from: package-private */
    public final int a(float f2, boolean z) {
        if (!z) {
            if (f2 == 0.0f) {
                return this.l / 2;
            }
            return (int) Math.round(((double) (this.l / 2)) + ((((Math.log((double) (Math.abs(f2) / 0.08246924f)) / Math.log(97.00586700439453d)) * ((double) ((((float) this.l) / 2.0f) - 1.0f))) + 1.0d) * ((double) Math.signum(f2))));
        } else if (f2 == 0.0f) {
            return 0;
        } else {
            return (int) Math.round(((Math.log((((double) (8.0f + f2)) * 0.5d) / 0.08246923983097076d) / Math.log(97.00586700439453d)) * ((double) (((float) this.l) - 1.0f))) + 1.0d);
        }
    }

    private class f extends e implements SeekBar.OnSeekBarChangeListener {
        SeekBar a = null;
        Button b = null;
        TextView c;
        TextView d;
        TextView n;
        TextView o;
        SeekBar p;
        SeekBar q;
        SeekBar r;
        SeekBar s;
        boolean t;
        float u;
        float v;
        float w;

        public f(String str, String str2, int i, h hVar) {
            super(str, str2, i, hVar, -1);
            this.l = i.this.getActivity().getString(C0028R.string.tip_title_slider);
            this.u = Gene.x[i];
            this.v = Gene.y[i];
            this.w = Gene.y[i] - Gene.x[i];
            this.t = i.this.e.contains(h.NEUROCYTE) || i.this.e.contains(h.STEREOCYTE) || i.this.e.contains(h.SENSEOCYTE);
        }

        public final void onProgressChanged(SeekBar seekBar, int i, boolean z) {
            if (z) {
                if (Gene.x[this.h] == 0.0f) {
                    i.this.a[i.this.c].t[this.h].b = ((2.0f * i.this.a(i, true)) / 8.0f) - 1.0f;
                } else {
                    i.this.a[i.this.c].t[this.h].b = i.this.a(i, false) / 8.0f;
                }
                i.this.a();
                TextView textView = (TextView) i.this.getActivity().findViewById(C0028R.id.text_time);
                if (textView != null) {
                    textView.setText(String.format(this.i + ": %1$,.2f", new Object[]{Float.valueOf(Gene.x[this.h] + ((Gene.y[this.h] - Gene.x[this.h]) * ((i.this.a[i.this.c].t[this.h].b * 0.5f) + 0.5f)))}));
                }
            }
        }

        public final void onStartTrackingTouch(SeekBar seekBar) {
        }

        public final void onStopTrackingTouch(SeekBar seekBar) {
            TextView textView = (TextView) i.this.getActivity().findViewById(C0028R.id.text_time);
            if (textView != null) {
                textView.setText("");
            }
        }

        private class a implements SeekBar.OnSeekBarChangeListener {
            Spinner a;
            Spinner b;
            RadioButton c;
            RadioButton d;
            AlertDialog.Builder e;
            final /* synthetic */ f f;

            public final void onProgressChanged(SeekBar seekBar, int i, boolean z) {
                a();
                i.this.a();
            }

            public final void onStartTrackingTouch(SeekBar seekBar) {
            }

            public final void onStopTrackingTouch(SeekBar seekBar) {
            }

            public a(final f fVar) {
                boolean z;
                boolean z2;
                boolean z3;
                boolean z4;
                boolean z5;
                boolean z6;
                boolean z7 = true;
                this.f = fVar;
                Gene.a aVar = i.this.a[i.this.c].t[fVar.h];
                this.e = new AlertDialog.Builder(i.this.getActivity());
                View inflate = i.this.getActivity().getLayoutInflater().inflate(C0028R.layout.signal_val_dialog, (ViewGroup) null);
                this.a = (Spinner) inflate.findViewById(C0028R.id.seek_val_sub);
                this.b = (Spinner) inflate.findViewById(C0028R.id.seek_val_eq);
                this.b.setAdapter(new ArrayAdapter(i.this.getActivity(), C0028R.layout.spinner_item, new String[]{i.this.getString(C0028R.string.signal_val_dialog_linear), i.this.getString(C0028R.string.signal_val_dialog_heaviside)}));
                if (aVar.e != 2) {
                    this.b.setSelection(0);
                } else {
                    this.b.setSelection(1);
                }
                this.b.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                    public final void onItemSelected(AdapterView<?> adapterView, View view, int i, long j) {
                        boolean z = true;
                        SeekBar seekBar = a.this.f.s;
                        if (!a.this.d.isChecked() || a.this.b.getSelectedItemPosition() != 1) {
                            z = false;
                        }
                        seekBar.setEnabled(z);
                        a.this.a();
                    }

                    public final void onNothingSelected(AdapterView<?> adapterView) {
                    }
                });
                ArrayAdapter arrayAdapter = new ArrayAdapter(i.this.getActivity(), C0028R.layout.spinner_item);
                for (int i = 0; i < 4; i++) {
                    arrayAdapter.add(Html.fromHtml(i.this.getString(C0028R.string.signal_substance_prefix) + (i + 1) + " [" + i.this.getString(C0028R.string.signal_substance_unit) + "]"));
                }
                arrayAdapter.add(Html.fromHtml(i.this.getString(C0028R.string.val_dep_mass) + String.format(" / %1.1f ng", new Object[]{Double.valueOf(3.5999999999999996d)})));
                arrayAdapter.add(Html.fromHtml(i.this.getString(C0028R.string.val_dep_age) + String.format(" / %1.0f h", new Object[]{Double.valueOf(240.0d)})));
                arrayAdapter.add(Html.fromHtml(i.this.getString(C0028R.string.val_dep_nitro_reserve)));
                arrayAdapter.add(Html.fromHtml(i.this.getString(C0028R.string.val_dep_connected) + " / 20"));
                this.a.setAdapter(arrayAdapter);
                this.a.setSelection(aVar.d);
                this.c = (RadioButton) inflate.findViewById(C0028R.id.radio_signal_val_1);
                this.d = (RadioButton) inflate.findViewById(C0028R.id.radio_signal_val_2);
                this.c.setChecked(aVar.e == 0);
                RadioButton radioButton = this.d;
                if (aVar.e != 0) {
                    z = true;
                } else {
                    z = false;
                }
                radioButton.setChecked(z);
                this.c.setOnClickListener(new View.OnClickListener() {
                    public final void onClick(View view) {
                        a.this.f.p.setEnabled(true);
                        a.this.a.setEnabled(false);
                        a.this.b.setEnabled(false);
                        a.this.f.q.setEnabled(false);
                        a.this.f.r.setEnabled(false);
                        a.this.f.s.setEnabled(false);
                    }
                });
                this.d.setOnClickListener(new View.OnClickListener() {
                    public final void onClick(View view) {
                        boolean z = true;
                        a.this.a.setEnabled(true);
                        a.this.b.setEnabled(true);
                        a.this.f.p.setEnabled(false);
                        a.this.f.q.setEnabled(true);
                        a.this.f.r.setEnabled(true);
                        a.this.f.s.setEnabled(true);
                        SeekBar seekBar = a.this.f.s;
                        if (!a.this.d.isChecked() || a.this.b.getSelectedItemPosition() != 1) {
                            z = false;
                        }
                        seekBar.setEnabled(z);
                    }
                });
                fVar.c = (TextView) inflate.findViewById(C0028R.id.text_val_fixed);
                fVar.d = (TextView) inflate.findViewById(C0028R.id.text_val_a);
                fVar.n = (TextView) inflate.findViewById(C0028R.id.text_val_b);
                fVar.o = (TextView) inflate.findViewById(C0028R.id.text_val_c);
                fVar.p = (SeekBar) inflate.findViewById(C0028R.id.seek_val_fixed);
                fVar.q = (SeekBar) inflate.findViewById(C0028R.id.seek_val_a);
                fVar.r = (SeekBar) inflate.findViewById(C0028R.id.seek_val_b);
                fVar.s = (SeekBar) inflate.findViewById(C0028R.id.seek_val_c);
                fVar.p.setOnSeekBarChangeListener(this);
                fVar.q.setOnSeekBarChangeListener(this);
                fVar.r.setOnSeekBarChangeListener(this);
                fVar.s.setOnSeekBarChangeListener(this);
                fVar.p.setMax(i.this.l);
                fVar.q.setMax(i.this.l);
                fVar.r.setMax(i.this.l);
                fVar.s.setMax(i.this.l);
                fVar.p.setEnabled(aVar.e == 0);
                SeekBar seekBar = fVar.q;
                if (aVar.e != 0) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                seekBar.setEnabled(z2);
                SeekBar seekBar2 = fVar.r;
                if (aVar.e != 0) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                seekBar2.setEnabled(z3);
                SeekBar seekBar3 = fVar.s;
                if (aVar.e == 2) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                seekBar3.setEnabled(z4);
                Spinner spinner = this.a;
                if (aVar.e != 0) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                spinner.setEnabled(z5);
                Spinner spinner2 = this.b;
                if (aVar.e != 0) {
                    z6 = true;
                } else {
                    z6 = false;
                }
                spinner2.setEnabled(z6);
                fVar.p.setProgress(i.this.a(i.this.a[i.this.c].t[fVar.h].b * 8.0f, Gene.x[fVar.h] != 0.0f ? false : z7));
                if (aVar.e == 2) {
                    fVar.q.setProgress(i.this.a(i.this.a[i.this.c].t[fVar.h].a * 8.0f, false));
                    fVar.r.setProgress(i.this.a(i.this.a[i.this.c].t[fVar.h].b * 8.0f, false));
                } else {
                    fVar.q.setProgress(i.this.a(i.this.a[i.this.c].t[fVar.h].a, false));
                    fVar.r.setProgress(i.this.a(i.this.a[i.this.c].t[fVar.h].b, false));
                }
                fVar.s.setProgress(i.this.a(i.this.a[i.this.c].t[fVar.h].c * 8.0f, false));
                this.e.setView(inflate);
                this.e.setNegativeButton(i.this.getActivity().getString(C0028R.string.dialog_button_cancel), new DialogInterface.OnClickListener() {
                    public final void onClick(DialogInterface dialogInterface, int i) {
                        dialogInterface.cancel();
                    }
                });
                this.e.setNeutralButton(i.this.getActivity().getString(C0028R.string.dialog_button_ok), new DialogInterface.OnClickListener(fVar) {
                    final /* synthetic */ f a;

                    {
                        this.a = r2;
                    }

                    public final void onClick(DialogInterface dialogInterface, int i) {
                        boolean z = true;
                        Gene.a aVar = i.this.a[i.this.c].t[a.this.f.h];
                        if (a.this.c.isChecked()) {
                            aVar.e = 0;
                            aVar.a = 0.0f;
                            i iVar = i.this;
                            int progress = a.this.f.p.getProgress();
                            if (Gene.x[a.this.f.h] != 0.0f) {
                                z = false;
                            }
                            aVar.b = iVar.a(progress, z) / 8.0f;
                            if (Gene.x[a.this.f.h] == 0.0f) {
                                aVar.b = (2.0f * aVar.b) - 1.0f;
                            }
                            aVar.c = 0.0f;
                        } else {
                            aVar.d = (short) a.this.a.getSelectedItemPosition();
                            if (a.this.b.getSelectedItemPosition() == 1) {
                                aVar.e = 2;
                                aVar.a = i.this.a(a.this.f.q.getProgress(), false) / 8.0f;
                                aVar.b = i.this.a(a.this.f.r.getProgress(), false) / 8.0f;
                                aVar.c = i.this.a(a.this.f.s.getProgress(), false) / 8.0f;
                            } else {
                                aVar.e = 1;
                                aVar.a = i.this.a(a.this.f.q.getProgress(), false);
                                aVar.b = i.this.a(a.this.f.r.getProgress(), false);
                                aVar.c = i.this.a(a.this.f.s.getProgress(), false);
                            }
                        }
                        dialogInterface.cancel();
                        fVar.b();
                        i.this.a();
                        if (aVar.d == 0 && ((double) Math.abs(aVar.a - 8.0f)) < 0.25d && ((double) Math.abs(aVar.b + 1.0f)) < 0.15d) {
                            t.b(i.this.getActivity(), 3, 2);
                        }
                    }
                });
                a();
            }

            /* access modifiers changed from: package-private */
            public final void a() {
                float f2 = (Gene.y[this.f.h] + Gene.x[this.f.h]) * 0.5f;
                float f3 = (Gene.y[this.f.h] - Gene.x[this.f.h]) * 0.5f;
                String str = "2";
                if (!i.this.h) {
                    str = "3";
                }
                if (Gene.x[this.f.h] == 0.0f) {
                    TextView textView = this.f.c;
                    String str2 = i.this.getString(C0028R.string.signal_val_dialog_value) + " = %1$,." + str + "f";
                    Object[] objArr = new Object[1];
                    objArr[0] = Float.valueOf(((i.this.a(this.f.p.getProgress(), Gene.x[this.f.h] == 0.0f) * (Gene.y[this.f.h] - Gene.x[this.f.h])) / 8.0f) + Gene.x[this.f.h]);
                    textView.setText(String.format(str2, objArr));
                } else {
                    TextView textView2 = this.f.c;
                    String str3 = i.this.getString(C0028R.string.signal_val_dialog_value) + " = %1$,." + str + "f";
                    Object[] objArr2 = new Object[1];
                    objArr2[0] = Float.valueOf(((i.this.a(this.f.p.getProgress(), Gene.x[this.f.h] == 0.0f) * f3) / 8.0f) + f2);
                    textView2.setText(String.format(str3, objArr2));
                }
                if (this.b.getSelectedItemPosition() == 0) {
                    this.f.d.setText(String.format(i.this.getString(C0028R.string.signal_val_dialog_a_variable) + " = %1$,." + str + "f", new Object[]{Float.valueOf(i.this.a(this.f.q.getProgress(), false) * f3)}));
                    this.f.n.setText(String.format(i.this.getString(C0028R.string.signal_val_dialog_b_variable) + " = %1$,." + str + "f", new Object[]{Float.valueOf(f2 + (f3 * i.this.a(this.f.r.getProgress(), false)))}));
                } else {
                    this.f.d.setText(String.format(i.this.getString(C0028R.string.signal_val_dialog_a_variable) + " = %1$,." + str + "f", new Object[]{Float.valueOf(((i.this.a(this.f.q.getProgress(), false) * f3) / 8.0f) + f2)}));
                    this.f.n.setText(String.format(i.this.getString(C0028R.string.signal_val_dialog_b_variable) + " = %1$,." + str + "f", new Object[]{Float.valueOf(f2 + ((f3 * i.this.a(this.f.r.getProgress(), false)) / 8.0f))}));
                }
                this.f.o.setText(String.format(i.this.getString(C0028R.string.signal_val_dialog_c_variable) + " = %1$,." + str + "f", new Object[]{Float.valueOf(i.this.a(this.f.s.getProgress(), false) / 8.0f)}));
            }
        }

        /* access modifiers changed from: package-private */
        public final View a() {
            this.f = new RelativeLayout(i.this.getActivity());
            this.f.setLayoutParams(new RelativeLayout.LayoutParams(-1, -2));
            this.f.setGravity(16);
            this.e = new TextView(i.this.getActivity());
            this.e.setText(this.i + ":");
            this.e.setClickable(true);
            this.e.setOnClickListener(i.this);
            this.e.setPaintFlags(this.e.getPaintFlags() | 8);
            this.e.setId(C0028R.id.ge_tv);
            this.a = new SeekBar(i.this.getActivity());
            this.a.setMax(i.this.l);
            this.a.setOnSeekBarChangeListener(this);
            if (this.t) {
                this.b = new Button(i.this.getActivity());
                this.b.setText(i.this.getActivity().getString(C0028R.string.button_more));
                this.b.setId(C0028R.id.ge_b);
                this.b.setOnClickListener(new View.OnClickListener() {
                    public final void onClick(View view) {
                        new a(f.this).e.show();
                        if (i.this.c == 1) {
                            t.a(i.this.getActivity(), 3, 1, 750);
                        }
                    }
                });
            }
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
            layoutParams.addRule(9);
            layoutParams.addRule(15);
            this.e.setLayoutParams(layoutParams);
            if (this.t) {
                RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-2, -2);
                layoutParams2.addRule(11);
                layoutParams2.addRule(15);
                this.b.setLayoutParams(layoutParams2);
            }
            RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(-2, -2);
            if (this.t) {
                layoutParams3.addRule(0, this.b.getId());
            } else {
                layoutParams3.addRule(11);
            }
            layoutParams3.addRule(1, this.e.getId());
            layoutParams3.addRule(15);
            this.a.setLayoutParams(layoutParams3);
            this.f.addView(this.e);
            this.f.addView(this.a);
            if (this.t) {
                this.f.addView(this.b);
            }
            if (this.t) {
                this.b.setMinWidth(0);
            }
            return this.f;
        }

        public final void b() {
            boolean z;
            if (this.f != null) {
                this.f.setVisibility((this.g == null || this.g == i.this.a[i.this.c].s) ? 0 : 8);
            }
            float f = i.this.a[i.this.c].t[this.h].b;
            SeekBar seekBar = this.a;
            if (i.this.a[i.this.c].t[this.h].e == 0) {
                z = true;
            } else {
                z = false;
            }
            seekBar.setEnabled(z);
            this.a.setMax(i.this.l);
            if (Gene.x[this.h] == 0.0f) {
                this.a.setProgress(i.this.a(f * 8.0f, true));
            } else {
                this.a.setProgress(i.this.a(f * 8.0f, false));
            }
        }
    }

    private class d implements SeekBar.OnSeekBarChangeListener {
        Spinner a;
        Spinner b;
        AlertDialog.Builder c;
        SeekBar d;
        TextView e;
        final float f = 0.25f;
        final float g = 9.25f;
        final float h = 2.0f;
        float i;

        public final void onProgressChanged(SeekBar seekBar, int i2, boolean z) {
            a();
        }

        public final void onStartTrackingTouch(SeekBar seekBar) {
        }

        public final void onStopTrackingTouch(SeekBar seekBar) {
        }

        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public d() {
            /*
                r12 = this;
                com.saterskog.cell_lab.i.this = r13
                r12.<init>()
                r0 = 1048576000(0x3e800000, float:0.25)
                r12.f = r0
                r0 = 1091829760(0x41140000, float:9.25)
                r12.g = r0
                r0 = 1073741824(0x40000000, float:2.0)
                r12.h = r0
                com.saterskog.cell_lab.Gene[] r0 = r13.a
                int r1 = r13.c
                r0 = r0[r1]
                com.saterskog.cell_lab.Gene$a[] r0 = r0.t
                r1 = 8
                r0 = r0[r1]
                short r3 = r0.d
                com.saterskog.cell_lab.Gene[] r0 = r13.a
                int r1 = r13.c
                r0 = r0[r1]
                com.saterskog.cell_lab.Gene$a[] r0 = r0.t
                r1 = 7
                r0 = r0[r1]
                short r2 = r0.d
                float[] r0 = com.saterskog.cell_lab.Gene.y
                r1 = 7
                r0 = r0[r1]
                com.saterskog.cell_lab.Gene[] r1 = r13.a
                int r4 = r13.c
                r1 = r1[r4]
                com.saterskog.cell_lab.Gene$a[] r1 = r1.t
                r4 = 7
                r1 = r1[r4]
                float r1 = r1.a
                float r4 = r0 * r1
                float[] r0 = com.saterskog.cell_lab.Gene.y
                r1 = 7
                r0 = r0[r1]
                com.saterskog.cell_lab.Gene[] r1 = r13.a
                int r5 = r13.c
                r1 = r1[r5]
                com.saterskog.cell_lab.Gene$a[] r1 = r1.t
                r5 = 9
                r1 = r1[r5]
                float r1 = r1.a
                float r5 = r0 * r1
                r0 = 1089470464(0x40f00000, float:7.5)
                float r0 = r5 - r0
                r1 = 1082130432(0x40800000, float:4.0)
                float r0 = r0 / r1
                int r1 = java.lang.Math.round(r0)
                r0 = -1082130432(0xffffffffbf800000, float:-1.0)
                if (r1 < 0) goto L_0x006b
                r6 = 5
                if (r1 > r6) goto L_0x006b
                float r0 = r12.a(r1, r5, r4)
            L_0x006b:
                r4 = 4593671619917905920(0x3fc0000000000000, double:0.125)
                double r6 = (double) r0
                int r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
                if (r4 >= 0) goto L_0x007a
                r4 = 1048576000(0x3e800000, float:0.25)
                int r4 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
                if (r4 >= 0) goto L_0x007a
                r0 = 1048576000(0x3e800000, float:0.25)
            L_0x007a:
                r4 = 1091829760(0x41140000, float:9.25)
                int r4 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
                if (r4 >= 0) goto L_0x008c
                double r4 = (double) r0
                r6 = 4621467273868083200(0x4022c00000000000, double:9.375)
                int r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
                if (r4 >= 0) goto L_0x008c
                r0 = 1091829760(0x41140000, float:9.25)
            L_0x008c:
                if (r1 < 0) goto L_0x00a9
                r4 = 5
                if (r1 > r4) goto L_0x00a9
                if (r3 < 0) goto L_0x00a9
                if (r2 < 0) goto L_0x00a9
                r4 = 4
                if (r3 >= r4) goto L_0x00a9
                r4 = 4
                if (r2 >= r4) goto L_0x00a9
                if (r3 == r2) goto L_0x00a9
                r4 = 1048576000(0x3e800000, float:0.25)
                int r4 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
                if (r4 < 0) goto L_0x00a9
                r4 = 1091829760(0x41140000, float:9.25)
                int r4 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
                if (r4 <= 0) goto L_0x01f2
            L_0x00a9:
                r1 = 1
                r3 = 0
                r2 = 1
                r0 = 1073741824(0x40000000, float:2.0)
                r4 = r3
                r3 = r2
                r2 = r1
                r1 = r0
            L_0x00b2:
                android.app.AlertDialog$Builder r0 = new android.app.AlertDialog$Builder
                android.app.Activity r5 = r13.getActivity()
                r0.<init>(r5)
                r12.c = r0
                android.app.Activity r0 = r13.getActivity()
                android.view.LayoutInflater r0 = r0.getLayoutInflater()
                r5 = 2131361830(0x7f0a0026, float:1.8343423E38)
                r6 = 0
                android.view.View r8 = r0.inflate(r5, r6)
                r0 = 2131230917(0x7f0800c5, float:1.80779E38)
                android.view.View r0 = r8.findViewById(r0)
                android.widget.Spinner r0 = (android.widget.Spinner) r0
                r12.a = r0
                r0 = 6
                java.lang.String[] r5 = new java.lang.String[r0]
                r0 = 0
            L_0x00dc:
                r6 = 6
                if (r0 >= r6) goto L_0x00fc
                java.lang.StringBuilder r6 = new java.lang.StringBuilder
                r6.<init>()
                java.lang.StringBuilder r6 = r6.append(r0)
                r7 = 2131624180(0x7f0e00f4, float:1.8875532E38)
                java.lang.String r7 = r13.getString(r7)
                java.lang.StringBuilder r6 = r6.append(r7)
                java.lang.String r6 = r6.toString()
                r5[r0] = r6
                int r0 = r0 + 1
                goto L_0x00dc
            L_0x00fc:
                android.widget.ArrayAdapter r0 = new android.widget.ArrayAdapter
                android.app.Activity r6 = r13.getActivity()
                r7 = 2131361832(0x7f0a0028, float:1.8343427E38)
                r0.<init>(r6, r7, r5)
                android.widget.Spinner r5 = r12.a
                r5.setAdapter(r0)
                android.widget.Spinner r0 = r12.a
                r0.setSelection(r2)
                r0 = 2131230916(0x7f0800c4, float:1.8077898E38)
                android.view.View r0 = r8.findViewById(r0)
                android.widget.Spinner r0 = (android.widget.Spinner) r0
                r12.b = r0
                r0 = 12
                java.lang.String[] r9 = new java.lang.String[r0]
                r5 = 0
                r2 = 0
                r0 = 0
                r7 = r0
            L_0x0125:
                r0 = 4
                if (r7 >= r0) goto L_0x017c
                r0 = 0
                r6 = r0
                r0 = r2
                r2 = r5
            L_0x012c:
                r5 = 4
                if (r6 >= r5) goto L_0x0176
                if (r7 == r6) goto L_0x0172
                if (r7 != r4) goto L_0x0136
                if (r6 != r3) goto L_0x0136
                r0 = r2
            L_0x0136:
                int r5 = r2 + 1
                java.lang.StringBuilder r10 = new java.lang.StringBuilder
                r10.<init>()
                r11 = 2131624181(0x7f0e00f5, float:1.8875534E38)
                java.lang.String r11 = r13.getString(r11)
                java.lang.StringBuilder r10 = r10.append(r11)
                int r11 = r7 + 1
                java.lang.StringBuilder r10 = r10.append(r11)
                java.lang.String r11 = " "
                java.lang.StringBuilder r10 = r10.append(r11)
                r11 = 2131624184(0x7f0e00f8, float:1.887554E38)
                java.lang.String r11 = r13.getString(r11)
                java.lang.StringBuilder r10 = r10.append(r11)
                java.lang.String r11 = " "
                java.lang.StringBuilder r10 = r10.append(r11)
                int r11 = r6 + 1
                java.lang.StringBuilder r10 = r10.append(r11)
                java.lang.String r10 = r10.toString()
                r9[r2] = r10
                r2 = r5
            L_0x0172:
                int r5 = r6 + 1
                r6 = r5
                goto L_0x012c
            L_0x0176:
                int r5 = r7 + 1
                r7 = r5
                r5 = r2
                r2 = r0
                goto L_0x0125
            L_0x017c:
                android.widget.ArrayAdapter r0 = new android.widget.ArrayAdapter
                android.app.Activity r3 = r13.getActivity()
                r4 = 2131361832(0x7f0a0028, float:1.8343427E38)
                r0.<init>(r3, r4, r9)
                android.widget.Spinner r3 = r12.b
                r3.setAdapter(r0)
                android.widget.Spinner r0 = r12.b
                r0.setSelection(r2)
                r0 = 2131230942(0x7f0800de, float:1.807795E38)
                android.view.View r0 = r8.findViewById(r0)
                android.widget.TextView r0 = (android.widget.TextView) r0
                r12.e = r0
                r0 = 2131230886(0x7f0800a6, float:1.8077837E38)
                android.view.View r0 = r8.findViewById(r0)
                android.widget.SeekBar r0 = (android.widget.SeekBar) r0
                r12.d = r0
                android.widget.SeekBar r0 = r12.d
                r0.setOnSeekBarChangeListener(r12)
                android.widget.SeekBar r0 = r12.d
                r2 = 1048576000(0x3e800000, float:0.25)
                float r1 = r1 - r2
                r2 = 1091567616(0x41100000, float:9.0)
                float r1 = r1 / r2
                r2 = 1111490560(0x42400000, float:48.0)
                float r1 = r1 * r2
                int r1 = java.lang.Math.round(r1)
                r0.setProgress(r1)
                android.app.AlertDialog$Builder r0 = r12.c
                r0.setView(r8)
                android.app.AlertDialog$Builder r0 = r12.c
                android.app.Activity r1 = r13.getActivity()
                r2 = 2131624027(0x7f0e005b, float:1.8875222E38)
                java.lang.String r1 = r1.getString(r2)
                com.saterskog.cell_lab.i$d$1 r2 = new com.saterskog.cell_lab.i$d$1
                r2.<init>(r13)
                r0.setNegativeButton(r1, r2)
                android.app.AlertDialog$Builder r0 = r12.c
                android.app.Activity r1 = r13.getActivity()
                r2 = 2131624029(0x7f0e005d, float:1.8875226E38)
                java.lang.String r1 = r1.getString(r2)
                com.saterskog.cell_lab.i$d$2 r2 = new com.saterskog.cell_lab.i$d$2
                r2.<init>(r13)
                r0.setNeutralButton(r1, r2)
                r12.a()
                return
            L_0x01f2:
                r4 = r3
                r3 = r2
                r2 = r1
                r1 = r0
                goto L_0x00b2
            */
            throw new UnsupportedOperationException("Method not decompiled: com.saterskog.cell_lab.i.d.<init>(com.saterskog.cell_lab.i):void");
        }

        /* access modifiers changed from: package-private */
        public final float a(int i2, float f2, float f3) {
            int i3 = 0;
            float[] fArr = new float[i2];
            float[] fArr2 = new float[i2];
            int i4 = 1;
            float f4 = 0.0f;
            float f5 = 1.0f;
            float f6 = 0.0f;
            int i5 = 0;
            while (i4 < 80000) {
                float min = f5 + (((-5.0f * f5) + Math.min(20.0f, Math.max(-20.0f, f2 * f5)) + Math.min(20.0f, Math.max(-20.0f, f3 * f4))) * 0.005f);
                float min2 = f4 + (((-5.0f * f4) + Math.min(20.0f, Math.max(-20.0f, f2 * f4)) + Math.min(20.0f, Math.max(-20.0f, (-f3) * f5))) * 0.005f);
                for (int i6 = 0; i6 < i2; i6++) {
                    min -= (5.0f * (f5 - fArr[i6])) * 0.005f;
                    min2 -= (5.0f * (f4 - fArr2[i6])) * 0.005f;
                    fArr[i6] = fArr[i6] + (((5.0f * (f5 - fArr[i6])) - (5.0f * fArr[i6])) * 0.005f);
                    fArr2[i6] = fArr2[i6] + (((5.0f * (f4 - fArr2[i6])) - (5.0f * fArr2[i6])) * 0.005f);
                }
                if (min2 * f4 < 0.0f) {
                    i5++;
                    if (i5 == 6) {
                        f6 = ((float) i4) * 0.005f;
                    }
                    if (i5 == 14) {
                        break;
                    }
                }
                float min3 = Math.min(1.0f, Math.max(-1.0f, min));
                float min4 = Math.min(1.0f, Math.max(-1.0f, min2));
                if (i5 > 5 && min3 != min) {
                    i3++;
                }
                i4++;
                f5 = min3;
                f4 = min4;
            }
            float f7 = (((float) i4) * 0.005f) - f6;
            this.i = (((float) i3) * 0.005f) / f7;
            return f7 / 4.0f;
        }

        private void a() {
            this.e.setText(String.format(i.this.getString(C0028R.string.oscillator_preset_period) + " = %1$,.2f " + i.this.getString(C0028R.string.hour_abbreviation) + ".", new Object[]{Float.valueOf(0.25f + ((9.0f * ((float) this.d.getProgress())) / 48.0f))}));
        }
    }

    public i() {
        this.c = 0;
        this.e = null;
        this.i = false;
        this.j = false;
        this.g = false;
        this.e = new ArrayList<>();
        for (h add : h.B) {
            this.e.add(add);
        }
        this.q = new ArrayList<>();
    }

    public final void a(final int i2) {
        getActivity().runOnUiThread(new Runnable() {
            public final void run() {
                i.this.c = i2;
                i.this.a(true, true);
                i.this.a();
            }
        });
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.k = PreferenceManager.getDefaultSharedPreferences(getActivity()).getBoolean("show_gene_type", false);
        this.d = "";
        if (bundle == null) {
            this.h = true;
            this.l = 24;
            this.a = new Gene[80];
            this.n = 0.0d;
            b();
            return;
        }
        this.c = bundle.getInt("gi");
        this.a = (Gene[]) bundle.getParcelableArray("mGenes");
        this.n = bundle.getDouble("mTime");
        int[] intArray = bundle.getIntArray("genePool");
        this.e = new ArrayList<>();
        for (int i2 : intArray) {
            this.e.add(h.B[i2]);
        }
        this.h = bundle.getBoolean("snapAngles");
        this.l = this.h ? 24 : 1200;
    }

    /* access modifiers changed from: private */
    public void c(int i2) {
        boolean z;
        this.a[i2] = new Gene();
        this.a[i2].b = 0.25199997f;
        this.a[i2].a[0] = (float) com.saterskog.b.d.a.nextDouble();
        this.a[i2].a[1] = (float) com.saterskog.b.d.a.nextDouble();
        this.a[i2].a[2] = (float) com.saterskog.b.d.a.nextDouble();
        float sqrt = (float) Math.sqrt((double) ((this.a[i2].a[0] * this.a[i2].a[0]) + (this.a[i2].a[1] * this.a[i2].a[1]) + (this.a[i2].a[2] * this.a[i2].a[2])));
        float[] fArr = this.a[i2].a;
        fArr[0] = fArr[0] / sqrt;
        float[] fArr2 = this.a[i2].a;
        fArr2[1] = fArr2[1] / sqrt;
        float[] fArr3 = this.a[i2].a;
        fArr3[2] = fArr3[2] / sqrt;
        this.a[i2].d = 0.0f;
        this.a[i2].c = 0.5f;
        this.a[i2].e = 0.0f;
        this.a[i2].f = 0.0f;
        this.a[i2].g = 1.0f;
        this.a[i2].s = this.e.get(0);
        this.a[i2].i = i2;
        this.a[i2].j = i2;
        this.a[i2].l = false;
        this.a[i2].m = true;
        this.a[i2].n = true;
        this.a[i2].o = true;
        Gene gene = this.a[i2];
        if (i2 == 0) {
            z = true;
        } else {
            z = false;
        }
        gene.p = z;
        for (int i3 = 0; i3 < 11; i3++) {
            this.a[i2].t[i3].e = 0;
            this.a[i2].t[i3].d = 0;
            this.a[i2].t[i3].a = 0.0f;
            this.a[i2].t[i3].b = 0.0f;
            this.a[i2].t[i3].c = 0.0f;
        }
        this.a[i2].t[0].b = a(-0.19999999f, -1.0f, 1.0f);
        for (int i4 = 0; i4 < 11; i4++) {
            this.a[i2].u[i4] = 0;
        }
        this.a[i2].u[0] = i2;
        this.a[i2].u[1] = i2;
        this.a[i2].v[6] = 1.0f;
        this.a[i2].u[9] = Gene.w[9] - 1;
        this.a[i2].u[11] = 20;
        Log.d("Enzyme Debugger", "mInts[11] initialized");
    }

    private void b() {
        for (int i2 = 0; i2 < 80; i2++) {
            c(i2);
        }
        this.a[4].a[0] = 0.1f;
        this.a[4].a[1] = 0.9f;
        this.a[5].a[0] = 0.1f;
        this.a[6].a[0] = 0.5f;
        if (com.saterskog.b.d.a.nextInt(1) == 0) {
            this.a[1].a[0] = 0.1f;
            this.a[2].a[0] = 0.9f;
        } else {
            this.a[1].a[0] = 0.9f;
            this.a[2].a[0] = 0.1f;
        }
        for (int i3 = 0; i3 < 80; i3++) {
            d(i3);
        }
    }

    /* access modifiers changed from: private */
    public ArrayAdapter a(final boolean z, String[] strArr) {
        return new ArrayAdapter<String>(getActivity(), strArr) {
            public final View getView(int i, View view, ViewGroup viewGroup) {
                View view2 = super.getView(i, view, viewGroup);
                i.this.a((TextView) view2, i);
                return view2;
            }

            public final View getDropDownView(int i, View view, final ViewGroup viewGroup) {
                View dropDownView = super.getDropDownView(i, view, viewGroup);
                final TextView textView = (TextView) dropDownView;
                i.this.a(textView, i);
                textView.setTextSize(16.0f);
                if (view == null && z) {
                    dropDownView.setLongClickable(true);
                    dropDownView.setOnLongClickListener(new View.OnLongClickListener() {
                        public final boolean onLongClick(View view) {
                            String charSequence = textView.getText().toString();
                            int lastIndexOf = charSequence.lastIndexOf(" ");
                            if (lastIndexOf != -1) {
                                charSequence = charSequence.substring(0, lastIndexOf);
                            }
                            final int parseInt = Integer.parseInt(charSequence.substring(1)) - 1;
                            AlertDialog.Builder builder = new AlertDialog.Builder(i.this.getActivity());
                            builder.setItems(new String[]{i.this.getString(C0028R.string.gene_editor_load_default_to_mode) + " " + i.this.getString(C0028R.string.gene_mode_prefix) + (parseInt + 1), i.this.getString(C0028R.string.gene_editor_copy_to_mode) + " " + i.this.getString(C0028R.string.gene_mode_prefix) + (i.this.c + 1) + i.this.getString(C0028R.string.gene_editor_copy_to_mode2) + " M" + (parseInt + 1)}, new DialogInterface.OnClickListener() {
                                public final void onClick(DialogInterface dialogInterface, int i) {
                                    if (i == 0) {
                                        i.this.c(parseInt);
                                    } else {
                                        boolean z = i.this.a[parseInt].p;
                                        i.this.a[parseInt].a(i.this.a[i.this.c]);
                                        i.this.a[parseInt].p = z;
                                    }
                                    i.this.a(true, true);
                                    i.this.a();
                                    View rootView = viewGroup.getRootView();
                                    rootView.dispatchKeyEvent(new KeyEvent(0, 4));
                                    rootView.dispatchKeyEvent(new KeyEvent(1, 4));
                                }
                            });
                            builder.show();
                            return false;
                        }
                    });
                    dropDownView.setClickable(true);
                    dropDownView.setOnClickListener(new View.OnClickListener() {
                        public final void onClick(View view) {
                            String charSequence = textView.getText().toString();
                            int lastIndexOf = charSequence.lastIndexOf(" ");
                            if (lastIndexOf != -1) {
                                charSequence = charSequence.substring(0, lastIndexOf);
                            }
                            int parseInt = Integer.parseInt(charSequence.substring(1)) - 1;
                            com.saterskog.b.a.b("name=" + charSequence);
                            com.saterskog.b.a.b("pos=" + parseInt);
                            ((Spinner) i.this.o.findViewById(C0028R.id.spinner_cells)).setSelection(parseInt);
                            View rootView = viewGroup.getRootView();
                            rootView.dispatchKeyEvent(new KeyEvent(0, 4));
                            rootView.dispatchKeyEvent(new KeyEvent(1, 4));
                        }
                    });
                }
                return dropDownView;
            }
        };
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        h hVar;
        this.o = layoutInflater.inflate(C0028R.layout.fragment_genome_editor, viewGroup, false);
        LinearLayout linearLayout = (LinearLayout) this.o.findViewById(C0028R.id.gene_edit_params_lin_lay);
        this.q.clear();
        this.q.add(new a(getString(C0028R.string.gene_editor_cytoskeleton), getString(C0028R.string.gene_editor_cytoskeleton_tip), 6, (h) null));
        this.p = new a(getString(C0028R.string.gene_editor_adhesin_length), getString(C0028R.string.gene_editor_adhesin_length_tip), 5, (h) null);
        this.p.b = 100.0f;
        this.q.add(this.p);
        String[] strArr = new String[Gene.w[9]];
        for (int i2 = 0; i2 < Gene.w[9]; i2++) {
            strArr[i2] = new StringBuilder().append(i2 + 1).toString();
        }
        this.q.add(new c(getString(C0028R.string.gene_editor_max_connections), getString(C0028R.string.gene_editor_max_connections_tip), 9, (h) null, strArr, 1, false));
        String[] strArr2 = new String[21];
        int i3 = 0;
        int i4 = 1;
        while (i3 < 20) {
            strArr2[i3] = Integer.toString(i4);
            i3++;
            i4 = i3 + 1;
        }
        strArr2[20] = "∞";
        this.q.add(new c("Max Splits", "Maximum amount of times the cell can split before being unable to anymore. The split count is only inherited by child 1. Child 2 begins with a fresh split count.", 11, (h) null, strArr2, -1, false));
        String[] strArr3 = new String[80];
        for (int i5 = 0; i5 < 80; i5++) {
            strArr3[i5] = getString(C0028R.string.gene_mode_prefix) + (i5 + 1);
        }
        String[] strArr4 = new String[Gene.B.length];
        strArr4[0] = "∞";
        for (int i6 = 1; i6 < Gene.B.length; i6++) {
            strArr4[i6] = new StringBuilder().append(Gene.B[i6]).toString();
        }
        this.q.add(new c(getActivity().getString(C0028R.string.genome_editor_virus_copy_from), getString(C0028R.string.tip_virsus_from), 0, h.VIROCYTE, strArr3, -1, true));
        this.q.add(new f(getString(C0028R.string.genome_editor_swim_force), getString(C0028R.string.tip_swim_force), 0, h.FLAGELLOCYTE));
        this.q.add(new f(getString(C0028R.string.genome_editor_density), getString(C0028R.string.tip_density), 1, h.BUOYOCYTE));
        this.q.add(new f(getString(C0028R.string.muscle_contract), getString(C0028R.string.tip_muscle_contraction), 3, h.MYOCYTE));
        this.q.add(new f(getString(C0028R.string.muscle_bend), getString(C0028R.string.tip_muscle_bending), 2, h.MYOCYTE));
        this.q.add(new f(getString(C0028R.string.muscle_lift), getString(C0028R.string.tip_muscle_lift), 4, h.MYOCYTE));
        this.q.add(new c(getString(C0028R.string.stem_mode1), getString(C0028R.string.tip_stem_mode1), 0, h.STEMOCYTE, strArr3, -1, true));
        this.q.add(new f(getString(C0028R.string.stem_signal1), getString(C0028R.string.tip_stem_signal1), 5, h.STEMOCYTE));
        this.q.add(new c(getString(C0028R.string.stem_mode2), getString(C0028R.string.tip_stem_mode2), 1, h.STEMOCYTE, strArr3, -1, true));
        this.q.add(new f(getString(C0028R.string.stem_signal2), getString(C0028R.string.tip_stem_signal2), 6, h.STEMOCYTE));
        this.q.add(new c(getString(C0028R.string.gene_editor_comp_mode), getString(C0028R.string.gene_editor_comp_mode_tip), 1, h.GAMETE, strArr3, -1, true));
        this.q.add(new c(getString(C0028R.string.gene_editor_mode_after_fert), getString(C0028R.string.gene_editor_mode_after_fert_tip), 0, h.GAMETE, strArr3, -1, true));
        this.q.add(new c(getString(C0028R.string.gene_editor_telomeres), getString(C0028R.string.gene_editor_telomeres_tip), 10, h.GAMETE, strArr4, -1, false));
        this.q.add(new f(getString(C0028R.string.gene_editor_cilio_left_speed), getString(C0028R.string.gene_editor_cilio_left_speed_tip), 2, h.CILIOCYTE));
        this.q.add(new f(getString(C0028R.string.gene_editor_cilio_right_speed), getString(C0028R.string.gene_editor_cilio_right_speed_tip), 4, h.CILIOCYTE));
        String[] strArr5 = new String[Gene.w[4]];
        strArr5[0] = getString(C0028R.string.secrete_food_smell);
        strArr5[1] = getString(C0028R.string.secrete_cyanide);
        strArr5[2] = getString(C0028R.string.secrete_type_lipase);
        strArr5[3] = getString(C0028R.string.secrete_protease);
        strArr5[5] = getString(C0028R.string.secrete_light);
        strArr5[6] = getString(C0028R.string.secrete_wall);
        strArr5[4] = getString(C0028R.string.secrete_coated_food);
        for (int i7 = 0; i7 < 4; i7++) {
            strArr5[i7 + 7] = "-" + getString(C0028R.string.signal_substance_prefix) + (i7 + 1);
        }
        for (int i8 = 0; i8 < 4; i8++) {
            strArr5[i8 + 11] = "+" + getString(C0028R.string.signal_substance_prefix) + (i8 + 1);
        }
        this.q.add(new c(getString(C0028R.string.genome_editor_secretion), getString(C0028R.string.tip_secrocyte), 4, h.SECROCYTE, strArr5, -1, false));
        String[] strArr6 = new String[4];
        for (int i9 = 0; i9 < 4; i9++) {
            strArr6[i9] = getString(C0028R.string.signal_substance_prefix) + (i9 + 1);
        }
        String[] strArr7 = {getString(C0028R.string.smell_cell), getString(C0028R.string.smell_food), getString(C0028R.string.smell_type_coated_food), getString(C0028R.string.smell_light), getString(C0028R.string.smell_velocity), getString(C0028R.string.smell_wall)};
        for (int i10 = 0; i10 < 2; i10++) {
            if (i10 == 0) {
                hVar = h.SENSEOCYTE;
            } else {
                hVar = h.STEREOCYTE;
            }
            this.q.add(new c(getString(C0028R.string.ge_smell_type), getString(C0028R.string.ge_smell_type_tip), 3, hVar, strArr7, -1, false));
            this.q.add(new c(getString(C0028R.string.ge_output_channel), getString(C0028R.string.ge_smell_output_tip), 2, hVar, strArr6, -1, false));
            this.q.add(new a(getString(C0028R.string.ge_output_amount), getString(C0028R.string.ge_smell_output_amount_tip), 0, hVar));
            this.q.add(new a(getString(C0028R.string.ge_smell_red), getString(C0028R.string.ge_smell_red_tip), 1, hVar));
            this.q.add(new a(getString(C0028R.string.ge_smell_green), getString(C0028R.string.ge_smell_green_tip), 2, hVar));
            this.q.add(new a(getString(C0028R.string.ge_smell_blue), getString(C0028R.string.ge_smell_blue_tip), 3, hVar));
            this.q.add(new a(getString(C0028R.string.ge_smell_threshold), getString(C0028R.string.ge_smell_threshold_tip), 4, hVar));
        }
        int i11 = 0;
        while (true) {
            int i12 = i11;
            if (i12 >= 4) {
                break;
            }
            this.q.add(new c(getString(C0028R.string.ge_output_channel), getString(C0028R.string.ge_neuro_output_tip_1) + (i12 + 1) + getString(C0028R.string.ge_neuro_output_tip_2), i12 + 5, h.NEUROCYTE, strArr6, -1, false));
            this.q.add(new f(getString(C0028R.string.ge_output_amount), getString(C0028R.string.ge_neuro_output_amount_tip_1) + (i12 + 1) + getString(C0028R.string.ge_neuro_output_amount_tip_2), i12 + 7, h.NEUROCYTE));
            i11 = i12 + 1;
        }
        int i13 = 0;
        while (true) {
            int i14 = i13;
            if (i14 >= this.q.size()) {
                break;
            }
            if (!j.a((Context) getActivity(), this.q.get(i14).k)) {
                this.q.remove(i14);
                i14--;
            }
            i13 = i14 + 1;
        }
        Iterator<e> it = this.q.iterator();
        while (it.hasNext()) {
            e next = it.next();
            if (next.g == null) {
                linearLayout.addView(next.a());
            }
        }
        View view = new View(getActivity());
        linearLayout.addView(view);
        view.setBackgroundColor(getResources().getColor(C0028R.color.border));
        view.getLayoutParams().width = -1;
        view.getLayoutParams().height = (int) (1.0f * Resources.getSystem().getDisplayMetrics().density);
        this.b = new Button(getActivity());
        this.b.setText(C0028R.string.ge_osc_preset_button);
        this.b.setOnClickListener(new View.OnClickListener() {
            public final void onClick(View view) {
                new d().c.show();
                if (i.this.c == 2) {
                    t.a(i.this.getActivity(), 3, 5, 500);
                }
            }
        });
        linearLayout.addView(this.b);
        Iterator<e> it2 = this.q.iterator();
        while (it2.hasNext()) {
            e next2 = it2.next();
            if (next2.g != null) {
                linearLayout.addView(next2.a());
            }
        }
        if (this.h) {
            ((SeekBar) this.o.findViewById(C0028R.id.seek_splitangle)).setMax(24);
            ((SeekBar) this.o.findViewById(C0028R.id.seek_child1_angle)).setMax(24);
            ((SeekBar) this.o.findViewById(C0028R.id.seek_child2_angle)).setMax(24);
            ((SeekBar) this.o.findViewById(C0028R.id.seek_mass)).setMax(24);
            ((SeekBar) this.o.findViewById(C0028R.id.seek_prio)).setMax(24);
            ((SeekBar) this.o.findViewById(C0028R.id.seek_ratio)).setMax(24);
            ((SeekBar) this.o.findViewById(C0028R.id.seek_stiff)).setMax(24);
            ((SeekBar) this.o.findViewById(C0028R.id.seek_red)).setMax(24);
            ((SeekBar) this.o.findViewById(C0028R.id.seek_blue)).setMax(24);
            ((SeekBar) this.o.findViewById(C0028R.id.seek_green)).setMax(24);
        }
        ((Spinner) this.o.findViewById(C0028R.id.spinner_cells)).setAdapter(a(true, strArr3));
        ((Spinner) this.o.findViewById(C0028R.id.spinner_child1)).setAdapter(a(false, strArr3));
        ((Spinner) this.o.findViewById(C0028R.id.spinner_child2)).setAdapter(a(false, strArr3));
        ArrayList arrayList = new ArrayList();
        int i15 = 0;
        while (true) {
            int i16 = i15;
            if (i16 >= this.e.size()) {
                break;
            }
            arrayList.add(com.saterskog.b.e.a(this.e.get(i16).a(getActivity())));
            i15 = i16 + 1;
        }
        ((Spinner) this.o.findViewById(C0028R.id.spinner_types)).setAdapter(new ArrayAdapter(getActivity(), C0028R.layout.spinner_item, arrayList));
        this.m = (GenomePreviewView) this.o.findViewById(C0028R.id.GL_preview);
        this.m.setCallback(this);
        a(this.o, (int) C0028R.id.spinner_types);
        a(this.o, (int) C0028R.id.spinner_cells);
        a(this.o, (int) C0028R.id.spinner_child1);
        a(this.o, (int) C0028R.id.spinner_child2);
        d(this.o, C0028R.id.seek_time);
        d(this.o, C0028R.id.seek_red);
        d(this.o, C0028R.id.seek_green);
        d(this.o, C0028R.id.seek_blue);
        d(this.o, C0028R.id.seek_child1_angle);
        d(this.o, C0028R.id.seek_child2_angle);
        d(this.o, C0028R.id.seek_mass);
        d(this.o, C0028R.id.seek_prio);
        d(this.o, C0028R.id.seek_ratio);
        d(this.o, C0028R.id.seek_splitangle);
        d(this.o, C0028R.id.seek_stiff);
        e(this.o, C0028R.id.checkbox_make_glue);
        e(this.o, C0028R.id.checkbox_stay_alive);
        e(this.o, C0028R.id.checkbox_keep_glue1);
        e(this.o, C0028R.id.checkbox_keep_glue2);
        e(this.o, C0028R.id.checkbox_mirror1);
        e(this.o, C0028R.id.checkbox_mirror2);
        e(this.o, C0028R.id.checkbox_snap);
        b(this.o, (int) C0028R.id.button_load_dna);
        b(this.o, (int) C0028R.id.button_save_dna);
        ((RadioButton) this.o.findViewById(C0028R.id.radio_initial)).setOnCheckedChangeListener(this);
        c(this.o, C0028R.id.text_edit_mode);
        c(this.o, C0028R.id.text_make_glue);
        c(this.o, C0028R.id.text_keep_glue1);
        c(this.o, C0028R.id.text_keep_glue2);
        c(this.o, C0028R.id.text_initial);
        c(this.o, C0028R.id.text_mirror1);
        c(this.o, C0028R.id.text_mirror2);
        c(this.o, C0028R.id.text_stay_alive);
        c(this.o, C0028R.id.text_types);
        c(this.o, C0028R.id.seek_mass_text);
        c(this.o, C0028R.id.text_seek_ratio);
        c(this.o, C0028R.id.seek_prio_text);
        c(this.o, C0028R.id.seek_stiff_text);
        c(this.o, C0028R.id.text_snap);
        c(this.o, C0028R.id.seek_splitangle_text);
        c(this.o, C0028R.id.seek_child1_angle_text);
        c(this.o, C0028R.id.seek_child2_angle_text);
        c(this.o, C0028R.id.seek_red_text);
        c(this.o, C0028R.id.seek_green_text);
        c(this.o, C0028R.id.seek_blue_text);
        c(this.o, C0028R.id.spinner_child1_text);
        c(this.o, C0028R.id.spinner_child2_text);
        if (!j.a((Context) getActivity(), 1)) {
            this.o.findViewById(C0028R.id.seek_stiff).setVisibility(8);
            this.o.findViewById(C0028R.id.seek_stiff_text).setVisibility(8);
            this.o.findViewById(C0028R.id.seek_prio).setVisibility(8);
            this.o.findViewById(C0028R.id.seek_prio_text).setVisibility(8);
            this.o.findViewById(C0028R.id.seek_ratio).setVisibility(8);
            this.o.findViewById(C0028R.id.text_seek_ratio).setVisibility(8);
            this.o.findViewById(C0028R.id.checkbox_stay_alive).setVisibility(8);
            this.o.findViewById(C0028R.id.text_stay_alive).setVisibility(8);
            this.o.findViewById(C0028R.id.checkbox_mirror1).setVisibility(8);
            this.o.findViewById(C0028R.id.text_mirror1).setVisibility(8);
            this.o.findViewById(C0028R.id.checkbox_mirror2).setVisibility(8);
            this.o.findViewById(C0028R.id.text_mirror2).setVisibility(8);
        }
        a(true, true);
        return this.o;
    }

    public final void onAttach(Activity activity) {
        super.onAttach(activity);
        try {
            this.f = (b) activity;
        } catch (ClassCastException e2) {
            throw new ClassCastException(activity.toString() + " must implement GenomeProvider");
        }
    }

    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("snapAngles", this.h);
        bundle.putParcelableArray("mGenes", this.a);
        bundle.putDouble("mTime", this.n);
        int[] iArr = new int[this.e.size()];
        int i2 = 0;
        while (true) {
            int i3 = i2;
            if (i3 < this.e.size()) {
                iArr[i3] = this.e.get(i3).ordinal();
                i2 = i3 + 1;
            } else {
                bundle.putIntArray("genePool", iArr);
                bundle.putInt("gi", this.c);
                return;
            }
        }
    }

    private void a(View view, int i2) {
        ((Spinner) view.findViewById(i2)).setOnItemSelectedListener(this);
    }

    private void b(View view, int i2) {
        ((Button) view.findViewById(i2)).setOnClickListener(this);
    }

    private void c(View view, int i2) {
        TextView textView = (TextView) view.findViewById(i2);
        if (textView != null) {
            textView.setClickable(true);
            textView.setOnClickListener(this);
            textView.setPaintFlags(textView.getPaintFlags() | 8);
        }
    }

    private void d(View view, int i2) {
        ((SeekBar) view.findViewById(i2)).setOnSeekBarChangeListener(this);
    }

    private void e(View view, int i2) {
        ((CheckBox) view.findViewById(i2)).setOnCheckedChangeListener(this);
    }

    public final void onItemSelected(AdapterView<?> adapterView, View view, int i2, long j2) {
        if (!this.j) {
            switch (adapterView.getId()) {
                case C0028R.id.spinner_cells /*2131230911*/:
                    this.c = i2;
                    a(true, false);
                    if (this.c == 4) {
                        t.b(getActivity(), 1, 2);
                        break;
                    }
                    break;
                case C0028R.id.spinner_child1 /*2131230912*/:
                    this.a[this.c].i = i2;
                    if (this.a[4].i == 5 && this.a[4].j == 6) {
                        t.b(getActivity(), 1, 6);
                    }
                    if (this.a[5].i == 4 && this.a[5].j == 4 && this.a[6].i == 4 && this.a[6].j == 4) {
                        t.b(getActivity(), 1, 8);
                    }
                    if (this.a[0].i == 1 && this.a[0].j == 2) {
                        t.b(getActivity(), 2, 1);
                        break;
                    }
                case C0028R.id.spinner_child2 /*2131230914*/:
                    this.a[this.c].j = i2;
                    if (this.a[4].i == 5 && this.a[4].j == 6) {
                        t.b(getActivity(), 1, 6);
                    }
                    if (this.a[5].i == 4 && this.a[5].j == 4 && this.a[6].i == 4 && this.a[6].j == 4) {
                        t.b(getActivity(), 1, 8);
                    }
                    if (this.a[2].j == 0) {
                        t.b(getActivity(), 2, 4);
                    }
                    if (this.a[0].i == 1 && this.a[0].j == 2) {
                        t.b(getActivity(), 2, 1);
                        break;
                    }
                case C0028R.id.spinner_types /*2131230918*/:
                    this.a[this.c].s = this.e.get(i2);
                    if (Math.abs(this.n - 0.8d) < 0.06d && this.a[0].l && this.a[0].s == h.PHAGOCYTE) {
                        t.b(getActivity(), 2, 0);
                    }
                    if (this.a[1].s == h.FLAGELLOCYTE && this.a[2].s == h.PHAGOCYTE) {
                        t.b(getActivity(), 2, 2);
                    }
                    if (this.a[0].l && this.a[0].s == h.NEUROCYTE && this.a[1].s == h.FLAGELLOCYTE && this.a[2].s == h.PHAGOCYTE) {
                        t.b(getActivity(), 3, 0);
                    }
                    a(false, false);
                    break;
            }
            a();
        }
    }

    public final void onNothingSelected(AdapterView<?> adapterView) {
    }

    public final void onProgressChanged(SeekBar seekBar, int i2, boolean z) {
        int i3;
        if (!this.i && !this.j) {
            int id = seekBar.getId();
            if (!this.h || id == C0028R.id.seek_time) {
                i3 = 1200;
            } else {
                i3 = 24;
            }
            double d2 = ((double) i2) / ((double) i3);
            TextView textView = (TextView) getActivity().findViewById(C0028R.id.text_time);
            switch (id) {
                case C0028R.id.seek_blue /*2131230876*/:
                    this.a[this.c].a[2] = ((float) i2) / ((float) i3);
                    if (this.a[this.c].a[0] > 0.9f && this.a[this.c].a[1] < 0.1f && this.a[this.c].a[2] < 0.1f) {
                        t.b(getActivity(), 1, 5);
                    }
                    if (textView != null) {
                        textView.setText(getActivity().getString(C0028R.string.drag_blue) + String.format("%1$,.2f", new Object[]{Float.valueOf(this.a[this.c].a[2])}));
                        break;
                    }
                    break;
                case C0028R.id.seek_child1_angle /*2131230878*/:
                    this.a[this.c].e = (float) ((((double) (i2 * 2)) * 3.141592653589793d) / ((double) i3));
                    if (textView != null) {
                        textView.setText(getActivity().getString(C0028R.string.drag_child_1_angle) + String.format("%1$,.0f", new Object[]{Double.valueOf(((double) (this.a[this.c].e * 180.0f)) / 3.141592653589793d)}) + "°");
                        break;
                    }
                    break;
                case C0028R.id.seek_child2_angle /*2131230880*/:
                    this.a[this.c].f = (float) ((((double) (i2 * 2)) * 3.141592653589793d) / ((double) i3));
                    if (textView != null) {
                        textView.setText(getActivity().getString(C0028R.string.drag_child_2_angle) + String.format("%1$,.0f", new Object[]{Double.valueOf(((double) (this.a[this.c].f * 180.0f)) / 3.141592653589793d)}) + "°");
                        break;
                    }
                    break;
                case C0028R.id.seek_green /*2131230882*/:
                    this.a[this.c].a[1] = ((float) i2) / ((float) i3);
                    if (this.a[this.c].a[0] > 0.9f && this.a[this.c].a[1] < 0.1f && this.a[this.c].a[2] < 0.1f) {
                        t.b(getActivity(), 1, 5);
                    }
                    if (textView != null) {
                        textView.setText(getActivity().getString(C0028R.string.drag_green) + String.format("%1$,.2f", new Object[]{Float.valueOf(this.a[this.c].a[1])}));
                        break;
                    }
                    break;
                case C0028R.id.seek_mass /*2131230884*/:
                    this.a[this.c].b = ((0.3024f * ((float) i2)) / ((float) i3)) + 0.0648f;
                    if (textView != null) {
                        if (((double) this.a[this.c].b) > 0.36d) {
                            textView.setText(getActivity().getString(C0028R.string.drag_mass_no_split));
                        } else if (((double) this.a[this.c].b) < 0.072d) {
                            textView.setText(getActivity().getString(C0028R.string.drag_mass_age_split) + String.format("%1$,.2f", new Object[]{Double.valueOf(0.5d)}) + " " + getActivity().getString(C0028R.string.hour_abbreviation));
                        } else {
                            textView.setText(getActivity().getString(C0028R.string.drag_split_mass) + String.format("%1$,.2f", new Object[]{Float.valueOf(this.a[this.c].b * 10.0f)}) + " " + getActivity().getString(C0028R.string.nano_gram_abbreviation));
                        }
                    }
                    if (((double) this.a[1].b) > 0.36d) {
                        t.b(getActivity(), 2, 3);
                        break;
                    }
                    break;
                case C0028R.id.seek_prio /*2131230887*/:
                    this.a[this.c].g = (float) (Math.pow(99.99999850988391d, ((double) i2) / ((double) i3)) * 0.10000000149011612d);
                    if (textView != null) {
                        textView.setText(getActivity().getString(C0028R.string.drag_priority) + String.format("%1$,.2f", new Object[]{Float.valueOf(this.a[this.c].g)}));
                        break;
                    }
                    break;
                case C0028R.id.seek_ratio /*2131230889*/:
                    this.a[this.c].c = ((((float) (i3 - i2)) * 0.8f) / ((float) i3)) + 0.1f;
                    if (textView != null) {
                        textView.setText(getActivity().getString(C0028R.string.drag_child_1_ratio) + String.format("%1$,.2f", new Object[]{Float.valueOf(1.0f - this.a[this.c].c)}) + getActivity().getString(C0028R.string.drag_child_2_ratio) + String.format("%1$,.2f", new Object[]{Float.valueOf(this.a[this.c].c)}));
                        break;
                    }
                    break;
                case C0028R.id.seek_red /*2131230890*/:
                    this.a[this.c].a[0] = ((float) i2) / ((float) i3);
                    if (this.a[this.c].a[0] > 0.9f && this.a[this.c].a[1] < 0.1f && this.a[this.c].a[2] < 0.1f) {
                        t.b(getActivity(), 1, 5);
                    }
                    if (textView != null) {
                        textView.setText(getActivity().getString(C0028R.string.drag_red) + String.format("%1$,.2f", new Object[]{Float.valueOf(this.a[this.c].a[0])}));
                        break;
                    }
                    break;
                case C0028R.id.seek_splitangle /*2131230892*/:
                    this.a[this.c].d = (float) (2.0d * d2 * 3.141592653589793d);
                    if (textView != null) {
                        textView.setText(getActivity().getString(C0028R.string.drag_split_angle) + String.format("%1$,.0f", new Object[]{Double.valueOf(((double) (this.a[this.c].d * 180.0f)) / 3.141592653589793d)}) + "°");
                        break;
                    }
                    break;
                case C0028R.id.seek_stiff /*2131230894*/:
                    this.a[this.c].h = (float) (35.0d * d2);
                    if (textView != null) {
                        textView.setText(getActivity().getString(C0028R.string.drag_stiffness) + String.format("%1$,.1f", new Object[]{Float.valueOf(this.a[this.c].h)}));
                        break;
                    }
                    break;
                case C0028R.id.seek_time /*2131230896*/:
                    double d3 = ((double) i2) / 1200.0d;
                    this.n = Math.max(4.0d * d3 * 6.0d, ((d3 - 0.5d) * 4.0d * 42.0d) + 6.0d);
                    if (textView != null) {
                        textView.setText(getActivity().getString(C0028R.string.drag_time_1) + String.format("%1$,.1f", new Object[]{Double.valueOf(this.n)}) + getActivity().getString(C0028R.string.drag_time_2));
                        break;
                    }
                    break;
            }
            if (this.h) {
                d(this.c);
            }
            a();
        }
    }

    /* access modifiers changed from: package-private */
    public final void a(TextView textView, int i2) {
        if (textView != null) {
            textView.setTextColor(Color.rgb(Math.min(255, Math.max(0, (int) (((double) this.a[i2].a[0]) * 256.0d))), Math.min(255, Math.max(0, (int) (((double) this.a[i2].a[1]) * 256.0d))), Math.min(255, Math.max(0, (int) (((double) this.a[i2].a[2]) * 256.0d)))));
            if (this.k) {
                textView.setText(getString(C0028R.string.gene_mode_prefix) + (i2 + 1) + " " + getResources().getStringArray(C0028R.array.cell_type_abbreviations)[this.a[i2].s.ordinal()]);
            } else {
                textView.setText(getString(C0028R.string.gene_mode_prefix) + (i2 + 1));
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final void a() {
        if (!this.i) {
            if (this.m != null) {
                GenomePreviewView genomePreviewView = this.m;
                Gene[] geneArr = this.a;
                int i2 = this.c;
                double d2 = this.n;
                Gene[] geneArr2 = new Gene[80];
                for (int i3 = 0; i3 < 80; i3++) {
                    geneArr2[i3] = new Gene(geneArr[i3]);
                }
                genomePreviewView.queueEvent(new Runnable(geneArr2, i2, d2) {
                    final /* synthetic */ Gene[] a;
                    final /* synthetic */ int b;
                    final /* synthetic */ double c;

                    public final void run(
/*
Method generation error in method: com.saterskog.cell_lab.GenomePreviewView.1.run():void, dex: classes.dex
                    jadx.core.utils.exceptions.JadxRuntimeException: Method args not loaded: com.saterskog.cell_lab.GenomePreviewView.1.run():void, class status: UNLOADED
                    	at jadx.core.dex.nodes.MethodNode.getArgRegs(MethodNode.java:278)
                    	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:116)
                    	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:313)
                    	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:271)
                    	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:240)
                    	at java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                    	at java.util.ArrayList.forEach(ArrayList.java:1259)
                    	at java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                    	at java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                    	at java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:483)
                    	at java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:472)
                    	at java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
                    	at java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
                    	at java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
                    	at java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:485)
                    	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
                    	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
                    	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:676)
                    	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:607)
                    	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:364)
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:231)
                    	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:123)
                    	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:107)
                    	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:787)
                    	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:728)
                    	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:368)
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:250)
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:221)
                    	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:109)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:55)
                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                    	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                    	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:142)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                    	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                    	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:142)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                    	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:211)
                    	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:204)
                    	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:318)
                    	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:271)
                    	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:240)
                    	at java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                    	at java.util.ArrayList.forEach(ArrayList.java:1259)
                    	at java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                    	at java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                    	at java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:483)
                    	at java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:472)
                    	at java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
                    	at java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
                    	at java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
                    	at java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:485)
                    	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
                    	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
                    	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:112)
                    	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:78)
                    	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:44)
                    	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:33)
                    	at jadx.core.codegen.CodeGen.generate(CodeGen.java:21)
                    	at jadx.core.ProcessClass.generateCode(ProcessClass.java:61)
                    	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:273)
                    
*/
                });
                genomePreviewView.requestRender();
            }
            Activity activity = getActivity();
            if (activity != null) {
                Spinner spinner = (Spinner) activity.findViewById(C0028R.id.spinner_cells);
                if (spinner != null) {
                    a((TextView) spinner.getSelectedView(), this.c);
                }
                Spinner spinner2 = (Spinner) getActivity().findViewById(C0028R.id.spinner_child1);
                if (spinner2 != null && this.c == this.a[this.c].i) {
                    a((TextView) spinner2.getSelectedView(), this.c);
                }
                Spinner spinner3 = (Spinner) getActivity().findViewById(C0028R.id.spinner_child2);
                if (spinner3 != null && this.c == this.a[this.c].j) {
                    a((TextView) spinner3.getSelectedView(), this.c);
                }
                Iterator<e> it = this.q.iterator();
                while (it.hasNext()) {
                    e next = it.next();
                    if ((next instanceof c) && (next.h == 0 || next.h == 1)) {
                        c cVar = (c) next;
                        if (cVar.a != null && this.c == this.a[this.c].u[cVar.h]) {
                            a((TextView) cVar.a.getSelectedView(), this.c);
                        }
                    }
                }
            }
        }
    }

    private void a(int i2, double d2) {
        int i3;
        SeekBar seekBar = (SeekBar) getActivity().findViewById(i2);
        if (seekBar != null) {
            if (!this.h || i2 == C0028R.id.seek_time) {
                i3 = 1200;
            } else {
                i3 = 24;
            }
            seekBar.setProgress(Math.round((float) (((double) i3) * d2)));
            TextView textView = (TextView) getActivity().findViewById(C0028R.id.text_time);
            if (textView != null) {
                textView.setText("");
            }
        }
    }

    private void a(int i2, int i3) {
        Spinner spinner = (Spinner) getActivity().findViewById(i2);
        if (spinner != null) {
            spinner.setSelection(i3, true);
        }
    }

    private void b(int i2, boolean z) {
        CheckBox checkBox = (CheckBox) getActivity().findViewById(i2);
        if (checkBox != null) {
            checkBox.setChecked(z);
        }
    }

    public final void a(boolean z, boolean z2) {
        int i2;
        if (!this.i) {
            this.j = true;
            Iterator<e> it = this.q.iterator();
            while (it.hasNext()) {
                it.next().b();
            }
            if (this.n < 12.0d) {
                a((int) C0028R.id.seek_time, (this.n * 0.25d) / 6.0d);
            } else {
                a((int) C0028R.id.seek_time, (((this.n - 6.0d) * 0.25d) / 42.0d) + 0.5d);
            }
            a((int) C0028R.id.seek_red, (double) this.a[this.c].a[0]);
            a((int) C0028R.id.seek_green, (double) this.a[this.c].a[1]);
            a((int) C0028R.id.seek_blue, (double) this.a[this.c].a[2]);
            a((int) C0028R.id.seek_child1_angle, ((double) this.a[this.c].e) / 6.283185307179586d);
            a((int) C0028R.id.seek_child2_angle, ((double) this.a[this.c].f) / 6.283185307179586d);
            a((int) C0028R.id.seek_mass, (double) ((this.a[this.c].b - 0.0648f) / 0.3024f));
            a((int) C0028R.id.seek_prio, Math.log(((double) this.a[this.c].g) / 0.10000000149011612d) / Math.log(99.99999850988391d));
            a((int) C0028R.id.seek_ratio, 1.0d - ((double) ((this.a[this.c].c - 0.1f) / 0.8f)));
            a((int) C0028R.id.seek_splitangle, ((double) this.a[this.c].d) / 6.283185307179586d);
            a((int) C0028R.id.seek_stiff, (double) (this.a[this.c].h / 35.0f));
            if (z2) {
                a((int) C0028R.id.spinner_cells, this.c);
            }
            if (z) {
                a((int) C0028R.id.spinner_types, this.e.indexOf(this.a[this.c].s));
            }
            a((int) C0028R.id.spinner_child1, this.a[this.c].i);
            a((int) C0028R.id.spinner_child2, this.a[this.c].j);
            b((int) C0028R.id.checkbox_make_glue, this.a[this.c].l);
            b((int) C0028R.id.checkbox_stay_alive, this.a[this.c].o);
            b((int) C0028R.id.checkbox_keep_glue1, this.a[this.c].m);
            b((int) C0028R.id.checkbox_keep_glue2, this.a[this.c].n);
            b((int) C0028R.id.checkbox_mirror1, this.a[this.c].q);
            b((int) C0028R.id.checkbox_mirror2, this.a[this.c].r);
            b((int) C0028R.id.checkbox_snap, this.h);
            RadioButton radioButton = (RadioButton) getActivity().findViewById(C0028R.id.radio_initial);
            if (radioButton != null) {
                radioButton.setChecked(this.a[this.c].p);
            }
            SeekBar seekBar = (SeekBar) getActivity().findViewById(C0028R.id.seek_stiff);
            if (seekBar != null) {
                seekBar.setEnabled(this.a[this.c].l);
            }
            if (this.p != null) {
                this.p.a(this.a[this.c].l);
            }
            if (this.b != null) {
                Button button = this.b;
                if (this.a[this.c].s == h.NEUROCYTE) {
                    i2 = 0;
                } else {
                    i2 = 8;
                }
                button.setVisibility(i2);
            }
            this.j = false;
        }
    }

    public final void onStartTrackingTouch(SeekBar seekBar) {
    }

    public final void onStopTrackingTouch(SeekBar seekBar) {
        new Handler().postDelayed(new Runnable() {
            public final void run() {
                TextView textView;
                Activity activity = i.this.getActivity();
                if (activity != null && (textView = (TextView) activity.findViewById(C0028R.id.text_time)) != null) {
                    textView.setText("");
                }
            }
        }, 500);
        if (seekBar == getActivity().findViewById(C0028R.id.seek_time)) {
            if (Math.abs(this.n - 2.0d) < 0.06d) {
                t.b(getActivity(), 1, 1);
            }
            if (Math.abs(this.n - 4.0d) < 0.06d) {
                t.b(getActivity(), 1, 7);
            }
            if (Math.abs(this.n - 0.8d) < 0.06d && this.a[0].l && this.a[0].s == h.PHAGOCYTE) {
                t.b(getActivity(), 2, 0);
            }
        }
    }

    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        if (!this.j) {
            switch (compoundButton.getId()) {
                case C0028R.id.checkbox_keep_glue1 /*2131230757*/:
                    this.a[this.c].m = z;
                    break;
                case C0028R.id.checkbox_keep_glue2 /*2131230758*/:
                    this.a[this.c].n = z;
                    break;
                case C0028R.id.checkbox_make_glue /*2131230759*/:
                    this.a[this.c].l = z;
                    if (Math.abs(this.n - 0.8d) < 0.06d && this.a[0].l && this.a[0].s == h.PHAGOCYTE) {
                        t.b(getActivity(), 2, 0);
                    }
                    if (this.a[0].l && this.a[0].s == h.NEUROCYTE && this.a[1].s == h.FLAGELLOCYTE && this.a[2].s == h.PHAGOCYTE) {
                        t.b(getActivity(), 3, 0);
                    }
                    SeekBar seekBar = (SeekBar) getActivity().findViewById(C0028R.id.seek_stiff);
                    if (seekBar != null) {
                        seekBar.setEnabled(this.a[this.c].l);
                    }
                    if (this.p != null) {
                        this.p.a(this.a[this.c].l);
                        break;
                    }
                    break;
                case C0028R.id.checkbox_mirror1 /*2131230760*/:
                    this.a[this.c].q = z;
                    break;
                case C0028R.id.checkbox_mirror2 /*2131230761*/:
                    this.a[this.c].r = z;
                    break;
                case C0028R.id.checkbox_snap /*2131230762*/:
                    if (this.h != z) {
                        this.h = z;
                        c();
                        a(false, false);
                        break;
                    }
                    break;
                case C0028R.id.checkbox_stay_alive /*2131230763*/:
                    this.a[this.c].o = z;
                    break;
                case C0028R.id.radio_initial /*2131230820*/:
                    if (z) {
                        for (int i2 = 0; i2 < 80; i2++) {
                            this.a[i2].p = false;
                        }
                        this.a[this.c].p = true;
                        if (this.c == 4) {
                            t.b(getActivity(), 1, 3);
                            break;
                        }
                    }
                    break;
            }
            a();
        }
    }

    private void c() {
        this.l = this.h ? 24 : 1200;
        this.i = true;
        int i2 = this.l;
        boolean z = this.i;
        this.i = true;
        ((SeekBar) this.o.findViewById(C0028R.id.seek_splitangle)).setMax(i2);
        ((SeekBar) this.o.findViewById(C0028R.id.seek_child1_angle)).setMax(i2);
        ((SeekBar) this.o.findViewById(C0028R.id.seek_child2_angle)).setMax(i2);
        ((SeekBar) this.o.findViewById(C0028R.id.seek_red)).setMax(i2);
        ((SeekBar) this.o.findViewById(C0028R.id.seek_green)).setMax(i2);
        ((SeekBar) this.o.findViewById(C0028R.id.seek_blue)).setMax(i2);
        ((SeekBar) this.o.findViewById(C0028R.id.seek_stiff)).setMax(i2);
        ((SeekBar) this.o.findViewById(C0028R.id.seek_mass)).setMax(i2);
        ((SeekBar) this.o.findViewById(C0028R.id.seek_prio)).setMax(i2);
        ((SeekBar) this.o.findViewById(C0028R.id.seek_ratio)).setMax(i2);
        this.i = z;
        this.i = false;
        if (this.h) {
            d(this.c);
        }
    }

    private void d(int i2) {
        this.a[i2].d = a(this.a[i2].d, 0.0f, 6.2831855f);
        this.a[i2].e = a(this.a[i2].e, 0.0f, 6.2831855f);
        this.a[i2].f = a(this.a[i2].f, 0.0f, 6.2831855f);
        this.a[i2].a[0] = a(this.a[i2].a[0], 0.0f, 1.0f);
        this.a[i2].a[1] = a(this.a[i2].a[1], 0.0f, 1.0f);
        this.a[i2].a[2] = a(this.a[i2].a[2], 0.0f, 1.0f);
        this.a[i2].h = a(this.a[i2].h, 0.0f, 35.0f);
        this.a[i2].b = a(this.a[i2].b, 0.0648f, 0.3672f);
        this.a[i2].g = (float) Math.exp((double) a((float) Math.log((double) this.a[i2].g), (float) Math.log(0.10000000149011612d), (float) Math.log(10.0d)));
        this.a[i2].c = a(this.a[i2].c, 0.1f, 0.9f);
    }

    private static boolean a(double d2, double d3) {
        return d2 == d3;
    }

    private boolean d() {
        boolean z = true;
        for (int i2 = 0; i2 < 80; i2++) {
            z = z & a((double) this.a[i2].d, (double) a(this.a[i2].d, 0.0f, 6.2831855f)) & a((double) this.a[i2].e, (double) a(this.a[i2].e, 0.0f, 6.2831855f)) & a((double) this.a[i2].f, (double) a(this.a[i2].f, 0.0f, 6.2831855f)) & a((double) this.a[i2].a[0], (double) a(this.a[i2].a[0], 0.0f, 1.0f)) & a((double) this.a[i2].a[1], (double) a(this.a[i2].a[1], 0.0f, 1.0f)) & a((double) this.a[i2].a[2], (double) a(this.a[i2].a[2], 0.0f, 1.0f)) & a((double) this.a[i2].h, (double) a(this.a[i2].h, 0.0f, 35.0f)) & a((double) this.a[i2].b, (double) a(this.a[i2].b, 0.0648f, 0.3672f)) & a((double) this.a[i2].g, (double) ((float) Math.exp((double) a((float) Math.log((double) this.a[i2].g), (float) Math.log(0.10000000149011612d), (float) Math.log(10.0d))))) & a((double) this.a[i2].c, (double) a(this.a[i2].c, 0.1f, 0.9f));
            int i3 = 0;
            while (i3 < 7) {
                boolean a2 = a((double) this.a[i2].v[i3], (double) a(this.a[i2].v[i3], Gene.z[i3], Gene.A[i3])) & z;
                i3++;
                z = a2;
            }
            for (int i4 = 0; i4 < 11; i4++) {
                if (this.a[i2].t[i4].d == -1) {
                    z &= a((double) this.a[i2].t[i4].b, (double) a(this.a[i2].t[i4].b, -1.0f, 1.0f));
                }
            }
        }
        return z;
    }

    private static float a(float f2, float f3, float f4) {
        return (((f4 - f3) * ((float) Math.round(((f2 - f3) * 24.0f) / (f4 - f3)))) / 24.0f) + f3;
    }

    public final void onClick(View view) {
        switch (view.getId()) {
            case C0028R.id.button_load_dna /*2131230743*/:
                CharSequence[] charSequenceArr = new CharSequence[(g.a((Context) getActivity()).size() + 2)];
                String substring = String.format("%X", new Object[]{Integer.valueOf(getResources().getColor(C0028R.color.highlight))}).substring(2);
                charSequenceArr[0] = Html.fromHtml("<font color=\"#" + substring + "\">" + getActivity().getString(C0028R.string.menu_item_load_from_microscope) + "</font>");
                charSequenceArr[1] = Html.fromHtml("<font color=\"#" + substring + "\">" + getString(C0028R.string.gene_edit_default_genome) + "</font>");
                Iterator<String> it = g.a((Context) getActivity()).iterator();
                int i2 = 2;
                while (it.hasNext()) {
                    charSequenceArr[i2] = it.next();
                    i2++;
                }
                AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
                builder.setTitle(getString(C0028R.string.load));
                builder.setItems(charSequenceArr, new DialogInterface.OnClickListener() {
                    public final void onClick(DialogInterface dialogInterface, int i) {
                        i.this.b(i);
                    }
                });
                AlertDialog create = builder.create();
                create.show();
                create.findViewById(create.getContext().getResources().getIdentifier("android:id/titleDivider", (String) null, (String) null)).setBackgroundColor(getResources().getColor(C0028R.color.border));
                return;
            case C0028R.id.button_save_dna /*2131230747*/:
                AlertDialog.Builder builder2 = new AlertDialog.Builder(getActivity());
                builder2.setTitle(getActivity().getString(C0028R.string.dialog_titlte_save_genome));
                builder2.setMessage(getActivity().getString(C0028R.string.dialog_text_save_genome));
                final EditText editText = new EditText(getActivity());
                editText.setText(this.d);
                editText.setInputType(1);
                builder2.setView(editText);
                builder2.setPositiveButton(getActivity().getString(C0028R.string.dialog_button_save), new DialogInterface.OnClickListener() {
                    public final void onClick(DialogInterface dialogInterface, int i) {
                        i.this.d = editText.getText().toString();
                        i.a(i.this, g.a(i.this.d));
                    }
                });
                builder2.setNegativeButton(getActivity().getString(C0028R.string.dialog_button_cancel), new DialogInterface.OnClickListener() {
                    public final void onClick(DialogInterface dialogInterface, int i) {
                        dialogInterface.cancel();
                    }
                });
                builder2.show();
                return;
            case C0028R.id.seek_blue_text /*2131230877*/:
                a(getActivity().getString(C0028R.string.tip_title_blue), (CharSequence) getActivity().getString(C0028R.string.tip_blue));
                return;
            case C0028R.id.seek_child1_angle_text /*2131230879*/:
                a(getActivity().getString(C0028R.string.tip_title_child_1_angle), (CharSequence) getActivity().getString(C0028R.string.tip_child_1_angle));
                return;
            case C0028R.id.seek_child2_angle_text /*2131230881*/:
                a(getActivity().getString(C0028R.string.tip_title_child_2_angle), (CharSequence) getActivity().getString(C0028R.string.tip_child_2_angle));
                return;
            case C0028R.id.seek_green_text /*2131230883*/:
                a(getActivity().getString(C0028R.string.tip_title_green), (CharSequence) getActivity().getString(C0028R.string.tip_green));
                return;
            case C0028R.id.seek_mass_text /*2131230885*/:
                a(getActivity().getString(C0028R.string.tip_title_split_mass), (CharSequence) getActivity().getString(C0028R.string.tip_split_mass));
                return;
            case C0028R.id.seek_prio_text /*2131230888*/:
                a(getActivity().getString(C0028R.string.tip_title_priority), (CharSequence) getActivity().getString(C0028R.string.tip_priority));
                return;
            case C0028R.id.seek_red_text /*2131230891*/:
                this.g = true;
                a(getActivity().getString(C0028R.string.tip_title_red), (CharSequence) getActivity().getString(C0028R.string.tip_red));
                return;
            case C0028R.id.seek_splitangle_text /*2131230893*/:
                a(getActivity().getString(C0028R.string.tip_title_split_angle), (CharSequence) getActivity().getString(C0028R.string.tip_split_angle));
                return;
            case C0028R.id.seek_stiff_text /*2131230895*/:
                a(getActivity().getString(C0028R.string.tip_title_stiffness), (CharSequence) getActivity().getString(C0028R.string.tip_stiffness));
                return;
            case C0028R.id.spinner_child1_text /*2131230913*/:
                a(getActivity().getString(C0028R.string.tip_title_child_1_mode), (CharSequence) getActivity().getString(C0028R.string.tip_child_1_mdoe));
                return;
            case C0028R.id.spinner_child2_text /*2131230915*/:
                a(getActivity().getString(C0028R.string.tip_title_child_2_mode), (CharSequence) getActivity().getString(C0028R.string.tip_child_2_mode));
                return;
            case C0028R.id.text_edit_mode /*2131230932*/:
                a(getActivity().getString(C0028R.string.tip_title_edit_mode), (CharSequence) getActivity().getString(C0028R.string.tip_edit_mode));
                return;
            case C0028R.id.text_initial /*2131230934*/:
                a(getActivity().getString(C0028R.string.tip_title_intial_mode), (CharSequence) getActivity().getString(C0028R.string.tip_initial_mode));
                return;
            case C0028R.id.text_keep_glue1 /*2131230935*/:
                a(getActivity().getString(C0028R.string.tip_title_keep_adhesin_c1), (CharSequence) getActivity().getString(C0028R.string.tip_keep_adhesin_c1));
                return;
            case C0028R.id.text_keep_glue2 /*2131230936*/:
                a(getActivity().getString(C0028R.string.tip_title_keep_adhesin_c2), (CharSequence) getActivity().getString(C0028R.string.tip_keep_adhesin_c2));
                return;
            case C0028R.id.text_make_glue /*2131230937*/:
                a(getActivity().getString(C0028R.string.tip_title_adhesin), (CharSequence) getActivity().getString(C0028R.string.tip_adhesin));
                return;
            case C0028R.id.text_mirror1 /*2131230938*/:
                a(getActivity().getString(C0028R.string.tip_title_mirror_c1), (CharSequence) getActivity().getString(C0028R.string.tip_mirror_c1));
                return;
            case C0028R.id.text_mirror2 /*2131230939*/:
                a(getActivity().getString(C0028R.string.tip_title_mirror_c2), (CharSequence) getActivity().getString(C0028R.string.tip_mirror_c2));
                return;
            case C0028R.id.text_seek_ratio /*2131230946*/:
                a(getActivity().getString(C0028R.string.tip_title_split_ratio), (CharSequence) getActivity().getString(C0028R.string.tip_split_ratio));
                return;
            case C0028R.id.text_snap /*2131230947*/:
                a(getActivity().getString(C0028R.string.tip_title_snap), (CharSequence) getActivity().getString(C0028R.string.tip_snap));
                return;
            case C0028R.id.text_stay_alive /*2131230948*/:
                a(getActivity().getString(C0028R.string.tip_title_stay_alive), (CharSequence) getActivity().getString(C0028R.string.tip_stay_alive));
                return;
            case C0028R.id.text_types /*2131230954*/:
                a(getActivity().getString(C0028R.string.tip_title_cell_type), (CharSequence) Html.fromHtml(getActivity().getString(C0028R.string.tip_cell_type)));
                return;
            default:
                Iterator<e> it2 = this.q.iterator();
                while (it2.hasNext()) {
                    e next = it2.next();
                    if (view == next.e) {
                        a(next.c(), (CharSequence) next.j);
                        return;
                    }
                }
                return;
        }
    }

    private void a(String str, CharSequence charSequence) {
        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
        View inflate = getActivity().getLayoutInflater().inflate(C0028R.layout.help_dialog, (ViewGroup) null);
        ((TextView) inflate.findViewById(C0028R.id.text_title)).setText(str);
        ((TextView) inflate.findViewById(C0028R.id.text_help)).setText(charSequence);
        builder.setView(inflate);
        builder.setNeutralButton(getActivity().getString(C0028R.string.dialog_button_ok), new DialogInterface.OnClickListener() {
            public final void onClick(DialogInterface dialogInterface, int i) {
                if (i.this.g) {
                    t.b(i.this.getActivity(), 1, 4);
                }
                dialogInterface.cancel();
            }
        });
        builder.show();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0061, code lost:
        if (40 != 40) goto L_0x0063;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean b(int r13) {
        /*
            r12 = this;
            if (r13 != 0) goto L_0x0021
            com.saterskog.cell_lab.i$b r0 = r12.f
            com.saterskog.cell_lab.Gene[] r1 = r0.a()
            if (r1 != 0) goto L_0x0086
            android.app.Activity r0 = r12.getActivity()
            android.app.Activity r1 = r12.getActivity()
            r2 = 2131624346(0x7f0e019a, float:1.887587E38)
            java.lang.String r1 = r1.getString(r2)
            r2 = 1
            android.widget.Toast r0 = android.widget.Toast.makeText(r0, r1, r2)
            r0.show()
        L_0x0021:
            r0 = 1
            if (r13 != r0) goto L_0x0027
            r12.b()
        L_0x0027:
            r0 = 1
            if (r13 <= r0) goto L_0x0224
            android.app.Activity r0 = r12.getActivity()
            java.util.ArrayList r0 = com.saterskog.cell_lab.g.a((android.content.Context) r0)
            int r1 = r13 + -2
            java.lang.Object r0 = r0.get(r1)
            java.lang.String r0 = (java.lang.String) r0
            r12.d = r0
            java.lang.String r0 = r12.d
            java.lang.String r0 = com.saterskog.cell_lab.g.a((java.lang.String) r0)
            android.app.Activity r1 = r12.getActivity()     // Catch:{ IOException -> 0x0261 }
            java.io.FileInputStream r0 = r1.openFileInput(r0)     // Catch:{ IOException -> 0x0261 }
            java.io.ObjectInputStream r4 = new java.io.ObjectInputStream     // Catch:{ IOException -> 0x0261 }
            r4.<init>(r0)     // Catch:{ IOException -> 0x0261 }
            int r2 = r4.readInt()     // Catch:{ IOException -> 0x0261 }
            r0 = 3054(0xbee, float:4.28E-42)
            if (r2 > r0) goto L_0x0237
            r0 = 3054(0xbee, float:4.28E-42)
            if (r2 == r0) goto L_0x0063
            r0 = 80
            com.saterskog.cell_lab.Gene[] r5 = new com.saterskog.cell_lab.Gene[r0]     // Catch:{ IOException -> 0x0261 }
            r0 = 40
            if (r0 == r0) goto L_0x0069
        L_0x0063:
            r0 = 80
            com.saterskog.cell_lab.Gene[] r5 = new com.saterskog.cell_lab.Gene[r0]     // Catch:{ IOException -> 0x0261 }
            r0 = 80
        L_0x0069:
            r1 = 17
            if (r2 > r1) goto L_0x006f
            r0 = 20
        L_0x006f:
            r1 = 3
            if (r2 > r1) goto L_0x0074
            r0 = 15
        L_0x0074:
            r1 = 0
        L_0x0075:
            if (r1 >= r0) goto L_0x011a
            com.saterskog.cell_lab.Gene r3 = new com.saterskog.cell_lab.Gene     // Catch:{ IOException -> 0x0261 }
            r3.<init>()     // Catch:{ IOException -> 0x0261 }
            r5[r1] = r3     // Catch:{ IOException -> 0x0261 }
            r3 = r5[r1]     // Catch:{ IOException -> 0x0261 }
            r3.a(r4, r2)     // Catch:{ IOException -> 0x0261 }
            int r1 = r1 + 1
            goto L_0x0075
        L_0x0086:
            android.app.Activity r0 = r12.getActivity()
            r2 = 0
            r3 = 8
            com.saterskog.cell_lab.t.b(r0, r2, r3)
            r0 = 0
        L_0x0091:
            r2 = 80
            if (r0 >= r2) goto L_0x00a1
            com.saterskog.cell_lab.Gene[] r2 = r12.a
            r2 = r2[r0]
            r3 = r1[r0]
            r2.a((com.saterskog.cell_lab.Gene) r3)
            int r0 = r0 + 1
            goto L_0x0091
        L_0x00a1:
            java.util.ArrayList<com.saterskog.cell_lab.h> r0 = r12.e
            com.saterskog.cell_lab.h r1 = com.saterskog.cell_lab.h.NEUROCYTE
            boolean r0 = r0.contains(r1)
            if (r0 != 0) goto L_0x00bf
            java.util.ArrayList<com.saterskog.cell_lab.h> r0 = r12.e
            com.saterskog.cell_lab.h r1 = com.saterskog.cell_lab.h.STEREOCYTE
            boolean r0 = r0.contains(r1)
            if (r0 != 0) goto L_0x00bf
            java.util.ArrayList<com.saterskog.cell_lab.h> r0 = r12.e
            com.saterskog.cell_lab.h r1 = com.saterskog.cell_lab.h.SENSEOCYTE
            boolean r0 = r0.contains(r1)
            if (r0 == 0) goto L_0x00e1
        L_0x00bf:
            r0 = 1
            r1 = r0
        L_0x00c1:
            r2 = 1
            com.saterskog.cell_lab.Gene[] r4 = r12.a
            int r5 = r4.length
            r0 = 0
            r3 = r0
            r0 = r2
        L_0x00c8:
            if (r3 >= r5) goto L_0x00ff
            r6 = r4[r3]
            if (r1 != 0) goto L_0x00e4
            com.saterskog.cell_lab.Gene$a[] r7 = r6.t
            int r8 = r7.length
            r2 = 0
        L_0x00d2:
            if (r2 >= r8) goto L_0x00e4
            r9 = r7[r2]
            short r10 = r9.e
            if (r10 == 0) goto L_0x00de
            r0 = 0
            r9.e = r0
            r0 = 0
        L_0x00de:
            int r2 = r2 + 1
            goto L_0x00d2
        L_0x00e1:
            r0 = 0
            r1 = r0
            goto L_0x00c1
        L_0x00e4:
            java.util.ArrayList<com.saterskog.cell_lab.h> r2 = r12.e
            com.saterskog.cell_lab.h r7 = r6.s
            int r2 = r2.indexOf(r7)
            r7 = -1
            if (r2 != r7) goto L_0x00fb
            java.util.ArrayList<com.saterskog.cell_lab.h> r0 = r12.e
            r2 = 0
            java.lang.Object r0 = r0.get(r2)
            com.saterskog.cell_lab.h r0 = (com.saterskog.cell_lab.h) r0
            r6.s = r0
            r0 = 0
        L_0x00fb:
            int r2 = r3 + 1
            r3 = r2
            goto L_0x00c8
        L_0x00ff:
            if (r0 != 0) goto L_0x0021
            android.app.Activity r0 = r12.getActivity()
            android.app.Activity r1 = r12.getActivity()
            r2 = 2131624350(0x7f0e019e, float:1.8875877E38)
            java.lang.String r1 = r1.getString(r2)
            r2 = 1
            android.widget.Toast r0 = android.widget.Toast.makeText(r0, r1, r2)
            r0.show()
            goto L_0x0021
        L_0x011a:
            r1 = 0
        L_0x011b:
            int r2 = 80 - r0
            if (r1 >= r2) goto L_0x013c
            int r2 = r0 + r1
            com.saterskog.cell_lab.Gene r3 = new com.saterskog.cell_lab.Gene     // Catch:{ IOException -> 0x0261 }
            r3.<init>()     // Catch:{ IOException -> 0x0261 }
            r5[r2] = r3     // Catch:{ IOException -> 0x0261 }
            int r2 = r0 + r1
            r2 = r5[r2]     // Catch:{ IOException -> 0x0261 }
            r3 = 0
            r3 = r5[r3]     // Catch:{ IOException -> 0x0261 }
            r2.a((com.saterskog.cell_lab.Gene) r3)     // Catch:{ IOException -> 0x0261 }
            int r2 = r0 + r1
            r2 = r5[r2]     // Catch:{ IOException -> 0x0261 }
            r3 = 0
            r2.p = r3     // Catch:{ IOException -> 0x0261 }
            int r1 = r1 + 1
            goto L_0x011b
        L_0x013c:
            r2 = 1
            java.util.ArrayList<com.saterskog.cell_lab.h> r0 = r12.e     // Catch:{ IOException -> 0x0261 }
            com.saterskog.cell_lab.h r1 = com.saterskog.cell_lab.h.NEUROCYTE     // Catch:{ IOException -> 0x0261 }
            boolean r0 = r0.contains(r1)     // Catch:{ IOException -> 0x0261 }
            if (r0 != 0) goto L_0x015b
            java.util.ArrayList<com.saterskog.cell_lab.h> r0 = r12.e     // Catch:{ IOException -> 0x0261 }
            com.saterskog.cell_lab.h r1 = com.saterskog.cell_lab.h.STEREOCYTE     // Catch:{ IOException -> 0x0261 }
            boolean r0 = r0.contains(r1)     // Catch:{ IOException -> 0x0261 }
            if (r0 != 0) goto L_0x015b
            java.util.ArrayList<com.saterskog.cell_lab.h> r0 = r12.e     // Catch:{ IOException -> 0x0261 }
            com.saterskog.cell_lab.h r1 = com.saterskog.cell_lab.h.SENSEOCYTE     // Catch:{ IOException -> 0x0261 }
            boolean r0 = r0.contains(r1)     // Catch:{ IOException -> 0x0261 }
            if (r0 == 0) goto L_0x017d
        L_0x015b:
            r0 = 1
            r1 = r0
        L_0x015d:
            r0 = 0
            r3 = r0
        L_0x015f:
            r0 = 80
            if (r3 >= r0) goto L_0x019d
            r6 = r5[r3]     // Catch:{ IOException -> 0x0261 }
            if (r1 != 0) goto L_0x0180
            com.saterskog.cell_lab.Gene$a[] r7 = r6.t     // Catch:{ IOException -> 0x0261 }
            int r8 = r7.length     // Catch:{ IOException -> 0x0261 }
            r0 = 0
            r11 = r0
            r0 = r2
            r2 = r11
        L_0x016e:
            if (r2 >= r8) goto L_0x0181
            r9 = r7[r2]     // Catch:{ IOException -> 0x0261 }
            short r10 = r9.e     // Catch:{ IOException -> 0x0261 }
            if (r10 == 0) goto L_0x017a
            r0 = 0
            r9.e = r0     // Catch:{ IOException -> 0x0261 }
            r0 = 0
        L_0x017a:
            int r2 = r2 + 1
            goto L_0x016e
        L_0x017d:
            r0 = 0
            r1 = r0
            goto L_0x015d
        L_0x0180:
            r0 = r2
        L_0x0181:
            java.util.ArrayList<com.saterskog.cell_lab.h> r2 = r12.e     // Catch:{ IOException -> 0x0261 }
            com.saterskog.cell_lab.h r7 = r6.s     // Catch:{ IOException -> 0x0261 }
            int r2 = r2.indexOf(r7)     // Catch:{ IOException -> 0x0261 }
            r7 = -1
            if (r2 != r7) goto L_0x0198
            java.util.ArrayList<com.saterskog.cell_lab.h> r0 = r12.e     // Catch:{ IOException -> 0x0261 }
            r2 = 0
            java.lang.Object r0 = r0.get(r2)     // Catch:{ IOException -> 0x0261 }
            com.saterskog.cell_lab.h r0 = (com.saterskog.cell_lab.h) r0     // Catch:{ IOException -> 0x0261 }
            r6.s = r0     // Catch:{ IOException -> 0x0261 }
            r0 = 0
        L_0x0198:
            int r2 = r3 + 1
            r3 = r2
            r2 = r0
            goto L_0x015f
        L_0x019d:
            r0 = 0
            r1 = r0
            r0 = r2
        L_0x01a0:
            r2 = 80
            if (r1 >= r2) goto L_0x01c0
            r2 = r5[r1]     // Catch:{ IOException -> 0x0261 }
            java.util.ArrayList<com.saterskog.cell_lab.h> r3 = r12.e     // Catch:{ IOException -> 0x0261 }
            com.saterskog.cell_lab.h r6 = r2.s     // Catch:{ IOException -> 0x0261 }
            int r3 = r3.indexOf(r6)     // Catch:{ IOException -> 0x0261 }
            r6 = -1
            if (r3 != r6) goto L_0x01bd
            java.util.ArrayList<com.saterskog.cell_lab.h> r0 = r12.e     // Catch:{ IOException -> 0x0261 }
            r3 = 0
            java.lang.Object r0 = r0.get(r3)     // Catch:{ IOException -> 0x0261 }
            com.saterskog.cell_lab.h r0 = (com.saterskog.cell_lab.h) r0     // Catch:{ IOException -> 0x0261 }
            r2.s = r0     // Catch:{ IOException -> 0x0261 }
            r0 = 0
        L_0x01bd:
            int r1 = r1 + 1
            goto L_0x01a0
        L_0x01c0:
            r12.a = r5     // Catch:{ IOException -> 0x0261 }
            r1 = 0
            r2 = 0
        L_0x01c4:
            r3 = 80
            if (r2 >= r3) goto L_0x01dd
            if (r1 == 0) goto L_0x01d1
            com.saterskog.cell_lab.Gene[] r3 = r12.a     // Catch:{ IOException -> 0x0261 }
            r3 = r3[r2]     // Catch:{ IOException -> 0x0261 }
            r5 = 0
            r3.p = r5     // Catch:{ IOException -> 0x0261 }
        L_0x01d1:
            com.saterskog.cell_lab.Gene[] r3 = r12.a     // Catch:{ IOException -> 0x0261 }
            r3 = r3[r2]     // Catch:{ IOException -> 0x0261 }
            boolean r3 = r3.p     // Catch:{ IOException -> 0x0261 }
            if (r3 == 0) goto L_0x01da
            r1 = 1
        L_0x01da:
            int r2 = r2 + 1
            goto L_0x01c4
        L_0x01dd:
            if (r1 != 0) goto L_0x01e7
            com.saterskog.cell_lab.Gene[] r1 = r12.a     // Catch:{ IOException -> 0x0261 }
            r2 = 0
            r1 = r1[r2]     // Catch:{ IOException -> 0x0261 }
            r2 = 1
            r1.p = r2     // Catch:{ IOException -> 0x0261 }
        L_0x01e7:
            android.app.Activity r1 = r12.getActivity()     // Catch:{ IOException -> 0x0261 }
            android.app.Activity r2 = r12.getActivity()     // Catch:{ IOException -> 0x0261 }
            r3 = 2131624344(0x7f0e0198, float:1.8875865E38)
            java.lang.String r2 = r2.getString(r3)     // Catch:{ IOException -> 0x0261 }
            r3 = 1
            android.widget.Toast r1 = android.widget.Toast.makeText(r1, r2, r3)     // Catch:{ IOException -> 0x0261 }
            r1.show()     // Catch:{ IOException -> 0x0261 }
            if (r0 != 0) goto L_0x0217
            android.app.Activity r0 = r12.getActivity()     // Catch:{ IOException -> 0x0261 }
            android.app.Activity r1 = r12.getActivity()     // Catch:{ IOException -> 0x0261 }
            r2 = 2131624350(0x7f0e019e, float:1.8875877E38)
            java.lang.String r1 = r1.getString(r2)     // Catch:{ IOException -> 0x0261 }
            r2 = 1
            android.widget.Toast r0 = android.widget.Toast.makeText(r0, r1, r2)     // Catch:{ IOException -> 0x0261 }
            r0.show()     // Catch:{ IOException -> 0x0261 }
        L_0x0217:
            android.app.Activity r0 = r12.getActivity()     // Catch:{ IOException -> 0x0261 }
            com.saterskog.cell_lab.PlayActivity r0 = (com.saterskog.cell_lab.PlayActivity) r0     // Catch:{ IOException -> 0x0261 }
            r1 = 7
            r0.a((short) r1)     // Catch:{ IOException -> 0x0261 }
        L_0x0221:
            r4.close()     // Catch:{ IOException -> 0x0261 }
        L_0x0224:
            boolean r0 = r12.d()
            r12.h = r0
            r12.c()
            r12.a()
            r0 = 1
            r1 = 1
            r12.a((boolean) r0, (boolean) r1)
            r0 = 0
            return r0
        L_0x0237:
            android.app.Activity r0 = r12.getActivity()     // Catch:{ IOException -> 0x0261 }
            android.app.Activity r1 = r12.getActivity()     // Catch:{ IOException -> 0x0261 }
            r2 = 2131624342(0x7f0e0196, float:1.887586E38)
            java.lang.String r1 = r1.getString(r2)     // Catch:{ IOException -> 0x0261 }
            r2 = 1
            android.widget.Toast r1 = android.widget.Toast.makeText(r0, r1, r2)     // Catch:{ IOException -> 0x0261 }
            android.view.View r0 = r1.getView()     // Catch:{ IOException -> 0x0261 }
            r2 = 16908299(0x102000b, float:2.387726E-38)
            android.view.View r0 = r0.findViewById(r2)     // Catch:{ IOException -> 0x0261 }
            android.widget.TextView r0 = (android.widget.TextView) r0     // Catch:{ IOException -> 0x0261 }
            r2 = -65536(0xffffffffffff0000, float:NaN)
            r0.setTextColor(r2)     // Catch:{ IOException -> 0x0261 }
            r1.show()     // Catch:{ IOException -> 0x0261 }
            goto L_0x0221
        L_0x0261:
            r0 = move-exception
            r1 = r0
            android.app.Activity r0 = r12.getActivity()
            java.lang.String r2 = "IOException"
            r3 = 1
            android.widget.Toast r2 = android.widget.Toast.makeText(r0, r2, r3)
            android.view.View r0 = r2.getView()
            r3 = 16908299(0x102000b, float:2.387726E-38)
            android.view.View r0 = r0.findViewById(r3)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r3 = -65536(0xffffffffffff0000, float:NaN)
            r0.setTextColor(r3)
            r2.show()
            java.lang.String r0 = "hmmm, dsf"
            com.saterskog.b.a.a((java.lang.String) r0)
            com.saterskog.b.a.a((java.lang.Throwable) r1)
            goto L_0x0224
        */
        throw new UnsupportedOperationException("Method not decompiled: com.saterskog.cell_lab.i.b(int):boolean");
    }

    static /* synthetic */ void a(i iVar, String str) {
        try {
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(new BufferedOutputStream(iVar.getActivity().openFileOutput(str, 0)));
            objectOutputStream.writeInt(3054);
            for (int i2 = 0; i2 < 80; i2++) {
                iVar.a[i2].a(objectOutputStream);
            }
            objectOutputStream.close();
            Toast.makeText(iVar.getActivity(), iVar.getActivity().getString(C0028R.string.toast_saved), 1).show();
            ((PlayActivity) iVar.getActivity()).a(7);
        } catch (IllegalArgumentException e2) {
            Toast makeText = Toast.makeText(iVar.getActivity(), iVar.getActivity().getString(C0028R.string.toast_bad_name), 1);
            ((TextView) makeText.getView().findViewById(16908299)).setTextColor(-65536);
            makeText.show();
            ((PlayActivity) iVar.getActivity()).a(1);
        } catch (IOException e3) {
            e3.printStackTrace();
        }
    }
}
