/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.graphics.Canvas
 *  android.graphics.Paint
 *  android.graphics.Rect
 *  android.graphics.drawable.Drawable
 *  android.util.AttributeSet
 *  android.view.MotionEvent
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.view.ViewConfiguration
 */
package android.support.v4.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.support.v4.view.q;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;

public class PagerTabStrip
extends q {
    private int f;
    private int g;
    private int h;
    private int i;
    private int j;
    private int k;
    private final Paint l = new Paint();
    private final Rect m = new Rect();
    private int n = 255;
    private boolean o = false;
    private boolean p = false;
    private int q;
    private boolean r;
    private float s;
    private float t;
    private int u;

    public PagerTabStrip(Context context) {
        this(context, null);
    }

    public PagerTabStrip(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f = this.e;
        this.l.setColor(this.f);
        float f2 = context.getResources().getDisplayMetrics().density;
        this.g = (int)(3.0f * f2 + 0.5f);
        this.h = (int)(6.0f * f2 + 0.5f);
        this.i = (int)(64.0f * f2);
        this.k = (int)(16.0f * f2 + 0.5f);
        this.q = (int)(1.0f * f2 + 0.5f);
        this.j = (int)(f2 * 32.0f + 0.5f);
        this.u = ViewConfiguration.get((Context)context).getScaledTouchSlop();
        this.setPadding(this.getPaddingLeft(), this.getPaddingTop(), this.getPaddingRight(), this.getPaddingBottom());
        this.setTextSpacing(this.getTextSpacing());
        this.setWillNotDraw(false);
        this.b.setFocusable(true);
        this.b.setOnClickListener(new View.OnClickListener(){

            public final void onClick(View view) {
                PagerTabStrip.this.a.setCurrentItem(PagerTabStrip.this.a.getCurrentItem() - 1);
            }
        });
        this.d.setFocusable(true);
        this.d.setOnClickListener(new View.OnClickListener(){

            public final void onClick(View view) {
                PagerTabStrip.this.a.setCurrentItem(PagerTabStrip.this.a.getCurrentItem() + 1);
            }
        });
        if (this.getBackground() == null) {
            this.o = true;
        }
    }

    @Override
    final void a(int n2, float f2, boolean bl) {
        Rect rect = this.m;
        int n3 = this.getHeight();
        int n4 = this.c.getLeft();
        int n5 = this.k;
        int n6 = this.c.getRight();
        int n7 = this.k;
        int n8 = n3 - this.g;
        rect.set(n4 - n5, n8, n6 + n7, n3);
        super.a(n2, f2, bl);
        this.n = (int)(Math.abs(f2 - 0.5f) * 2.0f * 255.0f);
        rect.union(this.c.getLeft() - this.k, n8, this.c.getRight() + this.k, n3);
        this.invalidate(rect);
    }

    public boolean getDrawFullUnderline() {
        return this.o;
    }

    @Override
    int getMinHeight() {
        return Math.max(super.getMinHeight(), this.j);
    }

    public int getTabIndicatorColor() {
        return this.f;
    }

    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int n2 = this.getHeight();
        int n3 = this.c.getLeft();
        int n4 = this.k;
        int n5 = this.c.getRight();
        int n6 = this.k;
        int n7 = this.g;
        this.l.setColor(this.n << 24 | this.f & 0xFFFFFF);
        canvas.drawRect((float)(n3 - n4), (float)(n2 - n7), (float)(n5 + n6), (float)n2, this.l);
        if (this.o) {
            this.l.setColor(0xFF000000 | this.f & 0xFFFFFF);
            canvas.drawRect((float)this.getPaddingLeft(), (float)(n2 - this.q), (float)(this.getWidth() - this.getPaddingRight()), (float)n2, this.l);
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    public boolean onTouchEvent(MotionEvent motionEvent) {
        boolean bl = false;
        int n2 = motionEvent.getAction();
        if (n2 != 0 && this.r) {
            return bl;
        }
        float f2 = motionEvent.getX();
        float f3 = motionEvent.getY();
        switch (n2) {
            case 0: {
                this.s = f2;
                this.t = f3;
                this.r = false;
                return true;
            }
            case 2: {
                if (!(Math.abs(f2 - this.s) > (float)this.u)) {
                    if (!(Math.abs(f3 - this.t) > (float)this.u)) return true;
                }
                this.r = true;
                return true;
            }
            case 1: {
                if (f2 < (float)(this.c.getLeft() - this.k)) {
                    this.a.setCurrentItem(this.a.getCurrentItem() - 1);
                    return true;
                }
                if (!(f2 > (float)(this.c.getRight() + this.k))) return true;
                this.a.setCurrentItem(this.a.getCurrentItem() + 1);
                return true;
            }
        }
        return true;
    }

    /*
     * Enabled aggressive block sorting
     */
    public void setBackgroundColor(int n2) {
        super.setBackgroundColor(n2);
        if (!this.p) {
            boolean bl = (0xFF000000 & n2) == 0;
            this.o = bl;
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        if (!this.p) {
            boolean bl = drawable == null;
            this.o = bl;
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    public void setBackgroundResource(int n2) {
        super.setBackgroundResource(n2);
        if (!this.p) {
            boolean bl = n2 == 0;
            this.o = bl;
        }
    }

    public void setDrawFullUnderline(boolean bl) {
        this.o = bl;
        this.p = true;
        this.invalidate();
    }

    public void setPadding(int n2, int n3, int n4, int n5) {
        int n6 = n5;
        if (n5 < this.h) {
            n6 = this.h;
        }
        super.setPadding(n2, n3, n4, n6);
    }

    public void setTabIndicatorColor(int n2) {
        this.f = n2;
        this.l.setColor(this.f);
        this.invalidate();
    }

    public void setTabIndicatorColorResource(int n2) {
        this.setTabIndicatorColor(this.getContext().getResources().getColor(n2));
    }

    @Override
    public void setTextSpacing(int n2) {
        int n3 = n2;
        if (n2 < this.i) {
            n3 = this.i;
        }
        super.setTextSpacing(n3);
    }
}

