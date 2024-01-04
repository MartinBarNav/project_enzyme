// 
// Decompiled by Procyon v0.5.36
// 

package com.saterskog.cell_lab;

import android.view.GestureDetector$SimpleOnGestureListener;
import android.view.MotionEvent;
import android.view.GestureDetector$OnGestureListener;
import android.opengl.GLSurfaceView$Renderer;
import android.content.Context;
import android.app.Activity;
import android.view.GestureDetector;
import android.opengl.GLSurfaceView;

public final class r extends GLSurfaceView
{
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
    
    public r(final Activity activity, final CellWorld cellWorld, final p.a a, final q.a k, final int n, final double n2) {
        super((Context)activity);
        this.setEGLContextClientVersion(2);
        this.setEGLConfigChooser(8, 8, 8, 0, 16, 0);
        this.setRenderer((GLSurfaceView$Renderer)(this.a = new q(cellWorld, activity, a, k, n, n2)));
        this.setRenderMode(1);
        this.k = k;
        this.g = false;
        this.h = -1;
        this.i = new GestureDetector((Context)activity, (GestureDetector$OnGestureListener)new a((byte)0));
        this.j = System.currentTimeMillis();
    }
    
    public final boolean onTouchEvent(final MotionEvent motionEvent) {
        int i = 0;
        int j = 0;
        final int pointerCount = motionEvent.getPointerCount();
        final int actionIndex = motionEvent.getActionIndex();
        switch (motionEvent.getActionMasked()) {
            case 2: {
                while (j < pointerCount) {
                    this.queueEvent((Runnable)new Runnable() {
                        final /* synthetic */ int a = motionEvent.getPointerId(j);
                        final /* synthetic */ float b = motionEvent.getX(j);
                        final /* synthetic */ float c = motionEvent.getY(j);
                        
                        @Override
                        public final void run() {
                            final q a = r.this.a;
                            final int a2 = this.a;
                            final float b = this.b;
                            final float c = this.c;
                            if (a.ae < 200) {
                                a.ah[a.ae] = (float)a.a(b);
                                a.ai[a.ae] = (float)a.b(c);
                                a.al[a.ae] = a2;
                                ++a.ae;
                            }
                        }
                    });
                    ++j;
                }
                break;
            }
            case 0:
            case 5: {
                this.queueEvent((Runnable)new Runnable() {
                    final /* synthetic */ int a = motionEvent.getPointerId(actionIndex);
                    final /* synthetic */ float b = motionEvent.getX(actionIndex);
                    final /* synthetic */ float c = motionEvent.getY(actionIndex);
                    
                    @Override
                    public final void run() {
                        final q a = r.this.a;
                        final int a2 = this.a;
                        final float b = this.b;
                        final float c = this.c;
                        if (a.ac < 200) {
                            a.af[a.ac] = (float)a.a(b);
                            a.ag[a.ac] = (float)a.b(c);
                            a.aj[a.ac] = a2;
                            ++a.ac;
                        }
                    }
                });
                break;
            }
            case 1:
            case 6: {
                this.queueEvent((Runnable)new Runnable() {
                    final /* synthetic */ int a = motionEvent.getPointerId(actionIndex);
                    
                    @Override
                    public final void run() {
                        r.this.a.a(this.a);
                    }
                });
                break;
            }
            case 3: {
                while (i < pointerCount) {
                    this.queueEvent((Runnable)new Runnable() {
                        final /* synthetic */ int a = motionEvent.getPointerId(i);
                        
                        @Override
                        public final void run() {
                            r.this.a.a(this.a);
                        }
                    });
                    ++i;
                }
                break;
            }
        }
        final float x = motionEvent.getX();
        final float y = motionEvent.getY();
        float f;
        float n;
        float n2;
        if (motionEvent.getPointerCount() == 2 || motionEvent.getPointerCount() == 3) {
            final float x2 = motionEvent.getX(1);
            final float y2 = motionEvent.getY(1);
            f = (float)Math.sqrt((x2 - x) * (x2 - x) + (y2 - y) * (y2 - y));
            n = (x2 + x) / 2.0f;
            n2 = (y + y2) / 2.0f;
        }
        else {
            n2 = -1.0f;
            n = -1.0f;
            f = -1.0f;
        }
        switch (motionEvent.getAction()) {
            case 2: {
                if (motionEvent.getPointerCount() == 1 && this.h == 1) {
                    this.a.a(x - this.b, y - this.c);
                }
                if (motionEvent.getPointerCount() != 2 || this.h != 2) {
                    break;
                }
                this.a.a(n - this.d, n2 - this.e);
                this.d = n;
                this.e = n2;
                final float n3 = f / this.f;
                this.j = System.currentTimeMillis();
                if (Math.abs(Math.log(n3)) < 0.3) {
                    this.a.a(n3, n, n2);
                    break;
                }
                break;
            }
            case 1: {
                this.k.a(-1.0f);
                break;
            }
        }
        if (motionEvent.getPointerCount() == 2) {
            this.d = n;
            this.e = n2;
            this.f = f;
        }
        this.b = x;
        this.c = y;
        this.h = motionEvent.getPointerCount();
        this.i.onTouchEvent(motionEvent);
        return true;
    }
    
    private final class a extends GestureDetector$SimpleOnGestureListener
    {
        public final boolean onDoubleTap(final MotionEvent motionEvent) {
            return true;
        }
        
        public final boolean onDown(final MotionEvent motionEvent) {
            return true;
        }
        
        public final boolean onFling(final MotionEvent motionEvent, final MotionEvent motionEvent2, final float s, final float t) {
            if (System.currentTimeMillis() - r.this.j > 200L) {
                final q a = r.this.a;
                if (a.A == 1) {
                    for (int i = 0; i < 20; ++i) {
                        if (a.Z[i]) {
                            return true;
                        }
                    }
                }
                a.S = s;
                a.T = t;
            }
            return true;
        }
        
        public final boolean onSingleTapUp(final MotionEvent motionEvent) {
            r.this.queueEvent((Runnable)new Runnable() {
                final /* synthetic */ float a = motionEvent.getX();
                final /* synthetic */ float b = motionEvent.getY();
                
                @Override
                public final void run() {
                    final q a = r.this.a;
                    final float a2 = this.a;
                    final float b = this.b;
                    a.v = a.a(a2);
                    a.w = a.b(b);
                    a.u = true;
                }
            });
            return true;
        }
    }
}
