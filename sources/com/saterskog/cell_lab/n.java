package com.saterskog.cell_lab;

import android.content.Context;
import android.opengl.GLES20;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;

public final class n extends d {
    private static float y = 1.1f;
    CellWorld p;
    double q;
    double r;
    float[] s = {0.8f, 0.8f, 1.0f};
    boolean t;
    public double u = 0.0d;
    Gene[] v;
    int w;
    c x = null;

    public n(Context context) {
        super(y, true, context);
        Environment environment = new Environment();
        environment.c = 0.0d;
        environment.a = 0.0d;
        environment.f = 0.0d;
        environment.z = 1.0d;
        environment.i = 0.0d;
        environment.x = true;
        environment.g = 75.0d;
        environment.s = 0;
        environment.r = 128;
        environment.k = 1.0d;
        this.p = new CellWorld(true, environment);
        this.b = 0.0f;
        this.c = 0.0f;
        this.d = 8.0f;
        this.u = 0.0d;
        this.e = 1.0f;
        b();
    }

    public final void onSurfaceCreated(GL10 gl10, EGLConfig eGLConfig) {
        GLES20.glClearColor(0.8f, 0.8f, 1.0f, 1.0f);
        this.p.a(this.h);
        a();
    }

    public final void a(float[] fArr) {
        GLES20.glClearColor(0.1254902f, 0.1254902f, 0.1254902f, 0.0f);
        GLES20.glDepthMask(true);
        GLES20.glClear(16640);
        float[] fArr2 = {2.0f / this.f, 0.0f, 0.0f, 0.0f, 0.0f, 2.0f / this.g, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, (-2.0f * this.b) / this.f, (-2.0f * this.c) / this.g, 0.0f, 1.0f};
        float[] fArr3 = new float[16];
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 >= 4) {
                break;
            }
            int i3 = 0;
            while (true) {
                int i4 = i3;
                if (i4 >= 4) {
                    break;
                }
                fArr3[(i4 * 4) + i2] = 0.0f;
                for (int i5 = 0; i5 < 4; i5++) {
                    int i6 = (i4 * 4) + i2;
                    fArr3[i6] = fArr3[i6] + (fArr2[(i4 * 4) + i5] * fArr[(i5 * 4) + i2]);
                }
                i3 = i4 + 1;
            }
            i = i2 + 1;
        }
        if (!this.t) {
            this.p.a();
            if (this.v != null) {
                Cell cell = new Cell();
                cell.I = this.v;
                cell.b = 0.0d;
                cell.c = 0.0d;
                cell.enzyme_splitCount = 0;
                cell.D = 0;
                for (int i7 = 0; i7 < 80; i7++) {
                    if (cell.I[i7].p) {
                        cell.D = i7;
                    }
                }
                cell.w = 0.288d;
                if (cell.I[cell.D].s == h.LIPOCYTE) {
                    cell.S = 1.8f;
                }
                cell.d = Math.sqrt(cell.w / 400.0d);
                cell.J[0] = cell.I[cell.D].a[0];
                cell.J[1] = cell.I[cell.D].a[1];
                cell.J[2] = cell.I[cell.D].a[2];
                cell.J[3] = 1.0f;
                cell.e = 0.0d;
                cell.f = 0.0d;
                cell.l = 0.0d;
                cell.n = 0.0d;
                cell.k = 0.0d;
                cell.m = 0.0d;
                cell.C = 0;
                cell.p = 1.0d;
                cell.T = -1;
                cell.r = 0.0f;
                for (int i8 = 0; i8 < 4; i8++) {
                    cell.U[i8] = 0.01f;
                }
                cell.y = false;
                this.p.a(cell);
            }
            int i9 = 0;
            this.p.Y.setSeed(1337);
            for (int i10 = 0; i10 < ((int) (this.u / 0.02d)) && i9 <= 10; i10++) {
                this.p.a(false, 1.0d);
                if (this.p.z >= 128) {
                    i9++;
                }
            }
            this.p.a(true, 0.0d);
            this.t = true;
        }
        GLES20.glDisable(3042);
        GLES20.glDepthMask(false);
        int i11 = 0;
        while (true) {
            int i12 = i11;
            if (i12 < this.p.z) {
                if (this.p.x[i12].D == this.w) {
                    a(fArr3, (float) this.p.x[i12].b, (float) this.p.x[i12].c, (float) (this.p.x[i12].d + 0.01d), 0.3f);
                }
                i11 = i12 + 1;
            } else {
                this.p.a(this.b - (this.f / 2.0f), this.b + (this.f / 2.0f), this.c - (this.g / 2.0f), this.c + (this.g / 2.0f));
                CellWorld cellWorld = this.p;
                GLES20.glDisable(2929);
                GLES20.glDepthMask(false);
                GLES20.glEnable(3042);
                GLES20.glBlendFunc(770, 771);
                GLES20.glDepthFunc(519);
                cellWorld.b(fArr3);
                GLES20.glEnable(2929);
                GLES20.glDisable(3042);
                GLES20.glDepthMask(true);
                cellWorld.d(fArr3);
                cellWorld.c(fArr3);
                GLES20.glEnable(2929);
                GLES20.glDepthFunc(513);
                GLES20.glEnable(3042);
                GLES20.glDepthMask(false);
                cellWorld.e(fArr3);
                return;
            }
        }
    }

    public final void a(float f, float f2) {
        if (this.l) {
            this.b -= f / this.a;
            this.c += f2 / this.a;
            b();
        }
    }

    public final void a(float f, float f2, float f3) {
        if (this.l) {
            this.d *= f;
            this.b = (float) (((double) this.b) + ((a(f2) - ((double) this.b)) * ((double) (f - 1.0f))));
            this.c = (float) (((double) this.c) + ((b(f3) - ((double) this.c)) * ((double) (f - 1.0f))));
            b();
        }
    }
}
