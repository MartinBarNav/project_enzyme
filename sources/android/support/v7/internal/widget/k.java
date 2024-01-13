package android.support.v7.internal.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.ListAdapter;
import android.widget.ListView;
import java.lang.reflect.Field;

public class k extends ListView {
    private static final int[] g = {0};
    protected final Rect a = new Rect();
    protected int b = 0;
    protected int c = 0;
    protected int d = 0;
    protected int e = 0;
    protected Field f;
    private a h;

    public k(Context context, int i) {
        super(context, (AttributeSet) null, i);
        try {
            this.f = AbsListView.class.getDeclaredField("mIsChildViewEnabled");
            this.f.setAccessible(true);
        } catch (NoSuchFieldException e2) {
            e2.printStackTrace();
        }
    }

    public void setSelector(Drawable drawable) {
        this.h = new a(drawable);
        super.setSelector(this.h);
        Rect rect = new Rect();
        drawable.getPadding(rect);
        this.b = rect.left;
        this.c = rect.top;
        this.d = rect.right;
        this.e = rect.bottom;
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        boolean z = true;
        super.drawableStateChanged();
        this.h.a = true;
        Drawable selector = getSelector();
        if (selector != null) {
            if (!a() || !isPressed()) {
                z = false;
            }
            if (z) {
                selector.setState(getDrawableState());
            }
        }
    }

    public boolean a() {
        return false;
    }

    public final int a(int i, int i2) {
        View view;
        int makeMeasureSpec;
        int i3;
        int listPaddingTop = getListPaddingTop();
        int listPaddingBottom = getListPaddingBottom();
        getListPaddingLeft();
        getListPaddingRight();
        int dividerHeight = getDividerHeight();
        Drawable divider = getDivider();
        ListAdapter adapter = getAdapter();
        if (adapter == null) {
            return listPaddingTop + listPaddingBottom;
        }
        int i4 = listPaddingBottom + listPaddingTop;
        if (dividerHeight <= 0 || divider == null) {
            dividerHeight = 0;
        }
        int count = adapter.getCount();
        int i5 = 0;
        View view2 = null;
        for (int i6 = 0; i6 < count; i6++) {
            int itemViewType = adapter.getItemViewType(i6);
            if (itemViewType != i5) {
                i5 = itemViewType;
                view = null;
            } else {
                view = view2;
            }
            view2 = adapter.getView(i6, view, this);
            ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
            if (layoutParams == null || layoutParams.height <= 0) {
                makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
            } else {
                makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(layoutParams.height, 1073741824);
            }
            view2.measure(i, makeMeasureSpec);
            if (i6 > 0) {
                i3 = i4 + dividerHeight;
            } else {
                i3 = i4;
            }
            i4 = view2.getMeasuredHeight() + i3;
            if (i4 >= i2) {
                return i2;
            }
        }
        return i4;
    }

    /* access modifiers changed from: protected */
    public void setSelectorEnabled(boolean z) {
        this.h.a = z;
    }

    private static class a extends i {
        boolean a = true;

        public a(Drawable drawable) {
            super(drawable);
        }

        public final boolean setState(int[] iArr) {
            if (this.a) {
                return super.setState(iArr);
            }
            return false;
        }

        public final void draw(Canvas canvas) {
            if (this.a) {
                super.draw(canvas);
            }
        }

        public final void setHotspot(float f, float f2) {
            if (this.a) {
                super.setHotspot(f, f2);
            }
        }

        public final void setHotspotBounds(int i, int i2, int i3, int i4) {
            if (this.a) {
                super.setHotspotBounds(i, i2, i3, i4);
            }
        }

        public final boolean setVisible(boolean z, boolean z2) {
            if (this.a) {
                return super.setVisible(z, z2);
            }
            return false;
        }
    }

    /* access modifiers changed from: protected */
    public void dispatchDraw(Canvas canvas) {
        if (!this.a.isEmpty()) {
            Drawable selector = getSelector();
            selector.setBounds(this.a);
            selector.draw(canvas);
        }
        super.dispatchDraw(canvas);
    }
}
