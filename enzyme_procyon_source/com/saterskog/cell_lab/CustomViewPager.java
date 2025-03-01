// 
// Decompiled by Procyon v0.5.36
// 

package com.saterskog.cell_lab;

import android.view.MotionEvent;
import android.util.AttributeSet;
import android.content.Context;
import android.support.v4.view.ViewPager;

public class CustomViewPager extends ViewPager
{
    private boolean a;
    
    public CustomViewPager(final Context context, final AttributeSet set) {
        super(context, set);
        this.a = false;
    }
    
    @Override
    public boolean onInterceptTouchEvent(final MotionEvent motionEvent) {
        return this.a && super.onInterceptTouchEvent(motionEvent);
    }
    
    @Override
    public boolean onTouchEvent(final MotionEvent motionEvent) {
        return this.a && super.onTouchEvent(motionEvent);
    }
}
