package android.support.v7.internal.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.support.v7.b.a;
import android.support.v7.internal.a.a;
import android.support.v7.widget.Toolbar;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public final class r implements h {
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

    public r(Toolbar toolbar) {
        this(toolbar, a.h.abc_action_bar_up_description, a.d.abc_ic_ab_back_mtrl_am_alpha);
    }

    private r(Toolbar toolbar, int i2, int i3) {
        String string;
        this.l = 0;
        this.n = 0;
        this.a = toolbar;
        this.b = toolbar.getTitle();
        this.i = toolbar.getSubtitle();
        this.h = this.b != null;
        q a2 = q.a(toolbar.getContext(), (AttributeSet) null, a.i.ActionBar, a.C0011a.actionBarStyle);
        CharSequence b2 = a2.b(a.i.ActionBar_title);
        if (!TextUtils.isEmpty(b2)) {
            this.h = true;
            b(b2);
        }
        CharSequence b3 = a2.b(a.i.ActionBar_subtitle);
        if (!TextUtils.isEmpty(b3)) {
            this.i = b3;
            if ((this.c & 8) != 0) {
                this.a.setSubtitle(b3);
            }
        }
        Drawable a3 = a2.a(a.i.ActionBar_logo);
        if (a3 != null) {
            b(a3);
        }
        Drawable a4 = a2.a(a.i.ActionBar_icon);
        if (a4 != null) {
            a(a4);
        }
        Drawable a5 = a2.a(a.i.ActionBar_homeAsUpIndicator);
        if (a5 != null) {
            this.g = a5;
            d();
        }
        c(a2.a(a.i.ActionBar_displayOptions, 0));
        int e2 = a2.e(a.i.ActionBar_customNavigationLayout, 0);
        if (e2 != 0) {
            View inflate = LayoutInflater.from(this.a.getContext()).inflate(e2, this.a, false);
            if (!(this.d == null || (this.c & 16) == 0)) {
                this.a.removeView(this.d);
            }
            this.d = inflate;
            if (!(inflate == null || (this.c & 16) == 0)) {
                this.a.addView(this.d);
            }
            c(this.c | 16);
        }
        int d2 = a2.d(a.i.ActionBar_height, 0);
        if (d2 > 0) {
            ViewGroup.LayoutParams layoutParams = this.a.getLayoutParams();
            layoutParams.height = d2;
            this.a.setLayoutParams(layoutParams);
        }
        int b4 = a2.b(a.i.ActionBar_contentInsetStart, -1);
        int b5 = a2.b(a.i.ActionBar_contentInsetEnd, -1);
        if (b4 >= 0 || b5 >= 0) {
            this.a.g.a(Math.max(b4, 0), Math.max(b5, 0));
        }
        int e3 = a2.e(a.i.ActionBar_titleTextStyle, 0);
        if (e3 != 0) {
            Toolbar toolbar2 = this.a;
            Context context = this.a.getContext();
            toolbar2.e = e3;
            if (toolbar2.b != null) {
                toolbar2.b.setTextAppearance(context, e3);
            }
        }
        int e4 = a2.e(a.i.ActionBar_subtitleTextStyle, 0);
        if (e4 != 0) {
            Toolbar toolbar3 = this.a;
            Context context2 = this.a.getContext();
            toolbar3.f = e4;
            if (toolbar3.c != null) {
                toolbar3.c.setTextAppearance(context2, e4);
            }
        }
        int e5 = a2.e(a.i.ActionBar_popupTheme, 0);
        if (e5 != 0) {
            this.a.setPopupTheme(e5);
        }
        a2.a.recycle();
        this.m = a2.a();
        if (i2 != this.n) {
            this.n = i2;
            if (TextUtils.isEmpty(this.a.getNavigationContentDescription())) {
                int i4 = this.n;
                if (i4 == 0) {
                    string = null;
                } else {
                    string = this.a.getContext().getString(i4);
                }
                this.j = string;
                c();
            }
        }
        this.j = this.a.getNavigationContentDescription();
        Drawable a6 = this.m.a(i3);
        if (this.o != a6) {
            this.o = a6;
            d();
        }
        this.a.setNavigationOnClickListener(new View.OnClickListener() {
            final android.support.v7.internal.view.menu.a a = new android.support.v7.internal.view.menu.a(r.this.a.getContext(), r.this.b);

            public final void onClick(View view) {
            }
        });
    }

    public final void a(android.support.v7.internal.a.a aVar) {
        this.k = aVar;
    }

    public final void a(CharSequence charSequence) {
        if (!this.h) {
            b(charSequence);
        }
    }

    public final CharSequence a() {
        return this.a.getTitle();
    }

    private void b(CharSequence charSequence) {
        this.b = charSequence;
        if ((this.c & 8) != 0) {
            this.a.setTitle(charSequence);
        }
    }

    public final void a(int i2) {
        a(i2 != 0 ? this.m.a(i2) : null);
    }

    public final void a(Drawable drawable) {
        this.e = drawable;
        b();
    }

    public final void b(int i2) {
        b(i2 != 0 ? this.m.a(i2) : null);
    }

    private void b(Drawable drawable) {
        this.f = drawable;
        b();
    }

    private void b() {
        Drawable drawable = null;
        if ((this.c & 2) != 0) {
            if ((this.c & 1) != 0) {
                drawable = this.f != null ? this.f : this.e;
            } else {
                drawable = this.e;
            }
        }
        this.a.setLogo(drawable);
    }

    private void c(int i2) {
        int i3 = this.c ^ i2;
        this.c = i2;
        if (i3 != 0) {
            if ((i3 & 4) != 0) {
                if ((i2 & 4) != 0) {
                    d();
                    c();
                } else {
                    this.a.setNavigationIcon((Drawable) null);
                }
            }
            if ((i3 & 3) != 0) {
                b();
            }
            if ((i3 & 8) != 0) {
                if ((i2 & 8) != 0) {
                    this.a.setTitle(this.b);
                    this.a.setSubtitle(this.i);
                } else {
                    this.a.setTitle((CharSequence) null);
                    this.a.setSubtitle((CharSequence) null);
                }
            }
            if ((i3 & 16) != 0 && this.d != null) {
                if ((i2 & 16) != 0) {
                    this.a.addView(this.d);
                } else {
                    this.a.removeView(this.d);
                }
            }
        }
    }

    private void c() {
        if ((this.c & 4) == 0) {
            return;
        }
        if (TextUtils.isEmpty(this.j)) {
            this.a.setNavigationContentDescription(this.n);
        } else {
            this.a.setNavigationContentDescription(this.j);
        }
    }

    private void d() {
        if ((this.c & 4) != 0) {
            this.a.setNavigationIcon(this.g != null ? this.g : this.o);
        }
    }
}
