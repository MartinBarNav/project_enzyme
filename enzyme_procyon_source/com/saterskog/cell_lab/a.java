// 
// Decompiled by Procyon v0.5.36
// 

package com.saterskog.cell_lab;

import android.content.pm.PackageManager$NameNotFoundException;
import android.content.res.Resources$NotFoundException;
import android.text.Html;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.content.DialogInterface;
import android.content.DialogInterface$OnClickListener;
import android.text.method.LinkMovementMethod;
import android.widget.TextView;
import android.view.ViewGroup;
import android.app.AlertDialog$Builder;
import android.net.Uri;
import android.content.Intent;
import java.io.IOException;
import java.io.FileNotFoundException;
import java.io.Reader;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import android.os.RemoteException;
import android.content.IntentSender$SendIntentException;
import com.saterskog.a.b;
import com.saterskog.a.e;
import com.saterskog.a.c;
import java.util.Date;
import java.text.DateFormat;
import android.view.ViewGroup$LayoutParams;
import android.widget.LinearLayout$LayoutParams;
import android.content.Context;
import android.widget.LinearLayout;
import android.widget.Button;
import android.view.View;
import android.view.View$OnClickListener;
import android.app.Fragment;

public final class a extends Fragment implements View$OnClickListener
{
    private void a(final View view, final int n) {
        ((Button)view.findViewById(n)).setOnClickListener((View$OnClickListener)this);
    }
    
    public final void a() {
        if (this.getActivity() != null) {
            new Thread(new Runnable() {
                final /* synthetic */ int a;
                
                @Override
                public final void run() {
                    try {
                        com.saterskog.b.a.b("af.updateDonation(0): sleep...");
                        Thread.sleep(this.a);
                        com.saterskog.b.a.b("done!");
                        com.saterskog.cell_lab.a.this.getActivity().runOnUiThread((Runnable)new Runnable() {
                            @Override
                            public final void run() {
                                final l l = (l)com.saterskog.cell_lab.a.this.getActivity();
                                if (l != null && l.k != null && com.saterskog.cell_lab.a.this.getView() != null) {
                                    final LinearLayout linearLayout = (LinearLayout)com.saterskog.cell_lab.a.this.getView().findViewById(2131230803);
                                    linearLayout.removeAllViews();
                                    for (int i = 0; i < l.k.length; ++i) {
                                        final Button button = new Button((Context)com.saterskog.cell_lab.a.this.getActivity());
                                        button.setLayoutParams((ViewGroup$LayoutParams)new LinearLayout$LayoutParams(-2, -2));
                                        button.setText((CharSequence)l.k[i]);
                                        button.setEnabled(!l.j[i]);
                                        button.setOnClickListener((View$OnClickListener)new View$OnClickListener() {
                                            public final void onClick(View b) {
                                                final l a = l;
                                                final int b2 = i;
                                                String str = "Unknown amount";
                                                try {
                                                    if (a.k != null) {
                                                        str = a.k[b2];
                                                    }
                                                    final String string = DateFormat.getDateTimeInstance().format(new Date()) + ": " + str;
                                                    b = (View)a.b;
                                                    final String str2 = a.i[b2];
                                                    ((b)b).b();
                                                    ((b)b).a("launchPurchaseFlow");
                                                    ((b)b).b("launchPurchaseFlow");
                                                    if ("inapp".equals("subs") && !((b)b).f) {
                                                        final c c = new c(-1009, "Subscriptions are not available.");
                                                        ((b)b).c();
                                                        if (a != null) {
                                                            ((b.d)a).a(c, null);
                                                        }
                                                    }
                                                    else {
                                                        try {
                                                            ((b)b).c("Constructing buy intent for " + str2 + ", item type: " + "inapp");
                                                            final int a2 = ((b)b).a(((b)b).k.a(3, ((b)b).j.getPackageName(), str2, "inapp", string));
                                                            if (a2 == 0) {
                                                                goto Label_0370;
                                                            }
                                                            ((b)b).d("Unable to buy item, Error response: " + b.a(a2));
                                                            ((b)b).c();
                                                            final c c2 = new c(a2, "Unable to buy item");
                                                            if (a != null) {
                                                                ((b.d)a).a(c2, null);
                                                            }
                                                        }
                                                        catch (IntentSender$SendIntentException ex) {
                                                            ((b)b).d("SendIntentException while launching purchase flow for sku " + str2);
                                                            ex.printStackTrace();
                                                            ((b)b).c();
                                                            final c c3 = new c(-1004, "Failed to send intent.");
                                                            if (a != null) {
                                                                ((b.d)a).a(c3, null);
                                                            }
                                                        }
                                                        catch (RemoteException ex2) {
                                                            ((b)b).d("RemoteException while launching purchase flow for sku " + str2);
                                                            ex2.printStackTrace();
                                                            ((b)b).c();
                                                            final c c4 = new c(-1001, "Remote exception while starting purchase flow");
                                                            if (a != null) {
                                                                ((b.d)a).a(c4, null);
                                                            }
                                                        }
                                                    }
                                                }
                                                catch (b.a a3) {}
                                            }
                                        });
                                        final int n = (int)(com.saterskog.cell_lab.a.this.getResources().getDisplayMetrics().density * 8.0f + 0.5f);
                                        final LinearLayout$LayoutParams layoutParams = new LinearLayout$LayoutParams(-2, -2);
                                        layoutParams.setMargins(n, n, n, n);
                                        button.setLayoutParams((ViewGroup$LayoutParams)layoutParams);
                                        button.setPadding(n, n, n, n);
                                        button.setTextSize(2, 14.0f);
                                        linearLayout.addView((View)button);
                                    }
                                    try {
                                        final BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(com.saterskog.cell_lab.a.this.getActivity().openFileInput("consumptions")));
                                        final StringBuilder sb = new StringBuilder();
                                        while (true) {
                                            final String line = bufferedReader.readLine();
                                            if (line == null) {
                                                goto Label_0451;
                                            }
                                            sb.append(line).append("\n");
                                        }
                                    }
                                    catch (FileNotFoundException ex2) {}
                                    catch (IOException ex) {
                                        com.saterskog.b.a.a("updateDonation", ex);
                                        goto Label_0330;
                                    }
                                    goto Label_0398;
                                }
                            }
                        });
                    }
                    catch (InterruptedException ex) {
                        com.saterskog.b.a.a(ex);
                    }
                }
            }).start();
        }
    }
    
    public final void onClick(View inflate) {
        switch (inflate.getId()) {
            case 2131230746: {
                this.a();
                ((l)this.getActivity()).a();
                break;
            }
            case 2131230745: {
                final long b = com.saterskog.b.a.b((Context)this.getActivity());
                com.saterskog.b.a.a("button", "rate", com.saterskog.b.a.a(b), b, this.getActivity());
                final Intent intent = new Intent("android.intent.action.VIEW");
                intent.setData(Uri.parse("market://details?id=com.saterskog.cell_lab"));
                this.startActivity(intent);
                break;
            }
            case 2131230742: {
                final AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder((Context)this.getActivity());
                inflate = this.getActivity().getLayoutInflater().inflate(2131361815, (ViewGroup)null);
                ((TextView)inflate.findViewById(2131230953)).setText((CharSequence)this.getString(2131623952));
                ((TextView)inflate.findViewById(2131230933)).setText(2131623957);
                ((TextView)inflate.findViewById(2131230933)).setMovementMethod(LinkMovementMethod.getInstance());
                alertDialog$Builder.setView(inflate);
                alertDialog$Builder.setNeutralButton((CharSequence)this.getString(2131624029), (DialogInterface$OnClickListener)new DialogInterface$OnClickListener() {
                    public final void onClick(final DialogInterface dialogInterface, final int n) {
                        dialogInterface.cancel();
                    }
                });
                alertDialog$Builder.show();
                break;
            }
        }
    }
    
    public final View onCreateView(LayoutInflater inflate, final ViewGroup viewGroup, final Bundle bundle) {
        inflate = (LayoutInflater)inflate.inflate(2131361823, viewGroup, false);
        final TextView textView = (TextView)((View)inflate).findViewById(2131230926);
    Label_0080:
        while (true) {
            if (textView == null) {
                break Label_0080;
            }
            while (true) {
                while (true) {
                    try {
                        textView.setText((CharSequence)(this.getActivity().getString(2131623955) + " " + this.getActivity().getPackageManager().getPackageInfo(this.getActivity().getPackageName(), 0).versionName));
                        final TextView textView2 = (TextView)((View)inflate).findViewById(2131230949);
                        textView2.setText((CharSequence)Html.fromHtml(this.getString(2131624071)));
                        textView2.setMovementMethod(LinkMovementMethod.getInstance());
                        final TextView textView3 = (TextView)((View)inflate).findViewById(2131230950);
                        textView3.setText((CharSequence)Html.fromHtml(this.getString(2131624373)));
                        textView3.setMovementMethod(LinkMovementMethod.getInstance());
                        final TextView textView4 = (TextView)((View)inflate).findViewById(2131230951);
                        textView4.setText((CharSequence)Html.fromHtml(this.getString(2131624370)));
                        textView4.setMovementMethod(LinkMovementMethod.getInstance());
                        if (!j.b("4", (Context)this.getActivity())) {
                            ((Button)((View)inflate).findViewById(2131230745)).setVisibility(8);
                            this.a((View)inflate, 2131230742);
                            this.a((View)inflate, 2131230746);
                            return (View)inflate;
                        }
                    }
                    catch (Resources$NotFoundException ex) {
                        com.saterskog.b.a.a((Throwable)ex);
                        continue Label_0080;
                    }
                    catch (PackageManager$NameNotFoundException ex2) {
                        com.saterskog.b.a.a((Throwable)ex2);
                        continue Label_0080;
                    }
                    this.a((View)inflate, 2131230745);
                    continue;
                }
            }
            break;
        }
    }
    
    public final void onResume() {
        super.onResume();
        this.a();
    }
}
