package android.support.v7.widget;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.support.v4.view.ab;
import android.support.v4.view.d;
import android.support.v7.b.a;
import android.support.v7.internal.view.menu.ActionMenuItemView;
import android.support.v7.internal.view.menu.i;
import android.support.v7.internal.view.menu.j;
import android.support.v7.internal.view.menu.k;
import android.support.v7.internal.view.menu.m;
import android.support.v7.internal.widget.TintImageView;
import android.support.v7.widget.ActionMenuView;
import android.support.v7.widget.b;
import android.util.AttributeSet;
import android.util.SparseBooleanArray;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import java.util.ArrayList;

public final class a extends android.support.v7.internal.view.menu.b implements d.a {
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
    C0015a r;
    c s;
    final f t = new f(this, (byte) 0);
    int u;
    private int v;
    private int w;
    private final SparseBooleanArray x = new SparseBooleanArray();
    private View y;
    private b z;

    public a(Context context) {
        super(context, a.g.abc_action_menu_layout, a.g.abc_action_menu_item_layout);
    }

    public final void a(Context context, android.support.v7.internal.view.menu.e eVar) {
        boolean z2 = true;
        super.a(context, eVar);
        Resources resources = context.getResources();
        android.support.v7.internal.view.a a = android.support.v7.internal.view.a.a(context);
        if (!this.j) {
            if (Build.VERSION.SDK_INT < 19 && ab.b(ViewConfiguration.get(a.a))) {
                z2 = false;
            }
            this.i = z2;
        }
        if (!this.o) {
            this.k = a.a.getResources().getDisplayMetrics().widthPixels / 2;
        }
        if (!this.m) {
            this.l = a.a.getResources().getInteger(a.f.abc_max_action_buttons);
        }
        int i2 = this.k;
        if (this.i) {
            if (this.h == null) {
                this.h = new d(this.a);
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
                this.h.measure(makeMeasureSpec, makeMeasureSpec);
            }
            i2 -= this.h.getMeasuredWidth();
        } else {
            this.h = null;
        }
        this.v = i2;
        this.w = (int) (56.0f * resources.getDisplayMetrics().density);
        this.y = null;
    }

    public final void b() {
        if (!this.m) {
            this.l = this.b.getResources().getInteger(a.f.abc_max_action_buttons);
        }
        if (this.c != null) {
            this.c.b(true);
        }
    }

    public final k a(ViewGroup viewGroup) {
        k a = super.a(viewGroup);
        ((ActionMenuView) a).setPresenter(this);
        return a;
    }

    public final View a(android.support.v7.internal.view.menu.f fVar, View view, ViewGroup viewGroup) {
        View actionView = fVar.getActionView();
        if (actionView == null || fVar.i()) {
            actionView = super.a(fVar, view, viewGroup);
        }
        actionView.setVisibility(fVar.isActionViewExpanded() ? 8 : 0);
        ViewGroup.LayoutParams layoutParams = actionView.getLayoutParams();
        if (!((ActionMenuView) viewGroup).checkLayoutParams(layoutParams)) {
            actionView.setLayoutParams(ActionMenuView.a(layoutParams));
        }
        return actionView;
    }

    public final void a(android.support.v7.internal.view.menu.f fVar, k.a aVar) {
        aVar.a(fVar);
        ActionMenuItemView actionMenuItemView = (ActionMenuItemView) aVar;
        actionMenuItemView.setItemInvoker((ActionMenuView) this.g);
        if (this.z == null) {
            this.z = new b(this, (byte) 0);
        }
        actionMenuItemView.setPopupCallback(this.z);
    }

    public final boolean a(android.support.v7.internal.view.menu.f fVar) {
        return fVar.f();
    }

    public final void a(boolean z2) {
        boolean z3;
        boolean z4 = true;
        boolean z5 = false;
        ((View) this.g).getParent();
        super.a(z2);
        ((View) this.g).requestLayout();
        if (this.c != null) {
            android.support.v7.internal.view.menu.e eVar = this.c;
            eVar.f();
            ArrayList<android.support.v7.internal.view.menu.f> arrayList = eVar.c;
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                android.support.v4.view.d dVar = arrayList.get(i2).d;
                if (dVar != null) {
                    dVar.a = this;
                }
            }
        }
        ArrayList<android.support.v7.internal.view.menu.f> g = this.c != null ? this.c.g() : null;
        if (this.i && g != null) {
            int size2 = g.size();
            if (size2 == 1) {
                if (!g.get(0).isActionViewExpanded()) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                z5 = z3;
            } else {
                if (size2 <= 0) {
                    z4 = false;
                }
                z5 = z4;
            }
        }
        if (z5) {
            if (this.h == null) {
                this.h = new d(this.a);
            }
            ViewGroup viewGroup = (ViewGroup) this.h.getParent();
            if (viewGroup != this.g) {
                if (viewGroup != null) {
                    viewGroup.removeView(this.h);
                }
                ((ActionMenuView) this.g).addView(this.h, ActionMenuView.a());
            }
        } else if (this.h != null && this.h.getParent() == this.g) {
            ((ViewGroup) this.g).removeView(this.h);
        }
        ((ActionMenuView) this.g).setOverflowReserved(this.i);
    }

    public final boolean a(ViewGroup viewGroup, int i2) {
        if (viewGroup.getChildAt(i2) == this.h) {
            return false;
        }
        return super.a(viewGroup, i2);
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x003a  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0067  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x006f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean a(android.support.v7.internal.view.menu.m r8) {
        /*
            r7 = this;
            r3 = 0
            boolean r0 = r8.hasVisibleItems()
            if (r0 != 0) goto L_0x0009
            r0 = r3
        L_0x0008:
            return r0
        L_0x0009:
            r0 = r8
        L_0x000a:
            android.support.v7.internal.view.menu.e r1 = r0.i
            android.support.v7.internal.view.menu.e r2 = r7.c
            if (r1 == r2) goto L_0x0015
            android.support.v7.internal.view.menu.e r0 = r0.i
            android.support.v7.internal.view.menu.m r0 = (android.support.v7.internal.view.menu.m) r0
            goto L_0x000a
        L_0x0015:
            android.view.MenuItem r5 = r0.getItem()
            android.support.v7.internal.view.menu.k r0 = r7.g
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            if (r0 == 0) goto L_0x0044
            int r6 = r0.getChildCount()
            r4 = r3
        L_0x0024:
            if (r4 >= r6) goto L_0x0044
            android.view.View r2 = r0.getChildAt(r4)
            boolean r1 = r2 instanceof android.support.v7.internal.view.menu.k.a
            if (r1 == 0) goto L_0x0040
            r1 = r2
            android.support.v7.internal.view.menu.k$a r1 = (android.support.v7.internal.view.menu.k.a) r1
            android.support.v7.internal.view.menu.f r1 = r1.getItemData()
            if (r1 != r5) goto L_0x0040
            r0 = r2
        L_0x0038:
            if (r0 != 0) goto L_0x0048
            android.view.View r0 = r7.h
            if (r0 != 0) goto L_0x0046
            r0 = r3
            goto L_0x0008
        L_0x0040:
            int r1 = r4 + 1
            r4 = r1
            goto L_0x0024
        L_0x0044:
            r0 = 0
            goto L_0x0038
        L_0x0046:
            android.view.View r0 = r7.h
        L_0x0048:
            android.view.MenuItem r1 = r8.getItem()
            int r1 = r1.getItemId()
            r7.u = r1
            android.support.v7.widget.a$a r1 = new android.support.v7.widget.a$a
            android.content.Context r2 = r7.b
            r1.<init>(r7, r2, r8)
            r7.r = r1
            android.support.v7.widget.a$a r1 = r7.r
            r1.b = r0
            android.support.v7.widget.a$a r0 = r7.r
            boolean r0 = r0.b()
            if (r0 != 0) goto L_0x006f
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "MenuPopupHelper cannot be used without an anchor"
            r0.<init>(r1)
            throw r0
        L_0x006f:
            super.a((android.support.v7.internal.view.menu.m) r8)
            r0 = 1
            goto L_0x0008
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.widget.a.a(android.support.v7.internal.view.menu.m):boolean");
    }

    public final boolean c() {
        if (!this.i || g() || this.c == null || this.g == null || this.s != null || this.c.g().isEmpty()) {
            return false;
        }
        this.s = new c(new e(this.b, this.c, this.h));
        ((View) this.g).post(this.s);
        super.a((m) null);
        return true;
    }

    public final boolean d() {
        if (this.s == null || this.g == null) {
            e eVar = this.q;
            if (eVar == null) {
                return false;
            }
            eVar.c();
            return true;
        }
        ((View) this.g).removeCallbacks(this.s);
        this.s = null;
        return true;
    }

    public final boolean e() {
        return d() | f();
    }

    public final boolean f() {
        if (this.r == null) {
            return false;
        }
        this.r.c();
        return true;
    }

    public final boolean g() {
        return this.q != null && this.q.d();
    }

    public final boolean a() {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        boolean z2;
        int i8;
        int i9;
        int i10;
        ArrayList<android.support.v7.internal.view.menu.f> e2 = this.c.e();
        int size = e2.size();
        int i11 = this.l;
        int i12 = this.v;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        ViewGroup viewGroup = (ViewGroup) this.g;
        int i13 = 0;
        int i14 = 0;
        boolean z3 = false;
        int i15 = 0;
        while (i15 < size) {
            android.support.v7.internal.view.menu.f fVar = e2.get(i15);
            if (fVar.h()) {
                i13++;
            } else if (fVar.g()) {
                i14++;
            } else {
                z3 = true;
            }
            if (!this.p || !fVar.isActionViewExpanded()) {
                i10 = i11;
            } else {
                i10 = 0;
            }
            i15++;
            i11 = i10;
        }
        if (this.i && (z3 || i13 + i14 > i11)) {
            i11--;
        }
        int i16 = i11 - i13;
        SparseBooleanArray sparseBooleanArray = this.x;
        sparseBooleanArray.clear();
        if (this.n) {
            int i17 = i12 / this.w;
            i2 = ((i12 % this.w) / i17) + this.w;
            i3 = i17;
        } else {
            i2 = 0;
            i3 = 0;
        }
        int i18 = 0;
        int i19 = 0;
        int i20 = i3;
        while (i19 < size) {
            android.support.v7.internal.view.menu.f fVar2 = e2.get(i19);
            if (fVar2.h()) {
                View a = a(fVar2, this.y, viewGroup);
                if (this.y == null) {
                    this.y = a;
                }
                if (this.n) {
                    i4 = i20 - ActionMenuView.a(a, i2, i20, makeMeasureSpec, 0);
                } else {
                    a.measure(makeMeasureSpec, makeMeasureSpec);
                    i4 = i20;
                }
                i6 = a.getMeasuredWidth();
                int i21 = i12 - i6;
                if (i18 != 0) {
                    i6 = i18;
                }
                int groupId = fVar2.getGroupId();
                if (groupId != 0) {
                    sparseBooleanArray.put(groupId, true);
                }
                fVar2.c(true);
                i5 = i21;
                i7 = i16;
            } else if (fVar2.g()) {
                int groupId2 = fVar2.getGroupId();
                boolean z4 = sparseBooleanArray.get(groupId2);
                boolean z5 = (i16 > 0 || z4) && i12 > 0 && (!this.n || i20 > 0);
                if (z5) {
                    View a2 = a(fVar2, this.y, viewGroup);
                    if (this.y == null) {
                        this.y = a2;
                    }
                    if (this.n) {
                        int a3 = ActionMenuView.a(a2, i2, i20, makeMeasureSpec, 0);
                        i20 -= a3;
                        if (a3 == 0) {
                            z5 = false;
                        }
                    } else {
                        a2.measure(makeMeasureSpec, makeMeasureSpec);
                    }
                    int measuredWidth = a2.getMeasuredWidth();
                    i12 -= measuredWidth;
                    if (i18 == 0) {
                        i18 = measuredWidth;
                    }
                    if (this.n) {
                        z2 = z5 & (i12 >= 0);
                        i8 = i20;
                    } else {
                        z2 = z5 & (i12 + i18 > 0);
                        i8 = i20;
                    }
                } else {
                    z2 = z5;
                    i8 = i20;
                }
                if (z2 && groupId2 != 0) {
                    sparseBooleanArray.put(groupId2, true);
                    i9 = i16;
                } else if (z4) {
                    sparseBooleanArray.put(groupId2, false);
                    int i22 = i16;
                    for (int i23 = 0; i23 < i19; i23++) {
                        android.support.v7.internal.view.menu.f fVar3 = e2.get(i23);
                        if (fVar3.getGroupId() == groupId2) {
                            if (fVar3.f()) {
                                i22++;
                            }
                            fVar3.c(false);
                        }
                    }
                    i9 = i22;
                } else {
                    i9 = i16;
                }
                if (z2) {
                    i9--;
                }
                fVar2.c(z2);
                i6 = i18;
                i5 = i12;
                i7 = i9;
                i4 = i8;
            } else {
                fVar2.c(false);
                i4 = i20;
                i5 = i12;
                i6 = i18;
                i7 = i16;
            }
            i19++;
            i12 = i5;
            i16 = i7;
            i18 = i6;
            i20 = i4;
        }
        return true;
    }

    public final void a(android.support.v7.internal.view.menu.e eVar, boolean z2) {
        e();
        super.a(eVar, z2);
    }

    public final void a(ActionMenuView actionMenuView) {
        this.g = actionMenuView;
        actionMenuView.a = this.c;
    }

    private class d extends TintImageView implements ActionMenuView.a {
        private final float[] b = new float[2];

        public d(Context context) {
            super(context, (AttributeSet) null, a.C0011a.actionOverflowButtonStyle);
            setClickable(true);
            setFocusable(true);
            setVisibility(0);
            setEnabled(true);
            setOnTouchListener(new b.C0016b(this, a.this) {
                public final b a() {
                    if (a.this.q == null) {
                        return null;
                    }
                    return a.this.q.c;
                }

                public final boolean b() {
                    a.this.c();
                    return true;
                }

                public final boolean c() {
                    if (a.this.s != null) {
                        return false;
                    }
                    a.this.d();
                    return true;
                }
            });
        }

        public final boolean performClick() {
            if (!super.performClick()) {
                playSoundEffect(0);
                a.this.c();
            }
            return true;
        }

        public final boolean c() {
            return false;
        }

        public final boolean d() {
            return false;
        }

        /* access modifiers changed from: protected */
        public final boolean setFrame(int i, int i2, int i3, int i4) {
            boolean frame = super.setFrame(i, i2, i3, i4);
            Drawable drawable = getDrawable();
            Drawable background = getBackground();
            if (!(drawable == null || background == null)) {
                float[] fArr = this.b;
                fArr[0] = (float) drawable.getBounds().centerX();
                getImageMatrix().mapPoints(fArr);
                int width = ((int) fArr[0]) - (getWidth() / 2);
                android.support.v4.a.a.a.a(background, width, 0, getWidth() + width, getHeight());
            }
            return frame;
        }
    }

    private class e extends i {
        public e(Context context, android.support.v7.internal.view.menu.e eVar, View view) {
            super(context, eVar, view, true, a.C0011a.actionOverflowMenuStyle);
            this.f = 8388613;
            this.d = a.this.t;
        }

        public final void onDismiss() {
            super.onDismiss();
            a.this.c.close();
            a.this.q = null;
        }
    }

    /* renamed from: android.support.v7.widget.a$a  reason: collision with other inner class name */
    private class C0015a extends i {
        final /* synthetic */ a g;
        private m h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C0015a(a aVar, Context context, m mVar) {
            super(context, mVar, (View) null, false, a.C0011a.actionOverflowMenuStyle);
            View view;
            boolean z = false;
            this.g = aVar;
            this.h = mVar;
            if (!((android.support.v7.internal.view.menu.f) mVar.getItem()).f()) {
                if (aVar.h == null) {
                    view = (View) aVar.g;
                } else {
                    view = aVar.h;
                }
                this.b = view;
            }
            this.d = aVar.t;
            int size = mVar.size();
            int i = 0;
            while (true) {
                if (i >= size) {
                    break;
                }
                MenuItem item = mVar.getItem(i);
                if (item.isVisible() && item.getIcon() != null) {
                    z = true;
                    break;
                }
                i++;
            }
            this.e = z;
        }

        public final void onDismiss() {
            super.onDismiss();
            this.g.r = null;
            this.g.u = 0;
        }
    }

    private class f implements j.a {
        private f() {
        }

        /* synthetic */ f(a aVar, byte b) {
            this();
        }

        public final boolean a(android.support.v7.internal.view.menu.e eVar) {
            if (eVar == null) {
                return false;
            }
            a.this.u = ((m) eVar).getItem().getItemId();
            j.a aVar = a.this.f;
            if (aVar != null) {
                return aVar.a(eVar);
            }
            return false;
        }

        public final void a(android.support.v7.internal.view.menu.e eVar, boolean z) {
            if (eVar instanceof m) {
                ((m) eVar).i.a(false);
            }
            j.a aVar = a.this.f;
            if (aVar != null) {
                aVar.a(eVar, z);
            }
        }
    }

    private class c implements Runnable {
        private e b;

        public c(e eVar) {
            this.b = eVar;
        }

        public final void run() {
            View view = (View) a.this.g;
            if (!(view == null || view.getWindowToken() == null || !this.b.b())) {
                a.this.q = this.b;
            }
            a.this.s = null;
        }
    }

    private class b extends ActionMenuItemView.b {
        private b() {
        }

        /* synthetic */ b(a aVar, byte b) {
            this();
        }

        public final b a() {
            if (a.this.r != null) {
                return a.this.r.c;
            }
            return null;
        }
    }
}
