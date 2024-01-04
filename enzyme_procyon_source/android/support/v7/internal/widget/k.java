// 
// Decompiled by Procyon v0.5.36
// 

package android.support.v7.internal.widget;

import android.graphics.Canvas;
import android.view.ViewGroup$LayoutParams;
import android.view.View;
import android.widget.ListAdapter;
import android.graphics.drawable.Drawable;
import android.view.View$MeasureSpec;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.util.AttributeSet;
import android.content.Context;
import java.lang.reflect.Field;
import android.graphics.Rect;
import android.widget.ListView;

public class k extends ListView
{
    private static final int[] g;
    protected final Rect a;
    protected int b;
    protected int c;
    protected int d;
    protected int e;
    protected Field f;
    private a h;
    
    static {
        g = new int[] { 0 };
    }
    
    public k(final Context context, final int n) {
        super(context, (AttributeSet)null, n);
        this.a = new Rect();
        this.b = 0;
        this.c = 0;
        this.d = 0;
        this.e = 0;
        try {
            (this.f = AbsListView.class.getDeclaredField("mIsChildViewEnabled")).setAccessible(true);
        }
        catch (NoSuchFieldException ex) {
            ex.printStackTrace();
        }
    }
    
    public final int a(final int n, final int n2) {
        final int listPaddingTop = this.getListPaddingTop();
        final int listPaddingBottom = this.getListPaddingBottom();
        this.getListPaddingLeft();
        this.getListPaddingRight();
        int dividerHeight = this.getDividerHeight();
        final Drawable divider = this.getDivider();
        final ListAdapter adapter = this.getAdapter();
        int n3;
        if (adapter == null) {
            n3 = listPaddingTop + listPaddingBottom;
        }
        else {
            n3 = listPaddingBottom + listPaddingTop;
            if (dividerHeight <= 0 || divider == null) {
                dividerHeight = 0;
            }
            final int count = adapter.getCount();
            int i = 0;
            int n4 = 0;
            View view = null;
            while (i < count) {
                final int itemViewType = adapter.getItemViewType(i);
                if (itemViewType != n4) {
                    n4 = itemViewType;
                    view = null;
                }
                view = adapter.getView(i, view, (ViewGroup)this);
                final ViewGroup$LayoutParams layoutParams = view.getLayoutParams();
                int n5;
                if (layoutParams != null && layoutParams.height > 0) {
                    n5 = View$MeasureSpec.makeMeasureSpec(layoutParams.height, 1073741824);
                }
                else {
                    n5 = View$MeasureSpec.makeMeasureSpec(0, 0);
                }
                view.measure(n, n5);
                if (i > 0) {
                    n3 += dividerHeight;
                }
                final int n6 = view.getMeasuredHeight() + n3;
                n3 = n2;
                if (n6 >= n2) {
                    break;
                }
                ++i;
                n3 = n6;
            }
        }
        return n3;
    }
    
    public boolean a() {
        return false;
    }
    
    protected void dispatchDraw(final Canvas canvas) {
        if (!this.a.isEmpty()) {
            final Drawable selector = this.getSelector();
            selector.setBounds(this.a);
            selector.draw(canvas);
        }
        super.dispatchDraw(canvas);
    }
    
    protected void drawableStateChanged() {
        int n = 1;
        super.drawableStateChanged();
        this.h.a = true;
        final Drawable selector = this.getSelector();
        if (selector != null) {
            if (!this.a() || !this.isPressed()) {
                n = 0;
            }
            if (n != 0) {
                selector.setState(this.getDrawableState());
            }
        }
    }
    
    public void setSelector(final Drawable drawable) {
        super.setSelector((Drawable)(this.h = new a(drawable)));
        final Rect rect = new Rect();
        drawable.getPadding(rect);
        this.b = rect.left;
        this.c = rect.top;
        this.d = rect.right;
        this.e = rect.bottom;
    }
    
    protected void setSelectorEnabled(final boolean a) {
        this.h.a = a;
    }
    
    private static final class a extends i
    {
        boolean a;
        
        public a(final Drawable drawable) {
            super(drawable);
            this.a = true;
        }
        
        @Override
        public final void draw(final Canvas canvas) {
            if (this.a) {
                super.draw(canvas);
            }
        }
        
        @Override
        public final void setHotspot(final float n, final float n2) {
            if (this.a) {
                super.setHotspot(n, n2);
            }
        }
        
        @Override
        public final void setHotspotBounds(final int n, final int n2, final int n3, final int n4) {
            if (this.a) {
                super.setHotspotBounds(n, n2, n3, n4);
            }
        }
        
        @Override
        public final boolean setState(final int[] state) {
            return this.a && super.setState(state);
        }
        
        @Override
        public final boolean setVisible(final boolean b, final boolean b2) {
            return this.a && super.setVisible(b, b2);
        }
    }
}
