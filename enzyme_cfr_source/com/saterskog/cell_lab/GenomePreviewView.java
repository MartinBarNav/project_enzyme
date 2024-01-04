/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.opengl.GLSurfaceView
 *  android.preference.PreferenceManager
 *  android.util.AttributeSet
 *  android.view.GestureDetector
 *  android.view.GestureDetector$OnGestureListener
 *  android.view.GestureDetector$SimpleOnGestureListener
 *  android.view.MotionEvent
 *  android.view.View$MeasureSpec
 */
package com.saterskog.cell_lab;

import android.content.Context;
import android.opengl.GLSurfaceView;
import android.preference.PreferenceManager;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import com.saterskog.cell_lab.c;
import com.saterskog.cell_lab.n;

public class GenomePreviewView
extends GLSurfaceView {
    public final n a;
    float b;
    float c;
    float d;
    float e;
    float f;
    int g;
    boolean h;
    GestureDetector i;

    public GenomePreviewView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.setEGLContextClientVersion(2);
        this.h = PreferenceManager.getDefaultSharedPreferences((Context)this.getContext()).getBoolean("lock_preview", true);
        this.setEGLConfigChooser(8, 8, 8, 0, 16, 0);
        this.a = new n(context);
        this.setRenderer(this.a);
        this.setRenderMode(0);
        this.g = -1;
        this.i = new GestureDetector(context, (GestureDetector.OnGestureListener)new a(0));
    }

    /*
     * Enabled aggressive block sorting
     */
    protected void onMeasure(int n2, int n3) {
        int n4 = View.MeasureSpec.getMode((int)n2);
        n2 = View.MeasureSpec.getSize((int)n2);
        int n5 = View.MeasureSpec.getMode((int)n3);
        int n6 = View.MeasureSpec.getSize((int)n3);
        if (n4 != 0x40000000) {
            n2 = n4 == Integer.MIN_VALUE ? Math.min(400, n2) : 400;
        }
        n4 = n2 / 2;
        if (n5 == 0x40000000) {
            n3 = n6;
        } else {
            n3 = n4;
            if (n5 == Integer.MIN_VALUE) {
                n3 = Math.min(n4, n6);
            }
        }
        this.setMeasuredDimension(n2, n3);
    }

    /*
     * Enabled aggressive block sorting
     */
    public boolean onTouchEvent(MotionEvent motionEvent) {
        float f2;
        float f3;
        float f4 = -1.0f;
        if (this.h) return this.i.onTouchEvent(motionEvent);
        float f5 = motionEvent.getX();
        float f6 = motionEvent.getY();
        if (motionEvent.getPointerCount() == 2) {
            f3 = motionEvent.getX(1);
            f2 = motionEvent.getY(1);
            f4 = (float)Math.sqrt((f3 - f5) * (f3 - f5) + (f2 - f6) * (f2 - f6));
            f3 = (f3 + f5) / 2.0f;
            f2 = (f6 + f2) / 2.0f;
        } else {
            f2 = -1.0f;
            f3 = -1.0f;
        }
        switch (motionEvent.getAction()) {
            default: {
                break;
            }
            case 2: {
                float f7;
                float f8;
                if (motionEvent.getPointerCount() == 1 && this.g == 1) {
                    f8 = this.b;
                    f7 = this.c;
                    this.a.a(f5 - f8, f6 - f7);
                    this.requestRender();
                }
                if (motionEvent.getPointerCount() != 2 || this.g != 2) break;
                f8 = this.d;
                f7 = this.e;
                this.a.a(f3 - f8, f2 - f7);
                this.d = f3;
                this.e = f2;
                if (!(Math.abs(Math.log(f4 / this.f)) < 0.3)) break;
                this.a.a(f4 / this.f, f3, f2);
                this.requestRender();
            }
        }
        if (motionEvent.getPointerCount() == 2) {
            this.d = f3;
            this.e = f2;
            this.f = f4;
        }
        this.b = f5;
        this.c = f6;
        this.g = motionEvent.getPointerCount();
        return this.i.onTouchEvent(motionEvent);
    }

    public void setCallback(c c2) {
        this.a.x = c2;
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

        public final boolean onSingleTapUp(MotionEvent motionEvent) {
            final float f2 = motionEvent.getX();
            final float f3 = motionEvent.getY();
            GenomePreviewView.this.queueEvent(new Runnable(){

                @Override
                public final void run() {
                    n n2 = GenomePreviewView.this.a;
                    float f22 = f2;
                    float f32 = f3;
                    n2.q = n2.a(f22);
                    n2.r = n2.b(f32);
                    int n3 = n2.p.a(n2.q, n2.r);
                    if (n3 != -1) {
                        n2.x.a(n2.p.x[n3].D);
                    }
                }
            });
            return true;
        }
    }
}

