package com.saterskog.cell_lab;

import android.content.Context;
import android.opengl.GLSurfaceView;
import android.preference.PreferenceManager;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;

public class GenomePreviewView extends GLSurfaceView {
    public final n a;
    float b;
    float c;
    float d;
    float e;
    float f;
    int g;
    boolean h = PreferenceManager.getDefaultSharedPreferences(getContext()).getBoolean("lock_preview", true);
    GestureDetector i;

    public GenomePreviewView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setEGLContextClientVersion(2);
        setEGLConfigChooser(8, 8, 8, 0, 16, 0);
        this.a = new n(context);
        setRenderer(this.a);
        setRenderMode(0);
        this.g = -1;
        this.i = new GestureDetector(context, new a(this, (byte) 0));
    }

    public void setCallback(c cVar) {
        this.a.x = cVar;
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i2, int i3) {
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        int mode2 = View.MeasureSpec.getMode(i3);
        int size2 = View.MeasureSpec.getSize(i3);
        if (mode != 1073741824) {
            size = mode == Integer.MIN_VALUE ? Math.min(400, size) : 400;
        }
        int i4 = size / 2;
        if (mode2 == 1073741824) {
            i4 = size2;
        } else if (mode2 == Integer.MIN_VALUE) {
            i4 = Math.min(i4, size2);
        }
        setMeasuredDimension(size, i4);
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        float f2;
        float f3;
        float f4 = -1.0f;
        if (!this.h) {
            float x = motionEvent.getX();
            float y = motionEvent.getY();
            if (motionEvent.getPointerCount() == 2) {
                float x2 = motionEvent.getX(1);
                float y2 = motionEvent.getY(1);
                f4 = (float) Math.sqrt((double) (((x2 - x) * (x2 - x)) + ((y2 - y) * (y2 - y))));
                f3 = (x2 + x) / 2.0f;
                f2 = (y + y2) / 2.0f;
            } else {
                f2 = -1.0f;
                f3 = -1.0f;
            }
            switch (motionEvent.getAction()) {
                case 2:
                    if (motionEvent.getPointerCount() == 1 && this.g == 1) {
                        this.a.a(x - this.b, y - this.c);
                        requestRender();
                    }
                    if (motionEvent.getPointerCount() == 2 && this.g == 2) {
                        this.a.a(f3 - this.d, f2 - this.e);
                        this.d = f3;
                        this.e = f2;
                        if (Math.abs(Math.log((double) (f4 / this.f))) < 0.3d) {
                            this.a.a(f4 / this.f, f3, f2);
                            requestRender();
                            break;
                        }
                    }
                    break;
            }
            if (motionEvent.getPointerCount() == 2) {
                this.d = f3;
                this.e = f2;
                this.f = f4;
            }
            this.b = x;
            this.c = y;
            this.g = motionEvent.getPointerCount();
        }
        return this.i.onTouchEvent(motionEvent);
    }

    private class a extends GestureDetector.SimpleOnGestureListener {
        private a() {
        }

        /* synthetic */ a(GenomePreviewView genomePreviewView, byte b) {
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
            GenomePreviewView.this.queueEvent(new Runnable() {
                public final void run() {
                    n nVar = GenomePreviewView.this.a;
                    float f = x;
                    float f2 = y;
                    nVar.q = nVar.a(f);
                    nVar.r = nVar.b(f2);
                    int a2 = nVar.p.a(nVar.q, nVar.r);
                    if (a2 != -1) {
                        nVar.x.a(nVar.p.x[a2].D);
                    }
                }
            });
            return true;
        }
    }
}
