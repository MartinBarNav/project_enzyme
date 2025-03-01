/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.util.AttributeSet
 *  android.view.View
 *  android.widget.CheckBox
 *  android.widget.LinearLayout
 *  android.widget.TextView
 */
package com.saterskog.cell_lab;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.CheckBox;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.saterskog.b.e;
import com.saterskog.cell_lab.h;
import com.saterskog.cell_lab.j;

public class GenePoolView
extends LinearLayout {
    public CheckBox[] a;
    public int[] b;

    public GenePoolView(Context context, AttributeSet arrh) {
        int n2;
        int n3;
        int n4 = 0;
        super(context, (AttributeSet)arrh);
        arrh = new TextView(context);
        arrh.setText((CharSequence)(this.getContext().getString(2131624198) + ":"));
        arrh.setTypeface(null, 1);
        this.addView((View)arrh);
        boolean[] arrbl = j.i(-1, this.getContext());
        int n5 = arrbl.length;
        int n6 = 0;
        for (n3 = 0; n3 < n5; ++n3) {
            n2 = n6;
            if (arrbl[n3]) {
                n2 = n6 + 1;
            }
            n6 = n2;
        }
        this.a = new CheckBox[n6];
        this.b = new int[n6];
        arrh = h.B;
        n5 = arrh.length;
        n2 = 0;
        for (n3 = n4; n3 < n5; ++n3) {
            h h2 = arrh[n3];
            n6 = n2;
            if (arrbl[h2.ordinal()]) {
                this.b[n2] = h2.ordinal();
                this.a[n2] = new CheckBox(context);
                this.a[n2].setText((CharSequence)e.a(h2.a(this.getContext())));
                this.addView((View)this.a[n2]);
                n6 = n2 + 1;
            }
            n2 = n6;
        }
        this.setOrientation(1);
    }
}

