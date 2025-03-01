// 
// Decompiled by Procyon v0.5.36
// 

package android.support.v7.internal.view.menu;

import android.view.MotionEvent;
import android.view.View$MeasureSpec;
import android.widget.Toast;
import android.support.v4.view.u;
import android.graphics.Rect;
import android.os.Build$VERSION;
import android.content.res.Configuration;
import android.view.View;
import android.text.TextUtils;
import android.content.res.TypedArray;
import android.content.res.Resources;
import android.text.method.TransformationMethod;
import android.support.v7.b.a;
import android.util.AttributeSet;
import android.content.Context;
import android.support.v7.widget.b;
import android.graphics.drawable.Drawable;
import android.view.View$OnLongClickListener;
import android.view.View$OnClickListener;
import android.support.v7.widget.ActionMenuView;
import android.support.v7.internal.widget.f;

public class ActionMenuItemView extends f implements k.a, ActionMenuView.a, View$OnClickListener, View$OnLongClickListener
{
    private android.support.v7.internal.view.menu.f a;
    private CharSequence b;
    private Drawable c;
    private android.support.v7.internal.view.menu.e.b d;
    private android.support.v7.widget.b.b e;
    private b f;
    private boolean g;
    private boolean h;
    private int i;
    private int j;
    private int k;
    
    public ActionMenuItemView(final Context context) {
        this(context, null);
    }
    
    public ActionMenuItemView(final Context context, final AttributeSet set) {
        this(context, set, 0);
    }
    
    public ActionMenuItemView(final Context context, final AttributeSet set, final int n) {
        super(context, set, n);
        final Resources resources = context.getResources();
        this.g = resources.getBoolean(android.support.v7.b.a.b.abc_config_allowActionMenuItemTextWithIcon);
        final TypedArray obtainStyledAttributes = context.obtainStyledAttributes(set, android.support.v7.b.a.i.ActionMenuItemView, n, 0);
        this.i = obtainStyledAttributes.getDimensionPixelSize(android.support.v7.b.a.i.ActionMenuItemView_android_minWidth, 0);
        obtainStyledAttributes.recycle();
        this.k = (int)(resources.getDisplayMetrics().density * 32.0f + 0.5f);
        this.setOnClickListener((View$OnClickListener)this);
        this.setOnLongClickListener((View$OnLongClickListener)this);
        this.setTransformationMethod((TransformationMethod)new android.support.v7.internal.b.a(context));
        this.j = -1;
    }
    
    private void e() {
        final boolean b = false;
        boolean b2;
        if (!TextUtils.isEmpty(this.b)) {
            b2 = true;
        }
        else {
            b2 = false;
        }
        boolean b3 = false;
        Label_0063: {
            if (this.c != null) {
                int n;
                if ((this.a.c & 0x4) == 0x4) {
                    n = 1;
                }
                else {
                    n = 0;
                }
                b3 = b;
                if (n == 0) {
                    break Label_0063;
                }
                if (!this.g) {
                    b3 = b;
                    if (!this.h) {
                        break Label_0063;
                    }
                }
            }
            b3 = true;
        }
        CharSequence b4;
        if (b2 & b3) {
            b4 = this.b;
        }
        else {
            b4 = null;
        }
        this.setText(b4);
    }
    
    @Override
    public final void a(final android.support.v7.internal.view.menu.f a) {
        this.a = a;
        this.setIcon(a.getIcon());
        this.setTitle(a.a(this));
        this.setId(a.getItemId());
        int visibility;
        if (a.isVisible()) {
            visibility = 0;
        }
        else {
            visibility = 8;
        }
        this.setVisibility(visibility);
        this.setEnabled(a.isEnabled());
        if (a.hasSubMenu() && this.e == null) {
            this.e = new a();
        }
    }
    
    @Override
    public final boolean a() {
        return true;
    }
    
    public final boolean b() {
        return !TextUtils.isEmpty(this.getText());
    }
    
    @Override
    public final boolean c() {
        return this.b() && this.a.getIcon() == null;
    }
    
    @Override
    public final boolean d() {
        return this.b();
    }
    
    @Override
    public android.support.v7.internal.view.menu.f getItemData() {
        return this.a;
    }
    
    public void onClick(final View view) {
        if (this.d != null) {
            this.d.a(this.a);
        }
    }
    
    public void onConfigurationChanged(final Configuration configuration) {
        if (Build$VERSION.SDK_INT >= 8) {
            super.onConfigurationChanged(configuration);
        }
        this.g = this.getContext().getResources().getBoolean(android.support.v7.b.a.b.abc_config_allowActionMenuItemTextWithIcon);
        this.e();
    }
    
    public boolean onLongClick(final View view) {
        boolean b;
        if (this.b()) {
            b = false;
        }
        else {
            final int[] array = new int[2];
            final Rect rect = new Rect();
            this.getLocationOnScreen(array);
            this.getWindowVisibleDisplayFrame(rect);
            final Context context = this.getContext();
            final int width = this.getWidth();
            final int height = this.getHeight();
            final int n = array[1];
            final int n2 = height / 2;
            int n3 = array[0] + width / 2;
            if (android.support.v4.view.u.e(view) == 0) {
                n3 = context.getResources().getDisplayMetrics().widthPixels - n3;
            }
            final Toast text = Toast.makeText(context, this.a.getTitle(), 0);
            if (n + n2 < rect.height()) {
                text.setGravity(8388661, n3, height);
            }
            else {
                text.setGravity(81, 0, height);
            }
            text.show();
            b = true;
        }
        return b;
    }
    
    protected void onMeasure(int a, final int n) {
        final boolean b = this.b();
        if (b && this.j >= 0) {
            super.setPadding(this.j, this.getPaddingTop(), this.getPaddingRight(), this.getPaddingBottom());
        }
        super.onMeasure(a, n);
        final int mode = View$MeasureSpec.getMode(a);
        a = View$MeasureSpec.getSize(a);
        final int measuredWidth = this.getMeasuredWidth();
        if (mode == Integer.MIN_VALUE) {
            a = Math.min(a, this.i);
        }
        else {
            a = this.i;
        }
        if (mode != 1073741824 && this.i > 0 && measuredWidth < a) {
            super.onMeasure(View$MeasureSpec.makeMeasureSpec(a, 1073741824), n);
        }
        if (!b && this.c != null) {
            super.setPadding((this.getMeasuredWidth() - this.c.getBounds().width()) / 2, this.getPaddingTop(), this.getPaddingRight(), this.getPaddingBottom());
        }
    }
    
    public boolean onTouchEvent(final MotionEvent motionEvent) {
        return (this.a.hasSubMenu() && this.e != null && this.e.onTouch((View)this, motionEvent)) || super.onTouchEvent(motionEvent);
    }
    
    public void setCheckable(final boolean b) {
    }
    
    public void setChecked(final boolean b) {
    }
    
    public void setExpandedFormat(final boolean h) {
        if (this.h != h) {
            this.h = h;
            if (this.a != null) {
                this.a.b.d();
            }
        }
    }
    
    public void setIcon(final Drawable c) {
        this.c = c;
        if (c != null) {
            final int intrinsicWidth = c.getIntrinsicWidth();
            int intrinsicHeight;
            final int n = intrinsicHeight = c.getIntrinsicHeight();
            int k;
            if ((k = intrinsicWidth) > this.k) {
                final float n2 = this.k / (float)intrinsicWidth;
                k = this.k;
                intrinsicHeight = (int)(n * n2);
            }
            int i = intrinsicHeight;
            int n3 = k;
            if (intrinsicHeight > this.k) {
                final float n4 = this.k / (float)intrinsicHeight;
                i = this.k;
                n3 = (int)(k * n4);
            }
            c.setBounds(0, 0, n3, i);
        }
        this.setCompoundDrawables(c, (Drawable)null, (Drawable)null, (Drawable)null);
        this.e();
    }
    
    public void setItemInvoker(final android.support.v7.internal.view.menu.e.b d) {
        this.d = d;
    }
    
    public void setPadding(final int j, final int n, final int n2, final int n3) {
        super.setPadding(this.j = j, n, n2, n3);
    }
    
    public void setPopupCallback(final b f) {
        this.f = f;
    }
    
    public void setTitle(final CharSequence b) {
        this.setContentDescription(this.b = b);
        this.e();
    }
    
    private final class a extends b.b
    {
        public a() {
            super((View)ActionMenuItemView.this);
        }
        
        @Override
        public final b a() {
            b a;
            if (ActionMenuItemView.this.f != null) {
                a = ActionMenuItemView.this.f.a();
            }
            else {
                a = null;
            }
            return a;
        }
        
        protected final boolean b() {
            boolean b2;
            final boolean b = b2 = false;
            if (ActionMenuItemView.this.d != null) {
                b2 = b;
                if (ActionMenuItemView.this.d.a(ActionMenuItemView.this.a)) {
                    final b a = this.a();
                    b2 = b;
                    if (a != null) {
                        b2 = b;
                        if (a.b.isShowing()) {
                            b2 = true;
                        }
                    }
                }
            }
            return b2;
        }
        
        protected final boolean c() {
            final b a = this.a();
            boolean b;
            if (a != null) {
                a.a();
                b = true;
            }
            else {
                b = false;
            }
            return b;
        }
    }
    
    public abstract static class b
    {
        public abstract android.support.v7.widget.b a();
    }
}
