package com.saterskog.cell_lab;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.ListFragment;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.content.FileProvider;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;
import com.saterskog.b.a;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.StreamCorruptedException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public final class f extends ListFragment implements AdapterView.OnItemLongClickListener {
    ArrayAdapter<String> a;
    ArrayList<String> b;
    int c = -1;

    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        this.b = new ArrayList<>();
        a();
        getListView().setChoiceMode(1);
        getListView().setOnItemLongClickListener(this);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return super.onCreateView(layoutInflater, viewGroup, bundle);
    }

    public final void onListItemClick(ListView listView, View view, int i, long j) {
        boolean z;
        int i2 = 0;
        Intent intent = new Intent(getActivity(), PlayActivity.class);
        boolean[] i3 = j.i(-1, getActivity());
        int length = i3.length;
        int i4 = 0;
        while (true) {
            if (i4 >= length) {
                z = false;
                break;
            } else if (i3[i4]) {
                z = true;
                break;
            } else {
                i4++;
            }
        }
        if (i != 0 || z) {
            if (i != 0) {
                i2 = 1;
            }
            intent.putExtra("old", i2);
            intent.putExtra("name", this.b.get(i));
            ((l) getActivity()).a(4);
            startActivity(intent);
            return;
        }
        Toast.makeText(getActivity(), "You currently do not have any genes available, finish a challenge first.", 1).show();
    }

    public final void onResume() {
        super.onResume();
        a();
        this.a.notifyDataSetChanged();
    }

    /* access modifiers changed from: package-private */
    public final void a() {
        String[] fileList = getActivity().fileList();
        Arrays.sort(fileList, new Comparator<String>() {
            public final /* synthetic */ int compare(Object obj, Object obj2) {
                return ((String) obj).compareToIgnoreCase((String) obj2);
            }
        });
        this.b.clear();
        this.b.add("");
        for (String str : fileList) {
            if (str.endsWith(".substrate")) {
                this.b.add(str.substring(0, str.length() - 10));
            }
        }
        this.a = new ArrayAdapter<String>(getActivity(), this.b) {
            public final View getView(int i, View view, ViewGroup viewGroup) {
                View view2 = super.getView(i, view, viewGroup);
                TextView textView = (TextView) view2.findViewById(16908308);
                TextView textView2 = (TextView) view2.findViewById(16908309);
                if (i == 0) {
                    textView.setText(f.this.getString(C0028R.string.freezer_new_plate));
                    textView.setTextColor(view2.getResources().getColor(C0028R.color.highlight));
                    textView2.setText(f.this.getString(C0028R.string.freezer_long_press));
                } else {
                    textView.setTextColor(-789517);
                    textView.setText(f.this.b.get(i));
                    try {
                        ObjectInputStream objectInputStream = new ObjectInputStream(f.this.getActivity().openFileInput(f.a(f.this.b.get(i))));
                        if (objectInputStream.readInt() <= 3054) {
                            double readDouble = objectInputStream.readDouble();
                            textView2.setText(f.this.getString(C0028R.string.sample_info_cells) + Integer.toString(objectInputStream.readInt()) + ", " + f.this.getString(C0028R.string.freezer_unfrozen_age) + " " + String.format("%1$,.1f", new Object[]{Double.valueOf(readDouble)}) + " " + f.this.getString(C0028R.string.hour_abbreviation));
                        } else {
                            textView2.setText(f.this.getString(C0028R.string.toast_file_is_newer_version));
                            textView2.setTextColor(-65536);
                        }
                        objectInputStream.close();
                    } catch (StreamCorruptedException e) {
                        a.a((Throwable) e);
                        textView2.setText("Error reading substrate");
                    } catch (FileNotFoundException e2) {
                        a.a((Throwable) e2);
                        textView2.setText("Error reading substrate");
                    } catch (IOException e3) {
                        a.a("error io42 but now in ff");
                        a.a((Throwable) e3);
                        textView2.setText("Error reading substrate");
                    }
                }
                return view2;
            }
        };
        setListAdapter(this.a);
    }

    public static String a(String str) {
        return str + ".substrate";
    }

    public final boolean onItemLongClick(AdapterView<?> adapterView, View view, int i, long j) {
        this.c = i;
        if (i == 0) {
            AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
            builder.setTitle(getString(C0028R.string.freezer_advanced_settings_title));
            View inflate = getActivity().getLayoutInflater().inflate(C0028R.layout.dialog_advanced, (ViewGroup) null);
            final TextView textView = (TextView) inflate.findViewById(C0028R.id.advanced_usage);
            final EditText editText = (EditText) inflate.findViewById(C0028R.id.edittext_cellnum);
            final EditText editText2 = (EditText) inflate.findViewById(C0028R.id.edittext_foodnum);
            final EditText editText3 = (EditText) inflate.findViewById(C0028R.id.edittext_diameter);
            AnonymousClass5 r0 = new TextWatcher() {
                public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
                }

                public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
                }

                public final void afterTextChanged(Editable editable) {
                    int i;
                    int i2;
                    double d2;
                    try {
                        i2 = Integer.parseInt(editText.getText().toString());
                        i = Integer.parseInt(editText2.getText().toString());
                        d2 = Double.parseDouble(editText3.getText().toString());
                    } catch (NumberFormatException e2) {
                        i = 0;
                        i2 = -1;
                        d2 = 0.0d;
                    }
                    if (i2 > 0 && d2 > 0.0d && i >= 0) {
                        Environment environment = new Environment();
                        environment.s = i;
                        environment.r = i2;
                        environment.k = d2;
                        textView.setText(" ≈ " + (CellWorld.a(environment) / 1048576) + " MB");
                    }
                }
            };
            editText.addTextChangedListener(r0);
            editText2.addTextChangedListener(r0);
            editText3.addTextChangedListener(r0);
            r0.afterTextChanged((Editable) null);
            builder.setView(inflate);
            builder.setPositiveButton(getString(C0028R.string.dialog_button_start), new DialogInterface.OnClickListener() {
                public final void onClick(DialogInterface dialogInterface, int i) {
                    int i2;
                    int i3;
                    double d2;
                    Intent intent = new Intent(f.this.getActivity(), PlayActivity.class);
                    intent.putExtra("old", false);
                    intent.putExtra("name", "");
                    try {
                        i3 = Integer.parseInt(editText.getText().toString());
                        i2 = Integer.parseInt(editText2.getText().toString());
                        d2 = Double.parseDouble(editText3.getText().toString());
                    } catch (NumberFormatException e) {
                        i2 = 0;
                        i3 = -1;
                        d2 = 0.0d;
                    }
                    if (i3 > 0 && d2 > 0.0d && i2 >= 0) {
                        intent.putExtra("maxCells", i3);
                        intent.putExtra("maxFoods", i2);
                        intent.putExtra("radius", d2);
                        f.this.startActivity(intent);
                    }
                }
            });
            builder.setNegativeButton(getString(C0028R.string.dialog_button_cancel), new DialogInterface.OnClickListener() {
                public final void onClick(DialogInterface dialogInterface, int i) {
                    dialogInterface.cancel();
                }
            });
            builder.show();
        } else {
            String[] strArr = {getString(C0028R.string.menu_item_delete), getString(C0028R.string.menu_item_rename), getString(C0028R.string.menu_item_share)};
            AlertDialog.Builder builder2 = new AlertDialog.Builder(getActivity());
            builder2.setTitle(this.b.get(i));
            builder2.setItems(strArr, new DialogInterface.OnClickListener() {
                public final void onClick(DialogInterface dialogInterface, int i) {
                    f fVar = f.this;
                    switch (i) {
                        case 0:
                            if (fVar.c != -1) {
                                new File(fVar.getActivity().getFilesDir(), f.a(fVar.b.get(fVar.c))).delete();
                                fVar.a();
                                fVar.a.notifyDataSetChanged();
                                return;
                            }
                            return;
                        case 1:
                            if (fVar.c != -1) {
                                File filesDir = fVar.getActivity().getFilesDir();
                                File file = new File(filesDir, f.a(fVar.b.get(fVar.c)));
                                AlertDialog.Builder builder = new AlertDialog.Builder(fVar.getActivity());
                                builder.setTitle(fVar.getString(C0028R.string.freezer_relabel));
                                EditText editText = new EditText(fVar.getActivity());
                                editText.setInputType(1);
                                editText.setText(fVar.b.get(fVar.c));
                                builder.setView(editText);
                                builder.setPositiveButton(fVar.getString(C0028R.string.dialog_button_ok), new DialogInterface.OnClickListener(editText, fVar.getActivity(), file, filesDir) {
                                    final /* synthetic */ EditText a;
                                    final /* synthetic */ Activity b;
                                    final /* synthetic */ File c;
                                    final /* synthetic */ File d;

                                    {
                                        this.a = r2;
                                        this.b = r3;
                                        this.c = r4;
                                        this.d = r5;
                                    }

                                    public final void onClick(DialogInterface dialogInterface, int i) {
                                        String a2 = f.a(this.a.getText().toString());
                                        for (String equals : f.this.getActivity().fileList()) {
                                            if (equals.equals(a2)) {
                                                Toast makeText = Toast.makeText(this.b, f.this.getString(C0028R.string.freezer_bad_name), 1);
                                                ((TextView) makeText.getView().findViewById(16908299)).setTextColor(-65536);
                                                makeText.show();
                                                return;
                                            }
                                        }
                                        try {
                                            this.c.renameTo(new File(this.d, a2));
                                            f.this.a();
                                        } catch (IllegalArgumentException e2) {
                                            Toast makeText2 = Toast.makeText(this.b, f.this.getString(C0028R.string.toast_bad_name), 1);
                                            ((TextView) makeText2.getView().findViewById(16908299)).setTextColor(-65536);
                                            makeText2.show();
                                        }
                                    }
                                });
                                builder.setNegativeButton(fVar.getString(C0028R.string.dialog_button_cancel), new DialogInterface.OnClickListener() {
                                    public final void onClick(DialogInterface dialogInterface, int i) {
                                        dialogInterface.cancel();
                                    }
                                });
                                builder.show();
                                fVar.a();
                                fVar.a.notifyDataSetChanged();
                                return;
                            }
                            return;
                        case 2:
                            if (fVar.c != -1) {
                                a.a("user_action", "share_plate", a.b((Context) fVar.getActivity()), fVar.getActivity());
                                Intent intent = new Intent("android.intent.action.SEND");
                                intent.setType("message/rfc822");
                                intent.putExtra("android.intent.extra.SUBJECT", fVar.getString(C0028R.string.email_substrate_title));
                                intent.putExtra("android.intent.extra.TEXT", fVar.getString(C0028R.string.email_substrate_body) + fVar.getResources().getString(C0028R.string.app_name) + " " + fVar.getString(C0028R.string.email_download_game_AT_url) + " " + fVar.getResources().getString(C0028R.string.play_store));
                                intent.putExtra("android.intent.extra.STREAM", FileProvider.a(fVar.getActivity(), "com.saterskog.cell_lab.MainMenuLab", new File(fVar.getActivity().getFilesDir(), f.a(fVar.b.get(fVar.c)))));
                                intent.addFlags(1);
                                try {
                                    fVar.startActivity(Intent.createChooser(intent, fVar.getString(C0028R.string.email_intent_title)));
                                    return;
                                } catch (ActivityNotFoundException e) {
                                    Toast.makeText(fVar.getActivity(), fVar.getString(C0028R.string.toast_no_email_clients), 0).show();
                                    return;
                                }
                            } else {
                                return;
                            }
                        default:
                            return;
                    }
                }
            });
            AlertDialog create = builder2.create();
            create.show();
            create.findViewById(create.getContext().getResources().getIdentifier("android:id/titleDivider", (String) null, (String) null)).setBackgroundColor(getResources().getColor(C0028R.color.border));
        }
        return true;
    }
}
