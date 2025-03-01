// 
// Decompiled by Procyon v0.5.36
// 

package com.saterskog.cell_lab;

import android.content.DialogInterface;
import android.content.DialogInterface$OnClickListener;
import android.app.AlertDialog$Builder;
import android.widget.Button;
import android.view.ViewGroup;
import android.view.LayoutInflater;
import android.os.Bundle;
import android.view.View;
import android.content.Context;
import android.widget.TextView;
import android.view.View$OnClickListener;
import android.app.Fragment;

public final class m extends Fragment implements View$OnClickListener
{
    TextView a;
    public int b;
    public int c;
    boolean d;
    boolean e;
    
    private static String a(final int i, final int n) {
        String s;
        if (i == n) {
            s = " (" + i + ")";
        }
        else if (i != -1 && n != -1) {
            s = " (" + i + " - " + n + ")";
        }
        else if (i != -1 && n == -1) {
            s = " (" + i + " - \u221e)";
        }
        else {
            s = " (0 - " + n + ")";
        }
        return s;
    }
    
    private String a(final boolean b, final boolean b2, int n, final int i, final int j, final int k, final int l, final int m, final int n2, final int i2, final double d, final int index, final int i3, final int i4, final double n3, final double n4, final int[] array) {
        String s = "";
        if (this.isAdded()) {
            String str;
            if (b) {
                str = "" + this.getString(2131624167);
            }
            else if (b2) {
                str = "" + this.getString(2131624169);
            }
            else {
                str = "" + this.getString(2131624168);
            }
            final j.a a = j.a(null).get(index);
            String string = str;
            if (a.C != -1.0) {
                string = str + "\n" + this.getString(2131624195) + String.format("%1$,.1f", d) + " " + this.getString(2131624145) + " (0 - " + String.format("%1$,.1f", a.C) + ")";
            }
            String string2 = string;
            if (a.q != -1) {
                string2 = string + this.getString(2131624173) + i3 + " (0 - " + a.q + ")";
            }
            String string3 = string2;
            if (a.A != -1) {
                string3 = string2 + this.getString(2131624176) + i4 + " (0 - " + a.A + ")";
            }
            String string4 = string3;
            if (a.n > 0) {
                string4 = string3;
                if (a.n != -1) {
                    string4 = string3 + this.getString(2131624177) + i2 + " (" + a.n + " -  \u221e)";
                }
            }
            String string5 = string4;
            if (a.m > 0) {
                string5 = string4;
                if (a.r != -1) {
                    string5 = string4 + this.getString(2131624179) + n2 + " (" + a.m + " - " + a.r + ")";
                }
            }
            String string6 = string5;
            if (a.m > 0) {
                string6 = string5;
                if (a.r == -1) {
                    string6 = string5 + this.getString(2131624179) + n2 + " (" + a.m + " - \u221e)";
                }
            }
            String string7 = string6;
            if (a.m <= 0) {
                string7 = string6;
                if (a.r > 0) {
                    string7 = string6 + this.getString(2131624179) + n2 + " (0 - " + a.r + ")";
                }
            }
            String string8 = string7;
            if (a.m <= 0) {
                string8 = string7;
                if (a.r == 0) {
                    string8 = string7 + this.getString(2131624179) + n2 + " (0)";
                }
            }
            String string9 = null;
            Label_0854: {
                if (a.o == -1) {
                    string9 = string8;
                    if (a.p == -1) {
                        break Label_0854;
                    }
                }
                string9 = string8 + this.getString(2131624172) + (n + i) + a(a.p, a.o);
            }
            String string10 = null;
            Label_0923: {
                if (a.v == -1) {
                    string10 = string9;
                    if (a.w == -1) {
                        break Label_0923;
                    }
                }
                string10 = string9 + this.getString(2131624175) + k + a(a.w, a.v);
            }
            String string11 = string10;
            if (a.z != -1) {
                string11 = string10 + this.getString(2131624166) + m + a(0, a.z);
            }
            String string12 = null;
            Label_1048: {
                if (a.x == -1) {
                    string12 = string11;
                    if (a.y == -1) {
                        break Label_1048;
                    }
                }
                string12 = string11 + this.getString(2131624178) + l + a(a.y, a.x);
            }
            String string13 = null;
            Label_1134: {
                if (a.s == -1) {
                    string13 = string12;
                    if (a.t == -1) {
                        break Label_1134;
                    }
                }
                string13 = string12 + this.getString(2131624171) + i + a(a.s, a.t);
            }
            String string14 = string13;
            if (a.l != -1) {
                string14 = string13 + this.getString(2131624170) + j + a(a.l, -1);
            }
            String string15 = string14;
            if (a.B != -1.0) {
                string15 = string14 + this.getString(2131624174) + String.format("%1$,.1f", n4 - n3) + " " + this.getString(2131624145) + " (" + String.format("%1$,.1f", a.B) + " " + this.getString(2131624145) + ")";
            }
            n = 0;
            String str2 = string15;
            while (true) {
                s = str2;
                if (n >= h.B.length) {
                    break;
                }
                String string16 = str2;
                if (a.k[n] > 0) {
                    string16 = str2;
                    if (array != null) {
                        string16 = str2 + "\n" + this.getResources().getStringArray(2130837508)[n] + ": " + array[n] + " (0 -" + a.k[n] + ")";
                    }
                }
                ++n;
                str2 = string16;
            }
        }
        return s;
    }
    
    public final void onClick(final View view) {
        switch (view.getId()) {
            case 2131230744: {
                t.a(this.getActivity());
                break;
            }
        }
    }
    
    public final void onCreate(final Bundle bundle) {
        super.onCreate(bundle);
        if (bundle != null) {
            this.b = bundle.getInt("challenge");
        }
    }
    
    public final View onCreateView(final LayoutInflater layoutInflater, final ViewGroup viewGroup, final Bundle bundle) {
        this.d = false;
        this.e = j.b(this.b, (Context)this.getActivity());
        this.c = ((j.a)j.a((Context)this.getActivity()).get(this.b)).i;
        View view;
        if (this.c != -1) {
            view = layoutInflater.inflate(2131361826, viewGroup, false);
            this.a = null;
            ((TextView)view.findViewById(2131230941)).setText((CharSequence)this.getString(2131624357));
            ((Button)view.findViewById(2131230744)).setOnClickListener((View$OnClickListener)this);
        }
        else {
            view = layoutInflater.inflate(2131361825, viewGroup, false);
            ((TextView)view.findViewById(2131230944)).setText((CharSequence)this.a(this.d, this.e, 0, 0, 0, 0, 0, 0, 0, 0, 0.0, this.b, 0, 0, 0.0, 0.0, null));
            this.a = (TextView)view.findViewById(2131230944);
            ((TextView)view.findViewById(2131230940)).setText((CharSequence)j.d(this.b, (Context)this.getActivity()));
            final String e = j.e(this.b, (Context)this.getActivity());
            if (e == null) {
                ((Button)view.findViewById(2131230791)).setVisibility(8);
            }
            else {
                ((Button)view.findViewById(2131230791)).setOnClickListener((View$OnClickListener)new View$OnClickListener() {
                    public final void onClick(View inflate) {
                        final AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder((Context)m.this.getActivity());
                        inflate = m.this.getActivity().getLayoutInflater().inflate(2131361829, (ViewGroup)null);
                        ((TextView)inflate.findViewById(2131230953)).setText((CharSequence)m.this.getString(2131624186));
                        ((TextView)inflate.findViewById(2131230933)).setText((CharSequence)e);
                        alertDialog$Builder.setView(inflate);
                        alertDialog$Builder.setNeutralButton((CharSequence)m.this.getString(2131624029), (DialogInterface$OnClickListener)new DialogInterface$OnClickListener() {
                            public final void onClick(final DialogInterface dialogInterface, final int n) {
                                dialogInterface.cancel();
                            }
                        });
                        alertDialog$Builder.show();
                    }
                });
            }
            final String g = j.g(this.b, (Context)this.getActivity());
            if (g == null) {
                ((Button)view.findViewById(2131230920)).setVisibility(8);
            }
            else {
                ((Button)view.findViewById(2131230920)).setOnClickListener((View$OnClickListener)new View$OnClickListener() {
                    public final void onClick(View inflate) {
                        final AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder((Context)m.this.getActivity());
                        inflate = m.this.getActivity().getLayoutInflater().inflate(2131361829, (ViewGroup)null);
                        ((TextView)inflate.findViewById(2131230953)).setText((CharSequence)m.this.getString(2131624187));
                        ((TextView)inflate.findViewById(2131230933)).setText((CharSequence)g);
                        alertDialog$Builder.setView(inflate);
                        alertDialog$Builder.setNeutralButton((CharSequence)m.this.getString(2131624029), (DialogInterface$OnClickListener)new DialogInterface$OnClickListener() {
                            public final void onClick(final DialogInterface dialogInterface, final int n) {
                                dialogInterface.cancel();
                            }
                        });
                        alertDialog$Builder.show();
                    }
                });
            }
        }
        return view;
    }
    
    public final void onSaveInstanceState(final Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putInt("challenge", this.b);
    }
}
