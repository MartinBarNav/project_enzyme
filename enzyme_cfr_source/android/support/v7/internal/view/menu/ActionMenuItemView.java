/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.res.Configuration
 *  android.content.res.Resources
 *  android.graphics.Rect
 *  android.graphics.drawable.Drawable
 *  android.os.Build$VERSION
 *  android.text.TextUtils
 *  android.util.AttributeSet
 *  android.view.MotionEvent
 *  android.view.View
 *  android.view.View$MeasureSpec
 *  android.view.View$OnClickListener
 *  android.view.View$OnLongClickListener
 *  android.widget.Toast
 */
package android.support.v7.internal.view.menu;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.support.v4.view.u;
import android.support.v7.b.a;
import android.support.v7.internal.view.menu.e;
import android.support.v7.internal.view.menu.f;
import android.support.v7.internal.view.menu.k;
import android.support.v7.widget.ActionMenuView;
import android.support.v7.widget.b;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Toast;

public class ActionMenuItemView
extends android.support.v7.internal.widget.f
implements k.a,
ActionMenuView.a,
View.OnClickListener,
View.OnLongClickListener {
    private f a;
    private CharSequence b;
    private Drawable c;
    private e.b d;
    private b.b e;
    private b f;
    private boolean g;
    private boolean h;
    private int i;
    private int j;
    private int k;

    public ActionMenuItemView(Context context) {
        this(context, null);
    }

    public ActionMenuItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ActionMenuItemView(Context context, AttributeSet attributeSet, int n2) {
        super(context, attributeSet, n2);
        Resources resources = context.getResources();
        this.g = resources.getBoolean(a.b.abc_config_allowActionMenuItemTextWithIcon);
        attributeSet = context.obtainStyledAttributes(attributeSet, a.i.ActionMenuItemView, n2, 0);
        this.i = attributeSet.getDimensionPixelSize(a.i.ActionMenuItemView_android_minWidth, 0);
        attributeSet.recycle();
        this.k = (int)(resources.getDisplayMetrics().density * 32.0f + 0.5f);
        this.setOnClickListener(this);
        this.setOnLongClickListener(this);
        this.setTransformationMethod(new android.support.v7.internal.b.a(context));
        this.j = -1;
    }

    /*
     * Enabled aggressive block sorting
     */
    private void e() {
        boolean bl;
        boolean bl2;
        block3: {
            block2: {
                boolean bl3 = false;
                bl2 = !TextUtils.isEmpty((CharSequence)this.b);
                if (this.c == null) break block2;
                boolean bl4 = (this.a.c & 4) == 4;
                bl = bl3;
                if (!bl4) break block3;
                if (this.g) break block2;
                bl = bl3;
                if (!this.h) break block3;
            }
            bl = true;
        }
        CharSequence charSequence = bl2 & bl ? this.b : null;
        this.setText(charSequence);
    }

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public final void a(f f2) {
        this.a = f2;
        this.setIcon(f2.getIcon());
        this.setTitle(f2.a(this));
        this.setId(f2.getItemId());
        int n2 = f2.isVisible() ? 0 : 8;
        this.setVisibility(n2);
        this.setEnabled(f2.isEnabled());
        if (f2.hasSubMenu() && this.e == null) {
            this.e = new a();
        }
    }

    @Override
    public final boolean a() {
        return true;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final boolean b() {
        if (TextUtils.isEmpty((CharSequence)this.getText())) return false;
        return true;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public final boolean c() {
        if (!this.b()) return false;
        if (this.a.getIcon() != null) return false;
        return true;
    }

    @Override
    public final boolean d() {
        return this.b();
    }

    @Override
    public f getItemData() {
        return this.a;
    }

    public void onClick(View view) {
        if (this.d != null) {
            this.d.a(this.a);
        }
    }

    public void onConfigurationChanged(Configuration configuration) {
        if (Build.VERSION.SDK_INT >= 8) {
            super.onConfigurationChanged(configuration);
        }
        this.g = this.getContext().getResources().getBoolean(a.b.abc_config_allowActionMenuItemTextWithIcon);
        this.e();
    }

    /*
     * Enabled aggressive block sorting
     */
    public boolean onLongClick(View view) {
        int n2;
        if (this.b()) {
            return false;
        }
        int[] arrn = new int[2];
        Rect rect = new Rect();
        this.getLocationOnScreen(arrn);
        this.getWindowVisibleDisplayFrame(rect);
        Context context = this.getContext();
        int n3 = this.getWidth();
        int n4 = this.getHeight();
        int n5 = arrn[1];
        int n6 = n4 / 2;
        n3 = n2 = arrn[0] + n3 / 2;
        if (u.e(view) == 0) {
            n3 = context.getResources().getDisplayMetrics().widthPixels - n2;
        }
        view = Toast.makeText((Context)context, (CharSequence)this.a.getTitle(), (int)0);
        if (n5 + n6 < rect.height()) {
            view.setGravity(8388661, n3, n4);
        } else {
            view.setGravity(81, 0, n4);
        }
        view.show();
        return true;
    }

    /*
     * Enabled aggressive block sorting
     */
    protected void onMeasure(int n2, int n3) {
        boolean bl = this.b();
        if (bl && this.j >= 0) {
            super.setPadding(this.j, this.getPaddingTop(), this.getPaddingRight(), this.getPaddingBottom());
        }
        super.onMeasure(n2, n3);
        int n4 = View.MeasureSpec.getMode((int)n2);
        n2 = View.MeasureSpec.getSize((int)n2);
        int n5 = this.getMeasuredWidth();
        n2 = n4 == Integer.MIN_VALUE ? Math.min(n2, this.i) : this.i;
        if (n4 != 0x40000000 && this.i > 0 && n5 < n2) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec((int)n2, (int)0x40000000), n3);
        }
        if (!bl && this.c != null) {
            super.setPadding((this.getMeasuredWidth() - this.c.getBounds().width()) / 2, this.getPaddingTop(), this.getPaddingRight(), this.getPaddingBottom());
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.a.hasSubMenu()) return super.onTouchEvent(motionEvent);
        if (this.e == null) return super.onTouchEvent(motionEvent);
        if (!this.e.onTouch((View)this, motionEvent)) return super.onTouchEvent(motionEvent);
        return true;
    }

    public void setCheckable(boolean bl) {
    }

    public void setChecked(boolean bl) {
    }

    public void setExpandedFormat(boolean bl) {
        if (this.h != bl) {
            this.h = bl;
            if (this.a != null) {
                this.a.b.d();
            }
        }
    }

    public void setIcon(Drawable drawable) {
        this.c = drawable;
        if (drawable != null) {
            float f2;
            int n2;
            int n3 = drawable.getIntrinsicWidth();
            int n4 = n2 = drawable.getIntrinsicHeight();
            int n5 = n3;
            if (n3 > this.k) {
                f2 = (float)this.k / (float)n3;
                n5 = this.k;
                n4 = (int)((float)n2 * f2);
            }
            n3 = n4;
            n2 = n5;
            if (n4 > this.k) {
                f2 = (float)this.k / (float)n4;
                n3 = this.k;
                n2 = (int)((float)n5 * f2);
            }
            drawable.setBounds(0, 0, n2, n3);
        }
        this.setCompoundDrawables(drawable, null, null, null);
        this.e();
    }

    public void setItemInvoker(e.b b2) {
        this.d = b2;
    }

    public void setPadding(int n2, int n3, int n4, int n5) {
        this.j = n2;
        super.setPadding(n2, n3, n4, n5);
    }

    public void setPopupCallback(b b2) {
        this.f = b2;
    }

    public void setTitle(CharSequence charSequence) {
        this.b = charSequence;
        this.setContentDescription(this.b);
        this.e();
    }

    private final class a
    extends b.b {
        public a() {
            super((View)ActionMenuItemView.this);
        }

        /*
         * Enabled force condition propagation
         * Lifted jumps to return sites
         */
        @Override
        public final android.support.v7.widget.b a() {
            if (ActionMenuItemView.this.f == null) return null;
            return ActionMenuItemView.this.f.a();
        }

        @Override
        protected final boolean b() {
            boolean bl;
            boolean bl2 = bl = false;
            if (ActionMenuItemView.this.d != null) {
                bl2 = bl;
                if (ActionMenuItemView.this.d.a(ActionMenuItemView.this.a)) {
                    android.support.v7.widget.b b2 = this.a();
                    bl2 = bl;
                    if (b2 != null) {
                        bl2 = bl;
                        if (b2.b.isShowing()) {
                            bl2 = true;
                        }
                    }
                }
            }
            return bl2;
        }

        /*
         * Enabled force condition propagation
         * Lifted jumps to return sites
         */
        @Override
        protected final boolean c() {
            android.support.v7.widget.b b2 = this.a();
            if (b2 == null) return false;
            b2.a();
            return true;
        }
    }

    public static abstract class b {
        public abstract android.support.v7.widget.b a();
    }
}

