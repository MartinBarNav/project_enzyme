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
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
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

public final class g extends ListFragment {
    ArrayAdapter<String> a;
    ArrayList<String> b;
    int c = -1;

    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        this.b = new ArrayList<>();
        a();
        getListView().setChoiceMode(1);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View onCreateView = super.onCreateView(layoutInflater, viewGroup, bundle);
        registerForContextMenu(onCreateView);
        return onCreateView;
    }

    public final void onListItemClick(ListView listView, View view, int i, long j) {
        this.c = i;
        String[] strArr = {getString(C0028R.string.menu_item_delete), getString(C0028R.string.menu_item_rename), getString(C0028R.string.menu_item_share)};
        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
        builder.setTitle(this.b.get(i));
        builder.setItems(strArr, new DialogInterface.OnClickListener() {
            public final void onClick(DialogInterface dialogInterface, int i) {
                g gVar = g.this;
                switch (i) {
                    case 0:
                        if (gVar.c != -1) {
                            new File(gVar.getActivity().getFilesDir(), g.a(gVar.b.get(gVar.c))).delete();
                            gVar.a();
                            gVar.a.notifyDataSetChanged();
                            return;
                        }
                        return;
                    case 1:
                        if (gVar.c != -1) {
                            File filesDir = gVar.getActivity().getFilesDir();
                            File file = new File(filesDir, g.a(gVar.b.get(gVar.c)));
                            AlertDialog.Builder builder = new AlertDialog.Builder(gVar.getActivity());
                            builder.setTitle(gVar.getString(C0028R.string.dialog_rename_genome_title));
                            EditText editText = new EditText(gVar.getActivity());
                            editText.setInputType(1);
                            editText.setText(gVar.b.get(gVar.c));
                            builder.setView(editText);
                            builder.setPositiveButton(gVar.getString(C0028R.string.dialog_button_ok), new DialogInterface.OnClickListener(editText, gVar.getActivity(), file, filesDir) {
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
                                    String a2 = g.a(this.a.getText().toString());
                                    for (String equals : g.this.getActivity().fileList()) {
                                        if (equals.equals(a2)) {
                                            Toast makeText = Toast.makeText(this.b, g.this.getString(C0028R.string.toast_label_already_in_freeer), 1);
                                            ((TextView) makeText.getView().findViewById(16908299)).setTextColor(-65536);
                                            makeText.show();
                                            return;
                                        }
                                    }
                                    try {
                                        this.c.renameTo(new File(this.d, a2));
                                        g.this.a();
                                    } catch (IllegalArgumentException e2) {
                                        Toast makeText2 = Toast.makeText(this.b, g.this.getString(C0028R.string.toast_bad_name), 1);
                                        ((TextView) makeText2.getView().findViewById(16908299)).setTextColor(-65536);
                                        makeText2.show();
                                    }
                                }
                            });
                            builder.setNegativeButton(gVar.getString(C0028R.string.dialog_cancel), new DialogInterface.OnClickListener() {
                                public final void onClick(DialogInterface dialogInterface, int i) {
                                    dialogInterface.cancel();
                                }
                            });
                            builder.show();
                            gVar.a.notifyDataSetChanged();
                            return;
                        }
                        return;
                    case 2:
                        if (gVar.c != -1) {
                            Intent intent = new Intent("android.intent.action.SEND");
                            intent.setType("message/rfc822");
                            intent.putExtra("android.intent.extra.SUBJECT", gVar.getString(C0028R.string.email_genome_title));
                            intent.putExtra("android.intent.extra.TEXT", gVar.getString(C0028R.string.email_genome_body) + gVar.getResources().getString(C0028R.string.app_name) + " at " + gVar.getResources().getString(C0028R.string.play_store));
                            intent.putExtra("android.intent.extra.STREAM", FileProvider.a(gVar.getActivity(), "com.saterskog.cell_lab.MainMenuLab", new File(gVar.getActivity().getFilesDir(), g.a(gVar.b.get(gVar.c)))));
                            intent.addFlags(1);
                            a.a("user_action", "share_genome", a.b((Context) gVar.getActivity()), gVar.getActivity());
                            try {
                                gVar.startActivity(Intent.createChooser(intent, gVar.getString(C0028R.string.email_intent_title)));
                                return;
                            } catch (ActivityNotFoundException e) {
                                Toast.makeText(gVar.getActivity(), gVar.getString(C0028R.string.toast_no_email_clients), 0).show();
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
        AlertDialog create = builder.create();
        create.show();
        create.findViewById(create.getContext().getResources().getIdentifier("android:id/titleDivider", (String) null, (String) null)).setBackgroundColor(getResources().getColor(C0028R.color.border));
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
        for (int i = 0; i < fileList.length; i++) {
            if (fileList[i].endsWith(".genome")) {
                this.b.add(b(fileList[i]));
            }
        }
        this.a = new ArrayAdapter<String>(getActivity(), this.b) {
            public final View getView(int i, View view, ViewGroup viewGroup) {
                View view2 = super.getView(i, view, viewGroup);
                TextView textView = (TextView) view2.findViewById(16908308);
                String str = g.this.b.get(i);
                try {
                    ObjectInputStream objectInputStream = new ObjectInputStream(g.this.getActivity().openFileInput(g.a(str)));
                    if (objectInputStream.readInt() <= 3054) {
                        textView.setText(str);
                    } else {
                        textView.setText(str + ", " + g.this.getString(C0028R.string.toast_file_is_newer_version));
                        textView.setTextColor(-65536);
                    }
                    objectInputStream.close();
                } catch (StreamCorruptedException e) {
                    e.printStackTrace();
                } catch (FileNotFoundException e2) {
                    e2.printStackTrace();
                } catch (IOException e3) {
                    e3.printStackTrace();
                }
                return view2;
            }
        };
        setListAdapter(this.a);
    }

    public static ArrayList<String> a(Context context) {
        ArrayList<String> arrayList = new ArrayList<>();
        String[] fileList = context.fileList();
        Arrays.sort(fileList, new Comparator<String>() {
            public final /* synthetic */ int compare(Object obj, Object obj2) {
                return ((String) obj).compareToIgnoreCase((String) obj2);
            }
        });
        for (int i = 0; i < fileList.length; i++) {
            if (fileList[i].endsWith(".genome")) {
                arrayList.add(b(fileList[i]));
            }
        }
        return arrayList;
    }

    public static String a(String str) {
        return str + ".genome";
    }

    private static String b(String str) {
        return str.substring(0, str.length() - 7);
    }
}
