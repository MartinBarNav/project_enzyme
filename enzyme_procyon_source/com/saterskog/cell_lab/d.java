// 
// Decompiled by Procyon v0.5.36
// 

package com.saterskog.cell_lab;

import javax.microedition.khronos.opengles.GL10;
import android.app.Activity;
import android.widget.Toast;
import java.nio.Buffer;
import android.opengl.GLES20;
import com.saterskog.b.c;
import java.nio.ByteOrder;
import java.nio.ByteBuffer;
import com.saterskog.b.a;
import android.preference.PreferenceManager;
import java.nio.ShortBuffer;
import java.nio.FloatBuffer;
import android.content.Context;
import android.opengl.GLSurfaceView$Renderer;

public abstract class d implements GLSurfaceView$Renderer
{
    private int A;
    private int B;
    private int C;
    private int D;
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
    double k;
    protected boolean l;
    float[] m;
    double n;
    double o;
    private float[] p;
    private float[] q;
    private FloatBuffer r;
    private FloatBuffer s;
    private int t;
    private int u;
    private ShortBuffer v;
    private int w;
    private int x;
    private boolean y;
    private float z;
    
    protected d(final float z, final boolean e, final Context h) {
        this.y = false;
        this.B = -1;
        this.C = -1;
        this.D = -1;
        this.k = -2.0;
        this.m = new float[16];
        this.n = 1.0 / Math.sqrt(5.0);
        this.o = 2.0 * this.n;
        this.h = h;
        this.E = e;
        final String string = PreferenceManager.getDefaultSharedPreferences(h).getString("aa_mode", "none");
        this.k = -2.0;
        if (string.equals("none")) {
            this.k = -1.0;
        }
        if (string.equals("1.5")) {
            this.k = 1.5;
        }
        if (string.equals("2.0")) {
            this.k = 2.0;
        }
        if (string.equals("3.0")) {
            this.k = 3.0;
        }
        if (string.equals("4.0")) {
            this.k = 4.0;
        }
        if (this.k == -2.0) {
            com.saterskog.b.a.a("Setting aa_mode was: " + string);
        }
        this.z = z;
        (this.p = new float[12])[0] = 1.1f;
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
        final ByteBuffer allocateDirect = ByteBuffer.allocateDirect(48);
        allocateDirect.order(ByteOrder.nativeOrder());
        (this.r = allocateDirect.asFloatBuffer()).put(this.p, 0, 12);
        this.r.position(0);
        final short[] src = new short[6];
        for (int i = 0; i < 6; i = (short)(i + 1)) {
            src[i] = (short)i;
        }
        final ByteBuffer allocateDirect2 = ByteBuffer.allocateDirect(24);
        allocateDirect2.order(ByteOrder.nativeOrder());
        (this.v = allocateDirect2.asShortBuffer()).put(src);
        this.v.position(0);
        this.l = false;
    }
    
    public final double a(final float n) {
        return this.b + (n / this.x - 0.5) * this.f;
    }
    
    protected final void a() {
        this.A = com.saterskog.b.c.a(this.h, 2131558434, 2131558433);
        this.t = GLES20.glGetAttribLocation(this.A, "vPosition");
        this.u = GLES20.glGetAttribLocation(this.A, "vCenter");
        if (this.k > 0.0) {
            this.F = com.saterskog.b.c.a(this.h, 2131558401, 2131558400);
            this.G = GLES20.glGetAttribLocation(this.F, "vPosition");
            this.H = GLES20.glGetUniformLocation(this.F, "tex1");
            this.I = GLES20.glGetUniformLocation(this.F, "invTexSize");
        }
    }
    
    protected abstract void a(final float[] p0);
    
    protected final void a(final float[] array, final float n, final float n2, final float n3, final float n4) {
        this.p = new float[24];
        for (int i = 0; i < 6; ++i) {
            this.p[i * 4 + 0] = n;
            this.p[i * 4 + 1] = n2;
            this.p[i * 4 + 2] = n3;
            this.p[i * 4 + 3] = n4;
        }
        final ByteBuffer allocateDirect = ByteBuffer.allocateDirect(96);
        allocateDirect.order(ByteOrder.nativeOrder());
        final FloatBuffer floatBuffer = allocateDirect.asFloatBuffer();
        floatBuffer.put(this.p, 0, 24);
        floatBuffer.position(0);
        GLES20.glUseProgram(this.A);
        GLES20.glEnableVertexAttribArray(this.t);
        GLES20.glEnableVertexAttribArray(this.u);
        final int glGetUniformLocation = GLES20.glGetUniformLocation(this.A, "uMVPMatrix");
        GLES20.glVertexAttribPointer(this.t, 2, 5126, false, 8, (Buffer)this.r);
        GLES20.glVertexAttribPointer(this.u, 4, 5126, false, 16, (Buffer)floatBuffer);
        GLES20.glUniformMatrix4fv(glGetUniformLocation, 1, false, array, 0);
        GLES20.glDrawElements(4, 6, 5123, (Buffer)this.v);
        GLES20.glDisableVertexAttribArray(this.t);
        GLES20.glDisableVertexAttribArray(this.u);
    }
    
    public final double b(final float n) {
        return this.c + (0.5 - n / this.w) * this.g;
    }
    
    protected final void b() {
        if (this.d < 1.0f / this.z) {
            this.d = 1.0f / this.z;
        }
        if (this.d > 300000.0f) {
            this.d = 300000.0f;
            if (!this.y) {
                Toast.makeText(this.h, (CharSequence)this.h.getString(2131624351), 1).show();
                this.y = true;
            }
        }
        final float d = this.d;
        float n;
        if (this.x < this.w) {
            n = this.x / 2.0f;
        }
        else {
            n = this.w / 2.0f;
        }
        this.a = n * d;
        this.f = this.x / this.a;
        this.g = this.w / this.a;
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
    
    public void onDrawFrame(final GL10 gl10) {
        if (this.k > 0.0) {
            GLES20.glBindFramebuffer(36160, this.B);
            GLES20.glViewport(0, 0, this.i, this.j);
            this.m[0] = (float)(this.o * this.x * this.k / this.i);
            this.m[1] = -(float)(this.n * this.x * this.k / this.j);
            this.m[2] = 0.0f;
            this.m[3] = 0.0f;
            this.m[4] = (float)(this.n * this.w * this.k / this.i);
            this.m[5] = (float)(this.o * this.w * this.k / this.j);
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
            GLES20.glBindFramebuffer(36160, 0);
            GLES20.glViewport(0, 0, this.x, this.w);
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
            GLES20.glDisable(2929);
            GLES20.glDisable(3042);
            GLES20.glUseProgram(this.F);
            GLES20.glActiveTexture(33984);
            GLES20.glBindTexture(3553, this.C);
            GLES20.glUniform1i(this.H, 0);
            final int glGetUniformLocation = GLES20.glGetUniformLocation(this.F, "uMVPMatrix");
            GLES20.glEnableVertexAttribArray(this.G);
            GLES20.glVertexAttribPointer(this.G, 4, 5126, false, 16, (Buffer)this.s);
            GLES20.glUniformMatrix4fv(glGetUniformLocation, 1, false, this.m, 0);
            if (this.k == 1.5) {
                GLES20.glUniform2f(this.I, 1.0f / this.i, 1.0f / this.j);
            }
            if (this.k == 2.0) {
                GLES20.glUniform2f(this.I, 1.0f / this.i, 1.0f / this.j);
            }
            if (this.k == 3.0) {
                GLES20.glUniform2f(this.I, 1.5f / this.i, 1.5f / this.j);
            }
            if (this.k == 4.0) {
                GLES20.glUniform2f(this.I, 2.0f / this.i, 2.0f / this.j);
            }
            GLES20.glDrawElements(4, 6, 5123, (Buffer)this.v);
            GLES20.glDisableVertexAttribArray(this.G);
        }
        else {
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
    }
    
    public void onSurfaceChanged(final GL10 gl10, final int x, final int w) {
        this.x = x;
        this.w = w;
        this.l = true;
        if (this.k > 0.0) {
            this.i = (int)Math.ceil((this.o * this.x + this.n * this.w) * this.k);
            this.j = (int)Math.ceil((this.o * this.w + this.n * this.x) * this.k);
            (this.q = new float[24])[0] = 1.0f;
            this.q[1] = 1.0f;
            this.q[2] = 1.0f;
            this.q[3] = 1.0f - (float)(this.x * this.k * this.n) / this.j;
            this.q[4] = 1.0f;
            this.q[5] = -1.0f;
            this.q[6] = 1.0f - (float)(this.w * this.k * this.n) / this.i;
            this.q[7] = 0.0f;
            this.q[8] = -1.0f;
            this.q[9] = -1.0f;
            this.q[10] = 0.0f;
            this.q[11] = (float)(this.x * this.k * this.n) / this.j;
            this.q[12] = -1.0f;
            this.q[13] = -1.0f;
            this.q[14] = 0.0f;
            this.q[15] = (float)(this.x * this.k * this.n) / this.j;
            this.q[16] = -1.0f;
            this.q[17] = 1.0f;
            this.q[18] = (float)(this.w * this.k * this.n) / this.i;
            this.q[19] = 1.0f;
            this.q[20] = 1.0f;
            this.q[21] = 1.0f;
            this.q[22] = 1.0f;
            this.q[23] = 1.0f - (float)(this.x * this.k * this.n) / this.j;
            final ByteBuffer allocateDirect = ByteBuffer.allocateDirect(96);
            allocateDirect.order(ByteOrder.nativeOrder());
            (this.s = allocateDirect.asFloatBuffer()).put(this.q, 0, 24);
            this.s.position(0);
            final boolean e = this.E;
            final int[] array = { 0 };
            GLES20.glGenFramebuffers(1, array, 0);
            this.B = array[0];
            GLES20.glGenTextures(1, array, 0);
            this.C = array[0];
            GLES20.glGenRenderbuffers(1, array, 0);
            this.D = array[0];
            GLES20.glBindFramebuffer(36160, this.B);
            GLES20.glBindTexture(3553, this.C);
            if (e) {
                GLES20.glTexImage2D(3553, 0, 6408, this.i, this.j, 0, 6408, 5121, (Buffer)null);
            }
            else {
                GLES20.glTexImage2D(3553, 0, 6407, this.i, this.j, 0, 6407, 5121, (Buffer)null);
            }
            if (GLES20.glGetError() != 0) {
                if (this.h instanceof Activity) {
                    ((Activity)this.h).runOnUiThread((Runnable)new Runnable() {
                        @Override
                        public final void run() {
                            Toast.makeText(com.saterskog.cell_lab.d.this.h, (CharSequence)"Not enough graphics memory for selected AA mode", 1).show();
                        }
                    });
                }
                this.k = -1.0;
                GLES20.glBindTexture(3553, 0);
                GLES20.glBindRenderbuffer(36161, 0);
                GLES20.glBindFramebuffer(36160, 0);
            }
            else {
                GLES20.glTexParameteri(3553, 10242, 33071);
                GLES20.glTexParameteri(3553, 10243, 33071);
                GLES20.glTexParameteri(3553, 10240, 9729);
                GLES20.glTexParameteri(3553, 10241, 9729);
                GLES20.glBindRenderbuffer(36161, this.D);
                GLES20.glRenderbufferStorage(36161, 33189, this.i, this.j);
                GLES20.glFramebufferTexture2D(36160, 36064, 3553, this.C, 0);
                GLES20.glFramebufferRenderbuffer(36160, 36096, 36161, this.D);
                GLES20.glBindTexture(3553, 0);
                GLES20.glBindRenderbuffer(36161, 0);
                GLES20.glBindFramebuffer(36160, 0);
            }
        }
        this.b();
        GLES20.glViewport(0, 0, x, w);
    }
}
