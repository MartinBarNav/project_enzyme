package android.support.v7.internal.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.support.v4.e.e;
import android.support.v7.b.a;
import android.util.TypedValue;

public class o {
    static final PorterDuff.Mode a = PorterDuff.Mode.SRC_IN;
    private static final String b = o.class.getSimpleName();
    private static final a c = new a();
    private static final int[] d = {a.d.abc_ic_ab_back_mtrl_am_alpha, a.d.abc_ic_go_search_api_mtrl_alpha, a.d.abc_ic_search_api_mtrl_alpha, a.d.abc_ic_commit_search_api_mtrl_alpha, a.d.abc_ic_clear_mtrl_alpha, a.d.abc_ic_menu_share_mtrl_alpha, a.d.abc_ic_menu_copy_mtrl_am_alpha, a.d.abc_ic_menu_cut_mtrl_alpha, a.d.abc_ic_menu_selectall_mtrl_alpha, a.d.abc_ic_menu_paste_mtrl_am_alpha, a.d.abc_ic_menu_moreoverflow_mtrl_alpha, a.d.abc_ic_voice_search_api_mtrl_alpha, a.d.abc_textfield_search_default_mtrl_alpha, a.d.abc_textfield_default_mtrl_alpha};
    private static final int[] e = {a.d.abc_textfield_activated_mtrl_alpha, a.d.abc_textfield_search_activated_mtrl_alpha, a.d.abc_cab_background_top_mtrl_alpha};
    private static final int[] f = {a.d.abc_popup_background_mtrl_mult, a.d.abc_cab_background_internal_bg, a.d.abc_menu_hardkey_panel_mtrl_mult};
    private static final int[] g = {a.d.abc_edit_text_material, a.d.abc_tab_indicator_material, a.d.abc_textfield_search_material, a.d.abc_spinner_mtrl_am_alpha, a.d.abc_btn_check_material, a.d.abc_btn_radio_material};
    private static final int[] h = {a.d.abc_cab_background_top_material};
    private final Context i;
    private final Resources j;
    private final TypedValue k = new TypedValue();
    private ColorStateList l;
    private ColorStateList m;
    private ColorStateList n;

    public o(Context context) {
        this.i = context;
        this.j = new p(context.getResources(), this);
    }

    public final Drawable a(int i2) {
        Drawable a2 = android.support.v4.content.a.a(this.i, i2);
        if (a2 != null) {
            if (a(g, i2)) {
                if (this.l == null) {
                    int b2 = b(a.C0011a.colorControlNormal);
                    int b3 = b(a.C0011a.colorControlActivated);
                    this.l = new ColorStateList(new int[][]{new int[]{-16842910}, new int[]{16842908}, new int[]{16843518}, new int[]{16842919}, new int[]{16842912}, new int[]{16842913}, new int[0]}, new int[]{c(a.C0011a.colorControlNormal), b3, b3, b3, b3, b3, b2});
                }
                return new n(a2, this.l);
            } else if (i2 == a.d.abc_switch_track_mtrl_alpha) {
                if (this.n == null) {
                    this.n = new ColorStateList(new int[][]{new int[]{-16842910}, new int[]{16842912}, new int[0]}, new int[]{a(16842800, 0.1f), a(a.C0011a.colorControlActivated, 0.3f), a(16842800, 0.3f)});
                }
                return new n(a2, this.n);
            } else if (i2 == a.d.abc_switch_thumb_material) {
                if (this.m == null) {
                    this.m = new ColorStateList(new int[][]{new int[]{-16842910}, new int[]{16842912}, new int[0]}, new int[]{c(a.C0011a.colorSwitchThumbNormal), b(a.C0011a.colorControlActivated), b(a.C0011a.colorSwitchThumbNormal)});
                }
                return new n(a2, this.m, PorterDuff.Mode.MULTIPLY);
            } else if (a(h, i2)) {
                return this.j.getDrawable(i2);
            } else {
                a(i2, a2);
            }
        }
        return a2;
    }

    /* access modifiers changed from: package-private */
    public final void a(int i2, Drawable drawable) {
        int i3;
        boolean z;
        PorterDuff.Mode mode;
        int i4;
        PorterDuff.Mode mode2;
        if (a(d, i2)) {
            z = true;
            i3 = -1;
            mode = null;
            i4 = a.C0011a.colorControlNormal;
        } else if (a(e, i2)) {
            z = true;
            i3 = -1;
            mode = null;
            i4 = a.C0011a.colorControlActivated;
        } else if (a(f, i2)) {
            i4 = 16842801;
            mode = PorterDuff.Mode.MULTIPLY;
            z = true;
            i3 = -1;
        } else if (i2 == a.d.abc_list_divider_mtrl_alpha) {
            mode = null;
            i4 = 16842800;
            z = true;
            i3 = Math.round(40.8f);
        } else {
            i3 = -1;
            z = false;
            mode = null;
            i4 = 0;
        }
        if (z) {
            if (mode == null) {
                mode2 = a;
            } else {
                mode2 = mode;
            }
            int b2 = b(i4);
            PorterDuffColorFilter porterDuffColorFilter = (PorterDuffColorFilter) c.a(Integer.valueOf(a.a(b2, mode2)));
            if (porterDuffColorFilter == null) {
                porterDuffColorFilter = new PorterDuffColorFilter(b2, mode2);
                c.a(Integer.valueOf(a.a(b2, mode2)), porterDuffColorFilter);
            }
            drawable.setColorFilter(porterDuffColorFilter);
            if (i3 != -1) {
                drawable.setAlpha(i3);
            }
        }
    }

    private static boolean a(int[] iArr, int i2) {
        for (int i3 : iArr) {
            if (i3 == i2) {
                return true;
            }
        }
        return false;
    }

    private int b(int i2) {
        if (this.i.getTheme().resolveAttribute(i2, this.k, true)) {
            if (this.k.type >= 16 && this.k.type <= 31) {
                return this.k.data;
            }
            if (this.k.type == 3) {
                return this.j.getColor(this.k.resourceId);
            }
        }
        return 0;
    }

    private int a(int i2, float f2) {
        int b2 = b(i2);
        return (b2 & 16777215) | (Math.round(((float) Color.alpha(b2)) * f2) << 24);
    }

    private int c(int i2) {
        this.i.getTheme().resolveAttribute(16842803, this.k, true);
        return a(i2, this.k.getFloat());
    }

    private static class a extends e<Integer, PorterDuffColorFilter> {
        static int a(int i, PorterDuff.Mode mode) {
            return ((i + 31) * 31) + mode.hashCode();
        }
    }

    public static Drawable a(Context context, int i2) {
        boolean z;
        if (a(f, i2) || a(d, i2) || a(e, i2) || a(g, i2) || a(h, i2)) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return new o(context).a(i2);
        }
        return android.support.v4.content.a.a(context, i2);
    }
}
