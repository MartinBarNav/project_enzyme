package com.saterskog.cell_lab;

import android.app.Activity;
import android.content.Context;
import android.opengl.GLES20;
import android.opengl.GLSurfaceView;
import android.preference.PreferenceManager;
import android.widget.Toast;
import com.saterskog.b.a;
import com.saterskog.b.c;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import java.nio.ShortBuffer;
import javax.microedition.khronos.opengles.GL10;

public abstract class d implements GLSurfaceView.Renderer {
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
    double k = -2.0d;
    protected boolean l;
    float[] m = new float[16];
    double n = (1.0d / Math.sqrt(5.0d));
    double o = (2.0d * this.n);
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

    /* access modifiers changed from: protected */
    public abstract void a(float[] fArr);

    protected d(float f2, boolean z2, Context context) {
        this.h = context;
        this.E = z2;
        String string = PreferenceManager.getDefaultSharedPreferences(context).getString("aa_mode", "none");
        this.k = -2.0d;
        if (string.equals("none")) {
            this.k = -1.0d;
        }
        if (string.equals("1.5")) {
            this.k = 1.5d;
        }
        if (string.equals("2.0")) {
            this.k = 2.0d;
        }
        if (string.equals("3.0")) {
            this.k = 3.0d;
        }
        if (string.equals("4.0")) {
            this.k = 4.0d;
        }
        if (this.k == -2.0d) {
            a.a("Setting aa_mode was: " + string);
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
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(48);
        allocateDirect.order(ByteOrder.nativeOrder());
        this.r = allocateDirect.asFloatBuffer();
        this.r.put(this.p, 0, 12);
        this.r.position(0);
        short[] sArr = new short[6];
        for (short s2 = 0; s2 < 6; s2 = (short) (s2 + 1)) {
            sArr[s2] = s2;
        }
        ByteBuffer allocateDirect2 = ByteBuffer.allocateDirect(24);
        allocateDirect2.order(ByteOrder.nativeOrder());
        this.v = allocateDirect2.asShortBuffer();
        this.v.put(sArr);
        this.v.position(0);
        this.l = false;
    }

    /* access modifiers changed from: protected */
    public final void a() {
        this.A = c.a(this.h, (int) C0028R.raw.marker_vert, (int) C0028R.raw.marker_frag);
        this.t = GLES20.glGetAttribLocation(this.A, "vPosition");
        this.u = GLES20.glGetAttribLocation(this.A, "vCenter");
        if (this.k > 0.0d) {
            this.F = c.a(this.h, (int) C0028R.raw.aa_vert, (int) C0028R.raw.aa_frag);
            this.G = GLES20.glGetAttribLocation(this.F, "vPosition");
            this.H = GLES20.glGetUniformLocation(this.F, "tex1");
            this.I = GLES20.glGetUniformLocation(this.F, "invTexSize");
        }
    }

    public void onDrawFrame(GL10 gl10) {
        if (this.k > 0.0d) {
            GLES20.glBindFramebuffer(36160, this.B);
            GLES20.glViewport(0, 0, this.i, this.j);
            this.m[0] = (float) (((this.o * ((double) this.x)) * this.k) / ((double) this.i));
            this.m[1] = -((float) (((this.n * ((double) this.x)) * this.k) / ((double) this.j)));
            this.m[2] = 0.0f;
            this.m[3] = 0.0f;
            this.m[4] = (float) (((this.n * ((double) this.w)) * this.k) / ((double) this.i));
            this.m[5] = (float) (((this.o * ((double) this.w)) * this.k) / ((double) this.j));
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
            a(this.m);
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
            int glGetUniformLocation = GLES20.glGetUniformLocation(this.F, "uMVPMatrix");
            GLES20.glEnableVertexAttribArray(this.G);
            GLES20.glVertexAttribPointer(this.G, 4, 5126, false, 16, this.s);
            GLES20.glUniformMatrix4fv(glGetUniformLocation, 1, false, this.m, 0);
            if (this.k == 1.5d) {
                GLES20.glUniform2f(this.I, 1.0f / ((float) this.i), 1.0f / ((float) this.j));
            }
            if (this.k == 2.0d) {
                GLES20.glUniform2f(this.I, 1.0f / ((float) this.i), 1.0f / ((float) this.j));
            }
            if (this.k == 3.0d) {
                GLES20.glUniform2f(this.I, 1.5f / ((float) this.i), 1.5f / ((float) this.j));
            }
            if (this.k == 4.0d) {
                GLES20.glUniform2f(this.I, 2.0f / ((float) this.i), 2.0f / ((float) this.j));
            }
            GLES20.glDrawElements(4, 6, 5123, this.v);
            GLES20.glDisableVertexAttribArray(this.G);
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
        a(this.m);
    }

    /* access modifiers changed from: protected */
    public final void b() {
        if (this.d < 1.0f / this.z) {
            this.d = 1.0f / this.z;
        }
        if (this.d > 300000.0f) {
            this.d = 300000.0f;
            if (!this.y) {
                Toast.makeText(this.h, this.h.getString(C0028R.string.toast_zoom_max), 1).show();
                this.y = true;
            }
        }
        this.a = (this.x < this.w ? ((float) this.x) / 2.0f : ((float) this.w) / 2.0f) * this.d;
        this.f = ((float) this.x) / this.a;
        this.g = ((float) this.w) / this.a;
        if (this.b < (-Math.abs((-this.z) + (this.f / 2.0f)))) {
            this.b = -Math.abs((-this.z) + (this.f / 2.0f));
        }
        if (this.b > Math.abs((-this.z) + (this.f / 2.0f))) {
            this.b = Math.abs((-this.z) + (this.f / 2.0f));
        }
        if (this.c < (-Math.abs((-this.z) + (this.g / 2.0f)))) {
            this.c = -Math.abs((-this.z) + (this.g / 2.0f));
        }
        if (this.c > Math.abs((-this.z) + (this.g / 2.0f))) {
            this.c = Math.abs((-this.z) + (this.g / 2.0f));
            t.b((Activity) this.h, 0, 2);
        }
    }

    public final double a(float f2) {
        return ((double) this.b) + ((((double) (f2 / ((float) this.x))) - 0.5d) * ((double) this.f));
    }

    public final double b(float f2) {
        return ((double) this.c) + ((0.5d - ((double) (f2 / ((float) this.w)))) * ((double) this.g));
    }

    /* access modifiers changed from: protected */
    public final void a(float[] fArr, float f2, float f3, float f4, float f5) {
        this.p = new float[24];
        for (int i2 = 0; i2 < 6; i2++) {
            this.p[(i2 * 4) + 0] = f2;
            this.p[(i2 * 4) + 1] = f3;
            this.p[(i2 * 4) + 2] = f4;
            this.p[(i2 * 4) + 3] = f5;
        }
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(96);
        allocateDirect.order(ByteOrder.nativeOrder());
        FloatBuffer asFloatBuffer = allocateDirect.asFloatBuffer();
        asFloatBuffer.put(this.p, 0, 24);
        asFloatBuffer.position(0);
        GLES20.glUseProgram(this.A);
        GLES20.glEnableVertexAttribArray(this.t);
        GLES20.glEnableVertexAttribArray(this.u);
        int glGetUniformLocation = GLES20.glGetUniformLocation(this.A, "uMVPMatrix");
        GLES20.glVertexAttribPointer(this.t, 2, 5126, false, 8, this.r);
        GLES20.glVertexAttribPointer(this.u, 4, 5126, false, 16, asFloatBuffer);
        GLES20.glUniformMatrix4fv(glGetUniformLocation, 1, false, fArr, 0);
        GLES20.glDrawElements(4, 6, 5123, this.v);
        GLES20.glDisableVertexAttribArray(this.t);
        GLES20.glDisableVertexAttribArray(this.u);
    }

    public void onSurfaceChanged(GL10 gl10, int i2, int i3) {
        this.x = i2;
        this.w = i3;
        this.l = true;
        if (this.k > 0.0d) {
            this.i = (int) Math.ceil(((this.o * ((double) this.x)) + (this.n * ((double) this.w))) * this.k);
            this.j = (int) Math.ceil(((this.o * ((double) this.w)) + (this.n * ((double) this.x))) * this.k);
            this.q = new float[24];
            this.q[0] = 1.0f;
            this.q[1] = 1.0f;
            this.q[2] = 1.0f;
            this.q[3] = 1.0f - (((float) ((((double) this.x) * this.k) * this.n)) / ((float) this.j));
            this.q[4] = 1.0f;
            this.q[5] = -1.0f;
            this.q[6] = 1.0f - (((float) ((((double) this.w) * this.k) * this.n)) / ((float) this.i));
            this.q[7] = 0.0f;
            this.q[8] = -1.0f;
            this.q[9] = -1.0f;
            this.q[10] = 0.0f;
            this.q[11] = ((float) ((((double) this.x) * this.k) * this.n)) / ((float) this.j);
            this.q[12] = -1.0f;
            this.q[13] = -1.0f;
            this.q[14] = 0.0f;
            this.q[15] = ((float) ((((double) this.x) * this.k) * this.n)) / ((float) this.j);
            this.q[16] = -1.0f;
            this.q[17] = 1.0f;
            this.q[18] = ((float) ((((double) this.w) * this.k) * this.n)) / ((float) this.i);
            this.q[19] = 1.0f;
            this.q[20] = 1.0f;
            this.q[21] = 1.0f;
            this.q[22] = 1.0f;
            this.q[23] = 1.0f - (((float) ((((double) this.x) * this.k) * this.n)) / ((float) this.j));
            ByteBuffer allocateDirect = ByteBuffer.allocateDirect(96);
            allocateDirect.order(ByteOrder.nativeOrder());
            this.s = allocateDirect.asFloatBuffer();
            this.s.put(this.q, 0, 24);
            this.s.position(0);
            boolean z2 = this.E;
            int[] iArr = new int[1];
            GLES20.glGenFramebuffers(1, iArr, 0);
            this.B = iArr[0];
            GLES20.glGenTextures(1, iArr, 0);
            this.C = iArr[0];
            GLES20.glGenRenderbuffers(1, iArr, 0);
            this.D = iArr[0];
            GLES20.glBindFramebuffer(36160, this.B);
            GLES20.glBindTexture(3553, this.C);
            if (z2) {
                GLES20.glTexImage2D(3553, 0, 6408, this.i, this.j, 0, 6408, 5121, (Buffer) null);
            } else {
                GLES20.glTexImage2D(3553, 0, 6407, this.i, this.j, 0, 6407, 5121, (Buffer) null);
            }
            if (GLES20.glGetError() != 0) {
                if (this.h instanceof Activity) {
                    ((Activity) this.h).runOnUiThread(new Runnable() {
                        public final void run() {
                            Toast.makeText(d.this.h, "Not enough graphics memory for selected AA mode", 1).show();
                        }
                    });
                }
                this.k = -1.0d;
                GLES20.glBindTexture(3553, 0);
                GLES20.glBindRenderbuffer(36161, 0);
                GLES20.glBindFramebuffer(36160, 0);
            } else {
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
        b();
        GLES20.glViewport(0, 0, i2, i3);
    }
}
