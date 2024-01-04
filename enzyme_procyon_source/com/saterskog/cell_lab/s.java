// 
// Decompiled by Procyon v0.5.36
// 

package com.saterskog.cell_lab;

import android.content.Intent;
import android.preference.Preference;
import android.preference.Preference$OnPreferenceChangeListener;
import android.os.Bundle;
import android.content.res.Configuration;
import android.util.DisplayMetrics;
import android.content.res.Resources;
import java.util.Locale;
import android.preference.PreferenceManager;
import android.content.Context;
import android.preference.PreferenceFragment;

public final class s extends PreferenceFragment
{
    public static void a(final Context context) {
        final Resources resources = context.getResources();
        final DisplayMetrics displayMetrics = resources.getDisplayMetrics();
        final Configuration configuration = resources.getConfiguration();
        final String[] stringArray = context.getResources().getStringArray(2130837510);
        final int length = stringArray.length;
        String language = "en";
        for (int i = 0; i < length; ++i) {
            if (stringArray[i].equals(configuration.locale.getLanguage())) {
                language = configuration.locale.getLanguage();
            }
        }
        configuration.locale = new Locale(PreferenceManager.getDefaultSharedPreferences(context).getString("language", language));
        resources.updateConfiguration(configuration, displayMetrics);
    }
    
    public final void onCreate(final Bundle bundle) {
        super.onCreate(bundle);
        this.addPreferencesFromResource(2131820545);
        this.findPreference((CharSequence)"language").setOnPreferenceChangeListener((Preference$OnPreferenceChangeListener)new Preference$OnPreferenceChangeListener() {
            public final boolean onPreferenceChange(final Preference preference, final Object o) {
                s.a((Context)s.this.getActivity());
                final Intent intent = new Intent((Context)s.this.getActivity(), (Class)s.this.getActivity().getClass());
                j.a = null;
                s.this.getActivity().finish();
                s.this.startActivity(intent);
                return true;
            }
        });
        this.findPreference((CharSequence)"music").setOnPreferenceChangeListener((Preference$OnPreferenceChangeListener)new Preference$OnPreferenceChangeListener() {
            public final boolean onPreferenceChange(final Preference preference, final Object o) {
                ((a)s.this.getActivity()).a((boolean)o);
                return true;
            }
        });
        this.findPreference((CharSequence)"sound_effects").setOnPreferenceChangeListener((Preference$OnPreferenceChangeListener)new Preference$OnPreferenceChangeListener() {
            public final boolean onPreferenceChange(final Preference preference, final Object o) {
                ((a)s.this.getActivity()).b((boolean)o);
                return true;
            }
        });
    }
    
    public interface a
    {
        void a(final boolean p0);
        
        void b(final boolean p0);
    }
}
