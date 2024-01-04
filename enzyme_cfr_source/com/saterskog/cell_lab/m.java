/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  android.app.AlertDialog$Builder
 *  android.app.Fragment
 *  android.content.Context
 *  android.content.DialogInterface
 *  android.content.DialogInterface$OnClickListener
 *  android.os.Bundle
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.view.ViewGroup
 *  android.widget.Button
 *  android.widget.TextView
 */
package com.saterskog.cell_lab;

import android.app.AlertDialog;
import android.app.Fragment;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import com.saterskog.cell_lab.h;
import com.saterskog.cell_lab.j;
import com.saterskog.cell_lab.t;

public final class m
extends Fragment
implements View.OnClickListener {
    TextView a;
    public int b;
    public int c;
    boolean d;
    boolean e;

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private static String a(int n2, int n3) {
        if (n2 == n3) {
            return " (" + n2 + ")";
        }
        if (n2 != -1 && n3 != -1) {
            return " (" + n2 + " - " + n3 + ")";
        }
        if (n2 == -1) return " (0 - " + n3 + ")";
        if (n3 != -1) return " (0 - " + n3 + ")";
        return " (" + n2 + " - \u221e)";
    }

    /*
     * Enabled aggressive block sorting
     */
    private String a(boolean bl, boolean bl2, int n2, int n3, int n4, int n5, int n6, int n7, int n8, int n9, double d2, int n10, int n11, int n12, double d3, double d4, int[] arrn) {
        String string;
        block31: {
            String string2;
            j.a a2;
            String string3;
            block39: {
                block38: {
                    block37: {
                        block36: {
                            block35: {
                                block34: {
                                    block33: {
                                        block32: {
                                            string = "";
                                            if (!this.isAdded()) break block31;
                                            string3 = bl ? "" + this.getString(2131624167) : (bl2 ? "" + this.getString(2131624169) : "" + this.getString(2131624168));
                                            a2 = j.a(null).get(n10);
                                            string = string3;
                                            if (a2.C != -1.0) {
                                                string = string3 + "\n" + this.getString(2131624195) + String.format("%1$,.1f", d2) + " " + this.getString(2131624145) + " (0 - " + String.format("%1$,.1f", a2.C) + ")";
                                            }
                                            string2 = string;
                                            if (a2.q != -1) {
                                                string3 = string + this.getString(2131624173);
                                                string2 = string3 + n11 + " (0 - " + a2.q + ")";
                                            }
                                            string3 = string2;
                                            if (a2.A != -1) {
                                                string3 = string2 + this.getString(2131624176);
                                                string3 = string3 + n12 + " (0 - " + a2.A + ")";
                                            }
                                            string = string3;
                                            if (a2.n > 0) {
                                                string = string3;
                                                if (a2.n != -1) {
                                                    string3 = string3 + this.getString(2131624177);
                                                    string = string3 + n9 + " (" + a2.n + " -  \u221e)";
                                                }
                                            }
                                            string3 = string;
                                            if (a2.m > 0) {
                                                string3 = string;
                                                if (a2.r != -1) {
                                                    string3 = string + this.getString(2131624179);
                                                    string3 = string3 + n8 + " (" + a2.m + " - " + a2.r + ")";
                                                }
                                            }
                                            string = string3;
                                            if (a2.m > 0) {
                                                string = string3;
                                                if (a2.r == -1) {
                                                    string3 = string3 + this.getString(2131624179);
                                                    string = string3 + n8 + " (" + a2.m + " - \u221e)";
                                                }
                                            }
                                            string3 = string;
                                            if (a2.m <= 0) {
                                                string3 = string;
                                                if (a2.r > 0) {
                                                    string3 = string + this.getString(2131624179);
                                                    string3 = string3 + n8 + " (0 - " + a2.r + ")";
                                                }
                                            }
                                            string = string3;
                                            if (a2.m <= 0) {
                                                string = string3;
                                                if (a2.r == 0) {
                                                    string3 = string3 + this.getString(2131624179);
                                                    string = string3 + n8 + " (0)";
                                                }
                                            }
                                            if (a2.o != -1) break block32;
                                            string3 = string;
                                            if (a2.p == -1) break block33;
                                        }
                                        string3 = string + this.getString(2131624172) + (n2 + n3) + m.a(a2.p, a2.o);
                                    }
                                    if (a2.v != -1) break block34;
                                    string = string3;
                                    if (a2.w == -1) break block35;
                                }
                                string = string3 + this.getString(2131624175) + n5 + m.a(a2.w, a2.v);
                            }
                            string3 = string;
                            if (a2.z != -1) {
                                string3 = string + this.getString(2131624166) + n7 + m.a(0, a2.z);
                            }
                            if (a2.x != -1) break block36;
                            string = string3;
                            if (a2.y == -1) break block37;
                        }
                        string = string3 + this.getString(2131624178) + n6 + m.a(a2.y, a2.x);
                    }
                    if (a2.s != -1) break block38;
                    string2 = string;
                    if (a2.t == -1) break block39;
                }
                string3 = string + this.getString(2131624171);
                string2 = string3 + n3 + m.a(a2.s, a2.t);
            }
            string3 = string2;
            if (a2.l != -1) {
                string3 = string2 + this.getString(2131624170);
                string3 = string3 + n4 + m.a(a2.l, -1);
            }
            string = string3;
            if (a2.B != -1.0) {
                string = string3 + this.getString(2131624174) + String.format("%1$,.1f", d4 - d3) + " " + this.getString(2131624145) + " (" + String.format("%1$,.1f", a2.B) + " " + this.getString(2131624145) + ")";
            }
            n2 = 0;
            string3 = string;
            while (true) {
                string = string3;
                if (n2 >= h.B.length) break;
                string = string3;
                if (a2.k[n2] > 0) {
                    string = string3;
                    if (arrn != null) {
                        string = string3 + "\n" + this.getResources().getStringArray(2130837508)[n2] + ": " + arrn[n2] + " (0 -" + a2.k[n2] + ")";
                    }
                }
                ++n2;
                string3 = string;
            }
        }
        return string;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final void onClick(View view) {
        switch (view.getId()) {
            default: {
                return;
            }
            case 2131230744: 
        }
        t.a(this.getActivity());
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle != null) {
            this.b = bundle.getInt("challenge");
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup object, Bundle bundle) {
        String string;
        this.d = false;
        this.e = j.b(this.b, (Context)this.getActivity());
        this.c = j.a((Context)this.getActivity()).get((int)this.b).i;
        if (this.c != -1) {
            layoutInflater = layoutInflater.inflate(2131361826, object, false);
            this.a = null;
            ((TextView)layoutInflater.findViewById(2131230941)).setText((CharSequence)this.getString(2131624357));
            ((Button)layoutInflater.findViewById(2131230744)).setOnClickListener((View.OnClickListener)this);
            return layoutInflater;
        }
        layoutInflater = layoutInflater.inflate(2131361825, object, false);
        ((TextView)layoutInflater.findViewById(2131230944)).setText((CharSequence)this.a(this.d, this.e, 0, 0, 0, 0, 0, 0, 0, 0, 0.0, this.b, 0, 0, 0.0, 0.0, null));
        this.a = (TextView)layoutInflater.findViewById(2131230944);
        ((TextView)layoutInflater.findViewById(2131230940)).setText((CharSequence)j.d(this.b, (Context)this.getActivity()));
        final String string2 = j.e(this.b, (Context)this.getActivity());
        if (string2 == null) {
            ((Button)layoutInflater.findViewById(2131230791)).setVisibility(8);
        } else {
            ((Button)layoutInflater.findViewById(2131230791)).setOnClickListener(new View.OnClickListener(){

                public final void onClick(View view) {
                    AlertDialog.Builder builder = new AlertDialog.Builder((Context)m.this.getActivity());
                    view = m.this.getActivity().getLayoutInflater().inflate(2131361829, null);
                    ((TextView)view.findViewById(2131230953)).setText((CharSequence)m.this.getString(2131624186));
                    ((TextView)view.findViewById(2131230933)).setText((CharSequence)string2);
                    builder.setView(view);
                    builder.setNeutralButton((CharSequence)m.this.getString(2131624029), new DialogInterface.OnClickListener(){

                        public final void onClick(DialogInterface dialogInterface, int n2) {
                            dialogInterface.cancel();
                        }
                    });
                    builder.show();
                }
            });
        }
        if ((string = j.g(this.b, (Context)this.getActivity())) == null) {
            ((Button)layoutInflater.findViewById(2131230920)).setVisibility(8);
            return layoutInflater;
        }
        ((Button)layoutInflater.findViewById(2131230920)).setOnClickListener(new View.OnClickListener(){

            public final void onClick(View view) {
                AlertDialog.Builder builder = new AlertDialog.Builder((Context)m.this.getActivity());
                view = m.this.getActivity().getLayoutInflater().inflate(2131361829, null);
                ((TextView)view.findViewById(2131230953)).setText((CharSequence)m.this.getString(2131624187));
                ((TextView)view.findViewById(2131230933)).setText((CharSequence)string);
                builder.setView(view);
                builder.setNeutralButton((CharSequence)m.this.getString(2131624029), new DialogInterface.OnClickListener(){

                    public final void onClick(DialogInterface dialogInterface, int n2) {
                        dialogInterface.cancel();
                    }
                });
                builder.show();
            }
        });
        return layoutInflater;
    }

    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putInt("challenge", this.b);
    }
}

