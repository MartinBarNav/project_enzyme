package com.saterskog.cell_lab;

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
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DateFormat;
import java.util.Date;

public final class a extends Fragment implements View.OnClickListener {
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(C0028R.layout.fragment_about, viewGroup, false);
        TextView textView = (TextView) inflate.findViewById(C0028R.id.text_about_name);
        if (textView != null) {
            try {
                textView.setText(getActivity().getString(C0028R.string.about_version_text) + " " + getActivity().getPackageManager().getPackageInfo(getActivity().getPackageName(), 0).versionName);
            } catch (Resources.NotFoundException e) {
                com.saterskog.b.a.a((Throwable) e);
            } catch (PackageManager.NameNotFoundException e2) {
                com.saterskog.b.a.a((Throwable) e2);
            }
        }
        TextView textView2 = (TextView) inflate.findViewById(C0028R.id.text_stuck_left);
        textView2.setText(Html.fromHtml(getString(C0028R.string.forum_link)));
        textView2.setMovementMethod(LinkMovementMethod.getInstance());
        TextView textView3 = (TextView) inflate.findViewById(C0028R.id.text_stuck_middle);
        textView3.setText(Html.fromHtml(getString(C0028R.string.wiki_link)));
        textView3.setMovementMethod(LinkMovementMethod.getInstance());
        TextView textView4 = (TextView) inflate.findViewById(C0028R.id.text_stuck_right);
        textView4.setText(Html.fromHtml(getString(C0028R.string.video_link)));
        textView4.setMovementMethod(LinkMovementMethod.getInstance());
        if (!j.b("4", (Context) getActivity())) {
            ((Button) inflate.findViewById(C0028R.id.button_rate)).setVisibility(8);
        } else {
            a(inflate, C0028R.id.button_rate);
        }
        a(inflate, C0028R.id.button_acknowledgements);
        a(inflate, C0028R.id.button_refresh_donation);
        return inflate;
    }

    public final void onResume() {
        super.onResume();
        a();
    }

    public final void a() {
        if (getActivity() != null) {
            new Thread(new Runnable() {
                final /* synthetic */ int a = 0;

                public final void run() {
                    try {
                        com.saterskog.b.a.b("af.updateDonation(0): sleep...");
                        Thread.sleep((long) this.a);
                        com.saterskog.b.a.b("done!");
                        a.this.getActivity().runOnUiThread(new Runnable() {
                            public final void run() {
                                String str;
                                boolean z;
                                final l lVar = (l) a.this.getActivity();
                                if (lVar != null && lVar.k != null && a.this.getView() != null) {
                                    LinearLayout linearLayout = (LinearLayout) a.this.getView().findViewById(C0028R.id.layout_donate);
                                    linearLayout.removeAllViews();
                                    for (final int i = 0; i < lVar.k.length; i++) {
                                        Button button = new Button(a.this.getActivity());
                                        button.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
                                        button.setText(lVar.k[i]);
                                        if (!lVar.j[i]) {
                                            z = true;
                                        } else {
                                            z = false;
                                        }
                                        button.setEnabled(z);
                                        button.setOnClickListener(new View.OnClickListener() {
                                            public final void onClick(View view) {
                                                l lVar = lVar;
                                                int i = i;
                                                String str = "Unknown amount";
                                                try {
                                                    if (lVar.k != null) {
                                                        str = lVar.k[i];
                                                    }
                                                    String str2 = DateFormat.getDateTimeInstance().format(new Date()) + ": " + str;
                                                    b bVar = lVar.b;
                                                    String str3 = lVar.i[i];
                                                    int i2 = i + 1;
                                                    bVar.b();
                                                    bVar.a("launchPurchaseFlow");
                                                    bVar.b("launchPurchaseFlow");
                                                    if (!"inapp".equals("subs") || bVar.f) {
                                                        try {
                                                            bVar.c("Constructing buy intent for " + str3 + ", item type: " + "inapp");
                                                            Bundle a2 = bVar.k.a(3, bVar.j.getPackageName(), str3, "inapp", str2);
                                                            int a3 = bVar.a(a2);
                                                            if (a3 != 0) {
                                                                bVar.d("Unable to buy item, Error response: " + b.a(a3));
                                                                bVar.c();
                                                                c cVar = new c(a3, "Unable to buy item");
                                                                if (lVar != null) {
                                                                    lVar.a(cVar, (e) null);
                                                                    return;
                                                                }
                                                                return;
                                                            }
                                                            bVar.c("Launching buy intent for " + str3 + ". Request code: " + i2);
                                                            bVar.m = i2;
                                                            bVar.p = lVar;
                                                            bVar.n = "inapp";
                                                            IntentSender intentSender = ((PendingIntent) a2.getParcelable("BUY_INTENT")).getIntentSender();
                                                            Intent intent = new Intent();
                                                            Integer num = 0;
                                                            int intValue = num.intValue();
                                                            Integer num2 = 0;
                                                            int intValue2 = num2.intValue();
                                                            Integer num3 = 0;
                                                            lVar.startIntentSenderForResult(intentSender, i2, intent, intValue, intValue2, num3.intValue());
                                                        } catch (IntentSender.SendIntentException e) {
                                                            bVar.d("SendIntentException while launching purchase flow for sku " + str3);
                                                            e.printStackTrace();
                                                            bVar.c();
                                                            c cVar2 = new c(-1004, "Failed to send intent.");
                                                            if (lVar != null) {
                                                                lVar.a(cVar2, (e) null);
                                                            }
                                                        } catch (RemoteException e2) {
                                                            bVar.d("RemoteException while launching purchase flow for sku " + str3);
                                                            e2.printStackTrace();
                                                            bVar.c();
                                                            c cVar3 = new c(-1001, "Remote exception while starting purchase flow");
                                                            if (lVar != null) {
                                                                lVar.a(cVar3, (e) null);
                                                            }
                                                        }
                                                    } else {
                                                        c cVar4 = new c(-1009, "Subscriptions are not available.");
                                                        bVar.c();
                                                        if (lVar != null) {
                                                            lVar.a(cVar4, (e) null);
                                                        }
                                                    }
                                                } catch (b.a e3) {
                                                    com.saterskog.b.a.a("buy failed", (Throwable) e3);
                                                }
                                            }
                                        });
                                        int i2 = (int) ((a.this.getResources().getDisplayMetrics().density * 8.0f) + 0.5f);
                                        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
                                        layoutParams.setMargins(i2, i2, i2, i2);
                                        button.setLayoutParams(layoutParams);
                                        button.setPadding(i2, i2, i2, i2);
                                        button.setTextSize(2, 14.0f);
                                        linearLayout.addView(button);
                                    }
                                    String str2 = "";
                                    try {
                                        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(a.this.getActivity().openFileInput("consumptions")));
                                        StringBuilder sb = new StringBuilder();
                                        while (true) {
                                            String readLine = bufferedReader.readLine();
                                            if (readLine == null) {
                                                break;
                                            }
                                            sb.append(readLine).append("\n");
                                        }
                                        bufferedReader.close();
                                        str2 = str2 + sb.toString();
                                    } catch (FileNotFoundException e) {
                                    } catch (IOException e2) {
                                        com.saterskog.b.a.a("updateDonation", (Throwable) e2);
                                    }
                                    if (str2.length() > 0 && str2.substring(0, 1).equals("\n")) {
                                        str2 = str2.substring(1);
                                    }
                                    if (str2.length() <= 0 || !str2.substring(str2.length() - 1).equals("\n")) {
                                        str = str2;
                                    } else {
                                        str = str2.substring(0, str2.length() - 1);
                                    }
                                    ((TextView) a.this.getView().findViewById(C0028R.id.text_bought)).setText(a.this.getString(C0028R.string.donations_made) + str);
                                }
                            }
                        });
                    } catch (InterruptedException e) {
                        com.saterskog.b.a.a((Throwable) e);
                    }
                }
            }).start();
        }
    }

    private void a(View view, int i) {
        ((Button) view.findViewById(i)).setOnClickListener(this);
    }

    public final void onClick(View view) {
        switch (view.getId()) {
            case C0028R.id.button_acknowledgements /*2131230742*/:
                AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
                View inflate = getActivity().getLayoutInflater().inflate(C0028R.layout.about_dialog, (ViewGroup) null);
                ((TextView) inflate.findViewById(C0028R.id.text_title)).setText(getString(C0028R.string.about_acknowledgements));
                ((TextView) inflate.findViewById(C0028R.id.text_help)).setText(C0028R.string.acknowledgement);
                ((TextView) inflate.findViewById(C0028R.id.text_help)).setMovementMethod(LinkMovementMethod.getInstance());
                builder.setView(inflate);
                builder.setNeutralButton(getString(C0028R.string.dialog_button_ok), new DialogInterface.OnClickListener() {
                    public final void onClick(DialogInterface dialogInterface, int i) {
                        dialogInterface.cancel();
                    }
                });
                builder.show();
                return;
            case C0028R.id.button_rate /*2131230745*/:
                long b = com.saterskog.b.a.b((Context) getActivity());
                com.saterskog.b.a.a("button", "rate", com.saterskog.b.a.a(b), b, getActivity());
                Intent intent = new Intent("android.intent.action.VIEW");
                intent.setData(Uri.parse("market://details?id=com.saterskog.cell_lab"));
                startActivity(intent);
                return;
            case C0028R.id.button_refresh_donation /*2131230746*/:
                a();
                ((l) getActivity()).a();
                return;
            default:
                return;
        }
    }
}
