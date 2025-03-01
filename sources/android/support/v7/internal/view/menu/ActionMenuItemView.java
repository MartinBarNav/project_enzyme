package android.support.v7.internal.view.menu;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.support.v4.view.u;
import android.support.v7.b.a;
import android.support.v7.internal.view.menu.e;
import android.support.v7.internal.view.menu.k;
import android.support.v7.internal.widget.f;
import android.support.v7.widget.ActionMenuView;
import android.support.v7.widget.b;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Toast;

public class ActionMenuItemView extends f implements k.a, ActionMenuView.a, View.OnClickListener, View.OnLongClickListener {
    /* access modifiers changed from: private */
    public f a;
    private CharSequence b;
    private Drawable c;
    /* access modifiers changed from: private */
    public e.b d;
    private b.C0016b e;
    /* access modifiers changed from: private */
    public b f;
    private boolean g;
    private boolean h;
    private int i;
    private int j;
    private int k;

    public static abstract class b {
        public abstract android.support.v7.widget.b a();
    }

    public ActionMenuItemView(Context context) {
        this(context, (AttributeSet) null);
    }

    public ActionMenuItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ActionMenuItemView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        Resources resources = context.getResources();
        this.g = resources.getBoolean(a.b.abc_config_allowActionMenuItemTextWithIcon);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, a.i.ActionMenuItemView, i2, 0);
        this.i = obtainStyledAttributes.getDimensionPixelSize(a.i.ActionMenuItemView_android_minWidth, 0);
        obtainStyledAttributes.recycle();
        this.k = (int) ((resources.getDisplayMetrics().density * 32.0f) + 0.5f);
        setOnClickListener(this);
        setOnLongClickListener(this);
        setTransformationMethod(new android.support.v7.internal.b.a(context));
        this.j = -1;
    }

    public void onConfigurationChanged(Configuration configuration) {
        if (Build.VERSION.SDK_INT >= 8) {
            super.onConfigurationChanged(configuration);
        }
        this.g = getContext().getResources().getBoolean(a.b.abc_config_allowActionMenuItemTextWithIcon);
        e();
    }

    public void setPadding(int i2, int i3, int i4, int i5) {
        this.j = i2;
        super.setPadding(i2, i3, i4, i5);
    }

    public f getItemData() {
        return this.a;
    }

    public final void a(f fVar) {
        this.a = fVar;
        setIcon(fVar.getIcon());
        setTitle(fVar.a((k.a) this));
        setId(fVar.getItemId());
        setVisibility(fVar.isVisible() ? 0 : 8);
        setEnabled(fVar.isEnabled());
        if (fVar.hasSubMenu() && this.e == null) {
            this.e = new a();
        }
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.a.hasSubMenu() || this.e == null || !this.e.onTouch(this, motionEvent)) {
            return super.onTouchEvent(motionEvent);
        }
        return true;
    }

    public void onClick(View view) {
        if (this.d != null) {
            this.d.a(this.a);
        }
    }

    public void setItemInvoker(e.b bVar) {
        this.d = bVar;
    }

    public void setPopupCallback(b bVar) {
        this.f = bVar;
    }

    public final boolean a() {
        return true;
    }

    public void setCheckable(boolean z) {
    }

    public void setChecked(boolean z) {
    }

    public void setExpandedFormat(boolean z) {
        if (this.h != z) {
            this.h = z;
            if (this.a != null) {
                this.a.b.d();
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0021, code lost:
        if (r5.h != false) goto L_0x0023;
     */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0027  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0031  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void e() {
        /*
            r5 = this;
            r1 = 1
            r2 = 0
            java.lang.CharSequence r0 = r5.b
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x002d
            r0 = r1
        L_0x000b:
            android.graphics.drawable.Drawable r3 = r5.c
            if (r3 == 0) goto L_0x0023
            android.support.v7.internal.view.menu.f r3 = r5.a
            int r3 = r3.c
            r3 = r3 & 4
            r4 = 4
            if (r3 != r4) goto L_0x002f
            r3 = r1
        L_0x0019:
            if (r3 == 0) goto L_0x0024
            boolean r3 = r5.g
            if (r3 != 0) goto L_0x0023
            boolean r3 = r5.h
            if (r3 == 0) goto L_0x0024
        L_0x0023:
            r2 = r1
        L_0x0024:
            r0 = r0 & r2
            if (r0 == 0) goto L_0x0031
            java.lang.CharSequence r0 = r5.b
        L_0x0029:
            r5.setText(r0)
            return
        L_0x002d:
            r0 = r2
            goto L_0x000b
        L_0x002f:
            r3 = r2
            goto L_0x0019
        L_0x0031:
            r0 = 0
            goto L_0x0029
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.internal.view.menu.ActionMenuItemView.e():void");
    }

    public void setIcon(Drawable drawable) {
        this.c = drawable;
        if (drawable != null) {
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int intrinsicHeight = drawable.getIntrinsicHeight();
            if (intrinsicWidth > this.k) {
                float f2 = ((float) this.k) / ((float) intrinsicWidth);
                intrinsicWidth = this.k;
                intrinsicHeight = (int) (((float) intrinsicHeight) * f2);
            }
            if (intrinsicHeight > this.k) {
                float f3 = ((float) this.k) / ((float) intrinsicHeight);
                intrinsicHeight = this.k;
                intrinsicWidth = (int) (((float) intrinsicWidth) * f3);
            }
            drawable.setBounds(0, 0, intrinsicWidth, intrinsicHeight);
        }
        setCompoundDrawables(drawable, (Drawable) null, (Drawable) null, (Drawable) null);
        e();
    }

    public final boolean b() {
        return !TextUtils.isEmpty(getText());
    }

    public void setTitle(CharSequence charSequence) {
        this.b = charSequence;
        setContentDescription(this.b);
        e();
    }

    public final boolean c() {
        return b() && this.a.getIcon() == null;
    }

    public final boolean d() {
        return b();
    }

    public boolean onLongClick(View view) {
        if (b()) {
            return false;
        }
        int[] iArr = new int[2];
        Rect rect = new Rect();
        getLocationOnScreen(iArr);
        getWindowVisibleDisplayFrame(rect);
        Context context = getContext();
        int width = getWidth();
        int height = getHeight();
        int i2 = iArr[1] + (height / 2);
        int i3 = iArr[0] + (width / 2);
        if (u.e(view) == 0) {
            i3 = context.getResources().getDisplayMetrics().widthPixels - i3;
        }
        Toast makeText = Toast.makeText(context, this.a.getTitle(), 0);
        if (i2 < rect.height()) {
            makeText.setGravity(8388661, i3, height);
        } else {
            makeText.setGravity(81, 0, height);
        }
        makeText.show();
        return true;
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i2, int i3) {
        boolean b2 = b();
        if (b2 && this.j >= 0) {
            super.setPadding(this.j, getPaddingTop(), getPaddingRight(), getPaddingBottom());
        }
        super.onMeasure(i2, i3);
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        int measuredWidth = getMeasuredWidth();
        int min = mode == Integer.MIN_VALUE ? Math.min(size, this.i) : this.i;
        if (mode != 1073741824 && this.i > 0 && measuredWidth < min) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(min, 1073741824), i3);
        }
        if (!b2 && this.c != null) {
            super.setPadding((getMeasuredWidth() - this.c.getBounds().width()) / 2, getPaddingTop(), getPaddingRight(), getPaddingBottom());
        }
    }

    private class a extends b.C0016b {
        public a() {
            super(ActionMenuItemView.this);
        }

        public final android.support.v7.widget.b a() {
            if (ActionMenuItemView.this.f != null) {
                return ActionMenuItemView.this.f.a();
            }
            return null;
        }

        /* access modifiers changed from: protected */
        public final boolean b() {
            android.support.v7.widget.b a2;
            if (ActionMenuItemView.this.d == null || !ActionMenuItemView.this.d.a(ActionMenuItemView.this.a) || (a2 = a()) == null || !a2.b.isShowing()) {
                return false;
            }
            return true;
        }

        /* access modifiers changed from: protected */
        public final boolean c() {
            android.support.v7.widget.b a2 = a();
            if (a2 == null) {
                return false;
            }
            a2.a();
            return true;
        }
    }
}
