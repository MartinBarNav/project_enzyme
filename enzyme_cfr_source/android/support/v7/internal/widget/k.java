/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.graphics.Canvas
 *  android.graphics.Rect
 *  android.graphics.drawable.Drawable
 *  android.view.View
 *  android.view.View$MeasureSpec
 *  android.view.ViewGroup
 *  android.view.ViewGroup$LayoutParams
 *  android.widget.AbsListView
 *  android.widget.ListAdapter
 *  android.widget.ListView
 */
package android.support.v7.internal.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.support.v7.internal.widget.i;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.ListAdapter;
import android.widget.ListView;
import java.lang.reflect.Field;

public class k
extends ListView {
    private static final int[] g = new int[]{0};
    protected final Rect a = new Rect();
    protected int b = 0;
    protected int c = 0;
    protected int d = 0;
    protected int e = 0;
    protected Field f;
    private a h;

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public k(Context context, int n2) {
        super(context, null, n2);
        try {
            this.f = AbsListView.class.getDeclaredField("mIsChildViewEnabled");
            this.f.setAccessible(true);
            return;
        }
        catch (NoSuchFieldException noSuchFieldException) {
            noSuchFieldException.printStackTrace();
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    public final int a(int n2, int n3) {
        int n4 = this.getListPaddingTop();
        int n5 = this.getListPaddingBottom();
        this.getListPaddingLeft();
        this.getListPaddingRight();
        int n6 = this.getDividerHeight();
        Drawable drawable = this.getDivider();
        ListAdapter listAdapter = this.getAdapter();
        if (listAdapter == null) {
            return n4 + n5;
        }
        n5 += n4;
        if (n6 <= 0 || drawable == null) {
            n6 = 0;
        }
        int n7 = listAdapter.getCount();
        n4 = 0;
        int n8 = 0;
        drawable = null;
        while (n4 < n7) {
            ViewGroup.LayoutParams layoutParams;
            int n9 = listAdapter.getItemViewType(n4);
            if (n9 != n8) {
                n8 = n9;
                drawable = null;
            }
            n9 = (layoutParams = (drawable = listAdapter.getView(n4, (View)drawable, (ViewGroup)this)).getLayoutParams()) != null && layoutParams.height > 0 ? View.MeasureSpec.makeMeasureSpec((int)layoutParams.height, (int)0x40000000) : View.MeasureSpec.makeMeasureSpec((int)0, (int)0);
            drawable.measure(n2, n9);
            if (n4 > 0) {
                n5 += n6;
            }
            n9 = drawable.getMeasuredHeight() + n5;
            n5 = n3;
            if (n9 >= n3) return n5;
            ++n4;
            n5 = n9;
        }
        return n5;
    }

    public boolean a() {
        return false;
    }

    protected void dispatchDraw(Canvas canvas) {
        if (!this.a.isEmpty()) {
            Drawable drawable = this.getSelector();
            drawable.setBounds(this.a);
            drawable.draw(canvas);
        }
        super.dispatchDraw(canvas);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    protected void drawableStateChanged() {
        boolean bl = true;
        super.drawableStateChanged();
        this.h.a = true;
        Drawable drawable = this.getSelector();
        if (drawable == null) return;
        if (!this.a()) return;
        if (!this.isPressed()) return;
        if (!bl) return;
        drawable.setState(this.getDrawableState());
    }

    public void setSelector(Drawable drawable) {
        this.h = new a(drawable);
        super.setSelector((Drawable)this.h);
        Rect rect = new Rect();
        drawable.getPadding(rect);
        this.b = rect.left;
        this.c = rect.top;
        this.d = rect.right;
        this.e = rect.bottom;
    }

    protected void setSelectorEnabled(boolean bl) {
        this.h.a = bl;
    }

    private static final class a
    extends i {
        boolean a = true;

        public a(Drawable drawable) {
            super(drawable);
        }

        @Override
        public final void draw(Canvas canvas) {
            if (this.a) {
                super.draw(canvas);
            }
        }

        @Override
        public final void setHotspot(float f2, float f3) {
            if (this.a) {
                super.setHotspot(f2, f3);
            }
        }

        @Override
        public final void setHotspotBounds(int n2, int n3, int n4, int n5) {
            if (this.a) {
                super.setHotspotBounds(n2, n3, n4, n5);
            }
        }

        /*
         * Enabled force condition propagation
         * Lifted jumps to return sites
         */
        @Override
        public final boolean setState(int[] arrn) {
            if (!this.a) return false;
            return super.setState(arrn);
        }

        /*
         * Enabled force condition propagation
         * Lifted jumps to return sites
         */
        @Override
        public final boolean setVisible(boolean bl, boolean bl2) {
            if (!this.a) return false;
            return super.setVisible(bl, bl2);
        }
    }
}

