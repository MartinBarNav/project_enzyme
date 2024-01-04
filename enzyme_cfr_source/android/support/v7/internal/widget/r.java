/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.graphics.drawable.Drawable
 *  android.text.TextUtils
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.view.ViewGroup
 *  android.view.ViewGroup$LayoutParams
 */
package android.support.v7.internal.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.support.v7.b.a;
import android.support.v7.internal.view.menu.a;
import android.support.v7.internal.widget.h;
import android.support.v7.internal.widget.o;
import android.support.v7.internal.widget.q;
import android.support.v7.widget.Toolbar;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public final class r
implements h {
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
    private android.support.v7.internal.a.a k;
    private int l = 0;
    private final o m;
    private int n = 0;
    private Drawable o;

    public r(Toolbar toolbar) {
        this(toolbar, a.h.abc_action_bar_up_description, a.d.abc_ic_ab_back_mtrl_am_alpha);
    }

    /*
     * Enabled aggressive block sorting
     */
    private r(Toolbar object, int n2, int n3) {
        Context context;
        Drawable drawable;
        Drawable drawable2;
        Drawable drawable3;
        CharSequence charSequence;
        this.a = object;
        this.b = ((Toolbar)((Object)object)).getTitle();
        this.i = ((Toolbar)((Object)object)).getSubtitle();
        boolean bl = this.b != null;
        this.h = bl;
        CharSequence charSequence2 = ((q)(object = q.a(object.getContext(), null, a.i.ActionBar, a.a.actionBarStyle))).b(a.i.ActionBar_title);
        if (!TextUtils.isEmpty((CharSequence)charSequence2)) {
            this.h = true;
            this.b(charSequence2);
        }
        if (!TextUtils.isEmpty((CharSequence)(charSequence = ((q)object).b(a.i.ActionBar_subtitle)))) {
            this.i = charSequence;
            if ((this.c & 8) != 0) {
                this.a.setSubtitle(charSequence);
            }
        }
        if ((drawable3 = ((q)object).a(a.i.ActionBar_logo)) != null) {
            this.b(drawable3);
        }
        if ((drawable2 = ((q)object).a(a.i.ActionBar_icon)) != null) {
            this.a(drawable2);
        }
        if ((drawable = ((q)object).a(a.i.ActionBar_homeAsUpIndicator)) != null) {
            this.g = drawable;
            this.d();
        }
        this.c(((q)object).a(a.i.ActionBar_displayOptions, 0));
        int n4 = ((q)object).e(a.i.ActionBar_customNavigationLayout, 0);
        if (n4 != 0) {
            View view = LayoutInflater.from((Context)this.a.getContext()).inflate(n4, (ViewGroup)this.a, false);
            if (this.d != null && (this.c & 0x10) != 0) {
                this.a.removeView(this.d);
            }
            this.d = view;
            if (view != null && (this.c & 0x10) != 0) {
                this.a.addView(this.d);
            }
            this.c(this.c | 0x10);
        }
        if ((n4 = ((q)object).d(a.i.ActionBar_height, 0)) > 0) {
            ViewGroup.LayoutParams layoutParams = this.a.getLayoutParams();
            layoutParams.height = n4;
            this.a.setLayoutParams(layoutParams);
        }
        int n5 = ((q)object).b(a.i.ActionBar_contentInsetStart, -1);
        n4 = ((q)object).b(a.i.ActionBar_contentInsetEnd, -1);
        if (n5 >= 0 || n4 >= 0) {
            Toolbar toolbar = this.a;
            n5 = Math.max(n5, 0);
            n4 = Math.max(n4, 0);
            toolbar.g.a(n5, n4);
        }
        if ((n4 = ((q)object).e(a.i.ActionBar_titleTextStyle, 0)) != 0) {
            Toolbar toolbar = this.a;
            context = this.a.getContext();
            toolbar.e = n4;
            if (toolbar.b != null) {
                toolbar.b.setTextAppearance(context, n4);
            }
        }
        if ((n4 = ((q)object).e(a.i.ActionBar_subtitleTextStyle, 0)) != 0) {
            Toolbar toolbar = this.a;
            context = this.a.getContext();
            toolbar.f = n4;
            if (toolbar.c != null) {
                toolbar.c.setTextAppearance(context, n4);
            }
        }
        if ((n4 = ((q)object).e(a.i.ActionBar_popupTheme, 0)) != 0) {
            this.a.setPopupTheme(n4);
        }
        ((q)object).a.recycle();
        this.m = ((q)object).a();
        if (n2 != this.n) {
            this.n = n2;
            if (TextUtils.isEmpty((CharSequence)this.a.getNavigationContentDescription())) {
                n2 = this.n;
                object = n2 == 0 ? null : this.a.getContext().getString(n2);
                this.j = object;
                this.c();
            }
        }
        this.j = this.a.getNavigationContentDescription();
        object = this.m.a(n3);
        if (this.o != object) {
            this.o = object;
            this.d();
        }
        this.a.setNavigationOnClickListener(new View.OnClickListener(){
            final a a;
            {
                this.a = new a(r.this.a.getContext(), r.this.b);
            }

            public final void onClick(View view) {
            }
        });
    }

    /*
     * Enabled aggressive block sorting
     */
    private void b() {
        Drawable drawable = null;
        if ((this.c & 2) != 0) {
            drawable = (this.c & 1) != 0 ? (this.f != null ? this.f : this.e) : this.e;
        }
        this.a.setLogo(drawable);
    }

    private void b(Drawable drawable) {
        this.f = drawable;
        this.b();
    }

    private void b(CharSequence charSequence) {
        this.b = charSequence;
        if ((this.c & 8) != 0) {
            this.a.setTitle(charSequence);
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private void c() {
        block4: {
            block3: {
                if ((this.c & 4) == 0) break block3;
                if (!TextUtils.isEmpty((CharSequence)this.j)) break block4;
                this.a.setNavigationContentDescription(this.n);
            }
            return;
        }
        this.a.setNavigationContentDescription(this.j);
    }

    /*
     * Enabled aggressive block sorting
     */
    private void c(int n2) {
        int n3 = this.c ^ n2;
        this.c = n2;
        if (n3 == 0) return;
        if ((n3 & 4) != 0) {
            if ((n2 & 4) != 0) {
                this.d();
                this.c();
            } else {
                this.a.setNavigationIcon(null);
            }
        }
        if ((n3 & 3) != 0) {
            this.b();
        }
        if ((n3 & 8) != 0) {
            if ((n2 & 8) != 0) {
                this.a.setTitle(this.b);
                this.a.setSubtitle(this.i);
            } else {
                this.a.setTitle(null);
                this.a.setSubtitle(null);
            }
        }
        if ((n3 & 0x10) == 0) return;
        if (this.d == null) return;
        if ((n2 & 0x10) != 0) {
            this.a.addView(this.d);
            return;
        }
        this.a.removeView(this.d);
    }

    /*
     * Enabled aggressive block sorting
     */
    private void d() {
        if ((this.c & 4) != 0) {
            Toolbar toolbar = this.a;
            Drawable drawable = this.g != null ? this.g : this.o;
            toolbar.setNavigationIcon(drawable);
        }
    }

    @Override
    public final CharSequence a() {
        return this.a.getTitle();
    }

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public final void a(int n2) {
        Drawable drawable = n2 != 0 ? this.m.a(n2) : null;
        this.a(drawable);
    }

    @Override
    public final void a(Drawable drawable) {
        this.e = drawable;
        this.b();
    }

    @Override
    public final void a(android.support.v7.internal.a.a a2) {
        this.k = a2;
    }

    @Override
    public final void a(CharSequence charSequence) {
        if (!this.h) {
            this.b(charSequence);
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public final void b(int n2) {
        Drawable drawable = n2 != 0 ? this.m.a(n2) : null;
        this.b(drawable);
    }
}

