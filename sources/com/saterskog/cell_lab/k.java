package com.saterskog.cell_lab;

import android.app.AlertDialog;
import android.app.ListFragment;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.text.Html;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;
import java.util.Locale;

public final class k extends ListFragment implements AdapterView.OnItemLongClickListener {
    ArrayAdapter<String> a;

    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        this.a = new ArrayAdapter<String>(getActivity(), j.b(getActivity())) {
            public final View getView(int i, View view, ViewGroup viewGroup) {
                boolean z;
                String str;
                String str2;
                String str3;
                String str4;
                View view2 = super.getView(i, view, viewGroup);
                TextView textView = (TextView) view2.findViewById(16908308);
                TextView textView2 = (TextView) view2.findViewById(16908309);
                int c = j.c(k.this.getActivity());
                int i2 = j.a((Context) k.this.getActivity()).get(i).i;
                if (c == -1 || c >= i) {
                    z = true;
                } else {
                    z = false;
                }
                if (!z) {
                    textView.setTextColor(-8355712);
                } else {
                    textView.setTextColor(-1);
                }
                if (i2 != -1) {
                    textView.setText((CharSequence) getItem(i));
                    String str5 = "";
                    if (!z) {
                        str5 = str5 + "<font color=#808080>";
                    }
                    String str6 = str5 + j.a((Context) k.this.getActivity()).get(i).c;
                    if (!z) {
                        str6 = str6 + "</font>";
                    }
                    textView2.setText(Html.fromHtml(str6));
                } else {
                    textView.setText(Integer.toString(j.a(i, (Context) k.this.getActivity()) + 1) + ": " + ((String) getItem(i)));
                    if (j.b(i, (Context) k.this.getActivity())) {
                        str = ("" + "<font color=#38A10B>") + k.this.getString(C0028R.string.objective_challenge_completed) + ".</font>";
                    } else if (c == -1 || i <= c) {
                        str = ("" + "<font color=#A1A138>") + k.this.getString(C0028R.string.challenges_challenge_not_completed) + "</font>";
                    } else {
                        str = ("" + "<font color=#A13838>") + k.this.getString(C0028R.string.chalenges_finish_first_1) + " " + (j.a(c, (Context) k.this.getActivity()) + 1) + " " + k.this.getString(C0028R.string.challenges_finish_first_2) + "</font>";
                    }
                    if (!z) {
                        str = str + "<font color=#808080>";
                    }
                    int f = j.f(i, k.this.getActivity());
                    if (f == 0) {
                        str = str + " " + k.this.getActivity().getString(C0028R.string.difficulty_level_0);
                    }
                    if (f == 1) {
                        str = str + " " + k.this.getActivity().getString(C0028R.string.difficulty_level_1);
                    }
                    if (f == 2) {
                        str = str + " " + k.this.getActivity().getString(C0028R.string.difficulty_level_2);
                    }
                    if (f == 3) {
                        str = str + " " + k.this.getActivity().getString(C0028R.string.difficulty_level_3);
                    }
                    if (!z) {
                        str2 = str + "</font>";
                    } else {
                        str2 = str;
                    }
                    if (j.a((Context) k.this.getActivity()).get(i).g != null) {
                        String str7 = "";
                        String[] strArr = j.a((Context) k.this.getActivity()).get(i).g;
                        for (int i3 = 0; i3 < strArr.length; i3++) {
                            str7 = str7 + h.B[h.valueOf(strArr[i3].toUpperCase(Locale.ENGLISH)).ordinal()].a(k.this.getActivity()) + ", ";
                        }
                        String substring = str7.substring(0, str7.length() - 2);
                        if (z) {
                            str4 = str2 + "<br> <font color=#FFAA00>";
                        } else {
                            str4 = str2 + "<br> <font color=#808080>";
                        }
                        str2 = (str4 + k.this.getString(C0028R.string.challenges_unlocks) + " " + substring) + k.this.getActivity().getString(C0028R.string.unlocks_further_challenges) + "</font>";
                    }
                    int i4 = j.a((Context) k.this.getActivity()).get(i).j;
                    if (i4 != -1) {
                        if (z) {
                            str3 = str2 + "<br> <font color=#FFAA00>";
                        } else {
                            str3 = str2 + "<br> <font color=#808080>";
                        }
                        String str8 = null;
                        if (i4 == 0) {
                            str8 = k.this.getString(C0028R.string.unlock_feature_more_params);
                        }
                        if (i4 == 1) {
                            str8 = k.this.getString(C0028R.string.unlock_feature_more_genome_params);
                        }
                        if (i4 == 2) {
                            str8 = k.this.getString(C0028R.string.unlock_feature_more_programmable_params);
                        }
                        str2 = (str3 + k.this.getString(C0028R.string.unlocks_before_feature) + " " + str8) + "</font>";
                    }
                    textView2.setText(Html.fromHtml(str2));
                    textView2.setPadding(0, 0, 0, 16);
                }
                return view2;
            }
        };
        setListAdapter(this.a);
        getListView().setOnItemLongClickListener(this);
    }

    public final void onResume() {
        super.onResume();
        j.a();
        this.a.notifyDataSetChanged();
    }

    public final void onListItemClick(ListView listView, View view, int i, long j) {
        a(i, false);
    }

    /* access modifiers changed from: private */
    public void a(int i, boolean z) {
        int c = j.c(getActivity());
        if (c == -1 || i <= c) {
            ((l) getActivity()).a(4);
            Intent intent = new Intent(getActivity(), PlayActivity.class);
            intent.putExtra("experimentOnChallenge", z ? 1 : 0);
            intent.putExtra("challenge", i);
            getActivity().startActivityForResult(intent, 1);
            return;
        }
        Toast.makeText(getActivity(), getString(C0028R.string.chalenges_finish_first_1) + " " + (j.a(c, (Context) getActivity()) + 1) + " " + getString(C0028R.string.challenges_finish_first_2), 1).show();
        ((l) getActivity()).a(3);
    }

    public final boolean onItemLongClick(AdapterView<?> adapterView, View view, final int i, long j) {
        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
        builder.setTitle(C0028R.string.popup_title_study_challenge_sub);
        builder.setMessage(C0028R.string.popup_text_study_challenge_sub);
        builder.setPositiveButton(getString(C0028R.string.dialog_button_ok), new DialogInterface.OnClickListener() {
            public final void onClick(DialogInterface dialogInterface, int i) {
                k.this.a(i, true);
            }
        });
        builder.setNegativeButton(getString(C0028R.string.dialog_button_cancel), new DialogInterface.OnClickListener() {
            public final void onClick(DialogInterface dialogInterface, int i) {
                dialogInterface.cancel();
            }
        });
        AlertDialog create = builder.create();
        create.show();
        View findViewById = create.findViewById(create.getContext().getResources().getIdentifier("android:id/titleDivider", (String) null, (String) null));
        if (findViewById == null) {
            return true;
        }
        findViewById.setBackgroundColor(getResources().getColor(C0028R.color.border));
        return true;
    }
}
