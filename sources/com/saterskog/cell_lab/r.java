package com.saterskog.cell_lab;

import android.app.Activity;
import android.opengl.GLSurfaceView;
import android.view.GestureDetector;
import android.view.MotionEvent;
import com.saterskog.cell_lab.p;
import com.saterskog.cell_lab.q;

public final class r extends GLSurfaceView {
    public final q a;
    float b;
    float c;
    float d;
    float e;
    float f;
    boolean g = false;
    int h = -1;
    GestureDetector i;
    long j;
    q.a k;

    public r(Activity activity, CellWorld cellWorld, p.a aVar, q.a aVar2, int i2, double d2) {
        super(activity);
        setEGLContextClientVersion(2);
        setEGLConfigChooser(8, 8, 8, 0, 16, 0);
        this.a = new q(cellWorld, activity, aVar, aVar2, i2, d2);
        setRenderer(this.a);
        setRenderMode(1);
        this.k = aVar2;
        this.i = new GestureDetector(activity, new a(this, (byte) 0));
        this.j = System.currentTimeMillis();
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean onTouchEvent(android.view.MotionEvent r13) {
        /*
            r12 = this;
            r0 = 0
            r8 = 1073741824(0x40000000, float:2.0)
            r11 = 2
            r1 = -1082130432(0xffffffffbf800000, float:-1.0)
            r10 = 1
            int r2 = r13.getPointerCount()
            int r3 = r13.getActionIndex()
            int r4 = r13.getActionMasked()
            switch(r4) {
                case 0: goto L_0x0086;
                case 1: goto L_0x009c;
                case 2: goto L_0x006d;
                case 3: goto L_0x00aa;
                case 4: goto L_0x0016;
                case 5: goto L_0x0086;
                case 6: goto L_0x009c;
                default: goto L_0x0016;
            }
        L_0x0016:
            float r4 = r13.getX()
            float r5 = r13.getY()
            int r0 = r13.getPointerCount()
            if (r0 == r11) goto L_0x002b
            int r0 = r13.getPointerCount()
            r2 = 3
            if (r0 != r2) goto L_0x0117
        L_0x002b:
            float r0 = r13.getX(r10)
            float r6 = r13.getY(r10)
            float r2 = r0 - r4
            float r3 = r0 - r4
            float r2 = r2 * r3
            float r3 = r6 - r5
            float r7 = r6 - r5
            float r3 = r3 * r7
            float r2 = r2 + r3
            double r2 = (double) r2
            double r2 = java.lang.Math.sqrt(r2)
            float r3 = (float) r2
            float r0 = r0 + r4
            float r2 = r0 / r8
            float r0 = r5 + r6
            float r0 = r0 / r8
        L_0x004a:
            int r6 = r13.getAction()
            switch(r6) {
                case 1: goto L_0x0110;
                case 2: goto L_0x00bb;
                default: goto L_0x0051;
            }
        L_0x0051:
            int r1 = r13.getPointerCount()
            if (r1 != r11) goto L_0x005d
            r12.d = r2
            r12.e = r0
            r12.f = r3
        L_0x005d:
            r12.b = r4
            r12.c = r5
            int r0 = r13.getPointerCount()
            r12.h = r0
            android.view.GestureDetector r0 = r12.i
            r0.onTouchEvent(r13)
            return r10
        L_0x006d:
            if (r0 >= r2) goto L_0x0016
            int r3 = r13.getPointerId(r0)
            float r4 = r13.getX(r0)
            float r5 = r13.getY(r0)
            com.saterskog.cell_lab.r$1 r6 = new com.saterskog.cell_lab.r$1
            r6.<init>(r3, r4, r5)
            r12.queueEvent(r6)
            int r0 = r0 + 1
            goto L_0x006d
        L_0x0086:
            int r0 = r13.getPointerId(r3)
            float r2 = r13.getX(r3)
            float r3 = r13.getY(r3)
            com.saterskog.cell_lab.r$2 r4 = new com.saterskog.cell_lab.r$2
            r4.<init>(r0, r2, r3)
            r12.queueEvent(r4)
            goto L_0x0016
        L_0x009c:
            int r0 = r13.getPointerId(r3)
            com.saterskog.cell_lab.r$3 r2 = new com.saterskog.cell_lab.r$3
            r2.<init>(r0)
            r12.queueEvent(r2)
            goto L_0x0016
        L_0x00aa:
            if (r0 >= r2) goto L_0x0016
            int r3 = r13.getPointerId(r0)
            com.saterskog.cell_lab.r$4 r4 = new com.saterskog.cell_lab.r$4
            r4.<init>(r3)
            r12.queueEvent(r4)
            int r0 = r0 + 1
            goto L_0x00aa
        L_0x00bb:
            int r1 = r13.getPointerCount()
            if (r1 != r10) goto L_0x00d2
            int r1 = r12.h
            if (r1 != r10) goto L_0x00d2
            float r1 = r12.b
            float r1 = r4 - r1
            float r6 = r12.c
            float r6 = r5 - r6
            com.saterskog.cell_lab.q r7 = r12.a
            r7.a((float) r1, (float) r6)
        L_0x00d2:
            int r1 = r13.getPointerCount()
            if (r1 != r11) goto L_0x0051
            int r1 = r12.h
            if (r1 != r11) goto L_0x0051
            float r1 = r12.d
            float r1 = r2 - r1
            float r6 = r12.e
            float r6 = r0 - r6
            com.saterskog.cell_lab.q r7 = r12.a
            r7.a((float) r1, (float) r6)
            r12.d = r2
            r12.e = r0
            float r1 = r12.f
            float r1 = r3 / r1
            long r6 = java.lang.System.currentTimeMillis()
            r12.j = r6
            double r6 = (double) r1
            double r6 = java.lang.Math.log(r6)
            double r6 = java.lang.Math.abs(r6)
            r8 = 4599075939470750515(0x3fd3333333333333, double:0.3)
            int r6 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r6 >= 0) goto L_0x0051
            com.saterskog.cell_lab.q r6 = r12.a
            r6.a(r1, r2, r0)
            goto L_0x0051
        L_0x0110:
            com.saterskog.cell_lab.q$a r6 = r12.k
            r6.a((float) r1)
            goto L_0x0051
        L_0x0117:
            r0 = r1
            r2 = r1
            r3 = r1
            goto L_0x004a
        */
        throw new UnsupportedOperationException("Method not decompiled: com.saterskog.cell_lab.r.onTouchEvent(android.view.MotionEvent):boolean");
    }

    private class a extends GestureDetector.SimpleOnGestureListener {
        private a() {
        }

        /* synthetic */ a(r rVar, byte b) {
            this();
        }

        public final boolean onDown(MotionEvent motionEvent) {
            return true;
        }

        public final boolean onDoubleTap(MotionEvent motionEvent) {
            return true;
        }

        public final boolean onSingleTapUp(MotionEvent motionEvent) {
            final float x = motionEvent.getX();
            final float y = motionEvent.getY();
            r.this.queueEvent(new Runnable() {
                public final void run() {
                    q qVar = r.this.a;
                    float f = x;
                    float f2 = y;
                    qVar.v = qVar.a(f);
                    qVar.w = qVar.b(f2);
                    qVar.u = true;
                }
            });
            return true;
        }

        public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
            if (System.currentTimeMillis() - r.this.j > 200) {
                q qVar = r.this.a;
                if (qVar.A == 1) {
                    int i = 0;
                    while (true) {
                        if (i < 20) {
                            if (qVar.Z[i]) {
                                break;
                            }
                            i++;
                        } else {
                            break;
                        }
                    }
                }
                qVar.S = f;
                qVar.T = f2;
            }
            return true;
        }
    }
}
