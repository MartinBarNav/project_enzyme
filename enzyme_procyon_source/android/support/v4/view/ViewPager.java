// 
// Decompiled by Procyon v0.5.36
// 

package android.support.v4.view;

import android.os.Bundle;
import android.content.res.TypedArray;
import android.os.Parcel;
import android.support.v4.c.b;
import android.os.Parcelable$Creator;
import android.view.View$BaseSavedState;
import android.database.DataSetObserver;
import android.view.View$MeasureSpec;
import android.graphics.Canvas;
import android.view.accessibility.AccessibilityEvent;
import android.os.Build$VERSION;
import android.view.KeyEvent;
import android.view.ViewGroup$LayoutParams;
import java.util.List;
import java.util.Collections;
import android.view.SoundEffectConstants;
import android.view.FocusFinder;
import android.util.Log;
import android.view.ViewConfiguration;
import android.view.MotionEvent;
import android.content.res.Resources$NotFoundException;
import android.view.ViewParent;
import android.util.AttributeSet;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.widget.Scroller;
import android.os.Parcelable;
import android.graphics.Rect;
import android.view.View;
import java.util.ArrayList;
import java.lang.reflect.Method;
import android.support.v4.f.d;
import android.view.VelocityTracker;
import android.view.animation.Interpolator;
import java.util.Comparator;
import android.view.ViewGroup;

public class ViewPager extends ViewGroup
{
    private static final int[] a;
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
    private int J;
    private VelocityTracker K;
    private int L;
    private int M;
    private int N;
    private int O;
    private boolean P;
    private android.support.v4.f.d Q;
    private android.support.v4.f.d R;
    private boolean S;
    private boolean T;
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
    private int ai;
    private int b;
    private final ArrayList<b> e;
    private final b f;
    private final Rect g;
    private p h;
    private int i;
    private int j;
    private Parcelable k;
    private ClassLoader l;
    private Scroller m;
    private h n;
    private int o;
    private Drawable p;
    private int q;
    private int r;
    private float s;
    private float t;
    private int u;
    private int v;
    private boolean w;
    private boolean x;
    private boolean y;
    private int z;
    
    static {
        a = new int[] { 16842931 };
        c = new Comparator<b>() {};
        d = (Interpolator)new Interpolator() {
            public final float getInterpolation(float n) {
                --n;
                return n * (n * n * n * n) + 1.0f;
            }
        };
        ag = new j();
    }
    
    public ViewPager(final Context context) {
        super(context);
        this.e = new ArrayList<b>();
        this.f = new b();
        this.g = new Rect();
        this.j = -1;
        this.k = null;
        this.l = null;
        this.s = -3.4028235E38f;
        this.t = Float.MAX_VALUE;
        this.z = 1;
        this.J = -1;
        this.S = true;
        this.T = false;
        this.ah = new Runnable() {
            @Override
            public final void run() {
                ViewPager.a(ViewPager.this);
                ViewPager.this.b();
            }
        };
        this.ai = 0;
        this.d();
    }
    
    public ViewPager(final Context context, final AttributeSet set) {
        super(context, set);
        this.e = new ArrayList<b>();
        this.f = new b();
        this.g = new Rect();
        this.j = -1;
        this.k = null;
        this.l = null;
        this.s = -3.4028235E38f;
        this.t = Float.MAX_VALUE;
        this.z = 1;
        this.J = -1;
        this.S = true;
        this.T = false;
        this.ah = new Runnable() {
            @Override
            public final void run() {
                ViewPager.a(ViewPager.this);
                ViewPager.this.b();
            }
        };
        this.ai = 0;
        this.d();
    }
    
    private Rect a(Rect rect, final View view) {
        if (rect == null) {
            rect = new Rect();
        }
        if (view == null) {
            rect.set(0, 0, 0, 0);
        }
        else {
            rect.left = view.getLeft();
            rect.right = view.getRight();
            rect.top = view.getTop();
            rect.bottom = view.getBottom();
            ViewPager viewPager;
            for (ViewParent viewParent = view.getParent(); viewParent instanceof ViewGroup && viewParent != this; viewParent = viewPager.getParent()) {
                viewPager = (ViewPager)viewParent;
                rect.left += viewPager.getLeft();
                rect.right += viewPager.getRight();
                rect.top += viewPager.getTop();
                rect.bottom += viewPager.getBottom();
            }
        }
        return rect;
    }
    
    private b a(final int b, final int index) {
        final b b2 = new b();
        b2.b = b;
        b2.a = this.h.a(this, b);
        b2.d = 1.0f;
        if (index < 0 || index >= this.e.size()) {
            this.e.add(b2);
        }
        else {
            this.e.add(index, b2);
        }
        return b2;
    }
    
    private b a(final View view) {
        for (int i = 0; i < this.e.size(); ++i) {
            final b b = this.e.get(i);
            if (this.h.a(view, b.a)) {
                return b;
            }
        }
        return null;
    }
    
    private void a(int i) {
        b b;
        int n2;
        if (this.i != i) {
            int n;
            if (this.i < i) {
                n = 66;
            }
            else {
                n = 17;
            }
            b = this.b(this.i);
            this.i = i;
            n2 = n;
        }
        else {
            b = null;
            n2 = 2;
        }
        if (this.h == null) {
            this.e();
        }
        else if (this.y) {
            this.e();
        }
        else if (this.getWindowToken() != null) {
            i = this.z;
            final int max = Math.max(0, this.i - i);
            final int b2 = this.h.b();
            final int min = Math.min(b2 - 1, i + this.i);
            if (b2 != this.b) {
                try {
                    final String s = this.getResources().getResourceName(this.getId());
                    throw new IllegalStateException("The application's PagerAdapter changed the adapter's contents without calling PagerAdapter#notifyDataSetChanged! Expected adapter item count: " + this.b + ", found: " + b2 + " Pager id: " + s + " Pager class: " + this.getClass() + " Problematic adapter: " + this.h.getClass());
                }
                catch (Resources$NotFoundException ex) {
                    final String s = Integer.toHexString(this.getId());
                    throw new IllegalStateException("The application's PagerAdapter changed the adapter's contents without calling PagerAdapter#notifyDataSetChanged! Expected adapter item count: " + this.b + ", found: " + b2 + " Pager id: " + s + " Pager class: " + this.getClass() + " Problematic adapter: " + this.h.getClass());
                }
            }
            i = 0;
            while (true) {
                while (i < this.e.size()) {
                    final b b3 = this.e.get(i);
                    if (b3.b >= this.i) {
                        if (b3.b != this.i) {
                            break;
                        }
                        b a;
                        if (b3 == null && b2 > 0) {
                            a = this.a(this.i, i);
                        }
                        else {
                            a = b3;
                        }
                        if (a != null) {
                            int index = i - 1;
                            b b4;
                            if (index >= 0) {
                                b4 = this.e.get(index);
                            }
                            else {
                                b4 = null;
                            }
                            final int clientWidth = this.getClientWidth();
                            float n3;
                            if (clientWidth <= 0) {
                                n3 = 0.0f;
                            }
                            else {
                                n3 = 2.0f - a.d + this.getPaddingLeft() / (float)clientWidth;
                            }
                            final int j = this.i;
                            float n4 = 0.0f;
                            int k = j - 1;
                            int n5 = i;
                            b b5 = b4;
                            while (k >= 0) {
                                b b6;
                                float n6;
                                int n7;
                                if (n4 >= n3 && k < max) {
                                    if (b5 == null) {
                                        break;
                                    }
                                    b6 = b5;
                                    i = index;
                                    n6 = n4;
                                    n7 = n5;
                                    if (k == b5.b) {
                                        b6 = b5;
                                        i = index;
                                        n6 = n4;
                                        n7 = n5;
                                        if (!b5.c) {
                                            this.e.remove(index);
                                            this.h.a(b5.a);
                                            i = index - 1;
                                            n7 = n5 - 1;
                                            if (i >= 0) {
                                                b6 = this.e.get(i);
                                                n6 = n4;
                                            }
                                            else {
                                                b6 = null;
                                                n6 = n4;
                                            }
                                        }
                                    }
                                }
                                else if (b5 != null && k == b5.b) {
                                    n6 = n4 + b5.d;
                                    i = index - 1;
                                    if (i >= 0) {
                                        b6 = this.e.get(i);
                                        n7 = n5;
                                    }
                                    else {
                                        b6 = null;
                                        n7 = n5;
                                    }
                                }
                                else {
                                    n6 = n4 + this.a(k, index + 1).d;
                                    n7 = n5 + 1;
                                    if (index >= 0) {
                                        b6 = this.e.get(index);
                                        i = index;
                                    }
                                    else {
                                        b6 = null;
                                        i = index;
                                    }
                                }
                                --k;
                                b5 = b6;
                                index = i;
                                n4 = n6;
                                n5 = n7;
                            }
                            float d = a.d;
                            i = n5 + 1;
                            if (d < 2.0f) {
                                b b7;
                                if (i < this.e.size()) {
                                    b7 = this.e.get(i);
                                }
                                else {
                                    b7 = null;
                                }
                                float n8;
                                if (clientWidth <= 0) {
                                    n8 = 0.0f;
                                }
                                else {
                                    n8 = this.getPaddingRight() / (float)clientWidth + 2.0f;
                                }
                                int l = this.i;
                                ++l;
                                while (l < b2) {
                                    if (d >= n8 && l > min) {
                                        if (b7 == null) {
                                            break;
                                        }
                                        if (l == b7.b && !b7.c) {
                                            this.e.remove(i);
                                            this.h.a(b7.a);
                                            if (i < this.e.size()) {
                                                b7 = this.e.get(i);
                                            }
                                            else {
                                                b7 = null;
                                            }
                                        }
                                    }
                                    else if (b7 != null && l == b7.b) {
                                        final float d2 = b7.d;
                                        if (++i < this.e.size()) {
                                            b7 = this.e.get(i);
                                        }
                                        else {
                                            b7 = null;
                                        }
                                        d += d2;
                                    }
                                    else {
                                        final b a2 = this.a(l, i);
                                        ++i;
                                        final float d3 = a2.d;
                                        if (i < this.e.size()) {
                                            b7 = this.e.get(i);
                                        }
                                        else {
                                            b7 = null;
                                        }
                                        d += d3;
                                    }
                                    ++l;
                                }
                            }
                            this.a(a, n5, b);
                        }
                        final p h = this.h;
                        Object a3;
                        if (a != null) {
                            a3 = a.a;
                        }
                        else {
                            a3 = null;
                        }
                        h.b(a3);
                        this.h.a();
                        int childCount;
                        View child;
                        c c;
                        b a4;
                        for (childCount = this.getChildCount(), i = 0; i < childCount; ++i) {
                            child = this.getChildAt(i);
                            c = (c)child.getLayoutParams();
                            c.f = i;
                            if (!c.a && c.c == 0.0f) {
                                a4 = this.a(child);
                                if (a4 != null) {
                                    c.c = a4.d;
                                    c.e = a4.b;
                                }
                            }
                        }
                        this.e();
                        if (!this.hasFocus()) {
                            return;
                        }
                        final View focus = this.findFocus();
                        b b8;
                        if (focus != null) {
                            b8 = this.b(focus);
                        }
                        else {
                            b8 = null;
                        }
                        if (b8 == null || b8.b != this.i) {
                            View child2;
                            b a5;
                            for (i = 0; i < this.getChildCount(); ++i) {
                                child2 = this.getChildAt(i);
                                a5 = this.a(child2);
                                if (a5 != null && a5.b == this.i && child2.requestFocus(n2)) {
                                    break;
                                }
                            }
                        }
                        return;
                    }
                    else {
                        ++i;
                    }
                }
                final b b3 = null;
                continue;
            }
        }
    }
    
    private void a(int i, final float n) {
        if (this.V > 0) {
            final int scrollX = this.getScrollX();
            int paddingLeft = this.getPaddingLeft();
            int paddingRight = this.getPaddingRight();
            final int width = this.getWidth();
            int n9;
            int n10;
            for (int childCount = this.getChildCount(), j = 0; j < childCount; ++j, paddingLeft = n10, paddingRight = n9) {
                final View child = this.getChildAt(j);
                final c c = (c)child.getLayoutParams();
                if (c.a) {
                    int max = 0;
                    int n3 = 0;
                    int n4 = 0;
                    switch (c.b & 0x7) {
                        default: {
                            max = paddingLeft;
                            final int n2 = paddingRight;
                            n3 = paddingLeft;
                            n4 = n2;
                            break;
                        }
                        case 3: {
                            final int n5 = child.getWidth() + paddingLeft;
                            max = paddingLeft;
                            n4 = paddingRight;
                            n3 = n5;
                            break;
                        }
                        case 1: {
                            max = Math.max((width - child.getMeasuredWidth()) / 2, paddingLeft);
                            final int n6 = paddingLeft;
                            n4 = paddingRight;
                            n3 = n6;
                            break;
                        }
                        case 5: {
                            max = width - paddingRight - child.getMeasuredWidth();
                            final int measuredWidth = child.getMeasuredWidth();
                            final int n7 = paddingLeft;
                            n4 = paddingRight + measuredWidth;
                            n3 = n7;
                            break;
                        }
                    }
                    final int n8 = max + scrollX - child.getLeft();
                    n9 = n4;
                    n10 = n3;
                    if (n8 != 0) {
                        child.offsetLeftAndRight(n8);
                        n10 = n3;
                        n9 = n4;
                    }
                }
                else {
                    n9 = paddingRight;
                    n10 = paddingLeft;
                }
            }
        }
        if (this.W != null) {
            this.W.a(i, n);
        }
        if (this.aa != null) {
            this.aa.a(i, n);
        }
        if (this.ac != null) {
            this.getScrollX();
            int childCount2;
            View child2;
            for (childCount2 = this.getChildCount(), i = 0; i < childCount2; ++i) {
                child2 = this.getChildAt(i);
                if (!((c)child2.getLayoutParams()).a) {
                    child2.getLeft();
                    this.getClientWidth();
                }
            }
        }
        this.U = true;
    }
    
    private void a(int n, int timePassed, int n2, int duration) {
        if (timePassed > 0 && !this.e.isEmpty()) {
            n2 = (int)((n - this.getPaddingLeft() - this.getPaddingRight() + n2) * (this.getScrollX() / (float)(timePassed - this.getPaddingLeft() - this.getPaddingRight() + duration)));
            this.scrollTo(n2, this.getScrollY());
            if (!this.m.isFinished()) {
                duration = this.m.getDuration();
                timePassed = this.m.timePassed();
                this.m.startScroll(n2, 0, (int)(this.b(this.i).e * n), 0, duration - timePassed);
            }
        }
        else {
            final b b = this.b(this.i);
            float min;
            if (b != null) {
                min = Math.min(b.e, this.t);
            }
            else {
                min = 0.0f;
            }
            n = (int)(min * (n - this.getPaddingLeft() - this.getPaddingRight()));
            if (n != this.getScrollX()) {
                this.a(false);
                this.scrollTo(n, this.getScrollY());
            }
        }
    }
    
    private void a(final int n, final boolean b, int n2, final boolean b2) {
        final b b3 = this.b(n);
        int n3 = 0;
        if (b3 != null) {
            n3 = (int)(this.getClientWidth() * Math.max(this.s, Math.min(b3.e, this.t)));
        }
        if (b) {
            if (this.getChildCount() == 0) {
                this.setScrollingCacheEnabled(false);
            }
            else {
                final int scrollX = this.getScrollX();
                final int scrollY = this.getScrollY();
                final int n4 = n3 - scrollX;
                final int n5 = 0 - scrollY;
                if (n4 == 0 && n5 == 0) {
                    this.a(false);
                    this.b();
                    this.setScrollState(0);
                }
                else {
                    this.setScrollingCacheEnabled(true);
                    this.setScrollState(2);
                    final int clientWidth = this.getClientWidth();
                    final int n6 = clientWidth / 2;
                    final float min = Math.min(1.0f, 1.0f * Math.abs(n4) / clientWidth);
                    final float n7 = (float)n6;
                    final float n8 = (float)n6;
                    final float n9 = (float)Math.sin((float)((min - 0.5f) * 0.4712389167638204));
                    n2 = Math.abs(n2);
                    if (n2 > 0) {
                        n2 = Math.round(1000.0f * Math.abs((n8 * n9 + n7) / n2)) * 4;
                    }
                    else {
                        n2 = (int)((Math.abs(n4) / (clientWidth * 1.0f + this.o) + 1.0f) * 100.0f);
                    }
                    n2 = Math.min(n2, 600);
                    this.m.startScroll(scrollX, scrollY, n4, n5, n2);
                    android.support.v4.view.u.b((View)this);
                }
            }
            if (b2 && this.W != null) {
                this.W.a(n);
            }
            if (b2 && this.aa != null) {
                this.aa.a(n);
            }
        }
        else {
            if (b2 && this.W != null) {
                this.W.a(n);
            }
            if (b2 && this.aa != null) {
                this.aa.a(n);
            }
            this.a(false);
            this.scrollTo(n3, 0);
            this.c(n3);
        }
    }
    
    private void a(final int n, final boolean b, final boolean b2) {
        this.a(n, b, b2, 0);
    }
    
    private void a(int i, final boolean b, final boolean b2, final int n) {
        final boolean b3 = false;
        if (this.h == null || this.h.b() <= 0) {
            this.setScrollingCacheEnabled(false);
        }
        else if (!b2 && this.i == i && this.e.size() != 0) {
            this.setScrollingCacheEnabled(false);
        }
        else {
            int j;
            if (i < 0) {
                j = 0;
            }
            else if ((j = i) >= this.h.b()) {
                j = this.h.b() - 1;
            }
            i = this.z;
            if (j > this.i + i || j < this.i - i) {
                for (i = 0; i < this.e.size(); ++i) {
                    this.e.get(i).c = true;
                }
            }
            boolean b4 = b3;
            if (this.i != j) {
                b4 = true;
            }
            if (this.S) {
                this.i = j;
                if (b4 && this.W != null) {
                    this.W.a(j);
                }
                if (b4 && this.aa != null) {
                    this.aa.a(j);
                }
                this.requestLayout();
            }
            else {
                this.a(j);
                this.a(j, b, n, b4);
            }
        }
    }
    
    private void a(b b, int i, b b2) {
        final int b3 = this.h.b();
        final int clientWidth = this.getClientWidth();
        float n;
        if (clientWidth > 0) {
            n = this.o / (float)clientWidth;
        }
        else {
            n = 0.0f;
        }
        if (b2 != null) {
            int j = b2.b;
            if (j < b.b) {
                float e = b2.e + b2.d + n;
                int n2 = 0;
                ++j;
                while (j <= b.b && n2 < this.e.size()) {
                    for (b2 = this.e.get(n2); j > b2.b && n2 < this.e.size() - 1; ++n2, b2 = this.e.get(n2)) {}
                    while (j < b2.b) {
                        ++j;
                        e += 1.0f + n;
                    }
                    b2.e = e;
                    e += b2.d + n;
                    ++j;
                }
            }
            else if (j > b.b) {
                int size = this.e.size();
                float e2 = b2.e;
                --size;
                --j;
                while (j >= b.b && size >= 0) {
                    for (b2 = this.e.get(size); j < b2.b && size > 0; --size, b2 = this.e.get(size)) {}
                    while (j > b2.b) {
                        --j;
                        e2 -= 1.0f + n;
                    }
                    e2 -= b2.d + n;
                    b2.e = e2;
                    --j;
                }
            }
        }
        final int size2 = this.e.size();
        final float e3 = b.e;
        int k = b.b - 1;
        float e4;
        if (b.b == 0) {
            e4 = b.e;
        }
        else {
            e4 = -3.4028235E38f;
        }
        this.s = e4;
        float t;
        if (b.b == b3 - 1) {
            t = b.e + b.d - 1.0f;
        }
        else {
            t = Float.MAX_VALUE;
        }
        this.t = t;
        int l = i - 1;
        float n3 = e3;
        while (l >= 0) {
            for (b2 = this.e.get(l); k > b2.b; --k, n3 -= 1.0f + n) {}
            n3 -= b2.d + n;
            b2.e = n3;
            if (b2.b == 0) {
                this.s = n3;
            }
            --k;
            --l;
        }
        float e5 = b.e + b.d + n;
        final int n4 = b.b + 1;
        int index = i + 1;
        i = n4;
        while (index < size2) {
            for (b = this.e.get(index); i < b.b; ++i, e5 += 1.0f + n) {}
            if (b.b == b3 - 1) {
                this.t = b.d + e5 - 1.0f;
            }
            b.e = e5;
            e5 += b.d + n;
            ++i;
            ++index;
        }
        this.T = false;
    }
    
    static /* synthetic */ void a(final ViewPager viewPager) {
        viewPager.setScrollState(0);
    }
    
    private void a(final MotionEvent motionEvent) {
        final int b = android.support.v4.view.n.b(motionEvent);
        if (android.support.v4.view.n.b(motionEvent, b) == this.J) {
            int n;
            if (b == 0) {
                n = 1;
            }
            else {
                n = 0;
            }
            this.F = android.support.v4.view.n.c(motionEvent, n);
            this.J = android.support.v4.view.n.b(motionEvent, n);
            if (this.K != null) {
                this.K.clear();
            }
        }
    }
    
    private void a(final boolean b) {
        boolean b2;
        if (this.ai == 2) {
            b2 = true;
        }
        else {
            b2 = false;
        }
        if ((b2 ? 1 : 0) != 0) {
            this.setScrollingCacheEnabled(false);
            this.m.abortAnimation();
            final int scrollX = this.getScrollX();
            final int scrollY = this.getScrollY();
            final int currX = this.m.getCurrX();
            final int currY = this.m.getCurrY();
            if (scrollX != currX || scrollY != currY) {
                this.scrollTo(currX, currY);
            }
        }
        this.y = false;
        final int n = 0;
        int n2 = b2 ? 1 : 0;
        for (int i = n; i < this.e.size(); ++i) {
            final b b3 = this.e.get(i);
            if (b3.c) {
                b3.c = false;
                n2 = 1;
            }
        }
        if (n2 != 0) {
            if (b) {
                android.support.v4.view.u.a((View)this, this.ah);
            }
            else {
                this.ah.run();
            }
        }
    }
    
    private boolean a(float f) {
        boolean b = true;
        final boolean b2 = false;
        boolean b3 = false;
        final float f2 = this.F;
        this.F = f;
        final float n = this.getScrollX() + (f2 - f);
        final int clientWidth = this.getClientWidth();
        f = clientWidth * this.s;
        final float n2 = (float)clientWidth;
        final float t = this.t;
        final b b4 = this.e.get(0);
        final b b5 = this.e.get(this.e.size() - 1);
        int n3;
        if (b4.b != 0) {
            f = b4.e * clientWidth;
            n3 = 0;
        }
        else {
            n3 = 1;
        }
        float n4;
        if (b5.b != this.h.b() - 1) {
            n4 = b5.e * clientWidth;
            b = false;
        }
        else {
            n4 = n2 * t;
        }
        if (n < f) {
            n4 = f;
            if (n3 != 0) {
                b3 = this.Q.a(Math.abs(f - n) / clientWidth);
                n4 = f;
            }
        }
        else if (n > n4) {
            b3 = b2;
            if (b) {
                b3 = this.R.a(Math.abs(n - n4) / clientWidth);
            }
        }
        else {
            n4 = n;
        }
        this.F += n4 - (int)n4;
        this.scrollTo((int)n4, this.getScrollY());
        this.c((int)n4);
        return b3;
    }
    
    private boolean a(final View view, final boolean b, final int n, final int n2, final int n3) {
        final boolean b2 = true;
        if (view instanceof ViewGroup) {
            final ViewGroup viewGroup = (ViewGroup)view;
            final int scrollX = view.getScrollX();
            final int scrollY = view.getScrollY();
            for (int i = viewGroup.getChildCount() - 1; i >= 0; --i) {
                final View child = viewGroup.getChildAt(i);
                if (n2 + scrollX >= child.getLeft() && n2 + scrollX < child.getRight() && n3 + scrollY >= child.getTop() && n3 + scrollY < child.getBottom() && this.a(child, true, n, n2 + scrollX - child.getLeft(), n3 + scrollY - child.getTop())) {
                    return b2;
                }
            }
        }
        Label_0147: {
            break Label_0147;
        }
        if (b) {
            final boolean b3 = b2;
            if (android.support.v4.view.u.a(view, -n)) {
                return b3;
            }
        }
        return false;
    }
    
    private b b(final int n) {
        for (int i = 0; i < this.e.size(); ++i) {
            final b b = this.e.get(i);
            if (b.b == n) {
                return b;
            }
        }
        return null;
    }
    
    private b b(View view) {
        b a;
        while (true) {
            final ViewParent parent = view.getParent();
            if (parent == this) {
                a = this.a(view);
                break;
            }
            if (parent == null || !(parent instanceof View)) {
                a = null;
                break;
            }
            view = (View)parent;
        }
        return a;
    }
    
    private boolean c(final int n) {
        boolean b = false;
        if (this.e.size() == 0) {
            this.U = false;
            this.a(0, 0.0f);
            if (!this.U) {
                throw new IllegalStateException("onPageScrolled did not call superclass implementation");
            }
        }
        else {
            final b g = this.g();
            final int clientWidth = this.getClientWidth();
            final float n2 = this.o / (float)clientWidth;
            final int b2 = g.b;
            final float n3 = (n / (float)clientWidth - g.e) / (g.d + n2);
            this.U = false;
            this.a(b2, n3);
            if (!this.U) {
                throw new IllegalStateException("onPageScrolled did not call superclass implementation");
            }
            b = true;
        }
        return b;
    }
    
    private void d() {
        this.setWillNotDraw(false);
        this.setDescendantFocusability(262144);
        this.setFocusable(true);
        final Context context = this.getContext();
        this.m = new Scroller(context, ViewPager.d);
        final ViewConfiguration value = ViewConfiguration.get(context);
        final float density = context.getResources().getDisplayMetrics().density;
        this.E = android.support.v4.view.ab.a(value);
        this.L = (int)(400.0f * density);
        this.M = value.getScaledMaximumFlingVelocity();
        this.Q = new android.support.v4.f.d(context);
        this.R = new android.support.v4.f.d(context);
        this.N = (int)(25.0f * density);
        this.O = (int)(2.0f * density);
        this.C = (int)(16.0f * density);
        android.support.v4.view.u.a((View)this, new d());
        if (android.support.v4.view.u.c((View)this) == 0) {
            android.support.v4.view.u.d((View)this);
        }
    }
    
    private boolean d(final int n) {
        boolean b = false;
        final View focus = this.findFocus();
        View view = null;
        Label_0015: {
            if (focus == this) {
                view = null;
            }
            else {
                Label_0385: {
                    if (focus != null) {
                        ViewParent viewParent = focus.getParent();
                        while (true) {
                            while (viewParent instanceof ViewGroup) {
                                if (viewParent == this) {
                                    final int n2 = 1;
                                    if (n2 == 0) {
                                        final StringBuilder sb = new StringBuilder();
                                        sb.append(focus.getClass().getSimpleName());
                                        for (ViewParent viewParent2 = focus.getParent(); viewParent2 instanceof ViewGroup; viewParent2 = viewParent2.getParent()) {
                                            sb.append(" => ").append(viewParent2.getClass().getSimpleName());
                                        }
                                        Log.e("ViewPager", "arrowScroll tried to find focus based on non-child current focused view " + sb.toString());
                                        view = null;
                                        break Label_0015;
                                    }
                                    break Label_0385;
                                }
                                else {
                                    viewParent = viewParent.getParent();
                                }
                            }
                            final int n2 = 0;
                            continue;
                        }
                    }
                }
                view = focus;
            }
        }
        final View nextFocus = FocusFinder.getInstance().findNextFocus((ViewGroup)this, view, n);
        while (true) {
            Label_0341: {
                if (nextFocus != null && nextFocus != view) {
                    if (n == 17) {
                        final int left = this.a(this.g, nextFocus).left;
                        final int left2 = this.a(this.g, view).left;
                        if (view != null && left >= left2) {
                            b = this.i();
                        }
                        else {
                            b = nextFocus.requestFocus();
                        }
                    }
                    else if (n == 66) {
                        final int left3 = this.a(this.g, nextFocus).left;
                        final int left4 = this.a(this.g, view).left;
                        if (view != null && left3 <= left4) {
                            break Label_0341;
                        }
                        b = nextFocus.requestFocus();
                    }
                }
                else if (n == 17 || n == 1) {
                    b = this.i();
                }
                else if (n == 66 || n == 2) {
                    break Label_0341;
                }
                if (b) {
                    this.playSoundEffect(SoundEffectConstants.getContantForFocusDirection(n));
                }
                return b;
            }
            if (this.h != null && this.i < this.h.b() - 1) {
                this.a(this.i + 1, true);
                b = true;
                continue;
            }
            b = false;
            continue;
        }
    }
    
    private void e() {
        if (this.ae != 0) {
            if (this.af == null) {
                this.af = new ArrayList<View>();
            }
            else {
                this.af.clear();
            }
            for (int childCount = this.getChildCount(), i = 0; i < childCount; ++i) {
                this.af.add(this.getChildAt(i));
            }
            Collections.sort(this.af, ViewPager.ag);
        }
    }
    
    private void f() {
        final ViewParent parent = this.getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(true);
        }
    }
    
    private b g() {
        final int clientWidth = this.getClientWidth();
        float n;
        if (clientWidth > 0) {
            n = this.getScrollX() / (float)clientWidth;
        }
        else {
            n = 0.0f;
        }
        float n2;
        if (clientWidth > 0) {
            n2 = this.o / (float)clientWidth;
        }
        else {
            n2 = 0.0f;
        }
        float d = 0.0f;
        float e = 0.0f;
        int b = -1;
        int index = 0;
        int n3 = 1;
        b b2 = null;
        b b3;
        while (true) {
            b3 = b2;
            if (index >= this.e.size()) {
                break;
            }
            b f = this.e.get(index);
            if (n3 == 0 && f.b != b + 1) {
                f = this.f;
                f.e = d + e + n2;
                f.b = b + 1;
                f.d = 1.0f;
                --index;
            }
            e = f.e;
            final float d2 = f.d;
            if (n3 == 0) {
                b3 = b2;
                if (n < e) {
                    break;
                }
            }
            if (n < d2 + e + n2 || index == this.e.size() - 1) {
                b3 = f;
                break;
            }
            b = f.b;
            d = f.d;
            n3 = 0;
            ++index;
            b2 = f;
        }
        return b3;
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
    
    private boolean i() {
        boolean b = true;
        if (this.i > 0) {
            this.a(this.i - 1, true);
        }
        else {
            b = false;
        }
        return b;
    }
    
    private void setScrollState(final int ai) {
        if (this.ai != ai) {
            this.ai = ai;
            if (this.ac != null) {
                int n;
                if (ai != 0) {
                    n = 1;
                }
                else {
                    n = 0;
                }
                for (int childCount = this.getChildCount(), i = 0; i < childCount; ++i) {
                    int n2;
                    if (n != 0) {
                        n2 = 2;
                    }
                    else {
                        n2 = 0;
                    }
                    android.support.v4.view.u.b(this.getChildAt(i), n2);
                }
            }
            if (this.W != null) {
                this.W.b(ai);
            }
        }
    }
    
    private void setScrollingCacheEnabled(final boolean x) {
        if (this.x != x) {
            this.x = x;
        }
    }
    
    final f a(final f aa) {
        final f aa2 = this.aa;
        this.aa = aa;
        return aa2;
    }
    
    final void a() {
        final int b = this.h.b();
        this.b = b;
        final boolean b2 = this.e.size() < this.z * 2 + 1 && this.e.size() < b;
        final int i = this.i;
        for (int j = 0; j < this.e.size(); ++j) {
            this.e.get(j);
        }
        Collections.sort(this.e, ViewPager.c);
        if (b2) {
            for (int childCount = this.getChildCount(), k = 0; k < childCount; ++k) {
                final c c = (c)this.getChildAt(k).getLayoutParams();
                if (!c.a) {
                    c.c = 0.0f;
                }
            }
            this.a(i, false, true);
            this.requestLayout();
        }
    }
    
    public final void a(final int n, final boolean b) {
        this.a(n, b, this.y = false);
    }
    
    public void addFocusables(final ArrayList<View> list, final int n, final int n2) {
        final int size = list.size();
        final int descendantFocusability = this.getDescendantFocusability();
        if (descendantFocusability != 393216) {
            for (int i = 0; i < this.getChildCount(); ++i) {
                final View child = this.getChildAt(i);
                if (child.getVisibility() == 0) {
                    final b a = this.a(child);
                    if (a != null && a.b == this.i) {
                        child.addFocusables((ArrayList)list, n, n2);
                    }
                }
            }
        }
        if ((descendantFocusability != 262144 || size == list.size()) && this.isFocusable() && ((n2 & 0x1) != 0x1 || !this.isInTouchMode() || this.isFocusableInTouchMode()) && list != null) {
            list.add((View)this);
        }
    }
    
    public void addTouchables(final ArrayList<View> list) {
        for (int i = 0; i < this.getChildCount(); ++i) {
            final View child = this.getChildAt(i);
            if (child.getVisibility() == 0) {
                final b a = this.a(child);
                if (a != null && a.b == this.i) {
                    child.addTouchables((ArrayList)list);
                }
            }
        }
    }
    
    public void addView(final View view, final int n, ViewGroup$LayoutParams generateLayoutParams) {
        if (!this.checkLayoutParams(generateLayoutParams)) {
            generateLayoutParams = this.generateLayoutParams(generateLayoutParams);
        }
        final c c = (c)generateLayoutParams;
        c.a |= (view instanceof a);
        if (this.w) {
            if (c != null && c.a) {
                throw new IllegalStateException("Cannot add pager decor view during layout");
            }
            c.d = true;
            this.addViewInLayout(view, n, generateLayoutParams);
        }
        else {
            super.addView(view, n, generateLayoutParams);
        }
    }
    
    final void b() {
        this.a(this.i);
    }
    
    public boolean canScrollHorizontally(final int n) {
        final boolean b = false;
        boolean b2;
        if (this.h == null) {
            b2 = b;
        }
        else {
            final int clientWidth = this.getClientWidth();
            final int scrollX = this.getScrollX();
            if (n < 0) {
                b2 = b;
                if (scrollX > (int)(clientWidth * this.s)) {
                    b2 = true;
                }
            }
            else {
                b2 = b;
                if (n > 0) {
                    b2 = b;
                    if (scrollX < (int)(clientWidth * this.t)) {
                        b2 = true;
                    }
                }
            }
        }
        return b2;
    }
    
    protected boolean checkLayoutParams(final ViewGroup$LayoutParams viewGroup$LayoutParams) {
        return viewGroup$LayoutParams instanceof c && super.checkLayoutParams(viewGroup$LayoutParams);
    }
    
    public void computeScroll() {
        if (!this.m.isFinished() && this.m.computeScrollOffset()) {
            final int scrollX = this.getScrollX();
            final int scrollY = this.getScrollY();
            final int currX = this.m.getCurrX();
            final int currY = this.m.getCurrY();
            if (scrollX != currX || scrollY != currY) {
                this.scrollTo(currX, currY);
                if (!this.c(currX)) {
                    this.m.abortAnimation();
                    this.scrollTo(0, currY);
                }
            }
            android.support.v4.view.u.b((View)this);
        }
        else {
            this.a(true);
        }
    }
    
    public boolean dispatchKeyEvent(final KeyEvent keyEvent) {
        boolean b = false;
        if (!super.dispatchKeyEvent(keyEvent)) {
            boolean b2 = false;
            Label_0058: {
                if (keyEvent.getAction() == 0) {
                    switch (keyEvent.getKeyCode()) {
                        case 21: {
                            b2 = this.d(17);
                            break Label_0058;
                        }
                        case 22: {
                            b2 = this.d(66);
                            break Label_0058;
                        }
                        case 61: {
                            if (Build$VERSION.SDK_INT < 11) {
                                break;
                            }
                            if (android.support.v4.view.g.b(keyEvent)) {
                                b2 = this.d(2);
                                break Label_0058;
                            }
                            if (android.support.v4.view.g.a(keyEvent)) {
                                b2 = this.d(1);
                                break Label_0058;
                            }
                            break;
                        }
                    }
                }
                b2 = false;
            }
            if (!b2) {
                return b;
            }
        }
        b = true;
        return b;
    }
    
    public boolean dispatchPopulateAccessibilityEvent(final AccessibilityEvent accessibilityEvent) {
        final boolean b = false;
        boolean dispatchPopulateAccessibilityEvent;
        if (accessibilityEvent.getEventType() == 4096) {
            dispatchPopulateAccessibilityEvent = super.dispatchPopulateAccessibilityEvent(accessibilityEvent);
        }
        else {
            final int childCount = this.getChildCount();
            int n = 0;
            while (true) {
                dispatchPopulateAccessibilityEvent = b;
                if (n >= childCount) {
                    return dispatchPopulateAccessibilityEvent;
                }
                final View child = this.getChildAt(n);
                if (child.getVisibility() == 0) {
                    final b a = this.a(child);
                    if (a != null && a.b == this.i && child.dispatchPopulateAccessibilityEvent(accessibilityEvent)) {
                        break;
                    }
                }
                ++n;
            }
            dispatchPopulateAccessibilityEvent = true;
        }
        return dispatchPopulateAccessibilityEvent;
    }
    
    public void draw(final Canvas canvas) {
        super.draw(canvas);
        int n = 0;
        int n2 = 0;
        final int a = android.support.v4.view.u.a((View)this);
        if (a == 0 || (a == 1 && this.h != null && this.h.b() > 1)) {
            if (!this.Q.a()) {
                final int save = canvas.save();
                final int n3 = this.getHeight() - this.getPaddingTop() - this.getPaddingBottom();
                final int width = this.getWidth();
                canvas.rotate(270.0f);
                canvas.translate((float)(-n3 + this.getPaddingTop()), this.s * width);
                this.Q.a(n3, width);
                n2 = ((this.Q.a(canvas) | false) ? 1 : 0);
                canvas.restoreToCount(save);
            }
            n = n2;
            if (!this.R.a()) {
                final int save2 = canvas.save();
                final int width2 = this.getWidth();
                final int height = this.getHeight();
                final int paddingTop = this.getPaddingTop();
                final int paddingBottom = this.getPaddingBottom();
                canvas.rotate(90.0f);
                canvas.translate((float)(-this.getPaddingTop()), -(this.t + 1.0f) * width2);
                this.R.a(height - paddingTop - paddingBottom, width2);
                n = (n2 | (this.R.a(canvas) ? 1 : 0));
                canvas.restoreToCount(save2);
            }
        }
        else {
            this.Q.b();
            this.R.b();
        }
        if (n != 0) {
            android.support.v4.view.u.b((View)this);
        }
    }
    
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        final Drawable p = this.p;
        if (p != null && p.isStateful()) {
            p.setState(this.getDrawableState());
        }
    }
    
    protected ViewGroup$LayoutParams generateDefaultLayoutParams() {
        return new c();
    }
    
    public ViewGroup$LayoutParams generateLayoutParams(final AttributeSet set) {
        return new c(this.getContext(), set);
    }
    
    protected ViewGroup$LayoutParams generateLayoutParams(final ViewGroup$LayoutParams viewGroup$LayoutParams) {
        return this.generateDefaultLayoutParams();
    }
    
    public p getAdapter() {
        return this.h;
    }
    
    protected int getChildDrawingOrder(final int n, final int n2) {
        int index = n2;
        if (this.ae == 2) {
            index = n - 1 - n2;
        }
        return ((c)this.af.get(index).getLayoutParams()).f;
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
    
    protected void onDraw(final Canvas canvas) {
        super.onDraw(canvas);
        if (this.o > 0 && this.p != null && this.e.size() > 0 && this.h != null) {
            final int scrollX = this.getScrollX();
            final int width = this.getWidth();
            final float n = this.o / (float)width;
            b b = this.e.get(0);
            float e = b.e;
            final int size = this.e.size();
            int i = b.b;
            final int b2 = this.e.get(size - 1).b;
            int index = 0;
            while (i < b2) {
                while (i > b.b && index < size) {
                    final ArrayList<b> e2 = this.e;
                    ++index;
                    b = e2.get(index);
                }
                float n2;
                if (i == b.b) {
                    n2 = (b.e + b.d) * width;
                    e = b.e + b.d + n;
                }
                else {
                    n2 = (1.0f + e) * width;
                    e += 1.0f + n;
                }
                if (this.o + n2 > scrollX) {
                    this.p.setBounds((int)n2, this.q, (int)(this.o + n2 + 0.5f), this.r);
                    this.p.draw(canvas);
                }
                if (n2 > scrollX + width) {
                    break;
                }
                ++i;
            }
        }
    }
    
    public boolean onInterceptTouchEvent(final MotionEvent motionEvent) {
        final boolean b = false;
        final int n = motionEvent.getAction() & 0xFF;
        boolean a;
        if (n == 3 || n == 1) {
            this.A = false;
            this.B = false;
            this.J = -1;
            a = b;
            if (this.K != null) {
                this.K.recycle();
                this.K = null;
                a = b;
            }
        }
        else {
            if (n != 0) {
                if (this.A) {
                    a = true;
                    return a;
                }
                a = b;
                if (this.B) {
                    return a;
                }
            }
            switch (n) {
                case 2: {
                    final int j = this.J;
                    if (j == -1) {
                        break;
                    }
                    final int a2 = android.support.v4.view.n.a(motionEvent, j);
                    final float c = android.support.v4.view.n.c(motionEvent, a2);
                    final float a3 = c - this.F;
                    final float abs = Math.abs(a3);
                    final float d = android.support.v4.view.n.d(motionEvent, a2);
                    final float abs2 = Math.abs(d - this.I);
                    if (a3 != 0.0f) {
                        final float f = this.F;
                        boolean b2;
                        if ((f < this.D && a3 > 0.0f) || (f > this.getWidth() - this.D && a3 < 0.0f)) {
                            b2 = true;
                        }
                        else {
                            b2 = false;
                        }
                        if (!b2 && this.a((View)this, false, (int)a3, (int)c, (int)d)) {
                            this.F = c;
                            this.G = d;
                            this.B = true;
                            a = b;
                            return a;
                        }
                    }
                    if (abs > this.E && 0.5f * abs > abs2) {
                        this.A = true;
                        this.f();
                        this.setScrollState(1);
                        float f2;
                        if (a3 > 0.0f) {
                            f2 = this.H + this.E;
                        }
                        else {
                            f2 = this.H - this.E;
                        }
                        this.F = f2;
                        this.G = d;
                        this.setScrollingCacheEnabled(true);
                    }
                    else if (abs2 > this.E) {
                        this.B = true;
                    }
                    if (this.A && this.a(c)) {
                        android.support.v4.view.u.b((View)this);
                        break;
                    }
                    break;
                }
                case 0: {
                    final float x = motionEvent.getX();
                    this.H = x;
                    this.F = x;
                    final float y = motionEvent.getY();
                    this.I = y;
                    this.G = y;
                    this.J = android.support.v4.view.n.b(motionEvent, 0);
                    this.B = false;
                    this.m.computeScrollOffset();
                    if (this.ai == 2 && Math.abs(this.m.getFinalX() - this.m.getCurrX()) > this.O) {
                        this.m.abortAnimation();
                        this.y = false;
                        this.b();
                        this.A = true;
                        this.f();
                        this.setScrollState(1);
                        break;
                    }
                    this.a(false);
                    this.A = false;
                    break;
                }
                case 6: {
                    this.a(motionEvent);
                    break;
                }
            }
            if (this.K == null) {
                this.K = VelocityTracker.obtain();
            }
            this.K.addMovement(motionEvent);
            a = this.A;
        }
        return a;
    }
    
    protected void onLayout(final boolean b, int paddingTop, int paddingLeft, int paddingBottom, int i) {
        final int childCount = this.getChildCount();
        final int n = paddingBottom - paddingTop;
        final int n2 = i - paddingLeft;
        paddingLeft = this.getPaddingLeft();
        paddingTop = this.getPaddingTop();
        int paddingRight = this.getPaddingRight();
        paddingBottom = this.getPaddingBottom();
        final int scrollX = this.getScrollX();
        int v = 0;
        int j = 0;
    Label_0253_Outer:
        while (j < childCount) {
            final View child = this.getChildAt(j);
            while (true) {
                Label_0662: {
                    if (child.getVisibility() == 8) {
                        break Label_0662;
                    }
                    final c c = (c)child.getLayoutParams();
                    if (!c.a) {
                        break Label_0662;
                    }
                    i = c.b;
                    final int b2 = c.b;
                    int n3 = 0;
                    switch (i & 0x7) {
                        default: {
                            i = paddingLeft;
                            n3 = paddingLeft;
                            break;
                        }
                        case 3: {
                            final int measuredWidth = child.getMeasuredWidth();
                            i = paddingLeft;
                            n3 = measuredWidth + paddingLeft;
                            break;
                        }
                        case 1: {
                            i = Math.max((n - child.getMeasuredWidth()) / 2, paddingLeft);
                            n3 = paddingLeft;
                            break;
                        }
                        case 5: {
                            final int measuredWidth2 = child.getMeasuredWidth();
                            i = paddingRight + child.getMeasuredWidth();
                            final int n4 = n - paddingRight - measuredWidth2;
                            paddingRight = i;
                            n3 = paddingLeft;
                            i = n4;
                            break;
                        }
                    }
                    switch (b2 & 0x70) {
                        default: {
                            final int n5 = paddingTop;
                            paddingLeft = paddingTop;
                            paddingTop = paddingBottom;
                            paddingBottom = n5;
                            break;
                        }
                        case 48: {
                            final int measuredHeight = child.getMeasuredHeight();
                            paddingLeft = paddingBottom;
                            final int n6 = measuredHeight + paddingTop;
                            paddingBottom = paddingTop;
                            paddingTop = paddingLeft;
                            paddingLeft = n6;
                            break;
                        }
                        case 16: {
                            final int max = Math.max((n2 - child.getMeasuredHeight()) / 2, paddingTop);
                            paddingLeft = paddingTop;
                            paddingTop = paddingBottom;
                            paddingBottom = max;
                            break;
                        }
                        case 80: {
                            final int n7 = n2 - paddingBottom - child.getMeasuredHeight();
                            final int measuredHeight2 = child.getMeasuredHeight();
                            paddingLeft = paddingTop;
                            paddingTop = paddingBottom + measuredHeight2;
                            paddingBottom = n7;
                            break;
                        }
                    }
                    i += scrollX;
                    child.layout(i, paddingBottom, child.getMeasuredWidth() + i, child.getMeasuredHeight() + paddingBottom);
                    ++v;
                    i = paddingRight;
                    paddingBottom = n3;
                    final int n8 = paddingTop;
                    paddingTop = v;
                    ++j;
                    final int n9 = paddingBottom;
                    v = paddingTop;
                    paddingTop = paddingLeft;
                    paddingBottom = n8;
                    paddingRight = i;
                    paddingLeft = n9;
                    continue Label_0253_Outer;
                }
                i = v;
                final int n10 = paddingTop;
                final int n11 = paddingLeft;
                paddingTop = i;
                i = paddingRight;
                final int n8 = paddingBottom;
                paddingLeft = n10;
                paddingBottom = n11;
                continue;
            }
        }
        final int n12 = n - paddingLeft - paddingRight;
        View child2;
        c c2;
        b a;
        int n13;
        for (i = 0; i < childCount; ++i) {
            child2 = this.getChildAt(i);
            if (child2.getVisibility() != 8) {
                c2 = (c)child2.getLayoutParams();
                if (!c2.a) {
                    a = this.a(child2);
                    if (a != null) {
                        n13 = (int)(a.e * n12) + paddingLeft;
                        if (c2.d) {
                            c2.d = false;
                            child2.measure(View$MeasureSpec.makeMeasureSpec((int)(c2.c * n12), 1073741824), View$MeasureSpec.makeMeasureSpec(n2 - paddingTop - paddingBottom, 1073741824));
                        }
                        child2.layout(n13, paddingTop, child2.getMeasuredWidth() + n13, child2.getMeasuredHeight() + paddingTop);
                    }
                }
            }
        }
        this.q = paddingTop;
        this.r = n2 - paddingBottom;
        this.V = v;
        if (this.S) {
            this.a(this.i, false, 0, false);
        }
        this.S = false;
    }
    
    protected void onMeasure(int measuredWidth, int i) {
        this.setMeasuredDimension(getDefaultSize(0, measuredWidth), getDefaultSize(0, i));
        measuredWidth = this.getMeasuredWidth();
        this.D = Math.min(measuredWidth / 10, this.C);
        measuredWidth = measuredWidth - this.getPaddingLeft() - this.getPaddingRight();
        i = this.getMeasuredHeight() - this.getPaddingTop() - this.getPaddingBottom();
        int n;
        int n2;
    Label_0316:
        for (int childCount = this.getChildCount(), j = 0; j < childCount; ++j, measuredWidth = n, i = n2) {
            final View child = this.getChildAt(j);
            n = measuredWidth;
            n2 = i;
            if (child.getVisibility() != 8) {
                final c c = (c)child.getLayoutParams();
                n = measuredWidth;
                n2 = i;
                if (c != null) {
                    n = measuredWidth;
                    n2 = i;
                    if (c.a) {
                        final int n3 = c.b & 0x7;
                        final int n4 = c.b & 0x70;
                        final int n5 = Integer.MIN_VALUE;
                        int n6 = Integer.MIN_VALUE;
                        boolean b;
                        if (n4 == 48 || n4 == 80) {
                            b = true;
                        }
                        else {
                            b = false;
                        }
                        final boolean b2 = n3 == 3 || n3 == 5;
                        int n7;
                        if (b) {
                            n7 = 1073741824;
                        }
                        else {
                            n7 = n5;
                            if (b2) {
                                n6 = 1073741824;
                                n7 = n5;
                            }
                        }
                        int n8;
                        int width;
                        if (c.width != -2) {
                            n8 = 1073741824;
                            if (c.width != -1) {
                                width = c.width;
                            }
                            else {
                                width = measuredWidth;
                            }
                        }
                        else {
                            n8 = n7;
                            width = measuredWidth;
                        }
                        while (true) {
                            Label_0512: {
                                if (c.height == -2) {
                                    break Label_0512;
                                }
                                n6 = 1073741824;
                                if (c.height == -1) {
                                    break Label_0512;
                                }
                                final int height = c.height;
                                n6 = n6;
                                final int n9 = height;
                                child.measure(View$MeasureSpec.makeMeasureSpec(width, n8), View$MeasureSpec.makeMeasureSpec(n9, n6));
                                if (b) {
                                    n2 = i - child.getMeasuredHeight();
                                    n = measuredWidth;
                                    continue Label_0316;
                                }
                                n = measuredWidth;
                                n2 = i;
                                if (b2) {
                                    n = measuredWidth - child.getMeasuredWidth();
                                    n2 = i;
                                }
                                continue Label_0316;
                            }
                            final int n9 = i;
                            continue;
                        }
                    }
                }
            }
        }
        this.u = View$MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824);
        this.v = View$MeasureSpec.makeMeasureSpec(i, 1073741824);
        this.w = true;
        this.b();
        this.w = false;
        int childCount2;
        View child2;
        c c2;
        for (childCount2 = this.getChildCount(), i = 0; i < childCount2; ++i) {
            child2 = this.getChildAt(i);
            if (child2.getVisibility() != 8) {
                c2 = (c)child2.getLayoutParams();
                if (c2 == null || !c2.a) {
                    child2.measure(View$MeasureSpec.makeMeasureSpec((int)(c2.c * measuredWidth), 1073741824), this.v);
                }
            }
        }
    }
    
    protected boolean onRequestFocusInDescendants(final int n, final Rect rect) {
        boolean b = true;
        int n2 = -1;
        int childCount = this.getChildCount();
        int i;
        if ((n & 0x2) != 0x0) {
            n2 = 1;
            i = 0;
        }
        else {
            i = childCount - 1;
            childCount = -1;
        }
        while (i != childCount) {
            final View child = this.getChildAt(i);
            if (child.getVisibility() == 0) {
                final b a = this.a(child);
                if (a != null && a.b == this.i && child.requestFocus(n, rect)) {
                    return b;
                }
            }
            i += n2;
        }
        b = false;
        return b;
    }
    
    public void onRestoreInstanceState(final Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
        }
        else {
            final SavedState savedState = (SavedState)parcelable;
            super.onRestoreInstanceState(savedState.getSuperState());
            if (this.h != null) {
                final Parcelable b = savedState.b;
                final ClassLoader c = savedState.c;
                this.a(savedState.a, false, true);
            }
            else {
                this.j = savedState.a;
                this.k = savedState.b;
                this.l = savedState.c;
            }
        }
    }
    
    public Parcelable onSaveInstanceState() {
        final SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.a = this.i;
        if (this.h != null) {
            savedState.b = null;
        }
        return (Parcelable)savedState;
    }
    
    protected void onSizeChanged(final int n, final int n2, final int n3, final int n4) {
        super.onSizeChanged(n, n2, n3, n4);
        if (n != n3) {
            this.a(n, n3, this.o, this.o);
        }
    }
    
    public boolean onTouchEvent(final MotionEvent motionEvent) {
        final int n = 0;
        boolean b;
        if (this.P) {
            b = true;
        }
        else if (motionEvent.getAction() == 0 && motionEvent.getEdgeFlags() != 0) {
            b = false;
        }
        else if (this.h == null || this.h.b() == 0) {
            b = false;
        }
        else {
            if (this.K == null) {
                this.K = VelocityTracker.obtain();
            }
            this.K.addMovement(motionEvent);
            int n2 = n;
            while (true) {
                switch (motionEvent.getAction() & 0xFF) {
                    default: {
                        n2 = n;
                        break Label_0131;
                    }
                    case 6: {
                        this.a(motionEvent);
                        this.F = android.support.v4.view.n.c(motionEvent, android.support.v4.view.n.a(motionEvent, this.J));
                        n2 = n;
                        break Label_0131;
                    }
                    case 5: {
                        final int b2 = android.support.v4.view.n.b(motionEvent);
                        this.F = android.support.v4.view.n.c(motionEvent, b2);
                        this.J = android.support.v4.view.n.b(motionEvent, b2);
                        n2 = n;
                        break Label_0131;
                    }
                    case 0: {
                        this.m.abortAnimation();
                        this.y = false;
                        this.b();
                        final float x = motionEvent.getX();
                        this.H = x;
                        this.F = x;
                        final float y = motionEvent.getY();
                        this.I = y;
                        this.G = y;
                        this.J = android.support.v4.view.n.b(motionEvent, 0);
                        n2 = n;
                    }
                    case 4: {
                        if (n2 != 0) {
                            android.support.v4.view.u.b((View)this);
                        }
                        b = true;
                        break;
                    }
                    case 2: {
                        if (!this.A) {
                            final int a = android.support.v4.view.n.a(motionEvent, this.J);
                            final float c = android.support.v4.view.n.c(motionEvent, a);
                            final float abs = Math.abs(c - this.F);
                            final float d = android.support.v4.view.n.d(motionEvent, a);
                            final float abs2 = Math.abs(d - this.G);
                            if (abs > this.E && abs > abs2) {
                                this.A = true;
                                this.f();
                                float f;
                                if (c - this.H > 0.0f) {
                                    f = this.H + this.E;
                                }
                                else {
                                    f = this.H - this.E;
                                }
                                this.F = f;
                                this.G = d;
                                this.setScrollState(1);
                                this.setScrollingCacheEnabled(true);
                                final ViewParent parent = this.getParent();
                                if (parent != null) {
                                    parent.requestDisallowInterceptTouchEvent(true);
                                }
                            }
                        }
                        n2 = n;
                        if (this.A) {
                            n2 = ((this.a(android.support.v4.view.n.c(motionEvent, android.support.v4.view.n.a(motionEvent, this.J))) | false) ? 1 : 0);
                        }
                        continue;
                    }
                    case 1: {
                        n2 = n;
                        if (this.A) {
                            final VelocityTracker k = this.K;
                            k.computeCurrentVelocity(1000, (float)this.M);
                            final int a2 = (int)android.support.v4.view.s.a(k, this.J);
                            this.y = true;
                            final int clientWidth = this.getClientWidth();
                            final int scrollX = this.getScrollX();
                            final b g = this.g();
                            int b3 = g.b;
                            final float n3 = (scrollX / (float)clientWidth - g.e) / g.d;
                            if (Math.abs((int)(android.support.v4.view.n.c(motionEvent, android.support.v4.view.n.a(motionEvent, this.J)) - this.H)) > this.N && Math.abs(a2) > this.L) {
                                if (a2 <= 0) {
                                    ++b3;
                                }
                            }
                            else {
                                float n4;
                                if (b3 >= this.i) {
                                    n4 = 0.4f;
                                }
                                else {
                                    n4 = 0.6f;
                                }
                                b3 = (int)(b3 + n3 + n4);
                            }
                            int max = b3;
                            if (this.e.size() > 0) {
                                max = Math.max(this.e.get(0).b, Math.min(b3, this.e.get(this.e.size() - 1).b));
                            }
                            this.a(max, true, true, a2);
                            this.J = -1;
                            this.h();
                            n2 = ((this.Q.c() | this.R.c()) ? 1 : 0);
                        }
                        continue;
                    }
                    case 3: {
                        n2 = n;
                        if (this.A) {
                            this.a(this.i, true, 0, false);
                            this.J = -1;
                            this.h();
                            n2 = ((this.Q.c() | this.R.c()) ? 1 : 0);
                        }
                        continue;
                    }
                }
                break;
            }
        }
        return b;
    }
    
    public void removeView(final View view) {
        if (this.w) {
            this.removeViewInLayout(view);
        }
        else {
            super.removeView(view);
        }
    }
    
    public void setAdapter(final p h) {
        if (this.h != null) {
            this.h.b(this.n);
            for (int i = 0; i < this.e.size(); ++i) {
                this.h.a(this.e.get(i).a);
            }
            this.h.a();
            this.e.clear();
            int n;
            for (int j = 0; j < this.getChildCount(); j = n + 1) {
                n = j;
                if (!((c)this.getChildAt(j).getLayoutParams()).a) {
                    this.removeViewAt(j);
                    n = j - 1;
                }
            }
            this.scrollTo(this.i = 0, 0);
        }
        final p h2 = this.h;
        this.h = h;
        this.b = 0;
        if (this.h != null) {
            if (this.n == null) {
                this.n = new h((byte)0);
            }
            this.h.a(this.n);
            this.y = false;
            final boolean s = this.S;
            this.S = true;
            this.b = this.h.b();
            if (this.j >= 0) {
                this.a(this.j, false, true);
                this.j = -1;
                this.k = null;
                this.l = null;
            }
            else if (!s) {
                this.b();
            }
            else {
                this.requestLayout();
            }
        }
        if (this.ab != null && h2 != h) {
            this.ab.a(h2, h);
        }
    }
    
    void setChildrenDrawingOrderEnabledCompat(final boolean p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     5: if_icmplt       57
        //     8: aload_0        
        //     9: getfield        android/support/v4/view/ViewPager.ad:Ljava/lang/reflect/Method;
        //    12: ifnonnull       37
        //    15: aload_0        
        //    16: ldc             Landroid/view/ViewGroup;.class
        //    18: ldc_w           "setChildrenDrawingOrderEnabled"
        //    21: iconst_1       
        //    22: anewarray       Ljava/lang/Class;
        //    25: dup            
        //    26: iconst_0       
        //    27: getstatic       java/lang/Boolean.TYPE:Ljava/lang/Class;
        //    30: aastore        
        //    31: invokevirtual   java/lang/Class.getDeclaredMethod:(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
        //    34: putfield        android/support/v4/view/ViewPager.ad:Ljava/lang/reflect/Method;
        //    37: aload_0        
        //    38: getfield        android/support/v4/view/ViewPager.ad:Ljava/lang/reflect/Method;
        //    41: aload_0        
        //    42: iconst_1       
        //    43: anewarray       Ljava/lang/Object;
        //    46: dup            
        //    47: iconst_0       
        //    48: iload_1        
        //    49: invokestatic    java/lang/Boolean.valueOf:(Z)Ljava/lang/Boolean;
        //    52: aastore        
        //    53: invokevirtual   java/lang/reflect/Method.invoke:(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
        //    56: pop            
        //    57: return         
        //    58: astore_2       
        //    59: ldc_w           "ViewPager"
        //    62: ldc_w           "Can't find setChildrenDrawingOrderEnabled"
        //    65: aload_2        
        //    66: invokestatic    android/util/Log.e:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
        //    69: pop            
        //    70: goto            37
        //    73: astore_2       
        //    74: ldc_w           "ViewPager"
        //    77: ldc_w           "Error changing children drawing order"
        //    80: aload_2        
        //    81: invokestatic    android/util/Log.e:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
        //    84: pop            
        //    85: goto            57
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                             
        //  -----  -----  -----  -----  ---------------------------------
        //  15     37     58     73     Ljava/lang/NoSuchMethodException;
        //  37     57     73     88     Ljava/lang/Exception;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0037:
        //     at com.strobel.decompiler.ast.Error.expressionLinkedFromMultipleLocations(Error.java:27)
        //     at com.strobel.decompiler.ast.AstOptimizer.mergeDisparateObjectInitializations(AstOptimizer.java:2596)
        //     at com.strobel.decompiler.ast.AstOptimizer.optimize(AstOptimizer.java:235)
        //     at com.strobel.decompiler.ast.AstOptimizer.optimize(AstOptimizer.java:42)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:214)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:99)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethodBody(AstBuilder.java:782)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethod(AstBuilder.java:675)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addTypeMembers(AstBuilder.java:552)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeCore(AstBuilder.java:519)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeNoCache(AstBuilder.java:161)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createType(AstBuilder.java:150)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addType(AstBuilder.java:125)
        //     at com.strobel.decompiler.languages.java.JavaLanguage.buildAst(JavaLanguage.java:71)
        //     at com.strobel.decompiler.languages.java.JavaLanguage.decompileType(JavaLanguage.java:59)
        //     at com.strobel.decompiler.DecompilerDriver.decompileType(DecompilerDriver.java:330)
        //     at com.strobel.decompiler.DecompilerDriver.decompileJar(DecompilerDriver.java:251)
        //     at com.strobel.decompiler.DecompilerDriver.main(DecompilerDriver.java:126)
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    public void setCurrentItem(final int n) {
        this.y = false;
        this.a(n, !this.S, false);
    }
    
    public void setOffscreenPageLimit(final int i) {
        int z = i;
        if (i <= 0) {
            Log.w("ViewPager", "Requested offscreen page limit " + i + " too small; defaulting to 1");
            z = 1;
        }
        if (z != this.z) {
            this.z = z;
            this.b();
        }
    }
    
    void setOnAdapterChangeListener(final e ab) {
        this.ab = ab;
    }
    
    public void setOnPageChangeListener(final f w) {
        this.W = w;
    }
    
    public void setPageMargin(final int o) {
        final int o2 = this.o;
        this.o = o;
        final int width = this.getWidth();
        this.a(width, width, o, o2);
        this.requestLayout();
    }
    
    public void setPageMarginDrawable(final int n) {
        this.setPageMarginDrawable(this.getContext().getResources().getDrawable(n));
    }
    
    public void setPageMarginDrawable(final Drawable p) {
        this.p = p;
        if (p != null) {
            this.refreshDrawableState();
        }
        this.setWillNotDraw(p == null);
        this.invalidate();
    }
    
    protected boolean verifyDrawable(final Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.p;
    }
    
    public static class SavedState extends View$BaseSavedState
    {
        public static final Parcelable$Creator<SavedState> CREATOR;
        int a;
        Parcelable b;
        ClassLoader c;
        
        static {
            final android.support.v4.c.b<SavedState> b = new android.support.v4.c.b<SavedState>() {};
            if (Build$VERSION.SDK_INT >= 13) {
                android.support.v4.c.d.a((android.support.v4.c.b<Object>)b);
            }
            CREATOR = (Parcelable$Creator)new android.support.v4.c.a.a((android.support.v4.c.b<Object>)b);
        }
        
        SavedState(final Parcel parcel, final ClassLoader classLoader) {
            super(parcel);
            ClassLoader classLoader2 = classLoader;
            if (classLoader == null) {
                classLoader2 = this.getClass().getClassLoader();
            }
            this.a = parcel.readInt();
            this.b = parcel.readParcelable(classLoader2);
            this.c = classLoader2;
        }
        
        public SavedState(final Parcelable parcelable) {
            super(parcelable);
        }
        
        public String toString() {
            return "FragmentPager.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " position=" + this.a + "}";
        }
        
        public void writeToParcel(final Parcel parcel, final int n) {
            super.writeToParcel(parcel, n);
            parcel.writeInt(this.a);
            parcel.writeParcelable(this.b, n);
        }
    }
    
    interface a
    {
    }
    
    static final class b
    {
        Object a;
        int b;
        boolean c;
        float d;
        float e;
    }
    
    public static final class c extends ViewGroup$LayoutParams
    {
        public boolean a;
        public int b;
        float c;
        boolean d;
        int e;
        int f;
        
        public c() {
            super(-1, -1);
            this.c = 0.0f;
        }
        
        public c(final Context context, final AttributeSet set) {
            super(context, set);
            this.c = 0.0f;
            final TypedArray obtainStyledAttributes = context.obtainStyledAttributes(set, ViewPager.a);
            this.b = obtainStyledAttributes.getInteger(0, 48);
            obtainStyledAttributes.recycle();
        }
    }
    
    final class d extends a
    {
        private boolean a() {
            boolean b = true;
            if (ViewPager.this.h == null || ViewPager.this.h.b() <= 1) {
                b = false;
            }
            return b;
        }
        
        @Override
        public final void a(final View view, final android.support.v4.view.a.a a) {
            super.a(view, a);
            android.support.v4.view.a.a.a.a(a.b, ViewPager.class.getName());
            android.support.v4.view.a.a.a.a(a.b, this.a());
            if (ViewPager.this.canScrollHorizontally(1)) {
                a.a(4096);
            }
            if (ViewPager.this.canScrollHorizontally(-1)) {
                a.a(8192);
            }
        }
        
        @Override
        public final boolean a(final View view, final int n, final Bundle bundle) {
            boolean b = true;
            if (!super.a(view, n, bundle)) {
                switch (n) {
                    default: {
                        b = false;
                        break;
                    }
                    case 4096: {
                        if (ViewPager.this.canScrollHorizontally(1)) {
                            ViewPager.this.setCurrentItem(ViewPager.this.i + 1);
                            break;
                        }
                        b = false;
                        break;
                    }
                    case 8192: {
                        if (ViewPager.this.canScrollHorizontally(-1)) {
                            ViewPager.this.setCurrentItem(ViewPager.this.i - 1);
                            break;
                        }
                        b = false;
                        break;
                    }
                }
            }
            return b;
        }
        
        @Override
        public final void d(final View view, final AccessibilityEvent accessibilityEvent) {
            super.d(view, accessibilityEvent);
            accessibilityEvent.setClassName((CharSequence)ViewPager.class.getName());
            final android.support.v4.view.a.g a = android.support.v4.view.a.g.a();
            android.support.v4.view.a.g.a.a(a.b, this.a());
            if (accessibilityEvent.getEventType() == 4096 && ViewPager.this.h != null) {
                android.support.v4.view.a.g.a.b(a.b, ViewPager.this.h.b());
                android.support.v4.view.a.g.a.a(a.b, ViewPager.this.i);
                android.support.v4.view.a.g.a.c(a.b, ViewPager.this.i);
            }
        }
    }
    
    interface e
    {
        void a(final p p0, final p p1);
    }
    
    public interface f
    {
        void a(final int p0);
        
        void a(final int p0, final float p1);
        
        void b(final int p0);
    }
    
    public interface g
    {
    }
    
    private final class h extends DataSetObserver
    {
        public final void onChanged() {
            ViewPager.this.a();
        }
        
        public final void onInvalidated() {
            ViewPager.this.a();
        }
    }
    
    public static class i implements f
    {
        @Override
        public void a(final int n) {
        }
        
        @Override
        public final void a(final int n, final float n2) {
        }
        
        @Override
        public final void b(final int n) {
        }
    }
    
    static final class j implements Comparator<View>
    {
    }
}
