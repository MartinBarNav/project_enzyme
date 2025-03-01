// 
// Decompiled by Procyon v0.5.36
// 

package android.support.v7.widget;

import android.support.v7.internal.view.menu.j;
import android.graphics.drawable.Drawable;
import android.view.View$OnTouchListener;
import android.util.AttributeSet;
import android.support.v7.internal.widget.TintImageView;
import android.support.v7.internal.view.menu.i;
import android.view.MenuItem;
import android.support.v7.internal.view.menu.m;
import java.util.ArrayList;
import android.support.v7.internal.view.menu.ActionMenuItemView;
import android.content.res.Resources;
import android.view.View$MeasureSpec;
import android.support.v4.view.ab;
import android.view.ViewConfiguration;
import android.os.Build$VERSION;
import android.view.ViewGroup$LayoutParams;
import android.support.v7.internal.view.menu.f;
import android.view.ViewGroup;
import android.support.v7.internal.view.menu.k;
import android.support.v7.internal.view.menu.e;
import android.content.Context;
import android.util.SparseBooleanArray;
import android.view.View;
import android.support.v4.view.d;
import android.support.v7.internal.view.menu.b;

public final class a extends android.support.v7.internal.view.menu.b implements android.support.v4.view.d.a
{
    View h;
    boolean i;
    boolean j;
    public int k;
    public int l;
    public boolean m;
    public boolean n;
    public boolean o;
    boolean p;
    e q;
    a r;
    c s;
    final f t;
    int u;
    private int v;
    private int w;
    private final SparseBooleanArray x;
    private View y;
    private b z;
    
    public a(final Context context) {
        super(context, android.support.v7.b.a.g.abc_action_menu_layout, android.support.v7.b.a.g.abc_action_menu_item_layout);
        this.x = new SparseBooleanArray();
        this.t = new f((byte)0);
    }
    
    @Override
    public final k a(final ViewGroup viewGroup) {
        final k a = super.a(viewGroup);
        ((ActionMenuView)a).setPresenter(this);
        return a;
    }
    
    @Override
    public final View a(final android.support.v7.internal.view.menu.f f, final View view, final ViewGroup viewGroup) {
        View view2 = f.getActionView();
        if (view2 == null || f.i()) {
            view2 = super.a(f, view, viewGroup);
        }
        int visibility;
        if (f.isActionViewExpanded()) {
            visibility = 8;
        }
        else {
            visibility = 0;
        }
        view2.setVisibility(visibility);
        final ActionMenuView actionMenuView = (ActionMenuView)viewGroup;
        final ViewGroup$LayoutParams layoutParams = view2.getLayoutParams();
        if (!actionMenuView.checkLayoutParams(layoutParams)) {
            view2.setLayoutParams((ViewGroup$LayoutParams)ActionMenuView.a(layoutParams));
        }
        return view2;
    }
    
    @Override
    public final void a(final Context context, final android.support.v7.internal.view.menu.e e) {
        boolean i = true;
        super.a(context, e);
        final Resources resources = context.getResources();
        final android.support.v7.internal.view.a a = android.support.v7.internal.view.a.a(context);
        if (!this.j) {
            if (Build$VERSION.SDK_INT < 19 && ab.b(ViewConfiguration.get(a.a))) {
                i = false;
            }
            this.i = i;
        }
        if (!this.o) {
            this.k = a.a.getResources().getDisplayMetrics().widthPixels / 2;
        }
        if (!this.m) {
            this.l = a.a.getResources().getInteger(android.support.v7.b.a.f.abc_max_action_buttons);
        }
        int k = this.k;
        if (this.i) {
            if (this.h == null) {
                this.h = (View)new d(this.a);
                final int measureSpec = View$MeasureSpec.makeMeasureSpec(0, 0);
                this.h.measure(measureSpec, measureSpec);
            }
            k -= this.h.getMeasuredWidth();
        }
        else {
            this.h = null;
        }
        this.v = k;
        this.w = (int)(56.0f * resources.getDisplayMetrics().density);
        this.y = null;
    }
    
    @Override
    public final void a(final android.support.v7.internal.view.menu.e e, final boolean b) {
        this.e();
        super.a(e, b);
    }
    
    @Override
    public final void a(final android.support.v7.internal.view.menu.f f, final k.a a) {
        a.a(f);
        final ActionMenuView itemInvoker = (ActionMenuView)this.g;
        final ActionMenuItemView actionMenuItemView = (ActionMenuItemView)a;
        actionMenuItemView.setItemInvoker(itemInvoker);
        if (this.z == null) {
            this.z = new b((byte)0);
        }
        actionMenuItemView.setPopupCallback((ActionMenuItemView.b)this.z);
    }
    
    public final void a(final ActionMenuView g) {
        this.g = g;
        g.a = this.c;
    }
    
    @Override
    public final void a(final boolean b) {
        final int n = 1;
        final boolean b2 = false;
        ((View)this.g).getParent();
        super.a(b);
        ((View)this.g).requestLayout();
        if (this.c != null) {
            final android.support.v7.internal.view.menu.e c = this.c;
            c.f();
            final ArrayList<android.support.v7.internal.view.menu.f> c2 = c.c;
            for (int size = c2.size(), i = 0; i < size; ++i) {
                final android.support.v4.view.d d = c2.get(i).d;
                if (d != null) {
                    d.a = (android.support.v4.view.d.a)this;
                }
            }
        }
        ArrayList<android.support.v7.internal.view.menu.f> g;
        if (this.c != null) {
            g = this.c.g();
        }
        else {
            g = null;
        }
        int n2 = b2 ? 1 : 0;
        if (this.i) {
            n2 = (b2 ? 1 : 0);
            if (g != null) {
                final int size2 = g.size();
                if (size2 == 1) {
                    if (!g.get(0).isActionViewExpanded()) {
                        n2 = 1;
                    }
                    else {
                        n2 = 0;
                    }
                }
                else if (size2 > 0) {
                    n2 = n;
                }
                else {
                    n2 = 0;
                }
            }
        }
        if (n2 != 0) {
            if (this.h == null) {
                this.h = (View)new d(this.a);
            }
            final ViewGroup viewGroup = (ViewGroup)this.h.getParent();
            if (viewGroup != this.g) {
                if (viewGroup != null) {
                    viewGroup.removeView(this.h);
                }
                ((ActionMenuView)this.g).addView(this.h, (ViewGroup$LayoutParams)ActionMenuView.a());
            }
        }
        else if (this.h != null && this.h.getParent() == this.g) {
            ((ViewGroup)this.g).removeView(this.h);
        }
        ((ActionMenuView)this.g).setOverflowReserved(this.i);
    }
    
    @Override
    public final boolean a() {
        final ArrayList<android.support.v7.internal.view.menu.f> e = this.c.e();
        final int size = e.size();
        int l = this.l;
        final int v = this.v;
        final int measureSpec = View$MeasureSpec.makeMeasureSpec(0, 0);
        final ViewGroup viewGroup = (ViewGroup)this.g;
        int n = 0;
        int n2 = 0;
        boolean b = false;
        for (int i = 0; i < size; ++i) {
            final android.support.v7.internal.view.menu.f f = e.get(i);
            if (f.h()) {
                ++n;
            }
            else if (f.g()) {
                ++n2;
            }
            else {
                b = true;
            }
            if (this.p && f.isActionViewExpanded()) {
                l = 0;
            }
        }
        int n3 = l;
        if (this.i && (b || n + n2 > (n3 = l))) {
            n3 = l - 1;
        }
        final int n4 = n3 - n;
        final SparseBooleanArray x = this.x;
        x.clear();
        int n5;
        int n6;
        if (this.n) {
            n5 = v / this.w;
            n6 = v % this.w / n5 + this.w;
        }
        else {
            n6 = 0;
            n5 = 0;
        }
        final int n7 = 0;
        int j = 0;
        int n8 = n5;
        int n9 = n4;
        int n10 = v;
        int n11 = n7;
        while (j < size) {
            final android.support.v7.internal.view.menu.f f2 = e.get(j);
            int n13;
            int n14;
            int n15;
            if (f2.h()) {
                final View a = this.a(f2, this.y, viewGroup);
                if (this.y == null) {
                    this.y = a;
                }
                int n12;
                if (this.n) {
                    n12 = n8 - ActionMenuView.a(a, n6, n8, measureSpec, 0);
                }
                else {
                    a.measure(measureSpec, measureSpec);
                    n12 = n8;
                }
                final int measuredWidth = a.getMeasuredWidth();
                if (n11 == 0) {
                    n11 = measuredWidth;
                }
                final int groupId = f2.getGroupId();
                if (groupId != 0) {
                    x.put(groupId, true);
                }
                f2.c(true);
                n13 = n10 - measuredWidth;
                n14 = n9;
                n15 = n12;
            }
            else if (f2.g()) {
                final int groupId2 = f2.getGroupId();
                final boolean value = x.get(groupId2);
                boolean b2 = (n9 > 0 || value) && n10 > 0 && (!this.n || n8 > 0);
                int n18;
                int n19;
                if (b2) {
                    final View a2 = this.a(f2, this.y, viewGroup);
                    if (this.y == null) {
                        this.y = a2;
                    }
                    if (this.n) {
                        final int a3 = ActionMenuView.a(a2, n6, n8, measureSpec, 0);
                        final int n16 = n8 -= a3;
                        if (a3 == 0) {
                            b2 = false;
                            n8 = n16;
                        }
                    }
                    else {
                        a2.measure(measureSpec, measureSpec);
                    }
                    final int measuredWidth2 = a2.getMeasuredWidth();
                    n10 -= measuredWidth2;
                    int n17;
                    if ((n17 = n11) == 0) {
                        n17 = measuredWidth2;
                    }
                    if (this.n) {
                        b2 &= (n10 >= 0);
                        n18 = n8;
                        n19 = n17;
                    }
                    else {
                        b2 &= (n10 + n17 > 0);
                        n18 = n8;
                        n19 = n17;
                    }
                }
                else {
                    final int n20 = n8;
                    n19 = n11;
                    n18 = n20;
                }
                if (b2 && groupId2 != 0) {
                    x.put(groupId2, true);
                }
                else if (value) {
                    x.put(groupId2, false);
                    int n21;
                    for (int k = 0; k < j; ++k, n9 = n21) {
                        final android.support.v7.internal.view.menu.f f3 = e.get(k);
                        n21 = n9;
                        if (f3.getGroupId() == groupId2) {
                            n21 = n9;
                            if (f3.f()) {
                                n21 = n9 + 1;
                            }
                            f3.c(false);
                        }
                    }
                }
                int n22 = n9;
                if (b2) {
                    n22 = n9 - 1;
                }
                f2.c(b2);
                final int n23 = n19;
                n13 = n10;
                n14 = n22;
                n15 = n18;
                n11 = n23;
            }
            else {
                f2.c(false);
                final int n24 = n8;
                n13 = n10;
                n14 = n9;
                n15 = n24;
            }
            final int n25 = j + 1;
            final int n26 = n13;
            final int n27 = n14;
            n8 = n15;
            n10 = n26;
            n9 = n27;
            j = n25;
        }
        return true;
    }
    
    @Override
    public final boolean a(final android.support.v7.internal.view.menu.f f) {
        return f.f();
    }
    
    @Override
    public final boolean a(final m m) {
        if (m.hasVisibleItems()) {
            m i;
            for (i = m; i.i != this.c; i = (m)i.i) {}
            final MenuItem item = i.getItem();
            final ViewGroup viewGroup = (ViewGroup)this.g;
        Label_0101:
            while (true) {
                if (viewGroup != null) {
                    for (int childCount = viewGroup.getChildCount(), j = 0; j < childCount; ++j) {
                        final View child = viewGroup.getChildAt(j);
                        if (child instanceof k.a && ((k.a)child).getItemData() == item) {
                            break Label_0101;
                        }
                    }
                }
                Label_0126: {
                    break Label_0126;
                    final View child;
                    View h;
                    if ((h = child) == null) {
                        if (this.h == null) {
                            return false;
                        }
                        h = this.h;
                    }
                    this.u = m.getItem().getItemId();
                    this.r = new a(this.b, m);
                    this.r.b = h;
                    if (!this.r.b()) {
                        throw new IllegalStateException("MenuPopupHelper cannot be used without an anchor");
                    }
                    super.a(m);
                    return true;
                }
                final View child = null;
                continue Label_0101;
            }
        }
        return false;
    }
    
    @Override
    public final boolean a(final ViewGroup viewGroup, final int n) {
        return viewGroup.getChildAt(n) != this.h && super.a(viewGroup, n);
    }
    
    public final void b() {
        if (!this.m) {
            this.l = this.b.getResources().getInteger(android.support.v7.b.a.f.abc_max_action_buttons);
        }
        if (this.c != null) {
            this.c.b(true);
        }
    }
    
    public final boolean c() {
        boolean b;
        if (this.i && !this.g() && this.c != null && this.g != null && this.s == null && !this.c.g().isEmpty()) {
            this.s = new c(new e(this.b, this.c, this.h));
            ((View)this.g).post((Runnable)this.s);
            super.a((m)null);
            b = true;
        }
        else {
            b = false;
        }
        return b;
    }
    
    public final boolean d() {
        boolean b;
        if (this.s != null && this.g != null) {
            ((View)this.g).removeCallbacks((Runnable)this.s);
            this.s = null;
            b = true;
        }
        else {
            final e q = this.q;
            if (q != null) {
                q.c();
                b = true;
            }
            else {
                b = false;
            }
        }
        return b;
    }
    
    public final boolean e() {
        return this.d() | this.f();
    }
    
    public final boolean f() {
        boolean b;
        if (this.r != null) {
            this.r.c();
            b = true;
        }
        else {
            b = false;
        }
        return b;
    }
    
    public final boolean g() {
        return this.q != null && this.q.d();
    }
    
    private final class a extends i
    {
        private m h;
        
        public a(final Context context, final m h) {
            final boolean b = false;
            super(context, h, null, false, android.support.v7.b.a.a.actionOverflowMenuStyle);
            this.h = h;
            if (!((android.support.v7.internal.view.menu.f)h.getItem()).f()) {
                View h2;
                if (android.support.v7.widget.a.this.h == null) {
                    h2 = (View)android.support.v7.widget.a.this.g;
                }
                else {
                    h2 = android.support.v7.widget.a.this.h;
                }
                super.b = h2;
            }
            super.d = android.support.v7.widget.a.this.t;
            final int size = h.size();
            int n = 0;
            boolean e;
            while (true) {
                e = b;
                if (n >= size) {
                    break;
                }
                final MenuItem item = h.getItem(n);
                if (item.isVisible() && item.getIcon() != null) {
                    e = true;
                    break;
                }
                ++n;
            }
            super.e = e;
        }
        
        @Override
        public final void onDismiss() {
            super.onDismiss();
            android.support.v7.widget.a.this.r = null;
            android.support.v7.widget.a.this.u = 0;
        }
    }
    
    private final class b extends ActionMenuItemView.b
    {
        @Override
        public final android.support.v7.widget.b a() {
            android.support.v7.widget.b c;
            if (android.support.v7.widget.a.this.r != null) {
                c = android.support.v7.widget.a.this.r.c;
            }
            else {
                c = null;
            }
            return c;
        }
    }
    
    private final class c implements Runnable
    {
        private e b;
        
        public c(final e b) {
            this.b = b;
        }
        
        @Override
        public final void run() {
            final View view = (View)android.support.v7.widget.a.this.g;
            if (view != null && view.getWindowToken() != null && this.b.b()) {
                android.support.v7.widget.a.this.q = this.b;
            }
            android.support.v7.widget.a.this.s = null;
        }
    }
    
    private final class d extends TintImageView implements ActionMenuView.a
    {
        private final float[] b;
        
        public d(final Context context) {
            super(context, null, android.support.v7.b.a.a.actionOverflowButtonStyle);
            this.b = new float[2];
            this.setClickable(true);
            this.setFocusable(true);
            this.setVisibility(0);
            this.setEnabled(true);
            this.setOnTouchListener((View$OnTouchListener)new b.b(this) {
                @Override
                public final b a() {
                    b c;
                    if (android.support.v7.widget.a.this.q == null) {
                        c = null;
                    }
                    else {
                        c = android.support.v7.widget.a.this.q.c;
                    }
                    return c;
                }
                
                @Override
                public final boolean b() {
                    android.support.v7.widget.a.this.c();
                    return true;
                }
                
                @Override
                public final boolean c() {
                    boolean b;
                    if (android.support.v7.widget.a.this.s != null) {
                        b = false;
                    }
                    else {
                        android.support.v7.widget.a.this.d();
                        b = true;
                    }
                    return b;
                }
            });
        }
        
        @Override
        public final boolean c() {
            return false;
        }
        
        @Override
        public final boolean d() {
            return false;
        }
        
        public final boolean performClick() {
            if (!super.performClick()) {
                this.playSoundEffect(0);
                android.support.v7.widget.a.this.c();
            }
            return true;
        }
        
        protected final boolean setFrame(int n, final int n2, final int n3, final int n4) {
            final boolean setFrame = super.setFrame(n, n2, n3, n4);
            final Drawable drawable = this.getDrawable();
            final Drawable background = this.getBackground();
            if (drawable != null && background != null) {
                final float[] b = this.b;
                b[0] = (float)drawable.getBounds().centerX();
                this.getImageMatrix().mapPoints(b);
                n = (int)b[0] - this.getWidth() / 2;
                android.support.v4.a.a.a.a(background, n, 0, this.getWidth() + n, this.getHeight());
            }
            return setFrame;
        }
    }
    
    private final class e extends i
    {
        public e(final Context context, final android.support.v7.internal.view.menu.e e, final View view) {
            super(context, e, view, true, a.a.actionOverflowMenuStyle);
            super.f = 8388613;
            super.d = a.this.t;
        }
        
        @Override
        public final void onDismiss() {
            super.onDismiss();
            a.this.c.close();
            a.this.q = null;
        }
    }
    
    private final class f implements j.a
    {
        @Override
        public final void a(final android.support.v7.internal.view.menu.e e, final boolean b) {
            if (e instanceof m) {
                ((m)e).i.a(false);
            }
            final j.a f = android.support.v7.widget.a.this.f;
            if (f != null) {
                f.a(e, b);
            }
        }
        
        @Override
        public final boolean a(final android.support.v7.internal.view.menu.e e) {
            boolean b;
            if (e == null) {
                b = false;
            }
            else {
                android.support.v7.widget.a.this.u = ((m)e).getItem().getItemId();
                final j.a f = android.support.v7.widget.a.this.f;
                b = (f != null && f.a(e));
            }
            return b;
        }
    }
}
