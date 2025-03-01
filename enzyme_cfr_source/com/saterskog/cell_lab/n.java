/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.opengl.GLES20
 *  javax.microedition.khronos.egl.EGLConfig
 *  javax.microedition.khronos.opengles.GL10
 */
package com.saterskog.cell_lab;

import android.content.Context;
import android.opengl.GLES20;
import com.saterskog.cell_lab.Cell;
import com.saterskog.cell_lab.CellWorld;
import com.saterskog.cell_lab.Environment;
import com.saterskog.cell_lab.Gene;
import com.saterskog.cell_lab.c;
import com.saterskog.cell_lab.d;
import com.saterskog.cell_lab.h;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;

public final class n
extends d {
    private static float y = 1.1f;
    CellWorld p;
    double q;
    double r;
    float[] s = new float[]{0.8f, 0.8f, 1.0f};
    boolean t;
    public double u = 0.0;
    Gene[] v;
    int w;
    c x = null;

    public n(Context object) {
        super(y, true, (Context)object);
        object = new Environment();
        object.c = 0.0;
        object.a = 0.0;
        object.f = 0.0;
        object.z = 1.0;
        object.i = 0.0;
        object.x = true;
        object.g = 75.0;
        object.s = 0;
        object.r = 128;
        object.k = 1.0;
        this.p = new CellWorld(true, (Environment)object);
        this.b = 0.0f;
        this.c = 0.0f;
        this.d = 8.0f;
        this.u = 0.0;
        this.e = 1.0f;
        this.b();
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final void a(float f2, float f3) {
        if (!this.l) {
            return;
        }
        this.b -= f2 / this.a;
        this.c += f3 / this.a;
        this.b();
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final void a(float f2, float f3, float f4) {
        if (!this.l) {
            return;
        }
        this.d *= f2;
        this.b = (float)((double)this.b + (this.a(f3) - (double)this.b) * (double)(f2 - 1.0f));
        this.c = (float)((double)this.c + (this.b(f4) - (double)this.c) * (double)(f2 - 1.0f));
        this.b();
    }

    @Override
    public final void a(float[] object) {
        int n2;
        int n3;
        int n4;
        GLES20.glClearColor((float)0.1254902f, (float)0.1254902f, (float)0.1254902f, (float)0.0f);
        GLES20.glDepthMask((boolean)true);
        GLES20.glClear((int)16640);
        float f2 = 2.0f / this.f;
        float f3 = 2.0f / this.g;
        float f4 = -2.0f * this.b / this.f;
        float f5 = -2.0f * this.c / this.g;
        float[] arrf = new float[16];
        for (n4 = 0; n4 < 4; ++n4) {
            for (n3 = 0; n3 < 4; ++n3) {
                arrf[n3 * 4 + n4] = 0.0f;
                for (n2 = 0; n2 < 4; ++n2) {
                    int n5 = n3 * 4 + n4;
                    arrf[n5] = arrf[n5] + (new float[]{f2, 0.0f, 0.0f, 0.0f, 0.0f, f3, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, f4, f5, 0.0f, 1.0f})[n3 * 4 + n2] * object[n2 * 4 + n4];
                }
            }
        }
        if (!this.t) {
            this.p.a();
            if (this.v != null) {
                object = new Cell();
                ((Cell)object).I = this.v;
                ((Cell)object).b = 0.0;
                ((Cell)object).c = 0.0;
                ((Cell)object).D = 0;
                for (n4 = 0; n4 < 80; ++n4) {
                    if (!object.I[n4].p) continue;
                    ((Cell)object).D = n4;
                }
                ((Cell)object).w = 0.288;
                if (object.I[object.D].s == com.saterskog.cell_lab.h.e) {
                    ((Cell)object).S = 1.8f;
                }
                ((Cell)object).d = Math.sqrt(((Cell)object).w / 400.0);
                object.J[0] = object.I[object.D].a[0];
                object.J[1] = object.I[object.D].a[1];
                object.J[2] = object.I[object.D].a[2];
                object.J[3] = 1.0f;
                ((Cell)object).e = 0.0;
                ((Cell)object).f = 0.0;
                ((Cell)object).l = 0.0;
                ((Cell)object).n = 0.0;
                ((Cell)object).k = 0.0;
                ((Cell)object).m = 0.0;
                ((Cell)object).C = 0;
                ((Cell)object).p = 1.0;
                ((Cell)object).T = -1;
                ((Cell)object).r = 0.0f;
                for (n4 = 0; n4 < 4; ++n4) {
                    object.U[n4] = 0.01f;
                }
                ((Cell)object).y = false;
                this.p.a((Cell)object);
            }
            n4 = 0;
            this.p.Y.setSeed(1337L);
            for (n3 = 0; n3 < (int)(this.u / 0.02) && n4 <= 10; ++n3) {
                this.p.a(false, 1.0);
                n2 = n4;
                if (this.p.z >= 128) {
                    n2 = n4 + 1;
                }
                n4 = n2;
            }
            this.p.a(true, 0.0);
            this.t = true;
        }
        GLES20.glDisable((int)3042);
        GLES20.glDepthMask((boolean)false);
        for (n4 = 0; n4 < this.p.z; ++n4) {
            if (this.p.x[n4].D != this.w) continue;
            this.a(arrf, (float)this.p.x[n4].b, (float)this.p.x[n4].c, (float)(this.p.x[n4].d + 0.01), 0.3f);
        }
        this.p.a(this.b - this.f / 2.0f, this.b + this.f / 2.0f, this.c - this.g / 2.0f, this.c + this.g / 2.0f);
        object = this.p;
        GLES20.glDisable((int)2929);
        GLES20.glDepthMask((boolean)false);
        GLES20.glEnable((int)3042);
        GLES20.glBlendFunc((int)770, (int)771);
        GLES20.glDepthFunc((int)519);
        ((CellWorld)object).b(arrf);
        GLES20.glEnable((int)2929);
        GLES20.glDisable((int)3042);
        GLES20.glDepthMask((boolean)true);
        ((CellWorld)object).d(arrf);
        ((CellWorld)object).c(arrf);
        GLES20.glEnable((int)2929);
        GLES20.glDepthFunc((int)513);
        GLES20.glEnable((int)3042);
        GLES20.glDepthMask((boolean)false);
        ((CellWorld)object).e(arrf);
    }

    public final void onSurfaceCreated(GL10 gL10, EGLConfig eGLConfig) {
        GLES20.glClearColor((float)0.8f, (float)0.8f, (float)1.0f, (float)1.0f);
        this.p.a(this.h);
        this.a();
    }
}

