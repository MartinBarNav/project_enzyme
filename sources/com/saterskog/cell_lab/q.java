package com.saterskog.cell_lab;

import android.app.Activity;
import android.content.Context;
import android.opengl.GLES20;
import android.opengl.GLSurfaceView;
import android.preference.PreferenceManager;
import android.widget.Toast;
import com.saterskog.b.d;
import com.saterskog.cell_lab.p;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.zip.GZIPOutputStream;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;

public final class q extends d implements GLSurfaceView.Renderer {
    private static int am = 1;
    public int A;
    public int B;
    float C = 0.05f;
    float[] D = {0.8f, 0.8f, 1.0f};
    Future E;
    Future F;
    public boolean G = false;
    public float[] H = new float[4];
    public float[] I = new float[4];
    final float[] J = {0.0f, 0.0f, 0.0f};
    final float[] K = new float[16];
    final float[] L = new float[16];
    public boolean M;
    protected OutputStream N = null;
    public int O;
    boolean P;
    Gene[] Q;
    final Object R = new Object();
    float S;
    float T;
    float[] U = new float[20];
    float[] V = new float[20];
    float[] W = new float[20];
    float[] X = new float[20];
    int[] Y = new int[20];
    boolean[] Z = new boolean[20];
    int aa;
    int ab;
    int ac;
    int ad;
    int ae;
    float[] af = new float[200];
    float[] ag = new float[200];
    float[] ah = new float[200];
    float[] ai = new float[200];
    int[] aj = new int[200];
    int[] ak = new int[200];
    int[] al = new int[200];
    private final ThreadPoolExecutor an;
    private BlockingQueue<Runnable> ao;
    /* access modifiers changed from: private */
    public p.a ap;
    private boolean aq;
    private long ar = -1000000000;
    private InputStream as;
    private int at;
    private boolean au;
    private boolean av;
    /* access modifiers changed from: private */
    public Activity aw;
    double p;
    a q;
    CellWorld r;
    Environment s = new Environment();
    boolean t = false;
    boolean u;
    double v;
    double w;
    double x;
    double y;
    public int z;

    public interface a {
        void a(float f);

        void a(CellWorld cellWorld);

        void a(CellWorld cellWorld, int i);
    }

    public q(CellWorld cellWorld, Activity activity, p.a aVar, a aVar2, int i, double d) {
        super((float) (1.1d * d), false, activity);
        this.aw = activity;
        this.ap = aVar;
        this.q = aVar2;
        if (i != -1) {
            this.M = false;
        }
        if (cellWorld == null) {
            com.saterskog.b.a.a("skit");
        }
        this.r = cellWorld;
        this.F = null;
        this.E = null;
        this.B = i;
        this.ao = new LinkedBlockingQueue();
        this.an = new ThreadPoolExecutor(1, 1, 1, TimeUnit.SECONDS, this.ao);
        synchronized (this.R) {
            this.Q = new Gene[40];
            for (int i2 = 0; i2 < 40; i2++) {
                this.Q[i2] = new Gene();
            }
            this.au = false;
        }
        this.b = 0.0f;
        this.c = 0.0f;
        this.aq = false;
        this.d = 1.0f / ((float) d);
        this.z = 0;
        this.e = 1.0f;
        this.u = false;
        this.O = -1;
        this.as = null;
        this.P = false;
        this.av = true;
        String string = PreferenceManager.getDefaultSharedPreferences(this.aw).getString("log_stats", "none");
        this.p = -1.0d;
        if (string.equals("12m")) {
            this.p = 0.2d;
        }
        if (string.equals("1h")) {
            this.p = 1.0d;
        }
        if (string.equals("5h")) {
            this.p = 5.0d;
        }
        if (string.equals("25h")) {
            this.p = 25.0d;
        }
        if (string.equals("125h")) {
            this.p = 125.0d;
        }
        if (string.equals("625h")) {
            this.p = 625.0d;
        }
        b();
    }

    public final void onSurfaceCreated(GL10 gl10, EGLConfig eGLConfig) {
        GLES20.glClearColor(0.8f, 0.8f, 1.0f, 1.0f);
        this.r.a((Context) this.aw);
        a();
    }

    private void a(double d, double d2) {
        Cell cell = new Cell();
        cell.b = d;
        cell.c = d2;
        cell.p = 1.0d;
        cell.T = -1;
        for (int i = 0; i < 4; i++) {
            cell.U[i] = 0.01f;
        }
        Gene[] f = this.ap.f();
        cell.D = 0;
        for (int i2 = 0; i2 < 40; i2++) {
            cell.I[i2] = new Gene(f[i2]);
            if (cell.I[i2].p) {
                cell.D = i2;
            }
        }
        if (cell.I[cell.D].s == h.LIPOCYTE) {
            cell.w = 1.728d;
        } else {
            cell.w = 0.288d;
        }
        cell.d = Math.min(Math.sqrt(cell.w / 400.0d), 0.029699999999999997d);
        cell.J[0] = cell.I[cell.D].a[0];
        cell.J[1] = cell.I[cell.D].a[1];
        cell.J[2] = cell.I[cell.D].a[2];
        cell.J[3] = 1.0f;
        cell.e = 0.0d;
        cell.f = 0.0d;
        cell.l = 0.0d;
        cell.n = 0.0d;
        cell.k = 0.0d;
        cell.m = d.a.b() * 3.141592653589793d;
        cell.C = 0;
        cell.E = 1;
        cell.F = 0;
        cell.y = false;
        cell.o = 0.1d;
        cell.G = 0;
        if (this.r.z == this.r.e.r && this.r.z > 0) {
            this.r.x[d.a.nextInt(this.r.z)].a(this.r.x[this.r.z - 1]);
            CellWorld cellWorld = this.r;
            cellWorld.z--;
        }
        this.r.a(cell);
        if (cell.I[0].u[5] == 0 && cell.I[0].t[7].e == 0 && Math.abs(((double) cell.I[0].t[7].b) - 1.0d) < 0.1d) {
            t.a(this.aw, 3, 4, 2500);
        }
        if (cell.I[2].u[5] == 0 && cell.I[2].u[6] == 1 && cell.I[2].t[7].d == 1 && cell.I[2].t[8].d == 0 && Math.abs(cell.I[2].t[7].a - 0.4355f) < 0.2f && Math.abs(cell.I[2].t[8].a + 0.4355f) < 0.2f) {
            t.a(this.aw, 3, 6, 2500);
        }
    }

    public final void a(float[] fArr) {
        final double d;
        double d2;
        double d3;
        double d4;
        final boolean z2;
        boolean z3;
        float f;
        float f2;
        if (this.z == 0) {
            this.J[0] = 0.85f;
            this.J[1] = 0.85f;
            this.J[2] = 1.0f;
        }
        if (this.z == 1) {
            this.J[0] = 0.73f;
            this.J[1] = 0.7f;
            this.J[2] = 0.95f;
        }
        if (this.z == 2) {
            this.J[0] = 0.9f;
            this.J[1] = 0.75f;
            this.J[2] = 0.65f;
        }
        if (this.z == 3) {
            this.J[0] = 0.85f;
            this.J[1] = 1.0f;
            this.J[2] = 0.85f;
        }
        for (int i = 0; i < 3; i++) {
            float[] fArr2 = this.D;
            fArr2[i] = (float) (((double) fArr2[i]) + (((double) (this.J[i] - this.D[i])) * 0.1d));
        }
        a(this.S * 0.01f, this.T * 0.01f);
        this.S = (float) (((double) this.S) * 0.92d);
        this.T = (float) (((double) this.T) * 0.92d);
        GLES20.glClearColor(this.D[0], this.D[1], this.D[2], 1.0f);
        GLES20.glDepthMask(true);
        GLES20.glClear(16640);
        this.av = false;
        if (this.z == 1 || this.z == 3) {
            if (this.E != null) {
                try {
                    this.E.get();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                } catch (ExecutionException e2) {
                    e2.printStackTrace();
                }
            }
            if (this.z != 0) {
                if (this.z != 2) {
                }
                f2 = Math.max(this.f, this.g) * 0.1f;
            } else {
                f2 = 0.0f;
            }
            float f3 = (this.f / 2.0f) + f2;
            float f4 = f2 + (this.g / 2.0f);
            this.r.a(this.b - f3, f3 + this.b, this.c - f4, f4 + this.c);
        }
        if ((this.z == 1 || this.z == 3) && !this.av && this.F != null) {
            try {
                this.F.get();
            } catch (InterruptedException | ExecutionException e3) {
                e3.printStackTrace();
            }
        }
        if (this.F == null || this.F.isDone()) {
            if (this.O != -1) {
                this.z = this.O;
                for (int i2 = 0; i2 < 20; i2++) {
                    this.Z[i2] = false;
                }
                this.aa = 0;
                this.ab = 0;
                this.O = -1;
            }
            if (!(this.z == 1 || this.z == 3)) {
                if (this.z != 0) {
                    if (this.z != 2) {
                    }
                    f = Math.max(this.f, this.g) * 0.1f;
                } else {
                    f = 0.0f;
                }
                float f5 = (this.f / 2.0f) + f;
                float f6 = f + (this.g / 2.0f);
                this.r.a(this.b - f5, f5 + this.b, this.c - f6, f6 + this.c);
            }
            if (this.r.X == 0) {
                if (this.N != null) {
                    try {
                        CellWorld cellWorld = this.r;
                        OutputStream outputStream = this.N;
                        ObjectOutputStream objectOutputStream = new ObjectOutputStream(outputStream);
                        objectOutputStream.writeInt(95);
                        objectOutputStream.writeDouble(cellWorld.M);
                        objectOutputStream.writeInt(cellWorld.z);
                        cellWorld.e.a(objectOutputStream);
                        objectOutputStream.flush();
                        GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(outputStream);
                        ObjectOutputStream objectOutputStream2 = new ObjectOutputStream(gZIPOutputStream);
                        objectOutputStream2.writeDouble(cellWorld.O);
                        for (int i3 = 0; i3 < cellWorld.z; i3++) {
                            cellWorld.x[i3].a(objectOutputStream2);
                        }
                        objectOutputStream2.writeInt(cellWorld.B);
                        for (int i4 = 0; i4 < cellWorld.B; i4++) {
                            Food food = cellWorld.A[i4];
                            objectOutputStream2.writeFloat(food.a);
                            objectOutputStream2.writeFloat(food.b);
                            objectOutputStream2.writeFloat(food.c);
                            objectOutputStream2.writeFloat(food.d);
                            objectOutputStream2.writeFloat(food.e);
                            objectOutputStream2.writeFloat(food.f);
                        }
                        objectOutputStream2.flush();
                        objectOutputStream2.close();
                        gZIPOutputStream.close();
                        this.ap.a(7);
                    } catch (IOException e4) {
                        e4.printStackTrace();
                    }
                    try {
                        this.N.close();
                    } catch (IOException e5) {
                        e5.printStackTrace();
                    }
                    this.N = null;
                }
                if (this.as != null) {
                    this.D[0] = 1.0f;
                    this.D[1] = 1.0f;
                    this.D[2] = 1.0f;
                    this.r.a();
                    try {
                        this.r.a(this.as);
                        this.as.close();
                    } catch (IOException e6) {
                        e6.printStackTrace();
                    }
                    if (this.at != -1) {
                        this.r.c(this.at);
                    }
                    if (this.B != -1) {
                        this.r.M = 0.0d;
                    }
                    this.as = null;
                    this.r.L = false;
                }
                if (this.P) {
                    this.ap.a(0);
                    this.r.a();
                    this.P = false;
                    this.r.L = false;
                }
                if (this.aq && (this.A == 2 || this.A == 3 || this.A == 1)) {
                    this.r.b();
                    this.ap.a(2);
                    this.aq = false;
                }
                if (this.u) {
                    int a2 = this.r.a(this.v, this.w);
                    if (a2 == -1) {
                        if (this.aq) {
                            this.ap.a(2);
                            this.aq = false;
                            this.r.b();
                            synchronized (this.R) {
                                this.au = false;
                            }
                        } else if (this.r.e.k * this.r.e.k > (this.v * this.v) + (this.w * this.w) && this.A == 0) {
                            if (this.B != -1) {
                                final int i5 = j.a((Context) this.aw).get(this.B).q;
                                if (this.r.V >= i5) {
                                    z3 = false;
                                    this.D[0] = 1.0f;
                                    this.D[1] = 0.3f;
                                    this.D[2] = 0.3f;
                                    this.aw.runOnUiThread(new Runnable() {
                                        public final void run() {
                                            Toast.makeText(q.this.aw, q.this.aw.getString(C0028R.string.scope_lab_budget_1) + i5 + " " + q.this.aw.getString(C0028R.string.scope_lab_budget_2), 1).show();
                                        }
                                    });
                                } else {
                                    z3 = true;
                                }
                                if (!j.a(this.B, this.ap.f(), (Context) this.aw)) {
                                    z3 = false;
                                    this.aw.runOnUiThread(new Runnable() {
                                        public final void run() {
                                            Toast.makeText(q.this.aw, C0028R.string.toast_cell_type_limit_violation, 1).show();
                                        }
                                    });
                                }
                                if (z3) {
                                    this.ap.a(3);
                                    a(this.v, this.w);
                                    this.r.V++;
                                    t.a(this.aw, 0, 3, 1500);
                                    t.a(this.aw, 1, 9, 1500);
                                    if (this.z == 1) {
                                        t.a(this.aw, 3, 3, 1500);
                                    }
                                } else {
                                    this.ap.a(1);
                                }
                            } else {
                                this.ap.a(3);
                                a(this.v, this.w);
                                this.r.V++;
                            }
                        }
                        if (this.A == 2) {
                            this.ap.a(3);
                            this.r.a(this.v, this.w, 1.152d, 0.0f);
                        }
                        if (this.A == 3 || this.A == 4) {
                            this.ap.a(1);
                        }
                    } else {
                        if (this.A == 4 || this.A == 0) {
                            this.aq = true;
                            if (this.r.x[a2].F != 1) {
                                this.ap.a(8);
                                this.aq = true;
                                this.r.b();
                                this.r.x[a2].F = 1;
                            } else {
                                this.ap.a(2);
                                this.aq = false;
                                this.r.b();
                            }
                            this.x = ((double) this.b) - this.r.x[a2].b;
                            this.y = ((double) this.c) - this.r.x[a2].c;
                            this.aw.runOnUiThread(new Runnable() {
                                public final void run() {
                                    t.b(q.this.aw, 0, 6);
                                    if (q.this.z == 0) {
                                        t.b(q.this.aw, 0, 7);
                                    }
                                }
                            });
                        }
                        if (this.A == 2) {
                            this.r.x[a2].w = 0.36d;
                            this.r.x[a2].J[0] = 1.0f;
                            this.r.x[a2].J[1] = 0.0f;
                            this.r.x[a2].J[2] = 1.0f;
                            this.r.x[a2].p = 1.0d;
                            this.r.x[a2].o = 0.0d;
                            if (this.r.x[a2].I[this.r.x[a2].D].s == h.LIPOCYTE) {
                                this.r.x[a2].S = 1.8f;
                            }
                            this.ap.a(10);
                        }
                        if (this.A == 3) {
                            int i6 = -1;
                            if (this.B != -1) {
                                i6 = j.a((Context) this.aw).get(this.B).A;
                            }
                            if (this.r.W < i6 || i6 == -1) {
                                this.r.a(a2, false);
                                this.r.W++;
                                this.ap.a(10);
                            } else {
                                this.D[0] = 1.0f;
                                this.D[1] = 0.3f;
                                this.D[2] = 0.3f;
                                this.ap.a(1);
                            }
                        }
                    }
                    this.u = false;
                    this.r.L = false;
                }
                d();
                if (this.t) {
                    this.r.e.a(this.s);
                    this.r.L = false;
                    this.t = false;
                }
                if (!this.r.L && this.z == 0) {
                    this.r.a(true, 0.0d);
                }
                if ((this.z == 1 || this.z == 3) && this.r.H > 0.0f && this.r.H < 2.89f) {
                    float sqrt = (float) Math.sqrt((double) this.r.H);
                    float max = Math.max(this.f, this.g);
                    float min = Math.min(1.0f, (0.085f / max) - 0.05f);
                    if (min > 0.0f) {
                        float min2 = Math.min(1.5f - ((sqrt * 3.0f) / max), 1.0f) * min;
                        if (min2 > 0.003f) {
                            this.ap.a(min2);
                        }
                    }
                    this.r.H = -1.0f;
                }
                if (this.B != -1 && j.a(this.B, this.r) && !this.M) {
                    this.M = true;
                    if (!j.b(this.B, (Context) this.aw)) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (z2) {
                        j.c(this.B, this.aw);
                    }
                    this.D[0] = 0.3f;
                    this.D[1] = 1.0f;
                    this.D[2] = 0.3f;
                    final PlayActivity playActivity = (PlayActivity) this.aw;
                    this.aw.runOnUiThread(new Runnable() {
                        public final void run() {
                            q.this.ap.a(4);
                            if (z2) {
                                playActivity.h();
                            }
                            playActivity.E = true;
                            Toast.makeText(q.this.aw, q.this.aw.getString(C0028R.string.toast_challenge_completed), 1).show();
                        }
                    });
                }
                this.ap.a(this.r, this.M);
                if (this.aq) {
                    this.aq = false;
                    int i7 = 0;
                    while (true) {
                        if (i7 >= this.r.z) {
                            d2 = 0.0d;
                            d3 = 0.0d;
                            d4 = 0.0d;
                            break;
                        } else if (this.r.x[i7].F == 1) {
                            double d5 = this.r.x[i7].b;
                            double d6 = this.r.x[i7].c;
                            double d7 = this.r.x[i7].d;
                            this.aq = true;
                            if (this.A == 4) {
                                this.q.a(this.r, i7);
                            }
                            synchronized (this.R) {
                                this.au = true;
                                int i8 = 0;
                                while (true) {
                                    int i9 = i8;
                                    if (i9 >= 40) {
                                        break;
                                    }
                                    this.Q[i9].a(this.r.x[i7].I[i9]);
                                    this.Q[i9].p = this.r.x[i7].D == i9;
                                    i8 = i9 + 1;
                                }
                            }
                            d2 = d7;
                            d3 = d6;
                            d4 = d5;
                        } else {
                            i7++;
                        }
                    }
                    if (this.aq) {
                        this.x *= 0.8d;
                        this.y *= 0.8d;
                        this.b = (float) (this.x + d4);
                        this.c = (float) (this.y + d3);
                        this.H[0] = (float) d4;
                        this.H[1] = (float) d3;
                        this.H[2] = (float) (d2 + 0.01d);
                        b();
                    } else {
                        synchronized (this.R) {
                            this.au = false;
                        }
                    }
                    if (!this.aq) {
                        this.ap.a(2);
                    }
                } else if (this.A == 4) {
                    this.q.a(this.r, -1);
                }
                if ((this.z == 1 || this.z == 3) && this.ap.g()) {
                    this.r.I = true;
                    this.r.F = this.b;
                    this.r.G = this.c;
                } else {
                    this.r.I = false;
                }
            }
            if (this.z == 1 || this.z == 3) {
                if (this.z == 1) {
                    d = 1.0d;
                } else {
                    d = (double) this.C;
                }
                this.E = this.an.submit(new Runnable() {
                    public final void run() {
                        q.this.r.b(true, d);
                    }
                });
                this.F = this.an.submit(new Runnable() {
                    public final void run() {
                        q.this.r.a(d);
                    }
                });
            } else if (this.z == 2) {
                this.F = this.an.submit(new Runnable() {
                    /* JADX WARNING: Removed duplicated region for block: B:4:0x000a A[LOOP:1: B:2:0x0006->B:4:0x000a, LOOP_END] */
                    /* Code decompiled incorrectly, please refer to instructions dump. */
                    public final void run() {
                        /*
                            r8 = this;
                            r1 = 0
                            long r2 = java.lang.System.currentTimeMillis()
                        L_0x0005:
                            r0 = r1
                        L_0x0006:
                            r4 = 15
                            if (r0 >= r4) goto L_0x0012
                            com.saterskog.cell_lab.q r4 = com.saterskog.cell_lab.q.this
                            com.saterskog.cell_lab.q.a((com.saterskog.cell_lab.q) r4, (boolean) r1)
                            int r0 = r0 + 1
                            goto L_0x0006
                        L_0x0012:
                            com.saterskog.cell_lab.q r0 = com.saterskog.cell_lab.q.this
                            int r0 = r0.B
                            r4 = -1
                            if (r0 == r4) goto L_0x002d
                            com.saterskog.cell_lab.q r0 = com.saterskog.cell_lab.q.this
                            int r0 = r0.B
                            com.saterskog.cell_lab.q r4 = com.saterskog.cell_lab.q.this
                            com.saterskog.cell_lab.CellWorld r4 = r4.r
                            boolean r0 = com.saterskog.cell_lab.j.a((int) r0, (com.saterskog.cell_lab.CellWorld) r4)
                            if (r0 == 0) goto L_0x002d
                            com.saterskog.cell_lab.q r0 = com.saterskog.cell_lab.q.this
                            boolean r0 = r0.M
                            if (r0 == 0) goto L_0x0038
                        L_0x002d:
                            long r4 = java.lang.System.currentTimeMillis()
                            long r4 = r4 - r2
                            r6 = 50
                            int r0 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
                            if (r0 < 0) goto L_0x0005
                        L_0x0038:
                            com.saterskog.cell_lab.q r0 = com.saterskog.cell_lab.q.this
                            r1 = 1
                            com.saterskog.cell_lab.q.a((com.saterskog.cell_lab.q) r0, (boolean) r1)
                            return
                        */
                        throw new UnsupportedOperationException("Method not decompiled: com.saterskog.cell_lab.q.AnonymousClass3.run():void");
                    }
                });
            }
        }
        this.L[0] = 2.0f / this.f;
        this.L[1] = 0.0f;
        this.L[2] = 0.0f;
        this.L[3] = 0.0f;
        this.L[4] = 0.0f;
        this.L[5] = 2.0f / this.g;
        this.L[6] = 0.0f;
        this.L[7] = 0.0f;
        this.L[8] = 0.0f;
        this.L[9] = 0.0f;
        this.L[10] = 1.0f;
        this.L[11] = 0.0f;
        this.L[12] = (-2.0f * this.b) / this.f;
        this.L[13] = (-2.0f * this.c) / this.g;
        this.L[14] = 0.0f;
        this.L[15] = 1.0f;
        int i10 = 0;
        while (true) {
            int i11 = i10;
            if (i11 >= 4) {
                break;
            }
            int i12 = 0;
            while (true) {
                int i13 = i12;
                if (i13 >= 4) {
                    break;
                }
                this.K[(i13 * 4) + i11] = 0.0f;
                for (int i14 = 0; i14 < 4; i14++) {
                    float[] fArr3 = this.K;
                    int i15 = (i13 * 4) + i11;
                    fArr3[i15] = fArr3[i15] + (this.L[(i13 * 4) + i14] * fArr[(i14 * 4) + i11]);
                }
                i12 = i13 + 1;
            }
            i10 = i11 + 1;
        }
        this.r.a(this.K);
        GLES20.glDisable(2929);
        GLES20.glEnable(3042);
        GLES20.glBlendFunc(1, 770);
        if (this.G || this.aq) {
            a(this.K, this.H[0], this.H[1], this.H[2], 1.0f);
        }
        long nanoTime = System.nanoTime() - this.ar;
        if (nanoTime < 16666666 && nanoTime > 0) {
            try {
                Thread.sleep((16666666 - nanoTime) / 1000000);
            } catch (InterruptedException e7) {
                e7.printStackTrace();
            }
        }
        this.ar = System.nanoTime();
    }

    public final void a(float f, float f2) {
        if (this.A == 1) {
            int i = 0;
            while (i < 20) {
                if (!this.Z[i]) {
                    i++;
                } else {
                    return;
                }
            }
        }
        if (!this.aq && this.l) {
            if ((f * f) + (f2 * f2) > 1.0f) {
                this.av = true;
            }
            this.b -= f / this.a;
            this.c += f2 / this.a;
            if (((double) this.c) > 0.7d && this.h != null && (this.h instanceof Activity)) {
                t.b((Activity) this.h, 0, 2);
            }
            b();
        }
    }

    public final void a(float f, float f2, float f3) {
        if (this.A == 1) {
            int i = 0;
            while (i < 20) {
                if (!this.Z[i]) {
                    i++;
                } else {
                    return;
                }
            }
        }
        if (this.l) {
            this.d *= f;
            if (!this.aq) {
                if (((double) Math.abs(1.0f - f)) > 1.0E-4d) {
                    this.av = true;
                }
                this.b = (float) (((double) this.b) + ((a(f2) - ((double) this.b)) * ((double) (f - 1.0f))));
                this.c = (float) (((double) this.c) + ((b(f3) - ((double) this.c)) * ((double) (f - 1.0f))));
            }
            b();
            if (this.q != null) {
                this.q.a(this.f * 5.0E-4f);
            }
        }
    }

    public final void a(int i) {
        if (this.ad < 200) {
            this.ak[this.ad] = i;
            this.ad++;
        }
    }

    private void d() {
        int a2;
        if (this.A == 1) {
            for (int i = 0; i < this.ac; i++) {
                if (this.ab == this.aa) {
                    int i2 = 0;
                    while (true) {
                        if (i2 >= 20) {
                            break;
                        } else if (!this.Z[i2]) {
                            int a3 = this.r.a((double) this.af[i], (double) this.ag[i]);
                            if (a3 != -1) {
                                this.Y[i2] = this.aj[i];
                                this.U[i2] = this.af[i];
                                this.V[i2] = this.ag[i];
                                this.r.x[a3].F = i2 + 100;
                                this.W[i2] = this.af[i] - ((float) this.r.x[a3].b);
                                this.X[i2] = this.ag[i] - ((float) this.r.x[a3].c);
                                this.Z[i2] = true;
                                this.ab++;
                            }
                        } else {
                            i2++;
                        }
                    }
                }
                this.aa++;
            }
            this.ac = 0;
            for (int i3 = 0; i3 < this.ae; i3++) {
                if (this.ab == this.aa) {
                    int i4 = 0;
                    while (true) {
                        if (i4 >= 20) {
                            break;
                        } else if (!this.Z[i4] || this.Y[i4] != this.al[i3]) {
                            i4++;
                        } else if (this.r.a(i4 + 100) == -1) {
                            this.Z[i4] = false;
                            this.ab--;
                        } else {
                            this.U[i4] = this.ah[i3];
                            this.V[i4] = this.ai[i3];
                        }
                    }
                }
            }
            this.ae = 0;
            for (int i5 = 0; i5 < this.ad; i5++) {
                for (int i6 = 0; i6 < 20; i6++) {
                    if (this.Z[i6] && this.Y[i6] == this.ak[i5]) {
                        int a4 = this.r.a(i6 + 100);
                        if (a4 != -1) {
                            this.r.x[a4].F = 0;
                        }
                        this.Z[i6] = false;
                        this.ab--;
                    }
                }
                this.aa--;
            }
            this.ad = 0;
        }
        int i7 = 0;
        while (true) {
            int i8 = i7;
            if (i8 < 20) {
                if (this.Z[i8] && (a2 = this.r.a(i8 + 100)) != -1) {
                    double d = (double) this.W[i8];
                    double d2 = (double) this.X[i8];
                    double d3 = ((((((double) this.V[i8]) - (this.r.x[a2].c + d2)) * d) - ((((double) this.U[i8]) - (this.r.x[a2].b + d)) * d2)) / (this.r.x[a2].d * this.r.x[a2].d)) * 0.5d;
                    double d4 = this.r.x[a2].b;
                    double d5 = this.r.x[a2].c;
                    double d6 = this.r.x[a2].k;
                    this.r.x[a2].k += d3;
                    this.W[i8] = (float) ((Math.cos(d3) * d) - (Math.sin(d3) * d2));
                    this.X[i8] = (float) ((d * Math.sin(d3)) + (d2 * Math.cos(d3)));
                    this.r.x[a2].b = (double) (this.U[i8] - this.W[i8]);
                    this.r.x[a2].c = (double) (this.V[i8] - this.X[i8]);
                    double d7 = 1.0d;
                    if (this.z == 1) {
                        d7 = 0.02d;
                    }
                    if (this.z == 3) {
                        d7 = 0.02d * ((double) this.C);
                    }
                    if (this.z == 1 || this.z == 3) {
                        this.r.x[a2].z = false;
                        this.r.x[a2].e = (this.r.x[a2].b - d4) / d7;
                        this.r.x[a2].f = (this.r.x[a2].c - d5) / d7;
                        this.r.x[a2].l = (this.r.x[a2].k - d6) / d7;
                    }
                    this.r.L = false;
                }
                i7 = i8 + 1;
            } else {
                return;
            }
        }
    }

    public final void a(InputStream inputStream, int i) {
        this.at = i;
        this.as = inputStream;
    }

    public final Gene[] c() {
        Gene[] geneArr;
        synchronized (this.R) {
            if (this.au) {
                geneArr = new Gene[40];
                for (int i = 0; i < 40; i++) {
                    geneArr[i] = new Gene(this.Q[i]);
                }
            } else {
                geneArr = null;
            }
        }
        return geneArr;
    }

    static /* synthetic */ void a(q qVar, boolean z2) {
        long j = 0;
        if (qVar.p > 0.0d) {
            j = Math.round(qVar.r.M / qVar.p);
        }
        qVar.r.b(z2, 1.0d);
        qVar.r.a(1.0d);
        if (qVar.p > 0.0d && j != Math.round(qVar.r.M / qVar.p)) {
            qVar.q.a(qVar.r);
        }
    }
}
