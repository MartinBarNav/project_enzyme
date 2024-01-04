// 
// Decompiled by Procyon v0.5.36
// 

package com.saterskog.cell_lab;

import android.view.GestureDetector$SimpleOnGestureListener;
import android.view.MotionEvent;
import android.view.View$MeasureSpec;
import android.view.GestureDetector$OnGestureListener;
import android.opengl.GLSurfaceView$Renderer;
import android.preference.PreferenceManager;
import android.util.AttributeSet;
import android.content.Context;
import android.view.GestureDetector;
import android.opengl.GLSurfaceView;

public class GenomePreviewView extends GLSurfaceView
{
    public final n a;
    float b;
    float c;
    float d;
    float e;
    float f;
    int g;
    boolean h;
    GestureDetector i;
    
    public GenomePreviewView(final Context context, final AttributeSet set) {
        super(context, set);
        this.setEGLContextClientVersion(2);
        this.h = PreferenceManager.getDefaultSharedPreferences(this.getContext()).getBoolean("lock_preview", true);
        this.setEGLConfigChooser(8, 8, 8, 0, 16, 0);
        this.setRenderer((GLSurfaceView$Renderer)(this.a = new n(context)));
        this.setRenderMode(0);
        this.g = -1;
        this.i = new GestureDetector(context, (GestureDetector$OnGestureListener)new a((byte)0));
    }
    
    protected void onMeasure(int b, int min) {
        final int mode = View$MeasureSpec.getMode(b);
        b = View$MeasureSpec.getSize(b);
        final int mode2 = View$MeasureSpec.getMode(min);
        final int size = View$MeasureSpec.getSize(min);
        if (mode != 1073741824) {
            if (mode == Integer.MIN_VALUE) {
                b = Math.min(400, b);
            }
            else {
                b = 400;
            }
        }
        final int a = b / 2;
        if (mode2 == 1073741824) {
            min = size;
        }
        else {
            min = a;
            if (mode2 == Integer.MIN_VALUE) {
                min = Math.min(a, size);
            }
        }
        this.setMeasuredDimension(b, min);
    }
    
    public boolean onTouchEvent(final MotionEvent motionEvent) {
        float f = -1.0f;
        if (!this.h) {
            final float x = motionEvent.getX();
            final float y = motionEvent.getY();
            float n;
            float n2;
            if (motionEvent.getPointerCount() == 2) {
                final float x2 = motionEvent.getX(1);
                final float y2 = motionEvent.getY(1);
                f = (float)Math.sqrt((x2 - x) * (x2 - x) + (y2 - y) * (y2 - y));
                n = (x2 + x) / 2.0f;
                n2 = (y + y2) / 2.0f;
            }
            else {
                n2 = -1.0f;
                n = -1.0f;
            }
            switch (motionEvent.getAction()) {
                case 2: {
                    if (motionEvent.getPointerCount() == 1 && this.g == 1) {
                        this.a.a(x - this.b, y - this.c);
                        this.requestRender();
                    }
                    if (motionEvent.getPointerCount() != 2 || this.g != 2) {
                        break;
                    }
                    this.a.a(n - this.d, n2 - this.e);
                    this.d = n;
                    this.e = n2;
                    if (Math.abs(Math.log(f / this.f)) < 0.3) {
                        this.a.a(f / this.f, n, n2);
                        this.requestRender();
                        break;
                    }
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
            this.g = motionEvent.getPointerCount();
        }
        return this.i.onTouchEvent(motionEvent);
    }
    
    public void setCallback(final c x) {
        this.a.x = x;
    }
    
    private final class a extends GestureDetector$SimpleOnGestureListener
    {
        public final boolean onDoubleTap(final MotionEvent motionEvent) {
            return true;
        }
        
        public final boolean onDown(final MotionEvent motionEvent) {
            return true;
        }
        
        public final boolean onSingleTapUp(final MotionEvent motionEvent) {
            GenomePreviewView.this.queueEvent((Runnable)new Runnable() {
                final /* synthetic */ float a = motionEvent.getX();
                final /* synthetic */ float b = motionEvent.getY();
                
                @Override
                public final void run() {
                    final n a = GenomePreviewView.this.a;
                    final float a2 = this.a;
                    final float b = this.b;
                    a.q = a.a(a2);
                    a.r = a.b(b);
                    final int a3 = a.p.a(a.q, a.r);
                    if (a3 != -1) {
                        a.x.a(a.p.x[a3].D);
                    }
                }
            });
            return true;
        }
    }
}
