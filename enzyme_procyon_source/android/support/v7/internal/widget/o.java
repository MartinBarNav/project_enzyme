// 
// Decompiled by Procyon v0.5.36
// 

package android.support.v7.internal.widget;

import android.support.v4.e.e;
import android.graphics.ColorFilter;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.Color;
import android.support.v7.b.a;
import android.content.res.ColorStateList;
import android.util.TypedValue;
import android.content.res.Resources;
import android.content.Context;
import android.graphics.PorterDuff$Mode;

public class o
{
    static final PorterDuff$Mode a;
    private static final String b;
    private static final a c;
    private static final int[] d;
    private static final int[] e;
    private static final int[] f;
    private static final int[] g;
    private static final int[] h;
    private final Context i;
    private final Resources j;
    private final TypedValue k;
    private ColorStateList l;
    private ColorStateList m;
    private ColorStateList n;
    
    static {
        b = o.class.getSimpleName();
        a = PorterDuff$Mode.SRC_IN;
        c = new a();
        d = new int[] { android.support.v7.b.a.d.abc_ic_ab_back_mtrl_am_alpha, android.support.v7.b.a.d.abc_ic_go_search_api_mtrl_alpha, android.support.v7.b.a.d.abc_ic_search_api_mtrl_alpha, android.support.v7.b.a.d.abc_ic_commit_search_api_mtrl_alpha, android.support.v7.b.a.d.abc_ic_clear_mtrl_alpha, android.support.v7.b.a.d.abc_ic_menu_share_mtrl_alpha, android.support.v7.b.a.d.abc_ic_menu_copy_mtrl_am_alpha, android.support.v7.b.a.d.abc_ic_menu_cut_mtrl_alpha, android.support.v7.b.a.d.abc_ic_menu_selectall_mtrl_alpha, android.support.v7.b.a.d.abc_ic_menu_paste_mtrl_am_alpha, android.support.v7.b.a.d.abc_ic_menu_moreoverflow_mtrl_alpha, android.support.v7.b.a.d.abc_ic_voice_search_api_mtrl_alpha, android.support.v7.b.a.d.abc_textfield_search_default_mtrl_alpha, android.support.v7.b.a.d.abc_textfield_default_mtrl_alpha };
        e = new int[] { android.support.v7.b.a.d.abc_textfield_activated_mtrl_alpha, android.support.v7.b.a.d.abc_textfield_search_activated_mtrl_alpha, android.support.v7.b.a.d.abc_cab_background_top_mtrl_alpha };
        f = new int[] { android.support.v7.b.a.d.abc_popup_background_mtrl_mult, android.support.v7.b.a.d.abc_cab_background_internal_bg, android.support.v7.b.a.d.abc_menu_hardkey_panel_mtrl_mult };
        g = new int[] { android.support.v7.b.a.d.abc_edit_text_material, android.support.v7.b.a.d.abc_tab_indicator_material, android.support.v7.b.a.d.abc_textfield_search_material, android.support.v7.b.a.d.abc_spinner_mtrl_am_alpha, android.support.v7.b.a.d.abc_btn_check_material, android.support.v7.b.a.d.abc_btn_radio_material };
        h = new int[] { android.support.v7.b.a.d.abc_cab_background_top_material };
    }
    
    public o(final Context i) {
        this.i = i;
        this.j = new p(i.getResources(), this);
        this.k = new TypedValue();
    }
    
    private int a(int b, final float n) {
        b = this.b(b);
        return (b & 0xFFFFFF) | Math.round(Color.alpha(b) * n) << 24;
    }
    
    public static Drawable a(final Context context, final int n) {
        int n2;
        if (a(o.f, n) || a(o.d, n) || a(o.e, n) || a(o.g, n) || a(o.h, n)) {
            n2 = 1;
        }
        else {
            n2 = 0;
        }
        Drawable drawable;
        if (n2 != 0) {
            drawable = new o(context).a(n);
        }
        else {
            drawable = android.support.v4.content.a.a(context, n);
        }
        return drawable;
    }
    
    private static boolean a(final int[] array, final int n) {
        final boolean b = false;
        final int length = array.length;
        int n2 = 0;
        boolean b2;
        while (true) {
            b2 = b;
            if (n2 >= length) {
                break;
            }
            if (array[n2] == n) {
                b2 = true;
                break;
            }
            ++n2;
        }
        return b2;
    }
    
    private int b(int n) {
        if (!this.i.getTheme().resolveAttribute(n, this.k, true)) {
            return 0;
        }
        if (this.k.type >= 16 && this.k.type <= 31) {
            n = this.k.data;
        }
        else {
            if (this.k.type != 3) {
                return 0;
            }
            n = this.j.getColor(this.k.resourceId);
        }
        return n;
        n = 0;
        return n;
    }
    
    private int c(final int n) {
        this.i.getTheme().resolveAttribute(16842803, this.k, true);
        return this.a(n, this.k.getFloat());
    }
    
    public final Drawable a(int n) {
        Drawable drawable = android.support.v4.content.a.a(this.i, n);
        if (drawable != null) {
            if (a(o.g, n)) {
                if (this.l == null) {
                    final int b = this.b(android.support.v7.b.a.a.colorControlNormal);
                    n = this.b(android.support.v7.b.a.a.colorControlActivated);
                    this.l = new ColorStateList(new int[][] { { -16842910 }, { 16842908 }, { 16843518 }, { 16842919 }, { 16842912 }, { 16842913 }, new int[0] }, new int[] { this.c(android.support.v7.b.a.a.colorControlNormal), n, n, n, n, n, b });
                }
                drawable = new n(drawable, this.l);
            }
            else if (n == android.support.v7.b.a.d.abc_switch_track_mtrl_alpha) {
                if (this.n == null) {
                    final int[] array = { -16842910 };
                    n = this.a(16842800, 0.1f);
                    this.n = new ColorStateList(new int[][] { array, { 16842912 }, new int[0] }, new int[] { n, this.a(android.support.v7.b.a.a.colorControlActivated, 0.3f), this.a(16842800, 0.3f) });
                }
                drawable = new n(drawable, this.n);
            }
            else if (n == android.support.v7.b.a.d.abc_switch_thumb_material) {
                if (this.m == null) {
                    final int c = this.c(android.support.v7.b.a.a.colorSwitchThumbNormal);
                    n = this.b(android.support.v7.b.a.a.colorControlActivated);
                    this.m = new ColorStateList(new int[][] { { -16842910 }, { 16842912 }, new int[0] }, new int[] { c, n, this.b(android.support.v7.b.a.a.colorSwitchThumbNormal) });
                }
                drawable = new n(drawable, this.m, PorterDuff$Mode.MULTIPLY);
            }
            else if (a(o.h, n)) {
                drawable = this.j.getDrawable(n);
            }
            else {
                this.a(n, drawable);
            }
        }
        return drawable;
    }
    
    final void a(int b, final Drawable drawable) {
        int n;
        int round;
        PorterDuff$Mode porterDuff$Mode;
        if (a(o.d, b)) {
            n = android.support.v7.b.a.a.colorControlNormal;
            b = 1;
            round = -1;
            porterDuff$Mode = null;
        }
        else if (a(o.e, b)) {
            n = android.support.v7.b.a.a.colorControlActivated;
            b = 1;
            round = -1;
            porterDuff$Mode = null;
        }
        else if (a(o.f, b)) {
            porterDuff$Mode = PorterDuff$Mode.MULTIPLY;
            n = 16842801;
            b = 1;
            round = -1;
        }
        else if (b == android.support.v7.b.a.d.abc_list_divider_mtrl_alpha) {
            round = Math.round(40.8f);
            porterDuff$Mode = null;
            n = 16842800;
            b = 1;
        }
        else {
            round = -1;
            b = 0;
            porterDuff$Mode = null;
            n = 0;
        }
        if (b != 0) {
            if (porterDuff$Mode == null) {
                porterDuff$Mode = o.a;
            }
            b = this.b(n);
            PorterDuffColorFilter colorFilter;
            if ((colorFilter = o.c.a(Integer.valueOf(o.a.a(b, porterDuff$Mode)))) == null) {
                colorFilter = new PorterDuffColorFilter(b, porterDuff$Mode);
                o.c.a(o.a.a(b, porterDuff$Mode), colorFilter);
            }
            drawable.setColorFilter((ColorFilter)colorFilter);
            if (round != -1) {
                drawable.setAlpha(round);
            }
        }
    }
    
    private static final class a extends e<Integer, PorterDuffColorFilter>
    {
        public a() {
        }
        
        static int a(final int n, final PorterDuff$Mode porterDuff$Mode) {
            return (n + 31) * 31 + porterDuff$Mode.hashCode();
        }
    }
}
