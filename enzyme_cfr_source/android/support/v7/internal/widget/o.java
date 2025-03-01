/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.res.ColorStateList
 *  android.content.res.Resources
 *  android.graphics.Color
 *  android.graphics.ColorFilter
 *  android.graphics.PorterDuff$Mode
 *  android.graphics.PorterDuffColorFilter
 *  android.graphics.drawable.Drawable
 *  android.util.TypedValue
 */
package android.support.v7.internal.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.support.v4.e.e;
import android.support.v7.b.a;
import android.support.v7.internal.widget.n;
import android.support.v7.internal.widget.p;
import android.util.TypedValue;

public class o {
    static final PorterDuff.Mode a;
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
        a = PorterDuff.Mode.SRC_IN;
        c = new a();
        d = new int[]{a.d.abc_ic_ab_back_mtrl_am_alpha, a.d.abc_ic_go_search_api_mtrl_alpha, a.d.abc_ic_search_api_mtrl_alpha, a.d.abc_ic_commit_search_api_mtrl_alpha, a.d.abc_ic_clear_mtrl_alpha, a.d.abc_ic_menu_share_mtrl_alpha, a.d.abc_ic_menu_copy_mtrl_am_alpha, a.d.abc_ic_menu_cut_mtrl_alpha, a.d.abc_ic_menu_selectall_mtrl_alpha, a.d.abc_ic_menu_paste_mtrl_am_alpha, a.d.abc_ic_menu_moreoverflow_mtrl_alpha, a.d.abc_ic_voice_search_api_mtrl_alpha, a.d.abc_textfield_search_default_mtrl_alpha, a.d.abc_textfield_default_mtrl_alpha};
        e = new int[]{a.d.abc_textfield_activated_mtrl_alpha, a.d.abc_textfield_search_activated_mtrl_alpha, a.d.abc_cab_background_top_mtrl_alpha};
        f = new int[]{a.d.abc_popup_background_mtrl_mult, a.d.abc_cab_background_internal_bg, a.d.abc_menu_hardkey_panel_mtrl_mult};
        g = new int[]{a.d.abc_edit_text_material, a.d.abc_tab_indicator_material, a.d.abc_textfield_search_material, a.d.abc_spinner_mtrl_am_alpha, a.d.abc_btn_check_material, a.d.abc_btn_radio_material};
        h = new int[]{a.d.abc_cab_background_top_material};
    }

    public o(Context context) {
        this.i = context;
        this.j = new p(context.getResources(), this);
        this.k = new TypedValue();
    }

    private int a(int n2, float f2) {
        n2 = this.b(n2);
        return n2 & 0xFFFFFF | Math.round((float)Color.alpha((int)n2) * f2) << 24;
    }

    /*
     * Enabled aggressive block sorting
     */
    public static Drawable a(Context context, int n2) {
        boolean bl = o.a(f, n2) || o.a(d, n2) || o.a(e, n2) || o.a(g, n2) || o.a(h, n2);
        if (!bl) return android.support.v4.content.a.a(context, n2);
        return new o(context).a(n2);
    }

    private static boolean a(int[] arrn, int n2) {
        boolean bl = false;
        int n3 = arrn.length;
        int n4 = 0;
        while (true) {
            block4: {
                boolean bl2;
                block3: {
                    bl2 = bl;
                    if (n4 >= n3) break block3;
                    if (arrn[n4] != n2) break block4;
                    bl2 = true;
                }
                return bl2;
            }
            ++n4;
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private int b(int n2) {
        if (!this.i.getTheme().resolveAttribute(n2, this.k, true)) return 0;
        if (this.k.type >= 16 && this.k.type <= 31) {
            return this.k.data;
        }
        if (this.k.type != 3) return 0;
        return this.j.getColor(this.k.resourceId);
    }

    private int c(int n2) {
        this.i.getTheme().resolveAttribute(0x1010033, this.k, true);
        return this.a(n2, this.k.getFloat());
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final Drawable a(int n2) {
        Drawable drawable = android.support.v4.content.a.a(this.i, n2);
        if (drawable == null) return drawable;
        if (o.a(g, n2)) {
            if (this.l != null) return new n(drawable, this.l);
            int n3 = this.b(a.a.colorControlNormal);
            n2 = this.b(a.a.colorControlActivated);
            int[] arrn = new int[]{-16842910};
            int n4 = this.c(a.a.colorControlNormal);
            int[] arrn2 = new int[]{16842908};
            int[] arrn3 = new int[]{0x10100A0};
            int[] arrn4 = new int[]{};
            this.l = new ColorStateList((int[][])new int[][]{arrn, arrn2, {16843518}, {16842919}, arrn3, {0x10100A1}, arrn4}, new int[]{n4, n2, n2, n2, n2, n2, n3});
            return new n(drawable, this.l);
        }
        if (n2 == a.d.abc_switch_track_mtrl_alpha) {
            if (this.n != null) return new n(drawable, this.n);
            int[] arrn = new int[]{-16842910};
            n2 = this.a(0x1010030, 0.1f);
            int n5 = this.a(a.a.colorControlActivated, 0.3f);
            int n6 = this.a(0x1010030, 0.3f);
            this.n = new ColorStateList((int[][])new int[][]{arrn, {0x10100A0}, new int[0]}, new int[]{n2, n5, n6});
            return new n(drawable, this.n);
        }
        if (n2 == a.d.abc_switch_thumb_material) {
            if (this.m != null) return new n(drawable, this.m, PorterDuff.Mode.MULTIPLY);
            int n7 = this.c(a.a.colorSwitchThumbNormal);
            n2 = this.b(a.a.colorControlActivated);
            int n8 = this.b(a.a.colorSwitchThumbNormal);
            this.m = new ColorStateList((int[][])new int[][]{{-16842910}, {0x10100A0}, new int[0]}, new int[]{n7, n2, n8});
            return new n(drawable, this.m, PorterDuff.Mode.MULTIPLY);
        }
        if (o.a(h, n2)) {
            return this.j.getDrawable(n2);
        }
        this.a(n2, drawable);
        return drawable;
    }

    /*
     * Enabled aggressive block sorting
     */
    final void a(int n2, Drawable drawable) {
        PorterDuffColorFilter porterDuffColorFilter;
        PorterDuff.Mode mode;
        int n3;
        int n4;
        if (o.a(d, n2)) {
            n4 = a.a.colorControlNormal;
            n2 = 1;
            n3 = -1;
            mode = null;
        } else if (o.a(e, n2)) {
            n4 = a.a.colorControlActivated;
            n2 = 1;
            n3 = -1;
            mode = null;
        } else if (o.a(f, n2)) {
            mode = PorterDuff.Mode.MULTIPLY;
            n4 = 0x1010031;
            n2 = 1;
            n3 = -1;
        } else {
            if (n2 != a.d.abc_list_divider_mtrl_alpha) return;
            n3 = Math.round(40.8f);
            mode = null;
            n4 = 0x1010030;
            n2 = 1;
        }
        if (n2 == 0) return;
        if (mode == null) {
            mode = a;
        }
        n2 = this.b(n4);
        PorterDuffColorFilter porterDuffColorFilter2 = porterDuffColorFilter = (PorterDuffColorFilter)c.a(android.support.v7.internal.widget.o$a.a(n2, mode));
        if (porterDuffColorFilter == null) {
            porterDuffColorFilter2 = new PorterDuffColorFilter(n2, mode);
            c.a(android.support.v7.internal.widget.o$a.a(n2, mode), porterDuffColorFilter2);
        }
        drawable.setColorFilter((ColorFilter)porterDuffColorFilter2);
        if (n3 == -1) return;
        drawable.setAlpha(n3);
    }

    private static final class a
    extends e<Integer, PorterDuffColorFilter> {
        static int a(int n2, PorterDuff.Mode mode) {
            return (n2 + 31) * 31 + mode.hashCode();
        }
    }
}

