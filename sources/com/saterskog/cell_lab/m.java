package com.saterskog.cell_lab;

import android.app.AlertDialog;
import android.app.Fragment;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import com.saterskog.cell_lab.j;

public final class m extends Fragment implements View.OnClickListener {
    /* access modifiers changed from: package-private */
    public TextView a;
    public int b;
    public int c;
    boolean d;
    boolean e;

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.d = false;
        this.e = j.b(this.b, (Context) getActivity());
        this.c = j.a((Context) getActivity()).get(this.b).i;
        if (this.c != -1) {
            View inflate = layoutInflater.inflate(C0028R.layout.fragment_objective_tut, viewGroup, false);
            this.a = null;
            ((TextView) inflate.findViewById(C0028R.id.text_objective_tut)).setText(getString(C0028R.string.tutorial_info));
            ((Button) inflate.findViewById(C0028R.id.button_popupagain)).setOnClickListener(this);
            return inflate;
        }
        View inflate2 = layoutInflater.inflate(C0028R.layout.fragment_objective, viewGroup, false);
        TextView textView = (TextView) inflate2.findViewById(C0028R.id.text_sample_info_objective);
        textView.setText(a(this.d, this.e, 0, 0, 0, 0, 0, 0, 0, 0, 0.0d, this.b, 0, 0, 0.0d, 0.0d, (int[]) null));
        this.a = (TextView) inflate2.findViewById(C0028R.id.text_sample_info_objective);
        ((TextView) inflate2.findViewById(C0028R.id.text_objective)).setText(j.d(this.b, getActivity()));
        final String e2 = j.e(this.b, getActivity());
        if (e2 == null) {
            ((Button) inflate2.findViewById(C0028R.id.hint_button)).setVisibility(8);
        } else {
            ((Button) inflate2.findViewById(C0028R.id.hint_button)).setOnClickListener(new View.OnClickListener() {
                public final void onClick(View view) {
                    AlertDialog.Builder builder = new AlertDialog.Builder(m.this.getActivity());
                    View inflate = m.this.getActivity().getLayoutInflater().inflate(C0028R.layout.help_dialog, (ViewGroup) null);
                    ((TextView) inflate.findViewById(C0028R.id.text_title)).setText(m.this.getString(C0028R.string.play_button_hint));
                    ((TextView) inflate.findViewById(C0028R.id.text_help)).setText(e2);
                    builder.setView(inflate);
                    builder.setNeutralButton(m.this.getString(C0028R.string.dialog_button_ok), new DialogInterface.OnClickListener() {
                        public final void onClick(DialogInterface dialogInterface, int i) {
                            dialogInterface.cancel();
                        }
                    });
                    builder.show();
                }
            });
        }
        final String g = j.g(this.b, getActivity());
        if (g == null) {
            ((Button) inflate2.findViewById(C0028R.id.spoiler_button)).setVisibility(8);
        } else {
            ((Button) inflate2.findViewById(C0028R.id.spoiler_button)).setOnClickListener(new View.OnClickListener() {
                public final void onClick(View view) {
                    AlertDialog.Builder builder = new AlertDialog.Builder(m.this.getActivity());
                    View inflate = m.this.getActivity().getLayoutInflater().inflate(C0028R.layout.help_dialog, (ViewGroup) null);
                    ((TextView) inflate.findViewById(C0028R.id.text_title)).setText(m.this.getString(C0028R.string.play_button_spoiler));
                    ((TextView) inflate.findViewById(C0028R.id.text_help)).setText(g);
                    builder.setView(inflate);
                    builder.setNeutralButton(m.this.getString(C0028R.string.dialog_button_ok), new DialogInterface.OnClickListener() {
                        public final void onClick(DialogInterface dialogInterface, int i) {
                            dialogInterface.cancel();
                        }
                    });
                    builder.show();
                }
            });
        }
        return inflate2;
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle != null) {
            this.b = bundle.getInt("challenge");
        }
    }

    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putInt("challenge", this.b);
    }

    /* access modifiers changed from: private */
    public String a(boolean z, boolean z2, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, double d2, int i9, int i10, int i11, double d3, double d4, int[] iArr) {
        String str = "";
        if (isAdded()) {
            if (z) {
                str = str + getString(C0028R.string.objective_challenge_completed);
            } else if (z2) {
                str = str + getString(C0028R.string.objective_challenge_previously_completed);
            } else {
                str = str + getString(C0028R.string.objective_challenge_not_completed);
            }
            j.a aVar = j.a((Context) null).get(i9);
            if (aVar.C != -1.0d) {
                str = str + "\n" + getString(C0028R.string.sample_info_age) + String.format("%1$,.1f", new Object[]{Double.valueOf(d2)}) + " " + getString(C0028R.string.hour_abbreviation) + " (0 - " + String.format("%1$,.1f", new Object[]{Double.valueOf(aVar.C)}) + ")";
            }
            if (aVar.q != -1) {
                str = (str + getString(C0028R.string.objective_inserted_cells)) + i10 + " (0 - " + aVar.q + ")";
            }
            if (aVar.A != -1) {
                str = (str + getString(C0028R.string.objective_removed_cells)) + i11 + " (0 - " + aVar.A + ")";
            }
            if (aVar.n > 0 && aVar.n != -1) {
                str = (str + getString(C0028R.string.objective_total_cells)) + i8 + " (" + aVar.n + " -  ∞)";
            }
            if (aVar.m > 0 && aVar.r != -1) {
                str = (str + getString(C0028R.string.objective_your_cells)) + i7 + " (" + aVar.m + " - " + aVar.r + ")";
            }
            if (aVar.m > 0 && aVar.r == -1) {
                str = (str + getString(C0028R.string.objective_your_cells)) + i7 + " (" + aVar.m + " - ∞)";
            }
            if (aVar.m <= 0 && aVar.r > 0) {
                str = (str + getString(C0028R.string.objective_your_cells)) + i7 + " (0 - " + aVar.r + ")";
            }
            if (aVar.m <= 0 && aVar.r == 0) {
                str = (str + getString(C0028R.string.objective_your_cells)) + i7 + " (0)";
            }
            if (!(aVar.o == -1 && aVar.p == -1)) {
                str = str + getString(C0028R.string.objective_initial_cells) + (i + i2) + a(aVar.p, aVar.o);
            }
            if (!(aVar.v == -1 && aVar.w == -1)) {
                str = str + getString(C0028R.string.objective_red_initial_cells) + i4 + a(aVar.w, aVar.v);
            }
            if (aVar.z != -1) {
                str = str + getString(C0028R.string.objective_black_initial_cells) + i6 + a(0, aVar.z);
            }
            if (!(aVar.x == -1 && aVar.y == -1)) {
                str = str + getString(C0028R.string.objective_yellow_initial_cells) + i5 + a(aVar.y, aVar.x);
            }
            if (!(aVar.s == -1 && aVar.t == -1)) {
                str = (str + getString(C0028R.string.objective_infected_initial_cells)) + i2 + a(aVar.s, aVar.t);
            }
            if (aVar.l != -1) {
                str = (str + getString(C0028R.string.objective_hybrid_cells)) + i3 + a(aVar.l, -1);
            }
            if (aVar.B != -1.0d) {
                str = str + getString(C0028R.string.objective_limits_satisfied_time) + String.format("%1$,.1f", new Object[]{Double.valueOf(d4 - d3)}) + " " + getString(C0028R.string.hour_abbreviation) + " (" + String.format("%1$,.1f", new Object[]{Double.valueOf(aVar.B)}) + " " + getString(C0028R.string.hour_abbreviation) + ")";
            }
            for (int i12 = 0; i12 < h.B.length; i12++) {
                if (aVar.k[i12] > 0 && iArr != null) {
                    str = str + "\n" + getResources().getStringArray(C0028R.array.cell_type_names_plural)[i12] + ": " + iArr[i12] + " (0 -" + aVar.k[i12] + ")";
                }
            }
        }
        return str;
    }

    public final void onClick(View view) {
        switch (view.getId()) {
            case C0028R.id.button_popupagain /*2131230744*/:
                t.a(getActivity());
                return;
            default:
                return;
        }
    }

    private static String a(int i, int i2) {
        if (i == i2) {
            return " (" + i + ")";
        }
        if (i != -1 && i2 != -1) {
            return " (" + i + " - " + i2 + ")";
        }
        if (i == -1 || i2 != -1) {
            return " (0 - " + i2 + ")";
        }
        return " (" + i + " - ∞)";
    }
}
