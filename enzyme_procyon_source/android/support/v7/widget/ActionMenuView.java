// 
// Decompiled by Procyon v0.5.36
// 

package android.support.v7.widget;

import android.view.ViewDebug$ExportedProperty;
import android.view.ContextThemeWrapper;
import android.support.v7.internal.widget.s;
import android.os.Build$VERSION;
import android.content.res.Configuration;
import android.view.Menu;
import android.view.accessibility.AccessibilityEvent;
import android.view.MenuItem;
import android.support.v7.internal.view.menu.f;
import android.view.ViewGroup$LayoutParams;
import android.support.v7.internal.view.menu.ActionMenuItemView;
import android.view.View$MeasureSpec;
import android.view.View;
import android.util.AttributeSet;
import android.content.Context;
import android.support.v7.internal.view.menu.j;
import android.support.v7.internal.view.menu.k;
import android.support.v7.internal.view.menu.e;

public class ActionMenuView extends LinearLayoutCompat implements android.support.v7.internal.view.menu.e.b, k
{
    android.support.v7.internal.view.menu.e a;
    android.support.v7.widget.a b;
    j.a c;
    android.support.v7.internal.view.menu.e.a d;
    private Context e;
    private Context f;
    private int g;
    private boolean h;
    private boolean i;
    private int j;
    private int k;
    private int l;
    private e m;
    
    public ActionMenuView(final Context context) {
        this(context, null);
    }
    
    public ActionMenuView(final Context context, final AttributeSet set) {
        super(context, set);
        this.e = context;
        this.setBaselineAligned(false);
        final float density = context.getResources().getDisplayMetrics().density;
        this.k = (int)(56.0f * density);
        this.l = (int)(density * 4.0f);
        this.f = context;
        this.g = 0;
    }
    
    static int a(final View view, final int n, int n2, int b, int n3) {
        final boolean b2 = false;
        final c c = (c)view.getLayoutParams();
        final int measureSpec = View$MeasureSpec.makeMeasureSpec(View$MeasureSpec.getSize(b) - n3, View$MeasureSpec.getMode(b));
        ActionMenuItemView actionMenuItemView;
        if (view instanceof ActionMenuItemView) {
            actionMenuItemView = (ActionMenuItemView)view;
        }
        else {
            actionMenuItemView = null;
        }
        if (actionMenuItemView != null && actionMenuItemView.b()) {
            n3 = 1;
        }
        else {
            n3 = 0;
        }
        if (n2 > 0 && (n3 == 0 || n2 >= 2)) {
            view.measure(View$MeasureSpec.makeMeasureSpec(n * n2, Integer.MIN_VALUE), measureSpec);
            final int measuredWidth = view.getMeasuredWidth();
            b = (n2 = measuredWidth / n);
            if (measuredWidth % n != 0) {
                n2 = b + 1;
            }
            b = n2;
            if (n3 != 0 && (b = n2) < 2) {
                b = 2;
            }
        }
        else {
            b = 0;
        }
        boolean d = b2;
        if (!c.a) {
            d = b2;
            if (n3 != 0) {
                d = true;
            }
        }
        c.d = d;
        c.b = b;
        view.measure(View$MeasureSpec.makeMeasureSpec(b * n, 1073741824), measureSpec);
        return b;
    }
    
    public static c a() {
        final c c = c();
        c.a = true;
        return c;
    }
    
    protected static c a(final ViewGroup$LayoutParams viewGroup$LayoutParams) {
        c c2;
        if (viewGroup$LayoutParams != null) {
            c c;
            if (viewGroup$LayoutParams instanceof c) {
                c = new c((c)viewGroup$LayoutParams);
            }
            else {
                c = new c(viewGroup$LayoutParams);
            }
            c2 = c;
            if (c.h <= 0) {
                c.h = 16;
                c2 = c;
            }
        }
        else {
            c2 = c();
        }
        return c2;
    }
    
    private boolean a(final int n) {
        final boolean b = false;
        boolean b2;
        if (n == 0) {
            b2 = false;
        }
        else {
            final View child = this.getChildAt(n - 1);
            final View child2 = this.getChildAt(n);
            b2 = b;
            if (n < this.getChildCount()) {
                b2 = b;
                if (child instanceof a) {
                    b2 = (((a)child).d() | false);
                }
            }
            if (n > 0 && child2 instanceof a) {
                b2 |= ((a)child2).c();
            }
        }
        return b2;
    }
    
    private c b(final AttributeSet set) {
        return new c(this.getContext(), set);
    }
    
    private static c c() {
        final c c = new c();
        c.h = 16;
        return c;
    }
    
    @Override
    public final void a(final android.support.v7.internal.view.menu.e a) {
        this.a = a;
    }
    
    @Override
    public final boolean a(final f f) {
        return this.a.a((MenuItem)f, 0);
    }
    
    @Override
    protected boolean checkLayoutParams(final ViewGroup$LayoutParams viewGroup$LayoutParams) {
        return viewGroup$LayoutParams != null && viewGroup$LayoutParams instanceof c;
    }
    
    public boolean dispatchPopulateAccessibilityEvent(final AccessibilityEvent accessibilityEvent) {
        return false;
    }
    
    public Menu getMenu() {
        if (this.a == null) {
            final Context context = this.getContext();
            (this.a = new android.support.v7.internal.view.menu.e(context)).a((android.support.v7.internal.view.menu.e.a)new d((byte)0));
            this.b = new android.support.v7.widget.a(context);
            final android.support.v7.widget.a b = this.b;
            b.i = true;
            b.j = true;
            final android.support.v7.widget.a b2 = this.b;
            j.a c;
            if (this.c != null) {
                c = this.c;
            }
            else {
                c = new b((byte)0);
            }
            b2.f = c;
            this.a.a(this.b, this.f);
            this.b.a(this);
        }
        return (Menu)this.a;
    }
    
    public int getPopupTheme() {
        return this.g;
    }
    
    public int getWindowAnimations() {
        return 0;
    }
    
    public void onConfigurationChanged(final Configuration configuration) {
        if (Build$VERSION.SDK_INT >= 8) {
            super.onConfigurationChanged(configuration);
        }
        this.b.a(false);
        if (this.b != null && this.b.g()) {
            this.b.d();
            this.b.c();
        }
    }
    
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.b != null) {
            this.b.e();
        }
    }
    
    @Override
    protected void onLayout(final boolean b, int paddingLeft, int i, int max, int n) {
        if (!this.i) {
            super.onLayout(b, paddingLeft, i, max, n);
        }
        else {
            final int childCount = this.getChildCount();
            final int n2 = (n - i) / 2;
            final int dividerWidth = this.getDividerWidth();
            i = 0;
            n = max - paddingLeft - this.getPaddingRight() - this.getPaddingLeft();
            boolean b2 = false;
            final boolean a = android.support.v7.internal.widget.s.a((View)this);
            int n10;
            for (int j = 0; j < childCount; j = n10) {
                final View child = this.getChildAt(j);
                if (child.getVisibility() != 8) {
                    final c c = (c)child.getLayoutParams();
                    if (c.a) {
                        int measuredWidth;
                        final int n3 = measuredWidth = child.getMeasuredWidth();
                        if (this.a(j)) {
                            measuredWidth = n3 + dividerWidth;
                        }
                        final int measuredHeight = child.getMeasuredHeight();
                        int n4;
                        int n5;
                        if (a) {
                            n4 = c.leftMargin + this.getPaddingLeft();
                            n5 = n4 + measuredWidth;
                        }
                        else {
                            n5 = this.getWidth() - this.getPaddingRight() - c.rightMargin;
                            n4 = n5 - measuredWidth;
                        }
                        final int n6 = n2 - measuredHeight / 2;
                        child.layout(n4, n6, n5, measuredHeight + n6);
                        final int n7 = n - measuredWidth;
                        b2 = true;
                        n = i;
                        i = n7;
                    }
                    else {
                        final int n8 = n - (c.rightMargin + (child.getMeasuredWidth() + c.leftMargin));
                        this.a(j);
                        n = i + 1;
                        i = n8;
                    }
                }
                else {
                    final int n9 = n;
                    n = i;
                    i = n9;
                }
                n10 = j + 1;
                final int n11 = n;
                n = i;
                i = n11;
            }
            if (childCount == 1 && !b2) {
                final View child2 = this.getChildAt(0);
                n = child2.getMeasuredWidth();
                i = child2.getMeasuredHeight();
                paddingLeft = (max - paddingLeft) / 2 - n / 2;
                max = n2 - i / 2;
                child2.layout(paddingLeft, max, n + paddingLeft, i + max);
            }
            else {
                if (b2) {
                    paddingLeft = 0;
                }
                else {
                    paddingLeft = 1;
                }
                paddingLeft = i - paddingLeft;
                if (paddingLeft > 0) {
                    paddingLeft = n / paddingLeft;
                }
                else {
                    paddingLeft = 0;
                }
                max = Math.max(0, paddingLeft);
                if (a) {
                    paddingLeft = this.getWidth() - this.getPaddingRight();
                    View child3;
                    c c2;
                    int measuredWidth2;
                    int measuredHeight2;
                    for (i = 0; i < childCount; ++i) {
                        child3 = this.getChildAt(i);
                        c2 = (c)child3.getLayoutParams();
                        if (child3.getVisibility() != 8 && !c2.a) {
                            n = paddingLeft - c2.rightMargin;
                            measuredWidth2 = child3.getMeasuredWidth();
                            measuredHeight2 = child3.getMeasuredHeight();
                            paddingLeft = n2 - measuredHeight2 / 2;
                            child3.layout(n - measuredWidth2, paddingLeft, n, measuredHeight2 + paddingLeft);
                            paddingLeft = n - (c2.leftMargin + measuredWidth2 + max);
                        }
                    }
                }
                else {
                    paddingLeft = this.getPaddingLeft();
                    View child4;
                    c c3;
                    int measuredHeight3;
                    int n12;
                    for (i = 0; i < childCount; ++i) {
                        child4 = this.getChildAt(i);
                        c3 = (c)child4.getLayoutParams();
                        if (child4.getVisibility() != 8 && !c3.a) {
                            paddingLeft += c3.leftMargin;
                            n = child4.getMeasuredWidth();
                            measuredHeight3 = child4.getMeasuredHeight();
                            n12 = n2 - measuredHeight3 / 2;
                            child4.layout(paddingLeft, n12, paddingLeft + n, measuredHeight3 + n12);
                            paddingLeft += c3.rightMargin + n + max;
                        }
                    }
                }
            }
        }
    }
    
    protected void onMeasure(int i, int k) {
        final boolean j = this.i;
        this.i = (View$MeasureSpec.getMode(i) == 1073741824);
        if (j != this.i) {
            this.j = 0;
        }
        final int size = View$MeasureSpec.getSize(i);
        if (this.i && this.a != null && size != this.j) {
            this.j = size;
            this.a.b(true);
        }
        final int childCount = this.getChildCount();
        if (this.i && childCount > 0) {
            final int mode = View$MeasureSpec.getMode(k);
            i = View$MeasureSpec.getSize(i);
            final int size2 = View$MeasureSpec.getSize(k);
            final int paddingLeft = this.getPaddingLeft();
            final int paddingRight = this.getPaddingRight();
            final int n = this.getPaddingTop() + this.getPaddingBottom();
            final int childMeasureSpec = getChildMeasureSpec(k, n, -2);
            final int n2 = i - (paddingLeft + paddingRight);
            i = n2 / this.k;
            k = this.k;
            if (i == 0) {
                this.setMeasuredDimension(n2, 0);
            }
            else {
                final int n3 = this.k + n2 % k / i;
                k = 0;
                int a = 0;
                int n4 = 0;
                int n5 = 0;
                int n6 = 0;
                long n7 = 0L;
                final int childCount2 = this.getChildCount();
                int n14;
                int n15;
                for (int l = 0; l < childCount2; ++l, n5 = i, i = n14, a = k, k = n15) {
                    final View child = this.getChildAt(l);
                    if (child.getVisibility() != 8) {
                        final boolean b = child instanceof ActionMenuItemView;
                        ++n5;
                        if (b) {
                            child.setPadding(this.l, 0, this.l, 0);
                        }
                        final c c = (c)child.getLayoutParams();
                        c.f = false;
                        c.c = 0;
                        c.b = 0;
                        c.d = false;
                        c.leftMargin = 0;
                        c.rightMargin = 0;
                        c.e = (b && ((ActionMenuItemView)child).b());
                        int n8;
                        if (c.a) {
                            n8 = 1;
                        }
                        else {
                            n8 = i;
                        }
                        final int a2 = a(child, n3, n8, childMeasureSpec, n);
                        final int max = Math.max(a, a2);
                        int n9;
                        if (c.d) {
                            n9 = n4 + 1;
                        }
                        else {
                            n9 = n4;
                        }
                        int n10;
                        if (c.a) {
                            n10 = 1;
                        }
                        else {
                            n10 = n6;
                        }
                        i -= a2;
                        final int max2 = Math.max(k, child.getMeasuredHeight());
                        if (a2 == 1) {
                            final long n11 = 1 << l;
                            k = max2;
                            final int n12 = i;
                            n4 = n9;
                            final int n13 = n10;
                            n7 |= n11;
                            i = n5;
                            n14 = n12;
                            n15 = k;
                            n6 = n13;
                            k = max;
                        }
                        else {
                            k = n5;
                            final int n16 = max;
                            final int n17 = max2;
                            final int n18 = i;
                            i = k;
                            k = n16;
                            n4 = n9;
                            n6 = n10;
                            n15 = n17;
                            n14 = n18;
                        }
                    }
                    else {
                        n15 = k;
                        n14 = i;
                        k = a;
                        i = n5;
                    }
                }
                final boolean b2 = n6 != 0 && n5 == 2;
                final int n19 = 0;
                int n20 = i;
                i = n19;
                long m;
                while (true) {
                    m = n7;
                    if (n4 <= 0) {
                        break;
                    }
                    m = n7;
                    if (n20 <= 0) {
                        break;
                    }
                    int n21 = Integer.MAX_VALUE;
                    long n22 = 0L;
                    int n23 = 0;
                    int n24 = 0;
                Label_0621_Outer:
                    while (n24 < childCount2) {
                        final c c2 = (c)this.getChildAt(n24).getLayoutParams();
                        while (true) {
                            Label_1364: {
                                if (!c2.d) {
                                    break Label_1364;
                                }
                                int b3;
                                int n25;
                                if (c2.b < n21) {
                                    b3 = c2.b;
                                    n22 = 1 << n24;
                                    n25 = 1;
                                }
                                else {
                                    if (c2.b != n21) {
                                        break Label_1364;
                                    }
                                    n22 |= 1 << n24;
                                    final int n26 = n23 + 1;
                                    b3 = n21;
                                    n25 = n26;
                                }
                                final int n27 = n24 + 1;
                                final int n28 = b3;
                                n23 = n25;
                                n21 = n28;
                                n24 = n27;
                                continue Label_0621_Outer;
                            }
                            final int n29 = n21;
                            int n25 = n23;
                            int b3 = n29;
                            continue;
                        }
                    }
                    n7 = (m = (n7 | n22));
                    if (n23 > n20) {
                        break;
                    }
                    int n30 = 0;
                    i = n20;
                    while (n30 < childCount2) {
                        final View child2 = this.getChildAt(n30);
                        final c c3 = (c)child2.getLayoutParams();
                        if (((long)(1 << n30) & n22) == 0x0L) {
                            if (c3.b == n21 + 1) {
                                n7 |= 1 << n30;
                            }
                        }
                        else {
                            if (b2 && c3.e && i == 1) {
                                child2.setPadding(this.l + n3, 0, this.l, 0);
                            }
                            ++c3.b;
                            c3.f = true;
                            --i;
                        }
                        ++n30;
                    }
                    final int n31 = 1;
                    n20 = i;
                    i = n31;
                }
                boolean b4;
                if (n6 == 0 && n5 == 1) {
                    b4 = true;
                }
                else {
                    b4 = false;
                }
                int n37 = 0;
                Label_1208: {
                    if (n20 > 0 && m != 0L && (n20 < n5 - 1 || b4 || a > 1)) {
                        float n33;
                        final float n32 = n33 = (float)Long.bitCount(m);
                        if (!b4) {
                            float n34 = n32;
                            if ((0x1L & m) != 0x0L) {
                                n34 = n32;
                                if (!((c)this.getChildAt(0).getLayoutParams()).e) {
                                    n34 = n32 - 0.5f;
                                }
                            }
                            n33 = n34;
                            if (((long)(1 << childCount2 - 1) & m) != 0x0L) {
                                n33 = n34;
                                if (!((c)this.getChildAt(childCount2 - 1).getLayoutParams()).e) {
                                    n33 = n34 - 0.5f;
                                }
                            }
                        }
                        while (true) {
                            int n35;
                            if (n33 > 0.0f) {
                                n35 = (int)(n20 * n3 / n33);
                            }
                            else {
                                n35 = 0;
                            }
                            int n36 = 0;
                        Label_1116_Outer:
                            while (true) {
                                n37 = i;
                                if (n36 < childCount2) {
                                    if (((long)(1 << n36) & m) != 0x0L) {
                                        final View child3 = this.getChildAt(n36);
                                        final c c4 = (c)child3.getLayoutParams();
                                        if (child3 instanceof ActionMenuItemView) {
                                            c4.c = n35;
                                            c4.f = true;
                                            if (n36 == 0 && !c4.e) {
                                                c4.leftMargin = -n35 / 2;
                                            }
                                            i = 1;
                                        }
                                        else if (c4.a) {
                                            c4.c = n35;
                                            c4.f = true;
                                            c4.rightMargin = -n35 / 2;
                                            i = 1;
                                        }
                                        else {
                                            if (n36 != 0) {
                                                c4.leftMargin = n35 / 2;
                                            }
                                            if (n36 != childCount2 - 1) {
                                                c4.rightMargin = n35 / 2;
                                            }
                                        }
                                    }
                                    while (true) {
                                        ++n36;
                                        continue Label_1116_Outer;
                                        continue;
                                    }
                                }
                                break Label_1208;
                            }
                            continue;
                        }
                    }
                    n37 = i;
                }
                if (n37 != 0) {
                    View child4;
                    c c5;
                    for (i = 0; i < childCount2; ++i) {
                        child4 = this.getChildAt(i);
                        c5 = (c)child4.getLayoutParams();
                        if (c5.f) {
                            child4.measure(View$MeasureSpec.makeMeasureSpec(c5.c + c5.b * n3, 1073741824), childMeasureSpec);
                        }
                    }
                }
                if (mode != 1073741824) {
                    i = k;
                }
                else {
                    i = size2;
                }
                this.setMeasuredDimension(n2, i);
            }
        }
        else {
            for (int n38 = 0; n38 < childCount; ++n38) {
                final c c6 = (c)this.getChildAt(n38).getLayoutParams();
                c6.rightMargin = 0;
                c6.leftMargin = 0;
            }
            super.onMeasure(i, k);
        }
    }
    
    public void setExpandedActionViewsExclusive(final boolean p) {
        this.b.p = p;
    }
    
    public void setOnMenuItemClickListener(final e m) {
        this.m = m;
    }
    
    public void setOverflowReserved(final boolean h) {
        this.h = h;
    }
    
    public void setPopupTheme(final int g) {
        if (this.g != g) {
            if ((this.g = g) == 0) {
                this.f = this.e;
            }
            else {
                this.f = (Context)new ContextThemeWrapper(this.e, g);
            }
        }
    }
    
    public void setPresenter(final android.support.v7.widget.a b) {
        (this.b = b).a(this);
    }
    
    public interface a
    {
        boolean c();
        
        boolean d();
    }
    
    private final class b implements j.a
    {
        @Override
        public final void a(final android.support.v7.internal.view.menu.e e, final boolean b) {
        }
        
        @Override
        public final boolean a(final android.support.v7.internal.view.menu.e e) {
            return false;
        }
    }
    
    public static final class c extends LinearLayoutCompat.a
    {
        @ViewDebug$ExportedProperty
        public boolean a;
        @ViewDebug$ExportedProperty
        public int b;
        @ViewDebug$ExportedProperty
        public int c;
        @ViewDebug$ExportedProperty
        public boolean d;
        @ViewDebug$ExportedProperty
        public boolean e;
        boolean f;
        
        public c() {
            super(-2, -2);
            this.a = false;
        }
        
        public c(final Context context, final AttributeSet set) {
            super(context, set);
        }
        
        public c(final c c) {
            super((ViewGroup$LayoutParams)c);
            this.a = c.a;
        }
        
        public c(final ViewGroup$LayoutParams viewGroup$LayoutParams) {
            super(viewGroup$LayoutParams);
        }
    }
    
    private final class d implements e.a
    {
        @Override
        public final boolean a() {
            return ActionMenuView.this.m != null && ActionMenuView.this.m.a();
        }
    }
    
    public interface e
    {
        boolean a();
    }
}
