/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.util.AttributeSet
 *  android.view.MotionEvent
 */
package com.saterskog.cell_lab;

import android.content.Context;
import android.support.v4.view.ViewPager;
import android.util.AttributeSet;
import android.view.MotionEvent;

public class CustomViewPager
extends ViewPager {
    private boolean a = false;

    public CustomViewPager(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (!this.a) return false;
        return super.onInterceptTouchEvent(motionEvent);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.a) return false;
        return super.onTouchEvent(motionEvent);
    }
}

