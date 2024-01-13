package com.saterskog.cell_lab;

import android.app.Fragment;
import com.saterskog.b.a;
import com.saterskog.cell_lab.s;

public class MainMenuLab extends l implements s.a {
    /* access modifiers changed from: package-private */
    public final Fragment a(int i) {
        switch (i) {
            case 0:
                return new k();
            case 1:
                return new f();
            case 2:
                return new g();
            case 3:
                return new s();
            case 4:
                this.h = new a();
                return this.h;
            default:
                a.a("skit:navigated past end");
                return null;
        }
    }

    /* access modifiers changed from: package-private */
    public final String b(int i) {
        switch (i) {
            case 0:
                return getString(C0028R.string.main_menu_tab_challenges);
            case 1:
                return getString(C0028R.string.main_menu_tab_experiments);
            case 2:
                return getString(C0028R.string.main_menu_tab_genomes);
            case 3:
                return getString(C0028R.string.main_menu_tab_settings);
            case 4:
                return getString(C0028R.string.main_menu_tab_about);
            default:
                return null;
        }
    }
}
