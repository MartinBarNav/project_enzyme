/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.res.Resources$NotFoundException
 *  android.database.DataSetObserver
 *  android.graphics.Canvas
 *  android.graphics.Rect
 *  android.graphics.drawable.Drawable
 *  android.os.Build$VERSION
 *  android.os.Bundle
 *  android.os.Parcel
 *  android.os.Parcelable
 *  android.os.Parcelable$Creator
 *  android.util.AttributeSet
 *  android.util.Log
 *  android.view.FocusFinder
 *  android.view.KeyEvent
 *  android.view.MotionEvent
 *  android.view.SoundEffectConstants
 *  android.view.VelocityTracker
 *  android.view.View
 *  android.view.View$BaseSavedState
 *  android.view.View$MeasureSpec
 *  android.view.ViewConfiguration
 *  android.view.ViewGroup
 *  android.view.ViewGroup$LayoutParams
 *  android.view.ViewParent
 *  android.view.accessibility.AccessibilityEvent
 *  android.view.animation.Interpolator
 *  android.widget.Scroller
 */
package android.support.v4.view;

import android.content.Context;
import android.content.res.Resources;
import android.database.DataSetObserver;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.c.a;
import android.support.v4.view.ab;
import android.support.v4.view.n;
import android.support.v4.view.p;
import android.support.v4.view.s;
import android.support.v4.view.u;
import android.util.AttributeSet;
import android.util.Log;
import android.view.FocusFinder;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.SoundEffectConstants;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.animation.Interpolator;
import android.widget.Scroller;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ViewPager
extends ViewGroup {
    private static final int[] a = new int[]{16842931};
    private static final j ag;
    private static final Comparator<b> c;
    private static final Interpolator d;
    private boolean A;
    private boolean B;
    private int C;
    private int D;
    private int E;
    private float F;
    private float G;
    private float H;
    private float I;
    private int J = -1;
    private VelocityTracker K;
    private int L;
    private int M;
    private int N;
    private int O;
    private boolean P;
    private android.support.v4.f.d Q;
    private android.support.v4.f.d R;
    private boolean S = true;
    private boolean T = false;
    private boolean U;
    private int V;
    private f W;
    private f aa;
    private e ab;
    private g ac;
    private Method ad;
    private int ae;
    private ArrayList<View> af;
    private final Runnable ah;
    private int ai = 0;
    private int b;
    private final ArrayList<b> e = new ArrayList();
    private final b f = new b();
    private final Rect g = new Rect();
    private p h;
    private int i;
    private int j = -1;
    private Parcelable k = null;
    private ClassLoader l = null;
    private Scroller m;
    private h n;
    private int o;
    private Drawable p;
    private int q;
    private int r;
    private float s = -3.4028235E38f;
    private float t = Float.MAX_VALUE;
    private int u;
    private int v;
    private boolean w;
    private boolean x;
    private boolean y;
    private int z = 1;

    static {
        c = new Comparator<b>(){};
        d = new Interpolator(){

            public final float getInterpolation(float f2) {
                return (f2 -= 1.0f) * (f2 * f2 * f2 * f2) + 1.0f;
            }
        };
        ag = new j();
    }

    public ViewPager(Context context) {
        super(context);
        this.ah = new Runnable(){

            @Override
            public final void run() {
                ViewPager.this.setScrollState(0);
                ViewPager.this.b();
            }
        };
        this.d();
    }

    public ViewPager(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.ah = new /* invalid duplicate definition of identical inner class */;
        this.d();
    }

    /*
     * Enabled aggressive block sorting
     */
    private Rect a(Rect rect, View view) {
        if (rect == null) {
            rect = new Rect();
        }
        if (view == null) {
            rect.set(0, 0, 0, 0);
            return rect;
        } else {
            rect.left = view.getLeft();
            rect.right = view.getRight();
            rect.top = view.getTop();
            rect.bottom = view.getBottom();
            for (view = view.getParent(); view instanceof ViewGroup && view != this; rect.left += view.getLeft(), rect.right += view.getRight(), rect.top += view.getTop(), rect.bottom += view.getBottom(), view = view.getParent()) {
                view = (ViewGroup)view;
            }
        }
        return rect;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private b a(int n2, int n3) {
        b b2 = new b();
        b2.b = n2;
        b2.a = this.h.a(this, n2);
        b2.d = 1.0f;
        if (n3 < 0 || n3 >= this.e.size()) {
            this.e.add(b2);
            return b2;
        }
        this.e.add(n3, b2);
        return b2;
    }

    /*
     * WARNING - void declaration
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private b a(View object) {
        void var1_3;
        for (int i2 = 0; i2 < this.e.size(); ++i2) {
            b b2 = this.e.get(i2);
            if (!this.h.a((View)object, b2.a)) continue;
            b b3 = b2;
            return var1_3;
        }
        return var1_3;
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private void a(int n2) {
        void var8_49;
        void var8_43;
        void var8_13;
        int n3;
        int n4;
        int n5;
        int n6;
        Object object;
        int n7;
        block47: {
            if (this.i != n2) {
                n7 = this.i < n2 ? 66 : 17;
                object = this.b(this.i);
                this.i = n2;
                n6 = n7;
            } else {
                object = null;
                n6 = 2;
            }
            if (this.h == null) {
                this.e();
                return;
            }
            if (this.y) {
                this.e();
                return;
            }
            if (this.getWindowToken() == null) return;
            n2 = this.z;
            n5 = Math.max(0, this.i - n2);
            n4 = this.h.b();
            n3 = Math.min(n4 - 1, n2 + this.i);
            if (n4 != this.b) {
                void var8_9;
                try {
                    String string = this.getResources().getResourceName(this.getId());
                    throw new IllegalStateException("The application's PagerAdapter changed the adapter's contents without calling PagerAdapter#notifyDataSetChanged! Expected adapter item count: " + this.b + ", found: " + n4 + " Pager id: " + (String)var8_9 + " Pager class: " + ((Object)((Object)this)).getClass() + " Problematic adapter: " + this.h.getClass());
                }
                catch (Resources.NotFoundException notFoundException) {
                    String string = Integer.toHexString(this.getId());
                    throw new IllegalStateException("The application's PagerAdapter changed the adapter's contents without calling PagerAdapter#notifyDataSetChanged! Expected adapter item count: " + this.b + ", found: " + n4 + " Pager id: " + (String)var8_9 + " Pager class: " + ((Object)((Object)this)).getClass() + " Problematic adapter: " + this.h.getClass());
                }
            }
            for (n2 = 0; n2 < this.e.size(); ++n2) {
                b b2 = this.e.get(n2);
                if (b2.b < this.i) continue;
                if (b2.b != this.i) break;
                break block47;
            }
            Object var8_53 = null;
        }
        Object object2 = var8_13 == null && n4 > 0 ? this.a(this.i, n2) : var8_13;
        if (object2 != null) {
            float f2;
            void var8_15;
            int n8;
            int n9 = n2 - 1;
            if (n9 >= 0) {
                b b3 = this.e.get(n9);
            } else {
                Object var8_21 = null;
            }
            float f3 = (n8 = this.getClientWidth()) <= 0 ? 0.0f : 2.0f - object2.d + (float)this.getPaddingLeft() / (float)n8;
            n7 = this.i;
            float f4 = 0.0f;
            int n10 = n2;
            void var16_61 = var8_15;
            for (int i2 = n7 - 1; i2 >= 0; --i2) {
                void var8_20;
                if (f4 >= f3 && i2 < n5) {
                    if (var16_61 == null) break;
                    void var8_17 = var16_61;
                    n2 = n9;
                    f2 = f4;
                    n7 = n10;
                    if (i2 == var16_61.b) {
                        void var8_18 = var16_61;
                        n2 = n9;
                        f2 = f4;
                        n7 = n10;
                        if (!var16_61.c) {
                            this.e.remove(n9);
                            this.h.a(var16_61.a);
                            n2 = n9 - 1;
                            n7 = n10 - 1;
                            if (n2 >= 0) {
                                b b4 = this.e.get(n2);
                                f2 = f4;
                            } else {
                                Object var8_22 = null;
                                f2 = f4;
                            }
                        }
                    }
                } else if (var16_61 != null && i2 == var16_61.b) {
                    f2 = f4 + var16_61.d;
                    n2 = n9 - 1;
                    if (n2 >= 0) {
                        b b5 = this.e.get(n2);
                        n7 = n10;
                    } else {
                        Object var8_24 = null;
                        n7 = n10;
                    }
                } else {
                    f2 = f4 + this.a((int)i2, (int)(n9 + 1)).d;
                    n7 = n10 + 1;
                    if (n9 >= 0) {
                        b b6 = this.e.get(n9);
                        n2 = n9;
                    } else {
                        Object var8_26 = null;
                        n2 = n9;
                    }
                }
                var16_61 = var8_20;
                n9 = n2;
                f4 = f2;
                n10 = n7;
            }
            f2 = object2.d;
            n2 = n10 + 1;
            if (f2 < 2.0f) {
                if (n2 < this.e.size()) {
                    b b7 = this.e.get(n2);
                } else {
                    Object var8_31 = null;
                }
                f3 = n8 <= 0 ? 0.0f : (float)this.getPaddingRight() / (float)n8 + 2.0f;
                n7 = this.i;
                ++n7;
                while (n7 < n4) {
                    void var8_29;
                    if (f2 >= f3 && n7 > n3) {
                        if (var8_29 == null) break;
                        if (n7 == var8_29.b && !var8_29.c) {
                            this.e.remove(n2);
                            this.h.a(var8_29.a);
                            if (n2 < this.e.size()) {
                                b b8 = this.e.get(n2);
                            } else {
                                Object var8_32 = null;
                            }
                        }
                    } else if (var8_29 != null && n7 == var8_29.b) {
                        f4 = var8_29.d;
                        if (++n2 < this.e.size()) {
                            b b9 = this.e.get(n2);
                        } else {
                            Object var8_35 = null;
                        }
                        f2 += f4;
                    } else {
                        b b10 = this.a(n7, n2);
                        f4 = b10.d;
                        if (++n2 < this.e.size()) {
                            b b11 = this.e.get(n2);
                        } else {
                            Object var8_39 = null;
                        }
                        f2 += f4;
                    }
                    ++n7;
                }
            }
            this.a((b)object2, n10, (b)object);
        }
        object = this.h;
        if (object2 != null) {
            Object object3 = object2.a;
        } else {
            Object var8_46 = null;
        }
        ((p)object).b(var8_43);
        this.h.a();
        n7 = this.getChildCount();
        for (n2 = 0; n2 < n7; ++n2) {
            object = this.getChildAt(n2);
            c c2 = (c)object.getLayoutParams();
            c2.f = n2;
            if (c2.a || c2.c != 0.0f || (object = this.a((View)object)) == null) continue;
            c2.c = ((b)object).d;
            c2.e = ((b)object).b;
        }
        this.e();
        if (!this.hasFocus()) return;
        View view = this.findFocus();
        if (view != null) {
            b b12 = this.b(view);
        } else {
            Object var8_52 = null;
        }
        if (var8_49 != null) {
            if (var8_49.b == this.i) return;
        }
        n2 = 0;
        while (n2 < this.getChildCount()) {
            View view2 = this.getChildAt(n2);
            object = this.a(view2);
            if (object != null && ((b)object).b == this.i) {
                if (view2.requestFocus(n6)) return;
            }
            ++n2;
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    private void a(int n2, float f2) {
        View view;
        int n3;
        if (this.V > 0) {
            int n4 = this.getScrollX();
            n3 = this.getPaddingLeft();
            int n5 = this.getPaddingRight();
            int n6 = this.getWidth();
            int n7 = this.getChildCount();
            for (int i2 = 0; i2 < n7; ++i2) {
                int n8;
                int n9;
                view = this.getChildAt(i2);
                c c2 = (c)view.getLayoutParams();
                if (c2.a) {
                    int n10;
                    switch (c2.b & 7) {
                        default: {
                            n9 = n3;
                            n8 = n5;
                            n5 = n3;
                            n3 = n8;
                            break;
                        }
                        case 3: {
                            n9 = view.getWidth();
                            n8 = n9 + n3;
                            n9 = n3;
                            n3 = n5;
                            n5 = n8;
                            break;
                        }
                        case 1: {
                            n9 = Math.max((n6 - view.getMeasuredWidth()) / 2, n3);
                            n8 = n3;
                            n3 = n5;
                            n5 = n8;
                            break;
                        }
                        case 5: {
                            n9 = n6 - n5 - view.getMeasuredWidth();
                            n10 = view.getMeasuredWidth();
                            n8 = n3;
                            n3 = n5 + n10;
                            n5 = n8;
                        }
                    }
                    n10 = n9 + n4 - view.getLeft();
                    n9 = n3;
                    n8 = n5;
                    if (n10 != 0) {
                        view.offsetLeftAndRight(n10);
                        n8 = n5;
                        n9 = n3;
                    }
                } else {
                    n9 = n5;
                    n8 = n3;
                }
                n3 = n8;
                n5 = n9;
            }
        }
        if (this.W != null) {
            this.W.a(n2, f2);
        }
        if (this.aa != null) {
            this.aa.a(n2, f2);
        }
        if (this.ac != null) {
            this.getScrollX();
            n3 = this.getChildCount();
            for (n2 = 0; n2 < n3; ++n2) {
                view = this.getChildAt(n2);
                if (((c)view.getLayoutParams()).a) continue;
                view.getLeft();
                this.getClientWidth();
            }
        }
        this.U = true;
    }

    /*
     * Enabled aggressive block sorting
     */
    private void a(int n2, int n3, int n4, int n5) {
        if (n3 > 0 && !this.e.isEmpty()) {
            int n6 = this.getPaddingLeft();
            int n7 = this.getPaddingRight();
            int n8 = this.getPaddingLeft();
            int n9 = this.getPaddingRight();
            float f2 = (float)this.getScrollX() / (float)(n3 - n8 - n9 + n5);
            n4 = (int)((float)(n2 - n6 - n7 + n4) * f2);
            this.scrollTo(n4, this.getScrollY());
            if (this.m.isFinished()) return;
            n5 = this.m.getDuration();
            n3 = this.m.timePassed();
            b b2 = this.b(this.i);
            this.m.startScroll(n4, 0, (int)(b2.e * (float)n2), 0, n5 - n3);
            return;
        }
        b b3 = this.b(this.i);
        float f3 = b3 != null ? Math.min(b3.e, this.t) : 0.0f;
        if ((n2 = (int)(f3 * (float)(n2 - this.getPaddingLeft() - this.getPaddingRight()))) == this.getScrollX()) return;
        this.a(false);
        this.scrollTo(n2, this.getScrollY());
    }

    /*
     * Enabled aggressive block sorting
     */
    private void a(int n2, boolean bl, int n3, boolean bl2) {
        b b2 = this.b(n2);
        int n4 = 0;
        if (b2 != null) {
            n4 = (int)((float)this.getClientWidth() * Math.max(this.s, Math.min(b2.e, this.t)));
        }
        if (bl) {
            if (this.getChildCount() == 0) {
                this.setScrollingCacheEnabled(false);
            } else {
                int n5 = this.getScrollX();
                int n6 = this.getScrollY();
                int n7 = n4 - n5;
                n4 = 0 - n6;
                if (n7 == 0 && n4 == 0) {
                    this.a(false);
                    this.b();
                    this.setScrollState(0);
                } else {
                    this.setScrollingCacheEnabled(true);
                    this.setScrollState(2);
                    int n8 = this.getClientWidth();
                    int n9 = n8 / 2;
                    float f2 = Math.min(1.0f, 1.0f * (float)Math.abs(n7) / (float)n8);
                    float f3 = n9;
                    float f4 = n9;
                    f2 = (float)Math.sin((float)((double)(f2 - 0.5f) * 0.4712389167638204));
                    n3 = Math.abs(n3);
                    if (n3 > 0) {
                        n3 = Math.round(1000.0f * Math.abs((f4 * f2 + f3) / (float)n3)) * 4;
                    } else {
                        f3 = n8;
                        n3 = (int)(((float)Math.abs(n7) / (f3 * 1.0f + (float)this.o) + 1.0f) * 100.0f);
                    }
                    n3 = Math.min(n3, 600);
                    this.m.startScroll(n5, n6, n7, n4, n3);
                    android.support.v4.view.u.b((View)this);
                }
            }
            if (bl2 && this.W != null) {
                this.W.a(n2);
            }
            if (!bl2) return;
            if (this.aa == null) return;
            this.aa.a(n2);
            return;
        }
        if (bl2 && this.W != null) {
            this.W.a(n2);
        }
        if (bl2 && this.aa != null) {
            this.aa.a(n2);
        }
        this.a(false);
        this.scrollTo(n4, 0);
        this.c(n4);
    }

    private void a(int n2, boolean bl, boolean bl2) {
        this.a(n2, bl, bl2, 0);
    }

    /*
     * Enabled aggressive block sorting
     */
    private void a(int n2, boolean bl, boolean bl2, int n3) {
        int n4;
        boolean bl3 = false;
        if (this.h == null || this.h.b() <= 0) {
            this.setScrollingCacheEnabled(false);
            return;
        }
        if (!bl2 && this.i == n2 && this.e.size() != 0) {
            this.setScrollingCacheEnabled(false);
            return;
        }
        if (n2 < 0) {
            n4 = 0;
        } else {
            n4 = n2;
            if (n2 >= this.h.b()) {
                n4 = this.h.b() - 1;
            }
        }
        if (n4 > this.i + (n2 = this.z) || n4 < this.i - n2) {
            for (n2 = 0; n2 < this.e.size(); ++n2) {
                this.e.get((int)n2).c = true;
            }
        }
        bl2 = bl3;
        if (this.i != n4) {
            bl2 = true;
        }
        if (!this.S) {
            this.a(n4);
            this.a(n4, bl, n3, bl2);
            return;
        }
        this.i = n4;
        if (bl2 && this.W != null) {
            this.W.a(n4);
        }
        if (bl2 && this.aa != null) {
            this.aa.a(n4);
        }
        this.requestLayout();
    }

    /*
     * Enabled aggressive block sorting
     */
    private void a(b b2, int n2, b b3) {
        int n3;
        float f2;
        float f3;
        int n4;
        int n5;
        block12: {
            block15: {
                block14: {
                    block13: {
                        n5 = this.h.b();
                        n4 = this.getClientWidth();
                        f3 = n4 > 0 ? (float)this.o / (float)n4 : 0.0f;
                        if (b3 == null) break block12;
                        n4 = b3.b;
                        if (n4 >= b2.b) break block13;
                        f2 = b3.e + b3.d + f3;
                        n3 = 0;
                        ++n4;
                        break block14;
                    }
                    if (n4 <= b2.b) break block12;
                    n3 = this.e.size();
                    f2 = b3.e;
                    --n3;
                    --n4;
                    break block15;
                }
                while (n4 <= b2.b && n3 < this.e.size()) {
                    b3 = this.e.get(n3);
                    while (n4 > b3.b && n3 < this.e.size() - 1) {
                        b3 = this.e.get(++n3);
                    }
                    while (n4 < b3.b) {
                        ++n4;
                        f2 = 1.0f + f3 + f2;
                    }
                    b3.e = f2;
                    f2 += b3.d + f3;
                    ++n4;
                }
                break block12;
            }
            while (n4 >= b2.b && n3 >= 0) {
                b3 = this.e.get(n3);
                while (n4 < b3.b && n3 > 0) {
                    b3 = this.e.get(--n3);
                }
                while (n4 > b3.b) {
                    --n4;
                    f2 -= 1.0f + f3;
                }
                b3.e = f2 -= b3.d + f3;
                --n4;
            }
        }
        int n6 = this.e.size();
        float f4 = b2.e;
        n4 = b2.b - 1;
        f2 = b2.b == 0 ? b2.e : -3.4028235E38f;
        this.s = f2;
        f2 = b2.b == n5 - 1 ? b2.e + b2.d - 1.0f : Float.MAX_VALUE;
        this.t = f2;
        f2 = f4;
        for (n3 = n2 - 1; n3 >= 0; --n4, --n3) {
            b3 = this.e.get(n3);
            while (n4 > b3.b) {
                --n4;
                f2 -= 1.0f + f3;
            }
            b3.e = f2 -= b3.d + f3;
            if (b3.b != 0) continue;
            this.s = f2;
        }
        f2 = b2.e + b2.d + f3;
        n3 = b2.b + 1;
        n4 = n2 + 1;
        n2 = n3;
        while (true) {
            if (n4 >= n6) {
                this.T = false;
                return;
            }
            b2 = this.e.get(n4);
            while (n2 < b2.b) {
                ++n2;
                f2 += 1.0f + f3;
            }
            if (b2.b == n5 - 1) {
                this.t = b2.d + f2 - 1.0f;
            }
            b2.e = f2;
            f2 += b2.d + f3;
            ++n2;
            ++n4;
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    private void a(MotionEvent motionEvent) {
        int n2 = android.support.v4.view.n.b(motionEvent);
        if (android.support.v4.view.n.b(motionEvent, n2) == this.J) {
            n2 = n2 == 0 ? 1 : 0;
            this.F = android.support.v4.view.n.c(motionEvent, n2);
            this.J = android.support.v4.view.n.b(motionEvent, n2);
            if (this.K != null) {
                this.K.clear();
            }
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    private void a(boolean bl) {
        int n2;
        int n3;
        int n4 = this.ai == 2 ? 1 : 0;
        if (n4 != 0) {
            this.setScrollingCacheEnabled(false);
            this.m.abortAnimation();
            n3 = this.getScrollX();
            n2 = this.getScrollY();
            int n5 = this.m.getCurrX();
            int n6 = this.m.getCurrY();
            if (n3 != n5 || n2 != n6) {
                this.scrollTo(n5, n6);
            }
        }
        this.y = false;
        n2 = 0;
        n3 = n4;
        for (n4 = n2; n4 < this.e.size(); ++n4) {
            b b2 = this.e.get(n4);
            if (!b2.c) continue;
            b2.c = false;
            n3 = 1;
        }
        if (n3 == 0) return;
        if (bl) {
            android.support.v4.view.u.a((View)this, this.ah);
            return;
        }
        this.ah.run();
    }

    /*
     * Enabled aggressive block sorting
     */
    private boolean a(float f2) {
        boolean bl;
        boolean bl2 = true;
        boolean bl3 = false;
        boolean bl4 = false;
        float f3 = this.F;
        this.F = f2;
        float f4 = (float)this.getScrollX() + (f3 - f2);
        int n2 = this.getClientWidth();
        f2 = (float)n2 * this.s;
        float f5 = n2;
        f3 = this.t;
        b b2 = this.e.get(0);
        b b3 = this.e.get(this.e.size() - 1);
        if (b2.b != 0) {
            f2 = b2.e * (float)n2;
            bl = false;
        } else {
            bl = true;
        }
        if (b3.b != this.h.b() - 1) {
            f3 = b3.e * (float)n2;
            bl2 = false;
        } else {
            f3 = f5 * f3;
        }
        if (f4 < f2) {
            f3 = f2;
            if (bl) {
                bl4 = this.Q.a(Math.abs(f2 - f4) / (float)n2);
                f3 = f2;
            }
        } else if (f4 > f3) {
            bl4 = bl3;
            if (bl2) {
                bl4 = this.R.a(Math.abs(f4 - f3) / (float)n2);
            }
        } else {
            f3 = f4;
        }
        this.F += f3 - (float)((int)f3);
        this.scrollTo((int)f3, this.getScrollY());
        this.c((int)f3);
        return bl4;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private boolean a(View view, boolean bl, int n2, int n3, int n4) {
        boolean bl2 = true;
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup)view;
            int n5 = view.getScrollX();
            int n6 = view.getScrollY();
            for (int i2 = viewGroup.getChildCount() - 1; i2 >= 0; --i2) {
                View view2 = viewGroup.getChildAt(i2);
                if (n3 + n5 < view2.getLeft() || n3 + n5 >= view2.getRight() || n4 + n6 < view2.getTop() || n4 + n6 >= view2.getBottom() || !this.a(view2, true, n2, n3 + n5 - view2.getLeft(), n4 + n6 - view2.getTop())) continue;
                return bl2;
            }
        }
        if (!bl) return false;
        bl = bl2;
        if (android.support.v4.view.u.a(view, -n2)) return bl;
        return false;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private b b(int n2) {
        int n3 = 0;
        while (n3 < this.e.size()) {
            b b2 = this.e.get(n3);
            if (b2.b == n2) {
                return b2;
            }
            ++n3;
        }
        return null;
    }

    /*
     * WARNING - void declaration
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private b b(View object) {
        void var1_4;
        void var1_2;
        ViewParent viewParent;
        while ((viewParent = var1_2.getParent()) != this) {
            if (viewParent == null || !(viewParent instanceof View)) {
                Object var1_3 = null;
                return var1_4;
            }
            View view = (View)viewParent;
        }
        b b2 = this.a((View)var1_2);
        return var1_4;
    }

    private boolean c(int n2) {
        boolean bl = false;
        if (this.e.size() == 0) {
            this.U = false;
            this.a(0, 0.0f);
            if (!this.U) {
                throw new IllegalStateException("onPageScrolled did not call superclass implementation");
            }
        } else {
            b b2 = this.g();
            int n3 = this.getClientWidth();
            float f2 = (float)this.o / (float)n3;
            int n4 = b2.b;
            f2 = ((float)n2 / (float)n3 - b2.e) / (b2.d + f2);
            this.U = false;
            this.a(n4, f2);
            if (!this.U) {
                throw new IllegalStateException("onPageScrolled did not call superclass implementation");
            }
            bl = true;
        }
        return bl;
    }

    private void d() {
        this.setWillNotDraw(false);
        this.setDescendantFocusability(262144);
        this.setFocusable(true);
        Context context = this.getContext();
        this.m = new Scroller(context, d);
        ViewConfiguration viewConfiguration = ViewConfiguration.get((Context)context);
        float f2 = context.getResources().getDisplayMetrics().density;
        this.E = android.support.v4.view.ab.a(viewConfiguration);
        this.L = (int)(400.0f * f2);
        this.M = viewConfiguration.getScaledMaximumFlingVelocity();
        this.Q = new android.support.v4.f.d(context);
        this.R = new android.support.v4.f.d(context);
        this.N = (int)(25.0f * f2);
        this.O = (int)(2.0f * f2);
        this.C = (int)(16.0f * f2);
        android.support.v4.view.u.a((View)this, new d());
        if (android.support.v4.view.u.c((View)this) == 0) {
            android.support.v4.view.u.d((View)this);
        }
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    private boolean d(int var1_1) {
        block13: {
            block10: {
                block14: {
                    block12: {
                        block11: {
                            var2_2 = false;
                            var3_3 = this.findFocus();
                            if (var3_3 != this) break block11;
                            var4_4 = null;
                            break block12;
                        }
                        if (var3_3 == null) break block13;
                        var4_4 = var3_3.getParent();
                        break block14;
                    }
lbl11:
                    // 3 sources

                    while (true) {
                        block17: {
                            block18: {
                                block19: {
                                    block15: {
                                        block16: {
                                            var3_3 = FocusFinder.getInstance().findNextFocus((ViewGroup)this, var4_4, var1_1);
                                            if (var3_3 == null || var3_3 == var4_4) break block15;
                                            if (var1_1 != 17) break block16;
                                            var5_5 = this.a((Rect)this.g, (View)var3_3).left;
                                            var6_6 = this.a((Rect)this.g, (View)var4_4).left;
                                            var2_2 = var4_4 != null && var5_5 >= var6_6 ? this.i() : var3_3.requestFocus();
                                            break block17;
                                        }
                                        if (var1_1 != 66) break block17;
                                        var6_7 = this.a((Rect)this.g, (View)var3_3).left;
                                        var5_5 = this.a((Rect)this.g, (View)var4_4).left;
                                        if (var4_4 != null && var6_7 <= var5_5) break block18;
                                        var2_2 = var3_3.requestFocus();
                                        break block17;
                                    }
                                    if (var1_1 != 17 && var1_1 != 1) break block19;
                                    var2_2 = this.i();
                                    break block17;
                                }
                                if (var1_1 != 66 && var1_1 != 2) break block17;
                            }
                            if (this.h != null && this.i < this.h.b() - 1) {
                                this.a(this.i + 1, true);
                                var2_2 = true;
                            } else {
                                var2_2 = false;
                            }
                        }
                        if (var2_2 == false) return var2_2;
                        this.playSoundEffect(SoundEffectConstants.getContantForFocusDirection((int)var1_1));
                        return var2_2;
                    }
                }
                while (var4_4 instanceof ViewGroup) {
                    if (var4_4 == this) {
                        var5_5 = 1;
                        break block10;
                    }
                    var4_4 = var4_4.getParent();
                }
                var5_5 = 0;
            }
            if (var5_5 != 0) break block13;
            var7_8 = new StringBuilder();
            var7_8.append(var3_3.getClass().getSimpleName());
            var4_4 = var3_3.getParent();
            while (var4_4 instanceof ViewGroup) {
                var7_8.append(" => ").append(var4_4.getClass().getSimpleName());
                var4_4 = var4_4.getParent();
            }
            Log.e((String)"ViewPager", (String)("arrowScroll tried to find focus based on non-child current focused view " + var7_8.toString()));
            var4_4 = null;
            ** GOTO lbl11
        }
        var4_4 = var3_3;
        ** while (true)
    }

    /*
     * Enabled aggressive block sorting
     */
    private void e() {
        if (this.ae != 0) {
            if (this.af == null) {
                this.af = new ArrayList();
            } else {
                this.af.clear();
            }
            int n2 = this.getChildCount();
            for (int i2 = 0; i2 < n2; ++i2) {
                View view = this.getChildAt(i2);
                this.af.add(view);
            }
            Collections.sort(this.af, ag);
        }
    }

    private void f() {
        ViewParent viewParent = this.getParent();
        if (viewParent != null) {
            viewParent.requestDisallowInterceptTouchEvent(true);
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    private b g() {
        int n2 = this.getClientWidth();
        float f2 = n2 > 0 ? (float)this.getScrollX() / (float)n2 : 0.0f;
        float f3 = n2 > 0 ? (float)this.o / (float)n2 : 0.0f;
        float f4 = 0.0f;
        float f5 = 0.0f;
        int n3 = -1;
        n2 = 0;
        boolean bl = true;
        b b2 = null;
        while (true) {
            b b3 = b2;
            if (n2 >= this.e.size()) return b3;
            b b4 = this.e.get(n2);
            if (!bl && b4.b != n3 + 1) {
                b4 = this.f;
                b4.e = f4 + f5 + f3;
                b4.b = n3 + 1;
                b4.d = 1.0f;
                --n2;
            }
            f5 = b4.e;
            f4 = b4.d;
            if (!bl) {
                b3 = b2;
                if (!(f2 >= f5)) return b3;
            }
            if (f2 < f4 + f5 + f3) return b4;
            if (n2 == this.e.size() - 1) {
                return b4;
            }
            n3 = b4.b;
            f4 = b4.d;
            bl = false;
            ++n2;
            b2 = b4;
        }
    }

    private int getClientWidth() {
        return this.getMeasuredWidth() - this.getPaddingLeft() - this.getPaddingRight();
    }

    private void h() {
        this.A = false;
        this.B = false;
        if (this.K != null) {
            this.K.recycle();
            this.K = null;
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private boolean i() {
        boolean bl = true;
        if (this.i <= 0) return false;
        this.a(this.i - 1, true);
        return bl;
    }

    /*
     * Enabled aggressive block sorting
     */
    private void setScrollState(int n2) {
        if (this.ai == n2) {
            return;
        }
        this.ai = n2;
        if (this.ac != null) {
            boolean bl = n2 != 0;
            int n3 = this.getChildCount();
            for (int i2 = 0; i2 < n3; ++i2) {
                int n4 = bl ? 2 : 0;
                android.support.v4.view.u.b(this.getChildAt(i2), n4);
            }
        }
        if (this.W == null) return;
        this.W.b(n2);
    }

    private void setScrollingCacheEnabled(boolean bl) {
        if (this.x != bl) {
            this.x = bl;
        }
    }

    final f a(f f2) {
        f f3 = this.aa;
        this.aa = f2;
        return f3;
    }

    /*
     * Enabled aggressive block sorting
     */
    final void a() {
        int n2;
        int n3;
        this.b = n3 = this.h.b();
        n3 = this.e.size() < this.z * 2 + 1 && this.e.size() < n3 ? 1 : 0;
        int n4 = this.i;
        for (n2 = 0; n2 < this.e.size(); ++n2) {
            this.e.get(n2);
        }
        Collections.sort(this.e, c);
        if (n3 != 0) {
            n2 = this.getChildCount();
            for (n3 = 0; n3 < n2; ++n3) {
                c c2 = (c)this.getChildAt(n3).getLayoutParams();
                if (c2.a) continue;
                c2.c = 0.0f;
            }
            this.a(n4, false, true);
            this.requestLayout();
        }
    }

    public final void a(int n2, boolean bl) {
        this.y = false;
        this.a(n2, bl, false);
    }

    /*
     * Enabled aggressive block sorting
     */
    public void addFocusables(ArrayList<View> arrayList, int n2, int n3) {
        int n4 = arrayList.size();
        int n5 = this.getDescendantFocusability();
        if (n5 != 393216) {
            for (int i2 = 0; i2 < this.getChildCount(); ++i2) {
                b b2;
                View view = this.getChildAt(i2);
                if (view.getVisibility() != 0 || (b2 = this.a(view)) == null || b2.b != this.i) continue;
                view.addFocusables(arrayList, n2, n3);
            }
        }
        if (n5 == 262144) {
            if (n4 != arrayList.size()) return;
        }
        if (!this.isFocusable()) {
            return;
        }
        if ((n3 & 1) == 1 && this.isInTouchMode()) {
            if (!this.isFocusableInTouchMode()) return;
        }
        if (arrayList == null) return;
        arrayList.add((View)this);
    }

    public void addTouchables(ArrayList<View> arrayList) {
        for (int i2 = 0; i2 < this.getChildCount(); ++i2) {
            b b2;
            View view = this.getChildAt(i2);
            if (view.getVisibility() != 0 || (b2 = this.a(view)) == null || b2.b != this.i) continue;
            view.addTouchables(arrayList);
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public void addView(View view, int n2, ViewGroup.LayoutParams layoutParams) {
        if (!this.checkLayoutParams(layoutParams)) {
            layoutParams = this.generateLayoutParams(layoutParams);
        }
        c c2 = (c)layoutParams;
        c2.a |= view instanceof a;
        if (this.w) {
            if (c2 != null && c2.a) {
                throw new IllegalStateException("Cannot add pager decor view during layout");
            }
            c2.d = true;
            this.addViewInLayout(view, n2, layoutParams);
            return;
        }
        super.addView(view, n2, layoutParams);
    }

    final void b() {
        this.a(this.i);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public boolean canScrollHorizontally(int n2) {
        boolean bl;
        boolean bl2 = false;
        if (this.h == null) {
            return bl2;
        }
        int n3 = this.getClientWidth();
        int n4 = this.getScrollX();
        if (n2 < 0) {
            bl = bl2;
            if (n4 <= (int)((float)n3 * this.s)) return bl;
            return true;
        }
        bl = bl2;
        if (n2 <= 0) return bl;
        bl = bl2;
        if (n4 >= (int)((float)n3 * this.t)) return bl;
        return true;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (!(layoutParams instanceof c)) return false;
        if (!super.checkLayoutParams(layoutParams)) return false;
        return true;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public void computeScroll() {
        if (!this.m.isFinished() && this.m.computeScrollOffset()) {
            int n2 = this.getScrollX();
            int n3 = this.getScrollY();
            int n4 = this.m.getCurrX();
            int n5 = this.m.getCurrY();
            if (n2 != n4 || n3 != n5) {
                this.scrollTo(n4, n5);
                if (!this.c(n4)) {
                    this.m.abortAnimation();
                    this.scrollTo(0, n5);
                }
            }
            android.support.v4.view.u.b((View)this);
            return;
        }
        this.a(true);
    }

    /*
     * Enabled aggressive block sorting
     */
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        boolean bl;
        boolean bl2;
        block8: {
            block7: {
                bl2 = false;
                if (super.dispatchKeyEvent(keyEvent)) return true;
                if (keyEvent.getAction() != 0) break block7;
                switch (keyEvent.getKeyCode()) {
                    default: {
                        break;
                    }
                    case 21: {
                        bl = this.d(17);
                        break block8;
                    }
                    case 22: {
                        bl = this.d(66);
                        break block8;
                    }
                    case 61: {
                        if (Build.VERSION.SDK_INT < 11) break;
                        if (android.support.v4.view.g.b(keyEvent)) {
                            bl = this.d(2);
                        } else {
                            if (!android.support.v4.view.g.a(keyEvent)) break;
                            bl = this.d(1);
                        }
                        break block8;
                    }
                }
            }
            bl = false;
        }
        if (!bl) return bl2;
        return true;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        boolean bl = false;
        if (accessibilityEvent.getEventType() == 4096) {
            return super.dispatchPopulateAccessibilityEvent(accessibilityEvent);
        }
        int n2 = this.getChildCount();
        int n3 = 0;
        while (true) {
            b b2;
            boolean bl2 = bl;
            if (n3 >= n2) return bl2;
            View view = this.getChildAt(n3);
            if (view.getVisibility() == 0 && (b2 = this.a(view)) != null && b2.b == this.i && view.dispatchPopulateAccessibilityEvent(accessibilityEvent)) {
                return true;
            }
            ++n3;
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    public void draw(Canvas canvas) {
        super.draw(canvas);
        int n2 = 0;
        int n3 = 0;
        int n4 = android.support.v4.view.u.a((View)this);
        if (n4 == 0 || n4 == 1 && this.h != null && this.h.b() > 1) {
            if (!this.Q.a()) {
                n2 = canvas.save();
                n3 = this.getHeight() - this.getPaddingTop() - this.getPaddingBottom();
                n4 = this.getWidth();
                canvas.rotate(270.0f);
                canvas.translate((float)(-n3 + this.getPaddingTop()), this.s * (float)n4);
                this.Q.a(n3, n4);
                n3 = this.Q.a(canvas) | 0;
                canvas.restoreToCount(n2);
            }
            n2 = n3;
            if (!this.R.a()) {
                n4 = canvas.save();
                int n5 = this.getWidth();
                n2 = this.getHeight();
                int n6 = this.getPaddingTop();
                int n7 = this.getPaddingBottom();
                canvas.rotate(90.0f);
                canvas.translate((float)(-this.getPaddingTop()), -(this.t + 1.0f) * (float)n5);
                this.R.a(n2 - n6 - n7, n5);
                n2 = n3 | this.R.a(canvas);
                canvas.restoreToCount(n4);
            }
        } else {
            this.Q.b();
            this.R.b();
        }
        if (n2 != 0) {
            android.support.v4.view.u.b((View)this);
        }
    }

    protected void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.p;
        if (drawable != null && drawable.isStateful()) {
            drawable.setState(this.getDrawableState());
        }
    }

    protected ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new c();
    }

    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new c(this.getContext(), attributeSet);
    }

    protected ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return this.generateDefaultLayoutParams();
    }

    public p getAdapter() {
        return this.h;
    }

    protected int getChildDrawingOrder(int n2, int n3) {
        int n4 = n3;
        if (this.ae == 2) {
            n4 = n2 - 1 - n3;
        }
        return ((c)this.af.get((int)n4).getLayoutParams()).f;
    }

    public int getCurrentItem() {
        return this.i;
    }

    public int getOffscreenPageLimit() {
        return this.z;
    }

    public int getPageMargin() {
        return this.o;
    }

    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.S = true;
    }

    protected void onDetachedFromWindow() {
        this.removeCallbacks(this.ah);
        super.onDetachedFromWindow();
    }

    /*
     * Enabled aggressive block sorting
     */
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.o > 0 && this.p != null && this.e.size() > 0 && this.h != null) {
            int n2 = this.getScrollX();
            int n3 = this.getWidth();
            float f2 = (float)this.o / (float)n3;
            Object object = this.e.get(0);
            float f3 = ((b)object).e;
            int n4 = this.e.size();
            int n5 = this.e.get((int)(n4 - 1)).b;
            int n6 = 0;
            for (int i2 = ((b)object).b; i2 < n5; ++i2) {
                float f4;
                while (i2 > ((b)object).b && n6 < n4) {
                    object = this.e;
                    object = (b)((ArrayList)object).get(++n6);
                }
                if (i2 == ((b)object).b) {
                    f4 = (((b)object).e + ((b)object).d) * (float)n3;
                    f3 = ((b)object).e + ((b)object).d + f2;
                } else {
                    f4 = (1.0f + f3) * (float)n3;
                    f3 += 1.0f + f2;
                }
                if ((float)this.o + f4 > (float)n2) {
                    this.p.setBounds((int)f4, this.q, (int)((float)this.o + f4 + 0.5f), this.r);
                    this.p.draw(canvas);
                }
                if (f4 > (float)(n2 + n3)) break;
            }
        }
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    public boolean onInterceptTouchEvent(MotionEvent var1_1) {
        block16: {
            var2_2 = false;
            var3_3 = var1_1.getAction() & 255;
            if (var3_3 == 3 || var3_3 == 1) {
                this.A = false;
                this.B = false;
                this.J = -1;
                var4_4 = var2_2;
                if (this.K == null) return var4_4;
                this.K.recycle();
                this.K = null;
                return var2_2;
            }
            if (var3_3 != 0) {
                if (this.A) {
                    return true;
                }
                var4_4 = var2_2;
                if (this.B != false) return var4_4;
            }
            switch (var3_3) {
                case 2: {
                    var3_3 = this.J;
                    if (var3_3 != -1) {
                        var3_3 = android.support.v4.view.n.a(var1_1, var3_3);
                        var5_5 = android.support.v4.view.n.c(var1_1, var3_3);
                        var6_6 = var5_5 - this.F;
                        var7_7 = Math.abs(var6_6);
                        var8_8 = android.support.v4.view.n.d(var1_1, var3_3);
                        var9_9 = Math.abs(var8_8 - this.I);
                        if (var6_6 != 0.0f && (var3_3 = (var10_10 = this.F) < (float)this.D && var6_6 > 0.0f || var10_10 > (float)(this.getWidth() - this.D) && var6_6 < 0.0f ? 1 : 0) == 0 && this.a((View)this, false, (int)var6_6, (int)var5_5, (int)var8_8)) {
                            this.F = var5_5;
                            this.G = var8_8;
                            this.B = true;
                            return var2_2;
                        }
                        if (var7_7 > (float)this.E && 0.5f * var7_7 > var9_9) {
                            this.A = true;
                            this.f();
                            this.setScrollState(1);
                            var10_10 = var6_6 > 0.0f ? this.H + (float)this.E : this.H - (float)this.E;
                            this.F = var10_10;
                            this.G = var8_8;
                            this.setScrollingCacheEnabled(true);
                        } else if (var9_9 > (float)this.E) {
                            this.B = true;
                        }
                        if (this.A && this.a(var5_5)) {
                            android.support.v4.view.u.b((View)this);
                            ** break;
                        }
                    }
                    ** GOTO lbl66
                }
                case 0: {
                    this.H = var10_11 = var1_1.getX();
                    this.F = var10_11;
                    this.I = var10_11 = var1_1.getY();
                    this.G = var10_11;
                    this.J = android.support.v4.view.n.b(var1_1, 0);
                    this.B = false;
                    this.m.computeScrollOffset();
                    if (this.ai == 2 && Math.abs(this.m.getFinalX() - this.m.getCurrX()) > this.O) {
                        this.m.abortAnimation();
                        this.y = false;
                        this.b();
                        this.A = true;
                        this.f();
                        this.setScrollState(1);
                        ** break;
                    }
                    this.a(false);
                    this.A = false;
                }
lbl66:
                // 5 sources

                default: {
                    break block16;
                }
                case 6: 
            }
            this.a(var1_1);
        }
        if (this.K == null) {
            this.K = VelocityTracker.obtain();
        }
        this.K.addMovement(var1_1);
        return this.A;
    }

    /*
     * Enabled aggressive block sorting
     */
    protected void onLayout(boolean bl, int n2, int n3, int n4, int n5) {
        int n6 = this.getChildCount();
        int n7 = n4 - n2;
        int n8 = n5 - n3;
        n3 = this.getPaddingLeft();
        n2 = this.getPaddingTop();
        int n9 = this.getPaddingRight();
        n4 = this.getPaddingBottom();
        int n10 = this.getScrollX();
        int n11 = 0;
        int n12 = 0;
        while (true) {
            int n13;
            block16: {
                block15: {
                    Object object;
                    Object object2;
                    block14: {
                        int n14;
                        if (n12 >= n6) break block14;
                        object2 = this.getChildAt(n12);
                        if (object2.getVisibility() == 8) break block15;
                        object = (c)object2.getLayoutParams();
                        if (!object.a) break block15;
                        n5 = object.b;
                        int n15 = object.b;
                        switch (n5 & 7) {
                            default: {
                                n5 = n3;
                                n13 = n3;
                                break;
                            }
                            case 3: {
                                n13 = object2.getMeasuredWidth();
                                n5 = n3;
                                n13 += n3;
                                break;
                            }
                            case 1: {
                                n5 = Math.max((n7 - object2.getMeasuredWidth()) / 2, n3);
                                n13 = n3;
                                break;
                            }
                            case 5: {
                                n13 = object2.getMeasuredWidth();
                                n5 = n9 + object2.getMeasuredWidth();
                                n14 = n7 - n9 - n13;
                                n9 = n5;
                                n13 = n3;
                                n5 = n14;
                            }
                        }
                        switch (n15 & 0x70) {
                            default: {
                                n14 = n2;
                                n3 = n2;
                                n2 = n4;
                                n4 = n14;
                                break;
                            }
                            case 48: {
                                n14 = object2.getMeasuredHeight();
                                n3 = n4;
                                n14 += n2;
                                n4 = n2;
                                n2 = n3;
                                n3 = n14;
                                break;
                            }
                            case 16: {
                                n14 = Math.max((n8 - object2.getMeasuredHeight()) / 2, n2);
                                n3 = n2;
                                n2 = n4;
                                n4 = n14;
                                break;
                            }
                            case 80: {
                                n14 = n8 - n4 - object2.getMeasuredHeight();
                                n15 = object2.getMeasuredHeight();
                                n3 = n2;
                                n2 = n4 + n15;
                                n4 = n14;
                            }
                        }
                        object2.layout(n5 += n10, n4, object2.getMeasuredWidth() + n5, object2.getMeasuredHeight() + n4);
                        n5 = n9;
                        n4 = n13;
                        n9 = n2;
                        n2 = ++n11;
                        break block16;
                    }
                    n9 = n7 - n3 - n9;
                    for (n5 = 0; n5 < n6; ++n5) {
                        View view = this.getChildAt(n5);
                        if (view.getVisibility() == 8) continue;
                        object2 = (c)view.getLayoutParams();
                        if (object2.a || (object = this.a(view)) == null) continue;
                        float f2 = n9;
                        n13 = (int)(((b)object).e * f2) + n3;
                        if (object2.d) {
                            object2.d = false;
                            f2 = n9;
                            view.measure(View.MeasureSpec.makeMeasureSpec((int)((int)(object2.c * f2)), (int)0x40000000), View.MeasureSpec.makeMeasureSpec((int)(n8 - n2 - n4), (int)0x40000000));
                        }
                        view.layout(n13, n2, view.getMeasuredWidth() + n13, view.getMeasuredHeight() + n2);
                    }
                    this.q = n2;
                    this.r = n8 - n4;
                    this.V = n11;
                    if (this.S) {
                        this.a(this.i, false, 0, false);
                    }
                    this.S = false;
                    return;
                }
                n5 = n11;
                n11 = n2;
                n13 = n3;
                n2 = n5;
                n5 = n9;
                n9 = n4;
                n3 = n11;
                n4 = n13;
            }
            ++n12;
            n13 = n4;
            n11 = n2;
            n2 = n3;
            n4 = n9;
            n9 = n5;
            n3 = n13;
        }
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    protected void onMeasure(int var1_1, int var2_2) {
        this.setMeasuredDimension(ViewPager.getDefaultSize((int)0, (int)var1_1), ViewPager.getDefaultSize((int)0, (int)var2_2));
        var1_1 = this.getMeasuredWidth();
        this.D = Math.min(var1_1 / 10, this.C);
        var1_1 = var1_1 - this.getPaddingLeft() - this.getPaddingRight();
        var2_2 = this.getMeasuredHeight() - this.getPaddingTop() - this.getPaddingBottom();
        var3_3 = this.getChildCount();
        var4_4 = 0;
        while (true) {
            block12: {
                block14: {
                    block13: {
                        block11: {
                            if (var4_4 >= var3_3) break block11;
                            var5_5 = this.getChildAt(var4_4);
                            var6_6 = var1_1;
                            var7_7 = var2_2;
                            if (var5_5.getVisibility() == 8) break block12;
                            var8_8 = (c)var5_5.getLayoutParams();
                            var6_6 = var1_1;
                            var7_7 = var2_2;
                            if (var8_8 == null) break block12;
                            var6_6 = var1_1;
                            var7_7 = var2_2;
                            if (!var8_8.a) break block12;
                            var6_6 = var8_8.b & 7;
                            var9_9 = var8_8.b & 112;
                            var10_10 = -2147483648;
                            var7_7 = -2147483648;
                            var9_9 = var9_9 == 48 || var9_9 == 80 ? 1 : 0;
                            var11_11 = var6_6 == 3 || var6_6 == 5;
                            if (var9_9 != 0) {
                                var6_6 = 0x40000000;
                            } else {
                                var6_6 = var10_10;
                                if (var11_11) {
                                    var7_7 = 0x40000000;
                                    var6_6 = var10_10;
                                }
                            }
                            if (var8_8.width == -2) break block13;
                            var10_10 = 0x40000000;
                            var6_6 = var8_8.width != -1 ? var8_8.width : var1_1;
                            break block14;
                        }
                        this.u = View.MeasureSpec.makeMeasureSpec((int)var1_1, (int)0x40000000);
                        this.v = View.MeasureSpec.makeMeasureSpec((int)var2_2, (int)0x40000000);
                        this.w = true;
                        this.b();
                        this.w = false;
                        var6_6 = this.getChildCount();
                        var2_2 = 0;
                        while (var2_2 < var6_6) {
                            var5_5 = this.getChildAt(var2_2);
                            if (!(var5_5.getVisibility() == 8 || (var8_8 = (c)var5_5.getLayoutParams()) != null && var8_8.a)) {
                                var14_14 = var1_1;
                                var5_5.measure(View.MeasureSpec.makeMeasureSpec((int)((int)(var8_8.c * var14_14)), (int)0x40000000), this.v);
                            }
                            ++var2_2;
                        }
                        return;
                    }
                    var10_10 = var6_6;
                    var6_6 = var1_1;
                }
                if (var8_8.height == -2) ** GOTO lbl-1000
                var7_7 = var12_12 = 0x40000000;
                if (var8_8.height != -1) {
                    var13_13 = var8_8.height;
                    var7_7 = var12_12;
                    var12_12 = var13_13;
                } else lbl-1000:
                // 2 sources

                {
                    var12_12 = var2_2;
                }
                var5_5.measure(View.MeasureSpec.makeMeasureSpec((int)var6_6, (int)var10_10), View.MeasureSpec.makeMeasureSpec((int)var12_12, (int)var7_7));
                if (var9_9 != 0) {
                    var7_7 = var2_2 - var5_5.getMeasuredHeight();
                    var6_6 = var1_1;
                } else {
                    var6_6 = var1_1;
                    var7_7 = var2_2;
                    if (var11_11) {
                        var6_6 = var1_1 - var5_5.getMeasuredWidth();
                        var7_7 = var2_2;
                    }
                }
            }
            ++var4_4;
            var1_1 = var6_6;
            var2_2 = var7_7;
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    protected boolean onRequestFocusInDescendants(int n2, Rect rect) {
        int n3;
        boolean bl = true;
        int n4 = -1;
        int n5 = this.getChildCount();
        if ((n2 & 2) != 0) {
            n4 = 1;
            n3 = 0;
        } else {
            n3 = n5 - 1;
            n5 = -1;
        }
        while (n3 != n5) {
            b b2;
            View view = this.getChildAt(n3);
            if (view.getVisibility() == 0 && (b2 = this.a(view)) != null && b2.b == this.i && view.requestFocus(n2, rect)) {
                return bl;
            }
            n3 += n4;
        }
        return false;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public void onRestoreInstanceState(Parcelable object) {
        if (!(object instanceof SavedState)) {
            super.onRestoreInstanceState(object);
            return;
        }
        SavedState savedState = (SavedState)((Object)object);
        super.onRestoreInstanceState(savedState.getSuperState());
        if (this.h != null) {
            Parcelable parcelable = savedState.b;
            ClassLoader classLoader = savedState.c;
            this.a(savedState.a, false, true);
            return;
        }
        this.j = savedState.a;
        this.k = savedState.b;
        this.l = savedState.c;
    }

    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.a = this.i;
        if (this.h != null) {
            savedState.b = null;
        }
        return savedState;
    }

    protected void onSizeChanged(int n2, int n3, int n4, int n5) {
        super.onSizeChanged(n2, n3, n4, n5);
        if (n2 != n4) {
            this.a(n2, n4, this.o, this.o);
        }
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    public boolean onTouchEvent(MotionEvent var1_1) {
        var2_3 = 0;
        if (this.P) {
            return true;
        }
        if (var1_1 /* !! */ .getAction() == 0 && var1_1 /* !! */ .getEdgeFlags() != 0) {
            return false;
        }
        if (this.h == null) return false;
        if (this.h.b() == 0) {
            return false;
        }
        if (this.K == null) {
            this.K = VelocityTracker.obtain();
        }
        this.K.addMovement(var1_1 /* !! */ );
        var4_5 = var2_3;
        switch (var1_1 /* !! */ .getAction() & 255) {
            default: {
                var4_5 = var2_3;
                break;
            }
            case 0: {
                this.m.abortAnimation();
                this.y = false;
                this.b();
                this.H = var5_6 = var1_1 /* !! */ .getX();
                this.F = var5_6;
                this.I = var5_6 = var1_1 /* !! */ .getY();
                this.G = var5_6;
                this.J = android.support.v4.view.n.b(var1_1 /* !! */ , 0);
                var4_5 = var2_3;
                break;
            }
            case 2: {
                if (!this.A) {
                    var4_5 = android.support.v4.view.n.a(var1_1 /* !! */ , this.J);
                    var6_9 = android.support.v4.view.n.c(var1_1 /* !! */ , var4_5);
                    var7_10 = Math.abs(var6_9 - this.F);
                    var8_11 = android.support.v4.view.n.d(var1_1 /* !! */ , var4_5);
                    var5_7 = Math.abs(var8_11 - this.G);
                    if (var7_10 > (float)this.E && var7_10 > var5_7) {
                        this.A = true;
                        this.f();
                        var5_7 = var6_9 - this.H > 0.0f ? this.H + (float)this.E : this.H - (float)this.E;
                        this.F = var5_7;
                        this.G = var8_11;
                        this.setScrollState(1);
                        this.setScrollingCacheEnabled(true);
                        var9_13 = this.getParent();
                        if (var9_13 != null) {
                            var9_13.requestDisallowInterceptTouchEvent(true);
                        }
                    }
                }
                var4_5 = var2_3;
                if (this.A) {
                    var4_5 = this.a(android.support.v4.view.n.c(var1_1 /* !! */ , android.support.v4.view.n.a(var1_1 /* !! */ , this.J))) | 0;
                    break;
                }
                ** GOTO lbl94
            }
            case 1: {
                var4_5 = var2_3;
                if (this.A) {
                    var9_14 = this.K;
                    var9_14.computeCurrentVelocity(1000, (float)this.M);
                    var10_17 = (int)android.support.v4.view.s.a(var9_14, this.J);
                    this.y = true;
                    var2_3 = this.getClientWidth();
                    var11_18 = this.getScrollX();
                    var9_15 = this.g();
                    var4_5 = var9_15.b;
                    var8_12 = ((float)var11_18 / (float)var2_3 - var9_15.e) / var9_15.d;
                    if (Math.abs((int)(android.support.v4.view.n.c(var1_1 /* !! */ , android.support.v4.view.n.a(var1_1 /* !! */ , this.J)) - this.H)) > this.N && Math.abs(var10_17) > this.L) {
                        if (var10_17 <= 0) {
                            ++var4_5;
                        }
                    } else {
                        var5_8 = var4_5 >= this.i ? 0.4f : 0.6f;
                        var4_5 = (int)((float)var4_5 + var8_12 + var5_8);
                    }
                    var2_3 = var4_5;
                    if (this.e.size() > 0) {
                        var1_2 = this.e.get(0);
                        var9_16 = this.e.get(this.e.size() - 1);
                        var2_3 = Math.max(var1_2.b, Math.min(var4_5, var9_16.b));
                    }
                    this.a(var2_3, true, true, var10_17);
                    this.J = -1;
                    this.h();
                    var4_5 = this.Q.c() | this.R.c();
                    break;
                }
                ** GOTO lbl94
            }
            case 3: {
                var4_5 = var2_3;
                if (this.A) {
                    this.a(this.i, true, 0, false);
                    this.J = -1;
                    this.h();
                    var4_5 = this.Q.c() | this.R.c();
                    break;
                }
                ** GOTO lbl94
            }
            case 5: {
                var4_5 = android.support.v4.view.n.b(var1_1 /* !! */ );
                this.F = android.support.v4.view.n.c(var1_1 /* !! */ , var4_5);
                this.J = android.support.v4.view.n.b(var1_1 /* !! */ , var4_5);
                var4_5 = var2_3;
            }
lbl94:
            // 5 sources

            case 4: {
                break;
            }
            case 6: {
                this.a(var1_1 /* !! */ );
                this.F = android.support.v4.view.n.c(var1_1 /* !! */ , android.support.v4.view.n.a(var1_1 /* !! */ , this.J));
                var4_5 = var2_3;
            }
        }
        if (var4_5 == 0) return true;
        android.support.v4.view.u.b((View)this);
        return true;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public void removeView(View view) {
        if (this.w) {
            this.removeViewInLayout(view);
            return;
        }
        super.removeView(view);
    }

    /*
     * Enabled aggressive block sorting
     */
    public void setAdapter(p p2) {
        Object object;
        if (this.h != null) {
            int n2;
            this.h.b(this.n);
            for (n2 = 0; n2 < this.e.size(); ++n2) {
                object = this.e.get(n2);
                this.h.a(((b)object).a);
            }
            this.h.a();
            this.e.clear();
            n2 = 0;
            while (n2 < this.getChildCount()) {
                int n3 = n2;
                if (!((c)this.getChildAt((int)n2).getLayoutParams()).a) {
                    this.removeViewAt(n2);
                    n3 = n2 - 1;
                }
                n2 = n3 + 1;
            }
            this.i = 0;
            this.scrollTo(0, 0);
        }
        object = this.h;
        this.h = p2;
        this.b = 0;
        if (this.h != null) {
            if (this.n == null) {
                this.n = new h(0);
            }
            this.h.a(this.n);
            this.y = false;
            boolean bl = this.S;
            this.S = true;
            this.b = this.h.b();
            if (this.j >= 0) {
                this.a(this.j, false, true);
                this.j = -1;
                this.k = null;
                this.l = null;
            } else if (!bl) {
                this.b();
            } else {
                this.requestLayout();
            }
        }
        if (this.ab != null && object != p2) {
            this.ab.a((p)object, p2);
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    void setChildrenDrawingOrderEnabledCompat(boolean bl) {
        if (Build.VERSION.SDK_INT < 7) return;
        if (this.ad == null) {
            try {
                this.ad = ViewGroup.class.getDeclaredMethod("setChildrenDrawingOrderEnabled", Boolean.TYPE);
            }
            catch (NoSuchMethodException noSuchMethodException) {
                Log.e((String)"ViewPager", (String)"Can't find setChildrenDrawingOrderEnabled", (Throwable)noSuchMethodException);
            }
        }
        try {
            this.ad.invoke((Object)this, bl);
            return;
        }
        catch (Exception exception) {
            Log.e((String)"ViewPager", (String)"Error changing children drawing order", (Throwable)exception);
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    public void setCurrentItem(int n2) {
        this.y = false;
        boolean bl = !this.S;
        this.a(n2, bl, false);
    }

    public void setOffscreenPageLimit(int n2) {
        int n3 = n2;
        if (n2 <= 0) {
            Log.w((String)"ViewPager", (String)("Requested offscreen page limit " + n2 + " too small; defaulting to 1"));
            n3 = 1;
        }
        if (n3 != this.z) {
            this.z = n3;
            this.b();
        }
    }

    void setOnAdapterChangeListener(e e2) {
        this.ab = e2;
    }

    public void setOnPageChangeListener(f f2) {
        this.W = f2;
    }

    public void setPageMargin(int n2) {
        int n3 = this.o;
        this.o = n2;
        int n4 = this.getWidth();
        this.a(n4, n4, n2, n3);
        this.requestLayout();
    }

    public void setPageMarginDrawable(int n2) {
        this.setPageMarginDrawable(this.getContext().getResources().getDrawable(n2));
    }

    /*
     * Enabled aggressive block sorting
     */
    public void setPageMarginDrawable(Drawable drawable) {
        this.p = drawable;
        if (drawable != null) {
            this.refreshDrawableState();
        }
        boolean bl = drawable == null;
        this.setWillNotDraw(bl);
        this.invalidate();
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    protected boolean verifyDrawable(Drawable drawable) {
        if (super.verifyDrawable(drawable)) return true;
        if (drawable != this.p) return false;
        return true;
    }

    public static class SavedState
    extends View.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR;
        int a;
        Parcelable b;
        ClassLoader c;

        static {
            android.support.v4.c.b<SavedState> b2 = new android.support.v4.c.b<SavedState>(){

                @Override
                public final /* synthetic */ Object a(Parcel parcel, ClassLoader classLoader) {
                    return new SavedState(parcel, classLoader);
                }
            };
            if (Build.VERSION.SDK_INT >= 13) {
                android.support.v4.c.d.a(b2);
            }
            CREATOR = new a.a<SavedState>(b2);
        }

        SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel);
            ClassLoader classLoader2 = classLoader;
            if (classLoader == null) {
                classLoader2 = ((Object)((Object)this)).getClass().getClassLoader();
            }
            this.a = parcel.readInt();
            this.b = parcel.readParcelable(classLoader2);
            this.c = classLoader2;
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        public String toString() {
            return "FragmentPager.SavedState{" + Integer.toHexString(System.identityHashCode((Object)this)) + " position=" + this.a + "}";
        }

        public void writeToParcel(Parcel parcel, int n2) {
            super.writeToParcel(parcel, n2);
            parcel.writeInt(this.a);
            parcel.writeParcelable(this.b, n2);
        }
    }

    static interface a {
    }

    static final class b {
        Object a;
        int b;
        boolean c;
        float d;
        float e;

        b() {
        }
    }

    public static final class c
    extends ViewGroup.LayoutParams {
        public boolean a;
        public int b;
        float c = 0.0f;
        boolean d;
        int e;
        int f;

        public c() {
            super(-1, -1);
        }

        public c(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            context = context.obtainStyledAttributes(attributeSet, a);
            this.b = context.getInteger(0, 48);
            context.recycle();
        }
    }

    final class d
    extends android.support.v4.view.a {
        d() {
        }

        /*
         * Enabled force condition propagation
         * Lifted jumps to return sites
         */
        private boolean a() {
            boolean bl = true;
            if (ViewPager.this.h == null) return false;
            if (ViewPager.this.h.b() <= 1) return false;
            return bl;
        }

        @Override
        public final void a(View object, android.support.v4.view.a.a a2) {
            super.a((View)object, a2);
            object = ViewPager.class.getName();
            android.support.v4.view.a.a.a.a(a2.b, (CharSequence)object);
            boolean bl = this.a();
            android.support.v4.view.a.a.a.a(a2.b, bl);
            if (ViewPager.this.canScrollHorizontally(1)) {
                a2.a(4096);
            }
            if (ViewPager.this.canScrollHorizontally(-1)) {
                a2.a(8192);
            }
        }

        /*
         * Enabled force condition propagation
         * Lifted jumps to return sites
         */
        @Override
        public final boolean a(View view, int n2, Bundle bundle) {
            boolean bl = true;
            if (super.a(view, n2, bundle)) {
                return bl;
            }
            switch (n2) {
                default: {
                    return false;
                }
                case 4096: {
                    if (!ViewPager.this.canScrollHorizontally(1)) return false;
                    ViewPager.this.setCurrentItem(ViewPager.this.i + 1);
                    return bl;
                }
                case 8192: 
            }
            if (!ViewPager.this.canScrollHorizontally(-1)) return false;
            ViewPager.this.setCurrentItem(ViewPager.this.i - 1);
            return bl;
        }

        @Override
        public final void d(View object, AccessibilityEvent accessibilityEvent) {
            super.d((View)object, accessibilityEvent);
            accessibilityEvent.setClassName((CharSequence)ViewPager.class.getName());
            object = android.support.v4.view.a.g.a();
            boolean bl = this.a();
            android.support.v4.view.a.g.a.a(object.b, bl);
            if (accessibilityEvent.getEventType() == 4096 && ViewPager.this.h != null) {
                int n2 = ViewPager.this.h.b();
                android.support.v4.view.a.g.a.b(object.b, n2);
                n2 = ViewPager.this.i;
                android.support.v4.view.a.g.a.a(object.b, n2);
                n2 = ViewPager.this.i;
                android.support.v4.view.a.g.a.c(object.b, n2);
            }
        }
    }

    static interface e {
        public void a(p var1, p var2);
    }

    public static interface f {
        public void a(int var1);

        public void a(int var1, float var2);

        public void b(int var1);
    }

    public static interface g {
    }

    private final class h
    extends DataSetObserver {
        private h() {
        }

        /* synthetic */ h(byte by) {
            this();
        }

        public final void onChanged() {
            ViewPager.this.a();
        }

        public final void onInvalidated() {
            ViewPager.this.a();
        }
    }

    public static class i
    implements f {
        @Override
        public void a(int n2) {
        }

        @Override
        public final void a(int n2, float f2) {
        }

        @Override
        public final void b(int n2) {
        }
    }

    static final class j
    implements Comparator<View> {
        j() {
        }

        /*
         * WARNING - void declaration
         * Enabled force condition propagation
         * Lifted jumps to return sites
         */
        @Override
        public final /* synthetic */ int compare(Object object, Object object2) {
            void var2_4;
            View view = (View)object;
            View view2 = (View)var2_4;
            c c2 = (c)view.getLayoutParams();
            c c3 = (c)view2.getLayoutParams();
            if (c2.a == c3.a) return c2.e - c3.e;
            if (!c2.a) return -1;
            return 1;
        }
    }
}

