/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.content.Context
 *  android.opengl.GLSurfaceView
 *  android.view.GestureDetector
 *  android.view.GestureDetector$OnGestureListener
 *  android.view.GestureDetector$SimpleOnGestureListener
 *  android.view.MotionEvent
 */
package com.saterskog.cell_lab;

import android.app.Activity;
import android.content.Context;
import android.opengl.GLSurfaceView;
import android.view.GestureDetector;
import android.view.MotionEvent;
import com.saterskog.cell_lab.CellWorld;
import com.saterskog.cell_lab.p;
import com.saterskog.cell_lab.q;

public final class r
extends GLSurfaceView {
    public final q a;
    float b;
    float c;
    float d;
    float e;
    float f;
    boolean g;
    int h;
    GestureDetector i;
    long j;
    q.a k;

    public r(Activity activity, CellWorld cellWorld, p.a a2, q.a a3, int n2, double d2) {
        super((Context)activity);
        this.setEGLContextClientVersion(2);
        this.setEGLConfigChooser(8, 8, 8, 0, 16, 0);
        this.a = new q(cellWorld, activity, a2, a3, n2, d2);
        this.setRenderer(this.a);
        this.setRenderMode(1);
        this.k = a3;
        this.g = false;
        this.h = -1;
        this.i = new GestureDetector((Context)activity, (GestureDetector.OnGestureListener)new a(0));
        this.j = System.currentTimeMillis();
    }

    /*
     * Enabled aggressive block sorting
     */
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        float f2;
        float f3;
        float f4;
        int n2 = motionEvent.getPointerCount();
        int n3 = motionEvent.getActionIndex();
        switch (motionEvent.getActionMasked()) {
            case 2: {
                for (int i2 = 0; i2 < n2; ++i2) {
                    this.queueEvent(new Runnable(motionEvent.getPointerId(i2), motionEvent.getX(i2), motionEvent.getY(i2)){
                        final /* synthetic */ int a;
                        final /* synthetic */ float b;
                        final /* synthetic */ float c;
                        {
                            this.a = n2;
                            this.b = f2;
                            this.c = f3;
                        }

                        @Override
                        public final void run() {
                            q q2 = r.this.a;
                            int n2 = this.a;
                            float f2 = this.b;
                            float f3 = this.c;
                            if (q2.ae < 200) {
                                q2.ah[q2.ae] = (float)q2.a(f2);
                                q2.ai[q2.ae] = (float)q2.b(f3);
                                q2.al[q2.ae] = n2;
                                ++q2.ae;
                            }
                        }
                    });
                }
                break;
            }
            case 0: 
            case 5: {
                this.queueEvent(new Runnable(motionEvent.getPointerId(n3), motionEvent.getX(n3), motionEvent.getY(n3)){
                    final /* synthetic */ int a;
                    final /* synthetic */ float b;
                    final /* synthetic */ float c;
                    {
                        this.a = n2;
                        this.b = f2;
                        this.c = f3;
                    }

                    @Override
                    public final void run() {
                        q q2 = r.this.a;
                        int n2 = this.a;
                        float f2 = this.b;
                        float f3 = this.c;
                        if (q2.ac < 200) {
                            q2.af[q2.ac] = (float)q2.a(f2);
                            q2.ag[q2.ac] = (float)q2.b(f3);
                            q2.aj[q2.ac] = n2;
                            ++q2.ac;
                        }
                    }
                });
                break;
            }
            case 1: 
            case 6: {
                this.queueEvent(new Runnable(motionEvent.getPointerId(n3)){
                    final /* synthetic */ int a;
                    {
                        this.a = n2;
                    }

                    @Override
                    public final void run() {
                        r.this.a.a(this.a);
                    }
                });
                break;
            }
            case 3: {
                for (int i3 = 0; i3 < n2; ++i3) {
                    this.queueEvent(new Runnable(motionEvent.getPointerId(i3)){
                        final /* synthetic */ int a;
                        {
                            this.a = n2;
                        }

                        @Override
                        public final void run() {
                            r.this.a.a(this.a);
                        }
                    });
                }
                break;
            }
        }
        float f5 = motionEvent.getX();
        float f6 = motionEvent.getY();
        if (motionEvent.getPointerCount() == 2 || motionEvent.getPointerCount() == 3) {
            f4 = motionEvent.getX(1);
            f3 = motionEvent.getY(1);
            f2 = (float)Math.sqrt((f4 - f5) * (f4 - f5) + (f3 - f6) * (f3 - f6));
            f4 = (f4 + f5) / 2.0f;
            f3 = (f6 + f3) / 2.0f;
        } else {
            f3 = -1.0f;
            f4 = -1.0f;
            f2 = -1.0f;
        }
        switch (motionEvent.getAction()) {
            case 2: {
                float f7;
                float f8;
                if (motionEvent.getPointerCount() == 1 && this.h == 1) {
                    f8 = this.b;
                    f7 = this.c;
                    this.a.a(f5 - f8, f6 - f7);
                }
                if (motionEvent.getPointerCount() != 2 || this.h != 2) break;
                f8 = this.d;
                f7 = this.e;
                this.a.a(f4 - f8, f3 - f7);
                this.d = f4;
                this.e = f3;
                f8 = f2 / this.f;
                this.j = System.currentTimeMillis();
                if (!(Math.abs(Math.log(f8)) < 0.3)) break;
                this.a.a(f8, f4, f3);
                break;
            }
            case 1: {
                this.k.a(-1.0f);
                break;
            }
        }
        if (motionEvent.getPointerCount() == 2) {
            this.d = f4;
            this.e = f3;
            this.f = f2;
        }
        this.b = f5;
        this.c = f6;
        this.h = motionEvent.getPointerCount();
        this.i.onTouchEvent(motionEvent);
        return true;
    }

    private final class a
    extends GestureDetector.SimpleOnGestureListener {
        private a() {
        }

        /* synthetic */ a(byte by) {
            this();
        }

        public final boolean onDoubleTap(MotionEvent motionEvent) {
            return true;
        }

        public final boolean onDown(MotionEvent motionEvent) {
            return true;
        }

        public final boolean onFling(MotionEvent object, MotionEvent motionEvent, float f2, float f3) {
            if (System.currentTimeMillis() - r.this.j > 200L) {
                object = r.this.a;
                if (object.A == 1) {
                    for (int i2 = 0; i2 < 20; ++i2) {
                        if (!object.Z[i2]) {
                            continue;
                        }
                        break;
                    }
                } else {
                    object.S = f2;
                    object.T = f3;
                }
            }
            return true;
        }

        public final boolean onSingleTapUp(MotionEvent motionEvent) {
            final float f2 = motionEvent.getX();
            final float f3 = motionEvent.getY();
            r.this.queueEvent(new Runnable(){

                @Override
                public final void run() {
                    q q2 = r.this.a;
                    float f22 = f2;
                    float f32 = f3;
                    q2.v = q2.a(f22);
                    q2.w = q2.b(f32);
                    q2.u = true;
                }
            });
            return true;
        }
    }
}

