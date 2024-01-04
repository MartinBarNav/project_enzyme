/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.app.AlertDialog$Builder
 *  android.app.ListFragment
 *  android.content.ActivityNotFoundException
 *  android.content.Context
 *  android.content.DialogInterface
 *  android.content.DialogInterface$OnClickListener
 *  android.content.Intent
 *  android.os.Bundle
 *  android.os.Parcelable
 *  android.text.Editable
 *  android.text.TextWatcher
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 *  android.widget.AdapterView
 *  android.widget.AdapterView$OnItemLongClickListener
 *  android.widget.ArrayAdapter
 *  android.widget.EditText
 *  android.widget.ListAdapter
 *  android.widget.ListView
 *  android.widget.TextView
 *  android.widget.Toast
 */
package com.saterskog.cell_lab;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.ListFragment;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.support.v4.content.FileProvider;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;
import com.saterskog.b.a;
import com.saterskog.cell_lab.CellWorld;
import com.saterskog.cell_lab.Environment;
import com.saterskog.cell_lab.PlayActivity;
import com.saterskog.cell_lab.j;
import com.saterskog.cell_lab.l;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.StreamCorruptedException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public final class f
extends ListFragment
implements AdapterView.OnItemLongClickListener {
    ArrayAdapter<String> a;
    ArrayList<String> b;
    int c = -1;

    public static String a(String string) {
        return string + ".substrate";
    }

    final void a() {
        String[] arrstring = this.getActivity().fileList();
        Arrays.sort(arrstring, new Comparator<String>(){

            @Override
            public final /* synthetic */ int compare(Object object, Object object2) {
                return ((String)object).compareToIgnoreCase((String)object2);
            }
        });
        this.b.clear();
        this.b.add("");
        for (String string : arrstring) {
            if (!string.endsWith(".substrate")) continue;
            this.b.add(string.substring(0, string.length() - 10));
        }
        this.a = new ArrayAdapter<String>((Context)this.getActivity(), this.b){

            /*
             * Enabled aggressive block sorting
             * Enabled unnecessary exception pruning
             * Enabled aggressive exception aggregation
             */
            public final View getView(int n2, View view, ViewGroup viewGroup) {
                view = super.getView(n2, view, viewGroup);
                Object object = (TextView)view.findViewById(16908308);
                viewGroup = (TextView)view.findViewById(16908309);
                if (n2 == 0) {
                    object.setText((CharSequence)f.this.getString(2131624075));
                    object.setTextColor(view.getResources().getColor(2131034160));
                    viewGroup.setText((CharSequence)f.this.getString(2131624074));
                    return view;
                }
                object.setTextColor(-789517);
                object.setText((CharSequence)f.this.b.get(n2));
                try {
                    object = new ObjectInputStream(f.this.getActivity().openFileInput(f.a(f.this.b.get(n2))));
                    if (((ObjectInputStream)object).readInt() <= 3054) {
                        double d2 = ((ObjectInputStream)object).readDouble();
                        n2 = ((ObjectInputStream)object).readInt();
                        StringBuilder stringBuilder = new StringBuilder();
                        viewGroup.setText((CharSequence)stringBuilder.append(f.this.getString(2131624196)).append(Integer.toString(n2)).append(", ").append(f.this.getString(2131624077)).append(" ").append(String.format("%1$,.1f", d2)).append(" ").append(f.this.getString(2131624145)).toString());
                    } else {
                        viewGroup.setText((CharSequence)f.this.getString(2131624342));
                        viewGroup.setTextColor(-65536);
                    }
                    ((ObjectInputStream)object).close();
                    return view;
                }
                catch (StreamCorruptedException streamCorruptedException) {
                    com.saterskog.b.a.a(streamCorruptedException);
                    viewGroup.setText((CharSequence)"Error reading substrate");
                    return view;
                }
                catch (FileNotFoundException fileNotFoundException) {
                    com.saterskog.b.a.a(fileNotFoundException);
                    viewGroup.setText((CharSequence)"Error reading substrate");
                    return view;
                }
                catch (IOException iOException) {
                    com.saterskog.b.a.a("error io42 but now in ff");
                    com.saterskog.b.a.a(iOException);
                    viewGroup.setText((CharSequence)"Error reading substrate");
                    return view;
                }
            }
        };
        this.setListAdapter((ListAdapter)this.a);
    }

    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        this.b = new ArrayList();
        this.a();
        this.getListView().setChoiceMode(1);
        this.getListView().setOnItemLongClickListener((AdapterView.OnItemLongClickListener)this);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return super.onCreateView(layoutInflater, viewGroup, bundle);
    }

    /*
     * WARNING - void declaration
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final boolean onItemLongClick(AdapterView<?> object, View object2, int n2, long l2) {
        void var3_5;
        this.c = var3_5;
        if (var3_5 == false) {
            AlertDialog.Builder builder = new AlertDialog.Builder((Context)this.getActivity());
            builder.setTitle((CharSequence)this.getString(2131624072));
            object = this.getActivity().getLayoutInflater().inflate(2131361821, null);
            final TextView textView = (TextView)object.findViewById(2131230737);
            final EditText editText = (EditText)object.findViewById(2131230775);
            final EditText editText2 = (EditText)object.findViewById(2131230777);
            final EditText editText3 = (EditText)object.findViewById(2131230776);
            TextWatcher textWatcher = new TextWatcher(){

                /*
                 * Enabled force condition propagation
                 * Lifted jumps to return sites
                 */
                public final void afterTextChanged(Editable object) {
                    double d2;
                    int n2;
                    int n3;
                    try {
                        n3 = Integer.parseInt(editText.getText().toString());
                        n2 = Integer.parseInt(editText2.getText().toString());
                        d2 = Double.parseDouble(editText3.getText().toString());
                        if (n3 <= 0) return;
                    }
                    catch (NumberFormatException numberFormatException) {
                        return;
                    }
                    if (!(d2 > 0.0)) return;
                    if (n2 < 0) return;
                    Environment environment = new Environment();
                    environment.s = n2;
                    environment.r = n3;
                    environment.k = d2;
                    long l2 = CellWorld.a(environment);
                    textView.setText((CharSequence)(" \u2248 " + l2 / 0x100000L + " MB"));
                }

                public final void beforeTextChanged(CharSequence charSequence, int n2, int n3, int n4) {
                }

                public final void onTextChanged(CharSequence charSequence, int n2, int n3, int n4) {
                }
            };
            editText.addTextChangedListener(textWatcher);
            editText2.addTextChangedListener(textWatcher);
            editText3.addTextChangedListener(textWatcher);
            textWatcher.afterTextChanged(null);
            builder.setView(object);
            builder.setPositiveButton((CharSequence)this.getString(2131624032), new DialogInterface.OnClickListener(){

                /*
                 * Enabled force condition propagation
                 * Lifted jumps to return sites
                 */
                public final void onClick(DialogInterface dialogInterface, int n2) {
                    double d2;
                    int n3;
                    dialogInterface = new Intent((Context)f.this.getActivity(), PlayActivity.class);
                    dialogInterface.putExtra("old", false);
                    dialogInterface.putExtra("name", "");
                    try {
                        n2 = Integer.parseInt(editText.getText().toString());
                        n3 = Integer.parseInt(editText2.getText().toString());
                        d2 = Double.parseDouble(editText3.getText().toString());
                        if (n2 <= 0) return;
                    }
                    catch (NumberFormatException numberFormatException) {
                        return;
                    }
                    if (!(d2 > 0.0)) return;
                    if (n3 < 0) return;
                    dialogInterface.putExtra("maxCells", n2);
                    dialogInterface.putExtra("maxFoods", n3);
                    dialogInterface.putExtra("radius", d2);
                    f.this.startActivity((Intent)dialogInterface);
                }
            });
            builder.setNegativeButton((CharSequence)this.getString(2131624027), new DialogInterface.OnClickListener(){

                public final void onClick(DialogInterface dialogInterface, int n2) {
                    dialogInterface.cancel();
                }
            });
            builder.show();
            return true;
        }
        String string = this.getString(2131624156);
        String string2 = this.getString(2131624158);
        object = this.getString(2131624159);
        AlertDialog.Builder builder = new AlertDialog.Builder((Context)this.getActivity());
        builder.setTitle((CharSequence)this.b.get((int)var3_5));
        DialogInterface.OnClickListener onClickListener = new DialogInterface.OnClickListener(){

            /*
             * Enabled aggressive block sorting
             * Enabled unnecessary exception pruning
             * Enabled aggressive exception aggregation
             */
            public final void onClick(DialogInterface object, int n2) {
                object = f.this;
                switch (n2) {
                    case 0: {
                        if (((f)object).c == -1) return;
                        new File(object.getActivity().getFilesDir(), f.a(((f)object).b.get(((f)object).c))).delete();
                        ((f)((Object)object)).a();
                        ((f)object).a.notifyDataSetChanged();
                        return;
                    }
                    case 2: {
                        if (((f)object).c == -1) return;
                        com.saterskog.b.a.a("user_action", "share_plate", com.saterskog.b.a.b((Context)object.getActivity()), object.getActivity());
                        Intent intent = new Intent("android.intent.action.SEND");
                        intent.setType("message/rfc822");
                        intent.putExtra("android.intent.extra.SUBJECT", object.getString(2131624070));
                        intent.putExtra("android.intent.extra.TEXT", object.getString(2131624069) + object.getResources().getString(2131623962) + " " + object.getString(2131624065) + " " + object.getResources().getString(2131624189));
                        File file = new File(object.getActivity().getFilesDir(), f.a(((f)object).b.get(((f)object).c)));
                        intent.putExtra("android.intent.extra.STREAM", (Parcelable)FileProvider.a((Context)object.getActivity(), "com.saterskog.cell_lab.MainMenuLab", file));
                        intent.addFlags(1);
                        try {
                            object.startActivity(Intent.createChooser((Intent)intent, (CharSequence)object.getString(2131624068)));
                            return;
                        }
                        catch (ActivityNotFoundException activityNotFoundException) {
                            Toast.makeText((Context)object.getActivity(), (CharSequence)object.getString(2131624347), (int)0).show();
                            return;
                        }
                    }
                    case 1: {
                        if (((f)object).c == -1) return;
                        final File file = object.getActivity().getFilesDir();
                        final File file2 = new File(file, f.a(((f)object).b.get(((f)object).c)));
                        AlertDialog.Builder builder = new AlertDialog.Builder((Context)object.getActivity());
                        builder.setTitle((CharSequence)object.getString(2131624076));
                        final EditText editText = new EditText((Context)object.getActivity());
                        editText.setInputType(1);
                        editText.setText((CharSequence)((f)object).b.get(((f)object).c));
                        builder.setView((View)editText);
                        final Activity activity = object.getActivity();
                        builder.setPositiveButton((CharSequence)object.getString(2131624029), new DialogInterface.OnClickListener(){

                            /*
                             * Enabled force condition propagation
                             * Lifted jumps to return sites
                             */
                            public final void onClick(DialogInterface object, int n2) {
                                String string = f.a(editText.getText().toString());
                                String[] arrstring = f.this.getActivity().fileList();
                                int n3 = arrstring.length;
                                for (int i2 = 0; i2 < n3; ++i2) {
                                    if (!arrstring[i2].equals(string)) continue;
                                    Toast toast = Toast.makeText((Context)activity, (CharSequence)f.this.getString(2131624073), (int)1);
                                    ((TextView)toast.getView().findViewById(16908299)).setTextColor(-65536);
                                    toast.show();
                                    return;
                                }
                                try {
                                    File file3 = file2;
                                    File file22 = new File(file, string);
                                    file3.renameTo(file22);
                                    f.this.a();
                                    return;
                                }
                                catch (IllegalArgumentException illegalArgumentException) {
                                    Toast toast = Toast.makeText((Context)activity, (CharSequence)f.this.getString(2131624339), (int)1);
                                    ((TextView)toast.getView().findViewById(16908299)).setTextColor(-65536);
                                    toast.show();
                                    return;
                                }
                            }
                        });
                        builder.setNegativeButton((CharSequence)object.getString(2131624027), new DialogInterface.OnClickListener(){

                            public final void onClick(DialogInterface dialogInterface, int n2) {
                                dialogInterface.cancel();
                            }
                        });
                        builder.show();
                        ((f)((Object)object)).a();
                        ((f)object).a.notifyDataSetChanged();
                        return;
                    }
                }
            }
        };
        builder.setItems((CharSequence[])new String[]{string, string2, object}, onClickListener);
        object = builder.create();
        object.show();
        object.findViewById(object.getContext().getResources().getIdentifier("android:id/titleDivider", null, null)).setBackgroundColor(this.getResources().getColor(2131034132));
        return true;
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     */
    public final void onListItemClick(ListView object, View view, int n2, long l2) {
        void var3_4;
        int n3;
        Intent intent;
        int n4;
        block2: {
            n4 = 0;
            intent = new Intent((Context)this.getActivity(), PlayActivity.class);
            boolean[] arrbl = j.i(-1, (Context)this.getActivity());
            int n5 = arrbl.length;
            for (n3 = 0; n3 < n5; ++n3) {
                if (!arrbl[n3]) continue;
                n3 = 1;
                break block2;
            }
            n3 = 0;
        }
        if (var3_4 == false && n3 == 0) {
            Toast.makeText((Context)this.getActivity(), (CharSequence)"You currently do not have any genes available, finish a challenge first.", (int)1).show();
            return;
        }
        n3 = var3_4 == false ? n4 : 1;
        intent.putExtra("old", n3);
        intent.putExtra("name", this.b.get((int)var3_4));
        ((l)this.getActivity()).a((short)4);
        this.startActivity(intent);
    }

    public final void onResume() {
        super.onResume();
        this.a();
        this.a.notifyDataSetChanged();
    }
}

