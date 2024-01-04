// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.common;

import android.content.Intent;

public class d extends Exception
{
    private final Intent a;
    
    public d(final String message, final Intent a) {
        super(message);
        this.a = a;
    }
}
