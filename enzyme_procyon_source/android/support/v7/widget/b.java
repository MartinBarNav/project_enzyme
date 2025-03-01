// 
// Decompiled by Procyon v0.5.36
// 

package android.support.v7.widget;

import android.widget.AbsListView;
import android.os.SystemClock;
import android.view.ViewConfiguration;
import android.widget.ListView;
import android.support.v4.view.n;
import android.view.MotionEvent;
import android.support.v4.f.f;
import android.support.v4.view.ae;
import android.support.v7.internal.widget.k;
import android.support.v4.f.g;
import android.view.View$OnTouchListener;
import android.view.View$MeasureSpec;
import android.view.ViewGroup$LayoutParams;
import android.widget.LinearLayout$LayoutParams;
import android.widget.LinearLayout;
import android.widget.AbsListView$OnScrollListener;
import android.widget.AdapterView;
import android.view.ViewParent;
import android.view.ViewGroup;
import android.content.res.TypedArray;
import android.support.v4.d.c;
import android.support.v7.internal.widget.e;
import android.support.v7.b.a;
import android.util.AttributeSet;
import android.util.Log;
import android.widget.AdapterView$OnItemSelectedListener;
import android.graphics.drawable.Drawable;
import android.database.DataSetObserver;
import android.widget.ListAdapter;
import android.content.Context;
import android.graphics.Rect;
import android.widget.AdapterView$OnItemClickListener;
import android.view.View;
import android.widget.PopupWindow;
import android.os.Handler;
import java.lang.reflect.Method;

public class b
{
    private static Method a;
    private Runnable A;
    private Handler B;
    private boolean C;
    private int D;
    public PopupWindow b;
    public a c;
    public int d;
    public int e;
    int f;
    protected int g;
    public View h;
    public AdapterView$OnItemClickListener i;
    public Rect j;
    private Context k;
    private ListAdapter l;
    private int m;
    private int n;
    private int o;
    private boolean p;
    private boolean q;
    private boolean r;
    private View s;
    private DataSetObserver t;
    private Drawable u;
    private AdapterView$OnItemSelectedListener v;
    private final g w;
    private final f x;
    private final e y;
    private final c z;
    
    static {
        try {
            b.a = PopupWindow.class.getDeclaredMethod("setClipToScreenEnabled", Boolean.TYPE);
        }
        catch (NoSuchMethodException ex) {
            Log.i("ListPopupWindow", "Could not find method setClipToScreenEnabled() on PopupWindow. Oh well.");
        }
    }
    
    public b(final Context context, final int n) {
        this(context, null, n, 0);
    }
    
    public b(final Context k, final AttributeSet set, final int n, final int n2) {
        this.m = -2;
        this.d = -2;
        this.e = 0;
        this.q = false;
        this.r = false;
        this.f = Integer.MAX_VALUE;
        this.g = 0;
        this.w = new g((byte)0);
        this.x = new f((byte)0);
        this.y = new e((byte)0);
        this.z = new c((byte)0);
        this.B = new Handler();
        this.j = new Rect();
        this.k = k;
        final TypedArray obtainStyledAttributes = k.obtainStyledAttributes((AttributeSet)null, android.support.v7.b.a.i.ListPopupWindow, n, n2);
        this.n = obtainStyledAttributes.getDimensionPixelOffset(android.support.v7.b.a.i.ListPopupWindow_android_dropDownHorizontalOffset, 0);
        this.o = obtainStyledAttributes.getDimensionPixelOffset(android.support.v7.b.a.i.ListPopupWindow_android_dropDownVerticalOffset, 0);
        if (this.o != 0) {
            this.p = true;
        }
        obtainStyledAttributes.recycle();
        (this.b = new android.support.v7.internal.widget.e(k, null, n)).setInputMethodMode(1);
        this.D = android.support.v4.d.c.a(this.k.getResources().getConfiguration().locale);
    }
    
    public final void a() {
        this.b.dismiss();
        if (this.s != null) {
            final ViewParent parent = this.s.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup)parent).removeView(this.s);
            }
        }
        this.b.setContentView((View)null);
        this.c = null;
        this.B.removeCallbacks((Runnable)this.w);
    }
    
    public void a(final ListAdapter l) {
        if (this.t == null) {
            this.t = new d((byte)0);
        }
        else if (this.l != null) {
            this.l.unregisterDataSetObserver(this.t);
        }
        this.l = l;
        if (this.l != null) {
            l.registerDataSetObserver(this.t);
        }
        if (this.c != null) {
            this.c.setAdapter(this.l);
        }
    }
    
    public final boolean b() {
        return this.b.isShowing();
    }
    
    public final void c() {
        final boolean b = true;
        final boolean b2 = true;
        final int n = -1;
        int n2;
        if (this.c == null) {
            final Context k = this.k;
            this.A = new Runnable() {
                @Override
                public final void run() {
                    final View h = android.support.v7.widget.b.this.h;
                    if (h != null && h.getWindowToken() != null) {
                        android.support.v7.widget.b.this.c();
                    }
                }
            };
            this.c = new a(k, !this.C);
            if (this.u != null) {
                this.c.setSelector(this.u);
            }
            this.c.setAdapter(this.l);
            this.c.setOnItemClickListener(this.i);
            this.c.setFocusable(true);
            this.c.setFocusableInTouchMode(true);
            this.c.setOnItemSelectedListener((AdapterView$OnItemSelectedListener)new AdapterView$OnItemSelectedListener() {
                public final void onItemSelected(final AdapterView<?> adapterView, final View view, final int n, final long n2) {
                    if (n != -1) {
                        final a a = android.support.v7.widget.b.this.c;
                        if (a != null) {
                            a.g = false;
                        }
                    }
                }
                
                public final void onNothingSelected(final AdapterView<?> adapterView) {
                }
            });
            this.c.setOnScrollListener((AbsListView$OnScrollListener)this.y);
            if (this.v != null) {
                this.c.setOnItemSelectedListener(this.v);
            }
            Object c = this.c;
            final View s = this.s;
            if (s != null) {
                final LinearLayout linearLayout = new LinearLayout(k);
                linearLayout.setOrientation(1);
                final LinearLayout$LayoutParams linearLayout$LayoutParams = new LinearLayout$LayoutParams(-1, 0, 1.0f);
                switch (this.g) {
                    default: {
                        Log.e("ListPopupWindow", "Invalid hint position " + this.g);
                        break;
                    }
                    case 1: {
                        linearLayout.addView((View)c, (ViewGroup$LayoutParams)linearLayout$LayoutParams);
                        linearLayout.addView(s);
                        break;
                    }
                    case 0: {
                        linearLayout.addView(s);
                        linearLayout.addView((View)c, (ViewGroup$LayoutParams)linearLayout$LayoutParams);
                        break;
                    }
                }
                s.measure(View$MeasureSpec.makeMeasureSpec(this.d, Integer.MIN_VALUE), 0);
                final LinearLayout$LayoutParams linearLayout$LayoutParams2 = (LinearLayout$LayoutParams)s.getLayoutParams();
                n2 = linearLayout$LayoutParams2.bottomMargin + (s.getMeasuredHeight() + linearLayout$LayoutParams2.topMargin);
                c = linearLayout;
            }
            else {
                n2 = 0;
            }
            this.b.setContentView((View)c);
        }
        else {
            this.b.getContentView();
            final View s2 = this.s;
            if (s2 != null) {
                final LinearLayout$LayoutParams linearLayout$LayoutParams3 = (LinearLayout$LayoutParams)s2.getLayoutParams();
                n2 = linearLayout$LayoutParams3.bottomMargin + (s2.getMeasuredHeight() + linearLayout$LayoutParams3.topMargin);
            }
            else {
                n2 = 0;
            }
        }
        final Drawable background = this.b.getBackground();
        int n4;
        if (background != null) {
            background.getPadding(this.j);
            final int n3 = n4 = this.j.top + this.j.bottom;
            if (!this.p) {
                this.o = -this.j.top;
                n4 = n3;
            }
        }
        else {
            this.j.setEmpty();
            n4 = 0;
        }
        this.b.getInputMethodMode();
        final int maxAvailableHeight = this.b.getMaxAvailableHeight(this.h, this.o);
        int m;
        if (this.q || this.m == -1) {
            m = maxAvailableHeight + n4;
        }
        else {
            int n5 = 0;
            switch (this.d) {
                default: {
                    n5 = View$MeasureSpec.makeMeasureSpec(this.d, 1073741824);
                    break;
                }
                case -2: {
                    n5 = View$MeasureSpec.makeMeasureSpec(this.k.getResources().getDisplayMetrics().widthPixels - (this.j.left + this.j.right), Integer.MIN_VALUE);
                    break;
                }
                case -1: {
                    n5 = View$MeasureSpec.makeMeasureSpec(this.k.getResources().getDisplayMetrics().widthPixels - (this.j.left + this.j.right), 1073741824);
                    break;
                }
            }
            final int a = this.c.a(n5, maxAvailableHeight - n2);
            int n6 = n2;
            if (a > 0) {
                n6 = n2 + n4;
            }
            m = n6 + a;
        }
        final boolean f = this.f();
        if (this.b.isShowing()) {
            int n7;
            if (this.d == -1) {
                n7 = -1;
            }
            else if (this.d == -2) {
                n7 = this.h.getWidth();
            }
            else {
                n7 = this.d;
            }
            if (this.m == -1) {
                if (!f) {
                    m = -1;
                }
                if (f) {
                    final PopupWindow b3 = this.b;
                    int n8;
                    if (this.d == -1) {
                        n8 = n;
                    }
                    else {
                        n8 = 0;
                    }
                    b3.setWindowLayoutMode(n8, 0);
                }
                else {
                    final PopupWindow b4 = this.b;
                    int n9;
                    if (this.d == -1) {
                        n9 = -1;
                    }
                    else {
                        n9 = 0;
                    }
                    b4.setWindowLayoutMode(n9, -1);
                }
            }
            else if (this.m != -2) {
                m = this.m;
            }
            this.b.setOutsideTouchable(!this.r && !this.q && b2);
            this.b.update(this.h, this.n, this.o, n7, m);
        }
        else {
        Label_0998:
            while (true) {
            Label_1159_Outer:
                while (true) {
                    int n10 = 0;
                    int n11 = 0;
                    Label_0959: {
                        while (true) {
                            Label_0948: {
                                if (this.d == -1) {
                                    n10 = -1;
                                    break Label_0948;
                                }
                                Label_1113: {
                                    break Label_1113;
                                    while (true) {
                                        while (true) {
                                            Label_1214: {
                                                try {
                                                    android.support.v7.widget.b.a.invoke(this.b, true);
                                                    final PopupWindow b5 = this.b;
                                                    if (this.r || this.q) {
                                                        break Label_1214;
                                                    }
                                                    final boolean outsideTouchable = b;
                                                    b5.setOutsideTouchable(outsideTouchable);
                                                    this.b.setTouchInterceptor((View$OnTouchListener)this.x);
                                                    android.support.v4.f.g.a(this.b, this.h, this.n, this.o, this.e);
                                                    this.c.setSelection(-1);
                                                    if (!this.C || this.c.isInTouchMode()) {
                                                        this.e();
                                                    }
                                                    if (!this.C) {
                                                        this.B.post((Runnable)this.z);
                                                        return;
                                                    }
                                                    return;
                                                    // iftrue(Label_1142:, this.d != -2)
                                                    while (true) {
                                                        Block_29: {
                                                            break Block_29;
                                                            Label_1183: {
                                                                this.b.setHeight(this.m);
                                                            }
                                                            n11 = 0;
                                                            break Label_0959;
                                                            Label_1142:
                                                            this.b.setWidth(this.d);
                                                            n10 = 0;
                                                            break;
                                                            this.b.setHeight(m);
                                                            n11 = 0;
                                                            break Label_0959;
                                                        }
                                                        this.b.setWidth(this.h.getWidth());
                                                        n10 = 0;
                                                        break;
                                                        continue Label_1159_Outer;
                                                    }
                                                }
                                                // iftrue(Label_1183:, this.m != -2)
                                                catch (Exception ex) {
                                                    Log.i("ListPopupWindow", "Could not call setClipToScreenEnabled() on PopupWindow. Oh well.");
                                                    continue Label_0998;
                                                }
                                            }
                                            final boolean outsideTouchable = false;
                                            continue Label_1159_Outer;
                                        }
                                    }
                                }
                            }
                            if (this.m != -1) {
                                continue;
                            }
                            break;
                        }
                        n11 = -1;
                    }
                    this.b.setWindowLayoutMode(n10, n11);
                    if (android.support.v7.widget.b.a != null) {
                        continue;
                    }
                    break;
                }
                continue Label_0998;
            }
        }
    }
    
    public final void d() {
        this.C = true;
        this.b.setFocusable(true);
    }
    
    public final void e() {
        final a c = this.c;
        if (c != null) {
            c.g = true;
            c.requestLayout();
        }
    }
    
    public final boolean f() {
        return this.b.getInputMethodMode() == 2;
    }
    
    private static final class a extends k
    {
        private boolean g;
        private boolean h;
        private boolean i;
        private ae j;
        private android.support.v4.f.f k;
        
        public a(final Context context, final boolean h) {
            super(context, android.support.v7.b.a.a.dropDownListViewStyle);
            this.h = h;
            this.setCacheColorHint(0);
        }
        
        protected final boolean a() {
            return this.i || super.a();
        }
        
        public final boolean a(final MotionEvent motionEvent, int n) {
            boolean b = true;
            final int a = n.a(motionEvent);
            Label_0040: {
                Label_0036: {
                    switch (a) {
                        case 3: {
                            b = false;
                            n = 0;
                            break Label_0040;
                        }
                        case 1: {
                            b = false;
                        }
                        case 2: {
                            final int pointerIndex = motionEvent.findPointerIndex(n);
                            if (pointerIndex < 0) {
                                b = false;
                                n = 0;
                                break Label_0040;
                            }
                            n = (int)motionEvent.getX(pointerIndex);
                            final int n2 = (int)motionEvent.getY(pointerIndex);
                            final int pointToPosition = this.pointToPosition(n, n2);
                            if (pointToPosition == -1) {
                                n = 1;
                                break Label_0040;
                            }
                            final View child = this.getChildAt(pointToPosition - this.getFirstVisiblePosition());
                            final float n3 = (float)n;
                            final float n4 = (float)n2;
                            this.setPressed(this.i = true);
                            this.layoutChildren();
                            this.setSelection(pointToPosition);
                            Drawable drawable = this.getSelector();
                            while (true) {
                                Label_0251: {
                                    if (drawable != null && pointToPosition != -1) {
                                        n = 1;
                                        break Label_0251;
                                    }
                                    Label_0513: {
                                        break Label_0513;
                                    Label_0437_Outer:
                                        while (true) {
                                            final Rect a2 = super.a;
                                            a2.set(child.getLeft(), child.getTop(), child.getRight(), child.getBottom());
                                            a2.left -= super.b;
                                            a2.top -= super.c;
                                            a2.right += super.d;
                                            a2.bottom += super.e;
                                            while (true) {
                                            Label_0533:
                                                while (true) {
                                                    try {
                                                        final boolean boolean1 = super.f.getBoolean(this);
                                                        if (child.isEnabled() != boolean1) {
                                                            super.f.set(this, !boolean1);
                                                            if (pointToPosition != -1) {
                                                                this.refreshDrawableState();
                                                            }
                                                        }
                                                        if (n != 0) {
                                                            final Rect a3 = super.a;
                                                            final float exactCenterX = a3.exactCenterX();
                                                            final float exactCenterY = a3.exactCenterY();
                                                            if (this.getVisibility() != 0) {
                                                                break Label_0533;
                                                            }
                                                            final boolean b2 = true;
                                                            drawable.setVisible(b2, false);
                                                            android.support.v4.a.a.a.a(drawable, exactCenterX, exactCenterY);
                                                        }
                                                        drawable = this.getSelector();
                                                        if (drawable != null && pointToPosition != -1) {
                                                            android.support.v4.a.a.a.a(drawable, n3, n4);
                                                        }
                                                        this.setSelectorEnabled(false);
                                                        this.refreshDrawableState();
                                                        if (a == 1) {
                                                            this.performItemClick(child, pointToPosition, this.getItemIdAtPosition(pointToPosition));
                                                            break Label_0036;
                                                        }
                                                        break Label_0036;
                                                        n = 0;
                                                        break;
                                                    }
                                                    catch (IllegalAccessException ex) {
                                                        ex.printStackTrace();
                                                        continue Label_0437_Outer;
                                                    }
                                                    break;
                                                }
                                                final boolean b2 = false;
                                                continue;
                                            }
                                        }
                                    }
                                }
                                if (n != 0) {
                                    drawable.setVisible(false, false);
                                }
                                continue;
                            }
                        }
                    }
                }
                b = true;
                n = 0;
            }
            if (!b || n != 0) {
                this.setPressed(this.i = false);
                this.drawableStateChanged();
                if (this.j != null) {
                    this.j.a();
                    this.j = null;
                }
            }
            if (b) {
                if (this.k == null) {
                    this.k = new android.support.v4.f.f(this);
                }
                this.k.a(true);
                this.k.onTouch((View)this, motionEvent);
            }
            else if (this.k != null) {
                this.k.a(false);
            }
            return b;
        }
        
        public final boolean hasFocus() {
            return this.h || super.hasFocus();
        }
        
        public final boolean hasWindowFocus() {
            return this.h || super.hasWindowFocus();
        }
        
        public final boolean isFocused() {
            return this.h || super.isFocused();
        }
        
        public final boolean isInTouchMode() {
            return (this.h && this.g) || super.isInTouchMode();
        }
    }
    
    public abstract static class b implements View$OnTouchListener
    {
        private final float a;
        private final int b;
        private final int c;
        private final View d;
        private Runnable e;
        private Runnable f;
        private boolean g;
        private boolean h;
        private int i;
        private final int[] j;
        
        public b(final View d) {
            this.j = new int[2];
            this.d = d;
            this.a = (float)ViewConfiguration.get(d.getContext()).getScaledTouchSlop();
            this.b = ViewConfiguration.getTapTimeout();
            this.c = (this.b + ViewConfiguration.getLongPressTimeout()) / 2;
        }
        
        private boolean a(final MotionEvent motionEvent) {
            boolean b = true;
            final View d = this.d;
            final b a = this.a();
            if (a == null || !a.b.isShowing()) {
                b = false;
            }
            else {
                final android.support.v7.widget.b.a a2 = a.c;
                if (a2 == null || !a2.isShown()) {
                    b = false;
                }
                else {
                    final MotionEvent obtainNoHistory = MotionEvent.obtainNoHistory(motionEvent);
                    final int[] j = this.j;
                    d.getLocationOnScreen(j);
                    obtainNoHistory.offsetLocation((float)j[0], (float)j[1]);
                    final int[] i = this.j;
                    ((View)a2).getLocationOnScreen(i);
                    obtainNoHistory.offsetLocation((float)(-i[0]), (float)(-i[1]));
                    final boolean a3 = a2.a(obtainNoHistory, this.i);
                    obtainNoHistory.recycle();
                    final int a4 = android.support.v4.view.n.a(motionEvent);
                    boolean b2;
                    if (a4 != 1 && a4 != 3) {
                        b2 = true;
                    }
                    else {
                        b2 = false;
                    }
                    if (!a3 || !b2) {
                        b = false;
                    }
                }
            }
            return b;
        }
        
        static /* synthetic */ void b(final b b) {
            b.d();
            if (b.d.isEnabled() && b.b()) {
                b.d.getParent().requestDisallowInterceptTouchEvent(true);
                final long uptimeMillis = SystemClock.uptimeMillis();
                final MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                b.d.onTouchEvent(obtain);
                obtain.recycle();
                b.g = true;
                b.h = true;
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
        
        public abstract b a();
        
        public boolean b() {
            final b a = this.a();
            if (a != null && !a.b.isShowing()) {
                a.c();
            }
            return true;
        }
        
        public boolean c() {
            final b a = this.a();
            if (a != null && a.b.isShowing()) {
                a.a();
            }
            return true;
        }
        
        public boolean onTouch(View d, final MotionEvent motionEvent) {
            final boolean b = false;
            final boolean g = this.g;
            boolean a;
            if (g) {
                if (this.h) {
                    a = this.a(motionEvent);
                }
                else {
                    a = (this.a(motionEvent) || !this.c());
                }
            }
            else {
                d = this.d;
                boolean b2 = false;
                Label_0127: {
                    if (d.isEnabled()) {
                        switch (android.support.v4.view.n.a(motionEvent)) {
                            case 0: {
                                this.i = motionEvent.getPointerId(0);
                                this.h = false;
                                if (this.e == null) {
                                    this.e = new a((byte)0);
                                }
                                d.postDelayed(this.e, (long)this.b);
                                if (this.f == null) {
                                    this.f = new b((byte)0);
                                }
                                d.postDelayed(this.f, (long)this.c);
                                break;
                            }
                            case 2: {
                                final int pointerIndex = motionEvent.findPointerIndex(this.i);
                                if (pointerIndex < 0) {
                                    break;
                                }
                                final float x = motionEvent.getX(pointerIndex);
                                final float y = motionEvent.getY(pointerIndex);
                                final float a2 = this.a;
                                int n;
                                if (x >= -a2 && y >= -a2 && x < d.getRight() - d.getLeft() + a2 && y < d.getBottom() - d.getTop() + a2) {
                                    n = 1;
                                }
                                else {
                                    n = 0;
                                }
                                if (n == 0) {
                                    this.d();
                                    d.getParent().requestDisallowInterceptTouchEvent(true);
                                    b2 = true;
                                    break Label_0127;
                                }
                                break;
                            }
                            case 1:
                            case 3: {
                                this.d();
                                break;
                            }
                        }
                    }
                    b2 = false;
                }
                a = (b2 && this.b());
                if (a) {
                    final long uptimeMillis = SystemClock.uptimeMillis();
                    final MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                    this.d.onTouchEvent(obtain);
                    obtain.recycle();
                }
            }
            if (!(this.g = a)) {
                final boolean b3 = b;
                if (!g) {
                    return b3;
                }
            }
            return true;
        }
        
        private final class a implements Runnable
        {
            @Override
            public final void run() {
                android.support.v7.widget.b.b.this.d.getParent().requestDisallowInterceptTouchEvent(true);
            }
        }
        
        private final class b implements Runnable
        {
            @Override
            public final void run() {
                android.support.v7.widget.b.b.b(android.support.v7.widget.b.b.this);
            }
        }
    }
    
    private final class c implements Runnable
    {
        @Override
        public final void run() {
            android.support.v7.widget.b.this.e();
        }
    }
    
    private final class d extends DataSetObserver
    {
        public final void onChanged() {
            if (android.support.v7.widget.b.this.b.isShowing()) {
                android.support.v7.widget.b.this.c();
            }
        }
        
        public final void onInvalidated() {
            android.support.v7.widget.b.this.a();
        }
    }
    
    private final class e implements AbsListView$OnScrollListener
    {
        public final void onScroll(final AbsListView absListView, final int n, final int n2, final int n3) {
        }
        
        public final void onScrollStateChanged(final AbsListView absListView, final int n) {
            if (n == 1 && !android.support.v7.widget.b.this.f() && android.support.v7.widget.b.this.b.getContentView() != null) {
                android.support.v7.widget.b.this.B.removeCallbacks((Runnable)android.support.v7.widget.b.this.w);
                android.support.v7.widget.b.this.w.run();
            }
        }
    }
    
    private final class f implements View$OnTouchListener
    {
        public final boolean onTouch(final View view, final MotionEvent motionEvent) {
            final int action = motionEvent.getAction();
            final int n = (int)motionEvent.getX();
            final int n2 = (int)motionEvent.getY();
            if (action == 0 && android.support.v7.widget.b.this.b != null && android.support.v7.widget.b.this.b.isShowing() && n >= 0 && n < android.support.v7.widget.b.this.b.getWidth() && n2 >= 0 && n2 < android.support.v7.widget.b.this.b.getHeight()) {
                android.support.v7.widget.b.this.B.postDelayed((Runnable)android.support.v7.widget.b.this.w, 250L);
            }
            else if (action == 1) {
                android.support.v7.widget.b.this.B.removeCallbacks((Runnable)android.support.v7.widget.b.this.w);
            }
            return false;
        }
    }
    
    private final class g implements Runnable
    {
        @Override
        public final void run() {
            if (android.support.v7.widget.b.this.c != null && android.support.v7.widget.b.this.c.getCount() > android.support.v7.widget.b.this.c.getChildCount() && android.support.v7.widget.b.this.c.getChildCount() <= android.support.v7.widget.b.this.f) {
                android.support.v7.widget.b.this.b.setInputMethodMode(2);
                android.support.v7.widget.b.this.c();
            }
        }
    }
}
