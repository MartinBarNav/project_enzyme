/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.content.Context
 *  android.opengl.GLES20
 *  android.opengl.GLSurfaceView$Renderer
 *  android.preference.PreferenceManager
 *  android.widget.Toast
 *  javax.microedition.khronos.opengles.GL10
 */
package com.saterskog.cell_lab;

import android.app.Activity;
import android.content.Context;
import android.opengl.GLES20;
import android.opengl.GLSurfaceView;
import android.preference.PreferenceManager;
import android.widget.Toast;
import com.saterskog.b.a;
import com.saterskog.b.c;
import com.saterskog.cell_lab.t;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import java.nio.ShortBuffer;
import javax.microedition.khronos.opengles.GL10;

public abstract class d
implements GLSurfaceView.Renderer {
    private int A;
    private int B = -1;
    private int C = -1;
    private int D = -1;
    private boolean E;
    private int F;
    private int G;
    private int H;
    private int I;
    protected float a;
    public float b;
    public float c;
    public float d;
    public float e;
    public float f;
    public float g;
    Context h;
    int i;
    int j;
    double k = -2.0;
    protected boolean l;
    float[] m = new float[16];
    double n = 1.0 / Math.sqrt(5.0);
    double o = 2.0 * this.n;
    private float[] p;
    private float[] q;
    private FloatBuffer r;
    private FloatBuffer s;
    private int t;
    private int u;
    private ShortBuffer v;
    private int w;
    private int x;
    private boolean y = false;
    private float z;

    protected d(float f2, boolean bl, Context object) {
        this.h = object;
        this.E = bl;
        object = PreferenceManager.getDefaultSharedPreferences((Context)object).getString("aa_mode", "none");
        this.k = -2.0;
        if (object.equals("none")) {
            this.k = -1.0;
        }
        if (object.equals("1.5")) {
            this.k = 1.5;
        }
        if (object.equals("2.0")) {
            this.k = 2.0;
        }
        if (object.equals("3.0")) {
            this.k = 3.0;
        }
        if (object.equals("4.0")) {
            this.k = 4.0;
        }
        if (this.k == -2.0) {
            com.saterskog.b.a.a("Setting aa_mode was: " + (String)object);
        }
        this.z = f2;
        this.p = new float[12];
        this.p[0] = 1.1f;
        this.p[1] = 1.1f;
        this.p[2] = 1.1f;
        this.p[3] = -1.1f;
        this.p[4] = -1.1f;
        this.p[5] = -1.1f;
        this.p[6] = -1.1f;
        this.p[7] = -1.1f;
        this.p[8] = -1.1f;
        this.p[9] = 1.1f;
        this.p[10] = 1.1f;
        this.p[11] = 1.1f;
        object = ByteBuffer.allocateDirect(48);
        object.order(ByteOrder.nativeOrder());
        this.r = object.asFloatBuffer();
        this.r.put(this.p, 0, 12);
        this.r.position(0);
        object = new short[6];
        for (int n2 = 0; n2 < 6; n2 = (int)((short)(n2 + 1))) {
            object[n2] = (Context)((short)n2);
        }
        ByteBuffer byteBuffer = ByteBuffer.allocateDirect(24);
        byteBuffer.order(ByteOrder.nativeOrder());
        this.v = byteBuffer.asShortBuffer();
        this.v.put((short[])object);
        this.v.position(0);
        this.l = false;
    }

    public final double a(float f2) {
        return (double)this.b + ((double)(f2 / (float)this.x) - 0.5) * (double)this.f;
    }

    protected final void a() {
        this.A = com.saterskog.b.c.a(this.h, 2131558434, 2131558433);
        this.t = GLES20.glGetAttribLocation((int)this.A, (String)"vPosition");
        this.u = GLES20.glGetAttribLocation((int)this.A, (String)"vCenter");
        if (this.k > 0.0) {
            this.F = com.saterskog.b.c.a(this.h, 2131558401, 2131558400);
            this.G = GLES20.glGetAttribLocation((int)this.F, (String)"vPosition");
            this.H = GLES20.glGetUniformLocation((int)this.F, (String)"tex1");
            this.I = GLES20.glGetUniformLocation((int)this.F, (String)"invTexSize");
        }
    }

    protected abstract void a(float[] var1);

    protected final void a(float[] arrf, float f2, float f3, float f4, float f5) {
        int n2;
        this.p = new float[24];
        for (n2 = 0; n2 < 6; ++n2) {
            this.p[n2 * 4 + 0] = f2;
            this.p[n2 * 4 + 1] = f3;
            this.p[n2 * 4 + 2] = f4;
            this.p[n2 * 4 + 3] = f5;
        }
        Buffer buffer = ByteBuffer.allocateDirect(96);
        ((ByteBuffer)buffer).order(ByteOrder.nativeOrder());
        buffer = ((ByteBuffer)buffer).asFloatBuffer();
        ((FloatBuffer)buffer).put(this.p, 0, 24);
        ((FloatBuffer)buffer).position(0);
        GLES20.glUseProgram((int)this.A);
        GLES20.glEnableVertexAttribArray((int)this.t);
        GLES20.glEnableVertexAttribArray((int)this.u);
        n2 = GLES20.glGetUniformLocation((int)this.A, (String)"uMVPMatrix");
        GLES20.glVertexAttribPointer((int)this.t, (int)2, (int)5126, (boolean)false, (int)8, (Buffer)this.r);
        GLES20.glVertexAttribPointer((int)this.u, (int)4, (int)5126, (boolean)false, (int)16, (Buffer)buffer);
        GLES20.glUniformMatrix4fv((int)n2, (int)1, (boolean)false, (float[])arrf, (int)0);
        GLES20.glDrawElements((int)4, (int)6, (int)5123, (Buffer)this.v);
        GLES20.glDisableVertexAttribArray((int)this.t);
        GLES20.glDisableVertexAttribArray((int)this.u);
    }

    public final double b(float f2) {
        return (double)this.c + (0.5 - (double)(f2 / (float)this.w)) * (double)this.g;
    }

    /*
     * Enabled aggressive block sorting
     */
    protected final void b() {
        if (this.d < 1.0f / this.z) {
            this.d = 1.0f / this.z;
        }
        if (this.d > 300000.0f) {
            this.d = 300000.0f;
            if (!this.y) {
                Toast.makeText((Context)this.h, (CharSequence)this.h.getString(2131624351), (int)1).show();
                this.y = true;
            }
        }
        float f2 = this.d;
        float f3 = this.x < this.w ? (float)this.x / 2.0f : (float)this.w / 2.0f;
        this.a = f3 * f2;
        this.f = (float)this.x / this.a;
        this.g = (float)this.w / this.a;
        if (this.b < -Math.abs(-this.z + this.f / 2.0f)) {
            this.b = -Math.abs(-this.z + this.f / 2.0f);
        }
        if (this.b > Math.abs(-this.z + this.f / 2.0f)) {
            this.b = Math.abs(-this.z + this.f / 2.0f);
        }
        if (this.c < -Math.abs(-this.z + this.g / 2.0f)) {
            this.c = -Math.abs(-this.z + this.g / 2.0f);
        }
        if (this.c > Math.abs(-this.z + this.g / 2.0f)) {
            this.c = Math.abs(-this.z + this.g / 2.0f);
            com.saterskog.cell_lab.t.b((Activity)this.h, 0, 2);
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public void onDrawFrame(GL10 gL10) {
        if (this.k > 0.0) {
            GLES20.glBindFramebuffer((int)36160, (int)this.B);
            GLES20.glViewport((int)0, (int)0, (int)this.i, (int)this.j);
            this.m[0] = (float)(this.o * (double)this.x * this.k / (double)this.i);
            this.m[1] = -((float)(this.n * (double)this.x * this.k / (double)this.j));
            this.m[2] = 0.0f;
            this.m[3] = 0.0f;
            this.m[4] = (float)(this.n * (double)this.w * this.k / (double)this.i);
            this.m[5] = (float)(this.o * (double)this.w * this.k / (double)this.j);
            this.m[6] = 0.0f;
            this.m[7] = 0.0f;
            this.m[8] = 0.0f;
            this.m[9] = 0.0f;
            this.m[10] = 1.0f;
            this.m[11] = 0.0f;
            this.m[12] = 0.0f;
            this.m[13] = 0.0f;
            this.m[14] = 0.0f;
            this.m[15] = 1.0f;
            this.a(this.m);
            GLES20.glBindFramebuffer((int)36160, (int)0);
            GLES20.glViewport((int)0, (int)0, (int)this.x, (int)this.w);
            this.m[0] = 1.0f;
            this.m[1] = 0.0f;
            this.m[2] = 0.0f;
            this.m[3] = 0.0f;
            this.m[4] = 0.0f;
            this.m[5] = 1.0f;
            this.m[6] = 0.0f;
            this.m[7] = 0.0f;
            this.m[8] = 0.0f;
            this.m[9] = 0.0f;
            this.m[10] = 1.0f;
            this.m[11] = 0.0f;
            this.m[12] = 0.0f;
            this.m[13] = 0.0f;
            this.m[14] = 0.0f;
            this.m[15] = 1.0f;
            GLES20.glDisable((int)2929);
            GLES20.glDisable((int)3042);
            GLES20.glUseProgram((int)this.F);
            GLES20.glActiveTexture((int)33984);
            GLES20.glBindTexture((int)3553, (int)this.C);
            GLES20.glUniform1i((int)this.H, (int)0);
            int n2 = GLES20.glGetUniformLocation((int)this.F, (String)"uMVPMatrix");
            GLES20.glEnableVertexAttribArray((int)this.G);
            GLES20.glVertexAttribPointer((int)this.G, (int)4, (int)5126, (boolean)false, (int)16, (Buffer)this.s);
            GLES20.glUniformMatrix4fv((int)n2, (int)1, (boolean)false, (float[])this.m, (int)0);
            if (this.k == 1.5) {
                GLES20.glUniform2f((int)this.I, (float)(1.0f / (float)this.i), (float)(1.0f / (float)this.j));
            }
            if (this.k == 2.0) {
                GLES20.glUniform2f((int)this.I, (float)(1.0f / (float)this.i), (float)(1.0f / (float)this.j));
            }
            if (this.k == 3.0) {
                GLES20.glUniform2f((int)this.I, (float)(1.5f / (float)this.i), (float)(1.5f / (float)this.j));
            }
            if (this.k == 4.0) {
                GLES20.glUniform2f((int)this.I, (float)(2.0f / (float)this.i), (float)(2.0f / (float)this.j));
            }
            GLES20.glDrawElements((int)4, (int)6, (int)5123, (Buffer)this.v);
            GLES20.glDisableVertexAttribArray((int)this.G);
            return;
        }
        this.m[0] = 1.0f;
        this.m[1] = 0.0f;
        this.m[2] = 0.0f;
        this.m[3] = 0.0f;
        this.m[4] = 0.0f;
        this.m[5] = 1.0f;
        this.m[6] = 0.0f;
        this.m[7] = 0.0f;
        this.m[8] = 0.0f;
        this.m[9] = 0.0f;
        this.m[10] = 1.0f;
        this.m[11] = 0.0f;
        this.m[12] = 0.0f;
        this.m[13] = 0.0f;
        this.m[14] = 0.0f;
        this.m[15] = 1.0f;
        this.a(this.m);
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     */
    public void onSurfaceChanged(GL10 object, int n2, int n3) {
        void var3_5;
        void var2_4;
        this.x = var2_4;
        this.w = var3_5;
        this.l = true;
        if (this.k > 0.0) {
            this.i = (int)Math.ceil((this.o * (double)this.x + this.n * (double)this.w) * this.k);
            this.j = (int)Math.ceil((this.o * (double)this.w + this.n * (double)this.x) * this.k);
            this.q = new float[24];
            this.q[0] = 1.0f;
            this.q[1] = 1.0f;
            this.q[2] = 1.0f;
            this.q[3] = 1.0f - (float)((double)this.x * this.k * this.n) / (float)this.j;
            this.q[4] = 1.0f;
            this.q[5] = -1.0f;
            this.q[6] = 1.0f - (float)((double)this.w * this.k * this.n) / (float)this.i;
            this.q[7] = 0.0f;
            this.q[8] = -1.0f;
            this.q[9] = -1.0f;
            this.q[10] = 0.0f;
            this.q[11] = (float)((double)this.x * this.k * this.n) / (float)this.j;
            this.q[12] = -1.0f;
            this.q[13] = -1.0f;
            this.q[14] = 0.0f;
            this.q[15] = (float)((double)this.x * this.k * this.n) / (float)this.j;
            this.q[16] = -1.0f;
            this.q[17] = 1.0f;
            this.q[18] = (float)((double)this.w * this.k * this.n) / (float)this.i;
            this.q[19] = 1.0f;
            this.q[20] = 1.0f;
            this.q[21] = 1.0f;
            this.q[22] = 1.0f;
            this.q[23] = 1.0f - (float)((double)this.x * this.k * this.n) / (float)this.j;
            ByteBuffer byteBuffer = ByteBuffer.allocateDirect(96);
            byteBuffer.order(ByteOrder.nativeOrder());
            this.s = byteBuffer.asFloatBuffer();
            this.s.put(this.q, 0, 24);
            this.s.position(0);
            boolean bl = this.E;
            int[] arrn = new int[1];
            GLES20.glGenFramebuffers((int)1, (int[])arrn, (int)0);
            this.B = arrn[0];
            GLES20.glGenTextures((int)1, (int[])arrn, (int)0);
            this.C = arrn[0];
            GLES20.glGenRenderbuffers((int)1, (int[])arrn, (int)0);
            this.D = arrn[0];
            GLES20.glBindFramebuffer((int)36160, (int)this.B);
            GLES20.glBindTexture((int)3553, (int)this.C);
            if (bl) {
                GLES20.glTexImage2D((int)3553, (int)0, (int)6408, (int)this.i, (int)this.j, (int)0, (int)6408, (int)5121, null);
            } else {
                GLES20.glTexImage2D((int)3553, (int)0, (int)6407, (int)this.i, (int)this.j, (int)0, (int)6407, (int)5121, null);
            }
            if (GLES20.glGetError() != 0) {
                if (this.h instanceof Activity) {
                    ((Activity)this.h).runOnUiThread(new Runnable(){

                        @Override
                        public final void run() {
                            Toast.makeText((Context)d.this.h, (CharSequence)"Not enough graphics memory for selected AA mode", (int)1).show();
                        }
                    });
                }
                this.k = -1.0;
                GLES20.glBindTexture((int)3553, (int)0);
                GLES20.glBindRenderbuffer((int)36161, (int)0);
                GLES20.glBindFramebuffer((int)36160, (int)0);
            } else {
                GLES20.glTexParameteri((int)3553, (int)10242, (int)33071);
                GLES20.glTexParameteri((int)3553, (int)10243, (int)33071);
                GLES20.glTexParameteri((int)3553, (int)10240, (int)9729);
                GLES20.glTexParameteri((int)3553, (int)10241, (int)9729);
                GLES20.glBindRenderbuffer((int)36161, (int)this.D);
                GLES20.glRenderbufferStorage((int)36161, (int)33189, (int)this.i, (int)this.j);
                GLES20.glFramebufferTexture2D((int)36160, (int)36064, (int)3553, (int)this.C, (int)0);
                GLES20.glFramebufferRenderbuffer((int)36160, (int)36096, (int)36161, (int)this.D);
                GLES20.glBindTexture((int)3553, (int)0);
                GLES20.glBindRenderbuffer((int)36161, (int)0);
                GLES20.glBindFramebuffer((int)36160, (int)0);
            }
        }
        this.b();
        GLES20.glViewport((int)0, (int)0, (int)var2_4, (int)var3_5);
    }
}

