// 
// Decompiled by Procyon v0.5.36
// 

package com.saterskog.cell_lab;

import android.widget.ListView;
import android.app.AlertDialog;
import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.widget.Toast;
import android.os.Parcelable;
import android.support.v4.content.FileProvider;
import java.io.File;
import android.content.Intent;
import android.content.DialogInterface;
import android.content.DialogInterface$OnClickListener;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;
import android.app.AlertDialog$Builder;
import android.widget.AdapterView;
import android.view.LayoutInflater;
import android.os.Bundle;
import android.widget.ListAdapter;
import java.io.IOException;
import java.io.FileNotFoundException;
import java.io.StreamCorruptedException;
import com.saterskog.b.a;
import java.io.InputStream;
import java.io.ObjectInputStream;
import android.widget.TextView;
import android.view.ViewGroup;
import android.view.View;
import java.util.List;
import android.content.Context;
import java.util.Arrays;
import java.util.Comparator;
import java.util.ArrayList;
import android.widget.ArrayAdapter;
import android.widget.AdapterView$OnItemLongClickListener;
import android.app.ListFragment;

public final class f extends ListFragment implements AdapterView$OnItemLongClickListener
{
    ArrayAdapter<String> a;
    ArrayList<String> b;
    int c;
    
    public f() {
        this.c = -1;
    }
    
    public static String a(final String str) {
        return str + ".substrate";
    }
    
    final void a() {
        final String[] fileList = this.getActivity().fileList();
        Arrays.sort(fileList, new Comparator<String>() {});
        this.b.clear();
        this.b.add("");
        for (final String s : fileList) {
            if (s.endsWith(".substrate")) {
                this.b.add(s.substring(0, s.length() - 10));
            }
        }
        this.setListAdapter((ListAdapter)(this.a = new ArrayAdapter<String>(this.getActivity(), this.b) {
            public final View getView(int int1, View view, ViewGroup viewGroup) {
                view = super.getView(int1, view, viewGroup);
                final TextView textView = (TextView)view.findViewById(16908308);
                viewGroup = (ViewGroup)view.findViewById(16908309);
                if (int1 == 0) {
                    textView.setText((CharSequence)f.this.getString(2131624075));
                    textView.setTextColor(view.getResources().getColor(2131034160));
                    ((TextView)viewGroup).setText((CharSequence)f.this.getString(2131624074));
                }
                else {
                    textView.setTextColor(-789517);
                    textView.setText((CharSequence)f.this.b.get(int1));
                    try {
                        final ObjectInputStream objectInputStream = new ObjectInputStream(f.this.getActivity().openFileInput(f.a(f.this.b.get(int1))));
                        if (objectInputStream.readInt() > 3054) {
                            goto Label_0284;
                        }
                        final double double1 = objectInputStream.readDouble();
                        int1 = objectInputStream.readInt();
                        ((TextView)viewGroup).setText((CharSequence)(f.this.getString(2131624196) + Integer.toString(int1) + ", " + f.this.getString(2131624077) + " " + String.format("%1$,.1f", double1) + " " + f.this.getString(2131624145)));
                        objectInputStream.close();
                    }
                    catch (StreamCorruptedException ex) {
                        com.saterskog.b.a.a(ex);
                        ((TextView)viewGroup).setText((CharSequence)"Error reading substrate");
                    }
                    catch (FileNotFoundException ex2) {
                        com.saterskog.b.a.a(ex2);
                        ((TextView)viewGroup).setText((CharSequence)"Error reading substrate");
                    }
                    catch (IOException ex3) {
                        com.saterskog.b.a.a("error io42 but now in ff");
                        com.saterskog.b.a.a(ex3);
                        ((TextView)viewGroup).setText((CharSequence)"Error reading substrate");
                    }
                }
                return view;
            }
        }));
    }
    
    public final void onActivityCreated(final Bundle bundle) {
        super.onActivityCreated(bundle);
        this.b = new ArrayList<String>();
        this.a();
        this.getListView().setChoiceMode(1);
        this.getListView().setOnItemLongClickListener((AdapterView$OnItemLongClickListener)this);
    }
    
    public final View onCreateView(final LayoutInflater layoutInflater, final ViewGroup viewGroup, final Bundle bundle) {
        return super.onCreateView(layoutInflater, viewGroup, bundle);
    }
    
    public final boolean onItemLongClick(final AdapterView<?> adapterView, final View view, final int n, final long n2) {
        this.c = n;
        if (n == 0) {
            final AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder((Context)this.getActivity());
            alertDialog$Builder.setTitle((CharSequence)this.getString(2131624072));
            final View inflate = this.getActivity().getLayoutInflater().inflate(2131361821, (ViewGroup)null);
            final TextView textView = (TextView)inflate.findViewById(2131230737);
            final EditText editText = (EditText)inflate.findViewById(2131230775);
            final EditText editText2 = (EditText)inflate.findViewById(2131230777);
            final EditText editText3 = (EditText)inflate.findViewById(2131230776);
            final TextWatcher textWatcher = (TextWatcher)new TextWatcher() {
                public final void afterTextChanged(final Editable editable) {
                    while (true) {
                        try {
                            final int int1 = Integer.parseInt(editText.getText().toString());
                            final int int2 = Integer.parseInt(editText2.getText().toString());
                            final double double1 = Double.parseDouble(editText3.getText().toString());
                            if (int1 > 0 && double1 > 0.0 && int2 >= 0) {
                                final Environment environment = new Environment();
                                environment.s = int2;
                                environment.r = int1;
                                environment.k = double1;
                                textView.setText((CharSequence)(" \u2248 " + CellWorld.a(environment) / 1048576L + " MB"));
                            }
                        }
                        catch (NumberFormatException ex) {
                            final int int2 = 0;
                            final int int1 = -1;
                            final double double1 = 0.0;
                            continue;
                        }
                        break;
                    }
                }
                
                public final void beforeTextChanged(final CharSequence charSequence, final int n, final int n2, final int n3) {
                }
                
                public final void onTextChanged(final CharSequence charSequence, final int n, final int n2, final int n3) {
                }
            };
            editText.addTextChangedListener((TextWatcher)textWatcher);
            editText2.addTextChangedListener((TextWatcher)textWatcher);
            editText3.addTextChangedListener((TextWatcher)textWatcher);
            ((TextWatcher)textWatcher).afterTextChanged(null);
            alertDialog$Builder.setView(inflate);
            alertDialog$Builder.setPositiveButton((CharSequence)this.getString(2131624032), (DialogInterface$OnClickListener)new DialogInterface$OnClickListener() {
                public final void onClick(DialogInterface dialogInterface, int int1) {
                    dialogInterface = (DialogInterface)new Intent((Context)f.this.getActivity(), (Class)PlayActivity.class);
                    ((Intent)dialogInterface).putExtra("old", false);
                    ((Intent)dialogInterface).putExtra("name", "");
                    while (true) {
                        try {
                            int1 = Integer.parseInt(editText.getText().toString());
                            final int int2 = Integer.parseInt(editText2.getText().toString());
                            final double double1 = Double.parseDouble(editText3.getText().toString());
                            if (int1 > 0 && double1 > 0.0 && int2 >= 0) {
                                ((Intent)dialogInterface).putExtra("maxCells", int1);
                                ((Intent)dialogInterface).putExtra("maxFoods", int2);
                                ((Intent)dialogInterface).putExtra("radius", double1);
                                f.this.startActivity((Intent)dialogInterface);
                            }
                        }
                        catch (NumberFormatException ex) {
                            final int int2 = 0;
                            int1 = -1;
                            final double double1 = 0.0;
                            continue;
                        }
                        break;
                    }
                }
            });
            alertDialog$Builder.setNegativeButton((CharSequence)this.getString(2131624027), (DialogInterface$OnClickListener)new DialogInterface$OnClickListener() {
                public final void onClick(final DialogInterface dialogInterface, final int n) {
                    dialogInterface.cancel();
                }
            });
            alertDialog$Builder.show();
        }
        else {
            final String string = this.getString(2131624156);
            final String string2 = this.getString(2131624158);
            final String string3 = this.getString(2131624159);
            final AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder((Context)this.getActivity());
            alertDialog$Builder2.setTitle((CharSequence)this.b.get(n));
            alertDialog$Builder2.setItems((CharSequence[])new String[] { string, string2, string3 }, (DialogInterface$OnClickListener)new DialogInterface$OnClickListener() {
                public final void onClick(DialogInterface a, final int n) {
                    a = (DialogInterface)f.this;
                    switch (n) {
                        case 0: {
                            if (((f)a).c != -1) {
                                new File(((f)a).getActivity().getFilesDir(), f.a(((f)a).b.get(((f)a).c))).delete();
                                ((f)a).a();
                                ((f)a).a.notifyDataSetChanged();
                                break;
                            }
                            break;
                        }
                        case 2: {
                            if (((f)a).c != -1) {
                                a.a("user_action", "share_plate", a.b((Context)((f)a).getActivity()), ((f)a).getActivity());
                                final Intent intent = new Intent("android.intent.action.SEND");
                                intent.setType("message/rfc822");
                                intent.putExtra("android.intent.extra.SUBJECT", ((f)a).getString(2131624070));
                                intent.putExtra("android.intent.extra.TEXT", ((f)a).getString(2131624069) + ((f)a).getResources().getString(2131623962) + " " + ((f)a).getString(2131624065) + " " + ((f)a).getResources().getString(2131624189));
                                intent.putExtra("android.intent.extra.STREAM", (Parcelable)FileProvider.a((Context)((f)a).getActivity(), "com.saterskog.cell_lab.MainMenuLab", new File(((f)a).getActivity().getFilesDir(), f.a(((f)a).b.get(((f)a).c)))));
                                intent.addFlags(1);
                                try {
                                    ((f)a).startActivity(Intent.createChooser(intent, (CharSequence)((f)a).getString(2131624068)));
                                }
                                catch (ActivityNotFoundException ex) {
                                    Toast.makeText((Context)((f)a).getActivity(), (CharSequence)((f)a).getString(2131624347), 0).show();
                                }
                                break;
                            }
                            break;
                        }
                        case 1: {
                            if (((f)a).c != -1) {
                                final File filesDir = ((f)a).getActivity().getFilesDir();
                                final File file = new File(filesDir, f.a(((f)a).b.get(((f)a).c)));
                                final AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder((Context)((f)a).getActivity());
                                alertDialog$Builder.setTitle((CharSequence)((f)a).getString(2131624076));
                                final EditText view = new EditText((Context)((f)a).getActivity());
                                view.setInputType(1);
                                view.setText((CharSequence)((f)a).b.get(((f)a).c));
                                alertDialog$Builder.setView((View)view);
                                alertDialog$Builder.setPositiveButton((CharSequence)((f)a).getString(2131624029), (DialogInterface$OnClickListener)new DialogInterface$OnClickListener() {
                                    final /* synthetic */ Activity b = ((f)a).getActivity();
                                    
                                    public final void onClick(final DialogInterface dialogInterface, int i) {
                                        final String a = f.a(view.getText().toString());
                                        final String[] fileList = f.this.getActivity().fileList();
                                        int length;
                                        Toast text;
                                        for (length = fileList.length, i = 0; i < length; ++i) {
                                            if (fileList[i].equals(a)) {
                                                text = Toast.makeText((Context)this.b, (CharSequence)f.this.getString(2131624073), 1);
                                                ((TextView)text.getView().findViewById(16908299)).setTextColor(-65536);
                                                text.show();
                                                return;
                                            }
                                        }
                                        try {
                                            file.renameTo(new File(filesDir, a));
                                            f.this.a();
                                        }
                                        catch (IllegalArgumentException ex) {
                                            final Toast text2 = Toast.makeText((Context)this.b, (CharSequence)f.this.getString(2131624339), 1);
                                            ((TextView)text2.getView().findViewById(16908299)).setTextColor(-65536);
                                            text2.show();
                                        }
                                    }
                                });
                                alertDialog$Builder.setNegativeButton((CharSequence)((f)a).getString(2131624027), (DialogInterface$OnClickListener)new DialogInterface$OnClickListener() {
                                    public final void onClick(final DialogInterface dialogInterface, final int n) {
                                        dialogInterface.cancel();
                                    }
                                });
                                alertDialog$Builder.show();
                                ((f)a).a();
                                ((f)a).a.notifyDataSetChanged();
                                break;
                            }
                            break;
                        }
                    }
                }
            });
            final AlertDialog create = alertDialog$Builder2.create();
            create.show();
            create.findViewById(create.getContext().getResources().getIdentifier("android:id/titleDivider", (String)null, (String)null)).setBackgroundColor(this.getResources().getColor(2131034132));
        }
        return true;
    }
    
    public final void onListItemClick(final ListView listView, final View view, final int index, final long n) {
        final int n2 = 0;
        final Intent intent = new Intent((Context)this.getActivity(), (Class)PlayActivity.class);
        final boolean[] i = j.i(-1, (Context)this.getActivity());
        while (true) {
            for (int length = i.length, j = 0; j < length; ++j) {
                if (i[j]) {
                    final int n3 = 1;
                    if (index == 0 && n3 == 0) {
                        Toast.makeText((Context)this.getActivity(), (CharSequence)"You currently do not have any genes available, finish a challenge first.", 1).show();
                    }
                    else {
                        int n4;
                        if (index == 0) {
                            n4 = n2;
                        }
                        else {
                            n4 = 1;
                        }
                        intent.putExtra("old", n4);
                        intent.putExtra("name", (String)this.b.get(index));
                        ((l)this.getActivity()).a((short)4);
                        this.startActivity(intent);
                    }
                    return;
                }
            }
            final int n3 = 0;
            continue;
        }
    }
    
    public final void onResume() {
        super.onResume();
        this.a();
        this.a.notifyDataSetChanged();
    }
}
