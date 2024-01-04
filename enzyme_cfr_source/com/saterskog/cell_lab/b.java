/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.app.AlertDialog$Builder
 *  android.content.Context
 *  android.content.DialogInterface
 *  android.content.DialogInterface$OnClickListener
 *  android.content.SharedPreferences
 *  android.content.SharedPreferences$Editor
 *  android.text.Html
 *  android.text.method.LinkMovementMethod
 *  android.view.View
 *  android.widget.CheckBox
 *  android.widget.TextView
 */
package com.saterskog.cell_lab;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.SharedPreferences;
import android.text.Html;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.CheckBox;
import android.widget.TextView;

public final class b {
    public static void a(final Activity activity, final String string, final String string2, final String string3, final DialogInterface.OnClickListener onClickListener, final DialogInterface.OnClickListener onClickListener2) {
        activity.runOnUiThread(new Runnable(){

            /*
             * Enabled aggressive block sorting
             */
            @Override
            public final void run() {
                if (activity.isFinishing()) {
                    return;
                }
                final SharedPreferences sharedPreferences = activity.getSharedPreferences(string3, 0);
                if (sharedPreferences.getBoolean("dont_show_" + string3, false)) {
                    if (onClickListener2 == null) return;
                    onClickListener2.onClick(null, 0);
                    return;
                }
                AlertDialog.Builder builder = new AlertDialog.Builder((Context)activity);
                builder.setTitle((CharSequence)string);
                View view = activity.getLayoutInflater().inflate(2131361822, null);
                final CheckBox checkBox = (CheckBox)view.findViewById(2131230772);
                TextView textView = (TextView)view.findViewById(2131230739);
                if (textView != null) {
                    textView.setText((CharSequence)Html.fromHtml((String)string2));
                    textView.setMovementMethod(LinkMovementMethod.getInstance());
                }
                builder.setView(view);
                builder.setPositiveButton((CharSequence)activity.getString(2131624029), new DialogInterface.OnClickListener(){

                    public final void onClick(DialogInterface dialogInterface, int n2) {
                        if (checkBox.isChecked()) {
                            SharedPreferences.Editor editor = sharedPreferences.edit();
                            editor.putBoolean("dont_show_" + string3, true);
                            editor.commit();
                        }
                        if (onClickListener != null) {
                            onClickListener.onClick(dialogInterface, n2);
                        }
                        if (onClickListener2 != null) {
                            onClickListener2.onClick(dialogInterface, n2);
                        }
                    }
                });
                sharedPreferences = builder.show();
                if ((sharedPreferences = sharedPreferences.findViewById(sharedPreferences.getContext().getResources().getIdentifier("android:id/titleDivider", null, null))) == null) return;
                sharedPreferences.setBackgroundColor(activity.getResources().getColor(2131034132));
            }
        });
    }
}

