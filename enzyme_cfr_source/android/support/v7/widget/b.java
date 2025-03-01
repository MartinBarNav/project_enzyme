/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.database.DataSetObserver
 *  android.graphics.Rect
 *  android.graphics.drawable.Drawable
 *  android.os.Handler
 *  android.os.SystemClock
 *  android.util.AttributeSet
 *  android.util.Log
 *  android.view.MotionEvent
 *  android.view.View
 *  android.view.View$MeasureSpec
 *  android.view.View$OnTouchListener
 *  android.view.ViewConfiguration
 *  android.view.ViewGroup
 *  android.view.ViewGroup$LayoutParams
 *  android.view.ViewParent
 *  android.widget.AbsListView
 *  android.widget.AbsListView$OnScrollListener
 *  android.widget.AdapterView
 *  android.widget.AdapterView$OnItemClickListener
 *  android.widget.AdapterView$OnItemSelectedListener
 *  android.widget.LinearLayout
 *  android.widget.LinearLayout$LayoutParams
 *  android.widget.ListAdapter
 *  android.widget.PopupWindow
 */
package android.support.v7.widget;

import android.content.Context;
import android.database.DataSetObserver;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.SystemClock;
import android.support.v4.view.ae;
import android.support.v4.view.n;
import android.support.v7.b.a;
import android.support.v7.internal.widget.k;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class b {
    private static Method a;
    private Runnable A;
    private Handler B;
    private boolean C;
    private int D;
    public PopupWindow b;
    public a c;
    public int d = -2;
    public int e = 0;
    int f = Integer.MAX_VALUE;
    protected int g = 0;
    public View h;
    public AdapterView.OnItemClickListener i;
    public Rect j;
    private Context k;
    private ListAdapter l;
    private int m = -2;
    private int n;
    private int o;
    private boolean p;
    private boolean q = false;
    private boolean r = false;
    private View s;
    private DataSetObserver t;
    private Drawable u;
    private AdapterView.OnItemSelectedListener v;
    private final g w = new g(0);
    private final f x = new f(0);
    private final e y = new e(0);
    private final c z = new c(0);

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    static {
        try {
            a = PopupWindow.class.getDeclaredMethod("setClipToScreenEnabled", Boolean.TYPE);
            return;
        }
        catch (NoSuchMethodException noSuchMethodException) {
            Log.i((String)"ListPopupWindow", (String)"Could not find method setClipToScreenEnabled() on PopupWindow. Oh well.");
            return;
        }
    }

    public b(Context context, int n2) {
        this(context, null, n2, 0);
    }

    public b(Context context, AttributeSet attributeSet, int n2, int n3) {
        this.B = new Handler();
        this.j = new Rect();
        this.k = context;
        attributeSet = context.obtainStyledAttributes(null, a.i.ListPopupWindow, n2, n3);
        this.n = attributeSet.getDimensionPixelOffset(a.i.ListPopupWindow_android_dropDownHorizontalOffset, 0);
        this.o = attributeSet.getDimensionPixelOffset(a.i.ListPopupWindow_android_dropDownVerticalOffset, 0);
        if (this.o != 0) {
            this.p = true;
        }
        attributeSet.recycle();
        this.b = new android.support.v7.internal.widget.e(context, null, n2);
        this.b.setInputMethodMode(1);
        this.D = android.support.v4.d.c.a(this.k.getResources().getConfiguration().locale);
    }

    public final void a() {
        ViewParent viewParent;
        this.b.dismiss();
        if (this.s != null && (viewParent = this.s.getParent()) instanceof ViewGroup) {
            ((ViewGroup)viewParent).removeView(this.s);
        }
        this.b.setContentView(null);
        this.c = null;
        this.B.removeCallbacks((Runnable)this.w);
    }

    /*
     * Enabled aggressive block sorting
     */
    public void a(ListAdapter listAdapter) {
        if (this.t == null) {
            this.t = new d(0);
        } else if (this.l != null) {
            this.l.unregisterDataSetObserver(this.t);
        }
        this.l = listAdapter;
        if (this.l != null) {
            listAdapter.registerDataSetObserver(this.t);
        }
        if (this.c != null) {
            this.c.setAdapter(this.l);
        }
    }

    public final boolean b() {
        return this.b.isShowing();
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void c() {
        int n2;
        Drawable drawable;
        int n3;
        int n4;
        boolean bl;
        int n5;
        boolean bl2;
        boolean bl3;
        block40: {
            void var6_10;
            block39: {
                block38: {
                    block37: {
                        bl3 = true;
                        bl2 = true;
                        n5 = -1;
                        if (this.c != null) break block37;
                        Context context = this.k;
                        this.A = new Runnable(){

                            @Override
                            public final void run() {
                                View view = b.this.h;
                                if (view != null && view.getWindowToken() != null) {
                                    b.this.c();
                                }
                            }
                        };
                        bl = !this.C;
                        this.c = new a(context, bl);
                        if (this.u != null) {
                            this.c.setSelector(this.u);
                        }
                        this.c.setAdapter(this.l);
                        this.c.setOnItemClickListener(this.i);
                        this.c.setFocusable(true);
                        this.c.setFocusableInTouchMode(true);
                        this.c.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener(){

                            public final void onItemSelected(AdapterView<?> object, View view, int n2, long l2) {
                                if (n2 != -1 && (object = b.this.c) != null) {
                                    android.support.v7.widget.b$a.a(object, false);
                                }
                            }

                            public final void onNothingSelected(AdapterView<?> adapterView) {
                            }
                        });
                        this.c.setOnScrollListener(this.y);
                        if (this.v != null) {
                            this.c.setOnItemSelectedListener(this.v);
                        }
                        a a2 = this.c;
                        View view = this.s;
                        if (view == null) break block38;
                        context = new LinearLayout(context);
                        context.setOrientation(1);
                        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, 0, 1.0f);
                        switch (this.g) {
                            default: {
                                Log.e((String)"ListPopupWindow", (String)("Invalid hint position " + this.g));
                                break;
                            }
                            case 1: {
                                context.addView((View)a2, (ViewGroup.LayoutParams)layoutParams);
                                context.addView(view);
                                break;
                            }
                            case 0: {
                                context.addView(view);
                                context.addView((View)a2, (ViewGroup.LayoutParams)layoutParams);
                                break;
                            }
                        }
                        view.measure(View.MeasureSpec.makeMeasureSpec((int)this.d, (int)Integer.MIN_VALUE), 0);
                        LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams)view.getLayoutParams();
                        n4 = view.getMeasuredHeight();
                        n3 = layoutParams2.topMargin;
                        n4 = layoutParams2.bottomMargin + (n4 + n3);
                        Context context2 = context;
                        break block39;
                    }
                    this.b.getContentView();
                    View view = this.s;
                    if (view != null) {
                        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams)view.getLayoutParams();
                        n3 = view.getMeasuredHeight();
                        n4 = layoutParams.topMargin;
                        n4 = layoutParams.bottomMargin + (n3 + n4);
                    } else {
                        n4 = 0;
                    }
                    break block40;
                }
                n4 = 0;
            }
            this.b.setContentView((View)var6_10);
        }
        if ((drawable = this.b.getBackground()) != null) {
            drawable.getPadding(this.j);
            n2 = n3 = this.j.top + this.j.bottom;
            if (!this.p) {
                this.o = -this.j.top;
                n2 = n3;
            }
        } else {
            this.j.setEmpty();
            n2 = 0;
        }
        this.b.getInputMethodMode();
        int n6 = this.b.getMaxAvailableHeight(this.h, this.o);
        if (this.q || this.m == -1) {
            n4 = n6 + n2;
        } else {
            switch (this.d) {
                default: {
                    n3 = View.MeasureSpec.makeMeasureSpec((int)this.d, (int)0x40000000);
                    break;
                }
                case -2: {
                    n3 = View.MeasureSpec.makeMeasureSpec((int)(this.k.getResources().getDisplayMetrics().widthPixels - (this.j.left + this.j.right)), (int)Integer.MIN_VALUE);
                    break;
                }
                case -1: {
                    n3 = View.MeasureSpec.makeMeasureSpec((int)(this.k.getResources().getDisplayMetrics().widthPixels - (this.j.left + this.j.right)), (int)0x40000000);
                }
            }
            n6 = this.c.a(n3, n6 - n4);
            n3 = n4;
            if (n6 > 0) {
                n3 = n4 + n2;
            }
            n4 = n3 + n6;
        }
        bl = this.f();
        if (this.b.isShowing()) {
            n3 = this.d == -1 ? -1 : (this.d == -2 ? this.h.getWidth() : this.d);
            if (this.m == -1) {
                if (!bl) {
                    n4 = -1;
                }
                if (bl) {
                    PopupWindow popupWindow = this.b;
                    n2 = this.d == -1 ? n5 : 0;
                    popupWindow.setWindowLayoutMode(n2, 0);
                } else {
                    PopupWindow popupWindow = this.b;
                    n2 = this.d == -1 ? -1 : 0;
                    popupWindow.setWindowLayoutMode(n2, -1);
                }
            } else if (this.m != -2) {
                n4 = this.m;
            }
            PopupWindow popupWindow = this.b;
            bl = !this.r && !this.q ? bl2 : false;
            popupWindow.setOutsideTouchable(bl);
            this.b.update(this.h, this.n, this.o, n3, n4);
            return;
        }
        if (this.d == -1) {
            n3 = -1;
        } else if (this.d == -2) {
            this.b.setWidth(this.h.getWidth());
            n3 = 0;
        } else {
            this.b.setWidth(this.d);
            n3 = 0;
        }
        if (this.m == -1) {
            n4 = -1;
        } else if (this.m == -2) {
            this.b.setHeight(n4);
            n4 = 0;
        } else {
            this.b.setHeight(this.m);
            n4 = 0;
        }
        this.b.setWindowLayoutMode(n3, n4);
        if (a != null) {
            try {
                a.invoke((Object)this.b, true);
            }
            catch (Exception exception) {
                Log.i((String)"ListPopupWindow", (String)"Could not call setClipToScreenEnabled() on PopupWindow. Oh well.");
            }
        }
        PopupWindow popupWindow = this.b;
        bl = !this.r && !this.q ? bl3 : false;
        popupWindow.setOutsideTouchable(bl);
        this.b.setTouchInterceptor((View.OnTouchListener)this.x);
        android.support.v4.f.g.a(this.b, this.h, this.n, this.o, this.e);
        this.c.setSelection(-1);
        if (!this.C || this.c.isInTouchMode()) {
            this.e();
        }
        if (this.C) return;
        this.B.post((Runnable)this.z);
    }

    public final void d() {
        this.C = true;
        this.b.setFocusable(true);
    }

    public final void e() {
        a a2 = this.c;
        if (a2 != null) {
            android.support.v7.widget.b$a.a(a2, true);
            a2.requestLayout();
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final boolean f() {
        if (this.b.getInputMethodMode() != 2) return false;
        return true;
    }

    private static final class a
    extends k {
        private boolean g;
        private boolean h;
        private boolean i;
        private ae j;
        private android.support.v4.f.f k;

        public a(Context context, boolean bl) {
            super(context, a.a.dropDownListViewStyle);
            this.h = bl;
            this.setCacheColorHint(0);
        }

        static /* synthetic */ boolean a(a a2, boolean bl) {
            a2.g = bl;
            return bl;
        }

        /*
         * Enabled force condition propagation
         * Lifted jumps to return sites
         */
        @Override
        protected final boolean a() {
            if (this.i) return true;
            if (!super.a()) return false;
            return true;
        }

        /*
         * Enabled aggressive block sorting
         * Enabled unnecessary exception pruning
         * Enabled aggressive exception aggregation
         */
        public final boolean a(MotionEvent motionEvent, int n2) {
            boolean bl = true;
            int n3 = android.support.v4.view.n.a(motionEvent);
            switch (n3) {
                case 3: {
                    bl = false;
                    n2 = 0;
                    break;
                }
                case 1: {
                    bl = false;
                }
                case 2: {
                    int n4;
                    int n5 = motionEvent.findPointerIndex(n2);
                    if (n5 < 0) {
                        bl = false;
                        n2 = 0;
                        break;
                    }
                    n2 = (int)motionEvent.getX(n5);
                    if ((n5 = this.pointToPosition(n2, n4 = (int)motionEvent.getY(n5))) == -1) {
                        n2 = 1;
                        break;
                    }
                    View view = this.getChildAt(n5 - this.getFirstVisiblePosition());
                    float f2 = n2;
                    float f3 = n4;
                    this.i = true;
                    this.setPressed(true);
                    this.layoutChildren();
                    this.setSelection(n5);
                    Drawable drawable = this.getSelector();
                    n2 = drawable != null && n5 != -1 ? 1 : 0;
                    if (n2 != 0) {
                        drawable.setVisible(false, false);
                    }
                    Object object = this.a;
                    object.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
                    ((Rect)object).left -= this.b;
                    ((Rect)object).top -= this.c;
                    ((Rect)object).right += this.d;
                    ((Rect)object).bottom += this.e;
                    try {
                        bl = this.f.getBoolean((Object)this);
                        if (view.isEnabled() != bl) {
                            object = this.f;
                            bl = !bl;
                            ((Field)object).set((Object)this, bl);
                            if (n5 != -1) {
                                this.refreshDrawableState();
                            }
                        }
                    }
                    catch (IllegalAccessException illegalAccessException) {
                        illegalAccessException.printStackTrace();
                    }
                    if (n2 != 0) {
                        object = this.a;
                        float f4 = object.exactCenterX();
                        float f5 = object.exactCenterY();
                        bl = this.getVisibility() == 0;
                        drawable.setVisible(bl, false);
                        android.support.v4.a.a.a.a(drawable, f4, f5);
                    }
                    if ((drawable = this.getSelector()) != null && n5 != -1) {
                        android.support.v4.a.a.a.a(drawable, f2, f3);
                    }
                    this.setSelectorEnabled(false);
                    this.refreshDrawableState();
                    if (n3 == 1) {
                        this.performItemClick(view, n5, this.getItemIdAtPosition(n5));
                    }
                }
                default: {
                    bl = true;
                    n2 = 0;
                }
            }
            if (!bl || n2 != 0) {
                this.i = false;
                this.setPressed(false);
                this.drawableStateChanged();
                if (this.j != null) {
                    this.j.a();
                    this.j = null;
                }
            }
            if (bl) {
                if (this.k == null) {
                    this.k = new android.support.v4.f.f(this);
                }
                this.k.a(true);
                this.k.onTouch((View)this, motionEvent);
                return bl;
            }
            if (this.k == null) return bl;
            this.k.a(false);
            return bl;
        }

        /*
         * Enabled force condition propagation
         * Lifted jumps to return sites
         */
        public final boolean hasFocus() {
            if (this.h) return true;
            if (!super.hasFocus()) return false;
            return true;
        }

        /*
         * Enabled force condition propagation
         * Lifted jumps to return sites
         */
        public final boolean hasWindowFocus() {
            if (this.h) return true;
            if (!super.hasWindowFocus()) return false;
            return true;
        }

        /*
         * Enabled force condition propagation
         * Lifted jumps to return sites
         */
        public final boolean isFocused() {
            if (this.h) return true;
            if (!super.isFocused()) return false;
            return true;
        }

        /*
         * Enabled force condition propagation
         * Lifted jumps to return sites
         */
        public final boolean isInTouchMode() {
            if (this.h) {
                if (this.g) return true;
            }
            if (!super.isInTouchMode()) return false;
            return true;
        }
    }

    public static abstract class android.support.v7.widget.b$b
    implements View.OnTouchListener {
        private final float a;
        private final int b;
        private final int c;
        private final View d;
        private Runnable e;
        private Runnable f;
        private boolean g;
        private boolean h;
        private int i;
        private final int[] j = new int[2];

        public android.support.v7.widget.b$b(View view) {
            this.d = view;
            this.a = ViewConfiguration.get((Context)view.getContext()).getScaledTouchSlop();
            this.b = ViewConfiguration.getTapTimeout();
            this.c = (this.b + ViewConfiguration.getLongPressTimeout()) / 2;
        }

        /*
         * Enabled aggressive block sorting
         */
        private boolean a(MotionEvent motionEvent) {
            boolean bl = true;
            View view = this.d;
            android.support.v7.widget.b b2 = this.a();
            if (b2 == null) return false;
            if (!b2.b.isShowing()) {
                return false;
            }
            android.support.v7.widget.b$a a2 = b2.c;
            if (a2 == null) return false;
            if (!a2.isShown()) {
                return false;
            }
            b2 = MotionEvent.obtainNoHistory((MotionEvent)motionEvent);
            int[] arrn = this.j;
            view.getLocationOnScreen(arrn);
            b2.offsetLocation(arrn[0], arrn[1]);
            int[] arrn2 = this.j;
            a2.getLocationOnScreen(arrn2);
            b2.offsetLocation(-arrn2[0], -arrn2[1]);
            boolean bl2 = a2.a((MotionEvent)b2, this.i);
            b2.recycle();
            int n2 = android.support.v4.view.n.a(motionEvent);
            n2 = n2 != 1 && n2 != 3 ? 1 : 0;
            if (!bl2) return false;
            if (n2 != 0) return bl;
            return false;
        }

        static /* synthetic */ void b(android.support.v7.widget.b$b b2) {
            b2.d();
            if (b2.d.isEnabled() && b2.b()) {
                b2.d.getParent().requestDisallowInterceptTouchEvent(true);
                long l2 = SystemClock.uptimeMillis();
                MotionEvent motionEvent = MotionEvent.obtain((long)l2, (long)l2, (int)3, (float)0.0f, (float)0.0f, (int)0);
                b2.d.onTouchEvent(motionEvent);
                motionEvent.recycle();
                b2.g = true;
                b2.h = true;
            }
        }

        private void d() {
            if (this.f != null) {
                this.d.removeCallbacks(this.f);
            }
            if (this.e != null) {
                this.d.removeCallbacks(this.e);
            }
        }

        public abstract android.support.v7.widget.b a();

        public boolean b() {
            android.support.v7.widget.b b2 = this.a();
            if (b2 != null && !b2.b.isShowing()) {
                b2.c();
            }
            return true;
        }

        public boolean c() {
            android.support.v7.widget.b b2 = this.a();
            if (b2 != null && b2.b.isShowing()) {
                b2.a();
            }
            return true;
        }

        /*
         * Enabled aggressive block sorting
         */
        public boolean onTouch(View view, MotionEvent motionEvent) {
            boolean bl;
            boolean bl2;
            boolean bl3;
            block9: {
                int n2;
                block11: {
                    block10: {
                        block8: {
                            bl3 = false;
                            bl2 = this.g;
                            if (!bl2) break block8;
                            bl = this.h ? this.a(motionEvent) : this.a(motionEvent) || !this.c();
                            break block9;
                        }
                        view = this.d;
                        if (!view.isEnabled()) break block10;
                        switch (android.support.v4.view.n.a(motionEvent)) {
                            case 0: {
                                this.i = motionEvent.getPointerId(0);
                                this.h = false;
                                if (this.e == null) {
                                    this.e = new a(0);
                                }
                                view.postDelayed(this.e, (long)this.b);
                                if (this.f == null) {
                                    this.f = new b(0);
                                }
                                view.postDelayed(this.f, (long)this.c);
                                break;
                            }
                            case 2: {
                                n2 = motionEvent.findPointerIndex(this.i);
                                if (n2 < 0) break;
                                float f2 = motionEvent.getX(n2);
                                float f3 = motionEvent.getY(n2);
                                float f4 = this.a;
                                n2 = f2 >= -f4 && f3 >= -f4 && f2 < (float)(view.getRight() - view.getLeft()) + f4 && f3 < (float)(view.getBottom() - view.getTop()) + f4 ? 1 : 0;
                                if (n2 != 0) break;
                                this.d();
                                view.getParent().requestDisallowInterceptTouchEvent(true);
                                n2 = 1;
                                break block11;
                            }
                            case 1: 
                            case 3: {
                                this.d();
                            }
                        }
                    }
                    n2 = 0;
                }
                if (bl = n2 != 0 && this.b()) {
                    long l2 = SystemClock.uptimeMillis();
                    view = MotionEvent.obtain((long)l2, (long)l2, (int)3, (float)0.0f, (float)0.0f, (int)0);
                    this.d.onTouchEvent((MotionEvent)view);
                    view.recycle();
                }
            }
            this.g = bl;
            if (bl) return true;
            bl = bl3;
            if (!bl2) return bl;
            return true;
        }

        private final class a
        implements Runnable {
            private a() {
            }

            /* synthetic */ a(byte by) {
                this();
            }

            @Override
            public final void run() {
                b.this.d.getParent().requestDisallowInterceptTouchEvent(true);
            }
        }

        private final class b
        implements Runnable {
            private b() {
            }

            /* synthetic */ b(byte by) {
                this();
            }

            @Override
            public final void run() {
                android.support.v7.widget.b$b.b(b.this);
            }
        }
    }

    private final class c
    implements Runnable {
        private c() {
        }

        /* synthetic */ c(byte by) {
            this();
        }

        @Override
        public final void run() {
            b.this.e();
        }
    }

    private final class d
    extends DataSetObserver {
        private d() {
        }

        /* synthetic */ d(byte by) {
            this();
        }

        public final void onChanged() {
            if (b.this.b.isShowing()) {
                b.this.c();
            }
        }

        public final void onInvalidated() {
            b.this.a();
        }
    }

    private final class e
    implements AbsListView.OnScrollListener {
        private e() {
        }

        /* synthetic */ e(byte by) {
            this();
        }

        public final void onScroll(AbsListView absListView, int n2, int n3, int n4) {
        }

        public final void onScrollStateChanged(AbsListView absListView, int n2) {
            if (n2 == 1 && !b.this.f() && b.this.b.getContentView() != null) {
                b.this.B.removeCallbacks((Runnable)b.this.w);
                b.this.w.run();
            }
        }
    }

    private final class f
    implements View.OnTouchListener {
        private f() {
        }

        /* synthetic */ f(byte by) {
            this();
        }

        /*
         * Enabled aggressive block sorting
         */
        public final boolean onTouch(View view, MotionEvent motionEvent) {
            int n2 = motionEvent.getAction();
            int n3 = (int)motionEvent.getX();
            int n4 = (int)motionEvent.getY();
            if (n2 == 0 && b.this.b != null && b.this.b.isShowing() && n3 >= 0 && n3 < b.this.b.getWidth() && n4 >= 0 && n4 < b.this.b.getHeight()) {
                b.this.B.postDelayed((Runnable)b.this.w, 250L);
                return false;
            }
            if (n2 != 1) return false;
            b.this.B.removeCallbacks((Runnable)b.this.w);
            return false;
        }
    }

    private final class g
    implements Runnable {
        private g() {
        }

        /* synthetic */ g(byte by) {
            this();
        }

        @Override
        public final void run() {
            if (b.this.c != null && b.this.c.getCount() > b.this.c.getChildCount() && b.this.c.getChildCount() <= b.this.f) {
                b.this.b.setInputMethodMode(2);
                b.this.c();
            }
        }
    }
}

