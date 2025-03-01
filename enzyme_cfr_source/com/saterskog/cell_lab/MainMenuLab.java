/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  android.app.Fragment
 */
package com.saterskog.cell_lab;

import android.app.Fragment;
import com.saterskog.cell_lab.a;
import com.saterskog.cell_lab.f;
import com.saterskog.cell_lab.g;
import com.saterskog.cell_lab.k;
import com.saterskog.cell_lab.l;
import com.saterskog.cell_lab.s;

public class MainMenuLab
extends l
implements s.a {
    /*
     * WARNING - void declaration
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    final Fragment a(int n2) {
        void var2_3;
        switch (n2) {
            default: {
                com.saterskog.b.a.a("skit:navigated past end");
                return var2_3;
            }
            case 0: {
                k k2 = new k();
                return var2_3;
            }
            case 1: {
                f f2 = new f();
                return var2_3;
            }
            case 2: {
                g g2 = new g();
                return var2_3;
            }
            case 4: {
                a a2 = this.h = new a();
                return var2_3;
            }
            case 3: 
        }
        s s2 = new s();
        return var2_3;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    final String b(int n2) {
        switch (n2) {
            default: {
                return null;
            }
            case 0: {
                return this.getString(2131624152);
            }
            case 1: {
                return this.getString(2131624153);
            }
            case 2: {
                return this.getString(2131624154);
            }
            case 4: {
                return this.getString(2131624151);
            }
            case 3: 
        }
        return this.getString(2131624155);
    }
}

