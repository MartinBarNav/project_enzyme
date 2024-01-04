// 
// Decompiled by Procyon v0.5.36
// 

package com.saterskog.cell_lab;

import com.saterskog.b.e;
import android.view.View;
import android.graphics.Typeface;
import android.widget.TextView;
import android.util.AttributeSet;
import android.content.Context;
import android.widget.CheckBox;
import android.widget.LinearLayout;

public class GenePoolView extends LinearLayout
{
    public CheckBox[] a;
    public int[] b;
    
    public GenePoolView(final Context context, final AttributeSet set) {
        final int n = 0;
        super(context, set);
        final TextView textView = new TextView(context);
        textView.setText((CharSequence)(this.getContext().getString(2131624198) + ":"));
        textView.setTypeface((Typeface)null, 1);
        this.addView((View)textView);
        final boolean[] i = j.i(-1, this.getContext());
        final int length = i.length;
        int j = 0;
        int n2 = 0;
        while (j < length) {
            int n3 = n2;
            if (i[j]) {
                n3 = n2 + 1;
            }
            ++j;
            n2 = n3;
        }
        this.a = new CheckBox[n2];
        this.b = new int[n2];
        final h[] b = h.B;
        final int length2 = b.length;
        int n4 = 0;
        int n5;
        for (int k = n; k < length2; ++k, n4 = n5) {
            final h h = b[k];
            n5 = n4;
            if (i[h.ordinal()]) {
                this.b[n4] = h.ordinal();
                (this.a[n4] = new CheckBox(context)).setText((CharSequence)e.a(h.a(this.getContext())));
                this.addView((View)this.a[n4]);
                n5 = n4 + 1;
            }
        }
        this.setOrientation(1);
    }
}
