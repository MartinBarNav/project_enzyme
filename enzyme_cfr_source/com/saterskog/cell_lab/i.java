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
import android.os.Parcelable;
import android.preference.PreferenceManager;
import android.text.Html;
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
import android.widget.SpinnerAdapter;
import android.widget.TextView;
import android.widget.Toast;
import com.saterskog.cell_lab.Gene;
import com.saterskog.cell_lab.GenomePreviewView;
import com.saterskog.cell_lab.PlayActivity;
import com.saterskog.cell_lab.g;
import com.saterskog.cell_lab.h;
import com.saterskog.cell_lab.j;
import com.saterskog.cell_lab.n;
import com.saterskog.cell_lab.t;
import java.io.BufferedOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Iterator;

public final class i
extends Fragment
implements View.OnClickListener,
AdapterView.OnItemSelectedListener,
CompoundButton.OnCheckedChangeListener,
SeekBar.OnSeekBarChangeListener,
com.saterskog.cell_lab.c {
    Gene[] a;
    Button b;
    int c = 0;
    protected String d;
    ArrayList<h> e = new ArrayList();
    public b f;
    private boolean g = false;
    private boolean h;
    private boolean i = false;
    private boolean j = false;
    private boolean k;
    private int l;
    private GenomePreviewView m;
    private double n;
    private View o;
    private a p;
    private ArrayList<e> q;

    public i() {
        for (h h2 : com.saterskog.cell_lab.h.B) {
            this.e.add(h2);
        }
        this.q = new ArrayList();
    }

    private static float a(float f2, float f3, float f4) {
        return (f4 - f3) * (float)Math.round((f2 - f3) * 24.0f / (f4 - f3)) / 24.0f + f3;
    }

    private ArrayAdapter a(final boolean bl, String[] arrstring) {
        return new ArrayAdapter<String>((Context)this.getActivity(), arrstring){

            public final View getDropDownView(int n2, View view, final ViewGroup viewGroup) {
                View view2 = super.getDropDownView(n2, view, viewGroup);
                final TextView textView = (TextView)view2;
                i.this.a(textView, n2);
                textView.setTextSize(16.0f);
                if (view == null && bl) {
                    view2.setLongClickable(true);
                    view2.setOnLongClickListener(new View.OnLongClickListener(){

                        public final boolean onLongClick(View object) {
                            String string = textView.getText().toString();
                            final int n2 = string.lastIndexOf(" ");
                            object = string;
                            if (n2 != -1) {
                                object = string.substring(0, n2);
                            }
                            n2 = Integer.parseInt(((String)object).substring(1)) - 1;
                            String string2 = i.this.getString(2131624110) + " " + i.this.getString(2131624117) + (n2 + 1);
                            string = i.this.getString(2131624106) + " " + i.this.getString(2131624117) + (i.this.c + 1) + i.this.getString(2131624107) + " M" + (n2 + 1);
                            AlertDialog.Builder builder = new AlertDialog.Builder((Context)i.this.getActivity());
                            object = new DialogInterface.OnClickListener(){

                                /*
                                 * Enabled aggressive block sorting
                                 */
                                public final void onClick(DialogInterface dialogInterface, int n22) {
                                    if (n22 == 0) {
                                        i.this.c(n2);
                                    } else {
                                        boolean bl = i.this.a[n2].p;
                                        i.this.a[n2].a(i.this.a[i.this.c]);
                                        i.this.a[n2].p = bl;
                                    }
                                    i.this.a(true, true);
                                    i.this.a();
                                    dialogInterface = viewGroup.getRootView();
                                    dialogInterface.dispatchKeyEvent(new KeyEvent(0, 4));
                                    dialogInterface.dispatchKeyEvent(new KeyEvent(1, 4));
                                }
                            };
                            builder.setItems((CharSequence[])new String[]{string2, string}, (DialogInterface.OnClickListener)object);
                            builder.show();
                            return false;
                        }
                    });
                    view2.setClickable(true);
                    view2.setOnClickListener(new View.OnClickListener(){

                        public final void onClick(View object) {
                            String string = textView.getText().toString();
                            int n2 = string.lastIndexOf(" ");
                            object = string;
                            if (n2 != -1) {
                                object = string.substring(0, n2);
                            }
                            n2 = Integer.parseInt(((String)object).substring(1)) - 1;
                            com.saterskog.b.a.b("name=" + (String)object);
                            com.saterskog.b.a.b("pos=" + n2);
                            ((Spinner)i.this.o.findViewById(2131230911)).setSelection(n2);
                            object = viewGroup.getRootView();
                            object.dispatchKeyEvent(new KeyEvent(0, 4));
                            object.dispatchKeyEvent(new KeyEvent(1, 4));
                        }
                    });
                }
                return view2;
            }

            public final View getView(int n2, View view, ViewGroup viewGroup) {
                view = super.getView(n2, view, viewGroup);
                viewGroup = (TextView)view;
                i.this.a((TextView)viewGroup, n2);
                return view;
            }
        };
    }

    /*
     * Enabled aggressive block sorting
     */
    private void a(int n2, double d2) {
        SeekBar seekBar = (SeekBar)this.getActivity().findViewById(n2);
        if (seekBar != null) {
            n2 = this.h && n2 != 2131230896 ? 24 : 1200;
            seekBar.setProgress(Math.round((float)((double)n2 * d2)));
            seekBar = (TextView)this.getActivity().findViewById(2131230952);
            if (seekBar != null) {
                seekBar.setText((CharSequence)"");
            }
        }
    }

    private void a(int n2, int n3) {
        Spinner spinner = (Spinner)this.getActivity().findViewById(n2);
        if (spinner != null) {
            spinner.setSelection(n3, true);
        }
    }

    private void a(View view, int n2) {
        ((Spinner)view.findViewById(n2)).setOnItemSelectedListener((AdapterView.OnItemSelectedListener)this);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    static /* synthetic */ void a(i i2, String object) {
        object = i2.getActivity().openFileOutput((String)object, 0);
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream((OutputStream)object);
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(bufferedOutputStream);
        objectOutputStream.writeInt(3054);
        for (int i3 = 0; i3 < 80; ++i3) {
            i2.a[i3].a(objectOutputStream);
            continue;
        }
        try {
            objectOutputStream.close();
            Toast.makeText((Context)i2.getActivity(), (CharSequence)i2.getActivity().getString(2131624349), (int)1).show();
            ((PlayActivity)i2.getActivity()).a((short)7);
            return;
        }
        catch (IllegalArgumentException illegalArgumentException) {
            Toast toast = Toast.makeText((Context)i2.getActivity(), (CharSequence)i2.getActivity().getString(2131624339), (int)1);
            ((TextView)toast.getView().findViewById(16908299)).setTextColor(-65536);
            toast.show();
            ((PlayActivity)i2.getActivity()).a((short)1);
            return;
        }
        catch (IOException iOException) {
            iOException.printStackTrace();
            return;
        }
    }

    private void a(String string, CharSequence charSequence) {
        AlertDialog.Builder builder = new AlertDialog.Builder((Context)this.getActivity());
        View view = this.getActivity().getLayoutInflater().inflate(2131361829, null);
        ((TextView)view.findViewById(2131230953)).setText((CharSequence)string);
        ((TextView)view.findViewById(2131230933)).setText(charSequence);
        builder.setView(view);
        builder.setNeutralButton((CharSequence)this.getActivity().getString(2131624029), new DialogInterface.OnClickListener(){

            public final void onClick(DialogInterface dialogInterface, int n2) {
                if (i.this.g) {
                    t.b(i.this.getActivity(), 1, 4);
                }
                dialogInterface.cancel();
            }
        });
        builder.show();
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private static boolean a(double d2, double d3) {
        if (d2 != d3) return false;
        return true;
    }

    /*
     * Enabled aggressive block sorting
     */
    private void b() {
        int n2;
        int n3 = 0;
        for (n2 = 0; n2 < 80; ++n2) {
            this.c(n2);
        }
        this.a[4].a[0] = 0.1f;
        this.a[4].a[1] = 0.9f;
        this.a[5].a[0] = 0.1f;
        this.a[6].a[0] = 0.5f;
        if (com.saterskog.b.d.a.nextInt(1) == 0) {
            this.a[1].a[0] = 0.1f;
            this.a[2].a[0] = 0.9f;
            n2 = n3;
        } else {
            this.a[1].a[0] = 0.9f;
            this.a[2].a[0] = 0.1f;
            n2 = n3;
        }
        while (n2 < 80) {
            this.d(n2);
            ++n2;
        }
        return;
    }

    private void b(int n2, boolean bl) {
        CheckBox checkBox = (CheckBox)this.getActivity().findViewById(n2);
        if (checkBox != null) {
            checkBox.setChecked(bl);
        }
    }

    private void b(View view, int n2) {
        ((Button)view.findViewById(n2)).setOnClickListener((View.OnClickListener)this);
    }

    /*
     * Enabled aggressive block sorting
     */
    private void c() {
        int n2 = this.h ? 24 : 1200;
        this.l = n2;
        this.i = true;
        n2 = this.l;
        boolean bl = this.i;
        this.i = true;
        ((SeekBar)this.o.findViewById(2131230892)).setMax(n2);
        ((SeekBar)this.o.findViewById(2131230878)).setMax(n2);
        ((SeekBar)this.o.findViewById(2131230880)).setMax(n2);
        ((SeekBar)this.o.findViewById(2131230890)).setMax(n2);
        ((SeekBar)this.o.findViewById(2131230882)).setMax(n2);
        ((SeekBar)this.o.findViewById(2131230876)).setMax(n2);
        ((SeekBar)this.o.findViewById(2131230894)).setMax(n2);
        ((SeekBar)this.o.findViewById(2131230884)).setMax(n2);
        ((SeekBar)this.o.findViewById(2131230887)).setMax(n2);
        ((SeekBar)this.o.findViewById(2131230889)).setMax(n2);
        this.i = bl;
        this.i = false;
        if (this.h) {
            this.d(this.c);
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    private void c(int n2) {
        int n3;
        this.a[n2] = new Gene();
        this.a[n2].b = 0.25199997f;
        this.a[n2].a[0] = (float)com.saterskog.b.d.a.nextDouble();
        this.a[n2].a[1] = (float)com.saterskog.b.d.a.nextDouble();
        this.a[n2].a[2] = (float)com.saterskog.b.d.a.nextDouble();
        float f2 = (float)Math.sqrt(this.a[n2].a[0] * this.a[n2].a[0] + this.a[n2].a[1] * this.a[n2].a[1] + this.a[n2].a[2] * this.a[n2].a[2]);
        float[] arrf = this.a[n2].a;
        arrf[0] = arrf[0] / f2;
        float[] arrf2 = this.a[n2].a;
        arrf2[1] = arrf2[1] / f2;
        float[] arrf3 = this.a[n2].a;
        arrf3[2] = arrf3[2] / f2;
        this.a[n2].d = 0.0f;
        this.a[n2].c = 0.5f;
        this.a[n2].e = 0.0f;
        this.a[n2].f = 0.0f;
        this.a[n2].g = 1.0f;
        this.a[n2].s = this.e.get(0);
        this.a[n2].i = n2;
        this.a[n2].j = n2;
        this.a[n2].l = false;
        this.a[n2].m = true;
        this.a[n2].n = true;
        this.a[n2].o = true;
        Gene gene = this.a[n2];
        boolean bl = n2 == 0;
        gene.p = bl;
        for (n3 = 0; n3 < 11; ++n3) {
            this.a[n2].t[n3].e = (short)(false ? 1 : 0);
            this.a[n2].t[n3].d = (short)(false ? 1 : 0);
            this.a[n2].t[n3].a = 0.0f;
            this.a[n2].t[n3].b = 0.0f;
            this.a[n2].t[n3].c = 0.0f;
        }
        this.a[n2].t[0].b = com.saterskog.cell_lab.i.a(-0.19999999f, -1.0f, 1.0f);
        n3 = 0;
        while (true) {
            if (n3 >= 11) {
                this.a[n2].u[0] = n2;
                this.a[n2].u[1] = n2;
                this.a[n2].v[6] = 1.0f;
                this.a[n2].u[9] = Gene.w[9] - 1;
                return;
            }
            this.a[n2].u[n3] = 0;
            ++n3;
        }
    }

    private void c(View view, int n2) {
        if ((view = (TextView)view.findViewById(n2)) != null) {
            view.setClickable(true);
            view.setOnClickListener((View.OnClickListener)this);
            view.setPaintFlags(view.getPaintFlags() | 8);
        }
    }

    private void d(int n2) {
        this.a[n2].d = com.saterskog.cell_lab.i.a(this.a[n2].d, 0.0f, (float)Math.PI * 2);
        this.a[n2].e = com.saterskog.cell_lab.i.a(this.a[n2].e, 0.0f, (float)Math.PI * 2);
        this.a[n2].f = com.saterskog.cell_lab.i.a(this.a[n2].f, 0.0f, (float)Math.PI * 2);
        this.a[n2].a[0] = com.saterskog.cell_lab.i.a(this.a[n2].a[0], 0.0f, 1.0f);
        this.a[n2].a[1] = com.saterskog.cell_lab.i.a(this.a[n2].a[1], 0.0f, 1.0f);
        this.a[n2].a[2] = com.saterskog.cell_lab.i.a(this.a[n2].a[2], 0.0f, 1.0f);
        this.a[n2].h = com.saterskog.cell_lab.i.a(this.a[n2].h, 0.0f, 35.0f);
        this.a[n2].b = com.saterskog.cell_lab.i.a(this.a[n2].b, 0.0648f, 0.3672f);
        this.a[n2].g = (float)Math.exp(com.saterskog.cell_lab.i.a((float)Math.log(this.a[n2].g), (float)Math.log(0.1f), (float)Math.log(10.0)));
        this.a[n2].c = com.saterskog.cell_lab.i.a(this.a[n2].c, 0.1f, 0.9f);
    }

    private void d(View view, int n2) {
        ((SeekBar)view.findViewById(n2)).setOnSeekBarChangeListener((SeekBar.OnSeekBarChangeListener)this);
    }

    private boolean d() {
        boolean bl = true;
        for (int i2 = 0; i2 < 80; ++i2) {
            boolean bl2;
            int n2;
            bl = bl & com.saterskog.cell_lab.i.a(this.a[i2].d, com.saterskog.cell_lab.i.a(this.a[i2].d, 0.0f, (float)Math.PI * 2)) & com.saterskog.cell_lab.i.a(this.a[i2].e, com.saterskog.cell_lab.i.a(this.a[i2].e, 0.0f, (float)Math.PI * 2)) & com.saterskog.cell_lab.i.a(this.a[i2].f, com.saterskog.cell_lab.i.a(this.a[i2].f, 0.0f, (float)Math.PI * 2)) & com.saterskog.cell_lab.i.a(this.a[i2].a[0], com.saterskog.cell_lab.i.a(this.a[i2].a[0], 0.0f, 1.0f)) & com.saterskog.cell_lab.i.a(this.a[i2].a[1], com.saterskog.cell_lab.i.a(this.a[i2].a[1], 0.0f, 1.0f)) & com.saterskog.cell_lab.i.a(this.a[i2].a[2], com.saterskog.cell_lab.i.a(this.a[i2].a[2], 0.0f, 1.0f)) & com.saterskog.cell_lab.i.a(this.a[i2].h, com.saterskog.cell_lab.i.a(this.a[i2].h, 0.0f, 35.0f)) & com.saterskog.cell_lab.i.a(this.a[i2].b, com.saterskog.cell_lab.i.a(this.a[i2].b, 0.0648f, 0.3672f)) & com.saterskog.cell_lab.i.a(this.a[i2].g, (float)Math.exp(com.saterskog.cell_lab.i.a((float)Math.log(this.a[i2].g), (float)Math.log(0.1f), (float)Math.log(10.0)))) & com.saterskog.cell_lab.i.a(this.a[i2].c, com.saterskog.cell_lab.i.a(this.a[i2].c, 0.1f, 0.9f));
            for (n2 = 0; n2 < 7; ++n2) {
                bl2 = com.saterskog.cell_lab.i.a(this.a[i2].v[n2], com.saterskog.cell_lab.i.a(this.a[i2].v[n2], Gene.z[n2], Gene.A[n2]));
                bl = bl2 & bl;
            }
            for (n2 = 0; n2 < 11; ++n2) {
                bl2 = bl;
                if (this.a[i2].t[n2].d == -1) {
                    bl2 = bl & com.saterskog.cell_lab.i.a(this.a[i2].t[n2].b, com.saterskog.cell_lab.i.a(this.a[i2].t[n2].b, -1.0f, 1.0f));
                }
                bl = bl2;
            }
        }
        return bl;
    }

    private void e(View view, int n2) {
        ((CheckBox)view.findViewById(n2)).setOnCheckedChangeListener((CompoundButton.OnCheckedChangeListener)this);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    final float a(int n2, boolean bl) {
        float f2 = 0.0f;
        if (!bl) {
            if (n2 != this.l / 2) return (float)(Math.pow(97.00586700439453, ((float)Math.abs(n2 - this.l / 2) - 1.0f) / ((float)this.l / 2.0f - 1.0f)) * 0.08246923983097076 * (double)Math.signum(n2 - this.l / 2));
            return f2;
        }
        if (n2 == 0) return f2;
        return (float)(Math.pow(97.00586700439453, ((float)n2 - 1.0f) / ((float)this.l - 1.0f)) * 0.08246923983097076);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    final int a(float f2, boolean bl) {
        if (!bl) {
            if (f2 != 0.0f) return (int)Math.round((double)(this.l / 2) + (Math.log(Math.abs(f2) / 0.08246924f) / Math.log(97.00586700439453) * (double)((float)this.l / 2.0f - 1.0f) + 1.0) * (double)Math.signum(f2));
            return this.l / 2;
        }
        if (f2 != 0.0f) return (int)Math.round(Math.log((double)(8.0f + f2) * 0.5 / 0.08246923983097076) / Math.log(97.00586700439453) * (double)((float)this.l - 1.0f) + 1.0);
        return 0;
    }

    /*
     * Enabled aggressive block sorting
     */
    final void a() {
        if (!this.i) {
            Object object;
            if (this.m != null) {
                GenomePreviewView genomePreviewView = this.m;
                Gene[] arrgene = this.a;
                int n2 = this.c;
                double d2 = this.n;
                object = new Gene[80];
                for (int i2 = 0; i2 < 80; ++i2) {
                    object[i2] = new Gene(arrgene[i2]);
                }
                genomePreviewView.queueEvent(new Runnable((Gene[])object, n2, d2){
                    final /* synthetic */ Gene[] a;
                    final /* synthetic */ int b;
                    final /* synthetic */ double c;
                    {
                        this.a = arrgene;
                        this.b = n2;
                        this.c = d2;
                    }

                    @Override
                    public final void run() {
                        n n2 = GenomePreviewView.this.a;
                        Gene[] arrgene = this.a;
                        int n3 = this.b;
                        n2.u = this.c;
                        n2.w = n3;
                        n2.v = arrgene;
                        n2.t = false;
                    }
                });
                genomePreviewView.requestRender();
            }
            if ((object = this.getActivity()) != null) {
                if ((object = (Spinner)object.findViewById(2131230911)) != null) {
                    this.a((TextView)object.getSelectedView(), this.c);
                }
                if ((object = (Spinner)this.getActivity().findViewById(2131230912)) != null && this.c == this.a[this.c].i) {
                    this.a((TextView)object.getSelectedView(), this.c);
                }
                if ((object = (Spinner)this.getActivity().findViewById(2131230914)) != null && this.c == this.a[this.c].j) {
                    this.a((TextView)object.getSelectedView(), this.c);
                }
                for (e e2 : this.q) {
                    if (!(e2 instanceof c) || e2.h != 0 && e2.h != 1) continue;
                    c c2 = (c)e2;
                    if (c2.a == null || this.c != this.a[this.c].u[c2.h]) continue;
                    this.a((TextView)c2.a.getSelectedView(), this.c);
                }
            }
        }
    }

    @Override
    public final void a(final int n2) {
        this.getActivity().runOnUiThread(new Runnable(){

            @Override
            public final void run() {
                i.this.c = n2;
                i.this.a(true, true);
                i.this.a();
            }
        });
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    final void a(TextView textView, int n2) {
        block4: {
            block3: {
                if (textView == null) break block3;
                textView.setTextColor(Color.rgb((int)Math.min(255, Math.max(0, (int)((double)this.a[n2].a[0] * 256.0))), (int)Math.min(255, Math.max(0, (int)((double)this.a[n2].a[1] * 256.0))), (int)Math.min(255, Math.max(0, (int)((double)this.a[n2].a[2] * 256.0)))));
                if (!this.k) break block4;
                textView.setText((CharSequence)(this.getString(2131624117) + (n2 + 1) + " " + this.getResources().getStringArray(2130837506)[this.a[n2].s.ordinal()]));
            }
            return;
        }
        textView.setText((CharSequence)(this.getString(2131624117) + (n2 + 1)));
    }

    /*
     * Enabled aggressive block sorting
     */
    public final void a(boolean bl, boolean bl2) {
        if (this.i) {
            return;
        }
        this.j = true;
        RadioButton radioButton = this.q.iterator();
        while (radioButton.hasNext()) {
            radioButton.next().b();
        }
        if (this.n < 12.0) {
            this.a(2131230896, this.n * 0.25 / 6.0);
        } else {
            this.a(2131230896, (this.n - 6.0) * 0.25 / 42.0 + 0.5);
        }
        this.a(2131230890, this.a[this.c].a[0]);
        this.a(2131230882, this.a[this.c].a[1]);
        this.a(2131230876, this.a[this.c].a[2]);
        this.a(2131230878, (double)this.a[this.c].e / (Math.PI * 2));
        this.a(2131230880, (double)this.a[this.c].f / (Math.PI * 2));
        this.a(2131230884, (this.a[this.c].b - 0.0648f) / 0.3024f);
        this.a(2131230887, Math.log((double)this.a[this.c].g / (double)0.1f) / Math.log(99.99999850988391));
        this.a(2131230889, 1.0 - (double)((this.a[this.c].c - 0.1f) / 0.8f));
        this.a(2131230892, (double)this.a[this.c].d / (Math.PI * 2));
        this.a(2131230894, this.a[this.c].h / 35.0f);
        if (bl2) {
            this.a(2131230911, this.c);
        }
        if (bl) {
            this.a(2131230918, this.e.indexOf((Object)this.a[this.c].s));
        }
        this.a(2131230912, this.a[this.c].i);
        this.a(2131230914, this.a[this.c].j);
        this.b(2131230759, this.a[this.c].l);
        this.b(2131230763, this.a[this.c].o);
        this.b(2131230757, this.a[this.c].m);
        this.b(2131230758, this.a[this.c].n);
        this.b(2131230760, this.a[this.c].q);
        this.b(2131230761, this.a[this.c].r);
        this.b(2131230762, this.h);
        radioButton = (RadioButton)this.getActivity().findViewById(2131230820);
        if (radioButton != null) {
            radioButton.setChecked(this.a[this.c].p);
        }
        if ((radioButton = (SeekBar)this.getActivity().findViewById(2131230894)) != null) {
            radioButton.setEnabled(this.a[this.c].l);
        }
        if (this.p != null) {
            this.p.a(this.a[this.c].l);
        }
        if (this.b != null) {
            radioButton = this.b;
            int n2 = this.a[this.c].s == com.saterskog.cell_lab.h.n ? 0 : 8;
            radioButton.setVisibility(n2);
        }
        this.j = false;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    public final boolean b(int var1_1) {
        block35: {
            block36: {
                block40: {
                    block38: {
                        block39: {
                            if (var1_1 != 0) break block38;
                            var2_2 = this.f.a();
                            if (var2_2 == null) break block39;
                            t.b(this.getActivity(), 0, 8);
                            for (var5_6 = 0; var5_6 < 80; ++var5_6) {
                                this.a[var5_6].a(var2_2[var5_6]);
                            }
                            var7_8 = this.e.contains((Object)com.saterskog.cell_lab.h.n) != false || this.e.contains((Object)com.saterskog.cell_lab.h.k) != false || this.e.contains((Object)com.saterskog.cell_lab.h.l) != false ? 1 : 0;
                            var8_9 = this.a;
                            var9_12 = var8_9.length;
                            var5_6 = 1;
                            break block40;
                        }
                        Toast.makeText((Context)this.getActivity(), (CharSequence)this.getActivity().getString(2131624346), (int)1).show();
                    }
lbl16:
                    // 3 sources

                    while (true) {
                        block41: {
                            if (var1_1 == 1) {
                                this.b();
                            }
                            if (var1_1 <= 1) break block35;
                            this.d = com.saterskog.cell_lab.g.a((Context)this.getActivity()).get(var1_1 - 2);
                            var2_2 = com.saterskog.cell_lab.g.a(this.d);
                            var2_2 = this.getActivity().openFileInput((String)var2_2);
                            var3_4 = new ObjectInputStream((InputStream)var2_2);
                            var4_5 = var3_4.readInt();
                            if (var4_5 <= 3054) break block41;
                            var2_2 = Toast.makeText((Context)this.getActivity(), (CharSequence)this.getActivity().getString(2131624342), (int)1);
                            ((TextView)var2_2.getView().findViewById(16908299)).setTextColor(-65536);
                            var2_2.show();
                        }
                        if (var4_5 != 3054) {
                            var2_2 = new Gene[80];
                            var1_1 = 40;
                        } else {
                            var2_2 = new Gene[80];
                            var1_1 = 80;
                        }
                        if (var4_5 <= 17) {
                            var1_1 = 20;
                        }
                        if (var4_5 <= 3) {
                            var1_1 = 15;
                        }
                        for (var5_6 = 0; var5_6 < var1_1; ++var5_6) {
                            var2_2[var5_6] = var6_7 = new Gene();
                            var2_2[var5_6].a((ObjectInputStream)var3_4, var4_5);
                        }
                        break block36;
                        break;
                    }
                }
                for (var10_13 = 0; var10_13 < var9_12; ++var10_13) {
                    var2_2 = var8_9[var10_13];
                    var4_5 = var5_6;
                    if (var7_8 == 0) {
                        var6_7 = var2_2.t;
                        var11_14 = var6_7.length;
                        var12_15 = 0;
                        while (true) {
                            var4_5 = var5_6;
                            if (var12_15 >= var11_14) break;
                            var3_4 = var6_7[var12_15];
                            if (var3_4.e != 0) {
                                var3_4.e = (short)(false ? 1 : 0);
                                var5_6 = 0;
                            }
                            ++var12_15;
                        }
                    }
                    var5_6 = var4_5;
                    if (this.e.indexOf((Object)var2_2.s) != -1) continue;
                    var2_2.s = this.e.get(0);
                    var5_6 = 0;
                }
                if (var5_6 != 0)
                Toast.makeText((Context)this.getActivity(), (CharSequence)this.getActivity().getString(2131624350), (int)1).show();
                ** while (true)
            }
            for (var5_6 = 0; var5_6 < 80 - var1_1; ++var5_6) {
                var2_2[var1_1 + var5_6] = var6_7 = new Gene();
                var2_2[var1_1 + var5_6].a((Gene)var2_2[0]);
                var2_2[var1_1 + var5_6].p = false;
                continue;
            }
            var1_1 = 1;
            var4_5 = this.e.contains((Object)com.saterskog.cell_lab.h.n) != false || this.e.contains((Object)com.saterskog.cell_lab.h.k) != false || this.e.contains((Object)com.saterskog.cell_lab.h.l) != false ? 1 : 0;
            var7_8 = 0;
            while (true) {
                block42: {
                    block37: {
                        if (var7_8 >= 80) break;
                        var13_16 = var2_2[var7_8];
                        if (var4_5 == 0) {
                            var6_7 = var13_16.t;
                            var12_15 = var6_7.length;
                            var10_13 = 0;
                            break block37;
                        }
                        var5_6 = var1_1;
                        break block42;
                    }
                    while (true) {
                        var5_6 = var1_1;
                        if (var10_13 >= var12_15) break;
                        var8_11 = var6_7[var10_13];
                        if (var8_11.e != 0) {
                            var8_11.e = (short)(false ? 1 : 0);
                            var1_1 = 0;
                        }
                        ++var10_13;
                        continue;
                        break;
                    }
                }
                if (this.e.indexOf((Object)var13_16.s) == -1) {
                    var13_16.s = this.e.get(0);
                    var5_6 = 0;
                }
                ++var7_8;
                var1_1 = var5_6;
                continue;
                break;
            }
            for (var5_6 = 0; var5_6 < 80; ++var5_6) {
                var6_7 = var2_2[var5_6];
                if (this.e.indexOf((Object)var6_7.s) != -1) continue;
                var6_7.s = this.e.get(0);
                var1_1 = 0;
                continue;
            }
            this.a = var2_2;
            var4_5 = 0;
            for (var5_6 = 0; var5_6 < 80; ++var5_6) {
                if (var4_5 != 0) {
                    this.a[var5_6].p = false;
                }
                if (!this.a[var5_6].p) continue;
                var4_5 = 1;
            }
            if (var4_5 != 0)
            try {
                this.a[0].p = true;
lbl133:
                // 2 sources

                Toast.makeText((Context)this.getActivity(), (CharSequence)this.getActivity().getString(2131624344), (int)1).show();
                if (var1_1 == 0) {
                    Toast.makeText((Context)this.getActivity(), (CharSequence)this.getActivity().getString(2131624350), (int)1).show();
                }
                ((PlayActivity)this.getActivity()).a((short)7);
lbl137:
                // 2 sources

                var3_4.close();
            }
            catch (IOException var2_3) {
                var3_4 = Toast.makeText((Context)this.getActivity(), (CharSequence)"IOException", (int)1);
                ((TextView)var3_4.getView().findViewById(16908299)).setTextColor(-65536);
                var3_4.show();
                com.saterskog.b.a.a("hmmm, dsf");
                com.saterskog.b.a.a(var2_3);
            }
        }
        this.h = this.d();
        this.c();
        this.a();
        this.a(true, true);
        return false;
    }

    public final void onAttach(Activity activity) {
        super.onAttach(activity);
        try {
            this.f = (b)activity;
            return;
        }
        catch (ClassCastException classCastException) {
            throw new ClassCastException(activity.toString() + " must implement GenomeProvider");
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    public final void onCheckedChanged(CompoundButton compoundButton, boolean bl) {
        if (this.j) {
            return;
        }
        switch (compoundButton.getId()) {
            case 2131230759: {
                this.a[this.c].l = bl;
                if (Math.abs(this.n - 0.8) < 0.06 && this.a[0].l && this.a[0].s == com.saterskog.cell_lab.h.a) {
                    t.b(this.getActivity(), 2, 0);
                }
                if (this.a[0].l && this.a[0].s == com.saterskog.cell_lab.h.n && this.a[1].s == com.saterskog.cell_lab.h.b && this.a[2].s == com.saterskog.cell_lab.h.a) {
                    t.b(this.getActivity(), 3, 0);
                }
                if ((compoundButton = (SeekBar)this.getActivity().findViewById(2131230894)) != null) {
                    compoundButton.setEnabled(this.a[this.c].l);
                }
                if (this.p == null) break;
                this.p.a(this.a[this.c].l);
                break;
            }
            case 2131230763: {
                this.a[this.c].o = bl;
                break;
            }
            case 2131230757: {
                this.a[this.c].m = bl;
                break;
            }
            case 2131230758: {
                this.a[this.c].n = bl;
                break;
            }
            case 2131230760: {
                this.a[this.c].q = bl;
                break;
            }
            case 2131230761: {
                this.a[this.c].r = bl;
                break;
            }
            case 2131230820: {
                if (!bl) break;
                for (int i2 = 0; i2 < 80; ++i2) {
                    this.a[i2].p = false;
                }
                this.a[this.c].p = true;
                if (this.c != 4) break;
                t.b(this.getActivity(), 1, 3);
                break;
            }
            case 2131230762: {
                if (this.h == bl) break;
                this.h = bl;
                this.c();
                this.a(false, false);
                break;
            }
        }
        this.a();
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final void onClick(View alertDialog) {
        switch (alertDialog.getId()) {
            default: {
                for (e e2 : this.q) {
                    if (alertDialog != e2.e) continue;
                    this.a(e2.c(), e2.j);
                    return;
                }
                return;
            }
            case 2131230743: {
                alertDialog = new CharSequence[com.saterskog.cell_lab.g.a((Context)this.getActivity()).size() + 2];
                Object object = String.format("%X", this.getResources().getColor(2131034160)).substring(2);
                alertDialog[0] = Html.fromHtml((String)("<font color=\"#" + (String)object + "\">" + this.getActivity().getString(2131624157) + "</font>"));
                alertDialog[1] = Html.fromHtml((String)("<font color=\"#" + (String)object + "\">" + this.getString(2131624097) + "</font>"));
                object = com.saterskog.cell_lab.g.a((Context)this.getActivity()).iterator();
                int n2 = 2;
                while (object.hasNext()) {
                    alertDialog[n2] = (String)object.next();
                    ++n2;
                }
                object = new AlertDialog.Builder((Context)this.getActivity());
                object.setTitle((CharSequence)this.getString(2131624146));
                object.setItems((CharSequence[])alertDialog, new DialogInterface.OnClickListener(){

                    public final void onClick(DialogInterface dialogInterface, int n2) {
                        i.this.b(n2);
                    }
                });
                alertDialog = object.create();
                alertDialog.show();
                alertDialog.findViewById(alertDialog.getContext().getResources().getIdentifier("android:id/titleDivider", null, null)).setBackgroundColor(this.getResources().getColor(2131034132));
                return;
            }
            case 2131230747: {
                alertDialog = new AlertDialog.Builder((Context)this.getActivity());
                alertDialog.setTitle((CharSequence)this.getActivity().getString(2131624041));
                alertDialog.setMessage((CharSequence)this.getActivity().getString(2131624040));
                final EditText editText = new EditText((Context)this.getActivity());
                editText.setText((CharSequence)this.d);
                editText.setInputType(1);
                alertDialog.setView((View)editText);
                alertDialog.setPositiveButton((CharSequence)this.getActivity().getString(2131624031), new DialogInterface.OnClickListener(){

                    public final void onClick(DialogInterface object, int n2) {
                        i.this.d = editText.getText().toString();
                        object = com.saterskog.cell_lab.g.a(i.this.d);
                        com.saterskog.cell_lab.i.a(i.this, (String)object);
                    }
                });
                alertDialog.setNegativeButton((CharSequence)this.getActivity().getString(2131624027), new DialogInterface.OnClickListener(){

                    public final void onClick(DialogInterface dialogInterface, int n2) {
                        dialogInterface.cancel();
                    }
                });
                alertDialog.show();
                return;
            }
            case 2131230937: {
                this.a(this.getActivity().getString(2131624314), this.getActivity().getString(2131624282));
                return;
            }
            case 2131230935: {
                this.a(this.getActivity().getString(2131624324), this.getActivity().getString(2131624293));
                return;
            }
            case 2131230936: {
                this.a(this.getActivity().getString(2131624325), this.getActivity().getString(2131624294));
                return;
            }
            case 2131230932: {
                this.a(this.getActivity().getString(2131624321), this.getActivity().getString(2131624290));
                return;
            }
            case 2131230934: {
                this.a(this.getActivity().getString(2131624323), this.getActivity().getString(2131624292));
                return;
            }
            case 2131230938: {
                this.a(this.getActivity().getString(2131624326), this.getActivity().getString(2131624295));
                return;
            }
            case 2131230939: {
                this.a(this.getActivity().getString(2131624327), this.getActivity().getString(2131624296));
                return;
            }
            case 2131230948: {
                this.a(this.getActivity().getString(2131624335), this.getActivity().getString(2131624307));
                return;
            }
            case 2131230954: {
                this.a(this.getActivity().getString(2131624316), (CharSequence)Html.fromHtml((String)this.getActivity().getString(2131624284)));
                return;
            }
            case 2131230885: {
                this.a(this.getActivity().getString(2131624333), this.getActivity().getString(2131624305));
                return;
            }
            case 2131230946: {
                this.a(this.getActivity().getString(2131624334), this.getActivity().getString(2131624306));
                return;
            }
            case 2131230888: {
                this.a(this.getActivity().getString(2131624328), this.getActivity().getString(2131624300));
                return;
            }
            case 2131230895: {
                this.a(this.getActivity().getString(2131624336), this.getActivity().getString(2131624312));
                return;
            }
            case 2131230947: {
                this.a(this.getActivity().getString(2131624331), this.getActivity().getString(2131624303));
                return;
            }
            case 2131230893: {
                this.a(this.getActivity().getString(2131624332), this.getActivity().getString(2131624304));
                return;
            }
            case 2131230879: {
                this.a(this.getActivity().getString(2131624317), this.getActivity().getString(2131624285));
                return;
            }
            case 2131230881: {
                this.a(this.getActivity().getString(2131624319), this.getActivity().getString(2131624287));
                return;
            }
            case 2131230891: {
                this.g = true;
                this.a(this.getActivity().getString(2131624329), this.getActivity().getString(2131624301));
                return;
            }
            case 2131230883: {
                this.a(this.getActivity().getString(2131624322), this.getActivity().getString(2131624291));
                return;
            }
            case 2131230877: {
                this.a(this.getActivity().getString(2131624315), this.getActivity().getString(2131624283));
                return;
            }
            case 2131230913: {
                this.a(this.getActivity().getString(2131624318), this.getActivity().getString(2131624286));
                return;
            }
            case 2131230915: 
        }
        this.a(this.getActivity().getString(2131624320), this.getActivity().getString(2131624288));
    }

    /*
     * Enabled aggressive block sorting
     */
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.k = PreferenceManager.getDefaultSharedPreferences((Context)this.getActivity()).getBoolean("show_gene_type", false);
        this.d = "";
        if (bundle == null) {
            this.h = true;
            this.l = 24;
            this.a = new Gene[80];
            this.n = 0.0;
            this.b();
            return;
        }
        this.c = bundle.getInt("gi");
        this.a = (Gene[])bundle.getParcelableArray("mGenes");
        this.n = bundle.getDouble("mTime");
        int[] arrn = bundle.getIntArray("genePool");
        this.e = new ArrayList();
        for (int n2 : arrn) {
            this.e.add(com.saterskog.cell_lab.h.B[n2]);
        }
        this.h = bundle.getBoolean("snapAngles");
        int n3 = this.h ? 24 : 1200;
        this.l = n3;
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     */
    public final View onCreateView(LayoutInflater object, ViewGroup viewGroup, Bundle arrstring) {
        int n2;
        LinearLayout linearLayout;
        this.o = object.inflate(2131361824, (ViewGroup)linearLayout, false);
        linearLayout = (LinearLayout)this.o.findViewById(2131230786);
        this.q.clear();
        this.q.add(new a(this.getString(2131624108), this.getString(2131624109), 6, null));
        this.p = new a(this.getString(2131624098), this.getString(2131624099), 5, null);
        this.p.b = 100.0f;
        this.q.add(this.p);
        String[] arrstring2 = new String[Gene.w[9]];
        for (n2 = 0; n2 < Gene.w[9]; ++n2) {
            arrstring2[n2] = "" + (n2 + 1);
        }
        this.q.add(new c(this.getString(2131624111), this.getString(2131624112), 9, null, arrstring2, 1, false));
        String[] strArr = new String[21];
        for (i = 0; i < 20; i++){
            strArr[i] = Integer.toString(i+1);
        }
        strArr[20] = "∞";

        this.q.add(new c("Max splits", "test", 9, null, strArr, 1, true));
        String[] arrstring3 = new String[21];
        n2 = 0;
        int n3 = 1;
        while (n2 < 20) {
            arrstring3[n2] = Integer.toString(n3);
            n3 = ++n2 + 1;
        }
        arrstring3[20] = "infinity";
        ArrayList<e> arrayList = this.q;
        String[] arrstring4 = new String[80];
        for (n2 = 0; n2 < 80; ++n2) {
            arrstring4[n2] = this.getString(2131624117) + (n2 + 1);
        }
        String[] arrstring5 = new String[Gene.B.length];
        arrstring5[0] = "\u221e";
        for (n2 = 1; n2 < Gene.B.length; ++n2) {
            arrstring5[n2] = "" + Gene.B[n2];
        }
        this.q.add(new c(this.getActivity().getString(2131624144), this.getString(2131624338), 0, com.saterskog.cell_lab.h.i, arrstring4, -1, true));
        this.q.add(new f(this.getString(2131624143), this.getString(2131624313), 0, com.saterskog.cell_lab.h.b));
        this.q.add(new f(this.getString(2131624127), this.getString(2131624289), 1, com.saterskog.cell_lab.h.g));
        this.q.add(new f(this.getString(2131624162), this.getString(2131624298), 3, com.saterskog.cell_lab.h.m));
        this.q.add(new f(this.getString(2131624161), this.getString(2131624297), 2, com.saterskog.cell_lab.h.m));
        this.q.add(new f(this.getString(2131624163), this.getString(2131624299), 4, com.saterskog.cell_lab.h.m));
        this.q.add(new c(this.getString(2131624248), this.getString(2131624308), 0, com.saterskog.cell_lab.h.p, arrstring4, -1, true));
        this.q.add(new f(this.getString(2131624250), this.getString(2131624310), 5, com.saterskog.cell_lab.h.p));
        this.q.add(new c(this.getString(2131624249), this.getString(2131624309), 1, com.saterskog.cell_lab.h.p, arrstring4, -1, true));
        this.q.add(new f(this.getString(2131624251), this.getString(2131624311), 6, com.saterskog.cell_lab.h.p));
        this.q.add(new c(this.getString(2131624104), this.getString(2131624105), 1, com.saterskog.cell_lab.h.q, arrstring4, -1, true));
        this.q.add(new c(this.getString(2131624113), this.getString(2131624114), 0, com.saterskog.cell_lab.h.q, arrstring4, -1, true));
        this.q.add(new c(this.getString(2131624115), this.getString(2131624116), 10, com.saterskog.cell_lab.h.q, arrstring5, -1, false));
        this.q.add(new f(this.getString(2131624100), this.getString(2131624101), 2, com.saterskog.cell_lab.h.r));
        this.q.add(new f(this.getString(2131624102), this.getString(2131624103), 4, com.saterskog.cell_lab.h.r));
        String[] arrstring6 = new String[Gene.w[4]];
        arrstring6[0] = this.getString(2131624206);
        arrstring6[1] = this.getString(2131624205);
        arrstring6[2] = this.getString(2131624209);
        arrstring6[3] = this.getString(2131624208);
        arrstring6[5] = this.getString(2131624207);
        arrstring6[6] = this.getString(2131624210);
        arrstring6[4] = this.getString(2131624204);
        for (n2 = 0; n2 < 4; ++n2) {
            arrstring6[n2 + 7] = "-" + this.getString(2131624227) + (n2 + 1);
        }
        for (n2 = 0; n2 < 4; ++n2) {
            arrstring6[n2 + 11] = "+" + this.getString(2131624227) + (n2 + 1);
        }
        this.q.add(new c(this.getString(2131624137), this.getString(2131624302), 4, com.saterskog.cell_lab.h.o, arrstring6, -1, false));
        String[] arrstring7 = new String[4];
        for (n2 = 0; n2 < 4; ++n2) {
            arrstring7[n2] = this.getString(2131624227) + (n2 + 1);
        }
        String string = this.getString(2131624242);
        String string2 = this.getString(2131624243);
        String string3 = this.getString(2131624245);
        Iterator<e> iterator = this.getString(2131624244);
        String string4 = this.getString(2131624246);
        String string5 = this.getString(2131624247);
        for (n2 = 0; n2 < 2; ++n2) {
            void var1_10;
            if (n2 == 0) {
                h h2 = com.saterskog.cell_lab.h.l;
            } else {
                h h3 = com.saterskog.cell_lab.h.k;
            }
            this.q.add(new c(this.getString(2131624095), this.getString(2131624096), 3, (h)var1_10, new String[]{string, string2, string3, iterator, string4, string5}, -1, false));
            this.q.add(new c(this.getString(2131624084), this.getString(2131624090), 2, (h)var1_10, arrstring7, -1, false));
            this.q.add(new a(this.getString(2131624083), this.getString(2131624089), 0, (h)var1_10));
            this.q.add(new a(this.getString(2131624091), this.getString(2131624092), 1, (h)var1_10));
            this.q.add(new a(this.getString(2131624087), this.getString(2131624088), 2, (h)var1_10));
            this.q.add(new a(this.getString(2131624085), this.getString(2131624086), 3, (h)var1_10));
            this.q.add(new a(this.getString(2131624093), this.getString(2131624094), 4, (h)var1_10));
        }
        for (n2 = 0; n2 < 4; ++n2) {
            this.q.add(new c(this.getString(2131624084), this.getString(2131624080) + (n2 + 1) + this.getString(2131624081), n2 + 5, com.saterskog.cell_lab.h.n, arrstring7, -1, false));
            this.q.add(new f(this.getString(2131624083), this.getString(2131624078) + (n2 + 1) + this.getString(2131624079), n2 + 7, com.saterskog.cell_lab.h.n));
        }
        n2 = 0;
        while (n2 < this.q.size()) {
            n3 = n2;
            if (!com.saterskog.cell_lab.j.a((Context)this.getActivity(), this.q.get((int)n2).k)) {
                this.q.remove(n2);
                n3 = n2 - 1;
            }
            n2 = n3 + 1;
        }
        for (e e2 : this.q) {
            if (e2.g != null) continue;
            linearLayout.addView(e2.a());
        }
        View view = new View((Context)this.getActivity());
        linearLayout.addView(view);
        view.setBackgroundColor(this.getResources().getColor(2131034132));
        view.getLayoutParams().width = -1;
        view.getLayoutParams().height = (int)(1.0f * Resources.getSystem().getDisplayMetrics().density);
        this.b = new Button((Context)this.getActivity());
        this.b.setText(2131624082);
        this.b.setOnClickListener(new View.OnClickListener(){

            public final void onClick(View view) {
                (i)i.this.new d().c.show();
                if (i.this.c == 2) {
                    t.a(i.this.getActivity(), 3, 5, 500);
                }
            }
        });
        linearLayout.addView((View)this.b);
        for (e e3 : this.q) {
            if (e3.g == null) continue;
            linearLayout.addView(e3.a());
        }
        if (this.h) {
            ((SeekBar)this.o.findViewById(2131230892)).setMax(24);
            ((SeekBar)this.o.findViewById(2131230878)).setMax(24);
            ((SeekBar)this.o.findViewById(2131230880)).setMax(24);
            ((SeekBar)this.o.findViewById(2131230884)).setMax(24);
            ((SeekBar)this.o.findViewById(2131230887)).setMax(24);
            ((SeekBar)this.o.findViewById(2131230889)).setMax(24);
            ((SeekBar)this.o.findViewById(2131230894)).setMax(24);
            ((SeekBar)this.o.findViewById(2131230890)).setMax(24);
            ((SeekBar)this.o.findViewById(2131230876)).setMax(24);
            ((SeekBar)this.o.findViewById(2131230882)).setMax(24);
        }
        ArrayAdapter arrayAdapter = this.a(true, arrstring4);
        ((Spinner)this.o.findViewById(2131230911)).setAdapter((SpinnerAdapter)arrayAdapter);
        ArrayAdapter arrayAdapter2 = this.a(false, arrstring4);
        ((Spinner)this.o.findViewById(2131230912)).setAdapter((SpinnerAdapter)arrayAdapter2);
        ArrayAdapter arrayAdapter3 = this.a(false, arrstring4);
        ((Spinner)this.o.findViewById(2131230914)).setAdapter((SpinnerAdapter)arrayAdapter3);
        ArrayList<String> arrayList2 = new ArrayList<String>();
        for (n2 = 0; n2 < this.e.size(); ++n2) {
            arrayList2.add(com.saterskog.b.e.a(this.e.get(n2).a((Context)this.getActivity())));
        }
        ArrayAdapter arrayAdapter4 = new ArrayAdapter((Context)this.getActivity(), 2131361832, arrayList2);
        ((Spinner)this.o.findViewById(2131230918)).setAdapter((SpinnerAdapter)arrayAdapter4);
        this.m = (GenomePreviewView)this.o.findViewById(2131230720);
        this.m.setCallback(this);
        this.a(this.o, 2131230918);
        this.a(this.o, 2131230911);
        this.a(this.o, 2131230912);
        this.a(this.o, 2131230914);
        this.d(this.o, 2131230896);
        this.d(this.o, 2131230890);
        this.d(this.o, 2131230882);
        this.d(this.o, 2131230876);
        this.d(this.o, 2131230878);
        this.d(this.o, 2131230880);
        this.d(this.o, 2131230884);
        this.d(this.o, 2131230887);
        this.d(this.o, 2131230889);
        this.d(this.o, 2131230892);
        this.d(this.o, 2131230894);
        this.e(this.o, 2131230759);
        this.e(this.o, 2131230763);
        this.e(this.o, 2131230757);
        this.e(this.o, 2131230758);
        this.e(this.o, 2131230760);
        this.e(this.o, 2131230761);
        this.e(this.o, 2131230762);
        this.b(this.o, 2131230743);
        this.b(this.o, 2131230747);
        ((RadioButton)this.o.findViewById(2131230820)).setOnCheckedChangeListener((CompoundButton.OnCheckedChangeListener)this);
        this.c(this.o, 2131230932);
        this.c(this.o, 2131230937);
        this.c(this.o, 2131230935);
        this.c(this.o, 2131230936);
        this.c(this.o, 2131230934);
        this.c(this.o, 2131230938);
        this.c(this.o, 2131230939);
        this.c(this.o, 2131230948);
        this.c(this.o, 2131230954);
        this.c(this.o, 2131230885);
        this.c(this.o, 2131230946);
        this.c(this.o, 2131230888);
        this.c(this.o, 2131230895);
        this.c(this.o, 2131230947);
        this.c(this.o, 2131230893);
        this.c(this.o, 2131230879);
        this.c(this.o, 2131230881);
        this.c(this.o, 2131230891);
        this.c(this.o, 2131230883);
        this.c(this.o, 2131230877);
        this.c(this.o, 2131230913);
        this.c(this.o, 2131230915);
        if (!com.saterskog.cell_lab.j.a((Context)this.getActivity(), 1)) {
            this.o.findViewById(2131230894).setVisibility(8);
            this.o.findViewById(2131230895).setVisibility(8);
            this.o.findViewById(2131230887).setVisibility(8);
            this.o.findViewById(2131230888).setVisibility(8);
            this.o.findViewById(2131230889).setVisibility(8);
            this.o.findViewById(2131230946).setVisibility(8);
            this.o.findViewById(2131230763).setVisibility(8);
            this.o.findViewById(2131230948).setVisibility(8);
            this.o.findViewById(2131230760).setVisibility(8);
            this.o.findViewById(2131230938).setVisibility(8);
            this.o.findViewById(2131230761).setVisibility(8);
            this.o.findViewById(2131230939).setVisibility(8);
        }
        this.a(true, true);
        return this.o;
    }

    /*
     * Enabled aggressive block sorting
     */
    public final void onItemSelected(AdapterView<?> adapterView, View view, int n2, long l2) {
        if (this.j) {
            return;
        }
        switch (adapterView.getId()) {
            case 2131230918: {
                this.a[this.c].s = this.e.get(n2);
                if (Math.abs(this.n - 0.8) < 0.06 && this.a[0].l && this.a[0].s == com.saterskog.cell_lab.h.a) {
                    t.b(this.getActivity(), 2, 0);
                }
                if (this.a[1].s == com.saterskog.cell_lab.h.b && this.a[2].s == com.saterskog.cell_lab.h.a) {
                    t.b(this.getActivity(), 2, 2);
                }
                if (this.a[0].l && this.a[0].s == com.saterskog.cell_lab.h.n && this.a[1].s == com.saterskog.cell_lab.h.b && this.a[2].s == com.saterskog.cell_lab.h.a) {
                    t.b(this.getActivity(), 3, 0);
                }
                this.a(false, false);
                break;
            }
            case 2131230911: {
                this.c = n2;
                this.a(true, false);
                if (this.c != 4) break;
                t.b(this.getActivity(), 1, 2);
                break;
            }
            case 2131230912: {
                this.a[this.c].i = n2;
                if (this.a[4].i == 5 && this.a[4].j == 6) {
                    t.b(this.getActivity(), 1, 6);
                }
                if (this.a[5].i == 4 && this.a[5].j == 4 && this.a[6].i == 4 && this.a[6].j == 4) {
                    t.b(this.getActivity(), 1, 8);
                }
                if (this.a[0].i != 1 || this.a[0].j != 2) break;
                t.b(this.getActivity(), 2, 1);
                break;
            }
            case 2131230914: {
                this.a[this.c].j = n2;
                if (this.a[4].i == 5 && this.a[4].j == 6) {
                    t.b(this.getActivity(), 1, 6);
                }
                if (this.a[5].i == 4 && this.a[5].j == 4 && this.a[6].i == 4 && this.a[6].j == 4) {
                    t.b(this.getActivity(), 1, 8);
                }
                if (this.a[2].j == 0) {
                    t.b(this.getActivity(), 2, 4);
                }
                if (this.a[0].i != 1 || this.a[0].j != 2) break;
                t.b(this.getActivity(), 2, 1);
                break;
            }
        }
        this.a();
    }

    public final void onNothingSelected(AdapterView<?> adapterView) {
    }

    /*
     * Enabled aggressive block sorting
     */
    public final void onProgressChanged(SeekBar seekBar, int n2, boolean bl) {
        if (this.i) {
            return;
        }
        if (this.j) return;
        int n3 = seekBar.getId();
        int n4 = this.h && n3 != 2131230896 ? 24 : 1200;
        double d2 = (double)n2 / (double)n4;
        seekBar = (TextView)this.getActivity().findViewById(2131230952);
        switch (n3) {
            case 2131230896: {
                d2 = (double)n2 / 1200.0;
                this.n = Math.max(4.0 * d2 * 6.0, (d2 - 0.5) * 4.0 * 42.0 + 6.0);
                if (seekBar == null) break;
                seekBar.setText((CharSequence)(this.getActivity().getString(2131624063) + String.format("%1$,.1f", this.n) + this.getActivity().getString(2131624064)));
                break;
            }
            case 2131230890: {
                this.a[this.c].a[0] = (float)n2 / (float)n4;
                if (this.a[this.c].a[0] > 0.9f && this.a[this.c].a[1] < 0.1f && this.a[this.c].a[2] < 0.1f) {
                    t.b(this.getActivity(), 1, 5);
                }
                if (seekBar == null) break;
                seekBar.setText((CharSequence)(this.getActivity().getString(2131624059) + String.format("%1$,.2f", Float.valueOf(this.a[this.c].a[0]))));
                break;
            }
            case 2131230882: {
                this.a[this.c].a[1] = (float)n2 / (float)n4;
                if (this.a[this.c].a[0] > 0.9f && this.a[this.c].a[1] < 0.1f && this.a[this.c].a[2] < 0.1f) {
                    t.b(this.getActivity(), 1, 5);
                }
                if (seekBar == null) break;
                seekBar.setText((CharSequence)(this.getActivity().getString(2131624055) + String.format("%1$,.2f", Float.valueOf(this.a[this.c].a[1]))));
                break;
            }
            case 2131230876: {
                this.a[this.c].a[2] = (float)n2 / (float)n4;
                if (this.a[this.c].a[0] > 0.9f && this.a[this.c].a[1] < 0.1f && this.a[this.c].a[2] < 0.1f) {
                    t.b(this.getActivity(), 1, 5);
                }
                if (seekBar == null) break;
                seekBar.setText((CharSequence)(this.getActivity().getString(2131624050) + String.format("%1$,.2f", Float.valueOf(this.a[this.c].a[2]))));
                break;
            }
            case 2131230878: {
                this.a[this.c].e = (float)((double)(n2 * 2) * Math.PI / (double)n4);
                if (seekBar == null) break;
                seekBar.setText((CharSequence)(this.getActivity().getString(2131624051) + String.format("%1$,.0f", (double)(this.a[this.c].e * 180.0f) / Math.PI) + "\u00b0"));
                break;
            }
            case 2131230880: {
                this.a[this.c].f = (float)((double)(n2 * 2) * Math.PI / (double)n4);
                if (seekBar == null) break;
                seekBar.setText((CharSequence)(this.getActivity().getString(2131624053) + String.format("%1$,.0f", (double)(this.a[this.c].f * 180.0f) / Math.PI) + "\u00b0"));
                break;
            }
            case 2131230884: {
                this.a[this.c].b = 0.3024f * (float)n2 / (float)n4 + 0.0648f;
                if (seekBar != null) {
                    if ((double)this.a[this.c].b > 0.36) {
                        seekBar.setText((CharSequence)this.getActivity().getString(2131624057));
                    } else if ((double)this.a[this.c].b < 0.072) {
                        seekBar.setText((CharSequence)(this.getActivity().getString(2131624056) + String.format("%1$,.2f", 0.5) + " " + this.getActivity().getString(2131624145)));
                    } else {
                        seekBar.setText((CharSequence)(this.getActivity().getString(2131624061) + String.format("%1$,.2f", Float.valueOf(this.a[this.c].b * 10.0f)) + " " + this.getActivity().getString(2131624164)));
                    }
                }
                if (!((double)this.a[1].b > 0.36)) break;
                t.b(this.getActivity(), 2, 3);
                break;
            }
            case 2131230887: {
                this.a[this.c].g = (float)(Math.pow(99.99999850988391, (double)n2 / (double)n4) * (double)0.1f);
                if (seekBar == null) break;
                seekBar.setText((CharSequence)(this.getActivity().getString(2131624058) + String.format("%1$,.2f", Float.valueOf(this.a[this.c].g))));
                break;
            }
            case 2131230889: {
                this.a[this.c].c = (float)(n4 - n2) * 0.8f / (float)n4 + 0.1f;
                if (seekBar == null) break;
                seekBar.setText((CharSequence)(this.getActivity().getString(2131624052) + String.format("%1$,.2f", Float.valueOf(1.0f - this.a[this.c].c)) + this.getActivity().getString(2131624054) + String.format("%1$,.2f", Float.valueOf(this.a[this.c].c))));
                break;
            }
            case 2131230892: {
                this.a[this.c].d = (float)(2.0 * d2 * Math.PI);
                if (seekBar == null) break;
                seekBar.setText((CharSequence)(this.getActivity().getString(2131624060) + String.format("%1$,.0f", (double)(this.a[this.c].d * 180.0f) / Math.PI) + "\u00b0"));
                break;
            }
            case 2131230894: {
                this.a[this.c].h = (float)(35.0 * d2);
                if (seekBar == null) break;
                seekBar.setText((CharSequence)(this.getActivity().getString(2131624062) + String.format("%1$,.1f", Float.valueOf(this.a[this.c].h))));
                break;
            }
        }
        if (this.h) {
            this.d(this.c);
        }
        this.a();
    }

    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("snapAngles", this.h);
        bundle.putParcelableArray("mGenes", (Parcelable[])this.a);
        bundle.putDouble("mTime", this.n);
        int[] arrn = new int[this.e.size()];
        for (int i2 = 0; i2 < this.e.size(); ++i2) {
            arrn[i2] = this.e.get(i2).ordinal();
        }
        bundle.putIntArray("genePool", arrn);
        bundle.putInt("gi", this.c);
    }

    public final void onStartTrackingTouch(SeekBar seekBar) {
    }

    public final void onStopTrackingTouch(SeekBar seekBar) {
        new Handler().postDelayed(new Runnable(){

            @Override
            public final void run() {
                Activity activity = i.this.getActivity();
                if (activity != null && (activity = (TextView)activity.findViewById(2131230952)) != null) {
                    activity.setText((CharSequence)"");
                }
            }
        }, 500L);
        if (seekBar == this.getActivity().findViewById(2131230896)) {
            if (Math.abs(this.n - 2.0) < 0.06) {
                t.b(this.getActivity(), 1, 1);
            }
            if (Math.abs(this.n - 4.0) < 0.06) {
                t.b(this.getActivity(), 1, 7);
            }
            if (Math.abs(this.n - 0.8) < 0.06 && this.a[0].l && this.a[0].s == com.saterskog.cell_lab.h.a) {
                t.b(this.getActivity(), 2, 0);
            }
        }
    }

    private final class a
    extends e
    implements SeekBar.OnSeekBarChangeListener {
        SeekBar a;
        float b;

        public a(String string, String string2, int n2, h h2) {
            super(string, string2, n2, h2, -1);
            this.a = null;
            this.b = 1.0f;
            this.l = i.this.getActivity().getString(2131624330);
        }

        @Override
        final View a() {
            this.f = new RelativeLayout((Context)i.this.getActivity());
            this.f.setLayoutParams((ViewGroup.LayoutParams)new RelativeLayout.LayoutParams(-1, -2));
            this.f.setGravity(16);
            this.e = new TextView((Context)i.this.getActivity());
            this.e.setText((CharSequence)(this.i + ":"));
            this.e.setClickable(true);
            this.e.setOnClickListener((View.OnClickListener)i.this);
            this.e.setPaintFlags(this.e.getPaintFlags() | 8);
            this.e.setId(2131230785);
            this.a = new SeekBar((Context)i.this.getActivity());
            this.a.setMax(i.this.l);
            this.a.setOnSeekBarChangeListener((SeekBar.OnSeekBarChangeListener)this);
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
            layoutParams.addRule(9);
            layoutParams.addRule(15);
            this.e.setLayoutParams((ViewGroup.LayoutParams)layoutParams);
            layoutParams = new RelativeLayout.LayoutParams(-2, -2);
            layoutParams.addRule(11);
            layoutParams.addRule(1, this.e.getId());
            layoutParams.addRule(15);
            this.a.setLayoutParams((ViewGroup.LayoutParams)layoutParams);
            this.f.addView((View)this.e);
            this.f.addView((View)this.a);
            return this.f;
        }

        public final void a(boolean bl) {
            if (this.a != null) {
                this.a.setEnabled(bl);
            }
        }

        /*
         * Enabled aggressive block sorting
         */
        @Override
        public final void b() {
            int n2 = Math.round((i.this.a[i.this.c].v[this.h] - Gene.z[this.h]) / (Gene.A[this.h] - Gene.z[this.h]) * (float)i.this.l);
            if (this.f != null) {
                RelativeLayout relativeLayout = this.f;
                int n3 = this.g == null || this.g == i.this.a[i.this.c].s ? 0 : 8;
                relativeLayout.setVisibility(n3);
            }
            this.a.setMax(i.this.l);
            this.a.setProgress(n2);
        }

        public final void onProgressChanged(SeekBar seekBar, int n2, boolean bl) {
            i.this.a[i.this.c].v[this.h] = Gene.z[this.h] + (Gene.A[this.h] - Gene.z[this.h]) * (float)n2 / (float)seekBar.getMax();
            seekBar = (TextView)i.this.getActivity().findViewById(2131230952);
            if (seekBar != null) {
                seekBar.setText((CharSequence)String.format(this.i + ": %1$,.2f", Float.valueOf(this.b * i.this.a[i.this.c].v[this.h])));
            }
            i.this.a();
        }

        public final void onStartTrackingTouch(SeekBar seekBar) {
        }

        public final void onStopTrackingTouch(SeekBar seekBar) {
            seekBar = (TextView)i.this.getActivity().findViewById(2131230952);
            if (seekBar != null) {
                seekBar.setText((CharSequence)"");
            }
        }
    }

    public static interface b {
        public Gene[] a();
    }

    private final class c
    extends e {
        Spinner a;
        String[] b;
        boolean c;

        public c(String string, String string2, int n2, h h2, String[] arrstring, int n3, boolean bl) {
            super(string, string2, n2, h2, n3);
            this.a = null;
            this.b = null;
            this.l = i.this.getActivity().getString(2131624337);
            this.b = arrstring;
            this.c = bl;
        }

        /*
         * Enabled aggressive block sorting
         */
        @Override
        final View a() {
            ArrayAdapter arrayAdapter;
            this.f = new RelativeLayout((Context)i.this.getActivity());
            this.f.setLayoutParams((ViewGroup.LayoutParams)new RelativeLayout.LayoutParams(-1, -2));
            this.f.setGravity(16);
            this.e = new TextView((Context)i.this.getActivity());
            this.e.setText((CharSequence)(this.i + ":"));
            this.e.setClickable(true);
            this.e.setOnClickListener((View.OnClickListener)i.this);
            this.e.setPaintFlags(this.e.getPaintFlags() | 8);
            this.e.setId(2131230785);
            this.a = new Spinner((Context)i.this.getActivity());
            if (this.c) {
                this.a.setAdapter((SpinnerAdapter)i.this.a(false, this.b));
            } else {
                arrayAdapter = new ArrayAdapter((Context)i.this.getActivity(), 2131361832, (Object[])this.b);
                this.a.setAdapter((SpinnerAdapter)arrayAdapter);
            }
            this.a.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener(){

                public final void onItemSelected(AdapterView<?> adapterView, View view, int n2, long l2) {
                    i.this.a[i.this.c].u[c.this.h] = n2;
                    i.this.a();
                }

                public final void onNothingSelected(AdapterView<?> adapterView) {
                }
            });
            arrayAdapter = new RelativeLayout.LayoutParams(-2, -2);
            arrayAdapter.addRule(9);
            arrayAdapter.addRule(15);
            this.e.setLayoutParams((ViewGroup.LayoutParams)arrayAdapter);
            arrayAdapter = new RelativeLayout.LayoutParams(-2, -2);
            arrayAdapter.addRule(11);
            arrayAdapter.addRule(15);
            this.a.setLayoutParams((ViewGroup.LayoutParams)arrayAdapter);
            this.f.addView((View)this.e);
            this.f.addView((View)this.a);
            return this.f;
        }

        /*
         * Enabled aggressive block sorting
         */
        @Override
        public final void b() {
            if (this.f != null) {
                RelativeLayout relativeLayout = this.f;
                int n2 = this.g == null || this.g == i.this.a[i.this.c].s ? 0 : 8;
                relativeLayout.setVisibility(n2);
            }
            this.a.setSelection(i.this.a[i.this.c].u[this.h], true);
        }
    }

    private final class d
    implements SeekBar.OnSeekBarChangeListener {
        Spinner a;
        Spinner b;
        AlertDialog.Builder c;
        SeekBar d;
        TextView e;
        final float f;
        final float g;
        final float h;
        float i;

        public d() {
            int n2;
            float f2;
            this.f = 0.25f;
            this.g = 9.25f;
            this.h = 2.0f;
            short s2 = i.this.a[i.this.c].t[8].d;
            short s3 = i.this.a[i.this.c].t[7].d;
            float f3 = Gene.y[7];
            float f4 = i.this.a[i.this.c].t[7].a;
            float f5 = Gene.y[7] * i.this.a[i.this.c].t[9].a;
            int n3 = Math.round((f5 - 7.5f) / 4.0f);
            float f6 = f2 = -1.0f;
            if (n3 >= 0) {
                f6 = f2;
                if (n3 <= 5) {
                    f6 = this.a(n3, f5, f3 * f4);
                }
            }
            f2 = f6;
            if (0.125 < (double)f6) {
                f2 = f6;
                if (f6 < 0.25f) {
                    f2 = 0.25f;
                }
            }
            f6 = f2;
            if (9.25f < f2) {
                f6 = f2;
                if ((double)f2 < 9.375) {
                    f6 = 9.25f;
                }
            }
            if (n3 < 0 || n3 > 5 || s2 < 0 || s3 < 0 || s2 >= 4 || s3 >= 4 || s2 == s3 || f6 < 0.25f || f6 > 9.25f) {
                s2 = 0;
                s3 = 1;
                n3 = 1;
                f6 = 2.0f;
            }
            this.c = new AlertDialog.Builder((Context)i.this.getActivity());
            View view = i.this.getActivity().getLayoutInflater().inflate(2131361830, null);
            this.a = (Spinner)view.findViewById(2131230917);
            ArrayAdapter arrayAdapter = new String[6];
            for (n2 = 0; n2 < 6; ++n2) {
                arrayAdapter[n2] = n2 + i.this.getString(2131624180);
            }
            arrayAdapter = new ArrayAdapter((Context)i.this.getActivity(), 2131361832, (Object[])arrayAdapter);
            this.a.setAdapter((SpinnerAdapter)arrayAdapter);
            this.a.setSelection(n3);
            this.b = (Spinner)view.findViewById(2131230916);
            arrayAdapter = new String[12];
            n3 = 0;
            n2 = 0;
            for (short i3 = 0; i3 < 4; ++i3) {
                for (short i4 = 0; i4 < 4; ++i4) {
                    int n4 = n2;
                    int n5 = n3;
                    if (i3 != i4) {
                        n4 = n2;
                        if (i3 == s2) {
                            n4 = n2;
                            if (i4 == s3) {
                                n4 = n3;
                            }
                        }
                        arrayAdapter[n3] = i.this.getString(2131624181) + (i3 + 1) + " " + i.this.getString(2131624184) + " " + (i4 + 1);
                        n5 = n3 + 1;
                    }
                    n2 = n4;
                    n3 = n5;
                }
            }
            arrayAdapter = new ArrayAdapter((Context)i.this.getActivity(), 2131361832, (Object[])arrayAdapter);
            this.b.setAdapter((SpinnerAdapter)arrayAdapter);
            this.b.setSelection(n2);
            this.e = (TextView)view.findViewById(2131230942);
            this.d = (SeekBar)view.findViewById(2131230886);
            this.d.setOnSeekBarChangeListener((SeekBar.OnSeekBarChangeListener)this);
            this.d.setProgress(Math.round((f6 - 0.25f) / 9.0f * 48.0f));
            this.c.setView(view);
            this.c.setNegativeButton((CharSequence)i.this.getActivity().getString(2131624027), new DialogInterface.OnClickListener(){

                public final void onClick(DialogInterface dialogInterface, int n2) {
                    dialogInterface.cancel();
                }
            });
            this.c.setNeutralButton((CharSequence)i.this.getActivity().getString(2131624029), new DialogInterface.OnClickListener(){

                /*
                 * Enabled aggressive block sorting
                 */
                public final void onClick(DialogInterface dialogInterface, int n2) {
                    int n3;
                    int n4;
                    float f2 = (float)d.this.d.getProgress() * 9.0f / 48.0f;
                    int n5 = 0;
                    n2 = -1;
                    for (n4 = 0; n4 < 4; n4 = (int)((short)(n4 + 1))) {
                        n5 = 0;
                        n3 = n2;
                        n2 = n5;
                        while (true) {
                            n5 = n3;
                            if (n2 >= 4) break;
                            n5 = n3++;
                            if (n4 != n2) {
                                n5 = n3;
                                if (n3 == d.this.b.getSelectedItemPosition()) break;
                                n5 = n3;
                            }
                            n2 = (short)(n2 + 1);
                            n3 = n5;
                        }
                        if (n5 != d.this.b.getSelectedItemPosition()) {
                            n3 = n5;
                            n5 = n2;
                            n2 = n3;
                            continue;
                        }
                        n5 = n2;
                        break;
                    }
                    n3 = d.this.a.getSelectedItemPosition();
                    float f3 = 7.5f + (float)n3 * 5.0f * 0.8f;
                    float f4 = Gene.y[7] * 8.0f;
                    float f5 = (0.0f + f4) * 0.5f;
                    float f6 = 0.0f;
                    n2 = 0;
                    while (true) {
                        if (n2 >= 25) {
                            i.this.a[i.this.c].u[5] = n4;
                            i.this.a[i.this.c].t[7].e = (short)(true ? 1 : 0);
                            i.this.a[i.this.c].t[7].d = (short)n5;
                            i.this.a[i.this.c].t[7].a = f5 / Gene.y[7];
                            i.this.a[i.this.c].t[7].b = 0.0f;
                            i.this.a[i.this.c].u[6] = n5;
                            i.this.a[i.this.c].t[8].e = (short)(true ? 1 : 0);
                            i.this.a[i.this.c].t[8].d = (short)n4;
                            i.this.a[i.this.c].t[8].a = -f5 / Gene.y[7];
                            i.this.a[i.this.c].t[8].b = 0.0f;
                            i.this.a[i.this.c].u[7] = n4;
                            i.this.a[i.this.c].t[9].e = (short)(true ? 1 : 0);
                            i.this.a[i.this.c].t[9].d = (short)n4;
                            i.this.a[i.this.c].t[9].a = f3 / Gene.y[7];
                            i.this.a[i.this.c].t[9].b = 0.0f;
                            i.this.a[i.this.c].u[8] = n5;
                            i.this.a[i.this.c].t[10].e = (short)(true ? 1 : 0);
                            i.this.a[i.this.c].t[10].d = (short)n5;
                            i.this.a[i.this.c].t[10].a = f3 / Gene.y[7];
                            i.this.a[i.this.c].t[10].b = 0.0f;
                            dialogInterface.cancel();
                            i.this.a();
                            i.this.a(false, false);
                            return;
                        }
                        if (d.this.a(n3, f3, f5) - (0.25f + f2) < 0.0f) {
                            f4 = f6;
                        } else {
                            f6 = f5;
                            f5 = f4;
                            f4 = f6;
                        }
                        ++n2;
                        f6 = f4;
                        float f7 = f5;
                        f5 = (f4 + f5) * 0.5f;
                        f4 = f7;
                    }
                }
            });
            this.a();
        }

        private void a() {
            this.e.setText((CharSequence)String.format(i.this.getString(2131624185) + " = %1$,.2f " + i.this.getString(2131624145) + ".", Float.valueOf(0.25f + 9.0f * (float)this.d.getProgress() / 48.0f)));
        }

        final float a(int n2, float f2, float f3) {
            float f4;
            int n3 = 0;
            float[] arrf = new float[n2];
            float[] arrf2 = new float[n2];
            int n4 = 1;
            float f5 = 0.0f;
            float f6 = 1.0f;
            float f7 = 0.0f;
            int n5 = 0;
            while (true) {
                int n6;
                f4 = f7;
                if (n4 >= 80000) break;
                float f8 = f6 + (-5.0f * f6 + Math.min(20.0f, Math.max(-20.0f, f2 * f6)) + Math.min(20.0f, Math.max(-20.0f, f3 * f5))) * 0.005f;
                float f9 = f5 + (-5.0f * f5 + Math.min(20.0f, Math.max(-20.0f, f2 * f5)) + Math.min(20.0f, Math.max(-20.0f, -f3 * f6))) * 0.005f;
                for (n6 = 0; n6 < n2; ++n6) {
                    f8 -= 5.0f * (f6 - arrf[n6]) * 0.005f;
                    f9 -= 5.0f * (f5 - arrf2[n6]) * 0.005f;
                    arrf[n6] = arrf[n6] + (5.0f * (f6 - arrf[n6]) - 5.0f * arrf[n6]) * 0.005f;
                    arrf2[n6] = arrf2[n6] + (5.0f * (f5 - arrf2[n6]) - 5.0f * arrf2[n6]) * 0.005f;
                }
                f6 = f7;
                n6 = n5;
                if (f9 * f5 < 0.0f) {
                    n6 = n5 + 1;
                    if (n6 == 6) {
                        f7 = (float)n4 * 0.005f;
                    }
                    f4 = f7;
                    if (n6 == 14) break;
                    f6 = f7;
                }
                f7 = Math.min(1.0f, Math.max(-1.0f, f8));
                f5 = Math.min(1.0f, Math.max(-1.0f, f9));
                int n7 = n3;
                if (n6 > 5) {
                    n7 = n3;
                    if (f7 != f8) {
                        n7 = n3 + 1;
                    }
                }
                ++n4;
                f8 = f7;
                f7 = f6;
                n5 = n6;
                n3 = n7;
                f6 = f8;
            }
            f2 = (float)n4 * 0.005f - f4;
            this.i = (float)n3 * 0.005f / f2;
            return f2 / 4.0f;
        }

        public final void onProgressChanged(SeekBar seekBar, int n2, boolean bl) {
            this.a();
        }

        public final void onStartTrackingTouch(SeekBar seekBar) {
        }

        public final void onStopTrackingTouch(SeekBar seekBar) {
        }
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

        public e(String string, String string2, int n2, h h2, int n3) {
            this.g = h2;
            this.h = n2;
            this.i = string;
            this.j = string2;
            this.k = n3;
        }

        abstract View a();

        abstract void b();

        public final String c() {
            return this.l + ": " + this.i;
        }
    }

    private final class f
    extends e
    implements SeekBar.OnSeekBarChangeListener {
        SeekBar a;
        Button b;
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

        /*
         * Enabled aggressive block sorting
         */
        public f(String string, String string2, int n2, h h2) {
            super(string, string2, n2, h2, -1);
            this.a = null;
            this.b = null;
            this.l = i.this.getActivity().getString(2131624330);
            this.u = Gene.x[n2];
            this.v = Gene.y[n2];
            this.w = Gene.y[n2] - Gene.x[n2];
            boolean bl = i.this.e.contains((Object)com.saterskog.cell_lab.h.n) || i.this.e.contains((Object)com.saterskog.cell_lab.h.k) || i.this.e.contains((Object)com.saterskog.cell_lab.h.l);
            this.t = bl;
        }

        /*
         * Enabled aggressive block sorting
         */
        @Override
        final View a() {
            this.f = new RelativeLayout((Context)i.this.getActivity());
            this.f.setLayoutParams((ViewGroup.LayoutParams)new RelativeLayout.LayoutParams(-1, -2));
            this.f.setGravity(16);
            this.e = new TextView((Context)i.this.getActivity());
            this.e.setText((CharSequence)(this.i + ":"));
            this.e.setClickable(true);
            this.e.setOnClickListener((View.OnClickListener)i.this);
            this.e.setPaintFlags(this.e.getPaintFlags() | 8);
            this.e.setId(2131230785);
            this.a = new SeekBar((Context)i.this.getActivity());
            this.a.setMax(i.this.l);
            this.a.setOnSeekBarChangeListener((SeekBar.OnSeekBarChangeListener)this);
            if (this.t) {
                this.b = new Button((Context)i.this.getActivity());
                this.b.setText((CharSequence)i.this.getActivity().getString(2131623963));
                this.b.setId(2131230784);
                this.b.setOnClickListener(new View.OnClickListener(){

                    public final void onClick(View view) {
                        new a((f)f.this).e.show();
                        if (i.this.c == 1) {
                            com.saterskog.cell_lab.t.a(i.this.getActivity(), 3, 1, 750);
                        }
                    }
                });
            }
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
            layoutParams.addRule(9);
            layoutParams.addRule(15);
            this.e.setLayoutParams((ViewGroup.LayoutParams)layoutParams);
            if (this.t) {
                layoutParams = new RelativeLayout.LayoutParams(-2, -2);
                layoutParams.addRule(11);
                layoutParams.addRule(15);
                this.b.setLayoutParams((ViewGroup.LayoutParams)layoutParams);
            }
            layoutParams = new RelativeLayout.LayoutParams(-2, -2);
            if (this.t) {
                layoutParams.addRule(0, this.b.getId());
            } else {
                layoutParams.addRule(11);
            }
            layoutParams.addRule(1, this.e.getId());
            layoutParams.addRule(15);
            this.a.setLayoutParams((ViewGroup.LayoutParams)layoutParams);
            this.f.addView((View)this.e);
            this.f.addView((View)this.a);
            if (this.t) {
                this.f.addView((View)this.b);
            }
            if (this.t) {
                this.b.setMinWidth(0);
            }
            return this.f;
        }

        /*
         * Enabled aggressive block sorting
         */
        @Override
        public final void b() {
            RelativeLayout relativeLayout;
            if (this.f != null) {
                relativeLayout = this.f;
                int n2 = this.g == null || this.g == i.this.a[i.this.c].s ? 0 : 8;
                relativeLayout.setVisibility(n2);
            }
            float f2 = i.this.a[i.this.c].t[this.h].b;
            relativeLayout = this.a;
            boolean bl = i.this.a[i.this.c].t[this.h].e == 0;
            relativeLayout.setEnabled(bl);
            this.a.setMax(i.this.l);
            if (Gene.x[this.h] == 0.0f) {
                this.a.setProgress(i.this.a(f2 * 8.0f, true));
                return;
            }
            this.a.setProgress(i.this.a(f2 * 8.0f, false));
        }

        /*
         * Enabled aggressive block sorting
         */
        public final void onProgressChanged(SeekBar seekBar, int n2, boolean bl) {
            if (bl) {
                i.this.a[i.this.c].t[this.h].b = Gene.x[this.h] == 0.0f ? 2.0f * i.this.a(n2, true) / 8.0f - 1.0f : i.this.a(n2, false) / 8.0f;
                i.this.a();
                seekBar = (TextView)i.this.getActivity().findViewById(2131230952);
                if (seekBar != null) {
                    seekBar.setText((CharSequence)String.format(this.i + ": %1$,.2f", Float.valueOf(Gene.x[this.h] + (Gene.y[this.h] - Gene.x[this.h]) * (i.this.a[i.this.c].t[this.h].b * 0.5f + 0.5f))));
                }
            }
        }

        public final void onStartTrackingTouch(SeekBar seekBar) {
        }

        public final void onStopTrackingTouch(SeekBar seekBar) {
            seekBar = (TextView)i.this.getActivity().findViewById(2131230952);
            if (seekBar != null) {
                seekBar.setText((CharSequence)"");
            }
        }

        private final class a
        implements SeekBar.OnSeekBarChangeListener {
            Spinner a;
            Spinner b;
            RadioButton c;
            RadioButton d;
            AlertDialog.Builder e;
            final /* synthetic */ f f;

            /*
             * Enabled aggressive block sorting
             */
            public a(final f f2) {
                boolean bl = true;
                this.f = f2;
                Gene.a a2 = f2.i.this.a[f2.i.this.c].t[f2.h];
                this.e = new AlertDialog.Builder((Context)f2.i.this.getActivity());
                View view = f2.i.this.getActivity().getLayoutInflater().inflate(2131361831, null);
                this.a = (Spinner)view.findViewById(2131230902);
                this.b = (Spinner)view.findViewById(2131230900);
                String string = f2.i.this.getString(2131624237);
                Object object = f2.i.this.getString(2131624236);
                object = new ArrayAdapter((Context)f2.i.this.getActivity(), 2131361832, (Object[])new String[]{string, object});
                this.b.setAdapter((SpinnerAdapter)object);
                if (a2.e != 2) {
                    this.b.setSelection(0);
                } else {
                    this.b.setSelection(1);
                }
                this.b.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener(){

                    /*
                     * Enabled aggressive block sorting
                     */
                    public final void onItemSelected(AdapterView<?> seekBar, View view, int n2, long l2) {
                        boolean bl = true;
                        seekBar = a.this.f.s;
                        if (!a.this.d.isChecked() || a.this.b.getSelectedItemPosition() != 1) {
                            bl = false;
                        }
                        seekBar.setEnabled(bl);
                        a.this.a();
                    }

                    public final void onNothingSelected(AdapterView<?> adapterView) {
                    }
                });
                object = new ArrayAdapter((Context)f2.i.this.getActivity(), 2131361832);
                for (int i2 = 0; i2 < 4; ++i2) {
                    object.add((Object)Html.fromHtml((String)(f2.i.this.getString(2131624227) + (i2 + 1) + " [" + f2.i.this.getString(2131624228) + "]")));
                }
                object.add((Object)Html.fromHtml((String)(f2.i.this.getString(2131624365) + String.format(" / %1.1f ng", 3.5999999999999996))));
                object.add((Object)Html.fromHtml((String)(f2.i.this.getString(2131624363) + String.format(" / %1.0f h", 240.0))));
                object.add((Object)Html.fromHtml((String)f2.i.this.getString(2131624366)));
                object.add((Object)Html.fromHtml((String)(f2.i.this.getString(2131624364) + " / 20")));
                this.a.setAdapter((SpinnerAdapter)object);
                this.a.setSelection((int)a2.d);
                this.c = (RadioButton)view.findViewById(2131230821);
                this.d = (RadioButton)view.findViewById(2131230822);
                object = this.c;
                boolean bl2 = a2.e == 0;
                object.setChecked(bl2);
                object = this.d;
                bl2 = a2.e != 0;
                object.setChecked(bl2);
                this.c.setOnClickListener(new View.OnClickListener(){

                    public final void onClick(View view) {
                        a.this.f.p.setEnabled(true);
                        a.this.a.setEnabled(false);
                        a.this.b.setEnabled(false);
                        a.this.f.q.setEnabled(false);
                        a.this.f.r.setEnabled(false);
                        a.this.f.s.setEnabled(false);
                    }
                });
                this.d.setOnClickListener(new View.OnClickListener(){

                    /*
                     * Enabled aggressive block sorting
                     */
                    public final void onClick(View view) {
                        boolean bl = true;
                        a.this.a.setEnabled(true);
                        a.this.b.setEnabled(true);
                        a.this.f.p.setEnabled(false);
                        a.this.f.q.setEnabled(true);
                        a.this.f.r.setEnabled(true);
                        a.this.f.s.setEnabled(true);
                        view = a.this.f.s;
                        if (!a.this.d.isChecked() || a.this.b.getSelectedItemPosition() != 1) {
                            bl = false;
                        }
                        view.setEnabled(bl);
                    }
                });
                f2.c = (TextView)view.findViewById(2131230959);
                f2.d = (TextView)view.findViewById(2131230955);
                f2.n = (TextView)view.findViewById(2131230956);
                f2.o = (TextView)view.findViewById(2131230957);
                f2.p = (SeekBar)view.findViewById(2131230901);
                f2.q = (SeekBar)view.findViewById(2131230897);
                f2.r = (SeekBar)view.findViewById(2131230898);
                f2.s = (SeekBar)view.findViewById(2131230899);
                f2.p.setOnSeekBarChangeListener((SeekBar.OnSeekBarChangeListener)this);
                f2.q.setOnSeekBarChangeListener((SeekBar.OnSeekBarChangeListener)this);
                f2.r.setOnSeekBarChangeListener((SeekBar.OnSeekBarChangeListener)this);
                f2.s.setOnSeekBarChangeListener((SeekBar.OnSeekBarChangeListener)this);
                f2.p.setMax(f2.i.this.l);
                f2.q.setMax(f2.i.this.l);
                f2.r.setMax(f2.i.this.l);
                f2.s.setMax(f2.i.this.l);
                object = f2.p;
                bl2 = a2.e == 0;
                object.setEnabled(bl2);
                object = f2.q;
                bl2 = a2.e != 0;
                object.setEnabled(bl2);
                object = f2.r;
                bl2 = a2.e != 0;
                object.setEnabled(bl2);
                object = f2.s;
                bl2 = a2.e == 2;
                object.setEnabled(bl2);
                object = this.a;
                bl2 = a2.e != 0;
                object.setEnabled(bl2);
                object = this.b;
                bl2 = a2.e != 0;
                object.setEnabled(bl2);
                string = f2.p;
                object = f2.i.this;
                float f3 = f2.i.this.a[f2.i.this.c].t[f2.h].b;
                bl2 = Gene.x[f2.h] == 0.0f ? bl : false;
                string.setProgress(((i)object).a(f3 * 8.0f, bl2));
                if (a2.e == 2) {
                    f2.q.setProgress(f2.i.this.a(f2.i.this.a[f2.i.this.c].t[f2.h].a * 8.0f, false));
                    f2.r.setProgress(f2.i.this.a(f2.i.this.a[f2.i.this.c].t[f2.h].b * 8.0f, false));
                } else {
                    f2.q.setProgress(f2.i.this.a(f2.i.this.a[f2.i.this.c].t[f2.h].a, false));
                    f2.r.setProgress(f2.i.this.a(f2.i.this.a[f2.i.this.c].t[f2.h].b, false));
                }
                f2.s.setProgress(f2.i.this.a(f2.i.this.a[f2.i.this.c].t[f2.h].c * 8.0f, false));
                this.e.setView(view);
                this.e.setNegativeButton((CharSequence)f2.i.this.getActivity().getString(2131624027), new DialogInterface.OnClickListener(){

                    public final void onClick(DialogInterface dialogInterface, int n2) {
                        dialogInterface.cancel();
                    }
                });
                this.e.setNeutralButton((CharSequence)f2.i.this.getActivity().getString(2131624029), new DialogInterface.OnClickListener(){

                    /*
                     * Enabled aggressive block sorting
                     */
                    public final void onClick(DialogInterface dialogInterface, int n2) {
                        boolean bl = true;
                        Gene.a a2 = a.this.f.i.this.a[a.this.f.i.this.c].t[a.this.f.h];
                        if (a.this.c.isChecked()) {
                            a2.e = (short)(false ? 1 : 0);
                            a2.a = 0.0f;
                            i i2 = a.this.f.i.this;
                            n2 = a.this.f.p.getProgress();
                            if (Gene.x[a.this.f.h] != 0.0f) {
                                bl = false;
                            }
                            a2.b = i2.a(n2, bl) / 8.0f;
                            if (Gene.x[a.this.f.h] == 0.0f) {
                                a2.b = 2.0f * a2.b - 1.0f;
                            }
                            a2.c = 0.0f;
                        } else {
                            a2.d = (short)a.this.a.getSelectedItemPosition();
                            if (a.this.b.getSelectedItemPosition() == 1) {
                                a2.e = (short)2;
                                a2.a = a.this.f.i.this.a(a.this.f.q.getProgress(), false) / 8.0f;
                                a2.b = a.this.f.i.this.a(a.this.f.r.getProgress(), false) / 8.0f;
                                a2.c = a.this.f.i.this.a(a.this.f.s.getProgress(), false) / 8.0f;
                            } else {
                                a2.e = (short)(true ? 1 : 0);
                                a2.a = a.this.f.i.this.a(a.this.f.q.getProgress(), false);
                                a2.b = a.this.f.i.this.a(a.this.f.r.getProgress(), false);
                                a2.c = a.this.f.i.this.a(a.this.f.s.getProgress(), false);
                            }
                        }
                        dialogInterface.cancel();
                        f2.b();
                        a.this.f.i.this.a();
                        if (a2.d == 0 && (double)Math.abs(a2.a - 8.0f) < 0.25 && (double)Math.abs(a2.b + 1.0f) < 0.15) {
                            com.saterskog.cell_lab.t.b(a.this.f.i.this.getActivity(), 3, 2);
                        }
                    }
                });
                this.a();
            }

            /*
             * Enabled aggressive block sorting
             */
            final void a() {
                float f2 = (Gene.y[this.f.h] + Gene.x[this.f.h]) * 0.5f;
                float f3 = (Gene.y[this.f.h] - Gene.x[this.f.h]) * 0.5f;
                String string = "2";
                if (!this.f.i.this.h) {
                    string = "3";
                }
                if (Gene.x[this.f.h] == 0.0f) {
                    TextView textView = this.f.c;
                    String string2 = this.f.i.this.getString(2131624240) + " = %1$,." + string + "f";
                    float f4 = Gene.x[this.f.h];
                    float f5 = Gene.y[this.f.h];
                    float f6 = Gene.x[this.f.h];
                    i i2 = this.f.i.this;
                    int n2 = this.f.p.getProgress();
                    boolean bl = Gene.x[this.f.h] == 0.0f;
                    textView.setText((CharSequence)String.format(string2, Float.valueOf(i2.a(n2, bl) * (f5 - f6) / 8.0f + f4)));
                } else {
                    TextView textView = this.f.c;
                    String string3 = this.f.i.this.getString(2131624240) + " = %1$,." + string + "f";
                    i i3 = this.f.i.this;
                    int n3 = this.f.p.getProgress();
                    boolean bl = Gene.x[this.f.h] == 0.0f;
                    textView.setText((CharSequence)String.format(string3, Float.valueOf(i3.a(n3, bl) * f3 / 8.0f + f2)));
                }
                if (this.b.getSelectedItemPosition() == 0) {
                    this.f.d.setText((CharSequence)String.format(this.f.i.this.getString(2131624230) + " = %1$,." + string + "f", Float.valueOf(this.f.i.this.a(this.f.q.getProgress(), false) * f3)));
                    this.f.n.setText((CharSequence)String.format(this.f.i.this.getString(2131624232) + " = %1$,." + string + "f", Float.valueOf(f2 + f3 * this.f.i.this.a(this.f.r.getProgress(), false))));
                } else {
                    this.f.d.setText((CharSequence)String.format(this.f.i.this.getString(2131624230) + " = %1$,." + string + "f", Float.valueOf(this.f.i.this.a(this.f.q.getProgress(), false) * f3 / 8.0f + f2)));
                    this.f.n.setText((CharSequence)String.format(this.f.i.this.getString(2131624232) + " = %1$,." + string + "f", Float.valueOf(f2 + f3 * this.f.i.this.a(this.f.r.getProgress(), false) / 8.0f)));
                }
                this.f.o.setText((CharSequence)String.format(this.f.i.this.getString(2131624234) + " = %1$,." + string + "f", Float.valueOf(this.f.i.this.a(this.f.s.getProgress(), false) / 8.0f)));
            }

            public final void onProgressChanged(SeekBar seekBar, int n2, boolean bl) {
                this.a();
                this.f.i.this.a();
            }

            public final void onStartTrackingTouch(SeekBar seekBar) {
            }

            public final void onStopTrackingTouch(SeekBar seekBar) {
            }
        }
    }
}

