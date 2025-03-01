// 
// Decompiled by Procyon v0.5.36
// 

package android.support.v7.widget;

import android.support.v7.internal.view.menu.m;
import android.os.Parcel;
import android.os.Parcelable$Creator;
import android.view.View$BaseSavedState;
import android.text.TextUtils$TruncateAt;
import android.support.v4.view.n;
import android.view.MotionEvent;
import android.view.MenuItem;
import android.support.v4.view.k;
import android.os.Parcelable;
import android.support.v7.internal.widget.s;
import android.support.v7.internal.widget.h;
import android.view.Menu;
import android.os.Build$VERSION;
import android.support.v7.internal.view.b;
import android.view.MenuInflater;
import android.support.v4.view.i;
import android.support.v7.internal.view.menu.f;
import android.view.View$OnClickListener;
import java.util.List;
import android.view.View$MeasureSpec;
import android.view.ViewGroup$LayoutParams;
import android.view.ViewGroup$MarginLayoutParams;
import android.support.v4.view.u;
import android.content.res.TypedArray;
import android.text.TextUtils;
import android.support.v7.internal.widget.q;
import android.view.ContextThemeWrapper;
import android.support.v7.b.a;
import android.util.AttributeSet;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import android.widget.ImageButton;
import android.support.v7.internal.widget.l;
import android.widget.TextView;
import android.support.v7.internal.widget.o;
import android.support.v7.internal.view.menu.e;
import android.support.v7.internal.view.menu.j;
import android.support.v7.internal.widget.r;
import android.view.View;
import java.util.ArrayList;
import android.view.ViewGroup;

public class Toolbar extends ViewGroup
{
    private boolean A;
    private final ArrayList<View> B;
    private final int[] C;
    private c D;
    private final ActionMenuView.e E;
    private r F;
    private j.a G;
    private e.a H;
    private boolean I;
    private int J;
    private final Runnable K;
    private final o L;
    ActionMenuView a;
    public TextView b;
    public TextView c;
    View d;
    public int e;
    public int f;
    public final l g;
    a h;
    private ImageButton i;
    private ImageView j;
    private Drawable k;
    private CharSequence l;
    private ImageButton m;
    private Context n;
    private int o;
    private int p;
    private int q;
    private int r;
    private int s;
    private int t;
    private int u;
    private int v;
    private CharSequence w;
    private CharSequence x;
    private int y;
    private int z;
    
    public Toolbar(final Context context) {
        this(context, null);
    }
    
    public Toolbar(final Context context, final AttributeSet set) {
        this(context, set, android.support.v7.b.a.a.toolbarStyle);
    }
    
    public Toolbar(final Context context, final AttributeSet set, int n) {
        final TypedArray obtainStyledAttributes = context.obtainStyledAttributes(set, android.support.v7.b.a.i.Toolbar, n, 0);
        final int resourceId = obtainStyledAttributes.getResourceId(android.support.v7.b.a.i.Toolbar_theme, 0);
        Object o = context;
        if (resourceId != 0) {
            o = new ContextThemeWrapper(context, resourceId);
        }
        obtainStyledAttributes.recycle();
        super((Context)o, set, n);
        this.g = new l();
        this.v = 8388627;
        this.B = new ArrayList<View>();
        this.C = new int[2];
        this.E = new ActionMenuView.e() {
            @Override
            public final boolean a() {
                return Toolbar.this.D != null && Toolbar.this.D.a();
            }
        };
        this.K = new Runnable() {
            @Override
            public final void run() {
                final Toolbar a = Toolbar.this;
                if (a.a != null) {
                    final ActionMenuView a2 = a.a;
                    if (a2.b != null) {
                        a2.b.c();
                    }
                }
            }
        };
        final q a = android.support.v7.internal.widget.q.a(this.getContext(), set, android.support.v7.b.a.i.Toolbar, n);
        this.e = a.e(android.support.v7.b.a.i.Toolbar_titleTextAppearance, 0);
        this.f = a.e(android.support.v7.b.a.i.Toolbar_subtitleTextAppearance, 0);
        final int toolbar_android_gravity = android.support.v7.b.a.i.Toolbar_android_gravity;
        n = this.v;
        this.v = a.a.getInteger(toolbar_android_gravity, n);
        this.p = 48;
        n = a.b(android.support.v7.b.a.i.Toolbar_titleMargins, 0);
        this.u = n;
        this.t = n;
        this.s = n;
        this.r = n;
        n = a.b(android.support.v7.b.a.i.Toolbar_titleMarginStart, -1);
        if (n >= 0) {
            this.r = n;
        }
        n = a.b(android.support.v7.b.a.i.Toolbar_titleMarginEnd, -1);
        if (n >= 0) {
            this.s = n;
        }
        n = a.b(android.support.v7.b.a.i.Toolbar_titleMarginTop, -1);
        if (n >= 0) {
            this.t = n;
        }
        n = a.b(android.support.v7.b.a.i.Toolbar_titleMarginBottom, -1);
        if (n >= 0) {
            this.u = n;
        }
        this.q = a.c(android.support.v7.b.a.i.Toolbar_maxButtonHeight, -1);
        final int b = a.b(android.support.v7.b.a.i.Toolbar_contentInsetStart, Integer.MIN_VALUE);
        n = a.b(android.support.v7.b.a.i.Toolbar_contentInsetEnd, Integer.MIN_VALUE);
        final int c = a.c(android.support.v7.b.a.i.Toolbar_contentInsetLeft, 0);
        final int c2 = a.c(android.support.v7.b.a.i.Toolbar_contentInsetRight, 0);
        final l g = this.g;
        g.h = false;
        if (c != Integer.MIN_VALUE) {
            g.e = c;
            g.a = c;
        }
        if (c2 != Integer.MIN_VALUE) {
            g.f = c2;
            g.b = c2;
        }
        if (b != Integer.MIN_VALUE || n != Integer.MIN_VALUE) {
            this.g.a(b, n);
        }
        this.k = a.a(android.support.v7.b.a.i.Toolbar_collapseIcon);
        this.l = a.b(android.support.v7.b.a.i.Toolbar_collapseContentDescription);
        final CharSequence b2 = a.b(android.support.v7.b.a.i.Toolbar_title);
        if (!TextUtils.isEmpty(b2)) {
            this.setTitle(b2);
        }
        final CharSequence b3 = a.b(android.support.v7.b.a.i.Toolbar_subtitle);
        if (!TextUtils.isEmpty(b3)) {
            this.setSubtitle(b3);
        }
        this.n = this.getContext();
        this.setPopupTheme(a.e(android.support.v7.b.a.i.Toolbar_popupTheme, 0));
        final Drawable a2 = a.a(android.support.v7.b.a.i.Toolbar_navigationIcon);
        if (a2 != null) {
            this.setNavigationIcon(a2);
        }
        final CharSequence b4 = a.b(android.support.v7.b.a.i.Toolbar_navigationContentDescription);
        if (!TextUtils.isEmpty(b4)) {
            this.setNavigationContentDescription(b4);
        }
        this.J = a.c(android.support.v7.b.a.i.Toolbar_android_minHeight, 0);
        a.a.recycle();
        this.L = a.a();
    }
    
    private int a(int n) {
        final int e = android.support.v4.view.u.e((View)this);
        switch (n = (android.support.v4.view.e.a(n, e) & 0x7)) {
            default: {
                if (e == 1) {
                    n = 5;
                    return n;
                }
                n = 3;
                return n;
            }
            case 1:
            case 3:
            case 5: {
                return n;
            }
        }
    }
    
    private int a(final View view, int n) {
        final b b = (b)view.getLayoutParams();
        final int measuredHeight = view.getMeasuredHeight();
        if (n > 0) {
            n = (measuredHeight - n) / 2;
        }
        else {
            n = 0;
        }
        int n2;
        switch (n2 = (b.a & 0x70)) {
            default: {
                n2 = (this.v & 0x70);
            }
            case 16:
            case 48:
            case 80: {
                switch (n2) {
                    default: {
                        final int paddingTop = this.getPaddingTop();
                        final int paddingBottom = this.getPaddingBottom();
                        final int height = this.getHeight();
                        n = (height - paddingTop - paddingBottom - measuredHeight) / 2;
                        if (n < b.topMargin) {
                            n = b.topMargin;
                        }
                        else {
                            final int n3 = height - paddingBottom - measuredHeight - n - paddingTop;
                            if (n3 < b.bottomMargin) {
                                n = Math.max(0, n - (b.bottomMargin - n3));
                            }
                        }
                        n += paddingTop;
                        break;
                    }
                    case 48: {
                        n = this.getPaddingTop() - n;
                        break;
                    }
                    case 80: {
                        n = this.getHeight() - this.getPaddingBottom() - measuredHeight - b.bottomMargin - n;
                        break;
                    }
                }
                return n;
            }
        }
    }
    
    private int a(final View view, final int n, final int n2, final int n3, final int n4, final int[] array) {
        final ViewGroup$MarginLayoutParams viewGroup$MarginLayoutParams = (ViewGroup$MarginLayoutParams)view.getLayoutParams();
        final int b = viewGroup$MarginLayoutParams.leftMargin - array[0];
        final int b2 = viewGroup$MarginLayoutParams.rightMargin - array[1];
        final int n5 = Math.max(0, b) + Math.max(0, b2);
        array[0] = Math.max(0, -b);
        array[1] = Math.max(0, -b2);
        view.measure(getChildMeasureSpec(n, this.getPaddingLeft() + this.getPaddingRight() + n5 + n2, viewGroup$MarginLayoutParams.width), getChildMeasureSpec(n3, this.getPaddingTop() + this.getPaddingBottom() + viewGroup$MarginLayoutParams.topMargin + viewGroup$MarginLayoutParams.bottomMargin + n4, viewGroup$MarginLayoutParams.height));
        return view.getMeasuredWidth() + n5;
    }
    
    private int a(final View view, int n, final int[] array, int measuredWidth) {
        final b b = (b)view.getLayoutParams();
        final int b2 = b.leftMargin - array[0];
        n += Math.max(0, b2);
        array[0] = Math.max(0, -b2);
        final int a = this.a(view, measuredWidth);
        measuredWidth = view.getMeasuredWidth();
        view.layout(n, a, n + measuredWidth, view.getMeasuredHeight() + a);
        return b.rightMargin + measuredWidth + n;
    }
    
    protected static b a() {
        return new b();
    }
    
    private static b a(final ViewGroup$LayoutParams viewGroup$LayoutParams) {
        b b;
        if (viewGroup$LayoutParams instanceof b) {
            b = new b((b)viewGroup$LayoutParams);
        }
        else if (viewGroup$LayoutParams instanceof android.support.v7.a.a.a) {
            b = new b((android.support.v7.a.a.a)viewGroup$LayoutParams);
        }
        else if (viewGroup$LayoutParams instanceof ViewGroup$MarginLayoutParams) {
            b = new b((ViewGroup$MarginLayoutParams)viewGroup$LayoutParams);
        }
        else {
            b = new b(viewGroup$LayoutParams);
        }
        return b;
    }
    
    private void a(final View view) {
        final ViewGroup$LayoutParams layoutParams = view.getLayoutParams();
        b a;
        if (layoutParams == null) {
            a = new b();
        }
        else if (!this.checkLayoutParams(layoutParams)) {
            a = a(layoutParams);
        }
        else {
            a = (b)layoutParams;
        }
        a.b = 1;
        this.addView(view, (ViewGroup$LayoutParams)a);
    }
    
    private void a(final View view, int n, int childMeasureSpec, int mode, final int b) {
        final ViewGroup$MarginLayoutParams viewGroup$MarginLayoutParams = (ViewGroup$MarginLayoutParams)view.getLayoutParams();
        final int childMeasureSpec2 = getChildMeasureSpec(n, this.getPaddingLeft() + this.getPaddingRight() + viewGroup$MarginLayoutParams.leftMargin + viewGroup$MarginLayoutParams.rightMargin + childMeasureSpec, viewGroup$MarginLayoutParams.width);
        childMeasureSpec = getChildMeasureSpec(mode, this.getPaddingTop() + this.getPaddingBottom() + viewGroup$MarginLayoutParams.topMargin + viewGroup$MarginLayoutParams.bottomMargin + 0, viewGroup$MarginLayoutParams.height);
        mode = View$MeasureSpec.getMode(childMeasureSpec);
        n = childMeasureSpec;
        if (mode != 1073741824) {
            n = childMeasureSpec;
            if (b >= 0) {
                n = b;
                if (mode != 0) {
                    n = Math.min(View$MeasureSpec.getSize(childMeasureSpec), b);
                }
                n = View$MeasureSpec.makeMeasureSpec(n, 1073741824);
            }
        }
        view.measure(childMeasureSpec2, n);
    }
    
    private void a(final List<View> list, int i) {
        int n = 1;
        final int n2 = 0;
        if (android.support.v4.view.u.e((View)this) != 1) {
            n = 0;
        }
        final int childCount = this.getChildCount();
        final int a = android.support.v4.view.e.a(i, android.support.v4.view.u.e((View)this));
        list.clear();
        i = n2;
        if (n != 0) {
            View child;
            b b;
            for (i = childCount - 1; i >= 0; --i) {
                child = this.getChildAt(i);
                b = (b)child.getLayoutParams();
                if (b.b == 0 && this.b(child) && this.a(b.a) == a) {
                    list.add(child);
                }
            }
        }
        else {
            while (i < childCount) {
                final View child2 = this.getChildAt(i);
                final b b2 = (b)child2.getLayoutParams();
                if (b2.b == 0 && this.b(child2) && this.a(b2.a) == a) {
                    list.add(child2);
                }
                ++i;
            }
        }
    }
    
    private int b(final View view, int n, final int[] array, int a) {
        final b b = (b)view.getLayoutParams();
        final int b2 = b.rightMargin - array[1];
        n -= Math.max(0, b2);
        array[1] = Math.max(0, -b2);
        a = this.a(view, a);
        final int measuredWidth = view.getMeasuredWidth();
        view.layout(n - measuredWidth, a, n, view.getMeasuredHeight() + a);
        return n - (b.leftMargin + measuredWidth);
    }
    
    private void b() {
        if (this.j == null) {
            this.j = new ImageView(this.getContext());
        }
    }
    
    static /* synthetic */ void b(final Toolbar toolbar) {
        if (toolbar.m == null) {
            (toolbar.m = new ImageButton(toolbar.getContext(), (AttributeSet)null, android.support.v7.b.a.a.toolbarNavigationButtonStyle)).setImageDrawable(toolbar.k);
            toolbar.m.setContentDescription(toolbar.l);
            final b layoutParams = new b();
            layoutParams.a = (0x800003 | (toolbar.p & 0x70));
            layoutParams.b = 2;
            toolbar.m.setLayoutParams((ViewGroup$LayoutParams)layoutParams);
            toolbar.m.setOnClickListener((View$OnClickListener)new View$OnClickListener() {
                public final void onClick(final View view) {
                    final Toolbar a = Toolbar.this;
                    f b;
                    if (a.h == null) {
                        b = null;
                    }
                    else {
                        b = a.h.b;
                    }
                    if (b != null) {
                        b.collapseActionView();
                    }
                }
            });
        }
    }
    
    private boolean b(final View view) {
        return view != null && view.getParent() == this && view.getVisibility() != 8;
    }
    
    private static int c(final View view) {
        final ViewGroup$MarginLayoutParams viewGroup$MarginLayoutParams = (ViewGroup$MarginLayoutParams)view.getLayoutParams();
        return i.b(viewGroup$MarginLayoutParams) + i.a(viewGroup$MarginLayoutParams);
    }
    
    private void c() {
        if (this.i == null) {
            this.i = new ImageButton(this.getContext(), (AttributeSet)null, android.support.v7.b.a.a.toolbarNavigationButtonStyle);
            final b layoutParams = new b();
            layoutParams.a = (0x800003 | (this.p & 0x70));
            this.i.setLayoutParams((ViewGroup$LayoutParams)layoutParams);
        }
    }
    
    private static int d(final View view) {
        final ViewGroup$MarginLayoutParams viewGroup$MarginLayoutParams = (ViewGroup$MarginLayoutParams)view.getLayoutParams();
        return viewGroup$MarginLayoutParams.bottomMargin + viewGroup$MarginLayoutParams.topMargin;
    }
    
    private void e(final View view) {
        if (((b)view.getLayoutParams()).b != 2 && view != this.a) {
            int visibility;
            if (this.d != null) {
                visibility = 8;
            }
            else {
                visibility = 0;
            }
            view.setVisibility(visibility);
        }
    }
    
    private MenuInflater getMenuInflater() {
        return new android.support.v7.internal.view.b(this.getContext());
    }
    
    private int getMinimumHeightCompat() {
        int n;
        if (Build$VERSION.SDK_INT >= 16) {
            n = android.support.v4.view.u.h((View)this);
        }
        else {
            n = this.J;
        }
        return n;
    }
    
    private void setChildVisibilityForExpandedActionView(final boolean b) {
        for (int childCount = this.getChildCount(), i = 0; i < childCount; ++i) {
            final View child = this.getChildAt(i);
            if (((b)child.getLayoutParams()).b != 2 && child != this.a) {
                int visibility;
                if (b) {
                    visibility = 8;
                }
                else {
                    visibility = 0;
                }
                child.setVisibility(visibility);
            }
        }
    }
    
    protected boolean checkLayoutParams(final ViewGroup$LayoutParams viewGroup$LayoutParams) {
        return super.checkLayoutParams(viewGroup$LayoutParams) && viewGroup$LayoutParams instanceof b;
    }
    
    public int getContentInsetEnd() {
        final l g = this.g;
        int n;
        if (g.g) {
            n = g.a;
        }
        else {
            n = g.b;
        }
        return n;
    }
    
    public int getContentInsetLeft() {
        return this.g.a;
    }
    
    public int getContentInsetRight() {
        return this.g.b;
    }
    
    public int getContentInsetStart() {
        final l g = this.g;
        int n;
        if (g.g) {
            n = g.b;
        }
        else {
            n = g.a;
        }
        return n;
    }
    
    public Drawable getLogo() {
        Drawable drawable;
        if (this.j != null) {
            drawable = this.j.getDrawable();
        }
        else {
            drawable = null;
        }
        return drawable;
    }
    
    public CharSequence getLogoDescription() {
        CharSequence contentDescription;
        if (this.j != null) {
            contentDescription = this.j.getContentDescription();
        }
        else {
            contentDescription = null;
        }
        return contentDescription;
    }
    
    public Menu getMenu() {
        if (this.a == null) {
            (this.a = new ActionMenuView(this.getContext())).setPopupTheme(this.o);
            this.a.setOnMenuItemClickListener(this.E);
            final ActionMenuView a = this.a;
            final j.a g = this.G;
            final e.a h = this.H;
            a.c = g;
            a.d = h;
            final b layoutParams = new b();
            layoutParams.a = (0x800005 | (this.p & 0x70));
            this.a.setLayoutParams((ViewGroup$LayoutParams)layoutParams);
            this.a((View)this.a);
        }
        if (this.a.a == null) {
            final e e = (e)this.a.getMenu();
            if (this.h == null) {
                this.h = new a((byte)0);
            }
            this.a.setExpandedActionViewsExclusive(true);
            e.a(this.h, this.n);
        }
        return this.a.getMenu();
    }
    
    public CharSequence getNavigationContentDescription() {
        CharSequence contentDescription;
        if (this.i != null) {
            contentDescription = this.i.getContentDescription();
        }
        else {
            contentDescription = null;
        }
        return contentDescription;
    }
    
    public Drawable getNavigationIcon() {
        Drawable drawable;
        if (this.i != null) {
            drawable = this.i.getDrawable();
        }
        else {
            drawable = null;
        }
        return drawable;
    }
    
    public int getPopupTheme() {
        return this.o;
    }
    
    public CharSequence getSubtitle() {
        return this.x;
    }
    
    public CharSequence getTitle() {
        return this.w;
    }
    
    public h getWrapper() {
        if (this.F == null) {
            this.F = new r(this);
        }
        return this.F;
    }
    
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.removeCallbacks(this.K);
    }
    
    protected void onLayout(final boolean b, int i, int j, int k, int l) {
        boolean b2;
        if (android.support.v4.view.u.e((View)this) == 1) {
            b2 = true;
        }
        else {
            b2 = false;
        }
        final int width = this.getWidth();
        final int height = this.getHeight();
        final int paddingLeft = this.getPaddingLeft();
        final int paddingRight = this.getPaddingRight();
        final int paddingTop = this.getPaddingTop();
        final int paddingBottom = this.getPaddingBottom();
        l = width - paddingRight;
        final int[] c = this.C;
        c[c[1] = 0] = 0;
        final int minimumHeightCompat = this.getMinimumHeightCompat();
        if (this.b((View)this.i)) {
            if (b2) {
                l = this.b((View)this.i, l, c, minimumHeightCompat);
                i = paddingLeft;
            }
            else {
                i = this.a((View)this.i, paddingLeft, c, minimumHeightCompat);
            }
        }
        else {
            i = paddingLeft;
        }
        k = l;
        j = i;
        if (this.b((View)this.m)) {
            if (b2) {
                k = this.b((View)this.m, l, c, minimumHeightCompat);
                j = i;
            }
            else {
                j = this.a((View)this.m, i, c, minimumHeightCompat);
                k = l;
            }
        }
        i = k;
        l = j;
        if (this.b((View)this.a)) {
            if (b2) {
                l = this.a((View)this.a, j, c, minimumHeightCompat);
                i = k;
            }
            else {
                i = this.b((View)this.a, k, c, minimumHeightCompat);
                l = j;
            }
        }
        c[0] = Math.max(0, this.getContentInsetLeft() - l);
        c[1] = Math.max(0, this.getContentInsetRight() - (width - paddingRight - i));
        k = Math.max(l, this.getContentInsetLeft());
        l = (j = Math.min(i, width - paddingRight - this.getContentInsetRight()));
        i = k;
        if (this.b(this.d)) {
            if (b2) {
                j = this.b(this.d, l, c, minimumHeightCompat);
                i = k;
            }
            else {
                i = this.a(this.d, k, c, minimumHeightCompat);
                j = l;
            }
        }
        if (this.b((View)this.j)) {
            if (b2) {
                j = this.b((View)this.j, j, c, minimumHeightCompat);
                k = i;
            }
            else {
                k = this.a((View)this.j, i, c, minimumHeightCompat);
            }
        }
        else {
            k = i;
        }
        final boolean b3 = this.b((View)this.b);
        final boolean b4 = this.b((View)this.c);
        i = 0;
        if (b3) {
            final b b5 = (b)this.b.getLayoutParams();
            i = b5.topMargin;
            l = this.b.getMeasuredHeight();
            i = b5.bottomMargin + (i + l) + 0;
        }
        int n;
        if (b4) {
            final b b6 = (b)this.c.getLayoutParams();
            l = b6.topMargin;
            n = b6.bottomMargin + (l + this.c.getMeasuredHeight()) + i;
        }
        else {
            n = i;
        }
        Label_0817: {
            if (!b3) {
                l = j;
                i = k;
                if (!b4) {
                    break Label_0817;
                }
            }
            TextView textView;
            if (b3) {
                textView = this.b;
            }
            else {
                textView = this.c;
            }
            TextView textView2;
            if (b4) {
                textView2 = this.c;
            }
            else {
                textView2 = this.b;
            }
            final b b7 = (b)((View)textView).getLayoutParams();
            final b b8 = (b)((View)textView2).getLayoutParams();
            boolean b9;
            if ((b3 && this.b.getMeasuredWidth() > 0) || (b4 && this.c.getMeasuredWidth() > 0)) {
                b9 = true;
            }
            else {
                b9 = false;
            }
            switch (this.v & 0x70) {
                default: {
                    i = (height - paddingTop - paddingBottom - n) / 2;
                    if (i < b7.topMargin + this.t) {
                        i = b7.topMargin + this.t;
                    }
                    else {
                        l = height - paddingBottom - n - i - paddingTop;
                        if (l < b7.bottomMargin + this.u) {
                            i = Math.max(0, i - (b8.bottomMargin + this.u - l));
                        }
                    }
                    i += paddingTop;
                    break;
                }
                case 48: {
                    i = this.getPaddingTop();
                    i = b7.topMargin + i + this.t;
                    break;
                }
                case 80: {
                    i = height - paddingBottom - b8.bottomMargin - this.u - n;
                    break;
                }
            }
            if (b2) {
                if (b9) {
                    l = this.r;
                }
                else {
                    l = 0;
                }
                l -= c[1];
                j -= Math.max(0, l);
                c[1] = Math.max(0, -l);
                if (b3) {
                    final b b10 = (b)this.b.getLayoutParams();
                    l = j - this.b.getMeasuredWidth();
                    final int n2 = this.b.getMeasuredHeight() + i;
                    this.b.layout(l, i, j, n2);
                    final int s = this.s;
                    i = n2 + b10.bottomMargin;
                    l -= s;
                }
                else {
                    l = j;
                }
                if (b4) {
                    final b b11 = (b)this.c.getLayoutParams();
                    final int n3 = b11.topMargin + i;
                    final int measuredWidth = this.c.getMeasuredWidth();
                    i = this.c.getMeasuredHeight();
                    this.c.layout(j - measuredWidth, n3, j, i + n3);
                    i = this.s;
                    final int bottomMargin = b11.bottomMargin;
                    i = j - i;
                }
                else {
                    i = j;
                }
                if (b9) {
                    i = Math.min(l, i);
                }
                else {
                    i = j;
                }
                l = i;
                i = k;
            }
            else {
                if (b9) {
                    l = this.r;
                }
                else {
                    l = 0;
                }
                l -= c[0];
                k += Math.max(0, l);
                c[0] = Math.max(0, -l);
                int a;
                if (b3) {
                    final b b12 = (b)this.b.getLayoutParams();
                    final int n4 = this.b.getMeasuredWidth() + k;
                    l = this.b.getMeasuredHeight() + i;
                    this.b.layout(k, i, n4, l);
                    final int s2 = this.s;
                    i = b12.bottomMargin;
                    a = n4 + s2;
                    i += l;
                }
                else {
                    a = k;
                }
                int b14;
                if (b4) {
                    final b b13 = (b)this.c.getLayoutParams();
                    final int n5 = i + b13.topMargin;
                    i = this.c.getMeasuredWidth() + k;
                    l = this.c.getMeasuredHeight();
                    this.c.layout(k, n5, i, l + n5);
                    final int s3 = this.s;
                    l = b13.bottomMargin;
                    b14 = s3 + i;
                }
                else {
                    b14 = k;
                }
                l = j;
                i = k;
                if (b9) {
                    i = Math.max(a, b14);
                    l = j;
                }
            }
        }
        this.a(this.B, 3);
        for (k = this.B.size(), j = 0; j < k; ++j) {
            i = this.a(this.B.get(j), i, c, minimumHeightCompat);
        }
        this.a(this.B, 5);
        final int size = this.B.size();
        k = 0;
        j = l;
        while (k < size) {
            j = this.b(this.B.get(k), j, c, minimumHeightCompat);
            ++k;
        }
        this.a(this.B, 1);
        final ArrayList<View> b15 = this.B;
        int max = c[0];
        int max2 = c[1];
        int size2;
        View view;
        b b16;
        int b17;
        int b18;
        int max3;
        int max4;
        int measuredWidth2;
        for (size2 = b15.size(), l = 0, k = 0; l < size2; ++l, k += measuredWidth2 + max3 + max4) {
            view = b15.get(l);
            b16 = (b)view.getLayoutParams();
            b17 = b16.leftMargin - max;
            b18 = b16.rightMargin - max2;
            max3 = Math.max(0, b17);
            max4 = Math.max(0, b18);
            max = Math.max(0, -b17);
            max2 = Math.max(0, -b18);
            measuredWidth2 = view.getMeasuredWidth();
        }
        l = (width - paddingLeft - paddingRight) / 2 + paddingLeft - k / 2;
        k += l;
        if (l >= i) {
            i = l;
            if (k > j) {
                i = l - (k - j);
            }
        }
        l = this.B.size();
        k = 0;
        j = i;
        for (i = k; i < l; ++i) {
            j = this.a(this.B.get(i), j, c, minimumHeightCompat);
        }
        this.B.clear();
    }
    
    protected void onMeasure(int i, int a) {
        final int[] c = this.C;
        int n;
        int n2;
        if (android.support.v7.internal.widget.s.a((View)this)) {
            n = 0;
            n2 = 1;
        }
        else {
            n = 1;
            n2 = 0;
        }
        int n3 = 0;
        int max;
        int a2;
        if (this.b((View)this.i)) {
            this.a((View)this.i, i, 0, a, this.q);
            n3 = this.i.getMeasuredWidth() + c((View)this.i);
            max = Math.max(0, this.i.getMeasuredHeight() + d((View)this.i));
            a2 = android.support.v7.internal.widget.s.a(0, android.support.v4.view.u.f((View)this.i));
        }
        else {
            a2 = 0;
            max = 0;
        }
        int b = n3;
        int a3 = a2;
        int max2 = max;
        if (this.b((View)this.m)) {
            this.a((View)this.m, i, 0, a, this.q);
            b = this.m.getMeasuredWidth() + c((View)this.m);
            max2 = Math.max(max, this.m.getMeasuredHeight() + d((View)this.m));
            a3 = android.support.v7.internal.widget.s.a(a2, android.support.v4.view.u.f((View)this.m));
        }
        final int contentInsetStart = this.getContentInsetStart();
        final int n4 = Math.max(contentInsetStart, b) + 0;
        c[n2] = Math.max(0, contentInsetStart - b);
        int b2 = 0;
        int a4 = a3;
        int max3 = max2;
        if (this.b((View)this.a)) {
            this.a((View)this.a, i, n4, a, this.q);
            b2 = this.a.getMeasuredWidth() + c((View)this.a);
            max3 = Math.max(max2, this.a.getMeasuredHeight() + d((View)this.a));
            a4 = android.support.v7.internal.widget.s.a(a3, android.support.v4.view.u.f((View)this.a));
        }
        final int contentInsetEnd = this.getContentInsetEnd();
        final int n5 = n4 + Math.max(contentInsetEnd, b2);
        c[n] = Math.max(0, contentInsetEnd - b2);
        int n6 = n5;
        int a5 = a4;
        int max4 = max3;
        if (this.b(this.d)) {
            n6 = n5 + this.a(this.d, i, n5, a, 0, c);
            max4 = Math.max(max3, this.d.getMeasuredHeight() + d(this.d));
            a5 = android.support.v7.internal.widget.s.a(a4, android.support.v4.view.u.f(this.d));
        }
        int n7 = n6;
        int a6 = a5;
        int max5 = max4;
        if (this.b((View)this.j)) {
            n7 = n6 + this.a((View)this.j, i, n6, a, 0, c);
            max5 = Math.max(max4, this.j.getMeasuredHeight() + d((View)this.j));
            a6 = android.support.v7.internal.widget.s.a(a5, android.support.v4.view.u.f((View)this.j));
        }
        final int childCount = this.getChildCount();
        final int n8 = 0;
        int n9 = a6;
        int n10 = max5;
        int j = n8;
        int n11 = n7;
        while (j < childCount) {
            final View child = this.getChildAt(j);
            int a7;
            int n12;
            if (((b)child.getLayoutParams()).b == 0 && this.b(child)) {
                n11 += this.a(child, i, n11, a, 0, c);
                final int max6 = Math.max(n10, child.getMeasuredHeight() + d(child));
                a7 = android.support.v7.internal.widget.s.a(n9, android.support.v4.view.u.f(child));
                n12 = max6;
            }
            else {
                final int n13 = n10;
                a7 = n9;
                n12 = n13;
            }
            ++j;
            final int n14 = a7;
            n10 = n12;
            n9 = n14;
        }
        int a8 = 0;
        int n15 = 0;
        final int n16 = this.t + this.u;
        final int n17 = this.r + this.s;
        int a9 = n9;
        if (this.b((View)this.b)) {
            this.a((View)this.b, i, n11 + n17, a, n16, c);
            a8 = c((View)this.b) + this.b.getMeasuredWidth();
            n15 = this.b.getMeasuredHeight() + d((View)this.b);
            a9 = android.support.v7.internal.widget.s.a(n9, android.support.v4.view.u.f((View)this.b));
        }
        int b3 = n15;
        int max7 = a8;
        int a10 = a9;
        if (this.b((View)this.c)) {
            max7 = Math.max(a8, this.a((View)this.c, i, n11 + n17, a, n16 + n15, c));
            b3 = n15 + (this.c.getMeasuredHeight() + d((View)this.c));
            a10 = android.support.v7.internal.widget.s.a(a9, android.support.v4.view.u.f((View)this.c));
        }
        final int max8 = Math.max(n10, b3);
        final int paddingLeft = this.getPaddingLeft();
        final int paddingRight = this.getPaddingRight();
        final int paddingTop = this.getPaddingTop();
        final int paddingBottom = this.getPaddingBottom();
        final int a11 = android.support.v4.view.u.a(Math.max(max7 + n11 + (paddingLeft + paddingRight), this.getSuggestedMinimumWidth()), i, 0xFF000000 & a10);
        a = android.support.v4.view.u.a(Math.max(max8 + (paddingTop + paddingBottom), this.getSuggestedMinimumHeight()), a, a10 << 16);
        Label_0934: {
            if (!this.I) {
                i = 0;
            }
            else {
                int childCount2;
                View child2;
                for (childCount2 = this.getChildCount(), i = 0; i < childCount2; ++i) {
                    child2 = this.getChildAt(i);
                    if (this.b(child2) && child2.getMeasuredWidth() > 0 && child2.getMeasuredHeight() > 0) {
                        i = 0;
                        break Label_0934;
                    }
                }
                i = 1;
            }
        }
        if (i != 0) {
            a = 0;
        }
        this.setMeasuredDimension(a11, a);
    }
    
    protected void onRestoreInstanceState(final Parcelable parcelable) {
        final SavedState savedState = (SavedState)parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        Object a;
        if (this.a != null) {
            a = this.a.a;
        }
        else {
            a = null;
        }
        if (savedState.a != 0 && this.h != null && a != null) {
            final MenuItem item = ((Menu)a).findItem(savedState.a);
            if (item != null) {
                android.support.v4.view.k.a(item);
            }
        }
        if (savedState.b) {
            this.removeCallbacks(this.K);
            this.post(this.K);
        }
    }
    
    public void onRtlPropertiesChanged(int n) {
        boolean g = true;
        if (Build$VERSION.SDK_INT >= 17) {
            super.onRtlPropertiesChanged(n);
        }
        final l g2 = this.g;
        if (n != 1) {
            g = false;
        }
        if (g != g2.g) {
            g2.g = g;
            if (g2.h) {
                if (g) {
                    if (g2.d != Integer.MIN_VALUE) {
                        n = g2.d;
                    }
                    else {
                        n = g2.e;
                    }
                    g2.a = n;
                    if (g2.c != Integer.MIN_VALUE) {
                        n = g2.c;
                    }
                    else {
                        n = g2.f;
                    }
                    g2.b = n;
                }
                else {
                    if (g2.c != Integer.MIN_VALUE) {
                        n = g2.c;
                    }
                    else {
                        n = g2.e;
                    }
                    g2.a = n;
                    if (g2.d != Integer.MIN_VALUE) {
                        n = g2.d;
                    }
                    else {
                        n = g2.f;
                    }
                    g2.b = n;
                }
            }
            else {
                g2.a = g2.e;
                g2.b = g2.f;
            }
        }
    }
    
    protected Parcelable onSaveInstanceState() {
        boolean b = true;
        final SavedState savedState = new SavedState(super.onSaveInstanceState());
        if (this.h != null && this.h.b != null) {
            savedState.a = this.h.b.getItemId();
        }
        while (true) {
            Label_0095: {
                if (this.a == null) {
                    break Label_0095;
                }
                final ActionMenuView a = this.a;
                int n;
                if (a.b != null && a.b.g()) {
                    n = 1;
                }
                else {
                    n = 0;
                }
                if (n == 0) {
                    break Label_0095;
                }
                savedState.b = b;
                return (Parcelable)savedState;
            }
            b = false;
            continue;
        }
    }
    
    public boolean onTouchEvent(final MotionEvent motionEvent) {
        final int a = android.support.v4.view.n.a(motionEvent);
        if (a == 0) {
            this.A = false;
        }
        if (!this.A) {
            final boolean onTouchEvent = super.onTouchEvent(motionEvent);
            if (a == 0 && !onTouchEvent) {
                this.A = true;
            }
        }
        if (a == 1 || a == 3) {
            this.A = false;
        }
        return true;
    }
    
    public void setCollapsible(final boolean i) {
        this.I = i;
        this.requestLayout();
    }
    
    public void setLogo(final int n) {
        this.setLogo(this.L.a(n));
    }
    
    public void setLogo(final Drawable imageDrawable) {
        if (imageDrawable != null) {
            this.b();
            if (this.j.getParent() == null) {
                this.a((View)this.j);
                this.e((View)this.j);
            }
        }
        else if (this.j != null && this.j.getParent() != null) {
            this.removeView((View)this.j);
        }
        if (this.j != null) {
            this.j.setImageDrawable(imageDrawable);
        }
    }
    
    public void setLogoDescription(final int n) {
        this.setLogoDescription(this.getContext().getText(n));
    }
    
    public void setLogoDescription(final CharSequence contentDescription) {
        if (!TextUtils.isEmpty(contentDescription)) {
            this.b();
        }
        if (this.j != null) {
            this.j.setContentDescription(contentDescription);
        }
    }
    
    public void setMinimumHeight(final int j) {
        super.setMinimumHeight(this.J = j);
    }
    
    public void setNavigationContentDescription(final int n) {
        CharSequence text;
        if (n != 0) {
            text = this.getContext().getText(n);
        }
        else {
            text = null;
        }
        this.setNavigationContentDescription(text);
    }
    
    public void setNavigationContentDescription(final CharSequence contentDescription) {
        if (!TextUtils.isEmpty(contentDescription)) {
            this.c();
        }
        if (this.i != null) {
            this.i.setContentDescription(contentDescription);
        }
    }
    
    public void setNavigationIcon(final int n) {
        this.setNavigationIcon(this.L.a(n));
    }
    
    public void setNavigationIcon(final Drawable imageDrawable) {
        if (imageDrawable != null) {
            this.c();
            if (this.i.getParent() == null) {
                this.a((View)this.i);
                this.e((View)this.i);
            }
        }
        else if (this.i != null && this.i.getParent() != null) {
            this.removeView((View)this.i);
        }
        if (this.i != null) {
            this.i.setImageDrawable(imageDrawable);
        }
    }
    
    public void setNavigationOnClickListener(final View$OnClickListener onClickListener) {
        this.c();
        this.i.setOnClickListener(onClickListener);
    }
    
    public void setOnMenuItemClickListener(final c d) {
        this.D = d;
    }
    
    public void setPopupTheme(final int o) {
        if (this.o != o) {
            if ((this.o = o) == 0) {
                this.n = this.getContext();
            }
            else {
                this.n = (Context)new ContextThemeWrapper(this.getContext(), o);
            }
        }
    }
    
    public void setSubtitle(final int n) {
        this.setSubtitle(this.getContext().getText(n));
    }
    
    public void setSubtitle(final CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            if (this.c == null) {
                final Context context = this.getContext();
                (this.c = new TextView(context)).setSingleLine();
                this.c.setEllipsize(TextUtils$TruncateAt.END);
                if (this.f != 0) {
                    this.c.setTextAppearance(context, this.f);
                }
                if (this.z != 0) {
                    this.c.setTextColor(this.z);
                }
            }
            if (this.c.getParent() == null) {
                this.a((View)this.c);
                this.e((View)this.c);
            }
        }
        else if (this.c != null && this.c.getParent() != null) {
            this.removeView((View)this.c);
        }
        if (this.c != null) {
            this.c.setText(charSequence);
        }
        this.x = charSequence;
    }
    
    public void setSubtitleTextColor(final int n) {
        this.z = n;
        if (this.c != null) {
            this.c.setTextColor(n);
        }
    }
    
    public void setTitle(final int n) {
        this.setTitle(this.getContext().getText(n));
    }
    
    public void setTitle(final CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            if (this.b == null) {
                final Context context = this.getContext();
                (this.b = new TextView(context)).setSingleLine();
                this.b.setEllipsize(TextUtils$TruncateAt.END);
                if (this.e != 0) {
                    this.b.setTextAppearance(context, this.e);
                }
                if (this.y != 0) {
                    this.b.setTextColor(this.y);
                }
            }
            if (this.b.getParent() == null) {
                this.a((View)this.b);
                this.e((View)this.b);
            }
        }
        else if (this.b != null && this.b.getParent() != null) {
            this.removeView((View)this.b);
        }
        if (this.b != null) {
            this.b.setText(charSequence);
        }
        this.w = charSequence;
    }
    
    public void setTitleTextColor(final int n) {
        this.y = n;
        if (this.b != null) {
            this.b.setTextColor(n);
        }
    }
    
    static class SavedState extends View$BaseSavedState
    {
        public static final Parcelable$Creator<SavedState> CREATOR;
        public int a;
        public boolean b;
        
        static {
            CREATOR = (Parcelable$Creator)new Parcelable$Creator<SavedState>() {};
        }
        
        public SavedState(final Parcel parcel) {
            super(parcel);
            this.a = parcel.readInt();
            this.b = (parcel.readInt() != 0);
        }
        
        public SavedState(final Parcelable parcelable) {
            super(parcelable);
        }
        
        public void writeToParcel(final Parcel parcel, int n) {
            super.writeToParcel(parcel, n);
            parcel.writeInt(this.a);
            if (this.b) {
                n = 1;
            }
            else {
                n = 0;
            }
            parcel.writeInt(n);
        }
    }
    
    private final class a implements j
    {
        e a;
        f b;
        
        @Override
        public final void a(final Context context, final e a) {
            if (this.a != null && this.b != null) {
                this.a.b(this.b);
            }
            this.a = a;
        }
        
        @Override
        public final void a(final e e, final boolean b) {
        }
        
        @Override
        public final void a(final boolean b) {
            final boolean b2 = false;
            if (this.b != null) {
                int n = b2 ? 1 : 0;
                if (this.a != null) {
                    final int size = this.a.size();
                    int n2 = 0;
                    while (true) {
                        n = (b2 ? 1 : 0);
                        if (n2 >= size) {
                            break;
                        }
                        if (this.a.getItem(n2) == this.b) {
                            n = 1;
                            break;
                        }
                        ++n2;
                    }
                }
                if (n == 0) {
                    this.c(this.b);
                }
            }
        }
        
        @Override
        public final boolean a() {
            return false;
        }
        
        @Override
        public final boolean a(final m m) {
            return false;
        }
        
        @Override
        public final boolean b(final f b) {
            Toolbar.b(Toolbar.this);
            if (Toolbar.this.m.getParent() != Toolbar.this) {
                Toolbar.this.addView((View)Toolbar.this.m);
            }
            Toolbar.this.d = b.getActionView();
            this.b = b;
            if (Toolbar.this.d.getParent() != Toolbar.this) {
                final b a = Toolbar.a();
                a.a = (0x800003 | (Toolbar.this.p & 0x70));
                a.b = 2;
                Toolbar.this.d.setLayoutParams((ViewGroup$LayoutParams)a);
                Toolbar.this.addView(Toolbar.this.d);
            }
            Toolbar.this.setChildVisibilityForExpandedActionView(true);
            Toolbar.this.requestLayout();
            b.d(true);
            if (Toolbar.this.d instanceof android.support.v7.c.a) {
                ((android.support.v7.c.a)Toolbar.this.d).a();
            }
            return true;
        }
        
        @Override
        public final boolean c(final f f) {
            if (Toolbar.this.d instanceof android.support.v7.c.a) {
                ((android.support.v7.c.a)Toolbar.this.d).a_();
            }
            Toolbar.this.removeView(Toolbar.this.d);
            Toolbar.this.removeView((View)Toolbar.this.m);
            Toolbar.this.d = null;
            Toolbar.this.setChildVisibilityForExpandedActionView(false);
            this.b = null;
            Toolbar.this.requestLayout();
            f.d(false);
            return true;
        }
    }
    
    public static final class b extends a.a
    {
        int b;
        
        public b() {
            this.b = 0;
            this.a = 8388627;
        }
        
        public b(final Context context, final AttributeSet set) {
            super(context, set);
            this.b = 0;
        }
        
        public b(final a.a a) {
            super(a);
            this.b = 0;
        }
        
        public b(final b b) {
            super((a.a)b);
            this.b = 0;
            this.b = b.b;
        }
        
        public b(final ViewGroup$LayoutParams viewGroup$LayoutParams) {
            super(viewGroup$LayoutParams);
            this.b = 0;
        }
        
        public b(final ViewGroup$MarginLayoutParams viewGroup$MarginLayoutParams) {
            super((ViewGroup$LayoutParams)viewGroup$MarginLayoutParams);
            this.b = 0;
            this.leftMargin = viewGroup$MarginLayoutParams.leftMargin;
            this.topMargin = viewGroup$MarginLayoutParams.topMargin;
            this.rightMargin = viewGroup$MarginLayoutParams.rightMargin;
            this.bottomMargin = viewGroup$MarginLayoutParams.bottomMargin;
        }
    }
    
    public interface c
    {
        boolean a();
    }
}
