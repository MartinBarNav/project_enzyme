// 
// Decompiled by Procyon v0.5.36
// 

package android.support.v7.internal.view.menu;

import android.widget.CompoundButton;
import android.view.ViewGroup$LayoutParams;
import android.widget.LinearLayout$LayoutParams;
import android.view.View;
import android.view.ViewGroup;
import android.content.res.TypedArray;
import android.support.v7.b.a;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.widget.CheckBox;
import android.widget.TextView;
import android.widget.RadioButton;
import android.widget.ImageView;
import android.widget.LinearLayout;

public class ListMenuItemView extends LinearLayout implements a
{
    private f a;
    private ImageView b;
    private RadioButton c;
    private TextView d;
    private CheckBox e;
    private TextView f;
    private Drawable g;
    private int h;
    private Context i;
    private boolean j;
    private int k;
    private Context l;
    private LayoutInflater m;
    private boolean n;
    
    public ListMenuItemView(final Context context, final AttributeSet set) {
        this(context, set, 0);
    }
    
    public ListMenuItemView(final Context context, final AttributeSet set, final int n) {
        super(context, set);
        this.l = context;
        final TypedArray obtainStyledAttributes = context.obtainStyledAttributes(set, android.support.v7.b.a.i.MenuView, n, 0);
        this.g = obtainStyledAttributes.getDrawable(android.support.v7.b.a.i.MenuView_android_itemBackground);
        this.h = obtainStyledAttributes.getResourceId(android.support.v7.b.a.i.MenuView_android_itemTextAppearance, -1);
        this.j = obtainStyledAttributes.getBoolean(android.support.v7.b.a.i.MenuView_preserveIconSpacing, false);
        this.i = context;
        obtainStyledAttributes.recycle();
    }
    
    private void b() {
        this.addView((View)(this.c = (RadioButton)this.getInflater().inflate(android.support.v7.b.a.g.abc_list_menu_item_radio, (ViewGroup)this, false)));
    }
    
    private void c() {
        this.addView((View)(this.e = (CheckBox)this.getInflater().inflate(android.support.v7.b.a.g.abc_list_menu_item_checkbox, (ViewGroup)this, false)));
    }
    
    private LayoutInflater getInflater() {
        if (this.m == null) {
            this.m = LayoutInflater.from(this.l);
        }
        return this.m;
    }
    
    private void setShortcut$25d965e(final boolean b) {
        int visibility;
        if (b && this.a.d()) {
            visibility = 0;
        }
        else {
            visibility = 8;
        }
        if (visibility == 0) {
            final TextView f = this.f;
            final char c = this.a.c();
            String string;
            if (c == '\0') {
                string = "";
            }
            else {
                final StringBuilder sb = new StringBuilder(android.support.v7.internal.view.menu.f.f);
                switch (c) {
                    default: {
                        sb.append(c);
                        break;
                    }
                    case 10: {
                        sb.append(android.support.v7.internal.view.menu.f.g);
                        break;
                    }
                    case 8: {
                        sb.append(android.support.v7.internal.view.menu.f.h);
                        break;
                    }
                    case 32: {
                        sb.append(android.support.v7.internal.view.menu.f.i);
                        break;
                    }
                }
                string = sb.toString();
            }
            f.setText((CharSequence)string);
        }
        if (this.f.getVisibility() != visibility) {
            this.f.setVisibility(visibility);
        }
    }
    
    public final void a(final f a) {
        final int n = 0;
        this.a = a;
        this.k = 0;
        int visibility;
        if (a.isVisible()) {
            visibility = 0;
        }
        else {
            visibility = 8;
        }
        this.setVisibility(visibility);
        this.setTitle(a.a(this));
        this.setCheckable(a.isCheckable());
        final boolean d = a.d();
        a.c();
        int visibility2;
        if (d && this.a.d()) {
            visibility2 = n;
        }
        else {
            visibility2 = 8;
        }
        if (visibility2 == 0) {
            final TextView f = this.f;
            final char c = this.a.c();
            String string;
            if (c == '\0') {
                string = "";
            }
            else {
                final StringBuilder sb = new StringBuilder(android.support.v7.internal.view.menu.f.f);
                switch (c) {
                    default: {
                        sb.append(c);
                        break;
                    }
                    case 10: {
                        sb.append(android.support.v7.internal.view.menu.f.g);
                        break;
                    }
                    case 8: {
                        sb.append(android.support.v7.internal.view.menu.f.h);
                        break;
                    }
                    case 32: {
                        sb.append(android.support.v7.internal.view.menu.f.i);
                        break;
                    }
                }
                string = sb.toString();
            }
            f.setText((CharSequence)string);
        }
        if (this.f.getVisibility() != visibility2) {
            this.f.setVisibility(visibility2);
        }
        this.setIcon(a.getIcon());
        this.setEnabled(a.isEnabled());
    }
    
    public final boolean a() {
        return false;
    }
    
    public f getItemData() {
        return this.a;
    }
    
    protected void onFinishInflate() {
        super.onFinishInflate();
        this.setBackgroundDrawable(this.g);
        this.d = (TextView)this.findViewById(android.support.v7.b.a.e.title);
        if (this.h != -1) {
            this.d.setTextAppearance(this.i, this.h);
        }
        this.f = (TextView)this.findViewById(android.support.v7.b.a.e.shortcut);
    }
    
    protected void onMeasure(final int n, final int n2) {
        if (this.b != null && this.j) {
            final ViewGroup$LayoutParams layoutParams = this.getLayoutParams();
            final LinearLayout$LayoutParams linearLayout$LayoutParams = (LinearLayout$LayoutParams)this.b.getLayoutParams();
            if (layoutParams.height > 0 && linearLayout$LayoutParams.width <= 0) {
                linearLayout$LayoutParams.width = layoutParams.height;
            }
        }
        super.onMeasure(n, n2);
    }
    
    public void setCheckable(final boolean b) {
        if (b || this.c != null || this.e != null) {
            Object o;
            Object o2;
            if (this.a.e()) {
                if (this.c == null) {
                    this.b();
                }
                o = this.c;
                o2 = this.e;
            }
            else {
                if (this.e == null) {
                    this.c();
                }
                o = this.e;
                o2 = this.c;
            }
            if (b) {
                ((CompoundButton)o).setChecked(this.a.isChecked());
                int visibility;
                if (b) {
                    visibility = 0;
                }
                else {
                    visibility = 8;
                }
                if (((CompoundButton)o).getVisibility() != visibility) {
                    ((CompoundButton)o).setVisibility(visibility);
                }
                if (o2 != null && ((CompoundButton)o2).getVisibility() != 8) {
                    ((CompoundButton)o2).setVisibility(8);
                }
            }
            else {
                if (this.e != null) {
                    this.e.setVisibility(8);
                }
                if (this.c != null) {
                    this.c.setVisibility(8);
                }
            }
        }
    }
    
    public void setChecked(final boolean checked) {
        Object o;
        if (this.a.e()) {
            if (this.c == null) {
                this.b();
            }
            o = this.c;
        }
        else {
            if (this.e == null) {
                this.c();
            }
            o = this.e;
        }
        ((CompoundButton)o).setChecked(checked);
    }
    
    public void setForceShowIcon(final boolean b) {
        this.n = b;
        this.j = b;
    }
    
    public void setIcon(Drawable imageDrawable) {
        boolean b;
        if (this.a.b.g || this.n) {
            b = true;
        }
        else {
            b = false;
        }
        if ((b || this.j) && (this.b != null || imageDrawable != null || this.j)) {
            if (this.b == null) {
                this.addView((View)(this.b = (ImageView)this.getInflater().inflate(android.support.v7.b.a.g.abc_list_menu_item_icon, (ViewGroup)this, false)), 0);
            }
            if (imageDrawable != null || this.j) {
                final ImageView b2 = this.b;
                if (!b) {
                    imageDrawable = null;
                }
                b2.setImageDrawable(imageDrawable);
                if (this.b.getVisibility() != 0) {
                    this.b.setVisibility(0);
                }
            }
            else {
                this.b.setVisibility(8);
            }
        }
    }
    
    public void setTitle(final CharSequence text) {
        if (text != null) {
            this.d.setText(text);
            if (this.d.getVisibility() != 0) {
                this.d.setVisibility(0);
            }
        }
        else if (this.d.getVisibility() != 8) {
            this.d.setVisibility(8);
        }
    }
}
