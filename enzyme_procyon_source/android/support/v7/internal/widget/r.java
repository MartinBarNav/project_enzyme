// 
// Decompiled by Procyon v0.5.36
// 

package android.support.v7.internal.widget;

import android.content.Context;
import android.view.ViewGroup$LayoutParams;
import android.view.View$OnClickListener;
import android.view.ViewGroup;
import android.view.LayoutInflater;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.support.v7.internal.a.a;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.support.v7.widget.Toolbar;

public final class r implements h
{
    Toolbar a;
    CharSequence b;
    private int c;
    private View d;
    private Drawable e;
    private Drawable f;
    private Drawable g;
    private boolean h;
    private CharSequence i;
    private CharSequence j;
    private a k;
    private int l;
    private final o m;
    private int n;
    private Drawable o;
    
    public r(final Toolbar toolbar) {
        this(toolbar, android.support.v7.b.a.h.abc_action_bar_up_description, android.support.v7.b.a.d.abc_ic_ab_back_mtrl_am_alpha);
    }
    
    private r(final Toolbar a, int n, final int n2) {
        this.l = 0;
        this.n = 0;
        this.a = a;
        this.b = a.getTitle();
        this.i = a.getSubtitle();
        this.h = (this.b != null);
        final q a2 = q.a(a.getContext(), null, android.support.v7.b.a.i.ActionBar, android.support.v7.b.a.a.actionBarStyle);
        final CharSequence b = a2.b(android.support.v7.b.a.i.ActionBar_title);
        if (!TextUtils.isEmpty(b)) {
            this.h = true;
            this.b(b);
        }
        final CharSequence b2 = a2.b(android.support.v7.b.a.i.ActionBar_subtitle);
        if (!TextUtils.isEmpty(b2)) {
            this.i = b2;
            if ((this.c & 0x8) != 0x0) {
                this.a.setSubtitle(b2);
            }
        }
        final Drawable a3 = a2.a(android.support.v7.b.a.i.ActionBar_logo);
        if (a3 != null) {
            this.b(a3);
        }
        final Drawable a4 = a2.a(android.support.v7.b.a.i.ActionBar_icon);
        if (a4 != null) {
            this.a(a4);
        }
        final Drawable a5 = a2.a(android.support.v7.b.a.i.ActionBar_homeAsUpIndicator);
        if (a5 != null) {
            this.g = a5;
            this.d();
        }
        this.c(a2.a(android.support.v7.b.a.i.ActionBar_displayOptions, 0));
        final int e = a2.e(android.support.v7.b.a.i.ActionBar_customNavigationLayout, 0);
        if (e != 0) {
            final View inflate = LayoutInflater.from(this.a.getContext()).inflate(e, (ViewGroup)this.a, false);
            if (this.d != null && (this.c & 0x10) != 0x0) {
                this.a.removeView(this.d);
            }
            if ((this.d = inflate) != null && (this.c & 0x10) != 0x0) {
                this.a.addView(this.d);
            }
            this.c(this.c | 0x10);
        }
        final int d = a2.d(android.support.v7.b.a.i.ActionBar_height, 0);
        if (d > 0) {
            final ViewGroup$LayoutParams layoutParams = this.a.getLayoutParams();
            layoutParams.height = d;
            this.a.setLayoutParams(layoutParams);
        }
        final int b3 = a2.b(android.support.v7.b.a.i.ActionBar_contentInsetStart, -1);
        final int b4 = a2.b(android.support.v7.b.a.i.ActionBar_contentInsetEnd, -1);
        if (b3 >= 0 || b4 >= 0) {
            this.a.g.a(Math.max(b3, 0), Math.max(b4, 0));
        }
        final int e2 = a2.e(android.support.v7.b.a.i.ActionBar_titleTextStyle, 0);
        if (e2 != 0) {
            final Toolbar a6 = this.a;
            final Context context = this.a.getContext();
            a6.e = e2;
            if (a6.b != null) {
                a6.b.setTextAppearance(context, e2);
            }
        }
        final int e3 = a2.e(android.support.v7.b.a.i.ActionBar_subtitleTextStyle, 0);
        if (e3 != 0) {
            final Toolbar a7 = this.a;
            final Context context2 = this.a.getContext();
            a7.f = e3;
            if (a7.c != null) {
                a7.c.setTextAppearance(context2, e3);
            }
        }
        final int e4 = a2.e(android.support.v7.b.a.i.ActionBar_popupTheme, 0);
        if (e4 != 0) {
            this.a.setPopupTheme(e4);
        }
        a2.a.recycle();
        this.m = a2.a();
        if (n != this.n) {
            this.n = n;
            if (TextUtils.isEmpty(this.a.getNavigationContentDescription())) {
                n = this.n;
                CharSequence string;
                if (n == 0) {
                    string = null;
                }
                else {
                    string = this.a.getContext().getString(n);
                }
                this.j = string;
                this.c();
            }
        }
        this.j = this.a.getNavigationContentDescription();
        final Drawable a8 = this.m.a(n2);
        if (this.o != a8) {
            this.o = a8;
            this.d();
        }
        this.a.setNavigationOnClickListener((View$OnClickListener)new View$OnClickListener() {
            final android.support.v7.internal.view.menu.a a = new android.support.v7.internal.view.menu.a(r.this.a.getContext(), r.this.b);
            
            public final void onClick(final View view) {
            }
        });
    }
    
    private void b() {
        Drawable logo = null;
        if ((this.c & 0x2) != 0x0) {
            if ((this.c & 0x1) != 0x0) {
                if (this.f != null) {
                    logo = this.f;
                }
                else {
                    logo = this.e;
                }
            }
            else {
                logo = this.e;
            }
        }
        this.a.setLogo(logo);
    }
    
    private void b(final Drawable f) {
        this.f = f;
        this.b();
    }
    
    private void b(final CharSequence charSequence) {
        this.b = charSequence;
        if ((this.c & 0x8) != 0x0) {
            this.a.setTitle(charSequence);
        }
    }
    
    private void c() {
        if ((this.c & 0x4) != 0x0) {
            if (TextUtils.isEmpty(this.j)) {
                this.a.setNavigationContentDescription(this.n);
            }
            else {
                this.a.setNavigationContentDescription(this.j);
            }
        }
    }
    
    private void c(final int c) {
        final int n = this.c ^ c;
        this.c = c;
        if (n != 0) {
            if ((n & 0x4) != 0x0) {
                if ((c & 0x4) != 0x0) {
                    this.d();
                    this.c();
                }
                else {
                    this.a.setNavigationIcon(null);
                }
            }
            if ((n & 0x3) != 0x0) {
                this.b();
            }
            if ((n & 0x8) != 0x0) {
                if ((c & 0x8) != 0x0) {
                    this.a.setTitle(this.b);
                    this.a.setSubtitle(this.i);
                }
                else {
                    this.a.setTitle(null);
                    this.a.setSubtitle(null);
                }
            }
            if ((n & 0x10) != 0x0 && this.d != null) {
                if ((c & 0x10) != 0x0) {
                    this.a.addView(this.d);
                }
                else {
                    this.a.removeView(this.d);
                }
            }
        }
    }
    
    private void d() {
        if ((this.c & 0x4) != 0x0) {
            final Toolbar a = this.a;
            Drawable navigationIcon;
            if (this.g != null) {
                navigationIcon = this.g;
            }
            else {
                navigationIcon = this.o;
            }
            a.setNavigationIcon(navigationIcon);
        }
    }
    
    @Override
    public final CharSequence a() {
        return this.a.getTitle();
    }
    
    @Override
    public final void a(final int n) {
        Drawable a;
        if (n != 0) {
            a = this.m.a(n);
        }
        else {
            a = null;
        }
        this.a(a);
    }
    
    @Override
    public final void a(final Drawable e) {
        this.e = e;
        this.b();
    }
    
    @Override
    public final void a(final a k) {
        this.k = k;
    }
    
    @Override
    public final void a(final CharSequence charSequence) {
        if (!this.h) {
            this.b(charSequence);
        }
    }
    
    @Override
    public final void b(final int n) {
        Drawable a;
        if (n != 0) {
            a = this.m.a(n);
        }
        else {
            a = null;
        }
        this.b(a);
    }
}
