// 
// Decompiled by Procyon v0.5.36
// 

package com.saterskog.cell_lab;

import android.app.Dialog;
import android.app.AlertDialog;
import android.view.View;
import android.content.SharedPreferences$Editor;
import android.content.DialogInterface;
import android.content.SharedPreferences;
import android.text.method.LinkMovementMethod;
import android.text.Html;
import android.widget.TextView;
import android.widget.CheckBox;
import android.view.ViewGroup;
import android.content.Context;
import android.app.AlertDialog$Builder;
import android.content.DialogInterface$OnClickListener;
import android.app.Activity;

public final class b
{
    public static void a(final Activity activity, final String s, final String s2, final String s3, final DialogInterface$OnClickListener dialogInterface$OnClickListener, final DialogInterface$OnClickListener dialogInterface$OnClickListener2) {
        activity.runOnUiThread((Runnable)new Runnable() {
            @Override
            public final void run() {
                if (!activity.isFinishing()) {
                    final SharedPreferences sharedPreferences = activity.getSharedPreferences(s3, 0);
                    if (!sharedPreferences.getBoolean("dont_show_" + s3, false)) {
                        final AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder((Context)activity);
                        alertDialog$Builder.setTitle((CharSequence)s);
                        final View inflate = activity.getLayoutInflater().inflate(2131361822, (ViewGroup)null);
                        final CheckBox checkBox = (CheckBox)inflate.findViewById(2131230772);
                        final TextView textView = (TextView)inflate.findViewById(2131230739);
                        if (textView != null) {
                            textView.setText((CharSequence)Html.fromHtml(s2));
                            textView.setMovementMethod(LinkMovementMethod.getInstance());
                        }
                        alertDialog$Builder.setView(inflate);
                        alertDialog$Builder.setPositiveButton((CharSequence)activity.getString(2131624029), (DialogInterface$OnClickListener)new DialogInterface$OnClickListener() {
                            public final void onClick(final DialogInterface dialogInterface, final int n) {
                                if (checkBox.isChecked()) {
                                    final SharedPreferences$Editor edit = sharedPreferences.edit();
                                    edit.putBoolean("dont_show_" + s3, true);
                                    edit.commit();
                                }
                                if (dialogInterface$OnClickListener != null) {
                                    dialogInterface$OnClickListener.onClick(dialogInterface, n);
                                }
                                if (dialogInterface$OnClickListener2 != null) {
                                    dialogInterface$OnClickListener2.onClick(dialogInterface, n);
                                }
                            }
                        });
                        final AlertDialog show = alertDialog$Builder.show();
                        final View viewById = ((Dialog)show).findViewById(((Dialog)show).getContext().getResources().getIdentifier("android:id/titleDivider", (String)null, (String)null));
                        if (viewById != null) {
                            viewById.setBackgroundColor(activity.getResources().getColor(2131034132));
                        }
                    }
                    else if (dialogInterface$OnClickListener2 != null) {
                        dialogInterface$OnClickListener2.onClick((DialogInterface)null, 0);
                    }
                }
            }
        });
    }
}
