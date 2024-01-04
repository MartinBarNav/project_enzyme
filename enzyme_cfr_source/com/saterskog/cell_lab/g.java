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
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
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
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListAdapter;
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

public final class g
extends ListFragment {
    ArrayAdapter<String> a;
    ArrayList<String> b;
    int c = -1;

    public static String a(String string) {
        return string + ".genome";
    }

    public static ArrayList<String> a(Context arrstring) {
        ArrayList<String> arrayList = new ArrayList<String>();
        arrstring = arrstring.fileList();
        Arrays.sort(arrstring, new Comparator<String>(){

            @Override
            public final /* synthetic */ int compare(Object object, Object object2) {
                return ((String)object).compareToIgnoreCase((String)object2);
            }
        });
        for (int i2 = 0; i2 < arrstring.length; ++i2) {
            if (!arrstring[i2].endsWith(".genome")) continue;
            arrayList.add(g.b(arrstring[i2]));
        }
        return arrayList;
    }

    private static String b(String string) {
        return string.substring(0, string.length() - 7);
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
        for (int i2 = 0; i2 < arrstring.length; ++i2) {
            if (!arrstring[i2].endsWith(".genome")) continue;
            this.b.add(g.b(arrstring[i2]));
        }
        this.a = new ArrayAdapter<String>((Context)this.getActivity(), this.b){

            /*
             * Enabled aggressive block sorting
             * Enabled unnecessary exception pruning
             * Enabled aggressive exception aggregation
             */
            public final View getView(int n2, View view, ViewGroup object) {
                view = super.getView(n2, view, (ViewGroup)object);
                TextView textView = (TextView)view.findViewById(16908308);
                String string = g.this.b.get(n2);
                try {
                    ObjectInputStream objectInputStream = new ObjectInputStream(g.this.getActivity().openFileInput(g.a(string)));
                    if (objectInputStream.readInt() <= 3054) {
                        textView.setText((CharSequence)string);
                    } else {
                        object = new StringBuilder();
                        textView.setText((CharSequence)((StringBuilder)object).append(string).append(", ").append(g.this.getString(2131624342)).toString());
                        textView.setTextColor(-65536);
                    }
                    objectInputStream.close();
                    return view;
                }
                catch (StreamCorruptedException streamCorruptedException) {
                    streamCorruptedException.printStackTrace();
                    return view;
                }
                catch (FileNotFoundException fileNotFoundException) {
                    fileNotFoundException.printStackTrace();
                    return view;
                }
                catch (IOException iOException) {
                    iOException.printStackTrace();
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
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater = super.onCreateView(layoutInflater, viewGroup, bundle);
        this.registerForContextMenu((View)layoutInflater);
        return layoutInflater;
    }

    public final void onListItemClick(ListView object, View object2, int n2, long l2) {
        this.c = n2;
        String string = this.getString(2131624156);
        object2 = this.getString(2131624158);
        String string2 = this.getString(2131624159);
        AlertDialog.Builder builder = new AlertDialog.Builder((Context)this.getActivity());
        builder.setTitle((CharSequence)this.b.get(n2));
        object = new DialogInterface.OnClickListener(){

            /*
             * Enabled aggressive block sorting
             * Enabled unnecessary exception pruning
             * Enabled aggressive exception aggregation
             */
            public final void onClick(DialogInterface object, int n2) {
                object = g.this;
                switch (n2) {
                    case 0: {
                        if (((g)object).c == -1) return;
                        new File(object.getActivity().getFilesDir(), g.a(((g)object).b.get(((g)object).c))).delete();
                        ((g)((Object)object)).a();
                        ((g)object).a.notifyDataSetChanged();
                        return;
                    }
                    case 2: {
                        if (((g)object).c == -1) return;
                        Intent intent = new Intent("android.intent.action.SEND");
                        intent.setType("message/rfc822");
                        intent.putExtra("android.intent.extra.SUBJECT", object.getString(2131624067));
                        intent.putExtra("android.intent.extra.TEXT", object.getString(2131624066) + object.getResources().getString(2131623962) + " at " + object.getResources().getString(2131624189));
                        File file = new File(object.getActivity().getFilesDir(), g.a(((g)object).b.get(((g)object).c)));
                        intent.putExtra("android.intent.extra.STREAM", (Parcelable)FileProvider.a((Context)object.getActivity(), "com.saterskog.cell_lab.MainMenuLab", file));
                        intent.addFlags(1);
                        com.saterskog.b.a.a("user_action", "share_genome", com.saterskog.b.a.b((Context)object.getActivity()), object.getActivity());
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
                        if (((g)object).c == -1) return;
                        final File file = object.getActivity().getFilesDir();
                        final File file2 = new File(file, g.a(((g)object).b.get(((g)object).c)));
                        AlertDialog.Builder builder = new AlertDialog.Builder((Context)object.getActivity());
                        builder.setTitle((CharSequence)object.getString(2131624037));
                        final EditText editText = new EditText((Context)object.getActivity());
                        editText.setInputType(1);
                        editText.setText((CharSequence)((g)object).b.get(((g)object).c));
                        builder.setView((View)editText);
                        final Activity activity = object.getActivity();
                        builder.setPositiveButton((CharSequence)object.getString(2131624029), new DialogInterface.OnClickListener(){

                            /*
                             * Enabled force condition propagation
                             * Lifted jumps to return sites
                             */
                            public final void onClick(DialogInterface object, int n2) {
                                String string = g.a(editText.getText().toString());
                                Object object2 = g.this.getActivity().fileList();
                                int n3 = ((String[])object2).length;
                                for (int i2 = 0; i2 < n3; ++i2) {
                                    if (!object2[i2].equals(string)) continue;
                                    Toast toast = Toast.makeText((Context)activity, (CharSequence)g.this.getString(2131624343), (int)1);
                                    ((TextView)toast.getView().findViewById(16908299)).setTextColor(-65536);
                                    toast.show();
                                    return;
                                }
                                try {
                                    object2 = file2;
                                    File file3 = new File(file, string);
                                    ((File)object2).renameTo(file3);
                                    g.this.a();
                                    return;
                                }
                                catch (IllegalArgumentException illegalArgumentException) {
                                    Toast toast = Toast.makeText((Context)activity, (CharSequence)g.this.getString(2131624339), (int)1);
                                    ((TextView)toast.getView().findViewById(16908299)).setTextColor(-65536);
                                    toast.show();
                                    return;
                                }
                            }
                        });
                        builder.setNegativeButton((CharSequence)object.getString(2131624033), new DialogInterface.OnClickListener(){

                            public final void onClick(DialogInterface dialogInterface, int n2) {
                                dialogInterface.cancel();
                            }
                        });
                        builder.show();
                        ((g)object).a.notifyDataSetChanged();
                        return;
                    }
                }
            }
        };
        builder.setItems((CharSequence[])new String[]{string, object2, string2}, (DialogInterface.OnClickListener)object);
        object = builder.create();
        object.show();
        object.findViewById(object.getContext().getResources().getIdentifier("android:id/titleDivider", null, null)).setBackgroundColor(this.getResources().getColor(2131034132));
    }

    public final void onResume() {
        super.onResume();
        this.a();
        this.a.notifyDataSetChanged();
    }
}

