package com.saterskog.cell_lab;

import android.content.Context;

public enum h {
    PHAGOCYTE(true, 0.1d, C0028R.raw.cell_vert, C0028R.raw.cell_frag),
    FLAGELLOCYTE(false, 0.1d, C0028R.raw.cell_vert, C0028R.raw.cell_frag, C0028R.raw.tail_vert, C0028R.raw.tail_frag, 0.12d, true),
    PHOTOCYTE(true, 0.25d, C0028R.raw.photo_vert, C0028R.raw.photo_frag),
    DEVOROCYTE(true, 0.1d, C0028R.raw.cell_vert, C0028R.raw.cell_frag, C0028R.raw.kill_vert, C0028R.raw.kill_frag, 0.009d, false),
    LIPOCYTE(false, 0.005d, C0028R.raw.lip_vert, C0028R.raw.lip_frag),
    KERATINOCYTE(false, 0.01d, C0028R.raw.ker_vert, C0028R.raw.ker_frag),
    BUOYOCYTE(false, 0.02d, C0028R.raw.buoy_vert, C0028R.raw.buoy_frag),
    GLUEOCYTE(true, 0.01d, C0028R.raw.cell_vert, C0028R.raw.cell_frag, C0028R.raw.glue_vert, C0028R.raw.glue_frag, 0.012d, false),
    VIROCYTE(false, 0.2d, C0028R.raw.cell_vert, C0028R.raw.cell_frag, C0028R.raw.virus_vert, C0028R.raw.virus_frag, 0.009d, false),
    NITROCYTE(false, 0.02d, C0028R.raw.cell_vert, C0028R.raw.cell_frag, C0028R.raw.min_vert, C0028R.raw.min_frag, 0.0135d, false),
    STEREOCYTE(false, 0.01d, C0028R.raw.nerve_vert, C0028R.raw.nerve_frag, C0028R.raw.stereo_vert, C0028R.raw.stereo_frag, 0.012d, false),
    SENSEOCYTE(false, 0.01d, C0028R.raw.nerve_vert, C0028R.raw.nerve_frag, C0028R.raw.stereo_vert, C0028R.raw.sense_frag, 0.006d, false),
    MYOCYTE(false, 0.02d, C0028R.raw.muscle_vert, C0028R.raw.muscle_frag),
    NEUROCYTE(false, 0.02d, C0028R.raw.nerve_vert, C0028R.raw.nerve_frag),
    SECROCYTE(false, 0.03d, C0028R.raw.ves_vert, C0028R.raw.ves_frag),
    STEMOCYTE(false, 0.02d, C0028R.raw.stem_vert, C0028R.raw.stem_frag),
    GAMETE(false, 0.005d, C0028R.raw.gamete_vert, C0028R.raw.gamete_frag),
    CILIOCYTE(false, 0.005d, C0028R.raw.cell_vert, C0028R.raw.cell_frag, C0028R.raw.tax_vert, C0028R.raw.tax_frag, 0.0045d, false);
    
    public static h[] B;
    final double A;
    final boolean s;
    final boolean t;
    final double u;
    final double v;
    final int w;
    final int x;
    final int y;
    final int z;

    static {
        B = values();
    }

    private h(boolean z2, double d, int i, int i2, int i3, int i4, double d2, boolean z3) {
        this.s = z2;
        this.u = d;
        this.v = 0.0d;
        this.w = i;
        this.x = i2;
        this.y = i3;
        this.z = i4;
        this.A = d2;
        this.t = z3;
    }

    public final String a(Context context) {
        return context.getResources().getStringArray(C0028R.array.cell_type_names)[ordinal()];
    }

    private h(boolean z2, double d, int i, int i2) {
        this(r15, r16, z2, d, i, i2, -1, -1, 1.0d, false);
    }
}
