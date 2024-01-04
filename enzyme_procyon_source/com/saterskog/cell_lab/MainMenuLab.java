// 
// Decompiled by Procyon v0.5.36
// 

package com.saterskog.cell_lab;

import com.saterskog.b.a;
import android.app.Fragment;

public class MainMenuLab extends l implements s.a
{
    @Override
    final Fragment a(final int n) {
        Object h = null;
        switch (n) {
            default: {
                a.a("skit:navigated past end");
                h = null;
                break;
            }
            case 0: {
                h = new k();
                break;
            }
            case 1: {
                h = new com.saterskog.cell_lab.f();
                break;
            }
            case 2: {
                h = new g();
                break;
            }
            case 4: {
                this.h = new a();
                h = this.h;
                break;
            }
            case 3: {
                h = new s();
                break;
            }
        }
        return (Fragment)h;
    }
    
    @Override
    final String b(final int n) {
        String s = null;
        switch (n) {
            default: {
                s = null;
                break;
            }
            case 0: {
                s = this.getString(2131624152);
                break;
            }
            case 1: {
                s = this.getString(2131624153);
                break;
            }
            case 2: {
                s = this.getString(2131624154);
                break;
            }
            case 4: {
                s = this.getString(2131624151);
                break;
            }
            case 3: {
                s = this.getString(2131624155);
                break;
            }
        }
        return s;
    }
}
