/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  android.content.res.ColorStateList
 *  android.graphics.Canvas
 *  android.graphics.ColorFilter
 *  android.graphics.PorterDuff$Mode
 *  android.graphics.Rect
 *  android.graphics.Region
 *  android.graphics.drawable.Drawable
 *  android.graphics.drawable.Drawable$Callback
 */
package android.support.v7.internal.widget;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.support.v4.a.a.a;

class i
extends Drawable
implements Drawable.Callback {
    private final Drawable a;

    public i(Drawable drawable) {
        this.a = drawable;
        this.a.setCallback((Drawable.Callback)this);
    }

    public void draw(Canvas canvas) {
        this.a.draw(canvas);
    }

    public int getChangingConfigurations() {
        return this.a.getChangingConfigurations();
    }

    public Drawable getCurrent() {
        return this.a.getCurrent();
    }

    public int getIntrinsicHeight() {
        return this.a.getIntrinsicHeight();
    }

    public int getIntrinsicWidth() {
        return this.a.getIntrinsicWidth();
    }

    public int getMinimumHeight() {
        return this.a.getMinimumHeight();
    }

    public int getMinimumWidth() {
        return this.a.getMinimumWidth();
    }

    public int getOpacity() {
        return this.a.getOpacity();
    }

    public boolean getPadding(Rect rect) {
        return this.a.getPadding(rect);
    }

    public int[] getState() {
        return this.a.getState();
    }

    public Region getTransparentRegion() {
        return this.a.getTransparentRegion();
    }

    public void invalidateDrawable(Drawable drawable) {
        this.invalidateSelf();
    }

    public boolean isAutoMirrored() {
        return android.support.v4.a.a.a.b(this.a);
    }

    public boolean isStateful() {
        return this.a.isStateful();
    }

    public void jumpToCurrentState() {
        android.support.v4.a.a.a.a(this.a);
    }

    protected boolean onLevelChange(int n2) {
        return this.a.setLevel(n2);
    }

    public void scheduleDrawable(Drawable drawable, Runnable runnable, long l2) {
        this.scheduleSelf(runnable, l2);
    }

    public void setAlpha(int n2) {
        this.a.setAlpha(n2);
    }

    public void setAutoMirrored(boolean bl) {
        android.support.v4.a.a.a.a(this.a, bl);
    }

    public void setBounds(int n2, int n3, int n4, int n5) {
        super.setBounds(n2, n3, n4, n5);
        this.a.setBounds(n2, n3, n4, n5);
    }

    public void setChangingConfigurations(int n2) {
        this.a.setChangingConfigurations(n2);
    }

    public void setColorFilter(ColorFilter colorFilter) {
        this.a.setColorFilter(colorFilter);
    }

    public void setDither(boolean bl) {
        this.a.setDither(bl);
    }

    public void setFilterBitmap(boolean bl) {
        this.a.setFilterBitmap(bl);
    }

    public void setHotspot(float f2, float f3) {
        android.support.v4.a.a.a.a(this.a, f2, f3);
    }

    public void setHotspotBounds(int n2, int n3, int n4, int n5) {
        android.support.v4.a.a.a.a(this.a, n2, n3, n4, n5);
    }

    public boolean setState(int[] arrn) {
        return this.a.setState(arrn);
    }

    public void setTint(int n2) {
        android.support.v4.a.a.a.a(this.a, n2);
    }

    public void setTintList(ColorStateList colorStateList) {
        android.support.v4.a.a.a.a(this.a, colorStateList);
    }

    public void setTintMode(PorterDuff.Mode mode) {
        android.support.v4.a.a.a.a(this.a, mode);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public boolean setVisible(boolean bl, boolean bl2) {
        if (super.setVisible(bl, bl2)) return true;
        if (!this.a.setVisible(bl, bl2)) return false;
        return true;
    }

    public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        this.unscheduleSelf(runnable);
    }
}

