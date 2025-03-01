/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  android.app.AlertDialog$Builder
 *  android.app.ListFragment
 *  android.content.Context
 *  android.content.DialogInterface
 *  android.content.DialogInterface$OnClickListener
 *  android.content.Intent
 *  android.os.Bundle
 *  android.text.Html
 *  android.view.View
 *  android.view.ViewGroup
 *  android.widget.AdapterView
 *  android.widget.AdapterView$OnItemLongClickListener
 *  android.widget.ArrayAdapter
 *  android.widget.ListAdapter
 *  android.widget.ListView
 *  android.widget.TextView
 *  android.widget.Toast
 */
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
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;
import com.saterskog.cell_lab.PlayActivity;
import com.saterskog.cell_lab.h;
import com.saterskog.cell_lab.j;
import com.saterskog.cell_lab.l;
import java.util.Locale;

public final class k
extends ListFragment
implements AdapterView.OnItemLongClickListener {
    ArrayAdapter<String> a;

    /*
     * Enabled aggressive block sorting
     */
    private void a(int n2, boolean bl) {
        int n3 = j.c((Context)this.getActivity());
        if (n3 != -1 && n2 > n3) {
            Toast.makeText((Context)this.getActivity(), (CharSequence)(this.getString(2131623991) + " " + (j.a(n3, (Context)this.getActivity()) + 1) + " " + this.getString(2131623993)), (int)1).show();
            ((l)this.getActivity()).a((short)3);
            return;
        }
        ((l)this.getActivity()).a((short)4);
        Intent intent = new Intent((Context)this.getActivity(), PlayActivity.class);
        n3 = bl ? 1 : 0;
        intent.putExtra("experimentOnChallenge", n3);
        intent.putExtra("challenge", n2);
        this.getActivity().startActivityForResult(intent, 1);
    }

    public final void onActivityCreated(Bundle arrstring) {
        super.onActivityCreated((Bundle)arrstring);
        arrstring = j.b((Context)this.getActivity());
        this.a = new ArrayAdapter<String>((Context)this.getActivity(), arrstring){

            /*
             * WARNING - void declaration
             * Enabled aggressive block sorting
             */
            public final View getView(int n2, View object, ViewGroup object2) {
                void var2_39;
                void var2_20;
                void var2_18;
                void var2_15;
                void var2_12;
                String string;
                View view = super.getView(n2, object, (ViewGroup)string);
                TextView textView = (TextView)view.findViewById(16908308);
                TextView textView2 = (TextView)view.findViewById(16908309);
                int n3 = j.c((Context)k.this.getActivity());
                int n4 = j.a((Context)k.this.getActivity()).get((int)n2).i;
                boolean bl = n3 == -1 || n3 >= n2;
                if (!bl) {
                    textView.setTextColor(-8355712);
                } else {
                    textView.setTextColor(-1);
                }
                if (n4 != -1) {
                    void var2_9;
                    void var2_6;
                    textView.setText((CharSequence)this.getItem(n2));
                    String string2 = "";
                    if (!bl) {
                        String string3 = "" + "<font color=#808080>";
                    }
                    String string4 = string = (String)var2_6 + j.a((Context)k.this.getActivity()).get((int)n2).c;
                    if (!bl) {
                        String string5 = string + "</font>";
                    }
                    textView2.setText((CharSequence)Html.fromHtml((String)var2_9));
                    return view;
                }
                textView.setText((CharSequence)(Integer.toString(j.a(n2, (Context)k.this.getActivity()) + 1) + ": " + (String)this.getItem(n2)));
                if (j.b(n2, (Context)k.this.getActivity())) {
                    String string7 = "" + "<font color=#38A10B>";
                    string7 = string7 + k.this.getString(2131624167) + ".</font>";
                } else if (n3 != -1 && n2 > n3) {
                    String string9 = "" + "<font color=#A13838>";
                    string9 = string9 + k.this.getString(2131623991) + " " + (j.a(n3, (Context)k.this.getActivity()) + 1) + " " + k.this.getString(2131623993) + "</font>";
                } else {
                    String string11 = "" + "<font color=#A1A138>";
                    string11 = string11 + k.this.getString(2131623992) + "</font>";
                }
                string = var2_12;
                if (!bl) {
                    string = (String)var2_12 + "<font color=#808080>";
                }
                n4 = j.f(n2, (Context)k.this.getActivity());
                String string12 = string;
                if (n4 == 0) {
                    String string13 = string + " " + k.this.getActivity().getString(2131624042);
                }
                string = var2_15;
                if (n4 == 1) {
                    string = (String)var2_15 + " " + k.this.getActivity().getString(2131624043);
                }
                String string14 = string;
                if (n4 == 2) {
                    String string15 = string + " " + k.this.getActivity().getString(2131624044);
                }
                string = var2_18;
                if (n4 == 3) {
                    string = (String)var2_18 + " " + k.this.getActivity().getString(2131624045);
                }
                if (!bl) {
                    String string16 = string + "</font>";
                } else {
                    String string17 = string;
                }
                string = var2_20;
                if (j.a((Context)k.this.getActivity()).get((int)n2).g != null) {
                    void var2_26;
                    string = "";
                    for (String string18 : j.a((Context)k.this.getActivity()).get((int)n2).g) {
                        string = string + h.B[h.valueOf(string18.toUpperCase(Locale.ENGLISH)).ordinal()].a((Context)k.this.getActivity()) + ", ";
                    }
                    string = string.substring(0, string.length() - 2);
                    if (bl) {
                        String string19 = (String)var2_20 + "<br> <font color=#FFAA00>";
                    } else {
                        String string20 = (String)var2_20 + "<br> <font color=#808080>";
                    }
                    String string21 = (String)var2_26 + k.this.getString(2131623994) + " " + string;
                    string = string21 + k.this.getActivity().getString(2131624362) + "</font>";
                }
                n2 = j.a((Context)k.this.getActivity()).get((int)n2).j;
                String string22 = string;
                if (n2 != -1) {
                    void var2_36;
                    string = bl ? string + "<br> <font color=#FFAA00>" : string + "<br> <font color=#808080>";
                    Object var2_30 = null;
                    if (n2 == 0) {
                        String string23 = k.this.getString(2131624359);
                    }
                    if (n2 == 1) {
                        String string24 = k.this.getString(2131624358);
                    }
                    if (n2 == 2) {
                        String string25 = k.this.getString(2131624360);
                    }
                    String string27 = string + k.this.getString(2131624361) + " " + (String)var2_36;
                    string27 = string27 + "</font>";
                }
                textView2.setText((CharSequence)Html.fromHtml((String)var2_39));
                textView2.setPadding(0, 0, 0, 16);
                return view;
            }
        };
        this.setListAdapter((ListAdapter)this.a);
        this.getListView().setOnItemLongClickListener((AdapterView.OnItemLongClickListener)this);
    }

    public final boolean onItemLongClick(AdapterView<?> builder, View view, final int n2, long l2) {
        builder = new AlertDialog.Builder((Context)this.getActivity());
        builder.setTitle(2131624194);
        builder.setMessage(2131624191);
        builder.setPositiveButton((CharSequence)this.getString(2131624029), new DialogInterface.OnClickListener(){

            public final void onClick(DialogInterface dialogInterface, int n22) {
                k.this.a(n2, true);
            }
        });
        builder.setNegativeButton((CharSequence)this.getString(2131624027), new DialogInterface.OnClickListener(){

            public final void onClick(DialogInterface dialogInterface, int n2) {
                dialogInterface.cancel();
            }
        });
        builder = builder.create();
        builder.show();
        builder = builder.findViewById(builder.getContext().getResources().getIdentifier("android:id/titleDivider", null, null));
        if (builder != null) {
            builder.setBackgroundColor(this.getResources().getColor(2131034132));
        }
        return true;
    }

    public final void onListItemClick(ListView listView, View view, int n2, long l2) {
        this.a(n2, false);
    }

    public final void onResume() {
        super.onResume();
        j.a();
        this.a.notifyDataSetChanged();
    }
}

