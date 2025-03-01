package com.saterskog.cell_lab;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Fragment;
import android.app.PendingIntent;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentSender;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Bundle;
import android.os.RemoteException;
import android.text.Html;
import android.text.method.LinkMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.saterskog.a.b;
import com.saterskog.a.c;
import com.saterskog.a.e;
import com.saterskog.cell_lab.j;
import com.saterskog.cell_lab.l;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.text.DateFormat;
import java.util.Date;

public final class a
extends Fragment
implements View.OnClickListener {
    private void a(View view, int n2) {
        ((Button)view.findViewById(n2)).setOnClickListener((View.OnClickListener)this);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final void a() {
        if (this.getActivity() == null) {
            return;
        }
        new Thread(new Runnable(){
            final /* synthetic */ int a;
            {
                this.a = 0;
            }

            /*
             * Enabled force condition propagation
             * Lifted jumps to return sites
             */
            @Override
            public final void run() {
                try {
                    com.saterskog.b.a.b("af.updateDonation(0): sleep...");
                    Thread.sleep(this.a);
                    com.saterskog.b.a.b("done!");
                    Activity activity = a.this.getActivity();
                    Runnable runnable = new Runnable(){

                        /*
                         * Unable to fully structure code
                         * Enabled aggressive block sorting
                         * Enabled unnecessary exception pruning
                         * Enabled aggressive exception aggregation
                         * Lifted jumps to return sites
                         */
                        @Override
                        public final void run() {
                            var1_1 = (l)a.this.getActivity();
                            if (var1_1 == null) return;
                            if (var1_1.k == null) {
                                return;
                            }
                            if (a.this.getView() == null) return;
                            var2_4 = (LinearLayout)a.this.getView().findViewById(2131230803);
                            var2_4.removeAllViews();
                            for (var3_5 = 0; var3_5 < var1_1.k.length; ++var3_5) {
                                var4_6 = new Button((Context)a.this.getActivity());
                                var4_6.setLayoutParams((ViewGroup.LayoutParams)new LinearLayout.LayoutParams(-2, -2));
                                var4_6.setText((CharSequence)var1_1.k[var3_5]);
                                var5_7 = var1_1.j[var3_5] == false;
                                var4_6.setEnabled(var5_7);
                                var4_6.setOnClickListener(new View.OnClickListener((l)var1_1, var3_5){
                                    final /* synthetic */ l a;
                                    final /* synthetic */ int b;
                                    {
                                        this.a = l2;
                                        this.b = n2;
                                    }

                                    /*
                                     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
                                     * Enabled aggressive block sorting
                                     * Enabled unnecessary exception pruning
                                     * Enabled aggressive exception aggregation
                                     */
                                    public final void onClick(View object) {
                                        int n2;
                                        Object object2;
                                        Object object3;
                                        Object object4;
                                        l l2 = this.a;
                                        int n3 = this.b;
                                        object = "Unknown amount";
                                        try {
                                            if (l2.k != null) {
                                                object = l2.k[n3];
                                            }
                                            object4 = new StringBuilder();
                                            object3 = DateFormat.getDateTimeInstance();
                                            object2 = new Date();
                                            object2 = ((StringBuilder)object4).append(((DateFormat)object3).format((Date)object2)).append(": ").append((String)object).toString();
                                            object = l2.b;
                                            object3 = l2.i[n3];
                                            n2 = n3 + 1;
                                            ((b)object).b();
                                            ((b)object).a("launchPurchaseFlow");
                                            ((b)object).b("launchPurchaseFlow");
                                            if ("inapp".equals("subs") && !((b)object).f) {
                                                object3 = new c(-1009, "Subscriptions are not available.");
                                                ((b)object).c();
                                                if (l2 == null) return;
                                                l2.a((c)object3, (e)null);
                                                return;
                                            }
                                            try {
                                                object4 = new StringBuilder("Constructing buy intent for ");
                                                ((b)object).c(((StringBuilder)object4).append((String)object3).append(", item type: ").append("inapp").toString());
                                                object4 = ((b)object).k.a(3, ((b)object).j.getPackageName(), (String)object3, "inapp", (String)object2);
                                                n3 = ((b)object).a((Bundle)object4);
                                                if (n3 != 0) {
                                                    object4 = new StringBuilder("Unable to buy item, Error response: ");
                                                    ((b)object).d(((StringBuilder)object4).append(b.a(n3)).toString());
                                                    ((b)object).c();
                                                    object4 = new c(n3, "Unable to buy item");
                                                    if (l2 == null) return;
                                                    l2.a((c)object4, (e)null);
                                                    return;
                                                }
                                            }
                                            catch (IntentSender.SendIntentException sendIntentException) {
                                                object2 = new StringBuilder("SendIntentException while launching purchase flow for sku ");
                                                ((b)object).d(((StringBuilder)object2).append((String)object3).toString());
                                                sendIntentException.printStackTrace();
                                                ((b)object).c();
                                                object = new c(-1004, "Failed to send intent.");
                                                if (l2 == null) return;
                                                l2.a((c)object, (e)null);
                                                return;
                                            }
                                            catch (RemoteException remoteException) {
                                                object4 = new StringBuilder("RemoteException while launching purchase flow for sku ");
                                                ((b)object).d(((StringBuilder)object4).append((String)object3).toString());
                                                remoteException.printStackTrace();
                                                ((b)object).c();
                                                object = new c(-1001, "Remote exception while starting purchase flow");
                                                if (l2 == null) return;
                                                l2.a((c)object, (e)null);
                                                return;
                                            }
                                        }
                                        catch (b.a a2) {
                                            com.saterskog.b.a.a("buy failed", a2);
                                            return;
                                        }
                                        {
                                            object4 = (PendingIntent)object4.getParcelable("BUY_INTENT");
                                            object2 = new StringBuilder("Launching buy intent for ");
                                            ((b)object).c(((StringBuilder)object2).append((String)object3).append(". Request code: ").append(n2).toString());
                                            ((b)object).m = n2;
                                            ((b)object).p = l2;
                                            ((b)object).n = "inapp";
                                            object2 = object4.getIntentSender();
                                            object4 = new Intent();
                                            l2.startIntentSenderForResult((IntentSender)object2, n2, (Intent)object4, 0, 0, 0);
                                            return;
                                        }
                                    }
                                });
                                var6_8 = (int)(a.this.getResources().getDisplayMetrics().density * 8.0f + 0.5f);
                                var7_9 = new LinearLayout.LayoutParams(-2, -2);
                                var7_9.setMargins(var6_8, var6_8, var6_8, var6_8);
                                var4_6.setLayoutParams((ViewGroup.LayoutParams)var7_9);
                                var4_6.setPadding(var6_8, var6_8, var6_8, var6_8);
                                var4_6.setTextSize(2, 14.0f);
                                var2_4.addView((View)var4_6);
                            }
                            var2_4 = "";
                            try {
                                var7_9 = a.this.getActivity().openFileInput("consumptions");
                                var4_6 = new InputStreamReader((InputStream)var7_9);
                                var1_1 = new BufferedReader((Reader)var4_6);
                                var4_6 = new StringBuilder();
                                while ((var7_9 = var1_1.readLine()) != null) {
                                    var4_6.append((String)var7_9).append("\n");
                                }
                                var1_1.close();
                                var1_1 = new StringBuilder();
                                var2_4 = var1_1 = var1_1.append("").append(var4_6.toString()).toString();
                                ** GOTO lbl-1000
                            }
                            catch (FileNotFoundException var1_2) {}
                            ** GOTO lbl-1000
                            catch (IOException var1_3) {
                                com.saterskog.b.a.a("updateDonation", var1_3);
                            }
lbl-1000:
                            // 3 sources

                            {
                                var1_1 = var2_4;
                                if (var2_4.length() > 0) {
                                    var1_1 = var2_4;
                                    if (var2_4.substring(0, 1).equals("\n")) {
                                        var1_1 = var2_4.substring(1);
                                    }
                                }
                                var2_4 = var1_1.length() > 0 && var1_1.substring(var1_1.length() - 1).equals("\n") != false ? var1_1.substring(0, var1_1.length() - 1) : var1_1;
                                ((TextView)a.this.getView().findViewById(2131230928)).setText((CharSequence)(a.this.getString(2131624049) + (String)var2_4));
                                return;
                            }
                        }
                    };
                    activity.runOnUiThread(runnable);
                    return;
                }
                catch (InterruptedException interruptedException) {
                    com.saterskog.b.a.a(interruptedException);
                    return;
                }
            }
        }).start();
    }

    /*
     * Enabled aggressive block sorting
     */
    public final void onClick(View view) {
        switch (view.getId()) {
            case 2131230746: {
                this.a();
                ((l)this.getActivity()).a();
                return;
            }
            case 2131230745: {
                long l2 = com.saterskog.b.a.b((Context)this.getActivity());
                com.saterskog.b.a.a("button", "rate", com.saterskog.b.a.a(l2), l2, this.getActivity());
                view = new Intent("android.intent.action.VIEW");
                view.setData(Uri.parse((String)"market://details?id=com.saterskog.cell_lab"));
                this.startActivity((Intent)view);
                return;
            }
            case 2131230742: {
                AlertDialog.Builder builder = new AlertDialog.Builder((Context)this.getActivity());
                view = this.getActivity().getLayoutInflater().inflate(2131361815, null);
                ((TextView)view.findViewById(2131230953)).setText((CharSequence)this.getString(2131623952));
                ((TextView)view.findViewById(2131230933)).setText(2131623957);
                ((TextView)view.findViewById(2131230933)).setMovementMethod(LinkMovementMethod.getInstance());
                builder.setView(view);
                builder.setNeutralButton((CharSequence)this.getString(2131624029), new DialogInterface.OnClickListener(){

                    public final void onClick(DialogInterface dialogInterface, int n2) {
                        dialogInterface.cancel();
                    }
                });
                builder.show();
                return;
            }
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup object, Bundle bundle) {
        bundle = (TextView)(layoutInflater = layoutInflater.inflate(2131361823, (ViewGroup)object, false)).findViewById(2131230926);
        if (bundle != null) {
            try {
                object = new StringBuilder();
                bundle.setText((CharSequence)((StringBuilder)object).append(this.getActivity().getString(2131623955)).append(" ").append(this.getActivity().getPackageManager().getPackageInfo((String)this.getActivity().getPackageName(), (int)0).versionName).toString());
            }
            catch (Resources.NotFoundException notFoundException) {
                com.saterskog.b.a.a(notFoundException);
            }
            catch (PackageManager.NameNotFoundException nameNotFoundException) {
                com.saterskog.b.a.a(nameNotFoundException);
            }
        }
        object = (TextView)layoutInflater.findViewById(2131230949);
        object.setText((CharSequence)Html.fromHtml((String)this.getString(2131624071)));
        object.setMovementMethod(LinkMovementMethod.getInstance());
        object = (TextView)layoutInflater.findViewById(2131230950);
        object.setText((CharSequence)Html.fromHtml((String)this.getString(2131624373)));
        object.setMovementMethod(LinkMovementMethod.getInstance());
        object = (TextView)layoutInflater.findViewById(2131230951);
        object.setText((CharSequence)Html.fromHtml((String)this.getString(2131624370)));
        object.setMovementMethod(LinkMovementMethod.getInstance());
        if (!j.b("4", (Context)this.getActivity())) {
            ((Button)layoutInflater.findViewById(2131230745)).setVisibility(8);
        } else {
            this.a((View)layoutInflater, 2131230745);
        }
        this.a((View)layoutInflater, 2131230742);
        this.a((View)layoutInflater, 2131230746);
        return layoutInflater;
    }

    public final void onResume() {
        super.onResume();
        this.a();
    }
}

