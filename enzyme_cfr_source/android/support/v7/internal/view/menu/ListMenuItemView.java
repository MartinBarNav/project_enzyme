/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.graphics.drawable.Drawable
 *  android.util.AttributeSet
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 *  android.view.ViewGroup$LayoutParams
 *  android.widget.CheckBox
 *  android.widget.ImageView
 *  android.widget.LinearLayout
 *  android.widget.LinearLayout$LayoutParams
 *  android.widget.RadioButton
 *  android.widget.TextView
 */
package android.support.v7.internal.view.menu;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.support.v7.b.a;
import android.support.v7.internal.view.menu.f;
import android.support.v7.internal.view.menu.k;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.TextView;

public class ListMenuItemView
extends LinearLayout
implements k.a {
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

    public ListMenuItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ListMenuItemView(Context context, AttributeSet attributeSet, int n2) {
        super(context, attributeSet);
        this.l = context;
        attributeSet = context.obtainStyledAttributes(attributeSet, a.i.MenuView, n2, 0);
        this.g = attributeSet.getDrawable(a.i.MenuView_android_itemBackground);
        this.h = attributeSet.getResourceId(a.i.MenuView_android_itemTextAppearance, -1);
        this.j = attributeSet.getBoolean(a.i.MenuView_preserveIconSpacing, false);
        this.i = context;
        attributeSet.recycle();
    }

    private void b() {
        this.c = (RadioButton)this.getInflater().inflate(a.g.abc_list_menu_item_radio, (ViewGroup)this, false);
        this.addView((View)this.c);
    }

    private void c() {
        this.e = (CheckBox)this.getInflater().inflate(a.g.abc_list_menu_item_checkbox, (ViewGroup)this, false);
        this.addView((View)this.e);
    }

    private LayoutInflater getInflater() {
        if (this.m == null) {
            this.m = LayoutInflater.from((Context)this.l);
        }
        return this.m;
    }

    /*
     * Enabled aggressive block sorting
     */
    private void setShortcut$25d965e(boolean bl) {
        int n2 = bl && this.a.d() ? 0 : 8;
        if (n2 == 0) {
            CharSequence charSequence;
            TextView textView = this.f;
            char c2 = this.a.c();
            if (c2 == '\u0000') {
                charSequence = "";
            } else {
                charSequence = new StringBuilder(android.support.v7.internal.view.menu.f.f);
                switch (c2) {
                    default: {
                        ((StringBuilder)charSequence).append(c2);
                        break;
                    }
                    case '\n': {
                        ((StringBuilder)charSequence).append(android.support.v7.internal.view.menu.f.g);
                        break;
                    }
                    case '\b': {
                        ((StringBuilder)charSequence).append(android.support.v7.internal.view.menu.f.h);
                        break;
                    }
                    case ' ': {
                        ((StringBuilder)charSequence).append(android.support.v7.internal.view.menu.f.i);
                    }
                }
                charSequence = ((StringBuilder)charSequence).toString();
            }
            textView.setText(charSequence);
        }
        if (this.f.getVisibility() != n2) {
            this.f.setVisibility(n2);
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public final void a(f f2) {
        int n2 = 0;
        this.a = f2;
        this.k = 0;
        int n3 = f2.isVisible() ? 0 : 8;
        this.setVisibility(n3);
        this.setTitle(f2.a(this));
        this.setCheckable(f2.isCheckable());
        boolean bl = f2.d();
        f2.c();
        n3 = bl && this.a.d() ? n2 : 8;
        if (n3 == 0) {
            CharSequence charSequence;
            TextView textView = this.f;
            char c2 = this.a.c();
            if (c2 == '\u0000') {
                charSequence = "";
            } else {
                charSequence = new StringBuilder(android.support.v7.internal.view.menu.f.f);
                switch (c2) {
                    default: {
                        ((StringBuilder)charSequence).append(c2);
                        break;
                    }
                    case '\n': {
                        ((StringBuilder)charSequence).append(android.support.v7.internal.view.menu.f.g);
                        break;
                    }
                    case '\b': {
                        ((StringBuilder)charSequence).append(android.support.v7.internal.view.menu.f.h);
                        break;
                    }
                    case ' ': {
                        ((StringBuilder)charSequence).append(android.support.v7.internal.view.menu.f.i);
                    }
                }
                charSequence = ((StringBuilder)charSequence).toString();
            }
            textView.setText(charSequence);
        }
        if (this.f.getVisibility() != n3) {
            this.f.setVisibility(n3);
        }
        this.setIcon(f2.getIcon());
        this.setEnabled(f2.isEnabled());
    }

    @Override
    public final boolean a() {
        return false;
    }

    @Override
    public f getItemData() {
        return this.a;
    }

    protected void onFinishInflate() {
        super.onFinishInflate();
        this.setBackgroundDrawable(this.g);
        this.d = (TextView)this.findViewById(a.e.title);
        if (this.h != -1) {
            this.d.setTextAppearance(this.i, this.h);
        }
        this.f = (TextView)this.findViewById(a.e.shortcut);
    }

    protected void onMeasure(int n2, int n3) {
        if (this.b != null && this.j) {
            ViewGroup.LayoutParams layoutParams = this.getLayoutParams();
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams)this.b.getLayoutParams();
            if (layoutParams.height > 0 && layoutParams2.width <= 0) {
                layoutParams2.width = layoutParams.height;
            }
        }
        super.onMeasure(n2, n3);
    }

    /*
     * Enabled aggressive block sorting
     */
    public void setCheckable(boolean bl) {
        CheckBox checkBox;
        RadioButton radioButton;
        if (!bl && this.c == null && this.e == null) {
            return;
        }
        if (this.a.e()) {
            if (this.c == null) {
                this.b();
            }
            radioButton = this.c;
            checkBox = this.e;
        } else {
            if (this.e == null) {
                this.c();
            }
            radioButton = this.e;
            checkBox = this.c;
        }
        if (bl) {
            radioButton.setChecked(this.a.isChecked());
            int n2 = bl ? 0 : 8;
            if (radioButton.getVisibility() != n2) {
                radioButton.setVisibility(n2);
            }
            if (checkBox == null) return;
            if (checkBox.getVisibility() == 8) return;
            checkBox.setVisibility(8);
            return;
        }
        if (this.e != null) {
            this.e.setVisibility(8);
        }
        if (this.c == null) return;
        this.c.setVisibility(8);
    }

    /*
     * Enabled aggressive block sorting
     */
    public void setChecked(boolean bl) {
        RadioButton radioButton;
        if (this.a.e()) {
            if (this.c == null) {
                this.b();
            }
            radioButton = this.c;
        } else {
            if (this.e == null) {
                this.c();
            }
            radioButton = this.e;
        }
        radioButton.setChecked(bl);
    }

    public void setForceShowIcon(boolean bl) {
        this.n = bl;
        this.j = bl;
    }

    /*
     * Enabled aggressive block sorting
     */
    public void setIcon(Drawable drawable) {
        boolean bl = this.a.b.g || this.n;
        if (!bl && !this.j) {
            return;
        }
        if (this.b == null && drawable == null) {
            if (!this.j) return;
        }
        if (this.b == null) {
            this.b = (ImageView)this.getInflater().inflate(a.g.abc_list_menu_item_icon, (ViewGroup)this, false);
            this.addView((View)this.b, 0);
        }
        if (drawable == null && !this.j) {
            this.b.setVisibility(8);
            return;
        }
        ImageView imageView = this.b;
        if (!bl) {
            drawable = null;
        }
        imageView.setImageDrawable(drawable);
        if (this.b.getVisibility() == 0) return;
        this.b.setVisibility(0);
    }

    /*
     * Enabled aggressive block sorting
     */
    public void setTitle(CharSequence charSequence) {
        if (charSequence != null) {
            this.d.setText(charSequence);
            if (this.d.getVisibility() == 0) return;
            this.d.setVisibility(0);
            return;
        }
        if (this.d.getVisibility() == 8) return;
        this.d.setVisibility(8);
    }
}

