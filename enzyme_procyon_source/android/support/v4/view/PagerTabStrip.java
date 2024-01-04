// 
// Decompiled by Procyon v0.5.36
// 

package android.support.v4.view;

import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.graphics.Canvas;
import android.view.View;
import android.view.View$OnClickListener;
import android.view.ViewConfiguration;
import android.util.AttributeSet;
import android.content.Context;
import android.graphics.Rect;
import android.graphics.Paint;

public class PagerTabStrip extends q
{
    private int f;
    private int g;
    private int h;
    private int i;
    private int j;
    private int k;
    private final Paint l;
    private final Rect m;
    private int n;
    private boolean o;
    private boolean p;
    private int q;
    private boolean r;
    private float s;
    private float t;
    private int u;
    
    public PagerTabStrip(final Context context) {
        this(context, null);
    }
    
    public PagerTabStrip(final Context context, final AttributeSet set) {
        super(context, set);
        this.l = new Paint();
        this.m = new Rect();
        this.n = 255;
        this.o = false;
        this.p = false;
        this.f = this.e;
        this.l.setColor(this.f);
        final float density = context.getResources().getDisplayMetrics().density;
        this.g = (int)(3.0f * density + 0.5f);
        this.h = (int)(6.0f * density + 0.5f);
        this.i = (int)(64.0f * density);
        this.k = (int)(16.0f * density + 0.5f);
        this.q = (int)(1.0f * density + 0.5f);
        this.j = (int)(density * 32.0f + 0.5f);
        this.u = ViewConfiguration.get(context).getScaledTouchSlop();
        this.setPadding(this.getPaddingLeft(), this.getPaddingTop(), this.getPaddingRight(), this.getPaddingBottom());
        this.setTextSpacing(this.getTextSpacing());
        this.setWillNotDraw(false);
        this.b.setFocusable(true);
        this.b.setOnClickListener((View$OnClickListener)new View$OnClickListener() {
            public final void onClick(final View view) {
                PagerTabStrip.this.a.setCurrentItem(PagerTabStrip.this.a.getCurrentItem() - 1);
            }
        });
        this.d.setFocusable(true);
        this.d.setOnClickListener((View$OnClickListener)new View$OnClickListener() {
            public final void onClick(final View view) {
                PagerTabStrip.this.a.setCurrentItem(PagerTabStrip.this.a.getCurrentItem() + 1);
            }
        });
        if (this.getBackground() == null) {
            this.o = true;
        }
    }
    
    @Override
    final void a(final int n, final float n2, final boolean b) {
        final Rect m = this.m;
        final int height = this.getHeight();
        final int left = this.c.getLeft();
        final int k = this.k;
        final int right = this.c.getRight();
        final int i = this.k;
        final int n3 = height - this.g;
        m.set(left - k, n3, right + i, height);
        super.a(n, n2, b);
        this.n = (int)(Math.abs(n2 - 0.5f) * 2.0f * 255.0f);
        m.union(this.c.getLeft() - this.k, n3, this.c.getRight() + this.k, height);
        this.invalidate(m);
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
    
    protected void onDraw(final Canvas canvas) {
        super.onDraw(canvas);
        final int height = this.getHeight();
        final int left = this.c.getLeft();
        final int k = this.k;
        final int right = this.c.getRight();
        final int i = this.k;
        final int g = this.g;
        this.l.setColor(this.n << 24 | (this.f & 0xFFFFFF));
        canvas.drawRect((float)(left - k), (float)(height - g), (float)(right + i), (float)height, this.l);
        if (this.o) {
            this.l.setColor(0xFF000000 | (this.f & 0xFFFFFF));
            canvas.drawRect((float)this.getPaddingLeft(), (float)(height - this.q), (float)(this.getWidth() - this.getPaddingRight()), (float)height, this.l);
        }
    }
    
    public boolean onTouchEvent(final MotionEvent motionEvent) {
        boolean b = false;
        final int action = motionEvent.getAction();
        if (action == 0 || !this.r) {
            final float x = motionEvent.getX();
            final float y = motionEvent.getY();
            switch (action) {
                case 0: {
                    this.s = x;
                    this.t = y;
                    this.r = false;
                    break;
                }
                case 2: {
                    if (Math.abs(x - this.s) > this.u || Math.abs(y - this.t) > this.u) {
                        this.r = true;
                        break;
                    }
                    break;
                }
                case 1: {
                    if (x < this.c.getLeft() - this.k) {
                        this.a.setCurrentItem(this.a.getCurrentItem() - 1);
                        break;
                    }
                    if (x > this.c.getRight() + this.k) {
                        this.a.setCurrentItem(this.a.getCurrentItem() + 1);
                        break;
                    }
                    break;
                }
            }
            b = true;
        }
        return b;
    }
    
    public void setBackgroundColor(final int backgroundColor) {
        super.setBackgroundColor(backgroundColor);
        if (!this.p) {
            this.o = ((0xFF000000 & backgroundColor) == 0x0);
        }
    }
    
    public void setBackgroundDrawable(final Drawable backgroundDrawable) {
        super.setBackgroundDrawable(backgroundDrawable);
        if (!this.p) {
            this.o = (backgroundDrawable == null);
        }
    }
    
    public void setBackgroundResource(final int backgroundResource) {
        super.setBackgroundResource(backgroundResource);
        if (!this.p) {
            this.o = (backgroundResource == 0);
        }
    }
    
    public void setDrawFullUnderline(final boolean o) {
        this.o = o;
        this.p = true;
        this.invalidate();
    }
    
    public void setPadding(final int n, final int n2, final int n3, final int n4) {
        int h = n4;
        if (n4 < this.h) {
            h = this.h;
        }
        super.setPadding(n, n2, n3, h);
    }
    
    public void setTabIndicatorColor(final int f) {
        this.f = f;
        this.l.setColor(this.f);
        this.invalidate();
    }
    
    public void setTabIndicatorColorResource(final int n) {
        this.setTabIndicatorColor(this.getContext().getResources().getColor(n));
    }
    
    @Override
    public void setTextSpacing(final int n) {
        int i = n;
        if (n < this.i) {
            i = this.i;
        }
        super.setTextSpacing(i);
    }
}
