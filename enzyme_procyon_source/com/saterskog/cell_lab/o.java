// 
// Decompiled by Procyon v0.5.36
// 

package com.saterskog.cell_lab;

import android.os.Handler;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.os.Bundle;
import android.text.Spanned;
import android.content.DialogInterface;
import android.content.DialogInterface$OnClickListener;
import android.view.ViewGroup;
import android.content.Context;
import android.app.AlertDialog$Builder;
import android.text.Html;
import android.widget.CompoundButton;
import android.app.Activity;
import android.view.View;
import android.widget.CheckBox;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.SeekBar$OnSeekBarChangeListener;
import android.widget.CompoundButton$OnCheckedChangeListener;
import android.view.View$OnClickListener;
import android.app.Fragment;

public final class o extends Fragment implements View$OnClickListener, CompoundButton$OnCheckedChangeListener, SeekBar$OnSeekBarChangeListener
{
    Environment a;
    TextView b;
    private a c;
    private GenePoolView d;
    
    public o() {
        this.c = null;
    }
    
    private String a(final int i, final double d, final double d2) {
        String string;
        if (!this.isAdded()) {
            string = "";
        }
        else {
            string = this.getActivity().getString(2131624195) + String.format("%1$,.1f", d2) + " " + this.getActivity().getString(2131624145) + "." + "\n" + this.getActivity().getString(2131624196) + i + "\n" + this.getActivity().getString(2131624197) + String.format("%1$,.1f", d);
        }
        return string;
    }
    
    private void a(final int n, final double n2) {
        final SeekBar seekBar = (SeekBar)this.getActivity().findViewById(n);
        if (seekBar != null) {
            seekBar.setProgress((int)(1000.0 * n2));
        }
    }
    
    private void a(final int n, final boolean checked) {
        final CheckBox checkBox = (CheckBox)this.getActivity().findViewById(n);
        if (checkBox != null) {
            checkBox.setChecked(checked);
        }
    }
    
    private void a(final View view, final int n) {
        ((CheckBox)view.findViewById(n)).setOnCheckedChangeListener((CompoundButton$OnCheckedChangeListener)this);
    }
    
    private void b() {
        this.c.a(this.a);
    }
    
    private void b(final View view, final int n) {
        ((SeekBar)view.findViewById(n)).setOnSeekBarChangeListener((SeekBar$OnSeekBarChangeListener)this);
    }
    
    public final void a() {
        final int n = 0;
        this.a(2131230870, this.a.c / 0.09);
        this.a(2131230844, this.a.a / 14.999999999999998);
        this.a(2131230851, (this.a.b - 0.021599999999999998) / 1.1303999999999998);
        this.a(2131230847, this.a.p / 100.0);
        this.a(2131230848, (this.a.q - 0.01) / 0.19);
        this.a(2131230845, this.a.o);
        this.a(2131230872, this.a.n);
        this.a(2131230862, this.a.d / 2.0);
        this.a(2131230865, this.a.e / 1.0);
        this.a(2131230863, this.a.f / 1.0);
        this.a(2131230874, this.a.g / 150.0);
        this.a(2131230854, this.a.m / 8.0);
        this.a(2131230856, this.a.l / 8.0);
        this.a(2131230842, (this.a.h + 3.3) / 6.6);
        this.a(2131230860, (this.a.i - 0.0) / 1.0);
        this.a(2131230858, (this.a.j - 0.0) / -2.0);
        this.a(2131230869, this.a.z);
        this.a(2131230751, this.a.w);
        this.a(2131230753, this.a.x);
        this.a(2131230755, this.a.u);
        this.a(2131230752, this.a.v);
        this.a(2131230754, this.a.y);
        if (this.d != null) {
            for (int i = 0; i < this.d.a.length; ++i) {
                this.d.a[i].setChecked(this.a.t[this.d.b[i]]);
            }
        }
        int n2 = -1;
        int n3 = 0;
        int n4;
        for (int j = 0; j < h.B.length; ++j, n3 = n4) {
            n4 = n3;
            if (this.a.t[j]) {
                n4 = n3 + 1;
                n2 = j;
            }
        }
        int k = n;
        if (n3 == 1) {
            for (int l = 0; l < this.d.a.length; ++l) {
                if (this.d.b[l] == n2) {
                    this.d.a[l].setEnabled(false);
                    break;
                }
            }
        }
        else {
            while (k < this.d.a.length) {
                this.d.a[k].setEnabled(true);
                ++k;
            }
        }
    }
    
    public final void onAttach(final Activity activity) {
        super.onAttach(activity);
        try {
            this.c = (a)activity;
        }
        catch (ClassCastException ex) {
            throw new ClassCastException(activity.toString() + " must implement SampleInfoReceiver");
        }
    }
    
    public final void onCheckedChanged(final CompoundButton compoundButton, final boolean y) {
        final int n = 0;
        switch (compoundButton.getId()) {
            default: {
                int i = 0;
                while (i < this.d.a.length) {
                    if (this.d.a[i] == compoundButton) {
                        this.a.t[this.d.b[i]] = y;
                        int n2 = -1;
                        int n3 = 0;
                        int n4;
                        for (int j = 0; j < h.B.length; ++j, n3 = n4) {
                            n4 = n3;
                            if (this.a.t[j]) {
                                n4 = n3 + 1;
                                n2 = j;
                            }
                        }
                        int k = n;
                        if (n3 == 1) {
                            for (int l = 0; l < this.d.a.length; ++l) {
                                if (this.d.b[l] == n2) {
                                    this.d.a[l].setEnabled(false);
                                    break;
                                }
                            }
                            break;
                        }
                        while (k < this.d.a.length) {
                            this.d.a[k].setEnabled(true);
                            ++k;
                        }
                        break;
                    }
                    else {
                        ++i;
                    }
                }
                break;
            }
            case 2131230751: {
                this.a.w = y;
                break;
            }
            case 2131230753: {
                this.a.x = y;
                break;
            }
            case 2131230755: {
                this.a.u = y;
                break;
            }
            case 2131230752: {
                this.a.v = y;
                break;
            }
            case 2131230754: {
                this.a.y = y;
                break;
            }
        }
        this.b();
    }
    
    public final void onClick(final View view) {
        switch (view.getId()) {
            case 2131230825: {
                final String string = this.getString(2131624266);
                final Spanned fromHtml = Html.fromHtml(this.getString(2131624265));
                final AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder((Context)this.getActivity());
                final View inflate = this.getActivity().getLayoutInflater().inflate(2131361829, (ViewGroup)null);
                ((TextView)inflate.findViewById(2131230953)).setText((CharSequence)string);
                ((TextView)inflate.findViewById(2131230933)).setText((CharSequence)fromHtml);
                alertDialog$Builder.setView(inflate);
                alertDialog$Builder.setNeutralButton((CharSequence)this.getActivity().getString(2131624029), (DialogInterface$OnClickListener)new DialogInterface$OnClickListener() {
                    public final void onClick(final DialogInterface dialogInterface, final int n) {
                        dialogInterface.cancel();
                    }
                });
                alertDialog$Builder.show();
                break;
            }
        }
    }
    
    public final void onCreate(final Bundle bundle) {
        super.onCreate(bundle);
        if (bundle == null) {
            (this.a = new Environment()).a(((a)this.getActivity()).c());
        }
        else {
            this.a = (Environment)bundle.getParcelable("mEnv");
        }
    }
    
    public final View onCreateView(final LayoutInflater layoutInflater, final ViewGroup viewGroup, final Bundle bundle) {
        final View inflate = layoutInflater.inflate(2131361827, viewGroup, false);
        ((TextView)inflate.findViewById(2131230943)).setText((CharSequence)this.a(0, 0.0, 0.0));
        this.a(inflate, 2131230751);
        this.a(inflate, 2131230753);
        this.a(inflate, 2131230755);
        this.a(inflate, 2131230752);
        this.a(inflate, 2131230754);
        this.d = (GenePoolView)inflate.findViewById(2131230787);
        this.b = (TextView)inflate.findViewById(2131230943);
        final CheckBox[] a = this.d.a;
        for (int length = a.length, i = 0; i < length; ++i) {
            a[i].setOnCheckedChangeListener((CompoundButton$OnCheckedChangeListener)this);
        }
        this.b(inflate, 2131230844);
        this.b(inflate, 2131230851);
        this.b(inflate, 2131230847);
        this.b(inflate, 2131230848);
        this.b(inflate, 2131230845);
        this.b(inflate, 2131230872);
        this.b(inflate, 2131230874);
        this.b(inflate, 2131230854);
        this.b(inflate, 2131230856);
        this.b(inflate, 2131230870);
        this.b(inflate, 2131230862);
        this.b(inflate, 2131230863);
        this.b(inflate, 2131230865);
        this.b(inflate, 2131230842);
        this.b(inflate, 2131230860);
        this.b(inflate, 2131230858);
        this.b(inflate, 2131230869);
        inflate.findViewById(2131230825).setOnClickListener((View$OnClickListener)this);
        if (!j.a((Context)this.getActivity(), 0)) {
            inflate.findViewById(2131230847).setVisibility(8);
            inflate.findViewById(2131230850).setVisibility(8);
            inflate.findViewById(2131230848).setVisibility(8);
            inflate.findViewById(2131230849).setVisibility(8);
            inflate.findViewById(2131230845).setVisibility(8);
            inflate.findViewById(2131230846).setVisibility(8);
            inflate.findViewById(2131230854).setVisibility(8);
            inflate.findViewById(2131230855).setVisibility(8);
            inflate.findViewById(2131230856).setVisibility(8);
            inflate.findViewById(2131230857).setVisibility(8);
            inflate.findViewById(2131230858).setVisibility(8);
            inflate.findViewById(2131230859).setVisibility(8);
            inflate.findViewById(2131230865).setVisibility(8);
            inflate.findViewById(2131230866).setVisibility(8);
            inflate.findViewById(2131230872).setVisibility(8);
            inflate.findViewById(2131230873).setVisibility(8);
            inflate.findViewById(2131230868).setVisibility(8);
            inflate.findViewById(2131230869).setVisibility(8);
        }
        this.a();
        return inflate;
    }
    
    public final void onProgressChanged(final SeekBar seekBar, final int n, final boolean b) {
        final double n2 = 0.0;
        if (this.c != null) {
            final double n3 = n / 1000.0;
            double n4 = n2;
            Label_0176: {
                switch (seekBar.getId()) {
                    default: {
                        n4 = n2;
                        break Label_0176;
                    }
                    case 2131230869: {
                        this.a.z = n3;
                        n4 = n3;
                        break Label_0176;
                    }
                    case 2131230858: {
                        final Environment a = this.a;
                        n4 = n3 * -2.0 + 0.0;
                        a.j = n4;
                        break Label_0176;
                    }
                    case 2131230860: {
                        final Environment a2 = this.a;
                        n4 = n3 * 1.0 + 0.0;
                        a2.i = n4;
                        break Label_0176;
                    }
                    case 2131230842: {
                        final Environment a3 = this.a;
                        n4 = n3 * 6.6 - 3.3;
                        a3.h = n4;
                        break Label_0176;
                    }
                    case 2131230865: {
                        this.a.e = n3;
                        n4 = n3;
                        break Label_0176;
                    }
                    case 2131230863: {
                        final Environment a4 = this.a;
                        n4 = n3 * 1.0;
                        a4.f = n4;
                        break Label_0176;
                    }
                    case 2131230862: {
                        final Environment a5 = this.a;
                        n4 = n3 * 2.0;
                        a5.d = n4;
                        break Label_0176;
                    }
                    case 2131230856: {
                        final Environment a6 = this.a;
                        n4 = n3 * 8.0;
                        a6.l = n4;
                        break Label_0176;
                    }
                    case 2131230854: {
                        final Environment a7 = this.a;
                        n4 = n3 * 8.0;
                        a7.m = n4;
                        break Label_0176;
                    }
                    case 2131230874: {
                        final Environment a8 = this.a;
                        n4 = n3 * 150.0;
                        a8.g = n4;
                        break Label_0176;
                    }
                    case 2131230870: {
                        final Environment a9 = this.a;
                        n4 = n3 * 0.09;
                        a9.c = n4;
                        break Label_0176;
                    }
                    case 2131230872: {
                        final Environment a10 = this.a;
                        final float n5 = (float)n3;
                        a10.n = n5;
                        n4 = n5;
                        break Label_0176;
                    }
                    case 2131230845: {
                        final Environment a11 = this.a;
                        final float o = (float)n3;
                        a11.o = o;
                        n4 = o;
                        break Label_0176;
                    }
                    case 2131230848: {
                        final Environment a12 = this.a;
                        n4 = n3 * 0.19 + 0.01;
                        a12.q = n4;
                        break Label_0176;
                    }
                    case 2131230847: {
                        final Environment a13 = this.a;
                        n4 = n3 * 100.0;
                        a13.p = n4;
                        break Label_0176;
                    }
                    case 2131230851: {
                        final Environment a14 = this.a;
                        n4 = n3 * 1.1303999999999998 + 0.021599999999999998;
                        a14.b = n4;
                        break Label_0176;
                    }
                    case 2131230844: {
                        final Environment a15 = this.a;
                        n4 = n3 * 14.999999999999998;
                        a15.a = n4;
                    }
                    case 2131230843:
                    case 2131230846:
                    case 2131230849:
                    case 2131230850:
                    case 2131230852:
                    case 2131230853:
                    case 2131230855:
                    case 2131230857:
                    case 2131230859:
                    case 2131230861:
                    case 2131230864:
                    case 2131230866:
                    case 2131230867:
                    case 2131230868:
                    case 2131230871:
                    case 2131230873: {
                        if (b) {
                            ((TextView)this.getActivity().findViewById(2131230945)).setText((CharSequence)(this.getString(2131624240) + ": " + String.format("%1$,.3f", n4)));
                        }
                        this.b();
                        break;
                    }
                }
            }
        }
    }
    
    public final void onSaveInstanceState(final Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putParcelable("mEnv", (Parcelable)this.a);
    }
    
    public final void onStart() {
        super.onStart();
        this.a();
    }
    
    public final void onStartTrackingTouch(final SeekBar seekBar) {
    }
    
    public final void onStopTrackingTouch(final SeekBar seekBar) {
        new Handler().postDelayed((Runnable)new Runnable() {
            @Override
            public final void run() {
                final Activity activity = o.this.getActivity();
                if (activity != null) {
                    final TextView textView = (TextView)activity.findViewById(2131230945);
                    if (textView != null) {
                        textView.setText((CharSequence)"");
                    }
                }
            }
        }, 500L);
    }
    
    public interface a
    {
        void a(final Environment p0);
        
        Environment c();
    }
}
