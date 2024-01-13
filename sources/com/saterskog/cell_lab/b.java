package com.saterskog.cell_lab;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.SharedPreferences;
import android.text.Html;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.TextView;

public final class b {
    public static void a(Activity activity, String str, String str2, String str3, DialogInterface.OnClickListener onClickListener, DialogInterface.OnClickListener onClickListener2) {
        final Activity activity2 = activity;
        final String str4 = str3;
        final String str5 = str;
        final String str6 = str2;
        final DialogInterface.OnClickListener onClickListener3 = onClickListener;
        final DialogInterface.OnClickListener onClickListener4 = onClickListener2;
        activity.runOnUiThread(new Runnable() {
            public final void run() {
                if (!activity2.isFinishing()) {
                    final SharedPreferences sharedPreferences = activity2.getSharedPreferences(str4, 0);
                    if (!sharedPreferences.getBoolean("dont_show_" + str4, false)) {
                        AlertDialog.Builder builder = new AlertDialog.Builder(activity2);
                        builder.setTitle(str5);
                        View inflate = activity2.getLayoutInflater().inflate(C0028R.layout.dialog_announce, (ViewGroup) null);
                        final CheckBox checkBox = (CheckBox) inflate.findViewById(C0028R.id.dont_show_again);
                        TextView textView = (TextView) inflate.findViewById(C0028R.id.announce_text);
                        if (textView != null) {
                            textView.setText(Html.fromHtml(str6));
                            textView.setMovementMethod(LinkMovementMethod.getInstance());
                        }
                        builder.setView(inflate);
                        builder.setPositiveButton(activity2.getString(C0028R.string.dialog_button_ok), new DialogInterface.OnClickListener() {
                            public final void onClick(DialogInterface dialogInterface, int i) {
                                if (checkBox.isChecked()) {
                                    SharedPreferences.Editor edit = sharedPreferences.edit();
                                    edit.putBoolean("dont_show_" + str4, true);
                                    edit.commit();
                                }
                                if (onClickListener3 != null) {
                                    onClickListener3.onClick(dialogInterface, i);
                                }
                                if (onClickListener4 != null) {
                                    onClickListener4.onClick(dialogInterface, i);
                                }
                            }
                        });
                        AlertDialog show = builder.show();
                        View findViewById = show.findViewById(show.getContext().getResources().getIdentifier("android:id/titleDivider", (String) null, (String) null));
                        if (findViewById != null) {
                            findViewById.setBackgroundColor(activity2.getResources().getColor(C0028R.color.border));
                        }
                    } else if (onClickListener4 != null) {
                        onClickListener4.onClick((DialogInterface) null, 0);
                    }
                }
            }
        });
    }
}
