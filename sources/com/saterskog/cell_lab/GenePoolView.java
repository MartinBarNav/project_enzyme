package com.saterskog.cell_lab;

import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.widget.CheckBox;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.saterskog.b.e;

public class GenePoolView extends LinearLayout {
    public CheckBox[] a;
    public int[] b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public GenePoolView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TextView textView = new TextView(context);
        textView.setText(getContext().getString(C0028R.string.sample_info_gene_pool) + ":");
        textView.setTypeface((Typeface) null, 1);
        addView(textView);
        boolean[] i = j.i(-1, getContext());
        int i2 = 0;
        for (boolean z : i) {
            if (z) {
                i2++;
            }
        }
        this.a = new CheckBox[i2];
        this.b = new int[i2];
        int i3 = 0;
        for (h hVar : h.B) {
            if (i[hVar.ordinal()]) {
                this.b[i3] = hVar.ordinal();
                this.a[i3] = new CheckBox(context);
                this.a[i3].setText(e.a(hVar.a(getContext())));
                addView(this.a[i3]);
                i3++;
            }
        }
        setOrientation(1);
    }
}
