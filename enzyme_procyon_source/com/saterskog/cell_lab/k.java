// 
// Decompiled by Procyon v0.5.36
// 

package com.saterskog.cell_lab;

import android.widget.ListView;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.DialogInterface$OnClickListener;
import android.app.AlertDialog$Builder;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import java.util.Locale;
import android.text.Html;
import android.widget.TextView;
import android.view.ViewGroup;
import android.view.View;
import android.os.Bundle;
import android.content.Intent;
import android.widget.Toast;
import android.content.Context;
import android.widget.ArrayAdapter;
import android.widget.AdapterView$OnItemLongClickListener;
import android.app.ListFragment;

public final class k extends ListFragment implements AdapterView$OnItemLongClickListener
{
    ArrayAdapter<String> a;
    
    private void a(final int n, final boolean b) {
        final int c = j.c((Context)this.getActivity());
        if (c != -1 && n > c) {
            Toast.makeText((Context)this.getActivity(), (CharSequence)(this.getString(2131623991) + " " + (j.a(c, (Context)this.getActivity()) + 1) + " " + this.getString(2131623993)), 1).show();
            ((l)this.getActivity()).a((short)3);
        }
        else {
            ((l)this.getActivity()).a((short)4);
            final Intent intent = new Intent((Context)this.getActivity(), (Class)PlayActivity.class);
            int n2;
            if (b) {
                n2 = 1;
            }
            else {
                n2 = 0;
            }
            intent.putExtra("experimentOnChallenge", n2);
            intent.putExtra("challenge", n);
            this.getActivity().startActivityForResult(intent, 1);
        }
    }
    
    static /* synthetic */ void a(final k k, final int n) {
        k.a(n, true);
    }
    
    public final void onActivityCreated(final Bundle bundle) {
        super.onActivityCreated(bundle);
        this.setListAdapter((ListAdapter)(this.a = new ArrayAdapter<String>(this.getActivity(), j.b((Context)this.getActivity())) {
            public final View getView(int j, final View view, final ViewGroup viewGroup) {
                final View view2 = super.getView(j, view, viewGroup);
                final TextView textView = (TextView)view2.findViewById(16908308);
                final TextView textView2 = (TextView)view2.findViewById(16908309);
                final int c = j.c((Context)k.this.getActivity());
                final int i = ((j.a)j.a((Context)k.this.getActivity()).get(j)).i;
                boolean b;
                if (c != -1 && c < j) {
                    b = false;
                }
                else {
                    b = true;
                }
                if (!b) {
                    textView.setTextColor(-8355712);
                }
                else {
                    textView.setTextColor(-1);
                }
                if (i != -1) {
                    textView.setText((CharSequence)this.getItem(j));
                    String string = "";
                    if (!b) {
                        string = "" + "<font color=#808080>";
                    }
                    String str = string + ((j.a)j.a((Context)k.this.getActivity()).get(j)).c;
                    if (!b) {
                        str += "</font>";
                    }
                    textView2.setText((CharSequence)Html.fromHtml(str));
                }
                else {
                    textView.setText((CharSequence)(Integer.toString(j.a(j, (Context)k.this.getActivity()) + 1) + ": " + (String)this.getItem(j)));
                    String str2;
                    if (j.b(j, (Context)k.this.getActivity())) {
                        str2 = "" + "<font color=#38A10B>" + k.this.getString(2131624167) + ".</font>";
                    }
                    else if (c != -1 && j > c) {
                        str2 = "" + "<font color=#A13838>" + k.this.getString(2131623991) + " " + (j.a(c, (Context)k.this.getActivity()) + 1) + " " + k.this.getString(2131623993) + "</font>";
                    }
                    else {
                        str2 = "" + "<font color=#A1A138>" + k.this.getString(2131623992) + "</font>";
                    }
                    String string2 = str2;
                    if (!b) {
                        string2 = str2 + "<font color=#808080>";
                    }
                    final int f = j.f(j, (Context)k.this.getActivity());
                    String string3 = string2;
                    if (f == 0) {
                        string3 = string2 + " " + k.this.getActivity().getString(2131624042);
                    }
                    String string4 = string3;
                    if (f == 1) {
                        string4 = string3 + " " + k.this.getActivity().getString(2131624043);
                    }
                    String string5 = string4;
                    if (f == 2) {
                        string5 = string4 + " " + k.this.getActivity().getString(2131624044);
                    }
                    String string6 = string5;
                    if (f == 3) {
                        string6 = string5 + " " + k.this.getActivity().getString(2131624045);
                    }
                    String string7;
                    if (!b) {
                        string7 = string6 + "</font>";
                    }
                    else {
                        string7 = string6;
                    }
                    String string8 = string7;
                    if (((j.a)j.a((Context)k.this.getActivity()).get(j)).g != null) {
                        String string9 = "";
                        final String[] g = ((j.a)j.a((Context)k.this.getActivity()).get(j)).g;
                        for (int length = g.length, k = 0; k < length; ++k) {
                            string9 = string9 + h.B[h.valueOf(g[k].toUpperCase(Locale.ENGLISH)).ordinal()].a((Context)k.this.getActivity()) + ", ";
                        }
                        final String substring = string9.substring(0, string9.length() - 2);
                        String str3;
                        if (b) {
                            str3 = string7 + "<br> <font color=#FFAA00>";
                        }
                        else {
                            str3 = string7 + "<br> <font color=#808080>";
                        }
                        string8 = str3 + k.this.getString(2131623994) + " " + substring + k.this.getActivity().getString(2131624362) + "</font>";
                    }
                    j = ((j.a)j.a((Context)k.this.getActivity()).get(j)).j;
                    String string10 = string8;
                    if (j != -1) {
                        String str4;
                        if (b) {
                            str4 = string8 + "<br> <font color=#FFAA00>";
                        }
                        else {
                            str4 = string8 + "<br> <font color=#808080>";
                        }
                        String str5 = null;
                        if (j == 0) {
                            str5 = k.this.getString(2131624359);
                        }
                        if (j == 1) {
                            str5 = k.this.getString(2131624358);
                        }
                        if (j == 2) {
                            str5 = k.this.getString(2131624360);
                        }
                        string10 = str4 + k.this.getString(2131624361) + " " + str5 + "</font>";
                    }
                    textView2.setText((CharSequence)Html.fromHtml(string10));
                    textView2.setPadding(0, 0, 0, 16);
                }
                return view2;
            }
        }));
        this.getListView().setOnItemLongClickListener((AdapterView$OnItemLongClickListener)this);
    }
    
    public final boolean onItemLongClick(final AdapterView<?> adapterView, final View view, final int n, final long n2) {
        final AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder((Context)this.getActivity());
        alertDialog$Builder.setTitle(2131624194);
        alertDialog$Builder.setMessage(2131624191);
        alertDialog$Builder.setPositiveButton((CharSequence)this.getString(2131624029), (DialogInterface$OnClickListener)new DialogInterface$OnClickListener() {
            public final void onClick(final DialogInterface dialogInterface, final int n) {
                k.a(k.this, n);
            }
        });
        alertDialog$Builder.setNegativeButton((CharSequence)this.getString(2131624027), (DialogInterface$OnClickListener)new DialogInterface$OnClickListener() {
            public final void onClick(final DialogInterface dialogInterface, final int n) {
                dialogInterface.cancel();
            }
        });
        final AlertDialog create = alertDialog$Builder.create();
        create.show();
        final View viewById = create.findViewById(create.getContext().getResources().getIdentifier("android:id/titleDivider", (String)null, (String)null));
        if (viewById != null) {
            viewById.setBackgroundColor(this.getResources().getColor(2131034132));
        }
        return true;
    }
    
    public final void onListItemClick(final ListView listView, final View view, final int n, final long n2) {
        this.a(n, false);
    }
    
    public final void onResume() {
        super.onResume();
        j.a();
        this.a.notifyDataSetChanged();
    }
}
