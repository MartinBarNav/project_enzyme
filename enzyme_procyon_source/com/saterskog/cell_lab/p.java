// 
// Decompiled by Procyon v0.5.36
// 

package com.saterskog.cell_lab;

import android.util.DisplayMetrics;
import android.view.ViewGroup$LayoutParams;
import android.widget.RelativeLayout$LayoutParams;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import java.io.File;
import android.view.View$OnClickListener;
import android.graphics.Color;
import java.io.IOException;
import java.io.StreamCorruptedException;
import java.io.FileNotFoundException;
import android.widget.Toast;
import com.saterskog.b.a;
import android.app.ActivityManager$MemoryInfo;
import android.app.ActivityManager;
import android.preference.PreferenceManager;
import android.util.TypedValue;
import android.widget.RelativeLayout;
import android.view.View;
import android.os.Bundle;
import android.view.ViewGroup;
import android.view.LayoutInflater;
import android.app.Activity;
import android.content.Context;
import android.text.Html;
import android.widget.TextView;
import java.io.InputStream;
import android.app.Fragment;

public final class p extends Fragment implements q.a
{
    public r a;
    float b;
    int c;
    int d;
    int e;
    double f;
    CellWorld g;
    boolean h;
    String i;
    InputStream j;
    public boolean k;
    boolean l;
    TextView m;
    TextView n;
    TextView o;
    private a p;
    
    public p() {
        this.c = -1;
        this.h = false;
        this.l = false;
    }
    
    public final void a(float f) {
        if (f == -1.0f) {
            this.o.setText((CharSequence)"");
        }
        else {
            f = this.b / f;
            if (f > 300.0) {
                com.saterskog.cell_lab.t.b(this.getActivity(), 0, 1);
            }
            if (1000.0f < f) {
                final int i = (int)Math.floor(Math.log10(f));
                this.o.setText((CharSequence)Html.fromHtml(String.format("%.2f·10<sup><small>%d</small></sup>\u00d7", f * Math.pow(10.0, -i), i)));
            }
            else {
                this.o.setText((CharSequence)String.format("%.0f\u00d7", f));
            }
        }
    }
    
    public final void a(int visibility) {
        final int n = 0;
        if (this.m != null) {
            final TextView m = this.m;
            int visibility2;
            if (visibility == 4) {
                visibility2 = 0;
            }
            else {
                visibility2 = 8;
            }
            m.setVisibility(visibility2);
        }
        if (this.m != null) {
            final TextView n2 = this.n;
            if (visibility == 4) {
                visibility = n;
            }
            else {
                visibility = 8;
            }
            n2.setVisibility(visibility);
        }
    }
    
    public final void a(final CellWorld cellWorld) {
        if (this.p != null) {
            this.p.a(cellWorld);
        }
    }
    
    public final void a(final CellWorld cellWorld, int n) {
        if (this.isAdded()) {
            String string7 = null;
            String s2 = null;
            Label_2474: {
                if (n != -1) {
                    final Cell cell = cellWorld.x[n];
                    String str2;
                    final String str = str2 = "" + String.format(this.getString(2131623967), cell.o) + "\n" + String.format(this.getString(2131623973), cell.w * 10.0) + "\n" + String.format(this.getString(2131623969), cell.d * 1000.0) + "\n" + String.format(this.getString(2131623976), cell.p * 100.0) + "\n" + String.format(this.getString(2131623989), cell.X) + " " + this.getString(2131624228) + "\n";
                    if (cell.Y != 0.0f) {
                        str2 = str + String.format(this.getString(2131623970), 100.0f * cell.Y);
                    }
                    String str3 = str2;
                    if (cell.q != 0.0) {
                        str3 = str2 + String.format(this.getString(2131623971), cell.q);
                    }
                    String s = str3;
                    if (com.saterskog.cell_lab.j.a((Context)this.getActivity(), 2)) {
                        int n2 = 0;
                        while (true) {
                            s = str3;
                            if (n2 >= 4) {
                                break;
                            }
                            str3 = str3 + "\n" + this.getString(2131624227) + (n2 + 1) + ": " + String.format("%.2f ", Math.min(1.0, Math.max(-1.0f, cell.U[n2]))) + this.getString(2131624228);
                            ++n2;
                        }
                    }
                    final StringBuilder append = new StringBuilder().append("" + this.getString(2131623966) + "<font color='" + String.format("#%02x%02x%02x", (int)(255.0f * cell.J[0]), (int)(255.0f * cell.J[1]), (int)(255.0f * cell.J[2])) + "'>M" + (cell.D + 1) + "</font><br>" + this.getString(2131623990) + this.getResources().getStringArray(2130837507)[cell.b().s.ordinal()] + "<br>").append(this.getString(2131623974));
                    String str4;
                    if (cell.y) {
                        str4 = this.getString(2131624369);
                    }
                    else {
                        str4 = this.getString(2131624368);
                    }
                    String str6;
                    final String str5 = str6 = append.append(str4).append("<br>").toString() + this.getString(2131623980);
                    if (cell.E == 1) {
                        str6 = str5 + this.getString(2131623987);
                    }
                    String string = str6;
                    if (cell.E == 0) {
                        string = str6 + this.getString(2131623981);
                    }
                    String string2 = string;
                    if (cell.E == 2) {
                        string2 = string + this.getString(2131623982);
                    }
                    String string3 = string2;
                    if (cell.E == 4) {
                        string3 = string2 + this.getString(2131623986);
                    }
                    String string4 = string3;
                    if (cell.E == 3) {
                        string4 = string3 + this.getString(2131623984);
                    }
                    String string5 = string4;
                    if (cell.E == 5) {
                        string5 = string4 + this.getString(2131623985);
                    }
                    String string6 = string5;
                    if (cell.E == 6) {
                        string6 = string5 + this.getString(2131623983);
                    }
                    String str8;
                    final String str7 = str8 = string6 + "<br>" + this.getString(2131623975) + cell.G + "<br>";
                    if (cell.T != -1) {
                        str8 = str7 + this.getString(2131623988) + cell.T + "<br>";
                    }
                    string7 = s;
                    s2 = str8;
                    if (n != -1) {
                        final h s3 = cell.b().s;
                        String string8 = str8;
                        if (s3 == com.saterskog.cell_lab.h.g) {
                            final float a = cell.a(1, 0);
                            final StringBuilder append2 = new StringBuilder().append(str8).append(this.getString(2131623968)).append("\u03c1<sub><small>H<sub><small>2</small></sub>O</small></sub> ");
                            String str9;
                            if (a < 0.0f) {
                                str9 = "- ";
                            }
                            else {
                                str9 = "+ ";
                            }
                            string8 = append2.append(str9).append(String.format("%.0f", Math.abs(a) * 100.0f)).append(" kg/m<sup><small>3</small></sup>").toString();
                        }
                        String string9 = string8;
                        if (s3 == com.saterskog.cell_lab.h.b) {
                            string9 = string8 + String.format(this.getString(2131623979), cell.a(0, 0) * 3.8580246f) + String.format(this.getString(2131623978), 500.0 * Math.sqrt(cell.e * cell.e + cell.f * cell.f));
                        }
                        String string10 = string9;
                        if (s3 == com.saterskog.cell_lab.h.m) {
                            string10 = string9 + this.getString(2131624162) + String.format(": %.2f", cell.a(3, 0)) + "<br>" + this.getString(2131624161) + String.format(": %.2f", cell.a(2, 0)) + "<br>" + this.getString(2131624163) + String.format(": %.2f", cell.a(4, 0)) + "<br>";
                        }
                        String string11 = string10;
                        if (s3 == com.saterskog.cell_lab.h.e) {
                            string11 = string10 + String.format(this.getString(2131623972), cell.S * 10.0f);
                        }
                        String string12 = string11;
                        if (s3 == com.saterskog.cell_lab.h.o) {
                            final String string13 = string11 + this.getString(2131624137) + ": ";
                            n = cell.b(4);
                            String string14 = string13;
                            if (n == 1) {
                                string14 = string13 + this.getString(2131624205);
                            }
                            String string15 = string14;
                            if (n == 0) {
                                string15 = string14 + this.getString(2131624206);
                            }
                            String string16 = string15;
                            if (n == 4) {
                                string16 = string15 + this.getString(2131624204);
                            }
                            String string17 = string16;
                            if (n == 2) {
                                string17 = string16 + this.getString(2131624209);
                            }
                            String string18 = string17;
                            if (n == 3) {
                                string18 = string17 + this.getString(2131624208);
                            }
                            String string19 = string18;
                            if (n == 5) {
                                string19 = string18 + this.getString(2131624207);
                            }
                            String string20 = string19;
                            if (n == 6) {
                                string20 = string19 + this.getString(2131624210);
                            }
                            String string21 = string20;
                            if (n >= 7) {
                                string21 = string20;
                                if (n < 11) {
                                    string21 = string20 + "-" + this.getString(2131624227) + (n + 1 - 7);
                                }
                            }
                            string12 = string21;
                            if (n >= 7) {
                                string12 = string21;
                                if (n >= 11) {
                                    string12 = string21 + "+" + this.getString(2131624227) + (n + 1 - 7 - 4);
                                }
                            }
                        }
                        String str10 = null;
                        Label_2296: {
                            if (s3 != com.saterskog.cell_lab.h.l) {
                                str10 = string12;
                                if (s3 != com.saterskog.cell_lab.h.k) {
                                    break Label_2296;
                                }
                            }
                            final String string22 = string12 + this.getString(2131624095) + ": ";
                            n = cell.b(3);
                            String string23 = string22;
                            if (n == 0) {
                                string23 = string22 + this.getString(2131624242);
                            }
                            String string24 = string23;
                            if (n == 5) {
                                string24 = string23 + this.getString(2131624247);
                            }
                            String string25 = string24;
                            if (n == 3) {
                                string25 = string24 + this.getString(2131624244);
                            }
                            String string26 = string25;
                            if (n == 1) {
                                string26 = string25 + this.getString(2131624243);
                            }
                            String string27 = string26;
                            if (n == 2) {
                                string27 = string26 + this.getString(2131624245);
                            }
                            String string28 = string27;
                            if (n == 4) {
                                string28 = string27 + this.getString(2131624246);
                            }
                            str10 = string28 + "<br>";
                        }
                        if (s3 != com.saterskog.cell_lab.h.n && s3 != com.saterskog.cell_lab.h.l) {
                            string7 = s;
                            s2 = str10;
                            if (s3 != com.saterskog.cell_lab.h.k) {
                                break Label_2474;
                            }
                        }
                        n = 0;
                        while (true) {
                            string7 = s;
                            s2 = str10;
                            if (n >= 4) {
                                break;
                            }
                            str10 = str10 + this.getString(2131624227) + (n + 1) + String.format(this.getString(2131623965), cell.V[n]) + " " + this.getString(2131624228) + "/" + this.getString(2131624145) + "<br>";
                            ++n;
                        }
                    }
                }
                else {
                    string7 = this.getString(2131623977);
                    s2 = "";
                }
            }
            this.getActivity().runOnUiThread((Runnable)new Runnable() {
                @Override
                public final void run() {
                    com.saterskog.cell_lab.p.this.m.setText((CharSequence)string7);
                    com.saterskog.cell_lab.p.this.n.setText((CharSequence)Html.fromHtml(s2));
                }
            });
        }
    }
    
    public final void onAttach(final Activity activity) {
        super.onAttach(activity);
        try {
            this.p = (a)activity;
        }
        catch (ClassCastException ex) {
            throw new ClassCastException(activity.toString() + " must implement CellProvider");
        }
    }
    
    public final View onCreateView(final LayoutInflater layoutInflater, final ViewGroup viewGroup, Bundle string) {
        super.onCreateView(layoutInflater, viewGroup, string);
        while (true) {
            if (string != null) {
                RelativeLayout relativeLayout = null;
                int n = 0;
                Object o = null;
                int n3 = 0;
            Label_0178_Outer:
                while (true) {
                    Label_1198: {
                        PlayActivity playActivity = null;
                    Label_0602:
                        while (true) {
                        Label_0585:
                            while (true) {
                                Environment c;
                                while (true) {
                                    try {
                                        this.g = (CellWorld)string.getParcelable("mCellWorld");
                                        this.f = string.getDouble("radius");
                                        this.c = string.getInt("challenge");
                                        this.f = this.g.e.k;
                                        relativeLayout = new RelativeLayout((Context)this.getActivity());
                                        if (this.g != null) {
                                            (this.a = new r(this.getActivity(), this.g, this.p, this, this.c, this.f)).setId(2131230831);
                                            if (string == null) {
                                                break Label_0585;
                                            }
                                            this.a.a.z = string.getInt("mode");
                                            this.a.a.A = string.getInt("tool");
                                            this.a.a.M = string.getBoolean("hasWon");
                                            relativeLayout.addView((View)this.a);
                                        }
                                        n = (int)TypedValue.applyDimension(1, 8.0f, this.getActivity().getResources().getDisplayMetrics());
                                        playActivity = (PlayActivity)this.getActivity();
                                        if (playActivity != null && playActivity.D != null) {
                                            o = new TextView((Context)this.getActivity());
                                            ((TextView)o).setId(2131230830);
                                            string = (Bundle)PreferenceManager.getDefaultSharedPreferences((Context)this.getActivity()).getString("log_stats", "none");
                                            final String[] stringArray = this.getResources().getStringArray(2130837514);
                                            for (int n2 = 0; n2 < stringArray.length && !stringArray[n2].equals(string); ++n2) {}
                                            break Label_0602;
                                        }
                                        break Label_1198;
                                        c = this.p.c();
                                        final ActivityManager activityManager = (ActivityManager)this.getActivity().getSystemService("activity");
                                        final ActivityManager$MemoryInfo activityManager$MemoryInfo = new ActivityManager$MemoryInfo();
                                        activityManager.getMemoryInfo(activityManager$MemoryInfo);
                                        // iftrue(Label_0408:, activityManager$MemoryInfo.availMem >= CellWorld.a(c))
                                        com.saterskog.b.a.a("Estimated memory to not be enough");
                                        throw new OutOfMemoryError();
                                    }
                                    catch (OutOfMemoryError outOfMemoryError) {
                                        this.g = null;
                                        Toast.makeText((Context)this.getActivity(), (CharSequence)this.getString(2131624348), 1).show();
                                        this.getActivity().finish();
                                        continue Label_0178_Outer;
                                    }
                                    break;
                                }
                                Label_0408: {
                                    this.g = new CellWorld(false, c);
                                }
                                if (this.j != null) {
                                    try {
                                        final int a = this.g.a(this.j);
                                        if (this.c == -1 && this.k && a < 95) {
                                            Toast.makeText((Context)this.getActivity(), (CharSequence)("format conversion v" + a + " \u2192 v95"), 1).show();
                                        }
                                        if (this.c != -1) {
                                            this.g.c(0);
                                            this.g.M = 0.0;
                                        }
                                        this.j.close();
                                        if (this.l) {
                                            this.g.c(0);
                                            continue Label_0178_Outer;
                                        }
                                        continue Label_0178_Outer;
                                    }
                                    catch (FileNotFoundException ex) {
                                        ex.printStackTrace();
                                        continue Label_0178_Outer;
                                    }
                                    catch (StreamCorruptedException ex2) {
                                        ex2.printStackTrace();
                                        continue Label_0178_Outer;
                                    }
                                    catch (IOException ex3) {
                                        com.saterskog.b.a.a("io this is bad");
                                        ex3.printStackTrace();
                                        continue Label_0178_Outer;
                                    }
                                    continue Label_0178_Outer;
                                }
                                continue Label_0178_Outer;
                            }
                            this.a.a.A = this.e;
                            continue;
                        }
                        int n2 = 0;
                        ((TextView)o).setText((CharSequence)(this.getString(2131624149) + this.getResources().getStringArray(2130837513)[n2].toLowerCase() + this.getString(2131624150) + playActivity.D.getAbsolutePath()));
                        ((TextView)o).setTextColor(-1);
                        ((TextView)o).setTextSize(1, 14.0f);
                        ((TextView)o).setBackgroundColor(Color.argb(192, 0, 0, 0));
                        ((TextView)o).setOnClickListener((View$OnClickListener)new View$OnClickListener() {
                            final /* synthetic */ File a = playActivity.D.getParentFile();
                            
                            public final void onClick(final View view) {
                                final Uri fromFile = Uri.fromFile(this.a);
                                final Intent intent = new Intent("android.intent.action.VIEW");
                                intent.setDataAndType(fromFile, "*/*");
                                intent.setPackage("com.android.chrome");
                                try {
                                    com.saterskog.cell_lab.p.this.startActivity(intent);
                                }
                                catch (ActivityNotFoundException ex) {
                                    Toast.makeText((Context)com.saterskog.cell_lab.p.this.getActivity(), (CharSequence)"Please install Chrome.", 1).show();
                                }
                            }
                        });
                        ((TextView)o).setPadding(n, n, n, n);
                        final RelativeLayout$LayoutParams relativeLayout$LayoutParams = new RelativeLayout$LayoutParams(-1, -2);
                        relativeLayout$LayoutParams.addRule(12);
                        relativeLayout.addView((View)o, (ViewGroup$LayoutParams)relativeLayout$LayoutParams);
                        n3 = 0;
                        break;
                    }
                    o = null;
                    n3 = n;
                    break;
                }
                (this.m = new TextView((Context)this.getActivity())).setTextColor(-1);
                this.m.setTextSize(1, 14.0f);
                this.m.setBackgroundColor(Color.argb(192, 0, 0, 0));
                this.m.setPadding(n, n, n, n3);
                this.m.setMinimumWidth(relativeLayout.getWidth() / 2);
                this.m.setVisibility(4);
                final RelativeLayout$LayoutParams relativeLayout$LayoutParams2 = new RelativeLayout$LayoutParams(-2, -2);
                final RelativeLayout$LayoutParams relativeLayout$LayoutParams3 = new RelativeLayout$LayoutParams(-2, -2);
                if (o == null) {
                    relativeLayout$LayoutParams2.addRule(12);
                    relativeLayout$LayoutParams3.addRule(12);
                }
                else {
                    relativeLayout$LayoutParams2.addRule(2, 2131230830);
                    relativeLayout$LayoutParams3.addRule(2, 2131230830);
                }
                relativeLayout$LayoutParams2.addRule(9);
                this.m.setId(2131230828);
                relativeLayout.addView((View)this.m, (ViewGroup$LayoutParams)relativeLayout$LayoutParams2);
                (this.n = new TextView((Context)this.getActivity())).setTextColor(-1);
                this.n.setTextSize(1, 14.0f);
                this.n.setBackgroundColor(Color.argb(192, 0, 0, 0));
                this.n.setPadding(n, n, n, n3);
                this.n.setMinimumWidth(relativeLayout.getWidth() / 2);
                this.n.setVisibility(4);
                relativeLayout$LayoutParams3.addRule(11);
                this.n.setId(2131230829);
                relativeLayout$LayoutParams3.addRule(1, 2131230828);
                relativeLayout$LayoutParams3.addRule(6, 2131230828);
                relativeLayout.addView((View)this.n, (ViewGroup$LayoutParams)relativeLayout$LayoutParams3);
                (this.o = new TextView((Context)this.getActivity())).setTextColor(-16777216);
                this.o.setTextSize(1, 18.0f);
                this.o.setPadding(n, n, n, n);
                final RelativeLayout$LayoutParams relativeLayout$LayoutParams4 = new RelativeLayout$LayoutParams(-2, -2);
                relativeLayout$LayoutParams4.addRule(11);
                relativeLayout$LayoutParams4.addRule(10);
                relativeLayout.addView((View)this.o, (ViewGroup$LayoutParams)relativeLayout$LayoutParams4);
                final DisplayMetrics displayMetrics = this.getResources().getDisplayMetrics();
                this.b = (float)(displayMetrics.widthPixels * 0.0254 / (displayMetrics.density * 160.0f));
                if (this.g != null) {
                    this.a(this.a.a.A);
                }
                return (View)relativeLayout;
            }
            continue;
        }
    }
    
    public final void onDestroy() {
        super.onDestroy();
    }
    
    public final void onPause() {
        super.onPause();
    }
    
    public final void onResume() {
        super.onResume();
    }
    
    public final void onSaveInstanceState(final Bundle p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: aload_1        
        //     2: invokespecial   android/app/Fragment.onSaveInstanceState:(Landroid/os/Bundle;)V
        //     5: aload_0        
        //     6: getfield        com/saterskog/cell_lab/p.a:Lcom/saterskog/cell_lab/r;
        //     9: getfield        com/saterskog/cell_lab/r.a:Lcom/saterskog/cell_lab/q;
        //    12: astore_2       
        //    13: aload_2        
        //    14: getfield        com/saterskog/cell_lab/q.F:Ljava/util/concurrent/Future;
        //    17: ifnull          30
        //    20: aload_2        
        //    21: getfield        com/saterskog/cell_lab/q.F:Ljava/util/concurrent/Future;
        //    24: invokeinterface java/util/concurrent/Future.get:()Ljava/lang/Object;
        //    29: pop            
        //    30: aload_1        
        //    31: ldc_w           "mCellWorld"
        //    34: aload_0        
        //    35: getfield        com/saterskog/cell_lab/p.g:Lcom/saterskog/cell_lab/CellWorld;
        //    38: invokevirtual   android/os/Bundle.putParcelable:(Ljava/lang/String;Landroid/os/Parcelable;)V
        //    41: aload_1        
        //    42: ldc_w           "radius"
        //    45: aload_0        
        //    46: getfield        com/saterskog/cell_lab/p.f:D
        //    49: invokevirtual   android/os/Bundle.putDouble:(Ljava/lang/String;D)V
        //    52: aload_1        
        //    53: ldc_w           "mode"
        //    56: aload_0        
        //    57: getfield        com/saterskog/cell_lab/p.a:Lcom/saterskog/cell_lab/r;
        //    60: getfield        com/saterskog/cell_lab/r.a:Lcom/saterskog/cell_lab/q;
        //    63: getfield        com/saterskog/cell_lab/q.z:I
        //    66: invokevirtual   android/os/Bundle.putInt:(Ljava/lang/String;I)V
        //    69: aload_1        
        //    70: ldc_w           "tool"
        //    73: aload_0        
        //    74: getfield        com/saterskog/cell_lab/p.a:Lcom/saterskog/cell_lab/r;
        //    77: getfield        com/saterskog/cell_lab/r.a:Lcom/saterskog/cell_lab/q;
        //    80: getfield        com/saterskog/cell_lab/q.A:I
        //    83: invokevirtual   android/os/Bundle.putInt:(Ljava/lang/String;I)V
        //    86: aload_1        
        //    87: ldc_w           "challenge"
        //    90: aload_0        
        //    91: getfield        com/saterskog/cell_lab/p.c:I
        //    94: invokevirtual   android/os/Bundle.putInt:(Ljava/lang/String;I)V
        //    97: aload_1        
        //    98: ldc_w           "hasWon"
        //   101: aload_0        
        //   102: getfield        com/saterskog/cell_lab/p.a:Lcom/saterskog/cell_lab/r;
        //   105: getfield        com/saterskog/cell_lab/r.a:Lcom/saterskog/cell_lab/q;
        //   108: getfield        com/saterskog/cell_lab/q.M:Z
        //   111: invokevirtual   android/os/Bundle.putBoolean:(Ljava/lang/String;Z)V
        //   114: return         
        //   115: astore_2       
        //   116: aload_2        
        //   117: invokevirtual   java/lang/InterruptedException.printStackTrace:()V
        //   120: goto            30
        //   123: astore_2       
        //   124: aload_2        
        //   125: invokevirtual   java/util/concurrent/ExecutionException.printStackTrace:()V
        //   128: goto            30
        //   131: astore_1       
        //   132: aload_0        
        //   133: invokevirtual   com/saterskog/cell_lab/p.getActivity:()Landroid/app/Activity;
        //   136: ldc_w           "Not enough memory"
        //   139: iconst_1       
        //   140: invokestatic    android/widget/Toast.makeText:(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;
        //   143: invokevirtual   android/widget/Toast.show:()V
        //   146: goto            114
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                     
        //  -----  -----  -----  -----  -----------------------------------------
        //  20     30     115    123    Ljava/lang/InterruptedException;
        //  20     30     123    131    Ljava/util/concurrent/ExecutionException;
        //  30     114    131    149    Ljava/lang/OutOfMemoryError;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0030:
        //     at com.strobel.decompiler.ast.Error.expressionLinkedFromMultipleLocations(Error.java:27)
        //     at com.strobel.decompiler.ast.AstOptimizer.mergeDisparateObjectInitializations(AstOptimizer.java:2596)
        //     at com.strobel.decompiler.ast.AstOptimizer.optimize(AstOptimizer.java:235)
        //     at com.strobel.decompiler.ast.AstOptimizer.optimize(AstOptimizer.java:42)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:214)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:99)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethodBody(AstBuilder.java:782)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethod(AstBuilder.java:675)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addTypeMembers(AstBuilder.java:552)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeCore(AstBuilder.java:519)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeNoCache(AstBuilder.java:161)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createType(AstBuilder.java:150)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addType(AstBuilder.java:125)
        //     at com.strobel.decompiler.languages.java.JavaLanguage.buildAst(JavaLanguage.java:71)
        //     at com.strobel.decompiler.languages.java.JavaLanguage.decompileType(JavaLanguage.java:59)
        //     at com.strobel.decompiler.DecompilerDriver.decompileType(DecompilerDriver.java:330)
        //     at com.strobel.decompiler.DecompilerDriver.decompileJar(DecompilerDriver.java:251)
        //     at com.strobel.decompiler.DecompilerDriver.main(DecompilerDriver.java:126)
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    public final void onStart() {
        super.onStart();
    }
    
    public final void onStop() {
        super.onStop();
    }
    
    public interface a
    {
        void a(final float p0);
        
        void a(final CellWorld p0);
        
        void a(final CellWorld p0, final boolean p1);
        
        void a(final short p0);
        
        Environment c();
        
        Gene[] f();
        
        boolean g();
    }
}
