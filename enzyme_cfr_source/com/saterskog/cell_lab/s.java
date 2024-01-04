/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.Intent
 *  android.content.res.Configuration
 *  android.content.res.Resources
 *  android.os.Bundle
 *  android.preference.Preference
 *  android.preference.Preference$OnPreferenceChangeListener
 *  android.preference.PreferenceFragment
 *  android.preference.PreferenceManager
 *  android.util.DisplayMetrics
 */
package com.saterskog.cell_lab;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.preference.Preference;
import android.preference.PreferenceFragment;
import android.preference.PreferenceManager;
import android.util.DisplayMetrics;
import com.saterskog.cell_lab.j;
import java.util.Locale;

public final class s
extends PreferenceFragment {
    public static void a(Context context) {
        Resources resources = context.getResources();
        DisplayMetrics displayMetrics = resources.getDisplayMetrics();
        Configuration configuration = resources.getConfiguration();
        String[] arrstring = context.getResources().getStringArray(2130837510);
        int n2 = arrstring.length;
        String string = "en";
        for (int i2 = 0; i2 < n2; ++i2) {
            if (!arrstring[i2].equals(configuration.locale.getLanguage())) continue;
            string = configuration.locale.getLanguage();
        }
        configuration.locale = new Locale(PreferenceManager.getDefaultSharedPreferences((Context)context).getString("language", string));
        resources.updateConfiguration(configuration, displayMetrics);
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.addPreferencesFromResource(2131820545);
        this.findPreference("language").setOnPreferenceChangeListener(new Preference.OnPreferenceChangeListener(){

            public final boolean onPreferenceChange(Preference preference, Object object) {
                s.a((Context)s.this.getActivity());
                preference = new Intent((Context)s.this.getActivity(), s.this.getActivity().getClass());
                j.a = null;
                s.this.getActivity().finish();
                s.this.startActivity((Intent)preference);
                return true;
            }
        });
        this.findPreference("music").setOnPreferenceChangeListener(new Preference.OnPreferenceChangeListener(){

            public final boolean onPreferenceChange(Preference preference, Object object) {
                ((a)s.this.getActivity()).a((Boolean)object);
                return true;
            }
        });
        this.findPreference("sound_effects").setOnPreferenceChangeListener(new Preference.OnPreferenceChangeListener(){

            public final boolean onPreferenceChange(Preference preference, Object object) {
                ((a)s.this.getActivity()).b((Boolean)object);
                return true;
            }
        });
    }

    public static interface a {
        public void a(boolean var1);

        public void b(boolean var1);
    }
}

