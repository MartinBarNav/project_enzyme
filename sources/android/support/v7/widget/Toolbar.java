package android.support.v7.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.view.i;
import android.support.v4.view.k;
import android.support.v4.view.n;
import android.support.v4.view.u;
import android.support.v7.a.a;
import android.support.v7.b.a;
import android.support.v7.internal.view.menu.e;
import android.support.v7.internal.view.menu.f;
import android.support.v7.internal.view.menu.j;
import android.support.v7.internal.view.menu.m;
import android.support.v7.internal.widget.h;
import android.support.v7.internal.widget.l;
import android.support.v7.internal.widget.o;
import android.support.v7.internal.widget.r;
import android.support.v7.internal.widget.s;
import android.support.v7.widget.ActionMenuView;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.List;

public class Toolbar extends ViewGroup {
    private boolean A;
    private final ArrayList<View> B;
    private final int[] C;
    /* access modifiers changed from: private */
    public c D;
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
    /* access modifiers changed from: private */
    public ImageButton m;
    private Context n;
    private int o;
    /* access modifiers changed from: private */
    public int p;
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

    public interface c {
        boolean a();
    }

    /* access modifiers changed from: protected */
    public /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return a(layoutParams);
    }

    public Toolbar(Context context) {
        this(context, (AttributeSet) null);
    }

    public Toolbar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, a.C0011a.toolbarStyle);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public Toolbar(android.content.Context r9, android.util.AttributeSet r10, int r11) {
        /*
            r8 = this;
            r4 = -1
            r7 = -2147483648(0xffffffff80000000, float:-0.0)
            r6 = 0
            int[] r0 = android.support.v7.b.a.i.Toolbar
            android.content.res.TypedArray r1 = r9.obtainStyledAttributes(r10, r0, r11, r6)
            int r0 = android.support.v7.b.a.i.Toolbar_theme
            int r2 = r1.getResourceId(r0, r6)
            if (r2 == 0) goto L_0x0018
            android.view.ContextThemeWrapper r0 = new android.view.ContextThemeWrapper
            r0.<init>(r9, r2)
            r9 = r0
        L_0x0018:
            r1.recycle()
            r8.<init>(r9, r10, r11)
            android.support.v7.internal.widget.l r0 = new android.support.v7.internal.widget.l
            r0.<init>()
            r8.g = r0
            r0 = 8388627(0x800013, float:1.175497E-38)
            r8.v = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r8.B = r0
            r0 = 2
            int[] r0 = new int[r0]
            r8.C = r0
            android.support.v7.widget.Toolbar$1 r0 = new android.support.v7.widget.Toolbar$1
            r0.<init>()
            r8.E = r0
            android.support.v7.widget.Toolbar$2 r0 = new android.support.v7.widget.Toolbar$2
            r0.<init>()
            r8.K = r0
            android.content.Context r0 = r8.getContext()
            int[] r1 = android.support.v7.b.a.i.Toolbar
            android.support.v7.internal.widget.q r0 = android.support.v7.internal.widget.q.a(r0, r10, r1, r11)
            int r1 = android.support.v7.b.a.i.Toolbar_titleTextAppearance
            int r1 = r0.e(r1, r6)
            r8.e = r1
            int r1 = android.support.v7.b.a.i.Toolbar_subtitleTextAppearance
            int r1 = r0.e(r1, r6)
            r8.f = r1
            int r1 = android.support.v7.b.a.i.Toolbar_android_gravity
            int r2 = r8.v
            android.content.res.TypedArray r3 = r0.a
            int r1 = r3.getInteger(r1, r2)
            r8.v = r1
            r1 = 48
            r8.p = r1
            int r1 = android.support.v7.b.a.i.Toolbar_titleMargins
            int r1 = r0.b(r1, r6)
            r8.u = r1
            r8.t = r1
            r8.s = r1
            r8.r = r1
            int r1 = android.support.v7.b.a.i.Toolbar_titleMarginStart
            int r1 = r0.b(r1, r4)
            if (r1 < 0) goto L_0x0086
            r8.r = r1
        L_0x0086:
            int r1 = android.support.v7.b.a.i.Toolbar_titleMarginEnd
            int r1 = r0.b(r1, r4)
            if (r1 < 0) goto L_0x0090
            r8.s = r1
        L_0x0090:
            int r1 = android.support.v7.b.a.i.Toolbar_titleMarginTop
            int r1 = r0.b(r1, r4)
            if (r1 < 0) goto L_0x009a
            r8.t = r1
        L_0x009a:
            int r1 = android.support.v7.b.a.i.Toolbar_titleMarginBottom
            int r1 = r0.b(r1, r4)
            if (r1 < 0) goto L_0x00a4
            r8.u = r1
        L_0x00a4:
            int r1 = android.support.v7.b.a.i.Toolbar_maxButtonHeight
            int r1 = r0.c(r1, r4)
            r8.q = r1
            int r1 = android.support.v7.b.a.i.Toolbar_contentInsetStart
            int r1 = r0.b(r1, r7)
            int r2 = android.support.v7.b.a.i.Toolbar_contentInsetEnd
            int r2 = r0.b(r2, r7)
            int r3 = android.support.v7.b.a.i.Toolbar_contentInsetLeft
            int r3 = r0.c(r3, r6)
            int r4 = android.support.v7.b.a.i.Toolbar_contentInsetRight
            int r4 = r0.c(r4, r6)
            android.support.v7.internal.widget.l r5 = r8.g
            r5.h = r6
            if (r3 == r7) goto L_0x00ce
            r5.e = r3
            r5.a = r3
        L_0x00ce:
            if (r4 == r7) goto L_0x00d4
            r5.f = r4
            r5.b = r4
        L_0x00d4:
            if (r1 != r7) goto L_0x00d8
            if (r2 == r7) goto L_0x00dd
        L_0x00d8:
            android.support.v7.internal.widget.l r3 = r8.g
            r3.a(r1, r2)
        L_0x00dd:
            int r1 = android.support.v7.b.a.i.Toolbar_collapseIcon
            android.graphics.drawable.Drawable r1 = r0.a(r1)
            r8.k = r1
            int r1 = android.support.v7.b.a.i.Toolbar_collapseContentDescription
            java.lang.CharSequence r1 = r0.b(r1)
            r8.l = r1
            int r1 = android.support.v7.b.a.i.Toolbar_title
            java.lang.CharSequence r1 = r0.b(r1)
            boolean r2 = android.text.TextUtils.isEmpty(r1)
            if (r2 != 0) goto L_0x00fc
            r8.setTitle((java.lang.CharSequence) r1)
        L_0x00fc:
            int r1 = android.support.v7.b.a.i.Toolbar_subtitle
            java.lang.CharSequence r1 = r0.b(r1)
            boolean r2 = android.text.TextUtils.isEmpty(r1)
            if (r2 != 0) goto L_0x010b
            r8.setSubtitle((java.lang.CharSequence) r1)
        L_0x010b:
            android.content.Context r1 = r8.getContext()
            r8.n = r1
            int r1 = android.support.v7.b.a.i.Toolbar_popupTheme
            int r1 = r0.e(r1, r6)
            r8.setPopupTheme(r1)
            int r1 = android.support.v7.b.a.i.Toolbar_navigationIcon
            android.graphics.drawable.Drawable r1 = r0.a(r1)
            if (r1 == 0) goto L_0x0125
            r8.setNavigationIcon((android.graphics.drawable.Drawable) r1)
        L_0x0125:
            int r1 = android.support.v7.b.a.i.Toolbar_navigationContentDescription
            java.lang.CharSequence r1 = r0.b(r1)
            boolean r2 = android.text.TextUtils.isEmpty(r1)
            if (r2 != 0) goto L_0x0134
            r8.setNavigationContentDescription((java.lang.CharSequence) r1)
        L_0x0134:
            int r1 = android.support.v7.b.a.i.Toolbar_android_minHeight
            int r1 = r0.c(r1, r6)
            r8.J = r1
            android.content.res.TypedArray r1 = r0.a
            r1.recycle()
            android.support.v7.internal.widget.o r0 = r0.a()
            r8.L = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.widget.Toolbar.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }

    public void setPopupTheme(int i2) {
        if (this.o != i2) {
            this.o = i2;
            if (i2 == 0) {
                this.n = getContext();
            } else {
                this.n = new ContextThemeWrapper(getContext(), i2);
            }
        }
    }

    public int getPopupTheme() {
        return this.o;
    }

    public void onRtlPropertiesChanged(int i2) {
        boolean z2 = true;
        if (Build.VERSION.SDK_INT >= 17) {
            super.onRtlPropertiesChanged(i2);
        }
        l lVar = this.g;
        if (i2 != 1) {
            z2 = false;
        }
        if (z2 != lVar.g) {
            lVar.g = z2;
            if (!lVar.h) {
                lVar.a = lVar.e;
                lVar.b = lVar.f;
            } else if (z2) {
                lVar.a = lVar.d != Integer.MIN_VALUE ? lVar.d : lVar.e;
                lVar.b = lVar.c != Integer.MIN_VALUE ? lVar.c : lVar.f;
            } else {
                lVar.a = lVar.c != Integer.MIN_VALUE ? lVar.c : lVar.e;
                lVar.b = lVar.d != Integer.MIN_VALUE ? lVar.d : lVar.f;
            }
        }
    }

    public void setLogo(int i2) {
        setLogo(this.L.a(i2));
    }

    public void setLogo(Drawable drawable) {
        if (drawable != null) {
            b();
            if (this.j.getParent() == null) {
                a((View) this.j);
                e(this.j);
            }
        } else if (!(this.j == null || this.j.getParent() == null)) {
            removeView(this.j);
        }
        if (this.j != null) {
            this.j.setImageDrawable(drawable);
        }
    }

    public Drawable getLogo() {
        if (this.j != null) {
            return this.j.getDrawable();
        }
        return null;
    }

    public void setLogoDescription(int i2) {
        setLogoDescription(getContext().getText(i2));
    }

    public void setLogoDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            b();
        }
        if (this.j != null) {
            this.j.setContentDescription(charSequence);
        }
    }

    public CharSequence getLogoDescription() {
        if (this.j != null) {
            return this.j.getContentDescription();
        }
        return null;
    }

    private void b() {
        if (this.j == null) {
            this.j = new ImageView(getContext());
        }
    }

    public CharSequence getTitle() {
        return this.w;
    }

    public void setTitle(int i2) {
        setTitle(getContext().getText(i2));
    }

    public void setTitle(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            if (this.b == null) {
                Context context = getContext();
                this.b = new TextView(context);
                this.b.setSingleLine();
                this.b.setEllipsize(TextUtils.TruncateAt.END);
                if (this.e != 0) {
                    this.b.setTextAppearance(context, this.e);
                }
                if (this.y != 0) {
                    this.b.setTextColor(this.y);
                }
            }
            if (this.b.getParent() == null) {
                a((View) this.b);
                e(this.b);
            }
        } else if (!(this.b == null || this.b.getParent() == null)) {
            removeView(this.b);
        }
        if (this.b != null) {
            this.b.setText(charSequence);
        }
        this.w = charSequence;
    }

    public CharSequence getSubtitle() {
        return this.x;
    }

    public void setSubtitle(int i2) {
        setSubtitle(getContext().getText(i2));
    }

    public void setSubtitle(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            if (this.c == null) {
                Context context = getContext();
                this.c = new TextView(context);
                this.c.setSingleLine();
                this.c.setEllipsize(TextUtils.TruncateAt.END);
                if (this.f != 0) {
                    this.c.setTextAppearance(context, this.f);
                }
                if (this.z != 0) {
                    this.c.setTextColor(this.z);
                }
            }
            if (this.c.getParent() == null) {
                a((View) this.c);
                e(this.c);
            }
        } else if (!(this.c == null || this.c.getParent() == null)) {
            removeView(this.c);
        }
        if (this.c != null) {
            this.c.setText(charSequence);
        }
        this.x = charSequence;
    }

    public void setTitleTextColor(int i2) {
        this.y = i2;
        if (this.b != null) {
            this.b.setTextColor(i2);
        }
    }

    public void setSubtitleTextColor(int i2) {
        this.z = i2;
        if (this.c != null) {
            this.c.setTextColor(i2);
        }
    }

    public CharSequence getNavigationContentDescription() {
        if (this.i != null) {
            return this.i.getContentDescription();
        }
        return null;
    }

    public void setNavigationContentDescription(int i2) {
        setNavigationContentDescription(i2 != 0 ? getContext().getText(i2) : null);
    }

    public void setNavigationContentDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            c();
        }
        if (this.i != null) {
            this.i.setContentDescription(charSequence);
        }
    }

    public void setNavigationIcon(int i2) {
        setNavigationIcon(this.L.a(i2));
    }

    public void setNavigationIcon(Drawable drawable) {
        if (drawable != null) {
            c();
            if (this.i.getParent() == null) {
                a((View) this.i);
                e(this.i);
            }
        } else if (!(this.i == null || this.i.getParent() == null)) {
            removeView(this.i);
        }
        if (this.i != null) {
            this.i.setImageDrawable(drawable);
        }
    }

    public Drawable getNavigationIcon() {
        if (this.i != null) {
            return this.i.getDrawable();
        }
        return null;
    }

    public void setNavigationOnClickListener(View.OnClickListener onClickListener) {
        c();
        this.i.setOnClickListener(onClickListener);
    }

    private MenuInflater getMenuInflater() {
        return new android.support.v7.internal.view.b(getContext());
    }

    public void setOnMenuItemClickListener(c cVar) {
        this.D = cVar;
    }

    public int getContentInsetStart() {
        l lVar = this.g;
        return lVar.g ? lVar.b : lVar.a;
    }

    public int getContentInsetEnd() {
        l lVar = this.g;
        return lVar.g ? lVar.a : lVar.b;
    }

    public int getContentInsetLeft() {
        return this.g.a;
    }

    public int getContentInsetRight() {
        return this.g.b;
    }

    private void c() {
        if (this.i == null) {
            this.i = new ImageButton(getContext(), (AttributeSet) null, a.C0011a.toolbarNavigationButtonStyle);
            b bVar = new b();
            bVar.a = 8388611 | (this.p & 112);
            this.i.setLayoutParams(bVar);
        }
    }

    private void a(View view) {
        b bVar;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            bVar = new b();
        } else if (!checkLayoutParams(layoutParams)) {
            bVar = a(layoutParams);
        } else {
            bVar = (b) layoutParams;
        }
        bVar.b = 1;
        addView(view, bVar);
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0032, code lost:
        if (r2 != false) goto L_0x0034;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.os.Parcelable onSaveInstanceState() {
        /*
            r5 = this;
            r0 = 1
            r1 = 0
            android.support.v7.widget.Toolbar$SavedState r3 = new android.support.v7.widget.Toolbar$SavedState
            android.os.Parcelable r2 = super.onSaveInstanceState()
            r3.<init>((android.os.Parcelable) r2)
            android.support.v7.widget.Toolbar$a r2 = r5.h
            if (r2 == 0) goto L_0x001f
            android.support.v7.widget.Toolbar$a r2 = r5.h
            android.support.v7.internal.view.menu.f r2 = r2.b
            if (r2 == 0) goto L_0x001f
            android.support.v7.widget.Toolbar$a r2 = r5.h
            android.support.v7.internal.view.menu.f r2 = r2.b
            int r2 = r2.getItemId()
            r3.a = r2
        L_0x001f:
            android.support.v7.widget.ActionMenuView r2 = r5.a
            if (r2 == 0) goto L_0x0039
            android.support.v7.widget.ActionMenuView r2 = r5.a
            android.support.v7.widget.a r4 = r2.b
            if (r4 == 0) goto L_0x0037
            android.support.v7.widget.a r2 = r2.b
            boolean r2 = r2.g()
            if (r2 == 0) goto L_0x0037
            r2 = r0
        L_0x0032:
            if (r2 == 0) goto L_0x0039
        L_0x0034:
            r3.b = r0
            return r3
        L_0x0037:
            r2 = r1
            goto L_0x0032
        L_0x0039:
            r0 = r1
            goto L_0x0034
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.widget.Toolbar.onSaveInstanceState():android.os.Parcelable");
    }

    /* access modifiers changed from: protected */
    public void onRestoreInstanceState(Parcelable parcelable) {
        e eVar;
        MenuItem findItem;
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        if (this.a != null) {
            eVar = this.a.a;
        } else {
            eVar = null;
        }
        if (!(savedState.a == 0 || this.h == null || eVar == null || (findItem = eVar.findItem(savedState.a)) == null)) {
            k.a(findItem);
        }
        if (savedState.b) {
            removeCallbacks(this.K);
            post(this.K);
        }
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeCallbacks(this.K);
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        int a2 = n.a(motionEvent);
        if (a2 == 0) {
            this.A = false;
        }
        if (!this.A) {
            boolean onTouchEvent = super.onTouchEvent(motionEvent);
            if (a2 == 0 && !onTouchEvent) {
                this.A = true;
            }
        }
        if (a2 == 1 || a2 == 3) {
            this.A = false;
        }
        return true;
    }

    private void a(View view, int i2, int i3, int i4, int i5) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int childMeasureSpec = getChildMeasureSpec(i2, getPaddingLeft() + getPaddingRight() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i3, marginLayoutParams.width);
        int childMeasureSpec2 = getChildMeasureSpec(i4, getPaddingTop() + getPaddingBottom() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + 0, marginLayoutParams.height);
        int mode = View.MeasureSpec.getMode(childMeasureSpec2);
        if (mode != 1073741824 && i5 >= 0) {
            if (mode != 0) {
                i5 = Math.min(View.MeasureSpec.getSize(childMeasureSpec2), i5);
            }
            childMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i5, 1073741824);
        }
        view.measure(childMeasureSpec, childMeasureSpec2);
    }

    private int a(View view, int i2, int i3, int i4, int i5, int[] iArr) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int i6 = marginLayoutParams.leftMargin - iArr[0];
        int i7 = marginLayoutParams.rightMargin - iArr[1];
        int max = Math.max(0, i6) + Math.max(0, i7);
        iArr[0] = Math.max(0, -i6);
        iArr[1] = Math.max(0, -i7);
        view.measure(getChildMeasureSpec(i2, getPaddingLeft() + getPaddingRight() + max + i3, marginLayoutParams.width), getChildMeasureSpec(i4, getPaddingTop() + getPaddingBottom() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i5, marginLayoutParams.height));
        return view.getMeasuredWidth() + max;
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i2, int i3) {
        char c2;
        char c3;
        int i4;
        int i5;
        boolean z2;
        int i6;
        int i7;
        int[] iArr = this.C;
        if (s.a(this)) {
            c2 = 0;
            c3 = 1;
        } else {
            c2 = 1;
            c3 = 0;
        }
        int i8 = 0;
        if (b((View) this.i)) {
            a(this.i, i2, 0, i3, this.q);
            i8 = this.i.getMeasuredWidth() + c((View) this.i);
            int max = Math.max(0, this.i.getMeasuredHeight() + d((View) this.i));
            i4 = s.a(0, u.f(this.i));
            i5 = max;
        } else {
            i4 = 0;
            i5 = 0;
        }
        if (b((View) this.m)) {
            a(this.m, i2, 0, i3, this.q);
            i8 = this.m.getMeasuredWidth() + c((View) this.m);
            i5 = Math.max(i5, this.m.getMeasuredHeight() + d((View) this.m));
            i4 = s.a(i4, u.f(this.m));
        }
        int contentInsetStart = getContentInsetStart();
        int max2 = Math.max(contentInsetStart, i8) + 0;
        iArr[c3] = Math.max(0, contentInsetStart - i8);
        int i9 = 0;
        if (b((View) this.a)) {
            a(this.a, i2, max2, i3, this.q);
            i9 = this.a.getMeasuredWidth() + c((View) this.a);
            i5 = Math.max(i5, this.a.getMeasuredHeight() + d((View) this.a));
            i4 = s.a(i4, u.f(this.a));
        }
        int contentInsetEnd = getContentInsetEnd();
        int max3 = max2 + Math.max(contentInsetEnd, i9);
        iArr[c2] = Math.max(0, contentInsetEnd - i9);
        if (b(this.d)) {
            max3 += a(this.d, i2, max3, i3, 0, iArr);
            i5 = Math.max(i5, this.d.getMeasuredHeight() + d(this.d));
            i4 = s.a(i4, u.f(this.d));
        }
        if (b((View) this.j)) {
            max3 += a(this.j, i2, max3, i3, 0, iArr);
            i5 = Math.max(i5, this.j.getMeasuredHeight() + d((View) this.j));
            i4 = s.a(i4, u.f(this.j));
        }
        int childCount = getChildCount();
        int i10 = 0;
        int i11 = i4;
        int i12 = i5;
        while (i10 < childCount) {
            View childAt = getChildAt(i10);
            if (((b) childAt.getLayoutParams()).b != 0 || !b(childAt)) {
                i6 = i11;
                i7 = i12;
            } else {
                max3 += a(childAt, i2, max3, i3, 0, iArr);
                int max4 = Math.max(i12, childAt.getMeasuredHeight() + d(childAt));
                i6 = s.a(i11, u.f(childAt));
                i7 = max4;
            }
            i10++;
            i11 = i6;
            i12 = i7;
        }
        int i13 = 0;
        int i14 = 0;
        int i15 = this.t + this.u;
        int i16 = this.r + this.s;
        if (b((View) this.b)) {
            a(this.b, i2, max3 + i16, i3, i15, iArr);
            i13 = c((View) this.b) + this.b.getMeasuredWidth();
            i14 = this.b.getMeasuredHeight() + d((View) this.b);
            i11 = s.a(i11, u.f(this.b));
        }
        if (b((View) this.c)) {
            i13 = Math.max(i13, a(this.c, i2, max3 + i16, i3, i15 + i14, iArr));
            i14 += this.c.getMeasuredHeight() + d((View) this.c);
            i11 = s.a(i11, u.f(this.c));
        }
        int max5 = Math.max(i12, i14);
        int paddingLeft = i13 + max3 + getPaddingLeft() + getPaddingRight();
        int paddingTop = max5 + getPaddingTop() + getPaddingBottom();
        int a2 = u.a(Math.max(paddingLeft, getSuggestedMinimumWidth()), i2, -16777216 & i11);
        int a3 = u.a(Math.max(paddingTop, getSuggestedMinimumHeight()), i3, i11 << 16);
        if (this.I) {
            int childCount2 = getChildCount();
            int i17 = 0;
            while (true) {
                if (i17 >= childCount2) {
                    z2 = true;
                    break;
                }
                View childAt2 = getChildAt(i17);
                if (b(childAt2) && childAt2.getMeasuredWidth() > 0 && childAt2.getMeasuredHeight() > 0) {
                    z2 = false;
                    break;
                }
                i17++;
            }
        } else {
            z2 = false;
        }
        if (z2) {
            a3 = 0;
        }
        setMeasuredDimension(a2, a3);
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
        boolean z3;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        if (u.e(this) == 1) {
            z3 = true;
        } else {
            z3 = false;
        }
        int width = getWidth();
        int height = getHeight();
        int paddingLeft = getPaddingLeft();
        int paddingRight = getPaddingRight();
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int i18 = width - paddingRight;
        int[] iArr = this.C;
        iArr[1] = 0;
        iArr[0] = 0;
        int minimumHeightCompat = getMinimumHeightCompat();
        if (!b((View) this.i)) {
            i6 = paddingLeft;
        } else if (z3) {
            i18 = b(this.i, i18, iArr, minimumHeightCompat);
            i6 = paddingLeft;
        } else {
            i6 = a(this.i, paddingLeft, iArr, minimumHeightCompat);
        }
        if (b((View) this.m)) {
            if (z3) {
                i18 = b(this.m, i18, iArr, minimumHeightCompat);
            } else {
                i6 = a(this.m, i6, iArr, minimumHeightCompat);
            }
        }
        if (b((View) this.a)) {
            if (z3) {
                i6 = a(this.a, i6, iArr, minimumHeightCompat);
            } else {
                i18 = b(this.a, i18, iArr, minimumHeightCompat);
            }
        }
        iArr[0] = Math.max(0, getContentInsetLeft() - i6);
        iArr[1] = Math.max(0, getContentInsetRight() - ((width - paddingRight) - i18));
        int max = Math.max(i6, getContentInsetLeft());
        int min = Math.min(i18, (width - paddingRight) - getContentInsetRight());
        if (b(this.d)) {
            if (z3) {
                min = b(this.d, min, iArr, minimumHeightCompat);
            } else {
                max = a(this.d, max, iArr, minimumHeightCompat);
            }
        }
        if (!b((View) this.j)) {
            i7 = min;
            i8 = max;
        } else if (z3) {
            i7 = b(this.j, min, iArr, minimumHeightCompat);
            i8 = max;
        } else {
            i7 = min;
            i8 = a(this.j, max, iArr, minimumHeightCompat);
        }
        boolean b2 = b((View) this.b);
        boolean b3 = b((View) this.c);
        int i19 = 0;
        if (b2) {
            b bVar = (b) this.b.getLayoutParams();
            i19 = bVar.bottomMargin + bVar.topMargin + this.b.getMeasuredHeight() + 0;
        }
        if (b3) {
            b bVar2 = (b) this.c.getLayoutParams();
            i9 = bVar2.bottomMargin + bVar2.topMargin + this.c.getMeasuredHeight() + i19;
        } else {
            i9 = i19;
        }
        if (b2 || b3) {
            TextView textView = b2 ? this.b : this.c;
            TextView textView2 = b3 ? this.c : this.b;
            b bVar3 = (b) textView.getLayoutParams();
            b bVar4 = (b) textView2.getLayoutParams();
            boolean z4 = (b2 && this.b.getMeasuredWidth() > 0) || (b3 && this.c.getMeasuredWidth() > 0);
            switch (this.v & 112) {
                case a.i.Theme_homeAsUpIndicator:
                    i10 = bVar3.topMargin + getPaddingTop() + this.t;
                    break;
                case a.i.Theme_windowFixedHeightMinor:
                    i10 = (((height - paddingBottom) - bVar4.bottomMargin) - this.u) - i9;
                    break;
                default:
                    int i20 = (((height - paddingTop) - paddingBottom) - i9) / 2;
                    if (i20 < bVar3.topMargin + this.t) {
                        i17 = bVar3.topMargin + this.t;
                    } else {
                        int i21 = (((height - paddingBottom) - i9) - i20) - paddingTop;
                        if (i21 < bVar3.bottomMargin + this.u) {
                            i17 = Math.max(0, i20 - ((bVar4.bottomMargin + this.u) - i21));
                        } else {
                            i17 = i20;
                        }
                    }
                    i10 = paddingTop + i17;
                    break;
            }
            if (z3) {
                int i22 = (z4 ? this.r : 0) - iArr[1];
                int max2 = i7 - Math.max(0, i22);
                iArr[1] = Math.max(0, -i22);
                if (b2) {
                    int measuredWidth = max2 - this.b.getMeasuredWidth();
                    int measuredHeight = this.b.getMeasuredHeight() + i10;
                    this.b.layout(measuredWidth, i10, max2, measuredHeight);
                    int i23 = measuredWidth - this.s;
                    i10 = measuredHeight + ((b) this.b.getLayoutParams()).bottomMargin;
                    i14 = i23;
                } else {
                    i14 = max2;
                }
                if (b3) {
                    b bVar5 = (b) this.c.getLayoutParams();
                    int i24 = bVar5.topMargin + i10;
                    this.c.layout(max2 - this.c.getMeasuredWidth(), i24, max2, this.c.getMeasuredHeight() + i24);
                    int i25 = bVar5.bottomMargin;
                    i15 = max2 - this.s;
                } else {
                    i15 = max2;
                }
                if (z4) {
                    i16 = Math.min(i14, i15);
                } else {
                    i16 = max2;
                }
                i7 = i16;
            } else {
                int i26 = (z4 ? this.r : 0) - iArr[0];
                i8 += Math.max(0, i26);
                iArr[0] = Math.max(0, -i26);
                if (b2) {
                    int measuredWidth2 = this.b.getMeasuredWidth() + i8;
                    int measuredHeight2 = this.b.getMeasuredHeight() + i10;
                    this.b.layout(i8, i10, measuredWidth2, measuredHeight2);
                    int i27 = ((b) this.b.getLayoutParams()).bottomMargin + measuredHeight2;
                    i11 = measuredWidth2 + this.s;
                    i12 = i27;
                } else {
                    i11 = i8;
                    i12 = i10;
                }
                if (b3) {
                    b bVar6 = (b) this.c.getLayoutParams();
                    int i28 = i12 + bVar6.topMargin;
                    int measuredWidth3 = this.c.getMeasuredWidth() + i8;
                    this.c.layout(i8, i28, measuredWidth3, this.c.getMeasuredHeight() + i28);
                    int i29 = bVar6.bottomMargin;
                    i13 = this.s + measuredWidth3;
                } else {
                    i13 = i8;
                }
                if (z4) {
                    i8 = Math.max(i11, i13);
                }
            }
        }
        a((List<View>) this.B, 3);
        int size = this.B.size();
        int i30 = i8;
        for (int i31 = 0; i31 < size; i31++) {
            i30 = a(this.B.get(i31), i30, iArr, minimumHeightCompat);
        }
        a((List<View>) this.B, 5);
        int size2 = this.B.size();
        int i32 = 0;
        int i33 = i7;
        while (i32 < size2) {
            int b4 = b(this.B.get(i32), i33, iArr, minimumHeightCompat);
            i32++;
            i33 = b4;
        }
        a((List<View>) this.B, 1);
        ArrayList<View> arrayList = this.B;
        int i34 = iArr[0];
        int i35 = iArr[1];
        int size3 = arrayList.size();
        int i36 = i34;
        int i37 = i35;
        int i38 = 0;
        int i39 = 0;
        while (i38 < size3) {
            View view = arrayList.get(i38);
            b bVar7 = (b) view.getLayoutParams();
            int i40 = bVar7.leftMargin - i36;
            int i41 = bVar7.rightMargin - i37;
            int max3 = Math.max(0, i40);
            int max4 = Math.max(0, i41);
            i36 = Math.max(0, -i40);
            i37 = Math.max(0, -i41);
            i38++;
            i39 += view.getMeasuredWidth() + max3 + max4;
        }
        int i42 = ((((width - paddingLeft) - paddingRight) / 2) + paddingLeft) - (i39 / 2);
        int i43 = i42 + i39;
        if (i42 < i30) {
            i42 = i30;
        } else if (i43 > i33) {
            i42 -= i43 - i33;
        }
        int size4 = this.B.size();
        int i44 = 0;
        int i45 = i42;
        while (i44 < size4) {
            int a2 = a(this.B.get(i44), i45, iArr, minimumHeightCompat);
            i44++;
            i45 = a2;
        }
        this.B.clear();
    }

    private int a(View view, int i2, int[] iArr, int i3) {
        b bVar = (b) view.getLayoutParams();
        int i4 = bVar.leftMargin - iArr[0];
        int max = Math.max(0, i4) + i2;
        iArr[0] = Math.max(0, -i4);
        int a2 = a(view, i3);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(max, a2, max + measuredWidth, view.getMeasuredHeight() + a2);
        return bVar.rightMargin + measuredWidth + max;
    }

    private int b(View view, int i2, int[] iArr, int i3) {
        b bVar = (b) view.getLayoutParams();
        int i4 = bVar.rightMargin - iArr[1];
        int max = i2 - Math.max(0, i4);
        iArr[1] = Math.max(0, -i4);
        int a2 = a(view, i3);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(max - measuredWidth, a2, max, view.getMeasuredHeight() + a2);
        return max - (bVar.leftMargin + measuredWidth);
    }

    private int a(View view, int i2) {
        int max;
        b bVar = (b) view.getLayoutParams();
        int measuredHeight = view.getMeasuredHeight();
        int i3 = i2 > 0 ? (measuredHeight - i2) / 2 : 0;
        int i4 = bVar.a & 112;
        switch (i4) {
            case 16:
            case a.i.Theme_homeAsUpIndicator:
            case a.i.Theme_windowFixedHeightMinor:
                break;
            default:
                i4 = this.v & 112;
                break;
        }
        switch (i4) {
            case a.i.Theme_homeAsUpIndicator:
                return getPaddingTop() - i3;
            case a.i.Theme_windowFixedHeightMinor:
                return (((getHeight() - getPaddingBottom()) - measuredHeight) - bVar.bottomMargin) - i3;
            default:
                int paddingTop = getPaddingTop();
                int paddingBottom = getPaddingBottom();
                int height = getHeight();
                int i5 = (((height - paddingTop) - paddingBottom) - measuredHeight) / 2;
                if (i5 < bVar.topMargin) {
                    max = bVar.topMargin;
                } else {
                    int i6 = (((height - paddingBottom) - measuredHeight) - i5) - paddingTop;
                    max = i6 < bVar.bottomMargin ? Math.max(0, i5 - (bVar.bottomMargin - i6)) : i5;
                }
                return max + paddingTop;
        }
    }

    private void a(List<View> list, int i2) {
        boolean z2 = true;
        if (u.e(this) != 1) {
            z2 = false;
        }
        int childCount = getChildCount();
        int a2 = android.support.v4.view.e.a(i2, u.e(this));
        list.clear();
        if (z2) {
            for (int i3 = childCount - 1; i3 >= 0; i3--) {
                View childAt = getChildAt(i3);
                b bVar = (b) childAt.getLayoutParams();
                if (bVar.b == 0 && b(childAt) && a(bVar.a) == a2) {
                    list.add(childAt);
                }
            }
            return;
        }
        for (int i4 = 0; i4 < childCount; i4++) {
            View childAt2 = getChildAt(i4);
            b bVar2 = (b) childAt2.getLayoutParams();
            if (bVar2.b == 0 && b(childAt2) && a(bVar2.a) == a2) {
                list.add(childAt2);
            }
        }
    }

    private int a(int i2) {
        int e2 = u.e(this);
        int a2 = android.support.v4.view.e.a(i2, e2) & 7;
        switch (a2) {
            case 1:
            case 3:
            case 5:
                return a2;
            default:
                return e2 == 1 ? 5 : 3;
        }
    }

    private boolean b(View view) {
        return (view == null || view.getParent() != this || view.getVisibility() == 8) ? false : true;
    }

    private static int c(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return i.b(marginLayoutParams) + i.a(marginLayoutParams);
    }

    private static int d(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return marginLayoutParams.bottomMargin + marginLayoutParams.topMargin;
    }

    private static b a(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof b) {
            return new b((b) layoutParams);
        }
        if (layoutParams instanceof a.C0010a) {
            return new b((a.C0010a) layoutParams);
        }
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return new b((ViewGroup.MarginLayoutParams) layoutParams);
        }
        return new b(layoutParams);
    }

    protected static b a() {
        return new b();
    }

    /* access modifiers changed from: protected */
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return super.checkLayoutParams(layoutParams) && (layoutParams instanceof b);
    }

    public h getWrapper() {
        if (this.F == null) {
            this.F = new r(this);
        }
        return this.F;
    }

    /* access modifiers changed from: private */
    public void setChildVisibilityForExpandedActionView(boolean z2) {
        int i2;
        int childCount = getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = getChildAt(i3);
            if (!(((b) childAt.getLayoutParams()).b == 2 || childAt == this.a)) {
                if (z2) {
                    i2 = 8;
                } else {
                    i2 = 0;
                }
                childAt.setVisibility(i2);
            }
        }
    }

    private void e(View view) {
        if (((b) view.getLayoutParams()).b != 2 && view != this.a) {
            view.setVisibility(this.d != null ? 8 : 0);
        }
    }

    public void setCollapsible(boolean z2) {
        this.I = z2;
        requestLayout();
    }

    public void setMinimumHeight(int i2) {
        this.J = i2;
        super.setMinimumHeight(i2);
    }

    private int getMinimumHeightCompat() {
        if (Build.VERSION.SDK_INT >= 16) {
            return u.h(this);
        }
        return this.J;
    }

    public static class b extends a.C0010a {
        int b = 0;

        public b(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public b() {
            this.a = 8388627;
        }

        public b(b bVar) {
            super((a.C0010a) bVar);
            this.b = bVar.b;
        }

        public b(a.C0010a aVar) {
            super(aVar);
        }

        public b(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super((ViewGroup.LayoutParams) marginLayoutParams);
            this.leftMargin = marginLayoutParams.leftMargin;
            this.topMargin = marginLayoutParams.topMargin;
            this.rightMargin = marginLayoutParams.rightMargin;
            this.bottomMargin = marginLayoutParams.bottomMargin;
        }

        public b(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }
    }

    static class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new Parcelable.Creator<SavedState>() {
            public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
                return new SavedState[i];
            }

            public final /* synthetic */ Object createFromParcel(Parcel parcel) {
                return new SavedState(parcel);
            }
        };
        public int a;
        public boolean b;

        public SavedState(Parcel parcel) {
            super(parcel);
            this.a = parcel.readInt();
            this.b = parcel.readInt() != 0;
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.a);
            parcel.writeInt(this.b ? 1 : 0);
        }
    }

    private class a implements j {
        e a;
        f b;

        private a() {
        }

        /* synthetic */ a(Toolbar toolbar, byte b2) {
            this();
        }

        public final void a(Context context, e eVar) {
            if (!(this.a == null || this.b == null)) {
                this.a.b(this.b);
            }
            this.a = eVar;
        }

        public final void a(boolean z) {
            boolean z2 = false;
            if (this.b != null) {
                if (this.a != null) {
                    int size = this.a.size();
                    int i = 0;
                    while (true) {
                        if (i >= size) {
                            break;
                        } else if (this.a.getItem(i) == this.b) {
                            z2 = true;
                            break;
                        } else {
                            i++;
                        }
                    }
                }
                if (!z2) {
                    c(this.b);
                }
            }
        }

        public final boolean a(m mVar) {
            return false;
        }

        public final void a(e eVar, boolean z) {
        }

        public final boolean a() {
            return false;
        }

        public final boolean b(f fVar) {
            Toolbar.b(Toolbar.this);
            if (Toolbar.this.m.getParent() != Toolbar.this) {
                Toolbar.this.addView(Toolbar.this.m);
            }
            Toolbar.this.d = fVar.getActionView();
            this.b = fVar;
            if (Toolbar.this.d.getParent() != Toolbar.this) {
                b a2 = Toolbar.a();
                a2.a = 8388611 | (Toolbar.this.p & 112);
                a2.b = 2;
                Toolbar.this.d.setLayoutParams(a2);
                Toolbar.this.addView(Toolbar.this.d);
            }
            Toolbar.this.setChildVisibilityForExpandedActionView(true);
            Toolbar.this.requestLayout();
            fVar.d(true);
            if (Toolbar.this.d instanceof android.support.v7.c.a) {
                ((android.support.v7.c.a) Toolbar.this.d).a();
            }
            return true;
        }

        public final boolean c(f fVar) {
            if (Toolbar.this.d instanceof android.support.v7.c.a) {
                ((android.support.v7.c.a) Toolbar.this.d).a_();
            }
            Toolbar.this.removeView(Toolbar.this.d);
            Toolbar.this.removeView(Toolbar.this.m);
            Toolbar.this.d = null;
            Toolbar.this.setChildVisibilityForExpandedActionView(false);
            this.b = null;
            Toolbar.this.requestLayout();
            fVar.d(false);
            return true;
        }
    }

    public Menu getMenu() {
        if (this.a == null) {
            this.a = new ActionMenuView(getContext());
            this.a.setPopupTheme(this.o);
            this.a.setOnMenuItemClickListener(this.E);
            ActionMenuView actionMenuView = this.a;
            j.a aVar = this.G;
            e.a aVar2 = this.H;
            actionMenuView.c = aVar;
            actionMenuView.d = aVar2;
            b bVar = new b();
            bVar.a = 8388613 | (this.p & 112);
            this.a.setLayoutParams(bVar);
            a((View) this.a);
        }
        if (this.a.a == null) {
            e eVar = (e) this.a.getMenu();
            if (this.h == null) {
                this.h = new a(this, (byte) 0);
            }
            this.a.setExpandedActionViewsExclusive(true);
            eVar.a((j) this.h, this.n);
        }
        return this.a.getMenu();
    }

    /* access modifiers changed from: protected */
    public /* synthetic */ ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new b();
    }

    public /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new b(getContext(), attributeSet);
    }

    static /* synthetic */ void b(Toolbar toolbar) {
        if (toolbar.m == null) {
            toolbar.m = new ImageButton(toolbar.getContext(), (AttributeSet) null, a.C0011a.toolbarNavigationButtonStyle);
            toolbar.m.setImageDrawable(toolbar.k);
            toolbar.m.setContentDescription(toolbar.l);
            b bVar = new b();
            bVar.a = 8388611 | (toolbar.p & 112);
            bVar.b = 2;
            toolbar.m.setLayoutParams(bVar);
            toolbar.m.setOnClickListener(new View.OnClickListener() {
                public final void onClick(View view) {
                    Toolbar toolbar = Toolbar.this;
                    f fVar = toolbar.h == null ? null : toolbar.h.b;
                    if (fVar != null) {
                        fVar.collapseActionView();
                    }
                }
            });
        }
    }
}
