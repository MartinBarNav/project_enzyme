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
import java.util.Locale;

public final class s extends PreferenceFragment {

    public interface a {
        void a(boolean z);

        void b(boolean z);
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        addPreferencesFromResource(C0028R.xml.preferences);
        findPreference("language").setOnPreferenceChangeListener(new Preference.OnPreferenceChangeListener() {
            public final boolean onPreferenceChange(Preference preference, Object obj) {
                s.a(s.this.getActivity());
                Intent intent = new Intent(s.this.getActivity(), s.this.getActivity().getClass());
                j.a = null;
                s.this.getActivity().finish();
                s.this.startActivity(intent);
                return true;
            }
        });
        findPreference("music").setOnPreferenceChangeListener(new Preference.OnPreferenceChangeListener() {
            public final boolean onPreferenceChange(Preference preference, Object obj) {
                ((a) s.this.getActivity()).a(((Boolean) obj).booleanValue());
                return true;
            }
        });
        findPreference("sound_effects").setOnPreferenceChangeListener(new Preference.OnPreferenceChangeListener() {
            public final boolean onPreferenceChange(Preference preference, Object obj) {
                ((a) s.this.getActivity()).b(((Boolean) obj).booleanValue());
                return true;
            }
        });
    }

    public static void a(Context context) {
        Resources resources = context.getResources();
        DisplayMetrics displayMetrics = resources.getDisplayMetrics();
        Configuration configuration = resources.getConfiguration();
        String str = "en";
        for (String equals : context.getResources().getStringArray(C0028R.array.language_ids)) {
            if (equals.equals(configuration.locale.getLanguage())) {
                str = configuration.locale.getLanguage();
            }
        }
        configuration.locale = new Locale(PreferenceManager.getDefaultSharedPreferences(context).getString("language", str));
        resources.updateConfiguration(configuration, displayMetrics);
    }
}
