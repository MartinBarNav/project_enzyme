// 
// Decompiled by Procyon v0.5.36
// 

package com.saterskog.cell_lab;

import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;
import android.opengl.GLES20;
import android.content.Context;

public final class n extends d
{
    private static float y;
    CellWorld p;
    double q;
    double r;
    float[] s;
    boolean t;
    public double u;
    Gene[] v;
    int w;
    c x;
    
    static {
        n.y = 1.1f;
    }
    
    public n(final Context context) {
        super(n.y, true, context);
        this.s = new float[] { 0.8f, 0.8f, 1.0f };
        this.u = 0.0;
        this.x = null;
        final Environment environment = new Environment();
        environment.c = 0.0;
        environment.a = 0.0;
        environment.f = 0.0;
        environment.z = 1.0;
        environment.i = 0.0;
        environment.x = true;
        environment.g = 75.0;
        environment.s = 0;
        environment.r = 128;
        environment.k = 1.0;
        this.p = new CellWorld(true, environment);
        this.b = 0.0f;
        this.c = 0.0f;
        this.d = 8.0f;
        this.u = 0.0;
        this.e = 1.0f;
        this.b();
    }
    
    public final void a(final float n, final float n2) {
        if (this.l) {
            this.b -= n / this.a;
            this.c += n2 / this.a;
            this.b();
        }
    }
    
    public final void a(final float n, final float n2, final float n3) {
        if (this.l) {
            this.d *= n;
            this.b += (float)((this.a(n2) - this.b) * (n - 1.0f));
            this.c += (float)((this.b(n3) - this.c) * (n - 1.0f));
            this.b();
        }
    }
    
    public final void a(final float[] array) {
        GLES20.glClearColor(0.1254902f, 0.1254902f, 0.1254902f, 0.0f);
        GLES20.glDepthMask(true);
        GLES20.glClear(16640);
        final float n = 2.0f / this.f;
        final float n2 = 2.0f / this.g;
        final float n3 = -2.0f * this.b / this.f;
        final float n4 = -2.0f * this.c / this.g;
        final float[] array2 = new float[16];
        for (int i = 0; i < 4; ++i) {
            for (int j = 0; j < 4; ++j) {
                array2[j * 4 + i] = 0.0f;
                for (int k = 0; k < 4; ++k) {
                    final int n5 = j * 4 + i;
                    array2[n5] += (new float[] { n, 0.0f, 0.0f, 0.0f, 0.0f, n2, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, n3, n4, 0.0f, 1.0f })[j * 4 + k] * array[k * 4 + i];
                }
            }
        }
        if (!this.t) {
            this.p.a();
            if (this.v != null) {
                final Cell cell = new Cell();
                cell.I = this.v;
                cell.b = 0.0;
                cell.c = 0.0;
                cell.D = 0;
                for (int l = 0; l < 80; ++l) {
                    if (cell.I[l].p) {
                        cell.D = l;
                    }
                }
                cell.w = 0.288;
                if (cell.I[cell.D].s == com.saterskog.cell_lab.h.e) {
                    cell.S = 1.8f;
                }
                cell.d = Math.sqrt(cell.w / 400.0);
                cell.J[0] = cell.I[cell.D].a[0];
                cell.J[1] = cell.I[cell.D].a[1];
                cell.J[2] = cell.I[cell.D].a[2];
                cell.J[3] = 1.0f;
                cell.e = 0.0;
                cell.f = 0.0;
                cell.l = 0.0;
                cell.n = 0.0;
                cell.k = 0.0;
                cell.m = 0.0;
                cell.C = 0;
                cell.p = 1.0;
                cell.T = -1;
                cell.r = 0.0f;
                for (int n6 = 0; n6 < 4; ++n6) {
                    cell.U[n6] = 0.01f;
                }
                cell.y = false;
                this.p.a(cell);
            }
            int n7 = 0;
            this.p.Y.setSeed(1337L);
            int n9;
            for (int n8 = 0; n8 < (int)(this.u / 0.02) && n7 <= 10; ++n8, n7 = n9) {
                this.p.a(false, 1.0);
                n9 = n7;
                if (this.p.z >= 128) {
                    n9 = n7 + 1;
                }
            }
            this.p.a(true, 0.0);
            this.t = true;
        }
        GLES20.glDisable(3042);
        GLES20.glDepthMask(false);
        for (int n10 = 0; n10 < this.p.z; ++n10) {
            if (this.p.x[n10].D == this.w) {
                this.a(array2, (float)this.p.x[n10].b, (float)this.p.x[n10].c, (float)(this.p.x[n10].d + 0.01), 0.3f);
            }
        }
        this.p.a(this.b - this.f / 2.0f, this.b + this.f / 2.0f, this.c - this.g / 2.0f, this.c + this.g / 2.0f);
        final CellWorld p = this.p;
        GLES20.glDisable(2929);
        GLES20.glDepthMask(false);
        GLES20.glEnable(3042);
        GLES20.glBlendFunc(770, 771);
        GLES20.glDepthFunc(519);
        p.b(array2);
        GLES20.glEnable(2929);
        GLES20.glDisable(3042);
        GLES20.glDepthMask(true);
        p.d(array2);
        p.c(array2);
        GLES20.glEnable(2929);
        GLES20.glDepthFunc(513);
        GLES20.glEnable(3042);
        GLES20.glDepthMask(false);
        p.e(array2);
    }
    
    public final void onSurfaceCreated(final GL10 gl10, final EGLConfig eglConfig) {
        GLES20.glClearColor(0.8f, 0.8f, 1.0f, 1.0f);
        this.p.a(this.h);
        this.a();
    }
}
