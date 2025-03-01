// 
// Decompiled by Procyon v0.5.36
// 

package com.saterskog.cell_lab;

import android.app.AlertDialog;
import android.app.Activity;
import android.widget.EditText;
import android.content.ActivityNotFoundException;
import android.widget.Toast;
import com.saterskog.b.a;
import android.os.Parcelable;
import android.support.v4.content.FileProvider;
import android.content.Intent;
import java.io.File;
import android.content.DialogInterface;
import android.content.DialogInterface$OnClickListener;
import android.app.AlertDialog$Builder;
import android.widget.ListView;
import android.view.LayoutInflater;
import android.os.Bundle;
import android.widget.ListAdapter;
import java.io.IOException;
import java.io.FileNotFoundException;
import java.io.StreamCorruptedException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import android.widget.TextView;
import android.view.ViewGroup;
import android.view.View;
import java.util.List;
import java.util.Arrays;
import java.util.Comparator;
import android.content.Context;
import java.util.ArrayList;
import android.widget.ArrayAdapter;
import android.app.ListFragment;

public final class g extends ListFragment
{
    ArrayAdapter<String> a;
    ArrayList<String> b;
    int c;
    
    public g() {
        this.c = -1;
    }
    
    public static String a(final String str) {
        return str + ".genome";
    }
    
    public static ArrayList<String> a(final Context context) {
        final ArrayList<String> list = new ArrayList<String>();
        final String[] fileList = context.fileList();
        Arrays.sort(fileList, new Comparator<String>() {});
        for (int i = 0; i < fileList.length; ++i) {
            if (fileList[i].endsWith(".genome")) {
                list.add(b(fileList[i]));
            }
        }
        return list;
    }
    
    private static String b(final String s) {
        return s.substring(0, s.length() - 7);
    }
    
    final void a() {
        final String[] fileList = this.getActivity().fileList();
        Arrays.sort(fileList, new Comparator<String>() {});
        this.b.clear();
        for (int i = 0; i < fileList.length; ++i) {
            if (fileList[i].endsWith(".genome")) {
                this.b.add(b(fileList[i]));
            }
        }
        this.setListAdapter((ListAdapter)(this.a = new ArrayAdapter<String>(this.getActivity(), this.b) {
            public final View getView(final int index, View view, final ViewGroup viewGroup) {
                view = super.getView(index, view, viewGroup);
                final TextView textView = (TextView)view.findViewById(16908308);
                final String s = g.this.b.get(index);
                try {
                    final ObjectInputStream objectInputStream = new ObjectInputStream(g.this.getActivity().openFileInput(g.a(s)));
                    if (objectInputStream.readInt() <= 3054) {
                        textView.setText((CharSequence)s);
                    }
                    else {
                        textView.setText((CharSequence)(s + ", " + g.this.getString(2131624342)));
                        textView.setTextColor(-65536);
                    }
                    objectInputStream.close();
                    return view;
                }
                catch (StreamCorruptedException ex) {
                    ex.printStackTrace();
                    return view;
                }
                catch (FileNotFoundException ex2) {
                    ex2.printStackTrace();
                    return view;
                }
                catch (IOException ex3) {
                    ex3.printStackTrace();
                    return view;
                }
            }
        }));
    }
    
    public final void onActivityCreated(final Bundle bundle) {
        super.onActivityCreated(bundle);
        this.b = new ArrayList<String>();
        this.a();
        this.getListView().setChoiceMode(1);
    }
    
    public final View onCreateView(final LayoutInflater layoutInflater, final ViewGroup viewGroup, final Bundle bundle) {
        final View onCreateView = super.onCreateView(layoutInflater, viewGroup, bundle);
        this.registerForContextMenu(onCreateView);
        return onCreateView;
    }
    
    public final void onListItemClick(final ListView listView, final View view, final int n, final long n2) {
        this.c = n;
        final String string = this.getString(2131624156);
        final String string2 = this.getString(2131624158);
        final String string3 = this.getString(2131624159);
        final AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder((Context)this.getActivity());
        alertDialog$Builder.setTitle((CharSequence)this.b.get(n));
        alertDialog$Builder.setItems((CharSequence[])new String[] { string, string2, string3 }, (DialogInterface$OnClickListener)new DialogInterface$OnClickListener() {
            public final void onClick(DialogInterface a, final int n) {
                a = (DialogInterface)g.this;
                switch (n) {
                    case 0: {
                        if (((g)a).c != -1) {
                            new File(((g)a).getActivity().getFilesDir(), g.a(((g)a).b.get(((g)a).c))).delete();
                            ((g)a).a();
                            ((g)a).a.notifyDataSetChanged();
                            break;
                        }
                        break;
                    }
                    case 2: {
                        if (((g)a).c != -1) {
                            final Intent intent = new Intent("android.intent.action.SEND");
                            intent.setType("message/rfc822");
                            intent.putExtra("android.intent.extra.SUBJECT", ((g)a).getString(2131624067));
                            intent.putExtra("android.intent.extra.TEXT", ((g)a).getString(2131624066) + ((g)a).getResources().getString(2131623962) + " at " + ((g)a).getResources().getString(2131624189));
                            intent.putExtra("android.intent.extra.STREAM", (Parcelable)FileProvider.a((Context)((g)a).getActivity(), "com.saterskog.cell_lab.MainMenuLab", new File(((g)a).getActivity().getFilesDir(), g.a(((g)a).b.get(((g)a).c)))));
                            intent.addFlags(1);
                            a.a("user_action", "share_genome", a.b((Context)((g)a).getActivity()), ((g)a).getActivity());
                            try {
                                ((g)a).startActivity(Intent.createChooser(intent, (CharSequence)((g)a).getString(2131624068)));
                            }
                            catch (ActivityNotFoundException ex) {
                                Toast.makeText((Context)((g)a).getActivity(), (CharSequence)((g)a).getString(2131624347), 0).show();
                            }
                            break;
                        }
                        break;
                    }
                    case 1: {
                        if (((g)a).c != -1) {
                            final File filesDir = ((g)a).getActivity().getFilesDir();
                            final File file = new File(filesDir, g.a(((g)a).b.get(((g)a).c)));
                            final AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder((Context)((g)a).getActivity());
                            alertDialog$Builder.setTitle((CharSequence)((g)a).getString(2131624037));
                            final EditText view = new EditText((Context)((g)a).getActivity());
                            view.setInputType(1);
                            view.setText((CharSequence)((g)a).b.get(((g)a).c));
                            alertDialog$Builder.setView((View)view);
                            alertDialog$Builder.setPositiveButton((CharSequence)((g)a).getString(2131624029), (DialogInterface$OnClickListener)new DialogInterface$OnClickListener() {
                                final /* synthetic */ Activity b = ((g)a).getActivity();
                                
                                public final void onClick(final DialogInterface dialogInterface, int i) {
                                    final String a = g.a(view.getText().toString());
                                    final String[] fileList = g.this.getActivity().fileList();
                                    int length;
                                    Toast text;
                                    for (length = fileList.length, i = 0; i < length; ++i) {
                                        if (fileList[i].equals(a)) {
                                            text = Toast.makeText((Context)this.b, (CharSequence)g.this.getString(2131624343), 1);
                                            ((TextView)text.getView().findViewById(16908299)).setTextColor(-65536);
                                            text.show();
                                            return;
                                        }
                                    }
                                    try {
                                        file.renameTo(new File(filesDir, a));
                                        g.this.a();
                                    }
                                    catch (IllegalArgumentException ex) {
                                        final Toast text2 = Toast.makeText((Context)this.b, (CharSequence)g.this.getString(2131624339), 1);
                                        ((TextView)text2.getView().findViewById(16908299)).setTextColor(-65536);
                                        text2.show();
                                    }
                                }
                            });
                            alertDialog$Builder.setNegativeButton((CharSequence)((g)a).getString(2131624033), (DialogInterface$OnClickListener)new DialogInterface$OnClickListener() {
                                public final void onClick(final DialogInterface dialogInterface, final int n) {
                                    dialogInterface.cancel();
                                }
                            });
                            alertDialog$Builder.show();
                            ((g)a).a.notifyDataSetChanged();
                            break;
                        }
                        break;
                    }
                }
            }
        });
        final AlertDialog create = alertDialog$Builder.create();
        create.show();
        create.findViewById(create.getContext().getResources().getIdentifier("android:id/titleDivider", (String)null, (String)null)).setBackgroundColor(this.getResources().getColor(2131034132));
    }
    
    public final void onResume() {
        super.onResume();
        this.a();
        this.a.notifyDataSetChanged();
    }
}
