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
import com.saterskog.cell_lab.q;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.StreamCorruptedException;
import java.util.concurrent.ExecutionException;

public final class p extends Fragment implements q.a {
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

    public interface a {
        void a(float f);

        void a(CellWorld cellWorld);

        void a(CellWorld cellWorld, boolean z);

        void a(short s);

        Environment c();

        Gene[] f();

        boolean g();
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        TextView textView;
        int i2;
        super.onCreateView(layoutInflater, viewGroup, bundle);
        if (bundle != null) {
            try {
                this.g = (CellWorld) bundle.getParcelable("mCellWorld");
                this.f = bundle.getDouble("radius");
                this.c = bundle.getInt("challenge");
            } catch (OutOfMemoryError e2) {
                this.g = null;
                Toast.makeText(getActivity(), getString(C0028R.string.toast_out_of_memory), 1).show();
                getActivity().finish();
            }
        } else {
            Environment c2 = this.p.c();
            ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
            ((ActivityManager) getActivity().getSystemService("activity")).getMemoryInfo(memoryInfo);
            if (memoryInfo.availMem < CellWorld.a(c2)) {
                com.saterskog.b.a.a("Estimated memory to not be enough");
                throw new OutOfMemoryError();
            }
            this.g = new CellWorld(false, c2);
            if (this.j != null) {
                try {
                    int a2 = this.g.a(this.j);
                    if (this.c == -1 && this.k && a2 < 95) {
                        Toast.makeText(getActivity(), "format conversion v" + a2 + " → v95", 1).show();
                    }
                    if (this.c != -1) {
                        this.g.c(0);
                        this.g.M = 0.0d;
                    }
                    this.j.close();
                    if (this.l) {
                        this.g.c(0);
                    }
                } catch (FileNotFoundException e3) {
                    e3.printStackTrace();
                } catch (StreamCorruptedException e4) {
                    e4.printStackTrace();
                } catch (IOException e5) {
                    com.saterskog.b.a.a("io this is bad");
                    e5.printStackTrace();
                }
            }
        }
        this.f = this.g.e.k;
        RelativeLayout relativeLayout = new RelativeLayout(getActivity());
        if (this.g != null) {
            this.a = new r(getActivity(), this.g, this.p, this, this.c, this.f);
            this.a.setId(C0028R.id.scope_view);
            if (bundle != null) {
                this.a.a.z = bundle.getInt("mode");
                this.a.a.A = bundle.getInt("tool");
                this.a.a.M = bundle.getBoolean("hasWon");
            } else {
                this.a.a.A = this.e;
            }
            relativeLayout.addView(this.a);
        }
        int applyDimension = (int) TypedValue.applyDimension(1, 8.0f, getActivity().getResources().getDisplayMetrics());
        PlayActivity playActivity = (PlayActivity) getActivity();
        if (playActivity == null || playActivity.D == null) {
            textView = null;
            i2 = applyDimension;
        } else {
            TextView textView2 = new TextView(getActivity());
            textView2.setId(C0028R.id.scope_text_view_3);
            String string = PreferenceManager.getDefaultSharedPreferences(getActivity()).getString("log_stats", "none");
            String[] stringArray = getResources().getStringArray(C0028R.array.log_intervals);
            int i3 = 0;
            while (i3 < stringArray.length && !stringArray[i3].equals(string)) {
                i3++;
            }
            textView2.setText(getString(C0028R.string.logging_simulation_note_1) + getResources().getStringArray(C0028R.array.log_interval_names)[i3].toLowerCase() + getString(C0028R.string.logging_simulation_note_2) + playActivity.D.getAbsolutePath());
            textView2.setTextColor(-1);
            textView2.setTextSize(1, 14.0f);
            textView2.setBackgroundColor(Color.argb(192, 0, 0, 0));
            final File parentFile = playActivity.D.getParentFile();
            textView2.setOnClickListener(new View.OnClickListener() {
                public final void onClick(View view) {
                    Uri fromFile = Uri.fromFile(parentFile);
                    Intent intent = new Intent("android.intent.action.VIEW");
                    intent.setDataAndType(fromFile, "*/*");
                    intent.setPackage("com.android.chrome");
                    try {
                        p.this.startActivity(intent);
                    } catch (ActivityNotFoundException e) {
                        Toast.makeText(p.this.getActivity(), "Please install Chrome.", 1).show();
                    }
                }
            });
            textView2.setPadding(applyDimension, applyDimension, applyDimension, applyDimension);
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -2);
            layoutParams.addRule(12);
            relativeLayout.addView(textView2, layoutParams);
            textView = textView2;
            i2 = 0;
        }
        this.m = new TextView(getActivity());
        this.m.setTextColor(-1);
        this.m.setTextSize(1, 14.0f);
        this.m.setBackgroundColor(Color.argb(192, 0, 0, 0));
        this.m.setPadding(applyDimension, applyDimension, applyDimension, i2);
        this.m.setMinimumWidth(relativeLayout.getWidth() / 2);
        this.m.setVisibility(4);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-2, -2);
        RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(-2, -2);
        if (textView == null) {
            layoutParams2.addRule(12);
            layoutParams3.addRule(12);
        } else {
            layoutParams2.addRule(2, C0028R.id.scope_text_view_3);
            layoutParams3.addRule(2, C0028R.id.scope_text_view_3);
        }
        layoutParams2.addRule(9);
        this.m.setId(C0028R.id.scope_text_view_1);
        relativeLayout.addView(this.m, layoutParams2);
        this.n = new TextView(getActivity());
        this.n.setTextColor(-1);
        this.n.setTextSize(1, 14.0f);
        this.n.setBackgroundColor(Color.argb(192, 0, 0, 0));
        this.n.setPadding(applyDimension, applyDimension, applyDimension, i2);
        this.n.setMinimumWidth(relativeLayout.getWidth() / 2);
        this.n.setVisibility(4);
        layoutParams3.addRule(11);
        this.n.setId(C0028R.id.scope_text_view_2);
        layoutParams3.addRule(1, C0028R.id.scope_text_view_1);
        layoutParams3.addRule(6, C0028R.id.scope_text_view_1);
        relativeLayout.addView(this.n, layoutParams3);
        this.o = new TextView(getActivity());
        this.o.setTextColor(-16777216);
        this.o.setTextSize(1, 18.0f);
        this.o.setPadding(applyDimension, applyDimension, applyDimension, applyDimension);
        RelativeLayout.LayoutParams layoutParams4 = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams4.addRule(11);
        layoutParams4.addRule(10);
        relativeLayout.addView(this.o, layoutParams4);
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        this.b = (float) ((((double) displayMetrics.widthPixels) * 0.0254d) / ((double) (displayMetrics.density * 160.0f)));
        if (this.g != null) {
            a(this.a.a.A);
        }
        return relativeLayout;
    }

    public final void a(int i2) {
        int i3 = 0;
        if (this.m != null) {
            this.m.setVisibility(i2 == 4 ? 0 : 8);
        }
        if (this.m != null) {
            TextView textView = this.n;
            if (i2 != 4) {
                i3 = 8;
            }
            textView.setVisibility(i3);
        }
    }

    public final void a(CellWorld cellWorld, int i2) {
        final String str;
        final String str2;
        String string;
        if (isAdded()) {
            if (i2 != -1) {
                Cell cell = cellWorld.x[i2];
                str2 = (((("" + String.format(getString(C0028R.string.cell_info_age), new Object[]{Double.valueOf(cell.o)}) + "\n") + String.format(getString(C0028R.string.cell_info_mass), new Object[]{Double.valueOf(cell.w * 10.0d)}) + "\n") + String.format(getString(C0028R.string.cell_info_diameter), new Object[]{Double.valueOf(cell.d * 1000.0d)}) + "\n") + String.format(getString(C0028R.string.cell_info_nitro), new Object[]{Double.valueOf(cell.p * 100.0d)}) + "\n") + String.format(getString(C0028R.string.cell_info_toxins), new Object[]{Float.valueOf(cell.X)}) + " " + getString(C0028R.string.signal_substance_unit) + "\n";
                if (cell.Y != 0.0f) {
                    str2 = str2 + String.format(getString(C0028R.string.cell_info_injury), new Object[]{Float.valueOf(100.0f * cell.Y)});
                }
                if (cell.q != 0.0d) {
                    str2 = str2 + String.format(getString(C0028R.string.cell_info_lift), new Object[]{Double.valueOf(cell.q)});
                }
                if (j.a((Context) getActivity(), 2)) {
                    int i3 = 0;
                    while (i3 < 4) {
                        i3++;
                        str2 = str2 + "\n" + getString(C0028R.string.signal_substance_prefix) + (i3 + 1) + ": " + String.format("%.2f ", new Object[]{Double.valueOf(Math.min(1.0d, (double) Math.max(-1.0f, cell.U[i3])))}) + getString(C0028R.string.signal_substance_unit);
                    }
                }
                StringBuilder append = new StringBuilder().append(("" + getString(C0028R.string.cell_info_active_mode) + "<font color='" + String.format("#%02x%02x%02x", new Object[]{Integer.valueOf((int) (255.0f * cell.J[0])), Integer.valueOf((int) (255.0f * cell.J[1])), Integer.valueOf((int) (255.0f * cell.J[2]))}) + "'>M" + (cell.D + 1) + "</font><br>") + getString(C0028R.string.cell_info_type) + getResources().getStringArray(C0028R.array.cell_type_names)[cell.b().s.ordinal()] + "<br>").append(getString(C0028R.string.cell_info_mirrored));
                if (cell.y) {
                    string = getString(C0028R.string.value_true);
                } else {
                    string = getString(C0028R.string.value_false);
                }
                String str3 = append.append(string).append("<br>").toString() + getString(C0028R.string.cell_info_tag);
                if (cell.E == 1) {
                    str3 = str3 + getString(C0028R.string.cell_info_tag_user);
                }
                if (cell.E == 0) {
                    str3 = str3 + getString(C0028R.string.cell_info_tag_challenge);
                }
                if (cell.E == 2) {
                    str3 = str3 + getString(C0028R.string.cell_info_tag_contaminate);
                }
                if (cell.E == 4) {
                    str3 = str3 + getString(C0028R.string.cell_info_tag_infected_user);
                }
                if (cell.E == 3) {
                    str3 = str3 + getString(C0028R.string.cell_info_tag_infected_challenge);
                }
                if (cell.E == 5) {
                    str3 = str3 + getString(C0028R.string.cell_info_tag_infected_contaminate);
                }
                if (cell.E == 6) {
                    str3 = str3 + getString(C0028R.string.cell_info_tag_hybrid);
                }
                String str4 = (str3 + "<br>") + getString(C0028R.string.cell_info_mutations) + cell.G + "<br>";
                if (cell.T != -1) {
                    str4 = str4 + getString(C0028R.string.cell_info_telomeres) + cell.T + "<br>";
                }
                if (i2 != -1) {
                    h hVar = cell.b().s;
                    if (hVar == h.BUOYOCYTE) {
                        float a2 = cell.a(1, 0);
                        str = str + getString(C0028R.string.cell_info_density) + "ρ<sub><small>H<sub><small>2</small></sub>O</small></sub> " + (a2 < 0.0f ? "- " : "+ ") + String.format("%.0f", new Object[]{Float.valueOf(Math.abs(a2) * 100.0f)}) + " kg/m<sup><small>3</small></sup>";
                    }
                    if (hVar == h.FLAGELLOCYTE) {
                        str = (str + String.format(getString(C0028R.string.cell_info_swim_force), new Object[]{Float.valueOf(cell.a(0, 0) * 3.8580246f)})) + String.format(getString(C0028R.string.cell_info_speed), new Object[]{Double.valueOf(500.0d * Math.sqrt((cell.e * cell.e) + (cell.f * cell.f)))});
                    }
                    if (hVar == h.MYOCYTE) {
                        str = ((str + getString(C0028R.string.muscle_contract) + String.format(": %.2f", new Object[]{Float.valueOf(cell.a(3, 0))}) + "<br>") + getString(C0028R.string.muscle_bend) + String.format(": %.2f", new Object[]{Float.valueOf(cell.a(2, 0))}) + "<br>") + getString(C0028R.string.muscle_lift) + String.format(": %.2f", new Object[]{Float.valueOf(cell.a(4, 0))}) + "<br>";
                    }
                    if (hVar == h.LIPOCYTE) {
                        str = str + String.format(getString(C0028R.string.cell_info_lipids), new Object[]{Float.valueOf(cell.S * 10.0f)});
                    }
                    if (hVar == h.SECROCYTE) {
                        str = str + getString(C0028R.string.genome_editor_secretion) + ": ";
                        int b2 = cell.b(4);
                        if (b2 == 1) {
                            str = str + getString(C0028R.string.secrete_cyanide);
                        }
                        if (b2 == 0) {
                            str = str + getString(C0028R.string.secrete_food_smell);
                        }
                        if (b2 == 4) {
                            str = str + getString(C0028R.string.secrete_coated_food);
                        }
                        if (b2 == 2) {
                            str = str + getString(C0028R.string.secrete_type_lipase);
                        }
                        if (b2 == 3) {
                            str = str + getString(C0028R.string.secrete_protease);
                        }
                        if (b2 == 5) {
                            str = str + getString(C0028R.string.secrete_light);
                        }
                        if (b2 == 6) {
                            str = str + getString(C0028R.string.secrete_wall);
                        }
                        if (b2 >= 7 && b2 < 11) {
                            str = str + "-" + getString(C0028R.string.signal_substance_prefix) + ((b2 + 1) - 7);
                        }
                        if (b2 >= 7 && b2 >= 11) {
                            str = str + "+" + getString(C0028R.string.signal_substance_prefix) + (((b2 + 1) - 7) - 4);
                        }
                    }
                    if (hVar == h.SENSEOCYTE || hVar == h.STEREOCYTE) {
                        String str5 = str + getString(C0028R.string.ge_smell_type) + ": ";
                        int b3 = cell.b(3);
                        if (b3 == 0) {
                            str5 = str5 + getString(C0028R.string.smell_cell);
                        }
                        if (b3 == 5) {
                            str5 = str5 + getString(C0028R.string.smell_wall);
                        }
                        if (b3 == 3) {
                            str5 = str5 + getString(C0028R.string.smell_light);
                        }
                        if (b3 == 1) {
                            str5 = str5 + getString(C0028R.string.smell_food);
                        }
                        if (b3 == 2) {
                            str5 = str5 + getString(C0028R.string.smell_type_coated_food);
                        }
                        if (b3 == 4) {
                            str5 = str5 + getString(C0028R.string.smell_velocity);
                        }
                        str = str5 + "<br>";
                    }
                    if (hVar == h.NEUROCYTE || hVar == h.SENSEOCYTE || hVar == h.STEREOCYTE) {
                        for (int i4 = 0; i4 < 4; i4++) {
                            str = str + getString(C0028R.string.signal_substance_prefix) + (i4 + 1) + String.format(getString(C0028R.string.cell_info_S_production), new Object[]{Float.valueOf(cell.V[i4])}) + " " + getString(C0028R.string.signal_substance_unit) + "/" + getString(C0028R.string.hour_abbreviation) + "<br>";
                        }
                    }
                }
            } else {
                str2 = getString(C0028R.string.cell_info_select);
                str = "";
            }
            getActivity().runOnUiThread(new Runnable() {
                public final void run() {
                    p.this.m.setText(str2);
                    p.this.n.setText(Html.fromHtml(str));
                }
            });
        }
    }

    public final void a(CellWorld cellWorld) {
        if (this.p != null) {
            this.p.a(cellWorld);
        }
    }

    public final void a(float f2) {
        if (f2 == -1.0f) {
            this.o.setText("");
            return;
        }
        float f3 = this.b / f2;
        if (((double) f3) > 300.0d) {
            t.b(getActivity(), 0, 1);
        }
        if (1000.0f < f3) {
            int floor = (int) Math.floor(Math.log10((double) f3));
            this.o.setText(Html.fromHtml(String.format("%.2f·10<sup><small>%d</small></sup>×", new Object[]{Double.valueOf(((double) f3) * Math.pow(10.0d, (double) (-floor))), Integer.valueOf(floor)})));
            return;
        }
        this.o.setText(String.format("%.0f×", new Object[]{Float.valueOf(f3)}));
    }

    public final void onStart() {
        super.onStart();
    }

    public final void onStop() {
        super.onStop();
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

    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        q qVar = this.a.a;
        if (qVar.F != null) {
            try {
                qVar.F.get();
            } catch (InterruptedException e2) {
                e2.printStackTrace();
            } catch (ExecutionException e3) {
                e3.printStackTrace();
            }
        }
        try {
            bundle.putParcelable("mCellWorld", this.g);
            bundle.putDouble("radius", this.f);
            bundle.putInt("mode", this.a.a.z);
            bundle.putInt("tool", this.a.a.A);
            bundle.putInt("challenge", this.c);
            bundle.putBoolean("hasWon", this.a.a.M);
        } catch (OutOfMemoryError e4) {
            Toast.makeText(getActivity(), "Not enough memory", 1).show();
        }
    }

    public final void onAttach(Activity activity) {
        super.onAttach(activity);
        try {
            this.p = (a) activity;
        } catch (ClassCastException e2) {
            throw new ClassCastException(activity.toString() + " must implement CellProvider");
        }
    }
}
